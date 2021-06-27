import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClubTest {
    @Test
    public void NomDuClubParDefaut(){
        Club c = new Club();
        assertEquals("new club", c.getNom());

    }

    @Test
    public void NomDuClub(){
        String nom = "Afsoi";
        Club c = new Club(nom, 12);
        assertEquals(nom, c.getNom());
    }

    @Test
    public void ModifierCapacite(){
        Club c = new Club("Afsoi", 12);
        assertEquals(12, c.getCapacite());
        c.setCapacite(32);
        assertEquals(32, c.getCapacite());
    }
}
