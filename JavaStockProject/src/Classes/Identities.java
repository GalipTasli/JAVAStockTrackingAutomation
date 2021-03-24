package Classes;

public class Identities {

    public static class Id {
    
        private static int id = -1;
 
        public static void setId( int id)
        {
            Identities.Id.id=id;
        }
        public static int getId()
        {
            return id;
        }
    }
    
}
