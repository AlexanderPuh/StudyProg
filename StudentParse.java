package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by User on 26.04.2016.
 */
public class StudentParse {
    private ObservableList<Person> personData = FXCollections.observableArrayList();
public  StudentParse()
{
personData.add(new Person(Person.surname.get(0).toString(),Person.numberOfgroup.get(0).toString()));


}

    public ObservableList<Person> getPersonData() {
        return personData;
    }
}
