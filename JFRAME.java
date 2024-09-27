import java.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener
{
   
}
private void initComponents(){
  
}
save.addActionListener(this);
this.setLayout(new FlowLayout());
this.add(problem);
this.add(score);
this.add(save);

this.setSize(500,200);
}
public void actionPerformed(ActionEvent e){
  //System.out.println("Button clicked");
  int problemNo = Integer.parseInt(problem.getText());
  
}
}