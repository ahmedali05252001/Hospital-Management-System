import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class updatedoctor extends javax.swing.JFrame {
  
    public updatedoctor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        update_button = new javax.swing.JButton();
        search_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        surname_text = new javax.swing.JTextField();
        personalId_text = new javax.swing.JTextField();
        ID_text = new javax.swing.JTextField();
        personalid = new javax.swing.JLabel();
        name_text = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gender = new javax.swing.JLabel();
        maritalstatus = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        phone_text = new javax.swing.JTextField();
        age_text = new javax.swing.JTextField();
        gender_text = new javax.swing.JComboBox<>();
        phonenumber = new javax.swing.JLabel();
        maritalStatus_text = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        experience = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        adress_text = new javax.swing.JTextField();
        experience_text = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        update_button.setBackground(new java.awt.Color(30, 187, 215));
        update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updateicon-removebg-preview (1).jpg"))); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 470, 110, 30));

        search_button.setBackground(new java.awt.Color(30, 187, 215));
        search_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search-icon.png"))); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 109, -1));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 235));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");

        surname_text.setBackground(new java.awt.Color(245, 245, 245));

        personalId_text.setBackground(new java.awt.Color(245, 245, 245));

        ID_text.setBackground(new java.awt.Color(245, 245, 245));

        personalid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalid.setText("Personal ID");

        name_text.setBackground(new java.awt.Color(245, 245, 245));

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("ID");

        surname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname.setText("Surname");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(surname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personalid, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_text, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(name_text)
                    .addComponent(surname_text)
                    .addComponent(personalId_text))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalId_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, 200));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 235));

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");

        maritalstatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        maritalstatus.setText("Marital St");

        age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        age.setText("Age");

        phone_text.setBackground(new java.awt.Color(245, 245, 245));

        age_text.setBackground(new java.awt.Color(245, 245, 245));
        age_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_textActionPerformed(evt);
            }
        });

        gender_text.setBackground(new java.awt.Color(245, 245, 245));
        gender_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));

        phonenumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phonenumber.setText("Phone No");

        maritalStatus_text.setBackground(new java.awt.Color(245, 245, 245));
        maritalStatus_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Single", "Married", "Divorced" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maritalstatus))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phone_text)
                    .addComponent(maritalStatus_text, 0, 235, Short.MAX_VALUE)
                    .addComponent(age_text))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maritalStatus_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maritalstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 370, 200));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 235));

        experience.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        experience.setText("Experience");

        adress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adress.setText("Adress");

        adress_text.setBackground(new java.awt.Color(245, 245, 245));

        experience_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adress_text, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experience_text, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(experience_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress_text))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 120));

        back_button.setBackground(new java.awt.Color(30, 187, 215));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
    
        String DoctorId=(String)ID_text.getText();
        try {   
            Connection con=ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from doctor where DoctorId='"+DoctorId+"'");
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
                JOptionPane.showMessageDialog(null, "Doctor Id Does Not Exist !");
            }
        } catch (Exception e) {         
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
  
        setVisible(false);
        new Doctor().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
      
        String DoctorId = (String)ID_text.getText();
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
            st.executeUpdate("update doctor set Name='"+Name+"',Surname='"+Surname+"',PersonalID='"+PersonalID+"',Gender='"+Gender+"',Age='"+Age+"',PhoneNumber='"+PhoneNumber+"',MaritalStatus='"+MaritalStatus+"',Experience='"+Experience+"',Adress='"+Adress+"' where DoctorId='"+DoctorId+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated !");
            setVisible(false);
            new updatedoctor().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct formate !");
        }

    }//GEN-LAST:event_update_buttonActionPerformed

    private void age_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_textActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedoctor().setVisible(true);
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
