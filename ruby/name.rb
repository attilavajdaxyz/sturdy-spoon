# Write a program which asks for a person's first name, then middle, then last. Finally, it should greet the person using their full name. 

puts "What is your first name?"

first_name = gets.chomp

puts "Your first name is " + first_name + ". What is your middle name?"

middle_name = gets.chomp

puts "Your middle name is " + middle_name + ". What is your last name?"

last_name = gets.chomp

puts "Hello there " + first_name + " " + middle_name + " " + last_name + ". Nice to meet you!"

# Write a program which asks for a person's favorite number. Have your program add one to the number, then suggest the result as a bigger and better favorite number. (Do be tactful about it, though.)

puts "What is your favorite number?"

favorite_number = gets.chomp

puts "What about " + favorite_number.to_i + 1 + "? Don't you think that " + favorite_number.to_i + 1 + " is a better favorite number?"