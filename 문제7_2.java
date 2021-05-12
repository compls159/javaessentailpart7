import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class 문제7_2 {
	public static void main(String args[]) {
		ArrayList<String> grade = new ArrayList<String>();
		String c;
		Scanner sc = new Scanner(System.in);
		System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		for(int i =0; i<5; i++) {
			c = sc.next();
			grade.add(c);
		}
		Iterator<String> score = grade.iterator();
		while(score.hasNext()) {
			String s = score.next();
			switch(s) {
				case "A":
					System.out.print("4.0 ");
					break;
				case "B":
					System.out.print("3.0 ");
					break;
				case "C":
					System.out.print("2.0 ");
					break;
				case "D":
					System.out.print("1.0 ");
					break;
				case "F":
					System.out.print("0.0 ");
					break;
				default :
					System.out.print("잘못된 입력 입니다. ");
					break;
			}
		}
			
		
	}
}
