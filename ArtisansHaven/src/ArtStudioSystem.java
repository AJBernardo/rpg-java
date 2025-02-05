import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ArtStudioSystem {
	
	static int count = 0;
	static int count1 = 0;
	static int count2 = 1;
	static int count3 = 2;
	static int count4 = 3;
	static float fltTotal = 0;

	public static void main(String[] args) {
		
		//IMAGES FOR THE HOME PAGE
		
		URL imgurl1 = ArtStudioSystem.class.getResource("/icon2.jpg");
		ImageIcon imgicon = new ImageIcon(imgurl1);
		
		URL imgurl2 = ArtStudioSystem.class.getResource("/header.png");
		ImageIcon header = new ImageIcon(imgurl2);
		
		URL imgurl3 = ArtStudioSystem.class.getResource("/home.png");
		ImageIcon home = new ImageIcon(imgurl3);
		
		
		JFrame frm1 = new JFrame("Artisan's Haven");
		JFrame frm2 = new JFrame ("Artisan's Haven");
		

		// ALL PANELS
		JPanel pnlh1 = new JPanel();
		JPanel pnlh2 = new JPanel();
		JPanel pnlNav = new JPanel();
		JPanel pnlContent = new JPanel();
		JPanel pnlSide = new JPanel();
		JPanel pnlFooter = new JPanel();
		JPanel pnlF1 = new JPanel();
		JPanel pnlF2 = new JPanel();
		JPanel pnlF3 = new JPanel();
		JPanel pnlA = new JPanel();
		JPanel pnlB = new JPanel();
		JPanel pnlC = new JPanel();
		JPanel pnlD = new JPanel();
		JPanel pnlE = new JPanel();
		JPanel pnlF = new JPanel();
		JPanel pnlG = new JPanel();
		JPanel pnlH = new JPanel();
		JPanel pnlI = new JPanel();	
		
		// ALL LABELS
		JLabel lbltitle = new JLabel();
		JLabel lblsubtitle = new JLabel();
		JLabel lbltext = new JLabel("SEE OUR FUN MOMENTS HERE IN OUR GALLERY");
		JLabel lblfooter = new JLabel ("© ARTISAN'S HAVEN 2024");
		JLabel lblside = new JLabel ("YOUR CART");
		JLabel lblart_title = new JLabel();
		JLabel lblart_box = new JLabel();
		JLabel lblart_price = new JLabel();
		JLabel lblpot_title = new JLabel();
		JLabel lblpot_box = new JLabel();
		JLabel lblpot_price = new JLabel();
		JLabel lblbook_title1 = new JLabel("BOOK AN APPOINTMENT");
		JLabel lblbook_title2 = new JLabel("BOOK AN APPOINTMENT");
		JLabel lblart_package = new JLabel("PACKAGE: ");
		JLabel lblpot_package = new JLabel("PACKAGE: ");
		JLabel lblart_class = new JLabel();
		JLabel lblpot_class = new JLabel();
		JLabel lblart_tag = new JLabel("PRICE:");
		JLabel lblpot_tag = new JLabel("PRICE:");
		JLabel lblart_pricetag = new JLabel();
		JLabel lblpot_pricetag = new JLabel();
		JLabel lbl_name1 = new JLabel("Name");
		JLabel lbl_name2 = new JLabel("Name");
		JLabel lbl_contact1 = new JLabel("Mobile Number");
		JLabel lbl_contact2 = new JLabel("Mobile Number");
		JLabel lbl_num1 = new JLabel ("+63");
		JLabel lbl_num2 = new JLabel ("+63");
		JLabel lbl_month1 = new JLabel("Month");
		JLabel lbl_month2 = new JLabel("Month");
		JLabel lbl_day1 = new JLabel("Day");
		JLabel lbl_day2 = new JLabel("Day");
		JLabel lbl_year1 = new JLabel("2024");
		JLabel lbl_year2 = new JLabel("2024");
		JLabel lbl_time1 = new JLabel("Time");
		JLabel lbl_time2 = new JLabel("Time");
		
		//ALL NAVIGATION BUTTONS
		JButton btnA = new JButton("HOME");
		JButton btnB = new JButton("ART CLASSES");
		JButton btnC = new JButton("POTTERY CLASSES");
		JButton btnD = new JButton("SHOP");
		
		//ALL OTHER BUTTONS
		JButton btnStart =  new JButton ("Get Started!");
		JButton btnBack = new JButton ("<");
		JButton btnNext =  new JButton (">");
		JButton btnBook1 =  new JButton ("BOOK NOW");
		JButton btnBook2 =  new JButton ("BOOK NOW");
		JButton btnBacktoArt = new JButton ("< BACK");
		JButton btnBacktoPot = new JButton ("< BACK");
		JButton btnConfirmArt = new JButton ("CONFIRM BOOKING");
		JButton btnConfirmPot = new JButton ("CONFIRM BOOKING");
		JButton btnClear = new JButton ("CLEAR");
		JButton btnBuy = new JButton ("BUY");
		
		//ALL RADIO BUTTONS FOR BOOKING
		JRadioButton rb_morning1 = new JRadioButton("MORNING");
		JRadioButton rb_morning2 = new JRadioButton("MORNING");
		JRadioButton rb_afternoon1 = new JRadioButton("AFTERNOON");
		JRadioButton rb_afternoon2 = new JRadioButton("AFTERNOON");
		JRadioButton rb_evening1 = new JRadioButton("EVENING");
		JRadioButton rb_evening2 = new JRadioButton("EVENING");
		
		//BUTTON GROUPS FOR THE RADIO BUTTONS
		ButtonGroup btngrp1 = new ButtonGroup();
		ButtonGroup btngrp2 = new ButtonGroup();
		
		//ALL TEXTFIELDS FOR BOOKING
		JTextField txtfld_name1 = new JTextField();
		JTextField txtfld_name2 = new JTextField();
		JTextField txtfld_contact1 = new JTextField();
		JTextField txtfld_contact2 = new JTextField();
		JTextField txtfld_month1 = new JTextField();
		JTextField txtfld_month2 = new JTextField();
		JTextField txtfld_day1 = new JTextField();
		JTextField txtfld_day2 = new JTextField();
	
		//FRAME 1 SETTINGS
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm1.setVisible(true);
        frm1.setSize(1080, 720);
        frm1.setLayout(new BorderLayout());
        frm1.setIconImage(imgicon.getImage());
        frm1.setLocationRelativeTo(null);
        
        //FRAME 2 SETTINGS
        frm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm2.setSize(1080, 720);
        frm2.setLayout(new BorderLayout());
        frm2.getContentPane().setBackground(new Color(252,244,212));
        frm2.setIconImage(imgicon.getImage());
        frm2.setLocationRelativeTo(null);
        
        
        //PANEL 1 (FOR FRAME1) SETTINGS 
        pnlh1.setBackground(new Color(252,244,212));
        JLabel imgheader = new JLabel(header); //to insert the image
        
        //PANEL 2 (FOR FRAME1) SETTINGS
        pnlh2.setLayout(new BoxLayout(pnlh2, BoxLayout.Y_AXIS));
        pnlh2.setBackground(new Color(250,251,213));
        
        //PANEL NAVIGATION SETTINGS
        pnlNav.setLayout(new GridLayout());
        pnlNav.setPreferredSize(new Dimension(0, 60));
        pnlNav.setBackground(new Color(119,137,139));
        
        
        //PANEL CONTENT SETTINGS
        pnlContent.setBackground(new Color(228,226,211));
        JLabel imghome = new JLabel(home); //to insert the image
        CardLayout lmCard = new CardLayout();
		pnlContent.setLayout(lmCard);
		
		//PANEL A SETTINGS (HOME PANEL)
		pnlA.setBackground(new Color(228,226,211));
		
		// PANEL B SETTINGS (ART CLASSES PANEL)
		pnlB.setBackground(new Color(228,226,211));
		pnlB.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		
		String[][] art_packages = {
				{"ART PACKAGE 1", "a1.png", "ap1.png", "999.00"},
				{"ART PACKAGE 2", "a2.png", "ap2.png", "1499.00"},
				{"ART PACKAGE 3", "a3.png", "ap3.png", "1299.00"},
				{"ART PACKAGE 4", "a4.png", "ap4.png", "2099.00"},
				{"ART PACKAGE 5", "a5.png", "ap5.png", "2099.00"},
				{"ART PACKAGE 6", "a6.png", "ap6.png", "1099.00"}
			};
			
		for (String[] art_package : art_packages) {
			
			URL imgArt = ArtStudioSystem.class.getResource("/" + art_package[1]);
			ImageIcon artpack = new ImageIcon(imgArt);
			
			URL imgArtBox = ArtStudioSystem.class.getResource("/" + art_package[2]);
			ImageIcon artbox = new ImageIcon(imgArtBox);
			
			JButton btnArtPackage = new JButton();
			btnArtPackage.setIcon(artpack);
			btnArtPackage.setPreferredSize(new Dimension(200,300));
			pnlB.add(btnArtPackage);
			
			btnArtPackage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblart_title.setText(art_package[0]);
					lblart_title.setFont(new Font("Montserrat", Font.BOLD, 14));
					lblart_box.setIcon(artbox);
					lblart_price.setText("Php " + art_package[3]);
					lblart_price.setFont(new Font("Montserrat", Font.BOLD, 14));
					btnBook1.setVisible(true);
					
					lblart_class.setText(art_package[0]);
					lblart_pricetag.setText("Php " + art_package[3]);
				}
			});
			
		}
		
		//PANEL C SETTINGS (POTTERY CLASSES PANEL)
		pnlC.setBackground(new Color(228,226,211));
		pnlC.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		String[][] pottery_packages = {
				{"POTTERY CLASS PACKAGE 1", "p1.png", "pp1.png", "2500.00"},
				{"POTTERY CLASS PACKAGE 2", "p2.png", "pp2.png", "3099.00"},
				{"POTTERY CLASS PACKAGE 3", "p3.png", "pp3.png", "3999.00"},
				{"POTTERY CLASS PACKAGE 4", "p4.png", "pp4.png", "5000.00"},
				{"POTTERY CLASS PACKAGE 5", "p5.png", "pp5.png", "8000.00"},
				{"POTTERY CLASS PACKAGE 6", "p6.png", "pp6.png", "7000.00"}
			};
			
		for (String[] pottery_package : pottery_packages) {
			
			URL imgPot = ArtStudioSystem.class.getResource("/" + pottery_package[1]);
			ImageIcon potterypack = new ImageIcon(imgPot);
			
			URL imgPotBox = ArtStudioSystem.class.getResource("/" + pottery_package[2]);
			ImageIcon potbox = new ImageIcon(imgPotBox);
			
			JButton btnPotteryPackage = new JButton();
			btnPotteryPackage.setIcon(potterypack);
			btnPotteryPackage.setPreferredSize(new Dimension(200,300));
			pnlC.add(btnPotteryPackage);
			
			btnPotteryPackage.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					lblpot_title.setText(pottery_package[0]);
					lblpot_title.setFont(new Font("Montserrat", Font.BOLD, 14));
					lblpot_box.setIcon(potbox);
					lblpot_price.setText("Php " + pottery_package[3]);
					lblpot_price.setFont(new Font("Montserrat", Font.BOLD, 14));
					btnBook2.setVisible(true);
					
					lblpot_class.setText(pottery_package[0]);
					lblpot_pricetag.setText("Php " + pottery_package[3]);
					
				}
			});
		}
		
		//PANEL D & G SETTINGS (SHOP PANEL)
		pnlD.setBackground(new Color(228,226,211));
		pnlD.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		lblside.setBounds(80, 15, 100, 30);
		lblside.setFont(new Font("Montserrat", Font.BOLD, 15));
		JLabel lblItem = new JLabel("<html>");
		lblItem.setBounds(25, 50, 200, 480);
		lblItem.setVerticalAlignment(JLabel.TOP);
		
		pnlG.add(lblside);
		pnlG.add(lblItem);

	
		JLabel lblTotal = new JLabel("TOTAL: ");
		lblTotal.setBounds(25, 550, 200, 20);
		lblTotal.setPreferredSize(new Dimension(100,50));
		pnlG.add(lblTotal);
		
		String[][] shop_items = {
				{"SAKURA CANVAS BAG", "11.png", "399.00", "a"},
				{"KOI CANVAS BAG", "12.png", "449.00", "a"},
				{"OCEAN CANVAS BAG", "13.png", "499.00", "a"},
				{"CUSTOMIZED PAITNING", "14.png", "499.00", "a"},
				{"CUSTOMIZED SKETCH", "15.png", "499.00", "a"},
				{"CUSTOMIZED WATERPAINTING", "16.png", "499.00", "a"},
				{"GHIBLI MUGS", "17.png", "499.00", "a"},
				{"VILLA PLATE SET", "18.png", "1299.00", "a"},
				{"RABBIT SPOON SET", "19.png", "749.00", "a"}
			};
			
		for (String[] shop_item : shop_items) {
			
			URL imgItem = ArtStudioSystem.class.getResource("/" + shop_item[1]);
			ImageIcon item1 = new ImageIcon(imgItem);
			
			JButton btnShopItem = new JButton();
			btnShopItem.setIcon(item1);
			btnShopItem.setPreferredSize(new Dimension(200,200));
			btnShopItem.setBorder(null);
			pnlD.add(btnShopItem);
			
			
			btnShopItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					count += 1;
					
					if (count == 17) {
						lblItem.setVerticalAlignment(JLabel.BOTTOM);
					}
					
					
					String strReceipt = lblItem.getText();
					lblItem.setText(strReceipt + shop_item[0] + ":" + "<br/>"+ "&emsp;Php " + shop_item[2] + "   x 1.00" + "<br/>");
					lblItem.setFont(new Font("Courier New", Font.PLAIN, 12));

					fltTotal += Float.parseFloat(shop_item[2]);
					lblTotal.setText("TOTAL: PHP " + fltTotal + "");
				}
			});
		}
        // red 200,95,49
        
        //PANEL SIDE SETTINGS
        pnlSide.setVisible(false);
        CardLayout lmCardSide = new CardLayout();
		pnlSide.setLayout(lmCardSide);
        
		//ALL SIDE PANELS (PANEL E TO PANEL I) SETTINGS
		pnlE.setPreferredSize(new Dimension(250,0));
		pnlE.setBackground(new Color(220,219,214));
		pnlF.setPreferredSize(new Dimension(250,0));
		pnlF.setBackground(new Color(220,219,214));
		pnlG.setPreferredSize(new Dimension(250,0));
		pnlG.setBackground(new Color(220,219,214));
		pnlG.setLayout(null);
		pnlH.setPreferredSize(new Dimension(250,0));
		pnlH.setBackground(new Color(220,219,214));
		pnlH.setLayout(null);
		pnlI.setPreferredSize(new Dimension(250,0));
		pnlI.setBackground(new Color(220,219,214));
		pnlI.setLayout(null);
		
		
		//PANEL H SETTINGS
		lblbook_title1.setBounds(25, 50, 200, 50);
		lblbook_title1.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblbook_title1.setHorizontalAlignment(JLabel.CENTER);
		lblbook_title1.setVerticalAlignment(JLabel.CENTER);
		
		lblart_package.setBounds(20, 140, 85, 15);
		lblart_package.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lblart_class.setBounds(40, 160, 230, 15);
		lblart_class.setFont(new Font("Montserrat", Font.BOLD, 12));
		
		lblart_tag.setBounds(20, 200, 85, 15);
		lblart_tag.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lblart_pricetag.setBounds(40, 220, 100, 15);
		lblart_pricetag.setFont(new Font("Montserrat", Font.BOLD, 12));
		
		lbl_name1.setBounds(20, 260, 100, 15);
		lbl_name1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_contact1.setBounds(20, 320, 200, 15);
		lbl_contact1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_num1.setBounds(30, 345, 30, 15);
		lbl_num1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_month1.setBounds(20, 380, 80, 15);
		lbl_month1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_day1.setBounds(130, 380, 80, 15);
		lbl_day1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_year1.setBounds(190, 400, 60, 30);
		lbl_year1.setFont(new Font("Montserrat", Font.PLAIN, 16));
		
		lbl_time1.setBounds(20, 440, 60, 15);
		lbl_time1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		txtfld_name1.setBounds(30, 280, 200, 30);
		txtfld_name1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_name1.setBackground(new Color(119,137,139));
		txtfld_name1.setForeground(new Color(228,226,211));
		
		
		txtfld_contact1.setBounds(60, 340, 170, 30);
		txtfld_contact1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_contact1.setBackground(new Color(119,137,139));
		txtfld_contact1.setForeground(new Color(228,226,211));
		
		
		txtfld_month1.setBounds(30, 400, 100, 30);
		txtfld_month1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_month1.setBackground(new Color(119,137,139));
		txtfld_month1.setForeground(new Color(228,226,211));
		
		
		txtfld_day1.setBounds(140, 400, 40, 30);
		txtfld_day1.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_day1.setBackground(new Color(119,137,139));
		txtfld_day1.setForeground(new Color(228,226,211));
		
		
		rb_morning1.setBounds(30, 460, 100, 20);
		rb_morning1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_morning1.setBackground(new Color(220,219,214));
		
		rb_afternoon1.setBounds(30, 490, 120, 20);
		rb_afternoon1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_afternoon1.setBackground(new Color(220,219,214));
		
		rb_evening1.setBounds(30, 520, 100, 20);
		rb_evening1.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_evening1.setBackground(new Color(220,219,214));
		
		//PANEL I SETTINGS
		lblbook_title2.setBounds(25, 50, 200, 50);
		lblbook_title2.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblbook_title2.setHorizontalAlignment(JLabel.CENTER);
		lblbook_title2.setVerticalAlignment(JLabel.CENTER);
		
		lblpot_package.setBounds(20, 140, 85, 15);
		lblpot_package.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lblpot_class.setBounds(40, 160, 230, 15);
		lblpot_class.setFont(new Font("Montserrat", Font.BOLD, 12));
		
		lblpot_tag.setBounds(20, 200, 85, 15);
		lblpot_tag.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lblpot_pricetag.setBounds(40, 220, 100, 15);
		lblpot_pricetag.setFont(new Font("Montserrat", Font.BOLD, 12));
		
		lbl_name2.setBounds(20, 260, 100, 15);
		lbl_name2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_contact2.setBounds(20, 320, 200, 15);
		lbl_contact2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_num2.setBounds(30, 345, 30, 15);
		lbl_num2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_month2.setBounds(20, 380, 80, 15);
		lbl_month2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_day2.setBounds(130, 380, 80, 15);
		lbl_day2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		lbl_year2.setBounds(190, 400, 60, 30);
		lbl_year2.setFont(new Font("Montserrat", Font.PLAIN, 16));
		
		lbl_time2.setBounds(20, 440, 60, 15);
		lbl_time2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		
		txtfld_name2.setBounds(30, 280, 200, 30);
		txtfld_name2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_name2.setBackground(new Color(119,137,139));
		txtfld_name2.setForeground(new Color(228,226,211));
		
		txtfld_contact2.setBounds(60, 340, 170, 30);
		txtfld_contact2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_contact2.setBackground(new Color(119,137,139));
		txtfld_contact2.setForeground(new Color(228,226,211));
		
		txtfld_month2.setBounds(30, 400, 100, 30);
		txtfld_month2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_month2.setBackground(new Color(119,137,139));
		txtfld_month2.setForeground(new Color(228,226,211));
		
		txtfld_day2.setBounds(140, 400, 40, 30);
		txtfld_day2.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtfld_day2.setBackground(new Color(119,137,139));
		txtfld_day2.setForeground(new Color(228,226,211));
		
		rb_morning2.setBounds(30, 460, 100, 20);
		rb_morning2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_morning2.setBackground(new Color(220,219,214));
		
		rb_afternoon2.setBounds(30, 490, 120, 20);
		rb_afternoon2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_afternoon2.setBackground(new Color(220,219,214));
		
		rb_evening2.setBounds(30, 520, 100, 20);
		rb_evening2.setFont(new Font("Montserrat", Font.PLAIN, 12));
		rb_evening2.setBackground(new Color(220,219,214));
		
