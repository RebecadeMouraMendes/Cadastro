package exemplojcheckbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJCheckBox extends JFrame {
    JCheckBox primeira, segunda, terceira, quarta, quinta;
    JLabel vazio;
    
    public ExemploJCheckBox(){
        super("Exemplo de um JCheckBox");
        Container tela = getContentPane();
        setLayout(null);
        setResizable(false);; 
        JLabel rotulo = new JLabel("Quais são suas linguagens favoristas?");
        
        rotulo.setBounds(40,30,300,20);
        primeira = new JCheckBox("Java");
        primeira.setMnemonic(KeyEvent.VK_J);
        primeira.setBounds(40,60,60,20);
        segunda = new JCheckBox("C++");
        segunda.setMnemonic(KeyEvent.VK_C);
        segunda.setBounds(100,60,60,20);
        terceira = new JCheckBox("JavaScript");
        terceira.setMnemonic(KeyEvent.VK_S);
        terceira.setBounds(160,60,100,20);
        quarta = new JCheckBox("Kotlin");
        quarta.setMnemonic(KeyEvent.VK_K);
        quarta.setBounds(270,60,80,20);
        quinta = new JCheckBox("Php");
        quinta.setMnemonic(KeyEvent.VK_P);
        quinta.setBounds(350,60,70,20);
        
        JButton botao = new JButton("Exibir");
        botao.setBounds(200,100,100,20);
        vazio = new JLabel("");
        primeira.setSelected(false);
        primeira.setForeground(new Color(247, 42, 42));
        segunda.setForeground(new Color(204, 71, 71));
        terceira.setForeground(new Color(168, 69, 69));
        quarta.setForeground(new Color(140, 87, 87));
        quinta.setForeground(new Color(117, 81, 81));
        vazio.setBounds(40,140,600,20);
        botao.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
        String escolhas = "";
        if (primeira.isSelected() == true)
            escolhas = escolhas + primeira.getText()+"; ";
        if (segunda.isSelected() == true)
            escolhas = escolhas + segunda.getText()+"; ";
        if (terceira.isSelected() == true)
            escolhas = escolhas + terceira.getText()+"; ";
        if (quarta.isSelected() == true)
            escolhas = escolhas + quarta.getText() +"; ";
        if (quinta.isSelected() == true)
            escolhas = escolhas + quinta.getText() +"; ";
        vazio.setText("Você escolheu: \n"+escolhas);}});
        tela.add(rotulo);
        tela.add(primeira);
        tela.add(segunda);
        tela.add(terceira);
        tela.add(quarta);
        tela.add(quinta);
        tela.add(botao);
        tela.add(vazio);
        setSize(500, 300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
     
    public static void main(String[] args) {
       ExemploJCheckBox app = new ExemploJCheckBox();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
