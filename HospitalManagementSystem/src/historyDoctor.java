import Project.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class historyDoctor extends javax.swing.JFrame {
    DefaultTableModel model; 
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public historyDoctor() {
        initComponents();
        doctor_table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
        doctor_table.getTableHeader().setOpaque(false);
        doctor_table.getTableHeader().setBackground(new Color(32,136,203));
        //patient_table.getTableHeader().setForeground(new Color(32,136,203));
        
        setRecordsToTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctor_table = new javax.swing.JTable();
        button_delete_row = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Enter Search String");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 26));

        txt_search.setBackground(new java.awt.Color(245, 245, 245));
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel3.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 279, 26));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 758, 10));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 60), 4));

        doctor_table.setBackground(new java.awt.Color(245, 245, 245));
        doctor_table.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        doctor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rowNo", "DoctorID", "Name", "Surname", "PersonalID", "Gender", "Age", "PhoneNumber", "MaritalStatus", "Experience", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctor_table.setGridColor(new java.awt.Color(51, 51, 51));
        doctor_table.setSelectionBackground(new java.awt.Color(51, 102, 255));
        doctor_table.setSelectionForeground(new java.awt.Color(204, 255, 255));
        doctor_table.setShowHorizontalLines(true);
        doctor_table.setSurrendersFocusOnKeystroke(true);
        doctor_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(doctor_table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        button_delete_row.setBackground(new java.awt.Color(30, 187, 215));
        button_delete_row.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_delete_row.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x-button.png"))); // NOI18N
        button_delete_row.setText("Delete");
        button_delete_row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_delete_rowActionPerformed(evt);
            }
        });
        jPanel3.add(button_delete_row, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, 32));

        jButton2.setBackground(new java.awt.Color(30, 187, 215));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, 32));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void setRecordsToTable(){
            try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating a connection
            con = ConnectionProvider.getCon();
            pst = con.prepareStatement("select * from doctor");                 //creating statement to execute the query
            rs= pst.executeQuery();
            System.out.println(rs.next());
            int counter = 1;
            while(rs.next()){
                String DoctorId = rs.getString("DoctorId");                   //"DoctorId" is the column name
                String Name = rs.getString("Name");  
                String Surname = rs.getString("Surname");  
                String PersonalID = rs.getString("PersonalID");  
                String Gender = rs.getString("Gender");  
                String Age = rs.getString("Age");  
                String PhoneNumber = rs.getString("PhoneNumber");  
                String MaritalStatus = rs.getString("MaritalStatus");  
                String Experience = rs.getString("Experience"); 
                String Adress = rs.getString("Adress");  

            
                String counterstr = ""+counter;
                String jtabledata[] = {counterstr,DoctorId,Name,Surname,PersonalID,Gender,Age,PhoneNumber,MaritalStatus,Experience,Adress};
                ++counter;
                
                model = (DefaultTableModel)doctor_table.getModel();
                model.addRow(jtabledata);
            }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            finally{
            try{
                rs.close();
                pst.close();  
            }catch(Exception e){
            }
        }
    }
    
    public void search(String str){
        model = (DefaultTableModel)doctor_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        doctor_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));        
    }
        
    private void button_delete_rowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_delete_rowActionPerformed
       
        model = (DefaultTableModel)doctor_table.getModel();
        //get selected row index
        int SelectedRowIndex = doctor_table.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        String cell = doctor_table.getModel().getValueAt(SelectedRowIndex,1).toString();
        String sql = "DELETE FROM doctor WHERE DoctorId = '"+cell+"'";
        try{
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
            }catch(Exception e){
            }
        }
    }//GEN-LAST:event_button_delete_rowActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
        setVisible(false);
        new Doctor().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
    
        String searchString = txt_search.getText();         //Search key
        search(searchString);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyDoctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_delete_row;
    private javax.swing.JTable doctor_table;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
