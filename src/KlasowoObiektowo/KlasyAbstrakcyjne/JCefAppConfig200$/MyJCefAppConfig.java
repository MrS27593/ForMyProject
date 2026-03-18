//package KlasyAbstrakcyjne.JCefAppConfig200$;
//
//import com.jetbrains.cef.JCefAppConfig;
//import org.cef.CefApp;
//import org.cef.CefApp.CefAppState;
//import org.cef.settings.JCefAppConfig;
//import org.cef.*;
//
//public class MyAppConfig extends JCefAppConfig {
//    @Override
//    public void beforeAppStart() {
//        // Dodajemy flagi Chromium przez CefApp.addAppArgs
//        CefApp.addAppArgs("--disable-gpu");
//        CefApp.addAppArgs("--disable-webgl");
//        CefApp.addAppArgs("--headless");
//    }
//
//    /**
//     *
//     */
//    @Override
//    protected void init() {
//        CefApp.addAppArgs("--disable-gpu");
//        CefApp.addAppArgs("--disable-webgl");
//        CefApp.addAppArgs("--headless");
//    }
//}
//
// class BrowserLauncher{
//    public static void main(String[] args) {
//        JCefAppConfig jCefAppConfig = new MyAppConfig();
//        CefApp cefApp = CefApp.getInstance(args, jCefAppConfig.getCefSettings());
//    }
//}