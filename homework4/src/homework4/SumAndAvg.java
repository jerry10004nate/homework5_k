package homework4;
import java.util.Scanner;
public class SumAndAvg {
	int sum=0;
	int avg=0;
	int cnt=0;
	String num;
	SumAndAvg(){}
	
	void Sum(){
		System.out.println("###입력받은숫자의 합계와 평균 구하기");
	
		while(true){
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자를 입력(Q:종료) >> ");
			num = sc.nextLine();
			if(num.equals("Q"))
				break;
			sum+=Integer.parseInt(num);
			++cnt;
		}
		System.out.printf("합계는 %d이고, 평균은  %.2f입니다.\n",sum,Avg());
	}
	float Avg(){
		return (float)sum/cnt;
	}

}
