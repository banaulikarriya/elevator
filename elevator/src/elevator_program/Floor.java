package elevator_program;

public class Floor {

	int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	Floor( int number)
	{
		this.number=number;
		
	}
	public void getcurrent_pos()
	{
		System.out.print("Current floor is"+number);
	}
	
}
