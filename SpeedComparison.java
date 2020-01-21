package homeworkCollection;

import colection.Passport;

import java.util.*;

public class SpeedComparison {
    public static void main(String[] args) {
        List<PassportNew> list=new ArrayList<>();

        Random random=new Random();
        long startList;
        long finishList;
        startList=System.currentTimeMillis();

        for (int i=0; i<100000; i++) {
            int a=random.nextInt(10000000);
            String b=" "+a;
            list.add(new PassportNew(b));
        }
        finishList=System.currentTimeMillis()-startList;
        System.out.println("Время заполнение ArrayList: "+finishList);

        List<PassportNew> linked=new LinkedList<>();

        Random random1=new Random();
        long startLinked;
        long finishLinked;
        startLinked=System.currentTimeMillis();

        for (int i=0; i<100000; i++) {
            int a=random.nextInt(10000000);
            String b=" "+a;
            linked.add(new PassportNew(b));
        }
        finishLinked=System.currentTimeMillis()-startLinked;
        System.out.println("Время заполнение LinkedList: "+finishLinked);

        long startListR;
        long finishListR;
        startListR=System.currentTimeMillis();

        Iterator<PassportNew> iterator=list.iterator();
        while (iterator.hasNext()) {
            PassportNew e=iterator.next();
            iterator.remove();
        }

        finishListR=System.currentTimeMillis()-startListR;
        System.out.println("Время удаление ArrayList: "+finishListR);

        long startLinkedR;
        long finishLinkedR;
        startLinkedR=System.currentTimeMillis();

        Iterator<PassportNew> iterator2=linked.iterator();
        while (iterator2.hasNext()) {
            PassportNew e=iterator2.next();
            iterator2.remove();
        }
        finishLinkedR=System.currentTimeMillis()-startLinkedR;
        System.out.println("Время удаление LinkedList: "+finishLinkedR);
    }
}
