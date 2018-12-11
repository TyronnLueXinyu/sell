package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: TyronnLue
 * @Date: 2018-12-4 9:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
        System.out.println("我爱你");
    }

    @Test
    /**
     * Transactional 注解是表示测试数据不在数据库里生成，只是看是否报错，测试通过
     */
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
       ProductCategory result =  repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);   这句跟上面一样的意思
    }

    @Test
    public void findByCategoryTypeIn(){
        List<Integer> list = Arrays.asList(123,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,result.size());
    }



}