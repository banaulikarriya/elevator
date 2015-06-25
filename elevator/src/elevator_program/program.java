package elevator_program;

public class program {

	 int currentfloor;
	 int headingfloor;
	 boolean movement;
	 boolean doors;

	void goToFloor(int s)
	 {
	 headingfloor=s;
	 System.out.println("\nLift is heading to floor="+headingfloor);
	 }

	void openDoors()
	 {
	 doors=true;
	 System.out.println("\nDoors are open\n");
	 }

	void closeDoors()
	 {
	 doors=false;
	 System.out.println("\nDoors are close\n");
	 }

	void goingUp()
	 {
	 movement=true;
	 }

	void goingDown()
	 {
	 movement=false;
	 }

	void print(int h)
	 {
	 currentfloor=h;
	 System.out.print("\n@@Heading please wait@@\n");
	 if(headingfloor>currentfloor)
	 {
	 System.out.print("\nMovement up\n");
	 }
	else
	 {
	 System.out.print("\nMovement down\n");
	 }
	 }
	 }


	class ElevatorProgram
	 {
	 public static void main(String args[]) 
	 {
		 program ob=new program ();
		 program  obdup=new program ();
	ob.openDoors();
	System.out.print("\nPresent floor=");
	
	obdup.goingUp();
	obdup.goingDown();
	
	obdup.closeDoors();
	}
	}

