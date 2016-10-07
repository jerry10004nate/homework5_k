package homework4;
import java.util.Scanner;
public class MaxAndMin {
	int max;
	int min;
	MaxAndMin(){
		max=0;
		min=100;
	}
	void MaxMin(){
		System.out.println("###최대값/최소값구하기");
	
		int i;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("숫자를 입력(Q:종료) >> ");
			i = (int)sc.nextInt();
			if(i==113)
				break;
			else if(i>=0 && i<=100){
				if(i>max)
					max=i;
				else if(i<min)
					min=i;
			}
			else continue;
		}
		System.out.printf("가장 큰 수는 %d이고, 작은수는 %d입니다.",max, min);
		return;
	}
}
