package Test1;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class zhuce extends JFrame {
    public zhuce() {
        setSize(300,250);//��ƴ���Ĵ�С
        JLabel a=new JLabel("�û���"); //ʵ����JLabel����
        JLabel b=new JLabel("��    ��");
        JLabel h=new JLabel("�ٴ�ȷ������");
        JTextField c=new JTextField(15);//ʵ�����û����ı���
        JPasswordField d=new JPasswordField(15);//ʵ���������ı���
        JPasswordField hd=new JPasswordField(15);//ʵ���������ı���
        d.setEchoChar('*');//�������������ƶ�
        JButton e=new JButton("ȷ��");
        JButton f=new JButton("����");
        JButton g=new JButton("����");
        setVisible(true);
        //��ȡһ������
        Container m=getContentPane();
//        ���û����������Jlabel���û���JTextField�ı�������JPasswordField������Լ�ȷ��JButton������ע��JButton��ӵ�container��������
        m.add(a);
        m.add(b);
        m.add(h);
        m.add(hd);
        m.add(c);
        m.add(d);
        m.add(e);
        m.add(f);
        m.add(g);
        //���ô���ĳ����Ϊ300��250  ������ʾ�����Ϸ���300��250��
        setBounds(300,250,300,250);
        m.setLayout(null);
//        a��b��c��d��e��f��ʾ��container�����е�λ������
        a.setBounds(10,40,50,18);
        b.setBounds(10,80,50,18);
        h.setBounds(5,120,80,18);
        c.setBounds(60,40,200,18);
        d.setBounds(60,80,200,18);
        hd.setBounds(90,120,180,18);
        e.setBounds(110,160,60,30);
        f.setBounds(30,160,60,30);
        g.setBounds(190,160,60,30);
        g.addActionListener(new ActionListener() {//�Է��ذ�ť��Ӽ����¼�
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                new EnterScreen();

            }
           });
            f.addActionListener(new ActionListener() {//��ȷ�ϰ�ť��Ӽ����¼�
                @SuppressWarnings("deprecation")
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    // TODO Auto-generated method stub
                    new EnterScreen();

                }
        });
            e.addActionListener(new ActionListener() {//��ȷ�ϰ�ť��Ӽ����¼�
                @SuppressWarnings("deprecation")
                @Override
                public void actionPerformed(ActionEvent arg0) {
                	FileWriter fw = null;
                    try {
                    //����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
                    File f=new File("C:\\Users\\13942\\Desktop\\123.txt");
                    fw = new FileWriter(f, true);
                    } catch (IOException e) {
                    e.printStackTrace();
                    }
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println("username:"+c.getText()+";");
                    pw.println("password:"+d.getText()+";");
                    pw.flush();
                    try {
                    fw.flush();
                    pw.close();
                    fw.close();
                    } catch (IOException e) {
                    e.printStackTrace();
                    }
                    new zhuce();

                }
        });
    }
}

