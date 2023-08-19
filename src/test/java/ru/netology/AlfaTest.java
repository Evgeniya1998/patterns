package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AlfaTest {
    @Test
    public void Test() {
        open("http://localhost:9999");
    }
}
