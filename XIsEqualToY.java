package probleme;

public class XIsEqualToY {

	//SA SE FACA O FUNCTIE CARE ARE
	// DOI PARAMETRII DE INTRARE SI CA REZULTAT 
	//SPECIFICA DACA NUMERELE SUNT EGALE SAU NU SUNT EGALE (TRUE SAU FALSE)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result=isEqual(3,1);
		System.out.println("Sunt egale numerele?:" +result);

	}
	
	public static boolean isEqual(int number1, int number2) {
		if(number1==number2)
			return true;
		else
			return false;
	}

}
