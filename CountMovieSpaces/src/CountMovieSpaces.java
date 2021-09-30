public class CountMovieSpaces {
    public static void main(String[] args) {
        String quote = "Hakuna Matata!";
        int spaces= 0;
        for (int i = 0; i < quote.length(); i++) {
            if (Character.isWhitespace(quote.charAt(i))) {
                spaces++;
            }
        }
        System.out.println(spaces);
    }
}
