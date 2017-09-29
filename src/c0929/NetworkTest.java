package c0929;

import c0929.network.Network;

public class NetworkTest {
    static public void main(String[] arg){
        Network net1 = new Network();
        //Network.Member member1 = new Network.Member("fred");
        Network.Member fred = net1.enroll("fred");
    }

}
