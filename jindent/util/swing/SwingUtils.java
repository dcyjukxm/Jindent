package jindent.util.swing;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.Arrays;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import jindent.ExtensionManager;
import jindent.util.swing.SwingUtils$3;
import jindent.util.swing.f;
import jindent.util.swing.m;
import jindent.util.swing.n;
import jindent.util.swing.o;
import jindent.util.swing.p;
import jindent.util.swing.q;
import jindent.util.swing.r;
import jindent.util.swing.s;
import jindent.util.swing.t;
import jindent.util.swing.u;

public class SwingUtils {
   private static final String a = "o\u0016,kjuT";
   public static final Font MONO_FONT = new Font(a("K\u0014#c|v\u001a.ik"), 0, 11);
   public static final String ERROR_ICON_32 = "32x32/error.png";
   public static final String INFO_ICON_32 = "32x32/information.png";
   public static final String ASSISTENT_ICON_32 = "32x32/lightbulb_on.png";
   public static final String MAC_SAD_ICON_32 = "32x32/mac_sad_logo.png";
   public static final String TRIAL_END_ICON_32 = "32x32/window_time.png";
   public static final String TRIAL_RESTRICTION_ICON_32 = "32x32/window_lock.png";
   public static final String IMPORT_ICON_32 = "32x32/import1.png";
   public static final String QUESTION_ICON_32 = "32x32/unknown.png";
   public static final String WAIT_ICON_32 = "32x32/gear_time.png";
   public static final String WARNING_ICON_32 = "32x32/warning.png";
   public static final String ADD_LICENSE_FROM_FILE_ICON_16 = "16x16/document_add.png";
   public static final String ADD_LICENSE_FROM_CLIPBOARD_ICON_16 = "16x16/paste.png";
   public static final String SHOW_LICENSE_ICON_16 = "16x16/document_view.png";
   public static final String REMOVE_LICENSE_ICON_16 = "16x16/delete2.png";
   public static final String TREE_NODE_ICON_16 = "16x16/TreeNode.gif";
   public static final String PREVIEW_FILE_ICON_16 = "16x16/document.png";
   public static final String JINDENT_PREVIEW_FILES_ICON_16 = "16x16/documents.png";
   public static final String TREE_LAST_NODE_ICON_16 = "16x16/TreeLastNode.gif";
   public static final String FOLDER_OPEN_ICON_16 = "16x16/folder.png";
   public static final String FOLDER_CLOSED_ICON_16 = "16x16/folder_closed.png";
   public static final String ARROW_ICON_16 = "16x16/Arrow.gif";
   public static final String BLANK_ICON_16 = "16x16/blank.gif";
   public static final String HELP_ICON_16 = "16x16/help.png";
   public static final String HELP_CLICKED_ICON_16 = "16x16/help_clicked.png";
   public static final String HELP_DISABLED_ICON_16 = "16x16/help_disabled.png";
   public static final String IMPORT_ICON_24 = "24x24/import2.png";
   public static final String EXPORT_ICON_24 = "24x24/export2.png";
   public static final String DUKE_ICON_16 = "16x16/duke.gif";
   public static final String OPEN_FILE_ICON_16 = "16x16/folder.png";
   public static final String SORTER_ROOT_ICON_16 = "16x16/document.png";
   public static final String FILE_ICON_16 = "16x16/document.png";
   public static final String SOURCE_PLAIN_MESSAGE_ICON_16 = "16x16/document.png";
   public static final String SOURCE_WITH_MESSAGE_ICON_16 = "16x16/document_info.png";
   public static final String CLOSE_ICON_16 = "16x16/exit.png";
   public static final String SOURCE_WITH_WARNING_ICON_16 = "16x16/document_warning.png";
   public static final String SOURCE_WITH_ERROR_ICON_16 = "16x16/document_error.png";
   public static final String RESOURCE_PLAIN_MESSAGE_ICON_16 = "16x16/document_gear.png";
   public static final String ABOUT_ICON_16 = "16x16/about.png";
   public static final String RESOURCE_WITH_ERROR_ICON_16 = "16x16/document_gear_error.png";
   public static final String FILES_ICON_16 = "16x16/documents.png";
   public static final String WARNING_ICON_16 = "16x16/warning.png";
   public static final String ERROR_ICON_16 = "16x16/error.png";
   public static final String INFORMATION_ICON_16 = "16x16/information.png";
   public static final String SORTER_FILTER_ICON_16 = "16x16/filter.gif";
   public static final String SORTER_BULLET_ICON_16 = "16x16/bullet.gif";
   public static final String INSERT_TEXT_ICON_16 = "16x16/document_edit.png";
   public static final String ADD_SOURCE_CODE_ICON_16 = "16x16/document_add.png";
   public static final String SAVE_ICON_24 = "24x24/disk_blue.png";
   public static final String SORTER_ARROW_UP_ICON_24 = "24x24/arrow_up_blue.png";
   public static final String SORTER_ARROW_DOWN_ICON_24 = "24x24/arrow_down_blue.png";
   public static final String SORTER_ADD_ICON_24 = "24x24/add.png";
   public static final String SORTER_EDIT_ICON_24 = "24x24/edit.png";
   public static final String SORTER_REMOVE_ICON_24 = "24x24/delete.png";
   public static final String ZOOM_IN_ICON_16 = "16x16/zoom_in.png";
   public static final String ZOOM_OUT_ICON_16 = "16x16/zoom_out.png";
   public static final String ZOOM_DEFAULT_ICON_16 = "16x16/view_1_1.png";
   public static final String ADD_ICON_16 = "16x16/add2.png";
   public static final String REMOVE_ICON_16 = "16x16/delete2.png";
   public static final String EDIT_ICON_16 = "16x16/document_edit.png";
   public static final String FIT_WIDTH_ICON_16 = "16x16/fit_to_width.gif";
   public static final String TAB_STOP_ICON_16 = "16x16/tab_stop.gif";
   public static final String LINE_BREAK_ICON_16 = "16x16/line_break.gif";
   public static final String SPACE_ICON_16 = "16x16/space.gif";
   public static final String JINDENT_LOGO = "JindentLogo.gif";
   public static final String JINDENT_ICON_16 = "16x16/jindent.gif";
   public static final String JINDENT_ICON_32 = "32x32/jindent.png";
   public static final String JINDENT_COMMANDER_ICON_16 = "16x16/jindent_commander.png";
   public static final String JINDENT_CUSTOMIZER_ICON_16 = "16x16/jindent_customizer.png";
   public static final String SOFTWARE_SOLUTIONS_LOGO = "SoftwareSolutionsLogo.gif";
   public static final String NAVIGATION_LEFT_ICON_24 = "24x24/nav_left_blue.png";
   public static final String NAVIGATION_RIGHT_ICON_24 = "24x24/nav_right_blue.png";
   public static final String REFRESH_ICON_24 = "24x24/refresh.png";
   public static final String FILES_SECTION_ICON_32 = "32x32/documents.png";
   public static final String PREFERENCES_SECTION_ICON_32 = "32x32/preferences.png";
   public static final String REPORT_SECTION_ICON_32 = "32x32/document_dirty.png";
   public static final String NAVIGATION_TIP_ICON_32 = "32x32/signpost.png";
   public static final String NEW_ICON_24 = "24x24/document_new.png";
   public static final String SAVE_AS_ICON_24 = "24x24/save_as.png";
   public static final String OPEN_ICON_24 = "24x24/folder.png";
   public static final String PLAY_ICON_24 = "24x24/media_play_green.png";
   public static final String STOP_ICON_24 = "24x24/media_stop_red.png";
   public static final String FILE_FILTER_ICON_16 = "16x16/file_filter.png";
   public static final String TARGET_DIR_ICON_16 = "16x16/folder_into.png";
   public static final String COPY_ICON_16 = "16x16/copy.png";
   public static final String SELECTED_FILE_ICON_16 = "16x16/document.png";
   public static final String SELECTED_FOLDER_ICON_16 = "16x16/folder_document.png";
   public static final String FILES_REFRESH_ICON_16 = "16x16/refresh.png";
   public static final String DOCUMENT_ICON_16 = "16x16/document.png";
   public static final String RECURSIVELY_SELECTED_FOLDERS_ICON_16 = "16x16/folders.png";
   public static final String OPEN_FOLDER_ICON_16 = "16x16/folder.png";
   public static final String CLOSED_FOLDER_ICON_16 = "16x16/folder_closed.png";
   public static final String FILE_MISSING_ICON_16 = "16x16/document_delete.png";
   public static final String SELECT_LEFT_FRAME_ICON_16 = "16x16/select_left_frame.png";
   public static final String SELECT_RIGHT_FRAME_ICON_16 = "16x16/select_right_frame.png";
   public static final String OPEN_ICON_16 = "16x16/folder.png";
   public static final String SAVE_ICON_16 = "16x16/disk_blue.png";
   public static final String SAVE_AS_ICON_16 = "16x16/disk_blue_window.png";
   public static final String NEW_ICON_16 = "16x16/document_new.png";
   public static final String EXIT_ICON_16 = "16x16/exit.png";
   public static final String IMPORT_ICON_16 = "16x16/import2.png";
   public static final String EXPORT_ICON_16 = "16x16/export2.png";
   public static final String START_ICON_16 = "16x16/media_play_green.png";
   public static final String STOP_ICON_16 = "16x16/media_stop_red.png";
   public static final String ARROW_UP_ICON_16 = "16x16/arrow2_up_green.png";
   public static final String ARROW_DOWN_ICON_16 = "16x16/arrow2_down_green.png";
   public static final String JINDENT_PROJECT_EXTENSION = "xjp";
   public static final String BEFORE_DOCUMENT_ICON_16 = "16x16/document_into.png";
   public static final String AFTER_DOCUMENT_ICON_16 = "16x16/document_out.png";
   public static final String JINDENT_ICON_24 = "24x24/jindent.png";
   private static JFileChooser b = null;
   private static JFileChooser c = null;
   private static JFileChooser d = null;
   private static JFileChooser e = null;
   private static JFileChooser f = null;
   private static JFileChooser g = null;
   private static JFileChooser h = null;
   private static JFileChooser i = null;
   private static JFileChooser j = null;
   private static JFileChooser k = null;
   private static JFileChooser l = null;
   static Class m;

