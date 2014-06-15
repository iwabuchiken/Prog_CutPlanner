package cp.utils;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;




public class Ops {

	public static boolean
	save_Image(JFrame f) {
		// TODO Auto-generated method stub
		//REF http://stackoverflow.com/questions/11272938/how-to-save-panel-as-image-in-swing answered Jun 30 '12 at 9:25
		Container c = f.getContentPane();
		
		BufferedImage im = new BufferedImage(
								c.getWidth(), c.getHeight(), 
								BufferedImage.TYPE_INT_ARGB);
		
		c.paint(im.getGraphics());
		
		try {
			
			String fname = String.format(
							"%s/%s_%s.png",
							CONS.Paths.fpath_Image,
							"D_2_V_1_0",
							Methods.get_TimeLabel(Methods.getMillSeconds_now()));
			
			ImageIO.write(im, "PNG", new File(fname));
			
			String message = String.format("Image saved: %s", fname);
			Methods.message(message,
					Thread.currentThread().getStackTrace()[1].getFileName(),
					Thread.currentThread().getStackTrace()[1].getLineNumber());

			message = null;

			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
			
		}
		
	}//save_Image(JFrame f)
	
}//public class Ops
