package helloworld;

public class Module5_1 {

	public static void main(String[] args) {
//		int i,j;
		for(int i=1; i<10 ; i++) {//從1+到9
			for(int j=1; j<10; j++) {//從內層迴圈開始
				System.out.print(j+"X" + i+"=" +(i*j) +"\t" );
			}//1x1、2x1、3x1....
			System.out.println();
		}

	}

}
