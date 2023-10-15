package bowling;

public class Game {
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }
    public int score() {
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            System.out.println("frame: " + frame + ", frameIndex: " + frameIndex + ", score: " + score);
            if(isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                System.out.println("strike: " + score);
                frameIndex++;
            } else if (isSpare(frameIndex)) {
                score += 10 + spareBonus(frameIndex);
                System.out.println("spare: " + score);
                frameIndex += 2;
            } else {
                score += sumOfBallsInFrame(frameIndex);
                System.out.println("just: " + score);
                frameIndex += 2;
            }
        }
        return score;
    }
    public boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }
    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }
    public int spareBonus(int frameIndex) {
        return rolls[frameIndex+2];
    }
    public int strikeBonus(int frameIndex) {
        return rolls[frameIndex+1] + rolls[frameIndex+2];
    }
    public boolean isSpare(int frameIndex) {
        return rolls[frameIndex]+rolls[frameIndex+1] == 10;
    }

}
