package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

@Test
public void shouldGetAndSet() {
    Conditioner conditioner = new Conditioner();
    String expected = "Кондишн";

    assertNull(conditioner.getName());
    conditioner.setName(expected);
    assertEquals(expected, conditioner.getName());
}




@ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    void shouldIncreaseCurrentTemperature(String test, int maxTemperature, int currentTemperature, int expected) {

    Conditioner conditioner = new Conditioner();

    conditioner.setCurrentTemperature(currentTemperature);
    conditioner.setMaxTemperature(maxTemperature);
    conditioner.increaseCurrentTemperature(currentTemperature);

    assertEquals(expected, conditioner.getCurrentTemperature());
}

@ParameterizedTest
    @CsvFileSource(resources = "/data2.csv")

    void shouldDecreaseCurrentTemperature(String test, int minTemperature, int currentTemperature, int expected) {

    Conditioner conditioner = new Conditioner();

    conditioner.setCurrentTemperature(currentTemperature);
    conditioner.setMinTemperature(minTemperature);
    conditioner.decreaseCurrentTemperature(currentTemperature);

    assertEquals(expected, conditioner.getCurrentTemperature());
}
}