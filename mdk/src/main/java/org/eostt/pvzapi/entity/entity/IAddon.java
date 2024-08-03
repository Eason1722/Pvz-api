package org.eostt.pvzapi.entity.entity;

import com.badlogic.gdx.graphics.Texture;

/**
 * addon附加，即各类实体的防具，优先扣除防具血量
 */
public interface IAddon  extends IEntity{
    //获得指定血量时的防具贴图
    //在受到伤害时调用
    Texture getTexture(int HP);
}
