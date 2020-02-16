package com.davina.core.controller.brand;

import com.alibaba.dubbo.config.annotation.Reference;
import com.davina.core.entity.PageResult;
import com.davina.core.pojo.good.Brand;
import com.davina.core.service.brand.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName BrandController
 * @Description 品牌controller
 * @Author Davina Chan
 * @Date 2020/2/15 10:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll.do")
    public List<Brand> findAll(){
        List<Brand> brandList = brandService.findAll();
        return brandList;
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/findByPage.do")
    public PageResult findByPage(Integer pageNo,Integer pageSize){
        return brandService.findByPage(pageNo,pageSize);
    }
}
