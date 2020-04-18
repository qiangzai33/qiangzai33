package com.cslg.recruit.user.service;

import com.cslg.recruit.user.dao.RecruitLoginDAO;
import com.cslg.recruit.user.pojo.RecruitUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/14 23:18
 * @history： 1.2020/4/14 created by qiqiang.xing
 */
@Service
public class RecruitLoginService {
    @Autowired
    private RecruitLoginDAO recruitLoginDAO;

    /**
     * 用户是否存在
     * @param userInfo
     * @return true --> 不存在 反之
     */
    public boolean queryUserByAccountPwd(RecruitUserInfo userInfo){
        return CollectionUtils.isEmpty(this.recruitLoginDAO.queryUserByAccountPwd(userInfo));
    }
}
