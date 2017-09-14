package jindent.settings.sorter;

import java.io.Serializable;
import java.lang.reflect.Field;
import javax.swing.tree.DefaultMutableTreeNode;
import jindent.JindentException;
import jindent.formatter.l;
import jindent.formatter.b.b;
import jindent.formatter.b.c;
import jindent.formatter.b.d;
import jindent.formatter.b.e;
import jindent.formatter.b.g;
import jindent.formatter.b.h;
import jindent.settings.sorter.OptionalSorterElement;
import jindent.settings.sorter.SorterElementToolTipFactory;

public class SorterElement extends DefaultMutableTreeNode implements Cloneable {
   private static final boolean USE_CASE_SENSITIVE_SORTING = true;
   private static final boolean USE_CASE_INSENSITIVE_SORTING = false;
   private static final long serialVersionUID = 3256718498527982391L;
   public static final int ID_HEADER = 0;
   public static final int ID_FOOTER = 1;
   public static final int ID_DECLARATION = 2;
   public static final int ID_CLASS = 3;
   public static final int ID_INTERFACE = 4;
   public static final int ID_METHOD = 5;
   public static final int ID_CONSTRUCTOR = 6;
   public static final int ID_FIELD = 7;
   public static final int ID_STATIC_FIELD = 8;
   public static final int ID_INITIALIZER = 9;
   public static final int ID_STATIC_INITIALIZER = 10;
   public static final int ID_ENUM = 11;
   public static final int ID_CONSTANT_ENUM = 12;
   public static final int ID_ANNOTATION_TYPE = 13;
   public static final int ID_INNER_BLOCK = 14;
   public static final int ID_BLOCK_STATEMENT = 15;
   public static final int ID_SEMICOLONS = 16;
   public static final int ID_PACKAGE = 17;
   public static final int ID_EMPTY = 18;
   public static final int ID_IMPORT = 19;
   public static final int ID_INITIALIZED = 20;
   public static final int ID_NON_INITIALIZED = 21;
   public static final int ID_NAME = 22;
   public static final int ID_PARAMETER_COUNT = 23;
   public static final int ID_METHOD_GROUPS = 24;
   public static final int ID_METHOD_GETTER = 25;
   public static final int ID_METHOD_SETTER = 26;
   public static final int ID_METHOD_HAS_GETTER = 27;
   public static final int ID_METHOD_IS_GETTER = 28;
   public static final int ID_METHOD_ORDINARY = 29;
   public static final int ID_TYPE = 30;
   public static final int ID_IMPORT_MEMBERSHIP = 31;
   public static final int ID_BELONGS_TO_JDK = 32;
   public static final int ID_BELONGS_NOT_TO_JDK = 33;
   public static final int ID_ACCESS_MODIFIER = 34;
   public static final int ID_PUBLIC = 35;
   public static final int ID_PRIVATE = 36;
   public static final int ID_PROTECTED = 37;
   public static final int ID_NON_MODIFIED = 38;
   public static final int ID_STATIC_MODIFIER = 39;
   public static final int ID_STATIC = 40;
   public static final int ID_FINAL_MODIFIER = 41;
   public static final int ID_FINAL = 42;
   public static final int ID_ABSTRACT_MODIFIER = 43;
   public static final int ID_ABSTRACT = 44;
   public static final int ID_NATIVE_MODIFIER = 45;
   public static final int ID_NATIVE = 46;
   public static final int ID_STRICTFP_MODIFIER = 47;
   public static final int ID_STRICTFP = 48;
   public static final int ID_SYNCHRONIZED_MODIFIER = 49;
   public static final int ID_SYNCHRONIZED = 50;
   public static final int ID_ANNOTATION_MODIFIER = 51;
   public static final int ID_ANNOTATION = 52;
   public static final int ID_TRANSIENT_MODIFIER = 53;
   public static final int ID_TRANSIENT = 54;
   public static final int ID_VOLATILE_MODIFIER = 55;
   public static final int ID_VOLATILE = 56;
   public static final int ID_PREPROCESSOR_FUNCTION = 57;
   public static final int ID_PREPROCESSOR_DIRECTIVE = 58;
   public static final int ID_DECONSTRUCTOR = 59;
   public static final int ID_USING_DECLARATION = 60;
   public static final int ID_SEMICOLONS_DECLARATION = 61;
   public static final int ID_TEMPLATE = 62;
   public static final int ID_LINKAGE_SPECIFICATION = 63;
   public static final int ID_ALIAS_NAMESPACE_DEFINITION = 64;
   public static final int ID_METADATA = 65;
   public static final int ID_NAMESPACE_DEFINITION = 66;
   public static final int MEMBER_DECLARATIONS = 67;
   public static final int MEMBER_DECLARATION = 68;
   public static final int ID_IMPORT_GROUPING = 69;
   public static final int ID_IMPORT_GROUP = 70;
   public static final int ID_METHOD_PROPERTY_ACCESS_NODE = 71;
   public static final int ID_METHOD_PROPERTY_ACCESS = 72;
   protected String name;
   protected int id;
   // $FF: synthetic field
   static Class class$jindent$settings$sorter$SorterElement;

