class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean answer = false;
			for(char alpha = 'a' ; alpha<='z' ; alpha++) {
		        	if(sentence.indexOf(alpha) == -1) {
		        		answer= false;
		        		break;
		        	}else {
		        		answer= true;
		        	}
		        }
		        return answer;
    }
}

/*
we need to check for evvery alphabet in the sentence 
char datatype is used and in for loop we can check for a to z by alphabets++
using if statement we check for occurance
given string sentence:

it meeans sentence.length %26 == 0; then it is a pangram sentence 
the length should be multiple of 26.  (very wrong approach letter can be repeated also in this)

we can use "sentence.indexof(alphabets)" if that alphabets are not present  in that string then it will return -1
if those are present then it will return their index value
note: every letter should appears once. (they can also be appeared twice) indexof will provide the value of first occuring. 

a to z should always be included in the string (we will use for loop )



APPROACH:
we will check the index value of alphabets if they are not present it will return -1 ; and checking in loop for character of a to z using char++

can be done by:
if(sentence.indexOf(alpha) == -1) {
	answer= false;
	break;
}else {
	answer= true;
}

*/


//Runtime beats 100%
// memory beats 97%

