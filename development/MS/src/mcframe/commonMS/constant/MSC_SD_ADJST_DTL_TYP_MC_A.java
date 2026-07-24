package mcframe.commonMS.constant;

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
import mcframe.commonMA.constant.*;

@SuppressWarnings("all")
abstract class MSC_SD_ADJST_DTL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "SD_ADJST_DTL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_SD_ADJST_DTL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "sd_adjst_dtl_typ";

	public static final String $NAME = "sd_adjst_dtl_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 需給調整明細区分：需要
	 */
	public static final MSC_SD_ADJST_DTL_TYP DMND = create("01", "DMND");

	/** 需給調整明細区分：販売計画
	 */
	public static final MSC_SD_ADJST_DTL_TYP SPLN = create("02", "SPLN");

	/** 需給調整明細区分：顧客期間内示
	 */
	public static final MSC_SD_ADJST_DTL_TYP CSTFRCST = create("03", "CSTFRCST");

	/** 需給調整明細区分：受注
	 */
	public static final MSC_SD_ADJST_DTL_TYP SLO = create("04", "SLO");

	/** 需給調整明細区分：その他
	 */
	public static final MSC_SD_ADJST_DTL_TYP OTH = create("05", "OTH");

	/** 需給調整明細区分：出庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP GI = create("06", "GI");

	/** 需給調整明細区分：入庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP GR = create("07", "GR");

	/** 需給調整明細区分：前回供給
	 */
	public static final MSC_SD_ADJST_DTL_TYP OLDSPPLY = create("08", "OLDSPPLY");

	/** 需給調整明細区分：前回在庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP OLDSTK = create("09", "OLDSTK");

	/** 需給調整明細区分：シミュオーダ
	 */
	public static final MSC_SD_ADJST_DTL_TYP SIM = create("10", "SIM");

	/** 需給調整明細区分：シミュ在庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP SIMSTK = create("11", "SIMSTK");

	/** 需給調整明細区分：供給
	 */
	public static final MSC_SD_ADJST_DTL_TYP SPPLY = create("12", "SPPLY");

	/** 需給調整明細区分：在庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP STK = create("13", "STK");

	/** 需給調整明細区分：安全在庫
	 */
	public static final MSC_SD_ADJST_DTL_TYP BUF = create("135", "BUF");

	/** 需給調整明細区分：供給(入力)
	 */
	public static final MSC_SD_ADJST_DTL_TYP SPPLYENT = create("14", "SPPLYENT");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_SD_ADJST_DTL_TYP create() {
		return new MSC_SD_ADJST_DTL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_SD_ADJST_DTL_TYP get(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		if (type == null) {
			throw MSC_SD_ADJST_DTL_TYP.invalidValue(value);
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
	public static MSC_SD_ADJST_DTL_TYP getNE(String value) {
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_SD_ADJST_DTL_TYP create(String value, String xmlKey) {
		MSC_SD_ADJST_DTL_TYP me = MSC_SD_ADJST_DTL_TYP.create();
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
		MSC_SD_ADJST_DTL_TYP me = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
		MSC_SD_ADJST_DTL_TYP me = MSC_SD_ADJST_DTL_TYP.getNE(value);
		if (me == null) {
			throw MSC_SD_ADJST_DTL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_SD_ADJST_DTL_TYP me = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
	public static MSC_SD_ADJST_DTL_TYP[] array() {
		if (array == null) {
			array = new MSC_SD_ADJST_DTL_TYP[] {
					MSC_SD_ADJST_DTL_TYP.DMND, MSC_SD_ADJST_DTL_TYP.SPLN, MSC_SD_ADJST_DTL_TYP.CSTFRCST, MSC_SD_ADJST_DTL_TYP.SLO, MSC_SD_ADJST_DTL_TYP.OTH, 
					 MSC_SD_ADJST_DTL_TYP.GI, MSC_SD_ADJST_DTL_TYP.GR, MSC_SD_ADJST_DTL_TYP.OLDSPPLY, MSC_SD_ADJST_DTL_TYP.OLDSTK, MSC_SD_ADJST_DTL_TYP.SIM, MSC_SD_ADJST_DTL_TYP.SIMSTK, 
					 MSC_SD_ADJST_DTL_TYP.SPPLY, MSC_SD_ADJST_DTL_TYP.STK, MSC_SD_ADJST_DTL_TYP.BUF, MSC_SD_ADJST_DTL_TYP.SPPLYENT
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
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
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
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
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
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
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
			if(MSC_SD_ADJST_DTL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_SD_ADJST_DTL_TYP me = MSC_SD_ADJST_DTL_TYP.get(MSC_SD_ADJST_DTL_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_SD_ADJST_DTL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_SD_ADJST_DTL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_SD_ADJST_DTL_TYP.list();
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
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
			if(MSC_SD_ADJST_DTL_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_SD_ADJST_DTL_TYP.subList(cols, vals);
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
		for (MSC_SD_ADJST_DTL_TYP me : MSC_SD_ADJST_DTL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_SD_ADJST_DTL_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_SD_ADJST_DTL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_SD_ADJST_DTL_TYP", col);}
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
	protected boolean isSame(MSC_SD_ADJST_DTL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 需給調整明細区分：需要かどうか
	 * @param value 定数値
	 * @return 定数値が需要の値の場合true
	 */
	public static boolean isDMND(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.DMND.isSame(type);
	}

	/**
	 * 需給調整明細区分：需要かどうか
	 * @param type 属性値
	 * @return 属性値が需要の値の場合true
	 */
	public static boolean isDMND(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.DMND.isSame(type);
	}

	/**
	 * 需給調整明細区分：販売計画かどうか
	 * @param value 定数値
	 * @return 定数値が販売計画の値の場合true
	 */
	public static boolean isSPLN(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SPLN.isSame(type);
	}

	/**
	 * 需給調整明細区分：販売計画かどうか
	 * @param type 属性値
	 * @return 属性値が販売計画の値の場合true
	 */
	public static boolean isSPLN(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SPLN.isSame(type);
	}

	/**
	 * 需給調整明細区分：顧客期間内示かどうか
	 * @param value 定数値
	 * @return 定数値が顧客期間内示の値の場合true
	 */
	public static boolean isCSTFRCST(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.CSTFRCST.isSame(type);
	}

	/**
	 * 需給調整明細区分：顧客期間内示かどうか
	 * @param type 属性値
	 * @return 属性値が顧客期間内示の値の場合true
	 */
	public static boolean isCSTFRCST(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.CSTFRCST.isSame(type);
	}

	/**
	 * 需給調整明細区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isSLO(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SLO.isSame(type);
	}

	/**
	 * 需給調整明細区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isSLO(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SLO.isSame(type);
	}

	/**
	 * 需給調整明細区分：その他かどうか
	 * @param value 定数値
	 * @return 定数値がその他の値の場合true
	 */
	public static boolean isOTH(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.OTH.isSame(type);
	}

	/**
	 * 需給調整明細区分：その他かどうか
	 * @param type 属性値
	 * @return 属性値がその他の値の場合true
	 */
	public static boolean isOTH(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.OTH.isSame(type);
	}

	/**
	 * 需給調整明細区分：出庫かどうか
	 * @param value 定数値
	 * @return 定数値が出庫の値の場合true
	 */
	public static boolean isGI(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.GI.isSame(type);
	}

	/**
	 * 需給調整明細区分：出庫かどうか
	 * @param type 属性値
	 * @return 属性値が出庫の値の場合true
	 */
	public static boolean isGI(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.GI.isSame(type);
	}

	/**
	 * 需給調整明細区分：入庫かどうか
	 * @param value 定数値
	 * @return 定数値が入庫の値の場合true
	 */
	public static boolean isGR(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.GR.isSame(type);
	}

	/**
	 * 需給調整明細区分：入庫かどうか
	 * @param type 属性値
	 * @return 属性値が入庫の値の場合true
	 */
	public static boolean isGR(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.GR.isSame(type);
	}

	/**
	 * 需給調整明細区分：前回供給かどうか
	 * @param value 定数値
	 * @return 定数値が前回供給の値の場合true
	 */
	public static boolean isOLDSPPLY(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.OLDSPPLY.isSame(type);
	}

	/**
	 * 需給調整明細区分：前回供給かどうか
	 * @param type 属性値
	 * @return 属性値が前回供給の値の場合true
	 */
	public static boolean isOLDSPPLY(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.OLDSPPLY.isSame(type);
	}

	/**
	 * 需給調整明細区分：前回在庫かどうか
	 * @param value 定数値
	 * @return 定数値が前回在庫の値の場合true
	 */
	public static boolean isOLDSTK(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.OLDSTK.isSame(type);
	}

	/**
	 * 需給調整明細区分：前回在庫かどうか
	 * @param type 属性値
	 * @return 属性値が前回在庫の値の場合true
	 */
	public static boolean isOLDSTK(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.OLDSTK.isSame(type);
	}

	/**
	 * 需給調整明細区分：シミュオーダかどうか
	 * @param value 定数値
	 * @return 定数値がシミュオーダの値の場合true
	 */
	public static boolean isSIM(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SIM.isSame(type);
	}

	/**
	 * 需給調整明細区分：シミュオーダかどうか
	 * @param type 属性値
	 * @return 属性値がシミュオーダの値の場合true
	 */
	public static boolean isSIM(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SIM.isSame(type);
	}

	/**
	 * 需給調整明細区分：シミュ在庫かどうか
	 * @param value 定数値
	 * @return 定数値がシミュ在庫の値の場合true
	 */
	public static boolean isSIMSTK(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SIMSTK.isSame(type);
	}

	/**
	 * 需給調整明細区分：シミュ在庫かどうか
	 * @param type 属性値
	 * @return 属性値がシミュ在庫の値の場合true
	 */
	public static boolean isSIMSTK(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SIMSTK.isSame(type);
	}

	/**
	 * 需給調整明細区分：供給かどうか
	 * @param value 定数値
	 * @return 定数値が供給の値の場合true
	 */
	public static boolean isSPPLY(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SPPLY.isSame(type);
	}

	/**
	 * 需給調整明細区分：供給かどうか
	 * @param type 属性値
	 * @return 属性値が供給の値の場合true
	 */
	public static boolean isSPPLY(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SPPLY.isSame(type);
	}

	/**
	 * 需給調整明細区分：在庫かどうか
	 * @param value 定数値
	 * @return 定数値が在庫の値の場合true
	 */
	public static boolean isSTK(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.STK.isSame(type);
	}

	/**
	 * 需給調整明細区分：在庫かどうか
	 * @param type 属性値
	 * @return 属性値が在庫の値の場合true
	 */
	public static boolean isSTK(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.STK.isSame(type);
	}

	/**
	 * 需給調整明細区分：安全在庫かどうか
	 * @param value 定数値
	 * @return 定数値が安全在庫の値の場合true
	 */
	public static boolean isBUF(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.BUF.isSame(type);
	}

	/**
	 * 需給調整明細区分：安全在庫かどうか
	 * @param type 属性値
	 * @return 属性値が安全在庫の値の場合true
	 */
	public static boolean isBUF(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.BUF.isSame(type);
	}

	/**
	 * 需給調整明細区分：供給(入力)かどうか
	 * @param value 定数値
	 * @return 定数値が供給(入力)の値の場合true
	 */
	public static boolean isSPPLYENT(String value) {
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
		return MSC_SD_ADJST_DTL_TYP.SPPLYENT.isSame(type);
	}

	/**
	 * 需給調整明細区分：供給(入力)かどうか
	 * @param type 属性値
	 * @return 属性値が供給(入力)の値の場合true
	 */
	public static boolean isSPPLYENT(MSC_SD_ADJST_DTL_TYP type) {
		return MSC_SD_ADJST_DTL_TYP.SPPLYENT.isSame(type);
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
			MSC_SD_ADJST_DTL_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.get(value);
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
			MSC_SD_ADJST_DTL_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
			MSC_SD_ADJST_DTL_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.get(value);
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
			MSC_SD_ADJST_DTL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
			MSC_SD_ADJST_DTL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.get(value);
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
			MSC_SD_ADJST_DTL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
			MSC_SD_ADJST_DTL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.get(value);
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
			MSC_SD_ADJST_DTL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_SD_ADJST_DTL_TYP type = MSC_SD_ADJST_DTL_TYP.getNE(value);
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