   public static ImageIcon readImageIcon(String var0) {
      URL var1 = (m == null?(m = class$(a("l\u0012#hjh\u000fcy{o\u0017c\u007fxo\u0015*\"\\q\u0012#kZr\u0012!\u007f"))):m).getResource(a("o\u0016,kjuT") + var0);
      if(var1 != null) {
         return new ImageIcon(var1);
      } else {
         System.err.println(a("E\u001a#b`r[+eab[+eccAm") + var0);
         return null;
      }
   }

   public static String getImageIconPath(String var0) {
      return a("l\u0012#hjh\u000fby{o\u0017b\u007fxo\u0015*#fk\u001a*i|)") + var0;
   }

   public static JButton createIconButton(String var0, String var1) {
      ImageIcon var2 = readImageIcon(var0);
      JButton var3 = new JButton(var2);
      var3.setToolTipText(var1);
      var3.setPreferredSize(new Dimension(var2.getIconWidth() + 2, var2.getIconHeight() + 2));
      return var3;
   }

   public static void rightAlignWindow(Window var0) {
      Dimension var1 = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension var2 = var0.getSize();
      if(var2.height > var1.height) {
         var2.height = var1.height;
      }

      if(var2.width > var1.width) {
         var2.width = var1.width;
      }

      var0.setLocation(var1.width - var2.width, (var1.height - var2.height) / 2);
   }

