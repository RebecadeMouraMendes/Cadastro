package cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class Cliente extends JFrame {
    JLabel titulo,rotulo1,rotulo2,rotulo3,rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField texto1,texto2,texto3,texto4, texto5, texto6, texto7;
    JButton botao, botaoSair;
    ImageIcon icone1, icone2;
    public Cliente(){
       
        super("Cadastro de Cliente");
        Container tela = getContentPane();
        //cor
        tela.setBackground(new Color(242, 235, 218));
        setLayout(null);
        setResizable(false);; 
        //botão
        icone1 = new ImageIcon("abrir.png");
        icone2 = new ImageIcon("sair.png");
        botao = new JButton("Cadastrar", icone1);
        botaoSair = new JButton("Sair", icone2);

        //passando nos parametros os valores
        titulo = new JLabel ("Cadastro de Cliente");
        rotulo1 = new JLabel ("Nome"); 
        rotulo2 = new JLabel ( "CPF");
        rotulo3 = new JLabel ("RG");
        rotulo4 = new JLabel ("Endereço"); 
        rotulo5 = new JLabel ("Cidade"); 
        rotulo6 = new JLabel ("Estado"); 
        rotulo7 = new JLabel ("CEP"); 
        //colocando quantos caracteres pode colocar
        texto1 = new JTextField(50);
        texto2 = new JTextField(11);
        texto3 = new JTextField(9);
        texto4 = new JTextField(50);
        texto5 = new JTextField(50);
        texto6 = new JTextField(50);
        texto7 = new JTextField(8);
        //cor
        titulo.setForeground(new Color(255, 0, 0));
        //texto
        titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        //colocando as coordenadas
        titulo.setBounds(150, 10 ,300 ,30);
        rotulo1.setBounds(50,50,80,20);
        rotulo2.setBounds(50,105,80,20);
        rotulo3.setBounds(50,160,80,20);
        rotulo4.setBounds(50,215,80,20);
        rotulo5.setBounds(50,270,80,20);
        rotulo6.setBounds(50,325,80,20);
        rotulo7.setBounds(50,380,80,20);

        //caixa de texto
        texto1.setBounds(50,75,300,20);
        texto2.setBounds(50,130,150,20);
        texto3.setBounds(50,185,130,20);
        texto4.setBounds(50,240,300,20);
        texto5.setBounds(50,295,280,20);
        texto6.setBounds(50,350,170,20);
        texto7.setBounds(50,405,140,20);
        botao.setBounds(70 , 455, 150, 50);
        botaoSair.setBounds(270 , 455, 150, 50);
        //adicionando a tela as coisas
        tela.add(titulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5); 
        tela.add(texto6); 
        tela.add(texto7); 
        tela.add(botao);
        tela.add(botaoSair);
        //modificando a tela
        setSize(500, 600);
        setVisible(true);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
        Cliente app = new Cliente();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}