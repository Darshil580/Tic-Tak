/*
<applet code=XO.class height=500 width=500></applet>*/
import java.util.*;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*; 
	

public class XO extends Applet implements ActionListener{
	JButton xb;
	JButton ob;
	JPanel p;
	static Icon x;
	Icon z,c;
	static Icon o;
	JButton box1;
	JButton box2;
	JButton box3;
	JButton box4;
	JButton box5;
	JButton box6;
	JButton box7;
	JButton box8;
	JButton box9;
	int check=0;
	Label sd;
	static String user;
	int count=0;
	static String computer;
	String[] combinations=null;
	int[] num=null;
	String inner_1;
	String inner_2;
	String temp_3;
	String temp_4;
	String temp_5;
	String temp_6;
	//String [] temp_3;
	//ArrayList<String> temp_30= new ArrayList<String>();

	public void init(){
		//setLayout(new BorderLayout());
		x =new ImageIcon(new ImageIcon("X.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		o =new ImageIcon(new ImageIcon("O.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		xb=new JButton(x);
		
		
		xb.addActionListener(this);
		ob=new JButton(o);
		ob.addActionListener(this);
		
		add(xb);
		add(ob);

		combinations= new String[]{"159","195","519","591","951","915","357","375","537","573","735","753","456","654","645","465","546","564","369","396","639","693","936","963","789","798","879","897","987","978","147","174","417","471","714","741","258","285","528","582","852","825","123","321","231","213","312","132"};
		
		Dimension d=new Dimension(100,100);	
		p=new JPanel();
		
		p.setLayout(new GridLayout(3,3));
		box1=new JButton("1");
		box1.setPreferredSize(d);
		box1.setActionCommand("1");
		box1.addActionListener(this);
		p.add(box1);
		

		box2=new JButton("2");
		box2.setPreferredSize(d);
		box2.setActionCommand("2");
		box2.addActionListener(this);
		p.add(box2);
		

		box3=new JButton("3");
		box3.setPreferredSize(d);
		box3.setActionCommand("3");
		box3.addActionListener(this);
		p.add(box3);
		

		box4=new JButton("4");
		box4.setPreferredSize(d);
		box4.setActionCommand("4");
		box4.addActionListener(this);
		p.add(box4);
		

		box5=new JButton("5");
		box5.setPreferredSize(d);
		box5.setActionCommand("5");
		box5.addActionListener(this);
		p.add(box5);


		box6=new JButton("6");
		box6.setPreferredSize(d);
		box6.setActionCommand("6");
		box6.addActionListener(this);
		p.add(box6);


		box7=new JButton("7");
		box7.setPreferredSize(d);
		box7.setActionCommand("7");
		box7.addActionListener(this);
		p.add(box7);


		box8=new JButton("8");
		box8.setPreferredSize(d);
		box8.setActionCommand("8");
		box8.addActionListener(this);
		p.add(box8);


		box9=new JButton("9");
		box9.setPreferredSize(d);
		box9.setActionCommand("9");
		box9.addActionListener(this);
		p.add(box9);
		
		p.setVisible(false);
		add(p);
	}

	@Override
	public void actionPerformed(ActionEvent av){
		char i='0';
		this.setBackground(Color.PINK);
		xb.setEnabled(false);
		xb.setVisible(false);
		ob.setEnabled(false);
		ob.setVisible(false);
		p.setEnabled(true);
		ob.setEnabled(false);
		xb.setEnabled(false);
	    p.setVisible(true);
	    if(av.getSource()==ob){
	    	z=this.o;
	    	check=1;

	    }
	    if(av.getSource()==xb){
	    	z=this.x;
	    	check=2;
	    }
	    
	    switch(av.getActionCommand()){
			case "1":box1.setIcon(z);
					 box1.setEnabled(false);
					 i='1';
					 break;
			case "2":box2.setIcon(z);
					box2.setEnabled(false);
					i='2';
					break;
			case "3":box3.setIcon(z);
					box3.setEnabled(false);
					i='3';
					break;
			case "4":box4.setIcon(z);
					box4.setEnabled(false);
					i='4';
					break;
			case "5":box5.setIcon(z);
					box5.setEnabled(false);
					i='5';
					break;
			case "6":box6.setIcon(z);
					box6.setEnabled(false);
					i='6';
					break;
			case "7":box7.setIcon(z);
					box7.setEnabled(false);
					i='7';
					break;
			case "8":box8.setIcon(z);
					box8.setEnabled(false);
					i='8';
					break;
			case "9":box9.setIcon(z);
					box9.setEnabled(false);
					i='9';
					break;	
			}
		if(i!='0')
			startplay(i);
	}

	public void startplay(char i){
			if(count==0)
				user= String.valueOf(i);
			else
				user+=String.valueOf(i);
			if(check==1){
				c=this.x;
			}
			else{
				c=this.o;
			}
			String abc= autoMove();
			switch(abc){

				case "1":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box1.setIcon(c);
					 	box1.setEnabled(false);
					 	break;
				case "2":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box2.setIcon(c);
						box2.setEnabled(false);
						break;
				case "3":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box3.setIcon(c);
						box3.setEnabled(false);
						break;
				case "4":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box4.setIcon(c);
						box4.setEnabled(false);
						break;
				case "5":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box5.setIcon(c);
						box5.setEnabled(false);
						break;
				case "6":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box6.setIcon(c);
						box6.setEnabled(false);
						break;
				case "7":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box7.setIcon(c);
						box7.setEnabled(false);
						break;
				case "8":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box8.setIcon(c);
						box8.setEnabled(false);
						break;
				case "9":
						if(count==0)
						computer= String.valueOf(abc);
						else
						computer+=String.valueOf(abc);
						box9.setIcon(c);
						box9.setEnabled(false);
						break;
			}
			Label temp_tocheck= new Label(user);
			this.add(temp_tocheck);
			Label temp_toche_c= new Label(computer);
			this.add(temp_toche_c);
			sd= new Label("null");
			this.add(sd);
			if(count>=2){
				for(int j=0;j<48;j++){
					if(user.equals(combinations[j])){
						add(new Label("User won...."));
						nullify();
					}
					else if(computer.equals(combinations[j])){
						add(new Label("Computer won...."));
						nullify();
					}
					else{

					}
					//if(computer.equals(combinations[j]))
				//	add(new Label("Computer won....... \n You lose...\n Try Again next time......."));
				//}
				}
			}
			count++;
	}

	public	String autoMove(){
		if(user.length()==1){
			int a=0,k=0,b=0;
			String temp_1=String.valueOf(user.charAt(count));
			String temp_2;
			for(int j=0;j<48;j++){
				// It will compare each and every combinations's String's char with the pressed char and if char is compare then store that combination's index in num array int.*/
				temp_2=combinations[j];
				for(k=0;k<3;k++){
					if(temp_1.equals(String.valueOf(temp_2.charAt(k)))){
						if(k==2){
							k=0;
							temp_3=String.valueOf(temp_2.charAt(k+1));
							break;
						}
						temp_3=String.valueOf(temp_2.charAt(k+1));
						b=1;
						break;
					}
				}
				if(b==1){
				break;
				}
			}
			return String.valueOf(temp_3);
		}
		else if(user.length()==2){
			String[] unpair=new String[]{"493","431","617","671","279","297","813","831"};
			for(int j=0;j<48;j++){
				temp_4=combinations[j];
				if(user.equals(temp_4.substring(0,2))){
					return String.valueOf(temp_4.charAt(2));
				}
			}
			for(int ad=0;ad<8;ad++){
				temp_4=unpair[ad];
				if(user.equals(temp_4.substring(0,2))){
					return String.valueOf(temp_4.charAt(2));
				}
			}
		}
		else if(user.length()==3){
			String un;
			char a1,a2,a3;
			a1=user.charAt(0);
			a2=user.charAt(1);
			a3=user.charAt(2);
			inner_1=new StringBuilder().append(a1).append(a3).toString();
			inner_2=new StringBuilder().append(a2).append(a3).toString();
			for(int j=0;j<48;j++){
				temp_4=combinations[j];
				if(computer.equals(temp_4.substring(0,2)) && user.charAt(2)!=temp_4.charAt(2)){
					return String.valueOf(temp_4.charAt(2));
				}
			}	
			for (int ab=0;ab<48;ab++) {
				temp_5=combinations[ab];
				un=String.valueOf(temp_5.substring(0,2));
				if(un.equals(inner_1) || un.equals(inner_2)){
					return String.valueOf(temp_5.charAt(2));
				}
			}
		}
		else{
			char b1,b2,b3;
			String unc;
			b1=computer.charAt(0);
			b2=computer.charAt(1);
			b3=computer.charAt(2);
			inner_1=new StringBuilder().append(b1).append(b3).toString();
			inner_2=new StringBuilder().append(b2).append(b3).toString();
			for (int ab=0;ab<48;ab++) {
				temp_5=combinations[ab];
				unc=String.valueOf(temp_5.substring(0,2));
				if(unc.equals(inner_1) || unc.equals(inner_2)){
					if(user.charAt(3)!=temp_5.charAt(2))
						return String.valueOf(temp_5.charAt(2));
				}
			}
			String tempo="123456789";
			for(int ac=0;ac<9;ac++){
				if(user.charAt(0)==tempo.charAt(ac))
					continue;		
				else if(user.charAt(1)==tempo.charAt(ac))
					continue;		
				else if(user.charAt(2)==tempo.charAt(ac))
					continue;	
				else if(user.charAt(3)==tempo.charAt(ac))
					continue;
				else if(computer.charAt(0)==tempo.charAt(ac))
					continue;	
				else if(computer.charAt(1)==tempo.charAt(ac))
					continue;	
				else if(computer.charAt(2)==tempo.charAt(ac))
					continue;
				else
					return	String.valueOf(tempo.charAt(ac));
			}
		}
		return "0";
	}
	public void nullify(){

		box1.setEnabled(false);
		box2.setEnabled(false);
		box3.setEnabled(false);
		box4.setEnabled(false);
		box5.setEnabled(false);
		box6.setEnabled(false);
		box7.setEnabled(false);
		box8.setEnabled(false);
		box9.setEnabled(false);
	}
}
