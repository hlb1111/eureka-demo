package org.eureka.demo.producer.entity; 

import com.hu.wxky.frame.bean.BaseBean; 
import com.hu.wxky.frame.annotation.PrimaryKey; 
import com.hu.wxky.frame.dao.GenerateKey; 


public class SysModule extends BaseBean {

    private static final long serialVersionUID = 1L;

    @PrimaryKey(generateKey=GenerateKey.IDENTITY)
    private Integer moduleId; 

    private String moduleName; 

    private Integer systemId; 

    private Integer parentId; 

    private Integer funIsLeaf; 

    private Integer menuIsLeaf; 

    private String remark; 

    private String url; 

    private Integer isMenu; 

    private Integer status; 

    private Integer isPublic; 

    private Integer orderNum; 

    private String icon; 

    public Integer getModuleId() {
        return moduleId; 
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId=moduleId; 
    }

    public String getModuleName() {
        return moduleName; 
    }

    public void setModuleName(String moduleName) {
        this.moduleName=moduleName; 
    }

    public Integer getSystemId() {
        return systemId; 
    }

    public void setSystemId(Integer systemId) {
        this.systemId=systemId; 
    }

    public Integer getParentId() {
        return parentId; 
    }

    public void setParentId(Integer parentId) {
        this.parentId=parentId; 
    }

    public Integer getFunIsLeaf() {
        return funIsLeaf; 
    }

    public void setFunIsLeaf(Integer funIsLeaf) {
        this.funIsLeaf=funIsLeaf; 
    }

    public Integer getMenuIsLeaf() {
        return menuIsLeaf; 
    }

    public void setMenuIsLeaf(Integer menuIsLeaf) {
        this.menuIsLeaf=menuIsLeaf; 
    }

    public String getRemark() {
        return remark; 
    }

    public void setRemark(String remark) {
        this.remark=remark; 
    }

    public String getUrl() {
        return url; 
    }

    public void setUrl(String url) {
        this.url=url; 
    }

    public Integer getIsMenu() {
        return isMenu; 
    }

    public void setIsMenu(Integer isMenu) {
        this.isMenu=isMenu; 
    }

    public Integer getStatus() {
        return status; 
    }

    public void setStatus(Integer status) {
        this.status=status; 
    }

    public Integer getIsPublic() {
        return isPublic; 
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic=isPublic; 
    }

    public Integer getOrderNum() {
        return orderNum; 
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum=orderNum; 
    }

    public String getIcon() {
        return icon; 
    }

    public void setIcon(String icon) {
        this.icon=icon; 
    }

}
