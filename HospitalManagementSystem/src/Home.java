import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        exit_button = new javax.swing.JButton();
        doctor_button = new javax.swing.JButton();
        worker_button = new javax.swing.JButton();
        doctor = new javax.swing.JLabel();
        worker = new javax.swing.JLabel();
        patient_button = new javax.swing.JButton();
        patient = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hospital Managemnet");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));

        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1300, 670));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit_button.setBackground(new java.awt.Color(30, 187, 215));
        exit_button.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, 110, 30));

        doctor_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/.png"))); // NOI18N
        doctor_button.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        doctor_button.setBorderPainted(false);
        doctor_button.setContentAreaFilled(false);
        doctor_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(doctor_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 280));

        worker_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/WORKER.png"))); // NOI18N
        worker_button.setBorderPainted(false);
        worker_button.setContentAreaFilled(false);
        worker_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worker_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(worker_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 240, 280));

        doctor.setFont(new java.awt.Font("Bookman Old Style", 1, 28)); // NOI18N
        doctor.setText("       DOCTOR");
        jPanel2.add(doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 210, 40));

        worker.setFont(new java.awt.Font("Bookman Old Style", 1, 28)); // NOI18N
        worker.setText("   WORKER");
        jPanel2.add(worker, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 170, 40));

        patient_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/PATIENT.png"))); // NOI18N
        patient_button.setBorderPainted(false);
        patient_button.setContentAreaFilled(false);
        patient_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(patient_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 230, 280));

        patient.setFont(new java.awt.Font("Bookman Old Style", 1, 28)); // NOI18N
        patient.setText("         PATIENT");
        jPanel2.add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -120, 1070, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctor_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_buttonActionPerformed
        setVisible(false);
        new Doctor().setVisible(true);
    }//GEN-LAST:event_doctor_buttonActionPerformed

    private void worker_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worker_buttonActionPerformed
        setVisible(false);
        new Worker().setVisible(true);
    }//GEN-LAST:event_worker_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed

        int a;
        a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Log out",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new LogIN().setVisible(true);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void patient_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_buttonActionPerformed
        setVisible(false);
        new Pacient().setVisible(true);
    }//GEN-LAST:event_patient_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel doctor;
    private javax.swing.JButton doctor_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel patient;
    private javax.swing.JButton patient_button;
    private javax.swing.JLabel worker;
    private javax.swing.JButton worker_button;
    // End of variables declaration//GEN-END:variables
}
