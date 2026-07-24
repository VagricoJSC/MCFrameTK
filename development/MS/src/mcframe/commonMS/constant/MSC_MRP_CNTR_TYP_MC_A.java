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
abstract class MSC_MRP_CNTR_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "MRP_CNTR_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_MRP_CNTR_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "mrp_cntr_typ";

	public static final String $NAME = "mrp_cntr_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** ＭＲＰカウンタ区分：品目オーダＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP ORD = create("ORD", "ORD");

	/** ＭＲＰカウンタ区分：工程オーダＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP KORD = create("KORD", "KORD");

	/** ＭＲＰカウンタ区分：ＭＲＰ所要ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP RQMT = create("RQMT", "RQMT");

	/** ＭＲＰカウンタ区分：受払予定伝票ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP SLIP = create("SLIP", "SLIP");

	/** ＭＲＰカウンタ区分：先行手配品目オーダ
	 */
	public static final MSC_MRP_CNTR_TYP PORD = create("PORD", "PORD");

	/** ＭＲＰカウンタ区分：先行手配工程オーダＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP PKORD = create("PKORD", "PKORD");

	/** ＭＲＰカウンタ区分：先行手配ＭＲＰ所要ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP PRQMT = create("PRQMT", "PRQMT");

	/** ＭＲＰカウンタ区分：先行手配受払予定伝票ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP PSLIP = create("PSLIP", "PSLIP");

	/** ＭＲＰカウンタ区分：シミュレーション品目オーダ
	 */
	public static final MSC_MRP_CNTR_TYP IORD = create("IORD", "IORD");

	/** ＭＲＰカウンタ区分：シミュレーション工程オーダＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP IKORD = create("IKORD", "IKORD");

	/** ＭＲＰカウンタ区分：シミュレーションＭＲＰ所要ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP IRQMT = create("IRQMT", "IRQMT");

	/** ＭＲＰカウンタ区分：シミュレーション受払予定伝票ＮＯ
	 */
	public static final MSC_MRP_CNTR_TYP ISLIP = create("ISLIP", "ISLIP");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_MRP_CNTR_TYP create() {
		return new MSC_MRP_CNTR_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_MRP_CNTR_TYP get(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		if (type == null) {
			throw MSC_MRP_CNTR_TYP.invalidValue(value);
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
	public static MSC_MRP_CNTR_TYP getNE(String value) {
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_MRP_CNTR_TYP create(String value, String xmlKey) {
		MSC_MRP_CNTR_TYP me = MSC_MRP_CNTR_TYP.create();
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
		MSC_MRP_CNTR_TYP me = MSC_MRP_CNTR_TYP.getNE(value);
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
		MSC_MRP_CNTR_TYP me = MSC_MRP_CNTR_TYP.getNE(value);
		if (me == null) {
			throw MSC_MRP_CNTR_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_MRP_CNTR_TYP me = MSC_MRP_CNTR_TYP.getNE(value);
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
	public static MSC_MRP_CNTR_TYP[] array() {
		if (array == null) {
			array = new MSC_MRP_CNTR_TYP[] {
					MSC_MRP_CNTR_TYP.ORD, MSC_MRP_CNTR_TYP.KORD, MSC_MRP_CNTR_TYP.RQMT, MSC_MRP_CNTR_TYP.SLIP, MSC_MRP_CNTR_TYP.PORD, 
					 MSC_MRP_CNTR_TYP.PKORD, MSC_MRP_CNTR_TYP.PRQMT, MSC_MRP_CNTR_TYP.PSLIP, MSC_MRP_CNTR_TYP.IORD, MSC_MRP_CNTR_TYP.IKORD, MSC_MRP_CNTR_TYP.IRQMT, 
					 MSC_MRP_CNTR_TYP.ISLIP
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
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
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
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
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
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
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
			if(MSC_MRP_CNTR_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_MRP_CNTR_TYP me = MSC_MRP_CNTR_TYP.get(MSC_MRP_CNTR_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_MRP_CNTR_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_MRP_CNTR_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_MRP_CNTR_TYP.list();
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
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
			if(MSC_MRP_CNTR_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_MRP_CNTR_TYP.subList(cols, vals);
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
		for (MSC_MRP_CNTR_TYP me : MSC_MRP_CNTR_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_MRP_CNTR_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_MRP_CNTR_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_MRP_CNTR_TYP", col);}
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
	protected boolean isSame(MSC_MRP_CNTR_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * ＭＲＰカウンタ区分：品目オーダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目オーダＮＯの値の場合true
	 */
	public static boolean isORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.ORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：品目オーダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目オーダＮＯの値の場合true
	 */
	public static boolean isORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.ORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：工程オーダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工程オーダＮＯの値の場合true
	 */
	public static boolean isKORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.KORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：工程オーダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工程オーダＮＯの値の場合true
	 */
	public static boolean isKORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.KORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：ＭＲＰ所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isRQMT(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.RQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：ＭＲＰ所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isRQMT(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.RQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：受払予定伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isSLIP(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.SLIP.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：受払予定伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isSLIP(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.SLIP.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配品目オーダかどうか
	 * @param value 定数値
	 * @return 定数値が先行手配品目オーダの値の場合true
	 */
	public static boolean isPORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.PORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配品目オーダかどうか
	 * @param type 属性値
	 * @return 属性値が先行手配品目オーダの値の場合true
	 */
	public static boolean isPORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.PORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配工程オーダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が先行手配工程オーダＮＯの値の場合true
	 */
	public static boolean isPKORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.PKORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配工程オーダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が先行手配工程オーダＮＯの値の場合true
	 */
	public static boolean isPKORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.PKORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配ＭＲＰ所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が先行手配ＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isPRQMT(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.PRQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配ＭＲＰ所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が先行手配ＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isPRQMT(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.PRQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配受払予定伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が先行手配受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isPSLIP(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.PSLIP.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：先行手配受払予定伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が先行手配受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isPSLIP(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.PSLIP.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション品目オーダかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーション品目オーダの値の場合true
	 */
	public static boolean isIORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.IORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション品目オーダかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーション品目オーダの値の場合true
	 */
	public static boolean isIORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.IORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション工程オーダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーション工程オーダＮＯの値の場合true
	 */
	public static boolean isIKORD(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.IKORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション工程オーダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーション工程オーダＮＯの値の場合true
	 */
	public static boolean isIKORD(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.IKORD.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーションＭＲＰ所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーションＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isIRQMT(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.IRQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーションＭＲＰ所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーションＭＲＰ所要ＮＯの値の場合true
	 */
	public static boolean isIRQMT(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.IRQMT.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション受払予定伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーション受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isISLIP(String value) {
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
		return MSC_MRP_CNTR_TYP.ISLIP.isSame(type);
	}

	/**
	 * ＭＲＰカウンタ区分：シミュレーション受払予定伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーション受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isISLIP(MSC_MRP_CNTR_TYP type) {
		return MSC_MRP_CNTR_TYP.ISLIP.isSame(type);
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
			MSC_MRP_CNTR_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.get(value);
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
			MSC_MRP_CNTR_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
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
			MSC_MRP_CNTR_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.get(value);
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
			MSC_MRP_CNTR_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
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
			MSC_MRP_CNTR_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.get(value);
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
			MSC_MRP_CNTR_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
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
			MSC_MRP_CNTR_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.get(value);
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
			MSC_MRP_CNTR_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_MRP_CNTR_TYP type = MSC_MRP_CNTR_TYP.getNE(value);
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
