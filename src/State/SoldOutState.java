package State;

public class SoldOutState implements State {

	GumballMachine gumballMachine;	// 糖果机类
	
	public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("还没出糖，别急着投币");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("转过转轴了，没法退了！");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("转两次也没有两颗糖！");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if (gumballMachine.getcount() > 0)	{
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
	

}
