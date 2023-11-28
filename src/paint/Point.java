package paint;

import java.io.*;

public class Point implements Serializable{
	private int X;
	private int Y;
	/**
	* Construct the (a,b) paint.Point
	*
	* @param a point abscissa
	* @param b point ordinate
	*/
	public Point(int a, int b)
	{
		this.X=a;
		this.Y=b;
	}
	
	public Point ()
	{
		this.X=0;
		this.Y=0;
	}
	/**
	* return X coordinate
	*/
	public int getX()
		{ return X;}
	/**
	* return Y coordinate
	*/
	public int getY()
		{ return this.Y;}
}
