package example;

import BehaviorTree.Macro;
import BehaviorTree.RSBehavior;

public class BankItems extends RSBehavior {
    public BankItems(String name) {
        super(name);
    }

    @Override
    public void go(Object agent, Macro parent) {
        // Bank.withdraw("Potato")

    }

}
