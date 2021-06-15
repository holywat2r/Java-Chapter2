package ch08;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	//늘어날 수 있는 버퍼를 가진 클래스에다가 
	private String line = "===============================\n";
	private String title = " 이름 \t	주소 \t\t 전화번호 \n";
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
	
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-8888\n");
		
	
	}
	private void makeFooter()
	{
		buffer.append(line);
	}
	 // 클라이언트에게 오픈해 봤자 크게 소용 없는 것들. 
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	} // Header Body Footer 순서대로 출
}
