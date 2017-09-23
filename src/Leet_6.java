/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Leet_6 {
//    public String convert(String s, int numRows) {
//        int len = s.length();
//        int batch = numRows*2-2;
//        int rest = len%batch;
//        int count = (len-rest)*(numRows-1)/batch;
//        if (rest>numRows){
//            count=count+(rest-numRows)+1;
//        }
//        else{
//            count++;
//        }
//        char zigbag [][]=new char [numRows][count];
//        int lun = (len-rest)/batch+1;
//        for(int i=0;i<numRows;i++){
//            for(int j=0;j<count;j++){
//                zigbag[i][j]= '\0';
//            }
//        }
//
//        for(int i =0;i<lun-1 ;i++){
//            for(int j=0;j<numRows;j++){
//                zigbag[j][i*(numRows-1)]=s.charAt(i*batch+j);
//            }
//            for(int j=numRows;j<batch;j++){
//                zigbag[batch-j][(i+1)*(numRows-1)-batch+j]=s.charAt(i*batch+numRows);
//                //zigbag[j][(i+1)*(numRows-1)-j]=s.charAt(i*(numRows*2-2)+numRows+numRows-j-1);
//            }
//        }
//        if(rest>numRows){
//            for(int j=0;j<numRows;j++){
//                zigbag[j][(lun-1)*(numRows-1)]=s.charAt((lun-1)*batch+j);
//            }
//            for(int j=numRows;j<len-(lun-1)*batch;j++){
//                zigbag[batch-j][(lun)*(numRows-1)-batch+j]=s.charAt((lun-1)*batch+numRows);
//            }
//        }
//        else{
//            for(int j=0;j<len-batch*(lun-1);j++){
//                zigbag[j][count-1]=s.charAt((lun-1)*batch+j);
//            }
//        }
//        String ss="";
//        for(int i=0;i<numRows;i++){
//            for(int j=0;j<count;j++){
//                if(zigbag[i][j]!='\0'){
//                    ss+=zigbag[i][j];
//                }
//            }
//        }
//        return ss;
//    }
    public String convert(String s,int numRows){
        if(numRows<=1)
            return s;
        else{
            StringBuilder ss[]= new StringBuilder[numRows];
            for(int i=0;i<ss.length;i++){
                ss[i]=new StringBuilder("");
            }
            int index=0;
            int step=1;
            for(int i=0 ;i<s.length();i++){
                ss[index].append(s.charAt(i));
                if(index==0) step=1;
                if(index==numRows-1) step=-1;
                index+=step;
            }
            String result="";
            for(int i=0;i<ss.length;i++){
                result+=ss[i];
            }
            return  result;
        }
    }
    public static void main(String args[]){
        String s="PAYPALISHIRING";
        System.out.println(new Leet_6().convert(s,3));
    }
}
