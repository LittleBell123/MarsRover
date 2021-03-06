import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void should_return_0_1_N_when_given_init_position_0_0_N_and_commands_M() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"N");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("M");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(1));
        assertThat(resultPosition.getDirection(),is("N"));
    }

    @Test
    public void should_return_0_negative_1_S_when_given_init_position_0_0_S_and_commands_M() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"S");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("M");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(-1));
        assertThat(resultPosition.getDirection(),is("S"));
    }

    @Test
    public void should_return_1_0_E_when_given_init_position_0_0_E_and_commands_M() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"E");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("M");
//      then
        assertThat(resultPosition.getCoordinateX(),is(1));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("E"));
    }

    @Test
    public void should_return_negative_1_0_W_when_given_init_position_0_0_W_and_commands_M() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"W");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("M");
//      then
        assertThat(resultPosition.getCoordinateX(),is(-1));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("W"));
    }

    @Test
    public void should_return_0_0_E_when_given_init_position_0_0_N_and_commands_R() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"N");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("R");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("E"));
    }

    @Test
    public void should_return_0_0_S_when_given_init_position_0_0_E_and_commands_R() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"E");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("R");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("S"));
    }

    @Test
    public void should_return_0_0_W_when_given_init_position_0_0_S_and_commands_R() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"S");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("R");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("W"));
    }

    @Test
    public void should_return_0_0_N_when_given_init_position_0_0_W_and_commands_R() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"W");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("R");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("N"));
    }

    @Test
    public void should_return_0_0_W_when_given_init_position_0_0_N_and_commands_L() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"N");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("L");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("W"));
    }

    @Test
    public void should_return_0_0_N_when_given_init_position_0_0_E_and_commands_L() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"E");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("L");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("N"));
    }

    @Test
    public void should_return_0_0_E_when_given_init_position_0_0_S_and_commands_L() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"S");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("L");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("E"));
    }

    @Test
    public void should_return_0_0_S_when_given_init_position_0_0_W_and_commands_L() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"S");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("L");
//      then
        assertThat(resultPosition.getCoordinateX(),is(0));
        assertThat(resultPosition.getCoordinateY(),is(0));
        assertThat(resultPosition.getDirection(),is("E"));
    }

    @Test
    public void should_return_negative_1_negative_1_W_when_given_init_position_0_0_W_and_commands_MLMR() {
//      given
        MarsRover marsRover = new MarsRover(0,0,"W");
//      when
        MarsRoverPosition resultPosition = marsRover.receiveCommands("MLMR");
//      then
        assertThat(resultPosition.getCoordinateX(),is(-1));
        assertThat(resultPosition.getCoordinateY(),is(-1));
        assertThat(resultPosition.getDirection(),is("W"));
    }
}
