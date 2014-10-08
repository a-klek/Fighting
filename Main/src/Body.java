import java.awt.*;

/**
Тело перса состоит из частей (тело, голова, плечи, предплечья, кисти, бёдра, голени, стопы). Каждая часть лежит в отдельном файле.
 */
public class Body {
    //файлы частей тела персонажа
    private String bodyFileName;        //туловище
    private String hadFileName;         //голова
    private String shoulderFileName;    //плечо
    private String forearmFileName;     //предплечие
    private String rightpalmFileName;   //правая ладонь
    private String leftpalmFileName;    //левая ладонь
    private String thighFileName;       //бедро
    private String shinFileName;        //голень
    private String footFileName;        //стопа

    //точки от которых начинается построение частей тела
    private Point bodyBasis;        //туловище
    private Point hadBasis;         //голова
    private Point shoulderBasis;    //плечо
    private Point forearmBasis;     //предплечие
    private Point palmBAsis;        //ладонь
    private Point thighBAsis;       //бедро
    private Point shinBasis;        //голень
    private Point footBasis;        //стопа

    public Body(/*имена файлов*/){
        //инициализация полей
    }

    protected void changeHandPosition(double shoudernDeviation /*угол отклонения плеча*/,double forearmDeviation /*предплечия*/, double palmDeviation){
        /*плечо отклоняется от вертикали на некий угол, предплечие отклоняется на угол от прямой линии с плечом*/
    }

    protected void changeFootPosition(double thingDeviation,double shinDeviation, double footDeviation){
        /* аналогично*/
    }

    protected void changeBodyPosition(double bodyDeviation){

    }

    protected void changeHadPosition(double hadDeviation){

    }
}
