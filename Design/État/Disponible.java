public class Disponible implements Etat {

	/**
	 * 
	 * @param context
	 */
	void event(String e, Siege context) {
		siege.setState(Disponible);
	}

}