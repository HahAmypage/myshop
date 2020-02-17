package com.davina.core.service.brand;

import com.alibaba.dubbo.config.annotation.Service;
import com.davina.core.dao.BrandMapper;
import com.davina.core.entity.PageResult;
import com.davina.core.pojo.Brand;
import com.davina.core.pojo.BrandExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.transaction.annotation.Transactional;

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
    public PageResult findByPage(Integer pageNo, Integer pageSize,Brand brand) {
        PageHelper.startPage(pageNo,pageSize);
        // 通过xxExample对象封装条件
        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        if (brand.getName() != null && !"".equals(brand.getName().trim())){
            criteria.andNameLike("%"+brand.getName().trim()+"%");
        }
        if (brand.getFirstChar() != null && !"".equals(brand.getFirstChar().trim())){
            criteria.andFirstCharEqualTo(brand.getFirstChar().trim());
        }
        //根据id降序
        brandExample.setOrderByClause("id desc");
        Page<Brand> brandPage = (Page<Brand>) brandMapper.selectByExample(brandExample);
        return new PageResult(brandPage.getTotal(),brandPage.getResult());
    }

    /**
     * 添加品牌
     *
     * @param brand
     */
    @Transactional
    @Override
    public void add(Brand brand) {
        brandMapper.insert(brand);
    }

    /**
     * 根据id查询品牌
     *
     * @param id
     * @return
     */
    @Override
    public Brand findOne(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    /**
     * 更新品牌
     *
     * @param brand
     */
    @Override
    public void update(Brand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    /**
     * 根据id数组删除品牌
     *
     * @param ids
     */
    @Override
    public void delete(Long[] ids) {
        brandMapper.deleteByPrimaryKeys(ids);
    }
}
