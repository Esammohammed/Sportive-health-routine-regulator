
import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author essam
 */
public class ideal_weight_calc extends javax.swing.JFrame {

    
    public ideal_weight_calc() {
        initComponents();
    }
        public ideal_weight_calc(member mem ) {
             initComponents();
            System.out.println(mem.getWeight());
            double bmi = mem.getWeight() /(mem.getheight()*mem.getheight());
           
           bmi = BigDecimal.valueOf(bmi)
    .setScale(3, RoundingMode.HALF_UP)
    .doubleValue();
            jLabel17.setText(String.valueOf(mem.getWeight()));
            jLabel18.setText(String.valueOf(mem.getheight()));
           
            
            
            jLabel13.setText(Double. toString(bmi));
            jLabel12.setText("18.5 to 24.9");
            //perfect 
            if (bmi>=18.5&& bmi<=24.9){
               jLabel14.setText("healthy weight");
                jTextField1.setText("you have a perfect weight , you should do exercise to keep your health");
            }
            //underweight
            else if (bmi<18.5){
                jLabel14.setText("underweight");
                jTextField1.setText("Being underweight could be a sign you're not eating enough or you may be ill"
                        +  
                       "\n \t advices\n"+
                        "Adding snacks. High-protein and whole-grain carbohydrate snacks can help a person gain weight." +
"Eating several small meals a day." +
"Incorporating additional foods. A person can add calorie-dense food sources to their existing diet" +
"avoiding empty calories. Eating high-calorie foods may cause a person to gain weight .");
            }
                    //overweight 
            else {
                 jLabel14.setText("overweight");
                 jTextField1.setText("Overweight and obesity are defined as abnormal or excessive fat accumulation \n \t advices \n limit energy intake from total fats and sugars" +
"increase consumption of fruit and vegetables, as well as legumes, whole grains and nuts; and " +
"engage in regular physical activity (60 minutes a day for children and 150 minutes spread through the week for adults).");
            }
           

            
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setEditable(false);
        jLabel17.setBackground(null);
        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("jTextField1");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 218, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("height");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 162, 28));

        jLabel12.setEditable(false);
        jLabel12.setBackground(null);
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("jTextField1");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 218, -1));

        jLabel18.setEditable(false);
        jLabel18.setBackground(null);
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("jTextField1");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 218, -1));

        jLabel14.setEditable(false);
        jLabel14.setBackground(null);
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setText("jTextField1");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 218, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("case ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 162, 28));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("BMI");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 162, 28));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("ideal weight ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 162, 28));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("weight");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 162, 28));

        jLabel13.setEditable(false);
        jLabel13.setBackground(null);
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("jTextField1");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 218, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(null);
        jTextField1.setColumns(20);
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField1.setLineWrap(true);
        jTextField1.setRows(9);
        jTextField1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextField1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 460, 250));

        jButton3.setBackground(new java.awt.Color(59, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, 108, 49));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\essam\\Documents\\NetBeansProjects\\JavaApplication3\\front_end\\bmiii.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 350, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\essam\\Documents\\NetBeansProjects\\JavaApplication3\\front_end\\temp.jpg")); // NOI18N
        jLabel1.setText(" ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 780));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ideal_weight_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ideal_weight_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ideal_weight_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ideal_weight_calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ideal_weight_calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField jLabel12;
    private javax.swing.JTextField jLabel13;
    private javax.swing.JTextField jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JTextField jLabel17;
    private javax.swing.JTextField jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    // End of variables declaration//GEN-END:variables
}
