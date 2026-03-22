package helloworld;

public class Programming { //程式設計結構

    public static void main(String[] args) {
        // 程式設計常見的結構。
        // 1.循序 => 按照順序
        //         程式邏輯：執行順序由上往下走。
        //         程式範例：2個變數交換
        //         a=1、b=5
        //         c=a; a=b; b=c;
        //         b=5、a=1
        
        // 2.選擇 => 單邊選擇、雙邊選擇、巢狀、多重
        //         邏輯範例：(if、else)、成績輸入、判斷是否登入
        
        // 3.循環 => 前測迴路、後測迴路
        //         程式邏輯：用來進行一連串的動作，直到完成脫離條件。
        //         程式邏輯：通常用來讀取資料(疊代)，或是完成有規則可循的動作。
    }

}
// --- 程式設計三大結構心智圖 ---
// 1. 循序 (Sequential)
//    ↓ 按照順序執行，由上到下
//    範例：變數交換、計算公式
//
// 2. 選擇 (Selection)
//    ↓ 根據條件決定路徑
//    種類：if、if...else、巢狀 if、(多重選擇 switch)
//    範例：成績判斷、登入驗證
//
// 3. 循環 (Loop)
//    ↓ 重複執行，直到條件不成立
//    種類：while (前測)、do...while (後測)、for (固定次數)
//    範例：讀取資料、計算總和、疊代處理
//
//總結：所有程式邏輯都是由「循序、選擇、循環」三大結構組合而成

// --- 流程控制：選擇結構 ---
// 1. if [-else if] [-else]
//    - 條件判斷，結果一定是布林值 (true / false)
//    - 適合用在「範圍判斷」或「邏輯判斷」
//    範例：
//    int score = 75;
//    if (score >= 90) {
//        System.out.println("優秀");
//    } else if (score >= 60) {
//        System.out.println("及格");
//    } else {
//        System.out.println("不及格");
//    }
//
// 2. switch-case
//    - 適合用在「固定值判斷」(例如數字、字串)
//    - 每個 case 對應一個可能的值
//    - 通常搭配 break 使用，避免落入下一個 case
//    範例：
//    int day = 3;
//    switch (day) {
//        case 1: System.out.println("星期一"); break;
//        case 2: System.out.println("星期二"); break;
//        case 3: System.out.println("星期三"); break;
//        default: System.out.println("其他");
//    }
//
// --- 比較表 ---
// if 結構：
//   ✔ 適合範圍判斷 (>=, <=, >, <)
//   ✔ 適合複雜邏輯 (布林運算)
//   ✘ 不適合太多固定值判斷
//
// switch-case 結構：
//   ✔ 適合固定值判斷 (數字、字串)
//   ✔ 結構清晰，適合多重選擇
//   ✘ 不適合範圍判斷
