class StringFormatExample {


	public static void main(String[] args) {

		String fname = args[0];
		String lname = args[1];

		String result = String.format("Welcome %s%s", fname, lname);
		System.out.println(result);
	}
}