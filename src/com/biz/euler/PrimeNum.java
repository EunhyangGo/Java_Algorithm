package com.biz.euler;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum =3324;
		for(int i = 2; i<3324 ; i++) {
			if(intNum % i == 0) {
				System.out.println("�Ҽ� �ƴ�");
				break;
				
			}
		}

		intNum = (int)(Math.random() * (100-2+1)) +2 ;
		int j = 2 ;
		for(; j <intNum; j++) {
			if(intNum % j ==0) break; //2�γ����� 0�̳����� �����
			
		}
		//���� for���� �ߴܵǰų� �Ϸ�Ǿ����� j�� ���� �˻��ϸ� intNum�� 
		//�Ҽ����� �ƴ����� �Ǵ��� �� �ִ�.
		if(j >= intNum) {
			System.out.println(intNum + "�� �Ҽ� �Դϴ�.");
			
		}else {
			System.out.println(intNum + "�� �Ҽ��� �ƴմϴ�.");
		}
		System.out.println(j);
		
		for(int num =2; num <100; num++) {
			int index =0;
			for(index=2; index <num; index++) {
				if( num%index == 0) break;
			}
			if(index >= num) {
				System.out.println(num + "�� �Ҽ��Դϴ�");
				//System.out.println(num + "");
			
			}
			
		}
	}

}
