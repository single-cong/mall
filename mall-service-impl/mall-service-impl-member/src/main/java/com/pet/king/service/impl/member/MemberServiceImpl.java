package com.pet.king.service.impl.member;

import com.pet.king.entity.weixin.AppEntity;
import com.pet.king.member.feign.WeiXinServiceFeign;
import com.pet.king.service.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity getApp() {
        AppEntity appEntity1 = weiXinServiceFeign.getApp();
        System.out.println("weiXinServiceFeign参数获取返回值:" + appEntity1);
        AppEntity appEntity = new AppEntity("MemberService", "MemberServiceImpl");
        return appEntity;
    }
}