//ALL PANEL FOOTER AND OTHER PANELS IN IT - SETTINGS	
        //PANEL FOOTER SETTINGS
        pnlFooter.setPreferredSize(new Dimension(0, 280));
        pnlFooter.setBackground(new Color(119,137,139));
        pnlFooter.setLayout(new BorderLayout());
        
        //PANEL F1 SETTINGS
        pnlF1.setBackground(new Color(119,137,139));
        lbltext.setFont(new Font("Montserrat", Font.BOLD, 14));
        lbltext.setForeground(new Color(228,226,211));
        
        //PANEL F2 SETTINGS
        pnlF2.setBackground(new Color(119,137,139));
        pnlF2.add(btnBack);
        
        String[] gallery_pics = {
        		"1.png",
        		"2.png",
        		"3.png",
        		"4.png",
        		"5.png",
        		"6.png",
        		"7.png",
        		"8.png",
        		"9.png",
        		"10.png"
        };
        
        // PANEL AS IMAGE BOX1 (FOR GALLERY)
        URL imgurl4 = ArtStudioSystem.class.getResource("/" + gallery_pics[count1]);
		ImageIcon img1 = new ImageIcon(imgurl4);
		
        JLabel imgbox1 = new JLabel();
		imgbox1.setPreferredSize(new Dimension(200, 200));
	    imgbox1.setIcon(img1);
	    pnlF2.add(imgbox1);
	    
	    // PANEL AS IMAGE BOX2 (FOR GALLERY)
	    URL imgurl5 = ArtStudioSystem.class.getResource("/" + gallery_pics[count2]);
		ImageIcon img2 = new ImageIcon(imgurl5);
		
        JLabel imgbox2 = new JLabel();
		imgbox2.setPreferredSize(new Dimension(200, 200));
	    imgbox2.setIcon(img2);
	    pnlF2.add(imgbox2);
	    
	    // PANEL AS IMAGE BOX3 (FOR GALLERY)
	    URL imgurl6 = ArtStudioSystem.class.getResource("/" + gallery_pics[count3]);
		ImageIcon img3 = new ImageIcon(imgurl6);
		
        JLabel imgbox3 = new JLabel();
		imgbox3.setPreferredSize(new Dimension(200, 200));
	    imgbox3.setIcon(img3);
	    pnlF2.add(imgbox3);
	    
	    // PANEL AS IMAGE BOX4 (FOR GALLERY)
	    URL imgurl7 = ArtStudioSystem.class.getResource("/" + gallery_pics[count4]);
		ImageIcon img4 = new ImageIcon(imgurl7);
		
        JLabel imgbox4 = new JLabel();
		imgbox4.setPreferredSize(new Dimension(200, 200));
	    imgbox4.setIcon(img4);
	    pnlF2.add(imgbox4);
        
        //PANEL F3 SETTINGS
        pnlF3.setBackground(new Color(228,226,211)); 
        lblfooter.setFont(new Font("Montserrat", Font.BOLD, 12));
        lblfooter.setForeground(new Color(119,137,139));
        
        
