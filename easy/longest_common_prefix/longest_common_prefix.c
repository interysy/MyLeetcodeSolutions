char * longestCommonPrefix(char ** strs, int strsSize){ 
    
    char * prefix = *strs;  
    int currentPrefixLength = strlen(prefix); 
     
    for (int i = 1; i < strsSize ; i++) {  
        for (int j = 0 ; j < currentPrefixLength ; j++) {  
            if ( *(*(strs + i) + j) != prefix[j] || *(*(strs + i) + j) == '\0') { 
                prefix[j] = '\0'; 
                currentPrefixLength = j;
            } 
        }
    }
    return prefix; 
}