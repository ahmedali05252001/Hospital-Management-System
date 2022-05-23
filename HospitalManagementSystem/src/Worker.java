
public class Worker extends javax.swing.JFrame {
    
    public Worker() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        history_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Worker");

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back_button.setBackground(new java.awt.Color(30, 187, 215));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, 30));

        add_button.setBackground(new java.awt.Color(30, 187, 215));
        add_button.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        add_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addpng-removebg-preview (1).jpg"))); // NOI18N
        add_button.setText("   Add Worker");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 220, 60));

        history_button.setBackground(new java.awt.Color(30, 187, 215));
        history_button.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        history_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/download.png"))); // NOI18N
        history_button.setText("   History of  Worker");
        history_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(history_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 220, 58));

        update_button.setBackground(new java.awt.Color(30, 187, 215));
        update_button.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update-removebg-preview (3).jpg"))); // NOI18N
        update_button.setText("   Update Worker");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 220, 58));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        setVisible(false);
        new addworker().setVisible(true);
    }//GEN-LAST:event_add_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
         setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_buttonActionPerformed
        setVisible(false);
        new historyWorker().setVisible(true);
    }//GEN-LAST:event_history_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
            setVisible(false);
        new updateWorker().setVisible(true);
    }//GEN-LAST:event_update_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Worker().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back_button;
    private javax.swing.JButton history_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
