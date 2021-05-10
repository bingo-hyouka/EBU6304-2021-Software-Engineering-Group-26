package gui;

import java.awt.EventQueue;

public class gui {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				gui_vip frame = new gui_vip();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	

}
