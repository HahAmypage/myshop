package com.davina.core.service.brand;

import com.davina.core.pojo.good.Brand;

import java.util.List;

/**
 * @ClassName BrandService
 * @Description 品牌service接口
 * @Author Davina Chan
 * @Date 2020/2/15 10:31
 * @Version 1.0
 */
public interface BrandService {

    /**
     * 查询所有品牌
     * @return
     */
    List<Brand> findAll();
}
