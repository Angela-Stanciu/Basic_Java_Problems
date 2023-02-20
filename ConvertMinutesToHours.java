package probleme;

public class ConvertMinutesToHours {

	//SA SE FACA O FUNCTIE CARE CONVERTESTE
	//MINUTELE IN ORE
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = convert(3);
		System.out.println("Minutele sunt:"+result);
	}
	
	public static int convert(int minutes) {
		int hours = minutes * 60;
		return hours;
	}

}
