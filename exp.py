def fancy_number(input_number):
    input_number=str(input_number)
    if input_number==input_number[::-1]:
        return 0
    elif True:
        n=int(input_number[0])-int(input_number[1])
        for i in range(1,len(input_number)-1):
          if n!=int(input_number[i])-int(input_number[i+1]):
            break
        else:
          return 0
    else:
        return 1

input_number = int(input()) 

print(fancy_number(input_number)) 