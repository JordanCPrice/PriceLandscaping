
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan Price
 */
public class LandscapeGUI_Info extends javax.swing.JFrame {

    //Creates new form LandscapeGUI
    public LandscapeGUI_Info() {
        initComponents();
        this.setLocationRelativeTo(null); // centers form
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblSummary = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblWidth = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        txtLength = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        scrSummary = new javax.swing.JScrollPane();
        txaSummary = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Price Landscaping");

        lblCompanyName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCompanyName.setText("Price Landscaping");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        lblInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInfo.setText("Please enter your information:");

        lblInfo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblInfo2.setText("Enter the length and width of your yard:");

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.setNextFocusableComponent(btnSubmit);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtName.setFocusCycleRoot(true);
        txtName.setNextFocusableComponent(txtAddress);

        txtAddress.setNextFocusableComponent(txtLength);

        lblSummary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSummary.setText("Order Summary:");

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSubmit.setText("Submit Order");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblWidth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblWidth.setText("Width (ft):");

        lblLength.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLength.setText("Length (ft):");

        txtLength.setNextFocusableComponent(txtWidth);

        txtWidth.setNextFocusableComponent(btnCalculate);

        txaSummary.setColumns(18);
        txaSummary.setRows(5);
        scrSummary.setViewportView(txaSummary);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSummary)
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblAddress)
                                                    .addComponent(lblName))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtAddress)
                                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblInfo2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblLength)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblWidth)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(scrSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(lblCompanyName)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblCompanyName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSummary))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(lblInfo2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLength)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblWidth)
                                .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(scrSummary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSubmit))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // validate inputs
        if (validateInputs() == false) {
            return;
        }
            //create customer object and show information
            Customer cust = createCustomer();
            txaSummary.setText(cust.getDetails());        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        submitOrder();
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandscapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandscapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCompanyName;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JScrollPane scrSummary;
    private javax.swing.JTextArea txaSummary;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables

    private Customer createCustomer() {
        String name = txtName.getText();
        String address = txtAddress.getText();
        double width = Double.parseDouble(txtWidth.getText());
        double length = Double.parseDouble(txtLength.getText());
        String yardType = "Grass";                // FIX THE TYPE
        double totalCost = width * length * 5.0;  // FIX THE PRICE

        Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
        return cust;
    }

    private boolean validateInputs() {
        String sName = txtName.getText();
        String sAddress = txtAddress.getText();
        String sWidth = txtWidth.getText(); // set as string for validation
        String sLength = txtLength.getText();  // set as string for validation

        if (sName.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Name", "Name Error", JOptionPane.ERROR_MESSAGE);
            txtName.requestFocusInWindow();
            return false;
        }

        if (sAddress.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Address", "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sAddress.length() <= 5) {
            JOptionPane.showMessageDialog(this, "Address isn't long enough.", "Address Error", JOptionPane.ERROR_MESSAGE);
            txtAddress.requestFocusInWindow();
            return false;
        }

        if (sWidth.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Width", "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.requestFocusInWindow();
            return false;
        }

        try {
            Double.parseDouble(sWidth);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Width must be a number", "Width Error", JOptionPane.ERROR_MESSAGE);
            txtWidth.setText("");
            txtWidth.requestFocusInWindow();
            return false;
        }

        if (Double.parseDouble(sWidth) <= 0) {
            JOptionPane.showMessageDialog(this, "Width must be greater than 0", "Width Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        }

        if (sLength.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter a Length", "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.requestFocusInWindow();
            return false;
        }

        try {
            Double.parseDouble(sLength);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Length must be a number", "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;

        }

        if (Double.parseDouble(sLength) <= 0) {
            JOptionPane.showMessageDialog(this, "Length must be must be greater than 0", "Length Error", JOptionPane.ERROR_MESSAGE);
            txtLength.setText("");
            txtLength.requestFocusInWindow();
            return false;
        } else {
            // no errors
            return true;
        }
    }

    private void submitOrder() {
        JOptionPane.showMessageDialog(this, "Method is not complete.");
    }
}