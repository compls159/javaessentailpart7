import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class ����7_2 {
	public static void main(String args[]) {
		ArrayList<String> grade = new ArrayList<String>();
		String c;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ĭ���� �и��Ͽ� 5 ���� ������ �Է�(A/B/C/D/F)>>");
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
					System.out.print("�߸��� �Է� �Դϴ�. ");
					break;
			}
		}
			
		
	}
}
