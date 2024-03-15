package com.feiniaojin.dddlesson2.dao;

import com.feiniaojin.dddlesson2.entity.PlayerOpe;
import org.springframework.stereotype.Repository;

/**
 * 假设它是一个Mapper，完成数据库持久化
 * 就是MyBatis那套东西
 */
@Repository
public class PlayOpeMapper {
    //从数据库里面查询，Mybatis那套东西

    /**
     * 根据玩家ID获得玩家运营数据
     * @param playerId
     * @return
     */
    public PlayerOpe getByPlayId(String playerId) {
        return null;
    }

    public void insert(PlayerOpe playerOpe) {
        //TODO MyBatis那套东西
    }

    /**
     * 更新CP玩家ID和已组成过CP的总数量
     * @param playerOpe
     */
    public void updateCpIdAndCount(PlayerOpe playerOpe) {

    }

    /**
     * 更新首次获得MVP的时间
     * @param playerOpe
     */
    public void updateFirstMvpTime(PlayerOpe playerOpe) {

    }
}
