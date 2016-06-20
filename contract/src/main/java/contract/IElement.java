package contract;

import java.awt.Image;

public interface IElement {

	int getX();

	int getY();
	
	public void setPosition(int x, int y);

	public Permeability getPermeability();

	public ISprite getSprite();

	Image getImage();

}