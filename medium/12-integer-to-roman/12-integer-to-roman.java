                 sb.append(middle);
                }
                else if(val == 5){
                 sb.append(middle);
                }
                else if(val<=8){
                  sb.append(middle);
                  for(int i =6; i<=val; i++){
                    sb.append(minor);
                  }
                }
                  else if(val == 9){
                    sb.append(minor);
                    sb.append(major);
                  }
                  
            }
}