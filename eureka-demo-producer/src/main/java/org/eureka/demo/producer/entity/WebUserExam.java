package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class WebUserExam extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Long id; 

    private Long userId; 

    private Integer examId; 

    private String selectStr; 

    private String expound; 

    private Date created; 

    private Date modified; 

    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id=id; 
    }

    public Long getUserId() {
        return userId; 
    }

    public void setUserId(Long userId) {
        this.userId=userId; 
    }

    public Integer getExamId() {
        return examId; 
    }

    public void setExamId(Integer examId) {
        this.examId=examId; 
    }

    public String getSelectStr() {
        return selectStr; 
    }

    public void setSelectStr(String selectStr) {
        this.selectStr=selectStr; 
    }

    public String getExpound() {
        return expound; 
    }

    public void setExpound(String expound) {
        this.expound=expound; 
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

}
