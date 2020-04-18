package com.cslg.recruit.user.service;

import com.cslg.recruit.common.SHA256Util;
import com.cslg.recruit.user.dao.RecruitRegisterDAO;
import com.cslg.recruit.user.pojo.RecruitUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/6 15:57
 * @history： 1.2020/4/6 created by qiqiang.xing
 */
@Service
public class RecruitRegisterService {

    @Autowired
    private RecruitRegisterDAO recruitRegisterDAO;

    /**
     * 查询当前账号是否已经被使用
     * @param item
     * @return
     */
    public boolean queryRecruitUserAccount(RecruitUserInfo item) {
        return this.recruitRegisterDAO.queryRecruitUserAccount(item);
    }

    /**
     * 注册账号
     * @param item
     */
    public void addRecruitUserInfo(RecruitUserInfo item) {
        item.setUserPassword(SHA256Util.getSHA256(item.getUserPassword()));
        this.recruitRegisterDAO.addRecruitUserInfo(item);
    }
}
