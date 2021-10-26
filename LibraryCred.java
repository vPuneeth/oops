public class LibraryCred{

private int bookId;
private String bookName;
private String authorName;
private String publisher;
private int price;
private int noOfPages;

public LibraryCred(){
System.out.println( this.getClass().getSimpleName()    +  "  object is created");
}

public int getBookId(){
return bookId;
}
public void setBookId(int bookId){
this.bookId=bookId;
}

public String getBookName(){
return bookName;
}
public void setBookName(String bookName){
this.bookName=bookName;
}

public String getAuthorName(){
return authorName;
}
public void setAuthorName(String authorName){
this.authorName=authorName;
}

public String getPublisher(){
return publisher;
}
public void setPublisher(String publisher){
this.publisher=publisher;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}

public int getNoOfPages(){
return noOfPages;
}
public void setNoOfPages(int noOfPages){
this.noOfPages=noOfPages;
}

@Override
public String toString(){
return "Library data -- {bookId="+this.bookId+"  , bookName="+this.bookName+" , authorName="+this.authorName+", publisher="+this.publisher+" ,  price="+this.price+" , noOfPages="+this.noOfPages+" }";
}
}