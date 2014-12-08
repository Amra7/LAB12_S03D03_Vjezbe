public class Zadatak1 {
	public static void main(String[] args) {
		
		System.out.print("Koliko clanova niza zelite");
		int n= TextIO.getInt();
		
		int[] niz = new int[n];
		niz = unosNiza(n);

		for (int i = 0; i <= (niz.length - 1); i++) {
			System.out.print(niz[i] + ", ");

		}
	}

	private static int[] unosNiza(int n) {
		
		int[] unosNiza = new int[n];
		for (int i = 0; i <= (unosNiza.length - 1); i++) {
			System.out.println("Unesi broj: ");
			unosNiza[i] = TextIO.getInt();
		}

		return unosNiza;
	}

}
