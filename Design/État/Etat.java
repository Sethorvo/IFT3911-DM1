public interface Etat {

	/**
	 * 
	 * @param context
	 */
	abstract void event(String e, Siege context);

}