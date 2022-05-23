import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;

public class updatepatient extends javax.swing.JFrame {

    
    public updatepatient() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        search_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        personalid_text = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        ID_text = new javax.swing.JTextField();
        surname_text = new javax.swing.JTextField();
        name_text = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        personalId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        gender_text = new javax.swing.JComboBox<>();
        phone_text = new javax.swing.JTextField();
        marital_text = new javax.swing.JComboBox<>();
        marital = new javax.swing.JLabel();
        age_text = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        disease_text = new javax.swing.JTextField();
        blood = new javax.swing.JLabel();
        disease = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        adress_text = new javax.swing.JTextField();
        blood_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        back_button.setBackground(new java.awt.Color(30, 187, 215));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, -1, 30));

        update_button.setBackground(new java.awt.Color(30, 187, 215));
        update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/updateicon-removebg-preview (1).jpg"))); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, 30));

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 235));

        personalid_text.setBackground(new java.awt.Color(245, 245, 245));

        name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name.setText("Name");

        ID_text.setBackground(new java.awt.Color(245, 245, 245));

        surname_text.setBackground(new java.awt.Color(245, 245, 245));

        name_text.setBackground(new java.awt.Color(245, 245, 245));

        id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        id.setText("ID");

        surname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname.setText("Surname");

        personalId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalId.setText("Personal ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(surname, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(personalId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personalid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalid_text, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 368, 210));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(320, 235));

        age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        age.setText("Age");

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setText("Gender");

        phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phone.setText("Phone No");

        gender_text.setBackground(new java.awt.Color(245, 245, 245));
        gender_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));

        phone_text.setBackground(new java.awt.Color(245, 245, 245));

        marital_text.setBackground(new java.awt.Color(245, 245, 245));
        marital_text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Single", "Married", "Divorced" }));

        marital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marital.setText("Marital St");

        age_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_text))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_text)
                            .addComponent(gender_text, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(marital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marital_text, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marital_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 368, 210));

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(320, 235));

        disease_text.setBackground(new java.awt.Color(245, 245, 245));

        blood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        blood.setText("Blood Gr");

        disease.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        disease.setText(" Disease");

        adress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adress.setText("Adress");

        adress_text.setBackground(new java.awt.Color(245, 245, 245));

        blood_text.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blood, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(adress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disease, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disease_text)
                    .addComponent(adress_text)
                    .addComponent(blood_text, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blood_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disease, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disease_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adress_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 330, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
   
        String PatientId = (String)ID_text.getText();
        String Name = (String)name_text.getText();
        String Surname = (String)surname_text.getText();
        String PersonalID = (String)personalid_text.getText();
        String Gender = (String)gender_text.getSelectedItem();
        String Age = (String)age_text.getText();
        String PhoneNumber = (String)phone_text.getText();
        String MaritalStatus = (String)marital_text.getSelectedItem();
        String Adress = (String)blood_text.getText();
        String BloodG = (String)blood_text.getText();
        String Disease = (String)disease_text.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update patient set Name='"+Name+"',Surname='"+Surname+"',PersonalID='"+PersonalID+"',Gender='"+Gender+"',Age='"+Age+"',PhoneNumber='"+PhoneNumber+"',MaritalStatus='"+MaritalStatus+"',Adress='"+Adress+"',BloodG='"+BloodG+"',Disease='"+Disease+"' where PatientId='"+PatientId+"'");
            JOptionPane.showMessageDialog(null, "Successfully Updated !");
            setVisible(false);
            new updatepatient().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct formate !");
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
   
         String PatientID=(String)ID_text.getText();
        try {   
            Connection con=ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from patient where PatientId='"+PatientID+"'");
            if(rs.next()){
                name_text.setText(rs.getString(2));
                surname_text.setText(rs.getString(3));
                personalid_text.setText(rs.getString(4));
                gender_text.setSelectedItem(rs.getString(5));
                age_text.setText(rs.getString(6));
                phone_text.setText(rs.getString(7));
                marital_text.setSelectedItem(rs.getString(8));
                adress_text.setText(rs.getString(9));
                blood_text.setText(rs.getString(10));
                disease_text.setText(rs.getString(11)); 
                ID_text.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Patient Id Does Not Exist !");
            }
        } catch (Exception e) {         
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        setVisible(false);
        new Pacient().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatepatient().setVisible(true);
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
    private javax.swing.JLabel blood;
    private javax.swing.JTextField blood_text;
    private javax.swing.JLabel disease;
    private javax.swing.JTextField disease_text;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> gender_text;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel marital;
    private javax.swing.JComboBox<String> marital_text;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name_text;
    private javax.swing.JLabel personalId;
    private javax.swing.JTextField personalid_text;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phone_text;
    private javax.swing.JButton search_button;
    private javax.swing.JLabel surname;
    private javax.swing.JTextField surname_text;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables
}
