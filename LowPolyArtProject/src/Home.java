import javax.swing.*;

public class Home {

	public static void main(String[] args) {
		LowPolyCanvas canvas = new LowPolyCanvas();

		JFrame frmhome = new JFrame("23.5 - When the Earth is Spinning Around");
		frmhome.setSize(750, 800);
		frmhome.setVisible(true);
		frmhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmhome.add(canvas);

	}

}
