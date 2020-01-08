
public class withoutString {
    
    public String withoutStringMain(String base, String remove) {
    ArrayList<Character> RS = new ArrayList<Character>();
    char[] baseCA = base.toCharArray();
    char[] removeCA = remove.toCharArray();
    
    int i = 0;
    while (i < base.length()) {
      if  (Character.toUpperCase(baseCA[i]) == Character.toUpperCase(removeCA[0]) && (i + remove.length() - 1< base.length())) {
        if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
          i = i + remove.length();
        } else {
          RS.add(baseCA[i]);
          i++;
        }
      } else {
        RS.add(baseCA[i]);
        i++;
      }
    }
    String returnedString = getStringRepresentation(RS);
    return returnedString;
  }
  
  String getStringRepresentation(ArrayList<Character> list)
  {    
      StringBuilder builder = new StringBuilder(list.size());
      for(Character ch: list)
      {
          builder.append(ch);
      }
      return builder.toString();
  }
}
/*
withoutString("Hello there", "llo") → "He there"	"He there"	OK	
withoutString("Hello there", "e") → "Hllo thr"	"Hllo thr"	OK	
withoutString("Hello there", "x") → "Hello there"	"Hello there"	OK	
withoutString("This is a FISH", "IS") → "Th a FH"	"Th a FH"	OK	
withoutString("THIS is a FISH", "is") → "TH a FH"	"TH a FH"	OK	
withoutString("THIS is a FISH", "iS") → "TH a FH"	"TH a FH"	OK	
withoutString("abxxxxab", "xx") → "abab"	"abab"	OK	
withoutString("abxxxab", "xx") → "abxab"	"abxab"	OK	
withoutString("abxxxab", "x") → "abab"	"abab"	OK	
withoutString("xxx", "x") → ""	""	OK	
withoutString("xxx", "xx") → "x"	"x"	OK	
withoutString("xyzzy", "Y") → "xzz"	"xzz"	OK	
withoutString("", "x") → ""	""	OK	
withoutString("abcabc", "b") → "acac"	"acac"	OK	
withoutString("AA22bb", "2") → "AAbb"	"AAbb"	OK	
withoutString("1111", "1") → ""	""	OK	
withoutString("1111", "11") → ""	""	OK	
withoutString("MkjtMkx", "Mk") → "jtx"	"jtx"	OK	
withoutString("Hi HoHo", "Ho") → "Hi "	"Hi "	OK	
other tests
OK*/