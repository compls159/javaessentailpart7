import java.util.Scanner;
import java.util.HashMap;
public class ����7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> menu = new HashMap<String,Integer>();
		menu.put("����������",2000);
		menu.put("�Ƹ޸�ī��",2500);
		menu.put("īǪġ��",3000);
		menu.put("ī���",3500);
		System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī����ֽ��ϴ�.");
		while(true) {
			System.out.print("�ֹ�>> ");
			String coffee = sc.next();
			if(coffee.equals("�׸�")) {
				break;
			}
			Integer result1 = menu.get(coffee);
			System.out.println(coffee+"�� "+result1+"�Դϴ�.");
			
			
		}
	}	
}
