package com.zejian.spring.springIoc.pojo;

import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by zejian on 2017/1/16.
 * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
 * pojo对象
 */
@Scope("prototype")
public class Account {

    private String name;
    private String pwd;

    private List<String> citys;
    private Set<String> friends;
    private Map<Integer,String> books;

    /**
     * 默认构造
     */
    public Account(){

    }

    /**
     * 带参数的构造
     * @param name
     * @param pwd
     */
    public Account(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setCitys(List<String> citys) {
        this.citys = citys;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public void setBooks(Map<Integer, String> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}
