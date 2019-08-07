package org.eureka.demo.producer.entity;

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysUser extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String loginAccount; 

    private String loginPassword; 

    private String pwdEncrySalt; 

    private Integer status; 

    private Date created; 

    private Date modified; 

    private String username; 

    private String wxOpenId; 

    private String mobile; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getLoginAccount() {
        return loginAccount; 
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount=loginAccount; 
    }

    public String getLoginPassword() {
        return loginPassword; 
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword=loginPassword; 
    }

    public String getPwdEncrySalt() {
        return pwdEncrySalt; 
    }

    public void setPwdEncrySalt(String pwdEncrySalt) {
        this.pwdEncrySalt=pwdEncrySalt; 
    }

    public Integer getStatus() {
        return status; 
    }

    public void setStatus(Integer status) {
        this.status=status; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

    public Date getModified() {
        return modified; 
    }

    public void setModified(Date modified) {
        this.modified=modified; 
    }

    public String getUsername() {
        return username; 
    }

    public void setUsername(String username) {
        this.username=username; 
    }

    public String getWxOpenId() {
        return wxOpenId; 
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId=wxOpenId; 
    }

    public String getMobile() {
        return mobile; 
    }

    public void setMobile(String mobile) {
        this.mobile=mobile; 
    }

}
