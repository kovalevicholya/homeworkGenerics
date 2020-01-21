package homeworkCollection.genericClass;

/*3. Написать дженерик класс FilterApplicator который умеет обрабатывать
коллекцию ЛЮБЫХ элементов будет иметь следующие методы:
 3.1. статический метод filter. У метода filter будет два параметра. 1
  коллекция в которой будет происходить фильтрация, 2 класс который реализует алгоритм фильтрации.
  И будет возвращать результат фильтрации
 3.2. статический ДЖЕНЕРИК МЕТОД sort который будет принимать
 1 параметр коллекцию элементов реализующих интерфейс Comparable. И будет возвращать результат сортировки*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class FilterApplicator<T> {

    public static void filter(Collection c, FiltrCollection filtrCollection) {
        FiltrCollection filterCollection1=new FiltrCollection();
        filterCollection1.filterCol(c);
    }

    public static <T> CollectionCom sort(CollectionCom col){
        CollectionCom collectionCom = new CollectionCom();
        collectionCom.compareTo(col);
        return col;
    }
}

