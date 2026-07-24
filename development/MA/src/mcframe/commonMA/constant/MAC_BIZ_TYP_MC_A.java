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
abstract class MAC_BIZ_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "BIZ_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_BIZ_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "biz_typ";

	public static final String $NAME = "biz_typ_nm";

	public static final String $KEY_NUM = "key_num";

	public static final String $DEL_KEY_NUM = "del_key_num";

	public static final String $IF_TBL = "if_tbl";

	/*
	 * 定数の定義です。
	 */
	/** 業務区分：受注
	 */
	public static final MAC_BIZ_TYP SLO = create("01", "SLO", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：発注
	 */
	public static final MAC_BIZ_TYP PO = create("02", "PO", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：売上返品
	 */
	public static final MAC_BIZ_TYP SLS_RET = create("03", "SLS_RET", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：仕入返品
	 */
	public static final MAC_BIZ_TYP PURC_RET = create("04", "PURC_RET", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：インボイス
	 */
	public static final MAC_BIZ_TYP IV = create("05", "IV", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：受領インボイス
	 */
	public static final MAC_BIZ_TYP RCPT_IV = create("06", "RCPT_IV", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：納品書（販売）
	 */
	public static final MAC_BIZ_TYP DLV_SLIP_SLS = create("07", "DLV_SLIP_SLS", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：納品書（購買）
	 */
	public static final MAC_BIZ_TYP DLV_SLIP_PURC = create("08", "DLV_SLIP_PURC", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：請求
	 */
	public static final MAC_BIZ_TYP BILL = create("09", "BILL", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：請求受領
	 */
	public static final MAC_BIZ_TYP BILL_RCPT = create("10", "BILL_RCPT", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：支払通知
	 */
	public static final MAC_BIZ_TYP PAY_NTC = create("11", "PAY_NTC", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：見積
	 */
	public static final MAC_BIZ_TYP QTN = create("12", "QTN", new MCNumber(2), new MCNumber(2), null);

	/** 業務区分：支払通知受領
	 */
	public static final MAC_BIZ_TYP PAY_NTC_RCPT = create("13", "PAY_NTC_RCPT", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：受注（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP SLO_EDI = create("14", "SLO_EDI", new MCNumber(2), new MCNumber(1), "MST_SLO_RECV_IF");

	/** 業務区分：入荷（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP ARR_EDI = create("15", "ARR_EDI", new MCNumber(2), new MCNumber(1), "MST_ESHIP_ACT_RECV_IF");

	/** 業務区分：検収売上（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP ACCPT_SLS_EDI = create("16", "ACCPT_SLS_EDI", new MCNumber(2), new MCNumber(1), "MST_ACCPT_RECV_IF");

	/** 業務区分：請求受領（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP BILL_RCPT_EDI = create("17", "BILL_RCPT_EDI", new MCNumber(1), new MCNumber(1), "MST_BILL_RECV_IF");

	/** 業務区分：発注（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP PO_EDI = create("18", "PO_EDI", new MCNumber(2), new MCNumber(1), "MST_PO_SEND_IF");

	/** 業務区分：出荷実績（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP SHIP_ACT_EDI = create("19", "SHIP_ACT_EDI", new MCNumber(2), new MCNumber(1), "MST_ESHIP_ACT_SEND_IF");

	/** 業務区分：出荷実績（インボイス）（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP SHIP_ACT_IV_EDI = create("20", "SHIP_ACT_IV_EDI", new MCNumber(2), new MCNumber(1), "MST_ESHIP_ACT_SEND_IF");

	/** 業務区分：仕入検収（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP PURC_ACCPT_EDI = create("21", "PURC_ACCPT_EDI", new MCNumber(2), new MCNumber(1), "MST_ACCPT_SEND_IF");

	/** 業務区分：請求（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP BILL_EDI = create("22", "BILL_EDI", new MCNumber(2), new MCNumber(1), "MST_BILL_SEND_IF");

	/** 業務区分：納品書（販売）（ＥＤＩ）
	 */
	public static final MAC_BIZ_TYP DLV_SLIP_SLS_EDI = create("23", "DLV_SLIP_SLS_EDI", new MCNumber(2), new MCNumber(1), "MST_BILL_SEND_IF");

	/** 業務区分：納品書受領
	 */
	public static final MAC_BIZ_TYP DLV_SLIP_RCPT = create("24", "DLV_SLIP_RCPT", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：請求ＩＦ送信
	 */
	public static final MAC_BIZ_TYP BILL_IF_SND = create("25", "BILL_IF_SND", new MCNumber(2), new MCNumber(1), null);

	/** 業務区分：検査指図
	 */
	public static final MAC_BIZ_TYP INSP_INST = create("26", "INSP_INST", new MCNumber(1), new MCNumber(1), null);

	/** 業務区分：検査実績
	 */
	public static final MAC_BIZ_TYP INSP_ACT = create("27", "INSP_ACT", new MCNumber(1), new MCNumber(1), null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_BIZ_TYP create() {
		return new MAC_BIZ_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_BIZ_TYP get(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		if (type == null) {
			throw MAC_BIZ_TYP.invalidValue(value);
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
	public static MAC_BIZ_TYP getNE(String value) {
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_BIZ_TYP create(String value, String xmlKey, MCNumber attr1, MCNumber attr2, String attr3) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addNumberColumn($KEY_NUM, attr1);
		me.constR.addNumberColumn($DEL_KEY_NUM, attr2);
		me.constR.addStringColumn($IF_TBL, attr3);
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
	 * key_numの値を返します。
	 * @return key_numの値
	 */
	public MCNumber key_num() {
		return constR.getNumberNE($KEY_NUM);
	}

	/** 
	 * valueに対応する定数のkey_numの値を返します。
	 * @param value 定数値
	 * @return key_numの値
	 */
	public static MCNumber key_num(String value) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.key_num();
	}

	/** 
	 * del_key_numの値を返します。
	 * @return del_key_numの値
	 */
	public MCNumber del_key_num() {
		return constR.getNumberNE($DEL_KEY_NUM);
	}

	/** 
	 * valueに対応する定数のdel_key_numの値を返します。
	 * @param value 定数値
	 * @return del_key_numの値
	 */
	public static MCNumber del_key_num(String value) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.del_key_num();
	}

	/** 
	 * if_tblの値を返します。
	 * @return if_tblの値
	 */
	public String if_tbl() {
		return constR.getStringNE($IF_TBL);
	}

	/** 
	 * valueに対応する定数のif_tblの値を返します。
	 * @param value 定数値
	 * @return if_tblの値
	 */
	public static String if_tbl(String value) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.if_tbl();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
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
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
		if (me == null) {
			throw MAC_BIZ_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_BIZ_TYP me = MAC_BIZ_TYP.getNE(value);
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
		return createStringPath(value(), name(), key_num(), del_key_num(), if_tbl());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_BIZ_TYP[] array() {
		if (array == null) {
			array = new MAC_BIZ_TYP[] {
					MAC_BIZ_TYP.SLO, MAC_BIZ_TYP.PO, MAC_BIZ_TYP.SLS_RET, MAC_BIZ_TYP.PURC_RET, MAC_BIZ_TYP.IV, 
					 MAC_BIZ_TYP.RCPT_IV, MAC_BIZ_TYP.DLV_SLIP_SLS, MAC_BIZ_TYP.DLV_SLIP_PURC, MAC_BIZ_TYP.BILL, MAC_BIZ_TYP.BILL_RCPT, MAC_BIZ_TYP.PAY_NTC, 
					 MAC_BIZ_TYP.QTN, MAC_BIZ_TYP.PAY_NTC_RCPT, MAC_BIZ_TYP.SLO_EDI, MAC_BIZ_TYP.ARR_EDI, MAC_BIZ_TYP.ACCPT_SLS_EDI, MAC_BIZ_TYP.BILL_RCPT_EDI, 
					 MAC_BIZ_TYP.PO_EDI, MAC_BIZ_TYP.SHIP_ACT_EDI, MAC_BIZ_TYP.SHIP_ACT_IV_EDI, MAC_BIZ_TYP.PURC_ACCPT_EDI, MAC_BIZ_TYP.BILL_EDI, MAC_BIZ_TYP.DLV_SLIP_SLS_EDI, 
					 MAC_BIZ_TYP.DLV_SLIP_RCPT, MAC_BIZ_TYP.BILL_IF_SND, MAC_BIZ_TYP.INSP_INST, MAC_BIZ_TYP.INSP_ACT
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
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
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
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
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
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
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
			if(MAC_BIZ_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_BIZ_TYP me = MAC_BIZ_TYP.get(MAC_BIZ_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_BIZ_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_BIZ_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_BIZ_TYP.list();
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
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
			if(MAC_BIZ_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_BIZ_TYP.subList(cols, vals);
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
		for (MAC_BIZ_TYP me : MAC_BIZ_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_BIZ_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_BIZ_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_BIZ_TYP", col);}
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
	protected boolean isSame(MAC_BIZ_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 業務区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isSLO(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.SLO.isSame(type);
	}

	/**
	 * 業務区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isSLO(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.SLO.isSame(type);
	}

	/**
	 * 業務区分：発注かどうか
	 * @param value 定数値
	 * @return 定数値が発注の値の場合true
	 */
	public static boolean isPO(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PO.isSame(type);
	}

	/**
	 * 業務区分：発注かどうか
	 * @param type 属性値
	 * @return 属性値が発注の値の場合true
	 */
	public static boolean isPO(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PO.isSame(type);
	}

	/**
	 * 業務区分：売上返品かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品の値の場合true
	 */
	public static boolean isSLS_RET(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.SLS_RET.isSame(type);
	}

	/**
	 * 業務区分：売上返品かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品の値の場合true
	 */
	public static boolean isSLS_RET(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.SLS_RET.isSame(type);
	}

	/**
	 * 業務区分：仕入返品かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RET(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PURC_RET.isSame(type);
	}

	/**
	 * 業務区分：仕入返品かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RET(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PURC_RET.isSame(type);
	}

	/**
	 * 業務区分：インボイスかどうか
	 * @param value 定数値
	 * @return 定数値がインボイスの値の場合true
	 */
	public static boolean isIV(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.IV.isSame(type);
	}

	/**
	 * 業務区分：インボイスかどうか
	 * @param type 属性値
	 * @return 属性値がインボイスの値の場合true
	 */
	public static boolean isIV(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.IV.isSame(type);
	}

	/**
	 * 業務区分：受領インボイスかどうか
	 * @param value 定数値
	 * @return 定数値が受領インボイスの値の場合true
	 */
	public static boolean isRCPT_IV(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.RCPT_IV.isSame(type);
	}

	/**
	 * 業務区分：受領インボイスかどうか
	 * @param type 属性値
	 * @return 属性値が受領インボイスの値の場合true
	 */
	public static boolean isRCPT_IV(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.RCPT_IV.isSame(type);
	}

	/**
	 * 業務区分：納品書（販売）かどうか
	 * @param value 定数値
	 * @return 定数値が納品書（販売）の値の場合true
	 */
	public static boolean isDLV_SLIP_SLS(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.DLV_SLIP_SLS.isSame(type);
	}

	/**
	 * 業務区分：納品書（販売）かどうか
	 * @param type 属性値
	 * @return 属性値が納品書（販売）の値の場合true
	 */
	public static boolean isDLV_SLIP_SLS(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.DLV_SLIP_SLS.isSame(type);
	}

	/**
	 * 業務区分：納品書（購買）かどうか
	 * @param value 定数値
	 * @return 定数値が納品書（購買）の値の場合true
	 */
	public static boolean isDLV_SLIP_PURC(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.DLV_SLIP_PURC.isSame(type);
	}

	/**
	 * 業務区分：納品書（購買）かどうか
	 * @param type 属性値
	 * @return 属性値が納品書（購買）の値の場合true
	 */
	public static boolean isDLV_SLIP_PURC(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.DLV_SLIP_PURC.isSame(type);
	}

	/**
	 * 業務区分：請求かどうか
	 * @param value 定数値
	 * @return 定数値が請求の値の場合true
	 */
	public static boolean isBILL(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.BILL.isSame(type);
	}

	/**
	 * 業務区分：請求かどうか
	 * @param type 属性値
	 * @return 属性値が請求の値の場合true
	 */
	public static boolean isBILL(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.BILL.isSame(type);
	}

	/**
	 * 業務区分：請求受領かどうか
	 * @param value 定数値
	 * @return 定数値が請求受領の値の場合true
	 */
	public static boolean isBILL_RCPT(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.BILL_RCPT.isSame(type);
	}

	/**
	 * 業務区分：請求受領かどうか
	 * @param type 属性値
	 * @return 属性値が請求受領の値の場合true
	 */
	public static boolean isBILL_RCPT(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.BILL_RCPT.isSame(type);
	}

	/**
	 * 業務区分：支払通知かどうか
	 * @param value 定数値
	 * @return 定数値が支払通知の値の場合true
	 */
	public static boolean isPAY_NTC(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PAY_NTC.isSame(type);
	}

	/**
	 * 業務区分：支払通知かどうか
	 * @param type 属性値
	 * @return 属性値が支払通知の値の場合true
	 */
	public static boolean isPAY_NTC(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PAY_NTC.isSame(type);
	}

	/**
	 * 業務区分：見積かどうか
	 * @param value 定数値
	 * @return 定数値が見積の値の場合true
	 */
	public static boolean isQTN(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.QTN.isSame(type);
	}

	/**
	 * 業務区分：見積かどうか
	 * @param type 属性値
	 * @return 属性値が見積の値の場合true
	 */
	public static boolean isQTN(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.QTN.isSame(type);
	}

	/**
	 * 業務区分：支払通知受領かどうか
	 * @param value 定数値
	 * @return 定数値が支払通知受領の値の場合true
	 */
	public static boolean isPAY_NTC_RCPT(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PAY_NTC_RCPT.isSame(type);
	}

	/**
	 * 業務区分：支払通知受領かどうか
	 * @param type 属性値
	 * @return 属性値が支払通知受領の値の場合true
	 */
	public static boolean isPAY_NTC_RCPT(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PAY_NTC_RCPT.isSame(type);
	}

	/**
	 * 業務区分：受注（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が受注（ＥＤＩ）の値の場合true
	 */
	public static boolean isSLO_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.SLO_EDI.isSame(type);
	}

	/**
	 * 業務区分：受注（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が受注（ＥＤＩ）の値の場合true
	 */
	public static boolean isSLO_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.SLO_EDI.isSame(type);
	}

	/**
	 * 業務区分：入荷（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が入荷（ＥＤＩ）の値の場合true
	 */
	public static boolean isARR_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.ARR_EDI.isSame(type);
	}

	/**
	 * 業務区分：入荷（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が入荷（ＥＤＩ）の値の場合true
	 */
	public static boolean isARR_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.ARR_EDI.isSame(type);
	}

	/**
	 * 業務区分：検収売上（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が検収売上（ＥＤＩ）の値の場合true
	 */
	public static boolean isACCPT_SLS_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.ACCPT_SLS_EDI.isSame(type);
	}

	/**
	 * 業務区分：検収売上（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が検収売上（ＥＤＩ）の値の場合true
	 */
	public static boolean isACCPT_SLS_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.ACCPT_SLS_EDI.isSame(type);
	}

	/**
	 * 業務区分：請求受領（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が請求受領（ＥＤＩ）の値の場合true
	 */
	public static boolean isBILL_RCPT_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.BILL_RCPT_EDI.isSame(type);
	}

	/**
	 * 業務区分：請求受領（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が請求受領（ＥＤＩ）の値の場合true
	 */
	public static boolean isBILL_RCPT_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.BILL_RCPT_EDI.isSame(type);
	}

	/**
	 * 業務区分：発注（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が発注（ＥＤＩ）の値の場合true
	 */
	public static boolean isPO_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PO_EDI.isSame(type);
	}

	/**
	 * 業務区分：発注（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が発注（ＥＤＩ）の値の場合true
	 */
	public static boolean isPO_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PO_EDI.isSame(type);
	}

	/**
	 * 業務区分：出荷実績（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績（ＥＤＩ）の値の場合true
	 */
	public static boolean isSHIP_ACT_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.SHIP_ACT_EDI.isSame(type);
	}

	/**
	 * 業務区分：出荷実績（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績（ＥＤＩ）の値の場合true
	 */
	public static boolean isSHIP_ACT_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.SHIP_ACT_EDI.isSame(type);
	}

	/**
	 * 業務区分：出荷実績（インボイス）（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績（インボイス）（ＥＤＩ）の値の場合true
	 */
	public static boolean isSHIP_ACT_IV_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.SHIP_ACT_IV_EDI.isSame(type);
	}

	/**
	 * 業務区分：出荷実績（インボイス）（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績（インボイス）（ＥＤＩ）の値の場合true
	 */
	public static boolean isSHIP_ACT_IV_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.SHIP_ACT_IV_EDI.isSame(type);
	}

	/**
	 * 業務区分：仕入検収（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が仕入検収（ＥＤＩ）の値の場合true
	 */
	public static boolean isPURC_ACCPT_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.PURC_ACCPT_EDI.isSame(type);
	}

	/**
	 * 業務区分：仕入検収（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が仕入検収（ＥＤＩ）の値の場合true
	 */
	public static boolean isPURC_ACCPT_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.PURC_ACCPT_EDI.isSame(type);
	}

	/**
	 * 業務区分：請求（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が請求（ＥＤＩ）の値の場合true
	 */
	public static boolean isBILL_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.BILL_EDI.isSame(type);
	}

	/**
	 * 業務区分：請求（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が請求（ＥＤＩ）の値の場合true
	 */
	public static boolean isBILL_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.BILL_EDI.isSame(type);
	}

	/**
	 * 業務区分：納品書（販売）（ＥＤＩ）かどうか
	 * @param value 定数値
	 * @return 定数値が納品書（販売）（ＥＤＩ）の値の場合true
	 */
	public static boolean isDLV_SLIP_SLS_EDI(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.DLV_SLIP_SLS_EDI.isSame(type);
	}

	/**
	 * 業務区分：納品書（販売）（ＥＤＩ）かどうか
	 * @param type 属性値
	 * @return 属性値が納品書（販売）（ＥＤＩ）の値の場合true
	 */
	public static boolean isDLV_SLIP_SLS_EDI(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.DLV_SLIP_SLS_EDI.isSame(type);
	}

	/**
	 * 業務区分：納品書受領かどうか
	 * @param value 定数値
	 * @return 定数値が納品書受領の値の場合true
	 */
	public static boolean isDLV_SLIP_RCPT(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.DLV_SLIP_RCPT.isSame(type);
	}

	/**
	 * 業務区分：納品書受領かどうか
	 * @param type 属性値
	 * @return 属性値が納品書受領の値の場合true
	 */
	public static boolean isDLV_SLIP_RCPT(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.DLV_SLIP_RCPT.isSame(type);
	}

	/**
	 * 業務区分：請求ＩＦ送信かどうか
	 * @param value 定数値
	 * @return 定数値が請求ＩＦ送信の値の場合true
	 */
	public static boolean isBILL_IF_SND(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.BILL_IF_SND.isSame(type);
	}

	/**
	 * 業務区分：請求ＩＦ送信かどうか
	 * @param type 属性値
	 * @return 属性値が請求ＩＦ送信の値の場合true
	 */
	public static boolean isBILL_IF_SND(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.BILL_IF_SND.isSame(type);
	}

	/**
	 * 業務区分：検査指図かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図の値の場合true
	 */
	public static boolean isINSP_INST(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.INSP_INST.isSame(type);
	}

	/**
	 * 業務区分：検査指図かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図の値の場合true
	 */
	public static boolean isINSP_INST(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.INSP_INST.isSame(type);
	}

	/**
	 * 業務区分：検査実績かどうか
	 * @param value 定数値
	 * @return 定数値が検査実績の値の場合true
	 */
	public static boolean isINSP_ACT(String value) {
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
		return MAC_BIZ_TYP.INSP_ACT.isSame(type);
	}

	/**
	 * 業務区分：検査実績かどうか
	 * @param type 属性値
	 * @return 属性値が検査実績の値の場合true
	 */
	public static boolean isINSP_ACT(MAC_BIZ_TYP type) {
		return MAC_BIZ_TYP.INSP_ACT.isSame(type);
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
			MAC_BIZ_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.get(value);
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
			MAC_BIZ_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
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
			MAC_BIZ_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.get(value);
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
			MAC_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
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
			MAC_BIZ_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.get(value);
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
			MAC_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
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
			MAC_BIZ_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.get(value);
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
			MAC_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_BIZ_TYP type = MAC_BIZ_TYP.getNE(value);
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
