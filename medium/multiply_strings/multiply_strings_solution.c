void setArrayElementsToZero(int [] , int);  
int charToNumber(char);  
char numberToChar(int); 


void setArrayElementsToZero(int array[] ,  int length) { 
    for (int i = 0 ; i < length ; i++) { 
        array[i] = 0; 
    } 
}   
 
int charToNumber(char digit) { 
    return (digit - '0'); 
}   
 
char numberToChar(int digit) { 
    return (digit + '0'); 
}
 
char * multiply(char * num1, char * num2){ 
        
    if (strcmp("0",num1) == 0 || strcmp("0",num2) == 0) { 
        return "0"; 
    } else if (strcmp("1",num1) == 0) { 
        return num2;
    } else if (strcmp("1" , num2) == 0) { 
        return num1; 
    }  
     
     
    int lengthNum1 = strlen(num1); 
    int lengthNum2 = strlen(num2);    
    int size = 2 * ((lengthNum1 > lengthNum2) ? lengthNum1 : lengthNum2); 
    char * resultString = malloc(sizeof(char) * (size +1));   
    int resultInteger[size+1]; 
    setArrayElementsToZero(resultInteger , size + 1);
    int total = 0 , carry = 0; 
    
    for (int i = 0 ; i < lengthNum2 ; i++) {  
        for (int j =0 ; j < lengthNum1 ; j++) {  
            total = charToNumber(num2[lengthNum2 - i -1]) * charToNumber(num1[lengthNum1-j -1]) + carry;  
            resultInteger[i+j] += total % 10; 
            carry = total / 10;  
        }  
        resultInteger[lengthNum1+i] += carry;  
        carry = 0; 
    }  
      
    for (int i =0 ; i < size; i++) {  
        resultInteger[i] += carry; 
         
        if (resultInteger[i] > 9) { 
            carry = resultInteger[i] / 10;  
            resultInteger[i] = resultInteger[i] % 10; 
        } else { 
            carry = 0; 
        }
    }  
     
    if (carry != 0) { 
        resultInteger[size] = carry; 
        size++;
    } 
     
    int noTrailing = 0 ,j = 0;
    for (int i = size - 1 ; i >= 0 ; i--) {  
        if (noTrailing == 0 && resultInteger[i] == 0) {    
            continue;
        } else if (noTrailing == 0 && resultInteger[i] != 0) {   
            resultString[j++] = numberToChar(resultInteger[i]);  
            noTrailing = 1; 
        } else if (noTrailing == 1){  
            resultString[j++] = numberToChar(resultInteger[i]);  
        }
    } 
     
    resultString[j] = '\0'; 
     
       
    return resultString;
    
    
     
}