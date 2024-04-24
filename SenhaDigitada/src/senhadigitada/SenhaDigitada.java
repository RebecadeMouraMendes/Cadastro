package senhadigitada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SenhaDigitada extends JFrame{
    //Variáveis
    JPasswordField caixa;
    JLabel rotulo, exibir;
    JButton mostrar;
    
    public SenhaDigitada(){
    //Configurações da tela
    super("Exemplo senha");
    Container tela = getContentPane();
    setLayout(null);
    setResizable(false);
    //Criando os campos
    rotulo = new JLabel("Senha: ");
    caixa = new JPasswordField(10);
    exibir = new JLabel("A senha digitada é: ");
    mostrar = new JButton("Mostrar");
    exibir.setVisible(false);
    //Localização na tela
    rotulo.setBounds(50,20,100,20);
    caixa.setBounds(50,60,200,20);
    exibir.setBounds(50,120,200,20);
    mostrar.setBounds(50,100,120,20);
    //Ação
    mostrar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String senha = new String(caixa.getPassword());
                    exibir.setVisible(true);
                    exibir.setText(senha);
                }
            }
    );
    
    //Adicionando na tela
    tela.add(rotulo);
    tela.add(caixa);
    tela.add(exibir);
    tela.add(mostrar);
    //Terminando de setar
    setSize(400,250);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
       SenhaDigitada app = new SenhaDigitada();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Trazer o da senha mostrar pronto e o do slide 70/71(Quatro operações matemáticas)
}
