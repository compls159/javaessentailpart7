package �ǽ�1;

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
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		System.out.println("�ý��� ����...");
	}
	public int selectMenu() {
		System.out.print("�� ���� �Է�(1), �� ���� ��ȸ(2), ����(3)>>");
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
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
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
			System.out.println("�������� �ʴ� ���� �Դϴ�.");
		}
	}
	public static void main(String[] args) {
		CustomerManager cm = new CustomerManager();
		cm.Run();
		
	}
}