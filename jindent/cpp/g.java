package jindent.cpp;

import java.io.IOException;
import java.io.PrintStream;
import jindent.cpp.TokenMgrError;
import jindent.cpp.f;
import jindent.formatter.q;
import jindent.formatter.a.b;
import jindent.formatter.a.c;

public class g implements f {
   public PrintStream a;
   static final long[] b = new long[]{-2L, -1L, -1L, -1L};
   static final long[] c = new long[]{0L, 0L, -1L, -1L};
   static final int[] d = new int[]{92, 93, 95, 3, 96, 97, 105, 107, 110, 113, 115, 117, 119, 24, 25, 27, 10, 11, 13, 58, 59, 60, 62, 63, 64, 65, 66, 69, 73, 75, 80, 83, 43, 44, 45, 47, 48, 49, 50, 51, 54, 4, 5, 8, 10, 11, 15, 13, 10, 11, 17, 13, 10, 11, 19, 13, 21, 22, 24, 25, 29, 27, 24, 25, 31, 27, 24, 25, 33, 27, 35, 36, 44, 45, 47, 50, 51, 54, 59, 60, 62, 65, 66, 69, 76, 77, 79, 81, 82, 84, 85, 88, 94, 5, 8, 1, 40, 41, 9, 23, 6, 7, 12, 14, 16, 18, 20, 26, 28, 30, 32, 34, 98, 99, 2, 3, 5, 10, 12, 0, 1, 3};
   public static final String[] jjstrLiteralImages = new String[]{"", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "{", "}", "[", "]", "(", ")", a("\u0004\r"), ":", ";", ",", "?", a("\u0010\u0019c"), "=", a("\u0014\n"), a("\u0011\n"), a("\u001b\n"), a("\u0015\n"), a("\u0013\n"), a("\u0002\u000bp"), a("\u0000\tp"), a("\u0018\n"), a("`\n"), a("B\n"), a("BK"), a("\u0018\u0011"), "|", "^", "&", a("\u0003\n"), a("\u001f\n"), "<", ">", a("\u0002\n"), a("\u0000\n"), a("\u0002\u000b"), "+", "-", "*", "/", "%", a("\u0015\u001c"), a("\u0013\u001a"), "~", "!", ".", a("\u0013\t"), a("\u0010\u001d"), a("\u0013\tg"), a("_B98"), a("\\E(68"), a("\\X\";"), a("]V>2"), a("]V94;"), a("]_,%"), a("]X#$\'"), a("]X##:PB("), a("ZR+6&RC"), a("ZR!2\'["), a("ZX"), a("ZX85?["), a("[[>2"), a("[Y8:"), a("[O=;:]^9"), a("[O92!P"), a("X[\"6\'"), a("XX?"), a("XE$2=Z"), a("X^#6?RN"), a("YX98"), a("WQ"), a("WY!>=["), a("WY9"), a("RX#0"), a("PR:"), a("NE$!2JR"), a("NE\"#6]C(3"), a("NB/;:]"), a("LR)20RV?27"), a("LR*> JR?"), a("LR9\"!P"), a("M_\"%\'"), a("M^*96Z"), a("M^72<X"), a("MC,#:]"), a("MC?\"0J"), a("][,$ "), a("M@$#0V"), a("JR \'?_C("), a("J_$$"), a("JE4"), a("JN=27[Q"), a("KY$8="), a("KY>>4PR)"), a("H^?#&_["), a("HX$3"), a("HX!6\'W[("), a("I_$;6"), a("QG(%2JX?"), a("JE82"), a("XV!$6"), a("J_?8$"), a("PV 2 NV.2"), a("KD$94"), a("JN=2=_Z("), a("MC,#:]h.6 J"), a("LR$9\'[E=%6Jh.6 J"), a("]X#$\'aT,$\'"), a("ZN#6>WT\u001242MC"), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "\\"};
   public static final String[] lexStateNames = new String[]{a("zr\u000b\u0016\u0006rc"), a("wy\u0012\u0004\u001app\u0001\u0012\fr~\u0003\u0012\f}x\u0000\u001a\u0016pc"), a("wy\u0012\u0013\u001cfn\n\u0012\u001daz\u0018\u001b\u0007wh\u0001\u001e\u001d{h\u000e\u0018\u001esr\u0003\u0003"), a("wy\u0012\u0013\u001cfn\n\u0012\u001da}\f\u0001\u0012zx\u000e\b\u0010qz\u0000\u0012\u001dj"), a("wy\u0012\u0013\u001cfn\n\u0012\u001dad\u0004\u0019\u0014rr\u0012\u001b\u001apr\u0012\u0014\u001csz\b\u0019\u0007"), a("wy\u0012\u001a\u0006rc\u0004\b\u001fwy\b\b\u0010qz\u0000\u0012\u001dj"), a("wy\u0012\u0007\u0001{g\u001f\u0018\u0010{d\u001e\u0018\u0001ax\u0018\u0003\u0003kc")};
   public static final int[] jjnewLexState = new int[]{-1, -1, -1, -1, 2, 3, 4, 5, 1, 6, 0, 0, 0, 0, 0, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   static final long[] e = new long[]{-524287L, -1L, 131071L};
   static final long[] f = new long[]{326670L, 0L, 0L};
   static final long[] g = new long[]{326656L, 0L, 0L};
   static final long[] h = new long[]{197616L, 0L, 0L};
   protected b i;
   private final int[] j;
   private final int[] k;
   private final StringBuffer l;
   private StringBuffer m;
   private int n;
   private int o;
   protected char p;
   int q;
   int r;
   int s;
   int t;
   int u;
   int v;

   void a(q var1) {
      var1.s = ((c)this.i).u();
   }

   public void a(PrintStream var1) {
      this.a = var1;
   }

   private final int a(int var1, long var2, long var4, long var6) {
      switch(var1) {
      case 0:
         if((var2 & 144115196665790848L) != 0L) {
            return 105;
         } else {
            if((var2 & -9223372035781033984L) == 0L && (var4 & 2L) == 0L) {
               if((var4 & 9223372036854775800L) != 0L) {
                  this.v = 143;
                  return 38;
               }

               if((var6 & 65536L) != 0L) {
                  return 40;
               }

               return -1;
            }

            return 4;
         }
      case 1:
         if((var4 & 16801792L) != 0L) {
            return 38;
         } else if((var2 & 128L) != 0L) {
            return 103;
         } else if((var2 & 256L) != 0L) {
            return 114;
         } else {
            if((var4 & 9223372036837974008L) != 0L) {
               if(this.u != 1) {
                  this.v = 143;
                  this.u = 1;
               }

               return 38;
            }

            return -1;
         }
      case 2:
         if((var4 & 9223354444315353080L) != 0L) {
            this.v = 143;
            this.u = 2;
            return 38;
         } else {
            if((var4 & 17592522637312L) != 0L) {
               return 38;
            }

            return -1;
         }
      case 3:
         if((var4 & 9578945443889512L) != 0L) {
            return 38;
         } else {
            if((var4 & 9213775498871463568L) != 0L) {
               this.v = 143;
               this.u = 3;
               return 38;
            }

            return -1;
         }
      case 4:
         if((var4 & 2506324695247749776L) != 0L) {
            return 38;
         } else {
            if((var4 & 6707450803623713792L) != 0L) {
               if(this.u != 4) {
                  this.v = 143;
                  this.u = 4;
               }

               return 38;
            }

            return -1;
         }
      case 5:
         if((var4 & 8436829811355290624L) != 0L) {
            if(this.u != 5) {
               this.v = 143;
               this.u = 5;
            }

            return 38;
         } else {
            if((var4 & 576464001482117120L) != 0L) {
               return 38;
            }

            return -1;
         }
      case 6:
         if((var4 & 316659889866752L) != 0L) {
            return 38;
         } else {
            if((var4 & 9012973903768847360L) != 0L) {
               this.v = 143;
               this.u = 6;
               return 38;
            }

            return -1;
         }
      case 7:
         if((var4 & 294005019810857984L) != 0L) {
            return 38;
         } else {
            if((var4 & 8718968883957989376L) != 0L) {
               this.v = 143;
               this.u = 7;
               return 38;
            }

            return -1;
         }
      case 8:
         if((var4 & 72057595111669760L) != 0L) {
            return 38;
         } else {
            if((var4 & 8646911288846319616L) != 0L) {
               this.v = 143;
               this.u = 8;
               return 38;
            }

            return -1;
         }
      case 9:
         if((var4 & 6341068275337658368L) != 0L) {
            this.v = 143;
            this.u = 9;
            return 38;
         } else {
            if((var4 & 2305843013508661248L) != 0L) {
               return 38;
            }

            return -1;
         }
      case 10:
         if((var4 & 5764607523034234880L) != 0L) {
            this.v = 143;
            this.u = 10;
            return 38;
         } else {
            if((var4 & 576460752303423488L) != 0L) {
               return 38;
            }

            return -1;
         }
      case 11:
         if((var4 & 4611686018427387904L) != 0L) {
            return 38;
         } else {
            if((var4 & 1152921504606846976L) != 0L) {
               this.v = 143;
               this.u = 11;
               return 38;
            }

            return -1;
         }
      case 12:
         if((var4 & 1152921504606846976L) != 0L) {
            this.v = 143;
            this.u = 12;
            return 38;
         }

         return -1;
      case 13:
         if((var4 & 1152921504606846976L) != 0L) {
            this.v = 143;
            this.u = 13;
            return 38;
         }

         return -1;
      case 14:
         if((var4 & 1152921504606846976L) != 0L) {
            this.v = 143;
            this.u = 14;
            return 38;
         }

         return -1;
      default:
         return -1;
      }
   }

   private final int b(int var1, long var2, long var4, long var6) {
      return this.b(this.a(var1, var2, var4, var6), var1 + 1);
   }

   private int a(int var1, int var2) {
      this.v = var2;
      this.u = var1;
      return var1 + 1;
   }

   private int a() {
      switch(this.p) {
      case '!':
         this.v = 62;
         return this.a(281474976710656L, 0L);
      case '\"':
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
      case '_':
      case '`':
      case 'h':
      case 'j':
      case 'k':
      case 'm':
      case 'q':
      case 'x':
      case 'y':
      case 'z':
      default:
         return this.b(0, 0);
      case '#':
         return this.a(0, 9);
      case '%':
         this.v = 58;
         return this.a(17179869184L, 0L);
      case '&':
         this.v = 46;
         return this.a(9345848836096L, 0L);
      case '(':
         return this.a(0, 23);
      case ')':
         return this.a(0, 24);
      case '*':
         this.v = 56;
         return this.a(4294967296L, 0L);
      case '+':
         this.v = 54;
         return this.a(576460786663161856L, 0L);
      case ',':
         return this.a(0, 28);
      case '-':
         this.v = 55;
         return this.a(1152921573326323712L, 5L);
      case '.':
         this.v = 63;
         return this.a(1073741824L, 2L);
      case '/':
         this.v = 57;
         return this.a(8589934976L, 0L);
      case ':':
         this.v = 26;
         return this.a(33554432L, 0L);
      case ';':
         return this.a(0, 27);
      case '<':
         this.v = 49;
         return this.a(11259136507379712L, 0L);
      case '=':
         this.v = 31;
         return this.a(140737488355328L, 0L);
      case '>':
         this.v = 50;
         return this.a(4503874505277440L, 0L);
      case '?':
         return this.a(0, 29);
      case '[':
         return this.a(0, 21);
      case '\\':
         return this.a(0, 144, 40);
      case ']':
         return this.a(0, 22);
      case '^':
         this.v = 45;
         return this.a(1099511627776L, 0L);
      case 'a':
         return this.a(0L, 8L);
      case 'b':
         return this.a(0L, 48L);
      case 'c':
         return this.a(0L, 2305844108725323712L);
      case 'd':
         return this.a(0L, 4611686018427418624L);
      case 'e':
         return this.a(0L, 491520L);
      case 'f':
         return this.a(0L, 18014398517346304L);
      case 'g':
         return this.a(0L, 8388608L);
      case 'i':
         return this.a(0L, 117440512L);
      case 'l':
         return this.a(0L, 134217728L);
      case 'n':
         return this.a(0L, 72057594306363392L);
      case 'o':
         return this.a(0L, 4503599627370496L);
      case 'p':
         return this.a(0L, 3758096384L);
      case 'r':
         return this.a(0L, 1152921534671618048L);
      case 's':
         return this.a(0L, 576464016478568448L);
      case 't':
         return this.a(0L, 333332343123083264L);
      case 'u':
         return this.a(0L, 144326294308388864L);
      case 'v':
         return this.a(0L, 1970324836974592L);
      case 'w':
         return this.a(0L, 2251799813685248L);
      case '{':
         return this.a(0, 19);
      case '|':
         this.v = 44;
         return this.a(6597069766656L, 0L);
      case '}':
         return this.a(0, 20);
      case '~':
         return this.a(0, 61);
      }
   }

   private int a(long var1, long var3) {
      try {
         this.p = this.i.a();
      } catch (IOException var6) {
         this.a(0, var1, var3, 0L);
         return 1;
      }

      switch(this.p) {
      case '&':
         if((var1 & 8796093022208L) != 0L) {
            return this.a(1, 43);
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
      case 'b':
      case 'c':
      case 'd':
      case 'g':
      case 'j':
      case 'k':
      case 'm':
      case 'q':
      case 'v':
      case 'z':
      case '{':
      default:
         break;
      case '*':
         if((var1 & 128L) != 0L) {
            return this.a(1, 7, 103);
         }

         if((var3 & 2L) != 0L) {
            return this.a(1, 65);
         }
         break;
      case '+':
         if((var1 & 576460752303423488L) != 0L) {
            return this.a(1, 59);
         }
         break;
      case '-':
         if((var1 & 1152921504606846976L) != 0L) {
            return this.a(1, 60);
         }
         break;
      case '.':
         return this.a(var1, 1073741824L, var3, 0L);
      case '/':
         if((var1 & 256L) != 0L) {
            return this.a(1, 8, 114);
         }
         break;
      case ':':
         if((var1 & 33554432L) != 0L) {
            return this.a(1, 25);
         }
         break;
      case '<':
         if((var1 & 9007199254740992L) != 0L) {
            this.v = 53;
            this.u = 1;
         }

         return this.a(var1, 137438953472L, var3, 0L);
      case '=':
         if((var1 & 4294967296L) != 0L) {
            return this.a(1, 32);
         }

         if((var1 & 8589934592L) != 0L) {
            return this.a(1, 33);
         }

         if((var1 & 17179869184L) != 0L) {
            return this.a(1, 34);
         }

         if((var1 & 34359738368L) != 0L) {
            return this.a(1, 35);
         }

         if((var1 & 68719476736L) != 0L) {
            return this.a(1, 36);
         }

         if((var1 & 549755813888L) != 0L) {
            return this.a(1, 39);
         }

         if((var1 & 1099511627776L) != 0L) {
            return this.a(1, 40);
         }

         if((var1 & 2199023255552L) != 0L) {
            return this.a(1, 41);
         }

         if((var1 & 140737488355328L) != 0L) {
            return this.a(1, 47);
         }

         if((var1 & 281474976710656L) != 0L) {
            return this.a(1, 48);
         }

         if((var1 & 2251799813685248L) != 0L) {
            return this.a(1, 51);
         }

         if((var1 & 4503599627370496L) != 0L) {
            return this.a(1, 52);
         }
         break;
      case '>':
         if((var3 & 1L) != 0L) {
            this.v = 64;
            this.u = 1;
         }

         return this.a(var1, 274877906944L, var3, 4L);
      case 'a':
         return this.a(var1, 0L, var3, 90071992547410112L);
      case 'e':
         return this.a(var1, 0L, var3, 1152925932986570752L);
      case 'f':
         if((var3 & 16777216L) != 0L) {
            return this.a(1, 88, 38);
         }
         break;
      case 'h':
         return this.a(var1, 0L, var3, 38289427285410048L);
      case 'i':
         return this.a(var1, 0L, var3, 281681139335168L);
      case 'l':
         return this.a(var1, 0L, var3, 1099512184832L);
      case 'n':
         return this.a(var1, 0L, var3, 211106333261824L);
      case 'o':
         if((var3 & 8192L) != 0L) {
            this.v = 77;
            this.u = 1;
         }

         return this.a(var1, 0L, var3, 2307531859217630752L);
      case 'p':
         return this.a(var1, 0L, var3, 4503599627370496L);
      case 'r':
         return this.a(var1, 0L, var3, 9024793053495312L);
      case 's':
         return this.a(var1, 0L, var3, 144115188075855872L);
      case 't':
         return this.a(var1, 0L, var3, 576461576937144320L);
      case 'u':
         return this.a(var1, 0L, var3, 2147483656L);
      case 'w':
         return this.a(var1, 0L, var3, 2199023255552L);
      case 'x':
         return this.a(var1, 0L, var3, 393216L);
      case 'y':
         return this.a(var1, 0L, var3, 4899951578951188480L);
      case '|':
         if((var1 & 4398046511104L) != 0L) {
            return this.a(1, 42);
         }
      }

      return this.b(0, var1, var3, 0L);
   }

   private int a(long var1, long var3, long var5, long var7) {
      if(((var3 &= var1) | (var7 &= var5)) == 0L) {
         return this.b(0, var1, var5, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var10) {
            this.a(1, var3, var7, 0L);
            return 2;
         }

         switch(this.p) {
         case '*':
            if((var7 & 4L) != 0L) {
               return this.a(2, 66);
            }
         case '+':
         case ',':
         case '-':
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
         case 'c':
         case 'h':
         case 'j':
         case 'k':
         case 'q':
         case 'v':
         case 'x':
         default:
            break;
         case '.':
            if((var3 & 1073741824L) != 0L) {
               return this.a(2, 30);
            }
            break;
         case '=':
            if((var3 & 137438953472L) != 0L) {
               return this.a(2, 37);
            }

            if((var3 & 274877906944L) != 0L) {
               return this.a(2, 38);
            }
            break;
         case 'a':
            return this.b(var3, 0L, var7, 576462126692958464L);
         case 'b':
            return this.b(var3, 0L, var7, 2147483648L);
         case 'd':
            return this.b(var3, 0L, var7, 4294967296L);
         case 'e':
            return this.b(var3, 0L, var7, 4503599627370512L);
         case 'f':
            return this.b(var3, 0L, var7, 2048L);
         case 'g':
            return this.b(var3, 0L, var7, 77309411328L);
         case 'i':
            return this.b(var3, 0L, var7, 1299932806849232896L);
         case 'l':
            return this.b(var3, 0L, var7, 19140298449883136L);
         case 'm':
            return this.b(var3, 0L, var7, 72061992084439040L);
         case 'n':
            return this.b(var3, 0L, var7, 6917529027779495424L);
         case 'o':
            return this.b(var3, 0L, var7, 35434004512L);
         case 'p':
            return this.b(var3, 0L, var7, 288265560523931648L);
         case 'r':
            if((var7 & 1048576L) != 0L) {
               return this.a(2, 84, 38);
            }

            return this.b(var3, 0L, var7, 36310821751488512L);
         case 's':
            return this.b(var3, 0L, var7, 140737488388160L);
         case 't':
            if((var7 & 67108864L) != 0L) {
               return this.a(2, 90, 38);
            }

            return this.b(var3, 0L, var7, 17188520072L);
         case 'u':
            return this.b(var3, 0L, var7, 9007199254822912L);
         case 'w':
            if((var7 & 268435456L) != 0L) {
               return this.a(2, 92, 38);
            }
            break;
         case 'y':
            if((var7 & 17592186044416L) != 0L) {
               return this.a(2, 108, 38);
            }
            break;
         case 'z':
            return this.b(var3, 0L, var7, 137438953472L);
         }

         return this.b(1, var3, var7, 0L);
      }
   }

   private int b(long var1, long var3, long var5, long var7) {
      if((var3 & var1 | (var7 &= var5)) == 0L) {
         return this.b(1, var1, var5, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var10) {
            this.a(2, 0L, var7, 0L);
            return 3;
         }

         switch(this.p) {
         case 'a':
            return this.b(var7, 4612811918338951184L);
         case 'b':
            return this.b(var7, 16384L);
         case 'c':
            return this.b(var7, 128L);
         case 'd':
            if((var7 & 562949953421312L) != 0L) {
               return this.a(3, 113, 38);
            }
            break;
         case 'e':
            if((var7 & 64L) != 0L) {
               return this.a(3, 70, 38);
            }

            if((var7 & 32768L) != 0L) {
               return this.a(3, 79, 38);
            }

            if((var7 & 9007199254740992L) != 0L) {
               return this.a(3, 117, 38);
            }

            return this.b(var7, 360323296298012672L);
         case 'f':
         case 'h':
         case 'j':
         case 'k':
         case 'q':
         default:
            break;
         case 'g':
            if((var7 & 134217728L) != 0L) {
               return this.a(3, 91, 38);
            }
            break;
         case 'i':
            return this.b(var7, 140746111844352L);
         case 'l':
            if((var7 & 32L) != 0L) {
               return this.a(3, 69, 38);
            }

            return this.b(var7, 2251801961299968L);
         case 'm':
            if((var7 & 65536L) != 0L) {
               return this.a(3, 80, 38);
            }
            break;
         case 'n':
            return this.b(var7, 1297036761402179584L);
         case 'o':
            if((var7 & 8L) != 0L) {
               return this.a(3, 67, 38);
            }

            if((var7 & 8388608L) != 0L) {
               return this.a(3, 87, 38);
            }

            return this.b(var7, 36099165763141632L);
         case 'p':
            return this.b(var7, 4398046511104L);
         case 'r':
            if((var7 & 256L) != 0L) {
               return this.a(3, 72, 38);
            }

            return this.b(var7, 4503633987108864L);
         case 's':
            if((var7 & 8796093022208L) != 0L) {
               return this.a(3, 107, 38);
            }

            return this.b(var7, 2323858507234804224L);
         case 't':
            return this.b(var7, 576744702255039488L);
         case 'u':
            return this.b(var7, 566935683072L);
         case 'v':
            return this.b(var7, 536870912L);
         }

         return this.b(2, 0L, var7, 0L);
      }
   }

   private int b(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(2, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(3, 0L, var3, 0L);
            return 4;
         }

         switch(this.p) {
         case 'a':
            return this.c(var3, 4503600164241408L);
         case 'b':
         case 'f':
         case 'j':
         case 'p':
         case 'q':
         case 'v':
         default:
            break;
         case 'c':
            return this.c(var3, 2753074036736L);
         case 'd':
            return this.c(var3, 35184372088832L);
         case 'e':
            if((var3 & 2251799813685248L) != 0L) {
               return this.a(4, 115, 38);
            }

            if((var3 & 18014398509481984L) != 0L) {
               return this.a(4, 118, 38);
            }

            return this.c(var3, 69793218560L);
         case 'g':
            if((var3 & 144115188075855872L) != 0L) {
               return this.a(4, 121, 38);
            }

            return this.c(var3, 140737488355328L);
         case 'h':
            if((var3 & 128L) != 0L) {
               return this.a(4, 71, 38);
            }
            break;
         case 'i':
            return this.c(var3, 576461029328946176L);
         case 'k':
            if((var3 & 16L) != 0L) {
               return this.a(4, 68, 38);
            }
            break;
         case 'l':
            return this.c(var3, 4398050721792L);
         case 'm':
            return this.c(var3, 4611686018427387904L);
         case 'n':
            if((var3 & 70368744177664L) != 0L) {
               return this.a(4, 110, 38);
            }

            return this.c(var3, 288230376187363328L);
         case 'o':
            return this.c(var3, 137438953472L);
         case 'r':
            return this.c(var3, 17180131328L);
         case 's':
            if((var3 & 1099511627776L) != 0L) {
               return this.a(4, 104, 38);
            }

            return this.c(var3, 72057602627862528L);
         case 't':
            if((var3 & 512L) != 0L) {
               this.v = 73;
               this.u = 4;
            } else {
               if((var3 & 524288L) != 0L) {
                  return this.a(4, 83, 38);
               }

               if((var3 & 34359738368L) != 0L) {
                  return this.a(4, 99, 38);
               }
            }

            return this.c(var3, 3459890413727387648L);
         case 'u':
            return this.c(var3, 281474976712704L);
         case 'w':
            if((var3 & 36028797018963968L) != 0L) {
               return this.a(4, 119, 38);
            }
         }

         return this.b(3, 0L, var3, 0L);
      }
   }

   private int c(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(3, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(4, 0L, var3, 0L);
            return 5;
         }

         switch(this.p) {
         case '_':
            return this.d(var3, 2305843009213693952L);
         case '`':
         case 'b':
         case 'g':
         case 'j':
         case 'k':
         case 'm':
         case 'o':
         case 'q':
         case 'r':
         case 's':
         default:
            break;
         case 'a':
            return this.d(var3, 288516249174933504L);
         case 'c':
            if((var3 & 2147483648L) != 0L) {
               return this.a(5, 95, 38);
            }

            if((var3 & 274877906944L) != 0L) {
               this.v = 102;
               this.u = 5;
            }

            return this.d(var3, 576460753377296384L);
         case 'd':
            if((var3 & 2097152L) != 0L) {
               return this.a(5, 85, 38);
            }

            if((var3 & 68719476736L) != 0L) {
               return this.a(5, 100, 38);
            }
            break;
         case 'e':
            if((var3 & 4096L) != 0L) {
               return this.a(5, 76, 38);
            }

            if((var3 & 16384L) != 0L) {
               return this.a(5, 78, 38);
            }

            if((var3 & 33554432L) != 0L) {
               return this.a(5, 89, 38);
            }

            return this.d(var3, 1152956688978935808L);
         case 'f':
            if((var3 & 137438953472L) != 0L) {
               return this.a(5, 101, 38);
            }
            break;
         case 'h':
            if((var3 & 2199023255552L) != 0L) {
               return this.a(5, 105, 38);
            }
            break;
         case 'i':
            return this.d(var3, 4612811918334230528L);
         case 'l':
            return this.d(var3, 4299163648L);
         case 'n':
            if((var3 & 262144L) != 0L) {
               return this.a(5, 82, 38);
            }

            if((var3 & 17179869184L) != 0L) {
               return this.a(5, 98, 38);
            }

            return this.d(var3, 140737488356352L);
         case 'p':
            return this.d(var3, 72057594037927936L);
         case 't':
            if((var3 & 549755813888L) != 0L) {
               return this.a(5, 103, 38);
            }

            return this.d(var3, 4503608754176000L);
         }

         return this.b(4, 0L, var3, 0L);
      }
   }

