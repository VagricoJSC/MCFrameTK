package mcframe.clientMABC.MABCP0400;

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
import mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg_MC.MA_MABCL0400_Srch01Caller;
import mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd01Caller;
import mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg_MC.MA_MABCL0400_Del01Caller;
import mcframe.clientMABC.MABCP0400.MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd02Caller;

/**
 * 画面"MABCP_ItmRlsReg"パネルクラスです。<p>
 *
 * 品目リリースの検索、登録、取り消しを行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ItmRlsReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0400";

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
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [CndTab]ブロック関連のField定義
	public MCPanel CndTabPanel = null;
	public MCTabbedPane CndTabTab = null;
	// [CndTab]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Release,0;DEL,Cancel,1;REF,View,3;COST,Apply to cost,5 UPD,リリースする,0;DEL,取り消す,1;REF,参照する,3;COST,原価へ反映する,5.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_COST = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itmtyp_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itmtyp_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itmtyp_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itmtyp_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itmtyp_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	/**
	 * Release リリース.<p>
	 *
	 */
	public MCLabel Cnd_release_flg_lab = null;
	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_off = null;
	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_on = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_memo1_c_Label = null;
	/**
	 * Memo 1 (Common) メモ１(共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo1_c = null;
	public MCLabel Cnd_memo2_c_Label = null;
	/**
	 * Memo 2 (Common) メモ２(共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo2_c = null;
	public MCLabel Cnd_memo3_c_Label = null;
	/**
	 * Memo 3 (Common) メモ３(共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo3_c = null;
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
	/**
	 * Not for sales 販売.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_tar_out_flg = null;
	/**
	 * For sales 販売.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_tar_flg = null;
	/**
	 * Sales. not set 販売.未設定.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_no_input_flg = null;
	/**
	 * Sales. configured 販売.設定済.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_input_flg = null;
	/**
	 * Not for mfg. 製造.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_tar_out_flg = null;
	/**
	 * For mfg. 製造.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_tar_flg = null;
	/**
	 * Manufacture not configured 製造.未設定.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_no_input_flg = null;
	/**
	 * Mfg. configured 製造.設定済.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_input_flg = null;
	/**
	 * Not for purchasing 購買.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_tar_out_flg = null;
	/**
	 * For purchasing 購買.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_tar_flg = null;
	/**
	 * Purchasing. not set 購買.未設定.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_no_input_flg = null;
	/**
	 * Purchasing configured 購買.設定済.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_input_flg = null;
	/**
	 * Not for inspection 検査.対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_tar_out_flg = null;
	/**
	 * For inspection 検査.対象.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_tar_flg = null;
	/**
	 * Inspection not configured 検査.未設定.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_no_input_flg = null;
	/**
	 * Inspection configured 検査.設定済.<p>
	 *
	 */
	public MCCheckBox Cnd_insp_input_flg = null;
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
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
	// [Cnd1]ブロック関連のField定義
	public MCPanel Cnd1Panel = null;
	// [Cnd1]ブロックの項目のField定義
	// [Sls]ブロック関連のField定義
	public MCPanel SlsPanel = null;
	public MCTitledBorder SlsTitledBorder = null;
	// [Sls]ブロックの項目のField定義
	// [Mfg]ブロック関連のField定義
	public MCPanel MfgPanel = null;
	public MCTitledBorder MfgTitledBorder = null;
	// [Mfg]ブロックの項目のField定義
	// [Purc]ブロック関連のField定義
	public MCPanel PurcPanel = null;
	public MCTitledBorder PurcTitledBorder = null;
	// [Purc]ブロックの項目のField定義
	// [Insp]ブロック関連のField定義
	public MCPanel InspPanel = null;
	public MCTitledBorder InspTitledBorder = null;
	// [Insp]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0400.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Release リリース.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * For sales 販売対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_flg = null;
	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_input_flg = null;
	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_upri = null;
	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_upri = null;
	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_upri = null;
	/**
	 * For mfg. 製造対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_flg = null;
	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_input_flg = null;
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri = null;
	/**
	 * For purchasing 購買対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_flg = null;
	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_input_flg = null;
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri = null;
	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_upri = null;
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_flg = null;
	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_input_flg = null;
	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1_c = null;
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2_c = null;
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3_c = null;
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
	 * Release PIC name cd. リリース担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_usr_cd = null;
	/**
	 * Release PIC name リリース担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_usr_nm = null;
	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_tm = null;
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Item master entry 品目マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABCP0310 = null;
	/**
	 * Sales item entry 販売品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1120 = null;
	/**
	 * Mfg. item entry 製造品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1100 = null;
	/**
	 * Purchasing item entry 購買品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1110 = null;
	/**
	 * Inspection item entry 検査品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1130 = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd2 = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H DtlBtn_term_p_PPanel;
	public MCDateComboBox DtlBtn_term;	// [DtlBtn]の[term_p.term]を[DtlBtn_term]としてエイリアス定義。
	public MCTextField DtlBtn_term_nm;	// [DtlBtn]の[term_p.term_nm]を[DtlBtn_term_nm]としてエイリアス定義。
	public MCLabel DtlBtn_tgt_dt_Label = null;
	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDateField DtlBtn_tgt_dt = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton DtlBtn_del = null;
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
	/** [COST]モードを表す定数 */
	public static final String COST = "COST";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF, COST};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0400_Srch01]のCallerの作成 */
	protected MABCP_ItmRlsReg_MC.MA_MABCL0400_Srch01Caller createMA_MABCL0400_Srch01() {
		MABCP_ItmRlsReg_MC.MA_MABCL0400_Srch01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Srch01Bridge>
		caller = ((MABCP_ItmRlsReg_MC)this).new MA_MABCL0400_Srch01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Srch01Bridge>(
					(MABCP_ItmRlsReg)this, new MA_MABCL0400_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0400_Srch01]の呼び出し */
	protected void callMA_MABCL0400_Srch01() {
		MCCaller caller = createMA_MABCL0400_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0400_Upd01]のCallerの作成 */
	protected MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd01Caller createMA_MABCL0400_Upd01() {
		MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Upd01Bridge>
		caller = ((MABCP_ItmRlsReg_MC)this).new MA_MABCL0400_Upd01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Upd01Bridge>(
					(MABCP_ItmRlsReg)this, new MA_MABCL0400_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0400_Upd01]の呼び出し */
	protected void callMA_MABCL0400_Upd01() {
		MCCaller caller = createMA_MABCL0400_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0400_Del01]のCallerの作成 */
	protected MABCP_ItmRlsReg_MC.MA_MABCL0400_Del01Caller createMA_MABCL0400_Del01() {
		MABCP_ItmRlsReg_MC.MA_MABCL0400_Del01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Del01Bridge>
		caller = ((MABCP_ItmRlsReg_MC)this).new MA_MABCL0400_Del01Caller<MABCP_ItmRlsReg, MA_MABCL0400_Del01Bridge>(
					(MABCP_ItmRlsReg)this, new MA_MABCL0400_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0400_Del01]の呼び出し */
	protected void callMA_MABCL0400_Del01() {
		MCCaller caller = createMA_MABCL0400_Del01();
		caller.exec();
	}
	/** [MA_MABCL0400_Upd02]のCallerの作成 */
	protected MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd02Caller createMA_MABCL0400_Upd02() {
		MABCP_ItmRlsReg_MC.MA_MABCL0400_Upd02Caller<MABCP_ItmRlsReg, MA_MABCL0400_Upd02Bridge>
		caller = ((MABCP_ItmRlsReg_MC)this).new MA_MABCL0400_Upd02Caller<MABCP_ItmRlsReg, MA_MABCL0400_Upd02Bridge>(
					(MABCP_ItmRlsReg)this, new MA_MABCL0400_Upd02Bridge());
		return caller;
	}
	/** [MA_MABCL0400_Upd02]の呼び出し */
	protected void callMA_MABCL0400_Upd02() {
		MCCaller caller = createMA_MABCL0400_Upd02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0400.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0400.DtlR> aDtlL;
	/** [DtlBtn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0400.DtlBtnR aDtlBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0400.CndR createCndR() {
		return mcframe.clientMABC.MABCP0400.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0400.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0400.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0400.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0400.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0400.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class);
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
	 * 項目コピーによってaDtlBtnRを設定します。
	 *
	 * aDtlBtnRのインスタンスは変更されません。
	 *
	 * @param row DtlBtnR
	 */
	public void setDtlBtnR(mcframe.clientMABC.MABCP0400.DtlBtnR row) {
		if (row != null) {
			MCRow.copyall(getDtlBtnR(), row);
		}
	}

	/**
	 * [DtlBtn]ブロックのコンテナaDtlBtnRを返します。
	 *
	 * @return DtlBtnR
	 */
	public mcframe.clientMABC.MABCP0400.DtlBtnR getDtlBtnR() {
		return aDtlBtnR;
	}

	/**
	 * aDtlBtnRを作成します。
	 *
	 * @return DtlBtnR
	 */
	public mcframe.clientMABC.MABCP0400.DtlBtnR createDtlBtnR() {
		return mcframe.clientMABC.MABCP0400.DtlBtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlBtnR())) ret.add(getDtlBtnR());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlBtnR()) return "DtlBtn";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlBtn")) return getDtlBtnR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(Cnd1Panel);
		ret.add(SlsPanel);
		ret.add(MfgPanel);
		ret.add(PurcPanel);
		ret.add(InspPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmRlsReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aDtlBtnR = createDtlBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ItmRlsReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlBtnR = createDtlBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_ItmRlsReg_MC.jbCreateScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateTop((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateFold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateCndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateCnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateTab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateTab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateCtrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateCnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateSls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateMfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreatePurc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateInsp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateDtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateDtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbCreateEastBtn((MABCP_ItmRlsReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_ItmRlsReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ItmRlsReg p) {
		p.Cnd_itmtyp_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itmtyp_p());
		p.Cnd_itmtyp_p_PPanel.setName("Cnd.itmtyp_p");
		p.Cnd_itm_typ = p.Cnd_itmtyp_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itmtyp_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itmtyp_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itmtyp_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_ItmRlsReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Cnd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd1(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Sls]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSls(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Mfg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMfg(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Purc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePurc(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Insp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateInsp(MABCP_ItmRlsReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ItmRlsReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP0400.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_ItmRlsReg p) {
		p.DtlBtn_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getDtlBtnR().term_p());
		p.DtlBtn_term_p_PPanel.setName("DtlBtn.term_p");
		p.DtlBtn_term = p.DtlBtn_term_p_PPanel.Term_term;
		p.DtlBtn_term.addAliasName("DtlBtn.term", p);
		p.DtlBtn_term_nm = p.DtlBtn_term_p_PPanel.Term_term_nm;
		p.DtlBtn_term_nm.addAliasName("DtlBtn.term_nm", p);
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_ItmRlsReg p) {
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

	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd1_ListPutter() {
		if (Cnd_itm_grp_cd1_p == null) {
			Cnd_itm_grp_cd1_p = createCnd_itm_grp_cd1_ListPutter(Cnd_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Cnd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd2_ListPutter() {
		if (Cnd_itm_grp_cd2_p == null) {
			Cnd_itm_grp_cd2_p = createCnd_itm_grp_cd2_ListPutter(Cnd_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Cnd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd3_ListPutter() {
		if (Cnd_itm_grp_cd3_p == null) {
			Cnd_itm_grp_cd3_p = createCnd_itm_grp_cd3_ListPutter(Cnd_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Cnd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd4_ListPutter() {
		if (Cnd_itm_grp_cd4_p == null) {
			Cnd_itm_grp_cd4_p = createCnd_itm_grp_cd4_ListPutter(Cnd_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Cnd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd5_ListPutter() {
		if (Cnd_itm_grp_cd5_p == null) {
			Cnd_itm_grp_cd5_p = createCnd_itm_grp_cd5_ListPutter(Cnd_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Cnd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd6_ListPutter() {
		if (Cnd_itm_grp_cd6_p == null) {
			Cnd_itm_grp_cd6_p = createCnd_itm_grp_cd6_ListPutter(Cnd_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Cnd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd7_ListPutter() {
		if (Cnd_itm_grp_cd7_p == null) {
			Cnd_itm_grp_cd7_p = createCnd_itm_grp_cd7_ListPutter(Cnd_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Cnd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd8_ListPutter() {
		if (Cnd_itm_grp_cd8_p == null) {
			Cnd_itm_grp_cd8_p = createCnd_itm_grp_cd8_ListPutter(Cnd_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Cnd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd9_ListPutter() {
		if (Cnd_itm_grp_cd9_p == null) {
			Cnd_itm_grp_cd9_p = createCnd_itm_grp_cd9_ListPutter(Cnd_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Cnd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd10_ListPutter() {
		if (Cnd_itm_grp_cd10_p == null) {
			Cnd_itm_grp_cd10_p = createCnd_itm_grp_cd10_ListPutter(Cnd_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Cnd_itm_grp_cd10_p;
	}
	
	
	/** [Dtl_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_p = null;

	/**
	 * [Dtl_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_ListPutter() {
		if (Dtl_itm_typ_p == null) {
			Dtl_itm_typ_p = createDtl_itm_typ_ListPutter(columnDtl_itm_typ, "itm_typ");

		}
		return Dtl_itm_typ_p;
	}
	
	
	/** [Dtl_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_d_cd_p = null;

	/**
	 * [Dtl_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_d_cd_ListPutter() {
		if (Dtl_itm_typ_d_cd_p == null) {
			Dtl_itm_typ_d_cd_p = createDtl_itm_typ_d_cd_ListPutter(columnDtl_itm_typ_d_cd, "itm_typ_d_cd");

		}
		return Dtl_itm_typ_d_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmRlsReg create(){
		MABCP_ItmRlsReg p = new MABCP_ItmRlsReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmRlsReg create(String name){
		MABCP_ItmRlsReg p = new MABCP_ItmRlsReg(name);
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
		MABCP_ItmRlsReg_MC.jbfInitScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitTop((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitFold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitCndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitCnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitTab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitTab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitCtrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitCnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitSls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitMfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitPurc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitInsp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitDtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitDtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbfInitEastBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitTop((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitFold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitCndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitCnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitTab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitTab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitCtrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitCnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitSls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitMfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitPurc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitInsp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitDtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitDtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.jbInitEastBtn((MABCP_ItmRlsReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_COST = p.beansFactory.createRadioButton("Cnd.ope_COST");
		p.Cnd_release_flg_lab = p.beansFactory.createLabel("Cnd.release_flg_lab");
		p.Cnd_release_flg_off = p.beansFactory.createCheckBox("Cnd.release_flg_off");
		p.Cnd_release_flg_on = p.beansFactory.createCheckBox("Cnd.release_flg_on");
		p.Cnd_memo1_c_Label = p.beansFactory.createLabel("Cnd.memo1_c_Label");
		p.Cnd_memo1_c = p.beansFactory.createTextField("Cnd.memo1_c");
		p.Cnd_memo1_c.setLabel(p.Cnd_memo1_c_Label);
		p.Cnd_memo2_c_Label = p.beansFactory.createLabel("Cnd.memo2_c_Label");
		p.Cnd_memo2_c = p.beansFactory.createTextField("Cnd.memo2_c");
		p.Cnd_memo2_c.setLabel(p.Cnd_memo2_c_Label);
		p.Cnd_memo3_c_Label = p.beansFactory.createLabel("Cnd.memo3_c_Label");
		p.Cnd_memo3_c = p.beansFactory.createTextField("Cnd.memo3_c");
		p.Cnd_memo3_c.setLabel(p.Cnd_memo3_c_Label);
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_sls_tar_out_flg = p.beansFactory.createCheckBox("Cnd.sls_tar_out_flg");
		p.Cnd_sls_tar_flg = p.beansFactory.createCheckBox("Cnd.sls_tar_flg");
		p.Cnd_sls_no_input_flg = p.beansFactory.createCheckBox("Cnd.sls_no_input_flg");
		p.Cnd_sls_input_flg = p.beansFactory.createCheckBox("Cnd.sls_input_flg");
		p.Cnd_mfg_tar_out_flg = p.beansFactory.createCheckBox("Cnd.mfg_tar_out_flg");
		p.Cnd_mfg_tar_flg = p.beansFactory.createCheckBox("Cnd.mfg_tar_flg");
		p.Cnd_mfg_no_input_flg = p.beansFactory.createCheckBox("Cnd.mfg_no_input_flg");
		p.Cnd_mfg_input_flg = p.beansFactory.createCheckBox("Cnd.mfg_input_flg");
		p.Cnd_purc_tar_out_flg = p.beansFactory.createCheckBox("Cnd.purc_tar_out_flg");
		p.Cnd_purc_tar_flg = p.beansFactory.createCheckBox("Cnd.purc_tar_flg");
		p.Cnd_purc_no_input_flg = p.beansFactory.createCheckBox("Cnd.purc_no_input_flg");
		p.Cnd_purc_input_flg = p.beansFactory.createCheckBox("Cnd.purc_input_flg");
		p.Cnd_insp_tar_out_flg = p.beansFactory.createCheckBox("Cnd.insp_tar_out_flg");
		p.Cnd_insp_tar_flg = p.beansFactory.createCheckBox("Cnd.insp_tar_flg");
		p.Cnd_insp_no_input_flg = p.beansFactory.createCheckBox("Cnd.insp_no_input_flg");
		p.Cnd_insp_input_flg = p.beansFactory.createCheckBox("Cnd.insp_input_flg");
		p.Cnd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd1_Label");
		p.Cnd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd1");
		p.Cnd_itm_grp_cd1.setLabel(p.Cnd_itm_grp_cd1_Label);
		p.Cnd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.itm_grp_nm1");
		p.Cnd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd2_Label");
		p.Cnd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd2");
		p.Cnd_itm_grp_cd2.setLabel(p.Cnd_itm_grp_cd2_Label);
		p.Cnd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.itm_grp_nm2");
		p.Cnd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd3_Label");
		p.Cnd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd3");
		p.Cnd_itm_grp_cd3.setLabel(p.Cnd_itm_grp_cd3_Label);
		p.Cnd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.itm_grp_nm3");
		p.Cnd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd4_Label");
		p.Cnd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd4");
		p.Cnd_itm_grp_cd4.setLabel(p.Cnd_itm_grp_cd4_Label);
		p.Cnd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.itm_grp_nm4");
		p.Cnd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd5_Label");
		p.Cnd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd5");
		p.Cnd_itm_grp_cd5.setLabel(p.Cnd_itm_grp_cd5_Label);
		p.Cnd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.itm_grp_nm5");
		p.Cnd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd6_Label");
		p.Cnd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd6");
		p.Cnd_itm_grp_cd6.setLabel(p.Cnd_itm_grp_cd6_Label);
		p.Cnd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.itm_grp_nm6");
		p.Cnd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd7_Label");
		p.Cnd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd7");
		p.Cnd_itm_grp_cd7.setLabel(p.Cnd_itm_grp_cd7_Label);
		p.Cnd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.itm_grp_nm7");
		p.Cnd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd8_Label");
		p.Cnd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd8");
		p.Cnd_itm_grp_cd8.setLabel(p.Cnd_itm_grp_cd8_Label);
		p.Cnd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.itm_grp_nm8");
		p.Cnd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd9_Label");
		p.Cnd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd9");
		p.Cnd_itm_grp_cd9.setLabel(p.Cnd_itm_grp_cd9_Label);
		p.Cnd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.itm_grp_nm9");
		p.Cnd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd10_Label");
		p.Cnd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd10");
		p.Cnd_itm_grp_cd10.setLabel(p.Cnd_itm_grp_cd10_Label);
		p.Cnd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.itm_grp_nm10");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd1(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel = p.beansFactory.createPanel("Cnd1");
		// ブロックの項目の初期化
	}

	/**
	 * [Sls]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSls(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.SlsPanel = p.beansFactory.createPanel("Sls");
		p.SlsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mfg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMfg(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.MfgPanel = p.beansFactory.createPanel("Mfg");
		p.MfgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Purc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPurc(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.PurcPanel = p.beansFactory.createPanel("Purc");
		p.PurcTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Insp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitInsp(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.InspPanel = p.beansFactory.createPanel("Insp");
		p.InspTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_release_flg = p.beansFactory.createTableColumn("Dtl.release_flg", MCColumnType.CHECK);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_sls_flg = p.beansFactory.createTableColumn("Dtl.sls_flg", MCColumnType.CHECK);
		p.columnDtl_sls_input_flg = p.beansFactory.createTableColumn("Dtl.sls_input_flg", MCColumnType.CHECK);
		p.columnDtl_cst_upri = p.beansFactory.createTableColumn("Dtl.cst_upri", MCColumnType.NUMBER);
		p.columnDtl_itm_upri = p.beansFactory.createTableColumn("Dtl.itm_upri", MCColumnType.NUMBER);
		p.columnDtl_std_upri = p.beansFactory.createTableColumn("Dtl.std_upri", MCColumnType.NUMBER);
		p.columnDtl_mfg_flg = p.beansFactory.createTableColumn("Dtl.mfg_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_input_flg = p.beansFactory.createTableColumn("Dtl.mfg_input_flg", MCColumnType.CHECK);
		p.columnDtl_proc_upri = p.beansFactory.createTableColumn("Dtl.proc_upri", MCColumnType.NUMBER);
		p.columnDtl_purc_flg = p.beansFactory.createTableColumn("Dtl.purc_flg", MCColumnType.CHECK);
		p.columnDtl_purc_input_flg = p.beansFactory.createTableColumn("Dtl.purc_input_flg", MCColumnType.CHECK);
		p.columnDtl_purc_upri = p.beansFactory.createTableColumn("Dtl.purc_upri", MCColumnType.NUMBER);
		p.columnDtl_prov_upri = p.beansFactory.createTableColumn("Dtl.prov_upri", MCColumnType.NUMBER);
		p.columnDtl_insp_flg = p.beansFactory.createTableColumn("Dtl.insp_flg", MCColumnType.CHECK);
		p.columnDtl_insp_input_flg = p.beansFactory.createTableColumn("Dtl.insp_input_flg", MCColumnType.CHECK);
		p.columnDtl_memo1_c = p.beansFactory.createTableColumn("Dtl.memo1_c", MCColumnType.TEXT);
		p.columnDtl_memo2_c = p.beansFactory.createTableColumn("Dtl.memo2_c", MCColumnType.TEXT);
		p.columnDtl_memo3_c = p.beansFactory.createTableColumn("Dtl.memo3_c", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_release_usr_cd = p.beansFactory.createTableColumn("Dtl.release_usr_cd", MCColumnType.TEXT);
		p.columnDtl_release_usr_nm = p.beansFactory.createTableColumn("Dtl.release_usr_nm", MCColumnType.TEXT);
		p.columnDtl_release_tm = p.beansFactory.createTableColumn("Dtl.release_tm", MCColumnType.DATE);
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
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABCP0310 = p.beansFactory.createButton("DtlBtn.open_MABCP0310", "open");
		p.DtlBtn_open_MABSP1120 = p.beansFactory.createButton("DtlBtn.open_MABSP1120", "open");
		p.DtlBtn_open_MABSP1100 = p.beansFactory.createButton("DtlBtn.open_MABSP1100", "open");
		p.DtlBtn_open_MABSP1110 = p.beansFactory.createButton("DtlBtn.open_MABSP1110", "open");
		p.DtlBtn_open_MABSP1130 = p.beansFactory.createButton("DtlBtn.open_MABSP1130", "open");
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_upd2 = p.beansFactory.createButton("DtlBtn.upd2", "upd");
		p.DtlBtn_tgt_dt_Label = p.beansFactory.createLabel("DtlBtn.tgt_dt_Label");
		p.DtlBtn_tgt_dt = p.beansFactory.createDateField("DtlBtn.tgt_dt");
		p.DtlBtn_tgt_dt.setLabel(p.DtlBtn_tgt_dt_Label);
		p.DtlBtn_del = p.beansFactory.createButton("DtlBtn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_ItmRlsReg p) {
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
	protected static void jbInitFold(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.CndTabPanel.add(p.CndTabTab);
		p.CndTabPanel.setLastBeans(p.CndTabTab);
		p.CndTabPanel.setValueCheck(false);
		p.CndTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndTabPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndTabTab.add(p.Tab1Panel, "CndTab.tab1");
		p.CndTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.CndTabTab.add(p.Tab2Panel, "CndTab.tab2");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.DtlPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_COST);
		p.Cnd_ope_COST.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_COST);
		p.ScreenOpePanel.add(p.Cnd_ope_COST);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.ope_META);
		p.Cnd1Panel.add(p.Cnd_itmtyp_p_PPanel);
		p.Cnd1Panel.setLastBeans(p.Cnd_itmtyp_p_PPanel);
		p.Cnd_itmtyp_p_PPanel.setNextBeans(p.Cnd_release_flg_off);
		p.Cnd1Panel.add(p.Cnd_release_flg_lab);
		p.Cnd1Panel.add(p.Cnd_release_flg_off);
		p.Cnd_release_flg_off.setNextBeans(p.Cnd_release_flg_on);
		p.Cnd_release_flg_off.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.release_flg_off_META);
		p.Cnd1Panel.add(p.Cnd_release_flg_on);
		p.Cnd_release_flg_on.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_release_flg_on.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.release_flg_on_META);
		p.Cnd1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_memo1_c);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.Cnd1Panel.add(p.Cnd_memo1_c_Label);
		p.Cnd1Panel.add(p.Cnd_memo1_c);
		p.Cnd_memo1_c.setNextBeans(p.Cnd_memo2_c);
		p.Cnd_memo1_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo1_c_META);
		p.setPluralValueEnable(p.Cnd_memo1_c, true);
		p.Cnd1Panel.add(p.Cnd_memo2_c_Label);
		p.Cnd1Panel.add(p.Cnd_memo2_c);
		p.Cnd_memo2_c.setNextBeans(p.Cnd_memo3_c);
		p.Cnd_memo2_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo2_c_META);
		p.setPluralValueEnable(p.Cnd_memo2_c, true);
		p.Cnd1Panel.add(p.Cnd_memo3_c_Label);
		p.Cnd1Panel.add(p.Cnd_memo3_c);
		p.Cnd_memo3_c.setNextBeans(p.Cnd_memo1);
		p.Cnd_memo3_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo3_c_META);
		p.setPluralValueEnable(p.Cnd_memo3_c, true);
		p.Cnd1Panel.add(p.Cnd_memo1_Label);
		p.Cnd1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Cnd1Panel.add(p.Cnd_memo2_Label);
		p.Cnd1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Cnd1Panel.add(p.Cnd_memo3_Label);
		p.Cnd1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.SlsPanel.add(p.Cnd_sls_tar_out_flg);
		p.SlsPanel.setLastBeans(p.Cnd_sls_tar_out_flg);
		p.Cnd_sls_tar_out_flg.setNextBeans(p.Cnd_sls_tar_flg);
		p.Cnd_sls_tar_out_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.sls_tar_out_flg_META);
		p.SlsPanel.add(p.Cnd_sls_tar_flg);
		p.Cnd_sls_tar_flg.setNextBeans(p.Cnd_sls_no_input_flg);
		p.Cnd_sls_tar_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.sls_tar_flg_META);
		p.SlsPanel.add(p.Cnd_sls_no_input_flg);
		p.Cnd_sls_no_input_flg.setNextBeans(p.Cnd_sls_input_flg);
		p.Cnd_sls_no_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.sls_no_input_flg_META);
		p.SlsPanel.add(p.Cnd_sls_input_flg);
		p.Cnd_sls_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.sls_input_flg_META);
		p.MfgPanel.add(p.Cnd_mfg_tar_out_flg);
		p.MfgPanel.setLastBeans(p.Cnd_mfg_tar_out_flg);
		p.Cnd_mfg_tar_out_flg.setNextBeans(p.Cnd_mfg_tar_flg);
		p.Cnd_mfg_tar_out_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.mfg_tar_out_flg_META);
		p.MfgPanel.add(p.Cnd_mfg_tar_flg);
		p.Cnd_mfg_tar_flg.setNextBeans(p.Cnd_mfg_no_input_flg);
		p.Cnd_mfg_tar_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.mfg_tar_flg_META);
		p.MfgPanel.add(p.Cnd_mfg_no_input_flg);
		p.Cnd_mfg_no_input_flg.setNextBeans(p.Cnd_mfg_input_flg);
		p.Cnd_mfg_no_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.mfg_no_input_flg_META);
		p.MfgPanel.add(p.Cnd_mfg_input_flg);
		p.Cnd_mfg_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.mfg_input_flg_META);
		p.PurcPanel.add(p.Cnd_purc_tar_out_flg);
		p.PurcPanel.setLastBeans(p.Cnd_purc_tar_out_flg);
		p.Cnd_purc_tar_out_flg.setNextBeans(p.Cnd_purc_tar_flg);
		p.Cnd_purc_tar_out_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.purc_tar_out_flg_META);
		p.PurcPanel.add(p.Cnd_purc_tar_flg);
		p.Cnd_purc_tar_flg.setNextBeans(p.Cnd_purc_no_input_flg);
		p.Cnd_purc_tar_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.purc_tar_flg_META);
		p.PurcPanel.add(p.Cnd_purc_no_input_flg);
		p.Cnd_purc_no_input_flg.setNextBeans(p.Cnd_purc_input_flg);
		p.Cnd_purc_no_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.purc_no_input_flg_META);
		p.PurcPanel.add(p.Cnd_purc_input_flg);
		p.Cnd_purc_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.purc_input_flg_META);
		p.InspPanel.add(p.Cnd_insp_tar_out_flg);
		p.InspPanel.setLastBeans(p.Cnd_insp_tar_out_flg);
		p.Cnd_insp_tar_out_flg.setNextBeans(p.Cnd_insp_tar_flg);
		p.Cnd_insp_tar_out_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.insp_tar_out_flg_META);
		p.InspPanel.add(p.Cnd_insp_tar_flg);
		p.Cnd_insp_tar_flg.setNextBeans(p.Cnd_insp_no_input_flg);
		p.Cnd_insp_tar_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.insp_tar_flg_META);
		p.InspPanel.add(p.Cnd_insp_no_input_flg);
		p.Cnd_insp_no_input_flg.setNextBeans(p.Cnd_insp_input_flg);
		p.Cnd_insp_no_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.insp_no_input_flg_META);
		p.InspPanel.add(p.Cnd_insp_input_flg);
		p.Cnd_insp_input_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.insp_input_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0400.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("N+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.Cnd1Panel, null);
		p.Tab1Panel.setLastBeans(p.Cnd1Panel);
		p.Cnd1Panel.setNextBeans(p.SlsPanel);
		p.Tab1Panel.add(p.SlsPanel, null);
		p.SlsPanel.setNextBeans(p.MfgPanel);
		p.Tab1Panel.add(p.MfgPanel, null);
		p.MfgPanel.setNextBeans(p.PurcPanel);
		p.Tab1Panel.add(p.PurcPanel, null);
		p.PurcPanel.setNextBeans(p.InspPanel);
		p.Tab1Panel.add(p.InspPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd1(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel.setValueCheck(false);
		p.Cnd1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd1Panel.setLayoutPosition("NNN");
		// ブロックの項目の初期化
	}

	/**
	 * [Sls]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSls(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.SlsPanel.setBorder(p.SlsTitledBorder);
		p.SlsPanel.setValueCheck(false);
		p.SlsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SlsPanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mfg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMfg(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.MfgPanel.setBorder(p.MfgTitledBorder);
		p.MfgPanel.setValueCheck(false);
		p.MfgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.MfgPanel.setLayoutPosition("NNWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Purc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPurc(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.PurcPanel.setBorder(p.PurcTitledBorder);
		p.PurcPanel.setValueCheck(false);
		p.PurcPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.PurcPanel.setLayoutPosition("NCW");
		// ブロックの項目の初期化
	}

	/**
	 * [Insp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitInsp(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.InspPanel.setBorder(p.InspTitledBorder);
		p.InspPanel.setValueCheck(false);
		p.InspPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.InspPanel.setLayoutPosition("NCWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_ItmRlsReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABCP0310.setFunctionKey(MCFunctionKey.F3);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABCP0310);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_open_MABCP0310);
		p.DtlBtn_open_MABCP0310.setNextBeans(p.DtlBtn_open_MABSP1120);
		p.DtlBtn_open_MABSP1120.setFunctionKey(MCFunctionKey.F4);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1120);
		p.DtlBtn_open_MABSP1120.setNextBeans(p.DtlBtn_open_MABSP1100);
		p.DtlBtn_open_MABSP1100.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1100);
		p.DtlBtn_open_MABSP1100.setNextBeans(p.DtlBtn_open_MABSP1110);
		p.DtlBtn_open_MABSP1110.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1110);
		p.DtlBtn_open_MABSP1110.setNextBeans(p.DtlBtn_open_MABSP1130);
		p.DtlBtn_open_MABSP1130.setFunctionKey(MCFunctionKey.F11);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1130);
		p.DtlBtn_open_MABSP1130.setNextBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_upd);
		p.DtlBtn_upd.setIcon("REGISTER");
		p.DtlBtn_upd.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd);
		p.DtlBtn_upd.setNextBeans(p.DtlBtn_upd2);
		p.DtlBtn_upd2.setIcon("REGISTER");
		p.DtlBtn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd2);
		p.DtlBtn_upd2.setNextBeans(p.DtlBtn_term_p_PPanel);
		p.DtlBtnPanel.add(p.DtlBtn_term_p_PPanel);
		p.DtlBtn_term_p_PPanel.setNextBeans(p.DtlBtn_tgt_dt);
		p.DtlBtnPanel.add(p.DtlBtn_tgt_dt_Label);
		p.DtlBtnPanel.add(p.DtlBtn_tgt_dt);
		p.DtlBtn_tgt_dt.setRow(p.getDtlBtnR(), mcframe.clientMABC.MABCP0400.DtlBtnR.tgt_dt_META);
		p.DtlBtn_tgt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlBtn_del.setIcon("CANCEL");
		p.DtlBtn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del);
		p.EastBtnPanel.add(p.DtlBtn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_ItmRlsReg p) {
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
		MABCP_ItmRlsReg_MC.mcInitScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitTop((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitFold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitCndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitCnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitTab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitTab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitCtrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitCnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitSls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitMfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitPurc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitInsp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitDtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitDtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.mcInitEastBtn((MABCP_ItmRlsReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_ItmRlsReg_MC.statusInitUPD_ScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Top((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Fold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_CndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Cnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Tab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Tab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Ctrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Cnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Sls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Mfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Purc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Insp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_Dtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_DtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitUPD_EastBtn((MABCP_ItmRlsReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_ItmRlsReg_MC.statusInitFIX_ScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Top((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Fold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_CndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Cnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Tab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Tab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Ctrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Cnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Sls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Mfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Purc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Insp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_Dtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_DtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitFIX_EastBtn((MABCP_ItmRlsReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_ItmRlsReg_MC.statusInitDEL_ScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Top((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Fold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_CndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Cnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Tab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Tab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Ctrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Cnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Sls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Mfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Purc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Insp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_Dtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_DtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitDEL_EastBtn((MABCP_ItmRlsReg)this);

		// [REF]ステータスのモードの設定
		MABCP_ItmRlsReg_MC.statusInitREF_ScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Top((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Fold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_CndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Cnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Tab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Tab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Ctrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Cnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Sls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Mfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Purc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Insp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_Dtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_DtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitREF_EastBtn((MABCP_ItmRlsReg)this);

		// [COST]ステータスのモードの設定
		MABCP_ItmRlsReg_MC.statusInitCOST_ScreenOpe((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Top((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Fold((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_CndTab((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Cnd((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Tab1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Tab2((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Ctrl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Cnd1((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Sls((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Mfg((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Purc((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Insp((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_Dtl((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_DtlBtn((MABCP_ItmRlsReg)this);
		MABCP_ItmRlsReg_MC.statusInitCOST_EastBtn((MABCP_ItmRlsReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABCP_ItmRlsReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ItmRlsReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_COST.addAllListener(p);
		p.Cnd_release_flg_off.addAllListener(p);
		p.Cnd_release_flg_on.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_memo1_c.setListListener(p);
		p.Cnd_memo1_c.addAllListener(p);
		p.Cnd_memo2_c.setListListener(p);
		p.Cnd_memo2_c.addAllListener(p);
		p.Cnd_memo3_c.setListListener(p);
		p.Cnd_memo3_c.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_sls_tar_out_flg.addAllListener(p);
		p.Cnd_sls_tar_flg.addAllListener(p);
		p.Cnd_sls_no_input_flg.addAllListener(p);
		p.Cnd_sls_input_flg.addAllListener(p);
		p.Cnd_mfg_tar_out_flg.addAllListener(p);
		p.Cnd_mfg_tar_flg.addAllListener(p);
		p.Cnd_mfg_no_input_flg.addAllListener(p);
		p.Cnd_mfg_input_flg.addAllListener(p);
		p.Cnd_purc_tar_out_flg.addAllListener(p);
		p.Cnd_purc_tar_flg.addAllListener(p);
		p.Cnd_purc_no_input_flg.addAllListener(p);
		p.Cnd_purc_input_flg.addAllListener(p);
		p.Cnd_insp_tar_out_flg.addAllListener(p);
		p.Cnd_insp_tar_flg.addAllListener(p);
		p.Cnd_insp_no_input_flg.addAllListener(p);
		p.Cnd_insp_input_flg.addAllListener(p);
		p.Cnd_itm_grp_cd1.setListListener(p);
		p.Cnd_itm_grp_cd1.addAllListener(p);
		p.Cnd_itm_grp_nm1.setListListener(p);
		p.Cnd_itm_grp_nm1.addAllListener(p);
		p.Cnd_itm_grp_cd2.setListListener(p);
		p.Cnd_itm_grp_cd2.addAllListener(p);
		p.Cnd_itm_grp_nm2.setListListener(p);
		p.Cnd_itm_grp_nm2.addAllListener(p);
		p.Cnd_itm_grp_cd3.setListListener(p);
		p.Cnd_itm_grp_cd3.addAllListener(p);
		p.Cnd_itm_grp_nm3.setListListener(p);
		p.Cnd_itm_grp_nm3.addAllListener(p);
		p.Cnd_itm_grp_cd4.setListListener(p);
		p.Cnd_itm_grp_cd4.addAllListener(p);
		p.Cnd_itm_grp_nm4.setListListener(p);
		p.Cnd_itm_grp_nm4.addAllListener(p);
		p.Cnd_itm_grp_cd5.setListListener(p);
		p.Cnd_itm_grp_cd5.addAllListener(p);
		p.Cnd_itm_grp_nm5.setListListener(p);
		p.Cnd_itm_grp_nm5.addAllListener(p);
		p.Cnd_itm_grp_cd6.setListListener(p);
		p.Cnd_itm_grp_cd6.addAllListener(p);
		p.Cnd_itm_grp_nm6.setListListener(p);
		p.Cnd_itm_grp_nm6.addAllListener(p);
		p.Cnd_itm_grp_cd7.setListListener(p);
		p.Cnd_itm_grp_cd7.addAllListener(p);
		p.Cnd_itm_grp_nm7.setListListener(p);
		p.Cnd_itm_grp_nm7.addAllListener(p);
		p.Cnd_itm_grp_cd8.setListListener(p);
		p.Cnd_itm_grp_cd8.addAllListener(p);
		p.Cnd_itm_grp_nm8.setListListener(p);
		p.Cnd_itm_grp_nm8.addAllListener(p);
		p.Cnd_itm_grp_cd9.setListListener(p);
		p.Cnd_itm_grp_cd9.addAllListener(p);
		p.Cnd_itm_grp_nm9.setListListener(p);
		p.Cnd_itm_grp_nm9.addAllListener(p);
		p.Cnd_itm_grp_cd10.setListListener(p);
		p.Cnd_itm_grp_cd10.addAllListener(p);
		p.Cnd_itm_grp_nm10.setListListener(p);
		p.Cnd_itm_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_ItmRlsReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Cnd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd1(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Sls]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSls(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Mfg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMfg(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Purc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPurc(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Insp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitInsp(MABCP_ItmRlsReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ItmRlsReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_release_flg.addAllListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_sls_flg.addAllListener(p);
		p.columnDtl_sls_input_flg.addAllListener(p);
		p.columnDtl_cst_upri.addAllListener(p);
		p.columnDtl_cst_upri.setListListener(p);
		p.columnDtl_itm_upri.addAllListener(p);
		p.columnDtl_itm_upri.setListListener(p);
		p.columnDtl_std_upri.addAllListener(p);
		p.columnDtl_std_upri.setListListener(p);
		p.columnDtl_mfg_flg.addAllListener(p);
		p.columnDtl_mfg_input_flg.addAllListener(p);
		p.columnDtl_proc_upri.addAllListener(p);
		p.columnDtl_proc_upri.setListListener(p);
		p.columnDtl_purc_flg.addAllListener(p);
		p.columnDtl_purc_input_flg.addAllListener(p);
		p.columnDtl_purc_upri.addAllListener(p);
		p.columnDtl_purc_upri.setListListener(p);
		p.columnDtl_prov_upri.addAllListener(p);
		p.columnDtl_prov_upri.setListListener(p);
		p.columnDtl_insp_flg.addAllListener(p);
		p.columnDtl_insp_input_flg.addAllListener(p);
		p.columnDtl_memo1_c.addAllListener(p);
		p.columnDtl_memo1_c.setListListener(p);
		p.columnDtl_memo2_c.addAllListener(p);
		p.columnDtl_memo2_c.setListListener(p);
		p.columnDtl_memo3_c.addAllListener(p);
		p.columnDtl_memo3_c.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_release_usr_cd.addAllListener(p);
		p.columnDtl_release_usr_cd.setListListener(p);
		p.columnDtl_release_usr_nm.addAllListener(p);
		p.columnDtl_release_usr_nm.setListListener(p);
		p.columnDtl_release_tm.addAllListener(p);
		p.columnDtl_release_tm.setListListener(p);
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
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_ItmRlsReg p) {
		p.DtlBtn_open_MABCP0310.addAllListener(p);
		p.DtlBtn_open_MABCP0310.setAPMethodName("doDtlBtn_open_MABCP0310");
		p.DtlBtn_open_MABSP1120.addAllListener(p);
		p.DtlBtn_open_MABSP1120.setAPMethodName("doDtlBtn_open_MABSP1120");
		p.DtlBtn_open_MABSP1100.addAllListener(p);
		p.DtlBtn_open_MABSP1100.setAPMethodName("doDtlBtn_open_MABSP1100");
		p.DtlBtn_open_MABSP1110.addAllListener(p);
		p.DtlBtn_open_MABSP1110.setAPMethodName("doDtlBtn_open_MABSP1110");
		p.DtlBtn_open_MABSP1130.addAllListener(p);
		p.DtlBtn_open_MABSP1130.setAPMethodName("doDtlBtn_open_MABSP1130");
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_upd.addAllListener(p);
		p.DtlBtn_upd.setAPMethodName("doDtlBtn_upd");
		p.DtlBtn_upd2.addAllListener(p);
		p.DtlBtn_upd2.setAPMethodName("doDtlBtn_upd2");
		p.DtlBtn_tgt_dt.setListListener(p);
		p.DtlBtn_tgt_dt.addAllListener(p);
		p.DtlBtn_del.addAllListener(p);
		p.DtlBtn_del.setAPMethodName("doDtlBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_ItmRlsReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_ItmRlsReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itmtyp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_tar_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_tar_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_no_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_tar_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_tar_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_no_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_tar_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_tar_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_no_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_tar_out_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_tar_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_no_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_insp_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd1(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Sls]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Sls(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Mfg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mfg(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Purc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Purc(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Insp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Insp(MABCP_ItmRlsReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_ItmRlsReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_release_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_upri.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_release_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_ItmRlsReg p){
		p.DtlBtn_open_MABCP0310.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd2.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.DISABLE);
		p.DtlBtn_term_p_PPanel.Term_term_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_tgt_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlBtn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_ItmRlsReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_itmtyp_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_tar_out_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_tar_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_no_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_tar_out_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_tar_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_no_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_tar_out_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_tar_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_no_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_insp_tar_out_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_insp_tar_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_insp_no_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_insp_input_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd1(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Sls]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Sls(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Mfg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mfg(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Purc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Purc(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Insp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Insp(MABCP_ItmRlsReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_ItmRlsReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, FIX, MCMode.READ_ONLY);
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
		p.columnDtl_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_ItmRlsReg p){
		p.DtlBtn_open_MABCP0310.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd2.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_term_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.DISABLE);
		p.DtlBtn_term_p_PPanel.Term_term_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_tgt_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.DtlBtn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_ItmRlsReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itmtyp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_tar_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_tar_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_no_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_tar_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_tar_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_no_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_tar_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_tar_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_no_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_tar_out_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_tar_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_no_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_insp_input_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd1(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Sls]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Sls(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Mfg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mfg(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Purc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Purc(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Insp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Insp(MABCP_ItmRlsReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_ItmRlsReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_release_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.columnDtl_release_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_ItmRlsReg p){
		p.DtlBtn_open_MABCP0310.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd2.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.DISABLE);
		p.DtlBtn_term_p_PPanel.Term_term_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_tgt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlBtn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_ItmRlsReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itmtyp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_tar_out_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_tar_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_no_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_tar_out_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_tar_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_no_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_tar_out_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_tar_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_no_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_tar_out_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_tar_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_no_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_insp_input_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd1(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Sls]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sls(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Mfg]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mfg(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Purc]ブロックのモードの設定
	 */
	protected static void statusInitREF_Purc(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Insp]ブロックのモードの設定
	 */
	protected static void statusInitREF_Insp(MABCP_ItmRlsReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_ItmRlsReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_ItmRlsReg p){
		p.DtlBtn_open_MABCP0310.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd2.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.DISABLE);
		p.DtlBtn_term_p_PPanel.Term_term_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_tgt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlBtn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitCOST_ScreenOpe(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Top(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Fold(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitCOST_CndTab(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Cnd(MABCP_ItmRlsReg p){
		p.Cnd_ope_Group.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_itmtyp_p_PPanel.putStatus(COST, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(COST, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1_c.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_sls_tar_out_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_sls_tar_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_sls_no_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_sls_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_mfg_tar_out_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_mfg_tar_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_mfg_no_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_mfg_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_purc_tar_out_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_purc_tar_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_purc_no_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_purc_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_insp_tar_out_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_insp_tar_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_insp_no_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_insp_input_flg.putMode(p, COST, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, COST, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, COST, MCMode.ENABLE);

	}

	/**
	 * [COST]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Tab1(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Tab2(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Ctrl(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Cnd1(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Sls]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Sls(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Mfg]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Mfg(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Purc]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Purc(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Insp]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Insp(MABCP_ItmRlsReg p){

	}

	/**
	 * [COST]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitCOST_Dtl(MABCP_ItmRlsReg p){
		p.columnDtl_check.putMode(p, COST, MCMode.REQUIRED);
		p.columnDtl_release_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(COST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_cst_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_itm_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_std_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_proc_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_purc_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_prov_upri.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, COST, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, COST, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, COST, MCMode.ENABLE);
		p.columnDtl_release_usr_cd.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, COST, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, COST, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, COST, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, COST, MCMode.INVISIBLE);

	}

	/**
	 * [COST]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitCOST_DtlBtn(MABCP_ItmRlsReg p){
		p.DtlBtn_open_MABCP0310.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, COST, MCMode.INVISIBLE);
		p.DtlBtn_upd2.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_term_p_PPanel.putStatus(COST, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.DtlBtn_term_p_PPanel.Term_term_nm.putMode(p, COST, MCMode.INVISIBLE);
		p.DtlBtn_tgt_dt.putMode(p, COST, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, COST, MCMode.DISABLE);

	}

	/**
	 * [COST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitCOST_EastBtn(MABCP_ItmRlsReg p){

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
		MABCP_ItmRlsReg_MC.setTableConfigDtl((MABCP_ItmRlsReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ItmRlsReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0400.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_release_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.release_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABC.MABCP0400.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0400.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_sls_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_flg);
		p.columnDtl_sls_input_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.sls_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_input_flg);
		p.columnDtl_cst_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.cst_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_upri);
		p.columnDtl_itm_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.itm_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_upri);
		p.columnDtl_std_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.std_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_upri);
		p.columnDtl_mfg_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.mfg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_flg);
		p.columnDtl_mfg_input_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.mfg_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_input_flg);
		p.columnDtl_proc_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.proc_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri);
		p.columnDtl_purc_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_flg);
		p.columnDtl_purc_input_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.purc_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_input_flg);
		p.columnDtl_purc_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.purc_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri);
		p.columnDtl_prov_upri.setMeta(mcframe.clientMABC.MABCP0400.DtlR.prov_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_upri);
		p.columnDtl_insp_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.insp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_flg);
		p.columnDtl_insp_input_flg.setMeta(mcframe.clientMABC.MABCP0400.DtlR.insp_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_input_flg);
		p.columnDtl_memo1_c.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo1_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1_c);
		p.columnDtl_memo2_c.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo2_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2_c);
		p.columnDtl_memo3_c.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo3_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3_c);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0400.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_release_usr_cd.setMeta(mcframe.clientMABC.MABCP0400.DtlR.release_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_usr_cd);
		p.columnDtl_release_usr_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.release_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_usr_nm);
		p.columnDtl_release_tm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.release_tm_META);
		p.columnDtl_release_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_release_tm);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0400.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0400.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0400.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0400.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMABC.MABCP0400.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMABC.MABCP0400.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_release_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd1.getListConfig().setPutter(getCnd_itm_grp_cd1_ListPutter());
		Cnd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd2.getListConfig().setPutter(getCnd_itm_grp_cd2_ListPutter());
		Cnd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd3.getListConfig().setPutter(getCnd_itm_grp_cd3_ListPutter());
		Cnd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd4.getListConfig().setPutter(getCnd_itm_grp_cd4_ListPutter());
		Cnd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd5.getListConfig().setPutter(getCnd_itm_grp_cd5_ListPutter());
		Cnd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd6.getListConfig().setPutter(getCnd_itm_grp_cd6_ListPutter());
		Cnd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd7.getListConfig().setPutter(getCnd_itm_grp_cd7_ListPutter());
		Cnd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd8.getListConfig().setPutter(getCnd_itm_grp_cd8_ListPutter());
		Cnd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd9.getListConfig().setPutter(getCnd_itm_grp_cd9_ListPutter());
		Cnd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd10.getListConfig().setPutter(getCnd_itm_grp_cd10_ListPutter());
		columnDtl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ.getListConfig().setPutter(getDtl_itm_typ_ListPutter());
		columnDtl_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ_d_cd.getListConfig().setPutter(getDtl_itm_typ_d_cd_ListPutter());
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
	 * この画面を[COST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setCOSTStatus() {
		status = COST;
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
		else if (COST.equals(status)) {
			setCOSTStatus();
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
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_itm_grp_cd1) return getCnd_itm_grp_cd1(row, info);
		if(combo == Cnd_itm_grp_cd2) return getCnd_itm_grp_cd2(row, info);
		if(combo == Cnd_itm_grp_cd3) return getCnd_itm_grp_cd3(row, info);
		if(combo == Cnd_itm_grp_cd4) return getCnd_itm_grp_cd4(row, info);
		if(combo == Cnd_itm_grp_cd5) return getCnd_itm_grp_cd5(row, info);
		if(combo == Cnd_itm_grp_cd6) return getCnd_itm_grp_cd6(row, info);
		if(combo == Cnd_itm_grp_cd7) return getCnd_itm_grp_cd7(row, info);
		if(combo == Cnd_itm_grp_cd8) return getCnd_itm_grp_cd8(row, info);
		if(combo == Cnd_itm_grp_cd9) return getCnd_itm_grp_cd9(row, info);
		if(combo == Cnd_itm_grp_cd10) return getCnd_itm_grp_cd10(row, info);
		if(combo == columnDtl_itm_typ) return getDtl_itm_typ(row, info);
		if(combo == columnDtl_itm_typ_d_cd) return getDtl_itm_typ_d_cd(row, info);
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
		else if (ap == DtlBtn_open_MABCP0310) doDtlBtn_open_MABCP0310(info);
		else if (ap == DtlBtn_open_MABSP1120) doDtlBtn_open_MABSP1120(info);
		else if (ap == DtlBtn_open_MABSP1100) doDtlBtn_open_MABSP1100(info);
		else if (ap == DtlBtn_open_MABSP1110) doDtlBtn_open_MABSP1110(info);
		else if (ap == DtlBtn_open_MABSP1130) doDtlBtn_open_MABSP1130(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_upd2) doDtlBtn_upd2(info);
		else if (ap == DtlBtn_del) doDtlBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABCP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABCP0310(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1120(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1100]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1100(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1110(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1130(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd2(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del(MCEventInfo info);

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
		if (vc == CndTabTab) return doCndTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_release_flg_off) return doCnd_release_flg_off_VC(info);
		if (vc == Cnd_release_flg_on) return doCnd_release_flg_on_VC(info);
		if (vc == Cnd_memo1_c) return doCnd_memo1_c_VC(info);
		if (vc == Cnd_memo2_c) return doCnd_memo2_c_VC(info);
		if (vc == Cnd_memo3_c) return doCnd_memo3_c_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_sls_tar_out_flg) return doCnd_sls_tar_out_flg_VC(info);
		if (vc == Cnd_sls_tar_flg) return doCnd_sls_tar_flg_VC(info);
		if (vc == Cnd_sls_no_input_flg) return doCnd_sls_no_input_flg_VC(info);
		if (vc == Cnd_sls_input_flg) return doCnd_sls_input_flg_VC(info);
		if (vc == Cnd_mfg_tar_out_flg) return doCnd_mfg_tar_out_flg_VC(info);
		if (vc == Cnd_mfg_tar_flg) return doCnd_mfg_tar_flg_VC(info);
		if (vc == Cnd_mfg_no_input_flg) return doCnd_mfg_no_input_flg_VC(info);
		if (vc == Cnd_mfg_input_flg) return doCnd_mfg_input_flg_VC(info);
		if (vc == Cnd_purc_tar_out_flg) return doCnd_purc_tar_out_flg_VC(info);
		if (vc == Cnd_purc_tar_flg) return doCnd_purc_tar_flg_VC(info);
		if (vc == Cnd_purc_no_input_flg) return doCnd_purc_no_input_flg_VC(info);
		if (vc == Cnd_purc_input_flg) return doCnd_purc_input_flg_VC(info);
		if (vc == Cnd_insp_tar_out_flg) return doCnd_insp_tar_out_flg_VC(info);
		if (vc == Cnd_insp_tar_flg) return doCnd_insp_tar_flg_VC(info);
		if (vc == Cnd_insp_no_input_flg) return doCnd_insp_no_input_flg_VC(info);
		if (vc == Cnd_insp_input_flg) return doCnd_insp_input_flg_VC(info);
		if (vc == Cnd_itm_grp_cd1) return doCnd_itm_grp_cd1_VC(info);
		if (vc == Cnd_itm_grp_nm1) return doCnd_itm_grp_nm1_VC(info);
		if (vc == Cnd_itm_grp_cd2) return doCnd_itm_grp_cd2_VC(info);
		if (vc == Cnd_itm_grp_nm2) return doCnd_itm_grp_nm2_VC(info);
		if (vc == Cnd_itm_grp_cd3) return doCnd_itm_grp_cd3_VC(info);
		if (vc == Cnd_itm_grp_nm3) return doCnd_itm_grp_nm3_VC(info);
		if (vc == Cnd_itm_grp_cd4) return doCnd_itm_grp_cd4_VC(info);
		if (vc == Cnd_itm_grp_nm4) return doCnd_itm_grp_nm4_VC(info);
		if (vc == Cnd_itm_grp_cd5) return doCnd_itm_grp_cd5_VC(info);
		if (vc == Cnd_itm_grp_nm5) return doCnd_itm_grp_nm5_VC(info);
		if (vc == Cnd_itm_grp_cd6) return doCnd_itm_grp_cd6_VC(info);
		if (vc == Cnd_itm_grp_nm6) return doCnd_itm_grp_nm6_VC(info);
		if (vc == Cnd_itm_grp_cd7) return doCnd_itm_grp_cd7_VC(info);
		if (vc == Cnd_itm_grp_nm7) return doCnd_itm_grp_nm7_VC(info);
		if (vc == Cnd_itm_grp_cd8) return doCnd_itm_grp_cd8_VC(info);
		if (vc == Cnd_itm_grp_nm8) return doCnd_itm_grp_nm8_VC(info);
		if (vc == Cnd_itm_grp_cd9) return doCnd_itm_grp_cd9_VC(info);
		if (vc == Cnd_itm_grp_nm9) return doCnd_itm_grp_nm9_VC(info);
		if (vc == Cnd_itm_grp_cd10) return doCnd_itm_grp_cd10_VC(info);
		if (vc == Cnd_itm_grp_nm10) return doCnd_itm_grp_nm10_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_release_flg) return doDtl_release_flg_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_sls_flg) return doDtl_sls_flg_VC(info);
		if (vc == columnDtl_sls_input_flg) return doDtl_sls_input_flg_VC(info);
		if (vc == columnDtl_cst_upri) return doDtl_cst_upri_VC(info);
		if (vc == columnDtl_itm_upri) return doDtl_itm_upri_VC(info);
		if (vc == columnDtl_std_upri) return doDtl_std_upri_VC(info);
		if (vc == columnDtl_mfg_flg) return doDtl_mfg_flg_VC(info);
		if (vc == columnDtl_mfg_input_flg) return doDtl_mfg_input_flg_VC(info);
		if (vc == columnDtl_proc_upri) return doDtl_proc_upri_VC(info);
		if (vc == columnDtl_purc_flg) return doDtl_purc_flg_VC(info);
		if (vc == columnDtl_purc_input_flg) return doDtl_purc_input_flg_VC(info);
		if (vc == columnDtl_purc_upri) return doDtl_purc_upri_VC(info);
		if (vc == columnDtl_prov_upri) return doDtl_prov_upri_VC(info);
		if (vc == columnDtl_insp_flg) return doDtl_insp_flg_VC(info);
		if (vc == columnDtl_insp_input_flg) return doDtl_insp_input_flg_VC(info);
		if (vc == columnDtl_memo1_c) return doDtl_memo1_c_VC(info);
		if (vc == columnDtl_memo2_c) return doDtl_memo2_c_VC(info);
		if (vc == columnDtl_memo3_c) return doDtl_memo3_c_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_release_usr_cd) return doDtl_release_usr_cd_VC(info);
		if (vc == columnDtl_release_usr_nm) return doDtl_release_usr_nm_VC(info);
		if (vc == columnDtl_release_tm) return doDtl_release_tm_VC(info);
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
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == DtlBtn_tgt_dt) return doDtlBtn_tgt_dt_VC(info);
		return true;
	}

	/**
	 * [CndTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCndTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_c_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_tar_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_tar_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_tar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_tar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_no_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_no_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_tar_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_tar_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_tar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_tar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_no_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_no_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_tar_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_tar_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_tar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_tar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_no_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_no_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_tar_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_tar_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_tar_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_tar_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_no_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_no_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm10_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_upri_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_c_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[release_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[release_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_tm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlBtn]パネルの[tgt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlBtn_tgt_dt_VC(MCEventInfo info){
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
		if (nc == CndTabTab) doCndTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_release_flg_off) doCnd_release_flg_off_NC(info);
		else if (nc == Cnd_release_flg_on) doCnd_release_flg_on_NC(info);
		else if (nc == Cnd_memo1_c) doCnd_memo1_c_NC(info);
		else if (nc == Cnd_memo2_c) doCnd_memo2_c_NC(info);
		else if (nc == Cnd_memo3_c) doCnd_memo3_c_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_sls_tar_out_flg) doCnd_sls_tar_out_flg_NC(info);
		else if (nc == Cnd_sls_tar_flg) doCnd_sls_tar_flg_NC(info);
		else if (nc == Cnd_sls_no_input_flg) doCnd_sls_no_input_flg_NC(info);
		else if (nc == Cnd_sls_input_flg) doCnd_sls_input_flg_NC(info);
		else if (nc == Cnd_mfg_tar_out_flg) doCnd_mfg_tar_out_flg_NC(info);
		else if (nc == Cnd_mfg_tar_flg) doCnd_mfg_tar_flg_NC(info);
		else if (nc == Cnd_mfg_no_input_flg) doCnd_mfg_no_input_flg_NC(info);
		else if (nc == Cnd_mfg_input_flg) doCnd_mfg_input_flg_NC(info);
		else if (nc == Cnd_purc_tar_out_flg) doCnd_purc_tar_out_flg_NC(info);
		else if (nc == Cnd_purc_tar_flg) doCnd_purc_tar_flg_NC(info);
		else if (nc == Cnd_purc_no_input_flg) doCnd_purc_no_input_flg_NC(info);
		else if (nc == Cnd_purc_input_flg) doCnd_purc_input_flg_NC(info);
		else if (nc == Cnd_insp_tar_out_flg) doCnd_insp_tar_out_flg_NC(info);
		else if (nc == Cnd_insp_tar_flg) doCnd_insp_tar_flg_NC(info);
		else if (nc == Cnd_insp_no_input_flg) doCnd_insp_no_input_flg_NC(info);
		else if (nc == Cnd_insp_input_flg) doCnd_insp_input_flg_NC(info);
		else if (nc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_release_flg) doDtl_release_flg_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_sls_flg) doDtl_sls_flg_NC(info);
		else if (nc == columnDtl_sls_input_flg) doDtl_sls_input_flg_NC(info);
		else if (nc == columnDtl_cst_upri) doDtl_cst_upri_NC(info);
		else if (nc == columnDtl_itm_upri) doDtl_itm_upri_NC(info);
		else if (nc == columnDtl_std_upri) doDtl_std_upri_NC(info);
		else if (nc == columnDtl_mfg_flg) doDtl_mfg_flg_NC(info);
		else if (nc == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NC(info);
		else if (nc == columnDtl_proc_upri) doDtl_proc_upri_NC(info);
		else if (nc == columnDtl_purc_flg) doDtl_purc_flg_NC(info);
		else if (nc == columnDtl_purc_input_flg) doDtl_purc_input_flg_NC(info);
		else if (nc == columnDtl_purc_upri) doDtl_purc_upri_NC(info);
		else if (nc == columnDtl_prov_upri) doDtl_prov_upri_NC(info);
		else if (nc == columnDtl_insp_flg) doDtl_insp_flg_NC(info);
		else if (nc == columnDtl_insp_input_flg) doDtl_insp_input_flg_NC(info);
		else if (nc == columnDtl_memo1_c) doDtl_memo1_c_NC(info);
		else if (nc == columnDtl_memo2_c) doDtl_memo2_c_NC(info);
		else if (nc == columnDtl_memo3_c) doDtl_memo3_c_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_release_usr_cd) doDtl_release_usr_cd_NC(info);
		else if (nc == columnDtl_release_usr_nm) doDtl_release_usr_nm_NC(info);
		else if (nc == columnDtl_release_tm) doDtl_release_tm_NC(info);
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
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == DtlBtn_tgt_dt) doDtlBtn_tgt_dt_NC(info);
	}

	/**
	 * [CndTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_tar_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_no_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_no_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_no_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_no_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_no_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_no_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_c_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[tgt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_tgt_dt_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CndTabTab) doCndTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_release_flg_off) doCnd_release_flg_off_NE(info);
		else if (ne == Cnd_release_flg_on) doCnd_release_flg_on_NE(info);
		else if (ne == Cnd_memo1_c) doCnd_memo1_c_NE(info);
		else if (ne == Cnd_memo2_c) doCnd_memo2_c_NE(info);
		else if (ne == Cnd_memo3_c) doCnd_memo3_c_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_sls_tar_out_flg) doCnd_sls_tar_out_flg_NE(info);
		else if (ne == Cnd_sls_tar_flg) doCnd_sls_tar_flg_NE(info);
		else if (ne == Cnd_sls_no_input_flg) doCnd_sls_no_input_flg_NE(info);
		else if (ne == Cnd_sls_input_flg) doCnd_sls_input_flg_NE(info);
		else if (ne == Cnd_mfg_tar_out_flg) doCnd_mfg_tar_out_flg_NE(info);
		else if (ne == Cnd_mfg_tar_flg) doCnd_mfg_tar_flg_NE(info);
		else if (ne == Cnd_mfg_no_input_flg) doCnd_mfg_no_input_flg_NE(info);
		else if (ne == Cnd_mfg_input_flg) doCnd_mfg_input_flg_NE(info);
		else if (ne == Cnd_purc_tar_out_flg) doCnd_purc_tar_out_flg_NE(info);
		else if (ne == Cnd_purc_tar_flg) doCnd_purc_tar_flg_NE(info);
		else if (ne == Cnd_purc_no_input_flg) doCnd_purc_no_input_flg_NE(info);
		else if (ne == Cnd_purc_input_flg) doCnd_purc_input_flg_NE(info);
		else if (ne == Cnd_insp_tar_out_flg) doCnd_insp_tar_out_flg_NE(info);
		else if (ne == Cnd_insp_tar_flg) doCnd_insp_tar_flg_NE(info);
		else if (ne == Cnd_insp_no_input_flg) doCnd_insp_no_input_flg_NE(info);
		else if (ne == Cnd_insp_input_flg) doCnd_insp_input_flg_NE(info);
		else if (ne == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_release_flg) doDtl_release_flg_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_sls_flg) doDtl_sls_flg_NE(info);
		else if (ne == columnDtl_sls_input_flg) doDtl_sls_input_flg_NE(info);
		else if (ne == columnDtl_cst_upri) doDtl_cst_upri_NE(info);
		else if (ne == columnDtl_itm_upri) doDtl_itm_upri_NE(info);
		else if (ne == columnDtl_std_upri) doDtl_std_upri_NE(info);
		else if (ne == columnDtl_mfg_flg) doDtl_mfg_flg_NE(info);
		else if (ne == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NE(info);
		else if (ne == columnDtl_proc_upri) doDtl_proc_upri_NE(info);
		else if (ne == columnDtl_purc_flg) doDtl_purc_flg_NE(info);
		else if (ne == columnDtl_purc_input_flg) doDtl_purc_input_flg_NE(info);
		else if (ne == columnDtl_purc_upri) doDtl_purc_upri_NE(info);
		else if (ne == columnDtl_prov_upri) doDtl_prov_upri_NE(info);
		else if (ne == columnDtl_insp_flg) doDtl_insp_flg_NE(info);
		else if (ne == columnDtl_insp_input_flg) doDtl_insp_input_flg_NE(info);
		else if (ne == columnDtl_memo1_c) doDtl_memo1_c_NE(info);
		else if (ne == columnDtl_memo2_c) doDtl_memo2_c_NE(info);
		else if (ne == columnDtl_memo3_c) doDtl_memo3_c_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_release_usr_cd) doDtl_release_usr_cd_NE(info);
		else if (ne == columnDtl_release_usr_nm) doDtl_release_usr_nm_NE(info);
		else if (ne == columnDtl_release_tm) doDtl_release_tm_NE(info);
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
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == DtlBtn_tgt_dt) doDtlBtn_tgt_dt_NE(info);
	}

	/**
	 * [CndTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_tar_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_no_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_no_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_no_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_no_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_no_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_no_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_c_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[release_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[tgt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_tgt_dt_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CndTabTab) doCndTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_release_flg_off) doCnd_release_flg_off_NX(info);
		else if (nx == Cnd_release_flg_on) doCnd_release_flg_on_NX(info);
		else if (nx == Cnd_memo1_c) doCnd_memo1_c_NX(info);
		else if (nx == Cnd_memo2_c) doCnd_memo2_c_NX(info);
		else if (nx == Cnd_memo3_c) doCnd_memo3_c_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_sls_tar_out_flg) doCnd_sls_tar_out_flg_NX(info);
		else if (nx == Cnd_sls_tar_flg) doCnd_sls_tar_flg_NX(info);
		else if (nx == Cnd_sls_no_input_flg) doCnd_sls_no_input_flg_NX(info);
		else if (nx == Cnd_sls_input_flg) doCnd_sls_input_flg_NX(info);
		else if (nx == Cnd_mfg_tar_out_flg) doCnd_mfg_tar_out_flg_NX(info);
		else if (nx == Cnd_mfg_tar_flg) doCnd_mfg_tar_flg_NX(info);
		else if (nx == Cnd_mfg_no_input_flg) doCnd_mfg_no_input_flg_NX(info);
		else if (nx == Cnd_mfg_input_flg) doCnd_mfg_input_flg_NX(info);
		else if (nx == Cnd_purc_tar_out_flg) doCnd_purc_tar_out_flg_NX(info);
		else if (nx == Cnd_purc_tar_flg) doCnd_purc_tar_flg_NX(info);
		else if (nx == Cnd_purc_no_input_flg) doCnd_purc_no_input_flg_NX(info);
		else if (nx == Cnd_purc_input_flg) doCnd_purc_input_flg_NX(info);
		else if (nx == Cnd_insp_tar_out_flg) doCnd_insp_tar_out_flg_NX(info);
		else if (nx == Cnd_insp_tar_flg) doCnd_insp_tar_flg_NX(info);
		else if (nx == Cnd_insp_no_input_flg) doCnd_insp_no_input_flg_NX(info);
		else if (nx == Cnd_insp_input_flg) doCnd_insp_input_flg_NX(info);
		else if (nx == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_release_flg) doDtl_release_flg_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_sls_flg) doDtl_sls_flg_NX(info);
		else if (nx == columnDtl_sls_input_flg) doDtl_sls_input_flg_NX(info);
		else if (nx == columnDtl_cst_upri) doDtl_cst_upri_NX(info);
		else if (nx == columnDtl_itm_upri) doDtl_itm_upri_NX(info);
		else if (nx == columnDtl_std_upri) doDtl_std_upri_NX(info);
		else if (nx == columnDtl_mfg_flg) doDtl_mfg_flg_NX(info);
		else if (nx == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NX(info);
		else if (nx == columnDtl_proc_upri) doDtl_proc_upri_NX(info);
		else if (nx == columnDtl_purc_flg) doDtl_purc_flg_NX(info);
		else if (nx == columnDtl_purc_input_flg) doDtl_purc_input_flg_NX(info);
		else if (nx == columnDtl_purc_upri) doDtl_purc_upri_NX(info);
		else if (nx == columnDtl_prov_upri) doDtl_prov_upri_NX(info);
		else if (nx == columnDtl_insp_flg) doDtl_insp_flg_NX(info);
		else if (nx == columnDtl_insp_input_flg) doDtl_insp_input_flg_NX(info);
		else if (nx == columnDtl_memo1_c) doDtl_memo1_c_NX(info);
		else if (nx == columnDtl_memo2_c) doDtl_memo2_c_NX(info);
		else if (nx == columnDtl_memo3_c) doDtl_memo3_c_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_release_usr_cd) doDtl_release_usr_cd_NX(info);
		else if (nx == columnDtl_release_usr_nm) doDtl_release_usr_nm_NX(info);
		else if (nx == columnDtl_release_tm) doDtl_release_tm_NX(info);
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
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == DtlBtn_tgt_dt) doDtlBtn_tgt_dt_NX(info);
	}

	/**
	 * [CndTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sls_tar_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_no_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_no_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_tar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_tar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_no_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_no_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_no_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_no_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_tar_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_tar_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_no_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_no_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_c_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[release_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[tgt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_tgt_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_memo1_c) doCnd_memo1_c_LC(info);
		else if (lc == Cnd_memo2_c) doCnd_memo2_c_LC(info);
		else if (lc == Cnd_memo3_c) doCnd_memo3_c_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_cst_upri) doDtl_cst_upri_LC(info);
		else if (lc == columnDtl_itm_upri) doDtl_itm_upri_LC(info);
		else if (lc == columnDtl_std_upri) doDtl_std_upri_LC(info);
		else if (lc == columnDtl_proc_upri) doDtl_proc_upri_LC(info);
		else if (lc == columnDtl_purc_upri) doDtl_purc_upri_LC(info);
		else if (lc == columnDtl_prov_upri) doDtl_prov_upri_LC(info);
		else if (lc == columnDtl_memo1_c) doDtl_memo1_c_LC(info);
		else if (lc == columnDtl_memo2_c) doDtl_memo2_c_LC(info);
		else if (lc == columnDtl_memo3_c) doDtl_memo3_c_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_release_usr_cd) doDtl_release_usr_cd_LC(info);
		else if (lc == columnDtl_release_usr_nm) doDtl_release_usr_nm_LC(info);
		else if (lc == columnDtl_release_tm) doDtl_release_tm_LC(info);
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
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == DtlBtn_tgt_dt) doDtlBtn_tgt_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[memo1_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_c_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlBtn]パネルの[tgt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlBtn_tgt_dt_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ]の作成メソッド
	 */
	public MCList getDtl_itm_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getDtl_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0400.Srch01")) {
			return new MA_MABCL0400_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0400.Upd01")) {
			return new MA_MABCL0400_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0400.Del01")) {
			return new MA_MABCL0400_Del01Bridge();
		}
		if (id.equals("MA.MABCL0400.Upd02")) {
			return new MA_MABCL0400_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0400_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0400_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0400_Srch01Bridge() {
			p_MA_MABCL0400_Srch01 = new MCParam(PDef.MA_MABCL0400_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0400_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0400.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class));

			p_MA_MABCL0400_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0400_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0400_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0400_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0400_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0400.CndR up0() {
			return (mcframe.clientMABC.MABCP0400.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0400.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0400.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0400_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0400_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0400.DtlR>)p_MA_MABCL0400_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0400_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0400_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0400_Upd01Bridge() {
			p_MA_MABCL0400_Upd01 = new MCParam(PDef.MA_MABCL0400_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0400_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class));
			// Down

			p_MA_MABCL0400_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0400_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0400_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0400_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0400_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0400.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0400.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0400_Upd01;
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
	/**
	 * [MA_MABCL0400_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0400_Del01;

		/** コンストラクタ */
		protected MA_MABCL0400_Del01Bridge() {
			p_MA_MABCL0400_Del01 = new MCParam(PDef.MA_MABCL0400_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0400_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class));
			// Down

			p_MA_MABCL0400_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0400_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0400_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0400_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0400_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0400.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0400.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0400_Del01;
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
	/**
	 * [MA_MABCL0400_Upd02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0400_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0400_Upd02;

		/** コンストラクタ */
		protected MA_MABCL0400_Upd02Bridge() {
			p_MA_MABCL0400_Upd02 = new MCParam(PDef.MA_MABCL0400_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0400_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0400.DtlR.class));
			param.addUpBlock(mcframe.clientMABC.MABCP0400.DtlBtnR.create());
			// Down

			p_MA_MABCL0400_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0400_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0400_Upd02.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0400_Upd02.addUpBlock(getDtlBtnR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0400_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0400_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0400.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0400.DtlR>)up(0);
		}
		protected mcframe.clientMABC.MABCP0400.DtlBtnR up1() {
			return (mcframe.clientMABC.MABCP0400.DtlBtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0400_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtlBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}