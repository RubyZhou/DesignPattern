package State;

public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;	// 糖果机类
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine ;
	}
	
	/**
	 * 无币状态下：投币
	 */
	public void insertQuarter() {
		System.out.println("oh!你投了一个硬币");
		
		/* 设置状态 : ∵投币了，所以是传入有币状态 */
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	/**
	 * 无币状态下：退币
	 */
	public void ejectQuarter() {
		System.out.println("没投币还想退币？");
	}

	/**
	 * 无币状态下：转动转轴
	 */
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("没投币，转了没用");
		
	}

	/**
	 * 无币状态下：发糖
	 */
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("先付钱，再拿糖");
	}
}
