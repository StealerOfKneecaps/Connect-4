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




Logic of our code?

In the beginning of the document, we set up all the possible variables we could need - following this, a replay boolean and 3 cases the user could choose from for gamemode options. 
Every option is enclosed within a loop that makes it continue until either side wins or a draw occurs.

The first option, PvP, was the easiest to code - depending on the turn (even or odd) either red or yellow plays, and at the end of each play a win/draw check would occur. At the end of every option is a prompt to replay - saying N will end the program.

The second option, PvAI - easy, the same general structure is used - but it alternates between a player and a bot who selects a random column that's not full. After every choice, another win/draw check would occur.

The final option, PvAI - Hard, it alternates between a player and a bot - this time, checking possible player threats and responding and playing winning moves if possible, using the same logic as win checks. After every choice, a win/draw check would occur.

