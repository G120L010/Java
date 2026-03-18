package advanced;

public class Test {

    public static void main(String[] args) {
        Car car;
        car = new Car();
        car.brand = "Honda";
        car.color = "紅色";

        car.go(); // 呼叫 Car 類別中的 go() 方法，執行物件的行為

        car = null; // 將 car 變數設為 null，不再指向任何物件
                    // 原本的 Car 物件 (0x100) 如果沒有其他參考，就會等待垃圾回收 (GC)

        System.gc(); // 建議 JVM 進行垃圾回收，但實際回收時間由 JVM 自動判斷

        // 印出字串 "Test" 四次，觀察垃圾回收的時機
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
        System.out.println("Test");
    }
}
