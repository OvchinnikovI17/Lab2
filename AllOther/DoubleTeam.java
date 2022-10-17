package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;
public class DoubleTeam extends StatusMove {
    public DoubleTeam (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect effect = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "использует Double Team, повышает уклоение на один пункт";
    }
}