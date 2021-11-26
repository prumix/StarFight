package com.mygdx.gameru.prumix.sprite.impl;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.gameru.prumix.math.Rect;
import com.mygdx.gameru.prumix.sprite.Sprite;

public class Logo extends Sprite {
    private final float V_LEN =0.01f;
    private Vector2 v;
    private Vector2 touch;

    public Logo(Texture texture) {
        super(new TextureRegion(texture));
        v = new Vector2();
        this.touch = new Vector2();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.15f);

    }

    @Override
    public void update(float delta) {
        super.update(delta);
        if (touch.dst(pos) >= V_LEN){
            pos.add(v);
        }
        else {
            pos.set(touch);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        this.touch.set(touch);
        v.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return false;
    }

     

}
