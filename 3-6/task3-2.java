public class task2{
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));

    }
    private static int findZip(String s) {
        //Метод indexOf() ищет в строке заданный символ или строку, и их возвращает индекс (т.е. порядковый номер).
        if (s.lastIndexOf("zip") != s.indexOf("zip") && s.indexOf("zip") != -1)
            return s.lastIndexOf("zip");
        return -1;
    }
}
