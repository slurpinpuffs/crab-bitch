package com.slurpinpuffs.crabbitch;

import javax.swing.*;
import java.io.IOException;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.*;

public class CrabBitch {
	private static JFrame frame;
	private static JButton crabButton;
	public static void main(String[] args) {
		frame = new JFrame("Crab Bitch");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		crabButton = new JButton("Click for Crab");
		frame.getContentPane().add(crabButton);
		crabButton.addActionListener(new CrabListener());
	}
	public static void refreshFrame() {
		frame.revalidate();
		frame.repaint();
	}
	public static class CrabListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ev) {
			String string = new String("https://i.ibb.co/Jp5ZhMY/Webp-net-resizeimage.jpg");
			 try {
				 URL url = new URL(string);
				 try {
					 BufferedImage image = ImageIO.read(url);
					 JLabel label = new JLabel(new ImageIcon(image));
					 frame.getContentPane().add(label);
					 frame.getContentPane().remove(crabButton);
					 refreshFrame();
				 } catch (IOException ex) {
					 
				 }
			 } catch (MalformedURLException ex) {
				 
			 }
		}
	}
}
