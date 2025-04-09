package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void dictio(String tango) {
		
		HashMap<String,String> dicMap = new HashMap<String,String>();
		
		dicMap.put("apple", 	"りんご");
		dicMap.put("peach",		"桃");
		dicMap.put("banana",	"バナナ");
		dicMap.put("lemon",		"レモン");
		dicMap.put("pear",		"梨");
		dicMap.put("kiwi",		"キウイ");
		dicMap.put("strawberry","いちご");
		dicMap.put("grape",		"ぶどう");
		dicMap.put("muscat",	"マスカット");
		dicMap.put("cherry",	"さくらんぼ");
		
		if(dicMap.get(tango) == null) {
			System.out.println(tango + " は辞書にありませんでした");
		} else {
			System.out.println(dicMap.get(tango));
		}
	}

}
