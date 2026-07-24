package mcframe.commonMAUA.MAUAC0010;

abstract public class MAUAC_List_MC extends MAUAC_List_MC_A {

	// リストロジック存在チェックデータ格納カラム名
	public static final String $LIST_LOGIC_VAL = "__ _list_logic_ __";
	// リストロジック存在チェックバインド変数名左辺
	public static final String $LIST_LOGIC_LEFT = "__ _";
	// リストロジック存在チェックバインド変数名右辺
	public static final String $LIST_LOGIC_RIGHT = "_ __";
	//コンボボックス識別用カラム名
	public static final String $COMBO_MODE = "__ _combo_ __";
	//入力制限つき複数値入力識別用カラム名
	public static final String $IS_REQ_PLURAL = "__ _is_req_plural_ __";
	//入力制限つき複数値カラム名
	public static final String $INPUT_REQ_PLURAL_VAL = "__ _input_req_plural_val_ __";
	
	public static String getLLBindNm(String col) {
		return $LIST_LOGIC_LEFT + col + $LIST_LOGIC_RIGHT;
	}

	public static String getNotLLBindNm(String col) {
		String noLeft = col.replace($LIST_LOGIC_LEFT, "");
		return noLeft.replace($LIST_LOGIC_RIGHT, "");
	}

}
