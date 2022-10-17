package  com.evilempire.LabLog.AllOther;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower (double pow, double acc){
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() <= 0.1){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Flamethrower, наносит урон и поджигает соперника с 10% шансом";
    }
}