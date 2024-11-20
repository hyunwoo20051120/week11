public class Main2 {
    public static void main(String[] args) {
        // LoLClient 클래스를 실행
        GameClient client = new LoLClient();
        client.start();  // 클라이언트 실행
        client.stop();   // 클라이언트 종료
    }
}

// 부모 클래스: GameClient
class GameClient {

    void start() {
        System.out.println("롤 클라이언트를 실행합니다.");
    }

    void stop() {
        System.out.println("롤 클라이언트를 종료합니다.");
    }
}

// 자식 클래스: LoLClient (리그 오브 레전드 클라이언트)
class LoLClient extends GameClient {

    void start() {
        System.out.println("롤 클라이언트를 실행합니다.");
    }

    void stop() {
        System.out.println("롤 클라이언트를 종료합니다.");
    }
}