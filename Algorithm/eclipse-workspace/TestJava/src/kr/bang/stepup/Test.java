package kr.bang.stepup;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10; // 1. ����
		n=n+5; // 2. ���Թ�
		System.out.println("�ȳ��ϼ���~");
		mmfwefafewfwafewaf(); // 3. method ȣ��, �ڵ��ϼ� - Ctrl+Space
		System.out.println("��� ����~"); // �ڹٿ����� �ܼ�(ǥ�� ����� ��ġ - Ű����, �����) ��� - method ȣ�� - System class�� class�� ����� ���� ���� method ȣ��
	} // end main
	public static void mmfwefafewfwafewaf() {
		System.out.println("mm �޼ҵ��Դϴ�~"); // �� �� ���� - Ctrl+Alt+��)
		System.out.println("mm �޼ҵ��Դϴ�~"); // Ŀ�� ��ġ �� ���� - Ctrl+D
		System.out.println("mm �޼ҵ��Դϴ�~"); // ���õ� �� �̵� - Alt+��
	}
}