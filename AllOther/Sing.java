package  com.evilempire.LabLog.AllOther;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;

public class Sing extends StatusMove {
    public Sing (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (p.getStat(Stat.HP) > p.getHP()){
            int nm = (int) Math.round(Math.random() + Math.random() + Math.random());
            if (nm == 0){
                nm = 1;
            }
            Effect effect = new Effect().condition(Status.SLEEP).turns(nm);
        }
        Effect effect = new Effect().condition(Status.SLEEP).attack(0.0).turns(2);
        p.setCondition(effect);
        p.setMod(Stat.HP, (int) Math.round(p.getHP() - p.getStat(Stat.HP)));

    }

    @Override
    protected String describe(){
        return "использует Sing, усыпляет противка, если по нему нанесли урон на 1-3 хода";
    }
}