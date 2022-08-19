package sudhir.amazon.ds.dp;

/*
*
Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using
 the 2 x 1 tiles. A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically
 i.e., as 2 x 1 tile.
 *
Let “count(n)” be the count of ways to place tiles on a “2 x n” grid, we have following two ways to place first tile.
1) If we place first tile vertically, the problem reduces to “count(n-1)”
2) If we place first tile horizontally, we have to place second tile also horizontally. So the problem reduces to “count(n-2)”
Therefore, count(n) can be written as below.

   count(n) = n if n = 1 or n = 2
   count(n) = count(n-1) + count(n-2)
 * */
public class TilesProblem {
    public static void main(String[] args) {
        System.out.println(countNumberWaystoTileTheFloor(4));
    }

    private static Integer countNumberWaystoTileTheFloor(int numberOfTiles) {
        if (numberOfTiles ==1 || numberOfTiles == 2) return numberOfTiles;
        return countNumberWaystoTileTheFloor(numberOfTiles-1) + countNumberWaystoTileTheFloor(numberOfTiles-2);
    }
}
