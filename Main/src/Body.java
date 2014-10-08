import java.awt.*;

/**
Тело перса состоит из частей (тело, голова, плечи, предплечья, кисти, бёдра, голени, стопы). Каждая часть лежит в отдельном файле.
 */
public class Body {
    //файлы частей тела персонажа
    public String bodyFileName;
    public String hadFileName;
    public String shoulderFileName;//плечо
    public String forearmFileName;//предплечие
    public String palmFileName;//ладонь
    public String thighFileName;//бедро
    public String shinFileName;//голень
    public String footFileName;//стопа

    //точки от которых начинается построение частей тела
    public Point bodyBasis;
    public Point hadBasis;
    public Point shoulderBasis;//плечо
    public Point forearmBasis;//предплечие
    public Point palmBAsis;//ладонь
    public Point thighBAsis;//бедро
    public Point shinBasis;//голень
    public Point footBasis;//стопа

    public Body(/*имена файлов*/){
        //инициализация полей
    }

    public void changeHandPosition(double shoudernDeviation /*угол отклонения плеча*/,double forearmDeviation /*предплечия*/, double palmDeviation){
        /*плечо отклоняется от вертикали на некий угол, предплечие отклоняется на угол от прямой линии с плечом*/
    }

    public void changeFootPosition(double thingDeviation,double shinDeviation, double footDeviation){
        /* аналогично*/
    }
}
