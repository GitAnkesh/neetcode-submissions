// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ans = new ArrayList<List<String>>();
//         Map<String,List<Integer>>map = new HashMap<>();
//         for(String str:strs){
//             char[] chars = str.toCharArray();
//             String key = new String(chars);

//            if(!map.containsKey(key)){
//             map.put(key,new ArrayList<String>() );
//            }
//            map.get(key).add(str);

//         }
//         for(Map.Entry<String,List<String>>e:map.entrySet()){
//             ans.add(e.getValue());
//         }
//         return ans;
//     }
// }

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            ans.add(e.getValue());
        }

        return ans;
    }
}
