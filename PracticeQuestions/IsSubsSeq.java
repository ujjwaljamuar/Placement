public class IsSubsSeq {
    public boolean subSeq(String str , String sub){
        int i = 0;
        int j = 0;
        while (i < str.length() && j < sub.length()){
            if (str.charAt(i) == sub.charAt(i)) {
                j++;
            }
            i++;
        }
        return j == sub.length();
    }
    public static void main(String[] args) {
        IsSubsSeq sq = new IsSubsSeq();
        boolean seq = sq.subSeq("abcde", "abc");
        System.out.println(seq);
    }
}
