import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][][] books = {{{"book1" },{"author1" }},{{"book2" },{"author2" }},{{"book3" },{"author3" }}};

        for (int i = 0; i < books.length; i++) {  //идём по строкам
            for (int j = 0; j < books[0].length; j++) {//идём по столбцам
                System.out.print(Arrays.toString(books[i][j])); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
    }
}