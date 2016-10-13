package homework4;
import java.util.Scanner;
public class SumOfNumbers {
	int sum;
	String num;
	
	SumOfNumbers(){}
	void Sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("###1부터 입력한 수까지 더하기");
		
		while (true) {
			System.out.print("마지막 수를 입력(Q:종료) >>");
			num = sc.nextLine();
			
			if(num.equals("Q"))
				break;
			else {
				for (int i = 1; i <= Integer.parseInt(num); ++i)
					sum += i;
				System.out.printf("총 합은 %d입니다.\n", sum);
			}
			sum=0;
		}
		return;
	}
}
