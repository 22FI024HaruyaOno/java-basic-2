class Kamoku {
	String name;
	int score;
	private int studentid;

	Kamoku(int s) {  // これがコンストラクタ。特殊なメソッド。クラス名と同じ。
		score = s;
	}

    Kamoku(int s, int sId) {
        score = s;
        studentid = sId;
    }

// setScore というメソッドを定義する。
// score に値を設定する。
	public void setScore(int num){
		score = num;
	}

// getScore というメソッドを定義する。
// scoreを返す。
	public int getScore() {
		return score;
	}

// getScore というメソッドを定義する。
// scoreを返す。
	public int getStudentId() {
		return studentid;
	}
}
