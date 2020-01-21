package homeworkCollection.genericClass;

import java.util.*;

public class FilterMain {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(5);
        System.out.println(list);
        FilterApplicator filterApplicator = new FilterApplicator();
        FiltrCollection filterCollection1 = new FiltrCollection();
        filterApplicator.filter(list, filterCollection1);
        System.out.println(list);
        List<CollectionCom> collectionComs = new ArrayList<>();
        collectionComs.add(new CollectionCom("Kate", 25));
        collectionComs.add(new CollectionCom("Anna", 22));
        collectionComs.add(new CollectionCom("Vera", 35));
        collectionComs.add(new CollectionCom("Lena", 21));

        System.out.println(collectionComs);
        Collections.sort(collectionComs);
        System.out.println(collectionComs);






    }
}
