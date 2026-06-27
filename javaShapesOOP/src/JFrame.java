package javaapplication1;

import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame.class.getName());

    
    public JFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("WELCOME! Shapes Program");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("This program calculates the total area of shapes (Circle & Cube).");

        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton1.setText("OK");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel3.setText("Enter number of shapes :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    // when button pressed
    Drawable []arr;
    double sum = 0;

    private boolean isPositiveInteger(String s) {
        return s.matches("\\d+") && Integer.parseInt(s) > 0;
    }

    private boolean isPositiveNumber(String s) {
        try {
            return Double.parseDouble(s.trim()) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        sum = 0;
        String s = jTextField1.getText();
        if (!isPositiveInteger(s)) {
            JOptionPane.showMessageDialog(null, "put positive number!");
            return; 
        }
        
        int n = Integer.parseInt(jTextField1.getText());
        arr = new Drawable[n];
        
        for (int i=0 ; i<n ; i++) {
            
            String type = JOptionPane.showInputDialog(null, "Enter the type of shape (Circle or Cube)");
            if (type == null) {
                return;
            }
            String len = JOptionPane.showInputDialog(null, "Enter the lenth (raduis or side)");
            if (len == null) {
                return;
            }
            
            if (!isPositiveNumber(len)) {
                 JOptionPane.showMessageDialog(null, "put positive number!");
                return; 
            }
        
            double lenth = Double.parseDouble(len);
                        
            type = type.toLowerCase();
            switch(type) {
                case "circle" -> {
                    arr[i] = new Circle(lenth);
                    sum += ((Circle)arr[i]).getArea();
                }
                    
                case "cube" -> {
                    arr[i] = new Cube(lenth);
                    sum += ((Cube)arr[i]).getArea();
                }
                
                default -> {
                    JOptionPane.showMessageDialog(null, "Invalid shape type: " + type);
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Sum of shapes: " + sum);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new JFrame().setVisible(true));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
