package zad8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class ConfectionerTest {

    @Mock
    private Flour flour;

    @Test
    void shouldReturnRecipeWithOnlyFlourTest(){
        Mockito
                .when(flour.getPortion())
                .thenReturn("20g ");

//        Flour flour1 = new Flour();

        Confectioner confectioner = new Confectioner(flour);

        String cakeRecipe = confectioner.createCake();

        org.assertj.core.api.Assertions
                .assertThat(cakeRecipe)
                .isEqualTo("Recipe: 20g ")
                .startsWith("Recipe:")
                .contains(": ")
                .doesNotContainOnlyWhitespaces();


        org.junit.jupiter.api.Assertions
                .assertEquals("Recipe: 20g ", cakeRecipe);
    }


}