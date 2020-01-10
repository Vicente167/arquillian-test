package repository;

import com.airhacks.model.Libro;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class LibroTest {

        @Deployment
        public static WebArchive createDeployment(){
            WebArchive war = ShrinkWrap.create(WebArchive.class)
                    .addClass(Libro.class);


            System.out.println(war.toString(true));

            return war;
        }

        @Test
        public void HelloWorld(){
            System.out.println("esta es una prueba");

            assertTrue(true);

        }



}
