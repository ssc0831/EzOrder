package com.exam02;

import java.util.*;

public class CapitalTest {
    private Map<String, String> capitals;
    private Scanner sc;

    public CapitalTest() {
        capitals = new HashMap<>();
        Scanner sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        int choice;
        do {
            choice = getMenuChoice();
            switch (choice) {
                case 1:
                    inputCapitals();
                    break;
                case 2:
                    quiz();
                    break;
                case 3:
                    saveToFile();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                    break;
            }
        } while (choice != 4);
    }

    private int getMenuChoice() {
        int choice;
        do {
            System.out.println("1. 입력, 2. 퀴즈, 3. 파일저장 및 종료");
            System.out.print("선택 >> ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 4);
        return choice;
    }

    private void inputCapitals() {
        sc.nextLine(); // 버퍼 비우기
        System.out.println("나라와 수도를 입력하세요 (예: 한국 서울)");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        if (tokens.length != 2) {
            System.out.println("잘못된 입력입니다. 나라와 수도를 띄어쓰기로 구분하여 입력하세요.");
            return;
        }
        String country = tokens[0];
        String capital = tokens[1];
        capitals.put(country, capital);
        System.out.println("입력이 완료되었습니다.");
    }

    private void quiz() {
        if (capitals.isEmpty()) {
            System.out.println("등록된 나라와 수도가 없습니다. 먼저 입력하세요.");
            return;
        }
        List<String> countries = new ArrayList<>(capitals.keySet());
        Random random = new Random();
        int index = random.nextInt(countries.size());
        String country = countries.get(index);
        String capital = capitals.get(country);
        System.out.println(country + "의 수도는 ?");
        sc.nextLine(); 
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase(capital)) {
            System.out.println("정답입니다!");
        } else {
            System.out.println("오답입니다. 정답은 " + capital + "입니다.");
        }
    }

    public void saveToFile() {
        System.out.println("파일에 저장합니다.");
     
    }

    public static void main(String[] args) {
        CapitalTest capitalTest = new CapitalTest();
        capitalTest.start();
    }
}
