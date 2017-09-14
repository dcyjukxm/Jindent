package jindent.java;

import java.io.IOException;
import java.io.PrintStream;
import jindent.formatter.q;
import jindent.java.TokenMgrError;
import jindent.java.h;

public class i implements h {
   public PrintStream a;
   static final long[] b = new long[]{-2L, -1L, -1L, -1L};
   static final long[] c = new long[]{0L, 0L, -1L, -1L};
   static final long[] d = new long[]{2301339413881290750L, -16384L, 4294967295L, 432345564227567616L};
   static final long[] e = new long[]{0L, 0L, 0L, -36028797027352577L};
   static final long[] f = new long[]{0L, -1L, -1L, -1L};
   static final long[] g = new long[]{-1L, -1L, 65535L, 0L};
   static final long[] h = new long[]{-1L, -1L, 0L, 0L};
   static final long[] i = new long[]{70368744177663L, 0L, 0L, 0L};
   static final int[] j = new int[]{57, 59, 67, 68, 70, 75, 76, 78, 17, 82, 74, 66, 34, 35, 42, 43, 19, 21, 32, 9, 94, 96, 9, 97, 99, 105, 12, 14, 17, 11, 14, 17, 11, 34, 35, 45, 42, 43, 60, 17, 63, 64, 60, 17, 63, 57, 59, 66, 67, 68, 70, 74, 73, 67, 68, 70, 74, 78, 17, 81, 75, 76, 78, 17, 82, 81, 75, 76, 78, 17, 82, 100, 101, 102, 106, 107, 84, 89, 15, 16, 22, 23, 25, 36, 44, 46, 61, 62, 71, 72, 79, 80, 103, 104, 0, 1, 3};
   public static final String[] jjstrLiteralImages = new String[]{"", null, null, null, null, null, null, null, null, null, null, null, null, null, a("9\u0013D\u001a}9\u0012C"), a(":\u001eX\u0002j9\u001f"), a(":\u0003R\u000fd"), a(":\bC\u000b"), a(";\u0010D\u000b"), a(";\u0010C\rg"), a(";\u0019V\u001c"), a(";\u001dV\u001d|"), a(";\u001eY\u001af6\u0004R"), a("<\u0014Q\u000fz4\u0005"), a("<\u001e"), a("<\u001eB\fc="), a("=\u001dD\u000b"), a("=\tC\u000ba<\u0002"), a(">\u0010[\u001dj"), a(">\u0018Y\u000fc"), a(">\u0018Y\u000fc4\b"), a(">\u001dX\u000f{"), a(">\u001eE"), a("?\u001eC\u0001"), a("1\u0017"), a("1\u001cG\u0002j5\u0014Y\u001a|"), a("1\u001cG\u0001},"), a("1\u001fD\u001an6\u0012R\u0001i"), a("1\u001fC"), a("1\u001fC\u000b}>\u0010T\u000b"), a("4\u001eY\t"), a("6\u0010C\u0007y="), a("6\u0014@"), a("6\u0004[\u0002"), a("(\u0010T\u0005n?\u0014"), a("(\u0003^\u0018n,\u0014"), a("(\u0003X\u001aj;\u0005R\n"), a("(\u0004U\u0002f;"), a("*\u0014C\u001b}6"), a("+\u0019X\u001c{"), a("+\u0005V\u001af;"), a("+\u0004G\u000b}"), a("+\u0006^\u001al0"), a("+\bY\rg*\u001eY\u0007u=\u0015"), a(",\u0019^\u001d"), a(",\u0019E\u0001x"), a(",\u0019E\u0001x+"), a(",\u0003V\u0000|1\u0014Y\u001a"), a(",\u0003B\u000b"), a(",\u0003N"), a(".\u001e^\n"), a(".\u001e[\u000f{1\u001dR"), a("/\u0019^\u0002j"), a("+\u0005E\u0007l,\u0017G"), null, null, null, null, null, null, null, null, null, null, null, null, "(", ")", "{", "}", "[", "]", ";", ",", ".", a("v_\u0019"), "=", a("uO"), ">", "<", "!", "~", "?", ":", a("bK"), a("eL"), a("dL"), a("fL"), a("yL"), a("$\r"), a("~W"), a("sZ"), a("u\\"), "+", "-", "*", "/", "&", "|", "^", "%", a("dM"), a("sL"), a("uL"), a("rL"), a("wL"), a("~L"), a("$L"), a("\u0006L"), a("}L"), a("dM\n"), a("fO\n"), a("fO\tS"), "@"};
   public static final String[] lexStateNames = new String[]{a("\u001c4q/Z\u0014%"), a("\u0011?h=F\u00166{+P\u00148y+P\u001b>z#J\u0016%"), a("\u0011?h(@\n<v\"P\u001b>z#J\u0016%"), a("\u0011?h#Z\u0014%~1C\u0011?r1L\u0017<z+A\f"), a("\u0011?h-N\f4p!]\u0001.t!B\u00154y:")};
   public static final int[] jjnewLexState = new int[]{-1, -1, -1, 1, 2, 3, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   static final long[] k = new long[]{-12287L, 1152921504606843793L};
   static final long[] l = new long[]{1990L, 0L};
   static final long[] m = new long[]{1984L, 0L};
   static final long[] n = new long[]{2104L, 0L};
   protected jindent.formatter.a.b o;
   private final int[] p;
   private final int[] q;
   private final StringBuffer r;
   private StringBuffer s;
   private int t;
   private int u;
   protected char v;
   int w;
   int x;
   int y;
   int z;
   int A;
   int B;

   void a(q var1) {
      var1.s = ((jindent.formatter.a.c)this.o).u();
   }

   public void a(PrintStream var1) {
      this.a = var1;
   }

   private final int a(int var1, long var2, long var4) {
      switch(var1) {
      case 0:
         if((var2 & 40L) == 0L && (var4 & 2256197860196352L) == 0L) {
            if((var2 & -16384L) != 0L) {
               this.B = 73;
               return 109;
            }

            if((var4 & 3145728L) != 0L) {
               return 11;
            }

            return -1;
         }

         return 2;
      case 1:
         if((var2 & 32L) != 0L) {
            return 0;
         } else if((var2 & -17230217216L) != 0L) {
            if(this.A != 1) {
               this.B = 73;
               this.A = 1;
            }

            return 109;
         } else {
            if((var2 & 17230200832L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 2:
         if((var2 & -576465996475285504L) != 0L) {
            if(this.A != 2) {
               this.B = 73;
               this.A = 2;
            }

            return 109;
         } else {
            if((var2 & 576465979278622720L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 3:
         if((var2 & -2035641630250647552L) != 0L) {
            this.B = 73;
            this.A = 3;
            return 109;
         } else {
            if((var2 & 1459176183531175936L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 4:
         if((var2 & -6758228793531252736L) != 0L) {
            if(this.A != 4) {
               this.B = 73;
               this.A = 4;
            }

            return 109;
         } else {
            if((var2 & 4722587163280605184L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 5:
         if((var2 & -6764282772233076736L) != 0L) {
            this.B = 73;
            this.A = 5;
            return 109;
         } else {
            if((var2 & 78111573813493760L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 6:
         if((var2 & -6764335550007590912L) != 0L) {
            this.B = 73;
            this.A = 6;
            return 109;
         } else {
            if((var2 & 52777774514176L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 7:
         if((var2 & 153193477629280256L) != 0L) {
            this.B = 73;
            this.A = 7;
            return 109;
         } else {
            if((var2 & -6917529027636871168L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 8:
         if((var2 & 9007371053432832L) != 0L) {
            this.B = 73;
            this.A = 8;
            return 109;
         } else {
            if((var2 & 144186106575847424L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 9:
         if((var2 & 9007199254740992L) != 0L) {
            this.B = 73;
            this.A = 9;
            return 109;
         } else {
            if((var2 & 171798691840L) != 0L) {
               return 109;
            }

            return -1;
         }
      case 10:
         if((var2 & 9007199254740992L) != 0L) {
            this.B = 73;
            this.A = 10;
            return 109;
         }

         return -1;
      default:
         return -1;
      }
   }

   private final int b(int var1, long var2, long var4) {
      return this.b(this.a(var1, var2, var4), var1 + 1);
   }

   private int a(int var1, int var2) {
      this.B = var2;
      this.A = var1;
      return var1 + 1;
   }

   private int a() {
      switch(this.v) {
      case '!':
         this.B = 90;
         return this.a(0L, 17179869184L);
      case '\"':
      case '#':
      case '$':
      case '\'':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
      case 'F':
      case 'G':
      case 'H':
      case 'I':
      case 'J':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
      case 'T':
      case 'U':
      case 'V':
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
      case '\\':
      case '_':
      case '`':
      case 'h':
      case 'j':
      case 'k':
      case 'm':
      case 'o':
      case 'q':
      case 'u':
      case 'x':
      case 'y':
      case 'z':
      default:
         return this.b(3, 0);
      case '%':
         this.B = 110;
         return this.a(0L, 36028797018963968L);
      case '&':
         this.B = 107;
         return this.a(0L, 4503668346847232L);
      case '(':
         return this.a(0, 76);
      case ')':
         return this.a(0, 77);
      case '*':
         this.B = 105;
         return this.a(0L, 1125899906842624L);
      case '+':
         this.B = 103;
         return this.a(0L, 281612415664128L);
      case ',':
         return this.a(0, 83);
      case '-':
         this.B = 104;
         return this.a(0L, 563224839716864L);
      case '.':
         this.B = 84;
         return this.a(0L, 2097152L);
      case '/':
         this.B = 106;
         return this.a(40L, 2251799813685248L);
      case ':':
         this.B = 93;
         return this.a(0L, 1073741824L);
      case ';':
         return this.a(0, 82);
      case '<':
         this.B = 89;
         return this.a(0L, 72198335821250560L);
      case '=':
         this.B = 86;
         return this.a(0L, 2147483648L);
      case '>':
         this.B = 88;
         return this.a(0L, 432345572817502208L);
      case '?':
         return this.a(0, 92);
      case '@':
         return this.a(0, 123);
      case '[':
         return this.a(0, 80);
      case ']':
         return this.a(0, 81);
      case '^':
         this.B = 109;
         return this.a(0L, 18014398509481984L);
      case 'a':
         return this.a(16384L, 0L);
      case 'b':
         return this.a(229376L, 0L);
      case 'c':
         return this.a(8126464L, 0L);
      case 'd':
         return this.a(58720256L, 0L);
      case 'e':
         return this.a(201326592L, 0L);
      case 'f':
         return this.a(8321499136L, 0L);
      case 'g':
         return this.a(8589934592L, 0L);
      case 'i':
         return this.a(1082331758592L, 0L);
      case 'l':
         return this.a(1099511627776L, 0L);
      case 'n':
         return this.a(15393162788864L, 0L);
      case 'p':
         return this.a(263882790666240L, 0L);
      case 'r':
         return this.a(281474976710656L, 0L);
      case 's':
         return this.a(-9205920588298715136L, 0L);
      case 't':
         return this.a(1134907106097364992L, 0L);
      case 'v':
         return this.a(3458764513820540928L, 0L);
      case 'w':
         return this.a(4611686018427387904L, 0L);
      case '{':
         return this.a(0, 78);
      case '|':
         this.B = 108;
         return this.a(0L, 9007233614479360L);
      case '}':
         return this.a(0, 79);
      case '~':
         return this.a(0, 91);
      }
   }

   private int a(long var1, long var3) {
      try {
         this.v = this.o.a();
      } catch (IOException var6) {
         this.a(0, var1, var3);
         return 1;
      }

      switch(this.v) {
      case '&':
         if((var3 & 68719476736L) != 0L) {
            return this.a(1, 100);
         }
      case '\'':
      case '(':
      case ')':
      case ',':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
      case ';':
      case '?':
      case '@':
      case 'A':
      case 'B':
      case 'C':
      case 'D':
      case 'E':
      case 'F':
      case 'G':
      case 'H':
      case 'I':
      case 'J':
      case 'K':
      case 'L':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'S':
      case 'T':
      case 'U':
      case 'V':
      case 'W':
      case 'X':
      case 'Y':
      case 'Z':
      case '[':
      case '\\':
      case ']':
      case '^':
      case '_':
      case '`':
      case 'c':
      case 'd':
      case 'g':
      case 'j':
      case 'k':
      case 'p':
      case 'q':
      case 's':
      case 'v':
      case 'z':
      case '{':
      default:
         break;
      case '*':
         if((var1 & 32L) != 0L) {
            return this.a(1, 5, 0);
         }
         break;
      case '+':
         if((var3 & 137438953472L) != 0L) {
            return this.a(1, 101);
         }
         break;
      case '-':
         if((var3 & 274877906944L) != 0L) {
            return this.a(1, 102);
         }
         break;
      case '.':
         return this.a(var1, 0L, var3, 2097152L);
      case '/':
         if((var1 & 8L) != 0L) {
            return this.a(1, 3);
         }
         break;
      case ':':
         if((var3 & 1073741824L) != 0L) {
            return this.a(1, 94);
         }
         break;
      case '<':
         if((var3 & 140737488355328L) != 0L) {
            this.B = 111;
            this.A = 1;
         }

         return this.a(var1, 0L, var3, 72057594037927936L);
      case '=':
         if((var3 & 2147483648L) != 0L) {
            return this.a(1, 95);
         }

         if((var3 & 4294967296L) != 0L) {
            return this.a(1, 96);
         }

         if((var3 & 8589934592L) != 0L) {
            return this.a(1, 97);
         }

         if((var3 & 17179869184L) != 0L) {
            return this.a(1, 98);
         }

         if((var3 & 281474976710656L) != 0L) {
            return this.a(1, 112);
         }

         if((var3 & 562949953421312L) != 0L) {
            return this.a(1, 113);
         }

         if((var3 & 1125899906842624L) != 0L) {
            return this.a(1, 114);
         }

         if((var3 & 2251799813685248L) != 0L) {
            return this.a(1, 115);
         }

         if((var3 & 4503599627370496L) != 0L) {
            return this.a(1, 116);
         }

         if((var3 & 9007199254740992L) != 0L) {
            return this.a(1, 117);
         }

         if((var3 & 18014398509481984L) != 0L) {
            return this.a(1, 118);
         }

         if((var3 & 36028797018963968L) != 0L) {
            return this.a(1, 119);
         }
         break;
      case '>':
         if((var3 & 8388608L) != 0L) {
            return this.a(1, 87);
         }

         return this.a(var1, 0L, var3, 432345564227567616L);
      case 'a':
         return this.a(var1, 19791478521856L, var3, 0L);
      case 'b':
         return this.a(var1, 16384L, var3, 0L);
      case 'e':
         return this.a(var1, 285873031610368L, var3, 0L);
      case 'f':
         if((var1 & 17179869184L) != 0L) {
            return this.a(1, 34, 109);
         }
         break;
      case 'h':
         return this.a(var1, 4738349757948231680L, var3, 0L);
      case 'i':
         return this.a(var1, 1610612736L, var3, 0L);
      case 'l':
         return this.a(var1, 2216689664L, var3, 0L);
      case 'm':
         return this.a(var1, 103079215104L, var3, 0L);
      case 'n':
         return this.a(var1, 962072674304L, var3, 0L);
      case 'o':
         if((var1 & 16777216L) != 0L) {
            this.B = 24;
            this.A = 1;
         }

         return this.a(var1, 3458765626254852096L, var3, 0L);
      case 'r':
         return this.a(var1, 1008911869647323136L, var3, 0L);
      case 't':
         return this.a(var1, -9222246136947933184L, var3, 0L);
      case 'u':
         return this.a(var1, 2401333395062784L, var3, 0L);
      case 'w':
         return this.a(var1, 4503599627370496L, var3, 0L);
      case 'x':
         return this.a(var1, 134217728L, var3, 0L);
      case 'y':
         return this.a(var1, 9007199254872064L, var3, 0L);
      case '|':
         if((var3 & 34359738368L) != 0L) {
            return this.a(1, 99);
         }
      }

      return this.b(0, var1, var3);
   }

   private int a(long var1, long var3, long var5, long var7) {
      if(((var3 &= var1) | (var7 &= var5)) == 0L) {
         return this.b(0, var1, var5);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var10) {
            this.a(1, var3, var7);
            return 2;
         }

         switch(this.v) {
         case '.':
            if((var7 & 2097152L) != 0L) {
               return this.a(2, 85);
            }
         case '/':
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
         case ':':
         case ';':
         case '<':
         case '?':
         case '@':
         case 'A':
         case 'B':
         case 'C':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'd':
         case 'g':
         case 'h':
         case 'j':
         case 'k':
         case 'm':
         case 'q':
         case 'v':
         case 'x':
         default:
            break;
         case '=':
            if((var7 & 72057594037927936L) != 0L) {
               return this.a(2, 120);
            }

            if((var7 & 144115188075855872L) != 0L) {
               return this.a(2, 121);
            }
            break;
         case '>':
            return this.b(var3, 0L, var7, 288230376151711744L);
         case 'a':
            return this.b(var3, 145241087985844224L, var7, 0L);
         case 'b':
            return this.b(var3, 140737488355328L, var7, 0L);
         case 'c':
            return this.b(var3, 17592186044416L, var7, 0L);
         case 'e':
            return this.b(var3, 65536L, var7, 0L);
         case 'f':
            return this.b(var3, 8388608L, var7, 0L);
         case 'i':
            return this.b(var3, 5787160705543176192L, var7, 0L);
         case 'l':
            return this.b(var3, 2305851805575151616L, var7, 0L);
         case 'n':
            return this.b(var3, 9008300381175808L, var7, 0L);
         case 'o':
            return this.b(var3, 633320845115392L, var7, 0L);
         case 'p':
            return this.b(var3, 2251902892900352L, var7, 0L);
         case 'r':
            if((var3 & 4294967296L) != 0L) {
               return this.a(2, 32, 109);
            }

            return this.b(var3, -9115285645797883904L, var7, 0L);
         case 's':
            return this.b(var3, 137506340864L, var7, 0L);
         case 't':
            if((var3 & 274877906944L) != 0L) {
               this.B = 38;
               this.A = 2;
            }

            return this.b(var3, 284232480587776L, var7, 0L);
         case 'u':
            return this.b(var3, 288230376185266176L, var7, 0L);
         case 'w':
            if((var3 & 4398046511104L) != 0L) {
               return this.a(2, 42, 109);
            }
            break;
         case 'y':
            if((var3 & 576460752303423488L) != 0L) {
               return this.a(2, 59, 109);
            }
         }

         return this.b(1, var3, var7);
      }
   }

   private int b(long var1, long var3, long var5, long var7) {
      if(((var3 &= var1) | (var7 &= var5)) == 0L) {
         return this.b(1, var1, var5);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var10) {
            this.a(2, var3, var7);
            return 3;
         }

         switch(this.v) {
         case '=':
            if((var7 & 288230376151711744L) != 0L) {
               return this.a(3, 122);
            }
         case '>':
         case '?':
         case '@':
         case 'A':
         case 'B':
         case 'C':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
         case 'I':
         case 'J':
         case 'K':
         case 'L':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'S':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         case 'Z':
         case '[':
         case '\\':
         case ']':
         case '^':
         case '_':
         case '`':
         case 'f':
         case 'h':
         case 'j':
         case 'm':
         case 'p':
         case 'q':
         default:
            break;
         case 'a':
            return this.c(var3, 2305843012980244480L, var7, 0L);
         case 'b':
            return this.c(var3, 33554432L, var7, 0L);
         case 'c':
            return this.c(var3, 9007199255265280L, var7, 0L);
         case 'd':
            if((var3 & 1152921504606846976L) != 0L) {
               return this.a(3, 60, 109);
            }
            break;
         case 'e':
            if((var3 & 131072L) != 0L) {
               return this.a(3, 17, 109);
            }

            if((var3 & 262144L) != 0L) {
               return this.a(3, 18, 109);
            }

            if((var3 & 67108864L) != 0L) {
               return this.a(3, 26, 109);
            }

            if((var3 & 288230376151711744L) != 0L) {
               return this.a(3, 58, 109);
            }

            return this.c(var3, 2252349703716864L, var7, 0L);
         case 'g':
            if((var3 & 1099511627776L) != 0L) {
               return this.a(3, 40, 109);
            }
            break;
         case 'i':
            return this.c(var3, -9223369837831520256L, var7, 0L);
         case 'k':
            return this.c(var3, 17592186044416L, var7, 0L);
         case 'l':
            if((var3 & 8796093022208L) != 0L) {
               return this.a(3, 43, 109);
            }

            return this.c(var3, 4611826790275514368L, var7, 0L);
         case 'n':
            return this.c(var3, 144115188075855872L, var7, 0L);
         case 'o':
            if((var3 & 8589934592L) != 0L) {
               return this.a(3, 33, 109);
            }

            return this.c(var3, 108086459776368640L, var7, 0L);
         case 'r':
            if((var3 & 1048576L) != 0L) {
               return this.a(3, 20, 109);
            }

            return this.c(var3, 562949953421312L, var7, 0L);
         case 's':
            if((var3 & 18014398509481984L) != 0L) {
               return this.a(3, 54, 109);
            }

            return this.c(var3, 270532608L, var7, 0L);
         case 't':
            return this.c(var3, 5700005721554944L, var7, 0L);
         case 'u':
            return this.c(var3, 281474976710656L, var7, 0L);
         case 'v':
            return this.c(var3, 35184372088832L, var7, 0L);
         }

         return this.b(2, var3, var7);
      }
   }

   private int c(long var1, long var3, long var5, long var7) {
      if(((var3 &= var1) | var7 & var5) == 0L) {
         return this.b(2, var1, var5);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var10) {
            this.a(3, var3, 0L);
            return 4;
         }

         switch(this.v) {
         case 'a':
            return this.b(var3, 52913997086720L);
         case 'c':
            return this.b(var3, -9218868437227405312L);
         case 'e':
            if((var3 & 268435456L) != 0L) {
               return this.a(4, 28, 109);
            } else {
               if((var3 & 4611686018427387904L) != 0L) {
                  return this.a(4, 62, 109);
               }

               return this.b(var3, 70403103948800L);
            }
         case 'h':
            if((var3 & 524288L) != 0L) {
               return this.a(4, 19, 109);
            }

            return this.b(var3, 9007199254740992L);
         case 'i':
            return this.b(var3, 1266637399392256L);
         case 'k':
            if((var3 & 65536L) != 0L) {
               return this.a(4, 16, 109);
            }
         case 'b':
         case 'd':
         case 'f':
         case 'g':
         case 'j':
         case 'm':
         case 'o':
         case 'p':
         case 'q':
         default:
            return this.b(3, var3, 0L);
         case 'l':
            if((var3 & 536870912L) != 0L) {
               this.B = 29;
               this.A = 4;
            }

            return this.b(var3, 1107296256L);
         case 'n':
            return this.b(var3, 134217728L);
         case 'r':
            if((var3 & 2251799813685248L) != 0L) {
               return this.a(4, 51, 109);
            }

            return this.b(var3, 282093452017664L);
         case 's':
            if((var3 & 2097152L) != 0L) {
               return this.a(4, 21, 109);
            }

            return this.b(var3, 144115188075855872L);
         case 't':
            if((var3 & 2147483648L) != 0L) {
               return this.a(4, 31, 109);
            } else {
               if((var3 & 562949953421312L) != 0L) {
                  return this.a(4, 49, 109);
               }

               return this.b(var3, 2305843009213693952L);
            }
         case 'u':
            return this.b(var3, 8388608L);
         case 'v':
            return this.b(var3, 2199023255552L);
         case 'w':
            if((var3 & 36028797018963968L) != 0L) {
               this.B = 55;
               this.A = 4;
            }

            return this.b(var3, 72057594037927936L);
         }
      }
   }

   private int b(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(3, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(4, var3, 0L);
            return 5;
         }

         switch(this.v) {
         case 'a':
            return this.c(var3, 49152L);
         case 'b':
         case 'j':
         case 'k':
         case 'o':
         case 'p':
         case 'q':
         default:
            break;
         case 'c':
            if((var3 & 140737488355328L) != 0L) {
               return this.a(5, 47, 109);
            }

            if((var3 & 1125899906842624L) != 0L) {
               return this.a(5, 50, 109);
            }

            return this.c(var3, 70368744177664L);
         case 'd':
            return this.c(var3, 134217728L);
         case 'e':
            if((var3 & 33554432L) != 0L) {
               return this.a(5, 25, 109);
            }

            if((var3 & 2199023255552L) != 0L) {
               return this.a(5, 41, 109);
            }
            break;
         case 'f':
            return this.c(var3, 549755813888L);
         case 'g':
            return this.c(var3, 17592186044416L);
         case 'h':
            if((var3 & 4503599627370496L) != 0L) {
               return this.a(5, 52, 109);
            }
            break;
         case 'i':
            return this.c(var3, 2449958197289549824L);
         case 'l':
            return this.c(var3, 1082130432L);
         case 'm':
            return this.c(var3, 34359738368L);
         case 'n':
            if((var3 & 281474976710656L) != 0L) {
               return this.a(5, 48, 109);
            }

            return this.c(var3, 137443147776L);
         case 'r':
            return this.c(var3, 9007199254740992L);
         case 's':
            if((var3 & 72057594037927936L) != 0L) {
               return this.a(5, 56, 109);
            }
            break;
         case 't':
            if((var3 & 68719476736L) != 0L) {
               return this.a(5, 36, 109);
            }

            return this.c(var3, -9223336852482686976L);
         }

         return this.b(4, var3, 0L);
      }
   }

   private int c(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(4, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(5, var3, 0L);
            return 6;
         }

         switch(this.v) {
         case 'a':
            return this.d(var3, 549755813888L);
         case 'b':
         case 'd':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'm':
         case 'p':
         case 'q':
         case 'r':
         case 'v':
         case 'w':
         case 'x':
         default:
            break;
         case 'c':
            return this.d(var3, 137438969856L);
         case 'e':
            if((var3 & 17592186044416L) != 0L) {
               return this.a(6, 44, 109);
            }

            if((var3 & 35184372088832L) != 0L) {
               return this.a(6, 45, 109);
            }

            return this.d(var3, 144115222435594240L);
         case 'f':
            return this.d(var3, Long.MIN_VALUE);
         case 'l':
            return this.d(var3, 2305843009213693952L);
         case 'n':
            if((var3 & 32768L) != 0L) {
               return this.a(6, 15, 109);
            }
            break;
         case 'o':
            return this.d(var3, 9007199254740992L);
         case 's':
            if((var3 & 134217728L) != 0L) {
               return this.a(6, 27, 109);
            }
            break;
         case 't':
            if((var3 & 8388608L) != 0L) {
               return this.a(6, 23, 109);
            }

            return this.d(var3, 70368744177664L);
         case 'u':
            return this.d(var3, 4194304L);
         case 'y':
            if((var3 & 1073741824L) != 0L) {
               return this.a(6, 30, 109);
            }
         }

         return this.b(5, var3, 0L);
      }
   }

   private int d(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(5, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(6, var3, 0L);
            return 7;
         }

         switch(this.v) {
         case 'c':
            return this.e(var3, 549755813888L);
         case 'e':
            if((var3 & 4194304L) != 0L) {
               return this.a(7, 22, 109);
            }

            if((var3 & 2305843009213693952L) != 0L) {
               return this.a(7, 61, 109);
            }

            return this.e(var3, 70506183131136L);
         case 'n':
            return this.e(var3, 153122421690335232L);
         case 'p':
            if((var3 & Long.MIN_VALUE) != 0L) {
               return this.a(7, 63, 109);
            }
            break;
         case 't':
            if((var3 & 16384L) != 0L) {
               return this.a(7, 14, 109);
            }
         }

         return this.b(6, var3, 0L);
      }
   }

   private int e(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(6, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(7, var3, 0L);
            return 8;
         }

         switch(this.v) {
         case 'd':
            if((var3 & 70368744177664L) != 0L) {
               return this.a(8, 46, 109);
            }
            break;
         case 'e':
            if((var3 & 549755813888L) != 0L) {
               return this.a(8, 39, 109);
            }
            break;
         case 'i':
            return this.f(var3, 9007199254740992L);
         case 'o':
            return this.f(var3, 137438953472L);
         case 't':
            if((var3 & 144115188075855872L) != 0L) {
               return this.a(8, 57, 109);
            }

            return this.f(var3, 34359738368L);
         }

         return this.b(7, var3, 0L);
      }
   }

   private int f(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(7, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(8, var3, 0L);
            return 9;
         }

         switch(this.v) {
         case 'f':
            if((var3 & 137438953472L) != 0L) {
               return this.a(9, 37, 109);
            }
            break;
         case 's':
            if((var3 & 34359738368L) != 0L) {
               return this.a(9, 35, 109);
            }
            break;
         case 'z':
            return this.g(var3, 9007199254740992L);
         }

         return this.b(8, var3, 0L);
      }
   }

   private int g(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(8, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(9, var3, 0L);
            return 10;
         }

         switch(this.v) {
         case 'e':
            return this.h(var3, 9007199254740992L);
         default:
            return this.b(9, var3, 0L);
         }
      }
   }

   private int h(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(9, var1, 0L);
      } else {
         try {
            this.v = this.o.a();
         } catch (IOException var6) {
            this.a(10, var3, 0L);
            return 11;
         }

         switch(this.v) {
         case 'd':
            if((var3 & 9007199254740992L) != 0L) {
               return this.a(11, 53, 109);
            }
         default:
            return this.b(10, var3, 0L);
         }
      }
   }

   private int a(int var1, int var2, int var3) {
      this.B = var2;
      this.A = var1;

      try {
         this.v = this.o.a();
      } catch (IOException var5) {
         return var1 + 1;
      }

      return this.b(var3, var1 + 1);
   }

   private int b(int var1, int var2) {
      int var3 = 0;
      this.y = 109;
      int var4 = 1;
      this.q[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.z == Integer.MAX_VALUE) {
            this.f();
         }

         long var14;
         if(this.v < 64) {
            var14 = 1L << this.v;

            do {
               --var4;
               switch(this.q[var4]) {
               case 0:
                  if(this.v == 42) {
                     this.q[this.y++] = 1;
                  }
                  break;
               case 1:
                  if((-140737488355329L & var14) != 0L && var5 > 4) {
                     var5 = 4;
                  }
                  break;
               case 2:
                  if(this.v == 42) {
                     this.q[this.y++] = 0;
                  }
                  break;
               case 3:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(0, 11);
                  } else if((9216L & var14) != 0L) {
                     if(var5 > 10) {
                        var5 = 10;
                     }
                  } else if(this.v == 36) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  } else if(this.v == 34) {
                     this.f(12, 15);
                  } else if(this.v == 39) {
                     this.d(16, 18);
                  } else if(this.v == 46) {
                     this.b(11);
                  } else if(this.v == 47) {
                     this.q[this.y++] = 2;
                  }

                  if((287667426198290432L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(8, 9);
                  } else if(this.v == 48) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.f(19, 25);
                  } else if(this.v == 13) {
                     this.q[this.y++] = 5;
                  }
                  break;
               case 4:
                  if((9216L & var14) != 0L && var5 > 10) {
                     var5 = 10;
                  }
                  break;
               case 5:
                  if(this.v == 10 && var5 > 10) {
                     var5 = 10;
                  }
                  break;
               case 6:
                  if(this.v == 13) {
                     this.q[this.y++] = 5;
                  }
                  break;
               case 7:
                  if((287667426198290432L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(8, 9);
                  }
                  break;
               case 8:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(8, 9);
                  }
               case 9:
               case 12:
               case 14:
               case 17:
               case 21:
               case 27:
               case 32:
               case 35:
               case 37:
               case 42:
               case 50:
               case 55:
               case 57:
               case 60:
               case 64:
               case 68:
               case 70:
               case 76:
               case 78:
               case 83:
               case 84:
               case 89:
               case 94:
               case 97:
               case 99:
               case 102:
               case 105:
               default:
                  break;
               case 10:
                  if(this.v == 46) {
                     this.b(11);
                  }
                  break;
               case 11:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.f(26, 29);
                  }
                  break;
               case 13:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.f(30, 32);
                  }
                  break;
               case 15:
                  if((43980465111040L & var14) != 0L) {
                     this.b(16);
                  }
                  break;
               case 16:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.e(16, 17);
                  }
                  break;
               case 18:
                  if(this.v == 39) {
                     this.d(16, 18);
                  }
                  break;
               case 19:
                  if((-549755823105L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 20:
                  if(this.v == 39 && var5 > 71) {
                     var5 = 71;
                  }
                  break;
               case 22:
                  if((566935683072L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 23:
                  if((71776119061217280L & var14) != 0L) {
                     this.e(24, 20);
                  }
                  break;
               case 24:
                  if((71776119061217280L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 25:
                  if((4222124650659840L & var14) != 0L) {
                     this.q[this.y++] = 26;
                  }
                  break;
               case 26:
                  if((71776119061217280L & var14) != 0L) {
                     this.b(24);
                  }
                  break;
               case 28:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 29;
                  }
                  break;
               case 29:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 30;
                  }
                  break;
               case 30:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 31;
                  }
                  break;
               case 31:
                  if((287948901175001088L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 33:
                  if(this.v == 34) {
                     this.f(12, 15);
                  }
                  break;
               case 34:
                  if((-17179878401L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 36:
                  if((566935683072L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 38:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 39;
                  }
                  break;
               case 39:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 40;
                  }
                  break;
               case 40:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 41;
                  }
                  break;
               case 41:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 43:
                  if(this.v == 34 && var5 > 72) {
                     var5 = 72;
                  }
                  break;
               case 44:
                  if((71776119061217280L & var14) != 0L) {
                     this.f(33, 37);
                  }
                  break;
               case 45:
                  if((71776119061217280L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 46:
                  if((4222124650659840L & var14) != 0L) {
                     this.q[this.y++] = 47;
                  }
                  break;
               case 47:
                  if((71776119061217280L & var14) != 0L) {
                     this.b(45);
                  }
                  break;
               case 48:
                  if(this.v == 36) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 49:
               case 109:
                  if((287948969894477824L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 51:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 52;
                  }
                  break;
               case 52:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 53;
                  }
                  break;
               case 53:
               case 92:
                  if((287948901175001088L & var14) != 0L) {
                     this.b(54);
                  }
                  break;
               case 54:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 56:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(0, 11);
                  }
                  break;
               case 58:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(59, 66);
                  }
                  break;
               case 59:
                  if(this.v == 46) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.f(38, 40);
                  }
                  break;
               case 61:
                  if((43980465111040L & var14) != 0L) {
                     this.b(62);
                  }
                  break;
               case 62:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.e(62, 17);
                  }
                  break;
               case 63:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.f(41, 44);
                  }
                  break;
               case 65:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.f(38, 40);
                  }
                  break;
               case 66:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(45, 47);
                  }
                  break;
               case 67:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(67, 68);
                  }
                  break;
               case 69:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(70, 73);
                  }
                  break;
               case 71:
                  if((43980465111040L & var14) != 0L) {
                     this.b(72);
                  }
                  break;
               case 72:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.e(72, 17);
                  }
                  break;
               case 73:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(48, 52);
                  }
                  break;
               case 74:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(53, 56);
                  }
                  break;
               case 75:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(75, 76);
                  }
                  break;
               case 77:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(57, 59);
                  }
                  break;
               case 79:
                  if((43980465111040L & var14) != 0L) {
                     this.b(80);
                  }
                  break;
               case 80:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(80, 17);
                  }
                  break;
               case 81:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(60, 65);
                  }
                  break;
               case 82:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(66, 70);
                  }
                  break;
               case 85:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 86;
                  }
                  break;
               case 86:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 87;
                  }
                  break;
               case 87:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 88;
                  }
                  break;
               case 88:
                  if((287948901175001088L & var14) != 0L && var5 > 12) {
                     var5 = 12;
                  }
                  break;
               case 90:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 91;
                  }
                  break;
               case 91:
                  if((287948901175001088L & var14) != 0L) {
                     this.q[this.y++] = 92;
                  }
                  break;
               case 93:
                  if(this.v == 48) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.f(19, 25);
                  }
                  break;
               case 95:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(95, 9);
                  }
                  break;
               case 96:
                  if((71776119061217280L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(96, 9);
                  }
                  break;
               case 98:
                  if((844424930131968L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(98, 9);
                  }
                  break;
               case 100:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(71, 73);
                  }
                  break;
               case 101:
                  if(this.v == 46) {
                     this.b(102);
                  }
                  break;
               case 103:
                  if((43980465111040L & var14) != 0L) {
                     this.b(104);
                  }
                  break;
               case 104:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 68) {
                        var5 = 68;
                     }

                     this.e(104, 17);
                  }
                  break;
               case 106:
                  if((287948901175001088L & var14) != 0L) {
                     this.d(74, 75);
                  }
                  break;
               case 107:
                  if(this.v == 46) {
                     this.b(108);
                  }
                  break;
               case 108:
                  if((287948901175001088L & var14) != 0L) {
                     this.e(108, 102);
                  }
               }
            } while(var4 != var3);
         } else if(this.v < 128) {
            var14 = 1L << (this.v & 63);

            do {
               --var4;
               switch(this.q[var4]) {
               case 1:
                  if(var5 > 4) {
                     var5 = 4;
                  }
               case 2:
               case 4:
               case 5:
               case 6:
               case 7:
               case 10:
               case 11:
               case 13:
               case 15:
               case 16:
               case 18:
               case 20:
               case 23:
               case 24:
               case 25:
               case 26:
               case 33:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 56:
               case 58:
               case 59:
               case 61:
               case 62:
               case 63:
               case 65:
               case 66:
               case 67:
               case 69:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 77:
               case 79:
               case 80:
               case 81:
               case 82:
               case 93:
               case 101:
               case 103:
               case 104:
               case 107:
               default:
                  break;
               case 3:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  } else if(this.v == 92) {
                     this.d(76, 77);
                  }
                  break;
               case 8:
                  if(this.v == 95) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(8, 9);
                  }
                  break;
               case 9:
                  if((17592186048512L & var14) != 0L && var5 > 64) {
                     var5 = 64;
                  }
                  break;
               case 12:
                  if(this.v == 95) {
                     this.q[this.y++] = 13;
                  }
                  break;
               case 14:
                  if((137438953504L & var14) != 0L) {
                     this.d(78, 79);
                  }
                  break;
               case 17:
                  if((343597383760L & var14) != 0L && var5 > 68) {
                     var5 = 68;
                  }
                  break;
               case 19:
                  if((-268435457L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 21:
                  if(this.v == 92) {
                     this.d(80, 82);
                  }
                  break;
               case 22:
                  if((5700160604602368L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 27:
                  if(this.v == 117) {
                     this.q[this.y++] = 28;
                  }
                  break;
               case 28:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 29;
                  }
                  break;
               case 29:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 30;
                  }
                  break;
               case 30:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 31;
                  }
                  break;
               case 31:
                  if((541165879422L & var14) != 0L) {
                     this.b(20);
                  }
                  break;
               case 32:
                  if(this.v == 92) {
                     this.q[this.y++] = 27;
                  }
                  break;
               case 34:
                  if((-268435457L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 35:
                  if(this.v == 92) {
                     this.d(83, 85);
                  }
                  break;
               case 36:
                  if((5700160604602368L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 37:
                  if(this.v == 117) {
                     this.q[this.y++] = 38;
                  }
                  break;
               case 38:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 39;
                  }
                  break;
               case 39:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 40;
                  }
                  break;
               case 40:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 41;
                  }
                  break;
               case 41:
                  if((541165879422L & var14) != 0L) {
                     this.f(12, 15);
                  }
                  break;
               case 42:
                  if(this.v == 92) {
                     this.q[this.y++] = 37;
                  }
                  break;
               case 48:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 49:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 50:
                  if(this.v == 117) {
                     this.q[this.y++] = 51;
                  }
                  break;
               case 51:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 52;
                  }
                  break;
               case 52:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 53;
                  }
                  break;
               case 53:
               case 92:
                  if((541165879422L & var14) != 0L) {
                     this.b(54);
                  }
                  break;
               case 54:
                  if((541165879422L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 55:
                  if(this.v == 92) {
                     this.q[this.y++] = 50;
                  }
                  break;
               case 57:
                  if(this.v == 95) {
                     this.q[this.y++] = 58;
                  }
                  break;
               case 60:
                  if((137438953504L & var14) != 0L) {
                     this.d(86, 87);
                  }
                  break;
               case 64:
                  if(this.v == 95) {
                     this.q[this.y++] = 65;
                  }
                  break;
               case 68:
                  if(this.v == 95) {
                     this.q[this.y++] = 69;
                  }
                  break;
               case 70:
                  if((137438953504L & var14) != 0L) {
                     this.d(88, 89);
                  }
                  break;
               case 76:
                  if(this.v == 95) {
                     this.q[this.y++] = 77;
                  }
                  break;
               case 78:
                  if((137438953504L & var14) != 0L) {
                     this.d(90, 91);
                  }
                  break;
               case 83:
                  if(this.v == 92) {
                     this.d(76, 77);
                  }
                  break;
               case 84:
                  if(this.v == 117) {
                     this.q[this.y++] = 85;
                  }
                  break;
               case 85:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 86;
                  }
                  break;
               case 86:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 87;
                  }
                  break;
               case 87:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 88;
                  }
                  break;
               case 88:
                  if((541165879422L & var14) != 0L && var5 > 12) {
                     var5 = 12;
                  }
                  break;
               case 89:
                  if(this.v == 117) {
                     this.q[this.y++] = 90;
                  }
                  break;
               case 90:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 91;
                  }
                  break;
               case 91:
                  if((541165879422L & var14) != 0L) {
                     this.q[this.y++] = 92;
                  }
                  break;
               case 94:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(95);
                  }
                  break;
               case 95:
                  if((543313363070L & var14) != 0L) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(95, 9);
                  }
                  break;
               case 96:
                  if(this.v == 95) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(96, 9);
                  }
                  break;
               case 97:
                  if((17179869188L & var14) != 0L) {
                     this.b(98);
                  }
                  break;
               case 98:
                  if(this.v == 95) {
                     if(var5 > 64) {
                        var5 = 64;
                     }

                     this.e(98, 9);
                  }
                  break;
               case 99:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(100);
                  }
                  break;
               case 100:
                  if((543313363070L & var14) != 0L) {
                     this.f(71, 73);
                  }
                  break;
               case 102:
                  if((281474976776192L & var14) != 0L) {
                     this.d(92, 93);
                  }
                  break;
               case 105:
                  if((72057594054705152L & var14) != 0L) {
                     this.e(106, 107);
                  }
                  break;
               case 106:
                  if((541165879422L & var14) != 0L) {
                     this.e(106, 107);
                  }
                  break;
               case 108:
                  if((541165879422L & var14) != 0L) {
                     this.e(108, 102);
                  }
                  break;
               case 109:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  } else if(this.v == 92) {
                     this.q[this.y++] = 50;
                  }
               }
            } while(var4 != var3);
         } else {
            int var6 = this.v >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.v & 255) >> 6;
            long var11 = 1L << (this.v & 63);

            do {
               --var4;
               switch(this.q[var4]) {
               case 1:
                  if(a(var6, var7, var10, var8, var11) && var5 > 4) {
                     var5 = 4;
                  }
                  break;
               case 3:
                  if(b(var6, var7, var10, var8, var11)) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
                  break;
               case 19:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.q[this.y++] = 20;
                  }
                  break;
               case 34:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.d(12, 15);
                  }
                  break;
               case 49:
               case 109:
                  if(b(var6, var7, var10, var8, var11)) {
                     if(var5 > 73) {
                        var5 = 73;
                     }

                     this.e(49, 55);
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.B = var5;
            this.A = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.y) == (var3 = 109 - (this.y = var3))) {
            return var2;
         }

         try {
            this.v = this.o.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int b() {
      switch(this.v) {
      case '*':
         return this.a(256L);
      default:
         return 1;
      }
   }

   private int a(long var1) {
      try {
         this.v = this.o.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.v) {
      case '/':
         if((var1 & 256L) != 0L) {
            return this.a(1, 8);
         }

         return 2;
      default:
         return 2;
      }
   }

   private int c() {
      return this.c(4, 0);
   }

   private int c(int var1, int var2) {
      int var3 = 0;
      this.y = 4;
      int var4 = 1;
      this.q[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.z == Integer.MAX_VALUE) {
            this.f();
         }

         long var14;
         if(this.v < 64) {
            var14 = 1L << this.v;

            do {
               --var4;
               switch(this.q[var4]) {
               case 0:
                  if((-67118081L & var14) != 0L) {
                     var5 = 6;
                     this.f(94, 96);
                  }
                  break;
               case 1:
                  if((9216L & var14) != 0L && var5 > 6) {
                     var5 = 6;
                  }
                  break;
               case 2:
                  if(this.v == 10 && var5 > 6) {
                     var5 = 6;
                  }
                  break;
               case 3:
                  if(this.v == 13) {
                     this.q[this.y++] = 2;
                  }
                  break;
               case 4:
                  if((-67118081L & var14) != 0L) {
                     if(var5 > 6) {
                        var5 = 6;
                     }

                     this.f(94, 96);
                  } else if((9216L & var14) != 0L && var5 > 6) {
                     var5 = 6;
                  }

                  if(this.v == 13) {
                     this.q[this.y++] = 2;
                  }
               }
            } while(var4 != var3);
         } else if(this.v < 128) {
            var14 = 1L << (this.v & 63);

            do {
               --var4;
               switch(this.q[var4]) {
               case 0:
               case 4:
                  var5 = 6;
                  this.f(94, 96);
               }
            } while(var4 != var3);
         } else {
            int var6 = this.v >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.v & 255) >> 6;
            long var11 = 1L << (this.v & 63);

            do {
               --var4;
               switch(this.q[var4]) {
               case 0:
               case 4:
                  if(a(var6, var7, var10, var8, var11)) {
                     if(var5 > 6) {
                        var5 = 6;
                     }

                     this.f(94, 96);
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.B = var5;
            this.A = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.y) == (var3 = 4 - (this.y = var3))) {
            return var2;
         }

         try {
            this.v = this.o.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int d() {
      switch(this.v) {
      case '*':
         return this.b(128L);
      default:
         return 1;
      }
   }

   private int b(long var1) {
      try {
         this.v = this.o.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.v) {
      case '/':
         if((var1 & 128L) != 0L) {
            return this.a(1, 7);
         }

         return 2;
      default:
         return 2;
      }
   }

   private int e() {
      switch(this.v) {
      case '*':
         return this.c(512L);
      default:
         return 1;
      }
   }

   private int c(long var1) {
      try {
         this.v = this.o.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.v) {
      case '/':
         if((var1 & 512L) != 0L) {
            return this.a(1, 9);
         }

         return 2;
      default:
         return 2;
      }
   }

   private static final boolean a(int var0, int var1, int var2, long var3, long var5) {
      switch(var0) {
      case 0:
         return (c[var2] & var5) != 0L;
      default:
         return (b[var1] & var3) != 0L;
      }
   }

   private static final boolean b(int var0, int var1, int var2, long var3, long var5) {
      switch(var0) {
      case 0:
         return (e[var2] & var5) != 0L;
      case 48:
         return (f[var2] & var5) != 0L;
      case 49:
         return (g[var2] & var5) != 0L;
      case 51:
         return (h[var2] & var5) != 0L;
      case 61:
         return (i[var2] & var5) != 0L;
      default:
         return (d[var1] & var3) != 0L;
      }
   }

   public i(jindent.formatter.a.b var1) {
      this.a = System.out;
      this.p = new int[109];
      this.q = new int[218];
      this.r = new StringBuffer();
      this.s = this.r;
      this.w = 0;
      this.x = 0;
      this.o = var1;
   }

   public i(jindent.formatter.a.b var1, int var2) {
      this(var1);
      this.a(var2);
   }

   public void a(jindent.formatter.a.b var1) {
      this.A = this.y = 0;
      this.w = this.x;
      this.o = var1;
      this.f();
   }

   private void f() {
      this.z = -2147483647;

      for(int var1 = 109; var1-- > 0; this.p[var1] = Integer.MIN_VALUE) {
         ;
      }

   }

   public void a(jindent.formatter.a.b var1, int var2) {
      this.a(var1);
      this.a(var2);
   }

   public void a(int var1) {
      if(var1 < 5 && var1 >= 0) {
         this.w = var1;
      } else {
         throw new TokenMgrError(a("\u001d\u0003E\u0001}bQ~\ta7\u0003^\u0000hx\u0018Y\u0018n4\u0018SNc=\t^\rn4QD\u001an,\u0014\u0017T/") + var1 + a("vQd\u001an,\u0014\u0017\u001ba;\u0019V\u0000h=\u0015\u0019"), 2);
      }
   }

   protected q g() {
      String var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if(this.A < 0) {
         if(this.s == null) {
            var2 = "";
         } else {
            var2 = this.s.toString();
         }

         var3 = var4 = this.o.g();
         var5 = var6 = this.o.f();
      } else {
         String var7 = jjstrLiteralImages[this.B];
         var2 = var7 == null?this.o.i():var7;
         var3 = this.o.g();
         var5 = this.o.f();
         var4 = this.o.e();
         var6 = this.o.d();
      }

      q var1 = q.a(this.B, var2);
      var1.b = var3;
      var1.d = var4;
      var1.c = var5;
      var1.e = var6;
      return var1;
   }

   public q h() {
      q var1 = null;
      int var3 = 0;

      label137:
      while(true) {
         q var2;
         try {
            this.v = this.o.h();
         } catch (IOException var9) {
            this.B = 0;
            var2 = this.g();
            var2.h = var1;
            this.a(var2);
            return var2;
         }

         this.s = this.r;
         this.s.setLength(0);
         this.t = 0;

         while(true) {
            switch(this.w) {
            case 0:
               try {
                  this.o.a(0);

                  while(this.v <= 32 && (4294971392L & 1L << this.v) != 0L) {
                     this.v = this.o.h();
                  }
               } catch (IOException var12) {
                  continue label137;
               }

               this.B = Integer.MAX_VALUE;
               this.A = 0;
               var3 = this.a();
               break;
            case 1:
               this.B = 6;
               this.A = -1;
               boolean var13 = false;
               var3 = this.c();
               if(this.A < 0 || this.A == 0 && this.B > 11) {
                  this.B = 11;
                  this.A = 0;
               }
               break;
            case 2:
               this.B = Integer.MAX_VALUE;
               this.A = 0;
               var3 = this.d();
               if(this.A == 0 && this.B > 11) {
                  this.B = 11;
               }
               break;
            case 3:
               this.B = Integer.MAX_VALUE;
               this.A = 0;
               var3 = this.b();
               if(this.A == 0 && this.B > 11) {
                  this.B = 11;
               }
               break;
            case 4:
               this.B = Integer.MAX_VALUE;
               this.A = 0;
               var3 = this.e();
               if(this.A == 0 && this.B > 11) {
                  this.B = 11;
               }
            }

            if(this.B == Integer.MAX_VALUE) {
               break label137;
            }

            if(this.A + 1 < var3) {
               this.o.a(var3 - this.A - 1);
            }

            if((k[this.B >> 6] & 1L << (this.B & 63)) != 0L) {
               var2 = this.g();
               var2.h = var1;
               if(jjnewLexState[this.B] != -1) {
                  this.w = jjnewLexState[this.B];
               }

               this.a(var2);
               return var2;
            }

            if((l[this.B >> 6] & 1L << (this.B & 63)) != 0L) {
               if((m[this.B >> 6] & 1L << (this.B & 63)) != 0L) {
                  var2 = this.g();
                  if(var1 == null) {
                     var1 = var2;
                  } else {
                     var2.h = var1;
                     var1 = var1.g = var2;
                  }

                  this.b(var2);
               } else {
                  this.b((q)null);
               }

               if(jjnewLexState[this.B] != -1) {
                  this.w = jjnewLexState[this.B];
               }
               break;
            }

            this.i();
            if(jjnewLexState[this.B] != -1) {
               this.w = jjnewLexState[this.B];
            }

            var3 = 0;
            this.B = Integer.MAX_VALUE;

            try {
               this.v = this.o.a();
            } catch (IOException var11) {
               break label137;
            }
         }
      }

      int var4 = this.o.e();
      int var5 = this.o.d();
      String var6 = null;
      boolean var7 = false;

      try {
         this.o.a();
         this.o.a(1);
      } catch (IOException var10) {
         var7 = true;
         var6 = var3 <= 1?"":this.o.i();
         if(this.v != 10 && this.v != 13) {
            ++var5;
         } else {
            ++var4;
            var5 = 0;
         }
      }

      if(!var7) {
         this.o.a(1);
         var6 = var3 <= 1?"":this.o.i();
      }

      throw new TokenMgrError(var7, this.w, var4, var5, var6, this.v, 0);
   }

   void b(q var1) {
      switch(this.B) {
      default:
      }
   }

   void i() {
      this.t += this.u = this.A + 1;
      switch(this.B) {
      case 4:
         this.s.append(this.o.b(this.t));
         this.t = 0;
         this.o.a(1);
      default:
      }
   }

   private void b(int var1) {
      if(this.p[var1] != this.z) {
         this.q[this.y++] = var1;
         this.p[var1] = this.z;
      }

   }

   private void d(int var1, int var2) {
      do {
         this.q[this.y++] = j[var1];
      } while(var1++ != var2);

   }

   private void e(int var1, int var2) {
      this.b(var1);
      this.b(var2);
   }

   private void f(int var1, int var2) {
      do {
         this.b(j[var1]);
      } while(var1++ != var2);

   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 88;
            break;
         case 1:
            var10003 = 113;
            break;
         case 2:
            var10003 = 55;
            break;
         case 3:
            var10003 = 110;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
