package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Tela_Cadastros extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// configurando GUI
	public Tela_Cadastros(){
		super( "Tela de Cadastros" );
		JTabbedPane tabbedPane = new JTabbedPane(); // cria JTabbedPane

		// TELA PRODUTOS 
		JLabel prolnome, prolvalidade, prolpreco, prolquant_estoque, proldescricao;
		JTextField profnome, profvalidade, profpreco, profquant_estoque, profdescricao;
		JButton probcadastrar, probsair, problimpar;
		
		prolnome = new JLabel("NOME:");
		profnome = new JTextField(25);
		prolvalidade = new JLabel("VALIDADE:");
		profvalidade = new JTextField(25);
		prolpreco = new JLabel("PRE�O:");
		profpreco = new JTextField(25);
		prolquant_estoque = new JLabel("QUANTIDADE EM ESTOQUE:");
		profquant_estoque = new JTextField(25);
		proldescricao= new JLabel("DESCRI��O:");
		profdescricao = new JTextField(25);
		probcadastrar = new JButton("CADASTRAR");
		probsair = new JButton("SAIR");
		problimpar = new JButton("LIMPAR");

		JLabel label1 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel1 = new JPanel(); // cria o primeiro painel

		panel1.add(prolnome);
		panel1.add(profnome);
		panel1.add(prolvalidade);
		panel1.add(profvalidade);
		panel1.add(prolpreco);
		panel1.add(profpreco);
		panel1.add(prolquant_estoque);
		panel1.add(profquant_estoque);
		panel1.add(proldescricao);
		panel1.add(profdescricao);
		panel1.add(probcadastrar);
		panel1.add(probsair);
		panel1.add(problimpar);
		
		panel1.add( label1 ); // adiciona o r�tulo ao painel;
		tabbedPane.addTab( "PRODUTO", null, panel1, "First Panel" ); 


		

		// TELA CLIENTE
		JLabel clilnome, cliltipo, cliltelefone;
		JTextField clifnome, cliftelefone;
		JButton clibcadastrar, clibsair, cliblimpar;
		
		JComboBox clicombo = new JComboBox(new Object[]{"              PESSOA F�SICA           ", "          PESSOA JUR�DICA        "});
		clilnome = new JLabel("               NOME:               ");
		clifnome = new JTextField(25);
		cliltipo = new JLabel("                    TIPO:                    ");
		cliltelefone = new JLabel("TELEFONE:");
		cliftelefone = new JTextField(25);
		clibcadastrar = new JButton("CADASTRAR");
		clibsair = new JButton("SAIR");
		cliblimpar = new JButton("LIMPAR");
		
		JLabel label2 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel2 = new JPanel(); // cria o segundo panel
		
		panel2.add(cliltipo);
		panel2.add(clicombo);
		panel2.add(clilnome);
		panel2.add(clifnome);
		panel2.add(cliltelefone);
		panel2.add(cliftelefone);
		panel2.add(clibcadastrar);
		panel2.add(clibsair);
		panel2.add(cliblimpar);
		
		panel2.add( label2 ); // adiciona o r�tulo ao painel
		tabbedPane.addTab( "CLIENTE", null, panel2, "Second Panel" );
		

		
		
		// TELA SESS�O
		JLabel selnome, seldescricao;
		JTextField sefnome, sefdescricao;
		JButton sebcadastrar, sebsair, seblimpar;
		
		selnome = new JLabel("NOME:");
		sefnome = new JTextField(25);
		seldescricao = new JLabel("DESCRI��O:");
		sefdescricao = new JTextField(25);
		sebcadastrar = new JButton("CADASTRAR");
		sebsair = new JButton("SAIR");
		seblimpar = new JButton("LIMPAR");
		
		JLabel label3 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel3 = new JPanel(); // cria o terceiro painel
		
		panel3.add(selnome);
		panel3.add(sefnome);
		panel3.add(seldescricao);
		panel3.add(sefdescricao);
		panel3.add(sebcadastrar);
		panel3.add(sebsair);
		panel3.add(seblimpar);
		
		tabbedPane.addTab( "SESS�O", null, panel3, "Third Panel" );
		
		

		//TELA FUNCION�RIO
		JLabel fulnome, fulsexo, fulmatricula, fullogin, fulsenha, fulresenha;
		JTextField fufnome, fufmatricula, fuflogin, fufsenha, fufresenha;
		JButton fubcadastrar, fubsair, fublimpar;
		
		JComboBox fucombo = new JComboBox(new Object[]{"               MASCULINO               ", "               FEMININO               "});
		
		fulsexo = new JLabel("               SEXO:               ");
		fulnome = new JLabel("               NOME:               ");
		fufnome = new JTextField(25);
		fulmatricula = new JLabel("MATR�CULA:");
		fufmatricula = new JTextField(25);
		fullogin = new JLabel("LOGIN:");
		fuflogin = new JTextField(25);
		fulsenha = new JLabel("SENHA:");
		fufsenha = new JTextField(25);
		fulresenha = new JLabel("CONFIRMAR A SENHA:");
		fufresenha = new JTextField(25);
		fubcadastrar = new JButton("CADASTRAR");
		fubsair = new JButton("SAIR");
		fublimpar = new JButton("LIMPAR");
		
		JLabel label4 = new JLabel( "", SwingConstants.CENTER );
		JPanel panel4 = new JPanel(); // cria o segundo panel
		
		panel4.add(fulsexo);
		panel4.add(fucombo);
		panel4.add(fulnome);
		panel4.add(fufnome);
		panel4.add(fulmatricula);
		panel4.add(fufmatricula);
		panel4.add(fullogin);
		panel4.add(fuflogin);
		panel4.add(fulsenha);
		panel4.add(fufsenha);
		panel4.add(fulresenha);
		panel4.add(fufresenha);
		panel4.add(fubcadastrar);
		panel4.add(fubsair);
		panel4.add(fublimpar);
		
		panel4.add( label4 ); // adiciona o r�tulo ao painel
		tabbedPane.addTab( "FUNCION�RIO", null, panel4, "Second Panel" );
		
		add( tabbedPane ); // adicion a JTabbedPane ao frame
	} // fim do construtor JTabbedPaneFrame
} // fim da classe JTabbedPaneFrame 

