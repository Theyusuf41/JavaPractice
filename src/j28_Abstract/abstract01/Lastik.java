package j28_Abstract.abstract01;

public abstract class Lastik extends Honda { // abs classlar arasinda implementation zorunlu degildir
    public abstract void lastik(); // abst method alinmasi mecburi


    public void kisLastigi(){ // concrete meth alinmasi opsiyonel
        System.out.println("Ister misin agam kis lastigi! ");
    }

}
/*
extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
java CTE verdi
çözüm:
a) Unimplemented (uyarlanmamış) method implement edilmeli
b)parent Honda class'dan abstarct keyword kaldırılmalı
c)concrete olan child Civic class abstract tanımlanmalı
 */

// concerete class'da abstract method tanımlanır mı?
// public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
// TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli