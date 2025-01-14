package com.day12.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class PannelTest03 extends JFrame {
	private JTextField tf;
	public PannelTest03(){
		super("익명 내부 클래스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료시 프로그램 같이 종료
		setLayout(new FlowLayout());
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		tf = new JTextField(20);
		add(bt1); add(bt2); add(bt3);
		add(tf);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.pink);		
			}
		}); 
		
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		});
		
		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.yellow);
			}
		}); // Anonymous Inner Class(익명 내부 클래스)
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PannelTest03();

	}

}
