package probleme;

public class IncrementANumber {

	//SA SE FACA O FUNCTIE CARE ARE UN
	//PARAMETRU INTREG SI SA SE INCREMENTEZE CU +1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=incrementANumber(10);
		System.out.println("Numarul incrementat este: "+result);
	}
	
	public static int incrementANumber(int number) {
		int incremented=number+1;
		return incremented;
	}

}
