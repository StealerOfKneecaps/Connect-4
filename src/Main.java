//NAME: Lucas Zhao and Sepehr Saleknia
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colOne = new ArrayList<>();
        ArrayList<String> colTwo = new ArrayList<>();
        ArrayList<String> colThree = new ArrayList<>();
        ArrayList<String> colFour = new ArrayList<>();
        ArrayList<String> colFive = new ArrayList<>();
        ArrayList<String> colSix = new ArrayList<>();
        ArrayList<String> colSev = new ArrayList<>();
        ArrayList<String> rowOne = new ArrayList<>();
        ArrayList<String> rowTwo = new ArrayList<>();
        ArrayList<String> rowThree = new ArrayList<>();
        ArrayList<String> rowFour = new ArrayList<>();
        ArrayList<String> rowFive = new ArrayList<>();
        ArrayList<String> rowSix = new ArrayList<>(); //Initialising all the lists

        for (int i = 0; i < 6; i++) { //setting up the columns as empty
            colOne.add("(x)");
            colTwo.add("(x)");
            colThree.add("(x)");
            colFour.add("(x)");
            colFive.add("(x)");
            colSix.add("(x)");
            colSev.add("(x)");
        }

        System.out.println("|1||2||3||4||5||6||7|"); //prints empty columns
        for (int i = 0; i < 6; i++) {
            System.out.print(colOne.get(i));
            System.out.print(colTwo.get(i));
            System.out.print(colThree.get(i));
            System.out.print(colFour.get(i));
            System.out.print(colFive.get(i));
            System.out.print(colSix.get(i));
            System.out.print(colSev.get(i));
            System.out.println();
        }
        //sets all the variables that I'm using
        int turnCount = 0;
        int amountInColOne = 0;
        int amountInColTwo = 0;
        int amountInColThree = 0;
        int amountInColFour = 0;
        int amountInColFive = 0;
        int amountInColSix = 0;
        int amountInColSev = 0;
        boolean redWin = false;
        boolean yelWin = false;
        boolean draw = false;
        boolean playerReplay = true;
        while (playerReplay) {
            System.out.println("MENU\n1 - PVP Mode\n2 - PV Bot (easy) Mode\n3 - PV Bot (hard) Mode");
            int menuChoice = sc.nextInt();
            colOne.clear(); //resetting the columns just in case
            colTwo.clear();
            colThree.clear();
            colFour.clear();
            colFive.clear();
            colSix.clear();
            colSev.clear();
            for (int i = 0; i < 6; i++) {
                colOne.add("(x)");
                colTwo.add("(x)");
                colThree.add("(x)");
                colFour.add("(x)");
                colFive.add("(x)");
                colSix.add("(x)");
                colSev.add("(x)");
            }
            
            int botColCounter;
            //Comments are mainly in cases 2 and 3, as case 1 sets up the "structure" of the next two cases
            switch (menuChoice) {
                case 1:
                    while (!redWin && !yelWin && !draw) {
                        rowOne.clear();
                        rowTwo.clear();
                        rowThree.clear();
                        rowFour.clear();
                        rowFive.clear();
                        rowSix.clear();
                        int counterRed = 0;
                        int counterYell = 0;
                        System.out.println("What column, player" + ((turnCount % 2) + 1) + "? (1-7)");
                        int columnChoice = sc.nextInt();
                        switch (columnChoice) {
                            case 1:
                                if (amountInColOne == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colOne.set(colOne.size() - 1 - amountInColOne, "(R)");
                                        amountInColOne++;
                                    } else {
                                        colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                        amountInColOne++;
                                    }
                                }
                                break;

                            case 2:
                                if (amountInColTwo == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colTwo.set(colTwo.size() - 1 - amountInColTwo, "(R)");
                                        amountInColTwo++;
                                    } else {
                                        colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                        amountInColTwo++;
                                    }
                                }
                                break;

                            case 3:
                                if (amountInColThree == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colThree.set(colThree.size() - 1 - amountInColThree, "(R)");
                                        amountInColThree++;
                                    } else {
                                        colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                        amountInColThree++;
                                    }
                                }
                                break;

                            case 4:
                                if (amountInColFour == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colFour.set(colFour.size() - 1 - amountInColFour, "(R)");
                                        amountInColFour++;
                                    } else {
                                        colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                        amountInColFour++;
                                    }
                                }
                                break;

                            case 5:
                                if (amountInColFive == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colFive.set(colFive.size() - 1 - amountInColFive, "(R)");
                                        amountInColFive++;
                                    } else {
                                        colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                        amountInColFive++;
                                    }
                                }
                                break;

                            case 6:
                                if (amountInColSix == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colSix.set(colSix.size() - 1 - amountInColSix, "(R)");
                                        amountInColSix++;
                                    } else {
                                        colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                        amountInColSix++;
                                    }
                                }
                                break;

                            case 7:
                                if (amountInColOne == 6) {
                                    System.out.println("That column's full dummy");
                                    turnCount--;
                                } else {
                                    if ((turnCount % 2) + 1 == 1) {
                                        colSev.set(colSev.size() - 1 - amountInColSev, "(R)");
                                        amountInColSev++;
                                    } else {
                                        colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                        amountInColSev++;
                                    }
                                }
                                break;

                            default:
                                System.out.println("Unfortunately, you have not entered a valid number. Please re-enter");
                                turnCount--;
                                break;
                        }

                        rowOne.add(colOne.getFirst());
                        rowOne.add(colTwo.getFirst());
                        rowOne.add(colThree.getFirst());
                        rowOne.add(colFour.getFirst());
                        rowOne.add(colFive.getFirst());
                        rowOne.add(colSix.getFirst());
                        rowOne.add(colSev.getFirst());

                        rowTwo.add(colOne.get(1));
                        rowTwo.add(colTwo.get(1));
                        rowTwo.add(colThree.get(1));
                        rowTwo.add(colFour.get(1));
                        rowTwo.add(colFive.get(1));
                        rowTwo.add(colSix.get(1));
                        rowTwo.add(colSev.get(1));

                        rowThree.add(colOne.get(2));
                        rowThree.add(colTwo.get(2));
                        rowThree.add(colThree.get(2));
                        rowThree.add(colFour.get(2));
                        rowThree.add(colFive.get(2));
                        rowThree.add(colSix.get(2));
                        rowThree.add(colSev.get(2));

                        rowFour.add(colOne.get(3));
                        rowFour.add(colTwo.get(3));
                        rowFour.add(colThree.get(3));
                        rowFour.add(colFour.get(3));
                        rowFour.add(colFive.get(3));
                        rowFour.add(colSix.get(3));
                        rowFour.add(colSev.get(3));

                        rowFive.add(colOne.get(4));
                        rowFive.add(colTwo.get(4));
                        rowFive.add(colThree.get(4));
                        rowFive.add(colFour.get(4));
                        rowFive.add(colFive.get(4));
                        rowFive.add(colSix.get(4));
                        rowFive.add(colSev.get(4));

                        rowSix.add(colOne.get(5));
                        rowSix.add(colTwo.get(5));
                        rowSix.add(colThree.get(5));
                        rowSix.add(colFour.get(5));
                        rowSix.add(colFive.get(5));
                        rowSix.add(colSix.get(5));
                        rowSix.add(colSev.get(5));

                        if (amountInColOne == 6 && amountInColThree == 6 && amountInColFour == 6 && amountInColFive == 6 && amountInColSix == 6 && amountInColSev == 6 && amountInColTwo == 6) {
                            draw = true;
                        }
                        for (String colOneChar : colOne) {
                            if (colOneChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colOneChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colTwoChar : colTwo) {
                            if (colTwoChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colTwoChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colThrChar : colThree) {
                            if (colThrChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colThrChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colFouChar : colFour) {
                            if (colFouChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colFouChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colFivChar : colFive) {
                            if (colFivChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colFivChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colSixChar : colSix) {
                            if (colSixChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colSixChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colSevChar : colSev) {
                            if (colSevChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colSevChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowOneChar : rowOne) { //This is the win conditions for horizontal.
                            if (rowOneChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowOneChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowOneChar.equals("(x)")) { //resets here because an x in between y and r isn't problem in vertical
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowTwoChar : rowTwo) {
                            if (rowTwoChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowTwoChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowTwoChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowThrChar : rowThree) {
                            if (rowThrChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowThrChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowThrChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowFouChar : rowFour) {
                            if (rowFouChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowFouChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowFouChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowFivChar : rowFive) {
                            if (rowFivChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowFivChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowFivChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowSixChar : rowSix) {
                            if (rowSixChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowSixChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowSixChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }


                        System.out.println("|1||2||3||4||5||6||7|");
                        for (int i = 0; i < 6; i++) {
                            System.out.print(colOne.get(i));
                            System.out.print(colTwo.get(i));
                            System.out.print(colThree.get(i));
                            System.out.print(colFour.get(i));
                            System.out.print(colFive.get(i));
                            System.out.print(colSix.get(i));
                            System.out.print(colSev.get(i));
                            System.out.println();
                        }
                        ArrayList<String> entireConnectFour = new ArrayList<>();
                        for (String rowOneVal : rowOne) {
                            entireConnectFour.add(rowOneVal);
                        }
                        for (String rowTwoVal : rowTwo) {
                            entireConnectFour.add(rowTwoVal);
                        }
                        for (String rowThreeVal : rowThree) {
                            entireConnectFour.add(rowThreeVal);
                        }
                        for (String rowFourVal : rowFour) {
                            entireConnectFour.add(rowFourVal);
                        }
                        for (String rowFiveVal : rowFive) {
                            entireConnectFour.add(rowFiveVal);
                        }
                        for (String rowSixVal : rowSix) {
                            entireConnectFour.add(rowSixVal);
                        }

                        for (int horiz = 0; horiz <= 2; horiz++) {
                            for (int verti = 0; verti <= 3; verti++) {

                                int indexWereChecking = 7 * horiz + verti;
                                if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 8).equals("(R)") && entireConnectFour.get(indexWereChecking + 16).equals("(R)") && entireConnectFour.get(indexWereChecking + 24).equals("(R)")) {
                                    redWin = true;
                                } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 8).equals("(Y)") && entireConnectFour.get(indexWereChecking + 16).equals("(Y)") && entireConnectFour.get(indexWereChecking + 24).equals("(Y)")) {
                                    yelWin = true;
                                }
                            }
                        }
                        for (int horiz = 0; horiz <= 2; horiz++) {
                            for (int verti = 3; verti <= 6; verti++) {
                                int indexWereChecking = 7 * horiz + verti;
                                if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 6).equals("(R)") && entireConnectFour.get(indexWereChecking + 12).equals("(R)") && entireConnectFour.get(indexWereChecking + 18).equals("(R)")) {
                                    redWin = true;
                                } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 6).equals("(Y)") && entireConnectFour.get(indexWereChecking + 12).equals("(Y)") && entireConnectFour.get(indexWereChecking + 18).equals("(Y)")) {
                                    yelWin = true;
                                }
                            }
                        }
                        turnCount++;
                    }
                    if (yelWin) {
                        System.out.println("yellow, u win");
                    } else if (redWin) {
                        System.out.println("Red, u win");
                    } else {
                        System.out.println("Draw :(");
                    }
                    sc.nextLine();
                    System.out.println("Would you like to play again? Y-N");
                    String replayChoice = sc.nextLine();
                    if (replayChoice.equals("N")) {
                        playerReplay = false;
                    }
                case 2:
                    amountInColOne = 0; //Keeping track of the amount in each column to determine when it is a draw or that column has achieved a maximum.
                    amountInColTwo = 0;
                    amountInColThree = 0;
                    amountInColFour = 0;
                    amountInColFive = 0;
                    amountInColSix = 0;
                    amountInColSev = 0;
                    redWin = false;
                    yelWin = false;
                    draw = false;
                    int counterRed = 0;
                    int counterYell = 0;
                    int turncount = 1; //Turn count to determine if it is the computers turn or player (Player always goes first).
                    while (!redWin && !yelWin && !draw) {

                        if (turncount % 2 != 0) {
                            System.out.println("What column, player? (1-7)");
                            int columnChoice = sc.nextInt();
                            switch (columnChoice) { //Switch case(players turn) to establish which column they're going to place they're red circle in.
                                case 1:
                                    if (amountInColOne < 6) { //Maximum amount in a column is 6 because of the amount of rows.
                                        colOne.set(colOne.size() - 1 - amountInColOne, "(R)"); //Sets the R to the ideal index starting with index of size - 1 which is 6.
                                        amountInColOne++; //Increases the counter amount in a column by 1.
                                        turncount++; //Increases the turn count to assure it is the computers turn.
                                    } else {
                                        System.out.println("That column's full dummy"); //If the amount in a column is equal or more than six than it has reached its maximum.
                                    }
                                    break;
                                case 2:
                                    if (amountInColTwo < 6) {
                                        colTwo.set(colOne.size() - 1 - amountInColTwo, "(R)");
                                        amountInColTwo++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                case 3:
                                    if (amountInColThree < 6) {
                                        colThree.set(colOne.size() - 1 - amountInColThree, "(R)");
                                        amountInColThree++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                case 4:
                                    if (amountInColFour < 6) {
                                        colFour.set(colOne.size() - 1 - amountInColFour, "(R)");
                                        amountInColFour++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                case 5:
                                    if (amountInColFive < 6) {
                                        colFive.set(colOne.size() - 1 - amountInColFive, "(R)");
                                        amountInColFive++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                case 6:
                                    if (amountInColSix < 6) {
                                        colSix.set(colOne.size() - 1 - amountInColSix, "(R)");
                                        amountInColSix++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                case 7:
                                    if (amountInColSev < 6) {
                                        colSev.set(colOne.size() - 1 - amountInColSev, "(R)");
                                        amountInColSev++;
                                        turncount++;
                                    } else {
                                        System.out.println("That column's full dummy");
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid input. Please enter a number from 1 to 7.");
                            }
                        }

                        boolean computerMoved = false; //Assure that the game loops until either computer or player wins or a draw occurs by making the boolean false and making the while loop occur again every time it loops.
                        if (turncount % 2 == 0) {
                            while (!computerMoved) {
                                int randColumn = (int) (Math.random() * 7) + 1;
                                switch (randColumn) { //Similar switch case than above except it utilizes a random number generator because it is the computers turn.
                                    case 1:
                                        if (amountInColOne < 6) {
                                            colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                            amountInColOne++;
                                            turncount++;
                                            computerMoved = true; //To exit the loop.
                                        }
                                        break;
                                    case 2:
                                        if (amountInColTwo < 6) {
                                            colTwo.set(colOne.size() - 1 - amountInColTwo, "(Y)");
                                            amountInColTwo++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                    case 3:
                                        if (amountInColThree < 6) {
                                            colThree.set(colOne.size() - 1 - amountInColThree, "(Y)");
                                            amountInColThree++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                    case 4:
                                        if (amountInColFour < 6) {
                                            colFour.set(colOne.size() - 1 - amountInColFour, "(Y)");
                                            amountInColFour++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                    case 5:
                                        if (amountInColFive < 6) {
                                            colFive.set(colOne.size() - 1 - amountInColFive, "(Y)");
                                            amountInColFive++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                    case 6:
                                        if (amountInColSix < 6) {
                                            colSix.set(colOne.size() - 1 - amountInColSix, "(Y)");
                                            amountInColSix++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                    case 7:
                                        if (amountInColSev < 6) {
                                            colSev.set(colOne.size() - 1 - amountInColSev, "(Y)");
                                            amountInColSev++;
                                            turncount++;
                                            computerMoved = true;
                                        }
                                        break;
                                }
                            }
                        }
                        rowOne.clear();
                        rowTwo.clear();
                        rowThree.clear();
                        rowFour.clear();
                        rowFive.clear();
                        rowSix.clear(); //This is essential because without this the rows would keep growing due to the nature of columns altering on every turn. Clearing the rows every loop and creating news ones ensures that we have updated rows and limits critical issues.
                        rowOne.add(colOne.getFirst()); //Rows consist of columns one through seven of the same index and are created to check horizontal and diagonal winning.
                        for (String colOneChar : colOne) { //Checks vertical winning by adding yellow or red counter when it interacts with either one and when it interacts with the opposing one it turns into zero. Once the counter reaches 4 in the yellow counter or red counter that colour wins.
                            for (String rowOneChar : rowOne) { //This is the win conditions for horizontal. Similar to columns, instead it utilizes rows.
                                if (rowOneChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                } else if (rowOneChar.equals("(Y)")) {
                                    counterYell++;
                                    counterRed = 0;
                                } else if (rowOneChar.equals("(x)")) { //Resets here because an x in between y and r isn't problem in vertical.
                                    rowOne.add(colOne.getFirst());
                                    rowOne.add(colTwo.getFirst());
                                    rowOne.add(colThree.getFirst());
                                    rowOne.add(colFour.getFirst());
                                    rowOne.add(colFive.getFirst());
                                    rowOne.add(colSix.getFirst());
                                    rowOne.add(colSev.getFirst());

                                    rowTwo.add(colOne.get(1));
                                    rowTwo.add(colTwo.get(1));
                                    rowTwo.add(colThree.get(1));
                                    rowTwo.add(colFour.get(1));
                                    rowTwo.add(colFive.get(1));
                                    rowTwo.add(colSix.get(1));
                                    rowTwo.add(colSev.get(1));

                                    rowThree.add(colOne.get(2));
                                    rowThree.add(colTwo.get(2));
                                    rowThree.add(colThree.get(2));
                                    rowThree.add(colFour.get(2));
                                    rowThree.add(colFive.get(2));
                                    rowThree.add(colSix.get(2));
                                    rowThree.add(colSev.get(2));

                                    rowFour.add(colOne.get(3));
                                    rowFour.add(colTwo.get(3));
                                    rowFour.add(colThree.get(3));
                                    rowFour.add(colFour.get(3));
                                    rowFour.add(colFive.get(3));
                                    rowFour.add(colSix.get(3));
                                    rowFour.add(colSev.get(3));

                                    rowFive.add(colOne.get(4));
                                    rowFive.add(colTwo.get(4));
                                    rowFive.add(colThree.get(4));
                                    rowFive.add(colFour.get(4));
                                    rowFive.add(colFive.get(4));
                                    rowFive.add(colSix.get(4));
                                    rowFive.add(colSev.get(4));

                                    rowSix.add(colOne.get(5));
                                    rowSix.add(colTwo.get(5));
                                    rowSix.add(colThree.get(5));
                                    rowSix.add(colFour.get(5));
                                    rowSix.add(colFive.get(5));
                                    rowSix.add(colSix.get(5));
                                    rowSix.add(colSev.get(5));
                                    ArrayList<String> entireConnectFour = new ArrayList<>(); //Add all rows into one Array list to check for diagonal winning.
                                    for (String rowOneVal : rowOne) {
                                        entireConnectFour.add(rowOneVal);
                                    }
                                    for (String rowTwoVal : rowTwo) {
                                        entireConnectFour.add(rowTwoVal);
                                    }
                                    for (String rowThreeVal : rowThree) {
                                        entireConnectFour.add(rowThreeVal);
                                    }
                                    for (String rowFourVal : rowFour) {
                                        entireConnectFour.add(rowFourVal);
                                    }
                                    for (String rowFiveVal : rowFive) {
                                        entireConnectFour.add(rowFiveVal);
                                    }
                                    for (String rowSixVal : rowSix) {
                                        entireConnectFour.add(rowSixVal);
                                    }

                                    for (int horiz = 0; horiz <= 2; horiz++) { // First loop: Check for diagonal wins from top-left to bottom-right (positive slope \).
                                        for (int verti = 0; verti <= 3; verti++) {

                                            int indexWereChecking = 7 * horiz + verti;
                                            if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 8).equals("(R)") && entireConnectFour.get(indexWereChecking + 16).equals("(R)") && entireConnectFour.get(indexWereChecking + 24).equals("(R)")) {
                                                redWin = true; // Check if 4 red tokens are in a diagonal (\ direction).
                                            } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 8).equals("(Y)") && entireConnectFour.get(indexWereChecking + 16).equals("(Y)") && entireConnectFour.get(indexWereChecking + 24).equals("(Y)")) {
                                                yelWin = true;  // Check if 4 yellow tokens are in a diagonal (\ direction).
                                            }
                                        }
                                    }
                                    for (int horiz = 0; horiz <= 2; horiz++) { // Second loop: Check for diagonal wins from top-right to bottom-left (negative slope /).
                                        for (int verti = 3; verti <= 6; verti++) {
                                            int indexWereChecking = 7 * horiz + verti;
                                            if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 6).equals("(R)") && entireConnectFour.get(indexWereChecking + 12).equals("(R)") && entireConnectFour.get(indexWereChecking + 18).equals("(R)")) {
                                                redWin = true; // Check if 4 red tokens are in a diagonal (/ direction).
                                            } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 6).equals("(Y)") && entireConnectFour.get(indexWereChecking + 12).equals("(Y)") && entireConnectFour.get(indexWereChecking + 18).equals("(Y)")) {
                                                yelWin = true; // Check if 4 yellow tokens are in a diagonal (/ direction).
                                            }
                                        }
                                    }
                                    if (amountInColOne == 6 && amountInColThree == 6 && amountInColFour == 6 && amountInColFive == 6 && amountInColSix == 6 && amountInColSev == 6 && amountInColTwo == 6) {
                                        draw = true;
                                    } //Once all columns are full it is a draw.
                                }
                                if (yelWin) {
                                    System.out.println("yellow, u win");
                                } else if (redWin) {
                                    System.out.println("Red, u win");
                                } else {
                                    System.out.println("Draw :(");
                                }
                                sc.nextLine();
                                System.out.println("Would you like to play again? Y-N");
                                replayChoice = sc.nextLine();
                                if (replayChoice.equals("N")) {
                                    playerReplay = false;
                                }
                            }
                        }
                    }
                case 3:
                    System.out.println("PLEASE NOTE !!!!! if A FORK HAPPENS (BOTH OPTIONS LEADING TO BOT LOSING) THEN THE BOT WILL LOSE (IT'S STUPID)");
                    while (!redWin && !yelWin && !draw) { //while every one is true: red didn't win, yellow didn't win, and it's not a draw
                        rowOne.clear();
                        rowTwo.clear();
                        rowThree.clear();
                        rowFour.clear();
                        rowFive.clear();
                        rowSix.clear();  //rows are cleared because only the columns are being updated
                        counterRed = 0;
                        counterYell = 0;
                        System.out.println("What column, player?");
                        int columnChoice = sc.nextInt();
                        switch (columnChoice) {
                            case 1: //All  of the player options
                                if (amountInColOne == 6) { //If the arraylist is full
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) { //Player's turn
                                        colOne.set(colOne.size() - 1 - amountInColOne, "(R)"); //total size subtract one (highest index) subtract amount already filled, set as "(R)"
                                        amountInColOne++;
                                        turnCount++; //have to update these every time they need to be
                                    }
                                }
                                break;

                            case 2:
                                if (amountInColTwo == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {
                                        colTwo.set(colTwo.size() - 1 - amountInColTwo, "(R)");
                                        amountInColTwo++;
                                        turnCount++;
                                    }
                                }
                                break;

                            case 3:
                                if (amountInColThree == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {
                                        colThree.set(colThree.size() - 1 - amountInColThree, "(R)");
                                        amountInColThree++;
                                        turnCount++;
                                    }
                                }
                                break;

                            case 4:
                                if (amountInColFour == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {
                                        colFour.set(colFour.size() - 1 - amountInColFour, "(R)");
                                        amountInColFour++;
                                        turnCount++;
                                    }
                                }
                                break;

                            case 5:
                                if (amountInColFive == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {

                                        colFive.set(colFive.size() - 1 - amountInColFive, "(R)");
                                        amountInColFive++;
                                        turnCount++;
                                    }
                                }
                                break;

                            case 6:
                                if (amountInColSix == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {
                                        colSix.set(colSix.size() - 1 - amountInColSix, "(R)");
                                        amountInColSix++;
                                        turnCount++;
                                    }
                                }
                                break;

                            case 7:
                                if (amountInColSev == 6) {
                                    System.out.println("That column's full dummy");
                                } else {
                                    if (turnCount % 2 == 0) {
                                        colSev.set(colSev.size() - 1 - amountInColSev, "(R)");
                                        amountInColSev++;
                                        turnCount++;
                                    }
                                }
                                break;

                            default:
                                System.out.println("Unfortunately, you have not entered a valid number. Please re-enter");
                                break;
                        }
//Sets up all of the rows
                        rowOne.add(colOne.getFirst());
                        rowOne.add(colTwo.getFirst());
                        rowOne.add(colThree.getFirst());
                        rowOne.add(colFour.getFirst());
                        rowOne.add(colFive.getFirst());
                        rowOne.add(colSix.getFirst());
                        rowOne.add(colSev.getFirst());

                        rowTwo.add(colOne.get(1));
                        rowTwo.add(colTwo.get(1));
                        rowTwo.add(colThree.get(1));
                        rowTwo.add(colFour.get(1));
                        rowTwo.add(colFive.get(1));
                        rowTwo.add(colSix.get(1));
                        rowTwo.add(colSev.get(1));

                        rowThree.add(colOne.get(2));
                        rowThree.add(colTwo.get(2));
                        rowThree.add(colThree.get(2));
                        rowThree.add(colFour.get(2));
                        rowThree.add(colFive.get(2));
                        rowThree.add(colSix.get(2));
                        rowThree.add(colSev.get(2));

                        rowFour.add(colOne.get(3));
                        rowFour.add(colTwo.get(3));
                        rowFour.add(colThree.get(3));
                        rowFour.add(colFour.get(3));
                        rowFour.add(colFive.get(3));
                        rowFour.add(colSix.get(3));
                        rowFour.add(colSev.get(3));

                        rowFive.add(colOne.get(4));
                        rowFive.add(colTwo.get(4));
                        rowFive.add(colThree.get(4));
                        rowFive.add(colFour.get(4));
                        rowFive.add(colFive.get(4));
                        rowFive.add(colSix.get(4));
                        rowFive.add(colSev.get(4));

                        rowSix.add(colOne.get(5));
                        rowSix.add(colTwo.get(5));
                        rowSix.add(colThree.get(5));
                        rowSix.add(colFour.get(5));
                        rowSix.add(colFive.get(5));
                        rowSix.add(colSix.get(5));
                        rowSix.add(colSev.get(5));
//This sets up a single 1d array that has all the values of the entire grid (we thought of it too late to use only this)
                        ArrayList<String> entireConnectFour = new ArrayList<>();
                        for (String rowOneVal : rowOne) {
                            entireConnectFour.add(rowOneVal);
                        }
                        for (String rowTwoVal : rowTwo) {
                            entireConnectFour.add(rowTwoVal);
                        }
                        for (String rowThreeVal : rowThree) {
                            entireConnectFour.add(rowThreeVal);
                        }
                        for (String rowFourVal : rowFour) {
                            entireConnectFour.add(rowFourVal);
                        }
                        for (String rowFiveVal : rowFive) {
                            entireConnectFour.add(rowFiveVal);
                        }
                        for (String rowSixVal : rowSix) {
                            entireConnectFour.add(rowSixVal);
                        }

                        //THIS IS THE BOT CHECKER (IT'LL TAKE SO MANY LINES BUT IT'S OKAY
                        boolean botAlreadyWent = false; //If this is false, then there are no threats and it'll do default action
                        int indexOf = 0;
                        if (turnCount % 2 == 1) { //bot's turn
                            indexOf++; //Need to keep track of when the counters become 3
                            for (String colOneChar : colOne) { //Checks every single value of a column
                                if (colOneChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0; //Yellow is reset if a red is counted

                                }
                                if (colOneChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++; //Red is reset if a yellow is counted
                                }
                                //if 3 reds is counted, it's not full, and 1 above the (R) or (Y) is empty, then place it there
                                if ((counterRed == 3 && amountInColOne != 6 && colOne.get(colOne.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColOne != 6) && colOne.get(colOne.size() - indexOf-1).equals("(x)"))) {
                                    colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColOne++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colTwoChar : colTwo) {
                                indexOf++;
                                if (colTwoChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colTwoChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColTwo != 6 && colTwo.get(colTwo.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColTwo != 6) && colTwo.get(colTwo.size() - indexOf-1).equals("(x)"))) {
                                    colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColTwo++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colThreeChar : colThree) {
                                indexOf++;
                                if (colThreeChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colThreeChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColThree != 6 && colThree.get(colThree.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColThree != 6) && colThree.get(colThree.size() - indexOf-1).equals("(x)"))) {
                                    colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColThree++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colFourChar : colFour) {
                                indexOf++;
                                if (colFourChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colFourChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColFour != 6 && colFour.get(colFour.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColFour != 6) && colFour.get(colFour.size() - indexOf-1).equals("(x)"))) {
                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColFour++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colFiveChar : colFive) {
                                indexOf++;
                                if (colFiveChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colFiveChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColFive != 6 && colFive.get(colFive.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColFive != 6) && colFive.get(colFive.size() - indexOf-1).equals("(x)"))) {
                                    colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColFive++;
                                    break;
                                }
                            }

                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colSixChar : colSix) {
                                indexOf++;
                                if (colSixChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colSixChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColSix != 6 && colSix.get(colSix.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColSix != 6) && colSix.get(colSix.size() - indexOf-1).equals("(x)"))) {
                                    colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColSix++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            indexOf=0;
                            for (String colSevChar : colSev) {
                                indexOf++;
                                if (colSevChar.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                }
                                if (colSevChar.equals("(Y)")) {
                                    counterRed = 0;
                                    counterYell++;
                                }
                                if ((counterRed == 3 && amountInColSev != 6 && colSev.get(colSev.size() - indexOf-1).equals("(x)")) || ((counterYell == 3 && amountInColSev != 6) && colSev.get(colSev.size() - indexOf-1).equals("(x)"))) {
                                    colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                    turnCount++;
                                    botAlreadyWent = true;
                                    amountInColSev++;
                                    break;
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            int colCounter = 0; //setting up needed variables
                            int rowCounter = 0;
                            for (String indexBigArray : entireConnectFour) { //checking the index of every variable in big array
                                if (colCounter == 7) { //resets column when a new row (can't have a column 8)
                                    colCounter = 0;
                                    rowCounter++; //adds to rows
                                    counterYell = 0; //counters reset in a new row
                                    counterRed = 0;
                                }

                                if (indexBigArray.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                } else if (indexBigArray.equals("(Y)")) {
                                    counterYell++;
                                    counterRed = 0;
                                } else { //resets both red and yellow when an empty slow is hit
                                    counterYell = 0;
                                    counterRed = 0;
                                }
                                if (counterRed == 3 || counterYell == 3) { //If there are 3 reds or 3 yellows in a row
                                    if (colCounter >= 3 && entireConnectFour.get((7 * rowCounter) + colCounter - 3).equals("(x)")) { //first part is safety, second part checks if to the left of the 3 in a row is empty
                                        if ((7 * rowCounter) + colCounter < 35) { //if it's less than 35 (have to worry about floating 3 in a rows)
                                            if (!(entireConnectFour.get((7 * rowCounter) + colCounter + 5).equals("(x)"))) { //if the slot beneath the place where a connect 4 is threatened ISN'T empty (if it is then we can ignore)
                                                switch (colCounter) {
                                                    case 3: //case 3 means column 4, so we have to add to col 1
                                                        colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                        turnCount++;
                                                        amountInColOne++;
                                                        botAlreadyWent = true;
                                                        break;

                                                    case 4:
                                                        colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                        turnCount++;
                                                        amountInColTwo++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 5:
                                                        colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                        turnCount++;
                                                        amountInColThree++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 6:
                                                        colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                        turnCount++;
                                                        amountInColFour++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    default:
                                                        System.out.println("Somehow the game broke");
                                                        break;
                                                }
                                            }
                                        } else { //if it's more than 35 then we don't have to worry about floating 3 in a rows
                                            switch (colCounter) {
                                                case 3:
                                                    colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                    turnCount++;
                                                    amountInColOne++;
                                                    botAlreadyWent = true;
                                                    break;

                                                case 4:
                                                    colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                    turnCount++;
                                                    amountInColTwo++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 5:
                                                    colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                    turnCount++;
                                                    amountInColThree++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 6:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    turnCount++;
                                                    amountInColFour++;
                                                    botAlreadyWent = true;
                                                    break;
                                                default:
                                                    System.out.println("Somehow the game broke");
                                                    break;
                                            }
                                        }
                                    } else { //This checks the other direction
                                        if ((7 * rowCounter) + colCounter < 41) { //Safety: largest index is 41
                                            if (entireConnectFour.get((7 * rowCounter) + colCounter + 1).equals("(x)")) { //if 1 after the 3 in a row is empty
                                                if ((7 * rowCounter) + colCounter < 34) {
                                                    if (!(entireConnectFour.get((7 * rowCounter) + colCounter + 8).equals("(x)"))) {
                                                        switch (colCounter) {
                                                            case 2: // case 2 means column 3 (0, 1, 2) and one after is 4, so column 4 is being set
                                                                colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                                turnCount++;
                                                                amountInColFour++;
                                                                botAlreadyWent = true;
                                                                break;
                                                            case 3:
                                                                colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                                turnCount++;
                                                                amountInColFive++;
                                                                botAlreadyWent = true;
                                                                break;
                                                            case 4:
                                                                colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                                turnCount++;
                                                                amountInColSix++;
                                                                botAlreadyWent = true;
                                                                break;
                                                            case 5:
                                                                colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                                                turnCount++;
                                                                amountInColSev++;
                                                                botAlreadyWent = true;
                                                                break;
                                                            default:
                                                                System.out.println("Somehow the game broke");
                                                                break;
                                                        }
                                                    }
                                                } else {
                                                    switch (colCounter) {
                                                        case 2:
                                                            colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                            turnCount++;
                                                            amountInColFour++;
                                                            botAlreadyWent = true;
                                                            break;
                                                        case 3:
                                                            colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                            turnCount++;
                                                            amountInColFive++;
                                                            botAlreadyWent = true;
                                                            break;
                                                        case 4:
                                                            colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                            turnCount++;
                                                            amountInColSix++;
                                                            botAlreadyWent = true;
                                                            break;
                                                        case 5:
                                                            colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                                            turnCount++;
                                                            amountInColSev++;
                                                            botAlreadyWent = true;
                                                            break;
                                                        default:
                                                            System.out.println("Somehow the game broke");
                                                            break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                colCounter++;
                            }
                            counterRed = 0; // THIS CODE CHECKS FOR RxRR and RRxR BECAUSE THE LAST BLOCK ONLY CHECKS xRRR and RRRx FOR HORIZONTAL AND I FORGOT ABOUT THIS
                            counterYell = 0;
                            colCounter = 0;
                            rowCounter = 0;
                            boolean isXUsed = false; //we can have 1 blank between every 3
                            for (String indexBigArray : entireConnectFour) {
                                if (colCounter == 7) {
                                    colCounter = 0;
                                    rowCounter++;
                                    isXUsed = false;
                                    counterYell = 0;
                                    counterRed = 0;
                                }
                                if (indexBigArray.equals("(x)") && !isXUsed) { //Makes the blank used boolean true
                                    isXUsed = true;
                                } else if (indexBigArray.equals("(x)")) {  //resets the boolean (after a blank space is counted, another blank becomes available)
                                    isXUsed = false;
                                    counterRed = 0;
                                    counterYell = 0;
                                }

                                if (indexBigArray.equals("(R)")) {
                                    counterRed++;
                                    counterYell = 0;
                                    isXUsed = false;
                                } else if (indexBigArray.equals("(Y)")) {
                                    counterYell++;
                                    counterRed = 0;
                                    isXUsed = false;
                                }

                                if ((counterRed == 3 || counterYell == 3)) { //a bot piece is going to be placed whether it's blocking red or winning yellow piece
                                    counterRed = 0;
                                    counterYell = 0;
                                    if (colCounter >= 2 && entireConnectFour.get((7 * rowCounter) + colCounter - 2).equals("(x)")) { //First part is safety, second part checks if 2 before the index checked is blank (RxRR, last R is index)
                                        switch (colCounter) {
                                            case 3: //if the colCounter is at 3 (colFour) then the blank space is 2 before it (colTwo)
                                                colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                turnCount++;
                                                amountInColTwo++;
                                                botAlreadyWent = true;
                                                break;
                                            case 4:
                                                colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                turnCount++;
                                                amountInColThree++;
                                                botAlreadyWent = true;
                                                break;
                                            case 5:
                                                colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                turnCount++;
                                                amountInColFour++;
                                                botAlreadyWent = true;
                                                break;
                                            case 6:
                                                colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                turnCount++;
                                                amountInColFive++;
                                                botAlreadyWent = true;
                                                break;
                                            default:
                                                System.out.println("Somehow the game broke"); //This shouldn't happen but just in case
                                                break;
                                        }
                                    } else {
                                        if ((7 * rowCounter) + colCounter <= 41) { // safety
                                            if (colCounter >= 1 && entireConnectFour.get((7 * rowCounter) + colCounter - 1).equals("(x)")) { //checks the other case: RRxR, last R is the index and index-1 is the blank space
                                                switch (colCounter) {
                                                    case 3:
                                                        colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                        turnCount++;
                                                        amountInColThree++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 4:
                                                        colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                        turnCount++;
                                                        amountInColFour++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 5:
                                                        colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                        turnCount++;
                                                        amountInColFive++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 6:
                                                        colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                        turnCount++;
                                                        amountInColSix++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    default:
                                                        System.out.println("Somehow the game broke");
                                                        break;
                                                }

                                            }
                                        }
                                    }
                                }
                                colCounter++;
                            }
                            for (int horiz = 0; horiz <= 2; horiz++) { //Checks diagonals. These rows are the only possible ones that can go down-right fully
                                for (int verti = 0; verti <= 3; verti++) { //these columns are the only possible ones that can go down-right fully
                                    int indexWereChecking = 7 * horiz + verti; // 7 times row plus column gives index of the big array
                                    //+8 is going down a row and then right one (diagonal down once)
                                    if ((entireConnectFour.get(indexWereChecking).equals("(R)")&&entireConnectFour.get(indexWereChecking+8).equals("(R)")&&entireConnectFour.get(indexWereChecking+16).equals("(R)")) || (entireConnectFour.get(indexWereChecking).equals("(Y)")&&(entireConnectFour.get(indexWereChecking+8).equals("(Y)")&&(entireConnectFour.get(indexWereChecking+16).equals("(Y)"))))) {
                                        if (horiz==2) { // we don't have to worry about a floating 3 in a row
                                            switch (verti) {
                                                case 0:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 1:
                                                    colFive.set(colFive.size()-1-amountInColFive,"(Y)");
                                                    amountInColFive++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 2:
                                                    colSix.set(colSix.size()-1-amountInColSix,"(Y)");
                                                    amountInColSix++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 3:
                                                    colSev.set(colSev.size()-1-amountInColSev,"(Y)");
                                                    amountInColSev++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                default:
                                                    System.out.println("the game broke somehow");
                                                    break;
                                            }
                                        } else {
                                            if (!entireConnectFour.get(indexWereChecking+31).equals("(x)")) { // if the space beneath the potential place is not empty
                                                switch (verti) {
                                                    case 0:
                                                        colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                        amountInColFour++;
                                                        turnCount++;
                                                        botAlreadyWent=true;
                                                        break;
                                                    case 1:
                                                        colFive.set(colFive.size()-1-amountInColFive,"(Y)");
                                                        amountInColFive++;
                                                        turnCount++;
                                                        botAlreadyWent=true;
                                                        break;
                                                    case 2:
                                                        colSix.set(colSix.size()-1-amountInColSix,"(Y)");
                                                        amountInColSix++;
                                                        turnCount++;
                                                        botAlreadyWent=true;
                                                        break;
                                                    case 3:
                                                        colSev.set(colSev.size()-1-amountInColSev,"(Y)");
                                                        amountInColSev++;
                                                        turnCount++;
                                                        botAlreadyWent=true;
                                                        break;
                                                    default:
                                                        System.out.println("the game broke somehow");
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            for (int horiz = 0; horiz<=2; horiz++) {
                                for (int verti = 3; verti <= 6; verti++) { // same thing but the columns going from right to left this time
                                    int indexWereChecking = 7 * horiz + verti;
                                    //+6 means going down one row and left one (down-left diagonal)
                                    if ((entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 6).equals("(R)") && entireConnectFour.get(indexWereChecking + 12).equals("(R)")) || (entireConnectFour.get(indexWereChecking).equals("(Y)") && (entireConnectFour.get(indexWereChecking + 6).equals("(Y)") && (entireConnectFour.get(indexWereChecking + 12).equals("(Y)"))))) {
                                        if (horiz == 2) {
                                            switch (verti) {
                                                case 3:
                                                    colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                    amountInColOne++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 4:
                                                    colTwo.set(colTwo.size()-1-amountInColTwo,"(Y)");
                                                    amountInColTwo++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 5:
                                                    colThree.set(colThree.size()-1-amountInColThree,"(Y)");
                                                    amountInColThree++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                case 6:
                                                    colFour.set(colFour.size()-1-amountInColFour,"(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent=true;
                                                    break;
                                                default:
                                                    System.out.println("the game broke somehow");
                                                    break;
                                            }
                                        } else {
                                            if (!entireConnectFour.get(indexWereChecking+25).equals("(x)")) {
                                                switch (verti) {
                                                    case 3:
                                                        colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                        amountInColOne++;
                                                        turnCount++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 4:
                                                        colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                        amountInColTwo++;
                                                        turnCount++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 5:
                                                        colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                        amountInColThree++;
                                                        turnCount++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    case 6:
                                                        colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                        amountInColFour++;
                                                        turnCount++;
                                                        botAlreadyWent = true;
                                                        break;
                                                    default:
                                                        System.out.println("the game broke somehow");
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            for (int horiz = 5; horiz>=3; horiz--) { //Checks from the other direction - previous only went up-down, this goes down-up. Rows are 5, 4, 3
                                for (int verti = 0; verti<=3; verti++) {
                                    int indexWereChecking = horiz*7+verti;
                                    if ((entireConnectFour.get(indexWereChecking).equals("(R)")&&entireConnectFour.get(indexWereChecking-6).equals("(R)")&&entireConnectFour.get(indexWereChecking-12).equals("(R)")) || (entireConnectFour.get(indexWereChecking).equals("(Y)")&&entireConnectFour.get(indexWereChecking-6).equals("(Y)")&&entireConnectFour.get(indexWereChecking-12).equals("(Y)"))) {
                                        if (horiz == 3) {
                                            switch (verti) {
                                                case 0:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 1:
                                                    colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                    amountInColFive++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 2:
                                                    colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                    amountInColSix++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 3:
                                                    colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                                    amountInColSev++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                default:
                                                    System.out.println("the Game broke somehow");
                                            }
                                        } else if (!entireConnectFour.get(indexWereChecking - 11).equals("(x)")) {
                                            switch (verti) {
                                                case 0:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 1:
                                                    colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                    amountInColFive++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 2:
                                                    colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                    amountInColSix++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 3:
                                                    colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                                    amountInColSev++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                default:
                                                    System.out.println("the Game broke somehow");
                                            }
                                        }
                                    }
                                }
                            }
                            for (int horiz = 5; horiz>=3; horiz--) {
                                for (int verti = 6; verti>=3; verti--) {
                                    int indexWereChecking = horiz*7+verti;
                                    if ((entireConnectFour.get(indexWereChecking).equals("(R)")&&entireConnectFour.get(indexWereChecking-8).equals("(R)")&&entireConnectFour.get(indexWereChecking-16).equals("(R)")) || (entireConnectFour.get(indexWereChecking).equals("(Y)")&&entireConnectFour.get(indexWereChecking-8).equals("(Y)")&&entireConnectFour.get(indexWereChecking-16).equals("(Y)"))) {
                                        if (horiz == 3) {
                                            switch (verti) {
                                                case 6:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 5:
                                                    colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                    amountInColThree++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 4:
                                                    colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                    amountInColTwo++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 3:
                                                    colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                    amountInColOne++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                default:
                                                    System.out.println("the Game broke somehow");
                                            }
                                        } else if (!entireConnectFour.get(indexWereChecking - 17).equals("(x)")) {
                                            switch (verti) {
                                                case 6:
                                                    colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                    amountInColFour++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 5:
                                                    colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                    amountInColThree++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 4:
                                                    colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                    amountInColTwo++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                case 3:
                                                    colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                    amountInColOne++;
                                                    turnCount++;
                                                    botAlreadyWent = true;
                                                    break;
                                                default:
                                                    System.out.println("the Game broke somehow");
                                            }
                                        }
                                    }
                                }
                            }
                            counterRed = 0;
                            counterYell = 0;
                            boolean alreadyFullSpace = amountInColOne == 6 && amountInColTwo == 6 && amountInColThree == 6 && amountInColFour == 6 && amountInColFive == 6 && amountInColSix == 6 && amountInColSev == 6; //putting the draw condition before this would make things complicated
                            botColCounter = 0;
                            //if there's no threat, the bot will place a piece into col 1, then col 2, then col 3...
                            int attempts = 0; //for some reason it just freezes sometimes so I capped it at 7 times
                            while (!botAlreadyWent&&attempts<7) { //bot didn't already go (it'd go multiple times)
                                if (botColCounter == 7) {
                                    botColCounter = 0;
                                }
                                if (!alreadyFullSpace) {
                                    switch (botColCounter) {
                                        case 0:
                                            if (amountInColOne < 6) { //if the column isn't full
                                                colOne.set(colOne.size() - 1 - amountInColOne, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColOne++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 1:
                                            if (amountInColTwo < 6) {
                                                colTwo.set(colTwo.size() - 1 - amountInColTwo, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColTwo++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 2:
                                            if (amountInColThree < 6) {
                                                colThree.set(colThree.size() - 1 - amountInColThree, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColThree++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 3:
                                            if (amountInColFour < 6) {
                                                colFour.set(colFour.size() - 1 - amountInColFour, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColFour++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 4:
                                            if (amountInColFive < 6) {
                                                colFive.set(colFive.size() - 1 - amountInColFive, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColFive++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 5:
                                            if (amountInColSix < 6) {
                                                colSix.set(colSix.size() - 1 - amountInColSix, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColSix++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                        case 6:
                                            if (amountInColSev < 6) {
                                                colSev.set(colSev.size() - 1 - amountInColSev, "(Y)");
                                                botColCounter++;
                                                turnCount++;
                                                amountInColSev++;
                                                botAlreadyWent = true;
                                            }
                                            break;
                                    }
                                }attempts++;
                            }
                        }
//It has to be updated here again because our code layout sucks and the bot just went so grid layout would be different
                        rowOne.clear();
                        rowTwo.clear();
                        rowThree.clear();
                        rowFour.clear();
                        rowFive.clear();
                        rowSix.clear();
                        rowOne.add(colOne.getFirst());
                        rowOne.add(colTwo.getFirst());
                        rowOne.add(colThree.getFirst());
                        rowOne.add(colFour.getFirst());
                        rowOne.add(colFive.getFirst());
                        rowOne.add(colSix.getFirst());
                        rowOne.add(colSev.getFirst());

                        rowTwo.add(colOne.get(1));
                        rowTwo.add(colTwo.get(1));
                        rowTwo.add(colThree.get(1));
                        rowTwo.add(colFour.get(1));
                        rowTwo.add(colFive.get(1));
                        rowTwo.add(colSix.get(1));
                        rowTwo.add(colSev.get(1));

                        rowThree.add(colOne.get(2));
                        rowThree.add(colTwo.get(2));
                        rowThree.add(colThree.get(2));
                        rowThree.add(colFour.get(2));
                        rowThree.add(colFive.get(2));
                        rowThree.add(colSix.get(2));
                        rowThree.add(colSev.get(2));

                        rowFour.add(colOne.get(3));
                        rowFour.add(colTwo.get(3));
                        rowFour.add(colThree.get(3));
                        rowFour.add(colFour.get(3));
                        rowFour.add(colFive.get(3));
                        rowFour.add(colSix.get(3));
                        rowFour.add(colSev.get(3));

                        rowFive.add(colOne.get(4));
                        rowFive.add(colTwo.get(4));
                        rowFive.add(colThree.get(4));
                        rowFive.add(colFour.get(4));
                        rowFive.add(colFive.get(4));
                        rowFive.add(colSix.get(4));
                        rowFive.add(colSev.get(4));

                        rowSix.add(colOne.get(5));
                        rowSix.add(colTwo.get(5));
                        rowSix.add(colThree.get(5));
                        rowSix.add(colFour.get(5));
                        rowSix.add(colFive.get(5));
                        rowSix.add(colSix.get(5));
                        rowSix.add(colSev.get(5));
                        entireConnectFour.clear();
                        for (String rowOneVal : rowOne) {
                            entireConnectFour.add(rowOneVal);
                        }
                        for (String rowTwoVal : rowTwo) {
                            entireConnectFour.add(rowTwoVal);
                        }
                        for (String rowThreeVal : rowThree) {
                            entireConnectFour.add(rowThreeVal);
                        }
                        for (String rowFourVal : rowFour) {
                            entireConnectFour.add(rowFourVal);
                        }
                        for (String rowFiveVal : rowFive) {
                            entireConnectFour.add(rowFiveVal);
                        }
                        for (String rowSixVal : rowSix) {
                            entireConnectFour.add(rowSixVal);
                        }
                        if (amountInColOne == 6 && amountInColThree == 6 && amountInColFour == 6 && amountInColFive == 6 && amountInColSix == 6 && amountInColSev == 6 && amountInColTwo == 6) {
                            draw = true;
                        }
                        //win condition checks here. Same logic as bot checking
                        for (String colOneChar : colOne) {
                            if (colOneChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colOneChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colTwoChar : colTwo) {
                            if (colTwoChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colTwoChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colThrChar : colThree) {
                            if (colThrChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colThrChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colFouChar : colFour) {
                            if (colFouChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colFouChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colFivChar : colFive) {
                            if (colFivChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colFivChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colSixChar : colSix) {
                            if (colSixChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colSixChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String colSevChar : colSev) {
                            if (colSevChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (colSevChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowOneChar : rowOne) { //This is the win conditions for horizontal.
                            if (rowOneChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowOneChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowOneChar.equals("(x)")) { //resets here because an x in between y and r isn't problem in vertical
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowTwoChar : rowTwo) {
                            if (rowTwoChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowTwoChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowTwoChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowThrChar : rowThree) {
                            if (rowThrChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowThrChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowThrChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowFouChar : rowFour) {
                            if (rowFouChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowFouChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowFouChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowFivChar : rowFive) {
                            if (rowFivChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowFivChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowFivChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }
                        counterYell = 0;
                        counterRed = 0;
                        for (String rowSixChar : rowSix) {
                            if (rowSixChar.equals("(R)")) {
                                counterRed++;
                                counterYell = 0;
                            } else if (rowSixChar.equals("(Y)")) {
                                counterYell++;
                                counterRed = 0;
                            } else if (rowSixChar.equals("(x)")) {
                                counterYell = 0;
                                counterRed = 0;
                            }
                            if (counterYell == 4) {
                                yelWin = true;
                            } else if (counterRed == 4) {
                                redWin = true;
                            }
                        }

                        //diagonal win condition checker
                        for (int horiz = 0; horiz <= 2; horiz++) {
                            for (int verti = 0; verti <= 3; verti++) {

                                int indexWereChecking = 7 * horiz + verti;
                                if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 8).equals("(R)") && entireConnectFour.get(indexWereChecking + 16).equals("(R)") && entireConnectFour.get(indexWereChecking + 24).equals("(R)")) {
                                    redWin = true;
                                } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 8).equals("(Y)") && entireConnectFour.get(indexWereChecking + 16).equals("(Y)") && entireConnectFour.get(indexWereChecking + 24).equals("(Y)")) {
                                    yelWin = true;
                                }
                            }
                        }
                        for (int horiz = 0; horiz <= 2; horiz++) {
                            for (int verti = 3; verti <=6; verti++) {
                                int indexWereChecking = 7 * horiz + verti;
                                if (entireConnectFour.get(indexWereChecking).equals("(R)") && entireConnectFour.get(indexWereChecking + 6).equals("(R)") && entireConnectFour.get(indexWereChecking + 12).equals("(R)") && entireConnectFour.get(indexWereChecking + 18).equals("(R)")) {
                                    redWin = true;
                                } else if (entireConnectFour.get(indexWereChecking).equals("(Y)") && entireConnectFour.get(indexWereChecking + 6).equals("(Y)") && entireConnectFour.get(indexWereChecking + 12).equals("(Y)") && entireConnectFour.get(indexWereChecking + 18).equals("(Y)")) {
                                    yelWin = true;
                                }
                            }
                        }
                        //board's printed out at the very end, printed once per turn with both player and bot moves
                        System.out.println("|1||2||3||4||5||6||7|");
                        for (int i = 0; i < 6; i++) {
                            System.out.print(colOne.get(i));
                            System.out.print(colTwo.get(i));
                            System.out.print(colThree.get(i));
                            System.out.print(colFour.get(i));
                            System.out.print(colFive.get(i));
                            System.out.print(colSix.get(i));
                            System.out.print(colSev.get(i));
                            System.out.println();
                        }

                    }
                    if (yelWin) {
                        System.out.println("yellow, u win");
                    } else if (redWin) {
                        System.out.println("Red, u win");
                    } else {
                        System.out.println("Draw :(");
                    }
                    sc.nextLine();
                    System.out.println("Would you like to play again? Y-N");
                    replayChoice = sc.nextLine();
                    if (replayChoice.equals("N")) {
                        playerReplay = false;
                    }
            }
        }
        sc.close();
    }
}