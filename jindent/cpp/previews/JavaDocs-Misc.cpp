package mypackage;

/**
 * ClassA ...
 */
public class ClassA {

    /** Unformatted JavaDoc
     */
    private String fieldA;
    /** One line JavaDoc */
    private String fieldB;
    /**********************
     * Multi-line JavaDoc *
     **********************/ 
    private String fieldC;

   /**
     Unformatted JavaDoc
     
     @param a - parameter a ...
     @param b - parameter b ...
     @param c - parameter c ...
    */
   public void methodA(int a, int b, int c, String s) throws Exception {
      // ...
   }

   /**
    * Method methodA with incomplete JavaDocs
    *
    * @param a - parameter a still left from 
    *            previous version of this method
    *
    * @param c - parameter c ...
    * @param d - parameter d ...
    * 
    * @throws WrongException
    */
   public void methodB(int x, int y, int z) throws IOException {
      // ...
   }
}
