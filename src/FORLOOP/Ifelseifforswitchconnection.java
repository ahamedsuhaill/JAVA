package FORLOOP;

public class Ifelseifforswitchconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		if(n>=1)
		{System.out.println("power on");
		}
		else
		{System.out.println("power off");}
		switch(n)
	
		{
		
		case 1:
			System.out.println("light");
			break;
		case 2:
			System.out.println("fan");
			break;
		case 3:
		    System.out.println("air cooler");
		break;
		case 4:
		    System.out.print("washing machine"+1);
		break;
		case 0:
			System.out.println("power off");
			break;
		default:
			System.out.println("invalid switch");
		}
		
			}
		
		}

