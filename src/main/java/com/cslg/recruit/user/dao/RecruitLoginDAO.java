package com.cslg.recruit.user.dao;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.definesys.mpaas.log.SWordLogger;
import com.definesys.mpaas.query.MpaasQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/14 23:17
 * @history： 1.2020/4/14 created by qiqiang.xing
 */
@Component
public class RecruitLoginDAO {
    @Autowired
    private MpaasQueryFactory sw;

    @Autowired
    private SWordLogger logger;

    /**
     * 根据账号密码查询用户
     * @param userInfo
     * @return
     */
    public List<RecruitUserInfo> queryUserByAccountPwd(RecruitUserInfo userInfo){
        List<RecruitUserInfo> recruitUserInfos = sw.buildQuery()
                                                    .and()
                                                    .eq("userAccount", userInfo.getUserAccount())
                                                    .eq("userPassword", userInfo.getUserPassword())
                                                    .doQuery(RecruitUserInfo.class);
        return recruitUserInfos;
    }
}
