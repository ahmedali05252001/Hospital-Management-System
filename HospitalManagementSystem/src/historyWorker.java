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

public class historyWorker extends javax.swing.JFrame {
    DefaultTableModel model; 
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public historyWorker() {
        initComponents();
        worker_table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,14));
        worker_table.getTableHeader().setOpaque(false);
        worker_table.getTableHeader().setBackground(new Color(32,136,203));
       // worker_table.getTableHeader().setForeground(new Color(32,136,203));
        
        setRecordsToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        search_text = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        worker_table = new javax.swing.JTable();
        back_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setText("Enter Search String");
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 22, -1, 26));

        search_text.setBackground(new java.awt.Color(245, 245, 245));
        search_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textActionPerformed(evt);
            }
        });
        search_text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_textKeyReleased(evt);
            }
        });
        jPanel2.add(search_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 25, 320, 26));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 780, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(58, 158, 160), 4));

        worker_table.setAutoCreateRowSorter(true);
        worker_table.setBackground(new java.awt.Color(245, 245, 245));
        worker_table.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        worker_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rowNo", "WorkerID", "Name", "Surname", "PersonalID", "Gender", "Age", "PhoneNumber", "MaritalStatus", "Experience", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        worker_table.setSelectionBackground(new java.awt.Color(153, 153, 153));
        worker_table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        worker_table.setShowHorizontalLines(true);
        worker_table.setSurrendersFocusOnKeystroke(true);
        worker_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(worker_table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 780, 320));

        back_button.setBackground(new java.awt.Color(30, 187, 215));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go-back-icon.png"))); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 97, 32));

        delete_button.setBackground(new java.awt.Color(30, 187, 215));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/x-button.png"))); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 32));

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 538, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1 (4).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

            public void setRecordsToTable(){
            try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            //Creating a connection
            con = ConnectionProvider.getCon();
            pst = con.prepareStatement("select * from worker");
            rs= pst.executeQuery();
            int counter = 1;
            while(rs.next()){
                String WorkerId = rs.getString("WorkerId");                   //"PatientId" is the column name
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
                String jtabledata[] = {counterstr,WorkerId,Name,Surname,PersonalID,Gender,Age,PhoneNumber,MaritalStatus,Experience,Adress};
                ++counter;
                
                model = (DefaultTableModel)worker_table.getModel();
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
        model = (DefaultTableModel)worker_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        worker_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));        
    }  
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
      
        model = (DefaultTableModel)worker_table.getModel();
        //get selected row index
        int SelectedRowIndex = worker_table.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        String cell = worker_table.getModel().getValueAt(SelectedRowIndex,1).toString();
        String sql = "DELETE FROM worker WHERE WorkerId = '"+cell+"'";
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
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void search_textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_textKeyReleased
        String searchString = search_text.getText();         //Search key
        search(searchString);
    }//GEN-LAST:event_search_textKeyReleased

    private void search_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textActionPerformed
      
    }//GEN-LAST:event_search_textActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        setVisible(false);
        new Worker().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed
  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyWorker().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel search;
    private javax.swing.JTextField search_text;
    private javax.swing.JTable worker_table;
    // End of variables declaration//GEN-END:variables
}
