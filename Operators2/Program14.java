class Incrementing{

	public static void main(String[] args){

		int x = 14,y =22;

		int ans1 = ++x + y++;
		int ans2 = x++ + ++y + ++x + ++x;
		int ans3 = y++ + ++x + ++x;

		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(x);
		System.out.println(y);

	}
}
