package OOP.Classes;

public class Library {
    String bookName;
    String authorName;
    int totalCopies;
    int availableCopies;

    Library(){
        this.bookName="Wings of Fire";
        this.authorName="A.P.J. Abdul Kalam";
        this.totalCopies=25;
        this.availableCopies=15;
    }

    Library(String book,String author,int totalCopies,int available){
        this.bookName=book;
        this.authorName=author;
        this.totalCopies=totalCopies;
        this.availableCopies=available;
    }

    void borrowBook() {
        if (availableCopies > 0) {
            availableCopies -= 1;
            System.out.println("book borrowes Successfully!");
        } else {
            System.out.println("No copies available!");
        }
    }

        void returnBook(){
            availableCopies+=1;
            System.out.println("Book returned Successfully!");
        }

        void printDetails(){
            System.out.println("BookName: " + bookName);
            System.out.println("authorName: " + authorName);
            System.out.println("TotalCopies: " + totalCopies);
            System.out.println("availableCopies: " + availableCopies);
        }

    }

