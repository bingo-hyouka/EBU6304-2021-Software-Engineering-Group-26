package Test1;

import java.io.*;
import java.awt.*;//����awt��
import javax.swing.*;//����swing��
import java.awt.event.ActionListener;//����awt���еļ������¼���
import java.awt.event.ActionEvent;//����awt���е�ActionEvent�¼���
import java.util.Scanner;
public class EnterScreen extends JFrame {
    static int s=0;
    public EnterScreen() {
        Yanzhencode vcode = new  Yanzhencode();
        setSize(300,290);//��ƴ���Ĵ�С
        setTitle("���¼");
        setBackground(Color.BLUE);//���ñ�����ɫ
        JLabel a=new JLabel("��¼��"); //ʵ����JLabel����
        JLabel b=new JLabel("��    ��");
        JLabel g=new JLabel("�����û���/���룿");
        JLabel h=new JLabel("��֤��");
        g.setForeground(Color.BLUE);
        JTextField c=new JTextField(15);//ʵ�����û����ı���
        JPasswordField d=new JPasswordField(15);//ʵ���������
        JTextField k=new JTextField(4);//ʵ������֤���
        d.setEchoChar('*');//������������е�������*��ʾ����
        JButton e=new JButton("��¼");
        JButton f=new JButton("����ע��");
        e.setBackground(Color.YELLOW);//���õ�¼��ť������ɫ
        f.setForeground(Color.GRAY);//���ÿ��ٵ�¼��ť���ɫ
        setVisible(true);//ʹ������ӻ�
        Container m=getContentPane();//��ȡһ������
        getContentPane().setBackground(Color.white);//���ô������ɫ
//        ���û����������Jlabel���û���JTextField�ı�������JPasswordField������Լ�ȷ��JButton������ע��JButton��ӵ�container��������                         //
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
        setBounds(300,300,600,500);//���ô���ĳ����Ϊ300��300  ������ʾ�����Ϸ���600��500��
        m.setLayout(null);
//        a��b��c��d��e��f��ʾ��container�����е�λ������
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
        e.addActionListener(new ActionListener() {//�Ե�¼��ť��Ӽ����¼�

            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub

            	
            	
            	
                /*if(c.getText().trim().equals("lsy")&&new String(d.getPassword()).equals("123456")&&s==1)*/ //equals���������û����������ƥ��
                    
                    FileWriter fw = null;
                    try {
                    //����ļ����ڣ���׷�����ݣ�����ļ������ڣ��򴴽��ļ�
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
          					JOptionPane.showMessageDialog(null,"��¼�ɹ�");
          					new Jrame3().setVisible(true);
          				}
          			}
          			
          			
          		}
          		if(usernametrue==0) {
      				JOptionPane.showMessageDialog(null,"�û��������ڣ���ע��");
      			}else {
      				if(passwordtrue==0) {
      					JOptionPane.showMessageDialog(null,"���벻��ȷ");
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
                   // new Jrame3().setVisible(true);//���뵽NewFrame���������
                /*else if(c.getText().trim().equals("lsy")&&new String(d.getPassword()).equals("123456")&&s==0){
                    JOptionPane.showMessageDialog(null,"��֤���������");
                }else {
                    JOptionPane.showMessageDialog(null, "��¼ʧ��,�û������������֤���������");
                }*/
            }

        });
        f.addActionListener(new ActionListener(){//�Կ���ע�ᰴť��Ӽ����¼�
            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                new zhuce();//���붼��zhuce������
            }

        });
        //�ж�������֤���Ƿ���ȷ
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