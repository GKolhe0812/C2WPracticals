class Sportscomp{

	public static void main(String[] args){

		int age = 11;

		if((age<12) || (age >18)){

			System.out.println("The student cannot participate");

		}else if(age == 12){

			System.out.println("The student eligible to play Gully Danda");

		}else if((age > 12) && (age<=15)){

			System.out.println("Eligible to play Cricket");

		}else if((age > 15) && (age <= 18)){

			System.out.println("Eligible to play football");
		}

	}
	
}

