public class L20231004 {
    public static void main(String[] args) {
        // задача 1
        int i=1345;
        byte b=67;
        short s=156;
        long l=8888888888L;
        float f=678.576f;
        double d=87606.45679;
        System.out.println("Задача 1");
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной s с типом short равно "+s);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом int равно "+f);
        System.out.println("Значение переменной d с типом double равно "+d);
        // задача 2
        float f1=27.12f;
        long l1=987678965549L;
        float f2=2.786f;
        short s1=569;
        short s2=-159;
        short s3=27897;
        byte b1=67;
        // задача 3
        byte classLP=23;
        byte classAS=27;
        byte classEA=30;
        short kolvoListovObshhee=480;
        int kolvoListovNaUch = kolvoListovObshhee/(classAS+classEA+classLP);
        System.out.println("Задача 3");
        System.out.println("На каждого ученика рассчитано "+kolvoListovNaUch+" листов бумаги");
        // задача 4
        byte ishodniyResult=16;
        byte ishodnoeVremya=2;
        byte time1=20;      // 20 min
        short time2=1440;   // 1 d
        short time3=4320;   // 3 d
        int time4=43200;    // 30 d
        int res1=ishodniyResult/ishodnoeVremya*time1;
        int res2=ishodniyResult/ishodnoeVremya*time2;
        int res3=ishodniyResult/ishodnoeVremya*time3;
        int res4=ishodniyResult/ishodnoeVremya*time4;
        System.out.println("Задача 4");
        System.out.println("За "+time1+" минут машина произвела "+res1+" штук бутылок");
        System.out.println("За "+time2+" минут машина произвела "+res2+" штук бутылок");
        System.out.println("За "+time3+" минут машина произвела "+res3+" штук бутылок");
        System.out.println("За "+time4+" минут машина произвела "+res4+" штук бутылок");
        // задача 5
        byte kolvoObshhee=120;
        byte kolvoBelNaClass=2;
        byte kolvoKorNaClass=4;
        int kolvoClassov=kolvoObshhee/(kolvoBelNaClass+kolvoKorNaClass);
        int kolvoBel=kolvoBelNaClass*kolvoClassov;
        int kolvoKor=kolvoKorNaClass*kolvoClassov;
        System.out.println("Задача 5");
        System.out.println("В школе, где "+kolvoClassov+" классов, нужно "+kolvoBel+" банок белой краски и "+
                kolvoKor+" банок коричневой краски");
        // задача 6
        byte kolvoBananov=5;
        byte mass1Banana=80;
        short obyomMoloka=200;
        byte mass100MlMoloka=105;
        byte kolvoBriketovMorozh=2;
        byte mass1BriketaMorozh=100;
        byte kolvoRawEgg=4;
        byte mass1RawEgga=70;
        float massG= kolvoBananov*mass1Banana + obyomMoloka/100*mass100MlMoloka +
                kolvoBriketovMorozh*mass1BriketaMorozh + kolvoRawEgg*mass1RawEgga;
        float massKg=massG/1000;
        System.out.println("Задача 6");
        System.out.println("Вес спортзавтрака: "+massG+" г или "+massKg+" кг");
        // задача 7
        short massSbros=7000;
        short minMassSbrosVDen=250;
        short maxMassSbrosVDen=500;
        int maxDneyNaSbros=massSbros/minMassSbrosVDen;
        int minDneyNaSbros=massSbros/maxMassSbrosVDen;
        int srDneyNaSbros=(minDneyNaSbros+maxDneyNaSbros)/2;
        System.out.println("Задача 7");
        System.out.println("При худении каждый день на 250 грамм потребуется дней: "+maxDneyNaSbros);
        System.out.println("При худении каждый день на 500 грамм потребуется дней: "+minDneyNaSbros);
        System.out.println("Среднее требуемое количество дней: "+srDneyNaSbros);
        // задача 8
        int earnMasha=67760;
        int earnDenis=83690;
        int earnChristina=76230;
        System.out.println("Задача 8");
        // зп*1.1*12 - зп*12 = зп*0.1*12
        System.out.println("Маша теперь получает "+(earnMasha+earnMasha/10)+" рублей. Годовой доход вырос на "+
                (earnMasha*12/10)+" рублей");
        System.out.println("Денис теперь получает "+(earnDenis+earnDenis/10)+" рублей. Годовой доход вырос на "+
                (earnDenis*12/10)+" рублей");
        System.out.println("Кристина теперь получает "+(earnChristina+earnChristina/10)+" рублей. Годовой доход вырос на "+
                (earnChristina*12/10)+" рублей");
    }
}
