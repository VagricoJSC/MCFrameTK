package mcframe.commonMA.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MCAppConst;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
//settingSheetのCUSTOM_IMPORT_LISTの文字列を出力
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MAC_ELM_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "ELM_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_ELM_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "elm_typ";

	public static final String $NAME = "elm_typ_nm";

	public static final String $DGT_TYP = "dgt_typ";

	public static final String $FIX_DGT = "fix_dgt";

	public static final String $LIST_SORT = "list_sort";

	/*
	 * 定数の定義です。
	 */
	/** 要素区分：固定値
	 */
	public static final MAC_ELM_TYP FIX = create("FIX", "FIX", MAC_DGT_TYP.CHAR_CNT.value(), null, new MCNumber(1));

	/** 要素区分：半角スペース
	 */
	public static final MAC_ELM_TYP SP = create("SP", "SP", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(1), new MCNumber(2));

	/** 要素区分：年４桁
	 */
	public static final MAC_ELM_TYP YYYY = create("YYYY", "YYYY", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(4), new MCNumber(3));

	/** 要素区分：年２桁
	 */
	public static final MAC_ELM_TYP YY = create("YY", "YY", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(2), new MCNumber(4));

	/** 要素区分：年１桁
	 */
	public static final MAC_ELM_TYP Y = create("Y", "Y", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(1), new MCNumber(5));

	/** 要素区分：月１桁(1-C)
	 */
	public static final MAC_ELM_TYP M = create("MAC_", "M", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(1), new MCNumber(6));

	/** 要素区分：月１桁(A-L)
	 */
	public static final MAC_ELM_TYP MA = create("MA", "MA", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(1), new MCNumber(7));

	/** 要素区分：月２桁
	 */
	public static final MAC_ELM_TYP MM = create("MM", "MM", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(2), new MCNumber(8));

	/** 要素区分：日２桁
	 */
	public static final MAC_ELM_TYP DD = create("DD", "DD", MAC_DGT_TYP.FIX_DGT.value(), new MCNumber(2), new MCNumber(9));

	/** 要素区分：文字列
	 */
	public static final MAC_ELM_TYP STR = create("STR", "STR", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(10));

	/** 要素区分：文字列２
	 */
	public static final MAC_ELM_TYP STR2 = create("STR2", "STR2", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(11));

	/** 要素区分：文字列３
	 */
	public static final MAC_ELM_TYP STR3 = create("STR3", "STR3", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(12));

	/** 要素区分：数字
	 */
	public static final MAC_ELM_TYP NUM = create("NUM", "NUM", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(13));

	/** 要素区分：連番
	 */
	public static final MAC_ELM_TYP SEQ = create("SEQ", "SEQ", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(14));

	/** 要素区分：品目ＣＤ
	 */
	public static final MAC_ELM_TYP ITM = create("ITM", "ITM", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(15));

	/** 要素区分：枝番１
	 */
	public static final MAC_ELM_TYP ITM_SUB1 = create("ITM_SUB1", "ITM_SUB1", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(16));

	/** 要素区分：枝番２
	 */
	public static final MAC_ELM_TYP ITM_SUB2 = create("ITM_SUB2", "ITM_SUB2", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(17));

	/** 要素区分：枝番３
	 */
	public static final MAC_ELM_TYP ITM_SUB3 = create("ITM_SUB3", "ITM_SUB3", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(18));

	/** 要素区分：場所ＣＤ
	 */
	public static final MAC_ELM_TYP LOC = create("LOC", "LOC", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(19));

	/** 要素区分：部門ＣＤ
	 */
	public static final MAC_ELM_TYP DPT = create("DPT", "DPT", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(20));

	/** 要素区分：会社ＣＤ
	 */
	public static final MAC_ELM_TYP CO = create("CO", "CO", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(21));

	/** 要素区分：取引先ＣＤ
	 */
	public static final MAC_ELM_TYP BP = create("BP", "BP", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(22));

	/** 要素区分：ワーキンググループＣＤ
	 */
	public static final MAC_ELM_TYP WG = create("WG", "WG", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(23));

	/** 要素区分：取引ＣＤ
	 */
	public static final MAC_ELM_TYP TRD = create("TRD", "TRD", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(24));

	/** 要素区分：工場・物流倉庫ＣＤ
	 */
	public static final MAC_ELM_TYP SITE = create("SITE", "SITE", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(25));

	/** 要素区分：ロットＮＯ
	 */
	public static final MAC_ELM_TYP LOT = create("LOT", "LOT", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(26));

	/** 要素区分：子品目ロットＮＯ
	 */
	public static final MAC_ELM_TYP CHD_LOT = create("CHD_LOT", "CHD_LOT", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(27));

	/** 要素区分：子品目サブロットＮＯ
	 */
	public static final MAC_ELM_TYP CHD_SUBLOT = create("CHD_SUBLOT", "CHD_SUBLOT", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(28));

	/** 要素区分：業者ロットＮＯ
	 */
	public static final MAC_ELM_TYP BP_LOT = create("BP_LOT", "BP_LOT", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(29));

	/** 要素区分：手配ＮＯ１
	 */
	public static final MAC_ELM_TYP SNO1 = create("SNO1", "SNO1", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(30));

	/** 要素区分：手配ＮＯ２
	 */
	public static final MAC_ELM_TYP SNO2 = create("SNO2", "SNO2", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(31));

	/** 要素区分：手配ＮＯ３
	 */
	public static final MAC_ELM_TYP SNO3 = create("SNO3", "SNO3", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(32));

	/** 要素区分：手配ＮＯ４
	 */
	public static final MAC_ELM_TYP SNO4 = create("SNO4", "SNO4", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(33));

	/** 要素区分：品目（拠点・物流倉庫）
	 */
	public static final MAC_ELM_TYP ITM_SITE = create("ITM_SITE", "ITM_SITE", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(34));

	/** 要素区分：品目分類１
	 */
	public static final MAC_ELM_TYP ITM_GRP01 = create("ITM_GRP01", "ITM_GRP01", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(35));

	/** 要素区分：品目分類２
	 */
	public static final MAC_ELM_TYP ITM_GRP02 = create("ITM_GRP02", "ITM_GRP02", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(36));

	/** 要素区分：品目分類３
	 */
	public static final MAC_ELM_TYP ITM_GRP03 = create("ITM_GRP03", "ITM_GRP03", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(37));

	/** 要素区分：品目分類４
	 */
	public static final MAC_ELM_TYP ITM_GRP04 = create("ITM_GRP04", "ITM_GRP04", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(38));

	/** 要素区分：品目分類５
	 */
	public static final MAC_ELM_TYP ITM_GRP05 = create("ITM_GRP05", "ITM_GRP05", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(39));

	/** 要素区分：品目分類６
	 */
	public static final MAC_ELM_TYP ITM_GRP06 = create("ITM_GRP06", "ITM_GRP06", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(40));

	/** 要素区分：品目分類７
	 */
	public static final MAC_ELM_TYP ITM_GRP07 = create("ITM_GRP07", "ITM_GRP07", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(41));

	/** 要素区分：品目分類８
	 */
	public static final MAC_ELM_TYP ITM_GRP08 = create("ITM_GRP08", "ITM_GRP08", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(42));

	/** 要素区分：品目分類９
	 */
	public static final MAC_ELM_TYP ITM_GRP09 = create("ITM_GRP09", "ITM_GRP09", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(43));

	/** 要素区分：品目分類１０
	 */
	public static final MAC_ELM_TYP ITM_GRP10 = create("ITM_GRP10", "ITM_GRP10", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(44));

	/** 要素区分：取引先分類１
	 */
	public static final MAC_ELM_TYP BP_GRP01 = create("BP_GRP01", "BP_GRP01", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(45));

	/** 要素区分：取引先分類２
	 */
	public static final MAC_ELM_TYP BP_GRP02 = create("BP_GRP02", "BP_GRP02", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(46));

	/** 要素区分：取引先分類３
	 */
	public static final MAC_ELM_TYP BP_GRP03 = create("BP_GRP03", "BP_GRP03", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(47));

	/** 要素区分：取引先分類４
	 */
	public static final MAC_ELM_TYP BP_GRP04 = create("BP_GRP04", "BP_GRP04", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(48));

	/** 要素区分：取引先分類５
	 */
	public static final MAC_ELM_TYP BP_GRP05 = create("BP_GRP05", "BP_GRP05", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(49));

	/** 要素区分：取引先分類６
	 */
	public static final MAC_ELM_TYP BP_GRP06 = create("BP_GRP06", "BP_GRP06", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(50));

	/** 要素区分：取引先分類７
	 */
	public static final MAC_ELM_TYP BP_GRP07 = create("BP_GRP07", "BP_GRP07", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(51));

	/** 要素区分：取引先分類８
	 */
	public static final MAC_ELM_TYP BP_GRP08 = create("BP_GRP08", "BP_GRP08", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(52));

	/** 要素区分：取引先分類９
	 */
	public static final MAC_ELM_TYP BP_GRP09 = create("BP_GRP09", "BP_GRP09", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(53));

	/** 要素区分：取引先分類１０
	 */
	public static final MAC_ELM_TYP BP_GRP10 = create("BP_GRP10", "BP_GRP10", MAC_DGT_TYP.ELM_DGT.value(), null, new MCNumber(54));

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ELM_TYP create() {
		return new MAC_ELM_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_ELM_TYP get(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		if (type == null) {
			throw MAC_ELM_TYP.invalidValue(value);
		}
		return type;
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * valueが定数グループに属している場合は、valueと一致した定数インスタンスを返します。
	 * 定数グループに属していない場合はnullを返します。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 */
	public static MAC_ELM_TYP getNE(String value) {
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ELM_TYP create(String value, String xmlKey, String attr1, MCNumber attr2, MCNumber attr3) {
		MAC_ELM_TYP me = MAC_ELM_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($DGT_TYP, attr1);
		me.constR.addNumberColumn($FIX_DGT, attr2);
		me.constR.addNumberColumn($LIST_SORT, attr3);
		return me;
	}

	/*
	 * 各フィールドのgetterです。
	 */
	@Override
	protected String moduleID() {
		return moduleID;
	}

	@Override
	protected String typeID() {
		return typeID;
	}

	/**
	 * DB保存する場合などに使用するプリミティブな値を取得します。
	 * ロジックが保持している値が定数と同値であるかどうかを判断する場合には、
	 * <pre>  [定数クラス].is[定数名]([値を保持している変数])</pre>。
	 * を使用してください。
	 * <pre>  [定数クラス].[定数名].value.equals([値を保持している変数])</pre>
	 * という実装は推奨しません。
	 * @return 定数値
	 */
	public String value() {
		return constR.getString($VALUE);
	}

	/** 
	 * dgt_typの値を返します。
	 * @return dgt_typの値
	 */
	public String dgt_typ() {
		return constR.getStringNE($DGT_TYP);
	}

	/** 
	 * valueに対応する定数のdgt_typの値を返します。
	 * @param value 定数値
	 * @return dgt_typの値
	 */
	public static String dgt_typ(String value) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.dgt_typ();
	}

	/** 
	 * fix_dgtの値を返します。
	 * @return fix_dgtの値
	 */
	public MCNumber fix_dgt() {
		return constR.getNumberNE($FIX_DGT);
	}

	/** 
	 * valueに対応する定数のfix_dgtの値を返します。
	 * @param value 定数値
	 * @return fix_dgtの値
	 */
	public static MCNumber fix_dgt(String value) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.fix_dgt();
	}

	/** 
	 * list_sortの値を返します。
	 * @return list_sortの値
	 */
	public MCNumber list_sort() {
		return constR.getNumberNE($LIST_SORT);
	}

	/** 
	 * valueに対応する定数のlist_sortの値を返します。
	 * @param value 定数値
	 * @return list_sortの値
	 */
	public static MCNumber list_sort(String value) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.list_sort();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if (me != null) {
			return true;
		}
		else {
			return false;
		}
	}

	/** 
	 * 指定されたvalueが定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 値
	 */
	public static void containsEx(String value) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if (me == null) {
			throw MAC_ELM_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_ELM_TYP me = MAC_ELM_TYP.getNE(value);
		if (me == null) {
			if (binds == null) {
				throw new MCAppException(msgid, value);
			}else{
				throw new MCAppException(msgid, binds);
			}
		}
	}


	/*
	 * toStringメソッドのオーバーライドです。
	 */
	public String toString() {
		return createStringPath(value(), name(), dgt_typ(), fix_dgt(), list_sort());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_ELM_TYP[] array() {
		if (array == null) {
			array = new MAC_ELM_TYP[] {
					MAC_ELM_TYP.FIX, MAC_ELM_TYP.SP, MAC_ELM_TYP.YYYY, MAC_ELM_TYP.YY, MAC_ELM_TYP.Y, 
					 MAC_ELM_TYP.M, MAC_ELM_TYP.MA, MAC_ELM_TYP.MM, MAC_ELM_TYP.DD, MAC_ELM_TYP.STR, MAC_ELM_TYP.STR2, 
					 MAC_ELM_TYP.STR3, MAC_ELM_TYP.NUM, MAC_ELM_TYP.SEQ, MAC_ELM_TYP.ITM, MAC_ELM_TYP.ITM_SUB1, MAC_ELM_TYP.ITM_SUB2, 
					 MAC_ELM_TYP.ITM_SUB3, MAC_ELM_TYP.LOC, MAC_ELM_TYP.DPT, MAC_ELM_TYP.CO, MAC_ELM_TYP.BP, MAC_ELM_TYP.WG, 
					 MAC_ELM_TYP.TRD, MAC_ELM_TYP.SITE, MAC_ELM_TYP.LOT, MAC_ELM_TYP.CHD_LOT, MAC_ELM_TYP.CHD_SUBLOT, MAC_ELM_TYP.BP_LOT, 
					 MAC_ELM_TYP.SNO1, MAC_ELM_TYP.SNO2, MAC_ELM_TYP.SNO3, MAC_ELM_TYP.SNO4, MAC_ELM_TYP.ITM_SITE, MAC_ELM_TYP.ITM_GRP01, 
					 MAC_ELM_TYP.ITM_GRP02, MAC_ELM_TYP.ITM_GRP03, MAC_ELM_TYP.ITM_GRP04, MAC_ELM_TYP.ITM_GRP05, MAC_ELM_TYP.ITM_GRP06, MAC_ELM_TYP.ITM_GRP07, 
					 MAC_ELM_TYP.ITM_GRP08, MAC_ELM_TYP.ITM_GRP09, MAC_ELM_TYP.ITM_GRP10, MAC_ELM_TYP.BP_GRP01, MAC_ELM_TYP.BP_GRP02, MAC_ELM_TYP.BP_GRP03, 
					 MAC_ELM_TYP.BP_GRP04, MAC_ELM_TYP.BP_GRP05, MAC_ELM_TYP.BP_GRP06, MAC_ELM_TYP.BP_GRP07, MAC_ELM_TYP.BP_GRP08, MAC_ELM_TYP.BP_GRP09, 
					 MAC_ELM_TYP.BP_GRP10
			};
		}
		return array;
	}

	/**
	 * 定数の値と名称のListを返します。
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list() {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			MCRow r = MCRow.create();
			r.addStringColumn($VALUE, me.value());
			r.addStringColumn($NAME, me.name());
			list.add(r);
		}
		return list;
	}

	/**
	 * キーに対応する値を取得します。
	 * @return 値
	 */
	protected static String value(String key) {
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			if(me.key().equals(key)){
				return me.value();
			}
		}
		return null;
	}

	/**
	 * キーの配列を取得します。
	 * @return キーの配列
	 */
	protected static List<String> getKeys() {
		List<String> keys = new ArrayList<String>();
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			keys.add(me.key());
		}
		return keys;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(MCRow row) {
		Map<String, Boolean> kl = new HashMap<String, Boolean>();
		for(String s : row.getColumnPathArray()){
			if(MAC_ELM_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_ELM_TYP me = MAC_ELM_TYP.get(MAC_ELM_TYP.value(e.getKey()));
				MCRow r = list.createRow();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_ELM_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_ELM_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_ELM_TYP.list();
			}
			return list;
		}
	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数 cols と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(String[] cols, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			if(MAC_ELM_TYP.isSameVals(me, cols, vals)){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数colValMapの、キーを定数カラム、値を定数カラムに対応する値、とみなし、それに一致する定数のリストを返します。
	 * @param colValMap キーにカラム名、値に定数カラムに対応する値を持つマップ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(Map<String, Comparable<?>> colValMap) {
		MCList<MCRow> list;
		if(colValMap != null && 0 < colValMap.size()){
			int s = colValMap.size();
			String[] cols = new String[s];
			Comparable<?>[] vals =new Comparable<?>[s];
			int i = 0;
			for(Map.Entry<String, Comparable<?>> e : colValMap.entrySet()){
				cols[i] = e.getKey();
				vals[i] = e.getValue();
				i =+ 1;
			}
			list = MAC_ELM_TYP.subList(cols, vals);
		}
		else{
			list = MCList.create(MCRow.class);
		}
		return list;
	}

	/**
	 * 指定されたカラムの値がひとつも一致しない範囲の値と名称のListを返します。<p>
	 * 定数インスタンスの保持するconstR に存在しないカラムを指定した場合、例外をthrowします。
	 * @param col カラム名
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> exptSubList(String col, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		String[] cols = {col};
		Comparable<?>[] val = new Comparable<?>[1];
		for (MAC_ELM_TYP me : MAC_ELM_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_ELM_TYP.isSameVals(me, cols, val)){
					f = false;
					break;
				}
			}
			if(f){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 定数の保持するconstR のカラム(引数 cols)の値が、引数 valsと一致する場合、trueを返します。<p>
	 * 引数 keys と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param me 定数インスタンス
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 */
	protected static boolean isSameVals(MAC_ELM_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_ELM_TYP", col);}
			Comparable<?> rVal = me.constR.getValue(col);
			if(!isSame(rVal, val)){
				f = false;
				break;
			}
		}
		return f;
	}

	/**
	 * デフォルトの比較メソッド
	 * staticオブジェクト同士の比較なので、==演算子を使用している。
	 * @param type 定数インスタンス
	 * @return 一致していればtrue
	 */
	protected boolean isSame(MAC_ELM_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 要素区分：固定値かどうか
	 * @param value 定数値
	 * @return 定数値が固定値の値の場合true
	 */
	public static boolean isFIX(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.FIX.isSame(type);
	}

	/**
	 * 要素区分：固定値かどうか
	 * @param type 属性値
	 * @return 属性値が固定値の値の場合true
	 */
	public static boolean isFIX(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.FIX.isSame(type);
	}

	/**
	 * 要素区分：半角スペースかどうか
	 * @param value 定数値
	 * @return 定数値が半角スペースの値の場合true
	 */
	public static boolean isSP(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SP.isSame(type);
	}

	/**
	 * 要素区分：半角スペースかどうか
	 * @param type 属性値
	 * @return 属性値が半角スペースの値の場合true
	 */
	public static boolean isSP(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SP.isSame(type);
	}

	/**
	 * 要素区分：年４桁かどうか
	 * @param value 定数値
	 * @return 定数値が年４桁の値の場合true
	 */
	public static boolean isYYYY(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.YYYY.isSame(type);
	}

	/**
	 * 要素区分：年４桁かどうか
	 * @param type 属性値
	 * @return 属性値が年４桁の値の場合true
	 */
	public static boolean isYYYY(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.YYYY.isSame(type);
	}

	/**
	 * 要素区分：年２桁かどうか
	 * @param value 定数値
	 * @return 定数値が年２桁の値の場合true
	 */
	public static boolean isYY(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.YY.isSame(type);
	}

	/**
	 * 要素区分：年２桁かどうか
	 * @param type 属性値
	 * @return 属性値が年２桁の値の場合true
	 */
	public static boolean isYY(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.YY.isSame(type);
	}

	/**
	 * 要素区分：年１桁かどうか
	 * @param value 定数値
	 * @return 定数値が年１桁の値の場合true
	 */
	public static boolean isY(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.Y.isSame(type);
	}

	/**
	 * 要素区分：年１桁かどうか
	 * @param type 属性値
	 * @return 属性値が年１桁の値の場合true
	 */
	public static boolean isY(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.Y.isSame(type);
	}

	/**
	 * 要素区分：月１桁(1-C)かどうか
	 * @param value 定数値
	 * @return 定数値が月１桁(1-C)の値の場合true
	 */
	public static boolean isM(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.M.isSame(type);
	}

	/**
	 * 要素区分：月１桁(1-C)かどうか
	 * @param type 属性値
	 * @return 属性値が月１桁(1-C)の値の場合true
	 */
	public static boolean isM(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.M.isSame(type);
	}

	/**
	 * 要素区分：月１桁(A-L)かどうか
	 * @param value 定数値
	 * @return 定数値が月１桁(A-L)の値の場合true
	 */
	public static boolean isMA(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.MA.isSame(type);
	}

	/**
	 * 要素区分：月１桁(A-L)かどうか
	 * @param type 属性値
	 * @return 属性値が月１桁(A-L)の値の場合true
	 */
	public static boolean isMA(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.MA.isSame(type);
	}

	/**
	 * 要素区分：月２桁かどうか
	 * @param value 定数値
	 * @return 定数値が月２桁の値の場合true
	 */
	public static boolean isMM(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.MM.isSame(type);
	}

	/**
	 * 要素区分：月２桁かどうか
	 * @param type 属性値
	 * @return 属性値が月２桁の値の場合true
	 */
	public static boolean isMM(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.MM.isSame(type);
	}

	/**
	 * 要素区分：日２桁かどうか
	 * @param value 定数値
	 * @return 定数値が日２桁の値の場合true
	 */
	public static boolean isDD(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.DD.isSame(type);
	}

	/**
	 * 要素区分：日２桁かどうか
	 * @param type 属性値
	 * @return 属性値が日２桁の値の場合true
	 */
	public static boolean isDD(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.DD.isSame(type);
	}

	/**
	 * 要素区分：文字列かどうか
	 * @param value 定数値
	 * @return 定数値が文字列の値の場合true
	 */
	public static boolean isSTR(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.STR.isSame(type);
	}

	/**
	 * 要素区分：文字列かどうか
	 * @param type 属性値
	 * @return 属性値が文字列の値の場合true
	 */
	public static boolean isSTR(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.STR.isSame(type);
	}

	/**
	 * 要素区分：文字列２かどうか
	 * @param value 定数値
	 * @return 定数値が文字列２の値の場合true
	 */
	public static boolean isSTR2(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.STR2.isSame(type);
	}

	/**
	 * 要素区分：文字列２かどうか
	 * @param type 属性値
	 * @return 属性値が文字列２の値の場合true
	 */
	public static boolean isSTR2(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.STR2.isSame(type);
	}

	/**
	 * 要素区分：文字列３かどうか
	 * @param value 定数値
	 * @return 定数値が文字列３の値の場合true
	 */
	public static boolean isSTR3(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.STR3.isSame(type);
	}

	/**
	 * 要素区分：文字列３かどうか
	 * @param type 属性値
	 * @return 属性値が文字列３の値の場合true
	 */
	public static boolean isSTR3(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.STR3.isSame(type);
	}

	/**
	 * 要素区分：数字かどうか
	 * @param value 定数値
	 * @return 定数値が数字の値の場合true
	 */
	public static boolean isNUM(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.NUM.isSame(type);
	}

	/**
	 * 要素区分：数字かどうか
	 * @param type 属性値
	 * @return 属性値が数字の値の場合true
	 */
	public static boolean isNUM(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.NUM.isSame(type);
	}

	/**
	 * 要素区分：連番かどうか
	 * @param value 定数値
	 * @return 定数値が連番の値の場合true
	 */
	public static boolean isSEQ(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SEQ.isSame(type);
	}

	/**
	 * 要素区分：連番かどうか
	 * @param type 属性値
	 * @return 属性値が連番の値の場合true
	 */
	public static boolean isSEQ(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SEQ.isSame(type);
	}

	/**
	 * 要素区分：品目ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が品目ＣＤの値の場合true
	 */
	public static boolean isITM(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM.isSame(type);
	}

	/**
	 * 要素区分：品目ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が品目ＣＤの値の場合true
	 */
	public static boolean isITM(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM.isSame(type);
	}

	/**
	 * 要素区分：枝番１かどうか
	 * @param value 定数値
	 * @return 定数値が枝番１の値の場合true
	 */
	public static boolean isITM_SUB1(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_SUB1.isSame(type);
	}

	/**
	 * 要素区分：枝番１かどうか
	 * @param type 属性値
	 * @return 属性値が枝番１の値の場合true
	 */
	public static boolean isITM_SUB1(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_SUB1.isSame(type);
	}

	/**
	 * 要素区分：枝番２かどうか
	 * @param value 定数値
	 * @return 定数値が枝番２の値の場合true
	 */
	public static boolean isITM_SUB2(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_SUB2.isSame(type);
	}

	/**
	 * 要素区分：枝番２かどうか
	 * @param type 属性値
	 * @return 属性値が枝番２の値の場合true
	 */
	public static boolean isITM_SUB2(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_SUB2.isSame(type);
	}

	/**
	 * 要素区分：枝番３かどうか
	 * @param value 定数値
	 * @return 定数値が枝番３の値の場合true
	 */
	public static boolean isITM_SUB3(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_SUB3.isSame(type);
	}

	/**
	 * 要素区分：枝番３かどうか
	 * @param type 属性値
	 * @return 属性値が枝番３の値の場合true
	 */
	public static boolean isITM_SUB3(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_SUB3.isSame(type);
	}

	/**
	 * 要素区分：場所ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が場所ＣＤの値の場合true
	 */
	public static boolean isLOC(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.LOC.isSame(type);
	}

	/**
	 * 要素区分：場所ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が場所ＣＤの値の場合true
	 */
	public static boolean isLOC(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.LOC.isSame(type);
	}

	/**
	 * 要素区分：部門ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が部門ＣＤの値の場合true
	 */
	public static boolean isDPT(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.DPT.isSame(type);
	}

	/**
	 * 要素区分：部門ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が部門ＣＤの値の場合true
	 */
	public static boolean isDPT(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.DPT.isSame(type);
	}

	/**
	 * 要素区分：会社ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が会社ＣＤの値の場合true
	 */
	public static boolean isCO(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.CO.isSame(type);
	}

	/**
	 * 要素区分：会社ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が会社ＣＤの値の場合true
	 */
	public static boolean isCO(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.CO.isSame(type);
	}

	/**
	 * 要素区分：取引先ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が取引先ＣＤの値の場合true
	 */
	public static boolean isBP(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP.isSame(type);
	}

	/**
	 * 要素区分：取引先ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が取引先ＣＤの値の場合true
	 */
	public static boolean isBP(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP.isSame(type);
	}

	/**
	 * 要素区分：ワーキンググループＣＤかどうか
	 * @param value 定数値
	 * @return 定数値がワーキンググループＣＤの値の場合true
	 */
	public static boolean isWG(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.WG.isSame(type);
	}

	/**
	 * 要素区分：ワーキンググループＣＤかどうか
	 * @param type 属性値
	 * @return 属性値がワーキンググループＣＤの値の場合true
	 */
	public static boolean isWG(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.WG.isSame(type);
	}

	/**
	 * 要素区分：取引ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が取引ＣＤの値の場合true
	 */
	public static boolean isTRD(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.TRD.isSame(type);
	}

	/**
	 * 要素区分：取引ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が取引ＣＤの値の場合true
	 */
	public static boolean isTRD(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.TRD.isSame(type);
	}

	/**
	 * 要素区分：工場・物流倉庫ＣＤかどうか
	 * @param value 定数値
	 * @return 定数値が工場・物流倉庫ＣＤの値の場合true
	 */
	public static boolean isSITE(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SITE.isSame(type);
	}

	/**
	 * 要素区分：工場・物流倉庫ＣＤかどうか
	 * @param type 属性値
	 * @return 属性値が工場・物流倉庫ＣＤの値の場合true
	 */
	public static boolean isSITE(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SITE.isSame(type);
	}

	/**
	 * 要素区分：ロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がロットＮＯの値の場合true
	 */
	public static boolean isLOT(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.LOT.isSame(type);
	}

	/**
	 * 要素区分：ロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がロットＮＯの値の場合true
	 */
	public static boolean isLOT(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.LOT.isSame(type);
	}

	/**
	 * 要素区分：子品目ロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が子品目ロットＮＯの値の場合true
	 */
	public static boolean isCHD_LOT(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.CHD_LOT.isSame(type);
	}

	/**
	 * 要素区分：子品目ロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が子品目ロットＮＯの値の場合true
	 */
	public static boolean isCHD_LOT(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.CHD_LOT.isSame(type);
	}

	/**
	 * 要素区分：子品目サブロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が子品目サブロットＮＯの値の場合true
	 */
	public static boolean isCHD_SUBLOT(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.CHD_SUBLOT.isSame(type);
	}

	/**
	 * 要素区分：子品目サブロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が子品目サブロットＮＯの値の場合true
	 */
	public static boolean isCHD_SUBLOT(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.CHD_SUBLOT.isSame(type);
	}

	/**
	 * 要素区分：業者ロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が業者ロットＮＯの値の場合true
	 */
	public static boolean isBP_LOT(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_LOT.isSame(type);
	}

	/**
	 * 要素区分：業者ロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が業者ロットＮＯの値の場合true
	 */
	public static boolean isBP_LOT(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_LOT.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ１かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SNO1.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ１かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SNO1.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ２かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SNO2.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ２かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SNO2.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ３かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SNO3.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ３かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SNO3.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ４かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.SNO4.isSame(type);
	}

	/**
	 * 要素区分：手配ＮＯ４かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.SNO4.isSame(type);
	}

	/**
	 * 要素区分：品目（拠点・物流倉庫）かどうか
	 * @param value 定数値
	 * @return 定数値が品目（拠点・物流倉庫）の値の場合true
	 */
	public static boolean isITM_SITE(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_SITE.isSame(type);
	}

	/**
	 * 要素区分：品目（拠点・物流倉庫）かどうか
	 * @param type 属性値
	 * @return 属性値が品目（拠点・物流倉庫）の値の場合true
	 */
	public static boolean isITM_SITE(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_SITE.isSame(type);
	}

	/**
	 * 要素区分：品目分類１かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP01(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP01.isSame(type);
	}

	/**
	 * 要素区分：品目分類１かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP01(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP01.isSame(type);
	}

	/**
	 * 要素区分：品目分類２かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP02(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP02.isSame(type);
	}

	/**
	 * 要素区分：品目分類２かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP02(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP02.isSame(type);
	}

	/**
	 * 要素区分：品目分類３かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP03(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP03.isSame(type);
	}

	/**
	 * 要素区分：品目分類３かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP03(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP03.isSame(type);
	}

	/**
	 * 要素区分：品目分類４かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP04(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP04.isSame(type);
	}

	/**
	 * 要素区分：品目分類４かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP04(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP04.isSame(type);
	}

	/**
	 * 要素区分：品目分類５かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP05(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP05.isSame(type);
	}

	/**
	 * 要素区分：品目分類５かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP05(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP05.isSame(type);
	}

	/**
	 * 要素区分：品目分類６かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP06(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP06.isSame(type);
	}

	/**
	 * 要素区分：品目分類６かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP06(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP06.isSame(type);
	}

	/**
	 * 要素区分：品目分類７かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP07(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP07.isSame(type);
	}

	/**
	 * 要素区分：品目分類７かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP07(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP07.isSame(type);
	}

	/**
	 * 要素区分：品目分類８かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP08(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP08.isSame(type);
	}

	/**
	 * 要素区分：品目分類８かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP08(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP08.isSame(type);
	}

	/**
	 * 要素区分：品目分類９かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP09(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP09.isSame(type);
	}

	/**
	 * 要素区分：品目分類９かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP09(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP09.isSame(type);
	}

	/**
	 * 要素区分：品目分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP10(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.ITM_GRP10.isSame(type);
	}

	/**
	 * 要素区分：品目分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP10(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.ITM_GRP10.isSame(type);
	}

	/**
	 * 要素区分：取引先分類１かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類１の値の場合true
	 */
	public static boolean isBP_GRP01(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP01.isSame(type);
	}

	/**
	 * 要素区分：取引先分類１かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類１の値の場合true
	 */
	public static boolean isBP_GRP01(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP01.isSame(type);
	}

	/**
	 * 要素区分：取引先分類２かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類２の値の場合true
	 */
	public static boolean isBP_GRP02(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP02.isSame(type);
	}

	/**
	 * 要素区分：取引先分類２かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類２の値の場合true
	 */
	public static boolean isBP_GRP02(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP02.isSame(type);
	}

	/**
	 * 要素区分：取引先分類３かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類３の値の場合true
	 */
	public static boolean isBP_GRP03(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP03.isSame(type);
	}

	/**
	 * 要素区分：取引先分類３かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類３の値の場合true
	 */
	public static boolean isBP_GRP03(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP03.isSame(type);
	}

	/**
	 * 要素区分：取引先分類４かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類４の値の場合true
	 */
	public static boolean isBP_GRP04(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP04.isSame(type);
	}

	/**
	 * 要素区分：取引先分類４かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類４の値の場合true
	 */
	public static boolean isBP_GRP04(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP04.isSame(type);
	}

	/**
	 * 要素区分：取引先分類５かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類５の値の場合true
	 */
	public static boolean isBP_GRP05(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP05.isSame(type);
	}

	/**
	 * 要素区分：取引先分類５かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類５の値の場合true
	 */
	public static boolean isBP_GRP05(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP05.isSame(type);
	}

	/**
	 * 要素区分：取引先分類６かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類６の値の場合true
	 */
	public static boolean isBP_GRP06(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP06.isSame(type);
	}

	/**
	 * 要素区分：取引先分類６かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類６の値の場合true
	 */
	public static boolean isBP_GRP06(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP06.isSame(type);
	}

	/**
	 * 要素区分：取引先分類７かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類７の値の場合true
	 */
	public static boolean isBP_GRP07(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP07.isSame(type);
	}

	/**
	 * 要素区分：取引先分類７かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類７の値の場合true
	 */
	public static boolean isBP_GRP07(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP07.isSame(type);
	}

	/**
	 * 要素区分：取引先分類８かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類８の値の場合true
	 */
	public static boolean isBP_GRP08(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP08.isSame(type);
	}

	/**
	 * 要素区分：取引先分類８かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類８の値の場合true
	 */
	public static boolean isBP_GRP08(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP08.isSame(type);
	}

	/**
	 * 要素区分：取引先分類９かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類９の値の場合true
	 */
	public static boolean isBP_GRP09(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP09.isSame(type);
	}

	/**
	 * 要素区分：取引先分類９かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類９の値の場合true
	 */
	public static boolean isBP_GRP09(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP09.isSame(type);
	}

	/**
	 * 要素区分：取引先分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類１０の値の場合true
	 */
	public static boolean isBP_GRP10(String value) {
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		return MAC_ELM_TYP.BP_GRP10.isSame(type);
	}

	/**
	 * 要素区分：取引先分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類１０の値の場合true
	 */
	public static boolean isBP_GRP10(MAC_ELM_TYP type) {
		return MAC_ELM_TYP.BP_GRP10.isSame(type);
	}

	/**
	 * 定数グループの名称を返します。
	 */
	public static String getGrpName() {
		return getGrpName(moduleID, typeID);
	}

	/**
	 * 定数グループの名称を返します。
	 * @param lc ロケール
	 */
	public static String getGrpName(Locale lcl) {
		return getGrpName(lcl, moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 */
	public static String getGrpRmrks() {
		return getGrpRmrks(moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 * @param lc ロケール
	 */
	public static String getGrpRmrks(Locale lcl) {
		return getGrpRmrks(lcl, moduleID, typeID);
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putName(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.get(value);
		row.setString(nameColumn, type.name());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putNameNE(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn , Locale lcl) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putName(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.get(value);
		row.setString(nameColumn, type.name());
		row.setString(rmrksColumn, type.rmrks());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
			row.setString(rmrksColumn, type.rmrks());
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
		row.setString(rmrksColumn, type.rmrks(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MAC_ELM_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MAC_ELM_TYP type = MAC_ELM_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
			row.setString(rmrksColumn, type.rmrks(lcl));
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

}
