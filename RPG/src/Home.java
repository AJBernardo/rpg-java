import javax.swing.*;

public class Home {
	public static void main(String[] a) {
		JFrame frmMain = new JFrame("RPG");
		
		frmMain.setSize(700, 700);
		frmMain.setVisible(true);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GameView gameView = new GameView();
		
		frmMain.add(gameView);
		
		frmMain.revalidate();
	}
}