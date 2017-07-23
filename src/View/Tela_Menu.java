package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela_Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();

	//public static Sons sons=new Sons();

	private int larguraTela;
	private int alturaTela;
//	private Fundo fundo;
	private JLabel jogar;
	private JLabel Ajuda;
	private JLabel creditos;
	private JLabel sair;
	

	public void Tela_Produto(){

		larguraTela=(int)(screenSize.width*0.66);
		alturaTela=(int)(screenSize.height*0.66);

		setLayout(null);

		if(larguraTela>=896 && alturaTela>=503){

//			fundo= new Fundo(new ImageIcon("Imagens/Telas/Fundo.png").getImage());
//			fundo.addMouseMotionListener(new MouseAdapt());
//			fundo.setBounds(-1, -20, larguraTela, alturaTela);
//			getLayeredPane().add(fundo, new Integer(1));

		}

		jogar=new JLabel(new ImageIcon("Imagens/Botões/jogar.png"));
		jogar.addMouseMotionListener(new MouseAdapt());
		jogar.addMouseListener(new MouseAdapt());
		jogar.setBounds(larguraTela-585, 105, 100, 50);
		getLayeredPane().add(jogar, new Integer(2));

		Ajuda=new JLabel(new ImageIcon("Imagens/Botões/ajuda.png"));
		Ajuda.addMouseMotionListener(new MouseAdapt());
		Ajuda.addMouseListener(new MouseAdapt());
		Ajuda.setBounds(larguraTela-400, 105, 100, 50);
		getLayeredPane().add(Ajuda, new Integer(2));

		creditos=new JLabel(new ImageIcon("Imagens/Botões/creditos.png"));
		creditos.addMouseMotionListener(new MouseAdapt());
		creditos.addMouseListener(new MouseAdapt());
		creditos.setBounds(larguraTela-520, 205, 150, 50);
		getLayeredPane().add(creditos, new Integer(2));
		
		sair=new JLabel(new ImageIcon("Imagens/Botões/sair.png"));
		sair.addMouseMotionListener(new MouseAdapt());
		sair.addMouseListener(new MouseAdapt());
		sair.setBounds(larguraTela-890, 15, 80, 80);
		getLayeredPane().add(sair, new Integer(2));

		setTitle("TELA DE OPÇÕES");
		setSize(larguraTela,alturaTela);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}


	public class MouseAdapt extends MouseAdapter{

		
		public void mouseMoved(MouseEvent e){
			if(e.getSource()==jogar){

				jogar.setIcon(new ImageIcon("Imagens/Botões/jogar1.png"));
			}else{
				jogar.setIcon(new ImageIcon("Imagens/Botões/jogar.png"));
			}

			if(e.getSource()==Ajuda){
				Ajuda.setIcon(new ImageIcon("Imagens/Botões/ajuda1.png"));
			}else{
				Ajuda.setIcon(new ImageIcon("Imagens/Botões/ajuda.png"));
			}

			if(e.getSource()==creditos){
				creditos.setIcon(new ImageIcon("Imagens/Botões/creditos1.png"));
			}else{
				creditos.setIcon(new ImageIcon("Imagens/Botões/creditos.png"));
			}

			if(e.getSource()==sair){
				sair.setIcon(new ImageIcon("Imagens/Botões/sair2.png"));
			}else{
				sair.setIcon(new ImageIcon("Imagens/Botões/sair.png"));
			}
		}


		public void mouseClicked(MouseEvent e){

			if(e.getButton()==MouseEvent.BUTTON1){
				if(e.getSource()==jogar){
					dispose();
//					TelaInicio.sons.getMouseClicked().play();
//					new TelaTematica();				
				}

				if(e.getSource()==Ajuda){
					dispose();
//					TelaInicio.sons.getMouseClicked().play();
//					new TelaAjuda();

				}

				if(e.getSource()==creditos){
					dispose();
//					TelaInicio.sons.getMouseClicked().play();
//					new TelaCreditos();

				}

				if(e.getSource()==sair){
//					TelaInicio.sons.getMouseClicked().play();
					
					System.exit(0);
				}
			}
		}
	}

	public static void main(String[] args) {
//		new TelaInicio();
		
	}

}
