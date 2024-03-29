package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
/**
 *
 * @author PS19229 - TRANHOANGTHUYVAN
 * meo meo meo meo meo
 */
public class HelloForm extends javax.swing.JFrame {
    ArrayList<String> list = new ArrayList<>();
    int a = 0;
    /** Creates new form HelloForm */
    public HelloForm() {
        initComponents();
        ImageIcon i = new ImageIcon(getClass().getResource("/main/j_gif.gif"));
//        ImageIcon i = new ImageIcon("src/main/1604829.jpg");
//        System.out.println(new File("src/main/1604829.jpg").getAbsolutePath());
        Image scaled = i.getImage().getScaledInstance(lblMain.getWidth(), lblMain.getHeight(),Image.SCALE_REPLICATE);
        lblMain.setIcon(new ImageIcon(scaled));
//        lblSub.setOpaque(false);
//        lblSub.setText("<html><b>mama</b></html>");
        lblSub.setText("aa\nbbb\ncc");
//        lblSub.add(new JLabel("mel"));
        JLabel s = new JLabel("");
        s.setText("mellll");
        s.setForeground(Color.red);
        s.setPreferredSize(new Dimension(101,101));
        setActionListenerForCheck();
//        this.getContentPane().setForecolor(Color.BLACK);

//        setLayout(new GroupLayout(this));
//        pack();
//        autoClosed(0);
        
//        lblMain.setIcon(i);
    }
    public void showInSub() {
        StringBuilder s = new StringBuilder();
        for(String i : list) {
            s.append(i).append("<br>");
        }
        lblSub.setText(String.format("<html>%s</html>", s.toString()));
    }
    
    public void addToList(String item) {
        list.add(item);
    }
    
    public void removeFromList(String text) {
//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            if(iterator.next().equals(text)) {
//                list.remove(text);
//                break;
//            }
//        }
                list.remove(text);
    }
      
    public void setActionListenerForCheck() {

        chkApple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox c = (JCheckBox) e.getSource();
                if(c.isSelected()) addToList(c.getText());
                else removeFromList(c.getText());
                showInSub();
               }
           });
    }
    public void autoClosed(int delay) {
        if(delay == 0) return;
        new Timer(delay,(e) -> System.exit(0)).start();
    }
        
    public JLabel smallText(String text) {
        return new JLabel(String.format("<html><b>%s</b></html>", text).toString());
    }
    class HelpPanel extends JPanel {

    String prefsFileAsString = getClass().getResource("/main/1604829.jpg").toString();
//    {
//        System.out.println("inside block");
//        prefsFileAsString = prefsFileAsString.replaceAll("file:", "");
//    }
    String prefsImgTag = "<img src=" + prefsFileAsString + " width = 100 />";
    
    String htmlContent = "<html><p>Foo bar baz</p><p>"+prefsImgTag+"<span>☞☞☞</span></p></html>";
    

    public HelpPanel() {
        setup();
        System.out.println(prefsFileAsString+"\n"+prefsImgTag);
    }
    public void setup() {
        Dimension desiredSize = new Dimension(500, 300);
        JEditorPane helpPane = new JEditorPane("text/html", htmlContent);
        helpPane.setEditable(false);
        helpPane.setMinimumSize(desiredSize);
        helpPane.setPreferredSize(desiredSize);
        var scrollPane = new JScrollPane(helpPane);
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
        
    }
    
    

}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMain = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        chkApple = new javax.swing.JCheckBox();
        chkLemon = new javax.swing.JCheckBox();
        chkBanana = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSub.setBackground(new java.awt.Color(255, 153, 204));
        lblSub.setOpaque(true);

        chkApple.setText("Apple");
        chkApple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkAppleKeyPressed(evt);
            }
        });

        chkLemon.setText("Lemon");
        chkLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLemonActionPerformed(evt);
            }
        });

        chkBanana.setText("Banana");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkBanana)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkApple)
                                .addComponent(chkLemon, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkApple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkLemon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBanana)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLemonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLemonActionPerformed

    private void chkAppleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkAppleKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_A) {
            
        }
    }//GEN-LAST:event_chkAppleKeyPressed

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
            java.util.logging.Logger.getLogger(HelloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelloForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            HelloForm f = new HelloForm();
            public void run() {
//                f.setVisible(false);
                f.setVisible(true);
//                JOptionPane.showMessageDialog(f, f.new HelpPanel());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkApple;
    private javax.swing.JCheckBox chkBanana;
    private javax.swing.JCheckBox chkLemon;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblSub;
    // End of variables declaration//GEN-END:variables

}
