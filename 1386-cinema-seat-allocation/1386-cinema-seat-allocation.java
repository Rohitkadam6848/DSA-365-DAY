class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        // Store reserved seats row-wise
        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(col);
        }

        // Initially, every row can accommodate 2 families
        int ans = 2 * n;

        // Only process rows having reservations
        for (int row : map.keySet()) {

            HashSet<Integer> seats = map.get(row);

            boolean left = true;   // 2,3,4,5
            boolean right = true;  // 6,7,8,9

            // Check left group
            for (int seat = 2; seat <= 5; seat++) {
                if (seats.contains(seat)) {
                    left = false;
                    break;
                }
            }

            // Check right group
            for (int seat = 6; seat <= 9; seat++) {
                if (seats.contains(seat)) {
                    right = false;
                    break;
                }
            }

            // Both sides available
            if (left && right) {
                // Already counted 2, so nothing to change
            }

            // One side available
            else if (left || right) {
                ans--;
            }

            // Neither side available
            else {
                // Maybe middle group 4,5,6,7 is available
                boolean middle = true;

                for (int seat = 4; seat <= 7; seat++) {
                    if (seats.contains(seat)) {
                        middle = false;
                        break;
                    }
                }

                if (middle) {
                    ans--;
                } else {
                    ans -= 2;
                }
            }
        }

        return ans;
    }
}