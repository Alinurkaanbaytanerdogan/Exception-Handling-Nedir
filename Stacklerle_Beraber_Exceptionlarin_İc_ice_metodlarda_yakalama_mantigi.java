package Exceptions;

public class Stacklerle_Beraber_Exceptionlarin_�c_ice_metodlarda_yakalama_mantigi {
	public static void ucuncufonsiyon() {
		try {
			int a = 12/0;

		}catch (ArithmeticException e) {
			System.out.println("Boyle Bisi yok");
		}
	}
	public static void ikincifonsiyon() {
		ucuncufonsiyon(); // burdada try yapabilirsin
	}
	public static void birincifonksiyon() {
		ikincifonsiyon();// burdada try yapabilirsin
	}// ama ucuncu ve ikinci fonksiyon stackerleden �ikiyr
	public static void main(String[] args) {
	birincifonksiyon();
		
		
		
	}
}
