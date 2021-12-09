package com.mygdx.gameru.prumix.pool.impl;

import com.badlogic.gdx.audio.Sound;
import com.mygdx.gameru.prumix.math.Rect;
import com.mygdx.gameru.prumix.pool.SpritesPool;
import com.mygdx.gameru.prumix.sprite.impl.EnemyShip;


public class EnemyPool extends SpritesPool<EnemyShip> {

    private final ExplosionPool explosionPool;
    private final BulletPool bulletPool;
    private final Sound bulletSound;
    private final Rect worldBounds;

    public EnemyPool(ExplosionPool explosionPool, BulletPool bulletPool, Sound bulletSound, Rect worldBounds) {
        this.explosionPool = explosionPool;
        this.bulletPool = bulletPool;
        this.bulletSound = bulletSound;
        this.worldBounds = worldBounds;
    }

    @Override
    protected EnemyShip newObject() {
        return new EnemyShip(explosionPool, bulletPool, bulletSound, worldBounds);
    }
}
