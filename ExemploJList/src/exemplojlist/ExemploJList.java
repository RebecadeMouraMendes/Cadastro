package exemplojlist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList extends JFrame{
    JList lista, lista2;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas gerais", "Espírito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir, exibir2;
    JLabel rotulo, rotulo1, rotulo2;
    public ExemploJList(){
        super("Exemplo de List");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        rotulo1 = new JLabel("Primeiro exemplo (uma seleção)");
        rotulo2 = new JLabel("Segundo exemplo (mais de uma seleção)");
        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelRolagem.setBounds(40,40,150,100);
        exibir.setBounds(230,100,100,30);
        rotulo.setBounds(40,150,200,30);
        rotulo1.setBounds(40,10,200,30);
        rotulo2.setBounds(40,170,250,30);
        exibir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                rotulo.setText("O estado é: "+lista.getSelectedValue().toString());
                }
            }
        );
        exibir2 = new JButton("Exibir");
        lista2 = new JList(cidades);
        lista2.setVisibleRowCount(5);
        JScrollPane painelRolagem2 = new JScrollPane(lista2);
        lista2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        painelRolagem2.setBounds(40, 200,150,100);
        exibir2.setBounds(230,255,100,30);
        exibir2.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                Object selecionados[] = lista2.getSelectedValues();
                String resultados = "Valores selecionados: \n";
                for(int i=0; i<selecionados.length; i++){
                resultados += selecionados[i].toString()+"\n";
                }
                JOptionPane.showMessageDialog(null,resultados);
                }
            }
        );
        tela.add(painelRolagem);
        tela.add(exibir);
        tela.add(painelRolagem2);
        tela.add(exibir2);
        tela.add(rotulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
       ExemploJList app = new ExemploJList();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
