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
abstract class MAC_IO_TGT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "IO_TGT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_IO_TGT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "io_tgt_typ";

	public static final String $NAME = "io_tgt_typ_nm";

	public static final String $IS_SLIP = "is_slip";

	/*
	 * 定数の定義です。
	 */
	/** 受払対象区分：月初在庫
	 */
	public static final MAC_IO_TGT_TYP ST_STK = create("1", "ST_STK", false);

	/** 受払対象区分：月初仕掛
	 */
	public static final MAC_IO_TGT_TYP ST_WIP = create("2", "ST_WIP", false);

	/** 受払対象区分：購買
	 */
	public static final MAC_IO_TGT_TYP PURC = create("3", "PURC", true);

	/** 受払対象区分：完成
	 */
	public static final MAC_IO_TGT_TYP COMP = create("4", "COMP", true);

	/** 受払対象区分：発生
	 */
	public static final MAC_IO_TGT_TYP INST = create("5", "INST", true);

	/** 受払対象区分：投入
	 */
	public static final MAC_IO_TGT_TYP INPT = create("6", "INPT", true);

	/** 受払対象区分：売上
	 */
	public static final MAC_IO_TGT_TYP SLS = create("7", "SLS", true);

	/** 受払対象区分：月末在庫
	 */
	public static final MAC_IO_TGT_TYP END_STK = create("8", "END_STK", false);

	/** 受払対象区分：月末仕掛
	 */
	public static final MAC_IO_TGT_TYP END_WIP = create("9", "END_WIP", false);

	/** 受払対象区分：無償支給受入
	 */
	public static final MAC_IO_TGT_TYP FFR_PROV_IN = create("A", "FFR_PROV_IN", true);

	/** 受払対象区分：無償支給払出
	 */
	public static final MAC_IO_TGT_TYP FFR_PROV_OUT = create("B", "FFR_PROV_OUT", true);

	/** 受払対象区分：有償支給受入
	 */
	public static final MAC_IO_TGT_TYP ONR_PROV_IN = create("C", "ONR_PROV_IN", true);

	/** 受払対象区分：有償支給払出
	 */
	public static final MAC_IO_TGT_TYP ONR_PROV_OUT = create("D", "ONR_PROV_OUT", true);

	/** 受払対象区分：入庫
	 */
	public static final MAC_IO_TGT_TYP STK_IN = create("E", "STK_IN", true);

	/** 受払対象区分：出庫
	 */
	public static final MAC_IO_TGT_TYP STK_OUT = create("F", "STK_OUT", true);

	/** 受払対象区分：入出庫受入
	 */
	public static final MAC_IO_TGT_TYP STK_IO_IN = create("G", "STK_IO_IN", true);

	/** 受払対象区分：入出庫払出
	 */
	public static final MAC_IO_TGT_TYP STK_IO_OUT = create("H", "STK_IO_OUT", true);

	/** 受払対象区分：月初在庫仕掛
	 */
	public static final MAC_IO_TGT_TYP ST_STKWIP = create("I", "ST_STKWIP", false);

	/** 受払対象区分：月末在庫仕掛
	 */
	public static final MAC_IO_TGT_TYP END_STKWIP = create("J", "END_STKWIP", false);

	/** 受払対象区分：評価損
	 */
	public static final MAC_IO_TGT_TYP LOSS_EVAL = create("K", "LOSS_EVAL", false);

	/** 受払対象区分：汎用配賦
	 */
	public static final MAC_IO_TGT_TYP GP_ALC = create("L", "GP_ALC", false);

	/** 受払対象区分：総平均単価
	 */
	public static final MAC_IO_TGT_TYP AVE = create("T", "AVE", false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IO_TGT_TYP create() {
		return new MAC_IO_TGT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_IO_TGT_TYP get(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		if (type == null) {
			throw MAC_IO_TGT_TYP.invalidValue(value);
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
	public static MAC_IO_TGT_TYP getNE(String value) {
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IO_TGT_TYP create(String value, String xmlKey, boolean attr1) {
		MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_SLIP, attr1);
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
	 * is_slipの値を返します。
	 * @return is_slipの値
	 */
	public boolean is_slip() {
		return constR.getBooleanNE($IS_SLIP);
	}

	/** 
	 * valueに対応する定数のis_slipの値を返します。
	 * @param value 定数値
	 * @return is_slipの値
	 */
	public static boolean is_slip(String value) {
		MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_slip();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.getNE(value);
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
		MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.getNE(value);
		if (me == null) {
			throw MAC_IO_TGT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_slip());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_IO_TGT_TYP[] array() {
		if (array == null) {
			array = new MAC_IO_TGT_TYP[] {
					MAC_IO_TGT_TYP.ST_STK, MAC_IO_TGT_TYP.ST_WIP, MAC_IO_TGT_TYP.PURC, MAC_IO_TGT_TYP.COMP, MAC_IO_TGT_TYP.INST, 
					 MAC_IO_TGT_TYP.INPT, MAC_IO_TGT_TYP.SLS, MAC_IO_TGT_TYP.END_STK, MAC_IO_TGT_TYP.END_WIP, MAC_IO_TGT_TYP.FFR_PROV_IN, MAC_IO_TGT_TYP.FFR_PROV_OUT, 
					 MAC_IO_TGT_TYP.ONR_PROV_IN, MAC_IO_TGT_TYP.ONR_PROV_OUT, MAC_IO_TGT_TYP.STK_IN, MAC_IO_TGT_TYP.STK_OUT, MAC_IO_TGT_TYP.STK_IO_IN, MAC_IO_TGT_TYP.STK_IO_OUT, 
					 MAC_IO_TGT_TYP.ST_STKWIP, MAC_IO_TGT_TYP.END_STKWIP, MAC_IO_TGT_TYP.LOSS_EVAL, MAC_IO_TGT_TYP.GP_ALC, MAC_IO_TGT_TYP.AVE
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
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
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
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
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
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
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
			if(MAC_IO_TGT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_IO_TGT_TYP me = MAC_IO_TGT_TYP.get(MAC_IO_TGT_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_IO_TGT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_IO_TGT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_IO_TGT_TYP.list();
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
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
			if(MAC_IO_TGT_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_IO_TGT_TYP.subList(cols, vals);
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
		for (MAC_IO_TGT_TYP me : MAC_IO_TGT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_IO_TGT_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_IO_TGT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_IO_TGT_TYP", col);}
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
	protected boolean isSame(MAC_IO_TGT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受払対象区分：月初在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.ST_STK.isSame(type);
	}

	/**
	 * 受払対象区分：月初在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫の値の場合true
	 */
	public static boolean isST_STK(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.ST_STK.isSame(type);
	}

	/**
	 * 受払対象区分：月初仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.ST_WIP.isSame(type);
	}

	/**
	 * 受払対象区分：月初仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月初仕掛の値の場合true
	 */
	public static boolean isST_WIP(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.ST_WIP.isSame(type);
	}

	/**
	 * 受払対象区分：購買かどうか
	 * @param value 定数値
	 * @return 定数値が購買の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.PURC.isSame(type);
	}

	/**
	 * 受払対象区分：購買かどうか
	 * @param type 属性値
	 * @return 属性値が購買の値の場合true
	 */
	public static boolean isPURC(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.PURC.isSame(type);
	}

	/**
	 * 受払対象区分：完成かどうか
	 * @param value 定数値
	 * @return 定数値が完成の値の場合true
	 */
	public static boolean isCOMP(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.COMP.isSame(type);
	}

	/**
	 * 受払対象区分：完成かどうか
	 * @param type 属性値
	 * @return 属性値が完成の値の場合true
	 */
	public static boolean isCOMP(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.COMP.isSame(type);
	}

	/**
	 * 受払対象区分：発生かどうか
	 * @param value 定数値
	 * @return 定数値が発生の値の場合true
	 */
	public static boolean isINST(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.INST.isSame(type);
	}

	/**
	 * 受払対象区分：発生かどうか
	 * @param type 属性値
	 * @return 属性値が発生の値の場合true
	 */
	public static boolean isINST(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.INST.isSame(type);
	}

	/**
	 * 受払対象区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.INPT.isSame(type);
	}

	/**
	 * 受払対象区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.INPT.isSame(type);
	}

	/**
	 * 受払対象区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.SLS.isSame(type);
	}

	/**
	 * 受払対象区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.SLS.isSame(type);
	}

	/**
	 * 受払対象区分：月末在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払対象区分：月末在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払対象区分：月末仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.END_WIP.isSame(type);
	}

	/**
	 * 受払対象区分：月末仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月末仕掛の値の場合true
	 */
	public static boolean isEND_WIP(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.END_WIP.isSame(type);
	}

	/**
	 * 受払対象区分：無償支給受入かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給受入の値の場合true
	 */
	public static boolean isFFR_PROV_IN(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.FFR_PROV_IN.isSame(type);
	}

	/**
	 * 受払対象区分：無償支給受入かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給受入の値の場合true
	 */
	public static boolean isFFR_PROV_IN(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.FFR_PROV_IN.isSame(type);
	}

	/**
	 * 受払対象区分：無償支給払出かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給払出の値の場合true
	 */
	public static boolean isFFR_PROV_OUT(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.FFR_PROV_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：無償支給払出かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給払出の値の場合true
	 */
	public static boolean isFFR_PROV_OUT(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.FFR_PROV_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：有償支給受入かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給受入の値の場合true
	 */
	public static boolean isONR_PROV_IN(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.ONR_PROV_IN.isSame(type);
	}

	/**
	 * 受払対象区分：有償支給受入かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給受入の値の場合true
	 */
	public static boolean isONR_PROV_IN(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.ONR_PROV_IN.isSame(type);
	}

	/**
	 * 受払対象区分：有償支給払出かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給払出の値の場合true
	 */
	public static boolean isONR_PROV_OUT(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.ONR_PROV_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：有償支給払出かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給払出の値の場合true
	 */
	public static boolean isONR_PROV_OUT(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.ONR_PROV_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：入庫かどうか
	 * @param value 定数値
	 * @return 定数値が入庫の値の場合true
	 */
	public static boolean isSTK_IN(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.STK_IN.isSame(type);
	}

	/**
	 * 受払対象区分：入庫かどうか
	 * @param type 属性値
	 * @return 属性値が入庫の値の場合true
	 */
	public static boolean isSTK_IN(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.STK_IN.isSame(type);
	}

	/**
	 * 受払対象区分：出庫かどうか
	 * @param value 定数値
	 * @return 定数値が出庫の値の場合true
	 */
	public static boolean isSTK_OUT(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.STK_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：出庫かどうか
	 * @param type 属性値
	 * @return 属性値が出庫の値の場合true
	 */
	public static boolean isSTK_OUT(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.STK_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：入出庫受入かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫受入の値の場合true
	 */
	public static boolean isSTK_IO_IN(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.STK_IO_IN.isSame(type);
	}

	/**
	 * 受払対象区分：入出庫受入かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫受入の値の場合true
	 */
	public static boolean isSTK_IO_IN(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.STK_IO_IN.isSame(type);
	}

	/**
	 * 受払対象区分：入出庫払出かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫払出の値の場合true
	 */
	public static boolean isSTK_IO_OUT(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.STK_IO_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：入出庫払出かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫払出の値の場合true
	 */
	public static boolean isSTK_IO_OUT(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.STK_IO_OUT.isSame(type);
	}

	/**
	 * 受払対象区分：月初在庫仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫仕掛の値の場合true
	 */
	public static boolean isST_STKWIP(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.ST_STKWIP.isSame(type);
	}

	/**
	 * 受払対象区分：月初在庫仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫仕掛の値の場合true
	 */
	public static boolean isST_STKWIP(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.ST_STKWIP.isSame(type);
	}

	/**
	 * 受払対象区分：月末在庫仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫仕掛の値の場合true
	 */
	public static boolean isEND_STKWIP(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.END_STKWIP.isSame(type);
	}

	/**
	 * 受払対象区分：月末在庫仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫仕掛の値の場合true
	 */
	public static boolean isEND_STKWIP(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.END_STKWIP.isSame(type);
	}

	/**
	 * 受払対象区分：評価損かどうか
	 * @param value 定数値
	 * @return 定数値が評価損の値の場合true
	 */
	public static boolean isLOSS_EVAL(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.LOSS_EVAL.isSame(type);
	}

	/**
	 * 受払対象区分：評価損かどうか
	 * @param type 属性値
	 * @return 属性値が評価損の値の場合true
	 */
	public static boolean isLOSS_EVAL(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.LOSS_EVAL.isSame(type);
	}

	/**
	 * 受払対象区分：汎用配賦かどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.GP_ALC.isSame(type);
	}

	/**
	 * 受払対象区分：汎用配賦かどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.GP_ALC.isSame(type);
	}

	/**
	 * 受払対象区分：総平均単価かどうか
	 * @param value 定数値
	 * @return 定数値が総平均単価の値の場合true
	 */
	public static boolean isAVE(String value) {
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
		return MAC_IO_TGT_TYP.AVE.isSame(type);
	}

	/**
	 * 受払対象区分：総平均単価かどうか
	 * @param type 属性値
	 * @return 属性値が総平均単価の値の場合true
	 */
	public static boolean isAVE(MAC_IO_TGT_TYP type) {
		return MAC_IO_TGT_TYP.AVE.isSame(type);
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
			MAC_IO_TGT_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.get(value);
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
			MAC_IO_TGT_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
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
			MAC_IO_TGT_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.get(value);
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
			MAC_IO_TGT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
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
			MAC_IO_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.get(value);
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
			MAC_IO_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
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
			MAC_IO_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.get(value);
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
			MAC_IO_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IO_TGT_TYP type = MAC_IO_TGT_TYP.getNE(value);
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
