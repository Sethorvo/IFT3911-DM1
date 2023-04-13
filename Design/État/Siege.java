public class Siege {

	private Section section;
	private string ID_siege;
	private int prix;
	private Client client_r;
	private int num_reservation;
	private Etat curr_state;

	/**
	 * 
	 * @param e
	 */
	public void event(String e) {
		this.curr_state.event(e);
	}

	/**
	 * 
	 * @param s
	 */
	public void setState(Etat s) {
		this.curr_state = s;
	}

}