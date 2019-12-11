package cn.mlm.mall.kill.service;

/**
 * @Class class file creation author：jakclinsir
 * @DATE 2019/12/3 20:35
 * 秒杀服务层
 */
public interface IKillService {
    Boolean killItem(Integer killId, Integer userId);
    Boolean killItemV2(Integer killId, Integer userId);
    Boolean killItemV3(Integer killId, Integer userId);
    Boolean killItemV4(Integer killId, Integer userId) throws Exception;
    Boolean KillItemV5(Integer killId, Integer userId) throws Exception;
}
