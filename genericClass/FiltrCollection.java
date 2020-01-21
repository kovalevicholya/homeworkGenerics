package homeworkCollection.genericClass;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FiltrCollection {
    @Override
    public String toString() {
        return "FiltrCollection{}";
    }

    public Collection filterCol(Collection col) {

        for(int i=0; i<col.size(); i++) {
            Iterator it = col.iterator();
            Object o = it.next();
            if(o==it.next())
            it.remove();
        }
        return col;

    }
}
