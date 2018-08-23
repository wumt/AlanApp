package com.alan.app.model;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wumt
 * @since 2018-08-15
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        "}";
    }
}
