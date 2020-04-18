package com.cslg.recruit.user.dao;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.definesys.mpaas.log.SWordLogger;
import com.definesys.mpaas.query.MpaasQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: XQQ
 * @since: 2020-04-04
 * @history: 1.2020-04-04 created by XQQ
 */
@Component
public class RecruitUserInfoDAO {

    @Autowired
    private MpaasQueryFactory sw;

    @Autowired
    private SWordLogger logger;

    /**
     * 查看手机号是否已近存在
     * @param telephone
     * @return true ==> 不存在，反之
     */
    public boolean queryIsPhoneExist(String telephone) {
        List<RecruitUserInfo> userPhoneNumber = sw.buildQuery().eq("userPhoneNumber", telephone).doQuery(RecruitUserInfo.class);
        return CollectionUtils.isEmpty(userPhoneNumber);
    }
}