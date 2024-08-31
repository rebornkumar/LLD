import com.sun.net.httpserver.Request;
import model.AbstractRobot;
import model.ClassicRobot;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.http.HttpRequest;
import java.util.concurrent.Executor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = new RobotBuilder();
        AbstractRobot classicRobot = robotBuilder
                .setType("1")
                .setName("Helsenki")
                .setHand("4 hands")
                .setLeg("2 legs")
                .setHead("Big Head")
                .setStomach("lean stomach")
                .build();
        AbstractRobot advancedRobot = robotBuilder
                .setType("2")
                .setName("Professor")
                .setHand("10 hands")
                .setLeg("5 legs")
                .setHead("2 Big Head")
                .setStomach("fat stomach")
                .build();
        AbstractRobot classicRobot2 = robotBuilder
                .setType("1")
                .setName("Helsenki")
                .setHand("4 hands")
                .setLeg("2 legs")
                .build();
        AbstractRobot advancedRobot2 = robotBuilder
                .setType("2")
                .setName("Professor")
                .setHead("2 Big Head")
                .setStomach("fat stomach")
                .build();
        System.out.println(classicRobot.toString());
        System.out.println(advancedRobot.toString());
        System.out.println(classicRobot2.toString());
        System.out.println(advancedRobot2.toString());
//        HttpRequest
//        InputStream
//        BufferedInputStream
//        ObjectInputStream
//        StringBuilder
//        Executor
    }

}