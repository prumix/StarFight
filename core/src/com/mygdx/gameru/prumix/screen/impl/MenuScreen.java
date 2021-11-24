package com.mygdx.gameru.prumix.screen.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.gameru.prumix.math.Rect;
import com.mygdx.gameru.prumix.screen.BaseScreen;
import com.mygdx.gameru.prumix.sprite.impl.Background;

public class MenuScreen extends BaseScreen {

    private final float V_LEN = 2f;

    private Texture bg;
    private Vector2 pos;
    private Background background;


    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        pos = new Vector2();
        background = new Background(bg);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        background.draw(batch);
        batch.end();

    }

    @Override
    public void dispose() {
        super.dispose();
        bg.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        pos.set(touch);
        return super.touchDown(touch, pointer, button);
    }
}