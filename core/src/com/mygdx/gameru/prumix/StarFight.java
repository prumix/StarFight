package com.mygdx.gameru.prumix;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.gameru.prumix.screen.impl.MenuScreen;

public class StarFight extends Game {

	@Override
	public void create() {
		setScreen(new MenuScreen());
	}
}
