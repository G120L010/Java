package advanced;
/*Demo 類別：提供基本的加法與字串列印功能*/
public class OverLoading {
    /**
     * 覆載OverLoading
     */
    public int add(int a, int b) {
        int c = a + b; // 將兩數相加並存入變數 c
        return c;      // 回傳加總結果
	}
	public double add(double a, double b) {
		double c = a + b;
		return c;
	}
    
}
