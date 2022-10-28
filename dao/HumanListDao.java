package com.human.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.HumanDto;
import com.human.util.UserInput;

public class HumanListDao {
	// arrayList를 사용하려면 객체에 equlas를 추가해야 한다.
	//데이터 선언
	private ArrayList<HumanDto> dtos = new ArrayList<HumanDto>();
//	private HumanDto[] dtos = new HumanDto[10];
//	private int totalCount = 0;
		
		
		//데이터 초기화 init
		public void init() {
		dtos.add(new HumanDto("홍길동", 30, 152.1, 
				LocalDateTime.parse("2000-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		dtos.add(new HumanDto("홍길남", 31, 156.4, 
				LocalDateTime.parse("2001-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		dtos.add(new HumanDto("홍길영", 30, 173.5, 
				LocalDateTime.parse("2000-12-21 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		}
		
		public void select() {
			//select
			System.out.println("Select");
			for(HumanDto dto:dtos) {
				dto.myPrint();
			}
//			for(int i=0; i<dtos.size(); i++) {
//				dtos.get(i).myPrint();
//			}
		}
		
		public void select(double height) {
			//키가 155이상인 사람 출력
			System.out.println("select height XXX 이상");
			for(HumanDto dto:dtos) {
				if(dto.getHeight()>height) {
					dto.myPrint();
				}
			}
		}
		
		public void insert(HumanDto dto) {
			dtos.add(dto);
		}
		
		public void update(String name, int age) {
			System.out.println("Update name, age");//홍길남 50세로 변경
			for(int i=0; i<dtos.size(); i++) {
				if(dtos.get(i).getName().equals(name)) {
					dtos.get(i).setAge(age);
				} 
			}
		}
		
		public void delete(int age) {
			System.out.println("delete 나이 age이하 삭제");
			for(int i=0; i<dtos.size(); i++) {
				if(dtos.get(i).getAge()<age) {
					dtos.remove(i);
					i--;
				}
			}
		}
		public static void startMenu2() {
			HumanListDao dao = new HumanListDao();
			boolean isFlag = true;
			while(isFlag) {
				System.out.println("human관리 프로그램");
				System.out.println("1. test값 입력 2.select 3.select(height)");
				System.out.println("4. insert(dto) 5.update(name, age)");
				System.out.println("6.delete(age) 7.exit");
				int input = UserInput.inputInt("선택");
				switch(input) {
				case 1:
					dao.init();
					System.out.println("test값을 입력하였습니다.");
					break;
				case 2:
					dao.select();
					System.out.println("select 작업이 종료되었습니다.");
					break;
				case 3:
					System.out.println("입력한 height값보다 큰 학생을 출력할 예정입니다");
					double height=UserInput.inputDouble("height를 입력하세요");
					dao.select(height);
					break;
				case 4:
					
					System.out.println("입력하고자하는 Human데이터 입력");
					
					HumanDto dto = new HumanDto();
			
					dto.setName(UserInput.inputString("이름"));
					dto.setAge(UserInput.inputInt("나이"));
					dto.setHeight(UserInput.inputDouble("키"));
					dto.setBirthday(UserInput.inputLocalDateTime("생일"));
					
					dao.insert(dto);
					break;	
				case 5:
					System.out.println("특정 name으로 age변경");
					String name=UserInput.inputString("이름 :");
					int age = UserInput.inputInt("나이 : ");
					dao.update(name, age);
					break;
				case 6:
					System.out.println("입력한 나이보다 작은 데이터 삭제");
					dao.delete(UserInput.inputInt("나이 :"));
					break;
				default:
					System.out.println("프로그램 종료");
					isFlag=false;
				}
				
			}
			
		}
		
		public static void startMenu() {
			HumanListDao dao = new HumanListDao();
			boolean isFlag = true;
			while(isFlag) {
				System.out.println("human관리 프로그램");
				System.out.println("1. test값 입력 2.select 3.select(height)");
				System.out.println("4. insert(dto) 5.update(name, age)");
				System.out.println("6.delete(age) 7.exit");
				int input = UserInput.inputInt("선택");
				switch(input) {
				case 1:
					dao.init();
					System.out.println("test값을 입력하였습니다.");
					break;
				case 2:
					dao.select();
					System.out.println("select 작업이 종료되었습니다.");
					break;
				case 3:
					System.out.println("입력한 height값보다 큰 학생을 출력할 예정입니다");
					double height=UserInput.inputDouble("height를 입력하세요");
					dao.select(height);
					break;
				case 4:
					
					System.out.println("입력하고자하는 Human데이터 입력");
					
					HumanDto dto = new HumanDto();
			
					dto.setName(UserInput.inputString("이름"));
					dto.setAge(UserInput.inputInt("나이"));
					dto.setHeight(UserInput.inputDouble("키"));
					dto.setBirthday(UserInput.inputLocalDateTime("생일"));
					
					dao.insert(dto);
					break;	
				case 5:
					System.out.println("특정 name으로 age변경");
					String name=UserInput.inputString("이름 :");
					int age = UserInput.inputInt("나이 : ");
					dao.update(name, age);
					break;
				case 6:
					System.out.println("입력한 나이보다 작은 데이터 삭제");
					dao.delete(UserInput.inputInt("나이 :"));
					break;
				default:
					System.out.println("프로그램 종료");
					isFlag=false;
				}
				
			}
			
		}
		
		
}
