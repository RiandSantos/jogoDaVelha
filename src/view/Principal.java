package view;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Rian Santos(RiandSantos - GitHub)
 */
public class Principal extends javax.swing.JFrame {

    //Variaveis
    int qtde;
    int jogador;
    int mat[][] = new int[3][3];
    JButton b[] = new JButton[9];
    String ganhador;
    String jogador1;
    String jogador2;
    ImageIcon icon = new ImageIcon(Principal.class.getResource("/icons/x.png"), "X");
    ImageIcon icon2 = new ImageIcon(Principal.class.getResource("/icons/o.png"), "o");
    
    public Principal() {
        initComponents();
        qtde = 1;
        jogador = 1;
        b[0] = btn1;
        b[1] = btn2;
        b[2] = btn3;
        b[3] = btn4;
        b[4] = btn5;
        b[5] = btn6;
        b[6] = btn7;
        b[7] = btn8;
        b[8] = btn9;
        lblJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/folha3.png")));
        jogador1 = (String) JOptionPane.showInputDialog(null, "Digite o nome do primeiro jogador:", "Jogador 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        jogador2 = (String) JOptionPane.showInputDialog(null, "Digite o nome do segundo jogador:", "Jogador 2", JOptionPane.INFORMATION_MESSAGE, icon2, null, "");
        for(int i = 0;i<9; i++){
            b[i].setBackground(new Color(0,0,0,0));
        }
        lblNomes.setText(jogador1 + " VS "+ jogador2);
        lblNomes.setHorizontalAlignment(SwingConstants.CENTER);
    }

    //Alterna as rodadas dos jogadores e checa a jogada em busca de um(a) vencedor(a)
    public void jogada(JButton b, int x, int y) {
        b.setEnabled(false);
        if (jogador == 1) {
            mat[x][y] = 1;
            b.setText("X");
            jogador = 2;
            ganhador = jogador1;
            checarJogada(1);
        } else {
            mat[x][y] = 2;
            b.setText("O");
            jogador = 1;
            ganhador = jogador2;
            checarJogada(2);
        }
        qtde++;
    }
    
    //Verifica se houve um(a) vencedor(a) durante a rodada
    public void checarJogada(int x) {
        if (vitoria(x) == true) {
            JOptionPane.showMessageDialog(null, "Jogador " + ganhador + " venceu!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
            fimjogo();
        } else {
            empate();
        }
    }

    //Condições de vitória da partida
    public boolean vitoria(int x) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][0] == x && mat[i][1] == x && mat[i][2] == x) {
                return true;
            }
            if (mat[0][i] == x && mat[1][i] == x && mat[2][i] == x) {
                return true;
            }
        }
        if (mat[0][0] == x && mat[1][1] == x && mat[2][2] == x) {
            return true;
        }
        if (mat[0][2] == x && mat[1][1] == x && mat[2][0] == x) {
            return true;
        }
        return false;
    }

    //Bloqueia o jogo quando houver um(a) vencedor(a)
    public void fimjogo() {
        for (int i = 0; i < 9; i++) {
            b[i].setEnabled(false);
        }
    }

    //Limpa o jogo(zera as jogadas e o nome dos jogadores)
    public void limpar() {
        for (int i = 0; i < 9; i++) {
            b[i].setEnabled(true);
            b[i].setText("");
        }
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                mat[x][y] = 0;
            }
        }
        qtde = 1;
        jogador = 1;
        jogador1 = "";
        jogador2 = "";
        ganhador = "";
    }
    //Condição de empate
    public void empate() {
        if (qtde >= 9) {
            JOptionPane.showMessageDialog(null, "Ops, deu empate! \nVá em opção e Novo Jogo para jogar novamente! :D", "Empatou!", 1);
            /**JOptionPane.showConfirmDialog(null, "Deseja iniciar um novo jogo");**/
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

        jLabel1 = new javax.swing.JLabel();
        lblNomes = new javax.swing.JLabel();
        btn7 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        pnlJogoDaVelha = new javax.swing.JPanel();
        lblJogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOpcao = new javax.swing.JMenu();
        mnItemNovoJogo = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Velha");
        getContentPane().setLayout(null);

        lblNomes.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        getContentPane().add(lblNomes);
        lblNomes.setBounds(10, 10, 350, 20);

        btn7.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn7.setFocusable(false);
        btn7.setPreferredSize(new java.awt.Dimension(71, 71));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(10, 230, 110, 100);

        btn3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn3.setFocusable(false);
        btn3.setPreferredSize(new java.awt.Dimension(71, 71));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(250, 10, 110, 100);

        btn1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn1.setFocusable(false);
        btn1.setPreferredSize(new java.awt.Dimension(71, 71));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(6, 10, 110, 100);

        btn2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn2.setFocusable(false);
        btn2.setPreferredSize(new java.awt.Dimension(71, 71));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(130, 10, 110, 100);

        btn5.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn5.setFocusable(false);
        btn5.setPreferredSize(new java.awt.Dimension(71, 71));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(130, 120, 110, 100);

        btn8.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn8.setFocusable(false);
        btn8.setPreferredSize(new java.awt.Dimension(71, 71));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(130, 230, 110, 100);

        btn9.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn9.setFocusable(false);
        btn9.setPreferredSize(new java.awt.Dimension(71, 71));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(250, 230, 110, 100);

        btn6.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn6.setFocusable(false);
        btn6.setPreferredSize(new java.awt.Dimension(71, 71));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(250, 120, 110, 100);

        btn4.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        btn4.setFocusable(false);
        btn4.setPreferredSize(new java.awt.Dimension(71, 71));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(10, 120, 110, 100);

        pnlJogoDaVelha.setLayout(null);
        pnlJogoDaVelha.add(lblJogo);
        lblJogo.setBounds(0, 0, 370, 340);

        getContentPane().add(pnlJogoDaVelha);
        pnlJogoDaVelha.setBounds(0, 0, 370, 340);

        mnOpcao.setMnemonic('N');
        mnOpcao.setText("Opção");
        mnOpcao.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnOpcaoMenuSelected(evt);
            }
        });
        mnOpcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpcaoActionPerformed(evt);
            }
        });

        mnItemNovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        mnItemNovoJogo.setText("Novo Jogo");
        mnItemNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemNovoJogoActionPerformed(evt);
            }
        });
        mnOpcao.add(mnItemNovoJogo);

        jMenuBar1.add(mnOpcao);

        menuSair.setText("Sair");
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuSairMenuSelected(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(380, 393));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemNovoJogoActionPerformed
        //Menu para iniciar um novo jogo
        limpar();
        jogador1 = (String) JOptionPane.showInputDialog(null, "Digite o nome do primeiro jogador:", "Jogador 1", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        jogador2 = (String) JOptionPane.showInputDialog(null, "Digite o nome do segundo jogador:", "Jogador 2", JOptionPane.INFORMATION_MESSAGE, icon2, null, "");
    }//GEN-LAST:event_mnItemNovoJogoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setBackground(new Color(0,0,0,0));
        jogada(btn7, 2, 0);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setBackground(new Color(0,0,0,00));
        jogada(btn3, 0, 2);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setBackground(new Color(0,0,0,0));
        jogada(btn1, 0, 0);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setBackground(new Color(0,0,0,0));
        jogada(btn2, 0, 1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setBackground(new Color(0,0,0,0));
        jogada(btn5, 1, 1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setBackground(new Color(0,0,0,0));
        jogada(btn8, 2, 1);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setBackground(new Color(0,0,0,0));
        jogada(btn9, 2, 2);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setBackground(new Color(0,0,0,0));
        jogada(btn6, 1, 2);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setBackground(new Color(0,0,0,0));
        jogada(btn4, 1, 0);
    }//GEN-LAST:event_btn4ActionPerformed

    private void menuSairMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuSairMenuSelected
        System.exit(0);
    }//GEN-LAST:event_menuSairMenuSelected

    private void mnOpcaoMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnOpcaoMenuSelected

    }//GEN-LAST:event_mnOpcaoMenuSelected

    private void mnOpcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpcaoActionPerformed
    }//GEN-LAST:event_mnOpcaoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblJogo;
    private javax.swing.JLabel lblNomes;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem mnItemNovoJogo;
    private javax.swing.JMenu mnOpcao;
    private javax.swing.JPanel pnlJogoDaVelha;
    // End of variables declaration//GEN-END:variables
}
