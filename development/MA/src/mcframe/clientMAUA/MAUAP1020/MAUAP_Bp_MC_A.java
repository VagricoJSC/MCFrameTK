package mcframe.clientMAUA.MAUAP1020;

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

/**
 * 画面"MAUAP_Bp"パネルクラスです。<p>
 *
 * 取引先の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUAP_Bp_MC_A extends mcframe.clientMAUD.MAUDP0020.MAUDP_ISPanel{
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
	public static final String SUBMODULE_ID = "MAUA";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUAP1020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_flg = null;
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_acst_flg = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCCheckBox Cnd_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCCheckBox Cnd_rcst_flg = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_flg = null;
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public MCCheckBox Cnd_dest_flg = null;
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public MCCheckBox Cnd_cred_flg = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCCheckBox Cnd_sppl_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_asppl_flg = null;
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCCheckBox Cnd_psppl_flg = null;
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public MCCheckBox Cnd_maker_flg = null;
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public MCCheckBox Cnd_tdlv_flg = null;
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
	public MCLabel Cnd_dt_Label = null;
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDateField Cnd_dt = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_cnd_deselect_all = null;
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
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_p_PPanel;
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp_p.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp_p.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp_p.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp_p.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp_p.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp_p.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp_p.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp_p.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp_p.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp_p.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp_p.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp_p.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp_p.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp_p.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp_p.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp_p.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp_p.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp_p.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp_p.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp_p.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp_p.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp_p.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp_p.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp_p.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp_p.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp_p.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp_p.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp_p.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp_p.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp_p.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
	public MCLabel Cnd_bp_is_srch_typ_nm_Label = null;
	/**
	 * Search type 検索区分.<p>
	 *
	 */
	public MCTextField Cnd_bp_is_srch_typ_nm = null;
	/**
	 * 0,Forward match;1,Partial match;2,Backward match;3,Perfect match 0,前方一致;1,部分一致;2,後方一致;3,完全一致.<p>
	 *
	 */
	public MCButtonGroup Cnd_match_typ_Group = null;
	public MCRadioButton Cnd_match_typ_0 = null;
	public MCRadioButton Cnd_match_typ_1 = null;
	public MCRadioButton Cnd_match_typ_2 = null;
	public MCRadioButton Cnd_match_typ_3 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [SrchBtn1]ブロック関連のField定義
	public MCPanel SrchBtn1Panel = null;
	// [SrchBtn1]ブロックの項目のField定義
	// [SrchBtn2]ブロック関連のField定義
	public MCPanel SrchBtn2Panel = null;
	// [SrchBtn2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RsltWrk]ブロック関連のField定義
	public MCPanel RsltWrkPanel = null;
	// [RsltWrk]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMAUA.MAUAP1020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * BP 取引先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_alt_nm1 = null;
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_alt_nm2 = null;
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_alt_nm3 = null;
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_alt_nm4 = null;
	/**
	 * Corporation number 法人番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ein = null;
	/**
	 * Country 国.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cntry_nm = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Region 地域.<p>
	 *
	 */
	public MCColumnConfig columnRslt_area_cd = null;
	/**
	 * Region name 地域名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_area_nm = null;
	/**
	 * Currency 通貨.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_flg = null;
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_sundry_flg = null;
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_acst_flg = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcst_flg = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_flg = null;
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_sundry_flg = null;
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tdlv_flg = null;
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dest_flg = null;
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cred_flg = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_flg = null;
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_flg = null;
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo3 = null;
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo4 = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo5 = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo6 = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo7 = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo8 = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo9 = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo10 = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo11 = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo12 = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo13 = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo14 = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo15 = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo16 = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo17 = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo18 = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo19 = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_memo20 = null;
	public mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D Rslt_bp_grp_p_PPanel;
	public MCColumnConfig columnRslt_bp_grp_cd1;// [Rslt]の[bp_grp_p.bp_grp_cd1]を[columnRslt_bp_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm1;// [Rslt]の[bp_grp_p.bp_grp_nm1]を[columnRslt_bp_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd2;// [Rslt]の[bp_grp_p.bp_grp_cd2]を[columnRslt_bp_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm2;// [Rslt]の[bp_grp_p.bp_grp_nm2]を[columnRslt_bp_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd3;// [Rslt]の[bp_grp_p.bp_grp_cd3]を[columnRslt_bp_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm3;// [Rslt]の[bp_grp_p.bp_grp_nm3]を[columnRslt_bp_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd4;// [Rslt]の[bp_grp_p.bp_grp_cd4]を[columnRslt_bp_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm4;// [Rslt]の[bp_grp_p.bp_grp_nm4]を[columnRslt_bp_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd5;// [Rslt]の[bp_grp_p.bp_grp_cd5]を[columnRslt_bp_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm5;// [Rslt]の[bp_grp_p.bp_grp_nm5]を[columnRslt_bp_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd6;// [Rslt]の[bp_grp_p.bp_grp_cd6]を[columnRslt_bp_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm6;// [Rslt]の[bp_grp_p.bp_grp_nm6]を[columnRslt_bp_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd7;// [Rslt]の[bp_grp_p.bp_grp_cd7]を[columnRslt_bp_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm7;// [Rslt]の[bp_grp_p.bp_grp_nm7]を[columnRslt_bp_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd8;// [Rslt]の[bp_grp_p.bp_grp_cd8]を[columnRslt_bp_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm8;// [Rslt]の[bp_grp_p.bp_grp_nm8]を[columnRslt_bp_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd9;// [Rslt]の[bp_grp_p.bp_grp_cd9]を[columnRslt_bp_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm9;// [Rslt]の[bp_grp_p.bp_grp_nm9]を[columnRslt_bp_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_cd10;// [Rslt]の[bp_grp_p.bp_grp_cd10]を[columnRslt_bp_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_bp_grp_nm10;// [Rslt]の[bp_grp_p.bp_grp_nm10]を[columnRslt_bp_grp_nm10]としてエイリアス定義。
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	// [RsltHdr]ブロック関連のField定義
	public MCPanel RsltHdrPanel = null;
	// [RsltHdr]ブロックの項目のField定義
	public MCLabel RsltHdr_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField RsltHdr_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField RsltHdr_bp_nm = null;
	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public MCCheckBox RsltHdr_cst_sundry_flg = null;
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCCheckBox RsltHdr_dlv_sundry_flg = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCCheckBox RsltHdr_pri_prnt_flg = null;
	public MCLabel RsltHdr_zip_cd_Label = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCTextField RsltHdr_zip_cd = null;
	public MCLabel RsltHdr_addr1_Label = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCTextField RsltHdr_addr1 = null;
	public MCLabel RsltHdr_addr2_Label = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCTextField RsltHdr_addr2 = null;
	public MCLabel RsltHdr_addr3_Label = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCTextField RsltHdr_addr3 = null;
	public MCLabel RsltHdr_addr4_Label = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCTextField RsltHdr_addr4 = null;
	public MCLabel RsltHdr_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextComboBox RsltHdr_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField RsltHdr_cntry_nm = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCCheckBox RsltHdr_foreign_flg = null;
	public MCLabel RsltHdr_tel_Label = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCTextField RsltHdr_tel = null;
	public MCLabel RsltHdr_fax_Label = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCTextField RsltHdr_fax = null;
	public MCLabel RsltHdr_cst_cntct_dpt_Label = null;
	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public MCTextField RsltHdr_cst_cntct_dpt = null;
	public MCLabel RsltHdr_cst_cntct_psn_Label = null;
	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public MCTextField RsltHdr_cst_cntct_psn = null;
	public MCLabel RsltHdr_dlv_cntct_dpt_Label = null;
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_cntct_dpt = null;
	public MCLabel RsltHdr_dlv_cntct_psn_Label = null;
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public MCTextField RsltHdr_dlv_cntct_psn = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Accept 決定する.<p>
	 *
	 */
	public MCButton Btn_accept = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMAUA.MAUAP1020.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMAUA.MAUAP1020.RsltR> aRsltL;
	/** [RsltHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMAUA.MAUAP1020.RsltHdrR aRsltHdrR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMAUA.MAUAP1020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMAUA.MAUAP1020.CndR createCndR() {
		return mcframe.clientMAUA.MAUAP1020.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMAUA.MAUAP1020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMAUA.MAUAP1020.RsltR createRsltR() {
		return mcframe.clientMAUA.MAUAP1020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMAUA.MAUAP1020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMAUA.MAUAP1020.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 項目コピーによってaRsltHdrRを設定します。
	 *
	 * aRsltHdrRのインスタンスは変更されません。
	 *
	 * @param row RsltHdrR
	 */
	public void setRsltHdrR(mcframe.clientMAUA.MAUAP1020.RsltHdrR row) {
		if (row != null) {
			MCRow.copyall(getRsltHdrR(), row);
		}
	}

	/**
	 * [RsltHdr]ブロックのコンテナaRsltHdrRを返します。
	 *
	 * @return RsltHdrR
	 */
	public mcframe.clientMAUA.MAUAP1020.RsltHdrR getRsltHdrR() {
		return aRsltHdrR;
	}

	/**
	 * aRsltHdrRを作成します。
	 *
	 * @return RsltHdrR
	 */
	public mcframe.clientMAUA.MAUAP1020.RsltHdrR createRsltHdrR() {
		return mcframe.clientMAUA.MAUAP1020.RsltHdrR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		if(!MCCollectionUtil.contains(ret, getRsltHdrR())) ret.add(getRsltHdrR());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getRsltL()) return "Rslt";
		if(aCnt == getRsltHdrR()) return "RsltHdr";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Rslt")) return getRsltL();
		if(bId.equals("RsltHdr")) return getRsltHdrR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(SrchBtn1Panel);
		ret.add(SrchBtn2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltWrkPanel);
		ret.add(RsltPanel);
		ret.add(RsltHdrPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Bp_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aRsltHdrR = createRsltHdrR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Bp_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRsltHdrR = createRsltHdrR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUAP_Bp_MC.jbCreateTop((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateFold((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateTab1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateTab2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateCnd((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateCnd2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateSrchBtn1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateSrchBtn2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateCtrl((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateRsltWrk((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateRslt((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateRsltHdr((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbCreateBtn((MAUAP_Bp)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MAUAP_Bp p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MAUAP_Bp p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MAUAP_Bp p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MAUAP_Bp p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MAUAP_Bp p) {
		p.Cnd_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp_p());
		p.Cnd_bp_grp_p_PPanel.setName("Cnd.bp_grp_p");
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_p_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MAUAP_Bp p) {
	}

	/**
	 * [SrchBtn1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn1(MAUAP_Bp p) {
	}

	/**
	 * [SrchBtn2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchBtn2(MAUAP_Bp p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MAUAP_Bp p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RsltWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltWrk(MAUAP_Bp p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MAUAP_Bp p) {
		p.Rslt_bp_grp_p_PPanel = mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.create(mcframe.clientMAUA.MAUAP1020.RsltR.$bp_grp_p);
		p.Rslt_bp_grp_p_PPanel.setName("Rslt.bp_grp_p");
		p.columnRslt_bp_grp_cd1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd1;
		p.columnRslt_bp_grp_cd1.addAliasName("Rslt.bp_grp_cd1", p);
		p.columnRslt_bp_grp_nm1 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm1;
		p.columnRslt_bp_grp_nm1.addAliasName("Rslt.bp_grp_nm1", p);
		p.columnRslt_bp_grp_cd2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd2;
		p.columnRslt_bp_grp_cd2.addAliasName("Rslt.bp_grp_cd2", p);
		p.columnRslt_bp_grp_nm2 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm2;
		p.columnRslt_bp_grp_nm2.addAliasName("Rslt.bp_grp_nm2", p);
		p.columnRslt_bp_grp_cd3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd3;
		p.columnRslt_bp_grp_cd3.addAliasName("Rslt.bp_grp_cd3", p);
		p.columnRslt_bp_grp_nm3 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm3;
		p.columnRslt_bp_grp_nm3.addAliasName("Rslt.bp_grp_nm3", p);
		p.columnRslt_bp_grp_cd4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd4;
		p.columnRslt_bp_grp_cd4.addAliasName("Rslt.bp_grp_cd4", p);
		p.columnRslt_bp_grp_nm4 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm4;
		p.columnRslt_bp_grp_nm4.addAliasName("Rslt.bp_grp_nm4", p);
		p.columnRslt_bp_grp_cd5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd5;
		p.columnRslt_bp_grp_cd5.addAliasName("Rslt.bp_grp_cd5", p);
		p.columnRslt_bp_grp_nm5 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm5;
		p.columnRslt_bp_grp_nm5.addAliasName("Rslt.bp_grp_nm5", p);
		p.columnRslt_bp_grp_cd6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd6;
		p.columnRslt_bp_grp_cd6.addAliasName("Rslt.bp_grp_cd6", p);
		p.columnRslt_bp_grp_nm6 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm6;
		p.columnRslt_bp_grp_nm6.addAliasName("Rslt.bp_grp_nm6", p);
		p.columnRslt_bp_grp_cd7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd7;
		p.columnRslt_bp_grp_cd7.addAliasName("Rslt.bp_grp_cd7", p);
		p.columnRslt_bp_grp_nm7 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm7;
		p.columnRslt_bp_grp_nm7.addAliasName("Rslt.bp_grp_nm7", p);
		p.columnRslt_bp_grp_cd8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd8;
		p.columnRslt_bp_grp_cd8.addAliasName("Rslt.bp_grp_cd8", p);
		p.columnRslt_bp_grp_nm8 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm8;
		p.columnRslt_bp_grp_nm8.addAliasName("Rslt.bp_grp_nm8", p);
		p.columnRslt_bp_grp_cd9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd9;
		p.columnRslt_bp_grp_cd9.addAliasName("Rslt.bp_grp_cd9", p);
		p.columnRslt_bp_grp_nm9 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm9;
		p.columnRslt_bp_grp_nm9.addAliasName("Rslt.bp_grp_nm9", p);
		p.columnRslt_bp_grp_cd10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_cd10;
		p.columnRslt_bp_grp_cd10.addAliasName("Rslt.bp_grp_cd10", p);
		p.columnRslt_bp_grp_nm10 = p.Rslt_bp_grp_p_PPanel.columnBpGrp_bp_grp_nm10;
		p.columnRslt_bp_grp_nm10.addAliasName("Rslt.bp_grp_nm10", p);
	}

	/**
	 * [RsltHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltHdr(MAUAP_Bp p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MAUAP_Bp p) {
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
	
	
	/** [RsltHdr_cntry_cd_ListPutter]の定義 */
	private MCListPutter RsltHdr_cntry_cd_p = null;

	/**
	 * [RsltHdr_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltHdr_cntry_cd_ListPutter() {
		if (RsltHdr_cntry_cd_p == null) {
			RsltHdr_cntry_cd_p = createRsltHdr_cntry_cd_ListPutter(RsltHdr_cntry_cd, "cntry_cd", "cntry_nm");

		}
		return RsltHdr_cntry_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Bp create(){
		MAUAP_Bp p = new MAUAP_Bp();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUAP_Bp create(String name){
		MAUAP_Bp p = new MAUAP_Bp(name);
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
		MAUAP_Bp_MC.jbfInitTop((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitFold((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitTab1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitTab2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitCnd((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitCnd2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitSrchBtn1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitSrchBtn2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitCtrl((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitRsltWrk((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitRslt((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitRsltHdr((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbfInitBtn((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitTop((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitFold((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitTab1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitTab2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitCnd((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitCnd2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitSrchBtn1((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitSrchBtn2((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitCtrl((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitRsltWrk((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitRslt((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitRsltHdr((MAUAP_Bp)this);
		MAUAP_Bp_MC.jbInitBtn((MAUAP_Bp)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_cst_flg = p.beansFactory.createCheckBox("Cnd.cst_flg");
		p.Cnd_acst_flg = p.beansFactory.createCheckBox("Cnd.acst_flg");
		p.Cnd_bcst_flg = p.beansFactory.createCheckBox("Cnd.bcst_flg");
		p.Cnd_rcst_flg = p.beansFactory.createCheckBox("Cnd.rcst_flg");
		p.Cnd_dlv_flg = p.beansFactory.createCheckBox("Cnd.dlv_flg");
		p.Cnd_dest_flg = p.beansFactory.createCheckBox("Cnd.dest_flg");
		p.Cnd_cred_flg = p.beansFactory.createCheckBox("Cnd.cred_flg");
		p.Cnd_sppl_flg = p.beansFactory.createCheckBox("Cnd.sppl_flg");
		p.Cnd_asppl_flg = p.beansFactory.createCheckBox("Cnd.asppl_flg");
		p.Cnd_bsppl_flg = p.beansFactory.createCheckBox("Cnd.bsppl_flg");
		p.Cnd_psppl_flg = p.beansFactory.createCheckBox("Cnd.psppl_flg");
		p.Cnd_maker_flg = p.beansFactory.createCheckBox("Cnd.maker_flg");
		p.Cnd_tdlv_flg = p.beansFactory.createCheckBox("Cnd.tdlv_flg");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_ein_Label = p.beansFactory.createLabel("Cnd.ein_Label");
		p.Cnd_ein = p.beansFactory.createTextField("Cnd.ein");
		p.Cnd_ein.setLabel(p.Cnd_ein_Label);
		p.Cnd_dt_Label = p.beansFactory.createLabel("Cnd.dt_Label");
		p.Cnd_dt = p.beansFactory.createDateField("Cnd.dt");
		p.Cnd_dt.setLabel(p.Cnd_dt_Label);
		p.Cnd_cnd_select_all = p.beansFactory.createButton("Cnd.cnd_select_all", "no_border");
		p.Cnd_cnd_deselect_all = p.beansFactory.createButton("Cnd.cnd_deselect_all", "no_border");
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
		p.Cnd_bp_is_srch_typ_nm_Label = p.beansFactory.createLabel("Cnd.bp_is_srch_typ_nm_Label");
		p.Cnd_bp_is_srch_typ_nm = p.beansFactory.createTextField("Cnd.bp_is_srch_typ_nm");
		p.Cnd_bp_is_srch_typ_nm.setLabel(p.Cnd_bp_is_srch_typ_nm_Label);
		p.Cnd_match_typ_Group = p.beansFactory.createButtonGroup("Cnd.match_typ");
		p.Cnd_match_typ_0 = p.beansFactory.createRadioButton("Cnd.match_typ_0");
		p.Cnd_match_typ_1 = p.beansFactory.createRadioButton("Cnd.match_typ_1");
		p.Cnd_match_typ_2 = p.beansFactory.createRadioButton("Cnd.match_typ_2");
		p.Cnd_match_typ_3 = p.beansFactory.createRadioButton("Cnd.match_typ_3");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn1(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel = p.beansFactory.createPanel("SrchBtn1");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchBtn2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel = p.beansFactory.createPanel("SrchBtn2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltWrk(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.RsltWrkPanel = p.beansFactory.createPanel("RsltWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_bp_alt_nm1 = p.beansFactory.createTableColumn("Rslt.bp_alt_nm1", MCColumnType.TEXT);
		p.columnRslt_bp_alt_nm2 = p.beansFactory.createTableColumn("Rslt.bp_alt_nm2", MCColumnType.TEXT);
		p.columnRslt_bp_alt_nm3 = p.beansFactory.createTableColumn("Rslt.bp_alt_nm3", MCColumnType.TEXT);
		p.columnRslt_bp_alt_nm4 = p.beansFactory.createTableColumn("Rslt.bp_alt_nm4", MCColumnType.TEXT);
		p.columnRslt_ein = p.beansFactory.createTableColumn("Rslt.ein", MCColumnType.TEXT);
		p.columnRslt_cntry_cd = p.beansFactory.createTableColumn("Rslt.cntry_cd", MCColumnType.TEXT);
		p.columnRslt_cntry_nm = p.beansFactory.createTableColumn("Rslt.cntry_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_area_cd = p.beansFactory.createTableColumn("Rslt.area_cd", MCColumnType.TEXT);
		p.columnRslt_area_nm = p.beansFactory.createTableColumn("Rslt.area_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_cst_flg = p.beansFactory.createTableColumn("Rslt.cst_flg", MCColumnType.CHECK);
		p.columnRslt_cst_sundry_flg = p.beansFactory.createTableColumn("Rslt.cst_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_acst_flg = p.beansFactory.createTableColumn("Rslt.acst_flg", MCColumnType.CHECK);
		p.columnRslt_bcst_flg = p.beansFactory.createTableColumn("Rslt.bcst_flg", MCColumnType.CHECK);
		p.columnRslt_rcst_flg = p.beansFactory.createTableColumn("Rslt.rcst_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_flg = p.beansFactory.createTableColumn("Rslt.dlv_flg", MCColumnType.CHECK);
		p.columnRslt_dlv_sundry_flg = p.beansFactory.createTableColumn("Rslt.dlv_sundry_flg", MCColumnType.CHECK);
		p.columnRslt_tdlv_flg = p.beansFactory.createTableColumn("Rslt.tdlv_flg", MCColumnType.CHECK);
		p.columnRslt_dest_flg = p.beansFactory.createTableColumn("Rslt.dest_flg", MCColumnType.CHECK);
		p.columnRslt_cred_flg = p.beansFactory.createTableColumn("Rslt.cred_flg", MCColumnType.CHECK);
		p.columnRslt_sppl_flg = p.beansFactory.createTableColumn("Rslt.sppl_flg", MCColumnType.CHECK);
		p.columnRslt_asppl_flg = p.beansFactory.createTableColumn("Rslt.asppl_flg", MCColumnType.CHECK);
		p.columnRslt_bsppl_flg = p.beansFactory.createTableColumn("Rslt.bsppl_flg", MCColumnType.CHECK);
		p.columnRslt_psppl_flg = p.beansFactory.createTableColumn("Rslt.psppl_flg", MCColumnType.CHECK);
		p.columnRslt_maker_flg = p.beansFactory.createTableColumn("Rslt.maker_flg", MCColumnType.CHECK);
		p.columnRslt_memo1 = p.beansFactory.createTableColumn("Rslt.memo1", MCColumnType.TEXT);
		p.columnRslt_memo2 = p.beansFactory.createTableColumn("Rslt.memo2", MCColumnType.TEXT);
		p.columnRslt_memo3 = p.beansFactory.createTableColumn("Rslt.memo3", MCColumnType.TEXT);
		p.columnRslt_memo4 = p.beansFactory.createTableColumn("Rslt.memo4", MCColumnType.TEXT);
		p.columnRslt_memo5 = p.beansFactory.createTableColumn("Rslt.memo5", MCColumnType.TEXT);
		p.columnRslt_memo6 = p.beansFactory.createTableColumn("Rslt.memo6", MCColumnType.TEXT);
		p.columnRslt_memo7 = p.beansFactory.createTableColumn("Rslt.memo7", MCColumnType.TEXT);
		p.columnRslt_memo8 = p.beansFactory.createTableColumn("Rslt.memo8", MCColumnType.TEXT);
		p.columnRslt_memo9 = p.beansFactory.createTableColumn("Rslt.memo9", MCColumnType.TEXT);
		p.columnRslt_memo10 = p.beansFactory.createTableColumn("Rslt.memo10", MCColumnType.TEXT);
		p.columnRslt_memo11 = p.beansFactory.createTableColumn("Rslt.memo11", MCColumnType.TEXT);
		p.columnRslt_memo12 = p.beansFactory.createTableColumn("Rslt.memo12", MCColumnType.TEXT);
		p.columnRslt_memo13 = p.beansFactory.createTableColumn("Rslt.memo13", MCColumnType.TEXT);
		p.columnRslt_memo14 = p.beansFactory.createTableColumn("Rslt.memo14", MCColumnType.TEXT);
		p.columnRslt_memo15 = p.beansFactory.createTableColumn("Rslt.memo15", MCColumnType.TEXT);
		p.columnRslt_memo16 = p.beansFactory.createTableColumn("Rslt.memo16", MCColumnType.TEXT);
		p.columnRslt_memo17 = p.beansFactory.createTableColumn("Rslt.memo17", MCColumnType.TEXT);
		p.columnRslt_memo18 = p.beansFactory.createTableColumn("Rslt.memo18", MCColumnType.TEXT);
		p.columnRslt_memo19 = p.beansFactory.createTableColumn("Rslt.memo19", MCColumnType.TEXT);
		p.columnRslt_memo20 = p.beansFactory.createTableColumn("Rslt.memo20", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [RsltHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltHdr(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.RsltHdrPanel = p.beansFactory.createPanel("RsltHdr");
		// ブロックの項目の初期化
		p.RsltHdr_bp_cd_Label = p.beansFactory.createLabel("RsltHdr.bp_cd_Label");
		p.RsltHdr_bp_cd = p.beansFactory.createTextField("RsltHdr.bp_cd");
		p.RsltHdr_bp_cd.setLabel(p.RsltHdr_bp_cd_Label);
		p.RsltHdr_bp_nm = p.beansFactory.createTextField("RsltHdr.bp_nm");
		p.RsltHdr_cst_sundry_flg = p.beansFactory.createCheckBox("RsltHdr.cst_sundry_flg");
		p.RsltHdr_dlv_sundry_flg = p.beansFactory.createCheckBox("RsltHdr.dlv_sundry_flg");
		p.RsltHdr_pri_prnt_flg = p.beansFactory.createCheckBox("RsltHdr.pri_prnt_flg");
		p.RsltHdr_zip_cd_Label = p.beansFactory.createLabel("RsltHdr.zip_cd_Label");
		p.RsltHdr_zip_cd = p.beansFactory.createTextField("RsltHdr.zip_cd");
		p.RsltHdr_zip_cd.setLabel(p.RsltHdr_zip_cd_Label);
		p.RsltHdr_addr1_Label = p.beansFactory.createLabel("RsltHdr.addr1_Label");
		p.RsltHdr_addr1 = p.beansFactory.createTextField("RsltHdr.addr1");
		p.RsltHdr_addr1.setLabel(p.RsltHdr_addr1_Label);
		p.RsltHdr_addr2_Label = p.beansFactory.createLabel("RsltHdr.addr2_Label");
		p.RsltHdr_addr2 = p.beansFactory.createTextField("RsltHdr.addr2");
		p.RsltHdr_addr2.setLabel(p.RsltHdr_addr2_Label);
		p.RsltHdr_addr3_Label = p.beansFactory.createLabel("RsltHdr.addr3_Label");
		p.RsltHdr_addr3 = p.beansFactory.createTextField("RsltHdr.addr3");
		p.RsltHdr_addr3.setLabel(p.RsltHdr_addr3_Label);
		p.RsltHdr_addr4_Label = p.beansFactory.createLabel("RsltHdr.addr4_Label");
		p.RsltHdr_addr4 = p.beansFactory.createTextField("RsltHdr.addr4");
		p.RsltHdr_addr4.setLabel(p.RsltHdr_addr4_Label);
		p.RsltHdr_cntry_cd_Label = p.beansFactory.createLabel("RsltHdr.cntry_cd_Label");
		p.RsltHdr_cntry_cd = p.beansFactory.createTextComboBox("RsltHdr.cntry_cd");
		p.RsltHdr_cntry_cd.setLabel(p.RsltHdr_cntry_cd_Label);
		p.RsltHdr_cntry_nm = p.beansFactory.createTextField("RsltHdr.cntry_nm");
		p.RsltHdr_foreign_flg = p.beansFactory.createCheckBox("RsltHdr.foreign_flg");
		p.RsltHdr_tel_Label = p.beansFactory.createLabel("RsltHdr.tel_Label");
		p.RsltHdr_tel = p.beansFactory.createTextField("RsltHdr.tel");
		p.RsltHdr_tel.setLabel(p.RsltHdr_tel_Label);
		p.RsltHdr_fax_Label = p.beansFactory.createLabel("RsltHdr.fax_Label");
		p.RsltHdr_fax = p.beansFactory.createTextField("RsltHdr.fax");
		p.RsltHdr_fax.setLabel(p.RsltHdr_fax_Label);
		p.RsltHdr_cst_cntct_dpt_Label = p.beansFactory.createLabel("RsltHdr.cst_cntct_dpt_Label");
		p.RsltHdr_cst_cntct_dpt = p.beansFactory.createTextField("RsltHdr.cst_cntct_dpt");
		p.RsltHdr_cst_cntct_dpt.setLabel(p.RsltHdr_cst_cntct_dpt_Label);
		p.RsltHdr_cst_cntct_psn_Label = p.beansFactory.createLabel("RsltHdr.cst_cntct_psn_Label");
		p.RsltHdr_cst_cntct_psn = p.beansFactory.createTextField("RsltHdr.cst_cntct_psn");
		p.RsltHdr_cst_cntct_psn.setLabel(p.RsltHdr_cst_cntct_psn_Label);
		p.RsltHdr_dlv_cntct_dpt_Label = p.beansFactory.createLabel("RsltHdr.dlv_cntct_dpt_Label");
		p.RsltHdr_dlv_cntct_dpt = p.beansFactory.createTextField("RsltHdr.dlv_cntct_dpt");
		p.RsltHdr_dlv_cntct_dpt.setLabel(p.RsltHdr_dlv_cntct_dpt_Label);
		p.RsltHdr_dlv_cntct_psn_Label = p.beansFactory.createLabel("RsltHdr.dlv_cntct_psn_Label");
		p.RsltHdr_dlv_cntct_psn = p.beansFactory.createTextField("RsltHdr.dlv_cntct_psn");
		p.RsltHdr_dlv_cntct_psn.setLabel(p.RsltHdr_dlv_cntct_psn_Label);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept = p.beansFactory.createButton("Btn.accept", "upd");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltWrkPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.SrchBtn1Panel);
		p.TopPanel.add(p.SrchBtn1Panel, null);
		p.SrchBtn1Panel.setNextBeans(p.SrchBtn2Panel);
		p.TopPanel.add(p.SrchBtn2Panel, null);
		p.SrchBtn2Panel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MAUAP_Bp p) {
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
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_cst_flg);
		p.CndPanel.setLastBeans(p.Cnd_cst_flg);
		p.Cnd_cst_flg.setNextBeans(p.Cnd_acst_flg);
		p.Cnd_cst_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.cst_flg_META);
		p.CndPanel.add(p.Cnd_acst_flg);
		p.Cnd_acst_flg.setNextBeans(p.Cnd_bcst_flg);
		p.Cnd_acst_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.acst_flg_META);
		p.CndPanel.add(p.Cnd_bcst_flg);
		p.Cnd_bcst_flg.setNextBeans(p.Cnd_rcst_flg);
		p.Cnd_bcst_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bcst_flg_META);
		p.CndPanel.add(p.Cnd_rcst_flg);
		p.Cnd_rcst_flg.setNextBeans(p.Cnd_dlv_flg);
		p.Cnd_rcst_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.rcst_flg_META);
		p.CndPanel.add(p.Cnd_dlv_flg);
		p.Cnd_dlv_flg.setNextBeans(p.Cnd_dest_flg);
		p.Cnd_dlv_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.dlv_flg_META);
		p.CndPanel.add(p.Cnd_dest_flg);
		p.Cnd_dest_flg.setNextBeans(p.Cnd_cred_flg);
		p.Cnd_dest_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.dest_flg_META);
		p.CndPanel.add(p.Cnd_cred_flg);
		p.Cnd_cred_flg.setNextBeans(p.Cnd_sppl_flg);
		p.Cnd_cred_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.cred_flg_META);
		p.CndPanel.add(p.Cnd_sppl_flg);
		p.Cnd_sppl_flg.setNextBeans(p.Cnd_asppl_flg);
		p.Cnd_sppl_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.sppl_flg_META);
		p.CndPanel.add(p.Cnd_asppl_flg);
		p.Cnd_asppl_flg.setNextBeans(p.Cnd_bsppl_flg);
		p.Cnd_asppl_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.asppl_flg_META);
		p.CndPanel.add(p.Cnd_bsppl_flg);
		p.Cnd_bsppl_flg.setNextBeans(p.Cnd_psppl_flg);
		p.Cnd_bsppl_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bsppl_flg_META);
		p.CndPanel.add(p.Cnd_psppl_flg);
		p.Cnd_psppl_flg.setNextBeans(p.Cnd_maker_flg);
		p.Cnd_psppl_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.psppl_flg_META);
		p.CndPanel.add(p.Cnd_maker_flg);
		p.Cnd_maker_flg.setNextBeans(p.Cnd_tdlv_flg);
		p.Cnd_maker_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.maker_flg_META);
		p.CndPanel.add(p.Cnd_tdlv_flg);
		p.Cnd_tdlv_flg.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_tdlv_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.tdlv_flg_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_cd_META);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ein);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.CndPanel.add(p.Cnd_ein_Label);
		p.CndPanel.add(p.Cnd_ein);
		p.Cnd_ein.setNextBeans(p.Cnd_dt);
		p.Cnd_ein.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.ein_META);
		p.setPluralValueEnable(p.Cnd_ein, true);
		p.CndPanel.add(p.Cnd_dt_Label);
		p.CndPanel.add(p.Cnd_dt);
		p.Cnd_dt.setNextBeans(p.Cnd_cnd_select_all);
		p.Cnd_dt.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.dt_META);
		p.Cnd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_cnd_select_all.setIcon("SELECT_ALL");
		p.CndPanel.add(p.Cnd_cnd_select_all);
		p.Cnd_cnd_select_all.setNextBeans(p.Cnd_cnd_deselect_all);
		p.Cnd_cnd_deselect_all.setIcon("DESELECT_ALL");
		p.CndPanel.add(p.Cnd_cnd_deselect_all);
		p.Cnd_cnd_deselect_all.setNextBeans(p.Cnd_bp_alt_nm1);
		p.CndPanel.add(p.Cnd_bp_alt_nm1_Label);
		p.CndPanel.add(p.Cnd_bp_alt_nm1);
		p.Cnd_bp_alt_nm1.setNextBeans(p.Cnd_bp_alt_nm2);
		p.Cnd_bp_alt_nm1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm1, true);
		p.CndPanel.add(p.Cnd_bp_alt_nm2_Label);
		p.CndPanel.add(p.Cnd_bp_alt_nm2);
		p.Cnd_bp_alt_nm2.setNextBeans(p.Cnd_bp_alt_nm3);
		p.Cnd_bp_alt_nm2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm2, true);
		p.CndPanel.add(p.Cnd_bp_alt_nm3_Label);
		p.CndPanel.add(p.Cnd_bp_alt_nm3);
		p.Cnd_bp_alt_nm3.setNextBeans(p.Cnd_bp_alt_nm4);
		p.Cnd_bp_alt_nm3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm3, true);
		p.CndPanel.add(p.Cnd_bp_alt_nm4_Label);
		p.CndPanel.add(p.Cnd_bp_alt_nm4);
		p.Cnd_bp_alt_nm4.setNextBeans(p.Cnd_cntry_cd);
		p.Cnd_bp_alt_nm4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_alt_nm4, true);
		p.Cnd_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cntry_cd, true);
		p.Cnd_cntry_cd.setLinkBeans(p.Cnd_cntry_nm);
		p.CndPanel.add(p.Cnd_cntry_cd_Label);
		p.CndPanel.add(p.Cnd_cntry_cd);
		p.Cnd_cntry_cd.setNextBeans(p.Cnd_cntry_nm);
		p.Cnd_cntry_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.cntry_cd_META);
		p.CndPanel.add(p.Cnd_cntry_nm);
		p.Cnd_cntry_nm.setNextBeans(p.Cnd_foreign_flg);
		p.Cnd_cntry_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_cntry_nm, true);
		p.CndPanel.add(p.Cnd_foreign_flg);
		p.Cnd_foreign_flg.setNextBeans(p.Cnd_area_cd);
		p.Cnd_foreign_flg.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.foreign_flg_META);
		p.Cnd_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_area_cd, true);
		p.Cnd_area_cd.setLinkBeans(p.Cnd_area_nm);
		p.CndPanel.add(p.Cnd_area_cd_Label);
		p.CndPanel.add(p.Cnd_area_cd);
		p.Cnd_area_cd.setNextBeans(p.Cnd_area_nm);
		p.Cnd_area_cd.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.area_cd_META);
		p.CndPanel.add(p.Cnd_area_nm);
		p.Cnd_area_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_area_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.area_nm_META);
		p.setPluralValueEnable(p.Cnd_area_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_memo4);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_memo4_Label);
		p.CndPanel.add(p.Cnd_memo4);
		p.Cnd_memo4.setNextBeans(p.Cnd_memo5);
		p.Cnd_memo4.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo4_META);
		p.setPluralValueEnable(p.Cnd_memo4, true);
		p.CndPanel.add(p.Cnd_memo5_Label);
		p.CndPanel.add(p.Cnd_memo5);
		p.Cnd_memo5.setNextBeans(p.Cnd_memo6);
		p.Cnd_memo5.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo5_META);
		p.setPluralValueEnable(p.Cnd_memo5, true);
		p.CndPanel.add(p.Cnd_memo6_Label);
		p.CndPanel.add(p.Cnd_memo6);
		p.Cnd_memo6.setNextBeans(p.Cnd_memo7);
		p.Cnd_memo6.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo6_META);
		p.setPluralValueEnable(p.Cnd_memo6, true);
		p.CndPanel.add(p.Cnd_memo7_Label);
		p.CndPanel.add(p.Cnd_memo7);
		p.Cnd_memo7.setNextBeans(p.Cnd_memo8);
		p.Cnd_memo7.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo7_META);
		p.setPluralValueEnable(p.Cnd_memo7, true);
		p.CndPanel.add(p.Cnd_memo8_Label);
		p.CndPanel.add(p.Cnd_memo8);
		p.Cnd_memo8.setNextBeans(p.Cnd_memo9);
		p.Cnd_memo8.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo8_META);
		p.setPluralValueEnable(p.Cnd_memo8, true);
		p.CndPanel.add(p.Cnd_memo9_Label);
		p.CndPanel.add(p.Cnd_memo9);
		p.Cnd_memo9.setNextBeans(p.Cnd_memo10);
		p.Cnd_memo9.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo9_META);
		p.setPluralValueEnable(p.Cnd_memo9, true);
		p.CndPanel.add(p.Cnd_memo10_Label);
		p.CndPanel.add(p.Cnd_memo10);
		p.Cnd_memo10.setNextBeans(p.Cnd_memo11);
		p.Cnd_memo10.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo10_META);
		p.setPluralValueEnable(p.Cnd_memo10, true);
		p.CndPanel.add(p.Cnd_memo11_Label);
		p.CndPanel.add(p.Cnd_memo11);
		p.Cnd_memo11.setNextBeans(p.Cnd_memo12);
		p.Cnd_memo11.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo11_META);
		p.setPluralValueEnable(p.Cnd_memo11, true);
		p.CndPanel.add(p.Cnd_memo12_Label);
		p.CndPanel.add(p.Cnd_memo12);
		p.Cnd_memo12.setNextBeans(p.Cnd_memo13);
		p.Cnd_memo12.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo12_META);
		p.setPluralValueEnable(p.Cnd_memo12, true);
		p.CndPanel.add(p.Cnd_memo13_Label);
		p.CndPanel.add(p.Cnd_memo13);
		p.Cnd_memo13.setNextBeans(p.Cnd_memo14);
		p.Cnd_memo13.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo13_META);
		p.setPluralValueEnable(p.Cnd_memo13, true);
		p.CndPanel.add(p.Cnd_memo14_Label);
		p.CndPanel.add(p.Cnd_memo14);
		p.Cnd_memo14.setNextBeans(p.Cnd_memo15);
		p.Cnd_memo14.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo14_META);
		p.setPluralValueEnable(p.Cnd_memo14, true);
		p.CndPanel.add(p.Cnd_memo15_Label);
		p.CndPanel.add(p.Cnd_memo15);
		p.Cnd_memo15.setNextBeans(p.Cnd_memo16);
		p.Cnd_memo15.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo15_META);
		p.setPluralValueEnable(p.Cnd_memo15, true);
		p.CndPanel.add(p.Cnd_memo16_Label);
		p.CndPanel.add(p.Cnd_memo16);
		p.Cnd_memo16.setNextBeans(p.Cnd_memo17);
		p.Cnd_memo16.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo16_META);
		p.setPluralValueEnable(p.Cnd_memo16, true);
		p.CndPanel.add(p.Cnd_memo17_Label);
		p.CndPanel.add(p.Cnd_memo17);
		p.Cnd_memo17.setNextBeans(p.Cnd_memo18);
		p.Cnd_memo17.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo17_META);
		p.setPluralValueEnable(p.Cnd_memo17, true);
		p.CndPanel.add(p.Cnd_memo18_Label);
		p.CndPanel.add(p.Cnd_memo18);
		p.Cnd_memo18.setNextBeans(p.Cnd_memo19);
		p.Cnd_memo18.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo18_META);
		p.setPluralValueEnable(p.Cnd_memo18, true);
		p.CndPanel.add(p.Cnd_memo19_Label);
		p.CndPanel.add(p.Cnd_memo19);
		p.Cnd_memo19.setNextBeans(p.Cnd_memo20);
		p.Cnd_memo19.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo19_META);
		p.setPluralValueEnable(p.Cnd_memo19, true);
		p.CndPanel.add(p.Cnd_memo20_Label);
		p.CndPanel.add(p.Cnd_memo20);
		p.Cnd_memo20.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.memo20_META);
		p.setPluralValueEnable(p.Cnd_memo20, true);
		p.Cnd2Panel.add(p.Cnd_bp_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_bp_grp_p_PPanel);
		p.SrchBtn1Panel.add(p.Cnd_bp_is_srch_typ_nm_Label);
		p.SrchBtn1Panel.add(p.Cnd_bp_is_srch_typ_nm);
		p.SrchBtn1Panel.setLastBeans(p.Cnd_bp_is_srch_typ_nm);
		p.Cnd_bp_is_srch_typ_nm.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.bp_is_srch_typ_nm_META);
		p.SrchBtn2Panel.setLastBeans(p.Cnd_match_typ_Group);
		p.Cnd_match_typ_Group.setFirstBeans(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setActionCommand("0");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_0);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_0);
		p.Cnd_match_typ_0.setNextBeans(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setActionCommand("1");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_1);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_1);
		p.Cnd_match_typ_1.setNextBeans(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setActionCommand("2");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_2);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_2);
		p.Cnd_match_typ_2.setNextBeans(p.Cnd_match_typ_3);
		p.Cnd_match_typ_3.setActionCommand("3");
		p.Cnd_match_typ_Group.add(p.Cnd_match_typ_3);
		p.SrchBtn2Panel.add(p.Cnd_match_typ_3);
		p.Cnd_match_typ_Group.setRow(p.getCndR(), mcframe.clientMAUA.MAUAP1020.CndR.match_typ_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn1(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.SrchBtn1Panel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchBtn2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchBtn2(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.SrchBtn2Panel.setLayoutPosition("SEC");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SEE");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RsltWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltWrk(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.add(p.RsltWrkPanel);
		p.RsltWrkPanel.setNextBeans(p.BtnPanel);
		p.RsltWrkPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RsltWrkPanel.add(p.RsltPanel, null);
		p.RsltWrkPanel.setLastBeans(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.RsltHdrPanel);
		p.RsltWrkPanel.add(p.RsltHdrPanel, null);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltHdr(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.RsltHdrPanel.setValueCheck(false);
		p.RsltHdrPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.RsltHdrPanel.add(p.RsltHdr_bp_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_bp_cd);
		p.RsltHdrPanel.setLastBeans(p.RsltHdr_bp_cd);
		p.RsltHdr_bp_cd.setNextBeans(p.RsltHdr_bp_nm);
		p.RsltHdr_bp_cd.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.bp_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_bp_nm);
		p.RsltHdr_bp_nm.setNextBeans(p.RsltHdr_cst_sundry_flg);
		p.RsltHdr_bp_nm.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.bp_nm_META);
		p.RsltHdrPanel.add(p.RsltHdr_cst_sundry_flg);
		p.RsltHdr_cst_sundry_flg.setNextBeans(p.RsltHdr_dlv_sundry_flg);
		p.RsltHdr_cst_sundry_flg.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.cst_sundry_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_sundry_flg);
		p.RsltHdr_dlv_sundry_flg.setNextBeans(p.RsltHdr_pri_prnt_flg);
		p.RsltHdr_dlv_sundry_flg.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.dlv_sundry_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_pri_prnt_flg);
		p.RsltHdr_pri_prnt_flg.setNextBeans(p.RsltHdr_zip_cd);
		p.RsltHdr_pri_prnt_flg.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.pri_prnt_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_zip_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_zip_cd);
		p.RsltHdr_zip_cd.setNextBeans(p.RsltHdr_addr1);
		p.RsltHdr_zip_cd.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.zip_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr1_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr1);
		p.RsltHdr_addr1.setNextBeans(p.RsltHdr_addr2);
		p.RsltHdr_addr1.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.addr1_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr2_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr2);
		p.RsltHdr_addr2.setNextBeans(p.RsltHdr_addr3);
		p.RsltHdr_addr2.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.addr2_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr3_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr3);
		p.RsltHdr_addr3.setNextBeans(p.RsltHdr_addr4);
		p.RsltHdr_addr3.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.addr3_META);
		p.RsltHdrPanel.add(p.RsltHdr_addr4_Label);
		p.RsltHdrPanel.add(p.RsltHdr_addr4);
		p.RsltHdr_addr4.setNextBeans(p.RsltHdr_cntry_cd);
		p.RsltHdr_addr4.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.addr4_META);
		p.RsltHdr_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.RsltHdr_cntry_cd, true);
		p.RsltHdr_cntry_cd.setLinkBeans(p.RsltHdr_cntry_nm);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_cd_Label);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_cd);
		p.RsltHdr_cntry_cd.setNextBeans(p.RsltHdr_cntry_nm);
		p.RsltHdr_cntry_cd.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.cntry_cd_META);
		p.RsltHdrPanel.add(p.RsltHdr_cntry_nm);
		p.RsltHdr_cntry_nm.setNextBeans(p.RsltHdr_foreign_flg);
		p.RsltHdr_cntry_nm.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.cntry_nm_META);
		p.RsltHdrPanel.add(p.RsltHdr_foreign_flg);
		p.RsltHdr_foreign_flg.setNextBeans(p.RsltHdr_tel);
		p.RsltHdr_foreign_flg.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.foreign_flg_META);
		p.RsltHdrPanel.add(p.RsltHdr_tel_Label);
		p.RsltHdrPanel.add(p.RsltHdr_tel);
		p.RsltHdr_tel.setNextBeans(p.RsltHdr_fax);
		p.RsltHdr_tel.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.tel_META);
		p.RsltHdrPanel.add(p.RsltHdr_fax_Label);
		p.RsltHdrPanel.add(p.RsltHdr_fax);
		p.RsltHdr_fax.setNextBeans(p.RsltHdr_cst_cntct_dpt);
		p.RsltHdr_fax.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.fax_META);
		p.RsltHdrPanel.add(p.RsltHdr_cst_cntct_dpt_Label);
		p.RsltHdrPanel.add(p.RsltHdr_cst_cntct_dpt);
		p.RsltHdr_cst_cntct_dpt.setNextBeans(p.RsltHdr_cst_cntct_psn);
		p.RsltHdr_cst_cntct_dpt.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.cst_cntct_dpt_META);
		p.RsltHdrPanel.add(p.RsltHdr_cst_cntct_psn_Label);
		p.RsltHdrPanel.add(p.RsltHdr_cst_cntct_psn);
		p.RsltHdr_cst_cntct_psn.setNextBeans(p.RsltHdr_dlv_cntct_dpt);
		p.RsltHdr_cst_cntct_psn.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.cst_cntct_psn_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_dpt_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_dpt);
		p.RsltHdr_dlv_cntct_dpt.setNextBeans(p.RsltHdr_dlv_cntct_psn);
		p.RsltHdr_dlv_cntct_dpt.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.dlv_cntct_dpt_META);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_psn_Label);
		p.RsltHdrPanel.add(p.RsltHdr_dlv_cntct_psn);
		p.RsltHdr_dlv_cntct_psn.setRow(p.getRsltHdrR(), mcframe.clientMAUA.MAUAP1020.RsltHdrR.dlv_cntct_psn_META);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MAUAP_Bp p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept);
		p.Btn_accept.setIcon("REGISTER");
		p.Btn_accept.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept);
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
		MAUAP_Bp_MC.mcInitTop((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitFold((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitTab1((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitTab2((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitCnd((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitCnd2((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitSrchBtn1((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitSrchBtn2((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitCtrl((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitRsltWrk((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitRslt((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitRsltHdr((MAUAP_Bp)this);
		MAUAP_Bp_MC.mcInitBtn((MAUAP_Bp)this);

		// [SRCH]ステータスのモードの設定
		MAUAP_Bp_MC.statusInitSRCH_Top((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Fold((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Tab1((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Tab2((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Cnd((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Cnd2((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_SrchBtn1((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_SrchBtn2((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Ctrl((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_RsltWrk((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Rslt((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_RsltHdr((MAUAP_Bp)this);
		MAUAP_Bp_MC.statusInitSRCH_Btn((MAUAP_Bp)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MAUAP_Bp p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MAUAP_Bp p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MAUAP_Bp p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MAUAP_Bp p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MAUAP_Bp p) {
		p.Cnd_cst_flg.addAllListener(p);
		p.Cnd_acst_flg.addAllListener(p);
		p.Cnd_bcst_flg.addAllListener(p);
		p.Cnd_rcst_flg.addAllListener(p);
		p.Cnd_dlv_flg.addAllListener(p);
		p.Cnd_dest_flg.addAllListener(p);
		p.Cnd_cred_flg.addAllListener(p);
		p.Cnd_sppl_flg.addAllListener(p);
		p.Cnd_asppl_flg.addAllListener(p);
		p.Cnd_bsppl_flg.addAllListener(p);
		p.Cnd_psppl_flg.addAllListener(p);
		p.Cnd_maker_flg.addAllListener(p);
		p.Cnd_tdlv_flg.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_ein.setListListener(p);
		p.Cnd_ein.addAllListener(p);
		p.Cnd_dt.setListListener(p);
		p.Cnd_dt.addAllListener(p);
		p.Cnd_cnd_select_all.addAllListener(p);
		p.Cnd_cnd_select_all.setAPMethodName("doCnd_cnd_select_all");
		p.Cnd_cnd_deselect_all.addAllListener(p);
		p.Cnd_cnd_deselect_all.setAPMethodName("doCnd_cnd_deselect_all");
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
		p.Cnd_bp_is_srch_typ_nm.setListListener(p);
		p.Cnd_bp_is_srch_typ_nm.addAllListener(p);
		p.Cnd_match_typ_Group.addAllListener(p);
		p.Cnd_match_typ_0.addAllListener(p);
		p.Cnd_match_typ_1.addAllListener(p);
		p.Cnd_match_typ_2.addAllListener(p);
		p.Cnd_match_typ_3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MAUAP_Bp p) {
	}

	/**
	 *  [SrchBtn1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn1(MAUAP_Bp p) {
	}

	/**
	 *  [SrchBtn2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchBtn2(MAUAP_Bp p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MAUAP_Bp p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RsltWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltWrk(MAUAP_Bp p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MAUAP_Bp p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_bp_alt_nm1.addAllListener(p);
		p.columnRslt_bp_alt_nm1.setListListener(p);
		p.columnRslt_bp_alt_nm2.addAllListener(p);
		p.columnRslt_bp_alt_nm2.setListListener(p);
		p.columnRslt_bp_alt_nm3.addAllListener(p);
		p.columnRslt_bp_alt_nm3.setListListener(p);
		p.columnRslt_bp_alt_nm4.addAllListener(p);
		p.columnRslt_bp_alt_nm4.setListListener(p);
		p.columnRslt_ein.addAllListener(p);
		p.columnRslt_ein.setListListener(p);
		p.columnRslt_cntry_cd.addAllListener(p);
		p.columnRslt_cntry_cd.setListListener(p);
		p.columnRslt_cntry_nm.addAllListener(p);
		p.columnRslt_cntry_nm.setListListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_area_cd.addAllListener(p);
		p.columnRslt_area_cd.setListListener(p);
		p.columnRslt_area_nm.addAllListener(p);
		p.columnRslt_area_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_cst_flg.addAllListener(p);
		p.columnRslt_cst_sundry_flg.addAllListener(p);
		p.columnRslt_acst_flg.addAllListener(p);
		p.columnRslt_bcst_flg.addAllListener(p);
		p.columnRslt_rcst_flg.addAllListener(p);
		p.columnRslt_dlv_flg.addAllListener(p);
		p.columnRslt_dlv_sundry_flg.addAllListener(p);
		p.columnRslt_tdlv_flg.addAllListener(p);
		p.columnRslt_dest_flg.addAllListener(p);
		p.columnRslt_cred_flg.addAllListener(p);
		p.columnRslt_sppl_flg.addAllListener(p);
		p.columnRslt_asppl_flg.addAllListener(p);
		p.columnRslt_bsppl_flg.addAllListener(p);
		p.columnRslt_psppl_flg.addAllListener(p);
		p.columnRslt_maker_flg.addAllListener(p);
		p.columnRslt_memo1.addAllListener(p);
		p.columnRslt_memo1.setListListener(p);
		p.columnRslt_memo2.addAllListener(p);
		p.columnRslt_memo2.setListListener(p);
		p.columnRslt_memo3.addAllListener(p);
		p.columnRslt_memo3.setListListener(p);
		p.columnRslt_memo4.addAllListener(p);
		p.columnRslt_memo4.setListListener(p);
		p.columnRslt_memo5.addAllListener(p);
		p.columnRslt_memo5.setListListener(p);
		p.columnRslt_memo6.addAllListener(p);
		p.columnRslt_memo6.setListListener(p);
		p.columnRslt_memo7.addAllListener(p);
		p.columnRslt_memo7.setListListener(p);
		p.columnRslt_memo8.addAllListener(p);
		p.columnRslt_memo8.setListListener(p);
		p.columnRslt_memo9.addAllListener(p);
		p.columnRslt_memo9.setListListener(p);
		p.columnRslt_memo10.addAllListener(p);
		p.columnRslt_memo10.setListListener(p);
		p.columnRslt_memo11.addAllListener(p);
		p.columnRslt_memo11.setListListener(p);
		p.columnRslt_memo12.addAllListener(p);
		p.columnRslt_memo12.setListListener(p);
		p.columnRslt_memo13.addAllListener(p);
		p.columnRslt_memo13.setListListener(p);
		p.columnRslt_memo14.addAllListener(p);
		p.columnRslt_memo14.setListListener(p);
		p.columnRslt_memo15.addAllListener(p);
		p.columnRslt_memo15.setListListener(p);
		p.columnRslt_memo16.addAllListener(p);
		p.columnRslt_memo16.setListListener(p);
		p.columnRslt_memo17.addAllListener(p);
		p.columnRslt_memo17.setListListener(p);
		p.columnRslt_memo18.addAllListener(p);
		p.columnRslt_memo18.setListListener(p);
		p.columnRslt_memo19.addAllListener(p);
		p.columnRslt_memo19.setListListener(p);
		p.columnRslt_memo20.addAllListener(p);
		p.columnRslt_memo20.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
	}

	/**
	 *  [RsltHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltHdr(MAUAP_Bp p) {
		p.RsltHdr_bp_cd.setListListener(p);
		p.RsltHdr_bp_cd.addAllListener(p);
		p.RsltHdr_bp_nm.setListListener(p);
		p.RsltHdr_bp_nm.addAllListener(p);
		p.RsltHdr_cst_sundry_flg.addAllListener(p);
		p.RsltHdr_dlv_sundry_flg.addAllListener(p);
		p.RsltHdr_pri_prnt_flg.addAllListener(p);
		p.RsltHdr_zip_cd.setListListener(p);
		p.RsltHdr_zip_cd.addAllListener(p);
		p.RsltHdr_addr1.setListListener(p);
		p.RsltHdr_addr1.addAllListener(p);
		p.RsltHdr_addr2.setListListener(p);
		p.RsltHdr_addr2.addAllListener(p);
		p.RsltHdr_addr3.setListListener(p);
		p.RsltHdr_addr3.addAllListener(p);
		p.RsltHdr_addr4.setListListener(p);
		p.RsltHdr_addr4.addAllListener(p);
		p.RsltHdr_cntry_cd.setListListener(p);
		p.RsltHdr_cntry_cd.addAllListener(p);
		p.RsltHdr_cntry_nm.setListListener(p);
		p.RsltHdr_cntry_nm.addAllListener(p);
		p.RsltHdr_foreign_flg.addAllListener(p);
		p.RsltHdr_tel.setListListener(p);
		p.RsltHdr_tel.addAllListener(p);
		p.RsltHdr_fax.setListListener(p);
		p.RsltHdr_fax.addAllListener(p);
		p.RsltHdr_cst_cntct_dpt.setListListener(p);
		p.RsltHdr_cst_cntct_dpt.addAllListener(p);
		p.RsltHdr_cst_cntct_psn.setListListener(p);
		p.RsltHdr_cst_cntct_psn.addAllListener(p);
		p.RsltHdr_dlv_cntct_dpt.setListListener(p);
		p.RsltHdr_dlv_cntct_dpt.addAllListener(p);
		p.RsltHdr_dlv_cntct_psn.setListListener(p);
		p.RsltHdr_dlv_cntct_psn.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MAUAP_Bp p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept.addAllListener(p);
		p.Btn_accept.setAPMethodName("doBtn_accept");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MAUAP_Bp p){
		p.Cnd_cst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_acst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bcst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rcst_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dlv_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cred_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_maker_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_tdlv_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ein.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dt.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cnd_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cnd_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_alt_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_alt_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_alt_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_alt_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cntry_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_foreign_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_area_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);
		p.Cnd_bp_is_srch_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_match_typ_Group.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn1(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[SrchBtn2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchBtn2(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[RsltWrk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltWrk(MAUAP_Bp p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MAUAP_Bp p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_alt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_alt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_alt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_alt_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ein.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_area_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_area_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cst_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_acst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bcst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tdlv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cred_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_maker_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_memo20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_bp_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5190.MAUBP_BpGrp_D.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[RsltHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltHdr(MAUAP_Bp p){
		p.RsltHdr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cst_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_pri_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_fax.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cst_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_cst_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_cntct_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltHdr_dlv_cntct_psn.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MAUAP_Bp p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_accept.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MAUAP_Bp_MC.setTableConfigRslt((MAUAP_Bp)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MAUAP_Bp p) {
		p.columnRslt_check.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_bp_alt_nm1.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_alt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_alt_nm1);
		p.columnRslt_bp_alt_nm2.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_alt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_alt_nm2);
		p.columnRslt_bp_alt_nm3.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_alt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_alt_nm3);
		p.columnRslt_bp_alt_nm4.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bp_alt_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_alt_nm4);
		p.columnRslt_ein.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.ein_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ein);
		p.columnRslt_cntry_cd.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cntry_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_cd);
		p.columnRslt_cntry_nm.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cntry_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cntry_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_area_cd.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.area_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_area_cd);
		p.columnRslt_area_nm.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.area_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_area_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_cst_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_flg);
		p.columnRslt_cst_sundry_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cst_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_sundry_flg);
		p.columnRslt_acst_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.acst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_acst_flg);
		p.columnRslt_bcst_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bcst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bcst_flg);
		p.columnRslt_rcst_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.rcst_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcst_flg);
		p.columnRslt_dlv_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.dlv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_flg);
		p.columnRslt_dlv_sundry_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.dlv_sundry_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_sundry_flg);
		p.columnRslt_tdlv_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.tdlv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tdlv_flg);
		p.columnRslt_dest_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.dest_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dest_flg);
		p.columnRslt_cred_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.cred_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cred_flg);
		p.columnRslt_sppl_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.sppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_flg);
		p.columnRslt_asppl_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.asppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_flg);
		p.columnRslt_bsppl_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.bsppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_flg);
		p.columnRslt_psppl_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.psppl_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_flg);
		p.columnRslt_maker_flg.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.maker_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_flg);
		p.columnRslt_memo1.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo1);
		p.columnRslt_memo2.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo2);
		p.columnRslt_memo3.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo3);
		p.columnRslt_memo4.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo4);
		p.columnRslt_memo5.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo5);
		p.columnRslt_memo6.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo6);
		p.columnRslt_memo7.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo7);
		p.columnRslt_memo8.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo8);
		p.columnRslt_memo9.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo9);
		p.columnRslt_memo10.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo10);
		p.columnRslt_memo11.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo11);
		p.columnRslt_memo12.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo12);
		p.columnRslt_memo13.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo13);
		p.columnRslt_memo14.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo14);
		p.columnRslt_memo15.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo15);
		p.columnRslt_memo16.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo16);
		p.columnRslt_memo17.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo17);
		p.columnRslt_memo18.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo18);
		p.columnRslt_memo19.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo19);
		p.columnRslt_memo20.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.memo20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_memo20);
		p.RsltTable.addTable(p.Rslt_bp_grp_p_PPanel.BpGrpTable);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMAUA.MAUAP1020.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_bp_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cntry_cd.getListConfig().setPutter(getCnd_cntry_cd_ListPutter());
		Cnd_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_area_cd.getListConfig().setPutter(getCnd_area_cd_ListPutter());
		RsltHdr_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		RsltHdr_cntry_cd.getListConfig().setPutter(getRsltHdr_cntry_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [RsltHdr_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltHdr_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cntry_cd) return getCnd_cntry_cd(row, info);
		if(combo == Cnd_area_cd) return getCnd_area_cd(row, info);
		if(combo == RsltHdr_cntry_cd) return getRsltHdr_cntry_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_cnd_select_all) doCnd_cnd_select_all(info);
		else if (ap == Cnd_cnd_deselect_all) doCnd_cnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept) doBtn_accept(info);
	}

	/**
	 * [Cnd]パネルの[cnd_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_cnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[cnd_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_cnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_cst_flg) return doCnd_cst_flg_VC(info);
		if (vc == Cnd_acst_flg) return doCnd_acst_flg_VC(info);
		if (vc == Cnd_bcst_flg) return doCnd_bcst_flg_VC(info);
		if (vc == Cnd_rcst_flg) return doCnd_rcst_flg_VC(info);
		if (vc == Cnd_dlv_flg) return doCnd_dlv_flg_VC(info);
		if (vc == Cnd_dest_flg) return doCnd_dest_flg_VC(info);
		if (vc == Cnd_cred_flg) return doCnd_cred_flg_VC(info);
		if (vc == Cnd_sppl_flg) return doCnd_sppl_flg_VC(info);
		if (vc == Cnd_asppl_flg) return doCnd_asppl_flg_VC(info);
		if (vc == Cnd_bsppl_flg) return doCnd_bsppl_flg_VC(info);
		if (vc == Cnd_psppl_flg) return doCnd_psppl_flg_VC(info);
		if (vc == Cnd_maker_flg) return doCnd_maker_flg_VC(info);
		if (vc == Cnd_tdlv_flg) return doCnd_tdlv_flg_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_ein) return doCnd_ein_VC(info);
		if (vc == Cnd_dt) return doCnd_dt_VC(info);
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
		if (vc == Cnd_bp_is_srch_typ_nm) return doCnd_bp_is_srch_typ_nm_VC(info);
		if (vc == Cnd_match_typ_Group) return doCnd_match_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_bp_alt_nm1) return doRslt_bp_alt_nm1_VC(info);
		if (vc == columnRslt_bp_alt_nm2) return doRslt_bp_alt_nm2_VC(info);
		if (vc == columnRslt_bp_alt_nm3) return doRslt_bp_alt_nm3_VC(info);
		if (vc == columnRslt_bp_alt_nm4) return doRslt_bp_alt_nm4_VC(info);
		if (vc == columnRslt_ein) return doRslt_ein_VC(info);
		if (vc == columnRslt_cntry_cd) return doRslt_cntry_cd_VC(info);
		if (vc == columnRslt_cntry_nm) return doRslt_cntry_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_area_cd) return doRslt_area_cd_VC(info);
		if (vc == columnRslt_area_nm) return doRslt_area_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_cst_flg) return doRslt_cst_flg_VC(info);
		if (vc == columnRslt_cst_sundry_flg) return doRslt_cst_sundry_flg_VC(info);
		if (vc == columnRslt_acst_flg) return doRslt_acst_flg_VC(info);
		if (vc == columnRslt_bcst_flg) return doRslt_bcst_flg_VC(info);
		if (vc == columnRslt_rcst_flg) return doRslt_rcst_flg_VC(info);
		if (vc == columnRslt_dlv_flg) return doRslt_dlv_flg_VC(info);
		if (vc == columnRslt_dlv_sundry_flg) return doRslt_dlv_sundry_flg_VC(info);
		if (vc == columnRslt_tdlv_flg) return doRslt_tdlv_flg_VC(info);
		if (vc == columnRslt_dest_flg) return doRslt_dest_flg_VC(info);
		if (vc == columnRslt_cred_flg) return doRslt_cred_flg_VC(info);
		if (vc == columnRslt_sppl_flg) return doRslt_sppl_flg_VC(info);
		if (vc == columnRslt_asppl_flg) return doRslt_asppl_flg_VC(info);
		if (vc == columnRslt_bsppl_flg) return doRslt_bsppl_flg_VC(info);
		if (vc == columnRslt_psppl_flg) return doRslt_psppl_flg_VC(info);
		if (vc == columnRslt_maker_flg) return doRslt_maker_flg_VC(info);
		if (vc == columnRslt_memo1) return doRslt_memo1_VC(info);
		if (vc == columnRslt_memo2) return doRslt_memo2_VC(info);
		if (vc == columnRslt_memo3) return doRslt_memo3_VC(info);
		if (vc == columnRslt_memo4) return doRslt_memo4_VC(info);
		if (vc == columnRslt_memo5) return doRslt_memo5_VC(info);
		if (vc == columnRslt_memo6) return doRslt_memo6_VC(info);
		if (vc == columnRslt_memo7) return doRslt_memo7_VC(info);
		if (vc == columnRslt_memo8) return doRslt_memo8_VC(info);
		if (vc == columnRslt_memo9) return doRslt_memo9_VC(info);
		if (vc == columnRslt_memo10) return doRslt_memo10_VC(info);
		if (vc == columnRslt_memo11) return doRslt_memo11_VC(info);
		if (vc == columnRslt_memo12) return doRslt_memo12_VC(info);
		if (vc == columnRslt_memo13) return doRslt_memo13_VC(info);
		if (vc == columnRslt_memo14) return doRslt_memo14_VC(info);
		if (vc == columnRslt_memo15) return doRslt_memo15_VC(info);
		if (vc == columnRslt_memo16) return doRslt_memo16_VC(info);
		if (vc == columnRslt_memo17) return doRslt_memo17_VC(info);
		if (vc == columnRslt_memo18) return doRslt_memo18_VC(info);
		if (vc == columnRslt_memo19) return doRslt_memo19_VC(info);
		if (vc == columnRslt_memo20) return doRslt_memo20_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == RsltHdr_bp_cd) return doRsltHdr_bp_cd_VC(info);
		if (vc == RsltHdr_bp_nm) return doRsltHdr_bp_nm_VC(info);
		if (vc == RsltHdr_cst_sundry_flg) return doRsltHdr_cst_sundry_flg_VC(info);
		if (vc == RsltHdr_dlv_sundry_flg) return doRsltHdr_dlv_sundry_flg_VC(info);
		if (vc == RsltHdr_pri_prnt_flg) return doRsltHdr_pri_prnt_flg_VC(info);
		if (vc == RsltHdr_zip_cd) return doRsltHdr_zip_cd_VC(info);
		if (vc == RsltHdr_addr1) return doRsltHdr_addr1_VC(info);
		if (vc == RsltHdr_addr2) return doRsltHdr_addr2_VC(info);
		if (vc == RsltHdr_addr3) return doRsltHdr_addr3_VC(info);
		if (vc == RsltHdr_addr4) return doRsltHdr_addr4_VC(info);
		if (vc == RsltHdr_cntry_cd) return doRsltHdr_cntry_cd_VC(info);
		if (vc == RsltHdr_cntry_nm) return doRsltHdr_cntry_nm_VC(info);
		if (vc == RsltHdr_foreign_flg) return doRsltHdr_foreign_flg_VC(info);
		if (vc == RsltHdr_tel) return doRsltHdr_tel_VC(info);
		if (vc == RsltHdr_fax) return doRsltHdr_fax_VC(info);
		if (vc == RsltHdr_cst_cntct_dpt) return doRsltHdr_cst_cntct_dpt_VC(info);
		if (vc == RsltHdr_cst_cntct_psn) return doRsltHdr_cst_cntct_psn_VC(info);
		if (vc == RsltHdr_dlv_cntct_dpt) return doRsltHdr_dlv_cntct_dpt_VC(info);
		if (vc == RsltHdr_dlv_cntct_psn) return doRsltHdr_dlv_cntct_psn_VC(info);
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
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tdlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tdlv_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_is_srch_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_is_srch_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[match_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_match_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ein]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ein_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[acst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_acst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tdlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tdlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cred_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cred_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cst_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cst_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cst_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_cst_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltHdr_dlv_cntct_psn_VC(MCEventInfo info){
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
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_cst_flg) doCnd_cst_flg_NC(info);
		else if (nc == Cnd_acst_flg) doCnd_acst_flg_NC(info);
		else if (nc == Cnd_bcst_flg) doCnd_bcst_flg_NC(info);
		else if (nc == Cnd_rcst_flg) doCnd_rcst_flg_NC(info);
		else if (nc == Cnd_dlv_flg) doCnd_dlv_flg_NC(info);
		else if (nc == Cnd_dest_flg) doCnd_dest_flg_NC(info);
		else if (nc == Cnd_cred_flg) doCnd_cred_flg_NC(info);
		else if (nc == Cnd_sppl_flg) doCnd_sppl_flg_NC(info);
		else if (nc == Cnd_asppl_flg) doCnd_asppl_flg_NC(info);
		else if (nc == Cnd_bsppl_flg) doCnd_bsppl_flg_NC(info);
		else if (nc == Cnd_psppl_flg) doCnd_psppl_flg_NC(info);
		else if (nc == Cnd_maker_flg) doCnd_maker_flg_NC(info);
		else if (nc == Cnd_tdlv_flg) doCnd_tdlv_flg_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_ein) doCnd_ein_NC(info);
		else if (nc == Cnd_dt) doCnd_dt_NC(info);
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
		else if (nc == Cnd_bp_is_srch_typ_nm) doCnd_bp_is_srch_typ_nm_NC(info);
		else if (nc == Cnd_match_typ_Group) doCnd_match_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_bp_alt_nm1) doRslt_bp_alt_nm1_NC(info);
		else if (nc == columnRslt_bp_alt_nm2) doRslt_bp_alt_nm2_NC(info);
		else if (nc == columnRslt_bp_alt_nm3) doRslt_bp_alt_nm3_NC(info);
		else if (nc == columnRslt_bp_alt_nm4) doRslt_bp_alt_nm4_NC(info);
		else if (nc == columnRslt_ein) doRslt_ein_NC(info);
		else if (nc == columnRslt_cntry_cd) doRslt_cntry_cd_NC(info);
		else if (nc == columnRslt_cntry_nm) doRslt_cntry_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_area_cd) doRslt_area_cd_NC(info);
		else if (nc == columnRslt_area_nm) doRslt_area_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_cst_flg) doRslt_cst_flg_NC(info);
		else if (nc == columnRslt_cst_sundry_flg) doRslt_cst_sundry_flg_NC(info);
		else if (nc == columnRslt_acst_flg) doRslt_acst_flg_NC(info);
		else if (nc == columnRslt_bcst_flg) doRslt_bcst_flg_NC(info);
		else if (nc == columnRslt_rcst_flg) doRslt_rcst_flg_NC(info);
		else if (nc == columnRslt_dlv_flg) doRslt_dlv_flg_NC(info);
		else if (nc == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NC(info);
		else if (nc == columnRslt_tdlv_flg) doRslt_tdlv_flg_NC(info);
		else if (nc == columnRslt_dest_flg) doRslt_dest_flg_NC(info);
		else if (nc == columnRslt_cred_flg) doRslt_cred_flg_NC(info);
		else if (nc == columnRslt_sppl_flg) doRslt_sppl_flg_NC(info);
		else if (nc == columnRslt_asppl_flg) doRslt_asppl_flg_NC(info);
		else if (nc == columnRslt_bsppl_flg) doRslt_bsppl_flg_NC(info);
		else if (nc == columnRslt_psppl_flg) doRslt_psppl_flg_NC(info);
		else if (nc == columnRslt_maker_flg) doRslt_maker_flg_NC(info);
		else if (nc == columnRslt_memo1) doRslt_memo1_NC(info);
		else if (nc == columnRslt_memo2) doRslt_memo2_NC(info);
		else if (nc == columnRslt_memo3) doRslt_memo3_NC(info);
		else if (nc == columnRslt_memo4) doRslt_memo4_NC(info);
		else if (nc == columnRslt_memo5) doRslt_memo5_NC(info);
		else if (nc == columnRslt_memo6) doRslt_memo6_NC(info);
		else if (nc == columnRslt_memo7) doRslt_memo7_NC(info);
		else if (nc == columnRslt_memo8) doRslt_memo8_NC(info);
		else if (nc == columnRslt_memo9) doRslt_memo9_NC(info);
		else if (nc == columnRslt_memo10) doRslt_memo10_NC(info);
		else if (nc == columnRslt_memo11) doRslt_memo11_NC(info);
		else if (nc == columnRslt_memo12) doRslt_memo12_NC(info);
		else if (nc == columnRslt_memo13) doRslt_memo13_NC(info);
		else if (nc == columnRslt_memo14) doRslt_memo14_NC(info);
		else if (nc == columnRslt_memo15) doRslt_memo15_NC(info);
		else if (nc == columnRslt_memo16) doRslt_memo16_NC(info);
		else if (nc == columnRslt_memo17) doRslt_memo17_NC(info);
		else if (nc == columnRslt_memo18) doRslt_memo18_NC(info);
		else if (nc == columnRslt_memo19) doRslt_memo19_NC(info);
		else if (nc == columnRslt_memo20) doRslt_memo20_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == RsltHdr_bp_cd) doRsltHdr_bp_cd_NC(info);
		else if (nc == RsltHdr_bp_nm) doRsltHdr_bp_nm_NC(info);
		else if (nc == RsltHdr_cst_sundry_flg) doRsltHdr_cst_sundry_flg_NC(info);
		else if (nc == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NC(info);
		else if (nc == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NC(info);
		else if (nc == RsltHdr_zip_cd) doRsltHdr_zip_cd_NC(info);
		else if (nc == RsltHdr_addr1) doRsltHdr_addr1_NC(info);
		else if (nc == RsltHdr_addr2) doRsltHdr_addr2_NC(info);
		else if (nc == RsltHdr_addr3) doRsltHdr_addr3_NC(info);
		else if (nc == RsltHdr_addr4) doRsltHdr_addr4_NC(info);
		else if (nc == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NC(info);
		else if (nc == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NC(info);
		else if (nc == RsltHdr_foreign_flg) doRsltHdr_foreign_flg_NC(info);
		else if (nc == RsltHdr_tel) doRsltHdr_tel_NC(info);
		else if (nc == RsltHdr_fax) doRsltHdr_fax_NC(info);
		else if (nc == RsltHdr_cst_cntct_dpt) doRsltHdr_cst_cntct_dpt_NC(info);
		else if (nc == RsltHdr_cst_cntct_psn) doRsltHdr_cst_cntct_psn_NC(info);
		else if (nc == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NC(info);
		else if (nc == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_is_srch_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_is_srch_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ein]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ein_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NC(MCEventInfo info){
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
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_cst_flg) doCnd_cst_flg_NE(info);
		else if (ne == Cnd_acst_flg) doCnd_acst_flg_NE(info);
		else if (ne == Cnd_bcst_flg) doCnd_bcst_flg_NE(info);
		else if (ne == Cnd_rcst_flg) doCnd_rcst_flg_NE(info);
		else if (ne == Cnd_dlv_flg) doCnd_dlv_flg_NE(info);
		else if (ne == Cnd_dest_flg) doCnd_dest_flg_NE(info);
		else if (ne == Cnd_cred_flg) doCnd_cred_flg_NE(info);
		else if (ne == Cnd_sppl_flg) doCnd_sppl_flg_NE(info);
		else if (ne == Cnd_asppl_flg) doCnd_asppl_flg_NE(info);
		else if (ne == Cnd_bsppl_flg) doCnd_bsppl_flg_NE(info);
		else if (ne == Cnd_psppl_flg) doCnd_psppl_flg_NE(info);
		else if (ne == Cnd_maker_flg) doCnd_maker_flg_NE(info);
		else if (ne == Cnd_tdlv_flg) doCnd_tdlv_flg_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_ein) doCnd_ein_NE(info);
		else if (ne == Cnd_dt) doCnd_dt_NE(info);
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
		else if (ne == Cnd_bp_is_srch_typ_nm) doCnd_bp_is_srch_typ_nm_NE(info);
		else if (ne == Cnd_match_typ_Group) doCnd_match_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_bp_alt_nm1) doRslt_bp_alt_nm1_NE(info);
		else if (ne == columnRslt_bp_alt_nm2) doRslt_bp_alt_nm2_NE(info);
		else if (ne == columnRslt_bp_alt_nm3) doRslt_bp_alt_nm3_NE(info);
		else if (ne == columnRslt_bp_alt_nm4) doRslt_bp_alt_nm4_NE(info);
		else if (ne == columnRslt_ein) doRslt_ein_NE(info);
		else if (ne == columnRslt_cntry_cd) doRslt_cntry_cd_NE(info);
		else if (ne == columnRslt_cntry_nm) doRslt_cntry_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_area_cd) doRslt_area_cd_NE(info);
		else if (ne == columnRslt_area_nm) doRslt_area_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_cst_flg) doRslt_cst_flg_NE(info);
		else if (ne == columnRslt_cst_sundry_flg) doRslt_cst_sundry_flg_NE(info);
		else if (ne == columnRslt_acst_flg) doRslt_acst_flg_NE(info);
		else if (ne == columnRslt_bcst_flg) doRslt_bcst_flg_NE(info);
		else if (ne == columnRslt_rcst_flg) doRslt_rcst_flg_NE(info);
		else if (ne == columnRslt_dlv_flg) doRslt_dlv_flg_NE(info);
		else if (ne == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NE(info);
		else if (ne == columnRslt_tdlv_flg) doRslt_tdlv_flg_NE(info);
		else if (ne == columnRslt_dest_flg) doRslt_dest_flg_NE(info);
		else if (ne == columnRslt_cred_flg) doRslt_cred_flg_NE(info);
		else if (ne == columnRslt_sppl_flg) doRslt_sppl_flg_NE(info);
		else if (ne == columnRslt_asppl_flg) doRslt_asppl_flg_NE(info);
		else if (ne == columnRslt_bsppl_flg) doRslt_bsppl_flg_NE(info);
		else if (ne == columnRslt_psppl_flg) doRslt_psppl_flg_NE(info);
		else if (ne == columnRslt_maker_flg) doRslt_maker_flg_NE(info);
		else if (ne == columnRslt_memo1) doRslt_memo1_NE(info);
		else if (ne == columnRslt_memo2) doRslt_memo2_NE(info);
		else if (ne == columnRslt_memo3) doRslt_memo3_NE(info);
		else if (ne == columnRslt_memo4) doRslt_memo4_NE(info);
		else if (ne == columnRslt_memo5) doRslt_memo5_NE(info);
		else if (ne == columnRslt_memo6) doRslt_memo6_NE(info);
		else if (ne == columnRslt_memo7) doRslt_memo7_NE(info);
		else if (ne == columnRslt_memo8) doRslt_memo8_NE(info);
		else if (ne == columnRslt_memo9) doRslt_memo9_NE(info);
		else if (ne == columnRslt_memo10) doRslt_memo10_NE(info);
		else if (ne == columnRslt_memo11) doRslt_memo11_NE(info);
		else if (ne == columnRslt_memo12) doRslt_memo12_NE(info);
		else if (ne == columnRslt_memo13) doRslt_memo13_NE(info);
		else if (ne == columnRslt_memo14) doRslt_memo14_NE(info);
		else if (ne == columnRslt_memo15) doRslt_memo15_NE(info);
		else if (ne == columnRslt_memo16) doRslt_memo16_NE(info);
		else if (ne == columnRslt_memo17) doRslt_memo17_NE(info);
		else if (ne == columnRslt_memo18) doRslt_memo18_NE(info);
		else if (ne == columnRslt_memo19) doRslt_memo19_NE(info);
		else if (ne == columnRslt_memo20) doRslt_memo20_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == RsltHdr_bp_cd) doRsltHdr_bp_cd_NE(info);
		else if (ne == RsltHdr_bp_nm) doRsltHdr_bp_nm_NE(info);
		else if (ne == RsltHdr_cst_sundry_flg) doRsltHdr_cst_sundry_flg_NE(info);
		else if (ne == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NE(info);
		else if (ne == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NE(info);
		else if (ne == RsltHdr_zip_cd) doRsltHdr_zip_cd_NE(info);
		else if (ne == RsltHdr_addr1) doRsltHdr_addr1_NE(info);
		else if (ne == RsltHdr_addr2) doRsltHdr_addr2_NE(info);
		else if (ne == RsltHdr_addr3) doRsltHdr_addr3_NE(info);
		else if (ne == RsltHdr_addr4) doRsltHdr_addr4_NE(info);
		else if (ne == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NE(info);
		else if (ne == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NE(info);
		else if (ne == RsltHdr_foreign_flg) doRsltHdr_foreign_flg_NE(info);
		else if (ne == RsltHdr_tel) doRsltHdr_tel_NE(info);
		else if (ne == RsltHdr_fax) doRsltHdr_fax_NE(info);
		else if (ne == RsltHdr_cst_cntct_dpt) doRsltHdr_cst_cntct_dpt_NE(info);
		else if (ne == RsltHdr_cst_cntct_psn) doRsltHdr_cst_cntct_psn_NE(info);
		else if (ne == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NE(info);
		else if (ne == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_is_srch_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_is_srch_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ein]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ein_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NE(MCEventInfo info){
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
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_cst_flg) doCnd_cst_flg_NX(info);
		else if (nx == Cnd_acst_flg) doCnd_acst_flg_NX(info);
		else if (nx == Cnd_bcst_flg) doCnd_bcst_flg_NX(info);
		else if (nx == Cnd_rcst_flg) doCnd_rcst_flg_NX(info);
		else if (nx == Cnd_dlv_flg) doCnd_dlv_flg_NX(info);
		else if (nx == Cnd_dest_flg) doCnd_dest_flg_NX(info);
		else if (nx == Cnd_cred_flg) doCnd_cred_flg_NX(info);
		else if (nx == Cnd_sppl_flg) doCnd_sppl_flg_NX(info);
		else if (nx == Cnd_asppl_flg) doCnd_asppl_flg_NX(info);
		else if (nx == Cnd_bsppl_flg) doCnd_bsppl_flg_NX(info);
		else if (nx == Cnd_psppl_flg) doCnd_psppl_flg_NX(info);
		else if (nx == Cnd_maker_flg) doCnd_maker_flg_NX(info);
		else if (nx == Cnd_tdlv_flg) doCnd_tdlv_flg_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_ein) doCnd_ein_NX(info);
		else if (nx == Cnd_dt) doCnd_dt_NX(info);
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
		else if (nx == Cnd_bp_is_srch_typ_nm) doCnd_bp_is_srch_typ_nm_NX(info);
		else if (nx == Cnd_match_typ_Group) doCnd_match_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_bp_alt_nm1) doRslt_bp_alt_nm1_NX(info);
		else if (nx == columnRslt_bp_alt_nm2) doRslt_bp_alt_nm2_NX(info);
		else if (nx == columnRslt_bp_alt_nm3) doRslt_bp_alt_nm3_NX(info);
		else if (nx == columnRslt_bp_alt_nm4) doRslt_bp_alt_nm4_NX(info);
		else if (nx == columnRslt_ein) doRslt_ein_NX(info);
		else if (nx == columnRslt_cntry_cd) doRslt_cntry_cd_NX(info);
		else if (nx == columnRslt_cntry_nm) doRslt_cntry_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_area_cd) doRslt_area_cd_NX(info);
		else if (nx == columnRslt_area_nm) doRslt_area_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_cst_flg) doRslt_cst_flg_NX(info);
		else if (nx == columnRslt_cst_sundry_flg) doRslt_cst_sundry_flg_NX(info);
		else if (nx == columnRslt_acst_flg) doRslt_acst_flg_NX(info);
		else if (nx == columnRslt_bcst_flg) doRslt_bcst_flg_NX(info);
		else if (nx == columnRslt_rcst_flg) doRslt_rcst_flg_NX(info);
		else if (nx == columnRslt_dlv_flg) doRslt_dlv_flg_NX(info);
		else if (nx == columnRslt_dlv_sundry_flg) doRslt_dlv_sundry_flg_NX(info);
		else if (nx == columnRslt_tdlv_flg) doRslt_tdlv_flg_NX(info);
		else if (nx == columnRslt_dest_flg) doRslt_dest_flg_NX(info);
		else if (nx == columnRslt_cred_flg) doRslt_cred_flg_NX(info);
		else if (nx == columnRslt_sppl_flg) doRslt_sppl_flg_NX(info);
		else if (nx == columnRslt_asppl_flg) doRslt_asppl_flg_NX(info);
		else if (nx == columnRslt_bsppl_flg) doRslt_bsppl_flg_NX(info);
		else if (nx == columnRslt_psppl_flg) doRslt_psppl_flg_NX(info);
		else if (nx == columnRslt_maker_flg) doRslt_maker_flg_NX(info);
		else if (nx == columnRslt_memo1) doRslt_memo1_NX(info);
		else if (nx == columnRslt_memo2) doRslt_memo2_NX(info);
		else if (nx == columnRslt_memo3) doRslt_memo3_NX(info);
		else if (nx == columnRslt_memo4) doRslt_memo4_NX(info);
		else if (nx == columnRslt_memo5) doRslt_memo5_NX(info);
		else if (nx == columnRslt_memo6) doRslt_memo6_NX(info);
		else if (nx == columnRslt_memo7) doRslt_memo7_NX(info);
		else if (nx == columnRslt_memo8) doRslt_memo8_NX(info);
		else if (nx == columnRslt_memo9) doRslt_memo9_NX(info);
		else if (nx == columnRslt_memo10) doRslt_memo10_NX(info);
		else if (nx == columnRslt_memo11) doRslt_memo11_NX(info);
		else if (nx == columnRslt_memo12) doRslt_memo12_NX(info);
		else if (nx == columnRslt_memo13) doRslt_memo13_NX(info);
		else if (nx == columnRslt_memo14) doRslt_memo14_NX(info);
		else if (nx == columnRslt_memo15) doRslt_memo15_NX(info);
		else if (nx == columnRslt_memo16) doRslt_memo16_NX(info);
		else if (nx == columnRslt_memo17) doRslt_memo17_NX(info);
		else if (nx == columnRslt_memo18) doRslt_memo18_NX(info);
		else if (nx == columnRslt_memo19) doRslt_memo19_NX(info);
		else if (nx == columnRslt_memo20) doRslt_memo20_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == RsltHdr_bp_cd) doRsltHdr_bp_cd_NX(info);
		else if (nx == RsltHdr_bp_nm) doRsltHdr_bp_nm_NX(info);
		else if (nx == RsltHdr_cst_sundry_flg) doRsltHdr_cst_sundry_flg_NX(info);
		else if (nx == RsltHdr_dlv_sundry_flg) doRsltHdr_dlv_sundry_flg_NX(info);
		else if (nx == RsltHdr_pri_prnt_flg) doRsltHdr_pri_prnt_flg_NX(info);
		else if (nx == RsltHdr_zip_cd) doRsltHdr_zip_cd_NX(info);
		else if (nx == RsltHdr_addr1) doRsltHdr_addr1_NX(info);
		else if (nx == RsltHdr_addr2) doRsltHdr_addr2_NX(info);
		else if (nx == RsltHdr_addr3) doRsltHdr_addr3_NX(info);
		else if (nx == RsltHdr_addr4) doRsltHdr_addr4_NX(info);
		else if (nx == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_NX(info);
		else if (nx == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_NX(info);
		else if (nx == RsltHdr_foreign_flg) doRsltHdr_foreign_flg_NX(info);
		else if (nx == RsltHdr_tel) doRsltHdr_tel_NX(info);
		else if (nx == RsltHdr_fax) doRsltHdr_fax_NX(info);
		else if (nx == RsltHdr_cst_cntct_dpt) doRsltHdr_cst_cntct_dpt_NX(info);
		else if (nx == RsltHdr_cst_cntct_psn) doRsltHdr_cst_cntct_psn_NX(info);
		else if (nx == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_NX(info);
		else if (nx == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tdlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tdlv_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_is_srch_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_is_srch_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[match_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_match_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ein]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ein_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[acst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_acst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tdlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tdlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cred_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cred_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_ein) doCnd_ein_LC(info);
		else if (lc == Cnd_dt) doCnd_dt_LC(info);
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
		else if (lc == Cnd_bp_is_srch_typ_nm) doCnd_bp_is_srch_typ_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_bp_alt_nm1) doRslt_bp_alt_nm1_LC(info);
		else if (lc == columnRslt_bp_alt_nm2) doRslt_bp_alt_nm2_LC(info);
		else if (lc == columnRslt_bp_alt_nm3) doRslt_bp_alt_nm3_LC(info);
		else if (lc == columnRslt_bp_alt_nm4) doRslt_bp_alt_nm4_LC(info);
		else if (lc == columnRslt_ein) doRslt_ein_LC(info);
		else if (lc == columnRslt_cntry_cd) doRslt_cntry_cd_LC(info);
		else if (lc == columnRslt_cntry_nm) doRslt_cntry_nm_LC(info);
		else if (lc == columnRslt_area_cd) doRslt_area_cd_LC(info);
		else if (lc == columnRslt_area_nm) doRslt_area_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_memo1) doRslt_memo1_LC(info);
		else if (lc == columnRslt_memo2) doRslt_memo2_LC(info);
		else if (lc == columnRslt_memo3) doRslt_memo3_LC(info);
		else if (lc == columnRslt_memo4) doRslt_memo4_LC(info);
		else if (lc == columnRslt_memo5) doRslt_memo5_LC(info);
		else if (lc == columnRslt_memo6) doRslt_memo6_LC(info);
		else if (lc == columnRslt_memo7) doRslt_memo7_LC(info);
		else if (lc == columnRslt_memo8) doRslt_memo8_LC(info);
		else if (lc == columnRslt_memo9) doRslt_memo9_LC(info);
		else if (lc == columnRslt_memo10) doRslt_memo10_LC(info);
		else if (lc == columnRslt_memo11) doRslt_memo11_LC(info);
		else if (lc == columnRslt_memo12) doRslt_memo12_LC(info);
		else if (lc == columnRslt_memo13) doRslt_memo13_LC(info);
		else if (lc == columnRslt_memo14) doRslt_memo14_LC(info);
		else if (lc == columnRslt_memo15) doRslt_memo15_LC(info);
		else if (lc == columnRslt_memo16) doRslt_memo16_LC(info);
		else if (lc == columnRslt_memo17) doRslt_memo17_LC(info);
		else if (lc == columnRslt_memo18) doRslt_memo18_LC(info);
		else if (lc == columnRslt_memo19) doRslt_memo19_LC(info);
		else if (lc == columnRslt_memo20) doRslt_memo20_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == RsltHdr_bp_cd) doRsltHdr_bp_cd_LC(info);
		else if (lc == RsltHdr_bp_nm) doRsltHdr_bp_nm_LC(info);
		else if (lc == RsltHdr_zip_cd) doRsltHdr_zip_cd_LC(info);
		else if (lc == RsltHdr_addr1) doRsltHdr_addr1_LC(info);
		else if (lc == RsltHdr_addr2) doRsltHdr_addr2_LC(info);
		else if (lc == RsltHdr_addr3) doRsltHdr_addr3_LC(info);
		else if (lc == RsltHdr_addr4) doRsltHdr_addr4_LC(info);
		else if (lc == RsltHdr_cntry_cd) doRsltHdr_cntry_cd_LC(info);
		else if (lc == RsltHdr_cntry_nm) doRsltHdr_cntry_nm_LC(info);
		else if (lc == RsltHdr_tel) doRsltHdr_tel_LC(info);
		else if (lc == RsltHdr_fax) doRsltHdr_fax_LC(info);
		else if (lc == RsltHdr_cst_cntct_dpt) doRsltHdr_cst_cntct_dpt_LC(info);
		else if (lc == RsltHdr_cst_cntct_psn) doRsltHdr_cst_cntct_psn_LC(info);
		else if (lc == RsltHdr_dlv_cntct_dpt) doRsltHdr_dlv_cntct_dpt_LC(info);
		else if (lc == RsltHdr_dlv_cntct_psn) doRsltHdr_dlv_cntct_psn_LC(info);
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
	 * [Cnd]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_is_srch_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_is_srch_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ein]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ein_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr1_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr2_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr3_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_addr4_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_tel_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_fax_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[cst_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_cst_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [RsltHdr]パネルの[dlv_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltHdr_dlv_cntct_psn_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[RsltHdr_cntry_cd]の作成メソッド
	 */
	public MCList getRsltHdr_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}