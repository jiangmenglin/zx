package com.zx.evpop.util;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil
{
  public static List listMapToLowerCase(List list)
  {
    if (list == null) {
      return null;
    }
    for (int i = 0; i < list.size(); i++)
    {
      Object obj = list.get(i);
      if (HashMap.class.equals(obj.getClass()))
      {
        HashMap map = (HashMap)list.get(i);
        list.set(i, mapToLowerCase(map));
      }
      else if (LinkedHashMap.class.equals(obj.getClass()))
      {
        LinkedHashMap map = (LinkedHashMap)list.get(i);
        list.set(i, linkedHashMapToLowerCase(map));
      }
    }
    return list;
  }
  
  public static HashMap mapToLowerCase(HashMap inMap)
  {
    if (inMap == null) {
      return null;
    }
    HashMap resultMap = new HashMap();
    for (Iterator it = inMap.entrySet().iterator(); it.hasNext();)
    {
      Map.Entry e = (Map.Entry)it.next();
      String key = e.getKey().toString().toLowerCase();
      Object valueObj = e.getValue();
      resultMap.put(key, valueObj);
    }
    return resultMap;
  }

  public static LinkedHashMap linkedHashMapToLowerCase(LinkedHashMap inMap)
  {
    if (inMap == null) {
      return null;
    }
    LinkedHashMap resultMap = new LinkedHashMap();
    for (Iterator it = inMap.entrySet().iterator(); it.hasNext();)
    {
      Map.Entry e = (Map.Entry)it.next();
      String key = e.getKey().toString().toLowerCase();
      Object valueObj = e.getValue();
      resultMap.put(key, valueObj);
    }
    return resultMap;
  }
  
  public static String changeEncode(String str, String fromEncode, String toEncode)
    throws UnsupportedEncodingException
  {
    String returnStr = new String(str.getBytes(fromEncode), toEncode);
    return returnStr;
  }
  
  public static String changeEncodeToUtf8(String str)
    throws UnsupportedEncodingException
  {
    return changeEncode(str, "ISO-8859-1", "UTF-8");
  }
  
  public static List<String> changeToList(String str)
  {
    if (isEmpty(str)) {
      return null;
    }
    List<String> list = new ArrayList();
    int fromIndex = 0;
    int toIndex = 0;
    while ((toIndex = str.indexOf("},{", fromIndex)) > -1)
    {
      String s = str.substring(fromIndex, toIndex + 1);
      fromIndex = toIndex + 2;
      list.add(s);
    }
    String s = str.substring(fromIndex);
    if (!isEmpty(s)) {
      list.add(s);
    }
    return list;
  }
  
  public static boolean isEmpty(String str)
  {
    if ((str == null) || ("".equals(str.trim()))) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(Object str)
  {
    if (str == null) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(Map map)
  {
    if ((map == null) || (map.isEmpty())) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(Long str)
  {
    if (str == null) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(List list)
  {
    if ((list == null) || (list.size() == 0)) {
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(String[] arr)
  {
    if ((arr == null) || (arr.length == 0)) {
      return true;
    }
    return false;
  }
  
  public static HashMap extGridOut(List root, int totalProperty)
  {
    HashMap resultMap = new HashMap();
    resultMap.put("root", root);
    resultMap.put("totalProperty", Integer.valueOf(totalProperty));
    return resultMap;
  }
  
  public static String getMapString(HashMap map, String key)
  {
    if (map == null) {
      return null;
    }
    Object value_obj = map.get(key);
    if (value_obj == null) {
      return null;
    }
    return value_obj.toString().trim();
  }
  
  public static Long getMapLong(HashMap map, String key)
  {
    String value = getMapString(map, key);
    if (isEmpty(value)) {
      return null;
    }
    return Long.valueOf(Long.parseLong(value));
  }
  
  public static Double getMapDouble(HashMap map, String key)
  {
    String value = getMapString(map, key);
    if (isEmpty(value)) {
      return null;
    }
    return Double.valueOf(Double.parseDouble(value));
  }
  
  public static Integer getMapInt(HashMap map, String key)
  {
    String value = getMapString(map, key);
    if (isEmpty(value)) {
      return null;
    }
    return Integer.valueOf(Integer.parseInt(value));
  }
  
  public static String[] getMapStringArray(HashMap map, String key)
  {
    Object value_obj = map.get(key);
    Class value_class = value_obj.getClass();
    String class_simple_name = value_class.getSimpleName();
    if ("String[]".equals(class_simple_name)) {
      return (String[])value_obj;
    }
    if ("String".equals(class_simple_name)) {
      return new String[] { value_obj.toString() };
    }
    return null;
  }

  
  public static String addZeroToNumber(Long number, int total)
  {
    if (number == null) {
      return null;
    }
    String number_string = number.toString();
    return addZeroToNumber(number_string, total, true);
  }
  
  public static String addZeroToNumber(String number, int total, boolean cut_if_long)
  {
    if (number == null) {
      return null;
    }
    int length = number.length();
    if (length < total) {
      for (int i = length; i < total; i++) {
        number = "0" + number;
      }
    } else if ((cut_if_long) && (length > total)) {
      number = number.substring(length - total, length);
    }
    return number;
  }
  
  public static String format(String value, String type)
  {
    if ("".equals(value)) {
      value = "''";
    } else if ("date".equals(type)) {
      value = "to_date('" + value + "','YYYY/MM/DD HH24:MI:SS')";
    } else if (("int".equals(type)) || ("string".equals(type))) {
      value = "'" + value + "'";
    }
    return value;
  }
  
  public static String arrayToString(String[] arr)
  {
    if (arr == null) {
      return null;
    }
    String re = "";
    for (int i = 0; i < arr.length; i++) {
      re = re + arr[i] + ",";
    }
    if (!"".equals(re)) {
      re = re.substring(0, re.length() - 1);
    }
    return re;
  }
  
  public static String listToString(List<String> list)
  {
    return listToString(list, ",");
  }
  
  public static String listToString(List<String> list, String split)
  {
    if (list == null) {
      return null;
    }
    String re = "";
    for (String s : list) {
      re = re + s + split;
    }
    if (!"".equals(re)) {
      re = re.substring(0, re.length() - 1);
    }
    return re;
  }
  
  public static List getExistNumbers(List<String> new_phone_numbers, List<String> old_phone_numbers)
  {
    List<String> result_list = new ArrayList(
      Arrays.asList(new String[old_phone_numbers.size()]));
    Collections.copy(result_list, old_phone_numbers);
    result_list.retainAll(new_phone_numbers);
    return result_list;
  }
  
  public static List getNewNumbers(List<String> new_phone_numbers, List<String> old_phone_numbers)
  {
    List<String> result_list = new ArrayList(
      Arrays.asList(new String[new_phone_numbers.size()]));
    Collections.copy(result_list, new_phone_numbers);
    result_list.removeAll(old_phone_numbers);
    return result_list;
  }
  
  public static List getRemoveNumbers(List<String> new_phone_numbers, List<String> old_phone_numbers)
  {
    List<String> result_list = new ArrayList(
      Arrays.asList(new String[old_phone_numbers.size()]));
    Collections.copy(result_list, old_phone_numbers);
    result_list.removeAll(new_phone_numbers);
    return result_list;
  }
  
  public static String urlEncode(String word)
  {
    return URLEncoder.encode(word);
  }
  
  public static String urlEncode(String word, String code)
    throws UnsupportedEncodingException
  {
    return URLEncoder.encode(word, code);
  }
  
  public static String urlDecode(String word)
  {
    return URLDecoder.decode(word);
  }
  
  public static String urlDecode(String word, String code)
    throws UnsupportedEncodingException
  {
    return URLDecoder.decode(word, code);
  }
  
  public static double getDoubleLeft(double f, int place)
  {
    BigDecimal b = new BigDecimal(f);
    double f1 = b.setScale(place, 4).doubleValue();
    return f1;
  }
  
  public static float perscentToFloat(String perscent)
  {
    float result = 0.0F;
    if (!isEmpty(perscent))
    {
      int indexOfp = perscent.indexOf("%");
      if (indexOfp != -1) {
        perscent = perscent.replaceAll("%", "");
      }
      try
      {
        result = Float.parseFloat(perscent);
      }
      catch (Exception localException) {}
    }
    result /= 100.0F;
    return result;
  }
  
  public static String formatNullToString(Object b)
  {
    if (b == null) {
      return "";
    }
    return b.toString();
  }
  
  public static String checkBoxValChange(String value)
  {
    if (value != null)
    {
      if ("Y".equals(value)) {
        return "1";
      }
      if ("N".equals(value)) {
        return "0";
      }
      if (("on".equals(value)) || ("true".equals(value))) {
        return "Y";
      }
      return "N";
    }
    return value;
  }
  
  public static String formatExceptionInfoFor(String ex, String retStr)
  {
    if (retStr == null) {
      retStr = "";
    }
    retStr = ex.replace("\n", "\\n");
    
    return retStr;
  }
  

  public static Map splitCondition(String condition)
  {
    Map map = new HashMap();
    if ((condition != null) && (!condition.equals("")))
    {
      String conditionnew = tansformCondition(condition);
      

      String[] kv = conditionnew.split(";");
      for (int i = 0; i < kv.length; i++)
      {
        String[] kv_ = kv[i].split(":");
        if (kv_.length >= 2)
        {
          for (int j = 2; j < kv_.length; j++) {
            if ((kv_[j] != null) && (!kv_[j].equals("")) && (!kv_[j].equals("undefined"))) {
              kv_[1] = (kv_[1] + kv_[j]);
            }
          }
          if ((kv_[1] != null) && (!kv_[1].equals("")) && (!kv_[1].equals("undefined"))) {
            map.put(kv_[0], kv_[1]);
          }
        }
      }
    }
    return map;
  }
  
  public static int getPageNoByStart(int start, int pageSize)
  {
    int pageNo = 1;
    try
    {
      if (pageSize == 0) {
        pageSize = 10;
      }
      if (start == 0) {
        pageNo = 1;
      } else {
        pageNo = start / pageSize + 1;
      }
    }
    catch (Exception localException) {}
    return pageNo;
  }
  
  public static String tansformCondition(String condition)
  {
    return condition.replace("*", "%");
  }
  
  public static Long getPageNumber(Long pageSize, Long total)
  {
    if ((total == null) || (total.longValue() == 0L)) {
      return Long.valueOf(0L);
    }
    if (pageSize.longValue() == 0L) {
      pageSize = Long.valueOf(10L);
    }
    if (total.longValue() % pageSize.longValue() == 0L) {
      return Long.valueOf(total.longValue() / pageSize.longValue());
    }
    return Long.valueOf(total.longValue() / pageSize.longValue() + 1L);
  }
  
  public static double doubleAdd(double v1, double v2)
  {
    BigDecimal b1 = new BigDecimal(Double.toString(v1));
    BigDecimal b2 = new BigDecimal(Double.toString(v2));
    return b1.add(b2).doubleValue();
  }
  
  public static double doubleSub(double v1, double v2)
  {
    BigDecimal b1 = new BigDecimal(Double.toString(v1));
    BigDecimal b2 = new BigDecimal(Double.toString(v2));
    return b1.subtract(b2).doubleValue();
  }
  
  public static String formateToYN(String instr)
  {
    if (instr == null) {
      instr = "";
    }
    if (instr.trim().equalsIgnoreCase("true")) {
      instr = "Y";
    } else if (instr.trim().equalsIgnoreCase("false")) {
      instr = "N";
    }
    return instr;
  }
  
  public static String formateNullONToYN(String instr)
  {
    if (instr == null) {
      instr = "N";
    }
    if (instr.trim().equalsIgnoreCase("true")) {
      instr = "Y";
    } else if (instr.trim().equalsIgnoreCase("false")) {
      instr = "N";
    } else if (instr.trim().equalsIgnoreCase("on")) {
      instr = "Y";
    }
    return instr;
  }
  
  public static String formateToTrueFalse(String instr)
  {
    if (instr == null) {
      instr = "false";
    }
    if (instr.trim().equalsIgnoreCase("Y")) {
      instr = "true";
    } else if (instr.trim().equalsIgnoreCase("N")) {
      instr = "false";
    }
    return instr;
  }
  
  public static final String MD5(String s)
  {
    char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    try
    {
      byte[] strTemp = s.getBytes();
      MessageDigest mdTemp = MessageDigest.getInstance("MD5");
      mdTemp.update(strTemp);
      byte[] md = mdTemp.digest();
      int j = md.length;
      char[] str = new char[j * 2];
      int k = 0;
      for (int i = 0; i < j; i++)
      {
        byte byte0 = md[i];
        str[(k++)] = hexDigits[(byte0 >>> 4 & 0xF)];
        str[(k++)] = hexDigits[(byte0 & 0xF)];
      }
      return new String(str);
    }
    catch (Exception e) {}
    return null;
  }
  
  public static Map getObj2Map(Map map, Object obj)
  {
    Method[] methods = obj.getClass().getMethods();
    Field[] fields = obj.getClass().getDeclaredFields();
    for (int i = 0; i < fields.length; i++)
    {
      String getMethod = "get" + fields[i].getName().substring(0, 1).toUpperCase() + 
        fields[i].getName().substring(1, fields[i].getName().length());
      for (int j = 0; j < methods.length; j++) {
        if (getMethod.equals(methods[j].getName())) {
          try
          {
            Object value = methods[j].invoke(obj, new Object[0]);
            if (value != null)
            {
              map.put(fields[i].getName(), value.toString());
              if (methods[j].getReturnType().getSimpleName().equals("String")) {
                map.put(fields[i].getName(), value.toString().replace("*", "%"));
              }
            }
          }
          catch (IllegalArgumentException e)
          {
            e.printStackTrace();
          }
          catch (IllegalAccessException e)
          {
            e.printStackTrace();
          }
          catch (InvocationTargetException e)
          {
            e.printStackTrace();
          }
        }
      }
    }
    return map;
  }

  
  public static String getMACAddress(String ip)
  {
    String str = "";
    String macAddress = "";
    try
    {
      Process p = Runtime.getRuntime().exec("nbtstat -A " + ip);
      InputStreamReader ir = new InputStreamReader(p.getInputStream());
      LineNumberReader input = new LineNumberReader(ir);
      for (int i = 1; i < 100; i++)
      {
        str = input.readLine();
        if ((str != null) && 
          (str.indexOf("MAC Address") > 1))
        {
          macAddress = str.substring(str.indexOf("MAC Address") + 14, str.length());
          break;
        }
      }
    }
    catch (IOException e)
    {
      e.printStackTrace(System.out);
    }
    return macAddress;
  }
  
  public static Object invokeGet(Object target, String name)
  {
    name = name.substring(0, 1).toUpperCase() + name.substring(1);
    String getMethodName = "get" + name;
    
    Object res = null;
    try
    {
      Method method = target.getClass().getMethod(getMethodName, new Class[0]);
      res = method.invoke(target, new Object[0]);
    }
    catch (SecurityException e)
    {
      e.printStackTrace();
    }
    catch (IllegalArgumentException e)
    {
      e.printStackTrace();
    }
    catch (NoSuchMethodException e)
    {
      e.printStackTrace();
    }
    catch (IllegalAccessException e)
    {
      e.printStackTrace();
    }
    catch (InvocationTargetException e)
    {
      e.printStackTrace();
    }
    return res;
  }
  
  public static String initStrArr()
  {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 4000; i++) {
      sb.append(" ");
    }
    return sb.toString();
  }
  
  public static boolean isNotEmpty(String s)
  {
    return (s != null) && (!s.trim().equalsIgnoreCase(""));
  }
  
  public static Object getNullOut(Object obj)
  {
    Field[] list = obj.getClass().getDeclaredFields();
    for (int i = 0; i < list.length; i++)
    {
      String name = list[i].getName();
      Class<?> type = list[i].getType();
      if ((type.toString().equals("".getClass().toString())) && (
        (invokeGet(obj, name) == null) || ("NULL".equals(invokeGet(obj, name).toString().trim())))) {
        try
        {
          Method method = obj.getClass().getMethod(
            "set" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length()), new Class[] {
            String.class });
          method.invoke(obj, new Object[] { "" });
        }
        catch (SecurityException e)
        {
          e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
          e.printStackTrace();
        }
        catch (IllegalArgumentException e)
        {
          e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
          e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
          e.printStackTrace();
        }
      }
    }
    return obj;
  }
  
  public static Map getModifyFields(Map fieldMap, Object newDomain, Object oldDomain)
    throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
  {
    Map modifyFields = new HashMap();
    if (fieldMap == null) {
      fieldMap = PropertyUtils.describe(newDomain);
    }
    Iterator it = fieldMap.keySet().iterator();
    while (it.hasNext())
    {
      String key = (String)it.next();
      Object new_value = PropertyUtils.getProperty(newDomain, key);
      Object old_value = PropertyUtils.getProperty(oldDomain, key);
      if (new_value != null)
      {
        if (new_value.getClass().equals(String.class))
        {
          String new_valueString = (String)new_value;
          String old_valueString = (String)old_value;
          if ((!StringUtils.isBlank(new_valueString)) || (!StringUtils.isBlank(old_valueString))) {
            if (!new_value.equals(old_value)) {
              modifyFields.put(key, fieldMap.get(key));
            }
          }
        }
        else if (!new_value.equals(old_value))
        {
          modifyFields.put(key, fieldMap.get(key));
        }
      }
      else if (old_value != null) {
        if (old_value.getClass().equals(String.class))
        {
          String new_valueString = (String)new_value;
          String old_valueString = (String)old_value;
          if ((!StringUtils.isBlank(new_valueString)) || (!StringUtils.isBlank(old_valueString))) {
            if (!old_value.equals(new_value)) {
              modifyFields.put(key, fieldMap.get(key));
            }
          }
        }
        else if (!old_value.equals(new_value))
        {
          modifyFields.put(key, fieldMap.get(key));
        }
      }
    }
    return modifyFields;
  }
  
  public static boolean isHave(String[] strs, String s)
  {
    for (int i = 0; i < strs.length; i++) {
      if (strs[i].indexOf(s) != -1) {
        return true;
      }
    }
    return false;
  }
  
  public static double rounding(int digit, Double f)
  {
    if (f == null) {
      return 0.0D;
    }
    BigDecimal b = new BigDecimal(f.doubleValue());
    return b.setScale(digit, 4).doubleValue();
  }
  
  public static Map<String, String> URLRequest(String URL)
  {
    Map<String, String> mapRequest = new HashMap();
    
    String[] arrSplit = (String[])null;
    
    String strUrlParam = truncateUrlPage(URL);
    if (strUrlParam == null) {
      return mapRequest;
    }
    arrSplit = strUrlParam.split("[&]");
    for (String strSplit : arrSplit)
    {
      String[] arrSplitEqual = (String[])null;
      arrSplitEqual = strSplit.split("[=]");
      if (arrSplitEqual.length > 1) {
        mapRequest.put(arrSplitEqual[0], arrSplitEqual[1]);
      } else if (arrSplitEqual[0] != "") {
        mapRequest.put(arrSplitEqual[0], "");
      }
    }
    return mapRequest;
  }
  
  public static String truncateUrlPage(String strURL)
  {
    String strAllParam = null;
    String[] arrSplit = (String[])null;
    
    strURL = strURL.trim().toLowerCase();
    
    arrSplit = strURL.split("[?]");
    if ((strURL.length() > 1) && 
      (arrSplit.length > 1) && 
      (arrSplit[1] != null)) {
      strAllParam = arrSplit[1];
    }
    return strAllParam;
  }
  
  public static boolean isboolIp(String ipAddress)
  {
    String zhengze = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
    


    Pattern pattern = Pattern.compile(zhengze);
    Matcher matcher = pattern.matcher(ipAddress);
    return matcher.matches();
  }
  
  public static String goThroughMapAllParams(Map<?, ?> map)
  {
    StringBuffer sb = new StringBuffer();
    Set<?> set = map.entrySet();
    Iterator<?> i = set.iterator();
    while (i.hasNext())
    {
      Map.Entry<?, ?> entry1 = (Map.Entry)i.next();
      sb.append(entry1.getKey() + "=" + entry1.getValue() + ";");
    }
    return sb.toString();
  }
  
  public static double getDistance(double long1, double lat1, double long2, double lat2)
  {
    double R = 6378137.0D;
    lat1 = lat1 * 3.141592653589793D / 180.0D;
    lat2 = lat2 * 3.141592653589793D / 180.0D;
    double a = lat1 - lat2;
    double b = (long1 - long2) * 3.141592653589793D / 180.0D;
    

    double sa2 = Math.sin(a / 2.0D);
    double sb2 = Math.sin(b / 2.0D);
    double d = 2.0D * R * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1) * Math.cos(lat2) * sb2 * sb2));
    return d;
  }
}
