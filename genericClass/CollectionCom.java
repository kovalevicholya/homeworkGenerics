package homeworkCollection.genericClass;

import java.util.List;
import java.util.Objects;

public class CollectionCom implements Comparable<CollectionCom> {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public CollectionCom(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(CollectionCom o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionCom that=(CollectionCom) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "CollectionCom{"+
                "name='"+name+'\''+
                ", age="+age+
                '}';
    }
    public CollectionCom() {
            }
}

