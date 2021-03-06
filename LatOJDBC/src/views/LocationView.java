/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

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

    List<Location> listdata = new ArrayList<Location>();
    DBConnection connection = new DBConnection();
    private DefaultTableModel modelLocation = new DefaultTableModel();
    int x = 0;
    LocationDAO ldao = new LocationDAO(connection.getConnection());
    LocationController lc = new LocationController(connection.getConnection());

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
                || fieldProvince.getText().equals("")) {
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
//        fieldCountry.setText("");
        comboCountry.setSelectedIndex(1);
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
        fieldCity = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        resetButton = new javax.swing.JButton();
        comboCountry = new javax.swing.JComboBox<>();
        searchCombo = new javax.swing.JComboBox<>();

        jInternalFrame1.setClosable(true);
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
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

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

        comboCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AR", "AU", "BE", "BR", "CA", "CH", "CN", "DE", "DK", "EG", "FR", "IL", "IN", "IT", "JP", "KW", "ML", "MX", "NG", "NL", "SG", "UK", "US", "ZM", "ZW" }));

        searchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEARCH", "BY ID", " " }));

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
                                .addGap(64, 64, 64)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityLabel)
                                            .addComponent(countryLabel)
                                            .addComponent(deleteButton))
                                        .addGap(24, 24, 24))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(searchCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(provinceLabel))
                                        .addGap(18, 18, 18)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldCity, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(fieldProvince, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(comboCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                        .addComponent(postalLabel))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cityLabel))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fieldProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(provinceLabel))))
                                .addGap(28, 28, 28)
                                .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(countryLabel)))
                .addGap(38, 38, 38)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(searchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(deleteButton)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        fieldProvince.getText(), comboCountry.getSelectedItem().toString()));
//                        fieldProvince.getText(), fieldCountry.getText()));
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
                                fieldProvince.getText(), comboCountry.getSelectedItem().toString()));
//                            fieldProvince.getText(), fieldCountry.getText()));
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

        String id = fieldId.getText();
        String address = fieldAddress.getText();
        String postalCode = fieldPostal.getText();
        String city = fieldCity.getText();
        String state = fieldProvince.getText();
        String countryId = comboCountry.getSelectedItem().toString();
        lc.insert(id, address, postalCode, city, state, countryId);

    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String id = fieldId.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        } else {
            try {
                int reply = JOptionPane.showConfirmDialog(null,
                        "Are You Sure ?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                );
                if (reply == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, lc.delete(id));
                    clean();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tableData(lc.getAll(""));

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void contentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contentTableMouseClicked
        // TODO add your handling code here:
        fieldId.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 1).toString());
        fieldAddress.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 2).toString());
        fieldPostal.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 3).toString());
        fieldCity.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 4).toString());
        fieldProvince.setText(String.valueOf(contentTable.getValueAt(contentTable.getSelectedRow(), 5)));
//        fieldCountry.setText(contentTable.getValueAt(contentTable.getSelectedRow(), 6).toString());
        comboCountry.setSelectedItem(contentTable.getValueAt(contentTable.getSelectedRow(), 6).toString());
        fieldId.setEnabled(false);
    }//GEN-LAST:event_contentTableMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        clean();
        fieldId.setEnabled(true);
        clean();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
//        String searchString = fieldId.getText();
//        String keyword = "";
//        if (searchString != "") {
//            tableData(lc.getById(""));
//        } else if (searchString != "") {
//            keyword = searchString;
//            tableData(lc.getAll(searchString));
//        } else if(fieldAddress.getText() != ""){
//            keyword = fieldAddress.getText();
//            tableData(lc.getAll(keyword));
//        } else if(fieldPostal.getText() != ""){
//            keyword = fieldPostal.getText();
//            tableData(lc.getAll(keyword));
//        } else if(fieldCity.getText() != ""){
//            keyword = fieldCity.getText();
//            tableData(lc.getAll(keyword));
//        } else if(fieldProvince.getText() != ""){
//            keyword = fieldProvince.getText();
//            tableData(lc.getAll(keyword));
//        } else {
//            tableData(lc.getAll(""));
//        }

        String id = fieldId.getText();
        if (id != "" && searchCombo.getSelectedItem().equals("BY ID")) {
            tableData(lc.getById(id));
        } else if (id != "" && searchCombo.getSelectedItem().equals("SEARCH")) {
            tableData(lc.getAll(id));
        } else {
            tableData(lc.getAll(""));
        }
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JComboBox<String> comboCountry;
    private javax.swing.JTable contentTable;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextField fieldCity;
    private javax.swing.JTextField fieldId;
    private javax.swing.JTextField fieldPostal;
    private javax.swing.JTextField fieldProvince;
    private javax.swing.JLabel idLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel postalLabel;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchCombo;
    // End of variables declaration//GEN-END:variables
}
