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

    public List<RecruitUserInfo> queryRecruitUserInfo() {
        return swRecruitUserInfoDao.queryRecruitUserInfo();
    }

    public void addRecruitUserInfo(RecruitUserInfo item) {
        swRecruitUserInfoDao.addRecruitUserInfo(item);
    }

    public void deleteRecruitUserInfo(String rowId) {
        swRecruitUserInfoDao.deleteRecruitUserInfo(rowId);
    }

    public void updateRecruitUserInfo(RecruitUserInfo item) {
        swRecruitUserInfoDao.updateRecruitUserInfo(item);
    }
}