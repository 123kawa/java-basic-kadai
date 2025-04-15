package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// HashMapをクラスレベルで宣言
    HashMap<String, String> jyankenMap;
	
	public Jyanken_Chapter28() {
		jyankenMap = new HashMap<String, String>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
	}
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String input = "";

		//Scannerクラスのオブジェクトを生成する
		try (Scanner scanner = new Scanner(System.in)) {
			//入力した内容を取得する
			input = scanner.next();
		};
		
		input = input.trim();

		if(input.equals("r")) {
			return "r";
		} else if(input.equals("s")) {
			return "s";
		} else if(input.equals("p")) {
			return "p";
		} else {
			throw new IllegalArgumentException("入力された文字はじゃんけんと関係ありません");
		}

	}
	
	String[] te = {"グー", "チョキ", "パー"};
	
	public String getRandom() {
		int partner = (int)Math.floor(Math.random() * 3);
		
		return te[partner];
	}
	
	public void playGame() {
		String my = getMyChoice();
		String partner = getRandom();
		
		System.out.println("自分の手は" + jyankenMap.get(my) + ",対戦相手の手は" + partner );
		
		if(partner.equals(jyankenMap.get(my))) {
			System.out.println("あいこです");
			
		} else if ((partner.equals("チョキ") && jyankenMap.get(my).equals("グー")) ||
				(partner.equals("パー") && jyankenMap.get(my).equals("チョキ")) || 
				(partner.equals("グー") && jyankenMap.get(my).equals("パー"))) {
			System.out.println("自分の勝ちです");
			
		} else {
			System.out.println("自分の負けです");
		}
	}

}
