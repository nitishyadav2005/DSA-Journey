class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol=1L*length*width*height;
        String[] st=new String[2];
        if(length>=Math.pow(10,4) || width>=Math.pow(10,4) || height>=Math.pow(10,4) || vol>=Math.pow(10,9)){
            st[0]="Bulky";
         }
        else {
            st[0]=" ";
         }
            if(mass>=100){
                st[1]="Heavy";
            }
            else {
                st[1]=" ";
            }  
            if(st[0]=="Bulky" && st[1]=="Heavy"){
                return "Both";
            } 
            else if(st[0]!="Bulky" && st[1]!="Heavy"){
                return "Neither";
            }  
           else if(st[0]!="Bulky" && st[1]=="Heavy"){
               return "Heavy";
           }   
           else return "Bulky";  
    }
}