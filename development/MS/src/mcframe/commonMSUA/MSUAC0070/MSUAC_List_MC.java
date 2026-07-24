package mcframe.commonMSUA.MSUAC0070;

abstract public class MSUAC_List_MC extends MSUAC_List_MC_A {
	// リストロジック存在チェックデータ格納カラム名
	public static final String $LIST_LOGIC_VAL = "__ _list_logic_ __";
	// リストロジック存在チェックバインド変数名左辺
	public static final String $LIST_LOGIC_LEFT = "__ _";
	// リストロジック存在チェックバインド変数名右辺
	public static final String $LIST_LOGIC_RIGHT = "_ __";

	public static String getLLBindNm(String col) {
		return $LIST_LOGIC_LEFT + col + $LIST_LOGIC_RIGHT;
	}

}
