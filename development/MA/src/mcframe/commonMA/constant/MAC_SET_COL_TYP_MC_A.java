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
abstract class MAC_SET_COL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "SET_COL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_SET_COL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "set_col_typ";

	public static final String $NAME = "set_col_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 設定項目区分：場所
	 */
	public static final MAC_SET_COL_TYP LOC = create("211", "LOC");

	/** 設定項目区分：地域
	 */
	public static final MAC_SET_COL_TYP AREA = create("212", "AREA");

	/** 設定項目区分：国
	 */
	public static final MAC_SET_COL_TYP CNTRY = create("213", "CNTRY");

	/** 設定項目区分：担当者
	 */
	public static final MAC_SET_COL_TYP USR = create("214", "USR");

	/** 設定項目区分：会計品目分類
	 */
	public static final MAC_SET_COL_TYP CATEG = create("221", "CATEG");

	/** 設定項目区分：品目仕訳
	 */
	public static final MAC_SET_COL_TYP JNL = create("222", "JNL");

	/** 設定項目区分：売掛先
	 */
	public static final MAC_SET_COL_TYP AR = create("241", "AR");

	/** 設定項目区分：得意先
	 */
	public static final MAC_SET_COL_TYP CST = create("242", "CST");

	/** 設定項目区分：買掛先
	 */
	public static final MAC_SET_COL_TYP AP = create("243", "AP");

	/** 設定項目区分：発注先
	 */
	public static final MAC_SET_COL_TYP SPL = create("244", "SPL");

	/** 設定項目区分：手配ＮＯ１
	 */
	public static final MAC_SET_COL_TYP SNO1 = create("251", "SNO1");

	/** 設定項目区分：手配ＮＯ２
	 */
	public static final MAC_SET_COL_TYP SNO2 = create("252", "SNO2");

	/** 設定項目区分：手配ＮＯ３
	 */
	public static final MAC_SET_COL_TYP SNO3 = create("253", "SNO3");

	/** 設定項目区分：手配ＮＯ４
	 */
	public static final MAC_SET_COL_TYP SNO4 = create("254", "SNO4");

	/** 設定項目区分：予備ＣＨＡＲ項目１
	 */
	public static final MAC_SET_COL_TYP SUB1 = create("301", "SUB1");

	/** 設定項目区分：予備ＣＨＡＲ項目２
	 */
	public static final MAC_SET_COL_TYP SUB2 = create("302", "SUB2");

	/** 設定項目区分：予備ＣＨＡＲ項目３
	 */
	public static final MAC_SET_COL_TYP SUB3 = create("303", "SUB3");

	/** 設定項目区分：予備ＣＨＡＲ項目４
	 */
	public static final MAC_SET_COL_TYP SUB4 = create("304", "SUB4");

	/** 設定項目区分：予備ＣＨＡＲ項目５
	 */
	public static final MAC_SET_COL_TYP SUB5 = create("305", "SUB5");

	/** 設定項目区分：予備ＣＨＡＲ項目６
	 */
	public static final MAC_SET_COL_TYP SUB6 = create("306", "SUB6");

	/** 設定項目区分：予備ＣＨＡＲ項目７
	 */
	public static final MAC_SET_COL_TYP SUB7 = create("307", "SUB7");

	/** 設定項目区分：予備ＣＨＡＲ項目８
	 */
	public static final MAC_SET_COL_TYP SUB8 = create("308", "SUB8");

	/** 設定項目区分：予備ＣＨＡＲ項目９
	 */
	public static final MAC_SET_COL_TYP SUB9 = create("309", "SUB9");

	/** 設定項目区分：予備ＣＨＡＲ項目１０
	 */
	public static final MAC_SET_COL_TYP SUB10 = create("310", "SUB10");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_SET_COL_TYP create() {
		return new MAC_SET_COL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_SET_COL_TYP get(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		if (type == null) {
			throw MAC_SET_COL_TYP.invalidValue(value);
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
	public static MAC_SET_COL_TYP getNE(String value) {
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_SET_COL_TYP create(String value, String xmlKey) {
		MAC_SET_COL_TYP me = MAC_SET_COL_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
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
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_SET_COL_TYP me = MAC_SET_COL_TYP.getNE(value);
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
		MAC_SET_COL_TYP me = MAC_SET_COL_TYP.getNE(value);
		if (me == null) {
			throw MAC_SET_COL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_SET_COL_TYP me = MAC_SET_COL_TYP.getNE(value);
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
		return createStringPath(value(), name());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_SET_COL_TYP[] array() {
		if (array == null) {
			array = new MAC_SET_COL_TYP[] {
					MAC_SET_COL_TYP.LOC, MAC_SET_COL_TYP.AREA, MAC_SET_COL_TYP.CNTRY, MAC_SET_COL_TYP.USR, MAC_SET_COL_TYP.CATEG, 
					 MAC_SET_COL_TYP.JNL, MAC_SET_COL_TYP.AR, MAC_SET_COL_TYP.CST, MAC_SET_COL_TYP.AP, MAC_SET_COL_TYP.SPL, MAC_SET_COL_TYP.SNO1, 
					 MAC_SET_COL_TYP.SNO2, MAC_SET_COL_TYP.SNO3, MAC_SET_COL_TYP.SNO4, MAC_SET_COL_TYP.SUB1, MAC_SET_COL_TYP.SUB2, MAC_SET_COL_TYP.SUB3, 
					 MAC_SET_COL_TYP.SUB4, MAC_SET_COL_TYP.SUB5, MAC_SET_COL_TYP.SUB6, MAC_SET_COL_TYP.SUB7, MAC_SET_COL_TYP.SUB8, MAC_SET_COL_TYP.SUB9, 
					 MAC_SET_COL_TYP.SUB10
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
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
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
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
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
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
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
			if(MAC_SET_COL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_SET_COL_TYP me = MAC_SET_COL_TYP.get(MAC_SET_COL_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_SET_COL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_SET_COL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_SET_COL_TYP.list();
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
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
			if(MAC_SET_COL_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_SET_COL_TYP.subList(cols, vals);
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
		for (MAC_SET_COL_TYP me : MAC_SET_COL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_SET_COL_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_SET_COL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_SET_COL_TYP", col);}
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
	protected boolean isSame(MAC_SET_COL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 設定項目区分：場所かどうか
	 * @param value 定数値
	 * @return 定数値が場所の値の場合true
	 */
	public static boolean isLOC(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.LOC.isSame(type);
	}

	/**
	 * 設定項目区分：場所かどうか
	 * @param type 属性値
	 * @return 属性値が場所の値の場合true
	 */
	public static boolean isLOC(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.LOC.isSame(type);
	}

	/**
	 * 設定項目区分：地域かどうか
	 * @param value 定数値
	 * @return 定数値が地域の値の場合true
	 */
	public static boolean isAREA(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.AREA.isSame(type);
	}

	/**
	 * 設定項目区分：地域かどうか
	 * @param type 属性値
	 * @return 属性値が地域の値の場合true
	 */
	public static boolean isAREA(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.AREA.isSame(type);
	}

	/**
	 * 設定項目区分：国かどうか
	 * @param value 定数値
	 * @return 定数値が国の値の場合true
	 */
	public static boolean isCNTRY(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.CNTRY.isSame(type);
	}

	/**
	 * 設定項目区分：国かどうか
	 * @param type 属性値
	 * @return 属性値が国の値の場合true
	 */
	public static boolean isCNTRY(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.CNTRY.isSame(type);
	}

	/**
	 * 設定項目区分：担当者かどうか
	 * @param value 定数値
	 * @return 定数値が担当者の値の場合true
	 */
	public static boolean isUSR(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.USR.isSame(type);
	}

	/**
	 * 設定項目区分：担当者かどうか
	 * @param type 属性値
	 * @return 属性値が担当者の値の場合true
	 */
	public static boolean isUSR(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.USR.isSame(type);
	}

	/**
	 * 設定項目区分：会計品目分類かどうか
	 * @param value 定数値
	 * @return 定数値が会計品目分類の値の場合true
	 */
	public static boolean isCATEG(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.CATEG.isSame(type);
	}

	/**
	 * 設定項目区分：会計品目分類かどうか
	 * @param type 属性値
	 * @return 属性値が会計品目分類の値の場合true
	 */
	public static boolean isCATEG(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.CATEG.isSame(type);
	}

	/**
	 * 設定項目区分：品目仕訳かどうか
	 * @param value 定数値
	 * @return 定数値が品目仕訳の値の場合true
	 */
	public static boolean isJNL(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.JNL.isSame(type);
	}

	/**
	 * 設定項目区分：品目仕訳かどうか
	 * @param type 属性値
	 * @return 属性値が品目仕訳の値の場合true
	 */
	public static boolean isJNL(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.JNL.isSame(type);
	}

	/**
	 * 設定項目区分：売掛先かどうか
	 * @param value 定数値
	 * @return 定数値が売掛先の値の場合true
	 */
	public static boolean isAR(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.AR.isSame(type);
	}

	/**
	 * 設定項目区分：売掛先かどうか
	 * @param type 属性値
	 * @return 属性値が売掛先の値の場合true
	 */
	public static boolean isAR(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.AR.isSame(type);
	}

	/**
	 * 設定項目区分：得意先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先の値の場合true
	 */
	public static boolean isCST(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.CST.isSame(type);
	}

	/**
	 * 設定項目区分：得意先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先の値の場合true
	 */
	public static boolean isCST(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.CST.isSame(type);
	}

	/**
	 * 設定項目区分：買掛先かどうか
	 * @param value 定数値
	 * @return 定数値が買掛先の値の場合true
	 */
	public static boolean isAP(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.AP.isSame(type);
	}

	/**
	 * 設定項目区分：買掛先かどうか
	 * @param type 属性値
	 * @return 属性値が買掛先の値の場合true
	 */
	public static boolean isAP(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.AP.isSame(type);
	}

	/**
	 * 設定項目区分：発注先かどうか
	 * @param value 定数値
	 * @return 定数値が発注先の値の場合true
	 */
	public static boolean isSPL(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SPL.isSame(type);
	}

	/**
	 * 設定項目区分：発注先かどうか
	 * @param type 属性値
	 * @return 属性値が発注先の値の場合true
	 */
	public static boolean isSPL(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SPL.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ１かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SNO1.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ１かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SNO1.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ２かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SNO2.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ２かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SNO2.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ３かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SNO3.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ３かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SNO3.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ４かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SNO4.isSame(type);
	}

	/**
	 * 設定項目区分：手配ＮＯ４かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SNO4.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目１かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB1(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB1.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目１かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB1(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB1.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目２かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB2(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB2.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目２かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB2(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB2.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目３かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB3(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB3.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目３かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB3(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB3.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目４かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB4(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB4.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目４かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB4(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB4.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目５かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB5(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB5.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目５かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB5(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB5.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目６かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目６の値の場合true
	 */
	public static boolean isSUB6(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB6.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目６かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目６の値の場合true
	 */
	public static boolean isSUB6(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB6.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目７かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目７の値の場合true
	 */
	public static boolean isSUB7(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB7.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目７かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目７の値の場合true
	 */
	public static boolean isSUB7(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB7.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目８かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目８の値の場合true
	 */
	public static boolean isSUB8(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB8.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目８かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目８の値の場合true
	 */
	public static boolean isSUB8(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB8.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目９かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目９の値の場合true
	 */
	public static boolean isSUB9(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB9.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目９かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目９の値の場合true
	 */
	public static boolean isSUB9(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB9.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目１０かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目１０の値の場合true
	 */
	public static boolean isSUB10(String value) {
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
		return MAC_SET_COL_TYP.SUB10.isSame(type);
	}

	/**
	 * 設定項目区分：予備ＣＨＡＲ項目１０かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目１０の値の場合true
	 */
	public static boolean isSUB10(MAC_SET_COL_TYP type) {
		return MAC_SET_COL_TYP.SUB10.isSame(type);
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
			MAC_SET_COL_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.get(value);
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
			MAC_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
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
			MAC_SET_COL_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.get(value);
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
			MAC_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
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
			MAC_SET_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.get(value);
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
			MAC_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
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
			MAC_SET_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.get(value);
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
			MAC_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_SET_COL_TYP type = MAC_SET_COL_TYP.getNE(value);
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
