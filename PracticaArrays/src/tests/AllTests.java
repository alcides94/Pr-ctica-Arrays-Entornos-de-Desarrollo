package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ maximaNota.class, medianasNota.class, mediaNota.class, minimaNota.class })
public class AllTests {

}
