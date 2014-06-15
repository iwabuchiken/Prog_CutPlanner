package cp.main;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

import cp.utils.Methods;
import cp.utils.Ops;

public class Main extends JPanel {

	public static void main(String[] a) {
		
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.add(new Main());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		boolean res = Ops.save_Image(f);

		_test_D_1_V_1_0();
		
		String message = "done";
		String label = "["
				+ Thread.currentThread().getStackTrace()[1].getFileName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getMethodName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getLineNumber()
				+ "]";
		System.out.println(label + " " + message);
		
	}

	private static void _test_D_1_V_1_0() {
		// TODO Auto-generated method stub
		
	}

	public void paint(Graphics g) {
//		public void paint(Graphics g, int num) {
//		g.drawRect (5, 15, 50, 75); 
		g.setColor(Color.RED);
		g.drawRect (5, 5, 300, 300); 
		
		g.setColor(Color.BLUE);
		g.drawRect (15, 15, 100, 100); 
		
//		Rectangle2D 2d = new Rectangle2D();
		
//		g.fill( new Rectangle2D.Double(0.1, 0.1, 0.8, 0.8));
		
		
	}
}

//class MyCanvas extends JComponent {
//
//	  /**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public void paint(Graphics g) {
//	    g.drawRect (10, 10, 200, 200);  
//	  }
//}
//
//public class Main {
//	  public static void main(String[] a) {
//	    JFrame window = new JFrame();
//	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    window.setBounds(30, 30, 300, 300);
//	    window.getContentPane().add(new MyCanvas());
//	    window.setVisible(true);
//	  }
//}
