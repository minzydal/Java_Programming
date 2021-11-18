package Lab02;
public class Task1 {
	
	int dec, bin, oct, hexa; //10진수, 2진수, 8진수, 16진수
	private int result; //result value
	
	public void printTable() {
		int [][] array = new int [17][4];
		for (int i=0;i<17;i++) {
			
				System.out.print(i);
				System.out.print("   ");
				System.out.print(convertToBin(i));
				System.out.print("   ");
				System.out.print(convertToOct(i));
				System.out.print("   ");
				System.out.print(convertToHex(i));
				System.out.println("   ");
		}
		
		
	}
	
	
	public String convertToBin(int dec) {
		//binary numbers
		String bin = "";
		
		while (true) { 
			result = dec % 2;
			bin = result + bin; // 방금 구한값은 최종 문자열의 맨 앞에 추가한다
			if (dec / 2 == 0) { // 만약 dec를 2로 나눈 몫이 0이면 계산이 끝난 것이므로
				break;
			}
			// 다음 계산 전에 이번에 사용한 10진수값을 2진수로 나눈 몫으로 저장한다.
			dec = dec / 2; 
		}
		
		return bin;
	}
	
	
	public String convertToOct(int dec) {
		//octal numbers
		String oct = "";
		
		while (true) {
			
			result = dec % 8;
			oct = result + oct;
			if (dec / 8 == 0) {
				break;
			} 
    		 dec = dec/8; 
		}
		
		return oct;
	}

	
	public String convertToHex(int dec) {
		//hexadecimal numbers
		
		String hexa = "";
		
		while (true) {
			result = dec % 16;
			// getHex() 10이상 수일 때 -> 알파벳
			hexa = getHex(result) + hexa; // number2 == 1)"0" 2)"10" 3)"010" 4)"1010"
			if (dec / 16 == 0) {
				break;
			}
			dec = dec / 16; // number10 == 1)5 2)2 3) 1
		}	
		return hexa;
	}
	
	static String getHex(int result) { 
		
		String temp; 
		switch (result) {
		case 10:
			temp = "A";
			break;
		case 11:
			temp = "B";
			break;
		case 12:
			temp = "C";
			break;
		case 13:
			temp = "D";
			break;
		case 14:
			temp = "E";
			break;
		case 15:
			temp = "F";
			break;
		default:
			temp = result + "";
		}
		
		return temp;
	}
	
	/*
	 *  Write 4 methods called TriangularPatternX (X = A, B, C, D) 
	 *  that prompts user for the size (a non-negative integer in int); 
	 *  and prints each of the patterns as shown:
	 * */
	
	public void patternA(int d) {
		for(int i = 1; i <= d; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
	
	public void patternB(int d) {
		for(int j = d; j > 0; j--) {
			for(int i = 0; i < j; i++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	int i,j,k;
	public void patternC(int d) {

		for(int i= d; i > 0; i--) {
			for(int j = 0; j < d-i; j++) {
				System.out.print(" ");
			}
			for(k=i;k>0;k--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	
	public void patternD(int d) {
		for(int i= 1; i <=d ; i++) {
			for(int j = d-i; j >0 ;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
	
}