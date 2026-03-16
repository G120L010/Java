package helloworld;

public class Module_break {

	public static void main(String[] args) {

		// z 是「標籤語法(label)」
		// 可以讓 break 或 continue 指定要控制哪一層迴圈
		z: for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				// 當 j 等於 5 時
				if (j == 5) {

					// break z 代表跳出標籤 z 的迴圈
					// 也就是直接結束整個外層 for 迴圈
					break z;

					// 如果改成
					// continue z;
					// 會跳到外層迴圈下一次循環
				}
				// 印出乘法
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			// 每一列換行
			System.out.println();
		}
	}
}
