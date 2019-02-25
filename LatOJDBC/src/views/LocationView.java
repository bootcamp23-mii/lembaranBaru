/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import controllers.LocationController;
import daos.LocationDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Location;
import tools.DBConnection;

/**
 *
 * @author Pandu
 */
public class LocationView extends javax.swing.JPanel {

    
    List<Location> listdata         = new ArrayList<Location>();
    DBConnection connection         = new DBConnection();
    private DefaultTableModel modelLocation = new DefaultTableModel();
    int x = 0;
    LocationDAO ldao        = new LocationDAO(connection.getConnection());
    LocationController lc   = new LocationController(connection.getConnection());

    /**
     * Creates new form LocationView
     */
    public LocationView() {
        initComponents();
        tableData(lc.getAll(""));
    }
    
    private boolean confirm() {
        if (fieldId.getText().equals("") 
                || fieldAddress.getText().equals("") 
                || fieldPostal.getText().equals("") 
                || fieldCity.getText().equals("") 
                || fieldProvince.getText().equals("") 
                || fieldCountry.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data cannot be empty !");
            return false;
        }
        return true;
    }
    
    private boolean isEmpty() {
        if (lc.getAll(fieldId.getText()).isEmpty()) {
            return true;
        }
        return false;
    }
    
    private void tableData(List<models.Location> locs) {
        
        Object[] columnNames = {"NO", "ID", "Street Address", "Postal Code", "City", "State province", "Country ID"};
        Object[][] data = new Object[locs.size()][columnNames.length];
        
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = locs.get(i).getId();
            data[i][2] = locs.get(i).getAddress();
            data[i][3] = locs.get(i).getPostal();
            data[i][4] = locs.get(i).getCity();
            data[i][5] = locs.get(i).getProvince();
            data[i][6] = locs.get(i).getCountry();
        }
        modelLocation = new DefaultTableModel(data, columnNames);
        contentTable.setModel(modelLocation);
    }
    
    private void clean() {
        fieldId.setEnabled(true);
        fieldAddress.setText("");
        fieldPostal.setText("");
        fieldCity.setText("");
        fieldProvince.setText("");
        fieldCountry.setText("");
    }

    void filterhuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Pada Kolom Jumlah Hanya Bisa Memasukan Karakter Angka");
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        idLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        postalLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        provinceLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        fieldId = new javax.swing.JTextField();
        fieldPostal = new javax.swing.JTextField();
        fieldAddress = new javax.swing.JTextField();
        fieldProvince = new javax.swing.JTextField();
        fieldCountry = new javax.swing.JTextField();
        fieldCity = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        resetButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jInternalFrame1.setVisible(true);

        idLabel.setText("Location ID");

        addressLabel.setText("Street Address");

        postalLabel.setText("Postal Code");

        cityLabel.setText("City");

        provinceLabel.setText("State Province");

        countryLabel.setText("Country");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("SEARCH");

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "ID", "Address", "Postal", "City", "Province", "Country"
            }
        ));
        contentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contentTable);

        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(idLabel)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(postalLabel)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityLabel)
                                            .addComponent(countryLabel)
                                            .addComponent(deleteButton))
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(provinceLabel)
                                        .addGap(18, 18, 18)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(searchButton))))
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idLabel))
                                .addGap(28, 28, 28)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fieldPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postalLabel)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityLabel))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provinceLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (confirm()) {
            if (isEmpty()) {
                JOptionPane.showMessageDialog(null, lc.insert(
                        fieldId.getText(), fieldAddress.getText(), 
                        fieldPostal.getText(), fieldCity.getText(),
                        fieldProvince.getText(), fieldCountry.getText()));
            } else {
                try {
                    int reply = JOptionPane.showConfirmDialog(null,
                            "Confirm your Action ?", 
                            "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (reply == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, lc.update(
                            fieldId.getText(), fieldAddress.getText(), 
                            fieldPostal.getText(), fieldCity.getText(),
                            fieldProvince.getText(), fieldCountry.getText()));
                        clean();
                        tableData(lc.getAll(""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            clean();
            tableData(lc.getAll(""));
        }
        
        String id           = fieldId.getText();
        String address      = fieldAddress.getText();
        String postalCode   = fieldPostal.getText();
        String city         = fieldCity.getText();
        String state        = fieldProvince.getText();
        String countryId    = fieldCountry.getText();
        lc.insert(id, address, postalCode, city, state, countryId);
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        // TODO add your handling code here:
        fieldId.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 1).toString());
        fieldAddress.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 2).toString());
        fieldPostal.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 3).toString());
        fieldCity.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 4).toString());
        fieldProvince.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 5).toString());
        fieldCountry.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 6).toString());

        fieldId.setEnabled(false);
    }//GEN-LAST:event_contentTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        clean();
        fieldId.setEnabled(true);
        clean();
    }//GEN-LAST:event_resetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTable contentTable;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldCity;
    private javax.swing.JTextField fieldCountry;
    private javax.swing.JTextField fieldId;
    private javax.swing.JTextField fieldPostal;
    private javax.swing.JTextField fieldProvince;
    private javax.swing.JLabel idLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel postalLabel;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
