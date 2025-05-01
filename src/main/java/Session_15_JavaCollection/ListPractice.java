package Session_15_JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);
        List<Integer> myListUpdated = updateList(myList, 5 , 600);
        System.out.println(myListUpdated);
        System.out.println("Exista 600 in myListUpdated? :" +isElementPresent(myListUpdated, 600));
    }

    public static boolean isElementPresent (List<Integer> list, int value){
        return list.contains(value);
    }

    // metoda publica care face update la aceasta lista (metoda statica caci nu vreau sa creez un obiect)
// pentru a face update avem nevoie de lista curenta, un index ca sa adaugam un element folosim metoda si avem nevoie de o valoare .
    public static List<Integer> updateList(List<Integer> list, int index , int value){
        if ( index <0 || index > list.size()){
            System.out.println("invalid index");
            return list;
        }

        // adaugam un element nou

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        return result;
    }


    public static List<Integer> initializeList(){ // am creat o metoda
        List<Integer> List = new ArrayList<>(); // am creat un obiect care returneaza gol
        for ( int index = 0; index <10; index ++){
            List.add(index);
        }
        return List;
    }

}
