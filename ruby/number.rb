# Write a program which asks for a person's favorite number. Have your program add one to the number, then suggest the result as a bigger and better favorite number. (Do be tactful about it, though.)

puts "What is your favorite number?"

favorite_number = gets.chomp

puts favorite_number.to_i + 1


puts "What about " + (favorite_number + 1).to_s + "? Don't you think that " + (favorite_number.to_i + 1).to_s + " is a better favorite number?"