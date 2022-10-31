package com.human.ex;

import com.human.dao.HumanListDao;
import com.human.dto.HumanDto;
import com.human.util.UserInput;

public class HumanProject {

	public static void main(String[] args) {
		// 1. dto 만들기 - 데이터베이스에서 가져온 데이터를 담는 클래스
		// 2. dao 만들기 - 데이터베이스 crud 작업을 담당하는 클래스
		// 3. UserInput - 사용자입력을 도와주는 클래스
		// 4. main메소드에서 관리형 프로그램 만들기
		// 5. service 추가하기 dao작업 + 비지니스 로직(핵심로직)
		
		HumanListDao dao = new HumanListDao();
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("");
			System.out.println("");
			System.out.println("human관리 프로그램");
			System.out.println("1. test값 입력 2.select 3.select(height)");
			System.out.println("4. insert(dto) 5.update(name, age)");
			System.out.println("6.delete(age) 7.exit");
			int input = UserInput.inputInt("선택");
			switch (input) {
			case 1:
				dao.init();
				System.out.println("test값을 입력하였습니다.");
				break;
			case 2:
				System.out.println("전체 데이터 출력>>");
				for (HumanDto dto : dao.select()) {
//					System.out.println(dto);
					System.out.println("이름 : " + dto.getName() + " 나이 : " + dto.getAge() 
					+ " 키 : " + dto.getHeight() + " 생년월일 : " + dto.getBirthday());
				}
				System.out.println("select 작업이 종료되었습니다.");
				break;
			case 3:
				System.out.println("입력한 height값보다 큰 학생을 출력할 예정입니다");
				double height = UserInput.inputDouble("height를 입력하세요");
				for (HumanDto dto : dao.select(height)) {
					System.out.println(dto);
				}

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
				String name = UserInput.inputString("이름 :");
				int age = UserInput.inputInt("나이 : ");
				dao.update(name, age);
				break;
			case 6:
				System.out.println("입력한 나이보다 작은 데이터 삭제");
				dao.delete(UserInput.inputInt("나이 :"));
				break;
			default:
				System.out.println("프로그램 종료");
				isFlag = false;
			}

		}

	}
}

//}
