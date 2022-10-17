package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
public class Waterfall extends PhysicalMove {
    public Waterfall (double pow, double acc){
        super(Type.WATER, pow, acc);
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
        return "использует Waterfall, наносит урон и с 20% шансом вызывает у соперника страх";
    }
}