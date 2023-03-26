import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale.getCountry());
//        System.out.println(locale.getDisplayCountry());
//        System.out.println(locale.getDisplayLanguage());
//        System.out.println(locale.getDisplayName());
//        System.out.println(locale.getLanguage());
//        System.out.println(locale.getISO3Country());
//        System.out.println(locale.getISO3Language());

        Locale enLocale = new Locale("fr","FR");
        System.out.println(enLocale.getDisplayLanguage(enLocale));



    }


}
