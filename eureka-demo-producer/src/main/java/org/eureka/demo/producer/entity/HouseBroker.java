package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class HouseBroker extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String brokerName; 

    private String brokerTel; 

    private String brokerCompany; 

    private Date created; 

    private String sourceUrl; 

    private String sourceTitle; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getBrokerName() {
        return brokerName; 
    }

    public void setBrokerName(String brokerName) {
        this.brokerName=brokerName; 
    }

    public String getBrokerTel() {
        return brokerTel; 
    }

    public void setBrokerTel(String brokerTel) {
        this.brokerTel=brokerTel; 
    }

    public String getBrokerCompany() {
        return brokerCompany; 
    }

    public void setBrokerCompany(String brokerCompany) {
        this.brokerCompany=brokerCompany; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

    public String getSourceUrl() {
        return sourceUrl; 
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl=sourceUrl; 
    }

    public String getSourceTitle() {
        return sourceTitle; 
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle=sourceTitle; 
    }

}
