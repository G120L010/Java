package helloworld;

public class MyPrintOrPrintln {//練習輸出

    public static void main(String[] args) {
        // --- 情況 1：println ---
        // 特色：印出文字後，會自動「換行」。
        System.out.println("A"); // 印出 A，並換到下一行

        // --- 情況 2：print ---
        // 特色：印出文字後，不會換行，下一次輸出會接在同一行。
        System.out.print("A"); // 印出 A，不換行
        System.out.print("A"); // 再印出 A，接在前一個 A 後面

        //println：印完 → 自動換行
        //print：印完 → 不換行，接著印在同一行
    }
}
