public interface Iterator {

	Container first();

	Container next();

	boolean isDone();

	Container currentItem();

}