package sampleprogram;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
public class Wordcountprg 
{
     public static void main(String args[])
     {
			JFrame f = new JFrame("Character Count");
			JLabel w1=new JLabel("Chracter is here");
			JLabel w2=new JLabel("Chracter with space");
			JLabel w3=new JLabel("Chracter without space");
			JLabel w4=new JLabel("words");
			JTextArea text=new JTextArea("");
			JButton submit=new JButton("SUBMIT");
			JButton clear=new JButton("CLEAR");
			Font txtFont = new Font(Font.SERIF, Font.PLAIN, 20);
			w1.setFont(txtFont);
			w2.setFont(txtFont);
			w3.setFont(txtFont);
			w4.setFont(txtFont);
			w1.setBounds(10, 25, 200, 30);
			text.setBounds(18, 60, 450, 300);
			w2.setBounds(10, 370, 400, 30);
			w3.setBounds(10, 400, 400, 30);
			w4.setBounds(10, 430, 400, 30);
			submit.setBounds(100, 470, 100, 50);
			clear.setBounds(275, 470, 100, 50);
			text.setLineWrap(true);
			text.setWrapStyleWord(true);
			submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = text.getText().strip();
					int count = 0, i, word = 0;
					w2.setText("Character with Spaces : " + str.length());
					for (i = 0; i < str.length(); i++) {
						if (str.charAt(i) != ' ')
						{
							count++;
						}
						else
						{
							word++;
						}
					}
					w3.setText("Character Without Spaces : " + count);
					w4.setText("Words : " + (word + 1));
				}
			});
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text.setText("");
					w2.setText("Character with Spaces : ");
					w3.setText("Character Without Spaces : ");
					w4.setText("Words : ");
				}
			});
			f.add(w1);
			f.add(text);
			f.add(w2);
			f.add(w3);
			f.add(w4);
			f.add(submit);
			f.add(clear);
			f.setSize(500, 570);
			f.setResizable(false);
			f.setLayout(null);
			f.setLocationRelativeTo(null);
			f.setVisible(true);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

