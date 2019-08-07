package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class UserBlog extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String body; 

    private Date timestamp; 

    private Integer userId; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getBody() {
        return body; 
    }

    public void setBody(String body) {
        this.body=body; 
    }

    public Date getTimestamp() {
        return timestamp; 
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp=timestamp; 
    }

    public Integer getUserId() {
        return userId; 
    }

    public void setUserId(Integer userId) {
        this.userId=userId; 
    }

}
