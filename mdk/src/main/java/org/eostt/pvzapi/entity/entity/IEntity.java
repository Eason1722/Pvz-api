package org.eostt.pvzapi.entity.entity;

/**
 * 所有实体的父接口
 */
public interface IEntity {
    //最大血量
    int getMaxHP();
    //未本地化名称，通过i18n显示语言
    String getUnlocalizeName();
}
