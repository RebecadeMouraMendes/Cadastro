package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    JLabel rotulo1, rotulo2, exibir, exibir2, titulo;
    JTextField texto1,texto2;
    JButton somar, subtrair, multiplicar, dividir, limpar;
    ImageIcon icone1, icone2, icone3, icone4;

    public Calculadora(){
    super("Calculadora");
    Container tela = getContentPane();
    setLayout(null);
    setResizable(false);
    //Criando os campos
    icone1 = new ImageIcon("som.png");
    icone2 = new ImageIcon("sub.png");
    icone3 = new ImageIcon("mul.png");
    icone4 = new ImageIcon("div.png");
    titulo = new JLabel("Operações com dois números ");
    rotulo1 = new JLabel("Primeiro número: ");
    rotulo2 = new JLabel("Segundo número: ");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    exibir2 = new JLabel("");
    somar = new JButton(icone1);
    subtrair = new JButton( icone2);
    multiplicar = new JButton(icone3);
    dividir = new JButton(icone4);
    
    titulo.setFont(new Font("Arial",Font.BOLD,18));
    //Localização na tela
    titulo.setBounds(110,10,300,20);
    rotulo1.setBounds(40,40,200,20);
    rotulo2.setBounds(40,70,200,20);
    texto1.setBounds(150,40,280,20);
    texto2.setBounds(150,70,280,20);
    exibir.setBounds(40,170,350,20);
    exibir2.setBounds(40,190,350,20);
    somar.setBounds(120,110,40,40);
    subtrair.setBounds(190,110,40,40);
    multiplicar.setBounds(260,110,40,40);
    dividir.setBounds(330,110,40,40);
    //Cores 
    somar.setBackground(new Color(127, 227, 102));
    subtrair.setBackground(new Color(242, 235, 107));
    multiplicar.setBackground(new Color(237, 95, 85));
    dividir.setBackground(new Color(74, 166, 232));
    //Ação somar
    somar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int numero1, numero2,soma;
                    soma = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    soma = numero1 + numero2;
                    exibir.setVisible(true);
                    exibir.setText("A soma de "+numero1 +" + "+numero2+ " é: "+soma);
                    exibir2.setText("");
                }
            }
    );
    //Ação subtrair
    subtrair.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int numero1, numero2,sub1, sub2;
                    sub1 = 0;
                    sub2 = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    sub1 = numero1 - numero2;
                    sub2 = numero2 - numero1;
                    exibir.setVisible(true);
                    exibir2.setVisible(true);
                    exibir.setText("A subtração de "+numero1 +" - "+numero2+ " é: "+sub1);
                    exibir2.setText("A subtração de "+numero2 +" - "+numero1+ " é: "+sub2);
                }
            }
    );
    //Ação multiplicar
    multiplicar.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int numero1, numero2,mul;
                    mul = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    mul = numero1 * numero2;
                    exibir.setVisible(true);    
                    exibir.setText("A multiplicação de "+numero1 +" * "+numero2+ " é: "+mul);
                    exibir2.setText("");
                }
            }
    );
    //Ação dividir
    dividir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    float numero1, numero2;
                    float div1, div2;
                    div1 = 0;
                    div2 = 0;
                    numero1 = Integer.parseInt(texto1.getText());
                    numero2 = Integer.parseInt(texto2.getText());
                    div1 = numero1 / numero2;
                    div2 = numero2 / numero1;
                    exibir.setVisible(true);
                    exibir2.setVisible(true);
                    exibir.setText("A divisão de "+numero1 +"/"+numero2+ " é: "+div1);
                    exibir2.setText("A divisão de "+numero2 +"/"+numero1+ " é: "+div2);
                }
                
            }
    );
    exibir.setVisible(false);
    //Adicionando na tela
    tela.add(titulo);
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(texto1);
    tela.add(texto2);
    tela.add(exibir);
    tela.add(exibir2);
    tela.add(somar);
    tela.add(subtrair);
    tela.add(multiplicar);
    tela.add(dividir);
    //Tela background
    tela.setBackground(new Color(224, 222, 223));
    //Terminando de setar
    setSize(490,300);
    setVisible(true);
    setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
       Calculadora app = new Calculadora();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Calculadora com apagar/ocultar/exibir/desabilitar/habilitar
    
}

