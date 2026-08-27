class Solution {
    public String reverseByType(String s) {
        char [] ch = s.toCharArray();
        int i=0, j=ch.length-1;
        while(i<j){
            if (Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char a = ch[i];
                ch[i] = ch[j];
                ch[j] = a;
                i++;
                j--;
            }
            else if(!Character.isLetter(ch[i])){
                i++;
            }
            else
            j--;
        }
        i=0; j=ch.length-1;
        while(i<j){
            if (!Character.isLetter(ch[i]) && !Character.isLetter(ch[j])){
                char a = ch[i];
                ch[i] = ch[j];
                ch[j] = a;
                i++;
                j--;
            }
            else if(Character.isLetter(ch[i])){
                i++;
            }
            else
            j--;
        }
        return new String(ch);
    }
}