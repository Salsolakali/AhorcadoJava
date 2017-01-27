/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Albertaco
 */
public class VentanaAhorcado extends javax.swing.JFrame {
    
    String palabraOculta = "PLATAOPOLOMO";
    
    String [] listaDePalabras;
    
    int numeroFallos = 0;
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        eligePalabraOculta();    
        //Sibuja la imagen del ahorcado
        dibujaimagen(0);
        
        //Dibujo los guiones de la palabra a adividnar
        ponGuiones();
    }
    private void eligePalabraOculta(){
     //Inicializo las palabras ocultas que guardare en el array
      
        listaDePalabras = new String [] {"CETYS", "MERCURIO0", "VENUS", "TIERRA", "MARTE", "JUPITER", "SATURNO", "URANO", "NEPTUNO", "PLUTON"};
        
        //Elijo una de ls palabras del array de manera aleatoria
        Random aleatorio = new Random();
        int posicionElegida = aleatorio.nextInt(listaDePalabras.length);
        
        palabraOculta = listaDePalabras [posicionElegida];
    }
    
    private void ponGuiones(){
        //crea un nuevo string con tantos guiones bajos y estpacios como letras tenga la palabra ocualta a adivinar
        String palabraConGuiones = "";
        
        for(int i = 0; i <palabraOculta.length(); i++){
        
        palabraConGuiones = palabraConGuiones + "_ ";
        }
         pantalla.setText(palabraConGuiones);
       
    }
    
    private void dibujaimagen(int numeroFallos){
        ImageIcon miImagen = null;
        URL nombreImagen = null;
        int ancho = panelAhorcado.getWidth();
        int alto = panelAhorcado.getHeight();
        
        //Cambio la ruta de la foto en funcion de los fallos
        switch(numeroFallos){
            case 0: nombreImagen = getClass().getResource("/Imagenes/ahorcado_0.png");break;
            case 1: nombreImagen = getClass().getResource("/Imagenes/ahorcado_1.png");break;
            case 2: nombreImagen = getClass().getResource("/Imagenes/ahorcado_2.png");break;
            case 3: nombreImagen = getClass().getResource("/Imagenes/ahorcado_3.png");break;
            case 4: nombreImagen = getClass().getResource("/Imagenes/ahorcado_4.png");break;
            case 5: nombreImagen = getClass().getResource("/Imagenes/ahorcado_5.png");break;
            case -1: nombreImagen = getClass().getResource("/Imagenes/acertasteTodo.png");break;
            default:nombreImagen = getClass().getResource("/Imagenes/ahorcado_fin.png");
            }
        
        // el primer image icon (el de dentro) pasa de imagen a icono y el segundo (el de fuera) lo vuelve a convertir de icono a imagen
        miImagen = new ImageIcon(new ImageIcon(nombreImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        panelAhorcado.setIcon(miImagen);
    }
        private void chequeaLetra(String letra){
        //La convierto en mmayuscula por si fuera minúscula
        letra = letra.toUpperCase();
        
        //Cojo el string de la pantalla en el estado en el que este 
        StringBuilder palabraConGuiones = new StringBuilder(pantalla.getText());
         
        //Conparo si tengo la letra que he pulsado en la palabra oculta
        if(palabraOculta.contains(letra)){
            for(int i = 0; i < palabraOculta.length(); i++){
                //letra.charAt tiene 0 porque es un string compesto por una unica letra
                if(palabraOculta.charAt(i) == letra.charAt(0)){
                    //Cambio la posicion i y le meto la letra en la posicion i
                    palabraConGuiones.setCharAt(2*i, letra.charAt(0));             
                }
            }
            pantalla.setText(palabraConGuiones.toString());
        }
        else{
            numeroFallos ++;
            dibujaimagen(numeroFallos);
        }
        if(!pantalla.getText().contains("_")){
            dibujaimagen(-1);
        }     
    }
    
    private void chequeaBoton(JButton miBoton){
        //Deshabilito el boton
        miBoton.setEnabled(false);
        //Extraigo la letra del boton
        chequeaLetra(miBoton.getText());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        Ñ = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        panelAhorcado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla.setText("_ _ _ _ _");
        pantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 381, 70));

        A.setText("A");
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AMousePressed(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 348, 42, 42));

        B.setText("B");
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BMousePressed(evt);
            }
        });
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 348, 42, 42));

        C.setText("C");
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CMousePressed(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 348, 42, 42));

        D.setText("D");
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DMousePressed(evt);
            }
        });
        getContentPane().add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 348, 42, 42));

        E.setText("E");
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EMousePressed(evt);
            }
        });
        getContentPane().add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 348, 42, 42));

        F.setText("F");
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FMousePressed(evt);
            }
        });
        getContentPane().add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 348, 42, 42));

        G.setText("G");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GMousePressed(evt);
            }
        });
        getContentPane().add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 348, 42, 42));

        H.setText("H");
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HMousePressed(evt);
            }
        });
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 396, 42, 42));

        I.setText("I");
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IMousePressed(evt);
            }
        });
        getContentPane().add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 396, 42, 42));

        J.setText("J");
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JMousePressed(evt);
            }
        });
        getContentPane().add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 396, 42, 42));

        K.setText("K");
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                KMousePressed(evt);
            }
        });
        getContentPane().add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 396, 42, 42));

        L.setText("L");
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LMousePressed(evt);
            }
        });
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 396, 42, 42));

        M.setText("M");
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MMousePressed(evt);
            }
        });
        getContentPane().add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 396, 42, 42));

        N.setText("N");
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NMousePressed(evt);
            }
        });
        getContentPane().add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 396, 42, 42));

        Ñ.setText("Ñ");
        Ñ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ÑMousePressed(evt);
            }
        });
        getContentPane().add(Ñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 444, 42, 42));

        O.setText("O");
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OMousePressed(evt);
            }
        });
        getContentPane().add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 444, 42, 42));

        P.setText("P");
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PMousePressed(evt);
            }
        });
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 444, 42, 42));

        Q.setText("Q");
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QMousePressed(evt);
            }
        });
        getContentPane().add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 444, 42, 42));

        R.setText("R");
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RMousePressed(evt);
            }
        });
        getContentPane().add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 444, 42, 42));

        S.setText("S");
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SMousePressed(evt);
            }
        });
        getContentPane().add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 444, 42, 42));

        T.setText("T");
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TMousePressed(evt);
            }
        });
        getContentPane().add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 444, 42, 42));

        U.setText("U");
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UMousePressed(evt);
            }
        });
        getContentPane().add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 492, 42, 42));

        V.setText("V");
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VMousePressed(evt);
            }
        });
        getContentPane().add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 492, 42, 42));

        W.setText("W");
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                WMousePressed(evt);
            }
        });
        getContentPane().add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 492, 42, 42));

        X.setText("X");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });
        getContentPane().add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 492, 42, 42));

        Y.setText("Y");
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                YMousePressed(evt);
            }
        });
        getContentPane().add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 492, 42, 42));

        Z.setText("Z");
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ZMousePressed(evt);
            }
        });
        getContentPane().add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 492, 42, 42));

        jButton24.setOpaque(false);
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 492, 42, 42));
        getContentPane().add(panelAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 87, 234, 234));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void AMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMousePressed
       //getSource dice que objeto (boton) ha generado el evento. Hago un casteo para pasarlo a boton
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_AMousePressed

    private void BMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BMousePressed

    private void CMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_CMousePressed

    private void DMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_DMousePressed

    private void EMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_EMousePressed

    private void FMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_FMousePressed

    private void GMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_GMousePressed

    private void HMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_HMousePressed

    private void IMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_IMousePressed

    private void JMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_JMousePressed

    private void KMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_KMousePressed

    private void LMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_LMousePressed

    private void MMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_MMousePressed

    private void NMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_NMousePressed

    private void ÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ÑMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_ÑMousePressed

    private void OMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_OMousePressed

    private void PMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_PMousePressed

    private void QMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_QMousePressed

    private void RMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_RMousePressed

    private void SMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_SMousePressed

    private void TMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_TMousePressed

    private void UMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_UMousePressed

    private void VMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_VMousePressed

    private void WMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_WMousePressed

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_XMousePressed

    private void YMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_YMousePressed

    private void ZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMousePressed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_ZMousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JLabel pantalla;
    private javax.swing.JButton Ñ;
    // End of variables declaration//GEN-END:variables
}
