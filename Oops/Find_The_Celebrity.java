// 277. Find the Celebrity
// Suppose you are at a party with n people (labeled from 0 to n - 1)
//  and among them, there may exist one  celebrity. The definition of a 
// celebrity is that all the other n - 1 people know him/her but he/she does 
// not know any of them.
// Now you want to find out who the celebrity is or verify that there is not 
// one. The only thing you are allowed to do is to ask questions like: "Hi, A. 
// Do you know B?" to get information of whether A knows B. You need to 
// find out the celebrity (or verify there is not one) by asking as few 
// questions as possible (in the asymptotic sense).
// You are given a helper function bool knows(a, b) which tells you whether 
// A knows B. Implement a function int findCelebrity(n). There will be 
// exactly one celebrity if he/she is in the party. Return the celebrity's label if 
// there is a celebrity in the party. If there is no celebrity, return -1.

package StackOop;

import java.util.Stack;

public class Find_The_Celebrity {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1},{1,0,1,1},{0,0,0,0},{1,1,1,0}};
        System.out.println(Celebrity(arr));
    }
    private static int Celebrity(int[][] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if(arr[a][b] == 1){
                st.push(b);
            }else{
                st.push(a);
            }
        }
        int candidate = st.pop();
        for(int i=0; i<arr.length; i++){
            if(i==candidate){
                continue;
            }
            if(arr[candidate][i] == 1 || arr[i][candidate] == 0){
                return -1;
            }
        }
        // for(int i=0; i<arr.length; i++){
        //     if(i==candidate){
        //         continue;
        //     }
        //     if(arr[i][candidate] == 0){
        //         return -1;
        //     }
        // }
        return candidate;
    }
}
