package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;


public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap (double pow, double acc){
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if (att.getCondition() == Status.SLEEP){
            power = power * 2;
        }
        Effect effect = new Effect().condition(Status.SLEEP).turns(0);
        def.setCondition(effect);
        return  super.calcBaseDamage(att, def);
    }

    @Override
    protected String describe(){
        return "использует Wake-Up Slap, наносит урон и наносит двойной удар, если соперник спит";
    }
}
