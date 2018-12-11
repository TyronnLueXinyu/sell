package com.imooc.sell.vo;

import lombok.Data;

/**
 * http请求最外层的对象
 * @Author: TyronnLue
 * @Date: 2018-12-11 15:11
 */
@Data
public class ResultVO<T> {

    /** 错误码*/
    private  Integer code;

    /** 提示先息*/
    private String msg;

    /** 具体内容*/
    private T data;
}
