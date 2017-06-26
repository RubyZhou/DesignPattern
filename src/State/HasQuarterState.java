package State;

public class HasQuarterState implements State {

	GumballMachine gumballMachine;	// �ǹ�����
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Ͷ���ң���Ͷ�ˣ�");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��ע���˱ң�");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("ת��ת���С�����");
		gumballMachine.setState(gumballMachine.getSoldState());	//�б�״̬-> ת��ת���תΪ �� �۳�״̬

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("��û���ǹ�������");

	}

}
