import java.util.Scanner;
import java.util.Vector;
public class 문제7_4 {
	int year_max = 2000;
	public static void main(String[] args) {
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		Vector<Integer> tall = new Vector<Integer>(10);
		Scanner sc = new Scanner(System.in);
		int type;
		int max =0;
		int year = 0;
		System.out.print(">>");
		for(int i =0; i<10; i++) {
			type = sc.nextInt();
			tall.add(type);
		}
		for(int i =0; i<10; i++) {
			int result =0;
			int year_max = 2000;
			if(i < 9) {
				result =  tall.get(i+1) - tall.get(i);
				if(max < result) {
					max = result;
					year = year_max+i;
				}
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 "+year+"년 "+(double)max+"cm");
	}

}
