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
abstract class MAC_ABS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "ABS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_ABS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "abs_typ";

	public static final String $NAME = "abs_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 摘要区分：マスタ値
	 */
	public static final MAC_ABS_TYP MST = create("M", "MST");

	/** 摘要区分：伝票ＮＯ情報
	 */
	public static final MAC_ABS_TYP SLIP = create("1", "SLIP");

	/** 摘要区分：インボイスＮＯ/請求ＮＯ
	 */
	public static final MAC_ABS_TYP INV = create("2", "INV");

	/** 摘要区分：口座名称
	 */
	public static final MAC_ABS_TYP AC = create("3", "AC");

	/** 摘要区分：振込人名
	 */
	public static final MAC_ABS_TYP TRANS = create("4", "TRANS");

	/** 摘要区分：品名
	 */
	public static final MAC_ABS_TYP ITM = create("5", "ITM");

	/** 摘要区分：発注ＮＯ/受注ＮＯ
	 */
	public static final MAC_ABS_TYP ORD_NO = create("6", "ORD_NO");

	/** 摘要区分：取引備考
	 */
	public static final MAC_ABS_TYP TRD_RMRKS = create("7", "TRD_RMRKS");

	/** 摘要区分：取引明細備考
	 */
	public static final MAC_ABS_TYP TRD_D_RMRKS = create("8", "TRD_D_RMRKS");

	/** 摘要区分：売掛先名/買掛先名
	 */
	public static final MAC_ABS_TYP APAR = create("A", "APAR");

	/** 摘要区分：得意先名/発注先名
	 */
	public static final MAC_ABS_TYP CSTSPL = create("B", "CSTSPL");

	/** 摘要区分：入金先名/支払先名
	 */
	public static final MAC_ABS_TYP CRE = create("C", "CRE");

	/** 摘要区分：相殺先名
	 */
	public static final MAC_ABS_TYP SO = create("D", "SO");

	/** 摘要区分：振替先品名
	 */
	public static final MAC_ABS_TYP TRD = create("E", "TRD");

	/** 摘要区分：案件ＮＯ
	 */
	public static final MAC_ABS_TYP WRK = create("F", "WRK");

	/** 摘要区分：予備ＣＨＡＲ項目１
	 */
	public static final MAC_ABS_TYP SUB1 = create("V", "SUB1");

	/** 摘要区分：予備ＣＨＡＲ項目２
	 */
	public static final MAC_ABS_TYP SUB2 = create("W", "SUB2");

	/** 摘要区分：予備ＣＨＡＲ項目３
	 */
	public static final MAC_ABS_TYP SUB3 = create("X", "SUB3");

	/** 摘要区分：予備ＣＨＡＲ項目４
	 */
	public static final MAC_ABS_TYP SUB4 = create("Y", "SUB4");

	/** 摘要区分：予備ＣＨＡＲ項目５
	 */
	public static final MAC_ABS_TYP SUB5 = create("Z", "SUB5");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ABS_TYP create() {
		return new MAC_ABS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_ABS_TYP get(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		if (type == null) {
			throw MAC_ABS_TYP.invalidValue(value);
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
	public static MAC_ABS_TYP getNE(String value) {
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_ABS_TYP create(String value, String xmlKey) {
		MAC_ABS_TYP me = MAC_ABS_TYP.create();
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
		MAC_ABS_TYP me = MAC_ABS_TYP.getNE(value);
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
		MAC_ABS_TYP me = MAC_ABS_TYP.getNE(value);
		if (me == null) {
			throw MAC_ABS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_ABS_TYP me = MAC_ABS_TYP.getNE(value);
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
	public static MAC_ABS_TYP[] array() {
		if (array == null) {
			array = new MAC_ABS_TYP[] {
					MAC_ABS_TYP.MST, MAC_ABS_TYP.SLIP, MAC_ABS_TYP.INV, MAC_ABS_TYP.AC, MAC_ABS_TYP.TRANS, 
					 MAC_ABS_TYP.ITM, MAC_ABS_TYP.ORD_NO, MAC_ABS_TYP.TRD_RMRKS, MAC_ABS_TYP.TRD_D_RMRKS, MAC_ABS_TYP.APAR, MAC_ABS_TYP.CSTSPL, 
					 MAC_ABS_TYP.CRE, MAC_ABS_TYP.SO, MAC_ABS_TYP.TRD, MAC_ABS_TYP.WRK, MAC_ABS_TYP.SUB1, MAC_ABS_TYP.SUB2, 
					 MAC_ABS_TYP.SUB3, MAC_ABS_TYP.SUB4, MAC_ABS_TYP.SUB5
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
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
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
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
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
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
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
			if(MAC_ABS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_ABS_TYP me = MAC_ABS_TYP.get(MAC_ABS_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_ABS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_ABS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_ABS_TYP.list();
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
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
			if(MAC_ABS_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_ABS_TYP.subList(cols, vals);
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
		for (MAC_ABS_TYP me : MAC_ABS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_ABS_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_ABS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_ABS_TYP", col);}
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
	protected boolean isSame(MAC_ABS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 摘要区分：マスタ値かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ値の値の場合true
	 */
	public static boolean isMST(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.MST.isSame(type);
	}

	/**
	 * 摘要区分：マスタ値かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ値の値の場合true
	 */
	public static boolean isMST(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.MST.isSame(type);
	}

	/**
	 * 摘要区分：伝票ＮＯ情報かどうか
	 * @param value 定数値
	 * @return 定数値が伝票ＮＯ情報の値の場合true
	 */
	public static boolean isSLIP(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SLIP.isSame(type);
	}

	/**
	 * 摘要区分：伝票ＮＯ情報かどうか
	 * @param type 属性値
	 * @return 属性値が伝票ＮＯ情報の値の場合true
	 */
	public static boolean isSLIP(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SLIP.isSame(type);
	}

	/**
	 * 摘要区分：インボイスＮＯ/請求ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がインボイスＮＯ/請求ＮＯの値の場合true
	 */
	public static boolean isINV(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.INV.isSame(type);
	}

	/**
	 * 摘要区分：インボイスＮＯ/請求ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がインボイスＮＯ/請求ＮＯの値の場合true
	 */
	public static boolean isINV(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.INV.isSame(type);
	}

	/**
	 * 摘要区分：口座名称かどうか
	 * @param value 定数値
	 * @return 定数値が口座名称の値の場合true
	 */
	public static boolean isAC(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.AC.isSame(type);
	}

	/**
	 * 摘要区分：口座名称かどうか
	 * @param type 属性値
	 * @return 属性値が口座名称の値の場合true
	 */
	public static boolean isAC(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.AC.isSame(type);
	}

	/**
	 * 摘要区分：振込人名かどうか
	 * @param value 定数値
	 * @return 定数値が振込人名の値の場合true
	 */
	public static boolean isTRANS(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.TRANS.isSame(type);
	}

	/**
	 * 摘要区分：振込人名かどうか
	 * @param type 属性値
	 * @return 属性値が振込人名の値の場合true
	 */
	public static boolean isTRANS(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.TRANS.isSame(type);
	}

	/**
	 * 摘要区分：品名かどうか
	 * @param value 定数値
	 * @return 定数値が品名の値の場合true
	 */
	public static boolean isITM(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.ITM.isSame(type);
	}

	/**
	 * 摘要区分：品名かどうか
	 * @param type 属性値
	 * @return 属性値が品名の値の場合true
	 */
	public static boolean isITM(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.ITM.isSame(type);
	}

	/**
	 * 摘要区分：発注ＮＯ/受注ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注ＮＯ/受注ＮＯの値の場合true
	 */
	public static boolean isORD_NO(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.ORD_NO.isSame(type);
	}

	/**
	 * 摘要区分：発注ＮＯ/受注ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注ＮＯ/受注ＮＯの値の場合true
	 */
	public static boolean isORD_NO(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.ORD_NO.isSame(type);
	}

	/**
	 * 摘要区分：取引備考かどうか
	 * @param value 定数値
	 * @return 定数値が取引備考の値の場合true
	 */
	public static boolean isTRD_RMRKS(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.TRD_RMRKS.isSame(type);
	}

	/**
	 * 摘要区分：取引備考かどうか
	 * @param type 属性値
	 * @return 属性値が取引備考の値の場合true
	 */
	public static boolean isTRD_RMRKS(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.TRD_RMRKS.isSame(type);
	}

	/**
	 * 摘要区分：取引明細備考かどうか
	 * @param value 定数値
	 * @return 定数値が取引明細備考の値の場合true
	 */
	public static boolean isTRD_D_RMRKS(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.TRD_D_RMRKS.isSame(type);
	}

	/**
	 * 摘要区分：取引明細備考かどうか
	 * @param type 属性値
	 * @return 属性値が取引明細備考の値の場合true
	 */
	public static boolean isTRD_D_RMRKS(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.TRD_D_RMRKS.isSame(type);
	}

	/**
	 * 摘要区分：売掛先名/買掛先名かどうか
	 * @param value 定数値
	 * @return 定数値が売掛先名/買掛先名の値の場合true
	 */
	public static boolean isAPAR(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.APAR.isSame(type);
	}

	/**
	 * 摘要区分：売掛先名/買掛先名かどうか
	 * @param type 属性値
	 * @return 属性値が売掛先名/買掛先名の値の場合true
	 */
	public static boolean isAPAR(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.APAR.isSame(type);
	}

	/**
	 * 摘要区分：得意先名/発注先名かどうか
	 * @param value 定数値
	 * @return 定数値が得意先名/発注先名の値の場合true
	 */
	public static boolean isCSTSPL(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.CSTSPL.isSame(type);
	}

	/**
	 * 摘要区分：得意先名/発注先名かどうか
	 * @param type 属性値
	 * @return 属性値が得意先名/発注先名の値の場合true
	 */
	public static boolean isCSTSPL(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.CSTSPL.isSame(type);
	}

	/**
	 * 摘要区分：入金先名/支払先名かどうか
	 * @param value 定数値
	 * @return 定数値が入金先名/支払先名の値の場合true
	 */
	public static boolean isCRE(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.CRE.isSame(type);
	}

	/**
	 * 摘要区分：入金先名/支払先名かどうか
	 * @param type 属性値
	 * @return 属性値が入金先名/支払先名の値の場合true
	 */
	public static boolean isCRE(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.CRE.isSame(type);
	}

	/**
	 * 摘要区分：相殺先名かどうか
	 * @param value 定数値
	 * @return 定数値が相殺先名の値の場合true
	 */
	public static boolean isSO(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SO.isSame(type);
	}

	/**
	 * 摘要区分：相殺先名かどうか
	 * @param type 属性値
	 * @return 属性値が相殺先名の値の場合true
	 */
	public static boolean isSO(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SO.isSame(type);
	}

	/**
	 * 摘要区分：振替先品名かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品名の値の場合true
	 */
	public static boolean isTRD(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.TRD.isSame(type);
	}

	/**
	 * 摘要区分：振替先品名かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品名の値の場合true
	 */
	public static boolean isTRD(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.TRD.isSame(type);
	}

	/**
	 * 摘要区分：案件ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.WRK.isSame(type);
	}

	/**
	 * 摘要区分：案件ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.WRK.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目１かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB1(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SUB1.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目１かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB1(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SUB1.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目２かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB2(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SUB2.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目２かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB2(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SUB2.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目３かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB3(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SUB3.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目３かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB3(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SUB3.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目４かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB4(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SUB4.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目４かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB4(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SUB4.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目５かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB5(String value) {
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
		return MAC_ABS_TYP.SUB5.isSame(type);
	}

	/**
	 * 摘要区分：予備ＣＨＡＲ項目５かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB5(MAC_ABS_TYP type) {
		return MAC_ABS_TYP.SUB5.isSame(type);
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
			MAC_ABS_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.get(value);
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
			MAC_ABS_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
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
			MAC_ABS_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.get(value);
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
			MAC_ABS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
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
			MAC_ABS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.get(value);
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
			MAC_ABS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
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
			MAC_ABS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.get(value);
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
			MAC_ABS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_ABS_TYP type = MAC_ABS_TYP.getNE(value);
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
