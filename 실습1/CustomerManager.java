package 실습1;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerManager{
	Scanner sc = new Scanner(System.in);
	HashMap<String, customer> man = new HashMap<String, customer>();
	public void Run() {
		int key;
		while((key = selectMenu())!= 3) {
			switch(key) {
			case 1: 
				addcus();
				break;
			case 2:
				listcus();
				break;
			default :
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println("시스템 종료...");
	}
	public int selectMenu() {
		System.out.print("고객 정보 입력(1), 고객 정보 조회(2), 종료(3)>>");
		int key = sc.nextInt();
		return key;
	}
	void addcus() {
		String name;
		String phone;
		int point;
		name = sc.next();
		phone = sc.next();
		point = sc.nextInt();
		if(man.containsKey(name)) {
			System.out.println("이미 존재하는 고객명입니다.");
			return ;
		}
		else {
			customer cus = new customer(name,phone,point);
			man.put(name, cus);
		}
	}
	void listcus() {
		String name;
		name = sc.next();
		if(man.containsKey(name)) {
			customer cus = man.get(name);
			System.out.println(cus.toString());
			return ;
		}
		else {
			System.out.println("존재하지 않는 고객명 입니다.");
		}
	}
	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		cm.Run();
		
	}
}