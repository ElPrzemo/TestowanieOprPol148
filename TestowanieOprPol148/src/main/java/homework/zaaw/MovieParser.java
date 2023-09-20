package homework.zaaw;

public class MovieParser {
    public static Movie parseMovie(String input) {
        String[] values = input.split(",");
        if (values.length != 4) {
            throw new IllegalArgumentException("Nieprawidłowy format danych");
        }

        Movie movie = new Movie();

        String title = values[0].trim();
        movie.setTitle(title);

        String director = values[1].trim();
        movie.setDirector(director);

        try {
            int boxOffice = Integer.parseInt(values[2].trim());
            movie.setBoxOffice(boxOffice);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Nieprawidłowy format liczby dla boxOffice");
        }

        String dateOfRelease = values[3].trim();
        movie.setDateOfRelease(dateOfRelease);
        return movie;
    }

}
