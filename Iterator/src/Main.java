
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("マギ"));
		bookShelf.appendBook(new Book("ドラゴンボール"));
		bookShelf.appendBook(new Book("ナルト"));
		bookShelf.appendBook(new Book("ワンピース"));

		Iterator it = bookShelf.iterator();

		while(it.hasNext()) {

			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
