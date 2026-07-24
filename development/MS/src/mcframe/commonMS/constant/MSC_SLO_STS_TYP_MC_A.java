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
abstract class MSC_SLO_STS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "SLO_STS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_SLO_STS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "slo_sts_typ";

	public static final String $NAME = "slo_sts_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 受注状況区分：受注
	 */
	public static final MSC_SLO_STS_TYP SLO = create("001", "SLO");

	/** 受注状況区分：受注訂正
	 */
	public static final MSC_SLO_STS_TYP SLO_UPD = create("002", "SLO_UPD");

	/** 受注状況区分：受注取消
	 */
	public static final MSC_SLO_STS_TYP SLO_CAN = create("003", "SLO_CAN");

	/** 受注状況区分：受注打切
	 */
	public static final MSC_SLO_STS_TYP SLO_ABORT = create("004", "SLO_ABORT");

	/** 受注状況区分：受注打切取消
	 */
	public static final MSC_SLO_STS_TYP SLO_ABORT_CAN = create("005", "SLO_ABORT_CAN");

	/** 受注状況区分：受注承認
	 */
	public static final MSC_SLO_STS_TYP SLO_APRV = create("006", "SLO_APRV");

	/** 受注状況区分：受注承認取消
	 */
	public static final MSC_SLO_STS_TYP SLO_APRV_CAN = create("007", "SLO_APRV_CAN");

	/** 受注状況区分：引当先変更
	 */
	public static final MSC_SLO_STS_TYP ALLOC_UPD = create("008", "ALLOC_UPD");

	/** 受注状況区分：引当解除
	 */
	public static final MSC_SLO_STS_TYP ALLOC_REL = create("009", "ALLOC_REL");

	/** 受注状況区分：引当
	 */
	public static final MSC_SLO_STS_TYP ALLOC = create("010", "ALLOC");

	/** 受注状況区分：出荷予定変更
	 */
	public static final MSC_SLO_STS_TYP SHIP_SCHD_UPD = create("011", "SHIP_SCHD_UPD");

	/** 受注状況区分：納期回答
	 */
	public static final MSC_SLO_STS_TYP SLO_PRMS = create("012", "SLO_PRMS");

	/** 受注状況区分：納入指示受領
	 */
	public static final MSC_SLO_STS_TYP DLV_INST_RCPT = create("013", "DLV_INST_RCPT");

	/** 受注状況区分：納入指示受領訂正
	 */
	public static final MSC_SLO_STS_TYP DLV_INST_RCPT_UPD = create("014", "DLV_INST_RCPT_UPD");

	/** 受注状況区分：納入指示受領取消
	 */
	public static final MSC_SLO_STS_TYP DLV_INST_RCPT_CAN = create("015", "DLV_INST_RCPT_CAN");

	/** 受注状況区分：出荷予定打切
	 */
	public static final MSC_SLO_STS_TYP SHIP_SCHD_ABORT = create("016", "SHIP_SCHD_ABORT");

	/** 受注状況区分：出荷予定打切取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_SCHD_ABORT_CAN = create("017", "SHIP_SCHD_ABORT_CAN");

	/** 受注状況区分：供給依頼
	 */
	public static final MSC_SLO_STS_TYP DMND_RQST = create("018", "DMND_RQST");

	/** 受注状況区分：供給依頼再調整
	 */
	public static final MSC_SLO_STS_TYP DMND_RE_RQST = create("019", "DMND_RE_RQST");

	/** 受注状況区分：供給依頼再調整取消
	 */
	public static final MSC_SLO_STS_TYP DMND_RE_RQST_CAN = create("020", "DMND_RE_RQST_CAN");

	/** 受注状況区分：供給依頼訂正
	 */
	public static final MSC_SLO_STS_TYP DMND_RQST_UPD = create("021", "DMND_RQST_UPD");

	/** 受注状況区分：供給依頼取消
	 */
	public static final MSC_SLO_STS_TYP DMND_RQST_CAN = create("022", "DMND_RQST_CAN");

	/** 受注状況区分：供給依頼回答
	 */
	public static final MSC_SLO_STS_TYP DMND_RQST_PRMS = create("023", "DMND_RQST_PRMS");

	/** 受注状況区分：供給依頼回答取消
	 */
	public static final MSC_SLO_STS_TYP DMND_RQST_PRMS_CAN = create("024", "DMND_RQST_PRMS_CAN");

	/** 受注状況区分：出荷依頼
	 */
	public static final MSC_SLO_STS_TYP SHIP_RQST = create("025", "SHIP_RQST");

	/** 受注状況区分：出荷依頼再調整
	 */
	public static final MSC_SLO_STS_TYP SHIP_RE_RQST = create("026", "SHIP_RE_RQST");

	/** 受注状況区分：出荷依頼再調整取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_RE_RQST_CAN = create("027", "SHIP_RE_RQST_CAN");

	/** 受注状況区分：出荷依頼訂正
	 */
	public static final MSC_SLO_STS_TYP SHIP_RQST_UPD = create("028", "SHIP_RQST_UPD");

	/** 受注状況区分：出荷依頼取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_RQST_CAN = create("029", "SHIP_RQST_CAN");

	/** 受注状況区分：出荷依頼回答
	 */
	public static final MSC_SLO_STS_TYP SHIP_RQST_PRMS = create("030", "SHIP_RQST_PRMS");

	/** 受注状況区分：出荷依頼回答取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_RQST_PRMS_CAN = create("031", "SHIP_RQST_PRMS_CAN");

	/** 受注状況区分：工場出荷指図
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP_INST = create("032", "PLNT_SHIP_INST");

	/** 受注状況区分：工場出荷指図訂正
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP_INST_UPD = create("033", "PLNT_SHIP_INST_UPD");

	/** 受注状況区分：工場出荷指図取消
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP_INST_CAN = create("034", "PLNT_SHIP_INST_CAN");

	/** 受注状況区分：工場出荷指図打切
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP_INST_ABORT = create("035", "PLNT_SHIP_INST_ABORT");

	/** 受注状況区分：工場出荷指図打切取消
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP_INST_ABORT_CAN = create("036", "PLNT_SHIP_INST_ABORT_CAN");

	/** 受注状況区分：工場出荷
	 */
	public static final MSC_SLO_STS_TYP PLNT_SHIP = create("037", "PLNT_SHIP");

	/** 受注状況区分：発注
	 */
	public static final MSC_SLO_STS_TYP PO = create("038", "PO");

	/** 受注状況区分：発注訂正
	 */
	public static final MSC_SLO_STS_TYP PO_UPD = create("039", "PO_UPD");

	/** 受注状況区分：発注取消
	 */
	public static final MSC_SLO_STS_TYP PO_CAN = create("040", "PO_CAN");

	/** 受注状況区分：発注打切
	 */
	public static final MSC_SLO_STS_TYP PO_ABORT = create("041", "PO_ABORT");

	/** 受注状況区分：発注打切取消
	 */
	public static final MSC_SLO_STS_TYP PO_ABORT_CAN = create("042", "PO_ABORT_CAN");

	/** 受注状況区分：納入指示
	 */
	public static final MSC_SLO_STS_TYP DLV_INST = create("043", "DLV_INST");

	/** 受注状況区分：納入指示訂正
	 */
	public static final MSC_SLO_STS_TYP DLV_INST_UPD = create("044", "DLV_INST_UPD");

	/** 受注状況区分：納入指示取消
	 */
	public static final MSC_SLO_STS_TYP DLV_INST_CAN = create("045", "DLV_INST_CAN");

	/** 受注状況区分：購買納期回答受領
	 */
	public static final MSC_SLO_STS_TYP PO_PRMS_RCPT = create("046", "PO_PRMS_RCPT");

	/** 受注状況区分：購買納期回答受領取消
	 */
	public static final MSC_SLO_STS_TYP PO_PRMS_RCPT_CAN = create("047", "PO_PRMS_RCPT_CAN");

	/** 受注状況区分：入荷予定打切
	 */
	public static final MSC_SLO_STS_TYP ARR_SCHD_ABORT = create("048", "ARR_SCHD_ABORT");

	/** 受注状況区分：入荷予定打切取消
	 */
	public static final MSC_SLO_STS_TYP ARR_SCHD_ABORT_CAN = create("049", "ARR_SCHD_ABORT_CAN");

	/** 受注状況区分：入荷
	 */
	public static final MSC_SLO_STS_TYP ARR = create("050", "ARR");

	/** 受注状況区分：仕入
	 */
	public static final MSC_SLO_STS_TYP PURC = create("051", "PURC");

	/** 受注状況区分：出荷指図
	 */
	public static final MSC_SLO_STS_TYP SHIP_INST = create("052", "SHIP_INST");

	/** 受注状況区分：出荷指図訂正
	 */
	public static final MSC_SLO_STS_TYP SHIP_INST_UPD = create("053", "SHIP_INST_UPD");

	/** 受注状況区分：出荷指図取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_INST_CAN = create("054", "SHIP_INST_CAN");

	/** 受注状況区分：出荷指図打切
	 */
	public static final MSC_SLO_STS_TYP SHIP_INST_ABORT = create("055", "SHIP_INST_ABORT");

	/** 受注状況区分：出荷指図打切取消
	 */
	public static final MSC_SLO_STS_TYP SHIP_INST_ABORT_CAN = create("056", "SHIP_INST_ABORT_CAN");

	/** 受注状況区分：出荷
	 */
	public static final MSC_SLO_STS_TYP SHIP = create("057", "SHIP");

	/** 受注状況区分：Ｉ／Ｖ登録
	 */
	public static final MSC_SLO_STS_TYP IV = create("058", "IV");

	/** 受注状況区分：Ｉ／Ｖ訂正
	 */
	public static final MSC_SLO_STS_TYP IV_UPD = create("059", "IV_UPD");

	/** 受注状況区分：Ｉ／Ｖ取消
	 */
	public static final MSC_SLO_STS_TYP IV_CAN = create("060", "IV_CAN");

	/** 受注状況区分：Ｉ／Ｖ受領
	 */
	public static final MSC_SLO_STS_TYP IV_RCPT = create("061", "IV_RCPT");

	/** 受注状況区分：Ｉ／Ｖ受領訂正
	 */
	public static final MSC_SLO_STS_TYP IV_RCPT_UPD = create("062", "IV_RCPT_UPD");

	/** 受注状況区分：Ｉ／Ｖ受領取消
	 */
	public static final MSC_SLO_STS_TYP IV_RCPT_CAN = create("063", "IV_RCPT_CAN");

	/** 受注状況区分：輸出
	 */
	public static final MSC_SLO_STS_TYP EX = create("064", "EX");

	/** 受注状況区分：出荷返品
	 */
	public static final MSC_SLO_STS_TYP SHIP_RET = create("065", "SHIP_RET");

	/** 受注状況区分：売上
	 */
	public static final MSC_SLO_STS_TYP SLS = create("066", "SLS");

	/** 受注状況区分：売上調整
	 */
	public static final MSC_SLO_STS_TYP SLS_ADJST = create("067", "SLS_ADJST");

	/** 受注状況区分：請求締
	 */
	public static final MSC_SLO_STS_TYP BILL_CL = create("068", "BILL_CL");

	/** 受注状況区分：請求締解除
	 */
	public static final MSC_SLO_STS_TYP BILL_CL_CAN = create("069", "BILL_CL_CAN");

	/** 受注状況区分：売掛明細消込
	 */
	public static final MSC_SLO_STS_TYP AR_DTL_APPL = create("070", "AR_DTL_APPL");

	/** 受注状況区分：製造確定
	 */
	public static final MSC_SLO_STS_TYP MFG_FIX = create("071", "MFG_FIX");

	/** 受注状況区分：製造確定取消
	 */
	public static final MSC_SLO_STS_TYP MFG_FIX_CAN = create("072", "MFG_FIX_CAN");

	/** 受注状況区分：製造指図
	 */
	public static final MSC_SLO_STS_TYP MFG_INST = create("073", "MFG_INST");

	/** 受注状況区分：製造指図訂正
	 */
	public static final MSC_SLO_STS_TYP MFG_INST_UPD = create("074", "MFG_INST_UPD");

	/** 受注状況区分：製造指図取消
	 */
	public static final MSC_SLO_STS_TYP MFG_INST_CAN = create("075", "MFG_INST_CAN");

	/** 受注状況区分：製造着手
	 */
	public static final MSC_SLO_STS_TYP MFG_ST = create("076", "MFG_ST");

	/** 受注状況区分：製造完了
	 */
	public static final MSC_SLO_STS_TYP MFG_CMPL = create("077", "MFG_CMPL");

	/** 受注状況区分：製造打切
	 */
	public static final MSC_SLO_STS_TYP MFG_ABORT = create("078", "MFG_ABORT");

	/** 受注状況区分：製造打切取消
	 */
	public static final MSC_SLO_STS_TYP MFG_ABORT_CAN = create("079", "MFG_ABORT_CAN");

	/** 受注状況区分：検査指図
	 */
	public static final MSC_SLO_STS_TYP INSP_INST = create("080", "INSP_INST");

	/** 受注状況区分：検査指図訂正
	 */
	public static final MSC_SLO_STS_TYP INSP_INST_UPD = create("081", "INSP_INST_UPD");

	/** 受注状況区分：検査指図取消
	 */
	public static final MSC_SLO_STS_TYP INSP_INST_CAN = create("082", "INSP_INST_CAN");

	/** 受注状況区分：検査着手
	 */
	public static final MSC_SLO_STS_TYP INSP_ST = create("083", "INSP_ST");

	/** 受注状況区分：検査完了
	 */
	public static final MSC_SLO_STS_TYP INSP_CMPL = create("084", "INSP_CMPL");

	/** 受注状況区分：移動指図
	 */
	public static final MSC_SLO_STS_TYP XFR_INST = create("085", "XFR_INST");

	/** 受注状況区分：移動指図訂正
	 */
	public static final MSC_SLO_STS_TYP XFR_INST_UPD = create("086", "XFR_INST_UPD");

	/** 受注状況区分：移動指図取消
	 */
	public static final MSC_SLO_STS_TYP XFR_INST_CAN = create("087", "XFR_INST_CAN");

	/** 受注状況区分：移動指図打切
	 */
	public static final MSC_SLO_STS_TYP XFR_INST_ABORT = create("088", "XFR_INST_ABORT");

	/** 受注状況区分：移動指図打切取消
	 */
	public static final MSC_SLO_STS_TYP XFR_INST_ABORT_CAN = create("089", "XFR_INST_ABORT_CAN");

	/** 受注状況区分：移動
	 */
	public static final MSC_SLO_STS_TYP XFR = create("090", "XFR");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_SLO_STS_TYP create() {
		return new MSC_SLO_STS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_SLO_STS_TYP get(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		if (type == null) {
			throw MSC_SLO_STS_TYP.invalidValue(value);
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
	public static MSC_SLO_STS_TYP getNE(String value) {
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_SLO_STS_TYP create(String value, String xmlKey) {
		MSC_SLO_STS_TYP me = MSC_SLO_STS_TYP.create();
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
		MSC_SLO_STS_TYP me = MSC_SLO_STS_TYP.getNE(value);
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
		MSC_SLO_STS_TYP me = MSC_SLO_STS_TYP.getNE(value);
		if (me == null) {
			throw MSC_SLO_STS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_SLO_STS_TYP me = MSC_SLO_STS_TYP.getNE(value);
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
	public static MSC_SLO_STS_TYP[] array() {
		if (array == null) {
			array = new MSC_SLO_STS_TYP[] {
					MSC_SLO_STS_TYP.SLO, MSC_SLO_STS_TYP.SLO_UPD, MSC_SLO_STS_TYP.SLO_CAN, MSC_SLO_STS_TYP.SLO_ABORT, MSC_SLO_STS_TYP.SLO_ABORT_CAN, 
					 MSC_SLO_STS_TYP.SLO_APRV, MSC_SLO_STS_TYP.SLO_APRV_CAN, MSC_SLO_STS_TYP.ALLOC_UPD, MSC_SLO_STS_TYP.ALLOC_REL, MSC_SLO_STS_TYP.ALLOC, MSC_SLO_STS_TYP.SHIP_SCHD_UPD, 
					 MSC_SLO_STS_TYP.SLO_PRMS, MSC_SLO_STS_TYP.DLV_INST_RCPT, MSC_SLO_STS_TYP.DLV_INST_RCPT_UPD, MSC_SLO_STS_TYP.DLV_INST_RCPT_CAN, MSC_SLO_STS_TYP.SHIP_SCHD_ABORT, MSC_SLO_STS_TYP.SHIP_SCHD_ABORT_CAN, 
					 MSC_SLO_STS_TYP.DMND_RQST, MSC_SLO_STS_TYP.DMND_RE_RQST, MSC_SLO_STS_TYP.DMND_RE_RQST_CAN, MSC_SLO_STS_TYP.DMND_RQST_UPD, MSC_SLO_STS_TYP.DMND_RQST_CAN, MSC_SLO_STS_TYP.DMND_RQST_PRMS, 
					 MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN, MSC_SLO_STS_TYP.SHIP_RQST, MSC_SLO_STS_TYP.SHIP_RE_RQST, MSC_SLO_STS_TYP.SHIP_RE_RQST_CAN, MSC_SLO_STS_TYP.SHIP_RQST_UPD, MSC_SLO_STS_TYP.SHIP_RQST_CAN, 
					 MSC_SLO_STS_TYP.SHIP_RQST_PRMS, MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN, MSC_SLO_STS_TYP.PLNT_SHIP_INST, MSC_SLO_STS_TYP.PLNT_SHIP_INST_UPD, MSC_SLO_STS_TYP.PLNT_SHIP_INST_CAN, MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT, 
					 MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT_CAN, MSC_SLO_STS_TYP.PLNT_SHIP, MSC_SLO_STS_TYP.PO, MSC_SLO_STS_TYP.PO_UPD, MSC_SLO_STS_TYP.PO_CAN, MSC_SLO_STS_TYP.PO_ABORT, 
					 MSC_SLO_STS_TYP.PO_ABORT_CAN, MSC_SLO_STS_TYP.DLV_INST, MSC_SLO_STS_TYP.DLV_INST_UPD, MSC_SLO_STS_TYP.DLV_INST_CAN, MSC_SLO_STS_TYP.PO_PRMS_RCPT, MSC_SLO_STS_TYP.PO_PRMS_RCPT_CAN, 
					 MSC_SLO_STS_TYP.ARR_SCHD_ABORT, MSC_SLO_STS_TYP.ARR_SCHD_ABORT_CAN, MSC_SLO_STS_TYP.ARR, MSC_SLO_STS_TYP.PURC, MSC_SLO_STS_TYP.SHIP_INST, MSC_SLO_STS_TYP.SHIP_INST_UPD, 
					 MSC_SLO_STS_TYP.SHIP_INST_CAN, MSC_SLO_STS_TYP.SHIP_INST_ABORT, MSC_SLO_STS_TYP.SHIP_INST_ABORT_CAN, MSC_SLO_STS_TYP.SHIP, MSC_SLO_STS_TYP.IV, MSC_SLO_STS_TYP.IV_UPD, 
					 MSC_SLO_STS_TYP.IV_CAN, MSC_SLO_STS_TYP.IV_RCPT, MSC_SLO_STS_TYP.IV_RCPT_UPD, MSC_SLO_STS_TYP.IV_RCPT_CAN, MSC_SLO_STS_TYP.EX, MSC_SLO_STS_TYP.SHIP_RET, 
					 MSC_SLO_STS_TYP.SLS, MSC_SLO_STS_TYP.SLS_ADJST, MSC_SLO_STS_TYP.BILL_CL, MSC_SLO_STS_TYP.BILL_CL_CAN, MSC_SLO_STS_TYP.AR_DTL_APPL, MSC_SLO_STS_TYP.MFG_FIX, 
					 MSC_SLO_STS_TYP.MFG_FIX_CAN, MSC_SLO_STS_TYP.MFG_INST, MSC_SLO_STS_TYP.MFG_INST_UPD, MSC_SLO_STS_TYP.MFG_INST_CAN, MSC_SLO_STS_TYP.MFG_ST, MSC_SLO_STS_TYP.MFG_CMPL, 
					 MSC_SLO_STS_TYP.MFG_ABORT, MSC_SLO_STS_TYP.MFG_ABORT_CAN, MSC_SLO_STS_TYP.INSP_INST, MSC_SLO_STS_TYP.INSP_INST_UPD, MSC_SLO_STS_TYP.INSP_INST_CAN, MSC_SLO_STS_TYP.INSP_ST, 
					 MSC_SLO_STS_TYP.INSP_CMPL, MSC_SLO_STS_TYP.XFR_INST, MSC_SLO_STS_TYP.XFR_INST_UPD, MSC_SLO_STS_TYP.XFR_INST_CAN, MSC_SLO_STS_TYP.XFR_INST_ABORT, MSC_SLO_STS_TYP.XFR_INST_ABORT_CAN, 
					 MSC_SLO_STS_TYP.XFR
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
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
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
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
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
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
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
			if(MSC_SLO_STS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_SLO_STS_TYP me = MSC_SLO_STS_TYP.get(MSC_SLO_STS_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_SLO_STS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_SLO_STS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_SLO_STS_TYP.list();
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
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
			if(MSC_SLO_STS_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_SLO_STS_TYP.subList(cols, vals);
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
		for (MSC_SLO_STS_TYP me : MSC_SLO_STS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_SLO_STS_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_SLO_STS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_SLO_STS_TYP", col);}
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
	protected boolean isSame(MSC_SLO_STS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受注状況区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isSLO(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO.isSame(type);
	}

	/**
	 * 受注状況区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isSLO(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO.isSame(type);
	}

	/**
	 * 受注状況区分：受注訂正かどうか
	 * @param value 定数値
	 * @return 定数値が受注訂正の値の場合true
	 */
	public static boolean isSLO_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：受注訂正かどうか
	 * @param type 属性値
	 * @return 属性値が受注訂正の値の場合true
	 */
	public static boolean isSLO_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：受注取消かどうか
	 * @param value 定数値
	 * @return 定数値が受注取消の値の場合true
	 */
	public static boolean isSLO_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：受注取消かどうか
	 * @param type 属性値
	 * @return 属性値が受注取消の値の場合true
	 */
	public static boolean isSLO_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：受注打切かどうか
	 * @param value 定数値
	 * @return 定数値が受注打切の値の場合true
	 */
	public static boolean isSLO_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：受注打切かどうか
	 * @param type 属性値
	 * @return 属性値が受注打切の値の場合true
	 */
	public static boolean isSLO_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：受注打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が受注打切取消の値の場合true
	 */
	public static boolean isSLO_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：受注打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が受注打切取消の値の場合true
	 */
	public static boolean isSLO_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：受注承認かどうか
	 * @param value 定数値
	 * @return 定数値が受注承認の値の場合true
	 */
	public static boolean isSLO_APRV(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_APRV.isSame(type);
	}

	/**
	 * 受注状況区分：受注承認かどうか
	 * @param type 属性値
	 * @return 属性値が受注承認の値の場合true
	 */
	public static boolean isSLO_APRV(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_APRV.isSame(type);
	}

	/**
	 * 受注状況区分：受注承認取消かどうか
	 * @param value 定数値
	 * @return 定数値が受注承認取消の値の場合true
	 */
	public static boolean isSLO_APRV_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_APRV_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：受注承認取消かどうか
	 * @param type 属性値
	 * @return 属性値が受注承認取消の値の場合true
	 */
	public static boolean isSLO_APRV_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_APRV_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：引当先変更かどうか
	 * @param value 定数値
	 * @return 定数値が引当先変更の値の場合true
	 */
	public static boolean isALLOC_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ALLOC_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：引当先変更かどうか
	 * @param type 属性値
	 * @return 属性値が引当先変更の値の場合true
	 */
	public static boolean isALLOC_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ALLOC_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：引当解除かどうか
	 * @param value 定数値
	 * @return 定数値が引当解除の値の場合true
	 */
	public static boolean isALLOC_REL(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ALLOC_REL.isSame(type);
	}

	/**
	 * 受注状況区分：引当解除かどうか
	 * @param type 属性値
	 * @return 属性値が引当解除の値の場合true
	 */
	public static boolean isALLOC_REL(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ALLOC_REL.isSame(type);
	}

	/**
	 * 受注状況区分：引当かどうか
	 * @param value 定数値
	 * @return 定数値が引当の値の場合true
	 */
	public static boolean isALLOC(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ALLOC.isSame(type);
	}

	/**
	 * 受注状況区分：引当かどうか
	 * @param type 属性値
	 * @return 属性値が引当の値の場合true
	 */
	public static boolean isALLOC(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ALLOC.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定変更かどうか
	 * @param value 定数値
	 * @return 定数値が出荷予定変更の値の場合true
	 */
	public static boolean isSHIP_SCHD_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_SCHD_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定変更かどうか
	 * @param type 属性値
	 * @return 属性値が出荷予定変更の値の場合true
	 */
	public static boolean isSHIP_SCHD_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_SCHD_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：納期回答かどうか
	 * @param value 定数値
	 * @return 定数値が納期回答の値の場合true
	 */
	public static boolean isSLO_PRMS(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLO_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：納期回答かどうか
	 * @param type 属性値
	 * @return 属性値が納期回答の値の場合true
	 */
	public static boolean isSLO_PRMS(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLO_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示受領の値の場合true
	 */
	public static boolean isDLV_INST_RCPT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示受領の値の場合true
	 */
	public static boolean isDLV_INST_RCPT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領訂正かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示受領訂正の値の場合true
	 */
	public static boolean isDLV_INST_RCPT_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST_RCPT_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領訂正かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示受領訂正の値の場合true
	 */
	public static boolean isDLV_INST_RCPT_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST_RCPT_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領取消かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示受領取消の値の場合true
	 */
	public static boolean isDLV_INST_RCPT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示受領取消かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示受領取消の値の場合true
	 */
	public static boolean isDLV_INST_RCPT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定打切かどうか
	 * @param value 定数値
	 * @return 定数値が出荷予定打切の値の場合true
	 */
	public static boolean isSHIP_SCHD_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_SCHD_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定打切かどうか
	 * @param type 属性値
	 * @return 属性値が出荷予定打切の値の場合true
	 */
	public static boolean isSHIP_SCHD_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_SCHD_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷予定打切取消の値の場合true
	 */
	public static boolean isSHIP_SCHD_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_SCHD_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷予定打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷予定打切取消の値の場合true
	 */
	public static boolean isSHIP_SCHD_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_SCHD_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼の値の場合true
	 */
	public static boolean isDMND_RQST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼の値の場合true
	 */
	public static boolean isDMND_RQST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼再調整かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼再調整の値の場合true
	 */
	public static boolean isDMND_RE_RQST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RE_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼再調整かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼再調整の値の場合true
	 */
	public static boolean isDMND_RE_RQST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RE_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼再調整取消かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼再調整取消の値の場合true
	 */
	public static boolean isDMND_RE_RQST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RE_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼再調整取消かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼再調整取消の値の場合true
	 */
	public static boolean isDMND_RE_RQST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RE_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼訂正かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼訂正の値の場合true
	 */
	public static boolean isDMND_RQST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RQST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼訂正かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼訂正の値の場合true
	 */
	public static boolean isDMND_RQST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RQST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼取消かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼取消の値の場合true
	 */
	public static boolean isDMND_RQST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼取消かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼取消の値の場合true
	 */
	public static boolean isDMND_RQST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼回答かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼回答の値の場合true
	 */
	public static boolean isDMND_RQST_PRMS(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RQST_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼回答かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼回答の値の場合true
	 */
	public static boolean isDMND_RQST_PRMS(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RQST_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼回答取消かどうか
	 * @param value 定数値
	 * @return 定数値が供給依頼回答取消の値の場合true
	 */
	public static boolean isDMND_RQST_PRMS_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：供給依頼回答取消かどうか
	 * @param type 属性値
	 * @return 属性値が供給依頼回答取消の値の場合true
	 */
	public static boolean isDMND_RQST_PRMS_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DMND_RQST_PRMS_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼の値の場合true
	 */
	public static boolean isSHIP_RQST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼の値の場合true
	 */
	public static boolean isSHIP_RQST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼再調整かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼再調整の値の場合true
	 */
	public static boolean isSHIP_RE_RQST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RE_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼再調整かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼再調整の値の場合true
	 */
	public static boolean isSHIP_RE_RQST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RE_RQST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼再調整取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼再調整取消の値の場合true
	 */
	public static boolean isSHIP_RE_RQST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RE_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼再調整取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼再調整取消の値の場合true
	 */
	public static boolean isSHIP_RE_RQST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RE_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼訂正かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼訂正の値の場合true
	 */
	public static boolean isSHIP_RQST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RQST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼訂正かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼訂正の値の場合true
	 */
	public static boolean isSHIP_RQST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RQST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼取消の値の場合true
	 */
	public static boolean isSHIP_RQST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼取消の値の場合true
	 */
	public static boolean isSHIP_RQST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RQST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼回答かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼回答の値の場合true
	 */
	public static boolean isSHIP_RQST_PRMS(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RQST_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼回答かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼回答の値の場合true
	 */
	public static boolean isSHIP_RQST_PRMS(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RQST_PRMS.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼回答取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷依頼回答取消の値の場合true
	 */
	public static boolean isSHIP_RQST_PRMS_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷依頼回答取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷依頼回答取消の値の場合true
	 */
	public static boolean isSHIP_RQST_PRMS_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RQST_PRMS_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷指図の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷指図の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図訂正かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷指図訂正の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図訂正かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷指図訂正の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図取消かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷指図取消の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図取消かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷指図取消の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図打切かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷指図打切の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図打切かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷指図打切の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷指図打切取消の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷指図打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷指図打切取消の値の場合true
	 */
	public static boolean isPLNT_SHIP_INST_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷の値の場合true
	 */
	public static boolean isPLNT_SHIP(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PLNT_SHIP.isSame(type);
	}

	/**
	 * 受注状況区分：工場出荷かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷の値の場合true
	 */
	public static boolean isPLNT_SHIP(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PLNT_SHIP.isSame(type);
	}

	/**
	 * 受注状況区分：発注かどうか
	 * @param value 定数値
	 * @return 定数値が発注の値の場合true
	 */
	public static boolean isPO(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO.isSame(type);
	}

	/**
	 * 受注状況区分：発注かどうか
	 * @param type 属性値
	 * @return 属性値が発注の値の場合true
	 */
	public static boolean isPO(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO.isSame(type);
	}

	/**
	 * 受注状況区分：発注訂正かどうか
	 * @param value 定数値
	 * @return 定数値が発注訂正の値の場合true
	 */
	public static boolean isPO_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：発注訂正かどうか
	 * @param type 属性値
	 * @return 属性値が発注訂正の値の場合true
	 */
	public static boolean isPO_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：発注取消かどうか
	 * @param value 定数値
	 * @return 定数値が発注取消の値の場合true
	 */
	public static boolean isPO_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：発注取消かどうか
	 * @param type 属性値
	 * @return 属性値が発注取消の値の場合true
	 */
	public static boolean isPO_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：発注打切かどうか
	 * @param value 定数値
	 * @return 定数値が発注打切の値の場合true
	 */
	public static boolean isPO_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：発注打切かどうか
	 * @param type 属性値
	 * @return 属性値が発注打切の値の場合true
	 */
	public static boolean isPO_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：発注打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が発注打切取消の値の場合true
	 */
	public static boolean isPO_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：発注打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が発注打切取消の値の場合true
	 */
	public static boolean isPO_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示訂正かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示訂正の値の場合true
	 */
	public static boolean isDLV_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示訂正かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示訂正の値の場合true
	 */
	public static boolean isDLV_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示取消かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示取消の値の場合true
	 */
	public static boolean isDLV_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.DLV_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：納入指示取消かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示取消の値の場合true
	 */
	public static boolean isDLV_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.DLV_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：購買納期回答受領かどうか
	 * @param value 定数値
	 * @return 定数値が購買納期回答受領の値の場合true
	 */
	public static boolean isPO_PRMS_RCPT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_PRMS_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：購買納期回答受領かどうか
	 * @param type 属性値
	 * @return 属性値が購買納期回答受領の値の場合true
	 */
	public static boolean isPO_PRMS_RCPT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_PRMS_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：購買納期回答受領取消かどうか
	 * @param value 定数値
	 * @return 定数値が購買納期回答受領取消の値の場合true
	 */
	public static boolean isPO_PRMS_RCPT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PO_PRMS_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：購買納期回答受領取消かどうか
	 * @param type 属性値
	 * @return 属性値が購買納期回答受領取消の値の場合true
	 */
	public static boolean isPO_PRMS_RCPT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PO_PRMS_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：入荷予定打切かどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定打切の値の場合true
	 */
	public static boolean isARR_SCHD_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ARR_SCHD_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：入荷予定打切かどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定打切の値の場合true
	 */
	public static boolean isARR_SCHD_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ARR_SCHD_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：入荷予定打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定打切取消の値の場合true
	 */
	public static boolean isARR_SCHD_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ARR_SCHD_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：入荷予定打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定打切取消の値の場合true
	 */
	public static boolean isARR_SCHD_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ARR_SCHD_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：入荷かどうか
	 * @param value 定数値
	 * @return 定数値が入荷の値の場合true
	 */
	public static boolean isARR(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.ARR.isSame(type);
	}

	/**
	 * 受注状況区分：入荷かどうか
	 * @param type 属性値
	 * @return 属性値が入荷の値の場合true
	 */
	public static boolean isARR(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.ARR.isSame(type);
	}

	/**
	 * 受注状況区分：仕入かどうか
	 * @param value 定数値
	 * @return 定数値が仕入の値の場合true
	 */
	public static boolean isPURC(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.PURC.isSame(type);
	}

	/**
	 * 受注状況区分：仕入かどうか
	 * @param type 属性値
	 * @return 属性値が仕入の値の場合true
	 */
	public static boolean isPURC(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.PURC.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図の値の場合true
	 */
	public static boolean isSHIP_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図の値の場合true
	 */
	public static boolean isSHIP_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図訂正かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図訂正の値の場合true
	 */
	public static boolean isSHIP_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図訂正かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図訂正の値の場合true
	 */
	public static boolean isSHIP_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図取消の値の場合true
	 */
	public static boolean isSHIP_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図取消の値の場合true
	 */
	public static boolean isSHIP_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図打切かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図打切の値の場合true
	 */
	public static boolean isSHIP_INST_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図打切かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図打切の値の場合true
	 */
	public static boolean isSHIP_INST_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図打切取消の値の場合true
	 */
	public static boolean isSHIP_INST_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷指図打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図打切取消の値の場合true
	 */
	public static boolean isSHIP_INST_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：出荷かどうか
	 * @param value 定数値
	 * @return 定数値が出荷の値の場合true
	 */
	public static boolean isSHIP(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP.isSame(type);
	}

	/**
	 * 受注状況区分：出荷かどうか
	 * @param type 属性値
	 * @return 属性値が出荷の値の場合true
	 */
	public static boolean isSHIP(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ登録かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ登録の値の場合true
	 */
	public static boolean isIV(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ登録かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ登録の値の場合true
	 */
	public static boolean isIV(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ訂正かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ訂正の値の場合true
	 */
	public static boolean isIV_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ訂正かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ訂正の値の場合true
	 */
	public static boolean isIV_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ取消かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ取消の値の場合true
	 */
	public static boolean isIV_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ取消かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ取消の値の場合true
	 */
	public static boolean isIV_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ受領の値の場合true
	 */
	public static boolean isIV_RCPT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ受領の値の場合true
	 */
	public static boolean isIV_RCPT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV_RCPT.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領訂正かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ受領訂正の値の場合true
	 */
	public static boolean isIV_RCPT_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV_RCPT_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領訂正かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ受領訂正の値の場合true
	 */
	public static boolean isIV_RCPT_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV_RCPT_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領取消かどうか
	 * @param value 定数値
	 * @return 定数値がＩ／Ｖ受領取消の値の場合true
	 */
	public static boolean isIV_RCPT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.IV_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：Ｉ／Ｖ受領取消かどうか
	 * @param type 属性値
	 * @return 属性値がＩ／Ｖ受領取消の値の場合true
	 */
	public static boolean isIV_RCPT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.IV_RCPT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：輸出かどうか
	 * @param value 定数値
	 * @return 定数値が輸出の値の場合true
	 */
	public static boolean isEX(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.EX.isSame(type);
	}

	/**
	 * 受注状況区分：輸出かどうか
	 * @param type 属性値
	 * @return 属性値が輸出の値の場合true
	 */
	public static boolean isEX(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.EX.isSame(type);
	}

	/**
	 * 受注状況区分：出荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RET(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SHIP_RET.isSame(type);
	}

	/**
	 * 受注状況区分：出荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RET(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SHIP_RET.isSame(type);
	}

	/**
	 * 受注状況区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLS.isSame(type);
	}

	/**
	 * 受注状況区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLS.isSame(type);
	}

	/**
	 * 受注状況区分：売上調整かどうか
	 * @param value 定数値
	 * @return 定数値が売上調整の値の場合true
	 */
	public static boolean isSLS_ADJST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.SLS_ADJST.isSame(type);
	}

	/**
	 * 受注状況区分：売上調整かどうか
	 * @param type 属性値
	 * @return 属性値が売上調整の値の場合true
	 */
	public static boolean isSLS_ADJST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.SLS_ADJST.isSame(type);
	}

	/**
	 * 受注状況区分：請求締かどうか
	 * @param value 定数値
	 * @return 定数値が請求締の値の場合true
	 */
	public static boolean isBILL_CL(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.BILL_CL.isSame(type);
	}

	/**
	 * 受注状況区分：請求締かどうか
	 * @param type 属性値
	 * @return 属性値が請求締の値の場合true
	 */
	public static boolean isBILL_CL(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.BILL_CL.isSame(type);
	}

	/**
	 * 受注状況区分：請求締解除かどうか
	 * @param value 定数値
	 * @return 定数値が請求締解除の値の場合true
	 */
	public static boolean isBILL_CL_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.BILL_CL_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：請求締解除かどうか
	 * @param type 属性値
	 * @return 属性値が請求締解除の値の場合true
	 */
	public static boolean isBILL_CL_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.BILL_CL_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：売掛明細消込かどうか
	 * @param value 定数値
	 * @return 定数値が売掛明細消込の値の場合true
	 */
	public static boolean isAR_DTL_APPL(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.AR_DTL_APPL.isSame(type);
	}

	/**
	 * 受注状況区分：売掛明細消込かどうか
	 * @param type 属性値
	 * @return 属性値が売掛明細消込の値の場合true
	 */
	public static boolean isAR_DTL_APPL(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.AR_DTL_APPL.isSame(type);
	}

	/**
	 * 受注状況区分：製造確定かどうか
	 * @param value 定数値
	 * @return 定数値が製造確定の値の場合true
	 */
	public static boolean isMFG_FIX(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_FIX.isSame(type);
	}

	/**
	 * 受注状況区分：製造確定かどうか
	 * @param type 属性値
	 * @return 属性値が製造確定の値の場合true
	 */
	public static boolean isMFG_FIX(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_FIX.isSame(type);
	}

	/**
	 * 受注状況区分：製造確定取消かどうか
	 * @param value 定数値
	 * @return 定数値が製造確定取消の値の場合true
	 */
	public static boolean isMFG_FIX_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_FIX_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：製造確定取消かどうか
	 * @param type 属性値
	 * @return 属性値が製造確定取消の値の場合true
	 */
	public static boolean isMFG_FIX_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_FIX_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図の値の場合true
	 */
	public static boolean isMFG_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_INST.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図の値の場合true
	 */
	public static boolean isMFG_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_INST.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図訂正かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図訂正の値の場合true
	 */
	public static boolean isMFG_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図訂正かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図訂正の値の場合true
	 */
	public static boolean isMFG_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図取消かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図取消の値の場合true
	 */
	public static boolean isMFG_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：製造指図取消かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図取消の値の場合true
	 */
	public static boolean isMFG_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：製造着手かどうか
	 * @param value 定数値
	 * @return 定数値が製造着手の値の場合true
	 */
	public static boolean isMFG_ST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_ST.isSame(type);
	}

	/**
	 * 受注状況区分：製造着手かどうか
	 * @param type 属性値
	 * @return 属性値が製造着手の値の場合true
	 */
	public static boolean isMFG_ST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_ST.isSame(type);
	}

	/**
	 * 受注状況区分：製造完了かどうか
	 * @param value 定数値
	 * @return 定数値が製造完了の値の場合true
	 */
	public static boolean isMFG_CMPL(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_CMPL.isSame(type);
	}

	/**
	 * 受注状況区分：製造完了かどうか
	 * @param type 属性値
	 * @return 属性値が製造完了の値の場合true
	 */
	public static boolean isMFG_CMPL(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_CMPL.isSame(type);
	}

	/**
	 * 受注状況区分：製造打切かどうか
	 * @param value 定数値
	 * @return 定数値が製造打切の値の場合true
	 */
	public static boolean isMFG_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：製造打切かどうか
	 * @param type 属性値
	 * @return 属性値が製造打切の値の場合true
	 */
	public static boolean isMFG_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：製造打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が製造打切取消の値の場合true
	 */
	public static boolean isMFG_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.MFG_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：製造打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が製造打切取消の値の場合true
	 */
	public static boolean isMFG_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.MFG_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図の値の場合true
	 */
	public static boolean isINSP_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.INSP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図の値の場合true
	 */
	public static boolean isINSP_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.INSP_INST.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図訂正かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図訂正の値の場合true
	 */
	public static boolean isINSP_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.INSP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図訂正かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図訂正の値の場合true
	 */
	public static boolean isINSP_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.INSP_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図取消かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図取消の値の場合true
	 */
	public static boolean isINSP_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.INSP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：検査指図取消かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図取消の値の場合true
	 */
	public static boolean isINSP_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.INSP_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：検査着手かどうか
	 * @param value 定数値
	 * @return 定数値が検査着手の値の場合true
	 */
	public static boolean isINSP_ST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.INSP_ST.isSame(type);
	}

	/**
	 * 受注状況区分：検査着手かどうか
	 * @param type 属性値
	 * @return 属性値が検査着手の値の場合true
	 */
	public static boolean isINSP_ST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.INSP_ST.isSame(type);
	}

	/**
	 * 受注状況区分：検査完了かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了の値の場合true
	 */
	public static boolean isINSP_CMPL(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.INSP_CMPL.isSame(type);
	}

	/**
	 * 受注状況区分：検査完了かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了の値の場合true
	 */
	public static boolean isINSP_CMPL(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.INSP_CMPL.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図の値の場合true
	 */
	public static boolean isXFR_INST(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR_INST.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図の値の場合true
	 */
	public static boolean isXFR_INST(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR_INST.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図訂正かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図訂正の値の場合true
	 */
	public static boolean isXFR_INST_UPD(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図訂正かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図訂正の値の場合true
	 */
	public static boolean isXFR_INST_UPD(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR_INST_UPD.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図取消かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図取消の値の場合true
	 */
	public static boolean isXFR_INST_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図取消かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図取消の値の場合true
	 */
	public static boolean isXFR_INST_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR_INST_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図打切かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図打切の値の場合true
	 */
	public static boolean isXFR_INST_ABORT(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図打切かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図打切の値の場合true
	 */
	public static boolean isXFR_INST_ABORT(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR_INST_ABORT.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図打切取消かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図打切取消の値の場合true
	 */
	public static boolean isXFR_INST_ABORT_CAN(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：移動指図打切取消かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図打切取消の値の場合true
	 */
	public static boolean isXFR_INST_ABORT_CAN(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR_INST_ABORT_CAN.isSame(type);
	}

	/**
	 * 受注状況区分：移動かどうか
	 * @param value 定数値
	 * @return 定数値が移動の値の場合true
	 */
	public static boolean isXFR(String value) {
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
		return MSC_SLO_STS_TYP.XFR.isSame(type);
	}

	/**
	 * 受注状況区分：移動かどうか
	 * @param type 属性値
	 * @return 属性値が移動の値の場合true
	 */
	public static boolean isXFR(MSC_SLO_STS_TYP type) {
		return MSC_SLO_STS_TYP.XFR.isSame(type);
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
			MSC_SLO_STS_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.get(value);
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
			MSC_SLO_STS_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
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
			MSC_SLO_STS_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.get(value);
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
			MSC_SLO_STS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
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
			MSC_SLO_STS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.get(value);
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
			MSC_SLO_STS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
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
			MSC_SLO_STS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.get(value);
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
			MSC_SLO_STS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_SLO_STS_TYP type = MSC_SLO_STS_TYP.getNE(value);
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
