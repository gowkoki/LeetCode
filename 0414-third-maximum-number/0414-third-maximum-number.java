class Solution {
    public int thirdMax(int[] nums) {
        List<Integer> numbers = new ArrayList<>();

        for (int n : nums) {
            if (!numbers.contains(n)) {
                numbers.add(n);
            }
        }

        Collections.sort(numbers);

        if (numbers.size() < 3) {
            return numbers.getLast();
        }

        return numbers.get(numbers.size() - 3);
    }
}