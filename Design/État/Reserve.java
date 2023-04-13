public class Reserve implements Etat {

	/**
	 * 
	 * @param context
	 */
	void event(String e, Siege context) {
		siege.setState(Reserve);
	}

}