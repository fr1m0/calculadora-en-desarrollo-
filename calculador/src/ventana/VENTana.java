package ventana;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.Action;
import javax.swing.JTextArea;
public class VENTana extends JFrame  {
    ////atributos///////////
     private JLabel PANEL= new JLabel();
  private   JButton boton1= new JButton();
  private JTextField cajatexto= new JTextField();

  private JTextArea numeros= new JTextArea();
  private JTextArea numeros2= new JTextArea();
  private JTextArea numeros3= new JTextArea();

  ////fin de los atributos///
   ///COMIENZO DEL DISEÑO DE LA APLICACION///
public VENTana(){
    this.setSize(417,500);
    this.setTitle("CALCULADORA");
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     panel();
     botones();
     caja_texto();
     combobox();

}
///fin de ventanas
private void panel (){
    PANEL= new JLabel();
    this.getContentPane().add(PANEL);
PANEL.setBackground(Color.BLUE);
PANEL.setOpaque(true);
PANEL.add(boton1);

}
//////fin de panel///
private void botones(){
    boton1.setBounds(0,210,100,50);///////posicionamiento correcto x:10 y:200 a:100 a:50///
    boton1.setText("+");
    boton1.setForeground(Color.BLACK);
 boton1.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    /////boton de restar////
    JButton BOTONRESTA= new JButton();
    BOTONRESTA.setBounds(0,260,100,50);///////////posicionamiento correcto del boton restar x10 y250
    BOTONRESTA.setForeground(Color.BLACK);
    BOTONRESTA.setText("-");
    BOTONRESTA.setFont(new Font("arial",Font.ROMAN_BASELINE,30));///posicionamientos correctos para que quede claro el caracter
    PANEL.add(BOTONRESTA);
    ///boton de multiplicar///
    JButton botonmultiblicar= new JButton();
    botonmultiblicar.setText("x");
    botonmultiblicar.setForeground(Color.BLACK);
    botonmultiblicar.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    botonmultiblicar.setBounds(0,310,100,50);
    PANEL.add(botonmultiblicar);
    //////boton de dividir//////////
    JButton botondividir= new JButton();
    botondividir.setText("/");
    botondividir.setForeground(Color.BLACK);
    botondividir.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    botondividir.setBounds(0,360,100,50);
    PANEL.add(botondividir);
    ///////boton c/////
    JButton c= new JButton();
    c.setText("eliminar");
    c.setForeground(Color.BLACK);
    c.setFont(new Font("arial",Font.ROMAN_BASELINE,15));
    c.setBounds(0,410,100,50);
    PANEL.add(c);
    /////////boton de igual(=)//////
    JButton boton_igual= new JButton();
    boton_igual.setText("=");
    boton_igual.setForeground(Color.BLACK);
    boton_igual.setFont(new Font("arial",Font.ROMAN_BASELINE,15));
    boton_igual.setBounds(100,410,100,50);
    PANEL.add(boton_igual);
    /////boton resolver////
    JButton resolver= new JButton();
    resolver.setText("  resolver");
    resolver.setForeground(Color.BLACK);
    resolver.setFont(new Font("arial",Font.ROMAN_BASELINE,15));////posicionamientos correctos para poner palabras en botones
    resolver.setBounds(100,360,100,50);
    PANEL.add(resolver);
    ////boton de parentesis///
    JButton parentesis=new JButton();
    parentesis.setText("()");
    parentesis.setForeground(Color.BLACK);
    parentesis.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    parentesis.setBounds(100,310,100,50);
    PANEL.add(parentesis);
    ///boton de porsentaje///
    JButton porcentaje = new JButton();
    porcentaje.setText("%");
    porcentaje.setForeground(Color.BLACK);
    porcentaje.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    porcentaje.setBounds(100,260,100,50);
    PANEL.add(porcentaje);
    ///boton de coma///
    JButton coma= new JButton();
    coma.setText(",");
    coma.setForeground(Color.BLACK);
    coma.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    coma.setBounds(100,210,100,50);
    PANEL.add(coma);
    ////boton 0///
    JButton cero=new JButton();
    cero.setText("0");
    cero.setForeground(Color.BLACK);
    cero.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    cero.setBounds(200,410,100,50);
    PANEL.add(cero);
    //boton 1//
    JButton uno= new JButton();
    uno.setText("1");
    uno.setForeground(Color.BLACK);
    uno.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    uno.setBounds(200,360,100,50);
    PANEL.add(uno);
    //boton2//
    JButton boton2= new JButton();
    boton2.setText("2");
    boton2.setForeground(Color.BLACK);
    boton2.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    boton2.setBounds(200,310,100,50);
    PANEL.add(boton2);
    //boton3//
    JButton tres= new JButton();
    tres.setText("3");
    tres.setForeground(Color.BLACK);
    tres.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    tres.setBounds(200,260,100,50);
    PANEL.add(tres);
    ///boton4///
    JButton cuatro= new JButton();
    cuatro.setText("4");
    cuatro.setForeground(Color.BLACK);
    cuatro.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    cuatro.setBounds(200,210,100,50);
    PANEL.add(cuatro);
    ///boton5///
    JButton cinco= new JButton();
    cinco.setText("5");
    cinco.setForeground(Color.BLACK);
    cinco.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    cinco.setBounds(300,410,100,50);
    PANEL.add(cinco);
    ///boton6///
    JButton seis= new JButton();
    seis.setText("6");
    seis.setForeground(Color.BLACK);
    seis.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    seis.setBounds(300,360,100,50);
    PANEL.add(seis);
    //boton7//
    JButton siete=new JButton();
    siete.setText("7");
    siete.setForeground(Color.BLACK);
    siete.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    siete.setBounds(300,310,100,50);
    PANEL.add(siete);
    //boton8//
    JButton ocho= new JButton();
    ocho.setText("8");
    ocho.setForeground(Color.BLACK);
    ocho.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    ocho.setBounds(300,260,100,50);
    PANEL.add(ocho);
    //boton9//
    JButton nueve= new JButton();
    nueve.setText("9");
    nueve.setForeground(Color.BLACK);
    nueve.setFont(new Font("arial",Font.ROMAN_BASELINE,30));
    nueve.setBounds(300,210,100,50);
    PANEL.add(nueve);
    //////funcionamiento de los botones
ActionListener eventos = new ActionListener() {
   @Override
   public void actionPerformed(ActionEvent a) {
      if (a.getSource()==uno){
         if (cajatexto.getText()==""){
            cajatexto.setText("1");
         }else{
            cajatexto.setText(cajatexto.getText()+"1");
         }
      }
   }

};
uno.addActionListener(eventos);
//numero 2
   ActionListener NUMERO2= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent b) {
         if (b.getSource()==boton2){
            if (cajatexto.getText()==""){
               cajatexto.setText("2");
            }else{
               cajatexto.setText(cajatexto.getText()+"2");
            }
         }
      }
   } ;
   boton2.addActionListener(NUMERO2);
   //boton numero 3//
   ActionListener BOTON3= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent c1) {
         if (c1.getSource() == tres) {
            if (cajatexto.getText() == "") {
               cajatexto.setText("3");
            } else {
               cajatexto.setText(cajatexto.getText() + "3");
            }
      }
   }
         };
   tres.addActionListener(BOTON3);
   //fin del boton3//

   //boton4//
   ActionListener BOTON4= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent d) {
         if (d.getSource()== cuatro){
            if (cajatexto.getText()==""){
               cajatexto.setText("4");
            }else {
               cajatexto.setText(cajatexto.getText()+"4");
            }
         }
      }
   };
   cuatro.addActionListener(BOTON4);
   ///fin del boton 4//

   //boton5
   ActionListener BOTON5= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
         if (e.getSource()==cinco){
            if (cajatexto.getText()==""){
               cajatexto.setText("5");
            }else{
               cajatexto.setText(cajatexto.getText()+"5");
            }
         }
      }
   };
   cinco.addActionListener(BOTON5);

   //boton6
   ActionListener BOTON6= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent f) {
         if (f.getSource()==seis){
            if (cajatexto.getText()==""){
                 cajatexto.setText("6");
            }else {
               cajatexto.setText(cajatexto.getText()+"6");
            }
         }
      }
   };
   seis.addActionListener(BOTON6);

   //boton 7
   ActionListener BOTON7 = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent g) {
         if (g.getSource()==siete){
            if (cajatexto.getText()== ""){
               cajatexto.setText("7");
            }else{
               cajatexto.setText(cajatexto.getText()+"7");
            }
         }
      }
   };
   siete.addActionListener(BOTON7);

   //boton 8
   ActionListener BOTON8= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent H) {
         if (H.getSource()==ocho){
            if (cajatexto.getText()==""){
               cajatexto.setText("8");
            }else {
               cajatexto.setText(cajatexto.getText()+"8");
            }
         }
      }
   };
   ocho.addActionListener(BOTON8);
   //boton 9
   ActionListener NUMERO9= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent j) {
         if (j.getSource()==nueve){
            if (cajatexto.getText() == "") {
           cajatexto.setText("9");
            }else {
               cajatexto.setText(cajatexto.getText()+"9");
            }
            }
         }

   };
   nueve.addActionListener(NUMERO9);

   //boton 0//
   ActionListener BOTON0 = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent k) {
         if (k.getSource()==cero){
            if (cajatexto.getText()==""){
               cajatexto.setText("0");
            }else {
               cajatexto.setText(cajatexto.getText()+"0");
            }
         }
      }
   };
   cero.addActionListener(BOTON0);
   //botones aritmeticos//
   ActionListener BOTONSUMA= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent i) {
         if (i.getSource()==boton1){
            if (cajatexto.getText()==""){
               cajatexto.setText("+");
            }else{
               cajatexto.setText(cajatexto.getText()+"+");
            }
         }
      }
   };
   boton1.addActionListener(BOTONSUMA);

   //boton restar
   ActionListener BRESTA= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent l) {
         if (l.getSource()==BOTONRESTA){
            if (cajatexto.getText()=="-"){
               cajatexto.setText("-");
            }else {
               cajatexto.setText(cajatexto.getText()+"-");
            }
         }
      }
   };
   BOTONRESTA.addActionListener(BRESTA);
   //boton multipliciar
   ActionListener Bmultiplicar= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent m) {
         if (m.getSource()==botonmultiblicar){
            if(cajatexto.getText()==""){
               cajatexto.setText("x");
            }else{
               cajatexto.setText(cajatexto.getText()+"x");
            }
         }
      }
   };
   botonmultiblicar.addActionListener(Bmultiplicar);
   // boton dividir
   ActionListener Bdivir= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent n) {
         if (n.getSource()==botondividir){
            if (cajatexto.getText()=="/"){
               cajatexto.setText("/");
            }else {
               cajatexto.setText(cajatexto.getText()+"/");
            }
         }
      }
   };
   botondividir.addActionListener(Bdivir);
   //boton coma//
   ActionListener Bcoma= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent o) {
         if (o.getSource()==coma){
            if (cajatexto.getText()==""){
               cajatexto.setText(",");
            }else {
               cajatexto.setText(cajatexto.getText()+",");
            }
         }
      }
   };
   coma.addActionListener(Bcoma);
   //boton porcentaje//
   ActionListener BPORCENTAJE = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent p) {
         if (p.getSource()==porcentaje){
            if (cajatexto.getText()==""){
               cajatexto.setText("%");
            }else {
               cajatexto.setText(cajatexto.getText()+"%");
            }
         }
      }
   };
   porcentaje.addActionListener(BPORCENTAJE);
   //boton parentesis//
   ActionListener BPARENTESIS = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent q) {
         if (q.getSource()== parentesis){
            if (cajatexto.getText()==""){
               cajatexto.setText("()");
            }else {
               cajatexto.setText(cajatexto.getText()+"()");
            }
         }
      }
   };
   parentesis.addActionListener(BPARENTESIS);
   // boton borrar//
   ActionListener Bborrar= new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent borrar) {
         if (borrar.getSource()== c){
            cajatexto.setText("");
         }
      }
   };
   c.addActionListener(Bborrar);
   // boton igual
   ActionListener BRESOLVER = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent resolver1) {

         if (resolver1.getSource()== resolver){
            String cadena= cajatexto.getText();

            for (int i=0;i<cadena.length();i++){
               char caracter=cadena.charAt(i);
              //sumar
               if (caracter=='+'){
                  String primera_parte= cadena.substring(0,i);
                  String segunda_parte= cadena.substring(i+1,cadena.length());
                  double resultado= Double.parseDouble(primera_parte)+Double.parseDouble(segunda_parte);
                  cajatexto.setText(Double.toString(resultado));
                  //restar
               }if (caracter=='-'){
                  String primera_parte= cadena.substring(0,i);
                  String segunda_parte= cadena.substring(i+1,cadena.length());
                  double resultado= Double.parseDouble(primera_parte)-Double.parseDouble(segunda_parte);
                  cajatexto.setText(Double.toString(resultado));
                  //multiplicar
               }if (caracter=='x'){
                  String primera_parte= cadena.substring(0,i);
                  String segunda_parte= cadena.substring(i+1,cadena.length());
                  double resultado= Double.parseDouble(primera_parte)*Double.parseDouble(segunda_parte);
                  cajatexto.setText(Double.toString(resultado));
               }if (caracter=='/'){
                  String primera_parte= cadena.substring(0,i);
                  String segunda_parte= cadena.substring(i+1,cadena.length());
                  double resultado= Double.parseDouble(primera_parte)/Double.parseDouble(segunda_parte);
                  cajatexto.setText(Double.toString(resultado));
               }if (caracter=='%'){
                    String primera_parte= cadena.substring(0,i);
                    String segunda_parte= cadena.substring(i+1,cadena.length());
                    double resultado= Double.parseDouble(primera_parte)*Double.parseDouble(segunda_parte)/100;
                    cajatexto.setText(Double.toString(resultado));
                }
            }
         }
      }
   };
   resolver.addActionListener(BRESOLVER);

         /////acciones del mouse en la caja de texto y botones///
         ///agregando oyente de raton//


         ///fin del funcionamiento///


      }

      ////fin de botones///
      private void caja_texto() {
         cajatexto.setBounds(0, 0, 417, 210);
         cajatexto.setFont(new Font("arial", Font.ROMAN_BASELINE, 30));
         PANEL.add(cajatexto);
      }

      ////fin de cajatexto///
      private void combobox() {
         String modos_calculadora[] = {"BASICA", "CIENTIFICA"};///establesco un array para poner que modos tendra la calculadora//
         JComboBox modos = new JComboBox(modos_calculadora);////creo el jcombo box para añadirle el array//
         modos.setBounds(1, 1, 100, 30);
         cajatexto.add(modos);////lo añado a la cajade texto//
      }
//fin del combobox//

      ///FIN DEL DISEÑO DE LA APLICACION//
      ///////////////////////////////////////////////


   }