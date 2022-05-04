# Write a program which asks for a person's first name, then middle, then last. Finally, it should greet the person using their full name. 

puts "What is your first name?"

first_name = gets.chomp

puts "Your first name is " + first_name + ". What is your middle name?"

middle_name = gets.chomp

puts "Your middle name is " + middle_name + ". What is your last name?"

last_name = gets.chomp

puts "Hello there " + first_name + " " + middle_name + " " + last_name + ". Nice to meet you!"

