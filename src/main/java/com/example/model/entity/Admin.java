package com.example.model.entity;


import com.example.model.group.AddGroup;
import com.example.model.group.EditGroup;
import jakarta.validation.constraints.*;
import org.springframework.data.repository.query.Param;

public class Admin {
    private Integer adminId;

    private Integer userId;

    private Integer roleId;

    //@NotNull(message = "管理员姓名不能为空",
    //        groups = {AddGroup.class, EditGroup.class})
    private String fullName;

    //@NotBlank(message = "管理员必须要有联系方式",
    //            groups = {AddGroup.class, EditGroup.class})
    //@Pattern(regexp = "^[1]+[3,8]+\\d{9}$")
    private String contact;

    //@Email(message = "邮箱格式不符合规则",
    //        groups = {AddGroup.class, EditGroup.class})
    private String email;

    private String avatar;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }
}
