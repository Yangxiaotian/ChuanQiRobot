package com.yangjia.chuanqi;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Main{
	static Main main;
	Robot robot;
	JFrame frame = new JFrame("����ע���");
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea();
	public Main() {
		frame.setSize(400, 200);
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new BorderLayout());
		
		JScrollPane scroll = new JScrollPane(textarea);
		textarea.setText("ʹ�÷����� �Ƚ����뷨�л���Ӣ��״̬��\n���㵽������Զ�����ע����Ϣ��\n�Ժ�ֻҪ�ȵ����������ٵ㵽�����ͻ�ʵ���Զ����롣\n");
		panel.add(scroll,BorderLayout.CENTER);
		frame.add(panel);
		frame.setVisible(true);
		frame.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				doWork("ivan");
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	public void keyPress(String s) {
		for(char c: s.toCharArray()) {
			int keycode = (int)c;
			if(keycode >=97 && keycode <= 123) keycode -= 32;
			robot.keyPress(keycode);
			robot.delay(30);
			robot.keyRelease(keycode);
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(30);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(30);
	}
	public void doWork(String uid) {
		try {
			robot = new Robot();
			robot.delay(2000);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String psd = "2111111111111111";
		String name = "12312";
		String birth = "1980/12/01";
		String question1 = "123123123123";
		String answer1 = "321321321321";
		String question2 = "222222";
		String answer2 = "321321321";
		main.keyPress(uid);
		main.keyPress(psd);
		main.keyPress(psd);
		main.keyPress(name);
		main.keyPress(birth);
		main.keyPress(question1);
		main.keyPress(answer1);
		main.keyPress(question2);
		main.keyPress(answer2);
		textarea.append("������ϡ�\n");
	}
//	public static keyPress
	public static void main(String[] args) {
		main = new Main();
	}
		
}
