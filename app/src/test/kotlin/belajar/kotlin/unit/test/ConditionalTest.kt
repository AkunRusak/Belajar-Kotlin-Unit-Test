package belajar.kotlin.unit.test

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.*

class ConditionalTest {
    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun enableOnWindowsOrLinux(){
        // only run on windows
    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disableOnWindows(){
        // can not run on windows
    }

    @Test
    @EnabledOnJre(value = [JRE.JAVA_21])
    fun onlyRunOnJava21(){

    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_21])
    fun disableRunOnJava21(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_21)
    fun onlyRunOnJava14ToJava21(){
        // put your unit test
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_14, max = JRE.JAVA_21)
    fun disabledRunOnJava11ToJava21(){
        // put your unit test
    }

    @Test
    fun printSystemProperties(){
        System.getProperties().forEach { key, value ->
            println("$key => $value")
        }
    }

    @Test
    @EnabledIfSystemProperties(value = [
        EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun enabledOnOracle(){

    }

    @Test
    @DisabledIfSystemProperties(value = [
        DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun disabledOnOracle(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun enableOnDev(){

    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun disabledOnDev(){

    }
}