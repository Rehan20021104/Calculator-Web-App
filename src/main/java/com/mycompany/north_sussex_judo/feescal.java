/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.north_sussex_judo;

import javax.swing.JOptionPane;

/**
 *
 * @author RR
 */
public class feescal extends javax.swing.JFrame {

    /**
     * Creates new form feescal
     */
    public feescal() {
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

        jPanel1 = new javax.swing.JPanel();
        lab4 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        lab6 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(null);

        lab4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab4.setText("Traing Plan:");
        jPanel1.add(lab4);
        lab4.setBounds(58, 320, 166, 39);

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        jPanel1.add(txt6);
        txt6.setBounds(580, 360, 297, 36);

        bt1.setBackground(new java.awt.Color(51, 255, 255));
        bt1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt1.setText("Calculate");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel1.add(bt1);
        bt1.setBounds(950, 670, 181, 41);

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Elite" }));
        jPanel1.add(cb1);
        cb1.setBounds(58, 365, 297, 36);

        lab6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab6.setText("Private Coaching Hours:");
        jPanel1.add(lab6);
        lab6.setBounds(580, 320, 205, 39);

        lab5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab5.setText("Number of competitions entered this month:");
        jPanel1.add(lab5);
        lab5.setBounds(58, 501, 381, 39);

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        jPanel1.add(txt5);
        txt5.setBounds(58, 546, 297, 36);

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt1);
        txt1.setBounds(58, 197, 297, 36);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("North Sussex Judo ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 430, 41);

        lab2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab2.setText("Current Weight (kg):");
        jPanel1.add(lab2);
        lab2.setBounds(580, 150, 176, 39);

        lab1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab1.setText("Athlete Name:");
        jPanel1.add(lab1);
        lab1.setBounds(58, 152, 166, 39);

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        jPanel1.add(txt2);
        txt2.setBounds(580, 200, 297, 36);

        jLabel7.setText("==================================================================================================================================================================================");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 630, 1424, 16);

        jLabel8.setText("==================================================================================================================================================================================");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 70, 1424, 16);

        jLabel9.setText("==================================================================================================================================================================================");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 70, 1424, 16);

        bt2.setBackground(new java.awt.Color(51, 255, 255));
        bt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt2.setText("View");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);
        bt2.setBounds(140, 670, 181, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        String name = txt1.getText();
        String plan = (String) cb1.getSelectedItem();
        float weight;
        int competitions;
        int coachingHours;
        try {
            weight = Float.parseFloat(txt2.getText());
            competitions = Integer.parseInt(txt5.getText());
            coachingHours = Integer.parseInt(txt6.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight, competitions, and coaching hours.");
            return;
        }

        // Validate input values
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter athlete's name.");
            return;
        }
        float trainingFeePerWeek = 0;
        float totalTrainingFee;
        float totalCompetitionFee = 0;
        float totalPrivateCoachingFee;
        float totalCost;
        String weightComparison;

        // Determine training fee per week based on the selected plan
        if (plan.equals("Beginner")) {
            trainingFeePerWeek = 25.00f;
        } else if (plan.equals("Intermediate")) {
            trainingFeePerWeek = 30.00f;
        } else if (plan.equals("Elite")) {
            trainingFeePerWeek = 35.00f;
        }

        // Calculate total training fee for the month
        totalTrainingFee = trainingFeePerWeek * 4;

        // Calculate total competition fee for the month if applicable
        if ((competitions > 0) && (plan.equals("Intermediate") || plan.equals("Elite"))) {
            totalCompetitionFee = competitions * 22.00f;
        }

        // Limit private coaching hours to 5 per week
        if (coachingHours > 5) {
            coachingHours = 5;
            
            JOptionPane.showMessageDialog(this, "Coaching hours cannot exceed 5");
            return; 
        }

        // Calculate total private coaching fee for the month
        totalPrivateCoachingFee = coachingHours * 9.50f;

        // Calculate total cost for the month
        totalCost = totalTrainingFee + totalCompetitionFee + totalPrivateCoachingFee;

        // Compare weight category
        if (weight > 100) {
            weightComparison = "Above Category";
        } else if (weight > 90) {
            weightComparison = "Heavyweight";
        } else if (weight > 81) {
            weightComparison = "Middleweight";
        } else if (weight > 73) {
            weightComparison = "Light-Middleweight";
        } else if (weight > 66) {
            weightComparison = "Lightweight";
        } else {
            weightComparison = "Flyweight";
        }
    this.setVisible(false);
        
        new fee_dis(name, totalTrainingFee, totalCompetitionFee, totalPrivateCoachingFee, totalCost, weightComparison).setVisible(true);

    }//GEN-LAST:event_bt1ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        String name = txt1.getText();
        String plan = (String) cb1.getSelectedItem();
        Float weight;
        int competitions;
        int coachingHours;
        try {
            weight = Float.parseFloat(txt2.getText());
            competitions = Integer.parseInt(txt5.getText());
            coachingHours = Integer.parseInt(txt6.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for weight, competitions, and coaching hours.");
            return;
            
        }
        
        
        if (coachingHours > 5) {
            coachingHours = 5;
            
            JOptionPane.showMessageDialog(this, "Coaching hours cannot exceed 5");
            return; 
        }
        

        this.setVisible(false);
        new fee_diss(name, plan, weight, competitions, coachingHours).setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

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
            java.util.logging.Logger.getLogger(feescal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feescal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feescal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feescal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feescal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
