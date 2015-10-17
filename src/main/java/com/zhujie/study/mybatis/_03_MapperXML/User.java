package com.zhujie.study.mybatis._03_MapperXML;

/**
 * Created by zhujie on 15/9/28.
 */
public class User {
    private int id;
    private String username;
    private String hashedPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
