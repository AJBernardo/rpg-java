import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Home {
	
	static boolean On = true;
	
	
	public static void main(String[] args) {
		
		JFrame frmCoinConversion = new JFrame("COIN CONVERSION MACHINE");
		frmCoinConversion.setSize(714, 537);
		frmCoinConversion.setLayout(new BorderLayout());
		frmCoinConversion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCoinConversion.setLocationRelativeTo(null);
		
		JFrame frmHome = new JFrame("WELCOME TO TM LORD'S COMPUTER SHOP");
		frmHome.setSize(1166, 775);
		frmHome.setLayout(new BorderLayout());
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.setLocationRelativeTo(null);
			
		JPanel pnlShop = new JPanel();
		
		JLabel lblBrnz = new JLabel();
		JLabel lblSlvr = new JLabel();
		JLabel lblGd = new JLabel();	
		
		List<RentComputer> rentComputers = new ArrayList<>();
		rentComputers.add(new RentComputer(0, 0, lblBrnz, lblSlvr, lblGd));
		rentComputers.add(new RentComputer(396, 0, lblBrnz, lblSlvr, lblGd));
		rentComputers.add(new RentComputer(792, 0, lblBrnz, lblSlvr, lblGd));
		
		HeaderPanel pnlHeader = new HeaderPanel(lblBrnz, lblSlvr, lblGd, frmCoinConversion, frmHome);
		CoinConversion pnlCoinConversion = new CoinConversion(frmCoinConversion, frmHome, lblBrnz, lblSlvr, lblGd, rentComputers);
		
		
		pnlHeader.setPreferredSize(new Dimension(0, 63));
		pnlShop.setLayout(null);
		pnlShop.setBackground(new Color(74, 59, 59));

		for (RentComputer rentComputer : rentComputers) {
            pnlShop.add(rentComputer);
        }
		
		frmHome.add(pnlHeader, BorderLayout.NORTH);
		frmHome.add(pnlShop, BorderLayout.CENTER);
		frmCoinConversion.add(pnlCoinConversion);
		
		frmCoinConversion.setVisible(true);
		frmHome.setVisible(false);
	}

}
