import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.List;

public class CoinConversion extends JPanel {
	
	int numBronzeCoin;
	int numSilverCoin;
	int numGoldCoin;
	
	List<RentComputer> rentComputers;
	
	public CoinConversion(JFrame frm, JFrame frmHome, JLabel lblB, JLabel lblS, JLabel lblG, List<RentComputer> rentComputers) {
		
		URL imgurlHeader = RentComputer.class.getResource("/header.png");
		ImageIcon imgHeader = new ImageIcon(imgurlHeader);
		
		URL imgurlMechanics = RentComputer.class.getResource("/mechanics.png");
		ImageIcon imgMechanics = new ImageIcon(imgurlMechanics);
		
		URL imgurlBronzeCoin = RentComputer.class.getResource("/bronzecoin.png");
		ImageIcon imgBronzeCoin = new ImageIcon(imgurlBronzeCoin);
		
		URL imgurlSilverCoin = RentComputer.class.getResource("/silvercoin.png");
		ImageIcon imgSilverCoin = new ImageIcon(imgurlSilverCoin);
		
		URL imgurlGoldCoin = RentComputer.class.getResource("/goldcoin.png");
		ImageIcon imgGoldCoin = new ImageIcon(imgurlGoldCoin);
		
		String[] numCoins = {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
		};
		
		this.setSize(714, 537);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		this.setBackground(new Color(221, 232, 190));
		
		this.rentComputers = rentComputers;
		
		JPanel pnlShopName = new JPanel();
		
		JLabel lblHeader = new JLabel();
		JLabel lblMechanics = new JLabel();
		JLabel lblBronze = new JLabel();
		JLabel lblSilver = new JLabel();
		JLabel lblGold = new JLabel();
		JLabel lblInstruct = new JLabel("<html><center>"+ "EACH COIN MUST ONLY BE BETWEEN 1-15" + "</center></html>");
		
		JTextField txtfldBronze = new JTextField();
		JTextField txtfldSilver = new JTextField();
		JTextField txtfldGold = new JTextField();
		
		JButton btnDone = new JButton ("DONE");
		
		lblHeader.setBounds(50, 25, 600, 150);
		lblHeader.setIcon(imgHeader);
		lblMechanics.setBounds(34, 207, 316, 219);
		lblMechanics.setIcon(imgMechanics);
		lblBronze.setBounds(366, 207, 71, 61);
		lblBronze.setIcon(imgBronzeCoin);
		lblSilver.setBounds(366, 286, 71, 61);
		lblSilver.setIcon(imgSilverCoin);
		lblGold.setBounds(366, 365, 71, 61);
		lblGold.setIcon(imgGoldCoin);
		lblInstruct.setBounds(34, 442, 450, 31);
		lblInstruct.setFont(new Font("Montserrat", Font.BOLD, 20));
		
		pnlShopName.setBounds(198, 43, 421, 114);
		pnlShopName.setBackground(new Color(254, 245, 210));
		pnlShopName.setLayout(null);
		
		btnDone.setBounds(582, 435, 100, 45);
		btnDone.setFont(new Font("Montserrat", Font.BOLD, 16));
		btnDone.setBackground(new Color(181, 205, 159));
		btnDone.setForeground(Color.BLACK);
		btnDone.setBorder(null);
		
		txtfldBronze.setBounds(469, 207, 200, 61);
		txtfldBronze.setFont(new Font("Montserrat", Font.BOLD, 18));
		txtfldBronze.setBackground(new Color(254, 245, 210));
		txtfldBronze.setForeground(new Color(81, 59, 34));
		txtfldBronze.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		txtfldBronze.setHorizontalAlignment(JTextField.CENTER);
		
		txtfldSilver.setBounds(469, 286, 200, 61);
		txtfldSilver.setFont(new Font("Montserrat", Font.BOLD, 18));
		txtfldSilver.setBackground(new Color(254, 245, 210));
		txtfldSilver.setForeground(new Color(81, 59, 34));
		txtfldSilver.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		txtfldSilver.setHorizontalAlignment(JTextField.CENTER);
		
		txtfldGold.setBounds(469, 365, 200, 61);
		txtfldGold.setFont(new Font("Montserrat", Font.BOLD, 18));
		txtfldGold.setBackground(new Color(254, 245, 210));
		txtfldGold.setForeground(new Color(81, 59, 34));
		txtfldGold.setBorder(BorderFactory.createLineBorder(new Color(181, 205, 159), 10));
		txtfldGold.setHorizontalAlignment(JTextField.CENTER);
		
		
		btnDone.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String strBronzeCoin = txtfldBronze.getText();
				String strSilverCoin = txtfldSilver.getText();
				String strGoldCoin = txtfldGold.getText();
				
				for (String numCoin : numCoins) {
					if (strBronzeCoin.equals(numCoin))
						numBronzeCoin = Integer.parseInt(strBronzeCoin);
	
					if (strSilverCoin.equals(numCoin))
						numSilverCoin = Integer.parseInt(strSilverCoin);

					if (strGoldCoin.equals(numCoin))
						numGoldCoin = Integer.parseInt(strGoldCoin);	
				}
				
				if (numBronzeCoin == 0 || numSilverCoin == 0 || numGoldCoin == 0)
					JOptionPane.showMessageDialog(null, "AN ERROR OCCURED\n ~ Your input is outside the given range (1-15). \n ~ Your input is not numeric.", "COIN CONVERSION FAILED!", JOptionPane.ERROR_MESSAGE);
				
				if (numBronzeCoin != 0 && numSilverCoin != 0 && numGoldCoin != 0) {
					
					
					txtfldBronze.setText("");
					txtfldSilver.setText("");
					txtfldGold.setText("");
					
					for (RentComputer rentComputer : rentComputers) {
			            rentComputer.BronzeCoin = numBronzeCoin;
			            rentComputer.SilverCoin = numSilverCoin;
			            rentComputer.GoldCoin = numGoldCoin;
			            
			        }
					
					lblB.setText(String.valueOf(numBronzeCoin));
					lblS.setText(String.valueOf(numSilverCoin));
					lblG.setText(String.valueOf(numGoldCoin));
					
					frm.setVisible(false);
					frmHome.setVisible(true);
					
					
				}
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				String strBronzeCoin = txtfldBronze.getText();
				String strSilverCoin = txtfldSilver.getText();
				String strGoldCoin = txtfldGold.getText();
				
				if (strBronzeCoin.isEmpty() || strSilverCoin.isEmpty() || strGoldCoin.isEmpty()) {
					btnDone.setEnabled(false);
				}else {
					btnDone.setEnabled(true);
				}
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		

		this.add(lblHeader);
		this.add(pnlShopName);
		this.add(lblMechanics);
		this.add(btnDone);
		this.add(lblBronze);
		this.add(lblSilver);
		this.add(lblGold);
		this.add(txtfldBronze);
		this.add(txtfldSilver);
		this.add(txtfldGold);
		this.add(lblInstruct);
		
	}

}
