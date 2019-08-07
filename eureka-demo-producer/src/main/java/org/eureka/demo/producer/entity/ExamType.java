package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class ExamType extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String typeName; 

    private Date created; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getTypeName() {
        return typeName; 
    }

    public void setTypeName(String typeName) {
        this.typeName=typeName; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

}