//ALL LABELS SETTINGS 
        
        //LABEL TITLE SETTINGS
        lbltitle.setText("Welcome to Artisan's Haven: Your Ultimate Art and Pottery Studio!");
        lbltitle.setFont(new Font("Montserrat", Font.BOLD,16));
        lbltitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        
        //LABEL SUBTITLE SETTINGS
        lblsubtitle.setText("<html>At Artisan's Haven, we believe that creativity and self-expression are essential elements of a fulfilling life. <br> Our art and pottery studio is a haven for individuals seeking to explore their artistic side, learn new skills, <br> and connect with like-minded people.");
        lblsubtitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblsubtitle.setFont(new Font("Montserrat", Font.PLAIN, 12));
        lblsubtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

//ALL BUTTONS SETTINGS
        
        //BUTTON START SETTINGS (FOR FRAME1)
        btnStart.setBackground(new Color(252, 253, 234));
        btnStart.setFont(new Font("Montserrat", Font.BOLD, 14));
        btnStart.setBounds(540, 120, 100, 75);
        btnStart.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        //BUTTON HOME SETTINGS (FOR NAVIGATION)
        btnA.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnA.setBackground(new Color(119,137,139));
		btnA.setForeground(new Color(228,226,211));
		btnA.setBorder(null);
		pnlNav.add(btnA);
		
		//BUTTON ART CLASSES SETTINGS (FOR NAVIGATION)
		btnB.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnB.setBackground(new Color(119,137,139));
		btnB.setForeground(new Color(228,226,211));
		btnB.setBorder(null);
		pnlNav.add(btnB);
		
		//BUTTON POTTERY CLASSES SETTINGS (FOR NAVIGATION)
		btnC.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnC.setBackground(new Color(119,137,139));
		btnC.setForeground(new Color(228,226,211));
		btnC.setBorder(null);
		pnlNav.add(btnC);
		
		//BUTTON SHOP SETTINGS (FOR NAVIGATION)
		btnD.setFont(new Font("Montserrat", Font.BOLD, 14));
		btnD.setBackground(new Color(119,137,139));
		btnD.setForeground(new Color(228,226,211));
		btnD.setBorder(null);
		pnlNav.add(btnD);
        
        //BUTTON BACK SETTINGS (FOR GALLERY AT HOME)
        btnBack.setBounds(0, 130, 100, 100);
        btnBack.setFont(new Font("Montserrat", Font.BOLD, 20));
        btnBack.setBackground(new Color(228,226,211));
        btnBack.setEnabled(false);
        
        //BUTTON NEXT SETTINGS (FOR GALLERY AT HOME)
        btnNext.setBounds(980, 130, 100, 100);
        btnNext.setFont(new Font("Montserrat", Font.BOLD, 20));
        btnNext.setBackground(new Color(228,226,211));
        
        //BUTTON BOOK 1 SETTINGS (BOOKING IN ART CLASSES PANEL)
        btnBook1.setBounds(75, 0, 100, 75);
        btnBook1.setFont(new Font("Montserrat", Font.BOLD, 20));
        btnBook1.setForeground(new Color(228,226,211)); 
        btnBook1.setBackground(new Color(119,137,139));
        btnBook1.setVisible(false);
        
    	//BUTTON BOOK 2 SETTINGS (BOOKING IN POTTERY CLASSES PANEL)
        btnBook2.setBounds(75, 0, 100, 75);
        btnBook2.setFont(new Font("Montserrat", Font.BOLD, 20));
        btnBook2.setForeground(new Color(228,226,211)); 
        btnBook2.setBackground(new Color(119,137,139));
        btnBook2.setVisible(false);
        
        //BUTTON BACK TO ART SETTINGS
        btnBacktoArt.setBounds(10,10,90,20);
        btnBacktoArt.setFont(new Font("Montserrat", Font.BOLD, 15));
        btnBacktoArt.setForeground(new Color(119,137,139)); 
        btnBacktoArt.setBackground(new Color(220,219,214));
        btnBacktoArt.setBorder(null);
        
        //BUTTON BACK TO POT SETTINGS
        btnBacktoPot.setBounds(10,10,90,20);
        btnBacktoPot.setFont(new Font("Montserrat", Font.BOLD, 15));
        btnBacktoPot.setForeground(new Color(119,137,139)); 
        btnBacktoPot.setBackground(new Color(220,219,214));
        btnBacktoPot.setBorder(null);
        
        //BUTTON CONFIRM BOOKING ART SETTINGS
        btnConfirmArt.setBounds(25, 560, 200, 30);
        btnConfirmArt.setFont(new Font("Montserrat", Font.BOLD, 15));
        btnConfirmArt.setForeground(new Color(228,226,211)); 
        btnConfirmArt.setBackground(new Color(119,137,139));
        btnConfirmArt.setBorder(null);
        
        //BUTTON CONFIRM BOOKING POTTERY SETTINGS
        btnConfirmPot.setBounds(25, 560, 200, 30);
        btnConfirmPot.setFont(new Font("Montserrat", Font.BOLD, 15));
        btnConfirmPot.setForeground(new Color(228,226,211)); 
        btnConfirmPot.setBackground(new Color(119,137,139));
        btnConfirmPot.setBorder(null);
        
        //BUTTON CLEAR SETTINGS (FOR SHOP PANEL)
        btnClear.setBounds(25, 580, 100, 20);
        btnClear.setFont(new Font("Montserrat", Font.BOLD, 12));
        btnClear.setForeground(new Color(228,226,211)); 
        btnClear.setBackground(new Color(119,137,139));
        btnClear.setBorder(null);
        
        //BUTTON BACK SETTINGS (FOR SHOP PANEL)
        btnBuy.setBounds(130, 580, 100, 20);
        btnBuy.setFont(new Font("Montserrat", Font.BOLD, 12));
        btnBuy.setForeground(new Color(228,226,211)); 
        btnBuy.setBackground(new Color(119,137,139));
        btnBuy.setBorder(null);
        
        
        //ACTION LISTENER FOR NEXT FRAME
        btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frm1.setVisible(false);
        		frm2.setVisible(true);	
			}
        });
        
        
