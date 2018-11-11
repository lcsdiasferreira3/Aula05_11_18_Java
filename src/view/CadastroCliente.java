package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JButton btnCadastro = new JButton("Cadastrar");
	
	public CadastroCliente() {
		super("Minha Tela de cadastro de cliente");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		paine.add(lblNome);
		lblNome.setBounds(20,20,100,30);
		
		paine.add(txtNome);
		txtNome.setBounds(130,20,150,30);
		
	
		
		btnCadastro.setBounds(250, 250, 130, 30);
		btnCadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Nome: " + txtNome.getText());
			}
		});
		
		paine.add(btnCadastro);
		
		this.setSize(400, 330);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
}
	
	public static void main(String args[]) {
		CadastroCliente Cadastro = new CadastroCliente();

	}
}
