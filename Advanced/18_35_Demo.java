package advanced;
/*Demo 類別：提供基本的加法與字串列印功能*/
public class Demo {
    /**
     * 兩數相加的方法
     * @param a 第一個整數
     * @param b 第二個整數
     * @return 回傳 a + b 的結果
     */
    public int add(int a, int b) {
        int c = a + b; // 將兩數相加並存入變數 c
        return c;      // 回傳加總結果
    }
    /** 列印字串到主控台
     * @param str 要被列印的字串
     */
    public void print(String str) {
        System.out.println(str); // 將字串輸出到控制台

        // return; 可寫可不寫
        // 因為 void 方法在結束時會自動返回
    }
}
