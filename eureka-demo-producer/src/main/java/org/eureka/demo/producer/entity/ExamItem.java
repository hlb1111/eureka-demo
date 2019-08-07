package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class ExamItem extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private Integer typeId; 

    private String examDesc; 

    private String selectItem; 

    private String extraAnswer; 

    private Integer status; 

    private Integer orderIndex; 

    private Date created; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public Integer getTypeId() {
        return typeId; 
    }

    public void setTypeId(Integer typeId) {
        this.typeId=typeId; 
    }

    public String getExamDesc() {
        return examDesc; 
    }

    public void setExamDesc(String examDesc) {
        this.examDesc=examDesc; 
    }

    public String getSelectItem() {
        return selectItem; 
    }

    public void setSelectItem(String selectItem) {
        this.selectItem=selectItem; 
    }

    public String getExtraAnswer() {
        return extraAnswer; 
    }

    public void setExtraAnswer(String extraAnswer) {
        this.extraAnswer=extraAnswer; 
    }

    public Integer getStatus() {
        return status; 
    }

    public void setStatus(Integer status) {
        this.status=status; 
    }

    public Integer getOrderIndex() {
        return orderIndex; 
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex=orderIndex; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

}
