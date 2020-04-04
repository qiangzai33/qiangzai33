package com.cslg.recruit.user.pojo;

import com.definesys.mpaas.query.annotation.*;
import com.definesys.mpaas.query.json.MpaasDateDeserializer;
import com.definesys.mpaas.query.json.MpaasDateSerializer;
import com.definesys.mpaas.query.model.MpaasBasePojo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: XQQ
 * @since: 2020-04-04
 * @history: 1.2020-04-04 created by XQQ
 */
@Table(value = "RECRUIT_USER_INFO")
public class RecruitUserInfo extends MpaasBasePojo {

    @RowID(sequence = "RECRUIT_USER_INFO_S", type = RowIDType.AUTO)
    @Style(displayName = "物理主键")
    private Long id;

    @SystemColumn(SystemColumnType.CREATE_BY)
    @Column(value = "CREATED_BY")
    @Style(displayName = "创建者")
    private String createdBy;

    @JsonSerialize(using = MpaasDateSerializer.class)
    @JsonDeserialize(using = MpaasDateDeserializer.class)
    @SystemColumn(SystemColumnType.CREATE_ON)
    @Column(value = "CREATION_DATE")
    @Style(displayName = "创建日期")
    private Date creationDate;

    @SystemColumn(SystemColumnType.LASTUPDATE_BY)
    @Column(value = "LAST_UPDATED_BY")
    @Style(displayName = "更新者")
    private String lastUpdatedBy;

    @JsonSerialize(using = MpaasDateSerializer.class)
    @JsonDeserialize(using = MpaasDateDeserializer.class)
    @SystemColumn(SystemColumnType.LASTUPDATE_ON)
    @Column(value = "LAST_UPDATE_DATE")
    @Style(displayName = "更新日期")
    private Date lastUpdateDate;

    @Column(value = "USER_ACCOUNT")
    @Style(displayName = "用户账号")
    private String userAccount;

    @Column(value = "USER_NICKNAME")
    @Style(displayName = "用户昵称")
    private String userNickname;

    @Column(value = "USER_PASSWORD")
    @Style(displayName = "用户密码")
    private String userPassword;

    @Column(value = "USER_SEX")
    @Style(displayName = "用户性别")
    private String userSex;

    @Column(value = "USER_ADDRESS")
    @Style(displayName = "用户地址")
    private String userAddress;

    @Column(value = "USER_PHONE_NUMBER")
    @Style(displayName = "用户手机号")
    private String userPhoneNumber;

    @Column(value = "USER_ROLE")
    @Style(displayName = "用户角色")
    private String userRole;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getUserAccount() {
        return this.userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserRole() {
        return this.userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}