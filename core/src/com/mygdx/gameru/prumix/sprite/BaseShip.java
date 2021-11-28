package com.mygdx.gameru.prumix.sprite;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.gameru.prumix.math.Rect;

public abstract class BaseShip extends Sprite{

    protected final Vector2 v0 = new Vector2();
    protected final Vector2 v = new Vector2();
    protected Rect worldBounds;

    public BaseShip(TextureRegion region) {
        super(region);

    }

    @Override
    public void update(float delta) {
        super.update(delta);
        this.pos.mulAdd(v,delta);
    }
}
