package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysSystem extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer systemId; 

    private String systemName; 

    private String remark; 

    public Integer getSystemId() {
        return systemId; 
    }

    public void setSystemId(Integer systemId) {
        this.systemId=systemId; 
    }

    public String getSystemName() {
        return systemName; 
    }

    public void setSystemName(String systemName) {
        this.systemName=systemName; 
    }

    public String getRemark() {
        return remark; 
    }

    public void setRemark(String remark) {
        this.remark=remark; 
    }

}
