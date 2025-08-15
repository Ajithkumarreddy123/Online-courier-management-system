import java.awt.*;    
  

class Mavenproject2 {    
  
 
   Mavenproject2() {  
  
  
      Frame f = new Frame();  
  
      
      Label l = new Label("Employee id:");   
  
    
      Button b = new Button("Submit");  
  
   
      TextField t = new TextField();  
  
      // setting position of above components in the frame  
      l.setBounds(20, 80, 80, 30);  
      t.setBounds(20, 100, 80, 30);  
      b.setBounds(100, 100, 80, 30);  
  
      // adding components into frame    
      f.add(b);  
      f.add(l);  
      f.add(t);  
  
      // frame size 300 width and 300 height    
      f.setSize(400,300);  
  
      // setting the title of frame  
      f.setTitle("Employee info");   
          
      // no layout  
      f.setLayout(null);   
  
      // setting visibility of frame  
      f.setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
Mavenproject2 awt_obj = new Mavenproject2();    
  
}  
  
}
