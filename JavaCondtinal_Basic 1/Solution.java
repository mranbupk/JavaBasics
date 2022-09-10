package co.anbu;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		int phys, chem, maths;
		int ave;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mark in Phsyics: ");
		phys = sc.nextInt();
		System.out.println("Enter the Mark in Chemistry : ");
		chem = sc.nextInt();
		System.out.println("Enter the Mark in Mathematics: ");
		maths = sc.nextInt();
		
		ave = (phys  + chem + maths)/3;
		if(phys < 0 || chem < 0 || maths < 0 || phys > 100 || chem > 100 || maths > 100) {
			System.out.println("Invalid");
		}
		else {
			if(ave >= 70 && ave <=100) {
				System.out.println("Your are 'Distinction'");
			}
			else if(ave >= 60 && ave < 70) {
				System.out.println("Your are 'First'");
			}
			else if(ave >= 50 && ave < 60) {
				System.out.println("Your are 'Second'");
			}
			else if(ave >= 40 && ave < 50) {
				System.out.println("Your are 'Third'");
			}
			else if(ave >= 0 && ave < 40) {
				System.out.println("Your are 'Fail'");
			}
			else 
				System.out.println("Invalid");
		}
	}
}
