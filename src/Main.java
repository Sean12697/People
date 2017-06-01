
public class Main {

	public static void main(String[] args) {
		Man man = new Man("Adam");
		Woman woman = new Woman("Eve");
		
		if (woman.isBeatifull()) {
			man.propose(woman);
			
			if (man.isRich()) {
				woman.acceptProposal(man);
				man.insertInto(woman);
			} else {
				man.fap();
			}
		} else {
			if (man.isDrunk()) {
				man.propose(woman);
				
				if (man.isRich()) {
					woman.acceptProposal(man);
					man.insertInto(woman);
					// Next morning
					man.ohGodWhy();
				} else {
					man.fap();
				}
			}
		}
	}

}
