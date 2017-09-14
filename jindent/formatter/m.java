package jindent.formatter;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import jindent.JindentException;
import jindent.formatter.Context;
import jindent.formatter.h;
import jindent.formatter.s;

public interface m extends s, h {
   String a(String var1) throws JindentException;

   byte[] a(byte[] var1) throws JindentException;

   void a(Reader var1, Writer var2) throws JindentException;

   void a(InputStream var1, OutputStream var2) throws JindentException;

   Object a();

   void a(Object var1);

   void a(boolean var1);

   boolean b();

   void a(jindent.formatter.c.a var1);

   jindent.formatter.c.a c();

   Context d();
}
