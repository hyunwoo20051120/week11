public class teamwork {
    public static void main(String[] args) {

        GameClient client = new GameClient();
        client.start_client();
        client.start();

        Gamemode lol = new Gamemode();
        lol.maker = "Riot Games";
        lol.start();
        lol.join();

        Champion champ = new Champion();
        Garen garen = new Garen();
        champ.pick();
        garen.pick();
        garen.q();
        garen.qs();
        garen.w();
        garen.ws();
        garen.e();
        garen.es();
        garen.r();
        garen.rs();
    }
}

class LOL {
    String maker;
    void start() {
        System.out.println("게임 시작");
    }
}

class Gamemode extends LOL {
    void join() {
        System.out.println("참가 완료");
    }
}

class GameClient extends LOL {
    void start_client() {
        System.out.println("롤 클라이언트를 실행합니다.");
    }
}

class Champion extends LOL {
    void pick() {
        System.out.println("챔피언을 선택하셨습니다.");
    }
    void qs() {
        System.out.println("q스킬을 사용하셨습니다.");
    }
    void ws() {
        System.out.println("w스킬을 사용하셨습니다.");
    }
    void es() {
        System.out.println("e스킬을 사용하셨습니다.");
    }
    void rs() {
        System.out.println("r스킬을 사용하셨습니다.");
    }
}

class Garen extends Champion {
    void pick() {
        System.out.println("내 검과 심장은, 데마시아의 것이다!");
    }
    void q() {
        System.out.println("전진!");
    }
    void w() {
        System.out.println("버텨라!");
    }
    void e() {
        System.out.println("진형을 무너뜨려라!");
    }
    void r() {
        System.out.println("정의를 위해!");
    }
}