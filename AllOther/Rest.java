package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;
public class Rest extends StatusMove {
    public Rest (double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect effect = new Effect().condition(Status.SLEEP).attack(0.0).turns(2);
        p.setCondition(effect);
        p.setMod(Stat.HP, (int) Math.round(p.getHP() - p.getStat(Stat.HP)));
    }

    @Override
    protected String describe(){
        return "использует Rest, полностью восстанавилает здоровье и пропускает 2 хода";
    }
}