package kadai_021;

public class DictionaryExec_Chapter {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] tangoArray = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < tangoArray.length; i++) {
			dictionary.dictio(tangoArray[i]);
		}
	}

}
