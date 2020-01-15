package com.exesandohs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExesAndOhsTest {

    private ExesAndOhs exesAndOhs = new ExesAndOhs();

    @Test
    public void test1() {

        assertThat(exesAndOhs.checkXO("xxxooo")).isTrue();
    }

    @Test
    public void test2() {

        assertThat(exesAndOhs.checkXO("xxxXooOo")).isTrue();
    }

    @Test
    public void test3() {
        assertThat(exesAndOhs.checkXO("xxx23424xXXOOooo")).isFalse();
    }

    @Test
    public void test4() {

        assertThat(exesAndOhs.checkXO("xXxxoewrcoOoo")).isFalse();
    }

    @Test
    public void test5() {
        assertThat(exesAndOhs.checkXO("XxxxooO")).isFalse();
    }

    @Test
    public void test6() {

        assertThat(exesAndOhs.checkXO("zssddd")).isTrue();
    }

    @Test
    public void test7() {
        assertThat(exesAndOhs.checkXO("Xxxxertr34")).isFalse();
    }

    @Test
    public void test8() {
        assertThat(exesAndOhs.checkXO("xxxOOO")).isTrue();
    }
    @Test
    public void test9() {
        assertThat(exesAndOhs.checkXO("xxxOOO")).isTrue();
    }
    @Test
    public void imputIsEmpty() {

        assertThat(exesAndOhs.checkXO("")).isTrue();
    }
}
