/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledbprogram;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palwa
 */
public class LibraryFrame extends javax.swing.JFrame {

    /**
     * Creates new form LibraryFrame
     */
    DefaultTableModel model;
    Object tablerow[][];
    String tablecol[] = {"ID", "Book Name", "Book Quantity", "Book Year"};
    
    QueryProcessor process;
    
    public LibraryFrame() {
        initComponents();
     
        process = new QueryProcessor();
        
        setTable();
    }
    public void setTable(){
   
        tablerow = process.getAllRecord("Select * from `book_info`");
         model = new DefaultTableModel(tablerow,tablecol);
        jTable1.setModel(model);
    }
    
    public void addInfo(){
        process.executeUpdate("Insert into `book_info` Values('"+idTF.getText()+"','"+bookNameTF.getText()+"','"+bookQuantityTF.getText()+"','"+bookYearTF.getText()+"')");
    }
    
    public int getRowNumber(){
        return Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(),0).toString());
        }
    public void setDataToTextFields(){
        idTF.setText(process.getSpecificField("SELECT `book_id` FROM `book_info` WHERE `book_id` = '"+getRowNumber()+"'"));
        bookNameTF.setText(process.getSpecificField("SELECT `book_name` FROM `book_info` WHERE `book_id` = '"+getRowNumber()+"'"));
        bookQuantityTF.setText(process.getSpecificField("SELECT `book_quantity` FROM `book_info` WHERE `book_id` = '"+getRowNumber()+"'"));
        bookYearTF.setText(process.getSpecificField("SELECT `book_year` FROM `book_info` WHERE `book_id` = '"+getRowNumber()+"'"));
    }
    public void UpdateData(){
        process.executeUpdate("UPDATE `book_info` SET `book_id`='"+idTF.getText()+"',`book_name`='"+bookNameTF.getText()+"',`book_quantity`='"+bookQuantityTF.getText()+"',`book_year`='"+bookYearTF.getText()+"' WHERE `book_id` ='"+getRowNumber()+"'");
    }
    public void deleteData(){
        process.executeUpdate("DELETE FROM `book_info` WHERE `book_id` ='"+getRowNumber()+"'");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        bookNameTF = new javax.swing.JTextField();
        bookQuantityTF = new javax.swing.JTextField();
        bookYearTF = new javax.swing.JTextField();
        newBttn = new javax.swing.JButton();
        addBttn = new javax.swing.JButton();
        editBttn = new javax.swing.JButton();
        saveBttn = new javax.swing.JButton();
        deleteBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Name", "Book Quantity", "Book Year"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Book Name");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Book Quantity");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Book Year");

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        bookNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameTFActionPerformed(evt);
            }
        });

        bookQuantityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookQuantityTFActionPerformed(evt);
            }
        });

        bookYearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookYearTFActionPerformed(evt);
            }
        });

        newBttn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        newBttn.setText("NEW");
        newBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBttnActionPerformed(evt);
            }
        });

        addBttn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        addBttn.setText("ADD");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        editBttn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        editBttn.setText("EDIT");
        editBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBttnActionPerformed(evt);
            }
        });

        saveBttn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        saveBttn.setText("SAVE");
        saveBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBttnActionPerformed(evt);
            }
        });

        deleteBttn.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        deleteBttn.setText("DELETE");
        deleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTF)
                            .addComponent(bookNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookQuantityTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookYearTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newBttn)
                        .addGap(62, 62, 62)
                        .addComponent(addBttn)
                        .addGap(62, 62, 62)
                        .addComponent(editBttn)
                        .addGap(62, 62, 62)
                        .addComponent(saveBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteBttn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(bookQuantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(bookYearTF))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newBttn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editBttn)
                        .addComponent(addBttn)
                        .addComponent(saveBttn)
                        .addComponent(deleteBttn)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void bookNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameTFActionPerformed

    private void bookQuantityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookQuantityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookQuantityTFActionPerformed

    private void bookYearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookYearTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookYearTFActionPerformed

    private void newBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBttnActionPerformed

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        // TODO add your handling code here: 
      addInfo();
      setTable();
    }//GEN-LAST:event_addBttnActionPerformed

    private void editBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBttnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_editBttnActionPerformed

    private void saveBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBttnActionPerformed
        // TODO add your handling code here:
       UpdateData();
       setTable();
    }//GEN-LAST:event_saveBttnActionPerformed

    private void deleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBttnActionPerformed
        // TODO add your handling code here:
        deleteData();
        setTable();
    }//GEN-LAST:event_deleteBttnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        getRowNumber();
        setDataToTextFields();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JTextField bookNameTF;
    private javax.swing.JTextField bookQuantityTF;
    private javax.swing.JTextField bookYearTF;
    private javax.swing.JButton deleteBttn;
    private javax.swing.JButton editBttn;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newBttn;
    private javax.swing.JButton saveBttn;
    // End of variables declaration//GEN-END:variables
}