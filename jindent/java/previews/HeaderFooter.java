public class MyBuffer {

   private StringBuffer sb;

   public MyBuffer() {
      sb = new StringBuffer();
   }

   public append(String msg) {
      sb.append(msg);
   }

   public append(int i) {
      sb.append(i);
   }
}
