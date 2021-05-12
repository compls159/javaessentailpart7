package �ǽ�2;
import java.util.*;
public class ScoreManager {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> stul = new ArrayList<Student>();
	public void Run() {
			int choice = 0;
			while((choice = selectMenu()) != 4){
			switch(choice) {
			case 1:
				addstu();
				break;
			case 2:
				searchstu();
				break;		
			case 3:
				deletestu();
				break;
			default:
				System.out.println("�߸��� �Է�");
				break;
			}
		}
		System.out.println("�ý��� ����");
		liststu();
	}
	public int selectMenu() {
		int select;
		System.out.print("�����Է�(1), ���� ��ȸ(2), ���� ����(3), ����(4)>>");
		select = sc.nextInt();
		return select;
	}
	public void addstu() {
		String num;
		String name;
		int s1;
		int s2;
		int s3;
		int s4;
		double sum = 0; 
		char grade;
		System.out.print("�й�:");
		num = sc.next();
		System.out.print("�̸�:");
		name = sc.next();
		System.out.print("�⼮����:");
		s1 = sc.nextInt();
		System.out.print("�ǽ�����:");
		s2 = sc.nextInt();
		System.out.print("�߰����:");
		s3 = sc.nextInt();
		System.out.print("�⸻���:");
		s4 = sc.nextInt();
		Student stu = new Student(s1,s2,s3,s4);
		sum = stu.Avg();
		System.out.println("���� :"+sum);
		grade = stu.grade(sum);
		System.out.println("���� :"+ grade);
		Student stu1 = new Student(num,name,s1,s2,s3,s4,sum,grade);
		stul.add(stu1);
	}
	public void searchstu() {
		boolean logic = false;
		System.out.print("�й� �Է��ϼ��� >> ");
		String num = sc.next();
		Student st = new Student(null,null,0, 0, 0, 0,0);
		for (int i = 0; i < stul.size(); i++) {
            if (stul.get(i).setnum().equals(num)) {
            	st = stul.get(i);
            	logic = true;
            	break;
            }
		}
		if(logic) {
				double  sum = st.Avg();
				System.out.println("�й� : " + st.setnum());
				System.out.println("�̸� : " + st.setname());
				System.out.println("�⼮ ���� : " + st.sets1());
				System.out.println("�ǽ� ���� : " + st.sets2());
				System.out.println("�߰� ��� : " + st.sets3());
				System.out.println("�⸻ ��� : " + st.sets4());
				System.out.println("���� : " + st.Avg());
				System.out.println("���� : " + st.grade(sum));
				System.out.println("�ִ� ���� : " + st.max());
				System.out.println("�ּ� ���� : " + st.min());
		}
		else {
			System.out.println("�й��� �������� �ʽ��ϴ�.");
		}
			
}
		
	public void deletestu() {
		System.out.print("������ �й��� �Է��ϼ��� >>");
		String num = sc.next();
		for(int i=0; i<stul.size(); i++) {
			if(stul.get(i).setnum().equals(num)) {
				stul.remove(i);
				System.out.println("���� �Ϸ�Ǿ����ϴ�.");
				return ;
			}
			
		}
		System.out.println("�����ϴ� �й��� �����ϴ�.");	
	}
	public void liststu() {
		for(Student stu : stul) {
			double sum = stu.Avg();
			System.out.println("�й� : " + stu.setnum());
			System.out.println("�̸� : " + stu.setname());
			System.out.println("�⼮ ���� : " + stu.sets1());
			System.out.println("�ǽ� ���� : " + stu.sets2());
			System.out.println("�߰� ��� : " + stu.sets3());
			System.out.println("�⸻ ��� : " + stu.sets4());
			System.out.println("���� : " + stu.Avg());
			System.out.println("���� : " + stu.grade(sum));
			System.out.println("�ִ� ���� : " + stu.max());
			System.out.println("�ּ� ���� : " + stu.min());
		}
	}
	public static void main(String [] args) {
		ScoreManager sm = new ScoreManager();
		sm.Run();
	}
}
