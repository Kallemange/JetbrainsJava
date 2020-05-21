/* Please, do not rename it */
class Problem {
    public static void main(String args[]) {
        String operator = args[0];
        int[] values = new int[args.length-1];
        for (int i=1; i<args.length;i++){
            values[i-1] = Integer.parseInt(args[i]);
        }
        if (operator.equals("MAX")){
            System.out.println(findMax(values));
        } else if (operator.equals("MIN")) {
            System.out.println(findMin(values));
        }
        else {
            int sumArr = 0;
            for (int m: values){
                sumArr += m;
            }
            System.out.println(sumArr);
        }

    }
    public static int findMax(int[] values){
        int maxVal = Integer.MIN_VALUE;
        for (int m : values){
            maxVal = m>maxVal ? m:maxVal;
        }
        return maxVal;
    }

    public static int findMin(int[] values){
        int minVal = Integer.MAX_VALUE;
        for (int m : values){
            minVal = m<minVal ? m:minVal;
        }
        return minVal;
    }
}