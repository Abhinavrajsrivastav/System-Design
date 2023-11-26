//Lazy way to create a singleton object

class SDP1 {
    private static SDP1 instance;
    private SDP1() {
        // Exists only to defeat instantiation.
    }
    public static SDP1 getInstance() {
        if(instance == null) {
            instance = new SDP1();
        }
        return instance;
    }
}