/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */

        int[] data = {3, 1, 2, 7, 5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        // バブルソートプログラム
        // 最後の要素を除いて、すべての要素を並べ替える
        for (int i = 0; i < data.length - 1; i++) {
            // 下から順番に比較(j = 要素数-1 = 配列の添字)
            // j > i = 最大交換回数
            for (int j = data.length - 1; j > i; j--) {

                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                
                // 配列の右側が左隣より小さい場合、交換処理を行う
                if(data[j - 1] > data[j]){
                  // 一時変数box に 変数data[j - 1] を代入
                  //（ data[j] に代入する値がなくなるのを防ぐため）
                  int box = data[j - 1];
                  // 変数data[j - 1] に 変数data[j] を代入
                  data[j - 1] = data[j];
                  // 変数data[j] に 一時変数box を代入
                  data[j] = box;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}