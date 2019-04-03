"""
Standard deviation calculator
Author: Isaac Campbell
"""
import math
def welcome():
  print("Type  sample      for population standard deviation.")
  print("Type  population  for sample     standard deviation.")
  atype = input("What would you like to do: ")
  acceptable = ['sample','population']
  while atype not in acceptable:
    atype = input('Not an acceptable value, please type in "sample" or "population": ' )
  return atype


def getNumbers():
  numList = []
  print("Enter the numbers in your data, type in 'e' to end")
  data = input("Enter a number: ")
  while data != 'e':
    try:
      int(data)
      numList.append(int(data))
      data = input("Enter a number or 'e' to end: ")
    except ValueError:
      print('Not a number')
      data = input("Enter a number or 'e' to end: ")
  return numList
  

def solve(nlist,atype):
  total = 0
  #practice with enumerating
  for counter, num in enumerate(nlist):
    total+=num
  mean = total/(counter+1)
  mean = round(mean,4)

  #sum of x - x^-

  squared = []
  deviation = 0
  for i in nlist:
    sqi = (i-mean)**2
    squared.append(sqi)


  squaredsum = sum(squared)
  print("The sum of differences is "+ str(squaredsum))

  if atype == 'sample':
    variance = squaredsum/counter
  else:
    variance = squaredsum/(counter +1)

  print("The variance is :" + str(variance))
  deviation = math.sqrt(variance)

  if atype == 'population':
    tmp = "The population standard deviation is : " 
  else:
    tmp = "The sample standard deviation is : "
  result = tmp + str(deviation)
  return result
    
def main():
  atype = welcome()
  numList = []
  numList = getNumbers()
  answer = solve(numList,atype)
  print(answer)


main()
