class Spell{

	public static void main(String[] args){

		int var = 9;

		if((var >= 0) && (var <= 5)){

			if(var == 0){

				System.out.println("Zero");

			}else if(var == 1){

                                System.out.println("one");

                        }else if(var == 2){

				System.out.println("Two");

			}else if(var == 3){

                                System.out.println("Three");

                        }else if(var == 4){

                                System.out.println("Four");

                        }else if(var == 5){

                                System.out.println("Five");
                        }

		}else if(var > 5){

			System.out.println(var + " is greater then 5");

		}else

                        System.out.println(var + " is Negative number");
                        

	}

}

