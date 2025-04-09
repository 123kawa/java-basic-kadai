package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// HashMapをクラスレベルで宣言
    HashMap<String, String> dicMap;

    // コンストラクタでdicMapの初期化
    public Dictionary_Chapter21() {
        dicMap = new HashMap<String, String>();
        dicMap.put("apple", "りんご");
        dicMap.put("peach", "桃");
        dicMap.put("banana", "バナナ");
        dicMap.put("lemon", "レモン");
        dicMap.put("pear", "梨");
        dicMap.put("kiwi", "キウイ");
        dicMap.put("strawberry", "いちご");
        dicMap.put("grape", "ぶどう");
        dicMap.put("muscat", "マスカット");
        dicMap.put("cherry", "さくらんぼ");
    }
	
	public void dictio(String tango) {
		
		if(dicMap.containsKey(tango)) {
			System.out.println(tango + "の意味は" + dicMap.get(tango));
		} else {
			System.out.println(tango + "は辞書に存在しません");
		}
	}

}
