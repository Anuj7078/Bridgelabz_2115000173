import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
@interface Author {
    String name();
}
@Author(name = "PremChand")
class Document {
}

public class AuthorAnnotationReader {
    public static void main(String[] args) {
        Class<Document> clazz = Document.class;
        Author author = clazz.getAnnotation(Author.class);

        System.out.println(author != null ? "Author Name: " + author.name() : "No Author annotation found.");
    }
}