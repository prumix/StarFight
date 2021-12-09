package com.mygdx.gameru.prumix.sprite.impl;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.gameru.prumix.math.Rect;
import com.mygdx.gameru.prumix.screen.impl.GameScreen;
import com.mygdx.gameru.prumix.sprite.BaseButton;

public class NewGameButton extends BaseButton {
    private static final float HEIGHT = 0.05f;
    private static final float TOP_MARGIN = -0.05f;

    private final GameScreen gameScreen;

    public NewGameButton(TextureAtlas atlas, GameScreen gameScreen) {
        super(atlas.findRegion("button_new_game"));
        this.gameScreen = gameScreen;
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setTop(TOP_MARGIN);
    }

    @Override
    public void action() {
        gameScreen.startNewGame();
    }
}
