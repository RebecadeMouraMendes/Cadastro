package textfield2;

import javax.swing.*;
import java.awt.*;

public class TextField2 extends JFrame {
    JLabel titulo, rotulo1,rotulo2,rotulo3,rotulo4,rotulo5, rotulo6, rotulo7; 
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    
        public TextField2(){
            super("Cadastro de cliente");
            Container tela = getContentPane();
            setLayout(null);
            //atribuindo
            titulo = new JLabel("Cadastro de Cliente");
            rotulo1 = new JLabel("Nome");
            rotulo2 = new JLabel("CPF");
            rotulo3 = new JLabel("RG");
            rotulo4 = new JLabel("Endereço");
            rotulo5 = new JLabel("Cidade");
            rotulo6 = new JLabel("Estado");
            rotulo7 = new JLabel("CEP");
            texto1 = new JTextField(50);
            texto2 = new JTextField(11);
            texto3 = new JTextField(10);
            texto4 = new JTextField(50);
            texto5 = new JTextField(45);
            texto6 = new JTextField(35);
            texto7 = new JTextField(10);
            //Posição texto
            titulo.setBounds(105,15,200,20);
            rotulo1.setBounds(50,50,100,20);
            rotulo2.setBounds(50,90,61,20);
            rotulo3.setBounds(50,130,80,20);
            rotulo4.setBounds(50,170,80,20);
            rotulo5.setBounds(50,210,80,20);
            rotulo6.setBounds(50,250,80,20);
            rotulo7.setBounds(50,290,80,20);
            //Posição textfields
            texto1.setBounds(50,70,250,20);
            texto2.setBounds(50,110,100,20);
            texto3.setBounds(50,150,90,20);
            texto4.setBounds(50,190,250,20);
            texto5.setBounds(50,230,230,20);
            texto6.setBounds(50,270,200,20);
            texto7.setBounds(50,310,90,20);
            //Titulo personalização
            titulo.setForeground(new Color(222, 47, 145));
            titulo.setFont(new Font("Courier New", Font.BOLD,16));
            //tela
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
            setSize(400, 450);
            setResizable(false);
            setVisible(true);
            setLocationRelativeTo(null);
            //Botão
            JButton botão1, botão2;
            botão1 = new JButton("Cadastrar");
            botão2 = new JButton("Sair");
            botão1.setBounds(80, 350, 100, 20);
            botão2.setBounds(210, 350, 100, 20);
            tela.add(botão1);
            tela.add(botão2);
            tela.setBackground(new Color(250, 205, 224));
            ImageIcon imageIcon = new ImageIcon("icone.jpg"); // load the image to a imageIcon
            Image image = imageIcon.getImage(); // transform it 
            Image newimg = image.getScaledInstance(800, 800,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
            imageIcon = new ImageIcon(newimg);  // transform it back
            setIconImage(imageIcon.getImage());
        }
    public static void main(String[] args) {
      TextField2 app = new TextField2();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
