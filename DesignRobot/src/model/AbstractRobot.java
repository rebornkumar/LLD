package model;

public abstract class AbstractRobot {
    private String name;
    private String hand;
    private String leg;
    private String head;
    private String stomach;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getStomach() {
        return stomach;
    }

    public void setStomach(String stomach) {
        this.stomach = stomach;
    }

    @Override
    public String toString() {
        return "Robot has following features \n" +
                "Name : " + name + "\n"+
                "Hand : " + hand + "\n"+
                "Legs : " + leg + "\n"+
                "Head : " + head + "\n"+
                "Stomach : " + stomach + "\n";
    }
}
