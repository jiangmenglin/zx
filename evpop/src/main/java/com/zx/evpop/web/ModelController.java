package com.zx.evpop.web;

import com.zx.evpop.jdbc.entity.Model;
import com.zx.evpop.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jml
 * @Date: 18-10-30
 * @Description:
 */
@RestController
@RequestMapping("/model")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "/queryModelIn", method = RequestMethod.POST)
    public List<Model> queryModelIn(@RequestBody Integer[] ids) {
        return modelService.queryModelIn(ids);
    }

    @RequestMapping("findById")
    public Model findById(Integer id) {
        return modelService.findById(id);
    }
}
