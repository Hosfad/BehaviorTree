package example;

import BehaviorTree.Abstracts.Behavior;
import BehaviorTree.Abstracts.Macro;
import BehaviorTree.MyMacro;
        // Your controller class should extend MyMacro
        // Keep in mind that MyMacro also acts as MyBehaviour , so you can have a MyMacro behaviour inside the Behaviour[]
public class Controller extends MyMacro {
    public Controller(String name) {
        super(name);
        // Those are the behaviors in this controller
        // Those behaviors can be instances of MyMacro and MyBehaviour allowing you to chain controllers
        Behavior[] behaviours = {
                new behaviour1("behave1"),
                new behaviour2("behave2")
        };
        // Don't forget to assign  this.behaviors to your behavior array , I always do
        this.behaviors = behaviours;
    }

    @Override
    public String getTransition(Object agent, Macro parent) {

        // You call your different behaviours in your controller by returning the super string that you assigned above in the Behaviour[]
        // eg : to call behaviour1 you return behave1

        if (true){
            return "behave1";
        }
        return "behave2";

    }
}
