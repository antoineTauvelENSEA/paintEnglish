package paint;

import java.awt.*;
import java.io.*;

public abstract class Figure implements Serializable{
	protected Point origin;
	protected Color c;
	

	public Figure (Point p)
	{
			this.origin=p;
	}

	public Figure (Point p, Color col)
	{
			this.origin=p;
			this.c=col;
	}
	
	public String toString ()
	{
		return "A figure that starts in ("+origin.getX()+
				", "+origin.getY()+")";
	}
	
	public abstract int getPerimeter();
	public abstract int getSurface();
	public abstract void setBoundingBox (int heightBB, int widthBB);
	public abstract void draw (Graphics g); 
 
 }
