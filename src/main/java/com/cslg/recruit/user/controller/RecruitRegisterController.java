package com.cslg.recruit.user.controller;

import com.cslg.recruit.user.pojo.RecruitUserInfo;
import com.cslg.recruit.user.service.RecruitRegisterService;
import com.definesys.mpaas.common.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: qiqiang.xing
 * @since: 2020/4/6 15:56
 * @history： 1.2020/4/6 created by qiqiang.xing
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/Register")
public class RecruitRegisterController {

    @Autowired
    private RecruitRegisterService recruitRegisterService;

    /**
     * 验证账号是否已被使用
     * @param item
     * @return
     */
    @RequestMapping(value = "/queryAccount", method = RequestMethod.POST)
    public Response queryRecruitUserAccount(@RequestBody RecruitUserInfo item) {
        boolean b = this.recruitRegisterService.queryRecruitUserAccount(item);
        return Response.ok().data(b);
    }

    /**
     * 注册账号
     * @param item
     * @return
     */
    @RequestMapping(value = "/addRecruitUserInfo", method = RequestMethod.POST)
    public Response addRecruitUserInfo(@RequestBody RecruitUserInfo item) {
        this.recruitRegisterService.addRecruitUserInfo(item);
        return Response.ok();
    }
}
