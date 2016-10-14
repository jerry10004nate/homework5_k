package homework4;
import java.util.Scanner;
public class GuGuDan2 {
	GuGuDan2(){}
	
	void guguCalc(){
		String s;
		System.out.println("###¦���� Ȧ���� ����ϱ�");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("E:¦����, O:Ȧ����(Q:����) >> ");
			s = sc.nextLine();
			
			if(s.equals("E")){
				for(int i=1; i<10; ++i){
					for(int j=2; j<10; j+=2)
						System.out.printf("%d * %d = %d    ", j , i , j*i);
					System.out.println();
				}
			}
			else if(s.equals("O")){
				for(int i=1; i<10; ++i){
					for(int j=3; j<10; j+=2)
						System.out.printf("%d * %d = %d    ", j, i, j*i);
					System.out.println();
				}
			}
			else if(s.equals("Q"))
				break;
		}
	}
}
