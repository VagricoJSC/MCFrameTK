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
abstract class MAC_IF_TRD_TYP_CD_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "IF_TRD_TYP_CD";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_IF_TRD_TYP_CD[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "if_trd_typ_cd";

	public static final String $NAME = "if_trd_typ_cd_nm";

	/*
	 * 定数の定義です。
	 */
	/** ＩＦ取引種別ＣＤ：注文
	 */
	public static final MAC_IF_TRD_TYP_CD PO = create("001", "PO");

	/** ＩＦ取引種別ＣＤ：納期回答
	 */
	public static final MAC_IF_TRD_TYP_CD PRMS = create("002", "PRMS");

	/** ＩＦ取引種別ＣＤ：出荷実績
	 */
	public static final MAC_IF_TRD_TYP_CD SHIP_ACT = create("003", "SHIP_ACT");

	/** ＩＦ取引種別ＣＤ：検収
	 */
	public static final MAC_IF_TRD_TYP_CD ACCPT = create("004", "ACCPT");

	/** ＩＦ取引種別ＣＤ：納入指示
	 */
	public static final MAC_IF_TRD_TYP_CD DLV_INST = create("005", "DLV_INST");

	/** ＩＦ取引種別ＣＤ：請求
	 */
	public static final MAC_IF_TRD_TYP_CD BILL = create("010", "BILL");

	/** ＩＦ取引種別ＣＤ：出荷指図送信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_SHIP_INST_SEND = create("E0010", "WMS_SHIP_INST_SEND");

	/** ＩＦ取引種別ＣＤ：出荷実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_SHIP_ACT_RECV = create("E0020", "WMS_SHIP_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：入荷予定送信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_ARR_SCHD_SEND = create("E0030", "WMS_ARR_SCHD_SEND");

	/** ＩＦ取引種別ＣＤ：入荷実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_ARR_ACT_RECV = create("E0040", "WMS_ARR_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：移動指図送信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_XFR_INST_SEND = create("E0050", "WMS_XFR_INST_SEND");

	/** ＩＦ取引種別ＣＤ：移動実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_XFR_ACT_RECV = create("E0060", "WMS_XFR_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：他勘定振替実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD WMS_ACXFR_ACT_RECV = create("E0070", "WMS_ACXFR_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：出来高予定送信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_YIELD_SCHD_SEND = create("F1010", "MES_YIELD_SCHD_SEND");

	/** ＩＦ取引種別ＣＤ：出来高実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_YIELD_ACT_RECV = create("F1020", "MES_YIELD_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：工程指図送信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_OPER_INST_SEND = create("F1030", "MES_OPER_INST_SEND");

	/** ＩＦ取引種別ＣＤ：工程実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_OPER_ACT_RECV = create("F1040", "MES_OPER_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：投入予定送信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_INPT_SCHD_SEND = create("F1050", "MES_INPT_SCHD_SEND");

	/** ＩＦ取引種別ＣＤ：投入実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_INPT_ACT_RECV = create("F1060", "MES_INPT_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：工数実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_WK_ACT_RECV = create("F1070", "MES_WK_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：工数予定送信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_WK_SCHD_SEND = create("F1080", "MES_WK_SCHD_SEND");

	/** ＩＦ取引種別ＣＤ：オーダ受信
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_RECV = create("F2010", "ORDER_RECV");

	/** ＩＦ取引種別ＣＤ：オーダ送信
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND = create("F2020", "ORDER_SEND");

	/** ＩＦ取引種別ＣＤ：オーダ送信用品目マスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_ITM = create("F2030", "ORDER_SEND_ITM");

	/** ＩＦ取引種別ＣＤ：オーダ送信用品目工程マスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_ITM_OPER = create("F2040", "ORDER_SEND_ITM_OPER");

	/** ＩＦ取引種別ＣＤ：オーダ送信用品目詳細マスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SENDITM_DTL = create("F2050", "ORDER_SENDITM_DTL");

	/** ＩＦ取引種別ＣＤ：オーダ送信用BOMマスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_BOM = create("F2060", "ORDER_SEND_BOM");

	/** ＩＦ取引種別ＣＤ：オーダ送信用場所マスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_LOC = create("F2070", "ORDER_SEND_LOC");

	/** ＩＦ取引種別ＣＤ：オーダ送信用カレンダマスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_CAL = create("F2080", "ORDER_SEND_CAL");

	/** ＩＦ取引種別ＣＤ：オーダ送信用臨時カレンダマスタ
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_CAL_EXT = create("F2090", "ORDER_SEND_CAL_EXT");

	/** ＩＦ取引種別ＣＤ：オーダ送信用在庫情報
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_STK = create("F2100", "ORDER_SEND_STK");

	/** ＩＦ取引種別ＣＤ：オーダ送信用入庫予定情報
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_GR_SCHD = create("F2110", "ORDER_SEND_GR_SCHD");

	/** ＩＦ取引種別ＣＤ：オーダ送信用出庫予定情報
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_GI_SCHD = create("F2120", "ORDER_SEND_GI_SCHD");

	/** ＩＦ取引種別ＣＤ：オーダ送信用日次需要情報
	 */
	public static final MAC_IF_TRD_TYP_CD ORDER_SEND_DLY_DMND = create("F2130", "ORDER_SEND_DLY_DMND");

	/** ＩＦ取引種別ＣＤ：オーダ送信用品目詳細ＢＯＭマスタ
	 */
	public static final MAC_IF_TRD_TYP_CD MES_ORDER_SEND_ITM_DTL_BOM = create("F2140", "MES_ORDER_SEND_ITM_DTL_BOM");

	/** ＩＦ取引種別ＣＤ：オーダ送信用オーダ引当情報
	 */
	public static final MAC_IF_TRD_TYP_CD MES_ORDER_SEND_ORD_LNK = create("F2150", "MES_ORDER_SEND_ORD_LNK");

	/** ＩＦ取引種別ＣＤ：オーダ送信用工程指図実績情報
	 */
	public static final MAC_IF_TRD_TYP_CD MES_ORDER_SEND_OPER = create("F2160", "MES_ORDER_SEND_OPER");

	/** ＩＦ取引種別ＣＤ：オーダ送信用実績数量情報
	 */
	public static final MAC_IF_TRD_TYP_CD MES_ORDER_SEND_ACT_QTY = create("F2170", "MES_ORDER_SEND_ACT_QTY");

	/** ＩＦ取引種別ＣＤ：検査指図送信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_INSP_INST_SEND = create("F3010", "MES_INSP_INST_SEND");

	/** ＩＦ取引種別ＣＤ：検査実績受信
	 */
	public static final MAC_IF_TRD_TYP_CD MES_INSP_ACT_RECV = create("F3020", "MES_INSP_ACT_RECV");

	/** ＩＦ取引種別ＣＤ：入金
	 */
	public static final MAC_IF_TRD_TYP_CD RCV = create("H0010", "RCV");

	/** ＩＦ取引種別ＣＤ：発注受信
	 */
	public static final MAC_IF_TRD_TYP_CD PO_RECV = create("H0110", "PO_RECV");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_TRD_TYP_CD create() {
		return new MAC_IF_TRD_TYP_CD();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_IF_TRD_TYP_CD get(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		if (type == null) {
			throw MAC_IF_TRD_TYP_CD.invalidValue(value);
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
	public static MAC_IF_TRD_TYP_CD getNE(String value) {
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_TRD_TYP_CD create(String value, String xmlKey) {
		MAC_IF_TRD_TYP_CD me = MAC_IF_TRD_TYP_CD.create();
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
		MAC_IF_TRD_TYP_CD me = MAC_IF_TRD_TYP_CD.getNE(value);
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
		MAC_IF_TRD_TYP_CD me = MAC_IF_TRD_TYP_CD.getNE(value);
		if (me == null) {
			throw MAC_IF_TRD_TYP_CD.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_IF_TRD_TYP_CD me = MAC_IF_TRD_TYP_CD.getNE(value);
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
	public static MAC_IF_TRD_TYP_CD[] array() {
		if (array == null) {
			array = new MAC_IF_TRD_TYP_CD[] {
					MAC_IF_TRD_TYP_CD.PO, MAC_IF_TRD_TYP_CD.PRMS, MAC_IF_TRD_TYP_CD.SHIP_ACT, MAC_IF_TRD_TYP_CD.ACCPT, MAC_IF_TRD_TYP_CD.DLV_INST, 
					 MAC_IF_TRD_TYP_CD.BILL, MAC_IF_TRD_TYP_CD.WMS_SHIP_INST_SEND, MAC_IF_TRD_TYP_CD.WMS_SHIP_ACT_RECV, MAC_IF_TRD_TYP_CD.WMS_ARR_SCHD_SEND, MAC_IF_TRD_TYP_CD.WMS_ARR_ACT_RECV, MAC_IF_TRD_TYP_CD.WMS_XFR_INST_SEND, 
					 MAC_IF_TRD_TYP_CD.WMS_XFR_ACT_RECV, MAC_IF_TRD_TYP_CD.WMS_ACXFR_ACT_RECV, MAC_IF_TRD_TYP_CD.MES_YIELD_SCHD_SEND, MAC_IF_TRD_TYP_CD.MES_YIELD_ACT_RECV, MAC_IF_TRD_TYP_CD.MES_OPER_INST_SEND, MAC_IF_TRD_TYP_CD.MES_OPER_ACT_RECV, 
					 MAC_IF_TRD_TYP_CD.MES_INPT_SCHD_SEND, MAC_IF_TRD_TYP_CD.MES_INPT_ACT_RECV, MAC_IF_TRD_TYP_CD.MES_WK_ACT_RECV, MAC_IF_TRD_TYP_CD.MES_WK_SCHD_SEND, MAC_IF_TRD_TYP_CD.ORDER_RECV, MAC_IF_TRD_TYP_CD.ORDER_SEND, 
					 MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM, MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM_OPER, MAC_IF_TRD_TYP_CD.ORDER_SENDITM_DTL, MAC_IF_TRD_TYP_CD.ORDER_SEND_BOM, MAC_IF_TRD_TYP_CD.ORDER_SEND_LOC, MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL, 
					 MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL_EXT, MAC_IF_TRD_TYP_CD.ORDER_SEND_STK, MAC_IF_TRD_TYP_CD.ORDER_SEND_GR_SCHD, MAC_IF_TRD_TYP_CD.ORDER_SEND_GI_SCHD, MAC_IF_TRD_TYP_CD.ORDER_SEND_DLY_DMND, MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ITM_DTL_BOM, 
					 MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ORD_LNK, MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_OPER, MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ACT_QTY, MAC_IF_TRD_TYP_CD.MES_INSP_INST_SEND, MAC_IF_TRD_TYP_CD.MES_INSP_ACT_RECV, MAC_IF_TRD_TYP_CD.RCV, 
					 MAC_IF_TRD_TYP_CD.PO_RECV
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
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
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
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
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
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
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
			if(MAC_IF_TRD_TYP_CD.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_IF_TRD_TYP_CD me = MAC_IF_TRD_TYP_CD.get(MAC_IF_TRD_TYP_CD.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_IF_TRD_TYP_CD#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_IF_TRD_TYP_CD.subList(row);
			if (list.isEmpty()) {
				list = MAC_IF_TRD_TYP_CD.list();
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
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
			if(MAC_IF_TRD_TYP_CD.isSameVals(me, cols, vals)){
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
			list = MAC_IF_TRD_TYP_CD.subList(cols, vals);
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
		for (MAC_IF_TRD_TYP_CD me : MAC_IF_TRD_TYP_CD.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_IF_TRD_TYP_CD.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_IF_TRD_TYP_CD me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_IF_TRD_TYP_CD", col);}
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
	protected boolean isSame(MAC_IF_TRD_TYP_CD type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * ＩＦ取引種別ＣＤ：注文かどうか
	 * @param value 定数値
	 * @return 定数値が注文の値の場合true
	 */
	public static boolean isPO(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.PO.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：注文かどうか
	 * @param type 属性値
	 * @return 属性値が注文の値の場合true
	 */
	public static boolean isPO(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.PO.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：納期回答かどうか
	 * @param value 定数値
	 * @return 定数値が納期回答の値の場合true
	 */
	public static boolean isPRMS(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.PRMS.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：納期回答かどうか
	 * @param type 属性値
	 * @return 属性値が納期回答の値の場合true
	 */
	public static boolean isPRMS(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.PRMS.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷実績かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績の値の場合true
	 */
	public static boolean isSHIP_ACT(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.SHIP_ACT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷実績かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績の値の場合true
	 */
	public static boolean isSHIP_ACT(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.SHIP_ACT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検収かどうか
	 * @param value 定数値
	 * @return 定数値が検収の値の場合true
	 */
	public static boolean isACCPT(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ACCPT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検収かどうか
	 * @param type 属性値
	 * @return 属性値が検収の値の場合true
	 */
	public static boolean isACCPT(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ACCPT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：納入指示かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.DLV_INST.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：納入指示かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.DLV_INST.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：請求かどうか
	 * @param value 定数値
	 * @return 定数値が請求の値の場合true
	 */
	public static boolean isBILL(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.BILL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：請求かどうか
	 * @param type 属性値
	 * @return 属性値が請求の値の場合true
	 */
	public static boolean isBILL(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.BILL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図送信の値の場合true
	 */
	public static boolean isWMS_SHIP_INST_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_SHIP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図送信の値の場合true
	 */
	public static boolean isWMS_SHIP_INST_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_SHIP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績受信の値の場合true
	 */
	public static boolean isWMS_SHIP_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出荷実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績受信の値の場合true
	 */
	public static boolean isWMS_SHIP_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入荷予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定送信の値の場合true
	 */
	public static boolean isWMS_ARR_SCHD_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_ARR_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入荷予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定送信の値の場合true
	 */
	public static boolean isWMS_ARR_SCHD_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_ARR_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入荷実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績受信の値の場合true
	 */
	public static boolean isWMS_ARR_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_ARR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入荷実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績受信の値の場合true
	 */
	public static boolean isWMS_ARR_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_ARR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：移動指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図送信の値の場合true
	 */
	public static boolean isWMS_XFR_INST_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_XFR_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：移動指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図送信の値の場合true
	 */
	public static boolean isWMS_XFR_INST_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_XFR_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：移動実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が移動実績受信の値の場合true
	 */
	public static boolean isWMS_XFR_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_XFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：移動実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が移動実績受信の値の場合true
	 */
	public static boolean isWMS_XFR_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_XFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：他勘定振替実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績受信の値の場合true
	 */
	public static boolean isWMS_ACXFR_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.WMS_ACXFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：他勘定振替実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績受信の値の場合true
	 */
	public static boolean isWMS_ACXFR_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.WMS_ACXFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出来高予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が出来高予定送信の値の場合true
	 */
	public static boolean isMES_YIELD_SCHD_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_YIELD_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出来高予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が出来高予定送信の値の場合true
	 */
	public static boolean isMES_YIELD_SCHD_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_YIELD_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出来高実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が出来高実績受信の値の場合true
	 */
	public static boolean isMES_YIELD_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_YIELD_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：出来高実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が出来高実績受信の値の場合true
	 */
	public static boolean isMES_YIELD_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_YIELD_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工程指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程指図送信の値の場合true
	 */
	public static boolean isMES_OPER_INST_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_OPER_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工程指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程指図送信の値の場合true
	 */
	public static boolean isMES_OPER_INST_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_OPER_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工程実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が工程実績受信の値の場合true
	 */
	public static boolean isMES_OPER_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_OPER_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工程実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が工程実績受信の値の場合true
	 */
	public static boolean isMES_OPER_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_OPER_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：投入予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が投入予定送信の値の場合true
	 */
	public static boolean isMES_INPT_SCHD_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_INPT_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：投入予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が投入予定送信の値の場合true
	 */
	public static boolean isMES_INPT_SCHD_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_INPT_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：投入実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が投入実績受信の値の場合true
	 */
	public static boolean isMES_INPT_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_INPT_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：投入実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が投入実績受信の値の場合true
	 */
	public static boolean isMES_INPT_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_INPT_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工数実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が工数実績受信の値の場合true
	 */
	public static boolean isMES_WK_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_WK_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工数実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が工数実績受信の値の場合true
	 */
	public static boolean isMES_WK_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_WK_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工数予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が工数予定送信の値の場合true
	 */
	public static boolean isMES_WK_SCHD_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_WK_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：工数予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が工数予定送信の値の場合true
	 */
	public static boolean isMES_WK_SCHD_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_WK_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ受信かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ受信の値の場合true
	 */
	public static boolean isORDER_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ受信かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ受信の値の場合true
	 */
	public static boolean isORDER_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信の値の場合true
	 */
	public static boolean isORDER_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信の値の場合true
	 */
	public static boolean isORDER_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目マスタの値の場合true
	 */
	public static boolean isORDER_SEND_ITM(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目マスタの値の場合true
	 */
	public static boolean isORDER_SEND_ITM(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目工程マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目工程マスタの値の場合true
	 */
	public static boolean isORDER_SEND_ITM_OPER(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM_OPER.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目工程マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目工程マスタの値の場合true
	 */
	public static boolean isORDER_SEND_ITM_OPER(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_ITM_OPER.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目詳細マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細マスタの値の場合true
	 */
	public static boolean isORDER_SENDITM_DTL(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SENDITM_DTL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目詳細マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細マスタの値の場合true
	 */
	public static boolean isORDER_SENDITM_DTL(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SENDITM_DTL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用BOMマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用BOMマスタの値の場合true
	 */
	public static boolean isORDER_SEND_BOM(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_BOM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用BOMマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用BOMマスタの値の場合true
	 */
	public static boolean isORDER_SEND_BOM(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_BOM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用場所マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用場所マスタの値の場合true
	 */
	public static boolean isORDER_SEND_LOC(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_LOC.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用場所マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用場所マスタの値の場合true
	 */
	public static boolean isORDER_SEND_LOC(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_LOC.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用カレンダマスタの値の場合true
	 */
	public static boolean isORDER_SEND_CAL(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用カレンダマスタの値の場合true
	 */
	public static boolean isORDER_SEND_CAL(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用臨時カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用臨時カレンダマスタの値の場合true
	 */
	public static boolean isORDER_SEND_CAL_EXT(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL_EXT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用臨時カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用臨時カレンダマスタの値の場合true
	 */
	public static boolean isORDER_SEND_CAL_EXT(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_CAL_EXT.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用在庫情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用在庫情報の値の場合true
	 */
	public static boolean isORDER_SEND_STK(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_STK.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用在庫情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用在庫情報の値の場合true
	 */
	public static boolean isORDER_SEND_STK(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_STK.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用入庫予定情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用入庫予定情報の値の場合true
	 */
	public static boolean isORDER_SEND_GR_SCHD(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_GR_SCHD.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用入庫予定情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用入庫予定情報の値の場合true
	 */
	public static boolean isORDER_SEND_GR_SCHD(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_GR_SCHD.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用出庫予定情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用出庫予定情報の値の場合true
	 */
	public static boolean isORDER_SEND_GI_SCHD(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_GI_SCHD.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用出庫予定情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用出庫予定情報の値の場合true
	 */
	public static boolean isORDER_SEND_GI_SCHD(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_GI_SCHD.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用日次需要情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用日次需要情報の値の場合true
	 */
	public static boolean isORDER_SEND_DLY_DMND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_DLY_DMND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用日次需要情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用日次需要情報の値の場合true
	 */
	public static boolean isORDER_SEND_DLY_DMND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.ORDER_SEND_DLY_DMND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目詳細ＢＯＭマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細ＢＯＭマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL_BOM(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ITM_DTL_BOM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用品目詳細ＢＯＭマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細ＢＯＭマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL_BOM(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ITM_DTL_BOM.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用オーダ引当情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用オーダ引当情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ORD_LNK(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ORD_LNK.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用オーダ引当情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用オーダ引当情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ORD_LNK(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ORD_LNK.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用工程指図実績情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用工程指図実績情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_OPER(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_OPER.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用工程指図実績情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用工程指図実績情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_OPER(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_OPER.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用実績数量情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用実績数量情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ACT_QTY(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ACT_QTY.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：オーダ送信用実績数量情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用実績数量情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ACT_QTY(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_ORDER_SEND_ACT_QTY.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検査指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図送信の値の場合true
	 */
	public static boolean isMES_INSP_INST_SEND(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_INSP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検査指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図送信の値の場合true
	 */
	public static boolean isMES_INSP_INST_SEND(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_INSP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検査実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が検査実績受信の値の場合true
	 */
	public static boolean isMES_INSP_ACT_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.MES_INSP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：検査実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が検査実績受信の値の場合true
	 */
	public static boolean isMES_INSP_ACT_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.MES_INSP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入金かどうか
	 * @param value 定数値
	 * @return 定数値が入金の値の場合true
	 */
	public static boolean isRCV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.RCV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：入金かどうか
	 * @param type 属性値
	 * @return 属性値が入金の値の場合true
	 */
	public static boolean isRCV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.RCV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：発注受信かどうか
	 * @param value 定数値
	 * @return 定数値が発注受信の値の場合true
	 */
	public static boolean isPO_RECV(String value) {
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
		return MAC_IF_TRD_TYP_CD.PO_RECV.isSame(type);
	}

	/**
	 * ＩＦ取引種別ＣＤ：発注受信かどうか
	 * @param type 属性値
	 * @return 属性値が発注受信の値の場合true
	 */
	public static boolean isPO_RECV(MAC_IF_TRD_TYP_CD type) {
		return MAC_IF_TRD_TYP_CD.PO_RECV.isSame(type);
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
			MAC_IF_TRD_TYP_CD.putName(r, valueColumn, nameColumn);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.get(value);
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
			MAC_IF_TRD_TYP_CD.putNameNE(r, valueColumn, nameColumn);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
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
			MAC_IF_TRD_TYP_CD.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.get(value);
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
			MAC_IF_TRD_TYP_CD.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
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
			MAC_IF_TRD_TYP_CD.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.get(value);
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
			MAC_IF_TRD_TYP_CD.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
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
			MAC_IF_TRD_TYP_CD.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.get(value);
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
			MAC_IF_TRD_TYP_CD.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_TRD_TYP_CD type = MAC_IF_TRD_TYP_CD.getNE(value);
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
