
public class ananymous_inside_class {
    public static void main(String args[]) {
        int a = 88;
        Pass pa = new Pass(); //宣告與新增物件
        (new Pass() {
            void Setscore(int value) {
                pa.score = value;
            }
        }
        ).Setscore(a);
        System.out.println(pa.score);
        pa.dispose(); //執行物件的方法
        (new Pass() {
            void pr() {
                System.out.println("成績為: " + pa.result);
            }
        }
        ).pr();
    }

    //Pass 類別
    class Pass8 {
        //資料成員
        int score;
        public String result;

        //方法成員
        void dispose() {
            result = "不及格";
            if (score >= 60)
                result = "及格";
        }
    }
}

