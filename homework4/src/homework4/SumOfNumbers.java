package homework4;
import java.util.Scanner;
public class SumOfNumbers {
	int sum;
	int num;
	
	SumOfNumbers(){
		sum=0;
		num=0;
	}
	
	void Sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("###1부터 입력한 수까지 더하기");
		System.out.println("마지막 수를 입력(Q:종료) >>");
		num =  sc.nextInt();
		for(int i=1; i<=num; ++i)
			sum+=i;
		System.out.printf("총 합은 %d입니다.",sum);
		return;
	}
}
