package Urok4;

public class Payment {



    public static void main (String[] args){
        Pay[] abc = new Pay [12];
        abc[0] = new Pay("chicken — курица");
        abc[1] = new Pay("bacon — бекон");
        abc[2] = new Pay("salmon – семга");
        abc[3] = new Pay("asparagus — спаржа");
        abc[4] = new Pay("beet — свекла");
        abc[5] = new Pay("cabbage — капуста");
        abc[6] = new Pay("carrot — морковь");
        abc[7] = new Pay("garlic — чеснок");
        abc[8] = new Pay("potato — картофель");
        abc[9] = new Pay("apple — яблоко");
        abc[10] = new Pay("lemon — лимон");
        abc[11] = new Pay("buckwheat — гречка");


        for (int i = 0; i < 12; i++) {
//            if (i == 1) {
                System.out.println(abc[i].name);
//            }
        }

    }
}

class Pay{
    String name;

    public Pay (String name){
        this.name = name;
    }
}
