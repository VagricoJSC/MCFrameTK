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
abstract class MAC_LOC_IS_SRCH_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "LOC_IS_SRCH_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_LOC_IS_SRCH_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "loc_is_srch_typ";

	public static final String $NAME = "loc_is_srch_typ_nm";

	public static final String $IS_PANEL = "is_panel";

	/*
	 * 定数の定義です。
	 */
	/** 場所入力補助検索区分：全場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP COMM = create("0", "COMM", true);

	/** 場所入力補助検索区分：製造ＷＧ
	 */
	public static final MAC_LOC_IS_SRCH_TYP MFG_WG_ALL = create("1", "MFG_WG_ALL", true);

	/** 場所入力補助検索区分：物流ＷＧ
	 */
	public static final MAC_LOC_IS_SRCH_TYP LG_WG_ALL = create("2", "LG_WG_ALL", true);

	/** 場所入力補助検索区分：製造ＷＧ（絞込み）
	 */
	public static final MAC_LOC_IS_SRCH_TYP MFG_WG = create("3", "MFG_WG", true);

	/** 場所入力補助検索区分：販売資産
	 */
	public static final MAC_LOC_IS_SRCH_TYP SLS = create("4", "SLS", true);

	/** 場所入力補助検索区分：生産資産
	 */
	public static final MAC_LOC_IS_SRCH_TYP PRD = create("5", "PRD", true);

	/** 場所入力補助検索区分：社内
	 */
	public static final MAC_LOC_IS_SRCH_TYP HOUSE = create("6", "HOUSE", true);

	/** 場所入力補助検索区分：社外
	 */
	public static final MAC_LOC_IS_SRCH_TYP OUTSIDE = create("7", "OUTSIDE", true);

	/** 場所入力補助検索区分：生産資産（社内）
	 */
	public static final MAC_LOC_IS_SRCH_TYP PRD_HOUSE = create("8", "PRD_HOUSE", true);

	/** 場所入力補助検索区分：社内（同一ＷＧ）
	 */
	public static final MAC_LOC_IS_SRCH_TYP HOUSE_EQ_WG = create("10", "HOUSE_EQ_WG", true);

	/** 場所入力補助検索区分：棚卸対象場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP STKTK_TGT = create("11", "STKTK_TGT", true);

	/** 場所入力補助検索区分：移動元場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP FR = create("12", "FR", false);

	/** 場所入力補助検索区分：ＷＧ対応場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP WG = create("13", "WG", true);

	/** 場所入力補助検索区分：物流グループ対応場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP LG_GRP = create("14", "LG_GRP", true);

	/** 場所入力補助検索区分：工場・物流倉庫対応場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP SITE = create("15", "SITE", true);

	/** 場所入力補助検索区分：製造場所グループ対応場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP LOC_GRP = create("16", "LOC_GRP", true);

	/** 場所入力補助検索区分：社内（製造ＷＧ）
	 */
	public static final MAC_LOC_IS_SRCH_TYP MFG_WG_HOUSE = create("17", "MFG_WG_HOUSE", true);

	/** 場所入力補助検索区分：社内(物流G)
	 */
	public static final MAC_LOC_IS_SRCH_TYP LG_GRP_HOUSE = create("18", "LG_GRP_HOUSE", false);

	/** 場所入力補助検索区分：社外(物流G)
	 */
	public static final MAC_LOC_IS_SRCH_TYP LG_GRP_OUTSIDE = create("19", "LG_GRP_OUTSIDE", false);

	/** 場所入力補助検索区分：社外（同一ＷＧ）
	 */
	public static final MAC_LOC_IS_SRCH_TYP OUTSIDE_EQ_WG = create("20", "OUTSIDE_EQ_WG", false);

	/** 場所入力補助検索区分：棚・ライン対象場所
	 */
	public static final MAC_LOC_IS_SRCH_TYP STR_LN = create("21", "STR_LN", true);

	/** 場所入力補助検索区分：製造ＷＧ、物流ＷＧ
	 */
	public static final MAC_LOC_IS_SRCH_TYP MFG_LG_WG = create("22", "MFG_LG_WG", true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LOC_IS_SRCH_TYP create() {
		return new MAC_LOC_IS_SRCH_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_LOC_IS_SRCH_TYP get(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		if (type == null) {
			throw MAC_LOC_IS_SRCH_TYP.invalidValue(value);
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
	public static MAC_LOC_IS_SRCH_TYP getNE(String value) {
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LOC_IS_SRCH_TYP create(String value, String xmlKey, boolean attr1) {
		MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_PANEL, attr1);
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
	 * is_panelの値を返します。
	 * @return is_panelの値
	 */
	public boolean is_panel() {
		return constR.getBooleanNE($IS_PANEL);
	}

	/** 
	 * valueに対応する定数のis_panelの値を返します。
	 * @param value 定数値
	 * @return is_panelの値
	 */
	public static boolean is_panel(String value) {
		MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_panel();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
		MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.getNE(value);
		if (me == null) {
			throw MAC_LOC_IS_SRCH_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_panel());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_LOC_IS_SRCH_TYP[] array() {
		if (array == null) {
			array = new MAC_LOC_IS_SRCH_TYP[] {
					MAC_LOC_IS_SRCH_TYP.COMM, MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL, MAC_LOC_IS_SRCH_TYP.LG_WG_ALL, MAC_LOC_IS_SRCH_TYP.MFG_WG, MAC_LOC_IS_SRCH_TYP.SLS, 
					 MAC_LOC_IS_SRCH_TYP.PRD, MAC_LOC_IS_SRCH_TYP.HOUSE, MAC_LOC_IS_SRCH_TYP.OUTSIDE, MAC_LOC_IS_SRCH_TYP.PRD_HOUSE, MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG, MAC_LOC_IS_SRCH_TYP.STKTK_TGT, 
					 MAC_LOC_IS_SRCH_TYP.FR, MAC_LOC_IS_SRCH_TYP.WG, MAC_LOC_IS_SRCH_TYP.LG_GRP, MAC_LOC_IS_SRCH_TYP.SITE, MAC_LOC_IS_SRCH_TYP.LOC_GRP, MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE, 
					 MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE, MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE, MAC_LOC_IS_SRCH_TYP.OUTSIDE_EQ_WG, MAC_LOC_IS_SRCH_TYP.STR_LN, MAC_LOC_IS_SRCH_TYP.MFG_LG_WG
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
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
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
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
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
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
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
			if(MAC_LOC_IS_SRCH_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_LOC_IS_SRCH_TYP me = MAC_LOC_IS_SRCH_TYP.get(MAC_LOC_IS_SRCH_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_LOC_IS_SRCH_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_LOC_IS_SRCH_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_LOC_IS_SRCH_TYP.list();
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
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
			if(MAC_LOC_IS_SRCH_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_LOC_IS_SRCH_TYP.subList(cols, vals);
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
		for (MAC_LOC_IS_SRCH_TYP me : MAC_LOC_IS_SRCH_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_LOC_IS_SRCH_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_LOC_IS_SRCH_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_LOC_IS_SRCH_TYP", col);}
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
	protected boolean isSame(MAC_LOC_IS_SRCH_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 場所入力補助検索区分：全場所かどうか
	 * @param value 定数値
	 * @return 定数値が全場所の値の場合true
	 */
	public static boolean isCOMM(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：全場所かどうか
	 * @param type 属性値
	 * @return 属性値が全場所の値の場合true
	 */
	public static boolean isCOMM(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧかどうか
	 * @param value 定数値
	 * @return 定数値が製造ＷＧの値の場合true
	 */
	public static boolean isMFG_WG_ALL(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧかどうか
	 * @param type 属性値
	 * @return 属性値が製造ＷＧの値の場合true
	 */
	public static boolean isMFG_WG_ALL(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：物流ＷＧかどうか
	 * @param value 定数値
	 * @return 定数値が物流ＷＧの値の場合true
	 */
	public static boolean isLG_WG_ALL(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.LG_WG_ALL.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：物流ＷＧかどうか
	 * @param type 属性値
	 * @return 属性値が物流ＷＧの値の場合true
	 */
	public static boolean isLG_WG_ALL(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.LG_WG_ALL.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧ（絞込み）かどうか
	 * @param value 定数値
	 * @return 定数値が製造ＷＧ（絞込み）の値の場合true
	 */
	public static boolean isMFG_WG(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.MFG_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧ（絞込み）かどうか
	 * @param type 属性値
	 * @return 属性値が製造ＷＧ（絞込み）の値の場合true
	 */
	public static boolean isMFG_WG(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.MFG_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：販売資産かどうか
	 * @param value 定数値
	 * @return 定数値が販売資産の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.SLS.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：販売資産かどうか
	 * @param type 属性値
	 * @return 属性値が販売資産の値の場合true
	 */
	public static boolean isSLS(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.SLS.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：生産資産かどうか
	 * @param value 定数値
	 * @return 定数値が生産資産の値の場合true
	 */
	public static boolean isPRD(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.PRD.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：生産資産かどうか
	 * @param type 属性値
	 * @return 属性値が生産資産の値の場合true
	 */
	public static boolean isPRD(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.PRD.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内かどうか
	 * @param value 定数値
	 * @return 定数値が社内の値の場合true
	 */
	public static boolean isHOUSE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内かどうか
	 * @param type 属性値
	 * @return 属性値が社内の値の場合true
	 */
	public static boolean isHOUSE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外かどうか
	 * @param value 定数値
	 * @return 定数値が社外の値の場合true
	 */
	public static boolean isOUTSIDE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.OUTSIDE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外かどうか
	 * @param type 属性値
	 * @return 属性値が社外の値の場合true
	 */
	public static boolean isOUTSIDE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.OUTSIDE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：生産資産（社内）かどうか
	 * @param value 定数値
	 * @return 定数値が生産資産（社内）の値の場合true
	 */
	public static boolean isPRD_HOUSE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.PRD_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：生産資産（社内）かどうか
	 * @param type 属性値
	 * @return 属性値が生産資産（社内）の値の場合true
	 */
	public static boolean isPRD_HOUSE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.PRD_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内（同一ＷＧ）かどうか
	 * @param value 定数値
	 * @return 定数値が社内（同一ＷＧ）の値の場合true
	 */
	public static boolean isHOUSE_EQ_WG(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内（同一ＷＧ）かどうか
	 * @param type 属性値
	 * @return 属性値が社内（同一ＷＧ）の値の場合true
	 */
	public static boolean isHOUSE_EQ_WG(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.HOUSE_EQ_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：棚卸対象場所かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸対象場所の値の場合true
	 */
	public static boolean isSTKTK_TGT(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.STKTK_TGT.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：棚卸対象場所かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸対象場所の値の場合true
	 */
	public static boolean isSTKTK_TGT(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.STKTK_TGT.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：移動元場所かどうか
	 * @param value 定数値
	 * @return 定数値が移動元場所の値の場合true
	 */
	public static boolean isFR(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.FR.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：移動元場所かどうか
	 * @param type 属性値
	 * @return 属性値が移動元場所の値の場合true
	 */
	public static boolean isFR(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.FR.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：ＷＧ対応場所かどうか
	 * @param value 定数値
	 * @return 定数値がＷＧ対応場所の値の場合true
	 */
	public static boolean isWG(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：ＷＧ対応場所かどうか
	 * @param type 属性値
	 * @return 属性値がＷＧ対応場所の値の場合true
	 */
	public static boolean isWG(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：物流グループ対応場所かどうか
	 * @param value 定数値
	 * @return 定数値が物流グループ対応場所の値の場合true
	 */
	public static boolean isLG_GRP(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.LG_GRP.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：物流グループ対応場所かどうか
	 * @param type 属性値
	 * @return 属性値が物流グループ対応場所の値の場合true
	 */
	public static boolean isLG_GRP(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.LG_GRP.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：工場・物流倉庫対応場所かどうか
	 * @param value 定数値
	 * @return 定数値が工場・物流倉庫対応場所の値の場合true
	 */
	public static boolean isSITE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.SITE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：工場・物流倉庫対応場所かどうか
	 * @param type 属性値
	 * @return 属性値が工場・物流倉庫対応場所の値の場合true
	 */
	public static boolean isSITE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.SITE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造場所グループ対応場所かどうか
	 * @param value 定数値
	 * @return 定数値が製造場所グループ対応場所の値の場合true
	 */
	public static boolean isLOC_GRP(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.LOC_GRP.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造場所グループ対応場所かどうか
	 * @param type 属性値
	 * @return 属性値が製造場所グループ対応場所の値の場合true
	 */
	public static boolean isLOC_GRP(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.LOC_GRP.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内（製造ＷＧ）かどうか
	 * @param value 定数値
	 * @return 定数値が社内（製造ＷＧ）の値の場合true
	 */
	public static boolean isMFG_WG_HOUSE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内（製造ＷＧ）かどうか
	 * @param type 属性値
	 * @return 属性値が社内（製造ＷＧ）の値の場合true
	 */
	public static boolean isMFG_WG_HOUSE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.MFG_WG_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内(物流G)かどうか
	 * @param value 定数値
	 * @return 定数値が社内(物流G)の値の場合true
	 */
	public static boolean isLG_GRP_HOUSE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社内(物流G)かどうか
	 * @param type 属性値
	 * @return 属性値が社内(物流G)の値の場合true
	 */
	public static boolean isLG_GRP_HOUSE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外(物流G)かどうか
	 * @param value 定数値
	 * @return 定数値が社外(物流G)の値の場合true
	 */
	public static boolean isLG_GRP_OUTSIDE(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外(物流G)かどうか
	 * @param type 属性値
	 * @return 属性値が社外(物流G)の値の場合true
	 */
	public static boolean isLG_GRP_OUTSIDE(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外（同一ＷＧ）かどうか
	 * @param value 定数値
	 * @return 定数値が社外（同一ＷＧ）の値の場合true
	 */
	public static boolean isOUTSIDE_EQ_WG(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.OUTSIDE_EQ_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：社外（同一ＷＧ）かどうか
	 * @param type 属性値
	 * @return 属性値が社外（同一ＷＧ）の値の場合true
	 */
	public static boolean isOUTSIDE_EQ_WG(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.OUTSIDE_EQ_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：棚・ライン対象場所かどうか
	 * @param value 定数値
	 * @return 定数値が棚・ライン対象場所の値の場合true
	 */
	public static boolean isSTR_LN(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.STR_LN.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：棚・ライン対象場所かどうか
	 * @param type 属性値
	 * @return 属性値が棚・ライン対象場所の値の場合true
	 */
	public static boolean isSTR_LN(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.STR_LN.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧ、物流ＷＧかどうか
	 * @param value 定数値
	 * @return 定数値が製造ＷＧ、物流ＷＧの値の場合true
	 */
	public static boolean isMFG_LG_WG(String value) {
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
		return MAC_LOC_IS_SRCH_TYP.MFG_LG_WG.isSame(type);
	}

	/**
	 * 場所入力補助検索区分：製造ＷＧ、物流ＷＧかどうか
	 * @param type 属性値
	 * @return 属性値が製造ＷＧ、物流ＷＧの値の場合true
	 */
	public static boolean isMFG_LG_WG(MAC_LOC_IS_SRCH_TYP type) {
		return MAC_LOC_IS_SRCH_TYP.MFG_LG_WG.isSame(type);
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
			MAC_LOC_IS_SRCH_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.get(value);
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
			MAC_LOC_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
			MAC_LOC_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.get(value);
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
			MAC_LOC_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
			MAC_LOC_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.get(value);
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
			MAC_LOC_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
			MAC_LOC_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.get(value);
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
			MAC_LOC_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LOC_IS_SRCH_TYP type = MAC_LOC_IS_SRCH_TYP.getNE(value);
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
