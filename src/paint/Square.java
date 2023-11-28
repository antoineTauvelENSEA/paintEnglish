package paint;

import java.awt.Color;

public class Square extends Rectangle{
	public Square(int length)
	{
		super (length, length);
	}
	
	public Square (int px, int py, Color c)
	{
		super (px,py,c);
	}
	
	public void setLength(int length)
	{
		super.setLength(length);
		super.setWidth(length);
	}
	public void setWidth(int length)
	{
		super.setLength(length);
		super.setWidth(length);
	}
	
	public void setBoundingBox (int heightBB, int widthBB)
	{
		//super.setWidth(heightBB);
		this.width=heightBB;
		this.length=heightBB;	
	}

}
