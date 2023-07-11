import java.util.Scanner;

class BoardVo {//게시글 객체
	private int num;
	private String title;
	private String content;
	private String writer;
	private String registDate;
	
	public int getNum() {
		return num;
	}
	
	public void setNum() {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String writer) {
		this.writer = writer;
	}
	
	public String getRegistDate() {
		return registDate;
	}
	
	public void setRegistDate(String registDate) {
		this.registDate= registDate;
	}
	
	
}

public class Java_Project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력받은 객체
		BoardDAO dao = new BoardDAO();//게시판 접근 개체
		
		//게시판 프로그램
		while(true) {
			dao.getBoardList();
			int answer = Integer.parseInt(scanner.nextLine());
			
			if(answer ==1) { 
				dao.boardInsert();
			}else if(answer == 2) {
				System.out.println("보고싶은 게시글 번호를 선택하세요. >>");
				int select = Integer.parseInt(scanner.nextLine());
				dao.boardDetail(select);
			}else if(answer == 3) {
				System.out.println("수정할 글 번호를 선택하세요. >>");
				int select = Integer.parseInt(scanner.nextLine());
				dao.boardDetail(select);
			}else if(answer == 4) {
				System.out.println("삭제할 글 번호를 선택하세요. >>");
				int select = Integer.parseInt(scanner.nextLine());
				dao.boardDetail(select);
			}else if(answer == 5) {
				System.out.println("1.파일 읽기, 2.파일쓰기[덮어쓰기]");
				int select = Integer.parseInt(scanner.nextLine());
				if(answer == 1) {
					dao.txtRead();
				}else if(answer == 2) {
					dao.txtWrite();
				}else {
					System.out.println("파일 초리 종료");
				}
			}
		System.out.println("게시판 프로그램이 종료되었습니다.");
		}
		
		
		
		
		

	}

}
