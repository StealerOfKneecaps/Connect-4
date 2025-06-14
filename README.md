# Connect-4
MAIN VARIABLES USED
colOne through colSev - keeps track of all columns, consistently updated throughout project
rowOne through rowSix - keeps track of all rows, occasionally updated
turnCount - keeps track of even/odd turns (determines who plays)
amountInColOne through amountInColSev - keeps track of amount of elements in each column, updated consistently
columnChoice - the column the player places in
counterRed & counterYellow - when checking for win or analysing to block a win, the counters tracks how many of each colour are in a row
entireConnectFour - used later on, contains the entire grid and updated occasionally
yelWin, redWin, draw - keeps track of win condition. Any of them becoming true makes the game finish