   protected static int stringToId(String var0) {
      try {
         Field var1 = (class$jindent$settings$sorter$SorterElement == null?(class$jindent$settings$sorter$SorterElement = class$(a(" \u001d=LF$\u0000}[F>\u0000:FD9Z GQ>\u0011!\u0006p%\u0006\'MQ\u000f\u00186EF$\u0000"))):class$jindent$settings$sorter$SorterElement).getField(var0);
         return var1.getInt((Object)null);
      } catch (Exception var2) {
         throw new RuntimeException(var2.toString());
      }
   }

   public SorterElement(String var1, int var2) {
      this.name = var1;
      this.id = var2;
   }

   public static SorterElement createFromString(String var0) throws JindentException {
      Object var1 = null;

      try {
         int var2 = var0.indexOf(44);
         if(var2 < 0) {
            return null;
         } else {
            int var3 = var0.indexOf(44, var2 + 1);
            if(var3 == -1) {
               throw new JindentException(a("x\u001a7\b@%\u0019>I\u0003#\u0007sEJ9\u0007:FD"));
            } else {
               int var4 = var0.indexOf(44, var3 + 1);
               if(var4 == -1) {
                  throw new JindentException(a("y\u00067\b@%\u0019>I\u0003#\u0007sEJ9\u0007:FD"));
               } else {
                  String var5 = var0.substring(0, var2).trim();
                  String var6 = var0.substring(var2 + 1, var3).trim();
                  boolean var7 = (new Boolean(var6)).booleanValue();
                  String var8 = var0.substring(var3 + 1, var4).trim();
                  int var9 = stringToId(var8);
                  var1 = var6.equals("")?new SorterElement(var5, var9):new OptionalSorterElement(var5, var9, var7);
                  int var10 = var0.lastIndexOf(44);
                  if(var10 == -1) {
                     throw new JindentException(a("~\u0000;\b@%\u0019>I\u0003#\u0007sEJ9\u0007:FD"));
                  } else {
                     int var11 = var0.lastIndexOf(41);
                     if(var11 > var10) {
                        var10 = var0.length();
                     }

                     if(var4 == var10) {
                        return (SorterElement)var1;
                     } else {
                        String var12 = var0.substring(var4 + 1, var10).trim();
                        int var13 = 0;

                        int var16;
                        for(int var14 = var12.length(); var13 < var14; var13 = var16) {
                           var13 = var12.indexOf(40, var13);
                           if(var13 == -1) {
                              break;
                           }

                           int var15 = 0;
                           var16 = var13;

                           do {
                              if(var12.charAt(var16) == 40) {
                                 ++var15;
                              }

                              if(var12.charAt(var16) == 41) {
                                 --var15;
                              }

                              ++var16;
                           } while(var15 > 0);

                           String var17 = var12.substring(var13 + 1, var16 - 1);
                           SorterElement var18 = createFromString(var17);
                           if(var18 != null) {
                              ((SorterElement)var1).add(var18);
                           }
                        }

                        return (SorterElement)var1;
                     }
                  }
               }
            }
         }
      } catch (JindentException var19) {
         throw var19;
      } catch (Exception var20) {
         throw new JindentException(a(",\u001b!EB>T6P@/\u0004\'AL$Ns") + var20.getMessage());
      } catch (Error var21) {
         throw new JindentException(a(",\u001b!EB>T6ZQ%\u0006i\b") + var21.getMessage());
      }
   }

   public String getName() {
      return this.name;
   }

   public int getSortId() {
      return this.id;
   }

   public String getToolTipText() {
      return SorterElementToolTipFactory.createToolTipText(this);
   }

   public boolean isParentSortChecked() {
      return this.isParentSortChecked(this);
   }

