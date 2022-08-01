package alert;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**@author Filipondios
 * @version 02.08.22*/
public class Alert {

    /**@param args the command line arguments*/
    public static void main(String[] args) throws IOException {
        Frame peter = new Frame();
	peter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

@SuppressWarnings("serial")
class Frame extends JFrame{
	
	public Frame() throws IOException {
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(350,230);
		this.setTitle("Peter Griffin Alert");
		
		Panel panel = new Panel();
		this.add(panel);
		this.setIconImage(new ImageIcon(getClass().getResource("/images/Peter.png")).getImage());
	}

	private class Panel extends JPanel implements ActionListener{
		
		JButton button = new JButton("Ok");
		private Image image;
		
		public Panel() {
			this.add(button);
			this.setLayout(null);
			button.setLayout(null);
			button.setBounds(145,160,80,30);
			button.addActionListener(this);
			this.setBackground(Color.white);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawString("You've been Petered", 110, 15);
			image = new ImageIcon(getClass().getResource("/images/Peter.png")).getImage();
			g.drawImage(image,110,20,null);
		}
		
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}