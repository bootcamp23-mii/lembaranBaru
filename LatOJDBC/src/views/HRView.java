/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


import controllers.EmployeeController;
import models.Employee;
import tools.DBConnection;
import controllers.JobController;
import daos.JobDAO;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.Job;

/**
 *
 * @author FES
 */
public class HRView extends javax.swing.JFrame {

   

    /**
     * Creates new form NewJFrame
     */
    public HRView() {
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

        jPanelMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jobsframe = new javax.swing.JMenuItem();
        regionMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        deptMenuItem = new javax.swing.JMenuItem();
        locationMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jPanelMain.setLayout(new javax.swing.OverlayLayout(jPanelMain));

        jMenu1.setText("CRUD");

        jMenuItem1.setText("Employees");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jobsframe.setText("Jobs");
        jobsframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsframeActionPerformed(evt);
            }
        });
        jMenu1.add(jobsframe);

        regionMenuItem.setText("Regions");
        regionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(regionMenuItem);

        jMenuItem2.setText("Countries");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        deptMenuItem.setText("Department");
        deptMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(deptMenuItem);

        locationMenu.setText("Location");
        locationMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationMenuActionPerformed(evt);
            }
        });
        jMenu1.add(locationMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        EmployeeView ev = new EmployeeView();
        jPanelMain.add(ev);
        ev.setVisible(true);
//        jIFEmployee.setBounds(5, 5, 200, 300);
        ev.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        ev.revalidate();
//        jPanel1.add(jInternalFrame1, javax.swing.JLayeredPane.DEFAULT_LAYER);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jobsframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsframeActionPerformed
       JobView n = new JobView();
       jPanelMain.add(n);
       n.setVisible(true);
       
    }//GEN-LAST:event_jobsframeActionPerformed


    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String t_search = tf_search.getText();
//        DefaultTableModel myTable = new DefaultTableModel();
//        jTable1.setModel(myTable);
//        myTable.addColumn("Job Id");
//        myTable.addColumn("Job Title");
//        myTable.addColumn("Minimal Salary");
//        myTable.addColumn("Maximal Salary");
        if (t_search != "" && search.getSelectedItem() == "Search By Id") {
//            for (Job job : jc.getById(t_search)) {
//                myTable.addRow(new Object[]{
//                    job.getId(),
//                    job.getName(),
//                    job.getMin_salary(),
//                    job.getMax_salary()
//                });
//            }
//            tableData(jc.getById(t_search));
//        } else if (t_search != "" && search.getSelectedItem() == "Search") {
//            for (Job job : jc.searchBy(t_search)) {
//                myTable.addRow(new Object[]{
//                    job.getId(),
//                    job.getName(),
//                    job.getMin_salary(),
//                    job.getMax_salary()
//                });
//            }
//            tableData(jc.searchBy(t_search));
//        } else {
//            tableData(jc.getAll());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void tf_minsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_minsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_minsalActionPerformed

    private void tf_maxsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_maxsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_maxsalActionPerformed

    private void bt_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_insertActionPerformed
        // TODO add your handling code here:

//        String id = tf_id.getText();
//        String title = tf_title.getText();
//        String minsal = tf_minsal.getText();
//        String maxsal = tf_maxsal.getText();
//        if (konfirmasi()) {
//            if (isEmpty()) {
//                JOptionPane.showMessageDialog(null, jc.insert(tf_id.getText(), tf_title.getText(), tf_minsal.getText(), tf_maxsal.getText()));
//            } else {
//                try {
//                    int reply = JOptionPane.showConfirmDialog(null,
//                            "Anda yakin akan melakukan perubahan data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
//                    );
//                    if (reply == JOptionPane.YES_OPTION) {
//                        JOptionPane.showMessageDialog(null, jc.update(tf_id.getText(), tf_title.getText(), tf_minsal.getText(), tf_maxsal.getText()));
//                        clean();
//                        tableData(jc.getAll());
//                    }
//                } catch (Exception e) {
//                   e.printStackTrace();//dispose();
//                }
//            }
//            clean();
//            tableData(jc.getAll());
//        }
    }//GEN-LAST:event_bt_insertActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
//        String id = tf_id.getText();
//        String title = tf_title.getText();
//        String minsal = tf_minsal.getText();
//        String maxsal = tf_maxsal.getText();