   public static void centerWindow(Window var0) {
      Dimension var1 = Toolkit.getDefaultToolkit().getScreenSize();
      Dimension var2 = var0.getSize();
      if(var2.height > var1.height) {
         var2.height = var1.height;
      }

      if(var2.width > var1.width) {
         var2.width = var1.width;
      }

      var0.setLocation((var1.width - var2.width) / 2, (var1.height - var2.height) / 2);
   }

   public static void centerWindowTo(Window var0, Window var1) {
      var0.setLocationRelativeTo(var1);
   }

   public static void alignPreviewWindow(Window var0, Window var1) {
      boolean var2 = var1.isVisible();
      Dimension var3 = Toolkit.getDefaultToolkit().getScreenSize();
      Point var4 = var1.getLocation();
      Dimension var5 = var1.getSize();
      Dimension var6 = var0.getSize();
      double var7 = (var3.getWidth() - (var5.getWidth() + var6.getWidth())) / 2.0D;
      if(var7 < 0.0D) {
         var7 = 0.0D;
      }

      double var9 = var4.getY() + (var5.getHeight() - var6.getHeight()) / 2.0D;
      if(var9 < 0.0D) {
         var9 = 0.0D;
      }

      Point var11 = new Point((int)var7, (int)var9);
      if(var2) {
         var0.setLocation(var11);
      } else {
         var0.setLocation(new Point(0, 0));
      }

   }

   public static void alignWindows(Window var0, Window var1) {
      Dimension var2 = Toolkit.getDefaultToolkit().getScreenSize();
      Point var3 = var1.getLocation();
      Dimension var4 = var1.getSize();
      Dimension var5 = var0.getSize();
      alignPreviewWindow(var0, var1);
      Point var6 = var0.getLocation();
      double var7 = var6.getX() + var5.getWidth();
      double var9 = var7 + var4.getWidth();
      if(var9 >= var2.getWidth()) {
         var7 = var2.getWidth() - var4.getWidth();
      }

      var3 = new Point((int)var7, (int)var3.getY());
      var1.setLocation(var3);
   }

