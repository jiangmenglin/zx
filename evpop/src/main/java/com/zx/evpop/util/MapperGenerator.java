package com.zx.evpop.util;

import java.sql.*;

/**
 * Created by jiangmenglin.
 *
 * @author jiangmenglin
 * description:
 * date: 2018/10/30 13:08
 */
public class MapperGenerator {
    Connection con = null;

    public void getCon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://192.168.8.188:3306/ccclubs_yun_sys","root","123456");
    }

    public String convertDatabaseCharsetType(String in, String type) {
        String dbUser;
        if (in != null) {
            if (type.equals("oracle")) {
                dbUser = in.toUpperCase();
            } else if (type.equals("postgresql")) {
                dbUser = "public";
            } else if (type.equals("mysql")) {
                dbUser = null;
            } else if (type.equals("mssqlserver")) {
                dbUser = null;
            } else if (type.equals("db2")) {
                dbUser = in.toUpperCase();
            } else {
                dbUser = in;
            }
        } else {
            dbUser = "public";
        }
        return dbUser;
    }

    public void getTables(String[] prefixs) throws SQLException, ClassNotFoundException {
        if (con == null) {
            getCon();
        }

        DatabaseMetaData metaData = con.getMetaData();
        ResultSet rs = metaData.getTables(null,
                convertDatabaseCharsetType("root", "mysql"), null,
                new String[]{"TABLE", "VIEW"});
        while (rs.next()) {
            StringBuilder sb = new StringBuilder("<table tableName=\"");
            if (rs.getString(4) != null
                    && (rs.getString(4).equalsIgnoreCase("TABLE") || rs
                    .getString(4).equalsIgnoreCase("VIEW"))) {
                String tableName = rs.getString(3).toLowerCase();
                sb.append(tableName).append("\"");
                if (prefixs.length > 0) {
                    for (String pre : prefixs) {
                        if (tableName.startsWith(pre)) {
                            tableName = tableName.replaceFirst(pre, "");
                        }
                    }
                }
                if (tableName.contains("_")) {
                    String[] list = tableName.split("_");
                    tableName = "";
                    for (String item : list) {
                        if (item.length() > 0) {
                            String str = item.substring(0, 1);
                            str = str.toUpperCase();
                            tableName += str + item.substring(1);
                        }
                    }
                }
                sb.append(" domainObjectName=\"").append(tableName).append("\"");
                sb.append(" enableCountByExample=\"true\" enableSelectByExample=\"true\" enableDeleteByExample=\"false\"></table>");
                System.out.print(sb.toString());
                System.out.println();


            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MapperGenerator m = new MapperGenerator();
        m.getTables(new String[] {"tb", "srv"});
    }
}
