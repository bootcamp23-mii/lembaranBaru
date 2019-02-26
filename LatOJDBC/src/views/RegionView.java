/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.RegionController;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Region;
import tools.DBConnection;

/**
 *
 * @author AdhityaWP
 */
public class RegionView extends javax.swing.JInternalFrame {

    List<Region> listdata = new ArrayList<Region>();
    int x = 0;
    DefaultTableModel model = new DefaultTableModel();;
    DBConnection connection = new DBConnection();
    RegionController rc = new RegionController(connection.getConnection());

    /**
     * Creates new form Region
     */
    public RegionView() {
        initComponents();
        TampilData(rc.getAllData());
    }


    private void TampilData(List<Region> listdata) {
        Object[] columnNames ={"No","Id","Nama"};
        Object[][] data = new Object[listdata.size()][columnNames.length];
//        for (Region region : rc.getById("",false)) {
//            Object[] data = new Object[2];
//            data [0]= region.getId();
//            data [1]= region.getId();
//            model.addColumn(data);
//            System.out.println(data);
//        }
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = listdata.get(i).getId();
            data[i][2] = listdata.get(i).getName();
        }
        model = new DefaultTableModel(data,columnNames);
        jTable2.setModel(model);
    }
    
    private boolean konfirmasi() {
        if (idTextField.getText().equals("") || namaTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            return false;
        }
        return true;
    }

    
    private boolean isEmpty() {
        if (rc.getById(idTextField.getText()).isEmpty()) {
            return true;
        }
        return false;
    }

    void filterhuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null,"Hanya Bisa Memasukan Karakter Angka");
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

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        namaLabel = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        bClear = new javax.swing.JButton();
        bInsert = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        bSearch = new javax.swing.JButton();

        topPanel.setLayout(new java.awt.GridLayout(2, 2, 0, 5));

        idLabel.setText("Id");
        topPanel.add(idLabel);

        idTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTextFieldKeyTyped(evt);
            }
        });
        topPanel.add(idTextField);

        namaLabel.setText("Nama");
        topPanel.add(namaLabel);
        topPanel.add(namaTextField);

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bInsert.setText("Save");
        bInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.setEnabled(false);
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bClear)
                .addGap(18, 18, 18)
                .addComponent(bInsert)
                .addGap(28, 28, 28)
                .addComponent(bDelete)
                .addGap(33, 33, 33))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInsert)
                    .addComponent(bClear)
                    .addComponent(bDelete)))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        searchPanel.setLayout(new javax.swing.BoxLayout(searchPanel, javax.swing.BoxLayout.LINE_AXIS));

        searchLabel.setText("Search");
        searchPanel.add(searchLabel);
        searchPanel.add(searchTextField);

        jCheckBox1.setText("by Id");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        searchPanel.add(jCheckBox1);

        bSearch.setText("search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        searchPanel.add(bSearch);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(153, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        idTextField.setText("");
        namaTextField.setText("");
        TampilData(rc.getAllData());
    }//GEN-LAST:event_bClearActionPerformed

    private void bInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertActionPerformed
        // TODO add your handling code here:
        if (konfirmasi()) {
            if (isEmpty()) {
                JOptionPane.showMessageDialog(null, rc.insert(idTextField.getText(), namaTextField.getText()));
            } else {
                try {
                    int reply = JOptionPane.showConfirmDialog(null,
                            "Anda yakin akan melakukan perubahan data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (reply == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, rc.update(idTextField.getText(), namaTextField.getText()));
                        
                        TampilData(rc.getAllData());
                    }
                } catch (Exception e) {
                   e.printStackTrace();//dispose();
                }
            }
            TampilData(rc.getAllData());
        }
    }//GEN-LAST:event_bInsertActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
        String idhapus = jTable2.getValueAt(row, 1).toString();
        int confirm = JOptionPane.showConfirmDialog(null, "Anda Yakin?", "", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            rc.delete(idhapus);
            TampilData(rc.getAllData());
        }

    }//GEN-LAST:event_bDeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if (jTable2.getSelectedColumnCount() == 1) {
            bDelete.setEnabled(true);
            int row = jTable2.getSelectedRow();
            idTextField.setText(jTable2.getValueAt(row, 1).toString());
            namaTextField.setText(jTable2.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
        String key = searchTextField.getText().toString().trim();
        boolean cb = jCheckBox1.isSelected();
        if (!cb) {
            
            TampilData(rc.searchBy(key));
        } else {
            
            TampilData(rc.getById(key));
        }
    }//GEN-LAST:event_bSearchActionPerformed

    private void idTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTextFieldKeyTyped
        // TODO add your handling code here:
        filterhuruf(evt);
    }//GEN-LAST:event_idTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bInsert;
    private javax.swing.JButton bSearch;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
