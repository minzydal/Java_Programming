package Lab02;
public class Task1 {
	
	int dec, bin, oct, hexa; //10����, 2����, 8����, 16����
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
			bin = result + bin; // ��� ���Ѱ��� ���� ���ڿ��� �� �տ� �߰��Ѵ�
			if (dec / 2 == 0) { // ���� dec�� 2�� ���� ���� 0�̸� ����� ���� ���̹Ƿ�
				break;
			}
			// ���� ��� ���� �̹��� ����� 10�������� 2������ ���� ������ �����Ѵ�.
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
			// getHex() 10�̻� ���� �� -> ���ĺ�
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