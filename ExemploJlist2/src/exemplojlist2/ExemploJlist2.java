package exemplojlist2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJlist2 extends JFrame{
    JList lista;
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas gerais", "Espírito Santo","Bahia","Pernambuco","Rio Grande do Sul","Acre"};
    JButton exibir;
    
    public ExemploJlist2(){
        super("Exemplo de List");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        lista = new JList(cidades);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        painelRolagem.setBounds(40,50,150,100);
        exibir.setBounds(270,50,100,30);
        exibir.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                Object selecionados[] = lista.getSelectedValues();
                String resultados = "Valores seleciondos: \n";
                for(int i=0; i<=selecionados.length; i++){
                resultados += selecionados[i].toString()+"\n";
                JOptionPane.showMessageDialog(null,resultados);
                }
                }
            }
        );
        tela.add(painelRolagem);
        tela.add(exibir);
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
       ExemploJlist2 app = new ExemploJlist2();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
