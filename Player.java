public class Player {
    private Hit hit;
    private int gamesWon;
    private int gamesLost;
    private int score;
    private String name;
    
    public Player(Integer[] hit, Integer[] returnHit, String name) {
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.hit = new Hit(hit, returnHit);
        this.score = 0;
        this.name = name;
    }
    
    public char hit() { return hit.hit(); }
    public boolean returnHit(char c, int serve) { 
        return hit.returnHit(c, serve); 
    }
    
    public int getWon() { return gamesWon; }
    public void won() { gamesWon++; }
    
    public int getLost() { return gamesLost; }
    public void lost() { gamesLost++; }
    
    public int getScore() { return score; }
    public void score() { ++score; }
    public void resetScore() { score = 0; }
    
    public String getName() { return name; }
}
