package simple;

public class CheckIfPointInsideTriangle {

	public static int foundInBermudatriangle(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py, int bx, int by) {
        boolean plane = false;
        boolean boat = false;
    if (isInside(x1, y1, x2, y2, x3, y3, px, py))
        plane = true;
    if (isInside(x1, y1, x2, y2, x3, y3, bx, by))
        boat = true;
        
        if(plane && boat)
            return 3;
        else if(plane)
            return 1;
        else if(boat)
            return 2;
        else
            return 4;
    
    }

public static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int px, int py)
	{   
	   /* Calculate area of triangle ABC */
	   float A = area (x1, y1, x2, y2, x3, y3);
	 
	   /* Calculate area of triangle PBC */  
	   float A1 = area (px, py, x2, y2, x3, y3);
	 
	   /* Calculate area of triangle PAC */  
	   float A2 = area (x1, y1, px, py, x3, y3);
	 
	   /* Calculate area of triangle PAB */   
	   float A3 = area (x1, y1, x2, y2, px, py);
	   
	   /* Check if sum of A1, A2 and A3 is same as A */
	   return (A == A1 + A2 + A3);
	}
public static float area(int x1, int y1, int x2, int y2, int x3, int y3)
	{
	   return (float) Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
	public static void main(String args[]){
		int a = foundInBermudatriangle(0, 0, 20, 0, 10, 30, 10, 15, 10, 15);
			System.out.println(String.valueOf(a));
	}
}
