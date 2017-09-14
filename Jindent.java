import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Vector;
import java.util.regex.Pattern;
import jindent.JindentSettings;
import jindent.JindentSystem;
import jindent.SettingsVersionException;
import jindent.commander.FileEntry;
import jindent.commander.JindentProject;
import jindent.plugin.FormatCommand;
import jindent.plugin.a.d;
import jindent.plugin.a.b.c;
import jindent.util.c.b;

public class Jindent {
   public static String JINDENT_INFO_STRING = JindentSystem.getJindentInfoString();
   public static String HOMEPAGE = f("\u000fM/4qH\u0016,3<IS2*/\u0002W/j(\bT");
   public static String EMAIL = f("\u0014L+4$\u0015M\u001b.\"\t]>*?IZ4)");
   private static JindentSettings a = JindentSystem.getDefaultJindentSettings();
   private static boolean b = false;
   private static boolean c = false;
   private static jindent.plugin.a.a.a d;
   private static d e;
   private static JindentProject f = new JindentProject();
   private static Vector g = new Vector();
   private static boolean h = false;
   private static HashSet i = new HashSet();
   private static boolean j = false;

   public static void main(String[] var0) {
      int var1;
      for(var1 = 0; var1 < var0.length; ++var1) {
         if(var0[var1].equals(f("J]>&>\u0000"))) {
            j = true;
         }
      }

      e(f("&K<1&\u0002W/7qG"));

      for(var1 = 0; var1 < var0.length; ++var1) {
         e(var0[var1] + " ");
      }

      e("\n");
      d = new jindent.plugin.a.a.a(System.out);
      e = new d(false, d);
      e.setDebug(j);
      e.setActivationWindow(b.CONSOLE_OUTPUT);
      if(var0 == null || var0.length == 0) {
         a();
         c(f("*P(7\"\t^{%9\u0000L6!%\u0013J"));
      }

      File var2;
      if((var0.length <= 0 || !var0[0].equals(f("JA"))) && !var0[0].equals(f("J\\#!(\u0012M>"))) {
         if(!c) {
            System.out.println(JINDENT_INFO_STRING);
         }

         for(var1 = 0; var1 < var0.length; ++var1) {
            if(var0[var1] == null) {
               c(f(".W-%\'\u000e]{%9\u0000L6!%\u0013\u0003{") + var1);
            }

            if(!var0[var1].equals(f("JQ")) && !var0[var1].equals(f("J\u0006")) && !var0[var1].equals(f("JQ>(;"))) {
               if(!var0[var1].equals(f("J]>&>\u0000"))) {
                  if(!var0[var1].equals(f("JK")) && !var0[var1].equals(f("JK>\'>\u0015J22."))) {
                     if(!var0[var1].equals(f("JT")) && !var0[var1].equals(f("JT.0."))) {
                        if(!var0[var1].equals(f("JZ")) && !var0[var1].equals(f("JZ442"))) {
                           if(!var0[var1].equals(f("J_7")) && !var0[var1].equals(f("JU27?"))) {
                              String var13;
                              if(!var0[var1].equals(f("JI")) && !var0[var1].equals(f("JJ>0")) && !var0[var1].equals(f("JJ"))) {
                                 if(!var0[var1].equals(f("J]")) && !var0[var1].equals(f("J]>7?"))) {
                                    if(!var0[var1].equals(f("JL5-3")) && !var0[var1].equals(f("J]47")) && !var0[var1].equals(f("JX.0$")) && !var0[var1].equals(f("J\\52")) && !var0[var1].equals(f("JT6")) && !var0[var1].equals(f("JN")) && !var0[var1].equals(f("JT.0.\n")) && !var0[var1].equals(f("JN8+/\u0002")) && !var0[var1].equals(f("JN?+("))) {
                                       if(!var0[var1].equals(f("JP/%)")) && !var0[var1].equals(f("J\\52-")) && !var0[var1].equals(f("JP54>\u0013|5\'$\u0003P5#")) && !var0[var1].equals(f("JV.0;\u0012M\u001e*(\b]2*,")) && !var0[var1].equals(f("JK>7$\u0012K8!\u000e\tZ4 \"\t^")) && !var0[var1].equals(f("JU4#"))) {
                                          if(!var0[var1].equals(f("JW4%%\u000eT")) && !var0[var1].equals(f("J[:/")) && !var0[var1].equals(f("JW4&*\f")) && !var0[var1].equals(f("JW47<\u000eW<"))) {
                                             if(!var0[var1].equals(f("JT:4")) && !var0[var1].equals(f("JM2).")) && !var0[var1].equals(f("J[.\"")) && !var0[var1].equals(f("JX5-&")) && !var0[var1].equals(f("J[:/.\u001fM"))) {
                                                a(var0[var1]);
                                             } else {
                                                d(var0[var1] + f("GP(d*G]>49\u0002Z:0.\u0003\u001944?\u000eV5j"));
                                                if(var1 < var0.length - 1) {
                                                   ++var1;
                                                }
                                             }
                                          } else {
                                             d(var0[var1] + f("GP(d*G]>49\u0002Z:0.\u0003\u001944?\u000eV5j"));
                                          }
                                       } else {
                                          d(var0[var1] + f("GP(d*G]>49\u0002Z:0.\u0003\u001944?\u000eV5jk.M{-8GW43k\u0017X)0k\b_{0#\u0002\u0019\u0011-%\u0003\\50k\u0014\\/0\"\t^(jk4\\>d?\u000f\\{\u000e\"\t]>*?GT:*>\u0006U{\"$\u0015\u0019?!?\u0006P77e"));
                                          if(var1 < var0.length - 1) {
                                             ++var1;
                                          }
                                       }
                                    } else {
                                       d(var0[var1] + f("GP(d*G]>49\u0002Z:0.\u0003\u001944?\u000eV5jk.M{-8GW43k\u0017X)0k\b_{0#\u0002\u0019\u0011-%\u0003\\50k\u0014\\/0\"\t^(jk4\\>d?\u000f\\{\u000e\"\t]>*?GT:*>\u0006U{\"$\u0015\u0019?!?\u0006P77e"));
                                    }
                                 } else if(var1 + 1 >= var0.length) {
                                    c(f("*P(7\"\t^{%9\u0000L6!%\u0013\u0019=+9G\u0014?dc\u0013X)#.\u0013\u0019?-9\u0002Z/+9\u001e\u0010"));
                                 } else {
                                    var13 = var0[var1 + 1];
                                    if(var13.endsWith("\\") || var13.endsWith("/")) {
                                       var13 = var13.substring(0, var13.length() - 1);
                                    }

                                    ++var1;
                                    File var15 = new File(var13);
                                    if(var15.isFile()) {
                                       c(f("3X)#.\u0013\u0019?-9\u0002Z/+9\u001e\u0019") + var13 + f("GP(d*\t\u0019><\"\u0014M2*,G_2(."));
                                    }

                                    if(!var15.exists()) {
                                       d(f("3X)#.\u0013\u0019?-9\u0002Z/+9\u001e\u0019") + var13 + f("G]4!8GW40k\u0002A27?I\u0019\u000f62\u000eW<d?\b\u001986.\u0006M>d\"\u0013\u0017{"));
                                       if(!var15.mkdirs()) {
                                          System.err.println(f("!X2(.\u0003\u0017"));
                                          c(f("$X5c?GZ)!*\u0013\\{0*\u0015^>0k\u0003P)!(\u0013V)=qG") + var13);
                                       } else {
                                          System.err.println(f("(Ru"));
                                       }
                                    }

                                    if(!var15.canWrite()) {
                                       c(f("$X5c?GN)-?\u0002\u0019/+k\u0013X)#.\u0013\u0019?-9\u0002Z/+9\u001e\u0003{") + var13);
                                    }

                                    f.setTargetDirEnabled(true);
                                    f.setTargetDirPath(var13);
                                 }
                              } else if(var1 + 1 >= var0.length) {
                                 c(f("*P(7\"\t^{%9\u0000L6!%\u0013\u0019=+9G\u0014+kf\u0014\\/dc\u0014\\/0\"\t^(d-\u000eU>m"));
                              } else {
                                 var13 = var0[var1 + 1];
                                 ++var1;

                                 try {
                                    a = JindentSettings.createFromFileAndCheckVersion(var13);
                                 } catch (SettingsVersionException var5) {
                                    c(var5.getMessage() + f("mi7!*\u0014\\{18\u0002\u0019\u0011-%\u0003\\50k$L(0$\nP!!9GM4d\"\nI46?GX5 k\u0004V52.\u0015M{0#\u0002J>d8\u0002M/-%\u0000J{0$GW>3k\bW>e"));
                                 } catch (Exception var6) {
                                    c(var6.getMessage());
                                 }
                              }
                           } else if(var1 + 1 >= var0.length) {
                              c(f("*P(7\"\t^{%9\u0000L6!%\u0013\u0019=+9G\u0014=(kOU27?\u0001P7!b"));
                           } else {
                              var2 = null;
                              String var14 = var0[var1 + 1];

                              try {
                                 BufferedReader var12 = new BufferedReader(new FileReader(var14));

                                 String var16;
                                 while((var16 = var12.readLine()) != null) {
                                    var16 = var16.trim();
                                    if(!var16.equals("")) {
                                       a(var16);
                                    }
                                 }
                              } catch (FileNotFoundException var9) {
                                 c(f("$X5c?G_2*/G_2(.GU27?]\u0019") + var14);
                              } catch (IOException var10) {
                                 c(f("$X5c?GK>%/G_2(.GU27?]\u0019") + var14);
                              }
                           }
                        } else {
                           f.setCopyResources(true);
                        }
                     } else {
                        c = true;
                     }
                  } else {
                     b = true;
                  }
               }
            } else {
               a();
               System.exit(0);
            }
         }
      } else {
         if(var0.length > 2) {
            a();
            c(f("3V4d&\u0006W\"d*\u0015^.).\tM(j"));
         }

         if(var0.length < 2) {
            a();
            c(f("*P(7\"\t^{%9\u0000L6!%\u0013\u0017"));
         }

         String var11 = var0[1];
         var2 = new File(var11);
         if(!var2.exists()) {
            c(f("!P7!k") + var11 + f("GW40k\u0001V.*/I"));
         }

         if(!var2.isFile()) {
            c(f("!P7!k") + var11 + f("GP(d%\bM{%k\u0001P7!e"));
         }

         if(!var2.canRead()) {
            c(f("$X5c?GV+!%G_2(.G") + var11 + ".");
         }

         try {
            XMLDecoder var3 = new XMLDecoder(new BufferedInputStream(new FileInputStream(var11)));
            JindentProject var4 = (JindentProject)var3.readObject();
            var3.close();
         } catch (FileNotFoundException var7) {
            c(f("!P7!k\tV/d-\bL5 qG") + var11);
         } catch (Exception var8) {
            c(f("!P7!k") + var11 + f("GQ:7k\u000eW-%\'\u000e]{\"$\u0015T:0e"));
         }
      }

      f.setJindentSettings(a);
      f.setFileEntries((FileEntry[])((FileEntry[])g.toArray(new FileEntry[0])));
      a(f);
   }

