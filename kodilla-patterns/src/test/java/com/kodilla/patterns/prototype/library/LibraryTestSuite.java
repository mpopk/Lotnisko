package com.kodilla.patterns.prototype.library;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
@Test

    public void testGetBooks() {

                //given

                Library library = new Library("Library1");
                IntStream.iterate(1, n -> n + 1).limit(4).forEach(n -> library.getBooks().add(new Book("title " + n, "author " + n, LocalDate.now().minusDays(n))));

                //making a shallow copy of object board
                Library clonedLibrary = null;
                try {
                    clonedLibrary = library.shallowCopy();
                    clonedLibrary.setName("Library2");
                } catch (CloneNotSupportedException e) {
                    System.out.println(e);
                }

                //making a deep copy of object board
                Library deepClonedLibrary = null;
                try {
                    deepClonedLibrary= library.deepCopy();
                    deepClonedLibrary.setName("Library3");
                } catch (CloneNotSupportedException e) {
                    System.out.println(e);
                }

                //When
                library.getBooks().add(new Book("Title1", "Author1", LocalDate.now()));

                //Then
                System.out.println(library);
                System.out.println(clonedLibrary);
                System.out.println(deepClonedLibrary);
                Assert.assertEquals(5, library.getBooks().size());
                Assert.assertEquals(5, clonedLibrary.getBooks().size());
                Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
                Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
                Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
            }
    }


