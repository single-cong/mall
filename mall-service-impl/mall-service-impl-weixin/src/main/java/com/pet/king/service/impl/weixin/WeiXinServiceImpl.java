package com.pet.king.service.impl.weixin;

import com.pet.king.entity.weixin.AppEntity;
import com.pet.king.service.weixin.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeiXinServiceImpl implements WeiXinService {

    @Override
    public AppEntity getApp() {
        AppEntity appEntity = new AppEntity("appId12345","name1234232");
        return appEntity;
    }
}
