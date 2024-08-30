class CartesianPoint {

	private int x;
	private int y;

	public CartesianPoint(int x , int y){
	
		this.x = x;
		this.y = y;
	}

	public CartesianPoint(int a){
		
		this.x = a;
		this.y = a;
	}

	public int getX(){

		return x;
	}
	
	public int getY(){

		return y;
	}

	public void move(int newX , int newY){
		
		this.x = newX;
		this.y = newY;
	}

	public void move(int newV){

		this.x = newV;
		this.y = newV;
	
	}

	public void display(){

		System.out.print("\n Current position : " +x + " " + y);
	}

}

public class TestCartesianPoint{

	public static void main(String[] args){

		CartesianPoint point1 = new CartesianPoint(3,5);
		point1.display();

		point1.move(7,9);
		point1.display();

		point1.move(10);
		point1.display();

      		System.out.print("\n -------------------------------------\n");
		CartesianPoint point2 = new CartesianPoint(2);
		System.out.print("\n X coordinate of point2 :" + point2.getX() );
		System.out.print("\n Y coordinate of point2 :" + point2.getY() );

		
		
	}
}