import java.util.Scanner;
import java.util.HashMap;
public class 문제7_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> menu = new HashMap<String,Integer>();
		menu.put("에스프레스",2000);
		menu.put("아메리카노",2500);
		menu.put("카푸치노",3000);
		menu.put("카페라떼",3500);
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼있습니다.");
		while(true) {
			System.out.print("주문>> ");
			String coffee = sc.next();
			if(coffee.equals("그만")) {
				break;
			}
			Integer result1 = menu.get(coffee);
			System.out.println(coffee+"는 "+result1+"입니다.");
			
			
		}
	}	
}
