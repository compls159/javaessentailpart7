import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;
public class 문제7_1 {

	public static void main(String[] args) {
		Vector<Double> num = new Vector<Double>(5);
		double num1;
		double max =0;
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			num1 = sc.nextDouble();
			num.add(num1);
		}
		Iterator<Double> big = num.iterator();
		while(big.hasNext()) {
			double num2 = big.next();
			if(max < num2)
				max = num2;
		}
		System.out.print("가장 큰 수는 "+max);
	}

}
