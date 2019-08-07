package org.eureka.demo.producer.entity; 

import java.util.Date;

import com.hu.wxky.frame.annotation.PrimaryKey;
import com.hu.wxky.frame.bean.BaseBean;
import com.hu.wxky.frame.dao.GenerateKey; 


public class BlogUser extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String username; 

    private String nickname; 

    private String email; 

    private String password; 

    private Date created; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getUsername() {
        return username; 
    }

    public void setUsername(String username) {
        this.username=username; 
    }

    public String getNickname() {
        return nickname; 
    }

    public void setNickname(String nickname) {
        this.nickname=nickname; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email=email; 
    }

    public String getPassword() {
        return password; 
    }

    public void setPassword(String password) {
        this.password=password; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

}
