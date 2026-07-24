package mcframe.commonMG.constant;

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
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MGC_IO_REC_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MG";

	public static final String typeID = "IO_REC_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MGC_IO_REC_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "io_rec_typ";

	public static final String $NAME = "io_rec_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 受払レコード区分：月初在庫
	 */
	public static final MGC_IO_REC_TYP ST_STK = create(new MCNumber(1), "ST_STK");

	/** 受払レコード区分：月初仕掛
	 */
	public static final MGC_IO_REC_TYP ST_WIP = create(new MCNumber(2), "ST_WIP");

	/** 受払レコード区分：購買
	 */
	public static final MGC_IO_REC_TYP PURC = create(new MCNumber(3), "PURC");

	/** 受払レコード区分：完成
	 */
	public static final MGC_IO_REC_TYP COMP = create(new MCNumber(4), "COMP");

	/** 受払レコード区分：入庫
	 */
	public static final MGC_IO_REC_TYP STK_IN = create(new MCNumber(5), "STK_IN");

	/** 受払レコード区分：汎用配賦
	 */
	public static final MGC_IO_REC_TYP GP_ALC = create(new MCNumber(6), "GP_ALC");

	/** 受払レコード区分：無償支給
	 */
	public static final MGC_IO_REC_TYP FFR = create(new MCNumber(7), "FFR");

	/** 受払レコード区分：有償支給
	 */
	public static final MGC_IO_REC_TYP ONR = create(new MCNumber(8), "ONR");

	/** 受払レコード区分：投入
	 */
	public static final MGC_IO_REC_TYP INPT = create(new MCNumber(9), "INPT");

	/** 受払レコード区分：出庫
	 */
	public static final MGC_IO_REC_TYP STK_OUT = create(new MCNumber(10), "STK_OUT");

	/** 受払レコード区分：売上
	 */
	public static final MGC_IO_REC_TYP SLS = create(new MCNumber(11), "SLS");

	/** 受払レコード区分：月末在庫
	 */
	public static final MGC_IO_REC_TYP END_STK = create(new MCNumber(12), "END_STK");

	/** 受払レコード区分：月末仕掛
	 */
	public static final MGC_IO_REC_TYP END_WIP = create(new MCNumber(13), "END_WIP");

	/** 受払レコード区分：受払差額
	 */
	public static final MGC_IO_REC_TYP ADJ = create(new MCNumber(14), "ADJ");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_IO_REC_TYP create() {
		return new MGC_IO_REC_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MGC_IO_REC_TYP get(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		if (type == null) {
			throw MGC_IO_REC_TYP.invalidValue(value);
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
	public static MGC_IO_REC_TYP getNE(MCNumber value) {
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_IO_REC_TYP create(MCNumber value, String xmlKey) {
		MGC_IO_REC_TYP me = MGC_IO_REC_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addNumberColumn($VALUE, value);
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
	public MCNumber value() {
		return constR.getNumber($VALUE);
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( MCNumber value ) {
		MGC_IO_REC_TYP me = MGC_IO_REC_TYP.getNE(value);
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
	public static void containsEx(MCNumber value) {
		MGC_IO_REC_TYP me = MGC_IO_REC_TYP.getNE(value);
		if (me == null) {
			throw MGC_IO_REC_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(MCNumber value, String msgid, Object... binds) {
		MGC_IO_REC_TYP me = MGC_IO_REC_TYP.getNE(value);
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
	public static MGC_IO_REC_TYP[] array() {
		if (array == null) {
			array = new MGC_IO_REC_TYP[] {
					MGC_IO_REC_TYP.ST_STK, MGC_IO_REC_TYP.ST_WIP, MGC_IO_REC_TYP.PURC, MGC_IO_REC_TYP.COMP, MGC_IO_REC_TYP.STK_IN, 
					 MGC_IO_REC_TYP.GP_ALC, MGC_IO_REC_TYP.FFR, MGC_IO_REC_TYP.ONR, MGC_IO_REC_TYP.INPT, MGC_IO_REC_TYP.STK_OUT, MGC_IO_REC_TYP.SLS, 
					 MGC_IO_REC_TYP.END_STK, MGC_IO_REC_TYP.END_WIP, MGC_IO_REC_TYP.ADJ
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
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
			MCRow r = MCRow.create();
			r.addNumberColumn($VALUE, me.value());
			r.addStringColumn($NAME, me.name());
			list.add(r);
		}
		return list;
	}

	/**
	 * キーに対応する値を取得します。
	 * @return 値
	 */
	protected static MCNumber value(String key) {
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
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
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
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
			if(MGC_IO_REC_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MGC_IO_REC_TYP me = MGC_IO_REC_TYP.get(MGC_IO_REC_TYP.value(e.getKey()));
				MCRow r = list.createRow();
				r.addNumberColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MGC_IO_REC_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MGC_IO_REC_TYP.subList(row);
			if (list.isEmpty()) {
				list = MGC_IO_REC_TYP.list();
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
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
			if(MGC_IO_REC_TYP.isSameVals(me, cols, vals)){
				MCRow r = MCRow.create();
				r.addNumberColumn($VALUE, me.value());
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
			list = MGC_IO_REC_TYP.subList(cols, vals);
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
		for (MGC_IO_REC_TYP me : MGC_IO_REC_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MGC_IO_REC_TYP.isSameVals(me, cols, val)){
					f = false;
					break;
				}
			}
			if(f){
				MCRow r = MCRow.create();
				r.addNumberColumn($VALUE, me.value());
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
	protected static boolean isSameVals(MGC_IO_REC_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MGC_IO_REC_TYP", col);}
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
	protected boolean isSame(MGC_IO_REC_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受払レコード区分：月初在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.ST_STK.isSame(type);
	}

	/**
	 * 受払レコード区分：月初在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.ST_STK.isSame(type);
	}

	/**
	 * 受払レコード区分：月初仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.ST_WIP.isSame(type);
	}

	/**
	 * 受払レコード区分：月初仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.ST_WIP.isSame(type);
	}

	/**
	 * 受払レコード区分：購買かどうか
	 * @param value 定数値
	 * @return 定数値が購買の値の場合true
	 */
	public static boolean isPURC(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.PURC.isSame(type);
	}

	/**
	 * 受払レコード区分：購買かどうか
	 * @param type 属性値
	 * @return 属性値が購買の値の場合true
	 */
	public static boolean isPURC(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.PURC.isSame(type);
	}

	/**
	 * 受払レコード区分：完成かどうか
	 * @param value 定数値
	 * @return 定数値が完成の値の場合true
	 */
	public static boolean isCOMP(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.COMP.isSame(type);
	}

	/**
	 * 受払レコード区分：完成かどうか
	 * @param type 属性値
	 * @return 属性値が完成の値の場合true
	 */
	public static boolean isCOMP(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.COMP.isSame(type);
	}

	/**
	 * 受払レコード区分：入庫かどうか
	 * @param value 定数値
	 * @return 定数値が入庫の値の場合true
	 */
	public static boolean isSTK_IN(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.STK_IN.isSame(type);
	}

	/**
	 * 受払レコード区分：入庫かどうか
	 * @param type 属性値
	 * @return 属性値が入庫の値の場合true
	 */
	public static boolean isSTK_IN(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.STK_IN.isSame(type);
	}

	/**
	 * 受払レコード区分：汎用配賦かどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.GP_ALC.isSame(type);
	}

	/**
	 * 受払レコード区分：汎用配賦かどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.GP_ALC.isSame(type);
	}

	/**
	 * 受払レコード区分：無償支給かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給の値の場合true
	 */
	public static boolean isFFR(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.FFR.isSame(type);
	}

	/**
	 * 受払レコード区分：無償支給かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給の値の場合true
	 */
	public static boolean isFFR(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.FFR.isSame(type);
	}

	/**
	 * 受払レコード区分：有償支給かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給の値の場合true
	 */
	public static boolean isONR(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.ONR.isSame(type);
	}

	/**
	 * 受払レコード区分：有償支給かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給の値の場合true
	 */
	public static boolean isONR(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.ONR.isSame(type);
	}

	/**
	 * 受払レコード区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.INPT.isSame(type);
	}

	/**
	 * 受払レコード区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.INPT.isSame(type);
	}

	/**
	 * 受払レコード区分：出庫かどうか
	 * @param value 定数値
	 * @return 定数値が出庫の値の場合true
	 */
	public static boolean isSTK_OUT(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.STK_OUT.isSame(type);
	}

	/**
	 * 受払レコード区分：出庫かどうか
	 * @param type 属性値
	 * @return 属性値が出庫の値の場合true
	 */
	public static boolean isSTK_OUT(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.STK_OUT.isSame(type);
	}

	/**
	 * 受払レコード区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.SLS.isSame(type);
	}

	/**
	 * 受払レコード区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.SLS.isSame(type);
	}

	/**
	 * 受払レコード区分：月末在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払レコード区分：月末在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払レコード区分：月末仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.END_WIP.isSame(type);
	}

	/**
	 * 受払レコード区分：月末仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.END_WIP.isSame(type);
	}

	/**
	 * 受払レコード区分：受払差額かどうか
	 * @param value 定数値
	 * @return 定数値が受払差額の値の場合true
	 */
	public static boolean isADJ(MCNumber value) {
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
		return MGC_IO_REC_TYP.ADJ.isSame(type);
	}

	/**
	 * 受払レコード区分：受払差額かどうか
	 * @param type 属性値
	 * @return 属性値が受払差額の値の場合true
	 */
	public static boolean isADJ(MGC_IO_REC_TYP type) {
		return MGC_IO_REC_TYP.ADJ.isSame(type);
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
			MGC_IO_REC_TYP.putName(r, valueColumn, nameColumn);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.get(value);
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
			MGC_IO_REC_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
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
			MGC_IO_REC_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.get(value);
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
			MGC_IO_REC_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
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
			MGC_IO_REC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.get(value);
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
			MGC_IO_REC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
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
			MGC_IO_REC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.get(value);
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
			MGC_IO_REC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MCNumber value = row.getNumber(valueColumn);
		MGC_IO_REC_TYP type = MGC_IO_REC_TYP.getNE(value);
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
