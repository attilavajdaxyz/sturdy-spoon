#Table of Contents                
                                                 
# Chapter 1:  Numbers                        page 1
# Chapter 2:  Letters                       page 72
# Chapter 3:  Variables                    page 118


# lineWidth = 50
# puts "Table of Contents".center
# puts "Chapter 1:  Numbers".ljust(lineWidth/2) + "page1".rjust(lineWidth/2)
# puts "Chapter 2:  Letters".ljust(lineWidth/2) + "page72".rjust(lineWidth/2)
# puts "Chapter 3:  Variables".ljust(lineWidth/2) + "page118".rjust(lineWidth/2)

table_of_contents = ["Table of Contents", "Chapter 1:  Numbers", "Chapter 2:  Letters", "Chapter 3:  Variables"]
lineWidth = 50
puts table_of_contents[0].center lineWidth
puts table_of_contents[1].ljust(lineWidth/2) + "page1".rjust(lineWidth/2)
puts table_of_contents[2].ljust(lineWidth/2) + "page72".rjust(lineWidth/2)
puts table_of_contents[3].ljust(lineWidth/2) + "page118".rjust(lineWidth/2)
