
package Employees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Workers extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    int curRow = 0;
   
    
    public Workers() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect( ) {
        try {
            String host = "jdbc:derby://localhost:1527/Employees";
            String uName = "Judith";
            String uPass = "judith";
            con = DriverManager.getConnection( host,uName, uPass ); 
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            String SQL = "SELECT * FROM WORKERS";
            rs = stmt.executeQuery( SQL );
            
            rs.next();
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("First_Name");
            String job = rs.getString("Job_Title");
            
            jTextField1.setText(id);
            jTextField2.setText(first_name);
            jTextField4.setText(job);
        }
        catch ( SQLException err ) {
         System.out.println( err.getMessage() );
          
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        BtnUpdateRecord = new javax.swing.JButton();
        BtnDeleteRecord = new javax.swing.JButton();
        BtnNewRecord = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Job Title");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        BtnUpdateRecord.setText("Update Record");
        BtnUpdateRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateRecordActionPerformed(evt);
            }
        });

        BtnDeleteRecord.setText("Delete Record");
        BtnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteRecordActionPerformed(evt);
            }
        });

        BtnNewRecord.setText("New Record");
        BtnNewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewRecordActionPerformed(evt);
            }
        });

        btnSave.setText("Save New Record");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel New Record");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnUpdateRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnDeleteRecord)
                .addGap(18, 18, 18)
                .addComponent(BtnNewRecord)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdateRecord)
                    .addComponent(BtnDeleteRecord)
                    .addComponent(BtnNewRecord))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(btnLast)
                    .addComponent(btnFirst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField4))))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs.next());
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("First_Name");
            String last_name = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");
            
            jTextField1.setText(id);
            jTextField2.setText(first_name);
            jTextField3.setText(last_name);
            jTextField4.setText(job);
        }
        
        catch(SQLException err){
           JOptionPane.showMessageDialog(this, err.getMessage());   
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void BtnUpdateRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateRecordActionPerformed
        String first =  jTextField1.getText();
        String last =   jTextField2.getText();
        String job =    jTextField3.getText();
        String ID =     jTextField4.getText();
        
        int newID = Integer.parseInt(ID);
        
        try {
            rs.updateInt( "ID",newID );
            rs.updateString( "First_Name", first );
            rs.updateString( "Last_Name", last );
            rs.updateString( "Job_Title", job );
            rs.updateRow( );
            JOptionPane.showMessageDialog(this, "Updated");
        }
        catch ( SQLException err ) {
         System.out.println( err.getMessage() );
    }//GEN-LAST:event_BtnUpdateRecordActionPerformed
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String first =  jTextField1.getText();
        String last =   jTextField2.getText();
        String job =    jTextField3.getText();
        String ID =     jTextField4.getText();
        
        int newID = Integer.parseInt(ID);
        
        try {
            rs.moveToInsertRow();
        
            rs.updateInt( "ID",newID );
            rs.updateString( "First_Name", first );
            rs.updateString( "Last_Name", last );
            rs.updateString( "Job_Title", job );
            
            rs.insertRow();
            
            stmt.close();
            rs.close();
            
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
            
            String SQL = "SELECT * FROM WORKERS";
            rs = stmt.executeQuery(SQL);
            
            rs.next();
            
         int id_col = rs.getInt("ID");
         String id = Integer.toString( id_col );
         String first2 = rs.getString("First_Name");
         String last2 = rs.getString("Last_Name");
         String job2 = rs.getString("Job_Title");
         
          jTextField1.setText(id);
            jTextField2.setText(first2);
            jTextField3.setText(last2);
            jTextField4.setText(job2);
            
            btnFirst.setEnabled( false );
            btnPrevious.setEnabled( false );
            btnNext.setEnabled( false );
            btnLast.setEnabled( false );
            btnUpdateRecord.setEnabled( false );
            
            
            JOptionPane.showMessageDialog(this, "Record Saved");
    }    
    catch (SQLException err) {
        
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void BtnNewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewRecordActionPerformed
        
        try {
            curRow = rs.getRow();
       jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        
          
            btnFirst.setEnabled( false );
            btnPrevious.setEnabled( false );
            btnNext.setEnabled( false );
            btnLast.setEnabled( false );
            btnSave.setEnabled(true);
            BtnDeleteRecord.setEnabled(false);
            btnCancel.setEnabled(true);
            btnUpdateRecord.setEnabled( false );
            
    }//GEN-LAST:event_BtnNewRecordActionPerformed
    catch (SQLException err) {
    JOptionPane.showMessageDialog(this, err.getMessage());  
  }
      
    }
    private void BtnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteRecordActionPerformed
    try {
        rs.deleteRow();
        
        stmt.close();
        rs.close();
        
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );
         String SQL = "SELECT * FROM WORKERS";
         
         rs.next();
         
         int id_col = rs.getInt("ID");
         String id = Integer.toString( id_col );
         String first_name = rs.getString("First_Name");
         String last_name = rs.getString("Last_Name");
         String job = rs.getString("Job_Title");
         
         jTextField1.setText(id);
         jTextField2.setText(first_name);
         jTextField3.setText(last_name);
         jTextField4.setText(job);
            
            JOptionPane.showMessageDialog(this, "Record Deleted");
    }    
    catch (SQLException err) {
      JOptionPane.showMessageDialog(this, err.getMessage());  
    }
    }//GEN-LAST:event_BtnDeleteRecordActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
       try{
            if(rs.previous());
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("First_Name");
            String last_name = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");
            
            jTextField1.setText(id);
            jTextField2.setText(first_name);
            jTextField3.setText(last_name);
            }
            catch(SQLException err){
                    
                    }
       
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        try {
            if (rs.last());
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("First_Name");
            String last_name = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");
            
            jTextField1.setText(id);
            jTextField2.setText(first_name);
            jTextField3.setText(last_name);
            jTextField4.setText(job);
            
        }
        catch(SQLException err) {
           JOptionPane.showMessageDialog(this, err.getMessage());   
         
    }                              
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            if(rs.first());
            int id_col = rs.getInt("ID");
            String id = Integer.toString( id_col );
            String first_name = rs.getString("First_Name");
            String last_name = rs.getString("Last_Name");
            String job = rs.getString("Job_Title");
            
            jTextField1.setText(id);
            jTextField2.setText(first_name);
            jTextField3.setText(last_name);
            jTextField4.setText(job);
            
        }
        catch(SQLException err) {
           JOptionPane.showMessageDialog(this, err.getMessage());   
        } 
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
         try{
             rs.absolute( curRow );
             jTextField1.setText(rs.getString("First_Name"));
             jTextField1.setText(rs.getString("Last_Name"));
             jTextField1.setText(rs.getString("Job_Title"));
             jTextField1.setText(rs.getString("ID"));
             
             btnSave.setEnabled(false);
             btnPrevious.setEnabled(true);
             btnFirst.setEnabled(true);
             btnLast.setEnabled(true);
             BtnUpdateRecord.setEnabled(true);
             BtnDeleteRecord.setEnabled(true);
             btnNext.setEnabled(true);
             BtnNewRecord.setEnabled(false);
             
                 
         
     
         } 
         catch(SQLException err){
             
         }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        btnSave.setEnabled(false);
        btnCancel.setEnabled(false);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workers().setVisible(true);
}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeleteRecord;
    private javax.swing.JButton BtnNewRecord;
    private javax.swing.JButton BtnUpdateRecord;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
