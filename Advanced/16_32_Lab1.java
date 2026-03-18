package advanced;

public class Lab1 {

	public static void main(String[] args) {
		int[][] q = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int[][] ans = new int[q[0].length][q.length];

		for (int i = 0; i < q.length; i++) {
			for (int j = 0; j < q[i].length; j++) {
				ans[j][i] = q[i][j];
			}
		}
		for (int[] is : ans) {
			for (int i : is) {
				System.out.print(i + ",");
			}
			System.out.println();
		}

	}
}
