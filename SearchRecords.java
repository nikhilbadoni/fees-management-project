/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fees_management_system;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author hp
 */
public class SearchRecords extends javax.swing.JFrame {

    /**
     * Creates new form SearchRecords
     */
    
    //default assigned null by jvm
    DefaultTableModel model;
            
    public SearchRecords() {
        initComponents();
        scrl_pane.getVerticalScrollBar().setUnitIncrement(20);
        setRecordsToTable();
    }
    
    public void setRecordsToTable(){
        try{
            Connection con=DBConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from fees_details");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String receiptNo=rs.getString("receipt_no");
                String rollNo=rs.getString("roll_no");
                String studentName=rs.getString("student_name");
                String paymentMode=rs.getString("payment_mode");
                String courseName=rs.getString("course_name");
                float amount=rs.getFloat("total_amount");
                String remark=rs.getString("remark");
                
                Object []obj={receiptNo,rollNo,studentName,courseName,paymentMode,amount,remark};
                
                model=(DefaultTableModel)tbl_feedetails.getModel();
                model.addRow(obj);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void search(String str){
        model=(DefaultTableModel)tbl_feedetails.getModel();
        TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
        tbl_feedetails.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrl_pane = new javax.swing.JScrollPane();
        panel_main = new javax.swing.JPanel();
        panel_sidebar = new javax.swing.JPanel();
        panel_Logout = new javax.swing.JPanel();
        btn_Logout = new javax.swing.JLabel();
        panel_Home = new javax.swing.JPanel();
        btn_Home = new javax.swing.JLabel();
        panel_SearchRecord = new javax.swing.JPanel();
        btn_newregistration = new javax.swing.JLabel();
        panel_EditCourses = new javax.swing.JPanel();
        btn_EditCourses = new javax.swing.JLabel();
        panel_CheckBalance = new javax.swing.JPanel();
        btn_CheckBalance = new javax.swing.JLabel();
        panel_ViewAllRecord = new javax.swing.JPanel();
        btn_ViewAllRecord = new javax.swing.JLabel();
        panel_parent = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_feedetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anudip Foundation");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrl_pane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrl_pane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_sidebar.setBackground(new java.awt.Color(255, 0, 51));
        panel_sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Logout.setBackground(new java.awt.Color(255, 0, 51));
        panel_Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Logout.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_Logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/logout.png"))); // NOI18N
        btn_Logout.setText(" Logout");
        btn_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogoutMouseExited(evt);
            }
        });
        panel_Logout.add(btn_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 70));

        panel_sidebar.add(panel_Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 360, 70));

        panel_Home.setBackground(new java.awt.Color(255, 0, 51));
        panel_Home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(255, 255, 255));
        btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/home.png"))); // NOI18N
        btn_Home.setText(" Home");
        btn_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_HomeMouseExited(evt);
            }
        });
        panel_Home.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 60));

        panel_sidebar.add(panel_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 360, 70));

        panel_SearchRecord.setBackground(new java.awt.Color(255, 0, 51));
        panel_SearchRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_SearchRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_newregistration.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_newregistration.setForeground(new java.awt.Color(255, 255, 255));
        btn_newregistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/new-user.png"))); // NOI18N
        btn_newregistration.setText("New Registration");
        btn_newregistration.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_newregistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newregistrationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_newregistrationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_newregistrationMouseExited(evt);
            }
        });
        panel_SearchRecord.add(btn_newregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 340, -1));

        panel_sidebar.add(panel_SearchRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 360, 70));

        panel_EditCourses.setBackground(new java.awt.Color(255, 0, 51));
        panel_EditCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_EditCourses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_EditCourses.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_EditCourses.setForeground(new java.awt.Color(255, 255, 255));
        btn_EditCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/edit2.png"))); // NOI18N
        btn_EditCourses.setText(" Edit Courses");
        btn_EditCourses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_EditCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_EditCoursesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_EditCoursesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_EditCoursesMouseExited(evt);
            }
        });
        panel_EditCourses.add(btn_EditCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, 70));

        panel_sidebar.add(panel_EditCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 360, 70));

        panel_CheckBalance.setBackground(new java.awt.Color(255, 0, 51));
        panel_CheckBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_CheckBalance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CheckBalance.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_CheckBalance.setForeground(new java.awt.Color(255, 255, 255));
        btn_CheckBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/list.png"))); // NOI18N
        btn_CheckBalance.setText("Check Balance");
        btn_CheckBalance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CheckBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CheckBalanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CheckBalanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CheckBalanceMouseExited(evt);
            }
        });
        panel_CheckBalance.add(btn_CheckBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 330, -1));

        panel_sidebar.add(panel_CheckBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 360, 70));

        panel_ViewAllRecord.setBackground(new java.awt.Color(255, 0, 51));
        panel_ViewAllRecord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panel_ViewAllRecord.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ViewAllRecord.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        btn_ViewAllRecord.setForeground(new java.awt.Color(255, 255, 255));
        btn_ViewAllRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fees_management_system/Fees_Management_System_images/view all record.png"))); // NOI18N
        btn_ViewAllRecord.setText("View All Record");
        btn_ViewAllRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ViewAllRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ViewAllRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ViewAllRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ViewAllRecordMouseExited(evt);
            }
        });
        panel_ViewAllRecord.add(btn_ViewAllRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 70));

        panel_sidebar.add(panel_ViewAllRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 360, 70));

        panel_main.add(panel_sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 790));

        panel_parent.setBackground(new java.awt.Color(255, 204, 204));
        panel_parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 0, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Search Record");
        panel_parent.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 250, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));
        panel_parent.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 300, 20));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Enter Search String :");
        panel_parent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 180, 40));

        txt_search.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        panel_parent.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 370, 40));

        tbl_feedetails.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        tbl_feedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Receipt No", "Roll No", "Student Name", "Course", "Payment Mode", "Amount", "Remark"
            }
        ));
        tbl_feedetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_feedetails);

        panel_parent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 940, 590));

        panel_main.add(panel_parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 1070, 790));

        scrl_pane.setViewportView(panel_main);

        getContentPane().add(scrl_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 801));

        setSize(new java.awt.Dimension(1514, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseEntered
        Color c=new Color(255,102,102);
        panel_Logout.setBackground(c);
    }//GEN-LAST:event_btn_LogoutMouseEntered

    private void btn_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseExited
        Color c=new Color(255,0,51);
        panel_Logout.setBackground(c);
    }//GEN-LAST:event_btn_LogoutMouseExited

    private void btn_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseClicked
        Home home=new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_HomeMouseClicked

    private void btn_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseEntered
        Color c=new Color(255,102,102);
        panel_Home.setBackground(c);
    }//GEN-LAST:event_btn_HomeMouseEntered

    private void btn_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMouseExited
        Color c=new Color(255,0,51);
        panel_Home.setBackground(c);
    }//GEN-LAST:event_btn_HomeMouseExited

    private void btn_newregistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newregistrationMouseClicked
        AddFees add=new AddFees();
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_newregistrationMouseClicked

    private void btn_newregistrationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newregistrationMouseEntered
        Color c=new Color(255,102,102);
        panel_SearchRecord.setBackground(c);
    }//GEN-LAST:event_btn_newregistrationMouseEntered

    private void btn_newregistrationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newregistrationMouseExited
        Color c=new Color(255,0,51);
        panel_SearchRecord.setBackground(c);
    }//GEN-LAST:event_btn_newregistrationMouseExited

    private void btn_EditCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCoursesMouseClicked
        EditCourse edit=new EditCourse();
        edit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_EditCoursesMouseClicked

    private void btn_EditCoursesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCoursesMouseEntered
        Color c=new Color(255,102,102);
        panel_EditCourses.setBackground(c);
    }//GEN-LAST:event_btn_EditCoursesMouseEntered

    private void btn_EditCoursesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_EditCoursesMouseExited
        Color c=new Color(255,0,51);
        panel_EditCourses.setBackground(c);
    }//GEN-LAST:event_btn_EditCoursesMouseExited

    private void btn_CheckBalanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CheckBalanceMouseEntered
        Color c=new Color(255,102,102);
        panel_CheckBalance.setBackground(c);
    }//GEN-LAST:event_btn_CheckBalanceMouseEntered

    private void btn_CheckBalanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CheckBalanceMouseExited
        Color c=new Color(255,0,51);
        panel_CheckBalance.setBackground(c);
    }//GEN-LAST:event_btn_CheckBalanceMouseExited

    private void btn_ViewAllRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewAllRecordMouseEntered
        Color c=new Color(255,102,102);
        panel_ViewAllRecord.setBackground(c);
    }//GEN-LAST:event_btn_ViewAllRecordMouseEntered

    private void btn_ViewAllRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewAllRecordMouseExited
        Color c=new Color(255,0,51);
        panel_ViewAllRecord.setBackground(c);
    }//GEN-LAST:event_btn_ViewAllRecordMouseExited

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String searchString=txt_search.getText();
        search(searchString);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_ViewAllRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ViewAllRecordMouseClicked
        ViewAllRecords records=new ViewAllRecords();
        records.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ViewAllRecordMouseClicked

    private void btn_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogoutMouseClicked
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_LogoutMouseClicked

    private void btn_CheckBalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CheckBalanceMouseClicked
        // TODO add your handling code here:
        CheckBalance balance=new CheckBalance();
        balance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CheckBalanceMouseClicked

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
            java.util.logging.Logger.getLogger(SearchRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_CheckBalance;
    private javax.swing.JLabel btn_EditCourses;
    private javax.swing.JLabel btn_Home;
    private javax.swing.JLabel btn_Logout;
    private javax.swing.JLabel btn_ViewAllRecord;
    private javax.swing.JLabel btn_newregistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel_CheckBalance;
    private javax.swing.JPanel panel_EditCourses;
    private javax.swing.JPanel panel_Home;
    private javax.swing.JPanel panel_Logout;
    private javax.swing.JPanel panel_SearchRecord;
    private javax.swing.JPanel panel_ViewAllRecord;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPanel panel_parent;
    private javax.swing.JPanel panel_sidebar;
    private javax.swing.JScrollPane scrl_pane;
    private javax.swing.JTable tbl_feedetails;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}