   private boolean isParentSortChecked(DefaultMutableTreeNode var1) {
      DefaultMutableTreeNode var2 = (DefaultMutableTreeNode)var1.getParent();
      if(var2 != null && var2 instanceof OptionalSorterElement) {
         OptionalSorterElement var3 = (OptionalSorterElement)var2;
         return var3.isSort()?this.isParentSortChecked(var2):false;
      } else {
         return true;
      }
   }

   public static int compareElements(SorterElement var0, h var1, h var2, boolean var3) {
      if(var1 instanceof jindent.formatter.b.a && var2 instanceof jindent.formatter.b.a) {
         label178: {
            jindent.formatter.b.a var4 = (jindent.formatter.b.a)var1;
            if(var1 instanceof d && var2 instanceof d) {
               boolean var5 = ((d)var1).d().d();
               boolean var6 = ((d)var2).d().d();
               if(var5 && !var6) {
                  break label178;
               }
            }

            if(!var4.b() && var4.c()) {
               var4.a((jindent.formatter.b.a)var2);
            }
         }
      }

      if(var0 instanceof OptionalSorterElement && !((OptionalSorterElement)var0).isSort()) {
         return 0;
      } else {
         boolean var14 = false;
         int var16 = var0.getSortId();
         int var17 = 2;
         int var7 = 2;
         String var8;
         String var9;
         int var11;
         String var12;
         int var18;
         l var19;
         int var20;
         int var21;
         l var22;
         SorterElement var25;
         switch(var16) {
         case 2:
            var17 = var1.g();
            var7 = var2.g();
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 32:
         case 33:
         case 35:
         case 36:
         case 37:
         case 38:
         case 40:
         case 42:
         case 44:
         case 46:
         case 48:
         case 50:
         case 52:
         case 54:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 70:
         default:
            break;
         case 9:
            boolean var26 = var1 instanceof jindent.formatter.b.a;
            boolean var28 = var2 instanceof jindent.formatter.b.a;
            var21 = compareIds(var0, 20, 21);
            if(var26 == var28) {
               return 0;
            }

            if(var26 && !var28) {
               return var21;
            }

            if(!var26 && var28) {
               return -var21;
            }
            break;
         case 22:
            var8 = ((e)var1).e();
            var9 = ((e)var2).e();
            return compareStrings(var8, var9, var3);
         case 23:
            var18 = ((g)var1).c();
            var20 = ((g)var2).c();
            if(var18 == var20) {
               for(var21 = 0; var21 < var18; ++var21) {
                  String var24 = ((g)var1).b(var21);
                  var12 = ((g)var2).b(var21);
                  int var27 = compareStrings(var24, var12, false);
                  if(var27 != 0) {
                     return var27;
                  }
               }

               return 0;
            }

            if(var18 < var20) {
               return -1;
            }

            return 1;
         case 24:
            var17 = ((c)var1).a();
            var7 = ((c)var2).a();
            break;
         case 30:
            var8 = ((jindent.formatter.b.l)var1).f();
            var9 = ((jindent.formatter.b.l)var2).f();
            return compareStrings(var8, var9, true);
         case 31:
            var17 = ((b)var1).a()?32:33;
            var7 = ((b)var2).a()?32:33;
            break;
         case 34:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convAccessModifierToId(var19);
            var7 = convAccessModifierToId(var22);
            break;
         case 39:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convStaticModifierToId(var19);
            var7 = convStaticModifierToId(var22);
            break;
         case 41:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convFinalModifierToId(var19);
            var7 = convFinalModifierToId(var22);
            break;
         case 43:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convAbstractModifierToId(var19);
            var7 = convAbstractModifierToId(var22);
            break;
         case 45:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convNativeModifierToId(var19);
            var7 = convNativeModifierToId(var22);
            break;
         case 47:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convStrictFPModifierToId(var19);
            var7 = convStrictFPModifierToId(var22);
            break;
         case 49:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convSynchronizedModifierToId(var19);
            var7 = convSynchronizedModifierToId(var22);
            break;
         case 51:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convAnnotationModifierToId(var19);
            var7 = convAnnotationModifierToId(var22);
            break;
         case 53:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convTransientModifierToId(var19);
            var7 = convTransientModifierToId(var22);
            break;
         case 55:
            var19 = ((d)var1).d();
            var22 = ((d)var2).d();
            var17 = convVolatileModifierToId(var19);
            var7 = convVolatileModifierToId(var22);
            break;
         case 69:
            var18 = var0.getChildCount();
            var20 = var18;

            for(var21 = 0; var21 < var18; ++var21) {
               SorterElement var23 = (SorterElement)var0.getChildAt(var21);
               var12 = var23.getName();
               if(var12.equals("*")) {
                  var20 = var21;
               } else if(((b)var1).a(var12)) {
                  var20 = var21;
                  break;
               }
            }

            var21 = var18;

            for(var11 = 0; var11 < var18; ++var11) {
               var25 = (SorterElement)var0.getChildAt(var11);
               String var13 = var25.getName();
               if(var13.equals("*")) {
                  var21 = var11;
               } else if(((b)var2).a(var13)) {
                  var21 = var11;
                  break;
               }
            }

            if(var20 > var21) {
               return 1;
            }

            if(var20 < var21) {
               return -1;
            }

            return 0;
         case 71:
            var8 = ((c)var1).b();
            var9 = ((c)var2).b();
            SorterElement var10 = (SorterElement)var0.getChildAt(0);
            var11 = var10.getId() == 29?1:-1;
            if(var8 == null && var9 == null) {
               return 0;
            }

            if(var8 != null && var9 == null) {
               return var11;
            }

            if(var8 == null && var9 != null) {
               return -var11;
            }

            return compareStrings(var8, var9, var3);
         }

         int var15 = compareIds(var0, var17, var7);
         if(var15 == 0) {
            var18 = var0.getIndexOfId(var17);
            SorterElement var29 = (SorterElement)var0.getChildAt(var18);
            if(var29 instanceof OptionalSorterElement && !((OptionalSorterElement)var29).isSort()) {
               return var15;
            }

            var21 = var29.getChildCount();

            for(var11 = 0; var11 < var21 && var15 == 0; ++var11) {
               var25 = (SorterElement)var29.getChildAt(var11);
               var15 = compareElements(var25, var1, var2, var3);
            }
         }

         return var15;
      }
   }

