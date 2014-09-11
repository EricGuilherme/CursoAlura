
public class Programa implements Runnable {

    private int id;           

    public void run () {
        for (int i = 0; i < 10; i++) {
            System.out.println("Programa " + id + " valor: " + i);
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
}    




    
