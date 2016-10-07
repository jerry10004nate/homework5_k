package homework4;
import java.util.Scanner;
public class SumAndAvg {
	int num=0;
	int sum=0;
	int avg=0;
	int cnt=0;
	SumAndAvg(){}
	
	void Sum(){
		System.out.println("###입력받은숫자의 합계와 평균 구하기");
		int num;		
		while(true){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자를 입력(Q:종료) >> ");
			num = sc.nextInt();
			if(num=='Q')
				break;
			sum+=num;
			++cnt;
		}
		System.out.printf("합계는 %d이고, ",sum);
	}
	void Avg(){
		System.out.printf("평균은  %.2f입니다", sum/cnt);
	}

}
