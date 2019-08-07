package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class WebUser extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Long id; 

    private String nickName; 

    private String wxOpenId; 

    private String headerImgUrl; 

    private Integer status; 

    private Date created; 

    private Date modified; 

    private Long referrerId; 

    private String userName; 

    private String phone; 

    private String wxCode; 

    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id=id; 
    }

    public String getNickName() {
        return nickName; 
    }

    public void setNickName(String nickName) {
        this.nickName=nickName; 
    }

    public String getWxOpenId() {
        return wxOpenId; 
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId=wxOpenId; 
    }

    public String getHeaderImgUrl() {
        return headerImgUrl; 
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl=headerImgUrl; 
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

    public Long getReferrerId() {
        return referrerId; 
    }

    public void setReferrerId(Long referrerId) {
        this.referrerId=referrerId; 
    }

    public String getUserName() {
        return userName; 
    }

    public void setUserName(String userName) {
        this.userName=userName; 
    }

    public String getPhone() {
        return phone; 
    }

    public void setPhone(String phone) {
        this.phone=phone; 
    }

    public String getWxCode() {
        return wxCode; 
    }

    public void setWxCode(String wxCode) {
        this.wxCode=wxCode; 
    }

}
