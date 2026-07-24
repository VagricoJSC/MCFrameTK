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
abstract class MAC_TRD_PTN_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "TRD_PTN_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_TRD_PTN_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "trd_ptn_typ";

	public static final String $NAME = "trd_ptn_typ_nm";

	public static final String $AR_TRD_GRP_TYP = "ar_trd_grp_typ";

	public static final String $AR_AMT_PM = "ar_amt_pm";

	public static final String $QTY_DISP_PM = "qty_disp_pm";

	public static final String $UPRI_DISP_PM = "upri_disp_pm";

	public static final String $AMT_DISP_PM = "amt_disp_pm";

	public static final String $SLIP_TITLE_TYP = "slip_title_typ";

	public static final String $IS_SLIP_FORM_SET = "is_slip_form_set";

	public static final String $IS_LOT_SLIP_SET = "is_lot_slip_set";

	public static final String $AC_SLIP_TYP = "ac_slip_typ";

	public static final String $IS_AC_RSN_REQ = "is_ac_rsn_req";

	public static final String $AP_AMT_PM = "ap_amt_pm";

	public static final String $IS_BI_TGT = "is_bi_tgt";

	public static final String $IS_GA_TGT_SLS_SLIP = "is_ga_tgt_sls_slip";

	public static final String $IS_GA_TGT_PURC_SLIP = "is_ga_tgt_purc_slip";

	/*
	 * 定数の定義です。
	 */
	/** 取引パタン区分：売上
	 */
	public static final MAC_TRD_PTN_TYP SLS = create("A010", "SLS", MAC_AR_TRD_GRP_TYP.SLS.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：貸出売上
	 */
	public static final MAC_TRD_PTN_TYP SLS_CNSGN = create("A011", "SLS_CNSGN", MAC_AR_TRD_GRP_TYP.SLS.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：売上返品
	 */
	public static final MAC_TRD_PTN_TYP SLS_RTN = create("A020", "SLS_RTN", MAC_AR_TRD_GRP_TYP.SLS_RTN.value(), new MCNumber(-1), new MCNumber(-1), new MCNumber(1), new MCNumber(-1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：売上値引
	 */
	public static final MAC_TRD_PTN_TYP SLS_DSCNT = create("A030", "SLS_DSCNT", MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(-1), new MCNumber(-1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：売上値増
	 */
	public static final MAC_TRD_PTN_TYP SLS_XTRA = create("A040", "SLS_XTRA", MAC_AR_TRD_GRP_TYP.SLS_DSCNT.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：製造
	 */
	public static final MAC_TRD_PTN_TYP MFG = create("B010", "MFG", null, null, null, null, null, null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：仕入
	 */
	public static final MAC_TRD_PTN_TYP PURC = create("C010", "PURC", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), false, false, null, false, new MCNumber(1), true, false, true);

	/** 取引パタン区分：VMI仕入
	 */
	public static final MAC_TRD_PTN_TYP PURC_VMI = create("C011", "PURC_VMI", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), false, false, null, false, new MCNumber(1), true, false, true);

	/** 取引パタン区分：経費購買
	 */
	public static final MAC_TRD_PTN_TYP PURC_XPNS = create("C020", "PURC_XPNS", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, false, new MCNumber(1), true, false, true);

	/** 取引パタン区分：仕入返品
	 */
	public static final MAC_TRD_PTN_TYP PURC_RTN = create("C030", "PURC_RTN", null, null, new MCNumber(-1), new MCNumber(1), new MCNumber(-1), null, false, false, null, false, new MCNumber(-1), true, false, true);

	/** 取引パタン区分：経費購買返品
	 */
	public static final MAC_TRD_PTN_TYP PURC_RTN_XPNS = create("C040", "PURC_RTN_XPNS", null, null, new MCNumber(-1), new MCNumber(1), new MCNumber(-1), null, false, false, null, false, new MCNumber(-1), true, false, true);

	/** 取引パタン区分：仕入値引
	 */
	public static final MAC_TRD_PTN_TYP PURC_DSCNT = create("C050", "PURC_DSCNT", null, null, new MCNumber(1), new MCNumber(-1), new MCNumber(-1), null, false, false, null, false, new MCNumber(-1), true, false, true);

	/** 取引パタン区分：経費値引
	 */
	public static final MAC_TRD_PTN_TYP PURC_DSCNT_XPNS = create("C060", "PURC_DSCNT_XPNS", null, null, new MCNumber(1), new MCNumber(-1), new MCNumber(-1), null, false, false, null, false, new MCNumber(-1), true, false, true);

	/** 取引パタン区分：仕入値増
	 */
	public static final MAC_TRD_PTN_TYP PURC_XTRA = create("C070", "PURC_XTRA", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, false, new MCNumber(1), true, false, true);

	/** 取引パタン区分：経費値増
	 */
	public static final MAC_TRD_PTN_TYP PURC_XTRA_XPNS = create("C080", "PURC_XTRA_XPNS", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, false, new MCNumber(1), true, false, true);

	/** 取引パタン区分：出荷
	 */
	public static final MAC_TRD_PTN_TYP SHIP = create("D010", "SHIP", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：出荷返品
	 */
	public static final MAC_TRD_PTN_TYP SHIP_RTN = create("D020", "SHIP_RTN", null, null, new MCNumber(-1), new MCNumber(1), new MCNumber(-1), null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：移動・移送
	 */
	public static final MAC_TRD_PTN_TYP XFR = create("D030", "XFR", null, null, null, null, null, MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, true, null, false, null, true, false, false);

	/** 取引パタン区分：移動・移送返品
	 */
	public static final MAC_TRD_PTN_TYP XFR_RTN = create("D040", "XFR_RTN", null, null, null, null, null, MAC_SLIP_TITLE_TYP.DLV_SLIP.value(), true, true, null, false, null, true, false, false);

	/** 取引パタン区分：支給
	 */
	public static final MAC_TRD_PTN_TYP PROV = create("D050", "PROV", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), MAC_SLIP_TITLE_TYP.PROV_SLIP.value(), true, true, null, false, null, true, true, false);

	/** 取引パタン区分：支給返品
	 */
	public static final MAC_TRD_PTN_TYP PROV_RTN = create("D060", "PROV_RTN", null, null, new MCNumber(-1), new MCNumber(1), new MCNumber(-1), MAC_SLIP_TITLE_TYP.PROV_SLIP.value(), true, false, null, false, null, true, true, false);

	/** 取引パタン区分：入荷
	 */
	public static final MAC_TRD_PTN_TYP ARR = create("D070", "ARR", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：入荷返品
	 */
	public static final MAC_TRD_PTN_TYP ARR_RTN = create("D080", "ARR_RTN", null, null, new MCNumber(-1), new MCNumber(1), new MCNumber(-1), null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：他勘定入庫
	 */
	public static final MAC_TRD_PTN_TYP STK_OTH_GR = create("D090", "STK_OTH_GR", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：他勘定出庫
	 */
	public static final MAC_TRD_PTN_TYP STK_OTH_GI = create("D100", "STK_OTH_GI", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：廃棄
	 */
	public static final MAC_TRD_PTN_TYP SCRP = create("D110", "SCRP", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：品目振替
	 */
	public static final MAC_TRD_PTN_TYP XFR_ITM = create("D120", "XFR_ITM", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：ロット・手配NO振替
	 */
	public static final MAC_TRD_PTN_TYP XFR_LOT_SNO = create("D130", "XFR_LOT_SNO", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：格付・良品区分振替
	 */
	public static final MAC_TRD_PTN_TYP XFR_GRD = create("D140", "XFR_GRD", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：荷姿振替
	 */
	public static final MAC_TRD_PTN_TYP XFR_PACK = create("D150", "XFR_PACK", null, null, null, null, null, MAC_SLIP_TITLE_TYP.XFR_SLIP.value(), true, false, null, false, null, true, false, false);

	/** 取引パタン区分：棚卸
	 */
	public static final MAC_TRD_PTN_TYP STK_ADJST = create("D160", "STK_ADJST", null, null, null, null, null, null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：検査
	 */
	public static final MAC_TRD_PTN_TYP INSP = create("E010", "INSP", null, null, null, null, null, null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：再検査
	 */
	public static final MAC_TRD_PTN_TYP REINSP = create("E020", "REINSP", null, null, null, null, null, null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：検査抜取
	 */
	public static final MAC_TRD_PTN_TYP INSP_SMPL = create("E030", "INSP_SMPL", null, null, null, null, null, null, false, false, null, false, null, true, false, false);

	/** 取引パタン区分：売上代金入金
	 */
	public static final MAC_TRD_PTN_TYP RCV_AR = create("0102", "RCV_AR", MAC_AR_TRD_GRP_TYP.RCV.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), false, null, true, false, false);

	/** 取引パタン区分：前受金入金
	 */
	public static final MAC_TRD_PTN_TYP RCV_ADV = create("0103", "RCV_ADV", MAC_AR_TRD_GRP_TYP.RCV.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.ADV_ENT.value(), false, null, true, false, false);

	/** 取引パタン区分：仮受金入金
	 */
	public static final MAC_TRD_PTN_TYP RCV_SUSP = create("0104", "RCV_SUSP", MAC_AR_TRD_GRP_TYP.RCV.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.RCV_ENT.value(), false, null, true, false, false);

	/** 取引パタン区分：前受金売掛金相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_ADV_AR = create("0302", "SETOFF_ADV_AR", MAC_AR_TRD_GRP_TYP.SETOFF.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), true, null, true, false, false);

	/** 取引パタン区分：前受金その他勘定相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_ADV_OTH = create("0309", "SETOFF_ADV_OTH", MAC_AR_TRD_GRP_TYP.SETOFF.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.ADV_SW.value(), false, null, true, false, false);

	/** 取引パタン区分：仮受金売掛金相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_SUSP_AR = create("0402", "SETOFF_SUSP_AR", MAC_AR_TRD_GRP_TYP.RCV.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), true, null, true, false, false);

	/** 取引パタン区分：仮受金前受金相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_SUSP_ADV = create("0403", "SETOFF_SUSP_ADV", MAC_AR_TRD_GRP_TYP.RCV.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.ADV_SW.value(), true, null, true, false, false);

	/** 取引パタン区分：仮受金その他勘定相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_SUSP_OTH = create("0409", "SETOFF_SUSP_OTH", MAC_AR_TRD_GRP_TYP.SETOFF.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.ADV_SW.value(), false, null, true, false, false);

	/** 取引パタン区分：その他勘定売掛金相殺
	 */
	public static final MAC_TRD_PTN_TYP SETOFF_OTR_AR = create("0902", "SETOFF_OTR_AR", MAC_AR_TRD_GRP_TYP.SETOFF.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), false, null, true, false, false);

	/** 取引パタン区分：請求残高振替払出
	 */
	public static final MAC_TRD_PTN_TYP ARSW_OUT_BILL_BAL = create("1011", "ARSW_OUT_BILL_BAL", MAC_AR_TRD_GRP_TYP.ARSW.value(), new MCNumber(-1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), true, null, true, false, false);

	/** 取引パタン区分：未請求残高振替払出
	 */
	public static final MAC_TRD_PTN_TYP ARSW_OUT_NOT_BILL_BAL = create("1012", "ARSW_OUT_NOT_BILL_BAL", MAC_AR_TRD_GRP_TYP.ARSW.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), true, null, true, false, false);

	/** 取引パタン区分：請求残高振替受入
	 */
	public static final MAC_TRD_PTN_TYP ARSW_IN_BILL_BAL = create("2011", "ARSW_IN_BILL_BAL", MAC_AR_TRD_GRP_TYP.ARSW.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, true, null, true, false, false);

	/** 取引パタン区分：未請求残高振替受入
	 */
	public static final MAC_TRD_PTN_TYP ARSW_IN_NOT_BILL_BAL = create("2012", "ARSW_IN_NOT_BILL_BAL", MAC_AR_TRD_GRP_TYP.ARSW.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, true, null, true, false, false);

	/** 取引パタン区分：請求時税差額
	 */
	public static final MAC_TRD_PTN_TYP TAX_DIFF_BILL_CL = create("3031", "TAX_DIFF_BILL_CL", MAC_AR_TRD_GRP_TYP.TAX_DIFF.value(), new MCNumber(1), new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, MAC_AC_SLIP_TYP.AR_FAD.value(), true, null, true, false, false);

	/** 取引パタン区分：支払予定時税差額
	 */
	public static final MAC_TRD_PTN_TYP TAX_DIFF_PAY_SCHD_CL = create("F010", "TAX_DIFF_PAY_SCHD_CL", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, true, new MCNumber(1), true, false, false);

	/** 取引パタン区分：照合済残高振替受入
	 */
	public static final MAC_TRD_PTN_TYP APSW_IN_CHK = create("F011", "APSW_IN_CHK", null, null, new MCNumber(1), new MCNumber(1), new MCNumber(1), null, false, false, null, false, new MCNumber(1), true, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_TRD_PTN_TYP create() {
		return new MAC_TRD_PTN_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_TRD_PTN_TYP get(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		if (type == null) {
			throw MAC_TRD_PTN_TYP.invalidValue(value);
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
	public static MAC_TRD_PTN_TYP getNE(String value) {
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_TRD_PTN_TYP create(String value, String xmlKey, String attr1, MCNumber attr2, MCNumber attr3, MCNumber attr4, MCNumber attr5, String attr6, boolean attr7, boolean attr8, String attr9, boolean attr10, MCNumber attr11, boolean attr12, boolean attr13, boolean attr14) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($AR_TRD_GRP_TYP, attr1);
		me.constR.addNumberColumn($AR_AMT_PM, attr2);
		me.constR.addNumberColumn($QTY_DISP_PM, attr3);
		me.constR.addNumberColumn($UPRI_DISP_PM, attr4);
		me.constR.addNumberColumn($AMT_DISP_PM, attr5);
		me.constR.addStringColumn($SLIP_TITLE_TYP, attr6);
		me.constR.addBooleanColumn($IS_SLIP_FORM_SET, attr7);
		me.constR.addBooleanColumn($IS_LOT_SLIP_SET, attr8);
		me.constR.addStringColumn($AC_SLIP_TYP, attr9);
		me.constR.addBooleanColumn($IS_AC_RSN_REQ, attr10);
		me.constR.addNumberColumn($AP_AMT_PM, attr11);
		me.constR.addBooleanColumn($IS_BI_TGT, attr12);
		me.constR.addBooleanColumn($IS_GA_TGT_SLS_SLIP, attr13);
		me.constR.addBooleanColumn($IS_GA_TGT_PURC_SLIP, attr14);
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
	 * ar_trd_grp_typの値を返します。
	 * @return ar_trd_grp_typの値
	 */
	public String ar_trd_grp_typ() {
		return constR.getStringNE($AR_TRD_GRP_TYP);
	}

	/** 
	 * valueに対応する定数のar_trd_grp_typの値を返します。
	 * @param value 定数値
	 * @return ar_trd_grp_typの値
	 */
	public static String ar_trd_grp_typ(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ar_trd_grp_typ();
	}

	/** 
	 * ar_amt_pmの値を返します。
	 * @return ar_amt_pmの値
	 */
	public MCNumber ar_amt_pm() {
		return constR.getNumberNE($AR_AMT_PM);
	}

	/** 
	 * valueに対応する定数のar_amt_pmの値を返します。
	 * @param value 定数値
	 * @return ar_amt_pmの値
	 */
	public static MCNumber ar_amt_pm(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ar_amt_pm();
	}

	/** 
	 * qty_disp_pmの値を返します。
	 * @return qty_disp_pmの値
	 */
	public MCNumber qty_disp_pm() {
		return constR.getNumberNE($QTY_DISP_PM);
	}

	/** 
	 * valueに対応する定数のqty_disp_pmの値を返します。
	 * @param value 定数値
	 * @return qty_disp_pmの値
	 */
	public static MCNumber qty_disp_pm(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.qty_disp_pm();
	}

	/** 
	 * upri_disp_pmの値を返します。
	 * @return upri_disp_pmの値
	 */
	public MCNumber upri_disp_pm() {
		return constR.getNumberNE($UPRI_DISP_PM);
	}

	/** 
	 * valueに対応する定数のupri_disp_pmの値を返します。
	 * @param value 定数値
	 * @return upri_disp_pmの値
	 */
	public static MCNumber upri_disp_pm(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.upri_disp_pm();
	}

	/** 
	 * amt_disp_pmの値を返します。
	 * @return amt_disp_pmの値
	 */
	public MCNumber amt_disp_pm() {
		return constR.getNumberNE($AMT_DISP_PM);
	}

	/** 
	 * valueに対応する定数のamt_disp_pmの値を返します。
	 * @param value 定数値
	 * @return amt_disp_pmの値
	 */
	public static MCNumber amt_disp_pm(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.amt_disp_pm();
	}

	/** 
	 * slip_title_typの値を返します。
	 * @return slip_title_typの値
	 */
	public String slip_title_typ() {
		return constR.getStringNE($SLIP_TITLE_TYP);
	}

	/** 
	 * valueに対応する定数のslip_title_typの値を返します。
	 * @param value 定数値
	 * @return slip_title_typの値
	 */
	public static String slip_title_typ(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.slip_title_typ();
	}

	/** 
	 * is_slip_form_setの値を返します。
	 * @return is_slip_form_setの値
	 */
	public boolean is_slip_form_set() {
		return constR.getBooleanNE($IS_SLIP_FORM_SET);
	}

	/** 
	 * valueに対応する定数のis_slip_form_setの値を返します。
	 * @param value 定数値
	 * @return is_slip_form_setの値
	 */
	public static boolean is_slip_form_set(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_slip_form_set();
	}

	/** 
	 * is_lot_slip_setの値を返します。
	 * @return is_lot_slip_setの値
	 */
	public boolean is_lot_slip_set() {
		return constR.getBooleanNE($IS_LOT_SLIP_SET);
	}

	/** 
	 * valueに対応する定数のis_lot_slip_setの値を返します。
	 * @param value 定数値
	 * @return is_lot_slip_setの値
	 */
	public static boolean is_lot_slip_set(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_lot_slip_set();
	}

	/** 
	 * ac_slip_typの値を返します。
	 * @return ac_slip_typの値
	 */
	public String ac_slip_typ() {
		return constR.getStringNE($AC_SLIP_TYP);
	}

	/** 
	 * valueに対応する定数のac_slip_typの値を返します。
	 * @param value 定数値
	 * @return ac_slip_typの値
	 */
	public static String ac_slip_typ(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ac_slip_typ();
	}

	/** 
	 * is_ac_rsn_reqの値を返します。
	 * @return is_ac_rsn_reqの値
	 */
	public boolean is_ac_rsn_req() {
		return constR.getBooleanNE($IS_AC_RSN_REQ);
	}

	/** 
	 * valueに対応する定数のis_ac_rsn_reqの値を返します。
	 * @param value 定数値
	 * @return is_ac_rsn_reqの値
	 */
	public static boolean is_ac_rsn_req(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ac_rsn_req();
	}

	/** 
	 * ap_amt_pmの値を返します。
	 * @return ap_amt_pmの値
	 */
	public MCNumber ap_amt_pm() {
		return constR.getNumberNE($AP_AMT_PM);
	}

	/** 
	 * valueに対応する定数のap_amt_pmの値を返します。
	 * @param value 定数値
	 * @return ap_amt_pmの値
	 */
	public static MCNumber ap_amt_pm(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ap_amt_pm();
	}

	/** 
	 * is_bi_tgtの値を返します。
	 * @return is_bi_tgtの値
	 */
	public boolean is_bi_tgt() {
		return constR.getBooleanNE($IS_BI_TGT);
	}

	/** 
	 * valueに対応する定数のis_bi_tgtの値を返します。
	 * @param value 定数値
	 * @return is_bi_tgtの値
	 */
	public static boolean is_bi_tgt(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_bi_tgt();
	}

	/** 
	 * is_ga_tgt_sls_slipの値を返します。
	 * @return is_ga_tgt_sls_slipの値
	 */
	public boolean is_ga_tgt_sls_slip() {
		return constR.getBooleanNE($IS_GA_TGT_SLS_SLIP);
	}

	/** 
	 * valueに対応する定数のis_ga_tgt_sls_slipの値を返します。
	 * @param value 定数値
	 * @return is_ga_tgt_sls_slipの値
	 */
	public static boolean is_ga_tgt_sls_slip(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ga_tgt_sls_slip();
	}

	/** 
	 * is_ga_tgt_purc_slipの値を返します。
	 * @return is_ga_tgt_purc_slipの値
	 */
	public boolean is_ga_tgt_purc_slip() {
		return constR.getBooleanNE($IS_GA_TGT_PURC_SLIP);
	}

	/** 
	 * valueに対応する定数のis_ga_tgt_purc_slipの値を返します。
	 * @param value 定数値
	 * @return is_ga_tgt_purc_slipの値
	 */
	public static boolean is_ga_tgt_purc_slip(String value) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ga_tgt_purc_slip();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
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
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
		if (me == null) {
			throw MAC_TRD_PTN_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.getNE(value);
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
		return createStringPath(value(), name(), ar_trd_grp_typ(), ar_amt_pm(), qty_disp_pm(), upri_disp_pm(), amt_disp_pm(), slip_title_typ(), is_slip_form_set(), is_lot_slip_set(), ac_slip_typ(), is_ac_rsn_req(), ap_amt_pm(), is_bi_tgt(), is_ga_tgt_sls_slip(), is_ga_tgt_purc_slip());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_TRD_PTN_TYP[] array() {
		if (array == null) {
			array = new MAC_TRD_PTN_TYP[] {
					MAC_TRD_PTN_TYP.SLS, MAC_TRD_PTN_TYP.SLS_CNSGN, MAC_TRD_PTN_TYP.SLS_RTN, MAC_TRD_PTN_TYP.SLS_DSCNT, MAC_TRD_PTN_TYP.SLS_XTRA, 
					 MAC_TRD_PTN_TYP.MFG, MAC_TRD_PTN_TYP.PURC, MAC_TRD_PTN_TYP.PURC_VMI, MAC_TRD_PTN_TYP.PURC_XPNS, MAC_TRD_PTN_TYP.PURC_RTN, MAC_TRD_PTN_TYP.PURC_RTN_XPNS, 
					 MAC_TRD_PTN_TYP.PURC_DSCNT, MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS, MAC_TRD_PTN_TYP.PURC_XTRA, MAC_TRD_PTN_TYP.PURC_XTRA_XPNS, MAC_TRD_PTN_TYP.SHIP, MAC_TRD_PTN_TYP.SHIP_RTN, 
					 MAC_TRD_PTN_TYP.XFR, MAC_TRD_PTN_TYP.XFR_RTN, MAC_TRD_PTN_TYP.PROV, MAC_TRD_PTN_TYP.PROV_RTN, MAC_TRD_PTN_TYP.ARR, MAC_TRD_PTN_TYP.ARR_RTN, 
					 MAC_TRD_PTN_TYP.STK_OTH_GR, MAC_TRD_PTN_TYP.STK_OTH_GI, MAC_TRD_PTN_TYP.SCRP, MAC_TRD_PTN_TYP.XFR_ITM, MAC_TRD_PTN_TYP.XFR_LOT_SNO, MAC_TRD_PTN_TYP.XFR_GRD, 
					 MAC_TRD_PTN_TYP.XFR_PACK, MAC_TRD_PTN_TYP.STK_ADJST, MAC_TRD_PTN_TYP.INSP, MAC_TRD_PTN_TYP.REINSP, MAC_TRD_PTN_TYP.INSP_SMPL, MAC_TRD_PTN_TYP.RCV_AR, 
					 MAC_TRD_PTN_TYP.RCV_ADV, MAC_TRD_PTN_TYP.RCV_SUSP, MAC_TRD_PTN_TYP.SETOFF_ADV_AR, MAC_TRD_PTN_TYP.SETOFF_ADV_OTH, MAC_TRD_PTN_TYP.SETOFF_SUSP_AR, MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV, 
					 MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH, MAC_TRD_PTN_TYP.SETOFF_OTR_AR, MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL, MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL, MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL, MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL, 
					 MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL, MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL, MAC_TRD_PTN_TYP.APSW_IN_CHK
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
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
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
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
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
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
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
			if(MAC_TRD_PTN_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_TRD_PTN_TYP me = MAC_TRD_PTN_TYP.get(MAC_TRD_PTN_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_TRD_PTN_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_TRD_PTN_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_TRD_PTN_TYP.list();
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
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
			if(MAC_TRD_PTN_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_TRD_PTN_TYP.subList(cols, vals);
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
		for (MAC_TRD_PTN_TYP me : MAC_TRD_PTN_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_TRD_PTN_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_TRD_PTN_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_TRD_PTN_TYP", col);}
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
	protected boolean isSame(MAC_TRD_PTN_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 取引パタン区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SLS.isSame(type);
	}

	/**
	 * 取引パタン区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SLS.isSame(type);
	}

	/**
	 * 取引パタン区分：貸出売上かどうか
	 * @param value 定数値
	 * @return 定数値が貸出売上の値の場合true
	 */
	public static boolean isSLS_CNSGN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SLS_CNSGN.isSame(type);
	}

	/**
	 * 取引パタン区分：貸出売上かどうか
	 * @param type 属性値
	 * @return 属性値が貸出売上の値の場合true
	 */
	public static boolean isSLS_CNSGN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SLS_CNSGN.isSame(type);
	}

	/**
	 * 取引パタン区分：売上返品かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品の値の場合true
	 */
	public static boolean isSLS_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SLS_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：売上返品かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品の値の場合true
	 */
	public static boolean isSLS_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SLS_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：売上値引かどうか
	 * @param value 定数値
	 * @return 定数値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 取引パタン区分：売上値引かどうか
	 * @param type 属性値
	 * @return 属性値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 取引パタン区分：売上値増かどうか
	 * @param value 定数値
	 * @return 定数値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 取引パタン区分：売上値増かどうか
	 * @param type 属性値
	 * @return 属性値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 取引パタン区分：製造かどうか
	 * @param value 定数値
	 * @return 定数値が製造の値の場合true
	 */
	public static boolean isMFG(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.MFG.isSame(type);
	}

	/**
	 * 取引パタン区分：製造かどうか
	 * @param type 属性値
	 * @return 属性値が製造の値の場合true
	 */
	public static boolean isMFG(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.MFG.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入かどうか
	 * @param value 定数値
	 * @return 定数値が仕入の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入かどうか
	 * @param type 属性値
	 * @return 属性値が仕入の値の場合true
	 */
	public static boolean isPURC(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC.isSame(type);
	}

	/**
	 * 取引パタン区分：VMI仕入かどうか
	 * @param value 定数値
	 * @return 定数値がVMI仕入の値の場合true
	 */
	public static boolean isPURC_VMI(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_VMI.isSame(type);
	}

	/**
	 * 取引パタン区分：VMI仕入かどうか
	 * @param type 属性値
	 * @return 属性値がVMI仕入の値の場合true
	 */
	public static boolean isPURC_VMI(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_VMI.isSame(type);
	}

	/**
	 * 取引パタン区分：経費購買かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買の値の場合true
	 */
	public static boolean isPURC_XPNS(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：経費購買かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買の値の場合true
	 */
	public static boolean isPURC_XPNS(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入返品かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入返品かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：経費購買返品かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買返品の値の場合true
	 */
	public static boolean isPURC_RTN_XPNS(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_RTN_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：経費購買返品かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買返品の値の場合true
	 */
	public static boolean isPURC_RTN_XPNS(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_RTN_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入値引かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入値引かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 取引パタン区分：経費値引かどうか
	 * @param value 定数値
	 * @return 定数値が経費値引の値の場合true
	 */
	public static boolean isPURC_DSCNT_XPNS(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：経費値引かどうか
	 * @param type 属性値
	 * @return 属性値が経費値引の値の場合true
	 */
	public static boolean isPURC_DSCNT_XPNS(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_DSCNT_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入値増かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 取引パタン区分：仕入値増かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 取引パタン区分：経費値増かどうか
	 * @param value 定数値
	 * @return 定数値が経費値増の値の場合true
	 */
	public static boolean isPURC_XTRA_XPNS(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：経費値増かどうか
	 * @param type 属性値
	 * @return 属性値が経費値増の値の場合true
	 */
	public static boolean isPURC_XTRA_XPNS(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PURC_XTRA_XPNS.isSame(type);
	}

	/**
	 * 取引パタン区分：出荷かどうか
	 * @param value 定数値
	 * @return 定数値が出荷の値の場合true
	 */
	public static boolean isSHIP(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SHIP.isSame(type);
	}

	/**
	 * 取引パタン区分：出荷かどうか
	 * @param type 属性値
	 * @return 属性値が出荷の値の場合true
	 */
	public static boolean isSHIP(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SHIP.isSame(type);
	}

	/**
	 * 取引パタン区分：出荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SHIP_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：出荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SHIP_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：移動・移送かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送の値の場合true
	 */
	public static boolean isXFR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR.isSame(type);
	}

	/**
	 * 取引パタン区分：移動・移送かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送の値の場合true
	 */
	public static boolean isXFR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR.isSame(type);
	}

	/**
	 * 取引パタン区分：移動・移送返品かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送返品の値の場合true
	 */
	public static boolean isXFR_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：移動・移送返品かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送返品の値の場合true
	 */
	public static boolean isXFR_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：支給かどうか
	 * @param value 定数値
	 * @return 定数値が支給の値の場合true
	 */
	public static boolean isPROV(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PROV.isSame(type);
	}

	/**
	 * 取引パタン区分：支給かどうか
	 * @param type 属性値
	 * @return 属性値が支給の値の場合true
	 */
	public static boolean isPROV(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PROV.isSame(type);
	}

	/**
	 * 取引パタン区分：支給返品かどうか
	 * @param value 定数値
	 * @return 定数値が支給返品の値の場合true
	 */
	public static boolean isPROV_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.PROV_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：支給返品かどうか
	 * @param type 属性値
	 * @return 属性値が支給返品の値の場合true
	 */
	public static boolean isPROV_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.PROV_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：入荷かどうか
	 * @param value 定数値
	 * @return 定数値が入荷の値の場合true
	 */
	public static boolean isARR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARR.isSame(type);
	}

	/**
	 * 取引パタン区分：入荷かどうか
	 * @param type 属性値
	 * @return 属性値が入荷の値の場合true
	 */
	public static boolean isARR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARR.isSame(type);
	}

	/**
	 * 取引パタン区分：入荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：入荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 取引パタン区分：他勘定入庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定入庫の値の場合true
	 */
	public static boolean isSTK_OTH_GR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.STK_OTH_GR.isSame(type);
	}

	/**
	 * 取引パタン区分：他勘定入庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定入庫の値の場合true
	 */
	public static boolean isSTK_OTH_GR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.STK_OTH_GR.isSame(type);
	}

	/**
	 * 取引パタン区分：他勘定出庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定出庫の値の場合true
	 */
	public static boolean isSTK_OTH_GI(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.STK_OTH_GI.isSame(type);
	}

	/**
	 * 取引パタン区分：他勘定出庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定出庫の値の場合true
	 */
	public static boolean isSTK_OTH_GI(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.STK_OTH_GI.isSame(type);
	}

	/**
	 * 取引パタン区分：廃棄かどうか
	 * @param value 定数値
	 * @return 定数値が廃棄の値の場合true
	 */
	public static boolean isSCRP(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SCRP.isSame(type);
	}

	/**
	 * 取引パタン区分：廃棄かどうか
	 * @param type 属性値
	 * @return 属性値が廃棄の値の場合true
	 */
	public static boolean isSCRP(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SCRP.isSame(type);
	}

	/**
	 * 取引パタン区分：品目振替かどうか
	 * @param value 定数値
	 * @return 定数値が品目振替の値の場合true
	 */
	public static boolean isXFR_ITM(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR_ITM.isSame(type);
	}

	/**
	 * 取引パタン区分：品目振替かどうか
	 * @param type 属性値
	 * @return 属性値が品目振替の値の場合true
	 */
	public static boolean isXFR_ITM(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR_ITM.isSame(type);
	}

	/**
	 * 取引パタン区分：ロット・手配NO振替かどうか
	 * @param value 定数値
	 * @return 定数値がロット・手配NO振替の値の場合true
	 */
	public static boolean isXFR_LOT_SNO(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR_LOT_SNO.isSame(type);
	}

	/**
	 * 取引パタン区分：ロット・手配NO振替かどうか
	 * @param type 属性値
	 * @return 属性値がロット・手配NO振替の値の場合true
	 */
	public static boolean isXFR_LOT_SNO(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR_LOT_SNO.isSame(type);
	}

	/**
	 * 取引パタン区分：格付・良品区分振替かどうか
	 * @param value 定数値
	 * @return 定数値が格付・良品区分振替の値の場合true
	 */
	public static boolean isXFR_GRD(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR_GRD.isSame(type);
	}

	/**
	 * 取引パタン区分：格付・良品区分振替かどうか
	 * @param type 属性値
	 * @return 属性値が格付・良品区分振替の値の場合true
	 */
	public static boolean isXFR_GRD(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR_GRD.isSame(type);
	}

	/**
	 * 取引パタン区分：荷姿振替かどうか
	 * @param value 定数値
	 * @return 定数値が荷姿振替の値の場合true
	 */
	public static boolean isXFR_PACK(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.XFR_PACK.isSame(type);
	}

	/**
	 * 取引パタン区分：荷姿振替かどうか
	 * @param type 属性値
	 * @return 属性値が荷姿振替の値の場合true
	 */
	public static boolean isXFR_PACK(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.XFR_PACK.isSame(type);
	}

	/**
	 * 取引パタン区分：棚卸かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸の値の場合true
	 */
	public static boolean isSTK_ADJST(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.STK_ADJST.isSame(type);
	}

	/**
	 * 取引パタン区分：棚卸かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸の値の場合true
	 */
	public static boolean isSTK_ADJST(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.STK_ADJST.isSame(type);
	}

	/**
	 * 取引パタン区分：検査かどうか
	 * @param value 定数値
	 * @return 定数値が検査の値の場合true
	 */
	public static boolean isINSP(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.INSP.isSame(type);
	}

	/**
	 * 取引パタン区分：検査かどうか
	 * @param type 属性値
	 * @return 属性値が検査の値の場合true
	 */
	public static boolean isINSP(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.INSP.isSame(type);
	}

	/**
	 * 取引パタン区分：再検査かどうか
	 * @param value 定数値
	 * @return 定数値が再検査の値の場合true
	 */
	public static boolean isREINSP(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.REINSP.isSame(type);
	}

	/**
	 * 取引パタン区分：再検査かどうか
	 * @param type 属性値
	 * @return 属性値が再検査の値の場合true
	 */
	public static boolean isREINSP(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.REINSP.isSame(type);
	}

	/**
	 * 取引パタン区分：検査抜取かどうか
	 * @param value 定数値
	 * @return 定数値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.INSP_SMPL.isSame(type);
	}

	/**
	 * 取引パタン区分：検査抜取かどうか
	 * @param type 属性値
	 * @return 属性値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.INSP_SMPL.isSame(type);
	}

	/**
	 * 取引パタン区分：売上代金入金かどうか
	 * @param value 定数値
	 * @return 定数値が売上代金入金の値の場合true
	 */
	public static boolean isRCV_AR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.RCV_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：売上代金入金かどうか
	 * @param type 属性値
	 * @return 属性値が売上代金入金の値の場合true
	 */
	public static boolean isRCV_AR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.RCV_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金入金かどうか
	 * @param value 定数値
	 * @return 定数値が前受金入金の値の場合true
	 */
	public static boolean isRCV_ADV(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.RCV_ADV.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金入金かどうか
	 * @param type 属性値
	 * @return 属性値が前受金入金の値の場合true
	 */
	public static boolean isRCV_ADV(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.RCV_ADV.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金入金かどうか
	 * @param value 定数値
	 * @return 定数値が仮受金入金の値の場合true
	 */
	public static boolean isRCV_SUSP(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.RCV_SUSP.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金入金かどうか
	 * @param type 属性値
	 * @return 属性値が仮受金入金の値の場合true
	 */
	public static boolean isRCV_SUSP(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.RCV_SUSP.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金売掛金相殺かどうか
	 * @param value 定数値
	 * @return 定数値が前受金売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_ADV_AR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_ADV_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金売掛金相殺かどうか
	 * @param type 属性値
	 * @return 属性値が前受金売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_ADV_AR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_ADV_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金その他勘定相殺かどうか
	 * @param value 定数値
	 * @return 定数値が前受金その他勘定相殺の値の場合true
	 */
	public static boolean isSETOFF_ADV_OTH(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.isSame(type);
	}

	/**
	 * 取引パタン区分：前受金その他勘定相殺かどうか
	 * @param type 属性値
	 * @return 属性値が前受金その他勘定相殺の値の場合true
	 */
	public static boolean isSETOFF_ADV_OTH(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_ADV_OTH.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金売掛金相殺かどうか
	 * @param value 定数値
	 * @return 定数値が仮受金売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_AR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金売掛金相殺かどうか
	 * @param type 属性値
	 * @return 属性値が仮受金売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_AR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金前受金相殺かどうか
	 * @param value 定数値
	 * @return 定数値が仮受金前受金相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_ADV(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金前受金相殺かどうか
	 * @param type 属性値
	 * @return 属性値が仮受金前受金相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_ADV(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_ADV.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金その他勘定相殺かどうか
	 * @param value 定数値
	 * @return 定数値が仮受金その他勘定相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_OTH(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.isSame(type);
	}

	/**
	 * 取引パタン区分：仮受金その他勘定相殺かどうか
	 * @param type 属性値
	 * @return 属性値が仮受金その他勘定相殺の値の場合true
	 */
	public static boolean isSETOFF_SUSP_OTH(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_SUSP_OTH.isSame(type);
	}

	/**
	 * 取引パタン区分：その他勘定売掛金相殺かどうか
	 * @param value 定数値
	 * @return 定数値がその他勘定売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_OTR_AR(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.SETOFF_OTR_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：その他勘定売掛金相殺かどうか
	 * @param type 属性値
	 * @return 属性値がその他勘定売掛金相殺の値の場合true
	 */
	public static boolean isSETOFF_OTR_AR(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.SETOFF_OTR_AR.isSame(type);
	}

	/**
	 * 取引パタン区分：請求残高振替払出かどうか
	 * @param value 定数値
	 * @return 定数値が請求残高振替払出の値の場合true
	 */
	public static boolean isARSW_OUT_BILL_BAL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：請求残高振替払出かどうか
	 * @param type 属性値
	 * @return 属性値が請求残高振替払出の値の場合true
	 */
	public static boolean isARSW_OUT_BILL_BAL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARSW_OUT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：未請求残高振替払出かどうか
	 * @param value 定数値
	 * @return 定数値が未請求残高振替払出の値の場合true
	 */
	public static boolean isARSW_OUT_NOT_BILL_BAL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：未請求残高振替払出かどうか
	 * @param type 属性値
	 * @return 属性値が未請求残高振替払出の値の場合true
	 */
	public static boolean isARSW_OUT_NOT_BILL_BAL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARSW_OUT_NOT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：請求残高振替受入かどうか
	 * @param value 定数値
	 * @return 定数値が請求残高振替受入の値の場合true
	 */
	public static boolean isARSW_IN_BILL_BAL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：請求残高振替受入かどうか
	 * @param type 属性値
	 * @return 属性値が請求残高振替受入の値の場合true
	 */
	public static boolean isARSW_IN_BILL_BAL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARSW_IN_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：未請求残高振替受入かどうか
	 * @param value 定数値
	 * @return 定数値が未請求残高振替受入の値の場合true
	 */
	public static boolean isARSW_IN_NOT_BILL_BAL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：未請求残高振替受入かどうか
	 * @param type 属性値
	 * @return 属性値が未請求残高振替受入の値の場合true
	 */
	public static boolean isARSW_IN_NOT_BILL_BAL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.ARSW_IN_NOT_BILL_BAL.isSame(type);
	}

	/**
	 * 取引パタン区分：請求時税差額かどうか
	 * @param value 定数値
	 * @return 定数値が請求時税差額の値の場合true
	 */
	public static boolean isTAX_DIFF_BILL_CL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.isSame(type);
	}

	/**
	 * 取引パタン区分：請求時税差額かどうか
	 * @param type 属性値
	 * @return 属性値が請求時税差額の値の場合true
	 */
	public static boolean isTAX_DIFF_BILL_CL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.TAX_DIFF_BILL_CL.isSame(type);
	}

	/**
	 * 取引パタン区分：支払予定時税差額かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定時税差額の値の場合true
	 */
	public static boolean isTAX_DIFF_PAY_SCHD_CL(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.isSame(type);
	}

	/**
	 * 取引パタン区分：支払予定時税差額かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定時税差額の値の場合true
	 */
	public static boolean isTAX_DIFF_PAY_SCHD_CL(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.TAX_DIFF_PAY_SCHD_CL.isSame(type);
	}

	/**
	 * 取引パタン区分：照合済残高振替受入かどうか
	 * @param value 定数値
	 * @return 定数値が照合済残高振替受入の値の場合true
	 */
	public static boolean isAPSW_IN_CHK(String value) {
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
		return MAC_TRD_PTN_TYP.APSW_IN_CHK.isSame(type);
	}

	/**
	 * 取引パタン区分：照合済残高振替受入かどうか
	 * @param type 属性値
	 * @return 属性値が照合済残高振替受入の値の場合true
	 */
	public static boolean isAPSW_IN_CHK(MAC_TRD_PTN_TYP type) {
		return MAC_TRD_PTN_TYP.APSW_IN_CHK.isSame(type);
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
			MAC_TRD_PTN_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.get(value);
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
			MAC_TRD_PTN_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
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
			MAC_TRD_PTN_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.get(value);
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
			MAC_TRD_PTN_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
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
			MAC_TRD_PTN_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.get(value);
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
			MAC_TRD_PTN_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
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
			MAC_TRD_PTN_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.get(value);
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
			MAC_TRD_PTN_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_TRD_PTN_TYP type = MAC_TRD_PTN_TYP.getNE(value);
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
