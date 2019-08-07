package org.eureka.demo.producer.entity; 

import java.util.Date; 
import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class DrawLottery extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer id; 

    private String lotteryType; 

    private String periods; 

    private String voteNumbers; 

    private Integer indexFirst; 

    private Integer indexSecond; 

    private Integer indexThird; 

    private Integer indexFourth; 

    private Integer indexFifth; 

    private Integer indexSixth; 

    private Date voteDate; 

    private Date created; 

    public Integer getId() {
        return id; 
    }

    public void setId(Integer id) {
        this.id=id; 
    }

    public String getLotteryType() {
        return lotteryType; 
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType=lotteryType; 
    }

    public String getPeriods() {
        return periods; 
    }

    public void setPeriods(String periods) {
        this.periods=periods; 
    }

    public String getVoteNumbers() {
        return voteNumbers; 
    }

    public void setVoteNumbers(String voteNumbers) {
        this.voteNumbers=voteNumbers; 
    }

    public Integer getIndexFirst() {
        return indexFirst; 
    }

    public void setIndexFirst(Integer indexFirst) {
        this.indexFirst=indexFirst; 
    }

    public Integer getIndexSecond() {
        return indexSecond; 
    }

    public void setIndexSecond(Integer indexSecond) {
        this.indexSecond=indexSecond; 
    }

    public Integer getIndexThird() {
        return indexThird; 
    }

    public void setIndexThird(Integer indexThird) {
        this.indexThird=indexThird; 
    }

    public Integer getIndexFourth() {
        return indexFourth; 
    }

    public void setIndexFourth(Integer indexFourth) {
        this.indexFourth=indexFourth; 
    }

    public Integer getIndexFifth() {
        return indexFifth; 
    }

    public void setIndexFifth(Integer indexFifth) {
        this.indexFifth=indexFifth; 
    }

    public Integer getIndexSixth() {
        return indexSixth; 
    }

    public void setIndexSixth(Integer indexSixth) {
        this.indexSixth=indexSixth; 
    }

    public Date getVoteDate() {
        return voteDate; 
    }

    public void setVoteDate(Date voteDate) {
        this.voteDate=voteDate; 
    }

    public Date getCreated() {
        return created; 
    }

    public void setCreated(Date created) {
        this.created=created; 
    }

}
