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
        setSize(300,250);//设计窗体的大小
        JLabel a=new JLabel("用户名"); //实例化JLabel对象
        JLabel b=new JLabel("密    码");
        JLabel h=new JLabel("再次确认密码");
        JTextField c=new JTextField(15);//实例化用户名文本框
        JPasswordField d=new JPasswordField(15);//实例化密码文本框
        JPasswordField hd=new JPasswordField(15);//实例化密码文本框
        d.setEchoChar('*');//设置密码隐藏制度
        JButton e=new JButton("确定");
        JButton f=new JButton("重置");
        JButton g=new JButton("返回");
        setVisible(true);
        //获取一个容器
        Container m=getContentPane();
//        将用户名、密码的Jlabel和用户名JTextField文本框、密码JPasswordField密码框以及确定JButton、快速注册JButton添加到container容器里面
        m.add(a);
        m.add(b);
        m.add(h);
        m.add(hd);
        m.add(c);
        m.add(d);
        m.add(e);
        m.add(f);
        m.add(g);
        //设置窗体的长宽各为300、250  让其显示在左上方的300、250处
        setBounds(300,250,300,250);
        m.setLayout(null);
//        a、b、c、d、e、f显示在container容器中的位置坐标
        a.setBounds(10,40,50,18);
        b.setBounds(10,80,50,18);
        h.setBounds(5,120,80,18);
        c.setBounds(60,40,200,18);
        d.setBounds(60,80,200,18);
        hd.setBounds(90,120,180,18);
        e.setBounds(110,160,60,30);
        f.setBounds(30,160,60,30);
        g.setBounds(190,160,60,30);
        g.addActionListener(new ActionListener() {//对返回按钮添加监听事件
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                new EnterScreen();

            }
           });
            f.addActionListener(new ActionListener() {//对确认按钮添加监听事件
                @SuppressWarnings("deprecation")
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    // TODO Auto-generated method stub
                    new EnterScreen();

                }
        });
            e.addActionListener(new ActionListener() {//对确认按钮添加监听事件
                @SuppressWarnings("deprecation")
                @Override
                public void actionPerformed(ActionEvent arg0) {
                	FileWriter fw = null;
                    try {
                    //如果文件存在，则追加内容；如果文件不存在，则创建文件
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

