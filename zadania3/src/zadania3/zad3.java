package zadania3;

import java.util.Random;

public class zad3 {

	public static void main(String[] args) {
		Random r = new Random();
		int[][] tab = new int[5][5];

		for (int x = 0; x < 5; x++) {

			for (int y = 0; y < 5; y++) {
				tab[x][y] = r.nextInt(11) - 5;
			}

		}
		int[] tabmax = { -6, -6, -6, -6, -6 };
		int[] tabmin = { 6, 6, 6, 6, 6 };
		int najw = 0;
		int najm = 0;
		for (int x = 0; x < 5; x++) {
			System.out.println();
			System.out.print("|");

			for (int y = 0; y < 5; y++) {
				if (tab[x][y] >= 0) {
					System.out.print(" " + tab[x][y] + "|");
				} else {
					System.out.print(tab[x][y] + "|");
				}

				if (tab[x][y] > tabmax[y]) {
					tabmax[y] = tab[x][y];

				}
				if (tab[x][y] < tabmin[x]) {
					tabmin[x] = tab[x][y];
				}

			}

		}
		for (int i = 0; i < 5; i++) {
			if (najw < tab[i][i]) {
				najw = tab[i][i];
			}
		}
		for (int i = 0, j = 4; i < 5; i++, j--) {
			if (najm > tab[i][j]) {
				najm = tab[i][j];
			}
		}

		System.out.println(" ");
		System.out.print("max|");

		for (int x = 0; x < 5; x++) {
			System.out.print(tabmax[x] + " |");
		}
		System.out.println(" ");
		System.out.print("min|");
		for (int y = 0; y < 5; y++) {
			System.out.print(tabmin[y] + "|");

		}
		System.out.println(" ");
		System.out.println("najwieksza" + " " + najw);
		System.out.println("najmniejsza" + " " + najm);
	}
}
