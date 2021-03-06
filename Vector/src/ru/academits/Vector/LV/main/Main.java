package ru.academits.Vector.LV.main;

import ru.academits.Vector.LV.vector.Vector;

import static ru.academits.Vector.LV.vector.Vector.*;

public class Main {
    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 3, 4, 5};
        double[] array2 = new double[]{7, 8, 9};
        double[] array3 = new double[]{1, 6, 10};

        try {
            Vector vector1 = new Vector(array1);
            Vector vector2 = new Vector(array2);

            System.out.printf("Vector1 and vector2 sizes are %s and %s %n", vector1.getSize(), vector2.getSize());
            System.out.printf("Vector1 and vector2 are %s and %s %n%n", vector1.toString(), vector2.toString());

            Vector additionVector = new Vector(array1);
            System.out.printf("Sum res is %30s%n", additionVector.addToVector(vector2));

            Vector subtractionVector = new Vector(array1);
            System.out.printf("Sub res is %31s%n", subtractionVector.subtractFromVector(vector2));

            Vector multiplicationScalar = new Vector(array1);
            System.out.printf("Scalar res is %s%n%n", multiplicationScalar.multiplyByScalar(5));

            Vector vectorReverse = new Vector(array1);
            System.out.printf("Reverse res is %44s%n", vectorReverse.reverse());

            System.out.printf("Length res are %18.2f and %.2f%n", vector1.getLength(), vector2.getLength());

            Vector componentChange = new Vector(array1);
            componentChange.setComponentByIndex(3, 100);

            System.out.printf("Component change by index is %s%n", componentChange.getComponentByIndex(3));
            System.out.printf("Change checking is %37s%n%n", componentChange.toString());

            System.out.println("Static methods checking:");
            System.out.printf("Sum is %s %n", getSum(vector1, vector2));
            System.out.printf("Sub is %s %n", getSubtraction(vector1, vector2));
            System.out.printf("Mul is %s %n%n", getScalarMultiplication(vector1, vector2));

            //to check not used constructors during checking of methods:
            Vector vector3 = new Vector(3);
            System.out.printf("Constructor checking: %s%n", vector3.toString());
            Vector vector4 = new Vector(2, array3);
            System.out.printf("Constructor checking: %s%n", vector4.toString());

        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.out.println("Error during the program executing: " + e.getMessage());
        }
    }
}

    /*    //determinant:
    public double getDeterminant() {
        if (rows.length != getColumnsCount()) {
            throw new IllegalArgumentException("Матрица должна быть квадратной.");
        }

        Matrix copyOfMatrix = new Matrix(this);

        for (int i = 0; i < copyOfMatrix.getColumnsCount(); i++) {
            boolean isNullColumn = false;
            int j = i;
            while (copyOfMatrix.rows[j].getComponentByIndex(i) == 0) {
                if (j == copyOfMatrix.rows.length - 1) {
                    isNullColumn = true;
                    break;
                }
                j++;
            }
            if (isNullColumn) {
                continue;
            }

            Vector tempVector = copyOfMatrix.rows[j];
            copyOfMatrix.rows[j] = copyOfMatrix.rows[i];
            copyOfMatrix.rows[i] = tempVector;

            for (int k = i + 1; k < copyOfMatrix.rows.length; k++) {
                double coefficient = copyOfMatrix.rows[k].getComponentByIndex(i) / copyOfMatrix.rows[i].getComponentByIndex(i);
                Vector tempRaw = new Vector(copyOfMatrix.rows[i]);
                tempRaw.multiplyByScalar(coefficient);
                copyOfMatrix.rows[k].subtractFromVector(tempRaw);
            }
        }
        double determinant = 1;
        for (int i = 0; i < copyOfMatrix.rows.length; i++) {
            determinant *= copyOfMatrix.rows[i].getComponentByIndex(i);
        }
        return determinant;
    */