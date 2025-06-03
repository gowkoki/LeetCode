class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisiableBy3 = i % 3 == 0;
            boolean divisiableBy5 = i % 5 == 0;

            String ans = "";
            if (divisiableBy3) {
                ans += "Fizz";
            }
            if (divisiableBy5) {
                ans += "Buzz";
            }
            if (ans.isEmpty()) {
                ans += String.valueOf(i);
            }

            result.add(ans);
        }

        return result;
    }
}