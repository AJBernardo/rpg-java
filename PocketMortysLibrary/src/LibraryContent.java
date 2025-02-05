import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LibraryContent extends JPanel{

	public LibraryContent(String strName, String strHealth, String strPhoto, int x, int y, String strElement, String strDescription, String strIcon, String strAttack, String strDamage, String strAtkDescrip) {
		
		//IMAGEURL FOR THE PHOTO OF THE MORTY AND ITS RESPECTIVE GROUP ELEMENT (ROCK, PAPER, SCISSOR)
		URL imgurlHolder = Home.class.getResource("/" + strPhoto);
		ImageIcon imgHolder = new ImageIcon(imgurlHolder);
		
		URL imgurlElement = Home.class.getResource("/" + strElement);
		ImageIcon imgElement = new ImageIcon(imgurlElement);
		
		URL imgurlIcon = Home.class.getResource("/" + strIcon);
		ImageIcon imgIcon = new ImageIcon(imgurlIcon);
		
		//LIBRARYCONTENT SETTINGS
		this.setBounds(x, y, 270, 380);
		this.setBackground(new Color(114, 32, 32));
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		
		//CREATING JLABELS
		JLabel lblName = new JLabel(strName);
		JLabel lblHealth = new JLabel(strHealth);
		JLabel lblPhoto = new JLabel();
		JLabel lblElement = new JLabel();
		JLabel lblDescription = new JLabel("<html><center>"+ strDescription + "</center></html>");
		JLabel lblIcon = new JLabel();
		JLabel lblAttack = new JLabel(strAttack);
		JLabel lblDamage = new JLabel(strDamage);
		JLabel lblAtkDescrip = new JLabel("<html><center>"+ strAtkDescrip + "</center></html>");
		
		//CREATING JPANELS
		JPanel pnlAttack = new JPanel();
		JPanel pnlAction = new JPanel();
		JPanel pnlDamage = new JPanel();
		JPanel pnlAtkDescrip = new JPanel();
		
		//ALL LABEL SETTINGS
		lblName.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblName.setForeground(new Color(255, 255, 189));
		lblName.setBounds(17, 8, 185, 28);
		
		lblHealth.setFont(new Font("Montserrat", Font.BOLD, 12));
		lblHealth.setForeground(new Color(255, 255, 189));
		lblHealth.setBounds(205, 8, 50, 28);
		
		lblPhoto.setBounds(17, 36, 235, 135);
		lblPhoto.setIcon(imgHolder);
		
		lblElement.setBounds(17, 177, 235, 26);
		lblElement.setIcon(imgElement);
		
		lblDescription.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblDescription.setForeground(Color.WHITE);
		lblDescription.setBounds(17, 205, 235, 50);
		
		lblIcon.setBounds(0, 0, 27, 27);
		lblIcon.setIcon(imgIcon);
		
		lblAttack.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblAttack.setForeground(Color.BLACK);
		lblAttack.setBounds(33, 0, 140, 27);
		
		lblDamage.setFont(new Font("Montserrat", Font.BOLD, 16));
		lblDamage.setForeground(Color.WHITE);
		lblDamage.setBounds(0, 0, 45, 27);
		
		lblAtkDescrip.setFont(new Font("Montserrat", Font.PLAIN, 12));
		lblAtkDescrip.setForeground(Color.WHITE);
		lblAtkDescrip.setBounds(0, 0, 228, 72);
		lblAtkDescrip.setVerticalAlignment(JLabel.TOP);
		
		//ALL PANELS SETTINGS
		//MAIN PANEL
		pnlAttack.setBounds(17, 260, 235, 95);
		pnlAttack.setBackground(new Color(255, 255, 189));
		pnlAttack.setLayout(null);
		
		pnlAction.setBounds(5, 5, 167, 27);
		pnlAction.setBackground(new Color(242, 184, 184));
		pnlAction.setLayout(null);
		
		pnlDamage.setBounds(176, 5, 53, 27);
		pnlDamage.setBackground(new Color(168, 64, 64));
		
		pnlAtkDescrip.setBounds(5, 37, 225, 52);
		pnlAtkDescrip.setBackground(new Color(199, 110, 110));
		pnlAtkDescrip.setLayout(null);
		
		//ADDING THE COMPONENTS TO A FRAME/PANEL
		pnlAction.add(lblIcon);
		pnlAction.add(lblAttack);
		pnlDamage.add(lblDamage);
		pnlAtkDescrip.add(lblAtkDescrip);
		pnlAttack.add(pnlAction);
		pnlAttack.add(pnlDamage);
		pnlAttack.add(pnlAtkDescrip);
		this.add(lblName);
		this.add(lblHealth);
		this.add(lblPhoto);
		this.add(lblElement);
		this.add(lblDescription);
		this.add(pnlAttack);
		
	}
}
