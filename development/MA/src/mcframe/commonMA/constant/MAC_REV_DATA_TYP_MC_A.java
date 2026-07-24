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
abstract class MAC_REV_DATA_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "REV_DATA_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_REV_DATA_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "rev_data_typ";

	public static final String $NAME = "rev_data_typ_nm";

	public static final String $LOGIC_ID = "logic_id";

	public static final String $OPERATION_ID = "operation_id";

	/*
	 * 定数の定義です。
	 */
	/** 改訂履歴データ区分：受注
	 */
	public static final MAC_REV_DATA_TYP MST_SLO = create("MSBB01", "MST_SLO", "MSBBL6020", "Slo_RevUpd01");

	/** 改訂履歴データ区分：受注納期回答
	 */
	public static final MAC_REV_DATA_TYP MST_SLO_PRMS = create("MSBB02", "MST_SLO_PRMS", "MSBBL1230", "RevUpd01");

	/** 改訂履歴データ区分：製造指図
	 */
	public static final MAC_REV_DATA_TYP MST_MFG_INST = create("MSBC01", "MST_MFG_INST", "MSBCL6000", "MfgInstReg_RevUpd01");

	/** 改訂履歴データ区分：発注
	 */
	public static final MAC_REV_DATA_TYP MST_PO = create("MSBD01", "MST_PO", "MSBDL5100", "Po_RevUpd01");

	/** 改訂履歴データ区分：仕入返品実績
	 */
	public static final MAC_REV_DATA_TYP MST_PURC_RET_ACT = create("MSBD02", "MST_PURC_RET_ACT", "MSBDL5170", "PurcRet_RevUpd01");

	/** 改訂履歴データ区分：他勘定振替実績
	 */
	public static final MAC_REV_DATA_TYP MST_ACXFR_ACT = create("MSBE01", "MST_ACXFR_ACT", "MSBEL6400", "AcXfrAct_RevUpd01");

	/** 改訂履歴データ区分：出荷指図
	 */
	public static final MAC_REV_DATA_TYP MST_SHIP_INST = create("MSBE02", "MST_SHIP_INST", "MSBEL5530", "ShipInst_RevUpd01");

	/** 改訂履歴データ区分：出荷実績
	 */
	public static final MAC_REV_DATA_TYP MST_SHIP_ACT = create("MSBE03", "MST_SHIP_ACT", "MSBEL5540", "ShipAct_RevUpd01");

	/** 改訂履歴データ区分：インボイス
	 */
	public static final MAC_REV_DATA_TYP MST_IV = create("MSBE04", "MST_IV", "MSBEL5730", "Iv_RevUpd01");

	/** 改訂履歴データ区分：受領インボイス
	 */
	public static final MAC_REV_DATA_TYP MST_RCPT_IV = create("MSBE05", "MST_RCPT_IV", "MSBEL5740", "RcptIv_RevUpd01");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_REV_DATA_TYP create() {
		return new MAC_REV_DATA_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_REV_DATA_TYP get(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		if (type == null) {
			throw MAC_REV_DATA_TYP.invalidValue(value);
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
	public static MAC_REV_DATA_TYP getNE(String value) {
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_REV_DATA_TYP create(String value, String xmlKey, String attr1, String attr2) {
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($LOGIC_ID, attr1);
		me.constR.addStringColumn($OPERATION_ID, attr2);
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
	 * logic_idの値を返します。
	 * @return logic_idの値
	 */
	public String logic_id() {
		return constR.getStringNE($LOGIC_ID);
	}

	/** 
	 * valueに対応する定数のlogic_idの値を返します。
	 * @param value 定数値
	 * @return logic_idの値
	 */
	public static String logic_id(String value) {
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.logic_id();
	}

	/** 
	 * operation_idの値を返します。
	 * @return operation_idの値
	 */
	public String operation_id() {
		return constR.getStringNE($OPERATION_ID);
	}

	/** 
	 * valueに対応する定数のoperation_idの値を返します。
	 * @param value 定数値
	 * @return operation_idの値
	 */
	public static String operation_id(String value) {
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.operation_id();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.getNE(value);
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
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.getNE(value);
		if (me == null) {
			throw MAC_REV_DATA_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.getNE(value);
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
		return createStringPath(value(), name(), logic_id(), operation_id());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_REV_DATA_TYP[] array() {
		if (array == null) {
			array = new MAC_REV_DATA_TYP[] {
					MAC_REV_DATA_TYP.MST_SLO, MAC_REV_DATA_TYP.MST_SLO_PRMS, MAC_REV_DATA_TYP.MST_MFG_INST, MAC_REV_DATA_TYP.MST_PO, MAC_REV_DATA_TYP.MST_PURC_RET_ACT, 
					 MAC_REV_DATA_TYP.MST_ACXFR_ACT, MAC_REV_DATA_TYP.MST_SHIP_INST, MAC_REV_DATA_TYP.MST_SHIP_ACT, MAC_REV_DATA_TYP.MST_IV, MAC_REV_DATA_TYP.MST_RCPT_IV
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
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
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
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
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
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
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
			if(MAC_REV_DATA_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_REV_DATA_TYP me = MAC_REV_DATA_TYP.get(MAC_REV_DATA_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_REV_DATA_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_REV_DATA_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_REV_DATA_TYP.list();
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
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
			if(MAC_REV_DATA_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_REV_DATA_TYP.subList(cols, vals);
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
		for (MAC_REV_DATA_TYP me : MAC_REV_DATA_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_REV_DATA_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_REV_DATA_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_REV_DATA_TYP", col);}
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
	protected boolean isSame(MAC_REV_DATA_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 改訂履歴データ区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isMST_SLO(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_SLO.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isMST_SLO(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_SLO.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：受注納期回答かどうか
	 * @param value 定数値
	 * @return 定数値が受注納期回答の値の場合true
	 */
	public static boolean isMST_SLO_PRMS(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_SLO_PRMS.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：受注納期回答かどうか
	 * @param type 属性値
	 * @return 属性値が受注納期回答の値の場合true
	 */
	public static boolean isMST_SLO_PRMS(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_SLO_PRMS.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：製造指図かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図の値の場合true
	 */
	public static boolean isMST_MFG_INST(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_MFG_INST.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：製造指図かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図の値の場合true
	 */
	public static boolean isMST_MFG_INST(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_MFG_INST.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：発注かどうか
	 * @param value 定数値
	 * @return 定数値が発注の値の場合true
	 */
	public static boolean isMST_PO(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_PO.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：発注かどうか
	 * @param type 属性値
	 * @return 属性値が発注の値の場合true
	 */
	public static boolean isMST_PO(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_PO.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：仕入返品実績かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品実績の値の場合true
	 */
	public static boolean isMST_PURC_RET_ACT(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_PURC_RET_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：仕入返品実績かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品実績の値の場合true
	 */
	public static boolean isMST_PURC_RET_ACT(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_PURC_RET_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：他勘定振替実績かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績の値の場合true
	 */
	public static boolean isMST_ACXFR_ACT(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_ACXFR_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：他勘定振替実績かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績の値の場合true
	 */
	public static boolean isMST_ACXFR_ACT(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_ACXFR_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：出荷指図かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図の値の場合true
	 */
	public static boolean isMST_SHIP_INST(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_SHIP_INST.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：出荷指図かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図の値の場合true
	 */
	public static boolean isMST_SHIP_INST(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_SHIP_INST.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：出荷実績かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績の値の場合true
	 */
	public static boolean isMST_SHIP_ACT(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_SHIP_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：出荷実績かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績の値の場合true
	 */
	public static boolean isMST_SHIP_ACT(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_SHIP_ACT.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：インボイスかどうか
	 * @param value 定数値
	 * @return 定数値がインボイスの値の場合true
	 */
	public static boolean isMST_IV(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_IV.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：インボイスかどうか
	 * @param type 属性値
	 * @return 属性値がインボイスの値の場合true
	 */
	public static boolean isMST_IV(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_IV.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：受領インボイスかどうか
	 * @param value 定数値
	 * @return 定数値が受領インボイスの値の場合true
	 */
	public static boolean isMST_RCPT_IV(String value) {
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
		return MAC_REV_DATA_TYP.MST_RCPT_IV.isSame(type);
	}

	/**
	 * 改訂履歴データ区分：受領インボイスかどうか
	 * @param type 属性値
	 * @return 属性値が受領インボイスの値の場合true
	 */
	public static boolean isMST_RCPT_IV(MAC_REV_DATA_TYP type) {
		return MAC_REV_DATA_TYP.MST_RCPT_IV.isSame(type);
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
			MAC_REV_DATA_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.get(value);
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
			MAC_REV_DATA_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
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
			MAC_REV_DATA_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.get(value);
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
			MAC_REV_DATA_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
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
			MAC_REV_DATA_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.get(value);
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
			MAC_REV_DATA_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
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
			MAC_REV_DATA_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.get(value);
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
			MAC_REV_DATA_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_REV_DATA_TYP type = MAC_REV_DATA_TYP.getNE(value);
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
