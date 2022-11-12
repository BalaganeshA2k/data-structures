package org.soln.leet_code_solutions.easy;

public class StringToInteger_atoi {
	//Better to read solution⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️⬇️🔽🔽⏬
	public int solution1(String s) {
		 var result = s.trim();
			if(result.equals("")) return 0;
			result = removeUnWantedWords(result);
			if(result==("")) return 0;
			int res =0;
			try{
				res =Integer.parseInt(result);
				}
			catch (Exception e){
				if(s.contains("-"))
					return Integer.MIN_VALUE;
				return Integer.MAX_VALUE;
			}
			
			return res;
			
		}

		public String removeUnWantedWords(String s) {
			StringBuilder stringWithoutWord = new StringBuilder();
			for(int i=0;i<s.length();i++) {
				char currentChar = s.charAt(i);
				int currentCodePoint =s.codePointAt(i);
				if(i==0&&(currentChar=='-'||currentChar=='+')){
					if(currentChar=='-')
						stringWithoutWord.append(currentChar);
					continue;
				}
				if(characterIsNotDigit(currentCodePoint))break;
				stringWithoutWord.append(currentChar);
			}

			String result =stringWithoutWord.toString();
			return (result.equals("-"))?"":result;
		}
		

		private boolean characterIsNotDigit(int codePoint) {
			return !Character.isDigit(codePoint);
		}
	
}
