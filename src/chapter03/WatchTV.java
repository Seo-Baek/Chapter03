package chapter03;

public class WatchTV {

	public static void main(String[] args) {
        TV tv = new TV( 7, 20, false);  	
        
        tv.status();	
        
        tv.power( true );   
        tv.volume( 120 );
        tv.status();		          
        
        tv.volume( false ); // ������ 1�� ����Ʈ���� ��.
        tv.status();
        
        tv.channel( 0 );
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true ); // ä���� 1�� �ø� ��.
        tv.status();

        tv.power( false );
        tv.status();      
		
		
	}

}
