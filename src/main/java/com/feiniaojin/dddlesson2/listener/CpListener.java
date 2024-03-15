package com.feiniaojin.dddlesson2.listener;

import com.alibaba.fastjson2.JSON;
import com.feiniaojin.dddlesson2.dto.CpMessage;
import com.feiniaojin.dddlesson2.entity.PlayerOpe;
import com.feiniaojin.dddlesson2.service.PlayerOpeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * CP消息监听器
 */
@Component
public class CpListener {

    @Resource
    private PlayerOpeService playerOpeService;


    public void messageHandler(String message) {
        CpMessage cpMessage = JSON.parseObject(message, CpMessage.class);
        playerOpeService.handleCpCount(cpMessage);
    }

}
