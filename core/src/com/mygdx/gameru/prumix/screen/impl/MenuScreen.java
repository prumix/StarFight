package com.mygdx.gameru.prumix.screen.impl;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.gameru.prumix.math.Rect;
import com.mygdx.gameru.prumix.screen.BaseScreen;
import com.mygdx.gameru.prumix.sprite.impl.Background;
import com.mygdx.gameru.prumix.sprite.impl.Logo;

public class MenuScreen extends BaseScreen {

    private Texture bg;
    private Texture lg;

    private Background background;
    private Logo logo;


    @Override
    public void show() {
        super.show();
        lg = new Texture("badlogic.jpg");
        bg = new Texture("textures/bg.png");
        background = new Background(bg);
        logo = new Logo(lg);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
        logo.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
       update(delta);
       draw();

    }
    @Override
    public void dispose() {
        super.dispose();
        bg.dispose();
        lg.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        logo.touchDown(touch,pointer,button);
        return false;
    }

    private void update(float delta) {
        logo.update(delta);
    }

    private void draw(){
        batch.begin();
        background.draw(batch);
        logo.draw(batch);
        batch.end();
    }
}