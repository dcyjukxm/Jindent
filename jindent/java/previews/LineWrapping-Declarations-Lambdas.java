class Test {

	public static void main(String[] args)
	{
		
		int sum = Arrays.stream(x)
				.map(
				    (n) -> n * 5)
				.filter((n) -> {
							System.out.println("Filtering: " + n);
							return n % 3 != 0;
						}
				)
				.reduce(0, Integer::sum);

	}
}
		