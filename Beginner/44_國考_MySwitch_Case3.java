package helloworld;

public class MySwitch_Case3 {

    public static void main(String[] args) {
        // 國考高考題目範例
        // for 迴圈：i 從 1 開始，每次 +1，直到 i < 5 (所以 i = 1, 2, 3, 4)
        for (int i = 1; i < 5; i++) {
            // switch-case：根據 i 的值選擇分支
            switch (i) {
            case 1:
                System.out.println("1");   // i=1 時先輸出「1」
                // 沒有 break → 繼續往下執行 case 2
            case 2:
                System.out.println(" 2");  // i=1 或 i=2 都會輸出「2」
                // 沒有 break → 繼續往下執行 case 3
            case 3:
                System.out.println(" 3");  // i=1、2、3 都會輸出「3」
                break;                     // 到這裡才跳出 switch
            case 4:
                System.out.println(" 4");  // i=4 時輸出「4」
                break;                     // 跳出 switch
            }
        }
    }
}

// --- 流程圖 (文字版) ---
//
// 開始
//   ↓
// for迴圈 i=1 → 進入 switch(i)
//     ├─ case 1 → 輸出 "1"
//     │          ↓ (沒有 break → 落入 case 2)
//     ├─ case 2 → 輸出 "2"
//     │          ↓ (沒有 break → 落入 case 3)
//     ├─ case 3 → 輸出 "3"
//     │          ↓ break → 跳出 switch
//     └─ 結束一次迴圈
//
// for迴圈 i=2 → 進入 switch(i)
//     ├─ case 2 → 輸出 "2"
//     │          ↓ (沒有 break → 落入 case 3)
//     ├─ case 3 → 輸出 "3"
//     │          ↓ break → 跳出 switch
//     └─ 結束一次迴圈
//
// for迴圈 i=3 → 進入 switch(i)
//     ├─ case 3 → 輸出 "3"
//     │          ↓ break → 跳出 switch
//     └─ 結束一次迴圈
//
// for迴圈 i=4 → 進入 switch(i)
//     ├─ case 4 → 輸出 "4"
//     │          ↓ break → 跳出 switch
//     └─ 結束一次迴圈
//
// 結束程式
//
// --- 最終輸出結果 ---
// 1
//  2
//  3
//  2
//  3
//  3
//  4
