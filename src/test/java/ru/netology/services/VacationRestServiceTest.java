package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.VacationRestService;

public class VacationRestServiceTest {
    @Test
    public void VacationRestCalc() {
        VacationRestService service = new VacationRestService();

        //  данные:
        int actual = service.calculate(10000,3000,20000);
        int expected= 3;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void VacationRestCalc2() {
        VacationRestService service = new VacationRestService();

        // данные
        int actual = service.calculate(100000,60000,150000);
        int expected = 2;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}