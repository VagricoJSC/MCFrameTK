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
abstract class MAC_RPT_TGT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "RPT_TGT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_RPT_TGT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "rpt_tgt_typ";

	public static final String $NAME = "rpt_tgt_typ_nm";

	public static final String $IS_ST = "is_st";

	public static final String $IS_END = "is_end";

	public static final String $IS_QTY = "is_qty";

	/*
	 * 定数の定義です。
	 */
	/** レポート対象区分：月初在庫
	 */
	public static final MAC_RPT_TGT_TYP ST_STK = create("1", "ST_STK", true, false, true);

	/** レポート対象区分：月初仕掛
	 */
	public static final MAC_RPT_TGT_TYP ST_WIP = create("2", "ST_WIP", true, false, true);

	/** レポート対象区分：購買原価
	 */
	public static final MAC_RPT_TGT_TYP PURC = create("3", "PURC", false, false, true);

	/** レポート対象区分：完成
	 */
	public static final MAC_RPT_TGT_TYP COMP = create("4", "COMP", false, false, true);

	/** レポート対象区分：入出庫
	 */
	public static final MAC_RPT_TGT_TYP IO = create("5", "IO", false, false, true);

	/** レポート対象区分：投入
	 */
	public static final MAC_RPT_TGT_TYP INPT = create("6", "INPT", false, false, true);

	/** レポート対象区分：売上原価
	 */
	public static final MAC_RPT_TGT_TYP SLS = create("7", "SLS", false, false, true);

	/** レポート対象区分：月末在庫
	 */
	public static final MAC_RPT_TGT_TYP END_STK = create("8", "END_STK", false, true, true);

	/** レポート対象区分：月末仕掛
	 */
	public static final MAC_RPT_TGT_TYP END_WIP = create("9", "END_WIP", false, true, true);

	/** レポート対象区分：発生
	 */
	public static final MAC_RPT_TGT_TYP INST = create("A", "INST", false, false, true);

	/** レポート対象区分：月初在庫仕掛
	 */
	public static final MAC_RPT_TGT_TYP ST_STKWIP = create("I", "ST_STKWIP", true, false, true);

	/** レポート対象区分：月末在庫仕掛
	 */
	public static final MAC_RPT_TGT_TYP END_STKWIP = create("J", "END_STKWIP", false, true, true);

	/** レポート対象区分：汎用配賦
	 */
	public static final MAC_RPT_TGT_TYP GP_ALC = create("L", "GP_ALC", false, false, false);

	/** レポート対象区分：購買金額
	 */
	public static final MAC_RPT_TGT_TYP PURC_AMT = create("P", "PURC_AMT", false, false, false);

	/** レポート対象区分：売上金額
	 */
	public static final MAC_RPT_TGT_TYP SLS_AMT = create("Q", "SLS_AMT", false, false, false);

	/** レポート対象区分：入出庫金額
	 */
	public static final MAC_RPT_TGT_TYP IO_AMT = create("R", "IO_AMT", false, false, false);

	/** レポート対象区分：外注購買金額
	 */
	public static final MAC_RPT_TGT_TYP OUTSRC_AMT = create("S", "OUTSRC_AMT", false, false, false);

	/** レポート対象区分：外注支払金額
	 */
	public static final MAC_RPT_TGT_TYP OUTSRC_PAY_AMT = create("T", "OUTSRC_PAY_AMT", false, false, false);

	/** レポート対象区分：投入有償差益
	 */
	public static final MAC_RPT_TGT_TYP IN_ONR_DIFF = create("U", "IN_ONR_DIFF", false, false, false);

	/** レポート対象区分：月初改定差異
	 */
	public static final MAC_RPT_TGT_TYP ST_DIFF = create("V", "ST_DIFF", true, false, false);

	/** レポート対象区分：在庫評価損
	 */
	public static final MAC_RPT_TGT_TYP STK_LOSS = create("W", "STK_LOSS", false, true, false);

	/** レポート対象区分：受払差額
	 */
	public static final MAC_RPT_TGT_TYP ADJ = create("X", "ADJ", false, false, false);

	/** レポート対象区分：配賦
	 */
	public static final MAC_RPT_TGT_TYP ALC = create("Z", "ALC", false, false, false);

	/** レポート対象区分：数量差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_QTY = create("a", "DIFF_QTY", false, false, false);

	/** レポート対象区分：払出価格差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_UP = create("b", "DIFF_UP", false, false, false);

	/** レポート対象区分：外注単価差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_OUTSRC = create("c", "DIFF_OUTSRC", false, false, false);

	/** レポート対象区分：自給単価差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_SS = create("d", "DIFF_SS", false, false, false);

	/** レポート対象区分：工数差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_WK = create("e", "DIFF_WK", false, false, false);

	/** レポート対象区分：実績差異1
	 */
	public static final MAC_RPT_TGT_TYP DIFF_A = create("f", "DIFF_A", false, false, false);

	/** レポート対象区分：実績差異2
	 */
	public static final MAC_RPT_TGT_TYP DIFF_B = create("g", "DIFF_B", false, false, false);

	/** レポート対象区分：実績差異3
	 */
	public static final MAC_RPT_TGT_TYP DIFF_C = create("h", "DIFF_C", false, false, false);

	/** レポート対象区分：実績差異4
	 */
	public static final MAC_RPT_TGT_TYP DIFF_D = create("i", "DIFF_D", false, false, false);

	/** レポート対象区分：実績差異5
	 */
	public static final MAC_RPT_TGT_TYP DIFF_E = create("j", "DIFF_E", false, false, false);

	/** レポート対象区分：配賦率差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_RT = create("k", "DIFF_RT", false, false, false);

	/** レポート対象区分：標準調整差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_STD = create("l", "DIFF_STD", false, false, false);

	/** レポート対象区分：製造原価差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_INST = create("m", "DIFF_INST", false, false, false);

	/** レポート対象区分：受入価格差異
	 */
	public static final MAC_RPT_TGT_TYP DIFF_IO_PRI = create("n", "DIFF_IO_PRI", false, false, false);

	/** レポート対象区分：数量差異（子）
	 */
	public static final MAC_RPT_TGT_TYP DIFF_QTY_CHD = create("o", "DIFF_QTY_CHD", false, false, false);

	/** レポート対象区分：払出価格差異（子）
	 */
	public static final MAC_RPT_TGT_TYP DIFF_UP_CHD = create("p", "DIFF_UP_CHD", false, false, false);

	/** レポート対象区分：自給単価差異（子）
	 */
	public static final MAC_RPT_TGT_TYP DIFF_SS_CHD = create("q", "DIFF_SS_CHD", false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_RPT_TGT_TYP create() {
		return new MAC_RPT_TGT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_RPT_TGT_TYP get(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		if (type == null) {
			throw MAC_RPT_TGT_TYP.invalidValue(value);
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
	public static MAC_RPT_TGT_TYP getNE(String value) {
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_RPT_TGT_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_ST, attr1);
		me.constR.addBooleanColumn($IS_END, attr2);
		me.constR.addBooleanColumn($IS_QTY, attr3);
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
	 * is_stの値を返します。
	 * @return is_stの値
	 */
	public boolean is_st() {
		return constR.getBooleanNE($IS_ST);
	}

	/** 
	 * valueに対応する定数のis_stの値を返します。
	 * @param value 定数値
	 * @return is_stの値
	 */
	public static boolean is_st(String value) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_st();
	}

	/** 
	 * is_endの値を返します。
	 * @return is_endの値
	 */
	public boolean is_end() {
		return constR.getBooleanNE($IS_END);
	}

	/** 
	 * valueに対応する定数のis_endの値を返します。
	 * @param value 定数値
	 * @return is_endの値
	 */
	public static boolean is_end(String value) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_end();
	}

	/** 
	 * is_qtyの値を返します。
	 * @return is_qtyの値
	 */
	public boolean is_qty() {
		return constR.getBooleanNE($IS_QTY);
	}

	/** 
	 * valueに対応する定数のis_qtyの値を返します。
	 * @param value 定数値
	 * @return is_qtyの値
	 */
	public static boolean is_qty(String value) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_qty();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
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
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
		if (me == null) {
			throw MAC_RPT_TGT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_st(), is_end(), is_qty());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_RPT_TGT_TYP[] array() {
		if (array == null) {
			array = new MAC_RPT_TGT_TYP[] {
					MAC_RPT_TGT_TYP.ST_STK, MAC_RPT_TGT_TYP.ST_WIP, MAC_RPT_TGT_TYP.PURC, MAC_RPT_TGT_TYP.COMP, MAC_RPT_TGT_TYP.IO, 
					 MAC_RPT_TGT_TYP.INPT, MAC_RPT_TGT_TYP.SLS, MAC_RPT_TGT_TYP.END_STK, MAC_RPT_TGT_TYP.END_WIP, MAC_RPT_TGT_TYP.INST, MAC_RPT_TGT_TYP.ST_STKWIP, 
					 MAC_RPT_TGT_TYP.END_STKWIP, MAC_RPT_TGT_TYP.GP_ALC, MAC_RPT_TGT_TYP.PURC_AMT, MAC_RPT_TGT_TYP.SLS_AMT, MAC_RPT_TGT_TYP.IO_AMT, MAC_RPT_TGT_TYP.OUTSRC_AMT, 
					 MAC_RPT_TGT_TYP.OUTSRC_PAY_AMT, MAC_RPT_TGT_TYP.IN_ONR_DIFF, MAC_RPT_TGT_TYP.ST_DIFF, MAC_RPT_TGT_TYP.STK_LOSS, MAC_RPT_TGT_TYP.ADJ, MAC_RPT_TGT_TYP.ALC, 
					 MAC_RPT_TGT_TYP.DIFF_QTY, MAC_RPT_TGT_TYP.DIFF_UP, MAC_RPT_TGT_TYP.DIFF_OUTSRC, MAC_RPT_TGT_TYP.DIFF_SS, MAC_RPT_TGT_TYP.DIFF_WK, MAC_RPT_TGT_TYP.DIFF_A, 
					 MAC_RPT_TGT_TYP.DIFF_B, MAC_RPT_TGT_TYP.DIFF_C, MAC_RPT_TGT_TYP.DIFF_D, MAC_RPT_TGT_TYP.DIFF_E, MAC_RPT_TGT_TYP.DIFF_RT, MAC_RPT_TGT_TYP.DIFF_STD, 
					 MAC_RPT_TGT_TYP.DIFF_INST, MAC_RPT_TGT_TYP.DIFF_IO_PRI, MAC_RPT_TGT_TYP.DIFF_QTY_CHD, MAC_RPT_TGT_TYP.DIFF_UP_CHD, MAC_RPT_TGT_TYP.DIFF_SS_CHD
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
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
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
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
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
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
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
			if(MAC_RPT_TGT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_RPT_TGT_TYP me = MAC_RPT_TGT_TYP.get(MAC_RPT_TGT_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_RPT_TGT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_RPT_TGT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_RPT_TGT_TYP.list();
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
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
			if(MAC_RPT_TGT_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_RPT_TGT_TYP.subList(cols, vals);
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
		for (MAC_RPT_TGT_TYP me : MAC_RPT_TGT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_RPT_TGT_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_RPT_TGT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_RPT_TGT_TYP", col);}
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
	protected boolean isSame(MAC_RPT_TGT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * レポート対象区分：月初在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ST_STK.isSame(type);
	}

	/**
	 * レポート対象区分：月初在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ST_STK.isSame(type);
	}

	/**
	 * レポート対象区分：月初仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ST_WIP.isSame(type);
	}

	/**
	 * レポート対象区分：月初仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ST_WIP.isSame(type);
	}

	/**
	 * レポート対象区分：購買原価かどうか
	 * @param value 定数値
	 * @return 定数値が購買原価の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.PURC.isSame(type);
	}

	/**
	 * レポート対象区分：購買原価かどうか
	 * @param type 属性値
	 * @return 属性値が購買原価の値の場合true
	 */
	public static boolean isPURC(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.PURC.isSame(type);
	}

	/**
	 * レポート対象区分：完成かどうか
	 * @param value 定数値
	 * @return 定数値が完成の値の場合true
	 */
	public static boolean isCOMP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.COMP.isSame(type);
	}

	/**
	 * レポート対象区分：完成かどうか
	 * @param type 属性値
	 * @return 属性値が完成の値の場合true
	 */
	public static boolean isCOMP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.COMP.isSame(type);
	}

	/**
	 * レポート対象区分：入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫の値の場合true
	 */
	public static boolean isIO(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.IO.isSame(type);
	}

	/**
	 * レポート対象区分：入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫の値の場合true
	 */
	public static boolean isIO(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.IO.isSame(type);
	}

	/**
	 * レポート対象区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.INPT.isSame(type);
	}

	/**
	 * レポート対象区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.INPT.isSame(type);
	}

	/**
	 * レポート対象区分：売上原価かどうか
	 * @param value 定数値
	 * @return 定数値が売上原価の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.SLS.isSame(type);
	}

	/**
	 * レポート対象区分：売上原価かどうか
	 * @param type 属性値
	 * @return 属性値が売上原価の値の場合true
	 */
	public static boolean isSLS(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.SLS.isSame(type);
	}

	/**
	 * レポート対象区分：月末在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.END_STK.isSame(type);
	}

	/**
	 * レポート対象区分：月末在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.END_STK.isSame(type);
	}

	/**
	 * レポート対象区分：月末仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.END_WIP.isSame(type);
	}

	/**
	 * レポート対象区分：月末仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.END_WIP.isSame(type);
	}

	/**
	 * レポート対象区分：発生かどうか
	 * @param value 定数値
	 * @return 定数値が発生の値の場合true
	 */
	public static boolean isINST(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.INST.isSame(type);
	}

	/**
	 * レポート対象区分：発生かどうか
	 * @param type 属性値
	 * @return 属性値が発生の値の場合true
	 */
	public static boolean isINST(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.INST.isSame(type);
	}

	/**
	 * レポート対象区分：月初在庫仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫仕掛の値の場合true
	 */
	public static boolean isST_STKWIP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ST_STKWIP.isSame(type);
	}

	/**
	 * レポート対象区分：月初在庫仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫仕掛の値の場合true
	 */
	public static boolean isST_STKWIP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ST_STKWIP.isSame(type);
	}

	/**
	 * レポート対象区分：月末在庫仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫仕掛の値の場合true
	 */
	public static boolean isEND_STKWIP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.END_STKWIP.isSame(type);
	}

	/**
	 * レポート対象区分：月末在庫仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫仕掛の値の場合true
	 */
	public static boolean isEND_STKWIP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.END_STKWIP.isSame(type);
	}

	/**
	 * レポート対象区分：汎用配賦かどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.GP_ALC.isSame(type);
	}

	/**
	 * レポート対象区分：汎用配賦かどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.GP_ALC.isSame(type);
	}

	/**
	 * レポート対象区分：購買金額かどうか
	 * @param value 定数値
	 * @return 定数値が購買金額の値の場合true
	 */
	public static boolean isPURC_AMT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.PURC_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：購買金額かどうか
	 * @param type 属性値
	 * @return 属性値が購買金額の値の場合true
	 */
	public static boolean isPURC_AMT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.PURC_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：売上金額かどうか
	 * @param value 定数値
	 * @return 定数値が売上金額の値の場合true
	 */
	public static boolean isSLS_AMT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.SLS_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：売上金額かどうか
	 * @param type 属性値
	 * @return 属性値が売上金額の値の場合true
	 */
	public static boolean isSLS_AMT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.SLS_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：入出庫金額かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫金額の値の場合true
	 */
	public static boolean isIO_AMT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.IO_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：入出庫金額かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫金額の値の場合true
	 */
	public static boolean isIO_AMT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.IO_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：外注購買金額かどうか
	 * @param value 定数値
	 * @return 定数値が外注購買金額の値の場合true
	 */
	public static boolean isOUTSRC_AMT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.OUTSRC_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：外注購買金額かどうか
	 * @param type 属性値
	 * @return 属性値が外注購買金額の値の場合true
	 */
	public static boolean isOUTSRC_AMT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.OUTSRC_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：外注支払金額かどうか
	 * @param value 定数値
	 * @return 定数値が外注支払金額の値の場合true
	 */
	public static boolean isOUTSRC_PAY_AMT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.OUTSRC_PAY_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：外注支払金額かどうか
	 * @param type 属性値
	 * @return 属性値が外注支払金額の値の場合true
	 */
	public static boolean isOUTSRC_PAY_AMT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.OUTSRC_PAY_AMT.isSame(type);
	}

	/**
	 * レポート対象区分：投入有償差益かどうか
	 * @param value 定数値
	 * @return 定数値が投入有償差益の値の場合true
	 */
	public static boolean isIN_ONR_DIFF(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.IN_ONR_DIFF.isSame(type);
	}

	/**
	 * レポート対象区分：投入有償差益かどうか
	 * @param type 属性値
	 * @return 属性値が投入有償差益の値の場合true
	 */
	public static boolean isIN_ONR_DIFF(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.IN_ONR_DIFF.isSame(type);
	}

	/**
	 * レポート対象区分：月初改定差異かどうか
	 * @param value 定数値
	 * @return 定数値が月初改定差異の値の場合true
	 */
	public static boolean isST_DIFF(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ST_DIFF.isSame(type);
	}

	/**
	 * レポート対象区分：月初改定差異かどうか
	 * @param type 属性値
	 * @return 属性値が月初改定差異の値の場合true
	 */
	public static boolean isST_DIFF(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ST_DIFF.isSame(type);
	}

	/**
	 * レポート対象区分：在庫評価損かどうか
	 * @param value 定数値
	 * @return 定数値が在庫評価損の値の場合true
	 */
	public static boolean isSTK_LOSS(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.STK_LOSS.isSame(type);
	}

	/**
	 * レポート対象区分：在庫評価損かどうか
	 * @param type 属性値
	 * @return 属性値が在庫評価損の値の場合true
	 */
	public static boolean isSTK_LOSS(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.STK_LOSS.isSame(type);
	}

	/**
	 * レポート対象区分：受払差額かどうか
	 * @param value 定数値
	 * @return 定数値が受払差額の値の場合true
	 */
	public static boolean isADJ(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ADJ.isSame(type);
	}

	/**
	 * レポート対象区分：受払差額かどうか
	 * @param type 属性値
	 * @return 属性値が受払差額の値の場合true
	 */
	public static boolean isADJ(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ADJ.isSame(type);
	}

	/**
	 * レポート対象区分：配賦かどうか
	 * @param value 定数値
	 * @return 定数値が配賦の値の場合true
	 */
	public static boolean isALC(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.ALC.isSame(type);
	}

	/**
	 * レポート対象区分：配賦かどうか
	 * @param type 属性値
	 * @return 属性値が配賦の値の場合true
	 */
	public static boolean isALC(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.ALC.isSame(type);
	}

	/**
	 * レポート対象区分：数量差異かどうか
	 * @param value 定数値
	 * @return 定数値が数量差異の値の場合true
	 */
	public static boolean isDIFF_QTY(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_QTY.isSame(type);
	}

	/**
	 * レポート対象区分：数量差異かどうか
	 * @param type 属性値
	 * @return 属性値が数量差異の値の場合true
	 */
	public static boolean isDIFF_QTY(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_QTY.isSame(type);
	}

	/**
	 * レポート対象区分：払出価格差異かどうか
	 * @param value 定数値
	 * @return 定数値が払出価格差異の値の場合true
	 */
	public static boolean isDIFF_UP(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_UP.isSame(type);
	}

	/**
	 * レポート対象区分：払出価格差異かどうか
	 * @param type 属性値
	 * @return 属性値が払出価格差異の値の場合true
	 */
	public static boolean isDIFF_UP(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_UP.isSame(type);
	}

	/**
	 * レポート対象区分：外注単価差異かどうか
	 * @param value 定数値
	 * @return 定数値が外注単価差異の値の場合true
	 */
	public static boolean isDIFF_OUTSRC(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_OUTSRC.isSame(type);
	}

	/**
	 * レポート対象区分：外注単価差異かどうか
	 * @param type 属性値
	 * @return 属性値が外注単価差異の値の場合true
	 */
	public static boolean isDIFF_OUTSRC(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_OUTSRC.isSame(type);
	}

	/**
	 * レポート対象区分：自給単価差異かどうか
	 * @param value 定数値
	 * @return 定数値が自給単価差異の値の場合true
	 */
	public static boolean isDIFF_SS(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_SS.isSame(type);
	}

	/**
	 * レポート対象区分：自給単価差異かどうか
	 * @param type 属性値
	 * @return 属性値が自給単価差異の値の場合true
	 */
	public static boolean isDIFF_SS(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_SS.isSame(type);
	}

	/**
	 * レポート対象区分：工数差異かどうか
	 * @param value 定数値
	 * @return 定数値が工数差異の値の場合true
	 */
	public static boolean isDIFF_WK(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_WK.isSame(type);
	}

	/**
	 * レポート対象区分：工数差異かどうか
	 * @param type 属性値
	 * @return 属性値が工数差異の値の場合true
	 */
	public static boolean isDIFF_WK(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_WK.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異1かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異1の値の場合true
	 */
	public static boolean isDIFF_A(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_A.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異1かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異1の値の場合true
	 */
	public static boolean isDIFF_A(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_A.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異2かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異2の値の場合true
	 */
	public static boolean isDIFF_B(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_B.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異2かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異2の値の場合true
	 */
	public static boolean isDIFF_B(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_B.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異3かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異3の値の場合true
	 */
	public static boolean isDIFF_C(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_C.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異3かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異3の値の場合true
	 */
	public static boolean isDIFF_C(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_C.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異4かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異4の値の場合true
	 */
	public static boolean isDIFF_D(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_D.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異4かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異4の値の場合true
	 */
	public static boolean isDIFF_D(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_D.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異5かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異5の値の場合true
	 */
	public static boolean isDIFF_E(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_E.isSame(type);
	}

	/**
	 * レポート対象区分：実績差異5かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異5の値の場合true
	 */
	public static boolean isDIFF_E(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_E.isSame(type);
	}

	/**
	 * レポート対象区分：配賦率差異かどうか
	 * @param value 定数値
	 * @return 定数値が配賦率差異の値の場合true
	 */
	public static boolean isDIFF_RT(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_RT.isSame(type);
	}

	/**
	 * レポート対象区分：配賦率差異かどうか
	 * @param type 属性値
	 * @return 属性値が配賦率差異の値の場合true
	 */
	public static boolean isDIFF_RT(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_RT.isSame(type);
	}

	/**
	 * レポート対象区分：標準調整差異かどうか
	 * @param value 定数値
	 * @return 定数値が標準調整差異の値の場合true
	 */
	public static boolean isDIFF_STD(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_STD.isSame(type);
	}

	/**
	 * レポート対象区分：標準調整差異かどうか
	 * @param type 属性値
	 * @return 属性値が標準調整差異の値の場合true
	 */
	public static boolean isDIFF_STD(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_STD.isSame(type);
	}

	/**
	 * レポート対象区分：製造原価差異かどうか
	 * @param value 定数値
	 * @return 定数値が製造原価差異の値の場合true
	 */
	public static boolean isDIFF_INST(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_INST.isSame(type);
	}

	/**
	 * レポート対象区分：製造原価差異かどうか
	 * @param type 属性値
	 * @return 属性値が製造原価差異の値の場合true
	 */
	public static boolean isDIFF_INST(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_INST.isSame(type);
	}

	/**
	 * レポート対象区分：受入価格差異かどうか
	 * @param value 定数値
	 * @return 定数値が受入価格差異の値の場合true
	 */
	public static boolean isDIFF_IO_PRI(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_IO_PRI.isSame(type);
	}

	/**
	 * レポート対象区分：受入価格差異かどうか
	 * @param type 属性値
	 * @return 属性値が受入価格差異の値の場合true
	 */
	public static boolean isDIFF_IO_PRI(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_IO_PRI.isSame(type);
	}

	/**
	 * レポート対象区分：数量差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が数量差異（子）の値の場合true
	 */
	public static boolean isDIFF_QTY_CHD(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_QTY_CHD.isSame(type);
	}

	/**
	 * レポート対象区分：数量差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が数量差異（子）の値の場合true
	 */
	public static boolean isDIFF_QTY_CHD(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_QTY_CHD.isSame(type);
	}

	/**
	 * レポート対象区分：払出価格差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が払出価格差異（子）の値の場合true
	 */
	public static boolean isDIFF_UP_CHD(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_UP_CHD.isSame(type);
	}

	/**
	 * レポート対象区分：払出価格差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が払出価格差異（子）の値の場合true
	 */
	public static boolean isDIFF_UP_CHD(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_UP_CHD.isSame(type);
	}

	/**
	 * レポート対象区分：自給単価差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が自給単価差異（子）の値の場合true
	 */
	public static boolean isDIFF_SS_CHD(String value) {
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
		return MAC_RPT_TGT_TYP.DIFF_SS_CHD.isSame(type);
	}

	/**
	 * レポート対象区分：自給単価差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が自給単価差異（子）の値の場合true
	 */
	public static boolean isDIFF_SS_CHD(MAC_RPT_TGT_TYP type) {
		return MAC_RPT_TGT_TYP.DIFF_SS_CHD.isSame(type);
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
			MAC_RPT_TGT_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.get(value);
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
			MAC_RPT_TGT_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
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
			MAC_RPT_TGT_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.get(value);
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
			MAC_RPT_TGT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
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
			MAC_RPT_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.get(value);
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
			MAC_RPT_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
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
			MAC_RPT_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.get(value);
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
			MAC_RPT_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_RPT_TGT_TYP type = MAC_RPT_TGT_TYP.getNE(value);
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
