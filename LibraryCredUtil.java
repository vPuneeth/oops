import java.util.Scanner;
class LibraryCredUtil{

public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the no. of books");
int size = sc.nextInt();

BooksCred cred = new BooksCred(size);

for(int i=0 ; i<size;i++){

LibraryCred read = new LibraryCred();

System.out.println("enter the bookId");
int bookId = sc.nextInt();
read.setBookId(bookId);
System.out.println("enter the book name");
String bookName = sc.next();
read.setBookName(bookName);
System.out.println("enter the book author");
String authorName = sc.next();
read.setAuthorName(authorName);
System.out.println("enter the book publisher");
String publisher = sc.next();
read.setPublisher(publisher);
System.out.println("enter the book price");
int price  = sc.nextInt();
read.setPrice(price);
System.out.println("enter the book total pages");
int noOfPages  = sc.nextInt();
read.setNoOfPages(noOfPages);

boolean isAdded =cred.addBooksInOrder(read);
System.out.println("book added "  + isAdded);

}
cred.getAllBooks();

System.out.println("enter the book id to be found");
int ids=sc.nextInt();
System.out.println(cred.getBookById(ids));

System.out.println("enter the book name to be found");
String nam=sc.next();
System.out.println(cred.getBookByName(nam));

System.out.println("enter the book author to be found");
String autName=sc.next();
System.out.println(cred.getBookByAuthor(autName));

System.out.println("enter the book publisher to be found");
String puher=sc.next();
System.out.println(cred.getBookByPublisher(puher));

System.out.println("enter the book price to be found");
int pri =sc.nextInt();
System.out.println(cred.getBookByPrice(pri));

System.out.println("enter the books total pages to be found");
int pages =sc.nextInt();
System.out.println(cred.getBookByTotalPages(pages));

System.out.println("enter the book Id and price to update");
int id1=sc.nextInt();
int price1 = sc.nextInt();
System.out.println( cred.updatePriceById(id1,price1));


cred.getAllBooks();


}

}