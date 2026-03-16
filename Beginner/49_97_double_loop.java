package helloworld;

public class Module5_1 {

	public static void main(String[] args) {
//		int i,j;
		
		// 外層迴圈：控制「列」(被乘數)
		// i 從 1 到 9
		for(int i=1; i<10 ; i++) {
			
			// 內層迴圈：控制「欄」(乘數)
			// j 從 1 到 9
			for(int j=1; j<10; j++) {//從內層迴圈開始
				System.out.print(j+"X" + i+"=" +(i*j) +"\t" );
			}
//			for(外層){
//			    for(內層){
//			        執行程式
//			    }
//			}
//			外層1次
//			  內層跑完全部
//			外層第2次
//			  內層再跑完
//			外層 → 控制列
//			內層 → 控制欄
			System.out.println();
		}
	}
}
