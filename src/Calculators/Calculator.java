package Calculators;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JFrame frame;
    private JTextField txtDisplay;

    double firstnum;
    double secondnum;
    double result;
    String operations;
    String answer;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
             @Override
             public void run(){
                 try{
                     Calculator window = new Calculator();
                     window.frame.setVisible(true);
                 }
                 catch (Exception e){
                     e.printStackTrace();
                 }
             }
        });
    }

    public Calculator(){
        initialize();
    }
    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100, 100, 284, 429);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtDisplay  = new JTextField();
        txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtDisplay .setBounds(10, 10, 250, 32);
        frame.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);

        JButton btnBS = new JButton("<");
        btnBS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String backspace = null;
                if(txtDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = strB.toString();
                    txtDisplay.setText(backspace);
                }
            }
        });
        btnBS.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnBS.setBounds(10, 68, 60, 60);
        frame.getContentPane().add(btnBS);
        
        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent arg0){
                 String EnterNumber = txtDisplay.getText() + btn7.getText();
                 txtDisplay.setText(EnterNumber);
             }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 130, 60, 60);
        frame.getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(73, 130, 60, 60);
        frame.getContentPane().add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(135, 130, 60, 60);
        frame.getContentPane().add(btn9);

        JButton btnP = new JButton("+");
        btnP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "+";
            }
        });
        btnP.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnP.setBounds(198, 68, 60, 60);
        frame.getContentPane().add(btnP);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 192, 60, 60);
        frame.getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(73, 192, 60, 60);
        frame.getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(135, 192, 60, 60);
        frame.getContentPane().add(btn6);

        JButton btnS = new JButton("-");
        btnS.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "-";
            }
        });
        btnS.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnS.setBounds(198, 130, 60, 60);
        frame.getContentPane().add(btnS);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 254, 60, 60);
        frame.getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(73, 254, 60, 60);
        frame.getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(135, 254, 60, 60);
        frame.getContentPane().add(btn3);

        JButton btnM = new JButton("*");
        btnM.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "*";
            }
        });
        btnM.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnM.setBounds(198, 192, 60, 60);
        frame.getContentPane().add(btnM);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String EnterNumber = txtDisplay.getText() + btn0.getText();
                txtDisplay.setText(EnterNumber);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(10, 316, 60, 60);
        frame.getContentPane().add(btn0);

        JButton btnPoint = new JButton(".");
        btnPoint.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().equals("")){
                    txtDisplay.setText("0.");
                }
                else if (txtDisplay.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else{
                    String btnPointText = txtDisplay.getText() + btnPoint.getText();
                    txtDisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPoint.setBounds(73, 316, 60, 60);
        frame.getContentPane().add(btnPoint);

        JButton btnPM = new JButton("+-");
        btnPM.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
                ops = ops * (-1);
                txtDisplay.setText(String.valueOf(ops));
            }
        });
        btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPM.setBounds(135, 316, 60, 60);
        frame.getContentPane().add(btnPM);

        JButton btnE = new JButton("=");
        btnE.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String answer;
                secondnum = Double.parseDouble(txtDisplay.getText());
                if (operations == "+"){
                    result = firstnum + secondnum;
                    answer = String.format("%.1f", result);
                    txtDisplay.setText(answer);
                }
                else if (operations == "-") {
                    result = firstnum - secondnum;
                    answer = String.format("%.1f", result);
                    txtDisplay.setText(answer);
                }
                else if (operations == "*") {
                    result = firstnum * secondnum;
                    answer = String.format("%.1f", result);
                    txtDisplay.setText(answer);
                }
                else if (operations == "/") {
                    result = firstnum / secondnum;
                    answer = String.format("%.1f", result);
                    txtDisplay.setText(answer);
                }
                else if (operations == "%") {
                    result = firstnum % secondnum;
                    answer = String.format("%.1f", result);
                    txtDisplay.setText(answer);
                }

            }
        });
        btnE.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnE.setBounds(198, 316, 60, 60);
        frame.getContentPane().add(btnE);

        JButton btnPre = new JButton("%");
        btnPre.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "%";
            }
        });
        btnPre.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPre.setBounds(135, 68, 60, 60);
        frame.getContentPane().add(btnPre);

        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtDisplay.setText(null);
            }
        });
        btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnC.setBounds(73, 68, 60, 60);
        frame.getContentPane().add(btnC);

        JButton btnD = new JButton("/");
        btnD.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                firstnum = Double.parseDouble(txtDisplay.getText());
                txtDisplay.setText("");
                operations = "/";
            }
        });
        btnD.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnD.setBounds(198, 254, 60, 60);
        frame.getContentPane().add(btnD);

    }
}