//ACTION LISTENER FOR FRAME2
        //ACTION LISTENER FOR GALLERY
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
            	
            	URL imgurl4 = ArtStudioSystem.class.getResource("/" + gallery_pics[--count1]);
        		ImageIcon img1 = new ImageIcon(imgurl4);
        		imgbox1.setIcon(img1);
        		
        		URL imgurl5 = ArtStudioSystem.class.getResource("/" + gallery_pics[--count2]);
        		ImageIcon img2 = new ImageIcon(imgurl5);
        		imgbox2.setIcon(img2);
        		
        		URL imgurl6 = ArtStudioSystem.class.getResource("/" + gallery_pics[--count3]);
        		ImageIcon img3 = new ImageIcon(imgurl6);
        		imgbox3.setIcon(img3);
        		
        		URL imgurl7 = ArtStudioSystem.class.getResource("/" + gallery_pics[--count4]);
        		ImageIcon img4 = new ImageIcon(imgurl7);
        		imgbox4.setIcon(img4);
        		
        		if (count1 == 0)  {
        			btnNext.setEnabled(true);
        			btnBack.setEnabled(false);
        		}else {
        			btnNext.setEnabled(true);
        			btnBack.setEnabled(true);
        		}
        		
        		
            }
        });
        
        //ACTION LISTENER FOR GALLERY
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	//count1 += 1;
        		//count2 += 1;
        		//count3 += 1;
        		//count4 += 1;
        		
        		URL imgurl4 = ArtStudioSystem.class.getResource("/" + gallery_pics[count1++]);
        		ImageIcon img1 = new ImageIcon(imgurl4);
        		imgbox1.setIcon(img1);
        		
        		URL imgurl5 = ArtStudioSystem.class.getResource("/" + gallery_pics[count2++]);
        		ImageIcon img2 = new ImageIcon(imgurl5);
        		imgbox2.setIcon(img2);
        		
        		URL imgurl6 = ArtStudioSystem.class.getResource("/" + gallery_pics[count3++]);
        		ImageIcon img3 = new ImageIcon(imgurl6);
        		imgbox3.setIcon(img3);
        		
        		URL imgurl7 = ArtStudioSystem.class.getResource("/" + gallery_pics[count4++]);
        		ImageIcon img4 = new ImageIcon(imgurl7);
        		imgbox4.setIcon(img4);
        		
        		if (count1 == 7) {
        			btnNext.setEnabled(false);
        			btnBack.setEnabled(true);
        		}else if (count1 == 0) {
        			btnNext.setEnabled(true);
        			btnBack.setEnabled(false);	
        		}else {
        			btnNext.setEnabled(true);
        			btnBack.setEnabled(true);
        		}
            	
            	
        		

            }
        });
        
        //ACTION LISTENER FOR NAVIGATING TO HOME PANEL
        btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "A");
				pnlSide.setVisible(false);
				pnlFooter.setVisible(true);
			}
		});
        
        //ACTION LISTENER FOR NAVIGATING TO ART CLASSES PANEL
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "B");
				lmCardSide.show(pnlSide, "E");
				pnlSide.setVisible(true);
				pnlFooter.setVisible(false);
				
			}
		});
		
		//ACTION LISTENER FOR NAVIGATING TO POTTERY CLASSES PANEL
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "C");
				lmCardSide.show(pnlSide, "F");
				pnlSide.setVisible(true);
				pnlFooter.setVisible(false);
			}
		});
		
		//ACTION LISTENER FOR NAVIGATING TO SHOP PANEL
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCard.show(pnlContent, "D");
				lmCardSide.show(pnlSide, "G");
				pnlSide.setVisible(true);
				pnlFooter.setVisible(false);
			}
		});
		
		//ACTION LISTENER TO BUY THE PRODUCTS (SHOP)
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count == 0) {
					JOptionPane.showMessageDialog(null, "Please make sure that your cart is not empty!", "ADD AN ITEM TO CONTINUE",
                            JOptionPane.ERROR_MESSAGE);
				}else {
					String address = JOptionPane.showInputDialog(null, "Please enter your address for the shipment", "DELIVERY DETAILS", JOptionPane.INFORMATION_MESSAGE);
					
					if (address != null && !address.isEmpty()) {
						String contact = JOptionPane.showInputDialog(null, "Please enter your mobile number for the shipment", "DELIVERY DETAILS", JOptionPane.INFORMATION_MESSAGE);
						
						if (contact != null && !contact.isEmpty()) {
							JOptionPane.showMessageDialog(null, "<html>THANK YOU FOR SHOPPING WITH US! <br/> We will try to deliver your merchandise in 3-5 days. <br/> Please try to keep your line open at any time so we can deliver the products at your door with ease! :)", "ARTISAN'S HAVEN : YOUR ULTIMATE ART & POTTERY STUDIO",
				                    JOptionPane.PLAIN_MESSAGE);
							
							lblItem.setText("<html>");
							lblItem.setVerticalAlignment(JLabel.TOP);
							lblTotal.setText("TOTAL: ");
							fltTotal = 0;
							count = 0;
						}
					}
				}

			}
		});
		
		//ACTION LISTENER TO CLEAR YOUR CART (SHOP)
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblItem.setText("<html>");
				lblItem.setVerticalAlignment(JLabel.TOP);
				lblTotal.setText("TOTAL: ");
				fltTotal = 0;
				count = 0;
			}
		});
		
		//ACTION LISTENER TO BOOK AN APPOINTMENT (ART CLASSES)
		btnBook1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCardSide.show(pnlSide, "H");
			}
		});
		
		//ACTION LISTENER TO BOOK AN APPOINTMENT (POTTERY CLASSES)
		btnBook2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCardSide.show(pnlSide, "I");
			}
		});

		btnBacktoArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCardSide.show(pnlSide, "E");
			}
		});
		
		btnBacktoPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lmCardSide.show(pnlSide, "F");
			}
		});
		
		//ACTION LISTENER TO CONFIRM AN APPOINTMENT (ART CLASSES)
		btnConfirmArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFilledDetails(txtfld_name1, txtfld_contact1, txtfld_month1, txtfld_day1, btngrp1, btnConfirmArt);
			}
		});
		
		//ACTION LISTENER TO CHECK CUSTOMER DETAILS (ART CLASSES)
		btnConfirmArt.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				checkCustomerDetails(txtfld_name1, txtfld_contact1, txtfld_month1, txtfld_day1, btnConfirmArt, rb_morning1, rb_afternoon1, rb_evening1);
				
			}
		});
		
		//ACTION LISTENER TO CONFIRM AN APPOINTMENT (POTTERY CLASSES)
		btnConfirmPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFilledDetails(txtfld_name2, txtfld_contact2, txtfld_month2, txtfld_day2, btngrp2, btnConfirmPot);
			}
		});
		
		//ACTION LISTENER TO CHECK CUSTOMER DETAILS (POTTERY CLASSES)
		btnConfirmPot.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				checkCustomerDetails(txtfld_name2, txtfld_contact2, txtfld_month2, txtfld_day2, btnConfirmPot, rb_morning2, rb_afternoon2, rb_evening2);
				
			}
		});
        
        
        
        // ADDING ELEMENTS
        pnlh1.add(imgheader);
        pnlh2.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlh2.add(lbltitle);
        pnlh2.add(Box.createRigidArea(new Dimension(0, 15)));
        pnlh2.add(lblsubtitle);
        pnlh2.add(Box.createRigidArea(new Dimension(0, 20)));
        pnlh2.add(btnStart);
        pnlNav.add(btnA);
		pnlNav.add(btnB);
		pnlNav.add(btnC);
		pnlNav.add(btnD);
        pnlContent.add(pnlA, "A");
		pnlContent.add(pnlB, "B");
		pnlContent.add(pnlC, "C");
		pnlContent.add(pnlD, "D");
		pnlSide.add(pnlE, "E");
		pnlSide.add(pnlF, "F");
		pnlSide.add(pnlG, "G");
		pnlSide.add(pnlH, "H");
		pnlSide.add(pnlI, "I");
		
		
		pnlA.add(imghome);
		pnlE.add(lblart_title);
		pnlE.add(lblart_box);
		pnlE.add(lblart_price);
		pnlE.add(btnBook1);
		pnlF.add(lblpot_title);
		pnlF.add(lblpot_box);
		pnlF.add(lblpot_price);
		pnlF.add(btnBook2);
		pnlG.add(btnClear);
		pnlG.add(btnBuy);
		pnlH.add(btnBacktoArt);
		pnlH.add(lblbook_title1);
		pnlH.add(lblart_package);
		pnlH.add(lblart_class);
		pnlH.add(lblart_tag);
		pnlH.add(lblart_pricetag);
		pnlH.add(lbl_name1);
		pnlH.add(lbl_contact1);
		pnlH.add(lbl_num1);
		pnlH.add(lbl_month1);
		pnlH.add(lbl_day1);
		pnlH.add(lbl_year1);
		pnlH.add(lbl_time1);
		pnlH.add(txtfld_name1);
		pnlH.add(txtfld_contact1);
		pnlH.add(txtfld_month1);
		pnlH.add(txtfld_day1);
		pnlH.add(rb_morning1);
		pnlH.add(rb_afternoon1);
		pnlH.add(rb_evening1);
		pnlH.add(btnConfirmArt);
		pnlI.add(btnBacktoPot);
		pnlI.add(lblbook_title2);
		pnlI.add(lblpot_package);
		pnlI.add(lblpot_class);
		pnlI.add(lblpot_tag);
		pnlI.add(lblpot_pricetag);
		pnlI.add(lbl_name2);
		pnlI.add(lbl_contact2);
		pnlI.add(lbl_num2);
		pnlI.add(lbl_month2);
		pnlI.add(lbl_day2);
		pnlI.add(lbl_year2);
		pnlI.add(lbl_time2);
		pnlI.add(txtfld_name2);
		pnlI.add(txtfld_contact2);
		pnlI.add(txtfld_month2);
		pnlI.add(txtfld_day2);
		pnlI.add(rb_morning2);
		pnlI.add(rb_afternoon2);
		pnlI.add(rb_evening2);
		pnlI.add(btnConfirmPot);
		
		btngrp1.add(rb_morning1);
		btngrp1.add(rb_afternoon1);
		btngrp1.add(rb_evening1);
		
		btngrp2.add(rb_morning2);
		btngrp2.add(rb_afternoon2);
		btngrp2.add(rb_evening2);
		
        pnlFooter.add(pnlF1, BorderLayout.NORTH);
        pnlFooter.add(pnlF2, BorderLayout.CENTER);
        pnlFooter.add(pnlF3, BorderLayout.SOUTH);
        pnlF1.add(lbltext);
        pnlF2.add(btnNext);
        pnlF3.add(lblfooter);
        
        frm1.add(pnlh1, BorderLayout.NORTH);
        frm1.add(pnlh2, BorderLayout.CENTER);
        
        frm2.add(pnlNav, BorderLayout.NORTH);
        frm2.add(pnlContent, BorderLayout.CENTER);
        frm2.add(pnlSide, BorderLayout.EAST);
        frm2.add(pnlFooter, BorderLayout.SOUTH);
        
	}
	
	private static void checkCustomerDetails(JTextField name, JTextField contact, JTextField month, JTextField day, JButton btnConfirm, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3) {
		
		String name1 = name.getText();
		String contact1 = contact.getText();
		String month1 = month.getText();
		String day1 = day.getText();
		
		if ((name1.isEmpty()) || (contact1.isEmpty()) || (month1.isEmpty()) || (day1.isEmpty())) {
			btnConfirm.setEnabled(false);
		}else {
			btnConfirm.setEnabled(true);
		}
		
		if ((rb1.isSelected()) || (rb2.isSelected()) || (rb3.isSelected())) {
			btnConfirm.setEnabled(true);
		}else {
			btnConfirm.setEnabled(false);
		}
			
		
	}
	
	private static void checkFilledDetails(JTextField name, JTextField contact, JTextField month, JTextField day, ButtonGroup btngrp, JButton btnBook) {
		
		String name1 = name.getText();
		String contact1 = contact.getText();
		String month1 = month.getText();
		String day1 = day.getText();
		int choice = JOptionPane.CLOSED_OPTION;
		
		if ((name1.matches("[a-zA-Z ]+"))) {
			if (contact1.matches("^9\\d{9}$")) {
				switch(month1) {
				
				case "January":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "February":
					if (day1.matches("([1-9]|1\\d|2[0-9])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "March":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "April":
					if (day1.matches("([1-9]|[12][0-9]|30)")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "May":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "June":
					if (day1.matches("([1-9]|[12][0-9]|30)")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "July":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "August":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "September":
					if (day1.matches("([1-9]|[12][0-9]|30)")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "October":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "November":
					if (day1.matches("([1-9]|[12][0-9]|30)")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				case "December":
					if (day1.matches("([1-9]|[12][0-9]|3[01])")) {
						choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed with your booking?", "CONFIRM YOUR BOOKING",
								JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Please make sure that the day is in numerical form (i.e. 1, 23,31)", "INVALID INPUT",
	                            JOptionPane.ERROR_MESSAGE);
					}
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Please make sure that the month is in character form (i.e. January)", "INVALID INPUT",
                            JOptionPane.ERROR_MESSAGE);	
				}

			}else {
				JOptionPane.showMessageDialog(null, "Please make sure that your mobile number is in this format (i.e. 9143143143)", "INVALID INPUT",
                        JOptionPane.ERROR_MESSAGE);
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Please make sure that you input strictly characters only (i.e. Kathryn Bernardo)", "INVALID INPUT",
                    JOptionPane.ERROR_MESSAGE);
		}
		
		switch (choice) {
        case JOptionPane.YES_OPTION:
            name.setText("");
            contact.setText("");
            month.setText("");
            day.setText("");
            btngrp.clearSelection();
            btnBook.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "<html>BOOKING SUCCESSFULLY! LOOKING FORWARD TO OUR FUN AND CREATIVE SESSIONS.<br/> IF YOU HAVE FURTHER INQUERIES, OR IF YOU DECIDED TO CANCEL THIS BOOKING, <br/>PLEASE DON'T HESITATE TO REACH OUT", "THANK YOU FOR BOOKING WITH US",
                    JOptionPane.PLAIN_MESSAGE);
            
            // Perform action for Yes
            break;
        case JOptionPane.NO_OPTION:
        	name.setText("");
            contact.setText("");
            month.setText("");
            day.setText("");
            btngrp.clearSelection();
            btnBook.setEnabled(false);
            
            // Perform action for No
            break;
        case JOptionPane.CANCEL_OPTION:
        	JOptionPane.getRootFrame().dispose();
            // Perform action for Cancel
            break;
        default:
            System.out.println("No option selected.");
            // Perform action for no selection
            break;
    }
			
		
	}

}
