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
abstract class MSC_IV_PRNT_STR_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "IV_PRNT_STR";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_IV_PRNT_STR[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "iv_prnt_str";

	public static final String $NAME = "iv_prnt_str_nm";

	/*
	 * 定数の定義です。
	 */
	/** インボイス文字列：====== Free Of Charge =====
	 */
	public static final MSC_IV_PRNT_STR FREE_OF_CHRG = create("1", "FREE_OF_CHRG");

	/** インボイス文字列：No Commercial Value
	 */
	public static final MSC_IV_PRNT_STR NO_COM_VAL = create("2", "NO_COM_VAL");

	/** インボイス文字列：Value for customs purpose only
	 */
	public static final MSC_IV_PRNT_STR VAL_FOR_CST = create("3", "VAL_FOR_CST");

	/** インボイス文字列：Customer P/O NO
	 */
	public static final MSC_IV_PRNT_STR CUST = create("4", "CUST");

	/** インボイス文字列：Item Code / Description
	 */
	public static final MSC_IV_PRNT_STR ITEM = create("5", "ITEM");

	/** インボイス文字列：Quantity
	 */
	public static final MSC_IV_PRNT_STR QTY = create("6", "QTY");

	/** インボイス文字列：Unit Price
	 */
	public static final MSC_IV_PRNT_STR UPRI = create("7", "UPRI");

	/** インボイス文字列：(
	 */
	public static final MSC_IV_PRNT_STR LEFT = create("8", "LEFT");

	/** インボイス文字列：)
	 */
	public static final MSC_IV_PRNT_STR RIGHT = create("9", "RIGHT");

	/** インボイス文字列：Amt
	 */
	public static final MSC_IV_PRNT_STR AMT = create("10", "AMT");

	/** インボイス文字列：-
	 */
	public static final MSC_IV_PRNT_STR LINE = create("11", "LINE");

	/** インボイス文字列：F.O.B
	 */
	public static final MSC_IV_PRNT_STR FOB = create("12", "FOB");

	/** インボイス文字列：Freight
	 */
	public static final MSC_IV_PRNT_STR FREIGHT = create("13", "FREIGHT");

	/** インボイス文字列：Insurance
	 */
	public static final MSC_IV_PRNT_STR INSURANCE = create("14", "INSURANCE");

	/** インボイス文字列：Total :
	 */
	public static final MSC_IV_PRNT_STR TOTAL = create("16", "TOTAL");

	/** インボイス文字列：: MADE IN
	 */
	public static final MSC_IV_PRNT_STR MADE_IN = create("17", "MADE_IN");

	/** インボイス文字列：Tax inclusive
	 */
	public static final MSC_IV_PRNT_STR INC_TAX = create("18", "INC_TAX");

	/** インボイス文字列：%
	 */
	public static final MSC_IV_PRNT_STR RATE = create("19", "RATE");

	/** インボイス文字列：Tax Rate
	 */
	public static final MSC_IV_PRNT_STR TAX_RATE = create("20", "TAX_RATE");

	/** インボイス文字列：Tax Amt
	 */
	public static final MSC_IV_PRNT_STR TAX_AMT = create("21", "TAX_AMT");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IV_PRNT_STR create() {
		return new MSC_IV_PRNT_STR();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_IV_PRNT_STR get(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		if (type == null) {
			throw MSC_IV_PRNT_STR.invalidValue(value);
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
	public static MSC_IV_PRNT_STR getNE(String value) {
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IV_PRNT_STR create(String value, String xmlKey) {
		MSC_IV_PRNT_STR me = MSC_IV_PRNT_STR.create();
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
		MSC_IV_PRNT_STR me = MSC_IV_PRNT_STR.getNE(value);
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
		MSC_IV_PRNT_STR me = MSC_IV_PRNT_STR.getNE(value);
		if (me == null) {
			throw MSC_IV_PRNT_STR.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_IV_PRNT_STR me = MSC_IV_PRNT_STR.getNE(value);
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
	public static MSC_IV_PRNT_STR[] array() {
		if (array == null) {
			array = new MSC_IV_PRNT_STR[] {
					MSC_IV_PRNT_STR.FREE_OF_CHRG, MSC_IV_PRNT_STR.NO_COM_VAL, MSC_IV_PRNT_STR.VAL_FOR_CST, MSC_IV_PRNT_STR.CUST, MSC_IV_PRNT_STR.ITEM, 
					 MSC_IV_PRNT_STR.QTY, MSC_IV_PRNT_STR.UPRI, MSC_IV_PRNT_STR.LEFT, MSC_IV_PRNT_STR.RIGHT, MSC_IV_PRNT_STR.AMT, MSC_IV_PRNT_STR.LINE, 
					 MSC_IV_PRNT_STR.FOB, MSC_IV_PRNT_STR.FREIGHT, MSC_IV_PRNT_STR.INSURANCE, MSC_IV_PRNT_STR.TOTAL, MSC_IV_PRNT_STR.MADE_IN, MSC_IV_PRNT_STR.INC_TAX, 
					 MSC_IV_PRNT_STR.RATE, MSC_IV_PRNT_STR.TAX_RATE, MSC_IV_PRNT_STR.TAX_AMT
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
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
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
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
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
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
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
			if(MSC_IV_PRNT_STR.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_IV_PRNT_STR me = MSC_IV_PRNT_STR.get(MSC_IV_PRNT_STR.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_IV_PRNT_STR#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_IV_PRNT_STR.subList(row);
			if (list.isEmpty()) {
				list = MSC_IV_PRNT_STR.list();
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
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
			if(MSC_IV_PRNT_STR.isSameVals(me, cols, vals)){
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
			list = MSC_IV_PRNT_STR.subList(cols, vals);
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
		for (MSC_IV_PRNT_STR me : MSC_IV_PRNT_STR.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_IV_PRNT_STR.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_IV_PRNT_STR me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_IV_PRNT_STR", col);}
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
	protected boolean isSame(MSC_IV_PRNT_STR type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * インボイス文字列：====== Free Of Charge =====かどうか
	 * @param value 定数値
	 * @return 定数値が====== Free Of Charge =====の値の場合true
	 */
	public static boolean isFREE_OF_CHRG(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.FREE_OF_CHRG.isSame(type);
	}

	/**
	 * インボイス文字列：====== Free Of Charge =====かどうか
	 * @param type 属性値
	 * @return 属性値が====== Free Of Charge =====の値の場合true
	 */
	public static boolean isFREE_OF_CHRG(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.FREE_OF_CHRG.isSame(type);
	}

	/**
	 * インボイス文字列：No Commercial Valueかどうか
	 * @param value 定数値
	 * @return 定数値がNo Commercial Valueの値の場合true
	 */
	public static boolean isNO_COM_VAL(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.NO_COM_VAL.isSame(type);
	}

	/**
	 * インボイス文字列：No Commercial Valueかどうか
	 * @param type 属性値
	 * @return 属性値がNo Commercial Valueの値の場合true
	 */
	public static boolean isNO_COM_VAL(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.NO_COM_VAL.isSame(type);
	}

	/**
	 * インボイス文字列：Value for customs purpose onlyかどうか
	 * @param value 定数値
	 * @return 定数値がValue for customs purpose onlyの値の場合true
	 */
	public static boolean isVAL_FOR_CST(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.VAL_FOR_CST.isSame(type);
	}

	/**
	 * インボイス文字列：Value for customs purpose onlyかどうか
	 * @param type 属性値
	 * @return 属性値がValue for customs purpose onlyの値の場合true
	 */
	public static boolean isVAL_FOR_CST(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.VAL_FOR_CST.isSame(type);
	}

	/**
	 * インボイス文字列：Customer P/O NOかどうか
	 * @param value 定数値
	 * @return 定数値がCustomer P/O NOの値の場合true
	 */
	public static boolean isCUST(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.CUST.isSame(type);
	}

	/**
	 * インボイス文字列：Customer P/O NOかどうか
	 * @param type 属性値
	 * @return 属性値がCustomer P/O NOの値の場合true
	 */
	public static boolean isCUST(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.CUST.isSame(type);
	}

	/**
	 * インボイス文字列：Item Code / Descriptionかどうか
	 * @param value 定数値
	 * @return 定数値がItem Code / Descriptionの値の場合true
	 */
	public static boolean isITEM(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.ITEM.isSame(type);
	}

	/**
	 * インボイス文字列：Item Code / Descriptionかどうか
	 * @param type 属性値
	 * @return 属性値がItem Code / Descriptionの値の場合true
	 */
	public static boolean isITEM(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.ITEM.isSame(type);
	}

	/**
	 * インボイス文字列：Quantityかどうか
	 * @param value 定数値
	 * @return 定数値がQuantityの値の場合true
	 */
	public static boolean isQTY(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.QTY.isSame(type);
	}

	/**
	 * インボイス文字列：Quantityかどうか
	 * @param type 属性値
	 * @return 属性値がQuantityの値の場合true
	 */
	public static boolean isQTY(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.QTY.isSame(type);
	}

	/**
	 * インボイス文字列：Unit Priceかどうか
	 * @param value 定数値
	 * @return 定数値がUnit Priceの値の場合true
	 */
	public static boolean isUPRI(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.UPRI.isSame(type);
	}

	/**
	 * インボイス文字列：Unit Priceかどうか
	 * @param type 属性値
	 * @return 属性値がUnit Priceの値の場合true
	 */
	public static boolean isUPRI(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.UPRI.isSame(type);
	}

	/**
	 * インボイス文字列：(かどうか
	 * @param value 定数値
	 * @return 定数値が(の値の場合true
	 */
	public static boolean isLEFT(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.LEFT.isSame(type);
	}

	/**
	 * インボイス文字列：(かどうか
	 * @param type 属性値
	 * @return 属性値が(の値の場合true
	 */
	public static boolean isLEFT(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.LEFT.isSame(type);
	}

	/**
	 * インボイス文字列：)かどうか
	 * @param value 定数値
	 * @return 定数値が)の値の場合true
	 */
	public static boolean isRIGHT(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.RIGHT.isSame(type);
	}

	/**
	 * インボイス文字列：)かどうか
	 * @param type 属性値
	 * @return 属性値が)の値の場合true
	 */
	public static boolean isRIGHT(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.RIGHT.isSame(type);
	}

	/**
	 * インボイス文字列：Amtかどうか
	 * @param value 定数値
	 * @return 定数値がAmtの値の場合true
	 */
	public static boolean isAMT(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.AMT.isSame(type);
	}

	/**
	 * インボイス文字列：Amtかどうか
	 * @param type 属性値
	 * @return 属性値がAmtの値の場合true
	 */
	public static boolean isAMT(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.AMT.isSame(type);
	}

	/**
	 * インボイス文字列：-かどうか
	 * @param value 定数値
	 * @return 定数値が-の値の場合true
	 */
	public static boolean isLINE(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.LINE.isSame(type);
	}

	/**
	 * インボイス文字列：-かどうか
	 * @param type 属性値
	 * @return 属性値が-の値の場合true
	 */
	public static boolean isLINE(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.LINE.isSame(type);
	}

	/**
	 * インボイス文字列：F.O.Bかどうか
	 * @param value 定数値
	 * @return 定数値がF.O.Bの値の場合true
	 */
	public static boolean isFOB(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.FOB.isSame(type);
	}

	/**
	 * インボイス文字列：F.O.Bかどうか
	 * @param type 属性値
	 * @return 属性値がF.O.Bの値の場合true
	 */
	public static boolean isFOB(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.FOB.isSame(type);
	}

	/**
	 * インボイス文字列：Freightかどうか
	 * @param value 定数値
	 * @return 定数値がFreightの値の場合true
	 */
	public static boolean isFREIGHT(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.FREIGHT.isSame(type);
	}

	/**
	 * インボイス文字列：Freightかどうか
	 * @param type 属性値
	 * @return 属性値がFreightの値の場合true
	 */
	public static boolean isFREIGHT(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.FREIGHT.isSame(type);
	}

	/**
	 * インボイス文字列：Insuranceかどうか
	 * @param value 定数値
	 * @return 定数値がInsuranceの値の場合true
	 */
	public static boolean isINSURANCE(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.INSURANCE.isSame(type);
	}

	/**
	 * インボイス文字列：Insuranceかどうか
	 * @param type 属性値
	 * @return 属性値がInsuranceの値の場合true
	 */
	public static boolean isINSURANCE(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.INSURANCE.isSame(type);
	}

	/**
	 * インボイス文字列：Total :かどうか
	 * @param value 定数値
	 * @return 定数値がTotal :の値の場合true
	 */
	public static boolean isTOTAL(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.TOTAL.isSame(type);
	}

	/**
	 * インボイス文字列：Total :かどうか
	 * @param type 属性値
	 * @return 属性値がTotal :の値の場合true
	 */
	public static boolean isTOTAL(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.TOTAL.isSame(type);
	}

	/**
	 * インボイス文字列：: MADE INかどうか
	 * @param value 定数値
	 * @return 定数値が: MADE INの値の場合true
	 */
	public static boolean isMADE_IN(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.MADE_IN.isSame(type);
	}

	/**
	 * インボイス文字列：: MADE INかどうか
	 * @param type 属性値
	 * @return 属性値が: MADE INの値の場合true
	 */
	public static boolean isMADE_IN(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.MADE_IN.isSame(type);
	}

	/**
	 * インボイス文字列：Tax inclusiveかどうか
	 * @param value 定数値
	 * @return 定数値がTax inclusiveの値の場合true
	 */
	public static boolean isINC_TAX(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.INC_TAX.isSame(type);
	}

	/**
	 * インボイス文字列：Tax inclusiveかどうか
	 * @param type 属性値
	 * @return 属性値がTax inclusiveの値の場合true
	 */
	public static boolean isINC_TAX(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.INC_TAX.isSame(type);
	}

	/**
	 * インボイス文字列：%かどうか
	 * @param value 定数値
	 * @return 定数値が%の値の場合true
	 */
	public static boolean isRATE(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.RATE.isSame(type);
	}

	/**
	 * インボイス文字列：%かどうか
	 * @param type 属性値
	 * @return 属性値が%の値の場合true
	 */
	public static boolean isRATE(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.RATE.isSame(type);
	}

	/**
	 * インボイス文字列：Tax Rateかどうか
	 * @param value 定数値
	 * @return 定数値がTax Rateの値の場合true
	 */
	public static boolean isTAX_RATE(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.TAX_RATE.isSame(type);
	}

	/**
	 * インボイス文字列：Tax Rateかどうか
	 * @param type 属性値
	 * @return 属性値がTax Rateの値の場合true
	 */
	public static boolean isTAX_RATE(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.TAX_RATE.isSame(type);
	}

	/**
	 * インボイス文字列：Tax Amtかどうか
	 * @param value 定数値
	 * @return 定数値がTax Amtの値の場合true
	 */
	public static boolean isTAX_AMT(String value) {
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
		return MSC_IV_PRNT_STR.TAX_AMT.isSame(type);
	}

	/**
	 * インボイス文字列：Tax Amtかどうか
	 * @param type 属性値
	 * @return 属性値がTax Amtの値の場合true
	 */
	public static boolean isTAX_AMT(MSC_IV_PRNT_STR type) {
		return MSC_IV_PRNT_STR.TAX_AMT.isSame(type);
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
			MSC_IV_PRNT_STR.putName(r, valueColumn, nameColumn);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.get(value);
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
			MSC_IV_PRNT_STR.putNameNE(r, valueColumn, nameColumn);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
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
			MSC_IV_PRNT_STR.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.get(value);
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
			MSC_IV_PRNT_STR.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
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
			MSC_IV_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.get(value);
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
			MSC_IV_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
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
			MSC_IV_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.get(value);
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
			MSC_IV_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IV_PRNT_STR type = MSC_IV_PRNT_STR.getNE(value);
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
