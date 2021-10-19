numString = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]
lenNumString = [4, 3, 3, 5, 4, 4, 3, 5, 5, 4]

s = "one4seveneight" 
# "one/4/seven/eight"
answerString = ""
print(s)
size = len(s)
for i in range(size):
    
    try:
        print(size)
        int(s[i])
        answerString += s[i]
#     except:
#         if s[i] == "z":
#             i += lenNumString[0] - 1
#             answerString += "0"
#             continue
#         elif s[i] == "o":
#             i += lenNumString[1] - 1
#             answerString += "1"
#             continue
#         elif s[i] == "t":
#             if s[i+1] == "w":
#                 i += lenNumString[2] - 1
#                 answerString += "2"
#                 continue
#             elif s[i+1] == "h":
#                 i += lenNumString[3] - 1
#                 answerString += "3"
#                 continue