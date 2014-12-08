public class Zadatak2 {
	public static void main(String[] args) {
		System.out.println("Koliko clanova niza zelite ");
		int n = TextIO.getInt();

		int[] niz = new int[n];
		niz = unosNiza(n);

		int sum = sumNiza(niz);
		System.out.println("Suma brojeva niza je: " + sum);

		System.out.println("Najmanji clan je: " + najmanjiClan(niz));

		int najveci = niz[0];
		for (int i = 0; i < niz.length; i++)
			if (najveci < niz[i]) {
				najveci = niz[i];
			}
		System.out.println("Najveci clan u nizu je: " + najveci);

		print(niz);

	}

	private static int najmanjiClan(int[] niz) {
		int trenutni = niz[0];

		for (int i = 0; i < niz.length; i++) {

			if (trenutni > niz[i]) {
				trenutni = niz[i];
			}
		}

		return trenutni;

	}

	private static int sumNiza(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum = sum + a[i];
		return sum;
	}

	public static void print(int[] nizN) {

		for (int i = 0; i <= (nizN.length - 1); i++) {
			System.out.print(nizN[i] + ", ");

		}
	}

	private static int[] unosNiza(int n) {

		int[] unosNiza = new int[n];
		for (int i = 0; i < unosNiza.length; i++) {
			System.out.println("Unesi broj: ");
			unosNiza[i] = TextIO.getInt();
		}

		return unosNiza;
	}

}
