package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by User on 11.04.2016.
 */
public class Controller
{
    @FXML
    private TableView<Person> tableUser;

    @FXML
    private PasswordField kod=new PasswordField();
    @FXML
   TextField fio;
    @FXML
    TextField group_name;
    @FXML
    TableColumn<Person, String> student_column;
    @FXML
    TableColumn<Person, String> number_column;



                                         public void User(ActionEvent event) throws Exception {
                                    try {
                                        ((Node)(event.getSource())).getScene().getWindow().hide();
                                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UserIn.fxml"));
                                        Parent root1 = (Parent) fxmlLoader.load();
                                        Stage stage = new Stage();
                                        stage.setScene(new Scene(root1));
                                        stage.show();

                                    } catch(Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                                                                            public void UserMenu(ActionEvent event) throws Exception {

                                                                                                Person person = new Person(fio.getText(), group_name.getText());
                                                                                                person.getUser(fio.getText(), group_name.getText());

                                                                                                if (person.flag) {
                                                                                                    try {
                                                                                                        ((Node) (event.getSource())).getScene().getWindow().hide();
                                                                                                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("UserMenu.fxml"));
                                                                                                        Parent root1 = (Parent) fxmlLoader.load();
                                                                                                        Stage stage = new Stage();
                                                                                                        stage.setScene(new Scene(root1));
                                                                                                        stage.show();

                                                                                                    } catch (Exception e) {
                                                                                                        e.printStackTrace();
                                                                                                    }
                                                                                                }
                                                                                            }
    @FXML
                                                        public void Admin(ActionEvent event) throws Exception {
                                                            try {

                                                                ((Node) (event.getSource())).getScene().getWindow().hide();
                                                                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminIn.fxml"));
                                                                Parent root1 = (Parent) fxmlLoader.load();
                                                                Stage stage = new Stage();
                                                                stage.setScene(new Scene(root1));
                                                                stage.show();


                                                            } catch(Exception e) {
                                                                e.printStackTrace();
                                                            }
                                                        }
                                                                                        public void AdminMenu(ActionEvent event) {

                                                                                            Person person=new Person(kod.getText());
                                                                                            person.getLogin(kod.getText());

                                                                                          if (person.flag) {
                                                                                              try {

                                                                                                  ((Node) (event.getSource())).getScene().getWindow().hide();
                                                                                                  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminMenu.fxml"));
                                                                                                  Parent root1 = (Parent) fxmlLoader.load();
                                                                                                  Stage stage = new Stage();
                                                                                                  stage.setScene(new Scene(root1));
                                                                                                  stage.show();
                                                                                              } catch (Exception e) {
                                                                                                  e.printStackTrace();
                                                                                              }
                                                                                          }
                                                                                        }

    }