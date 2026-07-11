class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(i<s.length()-1 && mp.get(cur) < mp.get(s.charAt(i+1))){
                sum-=mp.get(cur);
                System.out.println("neg "+mp.get(cur));
            }
            else{sum+=mp.get(cur);System.out.println("add "+mp.get(cur));}
        }
        return sum;
    }
}