/**
 * @author teaho2015@gmail.com
 * since 2016/10/11
 */
package com.tea.manage.domain;


public class DbUser {

    private String username;
    private String password;
    private Integer access;

    //getter/setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }
}
