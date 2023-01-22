package com.example.my1application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Имеется несколько товаров для делового гардероба с ценами и размерами
     * скидок:
     * o пальто - 70 серебряных монет ( + скидка 77%)
     * o шляпа - 25 серебряных монет ( + скидка 37%)
     * o деловой̆костюм - 53 серебряных монет ( + скидка 44%
     * o сорочка - 19 серебряных монет (нет скидки);
     * o туфли - 41 серебряная монета ( + скидка 32%)
     * На счету имеется 312 серебряных монет
     * Необходимо рассчитать, хватит ли имеющихся средств для покупки делового
     * гардероба. Ответ необходимо вывести на экран приложения
     * Результаты приложения необходимо выложить в собственный̆ репозиторий
     * Гитхаба или сделать скриншоты получившегося экрана
     */

    private int cash = 312;

    private int Palto = 70;
    private int PaltoDisc = 77;

    private int hat = 25;
    private int hatDisc = 37;

    private int costume = 53;
    private int costumeDisc = 44;

    private int sorochka = 19;
    private int sorochkaDisc = 0;

    private int boots = 41;
    private int bootsDisc = 32;

    public boolean canbuylook() {
        float result;

        result = (Palto * PaltoDisc + hat * hatDisc + costume * costumeDisc
                + sorochkaDisc * sorochka + bootsDisc * boots) / 100;

        result = cash - result;

        if (result<0) return false;
        else return true;


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

        boolean flag = canbuylook();
        if (flag == true) {
            txt.setText("Вам хватает денег на одежду");
        } else {
            txt.setText("Нужно больше золота!");
        }

    }
}