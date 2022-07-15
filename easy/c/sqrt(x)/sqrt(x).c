

int mySqrt(int x){  
    int i; 
    
    if (x == 0) { 
        return 0; 
    } else if (x < 4) { 
        return 1; 
    }
     
    for (i = 0 ; i < x/2 + 1 ; i++) {   
        if (((long) i * i) > x) { 
            return i-1; 
        } else if (((long) i * i) == x) { 
            return i; 
        } 
    } 
    return i-1;

}