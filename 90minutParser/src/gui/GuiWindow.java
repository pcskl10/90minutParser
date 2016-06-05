package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import parser.Connection;
import parser.Utensils;
import parser90json.minut90Parser;

public class GuiWindow extends JFrame {
	public GuiWindow() {
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String[] tokens;
	static int radioOption = 0;
	static BigInteger[] bigElements;
	public static boolean flag = false;

	private static void createAndShowGUI() {

		final JFrame frame1 = new JFrame("Problem podzia³u zbioru");
		frame1.setSize(650, 900);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		JPanel panel = new JPanel(new GridBagLayout());
		frame1.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagConstraints c = new GridBagConstraints();
		Font font = new Font("Courier", Font.BOLD, 12);

		final JButton button1 = new JButton("90minut");
		button1.setPreferredSize(new Dimension(100, 50));
		c.gridx = 0;
		c.gridy = 4;
		panel.add(button1, c);
		
		final JButton button2 = new JButton("JSON");
		button2.setPreferredSize(new Dimension(100, 50));
		c.gridx = 0;
		c.gridy = 5;
		panel.add(button2, c);
		button2.setEnabled(false);
		
		final JButton button3 = new JButton("XML");
		button3.setPreferredSize(new Dimension(100, 50));
		c.gridx = 0;
		c.gridy = 6;
		panel.add(button3, c);
		button3.setEnabled(false);

		final JLabel label4a = new JLabel("Wybierz ligê");
		c.gridx = 0;
		c.gridy = 2;
		panel.add(label4a, c);
		label4a.setFont(font);

		final JTextArea textArea = new JTextArea("xcx", 40, 50);
		c.gridx = 0;
		c.gridy = 10;
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setTabSize(2);
		JScrollPane scrollPaneArea = new JScrollPane(textArea);
		panel.add(scrollPaneArea, c);

		String[] list = { "IV liga", 
						  "V liga grupa: Bia³a Podlaska",
						  "V liga grupa: Che³m",
						  "V liga grupa: Lublin",
						  "V liga grupa: Zamoœæ",
						  "A klasa grupa: Bia³a Podlaska",
						  "A klasa grupa: Che³m",
						  "A klasa grupa: Lublin I",
						  "A klasa grupa: Lublin II",
						  "A klasa grupa: Lublin III",
						  "A klasa grupa: Lublin IV",
						  "A klasa grupa: Zamoœæ I",
						  "A klasa grupa: Zamoœæ II",
						  "B klasa grupa: Bia³a Podlaska I",
						  "B klasa grupa: Bia³a Podlaska II",
						  "B klasa grupa: Lublin I",
						  "B klasa grupa: Lublin II",
						  "B klasa grupa: Lublin III",
						  "B klasa grupa: Zamoœæ I",
						  "B klasa grupa: Zamoœæ II"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		final JList listbox = new JList(list);
		c.gridx = 0;
		c.gridy = 3;
		JScrollPane scrollPaneList = new JScrollPane(listbox);
		panel.add(scrollPaneList, c);

		// Add action listener to button
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String str = readFile("liga");

				textArea.setText(null);

				textArea.append(str);
				button2.setEnabled(true);
				button3.setEnabled(true);
			}
		});
		
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				parser90json.minut90Parser.generateJSON();
				String str = readFile("liga.minut90");
				textArea.setText(null);

				textArea.append(str);
			}
		});
		
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				parser90xml.minut90Parser.generateXML();
				String str = readFile("ligaXML");
				textArea.setText(null);

				textArea.append(str);
			}
		});

		
		listbox.addMouseListener(new MouseAdapter() {
		      public void mouseClicked(MouseEvent mouseEvent) {
		        JList theList = (JList) mouseEvent.getSource();
		        if (mouseEvent.getClickCount() == 1) {
		          int index = theList.locationToIndex(mouseEvent.getPoint());
		          Connection conn = new Connection(Utensils.leaguesAddresses[index]);
		          conn.connect();
		        }
		        button2.setEnabled(false);
				button3.setEnabled(false);
		      }
		    });

	}

	
	
	 
	static String readFile(String fileName) {
		File file = new File(fileName);
		FileInputStream fis;
		byte[] data;
		String str = null;
		try {
			fis = new FileInputStream(file);
			data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			str = new String(data, "UTF-8");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return str;
	}

	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI();
			}
		});
	}
}
