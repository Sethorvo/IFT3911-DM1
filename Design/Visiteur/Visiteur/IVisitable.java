public interface IVisitable {

	/**
	 * 
	 * @param visitor
	 */
	String accept(VoyageVisitor visitor);

}