import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Digitron {
    private JPanel Digitron;
    private JTextField txtDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton FUButton;
    private JButton ACButton1;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton xButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;
    private JButton bonus4;
    private JButton bonus5;
    private JButton bonus1;
    private JButton bonus2;
    private JButton bonus3;
    private JButton cao;

    double a,b, rezultat;
    String op;
    double gaser = 1;
    double caogaser = 0;







    public Digitron() {
        ArrayList<String> list=new ArrayList<String>();

        bonus1.setVisible(false);
        bonus2.setVisible(false);
        bonus3.setVisible(false);
        bonus4.setVisible(false);
        bonus5.setVisible(false);
        cao.setVisible(false);

        // Genericka<Integer> nesto=new Genericka<Integer>();
        KlasaTri klasatri=new KlasaTri();

        txtDisplay.setText(klasatri.ispis());
        Klasa m=new Klasa("");
        ACButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(String.valueOf(m));
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText()+button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String z= txtDisplay.getText();
                if(z.isEmpty())
                {}
                else
                    a=Double.parseDouble(txtDisplay.getText());

                op="+";
                txtDisplay.setText("+");

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String z= txtDisplay.getText();
                if(z.isEmpty())
                {}
                else{
                    a=Double.parseDouble(txtDisplay.getText());
                    op="-";
                }
                txtDisplay.setText("-");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="*";
                txtDisplay.setText("*");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="÷";
                txtDisplay.setText("÷");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="x2";

            }
//===============---------------------------------------------------------------------------------------------
        });
        bonus1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="√";

            }
        });
        bonus2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="sin";
            }
        });
        bonus3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="cos";
            }
        });
        bonus4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="tan";
            }
        });
        bonus5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="e";


            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a1Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a1Button.getText());
                    list.add(txtDisplay.getText());
                }


            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a2Button.getText());
                    list.add(txtDisplay.getText());

                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a2Button.getText());
                    list.add(txtDisplay.getText());
                }

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a3Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a3Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a4Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a4Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a5Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a5Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a6Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a6Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a7Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a7Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a8Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a8Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a9Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a9Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });


        a00Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a00Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a00Button.getText());
                    list.add(txtDisplay.getText());
                }

            }
        });
        a0Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(op=="÷" || op=="*"){
                    txtDisplay.setText(a0Button.getText());
                    list.add(txtDisplay.getText());
                }else
                {
                    txtDisplay.setText(txtDisplay.getText()+a0Button.getText());
                    list.add(txtDisplay.getText());
                }
            }
        });

//===============---------------------------------------------------------------------------------------------
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                b = Double.parseDouble(txtDisplay.getText());

                if(op=="+")
                {
                    rezultat = a+b;
                    txtDisplay.setText(String.valueOf(rezultat));

                }else if(op=="-"){
                    rezultat = a+b;
                    txtDisplay.setText(String.valueOf(rezultat));

                }else if(op=="*"){
                    rezultat = a*b;
                    txtDisplay.setText(String.valueOf(rezultat));

                }else if(op=="÷"){

                        if(b==0)
                        {
                           try{
                               System.out.println(b/0);
                           } catch (ArithmeticException t){ System.err.println("Deljenje nulom!");


                               System.err.println("e.getMessage(): " + t.getMessage());
                               System.out.println("e.toString(): " + t.toString());
                               System.out.println("e.getLocalizedMessage(): " + t.getLocalizedMessage());
                               }
                            txtDisplay.setText("Deljenje nulom!");
                        }
                        else {
                        rezultat = a/b;
                        txtDisplay.setText(String.valueOf(rezultat));
                        }
                }else if(op=="x2"){
                    rezultat=a*a;

                    txtDisplay.setText(String.valueOf(rezultat));

                }else if(op=="√"){
                    rezultat=Math.sqrt(a);
                    txtDisplay.setText(String.valueOf(rezultat));
                }else if(op=="sin"){
                    rezultat=Math.sin(a);
                    txtDisplay.setText(String.valueOf(rezultat));
                }else if(op=="cos"){
                    rezultat=Math.cos(a);
                    txtDisplay.setText(String.valueOf(rezultat));
                }else if(op=="tan"){
                    rezultat=Math.tan(a);
                    txtDisplay.setText(String.valueOf(rezultat));
                }else if(op=="e"){

                    rezultat = Math.exp(a);
                    txtDisplay.setText(String.valueOf(rezultat));
                }

                op="";

            }
        }
        );


        FUButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                if(gaser%2==1)
                {
                    bonus1.setVisible(true);
                    bonus2.setVisible(true);
                    bonus3.setVisible(true);
                    bonus4.setVisible(true);
                    bonus5.setVisible(true);
                    cao.setVisible(true);

                }
                else {
                    bonus1.setVisible(false);
                    bonus2.setVisible(false);
                    bonus3.setVisible(false);
                    bonus4.setVisible(false);
                    bonus5.setVisible(false);
                    cao.setVisible(false);

                }
            gaser++;
            }
        });
        Nasledjivanje nas=new Nasledjivanje("");


        cao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(caogaser%2==0)
                {

                    a1Button.setVisible(false);
                    a2Button.setVisible(false);
                    a3Button.setVisible(false);
                    a4Button.setVisible(false);
                    a5Button.setVisible(false);
                    a6Button.setVisible(false);
                    a7Button.setVisible(false);
                    a8Button.setVisible(false);
                    a9Button.setVisible(false);
                    a0Button.setVisible(false);
                    a00Button.setVisible(false);
                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button20.setVisible(false);
                    FUButton.setVisible(false);
                    ACButton1.setVisible(false);
                    button11.setVisible(false);
                    xButton.setVisible(false);
                    bonus2.setVisible(false);
                    bonus1.setVisible(false);
                    bonus4.setVisible(false);
                    bonus3.setVisible(false);
                    bonus5.setVisible(false);
                    txtDisplay.setText(nas.Cao());
                }
                else
                {
                    a1Button.setVisible(true);
                    a2Button.setVisible(true);
                    a3Button.setVisible(true);
                    a4Button.setVisible(true);
                    a5Button.setVisible(true);
                    a6Button.setVisible(true);
                    a7Button.setVisible(true);
                    a8Button.setVisible(true);
                    a9Button.setVisible(true);
                    a0Button.setVisible(true);
                    a00Button.setVisible(true);
                    button1.setVisible(true);
                    button2.setVisible(true);
                    button3.setVisible(true);
                    button4.setVisible(true);
                    button20.setVisible(true);
                    FUButton.setVisible(true);
                    ACButton1.setVisible(true);
                    button11.setVisible(true);
                    xButton.setVisible(true);
                    bonus2.setVisible(true);
                    bonus1.setVisible(true);
                    bonus4.setVisible(true);
                    bonus3.setVisible(true);
                    bonus5.setVisible(true);
                    txtDisplay.setText("");

                }
                 caogaser++;
            }

        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Digitron");
        frame.setContentPane(new Digitron().Digitron);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}