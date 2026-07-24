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
abstract class MAC_ITM_IS_SRCH_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "ITM_IS_SRCH_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_ITM_IS_SRCH_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "itm_is_srch_typ";

	public static final String $NAME = "itm_is_srch_typ_nm";

	public static final String $STK_MNG_TYP = "stk_mng_typ";

	public static final String $ASSET_MNG_TYP = "asset_mng_typ";

	public static final String $IS_REFERRING_SUNDRY_FLG = "is_referring_sundry_flg";

	public static final String $SUNDRY_FLG = "sundry_flg";

	/*
	 * 定数の定義です。
	 */
	/** 品目入力補助検索区分：全品目（架空品除く）
	 */
	public static final MAC_ITM_IS_SRCH_TYP NOT_ASSET3 = create("0", "NOT_ASSET3", null, null, false, null);

	/** 品目入力補助検索区分：全品目（架空品含む）
	 */
	public static final MAC_ITM_IS_SRCH_TYP COMM = create("1", "COMM", null, null, false, null);

	/** 品目入力補助検索区分：在庫管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1 = create("2", "STK1", "1", null, false, null);

	/** 品目入力補助検索区分：在庫管理対象外品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK2 = create("3", "STK2", "2", null, false, null);

	/** 品目入力補助検索区分：架空品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK3 = create("4", "STK3", "3", null, false, null);

	/** 品目入力補助検索区分：資産管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ASSET1 = create("5", "ASSET1", null, "1", false, null);

	/** 品目入力補助検索区分：資産管理対象外品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ASSET2 = create("6", "ASSET2", null, "2", false, null);

	/** 品目入力補助検索区分：架空品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ASSET3 = create("7", "ASSET3", null, "3", false, null);

	/** 品目入力補助検索区分：在庫管理品かつ資産管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_ASSET1 = create("8", "STK1_ASSET1", "1", "1", false, null);

	/** 品目入力補助検索区分：在庫管理品かつ資産管理対象外品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_ASSET2 = create("9", "STK1_ASSET2", "1", "2", false, null);

	/** 品目入力補助検索区分：在庫管理対象外品かつ資産管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK2_ASSET1 = create("10", "STK2_ASSET1", "2", "1", false, null);

	/** 品目入力補助検索区分：在庫管理対象外品かつ資産管理対象外品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK2_ASSET2 = create("11", "STK2_ASSET2", "2", "2", false, null);

	/** 品目入力補助検索区分：諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP SUNDRY = create("12", "SUNDRY", null, null, true, "1");

	/** 品目入力補助検索区分：在庫管理品かつ非諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_NOT_SUNDRY = create("13", "STK1_NOT_SUNDRY", "1", null, true, "0");

	/** 品目入力補助検索区分：資産管理品かつ非諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ASSET1_NOT_SUNDRY = create("14", "ASSET1_NOT_SUNDRY", null, "1", true, "0");

	/** 品目入力補助検索区分：在庫管理品かつ資産管理品かつ非諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_ASSET1_NOT_SUNDRY = create("15", "STK1_ASSET1_NOT_SUNDRY", "1", "1", true, "0");

	/** 品目入力補助検索区分：在庫管理品かつ資産管理対象外品かつ非諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_ASSET2_NOT_SUNDRY = create("16", "STK1_ASSET2_NOT_SUNDRY", "1", "2", true, "0");

	/** 品目入力補助検索区分：在庫管理対象外品かつ資産管理品かつ非諸口品
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK2_ASSET1_NOT_SUNDRY = create("17", "STK2_ASSET1_NOT_SUNDRY", "2", "1", true, "0");

	/** 品目入力補助検索区分：版管理対象品
	 */
	public static final MAC_ITM_IS_SRCH_TYP VER = create("18", "VER", null, null, false, null);

	/** 品目入力補助検索区分：品目検査パタンマスタ登録済品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ITM_INSP_PTN = create("19", "ITM_INSP_PTN", null, null, false, null);

	/** 品目入力補助検索区分：販売計画品目
	 */
	public static final MAC_ITM_IS_SRCH_TYP SPLN = create("20", "SPLN", null, null, false, null);

	/** 品目入力補助検索区分：資産管理品もしくは架空品
	 */
	public static final MAC_ITM_IS_SRCH_TYP PAR_ITM_BOM = create("21", "PAR_ITM_BOM", null, null, false, null);

	/** 品目入力補助検索区分：構成主品目
	 */
	public static final MAC_ITM_IS_SRCH_TYP COMP_CORE_ITM = create("22", "COMP_CORE_ITM", null, null, false, null);

	/** 品目入力補助検索区分：架空品以外かつ構成・仕様管理するもの以外
	 */
	public static final MAC_ITM_IS_SRCH_TYP NOT_ASSET3_NOT_COMP_SPEC = create("23", "NOT_ASSET3_NOT_COMP_SPEC", null, null, false, null);

	/** 品目入力補助検索区分：在庫管理品かつ構成・仕様管理するもの以外
	 */
	public static final MAC_ITM_IS_SRCH_TYP STK1_NOT_COMP_SPEC = create("24", "STK1_NOT_COMP_SPEC", "1", null, false, null);

	/** 品目入力補助検索区分：購買内示
	 */
	public static final MAC_ITM_IS_SRCH_TYP PURC_FRCST = create("25", "PURC_FRCST", null, null, false, null);

	/** 品目入力補助検索区分：規格検査対象品
	 */
	public static final MAC_ITM_IS_SRCH_TYP ITM_INSP_SPEC = create("26", "ITM_INSP_SPEC", null, null, false, null);

	/** 品目入力補助検索区分：ロット管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP LOT = create("27", "LOT", null, null, false, null);

	/** 品目入力補助検索区分：発注点管理品
	 */
	public static final MAC_ITM_IS_SRCH_TYP OP = create("28", "OP", null, null, false, null);

	/** 品目入力補助検索区分：原価レポートキー構成品
	 */
	public static final MAC_ITM_IS_SRCH_TYP RPT_KEY = create("29", "RPT_KEY", null, null, false, null);

	/** 品目入力補助検索区分：ロット継承先
	 */
	public static final MAC_ITM_IS_SRCH_TYP LOT_INH_DEST = create("30", "LOT_INH_DEST", "1", "1", false, null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ITM_IS_SRCH_TYP create() {
		return new MAC_ITM_IS_SRCH_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_ITM_IS_SRCH_TYP get(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if (type == null) {
			throw MAC_ITM_IS_SRCH_TYP.invalidValue(value);
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
	public static MAC_ITM_IS_SRCH_TYP getNE(String value) {
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ITM_IS_SRCH_TYP create(String value, String xmlKey, String attr1, String attr2, boolean attr3, String attr4) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($STK_MNG_TYP, attr1);
		me.constR.addStringColumn($ASSET_MNG_TYP, attr2);
		me.constR.addBooleanColumn($IS_REFERRING_SUNDRY_FLG, attr3);
		me.constR.addStringColumn($SUNDRY_FLG, attr4);
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
	 * stk_mng_typの値を返します。
	 * @return stk_mng_typの値
	 */
	public String stk_mng_typ() {
		return constR.getStringNE($STK_MNG_TYP);
	}

	/** 
	 * valueに対応する定数のstk_mng_typの値を返します。
	 * @param value 定数値
	 * @return stk_mng_typの値
	 */
	public static String stk_mng_typ(String value) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.stk_mng_typ();
	}

	/** 
	 * asset_mng_typの値を返します。
	 * @return asset_mng_typの値
	 */
	public String asset_mng_typ() {
		return constR.getStringNE($ASSET_MNG_TYP);
	}

	/** 
	 * valueに対応する定数のasset_mng_typの値を返します。
	 * @param value 定数値
	 * @return asset_mng_typの値
	 */
	public static String asset_mng_typ(String value) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.asset_mng_typ();
	}

	/** 
	 * is_referring_sundry_flgの値を返します。
	 * @return is_referring_sundry_flgの値
	 */
	public boolean is_referring_sundry_flg() {
		return constR.getBooleanNE($IS_REFERRING_SUNDRY_FLG);
	}

	/** 
	 * valueに対応する定数のis_referring_sundry_flgの値を返します。
	 * @param value 定数値
	 * @return is_referring_sundry_flgの値
	 */
	public static boolean is_referring_sundry_flg(String value) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_referring_sundry_flg();
	}

	/** 
	 * sundry_flgの値を返します。
	 * @return sundry_flgの値
	 */
	public String sundry_flg() {
		return constR.getStringNE($SUNDRY_FLG);
	}

	/** 
	 * valueに対応する定数のsundry_flgの値を返します。
	 * @param value 定数値
	 * @return sundry_flgの値
	 */
	public static String sundry_flg(String value) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.sundry_flg();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
		if (me == null) {
			throw MAC_ITM_IS_SRCH_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
		return createStringPath(value(), name(), stk_mng_typ(), asset_mng_typ(), is_referring_sundry_flg(), sundry_flg());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_ITM_IS_SRCH_TYP[] array() {
		if (array == null) {
			array = new MAC_ITM_IS_SRCH_TYP[] {
					MAC_ITM_IS_SRCH_TYP.NOT_ASSET3, MAC_ITM_IS_SRCH_TYP.COMM, MAC_ITM_IS_SRCH_TYP.STK1, MAC_ITM_IS_SRCH_TYP.STK2, MAC_ITM_IS_SRCH_TYP.STK3, 
					 MAC_ITM_IS_SRCH_TYP.ASSET1, MAC_ITM_IS_SRCH_TYP.ASSET2, MAC_ITM_IS_SRCH_TYP.ASSET3, MAC_ITM_IS_SRCH_TYP.STK1_ASSET1, MAC_ITM_IS_SRCH_TYP.STK1_ASSET2, MAC_ITM_IS_SRCH_TYP.STK2_ASSET1, 
					 MAC_ITM_IS_SRCH_TYP.STK2_ASSET2, MAC_ITM_IS_SRCH_TYP.SUNDRY, MAC_ITM_IS_SRCH_TYP.STK1_NOT_SUNDRY, MAC_ITM_IS_SRCH_TYP.ASSET1_NOT_SUNDRY, MAC_ITM_IS_SRCH_TYP.STK1_ASSET1_NOT_SUNDRY, MAC_ITM_IS_SRCH_TYP.STK1_ASSET2_NOT_SUNDRY, 
					 MAC_ITM_IS_SRCH_TYP.STK2_ASSET1_NOT_SUNDRY, MAC_ITM_IS_SRCH_TYP.VER, MAC_ITM_IS_SRCH_TYP.ITM_INSP_PTN, MAC_ITM_IS_SRCH_TYP.SPLN, MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM, MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM, 
					 MAC_ITM_IS_SRCH_TYP.NOT_ASSET3_NOT_COMP_SPEC, MAC_ITM_IS_SRCH_TYP.STK1_NOT_COMP_SPEC, MAC_ITM_IS_SRCH_TYP.PURC_FRCST, MAC_ITM_IS_SRCH_TYP.ITM_INSP_SPEC, MAC_ITM_IS_SRCH_TYP.LOT, MAC_ITM_IS_SRCH_TYP.OP, 
					 MAC_ITM_IS_SRCH_TYP.RPT_KEY, MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST
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
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
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
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
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
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
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
			if(MAC_ITM_IS_SRCH_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_ITM_IS_SRCH_TYP me = MAC_ITM_IS_SRCH_TYP.get(MAC_ITM_IS_SRCH_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_ITM_IS_SRCH_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_ITM_IS_SRCH_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_ITM_IS_SRCH_TYP.list();
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
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
			if(MAC_ITM_IS_SRCH_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_ITM_IS_SRCH_TYP.subList(cols, vals);
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
		for (MAC_ITM_IS_SRCH_TYP me : MAC_ITM_IS_SRCH_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_ITM_IS_SRCH_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_ITM_IS_SRCH_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_ITM_IS_SRCH_TYP", col);}
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
	protected boolean isSame(MAC_ITM_IS_SRCH_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 品目入力補助検索区分：全品目（架空品除く）かどうか
	 * @param value 定数値
	 * @return 定数値が全品目（架空品除く）の値の場合true
	 */
	public static boolean isNOT_ASSET3(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：全品目（架空品除く）かどうか
	 * @param type 属性値
	 * @return 属性値が全品目（架空品除く）の値の場合true
	 */
	public static boolean isNOT_ASSET3(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：全品目（架空品含む）かどうか
	 * @param value 定数値
	 * @return 定数値が全品目（架空品含む）の値の場合true
	 */
	public static boolean isCOMM(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：全品目（架空品含む）かどうか
	 * @param type 属性値
	 * @return 属性値が全品目（架空品含む）の値の場合true
	 */
	public static boolean isCOMM(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品の値の場合true
	 */
	public static boolean isSTK1(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品の値の場合true
	 */
	public static boolean isSTK1(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理対象外品の値の場合true
	 */
	public static boolean isSTK2(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理対象外品の値の場合true
	 */
	public static boolean isSTK2(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品かどうか
	 * @param value 定数値
	 * @return 定数値が架空品の値の場合true
	 */
	public static boolean isSTK3(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品かどうか
	 * @param type 属性値
	 * @return 属性値が架空品の値の場合true
	 */
	public static boolean isSTK3(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品かどうか
	 * @param value 定数値
	 * @return 定数値が資産管理品の値の場合true
	 */
	public static boolean isASSET1(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品かどうか
	 * @param type 属性値
	 * @return 属性値が資産管理品の値の場合true
	 */
	public static boolean isASSET1(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理対象外品かどうか
	 * @param value 定数値
	 * @return 定数値が資産管理対象外品の値の場合true
	 */
	public static boolean isASSET2(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理対象外品かどうか
	 * @param type 属性値
	 * @return 属性値が資産管理対象外品の値の場合true
	 */
	public static boolean isASSET2(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品かどうか
	 * @param value 定数値
	 * @return 定数値が架空品の値の場合true
	 */
	public static boolean isASSET3(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ASSET3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品かどうか
	 * @param type 属性値
	 * @return 属性値が架空品の値の場合true
	 */
	public static boolean isASSET3(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ASSET3.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ資産管理品の値の場合true
	 */
	public static boolean isSTK1_ASSET1(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ資産管理品の値の場合true
	 */
	public static boolean isSTK1_ASSET1(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理対象外品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ資産管理対象外品の値の場合true
	 */
	public static boolean isSTK1_ASSET2(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理対象外品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ資産管理対象外品の値の場合true
	 */
	public static boolean isSTK1_ASSET2(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理対象外品かつ資産管理品の値の場合true
	 */
	public static boolean isSTK2_ASSET1(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理対象外品かつ資産管理品の値の場合true
	 */
	public static boolean isSTK2_ASSET1(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET1.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理対象外品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理対象外品かつ資産管理対象外品の値の場合true
	 */
	public static boolean isSTK2_ASSET2(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理対象外品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理対象外品かつ資産管理対象外品の値の場合true
	 */
	public static boolean isSTK2_ASSET2(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET2.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が諸口品の値の場合true
	 */
	public static boolean isSUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が諸口品の値の場合true
	 */
	public static boolean isSUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ非諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_NOT_SUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ非諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_NOT_SUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品かつ非諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isASSET1_NOT_SUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品かつ非諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isASSET1_NOT_SUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理品かつ非諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_ASSET1_NOT_SUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理品かつ非諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_ASSET1_NOT_SUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理対象外品かつ非諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ資産管理対象外品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_ASSET2_NOT_SUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET2_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ資産管理対象外品かつ非諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ資産管理対象外品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK1_ASSET2_NOT_SUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_ASSET2_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理品かつ非諸口品かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理対象外品かつ資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK2_ASSET1_NOT_SUNDRY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理対象外品かつ資産管理品かつ非諸口品かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理対象外品かつ資産管理品かつ非諸口品の値の場合true
	 */
	public static boolean isSTK2_ASSET1_NOT_SUNDRY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK2_ASSET1_NOT_SUNDRY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：版管理対象品かどうか
	 * @param value 定数値
	 * @return 定数値が版管理対象品の値の場合true
	 */
	public static boolean isVER(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.VER.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：版管理対象品かどうか
	 * @param type 属性値
	 * @return 属性値が版管理対象品の値の場合true
	 */
	public static boolean isVER(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.VER.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：品目検査パタンマスタ登録済品かどうか
	 * @param value 定数値
	 * @return 定数値が品目検査パタンマスタ登録済品の値の場合true
	 */
	public static boolean isITM_INSP_PTN(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ITM_INSP_PTN.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：品目検査パタンマスタ登録済品かどうか
	 * @param type 属性値
	 * @return 属性値が品目検査パタンマスタ登録済品の値の場合true
	 */
	public static boolean isITM_INSP_PTN(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ITM_INSP_PTN.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：販売計画品目かどうか
	 * @param value 定数値
	 * @return 定数値が販売計画品目の値の場合true
	 */
	public static boolean isSPLN(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.SPLN.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：販売計画品目かどうか
	 * @param type 属性値
	 * @return 属性値が販売計画品目の値の場合true
	 */
	public static boolean isSPLN(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.SPLN.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品もしくは架空品かどうか
	 * @param value 定数値
	 * @return 定数値が資産管理品もしくは架空品の値の場合true
	 */
	public static boolean isPAR_ITM_BOM(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：資産管理品もしくは架空品かどうか
	 * @param type 属性値
	 * @return 属性値が資産管理品もしくは架空品の値の場合true
	 */
	public static boolean isPAR_ITM_BOM(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.PAR_ITM_BOM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：構成主品目かどうか
	 * @param value 定数値
	 * @return 定数値が構成主品目の値の場合true
	 */
	public static boolean isCOMP_CORE_ITM(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：構成主品目かどうか
	 * @param type 属性値
	 * @return 属性値が構成主品目の値の場合true
	 */
	public static boolean isCOMP_CORE_ITM(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.COMP_CORE_ITM.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品以外かつ構成・仕様管理するもの以外かどうか
	 * @param value 定数値
	 * @return 定数値が架空品以外かつ構成・仕様管理するもの以外の値の場合true
	 */
	public static boolean isNOT_ASSET3_NOT_COMP_SPEC(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.NOT_ASSET3_NOT_COMP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：架空品以外かつ構成・仕様管理するもの以外かどうか
	 * @param type 属性値
	 * @return 属性値が架空品以外かつ構成・仕様管理するもの以外の値の場合true
	 */
	public static boolean isNOT_ASSET3_NOT_COMP_SPEC(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.NOT_ASSET3_NOT_COMP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ構成・仕様管理するもの以外かどうか
	 * @param value 定数値
	 * @return 定数値が在庫管理品かつ構成・仕様管理するもの以外の値の場合true
	 */
	public static boolean isSTK1_NOT_COMP_SPEC(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.STK1_NOT_COMP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：在庫管理品かつ構成・仕様管理するもの以外かどうか
	 * @param type 属性値
	 * @return 属性値が在庫管理品かつ構成・仕様管理するもの以外の値の場合true
	 */
	public static boolean isSTK1_NOT_COMP_SPEC(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.STK1_NOT_COMP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：購買内示かどうか
	 * @param value 定数値
	 * @return 定数値が購買内示の値の場合true
	 */
	public static boolean isPURC_FRCST(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.PURC_FRCST.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：購買内示かどうか
	 * @param type 属性値
	 * @return 属性値が購買内示の値の場合true
	 */
	public static boolean isPURC_FRCST(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.PURC_FRCST.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：規格検査対象品かどうか
	 * @param value 定数値
	 * @return 定数値が規格検査対象品の値の場合true
	 */
	public static boolean isITM_INSP_SPEC(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.ITM_INSP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：規格検査対象品かどうか
	 * @param type 属性値
	 * @return 属性値が規格検査対象品の値の場合true
	 */
	public static boolean isITM_INSP_SPEC(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.ITM_INSP_SPEC.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：ロット管理品かどうか
	 * @param value 定数値
	 * @return 定数値がロット管理品の値の場合true
	 */
	public static boolean isLOT(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.LOT.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：ロット管理品かどうか
	 * @param type 属性値
	 * @return 属性値がロット管理品の値の場合true
	 */
	public static boolean isLOT(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.LOT.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：発注点管理品かどうか
	 * @param value 定数値
	 * @return 定数値が発注点管理品の値の場合true
	 */
	public static boolean isOP(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.OP.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：発注点管理品かどうか
	 * @param type 属性値
	 * @return 属性値が発注点管理品の値の場合true
	 */
	public static boolean isOP(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.OP.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：原価レポートキー構成品かどうか
	 * @param value 定数値
	 * @return 定数値が原価レポートキー構成品の値の場合true
	 */
	public static boolean isRPT_KEY(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.RPT_KEY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：原価レポートキー構成品かどうか
	 * @param type 属性値
	 * @return 属性値が原価レポートキー構成品の値の場合true
	 */
	public static boolean isRPT_KEY(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.RPT_KEY.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：ロット継承先かどうか
	 * @param value 定数値
	 * @return 定数値がロット継承先の値の場合true
	 */
	public static boolean isLOT_INH_DEST(String value) {
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
		return MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST.isSame(type);
	}

	/**
	 * 品目入力補助検索区分：ロット継承先かどうか
	 * @param type 属性値
	 * @return 属性値がロット継承先の値の場合true
	 */
	public static boolean isLOT_INH_DEST(MAC_ITM_IS_SRCH_TYP type) {
		return MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST.isSame(type);
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
			MAC_ITM_IS_SRCH_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.get(value);
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
			MAC_ITM_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
			MAC_ITM_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.get(value);
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
			MAC_ITM_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
			MAC_ITM_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.get(value);
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
			MAC_ITM_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
			MAC_ITM_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.get(value);
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
			MAC_ITM_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_ITM_IS_SRCH_TYP type = MAC_ITM_IS_SRCH_TYP.getNE(value);
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
