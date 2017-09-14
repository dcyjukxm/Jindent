class Test {

	void test() {
		
		// ...
		int sum = Arrays.stream(x)
				.map((n) -> n * 5)
				.filter(
					(n) -> {
						System.out.println("Filtering: " + n);
						return n % 3 != 0;
					}
				)
				.reduce(0, Integer::sum);

		
		// ...		
	}
	
}
