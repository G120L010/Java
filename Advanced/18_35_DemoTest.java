package advanced;
/* DemoTest 類別：用來測試 Demo 類別中的方法*/
public class DemoTest {

    /**主程式入口，用來執行測試
     * @param args 指令列參數（本範例未使用）*/
    public static void main(String[] args) {

        // 建立 Demo 類別的物件
        Demo d = new Demo();

        // 呼叫 add 方法，將 9 + 9 的結果存入變數 i
        int i = d.add(9, 9);

        // 將計算結果輸出到控制台
        System.out.println(i);

        // 呼叫 print 方法，印出指定字串
        d.print("在main方法中呼叫");
    }
}
