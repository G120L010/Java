package helloworld;

// enum 列舉型別：用來定義一組固定的常數集合
// 位置：跟 Class 的建立位置一樣，在專案裡可以直接建立 Enum 檔案
// 語意：建立一個型別 Size，裡面只能有 small、mid、Large 三種值
// 好處：避免使用者輸入錯誤字串，讓程式更有規範性
public enum Size {
    small, mid, Large
}

// --- 操作流程 ---
// 1. 定義列舉型別 (enum)：列舉是一種特殊的類別，用來表示固定的常數集合。
//    → 在這裡我們定義了 Size，裡面有 small、mid、Large 三種選項。
// 2. 使用時：可以直接用 Size.small、Size.mid、Size.Large 來代表不同的狀態。
//    → 例如：Size s = Size.mid; 表示選擇中尺寸。
// 3. 列舉值本質上就是常數，通常用在「選項有限」的情境，例如：衣服尺寸、月份、方向。
// 4. 範例：
//    Size s = Size.mid; // 宣告一個 Size 型別的變數 s，並指定為 mid
//    if (s == Size.Large) {
//        System.out.println("選擇大尺寸");
//    }
//
// --- 生活化例子 ---
// enum TrafficLight { RED, YELLOW, GREEN }
// → 表示紅綠燈的三種狀態
// 使用方式：
// TrafficLight light = TrafficLight.RED;
// if (light == TrafficLight.RED) {
//     System.out.println("停車");
// }
