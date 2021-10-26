public class BooksCred{

public LibraryCred[] books;
private int index;

public BooksCred(int size){
books = new LibraryCred[size];
System.out.println("inside BooksCred constructor");
}

public boolean addBooksInOrder(LibraryCred books){   //create op
boolean bookAdded = false;
System.out.println("inside create method");
if(books != null){
this.books[index++]=books;
bookAdded=true;
}else{
System.out.println("no book is added");
return bookAdded = false;
}
return bookAdded;
}

public void getAllBooks(){                                         	//to fetch details
for(int i=0;i<books.length;i++){
System.out.println(books[i]);
}
}

public LibraryCred getBookById(int bookId){       //read op by id
LibraryCred id = null;
if(bookId != 0){
   for(int i=0;i<books.length;i++){
        if(books[i].getBookId() == bookId){
         id=books[i];
        System.out.println("book found by id : " + bookId);
        }
    }
 }else{
System.out.println("no records found");
         }
  return id;
}

public LibraryCred getBookByName(String bookName){       //read op by bookname
LibraryCred name = null;
if(bookName != null){
   for(int i=0;i<books.length;i++){
        if(books[i].getBookName().equals(bookName)){
         name=books[i];
        System.out.println("book found by name : " + bookName);
        }
    }
 }else{
System.out.println("no records found");
         }
  return name;
}

public LibraryCred getBookByAuthor(String authorName){       //read op by authorname
LibraryCred author = null;
if(authorName != null){
   for(int i=0;i<books.length;i++){
        if(books[i].getAuthorName().equals( authorName)){
         author=books[i];
        System.out.println("book found by Authorname : " + authorName);
        }
    }
 }else{
System.out.println("no records found");
         }
  return author;
}

public LibraryCred getBookByPublisher(String publisher){       //read op by publisher
LibraryCred distributor = null;
if(publisher != null){
   for(int i=0;i<books.length;i++){
        if(books[i].getPublisher().equals(publisher)){
         distributor=books[i];
        System.out.println("book found by publisher : " + publisher);
        }
    }
 }else{
System.out.println("no records found");
         }
  return distributor;
}

public LibraryCred getBookByPrice(int price){       //read op by price
LibraryCred cost= null;
if(price != 0){
   for(int i=0;i<books.length;i++){
        if(books[i].getPrice() == price){
         cost=books[i];
        System.out.println("book found by price : " + price);
        }
    }
 }else{
System.out.println("no records found");
         }
  return cost;
}

public LibraryCred getBookByTotalPages(int noOfPages){       //read op by totalpages
LibraryCred totalPages = null;
if(noOfPages != 0){
   for(int i=0;i<books.length;i++){
        if(books[i].getNoOfPages() == noOfPages){
         totalPages=books[i];
        System.out.println("book found by noOfPages : " + noOfPages);
        }
    }
 }else{
System.out.println("no records found");
         }
  return totalPages;
}

public boolean updatePriceById(int bookId , int price){
boolean isItUpdated=false;
LibraryCred libraryCred = null;
if((bookId > 0)  && (price > 0)){
     for(int i=0 ; i<books.length;i++){
         if(books[i].getBookId() == bookId){
        System.out.println("book found by id : " + bookId);
     books[i].setPrice(price);
    isItUpdated=true;
        }
}
}else{
System.out.println("no records found");
}
return isItUpdated; 
}
}