import Project.InsertUpdateDelete;
import javax.swing.JOptionPane;

public class addworker extends javax.swing.JFrame {

    public addworker() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back_button = new javax.swing.JButton();
        save_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        personalid = new javax.swing.JLabel();
        ID_text = new javax.swing.JTextField();
        name_text = new javax.swing.JTextField();
        surname_text = new javax.swing.JTextField();
        personalId_text = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        marital = new javax.swing.JLabel();
        gender_text = new javax.swing.JComboBox<>();
        age_text = new javax.swing.JTextField();
        phone_text = new javax.swing.JTextField();
        maritalStatus_text = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        experience = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        experience_text = new javax.swing.JTextField();
        adress_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, -1, 30));

        save_button.setBackground(new java.awt.Color(30, 187, 215));
        save_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save-removebg-preview (1).jpg"))); // NOI18N
        save_button.setText("Save");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(save_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 30));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 235));

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("ID");

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");

        surname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname.setText("Surname");

        personalid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalid.setText("Personal ID");

        ID_text.setBackground(new java.awt.Color(245, 245, 245));

        name_text.setBackground(new java.awt.Color(245, 245, 245));

        surname_text.setBackground(new java.awt.Color(245, 245, 245));

        personalId_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personalid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personalId_text)
                            .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalId_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 368, 210));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 235));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");

        age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        age.setText("Age");

        phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phone.setText("Phone No");

        marital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marital.setText("Marital St");

        gender_text.setBackground(new java.awt.Color(245, 245, 245));
        gender_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));

        age_text.setBackground(new java.awt.Color(245, 245, 245));

        phone_text.setBackground(new java.awt.Color(245, 245, 245));

        maritalStatus_text.setBackground(new java.awt.Color(245, 245, 245));
        maritalStatus_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Single", "Married", "Divorced" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender_text, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age_text, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phone_text)
                    .addComponent(maritalStatus_text, javax.swing.GroupLayout.Alignment.TRAILING, 0, 255, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maritalStatus_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 368, 210));

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 235));

        experience.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        experience.setText("Experience");

        adress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adress.setText("Adress");

        experience_text.setBackground(new java.awt.Color(245, 245, 245));

        adress_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(experience)
                        .addGap(15, 15, 15)
                        .addComponent(experience_text, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adress_text)))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experience_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
 
        String WorkerId = (String)ID_text.getText();
        String Name = (String)name_text.getText();
        String Surname = (String)surname_text.getText();
        String PersonalID = (String)personalId_text.getText();
        String Gender = (String)gender_text.getSelectedItem();
        String Age = (String)age_text.getText();
        String PhoneNumber = (String)phone_text.getText();
        String MaritalStatus = (String)maritalStatus_text.getSelectedItem();
        String Experience = (String)experience_text.getText();
        String Adress = (String)adress_text.getText();
       
        if(WorkerId.equals("")||Name.equals("")||Surname.equals("")||PersonalID.equals("")
            ||Gender.equals("")||Age.equals("")||PhoneNumber.equals("")||MaritalStatus.equals("")||Experience.equals("")||
            Adress.equals("")){
            JOptionPane.showMessageDialog(null,"Every Field Is Required!");
        }else{
            String QueryString = "insert into worker values( '"+WorkerId+"','"+Name+"','"+Surname+"','"+PersonalID+"','"+Gender+"','"+Age+"','"+PhoneNumber+"','"+MaritalStatus+"','"+Experience+"','"+Adress+"')";
           
            int status2 = InsertUpdateDelete.setData(QueryString);
            if(status2 == 1){
                JOptionPane.showMessageDialog(null,"Successfully Updated!");
                setVisible(false);
                new addworker().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"The same id have been used!");
            }
        }
        
    }//GEN-LAST:event_save_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        setVisible(false);
        new Worker().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addworker().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_text;
    private javax.swing.JLabel adress;
    private javax.swing.JTextField adress_text;
    private javax.swing.JLabel age;
    private javax.swing.JTextField age_text;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel experience;
    private javax.swing.JTextField experience_text;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gender_text;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel marital;
    private javax.swing.JComboBox<String> maritalStatus_text;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_text;
    private javax.swing.JTextField personalId_text;
    private javax.swing.JLabel personalid;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phone_text;
    private javax.swing.JButton save_button;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surname_text;
    // End of variables declaration//GEN-END:variables
}
