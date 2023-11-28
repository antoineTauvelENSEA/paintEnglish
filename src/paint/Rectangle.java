package paint;

import java.awt.*;

public class Rectangle extends Figure {
	
	/**
	* rectangle length 
	*/
	protected int length;
	/**
	* rectangle width
	*/
	protected int width; 

	public Rectangle (Point p)
	{
		super(p);
	}

	public Rectangle (int px, int py, Color c)
	{
		super(new Point(px,py),c);
		this.length=0;
		this.width=0;
	}

	public Rectangle (int w, int l)
	{
		super (new Point());
		this.width=w;
		this.length=l;
	}
	
	public void setBoundingBox (int heightBB, int widthBB)
	{
		this.width=widthBB;
		this.length=heightBB;	
	}
	
	public void draw (Graphics g)
	{
		int realPx, realPy; // To consider negative case
		
		if (length<0) {realPx=origin.getX()+length;}
		else {realPx=origin.getX();}

		if (width<0) {realPy=origin.getY()+width;}
		else {realPy=origin.getY();}

		g.setColor(c);
		g.fillRect(realPx, realPy, Math.abs(length), Math.abs(width));
	}
	
	public int getPerimeter()
	{	return (this.length+this.width)*2;}
	public int getSurface()
	{	return this.length*this.width;}
	public int getLength()
	{	return this.length;}
	public int getWidth()
	{	return this.width;}
	public void setLength (int l)
	{	this.length=l;}
	public void setWidth (int w)
	{	this.width=w;} 
	
	public String toString ()
	{
			String s = "+";
			for (int i=0;i<length;i++) s=s+"--";
			s += "+\n";
			
			for (int j=0; j <width;j++) 
			{
			s+="|";
			for (int i=0;i<length;i++) s=s+"  ";
			s+="|\n";
			}
			
			s+="+";
			for (int i=0;i<length;i++) s=s+"--";
			s += "+\n";
			return s;
	}
	
}
