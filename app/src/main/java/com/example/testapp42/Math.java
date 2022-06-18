package com.example.testapp42;

public class Math {
    public String add(String a, String b) {
        String result;
        if (a == null || b == null) {
            result = "Error";
        } else if (a.contains(".") || b.contains(".")) {
            result = "Только целые числа";
        } else if (a.contains(" ") || b.contains(" ")) {
            result = "C пробелами нельзя";
        } else if (isNumeric(a) && isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            if (num1 < 0 || num2 < 0) {
                result = "Отрицательные числа нельзя";
            } else {
                result = String.valueOf(num1 + num2);
            }
        } else {
            result = "Буквы складывать нельзя";
        }
        return result;
    }


    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int divide(int a,int b){
        if (b == 0){
            throw new IllegalArgumentException("0 не может делен число");
        }
     return a / b;
    }

}

