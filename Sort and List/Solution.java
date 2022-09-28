import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FunctionString {
	List<String> result = new ArrayList<String>();

	public List<String> sortedArr(String[] arr) {
		if (arr.length == 0) {
			return result;
		} else {
			for (String s : arr) {
				result.add(s);
			}
			for (int i = 0; i < result.size(); i++) {
				for (int j = i + 1; j < result.size(); j++) {
					if (result.get(i).length() > result.get(j).length()) {
						String l = result.get(i);
						String s = result.get(j);
						result.set(i, s);
						result.set(j, l);
					} else if (result.get(i).length() == result.get(j).length()) {
						String s1 = result.get(i);
						String s2 = result.get(j);
						if (s1.compareTo(s2) > 0) {
							result.set(i, s2);
							result.set(j, s1);
						} else if (s1.compareTo(s2) < 0) {
							result.set(i, s1);
							result.set(j, s2);
						}
					}
				}

			}

			return result;
		}
	}

}


public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Sentence of String : ");
		String s = scan.nextLine();
		String[] array_String = s.split(" ");
		List<String> returnRes = new ArrayList<String>();

		FunctionString k = new FunctionString();
		returnRes = k.sortedArr(array_String);
		System.out.println(returnRes);
	}

}
