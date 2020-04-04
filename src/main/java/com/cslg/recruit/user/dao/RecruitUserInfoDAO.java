package com.cslg.recruit.user.dao;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.definesys.mpaas.log.SWordLogger;
import com.definesys.mpaas.query.MpaasQueryFactory;
import com.definesys.mpaas.query.db.PageQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    public List<RecruitUserInfo> queryRecruitUserInfo() {
        List<RecruitUserInfo> table = sw.buildQuery()
                .doQuery(RecruitUserInfo.class);
        return table;
    }

    public PageQueryResult<RecruitUserInfo> pageQueryRecruitUserInfo(Integer page, Integer pageSize) {
        return sw.buildQuery()
                .doPageQuery(page, pageSize, RecruitUserInfo.class);
    }

    public Object addRecruitUserInfo(RecruitUserInfo item) {
        Object key = sw.buildQuery()
                .bind(item)
                .doInsert();
        return key;
    }

    public void deleteRecruitUserInfo(String rowId) {
        sw.buildQuery()
                .bind(RecruitUserInfo.class)
                .addRowIdClause("id", "=", rowId)
                .doDelete();
    }

    public void updateRecruitUserInfo(RecruitUserInfo item) {
        sw.buildQuery()
                .addRowIdClause("id", "=", item.getRowId())
                .doUpdate(item);
    }

}