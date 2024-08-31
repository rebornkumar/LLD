import model.AbstractRobot;
import model.AdvancedRobot;
import model.ClassicRobot;

public class RobotBuilder {
    private AbstractRobot instance;

    public RobotBuilder() {}


    public RobotBuilder setType(String type) {
        if(type.equals("1")) {
            instance = new ClassicRobot();
        }else {
            instance = new AdvancedRobot();
        }
        return this;
    }
    public RobotBuilder setName(String name) {
        instance.setName(name);
        return this;
    }

    public RobotBuilder setHand(String hand) {
        instance.setHand(hand);
        return this;
    }
    public RobotBuilder setLeg(String leg) {
        instance.setLeg(leg);
        return this;
    }
    public RobotBuilder setHead(String head) {
        instance.setHead(head);
        return this;
    }
    public RobotBuilder setStomach(String stomach) {
        instance.setStomach(stomach);
        return this;
    }
    public AbstractRobot build() {
        return instance;
    }
}
