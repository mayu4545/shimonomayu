package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {

	public static void main(String[] args) {
		// 1 ローカル変数として宣言
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char cha;
		String str;
		boolean boo;
        System.out.println();

        
        
		// 2 ローカル変数を初期値で初期化
		byteNum = 0;
		shortNum = 0;
		intNum = 0;
		longNum = 0L;
		floatNum = 0.0f;
		doubleNum = 0.0d;
		cha = '\u0000';
		str = null;
		boo = false;
        System.out.println();

        
        
		// 3 変数に下記の値を代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		cha = 'a';
		str = "ハロー";
		boo = true;
        System.out.println();

        
        
		//4 コンソールに出力
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum + byteNum);
		System.out.println(cha + str + boo);
		System.out.println(Math.round(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
        System.out.println();

        
        
		//5 ハローJAVA2023と表示
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
        System.out.println();

        
		
		//6　formatの通りコンソールに出力
		String name = "山田太郎";
		byte age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		//結果の出力
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
        System.out.println();

		
		//7　BMIを出力
		float bmi;
        // BMIの計算
        bmi = weight / ((height/100) * (height/100));        
        // bdの宣言　四捨五入する変数bmiを代入
        BigDecimal bd = new BigDecimal(bmi);
        //resultの宣言　小数第二位を四捨五入
        BigDecimal result = bd.setScale(1,RoundingMode.HALF_UP);
        // 結果の出力
        System.out.println("あなたのBMIは" + result + "です");
        System.out.println();
        
        
        
        //8　再代入してコンソールに出力
        name = "鈴木一郎";
        age = 24;
        height = 168.5f;
        weight = 64.2f;
        food = "オムライス";
        bmi = weight / ((height/100) * (height/100));        
        // bdの再宣言　四捨五入する変数bmiを代入
        BigDecimal bd2 = new BigDecimal(bmi);
        //resultの再宣言　小数第二位を四捨五入
        BigDecimal result2 = bd2.setScale(1,RoundingMode.HALF_UP);

        //結果の出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");  
        System.out.println("BMIは" + result2 + "です");
        System.out.println();

        
        
        //9　和算で自己代入してコンソールに出力
        age += 24;
        height += 168.5f;
        weight += 64.2f;
        bmi = weight / ((height/100) * (height/100));        
        // bdの再宣言　四捨五入する変数bmiを代入
        BigDecimal bd3 = new BigDecimal(bmi);
        //resultの再宣言　小数第二位を四捨五入
        BigDecimal result3 = bd3.setScale(2,RoundingMode.HALF_UP);

        //結果の出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");  
        System.out.println("BMIは" + result3 + "です");
        System.out.println();
        
        
        //10　trueの出力
        age = 24;
        System.out.println("判定結果: " + (age >= 25));
        System.out.println();

        
        //11　文字列型に変換
        //再代入
        age = 24;
        height = 168.5f;
        weight = 64.2f;

        String age2 = String.valueOf(age);
        String height2 = String.valueOf(height);
        String weight2 = String.valueOf(weight);
        //結果の出力
        System.out.println(age2 + height2 + weight2);
        System.out.println();

        
        
        //12　整数型に変換
        int age3 = Integer.parseInt(age2);
        int height4 = Integer.parseInt(height3);
        
        System.out.println(age3);
        System.out.println(height3);
        System.out.println();

        
        
        
        

        

        
        		
        
        




		
	}

}
