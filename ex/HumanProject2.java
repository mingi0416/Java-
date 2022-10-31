package com.human.ex;

import com.human.dto.HumanDto;
import com.human.service.HumanService;
import com.human.util.UserInput;

public class HumanProject2 {

	public static void main(String[] args) {
		// 1. dto 만들기 - 데이터베이스에서 가져온 데이터를 담는 클래스
		// 2. dao 만들기 - 데이터베이스 crud 작업을 담당하는 클래스
		// 3. UserInput - 사용자입력을 도와주는 클래스
		// 4. main메소드에서 관리형 프로그램 만들기
		// 5. service 추가하기 dao작업 + 비지니스 로직(핵심로직)
		// 비지니스 로직 business logic
		// 자료의 조작과 계산의 수행을 말한다.
		// 6. Model 만들기 - 컨트롤과 많은 뷰를 동일한 모양으로 연결하기 위해서
		// 7. view 만들기 - Model을 매개변수로 받는 view 메소드로 만들기 ViewMethod
		HumanService service = new HumanService();
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
				service.init();
				System.out.println("test값을 입력하였습니다.");
				break;
			case 2:
				System.out.println("전체 데이터 출력>>");
				for (HumanDto dto : service.select()) {
//					System.out.println(dto);
					System.out.println("이름 : " + dto.getName() + " 나이 : " + dto.getAge() 
					+ " 키 : " + dto.getHeight() + " 생년월일 : " + dto.getBirthday());
				}
				System.out.println("select 작업이 종료되었습니다.");
				break;
			case 3:
				System.out.println("입력한 height값보다 큰 학생을 출력할 예정입니다");
				double height = UserInput.inputDouble("height를 입력하세요");
				for (HumanDto dto : service.select(height)) {
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

				service.insert(dto);
				break;
			case 5:
				System.out.println("특정 name으로 age변경");
				String name = UserInput.inputString("이름 :");
				int age = UserInput.inputInt("나이 : ");
				service.update(name, age);
				break;
			case 6:
				System.out.println("입력한 나이보다 작은 데이터 삭제");
				service.delete(UserInput.inputInt("나이 :"));
				break;
			default:
				System.out.println("프로그램 종료");
				isFlag = false;
			}

		}

	}
}

//}
