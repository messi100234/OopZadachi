package zadacha1;

public class Worker extends Human implements Comparable{
		public int nadnica;
		public int chasove;
	public Worker(String name, String lastName,int nadnica,int chasove) {
		super(name, lastName);
		this.nadnica=nadnica/8;
		this.chasove=chasove;
		// TODO Auto-generated constructor stub
	}
	
	public int getNadnica() {
		int izchislenie = nadnica/chasove;
		return izchislenie;
	}
	
	public int getZaplata() {
		int zaplata = nadnica*chasove;
		return zaplata;
	}

	@Override
	public int compareTo(Object o) {
		if(this.getZaplata()< ((Worker) o).getZaplata()) {
			return 1;
		}else if(this.getZaplata() > ((Worker) o).getZaplata()) {
			return -1;
		}else
		// TODO Auto-generated method stub
		return 0;
	}

}
