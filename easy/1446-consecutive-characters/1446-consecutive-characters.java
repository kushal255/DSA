        for(int i =1; i<s.length(); i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr == prev){
                count++;
            }else{
                max = Math.max(max, count);
                count = 1;
            }
         
        }
        max = Math.max(max, count);
           return max;