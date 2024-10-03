class Increment{

	public static void main(String[] args){

		int x = 0;

		int ans1 = ++x + ++x + ++x + ++x;
		System.out.println(ans1);
		System.out.println(x);

		int ans2 = x++ + x++ + x++ + x++;
		System.out.println(ans2);
		System.out.println(x);
	}
}
