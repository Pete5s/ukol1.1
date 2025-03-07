import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
            public class Main {

            public static void ukol1() {
                System.out.println("Hello world!");
            }

            public static void ukol2() {
                String uzivatel = "Karel";
                System.out.println(uzivatel);
            }

            public static void ukol3() {
                int pocetLekci = 10;
                System.out.println(pocetLekci);
            }

            public static void ukol4() {
                double cena = 10.0;
                System.out.println(cena);
            }

            public static void ukol5() {
                BigDecimal cena = BigDecimal.valueOf(0);
                for (int i = 0; i < 10; i++) {
                    cena = BigDecimal.valueOf(0.1);
                }
                System.out.println(cena);
            }

            public static void ukol6() {
                BigDecimal cena = BigDecimal.ZERO;
                cena = cena.add(BigDecimal.valueOf(0.1));
                System.out.println(cena);
            }

            public static void ukol7() {
                String vykonMotoru = "120";
                System.out.println("Výkon Motoru je: " + vykonMotoru + " kW.");
            }

            public static void ukol8() {
                int velikostKosile = 37;
                System.out.println("Velikost košile je: " + velikostKosile + ".");
            }

            public void ukol9() {
                System.out.println("Metoda *skoro* bez chybičky!");
            }

            public static void main(String[] args) {
                System.out.println("Oprav chyby a spusť všechny metody!");
                System.out.println("Komentáře odstraníš klávesovou "
                        +"zkratkou <Ctrl>+</> - použij lomítko "
                        +"na numerické klávesnici.");

                ukol1();
                ukol2();
                ukol3();
                ukol4();
                ukol5();
                ukol6();
                ukol7();
                ukol8();

                Main main = new Main(); // Vytvoření instance Main pro volání nestatické metody
                main.ukol9();
            }
        }