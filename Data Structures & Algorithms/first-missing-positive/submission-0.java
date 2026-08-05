class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int candidate = 1;

        while (set.contains(candidate)) {
            candidate++;
        }

        return candidate;
    }
}