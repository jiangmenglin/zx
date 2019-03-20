package com.zx.evpop.service.impl;

import com.zx.evpop.jdbc.dao.ModelMapper;
import com.zx.evpop.jdbc.entity.Model;
import com.zx.evpop.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: jml
 * @Date: 18-10-30
 * @Description:
 */
@Service
public class ModelServiceImpl implements ModelService {
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Model> queryModelIn(Integer[] ids) {
        return modelMapper.selectByIdIn(Arrays.asList(ids));
    }

    @Override
    public Model findById(Integer id) {
        return modelMapper.selectByPrimaryKey(id);
    }
}
