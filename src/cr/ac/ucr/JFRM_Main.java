package cr.ac.ucr;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Label;
import java.awt.Panel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Justin
 */
public class JFRM_Main extends javax.swing.JFrame {
    Student[] arrayStudents; 
    
    Person student;
    
    int cont;
    public JFRM_Main() {
        initComponents();
        
        cont = 0;
        
        arrayStudents = new Student[10];
        
        student = new Student();
        
        //fills the array with null in all positions
        for(int i = 0; i < arrayStudents.length; i++) arrayStudents[i] = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AddPerson_btn = new javax.swing.JButton();
        SearchPerson_btn = new javax.swing.JButton();
        ModifyPerson_btn = new javax.swing.JButton();
        DeletePerson_btn = new javax.swing.JButton();
        ModifyPerson_btn1 = new javax.swing.JButton();
        Exit_btn = new javax.swing.JButton();
        SpecificPosition_btn = new javax.swing.JButton();
        AvailablePositions_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Manager App");

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel1.setText("Welcome to the Student Manager Application");

        jLabel2.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("What would you like to do?");

        AddPerson_btn.setText("Add Student");
        AddPerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddPerson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPerson_btnActionPerformed(evt);
            }
        });

        SearchPerson_btn.setText("Search Student");
        SearchPerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ModifyPerson_btn.setText("Modify Student");
        ModifyPerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DeletePerson_btn.setText("Delete Student");
        DeletePerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ModifyPerson_btn1.setText("Show Saved Students");
        ModifyPerson_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Exit_btn.setText("Exit!");
        Exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btnActionPerformed(evt);
            }
        });

        SpecificPosition_btn.setText("Add Student in a Specific Position");
        SpecificPosition_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AvailablePositions_btn.setText("available Positions");
        AvailablePositions_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AvailablePositions_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailablePositions_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpecificPosition_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(ModifyPerson_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddPerson_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModifyPerson_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchPerson_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DeletePerson_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AvailablePositions_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPerson_btn)
                    .addComponent(SearchPerson_btn))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyPerson_btn)
                    .addComponent(DeletePerson_btn))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecificPosition_btn)
                    .addComponent(AvailablePositions_btn))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyPerson_btn1)
                    .addComponent(Exit_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_btnActionPerformed
        this.dispose();
        //Shows all students
        for(int i = 0; i < arrayStudents.length; i++){
            if(!(arrayStudents[i] == null)) JOptionPane.showMessageDialog(this, arrayStudents[i].toString());
        }
        JOptionPane.showMessageDialog(this, "Closing");
        System.exit(0);
    }//GEN-LAST:event_Exit_btnActionPerformed

    private void AddPerson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPerson_btnActionPerformed
        //Hi, my original idea here was to make a JFrame apart of this one that is the main to let the user register a new student with their own Combo box,
        //but i wasn't able to sent the object student to the array in my main class, so i find out you can put a CBX in a JOptionPane, so that is what i did.
        String name = "";
        String ID = "";
        int age = 0;
        String[] ageArray = new String[101];
        
        //fills the age array
        for(int i = 0; i < ageArray.length; i++) ageArray[i] = String.valueOf(i);
        //creates the combobox 
        JComboBox<String> age_cbx = new JComboBox<>(ageArray);
        
        
        //creates a panel whre is contained the cbx
        Panel panel = new Panel();
        panel.add(new Label("Select the age of the Student"));
        panel.add(age_cbx);
        
        name = JOptionPane.showInputDialog(this, "Enter the Full Name of the Student");
        ID = JOptionPane.showInputDialog(this, "Enter the ID of the Student");
        
        //creates the JOptionPane where is contained the panel
        JOptionPane.showConfirmDialog(this, 
                panel, //adds the panel
                "Select an option", //title of the JOptionPane
                JOptionPane.OK_CANCEL_OPTION, // adds the buttons "Ok" and "Cancel"
                JOptionPane.INFORMATION_MESSAGE //we are telling the JOptionPane to show only the text, not include the icon that usually comes with JOptionPane
                );
        
        //getting the value selected
        age = Integer.parseInt(age_cbx.getSelectedItem().toString());
        
        student = new Student(name, ID, age);
        arrayStudents[cont] = (Student) student;
        cont++;
        
        if(cont >= 10){
            //made this  function public so i can reutilize the code from the exit button, becouse it's going to be the same thing
            Exit_btnActionPerformed(evt);
        }
    }//GEN-LAST:event_AddPerson_btnActionPerformed

    private void AvailablePositions_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailablePositions_btnActionPerformed
        String availablePosition = "Available Positions: \n";
        for(int i = 0; i < arrayStudents.length; i++){
            if(arrayStudents[i] == null) availablePosition += (i+1) + "\n";
        }
        JOptionPane.showMessageDialog(this, availablePosition);
    }//GEN-LAST:event_AvailablePositions_btnActionPerformed

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
            java.util.logging.Logger.getLogger(JFRM_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRM_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRM_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRM_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatMacDarkLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JFRM_Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                new JFRM_Main().setVisible(true);
                
            }
        });
    }
    
    public void openJFRM(JFrame frame){
        this.setVisible(false);
        frame.setVisible(true);
    }
    int itemCount = 0;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPerson_btn;
    private javax.swing.JButton AvailablePositions_btn;
    private javax.swing.JButton DeletePerson_btn;
    public javax.swing.JButton Exit_btn;
    private javax.swing.JButton ModifyPerson_btn;
    private javax.swing.JButton ModifyPerson_btn1;
    private javax.swing.JButton SearchPerson_btn;
    private javax.swing.JButton SpecificPosition_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
