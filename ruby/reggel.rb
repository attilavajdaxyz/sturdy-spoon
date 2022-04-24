# learning to program with this cool machine

# write a program which asks for your first, middle, and last names individually, and then adds those lengths together

puts "What is your first name?"
first_name = gets.chomp
puts "What is your middle name?"
middle_name = gets.chomp
puts "What is your last name?"
last_name = gets.chomp

full_name_length = first_name.length + middle_name.length + last_name.length

puts "Your name is " + full_name_length.to_s + " characters long."