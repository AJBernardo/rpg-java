import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class RentComputer extends JPanel {
	
	static int BronzeCoin;
	static int SilverCoin;
	static int GoldCoin;
	
	int hr = 0;
	int min = 0;
	int sec = 0;
	int duration = 0;
	Timer t;
	
	public RentComputer(int x, int y, JLabel lblB, JLabel lblS, JLabel lblG) {
		
		URL imgurlReset = RentComputer.class.getResource("/reset.png");
		ImageIcon imgReset = new ImageIcon(imgurlReset);
		
		URL imgurlBronze = RentComputer.class.getResource("/bronze.png");
		ImageIcon imgBronze = new ImageIcon(imgurlBronze);
		
		URL imgurlSilver = RentComputer.class.getResource("/silver.png");
		ImageIcon imgSilver = new ImageIcon(imgurlSilver);
		
		URL imgurlGold = RentComputer.class.getResource("/gold.png");
		ImageIcon imgGold = new ImageIcon(imgurlGold);
		
		URL imgurlComputer = RentComputer.class.getResource("/computer.png");
		ImageIcon imgComputer = new ImageIcon(imgurlComputer);
		
		URL imgurlKeyboard = RentComputer.class.getResource("/keyboard.png");
		ImageIcon imgKeyboard = new ImageIcon(imgurlKeyboard);
		
		this.setBounds(x, y, 360, 686);
		this.setBackground(new Color(147, 82, 82));
		this.setLayout(null);
		
		
		JPanel pnlPisoNet = new JPanel();
		JPanel pnlTimer = new JPanel();
		
		JButton btnReset = new JButton();
		JButton btnBronzeCoinSlot = new JButton();
		JButton btnSilverCoinSlot = new JButton();
		JButton btnGoldCoinSlot = new JButton();
		
		JLabel lblTimer = new JLabel("00 : 00 : 00");
		JLabel lblComputer = new JLabel();
		JLabel lblKeyboard = new JLabel();
		
		pnlPisoNet.setBounds(12, 21, 336, 144);
		pnlPisoNet.setBackground(new Color(148, 125, 125));
		pnlPisoNet.setLayout(null);
		
		pnlTimer.setBounds(13, 15, 233, 50);
		pnlTimer.setBackground(new Color(217, 217, 217));
		
		lblTimer.setPreferredSize(new Dimension(233, 50));
		lblTimer.setFont(new Font("Montserrat", Font.BOLD, 30));
		lblTimer.setHorizontalAlignment(JLabel.CENTER);
		lblTimer.setVerticalAlignment(JLabel.TOP);
		
		lblComputer.setBounds(0, 123, 360, 401);
		lblComputer.setIcon(imgComputer);
		
		lblKeyboard.setBounds(0, 514, 360, 162);
		lblKeyboard.setIcon(imgKeyboard);	
		
		btnReset.setBounds(257, 15, 68, 50);
		btnReset.setIcon(imgReset);
		
		btnBronzeCoinSlot.setBounds(13, 77, 98, 50);
		btnBronzeCoinSlot.setIcon(imgBronze);
		
		btnSilverCoinSlot.setBounds(120, 77, 98, 50);
		btnSilverCoinSlot.setIcon(imgSilver);
		
		btnGoldCoinSlot.setBounds(227, 77, 98, 50);
		btnGoldCoinSlot.setIcon(imgGold);
		
		t = new Timer (1000/10, e -> {
			formatTime(lblTimer);
			
			if (sec > 0 && sec < 60) {
                sec--;
            } else {
                if (min > 0 && min < 60) {
                    min--;
                    sec = 59;
                } else {
                    if (hr > 0 && hr < 60) {
                        hr--;
                        min = 59;
                        sec = 59;
                    } else {
                        t.stop(); 
                   }
                }
            }

			repaint();
		});
		
		btnBronzeCoinSlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(BronzeCoin > 0) {
					if (min < 56) {
						min += 4;
					}else {
						if (hr <= 23) {
							hr +=1;
							min = ((min + 4) % 60);
						}
					}
					BronzeCoin--;
				}
				else {
					lblB.setText("0");
					JOptionPane.showMessageDialog(null, "YOU HAVE RUN OUT OF BRONZE COINS!!!", "NOT ENOUGH COIN BALANCE!", JOptionPane.ERROR_MESSAGE);
				}
				t.start();
				
			}
		});
		
		btnSilverCoinSlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(SilverCoin > 0) {
					if (min < 30) {
						min += 30;
					}else {
						if (hr <= 23) {
							hr +=1;
							min = ((min + 30) % 60);
						}
					}
					SilverCoin--;
				}else {
					lblS.setText("0");
					JOptionPane.showMessageDialog(null, "YOU HAVE RUN OUT OF SILVER COINS!!!", "NOT ENOUGH COIN BALANCE!", JOptionPane.ERROR_MESSAGE);
				}
				t.start();
			}
		});
		
		btnGoldCoinSlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(GoldCoin > 0) {
					if (hr < 24)
						hr += 1;
					
					GoldCoin--;
				}else {
					lblG.setText("0");
					JOptionPane.showMessageDialog(null, "YOU HAVE RUN OUT OF GOLD COINS!!!", "NOT ENOUGH COIN BALANCE!", JOptionPane.ERROR_MESSAGE);
				}
				//System.out.print(GoldCoin);
				t.start();
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sec = 0;
				min = 0;
				hr = 0;
				t.start();
			}
		});
		
		
		
		pnlTimer.add(lblTimer);
		pnlPisoNet.add(pnlTimer);
		pnlPisoNet.add(btnReset);
		pnlPisoNet.add(btnBronzeCoinSlot);
		pnlPisoNet.add(btnSilverCoinSlot);
		pnlPisoNet.add(btnGoldCoinSlot);
		this.add(pnlPisoNet);
		this.add(lblComputer);
		this.add(lblKeyboard);
		
	}
	
	public void formatTime(JLabel lblTimer) {
		
		if (hr == 0 && min == 0 && sec == 0) {
			lblTimer.setText("0" + hr + " : 0" + min + " : 0" + sec);
		}else{
			
			if(hr < 10) {
				if(min < 10) {
					if (sec < 10) {
						lblTimer.setText("0" + hr + " : 0" + min + " : 0" + sec);
					}else {
						lblTimer.setText("0" + hr + " : 0" + min + " : " + sec);
					}
				}else {
					if (sec < 10) {
						lblTimer.setText("0" + hr + " : " + min + " : 0" + sec);
					}else {
						lblTimer.setText("0" + hr + " : " + min + " : " + sec);
					}
				}
			}else {
				if(min < 10) {
					if (sec < 10) {
						lblTimer.setText(hr + " : 0" + min + " : 0" + sec);
					}else {
						lblTimer.setText(hr + " : 0" + min + " : " + sec);
					}
				}else {
					if (sec < 10) {
						lblTimer.setText(hr + " : " + min + " : 0" + sec);
					}else {
						lblTimer.setText(hr + " : " + min + " : " + sec);
					}
				}
			}
			
			
		}
		
	}
	
}
