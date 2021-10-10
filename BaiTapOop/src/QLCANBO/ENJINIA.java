package QLCANBO;

import java.util.Scanner;

public class ENJINIA extends QLCB {
	String nganhdaotao;

	public ENJINIA() {
		super();
	}

	public ENJINIA(String nganhdaotao) {
		super();
		this.nganhdaotao = nganhdaotao;
	}

	public String getNganhdaotao() {
		return nganhdaotao;
	}

	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}
	
	@Override
	void input() {
		
		super.input();
		System.out.println("Nhap nganh ");
    	Scanner scanner = new Scanner(System.in);
    	nganhdaotao= scanner.nextLine();
	}
    @Override
    public String toString() {
    	
    	
    	
    	return super.toString()+", nganh =" +nganhdaotao;
    	
    }
}
