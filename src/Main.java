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
        ArrayList<String> rowSix = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            colOne.add("(x)");
            colTwo.add("(x)");
            colThree.add("(x)");
            colFour.add("(x)");
            colFive.add("(x)");
            colSix.add("(x)");
            colSev.add("(x)");

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
                for (int verti = 3; verti <=6; verti++) {
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
        sc.close();
    }
}