   private static void a(String var0) {
      if(!h) {
         if(!c) {
            System.out.println(f("$V7(.\u0004M2*,GP54>\u0013\u0019=-\'\u0002Juje"));
         }

         h = true;
      }

      int var1 = var0.indexOf("*");
      int var2 = var0.indexOf("?");
      if(var1 == -1 && var2 == -1) {
         File var12 = new File(var0);
         if(!var12.exists()) {
            d(f("!P7!k") + var0 + f("G]4!8GW40k\u0002A27?I\u0019\b/\"\u0017I2*,I"));
            return;
         }

         if(!var12.canRead()) {
            d(f("$X5c?GK>%/G_2(.H]26k") + var0 + f("I\u0019\b/\"\u0017I2*,I"));
            return;
         }

         if(!var12.canWrite() && !f.isTargetDirEnabled()) {
            d(f("$X5c?GN)-?\u0002\u0019/+k\u0001P7!d\u0003P)d") + var0 + f("I\u0019\b/\"\u0017I2*,I"));
            return;
         }

         FileEntry var13;
         if(var12.isDirectory()) {
            var13 = new FileEntry(var12, b);
            if(!c) {
               System.out.print(f("$V7(.\u0004M2*,G]26.\u0004M462G") + var12.getAbsolutePath());
               if(b) {
                  System.out.println(f("GX5 k\u0006U7d8\u0012[?-9\u0002Z/+9\u000e\\("));
               } else {
                  System.out.println();
               }
            }

            g.add(var13);
         }

         if(var12.isFile()) {
            var13 = new FileEntry(var12, false);
            if(!c) {
               System.out.println(f("$V7(.\u0004M2*,G_2(.G") + var12.getAbsolutePath());
            }

            g.add(var13);
         }
      } else {
         int var3 = Math.min(var1 == -1?var2:var1, var2 == -1?var1:var2);
         int var4 = var0.lastIndexOf("/");
         int var5 = var0.lastIndexOf("\\");
         int var6 = Math.max(var4, var5);
         if(var6 > var3) {
            c(f("\"K)+9GP5d<\u000eU?\'*\u0015]{!3\u0017K>78\u000eV5~k") + var0);
         }

         String var7;
         String var8;
         if(var6 > 0) {
            var7 = var0.substring(0, var6);
            var8 = var0.substring(var6 + 1);
         } else {
            var7 = ".";
            var8 = var0;
         }

         try {
            Pattern var9 = b(var8);
            PatternFileEntry var10 = new PatternFileEntry(var7, b, var9);
            if(!c) {
               if(b) {
                  System.out.println(f("$V7(.\u0004M2*,GX7(k\u0001P7!8GZ4*?\u0006P5!/GP5d/\u000eK>\'?\bK\"~k") + var7 + f("GV)d*\t@{7>\u0005]26.\u0004M462GT:0(\u000fP5#qG\u001b") + var8 + "\"");
               } else {
                  System.out.println(f("$V7(.\u0004M2*,GX7(k\u0001P7!8GZ4*?\u0006P5!/GP5d/\u000eK>\'?\bK\"~k") + var7 + f("GT:0(\u000fP5#qG\u001b") + var8 + "\"");
               }
            }

            g.add(var10);
         } catch (Exception var11) {
            c(f("0P7 (\u0006K?d.\u001fI)!8\u0014P4*k\u000eJ{-%\u0011X7-/I"));
         }
      }

   }

