package zadania3;

import java.util.Random;

public class zad2 {

	public static void main(String[] args) {
		Random r = new Random();
		int l1=0, l2=0, l3=0, l4=0, l5=0, l6=0, l7=0, l8=0, l9=0,l10=0;
		int[] tab = new int[20];
		for (int i = 0; i < 20; i++)
			tab[i] = r.nextInt(10) + 1;
		for (int i = 0; i < 20; i++) {
			if (tab[i] == 1) {
				l1++;
			}if (tab[i] == 2) {
				l2++;
			}if (tab[i] == 3) {
				l3++;
			}if (tab[i] == 4) {
				l4++;
			}if (tab[i] == 5) {
				l5++;
			}if (tab[i] == 6) {
				l6++;
			}if (tab[i] == 7) {
				l7++;
			}if (tab[i] == 8) {
				l8++;
			}if (tab[i] == 9) {
				l9++;
			}if (tab[i] == 10) {
				l10++;
			}
			
			
		}System.out.println("1-" + l1);
		System.out.println("2-" + l2);
		System.out.println("3-" + l3);
		System.out.println("4-" + l4);
		System.out.println("5-" + l5);
		System.out.println("6-" + l6);
		System.out.println("7-" + l7);
		System.out.println("8-" + l8);
		System.out.println("9-" + l9);
		System.out.println("10-" + l10);
		
	}
}
