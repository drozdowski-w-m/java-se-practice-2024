package pl.globallogic.sessions.session1;

public class VariablesPlayground {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    class HelloWorld {
        public static void main(String[] args) {
            int line1 = 100;
            int line2 = 100;
            if( ++line2 > line1 || line2++ == line1){

                line1++;

            }
            line1 = ( (line1++ > line2 && ++line2 < line1++) ? ++line1 : ++line2 );
            // && daje nam krotkie sprawdzenie (tylko 1 war) wiec majac false robimy ++line2 i przypisujemy to do line1
            // otrzymujemy wtedy 102 w obu zmiennych
            System.out.println(line1);
            System.out.println(line2);

        }
    }
}
