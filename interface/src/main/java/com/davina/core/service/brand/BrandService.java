package com.davina.core.service.brand;

import com.davina.core.entity.PageResult;
import com.davina.core.pojo.Brand;
import org.springframework.data.domain.PageRequest;

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

    /**
     * 分页查询
     * @return
     */
    PageResult findByPage(Integer pageNo,Integer pageSize,Brand brand);

    /**
     * 添加品牌
     * @param brand
     */
    void add(Brand brand);

    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    Brand findOne(Long id);

    /**
     * 更新品牌
     * @param brand
     */
    void update(Brand brand);

    /**
     * 根据id数组删除品牌
     * @param ids
     */
    void delete(Long[] ids);
}
