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
        garen.qs("추가 효과: 이동속도 증가");
        garen.w();
        garen.ws();
        garen.ws(3);
        garen.e();
        garen.es();
        garen.es("3티모미터");
        garen.r();
        garen.rs();
        garen.rs("고정 피해");

        Item item = new Item("삼위일체");
        garen.equipItem(item);
        garen.useItem();
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

    // 오버로딩된 스킬 메서드들
    void qs() {
        System.out.println("q스킬을 사용하셨습니다.");
    }
    void qs(String additionalEffect) {
        System.out.println("추가 효과: " + additionalEffect);
    }

    void ws() {
        System.out.println("w스킬을 사용하셨습니다.");
    }
    void ws(int duration) {
        System.out.println("지속 시간: " + duration + "초");
    }

    void es() {
        System.out.println("e스킬을 사용하셨습니다.");
    }
    void es(String areaOfEffect) {
        System.out.println("범위: " + areaOfEffect);
    }

    void rs() {
        System.out.println("r스킬을 사용하셨습니다.");
    }
    void rs(String damageType) {
        System.out.println("피해 유형: " + damageType);
    }
}

class Garen extends Champion {
    @Override
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

    // 포함 관계: Item을 장착하는 메서드
    Item item;

    void equipItem(Item item) {
        this.item = item;
        System.out.println("아이템을 구매했습니다: " + item.getName());
    }

    void useItem() {
        if (item != null) {
            System.out.println("아이템 사용: " + item.getName());
        } else {
            System.out.println("아이템이 없습니다.");
        }
    }
}

// 아이템 클래스 (Item)
class Item {
    String name;

    Item(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}