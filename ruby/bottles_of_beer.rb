number_of_bottles = 99

while number_of_bottles >= 0
    if number_of_bottles > 1
        print "#{number_of_bottles} bottles of beer on the wall, #{number_of_bottles} bottles of beer. Take one down and pass it around," 
        number_of_bottles -= 1
        print " #{number_of_bottles} bottles of beer on the wall"
        puts ''
    elsif number_of_bottles == 1
        puts "1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall."
        number_of_bottles -= 1
    else number_of_bottles == 0
        puts "No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall"
        number_of_bottles -= 1
    end
end

#  DRY - Don't Repeat Yourself


