void test() {

	// white space telling code analyzers that the statement is intentionally missing.
	for (counter = 0; counter < 1000; ++counter) ;

	// white space telling code analyzers that the statement is intentionally missing.
	while (--counter > 0) ;

	// this empty statement does not contain any whitespace
	while (true);
}
