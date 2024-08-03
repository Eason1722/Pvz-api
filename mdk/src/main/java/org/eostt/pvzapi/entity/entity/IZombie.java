package org.eostt.pvzapi.entity.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * zombie僵尸是pvz中的攻击方
 * 动画为客户端（client）特有
 */
public interface IZombie extends IEntity{
    //获得僵尸一个行走动画需要多少帧
    byte getMaxMoveCircle();
    //移动动画
    //origin是僵尸贴图最右下角
    void move(int tick, int[] origin, SpriteBatch batch,int HP);
    //受伤动画
    void hurt(int HP,SpriteBatch batch);
    //死亡动画
    void dead(SpriteBatch batch);
    //攻击动画
    void attack(SpriteBatch batch,int hurtHP);
    //移速
    int getSpeed();
    //单次攻击扣血
    int getOnceHPlost();
}
