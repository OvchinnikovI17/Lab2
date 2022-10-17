package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
public class PoisonTail extends PhysicalMove {
    public PoisonTail (double pow, double acc){
        super(Type.POISON, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def,damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() <= 0.1){
            Effect.poison(p);
        }
    }


    @Override
    protected String describe(){
        return "использует PoisonTail, что наносит урон сопернику";
    }
}
