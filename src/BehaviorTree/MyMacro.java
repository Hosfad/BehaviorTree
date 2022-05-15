package BehaviorTree;


import BehaviorTree.Abstracts.Flags;
import BehaviorTree.Abstracts.Macro;

public abstract class MyMacro extends Macro {
    public MyMacro(String name) {
        super(name);
    }

    public abstract String getTransition(Object agent, Macro parent);

    @Override
    public String macroTransition(Object agent, Macro parent) {
        String trans = macroTransition(agent, parent);
        setFlag(Flags.NO_FLAG);
        return trans;
    }

}
