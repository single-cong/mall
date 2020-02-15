package com.pet.king.member.feign;

import com.pet.king.entity.weixin.AppEntity;
import com.pet.king.service.weixin.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 微信服务接口
 * @Author single-聪
 * @Date 23:22 2020/2/14
 * @Version 1.0.1
 * @return
 **/
@FeignClient("mall-weixin")
public interface WeiXinServiceFeign extends WeiXinService {

}
