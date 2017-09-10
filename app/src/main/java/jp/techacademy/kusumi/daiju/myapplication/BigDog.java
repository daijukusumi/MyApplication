package jp.techacademy.kusumi.daiju.myapplication;

import android.util.Log;

/**
 * Created by USER on 2017/09/11.
 */

public class BigDog extends Dog {
    // クラス変数
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
