package View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela_Empregado extends JFrame {
	
	public Tela_Empregado() {
		JLabel labelmatricula, labelnome, labelsenha, labellogin;
		JTextField fieldmatricula, fieldnome, fieldsenha, fieldlogin;
		JRadioButton sexo;
		
		
		labelmatricula = new JLabel("MATRICULA:");
		fieldmatricula = new JTextField(20);
		labelnome = new JLabel("NOME:");
		fieldnome = new JTextField(20);
		labellogin= new JLabel("LOGIN:");
		fieldlogin = new JTextField(20);
		labelsenha = new JLabel("SENHA:");
		fieldnome= new JTextField(20);
		
		add(labelmatricula);
		add(fieldmatricula);
		add(labelnome);
		add(fieldnome);
		
		labelmatricula.setBounds(170, 15, 100, 80);
		fieldmatricula.setBounds(250, 40, 400, 30);
		labelnome.setBounds(170, 55, 100, 80);
		fieldnome.setBounds(250, 80, 400, 30);
		
		
		setSize(800, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Tela_Empregado();
	}
}
