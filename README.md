# SourceCode-Testing
 - Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

 - You are given x, y, z representing the respective positions for cats A and B, and for mouse C. Return the appropriate answer, which will be printed on a new line.
    + If cat A catches the mouse first, print "Cat A".
    + If cat B catches the mouse first, print "Cat B".
    + If both cats reach the mouse at the same time, print "Mouse C" as the two cats fight and mouse escapes.

- Function Description
catAndMouse has the following parameter(s):

int x: Cat A's position
int y: Cat B's position
int z: Mouse C's position
- Returns
string: Either 'Cat A', 'Cat B', or 'Mouse C'
- Constraints
1 <= x,y,z <= 100
- Example
  + x = 1, y = 2, z = 3
  ![image](https://user-images.githubusercontent.com/80802239/195395488-88eb1e0a-3c86-4bdf-93c0-b0e3a3cf710c.png)
  + x = 1, y = 3, z = 2
  ![image](https://user-images.githubusercontent.com/80802239/195395643-cc0946b0-dda7-4477-a1b3-c294d0d8be84.png)

