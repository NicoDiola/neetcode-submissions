class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stk.push(c);
            } else if(map.containsValue(c)){
                if(stk.isEmpty() || map.get(stk.pop()) != c){
                    return false;
                }
            } else {
                return true;
            }
        }

        return stk.isEmpty();
    }
}
