package jindent.customizer.constraint;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import jindent.customizer.constraint.Actor;
import jindent.customizer.constraint.ActorSet;
import jindent.customizer.constraint.ConstraintObject;
import jindent.customizer.constraint.ConstraintRule;

public class ConstraintsHandler {
   private Hashtable a = new Hashtable();
   private Hashtable b = null;
   private Hashtable c = new Hashtable();
   private Vector d = new Vector();
   private boolean e = false;
   private boolean f = true;

   public void addActor(Actor var1) {
      this.a.put(var1.getName(), var1);
   }

   public void addObject(ConstraintObject var1) {
      this.c.put(var1.getName(), var1);
   }

   public void addRule(ConstraintRule var1) {
      this.d.add(var1);
      this.e = false;
   }

   public boolean isEnabled() {
      return this.f;
   }

   public void setEnabled(boolean var1) {
      this.f = var1;
   }

   private void linkActorsAndObjects() {
      this.b = new Hashtable();
      int var1 = this.d.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ConstraintRule var3 = (ConstraintRule)this.d.elementAt(var2);
         int var4 = var3.countActorNames();
         ActorSet var5 = new ActorSet(var3.getConcatenation());

         int var6;
         for(var6 = 0; var6 < var4; ++var6) {
            String var7 = var3.getActorName(var6);
            Actor var8 = (Actor)this.a.get(var7);
            if(var8 == null) {
               throw new RuntimeException(a("A63\\rvw;[sfw<Qim%g\u0012") + var7);
            }

            var5.addActor(var8);
         }

         var6 = var3.countDestNames();

         for(int var10 = 0; var10 < var6; ++var10) {
            String var11 = var3.getDestName(var10);
            ConstraintObject var9 = (ConstraintObject)this.c.get(var11);
            if(var9 == null) {
               throw new RuntimeException(a("C4)]o8w>Ssl8)\u0012{k99\u0012yg$)\b=") + var11);
            }

            var9.addActorSet(var5, var3.getRule());
            this.b.put(var9.getName(), var9);
         }
      }

      this.e = true;
   }

   public void update() {
      if(this.f) {
         if(!this.e) {
            this.linkActorsAndObjects();
         }

         Enumeration var1 = this.b.elements();

         while(var1.hasMoreElements()) {
            ConstraintObject var2 = (ConstraintObject)var1.nextElement();
            var2.update();
         }

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
            var10003 = 2;
            break;
         case 1:
            var10003 = 87;
            break;
         case 2:
            var10003 = 93;
            break;
         case 3:
            var10003 = 50;
            break;
         default:
            var10003 = 29;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
