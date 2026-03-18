package advanced;
/* Array2 類別：示範二維陣列的建立與走訪*/
public class Array2 {

    public static void main(String[] args) {

        // 宣告一個 5x3 的二維陣列（5 列，每列 3 個元素）
        int[][] array = new int[5][3];

        // 指定第一列（index 0）的值
        array[0][0] = 7;
        array[0][1] = 8;
        array[0][2] = 9;

        // 取得某個元素（這行目前被註解掉）
        // System.out.println(array[0][2]);

        // 宣告一個「不規則（Jagged Array）」的二維陣列
        // 每一列的長度可以不同
        int[][] array2 = {
                            { 1, 2, 3, 4 },           // 第 0 列（長度 4）
                            { 5, 6 },                 // 第 1 列（長度 2）
                            { 7, 8, 9, 10, 11, 15 }  // 第 2 列（長度 6）
                         };

        // 使用增強型 for 迴圈（for-each）走訪二維陣列
        for (int[] is : array2) {   // 每次取出一整列（row）
            for (int i : is) {     // 走訪該列中的每個元素
                System.out.print(i + ","); // 印出元素並加逗號
            }
            System.out.println();  // 每列印完換行
        }
    }
}
