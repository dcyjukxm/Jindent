package jindent.customizer.constraint;

public abstract class Actor {
   protected String a;

   public Actor(String var1) {
      this.a = var1;
   }

   public String getName() {
      return this.a;
   }

   public abstract boolean isActive();
}
