import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Gachapon extends JPanel{
	public Gachapon(String strPrize, String strDescription, String strImage, Color clr, CardLayout lmlayout, JPanel pnl) {
		
		URL imgurl = Home.class.getResource("/"+strImage);
		ImageIcon imgPrizePic = new ImageIcon(imgurl);
		
		this.setPreferredSize(new Dimension(600,400));
		this.setLayout(null);
		this.setBackground(clr);
		
		JLabel lblImage = new JLabel ();
		JLabel lblPrizeName = new JLabel();
		JLabel lblDescription = new JLabel();
		
		JButton btnContinue = new JButton ("CLICK TO CONTINUE");
		
		lblImage.setBounds(230, 50, 139, 148);
		lblImage.setIcon(imgPrizePic);
		
		lblPrizeName.setBounds(134, 204, 331, 36);
		lblPrizeName.setText("<html><center><b>" + strPrize + "</b></center></html>");
		lblPrizeName.setFont(new Font("Montserrat", Font.BOLD, 20));
		lblPrizeName.setHorizontalAlignment(JLabel.CENTER);

		lblDescription.setText("<html><center>" + strDescription + "</center></html>");
		lblDescription.setBounds(82, 240, 436, 57);
		lblDescription.setVerticalAlignment(JLabel.TOP);
		lblDescription.setFont(new Font("Montserrat", Font.PLAIN, 13));
		lblDescription.setHorizontalAlignment(JLabel.CENTER);
		
		btnContinue.setBackground(Color.WHITE);
		btnContinue.setBounds(222, 305, 155, 30);
		btnContinue.setFont(new Font("Montserrat", Font.BOLD, 11));
		btnContinue.setBorder(null);
		
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmlayout.next(pnl);
			}
		});
		
		
		
		this.add(lblImage);
		this.add(lblPrizeName);
		this.add(lblDescription);
		this.add(btnContinue);
		
		
	}

}
