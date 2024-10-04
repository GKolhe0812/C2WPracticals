class Profitloss{

	public static void main(String[] args){

		int SellingPrice = 6000;
		int CostPrice = 6000;

		if(SellingPrice > CostPrice){

			System.out.println("Profit of " + (SellingPrice - CostPrice));

		}else if(SellingPrice < CostPrice){

			System.out.println("Loss of " + (CostPrice - SellingPrice));

		}else{

			System.out.println("Neither loss Nor Profit");
		}
	}

}

