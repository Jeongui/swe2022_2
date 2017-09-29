package c0929.network;

import c0915.Array;

import java.util.ArrayList;

public class Network {
    public class Member{

        final private String name;
        private ArrayList<Member> friends;

        public Member(String name){
            this.name = name;
            this.friends = new ArrayList<>();
        }
        public void leave(){
            members.remove(this);
        }
    }
    //Network
    private ArrayList<Member> members = new ArrayList<>():

    public Member enroll(String name){
        //this == new Network() == net1 == newMember.puter
        Member newMember = new Member(name);
        members.add(newMember);
        return newMember;
    }
    public void remove(Member member){
        members.remove(member);
    }
}
