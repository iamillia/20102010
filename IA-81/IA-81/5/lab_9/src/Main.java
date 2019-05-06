import java.util.*;

import static java.util.Comparator.naturalOrder;

public class Main {
    public static void main(String[] args) {

        Student st2 = new Student("Olia","Sugak",18,9,1, 76765654);
        Student st1 = new Student("Alina","Hrechyn",17,18,1, 7665444);

        Human st12 = new Student("Egor", "Gorban", 17,16, 1, 656688);
        Human st22 = new Student(null, "Cat", 19,18, 1, 7676555);
     Comparator<Student> PNCompare = (NB1, NB2) -> Double.compare(NB1.getPhoneNumber(),NB2.getPhoneNumber());
        TreeSet<Student> set = new TreeSet<>(PNCompare);

    Comparator<Human> AgeCompare = Comparator.comparing(Human::getAge).thenComparing(Human:: getPhoneNumber);
        TreeSet<Human> fet = new TreeSet<>(Comparator.comparing(Human::getName,Comparator.nullsFirst(naturalOrder())));

        Human[] humans = new  Human[2];
        humans[0] = st12;
        humans[1] = st22;
        Arrays.sort(humans, AgeCompare);

        Student[] students = new  Student[2];
        students[0] = st2;
        students[1] = st1;
        Arrays.sort(students,PNCompare.reversed());

        set.add(st1);
        set.add(st2);
        fet.add(st12);
        fet.add(st22);

        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(humans));
        System.out.println(set);
        System.out.println(fet);

        }
    }


