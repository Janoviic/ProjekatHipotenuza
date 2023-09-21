package hipotenuza;

public class Test {

	public static void main(String[] args) {
		Stranice test = new Stranice(15, 6);

		test.setX(10);
		test.setY(10);

		System.out.println("Prva stranica je: " + test.getX());
		System.out.println("Druga stranica je: " + test.getY());
		
		double hipotenuza1 = test.hipotenuzaRezultat();
		System.out.println("Hipotenuza je: " + hipotenuza1);
		
	}

}
