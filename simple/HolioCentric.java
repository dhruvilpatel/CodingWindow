package simple;

public class HolioCentric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCenter(0,1);
	}
	// Given start position of e and m
	// return when they will meet/clash
	// e rotation = 365 and m rotation = 687
	public static void getCenter(int e , int m) {
		int cnt = 0;
        while (e % 365 != 0 || m % 687 != 0) {
            e++;
            m++;
            cnt++;
        }
        System.out.println(cnt);
	}
	
}
