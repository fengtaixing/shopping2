package com.itheima.shoppingEnum;

/**
 * @author taixing
 * @date 2021/7/18
 */
public enum  TypeEnum {
    STOP (1,"停止");

    public Integer key;
    public String value;

    TypeEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
}
