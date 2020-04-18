package com.cslg.recruit.user.service;

import com.cslg.recruit.user.dao.RecruitUserInfoDAO;
import com.cslg.recruit.user.pojo.RecruitUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: XQQ
 * @since: 2020-04-04
 * @history: 1.2020-04-04 created by XQQ
 */
@Service
public class RecruitUserInfoService {
    @Autowired
    private RecruitUserInfoDAO swRecruitUserInfoDao;

    /**
     * 查看手机号是否已近存在
     * @param telephone
     * @return true ==> 不存在，反之
     */
    public boolean queryIsPhoneExist(String telephone) {
        return this.swRecruitUserInfoDao.queryIsPhoneExist(telephone);
    }
}