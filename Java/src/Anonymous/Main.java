package Anonymous;

public class Main {

	public static void main(String[] args) {
		// tao doi tuong interface
		PersionService persionService = new PersionService() { // class nay la interface nam trong bo nho heap, dau ngoac la contructor
			
			@Override
			public void hello() {
				System.out.println("Xin chao");
				
			}
		};
		
		persionService.hello();
		xinchao xinchao = new xinchao() {
			@Override
			void xinchao() {
				// TODO Auto-generated method stub
				super.xinchao();
			}
		}; 
		xinchao.xinchao();
	}

}

abstract class xinchao{
	public void xinchao()
	{
		System.out.println("Hello");
	}
}
