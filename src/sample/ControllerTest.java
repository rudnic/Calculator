package sample;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    // Тестирование перевода из двоичной системы в десятичную
    @org.junit.jupiter.api.Test
    void transformation_from_bin_to_dec() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("10", 2, 10), "2");
    }

    // Тестирование перевода из двоичной системы в шестнадцатеричную
    @org.junit.jupiter.api.Test
    void transformation_from_bin_to_hex() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("1010", 2, 16), "A");
    }

    // Тестирование перевода из двоичной системы в восьмиричную
    @org.junit.jupiter.api.Test
    void transformation_from_bin_to_oct() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("1000", 2, 8), "10");
    }

    // Тестирование перевода из десятичной системы в восьмиричную
    @org.junit.jupiter.api.Test
    void transformation_from_dec_to_oct() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("9", 10, 8), "11");
    }

    // Тестирование перевода из десятичной системы в двоичную
    @org.junit.jupiter.api.Test
    void transformation_from_dec_to_bin() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("10", 10, 2), "1010");
    }

    // Тестирование перевода из десятичное системы в шестнадцатеричную
    @org.junit.jupiter.api.Test
    void transformation_from_dec_to_hex() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("15", 10, 16), "F");
    }

    // Тестирование перевода из восьмиричной системы в двоичную
    @org.junit.jupiter.api.Test
    void transformation_from_oct_to_bin() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("10", 8, 2), "1000");
    }

    // Тестирование перевода из восьмиричной системы в десятичную
    @org.junit.jupiter.api.Test
    void transformation_from_oct_to_dec() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("10", 8, 10), "8");
    }

    // Тестирование перевода из восьмиричной системы в шестнадцатеричную
    @org.junit.jupiter.api.Test
    void transformation_from_oct_to_hex() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("20", 8, 16), "10");
    }

    // Тестирование перевода из шестнадцатеричной системы в десятичную
    @org.junit.jupiter.api.Test
    void transformation_from_hex_to_dec() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("A", 16, 10), "10");
    }

    // Тестирование перевода из шестнадцатеричной системы в двоичную
    @org.junit.jupiter.api.Test
    void transformation_from_hex_to_bin() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("A", 16, 2), "1010");
    }

    // Тестирование перевода из шестнадцатеричной системы в восьмиричную
    @org.junit.jupiter.api.Test
    void transformation_from_hex_to_oct() {
        Controller controller = new Controller();
        Assert.assertEquals(controller.transformation("F", 16, 8), "17");
    }

}