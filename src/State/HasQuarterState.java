package State;

public class HasQuarterState implements State {

	GumballMachine gumballMachine;	// 糖果机类
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("投过币，别投了！");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("请注意退币！");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("转轴转动中。。。");
		gumballMachine.setState(gumballMachine.getSoldState());	//有币状态-> 转动转轴后转为 ： 售出状态

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("并没有糖果掉下来");

	}

}
