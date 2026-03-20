package demo2; // 定義程式所在的 package 名稱

public class ProductTest { // 測試類別，用來驗證 Product 的 equals 方法

    public static void main(String[] args) { // 主程式進入點
        
        Product z1 = new Product(); // 建立第一個 Product 物件 z1
        z1.setId(1); // 設定 z1 的 id 為 1
        z1.setName("香蕉"); // 設定 z1 的 name 為 "香蕉"

        Product z2 = new Product(); // 建立第二個 Product 物件 z2
        z2.setId(1); // 設定 z2 的 id 為 1
        z2.setName("香蕉"); // 設定 z2 的 name 為 "香蕉"

        System.out.println(z1.equals(z2)); // 呼叫 equals 方法比較 z1 與 z2，並輸出結果
        // 因為 z1 與 z2 的 id 與 name 都相同，所以 equals 會回傳 true
    }
}
