package advanced;

public class Array1 {

	public static void main(String[] args) {
		int[][] array = new int[5][3];
		array[0][0] = 7;
		array[0][1] = 8;
		array[0][2] = 9;
		// System.out.println(array[0][2]);
		int[][] array2 = { 
				 		 {1, 2, 3, 4},
				 		 {5, 6},
				 		 {7, 8, 9, 10, 11, 15}
						 };
		int[] arr = array2[2];
		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + ",");
			}
			System.out.println();
		}
	}
}
