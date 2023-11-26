//Eager way to create a singleton object

public class SDP2 {
    private static SDP2 sdp2 = new SDP2();
    private SDP2() {
        // Exists only to defeat instantiation.
    }
    public static SDP2 getInstance() {
        return sdp2;
    }
}
