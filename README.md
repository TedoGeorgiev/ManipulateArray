# ManipulateArray
# Array can be modified and display info, by using commands
# Commands are:
#	exchange {index} – splits the array after the given index and exchanges the places of the two resulting subarrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
#	If the index is outside the boundaries of the array, print "Invalid index".
#	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
#	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
#	If there are two or more equal min/max elements, return the index of the rightmost one.
#	If a min/max even/odd element cannot be found, print "No matches".
#	first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
#	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
#	If the count is greater than the array length, print "Invalid count".
#	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
#	end – stop taking input and print the final state of the array.
