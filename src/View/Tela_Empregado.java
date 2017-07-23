package View;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela_Empregado extends JFrame {
	
	public Tela_Empregado() {
		JLabel labelmatricula, labelnome, labelsenha, labellogin, labelsexo;
		JTextField fieldmatricula, fieldnome, fieldsenha, fieldlogin;
		JRadioButton Masculino, Feminino;
		ButtonGroup grupo = null;
	
		
		labelmatricula = new JLabel("MATRICULA:");
		fieldmatricula = new JTextField(20);
		labelnome = new JLabel("NOME:");
		fieldnome = new JTextField(20);
		labellogin= new JLabel("LOGIN:");
		fieldlogin = new JTextField(20);
		labelsenha = new JLabel("SENHA:");
		fieldsenha= new JTextField(20);
		labelsexo = new JLabel("SEXO:");
		Masculino = new JRadioButton("Masculino",false);
		Feminino = new JRadioButton("Feminino",false);
		
		add(labelmatricula);
		add(fieldmatricula);
		add(labelnome);
		add(fieldnome);
		add(labellogin);
		add(fieldlogin);
		add(labelsenha);
		add(fieldsenha);
		add(labelsexo);
		//grupo.add(Masculino);
		add(Feminino);
		
		labelmatricula.setBounds(170, 15, 100, 80);
		fieldmatricula.setBounds(250, 40, 400, 30);
		labelnome.setBounds(170, 55, 100, 80);
		fieldnome.setBounds(250, 80, 400, 30);
		labellogin.setBounds(170, 95, 100, 80);
		fieldlogin.setBounds(250, 120, 400, 30);
		labelsenha.setBounds(170, 135, 100, 80);
		fieldsenha.setBounds(250, 160, 400, 30);
		labelsexo.setBounds(170, 175, 100, 80);
		
		setSize(800, 500);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setTitle("Espregado");
	}
	
	public static void main(String[] args) {
		new Tela_Empregado();
	}
}
