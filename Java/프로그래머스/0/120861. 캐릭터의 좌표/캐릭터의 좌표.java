class Solution {
    public int[] solution(String[] keyinput, int[] board) {
       int[] answer = new int[2]; // x와 y 좌표를 저장할 배열
        int x = 0, y = 0; // 시작 좌표는 (0, 0)으로 설정

        // 보드의 경계 설정
        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        // 키 입력 처리
        for (String s : keyinput) {
            if (s.equals("left")) {
                if (x > -xLimit) x--; // 왼쪽으로 이동, 보드 경계를 넘지 않도록 제한
            } else if (s.equals("right")) {
                if (x < xLimit) x++; // 오른쪽으로 이동
            } else if (s.equals("down")) {
                if (y > -yLimit) y--; // 아래로 이동
            } else if (s.equals("up")) {
                if (y < yLimit) y++; // 위로 이동
            }
        }

        // 최종 좌표를 answer 배열에 저장
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}