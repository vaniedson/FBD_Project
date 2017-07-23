package View;


 import javax.swing.JFrame;

 public class Tela_APP{
 public static void main( String args[] )
 {
 Tela_Cadastros tabbedPaneFrame = new Tela_Cadastros();
 tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 tabbedPaneFrame.setSize( 340, 450 ); // configura o tamanho do frame
 tabbedPaneFrame.setVisible( true ); // exibe o frame
 tabbedPaneFrame.setLocationRelativeTo(null);
 } // fim do main
 } // fim da classe JTabbedPaneDemo 
