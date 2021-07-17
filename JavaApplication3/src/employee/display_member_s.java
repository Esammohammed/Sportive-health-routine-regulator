/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author essam
 */
public class display_member_s extends javax.swing.JFrame {

   int i=0;
    public display_member_s() {
        initComponents();
        
        
    }
    int emp_id;
     public display_member_s(int id ,int emp_id ) {
        initComponents();
        
            jButton1.setVisible(false);
            jButton2.setVisible(false);
  
        emp_id = this.emp_id;
        display_mem(id,emp_id);
       
        admin.admin_empid.get(emp_id).employee_empid.remove(Integer. valueOf(jTextField3.getText()));
               admin.admin_empid.get(emp_id).mem_id.remove(Integer. valueOf(jTextField3.getText()));
    }
      public display_member_s(boolean all , int emp_id) {
          this.emp_id = emp_id;
        initComponents();
        
        display_mem( admin.admin_empid.get(emp_id).mem_id.get(0), emp_id);
        
        if (admin.admin_empid.get(emp_id).mem_id.size()-1<=i){
            jButton1.setVisible(false);
            jButton2.setVisible(false);
          
        }
        else {
            jButton1.setVisible(false);
            jButton2.setVisible(true);
        }
    }

   void display_mem(int id ,int emp_id){
       member mem = new member (admin.admin_empid.get(emp_id).employee_empid.get(id).memberid,
               admin.admin_empid.get(emp_id).employee_empid.get(id).weight,
       admin.admin_empid.get(emp_id).employee_empid.get(id).height,admin.admin_empid.get(emp_id).employee_empid.get(id).type,
       admin.admin_empid.get(emp_id).employee_empid.get(id).name,
       admin.admin_empid.get(emp_id).employee_empid.get(id).age,
       admin.admin_empid.get(emp_id).employee_empid.get(id).gender);
             
        jTextField3.setText(mem.name);
        jTextField2.setText(String.valueOf(mem.getMemberid()));
        jTextField1.setText(String.valueOf(mem.age));
        jTextField4.setText(mem.gender);
        jTextField7.setText(String.valueOf(mem.getWeight()));
        jTextField6.setText(String.valueOf(mem.getHeight()));
        jTextField5.setText(mem.gettype());
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 107, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("gender ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 107, 48));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("height");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 107, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("weight");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 107, 44));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("type");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 107, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 107, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 107, 54));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.setText("s");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 101, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.setText("s");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 101, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setText("s");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 101, -1));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField7.setText("s");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 101, -1));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField6.setText("s");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 101, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField5.setText("s");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 101, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setText("s");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 101, -1));

        jButton2.setText("next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 120, 50));

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 120, 50));

        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 750, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\essam\\Documents\\NetBeansProjects\\JavaApplication3\\front_end\\member in.jpg")); // NOI18N
        jLabel5.setText(" ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 720, 770));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        i++;
        display_mem(  admin.admin_empid.get(emp_id).mem_id.get(i),emp_id);
      
        if (  admin.admin_empid.get(emp_id).mem_id.size()-1<=i){
            jButton2.setVisible(false);
           
            
        }
         if (  admin.admin_empid.get(emp_id).mem_id.size()-1<i){
            jButton2.setVisible(true);
           
            
        }
        if(i-1>=0){
            jButton1.setVisible(true);
       }
       if (i-1<0){
            jButton1.setVisible(false );
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        i--;
        display_mem(  admin.admin_empid.get(emp_id).mem_id.get(i),emp_id);
        if (  admin.admin_empid.get(emp_id).mem_id.size()-1>=i){
            jButton2.setVisible(true);
            
        }
        if (  admin.admin_empid.get(emp_id).mem_id.size()-1<=i){
            jButton2.setVisible(false);
            
        }
       if(i-1>=0){
            jButton1.setVisible(true);
       }
       if (i-1<0){
            jButton1.setVisible(false );
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                            System.out.println("alo");

                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(display_member_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display_member_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display_member_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display_member_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new display_member_s().setVisible(true);
                       

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
