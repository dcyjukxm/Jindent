package jindent.customizer.constraint;

import java.util.Vector;
import jindent.customizer.constraint.Actor;

public class ActorSet {
   private int a;
   private Vector b;

   public ActorSet(int var1) {
      this.a = var1;
      this.b = new Vector();
   }

   public int getConcatenation() {
      return this.a;
   }

   public void addActor(Actor var1) {
      this.b.add(var1);
   }

   public Actor getActor(int var1) {
      return (Actor)this.b.elementAt(var1);
   }

   public int countActors() {
      return this.b.size();
   }

   public boolean isActive() {
      int var1 = this.countActors();
      boolean var2 = this.a == 2;

      for(int var3 = 0; var3 < var1; ++var3) {
         Actor var4 = this.getActor(var3);
         if(this.a == 2) {
            var2 = var2 && var4.isActive();
         }

         if(this.a == 1) {
            var2 = var2 || var4.isActive();
         }
      }

      return var2;
   }
}
