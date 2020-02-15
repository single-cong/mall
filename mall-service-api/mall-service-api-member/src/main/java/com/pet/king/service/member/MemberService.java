package com.pet.king.service.member;

import com.pet.king.entity.weixin.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface MemberService {

    /**
     * @Description 会员服务接口
     * @Author single-聪
     * @Date 15:43 2020/2/15
     * @Version 1.0.1
     * @return com.pet.king.entity.weixin.AppEntity
     **/
    @GetMapping("getapp")
    AppEntity getApp();
}
