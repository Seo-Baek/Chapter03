package chapter03;

public class WatchTV {

	public static void main(String[] args) {
        TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );   
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false ); // 볼륨을 1씩 떨어트리는 것.
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true ); // 채널을 1씩 올린 것.
        tv.status();

        tv.power( false );
        tv.status();      
		
		
	}

}
