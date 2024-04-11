# cmsc355
Authors: Delaney Selb, Cyd Oldham, Jamiel Dannouf, Trevor Eby, Waleed Elbanna
Contains sprints for CMSC355 project. Our project is a simple Veterinary Hospital Database with pet info and search/sort by options for animal records.

Sprint 1:
We focused on implementing the sort by pet name (alphabetically) and search by pet name use cases. We struggled with the initial organization of the code and classes. Once we figured out an optimal setup, we were stuck on getting user input, which we handled with scan.nextLine() manipulation, break statements, and a continuing condition for a while loop. Then, we were held up by uppercase not being shown in records for searchByName(). We worked around this. 

Sprint 2: 
We implemented a quit/exit program use case. We also implemented a filter by animal type use case. This use case prompts the user to enter an animal type to filter by, then displays all animal records corresponding to that animal type. The user is then prompted to enter 1 to search within those records by animal/pet name, to which the specified animal record is displayed. The user can also enter 2 instead to quit/exit the program. We faced some difficulties in getting user input, but that was quickly resolved. We also faced difficulty searching by animal name within the returned animal type filtered list, but this was resolved by creating a second DatabaseSystem object and adding the filtered records to it.
