package com.davina.core.service.brand;

import com.alibaba.dubbo.config.annotation.Service;
import com.davina.core.dao.BrandMapper;
import com.davina.core.entity.PageResult;
import com.davina.core.pojo.good.Brand;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BrandServiceImpl
 * @Description 品牌service接口实现类
 * @Author Davina Chan
 * @Date 2020/2/15 10:33
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService{

    @Resource
    private BrandMapper brandMapper;
    /**
     * 查询所有品牌
     *
     * @return
     */
    @Override
    public List<Brand> findAll() {
        //根据条件查询
        List<Brand> brandList = brandMapper.selectByExample(null);
        return brandList;
    }

    /**
     * 分页查询
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageResult findByPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Page<Brand> brandPage = (Page<Brand>) brandMapper.selectByExample(null);
        return new PageResult(brandPage.getTotal(),brandPage.getResult());
    }
}