   private static void a(JindentProject var0) {
      e.setJindentSettings(var0.getJindentSettings());
      FileEntry[] var1 = f.getFileEntries();
      i.clear();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if(var1[var2] != null) {
            File var3;
            if(var1[var2] instanceof PatternFileEntry) {
               var3 = var1[var2].getFile();
               String var4 = var3.getAbsolutePath();
               Pattern var5 = ((PatternFileEntry)var1[var2]).a();
               if(var3.isDirectory()) {
                  a(var3, var4, var1[var2].isRecursive(), f.isTargetDirEnabled(), f.getTargetDirPath(), f.isCopyResources(), var5);
               }
            } else {
               var3 = var1[var2].getFile();
               File var6 = var3.getParentFile();
               String var7 = var6 != null?var6.getAbsolutePath():"";
               if(var3.isDirectory()) {
                  a(var3, var7, var1[var2].isRecursive(), f.isTargetDirEnabled(), f.getTargetDirPath(), f.isCopyResources());
               } else {
                  a(var3, var7, f.isTargetDirEnabled(), f.getTargetDirPath(), f.isCopyResources());
               }
            }
         }
      }

      if(h && !c) {
         if(var1.length == 0) {
            System.out.println(f("#V5!eGw4d-\u000eU>7k\u0001V.*/I\u0019"));
         } else {
            System.out.println(f("#V5!e"));
         }
      }

