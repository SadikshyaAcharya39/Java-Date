public class BookInnerClass {
    public static void main(String[] args) {
        Books books = new Books();
        Books.Ramayan ramayan = books.new Ramayan();
        System.out.println(books.no0fItems);
        System.out.println(books.name);
        System.out.println(ramayan.type);
    }
}
