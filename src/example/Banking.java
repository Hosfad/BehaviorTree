package example;

import BehaviorTree.Behavior;
import BehaviorTree.Macro;
import BehaviorTree.RSMacro;

public class Banking extends RSMacro {
    public Banking(String name) {
        super(name);
        // Those are the behaviors in this controller
        Behavior[] behaviours = {
                new BankItems("Bank"),
        };
        // Dont forget to assign  this.behaviors to your behavior array , i always do
        this.behaviors = behaviours;
    }

    @Override
    public String getTransition(Object agent, Macro parent) {

        // Here is a quick example

//        if (Bank.closestBankLocation().getSurroundingArea(20).contains(Players.localPlayer())){
//            return "Bank";
//        }else {
//            return "Walk";
//        }
        return null;
    }
}
