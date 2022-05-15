package example;

import BehaviorTree.Abstracts.Macro;
import BehaviorTree.MyBehavior;

public class behaviour1 extends MyBehavior {
    public behaviour1(String name) {
        super(name);
    }

    @Override
    public void go(Object agent, Macro parent) {
    System.err.println("Do what ever you want here");
    }

}
