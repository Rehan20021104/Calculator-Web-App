/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.north_sussex_judo;

/**
 *
 * @author RR
 */
public class fee_diss extends javax.swing.JFrame {

    /**
     * Creates new form fee_dis
     * @param name
     * @param totalCompetitionFee
     */
    public fee_diss(String name, String plan, float weight, int competitions, int coachingHours) {
        initComponents();
    lab2.setText(name);
    lab4.setText(plan);
    lab6.setText(Float.toString(weight));
    lab8.setText(Integer.toString(competitions));
    lab10.setText(Integer.toString(coachingHours));
    }

    private fee_diss() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        lab3 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        lab6 = new javax.swing.JLabel();
        lab8 = new javax.swing.JLabel();
        lab7 = new javax.swing.JLabel();
        lab9 = new javax.swing.JLabel();
        lab10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        lab4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lab4);
        lab4.setBounds(320, 230, 289, 36);

        lab3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab3.setText("Plan Name:");
        jPanel1.add(lab3);
        lab3.setBounds(90, 230, 213, 36);

        lab5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab5.setText("Weight (kg):");
        jPanel1.add(lab5);
        lab5.setBounds(90, 300, 213, 36);

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lab2);
        lab2.setBounds(320, 160, 289, 36);

        lab1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab1.setText("Athlete Name:");
        jPanel1.add(lab1);
        lab1.setBounds(90, 160, 213, 36);

        lab6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lab6);
        lab6.setBounds(320, 300, 289, 36);

        lab8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lab8);
        lab8.setBounds(320, 360, 289, 36);

        lab7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab7.setText("Competitions:");
        jPanel1.add(lab7);
        lab7.setBounds(90, 360, 213, 36);

        lab9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lab9.setText("Coaching Hours:");
        jPanel1.add(lab9);
        lab9.setBounds(90, 440, 213, 36);

        lab10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lab10);
        lab10.setBounds(320, 440, 289, 36);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel1.setText("North Sussex Judo ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 20, 430, 41);

        jLabel7.setText("==================================================================================================================================================================================");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 620, 1424, 16);

        jLabel8.setText("==================================================================================================================================================================================");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 70, 1424, 16);

        bt2.setBackground(new java.awt.Color(51, 255, 255));
        bt2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt2.setText("Home");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel1.add(bt2);
        bt2.setBounds(1000, 660, 181, 41);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new feescal().setVisible(true);
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
            java.util.logging.Logger.getLogger(fee_dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fee_dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fee_dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fee_dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fee_diss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab10;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    // End of variables declaration//GEN-END:variables
}
