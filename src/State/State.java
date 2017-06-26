package State;

/**
 * 
 * 所有状态统一的接口，糖果机的每个状态都有一个对应的方法
 *
 */
public interface State {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
}
