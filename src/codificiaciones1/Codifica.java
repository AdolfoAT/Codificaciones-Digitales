/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codificiaciones1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */

public class Codifica extends javax.swing.JFrame {
    
    
    /** Creates new form Codif1 */
    public Codifica() {
        initComponents();
        this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        origen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Grafico = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Codificaciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la palabra a codificar ");

        origen.setName("origen"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("8 Caracteres máximo");

        Grafico.setBackground(java.awt.Color.white);
        Grafico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        Grafico.setPreferredSize(new java.awt.Dimension(600, 200));

        javax.swing.GroupLayout GraficoLayout = new javax.swing.GroupLayout(Grafico);
        Grafico.setLayout(GraficoLayout);
        GraficoLayout.setHorizontalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        GraficoLayout.setVerticalGroup(
            GraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jButton5.setText("Gráfica 1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Gráfica 2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Gráfica 3");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Gráfica 4");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Gráfica 5");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Gráfica 6");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Gráfica 7");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Gráfica 8");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("Limpiar Gráfica\n");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Para poder visualizar la gráfica de clic primero en \"limpiar gráfica\" y despues clic en la gráfica que deseé visualizar  ");

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("CopyRight ®");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(Grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton5)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10)
                                    .addComponent(jButton11)
                                    .addComponent(jButton12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jButton13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)))
                .addComponent(jLabel3)
                .addContainerGap())
        );

        origen.getAccessibleContext().setAccessibleName("origen");

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void Limpiar()
{
    Graphics g=Grafico.getGraphics();
    Grafico.repaint();
}
    public void Calculos(int Grafica)
{
        Graphics g=Grafico.getGraphics();
        String origen1,numero,CC; 
        origen1=origen.getText();
        int val;
        int ab=20;
        int[] abAcum = new int[5];
        int prev = 0;
        int aux_bip=266;
        int x;
        for(int y=0;y<5;y++) {abAcum[y]=115;}
        char []C;
         x=origen1.charAt(Grafica);
            numero=Integer.toBinaryString(x);
            C = numero.toCharArray();
      Font myFont = new Font ("Arial",0, 12);
        g.setFont (myFont);
      for(int i=38;i<388;i+=70){
      g.setColor(Color.blue);
      g.drawLine(23,i,722,i);
      g.setColor(Color.red);
      g.drawString("+",98,i+20);
      g.drawString("0",98,i+40);
      g.drawString("-",98,i+60);
      g.drawLine(113,i+38,300,i+38);
    }
    g.setColor(Color.black);
    g.drawString("Caracter: ", 10, 15);
    g.drawString(String.valueOf(origen1.charAt(Grafica)),60, 15);
    g.drawString("Valor Binario ---> ",20,30);
    g.drawString("Unipolar",26,73);
    g.drawString("NRZ",38,88);
    g.drawString("Polar",28,143);
    g.drawString("NRZ-I",26,158);
    g.drawString("Unipolar",26,218);
    g.drawString("RZ",41,232);
    g.drawString("AMI - Bipolar",26,288);
    g.drawString("Manchester",27,353);
    g.drawString("Diferencial",33,368);
    g.drawLine(113,8,113,388);
    if(C.length < 8)
    {
      CC = '0' + String.valueOf(C);
    }
    else
    {
     CC = String.valueOf(C);
    }
        for(int u=0;u<8;u++){
          g.setColor(Color.gray);
          for(int q=14;q<=374;q+=12)
           g.drawLine(abAcum[0]+ab,q,abAcum[0]+ab,q+1);
            g.setColor(Color.black);
             g.drawString(""+CC.charAt(u),abAcum[0]+6,28);
              val = (int)(CC.charAt(u))-48;
                if(prev!=val){
                 g.drawLine(abAcum[0],56,abAcum[0],76); // para Unipolar NRZ
                  g.drawLine(abAcum[1],126,abAcum[1],166); // para Polar NRZ
      }
      else
            { g.drawLine(abAcum[4],336,abAcum[4],376); }// vertical divisora pulso anterior y actual manchester
       if(val==1){
        g.drawLine(abAcum[0],56,(abAcum[0]+=ab),56); // pulso alto para Unipolar NRZ
        g.drawLine(abAcum[1],166,(abAcum[1]+=ab),166); // pulso alto Polar NRZ
        g.drawLine(abAcum[2],196,abAcum[2],216); // vertical divisora pulso anterior y actual Unipolar RZ
        g.drawLine(abAcum[2],196,(abAcum[2]+=(int)(ab/2)),196); // Medio pulso alto Unipolar RZ
        g.drawLine(abAcum[2],196,abAcum[2],216); // vertical divisora medio pulso Unipolar RZ
        g.drawLine(abAcum[2],216,(abAcum[2]+=(int)(ab/2)),216); // Medio pulso bajo Unipolar RZ
        g.drawLine(abAcum[3],aux_bip,abAcum[3],286); // vertical divisora pulso anterior y actual Bipolar
        g.drawLine(abAcum[3],aux_bip,(abAcum[3]+=(int)(ab/2)),aux_bip); // medio pulso alto Bipolar
        g.drawLine(abAcum[3],aux_bip,abAcum[3],286); // vertical divisora medio pulso Bipolar
        g.drawLine(abAcum[3],286,(abAcum[3]+=(int)(ab/2)),286); // medio pulso bajo Bipolar
        aux_bip=(aux_bip==266?306:266); // cambiar valor pulso en alto para Bipolar
        g.drawLine(abAcum[4],336,(abAcum[4]+=(int)(ab/2)),336); // medio pulso alto manchester
        g.drawLine(abAcum[4],336,abAcum[4],376); // vertical divisora medio pulso manchester
        g.drawLine(abAcum[4],376,(abAcum[4]+=(int)(ab/2)),376); // medio pulso bajo manchester
      }
      else{
        g.drawLine(abAcum[0],76,(abAcum[0]+=ab),76); // pulso bajo para Unipolar NRZ
        g.drawLine(abAcum[1],126,(abAcum[1]+=ab),126); // pulso bajo Polar NRZ-
        g.drawLine(abAcum[2],216,(abAcum[2]+=ab),216); // pulso bajo Unipolar RZ
        g.drawLine(abAcum[3],286,(abAcum[3]+=ab),286); // pulso bajo Bipolar
        g.drawLine(abAcum[4],376,(abAcum[4]+=(int)(ab/2)),376); // medio pulso bajo manchester
        g.drawLine(abAcum[4],336,abAcum[4],376); // vertical divisora medio pulso manchester
        g.drawLine(abAcum[4],336,(abAcum[4]+=(int)(ab/2)),336); // medio pulso alto manchester
      }
      prev=val;
    }
}
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int grafica = 0;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 1)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int grafica = 1;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 2)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        Graphics g=Grafico.getGraphics();
        Grafico.repaint();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int grafica =2;
        
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length() < 3)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int grafica =3;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 4)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int grafica =4;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 5)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int grafica =5;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 6)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int grafica =6;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 7)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int grafica =7;
        String origen1;
        Object msj = " No hay caracteres en cuadro de texto ";
        Object msj2 = " Caracteres insuficientes para esta grafica ";
        origen1=origen.getText();
        if((origen1==null) || (origen1.equals("")))
        {
            JOptionPane.showMessageDialog(null,msj, "Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if(origen1.length()< 8)
            
                {
                    JOptionPane.showMessageDialog(null,msj2, "Mensaje",JOptionPane.PLAIN_MESSAGE);
                }
            else
            {
                Calculos(grafica);
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object msj = "      CopyRight® By ADOLFO ASCENCIO TREJO \n"
                +    "  UNIVERSIDAD AUTONOMA DEL ESTADO DE HIDALGO \n"
                +    "  INSTITUTO DE CIENCIAS BASICAS E INGENIERIA \n"
                +    " AREA ACADEMICA DE COMPUTACION Y ELECTRONICA \n"
                +    "   LICENCIATURA EN CIENCIAS COMPUTACIONALES \n";
        JOptionPane.showMessageDialog(null,msj, "COPYRIGHT®",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Codifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Codifica().setVisible(true);
        });
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Grafico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField origen;
    // End of variables declaration//GEN-END:variables

}
