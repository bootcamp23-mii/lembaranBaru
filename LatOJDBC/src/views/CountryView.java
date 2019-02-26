/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CountryController;
import controllers.RegionController;
import daos.RegionDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
//import models.Country;
import javax.swing.table.DefaultTableModel;
import models.Country;
import models.Region;
import tools.DBConnection;

/**
 *
 * @author gerydanu
 */
public class CountryView extends javax.swing.JInternalFrame {

    DBConnection connection = new DBConnection();
    CountryController cc = new CountryController(connection.getConnection());
    RegionController rc = new RegionController(connection.getConnection());
    
    
    DefaultTableModel tableCountry;
    /**
     * Creates new form Country
     */
    public CountryView() {
        initComponents();
        tampilTabelCountries();
        tampilRegion();
    }
    
    void tampilRegion() {
        for (Region region : rc.getAllData()) {
            jComboRegionId.addItem(region.getId()+" - "+region.getName());
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

        jPanelAtas = new javax.swing.JPanel();
        jLabelCountries = new javax.swing.JLabel();
        jPanelKiri = new javax.swing.JPanel();
        jLabelCountryId = new javax.swing.JLabel();
        jLabelCountryName = new javax.swing.JLabel();
        jLabelRegionId = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelSearchDelete = new javax.swing.JLabel();
        jPanelKanan = new javax.swing.JPanel();
        jTextCountryId = new javax.swing.JTextField();
        jTextCountryName = new javax.swing.JTextField();
        jComboRegionId = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextCountrySearch = new javax.swing.JTextField();
        jButtonDeleteId = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jCheckById = new javax.swing.JCheckBox();
        jPanelBawah = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCountries = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setClosable(true);

        jLabelCountries.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCountries.setText("COUNTRIES");
        jPanelAtas.add(jLabelCountries);

        jPanelKiri.setLayout(new java.awt.GridLayout(10, 1, 5, 5));

        jLabelCountryId.setText("COUNTRY_ID");
        jPanelKiri.add(jLabelCountryId);

        jLabelCountryName.setText("COUNTRY_NAME");
        jPanelKiri.add(jLabelCountryName);

        jLabelRegionId.setText("REGION_ID");
        jPanelKiri.add(jLabelRegionId);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelKiri.add(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanelKiri.add(jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanelKiri.add(jPanel4);

        jLabelSearchDelete.setText("Search / Delete");
        jPanelKiri.add(jLabelSearchDelete);

        jPanelKanan.setLayout(new java.awt.GridLayout(10, 1));

        jTextCountryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCountryIdActionPerformed(evt);
            }
        });
        jPanelKanan.add(jTextCountryId);

        jTextCountryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCountryNameActionPerformed(evt);
            }
        });
        jPanelKanan.add(jTextCountryName);

        jComboRegionId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        jComboRegionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRegionIdActionPerformed(evt);
            }
        });
        jPanelKanan.add(jComboRegionId);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelKanan.add(jButton1);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanelKanan.add(jButtonSave);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanelKanan.add(jPanel5);
        jPanelKanan.add(jTextCountrySearch);

        jButtonDeleteId.setText("Delete by ID");
        jButtonDeleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteIdActionPerformed(evt);
            }
        });
        jPanelKanan.add(jButtonDeleteId);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanelKanan.add(jButtonSearch);

        jCheckById.setText("Get by ID");
        jPanelKanan.add(jCheckById);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTableCountries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Country_ID", "Country_Name", "Region_ID"
            }
        ));
        jTableCountries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCountriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCountries);

        javax.swing.GroupLayout jPanelBawahLayout = new javax.swing.GroupLayout(jPanelBawah);
        jPanelBawah.setLayout(jPanelBawahLayout);
        jPanelBawahLayout.setHorizontalGroup(
            jPanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanelBawahLayout.setVerticalGroup(
            jPanelBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBawahLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelKanan, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanelBawah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCountryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCountryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCountryIdActionPerformed

    private void jTextCountryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCountryNameActionPerformed

    }//GEN-LAST:event_jTextCountryNameActionPerformed

    private void jComboRegionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRegionIdActionPerformed
    }//GEN-LAST:event_jComboRegionIdActionPerformed

    private boolean konfirmasi() {
        if (jTextCountryId.getText().equals("") || 
                jTextCountryName.getText().equals("") ||
                jComboRegionId.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            return false;
        }
        return true;
    }
    
    private boolean isEmpty() {
        if (cc.searchData(jTextCountryId.getText(),true).isEmpty()) {
            return true;
        }
        return false;
    }
    
    private void showAllCountryTable(List<Country> countries){
        Object[] columnNames = {"No.", "Country ID", "Country Name", "Region ID"};
        Object[][] data = new Object[countries.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = countries.get(i).getCountry_id();
            data[i][2] = countries.get(i).getCountry_name();
            data[i][3] = countries.get(i).getRegion_id();
        }
        tableCountry = new DefaultTableModel(data, columnNames);
        jTableCountries.setModel(tableCountry);
    }
    
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        //JOptionPane.showMessageDialog(rootPane, cc.insert(jTextCountryId.getText(), jTextCountryName.getText(), jComboRegionId.getActionCommand()));
        if (konfirmasi()){
            if (isEmpty())JOptionPane.showMessageDialog(null, cc.insert(
                    jTextCountryId.getText(), jTextCountryName.getText(), 
                    jComboRegionId.getSelectedItem().toString().split(" - ")[0]));
            else 
            {
                try {
                    int reply = JOptionPane.showConfirmDialog(null,
                            "Anda yakin akan melakukan perubahan data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (reply == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, cc.update(jTextCountryId.getText(), jTextCountryName.getText(), jComboRegionId.getSelectedItem().toString().split(" - ")[0]));
                        showAllCountryTable(cc.getAllData());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            showAllCountryTable(cc.getAllData());
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteIdActionPerformed
        if (jTextCountrySearch.equals("")) JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        else 
        {
            try {
                int reply = JOptionPane.showConfirmDialog(null,
                        "Anda yakin akan menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                );
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, cc.delete(jTextCountrySearch.getText()));
                    jTextCountrySearch.setText("");
                    showAllCountryTable(cc.getAllData());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tampilTabelCountries();
    }//GEN-LAST:event_jButtonDeleteIdActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTableCountriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCountriesMouseClicked
        jTextCountryId.setText(jTableCountries.getValueAt(jTableCountries.getSelectedRow(), 1).toString());
        jTextCountryName.setText(jTableCountries.getValueAt(jTableCountries.getSelectedRow(), 2).toString());
        for (int i = 0; i < jComboRegionId.getItemCount(); i++) {
            if (jComboRegionId.getItemAt(i).split(" - ")[0].equals(jTableCountries.getValueAt(jTableCountries.getSelectedRow(), 3).toString()))
                jComboRegionId.setSelectedIndex(i);
        }

        jTextCountryId.setEnabled(false);
    }//GEN-LAST:event_jTableCountriesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextCountryId.setEnabled(true);
        jTextCountryId.setEditable(true);
        jTextCountryId.setText("");
        jTextCountryName.setText("");
        jComboRegionId.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        showAllCountryTable(cc.searchData(jTextCountrySearch.getText(), jCheckById.isSelected()));
    }//GEN-LAST:event_jButtonSearchActionPerformed
    
    
    private void tampilTabelCountries() {
        DefaultTableModel tabelCountries = (DefaultTableModel) jTableCountries.getModel();
        tabelCountries.setRowCount(0);
        int hitung = 1;
        for (models.Country values : cc.getAllData()) {
            Object[] data = {hitung, values.getCountry_id(), values.getCountry_name(), values.getRegion_id()};
            tabelCountries.addRow(data);
            hitung++;
        }

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDeleteId;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JCheckBox jCheckById;
    private javax.swing.JComboBox<String> jComboRegionId;
    private javax.swing.JLabel jLabelCountries;
    private javax.swing.JLabel jLabelCountryId;
    private javax.swing.JLabel jLabelCountryName;
    private javax.swing.JLabel jLabelRegionId;
    private javax.swing.JLabel jLabelSearchDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAtas;
    private javax.swing.JPanel jPanelBawah;
    private javax.swing.JPanel jPanelKanan;
    private javax.swing.JPanel jPanelKiri;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCountries;
    private javax.swing.JTextField jTextCountryId;
    private javax.swing.JTextField jTextCountryName;
    private javax.swing.JTextField jTextCountrySearch;
    // End of variables declaration//GEN-END:variables
}
