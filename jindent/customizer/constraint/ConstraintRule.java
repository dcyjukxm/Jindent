package jindent.customizer.constraint;

import java.util.Vector;

public class ConstraintRule {
   public static final int RULE_ENABLE = 1;
   public static final int RULE_DISABLE = 2;
   public static final int CONCATENATION_OR = 1;
   public static final int CONCATENATION_AND = 2;
   private Vector a;
   private Vector b;
   private int c;
   private int d;

   public ConstraintRule(int var1) {
      this(1, var1);
   }

   public ConstraintRule(int var1, int var2) {
      this.d = var1;
      this.c = var2;
      this.a = new Vector();
      this.b = new Vector();
   }

   public ConstraintRule(String var1, String var2, int var3) {
      this(var3);
      this.addActorName(var1);
      this.addDestName(var2);
   }

   public String getActorName(int var1) {
      return (String)this.a.elementAt(var1);
   }

   public void addActorName(String var1) {
      this.a.add(var1);
   }

   public int countActorNames() {
      return this.a.size();
   }

   public String getDestName(int var1) {
      return (String)this.b.elementAt(var1);
   }

   public void addDestName(String var1) {
      this.b.add(var1);
   }

   public int countDestNames() {
      return this.b.size();
   }

   public int getRule() {
      return this.c;
   }

   public int getConcatenation() {
      return this.d;
   }
}
