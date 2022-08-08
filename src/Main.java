public class Main {
    public static void main(String[] args) {
        Author jackLondon = new Author("Джек", "Лондон");
        Book whiteFang = new Book("Белый клык", 1876, jackLondon);

        whiteFang.setPublishDate(1882);

        Author kateSierra = new Author("Кэти", "Сьерра");
        Book java = new Book("Java", 1998, kateSierra);

        java.setPublishDate(2009);

        System.out.println(jackLondon);
        System.out.println(whiteFang);
        System.out.println();
        System.out.println(kateSierra);
        System.out.println(java);
    } // Конец метода main
} // Конец класс Main

