package chapter02;

public class WatchTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false );
        tv.status();
        
        tv.channel( 0 );
        tv.status();	
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        tv.status();

        tv.power( false );
        tv.status();      
        
        System.out.println("볼륨은 로테이션하면 말이안된다.");
    }
}

