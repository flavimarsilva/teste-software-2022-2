import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CE010 {
   @Test
    public void CT010(){
       Assertions.assertThrows(ValoresInvalidosException.class, ()->{
           Avaliacao avaliacao = new Avaliacao();
           avaliacao.avalia(10.00,3.00,3,-1);
       });
    }
}
