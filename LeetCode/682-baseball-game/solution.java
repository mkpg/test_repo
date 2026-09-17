class Solution {
    public int calPoints(String[] operations) {
        List<Integer> arr = new ArrayList<>();
        for(String x: operations){
            if(x.equals("C")){
                int last = arr.size()-1;
                arr.remove(last);
            }
            if(x.equals("D")){
                int last = arr.size()-1;
                
                int adding = arr.get(last) * 2;
                arr.add(adding);
            }

            if(x.equals("+")){
                int last = arr.size()-1;
                int lastpre = arr.size()-2;
                int adding = arr.get(last) + arr.get(lastpre);
                arr.add(adding);
            }

            if(!(x.equals("C")) && !(x.equals("D")) && !(x.equals("+"))){
                
                int ele = Integer.parseInt(x);
                arr.add(ele);
            }
        }

        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
    }
}
