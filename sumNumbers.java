public int sumNumbers(String str) {
    int returnedSum = 0;
    String[] sumThisArray = new String[str.length()];
    int sumThisArrayPosition = 0;
    char[] strCharArray = str.toCharArray();
    
    for (int i = 0; i < strCharArray.length; i++) {
      if (Character.isDigit(strCharArray[i])) {
        String newStringFromChar = String.valueOf(strCharArray[i]);
        if (sumThisArray[sumThisArrayPosition] == null) {
          sumThisArray[sumThisArrayPosition] = newStringFromChar;
        } else {
          sumThisArray[sumThisArrayPosition] = sumThisArray[sumThisArrayPosition].concat(newStringFromChar);
        }
        
      } else {
        if (sumThisArray[sumThisArrayPosition] != null) {
          sumThisArrayPosition++;
        }
      }
    }
    //now sum, well, sumThisArray
    for (String num : sumThisArray) {
      if (num != null) returnedSum = returnedSum + Integer.parseInt(num);
    }
    return returnedSum;
  }
  