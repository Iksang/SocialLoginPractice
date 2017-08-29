package kr.co.tjeit.socialloginpractice.util;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjeit.socialloginpractice.data.User;

/**
 * Created by tjoeun on 2017-08-29.
 */

public class GlobalData {

    public static List<User> allUsers = new ArrayList<>();
    public static void initGlobalData(){
        allUsers.clear();;
        allUsers.add(new User("aaaa", "1111", "갑", "https://s3.ap-northeast-2.amazonaws.com/slws3/imgs/tje_practice/11379757_445206435653478_1894580131_n.jpg"));
        allUsers.add(new User("bbbb", "2222", "을", "https://s3.ap-northeast-2.amazonaws.com/slws3/imgs/tje_practice/13731255_1566785090293996_693997005_n.jpg"));
        allUsers.add(new User("cccc", "3333", "병", "https://s3.ap-northeast-2.amazonaws.com/slws3/imgs/tje_practice/14.jpg"));
        allUsers.add(new User("dddd", "4444", "정", "https://s3.ap-northeast-2.amazonaws.com/slws3/imgs/tje_practice/images+(1).jpg"));
        allUsers.add(new User("eeee", "5555", "무", "https://s3.ap-northeast-2.amazonaws.com/slws3/imgs/tje_practice/images.jpg"));
        allUsers.add(new User("ffff", "6666", "기", "tempURL"));
        allUsers.add(new User("gggg", "7777", "경", "tempURL"));
        allUsers.add(new User("hhhh", "8888", "신", "tempURL"));
        allUsers.add(new User("iiii", "9999", "임", "tempURL"));
        allUsers.add(new User("jjjj", "0000", "계", "tempURL"));



    }
}
