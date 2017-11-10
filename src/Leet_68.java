import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by tracysaber on 2017-11-10.
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.

 You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.

 Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

 For the last line of text, it should be left justified and no extra space is inserted between words.

 For example,
 words: ["This", "is", "an", "example", "of", "text", "justification."]
 L: 16.

 Return the formatted lines as:
 [
 "This    is    an",
 "example  of text",
 "justification.  "
 ]
 Note: Each word is guaranteed not to exceed L in length.
 */
public class Leet_68 {
//    public List<String> fullJustify(String[] words, int maxWidth) {
//
//        int count=0;
//        List<String> a = new ArrayList<String>();
//        List<String> result = new LinkedList<String>();
//        if(maxWidth==1){
//            for(int i=0;i<words.length;i++){
//                result.add(words[i]);
//            }
//            return  result;
//        }
//        for(int i=0;i<words.length;i++){
//            if(count+words[i].length()<maxWidth){
//                count+=(1+words[i].length());
//                a.add(words[i]);
//            }
//            else {
//                if(count+words[i].length()==maxWidth){
//                    count+=words[i].length();
//                    a.add(words[i]);
//                }
//                else{
//                    int add = (maxWidth-count+1)/(a.size()-1);
//                    int first = (maxWidth -count+1)%(a.size()-1);
//                    int num = a.size();
//                    StringBuilder s = new StringBuilder();
//                    s.append(a.get(0));
//                    s.append(createSpace(1+add+first ));
//                    for(int j=1;j<num-1;j++){
//                        s.append(a.get(j));
//                        s.append(createSpace(1+add ));
//                    }
//                    s.append(a.get(num - 1));
//                    result.add(s.toString());
//                    a.clear();
//                    count=0;
//                    i--;
//                }
//            }
//        }
//        if(!a.isEmpty()){
//            StringBuilder s = new StringBuilder();
//            if(a.size()==1){
//                s.append(a.get(0));
//                s.append(createSpace(maxWidth-a.get(0).length()));
//            }
//            else{
//                int add = (maxWidth-count+1)/(a.size()-1);
//                int first = (maxWidth -count+1)%(a.size()-1);
//                int num = a.size();
//                s.append(a.get(0));
//                s.append(createSpace(1+add+first ));
//                for(int j=1;j<num-1;j++){
//                    s.append(a.get(j));
//                    s.append(createSpace(1+add ));
//                }
//                s.append(a.get(num - 1));
//            }
//            result.add(s.toString());
//        }
//        return result;
//    }
//    public String createSpace(int num){
//        StringBuilder s =new StringBuilder();
//        for(int i=0;i<num;i++){
//            s.append(" ");
//        }
//        return  s.toString();
//    }
public List<String> fullJustify(String[] words, int L) {
    List<String> lines = new ArrayList<String>();

    int index = 0;
    while (index < words.length) {
        int count = words[index].length();
        int last = index + 1;
        while (last < words.length) {
            if (words[last].length() + count + 1 > L) break;
            count += words[last].length() + 1;
            last++;
        }

        StringBuilder builder = new StringBuilder();
        int diff = last - index - 1;
        // if last line or number of words in the line is 1, left-justified
        if (last == words.length || diff == 0) {
            for (int i = index; i < last; i++) {
                builder.append(words[i] + " ");
            }
            builder.deleteCharAt(builder.length() - 1);
            for (int i = builder.length(); i < L; i++) {
                builder.append(" ");
            }
        } else {
            // middle justified
            int spaces = (L - count) / diff;
            int r = (L - count) % diff;
            for (int i = index; i < last; i++) {
                builder.append(words[i]);
                if (i < last - 1) {
                    for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
                        builder.append(" ");
                    }
                }
            }
        }
        lines.add(builder.toString());
        index = last;
    }


    return lines;
}
    public static void main(String args[]){
        String []words ={"a","b","c","d","e"};
        List<String> a = new Leet_68().fullJustify(words,1);
    }
}
