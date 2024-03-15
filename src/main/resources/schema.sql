CREATE TABLE `t_play_ope`
(
    `id`            bigint NOT NULL AUTO_INCREMENT COMMENT '自增主键',
    `player_id`   varchar(64) NULL COMMENT '玩家ID',
    `first_mvp_time`  DATETIME NULL  COMMENT '首次获得MVP的时间',
    `cp_count`      int NULL DEFAULT 0  COMMENT '历史CP数量',
    `last_cp_player_id`   varchar(64) NULL COMMENT '上一个CP的玩家ID',
    `deleted`      int NOT NULL DEFAULT 0  COMMENT '逻辑删除，0未删除，1删除',
    `created_by`    VARCHAR(100) COMMENT '创建人',
    `created_time`  DATETIME NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_by`   VARCHAR(100) COMMENT '更新人',
    `modified_time` DATETIME NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `version`       bigint DEFAULT 1 COMMENT '乐观锁',
    PRIMARY KEY (`id`)
) ;