   private static int compareStrings(String var0, String var1, boolean var2) {
      int var3 = var2?var0.compareTo(var1):var0.compareToIgnoreCase(var1);
      return var3 < 0?-1:(var3 > 0?1:0);
   }

   private static int convAccessModifierToId(l var0) {
      return var0.a()?35:(var0.c()?37:(var0.b()?36:38));
   }

   private static int convStaticModifierToId(l var0) {
      return var0.d()?40:38;
   }

   private static int convFinalModifierToId(l var0) {
      return var0.e()?42:38;
   }

   private static int convAbstractModifierToId(l var0) {
      return var0.k()?44:38;
   }

   private static int convNativeModifierToId(l var0) {
      return var0.i()?46:38;
   }

   private static int convStrictFPModifierToId(l var0) {
      return var0.l()?48:38;
   }

   private static int convSynchronizedModifierToId(l var0) {
      return var0.f()?50:38;
   }

   private static int convAnnotationModifierToId(l var0) {
      return var0.m()?52:38;
   }

   private static int convTransientModifierToId(l var0) {
      return var0.h()?54:38;
   }

   private static int convVolatileModifierToId(l var0) {
      return var0.g()?56:38;
   }

   public static int compareIds(SorterElement var0, int var1, int var2) {
      int var3 = var0.getIndexOfId(var1);
      int var4 = var0.getIndexOfId(var2);
      return var3 == -1 && var4 != -1?1:(var3 != -1 && var4 == -1?-1:(var3 == -1 && var4 == -1?1:(var3 < var4?-1:(var3 == var4?0:1))));
   }

   private int getIndexOfId(int var1) {
      int var2 = this.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         SorterElement var4 = (SorterElement)this.getChildAt(var3);
         if(var4.getSortId() == var1) {
            return var3;
         }
      }

      return -1;
   }

   public SorterElement getFirstChildById(int var1) {
      int var2 = this.getIndexOfId(var1);
      return var2 == -1?null:(SorterElement)this.getChildAt(var2);
   }

   public int getFirstIndexOfName(String var1) {
      if(var1 == null) {
         return -1;
      } else {
         int var2 = this.getChildCount();

         for(int var3 = 0; var3 < var2; ++var3) {
            SorterElement var4 = (SorterElement)this.getChildAt(var3);
            if(var1.equals(var4.getName())) {
               return var3;
            }
         }

         return -1;
      }
   }

   public Object clone() {
      return jindent.util.a.a.a((Serializable)this);
   }

   public int getId() {
      return this.id;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   // $FF: synthetic method
   static Class class$(String var0) {
      try {
         return Class.forName(var0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 74;
            break;
         case 1:
            var10003 = 116;
            break;
         case 2:
            var10003 = 83;
            break;
         case 3:
            var10003 = 40;
            break;
         default:
            var10003 = 35;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
