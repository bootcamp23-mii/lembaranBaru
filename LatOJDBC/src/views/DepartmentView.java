/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DepartmentController;
import controllers.EmployeeController;
import controllers.LocationController;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Department;
import models.Employee;
import tools.DBConnection;

/**
 *
 * @author milhamafemi
 */
public class DepartmentView extends javax.swing.JPanel {

    DefaultTableModel myTable = new DefaultTableModel();
    DBConnection connection = new DBConnection();
    List<models.Employee> employeeList = new ArrayList<>();
    List<models.Location> locationList = new ArrayList<>();

    DepartmentController dc = new DepartmentController(connection.getConnection());
    EmployeeController ec = new EmployeeController(connection.getConnection());
    LocationController lc = new LocationController(connection.getConnection());

    /**
     * Creates new form DepartmentView3
     */
    public DepartmentView() {
        initComponents();
        tableData(dc.getAll());
        setComboBox();
        
    }

    private boolean konfirmasi() {
        if (tfDeptName.equals("") || tfDeptId.equals("") || cbManagerId.getSelectedIndex() == 0 || cbLocId.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Maaf, data tidak boleh kosong");
            return false;
        }
        return true;
    }

    private boolean isEmpty() {
         if (dc.getById(tfDeptId.getText()).equals("")) {
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
        tbDepartment.setModel(myTable);
    }

    private void clean() {
        tfDeptId.setEnabled(true);
        tfDeptId.setText("");
        tfDeptName.setText("");
        tfSearch.setText("");
        cbManagerId.setSelectedIndex(0);
        cbLocId.setSelectedIndex(0);
    }

    private void filterHuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Pada kolom ID Department Hanya bisa memasukkan angka");
        }
    }

    private void setComboBox() {
        for (models.Employee employee : ec.getAllData()) {
            cbManagerId.addItem(employee.getEmployeeId() + " - " + employee.getLast_name());
        }
        for (models.Location location : lc.getAll("")) {
            cbLocId.addItem(location.getId() + " - " + location.getAddress());
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

        lblDeptName = new javax.swing.JLabel();
        lblDept = new javax.swing.JLabel();
        lblManagerId = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btDelete = new javax.swing.JButton();
        lblLocationId = new javax.swing.JLabel();
        tfDeptId = new javax.swing.JTextField();
        tfDeptName = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDepartment = new javax.swing.JTable();
        comboSearch = new javax.swing.JComboBox<>();
        lblDeptId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        cbManagerId = new javax.swing.JComboBox<>();
        cbLocId = new javax.swing.JComboBox<>();

        lblDeptName.setText("Department Name");

        lblDept.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDept.setText("Department");

        lblManagerId.setText("Manager Id");

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        lblLocationId.setText("Location Id");

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        tbDepartment.setModel(new javax.swing.table.DefaultTableModel(
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
        tbDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDepartmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDepartment);

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search", "Search By Id", "Show All" }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        lblDeptId.setText("Deprartment id");

        jLabel5.setText("Search");

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btClose.setText("X");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        cbManagerId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbLocId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeptId)
                            .addComponent(lblDeptName)
                            .addComponent(lblManagerId)
                            .addComponent(lblLocationId))
                        .addGap(29, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addComponent(tfDeptName)
                            .addComponent(tfDeptId)
                            .addComponent(cbManagerId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbLocId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDept)
                                .addGap(215, 215, 215)
                                .addComponent(btClose)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClose)
                    .addComponent(lblDept))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeptId)
                    .addComponent(tfDeptId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeptName)
                    .addComponent(tfDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblManagerId)
                        .addComponent(cbManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbLocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocationId))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btDelete))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        String id = tfDeptId.getText();
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
                e.printStackTrace();
            }
        }
        tableData(dc.getAll());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, dc.insert(tfDeptId.getText(), tfDeptName.getText(),
                    cbManagerId.getSelectedItem().toString().split(" - ")[0], cbLocId.getSelectedItem().toString().split(" - ")[0]));
        } else {
            try {
                int reply = JOptionPane.showConfirmDialog(null, "Anda yakin untuk melakukan perubahan data?",
                        "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, dc.update(tfDeptId.getText(), tfDeptName.getText(),
                            cbManagerId.getSelectedItem().toString().split(" - ")[0], cbLocId.getSelectedItem().toString().split(" - ")[0]));

                    clean();
                    tableData(dc.getAll());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        clean();
        tableData(dc.getAll());
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDepartmentMouseClicked
        // TODO add your handling code here:
        tfDeptId.setText(tbDepartment.getValueAt(tbDepartment.getSelectedRow(), 1).toString());
        tfDeptName.setText(tbDepartment.getValueAt(tbDepartment.getSelectedRow(), 2).toString());
//        jTextDeptManagerId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        for (int i = 0; i < cbManagerId.getItemCount(); i++) {
            if (cbManagerId.getItemAt(i).split(" - ")[0].equals(tbDepartment.getValueAt(tbDepartment.getSelectedRow(), 3).toString())) {
                cbManagerId.setSelectedIndex(i);
            }
        }
//        jTextLocId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        for (int i = 0; i < cbLocId.getItemCount(); i++) {
            if (cbLocId.getItemAt(i).split(" - ")[0].equals(tbDepartment.getValueAt(tbDepartment.getSelectedRow(), 4).toString())) {
                cbLocId.setSelectedIndex(i);
            }
        }

        tfDeptId.setEnabled(false);
    }//GEN-LAST:event_tbDepartmentMouseClicked

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
        String cari = tfSearch.getText();
        if (cari != "" && comboSearch.getSelectedItem() == "Search By Id") {
            //tableData(dc.getById(cari));
            Department tampungan = dc.getById(cari);
            tfDeptId.setText(tampungan.getId() + "");
            tfDeptName.setText(tampungan.getName());
            cbManagerId.setSelectedItem(tampungan.getManager_id());
            
            cbLocId.setSelectedItem(tampungan.getLocation_id());
        } else if (cari != "" && comboSearch.getSelectedItem() == "Search") {
            tableData(dc.seachBy(cari));
        } else {
            tableData(dc.getAll());
        }
    }//GEN-LAST:event_comboSearchActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        clean();
    }//GEN-LAST:event_btClearActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbLocId;
    private javax.swing.JComboBox<String> cbManagerId;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDept;
    private javax.swing.JLabel lblDeptId;
    private javax.swing.JLabel lblDeptName;
    private javax.swing.JLabel lblLocationId;
    private javax.swing.JLabel lblManagerId;
    private javax.swing.JTable tbDepartment;
    private javax.swing.JTextField tfDeptId;
    private javax.swing.JTextField tfDeptName;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

}
