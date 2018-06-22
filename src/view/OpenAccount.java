package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

import domain.*;
import service.*;
import serviceImpl.*;
import controller.*;


public class OpenAccount extends JFrame {
	private static final long serialVeersionUID = 1L;
	JLabel topLab, idLab, passLab, nameLab;
	JTextField idTxt, passTxt, nameTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, namePan;
	
	JComboBox<?> combo;
	String[] menu = {"기본 통장","마이너스 통장"};
	public OpenAccount() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	public void makeGui() {
		topLab = new JLabel("비트뱅크", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("아이디 : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);
		
		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
		
		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);
		
		addBtn = new JButton("등록");
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AccountBean account = new AccountBean();
				account.setUid(idTxt.getText());
				account.setPass(passTxt.getText());
				account.setName(nameTxt.getText());
		
				if(((String)combo.getSelectedItem()).equals(menu[0])) { //기본 통장 등록
					AccountController.getInstance().account(account);
				}else { //마이너스 통장
					//AccountController.getInstance().minusAccount(account);
				}
			}
		});
		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	
	}
}
