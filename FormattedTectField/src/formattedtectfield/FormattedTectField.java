package formattedtectfield;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class FormattedTectField extends JFrame{
   //Variaveis
   JLabel rotulocep, rotulotel, rotulocpf, rotulodata;
   JFormattedTextField cep, tel, cpf, data;
   MaskFormatter mascaracep, mascaratel, mascaracpf, mascaradata;
   
   public FormattedTectField(){
   //Configurando a tela
   super("Exemplo com JFormattedTextField");
   Container tela = getContentPane();
   setLayout(null);
   setResizable(false);
   
   //Campos
   rotulocep = new JLabel("CEP:");
   rotulotel = new JLabel("Telefone:");
   rotulocpf = new JLabel("CPF:");
   rotulodata = new JLabel("Data:");
   
   rotulocep.setBounds(50,40,100,20);
   rotulotel.setBounds(50,80,100,20);
   rotulocpf.setBounds(50,120,100,20);
   rotulodata.setBounds(50,160,100,20);
   
   //Criando as mascaras(modelo)
   try{
       
       mascaracep = new MaskFormatter("#####-###");
       mascaratel = new MaskFormatter("(##)####-####");
       mascaracpf = new MaskFormatter("#########-##");
       mascaradata = new MaskFormatter("##/##/####");
       
       mascaracep.setPlaceholderCharacter('_');
       mascaratel.setPlaceholderCharacter('_');
       mascaracpf.setPlaceholderCharacter('_');
       mascaradata.setPlaceholderCharacter('_');
   }
   //Caso tenha exceção
   catch(ParseException excp){}
   
   //Formatando
   cep = new JFormattedTextField(mascaracep);
   tel = new JFormattedTextField(mascaratel);
   cpf = new JFormattedTextField(mascaracpf);
   data = new JFormattedTextField(mascaradata);
   //Localizando
   cep.setBounds(150,40,100,20);
   tel.setBounds(150,80,100,20);
   cpf.setBounds(150,120,100,20);
   data.setBounds(150,160,100,20);
   //Adicionar na tela
   tela.add(rotulocep);
   tela.add(rotulotel);
   tela.add(rotulocpf);
   tela.add(rotulodata);
   
   tela.add(cep);
   tela.add(tel);
   tela.add(cpf);
   tela.add(data);
   //Terminando de configurar
   setSize(400,250);
   setVisible(true);
   setLocationRelativeTo(null);
   }
    public static void main(String[] args) {
       FormattedTectField app = new FormattedTectField();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
