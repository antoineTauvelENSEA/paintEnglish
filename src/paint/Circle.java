package paint;

import java.awt.Color;

public class Circle extends Ellipse{
	
	public Circle (int radius)
	{
		super (radius, radius);
	}
	
	public Circle (int px, int py, Color c)
	{
		super (px,py,c);
	}
	
	public void setBoundingBox (int heightBB, int widthBB)
	{
		this.semiAxysX=heightBB/2;
		this.semiAxysY=heightBB/2;	
	}


	public void setSemiAxysX(int radius)
	{
		super.setSemiAxysX (radius);
		super.setSemiAxysY (radius);
	}
	
	public void setSemiAxysY(int radius)
	{
		super.setSemiAxysX (radius);
		super.setSemiAxysY (radius);
	}
}
