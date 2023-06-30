package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VacationRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files= "src/test/resources/bases.csv")
    public void VacationRestCalcWithParams() {
        VacationRestService service = new VacationRestService();
        //  данные:
        int actual = service.calculate(10000,3000,20000);
        int expected= 3;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}