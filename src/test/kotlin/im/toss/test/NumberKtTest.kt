package im.toss.test

import org.junit.jupiter.api.Test

internal class TestKtTest {

    @Test
    fun hello() {
        number(1).equalsTo("하나")
        number(3).equalsTo("셋")
        number(999).equalsTo("모름")
    }
}