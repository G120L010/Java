package helloworld;
//swing是介面
import javax.swing.JOptionPane; // 引用工具：JOptionPane 是 Java 提供的視窗對話框類別

public class MyJOptionPane {

    public static void main(String[] args) {
        
        // --- 情況 1：建立輸入對話框 ---
        // JOptionPane.showInputDialog("請輸入");
        // 1. 會跳出一個小視窗，顯示提示文字「請輸入」
        // 2. 使用者可以在視窗中輸入文字
        // 3. 輸入的文字會以字串 (String) 型態回傳
        String input = JOptionPane.showInputDialog("請輸入");
        
        // --- 情況 2：輸出結果 ---
        // System.out.println(input);
        // 1. 把剛剛在視窗中輸入的文字顯示在主控台 (Console)
        // 2. 這樣就能觀察使用者輸入的內容
        System.out.println(input);

    }
}
