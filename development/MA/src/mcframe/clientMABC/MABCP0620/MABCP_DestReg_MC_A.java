package mcframe.clientMABC.MABCP0620;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMABC.MABCP0620.MABCP_DestReg_MC.MA_MABCL0620_Srch01Caller;
import mcframe.clientMABC.MABCP0620.MABCP_DestReg_MC.MA_MABCL0620_Upd01Caller;
import mcframe.clientMABC.MABCP0620.MABCP_DestReg_MC.MA_MABCL0620_Del01Caller;

/**
 * 画面"MABCP_DestReg"パネルクラスです。<p>
 *
 * 取引先マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_DestReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0620";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_ein_Label = null;
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public MCTextField Cnd_ein = null;
	public MCLabel Cnd_bp_alt_nm1_Label = null;
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public MCTextField Cnd_bp_alt_nm1 = null;
	public MCLabel Cnd_bp_alt_nm2_Label = null;
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public MCTextField Cnd_bp_alt_nm2 = null;
	public MCLabel Cnd_bp_alt_nm3_Label = null;
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public MCTextField Cnd_bp_alt_nm3 = null;
	public MCLabel Cnd_bp_alt_nm4_Label = null;
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public MCTextField Cnd_bp_alt_nm4 = null;
	public MCLabel Cnd_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Cnd_cntry_nm = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCCheckBox Cnd_foreign_flg = null;
	public MCLabel Cnd_area_cd_Label = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCTextField Cnd_area_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	public MCLabel Cnd_memo4_Label = null;
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCTextField Cnd_memo4 = null;
	public MCLabel Cnd_memo5_Label = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCTextField Cnd_memo5 = null;
	public MCLabel Cnd_memo6_Label = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCTextField Cnd_memo6 = null;
	public MCLabel Cnd_memo7_Label = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCTextField Cnd_memo7 = null;
	public MCLabel Cnd_memo8_Label = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCTextField Cnd_memo8 = null;
	public MCLabel Cnd_memo9_Label = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCTextField Cnd_memo9 = null;
	public MCLabel Cnd_memo10_Label = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCTextField Cnd_memo10 = null;
	public MCLabel Cnd_memo11_Label = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCTextField Cnd_memo11 = null;
	public MCLabel Cnd_memo12_Label = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCTextField Cnd_memo12 = null;
	public MCLabel Cnd_memo13_Label = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCTextField Cnd_memo13 = null;
	public MCLabel Cnd_memo14_Label = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCTextField Cnd_memo14 = null;
	public MCLabel Cnd_memo15_Label = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCTextField Cnd_memo15 = null;
	public MCLabel Cnd_memo16_Label = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCTextField Cnd_memo16 = null;
	public MCLabel Cnd_memo17_Label = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCTextField Cnd_memo17 = null;
	public MCLabel Cnd_memo18_Label = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCTextField Cnd_memo18 = null;
	public MCLabel Cnd_memo19_Label = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCTextField Cnd_memo19 = null;
	public MCLabel Cnd_memo20_Label = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCTextField Cnd_memo20 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	public MCLabel Cnd_bp_grp_cd1_Label = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm1 = null;
	public MCLabel Cnd_bp_grp_cd2_Label = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm2 = null;
	public MCLabel Cnd_bp_grp_cd3_Label = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm3 = null;
	public MCLabel Cnd_bp_grp_cd4_Label = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm4 = null;
	public MCLabel Cnd_bp_grp_cd5_Label = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm5 = null;
	public MCLabel Cnd_bp_grp_cd6_Label = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm6 = null;
	public MCLabel Cnd_bp_grp_cd7_Label = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm7 = null;
	public MCLabel Cnd_bp_grp_cd8_Label = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm8 = null;
	public MCLabel Cnd_bp_grp_cd9_Label = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm9 = null;
	public MCLabel Cnd_bp_grp_cd10_Label = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm10 = null;
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0620.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_nm_lcl = null;
	/**
	 * Standard BP 標準取引先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_nm = null;
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alt_nm1 = null;
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alt_nm2 = null;
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alt_nm3 = null;
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alt_nm4 = null;
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_flg = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_cd = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fax = null;
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ein = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_nm = null;
	/**
	 * Region cd. 地域ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_area_nm = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm1 = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm2 = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm3 = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm4 = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm5 = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm6 = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm7 = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm8 = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm9 = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_grp_nm10 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo4 = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo5 = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo6 = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo7 = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo8 = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo9 = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo10 = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo11 = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo12 = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo13 = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo14 = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo15 = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo16 = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo17 = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo18 = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo19 = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo20 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0620.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_nm = null;
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_alt_nm1 = null;
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_alt_nm2 = null;
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_alt_nm3 = null;
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_bp_alt_nm4 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo4 = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo5 = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo6 = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo7 = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo8 = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo9 = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo10 = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo11 = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo12 = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo13 = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo14 = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo15 = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo16 = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo17 = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo18 = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo19 = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo20 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0620_Srch01]のCallerの作成 */
	protected MABCP_DestReg_MC.MA_MABCL0620_Srch01Caller createMA_MABCL0620_Srch01() {
		MABCP_DestReg_MC.MA_MABCL0620_Srch01Caller<MABCP_DestReg, MA_MABCL0620_Srch01Bridge>
		caller = ((MABCP_DestReg_MC)this).new MA_MABCL0620_Srch01Caller<MABCP_DestReg, MA_MABCL0620_Srch01Bridge>(
					(MABCP_DestReg)this, new MA_MABCL0620_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0620_Srch01]の呼び出し */
	protected void callMA_MABCL0620_Srch01() {
		MCCaller caller = createMA_MABCL0620_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0620_Upd01]のCallerの作成 */
	protected MABCP_DestReg_MC.MA_MABCL0620_Upd01Caller createMA_MABCL0620_Upd01() {
		MABCP_DestReg_MC.MA_MABCL0620_Upd01Caller<MABCP_DestReg, MA_MABCL0620_Upd01Bridge>
		caller = ((MABCP_DestReg_MC)this).new MA_MABCL0620_Upd01Caller<MABCP_DestReg, MA_MABCL0620_Upd01Bridge>(
					(MABCP_DestReg)this, new MA_MABCL0620_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0620_Upd01]の呼び出し */
	protected void callMA_MABCL0620_Upd01() {
		MCCaller caller = createMA_MABCL0620_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0620_Del01]のCallerの作成 */
	protected MABCP_DestReg_MC.MA_MABCL0620_Del01Caller createMA_MABCL0620_Del01() {
		MABCP_DestReg_MC.MA_MABCL0620_Del01Caller<MABCP_DestReg, MA_MABCL0620_Del01Bridge>
		caller = ((MABCP_DestReg_MC)this).new MA_MABCL0620_Del01Caller<MABCP_DestReg, MA_MABCL0620_Del01Bridge>(
					(MABCP_DestReg)this, new MA_MABCL0620_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0620_Del01]の呼び出し */
	protected void callMA_MABCL0620_Del01() {
		MCCaller caller = createMA_MABCL0620_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0620.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0620.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0620.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0620.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0620.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0620.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0620.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0620.MstR createMstR() {
		return mcframe.clientMABC.MABCP0620.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0620.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0620.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0620.CndR createCndR() {
		return mcframe.clientMABC.MABCP0620.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0620.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0620.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0620.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0620.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0620.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0620.LclR createLclR() {
		return mcframe.clientMABC.MABCP0620.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0620.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0620.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0620.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0620.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0620.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0620.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_DestReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_DestReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_DestReg_MC.jbCreateScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateMst((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateTop((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateFold((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateCnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateTab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateTab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateCtrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateDtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateDtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateLclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateLcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateLclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbCreateEastBtn((MABCP_DestReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_DestReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_DestReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_DestReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_DestReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_DestReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_DestReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_DestReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_DestReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_DestReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_DestReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_DestReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_DestReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_DestReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_DestReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_DestReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_DestReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cntry_cd_p = null;

	/**
	 * [Cnd_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cntry_cd_ListPutter() {
		if (Cnd_cntry_cd_p == null) {
			Cnd_cntry_cd_p = createCnd_cntry_cd_ListPutter(Cnd_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Cnd_cntry_cd_p;
	}
	
	
	/** [Cnd_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_area_cd_p = null;

	/**
	 * [Cnd_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_area_cd_ListPutter() {
		if (Cnd_area_cd_p == null) {
			Cnd_area_cd_p = createCnd_area_cd_ListPutter(Cnd_area_cd, "area_cd", "area_nm");

		}
		return Cnd_area_cd_p;
	}
	
	
	/** [Cnd_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd1_p = null;

	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd1_ListPutter() {
		if (Cnd_bp_grp_cd1_p == null) {
			Cnd_bp_grp_cd1_p = createCnd_bp_grp_cd1_ListPutter(Cnd_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Cnd_bp_grp_cd1_p;
	}
	
	
	/** [Cnd_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd2_p = null;

	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd2_ListPutter() {
		if (Cnd_bp_grp_cd2_p == null) {
			Cnd_bp_grp_cd2_p = createCnd_bp_grp_cd2_ListPutter(Cnd_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Cnd_bp_grp_cd2_p;
	}
	
	
	/** [Cnd_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd3_p = null;

	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd3_ListPutter() {
		if (Cnd_bp_grp_cd3_p == null) {
			Cnd_bp_grp_cd3_p = createCnd_bp_grp_cd3_ListPutter(Cnd_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Cnd_bp_grp_cd3_p;
	}
	
	
	/** [Cnd_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd4_p = null;

	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd4_ListPutter() {
		if (Cnd_bp_grp_cd4_p == null) {
			Cnd_bp_grp_cd4_p = createCnd_bp_grp_cd4_ListPutter(Cnd_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Cnd_bp_grp_cd4_p;
	}
	
	
	/** [Cnd_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd5_p = null;

	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd5_ListPutter() {
		if (Cnd_bp_grp_cd5_p == null) {
			Cnd_bp_grp_cd5_p = createCnd_bp_grp_cd5_ListPutter(Cnd_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Cnd_bp_grp_cd5_p;
	}
	
	
	/** [Cnd_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd6_p = null;

	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd6_ListPutter() {
		if (Cnd_bp_grp_cd6_p == null) {
			Cnd_bp_grp_cd6_p = createCnd_bp_grp_cd6_ListPutter(Cnd_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Cnd_bp_grp_cd6_p;
	}
	
	
	/** [Cnd_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd7_p = null;

	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd7_ListPutter() {
		if (Cnd_bp_grp_cd7_p == null) {
			Cnd_bp_grp_cd7_p = createCnd_bp_grp_cd7_ListPutter(Cnd_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Cnd_bp_grp_cd7_p;
	}
	
	
	/** [Cnd_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd8_p = null;

	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd8_ListPutter() {
		if (Cnd_bp_grp_cd8_p == null) {
			Cnd_bp_grp_cd8_p = createCnd_bp_grp_cd8_ListPutter(Cnd_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Cnd_bp_grp_cd8_p;
	}
	
	
	/** [Cnd_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd9_p = null;

	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd9_ListPutter() {
		if (Cnd_bp_grp_cd9_p == null) {
			Cnd_bp_grp_cd9_p = createCnd_bp_grp_cd9_ListPutter(Cnd_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Cnd_bp_grp_cd9_p;
	}
	
	
	/** [Cnd_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd10_p = null;

	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd10_ListPutter() {
		if (Cnd_bp_grp_cd10_p == null) {
			Cnd_bp_grp_cd10_p = createCnd_bp_grp_cd10_ListPutter(Cnd_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Cnd_bp_grp_cd10_p;
	}
	
	
	/** [Dtl_cntry_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cntry_cd_p = null;

	/**
	 * [Dtl_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cntry_cd_ListPutter() {
		if (Dtl_cntry_cd_p == null) {
			Dtl_cntry_cd_p = createDtl_cntry_cd_ListPutter(columnDtl_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return Dtl_cntry_cd_p;
	}
	
	
	/** [Dtl_area_cd_ListPutter]の定義 */
	private MCListPutter Dtl_area_cd_p = null;

	/**
	 * [Dtl_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_area_cd_ListPutter() {
		if (Dtl_area_cd_p == null) {
			Dtl_area_cd_p = createDtl_area_cd_ListPutter(columnDtl_area_cd, "area_cd", "area_nm");

		}
		return Dtl_area_cd_p;
	}
	
	
	/** [Dtl_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd1_p = null;

	/**
	 * [Dtl_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd1_ListPutter() {
		if (Dtl_bp_grp_cd1_p == null) {
			Dtl_bp_grp_cd1_p = createDtl_bp_grp_cd1_ListPutter(columnDtl_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Dtl_bp_grp_cd1_p;
	}
	
	
	/** [Dtl_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd2_p = null;

	/**
	 * [Dtl_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd2_ListPutter() {
		if (Dtl_bp_grp_cd2_p == null) {
			Dtl_bp_grp_cd2_p = createDtl_bp_grp_cd2_ListPutter(columnDtl_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Dtl_bp_grp_cd2_p;
	}
	
	
	/** [Dtl_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd3_p = null;

	/**
	 * [Dtl_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd3_ListPutter() {
		if (Dtl_bp_grp_cd3_p == null) {
			Dtl_bp_grp_cd3_p = createDtl_bp_grp_cd3_ListPutter(columnDtl_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Dtl_bp_grp_cd3_p;
	}
	
	
	/** [Dtl_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd4_p = null;

	/**
	 * [Dtl_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd4_ListPutter() {
		if (Dtl_bp_grp_cd4_p == null) {
			Dtl_bp_grp_cd4_p = createDtl_bp_grp_cd4_ListPutter(columnDtl_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Dtl_bp_grp_cd4_p;
	}
	
	
	/** [Dtl_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd5_p = null;

	/**
	 * [Dtl_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd5_ListPutter() {
		if (Dtl_bp_grp_cd5_p == null) {
			Dtl_bp_grp_cd5_p = createDtl_bp_grp_cd5_ListPutter(columnDtl_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Dtl_bp_grp_cd5_p;
	}
	
	
	/** [Dtl_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd6_p = null;

	/**
	 * [Dtl_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd6_ListPutter() {
		if (Dtl_bp_grp_cd6_p == null) {
			Dtl_bp_grp_cd6_p = createDtl_bp_grp_cd6_ListPutter(columnDtl_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Dtl_bp_grp_cd6_p;
	}
	
	
	/** [Dtl_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd7_p = null;

	/**
	 * [Dtl_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd7_ListPutter() {
		if (Dtl_bp_grp_cd7_p == null) {
			Dtl_bp_grp_cd7_p = createDtl_bp_grp_cd7_ListPutter(columnDtl_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Dtl_bp_grp_cd7_p;
	}
	
	
	/** [Dtl_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd8_p = null;

	/**
	 * [Dtl_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd8_ListPutter() {
		if (Dtl_bp_grp_cd8_p == null) {
			Dtl_bp_grp_cd8_p = createDtl_bp_grp_cd8_ListPutter(columnDtl_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Dtl_bp_grp_cd8_p;
	}
	
	
	/** [Dtl_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd9_p = null;

	/**
	 * [Dtl_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd9_ListPutter() {
		if (Dtl_bp_grp_cd9_p == null) {
			Dtl_bp_grp_cd9_p = createDtl_bp_grp_cd9_ListPutter(columnDtl_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Dtl_bp_grp_cd9_p;
	}
	
	
	/** [Dtl_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Dtl_bp_grp_cd10_p = null;

	/**
	 * [Dtl_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_grp_cd10_ListPutter() {
		if (Dtl_bp_grp_cd10_p == null) {
			Dtl_bp_grp_cd10_p = createDtl_bp_grp_cd10_ListPutter(columnDtl_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Dtl_bp_grp_cd10_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_DestReg create(){
		MABCP_DestReg p = new MABCP_DestReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_DestReg create(String name){
		MABCP_DestReg p = new MABCP_DestReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MABCP_DestReg_MC.jbfInitScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitMst((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitTop((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitFold((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitCnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitTab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitTab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitCtrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitDtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitDtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitLclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitLcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitLclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbfInitEastBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitMst((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitTop((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitFold((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitCnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitTab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitTab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitCtrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitDtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitDtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitLclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitLcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitLclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.jbInitEastBtn((MABCP_DestReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_ein_Label = p.beansFactory.createLabel("Cnd.ein_Label");
		p.Cnd_ein = p.beansFactory.createTextField("Cnd.ein");
		p.Cnd_ein.setLabel(p.Cnd_ein_Label);
		p.Cnd_bp_alt_nm1_Label = p.beansFactory.createLabel("Cnd.bp_alt_nm1_Label");
		p.Cnd_bp_alt_nm1 = p.beansFactory.createTextField("Cnd.bp_alt_nm1");
		p.Cnd_bp_alt_nm1.setLabel(p.Cnd_bp_alt_nm1_Label);
		p.Cnd_bp_alt_nm2_Label = p.beansFactory.createLabel("Cnd.bp_alt_nm2_Label");
		p.Cnd_bp_alt_nm2 = p.beansFactory.createTextField("Cnd.bp_alt_nm2");
		p.Cnd_bp_alt_nm2.setLabel(p.Cnd_bp_alt_nm2_Label);
		p.Cnd_bp_alt_nm3_Label = p.beansFactory.createLabel("Cnd.bp_alt_nm3_Label");
		p.Cnd_bp_alt_nm3 = p.beansFactory.createTextField("Cnd.bp_alt_nm3");
		p.Cnd_bp_alt_nm3.setLabel(p.Cnd_bp_alt_nm3_Label);
		p.Cnd_bp_alt_nm4_Label = p.beansFactory.createLabel("Cnd.bp_alt_nm4_Label");
		p.Cnd_bp_alt_nm4 = p.beansFactory.createTextField("Cnd.bp_alt_nm4");
		p.Cnd_bp_alt_nm4.setLabel(p.Cnd_bp_alt_nm4_Label);
		p.Cnd_cntry_cd_Label = p.beansFactory.createLabel("Cnd.cntry_cd_Label");
		p.Cnd_cntry_cd = p.beansFactory.createTextComboBox("Cnd.cntry_cd");
		p.Cnd_cntry_cd.setLabel(p.Cnd_cntry_cd_Label);
		p.Cnd_cntry_nm = p.beansFactory.createTextField("Cnd.cntry_nm");
		p.Cnd_foreign_flg = p.beansFactory.createCheckBox("Cnd.foreign_flg");
		p.Cnd_area_cd_Label = p.beansFactory.createLabel("Cnd.area_cd_Label");
		p.Cnd_area_cd = p.beansFactory.createTextComboBox("Cnd.area_cd");
		p.Cnd_area_cd.setLabel(p.Cnd_area_cd_Label);
		p.Cnd_area_nm = p.beansFactory.createTextField("Cnd.area_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_memo4_Label = p.beansFactory.createLabel("Cnd.memo4_Label");
		p.Cnd_memo4 = p.beansFactory.createTextField("Cnd.memo4");
		p.Cnd_memo4.setLabel(p.Cnd_memo4_Label);
		p.Cnd_memo5_Label = p.beansFactory.createLabel("Cnd.memo5_Label");
		p.Cnd_memo5 = p.beansFactory.createTextField("Cnd.memo5");
		p.Cnd_memo5.setLabel(p.Cnd_memo5_Label);
		p.Cnd_memo6_Label = p.beansFactory.createLabel("Cnd.memo6_Label");
		p.Cnd_memo6 = p.beansFactory.createTextField("Cnd.memo6");
		p.Cnd_memo6.setLabel(p.Cnd_memo6_Label);
		p.Cnd_memo7_Label = p.beansFactory.createLabel("Cnd.memo7_Label");
		p.Cnd_memo7 = p.beansFactory.createTextField("Cnd.memo7");
		p.Cnd_memo7.setLabel(p.Cnd_memo7_Label);
		p.Cnd_memo8_Label = p.beansFactory.createLabel("Cnd.memo8_Label");
		p.Cnd_memo8 = p.beansFactory.createTextField("Cnd.memo8");
		p.Cnd_memo8.setLabel(p.Cnd_memo8_Label);
		p.Cnd_memo9_Label = p.beansFactory.createLabel("Cnd.memo9_Label");
		p.Cnd_memo9 = p.beansFactory.createTextField("Cnd.memo9");
		p.Cnd_memo9.setLabel(p.Cnd_memo9_Label);
		p.Cnd_memo10_Label = p.beansFactory.createLabel("Cnd.memo10_Label");
		p.Cnd_memo10 = p.beansFactory.createTextField("Cnd.memo10");
		p.Cnd_memo10.setLabel(p.Cnd_memo10_Label);
		p.Cnd_memo11_Label = p.beansFactory.createLabel("Cnd.memo11_Label");
		p.Cnd_memo11 = p.beansFactory.createTextField("Cnd.memo11");
		p.Cnd_memo11.setLabel(p.Cnd_memo11_Label);
		p.Cnd_memo12_Label = p.beansFactory.createLabel("Cnd.memo12_Label");
		p.Cnd_memo12 = p.beansFactory.createTextField("Cnd.memo12");
		p.Cnd_memo12.setLabel(p.Cnd_memo12_Label);
		p.Cnd_memo13_Label = p.beansFactory.createLabel("Cnd.memo13_Label");
		p.Cnd_memo13 = p.beansFactory.createTextField("Cnd.memo13");
		p.Cnd_memo13.setLabel(p.Cnd_memo13_Label);
		p.Cnd_memo14_Label = p.beansFactory.createLabel("Cnd.memo14_Label");
		p.Cnd_memo14 = p.beansFactory.createTextField("Cnd.memo14");
		p.Cnd_memo14.setLabel(p.Cnd_memo14_Label);
		p.Cnd_memo15_Label = p.beansFactory.createLabel("Cnd.memo15_Label");
		p.Cnd_memo15 = p.beansFactory.createTextField("Cnd.memo15");
		p.Cnd_memo15.setLabel(p.Cnd_memo15_Label);
		p.Cnd_memo16_Label = p.beansFactory.createLabel("Cnd.memo16_Label");
		p.Cnd_memo16 = p.beansFactory.createTextField("Cnd.memo16");
		p.Cnd_memo16.setLabel(p.Cnd_memo16_Label);
		p.Cnd_memo17_Label = p.beansFactory.createLabel("Cnd.memo17_Label");
		p.Cnd_memo17 = p.beansFactory.createTextField("Cnd.memo17");
		p.Cnd_memo17.setLabel(p.Cnd_memo17_Label);
		p.Cnd_memo18_Label = p.beansFactory.createLabel("Cnd.memo18_Label");
		p.Cnd_memo18 = p.beansFactory.createTextField("Cnd.memo18");
		p.Cnd_memo18.setLabel(p.Cnd_memo18_Label);
		p.Cnd_memo19_Label = p.beansFactory.createLabel("Cnd.memo19_Label");
		p.Cnd_memo19 = p.beansFactory.createTextField("Cnd.memo19");
		p.Cnd_memo19.setLabel(p.Cnd_memo19_Label);
		p.Cnd_memo20_Label = p.beansFactory.createLabel("Cnd.memo20_Label");
		p.Cnd_memo20 = p.beansFactory.createTextField("Cnd.memo20");
		p.Cnd_memo20.setLabel(p.Cnd_memo20_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
		p.Cnd_bp_grp_cd1_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd1_Label");
		p.Cnd_bp_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd1");
		p.Cnd_bp_grp_cd1.setLabel(p.Cnd_bp_grp_cd1_Label);
		p.Cnd_bp_grp_nm1 = p.beansFactory.createTextField("Cnd.bp_grp_nm1");
		p.Cnd_bp_grp_cd2_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd2_Label");
		p.Cnd_bp_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd2");
		p.Cnd_bp_grp_cd2.setLabel(p.Cnd_bp_grp_cd2_Label);
		p.Cnd_bp_grp_nm2 = p.beansFactory.createTextField("Cnd.bp_grp_nm2");
		p.Cnd_bp_grp_cd3_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd3_Label");
		p.Cnd_bp_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd3");
		p.Cnd_bp_grp_cd3.setLabel(p.Cnd_bp_grp_cd3_Label);
		p.Cnd_bp_grp_nm3 = p.beansFactory.createTextField("Cnd.bp_grp_nm3");
		p.Cnd_bp_grp_cd4_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd4_Label");
		p.Cnd_bp_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd4");
		p.Cnd_bp_grp_cd4.setLabel(p.Cnd_bp_grp_cd4_Label);
		p.Cnd_bp_grp_nm4 = p.beansFactory.createTextField("Cnd.bp_grp_nm4");
		p.Cnd_bp_grp_cd5_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd5_Label");
		p.Cnd_bp_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd5");
		p.Cnd_bp_grp_cd5.setLabel(p.Cnd_bp_grp_cd5_Label);
		p.Cnd_bp_grp_nm5 = p.beansFactory.createTextField("Cnd.bp_grp_nm5");
		p.Cnd_bp_grp_cd6_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd6_Label");
		p.Cnd_bp_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd6");
		p.Cnd_bp_grp_cd6.setLabel(p.Cnd_bp_grp_cd6_Label);
		p.Cnd_bp_grp_nm6 = p.beansFactory.createTextField("Cnd.bp_grp_nm6");
		p.Cnd_bp_grp_cd7_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd7_Label");
		p.Cnd_bp_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd7");
		p.Cnd_bp_grp_cd7.setLabel(p.Cnd_bp_grp_cd7_Label);
		p.Cnd_bp_grp_nm7 = p.beansFactory.createTextField("Cnd.bp_grp_nm7");
		p.Cnd_bp_grp_cd8_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd8_Label");
		p.Cnd_bp_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd8");
		p.Cnd_bp_grp_cd8.setLabel(p.Cnd_bp_grp_cd8_Label);
		p.Cnd_bp_grp_nm8 = p.beansFactory.createTextField("Cnd.bp_grp_nm8");
		p.Cnd_bp_grp_cd9_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd9_Label");
		p.Cnd_bp_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd9");
		p.Cnd_bp_grp_cd9.setLabel(p.Cnd_bp_grp_cd9_Label);
		p.Cnd_bp_grp_nm9 = p.beansFactory.createTextField("Cnd.bp_grp_nm9");
		p.Cnd_bp_grp_cd10_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd10_Label");
		p.Cnd_bp_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd10");
		p.Cnd_bp_grp_cd10.setLabel(p.Cnd_bp_grp_cd10_Label);
		p.Cnd_bp_grp_nm10 = p.beansFactory.createTextField("Cnd.bp_grp_nm10");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_bp_cd = p.beansFactory.createTableColumn("Dtl.bp_cd", MCColumnType.TEXT);
		p.columnDtl_bp_nm_lcl = p.beansFactory.createTableColumn("Dtl.bp_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_bp_nm = p.beansFactory.createTableColumn("Dtl.bp_nm", MCColumnType.TEXT);
		p.columnDtl_bp_alt_nm1 = p.beansFactory.createTableColumn("Dtl.bp_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_bp_alt_nm2 = p.beansFactory.createTableColumn("Dtl.bp_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_bp_alt_nm3 = p.beansFactory.createTableColumn("Dtl.bp_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_bp_alt_nm4 = p.beansFactory.createTableColumn("Dtl.bp_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_dest_flg = p.beansFactory.createTableColumn("Dtl.dest_flg", MCColumnType.CHECK);
		p.columnDtl_cur_cd = p.beansFactory.createTableColumn("Dtl.cur_cd", MCColumnType.TEXT);
		p.columnDtl_zip_cd = p.beansFactory.createTableColumn("Dtl.zip_cd", MCColumnType.TEXT);
		p.columnDtl_addr1 = p.beansFactory.createTableColumn("Dtl.addr1", MCColumnType.TEXT);
		p.columnDtl_addr2 = p.beansFactory.createTableColumn("Dtl.addr2", MCColumnType.TEXT);
		p.columnDtl_addr3 = p.beansFactory.createTableColumn("Dtl.addr3", MCColumnType.TEXT);
		p.columnDtl_addr4 = p.beansFactory.createTableColumn("Dtl.addr4", MCColumnType.TEXT);
		p.columnDtl_tel = p.beansFactory.createTableColumn("Dtl.tel", MCColumnType.TEXT);
		p.columnDtl_fax = p.beansFactory.createTableColumn("Dtl.fax", MCColumnType.TEXT);
		p.columnDtl_ein = p.beansFactory.createTableColumn("Dtl.ein", MCColumnType.TEXT);
		p.columnDtl_cntry_cd = p.beansFactory.createTableColumn("Dtl.cntry_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntry_nm = p.beansFactory.createTableColumn("Dtl.cntry_nm", MCColumnType.TEXT);
		p.columnDtl_area_cd = p.beansFactory.createTableColumn("Dtl.area_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_area_nm = p.beansFactory.createTableColumn("Dtl.area_nm", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd1 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm1 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm1", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd2 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm2 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm2", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd3 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm3 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm3", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd4 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm4 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm4", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd5 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm5 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm5", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd6 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm6 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm6", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd7 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm7 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm7", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd8 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm8 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm8", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd9 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm9 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm9", MCColumnType.TEXT);
		p.columnDtl_bp_grp_cd10 = p.beansFactory.createTableColumn("Dtl.bp_grp_cd10", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_grp_nm10 = p.beansFactory.createTableColumn("Dtl.bp_grp_nm10", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_memo4 = p.beansFactory.createTableColumn("Dtl.memo4", MCColumnType.TEXT);
		p.columnDtl_memo5 = p.beansFactory.createTableColumn("Dtl.memo5", MCColumnType.TEXT);
		p.columnDtl_memo6 = p.beansFactory.createTableColumn("Dtl.memo6", MCColumnType.TEXT);
		p.columnDtl_memo7 = p.beansFactory.createTableColumn("Dtl.memo7", MCColumnType.TEXT);
		p.columnDtl_memo8 = p.beansFactory.createTableColumn("Dtl.memo8", MCColumnType.TEXT);
		p.columnDtl_memo9 = p.beansFactory.createTableColumn("Dtl.memo9", MCColumnType.TEXT);
		p.columnDtl_memo10 = p.beansFactory.createTableColumn("Dtl.memo10", MCColumnType.TEXT);
		p.columnDtl_memo11 = p.beansFactory.createTableColumn("Dtl.memo11", MCColumnType.TEXT);
		p.columnDtl_memo12 = p.beansFactory.createTableColumn("Dtl.memo12", MCColumnType.TEXT);
		p.columnDtl_memo13 = p.beansFactory.createTableColumn("Dtl.memo13", MCColumnType.TEXT);
		p.columnDtl_memo14 = p.beansFactory.createTableColumn("Dtl.memo14", MCColumnType.TEXT);
		p.columnDtl_memo15 = p.beansFactory.createTableColumn("Dtl.memo15", MCColumnType.TEXT);
		p.columnDtl_memo16 = p.beansFactory.createTableColumn("Dtl.memo16", MCColumnType.TEXT);
		p.columnDtl_memo17 = p.beansFactory.createTableColumn("Dtl.memo17", MCColumnType.TEXT);
		p.columnDtl_memo18 = p.beansFactory.createTableColumn("Dtl.memo18", MCColumnType.TEXT);
		p.columnDtl_memo19 = p.beansFactory.createTableColumn("Dtl.memo19", MCColumnType.TEXT);
		p.columnDtl_memo20 = p.beansFactory.createTableColumn("Dtl.memo20", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_bp_cd = p.beansFactory.createTableColumn("Lcl.bp_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_bp_nm = p.beansFactory.createTableColumn("Lcl.bp_nm", MCColumnType.TEXT);
		p.columnLcl_bp_alt_nm1 = p.beansFactory.createTableColumn("Lcl.bp_alt_nm1", MCColumnType.TEXT);
		p.columnLcl_bp_alt_nm2 = p.beansFactory.createTableColumn("Lcl.bp_alt_nm2", MCColumnType.TEXT);
		p.columnLcl_bp_alt_nm3 = p.beansFactory.createTableColumn("Lcl.bp_alt_nm3", MCColumnType.TEXT);
		p.columnLcl_bp_alt_nm4 = p.beansFactory.createTableColumn("Lcl.bp_alt_nm4", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_memo4 = p.beansFactory.createTableColumn("Lcl.memo4", MCColumnType.TEXT);
		p.columnLcl_memo5 = p.beansFactory.createTableColumn("Lcl.memo5", MCColumnType.TEXT);
		p.columnLcl_memo6 = p.beansFactory.createTableColumn("Lcl.memo6", MCColumnType.TEXT);
		p.columnLcl_memo7 = p.beansFactory.createTableColumn("Lcl.memo7", MCColumnType.TEXT);
		p.columnLcl_memo8 = p.beansFactory.createTableColumn("Lcl.memo8", MCColumnType.TEXT);
		p.columnLcl_memo9 = p.beansFactory.createTableColumn("Lcl.memo9", MCColumnType.TEXT);
		p.columnLcl_memo10 = p.beansFactory.createTableColumn("Lcl.memo10", MCColumnType.TEXT);
		p.columnLcl_memo11 = p.beansFactory.createTableColumn("Lcl.memo11", MCColumnType.TEXT);
		p.columnLcl_memo12 = p.beansFactory.createTableColumn("Lcl.memo12", MCColumnType.TEXT);
		p.columnLcl_memo13 = p.beansFactory.createTableColumn("Lcl.memo13", MCColumnType.TEXT);
		p.columnLcl_memo14 = p.beansFactory.createTableColumn("Lcl.memo14", MCColumnType.TEXT);
		p.columnLcl_memo15 = p.beansFactory.createTableColumn("Lcl.memo15", MCColumnType.TEXT);
		p.columnLcl_memo16 = p.beansFactory.createTableColumn("Lcl.memo16", MCColumnType.TEXT);
		p.columnLcl_memo17 = p.beansFactory.createTableColumn("Lcl.memo17", MCColumnType.TEXT);
		p.columnLcl_memo18 = p.beansFactory.createTableColumn("Lcl.memo18", MCColumnType.TEXT);
		p.columnLcl_memo19 = p.beansFactory.createTableColumn("Lcl.memo19", MCColumnType.TEXT);
		p.columnLcl_memo20 = p.beansFactory.createTableColumn("Lcl.memo20", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0620.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CndPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.WrkPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.ope_META);
		p.Tab1Panel.add(p.Cnd_bp_cd_Label);
		p.Tab1Panel.add(p.Cnd_bp_cd);
		p.Tab1Panel.setLastBeans(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.Tab1Panel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ein);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Tab1Panel.add(p.Cnd_ein_Label);
		p.Tab1Panel.add(p.Cnd_ein);
		p.Cnd_ein.setNextBeans(p.Cnd_bp_alt_nm1);
		p.Cnd_ein.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.ein_META);
		p.setPluralValueEnable(p.Cnd_ein, true);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm1_Label);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm1);
		p.Cnd_bp_alt_nm1.setNextBeans(p.Cnd_bp_alt_nm2);
		p.Cnd_bp_alt_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm1, true);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm2_Label);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm2);
		p.Cnd_bp_alt_nm2.setNextBeans(p.Cnd_bp_alt_nm3);
		p.Cnd_bp_alt_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm2, true);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm3_Label);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm3);
		p.Cnd_bp_alt_nm3.setNextBeans(p.Cnd_bp_alt_nm4);
		p.Cnd_bp_alt_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm3, true);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm4_Label);
		p.Tab1Panel.add(p.Cnd_bp_alt_nm4);
		p.Cnd_bp_alt_nm4.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_bp_alt_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm4, true);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.Tab1Panel.add(p.Cnd_cntry_cd_Label);
		p.Tab1Panel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.cntry_cd_META);
		p.Tab1Panel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.Tab1Panel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setNextBeans(p.Cnd_area_cd);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.foreign_flg_META);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.Tab1Panel.add(p.Cnd_area_cd_Label);
		p.Tab1Panel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.area_cd_META);
		p.Tab1Panel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_memo4);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_memo4_Label);
		p.Tab1Panel.add(p.Cnd_memo4);
		p.Cnd_memo4.setNextBeans(p.Cnd_memo5);
		p.Cnd_memo4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo4_META);
		p.setPluralValueEnable(p.Cnd_memo4, true);
		p.Tab1Panel.add(p.Cnd_memo5_Label);
		p.Tab1Panel.add(p.Cnd_memo5);
		p.Cnd_memo5.setNextBeans(p.Cnd_memo6);
		p.Cnd_memo5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo5_META);
		p.setPluralValueEnable(p.Cnd_memo5, true);
		p.Tab1Panel.add(p.Cnd_memo6_Label);
		p.Tab1Panel.add(p.Cnd_memo6);
		p.Cnd_memo6.setNextBeans(p.Cnd_memo7);
		p.Cnd_memo6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo6_META);
		p.setPluralValueEnable(p.Cnd_memo6, true);
		p.Tab1Panel.add(p.Cnd_memo7_Label);
		p.Tab1Panel.add(p.Cnd_memo7);
		p.Cnd_memo7.setNextBeans(p.Cnd_memo8);
		p.Cnd_memo7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo7_META);
		p.setPluralValueEnable(p.Cnd_memo7, true);
		p.Tab1Panel.add(p.Cnd_memo8_Label);
		p.Tab1Panel.add(p.Cnd_memo8);
		p.Cnd_memo8.setNextBeans(p.Cnd_memo9);
		p.Cnd_memo8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo8_META);
		p.setPluralValueEnable(p.Cnd_memo8, true);
		p.Tab1Panel.add(p.Cnd_memo9_Label);
		p.Tab1Panel.add(p.Cnd_memo9);
		p.Cnd_memo9.setNextBeans(p.Cnd_memo10);
		p.Cnd_memo9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo9_META);
		p.setPluralValueEnable(p.Cnd_memo9, true);
		p.Tab1Panel.add(p.Cnd_memo10_Label);
		p.Tab1Panel.add(p.Cnd_memo10);
		p.Cnd_memo10.setNextBeans(p.Cnd_memo11);
		p.Cnd_memo10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo10_META);
		p.setPluralValueEnable(p.Cnd_memo10, true);
		p.Tab1Panel.add(p.Cnd_memo11_Label);
		p.Tab1Panel.add(p.Cnd_memo11);
		p.Cnd_memo11.setNextBeans(p.Cnd_memo12);
		p.Cnd_memo11.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo11_META);
		p.setPluralValueEnable(p.Cnd_memo11, true);
		p.Tab1Panel.add(p.Cnd_memo12_Label);
		p.Tab1Panel.add(p.Cnd_memo12);
		p.Cnd_memo12.setNextBeans(p.Cnd_memo13);
		p.Cnd_memo12.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo12_META);
		p.setPluralValueEnable(p.Cnd_memo12, true);
		p.Tab1Panel.add(p.Cnd_memo13_Label);
		p.Tab1Panel.add(p.Cnd_memo13);
		p.Cnd_memo13.setNextBeans(p.Cnd_memo14);
		p.Cnd_memo13.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo13_META);
		p.setPluralValueEnable(p.Cnd_memo13, true);
		p.Tab1Panel.add(p.Cnd_memo14_Label);
		p.Tab1Panel.add(p.Cnd_memo14);
		p.Cnd_memo14.setNextBeans(p.Cnd_memo15);
		p.Cnd_memo14.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo14_META);
		p.setPluralValueEnable(p.Cnd_memo14, true);
		p.Tab1Panel.add(p.Cnd_memo15_Label);
		p.Tab1Panel.add(p.Cnd_memo15);
		p.Cnd_memo15.setNextBeans(p.Cnd_memo16);
		p.Cnd_memo15.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo15_META);
		p.setPluralValueEnable(p.Cnd_memo15, true);
		p.Tab1Panel.add(p.Cnd_memo16_Label);
		p.Tab1Panel.add(p.Cnd_memo16);
		p.Cnd_memo16.setNextBeans(p.Cnd_memo17);
		p.Cnd_memo16.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo16_META);
		p.setPluralValueEnable(p.Cnd_memo16, true);
		p.Tab1Panel.add(p.Cnd_memo17_Label);
		p.Tab1Panel.add(p.Cnd_memo17);
		p.Cnd_memo17.setNextBeans(p.Cnd_memo18);
		p.Cnd_memo17.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo17_META);
		p.setPluralValueEnable(p.Cnd_memo17, true);
		p.Tab1Panel.add(p.Cnd_memo18_Label);
		p.Tab1Panel.add(p.Cnd_memo18);
		p.Cnd_memo18.setNextBeans(p.Cnd_memo19);
		p.Cnd_memo18.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo18_META);
		p.setPluralValueEnable(p.Cnd_memo18, true);
		p.Tab1Panel.add(p.Cnd_memo19_Label);
		p.Tab1Panel.add(p.Cnd_memo19);
		p.Cnd_memo19.setNextBeans(p.Cnd_memo20);
		p.Cnd_memo19.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo19_META);
		p.setPluralValueEnable(p.Cnd_memo19, true);
		p.Tab1Panel.add(p.Cnd_memo20_Label);
		p.Tab1Panel.add(p.Cnd_memo20);
		p.Cnd_memo20.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo20.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.memo20_META);
		p.setPluralValueEnable(p.Cnd_memo20, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.on_del_flg_META);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0620.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_DestReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_DestReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABCP_DestReg_MC.mcInitScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitMst((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitTop((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitFold((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitCnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitTab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitTab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitCtrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitDtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitDtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitLclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitLcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitLclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.mcInitEastBtn((MABCP_DestReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_DestReg_MC.statusInitUPD_ScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Mst((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Top((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Fold((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Cnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Tab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Tab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Ctrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Wrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Dtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_DtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_LclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Lcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_LclAll((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_LclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_Btn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitUPD_EastBtn((MABCP_DestReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_DestReg_MC.statusInitFIX_ScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Mst((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Top((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Fold((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Cnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Tab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Tab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Ctrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Wrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Dtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_DtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_LclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Lcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_LclAll((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_LclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_Btn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitFIX_EastBtn((MABCP_DestReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_DestReg_MC.statusInitDEL_ScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Mst((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Top((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Fold((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Cnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Tab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Tab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Ctrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Wrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Dtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_DtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_LclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Lcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_LclAll((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_LclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_Btn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitDEL_EastBtn((MABCP_DestReg)this);

		// [REF]ステータスのモードの設定
		MABCP_DestReg_MC.statusInitREF_ScreenOpe((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Mst((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Top((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Fold((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Cnd((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Tab1((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Tab2((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Ctrl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Wrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Dtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_DtlBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_LclWrk((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Lcl((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_LclAll((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_LclBtn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_Btn((MABCP_DestReg)this);
		MABCP_DestReg_MC.statusInitREF_EastBtn((MABCP_DestReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_DestReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_DestReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_DestReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_DestReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_DestReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_ein.setListListener(p);
		p.Cnd_ein.addAllListener(p);
		p.Cnd_bp_alt_nm1.setListListener(p);
		p.Cnd_bp_alt_nm1.addAllListener(p);
		p.Cnd_bp_alt_nm2.setListListener(p);
		p.Cnd_bp_alt_nm2.addAllListener(p);
		p.Cnd_bp_alt_nm3.setListListener(p);
		p.Cnd_bp_alt_nm3.addAllListener(p);
		p.Cnd_bp_alt_nm4.setListListener(p);
		p.Cnd_bp_alt_nm4.addAllListener(p);
		p.Cnd_cntry_cd.setListListener(p);
		p.Cnd_cntry_cd.addAllListener(p);
		p.Cnd_cntry_nm.setListListener(p);
		p.Cnd_cntry_nm.addAllListener(p);
		p.Cnd_foreign_flg.addAllListener(p);
		p.Cnd_area_cd.setListListener(p);
		p.Cnd_area_cd.addAllListener(p);
		p.Cnd_area_nm.setListListener(p);
		p.Cnd_area_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_memo4.setListListener(p);
		p.Cnd_memo4.addAllListener(p);
		p.Cnd_memo5.setListListener(p);
		p.Cnd_memo5.addAllListener(p);
		p.Cnd_memo6.setListListener(p);
		p.Cnd_memo6.addAllListener(p);
		p.Cnd_memo7.setListListener(p);
		p.Cnd_memo7.addAllListener(p);
		p.Cnd_memo8.setListListener(p);
		p.Cnd_memo8.addAllListener(p);
		p.Cnd_memo9.setListListener(p);
		p.Cnd_memo9.addAllListener(p);
		p.Cnd_memo10.setListListener(p);
		p.Cnd_memo10.addAllListener(p);
		p.Cnd_memo11.setListListener(p);
		p.Cnd_memo11.addAllListener(p);
		p.Cnd_memo12.setListListener(p);
		p.Cnd_memo12.addAllListener(p);
		p.Cnd_memo13.setListListener(p);
		p.Cnd_memo13.addAllListener(p);
		p.Cnd_memo14.setListListener(p);
		p.Cnd_memo14.addAllListener(p);
		p.Cnd_memo15.setListListener(p);
		p.Cnd_memo15.addAllListener(p);
		p.Cnd_memo16.setListListener(p);
		p.Cnd_memo16.addAllListener(p);
		p.Cnd_memo17.setListListener(p);
		p.Cnd_memo17.addAllListener(p);
		p.Cnd_memo18.setListListener(p);
		p.Cnd_memo18.addAllListener(p);
		p.Cnd_memo19.setListListener(p);
		p.Cnd_memo19.addAllListener(p);
		p.Cnd_memo20.setListListener(p);
		p.Cnd_memo20.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_bp_grp_cd1.setListListener(p);
		p.Cnd_bp_grp_cd1.addAllListener(p);
		p.Cnd_bp_grp_nm1.setListListener(p);
		p.Cnd_bp_grp_nm1.addAllListener(p);
		p.Cnd_bp_grp_cd2.setListListener(p);
		p.Cnd_bp_grp_cd2.addAllListener(p);
		p.Cnd_bp_grp_nm2.setListListener(p);
		p.Cnd_bp_grp_nm2.addAllListener(p);
		p.Cnd_bp_grp_cd3.setListListener(p);
		p.Cnd_bp_grp_cd3.addAllListener(p);
		p.Cnd_bp_grp_nm3.setListListener(p);
		p.Cnd_bp_grp_nm3.addAllListener(p);
		p.Cnd_bp_grp_cd4.setListListener(p);
		p.Cnd_bp_grp_cd4.addAllListener(p);
		p.Cnd_bp_grp_nm4.setListListener(p);
		p.Cnd_bp_grp_nm4.addAllListener(p);
		p.Cnd_bp_grp_cd5.setListListener(p);
		p.Cnd_bp_grp_cd5.addAllListener(p);
		p.Cnd_bp_grp_nm5.setListListener(p);
		p.Cnd_bp_grp_nm5.addAllListener(p);
		p.Cnd_bp_grp_cd6.setListListener(p);
		p.Cnd_bp_grp_cd6.addAllListener(p);
		p.Cnd_bp_grp_nm6.setListListener(p);
		p.Cnd_bp_grp_nm6.addAllListener(p);
		p.Cnd_bp_grp_cd7.setListListener(p);
		p.Cnd_bp_grp_cd7.addAllListener(p);
		p.Cnd_bp_grp_nm7.setListListener(p);
		p.Cnd_bp_grp_nm7.addAllListener(p);
		p.Cnd_bp_grp_cd8.setListListener(p);
		p.Cnd_bp_grp_cd8.addAllListener(p);
		p.Cnd_bp_grp_nm8.setListListener(p);
		p.Cnd_bp_grp_nm8.addAllListener(p);
		p.Cnd_bp_grp_cd9.setListListener(p);
		p.Cnd_bp_grp_cd9.addAllListener(p);
		p.Cnd_bp_grp_nm9.setListListener(p);
		p.Cnd_bp_grp_nm9.addAllListener(p);
		p.Cnd_bp_grp_cd10.setListListener(p);
		p.Cnd_bp_grp_cd10.addAllListener(p);
		p.Cnd_bp_grp_nm10.setListListener(p);
		p.Cnd_bp_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_DestReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_DestReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_DestReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_DestReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_DestReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_bp_cd.addAllListener(p);
		p.columnDtl_bp_cd.setListListener(p);
		p.columnDtl_bp_nm_lcl.addAllListener(p);
		p.columnDtl_bp_nm_lcl.setListListener(p);
		p.columnDtl_bp_nm.addAllListener(p);
		p.columnDtl_bp_nm.setListListener(p);
		p.columnDtl_bp_alt_nm1.addAllListener(p);
		p.columnDtl_bp_alt_nm1.setListListener(p);
		p.columnDtl_bp_alt_nm2.addAllListener(p);
		p.columnDtl_bp_alt_nm2.setListListener(p);
		p.columnDtl_bp_alt_nm3.addAllListener(p);
		p.columnDtl_bp_alt_nm3.setListListener(p);
		p.columnDtl_bp_alt_nm4.addAllListener(p);
		p.columnDtl_bp_alt_nm4.setListListener(p);
		p.columnDtl_dest_flg.addAllListener(p);
		p.columnDtl_cur_cd.addAllListener(p);
		p.columnDtl_cur_cd.setListListener(p);
		p.columnDtl_zip_cd.addAllListener(p);
		p.columnDtl_zip_cd.setListListener(p);
		p.columnDtl_addr1.addAllListener(p);
		p.columnDtl_addr1.setListListener(p);
		p.columnDtl_addr2.addAllListener(p);
		p.columnDtl_addr2.setListListener(p);
		p.columnDtl_addr3.addAllListener(p);
		p.columnDtl_addr3.setListListener(p);
		p.columnDtl_addr4.addAllListener(p);
		p.columnDtl_addr4.setListListener(p);
		p.columnDtl_tel.addAllListener(p);
		p.columnDtl_tel.setListListener(p);
		p.columnDtl_fax.addAllListener(p);
		p.columnDtl_fax.setListListener(p);
		p.columnDtl_ein.addAllListener(p);
		p.columnDtl_ein.setListListener(p);
		p.columnDtl_cntry_cd.addAllListener(p);
		p.columnDtl_cntry_cd.setListListener(p);
		p.columnDtl_cntry_nm.addAllListener(p);
		p.columnDtl_cntry_nm.setListListener(p);
		p.columnDtl_area_cd.addAllListener(p);
		p.columnDtl_area_cd.setListListener(p);
		p.columnDtl_area_nm.addAllListener(p);
		p.columnDtl_area_nm.setListListener(p);
		p.columnDtl_bp_grp_cd1.addAllListener(p);
		p.columnDtl_bp_grp_cd1.setListListener(p);
		p.columnDtl_bp_grp_nm1.addAllListener(p);
		p.columnDtl_bp_grp_nm1.setListListener(p);
		p.columnDtl_bp_grp_cd2.addAllListener(p);
		p.columnDtl_bp_grp_cd2.setListListener(p);
		p.columnDtl_bp_grp_nm2.addAllListener(p);
		p.columnDtl_bp_grp_nm2.setListListener(p);
		p.columnDtl_bp_grp_cd3.addAllListener(p);
		p.columnDtl_bp_grp_cd3.setListListener(p);
		p.columnDtl_bp_grp_nm3.addAllListener(p);
		p.columnDtl_bp_grp_nm3.setListListener(p);
		p.columnDtl_bp_grp_cd4.addAllListener(p);
		p.columnDtl_bp_grp_cd4.setListListener(p);
		p.columnDtl_bp_grp_nm4.addAllListener(p);
		p.columnDtl_bp_grp_nm4.setListListener(p);
		p.columnDtl_bp_grp_cd5.addAllListener(p);
		p.columnDtl_bp_grp_cd5.setListListener(p);
		p.columnDtl_bp_grp_nm5.addAllListener(p);
		p.columnDtl_bp_grp_nm5.setListListener(p);
		p.columnDtl_bp_grp_cd6.addAllListener(p);
		p.columnDtl_bp_grp_cd6.setListListener(p);
		p.columnDtl_bp_grp_nm6.addAllListener(p);
		p.columnDtl_bp_grp_nm6.setListListener(p);
		p.columnDtl_bp_grp_cd7.addAllListener(p);
		p.columnDtl_bp_grp_cd7.setListListener(p);
		p.columnDtl_bp_grp_nm7.addAllListener(p);
		p.columnDtl_bp_grp_nm7.setListListener(p);
		p.columnDtl_bp_grp_cd8.addAllListener(p);
		p.columnDtl_bp_grp_cd8.setListListener(p);
		p.columnDtl_bp_grp_nm8.addAllListener(p);
		p.columnDtl_bp_grp_nm8.setListListener(p);
		p.columnDtl_bp_grp_cd9.addAllListener(p);
		p.columnDtl_bp_grp_cd9.setListListener(p);
		p.columnDtl_bp_grp_nm9.addAllListener(p);
		p.columnDtl_bp_grp_nm9.setListListener(p);
		p.columnDtl_bp_grp_cd10.addAllListener(p);
		p.columnDtl_bp_grp_cd10.setListListener(p);
		p.columnDtl_bp_grp_nm10.addAllListener(p);
		p.columnDtl_bp_grp_nm10.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_memo4.addAllListener(p);
		p.columnDtl_memo4.setListListener(p);
		p.columnDtl_memo5.addAllListener(p);
		p.columnDtl_memo5.setListListener(p);
		p.columnDtl_memo6.addAllListener(p);
		p.columnDtl_memo6.setListListener(p);
		p.columnDtl_memo7.addAllListener(p);
		p.columnDtl_memo7.setListListener(p);
		p.columnDtl_memo8.addAllListener(p);
		p.columnDtl_memo8.setListListener(p);
		p.columnDtl_memo9.addAllListener(p);
		p.columnDtl_memo9.setListListener(p);
		p.columnDtl_memo10.addAllListener(p);
		p.columnDtl_memo10.setListListener(p);
		p.columnDtl_memo11.addAllListener(p);
		p.columnDtl_memo11.setListListener(p);
		p.columnDtl_memo12.addAllListener(p);
		p.columnDtl_memo12.setListListener(p);
		p.columnDtl_memo13.addAllListener(p);
		p.columnDtl_memo13.setListListener(p);
		p.columnDtl_memo14.addAllListener(p);
		p.columnDtl_memo14.setListListener(p);
		p.columnDtl_memo15.addAllListener(p);
		p.columnDtl_memo15.setListListener(p);
		p.columnDtl_memo16.addAllListener(p);
		p.columnDtl_memo16.setListListener(p);
		p.columnDtl_memo17.addAllListener(p);
		p.columnDtl_memo17.setListListener(p);
		p.columnDtl_memo18.addAllListener(p);
		p.columnDtl_memo18.setListListener(p);
		p.columnDtl_memo19.addAllListener(p);
		p.columnDtl_memo19.setListListener(p);
		p.columnDtl_memo20.addAllListener(p);
		p.columnDtl_memo20.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_DestReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_DestReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_DestReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_bp_cd.addAllListener(p);
		p.columnLcl_bp_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_bp_nm.addAllListener(p);
		p.columnLcl_bp_nm.setListListener(p);
		p.columnLcl_bp_alt_nm1.addAllListener(p);
		p.columnLcl_bp_alt_nm1.setListListener(p);
		p.columnLcl_bp_alt_nm2.addAllListener(p);
		p.columnLcl_bp_alt_nm2.setListListener(p);
		p.columnLcl_bp_alt_nm3.addAllListener(p);
		p.columnLcl_bp_alt_nm3.setListListener(p);
		p.columnLcl_bp_alt_nm4.addAllListener(p);
		p.columnLcl_bp_alt_nm4.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_memo4.addAllListener(p);
		p.columnLcl_memo4.setListListener(p);
		p.columnLcl_memo5.addAllListener(p);
		p.columnLcl_memo5.setListListener(p);
		p.columnLcl_memo6.addAllListener(p);
		p.columnLcl_memo6.setListListener(p);
		p.columnLcl_memo7.addAllListener(p);
		p.columnLcl_memo7.setListListener(p);
		p.columnLcl_memo8.addAllListener(p);
		p.columnLcl_memo8.setListListener(p);
		p.columnLcl_memo9.addAllListener(p);
		p.columnLcl_memo9.setListListener(p);
		p.columnLcl_memo10.addAllListener(p);
		p.columnLcl_memo10.setListListener(p);
		p.columnLcl_memo11.addAllListener(p);
		p.columnLcl_memo11.setListListener(p);
		p.columnLcl_memo12.addAllListener(p);
		p.columnLcl_memo12.setListListener(p);
		p.columnLcl_memo13.addAllListener(p);
		p.columnLcl_memo13.setListListener(p);
		p.columnLcl_memo14.addAllListener(p);
		p.columnLcl_memo14.setListListener(p);
		p.columnLcl_memo15.addAllListener(p);
		p.columnLcl_memo15.setListListener(p);
		p.columnLcl_memo16.addAllListener(p);
		p.columnLcl_memo16.setListListener(p);
		p.columnLcl_memo17.addAllListener(p);
		p.columnLcl_memo17.setListListener(p);
		p.columnLcl_memo18.addAllListener(p);
		p.columnLcl_memo18.setListListener(p);
		p.columnLcl_memo19.addAllListener(p);
		p.columnLcl_memo19.setListListener(p);
		p.columnLcl_memo20.addAllListener(p);
		p.columnLcl_memo20.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_DestReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_DestReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_DestReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_DestReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_DestReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ein.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_DestReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cur_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ein.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntry_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_area_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bp_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_grp_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo11.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo13.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo15.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo17.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo19.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo20.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_DestReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_DestReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_bp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_bp_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_bp_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_bp_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_bp_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo4.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo5.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo6.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo7.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo8.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo9.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo10.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo11.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo12.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo13.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo14.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo15.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo16.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo17.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo18.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo19.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo20.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_DestReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_DestReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_DestReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_DestReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_DestReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ein.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_alt_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_alt_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_alt_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_alt_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_DestReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_cur_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ein.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_area_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_area_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bp_grp_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_DestReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_DestReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo20.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_DestReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_DestReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_DestReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_DestReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_DestReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ein.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_alt_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_alt_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_alt_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_alt_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_DestReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cur_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ein.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_area_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_area_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bp_grp_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_DestReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_DestReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo20.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_DestReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_DestReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_DestReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_DestReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_DestReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ein.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_alt_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_alt_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_alt_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_alt_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_DestReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cur_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ein.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_area_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_area_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bp_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_DestReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_DestReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_bp_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_DestReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_DestReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_DestReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_DestReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_DestReg_MC.setTableConfigDtl((MABCP_DestReg)this);
		MABCP_DestReg_MC.setTableConfigLcl((MABCP_DestReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_DestReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0620.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0620.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_cd);
		p.columnDtl_bp_nm_lcl.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_nm_lcl);
		p.columnDtl_bp_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_nm);
		p.columnDtl_bp_alt_nm1.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alt_nm1);
		p.columnDtl_bp_alt_nm2.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alt_nm2);
		p.columnDtl_bp_alt_nm3.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alt_nm3);
		p.columnDtl_bp_alt_nm4.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alt_nm4);
		p.columnDtl_dest_flg.setMeta(mcframe.clientMABC.MABCP0620.DtlR.dest_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_flg);
		p.columnDtl_cur_cd.setMeta(mcframe.clientMABC.MABCP0620.DtlR.cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_cd);
		p.columnDtl_zip_cd.setMeta(mcframe.clientMABC.MABCP0620.DtlR.zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_zip_cd);
		p.columnDtl_addr1.setMeta(mcframe.clientMABC.MABCP0620.DtlR.addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr1);
		p.columnDtl_addr2.setMeta(mcframe.clientMABC.MABCP0620.DtlR.addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr2);
		p.columnDtl_addr3.setMeta(mcframe.clientMABC.MABCP0620.DtlR.addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr3);
		p.columnDtl_addr4.setMeta(mcframe.clientMABC.MABCP0620.DtlR.addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr4);
		p.columnDtl_tel.setMeta(mcframe.clientMABC.MABCP0620.DtlR.tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel);
		p.columnDtl_fax.setMeta(mcframe.clientMABC.MABCP0620.DtlR.fax_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fax);
		p.columnDtl_ein.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ein_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ein);
		p.columnDtl_cntry_cd.setMeta(mcframe.clientMABC.MABCP0620.DtlR.cntry_cd_META);
		p.columnDtl_cntry_cd.addLinkBeans(p.columnDtl_cntry_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_cd);
		p.columnDtl_cntry_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.cntry_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_nm);
		p.columnDtl_area_cd.setMeta(mcframe.clientMABC.MABCP0620.DtlR.area_cd_META);
		p.columnDtl_area_cd.addLinkBeans(p.columnDtl_area_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_area_cd);
		p.columnDtl_area_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.area_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_area_nm);
		p.columnDtl_bp_grp_cd1.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd1_META);
		p.columnDtl_bp_grp_cd1.addLinkBeans(p.columnDtl_bp_grp_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd1);
		p.columnDtl_bp_grp_nm1.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm1);
		p.columnDtl_bp_grp_cd2.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd2_META);
		p.columnDtl_bp_grp_cd2.addLinkBeans(p.columnDtl_bp_grp_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd2);
		p.columnDtl_bp_grp_nm2.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm2);
		p.columnDtl_bp_grp_cd3.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd3_META);
		p.columnDtl_bp_grp_cd3.addLinkBeans(p.columnDtl_bp_grp_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd3);
		p.columnDtl_bp_grp_nm3.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm3);
		p.columnDtl_bp_grp_cd4.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd4_META);
		p.columnDtl_bp_grp_cd4.addLinkBeans(p.columnDtl_bp_grp_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd4);
		p.columnDtl_bp_grp_nm4.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm4);
		p.columnDtl_bp_grp_cd5.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd5_META);
		p.columnDtl_bp_grp_cd5.addLinkBeans(p.columnDtl_bp_grp_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd5);
		p.columnDtl_bp_grp_nm5.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm5);
		p.columnDtl_bp_grp_cd6.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd6_META);
		p.columnDtl_bp_grp_cd6.addLinkBeans(p.columnDtl_bp_grp_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd6);
		p.columnDtl_bp_grp_nm6.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm6);
		p.columnDtl_bp_grp_cd7.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd7_META);
		p.columnDtl_bp_grp_cd7.addLinkBeans(p.columnDtl_bp_grp_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd7);
		p.columnDtl_bp_grp_nm7.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm7);
		p.columnDtl_bp_grp_cd8.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd8_META);
		p.columnDtl_bp_grp_cd8.addLinkBeans(p.columnDtl_bp_grp_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd8);
		p.columnDtl_bp_grp_nm8.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm8);
		p.columnDtl_bp_grp_cd9.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd9_META);
		p.columnDtl_bp_grp_cd9.addLinkBeans(p.columnDtl_bp_grp_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd9);
		p.columnDtl_bp_grp_nm9.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm9);
		p.columnDtl_bp_grp_cd10.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_cd10_META);
		p.columnDtl_bp_grp_cd10.addLinkBeans(p.columnDtl_bp_grp_nm10);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_cd10);
		p.columnDtl_bp_grp_nm10.setMeta(mcframe.clientMABC.MABCP0620.DtlR.bp_grp_nm10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_grp_nm10);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_memo4.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo4);
		p.columnDtl_memo5.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo5);
		p.columnDtl_memo6.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo6);
		p.columnDtl_memo7.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo7);
		p.columnDtl_memo8.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo8);
		p.columnDtl_memo9.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo9);
		p.columnDtl_memo10.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo10);
		p.columnDtl_memo11.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo11_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo11);
		p.columnDtl_memo12.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo12_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo12);
		p.columnDtl_memo13.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo13_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo13);
		p.columnDtl_memo14.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo14_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo14);
		p.columnDtl_memo15.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo15_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo15);
		p.columnDtl_memo16.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo16_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo16);
		p.columnDtl_memo17.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo17_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo17);
		p.columnDtl_memo18.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo18_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo18);
		p.columnDtl_memo19.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo19_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo19);
		p.columnDtl_memo20.setMeta(mcframe.clientMABC.MABCP0620.DtlR.memo20_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo20);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0620.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0620.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0620.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0620.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_DestReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0620.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_bp_cd.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0620.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_bp_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_nm);
		p.columnLcl_bp_alt_nm1.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_alt_nm1_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_alt_nm1);
		p.columnLcl_bp_alt_nm2.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_alt_nm2_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_alt_nm2);
		p.columnLcl_bp_alt_nm3.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_alt_nm3_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_alt_nm3);
		p.columnLcl_bp_alt_nm4.setMeta(mcframe.clientMABC.MABCP0620.LclR.bp_alt_nm4_META);
		p.LclTable.addColumnConfig(p.columnLcl_bp_alt_nm4);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_memo4.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo4_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo4);
		p.columnLcl_memo5.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo5_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo5);
		p.columnLcl_memo6.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo6_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo6);
		p.columnLcl_memo7.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo7_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo7);
		p.columnLcl_memo8.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo8_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo8);
		p.columnLcl_memo9.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo9_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo9);
		p.columnLcl_memo10.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo10_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo10);
		p.columnLcl_memo11.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo11_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo11);
		p.columnLcl_memo12.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo12_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo12);
		p.columnLcl_memo13.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo13_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo13);
		p.columnLcl_memo14.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo14_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo14);
		p.columnLcl_memo15.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo15_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo15);
		p.columnLcl_memo16.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo16_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo16);
		p.columnLcl_memo17.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo17_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo17);
		p.columnLcl_memo18.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo18_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo18);
		p.columnLcl_memo19.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo19_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo19);
		p.columnLcl_memo20.setMeta(mcframe.clientMABC.MABCP0620.LclR.memo20_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo20);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0620.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0620.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0620.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0620.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
		Cnd_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd1.getListConfig().setPutter(getCnd_bp_grp_cd1_ListPutter());
		Cnd_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd2.getListConfig().setPutter(getCnd_bp_grp_cd2_ListPutter());
		Cnd_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd3.getListConfig().setPutter(getCnd_bp_grp_cd3_ListPutter());
		Cnd_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd4.getListConfig().setPutter(getCnd_bp_grp_cd4_ListPutter());
		Cnd_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd5.getListConfig().setPutter(getCnd_bp_grp_cd5_ListPutter());
		Cnd_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd6.getListConfig().setPutter(getCnd_bp_grp_cd6_ListPutter());
		Cnd_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd7.getListConfig().setPutter(getCnd_bp_grp_cd7_ListPutter());
		Cnd_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd8.getListConfig().setPutter(getCnd_bp_grp_cd8_ListPutter());
		Cnd_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd9.getListConfig().setPutter(getCnd_bp_grp_cd9_ListPutter());
		Cnd_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd10.getListConfig().setPutter(getCnd_bp_grp_cd10_ListPutter());
		columnDtl_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cntry_cd.getListConfig().setPutter(getDtl_cntry_cd_ListPutter());
		columnDtl_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_area_cd.getListConfig().setPutter(getDtl_area_cd_ListPutter());
		columnDtl_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd1.getListConfig().setPutter(getDtl_bp_grp_cd1_ListPutter());
		columnDtl_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd2.getListConfig().setPutter(getDtl_bp_grp_cd2_ListPutter());
		columnDtl_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd3.getListConfig().setPutter(getDtl_bp_grp_cd3_ListPutter());
		columnDtl_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd4.getListConfig().setPutter(getDtl_bp_grp_cd4_ListPutter());
		columnDtl_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd5.getListConfig().setPutter(getDtl_bp_grp_cd5_ListPutter());
		columnDtl_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd6.getListConfig().setPutter(getDtl_bp_grp_cd6_ListPutter());
		columnDtl_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd7.getListConfig().setPutter(getDtl_bp_grp_cd7_ListPutter());
		columnDtl_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd8.getListConfig().setPutter(getDtl_bp_grp_cd8_ListPutter());
		columnDtl_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd9.getListConfig().setPutter(getDtl_bp_grp_cd9_ListPutter());
		columnDtl_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_grp_cd10.getListConfig().setPutter(getDtl_bp_grp_cd10_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Dtl_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
		if(combo == Cnd_bp_grp_cd1) return getCnd_bp_grp_cd1(row, info);
		if(combo == Cnd_bp_grp_cd2) return getCnd_bp_grp_cd2(row, info);
		if(combo == Cnd_bp_grp_cd3) return getCnd_bp_grp_cd3(row, info);
		if(combo == Cnd_bp_grp_cd4) return getCnd_bp_grp_cd4(row, info);
		if(combo == Cnd_bp_grp_cd5) return getCnd_bp_grp_cd5(row, info);
		if(combo == Cnd_bp_grp_cd6) return getCnd_bp_grp_cd6(row, info);
		if(combo == Cnd_bp_grp_cd7) return getCnd_bp_grp_cd7(row, info);
		if(combo == Cnd_bp_grp_cd8) return getCnd_bp_grp_cd8(row, info);
		if(combo == Cnd_bp_grp_cd9) return getCnd_bp_grp_cd9(row, info);
		if(combo == Cnd_bp_grp_cd10) return getCnd_bp_grp_cd10(row, info);
		if(combo == columnDtl_cntry_cd) return getDtl_cntry_cd(row, info);
		if(combo == columnDtl_area_cd) return getDtl_area_cd(row, info);
		if(combo == columnDtl_bp_grp_cd1) return getDtl_bp_grp_cd1(row, info);
		if(combo == columnDtl_bp_grp_cd2) return getDtl_bp_grp_cd2(row, info);
		if(combo == columnDtl_bp_grp_cd3) return getDtl_bp_grp_cd3(row, info);
		if(combo == columnDtl_bp_grp_cd4) return getDtl_bp_grp_cd4(row, info);
		if(combo == columnDtl_bp_grp_cd5) return getDtl_bp_grp_cd5(row, info);
		if(combo == columnDtl_bp_grp_cd6) return getDtl_bp_grp_cd6(row, info);
		if(combo == columnDtl_bp_grp_cd7) return getDtl_bp_grp_cd7(row, info);
		if(combo == columnDtl_bp_grp_cd8) return getDtl_bp_grp_cd8(row, info);
		if(combo == columnDtl_bp_grp_cd9) return getDtl_bp_grp_cd9(row, info);
		if(combo == columnDtl_bp_grp_cd10) return getDtl_bp_grp_cd10(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_ein) return doCnd_ein_VC(info);
		if (vc == Cnd_bp_alt_nm1) return doCnd_bp_alt_nm1_VC(info);
		if (vc == Cnd_bp_alt_nm2) return doCnd_bp_alt_nm2_VC(info);
		if (vc == Cnd_bp_alt_nm3) return doCnd_bp_alt_nm3_VC(info);
		if (vc == Cnd_bp_alt_nm4) return doCnd_bp_alt_nm4_VC(info);
		if (vc == Cnd_cntry_cd) return doCnd_cntry_cd_VC(info);
		if (vc == Cnd_cntry_nm) return doCnd_cntry_nm_VC(info);
		if (vc == Cnd_foreign_flg) return doCnd_foreign_flg_VC(info);
		if (vc == Cnd_area_cd) return doCnd_area_cd_VC(info);
		if (vc == Cnd_area_nm) return doCnd_area_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_memo4) return doCnd_memo4_VC(info);
		if (vc == Cnd_memo5) return doCnd_memo5_VC(info);
		if (vc == Cnd_memo6) return doCnd_memo6_VC(info);
		if (vc == Cnd_memo7) return doCnd_memo7_VC(info);
		if (vc == Cnd_memo8) return doCnd_memo8_VC(info);
		if (vc == Cnd_memo9) return doCnd_memo9_VC(info);
		if (vc == Cnd_memo10) return doCnd_memo10_VC(info);
		if (vc == Cnd_memo11) return doCnd_memo11_VC(info);
		if (vc == Cnd_memo12) return doCnd_memo12_VC(info);
		if (vc == Cnd_memo13) return doCnd_memo13_VC(info);
		if (vc == Cnd_memo14) return doCnd_memo14_VC(info);
		if (vc == Cnd_memo15) return doCnd_memo15_VC(info);
		if (vc == Cnd_memo16) return doCnd_memo16_VC(info);
		if (vc == Cnd_memo17) return doCnd_memo17_VC(info);
		if (vc == Cnd_memo18) return doCnd_memo18_VC(info);
		if (vc == Cnd_memo19) return doCnd_memo19_VC(info);
		if (vc == Cnd_memo20) return doCnd_memo20_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_bp_grp_cd1) return doCnd_bp_grp_cd1_VC(info);
		if (vc == Cnd_bp_grp_nm1) return doCnd_bp_grp_nm1_VC(info);
		if (vc == Cnd_bp_grp_cd2) return doCnd_bp_grp_cd2_VC(info);
		if (vc == Cnd_bp_grp_nm2) return doCnd_bp_grp_nm2_VC(info);
		if (vc == Cnd_bp_grp_cd3) return doCnd_bp_grp_cd3_VC(info);
		if (vc == Cnd_bp_grp_nm3) return doCnd_bp_grp_nm3_VC(info);
		if (vc == Cnd_bp_grp_cd4) return doCnd_bp_grp_cd4_VC(info);
		if (vc == Cnd_bp_grp_nm4) return doCnd_bp_grp_nm4_VC(info);
		if (vc == Cnd_bp_grp_cd5) return doCnd_bp_grp_cd5_VC(info);
		if (vc == Cnd_bp_grp_nm5) return doCnd_bp_grp_nm5_VC(info);
		if (vc == Cnd_bp_grp_cd6) return doCnd_bp_grp_cd6_VC(info);
		if (vc == Cnd_bp_grp_nm6) return doCnd_bp_grp_nm6_VC(info);
		if (vc == Cnd_bp_grp_cd7) return doCnd_bp_grp_cd7_VC(info);
		if (vc == Cnd_bp_grp_nm7) return doCnd_bp_grp_nm7_VC(info);
		if (vc == Cnd_bp_grp_cd8) return doCnd_bp_grp_cd8_VC(info);
		if (vc == Cnd_bp_grp_nm8) return doCnd_bp_grp_nm8_VC(info);
		if (vc == Cnd_bp_grp_cd9) return doCnd_bp_grp_cd9_VC(info);
		if (vc == Cnd_bp_grp_nm9) return doCnd_bp_grp_nm9_VC(info);
		if (vc == Cnd_bp_grp_cd10) return doCnd_bp_grp_cd10_VC(info);
		if (vc == Cnd_bp_grp_nm10) return doCnd_bp_grp_nm10_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_bp_cd) return doDtl_bp_cd_VC(info);
		if (vc == columnDtl_bp_nm_lcl) return doDtl_bp_nm_lcl_VC(info);
		if (vc == columnDtl_bp_nm) return doDtl_bp_nm_VC(info);
		if (vc == columnDtl_bp_alt_nm1) return doDtl_bp_alt_nm1_VC(info);
		if (vc == columnDtl_bp_alt_nm2) return doDtl_bp_alt_nm2_VC(info);
		if (vc == columnDtl_bp_alt_nm3) return doDtl_bp_alt_nm3_VC(info);
		if (vc == columnDtl_bp_alt_nm4) return doDtl_bp_alt_nm4_VC(info);
		if (vc == columnDtl_dest_flg) return doDtl_dest_flg_VC(info);
		if (vc == columnDtl_cur_cd) return doDtl_cur_cd_VC(info);
		if (vc == columnDtl_zip_cd) return doDtl_zip_cd_VC(info);
		if (vc == columnDtl_addr1) return doDtl_addr1_VC(info);
		if (vc == columnDtl_addr2) return doDtl_addr2_VC(info);
		if (vc == columnDtl_addr3) return doDtl_addr3_VC(info);
		if (vc == columnDtl_addr4) return doDtl_addr4_VC(info);
		if (vc == columnDtl_tel) return doDtl_tel_VC(info);
		if (vc == columnDtl_fax) return doDtl_fax_VC(info);
		if (vc == columnDtl_ein) return doDtl_ein_VC(info);
		if (vc == columnDtl_cntry_cd) return doDtl_cntry_cd_VC(info);
		if (vc == columnDtl_cntry_nm) return doDtl_cntry_nm_VC(info);
		if (vc == columnDtl_area_cd) return doDtl_area_cd_VC(info);
		if (vc == columnDtl_area_nm) return doDtl_area_nm_VC(info);
		if (vc == columnDtl_bp_grp_cd1) return doDtl_bp_grp_cd1_VC(info);
		if (vc == columnDtl_bp_grp_nm1) return doDtl_bp_grp_nm1_VC(info);
		if (vc == columnDtl_bp_grp_cd2) return doDtl_bp_grp_cd2_VC(info);
		if (vc == columnDtl_bp_grp_nm2) return doDtl_bp_grp_nm2_VC(info);
		if (vc == columnDtl_bp_grp_cd3) return doDtl_bp_grp_cd3_VC(info);
		if (vc == columnDtl_bp_grp_nm3) return doDtl_bp_grp_nm3_VC(info);
		if (vc == columnDtl_bp_grp_cd4) return doDtl_bp_grp_cd4_VC(info);
		if (vc == columnDtl_bp_grp_nm4) return doDtl_bp_grp_nm4_VC(info);
		if (vc == columnDtl_bp_grp_cd5) return doDtl_bp_grp_cd5_VC(info);
		if (vc == columnDtl_bp_grp_nm5) return doDtl_bp_grp_nm5_VC(info);
		if (vc == columnDtl_bp_grp_cd6) return doDtl_bp_grp_cd6_VC(info);
		if (vc == columnDtl_bp_grp_nm6) return doDtl_bp_grp_nm6_VC(info);
		if (vc == columnDtl_bp_grp_cd7) return doDtl_bp_grp_cd7_VC(info);
		if (vc == columnDtl_bp_grp_nm7) return doDtl_bp_grp_nm7_VC(info);
		if (vc == columnDtl_bp_grp_cd8) return doDtl_bp_grp_cd8_VC(info);
		if (vc == columnDtl_bp_grp_nm8) return doDtl_bp_grp_nm8_VC(info);
		if (vc == columnDtl_bp_grp_cd9) return doDtl_bp_grp_cd9_VC(info);
		if (vc == columnDtl_bp_grp_nm9) return doDtl_bp_grp_nm9_VC(info);
		if (vc == columnDtl_bp_grp_cd10) return doDtl_bp_grp_cd10_VC(info);
		if (vc == columnDtl_bp_grp_nm10) return doDtl_bp_grp_nm10_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_memo4) return doDtl_memo4_VC(info);
		if (vc == columnDtl_memo5) return doDtl_memo5_VC(info);
		if (vc == columnDtl_memo6) return doDtl_memo6_VC(info);
		if (vc == columnDtl_memo7) return doDtl_memo7_VC(info);
		if (vc == columnDtl_memo8) return doDtl_memo8_VC(info);
		if (vc == columnDtl_memo9) return doDtl_memo9_VC(info);
		if (vc == columnDtl_memo10) return doDtl_memo10_VC(info);
		if (vc == columnDtl_memo11) return doDtl_memo11_VC(info);
		if (vc == columnDtl_memo12) return doDtl_memo12_VC(info);
		if (vc == columnDtl_memo13) return doDtl_memo13_VC(info);
		if (vc == columnDtl_memo14) return doDtl_memo14_VC(info);
		if (vc == columnDtl_memo15) return doDtl_memo15_VC(info);
		if (vc == columnDtl_memo16) return doDtl_memo16_VC(info);
		if (vc == columnDtl_memo17) return doDtl_memo17_VC(info);
		if (vc == columnDtl_memo18) return doDtl_memo18_VC(info);
		if (vc == columnDtl_memo19) return doDtl_memo19_VC(info);
		if (vc == columnDtl_memo20) return doDtl_memo20_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_bp_cd) return doLcl_bp_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_bp_nm) return doLcl_bp_nm_VC(info);
		if (vc == columnLcl_bp_alt_nm1) return doLcl_bp_alt_nm1_VC(info);
		if (vc == columnLcl_bp_alt_nm2) return doLcl_bp_alt_nm2_VC(info);
		if (vc == columnLcl_bp_alt_nm3) return doLcl_bp_alt_nm3_VC(info);
		if (vc == columnLcl_bp_alt_nm4) return doLcl_bp_alt_nm4_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_memo4) return doLcl_memo4_VC(info);
		if (vc == columnLcl_memo5) return doLcl_memo5_VC(info);
		if (vc == columnLcl_memo6) return doLcl_memo6_VC(info);
		if (vc == columnLcl_memo7) return doLcl_memo7_VC(info);
		if (vc == columnLcl_memo8) return doLcl_memo8_VC(info);
		if (vc == columnLcl_memo9) return doLcl_memo9_VC(info);
		if (vc == columnLcl_memo10) return doLcl_memo10_VC(info);
		if (vc == columnLcl_memo11) return doLcl_memo11_VC(info);
		if (vc == columnLcl_memo12) return doLcl_memo12_VC(info);
		if (vc == columnLcl_memo13) return doLcl_memo13_VC(info);
		if (vc == columnLcl_memo14) return doLcl_memo14_VC(info);
		if (vc == columnLcl_memo15) return doLcl_memo15_VC(info);
		if (vc == columnLcl_memo16) return doLcl_memo16_VC(info);
		if (vc == columnLcl_memo17) return doLcl_memo17_VC(info);
		if (vc == columnLcl_memo18) return doLcl_memo18_VC(info);
		if (vc == columnLcl_memo19) return doLcl_memo19_VC(info);
		if (vc == columnLcl_memo20) return doLcl_memo20_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_bp_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_ein) doCnd_ein_NC(info);
		else if (nc == Cnd_bp_alt_nm1) doCnd_bp_alt_nm1_NC(info);
		else if (nc == Cnd_bp_alt_nm2) doCnd_bp_alt_nm2_NC(info);
		else if (nc == Cnd_bp_alt_nm3) doCnd_bp_alt_nm3_NC(info);
		else if (nc == Cnd_bp_alt_nm4) doCnd_bp_alt_nm4_NC(info);
		else if (nc == Cnd_cntry_cd) doCnd_cntry_cd_NC(info);
		else if (nc == Cnd_cntry_nm) doCnd_cntry_nm_NC(info);
		else if (nc == Cnd_foreign_flg) doCnd_foreign_flg_NC(info);
		else if (nc == Cnd_area_cd) doCnd_area_cd_NC(info);
		else if (nc == Cnd_area_nm) doCnd_area_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_memo4) doCnd_memo4_NC(info);
		else if (nc == Cnd_memo5) doCnd_memo5_NC(info);
		else if (nc == Cnd_memo6) doCnd_memo6_NC(info);
		else if (nc == Cnd_memo7) doCnd_memo7_NC(info);
		else if (nc == Cnd_memo8) doCnd_memo8_NC(info);
		else if (nc == Cnd_memo9) doCnd_memo9_NC(info);
		else if (nc == Cnd_memo10) doCnd_memo10_NC(info);
		else if (nc == Cnd_memo11) doCnd_memo11_NC(info);
		else if (nc == Cnd_memo12) doCnd_memo12_NC(info);
		else if (nc == Cnd_memo13) doCnd_memo13_NC(info);
		else if (nc == Cnd_memo14) doCnd_memo14_NC(info);
		else if (nc == Cnd_memo15) doCnd_memo15_NC(info);
		else if (nc == Cnd_memo16) doCnd_memo16_NC(info);
		else if (nc == Cnd_memo17) doCnd_memo17_NC(info);
		else if (nc == Cnd_memo18) doCnd_memo18_NC(info);
		else if (nc == Cnd_memo19) doCnd_memo19_NC(info);
		else if (nc == Cnd_memo20) doCnd_memo20_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NC(info);
		else if (nc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NC(info);
		else if (nc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NC(info);
		else if (nc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NC(info);
		else if (nc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NC(info);
		else if (nc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NC(info);
		else if (nc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NC(info);
		else if (nc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NC(info);
		else if (nc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NC(info);
		else if (nc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NC(info);
		else if (nc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NC(info);
		else if (nc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NC(info);
		else if (nc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NC(info);
		else if (nc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NC(info);
		else if (nc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NC(info);
		else if (nc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NC(info);
		else if (nc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NC(info);
		else if (nc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NC(info);
		else if (nc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NC(info);
		else if (nc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_bp_cd) doDtl_bp_cd_NC(info);
		else if (nc == columnDtl_bp_nm_lcl) doDtl_bp_nm_lcl_NC(info);
		else if (nc == columnDtl_bp_nm) doDtl_bp_nm_NC(info);
		else if (nc == columnDtl_bp_alt_nm1) doDtl_bp_alt_nm1_NC(info);
		else if (nc == columnDtl_bp_alt_nm2) doDtl_bp_alt_nm2_NC(info);
		else if (nc == columnDtl_bp_alt_nm3) doDtl_bp_alt_nm3_NC(info);
		else if (nc == columnDtl_bp_alt_nm4) doDtl_bp_alt_nm4_NC(info);
		else if (nc == columnDtl_dest_flg) doDtl_dest_flg_NC(info);
		else if (nc == columnDtl_cur_cd) doDtl_cur_cd_NC(info);
		else if (nc == columnDtl_zip_cd) doDtl_zip_cd_NC(info);
		else if (nc == columnDtl_addr1) doDtl_addr1_NC(info);
		else if (nc == columnDtl_addr2) doDtl_addr2_NC(info);
		else if (nc == columnDtl_addr3) doDtl_addr3_NC(info);
		else if (nc == columnDtl_addr4) doDtl_addr4_NC(info);
		else if (nc == columnDtl_tel) doDtl_tel_NC(info);
		else if (nc == columnDtl_fax) doDtl_fax_NC(info);
		else if (nc == columnDtl_ein) doDtl_ein_NC(info);
		else if (nc == columnDtl_cntry_cd) doDtl_cntry_cd_NC(info);
		else if (nc == columnDtl_cntry_nm) doDtl_cntry_nm_NC(info);
		else if (nc == columnDtl_area_cd) doDtl_area_cd_NC(info);
		else if (nc == columnDtl_area_nm) doDtl_area_nm_NC(info);
		else if (nc == columnDtl_bp_grp_cd1) doDtl_bp_grp_cd1_NC(info);
		else if (nc == columnDtl_bp_grp_nm1) doDtl_bp_grp_nm1_NC(info);
		else if (nc == columnDtl_bp_grp_cd2) doDtl_bp_grp_cd2_NC(info);
		else if (nc == columnDtl_bp_grp_nm2) doDtl_bp_grp_nm2_NC(info);
		else if (nc == columnDtl_bp_grp_cd3) doDtl_bp_grp_cd3_NC(info);
		else if (nc == columnDtl_bp_grp_nm3) doDtl_bp_grp_nm3_NC(info);
		else if (nc == columnDtl_bp_grp_cd4) doDtl_bp_grp_cd4_NC(info);
		else if (nc == columnDtl_bp_grp_nm4) doDtl_bp_grp_nm4_NC(info);
		else if (nc == columnDtl_bp_grp_cd5) doDtl_bp_grp_cd5_NC(info);
		else if (nc == columnDtl_bp_grp_nm5) doDtl_bp_grp_nm5_NC(info);
		else if (nc == columnDtl_bp_grp_cd6) doDtl_bp_grp_cd6_NC(info);
		else if (nc == columnDtl_bp_grp_nm6) doDtl_bp_grp_nm6_NC(info);
		else if (nc == columnDtl_bp_grp_cd7) doDtl_bp_grp_cd7_NC(info);
		else if (nc == columnDtl_bp_grp_nm7) doDtl_bp_grp_nm7_NC(info);
		else if (nc == columnDtl_bp_grp_cd8) doDtl_bp_grp_cd8_NC(info);
		else if (nc == columnDtl_bp_grp_nm8) doDtl_bp_grp_nm8_NC(info);
		else if (nc == columnDtl_bp_grp_cd9) doDtl_bp_grp_cd9_NC(info);
		else if (nc == columnDtl_bp_grp_nm9) doDtl_bp_grp_nm9_NC(info);
		else if (nc == columnDtl_bp_grp_cd10) doDtl_bp_grp_cd10_NC(info);
		else if (nc == columnDtl_bp_grp_nm10) doDtl_bp_grp_nm10_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_memo4) doDtl_memo4_NC(info);
		else if (nc == columnDtl_memo5) doDtl_memo5_NC(info);
		else if (nc == columnDtl_memo6) doDtl_memo6_NC(info);
		else if (nc == columnDtl_memo7) doDtl_memo7_NC(info);
		else if (nc == columnDtl_memo8) doDtl_memo8_NC(info);
		else if (nc == columnDtl_memo9) doDtl_memo9_NC(info);
		else if (nc == columnDtl_memo10) doDtl_memo10_NC(info);
		else if (nc == columnDtl_memo11) doDtl_memo11_NC(info);
		else if (nc == columnDtl_memo12) doDtl_memo12_NC(info);
		else if (nc == columnDtl_memo13) doDtl_memo13_NC(info);
		else if (nc == columnDtl_memo14) doDtl_memo14_NC(info);
		else if (nc == columnDtl_memo15) doDtl_memo15_NC(info);
		else if (nc == columnDtl_memo16) doDtl_memo16_NC(info);
		else if (nc == columnDtl_memo17) doDtl_memo17_NC(info);
		else if (nc == columnDtl_memo18) doDtl_memo18_NC(info);
		else if (nc == columnDtl_memo19) doDtl_memo19_NC(info);
		else if (nc == columnDtl_memo20) doDtl_memo20_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_bp_cd) doLcl_bp_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_bp_nm) doLcl_bp_nm_NC(info);
		else if (nc == columnLcl_bp_alt_nm1) doLcl_bp_alt_nm1_NC(info);
		else if (nc == columnLcl_bp_alt_nm2) doLcl_bp_alt_nm2_NC(info);
		else if (nc == columnLcl_bp_alt_nm3) doLcl_bp_alt_nm3_NC(info);
		else if (nc == columnLcl_bp_alt_nm4) doLcl_bp_alt_nm4_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_memo4) doLcl_memo4_NC(info);
		else if (nc == columnLcl_memo5) doLcl_memo5_NC(info);
		else if (nc == columnLcl_memo6) doLcl_memo6_NC(info);
		else if (nc == columnLcl_memo7) doLcl_memo7_NC(info);
		else if (nc == columnLcl_memo8) doLcl_memo8_NC(info);
		else if (nc == columnLcl_memo9) doLcl_memo9_NC(info);
		else if (nc == columnLcl_memo10) doLcl_memo10_NC(info);
		else if (nc == columnLcl_memo11) doLcl_memo11_NC(info);
		else if (nc == columnLcl_memo12) doLcl_memo12_NC(info);
		else if (nc == columnLcl_memo13) doLcl_memo13_NC(info);
		else if (nc == columnLcl_memo14) doLcl_memo14_NC(info);
		else if (nc == columnLcl_memo15) doLcl_memo15_NC(info);
		else if (nc == columnLcl_memo16) doLcl_memo16_NC(info);
		else if (nc == columnLcl_memo17) doLcl_memo17_NC(info);
		else if (nc == columnLcl_memo18) doLcl_memo18_NC(info);
		else if (nc == columnLcl_memo19) doLcl_memo19_NC(info);
		else if (nc == columnLcl_memo20) doLcl_memo20_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ein_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo20_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_ein) doCnd_ein_NE(info);
		else if (ne == Cnd_bp_alt_nm1) doCnd_bp_alt_nm1_NE(info);
		else if (ne == Cnd_bp_alt_nm2) doCnd_bp_alt_nm2_NE(info);
		else if (ne == Cnd_bp_alt_nm3) doCnd_bp_alt_nm3_NE(info);
		else if (ne == Cnd_bp_alt_nm4) doCnd_bp_alt_nm4_NE(info);
		else if (ne == Cnd_cntry_cd) doCnd_cntry_cd_NE(info);
		else if (ne == Cnd_cntry_nm) doCnd_cntry_nm_NE(info);
		else if (ne == Cnd_foreign_flg) doCnd_foreign_flg_NE(info);
		else if (ne == Cnd_area_cd) doCnd_area_cd_NE(info);
		else if (ne == Cnd_area_nm) doCnd_area_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_memo4) doCnd_memo4_NE(info);
		else if (ne == Cnd_memo5) doCnd_memo5_NE(info);
		else if (ne == Cnd_memo6) doCnd_memo6_NE(info);
		else if (ne == Cnd_memo7) doCnd_memo7_NE(info);
		else if (ne == Cnd_memo8) doCnd_memo8_NE(info);
		else if (ne == Cnd_memo9) doCnd_memo9_NE(info);
		else if (ne == Cnd_memo10) doCnd_memo10_NE(info);
		else if (ne == Cnd_memo11) doCnd_memo11_NE(info);
		else if (ne == Cnd_memo12) doCnd_memo12_NE(info);
		else if (ne == Cnd_memo13) doCnd_memo13_NE(info);
		else if (ne == Cnd_memo14) doCnd_memo14_NE(info);
		else if (ne == Cnd_memo15) doCnd_memo15_NE(info);
		else if (ne == Cnd_memo16) doCnd_memo16_NE(info);
		else if (ne == Cnd_memo17) doCnd_memo17_NE(info);
		else if (ne == Cnd_memo18) doCnd_memo18_NE(info);
		else if (ne == Cnd_memo19) doCnd_memo19_NE(info);
		else if (ne == Cnd_memo20) doCnd_memo20_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NE(info);
		else if (ne == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NE(info);
		else if (ne == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NE(info);
		else if (ne == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NE(info);
		else if (ne == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NE(info);
		else if (ne == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NE(info);
		else if (ne == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NE(info);
		else if (ne == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NE(info);
		else if (ne == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NE(info);
		else if (ne == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NE(info);
		else if (ne == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NE(info);
		else if (ne == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NE(info);
		else if (ne == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NE(info);
		else if (ne == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NE(info);
		else if (ne == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NE(info);
		else if (ne == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NE(info);
		else if (ne == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NE(info);
		else if (ne == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NE(info);
		else if (ne == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NE(info);
		else if (ne == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_bp_cd) doDtl_bp_cd_NE(info);
		else if (ne == columnDtl_bp_nm_lcl) doDtl_bp_nm_lcl_NE(info);
		else if (ne == columnDtl_bp_nm) doDtl_bp_nm_NE(info);
		else if (ne == columnDtl_bp_alt_nm1) doDtl_bp_alt_nm1_NE(info);
		else if (ne == columnDtl_bp_alt_nm2) doDtl_bp_alt_nm2_NE(info);
		else if (ne == columnDtl_bp_alt_nm3) doDtl_bp_alt_nm3_NE(info);
		else if (ne == columnDtl_bp_alt_nm4) doDtl_bp_alt_nm4_NE(info);
		else if (ne == columnDtl_dest_flg) doDtl_dest_flg_NE(info);
		else if (ne == columnDtl_cur_cd) doDtl_cur_cd_NE(info);
		else if (ne == columnDtl_zip_cd) doDtl_zip_cd_NE(info);
		else if (ne == columnDtl_addr1) doDtl_addr1_NE(info);
		else if (ne == columnDtl_addr2) doDtl_addr2_NE(info);
		else if (ne == columnDtl_addr3) doDtl_addr3_NE(info);
		else if (ne == columnDtl_addr4) doDtl_addr4_NE(info);
		else if (ne == columnDtl_tel) doDtl_tel_NE(info);
		else if (ne == columnDtl_fax) doDtl_fax_NE(info);
		else if (ne == columnDtl_ein) doDtl_ein_NE(info);
		else if (ne == columnDtl_cntry_cd) doDtl_cntry_cd_NE(info);
		else if (ne == columnDtl_cntry_nm) doDtl_cntry_nm_NE(info);
		else if (ne == columnDtl_area_cd) doDtl_area_cd_NE(info);
		else if (ne == columnDtl_area_nm) doDtl_area_nm_NE(info);
		else if (ne == columnDtl_bp_grp_cd1) doDtl_bp_grp_cd1_NE(info);
		else if (ne == columnDtl_bp_grp_nm1) doDtl_bp_grp_nm1_NE(info);
		else if (ne == columnDtl_bp_grp_cd2) doDtl_bp_grp_cd2_NE(info);
		else if (ne == columnDtl_bp_grp_nm2) doDtl_bp_grp_nm2_NE(info);
		else if (ne == columnDtl_bp_grp_cd3) doDtl_bp_grp_cd3_NE(info);
		else if (ne == columnDtl_bp_grp_nm3) doDtl_bp_grp_nm3_NE(info);
		else if (ne == columnDtl_bp_grp_cd4) doDtl_bp_grp_cd4_NE(info);
		else if (ne == columnDtl_bp_grp_nm4) doDtl_bp_grp_nm4_NE(info);
		else if (ne == columnDtl_bp_grp_cd5) doDtl_bp_grp_cd5_NE(info);
		else if (ne == columnDtl_bp_grp_nm5) doDtl_bp_grp_nm5_NE(info);
		else if (ne == columnDtl_bp_grp_cd6) doDtl_bp_grp_cd6_NE(info);
		else if (ne == columnDtl_bp_grp_nm6) doDtl_bp_grp_nm6_NE(info);
		else if (ne == columnDtl_bp_grp_cd7) doDtl_bp_grp_cd7_NE(info);
		else if (ne == columnDtl_bp_grp_nm7) doDtl_bp_grp_nm7_NE(info);
		else if (ne == columnDtl_bp_grp_cd8) doDtl_bp_grp_cd8_NE(info);
		else if (ne == columnDtl_bp_grp_nm8) doDtl_bp_grp_nm8_NE(info);
		else if (ne == columnDtl_bp_grp_cd9) doDtl_bp_grp_cd9_NE(info);
		else if (ne == columnDtl_bp_grp_nm9) doDtl_bp_grp_nm9_NE(info);
		else if (ne == columnDtl_bp_grp_cd10) doDtl_bp_grp_cd10_NE(info);
		else if (ne == columnDtl_bp_grp_nm10) doDtl_bp_grp_nm10_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_memo4) doDtl_memo4_NE(info);
		else if (ne == columnDtl_memo5) doDtl_memo5_NE(info);
		else if (ne == columnDtl_memo6) doDtl_memo6_NE(info);
		else if (ne == columnDtl_memo7) doDtl_memo7_NE(info);
		else if (ne == columnDtl_memo8) doDtl_memo8_NE(info);
		else if (ne == columnDtl_memo9) doDtl_memo9_NE(info);
		else if (ne == columnDtl_memo10) doDtl_memo10_NE(info);
		else if (ne == columnDtl_memo11) doDtl_memo11_NE(info);
		else if (ne == columnDtl_memo12) doDtl_memo12_NE(info);
		else if (ne == columnDtl_memo13) doDtl_memo13_NE(info);
		else if (ne == columnDtl_memo14) doDtl_memo14_NE(info);
		else if (ne == columnDtl_memo15) doDtl_memo15_NE(info);
		else if (ne == columnDtl_memo16) doDtl_memo16_NE(info);
		else if (ne == columnDtl_memo17) doDtl_memo17_NE(info);
		else if (ne == columnDtl_memo18) doDtl_memo18_NE(info);
		else if (ne == columnDtl_memo19) doDtl_memo19_NE(info);
		else if (ne == columnDtl_memo20) doDtl_memo20_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_bp_cd) doLcl_bp_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_bp_nm) doLcl_bp_nm_NE(info);
		else if (ne == columnLcl_bp_alt_nm1) doLcl_bp_alt_nm1_NE(info);
		else if (ne == columnLcl_bp_alt_nm2) doLcl_bp_alt_nm2_NE(info);
		else if (ne == columnLcl_bp_alt_nm3) doLcl_bp_alt_nm3_NE(info);
		else if (ne == columnLcl_bp_alt_nm4) doLcl_bp_alt_nm4_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_memo4) doLcl_memo4_NE(info);
		else if (ne == columnLcl_memo5) doLcl_memo5_NE(info);
		else if (ne == columnLcl_memo6) doLcl_memo6_NE(info);
		else if (ne == columnLcl_memo7) doLcl_memo7_NE(info);
		else if (ne == columnLcl_memo8) doLcl_memo8_NE(info);
		else if (ne == columnLcl_memo9) doLcl_memo9_NE(info);
		else if (ne == columnLcl_memo10) doLcl_memo10_NE(info);
		else if (ne == columnLcl_memo11) doLcl_memo11_NE(info);
		else if (ne == columnLcl_memo12) doLcl_memo12_NE(info);
		else if (ne == columnLcl_memo13) doLcl_memo13_NE(info);
		else if (ne == columnLcl_memo14) doLcl_memo14_NE(info);
		else if (ne == columnLcl_memo15) doLcl_memo15_NE(info);
		else if (ne == columnLcl_memo16) doLcl_memo16_NE(info);
		else if (ne == columnLcl_memo17) doLcl_memo17_NE(info);
		else if (ne == columnLcl_memo18) doLcl_memo18_NE(info);
		else if (ne == columnLcl_memo19) doLcl_memo19_NE(info);
		else if (ne == columnLcl_memo20) doLcl_memo20_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ein_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo20_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_ein) doCnd_ein_NX(info);
		else if (nx == Cnd_bp_alt_nm1) doCnd_bp_alt_nm1_NX(info);
		else if (nx == Cnd_bp_alt_nm2) doCnd_bp_alt_nm2_NX(info);
		else if (nx == Cnd_bp_alt_nm3) doCnd_bp_alt_nm3_NX(info);
		else if (nx == Cnd_bp_alt_nm4) doCnd_bp_alt_nm4_NX(info);
		else if (nx == Cnd_cntry_cd) doCnd_cntry_cd_NX(info);
		else if (nx == Cnd_cntry_nm) doCnd_cntry_nm_NX(info);
		else if (nx == Cnd_foreign_flg) doCnd_foreign_flg_NX(info);
		else if (nx == Cnd_area_cd) doCnd_area_cd_NX(info);
		else if (nx == Cnd_area_nm) doCnd_area_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_memo4) doCnd_memo4_NX(info);
		else if (nx == Cnd_memo5) doCnd_memo5_NX(info);
		else if (nx == Cnd_memo6) doCnd_memo6_NX(info);
		else if (nx == Cnd_memo7) doCnd_memo7_NX(info);
		else if (nx == Cnd_memo8) doCnd_memo8_NX(info);
		else if (nx == Cnd_memo9) doCnd_memo9_NX(info);
		else if (nx == Cnd_memo10) doCnd_memo10_NX(info);
		else if (nx == Cnd_memo11) doCnd_memo11_NX(info);
		else if (nx == Cnd_memo12) doCnd_memo12_NX(info);
		else if (nx == Cnd_memo13) doCnd_memo13_NX(info);
		else if (nx == Cnd_memo14) doCnd_memo14_NX(info);
		else if (nx == Cnd_memo15) doCnd_memo15_NX(info);
		else if (nx == Cnd_memo16) doCnd_memo16_NX(info);
		else if (nx == Cnd_memo17) doCnd_memo17_NX(info);
		else if (nx == Cnd_memo18) doCnd_memo18_NX(info);
		else if (nx == Cnd_memo19) doCnd_memo19_NX(info);
		else if (nx == Cnd_memo20) doCnd_memo20_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NX(info);
		else if (nx == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NX(info);
		else if (nx == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NX(info);
		else if (nx == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NX(info);
		else if (nx == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NX(info);
		else if (nx == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NX(info);
		else if (nx == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NX(info);
		else if (nx == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NX(info);
		else if (nx == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NX(info);
		else if (nx == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NX(info);
		else if (nx == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NX(info);
		else if (nx == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NX(info);
		else if (nx == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NX(info);
		else if (nx == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NX(info);
		else if (nx == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NX(info);
		else if (nx == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NX(info);
		else if (nx == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NX(info);
		else if (nx == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NX(info);
		else if (nx == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NX(info);
		else if (nx == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_bp_cd) doDtl_bp_cd_NX(info);
		else if (nx == columnDtl_bp_nm_lcl) doDtl_bp_nm_lcl_NX(info);
		else if (nx == columnDtl_bp_nm) doDtl_bp_nm_NX(info);
		else if (nx == columnDtl_bp_alt_nm1) doDtl_bp_alt_nm1_NX(info);
		else if (nx == columnDtl_bp_alt_nm2) doDtl_bp_alt_nm2_NX(info);
		else if (nx == columnDtl_bp_alt_nm3) doDtl_bp_alt_nm3_NX(info);
		else if (nx == columnDtl_bp_alt_nm4) doDtl_bp_alt_nm4_NX(info);
		else if (nx == columnDtl_dest_flg) doDtl_dest_flg_NX(info);
		else if (nx == columnDtl_cur_cd) doDtl_cur_cd_NX(info);
		else if (nx == columnDtl_zip_cd) doDtl_zip_cd_NX(info);
		else if (nx == columnDtl_addr1) doDtl_addr1_NX(info);
		else if (nx == columnDtl_addr2) doDtl_addr2_NX(info);
		else if (nx == columnDtl_addr3) doDtl_addr3_NX(info);
		else if (nx == columnDtl_addr4) doDtl_addr4_NX(info);
		else if (nx == columnDtl_tel) doDtl_tel_NX(info);
		else if (nx == columnDtl_fax) doDtl_fax_NX(info);
		else if (nx == columnDtl_ein) doDtl_ein_NX(info);
		else if (nx == columnDtl_cntry_cd) doDtl_cntry_cd_NX(info);
		else if (nx == columnDtl_cntry_nm) doDtl_cntry_nm_NX(info);
		else if (nx == columnDtl_area_cd) doDtl_area_cd_NX(info);
		else if (nx == columnDtl_area_nm) doDtl_area_nm_NX(info);
		else if (nx == columnDtl_bp_grp_cd1) doDtl_bp_grp_cd1_NX(info);
		else if (nx == columnDtl_bp_grp_nm1) doDtl_bp_grp_nm1_NX(info);
		else if (nx == columnDtl_bp_grp_cd2) doDtl_bp_grp_cd2_NX(info);
		else if (nx == columnDtl_bp_grp_nm2) doDtl_bp_grp_nm2_NX(info);
		else if (nx == columnDtl_bp_grp_cd3) doDtl_bp_grp_cd3_NX(info);
		else if (nx == columnDtl_bp_grp_nm3) doDtl_bp_grp_nm3_NX(info);
		else if (nx == columnDtl_bp_grp_cd4) doDtl_bp_grp_cd4_NX(info);
		else if (nx == columnDtl_bp_grp_nm4) doDtl_bp_grp_nm4_NX(info);
		else if (nx == columnDtl_bp_grp_cd5) doDtl_bp_grp_cd5_NX(info);
		else if (nx == columnDtl_bp_grp_nm5) doDtl_bp_grp_nm5_NX(info);
		else if (nx == columnDtl_bp_grp_cd6) doDtl_bp_grp_cd6_NX(info);
		else if (nx == columnDtl_bp_grp_nm6) doDtl_bp_grp_nm6_NX(info);
		else if (nx == columnDtl_bp_grp_cd7) doDtl_bp_grp_cd7_NX(info);
		else if (nx == columnDtl_bp_grp_nm7) doDtl_bp_grp_nm7_NX(info);
		else if (nx == columnDtl_bp_grp_cd8) doDtl_bp_grp_cd8_NX(info);
		else if (nx == columnDtl_bp_grp_nm8) doDtl_bp_grp_nm8_NX(info);
		else if (nx == columnDtl_bp_grp_cd9) doDtl_bp_grp_cd9_NX(info);
		else if (nx == columnDtl_bp_grp_nm9) doDtl_bp_grp_nm9_NX(info);
		else if (nx == columnDtl_bp_grp_cd10) doDtl_bp_grp_cd10_NX(info);
		else if (nx == columnDtl_bp_grp_nm10) doDtl_bp_grp_nm10_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_memo4) doDtl_memo4_NX(info);
		else if (nx == columnDtl_memo5) doDtl_memo5_NX(info);
		else if (nx == columnDtl_memo6) doDtl_memo6_NX(info);
		else if (nx == columnDtl_memo7) doDtl_memo7_NX(info);
		else if (nx == columnDtl_memo8) doDtl_memo8_NX(info);
		else if (nx == columnDtl_memo9) doDtl_memo9_NX(info);
		else if (nx == columnDtl_memo10) doDtl_memo10_NX(info);
		else if (nx == columnDtl_memo11) doDtl_memo11_NX(info);
		else if (nx == columnDtl_memo12) doDtl_memo12_NX(info);
		else if (nx == columnDtl_memo13) doDtl_memo13_NX(info);
		else if (nx == columnDtl_memo14) doDtl_memo14_NX(info);
		else if (nx == columnDtl_memo15) doDtl_memo15_NX(info);
		else if (nx == columnDtl_memo16) doDtl_memo16_NX(info);
		else if (nx == columnDtl_memo17) doDtl_memo17_NX(info);
		else if (nx == columnDtl_memo18) doDtl_memo18_NX(info);
		else if (nx == columnDtl_memo19) doDtl_memo19_NX(info);
		else if (nx == columnDtl_memo20) doDtl_memo20_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_bp_cd) doLcl_bp_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_bp_nm) doLcl_bp_nm_NX(info);
		else if (nx == columnLcl_bp_alt_nm1) doLcl_bp_alt_nm1_NX(info);
		else if (nx == columnLcl_bp_alt_nm2) doLcl_bp_alt_nm2_NX(info);
		else if (nx == columnLcl_bp_alt_nm3) doLcl_bp_alt_nm3_NX(info);
		else if (nx == columnLcl_bp_alt_nm4) doLcl_bp_alt_nm4_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_memo4) doLcl_memo4_NX(info);
		else if (nx == columnLcl_memo5) doLcl_memo5_NX(info);
		else if (nx == columnLcl_memo6) doLcl_memo6_NX(info);
		else if (nx == columnLcl_memo7) doLcl_memo7_NX(info);
		else if (nx == columnLcl_memo8) doLcl_memo8_NX(info);
		else if (nx == columnLcl_memo9) doLcl_memo9_NX(info);
		else if (nx == columnLcl_memo10) doLcl_memo10_NX(info);
		else if (nx == columnLcl_memo11) doLcl_memo11_NX(info);
		else if (nx == columnLcl_memo12) doLcl_memo12_NX(info);
		else if (nx == columnLcl_memo13) doLcl_memo13_NX(info);
		else if (nx == columnLcl_memo14) doLcl_memo14_NX(info);
		else if (nx == columnLcl_memo15) doLcl_memo15_NX(info);
		else if (nx == columnLcl_memo16) doLcl_memo16_NX(info);
		else if (nx == columnLcl_memo17) doLcl_memo17_NX(info);
		else if (nx == columnLcl_memo18) doLcl_memo18_NX(info);
		else if (nx == columnLcl_memo19) doLcl_memo19_NX(info);
		else if (nx == columnLcl_memo20) doLcl_memo20_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ein_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo20_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_ein) doCnd_ein_LC(info);
		else if (lc == Cnd_bp_alt_nm1) doCnd_bp_alt_nm1_LC(info);
		else if (lc == Cnd_bp_alt_nm2) doCnd_bp_alt_nm2_LC(info);
		else if (lc == Cnd_bp_alt_nm3) doCnd_bp_alt_nm3_LC(info);
		else if (lc == Cnd_bp_alt_nm4) doCnd_bp_alt_nm4_LC(info);
		else if (lc == Cnd_cntry_cd) doCnd_cntry_cd_LC(info);
		else if (lc == Cnd_cntry_nm) doCnd_cntry_nm_LC(info);
		else if (lc == Cnd_area_cd) doCnd_area_cd_LC(info);
		else if (lc == Cnd_area_nm) doCnd_area_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_memo4) doCnd_memo4_LC(info);
		else if (lc == Cnd_memo5) doCnd_memo5_LC(info);
		else if (lc == Cnd_memo6) doCnd_memo6_LC(info);
		else if (lc == Cnd_memo7) doCnd_memo7_LC(info);
		else if (lc == Cnd_memo8) doCnd_memo8_LC(info);
		else if (lc == Cnd_memo9) doCnd_memo9_LC(info);
		else if (lc == Cnd_memo10) doCnd_memo10_LC(info);
		else if (lc == Cnd_memo11) doCnd_memo11_LC(info);
		else if (lc == Cnd_memo12) doCnd_memo12_LC(info);
		else if (lc == Cnd_memo13) doCnd_memo13_LC(info);
		else if (lc == Cnd_memo14) doCnd_memo14_LC(info);
		else if (lc == Cnd_memo15) doCnd_memo15_LC(info);
		else if (lc == Cnd_memo16) doCnd_memo16_LC(info);
		else if (lc == Cnd_memo17) doCnd_memo17_LC(info);
		else if (lc == Cnd_memo18) doCnd_memo18_LC(info);
		else if (lc == Cnd_memo19) doCnd_memo19_LC(info);
		else if (lc == Cnd_memo20) doCnd_memo20_LC(info);
		else if (lc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_LC(info);
		else if (lc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_LC(info);
		else if (lc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_LC(info);
		else if (lc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_LC(info);
		else if (lc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_LC(info);
		else if (lc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_LC(info);
		else if (lc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_LC(info);
		else if (lc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_LC(info);
		else if (lc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_LC(info);
		else if (lc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_LC(info);
		else if (lc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_LC(info);
		else if (lc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_LC(info);
		else if (lc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_LC(info);
		else if (lc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_LC(info);
		else if (lc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_LC(info);
		else if (lc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_LC(info);
		else if (lc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_LC(info);
		else if (lc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_LC(info);
		else if (lc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_LC(info);
		else if (lc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_LC(info);
		else if (lc == columnDtl_bp_cd) doDtl_bp_cd_LC(info);
		else if (lc == columnDtl_bp_nm_lcl) doDtl_bp_nm_lcl_LC(info);
		else if (lc == columnDtl_bp_nm) doDtl_bp_nm_LC(info);
		else if (lc == columnDtl_bp_alt_nm1) doDtl_bp_alt_nm1_LC(info);
		else if (lc == columnDtl_bp_alt_nm2) doDtl_bp_alt_nm2_LC(info);
		else if (lc == columnDtl_bp_alt_nm3) doDtl_bp_alt_nm3_LC(info);
		else if (lc == columnDtl_bp_alt_nm4) doDtl_bp_alt_nm4_LC(info);
		else if (lc == columnDtl_cur_cd) doDtl_cur_cd_LC(info);
		else if (lc == columnDtl_zip_cd) doDtl_zip_cd_LC(info);
		else if (lc == columnDtl_addr1) doDtl_addr1_LC(info);
		else if (lc == columnDtl_addr2) doDtl_addr2_LC(info);
		else if (lc == columnDtl_addr3) doDtl_addr3_LC(info);
		else if (lc == columnDtl_addr4) doDtl_addr4_LC(info);
		else if (lc == columnDtl_tel) doDtl_tel_LC(info);
		else if (lc == columnDtl_fax) doDtl_fax_LC(info);
		else if (lc == columnDtl_ein) doDtl_ein_LC(info);
		else if (lc == columnDtl_cntry_cd) doDtl_cntry_cd_LC(info);
		else if (lc == columnDtl_cntry_nm) doDtl_cntry_nm_LC(info);
		else if (lc == columnDtl_area_cd) doDtl_area_cd_LC(info);
		else if (lc == columnDtl_area_nm) doDtl_area_nm_LC(info);
		else if (lc == columnDtl_bp_grp_cd1) doDtl_bp_grp_cd1_LC(info);
		else if (lc == columnDtl_bp_grp_nm1) doDtl_bp_grp_nm1_LC(info);
		else if (lc == columnDtl_bp_grp_cd2) doDtl_bp_grp_cd2_LC(info);
		else if (lc == columnDtl_bp_grp_nm2) doDtl_bp_grp_nm2_LC(info);
		else if (lc == columnDtl_bp_grp_cd3) doDtl_bp_grp_cd3_LC(info);
		else if (lc == columnDtl_bp_grp_nm3) doDtl_bp_grp_nm3_LC(info);
		else if (lc == columnDtl_bp_grp_cd4) doDtl_bp_grp_cd4_LC(info);
		else if (lc == columnDtl_bp_grp_nm4) doDtl_bp_grp_nm4_LC(info);
		else if (lc == columnDtl_bp_grp_cd5) doDtl_bp_grp_cd5_LC(info);
		else if (lc == columnDtl_bp_grp_nm5) doDtl_bp_grp_nm5_LC(info);
		else if (lc == columnDtl_bp_grp_cd6) doDtl_bp_grp_cd6_LC(info);
		else if (lc == columnDtl_bp_grp_nm6) doDtl_bp_grp_nm6_LC(info);
		else if (lc == columnDtl_bp_grp_cd7) doDtl_bp_grp_cd7_LC(info);
		else if (lc == columnDtl_bp_grp_nm7) doDtl_bp_grp_nm7_LC(info);
		else if (lc == columnDtl_bp_grp_cd8) doDtl_bp_grp_cd8_LC(info);
		else if (lc == columnDtl_bp_grp_nm8) doDtl_bp_grp_nm8_LC(info);
		else if (lc == columnDtl_bp_grp_cd9) doDtl_bp_grp_cd9_LC(info);
		else if (lc == columnDtl_bp_grp_nm9) doDtl_bp_grp_nm9_LC(info);
		else if (lc == columnDtl_bp_grp_cd10) doDtl_bp_grp_cd10_LC(info);
		else if (lc == columnDtl_bp_grp_nm10) doDtl_bp_grp_nm10_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_memo4) doDtl_memo4_LC(info);
		else if (lc == columnDtl_memo5) doDtl_memo5_LC(info);
		else if (lc == columnDtl_memo6) doDtl_memo6_LC(info);
		else if (lc == columnDtl_memo7) doDtl_memo7_LC(info);
		else if (lc == columnDtl_memo8) doDtl_memo8_LC(info);
		else if (lc == columnDtl_memo9) doDtl_memo9_LC(info);
		else if (lc == columnDtl_memo10) doDtl_memo10_LC(info);
		else if (lc == columnDtl_memo11) doDtl_memo11_LC(info);
		else if (lc == columnDtl_memo12) doDtl_memo12_LC(info);
		else if (lc == columnDtl_memo13) doDtl_memo13_LC(info);
		else if (lc == columnDtl_memo14) doDtl_memo14_LC(info);
		else if (lc == columnDtl_memo15) doDtl_memo15_LC(info);
		else if (lc == columnDtl_memo16) doDtl_memo16_LC(info);
		else if (lc == columnDtl_memo17) doDtl_memo17_LC(info);
		else if (lc == columnDtl_memo18) doDtl_memo18_LC(info);
		else if (lc == columnDtl_memo19) doDtl_memo19_LC(info);
		else if (lc == columnDtl_memo20) doDtl_memo20_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
		else if (lc == columnLcl_bp_cd) doLcl_bp_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_bp_nm) doLcl_bp_nm_LC(info);
		else if (lc == columnLcl_bp_alt_nm1) doLcl_bp_alt_nm1_LC(info);
		else if (lc == columnLcl_bp_alt_nm2) doLcl_bp_alt_nm2_LC(info);
		else if (lc == columnLcl_bp_alt_nm3) doLcl_bp_alt_nm3_LC(info);
		else if (lc == columnLcl_bp_alt_nm4) doLcl_bp_alt_nm4_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_memo4) doLcl_memo4_LC(info);
		else if (lc == columnLcl_memo5) doLcl_memo5_LC(info);
		else if (lc == columnLcl_memo6) doLcl_memo6_LC(info);
		else if (lc == columnLcl_memo7) doLcl_memo7_LC(info);
		else if (lc == columnLcl_memo8) doLcl_memo8_LC(info);
		else if (lc == columnLcl_memo9) doLcl_memo9_LC(info);
		else if (lc == columnLcl_memo10) doLcl_memo10_LC(info);
		else if (lc == columnLcl_memo11) doLcl_memo11_LC(info);
		else if (lc == columnLcl_memo12) doLcl_memo12_LC(info);
		else if (lc == columnLcl_memo13) doLcl_memo13_LC(info);
		else if (lc == columnLcl_memo14) doLcl_memo14_LC(info);
		else if (lc == columnLcl_memo15) doLcl_memo15_LC(info);
		else if (lc == columnLcl_memo16) doLcl_memo16_LC(info);
		else if (lc == columnLcl_memo17) doLcl_memo17_LC(info);
		else if (lc == columnLcl_memo18) doLcl_memo18_LC(info);
		else if (lc == columnLcl_memo19) doLcl_memo19_LC(info);
		else if (lc == columnLcl_memo20) doLcl_memo20_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ein_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ein_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[bp_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_bp_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo20_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_area_cd]の作成メソッド
	 */
	public MCList getCnd_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cntry_cd]の作成メソッド
	 */
	public MCList getDtl_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_area_cd]の作成メソッド
	 */
	public MCList getDtl_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd1]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd2]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd3]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd4]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd5]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd6]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd7]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd8]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd9]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_grp_cd10]の作成メソッド
	 */
	public MCList getDtl_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0620.Srch01")) {
			return new MA_MABCL0620_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0620.Upd01")) {
			return new MA_MABCL0620_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0620.Del01")) {
			return new MA_MABCL0620_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0620_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0620_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0620_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0620_Srch01Bridge() {
			p_MA_MABCL0620_Srch01 = new MCParam(PDef.MA_MABCL0620_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0620_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0620.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0620.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0620.LclR.class));

			p_MA_MABCL0620_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0620_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0620_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0620_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0620_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0620.CndR up0() {
			return (mcframe.clientMABC.MABCP0620.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0620.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0620.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0620.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0620.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0620_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0620.DtlR.class));
			p_MA_MABCL0620_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0620.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0620_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0620.DtlR>)p_MA_MABCL0620_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0620.LclR>)p_MA_MABCL0620_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0620_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0620_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0620_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0620_Upd01Bridge() {
			p_MA_MABCL0620_Upd01 = new MCParam(PDef.MA_MABCL0620_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0620_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0620.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0620.LclR.class));
			// Down

			p_MA_MABCL0620_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0620_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0620_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0620_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0620_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0620_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0620.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0620.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0620.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0620.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0620_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0620_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0620_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0620_Del01;

		/** コンストラクタ */
		protected MA_MABCL0620_Del01Bridge() {
			p_MA_MABCL0620_Del01 = new MCParam(PDef.MA_MABCL0620_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0620_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0620.DtlR.class));
			// Down

			p_MA_MABCL0620_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0620_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0620_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0620_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0620_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0620.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0620.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0620_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}