//        if (konfirmasi()) {
//            try {
//                int reply = JOptionPane.showConfirmDialog(null,
//                        "Anda yakin akan melakukan perubahan data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
//                );
//                if (reply == JOptionPane.YES_OPTION) {
//                    JOptionPane.showMessageDialog(null, jc.update(tf_id.getText(), tf_title.getText(), tf_minsal.getText(), tf_maxsal.getText()));
//                    clean();
//                    tableData(jc.getAll());
//                }
//            } catch (Exception e) {
//                dispose();
//            }
//        }

    }//GEN-LAST:event_bt_updateActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
//        String id = tf_id.getText();
//        if (id.equals("")) {
//            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
//        } else {
//            try {
//                int reply = JOptionPane.showConfirmDialog(null,
//                        "Anda yakin akan menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
//                );
//                if (reply == JOptionPane.YES_OPTION) {
//                    JOptionPane.showMessageDialog(null, jc.delete(id));
//                    clean();
//                }
//            } catch (Exception e) {
//                dispose();
//            }
//        }
//        tableData(jc.getAll());
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
//        tf_id.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
//        tf_title.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
//        tf_minsal.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
//        tf_maxsal.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
//
//        tf_id.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void tf_minsalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_minsalKeyTyped
        // TODO add your handling code here:
//        filterhuruf(evt);

    }//GEN-LAST:event_tf_minsalKeyTyped

    private void tf_maxsalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_maxsalKeyTyped
        // TODO add your handling code here:
//        filterhuruf(evt);
    }//GEN-LAST:event_tf_maxsalKeyTyped

    private void regionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionMenuItemActionPerformed
        // TODO add your handling code here:
        RegionView rv = new RegionView();
        jPanelMain.add(rv);
        rv.setVisible(true);
    }//GEN-LAST:event_regionMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CountryView cv = new CountryView();
        jPanelMain.add(cv);
        cv.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void locationMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationMenuActionPerformed
        // TODO add your handling code here:
        LocationView lv = new LocationView();
        jPanelMain.add(lv);
        lv.setVisible(true);
    }//GEN-LAST:event_locationMenuActionPerformed

    private void deptMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptMenuItemActionPerformed
       DepartmentView3 dv=new DepartmentView3();
       jPanelMain.add(dv);
       dv.setVisible(true);
    }//GEN-LAST:event_deptMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
=======
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_insert;
    private javax.swing.JButton bt_update;
    private javax.swing.JMenuItem deptMenuItem;
    private javax.swing.JButton jBEmployeeDelete;
    private javax.swing.JButton jBEmployeeGetAll;
    private javax.swing.JButton jBEmployeeInsert;
    private javax.swing.JButton jBEmployeeSearch;
    private javax.swing.JButton jBEmployeeUpdate;
    private javax.swing.JCheckBox jCBEmployeeisGetById;
    private javax.swing.JInternalFrame jIFEmployee;
    private javax.swing.JInternalFrame jIFJob;
    private javax.swing.JLabel jLEmployeeCommissionPct;
    private javax.swing.JLabel jLEmployeeDepartmentId;
    private javax.swing.JLabel jLEmployeeEmail;
    private javax.swing.JLabel jLEmployeeEmployeeId;
    private javax.swing.JLabel jLEmployeeFirstName;
    private javax.swing.JLabel jLEmployeeHireDate;
    private javax.swing.JLabel jLEmployeeJobId;
    private javax.swing.JLabel jLEmployeeLastName;
    private javax.swing.JLabel jLEmployeeManagerId;
    private javax.swing.JLabel jLEmployeePhoneNumber;
    private javax.swing.JLabel jLEmployeeSalary;
    private javax.swing.JLabel jLEmployeeSearch;
    private javax.swing.JLabel jLEmployeeTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPEmployeeMain;
    private javax.swing.JPanel jPEmployeeMainCenter;
    private javax.swing.JPanel jPEmployeeMainCenterContent1;
    private javax.swing.JPanel jPEmployeeMainCenterContent2;
    private javax.swing.JPanel jPEmployeeMainCenterContent3;
    private javax.swing.JPanel jPEmployeeMainNorth;
    private javax.swing.JPanel jPEmployeeMainSouth;
    private javax.swing.JPanel jPEmployeeMainWest;
>>>>>>> ea129e10be4bfd331d40b201dc6027ce55874c7e
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JMenuItem jobsframe;
<<<<<<< HEAD
=======
    private javax.swing.JMenuItem locationMenu;
    private javax.swing.JMenuItem regionMenuItem;
    private javax.swing.JComboBox<String> search;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_maxsal;
    private javax.swing.JTextField tf_minsal;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_title;
>>>>>>> ea129e10be4bfd331d40b201dc6027ce55874c7e
    // End of variables declaration//GEN-END:variables
}
