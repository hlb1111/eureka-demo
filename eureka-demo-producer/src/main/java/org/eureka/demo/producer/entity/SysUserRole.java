package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysUserRole extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Long id; 

    private Long roleId; 

    private Long userId; 

    public Long getId() {
        return id; 
    }

    public void setId(Long id) {
        this.id=id; 
    }

    public Long getRoleId() {
        return roleId; 
    }

    public void setRoleId(Long roleId) {
        this.roleId=roleId; 
    }

    public Long getUserId() {
        return userId; 
    }

    public void setUserId(Long userId) {
        this.userId=userId; 
    }

}
