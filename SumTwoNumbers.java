package probleme;

public class SumTwoNumbers {

	//SA SE FACA O METODA CARE ARE DOI
	//PARAMETRII DE TIP INTREG, SI SA RETURNEZE SUMA
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=calculateSumOfTwoNumbers(5,7);
		System.out.print("Suma este:"+ result);
	}
	
	public static int calculateSumOfTwoNumbers(int number1, int number2) {
		int number3 =number1+number2;
		return number3;
	}

}
