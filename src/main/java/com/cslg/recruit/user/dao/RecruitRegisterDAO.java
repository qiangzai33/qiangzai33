package com.cslg.recruit.user.dao;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.definesys.mpaas.log.SWordLogger;
import com.definesys.mpaas.query.MpaasQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/6 15:58
 * @history： 1.2020/4/6 created by qiqiang.xing
 */
@Component
public class RecruitRegisterDAO {
    @Autowired
    private MpaasQueryFactory sw;

    @Autowired
    private SWordLogger logger;

    /**
     * 当前账号是否已经存在
     * @param item
     * @return
     */
    public boolean queryRecruitUserAccount(RecruitUserInfo item) {
        List<RecruitUserInfo> users = sw.buildQuery().eq("userAccount", item.getUserAccount()).doQuery(RecruitUserInfo.class);
        return CollectionUtils.isEmpty(users);
    }
}
