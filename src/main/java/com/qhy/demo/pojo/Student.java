package com.qhy.demo.pojo;

import java.io.Serializable;

public class Student implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5848444436614424182L;

	private Integer id;

    private String username;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}