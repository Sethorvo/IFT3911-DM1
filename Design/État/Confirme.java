public class Confirme implements Etat {

	/**
	 * 
	 * @param context
	 */
	void event(String e, Siege context) {
		siege.setState(Confirme);
	}

}