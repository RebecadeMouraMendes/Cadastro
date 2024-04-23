package password;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Password extends JFrame{
    //Variáveis
    JPasswordField caixa;
    JLabel rotulo;
    
    public Password(){
    //Configurações da tela
    super("Exemplo senha");
    Container tela = getContentPane();
    setLayout(null);
    setResizable(false);
    //Criando os campos
    rotulo = new JLabel("Senha: ");
    caixa = new JPasswordField(10);
    //Localização na tela
    rotulo.setBounds(50,40,100,20);
    caixa.setBounds(50,60,100,20);
    //Adicionando na tela
    tela.add(rotulo);
    tela.add(caixa);
    //Terminando de setar
    setSize(400,250);
    setVisible(true);
    setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
       Password app = new Password();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Trazer o da senha mostrar pronto e o do slide 70/71(Quatro operações matemáticas)
}
