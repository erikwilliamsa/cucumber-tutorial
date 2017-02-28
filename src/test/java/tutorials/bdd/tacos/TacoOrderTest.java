package tutorials.bdd.tacos;


import cucumber.api.java8.En;
import static org.junit.Assert.assertEquals;

/**
 * Created by erikwilliams on 1/23/17.
 */
public class TacoOrderTest implements En {

    public TacoOrderTest() {
        TacoOrder tm = new TacoOrder();
        Given("^I am taking a taco order$", () -> {
            // Write code here that turns the phrase above into concrete actions

        });

        When("^when (\\d+) tacos are ordered$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            tm.setTotalTacos(arg1);
            System.out.println("Set: " +tm.getTotalNumberOfTacos());
        });

        Then("^then the total number of tacos should equal (\\d+)$", (Integer arg1) -> {

            System.out.println("Expected: " +arg1);
            System.out.println("Actual: " +tm.getTotalNumberOfTacos());
            assertEquals(arg1.intValue(), tm.getTotalNumberOfTacos());

        });

        When("^(\\d+) soft shell tacos and (\\d+) hard shell tacos are selected$", (Integer softshell, Integer hardshell) -> {
            tm.setShellTypes(softshell,hardshell);

        });

        Then("^there should be a total of (\\d+) tacos with (\\d+) being hard shell and (\\d+) being soft shell\\.$", (Integer total, Integer hardshell, Integer softshell) -> {
            assertEquals(tm.getHardShellCount(),hardshell.intValue());
            assertEquals(softshell.intValue(), tm.getSoftShellCount());
            assertEquals(total.intValue(),tm.getTotalNumberOfTacos());
            //assertTrue(false);
        });


    }

}
