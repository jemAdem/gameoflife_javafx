package de.codermaz.coderetreat.gameoflife.gui;

import com.airhacks.afterburner.views.FXMLView;

import java.util.function.Function;


public class GameOfLifeView extends FXMLView
{
	public GameOfLifeView()
	{
	}

	public GameOfLifeView(Function<String, Object> injectionContext)
	{
		super( injectionContext );
	}
}
