public class Ratings {
    private final int REVIEWERS = 10;
    private final int MOVIES = 5;

    private int [] [] grid;

    public Ratings(){
        grid = new int [REVIEWERS][MOVIES];
    }

    public void set(int reviewer, int movie, int rating){
        grid[reviewer][movie] = rating;
    }

    //Return the value of the wlwmwnt in the specified position of the grid
    public int get(int reviewer, int movie){
        return grid[reviewer][movie];
    }
    //Output the grid as a table. no headings ate required
    public void display(){
        for (int i = 0; i < REVIEWERS; i++) {
            for (int j = 0; j < MOVIES; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println("");
        }

    }
    //Count the number of ratings in the grid above the secified value
    public int countAbove(int value){
        int count = 0;
        for (int i = 0; i < REVIEWERS; i++) {
            for (int j = 0; j < MOVIES; j++) {
                if(this.get(i,j) > value){
                    count ++;
                }
            }
        }
        return count;
    }
}
