package ½Ç½À2;

public class Student {
	String num;
	String name;
	int sc1;
	int sc2;
	int sc3;
	int sc4;
	int max;
	int min;
	double sum;
	char grade;
	public Student (int sc1,int sc2, int sc3, int sc4) {
		this.sc1 = sc1;
		this.sc2 = sc2;
		this.sc3 = sc3;
		this.sc4 = sc4;
	}
	public Student (String num, String name, int sc1,int sc2,int sc3,int sc4,double sum) {
		this.num =num;
		this.name =name;
		this.sc1 = sc1;
		this.sc2 = sc2;
		this.sc3 = sc3;
		this.sc4 = sc4;
		this.sum = sum;
		
	}
	public Student (String num, String name, int sc1,int sc2,int sc3,int sc4,double sum, char grade) {
		this.num =num;
		this.name =name;
		this.sc1 = sc1;
		this.sc2 = sc2;
		this.sc3 = sc3;
		this.sc4 = sc4;
		this.sum = sum;
		this.grade = grade;
	}
	public String setnum() {
		return num;
	}
	public String setname() {
		return name;
	}
	public int sets1() {
		return sc1;
	}
	public int sets2() {
		return sc2;
	}
	public int sets3() {
		return sc3;
	}
	public int sets4() {
		return sc4;
	}
	public double Avg() {
		sum = sc1*0.1 + sc2*0.3 + sc3*0.3+sc4*0.3;
		return sum;
	}
	public char grade(double sum) {
		if(sum >= 90 && sum <= 100)
			return 'A';
		else if(sum >=80 && sum <90)
			return 'B';
		else if(sum >=70 && sum <80)
			return 'C';
		else if(sum >=60 && sum <70)
			return 'D';
		return 'F';
		
	}
	public int max() {
		int []scores = new int[]{sc1,sc2,sc3,sc4};
		int max =0 ;
		for(int i =0; i<scores.length; i++) {
			if(max < scores[i])
				max = scores[i];
		}
		return max;
	}
	public int min() {
		int []scores = new int[]{sc1,sc2,sc3,sc4};
		int min =100 ;
		for(int i =0; i<scores.length; i++) {
			if(min > scores[i])
				min = scores[i];
		}
		return min;
	}
}
