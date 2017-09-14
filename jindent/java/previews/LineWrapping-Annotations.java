@MarkerAnnotation1 public class ClassA {
}

@MarkerAnnotation1 @MarkerAnnotation2 @MarkerAnnotation3 public class ClassB {
	
	public void method(int x) {

		// ...		
   }
}

@Author(@Name(first = "Joe", last = "Hacker")) class ClassC {
	// ...
}

@Address(firstname = "Joe", lastname = "Hacker", street="Sesame street", city="City") class ClassC {
	
	@Annotation({"value1", "value2", "value3", "value4", "value5"}) public void method() {
		// ...
	}
}