package day11;
public class ChessboardSquare {

    public boolean squareIsWhite(String coordinates) {

        char column = coordinates.charAt(0);
        char row = coordinates.charAt(1);

        int col = column - 'a' + 1;
        int r = row - '0';

        return (col + r) % 2 != 0;
    }

    public static void main(String[] args) {

        ChessboardSquare obj = new ChessboardSquare();

        System.out.println(obj.squareIsWhite("a1"));
    }
}