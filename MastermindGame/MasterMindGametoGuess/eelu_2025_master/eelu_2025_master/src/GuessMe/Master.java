
package GuessMe;

import java.awt.Color;
import java.util.*;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

 public class Master extends javax.swing.JFrame {
 
    Integer [] ar = new Integer [4];
    int [][] trying = new int [10][4];

    public Master() {
        initComponents();
    
        Random rd = new Random();
        
        ArrayList <Integer> list= new ArrayList <Integer>();
        
        int w = 0;
        while (true)
        {
            int u = rd.nextInt(6);
            if (! list.contains(u))
            {
                list.add(u);
                w++;
                if (w == 4)
                {
                    break;
                }
            }
        }
        ar =list.toArray(ar);
        System.out.println(Arrays.toString(ar));
   
    }

    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setText("                                    MasterMind Games, [just Guess me(•‿•)] ");
        jLabel1.setForeground(new Color(0xa00d23));
       

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Red", "Green", "Blue", "Black", "Orange" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Red", "Green", "Blue", "Black", "Orange" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Red", "Green", "Blue", "Black", "Orange" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "White", "Red", "Green", "Blue", "Black", "Orange" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jTextField1.setText("                  ");

        jTextField2.setText("                ");

        jTextField3.setText("                 ");

        jTextField4.setText("                     ");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jCheckBox1.setText("Correct");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jCheckBox2.setText("Correct but not position");
        jCheckBox2.setEnabled(false);

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jCheckBox3.setText("Correct");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jCheckBox4.setText("Correct but not position");
        jCheckBox4.setToolTipText("");
        jCheckBox4.setEnabled(false);

        jCheckBox5.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jCheckBox5.setText("Correct");
        jCheckBox5.setEnabled(false);

        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jCheckBox6.setText("Correct but not position");
        jCheckBox6.setEnabled(false);

        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jCheckBox7.setText("Correct");
        jCheckBox7.setEnabled(false);

        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCheckBox8.setText("Correct but not position");
        jCheckBox8.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jButton1.setText("Submit");
        jButton1.setBackground(new Color(0xf4a3ab));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jButton2.setText("New Game");
        jButton2.setBackground(new Color(0xc7a3da));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setText("Come on! \nYou can do it :)");
        jLabel2.setName(""); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        getContentPane().setBackground(new Color(0x9fb0fa));
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1))
                                            .addComponent(jCheckBox2))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField2))
                                            .addComponent(jCheckBox3)
                                            .addComponent(jCheckBox4))
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(98, 98, 98)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3))
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
        );

        pack();
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        switch (jComboBox1.getSelectedIndex())
        {
            case 0:
                 jTextField1.setBackground(Color.WHITE);
                break;
            case 1:
                 jTextField1.setBackground(Color.RED);;
                break;
            case 2:
                jTextField1.setBackground(Color.GREEN);
                break;
            case 3:
                 jTextField1.setBackground(Color.BLUE);
                break;
            case 4:
                 jTextField1.setBackground(Color.BLACK);
                break;
            case 5:
                jTextField1.setBackground(Color.ORANGE);
                break;
        }
    }

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        
switch (jComboBox2.getSelectedIndex())
        {
            case 0:
                 jTextField2.setBackground(Color.WHITE);
                break;
            case 1:
                 jTextField2.setBackground(Color.RED);;
                break;
            case 2:
                jTextField2.setBackground(Color.GREEN);
                break;
            case 3:
                 jTextField2.setBackground(Color.BLUE);
                break;
            case 4:
                 jTextField2.setBackground(Color.BLACK);
                break;
            case 5:
                jTextField2.setBackground(Color.ORANGE);
                break;
        }
    }

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {
    
        switch (jComboBox3.getSelectedIndex())
        {
            case 0:
                 jTextField3.setBackground(Color.WHITE);
                break;
            case 1:
                 jTextField3.setBackground(Color.RED);;
                break;
            case 2:
                jTextField3.setBackground(Color.GREEN);
                break;
            case 3:
                 jTextField3.setBackground(Color.BLUE);
                break;
            case 4:
                 jTextField3.setBackground(Color.BLACK);
                break;
            case 5:
                jTextField3.setBackground(Color.ORANGE);
                break;
        }
    }

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {
    
switch (jComboBox4.getSelectedIndex())
        {
            case 0:
                 jTextField4.setBackground(Color.WHITE);
                break;
            case 1:
                 jTextField4.setBackground(Color.RED);;
                break;
            case 2:
                jTextField4.setBackground(Color.GREEN);
                break;
            case 3:
                 jTextField4.setBackground(Color.BLUE);
                break;
            case 4:
                 jTextField4.setBackground(Color.BLACK);
                break;
            case 5:
                jTextField4.setBackground(Color.ORANGE);
                break;
        }
    }


    int t = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
 
        if (t == 10)
        {
         jLabel2.setText("Game Over , you used your "+t+"  tries");
         jButton1.setEnabled(false);
        }
        else
        {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        
        trying [t][0] =  jComboBox1.getSelectedIndex();
        trying [t][1] =  jComboBox2.getSelectedIndex();
        trying [t][2] =  jComboBox3.getSelectedIndex();
        trying [t][3] =  jComboBox4.getSelectedIndex();
        
        if (trying[t][0] == ar[0] && trying[t][1] == ar[1] && trying[t][2] == ar[2]
                && trying[t][3] == ar[3])
        { 
            jLabel2.setText("SuperHero!!!! , you success after "+(t+1)+"  Times");
            jButton1.setEnabled(false);
        }
        else 
        {
            if (trying [t][0] == ar[0])
            {
                jCheckBox1.setSelected(true);
            }
            else if ( (trying[t][0] == ar[1] || trying[t][0] == ar[2] || trying[t][0] == ar[3] ))
            {
                jCheckBox2.setSelected(true);
            }
            if (trying[t][1] == ar [1])
            {
                jCheckBox3.setSelected(true);
            }
            else if ( trying[t][1] == ar[0] || trying[t][1] == ar[2] || trying[t][1] == ar[3] )
            {
                jCheckBox4.setSelected(true);
            }
            if (trying[t][2] == ar[2])
            {
                jCheckBox5.setSelected(true);
            }
            else if (trying[t][2] == ar[0] || trying[t][2] == ar[1] || trying[t][2] == ar[3] )
            {
                jCheckBox6.setSelected(true);
            }
            if (trying [t][3] == ar[3])
            {
                jCheckBox7.setSelected(true);
            }
            else if (trying[t][3] == ar[0] || trying[t][3] == ar[1] || trying[t][3] == ar[2])                    
            {
                jCheckBox8.setSelected(true);
            }
        }
        t++;
        }

        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {


        t = 0;
        jLabel2.setText("Okey no worries Try again:(");
        jButton1.setEnabled(true);
                Random rd = new Random();
        
        ArrayList <Integer> list= new ArrayList <Integer>();
        
        int w = 0;
        while (true)
        {
            int u = rd.nextInt(6);
            if (! list.contains(u))
            {
                list.add(u);
                w++;
                if (w == 4)
                {
                    break;
                }
            }
        }
        ar =list.toArray(ar);
        System.out.println(Arrays.toString(ar));

    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master().setVisible(true);
              
            }
        });
    }

  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    
}
