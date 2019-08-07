package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class TmpHouseRoom extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String proName; 

    private String buildNo; 

    private String roomNo; 

    private Integer floor; 

    private Double area; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getProName() {
        return proName; 
    }

    public void setProName(String proName) {
        this.proName=proName; 
    }

    public String getBuildNo() {
        return buildNo; 
    }

    public void setBuildNo(String buildNo) {
        this.buildNo=buildNo; 
    }

    public String getRoomNo() {
        return roomNo; 
    }

    public void setRoomNo(String roomNo) {
        this.roomNo=roomNo; 
    }

    public Integer getFloor() {
        return floor; 
    }

    public void setFloor(Integer floor) {
        this.floor=floor; 
    }

    public Double getArea() {
        return area; 
    }

    public void setArea(Double area) {
        this.area=area; 
    }

}
