package jindent.plugin.output;

public interface PluginThreadOutput {
   void setMaximum(int var1);

   void setCurrent(int var1);

   void setMessage(int var1, String var2);

   void init();

   void setOutputVisible(boolean var1);

   void stopFormatting();

   boolean isFormattingStopped();
}