   public static JFileChooser getOpenSettingsFileChooser() {
      if(d == null) {
         d = new JFileChooser();
         d.setFileSelectionMode(2);
         d.setFileFilter(new m());
         d.setFileFilter(new p());
      }

      return d;
   }

   public static JFileChooser getSaveSettingsFileChooser() {
      if(e == null) {
         e = new SwingUtils$3();
         e.setFileSelectionMode(2);
         e.setFileFilter(new q());
      }

      return e;
   }

   public static JFileChooser getLicenseFileChooser() {
      if(b == null) {
         b = new JFileChooser();
         b.setFileSelectionMode(2);
         b.setFileFilter(new r());
      }

      return b;
   }

   public static JFileChooser getLogFileChooser() {
      if(c == null) {
         c = new JFileChooser();
         c.setFileSelectionMode(2);
         c.setFileFilter(new s());
      }

      return c;
   }

   public static JFileChooser getOutputDirectoryChooser() {
      if(g == null) {
         g = new JFileChooser();
         g.setFileSelectionMode(1);
         g.setFileFilter(new t());
      }

      return g;
   }

   public static JFileChooser getCommanderSettingsFileChooser() {
      if(h == null) {
         h = new JFileChooser();
         h.setFileSelectionMode(2);
         h.setFileFilter(new u());
      }

      return h;
   }

   public static JFileChooser getSourceFileChooser(ExtensionManager var0) {
      if(f == null) {
         f = new JFileChooser();
         f.setFileSelectionMode(0);
         f.setAcceptAllFileFilterUsed(true);
      }

      Set var1 = var0.getAssignedExtensions();
      int var2 = var1.size();
      String[] var3 = new String[var2];
      System.arraycopy(var1.toArray(), 0, var3, 0, var2);
      Arrays.sort(var3, new f());
      f.resetChoosableFileFilters();

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         f.setFileFilter(new jindent.customizer.b.a(var5, var5));
      }

      f.setFileFilter(f.getAcceptAllFileFilter());
      return f;
   }

   public static float getMaxWidthOfFontSize(Font var0, float var1) {
      Font var2 = var0.deriveFont(var1);
      FontRenderContext var3 = new FontRenderContext(new AffineTransform(), false, false);
      Rectangle2D var4 = var2.getStringBounds("O", var3);
      return (float)var4.getWidth();
   }

   public static Window findWindow(Container var0) {
      return var0 != null && !(var0 instanceof Window)?(var0 instanceof JPopupMenu?findWindow(((JPopupMenu)var0).getInvoker()):findWindow(var0.getParent())):(Window)var0;
   }

   public static Window findWindow(Component var0) {
      return var0 != null && !(var0 instanceof Window)?(var0 instanceof JPopupMenu?findWindow(((JPopupMenu)var0).getInvoker()):findWindow(var0.getParent())):(Window)var0;
   }

   public static JFileChooser getOpenProjectFileChooser() {
      if(j == null) {
         j = new JFileChooser();
         j.setFileSelectionMode(2);
         j.setFileFilter(new n());
      }

      return j;
   }

   public static JFileChooser getSaveProjectFileChooser() {
      if(k == null) {
         k = new JFileChooser();
         k.setFileSelectionMode(2);
         k.setFileFilter(new o());
      }

      return k;
   }

   public static JFileChooser getDirChooser() {
      if(l == null) {
         l = new JFileChooser();
         l.setMultiSelectionEnabled(false);
         l.setDialogTitle(a("E\u0013\"c|c[)i|r\u0012#m{o\u0014#,ko\t(o{i\t4"));
         l.setFileHidingEnabled(true);
         l.setFileSelectionMode(1);
      }

      return l;
   }

   public static void main(String[] var0) {
      System.out.println(getImageIconPath("16x16/jindent.gif"));
   }

   public static boolean hasValidPosition(Window var0) {
      return var0.isVisible();
   }

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
            var10003 = 6;
            break;
         case 1:
            var10003 = 123;
            break;
         case 2:
            var10003 = 77;
            break;
         case 3:
            var10003 = 12;
            break;
         default:
            var10003 = 15;
         }

         var1[var3] = (char)(var10002 ^ var10003);
      }

      return new String(var1);
   }
}