   private int d(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(4, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(5, 0L, var3, 0L);
            return 6;
         }

         switch(this.p) {
         case '_':
            return this.e(var3, 576460752303423488L);
         case '`':
         case 'b':
         case 'd':
         case 'g':
         case 'h':
         case 'j':
         case 'k':
         case 'n':
         case 'p':
         case 'q':
         case 's':
         case 'v':
         case 'w':
         case 'x':
         default:
            break;
         case 'a':
            return this.e(var3, 72057598332895232L);
         case 'c':
            return this.e(var3, 6917529027641081856L);
         case 'e':
            if((var3 & 536870912L) != 0L) {
               return this.a(6, 93, 38);
            }

            return this.e(var3, 140746078289920L);
         case 'f':
            if((var3 & 35184372088832L) != 0L) {
               return this.a(6, 109, 38);
            }
            break;
         case 'i':
            return this.e(var3, 131072L);
         case 'l':
            if((var3 & 281474976710656L) != 0L) {
               return this.a(6, 112, 38);
            }

            return this.e(var3, 1125899906842624L);
         case 'm':
            return this.e(var3, 288230376151711744L);
         case 'o':
            return this.e(var3, 4503599627370496L);
         case 'r':
            return this.e(var3, 1152921504606846976L);
         case 't':
            if((var3 & 2048L) != 0L) {
               return this.a(6, 75, 38);
            }

            return this.e(var3, 4399120252928L);
         case 'u':
            return this.e(var3, 1024L);
         case 'y':
            if((var3 & 4194304L) != 0L) {
               return this.a(6, 86, 38);
            }
         }

         return this.b(5, 0L, var3, 0L);
      }
   }

   private int e(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(5, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(6, 0L, var3, 0L);
            return 7;
         }

         switch(this.p) {
         case '_':
            return this.f(var3, 4611686018427387904L);
         case '`':
         case 'b':
         case 'f':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'm':
         case 'n':
         case 'o':
         case 'q':
         case 's':
         default:
            break;
         case 'a':
            return this.f(var3, 2305843009213693952L);
         case 'c':
            return this.f(var3, 648518346341351424L);
         case 'd':
            if((var3 & 140737488355328L) != 0L) {
               return this.a(7, 111, 38);
            }
            break;
         case 'e':
            if((var3 & 1024L) != 0L) {
               return this.a(7, 74, 38);
            }

            if((var3 & 4398046511104L) != 0L) {
               return this.a(7, 106, 38);
            }

            if((var3 & 1125899906842624L) != 0L) {
               return this.a(7, 114, 38);
            }

            if((var3 & 288230376151711744L) != 0L) {
               return this.a(7, 122, 38);
            }

            return this.f(var3, 1073741824L);
         case 'p':
            return this.f(var3, 1152921504606846976L);
         case 'r':
            if((var3 & 8589934592L) != 0L) {
               return this.a(7, 97, 38);
            }

            if((var3 & 4503599627370496L) != 0L) {
               return this.a(7, 116, 38);
            }

            return this.f(var3, 4294967296L);
         case 't':
            if((var3 & 131072L) != 0L) {
               return this.a(7, 81, 38);
            }
         }

         return this.b(6, 0L, var3, 0L);
      }
   }

   private int f(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(6, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(7, 0L, var3, 0L);
            return 8;
         }

         switch(this.p) {
         case 'a':
            return this.g(var3, 576460752303423488L);
         case 'c':
            return this.g(var3, 4611686018427387904L);
         case 'd':
            if((var3 & 1073741824L) != 0L) {
               return this.a(8, 94, 38);
            }
         case 'b':
         case 'f':
         case 'g':
         case 'h':
         case 'i':
         case 'j':
         case 'k':
         case 'l':
         case 'm':
         case 'n':
         case 'o':
         case 'p':
         case 'q':
         default:
            return this.b(7, 0L, var3, 0L);
         case 'e':
            if((var3 & 72057594037927936L) != 0L) {
               return this.a(8, 120, 38);
            }

            return this.g(var3, 4294967296L);
         case 'r':
            return this.g(var3, 1152921504606846976L);
         case 's':
            return this.g(var3, 2305843009213693952L);
         }
      }
   }

   private int g(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(7, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(8, 0L, var3, 0L);
            return 9;
         }

         switch(this.p) {
         case 'a':
            return this.h(var3, 4611686018427387904L);
         case 'd':
            if((var3 & 4294967296L) != 0L) {
               return this.a(9, 96, 38);
            }
            break;
         case 'e':
            return this.h(var3, 1152921504606846976L);
         case 's':
            return this.h(var3, 576460752303423488L);
         case 't':
            if((var3 & 2305843009213693952L) != 0L) {
               return this.a(9, 125, 38);
            }
         }

         return this.b(8, 0L, var3, 0L);
      }
   }

   private int h(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(8, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(9, 0L, var3, 0L);
            return 10;
         }

         switch(this.p) {
         case 's':
            return this.i(var3, 4611686018427387904L);
         case 't':
            if((var3 & 576460752303423488L) != 0L) {
               return this.a(10, 123, 38);
            }

            return this.i(var3, 1152921504606846976L);
         default:
            return this.b(9, 0L, var3, 0L);
         }
      }
   }

   private int i(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(9, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(10, 0L, var3, 0L);
            return 11;
         }

         switch(this.p) {
         case '_':
            return this.j(var3, 1152921504606846976L);
         case 't':
            if((var3 & 4611686018427387904L) != 0L) {
               return this.a(11, 126, 38);
            }
         default:
            return this.b(10, 0L, var3, 0L);
         }
      }
   }

   private int j(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(10, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(11, 0L, var3, 0L);
            return 12;
         }

         switch(this.p) {
         case 'c':
            return this.k(var3, 1152921504606846976L);
         default:
            return this.b(11, 0L, var3, 0L);
         }
      }
   }

   private int k(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(11, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(12, 0L, var3, 0L);
            return 13;
         }

         switch(this.p) {
         case 'a':
            return this.l(var3, 1152921504606846976L);
         default:
            return this.b(12, 0L, var3, 0L);
         }
      }
   }

   private int l(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(12, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(13, 0L, var3, 0L);
            return 14;
         }

         switch(this.p) {
         case 's':
            return this.m(var3, 1152921504606846976L);
         default:
            return this.b(13, 0L, var3, 0L);
         }
      }
   }

   private int m(long var1, long var3) {
      if((var3 &= var1) == 0L) {
         return this.b(13, 0L, var1, 0L);
      } else {
         try {
            this.p = this.i.a();
         } catch (IOException var6) {
            this.a(14, 0L, var3, 0L);
            return 15;
         }

         switch(this.p) {
         case 't':
            if((var3 & 1152921504606846976L) != 0L) {
               return this.a(15, 124, 38);
            }
         default:
            return this.b(14, 0L, var3, 0L);
         }
      }
   }

   private int a(int var1, int var2, int var3) {
      this.v = var2;
      this.u = var1;

      try {
         this.p = this.i.a();
      } catch (IOException var5) {
         return var1 + 1;
      }

      return this.b(var3, var1 + 1);
   }

   private int b(int var1, int var2) {
      int var3 = 0;
      this.s = 120;
      int var4 = 1;
      this.k[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.t == Integer.MAX_VALUE) {
            this.h();
         }

         long var14;
         if(this.p < 64) {
            var14 = 1L << this.p;

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(0, 5);
                  } else if((9216L & var14) != 0L) {
                     if(var5 > 15) {
                        var5 = 15;
                     }
                  } else if(this.p == 47) {
                     this.f(6, 12);
                  } else if(this.p == 34) {
                     this.h(13, 15);
                  } else if(this.p == 39) {
                     this.h(16, 18);
                  } else if(this.p == 46) {
                     this.b(4);
                  }

                  if((287667426198290432L & var14) != 0L) {
                     if(var5 > 131) {
                        var5 = 131;
                     }

                     this.h(19, 27);
                  } else if(this.p == 48) {
                     this.f(28, 31);
                  } else if(this.p == 13) {
                     this.b(1);
                  }

                  if(this.p == 48) {
                     if(var5 > 127) {
                        var5 = 127;
                     }

                     this.h(32, 40);
                  }
                  break;
               case 1:
                  if(this.p == 10 && var5 > 15) {
                     var5 = 15;
                  }
                  break;
               case 2:
                  if(this.p == 13) {
                     this.b(1);
                  }
                  break;
               case 3:
                  if(this.p == 46) {
                     this.b(4);
                  }
                  break;
               case 4:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 139) {
                        var5 = 139;
                     }

                     this.h(41, 43);
                  }
               case 5:
               case 8:
               case 11:
               case 18:
               case 21:
               case 22:
               case 25:
               case 32:
               case 35:
               case 36:
               case 37:
               case 39:
               case 45:
               case 46:
               case 47:
               case 49:
               case 51:
               case 52:
               case 53:
               case 54:
               case 55:
               case 56:
               case 60:
               case 61:
               case 62:
               case 64:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 73:
               case 75:
               case 77:
               case 78:
               case 79:
               case 80:
               case 82:
               case 83:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 90:
               case 97:
               case 100:
               case 101:
               default:
                  break;
               case 6:
                  if((43980465111040L & var14) != 0L) {
                     this.b(7);
                  }
                  break;
               case 7:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 139) {
                        var5 = 139;
                     }

                     this.g(7, 8);
                  }
                  break;
               case 9:
                  if(this.p == 39) {
                     this.h(16, 18);
                  }
                  break;
               case 10:
                  if((-549755823105L & var14) != 0L) {
                     this.h(16, 18);
                  }
                  break;
               case 12:
                  if((-9223371469919092736L & var14) != 0L) {
                     this.h(16, 18);
                  }
                  break;
               case 13:
                  if(this.p == 39 && var5 > 141) {
                     var5 = 141;
                  }
                  break;
               case 14:
                  if(this.p == 48) {
                     this.h(44, 47);
                  }
                  break;
               case 15:
                  if((71776119061217280L & var14) != 0L) {
                     this.h(44, 47);
                  }
                  break;
               case 16:
                  if((287667426198290432L & var14) != 0L) {
                     this.h(48, 51);
                  }
                  break;
               case 17:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(48, 51);
                  }
                  break;
               case 19:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(52, 55);
                  }
                  break;
               case 20:
                  if(this.p == 48) {
                     this.f(56, 57);
                  }
                  break;
               case 23:
                  if(this.p == 34) {
                     this.h(13, 15);
                  }
                  break;
               case 24:
                  if((-17179878401L & var14) != 0L) {
                     this.h(13, 15);
                  }
                  break;
               case 26:
                  if((-9223371469919091712L & var14) != 0L) {
                     this.h(13, 15);
                  }
                  break;
               case 27:
                  if(this.p == 34 && var5 > 142) {
                     var5 = 142;
                  }
                  break;
               case 28:
                  if(this.p == 48) {
                     this.h(58, 61);
                  }
                  break;
               case 29:
                  if((71776119061217280L & var14) != 0L) {
                     this.h(58, 61);
                  }
                  break;
               case 30:
                  if((287667426198290432L & var14) != 0L) {
                     this.h(62, 65);
                  }
                  break;
               case 31:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(62, 65);
                  }
                  break;
               case 33:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(66, 69);
                  }
                  break;
               case 34:
                  if(this.p == 48) {
                     this.f(70, 71);
                  }
                  break;
               case 38:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 143) {
                        var5 = 143;
                     }

                     this.k[this.s++] = 38;
                  }
                  break;
               case 40:
                  if(this.p == 13) {
                     this.b(1);
                  } else if(this.p == 10 && var5 > 15) {
                     var5 = 15;
                  }

                  if(this.p == 13 && var5 > 15) {
                     var5 = 15;
                  }
                  break;
               case 41:
                  if(this.p == 13) {
                     this.b(1);
                  }
                  break;
               case 42:
                  if(this.p == 48) {
                     if(var5 > 127) {
                        var5 = 127;
                     }

                     this.h(32, 40);
                  }
                  break;
               case 43:
                  if((71776119061217280L & var14) != 0L) {
                     if(var5 > 127) {
                        var5 = 127;
                     }

                     this.b(43);
                  }
                  break;
               case 44:
                  if((71776119061217280L & var14) != 0L) {
                     this.h(72, 74);
                  }
                  break;
               case 48:
                  if((71776119061217280L & var14) != 0L) {
                     this.g(48, 49);
                  }
                  break;
               case 50:
                  if((71776119061217280L & var14) != 0L) {
                     this.h(75, 77);
                  }
                  break;
               case 57:
                  if((287667426198290432L & var14) != 0L) {
                     if(var5 > 131) {
                        var5 = 131;
                     }

                     this.h(19, 27);
                  }
                  break;
               case 58:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 131) {
                        var5 = 131;
                     }

                     this.b(58);
                  }
                  break;
               case 59:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(78, 80);
                  }
                  break;
               case 63:
                  if((287948901175001088L & var14) != 0L) {
                     this.g(63, 64);
                  }
                  break;
               case 65:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(81, 83);
                  }
                  break;
               case 72:
                  if(this.p == 48) {
                     this.f(28, 31);
                  }
                  break;
               case 74:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 135) {
                        var5 = 135;
                     }

                     this.k[this.s++] = 74;
                  }
                  break;
               case 76:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 136) {
                        var5 = 136;
                     }

                     this.f(84, 86);
                  }
                  break;
               case 81:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(87, 88);
                  }
                  break;
               case 84:
                  if((287948901175001088L & var14) != 0L) {
                     this.f(89, 91);
                  }
                  break;
               case 91:
                  if((287948901175001088L & var14) != 0L) {
                     this.h(0, 5);
                  }
                  break;
               case 92:
                  if((287948901175001088L & var14) != 0L) {
                     this.g(92, 93);
                  }
                  break;
               case 93:
                  if(this.p == 46) {
                     if(var5 > 139) {
                        var5 = 139;
                     }

                     this.h(92, 94);
                  }
                  break;
               case 94:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 139) {
                        var5 = 139;
                     }

                     this.h(92, 94);
                  }
                  break;
               case 95:
                  if((287948901175001088L & var14) != 0L) {
                     this.g(95, 3);
                  }
                  break;
               case 96:
                  if((287948901175001088L & var14) != 0L) {
                     this.g(96, 97);
                  }
                  break;
               case 98:
                  if((43980465111040L & var14) != 0L) {
                     this.b(99);
                  }
                  break;
               case 99:
                  if((287948901175001088L & var14) != 0L) {
                     if(var5 > 140) {
                        var5 = 140;
                     }

                     this.g(99, 100);
                  }
                  break;
               case 102:
                  if(this.p == 47) {
                     this.f(6, 12);
                  }
                  break;
               case 103:
                  if(this.p == 42) {
                     this.k[this.s++] = 111;
                  } else if(this.p == 60) {
                     this.b(104);
                  } else if(this.p == 33) {
                     this.b(104);
                  }

                  if(this.p == 42) {
                     this.b(109);
                  }
                  break;
               case 104:
                  if((-140737488355329L & var14) != 0L && var5 > 4) {
                     var5 = 4;
                  }
                  break;
               case 105:
                  if(this.p == 47) {
                     this.k[this.s++] = 118;
                  } else if(this.p == 42) {
                     this.k[this.s++] = 112;
                  }

                  if(this.p == 47) {
                     this.k[this.s++] = 116;
                  } else if(this.p == 42) {
                     this.k[this.s++] = 108;
                  }

                  if(this.p == 47) {
                     this.k[this.s++] = 114;
                  } else if(this.p == 42) {
                     this.k[this.s++] = 106;
                  }

                  if(this.p == 42) {
                     this.k[this.s++] = 103;
                  }
                  break;
               case 106:
                  if(this.p == 60) {
                     this.b(104);
                  }
                  break;
               case 107:
                  if(this.p == 42) {
                     this.k[this.s++] = 106;
                  }
                  break;
               case 108:
                  if(this.p == 42) {
                     this.b(109);
                  }
                  break;
               case 109:
                  if((-140737488355329L & var14) != 0L && var5 > 5) {
                     var5 = 5;
                  }
                  break;
               case 110:
                  if(this.p == 42) {
                     this.k[this.s++] = 108;
                  }
                  break;
               case 111:
                  if(this.p == 60) {
                     this.b(109);
                  }
                  break;
               case 112:
                  if(this.p == 42) {
                     this.k[this.s++] = 111;
                  }
                  break;
               case 113:
                  if(this.p == 42) {
                     this.k[this.s++] = 112;
                  }
                  break;
               case 114:
                  if(this.p == 60) {
                     if(var5 > 6) {
                        var5 = 6;
                     }
                  } else if(this.p == 33) {
                     if(var5 > 6) {
                        var5 = 6;
                     }
                  } else if(this.p == 47 && var5 > 6) {
                     var5 = 6;
                  }
                  break;
               case 115:
                  if(this.p == 47) {
                     this.k[this.s++] = 114;
                  }
                  break;
               case 116:
                  if(this.p == 33 && var5 > 6) {
                     var5 = 6;
                  }
                  break;
               case 117:
                  if(this.p == 47) {
                     this.k[this.s++] = 116;
                  }
                  break;
               case 118:
                  if(this.p == 60 && var5 > 6) {
                     var5 = 6;
                  }
                  break;
               case 119:
                  if(this.p == 47) {
                     this.k[this.s++] = 118;
                  }
               }
            } while(var4 != var3);
         } else if(this.p < 128) {
            var14 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 143) {
                        var5 = 143;
                     }

                     this.b(38);
                  } else if(this.p == 92) {
                     this.f(95, 97);
                  }

                  if(this.p == 76) {
                     this.f(98, 99);
                  }
               case 1:
               case 2:
               case 3:
               case 4:
               case 6:
               case 7:
               case 9:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 20:
               case 23:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 34:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 48:
               case 50:
               case 57:
               case 58:
               case 59:
               case 63:
               case 65:
               case 72:
               case 91:
               case 92:
               case 93:
               case 94:
               case 95:
               case 96:
               case 98:
               case 99:
               case 102:
               case 103:
               case 105:
               case 106:
               case 107:
               case 108:
               default:
                  break;
               case 5:
                  if((137438953504L & var14) != 0L) {
                     this.f(100, 101);
                  }
                  break;
               case 8:
                  if((17867063955520L & var14) != 0L && var5 > 139) {
                     var5 = 139;
                  }
                  break;
               case 10:
                  if((-268435457L & var14) != 0L) {
                     this.h(16, 18);
                  }
                  break;
               case 11:
                  if(this.p == 92) {
                     this.f(102, 106);
                  }
                  break;
               case 12:
                  if((23714567704018944L & var14) != 0L) {
                     this.h(16, 18);
                  }
                  break;
               case 18:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(19);
                  }
                  break;
               case 19:
                  if((541165879422L & var14) != 0L) {
                     this.h(52, 55);
                  }
                  break;
               case 21:
                  if(this.p == 120) {
                     this.b(19);
                  }
                  break;
               case 22:
                  if(this.p == 88) {
                     this.b(19);
                  }
                  break;
               case 24:
                  if((-268435457L & var14) != 0L) {
                     this.h(13, 15);
                  }
                  break;
               case 25:
                  if(this.p == 92) {
                     this.f(107, 111);
                  }
                  break;
               case 26:
                  if((23714567704018944L & var14) != 0L) {
                     this.h(13, 15);
                  }
                  break;
               case 32:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(33);
                  }
                  break;
               case 33:
                  if((541165879422L & var14) != 0L) {
                     this.h(66, 69);
                  }
                  break;
               case 35:
                  if(this.p == 120) {
                     this.b(33);
                  }
                  break;
               case 36:
                  if(this.p == 88) {
                     this.b(33);
                  }
                  break;
               case 37:
               case 38:
                  if((576460745995190270L & var14) != 0L) {
                     if(var5 > 143) {
                        var5 = 143;
                     }

                     this.b(38);
                  }
                  break;
               case 39:
                  if(this.p == 92) {
                     this.f(95, 97);
                  }
                  break;
               case 45:
               case 46:
                  if((17592186048512L & var14) != 0L && var5 > 128) {
                     var5 = 128;
                  }
                  break;
               case 47:
                  if((17592186048512L & var14) != 0L) {
                     this.k[this.s++] = 46;
                  }
                  break;
               case 49:
                  if((9007199256838144L & var14) != 0L && var5 > 129) {
                     var5 = 129;
                  }
                  break;
               case 51:
                  if((9007199256838144L & var14) != 0L) {
                     this.g(52, 53);
                  }
                  break;
               case 52:
                  if((17592186048512L & var14) != 0L && var5 > 130) {
                     var5 = 130;
                  }
                  break;
               case 53:
                  if((17592186048512L & var14) != 0L) {
                     this.b(52);
                  }
                  break;
               case 54:
                  if((17592186048512L & var14) != 0L) {
                     this.g(55, 56);
                  }
                  break;
               case 55:
                  if((9007199256838144L & var14) != 0L && var5 > 130) {
                     var5 = 130;
                  }
                  break;
               case 56:
                  if((17592186048512L & var14) != 0L) {
                     this.b(55);
                  }
                  break;
               case 60:
                  if((9024791442886656L & var14) != 0L && var5 > 132) {
                     var5 = 132;
                  }
                  break;
               case 61:
                  if((17592186048512L & var14) != 0L && var5 > 132) {
                     var5 = 132;
                  }
                  break;
               case 62:
                  if((17592186048512L & var14) != 0L) {
                     this.k[this.s++] = 61;
                  }
                  break;
               case 64:
                  if((9007199256838144L & var14) != 0L && var5 > 133) {
                     var5 = 133;
                  }
                  break;
               case 66:
                  if((9007199256838144L & var14) != 0L) {
                     this.g(67, 68);
                  }
                  break;
               case 67:
                  if((17592186048512L & var14) != 0L && var5 > 134) {
                     var5 = 134;
                  }
                  break;
               case 68:
                  if((17592186048512L & var14) != 0L) {
                     this.b(67);
                  }
                  break;
               case 69:
                  if((17592186048512L & var14) != 0L) {
                     this.g(70, 71);
                  }
                  break;
               case 70:
                  if((9007199256838144L & var14) != 0L && var5 > 134) {
                     var5 = 134;
                  }
                  break;
               case 71:
                  if((17592186048512L & var14) != 0L) {
                     this.b(70);
                  }
                  break;
               case 73:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(74);
                  }
                  break;
               case 74:
                  if((541165879422L & var14) != 0L) {
                     if(var5 > 135) {
                        var5 = 135;
                     }

                     this.b(74);
                  }
                  break;
               case 75:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(76);
                  }
                  break;
               case 76:
                  if((541165879422L & var14) != 0L) {
                     if(var5 > 136) {
                        var5 = 136;
                     }

                     this.h(84, 86);
                  }
                  break;
               case 77:
                  if((9024791442886656L & var14) != 0L && var5 > 136) {
                     var5 = 136;
                  }
                  break;
               case 78:
                  if((17592186048512L & var14) != 0L && var5 > 136) {
                     var5 = 136;
                  }
                  break;
               case 79:
                  if((17592186048512L & var14) != 0L) {
                     this.k[this.s++] = 78;
                  }
                  break;
               case 80:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(81);
                  }
                  break;
               case 81:
                  if((541165879422L & var14) != 0L) {
                     this.g(81, 82);
                  }
                  break;
               case 82:
                  if((9007199256838144L & var14) != 0L && var5 > 137) {
                     var5 = 137;
                  }
                  break;
               case 83:
                  if((72057594054705152L & var14) != 0L) {
                     this.b(84);
                  }
                  break;
               case 84:
                  if((541165879422L & var14) != 0L) {
                     this.h(89, 91);
                  }
                  break;
               case 85:
                  if((9007199256838144L & var14) != 0L) {
                     this.g(86, 87);
                  }
                  break;
               case 86:
                  if((17592186048512L & var14) != 0L && var5 > 138) {
                     var5 = 138;
                  }
                  break;
               case 87:
                  if((17592186048512L & var14) != 0L) {
                     this.b(86);
                  }
                  break;
               case 88:
                  if((17592186048512L & var14) != 0L) {
                     this.g(89, 90);
                  }
                  break;
               case 89:
                  if((9007199256838144L & var14) != 0L && var5 > 138) {
                     var5 = 138;
                  }
                  break;
               case 90:
                  if((17592186048512L & var14) != 0L) {
                     this.b(89);
                  }
                  break;
               case 97:
                  if((137438953504L & var14) != 0L) {
                     this.f(112, 113);
                  }
                  break;
               case 100:
                  if((17867063955520L & var14) != 0L && var5 > 140) {
                     var5 = 140;
                  }
                  break;
               case 101:
                  if(this.p == 76) {
                     this.f(98, 99);
                  }
                  break;
               case 104:
                  if(var5 > 4) {
                     var5 = 4;
                  }
                  break;
               case 109:
                  if(var5 > 5) {
                     var5 = 5;
                  }
               }
            } while(var4 != var3);
         } else {
            int var6 = this.p >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.p & 255) >> 6;
            long var11 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 10:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.f(16, 18);
                  }
                  break;
               case 24:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.f(13, 15);
                  }
                  break;
               case 104:
                  if(a(var6, var7, var10, var8, var11) && var5 > 4) {
                     var5 = 4;
                  }
                  break;
               case 109:
                  if(a(var6, var7, var10, var8, var11) && var5 > 5) {
                     var5 = 5;
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.v = var5;
            this.u = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.s) == (var3 = 120 - (this.s = var3))) {
            return var2;
         }

         try {
            this.p = this.i.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int b() {
      switch(this.p) {
      case '*':
         return this.a(4096L);
      default:
         return 1;
      }
   }

   private int a(long var1) {
      try {
         this.p = this.i.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.p) {
      case '/':
         if((var1 & 4096L) != 0L) {
            return this.a(1, 12);
         }

         return 2;
      default:
         return 2;
      }
   }

   private int c() {
      switch(this.p) {
      case '*':
         return this.b(16384L);
      default:
         return 1;
      }
   }

   private int b(long var1) {
      try {
         this.p = this.i.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.p) {
      case '/':
         if((var1 & 16384L) != 0L) {
            return this.a(1, 14);
         }

         return 2;
      default:
         return 2;
      }
   }

   private int d() {
      return this.c(6, 0);
   }

   private int c(int var1, int var2) {
      int var3 = 0;
      this.s = 13;
      int var4 = 1;
      this.k[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.t == Integer.MAX_VALUE) {
            this.h();
         }

         long var14;
         if(this.p < 64) {
            var14 = 1L << this.p;

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
                  if(this.p == 42) {
                     this.g(1, 2);
                  }
                  break;
               case 1:
                  if((-4398046511105L & var14) != 0L) {
                     this.g(1, 2);
                  }
                  break;
               case 2:
                  if(this.p == 42) {
                     this.h(114, 116);
                  }
                  break;
               case 3:
                  if((-145135534866433L & var14) != 0L) {
                     this.g(4, 2);
                  }
                  break;
               case 4:
                  if((-4398046511105L & var14) != 0L) {
                     this.g(4, 2);
                  }
                  break;
               case 5:
                  if(this.p == 47 && var5 > 17) {
                     var5 = 17;
                  }
                  break;
               case 6:
                  this.k[this.s++] = 9;
                  if(var5 > 17) {
                     var5 = 17;
                  }

                  if(this.p == 47) {
                     this.k[this.s++] = 0;
                  }
                  break;
               case 7:
                  if(var5 > 17) {
                     var5 = 17;
                  }
                  break;
               case 8:
                  this.k[this.s++] = 9;
                  break;
               case 9:
                  this.f(117, 118);
                  break;
               case 10:
                  if((9216L & var14) != 0L && var5 > 18) {
                     var5 = 18;
                  }
                  break;
               case 11:
                  if(this.p == 10 && var5 > 18) {
                     var5 = 18;
                  }
                  break;
               case 12:
                  if(this.p == 13) {
                     this.k[this.s++] = 11;
                  }
               }
            } while(var4 != var3);
         } else if(this.p < 128) {
            var14 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 1:
                  this.g(1, 2);
               case 2:
               case 5:
               default:
                  break;
               case 3:
               case 4:
                  this.g(4, 2);
                  break;
               case 6:
                  if(var5 > 17) {
                     var5 = 17;
                  }

                  if((-268435457L & var14) != 0L) {
                     this.k[this.s++] = 9;
                  }
                  break;
               case 7:
                  if(var5 > 17) {
                     var5 = 17;
                  }
                  break;
               case 8:
                  if((-268435457L & var14) != 0L) {
                     this.k[this.s++] = 9;
                  }
                  break;
               case 9:
                  if((-268435457L & var14) != 0L) {
                     this.f(117, 118);
                  }
               }
            } while(var4 != var3);
         } else {
            int var6 = this.p >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.p & 255) >> 6;
            long var11 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 1:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.g(1, 2);
                  }
               case 2:
               case 5:
               default:
                  break;
               case 3:
               case 4:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.g(4, 2);
                  }
                  break;
               case 6:
                  if(a(var6, var7, var10, var8, var11) && var5 > 17) {
                     var5 = 17;
                  }

                  if(a(var6, var7, var10, var8, var11)) {
                     this.k[this.s++] = 9;
                  }
                  break;
               case 7:
                  if(a(var6, var7, var10, var8, var11) && var5 > 17) {
                     var5 = 17;
                  }
                  break;
               case 8:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.k[this.s++] = 9;
                  }
                  break;
               case 9:
                  if(a(var6, var7, var10, var8, var11)) {
                     this.f(117, 118);
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.v = var5;
            this.u = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.s) == (var3 = 13 - (this.s = var3))) {
            return var2;
         }

         try {
            this.p = this.i.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int e() {
      return this.d(4, 0);
   }

   private int d(int var1, int var2) {
      int var3 = 0;
      this.s = 4;
      int var4 = 1;
      this.k[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.t == Integer.MAX_VALUE) {
            this.h();
         }

         long var14;
         if(this.p < 64) {
            var14 = 1L << this.p;

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
                  if((-67118081L & var14) != 0L) {
                     var5 = 13;
                     this.h(119, 121);
                  }
                  break;
               case 1:
                  if((9216L & var14) != 0L && var5 > 13) {
                     var5 = 13;
                  }
                  break;
               case 2:
                  if(this.p == 10 && var5 > 13) {
                     var5 = 13;
                  }
                  break;
               case 3:
                  if(this.p == 13) {
                     this.k[this.s++] = 2;
                  }
                  break;
               case 4:
                  if((-67118081L & var14) != 0L) {
                     if(var5 > 13) {
                        var5 = 13;
                     }

                     this.h(119, 121);
                  } else if((9216L & var14) != 0L && var5 > 13) {
                     var5 = 13;
                  }

                  if(this.p == 13) {
                     this.k[this.s++] = 2;
                  }
               }
            } while(var4 != var3);
         } else if(this.p < 128) {
            var14 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
               case 4:
                  var5 = 13;
                  this.h(119, 121);
               }
            } while(var4 != var3);
         } else {
            int var6 = this.p >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.p & 255) >> 6;
            long var11 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
               case 4:
                  if(a(var6, var7, var10, var8, var11)) {
                     if(var5 > 13) {
                        var5 = 13;
                     }

                     this.h(119, 121);
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.v = var5;
            this.u = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.s) == (var3 = 4 - (this.s = var3))) {
            return var2;
         }

         try {
            this.p = this.i.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int f() {
      return this.e(4, 0);
   }

   private int e(int var1, int var2) {
      int var3 = 0;
      this.s = 4;
      int var4 = 1;
      this.k[0] = var1;
      int var5 = Integer.MAX_VALUE;

      while(true) {
         if(++this.t == Integer.MAX_VALUE) {
            this.h();
         }

         long var14;
         if(this.p < 64) {
            var14 = 1L << this.p;

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
                  if((-67118081L & var14) != 0L) {
                     var5 = 10;
                     this.h(119, 121);
                  }
                  break;
               case 1:
                  if((9216L & var14) != 0L && var5 > 10) {
                     var5 = 10;
                  }
                  break;
               case 2:
                  if(this.p == 10 && var5 > 10) {
                     var5 = 10;
                  }
                  break;
               case 3:
                  if(this.p == 13) {
                     this.k[this.s++] = 2;
                  }
                  break;
               case 4:
                  if((-67118081L & var14) != 0L) {
                     if(var5 > 10) {
                        var5 = 10;
                     }

                     this.h(119, 121);
                  } else if((9216L & var14) != 0L && var5 > 10) {
                     var5 = 10;
                  }

                  if(this.p == 13) {
                     this.k[this.s++] = 2;
                  }
               }
            } while(var4 != var3);
         } else if(this.p < 128) {
            var14 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
               case 4:
                  var5 = 10;
                  this.h(119, 121);
               }
            } while(var4 != var3);
         } else {
            int var6 = this.p >> 8;
            int var7 = var6 >> 6;
            long var8 = 1L << (var6 & 63);
            int var10 = (this.p & 255) >> 6;
            long var11 = 1L << (this.p & 63);

            do {
               --var4;
               switch(this.k[var4]) {
               case 0:
               case 4:
                  if(a(var6, var7, var10, var8, var11)) {
                     if(var5 > 10) {
                        var5 = 10;
                     }

                     this.h(119, 121);
                  }
               }
            } while(var4 != var3);
         }

         if(var5 != Integer.MAX_VALUE) {
            this.v = var5;
            this.u = var2;
            var5 = Integer.MAX_VALUE;
         }

         ++var2;
         if((var4 = this.s) == (var3 = 4 - (this.s = var3))) {
            return var2;
         }

         try {
            this.p = this.i.a();
         } catch (IOException var13) {
            return var2;
         }
      }
   }

   private int g() {
      switch(this.p) {
      case '*':
         return this.c(2048L);
      default:
         return 1;
      }
   }

   private int c(long var1) {
      try {
         this.p = this.i.a();
      } catch (IOException var4) {
         return 1;
      }

      switch(this.p) {
      case '/':
         if((var1 & 2048L) != 0L) {
            return this.a(1, 11);
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

   public g(b var1) {
      this.a = System.out;
      this.j = new int[120];
      this.k = new int[240];
      this.l = new StringBuffer();
      this.m = this.l;
      this.q = 0;
      this.r = 0;
      this.i = var1;
   }

   public g(b var1, int var2) {
      this(var1);
      this.a(var2);
   }

   public void a(b var1) {
      this.u = this.s = 0;
      this.q = this.r;
      this.i = var1;
      this.h();
   }

   private void h() {
      this.t = -2147483647;

      for(int var1 = 120; var1-- > 0; this.j[var1] = Integer.MIN_VALUE) {
         ;
      }

   }

   public void a(b var1, int var2) {
      this.a(var1);
      this.a(var2);
   }

   public void a(int var1) {
      if(var1 < 7 && var1 >= 0) {
         this.q = var1;
      } else {
         throw new TokenMgrError(a("{E?8!\u0004\u0017\u00040=QE$94\u001e^#!2R^)w?[O$42R\u0017>#2JRmms") + var1 + a("\u0010\u0017\u001e#2JRm\"=]_,94[Sc"), 2);
      }
   }

   protected q i() {
      String var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if(this.u < 0) {
         if(this.m == null) {
            var2 = "";
         } else {
            var2 = this.m.toString();
         }

         var3 = var4 = this.i.g();
         var5 = var6 = this.i.f();
      } else {
         String var7 = jjstrLiteralImages[this.v];
         var2 = var7 == null?this.i.i():var7;
         var3 = this.i.g();
         var5 = this.i.f();
         var4 = this.i.e();
         var6 = this.i.d();
      }

      q var1 = q.a(this.v, var2);
      var1.b = var3;
      var1.d = var4;
      var1.c = var5;
      var1.e = var6;
      return var1;
   }

   public q j() {
      q var1 = null;
      int var3 = 0;

      label147:
      while(true) {
         q var2;
         try {
            this.p = this.i.h();
         } catch (IOException var9) {
            this.v = 0;
            var2 = this.i();
            var2.h = var1;
            this.a(var2);
            return var2;
         }

         this.m = this.l;
         this.m.setLength(0);
         this.n = 0;

         while(true) {
            boolean var13;
            switch(this.q) {
            case 0:
               try {
                  this.i.a(0);

                  while(this.p <= 32 && (4294971904L & 1L << this.p) != 0L) {
                     this.p = this.i.h();
                  }
               } catch (IOException var12) {
                  continue label147;
               }

               this.v = Integer.MAX_VALUE;
               this.u = 0;
               var3 = this.a();
               break;
            case 1:
               this.v = 10;
               this.u = -1;
               var13 = false;
               var3 = this.f();
               if(this.u < 0 || this.u == 0 && this.v > 16) {
                  this.v = 16;
                  this.u = 0;
               }
               break;
            case 2:
               this.v = Integer.MAX_VALUE;
               this.u = 0;
               var3 = this.g();
               if(this.u == 0 && this.v > 16) {
                  this.v = 16;
               }
               break;
            case 3:
               this.v = Integer.MAX_VALUE;
               this.u = 0;
               var3 = this.b();
               if(this.u == 0 && this.v > 16) {
                  this.v = 16;
               }
               break;
            case 4:
               this.v = 13;
               this.u = -1;
               var13 = false;
               var3 = this.e();
               if(this.u < 0 || this.u == 0 && this.v > 16) {
                  this.v = 16;
                  this.u = 0;
               }
               break;
            case 5:
               this.v = Integer.MAX_VALUE;
               this.u = 0;
               var3 = this.c();
               if(this.u == 0 && this.v > 16) {
                  this.v = 16;
               }
               break;
            case 6:
               this.v = Integer.MAX_VALUE;
               this.u = 0;
               var3 = this.d();
            }

            if(this.v == Integer.MAX_VALUE) {
               break label147;
            }

            if(this.u + 1 < var3) {
               this.i.a(var3 - this.u - 1);
            }

            if((e[this.v >> 6] & 1L << (this.v & 63)) != 0L) {
               var2 = this.i();
               var2.h = var1;
               if(jjnewLexState[this.v] != -1) {
                  this.q = jjnewLexState[this.v];
               }

               this.a(var2);
               return var2;
            }

            if((f[this.v >> 6] & 1L << (this.v & 63)) != 0L) {
               if((g[this.v >> 6] & 1L << (this.v & 63)) != 0L) {
                  var2 = this.i();
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

               if(jjnewLexState[this.v] != -1) {
                  this.q = jjnewLexState[this.v];
               }
               break;
            }

            this.k();
            if(jjnewLexState[this.v] != -1) {
               this.q = jjnewLexState[this.v];
            }

            var3 = 0;
            this.v = Integer.MAX_VALUE;

            try {
               this.p = this.i.a();
            } catch (IOException var11) {
               break label147;
            }
         }
      }

      int var4 = this.i.e();
      int var5 = this.i.d();
      String var6 = null;
      boolean var7 = false;

      try {
         this.i.a();
         this.i.a(1);
      } catch (IOException var10) {
         var7 = true;
         var6 = var3 <= 1?"":this.i.i();
         if(this.p != 10 && this.p != 13) {
            ++var5;
         } else {
            ++var4;
            var5 = 0;
         }
      }

      if(!var7) {
         this.i.a(1);
         var6 = var3 <= 1?"":this.i.i();
      }

      throw new TokenMgrError(var7, this.q, var4, var5, var6, this.p, 0);
   }

   void b(q var1) {
      switch(this.v) {
      default:
      }
   }

   void k() {
      this.n += this.o = this.u + 1;
      switch(this.v) {
      case 4:
         this.m.append(this.i.b(this.n));
         this.n = 0;
         this.i.a(1);
         break;
      case 5:
         this.m.append(this.i.b(this.n));
         this.n = 0;
         this.i.a(1);
      }

   }

   private void b(int var1) {
      if(this.j[var1] != this.t) {
         this.k[this.s++] = var1;
         this.j[var1] = this.t;
      }

   }

   private void f(int var1, int var2) {
      do {
         this.k[this.s++] = d[var1];
      } while(var1++ != var2);

   }

   private void g(int var1, int var2) {
      this.b(var1);
      this.b(var2);
   }

   private void h(int var1, int var2) {
      do {
         this.b(d[var1]);
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
            var10003 = 62;
            break;
         case 1:
            var10003 = 55;
            break;
         case 2:
            var10003 = 77;
            break;
         case 3:
            var10003 = 87;
            break;
         default:
            var10003 = 83;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
