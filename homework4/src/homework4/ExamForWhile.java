package homework4;
import java.util.Scanner;
public class ExamForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.1부터 입력한 수까지 더하기");
		System.out.println("2. 최대값/최소값구하기");
		System.out.println("3. 입력받은 숫자의 합곙화 평균구하기");
		System.out.println("4. 원하는 구구단 출력하기");
		System.out.println("5. 짝수단/홀수단 출력하기");
		System.out.println("6. 종요하기");
		System.out.println("원하는 메뉴는 >>");
		int select =sc.nextInt();
		
		if(select==1){
			SumOfNumbers sumNum = new SumOfNumbers();
			sumNum.Sum();
		}
		else if(select==2){
			MaxAndMin maxmin = new MaxAndMin();
			maxmin.MaxMinCalc();
		}
		else if(select==3){
			SumAndAvg sumAvg = new SumAndAvg();
			sumAvg.avg();
		}
		else if(select==4){
			GuGuDan gugu = new GuGuDan();
			gugu.guguCalc();
		}
		else if(select==5)
			GuGUDan2 gugu2 = new GuGuDan();
		else if(select==6)
			return;
	}

}
