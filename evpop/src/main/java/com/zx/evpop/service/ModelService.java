package com.zx.evpop.service;

import com.zx.evpop.jdbc.entity.Model;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-10-30
 * @Description:
 */
public interface ModelService {
    List<Model> queryModelIn(Integer[] ids);

    Model findById(Integer id);
}
