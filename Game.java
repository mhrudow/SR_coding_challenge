public class Game {
    private Player player1;
    private Player player2;
    private Player server;
    private Player receiver;
    private int numServes;
    
    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        if ((int) Math.round(100*Math.random()) < 50) { 
            server = player1;
            receiver = player2;
        }
        else { 
            server = player2;
            receiver = player1;
        }
        numServes = 5;
        player1.resetScore();
        player2.resetScore();
    }
    
    public void ralley() {
        numServes--;
        Player hitter = server;
        Player returner = receiver;
        boolean serve = true;
        
//        System.out.println("The score is now " + player1.getName() + ": " +
//                           player1.getScore() + ", " + player2.getName() + ": " +
//                           player2.getScore());
        
        while (returnBall(hitter, returner, serve)) {
            serve = false;
            
            if (hitter == player1) { 
                hitter = player2;
                returner = player1;
            }
            else {
                hitter = player1;
                returner = player2;
            }
        }
               
        if (numServes <= 0) {
            if (server == player1) { 
                server = player2;
                receiver = player1;
            }
            else {
                server = player1;
                receiver = player2;
            }
            numServes = 5;
        }
    }
    
    public boolean returnBall(Player hitter, Player returner, boolean served) {
        int serve = 0;
        if (served) { 
            serve = 10;
//            System.out.println(hitter.getName() + "serves" 
//                                  + returner.getName());
        }
        char hitType = hitter.hit();
        if (hitType == 'u') { 
            hitter.score();
//            System.out.println(hitter.getName() + " hit an unstopable hit");
            return false;
        }
//        System.out.println(hitter.getName() + " hit a " + hitType + " hit");
        if (!returner.returnHit(hitType, serve)) {
            hitter.score();
            return false;
        }
        return true;
    }
    
    public Player playGame() {
        while (player1.getScore() < 21 && player2.getScore() < 21) {
            ralley();
        }
//        System.out.println("The final score is " + player1.getName() + ": " +
//                           player1.getScore() + ", " + player2.getName() + ": " +
//                           player2.getScore());
        Player winner;
        Player loser;
        if (player1.getScore() == 21) { 
            winner = player1; 
            loser = player2;
        }
        else { 
            winner = player2; 
            loser = player1;
        }
        player1.resetScore();
        player2.resetScore();
        winner.won();
        loser.lost();
        return winner;
    }
}
