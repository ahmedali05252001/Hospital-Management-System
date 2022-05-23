import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class updateWorker extends javax.swing.JFrame {

  
    public updateWorker() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        search_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ID_text = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        surname = new javax.swing.JLabel();
        surname_text = new javax.swing.JTextField();
        personalid = new javax.swing.JLabel();
        personalId_text = new javax.swing.JTextField();
        update_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        gender_text = new javax.swing.JComboBox<>();
        age_text = new javax.swing.JTextField();
        phone_text = new javax.swing.JTextField();
        maritalStatus_text = new javax.swing.JComboBox<>();
        age = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        maritalstatus = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        experience_text = new javax.swing.JTextField();
        adress_text = new javax.swing.JTextField();
        experience = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_button.setBackground(new java.awt.Color(30, 187, 215));
        search_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search-icon.png"))); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 109, -1));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 158, 160), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 235));

        ID_text.setBackground(new java.awt.Color(245, 245, 245));

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("ID");

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");

        name_text.setBackground(new java.awt.Color(245, 245, 245));

        surname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname.setText("Surname");

        surname_text.setBackground(new java.awt.Color(245, 245, 245));

        personalid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalid.setText("Personal ID");

        personalId_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(surname, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(personalid, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(name_text)
                        .addComponent(ID_text)
                        .addComponent(personalId_text))
                    .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(ID_text))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalId_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 368, 210));

        update_button.setBackground(new java.awt.Color(30, 187, 215));
        update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updateicon-removebg-preview (1).jpg"))); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, 30));

        back_button.setBackground(new java.awt.Color(30, 187, 215));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 100, -1));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(58, 158, 160), 4, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 235));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");

        gender_text.setBackground(new java.awt.Color(245, 245, 245));
        gender_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));

        age_text.setBackground(new java.awt.Color(245, 245, 245));

        phone_text.setBackground(new java.awt.Color(245, 245, 245));

        maritalStatus_text.setBackground(new java.awt.Color(245, 245, 245));
        maritalStatus_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Single", "Married", "Divorced" }));

        age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        age.setText("Age");

        phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phonenumber.setText("Phone No");

        maritalstatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maritalstatus.setText("Marital St");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maritalstatus)
                            .addComponent(phonenumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender_text, 0, 249, Short.MAX_VALUE)
                            .addComponent(age_text)))
                    .addComponent(phone_text)
                    .addComponent(maritalStatus_text, 0, 250, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maritalstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maritalStatus_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 368, 210));

        jPanel4.setBackground(new java.awt.Color(230, 230, 230));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 235));

        experience_text.setBackground(new java.awt.Color(245, 245, 245));

        adress_text.setBackground(new java.awt.Color(245, 245, 245));

        experience.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        experience.setText("Experience");

        adress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adress.setText("Adress");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experience_text, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adress_text)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experience_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 340, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    
       String WorkerId=(String)ID_text.getText();
        try {   
            Connection con=ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from worker where WorkerId='"+WorkerId+"'");
            if(rs.next()){
                name_text.setText(rs.getString(2));
                surname_text.setText(rs.getString(3));
                personalId_text.setText(rs.getString(4));
                gender_text.setSelectedItem(rs.getString(5));
                age_text.setText(rs.getString(6));
                phone_text.setText(rs.getString(7));
                maritalStatus_text.setSelectedItem(rs.getString(8));
                experience_text.setText(rs.getString(9));
                adress_text.setText(rs.getString(10));  
                ID_text.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Worker Id Does Not Exist !");
            }
        } catch (Exception e) {         
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
   
        setVisible(false);
        new Worker().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
    
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
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update worker set Name='"+Name+"',Surname='"+Surname+"',PersonalID='"+PersonalID+"',Gender='"+Gender+"',Age='"+Age+"',PhoneNumber='"+PhoneNumber+"',MaritalStatus='"+MaritalStatus+"',Experience='"+Experience+"',Adress='"+Adress+"' where WorkerId='"+WorkerId+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated !");
            setVisible(false);
            new updateWorker().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct formate !");
        }
      
    }//GEN-LAST:event_update_buttonActionPerformed
  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateWorker().setVisible(true);
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
    private javax.swing.JComboBox<String> maritalStatus_text;
    private javax.swing.JLabel maritalstatus;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_text;
    private javax.swing.JTextField personalId_text;
    private javax.swing.JLabel personalid;
    private javax.swing.JTextField phone_text;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JButton search_button;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surname_text;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
