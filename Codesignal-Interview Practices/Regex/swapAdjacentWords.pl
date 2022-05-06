# You are given a string consisting of words separated by whitespace characters, where
# the words consist only of Latin letters. Your task is to swap pairs of consecutive words
# and return the result.

# Example:
# For s = "CodeFight On", the output should be
#swapAdjacentWords (s) = "On CodeFight";
# For s = "How are you today guys", the output should be 
# swapAdjacentWords(s) = "are How today you guys".

# Input/Output
# [time limit] 4000ms (perl)
# [input] string s

# A string consisting of whitespace characters ( ' ' ) and Latin letters. There is exactly
# one whitespace character between two consecutive words, and both the first and the
# last characters of s are not equal to '  '.

# Guaranteed constraints
# 0 <= s.length <= 100.

# [Output] string
# String s with pairs of adjacent words swapped.

sub swapAdjacentWords {
	my ($s) = @_;
	
	
	#$s =~ s/(\w+) (\w+)/$2 $1/g; # full_n22
	#$s =~ s/(\w+)\s(\w+)/$2 $1/g;# ejkeep
	$s =~ s/(\p{L}+)\b\s*(\p{L}+)\b/\2 \1/g; #rockstar4400
	
	return $s;
	}

print &swapAdjacentWords("CodeFight On"); # On CodeFight
print "\n";
print &swapAdjacentWords("How are you today guys"); #are How today you guys
print "\n";
print &swapAdjacentWords("IAmALongStringWithNoWhiteSpaceCharacters"); #IAmALongStringWithNoWhiteSpaceCharacters
print "\n";
print &swapAdjacentWords("A b C D e F g h I j"); #b A D C F e h g j I
print "\n";
print &swapAdjacentWords(""); # Empty
print "\n";

	
