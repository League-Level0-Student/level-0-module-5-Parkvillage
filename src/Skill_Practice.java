import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_Practice {
	public static void main(String[] args) {

		Skill_Practice skills = new Skill_Practice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

	private void skill5() {
		// TODO Auto-generated method stub
		String h=JOptionPane.showInputDialog(null, "Whats the name of your school?");
		JOptionPane.showInputDialog(null,h+" is a GREAT school");
	}

	private void skill4() {
		// TODO Auto-generated method stub
		String city=JOptionPane.showInputDialog(null,"what city do you live in?");
		if(city==" San Diego") {
			JOptionPane.showInputDialog(null, "You live in americas finest city ");
		}else {
			JOptionPane.showInputDialog(null, "Pack your bags and move to San Diego");
			String cars=JOptionPane.showInputDialog(null, "Tell me how many cars you have");
			int cars1=Integer.parseInt(cars);
					if(cars=="0") {
						JOptionPane.showInputDialog(null, "I bet you use Public transportation");
					}else {
						JOptionPane.showMessageDialog(null, "so you have "+cars1*4+" tires?");
					}
		}
	}

	private void skill3() {
		// TODO Auto-generated method stub
		Random rand= new Random();
	int a=	rand.nextInt(20);
		System.out.println(a);
    int b= rand.nextInt(10);
		System.out.println(b);
		System.out.println(a-b);
	}

	private void skill2() {
		// TODO Auto-generated method stub
		for(int i=0;i<=30;i+=3) {
			System.out.println(i);
		}
	}

	private void skill1() {
		// TODO Auto-generated method stub
		 String money=JOptionPane.showInputDialog(null,"How many dimes do you have" );
		 
		 int p1=Integer.parseInt(money);
		 JOptionPane.showInputDialog(null,"you have " + p1*10 + " cents");
		String height= JOptionPane.showInputDialog(null, "how tall are you");
		int height1=Integer.parseInt(height);
		if(height1<36) {
			JOptionPane.showMessageDialog(null,"you need to eat your wheaties");
		}
	
		

			
		
		}
		
	}