      d.a(c);
      e.start();
   }

   private static Pattern b(String var0) {
      String var1 = new String();

      for(int var2 = 0; var2 < var0.length(); ++var2) {
         char var3 = var0.charAt(var2);
         switch(var3) {
         case '*':
            var1 = var1 + f("O\u0017qm");
            break;
         case '?':
            var1 = var1 + f("O\u0017dm");
            break;
         default:
            var1 = var1 + var3;
         }
      }

      return Pattern.compile(var1);
   }

   private static void a(File var0, String var1, boolean var2, boolean var3, String var4, boolean var5, Pattern var6) {
      if(var6 != null) {
         if(var0 != null) {
            a var7 = new a(var6, var2);
            File[] var8 = var0.listFiles(var7);

            for(int var9 = 0; var9 < var8.length; ++var9) {
               File var10 = var8[var9];
               if(var10.isDirectory() && var2) {
                  a(var10, var1, var2, var3, var4, var5, var6);
               }

               if(var10.isFile()) {
                  a(var10, var1, var3, var4, var5);
               }
            }

         }
      }
   }

   private static void a(File var0, String var1, boolean var2, boolean var3, String var4, boolean var5) {
      File[] var6 = var0.listFiles();

      for(int var7 = 0; var7 < var6.length; ++var7) {
         File var8 = var6[var7];
         if(var8.isDirectory() && var2) {
            a(var8, var1, var2, var3, var4, var5);
         }

         if(var8.isFile()) {
            a(var8, var1, var3, var4, var5);
         }
      }

   }

   private static void a(File var0, String var1, boolean var2, String var3, boolean var4) {
      Object var5;
      if(var2) {
         c var6 = new c(var0);
         File var7 = new File(var3, var0.getAbsolutePath().substring(var1.length()));
         String var8 = f("!V))*\u0013\u0019\u0018+;\u001e\u0003{") + var0.getAbsolutePath() + f("G\u0014ed") + var7.getAbsolutePath() + (var4?f("G\u00118+;\u001e\u00146+/\u0002\u0010"):"");
         if(i.contains(var8)) {
            d(f("4R24;\u000eW<d&\u0012U/-;\u000b\\{\"$\u0015T:0k\u0004V6)*\t]ad") + var8);
            return;
         }

         i.add(var8);
         jindent.plugin.a.b.a var9 = new jindent.plugin.a.b.a(var7);
         var5 = new jindent.plugin.a.c.b(var6, var9, var4);
         e(var8 + "\n");
      } else {
         jindent.plugin.a.b.b var10 = new jindent.plugin.a.b.b(var0);
         String var11 = f("!V))*\u0013\u0003{") + var10.getFullFilename();
         if(i.contains(var11)) {
            d(f("4R24;\u000eW<d&\u0012U/-;\u000b\\{\"$\u0015T:0k\u0004V6)*\t]ad") + var11);
            return;
         }

         i.add(var11);
         var5 = new jindent.plugin.a.c.a(var10);
         e(var11 + "\n");
      }

      e.addCommand((FormatCommand)var5);
   }

   private static void a() {
      System.out.println();
      System.out.println(JINDENT_INFO_STRING);
      System.out.println(f("$V+=9\u000e^30kOZrdz^\u0000liyW\bm"));
      System.out.println(f("\u0005@{\n.\u0010_46&\u0014\u0019vd\u001f\u0002Z3*$\u000bV<-.\u0014"));
      System.out.println();
      System.out.println(f("7U>%8\u0002\u0019?+k\tV/d-\bK<!?GM4d=\u000eJ20k\bL)d<\u0002[{7\"\u0013\\{%?]"));
      System.out.println();
      System.out.println(f("G\u0019{dkG\u0019{") + HOMEPAGE);
      System.out.println();
      System.out.println(f("._{=$\u0012\u0019,-8\u000f\u0019/+k\u0004V50*\u0004M{0#\u0002\u0019?!=\u0002U44.\u0015\u0015{4\'\u0002X(!k\u0014\\5 k\u0002T:-\'GM4~"));
      System.out.println();
      System.out.println(f("G\u0019{dkG\u0019{") + EMAIL);
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println(f(".W-+(\u0006M2+%GV=d\u0001\u000eW?!%\u0013\u0019/,9\bL<,k\tX/-=\u0002\u0019><.JN)%;\u0017\\)d$\u0015\u0019><.\u0004L/-$\t\u0019(\'9\u000eI/7q"));
      System.out.println();
      System.out.println(f("G\u0019\u0011-%\u0003\\50k<\u001444?\u000eV57\u0016Gbg-%\u0017L/\"\"\u000b\\(z\u0016"));
      System.out.println();
      System.out.println();
      System.out.println(f(".W-+(\u0006M2+%GV=d\u0001\u000eW?!%\u0013\u001e(d8\u000f\\7(k\u0014Z)-;\u0013\u00194*k+P513Hl5-3GJ\"7?\u0002T(d?\u000fK41,\u000f\u0019(,k\u0004V6)*\t]a"));
      System.out.println();
      System.out.println(f("G\u0019(,k-P5 .\tMu7#Gbv+;\u0013P4*8:\u0019\u0000x\"\tI.0-\u000eU>7u:"));
      System.out.println();
      System.out.println();
      System.out.println(f(".W-+(\u0006M2+%GV=d\u0001\u000eW?!%\u0013\u0019/,9\bL<,k\u0006\u0019\u0011%=\u0006\u0019\r\tkOX/d\'\u0002X(0k-k\u001edzI\r{-8GK>5>\u000eK> b]"));
      System.out.println();
      System.out.println(f("G\u00191%=\u0006\u0019\u0011-%\u0003\\50k<\u001444?\u000eV57\u0016Gbg-%\u0017L/\"\"\u000b\\(z\u0016"));
      System.out.println();
      System.out.println();
      System.out.println(f(".W+1?G_2(.\u0014\u0003"));
      System.out.println();
      System.out.println(f("G\u0019g-%\u0017L/\"\"\u000b\\(zkG\u0019{dkG\u0019{dkG\u0019\u001ad\'\u000eJ/d$\u0001\u00192*;\u0012M{\"\"\u000b\\(k/\u000eK>\'?\bK2!8GM4d-\bK6%?"));
      System.out.println();
      System.out.println();
      System.out.println(f("(I/-$\tJa"));
      System.out.println();
      System.out.println(f("G\u0019v<gG\u0014><.\u0004L/!k[A14f\u0001P7!uG\u0019\u001d+9\nX/7k\u0006\u0019\u0011-%\u0003\\50k\u0017K4..\u0004M{ .\u0001P5!/G[\"d?\u000f\\{<!\u0017\u0014=-\'\u0002"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u000f+k\u0004K>%?\u0002\u001946k\u0002]20k-P5 .\tM{49\bS>\'?G_2(.\u0014\u0019s<!\u0017\u0014=-\'\u0002Jr"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019.7.GM3!k-P5 .\tM{\u0007$\nT:*/\u0002K{%;\u0017U2\'*\u0013P4*"));
      System.out.println(f("G\u0019v\"\'G\u00057-8\u0013_2(.Y\u0019{dkG\u0019{dkG\u0019\u001d+9\nX/7k\u0001P7!8GJ+!(\u000e_2!/GP5d*GM><?GU27?G_2(."));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u000f+k\u0004K>%?\u0002\u001946k\u0002]20k\u000bP(0k\u0001P7!8GL(!k\u001eV.6k\u0001X-+>\u0015P/!"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019/!3\u0013\u0019> \"\u0013V)"));
      System.out.println(f("G\u0019v gG\u0014?!8\u0013\u0019g4*\u0013QedkG\u0019{dkG\u0019\b!?\u0014\u0019?!8\u0013P5%?\u000eV5d/\u000eK>\'?\bK\"d-\bK{+>\u0013I.0k\u0001P7!8"));
      System.out.println(f("G\u0019v)gG\u001461?\u0002\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u00161?\u0002\u00196+/\u0002\u0019vd\u0018\u0012I)!8\u0014\u0019:(\'GT>78\u0006^>7"));
      System.out.println(f("G\u0019v6gG\u0014)!(\u0012K(-=\u0002\u0019{dkG\u0019{dkG\u0019\u001d+9\nX/7k\u0006U7d-\u000eU>7k\u000eW{7>\u0005]26.\u0004M46\"\u0002J"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019)!(\u0012K(-=\u0002U\"d?\bV"));
      System.out.println(f("G\u0019v\'gG\u00148+;\u001e\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u0018+;\u001e\u0019)!8\bL)\'.G\u00115+%JJ419\u0004\\{\'$\u0003\\rd-\u000eU>7k\u0013V{ .\u0014M2**\u0013P4*"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019?-9\u0002Z/+9\u001e"));
      System.out.println(f("G\u0019v4gG\u0014(hkJJ>0k[A17f\u0001P7!uG\u0019\b!?\u0014\u0019\u0011-%\u0003\\50k\u0014\\/0\"\t^(d-\u000eU>dc\u001fS(i-\u000eU>m"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u0012\"k\tV{!3\u0017U2\'\"\u0013\u0019+%?\u000f\u001927k\u0000P-!%GM3!%Gs2*/\u0002W/d<\u000eU7d>\u0014\\"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019208GP50.\u0015W:(k\u0014\\/0\"\t^(d-\u000eU>d)\u001e\u0019?!-\u0006L70"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019\u000f+k\u0004K>%?\u0002\u001946k\u0002]20k-P5 .\tM{7.\u0013M2*,\u0014\u0019=-\'\u0002J{l3\rJv\"\"\u000b\\(m"));
      System.out.println(f("G\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019{dkG\u0019.7.GM3!k-P5 .\tM{\u0007>\u0014M4)\"\u001d\\)d*\u0017I7-(\u0006M2+%"));
      System.out.println(f("G\u0019v,gG\u00143!\'\u0017\u001946kJ\u0006{dkG\u0019{dkG\u0019\u0013!\'\u0017\u0019=+9GI:6*\n\\/!9GL(%,\u0002\u0019s0#\u000eJr"));
      System.out.println();
      System.out.println();
   }

   private static void c(String var0) {
      System.err.println(f("\"k\t\u000b\u0019]\u0019") + var0);
      System.exit(1);
   }

   private static void d(String var0) {
      if(!c) {
         System.err.println(f("0x\t\n\u0002)~ad") + var0);
      }

   }

   private static void e(String var0) {
      if(j) {
         System.out.print(var0);
      }

   }

   private static String f(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 103;
            break;
         case 1:
            var10003 = 57;
            break;
         case 2:
            var10003 = 91;
            break;
         case 3:
            var10003 = 68;
            break;
         default:
            var10003 = 75;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
