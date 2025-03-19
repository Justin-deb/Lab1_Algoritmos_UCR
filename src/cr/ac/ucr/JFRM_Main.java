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
        for (int i = 0; i < arrayStudents.length; i++) {
            arrayStudents[i] = null;
        }
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
        SavedStudents_btn = new javax.swing.JButton();
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
        SearchPerson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPerson_btnActionPerformed(evt);
            }
        });

        ModifyPerson_btn.setText("Modify Student");
        ModifyPerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModifyPerson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyPerson_btnActionPerformed(evt);
            }
        });

        DeletePerson_btn.setText("Delete Student");
        DeletePerson_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeletePerson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePerson_btnActionPerformed(evt);
            }
        });

        SavedStudents_btn.setText("Show Saved Students");
        SavedStudents_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SavedStudents_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavedStudents_btnActionPerformed(evt);
            }
        });

        Exit_btn.setText("Exit!");
        Exit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_btnActionPerformed(evt);
            }
        });

        SpecificPosition_btn.setText("Add Student in a Specific Position");
        SpecificPosition_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SpecificPosition_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecificPosition_btnActionPerformed(evt);
            }
        });

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
                            .addComponent(SavedStudents_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(SavedStudents_btn)
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
        for (int i = 0; i < arrayStudents.length; i++) {
            if (!(arrayStudents[i] == null)) {
                JOptionPane.showMessageDialog(this, arrayStudents[i].toString());
            }
        }
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
        for (int i = 0; i < ageArray.length; i++) {
            ageArray[i] = String.valueOf(i);
        }
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
                JOptionPane.PLAIN_MESSAGE //we are telling the JOptionPane to show only the text, not include the icon that usually comes with JOptionPane
        );

        //getting the value selected
        age = Integer.parseInt(age_cbx.getSelectedItem().toString());

        if (name == null || name.isBlank() || ID == null || ID.isBlank() || age == 0) {
            JOptionPane.showMessageDialog(this, "ERROR: Make sure all data is correct", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            student = new Student(name, ID, age);

            for (int i = 0; i < arrayStudents.length; i++) {
                if (arrayStudents[i] == null) {
                    arrayStudents[i] = (Student) student;
                    break;
                }
            }

            JOptionPane.showMessageDialog(this, "Student added successfully");
        }

        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] == null) {
                return;
            }
        }
        //made this function public so i can reutilize the code from the exit button, because both do the same thing
        Exit_btnActionPerformed(evt);
    }//GEN-LAST:event_AddPerson_btnActionPerformed

    private void AvailablePositions_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailablePositions_btnActionPerformed
        String availablePosition = "Available Positions: \n";
        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] == null) {
                availablePosition += (i + 1) + "\n";
            }
        }
        JOptionPane.showMessageDialog(this, availablePosition);
    }//GEN-LAST:event_AvailablePositions_btnActionPerformed

    private void SavedStudents_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavedStudents_btnActionPerformed
        String savedStudents = "";
        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] != null) {
                savedStudents += arrayStudents[i].toString() + "\n";
            }
        }
        if (savedStudents.isBlank())
            JOptionPane.showMessageDialog(this, "ERROR: There are no saved students", "ERROR", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, savedStudents);
    }//GEN-LAST:event_SavedStudents_btnActionPerformed

    private void SearchPerson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPerson_btnActionPerformed
        String ID = JOptionPane.showInputDialog(this, "Enter the ID of the student");

        try {
            ID = ID.trim();
            for (int i = 0; i < arrayStudents.length; i++) {
                if (arrayStudents[i].getID().equals(ID)) {
                    JOptionPane.showMessageDialog(this, arrayStudents[i].toString());
                    return;
                }
            }
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "ERROR: The Student with that ID was not founded", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_SearchPerson_btnActionPerformed

    private void ModifyPerson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyPerson_btnActionPerformed
        String ID = JOptionPane.showInputDialog(this, "Enter the ID of the student to modify");
        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] != null && (arrayStudents[i].getID().equals(ID))) {
                String name = JOptionPane.showInputDialog(this, "Enter the new Name");

                String NewID = JOptionPane.showInputDialog(this, "Enter the new ID");

                int age = ComboboxPanel("Select the new Age");

                if (name == null || name.isBlank() || NewID == null || ID.isBlank() || age == 0) {
                    JOptionPane.showMessageDialog(this, "ERROR: Make sure all data is correct", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                arrayStudents[i] = new Student(name, NewID, age);

                JOptionPane.showMessageDialog(this, "Student Modified Successfully");
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "ERROR: The Student with that ID was not founded ", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_ModifyPerson_btnActionPerformed

    private void DeletePerson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePerson_btnActionPerformed
        String ID = JOptionPane.showInputDialog("Enter the ID of the student to eliminate from the system");
        for (int i = 0; i < arrayStudents.length; i++) {
            if (arrayStudents[i] != null && (arrayStudents[i].getID().equals(ID))) {

                arrayStudents[i] = null;

                JOptionPane.showMessageDialog(this, "Student Erased Successfully");
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "ERROR: The Student with that ID was not founded ", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_DeletePerson_btnActionPerformed

    private void SpecificPosition_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecificPosition_btnActionPerformed
        int index = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the position where you want to add te new Student"));
        if (index > 10 || index <= 0) {
            JOptionPane.showMessageDialog(this, "ERROR: the position " + index + " is not available", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (arrayStudents[index - 1] != null) {
            JOptionPane.showMessageDialog(this, "ERROR: That position is already occupied by another student", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String name = JOptionPane.showInputDialog(this, "Enter the Name");

            String ID = JOptionPane.showInputDialog(this, "Enter the ID");

            int age = ComboboxPanel("Select the Age");
            
            if (name == null || name.isBlank() || ID == null || ID.isBlank() || age == 0) {
                JOptionPane.showMessageDialog(this, "ERROR: Make sure all data is correct", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            arrayStudents[index - 1] = new Student(name, ID, age);
            
            JOptionPane.showMessageDialog(this, "Student added successfully");

        }
    }//GEN-LAST:event_SpecificPosition_btnActionPerformed

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

    public int ComboboxPanel(String textPanel) {
        int age = 0;
        String[] ageArray = new String[101];

        for (int i = 0; i < ageArray.length; i++) {
            ageArray[i] = String.valueOf(i);
        }

        JComboBox<String> age_cbx = new JComboBox<>(ageArray);

        Panel panel = new Panel();
        panel.add(new Label(textPanel));
        panel.add(age_cbx);

        JOptionPane.showConfirmDialog(this,
                panel,
                "Select an option",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        return age = Integer.parseInt(age_cbx.getSelectedItem().toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPerson_btn;
    private javax.swing.JButton AvailablePositions_btn;
    private javax.swing.JButton DeletePerson_btn;
    public javax.swing.JButton Exit_btn;
    private javax.swing.JButton ModifyPerson_btn;
    private javax.swing.JButton SavedStudents_btn;
    private javax.swing.JButton SearchPerson_btn;
    private javax.swing.JButton SpecificPosition_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
