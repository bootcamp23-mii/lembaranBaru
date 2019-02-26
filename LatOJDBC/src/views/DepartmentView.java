/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DepartmentController;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tools.DBConnection;
/**
 *
 * @author milhamafemi
 */
public class DepartmentView extends javax.swing.JPanel {
    DefaultTableModel myTable = new DefaultTableModel();
    DBConnection connection = new DBConnection();

    DepartmentController dc = new DepartmentController(connection.getConnection());

    /**
     * Creates new form DepartmentView3
     */
    public DepartmentView() {
        initComponents();
        tableData(dc.getAll());
    }
    
    private boolean konfirmasi() {
        if (jTextDeptName.equals("") || jTextDeptId.equals("") || jTextDeptManagerId.equals("") || jTextLocId.equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, data tidak boleh kosong");
            return false;
        }
        return true;
    }

    private boolean isEmpty() {
        if (dc.getById(jTextDeptId.getText()).isEmpty()) {
            return true;
        }
        return false;
    }

    private void tableData(List<models.Department> dept) {
        Object[] columnNames = {"Nomor", "Department Id", "Department Name", "Manager Id", "Location Id"};
        Object[][] data = new Object[dept.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = dept.get(i).getId();
            data[i][2] = dept.get(i).getName();
            data[i][3] = dept.get(i).getManager_id();
            data[i][4] = dept.get(i).getLocation_id();
        }
        myTable = new DefaultTableModel(data, columnNames);
        jTable1.setModel(myTable);
    }

    private void clean() {
        jTextDeptId.setEnabled(true);
        jTextDeptId.setText("");
        jTextDeptName.setText("");
        jTextDeptManagerId.setText("");
        jTextLocId.setText("");
    }

    private void filterHuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Pada kolom ID Department Hanya bisa memasukkan angka");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SearchData = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextDeptId = new javax.swing.JTextField();
        jTextDeptName = new javax.swing.JTextField();
        jTextDeptManagerId = new javax.swing.JTextField();
        jTextLocId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboSearch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("Department Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Department");

        jLabel3.setText("Manager Id");

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Location Id");

        jTextDeptManagerId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDeptManagerIdKeyTyped(evt);
            }
        });

        jTextLocId.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextLocIdInputMethodTextChanged(evt);
            }
        });
        jTextLocId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLocIdKeyTyped(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search", "Search By Id", "Show All" }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Deprartment id");

        jLabel5.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextDeptManagerId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDeptName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDeptId)
                            .addComponent(jTextLocId))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(comboSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchData)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextDeptId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextDeptManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextLocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jTextDeptId.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        } else {
            try {
                int reply = JOptionPane.showConfirmDialog(null,
                    "Anda yakin akan menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                );
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, dc.delete(id));
                    clean();
                }
            } catch (Exception e) {
                dispose();
            }
        }
        tableData(dc.getAll());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextDeptManagerIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDeptManagerIdKeyTyped
        // TODO add your handling code here:
        filterHuruf(evt);
    }//GEN-LAST:event_jTextDeptManagerIdKeyTyped

    private void jTextLocIdInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextLocIdInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLocIdInputMethodTextChanged

    private void jTextLocIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLocIdKeyTyped
        // TODO add your handling code here:
        filterHuruf(evt);
    }//GEN-LAST:event_jTextLocIdKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, dc.insert(jTextDeptId.getText(), jTextDeptName.getText(),
                jTextDeptManagerId.getText(), jTextLocId.getText()));
        } else {
            try {
                int reply = JOptionPane.showConfirmDialog(null, "Anda yakin untuk melakukan perubahan data?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, dc.update(jTextDeptId.getText(), jTextDeptName.getText(),
                        jTextDeptManagerId.getText(), jTextLocId.getText()));
                clean();
                tableData(dc.getAll());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        clean();
        tableData(dc.getAll());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextDeptId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jTextDeptName.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jTextDeptManagerId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jTextLocId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        
        jTextDeptId.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
        String cari = SearchData.getText();
        if (cari != "" && comboSearch.getSelectedItem() == "Search By Id") {
            tableData(dc.getById(cari));
        } else if (cari != "" && comboSearch.getSelectedItem() == "Search") {
            tableData(dc.seachBy(cari));
        } else {
            tableData(dc.getAll());
        }
    }//GEN-LAST:event_comboSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchData;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDeptId;
    private javax.swing.JTextField jTextDeptManagerId;
    private javax.swing.JTextField jTextDeptName;
    private javax.swing.JTextField jTextLocId;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
