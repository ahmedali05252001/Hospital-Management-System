import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LogIN extends javax.swing.JFrame {
    Home login = new Home();
    public LogIN() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        username_text = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        password_text = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        username_text.setBackground(new java.awt.Color(245, 245, 245));
        username_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                username_textKeyPressed(evt);
            }
        });

        username.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        username.setText("UserName");
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        password.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        password.setText("Password");
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exit_button.setBackground(new java.awt.Color(30, 187, 215));
        exit_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit_button.setText("Exit");
        exit_button.setMaximumSize(new java.awt.Dimension(72, 25));
        exit_button.setMinimumSize(new java.awt.Dimension(72, 25));
        exit_button.setPreferredSize(new java.awt.Dimension(72, 25));
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(30, 187, 215));
        login_button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_button.setText("LogIn");
        login_button.setMaximumSize(new java.awt.Dimension(72, 26));
        login_button.setMinimumSize(new java.awt.Dimension(72, 26));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        password_text.setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(username)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(username_text)
                    .addComponent(password_text, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 300, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/pikwizard-nurse-on-blue-blurred-background (1).jpg"))); // NOI18N
        jLabel1.setText("background");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Login butonu
    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed

        String username = username_text.getText().trim();
        String password = new String(password_text.getPassword());
        String message;

        if(username.equals("admin") && password.equals("admin")){
            setVisible(false);
            new Home().setVisible(true);
        }
        else if(!username.equals("admin") && password.equals("admin")){
            message="Username Incorrect";
            JOptionPane.showMessageDialog(this, message);
            username_text.setText("");
            password_text.setText("");
        }
        else if(username.equals("admin") && !password.equals("admin")){
            message="Password Incorrect";
            JOptionPane.showMessageDialog(this, message);
            username_text.setText("");
            password_text.setText("");
        }
        else{
            message="Username and Password Incorrect";
            JOptionPane.showMessageDialog(this, message);
            username_text.setText("");
            password_text.setText("");
        }
    }//GEN-LAST:event_login_buttonActionPerformed

    private void username_textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_username_textKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER){

            String username = username_text.getText().trim();
            String password = new String(password_text.getPassword());
            String message;

            if(username.equals("admin") && password.equals("admin")){
                setVisible(false);
                new Home().setVisible(true);
            }
            else if(!username.equals("admin") && password.equals("admin")){
                message="Username Incorrect";
                JOptionPane.showMessageDialog(this, message);
                username_text.setText("");
                password_text.setText("");
            }
            else if(username.equals("admin") && !password.equals("admin")){
                message="Password Incorrect";
                JOptionPane.showMessageDialog(this, message);
                username_text.setText("");
                password_text.setText("");
            }
            else{
                message="Username and Password Incorrect";
                JOptionPane.showMessageDialog(this, message);
                username_text.setText("");
                password_text.setText("");
            }
        }
    }//GEN-LAST:event_username_textKeyPressed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want  to close application?","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_exit_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIN().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
