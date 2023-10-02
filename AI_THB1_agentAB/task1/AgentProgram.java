package AI_THB1_agentAB.task1;

public class AgentProgram {

	public Action execute(Percept p) {
		if(p.getLocationState()==Environment.LocationState.DIRTY) {
			return Environment.SUCK_DIRT;
		} else if(p.getAgentLocation()==Environment.LOCATION_A) {
			return Environment.MOVE_RIGHT;
		} else if(p.getAgentLocation()==Environment.LOCATION_B) {
			return Environment.MOVE_LEFT;
		}
		return NoOpAction.NO_OP;
	}
}