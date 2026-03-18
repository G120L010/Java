package advanced;

public class Array2 {

	public static void main(String[] args) {
		int[][] array = new int[5][3];
		array[0][0] = 7;
		array[0][1] = 8;
		array[0][2] = 9;
		// System.out.println(array[0][2]);
		int[][] array2 = {  { 1, 2, 3, 4 },
							{ 5, 6 },
							{ 7, 8, 9, 10, 11, 15 } };
		for (int[] is : array2) {
			for (int i : is) {
				System.out.print(i + ",");
			}
			System.out.println();
		}

	}

}
