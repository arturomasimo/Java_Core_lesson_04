package lession4;

public class Application {

	public static void main(String[] args) {
		Robot r1 = new Robot("Robot","просто працюю");
		r1.work();
		CoffeRobot r2 = new CoffeRobot ("CoffeRobot", "варю каву");
		r2.work();
		RobotDancer r3 = new RobotDancer ("RobotDancer", "просто танцюю");
		r3.work();
		RobotCoocker r4 = new RobotCoocker ("RobotCoocker", "просто готую");
		r4.work();
		System.out.println("--------------------");
		Robot rr[] = new Robot[10]; 
		rr[0]= new Robot ("Robot", "помічник головного");
		rr[1]=r1;
		rr[2]=r3;
		rr[3]=r2;
		rr[4]=r4;
		rr[5]= new RobotDancer ("RobotDancer", "танцюю танцюю");
		rr[6]= new CoffeRobot ("CoffeRobot", "варю дуже добру каву");
		rr[7]= new RobotDancer ("RobotDancer", "танцюю з кавою");
		rr[8]= new CoffeRobot ("CoffeRobot", "варю дорогу каву");
		rr[9]=r2;
		for (int i = 0; i < rr.length; i++) {
			System.out.print(i+1 + " ");
			rr[i].work();
		} 
		System.out.println("-------Animal-------");
		Animal a = new Animal ("Леопард", 7, 20);
		System.out.println("Назва тварини = "+a.getName()+", Швидкість тварини =  "+ a.getSpeed()+"км/год, Вік тварини = "+ a.getAge()+" років" );
		System.out.println("---------");
		a.setName("Бик");
		a.setSpeed(2);
		a.setAge(14);
		System.out.println(a);
		
		
	}

}
