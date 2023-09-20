package homework.zaaw;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class Movie {
    private String title;
    private String director;
    private int boxOffice;
    private String dateOfRelease;

}
