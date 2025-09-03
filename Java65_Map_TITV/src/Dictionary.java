import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {
	private Map<String, String> data = new TreeMap<String, String>();
	
	public String addWord(String keyWord, String meaning) {
		return this.data.put(keyWord, meaning);
	}
	
	public String deleteWord(String keyWord) {
		return this.data.remove(keyWord);
	}
	
	public String searchMeaning(String keyWord) {
		String res = this.data.get(keyWord);
		return res;
	}
	
	public void printAll() {
		Set<String> setOfKey = this.data.keySet();
		System.out.println(setOfKey.toString());
	}
	
	public int quantityOfKey() {
		return this.data.size();
	}
	
	public void deleteAll() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		Dictionary dic = new Dictionary();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("==============Menu============\n"
					+ "1. Add word(keyword, meaning)\n"
					+ "2. Delete word\n"
					+ "3. Search word\n"
					+ "4. Print all words\n"
					+ "5. Quantity of words\n"
					+ "6. Delete all words\n"
					+ "0. Exit\n");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:{				
				String keyword, meaning = "";
				System.out.println("Input keyword: ");
				keyword = sc.nextLine();
				System.out.println("Input meaning: ");
				meaning = sc.nextLine();
				dic.addWord(keyword, meaning);
				break;
			}
			case 2, 3: {				
				String keyword = "";
				System.out.println("Input keyword: ");
				keyword = sc.nextLine();
				
				if(choice == 2) {
					dic.deleteWord(keyword);
				}else {
					String mean = dic.searchMeaning(keyword);
					System.out.printf("Meaning of %s: %s\n", keyword, mean);
				}
				break;
			}
			case 4: {
				dic.printAll();
				break;
			}
			case 5: {
				System.out.println(dic.quantityOfKey());
				break;
			}
			case 6: {
				dic.deleteAll();
				break;
			}
			}
		}while(choice != 0);
	}
}
