// Reverse Tower of Hanoi
public class ReverseTOH {
    public static class Main {
        public static void main(String[] args) {
            int size = 3;
            ReverseTOH.setTowerSize(size);
            ReverseTOH.reverseToH(size, 1, 3);

        }
    }
    private static int originalTowerSize;
    private static int moveCount = 0;

    public static void setTowerSize(int towerSize) {
        originalTowerSize = towerSize;
    }

    public static void reverseToH(int towerSize, int source, int destination) {
        if (towerSize == 0) {
            return;
        }
        int tempPeg = 6 - source - destination;
        reverseToH(towerSize -1, source, tempPeg);
        moveCount++;
        System.out.println("Move Disk " + (originalTowerSize - towerSize + 1) + " from Peg " + source + " to Peg " + destination); // Step 2: Move largest disk

        reverseToH(towerSize - 1, tempPeg, destination);
    }


}

