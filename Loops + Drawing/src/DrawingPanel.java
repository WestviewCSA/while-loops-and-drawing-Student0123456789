import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DrawingPanel extends JPanel implements ActionListener {

	
	
	/*
	 * Use the drawing methods below to draw a smiley face
	 */
	public void paint(Graphics pen) {
		//practice calling methods
		//x1, y1, x2, y2
		//draw rectangle
//		pen.drawRect(300, 400, 100, 200);
//		//drawRect (toplLeftX,  topLeftY, width, height);
//		pen.drawLine(300, 100, 300, 300);
//		pen.drawLine(300, 100, 500, 100);
//		pen.drawLine(500, 100, 500, 300);
//		pen.drawLine(500,300,300,300);
//		// DRAW CUBE
//		pen.drawLine(200, 50, 200, 250);
//		pen.drawLine(200, 50, 400, 50);
//		pen.drawLine(400, 50, 400, 250);
//		pen.drawLine(400,250,200,250);
//		pen.drawLine(400, 50, 500, 300);



		// DRAW SPHERE




		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE




		// DRAW APCS




		// DRAW PACMEN FLOWER
//		pen.setColor(Color.yellow);
//		//x,y,width,startAngle,ArcLength
//		pen.fillArc(0, 300, 100, 100, 45, 270);
		for (int x = 0, y = 0; y <= 650; y+=25) {
			pen.drawLine(0, y, x, 649);
			x+=25;
		}
		for (int x = 0, y = 650; x <=600; x+=25) {
			pen.drawLine(0, y, x, 0);
			y-=25;
		}
		int y1 = 650;
		int x1 = 1000;
		while(y1>0) {
			pen.drawLine(1000, y1, x1, 0);
			y1-=25;
			x1-=25;
		}
		int y2 = 0;
		int x2 = 1000;
		while (x2>=350) {
			pen.drawLine(1000, y2, x2, 650);
			y2+=25;
			x2-=25;
		}
	}
	
	
	
	
	
	
	public DrawingPanel() {
		JFrame f = new JFrame("Methods Lab");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000,700);
		f.setResizable(false);
		f.add(this);
		
		Timer t = new Timer(16, this);
		t.start();
		f.setVisible(true);
	}
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}

}
