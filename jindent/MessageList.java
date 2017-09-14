package jindent;

import java.util.Vector;
import jindent.formatter.u;
import jindent.message.ErrorMessage;
import jindent.message.Message;
import jindent.message.WarningMessage;
import jindent.plugin.report.Report;
import jindent.util.MyStringBuffer;

public class MessageList implements Cloneable {
   private Vector messages = new Vector();
   private Report parentReport;

   public int countMessages() {
      return this.messages.size();
   }

   public Message getMessageAt(int var1) {
      return (Message)this.messages.elementAt(var1);
   }

   private void removeMessageAt(int var1) {
      Message var2 = (Message)this.messages.get(var1);
      var2.setParentMessageList((MessageList)null);
      this.messages.removeElementAt(var1);
   }

   public void clear() {
      int var1 = this.messages.size();

      for(int var2 = var1 - 1; var2 >= 0; --var2) {
         this.removeMessageAt(var2);
      }

   }

   public void addMessage(Message var1) {
      this.messages.addElement(var1);
      var1.setParentMessageList(this);
   }

   public void addMessages(MessageList var1) {
      for(int var2 = 0; var2 < var1.countMessages(); ++var2) {
         this.addMessage(var1.getMessageAt(var2));
      }

   }

   public void sort() {
      int var1 = this.messages.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = var2;

         for(int var4 = var2; var4 < var1; ++var4) {
            Message var5 = (Message)this.messages.elementAt(var3);
            Message var6 = (Message)this.messages.elementAt(var4);
            boolean var7 = var5.hasColumnAndLineNumber();
            boolean var8 = var6.hasColumnAndLineNumber();
            if(var7 && !var8 || var7 && var8 && (var5.getLine() > var6.getLine() || var5.getLine() == var6.getLine() && var5.getColumn() > var6.getColumn())) {
               var3 = var4;
            }
         }

         Message var9 = (Message)this.messages.elementAt(var3);
         this.messages.remove(var3);
         this.messages.insertElementAt(var9, var2);
      }

   }

   public boolean containsWarningMessage() {
      int var1 = this.countMessages();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.getMessageAt(var2) instanceof WarningMessage) {
            return true;
         }
      }

      return false;
   }

   public boolean containsErrorMessage() {
      int var1 = this.countMessages();

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.getMessageAt(var2) instanceof ErrorMessage) {
            return true;
         }
      }

      return false;
   }

   public MessageList getMessages(int var1) {
      MessageList var2 = new MessageList();
      int var3 = this.countMessages();

      for(int var4 = 0; var4 < var3; ++var4) {
         Message var5 = this.getMessageAt(var4);
         int var6 = var5.getMessageId();
         if(u.a(var1, var6)) {
            var2.addMessage(var5);
         }
      }

      return var2;
   }

   public boolean containsMessage() {
      return this.countMessages() > 0;
   }

   public void addMessageList(MessageList var1) {
      int var2 = var1.countMessages();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.addMessage(var1.getMessageAt(var3));
      }

   }

   public MessageList getMessagesByLineNumber(int var1) {
      MessageList var2 = new MessageList();
      var2.setParentReport(this.parentReport);

      for(int var3 = 0; var3 < this.countMessages(); ++var3) {
         Message var4 = this.getMessageAt(var3);
         if(var4.hasColumnAndLineNumber() && var4.getLine() == var1) {
            var2.addMessage(var4);
         }
      }

      return var2;
   }

   public Report getParentReport() {
      return this.parentReport;
   }

   public void setParentReport(Report var1) {
      this.parentReport = var1;
   }

   public Object clone() {
      MessageList var1 = new MessageList();

      for(int var2 = 0; var2 < this.countMessages(); ++var2) {
         var1.addMessage(this.getMessageAt(var2));
      }

      var1.setParentReport(this.getParentReport());
      return var1;
   }

   public MessageList copyWithoutTokenReferences() {
      MessageList var1 = new MessageList();

      for(int var2 = 0; var2 < this.countMessages(); ++var2) {
         var1.addMessage(this.getMessageAt(var2).copyWithoutReferences());
      }

      var1.setParentReport(this.getParentReport());
      return var1;
   }

   public String toString() {
      MyStringBuffer var1 = new MyStringBuffer();

      for(int var2 = 0; var2 < this.countMessages(); ++var2) {
         if(var1.a() == 0) {
            var1.a(a("Mk"));
         }

         var1.a((Object)this.getMessageAt(var2));
      }

      return var1.toString();
   }

   private static String a(String var0) {
      char[] var1 = var0.toCharArray();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         char var10002 = var1[var3];
         byte var10003;
         switch(var3 % 5) {
         case 0:
            var10003 = 97;
            break;
         case 1:
            var10003 = 75;
            break;
         case 2:
            var10003 = 116;
            break;
         case 3:
            var10003 = 46;
            break;
         default:
            var10003 = 38;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
