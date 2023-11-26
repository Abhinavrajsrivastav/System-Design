public class Child_of_sdp1 {
    public static void main(String[] args){
        SDP1 child1 = SDP1.getInstance();
        System.out.println(child1.hashCode());
        SDP1 child2 = SDP1.getInstance();
        System.out.println(child2.hashCode());
    }
}
