import task_reader
import numpy as np

input = task_reader.get_file_data("4")
i = 0
score = 0
for line in input:
    cards = line.split("|")
    main_cards = cards[1].split()
    winning_cards = cards[0].split(":")[1].split()

    xc = [x for x in main_cards if x in winning_cards]
    v = 0
    for e in xc:
        if v == 0:
            v += 1
        else:
            v *= 2
    print(xc)
    print(v)
    score += v

      

print(score)