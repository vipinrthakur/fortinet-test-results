package SingletonPattern;

/*
 * Early initialization singleton pattern
 */
public class EarlyInitialization {
	private static final EarlyInitialization instance = new EarlyInitialization();

	// private constructor to avoid initialization
	private EarlyInitialization() {
	}

	public static EarlyInitialization getInstance() {
		return instance;
	}
}
