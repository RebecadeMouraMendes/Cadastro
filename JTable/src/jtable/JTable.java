package jtable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTable extends JFrame {

    private JTable table;
    private final String colunas[] = {"Nome:", "Idade:", "Sexo"};
    private final String dados [][] = {
        {"Charles","19","Masculino"},
        {"Galileu","454","Masculino"},
        {"Hawking","76","Masculino"},
        {"Newton","375","Masculino"},
        {"Kepler","447","Masculino"},
        {"Einstein","139","Masculino"},
        {"Copernicus","545","Masculino"},
    };
    
    public JTable(){
        setLayout(new FlowLayout());
        setSize(new Dimension(600,200));
        
    }
    public static void main(String[] args) {
        
    }
    
}
