import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

public class HeaderPanel extends JPanel{
	public HeaderPanel(JLabel lblB, JLabel lblS, JLabel lblG, JFrame frm, JFrame frmHome) {
		
		URL imgurlBronzeCoin = RentComputer.class.getResource("/bronzecoin.png");
		ImageIcon imgBronzeCoin = new ImageIcon(imgurlBronzeCoin);
		
		URL imgurlSilverCoin = RentComputer.class.getResource("/silvercoin.png");
		ImageIcon imgSilverCoin = new ImageIcon(imgurlSilverCoin);
		
		URL imgurlGoldCoin = RentComputer.class.getResource("/goldcoin.png");
		ImageIcon imgGoldCoin = new ImageIcon(imgurlGoldCoin);
		
		this.setSize(1152, 63);
		this.setBackground(new Color(221, 232, 190));
		this.setLayout(null);
		
		JPanel pnlBronze = new JPanel();
		JPanel pnlSilver = new JPanel();
		JPanel pnlGold = new JPanel();
		JPanel pnlTitle = new JPanel();
		
		JLabel lblBronze = new JLabel();
		JLabel lblSilver = new JLabel();
		JLabel lblGold = new JLabel();
		JLabel lblTitle = new JLabel("<html><center>"+ "TM LORD'S COMPUTER SHOP" + "</center></html>");
		
		JButton btnCoinMachine = new JButton ("GET COIN");
		
		btnCoinMachine.setBounds(384, 0, 125, 63);
		btnCoinMachine.setFont(new Font("Montserrat", Font.BOLD, 16));
		btnCoinMachine.setBackground(new Color(254, 245, 210));
		btnCoinMachine.setForeground(Color.BLACK);
		btnCoinMachine.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		
		pnlTitle.setBounds(509, 0, 643, 63);
		pnlTitle.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		pnlTitle.setBackground(new Color(254, 245, 210));
		pnlTitle.setLayout(null);
		pnlBronze.setBounds(71, 0, 57, 63);
		pnlBronze.setBackground(new Color(254, 245, 210));
		pnlBronze.setLayout(null);
		pnlSilver.setBounds(199, 0, 57, 63);
		pnlSilver.setBackground(new Color(254, 245, 210));
		pnlSilver.setLayout(null);
		pnlGold.setBounds(327, 0, 57, 63);
		pnlGold.setBackground(new Color(254, 245, 210));
		pnlGold.setLayout(null);
		
		lblBronze.setBounds(0, 0, 71, 61);
		lblBronze.setIcon(imgBronzeCoin);
		lblSilver.setBounds(128, 0, 71, 61);
		lblSilver.setIcon(imgSilverCoin);
		lblGold.setBounds(256, 0, 71, 61);
		lblGold.setIcon(imgGoldCoin);
		lblTitle.setBounds(0, 0, 643, 63);
		lblTitle.setFont(new Font("Montserrat", Font.BOLD, 35));
		lblTitle.setHorizontalAlignment(JLabel.CENTER);
		lblTitle.setVerticalAlignment(JLabel.CENTER);

		lblB.setBounds(0, 0, 57, 63);
		lblB.setFont(new Font("Montserrat", Font.BOLD, 20));
		lblB.setHorizontalAlignment(JLabel.CENTER);
		pnlBronze.add(lblB);

		lblS.setBounds(0, 0, 57, 63);
		lblS.setFont(new Font("Montserrat", Font.BOLD, 20));
		lblS.setHorizontalAlignment(JLabel.CENTER);
		pnlSilver.add(lblS);
		
		lblG.setBounds(0, 0, 57, 63);
		lblG.setFont(new Font("Montserrat", Font.BOLD, 20));
		lblG.setHorizontalAlignment(JLabel.CENTER);
		pnlGold.add(lblG);
		
		btnCoinMachine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frm.setVisible(true);
				frmHome.setVisible(false);	
			}
			
		});
		
		pnlTitle.add(lblTitle);
		this.add(lblBronze);
		this.add(lblSilver);
		this.add(lblGold);
		this.add(pnlBronze);
		this.add(pnlSilver);
		this.add(pnlGold);
		this.add(pnlTitle);
		this.add(btnCoinMachine);
			
		
	}
	
}
