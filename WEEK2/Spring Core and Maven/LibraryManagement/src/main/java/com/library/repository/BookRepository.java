
/*package com.library.repository;

public class BookRepository {
    public void displayBooks() {
        System.out.println("Fetching books from repository...");
    }
}*/
package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void displayBooks() {
        System.out.println("Fetching books from repository...");
    }
}