=pod
Correct variable names consist only of Latin letters, 
digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.

Example

For name = "var_1__Int", the output should be
variableName(name) = true;

For name = "qq-q", the output should be
variableName(name) = false;

For name = "2w2", the output should be
variableName(name) = false.

Input/Output

[time limit] 4000ms (perl)
[input] string name

Guaranteed constraints:
1 <= name.length <= 10.

[output] boolean

true if name is a correct variable name, false otherwise.

[Perl] Syntax Tips

# Prints help message to the console
# Returns a string
sub helloWorld {
	my ($name) = @_;
    print("This prints to the console when you Run Tests");
    return "Hello, " . $name;
}
=cut

sub variableName {
    my ($name) = @_;
            my $re = '^[A-Za-z]$|^[A-Za-z_][^-|\[|\]\s]+[A-Za-z0-9_]$';
        if($name =~ m/$re/){
        return true;	}
    else{
    return false;
}
}

print &variableName("var_1__Int"); # true
print ("\n");
print &variableName("qq-q"); # false
print ("\n");
print &variableName("2w2"); #false
print ("\n");
print &variableName(" variable"); #false
print ("\n");
print &variableName("va[riable0"); #false
print ("\n");
print &variableName("variable0"); #true
print ("\n");
print &variableName("a"); #true
print ("\n");
print &variableName("va]riable0"); #false
print ("\n");
print &variableName("_Aas_23"); #true
print ("\n");
print &variableName("a a_2"); #false
print ("\n");
print &variableName("0ss"); #false
print ("\n");
print &variableName("&ss"); #false
print ("\n");
print &variableName("s0s"); #true
print ("\n");
