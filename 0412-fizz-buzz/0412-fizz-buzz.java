class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String res = "";

            if (i % 3 == 0) {
                res += "Fizz";
            }
            if (i % 5 == 0) {
                res += "Buzz";
            }

            answer.add(res != "" ? res : String.valueOf(i));
        }
        return answer;
    }
}