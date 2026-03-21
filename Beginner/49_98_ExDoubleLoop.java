package helloworld;

public class ExDoubleLoop {
	//      "順序" array-->index.data
	//		for(int i = 0; i<alength; i++)
	//		(0~a.length-1)-->index的range，a[i]=值，[i]外層
	public static void main(String[] args) {
    	// 使用二維表格方式顯示 a 與 b 的乘法結果
    	// a 當作「欄 (column)」
    	// b 當作「列 (row)」
		int[] a= {1,2,3};// 宣告陣列 a，包含 1,2,3 (這列速度快)
		int[] b= {4,5,6,7};// 宣告陣列 b，包含 4,5,6,7 (這列速度慢)
		
		System.out.print("a\\b\t"); // 印出表格左上角標題，\t 是 tab，用來讓輸出對齊
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t"); // 印出 a 陣列的元素，作為表格的欄位標題
			}
		System.out.println(); // 換行，開始印表格內容
		for (int i = 0; i < b.length; i++) { // 外層迴圈：控制 b 陣列 (每一列)
			System.out.print(b[i]+"\t"); // 先印出目前列的 b[i] 值
			for (int j = 0; j < a.length; j++) { // 內層迴圈：控制 a 陣列 (每一欄)
				System.out.print((a[j]*b[i])+"\t"); // 計算 a[j] * b[i] 的乘積，並印出結果
				}
			System.out.println();// 每算完一列後換行
			}
		}
	}
