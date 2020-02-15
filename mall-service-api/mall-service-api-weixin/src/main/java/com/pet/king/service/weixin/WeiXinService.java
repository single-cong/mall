package com.pet.king.service.weixin;

import com.pet.king.entity.weixin.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 微信服务接口
 * @Author single-聪
 * @Date 23:22 2020/2/14
 * @Version 1.0.1
 * @return
 **/
public interface WeiXinService {

    @GetMapping("getapp")
    AppEntity getApp();
}
