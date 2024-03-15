package com.feiniaojin.dddlesson2.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CpMessage {

    private String playerId;

    private String cpPlayerId;

    private Date cpDate;
}
