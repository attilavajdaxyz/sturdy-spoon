# Write an Angry Boss program. It should rudely ask what you want. Whatever you answer, the Angry Boss should yell it back to you, and then fire you. For example, if you type in I want a raise., it should yell back WHADDAYA MEAN "I WANT A RAISE."?!?  YOU'RE FIRED!!

puts "WHADDAYA WANT?"

want = gets.chomp

puts "WHADDAYA MEAN " + want.upcase + "?!?  YOU\'RE FIRED!!"