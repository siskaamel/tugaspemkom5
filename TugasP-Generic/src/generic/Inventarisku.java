/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package generic;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author acer
 */
public class Inventarisku extends javax.swing.JFrame {
    DataInventaris data = new DataInventaris();

    /**
     * Creates new form Inventaris
     */
    public Inventarisku() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupTombol = new javax.swing.JPopupMenu();
        addFiles = new javax.swing.JMenuItem();
        addFolder = new javax.swing.JMenuItem();
        clearInventaris = new javax.swing.JMenuItem();
        pnFooter = new javax.swing.JPanel();
        btnInventaris = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventaris = new javax.swing.JTable();

        addFiles.setText("jMenuItem1");
        popupTombol.add(addFiles);

        addFolder.setText("jMenuItem2");
        popupTombol.add(addFolder);

        clearInventaris.setText("jMenuItem3");
        popupTombol.add(clearInventaris);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnFooter.setAlignmentY(50.0F);

        btnInventaris.setText("Inventaris");

        tblInventaris.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblInventaris);

        javax.swing.GroupLayout pnFooterLayout = new javax.swing.GroupLayout(pnFooter);
        pnFooter.setLayout(pnFooterLayout);
        pnFooterLayout.setHorizontalGroup(
            pnFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInventaris)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        pnFooterLayout.setVerticalGroup(
            pnFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFooterLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInventaris)
                .addContainerGap())
        );

        getContentPane().add(pnFooter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventaris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventaris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addFiles;
    private javax.swing.JMenuItem addFolder;
    private javax.swing.JButton btnInventaris;
    private javax.swing.JMenuItem clearInventaris;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnFooter;
    private javax.swing.JPopupMenu popupTombol;
    private javax.swing.JTable tblInventaris;
    // End of variables declaration//GEN-END:variables

private void resizeListener(){
    addComponenListener(new ComponenAdapter(){
    @Override
    public void componentResized(ComponentEvent e){
        resizeColumns();
    }
});
}

private void resizeColumns(){
    float[] columnWidthPercentage = {90,0f,10,0f};
    int tW = tblInventaris.getWidth();
    TableColumn column;
    TableColumnModel JTableColumnModel = tblInventaris.getColumnModel();
    int cantCols = JTableColumnModel.getColumnCount();
    for (int i = 0; i < cantCols; i++){
        column = JTableColumnModel.getColumn(i);
        int pWidth = Math.round(columnWidthPercentage[i]*tW);
        column.setPreferredWidth(pWidth);
        tblInventaris.setRowHeight(27);
    }
}

private String fileSizeOf(File file){
    DecimalFormat format = new DecimalFormat("#.##");
    long MB = 1024*1024;
    long MB = 1024;
    final double length = file.lenght();
    if (lenght > MB){
        return format.format(lenght / MB) + "MB";
    }
    if (lenght > KB) {
        return format.format(lenght / KB) + "KB";
    }
    return format.format(lenght) + "B";
}

private String extensionOf(File file){
    String fileExtension="";
    String fileName=file.getName();
    if(fileName.contains(".")&& fileName.lastIndexOf(".")!= 0){
        fileExtension = 
        fileName.substring(fileName.lastIndexOf(".")+1);
    }
    return fileExtension;
}

private void addFiles(File[] files){
    for(File file : files){
        String path = file.getAbsolutePath();
        String fn = file.getName();
        String fileName = fn.substring(0, fn.length()-4);
        String fileSize = fileSizeOf(file);
        String extension = "";
        int i = path.lastIndexOf('.');
        if (i > 0){
            extension = extensionOf(file);
        }
        Inventaris n = new Inventaris(path,fileName,fileSize,extension);
        data.add(n);
    }
}

private void addFolder (File dir){
    File[] listOfFiles = dir.listFiles();
    for (File listOfFile : listOfFiles){
        if (listOfFile.isFile()){
            String path = listOfFile.getName();
            String fn = listOfFile.getName();
            String fileName = fn.substring(0, fn.length()-4);
            String extension;
        }
    }
}
}


