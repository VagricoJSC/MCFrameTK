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
abstract class MAC_DPT_IS_SRCH_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "DPT_IS_SRCH_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_DPT_IS_SRCH_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "dpt_is_srch_typ";

	public static final String $NAME = "dpt_is_srch_typ_nm";

	public static final String $IS_PANEL = "is_panel";

	/*
	 * 定数の定義です。
	 */
	/** 部門入力補助検索区分：全部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP COMM = create("0", "COMM", true);

	/** 部門入力補助検索区分：資産管理部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP ASST = create("1", "ASST", true);

	/** 部門入力補助検索区分：債権部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP AR = create("2", "AR", true);

	/** 部門入力補助検索区分：債務部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP AP = create("3", "AP", true);

	/** 部門入力補助検索区分：営業部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP SLS = create("4", "SLS", true);

	/** 部門入力補助検索区分：購買部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP PURC = create("5", "PURC", true);

	/** 部門入力補助検索区分：出荷部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP SHIP = create("6", "SHIP", true);

	/** 部門入力補助検索区分：入荷部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP ARR = create("7", "ARR", true);

	/** 部門入力補助検索区分：製造部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP MFG = create("8", "MFG", true);

	/** 部門入力補助検索区分：需給部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP SD = create("9", "SD", true);

	/** 部門入力補助検索区分：検査部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP INSP = create("10", "INSP", true);

	/** 部門入力補助検索区分：負担部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP BD = create("11", "BD", true);

	/** 部門入力補助検索区分：債権債務負担部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP ARAPBD = create("12", "ARAPBD", true);

	/** 部門入力補助検索区分：請求部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP BCST = create("13", "BCST", false);

	/** 部門入力補助検索区分：実行部門
	 */
	public static final MAC_DPT_IS_SRCH_TYP SCE = create("14", "SCE", true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_DPT_IS_SRCH_TYP create() {
		return new MAC_DPT_IS_SRCH_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_DPT_IS_SRCH_TYP get(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		if (type == null) {
			throw MAC_DPT_IS_SRCH_TYP.invalidValue(value);
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
	public static MAC_DPT_IS_SRCH_TYP getNE(String value) {
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_DPT_IS_SRCH_TYP create(String value, String xmlKey, boolean attr1) {
		MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.create();
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
		MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
		MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
		MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.getNE(value);
		if (me == null) {
			throw MAC_DPT_IS_SRCH_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
	public static MAC_DPT_IS_SRCH_TYP[] array() {
		if (array == null) {
			array = new MAC_DPT_IS_SRCH_TYP[] {
					MAC_DPT_IS_SRCH_TYP.COMM, MAC_DPT_IS_SRCH_TYP.ASST, MAC_DPT_IS_SRCH_TYP.AR, MAC_DPT_IS_SRCH_TYP.AP, MAC_DPT_IS_SRCH_TYP.SLS, 
					 MAC_DPT_IS_SRCH_TYP.PURC, MAC_DPT_IS_SRCH_TYP.SHIP, MAC_DPT_IS_SRCH_TYP.ARR, MAC_DPT_IS_SRCH_TYP.MFG, MAC_DPT_IS_SRCH_TYP.SD, MAC_DPT_IS_SRCH_TYP.INSP, 
					 MAC_DPT_IS_SRCH_TYP.BD, MAC_DPT_IS_SRCH_TYP.ARAPBD, MAC_DPT_IS_SRCH_TYP.BCST, MAC_DPT_IS_SRCH_TYP.SCE
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
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
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
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
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
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
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
			if(MAC_DPT_IS_SRCH_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_DPT_IS_SRCH_TYP me = MAC_DPT_IS_SRCH_TYP.get(MAC_DPT_IS_SRCH_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_DPT_IS_SRCH_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_DPT_IS_SRCH_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_DPT_IS_SRCH_TYP.list();
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
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
			if(MAC_DPT_IS_SRCH_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_DPT_IS_SRCH_TYP.subList(cols, vals);
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
		for (MAC_DPT_IS_SRCH_TYP me : MAC_DPT_IS_SRCH_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_DPT_IS_SRCH_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_DPT_IS_SRCH_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_DPT_IS_SRCH_TYP", col);}
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
	protected boolean isSame(MAC_DPT_IS_SRCH_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 部門入力補助検索区分：全部門かどうか
	 * @param value 定数値
	 * @return 定数値が全部門の値の場合true
	 */
	public static boolean isCOMM(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：全部門かどうか
	 * @param type 属性値
	 * @return 属性値が全部門の値の場合true
	 */
	public static boolean isCOMM(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.COMM.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：資産管理部門かどうか
	 * @param value 定数値
	 * @return 定数値が資産管理部門の値の場合true
	 */
	public static boolean isASST(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.ASST.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：資産管理部門かどうか
	 * @param type 属性値
	 * @return 属性値が資産管理部門の値の場合true
	 */
	public static boolean isASST(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.ASST.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債権部門かどうか
	 * @param value 定数値
	 * @return 定数値が債権部門の値の場合true
	 */
	public static boolean isAR(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.AR.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債権部門かどうか
	 * @param type 属性値
	 * @return 属性値が債権部門の値の場合true
	 */
	public static boolean isAR(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.AR.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債務部門かどうか
	 * @param value 定数値
	 * @return 定数値が債務部門の値の場合true
	 */
	public static boolean isAP(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.AP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債務部門かどうか
	 * @param type 属性値
	 * @return 属性値が債務部門の値の場合true
	 */
	public static boolean isAP(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.AP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：営業部門かどうか
	 * @param value 定数値
	 * @return 定数値が営業部門の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.SLS.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：営業部門かどうか
	 * @param type 属性値
	 * @return 属性値が営業部門の値の場合true
	 */
	public static boolean isSLS(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.SLS.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：購買部門かどうか
	 * @param value 定数値
	 * @return 定数値が購買部門の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.PURC.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：購買部門かどうか
	 * @param type 属性値
	 * @return 属性値が購買部門の値の場合true
	 */
	public static boolean isPURC(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.PURC.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：出荷部門かどうか
	 * @param value 定数値
	 * @return 定数値が出荷部門の値の場合true
	 */
	public static boolean isSHIP(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.SHIP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：出荷部門かどうか
	 * @param type 属性値
	 * @return 属性値が出荷部門の値の場合true
	 */
	public static boolean isSHIP(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.SHIP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：入荷部門かどうか
	 * @param value 定数値
	 * @return 定数値が入荷部門の値の場合true
	 */
	public static boolean isARR(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.ARR.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：入荷部門かどうか
	 * @param type 属性値
	 * @return 属性値が入荷部門の値の場合true
	 */
	public static boolean isARR(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.ARR.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：製造部門かどうか
	 * @param value 定数値
	 * @return 定数値が製造部門の値の場合true
	 */
	public static boolean isMFG(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.MFG.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：製造部門かどうか
	 * @param type 属性値
	 * @return 属性値が製造部門の値の場合true
	 */
	public static boolean isMFG(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.MFG.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：需給部門かどうか
	 * @param value 定数値
	 * @return 定数値が需給部門の値の場合true
	 */
	public static boolean isSD(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.SD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：需給部門かどうか
	 * @param type 属性値
	 * @return 属性値が需給部門の値の場合true
	 */
	public static boolean isSD(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.SD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：検査部門かどうか
	 * @param value 定数値
	 * @return 定数値が検査部門の値の場合true
	 */
	public static boolean isINSP(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.INSP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：検査部門かどうか
	 * @param type 属性値
	 * @return 属性値が検査部門の値の場合true
	 */
	public static boolean isINSP(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.INSP.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：負担部門かどうか
	 * @param value 定数値
	 * @return 定数値が負担部門の値の場合true
	 */
	public static boolean isBD(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.BD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：負担部門かどうか
	 * @param type 属性値
	 * @return 属性値が負担部門の値の場合true
	 */
	public static boolean isBD(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.BD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債権債務負担部門かどうか
	 * @param value 定数値
	 * @return 定数値が債権債務負担部門の値の場合true
	 */
	public static boolean isARAPBD(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.ARAPBD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：債権債務負担部門かどうか
	 * @param type 属性値
	 * @return 属性値が債権債務負担部門の値の場合true
	 */
	public static boolean isARAPBD(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.ARAPBD.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：請求部門かどうか
	 * @param value 定数値
	 * @return 定数値が請求部門の値の場合true
	 */
	public static boolean isBCST(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.BCST.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：請求部門かどうか
	 * @param type 属性値
	 * @return 属性値が請求部門の値の場合true
	 */
	public static boolean isBCST(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.BCST.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：実行部門かどうか
	 * @param value 定数値
	 * @return 定数値が実行部門の値の場合true
	 */
	public static boolean isSCE(String value) {
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
		return MAC_DPT_IS_SRCH_TYP.SCE.isSame(type);
	}

	/**
	 * 部門入力補助検索区分：実行部門かどうか
	 * @param type 属性値
	 * @return 属性値が実行部門の値の場合true
	 */
	public static boolean isSCE(MAC_DPT_IS_SRCH_TYP type) {
		return MAC_DPT_IS_SRCH_TYP.SCE.isSame(type);
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
			MAC_DPT_IS_SRCH_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.get(value);
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
			MAC_DPT_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
			MAC_DPT_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.get(value);
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
			MAC_DPT_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
			MAC_DPT_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.get(value);
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
			MAC_DPT_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
			MAC_DPT_IS_SRCH_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.get(value);
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
			MAC_DPT_IS_SRCH_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_DPT_IS_SRCH_TYP type = MAC_DPT_IS_SRCH_TYP.getNE(value);
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
