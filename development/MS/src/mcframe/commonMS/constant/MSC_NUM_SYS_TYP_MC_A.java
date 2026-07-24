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
abstract class MSC_NUM_SYS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "NUM_SYS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_NUM_SYS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "num_sys_typ";

	public static final String $NAME = "num_sys_typ_nm";

	public static final String $LENGTH = "length";

	public static final String $PREFIX = "prefix";

	/*
	 * 定数の定義です。
	 */
	/** 発番システム区分：需要ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DMND = create("MSS_DMND", "DMND", new MCNumber(15), null);

	/** 発番システム区分：日次需要ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLYDMND = create("MSS_DLYDMND", "DLYDMND", new MCNumber(15), "J");

	/** 発番システム区分：日次供給ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLYSD = create("MSS_DLYSD", "DLYSD", new MCNumber(15), "K");

	/** 発番システム区分：ＷＧ間依頼ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP WGRQST = create("MSS_WGRQST", "WGRQST", new MCNumber(15), null);

	/** 発番システム区分：ＷＧ間依頼回答
	 */
	public static final MSC_NUM_SYS_TYP WGRQSTPRMS = create("MSS_WGRQSTPRMS", "WGRQSTPRMS", new MCNumber(15), null);

	/** 発番システム区分：工程指図ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP OPRINST = create("MSS_OPRINST", "OPRINST", new MCNumber(15), null);

	/** 発番システム区分：工程実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP OPRACT = create("MSS_OPRACT", "OPRACT", new MCNumber(15), null);

	/** 発番システム区分：出来高予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP YLDSCHD = create("MSS_YLDSCHD", "YLDSCHD", new MCNumber(15), null);

	/** 発番システム区分：出来高実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP YLDACT = create("MSS_YLDACT", "YLDACT", new MCNumber(15), null);

	/** 発番システム区分：投入予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTSCHD = create("MSS_INPTSCHD", "INPTSCHD", new MCNumber(15), null);

	/** 発番システム区分：投入引当状況ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTALLOC = create("MSS_INPTALLOC", "INPTALLOC", new MCNumber(15), null);

	/** 発番システム区分：投入実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTACT = create("MSS_INPTACT", "INPTACT", new MCNumber(15), null);

	/** 発番システム区分：ロス実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP LOSSACT = create("MSS_LOSSACT", "LOSSACT", new MCNumber(15), null);

	/** 発番システム区分：工数予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP WKSCHD = create("MSS_WKSCHD", "WKSCHD", new MCNumber(15), null);

	/** 発番システム区分：工数実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP WKACT = create("MSS_WKACT", "WKACT", new MCNumber(15), null);

	/** 発番システム区分：所要ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RQMT = create("MSS_RQMT", "RQMT", new MCNumber(15), "N");

	/** 発番システム区分：先行手配所要ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PRQMT = create("MSS_PRQMT", "PRQMT", new MCNumber(15), "P");

	/** 発番システム区分：シミュレーション用所要ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SIMRQMT = create("MSS_SIMRQMT", "SIMRQMT", new MCNumber(15), "S");

	/** 発番システム区分：品目オーダＮＯ（マニュアル追加）
	 */
	public static final MSC_NUM_SYS_TYP IORD = create("MSS_IORD", "IORD", new MCNumber(15), "G");

	/** 発番システム区分：工程オーダＮＯ（マニュアル追加）
	 */
	public static final MSC_NUM_SYS_TYP PORD = create("MSS_PORD", "PORD", new MCNumber(15), "G");

	/** 発番システム区分：顧客期間内示明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP CSTFRCSTD = create("MSS_CSTFRCSTD", "CSTFRCSTD", new MCNumber(15), null);

	/** 発番システム区分：顧客期間内示レコードＮＯ
	 */
	public static final MSC_NUM_SYS_TYP CSTFRCSTR = create("MSS_CSTFRCSTR", "CSTFRCSTR", new MCNumber(15), null);

	/** 発番システム区分：受払予定伝票ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLIPSCHD = create("MSS_SLIPSCHD", "SLIPSCHD", new MCNumber(15), null);

	/** 発番システム区分：オーダ受払予定伝票ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP OSLIPSCHD = create("MSS_OSLIPSCHD", "OSLIPSCHD", new MCNumber(15), null);

	/** 発番システム区分：受払進捗管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IOSCHDPR = create("MSS_IOSCHDPR", "IOSCHDPR", new MCNumber(15), null);

	/** 発番システム区分：検査規格実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPSA = create("MSS_INSPSA", "INSPSA", new MCNumber(15), null);

	/** 発番システム区分：検査規格指図ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPSI = create("MSS_INSPSI", "INSPSI", new MCNumber(15), null);

	/** 発番システム区分：検査予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPS = create("MSS_INSPS", "INSPS", new MCNumber(15), null);

	/** 発番システム区分：検査実績ヘッダＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPAH = create("MSS_INSPAH", "INSPAH", new MCNumber(15), null);

	/** 発番システム区分：検査着手明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPSD = create("MSS_INSPSD", "INSPSD", new MCNumber(15), null);

	/** 発番システム区分：検査実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPAD = create("MSS_INSPAD", "INSPAD", new MCNumber(15), null);

	/** 発番システム区分：検査判定明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPJD = create("MSS_INSPJD", "INSPJD", new MCNumber(15), null);

	/** 発番システム区分：検査抜取実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPSM = create("MSS_INSPSM", "INSPSM", new MCNumber(15), null);

	/** 発番システム区分：工場出荷承認ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PLNTAPRV = create("MSS_PLNTAPRV", "PLNTAPRV", new MCNumber(15), null);

	/** 発番システム区分：工場出荷承認明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PLNTAPRVD = create("MSS_PLNTAPRVD", "PLNTAPRVD", new MCNumber(15), null);

	/** 発番システム区分：市場出荷判定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP MRKTJUDG = create("MSS_MRKTJUDG", "MRKTJUDG", new MCNumber(15), null);

	/** 発番システム区分：市場出荷判定明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP MRKTJUDGD = create("MSS_MRKTJUDGD", "MRKTJUDGD", new MCNumber(15), null);

	/** 発番システム区分：ロットシーケンス
	 */
	public static final MSC_NUM_SYS_TYP LOTSEQ = create("MSS_LOTSEQ", "LOTSEQ", new MCNumber(15), null);

	/** 発番システム区分：見積明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP QTND = create("MSS_QTND", "QTND", new MCNumber(15), null);

	/** 発番システム区分：見積品目構成ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP QTNITMCOMP = create("MSS_QTNITMCOMP", "QTNITMCOMP", new MCNumber(15), null);

	/** 発番システム区分：受注品目構成ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLOITMCOMP = create("MSS_SLOITMCOMP", "SLOITMCOMP", new MCNumber(15), null);

	/** 発番システム区分：販売品目ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSITM = create("MSS_SLSITM", "SLSITM", new MCNumber(15), null);

	/** 発番システム区分：販売品目構成ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSITMCOMP = create("MSS_SLSITMCOMP", "SLSITMCOMP", new MCNumber(15), null);

	/** 発番システム区分：販売品目仕様ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSITMSPEC = create("MSS_SLSITMSPEC", "SLSITMSPEC", new MCNumber(15), null);

	/** 発番システム区分：販売品目仕様項目ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SPECDESC = create("MSS_SPECDESC", "SPECDESC", new MCNumber(15), null);

	/** 発番システム区分：販売品目構成仕様項目ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP COMPSPECDESC = create("MSS_COMPSPECDESC", "COMPSPECDESC", new MCNumber(15), null);

	/** 発番システム区分：売上予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSSCHD = create("MSS_SLSSCHD", "SLSSCHD", new MCNumber(15), null);

	/** 発番システム区分：納入指示受領ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLVINSTRCPT = create("MSS_DLVINSTRCPT", "DLVINSTRCPT", new MCNumber(15), null);

	/** 発番システム区分：受注状況ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLOSTS = create("MSS_SLOSTS", "SLOSTS", new MCNumber(15), null);

	/** 発番システム区分：売上返品予定明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSRETSCHDD = create("MSS_SLSRETSCHDD", "SLSRETSCHDD", new MCNumber(15), null);

	/** 発番システム区分：売上実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSACTD = create("MSS_SLSACTD", "SLSACTD", new MCNumber(15), null);

	/** 発番システム区分：売上実績受払ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLSACTIO = create("MSS_SLSACTIO", "SLSACTIO", new MCNumber(15), null);

	/** 発番システム区分：売掛消込実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARAPPLACT = create("MSS_ARAPPLACT", "ARAPPLACT", new MCNumber(15), null);

	/** 発番システム区分：売掛消込予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARAPPLSCHD = create("MSS_ARAPPLSCHD", "ARAPPLSCHD", new MCNumber(15), null);

	/** 発番システム区分：売掛別請求ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLACST = create("MSS_BILLACST", "BILLACST", new MCNumber(15), null);

	/** 発番システム区分：請求明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLD = create("MSS_BILLD", "BILLD", new MCNumber(15), null);

	/** 発番システム区分：請求管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLMNG = create("MSS_BILLMNG", "BILLMNG", new MCNumber(15), null);

	/** 発番システム区分：手形管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP NOTEMNG = create("MSS_NOTEMNG", "NOTEMNG", new MCNumber(15), null);

	/** 発番システム区分：入金実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCVACTD = create("MSS_RCVACTD", "RCVACTD", new MCNumber(15), null);

	/** 発番システム区分：入金予定消込実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCVSCHDAPPLACT = create("MSS_RCVSCHDAPPLACT", "RCVSCHDAPPLACT", new MCNumber(15), null);

	/** 発番システム区分：入金予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCVSCHD = create("MSS_RCVSCHD", "RCVSCHD", new MCNumber(15), null);

	/** 発番システム区分：債権為替レート評価替履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARXRATEREVHIS = create("MSS_ARXRATEREVHIS", "ARXRATEREVHIS", new MCNumber(15), null);

	/** 発番システム区分：手形情報ＩＦＮＯ
	 */
	public static final MSC_NUM_SYS_TYP NOTEIF = create("MSS_NOTEIF", "NOTEIF", new MCNumber(15), null);

	/** 発番システム区分：入金実績ＩＦＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCVACTIF = create("MSS_RCVACTIF", "RCVACTIF", new MCNumber(15), null);

	/** 発番システム区分：販売計画構成ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SPLNFMT = create("MSS_SPLNFMT", "SPLNFMT", new MCNumber(15), null);

	/** 発番システム区分：購買内示ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCFCST = create("MSS_PURCFCST", "PURCFCST", new MCNumber(15), null);

	/** 発番システム区分：購買内示確定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCFCSTFIX = create("MSS_PURCFCSTFIX", "PURCFCSTFIX", new MCNumber(15), null);

	/** 発番システム区分：購買内示明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCFCSTD = create("MSS_PURCFCSTD", "PURCFCSTD", new MCNumber(15), null);

	/** 発番システム区分：発注予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP POSCHD = create("MSS_POSCHD", "POSCHD", new MCNumber(15), null);

	/** 発番システム区分：仕入予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCSCHD = create("MSS_PURCSCHD", "PURCSCHD", new MCNumber(15), null);

	/** 発番システム区分：受領インボイス管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCPTIVMNG = create("MSS_RCPTIVMNG", "RCPTIVMNG", new MCNumber(15), null);

	/** 発番システム区分：受領インボイス明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCPTIVD = create("MSS_RCPTIVD", "RCPTIVD", new MCNumber(15), null);

	/** 発番システム区分：仕入返品予定明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCRETSCHDD = create("MSS_PURCRETSCHDD", "PURCRETSCHDD", new MCNumber(15), null);

	/** 発番システム区分：仕入返品予定受払ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCRETSCHDIO = create("MSS_PURCRETSCHDIO", "PURCRETSCHDIO", new MCNumber(15), null);

	/** 発番システム区分：仕入返品実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCRETACTD = create("MSS_PURCRETACTD", "PURCRETACTD", new MCNumber(15), null);

	/** 発番システム区分：仕入返品実績受払ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCRETACTIO = create("MSS_PURCRETACTIO", "PURCRETACTIO", new MCNumber(15), null);

	/** 発番システム区分：仕入実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCACTD = create("MSS_PURCACTD", "PURCACTD", new MCNumber(15), null);

	/** 発番システム区分：仕入実績受払ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCACTIO = create("MSS_PURCACTIO", "PURCACTIO", new MCNumber(15), null);

	/** 発番システム区分：納期回答受領ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PRMSRCPT = create("MSS_PRMSRCPT", "PRMSRCPT", new MCNumber(15), null);

	/** 発番システム区分：納期回答受領明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PRMSRCPTD = create("MSS_PRMSRCPTD", "PRMSRCPTD", new MCNumber(15), null);

	/** 発番システム区分：移動引当状況ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP XFRALOCS = create("MSS_XFRALOCS", "XFRALOCS", new MCNumber(15), null);

	/** 発番システム区分：移動実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP XFRACTD = create("MSS_XFRACTD", "XFRACTD", new MCNumber(15), null);

	/** 発番システム区分：支給予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PROVSCHD = create("MSS_PROVSCHD", "PROVSCHD", new MCNumber(15), null);

	/** 発番システム区分：他勘定振替指図明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ACXINSTD = create("MSS_ACXINSTD", "ACXINSTD", new MCNumber(15), null);

	/** 発番システム区分：他勘定振替実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ACXACTD = create("MSS_ACXACTD", "ACXACTD", new MCNumber(15), null);

	/** 発番システム区分：入荷進捗ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARRPRNO = create("MSS_ARRPR", "ARRPRNO", new MCNumber(15), null);

	/** 発番システム区分：入荷予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARRSCHD = create("MSS_ARRSCHD", "ARRSCHD", new MCNumber(15), null);

	/** 発番システム区分：出荷進捗ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPPR = create("MSS_SHIPPR", "SHIPPR", new MCNumber(15), null);

	/** 発番システム区分：出荷予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPSCHD = create("MSS_SHIPSCHD", "SHIPSCHD", new MCNumber(15), null);

	/** 発番システム区分：出荷引当状況ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPALOCS = create("MSS_SHIPALOCS", "SHIPALOCS", new MCNumber(15), null);

	/** 発番システム区分：出荷実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHACTD = create("MSS_SHACTD", "SHACTD", new MCNumber(15), null);

	/** 発番システム区分：インボイス出荷実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IVSHACTD = create("MSS_IVSHACTD", "IVSHACTD", new MCNumber(15), null);

	/** 発番システム区分：インボイス明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IVD = create("MSS_IVD", "IVD", new MCNumber(15), null);

	/** 発番システム区分：パッキングリスト明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PLD = create("MSS_PLD", "PLD", new MCNumber(15), null);

	/** 発番システム区分：在庫振替実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SXFRACTD = create("MSS_SXFRACTD", "SXFRACTD", new MCNumber(15), null);

	/** 発番システム区分：伝票ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLIP = create("MSS_SLIP", "SLIP", new MCNumber(15), null);

	/** 発番システム区分：引当順ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ALLOC_PRIO = create("MSS_ALLOC_PRIO", "ALLOC_PRIO", new MCNumber(15), null);

	/** 発番システム区分：インボイス管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IVMNG = create("MSS_IVMNG", "IVMNG", new MCNumber(15), null);

	/** 発番システム区分：納品書明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLVSLIPD = create("MSS_DLVSLIPD", "DLVSLIPD", new MCNumber(15), null);

	/** 発番システム区分：棚卸実績ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP STKTKACT = create("MSS_STKTKACT", "STKTKACT", new MCNumber(15), null);

	/** 発番システム区分：投入品不足情報ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTSTKRPL = create("MSS_INPTSTKRPL", "INPTSTKRPL", new MCNumber(15), null);

	/** 発番システム区分：代替グループＩＤ
	 */
	public static final MSC_NUM_SYS_TYP ALTGRPID = create("MSS_ALTGRPID", "ALTGRPID", new MCNumber(15), null);

	/** 発番システム区分：内示書ＩＤ
	 */
	public static final MSC_NUM_SYS_TYP PFRPTID = create("MSS_PFRPTID", "PFRPTID", new MCNumber(15), null);

	/** 発番システム区分：出荷品不足情報ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPSTKRPL = create("MSS_SHIPSTKRPL", "SHIPSTKRPL", new MCNumber(15), null);

	/** 発番システム区分：出荷指図送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPINSTSENDIF = create("MSS_SHIPINSTSENDIF", "SHIPINSTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：出荷実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPACTRECVIF = create("MSS_SHIPACTRECVIF", "SHIPACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：入荷予定送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARRSCHDSENDIF = create("MSS_ARRSCHDSENDIF", "ARRSCHDSENDIF", new MCNumber(15), null);

	/** 発番システム区分：入荷実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARRACTRECVIF = create("MSS_ARRACTRECVIF", "ARRACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：移動指図送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP XFRINSTSENDIF = create("MSS_XFRINSTSENDIF", "XFRINSTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：移動実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP XFRACTRECVIF = create("MSS_XFRACTRECVIF", "XFRACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：発注送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP POSENDIF = create("MSS_POSENDIF", "POSENDIF", new MCNumber(15), null);

	/** 発番システム区分：受注受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLORECVIF = create("MSS_SLORECVIF", "SLORECVIF", new MCNumber(15), null);

	/** 発番システム区分：入金受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP RCVRECVIF = create("MSS_RCVRECVIF", "RCVRECVIF", new MCNumber(15), null);

	/** 発番システム区分：納期回答受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP POPRMSRECVIF = create("MSS_POPRMSRECVIF", "POPRMSRECVIF", new MCNumber(15), null);

	/** 発番システム区分：納期回答送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SLOPRMSSENDIF = create("MSS_SLOPRMSSENDIF", "SLOPRMSSENDIF", new MCNumber(15), null);

	/** 発番システム区分：EDI出荷実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP EDISHIPACTRECVIF = create("MSS_EDISHIPACTRECVIF", "EDISHIPACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：EDI出荷実績送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP EDISHIPACTSENDIF = create("MSS_EDISHIPACTSENDIF", "EDISHIPACTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：出来高予定送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP YIELDSCHDSENDIF = create("MSS_YIELDSCHDSENDIF", "YIELDSCHDSENDIF", new MCNumber(15), null);

	/** 発番システム区分：出来高実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP YIELDACTRECVIF = create("MSS_YIELDACTRECVIF", "YIELDACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：工程指図送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP OPERINSTSENDIF = create("MSS_OPERINSTSENDIF", "OPERINSTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：工程実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP OPERACTRECVIF = create("MSS_OPERACTRECVIF", "OPERACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：投入予定送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTSCHDSENDIF = create("MSS_INPTSCHDSENDIF", "INPTSCHDSENDIF", new MCNumber(15), null);

	/** 発番システム区分：投入実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INPTACTRECVIF = create("MSS_INPTACTRECVIF", "INPTACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：工数予定送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP WKSCHDSENDIF = create("MSS_WKSCHDSENDIF", "WKSCHDSENDIF", new MCNumber(15), null);

	/** 発番システム区分：工数実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP WKACTRECVIF = create("MSS_WKACTRECVIF", "WKACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：他勘定振替実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ACXFRACTRECVIF = create("MSS_ACXFRACTRECVIF", "ACXFRACTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：検収送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ACCPTSENDIF = create("MSS_ACCPTSENDIF", "ACCPTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：検収受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ACCPTRECVIF = create("MSS_ACCPTRECVIF", "ACCPTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：発注受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PORECVIF = create("MSS_PORECVIF", "PORECVIF", new MCNumber(15), null);

	/** 発番システム区分：買掛明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP APD = create("MSS_APD", "APD", new MCNumber(15), null);

	/** 発番システム区分：支払照合管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYCHKMNG = create("MSS_PAYCHKMNG", "PAYCHKMNG", new MCNumber(15), null);

	/** 発番システム区分：支払予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYSCHD = create("MSS_PAYSCHD", "PAYSCHD", new MCNumber(15), null);

	/** 発番システム区分：買掛消込予定ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP APAPPLSCHD = create("MSS_APAPPLSCHD", "APAPPLSCHD", new MCNumber(15), null);

	/** 発番システム区分：支払予定ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYSCHDIF = create("MSS_PAYSCHDIF", "PAYSCHDIF", new MCNumber(15), null);

	/** 発番システム区分：支払実績ＩＦＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYACTIF = create("MSS_PAYACTIF", "PAYACTIF", new MCNumber(15), null);

	/** 発番システム区分：支払手形管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYNOTEMNG = create("MSS_PAYNOTEMNG", "PAYNOTEMNG", new MCNumber(15), null);

	/** 発番システム区分：支払実績明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYACTD = create("MSS_PAYACTD", "PAYACTD", new MCNumber(15), null);

	/** 発番システム区分：債務為替レート評価替履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP APXRATEREVHIS = create("MSS_APXRATEREVHIS", "APXRATEREVHIS", new MCNumber(15), null);

	/** 発番システム区分：受払予定送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IOSCHDIF = create("MSS_IOSCHDIF", "IOSCHDIF", new MCNumber(15), null);

	/** 発番システム区分：月末在庫送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP MLYSTKIF = create("MSS_MLYSTKIF", "MLYSTKIF", new MCNumber(15), null);

	/** 発番システム区分：受払実績送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP IOACTIF = create("MSS_IOACTIF", "IOACTIF", new MCNumber(15), null);

	/** 発番システム区分：品目オーダ情報送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ITMORDERIF = create("MSS_ITMORDERIF", "ITMORDERIF", new MCNumber(15), null);

	/** 発番システム区分：出荷進捗送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP SHIPPRIF = create("MSS_SHIPPRIF", "SHIPPRIF", new MCNumber(15), null);

	/** 発番システム区分：滞留在庫情報送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP NONMOVSTKIF = create("MSS_NONMOVSTKIF", "NONMOVSTKIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDRECVIF = create("MSS_ORDRECVIF", "ORDRECVIF", new MCNumber(15), null);

	/** 発番システム区分：入荷進捗送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ARRPRIF = create("MSS_ARRPRIF", "ARRPRIF", new MCNumber(15), null);

	/** 発番システム区分：検査実績送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPACTIF = create("MSS_INSPACTIF", "INSPACTIF", new MCNumber(15), null);

	/** 発番システム区分：納入指示ＧＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLVINSTG = create("MSS_DLVINSTG", "DLVINSTG", new MCNumber(15), null);

	/** 発番システム区分：納期回答受領ＧＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PRMSRCPTG = create("MSS_PRMSRCPTG", "PRMSRCPTG", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSEND = create("MSS_ORDERSENDIF", "ORDERSEND", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用品目マスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDITMIF = create("MSS_ORDERSENDITMIF", "ORDERSENDITMIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用品目工程マスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDITMOPERIF = create("MSS_ORDERSENDITMOPERIF", "ORDERSENDITMOPERIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用品目詳細マスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDITMDTLIF = create("MSS_ORDERSENDITMDTLIF", "ORDERSENDITMDTLIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用BOMマスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDITMBOMIF = create("MSS_ORDERSENDITMBOMIF", "ORDERSENDITMBOMIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用場所マスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDLOCIF = create("MSS_ORDERSENDLOCIF", "ORDERSENDLOCIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用カレンダマスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDCALIF = create("MSS_ORDERSENDCALIF", "ORDERSENDCALIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用臨時カレンダマスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDCALEXTIF = create("MSS_ORDERSENDCALEXTIF", "ORDERSENDCALEXTIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用在庫情報ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDSTKIF = create("MSS_ORDERSENDSTKIF", "ORDERSENDSTKIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用入庫予定情報ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDGRSCHDIF = create("MSS_ORDERSENDGRSCHDIF", "ORDERSENDGRSCHDIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用出庫予定情報ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDGISCHDIF = create("MSS_ORDERSENDGISCHDIF", "ORDERSENDGISCHDIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用日次需要情報ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDDLYDMNDIF = create("MSS_ORDERSENDDLYDMNDIF", "ORDERSENDDLYDMNDIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用品目詳細ＢＯＭマスタＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDDTLBOMIF = create("MSS_ORDERSENDDTLBOMIF", "ORDERSENDDTLBOMIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用オーダ引当ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDORDLNKIF = create("MSS_ORDERSENDORDLNKIF", "ORDERSENDORDLNKIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用工程指図実績ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDOPEACTIF = create("MSS_ORDERSENDOPEACTIF", "ORDERSENDOPEACTIF", new MCNumber(15), null);

	/** 発番システム区分：オーダ送信用実績数量ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP ORDERSENDACTQTYIF = create("MSS_ORDERSENDACTQTYIF", "ORDERSENDACTQTYIF", new MCNumber(15), null);

	/** 発番システム区分：購買納品書管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCDLVSLIPMNG = create("MSS_PURCDLVSLIPMNG", "PURCDLVSLIPMNG", new MCNumber(15), null);

	/** 発番システム区分：購買納品書明細管理ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PURCDLVSLIPDMNG = create("MSS_PURCDLVSLIPDMNG", "PURCDLVSLIPDMNG", new MCNumber(15), null);

	/** 発番システム区分：請求送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLSENDIF = create("MSS_BILLSENDIF", "BILLSENDIF", new MCNumber(15), null);

	/** 発番システム区分：請求受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLRECVIF = create("MSS_BILLRECVIF", "BILLRECVIF", new MCNumber(15), null);

	/** 発番システム区分：請求受領ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLRCPT = create("MSS_BILLRCPT", "BILLRCPT", new MCNumber(15), null);

	/** 発番システム区分：請求受領明細ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLRCPTD = create("MSS_BILLRCPTD", "BILLRCPTD", new MCNumber(15), null);

	/** 発番システム区分：納入指示送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLVINSTSENDIF = create("MSS_DLVINSTSENDIF", "DLVINSTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：納入指示受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP DLVINSTRECVIF = create("MSS_DLVINSTRECVIF", "DLVINSTRECVIF", new MCNumber(15), null);

	/** 発番システム区分：支払通知書履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYNTCHISNO = create("MSS_PAYNTCHISNO", "PAYNTCHISNO", new MCNumber(15), null);

	/** 発番システム区分：支払通知書明細履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP PAYNTCDHISNO = create("MSS_PAYNTCDHISNO", "PAYNTCDHISNO", new MCNumber(15), null);

	/** 発番システム区分：請求書履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLHISNO = create("MSS_BILLHISNO", "BILLHISNO", new MCNumber(15), null);

	/** 発番システム区分：請求書明細履歴ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP BILLDHISNO = create("MSS_BILLDHISNO", "BILLDHISNO", new MCNumber(15), null);

	/** 発番システム区分：検査指図送信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPINSTSENDIF = create("MSS_INSPINSTSENDIF", "INSPINSTSENDIF", new MCNumber(15), null);

	/** 発番システム区分：検査実績受信ＩＦデータ行ＮＯ
	 */
	public static final MSC_NUM_SYS_TYP INSPACTRECVIF = create("MSS_INSPACTRECVIF", "INSPACTRECVIF", new MCNumber(15), null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_NUM_SYS_TYP create() {
		return new MSC_NUM_SYS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_NUM_SYS_TYP get(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		if (type == null) {
			throw MSC_NUM_SYS_TYP.invalidValue(value);
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
	public static MSC_NUM_SYS_TYP getNE(String value) {
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_NUM_SYS_TYP create(String value, String xmlKey, MCNumber attr1, String attr2) {
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addNumberColumn($LENGTH, attr1);
		me.constR.addStringColumn($PREFIX, attr2);
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
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.length();
	}

	/** 
	 * prefixの値を返します。
	 * @return prefixの値
	 */
	public String prefix() {
		return constR.getStringNE($PREFIX);
	}

	/** 
	 * valueに対応する定数のprefixの値を返します。
	 * @param value 定数値
	 * @return prefixの値
	 */
	public static String prefix(String value) {
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.prefix();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.getNE(value);
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
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.getNE(value);
		if (me == null) {
			throw MSC_NUM_SYS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.getNE(value);
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
		return createStringPath(value(), name(), length(), prefix());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_NUM_SYS_TYP[] array() {
		if (array == null) {
			array = new MSC_NUM_SYS_TYP[] {
					MSC_NUM_SYS_TYP.DMND, MSC_NUM_SYS_TYP.DLYDMND, MSC_NUM_SYS_TYP.DLYSD, MSC_NUM_SYS_TYP.WGRQST, MSC_NUM_SYS_TYP.WGRQSTPRMS, 
					 MSC_NUM_SYS_TYP.OPRINST, MSC_NUM_SYS_TYP.OPRACT, MSC_NUM_SYS_TYP.YLDSCHD, MSC_NUM_SYS_TYP.YLDACT, MSC_NUM_SYS_TYP.INPTSCHD, MSC_NUM_SYS_TYP.INPTALLOC, 
					 MSC_NUM_SYS_TYP.INPTACT, MSC_NUM_SYS_TYP.LOSSACT, MSC_NUM_SYS_TYP.WKSCHD, MSC_NUM_SYS_TYP.WKACT, MSC_NUM_SYS_TYP.RQMT, MSC_NUM_SYS_TYP.PRQMT, 
					 MSC_NUM_SYS_TYP.SIMRQMT, MSC_NUM_SYS_TYP.IORD, MSC_NUM_SYS_TYP.PORD, MSC_NUM_SYS_TYP.CSTFRCSTD, MSC_NUM_SYS_TYP.CSTFRCSTR, MSC_NUM_SYS_TYP.SLIPSCHD, 
					 MSC_NUM_SYS_TYP.OSLIPSCHD, MSC_NUM_SYS_TYP.IOSCHDPR, MSC_NUM_SYS_TYP.INSPSA, MSC_NUM_SYS_TYP.INSPSI, MSC_NUM_SYS_TYP.INSPS, MSC_NUM_SYS_TYP.INSPAH, 
					 MSC_NUM_SYS_TYP.INSPSD, MSC_NUM_SYS_TYP.INSPAD, MSC_NUM_SYS_TYP.INSPJD, MSC_NUM_SYS_TYP.INSPSM, MSC_NUM_SYS_TYP.PLNTAPRV, MSC_NUM_SYS_TYP.PLNTAPRVD, 
					 MSC_NUM_SYS_TYP.MRKTJUDG, MSC_NUM_SYS_TYP.MRKTJUDGD, MSC_NUM_SYS_TYP.LOTSEQ, MSC_NUM_SYS_TYP.QTND, MSC_NUM_SYS_TYP.QTNITMCOMP, MSC_NUM_SYS_TYP.SLOITMCOMP, 
					 MSC_NUM_SYS_TYP.SLSITM, MSC_NUM_SYS_TYP.SLSITMCOMP, MSC_NUM_SYS_TYP.SLSITMSPEC, MSC_NUM_SYS_TYP.SPECDESC, MSC_NUM_SYS_TYP.COMPSPECDESC, MSC_NUM_SYS_TYP.SLSSCHD, 
					 MSC_NUM_SYS_TYP.DLVINSTRCPT, MSC_NUM_SYS_TYP.SLOSTS, MSC_NUM_SYS_TYP.SLSRETSCHDD, MSC_NUM_SYS_TYP.SLSACTD, MSC_NUM_SYS_TYP.SLSACTIO, MSC_NUM_SYS_TYP.ARAPPLACT, 
					 MSC_NUM_SYS_TYP.ARAPPLSCHD, MSC_NUM_SYS_TYP.BILLACST, MSC_NUM_SYS_TYP.BILLD, MSC_NUM_SYS_TYP.BILLMNG, MSC_NUM_SYS_TYP.NOTEMNG, MSC_NUM_SYS_TYP.RCVACTD, 
					 MSC_NUM_SYS_TYP.RCVSCHDAPPLACT, MSC_NUM_SYS_TYP.RCVSCHD, MSC_NUM_SYS_TYP.ARXRATEREVHIS, MSC_NUM_SYS_TYP.NOTEIF, MSC_NUM_SYS_TYP.RCVACTIF, MSC_NUM_SYS_TYP.SPLNFMT, 
					 MSC_NUM_SYS_TYP.PURCFCST, MSC_NUM_SYS_TYP.PURCFCSTFIX, MSC_NUM_SYS_TYP.PURCFCSTD, MSC_NUM_SYS_TYP.POSCHD, MSC_NUM_SYS_TYP.PURCSCHD, MSC_NUM_SYS_TYP.RCPTIVMNG, 
					 MSC_NUM_SYS_TYP.RCPTIVD, MSC_NUM_SYS_TYP.PURCRETSCHDD, MSC_NUM_SYS_TYP.PURCRETSCHDIO, MSC_NUM_SYS_TYP.PURCRETACTD, MSC_NUM_SYS_TYP.PURCRETACTIO, MSC_NUM_SYS_TYP.PURCACTD, 
					 MSC_NUM_SYS_TYP.PURCACTIO, MSC_NUM_SYS_TYP.PRMSRCPT, MSC_NUM_SYS_TYP.PRMSRCPTD, MSC_NUM_SYS_TYP.XFRALOCS, MSC_NUM_SYS_TYP.XFRACTD, MSC_NUM_SYS_TYP.PROVSCHD, 
					 MSC_NUM_SYS_TYP.ACXINSTD, MSC_NUM_SYS_TYP.ACXACTD, MSC_NUM_SYS_TYP.ARRPRNO, MSC_NUM_SYS_TYP.ARRSCHD, MSC_NUM_SYS_TYP.SHIPPR, MSC_NUM_SYS_TYP.SHIPSCHD, 
					 MSC_NUM_SYS_TYP.SHIPALOCS, MSC_NUM_SYS_TYP.SHACTD, MSC_NUM_SYS_TYP.IVSHACTD, MSC_NUM_SYS_TYP.IVD, MSC_NUM_SYS_TYP.PLD, MSC_NUM_SYS_TYP.SXFRACTD, 
					 MSC_NUM_SYS_TYP.SLIP, MSC_NUM_SYS_TYP.ALLOC_PRIO, MSC_NUM_SYS_TYP.IVMNG, MSC_NUM_SYS_TYP.DLVSLIPD, MSC_NUM_SYS_TYP.STKTKACT, MSC_NUM_SYS_TYP.INPTSTKRPL, 
					 MSC_NUM_SYS_TYP.ALTGRPID, MSC_NUM_SYS_TYP.PFRPTID, MSC_NUM_SYS_TYP.SHIPSTKRPL, MSC_NUM_SYS_TYP.SHIPINSTSENDIF, MSC_NUM_SYS_TYP.SHIPACTRECVIF, MSC_NUM_SYS_TYP.ARRSCHDSENDIF, 
					 MSC_NUM_SYS_TYP.ARRACTRECVIF, MSC_NUM_SYS_TYP.XFRINSTSENDIF, MSC_NUM_SYS_TYP.XFRACTRECVIF, MSC_NUM_SYS_TYP.POSENDIF, MSC_NUM_SYS_TYP.SLORECVIF, MSC_NUM_SYS_TYP.RCVRECVIF, 
					 MSC_NUM_SYS_TYP.POPRMSRECVIF, MSC_NUM_SYS_TYP.SLOPRMSSENDIF, MSC_NUM_SYS_TYP.EDISHIPACTRECVIF, MSC_NUM_SYS_TYP.EDISHIPACTSENDIF, MSC_NUM_SYS_TYP.YIELDSCHDSENDIF, MSC_NUM_SYS_TYP.YIELDACTRECVIF, 
					 MSC_NUM_SYS_TYP.OPERINSTSENDIF, MSC_NUM_SYS_TYP.OPERACTRECVIF, MSC_NUM_SYS_TYP.INPTSCHDSENDIF, MSC_NUM_SYS_TYP.INPTACTRECVIF, MSC_NUM_SYS_TYP.WKSCHDSENDIF, MSC_NUM_SYS_TYP.WKACTRECVIF, 
					 MSC_NUM_SYS_TYP.ACXFRACTRECVIF, MSC_NUM_SYS_TYP.ACCPTSENDIF, MSC_NUM_SYS_TYP.ACCPTRECVIF, MSC_NUM_SYS_TYP.PORECVIF, MSC_NUM_SYS_TYP.APD, MSC_NUM_SYS_TYP.PAYCHKMNG, 
					 MSC_NUM_SYS_TYP.PAYSCHD, MSC_NUM_SYS_TYP.APAPPLSCHD, MSC_NUM_SYS_TYP.PAYSCHDIF, MSC_NUM_SYS_TYP.PAYACTIF, MSC_NUM_SYS_TYP.PAYNOTEMNG, MSC_NUM_SYS_TYP.PAYACTD, 
					 MSC_NUM_SYS_TYP.APXRATEREVHIS, MSC_NUM_SYS_TYP.IOSCHDIF, MSC_NUM_SYS_TYP.MLYSTKIF, MSC_NUM_SYS_TYP.IOACTIF, MSC_NUM_SYS_TYP.ITMORDERIF, MSC_NUM_SYS_TYP.SHIPPRIF, 
					 MSC_NUM_SYS_TYP.NONMOVSTKIF, MSC_NUM_SYS_TYP.ORDRECVIF, MSC_NUM_SYS_TYP.ARRPRIF, MSC_NUM_SYS_TYP.INSPACTIF, MSC_NUM_SYS_TYP.DLVINSTG, MSC_NUM_SYS_TYP.PRMSRCPTG, 
					 MSC_NUM_SYS_TYP.ORDERSEND, MSC_NUM_SYS_TYP.ORDERSENDITMIF, MSC_NUM_SYS_TYP.ORDERSENDITMOPERIF, MSC_NUM_SYS_TYP.ORDERSENDITMDTLIF, MSC_NUM_SYS_TYP.ORDERSENDITMBOMIF, MSC_NUM_SYS_TYP.ORDERSENDLOCIF, 
					 MSC_NUM_SYS_TYP.ORDERSENDCALIF, MSC_NUM_SYS_TYP.ORDERSENDCALEXTIF, MSC_NUM_SYS_TYP.ORDERSENDSTKIF, MSC_NUM_SYS_TYP.ORDERSENDGRSCHDIF, MSC_NUM_SYS_TYP.ORDERSENDGISCHDIF, MSC_NUM_SYS_TYP.ORDERSENDDLYDMNDIF, 
					 MSC_NUM_SYS_TYP.ORDERSENDDTLBOMIF, MSC_NUM_SYS_TYP.ORDERSENDORDLNKIF, MSC_NUM_SYS_TYP.ORDERSENDOPEACTIF, MSC_NUM_SYS_TYP.ORDERSENDACTQTYIF, MSC_NUM_SYS_TYP.PURCDLVSLIPMNG, MSC_NUM_SYS_TYP.PURCDLVSLIPDMNG, 
					 MSC_NUM_SYS_TYP.BILLSENDIF, MSC_NUM_SYS_TYP.BILLRECVIF, MSC_NUM_SYS_TYP.BILLRCPT, MSC_NUM_SYS_TYP.BILLRCPTD, MSC_NUM_SYS_TYP.DLVINSTSENDIF, MSC_NUM_SYS_TYP.DLVINSTRECVIF, 
					 MSC_NUM_SYS_TYP.PAYNTCHISNO, MSC_NUM_SYS_TYP.PAYNTCDHISNO, MSC_NUM_SYS_TYP.BILLHISNO, MSC_NUM_SYS_TYP.BILLDHISNO, MSC_NUM_SYS_TYP.INSPINSTSENDIF, MSC_NUM_SYS_TYP.INSPACTRECVIF
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
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
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
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
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
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
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
			if(MSC_NUM_SYS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_NUM_SYS_TYP me = MSC_NUM_SYS_TYP.get(MSC_NUM_SYS_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_NUM_SYS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_NUM_SYS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_NUM_SYS_TYP.list();
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
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
			if(MSC_NUM_SYS_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_NUM_SYS_TYP.subList(cols, vals);
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
		for (MSC_NUM_SYS_TYP me : MSC_NUM_SYS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_NUM_SYS_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_NUM_SYS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_NUM_SYS_TYP", col);}
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
	protected boolean isSame(MSC_NUM_SYS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 発番システム区分：需要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が需要ＮＯの値の場合true
	 */
	public static boolean isDMND(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DMND.isSame(type);
	}

	/**
	 * 発番システム区分：需要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が需要ＮＯの値の場合true
	 */
	public static boolean isDMND(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DMND.isSame(type);
	}

	/**
	 * 発番システム区分：日次需要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が日次需要ＮＯの値の場合true
	 */
	public static boolean isDLYDMND(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLYDMND.isSame(type);
	}

	/**
	 * 発番システム区分：日次需要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が日次需要ＮＯの値の場合true
	 */
	public static boolean isDLYDMND(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLYDMND.isSame(type);
	}

	/**
	 * 発番システム区分：日次供給ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が日次供給ＮＯの値の場合true
	 */
	public static boolean isDLYSD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLYSD.isSame(type);
	}

	/**
	 * 発番システム区分：日次供給ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が日次供給ＮＯの値の場合true
	 */
	public static boolean isDLYSD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLYSD.isSame(type);
	}

	/**
	 * 発番システム区分：ＷＧ間依頼ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がＷＧ間依頼ＮＯの値の場合true
	 */
	public static boolean isWGRQST(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WGRQST.isSame(type);
	}

	/**
	 * 発番システム区分：ＷＧ間依頼ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がＷＧ間依頼ＮＯの値の場合true
	 */
	public static boolean isWGRQST(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WGRQST.isSame(type);
	}

	/**
	 * 発番システム区分：ＷＧ間依頼回答かどうか
	 * @param value 定数値
	 * @return 定数値がＷＧ間依頼回答の値の場合true
	 */
	public static boolean isWGRQSTPRMS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WGRQSTPRMS.isSame(type);
	}

	/**
	 * 発番システム区分：ＷＧ間依頼回答かどうか
	 * @param type 属性値
	 * @return 属性値がＷＧ間依頼回答の値の場合true
	 */
	public static boolean isWGRQSTPRMS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WGRQSTPRMS.isSame(type);
	}

	/**
	 * 発番システム区分：工程指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工程指図ＮＯの値の場合true
	 */
	public static boolean isOPRINST(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.OPRINST.isSame(type);
	}

	/**
	 * 発番システム区分：工程指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工程指図ＮＯの値の場合true
	 */
	public static boolean isOPRINST(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.OPRINST.isSame(type);
	}

	/**
	 * 発番システム区分：工程実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工程実績ＮＯの値の場合true
	 */
	public static boolean isOPRACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.OPRACT.isSame(type);
	}

	/**
	 * 発番システム区分：工程実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工程実績ＮＯの値の場合true
	 */
	public static boolean isOPRACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.OPRACT.isSame(type);
	}

	/**
	 * 発番システム区分：出来高予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出来高予定ＮＯの値の場合true
	 */
	public static boolean isYLDSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.YLDSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：出来高予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出来高予定ＮＯの値の場合true
	 */
	public static boolean isYLDSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.YLDSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：出来高実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出来高実績ＮＯの値の場合true
	 */
	public static boolean isYLDACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.YLDACT.isSame(type);
	}

	/**
	 * 発番システム区分：出来高実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出来高実績ＮＯの値の場合true
	 */
	public static boolean isYLDACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.YLDACT.isSame(type);
	}

	/**
	 * 発番システム区分：投入予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入予定ＮＯの値の場合true
	 */
	public static boolean isINPTSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：投入予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入予定ＮＯの値の場合true
	 */
	public static boolean isINPTSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：投入引当状況ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入引当状況ＮＯの値の場合true
	 */
	public static boolean isINPTALLOC(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTALLOC.isSame(type);
	}

	/**
	 * 発番システム区分：投入引当状況ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入引当状況ＮＯの値の場合true
	 */
	public static boolean isINPTALLOC(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTALLOC.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入実績ＮＯの値の場合true
	 */
	public static boolean isINPTACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTACT.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入実績ＮＯの値の場合true
	 */
	public static boolean isINPTACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTACT.isSame(type);
	}

	/**
	 * 発番システム区分：ロス実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がロス実績ＮＯの値の場合true
	 */
	public static boolean isLOSSACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.LOSSACT.isSame(type);
	}

	/**
	 * 発番システム区分：ロス実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がロス実績ＮＯの値の場合true
	 */
	public static boolean isLOSSACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.LOSSACT.isSame(type);
	}

	/**
	 * 発番システム区分：工数予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工数予定ＮＯの値の場合true
	 */
	public static boolean isWKSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WKSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：工数予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工数予定ＮＯの値の場合true
	 */
	public static boolean isWKSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WKSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：工数実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工数実績ＮＯの値の場合true
	 */
	public static boolean isWKACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WKACT.isSame(type);
	}

	/**
	 * 発番システム区分：工数実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工数実績ＮＯの値の場合true
	 */
	public static boolean isWKACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WKACT.isSame(type);
	}

	/**
	 * 発番システム区分：所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が所要ＮＯの値の場合true
	 */
	public static boolean isRQMT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RQMT.isSame(type);
	}

	/**
	 * 発番システム区分：所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が所要ＮＯの値の場合true
	 */
	public static boolean isRQMT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RQMT.isSame(type);
	}

	/**
	 * 発番システム区分：先行手配所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が先行手配所要ＮＯの値の場合true
	 */
	public static boolean isPRQMT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PRQMT.isSame(type);
	}

	/**
	 * 発番システム区分：先行手配所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が先行手配所要ＮＯの値の場合true
	 */
	public static boolean isPRQMT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PRQMT.isSame(type);
	}

	/**
	 * 発番システム区分：シミュレーション用所要ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がシミュレーション用所要ＮＯの値の場合true
	 */
	public static boolean isSIMRQMT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SIMRQMT.isSame(type);
	}

	/**
	 * 発番システム区分：シミュレーション用所要ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がシミュレーション用所要ＮＯの値の場合true
	 */
	public static boolean isSIMRQMT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SIMRQMT.isSame(type);
	}

	/**
	 * 発番システム区分：品目オーダＮＯ（マニュアル追加）かどうか
	 * @param value 定数値
	 * @return 定数値が品目オーダＮＯ（マニュアル追加）の値の場合true
	 */
	public static boolean isIORD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IORD.isSame(type);
	}

	/**
	 * 発番システム区分：品目オーダＮＯ（マニュアル追加）かどうか
	 * @param type 属性値
	 * @return 属性値が品目オーダＮＯ（マニュアル追加）の値の場合true
	 */
	public static boolean isIORD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IORD.isSame(type);
	}

	/**
	 * 発番システム区分：工程オーダＮＯ（マニュアル追加）かどうか
	 * @param value 定数値
	 * @return 定数値が工程オーダＮＯ（マニュアル追加）の値の場合true
	 */
	public static boolean isPORD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PORD.isSame(type);
	}

	/**
	 * 発番システム区分：工程オーダＮＯ（マニュアル追加）かどうか
	 * @param type 属性値
	 * @return 属性値が工程オーダＮＯ（マニュアル追加）の値の場合true
	 */
	public static boolean isPORD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PORD.isSame(type);
	}

	/**
	 * 発番システム区分：顧客期間内示明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が顧客期間内示明細ＮＯの値の場合true
	 */
	public static boolean isCSTFRCSTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.CSTFRCSTD.isSame(type);
	}

	/**
	 * 発番システム区分：顧客期間内示明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が顧客期間内示明細ＮＯの値の場合true
	 */
	public static boolean isCSTFRCSTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.CSTFRCSTD.isSame(type);
	}

	/**
	 * 発番システム区分：顧客期間内示レコードＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が顧客期間内示レコードＮＯの値の場合true
	 */
	public static boolean isCSTFRCSTR(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.CSTFRCSTR.isSame(type);
	}

	/**
	 * 発番システム区分：顧客期間内示レコードＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が顧客期間内示レコードＮＯの値の場合true
	 */
	public static boolean isCSTFRCSTR(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.CSTFRCSTR.isSame(type);
	}

	/**
	 * 発番システム区分：受払予定伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isSLIPSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：受払予定伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isSLIPSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ受払予定伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isOSLIPSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.OSLIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ受払予定伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ受払予定伝票ＮＯの値の場合true
	 */
	public static boolean isOSLIPSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.OSLIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：受払進捗管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払進捗管理ＮＯの値の場合true
	 */
	public static boolean isIOSCHDPR(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IOSCHDPR.isSame(type);
	}

	/**
	 * 発番システム区分：受払進捗管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払進捗管理ＮＯの値の場合true
	 */
	public static boolean isIOSCHDPR(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IOSCHDPR.isSame(type);
	}

	/**
	 * 発番システム区分：検査規格実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査規格実績ＮＯの値の場合true
	 */
	public static boolean isINSPSA(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPSA.isSame(type);
	}

	/**
	 * 発番システム区分：検査規格実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査規格実績ＮＯの値の場合true
	 */
	public static boolean isINSPSA(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPSA.isSame(type);
	}

	/**
	 * 発番システム区分：検査規格指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査規格指図ＮＯの値の場合true
	 */
	public static boolean isINSPSI(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPSI.isSame(type);
	}

	/**
	 * 発番システム区分：検査規格指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査規格指図ＮＯの値の場合true
	 */
	public static boolean isINSPSI(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPSI.isSame(type);
	}

	/**
	 * 発番システム区分：検査予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査予定ＮＯの値の場合true
	 */
	public static boolean isINSPS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPS.isSame(type);
	}

	/**
	 * 発番システム区分：検査予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査予定ＮＯの値の場合true
	 */
	public static boolean isINSPS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPS.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績ヘッダＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査実績ヘッダＮＯの値の場合true
	 */
	public static boolean isINSPAH(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPAH.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績ヘッダＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査実績ヘッダＮＯの値の場合true
	 */
	public static boolean isINSPAH(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPAH.isSame(type);
	}

	/**
	 * 発番システム区分：検査着手明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査着手明細ＮＯの値の場合true
	 */
	public static boolean isINSPSD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPSD.isSame(type);
	}

	/**
	 * 発番システム区分：検査着手明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査着手明細ＮＯの値の場合true
	 */
	public static boolean isINSPSD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPSD.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査実績明細ＮＯの値の場合true
	 */
	public static boolean isINSPAD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPAD.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査実績明細ＮＯの値の場合true
	 */
	public static boolean isINSPAD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPAD.isSame(type);
	}

	/**
	 * 発番システム区分：検査判定明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査判定明細ＮＯの値の場合true
	 */
	public static boolean isINSPJD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPJD.isSame(type);
	}

	/**
	 * 発番システム区分：検査判定明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査判定明細ＮＯの値の場合true
	 */
	public static boolean isINSPJD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPJD.isSame(type);
	}

	/**
	 * 発番システム区分：検査抜取実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査抜取実績ＮＯの値の場合true
	 */
	public static boolean isINSPSM(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPSM.isSame(type);
	}

	/**
	 * 発番システム区分：検査抜取実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査抜取実績ＮＯの値の場合true
	 */
	public static boolean isINSPSM(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPSM.isSame(type);
	}

	/**
	 * 発番システム区分：工場出荷承認ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷承認ＮＯの値の場合true
	 */
	public static boolean isPLNTAPRV(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PLNTAPRV.isSame(type);
	}

	/**
	 * 発番システム区分：工場出荷承認ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷承認ＮＯの値の場合true
	 */
	public static boolean isPLNTAPRV(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PLNTAPRV.isSame(type);
	}

	/**
	 * 発番システム区分：工場出荷承認明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷承認明細ＮＯの値の場合true
	 */
	public static boolean isPLNTAPRVD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PLNTAPRVD.isSame(type);
	}

	/**
	 * 発番システム区分：工場出荷承認明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷承認明細ＮＯの値の場合true
	 */
	public static boolean isPLNTAPRVD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PLNTAPRVD.isSame(type);
	}

	/**
	 * 発番システム区分：市場出荷判定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が市場出荷判定ＮＯの値の場合true
	 */
	public static boolean isMRKTJUDG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.MRKTJUDG.isSame(type);
	}

	/**
	 * 発番システム区分：市場出荷判定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が市場出荷判定ＮＯの値の場合true
	 */
	public static boolean isMRKTJUDG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.MRKTJUDG.isSame(type);
	}

	/**
	 * 発番システム区分：市場出荷判定明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が市場出荷判定明細ＮＯの値の場合true
	 */
	public static boolean isMRKTJUDGD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.MRKTJUDGD.isSame(type);
	}

	/**
	 * 発番システム区分：市場出荷判定明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が市場出荷判定明細ＮＯの値の場合true
	 */
	public static boolean isMRKTJUDGD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.MRKTJUDGD.isSame(type);
	}

	/**
	 * 発番システム区分：ロットシーケンスかどうか
	 * @param value 定数値
	 * @return 定数値がロットシーケンスの値の場合true
	 */
	public static boolean isLOTSEQ(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.LOTSEQ.isSame(type);
	}

	/**
	 * 発番システム区分：ロットシーケンスかどうか
	 * @param type 属性値
	 * @return 属性値がロットシーケンスの値の場合true
	 */
	public static boolean isLOTSEQ(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.LOTSEQ.isSame(type);
	}

	/**
	 * 発番システム区分：見積明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が見積明細ＮＯの値の場合true
	 */
	public static boolean isQTND(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.QTND.isSame(type);
	}

	/**
	 * 発番システム区分：見積明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が見積明細ＮＯの値の場合true
	 */
	public static boolean isQTND(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.QTND.isSame(type);
	}

	/**
	 * 発番システム区分：見積品目構成ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が見積品目構成ＮＯの値の場合true
	 */
	public static boolean isQTNITMCOMP(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.QTNITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：見積品目構成ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が見積品目構成ＮＯの値の場合true
	 */
	public static boolean isQTNITMCOMP(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.QTNITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：受注品目構成ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注品目構成ＮＯの値の場合true
	 */
	public static boolean isSLOITMCOMP(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLOITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：受注品目構成ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注品目構成ＮＯの値の場合true
	 */
	public static boolean isSLOITMCOMP(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLOITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目ＮＯの値の場合true
	 */
	public static boolean isSLSITM(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSITM.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目ＮＯの値の場合true
	 */
	public static boolean isSLSITM(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSITM.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目構成ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目構成ＮＯの値の場合true
	 */
	public static boolean isSLSITMCOMP(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目構成ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目構成ＮＯの値の場合true
	 */
	public static boolean isSLSITMCOMP(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSITMCOMP.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目仕様ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目仕様ＮＯの値の場合true
	 */
	public static boolean isSLSITMSPEC(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSITMSPEC.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目仕様ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目仕様ＮＯの値の場合true
	 */
	public static boolean isSLSITMSPEC(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSITMSPEC.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目仕様項目ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目仕様項目ＮＯの値の場合true
	 */
	public static boolean isSPECDESC(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SPECDESC.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目仕様項目ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目仕様項目ＮＯの値の場合true
	 */
	public static boolean isSPECDESC(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SPECDESC.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目構成仕様項目ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売品目構成仕様項目ＮＯの値の場合true
	 */
	public static boolean isCOMPSPECDESC(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.COMPSPECDESC.isSame(type);
	}

	/**
	 * 発番システム区分：販売品目構成仕様項目ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売品目構成仕様項目ＮＯの値の場合true
	 */
	public static boolean isCOMPSPECDESC(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.COMPSPECDESC.isSame(type);
	}

	/**
	 * 発番システム区分：売上予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上予定ＮＯの値の場合true
	 */
	public static boolean isSLSSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：売上予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上予定ＮＯの値の場合true
	 */
	public static boolean isSLSSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示受領ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示受領ＮＯの値の場合true
	 */
	public static boolean isDLVINSTRCPT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLVINSTRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示受領ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示受領ＮＯの値の場合true
	 */
	public static boolean isDLVINSTRCPT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLVINSTRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：受注状況ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注状況ＮＯの値の場合true
	 */
	public static boolean isSLOSTS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLOSTS.isSame(type);
	}

	/**
	 * 発番システム区分：受注状況ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注状況ＮＯの値の場合true
	 */
	public static boolean isSLOSTS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLOSTS.isSame(type);
	}

	/**
	 * 発番システム区分：売上返品予定明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上返品予定明細ＮＯの値の場合true
	 */
	public static boolean isSLSRETSCHDD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSRETSCHDD.isSame(type);
	}

	/**
	 * 発番システム区分：売上返品予定明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上返品予定明細ＮＯの値の場合true
	 */
	public static boolean isSLSRETSCHDD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSRETSCHDD.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績明細ＮＯの値の場合true
	 */
	public static boolean isSLSACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSACTD.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績明細ＮＯの値の場合true
	 */
	public static boolean isSLSACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSACTD.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績受払ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績受払ＮＯの値の場合true
	 */
	public static boolean isSLSACTIO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLSACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績受払ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績受払ＮＯの値の場合true
	 */
	public static boolean isSLSACTIO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLSACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：売掛消込実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売掛消込実績ＮＯの値の場合true
	 */
	public static boolean isARAPPLACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARAPPLACT.isSame(type);
	}

	/**
	 * 発番システム区分：売掛消込実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売掛消込実績ＮＯの値の場合true
	 */
	public static boolean isARAPPLACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARAPPLACT.isSame(type);
	}

	/**
	 * 発番システム区分：売掛消込予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売掛消込予定ＮＯの値の場合true
	 */
	public static boolean isARAPPLSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARAPPLSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：売掛消込予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売掛消込予定ＮＯの値の場合true
	 */
	public static boolean isARAPPLSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARAPPLSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：売掛別請求ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売掛別請求ＮＯの値の場合true
	 */
	public static boolean isBILLACST(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLACST.isSame(type);
	}

	/**
	 * 発番システム区分：売掛別請求ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売掛別請求ＮＯの値の場合true
	 */
	public static boolean isBILLACST(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLACST.isSame(type);
	}

	/**
	 * 発番システム区分：請求明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求明細ＮＯの値の場合true
	 */
	public static boolean isBILLD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLD.isSame(type);
	}

	/**
	 * 発番システム区分：請求明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求明細ＮＯの値の場合true
	 */
	public static boolean isBILLD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLD.isSame(type);
	}

	/**
	 * 発番システム区分：請求管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求管理ＮＯの値の場合true
	 */
	public static boolean isBILLMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLMNG.isSame(type);
	}

	/**
	 * 発番システム区分：請求管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求管理ＮＯの値の場合true
	 */
	public static boolean isBILLMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLMNG.isSame(type);
	}

	/**
	 * 発番システム区分：手形管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が手形管理ＮＯの値の場合true
	 */
	public static boolean isNOTEMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.NOTEMNG.isSame(type);
	}

	/**
	 * 発番システム区分：手形管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が手形管理ＮＯの値の場合true
	 */
	public static boolean isNOTEMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.NOTEMNG.isSame(type);
	}

	/**
	 * 発番システム区分：入金実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金実績明細ＮＯの値の場合true
	 */
	public static boolean isRCVACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCVACTD.isSame(type);
	}

	/**
	 * 発番システム区分：入金実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金実績明細ＮＯの値の場合true
	 */
	public static boolean isRCVACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCVACTD.isSame(type);
	}

	/**
	 * 発番システム区分：入金予定消込実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金予定消込実績ＮＯの値の場合true
	 */
	public static boolean isRCVSCHDAPPLACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCVSCHDAPPLACT.isSame(type);
	}

	/**
	 * 発番システム区分：入金予定消込実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金予定消込実績ＮＯの値の場合true
	 */
	public static boolean isRCVSCHDAPPLACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCVSCHDAPPLACT.isSame(type);
	}

	/**
	 * 発番システム区分：入金予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金予定ＮＯの値の場合true
	 */
	public static boolean isRCVSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCVSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：入金予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金予定ＮＯの値の場合true
	 */
	public static boolean isRCVSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCVSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：債権為替レート評価替履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が債権為替レート評価替履歴ＮＯの値の場合true
	 */
	public static boolean isARXRATEREVHIS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARXRATEREVHIS.isSame(type);
	}

	/**
	 * 発番システム区分：債権為替レート評価替履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が債権為替レート評価替履歴ＮＯの値の場合true
	 */
	public static boolean isARXRATEREVHIS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARXRATEREVHIS.isSame(type);
	}

	/**
	 * 発番システム区分：手形情報ＩＦＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が手形情報ＩＦＮＯの値の場合true
	 */
	public static boolean isNOTEIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.NOTEIF.isSame(type);
	}

	/**
	 * 発番システム区分：手形情報ＩＦＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が手形情報ＩＦＮＯの値の場合true
	 */
	public static boolean isNOTEIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.NOTEIF.isSame(type);
	}

	/**
	 * 発番システム区分：入金実績ＩＦＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金実績ＩＦＮＯの値の場合true
	 */
	public static boolean isRCVACTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCVACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：入金実績ＩＦＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金実績ＩＦＮＯの値の場合true
	 */
	public static boolean isRCVACTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCVACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：販売計画構成ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が販売計画構成ＮＯの値の場合true
	 */
	public static boolean isSPLNFMT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SPLNFMT.isSame(type);
	}

	/**
	 * 発番システム区分：販売計画構成ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が販売計画構成ＮＯの値の場合true
	 */
	public static boolean isSPLNFMT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SPLNFMT.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買内示ＮＯの値の場合true
	 */
	public static boolean isPURCFCST(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCFCST.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買内示ＮＯの値の場合true
	 */
	public static boolean isPURCFCST(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCFCST.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示確定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買内示確定ＮＯの値の場合true
	 */
	public static boolean isPURCFCSTFIX(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCFCSTFIX.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示確定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買内示確定ＮＯの値の場合true
	 */
	public static boolean isPURCFCSTFIX(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCFCSTFIX.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買内示明細ＮＯの値の場合true
	 */
	public static boolean isPURCFCSTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCFCSTD.isSame(type);
	}

	/**
	 * 発番システム区分：購買内示明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買内示明細ＮＯの値の場合true
	 */
	public static boolean isPURCFCSTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCFCSTD.isSame(type);
	}

	/**
	 * 発番システム区分：発注予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注予定ＮＯの値の場合true
	 */
	public static boolean isPOSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.POSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：発注予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注予定ＮＯの値の場合true
	 */
	public static boolean isPOSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.POSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入予定ＮＯの値の場合true
	 */
	public static boolean isPURCSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入予定ＮＯの値の場合true
	 */
	public static boolean isPURCSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：受領インボイス管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受領インボイス管理ＮＯの値の場合true
	 */
	public static boolean isRCPTIVMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCPTIVMNG.isSame(type);
	}

	/**
	 * 発番システム区分：受領インボイス管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受領インボイス管理ＮＯの値の場合true
	 */
	public static boolean isRCPTIVMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCPTIVMNG.isSame(type);
	}

	/**
	 * 発番システム区分：受領インボイス明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受領インボイス明細ＮＯの値の場合true
	 */
	public static boolean isRCPTIVD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCPTIVD.isSame(type);
	}

	/**
	 * 発番システム区分：受領インボイス明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受領インボイス明細ＮＯの値の場合true
	 */
	public static boolean isRCPTIVD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCPTIVD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品予定明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品予定明細ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHDD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCRETSCHDD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品予定明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品予定明細ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHDD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCRETSCHDD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品予定受払ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品予定受払ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHDIO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCRETSCHDIO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品予定受払ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品予定受払ＮＯの値の場合true
	 */
	public static boolean isPURCRETSCHDIO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCRETSCHDIO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品実績明細ＮＯの値の場合true
	 */
	public static boolean isPURCRETACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCRETACTD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品実績明細ＮＯの値の場合true
	 */
	public static boolean isPURCRETACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCRETACTD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品実績受払ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品実績受払ＮＯの値の場合true
	 */
	public static boolean isPURCRETACTIO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCRETACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入返品実績受払ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品実績受払ＮＯの値の場合true
	 */
	public static boolean isPURCRETACTIO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCRETACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入実績明細ＮＯの値の場合true
	 */
	public static boolean isPURCACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCACTD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入実績明細ＮＯの値の場合true
	 */
	public static boolean isPURCACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCACTD.isSame(type);
	}

	/**
	 * 発番システム区分：仕入実績受払ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入実績受払ＮＯの値の場合true
	 */
	public static boolean isPURCACTIO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：仕入実績受払ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入実績受払ＮＯの値の場合true
	 */
	public static boolean isPURCACTIO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCACTIO.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納期回答受領ＮＯの値の場合true
	 */
	public static boolean isPRMSRCPT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PRMSRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納期回答受領ＮＯの値の場合true
	 */
	public static boolean isPRMSRCPT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PRMSRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納期回答受領明細ＮＯの値の場合true
	 */
	public static boolean isPRMSRCPTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PRMSRCPTD.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納期回答受領明細ＮＯの値の場合true
	 */
	public static boolean isPRMSRCPTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PRMSRCPTD.isSame(type);
	}

	/**
	 * 発番システム区分：移動引当状況ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動引当状況ＮＯの値の場合true
	 */
	public static boolean isXFRALOCS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.XFRALOCS.isSame(type);
	}

	/**
	 * 発番システム区分：移動引当状況ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動引当状況ＮＯの値の場合true
	 */
	public static boolean isXFRALOCS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.XFRALOCS.isSame(type);
	}

	/**
	 * 発番システム区分：移動実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動実績明細ＮＯの値の場合true
	 */
	public static boolean isXFRACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.XFRACTD.isSame(type);
	}

	/**
	 * 発番システム区分：移動実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動実績明細ＮＯの値の場合true
	 */
	public static boolean isXFRACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.XFRACTD.isSame(type);
	}

	/**
	 * 発番システム区分：支給予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支給予定ＮＯの値の場合true
	 */
	public static boolean isPROVSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PROVSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：支給予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支給予定ＮＯの値の場合true
	 */
	public static boolean isPROVSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PROVSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替指図明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替指図明細ＮＯの値の場合true
	 */
	public static boolean isACXINSTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ACXINSTD.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替指図明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替指図明細ＮＯの値の場合true
	 */
	public static boolean isACXINSTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ACXINSTD.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績明細ＮＯの値の場合true
	 */
	public static boolean isACXACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ACXACTD.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績明細ＮＯの値の場合true
	 */
	public static boolean isACXACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ACXACTD.isSame(type);
	}

	/**
	 * 発番システム区分：入荷進捗ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷進捗ＮＯの値の場合true
	 */
	public static boolean isARRPRNO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARRPRNO.isSame(type);
	}

	/**
	 * 発番システム区分：入荷進捗ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷進捗ＮＯの値の場合true
	 */
	public static boolean isARRPRNO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARRPRNO.isSame(type);
	}

	/**
	 * 発番システム区分：入荷予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定ＮＯの値の場合true
	 */
	public static boolean isARRSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARRSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：入荷予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定ＮＯの値の場合true
	 */
	public static boolean isARRSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARRSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：出荷進捗ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷進捗ＮＯの値の場合true
	 */
	public static boolean isSHIPPR(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPPR.isSame(type);
	}

	/**
	 * 発番システム区分：出荷進捗ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷進捗ＮＯの値の場合true
	 */
	public static boolean isSHIPPR(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPPR.isSame(type);
	}

	/**
	 * 発番システム区分：出荷予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷予定ＮＯの値の場合true
	 */
	public static boolean isSHIPSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：出荷予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷予定ＮＯの値の場合true
	 */
	public static boolean isSHIPSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：出荷引当状況ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷引当状況ＮＯの値の場合true
	 */
	public static boolean isSHIPALOCS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPALOCS.isSame(type);
	}

	/**
	 * 発番システム区分：出荷引当状況ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷引当状況ＮＯの値の場合true
	 */
	public static boolean isSHIPALOCS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPALOCS.isSame(type);
	}

	/**
	 * 発番システム区分：出荷実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績明細ＮＯの値の場合true
	 */
	public static boolean isSHACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHACTD.isSame(type);
	}

	/**
	 * 発番システム区分：出荷実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績明細ＮＯの値の場合true
	 */
	public static boolean isSHACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHACTD.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス出荷実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がインボイス出荷実績明細ＮＯの値の場合true
	 */
	public static boolean isIVSHACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IVSHACTD.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス出荷実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がインボイス出荷実績明細ＮＯの値の場合true
	 */
	public static boolean isIVSHACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IVSHACTD.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がインボイス明細ＮＯの値の場合true
	 */
	public static boolean isIVD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IVD.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がインボイス明細ＮＯの値の場合true
	 */
	public static boolean isIVD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IVD.isSame(type);
	}

	/**
	 * 発番システム区分：パッキングリスト明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がパッキングリスト明細ＮＯの値の場合true
	 */
	public static boolean isPLD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PLD.isSame(type);
	}

	/**
	 * 発番システム区分：パッキングリスト明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がパッキングリスト明細ＮＯの値の場合true
	 */
	public static boolean isPLD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PLD.isSame(type);
	}

	/**
	 * 発番システム区分：在庫振替実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が在庫振替実績明細ＮＯの値の場合true
	 */
	public static boolean isSXFRACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SXFRACTD.isSame(type);
	}

	/**
	 * 発番システム区分：在庫振替実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が在庫振替実績明細ＮＯの値の場合true
	 */
	public static boolean isSXFRACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SXFRACTD.isSame(type);
	}

	/**
	 * 発番システム区分：伝票ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が伝票ＮＯの値の場合true
	 */
	public static boolean isSLIP(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：伝票ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が伝票ＮＯの値の場合true
	 */
	public static boolean isSLIP(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLIP.isSame(type);
	}

	/**
	 * 発番システム区分：引当順ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が引当順ＮＯの値の場合true
	 */
	public static boolean isALLOC_PRIO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ALLOC_PRIO.isSame(type);
	}

	/**
	 * 発番システム区分：引当順ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が引当順ＮＯの値の場合true
	 */
	public static boolean isALLOC_PRIO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ALLOC_PRIO.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がインボイス管理ＮＯの値の場合true
	 */
	public static boolean isIVMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IVMNG.isSame(type);
	}

	/**
	 * 発番システム区分：インボイス管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がインボイス管理ＮＯの値の場合true
	 */
	public static boolean isIVMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IVMNG.isSame(type);
	}

	/**
	 * 発番システム区分：納品書明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納品書明細ＮＯの値の場合true
	 */
	public static boolean isDLVSLIPD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLVSLIPD.isSame(type);
	}

	/**
	 * 発番システム区分：納品書明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納品書明細ＮＯの値の場合true
	 */
	public static boolean isDLVSLIPD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLVSLIPD.isSame(type);
	}

	/**
	 * 発番システム区分：棚卸実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が棚卸実績ＮＯの値の場合true
	 */
	public static boolean isSTKTKACT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.STKTKACT.isSame(type);
	}

	/**
	 * 発番システム区分：棚卸実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が棚卸実績ＮＯの値の場合true
	 */
	public static boolean isSTKTKACT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.STKTKACT.isSame(type);
	}

	/**
	 * 発番システム区分：投入品不足情報ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入品不足情報ＮＯの値の場合true
	 */
	public static boolean isINPTSTKRPL(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTSTKRPL.isSame(type);
	}

	/**
	 * 発番システム区分：投入品不足情報ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入品不足情報ＮＯの値の場合true
	 */
	public static boolean isINPTSTKRPL(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTSTKRPL.isSame(type);
	}

	/**
	 * 発番システム区分：代替グループＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が代替グループＩＤの値の場合true
	 */
	public static boolean isALTGRPID(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ALTGRPID.isSame(type);
	}

	/**
	 * 発番システム区分：代替グループＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が代替グループＩＤの値の場合true
	 */
	public static boolean isALTGRPID(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ALTGRPID.isSame(type);
	}

	/**
	 * 発番システム区分：内示書ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が内示書ＩＤの値の場合true
	 */
	public static boolean isPFRPTID(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PFRPTID.isSame(type);
	}

	/**
	 * 発番システム区分：内示書ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が内示書ＩＤの値の場合true
	 */
	public static boolean isPFRPTID(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PFRPTID.isSame(type);
	}

	/**
	 * 発番システム区分：出荷品不足情報ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷品不足情報ＮＯの値の場合true
	 */
	public static boolean isSHIPSTKRPL(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPSTKRPL.isSame(type);
	}

	/**
	 * 発番システム区分：出荷品不足情報ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷品不足情報ＮＯの値の場合true
	 */
	public static boolean isSHIPSTKRPL(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPSTKRPL.isSame(type);
	}

	/**
	 * 発番システム区分：出荷指図送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPINSTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：出荷指図送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPINSTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：出荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：出荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷予定送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRSCHDSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARRSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷予定送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRSCHDSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARRSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：移動指図送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isXFRINSTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.XFRINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：移動指図送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isXFRINSTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.XFRINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：移動実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isXFRACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.XFRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：移動実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isXFRACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.XFRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：発注送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPOSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.POSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：発注送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPOSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.POSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：受注受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受注受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSLORECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLORECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：受注受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受注受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSLORECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLORECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：入金受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入金受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isRCVRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.RCVRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：入金受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入金受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isRCVRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.RCVRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納期回答受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPOPRMSRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.POPRMSRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納期回答受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPOPRMSRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.POPRMSRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納期回答送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSLOPRMSSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SLOPRMSSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納期回答送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSLOPRMSSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SLOPRMSSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：EDI出荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がEDI出荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isEDISHIPACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.EDISHIPACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：EDI出荷実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がEDI出荷実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isEDISHIPACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.EDISHIPACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：EDI出荷実績送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がEDI出荷実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isEDISHIPACTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.EDISHIPACTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：EDI出荷実績送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がEDI出荷実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isEDISHIPACTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.EDISHIPACTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：出来高予定送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出来高予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isYIELDSCHDSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.YIELDSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：出来高予定送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出来高予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isYIELDSCHDSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.YIELDSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：出来高実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出来高実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isYIELDACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.YIELDACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：出来高実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出来高実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isYIELDACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.YIELDACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：工程指図送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工程指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isOPERINSTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.OPERINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：工程指図送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工程指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isOPERINSTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.OPERINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：工程実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工程実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isOPERACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.OPERACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：工程実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工程実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isOPERACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.OPERACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：投入予定送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINPTSCHDSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：投入予定送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINPTSCHDSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINPTACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INPTACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINPTACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INPTACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：工数予定送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工数予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isWKSCHDSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WKSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：工数予定送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工数予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isWKSCHDSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WKSCHDSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：工数実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工数実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isWKACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.WKACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：工数実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工数実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isWKACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.WKACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACXFRACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ACXFRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：他勘定振替実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACXFRACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ACXFRACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：検収送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検収送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACCPTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ACCPTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：検収送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検収送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACCPTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ACCPTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：検収受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検収受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACCPTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ACCPTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：検収受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検収受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACCPTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ACCPTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：発注受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPORECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PORECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：発注受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPORECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PORECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：買掛明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が買掛明細ＮＯの値の場合true
	 */
	public static boolean isAPD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.APD.isSame(type);
	}

	/**
	 * 発番システム区分：買掛明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が買掛明細ＮＯの値の場合true
	 */
	public static boolean isAPD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.APD.isSame(type);
	}

	/**
	 * 発番システム区分：支払照合管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払照合管理ＮＯの値の場合true
	 */
	public static boolean isPAYCHKMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYCHKMNG.isSame(type);
	}

	/**
	 * 発番システム区分：支払照合管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払照合管理ＮＯの値の場合true
	 */
	public static boolean isPAYCHKMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYCHKMNG.isSame(type);
	}

	/**
	 * 発番システム区分：支払予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払予定ＮＯの値の場合true
	 */
	public static boolean isPAYSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：支払予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払予定ＮＯの値の場合true
	 */
	public static boolean isPAYSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：買掛消込予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が買掛消込予定ＮＯの値の場合true
	 */
	public static boolean isAPAPPLSCHD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.APAPPLSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：買掛消込予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が買掛消込予定ＮＯの値の場合true
	 */
	public static boolean isAPAPPLSCHD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.APAPPLSCHD.isSame(type);
	}

	/**
	 * 発番システム区分：支払予定ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払予定ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPAYSCHDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：支払予定ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払予定ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPAYSCHDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：支払実績ＩＦＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払実績ＩＦＮＯの値の場合true
	 */
	public static boolean isPAYACTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：支払実績ＩＦＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払実績ＩＦＮＯの値の場合true
	 */
	public static boolean isPAYACTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：支払手形管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払手形管理ＮＯの値の場合true
	 */
	public static boolean isPAYNOTEMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYNOTEMNG.isSame(type);
	}

	/**
	 * 発番システム区分：支払手形管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払手形管理ＮＯの値の場合true
	 */
	public static boolean isPAYNOTEMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYNOTEMNG.isSame(type);
	}

	/**
	 * 発番システム区分：支払実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払実績明細ＮＯの値の場合true
	 */
	public static boolean isPAYACTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYACTD.isSame(type);
	}

	/**
	 * 発番システム区分：支払実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払実績明細ＮＯの値の場合true
	 */
	public static boolean isPAYACTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYACTD.isSame(type);
	}

	/**
	 * 発番システム区分：債務為替レート評価替履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が債務為替レート評価替履歴ＮＯの値の場合true
	 */
	public static boolean isAPXRATEREVHIS(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.APXRATEREVHIS.isSame(type);
	}

	/**
	 * 発番システム区分：債務為替レート評価替履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が債務為替レート評価替履歴ＮＯの値の場合true
	 */
	public static boolean isAPXRATEREVHIS(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.APXRATEREVHIS.isSame(type);
	}

	/**
	 * 発番システム区分：受払予定送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIOSCHDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IOSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：受払予定送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払予定送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIOSCHDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IOSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：月末在庫送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isMLYSTKIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.MLYSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：月末在庫送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isMLYSTKIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.MLYSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：受払実績送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIOACTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.IOACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：受払実績送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIOACTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.IOACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：品目オーダ情報送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目オーダ情報送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isITMORDERIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ITMORDERIF.isSame(type);
	}

	/**
	 * 発番システム区分：品目オーダ情報送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目オーダ情報送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isITMORDERIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ITMORDERIF.isSame(type);
	}

	/**
	 * 発番システム区分：出荷進捗送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷進捗送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPPRIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.SHIPPRIF.isSame(type);
	}

	/**
	 * 発番システム区分：出荷進捗送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷進捗送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isSHIPPRIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.SHIPPRIF.isSame(type);
	}

	/**
	 * 発番システム区分：滞留在庫情報送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が滞留在庫情報送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isNONMOVSTKIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.NONMOVSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：滞留在庫情報送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が滞留在庫情報送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isNONMOVSTKIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.NONMOVSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷進捗送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷進捗送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRPRIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ARRPRIF.isSame(type);
	}

	/**
	 * 発番システム区分：入荷進捗送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷進捗送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isARRPRIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ARRPRIF.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPACTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査実績送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPACTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示ＧＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示ＧＮＯの値の場合true
	 */
	public static boolean isDLVINSTG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLVINSTG.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示ＧＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示ＧＮＯの値の場合true
	 */
	public static boolean isDLVINSTG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLVINSTG.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領ＧＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納期回答受領ＧＮＯの値の場合true
	 */
	public static boolean isPRMSRCPTG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PRMSRCPTG.isSame(type);
	}

	/**
	 * 発番システム区分：納期回答受領ＧＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納期回答受領ＧＮＯの値の場合true
	 */
	public static boolean isPRMSRCPTG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PRMSRCPTG.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSEND(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSEND.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSEND(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSEND.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目マスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDITMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目マスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDITMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目工程マスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目工程マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMOPERIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDITMOPERIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目工程マスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目工程マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMOPERIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDITMOPERIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目詳細マスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMDTLIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDITMDTLIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目詳細マスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMDTLIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDITMDTLIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用BOMマスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用BOMマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMBOMIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDITMBOMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用BOMマスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用BOMマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDITMBOMIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDITMBOMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用場所マスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用場所マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDLOCIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDLOCIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用場所マスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用場所マスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDLOCIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDLOCIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用カレンダマスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用カレンダマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDCALIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDCALIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用カレンダマスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用カレンダマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDCALIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDCALIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用臨時カレンダマスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用臨時カレンダマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDCALEXTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDCALEXTIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用臨時カレンダマスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用臨時カレンダマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDCALEXTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDCALEXTIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用在庫情報ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用在庫情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDSTKIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用在庫情報ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用在庫情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDSTKIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDSTKIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用入庫予定情報ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用入庫予定情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDGRSCHDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDGRSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用入庫予定情報ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用入庫予定情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDGRSCHDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDGRSCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用出庫予定情報ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用出庫予定情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDGISCHDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDGISCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用出庫予定情報ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用出庫予定情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDGISCHDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDGISCHDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用日次需要情報ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用日次需要情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDDLYDMNDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDDLYDMNDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用日次需要情報ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用日次需要情報ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDDLYDMNDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDDLYDMNDIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目詳細ＢＯＭマスタＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細ＢＯＭマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDDTLBOMIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDDTLBOMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用品目詳細ＢＯＭマスタＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細ＢＯＭマスタＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDDTLBOMIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDDTLBOMIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用オーダ引当ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用オーダ引当ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDORDLNKIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDORDLNKIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用オーダ引当ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用オーダ引当ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDORDLNKIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDORDLNKIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用工程指図実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用工程指図実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDOPEACTIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDOPEACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用工程指図実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用工程指図実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDOPEACTIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDOPEACTIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用実績数量ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用実績数量ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDACTQTYIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.ORDERSENDACTQTYIF.isSame(type);
	}

	/**
	 * 発番システム区分：オーダ送信用実績数量ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用実績数量ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isORDERSENDACTQTYIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.ORDERSENDACTQTYIF.isSame(type);
	}

	/**
	 * 発番システム区分：購買納品書管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買納品書管理ＮＯの値の場合true
	 */
	public static boolean isPURCDLVSLIPMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCDLVSLIPMNG.isSame(type);
	}

	/**
	 * 発番システム区分：購買納品書管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買納品書管理ＮＯの値の場合true
	 */
	public static boolean isPURCDLVSLIPMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCDLVSLIPMNG.isSame(type);
	}

	/**
	 * 発番システム区分：購買納品書明細管理ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買納品書明細管理ＮＯの値の場合true
	 */
	public static boolean isPURCDLVSLIPDMNG(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PURCDLVSLIPDMNG.isSame(type);
	}

	/**
	 * 発番システム区分：購買納品書明細管理ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買納品書明細管理ＮＯの値の場合true
	 */
	public static boolean isPURCDLVSLIPDMNG(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PURCDLVSLIPDMNG.isSame(type);
	}

	/**
	 * 発番システム区分：請求送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isBILLSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：請求送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isBILLSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：請求受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isBILLRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：請求受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isBILLRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：請求受領ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求受領ＮＯの値の場合true
	 */
	public static boolean isBILLRCPT(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：請求受領ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求受領ＮＯの値の場合true
	 */
	public static boolean isBILLRCPT(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLRCPT.isSame(type);
	}

	/**
	 * 発番システム区分：請求受領明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求受領明細ＮＯの値の場合true
	 */
	public static boolean isBILLRCPTD(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLRCPTD.isSame(type);
	}

	/**
	 * 発番システム区分：請求受領明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求受領明細ＮＯの値の場合true
	 */
	public static boolean isBILLRCPTD(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLRCPTD.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isDLVINSTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLVINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isDLVINSTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLVINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納入指示受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isDLVINSTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.DLVINSTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：納入指示受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納入指示受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isDLVINSTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.DLVINSTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：支払通知書履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払通知書履歴ＮＯの値の場合true
	 */
	public static boolean isPAYNTCHISNO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYNTCHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：支払通知書履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払通知書履歴ＮＯの値の場合true
	 */
	public static boolean isPAYNTCHISNO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYNTCHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：支払通知書明細履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が支払通知書明細履歴ＮＯの値の場合true
	 */
	public static boolean isPAYNTCDHISNO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.PAYNTCDHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：支払通知書明細履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が支払通知書明細履歴ＮＯの値の場合true
	 */
	public static boolean isPAYNTCDHISNO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.PAYNTCDHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：請求書履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求書履歴ＮＯの値の場合true
	 */
	public static boolean isBILLHISNO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：請求書履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求書履歴ＮＯの値の場合true
	 */
	public static boolean isBILLHISNO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：請求書明細履歴ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が請求書明細履歴ＮＯの値の場合true
	 */
	public static boolean isBILLDHISNO(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.BILLDHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：請求書明細履歴ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が請求書明細履歴ＮＯの値の場合true
	 */
	public static boolean isBILLDHISNO(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.BILLDHISNO.isSame(type);
	}

	/**
	 * 発番システム区分：検査指図送信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPINSTSENDIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：検査指図送信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査指図送信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPINSTSENDIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPINSTSENDIF.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPACTRECVIF(String value) {
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
		return MSC_NUM_SYS_TYP.INSPACTRECVIF.isSame(type);
	}

	/**
	 * 発番システム区分：検査実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isINSPACTRECVIF(MSC_NUM_SYS_TYP type) {
		return MSC_NUM_SYS_TYP.INSPACTRECVIF.isSame(type);
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
			MSC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.get(value);
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
			MSC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
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
			MSC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.get(value);
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
			MSC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
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
			MSC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.get(value);
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
			MSC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
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
			MSC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.get(value);
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
			MSC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_NUM_SYS_TYP type = MSC_NUM_SYS_TYP.getNE(value);
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
