class Maxof3{

	public static void main(String[] args){

		int A = 14, B = 14, C = 14;

		if((A > B) && (A>C)){

			System.out.println(A + " is Greater between " + A + " , " + B + " And " +C);

		}else if((B>A) && (B>C)){

			System.out.println(B + " is Greater between " + A + " , " + B + " And " +C);
		}else if((C>A) && (C>B)){

			System.out.println(C + " is Greater between " + A + " , " + B + " And " +C);

		}
		else{

			System.out.println(A+ ","+ B + "," +C + " are Equal");
		}
	}
}

