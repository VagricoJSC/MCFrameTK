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
abstract class MAC_MST_NM_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "MST_NM";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_MST_NM[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "mst_nm";

	public static final String $NAME = "mst_nm_nm";

	public static final String $IS_COM = "is_com";

	public static final String $IS_LCL = "is_lcl";

	public static final String $IS_MULTI = "is_multi";

	public static final String $MULTI_SORT = "multi_sort";

	public static final String $MST_SORT = "mst_sort";

	/*
	 * 定数の定義です。
	 */
	/** マスタ名：会社マスタ
	 */
	public static final MAC_MST_NM MAM_CO = create("CO", "MAM_CO", false, true, false, null, new MCNumber(1));

	/** マスタ名：品目マスタ
	 */
	public static final MAC_MST_NM MAM_ITM = create("ITM", "MAM_ITM", true, true, false, null, new MCNumber(2));

	/** マスタ名：品目分類マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_GRP = create("ITM_GRP", "MAM_ITM_GRP", true, true, false, null, new MCNumber(3));

	/** マスタ名：販売品目体系マスタ
	 */
	public static final MAC_MST_NM MAM_SLS_ITM_GRP = create("SLS_ITM_GRP", "MAM_SLS_ITM_GRP", true, true, false, null, new MCNumber(4));

	/** マスタ名：品目補助マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_SUB = create("ITM_SUB", "MAM_ITM_SUB", true, false, false, null, new MCNumber(5));

	/** マスタ名：品目区分詳細マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_TYP_D = create("ITM_TYP_D", "MAM_ITM_TYP_D", true, true, false, null, new MCNumber(6));

	/** マスタ名：取引先マスタ
	 */
	public static final MAC_MST_NM MAM_BP = create("BP", "MAM_BP", true, true, false, null, new MCNumber(7));

	/** マスタ名：取引先分類マスタ
	 */
	public static final MAC_MST_NM MAM_BP_GRP = create("BP_GRP", "MAM_BP_GRP", true, true, false, null, new MCNumber(8));

	/** マスタ名：取引先補助マスタ
	 */
	public static final MAC_MST_NM MAM_BP_SUB = create("BP_SUB", "MAM_BP_SUB", true, false, false, null, new MCNumber(9));

	/** マスタ名：部門基本マスタ
	 */
	public static final MAC_MST_NM MAM_DPT_BASE = create("DPT_BASE", "MAM_DPT_BASE", true, true, true, new MCNumber(2), new MCNumber(10));

	/** マスタ名：部門階層マスタ
	 */
	public static final MAC_MST_NM MAM_DPT_LVL = create("DPT_LVL", "MAM_DPT_LVL", true, true, true, new MCNumber(3), new MCNumber(11));

	/** マスタ名：部門マスタ
	 */
	public static final MAC_MST_NM MAM_DPT = create("DPT", "MAM_DPT", true, true, false, null, new MCNumber(12));

	/** マスタ名：組織変更履歴マスタ
	 */
	public static final MAC_MST_NM MAM_DPT_HIS = create("DPT_HIS", "MAM_DPT_HIS", true, false, false, null, new MCNumber(13));

	/** マスタ名：部門変更対応マスタ
	 */
	public static final MAC_MST_NM MAM_DPT_MAP = create("DPT_MAP", "MAM_DPT_MAP", true, false, false, null, new MCNumber(14));

	/** マスタ名：担当者マスタ
	 */
	public static final MAC_MST_NM MAM_USR = create("USR", "MAM_USR", true, true, false, null, new MCNumber(15));

	/** マスタ名：場所マスタ
	 */
	public static final MAC_MST_NM MAM_LOC = create("LOC", "MAM_LOC", true, true, false, null, new MCNumber(16));

	/** マスタ名：棚・ラインマスタ
	 */
	public static final MAC_MST_NM MAM_STR_LN = create("STR_LN", "MAM_STR_LN", true, true, false, null, new MCNumber(17));

	/** マスタ名：場所補助マスタ
	 */
	public static final MAC_MST_NM MAM_LOC_SUB = create("LOC_SUB", "MAM_LOC_SUB", true, false, false, null, new MCNumber(18));

	/** マスタ名：仕様マスタ
	 */
	public static final MAC_MST_NM MAM_SPEC = create("SPEC", "MAM_SPEC", true, true, false, null, new MCNumber(19));

	/** マスタ名：仕様項目マスタ
	 */
	public static final MAC_MST_NM MAM_SPEC_DESC = create("SPEC_DESC", "MAM_SPEC_DESC", true, true, false, null, new MCNumber(20));

	/** マスタ名：対象期間マスタ
	 */
	public static final MAC_MST_NM MAM_TERM = create("TERM", "MAM_TERM", true, true, false, null, new MCNumber(21));

	/** マスタ名：承認情報マスタ
	 */
	public static final MAC_MST_NM MAM_APRV = create("APRV", "MAM_APRV", true, false, false, null, new MCNumber(22));

	/** マスタ名：承認ルートマスタ
	 */
	public static final MAC_MST_NM MAM_APRV_RT = create("APRV_RT", "MAM_APRV_RT", true, false, false, null, new MCNumber(23));

	/** マスタ名：データアクセス基本マスタ
	 */
	public static final MAC_MST_NM MAM_DA = create("DA", "MAM_DA", true, true, true, new MCNumber(1), new MCNumber(24));

	/** マスタ名：データアクセス制御マスタ
	 */
	public static final MAC_MST_NM MAM_DA_CTL = create("DA_CTL", "MAM_DA_CTL", true, false, false, null, new MCNumber(25));

	/** マスタ名：税マスタ
	 */
	public static final MAC_MST_NM MAM_TAX = create("TAX", "MAM_TAX", true, true, false, null, new MCNumber(26));

	/** マスタ名：カレンダ基本マスタ
	 */
	public static final MAC_MST_NM MAM_CAL_BASE = create("CAL_BASE", "MAM_CAL_BASE", true, true, true, new MCNumber(13), new MCNumber(27));

	/** マスタ名：カレンダマスタ
	 */
	public static final MAC_MST_NM MAM_CAL = create("CAL", "MAM_CAL", true, false, false, null, new MCNumber(28));

	/** マスタ名：臨時カレンダマスタ
	 */
	public static final MAC_MST_NM MAM_CAL_EXT = create("CAL_EXT", "MAM_CAL_EXT", true, false, false, null, new MCNumber(29));

	/** マスタ名：為替レートマスタ
	 */
	public static final MAC_MST_NM MAM_CUR_XRATE = create("CUR_XRATE", "MAM_CUR_XRATE", true, false, false, null, new MCNumber(30));

	/** マスタ名：単位換算マスタ
	 */
	public static final MAC_MST_NM MAM_UNIT_CONV = create("UNIT_CONV", "MAM_UNIT_CONV", true, false, false, null, new MCNumber(31));

	/** マスタ名：ＨＳ分類マスタ
	 */
	public static final MAC_MST_NM MAM_HS_GRP = create("HS_GRP", "MAM_HS_GRP", true, true, true, new MCNumber(38), new MCNumber(32));

	/** マスタ名：ＨＳマスタ
	 */
	public static final MAC_MST_NM MAM_HS = create("HS", "MAM_HS", true, true, false, null, new MCNumber(33));

	/** マスタ名：輸出規制マスタ
	 */
	public static final MAC_MST_NM MAM_EX_CTRL = create("EX_CTRL", "MAM_EX_CTRL", true, false, false, null, new MCNumber(34));

	/** マスタ名：業務理由マスタ
	 */
	public static final MAC_MST_NM MAM_BIZ_RSN = create("BIZ_RSN", "MAM_BIZ_RSN", true, true, false, null, new MCNumber(35));

	/** マスタ名：販売分析マスタ
	 */
	public static final MAC_MST_NM MAM_SLS_ANLY = create("SLS_ANLY", "MAM_SLS_ANLY", true, true, false, null, new MCNumber(36));

	/** マスタ名：取引条件マスタ
	 */
	public static final MAC_MST_NM MAM_TTERM = create("TTERM", "MAM_TTERM", true, true, false, null, new MCNumber(37));

	/** マスタ名：注文書表示マスタ
	 */
	public static final MAC_MST_NM MAM_PO_PRINT = create("PO_PRINT", "MAM_PO_PRINT", true, false, false, null, new MCNumber(38));

	/** マスタ名：取引先禁止マスタ
	 */
	public static final MAC_MST_NM MAM_BP_STOP = create("BP_STOP", "MAM_BP_STOP", true, false, false, null, new MCNumber(39));

	/** マスタ名：与信限度額マスタ
	 */
	public static final MAC_MST_NM MAM_CRED_CTRL = create("CRED_CTRL", "MAM_CRED_CTRL", true, false, false, null, new MCNumber(40));

	/** マスタ名：品目付加情報マスタ
	 */
	public static final MAC_MST_NM MAM_ATTACH_INFO = create("ATTACH_INFO", "MAM_ATTACH_INFO", true, false, false, null, new MCNumber(41));

	/** マスタ名：品目単位マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_UNIT = create("ITM_UNIT", "MAM_ITM_UNIT", true, false, false, null, new MCNumber(42));

	/** マスタ名：品目禁止マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_STOP = create("ITM_STOP", "MAM_ITM_STOP", true, false, false, null, new MCNumber(43));

	/** マスタ名：販売計画品目マスタ
	 */
	public static final MAC_MST_NM MAM_SPLN_ITM = create("SPLN_ITM", "MAM_SPLN_ITM", true, true, false, null, new MCNumber(44));

	/** マスタ名：決済方法マスタ
	 */
	public static final MAC_MST_NM MAM_STTL = create("STTL", "MAM_STTL", true, true, false, null, new MCNumber(45));

	/** マスタ名：会計部門マスタ
	 */
	public static final MAC_MST_NM MAM_AC_DPT = create("AC_DPT", "MAM_AC_DPT", true, true, false, null, new MCNumber(46));

	/** マスタ名：予備科目区分マスタ
	 */
	public static final MAC_MST_NM MAM_AC_SUBTYPEM = create("AC_SUBTYPEM", "MAM_AC_SUBTYPEM", true, true, false, null, new MCNumber(47));

	/** マスタ名：会計税マスタ
	 */
	public static final MAC_MST_NM MAM_AC_TAX = create("AC_TAX", "MAM_AC_TAX", true, true, false, null, new MCNumber(48));

	/** マスタ名：会計税対応マスタ
	 */
	public static final MAC_MST_NM MAM_AC_TAX_MAP = create("AC_TAX_MAP", "MAM_AC_TAX_MAP", true, false, false, null, new MCNumber(49));

	/** マスタ名：勘定科目マスタ
	 */
	public static final MAC_MST_NM MAM_ACCOUNT = create("ACCOUNT", "MAM_ACCOUNT", true, true, false, null, new MCNumber(50));

	/** マスタ名：補助勘定科目マスタ
	 */
	public static final MAC_MST_NM MAM_SUB_ACCOUNT = create("SUB_ACCOUNT", "MAM_SUB_ACCOUNT", true, true, false, null, new MCNumber(51));

	/** マスタ名：自動仕訳キーマスタ
	 */
	public static final MAC_MST_NM MAM_AUTO_JNL_KEY = create("AUTO_JNL_KEY", "MAM_AUTO_JNL_KEY", true, true, true, new MCNumber(47), new MCNumber(52));

	/** マスタ名：自動仕訳マスタ
	 */
	public static final MAC_MST_NM MAM_AUTO_JNL = create("AUTO_JNL", "MAM_AUTO_JNL", true, false, false, null, new MCNumber(53));

	/** マスタ名：手形理由マスタ
	 */
	public static final MAC_MST_NM MAM_NOTE_RSN = create("NOTE_RSN", "MAM_NOTE_RSN", true, true, false, null, new MCNumber(54));

	/** マスタ名：集計項目対応マスタ
	 */
	public static final MAC_MST_NM MAM_COL_MAP = create("COL_MAP", "MAM_COL_MAP", true, false, false, null, new MCNumber(55));

	/** マスタ名：自動仕訳パタン基本マスタ
	 */
	public static final MAC_MST_NM MAM_JNL_PTN_BASE = create("JNL_PTN_BASE", "MAM_JNL_PTN_BASE", true, true, true, new MCNumber(46), new MCNumber(56));

	/** マスタ名：自動仕訳パタンマスタ
	 */
	public static final MAC_MST_NM MAM_JNL_PTN = create("JNL_PTN", "MAM_JNL_PTN", true, false, false, null, new MCNumber(57));

	/** マスタ名：仕訳グループマスタ
	 */
	public static final MAC_MST_NM MAM_JNL_GRP = create("JNL_GRP", "MAM_JNL_GRP", true, true, true, new MCNumber(45), new MCNumber(58));

	/** マスタ名：品目仕訳科目設定マスタ
	 */
	public static final MAC_MST_NM MAM_JNL_AC = create("JNL_AC", "MAM_JNL_AC", true, false, false, null, new MCNumber(59));

	/** マスタ名：口座科目設定マスタ
	 */
	public static final MAC_MST_NM MAM_BAC_AC = create("BAC_AC", "MAM_BAC_AC", true, false, false, null, new MCNumber(60));

	/** マスタ名：会計理由科目設定マスタ
	 */
	public static final MAC_MST_NM MAM_RSN_AC = create("RSN_AC", "MAM_RSN_AC", true, false, false, null, new MCNumber(61));

	/** マスタ名：会計伝票区分仕訳マスタ
	 */
	public static final MAC_MST_NM MAM_SLIP_JNL = create("SLIP_JNL", "MAM_SLIP_JNL", true, false, false, null, new MCNumber(62));

	/** マスタ名：原価費目グループマスタ
	 */
	public static final MAC_MST_NM MAM_EXPNS_GRP = create("EXPNS_GRP", "MAM_EXPNS_GRP", true, true, false, null, new MCNumber(63));

	/** マスタ名：原価費目マスタ
	 */
	public static final MAC_MST_NM MAM_EXPNS = create("EXPNS", "MAM_EXPNS", true, true, false, null, new MCNumber(64));

	/** マスタ名：原価メニューマスタ
	 */
	public static final MAC_MST_NM MAM_COST_MENU = create("COST_MENU", "MAM_COST_MENU", true, true, true, null, new MCNumber(65));

	/** マスタ名：原価メニュー構成マスタ
	 */
	public static final MAC_MST_NM MAM_MENU_CONFIG = create("MENU_CONFIG", "MAM_MENU_CONFIG", true, false, false, null, new MCNumber(66));

	/** マスタ名：配賦科目グループマスタ
	 */
	public static final MAC_MST_NM MAM_ALC_AC_GRP = create("ALC_AC_GRP", "MAM_ALC_AC_GRP", true, true, false, null, new MCNumber(67));

	/** マスタ名：配賦科目マスタ
	 */
	public static final MAC_MST_NM MAM_ALC_AC = create("ALC_AC", "MAM_ALC_AC", true, true, false, null, new MCNumber(68));

	/** マスタ名：原価品群マスタ
	 */
	public static final MAC_MST_NM MAM_COST_CTG = create("COST_CTG", "MAM_COST_CTG", true, true, false, null, new MCNumber(69));

	/** マスタ名：原価品群構成マスタ
	 */
	public static final MAC_MST_NM MAM_CTG_CONFIG = create("CTG_CONFIG", "MAM_CTG_CONFIG", true, false, false, null, new MCNumber(70));

	/** マスタ名：原価品群グループマスタ
	 */
	public static final MAC_MST_NM MAM_CTG_GRP = create("CTG_GRP", "MAM_CTG_GRP", true, true, true, new MCNumber(50), new MCNumber(71));

	/** マスタ名：原価部門マスタ
	 */
	public static final MAC_MST_NM MAM_COST_DPT = create("COST_DPT", "MAM_COST_DPT", true, true, false, null, new MCNumber(72));

	/** マスタ名：原価部門構成マスタ
	 */
	public static final MAC_MST_NM MAM_DPT_CONFIG = create("DPT_CONFIG", "MAM_DPT_CONFIG", true, false, false, null, new MCNumber(73));

	/** マスタ名：外部システムマスタ
	 */
	public static final MAC_MST_NM MAM_EXT_SYS = create("EXT_SYS", "MAM_EXT_SYS", true, true, false, null, new MCNumber(74));

	/** マスタ名：ＩＦ通信ルールマスタ
	 */
	public static final MAC_MST_NM MAM_IF_PROTOCOL = create("IF_PROTOCOL", "MAM_IF_PROTOCOL", true, false, false, null, new MCNumber(75));

	/** マスタ名：ＩＦアダプタマスタ
	 */
	public static final MAC_MST_NM MAM_IF_ADAPTER = create("IF_ADAPTER", "MAM_IF_ADAPTER", true, false, false, null, new MCNumber(76));

	/** マスタ名：ＨＴＴＰヘッダマスタ
	 */
	public static final MAC_MST_NM MAM_HTTP_HEADER = create("HTTP_HEADER", "MAM_HTTP_HEADER", true, false, false, null, new MCNumber(77));

	/** マスタ名：外部システムユーザマスタ
	 */
	public static final MAC_MST_NM MAM_EXT_SYS_USR = create("EXT_SYS_USR", "MAM_EXT_SYS_USR", true, false, false, null, new MCNumber(78));

	/** マスタ名：ＩＦコードルールマスタ
	 */
	public static final MAC_MST_NM MAM_IF_CD_RULE = create("IF_CD_RULE", "MAM_IF_CD_RULE", true, false, false, null, new MCNumber(79));

	/** マスタ名：ＩＦコード変換マスタ
	 */
	public static final MAC_MST_NM MAM_IF_X = create("IF_X", "MAM_IF_X", true, false, false, null, new MCNumber(80));

	/** マスタ名：承認役割マスタ
	 */
	public static final MAC_MST_NM MAM_APRV_ROLE = create("APRV_ROLE", "MAM_APRV_ROLE", true, true, true, new MCNumber(4), new MCNumber(81));

	/** マスタ名：国マスタ
	 */
	public static final MAC_MST_NM MAM_CNTRY = create("CNTRY", "MAM_CNTRY", true, true, true, new MCNumber(5), new MCNumber(82));

	/** マスタ名：地域マスタ
	 */
	public static final MAC_MST_NM MAM_AREA = create("AREA", "MAM_AREA", true, true, true, new MCNumber(6), new MCNumber(83));

	/** マスタ名：通貨マスタ
	 */
	public static final MAC_MST_NM MAM_CUR = create("CUR", "MAM_CUR", true, true, true, new MCNumber(7), new MCNumber(84));

	/** マスタ名：単位マスタ
	 */
	public static final MAC_MST_NM MAM_UNIT = create("UNIT", "MAM_UNIT", true, true, true, new MCNumber(8), new MCNumber(85));

	/** マスタ名：銀行マスタ
	 */
	public static final MAC_MST_NM MAM_BANK = create("BANK", "MAM_BANK", true, true, true, new MCNumber(9), new MCNumber(86));

	/** マスタ名：銀行支店マスタ
	 */
	public static final MAC_MST_NM MAM_BANK_BRANCH = create("BANK_BRANCH", "MAM_BANK_BRANCH", true, true, true, new MCNumber(10), new MCNumber(87));

	/** マスタ名：口座マスタ
	 */
	public static final MAC_MST_NM MAM_BANK_AC = create("BANK_AC", "MAM_BANK_AC", true, true, true, new MCNumber(11), new MCNumber(88));

	/** マスタ名：為替レート基本マスタ
	 */
	public static final MAC_MST_NM MAM_XRATE = create("XRATE", "MAM_XRATE", true, true, true, new MCNumber(12), new MCNumber(89));

	/** マスタ名：品目仕訳マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_JNL = create("ITM_JNL", "MAM_ITM_JNL", true, true, true, new MCNumber(14), new MCNumber(90));

	/** マスタ名：会計品目分類マスタ
	 */
	public static final MAC_MST_NM MAM_AC_ITM_GRP = create("AC_ITM_GRP", "MAM_AC_ITM_GRP", true, true, true, new MCNumber(15), new MCNumber(91));

	/** マスタ名：会計理由マスタ
	 */
	public static final MAC_MST_NM MAM_AC_RSN = create("AC_RSN", "MAM_AC_RSN", true, true, true, new MCNumber(16), new MCNumber(92));

	/** マスタ名：工場・物流倉庫マスタ
	 */
	public static final MAC_MST_NM MAM_SITE = create("SITE", "MAM_SITE", true, true, true, new MCNumber(17), new MCNumber(93));

	/** マスタ名：製造場所グループマスタ
	 */
	public static final MAC_MST_NM MAM_LOC_GRP = create("LOC_GRP", "MAM_LOC_GRP", true, true, true, new MCNumber(18), new MCNumber(94));

	/** マスタ名：物流グループマスタ
	 */
	public static final MAC_MST_NM MAM_LG_GRP = create("LG_GRP", "MAM_LG_GRP", true, true, true, new MCNumber(19), new MCNumber(95));

	/** マスタ名：総量引当場所グループマスタ
	 */
	public static final MAC_MST_NM MAM_ALLOC_GRP = create("ALLOC_GRP", "MAM_ALLOC_GRP", true, true, true, new MCNumber(20), new MCNumber(96));

	/** マスタ名：ワーキンググループマスタ
	 */
	public static final MAC_MST_NM MAM_WG = create("WG", "MAM_WG", true, true, true, new MCNumber(21), new MCNumber(97));

	/** マスタ名：工程マスタ
	 */
	public static final MAC_MST_NM MAM_OPER = create("OPER", "MAM_OPER", true, true, true, new MCNumber(22), new MCNumber(98));

	/** マスタ名：工数管理マスタ
	 */
	public static final MAC_MST_NM MAM_WK_COST = create("WK_COST", "MAM_WK_COST", true, true, true, new MCNumber(23), new MCNumber(99));

	/** マスタ名：工数理由マスタ
	 */
	public static final MAC_MST_NM MAM_WK_RSN = create("WK_RSN", "MAM_WK_RSN", true, true, true, new MCNumber(24), new MCNumber(100));

	/** マスタ名：勤務種類マスタ
	 */
	public static final MAC_MST_NM MAM_WK_DAY = create("WK_DAY", "MAM_WK_DAY", true, true, true, new MCNumber(25), new MCNumber(101));

	/** マスタ名：資源マスタ
	 */
	public static final MAC_MST_NM MAM_RSRC = create("RSRC", "MAM_RSRC", true, true, true, new MCNumber(26), new MCNumber(102));

	/** マスタ名：購買内示グループマスタ
	 */
	public static final MAC_MST_NM MAM_PF_GRP = create("PF_GRP", "MAM_PF_GRP", true, true, true, new MCNumber(27), new MCNumber(103));

	/** マスタ名：販売単価分類マスタ
	 */
	public static final MAC_MST_NM MAM_SLS_UPRI_GRP = create("SLS_UPRI_GRP", "MAM_SLS_UPRI_GRP", true, true, true, new MCNumber(28), new MCNumber(104));

	/** マスタ名：販売単価ランクマスタ
	 */
	public static final MAC_MST_NM MAM_SLS_UPRI_RANK = create("SLS_UPRI_RANK", "MAM_SLS_UPRI_RANK", true, true, true, new MCNumber(29), new MCNumber(105));

	/** マスタ名：相殺グループマスタ
	 */
	public static final MAC_MST_NM MAM_SETOFF_GRP = create("SETOFF_GRP", "MAM_SETOFF_GRP", true, true, true, new MCNumber(30), new MCNumber(106));

	/** マスタ名：出荷有効期限グループマスタ
	 */
	public static final MAC_MST_NM MAM_SHIP_VALID = create("SHIP_VALID", "MAM_SHIP_VALID", true, true, true, new MCNumber(31), new MCNumber(107));

	/** マスタ名：品目出荷グループマスタ
	 */
	public static final MAC_MST_NM MAM_ITM_SHIP_GRP = create("ITM_SHIP_GRP", "MAM_ITM_SHIP_GRP", true, true, true, new MCNumber(32), new MCNumber(108));

	/** マスタ名：輸送方法マスタ
	 */
	public static final MAC_MST_NM MAM_TRNSPT = create("TRNSPT", "MAM_TRNSPT", true, true, true, new MCNumber(33), new MCNumber(109));

	/** マスタ名：出荷条件マスタ
	 */
	public static final MAC_MST_NM MAM_SHIP_TERM = create("SHIP_TERM", "MAM_SHIP_TERM", true, true, true, new MCNumber(34), new MCNumber(110));

	/** マスタ名：出荷作業マスタ
	 */
	public static final MAC_MST_NM MAM_SHIP_WK = create("SHIP_WK", "MAM_SHIP_WK", true, true, true, new MCNumber(35), new MCNumber(111));

	/** マスタ名：輸出梱包容器マスタ
	 */
	public static final MAC_MST_NM MAM_EX_CNTNR = create("EX_CNTNR", "MAM_EX_CNTNR", true, true, true, new MCNumber(36), new MCNumber(112));

	/** マスタ名：港マスタ
	 */
	public static final MAC_MST_NM MAM_EXIM_PORT = create("EXIM_PORT", "MAM_EXIM_PORT", true, true, true, new MCNumber(37), new MCNumber(113));

	/** マスタ名：格付マスタ
	 */
	public static final MAC_MST_NM MAM_STK_GD = create("STK_GD", "MAM_STK_GD", true, true, true, new MCNumber(39), new MCNumber(114));

	/** マスタ名：取引マスタ
	 */
	public static final MAC_MST_NM MAM_TRD = create("TRD", "MAM_TRD", true, true, true, new MCNumber(40), new MCNumber(115));

	/** マスタ名：伝票帳票マスタ
	 */
	public static final MAC_MST_NM MAM_SLIP_FORM = create("SLIP_FORM", "MAM_SLIP_FORM", true, true, true, new MCNumber(41), new MCNumber(116));

	/** マスタ名：品目仕様分類マスタ
	 */
	public static final MAC_MST_NM MAM_ITM_SPEC_GRP = create("ITM_SPEC_GRP", "MAM_ITM_SPEC_GRP", true, true, true, new MCNumber(42), new MCNumber(117));

	/** マスタ名：品目構成グループマスタ
	 */
	public static final MAC_MST_NM MAM_ITM_COMP_GRP = create("ITM_COMP_GRP", "MAM_ITM_COMP_GRP", true, true, true, new MCNumber(43), new MCNumber(118));

	/** マスタ名：仕訳実行マスタ
	 */
	public static final MAC_MST_NM MAM_JNL_ACT = create("JNL_ACT", "MAM_JNL_ACT", true, true, true, new MCNumber(44), new MCNumber(119));

	/** マスタ名：配賦パタンマスタ
	 */
	public static final MAC_MST_NM MAM_ALC_PTN = create("ALC_PTN", "MAM_ALC_PTN", true, true, true, new MCNumber(49), new MCNumber(120));

	/** マスタ名：計算実行パタンマスタ
	 */
	public static final MAC_MST_NM MAM_ACT_PTN = create("ACT_PTN", "MAM_ACT_PTN", true, true, true, new MCNumber(51), new MCNumber(121));

	/** マスタ名：汎用配賦分類マスタ
	 */
	public static final MAC_MST_NM MAM_GP_ALC = create("GP_ALC", "MAM_GP_ALC", true, true, true, new MCNumber(52), new MCNumber(122));

	/** マスタ名：計算カテゴリマスタ
	 */
	public static final MAC_MST_NM MAM_CALC_CTG = create("CALC_CTG", "MAM_CALC_CTG", true, true, true, new MCNumber(53), new MCNumber(123));

	/** マスタ名：原価レポートパタンマスタ
	 */
	public static final MAC_MST_NM MAM_RPT_PTN = create("RPT_PTN", "MAM_RPT_PTN", true, true, true, new MCNumber(54), new MCNumber(124));

	/** マスタ名：計算パタンマスタ
	 */
	public static final MAC_MST_NM MAM_CALC_PTN = create("CALC_PTN", "MAM_CALC_PTN", true, true, false, null, new MCNumber(125));

	/** マスタ名：原価売上分類マスタ
	 */
	public static final MAC_MST_NM MAM_COST_SLS = create("COST_SLS", "MAM_COST_SLS", true, true, false, null, new MCNumber(126));

	/** マスタ名：原価個別受払表マスタ
	 */
	public static final MAC_MST_NM MAM_COST_IO = create("COST_IO", "MAM_COST_IO", true, true, false, null, new MCNumber(127));

	/** マスタ名：原価個別受払表構成マスタ
	 */
	public static final MAC_MST_NM MAM_COST_IO_CONF = create("COST_IO_CONF", "MAM_COST_IO_CONF", true, true, false, null, new MCNumber(128));

	/** マスタ名：原価個別受払表項目マスタ
	 */
	public static final MAC_MST_NM MAM_COST_IO_COL = create("COST_IO_COL", "MAM_COST_IO_COL", true, false, false, null, new MCNumber(129));

	/** マスタ名：原価レポートキーマスタ
	 */
	public static final MAC_MST_NM MAM_RPT_KEY = create("RPT_KEY", "MAM_RPT_KEY", true, true, false, null, new MCNumber(130));

	/** マスタ名：原価レポート構成マスタ
	 */
	public static final MAC_MST_NM MAM_RPT_CONF = create("RPT_CONF", "MAM_RPT_CONF", true, true, false, null, new MCNumber(131));

	/** マスタ名：原価レポート行集計マスタ
	 */
	public static final MAC_MST_NM MAM_RPT_ROW_SML = create("RPT_ROW_SML", "MAM_RPT_ROW_SML", true, false, false, null, new MCNumber(132));

	/** マスタ名：一次配賦パタンマスタ
	 */
	public static final MAC_MST_NM MAM_PRE_ALC_PTN = create("PRE_ALC_PTN", "MAM_PRE_ALC_PTN", true, true, false, null, new MCNumber(133));

	/** マスタ名：検査パタンマスタ
	 */
	public static final MAC_MST_NM MAM_INSP_PTN = create("INSP_PTN", "MAM_INSP_PTN", false, true, true, new MCNumber(48), new MCNumber(134));

	/** マスタ名：検査項目マスタ
	 */
	public static final MAC_MST_NM MAM_INSP_POINT = create("INSP_POINT", "MAM_INSP_POINT", false, true, false, null, new MCNumber(135));

	/** マスタ名：出荷作業グループマスタ
	 */
	public static final MAC_MST_NM MAM_SHIP_WK_GRP = create("SHIP_WK_GRP", "MAM_SHIP_WK_GRP", false, true, false, null, new MCNumber(136));

	/** マスタ名：品揃グループマスタ
	 */
	public static final MAC_MST_NM MAM_SET_GRP = create("SET_GRP", "MAM_SET_GRP", false, true, false, null, new MCNumber(137));

	/** マスタ名：ＭＰＳグループマスタ
	 */
	public static final MAC_MST_NM MAM_MPS_GRP = create("MPS_GRP", "MAM_MPS_GRP", false, true, false, null, new MCNumber(138));

	/** マスタ名：計算グループマスタ
	 */
	public static final MAC_MST_NM MAM_CALC_GRP = create("CALC_GRP", "MAM_CALC_GRP", false, true, false, null, new MCNumber(139));

	/** マスタ名：配賦係数マスタ
	 */
	public static final MAC_MST_NM MAM_ALC_COEF = create("ALC_COEF", "MAM_ALC_COEF", false, true, false, null, new MCNumber(140));

	/** マスタ名：原価レポート比較マスタ
	 */
	public static final MAC_MST_NM MAM_RPT_CMP = create("RPT_CMP", "MAM_RPT_CMP", false, true, false, null, new MCNumber(141));

	/** マスタ名：原価レポート比較構成マスタ
	 */
	public static final MAC_MST_NM MAM_RPT_CMP_CONF = create("RPT_CMP_CONF", "MAM_RPT_CMP_CONF", false, true, false, null, new MCNumber(142));

	/** マスタ名：在庫評価マスタ
	 */
	public static final MAC_MST_NM MAM_STK_EVAL = create("STK_EVAL", "MAM_STK_EVAL", false, true, false, null, new MCNumber(143));

	/** マスタ名：一次配賦基準マスタ
	 */
	public static final MAC_MST_NM MAM_PRE_ALC_RATE = create("PRE_ALC_RATE", "MAM_PRE_ALC_RATE", false, true, false, null, new MCNumber(144));

	/** マスタ名：発番パタンマスタ
	 */
	public static final MAC_MST_NM MAM_NUM_PTN = create("NUM_PTN", "MAM_NUM_PTN", false, true, false, null, new MCNumber(145));

	/** マスタ名：汎用分類マスタ
	 */
	public static final MAC_MST_NM MAM_GP_GRP = create("GP_GRP", "MAM_GP_GRP", false, true, false, null, new MCNumber(146));

	/** マスタ名：汎用マスタ
	 */
	public static final MAC_MST_NM MAM_GP = create("GP", "MAM_GP", false, true, false, null, new MCNumber(147));

	/** マスタ名：仕訳キー対応マスタ
	 */
	public static final MAC_MST_NM MAM_JNL_KEY_MAP = create("JNL_KEY_MAP", "MAM_JNL_KEY_MAP", true, false, false, null, new MCNumber(148));

	/** マスタ名：倉庫事業者マスタ
	 */
	public static final MAC_MST_NM MAM_SITE_CO = create("SITE_CO", "MAM_SITE_CO", true, true, true, new MCNumber(56), new MCNumber(149));

	/** マスタ名：支払依頼科目マスタ
	 */
	public static final MAC_MST_NM MAM_SCHD_PAY = create("SCHD_PAY", "MAM_SCHD_PAY", true, false, false, null, new MCNumber(150));

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_MST_NM create() {
		return new MAC_MST_NM();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_MST_NM get(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		if (type == null) {
			throw MAC_MST_NM.invalidValue(value);
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
	public static MAC_MST_NM getNE(String value) {
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_MST_NM create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, MCNumber attr4, MCNumber attr5) {
		MAC_MST_NM me = MAC_MST_NM.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_COM, attr1);
		me.constR.addBooleanColumn($IS_LCL, attr2);
		me.constR.addBooleanColumn($IS_MULTI, attr3);
		me.constR.addNumberColumn($MULTI_SORT, attr4);
		me.constR.addNumberColumn($MST_SORT, attr5);
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
	 * is_comの値を返します。
	 * @return is_comの値
	 */
	public boolean is_com() {
		return constR.getBooleanNE($IS_COM);
	}

	/** 
	 * valueに対応する定数のis_comの値を返します。
	 * @param value 定数値
	 * @return is_comの値
	 */
	public static boolean is_com(String value) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_com();
	}

	/** 
	 * is_lclの値を返します。
	 * @return is_lclの値
	 */
	public boolean is_lcl() {
		return constR.getBooleanNE($IS_LCL);
	}

	/** 
	 * valueに対応する定数のis_lclの値を返します。
	 * @param value 定数値
	 * @return is_lclの値
	 */
	public static boolean is_lcl(String value) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_lcl();
	}

	/** 
	 * is_multiの値を返します。
	 * @return is_multiの値
	 */
	public boolean is_multi() {
		return constR.getBooleanNE($IS_MULTI);
	}

	/** 
	 * valueに対応する定数のis_multiの値を返します。
	 * @param value 定数値
	 * @return is_multiの値
	 */
	public static boolean is_multi(String value) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_multi();
	}

	/** 
	 * multi_sortの値を返します。
	 * @return multi_sortの値
	 */
	public MCNumber multi_sort() {
		return constR.getNumberNE($MULTI_SORT);
	}

	/** 
	 * valueに対応する定数のmulti_sortの値を返します。
	 * @param value 定数値
	 * @return multi_sortの値
	 */
	public static MCNumber multi_sort(String value) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.multi_sort();
	}

	/** 
	 * mst_sortの値を返します。
	 * @return mst_sortの値
	 */
	public MCNumber mst_sort() {
		return constR.getNumberNE($MST_SORT);
	}

	/** 
	 * valueに対応する定数のmst_sortの値を返します。
	 * @param value 定数値
	 * @return mst_sortの値
	 */
	public static MCNumber mst_sort(String value) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.mst_sort();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
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
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
		if (me == null) {
			throw MAC_MST_NM.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_MST_NM me = MAC_MST_NM.getNE(value);
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
		return createStringPath(value(), name(), is_com(), is_lcl(), is_multi(), multi_sort(), mst_sort());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_MST_NM[] array() {
		if (array == null) {
			array = new MAC_MST_NM[] {
					MAC_MST_NM.MAM_CO, MAC_MST_NM.MAM_ITM, MAC_MST_NM.MAM_ITM_GRP, MAC_MST_NM.MAM_SLS_ITM_GRP, MAC_MST_NM.MAM_ITM_SUB, 
					 MAC_MST_NM.MAM_ITM_TYP_D, MAC_MST_NM.MAM_BP, MAC_MST_NM.MAM_BP_GRP, MAC_MST_NM.MAM_BP_SUB, MAC_MST_NM.MAM_DPT_BASE, MAC_MST_NM.MAM_DPT_LVL, 
					 MAC_MST_NM.MAM_DPT, MAC_MST_NM.MAM_DPT_HIS, MAC_MST_NM.MAM_DPT_MAP, MAC_MST_NM.MAM_USR, MAC_MST_NM.MAM_LOC, MAC_MST_NM.MAM_STR_LN, 
					 MAC_MST_NM.MAM_LOC_SUB, MAC_MST_NM.MAM_SPEC, MAC_MST_NM.MAM_SPEC_DESC, MAC_MST_NM.MAM_TERM, MAC_MST_NM.MAM_APRV, MAC_MST_NM.MAM_APRV_RT, 
					 MAC_MST_NM.MAM_DA, MAC_MST_NM.MAM_DA_CTL, MAC_MST_NM.MAM_TAX, MAC_MST_NM.MAM_CAL_BASE, MAC_MST_NM.MAM_CAL, MAC_MST_NM.MAM_CAL_EXT, 
					 MAC_MST_NM.MAM_CUR_XRATE, MAC_MST_NM.MAM_UNIT_CONV, MAC_MST_NM.MAM_HS_GRP, MAC_MST_NM.MAM_HS, MAC_MST_NM.MAM_EX_CTRL, MAC_MST_NM.MAM_BIZ_RSN, 
					 MAC_MST_NM.MAM_SLS_ANLY, MAC_MST_NM.MAM_TTERM, MAC_MST_NM.MAM_PO_PRINT, MAC_MST_NM.MAM_BP_STOP, MAC_MST_NM.MAM_CRED_CTRL, MAC_MST_NM.MAM_ATTACH_INFO, 
					 MAC_MST_NM.MAM_ITM_UNIT, MAC_MST_NM.MAM_ITM_STOP, MAC_MST_NM.MAM_SPLN_ITM, MAC_MST_NM.MAM_STTL, MAC_MST_NM.MAM_AC_DPT, MAC_MST_NM.MAM_AC_SUBTYPEM, 
					 MAC_MST_NM.MAM_AC_TAX, MAC_MST_NM.MAM_AC_TAX_MAP, MAC_MST_NM.MAM_ACCOUNT, MAC_MST_NM.MAM_SUB_ACCOUNT, MAC_MST_NM.MAM_AUTO_JNL_KEY, MAC_MST_NM.MAM_AUTO_JNL, 
					 MAC_MST_NM.MAM_NOTE_RSN, MAC_MST_NM.MAM_COL_MAP, MAC_MST_NM.MAM_JNL_PTN_BASE, MAC_MST_NM.MAM_JNL_PTN, MAC_MST_NM.MAM_JNL_GRP, MAC_MST_NM.MAM_JNL_AC, 
					 MAC_MST_NM.MAM_BAC_AC, MAC_MST_NM.MAM_RSN_AC, MAC_MST_NM.MAM_SLIP_JNL, MAC_MST_NM.MAM_EXPNS_GRP, MAC_MST_NM.MAM_EXPNS, MAC_MST_NM.MAM_COST_MENU, 
					 MAC_MST_NM.MAM_MENU_CONFIG, MAC_MST_NM.MAM_ALC_AC_GRP, MAC_MST_NM.MAM_ALC_AC, MAC_MST_NM.MAM_COST_CTG, MAC_MST_NM.MAM_CTG_CONFIG, MAC_MST_NM.MAM_CTG_GRP, 
					 MAC_MST_NM.MAM_COST_DPT, MAC_MST_NM.MAM_DPT_CONFIG, MAC_MST_NM.MAM_EXT_SYS, MAC_MST_NM.MAM_IF_PROTOCOL, MAC_MST_NM.MAM_IF_ADAPTER, MAC_MST_NM.MAM_HTTP_HEADER, 
					 MAC_MST_NM.MAM_EXT_SYS_USR, MAC_MST_NM.MAM_IF_CD_RULE, MAC_MST_NM.MAM_IF_X, MAC_MST_NM.MAM_APRV_ROLE, MAC_MST_NM.MAM_CNTRY, MAC_MST_NM.MAM_AREA, 
					 MAC_MST_NM.MAM_CUR, MAC_MST_NM.MAM_UNIT, MAC_MST_NM.MAM_BANK, MAC_MST_NM.MAM_BANK_BRANCH, MAC_MST_NM.MAM_BANK_AC, MAC_MST_NM.MAM_XRATE, 
					 MAC_MST_NM.MAM_ITM_JNL, MAC_MST_NM.MAM_AC_ITM_GRP, MAC_MST_NM.MAM_AC_RSN, MAC_MST_NM.MAM_SITE, MAC_MST_NM.MAM_LOC_GRP, MAC_MST_NM.MAM_LG_GRP, 
					 MAC_MST_NM.MAM_ALLOC_GRP, MAC_MST_NM.MAM_WG, MAC_MST_NM.MAM_OPER, MAC_MST_NM.MAM_WK_COST, MAC_MST_NM.MAM_WK_RSN, MAC_MST_NM.MAM_WK_DAY, 
					 MAC_MST_NM.MAM_RSRC, MAC_MST_NM.MAM_PF_GRP, MAC_MST_NM.MAM_SLS_UPRI_GRP, MAC_MST_NM.MAM_SLS_UPRI_RANK, MAC_MST_NM.MAM_SETOFF_GRP, MAC_MST_NM.MAM_SHIP_VALID, 
					 MAC_MST_NM.MAM_ITM_SHIP_GRP, MAC_MST_NM.MAM_TRNSPT, MAC_MST_NM.MAM_SHIP_TERM, MAC_MST_NM.MAM_SHIP_WK, MAC_MST_NM.MAM_EX_CNTNR, MAC_MST_NM.MAM_EXIM_PORT, 
					 MAC_MST_NM.MAM_STK_GD, MAC_MST_NM.MAM_TRD, MAC_MST_NM.MAM_SLIP_FORM, MAC_MST_NM.MAM_ITM_SPEC_GRP, MAC_MST_NM.MAM_ITM_COMP_GRP, MAC_MST_NM.MAM_JNL_ACT, 
					 MAC_MST_NM.MAM_ALC_PTN, MAC_MST_NM.MAM_ACT_PTN, MAC_MST_NM.MAM_GP_ALC, MAC_MST_NM.MAM_CALC_CTG, MAC_MST_NM.MAM_RPT_PTN, MAC_MST_NM.MAM_CALC_PTN, 
					 MAC_MST_NM.MAM_COST_SLS, MAC_MST_NM.MAM_COST_IO, MAC_MST_NM.MAM_COST_IO_CONF, MAC_MST_NM.MAM_COST_IO_COL, MAC_MST_NM.MAM_RPT_KEY, MAC_MST_NM.MAM_RPT_CONF, 
					 MAC_MST_NM.MAM_RPT_ROW_SML, MAC_MST_NM.MAM_PRE_ALC_PTN, MAC_MST_NM.MAM_INSP_PTN, MAC_MST_NM.MAM_INSP_POINT, MAC_MST_NM.MAM_SHIP_WK_GRP, MAC_MST_NM.MAM_SET_GRP, 
					 MAC_MST_NM.MAM_MPS_GRP, MAC_MST_NM.MAM_CALC_GRP, MAC_MST_NM.MAM_ALC_COEF, MAC_MST_NM.MAM_RPT_CMP, MAC_MST_NM.MAM_RPT_CMP_CONF, MAC_MST_NM.MAM_STK_EVAL, 
					 MAC_MST_NM.MAM_PRE_ALC_RATE, MAC_MST_NM.MAM_NUM_PTN, MAC_MST_NM.MAM_GP_GRP, MAC_MST_NM.MAM_GP, MAC_MST_NM.MAM_JNL_KEY_MAP, MAC_MST_NM.MAM_SITE_CO, 
					 MAC_MST_NM.MAM_SCHD_PAY
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
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
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
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
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
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
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
			if(MAC_MST_NM.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_MST_NM me = MAC_MST_NM.get(MAC_MST_NM.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_MST_NM#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_MST_NM.subList(row);
			if (list.isEmpty()) {
				list = MAC_MST_NM.list();
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
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
			if(MAC_MST_NM.isSameVals(me, cols, vals)){
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
			list = MAC_MST_NM.subList(cols, vals);
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
		for (MAC_MST_NM me : MAC_MST_NM.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_MST_NM.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_MST_NM me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_MST_NM", col);}
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
	protected boolean isSame(MAC_MST_NM type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * マスタ名：会社マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会社マスタの値の場合true
	 */
	public static boolean isMAM_CO(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CO.isSame(type);
	}

	/**
	 * マスタ名：会社マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会社マスタの値の場合true
	 */
	public static boolean isMAM_CO(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CO.isSame(type);
	}

	/**
	 * マスタ名：品目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタの値の場合true
	 */
	public static boolean isMAM_ITM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM.isSame(type);
	}

	/**
	 * マスタ名：品目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタの値の場合true
	 */
	public static boolean isMAM_ITM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM.isSame(type);
	}

	/**
	 * マスタ名：品目分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目分類マスタの値の場合true
	 */
	public static boolean isMAM_ITM_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目分類マスタの値の場合true
	 */
	public static boolean isMAM_ITM_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：販売品目体系マスタかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目体系マスタの値の場合true
	 */
	public static boolean isMAM_SLS_ITM_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLS_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：販売品目体系マスタかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目体系マスタの値の場合true
	 */
	public static boolean isMAM_SLS_ITM_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLS_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目補助マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目補助マスタの値の場合true
	 */
	public static boolean isMAM_ITM_SUB(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_SUB.isSame(type);
	}

	/**
	 * マスタ名：品目補助マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目補助マスタの値の場合true
	 */
	public static boolean isMAM_ITM_SUB(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_SUB.isSame(type);
	}

	/**
	 * マスタ名：品目区分詳細マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目区分詳細マスタの値の場合true
	 */
	public static boolean isMAM_ITM_TYP_D(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_TYP_D.isSame(type);
	}

	/**
	 * マスタ名：品目区分詳細マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目区分詳細マスタの値の場合true
	 */
	public static boolean isMAM_ITM_TYP_D(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_TYP_D.isSame(type);
	}

	/**
	 * マスタ名：取引先マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタの値の場合true
	 */
	public static boolean isMAM_BP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BP.isSame(type);
	}

	/**
	 * マスタ名：取引先マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタの値の場合true
	 */
	public static boolean isMAM_BP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BP.isSame(type);
	}

	/**
	 * マスタ名：取引先分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類マスタの値の場合true
	 */
	public static boolean isMAM_BP_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BP_GRP.isSame(type);
	}

	/**
	 * マスタ名：取引先分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類マスタの値の場合true
	 */
	public static boolean isMAM_BP_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BP_GRP.isSame(type);
	}

	/**
	 * マスタ名：取引先補助マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引先補助マスタの値の場合true
	 */
	public static boolean isMAM_BP_SUB(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BP_SUB.isSame(type);
	}

	/**
	 * マスタ名：取引先補助マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引先補助マスタの値の場合true
	 */
	public static boolean isMAM_BP_SUB(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BP_SUB.isSame(type);
	}

	/**
	 * マスタ名：部門基本マスタかどうか
	 * @param value 定数値
	 * @return 定数値が部門基本マスタの値の場合true
	 */
	public static boolean isMAM_DPT_BASE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT_BASE.isSame(type);
	}

	/**
	 * マスタ名：部門基本マスタかどうか
	 * @param type 属性値
	 * @return 属性値が部門基本マスタの値の場合true
	 */
	public static boolean isMAM_DPT_BASE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT_BASE.isSame(type);
	}

	/**
	 * マスタ名：部門階層マスタかどうか
	 * @param value 定数値
	 * @return 定数値が部門階層マスタの値の場合true
	 */
	public static boolean isMAM_DPT_LVL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT_LVL.isSame(type);
	}

	/**
	 * マスタ名：部門階層マスタかどうか
	 * @param type 属性値
	 * @return 属性値が部門階層マスタの値の場合true
	 */
	public static boolean isMAM_DPT_LVL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT_LVL.isSame(type);
	}

	/**
	 * マスタ名：部門マスタかどうか
	 * @param value 定数値
	 * @return 定数値が部門マスタの値の場合true
	 */
	public static boolean isMAM_DPT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT.isSame(type);
	}

	/**
	 * マスタ名：部門マスタかどうか
	 * @param type 属性値
	 * @return 属性値が部門マスタの値の場合true
	 */
	public static boolean isMAM_DPT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT.isSame(type);
	}

	/**
	 * マスタ名：組織変更履歴マスタかどうか
	 * @param value 定数値
	 * @return 定数値が組織変更履歴マスタの値の場合true
	 */
	public static boolean isMAM_DPT_HIS(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT_HIS.isSame(type);
	}

	/**
	 * マスタ名：組織変更履歴マスタかどうか
	 * @param type 属性値
	 * @return 属性値が組織変更履歴マスタの値の場合true
	 */
	public static boolean isMAM_DPT_HIS(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT_HIS.isSame(type);
	}

	/**
	 * マスタ名：部門変更対応マスタかどうか
	 * @param value 定数値
	 * @return 定数値が部門変更対応マスタの値の場合true
	 */
	public static boolean isMAM_DPT_MAP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT_MAP.isSame(type);
	}

	/**
	 * マスタ名：部門変更対応マスタかどうか
	 * @param type 属性値
	 * @return 属性値が部門変更対応マスタの値の場合true
	 */
	public static boolean isMAM_DPT_MAP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT_MAP.isSame(type);
	}

	/**
	 * マスタ名：担当者マスタかどうか
	 * @param value 定数値
	 * @return 定数値が担当者マスタの値の場合true
	 */
	public static boolean isMAM_USR(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_USR.isSame(type);
	}

	/**
	 * マスタ名：担当者マスタかどうか
	 * @param type 属性値
	 * @return 属性値が担当者マスタの値の場合true
	 */
	public static boolean isMAM_USR(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_USR.isSame(type);
	}

	/**
	 * マスタ名：場所マスタかどうか
	 * @param value 定数値
	 * @return 定数値が場所マスタの値の場合true
	 */
	public static boolean isMAM_LOC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_LOC.isSame(type);
	}

	/**
	 * マスタ名：場所マスタかどうか
	 * @param type 属性値
	 * @return 属性値が場所マスタの値の場合true
	 */
	public static boolean isMAM_LOC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_LOC.isSame(type);
	}

	/**
	 * マスタ名：棚・ラインマスタかどうか
	 * @param value 定数値
	 * @return 定数値が棚・ラインマスタの値の場合true
	 */
	public static boolean isMAM_STR_LN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_STR_LN.isSame(type);
	}

	/**
	 * マスタ名：棚・ラインマスタかどうか
	 * @param type 属性値
	 * @return 属性値が棚・ラインマスタの値の場合true
	 */
	public static boolean isMAM_STR_LN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_STR_LN.isSame(type);
	}

	/**
	 * マスタ名：場所補助マスタかどうか
	 * @param value 定数値
	 * @return 定数値が場所補助マスタの値の場合true
	 */
	public static boolean isMAM_LOC_SUB(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_LOC_SUB.isSame(type);
	}

	/**
	 * マスタ名：場所補助マスタかどうか
	 * @param type 属性値
	 * @return 属性値が場所補助マスタの値の場合true
	 */
	public static boolean isMAM_LOC_SUB(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_LOC_SUB.isSame(type);
	}

	/**
	 * マスタ名：仕様マスタかどうか
	 * @param value 定数値
	 * @return 定数値が仕様マスタの値の場合true
	 */
	public static boolean isMAM_SPEC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SPEC.isSame(type);
	}

	/**
	 * マスタ名：仕様マスタかどうか
	 * @param type 属性値
	 * @return 属性値が仕様マスタの値の場合true
	 */
	public static boolean isMAM_SPEC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SPEC.isSame(type);
	}

	/**
	 * マスタ名：仕様項目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が仕様項目マスタの値の場合true
	 */
	public static boolean isMAM_SPEC_DESC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SPEC_DESC.isSame(type);
	}

	/**
	 * マスタ名：仕様項目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が仕様項目マスタの値の場合true
	 */
	public static boolean isMAM_SPEC_DESC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SPEC_DESC.isSame(type);
	}

	/**
	 * マスタ名：対象期間マスタかどうか
	 * @param value 定数値
	 * @return 定数値が対象期間マスタの値の場合true
	 */
	public static boolean isMAM_TERM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_TERM.isSame(type);
	}

	/**
	 * マスタ名：対象期間マスタかどうか
	 * @param type 属性値
	 * @return 属性値が対象期間マスタの値の場合true
	 */
	public static boolean isMAM_TERM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_TERM.isSame(type);
	}

	/**
	 * マスタ名：承認情報マスタかどうか
	 * @param value 定数値
	 * @return 定数値が承認情報マスタの値の場合true
	 */
	public static boolean isMAM_APRV(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_APRV.isSame(type);
	}

	/**
	 * マスタ名：承認情報マスタかどうか
	 * @param type 属性値
	 * @return 属性値が承認情報マスタの値の場合true
	 */
	public static boolean isMAM_APRV(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_APRV.isSame(type);
	}

	/**
	 * マスタ名：承認ルートマスタかどうか
	 * @param value 定数値
	 * @return 定数値が承認ルートマスタの値の場合true
	 */
	public static boolean isMAM_APRV_RT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_APRV_RT.isSame(type);
	}

	/**
	 * マスタ名：承認ルートマスタかどうか
	 * @param type 属性値
	 * @return 属性値が承認ルートマスタの値の場合true
	 */
	public static boolean isMAM_APRV_RT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_APRV_RT.isSame(type);
	}

	/**
	 * マスタ名：データアクセス基本マスタかどうか
	 * @param value 定数値
	 * @return 定数値がデータアクセス基本マスタの値の場合true
	 */
	public static boolean isMAM_DA(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DA.isSame(type);
	}

	/**
	 * マスタ名：データアクセス基本マスタかどうか
	 * @param type 属性値
	 * @return 属性値がデータアクセス基本マスタの値の場合true
	 */
	public static boolean isMAM_DA(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DA.isSame(type);
	}

	/**
	 * マスタ名：データアクセス制御マスタかどうか
	 * @param value 定数値
	 * @return 定数値がデータアクセス制御マスタの値の場合true
	 */
	public static boolean isMAM_DA_CTL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DA_CTL.isSame(type);
	}

	/**
	 * マスタ名：データアクセス制御マスタかどうか
	 * @param type 属性値
	 * @return 属性値がデータアクセス制御マスタの値の場合true
	 */
	public static boolean isMAM_DA_CTL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DA_CTL.isSame(type);
	}

	/**
	 * マスタ名：税マスタかどうか
	 * @param value 定数値
	 * @return 定数値が税マスタの値の場合true
	 */
	public static boolean isMAM_TAX(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_TAX.isSame(type);
	}

	/**
	 * マスタ名：税マスタかどうか
	 * @param type 属性値
	 * @return 属性値が税マスタの値の場合true
	 */
	public static boolean isMAM_TAX(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_TAX.isSame(type);
	}

	/**
	 * マスタ名：カレンダ基本マスタかどうか
	 * @param value 定数値
	 * @return 定数値がカレンダ基本マスタの値の場合true
	 */
	public static boolean isMAM_CAL_BASE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CAL_BASE.isSame(type);
	}

	/**
	 * マスタ名：カレンダ基本マスタかどうか
	 * @param type 属性値
	 * @return 属性値がカレンダ基本マスタの値の場合true
	 */
	public static boolean isMAM_CAL_BASE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CAL_BASE.isSame(type);
	}

	/**
	 * マスタ名：カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がカレンダマスタの値の場合true
	 */
	public static boolean isMAM_CAL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CAL.isSame(type);
	}

	/**
	 * マスタ名：カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がカレンダマスタの値の場合true
	 */
	public static boolean isMAM_CAL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CAL.isSame(type);
	}

	/**
	 * マスタ名：臨時カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値が臨時カレンダマスタの値の場合true
	 */
	public static boolean isMAM_CAL_EXT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CAL_EXT.isSame(type);
	}

	/**
	 * マスタ名：臨時カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値が臨時カレンダマスタの値の場合true
	 */
	public static boolean isMAM_CAL_EXT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CAL_EXT.isSame(type);
	}

	/**
	 * マスタ名：為替レートマスタかどうか
	 * @param value 定数値
	 * @return 定数値が為替レートマスタの値の場合true
	 */
	public static boolean isMAM_CUR_XRATE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CUR_XRATE.isSame(type);
	}

	/**
	 * マスタ名：為替レートマスタかどうか
	 * @param type 属性値
	 * @return 属性値が為替レートマスタの値の場合true
	 */
	public static boolean isMAM_CUR_XRATE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CUR_XRATE.isSame(type);
	}

	/**
	 * マスタ名：単位換算マスタかどうか
	 * @param value 定数値
	 * @return 定数値が単位換算マスタの値の場合true
	 */
	public static boolean isMAM_UNIT_CONV(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_UNIT_CONV.isSame(type);
	}

	/**
	 * マスタ名：単位換算マスタかどうか
	 * @param type 属性値
	 * @return 属性値が単位換算マスタの値の場合true
	 */
	public static boolean isMAM_UNIT_CONV(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_UNIT_CONV.isSame(type);
	}

	/**
	 * マスタ名：ＨＳ分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値がＨＳ分類マスタの値の場合true
	 */
	public static boolean isMAM_HS_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_HS_GRP.isSame(type);
	}

	/**
	 * マスタ名：ＨＳ分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値がＨＳ分類マスタの値の場合true
	 */
	public static boolean isMAM_HS_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_HS_GRP.isSame(type);
	}

	/**
	 * マスタ名：ＨＳマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＨＳマスタの値の場合true
	 */
	public static boolean isMAM_HS(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_HS.isSame(type);
	}

	/**
	 * マスタ名：ＨＳマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＨＳマスタの値の場合true
	 */
	public static boolean isMAM_HS(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_HS.isSame(type);
	}

	/**
	 * マスタ名：輸出規制マスタかどうか
	 * @param value 定数値
	 * @return 定数値が輸出規制マスタの値の場合true
	 */
	public static boolean isMAM_EX_CTRL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EX_CTRL.isSame(type);
	}

	/**
	 * マスタ名：輸出規制マスタかどうか
	 * @param type 属性値
	 * @return 属性値が輸出規制マスタの値の場合true
	 */
	public static boolean isMAM_EX_CTRL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EX_CTRL.isSame(type);
	}

	/**
	 * マスタ名：業務理由マスタかどうか
	 * @param value 定数値
	 * @return 定数値が業務理由マスタの値の場合true
	 */
	public static boolean isMAM_BIZ_RSN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BIZ_RSN.isSame(type);
	}

	/**
	 * マスタ名：業務理由マスタかどうか
	 * @param type 属性値
	 * @return 属性値が業務理由マスタの値の場合true
	 */
	public static boolean isMAM_BIZ_RSN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BIZ_RSN.isSame(type);
	}

	/**
	 * マスタ名：販売分析マスタかどうか
	 * @param value 定数値
	 * @return 定数値が販売分析マスタの値の場合true
	 */
	public static boolean isMAM_SLS_ANLY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLS_ANLY.isSame(type);
	}

	/**
	 * マスタ名：販売分析マスタかどうか
	 * @param type 属性値
	 * @return 属性値が販売分析マスタの値の場合true
	 */
	public static boolean isMAM_SLS_ANLY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLS_ANLY.isSame(type);
	}

	/**
	 * マスタ名：取引条件マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引条件マスタの値の場合true
	 */
	public static boolean isMAM_TTERM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_TTERM.isSame(type);
	}

	/**
	 * マスタ名：取引条件マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引条件マスタの値の場合true
	 */
	public static boolean isMAM_TTERM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_TTERM.isSame(type);
	}

	/**
	 * マスタ名：注文書表示マスタかどうか
	 * @param value 定数値
	 * @return 定数値が注文書表示マスタの値の場合true
	 */
	public static boolean isMAM_PO_PRINT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_PO_PRINT.isSame(type);
	}

	/**
	 * マスタ名：注文書表示マスタかどうか
	 * @param type 属性値
	 * @return 属性値が注文書表示マスタの値の場合true
	 */
	public static boolean isMAM_PO_PRINT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_PO_PRINT.isSame(type);
	}

	/**
	 * マスタ名：取引先禁止マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引先禁止マスタの値の場合true
	 */
	public static boolean isMAM_BP_STOP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BP_STOP.isSame(type);
	}

	/**
	 * マスタ名：取引先禁止マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引先禁止マスタの値の場合true
	 */
	public static boolean isMAM_BP_STOP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BP_STOP.isSame(type);
	}

	/**
	 * マスタ名：与信限度額マスタかどうか
	 * @param value 定数値
	 * @return 定数値が与信限度額マスタの値の場合true
	 */
	public static boolean isMAM_CRED_CTRL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CRED_CTRL.isSame(type);
	}

	/**
	 * マスタ名：与信限度額マスタかどうか
	 * @param type 属性値
	 * @return 属性値が与信限度額マスタの値の場合true
	 */
	public static boolean isMAM_CRED_CTRL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CRED_CTRL.isSame(type);
	}

	/**
	 * マスタ名：品目付加情報マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目付加情報マスタの値の場合true
	 */
	public static boolean isMAM_ATTACH_INFO(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ATTACH_INFO.isSame(type);
	}

	/**
	 * マスタ名：品目付加情報マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目付加情報マスタの値の場合true
	 */
	public static boolean isMAM_ATTACH_INFO(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ATTACH_INFO.isSame(type);
	}

	/**
	 * マスタ名：品目単位マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目単位マスタの値の場合true
	 */
	public static boolean isMAM_ITM_UNIT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_UNIT.isSame(type);
	}

	/**
	 * マスタ名：品目単位マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目単位マスタの値の場合true
	 */
	public static boolean isMAM_ITM_UNIT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_UNIT.isSame(type);
	}

	/**
	 * マスタ名：品目禁止マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目禁止マスタの値の場合true
	 */
	public static boolean isMAM_ITM_STOP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_STOP.isSame(type);
	}

	/**
	 * マスタ名：品目禁止マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目禁止マスタの値の場合true
	 */
	public static boolean isMAM_ITM_STOP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_STOP.isSame(type);
	}

	/**
	 * マスタ名：販売計画品目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が販売計画品目マスタの値の場合true
	 */
	public static boolean isMAM_SPLN_ITM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SPLN_ITM.isSame(type);
	}

	/**
	 * マスタ名：販売計画品目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が販売計画品目マスタの値の場合true
	 */
	public static boolean isMAM_SPLN_ITM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SPLN_ITM.isSame(type);
	}

	/**
	 * マスタ名：決済方法マスタかどうか
	 * @param value 定数値
	 * @return 定数値が決済方法マスタの値の場合true
	 */
	public static boolean isMAM_STTL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_STTL.isSame(type);
	}

	/**
	 * マスタ名：決済方法マスタかどうか
	 * @param type 属性値
	 * @return 属性値が決済方法マスタの値の場合true
	 */
	public static boolean isMAM_STTL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_STTL.isSame(type);
	}

	/**
	 * マスタ名：会計部門マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計部門マスタの値の場合true
	 */
	public static boolean isMAM_AC_DPT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_DPT.isSame(type);
	}

	/**
	 * マスタ名：会計部門マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計部門マスタの値の場合true
	 */
	public static boolean isMAM_AC_DPT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_DPT.isSame(type);
	}

	/**
	 * マスタ名：予備科目区分マスタかどうか
	 * @param value 定数値
	 * @return 定数値が予備科目区分マスタの値の場合true
	 */
	public static boolean isMAM_AC_SUBTYPEM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_SUBTYPEM.isSame(type);
	}

	/**
	 * マスタ名：予備科目区分マスタかどうか
	 * @param type 属性値
	 * @return 属性値が予備科目区分マスタの値の場合true
	 */
	public static boolean isMAM_AC_SUBTYPEM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_SUBTYPEM.isSame(type);
	}

	/**
	 * マスタ名：会計税マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計税マスタの値の場合true
	 */
	public static boolean isMAM_AC_TAX(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_TAX.isSame(type);
	}

	/**
	 * マスタ名：会計税マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計税マスタの値の場合true
	 */
	public static boolean isMAM_AC_TAX(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_TAX.isSame(type);
	}

	/**
	 * マスタ名：会計税対応マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計税対応マスタの値の場合true
	 */
	public static boolean isMAM_AC_TAX_MAP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_TAX_MAP.isSame(type);
	}

	/**
	 * マスタ名：会計税対応マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計税対応マスタの値の場合true
	 */
	public static boolean isMAM_AC_TAX_MAP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_TAX_MAP.isSame(type);
	}

	/**
	 * マスタ名：勘定科目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が勘定科目マスタの値の場合true
	 */
	public static boolean isMAM_ACCOUNT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ACCOUNT.isSame(type);
	}

	/**
	 * マスタ名：勘定科目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が勘定科目マスタの値の場合true
	 */
	public static boolean isMAM_ACCOUNT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ACCOUNT.isSame(type);
	}

	/**
	 * マスタ名：補助勘定科目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が補助勘定科目マスタの値の場合true
	 */
	public static boolean isMAM_SUB_ACCOUNT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SUB_ACCOUNT.isSame(type);
	}

	/**
	 * マスタ名：補助勘定科目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が補助勘定科目マスタの値の場合true
	 */
	public static boolean isMAM_SUB_ACCOUNT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SUB_ACCOUNT.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳キーマスタかどうか
	 * @param value 定数値
	 * @return 定数値が自動仕訳キーマスタの値の場合true
	 */
	public static boolean isMAM_AUTO_JNL_KEY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AUTO_JNL_KEY.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳キーマスタかどうか
	 * @param type 属性値
	 * @return 属性値が自動仕訳キーマスタの値の場合true
	 */
	public static boolean isMAM_AUTO_JNL_KEY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AUTO_JNL_KEY.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳マスタかどうか
	 * @param value 定数値
	 * @return 定数値が自動仕訳マスタの値の場合true
	 */
	public static boolean isMAM_AUTO_JNL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AUTO_JNL.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳マスタかどうか
	 * @param type 属性値
	 * @return 属性値が自動仕訳マスタの値の場合true
	 */
	public static boolean isMAM_AUTO_JNL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AUTO_JNL.isSame(type);
	}

	/**
	 * マスタ名：手形理由マスタかどうか
	 * @param value 定数値
	 * @return 定数値が手形理由マスタの値の場合true
	 */
	public static boolean isMAM_NOTE_RSN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_NOTE_RSN.isSame(type);
	}

	/**
	 * マスタ名：手形理由マスタかどうか
	 * @param type 属性値
	 * @return 属性値が手形理由マスタの値の場合true
	 */
	public static boolean isMAM_NOTE_RSN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_NOTE_RSN.isSame(type);
	}

	/**
	 * マスタ名：集計項目対応マスタかどうか
	 * @param value 定数値
	 * @return 定数値が集計項目対応マスタの値の場合true
	 */
	public static boolean isMAM_COL_MAP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COL_MAP.isSame(type);
	}

	/**
	 * マスタ名：集計項目対応マスタかどうか
	 * @param type 属性値
	 * @return 属性値が集計項目対応マスタの値の場合true
	 */
	public static boolean isMAM_COL_MAP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COL_MAP.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳パタン基本マスタかどうか
	 * @param value 定数値
	 * @return 定数値が自動仕訳パタン基本マスタの値の場合true
	 */
	public static boolean isMAM_JNL_PTN_BASE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_PTN_BASE.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳パタン基本マスタかどうか
	 * @param type 属性値
	 * @return 属性値が自動仕訳パタン基本マスタの値の場合true
	 */
	public static boolean isMAM_JNL_PTN_BASE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_PTN_BASE.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が自動仕訳パタンマスタの値の場合true
	 */
	public static boolean isMAM_JNL_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_PTN.isSame(type);
	}

	/**
	 * マスタ名：自動仕訳パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が自動仕訳パタンマスタの値の場合true
	 */
	public static boolean isMAM_JNL_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_PTN.isSame(type);
	}

	/**
	 * マスタ名：仕訳グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が仕訳グループマスタの値の場合true
	 */
	public static boolean isMAM_JNL_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_GRP.isSame(type);
	}

	/**
	 * マスタ名：仕訳グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が仕訳グループマスタの値の場合true
	 */
	public static boolean isMAM_JNL_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目仕訳科目設定マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目仕訳科目設定マスタの値の場合true
	 */
	public static boolean isMAM_JNL_AC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_AC.isSame(type);
	}

	/**
	 * マスタ名：品目仕訳科目設定マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目仕訳科目設定マスタの値の場合true
	 */
	public static boolean isMAM_JNL_AC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_AC.isSame(type);
	}

	/**
	 * マスタ名：口座科目設定マスタかどうか
	 * @param value 定数値
	 * @return 定数値が口座科目設定マスタの値の場合true
	 */
	public static boolean isMAM_BAC_AC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BAC_AC.isSame(type);
	}

	/**
	 * マスタ名：口座科目設定マスタかどうか
	 * @param type 属性値
	 * @return 属性値が口座科目設定マスタの値の場合true
	 */
	public static boolean isMAM_BAC_AC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BAC_AC.isSame(type);
	}

	/**
	 * マスタ名：会計理由科目設定マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計理由科目設定マスタの値の場合true
	 */
	public static boolean isMAM_RSN_AC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RSN_AC.isSame(type);
	}

	/**
	 * マスタ名：会計理由科目設定マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計理由科目設定マスタの値の場合true
	 */
	public static boolean isMAM_RSN_AC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RSN_AC.isSame(type);
	}

	/**
	 * マスタ名：会計伝票区分仕訳マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計伝票区分仕訳マスタの値の場合true
	 */
	public static boolean isMAM_SLIP_JNL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLIP_JNL.isSame(type);
	}

	/**
	 * マスタ名：会計伝票区分仕訳マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計伝票区分仕訳マスタの値の場合true
	 */
	public static boolean isMAM_SLIP_JNL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLIP_JNL.isSame(type);
	}

	/**
	 * マスタ名：原価費目グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価費目グループマスタの値の場合true
	 */
	public static boolean isMAM_EXPNS_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EXPNS_GRP.isSame(type);
	}

	/**
	 * マスタ名：原価費目グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価費目グループマスタの値の場合true
	 */
	public static boolean isMAM_EXPNS_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EXPNS_GRP.isSame(type);
	}

	/**
	 * マスタ名：原価費目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価費目マスタの値の場合true
	 */
	public static boolean isMAM_EXPNS(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EXPNS.isSame(type);
	}

	/**
	 * マスタ名：原価費目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価費目マスタの値の場合true
	 */
	public static boolean isMAM_EXPNS(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EXPNS.isSame(type);
	}

	/**
	 * マスタ名：原価メニューマスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価メニューマスタの値の場合true
	 */
	public static boolean isMAM_COST_MENU(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_MENU.isSame(type);
	}

	/**
	 * マスタ名：原価メニューマスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価メニューマスタの値の場合true
	 */
	public static boolean isMAM_COST_MENU(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_MENU.isSame(type);
	}

	/**
	 * マスタ名：原価メニュー構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価メニュー構成マスタの値の場合true
	 */
	public static boolean isMAM_MENU_CONFIG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_MENU_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：原価メニュー構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価メニュー構成マスタの値の場合true
	 */
	public static boolean isMAM_MENU_CONFIG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_MENU_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：配賦科目グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦科目グループマスタの値の場合true
	 */
	public static boolean isMAM_ALC_AC_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ALC_AC_GRP.isSame(type);
	}

	/**
	 * マスタ名：配賦科目グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦科目グループマスタの値の場合true
	 */
	public static boolean isMAM_ALC_AC_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ALC_AC_GRP.isSame(type);
	}

	/**
	 * マスタ名：配賦科目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦科目マスタの値の場合true
	 */
	public static boolean isMAM_ALC_AC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ALC_AC.isSame(type);
	}

	/**
	 * マスタ名：配賦科目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦科目マスタの値の場合true
	 */
	public static boolean isMAM_ALC_AC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ALC_AC.isSame(type);
	}

	/**
	 * マスタ名：原価品群マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価品群マスタの値の場合true
	 */
	public static boolean isMAM_COST_CTG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_CTG.isSame(type);
	}

	/**
	 * マスタ名：原価品群マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価品群マスタの値の場合true
	 */
	public static boolean isMAM_COST_CTG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_CTG.isSame(type);
	}

	/**
	 * マスタ名：原価品群構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価品群構成マスタの値の場合true
	 */
	public static boolean isMAM_CTG_CONFIG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CTG_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：原価品群構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価品群構成マスタの値の場合true
	 */
	public static boolean isMAM_CTG_CONFIG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CTG_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：原価品群グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価品群グループマスタの値の場合true
	 */
	public static boolean isMAM_CTG_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CTG_GRP.isSame(type);
	}

	/**
	 * マスタ名：原価品群グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価品群グループマスタの値の場合true
	 */
	public static boolean isMAM_CTG_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CTG_GRP.isSame(type);
	}

	/**
	 * マスタ名：原価部門マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価部門マスタの値の場合true
	 */
	public static boolean isMAM_COST_DPT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_DPT.isSame(type);
	}

	/**
	 * マスタ名：原価部門マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価部門マスタの値の場合true
	 */
	public static boolean isMAM_COST_DPT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_DPT.isSame(type);
	}

	/**
	 * マスタ名：原価部門構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価部門構成マスタの値の場合true
	 */
	public static boolean isMAM_DPT_CONFIG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_DPT_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：原価部門構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価部門構成マスタの値の場合true
	 */
	public static boolean isMAM_DPT_CONFIG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_DPT_CONFIG.isSame(type);
	}

	/**
	 * マスタ名：外部システムマスタかどうか
	 * @param value 定数値
	 * @return 定数値が外部システムマスタの値の場合true
	 */
	public static boolean isMAM_EXT_SYS(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EXT_SYS.isSame(type);
	}

	/**
	 * マスタ名：外部システムマスタかどうか
	 * @param type 属性値
	 * @return 属性値が外部システムマスタの値の場合true
	 */
	public static boolean isMAM_EXT_SYS(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EXT_SYS.isSame(type);
	}

	/**
	 * マスタ名：ＩＦ通信ルールマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＩＦ通信ルールマスタの値の場合true
	 */
	public static boolean isMAM_IF_PROTOCOL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_IF_PROTOCOL.isSame(type);
	}

	/**
	 * マスタ名：ＩＦ通信ルールマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＩＦ通信ルールマスタの値の場合true
	 */
	public static boolean isMAM_IF_PROTOCOL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_IF_PROTOCOL.isSame(type);
	}

	/**
	 * マスタ名：ＩＦアダプタマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＩＦアダプタマスタの値の場合true
	 */
	public static boolean isMAM_IF_ADAPTER(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_IF_ADAPTER.isSame(type);
	}

	/**
	 * マスタ名：ＩＦアダプタマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＩＦアダプタマスタの値の場合true
	 */
	public static boolean isMAM_IF_ADAPTER(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_IF_ADAPTER.isSame(type);
	}

	/**
	 * マスタ名：ＨＴＴＰヘッダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＨＴＴＰヘッダマスタの値の場合true
	 */
	public static boolean isMAM_HTTP_HEADER(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_HTTP_HEADER.isSame(type);
	}

	/**
	 * マスタ名：ＨＴＴＰヘッダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＨＴＴＰヘッダマスタの値の場合true
	 */
	public static boolean isMAM_HTTP_HEADER(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_HTTP_HEADER.isSame(type);
	}

	/**
	 * マスタ名：外部システムユーザマスタかどうか
	 * @param value 定数値
	 * @return 定数値が外部システムユーザマスタの値の場合true
	 */
	public static boolean isMAM_EXT_SYS_USR(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EXT_SYS_USR.isSame(type);
	}

	/**
	 * マスタ名：外部システムユーザマスタかどうか
	 * @param type 属性値
	 * @return 属性値が外部システムユーザマスタの値の場合true
	 */
	public static boolean isMAM_EXT_SYS_USR(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EXT_SYS_USR.isSame(type);
	}

	/**
	 * マスタ名：ＩＦコードルールマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＩＦコードルールマスタの値の場合true
	 */
	public static boolean isMAM_IF_CD_RULE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_IF_CD_RULE.isSame(type);
	}

	/**
	 * マスタ名：ＩＦコードルールマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＩＦコードルールマスタの値の場合true
	 */
	public static boolean isMAM_IF_CD_RULE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_IF_CD_RULE.isSame(type);
	}

	/**
	 * マスタ名：ＩＦコード変換マスタかどうか
	 * @param value 定数値
	 * @return 定数値がＩＦコード変換マスタの値の場合true
	 */
	public static boolean isMAM_IF_X(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_IF_X.isSame(type);
	}

	/**
	 * マスタ名：ＩＦコード変換マスタかどうか
	 * @param type 属性値
	 * @return 属性値がＩＦコード変換マスタの値の場合true
	 */
	public static boolean isMAM_IF_X(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_IF_X.isSame(type);
	}

	/**
	 * マスタ名：承認役割マスタかどうか
	 * @param value 定数値
	 * @return 定数値が承認役割マスタの値の場合true
	 */
	public static boolean isMAM_APRV_ROLE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_APRV_ROLE.isSame(type);
	}

	/**
	 * マスタ名：承認役割マスタかどうか
	 * @param type 属性値
	 * @return 属性値が承認役割マスタの値の場合true
	 */
	public static boolean isMAM_APRV_ROLE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_APRV_ROLE.isSame(type);
	}

	/**
	 * マスタ名：国マスタかどうか
	 * @param value 定数値
	 * @return 定数値が国マスタの値の場合true
	 */
	public static boolean isMAM_CNTRY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CNTRY.isSame(type);
	}

	/**
	 * マスタ名：国マスタかどうか
	 * @param type 属性値
	 * @return 属性値が国マスタの値の場合true
	 */
	public static boolean isMAM_CNTRY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CNTRY.isSame(type);
	}

	/**
	 * マスタ名：地域マスタかどうか
	 * @param value 定数値
	 * @return 定数値が地域マスタの値の場合true
	 */
	public static boolean isMAM_AREA(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AREA.isSame(type);
	}

	/**
	 * マスタ名：地域マスタかどうか
	 * @param type 属性値
	 * @return 属性値が地域マスタの値の場合true
	 */
	public static boolean isMAM_AREA(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AREA.isSame(type);
	}

	/**
	 * マスタ名：通貨マスタかどうか
	 * @param value 定数値
	 * @return 定数値が通貨マスタの値の場合true
	 */
	public static boolean isMAM_CUR(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CUR.isSame(type);
	}

	/**
	 * マスタ名：通貨マスタかどうか
	 * @param type 属性値
	 * @return 属性値が通貨マスタの値の場合true
	 */
	public static boolean isMAM_CUR(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CUR.isSame(type);
	}

	/**
	 * マスタ名：単位マスタかどうか
	 * @param value 定数値
	 * @return 定数値が単位マスタの値の場合true
	 */
	public static boolean isMAM_UNIT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_UNIT.isSame(type);
	}

	/**
	 * マスタ名：単位マスタかどうか
	 * @param type 属性値
	 * @return 属性値が単位マスタの値の場合true
	 */
	public static boolean isMAM_UNIT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_UNIT.isSame(type);
	}

	/**
	 * マスタ名：銀行マスタかどうか
	 * @param value 定数値
	 * @return 定数値が銀行マスタの値の場合true
	 */
	public static boolean isMAM_BANK(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BANK.isSame(type);
	}

	/**
	 * マスタ名：銀行マスタかどうか
	 * @param type 属性値
	 * @return 属性値が銀行マスタの値の場合true
	 */
	public static boolean isMAM_BANK(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BANK.isSame(type);
	}

	/**
	 * マスタ名：銀行支店マスタかどうか
	 * @param value 定数値
	 * @return 定数値が銀行支店マスタの値の場合true
	 */
	public static boolean isMAM_BANK_BRANCH(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BANK_BRANCH.isSame(type);
	}

	/**
	 * マスタ名：銀行支店マスタかどうか
	 * @param type 属性値
	 * @return 属性値が銀行支店マスタの値の場合true
	 */
	public static boolean isMAM_BANK_BRANCH(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BANK_BRANCH.isSame(type);
	}

	/**
	 * マスタ名：口座マスタかどうか
	 * @param value 定数値
	 * @return 定数値が口座マスタの値の場合true
	 */
	public static boolean isMAM_BANK_AC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_BANK_AC.isSame(type);
	}

	/**
	 * マスタ名：口座マスタかどうか
	 * @param type 属性値
	 * @return 属性値が口座マスタの値の場合true
	 */
	public static boolean isMAM_BANK_AC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_BANK_AC.isSame(type);
	}

	/**
	 * マスタ名：為替レート基本マスタかどうか
	 * @param value 定数値
	 * @return 定数値が為替レート基本マスタの値の場合true
	 */
	public static boolean isMAM_XRATE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_XRATE.isSame(type);
	}

	/**
	 * マスタ名：為替レート基本マスタかどうか
	 * @param type 属性値
	 * @return 属性値が為替レート基本マスタの値の場合true
	 */
	public static boolean isMAM_XRATE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_XRATE.isSame(type);
	}

	/**
	 * マスタ名：品目仕訳マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目仕訳マスタの値の場合true
	 */
	public static boolean isMAM_ITM_JNL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_JNL.isSame(type);
	}

	/**
	 * マスタ名：品目仕訳マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目仕訳マスタの値の場合true
	 */
	public static boolean isMAM_ITM_JNL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_JNL.isSame(type);
	}

	/**
	 * マスタ名：会計品目分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計品目分類マスタの値の場合true
	 */
	public static boolean isMAM_AC_ITM_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：会計品目分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計品目分類マスタの値の場合true
	 */
	public static boolean isMAM_AC_ITM_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_ITM_GRP.isSame(type);
	}

	/**
	 * マスタ名：会計理由マスタかどうか
	 * @param value 定数値
	 * @return 定数値が会計理由マスタの値の場合true
	 */
	public static boolean isMAM_AC_RSN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_AC_RSN.isSame(type);
	}

	/**
	 * マスタ名：会計理由マスタかどうか
	 * @param type 属性値
	 * @return 属性値が会計理由マスタの値の場合true
	 */
	public static boolean isMAM_AC_RSN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_AC_RSN.isSame(type);
	}

	/**
	 * マスタ名：工場・物流倉庫マスタかどうか
	 * @param value 定数値
	 * @return 定数値が工場・物流倉庫マスタの値の場合true
	 */
	public static boolean isMAM_SITE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SITE.isSame(type);
	}

	/**
	 * マスタ名：工場・物流倉庫マスタかどうか
	 * @param type 属性値
	 * @return 属性値が工場・物流倉庫マスタの値の場合true
	 */
	public static boolean isMAM_SITE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SITE.isSame(type);
	}

	/**
	 * マスタ名：製造場所グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が製造場所グループマスタの値の場合true
	 */
	public static boolean isMAM_LOC_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_LOC_GRP.isSame(type);
	}

	/**
	 * マスタ名：製造場所グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が製造場所グループマスタの値の場合true
	 */
	public static boolean isMAM_LOC_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_LOC_GRP.isSame(type);
	}

	/**
	 * マスタ名：物流グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が物流グループマスタの値の場合true
	 */
	public static boolean isMAM_LG_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_LG_GRP.isSame(type);
	}

	/**
	 * マスタ名：物流グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が物流グループマスタの値の場合true
	 */
	public static boolean isMAM_LG_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_LG_GRP.isSame(type);
	}

	/**
	 * マスタ名：総量引当場所グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が総量引当場所グループマスタの値の場合true
	 */
	public static boolean isMAM_ALLOC_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ALLOC_GRP.isSame(type);
	}

	/**
	 * マスタ名：総量引当場所グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が総量引当場所グループマスタの値の場合true
	 */
	public static boolean isMAM_ALLOC_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ALLOC_GRP.isSame(type);
	}

	/**
	 * マスタ名：ワーキンググループマスタかどうか
	 * @param value 定数値
	 * @return 定数値がワーキンググループマスタの値の場合true
	 */
	public static boolean isMAM_WG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_WG.isSame(type);
	}

	/**
	 * マスタ名：ワーキンググループマスタかどうか
	 * @param type 属性値
	 * @return 属性値がワーキンググループマスタの値の場合true
	 */
	public static boolean isMAM_WG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_WG.isSame(type);
	}

	/**
	 * マスタ名：工程マスタかどうか
	 * @param value 定数値
	 * @return 定数値が工程マスタの値の場合true
	 */
	public static boolean isMAM_OPER(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_OPER.isSame(type);
	}

	/**
	 * マスタ名：工程マスタかどうか
	 * @param type 属性値
	 * @return 属性値が工程マスタの値の場合true
	 */
	public static boolean isMAM_OPER(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_OPER.isSame(type);
	}

	/**
	 * マスタ名：工数管理マスタかどうか
	 * @param value 定数値
	 * @return 定数値が工数管理マスタの値の場合true
	 */
	public static boolean isMAM_WK_COST(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_WK_COST.isSame(type);
	}

	/**
	 * マスタ名：工数管理マスタかどうか
	 * @param type 属性値
	 * @return 属性値が工数管理マスタの値の場合true
	 */
	public static boolean isMAM_WK_COST(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_WK_COST.isSame(type);
	}

	/**
	 * マスタ名：工数理由マスタかどうか
	 * @param value 定数値
	 * @return 定数値が工数理由マスタの値の場合true
	 */
	public static boolean isMAM_WK_RSN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_WK_RSN.isSame(type);
	}

	/**
	 * マスタ名：工数理由マスタかどうか
	 * @param type 属性値
	 * @return 属性値が工数理由マスタの値の場合true
	 */
	public static boolean isMAM_WK_RSN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_WK_RSN.isSame(type);
	}

	/**
	 * マスタ名：勤務種類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が勤務種類マスタの値の場合true
	 */
	public static boolean isMAM_WK_DAY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_WK_DAY.isSame(type);
	}

	/**
	 * マスタ名：勤務種類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が勤務種類マスタの値の場合true
	 */
	public static boolean isMAM_WK_DAY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_WK_DAY.isSame(type);
	}

	/**
	 * マスタ名：資源マスタかどうか
	 * @param value 定数値
	 * @return 定数値が資源マスタの値の場合true
	 */
	public static boolean isMAM_RSRC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RSRC.isSame(type);
	}

	/**
	 * マスタ名：資源マスタかどうか
	 * @param type 属性値
	 * @return 属性値が資源マスタの値の場合true
	 */
	public static boolean isMAM_RSRC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RSRC.isSame(type);
	}

	/**
	 * マスタ名：購買内示グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が購買内示グループマスタの値の場合true
	 */
	public static boolean isMAM_PF_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_PF_GRP.isSame(type);
	}

	/**
	 * マスタ名：購買内示グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が購買内示グループマスタの値の場合true
	 */
	public static boolean isMAM_PF_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_PF_GRP.isSame(type);
	}

	/**
	 * マスタ名：販売単価分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が販売単価分類マスタの値の場合true
	 */
	public static boolean isMAM_SLS_UPRI_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLS_UPRI_GRP.isSame(type);
	}

	/**
	 * マスタ名：販売単価分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が販売単価分類マスタの値の場合true
	 */
	public static boolean isMAM_SLS_UPRI_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLS_UPRI_GRP.isSame(type);
	}

	/**
	 * マスタ名：販売単価ランクマスタかどうか
	 * @param value 定数値
	 * @return 定数値が販売単価ランクマスタの値の場合true
	 */
	public static boolean isMAM_SLS_UPRI_RANK(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLS_UPRI_RANK.isSame(type);
	}

	/**
	 * マスタ名：販売単価ランクマスタかどうか
	 * @param type 属性値
	 * @return 属性値が販売単価ランクマスタの値の場合true
	 */
	public static boolean isMAM_SLS_UPRI_RANK(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLS_UPRI_RANK.isSame(type);
	}

	/**
	 * マスタ名：相殺グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が相殺グループマスタの値の場合true
	 */
	public static boolean isMAM_SETOFF_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SETOFF_GRP.isSame(type);
	}

	/**
	 * マスタ名：相殺グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が相殺グループマスタの値の場合true
	 */
	public static boolean isMAM_SETOFF_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SETOFF_GRP.isSame(type);
	}

	/**
	 * マスタ名：出荷有効期限グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が出荷有効期限グループマスタの値の場合true
	 */
	public static boolean isMAM_SHIP_VALID(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SHIP_VALID.isSame(type);
	}

	/**
	 * マスタ名：出荷有効期限グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が出荷有効期限グループマスタの値の場合true
	 */
	public static boolean isMAM_SHIP_VALID(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SHIP_VALID.isSame(type);
	}

	/**
	 * マスタ名：品目出荷グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目出荷グループマスタの値の場合true
	 */
	public static boolean isMAM_ITM_SHIP_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_SHIP_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目出荷グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目出荷グループマスタの値の場合true
	 */
	public static boolean isMAM_ITM_SHIP_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_SHIP_GRP.isSame(type);
	}

	/**
	 * マスタ名：輸送方法マスタかどうか
	 * @param value 定数値
	 * @return 定数値が輸送方法マスタの値の場合true
	 */
	public static boolean isMAM_TRNSPT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_TRNSPT.isSame(type);
	}

	/**
	 * マスタ名：輸送方法マスタかどうか
	 * @param type 属性値
	 * @return 属性値が輸送方法マスタの値の場合true
	 */
	public static boolean isMAM_TRNSPT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_TRNSPT.isSame(type);
	}

	/**
	 * マスタ名：出荷条件マスタかどうか
	 * @param value 定数値
	 * @return 定数値が出荷条件マスタの値の場合true
	 */
	public static boolean isMAM_SHIP_TERM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SHIP_TERM.isSame(type);
	}

	/**
	 * マスタ名：出荷条件マスタかどうか
	 * @param type 属性値
	 * @return 属性値が出荷条件マスタの値の場合true
	 */
	public static boolean isMAM_SHIP_TERM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SHIP_TERM.isSame(type);
	}

	/**
	 * マスタ名：出荷作業マスタかどうか
	 * @param value 定数値
	 * @return 定数値が出荷作業マスタの値の場合true
	 */
	public static boolean isMAM_SHIP_WK(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SHIP_WK.isSame(type);
	}

	/**
	 * マスタ名：出荷作業マスタかどうか
	 * @param type 属性値
	 * @return 属性値が出荷作業マスタの値の場合true
	 */
	public static boolean isMAM_SHIP_WK(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SHIP_WK.isSame(type);
	}

	/**
	 * マスタ名：輸出梱包容器マスタかどうか
	 * @param value 定数値
	 * @return 定数値が輸出梱包容器マスタの値の場合true
	 */
	public static boolean isMAM_EX_CNTNR(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EX_CNTNR.isSame(type);
	}

	/**
	 * マスタ名：輸出梱包容器マスタかどうか
	 * @param type 属性値
	 * @return 属性値が輸出梱包容器マスタの値の場合true
	 */
	public static boolean isMAM_EX_CNTNR(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EX_CNTNR.isSame(type);
	}

	/**
	 * マスタ名：港マスタかどうか
	 * @param value 定数値
	 * @return 定数値が港マスタの値の場合true
	 */
	public static boolean isMAM_EXIM_PORT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_EXIM_PORT.isSame(type);
	}

	/**
	 * マスタ名：港マスタかどうか
	 * @param type 属性値
	 * @return 属性値が港マスタの値の場合true
	 */
	public static boolean isMAM_EXIM_PORT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_EXIM_PORT.isSame(type);
	}

	/**
	 * マスタ名：格付マスタかどうか
	 * @param value 定数値
	 * @return 定数値が格付マスタの値の場合true
	 */
	public static boolean isMAM_STK_GD(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_STK_GD.isSame(type);
	}

	/**
	 * マスタ名：格付マスタかどうか
	 * @param type 属性値
	 * @return 属性値が格付マスタの値の場合true
	 */
	public static boolean isMAM_STK_GD(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_STK_GD.isSame(type);
	}

	/**
	 * マスタ名：取引マスタかどうか
	 * @param value 定数値
	 * @return 定数値が取引マスタの値の場合true
	 */
	public static boolean isMAM_TRD(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_TRD.isSame(type);
	}

	/**
	 * マスタ名：取引マスタかどうか
	 * @param type 属性値
	 * @return 属性値が取引マスタの値の場合true
	 */
	public static boolean isMAM_TRD(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_TRD.isSame(type);
	}

	/**
	 * マスタ名：伝票帳票マスタかどうか
	 * @param value 定数値
	 * @return 定数値が伝票帳票マスタの値の場合true
	 */
	public static boolean isMAM_SLIP_FORM(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SLIP_FORM.isSame(type);
	}

	/**
	 * マスタ名：伝票帳票マスタかどうか
	 * @param type 属性値
	 * @return 属性値が伝票帳票マスタの値の場合true
	 */
	public static boolean isMAM_SLIP_FORM(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SLIP_FORM.isSame(type);
	}

	/**
	 * マスタ名：品目仕様分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目仕様分類マスタの値の場合true
	 */
	public static boolean isMAM_ITM_SPEC_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_SPEC_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目仕様分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目仕様分類マスタの値の場合true
	 */
	public static boolean isMAM_ITM_SPEC_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_SPEC_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目構成グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が品目構成グループマスタの値の場合true
	 */
	public static boolean isMAM_ITM_COMP_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ITM_COMP_GRP.isSame(type);
	}

	/**
	 * マスタ名：品目構成グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が品目構成グループマスタの値の場合true
	 */
	public static boolean isMAM_ITM_COMP_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ITM_COMP_GRP.isSame(type);
	}

	/**
	 * マスタ名：仕訳実行マスタかどうか
	 * @param value 定数値
	 * @return 定数値が仕訳実行マスタの値の場合true
	 */
	public static boolean isMAM_JNL_ACT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_ACT.isSame(type);
	}

	/**
	 * マスタ名：仕訳実行マスタかどうか
	 * @param type 属性値
	 * @return 属性値が仕訳実行マスタの値の場合true
	 */
	public static boolean isMAM_JNL_ACT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_ACT.isSame(type);
	}

	/**
	 * マスタ名：配賦パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦パタンマスタの値の場合true
	 */
	public static boolean isMAM_ALC_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：配賦パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦パタンマスタの値の場合true
	 */
	public static boolean isMAM_ALC_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：計算実行パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が計算実行パタンマスタの値の場合true
	 */
	public static boolean isMAM_ACT_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ACT_PTN.isSame(type);
	}

	/**
	 * マスタ名：計算実行パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が計算実行パタンマスタの値の場合true
	 */
	public static boolean isMAM_ACT_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ACT_PTN.isSame(type);
	}

	/**
	 * マスタ名：汎用配賦分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦分類マスタの値の場合true
	 */
	public static boolean isMAM_GP_ALC(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_GP_ALC.isSame(type);
	}

	/**
	 * マスタ名：汎用配賦分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦分類マスタの値の場合true
	 */
	public static boolean isMAM_GP_ALC(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_GP_ALC.isSame(type);
	}

	/**
	 * マスタ名：計算カテゴリマスタかどうか
	 * @param value 定数値
	 * @return 定数値が計算カテゴリマスタの値の場合true
	 */
	public static boolean isMAM_CALC_CTG(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CALC_CTG.isSame(type);
	}

	/**
	 * マスタ名：計算カテゴリマスタかどうか
	 * @param type 属性値
	 * @return 属性値が計算カテゴリマスタの値の場合true
	 */
	public static boolean isMAM_CALC_CTG(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CALC_CTG.isSame(type);
	}

	/**
	 * マスタ名：原価レポートパタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポートパタンマスタの値の場合true
	 */
	public static boolean isMAM_RPT_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_PTN.isSame(type);
	}

	/**
	 * マスタ名：原価レポートパタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポートパタンマスタの値の場合true
	 */
	public static boolean isMAM_RPT_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_PTN.isSame(type);
	}

	/**
	 * マスタ名：計算パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が計算パタンマスタの値の場合true
	 */
	public static boolean isMAM_CALC_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：計算パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が計算パタンマスタの値の場合true
	 */
	public static boolean isMAM_CALC_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：原価売上分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタの値の場合true
	 */
	public static boolean isMAM_COST_SLS(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_SLS.isSame(type);
	}

	/**
	 * マスタ名：原価売上分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタの値の場合true
	 */
	public static boolean isMAM_COST_SLS(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_SLS.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価個別受払表マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_IO.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価個別受払表マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_IO.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価個別受払表構成マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO_CONF(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_IO_CONF.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価個別受払表構成マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO_CONF(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_IO_CONF.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表項目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価個別受払表項目マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO_COL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_COST_IO_COL.isSame(type);
	}

	/**
	 * マスタ名：原価個別受払表項目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価個別受払表項目マスタの値の場合true
	 */
	public static boolean isMAM_COST_IO_COL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_COST_IO_COL.isSame(type);
	}

	/**
	 * マスタ名：原価レポートキーマスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポートキーマスタの値の場合true
	 */
	public static boolean isMAM_RPT_KEY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_KEY.isSame(type);
	}

	/**
	 * マスタ名：原価レポートキーマスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポートキーマスタの値の場合true
	 */
	public static boolean isMAM_RPT_KEY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_KEY.isSame(type);
	}

	/**
	 * マスタ名：原価レポート構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポート構成マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CONF(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_CONF.isSame(type);
	}

	/**
	 * マスタ名：原価レポート構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポート構成マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CONF(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_CONF.isSame(type);
	}

	/**
	 * マスタ名：原価レポート行集計マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポート行集計マスタの値の場合true
	 */
	public static boolean isMAM_RPT_ROW_SML(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_ROW_SML.isSame(type);
	}

	/**
	 * マスタ名：原価レポート行集計マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポート行集計マスタの値の場合true
	 */
	public static boolean isMAM_RPT_ROW_SML(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_ROW_SML.isSame(type);
	}

	/**
	 * マスタ名：一次配賦パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦パタンマスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_PRE_ALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：一次配賦パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦パタンマスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_PRE_ALC_PTN.isSame(type);
	}

	/**
	 * マスタ名：検査パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が検査パタンマスタの値の場合true
	 */
	public static boolean isMAM_INSP_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_INSP_PTN.isSame(type);
	}

	/**
	 * マスタ名：検査パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が検査パタンマスタの値の場合true
	 */
	public static boolean isMAM_INSP_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_INSP_PTN.isSame(type);
	}

	/**
	 * マスタ名：検査項目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が検査項目マスタの値の場合true
	 */
	public static boolean isMAM_INSP_POINT(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_INSP_POINT.isSame(type);
	}

	/**
	 * マスタ名：検査項目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が検査項目マスタの値の場合true
	 */
	public static boolean isMAM_INSP_POINT(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_INSP_POINT.isSame(type);
	}

	/**
	 * マスタ名：出荷作業グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が出荷作業グループマスタの値の場合true
	 */
	public static boolean isMAM_SHIP_WK_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SHIP_WK_GRP.isSame(type);
	}

	/**
	 * マスタ名：出荷作業グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が出荷作業グループマスタの値の場合true
	 */
	public static boolean isMAM_SHIP_WK_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SHIP_WK_GRP.isSame(type);
	}

	/**
	 * マスタ名：品揃グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が品揃グループマスタの値の場合true
	 */
	public static boolean isMAM_SET_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SET_GRP.isSame(type);
	}

	/**
	 * マスタ名：品揃グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が品揃グループマスタの値の場合true
	 */
	public static boolean isMAM_SET_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SET_GRP.isSame(type);
	}

	/**
	 * マスタ名：ＭＰＳグループマスタかどうか
	 * @param value 定数値
	 * @return 定数値がＭＰＳグループマスタの値の場合true
	 */
	public static boolean isMAM_MPS_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_MPS_GRP.isSame(type);
	}

	/**
	 * マスタ名：ＭＰＳグループマスタかどうか
	 * @param type 属性値
	 * @return 属性値がＭＰＳグループマスタの値の場合true
	 */
	public static boolean isMAM_MPS_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_MPS_GRP.isSame(type);
	}

	/**
	 * マスタ名：計算グループマスタかどうか
	 * @param value 定数値
	 * @return 定数値が計算グループマスタの値の場合true
	 */
	public static boolean isMAM_CALC_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_CALC_GRP.isSame(type);
	}

	/**
	 * マスタ名：計算グループマスタかどうか
	 * @param type 属性値
	 * @return 属性値が計算グループマスタの値の場合true
	 */
	public static boolean isMAM_CALC_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_CALC_GRP.isSame(type);
	}

	/**
	 * マスタ名：配賦係数マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦係数マスタの値の場合true
	 */
	public static boolean isMAM_ALC_COEF(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_ALC_COEF.isSame(type);
	}

	/**
	 * マスタ名：配賦係数マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦係数マスタの値の場合true
	 */
	public static boolean isMAM_ALC_COEF(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_ALC_COEF.isSame(type);
	}

	/**
	 * マスタ名：原価レポート比較マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポート比較マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CMP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_CMP.isSame(type);
	}

	/**
	 * マスタ名：原価レポート比較マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポート比較マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CMP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_CMP.isSame(type);
	}

	/**
	 * マスタ名：原価レポート比較構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価レポート比較構成マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CMP_CONF(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_RPT_CMP_CONF.isSame(type);
	}

	/**
	 * マスタ名：原価レポート比較構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価レポート比較構成マスタの値の場合true
	 */
	public static boolean isMAM_RPT_CMP_CONF(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_RPT_CMP_CONF.isSame(type);
	}

	/**
	 * マスタ名：在庫評価マスタかどうか
	 * @param value 定数値
	 * @return 定数値が在庫評価マスタの値の場合true
	 */
	public static boolean isMAM_STK_EVAL(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_STK_EVAL.isSame(type);
	}

	/**
	 * マスタ名：在庫評価マスタかどうか
	 * @param type 属性値
	 * @return 属性値が在庫評価マスタの値の場合true
	 */
	public static boolean isMAM_STK_EVAL(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_STK_EVAL.isSame(type);
	}

	/**
	 * マスタ名：一次配賦基準マスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦基準マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_RATE(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_PRE_ALC_RATE.isSame(type);
	}

	/**
	 * マスタ名：一次配賦基準マスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦基準マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_RATE(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_PRE_ALC_RATE.isSame(type);
	}

	/**
	 * マスタ名：発番パタンマスタかどうか
	 * @param value 定数値
	 * @return 定数値が発番パタンマスタの値の場合true
	 */
	public static boolean isMAM_NUM_PTN(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_NUM_PTN.isSame(type);
	}

	/**
	 * マスタ名：発番パタンマスタかどうか
	 * @param type 属性値
	 * @return 属性値が発番パタンマスタの値の場合true
	 */
	public static boolean isMAM_NUM_PTN(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_NUM_PTN.isSame(type);
	}

	/**
	 * マスタ名：汎用分類マスタかどうか
	 * @param value 定数値
	 * @return 定数値が汎用分類マスタの値の場合true
	 */
	public static boolean isMAM_GP_GRP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_GP_GRP.isSame(type);
	}

	/**
	 * マスタ名：汎用分類マスタかどうか
	 * @param type 属性値
	 * @return 属性値が汎用分類マスタの値の場合true
	 */
	public static boolean isMAM_GP_GRP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_GP_GRP.isSame(type);
	}

	/**
	 * マスタ名：汎用マスタかどうか
	 * @param value 定数値
	 * @return 定数値が汎用マスタの値の場合true
	 */
	public static boolean isMAM_GP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_GP.isSame(type);
	}

	/**
	 * マスタ名：汎用マスタかどうか
	 * @param type 属性値
	 * @return 属性値が汎用マスタの値の場合true
	 */
	public static boolean isMAM_GP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_GP.isSame(type);
	}

	/**
	 * マスタ名：仕訳キー対応マスタかどうか
	 * @param value 定数値
	 * @return 定数値が仕訳キー対応マスタの値の場合true
	 */
	public static boolean isMAM_JNL_KEY_MAP(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_JNL_KEY_MAP.isSame(type);
	}

	/**
	 * マスタ名：仕訳キー対応マスタかどうか
	 * @param type 属性値
	 * @return 属性値が仕訳キー対応マスタの値の場合true
	 */
	public static boolean isMAM_JNL_KEY_MAP(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_JNL_KEY_MAP.isSame(type);
	}

	/**
	 * マスタ名：倉庫事業者マスタかどうか
	 * @param value 定数値
	 * @return 定数値が倉庫事業者マスタの値の場合true
	 */
	public static boolean isMAM_SITE_CO(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SITE_CO.isSame(type);
	}

	/**
	 * マスタ名：倉庫事業者マスタかどうか
	 * @param type 属性値
	 * @return 属性値が倉庫事業者マスタの値の場合true
	 */
	public static boolean isMAM_SITE_CO(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SITE_CO.isSame(type);
	}

	/**
	 * マスタ名：支払依頼科目マスタかどうか
	 * @param value 定数値
	 * @return 定数値が支払依頼科目マスタの値の場合true
	 */
	public static boolean isMAM_SCHD_PAY(String value) {
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
		return MAC_MST_NM.MAM_SCHD_PAY.isSame(type);
	}

	/**
	 * マスタ名：支払依頼科目マスタかどうか
	 * @param type 属性値
	 * @return 属性値が支払依頼科目マスタの値の場合true
	 */
	public static boolean isMAM_SCHD_PAY(MAC_MST_NM type) {
		return MAC_MST_NM.MAM_SCHD_PAY.isSame(type);
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
			MAC_MST_NM.putName(r, valueColumn, nameColumn);
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
		MAC_MST_NM type = MAC_MST_NM.get(value);
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
			MAC_MST_NM.putNameNE(r, valueColumn, nameColumn);
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
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
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
			MAC_MST_NM.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_MST_NM type = MAC_MST_NM.get(value);
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
			MAC_MST_NM.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
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
			MAC_MST_NM.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_MST_NM type = MAC_MST_NM.get(value);
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
			MAC_MST_NM.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
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
			MAC_MST_NM.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_MST_NM type = MAC_MST_NM.get(value);
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
			MAC_MST_NM.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_MST_NM type = MAC_MST_NM.getNE(value);
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
