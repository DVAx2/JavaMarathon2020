package day4;
/*
1
Показываю матрицу из 5 строк и 7 столбцов
2,3,1,2,3,1,2,
1,1,1,3,3,1,4,
2,3,1,3,3,4,3,
3,4,2,2,4,4,4,
3,3,2,2,3,1,2,

В строке 2 найдено несколько, подряд идущих 1, их сумма = 3
В строке 2 найдено несколько, подряд идущих 3, их сумма = 6

В строке 3 найдено несколько, подряд идущих 3, их сумма = 6

В строке 4 найдено несколько, подряд идущих 2, их сумма = 4
В строке 4 найдено несколько, подряд идущих 4, их сумма = 12

В строке 5 найдено несколько, подряд идущих 3, их сумма = 6
В строке 5 найдено несколько, подряд идущих 2, их сумма = 4

В столбце 1 найдено несколько, подряд идущих 3, их сумма = 6


В столбце 3 найдено несколько, подряд идущих 1, их сумма = 3
В столбце 3 найдено несколько, подряд идущих 2, их сумма = 4

В столбце 4 найдено несколько, подряд идущих 3, их сумма = 6
В столбце 4 найдено несколько, подряд идущих 2, их сумма = 4

В столбце 5 найдено несколько, подряд идущих 3, их сумма = 9

В столбце 6 найдено несколько, подряд идущих 1, их сумма = 2
В столбце 6 найдено несколько, подряд идущих 4, их сумма = 8

 */
public class Test {
    public static void main(String args[]){
        /*public class Matrix {
            private static int row;
            private static int colomn;
            private static int countCells;
            private static int [] arrTmp;// = new int[row*colomn];

            public Matrix(int [][] externalMatrix) {
                row = externalMatrix.length;
                colomn = externalMatrix[row - 1].length;
                countCells = row*colomn;
                arrTmp = new int[countCells];

                int tmpIndex = 0;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < colomn; j++) {
                        arrTmp[tmpIndex++] = externalMatrix[i][j];
                    }
                }
            }

            public static void showMatrix() {
                System.out.println("Показываю матрицу из " + row + " строк и " + colomn + " столбцов");
                int tmpIndex = 0;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < colomn; j++) {
                        System.out.print(arrTmp[tmpIndex++] + ",");
                    }
                    System.out.println();
                }
            }

            public static void analizRow(int rowForAnaliz) {
                int tmpRow = rowForAnaliz - 1;
                int summaEqualElem = 0;
                int count = 0;
                for (int i = 0; i < colomn - 1; i++) {
                    if(arrTmp[tmpRow*colomn + i] == arrTmp[tmpRow*colomn + (i + 1)]) {
                        count++;
                    }
                    else {
                        if (count!=0) {
                            summaEqualElem = (count + 1) * arrTmp[tmpRow * colomn + i];
                            System.out.println("В строке " + rowForAnaliz +
                                    " найдено несколько, подряд идущих " + arrTmp[tmpRow*colomn + i] +
                                    ", их сумма = " + summaEqualElem);
                        }
                        count = 0;
                    }
                    if (count!=0 && (i + 2) == colomn) {
                        summaEqualElem = (count + 1) * arrTmp[tmpRow * colomn + i];
                        System.out.println("В строке " + rowForAnaliz +
                                " найдено несколько, подряд идущих " + arrTmp[tmpRow*colomn + i] +
                                ", их сумма = " + summaEqualElem);
                    }
                }
                System.out.println();
            }

            public static void analizColomn(int colomnForAnaliz) {
                int tmpCol = colomnForAnaliz - 1;
                int summaEqualElem = 0;
                int count = 0;
                for (int i = 0; i < row - 1; i++) {
                    if(arrTmp[colomn*i + tmpCol] == arrTmp[colomn*(i + 1) + tmpCol]) {
                        count++;
                    }
                    else {
                        if (count!=0) {
                            summaEqualElem = (count + 1) * arrTmp[colomn * i + tmpCol];
                            System.out.println("В столбце " + colomnForAnaliz +
                                    " найдено несколько, подряд идущих " + arrTmp[colomn*i + tmpCol] +
                                    ", их сумма = " + summaEqualElem);
                        }
                        count = 0;
                    }
                    if (count!=0 && (i + 2) == row) {
                        summaEqualElem = (count + 1)*arrTmp[colomn*i + tmpCol];
                        System.out.println("В столбце " + colomnForAnaliz +
                                " найдено несколько, подряд идущих " + arrTmp[colomn*i + tmpCol] +
                                ", их сумма = " + summaEqualElem);
                    }
                }
                System.out.println();
            }

            public static void main(String[] args) {
                int [][] matr = {
                        {2,3,1,2,3,1,2},
                        {1,1,1,3,3,1,4},
                        {2,3,1,3,3,4,3},
                        {3,4,2,2,4,4,4},
                        {3,3,2,2,3,1,2},
                };
                Matrix extMatrN_M = new Matrix(matr);
                showMatrix();
                for (int i = 0; i < row; i++) {
                    analizRow(i + 1);
                }
                for (int i = 0; i < colomn; i++) {
                    analizColomn(i + 1);
                }
            }
        }*/
    }
}

