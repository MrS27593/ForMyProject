package KlasowoObiektowo.SlowaKluczowe.SwitchDone;

import static KlasowoObiektowo.SlowaKluczowe.SwitchDone.Role.*;

public class Main {
    public static void main(String[] args) {
        int value = 2;
        switch (value){
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            default:
                System.out.println("Inna wartość");
        }
        AccessManager accessManager = new AccessManager();
        accessManager.checkPermision(ADMIN);
    }
}
enum Role{
    ADMIN, USER, GUEST
}

class AccessManager{

    Role role = ADMIN;
    void checkPermision(Role role){
        switch (role){
            case ADMIN:
                System.out.println("Pełny dostęp");
                break;
            case USER:
                System.out.println("Dostęp standardowy");
                break;
            case GUEST:
                System.out.println("Dostęp ograniczony");
                break;
            default:
                System.out.println("Nieznana rola");
        }
    }

    String type = switch(role){
        case ADMIN -> "Pełny dostęp";
        case USER -> "Standardowy dostęp";
        case GUEST -> "Ograniczony dostęp";
    };
    int a,b;
    String operation;
    int result = switch (operation){
      case "+" -> {
          yield a + b;
      }
      case "-" ->{
          yield a - b;
      }
        default -> 0;
    };
}

class ManuHandler{
    void handleOption(String option){
        switch (option.toLowerCase()){
            case "start":
                startApp();
                break;
            case "stop":
                stopApp();
                break;
            case "status":
                showStatus();
                break;
            default:
                System.out.println("Nieznana opcja");
        }
    }

    private void showStatus() {
        System.out.println("Pokazywanie statusu");
    }

    private void stopApp() {
        System.out.println("Stopping app");
    }

    private void startApp() {
        System.out.println("Starting app");
    }
}