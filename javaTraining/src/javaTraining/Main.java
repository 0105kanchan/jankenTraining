package javaTraining;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("グーなら１、チョキなら２、パーなら３を入力してください。");
		System.out.println("Aの番です。");
		int a = scanner.nextInt();
		System.out.println("Bの番です。");
		int b = scanner.nextInt();
		
		if((a==1 && b==2) || (a==2 && b==3) || (a==3 && b==1) ){ 
			System.out.println("Aの勝利!");
		}else if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2)){
			System.out.println("Bの勝利!");
		}else if((a==b)&&(1<=a && a<=3)) {
			System.out.println("あいこ!");
		}else{
			System.out.println("1,2,3のどれかを入力してください。");
		}
	}
}