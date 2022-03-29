public class Bits{
    public static void main(String args[]) {
//We will be studying 4 type of operations 
//Get bit, Set bit, Clear bit, Update bit. ALl these operations are called as Bit Masking in Java as we manipulate the bits 
//GET Bit
//Q Get the 3rd Bit (Position = 2) of a number n.(n=0101) int this the posititon is considered from behind or right side 
//Here at 0 th Index we have 1 at 1 st index we have 0 and so on 3 rd bit here is positon 2 or index 2 which is 1          
//We use a additional number in this process called as Bit Mask and every operation has different Bit Mask value 
//Now consider the above Question 
/* 1)let us take the bit mask as  1 << i we will be left shifting the value 1 by i index 
so the value of bit mask will be 0100 after 2 left shifting as mentioned in the question
2) Now in this step we will be perfoming and operation between bit mask and the value of n 
0100 AND 0101 and we get 0100 as output so the bit value is 1 because 
If in the output we get any non zero value then the bit value is 1 if it would have been zero then the bit value would be 0
Same question now with posititon = 3 (n=0101) so 0 as it is at index 3
1)Bit mask will be 1(0001) << 3 Here << is left shift operation 
Thus Bit mask will be 1000 
2)We will AND the bit mask with n 
1000 AND 0101 we get output as 0000 so the bit value is o 
*/ 
    int n = 5;  // Her en is in decimal if we convert to binary we get 0101
    int pos = 3; // Try changing position value to get different output
    int bitMask = 1<<pos; // This is used for left shifting 
    if((bitMask & n) == 0 ){  // Here we are using bitwise & and only one & should be used and not logical and where we use &&
        System.out.println("Bit value at that Index is Zero");
    }else{
        System.out.println("Bit value at that Index is One");
    }
//Next operation is Set Bit 
/* Q Set the 2nd Bit (position = 1) of a number n. (n=0101)  BInary number 5 will be coverted to 7
Bit mask = 1<<i 
Operation OR
Here we will make 0001 as 0010 and this will be bit mask
Later we will perform operation Or between 0010 and 0101 to get ouput as 0111
*/
    int k = 5;
    int posi = 1; 
    int BitMask = 1<< posi;
    System.out.println(BitMask | k); 












    }
}