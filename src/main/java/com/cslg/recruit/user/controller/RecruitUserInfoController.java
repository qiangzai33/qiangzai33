package com.cslg.recruit.user.controller;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.cslg.recruit.user.service.RecruitUserInfoService;
import com.definesys.mpaas.common.http.Response;
import com.definesys.mpaas.query.MpaasQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: XQQ
 * @since: 2020-04-04
 * @history: 1.2020-04-04 created by XQQ
 */
@RestController
@RequestMapping(value = "/RecruitUserInfo")
public class RecruitUserInfoController {
    @Autowired
    private MpaasQueryFactory sw;

    @Autowired
    private RecruitUserInfoService serivce;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Response queryRecruitUserInfo() {

        return Response.ok().table(serivce.queryRecruitUserInfo());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response addRecruitUserInfo(@RequestBody RecruitUserInfo item) {
        serivce.addRecruitUserInfo(item);
        return Response.ok();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Response deleteRecruitUserInfo(@RequestParam(value = "rowId") String rowId) {
        serivce.deleteRecruitUserInfo(rowId);
        return Response.ok();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response updateRecruitUserInfo(@RequestBody RecruitUserInfo item) {
        serivce.updateRecruitUserInfo(item);
        return Response.ok();
    }


    /**
     * 导出excel
     *
     * @param response
     * @return
     */
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void export(HttpServletResponse response) {
        sw.buildQuery()
                .fileName("pojo.xlsx")
                .doExport(response, RecruitUserInfo.class);
    }

}