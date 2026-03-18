//package Projekty.GUI.Wyklady.W13.ex02;
//
//import javafx.beans.property.ReadOnlyStringWrapper;
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;
//
//public
//    class User {
//
//    private final String USERNAME_PROP_NAME = "username";
//    private ReadOnlyStringWrapper userName;
//
//    private final String PASSWORD_PROP_NAME = "password";
//    private StringProperty password;
//
//    public User() {
//        this.userName = new ReadOnlyStringWrapper(
//            this, USERNAME_PROP_NAME, "tomaszew"
//        );
//        this.password = new SimpleStringProperty(
//            this, PASSWORD_PROP_NAME, "1234qwer"
//        );
//    }
//
//    public String getUserName() {
//        return userName.get();
//    }
//
//    public ReadOnlyStringWrapper userNameProperty() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password.get();
//    }
//
//    public StringProperty passwordProperty() {
//        return password;
//    }
//}
