package com.feiniaojin.dddlesson2.listener;

import com.alibaba.fastjson2.JSON;
import com.feiniaojin.dddlesson2.dto.MvpMessage;
import com.feiniaojin.dddlesson2.service.PlayerOpeService;
import jakarta.annotation.Resource;

public class MvpListener {

    @Resource
    private PlayerOpeService playerOpeService;


    public void messageHandler(String message) {
        MvpMessage mvpMessage = JSON.parseObject(message, MvpMessage.class);
        playerOpeService.handleMvp(mvpMessage);
    }
}
