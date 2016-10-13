package homework4;
import java.util.Scanner;
public class GuGuDan2 {
	GuGuDan2(){}
	
	void guguCalc(){
		String s;
		System.out.println("###Â¦¼ö´Ü È¦¼ö´Ü Ãâ·ÂÇÏ±â");
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("E:Â¦¼ö´Ü, O:È¦¼ö´Ü(Q:Á¾·á) >> ");
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
