package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysRole extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer roleId; 

    private String roleName; 

    private Integer isSystem; 

    private String remark; 

    public Integer getRoleId() {
        return roleId; 
    }

    public void setRoleId(Integer roleId) {
        this.roleId=roleId; 
    }

    public String getRoleName() {
        return roleName; 
    }

    public void setRoleName(String roleName) {
        this.roleName=roleName; 
    }

    public Integer getIsSystem() {
        return isSystem; 
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem=isSystem; 
    }

    public String getRemark() {
        return remark; 
    }

    public void setRemark(String remark) {
        this.remark=remark; 
    }

}
