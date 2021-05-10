package Test1;

import java.io.*;
import java.awt.*;//导入awt包
import javax.swing.*;//导入swing包
import java.awt.event.ActionListener;//导入awt包中的监听器事件包
import java.awt.event.ActionEvent;//导入awt包中的ActionEvent事件包
import java.util.Scanner;
public class EnterScreen extends JFrame {
    static int s=0;
    public EnterScreen() {
        Yanzhencode vcode = new  Yanzhencode();
        setSize(300,290);//设计窗体的大小
        setTitle("请登录");
        setBackground(Color.BLUE);//设置背景颜色
        JLabel a=new JLabel("登录名"); //实例化JLabel对象
        JLabel b=new JLabel("密    码");
        JLabel g=new JLabel("忘记用户名/密码？");
        JLabel h=new JLabel("验证码");
        g.setForeground(Color.BLUE);
        JTextField c=new JTextField(15);//实例化用户名文本框
        JPasswordField d=new JPasswordField(15);//实例化密码框
        JTextField k=new JTextField(4);//实例化验证码框
        d.setEchoChar('*');//将输入密码框中的密码以*显示出来
        JButton e=new JButton("登录");
        JButton f=new JButton("快速注册");
        e.setBackground(Color.YELLOW);//设置登录按钮字体颜色
        f.setForeground(Color.GRAY);//设置快速登录按钮填充色
        setVisible(true);//使窗体可视化
        Container m=getContentPane();//获取一个容器
        getContentPane().setBackground(Color.white);//设置窗体填充色
//        将用户名、密码的Jlabel和用户名JTextField文本框、密码JPasswordField密码框以及确定JButton、快速注册JButton添加到container容器里面                         //
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);
        m.add(e);
        m.add(f);
        m.add(g);
        m.add(h);
        m.add(k);
        m.add(vcode);
        setBounds(300,300,600,500);//设置窗体的长宽各为300、300  让其显示在左上方的600、500处
        m.setLayout(null);
//        a、b、c、d、e、f显示在container容器中的位置坐标
        a.setBounds(10,40,150,18);
        b.setBounds(10,80,150,18);
        c.setBounds(60,40,230,18);
        d.setBounds(60,80,230,18);
        h.setBounds(10,120,150,18);
        k.setBounds(60,120,180,18);
        e.setBounds(200,280,200,30);
        f.setBounds(200,220,200,30);
        g.setBounds(190,75,200,30);
        vcode.setBounds(240,110,80,30);
        e.addActionListener(new ActionListener() {//对登录按钮添加监听事件

            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub

            	
            	
            	
                /*if(c.getText().trim().equals("lsy")&&new String(d.getPassword()).equals("123456")&&s==1)*/ //equals函数进行用户名和密码的匹配
                    
                    FileWriter fw = null;
                    try {
                    //如果文件存在，则追加内容；如果文件不存在，则创建文件
                    File f=new File("C:\\Users\\13942\\Desktop\\123.txt");
                    fw = new FileWriter(f, true);
                    } catch (IOException e) {
                    e.printStackTrace();
                    }
                    String[] sp;
                    BufferedReader reader = null;
          		    StringBuffer sbf = new StringBuffer();
          		  try {
      		        reader = new BufferedReader(new FileReader("C:\\Users\\13942\\Desktop\\123.txt"));
      		        String tempStr;
      		        while ((tempStr = reader.readLine()) != null) {
      		            sbf.append(tempStr);
      		        }
      		        reader.close();
      		        
      		    } catch (IOException e) {
      		        e.printStackTrace();
      		    } finally {
      		        if (reader != null) {
      		            try {
      		                reader.close();
      		            } catch (IOException e1) {
      		                e1.printStackTrace();
      		            }
      		        }
      		    }
          		sp=sbf.toString().split("[: ;]");
          		int usernametrue=0;
          		int passwordtrue=0;
          		for(int i=0;i<sp.length;i++) {
          			if(sp[i].equals(c.getText())) {
          				usernametrue=1;
          				if(sp[i+2].equals(d.getText())) {
          					passwordtrue=1;
          					JOptionPane.showMessageDialog(null,"登录成功");
          					new Jrame3().setVisible(true);
          				}
          			}
          			
          			
          		}
          		if(usernametrue==0) {
      				JOptionPane.showMessageDialog(null,"用户名不存在，请注册");
      			}else {
      				if(passwordtrue==0) {
      					JOptionPane.showMessageDialog(null,"密码不正确");
      				}
      			}
                    

                   /* if (!file.exists()) {
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        
                    } else 
                    	
    				try {
    					BufferedWriter out = new BufferedWriter(new FileWriter(file));
    			
    					out.write("username:"+c.getText()+";\n");
    		            out.write("password:"+d.getText()+";\n");
    					out.close();
    					
    				}
    				catch(Exception e) {
    					e.printStackTrace();
    				}
    				*/
                   // new Jrame3().setVisible(true);//进入到NewFrame这个窗体中
                /*else if(c.getText().trim().equals("lsy")&&new String(d.getPassword()).equals("123456")&&s==0){
                    JOptionPane.showMessageDialog(null,"验证码输入错误");
                }else {
                    JOptionPane.showMessageDialog(null, "登录失败,用户名、密码或验证码输入错误");
                }*/
            }

        });
        f.addActionListener(new ActionListener(){//对快速注册按钮添加监听事件
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                new zhuce();//进入都到zhuce窗体中
            }

        });
        //判断输入验证码是否正确
            if(k.getText()== null) {
                s=0;
            }else if(vcode.getCode() == null) {
                s=1;
            }else if(vcode.getCode() .equals(k.getText())) {
                s=1;
            }else {
            s=0;
        }
    }

        public static void main(String[] args) {
            new EnterScreen();

        }

    }