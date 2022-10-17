package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
public class Facade extends PhysicalMove {
    public Facade (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if (att.getCondition() == Status.BURN | att.getCondition() == Status.POISON | att.getCondition() == Status.PARALYZE){
            power = power * 2;
        }
        return  super.calcBaseDamage(att, def);
    }

    @Override
    protected String describe(){
        return "использует Facade, наносит урон и бьет соперника двойной атакой, если тот BURN/POISONED/PARALYZED";
    }
}
