command = 'Please type "bye" into the terminal.'
puts command

while command != 'bye'
    command = gets.chomp
    if command != 'bye'
        puts 'I\'m afraid command is not equal "bye", please type "bye" into the terminal.'
    end
end

puts 'Come again soon!'