package example;

import BehaviorTree.Abstracts.Macro;
import BehaviorTree.MyBehavior;

public class behaviour2 extends MyBehavior {
    public behaviour2(String name) {
        super(name);
    }

    @Override
    public void go(Object agent, Macro parent) {
        System.err.println("Potato");
    }

}
