package helloworld;

public class Module4 {

	public static void main(String[] args) {
		int[] arr0 = new int[5];//裡面有5筆資料
		double[] arr1 = new double[5];//結果為0.0
		boolean[] arr2 = new boolean[1];//結果為false
		System.out.println(arr0[4]);
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		
		int[] arr = {1,2,3,4};//"int[]"不是基本資料型別，是陣列
		System.out.println("before："+arr[0]);//陣列[]索引值順序從0開始
		arr[0] = 50;//將陣列[]索引值0的位置用50的資料取代
		System.out.println("after："+arr[0]);//顯示結果為50
		
		System.out.println(arr.length);//length為屬性(field)【藍色字體通常都是屬性】
	}
}
