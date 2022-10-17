package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
public class Liquidation extends PhysicalMove {
    public Liquidation (double pow, double acc){
        super(Type.WATER, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() <= 0.2){
            Effect effect = new Effect().stat(Stat.DEFENSE, -1);
            p.addEffect(effect);
        }
    }

    @Override
    protected String describe(){
        return "использует Liquidation, понижает защиту соперника на 1 пункт с 20% шансом";
    }
}