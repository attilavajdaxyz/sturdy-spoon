what_you_said = ''

while what_you_said != "BYE"
    puts "How are you my dear?"
    what_you_said = gets.chomp
    if what_you_said != what_you_said.upcase
        puts "HUH?!  SPEAK UP, SONNY!"
    else
        puts "NO, NOT SINCE #{rand(1930..1950)}"
    end
end
