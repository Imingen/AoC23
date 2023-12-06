import re


#### Part 1 done in online IDE 

### Part 2:
time_raw = "Time:        46     80     78     66"
distance_raw = "Distance:   214   1177   1402   1024"

time = int("".join(re.findall(r'\d+', time_raw)))
distance = int("".join(re.findall(r'\d+', distance_raw)))

i = 0
number_of_ways = 0

while i <= time:
    distance_in_race =(time - i)  * i
    if distance_in_race >= distance:
        number_of_ways += 1
    i += 1

print(f"Number of ways to beat the race: {number_of_ways}")