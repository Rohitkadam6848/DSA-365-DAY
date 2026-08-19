class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            map.putIfAbsent(row, new HashSet<>());
            map.get(row).add(col);
        }

        int ans = 2 * n;

        for (int row : map.keySet()) {
            HashSet<Integer> seats = map.get(row);

            boolean left = true;
            boolean right = true;

            for (int seat = 2; seat <= 5; seat++) {
                if (seats.contains(seat)) {
                    left = false;
                    break;
                }
            }

            for (int seat = 6; seat <= 9; seat++) {
                if (seats.contains(seat)) {
                    right = false;
                    break;
                }
            }

            if (left && right) {
                continue;
            } else if (left || right) {
                ans--;
            } else {
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