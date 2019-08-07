package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysUrl extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer urlId; 

    private String urlPath; 

    private Integer moduleId; 

    private String remark; 

    public Integer getUrlId() {
        return urlId; 
    }

    public void setUrlId(Integer urlId) {
        this.urlId=urlId; 
    }

    public String getUrlPath() {
        return urlPath; 
    }

    public void setUrlPath(String urlPath) {
        this.urlPath=urlPath; 
    }

    public Integer getModuleId() {
        return moduleId; 
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId=moduleId; 
    }

    public String getRemark() {
        return remark; 
    }

    public void setRemark(String remark) {
        this.remark=remark; 
    }

}
