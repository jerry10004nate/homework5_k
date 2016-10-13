package homework4;
import java.util.Scanner;
public class MaxAndMin {
	int max=0;
	int min=101;
	MaxAndMin(){}
	void MaxMin(){
		System.out.println("###최대값/최소값구하기");
	
		String i;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("숫자를 입력(Q:종료) >> ");
			i = sc.nextLine();
			
			if(i.equals("Q"))
				break;
			else if(Integer.parseInt(i)>=1 && Integer.parseInt(i)<=100){
				if(Integer.parseInt(i)>max)
					max=Integer.parseInt(i);
				else if(Integer.parseInt(i)<min)
					min=Integer.parseInt(i);
			}
			else continue;
		}
		System.out.printf("가장 큰 수는 %d이고, 작은수는 %d입니다.\n",max, min);
		return;
	}
}
