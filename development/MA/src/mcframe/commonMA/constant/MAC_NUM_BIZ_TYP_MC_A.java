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
abstract class MAC_NUM_BIZ_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "NUM_BIZ_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_NUM_BIZ_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "num_biz_typ";

	public static final String $NAME = "num_biz_typ_nm";

	public static final String $IS_USING_PTN_CD = "is_using_ptn_cd";

	public static final String $IS_USING_ITM_CD = "is_using_itm_cd";

	public static final String $IS_USING_LOC_CD = "is_using_loc_cd";

	public static final String $IS_USING_DPT_CD = "is_using_dpt_cd";

	public static final String $IS_USING_CO_CD = "is_using_co_cd";

	public static final String $IS_USING_BP_CD = "is_using_bp_cd";

	public static final String $IS_USING_WG_CD = "is_using_wg_cd";

	public static final String $IS_USING_TRD = "is_using_trd";

	public static final String $IS_USING_ITM_GRP = "is_using_itm_grp";

	public static final String $IS_USING_BP_GRP = "is_using_bp_grp";

	public static final String $IS_USING_SITE = "is_using_site";

	public static final String $IS_USING_ITM_SITE = "is_using_itm_site";

	public static final String $IS_USING_LOT = "is_using_lot";

	public static final String $IS_USING_CHD_LOT = "is_using_chd_lot";

	public static final String $IS_USING_CHD_SUBLOT = "is_using_chd_sublot";

	public static final String $IS_USING_BP_LOT = "is_using_bp_lot";

	public static final String $IS_USING_SNO1 = "is_using_sno1";

	public static final String $IS_USING_SNO2 = "is_using_sno2";

	public static final String $IS_USING_SNO3 = "is_using_sno3";

	public static final String $IS_USING_SNO4 = "is_using_sno4";

	public static final String $IS_USING_DT = "is_using_dt";

	public static final String $IS_USING_STR = "is_using_str";

	public static final String $IS_USING_STR2 = "is_using_str2";

	public static final String $IS_USING_STR3 = "is_using_str3";

	public static final String $IS_USING_NUM = "is_using_num";

	public static final String $LENGTH = "length";

	public static final String $LIST_SORT = "list_sort";

	public static final String $IS_NUM_ELM = "is_num_elm";

	/*
	 * 定数の定義です。
	 */
	/** 発番業務区分：ロットＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP LOT = create("LOT", "LOT", true, true, true, false, true, true, true, false, true, true, true, true, false, true, false, true, true, true, true, true, true, true, false, false, false, new MCNumber(15), new MCNumber(1), false);

	/** 発番業務区分：サブロットＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SUBLOT = create("SUBLOT", "SUBLOT", true, true, true, false, true, true, true, false, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, false, false, new MCNumber(15), new MCNumber(2), false);

	/** 発番業務区分：手配ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SNO = create("SNO", "SNO", true, true, true, true, true, true, true, false, true, true, true, true, false, false, false, false, false, false, false, false, true, true, true, true, false, new MCNumber(15), new MCNumber(3), false);

	/** 発番業務区分：承認ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP APRV = create("APRV", "APRV", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(4), false);

	/** 発番業務区分：承認申請ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP APRVAPL = create("APRVAPL", "APRVAPL", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(5), false);

	/** 発番業務区分：品目製造指図ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP ITMINST = create("ITMINST", "ITMINST", false, true, true, false, true, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(6), false);

	/** 発番業務区分：製造指図ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP MFGINST = create("MFGINST", "MFGINST", false, true, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(7), false);

	/** 発番業務区分：製造実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP MFGACT = create("MFGACT", "MFGACT", false, true, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(8), false);

	/** 発番業務区分：顧客期間内示ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP CSTFRCST = create("CSTFRCST", "CSTFRCST", false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(9), false);

	/** 発番業務区分：内示書ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PFRPT = create("PFRPT", "PFRPT", false, false, false, false, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(10), false);

	/** 発番業務区分：シミュレーションＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SIMMRP = create("SIMMRP", "SIMMRP", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(11), false);

	/** 発番業務区分：ＭＲＰ計算ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP MRPCLC = create("MRPCLC", "MRPCLC", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(12), false);

	/** 発番業務区分：検査ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP INSP = create("INSP", "INSP", false, true, false, true, true, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, true, true, false, false, false, new MCNumber(15), new MCNumber(13), false);

	/** 発番業務区分：検査指図リストＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP INSPL = create("INSPL", "INSPL", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(14), false);

	/** 発番業務区分：発注ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PO = create("PO", "PO", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(15), false);

	/** 発番業務区分：発注明細ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP POD = create("POD", "POD", false, true, false, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(16), false);

	/** 発番業務区分：納入指示ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP DLVINST = create("DLVINST", "DLVINST", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(17), false);

	/** 発番業務区分：納入指示明細ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP DLVINSTD = create("DLVINSTD", "DLVINSTD", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(18), false);

	/** 発番業務区分：仕入返品予定ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PURCRETSCHD = create("PURCRETSCHD", "PURCRETSCHD", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(19), false);

	/** 発番業務区分：仕入返品実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PURCRETACT = create("PURCRETACT", "PURCRETACT", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(20), false);

	/** 発番業務区分：仕入実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PURCACT = create("PURCACT", "PURCACT", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(21), false);

	/** 発番業務区分：請求書ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP BILL = create("BILL", "BILL", false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(22), false);

	/** 発番業務区分：入金ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP RCV = create("RCV", "RCV", false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(23), false);

	/** 発番業務区分：入金実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP RCVACT = create("RCVACT", "RCVACT", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(24), false);

	/** 発番業務区分：見積ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP QTN = create("QTN", "QTN", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(25), false);

	/** 発番業務区分：受注ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLO = create("SLO", "SLO", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(26), false);

	/** 発番業務区分：受注明細ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLOD = create("SLOD", "SLOD", false, true, false, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(27), false);

	/** 発番業務区分：案件ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP WRK = create("WRK", "WRK", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(28), false);

	/** 発番業務区分：売上返品予定ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLSRETSCHD = create("SLSRETSCHD", "SLSRETSCHD", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(29), false);

	/** 発番業務区分：売上実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLSACT = create("SLSACT", "SLSACT", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(30), false);

	/** 発番業務区分：納品書ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP DLVSLIP = create("DLVSLIP", "DLVSLIP", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(31), false);

	/** 発番業務区分：インボイスＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP IV = create("IV", "IV", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(32), false);

	/** 発番業務区分：出荷指図ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SHIPINST = create("SHIPINST", "SHIPINST", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(33), false);

	/** 発番業務区分：出荷指図明細ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SHIPINSTD = create("SHIPINSTD", "SHIPINSTD", false, true, false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(34), false);

	/** 発番業務区分：出荷実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SHIPACT = create("SHIPACT", "SHIPACT", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(35), false);

	/** 発番業務区分：入荷実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP ARRACT = create("ARRACT", "ARRACT", false, true, false, false, true, false, true, true, true, false, true, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(36), false);

	/** 発番業務区分：移動・移送予定ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP XFRSCHD = create("XFRSCHD", "XFRSCHD", false, true, false, false, true, false, true, true, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(37), false);

	/** 発番業務区分：移動指図ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP XFRINST = create("XFRINST", "XFRINST", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(38), false);

	/** 発番業務区分：移動指図明細ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP XFRINSTD = create("XFRINSTD", "XFRINSTD", false, true, false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(39), false);

	/** 発番業務区分：移動実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP XFRACT = create("XFRACT", "XFRACT", false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(40), false);

	/** 発番業務区分：支給実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PROVACT = create("PROVACT", "PROVACT", false, false, true, false, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(41), false);

	/** 発番業務区分：廃棄申請ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP DSPSL = create("DSPSL", "DSPSL", false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(42), false);

	/** 発番業務区分：他勘定振替実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP ACXACT = create("ACXACT", "ACXACT", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, new MCNumber(15), new MCNumber(43), false);

	/** 発番業務区分：他勘定振替指図ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP ACXINST = create("ACXINST", "ACXINST", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, new MCNumber(15), new MCNumber(44), false);

	/** 発番業務区分：他勘定振替予定ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP ACXSCHD = create("ACXSCHD", "ACXSCHD", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, new MCNumber(15), new MCNumber(45), false);

	/** 発番業務区分：在庫振替実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP STKXACT = create("STKXACT", "STKXACT", false, false, false, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, new MCNumber(15), new MCNumber(46), false);

	/** 発番業務区分：支払照合ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PAYCHK = create("PAYCHK", "PAYCHK", false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(47), false);

	/** 発番業務区分：支払実績ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP PAYACT = create("PAYACT", "PAYACT", false, false, false, true, true, true, true, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(48), false);

	/** 発番業務区分：ＥＳＢ専用ＮＯ（数値）
	 */
	public static final MAC_NUM_BIZ_TYP ESBNUM = create("ESBNUM", "ESBNUM", true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(49), true);

	/** 発番業務区分：ＥＳＢ専用ＮＯ（文字）
	 */
	public static final MAC_NUM_BIZ_TYP ESBSTR = create("ESBSTR", "ESBSTR", true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(50), false);

	/** 発番業務区分：受注納期回答ヘッダＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLOPRMSH = create("SLOPRMSH", "SLOPRMSH", false, false, false, true, true, true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(52), false);

	/** 発番業務区分：受注納期回答ＮＯ
	 */
	public static final MAC_NUM_BIZ_TYP SLOPRMS = create("SLOPRMS", "SLOPRMS", false, true, false, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, new MCNumber(15), new MCNumber(51), false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_NUM_BIZ_TYP create() {
		return new MAC_NUM_BIZ_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_NUM_BIZ_TYP get(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		if (type == null) {
			throw MAC_NUM_BIZ_TYP.invalidValue(value);
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
	public static MAC_NUM_BIZ_TYP getNE(String value) {
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_NUM_BIZ_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9, boolean attr10, boolean attr11, boolean attr12, boolean attr13, boolean attr14, boolean attr15, boolean attr16, boolean attr17, boolean attr18, boolean attr19, boolean attr20, boolean attr21, boolean attr22, boolean attr23, boolean attr24, boolean attr25, MCNumber attr26, MCNumber attr27, boolean attr28) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_USING_PTN_CD, attr1);
		me.constR.addBooleanColumn($IS_USING_ITM_CD, attr2);
		me.constR.addBooleanColumn($IS_USING_LOC_CD, attr3);
		me.constR.addBooleanColumn($IS_USING_DPT_CD, attr4);
		me.constR.addBooleanColumn($IS_USING_CO_CD, attr5);
		me.constR.addBooleanColumn($IS_USING_BP_CD, attr6);
		me.constR.addBooleanColumn($IS_USING_WG_CD, attr7);
		me.constR.addBooleanColumn($IS_USING_TRD, attr8);
		me.constR.addBooleanColumn($IS_USING_ITM_GRP, attr9);
		me.constR.addBooleanColumn($IS_USING_BP_GRP, attr10);
		me.constR.addBooleanColumn($IS_USING_SITE, attr11);
		me.constR.addBooleanColumn($IS_USING_ITM_SITE, attr12);
		me.constR.addBooleanColumn($IS_USING_LOT, attr13);
		me.constR.addBooleanColumn($IS_USING_CHD_LOT, attr14);
		me.constR.addBooleanColumn($IS_USING_CHD_SUBLOT, attr15);
		me.constR.addBooleanColumn($IS_USING_BP_LOT, attr16);
		me.constR.addBooleanColumn($IS_USING_SNO1, attr17);
		me.constR.addBooleanColumn($IS_USING_SNO2, attr18);
		me.constR.addBooleanColumn($IS_USING_SNO3, attr19);
		me.constR.addBooleanColumn($IS_USING_SNO4, attr20);
		me.constR.addBooleanColumn($IS_USING_DT, attr21);
		me.constR.addBooleanColumn($IS_USING_STR, attr22);
		me.constR.addBooleanColumn($IS_USING_STR2, attr23);
		me.constR.addBooleanColumn($IS_USING_STR3, attr24);
		me.constR.addBooleanColumn($IS_USING_NUM, attr25);
		me.constR.addNumberColumn($LENGTH, attr26);
		me.constR.addNumberColumn($LIST_SORT, attr27);
		me.constR.addBooleanColumn($IS_NUM_ELM, attr28);
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
	 * is_using_ptn_cdの値を返します。
	 * @return is_using_ptn_cdの値
	 */
	public boolean is_using_ptn_cd() {
		return constR.getBooleanNE($IS_USING_PTN_CD);
	}

	/** 
	 * valueに対応する定数のis_using_ptn_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_ptn_cdの値
	 */
	public static boolean is_using_ptn_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_ptn_cd();
	}

	/** 
	 * is_using_itm_cdの値を返します。
	 * @return is_using_itm_cdの値
	 */
	public boolean is_using_itm_cd() {
		return constR.getBooleanNE($IS_USING_ITM_CD);
	}

	/** 
	 * valueに対応する定数のis_using_itm_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_itm_cdの値
	 */
	public static boolean is_using_itm_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_itm_cd();
	}

	/** 
	 * is_using_loc_cdの値を返します。
	 * @return is_using_loc_cdの値
	 */
	public boolean is_using_loc_cd() {
		return constR.getBooleanNE($IS_USING_LOC_CD);
	}

	/** 
	 * valueに対応する定数のis_using_loc_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_loc_cdの値
	 */
	public static boolean is_using_loc_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_loc_cd();
	}

	/** 
	 * is_using_dpt_cdの値を返します。
	 * @return is_using_dpt_cdの値
	 */
	public boolean is_using_dpt_cd() {
		return constR.getBooleanNE($IS_USING_DPT_CD);
	}

	/** 
	 * valueに対応する定数のis_using_dpt_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_dpt_cdの値
	 */
	public static boolean is_using_dpt_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_dpt_cd();
	}

	/** 
	 * is_using_co_cdの値を返します。
	 * @return is_using_co_cdの値
	 */
	public boolean is_using_co_cd() {
		return constR.getBooleanNE($IS_USING_CO_CD);
	}

	/** 
	 * valueに対応する定数のis_using_co_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_co_cdの値
	 */
	public static boolean is_using_co_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_co_cd();
	}

	/** 
	 * is_using_bp_cdの値を返します。
	 * @return is_using_bp_cdの値
	 */
	public boolean is_using_bp_cd() {
		return constR.getBooleanNE($IS_USING_BP_CD);
	}

	/** 
	 * valueに対応する定数のis_using_bp_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_bp_cdの値
	 */
	public static boolean is_using_bp_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_bp_cd();
	}

	/** 
	 * is_using_wg_cdの値を返します。
	 * @return is_using_wg_cdの値
	 */
	public boolean is_using_wg_cd() {
		return constR.getBooleanNE($IS_USING_WG_CD);
	}

	/** 
	 * valueに対応する定数のis_using_wg_cdの値を返します。
	 * @param value 定数値
	 * @return is_using_wg_cdの値
	 */
	public static boolean is_using_wg_cd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_wg_cd();
	}

	/** 
	 * is_using_trdの値を返します。
	 * @return is_using_trdの値
	 */
	public boolean is_using_trd() {
		return constR.getBooleanNE($IS_USING_TRD);
	}

	/** 
	 * valueに対応する定数のis_using_trdの値を返します。
	 * @param value 定数値
	 * @return is_using_trdの値
	 */
	public static boolean is_using_trd(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_trd();
	}

	/** 
	 * is_using_itm_grpの値を返します。
	 * @return is_using_itm_grpの値
	 */
	public boolean is_using_itm_grp() {
		return constR.getBooleanNE($IS_USING_ITM_GRP);
	}

	/** 
	 * valueに対応する定数のis_using_itm_grpの値を返します。
	 * @param value 定数値
	 * @return is_using_itm_grpの値
	 */
	public static boolean is_using_itm_grp(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_itm_grp();
	}

	/** 
	 * is_using_bp_grpの値を返します。
	 * @return is_using_bp_grpの値
	 */
	public boolean is_using_bp_grp() {
		return constR.getBooleanNE($IS_USING_BP_GRP);
	}

	/** 
	 * valueに対応する定数のis_using_bp_grpの値を返します。
	 * @param value 定数値
	 * @return is_using_bp_grpの値
	 */
	public static boolean is_using_bp_grp(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_bp_grp();
	}

	/** 
	 * is_using_siteの値を返します。
	 * @return is_using_siteの値
	 */
	public boolean is_using_site() {
		return constR.getBooleanNE($IS_USING_SITE);
	}

	/** 
	 * valueに対応する定数のis_using_siteの値を返します。
	 * @param value 定数値
	 * @return is_using_siteの値
	 */
	public static boolean is_using_site(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_site();
	}

	/** 
	 * is_using_itm_siteの値を返します。
	 * @return is_using_itm_siteの値
	 */
	public boolean is_using_itm_site() {
		return constR.getBooleanNE($IS_USING_ITM_SITE);
	}

	/** 
	 * valueに対応する定数のis_using_itm_siteの値を返します。
	 * @param value 定数値
	 * @return is_using_itm_siteの値
	 */
	public static boolean is_using_itm_site(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_itm_site();
	}

	/** 
	 * is_using_lotの値を返します。
	 * @return is_using_lotの値
	 */
	public boolean is_using_lot() {
		return constR.getBooleanNE($IS_USING_LOT);
	}

	/** 
	 * valueに対応する定数のis_using_lotの値を返します。
	 * @param value 定数値
	 * @return is_using_lotの値
	 */
	public static boolean is_using_lot(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_lot();
	}

	/** 
	 * is_using_chd_lotの値を返します。
	 * @return is_using_chd_lotの値
	 */
	public boolean is_using_chd_lot() {
		return constR.getBooleanNE($IS_USING_CHD_LOT);
	}

	/** 
	 * valueに対応する定数のis_using_chd_lotの値を返します。
	 * @param value 定数値
	 * @return is_using_chd_lotの値
	 */
	public static boolean is_using_chd_lot(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_chd_lot();
	}

	/** 
	 * is_using_chd_sublotの値を返します。
	 * @return is_using_chd_sublotの値
	 */
	public boolean is_using_chd_sublot() {
		return constR.getBooleanNE($IS_USING_CHD_SUBLOT);
	}

	/** 
	 * valueに対応する定数のis_using_chd_sublotの値を返します。
	 * @param value 定数値
	 * @return is_using_chd_sublotの値
	 */
	public static boolean is_using_chd_sublot(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_chd_sublot();
	}

	/** 
	 * is_using_bp_lotの値を返します。
	 * @return is_using_bp_lotの値
	 */
	public boolean is_using_bp_lot() {
		return constR.getBooleanNE($IS_USING_BP_LOT);
	}

	/** 
	 * valueに対応する定数のis_using_bp_lotの値を返します。
	 * @param value 定数値
	 * @return is_using_bp_lotの値
	 */
	public static boolean is_using_bp_lot(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_bp_lot();
	}

	/** 
	 * is_using_sno1の値を返します。
	 * @return is_using_sno1の値
	 */
	public boolean is_using_sno1() {
		return constR.getBooleanNE($IS_USING_SNO1);
	}

	/** 
	 * valueに対応する定数のis_using_sno1の値を返します。
	 * @param value 定数値
	 * @return is_using_sno1の値
	 */
	public static boolean is_using_sno1(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_sno1();
	}

	/** 
	 * is_using_sno2の値を返します。
	 * @return is_using_sno2の値
	 */
	public boolean is_using_sno2() {
		return constR.getBooleanNE($IS_USING_SNO2);
	}

	/** 
	 * valueに対応する定数のis_using_sno2の値を返します。
	 * @param value 定数値
	 * @return is_using_sno2の値
	 */
	public static boolean is_using_sno2(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_sno2();
	}

	/** 
	 * is_using_sno3の値を返します。
	 * @return is_using_sno3の値
	 */
	public boolean is_using_sno3() {
		return constR.getBooleanNE($IS_USING_SNO3);
	}

	/** 
	 * valueに対応する定数のis_using_sno3の値を返します。
	 * @param value 定数値
	 * @return is_using_sno3の値
	 */
	public static boolean is_using_sno3(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_sno3();
	}

	/** 
	 * is_using_sno4の値を返します。
	 * @return is_using_sno4の値
	 */
	public boolean is_using_sno4() {
		return constR.getBooleanNE($IS_USING_SNO4);
	}

	/** 
	 * valueに対応する定数のis_using_sno4の値を返します。
	 * @param value 定数値
	 * @return is_using_sno4の値
	 */
	public static boolean is_using_sno4(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_sno4();
	}

	/** 
	 * is_using_dtの値を返します。
	 * @return is_using_dtの値
	 */
	public boolean is_using_dt() {
		return constR.getBooleanNE($IS_USING_DT);
	}

	/** 
	 * valueに対応する定数のis_using_dtの値を返します。
	 * @param value 定数値
	 * @return is_using_dtの値
	 */
	public static boolean is_using_dt(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_dt();
	}

	/** 
	 * is_using_strの値を返します。
	 * @return is_using_strの値
	 */
	public boolean is_using_str() {
		return constR.getBooleanNE($IS_USING_STR);
	}

	/** 
	 * valueに対応する定数のis_using_strの値を返します。
	 * @param value 定数値
	 * @return is_using_strの値
	 */
	public static boolean is_using_str(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_str();
	}

	/** 
	 * is_using_str2の値を返します。
	 * @return is_using_str2の値
	 */
	public boolean is_using_str2() {
		return constR.getBooleanNE($IS_USING_STR2);
	}

	/** 
	 * valueに対応する定数のis_using_str2の値を返します。
	 * @param value 定数値
	 * @return is_using_str2の値
	 */
	public static boolean is_using_str2(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_str2();
	}

	/** 
	 * is_using_str3の値を返します。
	 * @return is_using_str3の値
	 */
	public boolean is_using_str3() {
		return constR.getBooleanNE($IS_USING_STR3);
	}

	/** 
	 * valueに対応する定数のis_using_str3の値を返します。
	 * @param value 定数値
	 * @return is_using_str3の値
	 */
	public static boolean is_using_str3(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_str3();
	}

	/** 
	 * is_using_numの値を返します。
	 * @return is_using_numの値
	 */
	public boolean is_using_num() {
		return constR.getBooleanNE($IS_USING_NUM);
	}

	/** 
	 * valueに対応する定数のis_using_numの値を返します。
	 * @param value 定数値
	 * @return is_using_numの値
	 */
	public static boolean is_using_num(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_num();
	}

	/** 
	 * lengthの値を返します。
	 * @return lengthの値
	 */
	public MCNumber length() {
		return constR.getNumberNE($LENGTH);
	}

	/** 
	 * valueに対応する定数のlengthの値を返します。
	 * @param value 定数値
	 * @return lengthの値
	 */
	public static MCNumber length(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.length();
	}

	/** 
	 * list_sortの値を返します。
	 * @return list_sortの値
	 */
	public MCNumber list_sort() {
		return constR.getNumberNE($LIST_SORT);
	}

	/** 
	 * valueに対応する定数のlist_sortの値を返します。
	 * @param value 定数値
	 * @return list_sortの値
	 */
	public static MCNumber list_sort(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.list_sort();
	}

	/** 
	 * is_num_elmの値を返します。
	 * @return is_num_elmの値
	 */
	public boolean is_num_elm() {
		return constR.getBooleanNE($IS_NUM_ELM);
	}

	/** 
	 * valueに対応する定数のis_num_elmの値を返します。
	 * @param value 定数値
	 * @return is_num_elmの値
	 */
	public static boolean is_num_elm(String value) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_num_elm();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
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
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
		if (me == null) {
			throw MAC_NUM_BIZ_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_using_ptn_cd(), is_using_itm_cd(), is_using_loc_cd(), is_using_dpt_cd(), is_using_co_cd(), is_using_bp_cd(), is_using_wg_cd(), is_using_trd(), is_using_itm_grp(), is_using_bp_grp(), is_using_site(), is_using_itm_site(), is_using_lot(), is_using_chd_lot(), is_using_chd_sublot(), is_using_bp_lot(), is_using_sno1(), is_using_sno2(), is_using_sno3(), is_using_sno4(), is_using_dt(), is_using_str(), is_using_str2(), is_using_str3(), is_using_num(), length(), list_sort(), is_num_elm());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_NUM_BIZ_TYP[] array() {
		if (array == null) {
			array = new MAC_NUM_BIZ_TYP[] {
					MAC_NUM_BIZ_TYP.LOT, MAC_NUM_BIZ_TYP.SUBLOT, MAC_NUM_BIZ_TYP.SNO, MAC_NUM_BIZ_TYP.APRV, MAC_NUM_BIZ_TYP.APRVAPL, 
					 MAC_NUM_BIZ_TYP.ITMINST, MAC_NUM_BIZ_TYP.MFGINST, MAC_NUM_BIZ_TYP.MFGACT, MAC_NUM_BIZ_TYP.CSTFRCST, MAC_NUM_BIZ_TYP.PFRPT, MAC_NUM_BIZ_TYP.SIMMRP, 
					 MAC_NUM_BIZ_TYP.MRPCLC, MAC_NUM_BIZ_TYP.INSP, MAC_NUM_BIZ_TYP.INSPL, MAC_NUM_BIZ_TYP.PO, MAC_NUM_BIZ_TYP.POD, MAC_NUM_BIZ_TYP.DLVINST, 
					 MAC_NUM_BIZ_TYP.DLVINSTD, MAC_NUM_BIZ_TYP.PURCRETSCHD, MAC_NUM_BIZ_TYP.PURCRETACT, MAC_NUM_BIZ_TYP.PURCACT, MAC_NUM_BIZ_TYP.BILL, MAC_NUM_BIZ_TYP.RCV, 
					 MAC_NUM_BIZ_TYP.RCVACT, MAC_NUM_BIZ_TYP.QTN, MAC_NUM_BIZ_TYP.SLO, MAC_NUM_BIZ_TYP.SLOD, MAC_NUM_BIZ_TYP.WRK, MAC_NUM_BIZ_TYP.SLSRETSCHD, 
					 MAC_NUM_BIZ_TYP.SLSACT, MAC_NUM_BIZ_TYP.DLVSLIP, MAC_NUM_BIZ_TYP.IV, MAC_NUM_BIZ_TYP.SHIPINST, MAC_NUM_BIZ_TYP.SHIPINSTD, MAC_NUM_BIZ_TYP.SHIPACT, 
					 MAC_NUM_BIZ_TYP.ARRACT, MAC_NUM_BIZ_TYP.XFRSCHD, MAC_NUM_BIZ_TYP.XFRINST, MAC_NUM_BIZ_TYP.XFRINSTD, MAC_NUM_BIZ_TYP.XFRACT, MAC_NUM_BIZ_TYP.PROVACT, 
					 MAC_NUM_BIZ_TYP.DSPSL, MAC_NUM_BIZ_TYP.ACXACT, MAC_NUM_BIZ_TYP.ACXINST, MAC_NUM_BIZ_TYP.ACXSCHD, MAC_NUM_BIZ_TYP.STKXACT, MAC_NUM_BIZ_TYP.PAYCHK, 
					 MAC_NUM_BIZ_TYP.PAYACT, MAC_NUM_BIZ_TYP.ESBNUM, MAC_NUM_BIZ_TYP.ESBSTR, MAC_NUM_BIZ_TYP.SLOPRMSH, MAC_NUM_BIZ_TYP.SLOPRMS
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
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
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
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
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
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
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
			if(MAC_NUM_BIZ_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_NUM_BIZ_TYP me = MAC_NUM_BIZ_TYP.get(MAC_NUM_BIZ_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_NUM_BIZ_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_NUM_BIZ_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_NUM_BIZ_TYP.list();
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
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
			if(MAC_NUM_BIZ_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_NUM_BIZ_TYP.subList(cols, vals);
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
		for (MAC_NUM_BIZ_TYP me : MAC_NUM_BIZ_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_NUM_BIZ_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_NUM_BIZ_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_NUM_BIZ_TYP", col);}
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
	protected boolean isSame(MAC_NUM_BIZ_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 発番業務区分：ロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がロットＮＯの値の場合true
	 */
	public static boolean isLOT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.LOT.isSame(type);
	}

	/**
	 * 発番業務区分：ロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がロットＮＯの値の場合true
	 */
	public static boolean isLOT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.LOT.isSame(type);
	}

	/**
	 * 発番業務区分：サブロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がサブロットＮＯの値の場合true
	 */
	public static boolean isSUBLOT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SUBLOT.isSame(type);
	}

	/**
	 * 発番業務区分：サブロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がサブロットＮＯの値の場合true
	 */
	public static boolean isSUBLOT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SUBLOT.isSame(type);
	}

	/**
	 * 発番業務区分：手配ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯの値の場合true
	 */
	public static boolean isSNO(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SNO.isSame(type);
	}

	/**
	 * 発番業務区分：手配ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯの値の場合true
	 */
	public static boolean isSNO(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SNO.isSame(type);
	}

	/**
	 * 発番業務区分：承認ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が承認ＮＯの値の場合true
	 */
	public static boolean isAPRV(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.APRV.isSame(type);
	}

	/**
	 * 発番業務区分：承認ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が承認ＮＯの値の場合true
	 */
	public static boolean isAPRV(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.APRV.isSame(type);
	}

	/**
	 * 発番業務区分：承認申請ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が承認申請ＮＯの値の場合true
	 */
	public static boolean isAPRVAPL(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.APRVAPL.isSame(type);
	}

	/**
	 * 発番業務区分：承認申請ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が承認申請ＮＯの値の場合true
	 */
	public static boolean isAPRVAPL(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.APRVAPL.isSame(type);
	}

	/**
	 * 発番業務区分：品目製造指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目製造指図ＮＯの値の場合true
	 */
	public static boolean isITMINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ITMINST.isSame(type);
	}

	/**
	 * 発番業務区分：品目製造指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目製造指図ＮＯの値の場合true
	 */
	public static boolean isITMINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ITMINST.isSame(type);
	}

	/**
	 * 発番業務区分：製造指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が製造指図ＮＯの値の場合true
	 */
	public static boolean isMFGINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.MFGINST.isSame(type);
	}

	/**
	 * 発番業務区分：製造指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が製造指図ＮＯの値の場合true
	 */
	public static boolean isMFGINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.MFGINST.isSame(type);
	}

	/**
	 * 発番業務区分：製造実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が製造実績ＮＯの値の場合true
	 */
	public static boolean isMFGACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.MFGACT.isSame(type);
	}

	/**
	 * 発番業務区分：製造実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が製造実績ＮＯの値の場合true
	 */
	public static boolean isMFGACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.MFGACT.isSame(type);
	}

	/**
	 * 発番業務区分：顧客期間内示ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が顧客期間内示ＮＯの値の場合true
	 */
	public static boolean isCSTFRCST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.CSTFRCST.isSame(type);
	}

	/**
	 * 発番業務区分：顧客期間内示ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が顧客期間内示ＮＯの値の場合true
	 */
	public static boolean isCSTFRCST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.CSTFRCST.isSame(type);
	}

	/**
	 * 発番業務区分：内示書ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が内示書ＮＯの値の場合true
	 */
	public static boolean isPFRPT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PFRPT.isSame(type);
	}

	/**
	 * 発番業務区分：内示書ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が内示書ＮＯの値の場合true
	 */
	public static boolean isPFRPT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PFRPT.isSame(type);
	}

	/**
	 * 発番業務区分：シミュレーションＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーションＮＯの値の場合true
	 */
	public static boolean isSIMMRP(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SIMMRP.isSame(type);
	}

	/**
	 * 発番業務区分：シミュレーションＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーションＮＯの値の場合true
	 */
	public static boolean isSIMMRP(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SIMMRP.isSame(type);
	}

	/**
	 * 発番業務区分：ＭＲＰ計算ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がＭＲＰ計算ＮＯの値の場合true
	 */
	public static boolean isMRPCLC(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.MRPCLC.isSame(type);
	}

	/**
	 * 発番業務区分：ＭＲＰ計算ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がＭＲＰ計算ＮＯの値の場合true
	 */
	public static boolean isMRPCLC(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.MRPCLC.isSame(type);
	}

	/**
	 * 発番業務区分：検査ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査ＮＯの値の場合true
	 */
	public static boolean isINSP(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.INSP.isSame(type);
	}

	/**
	 * 発番業務区分：検査ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査ＮＯの値の場合true
	 */
	public static boolean isINSP(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.INSP.isSame(type);
	}

	/**
	 * 発番業務区分：検査指図リストＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査指図リストＮＯの値の場合true
	 */
	public static boolean isINSPL(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.INSPL.isSame(type);
	}

	/**
	 * 発番業務区分：検査指図リストＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査指図リストＮＯの値の場合true
	 */
	public static boolean isINSPL(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.INSPL.isSame(type);
	}

	/**
	 * 発番業務区分：発注ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注ＮＯの値の場合true
	 */
	public static boolean isPO(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PO.isSame(type);
	}

	/**
	 * 発番業務区分：発注ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注ＮＯの値の場合true
	 */
	public static boolean isPO(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PO.isSame(type);
	}

	/**
	 * 発番業務区分：発注明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注明細ＮＯの値の場合true
	 */
	public static boolean isPOD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.POD.isSame(type);
	}

	/**
	 * 発番業務区分：発注明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注明細ＮＯの値の場合true
	 */
	public static boolean isPOD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.POD.isSame(type);
	}

	/**
	 * 発番業務区分：納入指示ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示ＮＯの値の場合true
	 */
	public static boolean isDLVINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.DLVINST.isSame(type);
	}

	/**
	 * 発番業務区分：納入指示ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示ＮＯの値の場合true
	 */
	public static boolean isDLVINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.DLVINST.isSame(type);
	}

	/**
	 * 発番業務区分：納入指示明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示明細ＮＯの値の場合true
	 */
	public static boolean isDLVINSTD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.DLVINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：納入指示明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示明細ＮＯの値の場合true
	 */
	public static boolean isDLVINSTD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.DLVINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：仕入返品予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品予定ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PURCRETSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：仕入返品予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品予定ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PURCRETSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：仕入返品実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品実績ＮＯの値の場合true
	 */
	public static boolean isPURCRETACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PURCRETACT.isSame(type);
	}

	/**
	 * 発番業務区分：仕入返品実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品実績ＮＯの値の場合true
	 */
	public static boolean isPURCRETACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PURCRETACT.isSame(type);
	}

	/**
	 * 発番業務区分：仕入実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入実績ＮＯの値の場合true
	 */
	public static boolean isPURCACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PURCACT.isSame(type);
	}

	/**
	 * 発番業務区分：仕入実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入実績ＮＯの値の場合true
	 */
	public static boolean isPURCACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PURCACT.isSame(type);
	}

	/**
	 * 発番業務区分：請求書ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求書ＮＯの値の場合true
	 */
	public static boolean isBILL(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.BILL.isSame(type);
	}

	/**
	 * 発番業務区分：請求書ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求書ＮＯの値の場合true
	 */
	public static boolean isBILL(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.BILL.isSame(type);
	}

	/**
	 * 発番業務区分：入金ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金ＮＯの値の場合true
	 */
	public static boolean isRCV(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.RCV.isSame(type);
	}

	/**
	 * 発番業務区分：入金ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金ＮＯの値の場合true
	 */
	public static boolean isRCV(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.RCV.isSame(type);
	}

	/**
	 * 発番業務区分：入金実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金実績ＮＯの値の場合true
	 */
	public static boolean isRCVACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.RCVACT.isSame(type);
	}

	/**
	 * 発番業務区分：入金実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金実績ＮＯの値の場合true
	 */
	public static boolean isRCVACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.RCVACT.isSame(type);
	}

	/**
	 * 発番業務区分：見積ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が見積ＮＯの値の場合true
	 */
	public static boolean isQTN(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.QTN.isSame(type);
	}

	/**
	 * 発番業務区分：見積ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が見積ＮＯの値の場合true
	 */
	public static boolean isQTN(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.QTN.isSame(type);
	}

	/**
	 * 発番業務区分：受注ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注ＮＯの値の場合true
	 */
	public static boolean isSLO(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLO.isSame(type);
	}

	/**
	 * 発番業務区分：受注ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注ＮＯの値の場合true
	 */
	public static boolean isSLO(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLO.isSame(type);
	}

	/**
	 * 発番業務区分：受注明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注明細ＮＯの値の場合true
	 */
	public static boolean isSLOD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLOD.isSame(type);
	}

	/**
	 * 発番業務区分：受注明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注明細ＮＯの値の場合true
	 */
	public static boolean isSLOD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLOD.isSame(type);
	}

	/**
	 * 発番業務区分：案件ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.WRK.isSame(type);
	}

	/**
	 * 発番業務区分：案件ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が案件ＮＯの値の場合true
	 */
	public static boolean isWRK(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.WRK.isSame(type);
	}

	/**
	 * 発番業務区分：売上返品予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上返品予定ＮＯの値の場合true
	 */
	public static boolean isSLSRETSCHD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLSRETSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：売上返品予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上返品予定ＮＯの値の場合true
	 */
	public static boolean isSLSRETSCHD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLSRETSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：売上実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績ＮＯの値の場合true
	 */
	public static boolean isSLSACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLSACT.isSame(type);
	}

	/**
	 * 発番業務区分：売上実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績ＮＯの値の場合true
	 */
	public static boolean isSLSACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLSACT.isSame(type);
	}

	/**
	 * 発番業務区分：納品書ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納品書ＮＯの値の場合true
	 */
	public static boolean isDLVSLIP(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.DLVSLIP.isSame(type);
	}

	/**
	 * 発番業務区分：納品書ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納品書ＮＯの値の場合true
	 */
	public static boolean isDLVSLIP(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.DLVSLIP.isSame(type);
	}

	/**
	 * 発番業務区分：インボイスＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がインボイスＮＯの値の場合true
	 */
	public static boolean isIV(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.IV.isSame(type);
	}

	/**
	 * 発番業務区分：インボイスＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がインボイスＮＯの値の場合true
	 */
	public static boolean isIV(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.IV.isSame(type);
	}

	/**
	 * 発番業務区分：出荷指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図ＮＯの値の場合true
	 */
	public static boolean isSHIPINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SHIPINST.isSame(type);
	}

	/**
	 * 発番業務区分：出荷指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図ＮＯの値の場合true
	 */
	public static boolean isSHIPINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SHIPINST.isSame(type);
	}

	/**
	 * 発番業務区分：出荷指図明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図明細ＮＯの値の場合true
	 */
	public static boolean isSHIPINSTD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SHIPINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：出荷指図明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図明細ＮＯの値の場合true
	 */
	public static boolean isSHIPINSTD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SHIPINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：出荷実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績ＮＯの値の場合true
	 */
	public static boolean isSHIPACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SHIPACT.isSame(type);
	}

	/**
	 * 発番業務区分：出荷実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績ＮＯの値の場合true
	 */
	public static boolean isSHIPACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SHIPACT.isSame(type);
	}

	/**
	 * 発番業務区分：入荷実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績ＮＯの値の場合true
	 */
	public static boolean isARRACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ARRACT.isSame(type);
	}

	/**
	 * 発番業務区分：入荷実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績ＮＯの値の場合true
	 */
	public static boolean isARRACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ARRACT.isSame(type);
	}

	/**
	 * 発番業務区分：移動・移送予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送予定ＮＯの値の場合true
	 */
	public static boolean isXFRSCHD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.XFRSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：移動・移送予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送予定ＮＯの値の場合true
	 */
	public static boolean isXFRSCHD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.XFRSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：移動指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動指図ＮＯの値の場合true
	 */
	public static boolean isXFRINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.XFRINST.isSame(type);
	}

	/**
	 * 発番業務区分：移動指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動指図ＮＯの値の場合true
	 */
	public static boolean isXFRINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.XFRINST.isSame(type);
	}

	/**
	 * 発番業務区分：移動指図明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動指図明細ＮＯの値の場合true
	 */
	public static boolean isXFRINSTD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.XFRINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：移動指図明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動指図明細ＮＯの値の場合true
	 */
	public static boolean isXFRINSTD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.XFRINSTD.isSame(type);
	}

	/**
	 * 発番業務区分：移動実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動実績ＮＯの値の場合true
	 */
	public static boolean isXFRACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.XFRACT.isSame(type);
	}

	/**
	 * 発番業務区分：移動実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動実績ＮＯの値の場合true
	 */
	public static boolean isXFRACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.XFRACT.isSame(type);
	}

	/**
	 * 発番業務区分：支給実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支給実績ＮＯの値の場合true
	 */
	public static boolean isPROVACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PROVACT.isSame(type);
	}

	/**
	 * 発番業務区分：支給実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支給実績ＮＯの値の場合true
	 */
	public static boolean isPROVACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PROVACT.isSame(type);
	}

	/**
	 * 発番業務区分：廃棄申請ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が廃棄申請ＮＯの値の場合true
	 */
	public static boolean isDSPSL(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.DSPSL.isSame(type);
	}

	/**
	 * 発番業務区分：廃棄申請ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が廃棄申請ＮＯの値の場合true
	 */
	public static boolean isDSPSL(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.DSPSL.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績ＮＯの値の場合true
	 */
	public static boolean isACXACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ACXACT.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績ＮＯの値の場合true
	 */
	public static boolean isACXACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ACXACT.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替指図ＮＯの値の場合true
	 */
	public static boolean isACXINST(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ACXINST.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替指図ＮＯの値の場合true
	 */
	public static boolean isACXINST(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ACXINST.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替予定ＮＯの値の場合true
	 */
	public static boolean isACXSCHD(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ACXSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：他勘定振替予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替予定ＮＯの値の場合true
	 */
	public static boolean isACXSCHD(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ACXSCHD.isSame(type);
	}

	/**
	 * 発番業務区分：在庫振替実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が在庫振替実績ＮＯの値の場合true
	 */
	public static boolean isSTKXACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.STKXACT.isSame(type);
	}

	/**
	 * 発番業務区分：在庫振替実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が在庫振替実績ＮＯの値の場合true
	 */
	public static boolean isSTKXACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.STKXACT.isSame(type);
	}

	/**
	 * 発番業務区分：支払照合ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払照合ＮＯの値の場合true
	 */
	public static boolean isPAYCHK(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PAYCHK.isSame(type);
	}

	/**
	 * 発番業務区分：支払照合ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払照合ＮＯの値の場合true
	 */
	public static boolean isPAYCHK(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PAYCHK.isSame(type);
	}

	/**
	 * 発番業務区分：支払実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払実績ＮＯの値の場合true
	 */
	public static boolean isPAYACT(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.PAYACT.isSame(type);
	}

	/**
	 * 発番業務区分：支払実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払実績ＮＯの値の場合true
	 */
	public static boolean isPAYACT(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.PAYACT.isSame(type);
	}

	/**
	 * 発番業務区分：ＥＳＢ専用ＮＯ（数値）かどうか
	 * @param value 定数値
	 * @return 定数値がＥＳＢ専用ＮＯ（数値）の値の場合true
	 */
	public static boolean isESBNUM(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ESBNUM.isSame(type);
	}

	/**
	 * 発番業務区分：ＥＳＢ専用ＮＯ（数値）かどうか
	 * @param type 属性値
	 * @return 属性値がＥＳＢ専用ＮＯ（数値）の値の場合true
	 */
	public static boolean isESBNUM(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ESBNUM.isSame(type);
	}

	/**
	 * 発番業務区分：ＥＳＢ専用ＮＯ（文字）かどうか
	 * @param value 定数値
	 * @return 定数値がＥＳＢ専用ＮＯ（文字）の値の場合true
	 */
	public static boolean isESBSTR(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.ESBSTR.isSame(type);
	}

	/**
	 * 発番業務区分：ＥＳＢ専用ＮＯ（文字）かどうか
	 * @param type 属性値
	 * @return 属性値がＥＳＢ専用ＮＯ（文字）の値の場合true
	 */
	public static boolean isESBSTR(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.ESBSTR.isSame(type);
	}

	/**
	 * 発番業務区分：受注納期回答ヘッダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注納期回答ヘッダＮＯの値の場合true
	 */
	public static boolean isSLOPRMSH(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLOPRMSH.isSame(type);
	}

	/**
	 * 発番業務区分：受注納期回答ヘッダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注納期回答ヘッダＮＯの値の場合true
	 */
	public static boolean isSLOPRMSH(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLOPRMSH.isSame(type);
	}

	/**
	 * 発番業務区分：受注納期回答ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注納期回答ＮＯの値の場合true
	 */
	public static boolean isSLOPRMS(String value) {
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
		return MAC_NUM_BIZ_TYP.SLOPRMS.isSame(type);
	}

	/**
	 * 発番業務区分：受注納期回答ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注納期回答ＮＯの値の場合true
	 */
	public static boolean isSLOPRMS(MAC_NUM_BIZ_TYP type) {
		return MAC_NUM_BIZ_TYP.SLOPRMS.isSame(type);
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
			MAC_NUM_BIZ_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.get(value);
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
			MAC_NUM_BIZ_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
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
			MAC_NUM_BIZ_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.get(value);
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
			MAC_NUM_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
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
			MAC_NUM_BIZ_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.get(value);
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
			MAC_NUM_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
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
			MAC_NUM_BIZ_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.get(value);
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
			MAC_NUM_BIZ_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_NUM_BIZ_TYP type = MAC_NUM_BIZ_TYP.getNE(value);
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
