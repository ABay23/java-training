public class Main {
    public static void main(String[] args){
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if (highScore > 25){
            highScore = 1000 + highScore; // Add Bonus Points
        }

        int health = 100;

        if ((health < 25) && (highScore > 100)){
            highScore = highScore - 1000;
        }

        int ax = 8500;
        int score = 0;
        boolean winner = true;
        int bonus = 1000;
        int levelCompleted = 5;

        score = calculateScore(ax,levelCompleted, bonus, winner);

        calculateScore(3000, 4, 2000, true);

        if( score < 5000){
            System.out.println("Score is under 5000");
        } else if(score > 5000 && score < 7000){
            System.out.println("Score is good!");
        } else if (score == 8000) {
            System.out.println("You hit the Jackpot!");
        } else {
            System.out.println("Noooooooooo");
        }
    }

    public static int calculateScore( int finalScore, int levelCompleted, int bonus, boolean winner){


        if (winner){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your Final Score is: " + finalScore);
        }

        return finalScore;
    }
}
