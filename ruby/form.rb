=begin
this is a project from codecademy
=end

print "What's your first name?"
first_name = gets.chomp
first_name.capitalize!
puts "Your first name is #{first_name}"

print "What is your last name?"
last_name = gets.chomp
last_name.capitalize!
puts "Your last name is #{last_name}"

print "What is your city?"
city = gets.chomp
city.capitalize!
puts "Your city is #{city}"

print "What is your state?"
state = gets.chomp
state.upcase!
puts "Your state is #{state}"