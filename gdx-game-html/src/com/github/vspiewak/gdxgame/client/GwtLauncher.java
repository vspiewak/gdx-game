package com.github.vspiewak.gdxgame.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.github.vspiewak.gdxgame.DropGame;

public class GwtLauncher extends GwtApplication {
	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(800, 480);
		return cfg;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new DropGame();
	}
}