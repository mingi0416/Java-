package com.human.ex20221005;
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        //String[] id_pw : 머쓱이가 입력한 id/pw가 담긴 배열
        //String[][] db : 회원정보 배열이 담긴 2중배열
        
        //id/pw 배열의 값이 db배열에 존재하면 login
        //id는 같으나 pw가 다르면 wrong pw
        //아이디가 다르면 fail
        
        for(int i = 0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    break;
                }else {
                    answer = "wrong pw";
                    break;
                }
            }else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}