// // class Solution {
// //     public String addBinary(String a, String b) {
// //        int al = a.length();
// //        int bl = b.length();
// //     //    ----------------------------------------------------------------------------------
// //        String OS = a;
// //             String RS = "";
// //             for (int i = OS.length() - 1; i >= 0; i--) {
// //                 RS = RS + OS.charAt(i);
// //             }
// //        int rs = RS.length();
// //        int z = 0;
// //        for(int i=0;i<rs;i++){
// //          z =z + (Integer.parseInt(String.valueOf(RS.charAt(i)))*((int)Math.pow(2, i)));
// //        }
// //        // NOW I GOT DECIMAL = Z   
// //        //    ----------------------------------------------------------------------------------
// //        String OB = b;
// //             String RB = "";
// //             for (int i = OB.length() - 1; i >= 0; i--) {
// //                 RB = RB + OB.charAt(i);
// //             }
// //        int rb = RB.length();
// //        int x = 0;
// //        for(int i=0;i<rb;i++){
// //          x =x + (Integer.parseInt(String.valueOf(RB.charAt(i)))*((int)Math.pow(2, i)));
// //        }
// //        // NOW I GOT DECIMAL = X
// //        //    ----------------------------------------------------------------------------------

// //        int add = z+x;
       
// //        // NOW I GOT DECIMAL SUM = add
// //        //    ----------------------------------------------------------------------------------
       
// //         System.out.print(Integer.toBinaryString(z)+""+Integer.toBinaryString(x));
// //        return Integer.toBinaryString(add);
// //     }
// // }
// // ___________________________________________________________________________________________________
// // I used long and int even now i got this overflow error , so next is by using biginteger and multiply by 2
// // ________________________________________________________________________________________________________
// class Solution {
//     public String addBinary(String a, String b) {
//        int al = a.length();
//        int bl = b.length();
//     //    ----------------------------------------------------------------------------------
//        String OS = a;
//             String RS = "";
//             for (int i = OS.length() - 1; i >= 0; i--) {
//                 RS = RS + OS.charAt(i);
//             }
//        int rs = RS.length();
//        long z = 0;
//        for(int i=0;i<rs;i++){
//          z = z + (Long.parseLong(String.valueOf(RS.charAt(i)))*((long)Math.pow(2, i)));
//        }
//        // NOW I GOT DECIMAL = Z   
//        //    ----------------------------------------------------------------------------------
//        String OB = b;
//             String RB = "";
//             for (int i = OB.length() - 1; i >= 0; i--) {
//                 RB = RB + OB.charAt(i);
//             }
//        int rb = RB.length();
//        long x = 0;
//        for(int i=0;i<rb;i++){
//          x = x + (Long.parseLong(String.valueOf(RB.charAt(i)))*((long)Math.pow(2, i)));
//        }
//        // NOW I GOT DECIMAL = X
//        //    ----------------------------------------------------------------------------------

//        long add = z + x;
       
//        // NOW I GOT DECIMAL SUM = add
//        //    ----------------------------------------------------------------------------------
       
//         System.out.print(Long.toBinaryString(z)+"  "+Long.toBinaryString(x));
//        return Long.toBinaryString(add);
//     }
// }

import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger z = new BigInteger("0");
        BigInteger x = new BigInteger("0");
        BigInteger two = new BigInteger("2");

        for (int i = 0; i < a.length(); i++) {
            z = z.multiply(two).add(new BigInteger(String.valueOf(a.charAt(i))));
        }

        for (int i = 0; i < b.length(); i++) {
            x = x.multiply(two).add(new BigInteger(String.valueOf(b.charAt(i))));
        }

        BigInteger sum = z.add(x);
        return sum.toString(2);
    }
}
