package com.feiniaojin.dddlesson2.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MvpMessage {

    private String playerId;

    private Date mvpTime;
}
