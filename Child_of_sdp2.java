public class Child_of_sdp2 {
    public static void main(String[] args){
        SDP2 child1 = SDP2.getInstance();
        System.out.println(child1.hashCode());
        SDP2 child2 = SDP2.getInstance();
        System.out.println(child2.hashCode());
    }
}
