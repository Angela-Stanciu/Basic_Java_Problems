package probleme;

public class UpvotesVsDownvotes {

	//SA SE FACA O FUNCTIE CARE IN STANGA SA FIE NUMARUL
	//DE UPVOTES , IN DREAPTA SA FIE NUMARUL DE 
	//DOWNVOTES SI SA SE FACA DIFERENTA
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = count(2,33);
		System.out.println("Rezultatul este: "+result);
	}
	
	public static int count(int upvotes, int downvotes) {
		int count=0;
		if((upvotes>=0)&&(downvotes>=0)) {
			count=upvotes-downvotes;
			return count;
		}
		else
			return count;
	}

}
