package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
    public DarkPulse (double pow, double acc){
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() <= 0.2){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "использует Dark Pulse, наносит урон и с 20% шансом вызывает у соперника страх";
    }
}
