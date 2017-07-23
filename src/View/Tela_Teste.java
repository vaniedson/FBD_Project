package View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Tela_Teste extends JFrame{
	// configurando GUI
	public Tela_Teste(){
		super( "JTabbedPane Demo" );
		JTabbedPane tabbedPane = new JTabbedPane(); // cria JTabbedPane

		// TELA PRODUTOS 
		JLabel prolnome;
		JTextField profnome;
		prolnome = new JLabel("NOME:");
		profnome = new JTextField(25);
		JLabel label1 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel1 = new JPanel(); // cria o primeiro painel
		panel1.add(prolnome);
		panel1.add(profnome);
		panel1.add( label1 ); // adiciona o r�tulo ao painel;
		tabbedPane.addTab( "PRODUTO", null, panel1, "First Panel" ); 

		// TELA CLIENTE
		JLabel clilnome;
		JTextField clifnome;
		clilnome = new JLabel("NOME:");
		clifnome = new JTextField(25);
		JLabel label2 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel2 = new JPanel(); // cria o segundo panel
		panel2.setBackground( Color.YELLOW ); // configura o fundo como amarelo
		panel2.add(clilnome);
		panel2.add(clifnome);
		panel2.add( label2 ); // adiciona o r�tulo ao painel
		tabbedPane.addTab( "CLIENTE", null, panel2, "Second Panel" );

		// TELA SESS�O
		JLabel selnome;
		JTextField sefnome;
		selnome = new JLabel("NOME:");
		sefnome = new JTextField(25);
		JLabel label3 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel3 = new JPanel(); // cria o terceiro painel
		panel3.add(selnome);
		panel3.add(sefnome);
		tabbedPane.addTab( "SESS�O", null, panel3, "Third Panel" );

		//TELA FUNCION�RIO
		JLabel fulnome;
		JTextField fufnome;
		fulnome = new JLabel("NOME:");
		fufnome = new JTextField(25);
		JLabel label4 = new JLabel( "panel two", SwingConstants.CENTER );
		JPanel panel4 = new JPanel(); // cria o segundo panel
		panel4.setBackground( Color.YELLOW ); // configura o fundo como amarelo
		panel4.add(fulnome);
		panel4.add(fufnome);
		panel4.add( label4 ); // adiciona o r�tulo ao painel
		tabbedPane.addTab( "FUNCION�RIO", null, panel4, "Second Panel" );

		add( tabbedPane ); // adicion a JTabbedPane ao frame
	} // fim do construtor JTabbedPaneFrame
} // fim da classe JTabbedPaneFrame 

