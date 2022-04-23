package PrimitiveReference;

import java.awt.Point;
import java.util.Date;

public class Primi_Ref {

	public static void main(String[] args) {
		 //Primitive
		int x=20;
		int y=x;
		System.out.println(y);
		
		
		//Reference
		Date current=new Date();
		System.out.println(current);
		
		Point p1 = new Point(x=1, y=1);
		Point p2 = p1;
		p1.x = 2;
		System.out.println(p2);
	}
}
