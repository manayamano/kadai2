package kadai2;
import java.util.Scanner;

public class Kadai2 {

	public static void main(String[] args) {
		System.out.println("アラビア数字を入力してください。");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(roma(num));

	}

	private static String roma(int n){

		String result="";

		if(n>=1 && n<=20){
			if(n>=10){
				result="X";
				n=n-10;
			}
			if(n<=3){
				for (int i=0; i<n; i++){
					result=result+"I";
				}
			}else if(n==4){
				result=result+"IV";
			}else if(n<=8){
				result=result+"V";
				n=n-5;
				for (int i=0; i<n; i++){
					result=result+"I";
				}
			}else if(n==9){
				result=result+"IX";
			}else if(n==10){
				result=result+"X";
			}
		}else{
			result="変換できません";
		}

		return result;
	}

}
