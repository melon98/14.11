package zadania3;

import java.util.Scanner;
import java.lang.Math;

public class zad4 {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int[] tab = new int[32];
		int[] zu1 = new int[32];
		int[] zu2 = new int[32];
		int znakm = 0;
		int c = 0;
		int d = 31;
		int q = tab.length - 1;

		System.out.print("wprowadz liczbê ca³kowit¹");
		int a = r.nextInt();
		if (a < 0) {
			znakm = 1;
		} else if (a > 0) {
			znakm = 0;

		}
		System.out.print("zm-" + znakm + ".");
		while (a != 0) {
			tab[q] = Math.abs(a % 2);
			a = a / 2;
			q--;

		}
		while (tab[c] != 1) {
			c++;
			if (c == 31) {
				break;
			}
		}
		for (int i = c; i < 32; i++) {
			System.out.print(tab[i]);

		}

		if (znakm == 0) {
			for (int i = 0; i < 32; i++) {
				zu1[i] = tab[i];
			}

		} else if (znakm == 1) {
			for (int i = 0; i < 32; i++) {
				if (tab[i] == 0) {
					zu1[i] = 1;
				} else if (tab[i] == 1) {
					zu1[i] = 0;
				}

			}

		}
		System.out.println();
		System.out.print("Zu1-" + znakm + ".");
		for (int i = c; i < 32; i++) {
			System.out.print(zu1[i]);
		}
		if (znakm == 0) {
			for (int i = 0; i < 32; i++) {
				zu2[i] = tab[i];
			}
		} else if (znakm == 1) {
			for (int i = 0; i < 32; i++) {
				zu2[i] = tab[i];
			}
			while(tab[d]!=1) {
				d--;
				if(d==0) {
					break;
				}
			}
			for (int i = 0; i < d; i++) {
				if (tab[i] == 0) {
					zu2[i] = 1;
				} else if (tab[i] == 1) {
					zu2[i] = 0;
				}
				
			}
			
		}
		
		System.out.println();
		System.out.print("Zu2-" + znakm + ".");
		for (int i = c; i < 32; i++) {
			System.out.print(zu2[i]);
		}
	}

}
