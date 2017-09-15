package SingletonPattern;

/*
 * Late initialization singleton pattern
 */
public class LateInitialization {
	private static LateInitialization instance;

	private LateInitialization() {
	}

	public static LateInitialization getInstance() {
		if (instance == null) {
			instance = new LateInitialization();
		}
		return instance;
	}
}
