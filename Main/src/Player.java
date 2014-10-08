/**
 * Created by Клек on 03.10.2014.
 */
public class Player {
    public enum Protect {
        had, corpus, leg;
    }

    public int health;  //здоровье
    public int force;   //сила
    public int armor;   //броня
    public int fortun;  //удача
    public int agility; //ловкость
    public Protect protect;
    private Body body;

    public Player()
    {
        body = new Body();
    }

    public void hitHad(Player pl){
        //ударить в голову
    }

    public void hitBody(Player pl){
        //ударить в туловище
    }

    public void hitLeg(Player pl){
        //ударить в ноги
    }

    public void specialHit(Player pl){
        //особый удар (свой для каждого класса). Успех зависит от удачи и ловкости персонажей и немного рандомчика.
    }

    public void protect(Protect prt){
        //защитить голову/тело/ноги
    }
}
