public class DateThree {

    private int day;
    private int month;
    private int year;

    public void setDay(int d) {
        day = d;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int d, int m, int y) {
        if (d > 0 && d < 32) {
            day = d;
        } else {
            System.out.println("Dia inválido");
        }

        if (m > 0 && m < 13) {
            month = m;
        } else {
            System.out.println("Mes inválido");
        }

        if (y > 999 && y < 10001) {
            year = y;
        } else {
            System.out.println("Anio inválido");
        }
    }

    public void displayDate() {
        System.out.println("La fecha es: " + day + "-" + month + "-" + year);
    }

}
