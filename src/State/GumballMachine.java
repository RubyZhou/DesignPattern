package State;

public class GumballMachine {

	/* 组合四个状态，将机器的具体动作委托给行为类 */
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		/* 糖果机构造器 */
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	/* 委托给状态类 */
	public void insertQuarter()	{
		state.insertQuarter();
	}
	
	public void ejectQuarter()	{
		state.ejectQuarter();
	}
	
	public void turnCrank()	{
		state.turnCrank();
		state.dispense();
	}
	

	
	void setState(State state) {
		// TODO Auto-generated method stub
		this.state = state;
	}

	void releaseBall()	{
		System.out.println("出糖了！");
		if (count != 0) {
			count--;
		}
	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}

	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
	
	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	
	public int getcount() {
		// TODO Auto-generated method stub
		return count;
	}


}



















