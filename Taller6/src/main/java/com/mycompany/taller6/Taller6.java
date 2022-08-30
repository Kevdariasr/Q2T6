package com.mycompany.taller6;
import javax.swing.*;
import java.awt.event.*;

public class Taller6 extends JFrame implements ActionListener{

private JTextField textfield1,textfield2;
private JButton boton1,boton2,boton3,boton4,boton5;
    
   
public Taller6(){
setLayout(null);
textfield1 = new JTextField();
textfield1.setBounds(10,10,100,30);
add(textfield1);     

textfield2 = new JTextField();
textfield2.setBounds(10,50,100,30);
add(textfield2);

boton1 = new JButton("sumar");
boton1.setBounds(120,10,90,30);
add(boton1);  
boton1.addActionListener(this);  

boton2 = new JButton("Restar");
boton2.setBounds(120,50,90,30);
add(boton2);  
boton2.addActionListener(this);

boton3 = new JButton("Multiplicar");
boton3.setBounds(120,90,100,30);
add(boton3);  
boton3.addActionListener(this);

boton4 = new JButton("Dividir");
boton4.setBounds(240,10,110,30);
add(boton4);  
boton4.addActionListener(this);


boton5 = new JButton("salir");
boton5.setBounds(240,50,110,30);
add(boton5);  
boton5.addActionListener(this);
}

    

@Override
 public void actionPerformed(ActionEvent e) {
       if (e.getSource()==boton1){
           String cad1 = textfield1.getText();
           String cad2 = textfield2.getText();
           int a1 = Integer.parseInt(cad1);
           int a2 = Integer.parseInt(cad2);
           int suma=a1+a2;
           String total = String.valueOf(suma);
           setTitle(total);
       }
           
      if (e.getSource()==boton2){
           String ba1 = textfield1.getText();
           String ba2 = textfield2.getText();
           int b1 = Integer.parseInt(ba1);
           int b2 = Integer.parseInt(ba2);
           int resta= b1-b2;
           String total =String.valueOf(resta);
           setTitle(total);
      }
           
       if (e.getSource()==boton3){
           String ca = textfield1.getText();
           String ca2 = textfield2.getText();
           int c1 = Integer.parseInt(ca);
           int c2 = Integer.parseInt(ca2);
           int multiplicacion=c1*c2;
           String total = String.valueOf(multiplicacion);
           setTitle(total);
       }
        if (e.getSource()==boton4){
           String Da1 = textfield1.getText();
           String Da2 = textfield2.getText();
           int D1 = Integer.parseInt(Da1);
           int D2 = Integer.parseInt(Da2);
           int dividir=D1/D2;
           String total = String.valueOf(dividir);
           setTitle(total);   
        }
        if (e.getSource()==boton5){
            int confirmado = JOptionPane.showConfirmDialog(null, "¿Aceptas salir?");
            if (JOptionPane.OK_OPTION == confirmado){
                System.out.println("Saliendo... ");
                System.exit(0);}
            else
                System.out.println("Por favor realice otra operacion...");
        }   
    }
 
    public static void main(String[] args) {
        
       Taller6 llamar = new Taller6();
       llamar.setBounds(0,0,400,250);
       llamar.setVisible(true);
    
      //while (Taller6())
       //   return;
    }





}