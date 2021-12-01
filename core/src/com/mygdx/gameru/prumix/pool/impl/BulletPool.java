package com.mygdx.gameru.prumix.pool.impl;


import com.mygdx.gameru.prumix.pool.SpritesPool;
import com.mygdx.gameru.prumix.sprite.impl.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
