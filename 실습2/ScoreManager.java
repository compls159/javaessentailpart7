package 실습2;
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
				System.out.println("잘못된 입력");
				break;
			}
		}
		System.out.println("시스템 종료");
		liststu();
	}
	public int selectMenu() {
		int select;
		System.out.print("성적입력(1), 성적 조회(2), 성적 삭제(3), 종료(4)>>");
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
		System.out.print("학번:");
		num = sc.next();
		System.out.print("이름:");
		name = sc.next();
		System.out.print("출석점수:");
		s1 = sc.nextInt();
		System.out.print("실습과제:");
		s2 = sc.nextInt();
		System.out.print("중간고사:");
		s3 = sc.nextInt();
		System.out.print("기말고사:");
		s4 = sc.nextInt();
		Student stu = new Student(s1,s2,s3,s4);
		sum = stu.Avg();
		System.out.println("총점 :"+sum);
		grade = stu.grade(sum);
		System.out.println("학점 :"+ grade);
		Student stu1 = new Student(num,name,s1,s2,s3,s4,sum,grade);
		stul.add(stu1);
	}
	public void searchstu() {
		boolean logic = false;
		System.out.print("학번 입력하세요 >> ");
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
				System.out.println("학번 : " + st.setnum());
				System.out.println("이름 : " + st.setname());
				System.out.println("출석 점수 : " + st.sets1());
				System.out.println("실습 과제 : " + st.sets2());
				System.out.println("중간 고사 : " + st.sets3());
				System.out.println("기말 고사 : " + st.sets4());
				System.out.println("총점 : " + st.Avg());
				System.out.println("학점 : " + st.grade(sum));
				System.out.println("최대 점수 : " + st.max());
				System.out.println("최소 점수 : " + st.min());
		}
		else {
			System.out.println("학번이 존재하지 않습니다.");
		}
			
}
		
	public void deletestu() {
		System.out.print("삭제할 학번을 입력하세요 >>");
		String num = sc.next();
		for(int i=0; i<stul.size(); i++) {
			if(stul.get(i).setnum().equals(num)) {
				stul.remove(i);
				System.out.println("삭제 완료되었습니다.");
				return ;
			}
			
		}
		System.out.println("존재하는 학번이 없습니다.");	
	}
	public void liststu() {
		for(Student stu : stul) {
			double sum = stu.Avg();
			System.out.println("학번 : " + stu.setnum());
			System.out.println("이름 : " + stu.setname());
			System.out.println("출석 점수 : " + stu.sets1());
			System.out.println("실습 과제 : " + stu.sets2());
			System.out.println("중간 고사 : " + stu.sets3());
			System.out.println("기말 고사 : " + stu.sets4());
			System.out.println("총점 : " + stu.Avg());
			System.out.println("학점 : " + stu.grade(sum));
			System.out.println("최대 점수 : " + stu.max());
			System.out.println("최소 점수 : " + stu.min());
		}
	}
	public static void main(String [] args) {
		ScoreManager sm = new ScoreManager();
		sm.Run();
	}
}
