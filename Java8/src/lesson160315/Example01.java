package lesson160315;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example01 {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(400, 400));
		
		JButton button = new JButton("Click me!");
		
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				doSomething();
//			}
//		});
//		
		button.addActionListener(e -> doSomething());
		
		panel.add(button);
		
		
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}

	private static void doSomething() {
		System.out.println("Clicked!");
	}

}
