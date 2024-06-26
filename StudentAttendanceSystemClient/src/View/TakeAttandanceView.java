/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Attendance;
import Model.Classs;
import Model.Student;
import Model.Studies;
import Services.AttendanceServices;
import Services.ClasssServices;
import Services.StudiesServices;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ZIPTECH LTD
 */
public class TakeAttandanceView extends javax.swing.JInternalFrame {

    /**
     * Creates new form TakeAttandanceView
     */
    public TakeAttandanceView() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchClassId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allEnrollements = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        searchClass = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        setedName = new javax.swing.JLabel();
        setedTeacher = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        classIDSeted = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        action = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Attendance");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setText("Searches");

        searchClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClassIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Class Name:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel6.setText("Class Id:");

        allEnrollements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "StudentID", "Names", "Present", "jj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allEnrollements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allEnrollementsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allEnrollements);
        if (allEnrollements.getColumnModel().getColumnCount() > 0) {
            allEnrollements.getColumnModel().getColumn(3).setCellEditor(null);
        }

        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        searchClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-search-24.png"))); // NOI18N
        searchClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClassActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-print-24.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setedName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        setedTeacher.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setText("Class Teacher:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-save-16.png"))); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        classIDSeted.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel9.setText("Class Id:");

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel10.setText("Action:");

        action.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(classIDSeted, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(49, 49, 49)
                                        .addComponent(searchClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(searchClass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(setedTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(setedName, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(44, 44, 44)
                                        .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 44, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(searchClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(searchClass))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(classIDSeted, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5))
                                    .addComponent(setedName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(setedTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(action, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void searchClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClassIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchClassIdActionPerformed

    private void allEnrollementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allEnrollementsMouseClicked
        int selectedRow = allEnrollements.getSelectedRow();
        DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
//
//        searchStudentId.setText(tbModel.getValueAt(selectedRow, 1).toString());
//        studentName.setText(tbModel.getValueAt(selectedRow, 2).toString());
//        searchClassId.setText(tbModel.getValueAt(selectedRow, 3).toString());
//        className.setText(tbModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_allEnrollementsMouseClicked

    private void searchClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClassActionPerformed
        if (searchClassId.getText().trim().isEmpty() || !searchClassId.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(this, "Enter Class Id\n Search by Id");
        } else {
            try {
                Date today = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDateStr = formatter.format(today);

                SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
                Date formattedDate = parser.parse(formattedDateStr);

                int theId = Integer.parseInt(searchClassId.getText());
                Registry theReg = LocateRegistry.getRegistry("127.0.0.1", 81);

                Classs cl = new Classs();
                cl.setClassId(theId);

                ClasssServices service = (ClasssServices) theReg.lookup("classs");
                Classs theClass = service.searchClasss(cl);

                if (theClass == null) {
                    JOptionPane.showMessageDialog(this, "Class Does not Exist");
                } else {
                    classIDSeted.setText(theClass.getClassId().toString());
                    setedName.setText(theClass.getName());
                    setedTeacher.setText(theClass.getTheTeacher().getNames());

                    DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
                    tbModel.setRowCount(0);
                    Attendance attd = new Attendance();
                    attd.setTheClass(cl);
                    attd.setDate(formattedDate);

                    AttendanceServices service1 = (AttendanceServices) theReg.lookup("attendance");
                    List<Attendance> theAtt = service1.searchAttByClassAndDate(attd);

                    if (theAtt.size() != 0) {
                        action.setText("Update Attendance");
                        for (Attendance att : theAtt) {
                            Integer id = att.getId();
                            Integer stId = att.getTheStudent().getStudentId();
                            String stNames = att.getTheStudent().getNames();
                            boolean attt = att.isAttendanded();

                            tbModel.addRow(new Object[]{
                                id, stId, stNames, attt, attt});
                        }
                    } else {
                        action.setText("Make Attendance");
                        Studies std = new Studies();
                        std.setTheClass(cl);
                        StudiesServices service2 = (StudiesServices) theReg.lookup("studies");
                        List<Studies> allStudies = service2.searchStudiesClass(std);

                        if (allStudies.size() != 0) {
                            for (Studies att : allStudies) {
                                Integer id = att.getId();
                                Integer stId = att.getTheStudent().getStudentId();
                                String stNames = att.getTheStudent().getNames();

                                tbModel.addRow(new Object[]{
                                    id, stId, stNames});
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Class Does not have enllored Students");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_searchClassActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            allEnrollements.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (classIDSeted.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Search first");
            } else {
                Date today = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String formattedDateStr = formatter.format(today);

                SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
                Date formattedDate = parser.parse(formattedDateStr);

                DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
                int rowCount = tbModel.getRowCount();
                int status = 0;
                for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {

                    Attendance attd = new Attendance();

//                    if (action.getText().equals("Update Attendance")) {
//                        attd.setId(Integer.parseInt(tbModel.getValueAt(rowIndex, 0).toString()));
//
//                        boolean isPresent = (Boolean) tbModel.getValueAt(rowIndex, 3) instanceof Boolean;
//                        attd.setAttendanded(isPresent);
//                    } else {
                        attd.setDate(formattedDate);
                        boolean isPresent = (Boolean) tbModel.getValueAt(rowIndex, 3) instanceof Boolean;
                        attd.setAttendanded(isPresent);

                        Student std = new Student();
                        std.setStudentId(Integer.parseInt(tbModel.getValueAt(rowIndex, 1).toString()));
                        attd.setTheStudent(std);

                        Classs cl = new Classs();
                        cl.setClassId(Integer.parseInt(classIDSeted.getText()));
                        attd.setTheClass(cl);
                    

                    Registry theReg = LocateRegistry.getRegistry("127.0.0.1", 81);
                    AttendanceServices service = (AttendanceServices) theReg.lookup("attendance");
                    Attendance attObj = service.saveAttendance(attd);

                    if (attObj != null) {
                        status++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Something Wrong");
                        break;
                    }
                }
                if (status == rowCount) {
                    JOptionPane.showMessageDialog(this, "Attendance complited");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTxtKeyReleased
        DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(tbModel);
        allEnrollements.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchTxt.getText()));
    }//GEN-LAST:event_searchTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel action;
    private javax.swing.JTable allEnrollements;
    private javax.swing.JLabel classIDSeted;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchClass;
    private javax.swing.JTextField searchClassId;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel setedName;
    private javax.swing.JLabel setedTeacher;
    // End of variables declaration//GEN-END:variables
}
