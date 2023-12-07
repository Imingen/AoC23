
def get_file_data(day):
    path = f"inputs/{day}.txt"
    with open(path)as f:
        lines = f.readlines()
        return lines