/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

/**
 *
 * @author oscar
 */
public class calculadoraGUI extends javax.swing.JFrame {

    private boolean flag2Controldata,
            flag4point,/*Flag to control that only can put one point for number*/
            flag4sgined,
            flag4operator,
            flag4start;
    /*flag to control de sign of the operating in turn*/ /* true = + / flase = -*/
    private String op1 = "", op2 = "";
    char operator;

    /**
     * Creates new form calculadoraGUI
     */
    public calculadoraGUI() {
        float testf = 9;
        String tests = String.valueOf(testf);
        System.out.println(tests);
        
        clearFlags();

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

        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Calculadora"); // NOI18N
        setResizable(false);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setToolTipText("");

        jPanel3.setLayout(new java.awt.GridLayout(4, 3));

        jButton1.setText("7");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setText("8");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setText("9");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.setText("6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.setText("1");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setText("2");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.setText("3");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.setText("+/-");
        jButton10.setToolTipText("");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel3.add(jButton10);

        jButton11.setText("0");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel3.add(jButton11);

        jButton12.setText(".");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel3.add(jButton12);

        jPanel4.setLayout(new java.awt.GridLayout(3, 2));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("*");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel4.add(jButton13);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("/");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel4.add(jButton14);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setText("+");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel4.add(jButton15);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setText("-");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel4.add(jButton16);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setText("^");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel4.add(jButton18);

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setText("=");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jPanel4.add(jButton19);

        jButton17.setBackground(new java.awt.Color(180, 40, 40));
        jButton17.setText("Clear");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton17)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean PrintinTextField(String character) {
        boolean data2return = false;
        System.out.println("Pressed: " + (character));
        jTextField1.setText(jTextField1.getText() + (character));
        data2return = true;
        return data2return;
    }

    private boolean PrintinTextField(String character, String result) {
        boolean data2return = false;
        System.out.println("Pressed: " + (character));
        jTextField1.setText(jTextField1.getText() + (result));
        data2return = true;
        return data2return;
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        /*Number 7*/
        // TODO add your handling code here:
        PrintinTextField(jButton1.getText());
        storageData(jButton1.getText());
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton2.getText());
        storageData(jButton2.getText());
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton3.getText());
        storageData(jButton3.getText());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton4.getText());
        storageData(jButton4.getText());
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton5.getText());
        storageData(jButton5.getText());
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton6.getText());
        storageData(jButton6.getText());
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton7.getText());
        storageData(jButton7.getText());
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton8.getText());
        storageData(jButton8.getText());
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton9.getText());
        storageData(jButton9.getText());
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        if (flag4sgined) {
            PrintSigned("+");
            storageData("+");
            flag4sgined = false;
        } else {
            PrintSigned("-");
            storageData("-");
            flag4sgined = true;
        }

    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        PrintinTextField(jButton11.getText());
        storageData(jButton11.getText());
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked

        // TODO add your handling code here:
        operator = '*';
        flag4point = true;
        if (flag4operator) {
            if (flag4start) {
                flag4start = false;
                op1=jTextField1.getText();
              
            } 
            Process.Convert2numberTheOperand(op1, flag2Controldata);
            flag2Controldata = false;
            PrintinTextField(jButton13.getText());
            flag4operator = false;
        } else {
            ChangeOperator(jButton13.getText());
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        operator = '/';
        flag4point = true;

        if (flag4operator) {
            if (flag4start) {
                flag4start = false;
                op1=jTextField1.getText();
              
            } 
            Process.Convert2numberTheOperand(op1, flag2Controldata);
            flag2Controldata = false;
            PrintinTextField(jButton14.getText());
            flag4operator = false;
        } else {
            ChangeOperator(jButton14.getText());
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        operator = '+';
        flag4point = true;
        if (flag4operator) {
            if (flag4start) {
                flag4start = false;
                op1=jTextField1.getText();
              
            } 
            Process.Convert2numberTheOperand(op1, flag2Controldata);
            
            flag2Controldata = false;
            PrintinTextField(jButton15.getText());
            flag4operator = false;

        } else {
            ChangeOperator(jButton15.getText());
        }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        operator = '-';
        flag4point = true;
        if (flag4operator) {
            if (flag4start) {
                flag4start = false;
                op1=jTextField1.getText();
              
            } 
            Process.Convert2numberTheOperand(op1, flag2Controldata);
            flag2Controldata = false;
            PrintinTextField(jButton16.getText());
            flag4operator = false;
        } else {
            ChangeOperator(jButton16.getText());
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        operator = '^';
        flag4point = true;
        if (flag4operator) {
            if (flag4start) {
                flag4start = false;
                op1=jTextField1.getText();
              
            } 
            Process.Convert2numberTheOperand(op1, flag2Controldata);
            flag2Controldata = false;
            PrintinTextField(jButton18.getText());
            flag4operator = false;
        } else {
            ChangeOperator(jButton18.getText());
        }
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here: button "="
        Process.Convert2numberTheOperand(op2, flag2Controldata);
        clearFlags();
        flag4start = true;
        clearTextField();
        PrintinTextField(jButton19.getText(), (Process.makeoperation(operator)));
        op1 = "";
        op2 = "";


    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
        clearTextField();
        op1 = "";
        op2 = "";
        System.out.println("Pressed: clear");
        clearFlags();

    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        if (flag4point) {
            flag4point = false;
            storageData(jButton12.getText());
            PrintinTextField(jButton12.getText());

        }
    }//GEN-LAST:event_jButton12MouseClicked

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
            java.util.logging.Logger.getLogger(calculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void clearTextField() {
        jTextField1.setText("");

    }

    private void ChangeOperator(String string) {
        String temp1 = jTextField1.getText();
        int length = temp1.length() - 1;
        String temp;
        temp = jTextField1.getText().substring(0, length);
        jTextField1.setText(op1 + string);
        System.out.println("Pressed: " + string);
    }

    private void PrintSigned(String string) {
        // funcion para cambiar el signo al dato qeu se esta escribiendo
        String searchsign;
        if (flag2Controldata) {
            searchsign = jTextField1.getText().substring(0, 1);
            if (("-".equals(searchsign)) || ("+".equals(searchsign))) {
                jTextField1.setText(string + jTextField1.getText().substring(1, (jTextField1.getText().length())));
            } else {
                jTextField1.setText(string + jTextField1.getText());
            }
        } else {
            int sizeoffirstpart = op1.length() + 1,
                    lenght = jTextField1.getText().length();
            if (sizeoffirstpart == lenght) {
                jTextField1.setText(op1 + operator + string);
            } else {

                searchsign = jTextField1.getText().substring((sizeoffirstpart));
                System.out.println(searchsign);
                if (("-".equals(searchsign)) || ("+".equals(searchsign))) {
                    if ((lenght - sizeoffirstpart) == 1) {
                        jTextField1.setText(op1 + operator + string);
                    } else {
                        jTextField1.setText(op1 + operator + string + jTextField1.getText().substring((sizeoffirstpart), (jTextField1.getText().length())));
                    }
                } else {
                    searchsign = op1;
                    searchsign += operator;
                    searchsign += string;
                    try {
                        searchsign += jTextField1.getText((sizeoffirstpart), (lenght - sizeoffirstpart));
                    } catch (BadLocationException ex) {
                        Logger.getLogger(calculadoraGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    jTextField1.setText(searchsign);
                }
            }

        }

    }

    private void clearFlags() {
        flag2Controldata = true;
        flag4point = true;
        flag4sgined = true;
        flag4operator = true;
        //flag4start = true;
    }

    private void storageData(String character) {

        if (flag2Controldata) {
            if (("+".equals(character)) || ("-".equals(character))) 
            {
                if (("+".equals(op1.substring(0, 1))) || ("-".equals(op1.substring(0, 1)))) 
                {
                    op1 = character + op1.substring(1,op1.length());
                } 
                else 
                {
                    op1 = character + op1;
                }

            } else {
                if ("".equals(op1)) {
                    op1 = character;
                } else {
                    op1 += character;
                }
            }
            System.out.println("op1 data: " + op1);
        } 
        else
        {
            if (("+".equals(character)) || ("-".equals(character))) 
            {
                 if (("+".equals(op2.substring(0,1))) || ("-".equals(op2.substring(0,1)))) 
                {
                    op2 = character + op2.substring(1,op2.length());
                } 
                else 
                {
                    op2 = character + op2;
                }
                
            } 
            else 
            {
                if ("".equals(op2)) {
                    op2 = character;
                } else {
                    op2 += character;
                }
                System.out.println("op2 data: " + op2);
            }
        }

    }
}
