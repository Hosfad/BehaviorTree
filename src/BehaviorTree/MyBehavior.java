package BehaviorTree;

import BehaviorTree.Abstracts.Behavior;
import BehaviorTree.Abstracts.Macro;

public abstract class MyBehavior extends Behavior {

    public MyBehavior(String name) {
        super(name);
    }

    public abstract void go(Object agent, Macro parent);

    public void start(Object agent, Macro parent) {

    }

    @Override
    public void behaviourStart(Object agent, Macro parent) {
        super.behaviourStart(agent, parent);
        behaviourStart(agent, parent);
    }

    @Override
    public void behaviourGo(Object agent, Macro parent) {
        try {
            behaviourGo(agent, parent);
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
