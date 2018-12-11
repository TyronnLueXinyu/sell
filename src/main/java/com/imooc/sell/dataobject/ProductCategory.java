package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * @Author: TyronnLue
 * @Date: 2018-11-20 14:54
 */
/**Entity注解把数据库参数映射为对象*/
@Entity
/**
 * 时间自增注解
 */
@DynamicUpdate
/**
 * lombok插件注解，可以免去get set  toString等方法
 */
@Data
public class ProductCategory {
    /**类目id*/
    /**Id表示这个对象是个逐渐，GeneratedValue表示这个主键是自增类型的。*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名字*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;

//    private Date createTime;
//    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
