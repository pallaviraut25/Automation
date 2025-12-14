package exception;

public class Exception1 {

	public static void main(String[] args) throws Throwable {

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			try {
				Thread.sleep(600);
			} catch (Exception e1) {
				try {
					Thread.sleep(700);
				} catch (InterruptedException e2) {
					Thread.sleep(68);
					e2.printStackTrace();
				}
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			System.out.println("Handled Above Exception");
		}
	}

}
