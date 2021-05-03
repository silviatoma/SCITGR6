import library.Album;
import library.Books;
import library.Novel;
import org.apache.commons.lang3.ArrayUtils;

public class LibraryMain {

    public static void main(String[] args) {

        // Add books
        Books[] novel = new Novel[2];
        Books[] album = new Album[2];
        novel[0] = addNovel("Moara cu noroc", "literar", 150);
        novel[1] = addNovel("Slaughter House-Five", "SF", 200);
        album[0] = addAlbum("Elefentul Meu", "high", 50);
        album[1] = addAlbum("MyAlbum", "low", 20);
        // Remove books
        album = ArrayUtils.remove(album, 1);

        // Display remaining books
        for (Books books : novel) {
            System.out.println(books.getName() + " " + books.getType() + " " + books.getPageNumbers());
        }
        for (Books books : album) {
            System.out.println(books.getName() + " " + books.getPaperQuality() + " " + books.getPageNumbers());
        }

    }


    public static Books addNovel(String name, String type, int pageNumbers) {
        Books novel = new Novel();
        novel.setName(name);
        novel.setType(type);
        novel.setPagenumbers(pageNumbers);
        return novel;
    }

    public static Books addAlbum(String name, String paperQuality, int pageNumbers) {
        Books album = new Album();
        album.setName(name);
        album.setPaperQuality(paperQuality);
        album.setPagenumbers(pageNumbers);
        return album;

    }

}
