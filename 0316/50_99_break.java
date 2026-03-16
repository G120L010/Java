package helloworld;

public class Module_break {

	public static void main(String[] args) {
		
		z:for(int i=1; i<10; i++) {
//		標籤語法:for(int i=1; i<10; i++) {
			for(int j = 1; j<10 ;j++) {
				if(j == 5) {
					break z;//跳出，直接結束迴圈
//					continue 標籤語法;//迴圈結束一次循環
				}
				System.out.print(j+"X" + i+"=" + (i*j) + "\t");
			}
			System.out.println();
		}

	}

}
