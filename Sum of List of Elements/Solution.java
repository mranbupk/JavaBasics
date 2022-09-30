package co.anbu.entity;

import java.util.ArrayList;
import java.util.List;

public class Sumlist {
	List<Integer> result = new ArrayList<Integer>();

	public List<Integer> sumVerification(List<Integer> sArr_1, List<Integer> sArr_2) {
		if (sArr_1.size() == 0 || sArr_2.size() == 0) {
			return result;
		} else {
			if (sArr_1.size() == sArr_2.size()) {
				for (int i = 0; i < sArr_1.size(); i++) {
					int s = sArr_1.get(i) + sArr_2.get(i);
					result.add(s);
				}
			} else if (sArr_1.size() > sArr_2.size()) {
				int last = sArr_2.size() - 1;
				for (int i = 0; i < sArr_1.size(); i++) {
					if (i > last) {
						result.add(sArr_1.get(i));
					} else {
						int s = sArr_1.get(i) + sArr_2.get(i);
						result.add(s);
					}
				}
			} else if (sArr_2.size() > sArr_1.size()) {
				int last = sArr_1.size() - 1;
				for (int i = 0; i < sArr_2.size(); i++) {
					if (i > last) {
						result.add(sArr_2.get(i));
					} else {
						int s = sArr_1.get(i) + sArr_2.get(i);
						result.add(s);
					}
				}
			}

		}
		return result;

	}

}

//**--------------------------------------------------**

package co.anbu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.anbu.entity.Sumlist;

public class Solution{

	public static void main(String[] args) {
		List<Integer> First = new ArrayList<Integer>();
		List<Integer> Second = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine().trim();
		String s2 = scan.nextLine().trim();
		String[] Arr_1 = s1.split(" ");
		String[] Arr_2 = s2.split(" ");
		try {
			for (int i = 0; i < Arr_1.length; i++) {
				First.add(Integer.parseInt(Arr_1[i]));
			}
			for (int i = 0; i < Arr_2.length; i++) {
				Second.add(Integer.parseInt(Arr_2[i]));
			}
		} catch (Exception e) {
		}

		Sumlist obj = new Sumlist();
		List<Integer> resultsum = new ArrayList<Integer>();
		resultsum = obj.sumVerification(First, Second);
		System.out.println(resultsum);

	}

}

