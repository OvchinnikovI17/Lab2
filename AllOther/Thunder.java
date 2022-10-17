package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder (double pow, double acc){
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() <= 0.3){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Thunder, наносит урон и парализует соперника с 30% вероятностью";
    }
}
