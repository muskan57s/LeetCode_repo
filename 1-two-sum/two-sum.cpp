class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<pair<int, int>> arr; 
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            arr.push_back({nums[i], i});
        }
        
        sort(arr.begin(), arr.end()); // sort by value
        
        int left = 0, right = n - 1;
        
        while (left < right) {
            int sum = arr[left].first + arr[right].first;
            if (sum == target) {
                return {arr[left].second, arr[right].second}; 
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        
        return {-1, -1}; // not found
    }
};
