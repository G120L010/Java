package helloworld;

import javax.swing.JOptionPane;

public class Myif_else {//條件判斷式

    public static void main(String[] args) {
        // 1. 用 JOptionPane.showInputDialog() 建立輸入視窗，提示使用者輸入年齡
        String asgString = JOptionPane.showInputDialog("請輸入年齡");

        // 2. 因為輸入的是字串 (String)，要用 Integer.valueOf() 轉成 int 型態
        int age = Integer.valueOf(asgString);

        // 3. 使用 if-else 判斷
        //    條件：age >= 18
        //    如果成立 → 輸出 "成年"
        //    否則 → 輸出 "未成年"
        if (age >= 18) {
            System.out.println("成年");
        } else {
            System.out.println("未成年");
        }
    }
}
//語意：如果是(...)的狀態下就{......}其他狀況下就{......}
//如果if後面只有單一敘述，可以省略{}
//風格如下：
// if (age >= 18) System.out.println("成年");
// else System.out.println("未成年");
