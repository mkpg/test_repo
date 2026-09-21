// class Solution {
//     public String toLowerCase(String s) {
//         if(s=="" || s == " ")return s;
//         char[] z = s.toCharArray();
        
//         char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
//         char[] A = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

//         for(int i = 0; i<z.length ;i++){
//             for(int j = 0;j<26;j++){
//                 if(z[i] == A[j]){
//                     z[i] = a[j];
//                 }
//             }
//         }
//           String g = new String(z);
//           return g;
//     }
// }
// TRIED THE ABOVE AND GOT 2 MS SO HERE 

class Solution {
    public String toLowerCase(String s) {
    return s.toLowerCase();       
    }
}