public class interfaces {
     
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        rook r = new rook();
        r.moves();


    }
}
interface Chess {
        void moves();
    }
    class  Queen implements Chess{
        public void moves(){
            System.out.println("in any direction");
        }
    }
    class rook implements Chess{
        public void moves(){
            System.out.println("straight");
            
        }
    }
