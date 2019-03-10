package primitives;

public class Point2D{
	Coordinate _x;
	Coordinate _y;
	
	//Constructors
	//Empty constructor
	public Point2D(){
//		_x = Coordinate();
//		_y = Coordinate();
	}
		
	//Parameterized constructor
	public Point2D(Coordinate x, Coordinate y){
		_x = x;
		_y = y;
	}
	
	//Copy constructor
	public Point2D(Point2D other){
		_x = other._x;
		_y = other._y;
	}
	
	//Getters
	public Coordinate getX(){
		return _x;
	}
	
	public Coordinate getY(){
		return _y;
	}
	//Setters
	public void setX(Coordinate x){
		_x = x;
	}

	public void setY(Coordinate y){
		_y = y;
	}
}