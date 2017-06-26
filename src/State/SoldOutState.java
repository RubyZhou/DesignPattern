package State;

public class SoldOutState implements State {

	GumballMachine gumballMachine;	// �ǹ�����
	
	public SoldOutState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��û���ǣ�����Ͷ��");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("ת��ת���ˣ�û�����ˣ�");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("ת����Ҳû�������ǣ�");
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
