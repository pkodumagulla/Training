
public class manyMeth {
	private String colg;
	public void ColgName(String name){
		colg = name;
	}
	public String getColg(){
		return(colg);
		}
	public void colgDisp(){
		System.out.printf("The name of the college is %s", getColg());
	
	}
	/*
	public void colgDisp(){
	  System.out.println("College name is "+colg);
	*/
}



