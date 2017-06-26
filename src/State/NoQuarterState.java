package State;

public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;	// �ǹ�����
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine ;
	}
	
	/**
	 * �ޱ�״̬�£�Ͷ��
	 */
	public void insertQuarter() {
		System.out.println("oh!��Ͷ��һ��Ӳ��");
		
		/* ����״̬ : ��Ͷ���ˣ������Ǵ����б�״̬ */
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	/**
	 * �ޱ�״̬�£��˱�
	 */
	public void ejectQuarter() {
		System.out.println("ûͶ�һ����˱ң�");
	}

	/**
	 * �ޱ�״̬�£�ת��ת��
	 */
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("ûͶ�ң�ת��û��");
		
	}

	/**
	 * �ޱ�״̬�£�����
	 */
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("�ȸ�Ǯ��������");
	}
}
