package mcframe.clientMABS.MABSP1130;

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
import mcframe.clientMABS.MABSP1130.MABSP_InspItmReg_MC.MA_MABSL1130_Srch01Caller;
import mcframe.clientMABS.MABSP1130.MABSP_InspItmReg_MC.MA_MABSL1130_Upd01Caller;

/**
 * 画面"MABSP_InspItmReg"パネルクラスです。<p>
 *
 * 検査品関連の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_InspItmReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABSP1130";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public MCLabel Hdr_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField Hdr_unit_nm = null;
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public MCCheckBox Hdr_lmt_ctl_flg = null;
	public MCLabel Hdr_lmt_ctl_categ_Label = null;
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public MCTextField Hdr_lmt_ctl_categ = null;
	public MCLabel Hdr_asset_mng_typ_Label = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCTextField Hdr_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCTextField Hdr_asset_mng_typ_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_dec_place = null;
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public MCLabel Hdr_insp_lbl = null;
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public MCCheckBox Hdr_insp_flg = null;
	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public MCCheckBox Hdr_insp_input_flg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Hdr_upd = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCTextField Hdr_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sublot_mng_typ = null;
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public MCCheckBox Hdr_def_insp_aprv_flg = null;
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_def_insp_aprv_role_cd = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCCheckBox Hdr_check = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1]ブロック関連のField定義
	public MCPanel Wrk1Panel = null;
	// [Wrk1]ブロックの項目のField定義
	// [Wrk1Top]ブロック関連のField定義
	public MCPanel Wrk1TopPanel = null;
	// [Wrk1Top]ブロックの項目のField定義
	// [Wrk11]ブロック関連のField定義
	public MCPanel Wrk11Panel = null;
	// [Wrk11]ブロックの項目のField定義
	// [Wrk11SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk11SetDtHdrPanel = null;
	// [Wrk11SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk11SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk11SetDtHdr_st_dt = null;
	public MCLabel Wrk11SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk11SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk11SetDtHdr_set_dt = null;
	// [Wrk11Dtl]ブロック関連のField定義
	public MCPanel Wrk11DtlPanel = null;
	public MCScrollPane Wrk11DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1130.Wrk11DtlR> Wrk11DtlTable = null;
	// [Wrk11Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk11Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk11Dtl_itm_cd;// [Wrk11Dtl]の[itm_p.itm_cd]を[columnWrk11Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk11Dtl_itm_sub1;// [Wrk11Dtl]の[itm_p.itm_sub1]を[columnWrk11Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk11Dtl_itm_sub2;// [Wrk11Dtl]の[itm_p.itm_sub2]を[columnWrk11Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk11Dtl_itm_sub3;// [Wrk11Dtl]の[itm_p.itm_sub3]を[columnWrk11Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_ptn_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk11Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk11Dtl_st_dt_key;// [Wrk11Dtl]の[dt_p.st_dt_key]を[columnWrk11Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk11Dtl_st_dt;// [Wrk11Dtl]の[dt_p.st_dt]を[columnWrk11Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk11Dtl_end_dt;// [Wrk11Dtl]の[dt_p.end_dt]を[columnWrk11Dtl_end_dt]としてエイリアス定義。
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_mtd_typ_nm = null;
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_lt = null;
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_insp_std_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk11Dtl_qty_p_PPanel;
	public MCColumnConfig columnWrk11Dtl_spl_qty;// [Wrk11Dtl]の[qty_p.qty]を[columnWrk11Dtl_spl_qty]としてエイリアス定義。
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_std_req_flg = null;
	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_std_cnf_req_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk11Dtl_del_ts = null;
	// [Wrk11DtlBtn]ブロック関連のField定義
	public MCPanel Wrk11DtlBtnPanel = null;
	// [Wrk11DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk11DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk11DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk11DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk11DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk11DtlBtn_rcopy = null;
	// [Wrk1Btm]ブロック関連のField定義
	public MCPanel Wrk1BtmPanel = null;
	// [Wrk1Btm]ブロックの項目のField定義
	// [Wrk12Tab]ブロック関連のField定義
	public MCPanel Wrk12TabPanel = null;
	public MCTabbedPane Wrk12TabTab = null;
	// [Wrk12Tab]ブロックの項目のField定義
	// [Wrk12]ブロック関連のField定義
	public MCPanel Wrk12Panel = null;
	// [Wrk12]ブロックの項目のField定義
	// [Wrk12SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk12SetDtHdrPanel = null;
	// [Wrk12SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk12SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk12SetDtHdr_st_dt = null;
	public MCLabel Wrk12SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk12SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk12SetDtHdr_set_dt = null;
	// [Wrk12Dtl]ブロック関連のField定義
	public MCPanel Wrk12DtlPanel = null;
	public MCScrollPane Wrk12DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1130.Wrk12DtlR> Wrk12DtlTable = null;
	// [Wrk12Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk12Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_itm_cd;// [Wrk12Dtl]の[itm_p.itm_cd]を[columnWrk12Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk12Dtl_itm_sub1;// [Wrk12Dtl]の[itm_p.itm_sub1]を[columnWrk12Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk12Dtl_itm_sub2;// [Wrk12Dtl]の[itm_p.itm_sub2]を[columnWrk12Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk12Dtl_itm_sub3;// [Wrk12Dtl]の[itm_p.itm_sub3]を[columnWrk12Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_ptn_cd = null;
	/**
	 * Inspection sequence 検査順序.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_seq = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk12Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_st_dt_key;// [Wrk12Dtl]の[dt_p.st_dt_key]を[columnWrk12Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk12Dtl_st_dt;// [Wrk12Dtl]の[dt_p.st_dt]を[columnWrk12Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk12Dtl_end_dt;// [Wrk12Dtl]の[dt_p.end_dt]を[columnWrk12Dtl_end_dt]としてエイリアス定義。
	/**
	 * Inspection checkpoint cd. 検査項目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_point_cd = null;
	/**
	 * Inspection checkpoint name 検査項目名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_point_nm = null;
	/**
	 * Prior inspection copy type 先行検査引継区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_pre_insp_inf_typ = null;
	/**
	 * Prior inspection copy type name 先行検査引継区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_pre_insp_inf_typ_nm = null;
	/**
	 * Qualitative/quantitative type 定性定量区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_qlqn_typ = null;
	/**
	 * Qualitative/quantitative type name 定性定量区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_insp_qlqn_typ_nm = null;
	/**
	 * Qualitative specific value 定性規格値.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ql_std_val = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_unit_nm = null;
	/**
	 * Quantitative integer digits 定量値整数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_qn_int_digit = null;
	/**
	 * Quantitative decimal digits 定量値小数部桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_qn_int_frac = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Wrk12Dtl_qn_out_min_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_qn_out_min;// [Wrk12Dtl]の[qn_out_min_p.qn_insp_val]を[columnWrk12Dtl_qn_out_min]としてエイリアス定義。
	/**
	 * Sign type (Lower limit of external specification) 外規格下限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_out_min_typ = null;
	/**
	 * Sign type name (Lower limit of external specification) 外規格下限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_out_min_typ_nm = null;
	/**
	 * Sign type (Upper limit of external specification) 外規格上限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_out_max_typ = null;
	/**
	 * Sign type name (Upper limit of external specification) 外規格上限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_out_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Wrk12Dtl_qn_out_max_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_qn_out_max;// [Wrk12Dtl]の[qn_out_max_p.qn_insp_val]を[columnWrk12Dtl_qn_out_max]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Wrk12Dtl_qn_in_min_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_qn_in_min;// [Wrk12Dtl]の[qn_in_min_p.qn_insp_val]を[columnWrk12Dtl_qn_in_min]としてエイリアス定義。
	/**
	 * Sign type (Lower limit of internal specification) 内規格下限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_in_min_typ = null;
	/**
	 * Sign type name (Lower limit of internal specification) 内規格下限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_in_min_typ_nm = null;
	/**
	 * Sign type (Upper limit of internal specification) 内規格上限符号区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_in_max_typ = null;
	/**
	 * Sign type name (Upper limit of internal specification) 内規格上限符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_sign_in_max_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D Wrk12Dtl_qn_in_max_p_PPanel;
	public MCColumnConfig columnWrk12Dtl_qn_in_max;// [Wrk12Dtl]の[qn_in_max_p.qn_insp_val]を[columnWrk12Dtl_qn_in_max]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk12Dtl_del_ts = null;
	// [Wrk12DtlBtn]ブロック関連のField定義
	public MCPanel Wrk12DtlBtnPanel = null;
	// [Wrk12DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk12DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk12DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk12DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk12DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk12DtlBtn_rcopy = null;
	// [Wrk2]ブロック関連のField定義
	public MCPanel Wrk2Panel = null;
	// [Wrk2]ブロックの項目のField定義
	// [Wrk2SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk2SetDtHdrPanel = null;
	// [Wrk2SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk2SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk2SetDtHdr_st_dt = null;
	public MCLabel Wrk2SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk2SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk2SetDtHdr_set_dt = null;
	// [Wrk2Dtl]ブロック関連のField定義
	public MCPanel Wrk2DtlPanel = null;
	public MCScrollPane Wrk2DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1130.Wrk2DtlR> Wrk2DtlTable = null;
	// [Wrk2Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk2Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_itm_cd;// [Wrk2Dtl]の[itm_p.itm_cd]を[columnWrk2Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub1;// [Wrk2Dtl]の[itm_p.itm_sub1]を[columnWrk2Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub2;// [Wrk2Dtl]の[itm_p.itm_sub2]を[columnWrk2Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub3;// [Wrk2Dtl]の[itm_p.itm_sub3]を[columnWrk2Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_maker_nm = null;
	/**
	 * Shipping point factory/distribution warehouse cd. 出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_from_site_cd = null;
	/**
	 * Shipping point factory/distribution warehouse name 出荷元工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_from_site_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_to_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_to_site_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk2Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_st_dt_key;// [Wrk2Dtl]の[dt_p.st_dt_key]を[columnWrk2Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_st_dt;// [Wrk2Dtl]の[dt_p.st_dt]を[columnWrk2Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_end_dt;// [Wrk2Dtl]の[dt_p.end_dt]を[columnWrk2Dtl_end_dt]としてエイリアス定義。
	/**
	 * Not for inspection 検査対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_no_insp_flg = null;
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_insp_ptn_cd = null;
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_insp_ptn_nm = null;
	/**
	 * Not for market release decision 市場出荷判定対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_no_mrkt_judg_flg = null;
	/**
	 * Not for factory release approval 工場出荷承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_no_plnt_aprv_flg = null;
	/**
	 * Not for inspection approval 検査承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_no_insp_aprv_flg = null;
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lmt_dt_frm_typ_nm = null;
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_vld_pd = null;
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lmt_pd = null;
	/**
	 * Valid period (At time of the extension) 有効期間（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lot_insp_vld_pd = null;
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_calc_pd_typ = null;
	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_calc_pd_typ_nm = null;
	/**
	 * Expiration base date type (Extended) 期限起算日区分（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lot_insp_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name (Extended) 期限起算日区分名（延長時）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm = null;
	/**
	 * Inspection order timing type 検査指図タイミング区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_insp_inst_issue_typ = null;
	/**
	 * Inspection order timing type name 検査指図タイミング区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_insp_inst_issue_typ_nm = null;
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_insp_offst = null;
	/**
	 * Report issued at inspection order 検査指図時成績書発行.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_inst_rslt_issue_flg = null;
	/**
	 * Prior inspection valid 先行検査有効.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_pre_insp_valid_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_ts = null;
	// [Wrk2DtlBtn]ブロック関連のField定義
	public MCPanel Wrk2DtlBtnPanel = null;
	// [Wrk2DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_rcopy = null;
	// [Wrk3]ブロック関連のField定義
	public MCPanel Wrk3Panel = null;
	// [Wrk3]ブロックの項目のField定義
	// [Wrk3Dtl]ブロック関連のField定義
	public MCPanel Wrk3DtlPanel = null;
	public MCScrollPane Wrk3DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1130.Wrk3DtlR> Wrk3DtlTable = null;
	// [Wrk3Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk3Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_itm_cd;// [Wrk3Dtl]の[itm_p.itm_cd]を[columnWrk3Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub1;// [Wrk3Dtl]の[itm_p.itm_sub1]を[columnWrk3Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub2;// [Wrk3Dtl]の[itm_p.itm_sub2]を[columnWrk3Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub3;// [Wrk3Dtl]の[itm_p.itm_sub3]を[columnWrk3Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_site_nm = null;
	/**
	 * For inspection approval 検査承認対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_insp_aprv_flg = null;
	/**
	 * Inspection approval role cd. 検査承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_insp_aprv_role_cd = null;
	/**
	 * Inspection approval role name 検査承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_insp_aprv_role_nm = null;
	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_in_prmt_insp_flg = null;
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ntfy_nm = null;
	/**
	 * Numbering ID 発番ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_num_id = null;
	/**
	 * For factory release approval 工場出荷承認対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_plnt_aprv_flg = null;
	/**
	 * Factory release approval role cd. 工場出荷承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_plnt_aprv_role_cd = null;
	/**
	 * Factory release approval role name 工場出荷承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_plnt_aprv_role_nm = null;
	/**
	 * For mfg. approval 製造承認対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_mfg_aprv_flg = null;
	/**
	 * Mfg. approval role cd. 製造承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_mfg_aprv_role_cd = null;
	/**
	 * Mfg. approval role name 製造承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_mfg_aprv_role_nm = null;
	/**
	 * Lot No. transfer at transport receipt 移送入荷時ロットＮＯ振替.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_xfr_lot_flg = null;
	/**
	 * Allow inspecting lot shipment 検査中ロット出荷許可.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_so_prmt_insp_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_ts = null;
	// [Wrk3DtlBtn]ブロック関連のField定義
	public MCPanel Wrk3DtlBtnPanel = null;
	// [Wrk3DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Item master entry 品目マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0310 = null;
	/**
	 * Item master (Factory/Distribution warehouse) entry 品目マスタ（工場・物流倉庫）登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0350 = null;
	/**
	 * Inspection pattern master entry 検査パタンマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0030 = null;
	/**
	 * Inspection checkpoint master entry 検査項目マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0160 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL1130_Srch01]のCallerの作成 */
	protected MABSP_InspItmReg_MC.MA_MABSL1130_Srch01Caller createMA_MABSL1130_Srch01() {
		MABSP_InspItmReg_MC.MA_MABSL1130_Srch01Caller<MABSP_InspItmReg, MA_MABSL1130_Srch01Bridge>
		caller = ((MABSP_InspItmReg_MC)this).new MA_MABSL1130_Srch01Caller<MABSP_InspItmReg, MA_MABSL1130_Srch01Bridge>(
					(MABSP_InspItmReg)this, new MA_MABSL1130_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL1130_Srch01]の呼び出し */
	protected void callMA_MABSL1130_Srch01() {
		MCCaller caller = createMA_MABSL1130_Srch01();
		caller.exec();
	}
	/** [MA_MABSL1130_Upd01]のCallerの作成 */
	protected MABSP_InspItmReg_MC.MA_MABSL1130_Upd01Caller createMA_MABSL1130_Upd01() {
		MABSP_InspItmReg_MC.MA_MABSL1130_Upd01Caller<MABSP_InspItmReg, MA_MABSL1130_Upd01Bridge>
		caller = ((MABSP_InspItmReg_MC)this).new MA_MABSL1130_Upd01Caller<MABSP_InspItmReg, MA_MABSL1130_Upd01Bridge>(
					(MABSP_InspItmReg)this, new MA_MABSL1130_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL1130_Upd01]の呼び出し */
	protected void callMA_MABSL1130_Upd01() {
		MCCaller caller = createMA_MABSL1130_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1130.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1130.HdrR aHdrR;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.HdrR> aHdrAllL;
	/** [Wrk11SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR aWrk11SetDtHdrR;
	/** [Wrk11Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> aWrk11DtlL;
	/** [Wrk12SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR aWrk12SetDtHdrR;
	/** [Wrk12Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> aWrk12DtlL;
	/** [Wrk12DtlAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> aWrk12DtlAllL;
	/** [Wrk2SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR aWrk2SetDtHdrR;
	/** [Wrk2Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> aWrk2DtlL;
	/** [Wrk3Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> aWrk3DtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP1130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1130.CndR createCndR() {
		return mcframe.clientMABS.MABSP1130.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABS.MABSP1130.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1130.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1130.HdrR createHdrR() {
		return mcframe.clientMABS.MABSP1130.HdrR.create();
	}

	/**
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABS.MABSP1130.HdrR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.HdrR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABS.MABSP1130.HdrR createHdrAllR() {
		return mcframe.clientMABS.MABSP1130.HdrR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.HdrR> createHdrAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.HdrR.class);
	}

	/**
	 * 項目コピーによってaWrk11SetDtHdrRを設定します。
	 *
	 * aWrk11SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk11SetDtHdrR
	 */
	public void setWrk11SetDtHdrR(mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk11SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk11SetDtHdr]ブロックのコンテナaWrk11SetDtHdrRを返します。
	 *
	 * @return Wrk11SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR getWrk11SetDtHdrR() {
		return aWrk11SetDtHdrR;
	}

	/**
	 * aWrk11SetDtHdrRを作成します。
	 *
	 * @return Wrk11SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR createWrk11SetDtHdrR() {
		return mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk11DtlLを設定します。
	 *
	 * aWrk11DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk11DtlL
	 */
	public void setWrk11DtlL(MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> aList) {
		if (getWrk11DtlL() != aList) {
			getWrk11DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk11Dtl]ブロックのコンテナaWrk11DtlLを返します。
	 *
	 * @return Wrk11DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> getWrk11DtlL() {
		return aWrk11DtlL;
	}

	/**
	 * aWrk11DtlRを作成します。
	 *
	 * @return Wrk11DtlR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk11DtlR createWrk11DtlR() {
		return mcframe.clientMABS.MABSP1130.Wrk11DtlR.create();
	}

	/**
	 * aWrk11DtlLを作成します。
	 *
	 * @return Wrk11DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> createWrk11DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.class);
	}

	/**
	 * Wrk11DtlTableを初期化します。
	 */
	protected void createWrk11DtlTable(){
		if(Wrk11DtlTable == null){
			Wrk11DtlTable = beansFactory.createTable2("Wrk11Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk12SetDtHdrRを設定します。
	 *
	 * aWrk12SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk12SetDtHdrR
	 */
	public void setWrk12SetDtHdrR(mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk12SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk12SetDtHdr]ブロックのコンテナaWrk12SetDtHdrRを返します。
	 *
	 * @return Wrk12SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR getWrk12SetDtHdrR() {
		return aWrk12SetDtHdrR;
	}

	/**
	 * aWrk12SetDtHdrRを作成します。
	 *
	 * @return Wrk12SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR createWrk12SetDtHdrR() {
		return mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk12DtlLを設定します。
	 *
	 * aWrk12DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk12DtlL
	 */
	public void setWrk12DtlL(MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> aList) {
		if (getWrk12DtlL() != aList) {
			getWrk12DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk12Dtl]ブロックのコンテナaWrk12DtlLを返します。
	 *
	 * @return Wrk12DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> getWrk12DtlL() {
		return aWrk12DtlL;
	}

	/**
	 * aWrk12DtlRを作成します。
	 *
	 * @return Wrk12DtlR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk12DtlR createWrk12DtlR() {
		return mcframe.clientMABS.MABSP1130.Wrk12DtlR.create();
	}

	/**
	 * aWrk12DtlLを作成します。
	 *
	 * @return Wrk12DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> createWrk12DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.class);
	}

	/**
	 * Wrk12DtlTableを初期化します。
	 */
	protected void createWrk12DtlTable(){
		if(Wrk12DtlTable == null){
			Wrk12DtlTable = beansFactory.createTable2("Wrk12Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk12DtlAllLを設定します。
	 *
	 * aWrk12DtlAllLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk12DtlAllL
	 */
	public void setWrk12DtlAllL(MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> aList) {
		if (getWrk12DtlAllL() != aList) {
			getWrk12DtlAllL().setAll(aList);
		}
	}

	/**
	 * [Wrk12DtlAll]ブロックのコンテナaWrk12DtlAllLを返します。
	 *
	 * @return Wrk12DtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> getWrk12DtlAllL() {
		return aWrk12DtlAllL;
	}

	/**
	 * aWrk12DtlAllRを作成します。
	 *
	 * @return Wrk12DtlAllR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk12DtlR createWrk12DtlAllR() {
		return mcframe.clientMABS.MABSP1130.Wrk12DtlR.create();
	}

	/**
	 * aWrk12DtlAllLを作成します。
	 *
	 * @return Wrk12DtlAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> createWrk12DtlAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.class);
	}

	/**
	 * 項目コピーによってaWrk2SetDtHdrRを設定します。
	 *
	 * aWrk2SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk2SetDtHdrR
	 */
	public void setWrk2SetDtHdrR(mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk2SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk2SetDtHdr]ブロックのコンテナaWrk2SetDtHdrRを返します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR getWrk2SetDtHdrR() {
		return aWrk2SetDtHdrR;
	}

	/**
	 * aWrk2SetDtHdrRを作成します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR createWrk2SetDtHdrR() {
		return mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk2DtlLを設定します。
	 *
	 * aWrk2DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk2DtlL
	 */
	public void setWrk2DtlL(MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> aList) {
		if (getWrk2DtlL() != aList) {
			getWrk2DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk2Dtl]ブロックのコンテナaWrk2DtlLを返します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> getWrk2DtlL() {
		return aWrk2DtlL;
	}

	/**
	 * aWrk2DtlRを作成します。
	 *
	 * @return Wrk2DtlR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk2DtlR createWrk2DtlR() {
		return mcframe.clientMABS.MABSP1130.Wrk2DtlR.create();
	}

	/**
	 * aWrk2DtlLを作成します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> createWrk2DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.class);
	}

	/**
	 * Wrk2DtlTableを初期化します。
	 */
	protected void createWrk2DtlTable(){
		if(Wrk2DtlTable == null){
			Wrk2DtlTable = beansFactory.createTable2("Wrk2Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk3DtlLを設定します。
	 *
	 * aWrk3DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk3DtlL
	 */
	public void setWrk3DtlL(MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> aList) {
		if (getWrk3DtlL() != aList) {
			getWrk3DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk3Dtl]ブロックのコンテナaWrk3DtlLを返します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> getWrk3DtlL() {
		return aWrk3DtlL;
	}

	/**
	 * aWrk3DtlRを作成します。
	 *
	 * @return Wrk3DtlR
	 */
	public mcframe.clientMABS.MABSP1130.Wrk3DtlR createWrk3DtlR() {
		return mcframe.clientMABS.MABSP1130.Wrk3DtlR.create();
	}

	/**
	 * aWrk3DtlLを作成します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> createWrk3DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1130.Wrk3DtlR.class);
	}

	/**
	 * Wrk3DtlTableを初期化します。
	 */
	protected void createWrk3DtlTable(){
		if(Wrk3DtlTable == null){
			Wrk3DtlTable = beansFactory.createTable2("Wrk3Dtl.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getHdrAllL())) ret.add(getHdrAllL());
		if(!MCCollectionUtil.contains(ret, getWrk11SetDtHdrR())) ret.add(getWrk11SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk11DtlL())) ret.add(getWrk11DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk12SetDtHdrR())) ret.add(getWrk12SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk12DtlL())) ret.add(getWrk12DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk12DtlAllL())) ret.add(getWrk12DtlAllL());
		if(!MCCollectionUtil.contains(ret, getWrk2SetDtHdrR())) ret.add(getWrk2SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk2DtlL())) ret.add(getWrk2DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk3DtlL())) ret.add(getWrk3DtlL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getHdrAllL()) return "HdrAll";
		if(aCnt == getWrk11SetDtHdrR()) return "Wrk11SetDtHdr";
		if(aCnt == getWrk11DtlL()) return "Wrk11Dtl";
		if(aCnt == getWrk12SetDtHdrR()) return "Wrk12SetDtHdr";
		if(aCnt == getWrk12DtlL()) return "Wrk12Dtl";
		if(aCnt == getWrk12DtlAllL()) return "Wrk12DtlAll";
		if(aCnt == getWrk2SetDtHdrR()) return "Wrk2SetDtHdr";
		if(aCnt == getWrk2DtlL()) return "Wrk2Dtl";
		if(aCnt == getWrk3DtlL()) return "Wrk3Dtl";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("HdrAll")) return getHdrAllL();
		if(bId.equals("Wrk11SetDtHdr")) return getWrk11SetDtHdrR();
		if(bId.equals("Wrk11Dtl")) return getWrk11DtlL();
		if(bId.equals("Wrk12SetDtHdr")) return getWrk12SetDtHdrR();
		if(bId.equals("Wrk12Dtl")) return getWrk12DtlL();
		if(bId.equals("Wrk12DtlAll")) return getWrk12DtlAllL();
		if(bId.equals("Wrk2SetDtHdr")) return getWrk2SetDtHdrR();
		if(bId.equals("Wrk2Dtl")) return getWrk2DtlL();
		if(bId.equals("Wrk3Dtl")) return getWrk3DtlL();
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(DtlTabPanel);
		ret.add(Wrk1Panel);
		ret.add(Wrk1TopPanel);
		ret.add(Wrk11Panel);
		ret.add(Wrk11SetDtHdrPanel);
		ret.add(Wrk11DtlPanel);
		ret.add(Wrk11DtlBtnPanel);
		ret.add(Wrk1BtmPanel);
		ret.add(Wrk12TabPanel);
		ret.add(Wrk12Panel);
		ret.add(Wrk12SetDtHdrPanel);
		ret.add(Wrk12DtlPanel);
		ret.add(Wrk12DtlBtnPanel);
		ret.add(Wrk2Panel);
		ret.add(Wrk2SetDtHdrPanel);
		ret.add(Wrk2DtlPanel);
		ret.add(Wrk2DtlBtnPanel);
		ret.add(Wrk3Panel);
		ret.add(Wrk3DtlPanel);
		ret.add(Wrk3DtlBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_InspItmReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aHdrAllL = createHdrAllL();
		aWrk11SetDtHdrR = createWrk11SetDtHdrR();
		aWrk11DtlL = createWrk11DtlL();
		aWrk12SetDtHdrR = createWrk12SetDtHdrR();
		aWrk12DtlL = createWrk12DtlL();
		aWrk12DtlAllL = createWrk12DtlAllL();
		aWrk2SetDtHdrR = createWrk2SetDtHdrR();
		aWrk2DtlL = createWrk2DtlL();
		aWrk3DtlL = createWrk3DtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_InspItmReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aHdrAllL = createHdrAllL();
		aWrk11SetDtHdrR = createWrk11SetDtHdrR();
		aWrk11DtlL = createWrk11DtlL();
		createWrk11DtlTable();
		Wrk11DtlTable.setRowName(name);
		aWrk12SetDtHdrR = createWrk12SetDtHdrR();
		aWrk12DtlL = createWrk12DtlL();
		createWrk12DtlTable();
		Wrk12DtlTable.setRowName(name);
		aWrk12DtlAllL = createWrk12DtlAllL();
		aWrk2SetDtHdrR = createWrk2SetDtHdrR();
		aWrk2DtlL = createWrk2DtlL();
		createWrk2DtlTable();
		Wrk2DtlTable.setRowName(name);
		aWrk3DtlL = createWrk3DtlL();
		createWrk3DtlTable();
		Wrk3DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_InspItmReg_MC.jbCreateScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateTop((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateFold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateCnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateCtrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateTbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateDtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateWrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbCreateBtn((MABSP_InspItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_InspItmReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_InspItmReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_InspItmReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_InspItmReg p) {
		p.Cnd_dt_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt());
		p.Cnd_dt_PPanel.setName("Cnd.dt");
		p.Cnd_st_dt_fr = p.Cnd_dt_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
		p.Cnd_itm_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm());
		p.Cnd_itm_PPanel.setName("Cnd.itm");
		p.Cnd_itm_cd = p.Cnd_itm_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_InspItmReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABSP_InspItmReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_InspItmReg p) {
		p.Hdr_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().itm_p());
		p.Hdr_itm_p_PPanel.setName("Hdr.itm_p");
		p.Hdr_itm_cd = p.Hdr_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_itm_cd.addAliasName("Hdr.itm_cd", p);
		p.Hdr_itm_sub1 = p.Hdr_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_itm_sub1.addAliasName("Hdr.itm_sub1", p);
		p.Hdr_itm_sub2 = p.Hdr_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_itm_sub2.addAliasName("Hdr.itm_sub2", p);
		p.Hdr_itm_sub3 = p.Hdr_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_itm_sub3.addAliasName("Hdr.itm_sub3", p);
		p.Hdr_itm_nm = p.Hdr_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_itm_nm.addAliasName("Hdr.itm_nm", p);
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk1Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Top(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk11]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk11(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk11SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk11SetDtHdr(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk11Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk11Dtl(MABSP_InspItmReg p) {
		p.Wrk11Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.$itm_p);
		p.Wrk11Dtl_itm_p_PPanel.setName("Wrk11Dtl.itm_p");
		p.columnWrk11Dtl_itm_cd = p.Wrk11Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk11Dtl_itm_cd.addAliasName("Wrk11Dtl.itm_cd", p);
		p.columnWrk11Dtl_itm_sub1 = p.Wrk11Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk11Dtl_itm_sub1.addAliasName("Wrk11Dtl.itm_sub1", p);
		p.columnWrk11Dtl_itm_sub2 = p.Wrk11Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk11Dtl_itm_sub2.addAliasName("Wrk11Dtl.itm_sub2", p);
		p.columnWrk11Dtl_itm_sub3 = p.Wrk11Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk11Dtl_itm_sub3.addAliasName("Wrk11Dtl.itm_sub3", p);
		p.Wrk11Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.$dt_p);
		p.Wrk11Dtl_dt_p_PPanel.setName("Wrk11Dtl.dt_p");
		p.columnWrk11Dtl_st_dt_key = p.Wrk11Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk11Dtl_st_dt_key.addAliasName("Wrk11Dtl.st_dt_key", p);
		p.columnWrk11Dtl_st_dt = p.Wrk11Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk11Dtl_st_dt.addAliasName("Wrk11Dtl.st_dt", p);
		p.columnWrk11Dtl_end_dt = p.Wrk11Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk11Dtl_end_dt.addAliasName("Wrk11Dtl.end_dt", p);
		p.Wrk11Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.$qty_p);
		p.Wrk11Dtl_qty_p_PPanel.setName("Wrk11Dtl.qty_p");
		p.columnWrk11Dtl_spl_qty = p.Wrk11Dtl_qty_p_PPanel.columnQty_qty;
		p.columnWrk11Dtl_spl_qty.addAliasName("Wrk11Dtl.spl_qty", p);
	}

	/**
	 * [Wrk11DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk11DtlBtn(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk1Btm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Btm(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk12Tab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk12Tab(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk12]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk12(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk12SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk12SetDtHdr(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk12Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk12Dtl(MABSP_InspItmReg p) {
		p.Wrk12Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$itm_p);
		p.Wrk12Dtl_itm_p_PPanel.setName("Wrk12Dtl.itm_p");
		p.columnWrk12Dtl_itm_cd = p.Wrk12Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk12Dtl_itm_cd.addAliasName("Wrk12Dtl.itm_cd", p);
		p.columnWrk12Dtl_itm_sub1 = p.Wrk12Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk12Dtl_itm_sub1.addAliasName("Wrk12Dtl.itm_sub1", p);
		p.columnWrk12Dtl_itm_sub2 = p.Wrk12Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk12Dtl_itm_sub2.addAliasName("Wrk12Dtl.itm_sub2", p);
		p.columnWrk12Dtl_itm_sub3 = p.Wrk12Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk12Dtl_itm_sub3.addAliasName("Wrk12Dtl.itm_sub3", p);
		p.Wrk12Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$dt_p);
		p.Wrk12Dtl_dt_p_PPanel.setName("Wrk12Dtl.dt_p");
		p.columnWrk12Dtl_st_dt_key = p.Wrk12Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk12Dtl_st_dt_key.addAliasName("Wrk12Dtl.st_dt_key", p);
		p.columnWrk12Dtl_st_dt = p.Wrk12Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk12Dtl_st_dt.addAliasName("Wrk12Dtl.st_dt", p);
		p.columnWrk12Dtl_end_dt = p.Wrk12Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk12Dtl_end_dt.addAliasName("Wrk12Dtl.end_dt", p);
		p.Wrk12Dtl_qn_out_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$qn_out_min_p);
		p.Wrk12Dtl_qn_out_min_p_PPanel.setName("Wrk12Dtl.qn_out_min_p");
		p.columnWrk12Dtl_qn_out_min = p.Wrk12Dtl_qn_out_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnWrk12Dtl_qn_out_min.addAliasName("Wrk12Dtl.qn_out_min", p);
		p.Wrk12Dtl_qn_out_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$qn_out_max_p);
		p.Wrk12Dtl_qn_out_max_p_PPanel.setName("Wrk12Dtl.qn_out_max_p");
		p.columnWrk12Dtl_qn_out_max = p.Wrk12Dtl_qn_out_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnWrk12Dtl_qn_out_max.addAliasName("Wrk12Dtl.qn_out_max", p);
		p.Wrk12Dtl_qn_in_min_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$qn_in_min_p);
		p.Wrk12Dtl_qn_in_min_p_PPanel.setName("Wrk12Dtl.qn_in_min_p");
		p.columnWrk12Dtl_qn_in_min = p.Wrk12Dtl_qn_in_min_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnWrk12Dtl_qn_in_min.addAliasName("Wrk12Dtl.qn_in_min", p);
		p.Wrk12Dtl_qn_in_max_p_PPanel = mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.$qn_in_max_p);
		p.Wrk12Dtl_qn_in_max_p_PPanel.setName("Wrk12Dtl.qn_in_max_p");
		p.columnWrk12Dtl_qn_in_max = p.Wrk12Dtl_qn_in_max_p_PPanel.columnQnInspVal_qn_insp_val;
		p.columnWrk12Dtl_qn_in_max.addAliasName("Wrk12Dtl.qn_in_max", p);
	}

	/**
	 * [Wrk12DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk12DtlBtn(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2SetDtHdr(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk2Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Dtl(MABSP_InspItmReg p) {
		p.Wrk2Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.$itm_p);
		p.Wrk2Dtl_itm_p_PPanel.setName("Wrk2Dtl.itm_p");
		p.columnWrk2Dtl_itm_cd = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk2Dtl_itm_cd.addAliasName("Wrk2Dtl.itm_cd", p);
		p.columnWrk2Dtl_itm_sub1 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk2Dtl_itm_sub1.addAliasName("Wrk2Dtl.itm_sub1", p);
		p.columnWrk2Dtl_itm_sub2 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk2Dtl_itm_sub2.addAliasName("Wrk2Dtl.itm_sub2", p);
		p.columnWrk2Dtl_itm_sub3 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk2Dtl_itm_sub3.addAliasName("Wrk2Dtl.itm_sub3", p);
		p.Wrk2Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.$dt_p);
		p.Wrk2Dtl_dt_p_PPanel.setName("Wrk2Dtl.dt_p");
		p.columnWrk2Dtl_st_dt_key = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk2Dtl_st_dt_key.addAliasName("Wrk2Dtl.st_dt_key", p);
		p.columnWrk2Dtl_st_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk2Dtl_st_dt.addAliasName("Wrk2Dtl.st_dt", p);
		p.columnWrk2Dtl_end_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk2Dtl_end_dt.addAliasName("Wrk2Dtl.end_dt", p);
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2DtlBtn(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3(MABSP_InspItmReg p) {
	}

	/**
	 * [Wrk3Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Dtl(MABSP_InspItmReg p) {
		p.Wrk3Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1130.Wrk3DtlR.$itm_p);
		p.Wrk3Dtl_itm_p_PPanel.setName("Wrk3Dtl.itm_p");
		p.columnWrk3Dtl_itm_cd = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk3Dtl_itm_cd.addAliasName("Wrk3Dtl.itm_cd", p);
		p.columnWrk3Dtl_itm_sub1 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk3Dtl_itm_sub1.addAliasName("Wrk3Dtl.itm_sub1", p);
		p.columnWrk3Dtl_itm_sub2 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk3Dtl_itm_sub2.addAliasName("Wrk3Dtl.itm_sub2", p);
		p.columnWrk3Dtl_itm_sub3 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk3Dtl_itm_sub3.addAliasName("Wrk3Dtl.itm_sub3", p);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3DtlBtn(MABSP_InspItmReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_InspItmReg p) {
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

	
	/** [Wrk11Dtl_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Wrk11Dtl_insp_ptn_cd_p = null;

	/**
	 * [Wrk11Dtl_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk11Dtl_insp_ptn_cd_ListPutter() {
		if (Wrk11Dtl_insp_ptn_cd_p == null) {
			Wrk11Dtl_insp_ptn_cd_p = createWrk11Dtl_insp_ptn_cd_ListPutter(columnWrk11Dtl_insp_ptn_cd, "insp_ptn_cd", "insp_ptn_nm");

		}
		return Wrk11Dtl_insp_ptn_cd_p;
	}
	
	
	/** [Wrk11Dtl_insp_mtd_typ_ListPutter]の定義 */
	private MCListPutter Wrk11Dtl_insp_mtd_typ_p = null;

	/**
	 * [Wrk11Dtl_insp_mtd_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk11Dtl_insp_mtd_typ_ListPutter() {
		if (Wrk11Dtl_insp_mtd_typ_p == null) {
			Wrk11Dtl_insp_mtd_typ_p = createWrk11Dtl_insp_mtd_typ_ListPutter(columnWrk11Dtl_insp_mtd_typ, "insp_mtd_typ", "insp_mtd_typ_nm");

		}
		return Wrk11Dtl_insp_mtd_typ_p;
	}
	
	
	/** [Wrk12Dtl_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_insp_ptn_cd_p = null;

	/**
	 * [Wrk12Dtl_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_insp_ptn_cd_ListPutter() {
		if (Wrk12Dtl_insp_ptn_cd_p == null) {
			Wrk12Dtl_insp_ptn_cd_p = createWrk12Dtl_insp_ptn_cd_ListPutter(columnWrk12Dtl_insp_ptn_cd, "insp_ptn_cd");

		}
		return Wrk12Dtl_insp_ptn_cd_p;
	}
	
	
	/** [Wrk12Dtl_insp_point_cd_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_insp_point_cd_p = null;

	/**
	 * [Wrk12Dtl_insp_point_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_insp_point_cd_ListPutter() {
		if (Wrk12Dtl_insp_point_cd_p == null) {
			Wrk12Dtl_insp_point_cd_p = createWrk12Dtl_insp_point_cd_ListPutter(columnWrk12Dtl_insp_point_cd, "insp_point_cd", "insp_point_nm","insp_qlqn_typ","unit_cd");

		}
		return Wrk12Dtl_insp_point_cd_p;
	}
	
	
	/** [Wrk12Dtl_pre_insp_inf_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_pre_insp_inf_typ_p = null;

	/**
	 * [Wrk12Dtl_pre_insp_inf_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_pre_insp_inf_typ_ListPutter() {
		if (Wrk12Dtl_pre_insp_inf_typ_p == null) {
			Wrk12Dtl_pre_insp_inf_typ_p = createWrk12Dtl_pre_insp_inf_typ_ListPutter(columnWrk12Dtl_pre_insp_inf_typ, "pre_insp_inf_typ", "pre_insp_inf_typ_nm");

		}
		return Wrk12Dtl_pre_insp_inf_typ_p;
	}
	
	
	/** [Wrk12Dtl_insp_qlqn_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_insp_qlqn_typ_p = null;

	/**
	 * [Wrk12Dtl_insp_qlqn_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_insp_qlqn_typ_ListPutter() {
		if (Wrk12Dtl_insp_qlqn_typ_p == null) {
			Wrk12Dtl_insp_qlqn_typ_p = createWrk12Dtl_insp_qlqn_typ_ListPutter(columnWrk12Dtl_insp_qlqn_typ, "insp_qlqn_typ", "insp_qlqn_typ_nm");

		}
		return Wrk12Dtl_insp_qlqn_typ_p;
	}
	
	
	/** [Wrk12Dtl_unit_cd_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_unit_cd_p = null;

	/**
	 * [Wrk12Dtl_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_unit_cd_ListPutter() {
		if (Wrk12Dtl_unit_cd_p == null) {
			Wrk12Dtl_unit_cd_p = createWrk12Dtl_unit_cd_ListPutter(columnWrk12Dtl_unit_cd, "unit_cd", "unit_nm","qn_int_frac");

		}
		return Wrk12Dtl_unit_cd_p;
	}
	
	
	/** [Wrk12Dtl_sign_out_min_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_sign_out_min_typ_p = null;

	/**
	 * [Wrk12Dtl_sign_out_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_sign_out_min_typ_ListPutter() {
		if (Wrk12Dtl_sign_out_min_typ_p == null) {
			Wrk12Dtl_sign_out_min_typ_p = createWrk12Dtl_sign_out_min_typ_ListPutter(columnWrk12Dtl_sign_out_min_typ, "sign_out_min_typ", "sign_out_min_typ_nm");

		}
		return Wrk12Dtl_sign_out_min_typ_p;
	}
	
	
	/** [Wrk12Dtl_sign_out_max_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_sign_out_max_typ_p = null;

	/**
	 * [Wrk12Dtl_sign_out_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_sign_out_max_typ_ListPutter() {
		if (Wrk12Dtl_sign_out_max_typ_p == null) {
			Wrk12Dtl_sign_out_max_typ_p = createWrk12Dtl_sign_out_max_typ_ListPutter(columnWrk12Dtl_sign_out_max_typ, "sign_out_max_typ", "sign_out_max_typ_nm");

		}
		return Wrk12Dtl_sign_out_max_typ_p;
	}
	
	
	/** [Wrk12Dtl_sign_in_min_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_sign_in_min_typ_p = null;

	/**
	 * [Wrk12Dtl_sign_in_min_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_sign_in_min_typ_ListPutter() {
		if (Wrk12Dtl_sign_in_min_typ_p == null) {
			Wrk12Dtl_sign_in_min_typ_p = createWrk12Dtl_sign_in_min_typ_ListPutter(columnWrk12Dtl_sign_in_min_typ, "sign_in_min_typ", "sign_in_min_typ_nm");

		}
		return Wrk12Dtl_sign_in_min_typ_p;
	}
	
	
	/** [Wrk12Dtl_sign_in_max_typ_ListPutter]の定義 */
	private MCListPutter Wrk12Dtl_sign_in_max_typ_p = null;

	/**
	 * [Wrk12Dtl_sign_in_max_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk12Dtl_sign_in_max_typ_ListPutter() {
		if (Wrk12Dtl_sign_in_max_typ_p == null) {
			Wrk12Dtl_sign_in_max_typ_p = createWrk12Dtl_sign_in_max_typ_ListPutter(columnWrk12Dtl_sign_in_max_typ, "sign_in_max_typ", "sign_in_max_typ_nm");

		}
		return Wrk12Dtl_sign_in_max_typ_p;
	}
	
	
	/** [Wrk2Dtl_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_mfg_loc_cd_p = null;

	/**
	 * [Wrk2Dtl_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_mfg_loc_cd_ListPutter() {
		if (Wrk2Dtl_mfg_loc_cd_p == null) {
			Wrk2Dtl_mfg_loc_cd_p = createWrk2Dtl_mfg_loc_cd_ListPutter(columnWrk2Dtl_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Wrk2Dtl_mfg_loc_cd_p;
	}
	
	
	/** [Wrk2Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_sppl_cd_p = null;

	/**
	 * [Wrk2Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_sppl_cd_ListPutter() {
		if (Wrk2Dtl_sppl_cd_p == null) {
			Wrk2Dtl_sppl_cd_p = createWrk2Dtl_sppl_cd_ListPutter(columnWrk2Dtl_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Wrk2Dtl_sppl_cd_p;
	}
	
	
	/** [Wrk2Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_maker_cd_p = null;

	/**
	 * [Wrk2Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_maker_cd_ListPutter() {
		if (Wrk2Dtl_maker_cd_p == null) {
			Wrk2Dtl_maker_cd_p = createWrk2Dtl_maker_cd_ListPutter(columnWrk2Dtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Wrk2Dtl_maker_cd_p;
	}
	
	
	/** [Wrk2Dtl_from_site_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_from_site_cd_p = null;

	/**
	 * [Wrk2Dtl_from_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_from_site_cd_ListPutter() {
		if (Wrk2Dtl_from_site_cd_p == null) {
			Wrk2Dtl_from_site_cd_p = createWrk2Dtl_from_site_cd_ListPutter(columnWrk2Dtl_from_site_cd, "from_site_cd", "from_site_nm");

		}
		return Wrk2Dtl_from_site_cd_p;
	}
	
	
	/** [Wrk2Dtl_to_site_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_to_site_cd_p = null;

	/**
	 * [Wrk2Dtl_to_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_to_site_cd_ListPutter() {
		if (Wrk2Dtl_to_site_cd_p == null) {
			Wrk2Dtl_to_site_cd_p = createWrk2Dtl_to_site_cd_ListPutter(columnWrk2Dtl_to_site_cd, "to_site_cd", "to_site_nm");

		}
		return Wrk2Dtl_to_site_cd_p;
	}
	
	
	/** [Wrk2Dtl_insp_ptn_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_insp_ptn_cd_p = null;

	/**
	 * [Wrk2Dtl_insp_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_insp_ptn_cd_ListPutter() {
		if (Wrk2Dtl_insp_ptn_cd_p == null) {
			Wrk2Dtl_insp_ptn_cd_p = createWrk2Dtl_insp_ptn_cd_ListPutter(columnWrk2Dtl_insp_ptn_cd, "insp_ptn_cd", "insp_ptn_nm");

		}
		return Wrk2Dtl_insp_ptn_cd_p;
	}
	
	
	/** [Wrk2Dtl_lmt_dt_frm_typ_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_lmt_dt_frm_typ_p = null;

	/**
	 * [Wrk2Dtl_lmt_dt_frm_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_lmt_dt_frm_typ_ListPutter() {
		if (Wrk2Dtl_lmt_dt_frm_typ_p == null) {
			Wrk2Dtl_lmt_dt_frm_typ_p = createWrk2Dtl_lmt_dt_frm_typ_ListPutter(columnWrk2Dtl_lmt_dt_frm_typ, "lmt_dt_frm_typ", "lmt_dt_frm_typ_nm");

		}
		return Wrk2Dtl_lmt_dt_frm_typ_p;
	}
	
	
	/** [Wrk2Dtl_calc_pd_typ_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_calc_pd_typ_p = null;

	/**
	 * [Wrk2Dtl_calc_pd_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_calc_pd_typ_ListPutter() {
		if (Wrk2Dtl_calc_pd_typ_p == null) {
			Wrk2Dtl_calc_pd_typ_p = createWrk2Dtl_calc_pd_typ_ListPutter(columnWrk2Dtl_calc_pd_typ, "calc_pd_typ", "calc_pd_typ_nm");

		}
		return Wrk2Dtl_calc_pd_typ_p;
	}
	
	
	/** [Wrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_lot_insp_lmt_dt_frm_typ_p = null;

	/**
	 * [Wrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter() {
		if (Wrk2Dtl_lot_insp_lmt_dt_frm_typ_p == null) {
			Wrk2Dtl_lot_insp_lmt_dt_frm_typ_p = createWrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter(columnWrk2Dtl_lot_insp_lmt_dt_frm_typ, "lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ_nm");

		}
		return Wrk2Dtl_lot_insp_lmt_dt_frm_typ_p;
	}
	
	
	/** [Wrk2Dtl_insp_inst_issue_typ_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_insp_inst_issue_typ_p = null;

	/**
	 * [Wrk2Dtl_insp_inst_issue_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_insp_inst_issue_typ_ListPutter() {
		if (Wrk2Dtl_insp_inst_issue_typ_p == null) {
			Wrk2Dtl_insp_inst_issue_typ_p = createWrk2Dtl_insp_inst_issue_typ_ListPutter(columnWrk2Dtl_insp_inst_issue_typ, "insp_inst_issue_typ", "insp_inst_issue_typ_nm");

		}
		return Wrk2Dtl_insp_inst_issue_typ_p;
	}
	
	
	/** [Wrk3Dtl_site_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_site_cd_p = null;

	/**
	 * [Wrk3Dtl_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_site_cd_ListPutter() {
		if (Wrk3Dtl_site_cd_p == null) {
			Wrk3Dtl_site_cd_p = createWrk3Dtl_site_cd_ListPutter(columnWrk3Dtl_site_cd, "site_cd", "site_nm");

		}
		return Wrk3Dtl_site_cd_p;
	}
	
	
	/** [Wrk3Dtl_insp_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_insp_aprv_role_cd_p = null;

	/**
	 * [Wrk3Dtl_insp_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_insp_aprv_role_cd_ListPutter() {
		if (Wrk3Dtl_insp_aprv_role_cd_p == null) {
			Wrk3Dtl_insp_aprv_role_cd_p = createWrk3Dtl_insp_aprv_role_cd_ListPutter(columnWrk3Dtl_insp_aprv_role_cd, "insp_aprv_role_cd", "insp_aprv_role_nm");

		}
		return Wrk3Dtl_insp_aprv_role_cd_p;
	}
	
	
	/** [Wrk3Dtl_plnt_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_plnt_aprv_role_cd_p = null;

	/**
	 * [Wrk3Dtl_plnt_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_plnt_aprv_role_cd_ListPutter() {
		if (Wrk3Dtl_plnt_aprv_role_cd_p == null) {
			Wrk3Dtl_plnt_aprv_role_cd_p = createWrk3Dtl_plnt_aprv_role_cd_ListPutter(columnWrk3Dtl_plnt_aprv_role_cd, "plnt_aprv_role_cd", "plnt_aprv_role_nm");

		}
		return Wrk3Dtl_plnt_aprv_role_cd_p;
	}
	
	
	/** [Wrk3Dtl_mfg_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_mfg_aprv_role_cd_p = null;

	/**
	 * [Wrk3Dtl_mfg_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_mfg_aprv_role_cd_ListPutter() {
		if (Wrk3Dtl_mfg_aprv_role_cd_p == null) {
			Wrk3Dtl_mfg_aprv_role_cd_p = createWrk3Dtl_mfg_aprv_role_cd_ListPutter(columnWrk3Dtl_mfg_aprv_role_cd, "mfg_aprv_role_cd", "mfg_aprv_role_nm");

		}
		return Wrk3Dtl_mfg_aprv_role_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_InspItmReg create(){
		MABSP_InspItmReg p = new MABSP_InspItmReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_InspItmReg create(String name){
		MABSP_InspItmReg p = new MABSP_InspItmReg(name);
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
		MABSP_InspItmReg_MC.jbfInitScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitTop((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitFold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitCnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitCtrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitTbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitDtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitWrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbfInitBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitTop((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitFold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitCnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitCtrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitTbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitDtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitWrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.jbInitBtn((MABSP_InspItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_unit_cd_Label = p.beansFactory.createLabel("Hdr.unit_cd_Label");
		p.Hdr_unit_cd = p.beansFactory.createTextField("Hdr.unit_cd");
		p.Hdr_unit_cd.setLabel(p.Hdr_unit_cd_Label);
		p.Hdr_unit_nm = p.beansFactory.createTextField("Hdr.unit_nm");
		p.Hdr_lmt_ctl_flg = p.beansFactory.createCheckBox("Hdr.lmt_ctl_flg");
		p.Hdr_lmt_ctl_categ_Label = p.beansFactory.createLabel("Hdr.lmt_ctl_categ_Label");
		p.Hdr_lmt_ctl_categ = p.beansFactory.createTextField("Hdr.lmt_ctl_categ");
		p.Hdr_lmt_ctl_categ.setLabel(p.Hdr_lmt_ctl_categ_Label);
		p.Hdr_asset_mng_typ_Label = p.beansFactory.createLabel("Hdr.asset_mng_typ_Label");
		p.Hdr_asset_mng_typ = p.beansFactory.createTextField("Hdr.asset_mng_typ");
		p.Hdr_asset_mng_typ.setLabel(p.Hdr_asset_mng_typ_Label);
		p.Hdr_asset_mng_typ_nm = p.beansFactory.createTextField("Hdr.asset_mng_typ_nm");
		p.Hdr_dec_place = p.beansFactory.createNumberField("Hdr.dec_place");
		p.Hdr_insp_lbl = p.beansFactory.createLabel("Hdr.insp_lbl");
		p.Hdr_insp_flg = p.beansFactory.createCheckBox("Hdr.insp_flg");
		p.Hdr_insp_input_flg = p.beansFactory.createCheckBox("Hdr.insp_input_flg");
		p.Hdr_upd = p.beansFactory.createButton("Hdr.upd", "upd");
		p.Hdr_lot_mng_typ = p.beansFactory.createTextField("Hdr.lot_mng_typ");
		p.Hdr_sublot_mng_typ = p.beansFactory.createTextField("Hdr.sublot_mng_typ");
		p.Hdr_def_insp_aprv_flg = p.beansFactory.createCheckBox("Hdr.def_insp_aprv_flg");
		p.Hdr_def_insp_aprv_role_cd = p.beansFactory.createTextField("Hdr.def_insp_aprv_role_cd");
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_check = p.beansFactory.createCheckBox("Hdr.check");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1Panel = p.beansFactory.createPanel("Wrk1");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Top(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1TopPanel = p.beansFactory.createPanel("Wrk1Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk11]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk11(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11Panel = p.beansFactory.createPanel("Wrk11");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk11SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk11SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11SetDtHdrPanel = p.beansFactory.createPanel("Wrk11SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk11SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk11SetDtHdr.st_dt_Label");
		p.Wrk11SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk11SetDtHdr.st_dt");
		p.Wrk11SetDtHdr_st_dt.setLabel(p.Wrk11SetDtHdr_st_dt_Label);
		p.Wrk11SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk11SetDtHdr.end_dt_Label");
		p.Wrk11SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk11SetDtHdr.end_dt");
		p.Wrk11SetDtHdr_end_dt.setLabel(p.Wrk11SetDtHdr_end_dt_Label);
		p.Wrk11SetDtHdr_set_dt = p.beansFactory.createButton("Wrk11SetDtHdr.set_dt");
	}

	/**
	 * [Wrk11Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk11Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11DtlPanel = p.beansFactory.createPanel("Wrk11Dtl");
		p.Wrk11DtlScrollPane = p.beansFactory.createScrollPane("Wrk11Dtl.scroll");
		p.createWrk11DtlTable();
		// ブロックの項目の初期化
		p.columnWrk11Dtl_check = p.beansFactory.createTableColumn("Wrk11Dtl.check", MCColumnType.CHECK);
		p.columnWrk11Dtl_del_flg = p.beansFactory.createTableColumn("Wrk11Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk11Dtl_insp_ptn_cd = p.beansFactory.createTableColumn("Wrk11Dtl.insp_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk11Dtl_insp_ptn_nm = p.beansFactory.createTableColumn("Wrk11Dtl.insp_ptn_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_insp_mtd_typ = p.beansFactory.createTableColumn("Wrk11Dtl.insp_mtd_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk11Dtl_insp_mtd_typ_nm = p.beansFactory.createTableColumn("Wrk11Dtl.insp_mtd_typ_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_insp_lt = p.beansFactory.createTableColumn("Wrk11Dtl.insp_lt", MCColumnType.NUMBER);
		p.columnWrk11Dtl_insp_std_no = p.beansFactory.createTableColumn("Wrk11Dtl.insp_std_no", MCColumnType.TEXT);
		p.columnWrk11Dtl_std_req_flg = p.beansFactory.createTableColumn("Wrk11Dtl.std_req_flg", MCColumnType.CHECK);
		p.columnWrk11Dtl_std_cnf_req_flg = p.beansFactory.createTableColumn("Wrk11Dtl.std_cnf_req_flg", MCColumnType.CHECK);
		p.columnWrk11Dtl_memo1 = p.beansFactory.createTableColumn("Wrk11Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk11Dtl_memo2 = p.beansFactory.createTableColumn("Wrk11Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk11Dtl_memo3 = p.beansFactory.createTableColumn("Wrk11Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk11Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk11Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk11Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk11Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk11Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk11Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk11Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk11Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk11Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk11Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk11Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk11Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk11Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk11Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk11Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk11Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk11Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk11Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk11Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk11Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk11Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk11Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk11Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk11Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk11Dtl_del_ts = p.beansFactory.createTableColumn("Wrk11Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk11DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk11DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11DtlBtnPanel = p.beansFactory.createPanel("Wrk11DtlBtn");
		// ブロックの項目の初期化
		p.Wrk11DtlBtn_select_all = p.beansFactory.createButton("Wrk11DtlBtn.select_all", "no_border");
		p.Wrk11DtlBtn_deselect_all = p.beansFactory.createButton("Wrk11DtlBtn.deselect_all", "no_border");
		p.Wrk11DtlBtn_radd = p.beansFactory.createButton("Wrk11DtlBtn.radd", "no_border");
		p.Wrk11DtlBtn_rdel = p.beansFactory.createButton("Wrk11DtlBtn.rdel", "no_border");
		p.Wrk11DtlBtn_rcopy = p.beansFactory.createButton("Wrk11DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk1Btm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Btm(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1BtmPanel = p.beansFactory.createPanel("Wrk1Btm");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk12Tab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk12Tab(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12TabPanel = p.beansFactory.createPanel("Wrk12Tab");
		p.Wrk12TabTab = p.beansFactory.createTabbedPane("Wrk12Tab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk12]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk12(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12Panel = p.beansFactory.createPanel("Wrk12");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk12SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk12SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12SetDtHdrPanel = p.beansFactory.createPanel("Wrk12SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk12SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk12SetDtHdr.st_dt_Label");
		p.Wrk12SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk12SetDtHdr.st_dt");
		p.Wrk12SetDtHdr_st_dt.setLabel(p.Wrk12SetDtHdr_st_dt_Label);
		p.Wrk12SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk12SetDtHdr.end_dt_Label");
		p.Wrk12SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk12SetDtHdr.end_dt");
		p.Wrk12SetDtHdr_end_dt.setLabel(p.Wrk12SetDtHdr_end_dt_Label);
		p.Wrk12SetDtHdr_set_dt = p.beansFactory.createButton("Wrk12SetDtHdr.set_dt");
	}

	/**
	 * [Wrk12Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk12Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12DtlPanel = p.beansFactory.createPanel("Wrk12Dtl");
		p.Wrk12DtlScrollPane = p.beansFactory.createScrollPane("Wrk12Dtl.scroll");
		p.createWrk12DtlTable();
		// ブロックの項目の初期化
		p.columnWrk12Dtl_check = p.beansFactory.createTableColumn("Wrk12Dtl.check", MCColumnType.CHECK);
		p.columnWrk12Dtl_del_flg = p.beansFactory.createTableColumn("Wrk12Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk12Dtl_insp_ptn_cd = p.beansFactory.createTableColumn("Wrk12Dtl.insp_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_insp_seq = p.beansFactory.createTableColumn("Wrk12Dtl.insp_seq", MCColumnType.NUMBER);
		p.columnWrk12Dtl_insp_point_cd = p.beansFactory.createTableColumn("Wrk12Dtl.insp_point_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_insp_point_nm = p.beansFactory.createTableColumn("Wrk12Dtl.insp_point_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_pre_insp_inf_typ = p.beansFactory.createTableColumn("Wrk12Dtl.pre_insp_inf_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.pre_insp_inf_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_insp_qlqn_typ = p.beansFactory.createTableColumn("Wrk12Dtl.insp_qlqn_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_insp_qlqn_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.insp_qlqn_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_ql_std_val = p.beansFactory.createTableColumn("Wrk12Dtl.ql_std_val", MCColumnType.TEXT);
		p.columnWrk12Dtl_unit_cd = p.beansFactory.createTableColumn("Wrk12Dtl.unit_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_unit_nm = p.beansFactory.createTableColumn("Wrk12Dtl.unit_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_qn_int_digit = p.beansFactory.createTableColumn("Wrk12Dtl.qn_int_digit", MCColumnType.NUMBER);
		p.columnWrk12Dtl_qn_int_frac = p.beansFactory.createTableColumn("Wrk12Dtl.qn_int_frac", MCColumnType.NUMBER);
		p.columnWrk12Dtl_sign_out_min_typ = p.beansFactory.createTableColumn("Wrk12Dtl.sign_out_min_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_sign_out_min_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.sign_out_min_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_sign_out_max_typ = p.beansFactory.createTableColumn("Wrk12Dtl.sign_out_max_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_sign_out_max_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.sign_out_max_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_sign_in_min_typ = p.beansFactory.createTableColumn("Wrk12Dtl.sign_in_min_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_sign_in_min_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.sign_in_min_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_sign_in_max_typ = p.beansFactory.createTableColumn("Wrk12Dtl.sign_in_max_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk12Dtl_sign_in_max_typ_nm = p.beansFactory.createTableColumn("Wrk12Dtl.sign_in_max_typ_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_memo1 = p.beansFactory.createTableColumn("Wrk12Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk12Dtl_memo2 = p.beansFactory.createTableColumn("Wrk12Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk12Dtl_memo3 = p.beansFactory.createTableColumn("Wrk12Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk12Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk12Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk12Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk12Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk12Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk12Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk12Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk12Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk12Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk12Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk12Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk12Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk12Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk12Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk12Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk12Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk12Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk12Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk12Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk12Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk12Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk12Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk12Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk12Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk12Dtl_del_ts = p.beansFactory.createTableColumn("Wrk12Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk12DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk12DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12DtlBtnPanel = p.beansFactory.createPanel("Wrk12DtlBtn");
		// ブロックの項目の初期化
		p.Wrk12DtlBtn_select_all = p.beansFactory.createButton("Wrk12DtlBtn.select_all", "no_border");
		p.Wrk12DtlBtn_deselect_all = p.beansFactory.createButton("Wrk12DtlBtn.deselect_all", "no_border");
		p.Wrk12DtlBtn_radd = p.beansFactory.createButton("Wrk12DtlBtn.radd", "no_border");
		p.Wrk12DtlBtn_rdel = p.beansFactory.createButton("Wrk12DtlBtn.rdel", "no_border");
		p.Wrk12DtlBtn_rcopy = p.beansFactory.createButton("Wrk12DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2Panel = p.beansFactory.createPanel("Wrk2");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2SetDtHdrPanel = p.beansFactory.createPanel("Wrk2SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk2SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk2SetDtHdr.st_dt_Label");
		p.Wrk2SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk2SetDtHdr.st_dt");
		p.Wrk2SetDtHdr_st_dt.setLabel(p.Wrk2SetDtHdr_st_dt_Label);
		p.Wrk2SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk2SetDtHdr.end_dt_Label");
		p.Wrk2SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk2SetDtHdr.end_dt");
		p.Wrk2SetDtHdr_end_dt.setLabel(p.Wrk2SetDtHdr_end_dt_Label);
		p.Wrk2SetDtHdr_set_dt = p.beansFactory.createButton("Wrk2SetDtHdr.set_dt");
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel = p.beansFactory.createPanel("Wrk2Dtl");
		p.Wrk2DtlScrollPane = p.beansFactory.createScrollPane("Wrk2Dtl.scroll");
		p.createWrk2DtlTable();
		// ブロックの項目の初期化
		p.columnWrk2Dtl_check = p.beansFactory.createTableColumn("Wrk2Dtl.check", MCColumnType.CHECK);
		p.columnWrk2Dtl_del_flg = p.beansFactory.createTableColumn("Wrk2Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_mfg_loc_cd = p.beansFactory.createTableColumn("Wrk2Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_mfg_loc_nm = p.beansFactory.createTableColumn("Wrk2Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_sppl_cd = p.beansFactory.createTableColumn("Wrk2Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_sppl_nm = p.beansFactory.createTableColumn("Wrk2Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_maker_cd = p.beansFactory.createTableColumn("Wrk2Dtl.maker_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_maker_nm = p.beansFactory.createTableColumn("Wrk2Dtl.maker_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_from_site_cd = p.beansFactory.createTableColumn("Wrk2Dtl.from_site_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_from_site_nm = p.beansFactory.createTableColumn("Wrk2Dtl.from_site_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_to_site_cd = p.beansFactory.createTableColumn("Wrk2Dtl.to_site_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_to_site_nm = p.beansFactory.createTableColumn("Wrk2Dtl.to_site_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_no_insp_flg = p.beansFactory.createTableColumn("Wrk2Dtl.no_insp_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_insp_ptn_cd = p.beansFactory.createTableColumn("Wrk2Dtl.insp_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_insp_ptn_nm = p.beansFactory.createTableColumn("Wrk2Dtl.insp_ptn_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_no_mrkt_judg_flg = p.beansFactory.createTableColumn("Wrk2Dtl.no_mrkt_judg_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_no_plnt_aprv_flg = p.beansFactory.createTableColumn("Wrk2Dtl.no_plnt_aprv_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_no_insp_aprv_flg = p.beansFactory.createTableColumn("Wrk2Dtl.no_insp_aprv_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Wrk2Dtl.lmt_dt_frm_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_vld_pd = p.beansFactory.createTableColumn("Wrk2Dtl.vld_pd", MCColumnType.NUMBER);
		p.columnWrk2Dtl_lmt_pd = p.beansFactory.createTableColumn("Wrk2Dtl.lmt_pd", MCColumnType.NUMBER);
		p.columnWrk2Dtl_lot_insp_vld_pd = p.beansFactory.createTableColumn("Wrk2Dtl.lot_insp_vld_pd", MCColumnType.NUMBER);
		p.columnWrk2Dtl_calc_pd_typ = p.beansFactory.createTableColumn("Wrk2Dtl.calc_pd_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_calc_pd_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.calc_pd_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Wrk2Dtl.lot_insp_lmt_dt_frm_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.lot_insp_lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_insp_inst_issue_typ = p.beansFactory.createTableColumn("Wrk2Dtl.insp_inst_issue_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.insp_inst_issue_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_insp_offst = p.beansFactory.createTableColumn("Wrk2Dtl.insp_offst", MCColumnType.NUMBER);
		p.columnWrk2Dtl_inst_rslt_issue_flg = p.beansFactory.createTableColumn("Wrk2Dtl.inst_rslt_issue_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_pre_insp_valid_flg = p.beansFactory.createTableColumn("Wrk2Dtl.pre_insp_valid_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_memo1 = p.beansFactory.createTableColumn("Wrk2Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo2 = p.beansFactory.createTableColumn("Wrk2Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo3 = p.beansFactory.createTableColumn("Wrk2Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk2Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk2Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk2Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk2Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk2Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_ts = p.beansFactory.createTableColumn("Wrk2Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlBtnPanel = p.beansFactory.createPanel("Wrk2DtlBtn");
		// ブロックの項目の初期化
		p.Wrk2DtlBtn_select_all = p.beansFactory.createButton("Wrk2DtlBtn.select_all", "no_border");
		p.Wrk2DtlBtn_deselect_all = p.beansFactory.createButton("Wrk2DtlBtn.deselect_all", "no_border");
		p.Wrk2DtlBtn_radd = p.beansFactory.createButton("Wrk2DtlBtn.radd", "no_border");
		p.Wrk2DtlBtn_rdel = p.beansFactory.createButton("Wrk2DtlBtn.rdel", "no_border");
		p.Wrk2DtlBtn_rcopy = p.beansFactory.createButton("Wrk2DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel = p.beansFactory.createPanel("Wrk3");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel = p.beansFactory.createPanel("Wrk3Dtl");
		p.Wrk3DtlScrollPane = p.beansFactory.createScrollPane("Wrk3Dtl.scroll");
		p.createWrk3DtlTable();
		// ブロックの項目の初期化
		p.columnWrk3Dtl_check = p.beansFactory.createTableColumn("Wrk3Dtl.check", MCColumnType.CHECK);
		p.columnWrk3Dtl_del_flg = p.beansFactory.createTableColumn("Wrk3Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_site_cd = p.beansFactory.createTableColumn("Wrk3Dtl.site_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_site_nm = p.beansFactory.createTableColumn("Wrk3Dtl.site_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_insp_aprv_flg = p.beansFactory.createTableColumn("Wrk3Dtl.insp_aprv_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_insp_aprv_role_cd = p.beansFactory.createTableColumn("Wrk3Dtl.insp_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_insp_aprv_role_nm = p.beansFactory.createTableColumn("Wrk3Dtl.insp_aprv_role_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_in_prmt_insp_flg = p.beansFactory.createTableColumn("Wrk3Dtl.in_prmt_insp_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_ntfy_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ntfy_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_num_id = p.beansFactory.createTableColumn("Wrk3Dtl.num_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_plnt_aprv_flg = p.beansFactory.createTableColumn("Wrk3Dtl.plnt_aprv_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_plnt_aprv_role_cd = p.beansFactory.createTableColumn("Wrk3Dtl.plnt_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_plnt_aprv_role_nm = p.beansFactory.createTableColumn("Wrk3Dtl.plnt_aprv_role_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_mfg_aprv_flg = p.beansFactory.createTableColumn("Wrk3Dtl.mfg_aprv_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_mfg_aprv_role_cd = p.beansFactory.createTableColumn("Wrk3Dtl.mfg_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_mfg_aprv_role_nm = p.beansFactory.createTableColumn("Wrk3Dtl.mfg_aprv_role_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_xfr_lot_flg = p.beansFactory.createTableColumn("Wrk3Dtl.xfr_lot_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_so_prmt_insp_flg = p.beansFactory.createTableColumn("Wrk3Dtl.so_prmt_insp_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_memo1 = p.beansFactory.createTableColumn("Wrk3Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo2 = p.beansFactory.createTableColumn("Wrk3Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo3 = p.beansFactory.createTableColumn("Wrk3Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk3Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk3Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk3Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk3Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk3Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_ts = p.beansFactory.createTableColumn("Wrk3Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel = p.beansFactory.createPanel("Wrk3DtlBtn");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all = p.beansFactory.createButton("Wrk3DtlBtn.select_all", "no_border");
		p.Wrk3DtlBtn_deselect_all = p.beansFactory.createButton("Wrk3DtlBtn.deselect_all", "no_border");
		p.Wrk3DtlBtn_radd = p.beansFactory.createButton("Wrk3DtlBtn.radd", "no_border");
		p.Wrk3DtlBtn_rdel = p.beansFactory.createButton("Wrk3DtlBtn.rdel", "no_border");
		p.Wrk3DtlBtn_rcopy = p.beansFactory.createButton("Wrk3DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0310 = p.beansFactory.createButton("Btn.open_MABCP0310", "open");
		p.Btn_open_MABSP0350 = p.beansFactory.createButton("Btn.open_MABSP0350", "open");
		p.Btn_open_MABCP0030 = p.beansFactory.createButton("Btn.open_MABCP0030", "open");
		p.Btn_open_MABSP0160 = p.beansFactory.createButton("Btn.open_MABSP0160", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_InspItmReg p) {
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
	protected static void jbInitTop(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP1130.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dt_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_itm_PPanel);
		p.CndPanel.add(p.Cnd_itm_PPanel);
		p.Cnd_itm_PPanel.setNextBeans(p.Cnd_off_del_flg);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1130.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1130.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlTabPanel);
		p.TblPanel.add(p.DtlTabPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_unit_cd);
		p.HdrPanel.add(p.Hdr_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_unit_cd);
		p.Hdr_unit_cd.setNextBeans(p.Hdr_unit_nm);
		p.Hdr_unit_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.unit_cd_META);
		p.HdrPanel.add(p.Hdr_unit_nm);
		p.Hdr_unit_nm.setNextBeans(p.Hdr_lmt_ctl_flg);
		p.Hdr_unit_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.unit_nm_META);
		p.HdrPanel.add(p.Hdr_lmt_ctl_flg);
		p.Hdr_lmt_ctl_flg.setNextBeans(p.Hdr_lmt_ctl_categ);
		p.Hdr_lmt_ctl_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.lmt_ctl_flg_META);
		p.HdrPanel.add(p.Hdr_lmt_ctl_categ_Label);
		p.HdrPanel.add(p.Hdr_lmt_ctl_categ);
		p.Hdr_lmt_ctl_categ.setNextBeans(p.Hdr_asset_mng_typ);
		p.Hdr_lmt_ctl_categ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.lmt_ctl_categ_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_Label);
		p.HdrPanel.add(p.Hdr_asset_mng_typ);
		p.Hdr_asset_mng_typ.setNextBeans(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.asset_mng_typ_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ_nm.setNextBeans(p.Hdr_dec_place);
		p.Hdr_asset_mng_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.asset_mng_typ_nm_META);
		p.HdrPanel.add(p.Hdr_dec_place);
		p.Hdr_dec_place.setNextBeans(p.Hdr_lot_mng_typ);
		p.Hdr_dec_place.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.dec_place_META);
		p.BtnPanel.add(p.Hdr_insp_lbl);
		p.BtnPanel.add(p.Hdr_insp_flg);
		p.Hdr_insp_flg.setNextBeans(p.Hdr_insp_input_flg);
		p.Hdr_insp_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.insp_flg_META);
		p.BtnPanel.add(p.Hdr_insp_input_flg);
		p.Hdr_insp_input_flg.setNextBeans(p.Hdr_upd);
		p.Hdr_insp_input_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.insp_input_flg_META);
		p.Hdr_upd.setIcon("REGISTER");
		p.Hdr_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Hdr_upd);
		p.HdrPanel.add(p.Hdr_lot_mng_typ);
		p.Hdr_lot_mng_typ.setNextBeans(p.Hdr_sublot_mng_typ);
		p.Hdr_lot_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.lot_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sublot_mng_typ);
		p.Hdr_sublot_mng_typ.setNextBeans(p.Hdr_def_insp_aprv_flg);
		p.Hdr_sublot_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.sublot_mng_typ_META);
		p.HdrPanel.add(p.Hdr_def_insp_aprv_flg);
		p.Hdr_def_insp_aprv_flg.setNextBeans(p.Hdr_def_insp_aprv_role_cd);
		p.Hdr_def_insp_aprv_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.def_insp_aprv_flg_META);
		p.HdrPanel.add(p.Hdr_def_insp_aprv_role_cd);
		p.Hdr_def_insp_aprv_role_cd.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_def_insp_aprv_role_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.def_insp_aprv_role_cd_META);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setNextBeans(p.Hdr_check);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.upd_cntr_META);
		p.HdrPanel.add(p.Hdr_check);
		p.Hdr_check.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1130.HdrR.check_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1Panel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1Panel);
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.DtlTabTab.add(p.Wrk2Panel, "DtlTab.tab2");
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.DtlTabTab.add(p.Wrk3Panel, "DtlTab.tab3");
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.Wrk1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk1Panel.add(p.Wrk1TopPanel, null);
		p.Wrk1Panel.setLastBeans(p.Wrk1TopPanel);
		p.Wrk1TopPanel.setNextBeans(p.Wrk1BtmPanel);
		p.Wrk1Panel.add(p.Wrk1BtmPanel, null);
	}

	/**
	 * [Wrk1Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Top(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.Wrk1TopPanel.add(p.Wrk11Panel, null);
		p.Wrk1TopPanel.setLastBeans(p.Wrk11Panel);
	}

	/**
	 * [Wrk11]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk11(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk11Panel.add(p.Wrk11SetDtHdrPanel, null);
		p.Wrk11Panel.setLastBeans(p.Wrk11SetDtHdrPanel);
		p.Wrk11SetDtHdrPanel.setNextBeans(p.Wrk11DtlPanel);
		p.Wrk11Panel.add(p.Wrk11DtlPanel, null);
		p.Wrk11DtlPanel.setNextBeans(p.Wrk11DtlBtnPanel);
		p.Wrk11Panel.add(p.Wrk11DtlBtnPanel, null);
	}

	/**
	 * [Wrk11SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk11SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11SetDtHdrPanel.setValueCheck(false);
		p.Wrk11SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk11SetDtHdrPanel.add(p.Wrk11SetDtHdr_st_dt_Label);
		p.Wrk11SetDtHdrPanel.add(p.Wrk11SetDtHdr_st_dt);
		p.Wrk11SetDtHdrPanel.setLastBeans(p.Wrk11SetDtHdr_st_dt);
		p.Wrk11SetDtHdr_st_dt.setNextBeans(p.Wrk11SetDtHdr_end_dt);
		p.Wrk11SetDtHdr_st_dt.setRow(p.getWrk11SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR.st_dt_META);
		p.Wrk11SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk11SetDtHdrPanel.add(p.Wrk11SetDtHdr_end_dt_Label);
		p.Wrk11SetDtHdrPanel.add(p.Wrk11SetDtHdr_end_dt);
		p.Wrk11SetDtHdr_end_dt.setNextBeans(p.Wrk11SetDtHdr_set_dt);
		p.Wrk11SetDtHdr_end_dt.setRow(p.getWrk11SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk11SetDtHdrR.end_dt_META);
		p.Wrk11SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk11SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk11SetDtHdrPanel.add(p.Wrk11SetDtHdr_set_dt);
	}

	/**
	 * [Wrk11Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk11Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11DtlPanel.add(p.Wrk11DtlScrollPane);
		p.Wrk11DtlPanel.setLastBeans(p.Wrk11DtlTable);
		p.Wrk11DtlScrollPane.setViewportView(p.Wrk11DtlTable);
		p.Wrk11DtlTable.setList(p.getWrk11DtlL());
		p.Wrk11DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk11DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk11DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk11DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk11DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk11DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk11DtlBtnPanel.add(p.Wrk11DtlBtn_select_all);
		p.Wrk11DtlBtnPanel.setLastBeans(p.Wrk11DtlBtn_select_all);
		p.Wrk11DtlBtn_select_all.setNextBeans(p.Wrk11DtlBtn_deselect_all);
		p.Wrk11DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk11DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk11DtlBtnPanel.add(p.Wrk11DtlBtn_deselect_all);
		p.Wrk11DtlBtn_deselect_all.setNextBeans(p.Wrk11DtlBtn_radd);
		p.Wrk11DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk11DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk11DtlBtnPanel.add(p.Wrk11DtlBtn_radd);
		p.Wrk11DtlBtn_radd.setNextBeans(p.Wrk11DtlBtn_rdel);
		p.Wrk11DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk11DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk11DtlBtnPanel.add(p.Wrk11DtlBtn_rdel);
		p.Wrk11DtlBtn_rdel.setNextBeans(p.Wrk11DtlBtn_rcopy);
		p.Wrk11DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk11DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk11DtlBtnPanel.add(p.Wrk11DtlBtn_rcopy);
	}

	/**
	 * [Wrk1Btm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Btm(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk1BtmPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.Wrk1BtmPanel.add(p.Wrk12TabPanel, null);
		p.Wrk1BtmPanel.setLastBeans(p.Wrk12TabPanel);
	}

	/**
	 * [Wrk12Tab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk12Tab(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12TabPanel.add(p.Wrk12TabTab);
		p.Wrk12TabPanel.setLastBeans(p.Wrk12TabTab);
		p.Wrk12TabPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk12TabTab.add(p.Wrk12Panel, "Wrk12Tab.tab1");
		p.Wrk12TabTab.setLastBeans(p.Wrk12Panel);
	}

	/**
	 * [Wrk12]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk12(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk12Panel.add(p.Wrk12SetDtHdrPanel, null);
		p.Wrk12Panel.setLastBeans(p.Wrk12SetDtHdrPanel);
		p.Wrk12SetDtHdrPanel.setNextBeans(p.Wrk12DtlPanel);
		p.Wrk12Panel.add(p.Wrk12DtlPanel, null);
		p.Wrk12DtlPanel.setNextBeans(p.Wrk12DtlBtnPanel);
		p.Wrk12Panel.add(p.Wrk12DtlBtnPanel, null);
	}

	/**
	 * [Wrk12SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk12SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12SetDtHdrPanel.setValueCheck(false);
		p.Wrk12SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk12SetDtHdrPanel.add(p.Wrk12SetDtHdr_st_dt_Label);
		p.Wrk12SetDtHdrPanel.add(p.Wrk12SetDtHdr_st_dt);
		p.Wrk12SetDtHdrPanel.setLastBeans(p.Wrk12SetDtHdr_st_dt);
		p.Wrk12SetDtHdr_st_dt.setNextBeans(p.Wrk12SetDtHdr_end_dt);
		p.Wrk12SetDtHdr_st_dt.setRow(p.getWrk12SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR.st_dt_META);
		p.Wrk12SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk12SetDtHdrPanel.add(p.Wrk12SetDtHdr_end_dt_Label);
		p.Wrk12SetDtHdrPanel.add(p.Wrk12SetDtHdr_end_dt);
		p.Wrk12SetDtHdr_end_dt.setNextBeans(p.Wrk12SetDtHdr_set_dt);
		p.Wrk12SetDtHdr_end_dt.setRow(p.getWrk12SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk12SetDtHdrR.end_dt_META);
		p.Wrk12SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk12SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F8);
		p.Wrk12SetDtHdrPanel.add(p.Wrk12SetDtHdr_set_dt);
	}

	/**
	 * [Wrk12Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk12Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12DtlPanel.add(p.Wrk12DtlScrollPane);
		p.Wrk12DtlPanel.setLastBeans(p.Wrk12DtlTable);
		p.Wrk12DtlScrollPane.setViewportView(p.Wrk12DtlTable);
		p.Wrk12DtlTable.setList(p.getWrk12DtlL());
		p.Wrk12DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk12DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk12DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk12DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk12DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk12DtlBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.Wrk12DtlBtnPanel.add(p.Wrk12DtlBtn_select_all);
		p.Wrk12DtlBtnPanel.setLastBeans(p.Wrk12DtlBtn_select_all);
		p.Wrk12DtlBtn_select_all.setNextBeans(p.Wrk12DtlBtn_deselect_all);
		p.Wrk12DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk12DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.Wrk12DtlBtnPanel.add(p.Wrk12DtlBtn_deselect_all);
		p.Wrk12DtlBtn_deselect_all.setNextBeans(p.Wrk12DtlBtn_radd);
		p.Wrk12DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk12DtlBtn_radd.setFunctionKey(MCFunctionKey.F15);
		p.Wrk12DtlBtnPanel.add(p.Wrk12DtlBtn_radd);
		p.Wrk12DtlBtn_radd.setNextBeans(p.Wrk12DtlBtn_rdel);
		p.Wrk12DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk12DtlBtn_rdel.setFunctionKey(MCFunctionKey.F16);
		p.Wrk12DtlBtnPanel.add(p.Wrk12DtlBtn_rdel);
		p.Wrk12DtlBtn_rdel.setNextBeans(p.Wrk12DtlBtn_rcopy);
		p.Wrk12DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk12DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.Wrk12DtlBtnPanel.add(p.Wrk12DtlBtn_rcopy);
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.Wrk2Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk2Panel.add(p.Wrk2SetDtHdrPanel, null);
		p.Wrk2Panel.setLastBeans(p.Wrk2SetDtHdrPanel);
		p.Wrk2SetDtHdrPanel.setNextBeans(p.Wrk2DtlPanel);
		p.Wrk2Panel.add(p.Wrk2DtlPanel, null);
		p.Wrk2DtlPanel.setNextBeans(p.Wrk2DtlBtnPanel);
		p.Wrk2Panel.add(p.Wrk2DtlBtnPanel, null);
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2SetDtHdr(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2SetDtHdrPanel.setValueCheck(false);
		p.Wrk2SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdrPanel.setLastBeans(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdr_st_dt.setNextBeans(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_st_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR.st_dt_META);
		p.Wrk2SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_end_dt.setNextBeans(p.Wrk2SetDtHdr_set_dt);
		p.Wrk2SetDtHdr_end_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1130.Wrk2SetDtHdrR.end_dt_META);
		p.Wrk2SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_set_dt);
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel.add(p.Wrk2DtlScrollPane);
		p.Wrk2DtlPanel.setLastBeans(p.Wrk2DtlTable);
		p.Wrk2DtlScrollPane.setViewportView(p.Wrk2DtlTable);
		p.Wrk2DtlTable.setList(p.getWrk2DtlL());
		p.Wrk2DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk2DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk2DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_select_all);
		p.Wrk2DtlBtnPanel.setLastBeans(p.Wrk2DtlBtn_select_all);
		p.Wrk2DtlBtn_select_all.setNextBeans(p.Wrk2DtlBtn_deselect_all);
		p.Wrk2DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk2DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_deselect_all);
		p.Wrk2DtlBtn_deselect_all.setNextBeans(p.Wrk2DtlBtn_radd);
		p.Wrk2DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk2DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_radd);
		p.Wrk2DtlBtn_radd.setNextBeans(p.Wrk2DtlBtn_rdel);
		p.Wrk2DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk2DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_rdel);
		p.Wrk2DtlBtn_rdel.setNextBeans(p.Wrk2DtlBtn_rcopy);
		p.Wrk2DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk2DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_rcopy);
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Wrk3Panel.add(p.Wrk3DtlPanel, null);
		p.Wrk3Panel.setLastBeans(p.Wrk3DtlPanel);
		p.Wrk3DtlPanel.setNextBeans(p.Wrk3DtlBtnPanel);
		p.Wrk3Panel.add(p.Wrk3DtlBtnPanel, null);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Dtl(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel.add(p.Wrk3DtlScrollPane);
		p.Wrk3DtlPanel.setLastBeans(p.Wrk3DtlTable);
		p.Wrk3DtlScrollPane.setViewportView(p.Wrk3DtlTable);
		p.Wrk3DtlTable.setList(p.getWrk3DtlL());
		p.Wrk3DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3DtlBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk3DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtnPanel.setLastBeans(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtn_select_all.setNextBeans(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk3DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setNextBeans(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk3DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setNextBeans(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk3DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setNextBeans(p.Wrk3DtlBtn_rcopy);
		p.Wrk3DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk3DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_InspItmReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0310.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP0310);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP0310);
		p.Btn_open_MABCP0310.setNextBeans(p.Btn_open_MABSP0350);
		p.Btn_open_MABSP0350.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABSP0350);
		p.Btn_open_MABSP0350.setNextBeans(p.Btn_open_MABCP0030);
		p.Btn_open_MABCP0030.setFunctionKey(MCFunctionKey.F21);
		p.BtnPanel.add(p.Btn_open_MABCP0030);
		p.Btn_open_MABCP0030.setNextBeans(p.Btn_open_MABSP0160);
		p.Btn_open_MABSP0160.setFunctionKey(MCFunctionKey.F23);
		p.BtnPanel.add(p.Btn_open_MABSP0160);
		p.Btn_open_MABSP0160.setNextBeans(p.Hdr_insp_flg);
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
		MABSP_InspItmReg_MC.mcInitScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitTop((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitFold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitCnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitCtrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitTbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitDtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitWrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.mcInitBtn((MABSP_InspItmReg)this);

		// [SRCH]ステータスのモードの設定
		MABSP_InspItmReg_MC.statusInitSRCH_ScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Fold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Cnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Ctrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Tbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Hdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_HdrAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_DtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12DtlAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Wrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitSRCH_Btn((MABSP_InspItmReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_InspItmReg_MC.statusInitUPD_ScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Fold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Cnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Ctrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Tbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Hdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_HdrAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_DtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12DtlAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Wrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitUPD_Btn((MABSP_InspItmReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_InspItmReg_MC.statusInitFIX_ScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Fold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Cnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Ctrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Tbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Hdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_HdrAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_DtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12DtlAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Wrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitFIX_Btn((MABSP_InspItmReg)this);

		// [REF]ステータスのモードの設定
		MABSP_InspItmReg_MC.statusInitREF_ScreenOpe((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Fold((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Cnd((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Ctrl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Tbl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Hdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_HdrAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_DtlTab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk1((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk1Top((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk11((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk11SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk11DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk1Btm((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12Tab((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12DtlAll((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk12DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk2((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk2SetDtHdr((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk2DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk3((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk3Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Wrk3DtlBtn((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.statusInitREF_Btn((MABSP_InspItmReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_InspItmReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_InspItmReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_InspItmReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_InspItmReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_InspItmReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABSP_InspItmReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_InspItmReg p) {
		p.Hdr_unit_cd.setListListener(p);
		p.Hdr_unit_cd.addAllListener(p);
		p.Hdr_unit_nm.setListListener(p);
		p.Hdr_unit_nm.addAllListener(p);
		p.Hdr_lmt_ctl_flg.addAllListener(p);
		p.Hdr_lmt_ctl_categ.setListListener(p);
		p.Hdr_lmt_ctl_categ.addAllListener(p);
		p.Hdr_asset_mng_typ.setListListener(p);
		p.Hdr_asset_mng_typ.addAllListener(p);
		p.Hdr_asset_mng_typ_nm.setListListener(p);
		p.Hdr_asset_mng_typ_nm.addAllListener(p);
		p.Hdr_dec_place.setListListener(p);
		p.Hdr_dec_place.addAllListener(p);
		p.Hdr_insp_flg.addAllListener(p);
		p.Hdr_insp_input_flg.addAllListener(p);
		p.Hdr_upd.addAllListener(p);
		p.Hdr_upd.setAPMethodName("doHdr_upd");
		p.Hdr_lot_mng_typ.setListListener(p);
		p.Hdr_lot_mng_typ.addAllListener(p);
		p.Hdr_sublot_mng_typ.setListListener(p);
		p.Hdr_sublot_mng_typ.addAllListener(p);
		p.Hdr_def_insp_aprv_flg.addAllListener(p);
		p.Hdr_def_insp_aprv_role_cd.setListListener(p);
		p.Hdr_def_insp_aprv_role_cd.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_check.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABSP_InspItmReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk1Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Top(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk11]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk11(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk11SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk11SetDtHdr(MABSP_InspItmReg p) {
		p.Wrk11SetDtHdr_st_dt.setListListener(p);
		p.Wrk11SetDtHdr_st_dt.addAllListener(p);
		p.Wrk11SetDtHdr_end_dt.setListListener(p);
		p.Wrk11SetDtHdr_end_dt.addAllListener(p);
		p.Wrk11SetDtHdr_set_dt.addAllListener(p);
		p.Wrk11SetDtHdr_set_dt.setAPMethodName("doWrk11SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk11Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk11Dtl(MABSP_InspItmReg p) {
		p.Wrk11DtlTable.addAllListener(p);
		p.columnWrk11Dtl_check.addAllListener(p);
		p.columnWrk11Dtl_del_flg.addAllListener(p);
		p.columnWrk11Dtl_insp_ptn_cd.addAllListener(p);
		p.columnWrk11Dtl_insp_ptn_cd.setListListener(p);
		p.columnWrk11Dtl_insp_ptn_nm.addAllListener(p);
		p.columnWrk11Dtl_insp_ptn_nm.setListListener(p);
		p.columnWrk11Dtl_insp_mtd_typ.addAllListener(p);
		p.columnWrk11Dtl_insp_mtd_typ.setListListener(p);
		p.columnWrk11Dtl_insp_mtd_typ_nm.addAllListener(p);
		p.columnWrk11Dtl_insp_mtd_typ_nm.setListListener(p);
		p.columnWrk11Dtl_insp_lt.addAllListener(p);
		p.columnWrk11Dtl_insp_lt.setListListener(p);
		p.columnWrk11Dtl_insp_std_no.addAllListener(p);
		p.columnWrk11Dtl_insp_std_no.setListListener(p);
		p.columnWrk11Dtl_std_req_flg.addAllListener(p);
		p.columnWrk11Dtl_std_cnf_req_flg.addAllListener(p);
		p.columnWrk11Dtl_memo1.addAllListener(p);
		p.columnWrk11Dtl_memo1.setListListener(p);
		p.columnWrk11Dtl_memo2.addAllListener(p);
		p.columnWrk11Dtl_memo2.setListListener(p);
		p.columnWrk11Dtl_memo3.addAllListener(p);
		p.columnWrk11Dtl_memo3.setListListener(p);
		p.columnWrk11Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk11Dtl_ins_usr_id.setListListener(p);
		p.columnWrk11Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk11Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk11Dtl_ins_ts.addAllListener(p);
		p.columnWrk11Dtl_ins_ts.setListListener(p);
		p.columnWrk11Dtl_ins_func_id.addAllListener(p);
		p.columnWrk11Dtl_ins_func_id.setListListener(p);
		p.columnWrk11Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk11Dtl_ins_func_nm.setListListener(p);
		p.columnWrk11Dtl_upd_cntr.addAllListener(p);
		p.columnWrk11Dtl_upd_cntr.setListListener(p);
		p.columnWrk11Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk11Dtl_upd_usr_id.setListListener(p);
		p.columnWrk11Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk11Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk11Dtl_upd_ts.addAllListener(p);
		p.columnWrk11Dtl_upd_ts.setListListener(p);
		p.columnWrk11Dtl_upd_func_id.addAllListener(p);
		p.columnWrk11Dtl_upd_func_id.setListListener(p);
		p.columnWrk11Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk11Dtl_upd_func_nm.setListListener(p);
		p.columnWrk11Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk11Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk11Dtl_del_usr_id.addAllListener(p);
		p.columnWrk11Dtl_del_usr_id.setListListener(p);
		p.columnWrk11Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk11Dtl_del_usr_nm.setListListener(p);
		p.columnWrk11Dtl_del_ts.addAllListener(p);
		p.columnWrk11Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk11DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk11DtlBtn(MABSP_InspItmReg p) {
		p.Wrk11DtlBtn_select_all.addAllListener(p);
		p.Wrk11DtlBtn_select_all.setAPMethodName("doWrk11DtlBtn_select_all");
		p.Wrk11DtlBtn_deselect_all.addAllListener(p);
		p.Wrk11DtlBtn_deselect_all.setAPMethodName("doWrk11DtlBtn_deselect_all");
		p.Wrk11DtlBtn_radd.addAllListener(p);
		p.Wrk11DtlBtn_radd.setAPMethodName("doWrk11DtlBtn_radd");
		p.Wrk11DtlBtn_rdel.addAllListener(p);
		p.Wrk11DtlBtn_rdel.setAPMethodName("doWrk11DtlBtn_rdel");
		p.Wrk11DtlBtn_rcopy.addAllListener(p);
		p.Wrk11DtlBtn_rcopy.setAPMethodName("doWrk11DtlBtn_rcopy");
	}

	/**
	 *  [Wrk1Btm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Btm(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk12Tab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk12Tab(MABSP_InspItmReg p) {
		p.Wrk12TabTab.addAllListener(p);
	}

	/**
	 *  [Wrk12]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk12(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk12SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk12SetDtHdr(MABSP_InspItmReg p) {
		p.Wrk12SetDtHdr_st_dt.setListListener(p);
		p.Wrk12SetDtHdr_st_dt.addAllListener(p);
		p.Wrk12SetDtHdr_end_dt.setListListener(p);
		p.Wrk12SetDtHdr_end_dt.addAllListener(p);
		p.Wrk12SetDtHdr_set_dt.addAllListener(p);
		p.Wrk12SetDtHdr_set_dt.setAPMethodName("doWrk12SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk12Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk12Dtl(MABSP_InspItmReg p) {
		p.Wrk12DtlTable.addAllListener(p);
		p.columnWrk12Dtl_check.addAllListener(p);
		p.columnWrk12Dtl_del_flg.addAllListener(p);
		p.columnWrk12Dtl_insp_ptn_cd.addAllListener(p);
		p.columnWrk12Dtl_insp_ptn_cd.setListListener(p);
		p.columnWrk12Dtl_insp_seq.addAllListener(p);
		p.columnWrk12Dtl_insp_seq.setListListener(p);
		p.columnWrk12Dtl_insp_point_cd.addAllListener(p);
		p.columnWrk12Dtl_insp_point_cd.setListListener(p);
		p.columnWrk12Dtl_insp_point_nm.addAllListener(p);
		p.columnWrk12Dtl_insp_point_nm.setListListener(p);
		p.columnWrk12Dtl_pre_insp_inf_typ.addAllListener(p);
		p.columnWrk12Dtl_pre_insp_inf_typ.setListListener(p);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.setListListener(p);
		p.columnWrk12Dtl_insp_qlqn_typ.addAllListener(p);
		p.columnWrk12Dtl_insp_qlqn_typ.setListListener(p);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.setListListener(p);
		p.columnWrk12Dtl_ql_std_val.addAllListener(p);
		p.columnWrk12Dtl_ql_std_val.setListListener(p);
		p.columnWrk12Dtl_unit_cd.addAllListener(p);
		p.columnWrk12Dtl_unit_cd.setListListener(p);
		p.columnWrk12Dtl_unit_nm.addAllListener(p);
		p.columnWrk12Dtl_unit_nm.setListListener(p);
		p.columnWrk12Dtl_qn_int_digit.addAllListener(p);
		p.columnWrk12Dtl_qn_int_digit.setListListener(p);
		p.columnWrk12Dtl_qn_int_frac.addAllListener(p);
		p.columnWrk12Dtl_qn_int_frac.setListListener(p);
		p.columnWrk12Dtl_sign_out_min_typ.addAllListener(p);
		p.columnWrk12Dtl_sign_out_min_typ.setListListener(p);
		p.columnWrk12Dtl_sign_out_min_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_sign_out_min_typ_nm.setListListener(p);
		p.columnWrk12Dtl_sign_out_max_typ.addAllListener(p);
		p.columnWrk12Dtl_sign_out_max_typ.setListListener(p);
		p.columnWrk12Dtl_sign_out_max_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_sign_out_max_typ_nm.setListListener(p);
		p.columnWrk12Dtl_sign_in_min_typ.addAllListener(p);
		p.columnWrk12Dtl_sign_in_min_typ.setListListener(p);
		p.columnWrk12Dtl_sign_in_min_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_sign_in_min_typ_nm.setListListener(p);
		p.columnWrk12Dtl_sign_in_max_typ.addAllListener(p);
		p.columnWrk12Dtl_sign_in_max_typ.setListListener(p);
		p.columnWrk12Dtl_sign_in_max_typ_nm.addAllListener(p);
		p.columnWrk12Dtl_sign_in_max_typ_nm.setListListener(p);
		p.columnWrk12Dtl_memo1.addAllListener(p);
		p.columnWrk12Dtl_memo1.setListListener(p);
		p.columnWrk12Dtl_memo2.addAllListener(p);
		p.columnWrk12Dtl_memo2.setListListener(p);
		p.columnWrk12Dtl_memo3.addAllListener(p);
		p.columnWrk12Dtl_memo3.setListListener(p);
		p.columnWrk12Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk12Dtl_ins_usr_id.setListListener(p);
		p.columnWrk12Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk12Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk12Dtl_ins_ts.addAllListener(p);
		p.columnWrk12Dtl_ins_ts.setListListener(p);
		p.columnWrk12Dtl_ins_func_id.addAllListener(p);
		p.columnWrk12Dtl_ins_func_id.setListListener(p);
		p.columnWrk12Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk12Dtl_ins_func_nm.setListListener(p);
		p.columnWrk12Dtl_upd_cntr.addAllListener(p);
		p.columnWrk12Dtl_upd_cntr.setListListener(p);
		p.columnWrk12Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk12Dtl_upd_usr_id.setListListener(p);
		p.columnWrk12Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk12Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk12Dtl_upd_ts.addAllListener(p);
		p.columnWrk12Dtl_upd_ts.setListListener(p);
		p.columnWrk12Dtl_upd_func_id.addAllListener(p);
		p.columnWrk12Dtl_upd_func_id.setListListener(p);
		p.columnWrk12Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk12Dtl_upd_func_nm.setListListener(p);
		p.columnWrk12Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk12Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk12Dtl_del_usr_id.addAllListener(p);
		p.columnWrk12Dtl_del_usr_id.setListListener(p);
		p.columnWrk12Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk12Dtl_del_usr_nm.setListListener(p);
		p.columnWrk12Dtl_del_ts.addAllListener(p);
		p.columnWrk12Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk12DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk12DtlBtn(MABSP_InspItmReg p) {
		p.Wrk12DtlBtn_select_all.addAllListener(p);
		p.Wrk12DtlBtn_select_all.setAPMethodName("doWrk12DtlBtn_select_all");
		p.Wrk12DtlBtn_deselect_all.addAllListener(p);
		p.Wrk12DtlBtn_deselect_all.setAPMethodName("doWrk12DtlBtn_deselect_all");
		p.Wrk12DtlBtn_radd.addAllListener(p);
		p.Wrk12DtlBtn_radd.setAPMethodName("doWrk12DtlBtn_radd");
		p.Wrk12DtlBtn_rdel.addAllListener(p);
		p.Wrk12DtlBtn_rdel.setAPMethodName("doWrk12DtlBtn_rdel");
		p.Wrk12DtlBtn_rcopy.addAllListener(p);
		p.Wrk12DtlBtn_rcopy.setAPMethodName("doWrk12DtlBtn_rcopy");
	}

	/**
	 *  [Wrk2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk2SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2SetDtHdr(MABSP_InspItmReg p) {
		p.Wrk2SetDtHdr_st_dt.setListListener(p);
		p.Wrk2SetDtHdr_st_dt.addAllListener(p);
		p.Wrk2SetDtHdr_end_dt.setListListener(p);
		p.Wrk2SetDtHdr_end_dt.addAllListener(p);
		p.Wrk2SetDtHdr_set_dt.addAllListener(p);
		p.Wrk2SetDtHdr_set_dt.setAPMethodName("doWrk2SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk2Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2Dtl(MABSP_InspItmReg p) {
		p.Wrk2DtlTable.addAllListener(p);
		p.columnWrk2Dtl_check.addAllListener(p);
		p.columnWrk2Dtl_del_flg.addAllListener(p);
		p.columnWrk2Dtl_mfg_loc_cd.addAllListener(p);
		p.columnWrk2Dtl_mfg_loc_cd.setListListener(p);
		p.columnWrk2Dtl_mfg_loc_nm.addAllListener(p);
		p.columnWrk2Dtl_mfg_loc_nm.setListListener(p);
		p.columnWrk2Dtl_sppl_cd.addAllListener(p);
		p.columnWrk2Dtl_sppl_cd.setListListener(p);
		p.columnWrk2Dtl_sppl_nm.addAllListener(p);
		p.columnWrk2Dtl_sppl_nm.setListListener(p);
		p.columnWrk2Dtl_maker_cd.addAllListener(p);
		p.columnWrk2Dtl_maker_cd.setListListener(p);
		p.columnWrk2Dtl_maker_nm.addAllListener(p);
		p.columnWrk2Dtl_maker_nm.setListListener(p);
		p.columnWrk2Dtl_from_site_cd.addAllListener(p);
		p.columnWrk2Dtl_from_site_cd.setListListener(p);
		p.columnWrk2Dtl_from_site_nm.addAllListener(p);
		p.columnWrk2Dtl_from_site_nm.setListListener(p);
		p.columnWrk2Dtl_to_site_cd.addAllListener(p);
		p.columnWrk2Dtl_to_site_cd.setListListener(p);
		p.columnWrk2Dtl_to_site_nm.addAllListener(p);
		p.columnWrk2Dtl_to_site_nm.setListListener(p);
		p.columnWrk2Dtl_no_insp_flg.addAllListener(p);
		p.columnWrk2Dtl_insp_ptn_cd.addAllListener(p);
		p.columnWrk2Dtl_insp_ptn_cd.setListListener(p);
		p.columnWrk2Dtl_insp_ptn_nm.addAllListener(p);
		p.columnWrk2Dtl_insp_ptn_nm.setListListener(p);
		p.columnWrk2Dtl_no_mrkt_judg_flg.addAllListener(p);
		p.columnWrk2Dtl_no_plnt_aprv_flg.addAllListener(p);
		p.columnWrk2Dtl_no_insp_aprv_flg.addAllListener(p);
		p.columnWrk2Dtl_lmt_dt_frm_typ.addAllListener(p);
		p.columnWrk2Dtl_lmt_dt_frm_typ.setListListener(p);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnWrk2Dtl_vld_pd.addAllListener(p);
		p.columnWrk2Dtl_vld_pd.setListListener(p);
		p.columnWrk2Dtl_lmt_pd.addAllListener(p);
		p.columnWrk2Dtl_lmt_pd.setListListener(p);
		p.columnWrk2Dtl_lot_insp_vld_pd.addAllListener(p);
		p.columnWrk2Dtl_lot_insp_vld_pd.setListListener(p);
		p.columnWrk2Dtl_calc_pd_typ.addAllListener(p);
		p.columnWrk2Dtl_calc_pd_typ.setListListener(p);
		p.columnWrk2Dtl_calc_pd_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_calc_pd_typ_nm.setListListener(p);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.addAllListener(p);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.setListListener(p);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnWrk2Dtl_insp_inst_issue_typ.addAllListener(p);
		p.columnWrk2Dtl_insp_inst_issue_typ.setListListener(p);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.setListListener(p);
		p.columnWrk2Dtl_insp_offst.addAllListener(p);
		p.columnWrk2Dtl_insp_offst.setListListener(p);
		p.columnWrk2Dtl_inst_rslt_issue_flg.addAllListener(p);
		p.columnWrk2Dtl_pre_insp_valid_flg.addAllListener(p);
		p.columnWrk2Dtl_memo1.addAllListener(p);
		p.columnWrk2Dtl_memo1.setListListener(p);
		p.columnWrk2Dtl_memo2.addAllListener(p);
		p.columnWrk2Dtl_memo2.setListListener(p);
		p.columnWrk2Dtl_memo3.addAllListener(p);
		p.columnWrk2Dtl_memo3.setListListener(p);
		p.columnWrk2Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_id.setListListener(p);
		p.columnWrk2Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk2Dtl_ins_ts.addAllListener(p);
		p.columnWrk2Dtl_ins_ts.setListListener(p);
		p.columnWrk2Dtl_ins_func_id.addAllListener(p);
		p.columnWrk2Dtl_ins_func_id.setListListener(p);
		p.columnWrk2Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_cntr.addAllListener(p);
		p.columnWrk2Dtl_upd_cntr.setListListener(p);
		p.columnWrk2Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_id.setListListener(p);
		p.columnWrk2Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk2Dtl_upd_ts.addAllListener(p);
		p.columnWrk2Dtl_upd_ts.setListListener(p);
		p.columnWrk2Dtl_upd_func_id.addAllListener(p);
		p.columnWrk2Dtl_upd_func_id.setListListener(p);
		p.columnWrk2Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk2Dtl_del_usr_id.addAllListener(p);
		p.columnWrk2Dtl_del_usr_id.setListListener(p);
		p.columnWrk2Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_del_usr_nm.setListListener(p);
		p.columnWrk2Dtl_del_ts.addAllListener(p);
		p.columnWrk2Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk2DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2DtlBtn(MABSP_InspItmReg p) {
		p.Wrk2DtlBtn_select_all.addAllListener(p);
		p.Wrk2DtlBtn_select_all.setAPMethodName("doWrk2DtlBtn_select_all");
		p.Wrk2DtlBtn_deselect_all.addAllListener(p);
		p.Wrk2DtlBtn_deselect_all.setAPMethodName("doWrk2DtlBtn_deselect_all");
		p.Wrk2DtlBtn_radd.addAllListener(p);
		p.Wrk2DtlBtn_radd.setAPMethodName("doWrk2DtlBtn_radd");
		p.Wrk2DtlBtn_rdel.addAllListener(p);
		p.Wrk2DtlBtn_rdel.setAPMethodName("doWrk2DtlBtn_rdel");
		p.Wrk2DtlBtn_rcopy.addAllListener(p);
		p.Wrk2DtlBtn_rcopy.setAPMethodName("doWrk2DtlBtn_rcopy");
	}

	/**
	 *  [Wrk3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3(MABSP_InspItmReg p) {
	}

	/**
	 *  [Wrk3Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Dtl(MABSP_InspItmReg p) {
		p.Wrk3DtlTable.addAllListener(p);
		p.columnWrk3Dtl_check.addAllListener(p);
		p.columnWrk3Dtl_del_flg.addAllListener(p);
		p.columnWrk3Dtl_site_cd.addAllListener(p);
		p.columnWrk3Dtl_site_cd.setListListener(p);
		p.columnWrk3Dtl_site_nm.addAllListener(p);
		p.columnWrk3Dtl_site_nm.setListListener(p);
		p.columnWrk3Dtl_insp_aprv_flg.addAllListener(p);
		p.columnWrk3Dtl_insp_aprv_role_cd.addAllListener(p);
		p.columnWrk3Dtl_insp_aprv_role_cd.setListListener(p);
		p.columnWrk3Dtl_insp_aprv_role_nm.addAllListener(p);
		p.columnWrk3Dtl_insp_aprv_role_nm.setListListener(p);
		p.columnWrk3Dtl_in_prmt_insp_flg.addAllListener(p);
		p.columnWrk3Dtl_ntfy_nm.addAllListener(p);
		p.columnWrk3Dtl_ntfy_nm.setListListener(p);
		p.columnWrk3Dtl_num_id.addAllListener(p);
		p.columnWrk3Dtl_num_id.setListListener(p);
		p.columnWrk3Dtl_plnt_aprv_flg.addAllListener(p);
		p.columnWrk3Dtl_plnt_aprv_role_cd.addAllListener(p);
		p.columnWrk3Dtl_plnt_aprv_role_cd.setListListener(p);
		p.columnWrk3Dtl_plnt_aprv_role_nm.addAllListener(p);
		p.columnWrk3Dtl_plnt_aprv_role_nm.setListListener(p);
		p.columnWrk3Dtl_mfg_aprv_flg.addAllListener(p);
		p.columnWrk3Dtl_mfg_aprv_role_cd.addAllListener(p);
		p.columnWrk3Dtl_mfg_aprv_role_cd.setListListener(p);
		p.columnWrk3Dtl_mfg_aprv_role_nm.addAllListener(p);
		p.columnWrk3Dtl_mfg_aprv_role_nm.setListListener(p);
		p.columnWrk3Dtl_xfr_lot_flg.addAllListener(p);
		p.columnWrk3Dtl_so_prmt_insp_flg.addAllListener(p);
		p.columnWrk3Dtl_memo1.addAllListener(p);
		p.columnWrk3Dtl_memo1.setListListener(p);
		p.columnWrk3Dtl_memo2.addAllListener(p);
		p.columnWrk3Dtl_memo2.setListListener(p);
		p.columnWrk3Dtl_memo3.addAllListener(p);
		p.columnWrk3Dtl_memo3.setListListener(p);
		p.columnWrk3Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_id.setListListener(p);
		p.columnWrk3Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk3Dtl_ins_ts.addAllListener(p);
		p.columnWrk3Dtl_ins_ts.setListListener(p);
		p.columnWrk3Dtl_ins_func_id.addAllListener(p);
		p.columnWrk3Dtl_ins_func_id.setListListener(p);
		p.columnWrk3Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_cntr.addAllListener(p);
		p.columnWrk3Dtl_upd_cntr.setListListener(p);
		p.columnWrk3Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_id.setListListener(p);
		p.columnWrk3Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk3Dtl_upd_ts.addAllListener(p);
		p.columnWrk3Dtl_upd_ts.setListListener(p);
		p.columnWrk3Dtl_upd_func_id.addAllListener(p);
		p.columnWrk3Dtl_upd_func_id.setListListener(p);
		p.columnWrk3Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk3Dtl_del_usr_id.addAllListener(p);
		p.columnWrk3Dtl_del_usr_id.setListListener(p);
		p.columnWrk3Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_del_usr_nm.setListListener(p);
		p.columnWrk3Dtl_del_ts.addAllListener(p);
		p.columnWrk3Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk3DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3DtlBtn(MABSP_InspItmReg p) {
		p.Wrk3DtlBtn_select_all.addAllListener(p);
		p.Wrk3DtlBtn_select_all.setAPMethodName("doWrk3DtlBtn_select_all");
		p.Wrk3DtlBtn_deselect_all.addAllListener(p);
		p.Wrk3DtlBtn_deselect_all.setAPMethodName("doWrk3DtlBtn_deselect_all");
		p.Wrk3DtlBtn_radd.addAllListener(p);
		p.Wrk3DtlBtn_radd.setAPMethodName("doWrk3DtlBtn_radd");
		p.Wrk3DtlBtn_rdel.addAllListener(p);
		p.Wrk3DtlBtn_rdel.setAPMethodName("doWrk3DtlBtn_rdel");
		p.Wrk3DtlBtn_rcopy.addAllListener(p);
		p.Wrk3DtlBtn_rcopy.setAPMethodName("doWrk3DtlBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_InspItmReg p) {
		p.Btn_open_MABCP0310.addAllListener(p);
		p.Btn_open_MABCP0310.setAPMethodName("doBtn_open_MABCP0310");
		p.Btn_open_MABSP0350.addAllListener(p);
		p.Btn_open_MABSP0350.setAPMethodName("doBtn_open_MABSP0350");
		p.Btn_open_MABCP0030.addAllListener(p);
		p.Btn_open_MABCP0030.setAPMethodName("doBtn_open_MABCP0030");
		p.Btn_open_MABSP0160.addAllListener(p);
		p.Btn_open_MABSP0160.setAPMethodName("doBtn_open_MABSP0160");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_InspItmReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_InspItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_insp_lbl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_insp_input_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Hdr_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_role_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Top(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk11]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk11(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk11SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk11SetDtHdr(MABSP_InspItmReg p){
		p.Wrk11SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk11Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk11Dtl(MABSP_InspItmReg p){
		p.columnWrk11Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk11Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk11Dtl_insp_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk11Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_std_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk11Dtl_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk11Dtl_std_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_std_cnf_req_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk11Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk11DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk11DtlBtn(MABSP_InspItmReg p){
		p.Wrk11DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk11DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk11DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk11DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk11DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk1Btm]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Btm(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk12Tab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12Tab(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk12]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk12SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12SetDtHdr(MABSP_InspItmReg p){
		p.Wrk12SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk12Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12Dtl(MABSP_InspItmReg p){
		p.columnWrk12Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk12Dtl_insp_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk12Dtl_insp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk12Dtl_insp_point_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_point_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ql_std_val.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_digit.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_frac.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Wrk12Dtl_qn_in_min_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_in_max_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk12Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk12DtlAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12DtlAll(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk12DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk12DtlBtn(MABSP_InspItmReg p){
		p.Wrk12DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk12DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk12DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk12DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk12DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2SetDtHdr(MABSP_InspItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Dtl(MABSP_InspItmReg p){
		p.columnWrk2Dtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnWrk2Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_from_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_from_site_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_to_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_no_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_mrkt_judg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_plnt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_insp_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_vld_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_vld_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_offst.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_inst_rslt_issue_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_insp_valid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2DtlBtn(MABSP_InspItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3(MABSP_InspItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Dtl(MABSP_InspItmReg p){
		p.columnWrk3Dtl_check.putMode(p, SRCH, MCMode.REQUIRED);
		p.columnWrk3Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_in_prmt_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ntfy_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_num_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_xfr_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_so_prmt_insp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3DtlBtn(MABSP_InspItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABSP_InspItmReg p){
		p.Btn_open_MABCP0310.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABSP0350.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABCP0030.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABSP0160.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_InspItmReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABSP_InspItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_insp_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_insp_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_role_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Top(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk11]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk11(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk11SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk11SetDtHdr(MABSP_InspItmReg p){
		p.Wrk11SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk11Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk11Dtl(MABSP_InspItmReg p){
		p.columnWrk11Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk11Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk11Dtl_insp_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_insp_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk11Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk11Dtl_insp_mtd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_insp_mtd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_insp_std_no.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11Dtl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnWrk11Dtl_std_req_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_std_cnf_req_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk11Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk11Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk11Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk11Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk11Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk11DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk11DtlBtn(MABSP_InspItmReg p){
		p.Wrk11DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk11DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk1Btm]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Btm(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk12Tab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12Tab(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk12]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk12SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12SetDtHdr(MABSP_InspItmReg p){
		p.Wrk12SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk12Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12Dtl(MABSP_InspItmReg p){
		p.columnWrk12Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk12Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk12Dtl_insp_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk12Dtl_insp_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk12Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk12Dtl_insp_point_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_insp_point_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ql_std_val.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_digit.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_qn_int_frac.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk12Dtl_qn_out_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnWrk12Dtl_sign_out_min_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_sign_out_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_sign_out_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.REQUIRED);
		p.Wrk12Dtl_qn_in_min_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.ENABLE);
		p.columnWrk12Dtl_sign_in_min_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk12Dtl_sign_in_min_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_sign_in_max_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_in_max_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.REQUIRED);
		p.columnWrk12Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk12Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk12Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk12DtlAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12DtlAll(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk12DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk12DtlBtn(MABSP_InspItmReg p){
		p.Wrk12DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk12DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2SetDtHdr(MABSP_InspItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2Dtl(MABSP_InspItmReg p){
		p.columnWrk2Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_from_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk2Dtl_from_site_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk2Dtl_to_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_to_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk2Dtl_no_insp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_insp_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_insp_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_mrkt_judg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_no_plnt_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_no_insp_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_lmt_dt_frm_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_vld_pd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_lmt_pd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_lot_insp_vld_pd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_calc_pd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_calc_pd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_offst.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_inst_rslt_issue_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_pre_insp_valid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2DtlBtn(MABSP_InspItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3(MABSP_InspItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Dtl(MABSP_InspItmReg p){
		p.columnWrk3Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_site_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_insp_aprv_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_insp_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_in_prmt_insp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_ntfy_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_num_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_xfr_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_so_prmt_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3DtlBtn(MABSP_InspItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_InspItmReg p){
		p.Btn_open_MABCP0310.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABSP0350.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABCP0030.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABSP0160.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_InspItmReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABSP_InspItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_insp_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_insp_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Hdr_lot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sublot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_role_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Top(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk11]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk11(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk11SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk11SetDtHdr(MABSP_InspItmReg p){
		p.Wrk11SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk11Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk11Dtl(MABSP_InspItmReg p){
		p.columnWrk11Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk11Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk11Dtl_insp_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk11Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_std_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk11Dtl_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk11Dtl_std_req_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_std_cnf_req_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk11Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk11DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk11DtlBtn(MABSP_InspItmReg p){
		p.Wrk11DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk11DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk11DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk11DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk11DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk1Btm]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Btm(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk12Tab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12Tab(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk12]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk12SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12SetDtHdr(MABSP_InspItmReg p){
		p.Wrk12SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk12Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12Dtl(MABSP_InspItmReg p){
		p.columnWrk12Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk12Dtl_insp_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk12Dtl_insp_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk12Dtl_insp_point_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_point_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ql_std_val.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_digit.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_frac.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_min_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_max_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Wrk12Dtl_qn_in_min_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_in_max_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk12Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk12DtlAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12DtlAll(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk12DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk12DtlBtn(MABSP_InspItmReg p){
		p.Wrk12DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk12DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk12DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk12DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk12DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2SetDtHdr(MABSP_InspItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2Dtl(MABSP_InspItmReg p){
		p.columnWrk2Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_mfg_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_mfg_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_from_site_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk2Dtl_from_site_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk2Dtl_to_site_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_site_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_no_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_mrkt_judg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_plnt_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_insp_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_vld_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_vld_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_offst.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_inst_rslt_issue_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_insp_valid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2DtlBtn(MABSP_InspItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3(MABSP_InspItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Dtl(MABSP_InspItmReg p){
		p.columnWrk3Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_site_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_site_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_in_prmt_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ntfy_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_num_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_xfr_lot_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_so_prmt_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3DtlBtn(MABSP_InspItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_InspItmReg p){
		p.Btn_open_MABCP0310.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABSP0350.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABCP0030.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABSP0160.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_InspItmReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_InspItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lmt_ctl_categ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_insp_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_insp_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, REF, MCMode.DISABLE);
		p.Hdr_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_def_insp_aprv_role_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Top(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk11]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk11(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk11SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk11SetDtHdr(MABSP_InspItmReg p){
		p.Wrk11SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk11SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk11Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk11Dtl(MABSP_InspItmReg p){
		p.columnWrk11Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk11Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk11Dtl_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk11Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_mtd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_insp_std_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk11Dtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk11Dtl_std_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_std_cnf_req_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk11Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk11Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk11DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk11DtlBtn(MABSP_InspItmReg p){
		p.Wrk11DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk11DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk11DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk11DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk11DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk1Btm]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Btm(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk12Tab]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12Tab(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk12]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk12SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12SetDtHdr(MABSP_InspItmReg p){
		p.Wrk12SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk12Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12Dtl(MABSP_InspItmReg p){
		p.columnWrk12Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk12Dtl_insp_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk12Dtl_insp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk12Dtl_insp_point_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_point_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ql_std_val.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_digit.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_qn_int_frac.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_out_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_out_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.Wrk12Dtl_qn_in_min_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_min_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_sign_in_max_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk12Dtl_qn_in_max_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5350.MAUBP_QnInspVal_D.READ_ONLY);
		p.columnWrk12Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk12Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk12Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk12DtlAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12DtlAll(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk12DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk12DtlBtn(MABSP_InspItmReg p){
		p.Wrk12DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk12DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk12DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk12DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk12DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2SetDtHdr(MABSP_InspItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Dtl(MABSP_InspItmReg p){
		p.columnWrk2Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_from_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_from_site_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_to_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_to_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_no_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_mrkt_judg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_no_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_vld_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lmt_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_vld_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_calc_pd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_insp_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_inst_rslt_issue_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_insp_valid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2DtlBtn(MABSP_InspItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3(MABSP_InspItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Dtl(MABSP_InspItmReg p){
		p.columnWrk3Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_insp_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_in_prmt_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ntfy_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_num_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_plnt_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_mfg_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_xfr_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_so_prmt_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3DtlBtn(MABSP_InspItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_InspItmReg p){
		p.Btn_open_MABCP0310.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0350.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABCP0030.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0160.putMode(p, REF, MCMode.ENABLE);

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
		MABSP_InspItmReg_MC.setTableConfigWrk11Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.setTableConfigWrk12Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.setTableConfigWrk2Dtl((MABSP_InspItmReg)this);
		MABSP_InspItmReg_MC.setTableConfigWrk3Dtl((MABSP_InspItmReg)this);
	}

	/**
	 * [Wrk11Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk11Dtl(MABSP_InspItmReg p) {
		p.columnWrk11Dtl_check.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.check_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_check);
		p.columnWrk11Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.del_flg_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_del_flg);
		p.Wrk11DtlTable.addTable(p.Wrk11Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk11Dtl_insp_ptn_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_ptn_cd_META);
		p.columnWrk11Dtl_insp_ptn_cd.addLinkBeans(p.columnWrk11Dtl_insp_ptn_nm);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_ptn_cd);
		p.columnWrk11Dtl_insp_ptn_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_ptn_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_ptn_nm);
		p.Wrk11DtlTable.addTable(p.Wrk11Dtl_dt_p_PPanel.DtTable);
		p.columnWrk11Dtl_insp_mtd_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_mtd_typ_META);
		p.columnWrk11Dtl_insp_mtd_typ.addLinkBeans(p.columnWrk11Dtl_insp_mtd_typ_nm);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_mtd_typ);
		p.columnWrk11Dtl_insp_mtd_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_mtd_typ_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_mtd_typ_nm);
		p.columnWrk11Dtl_insp_lt.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_lt_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_lt);
		p.columnWrk11Dtl_insp_std_no.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.insp_std_no_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_insp_std_no);
		p.Wrk11DtlTable.addTable(p.Wrk11Dtl_qty_p_PPanel.QtyTable);
		p.columnWrk11Dtl_std_req_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.std_req_flg_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_std_req_flg);
		p.columnWrk11Dtl_std_cnf_req_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.std_cnf_req_flg_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_std_cnf_req_flg);
		p.columnWrk11Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.memo1_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_memo1);
		p.columnWrk11Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.memo2_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_memo2);
		p.columnWrk11Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.memo3_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_memo3);
		p.columnWrk11Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.ins_usr_id_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_ins_usr_id);
		p.columnWrk11Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.ins_usr_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_ins_usr_nm);
		p.columnWrk11Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.ins_ts_META);
		p.columnWrk11Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_ins_ts);
		p.columnWrk11Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.ins_func_id_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_ins_func_id);
		p.columnWrk11Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.ins_func_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_ins_func_nm);
		p.columnWrk11Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_cntr_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_cntr);
		p.columnWrk11Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_usr_id_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_usr_id);
		p.columnWrk11Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_usr_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_usr_nm);
		p.columnWrk11Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_ts_META);
		p.columnWrk11Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_ts);
		p.columnWrk11Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_func_id_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_func_id);
		p.columnWrk11Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_func_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_func_nm);
		p.columnWrk11Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.upd_srv_req_no_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_upd_srv_req_no);
		p.columnWrk11Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.del_usr_id_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_del_usr_id);
		p.columnWrk11Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.del_usr_nm_META);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_del_usr_nm);
		p.columnWrk11Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk11DtlR.del_ts_META);
		p.columnWrk11Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk11DtlTable.addColumnConfig(p.columnWrk11Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk11DtlTable.setUnscrollColumn(p.columnWrk11Dtl_del_flg);
	}

	/**
	 * [Wrk12Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk12Dtl(MABSP_InspItmReg p) {
		p.columnWrk12Dtl_check.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.check_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_check);
		p.columnWrk12Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.del_flg_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_del_flg);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk12Dtl_insp_ptn_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_ptn_cd_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_ptn_cd);
		p.columnWrk12Dtl_insp_seq.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_seq_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_seq);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_dt_p_PPanel.DtTable);
		p.columnWrk12Dtl_insp_point_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_point_cd_META);
		p.columnWrk12Dtl_insp_point_cd.addLinkBeans(p.columnWrk12Dtl_insp_point_nm,p.columnWrk12Dtl_insp_qlqn_typ,p.columnWrk12Dtl_unit_cd);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_point_cd);
		p.columnWrk12Dtl_insp_point_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_point_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_point_nm);
		p.columnWrk12Dtl_pre_insp_inf_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.pre_insp_inf_typ_META);
		p.columnWrk12Dtl_pre_insp_inf_typ.addLinkBeans(p.columnWrk12Dtl_pre_insp_inf_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_pre_insp_inf_typ);
		p.columnWrk12Dtl_pre_insp_inf_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.pre_insp_inf_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_pre_insp_inf_typ_nm);
		p.columnWrk12Dtl_insp_qlqn_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_qlqn_typ_META);
		p.columnWrk12Dtl_insp_qlqn_typ.addLinkBeans(p.columnWrk12Dtl_insp_qlqn_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_qlqn_typ);
		p.columnWrk12Dtl_insp_qlqn_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.insp_qlqn_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_insp_qlqn_typ_nm);
		p.columnWrk12Dtl_ql_std_val.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ql_std_val_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ql_std_val);
		p.columnWrk12Dtl_unit_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.unit_cd_META);
		p.columnWrk12Dtl_unit_cd.addLinkBeans(p.columnWrk12Dtl_unit_nm,p.columnWrk12Dtl_qn_int_frac);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_unit_cd);
		p.columnWrk12Dtl_unit_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.unit_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_unit_nm);
		p.columnWrk12Dtl_qn_int_digit.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.qn_int_digit_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_qn_int_digit);
		p.columnWrk12Dtl_qn_int_frac.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.qn_int_frac_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_qn_int_frac);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_qn_out_min_p_PPanel.QnInspValTable);
		p.Wrk12Dtl_qn_out_min_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnWrk12Dtl_sign_out_min_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_out_min_typ_META);
		p.columnWrk12Dtl_sign_out_min_typ.addLinkBeans(p.columnWrk12Dtl_sign_out_min_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_out_min_typ);
		p.columnWrk12Dtl_sign_out_min_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_out_min_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_out_min_typ_nm);
		p.columnWrk12Dtl_sign_out_max_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_out_max_typ_META);
		p.columnWrk12Dtl_sign_out_max_typ.addLinkBeans(p.columnWrk12Dtl_sign_out_max_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_out_max_typ);
		p.columnWrk12Dtl_sign_out_max_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_out_max_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_out_max_typ_nm);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_qn_out_max_p_PPanel.QnInspValTable);
		p.Wrk12Dtl_qn_out_max_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_qn_in_min_p_PPanel.QnInspValTable);
		p.Wrk12Dtl_qn_in_min_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnWrk12Dtl_sign_in_min_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_in_min_typ_META);
		p.columnWrk12Dtl_sign_in_min_typ.addLinkBeans(p.columnWrk12Dtl_sign_in_min_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_in_min_typ);
		p.columnWrk12Dtl_sign_in_min_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_in_min_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_in_min_typ_nm);
		p.columnWrk12Dtl_sign_in_max_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_in_max_typ_META);
		p.columnWrk12Dtl_sign_in_max_typ.addLinkBeans(p.columnWrk12Dtl_sign_in_max_typ_nm);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_in_max_typ);
		p.columnWrk12Dtl_sign_in_max_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.sign_in_max_typ_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_sign_in_max_typ_nm);
		p.Wrk12DtlTable.addTable(p.Wrk12Dtl_qn_in_max_p_PPanel.QnInspValTable);
		p.Wrk12Dtl_qn_in_max_p_PPanel.columnQnInspVal_qn_insp_val.setMinusEnable(true);
		p.columnWrk12Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.memo1_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_memo1);
		p.columnWrk12Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.memo2_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_memo2);
		p.columnWrk12Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.memo3_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_memo3);
		p.columnWrk12Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ins_usr_id_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ins_usr_id);
		p.columnWrk12Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ins_usr_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ins_usr_nm);
		p.columnWrk12Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ins_ts_META);
		p.columnWrk12Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ins_ts);
		p.columnWrk12Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ins_func_id_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ins_func_id);
		p.columnWrk12Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.ins_func_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_ins_func_nm);
		p.columnWrk12Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_cntr_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_cntr);
		p.columnWrk12Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_usr_id_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_usr_id);
		p.columnWrk12Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_usr_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_usr_nm);
		p.columnWrk12Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_ts_META);
		p.columnWrk12Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_ts);
		p.columnWrk12Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_func_id_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_func_id);
		p.columnWrk12Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_func_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_func_nm);
		p.columnWrk12Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.upd_srv_req_no_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_upd_srv_req_no);
		p.columnWrk12Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.del_usr_id_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_del_usr_id);
		p.columnWrk12Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.del_usr_nm_META);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_del_usr_nm);
		p.columnWrk12Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk12DtlR.del_ts_META);
		p.columnWrk12Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk12DtlTable.addColumnConfig(p.columnWrk12Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk12DtlTable.setUnscrollColumn(p.columnWrk12Dtl_del_flg);
	}

	/**
	 * [Wrk2Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk2Dtl(MABSP_InspItmReg p) {
		p.columnWrk2Dtl_check.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.check_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_check);
		p.columnWrk2Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.del_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_flg);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk2Dtl_mfg_loc_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.mfg_loc_cd_META);
		p.columnWrk2Dtl_mfg_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk2Dtl_mfg_loc_cd.addLinkBeans(p.columnWrk2Dtl_mfg_loc_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_mfg_loc_cd);
		p.columnWrk2Dtl_mfg_loc_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.mfg_loc_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_mfg_loc_nm);
		p.columnWrk2Dtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.sppl_cd_META);
		p.columnWrk2Dtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnWrk2Dtl_sppl_cd.addLinkBeans(p.columnWrk2Dtl_sppl_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sppl_cd);
		p.columnWrk2Dtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.sppl_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sppl_nm);
		p.columnWrk2Dtl_maker_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.maker_cd_META);
		p.columnWrk2Dtl_maker_cd.setListType(MCListType.STRICT);
		p.columnWrk2Dtl_maker_cd.addLinkBeans(p.columnWrk2Dtl_maker_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_maker_cd);
		p.columnWrk2Dtl_maker_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.maker_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_maker_nm);
		p.columnWrk2Dtl_from_site_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.from_site_cd_META);
		p.columnWrk2Dtl_from_site_cd.addLinkBeans(p.columnWrk2Dtl_from_site_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_from_site_cd);
		p.columnWrk2Dtl_from_site_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.from_site_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_from_site_nm);
		p.columnWrk2Dtl_to_site_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.to_site_cd_META);
		p.columnWrk2Dtl_to_site_cd.addLinkBeans(p.columnWrk2Dtl_to_site_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_to_site_cd);
		p.columnWrk2Dtl_to_site_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.to_site_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_to_site_nm);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_dt_p_PPanel.DtTable);
		p.columnWrk2Dtl_no_insp_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.no_insp_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_no_insp_flg);
		p.columnWrk2Dtl_insp_ptn_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.insp_ptn_cd_META);
		p.columnWrk2Dtl_insp_ptn_cd.addLinkBeans(p.columnWrk2Dtl_insp_ptn_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_insp_ptn_cd);
		p.columnWrk2Dtl_insp_ptn_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.insp_ptn_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_insp_ptn_nm);
		p.columnWrk2Dtl_no_mrkt_judg_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.no_mrkt_judg_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_no_mrkt_judg_flg);
		p.columnWrk2Dtl_no_plnt_aprv_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.no_plnt_aprv_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_no_plnt_aprv_flg);
		p.columnWrk2Dtl_no_insp_aprv_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.no_insp_aprv_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_no_insp_aprv_flg);
		p.columnWrk2Dtl_lmt_dt_frm_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lmt_dt_frm_typ_META);
		p.columnWrk2Dtl_lmt_dt_frm_typ.addLinkBeans(p.columnWrk2Dtl_lmt_dt_frm_typ_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lmt_dt_frm_typ);
		p.columnWrk2Dtl_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lmt_dt_frm_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lmt_dt_frm_typ_nm);
		p.columnWrk2Dtl_vld_pd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.vld_pd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_vld_pd);
		p.columnWrk2Dtl_lmt_pd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lmt_pd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lmt_pd);
		p.columnWrk2Dtl_lot_insp_vld_pd.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lot_insp_vld_pd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lot_insp_vld_pd);
		p.columnWrk2Dtl_calc_pd_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.calc_pd_typ_META);
		p.columnWrk2Dtl_calc_pd_typ.addLinkBeans(p.columnWrk2Dtl_calc_pd_typ_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_calc_pd_typ);
		p.columnWrk2Dtl_calc_pd_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.calc_pd_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_calc_pd_typ_nm);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lot_insp_lmt_dt_frm_typ_META);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.addLinkBeans(p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ);
		p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.lot_insp_lmt_dt_frm_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm);
		p.columnWrk2Dtl_insp_inst_issue_typ.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.insp_inst_issue_typ_META);
		p.columnWrk2Dtl_insp_inst_issue_typ.addLinkBeans(p.columnWrk2Dtl_insp_inst_issue_typ_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_insp_inst_issue_typ);
		p.columnWrk2Dtl_insp_inst_issue_typ_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.insp_inst_issue_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_insp_inst_issue_typ_nm);
		p.columnWrk2Dtl_insp_offst.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.insp_offst_META);
		p.columnWrk2Dtl_insp_offst.setMinusEnable(true);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_insp_offst);
		p.columnWrk2Dtl_inst_rslt_issue_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.inst_rslt_issue_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_inst_rslt_issue_flg);
		p.columnWrk2Dtl_pre_insp_valid_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.pre_insp_valid_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_pre_insp_valid_flg);
		p.columnWrk2Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.memo1_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo1);
		p.columnWrk2Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.memo2_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo2);
		p.columnWrk2Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.memo3_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo3);
		p.columnWrk2Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.ins_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_id);
		p.columnWrk2Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.ins_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_nm);
		p.columnWrk2Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.ins_ts_META);
		p.columnWrk2Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_ts);
		p.columnWrk2Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.ins_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_id);
		p.columnWrk2Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.ins_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_nm);
		p.columnWrk2Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_cntr_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_cntr);
		p.columnWrk2Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_id);
		p.columnWrk2Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_nm);
		p.columnWrk2Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_ts_META);
		p.columnWrk2Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_ts);
		p.columnWrk2Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_id);
		p.columnWrk2Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_nm);
		p.columnWrk2Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.upd_srv_req_no_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_srv_req_no);
		p.columnWrk2Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.del_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_id);
		p.columnWrk2Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.del_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_nm);
		p.columnWrk2Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk2DtlR.del_ts_META);
		p.columnWrk2Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk2DtlTable.setUnscrollColumn(p.columnWrk2Dtl_del_flg);
	}

	/**
	 * [Wrk3Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk3Dtl(MABSP_InspItmReg p) {
		p.columnWrk3Dtl_check.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.check_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_check);
		p.columnWrk3Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.del_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_flg);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk3Dtl_site_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.site_cd_META);
		p.columnWrk3Dtl_site_cd.addLinkBeans(p.columnWrk3Dtl_site_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_site_cd);
		p.columnWrk3Dtl_site_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.site_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_site_nm);
		p.columnWrk3Dtl_insp_aprv_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.insp_aprv_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_insp_aprv_flg);
		p.columnWrk3Dtl_insp_aprv_role_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.insp_aprv_role_cd_META);
		p.columnWrk3Dtl_insp_aprv_role_cd.addLinkBeans(p.columnWrk3Dtl_insp_aprv_role_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_insp_aprv_role_cd);
		p.columnWrk3Dtl_insp_aprv_role_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.insp_aprv_role_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_insp_aprv_role_nm);
		p.columnWrk3Dtl_in_prmt_insp_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.in_prmt_insp_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_in_prmt_insp_flg);
		p.columnWrk3Dtl_ntfy_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ntfy_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ntfy_nm);
		p.columnWrk3Dtl_num_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.num_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_num_id);
		p.columnWrk3Dtl_plnt_aprv_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.plnt_aprv_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_plnt_aprv_flg);
		p.columnWrk3Dtl_plnt_aprv_role_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.plnt_aprv_role_cd_META);
		p.columnWrk3Dtl_plnt_aprv_role_cd.addLinkBeans(p.columnWrk3Dtl_plnt_aprv_role_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_plnt_aprv_role_cd);
		p.columnWrk3Dtl_plnt_aprv_role_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.plnt_aprv_role_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_plnt_aprv_role_nm);
		p.columnWrk3Dtl_mfg_aprv_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.mfg_aprv_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_mfg_aprv_flg);
		p.columnWrk3Dtl_mfg_aprv_role_cd.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.mfg_aprv_role_cd_META);
		p.columnWrk3Dtl_mfg_aprv_role_cd.addLinkBeans(p.columnWrk3Dtl_mfg_aprv_role_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_mfg_aprv_role_cd);
		p.columnWrk3Dtl_mfg_aprv_role_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.mfg_aprv_role_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_mfg_aprv_role_nm);
		p.columnWrk3Dtl_xfr_lot_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.xfr_lot_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_xfr_lot_flg);
		p.columnWrk3Dtl_so_prmt_insp_flg.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.so_prmt_insp_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_so_prmt_insp_flg);
		p.columnWrk3Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.memo1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo1);
		p.columnWrk3Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.memo2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo2);
		p.columnWrk3Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.memo3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo3);
		p.columnWrk3Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ins_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_id);
		p.columnWrk3Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ins_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_nm);
		p.columnWrk3Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ins_ts_META);
		p.columnWrk3Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_ts);
		p.columnWrk3Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ins_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_id);
		p.columnWrk3Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.ins_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_nm);
		p.columnWrk3Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_cntr_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_cntr);
		p.columnWrk3Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_id);
		p.columnWrk3Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_nm);
		p.columnWrk3Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_ts_META);
		p.columnWrk3Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_ts);
		p.columnWrk3Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_id);
		p.columnWrk3Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_nm);
		p.columnWrk3Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.upd_srv_req_no_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_srv_req_no);
		p.columnWrk3Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.del_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_id);
		p.columnWrk3Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.del_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_nm);
		p.columnWrk3Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1130.Wrk3DtlR.del_ts_META);
		p.columnWrk3Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk3DtlTable.setUnscrollColumn(p.columnWrk3Dtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnWrk11Dtl_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk11Dtl_insp_ptn_cd.getListConfig().setPutter(getWrk11Dtl_insp_ptn_cd_ListPutter());
		columnWrk11Dtl_insp_mtd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk11Dtl_insp_mtd_typ.getListConfig().setPutter(getWrk11Dtl_insp_mtd_typ_ListPutter());
		columnWrk12Dtl_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_insp_ptn_cd.getListConfig().setPutter(getWrk12Dtl_insp_ptn_cd_ListPutter());
		columnWrk12Dtl_insp_point_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_insp_point_cd.getListConfig().setPutter(getWrk12Dtl_insp_point_cd_ListPutter());
		columnWrk12Dtl_pre_insp_inf_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_pre_insp_inf_typ.getListConfig().setPutter(getWrk12Dtl_pre_insp_inf_typ_ListPutter());
		columnWrk12Dtl_insp_qlqn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_insp_qlqn_typ.getListConfig().setPutter(getWrk12Dtl_insp_qlqn_typ_ListPutter());
		columnWrk12Dtl_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_unit_cd.getListConfig().setPutter(getWrk12Dtl_unit_cd_ListPutter());
		columnWrk12Dtl_sign_out_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_sign_out_min_typ.getListConfig().setPutter(getWrk12Dtl_sign_out_min_typ_ListPutter());
		columnWrk12Dtl_sign_out_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_sign_out_max_typ.getListConfig().setPutter(getWrk12Dtl_sign_out_max_typ_ListPutter());
		columnWrk12Dtl_sign_in_min_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_sign_in_min_typ.getListConfig().setPutter(getWrk12Dtl_sign_in_min_typ_ListPutter());
		columnWrk12Dtl_sign_in_max_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk12Dtl_sign_in_max_typ.getListConfig().setPutter(getWrk12Dtl_sign_in_max_typ_ListPutter());
		columnWrk2Dtl_mfg_loc_cd.getListConfig().setPutter(getWrk2Dtl_mfg_loc_cd_ListPutter());
		columnWrk2Dtl_sppl_cd.getListConfig().setPutter(getWrk2Dtl_sppl_cd_ListPutter());
		columnWrk2Dtl_maker_cd.getListConfig().setPutter(getWrk2Dtl_maker_cd_ListPutter());
		columnWrk2Dtl_from_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_from_site_cd.getListConfig().setPutter(getWrk2Dtl_from_site_cd_ListPutter());
		columnWrk2Dtl_to_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_to_site_cd.getListConfig().setPutter(getWrk2Dtl_to_site_cd_ListPutter());
		columnWrk2Dtl_insp_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_insp_ptn_cd.getListConfig().setPutter(getWrk2Dtl_insp_ptn_cd_ListPutter());
		columnWrk2Dtl_lmt_dt_frm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_lmt_dt_frm_typ.getListConfig().setPutter(getWrk2Dtl_lmt_dt_frm_typ_ListPutter());
		columnWrk2Dtl_calc_pd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_calc_pd_typ.getListConfig().setPutter(getWrk2Dtl_calc_pd_typ_ListPutter());
		columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_lot_insp_lmt_dt_frm_typ.getListConfig().setPutter(getWrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter());
		columnWrk2Dtl_insp_inst_issue_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_insp_inst_issue_typ.getListConfig().setPutter(getWrk2Dtl_insp_inst_issue_typ_ListPutter());
		columnWrk3Dtl_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_site_cd.getListConfig().setPutter(getWrk3Dtl_site_cd_ListPutter());
		columnWrk3Dtl_insp_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_insp_aprv_role_cd.getListConfig().setPutter(getWrk3Dtl_insp_aprv_role_cd_ListPutter());
		columnWrk3Dtl_plnt_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_plnt_aprv_role_cd.getListConfig().setPutter(getWrk3Dtl_plnt_aprv_role_cd_ListPutter());
		columnWrk3Dtl_mfg_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_mfg_aprv_role_cd.getListConfig().setPutter(getWrk3Dtl_mfg_aprv_role_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Wrk11Dtl_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk11Dtl_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPtn");
		return lp;
	}
	 
	/**
	 * [Wrk11Dtl_insp_mtd_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk11Dtl_insp_mtd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspMtdTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_insp_point_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_insp_point_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPoint");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_pre_insp_inf_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_pre_insp_inf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreInspInfTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_insp_qlqn_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_insp_qlqn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspQlqnTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_sign_out_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_sign_out_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_sign_out_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_sign_out_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_sign_in_min_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_sign_in_min_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Wrk12Dtl_sign_in_max_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk12Dtl_sign_in_max_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SignTyp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_from_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_from_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_to_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_to_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_insp_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_insp_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspPtn");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_lmt_dt_frm_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_lmt_dt_frm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LmtDtFrmTyp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_calc_pd_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_calc_pd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcPdTyp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_lot_insp_lmt_dt_frm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LmtDtFrmTyp");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_insp_inst_issue_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_insp_inst_issue_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspInstIssueTyp");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_insp_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_insp_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_plnt_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_plnt_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_mfg_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_mfg_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnWrk11Dtl_insp_ptn_cd) return getWrk11Dtl_insp_ptn_cd(row, info);
		if(combo == columnWrk11Dtl_insp_mtd_typ) return getWrk11Dtl_insp_mtd_typ(row, info);
		if(combo == columnWrk12Dtl_insp_ptn_cd) return getWrk12Dtl_insp_ptn_cd(row, info);
		if(combo == columnWrk12Dtl_insp_point_cd) return getWrk12Dtl_insp_point_cd(row, info);
		if(combo == columnWrk12Dtl_pre_insp_inf_typ) return getWrk12Dtl_pre_insp_inf_typ(row, info);
		if(combo == columnWrk12Dtl_insp_qlqn_typ) return getWrk12Dtl_insp_qlqn_typ(row, info);
		if(combo == columnWrk12Dtl_unit_cd) return getWrk12Dtl_unit_cd(row, info);
		if(combo == columnWrk12Dtl_sign_out_min_typ) return getWrk12Dtl_sign_out_min_typ(row, info);
		if(combo == columnWrk12Dtl_sign_out_max_typ) return getWrk12Dtl_sign_out_max_typ(row, info);
		if(combo == columnWrk12Dtl_sign_in_min_typ) return getWrk12Dtl_sign_in_min_typ(row, info);
		if(combo == columnWrk12Dtl_sign_in_max_typ) return getWrk12Dtl_sign_in_max_typ(row, info);
		if(combo == columnWrk2Dtl_mfg_loc_cd) return getWrk2Dtl_mfg_loc_cd(row, info);
		if(combo == columnWrk2Dtl_sppl_cd) return getWrk2Dtl_sppl_cd(row, info);
		if(combo == columnWrk2Dtl_maker_cd) return getWrk2Dtl_maker_cd(row, info);
		if(combo == columnWrk2Dtl_from_site_cd) return getWrk2Dtl_from_site_cd(row, info);
		if(combo == columnWrk2Dtl_to_site_cd) return getWrk2Dtl_to_site_cd(row, info);
		if(combo == columnWrk2Dtl_insp_ptn_cd) return getWrk2Dtl_insp_ptn_cd(row, info);
		if(combo == columnWrk2Dtl_lmt_dt_frm_typ) return getWrk2Dtl_lmt_dt_frm_typ(row, info);
		if(combo == columnWrk2Dtl_calc_pd_typ) return getWrk2Dtl_calc_pd_typ(row, info);
		if(combo == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) return getWrk2Dtl_lot_insp_lmt_dt_frm_typ(row, info);
		if(combo == columnWrk2Dtl_insp_inst_issue_typ) return getWrk2Dtl_insp_inst_issue_typ(row, info);
		if(combo == columnWrk3Dtl_site_cd) return getWrk3Dtl_site_cd(row, info);
		if(combo == columnWrk3Dtl_insp_aprv_role_cd) return getWrk3Dtl_insp_aprv_role_cd(row, info);
		if(combo == columnWrk3Dtl_plnt_aprv_role_cd) return getWrk3Dtl_plnt_aprv_role_cd(row, info);
		if(combo == columnWrk3Dtl_mfg_aprv_role_cd) return getWrk3Dtl_mfg_aprv_role_cd(row, info);
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
		else if (ap == Hdr_upd) doHdr_upd(info);
		else if (ap == Wrk11SetDtHdr_set_dt) doWrk11SetDtHdr_set_dt(info);
		else if (ap == Wrk11DtlBtn_select_all) doWrk11DtlBtn_select_all(info);
		else if (ap == Wrk11DtlBtn_deselect_all) doWrk11DtlBtn_deselect_all(info);
		else if (ap == Wrk11DtlBtn_radd) doWrk11DtlBtn_radd(info);
		else if (ap == Wrk11DtlBtn_rdel) doWrk11DtlBtn_rdel(info);
		else if (ap == Wrk11DtlBtn_rcopy) doWrk11DtlBtn_rcopy(info);
		else if (ap == Wrk12SetDtHdr_set_dt) doWrk12SetDtHdr_set_dt(info);
		else if (ap == Wrk12DtlBtn_select_all) doWrk12DtlBtn_select_all(info);
		else if (ap == Wrk12DtlBtn_deselect_all) doWrk12DtlBtn_deselect_all(info);
		else if (ap == Wrk12DtlBtn_radd) doWrk12DtlBtn_radd(info);
		else if (ap == Wrk12DtlBtn_rdel) doWrk12DtlBtn_rdel(info);
		else if (ap == Wrk12DtlBtn_rcopy) doWrk12DtlBtn_rcopy(info);
		else if (ap == Wrk2SetDtHdr_set_dt) doWrk2SetDtHdr_set_dt(info);
		else if (ap == Wrk2DtlBtn_select_all) doWrk2DtlBtn_select_all(info);
		else if (ap == Wrk2DtlBtn_deselect_all) doWrk2DtlBtn_deselect_all(info);
		else if (ap == Wrk2DtlBtn_radd) doWrk2DtlBtn_radd(info);
		else if (ap == Wrk2DtlBtn_rdel) doWrk2DtlBtn_rdel(info);
		else if (ap == Wrk2DtlBtn_rcopy) doWrk2DtlBtn_rcopy(info);
		else if (ap == Wrk3DtlBtn_select_all) doWrk3DtlBtn_select_all(info);
		else if (ap == Wrk3DtlBtn_deselect_all) doWrk3DtlBtn_deselect_all(info);
		else if (ap == Wrk3DtlBtn_radd) doWrk3DtlBtn_radd(info);
		else if (ap == Wrk3DtlBtn_rdel) doWrk3DtlBtn_rdel(info);
		else if (ap == Wrk3DtlBtn_rcopy) doWrk3DtlBtn_rcopy(info);
		else if (ap == Btn_open_MABCP0310) doBtn_open_MABCP0310(info);
		else if (ap == Btn_open_MABSP0350) doBtn_open_MABSP0350(info);
		else if (ap == Btn_open_MABCP0030) doBtn_open_MABCP0030(info);
		else if (ap == Btn_open_MABSP0160) doBtn_open_MABSP0160(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Hdr]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_upd(MCEventInfo info);

	/**
	 * [Wrk11SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk11DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk11DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk11DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk11DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk11DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk11DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk12SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk12DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk12DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk12DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk12DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk12DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk12DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk2SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0310(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0350]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0350(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0160(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == Wrk11DtlTable) return doWrk11Dtl_VC(info);
		if (vc == Wrk12TabTab) return doWrk12Tab_VC(info);
		if (vc == Wrk12DtlTable) return doWrk12Dtl_VC(info);
		if (vc == Wrk2DtlTable) return doWrk2Dtl_VC(info);
		if (vc == Wrk3DtlTable) return doWrk3Dtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_unit_cd) return doHdr_unit_cd_VC(info);
		if (vc == Hdr_unit_nm) return doHdr_unit_nm_VC(info);
		if (vc == Hdr_lmt_ctl_flg) return doHdr_lmt_ctl_flg_VC(info);
		if (vc == Hdr_lmt_ctl_categ) return doHdr_lmt_ctl_categ_VC(info);
		if (vc == Hdr_asset_mng_typ) return doHdr_asset_mng_typ_VC(info);
		if (vc == Hdr_asset_mng_typ_nm) return doHdr_asset_mng_typ_nm_VC(info);
		if (vc == Hdr_dec_place) return doHdr_dec_place_VC(info);
		if (vc == Hdr_insp_flg) return doHdr_insp_flg_VC(info);
		if (vc == Hdr_insp_input_flg) return doHdr_insp_input_flg_VC(info);
		if (vc == Hdr_lot_mng_typ) return doHdr_lot_mng_typ_VC(info);
		if (vc == Hdr_sublot_mng_typ) return doHdr_sublot_mng_typ_VC(info);
		if (vc == Hdr_def_insp_aprv_flg) return doHdr_def_insp_aprv_flg_VC(info);
		if (vc == Hdr_def_insp_aprv_role_cd) return doHdr_def_insp_aprv_role_cd_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_check) return doHdr_check_VC(info);
		if (vc == Wrk11SetDtHdr_st_dt) return doWrk11SetDtHdr_st_dt_VC(info);
		if (vc == Wrk11SetDtHdr_end_dt) return doWrk11SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk11Dtl_check) return doWrk11Dtl_check_VC(info);
		if (vc == columnWrk11Dtl_del_flg) return doWrk11Dtl_del_flg_VC(info);
		if (vc == columnWrk11Dtl_insp_ptn_cd) return doWrk11Dtl_insp_ptn_cd_VC(info);
		if (vc == columnWrk11Dtl_insp_ptn_nm) return doWrk11Dtl_insp_ptn_nm_VC(info);
		if (vc == columnWrk11Dtl_insp_mtd_typ) return doWrk11Dtl_insp_mtd_typ_VC(info);
		if (vc == columnWrk11Dtl_insp_mtd_typ_nm) return doWrk11Dtl_insp_mtd_typ_nm_VC(info);
		if (vc == columnWrk11Dtl_insp_lt) return doWrk11Dtl_insp_lt_VC(info);
		if (vc == columnWrk11Dtl_insp_std_no) return doWrk11Dtl_insp_std_no_VC(info);
		if (vc == columnWrk11Dtl_std_req_flg) return doWrk11Dtl_std_req_flg_VC(info);
		if (vc == columnWrk11Dtl_std_cnf_req_flg) return doWrk11Dtl_std_cnf_req_flg_VC(info);
		if (vc == columnWrk11Dtl_memo1) return doWrk11Dtl_memo1_VC(info);
		if (vc == columnWrk11Dtl_memo2) return doWrk11Dtl_memo2_VC(info);
		if (vc == columnWrk11Dtl_memo3) return doWrk11Dtl_memo3_VC(info);
		if (vc == columnWrk11Dtl_ins_usr_id) return doWrk11Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk11Dtl_ins_usr_nm) return doWrk11Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk11Dtl_ins_ts) return doWrk11Dtl_ins_ts_VC(info);
		if (vc == columnWrk11Dtl_ins_func_id) return doWrk11Dtl_ins_func_id_VC(info);
		if (vc == columnWrk11Dtl_ins_func_nm) return doWrk11Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk11Dtl_upd_cntr) return doWrk11Dtl_upd_cntr_VC(info);
		if (vc == columnWrk11Dtl_upd_usr_id) return doWrk11Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk11Dtl_upd_usr_nm) return doWrk11Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk11Dtl_upd_ts) return doWrk11Dtl_upd_ts_VC(info);
		if (vc == columnWrk11Dtl_upd_func_id) return doWrk11Dtl_upd_func_id_VC(info);
		if (vc == columnWrk11Dtl_upd_func_nm) return doWrk11Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk11Dtl_upd_srv_req_no) return doWrk11Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk11Dtl_del_usr_id) return doWrk11Dtl_del_usr_id_VC(info);
		if (vc == columnWrk11Dtl_del_usr_nm) return doWrk11Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk11Dtl_del_ts) return doWrk11Dtl_del_ts_VC(info);
		if (vc == Wrk12SetDtHdr_st_dt) return doWrk12SetDtHdr_st_dt_VC(info);
		if (vc == Wrk12SetDtHdr_end_dt) return doWrk12SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk12Dtl_check) return doWrk12Dtl_check_VC(info);
		if (vc == columnWrk12Dtl_del_flg) return doWrk12Dtl_del_flg_VC(info);
		if (vc == columnWrk12Dtl_insp_ptn_cd) return doWrk12Dtl_insp_ptn_cd_VC(info);
		if (vc == columnWrk12Dtl_insp_seq) return doWrk12Dtl_insp_seq_VC(info);
		if (vc == columnWrk12Dtl_insp_point_cd) return doWrk12Dtl_insp_point_cd_VC(info);
		if (vc == columnWrk12Dtl_insp_point_nm) return doWrk12Dtl_insp_point_nm_VC(info);
		if (vc == columnWrk12Dtl_pre_insp_inf_typ) return doWrk12Dtl_pre_insp_inf_typ_VC(info);
		if (vc == columnWrk12Dtl_pre_insp_inf_typ_nm) return doWrk12Dtl_pre_insp_inf_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_insp_qlqn_typ) return doWrk12Dtl_insp_qlqn_typ_VC(info);
		if (vc == columnWrk12Dtl_insp_qlqn_typ_nm) return doWrk12Dtl_insp_qlqn_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_ql_std_val) return doWrk12Dtl_ql_std_val_VC(info);
		if (vc == columnWrk12Dtl_unit_cd) return doWrk12Dtl_unit_cd_VC(info);
		if (vc == columnWrk12Dtl_unit_nm) return doWrk12Dtl_unit_nm_VC(info);
		if (vc == columnWrk12Dtl_qn_int_digit) return doWrk12Dtl_qn_int_digit_VC(info);
		if (vc == columnWrk12Dtl_qn_int_frac) return doWrk12Dtl_qn_int_frac_VC(info);
		if (vc == columnWrk12Dtl_sign_out_min_typ) return doWrk12Dtl_sign_out_min_typ_VC(info);
		if (vc == columnWrk12Dtl_sign_out_min_typ_nm) return doWrk12Dtl_sign_out_min_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_sign_out_max_typ) return doWrk12Dtl_sign_out_max_typ_VC(info);
		if (vc == columnWrk12Dtl_sign_out_max_typ_nm) return doWrk12Dtl_sign_out_max_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_sign_in_min_typ) return doWrk12Dtl_sign_in_min_typ_VC(info);
		if (vc == columnWrk12Dtl_sign_in_min_typ_nm) return doWrk12Dtl_sign_in_min_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_sign_in_max_typ) return doWrk12Dtl_sign_in_max_typ_VC(info);
		if (vc == columnWrk12Dtl_sign_in_max_typ_nm) return doWrk12Dtl_sign_in_max_typ_nm_VC(info);
		if (vc == columnWrk12Dtl_memo1) return doWrk12Dtl_memo1_VC(info);
		if (vc == columnWrk12Dtl_memo2) return doWrk12Dtl_memo2_VC(info);
		if (vc == columnWrk12Dtl_memo3) return doWrk12Dtl_memo3_VC(info);
		if (vc == columnWrk12Dtl_ins_usr_id) return doWrk12Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk12Dtl_ins_usr_nm) return doWrk12Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk12Dtl_ins_ts) return doWrk12Dtl_ins_ts_VC(info);
		if (vc == columnWrk12Dtl_ins_func_id) return doWrk12Dtl_ins_func_id_VC(info);
		if (vc == columnWrk12Dtl_ins_func_nm) return doWrk12Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk12Dtl_upd_cntr) return doWrk12Dtl_upd_cntr_VC(info);
		if (vc == columnWrk12Dtl_upd_usr_id) return doWrk12Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk12Dtl_upd_usr_nm) return doWrk12Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk12Dtl_upd_ts) return doWrk12Dtl_upd_ts_VC(info);
		if (vc == columnWrk12Dtl_upd_func_id) return doWrk12Dtl_upd_func_id_VC(info);
		if (vc == columnWrk12Dtl_upd_func_nm) return doWrk12Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk12Dtl_upd_srv_req_no) return doWrk12Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk12Dtl_del_usr_id) return doWrk12Dtl_del_usr_id_VC(info);
		if (vc == columnWrk12Dtl_del_usr_nm) return doWrk12Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk12Dtl_del_ts) return doWrk12Dtl_del_ts_VC(info);
		if (vc == Wrk2SetDtHdr_st_dt) return doWrk2SetDtHdr_st_dt_VC(info);
		if (vc == Wrk2SetDtHdr_end_dt) return doWrk2SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk2Dtl_check) return doWrk2Dtl_check_VC(info);
		if (vc == columnWrk2Dtl_del_flg) return doWrk2Dtl_del_flg_VC(info);
		if (vc == columnWrk2Dtl_mfg_loc_cd) return doWrk2Dtl_mfg_loc_cd_VC(info);
		if (vc == columnWrk2Dtl_mfg_loc_nm) return doWrk2Dtl_mfg_loc_nm_VC(info);
		if (vc == columnWrk2Dtl_sppl_cd) return doWrk2Dtl_sppl_cd_VC(info);
		if (vc == columnWrk2Dtl_sppl_nm) return doWrk2Dtl_sppl_nm_VC(info);
		if (vc == columnWrk2Dtl_maker_cd) return doWrk2Dtl_maker_cd_VC(info);
		if (vc == columnWrk2Dtl_maker_nm) return doWrk2Dtl_maker_nm_VC(info);
		if (vc == columnWrk2Dtl_from_site_cd) return doWrk2Dtl_from_site_cd_VC(info);
		if (vc == columnWrk2Dtl_from_site_nm) return doWrk2Dtl_from_site_nm_VC(info);
		if (vc == columnWrk2Dtl_to_site_cd) return doWrk2Dtl_to_site_cd_VC(info);
		if (vc == columnWrk2Dtl_to_site_nm) return doWrk2Dtl_to_site_nm_VC(info);
		if (vc == columnWrk2Dtl_no_insp_flg) return doWrk2Dtl_no_insp_flg_VC(info);
		if (vc == columnWrk2Dtl_insp_ptn_cd) return doWrk2Dtl_insp_ptn_cd_VC(info);
		if (vc == columnWrk2Dtl_insp_ptn_nm) return doWrk2Dtl_insp_ptn_nm_VC(info);
		if (vc == columnWrk2Dtl_no_mrkt_judg_flg) return doWrk2Dtl_no_mrkt_judg_flg_VC(info);
		if (vc == columnWrk2Dtl_no_plnt_aprv_flg) return doWrk2Dtl_no_plnt_aprv_flg_VC(info);
		if (vc == columnWrk2Dtl_no_insp_aprv_flg) return doWrk2Dtl_no_insp_aprv_flg_VC(info);
		if (vc == columnWrk2Dtl_lmt_dt_frm_typ) return doWrk2Dtl_lmt_dt_frm_typ_VC(info);
		if (vc == columnWrk2Dtl_lmt_dt_frm_typ_nm) return doWrk2Dtl_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_vld_pd) return doWrk2Dtl_vld_pd_VC(info);
		if (vc == columnWrk2Dtl_lmt_pd) return doWrk2Dtl_lmt_pd_VC(info);
		if (vc == columnWrk2Dtl_lot_insp_vld_pd) return doWrk2Dtl_lot_insp_vld_pd_VC(info);
		if (vc == columnWrk2Dtl_calc_pd_typ) return doWrk2Dtl_calc_pd_typ_VC(info);
		if (vc == columnWrk2Dtl_calc_pd_typ_nm) return doWrk2Dtl_calc_pd_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) return doWrk2Dtl_lot_insp_lmt_dt_frm_typ_VC(info);
		if (vc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm) return doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_insp_inst_issue_typ) return doWrk2Dtl_insp_inst_issue_typ_VC(info);
		if (vc == columnWrk2Dtl_insp_inst_issue_typ_nm) return doWrk2Dtl_insp_inst_issue_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_insp_offst) return doWrk2Dtl_insp_offst_VC(info);
		if (vc == columnWrk2Dtl_inst_rslt_issue_flg) return doWrk2Dtl_inst_rslt_issue_flg_VC(info);
		if (vc == columnWrk2Dtl_pre_insp_valid_flg) return doWrk2Dtl_pre_insp_valid_flg_VC(info);
		if (vc == columnWrk2Dtl_memo1) return doWrk2Dtl_memo1_VC(info);
		if (vc == columnWrk2Dtl_memo2) return doWrk2Dtl_memo2_VC(info);
		if (vc == columnWrk2Dtl_memo3) return doWrk2Dtl_memo3_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_id) return doWrk2Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_nm) return doWrk2Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_ins_ts) return doWrk2Dtl_ins_ts_VC(info);
		if (vc == columnWrk2Dtl_ins_func_id) return doWrk2Dtl_ins_func_id_VC(info);
		if (vc == columnWrk2Dtl_ins_func_nm) return doWrk2Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_cntr) return doWrk2Dtl_upd_cntr_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_id) return doWrk2Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_nm) return doWrk2Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_ts) return doWrk2Dtl_upd_ts_VC(info);
		if (vc == columnWrk2Dtl_upd_func_id) return doWrk2Dtl_upd_func_id_VC(info);
		if (vc == columnWrk2Dtl_upd_func_nm) return doWrk2Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_srv_req_no) return doWrk2Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk2Dtl_del_usr_id) return doWrk2Dtl_del_usr_id_VC(info);
		if (vc == columnWrk2Dtl_del_usr_nm) return doWrk2Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_del_ts) return doWrk2Dtl_del_ts_VC(info);
		if (vc == columnWrk3Dtl_check) return doWrk3Dtl_check_VC(info);
		if (vc == columnWrk3Dtl_del_flg) return doWrk3Dtl_del_flg_VC(info);
		if (vc == columnWrk3Dtl_site_cd) return doWrk3Dtl_site_cd_VC(info);
		if (vc == columnWrk3Dtl_site_nm) return doWrk3Dtl_site_nm_VC(info);
		if (vc == columnWrk3Dtl_insp_aprv_flg) return doWrk3Dtl_insp_aprv_flg_VC(info);
		if (vc == columnWrk3Dtl_insp_aprv_role_cd) return doWrk3Dtl_insp_aprv_role_cd_VC(info);
		if (vc == columnWrk3Dtl_insp_aprv_role_nm) return doWrk3Dtl_insp_aprv_role_nm_VC(info);
		if (vc == columnWrk3Dtl_in_prmt_insp_flg) return doWrk3Dtl_in_prmt_insp_flg_VC(info);
		if (vc == columnWrk3Dtl_ntfy_nm) return doWrk3Dtl_ntfy_nm_VC(info);
		if (vc == columnWrk3Dtl_num_id) return doWrk3Dtl_num_id_VC(info);
		if (vc == columnWrk3Dtl_plnt_aprv_flg) return doWrk3Dtl_plnt_aprv_flg_VC(info);
		if (vc == columnWrk3Dtl_plnt_aprv_role_cd) return doWrk3Dtl_plnt_aprv_role_cd_VC(info);
		if (vc == columnWrk3Dtl_plnt_aprv_role_nm) return doWrk3Dtl_plnt_aprv_role_nm_VC(info);
		if (vc == columnWrk3Dtl_mfg_aprv_flg) return doWrk3Dtl_mfg_aprv_flg_VC(info);
		if (vc == columnWrk3Dtl_mfg_aprv_role_cd) return doWrk3Dtl_mfg_aprv_role_cd_VC(info);
		if (vc == columnWrk3Dtl_mfg_aprv_role_nm) return doWrk3Dtl_mfg_aprv_role_nm_VC(info);
		if (vc == columnWrk3Dtl_xfr_lot_flg) return doWrk3Dtl_xfr_lot_flg_VC(info);
		if (vc == columnWrk3Dtl_so_prmt_insp_flg) return doWrk3Dtl_so_prmt_insp_flg_VC(info);
		if (vc == columnWrk3Dtl_memo1) return doWrk3Dtl_memo1_VC(info);
		if (vc == columnWrk3Dtl_memo2) return doWrk3Dtl_memo2_VC(info);
		if (vc == columnWrk3Dtl_memo3) return doWrk3Dtl_memo3_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_id) return doWrk3Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_nm) return doWrk3Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_ins_ts) return doWrk3Dtl_ins_ts_VC(info);
		if (vc == columnWrk3Dtl_ins_func_id) return doWrk3Dtl_ins_func_id_VC(info);
		if (vc == columnWrk3Dtl_ins_func_nm) return doWrk3Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_cntr) return doWrk3Dtl_upd_cntr_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_id) return doWrk3Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_nm) return doWrk3Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_ts) return doWrk3Dtl_upd_ts_VC(info);
		if (vc == columnWrk3Dtl_upd_func_id) return doWrk3Dtl_upd_func_id_VC(info);
		if (vc == columnWrk3Dtl_upd_func_nm) return doWrk3Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_srv_req_no) return doWrk3Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk3Dtl_del_usr_id) return doWrk3Dtl_del_usr_id_VC(info);
		if (vc == columnWrk3Dtl_del_usr_nm) return doWrk3Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_del_ts) return doWrk3Dtl_del_ts_VC(info);
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Tab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Tab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lmt_ctl_categ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[insp_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_insp_input_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_def_insp_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_std_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_insp_std_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[std_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_std_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[std_cnf_req_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_std_cnf_req_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk11Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk11Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_point_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_point_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_pre_insp_inf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_pre_insp_inf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_qlqn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_insp_qlqn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ql_std_val]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ql_std_val_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_digit]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_qn_int_digit_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_frac]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_qn_int_frac_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_out_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_out_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_out_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_out_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_in_min_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_in_min_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_in_max_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_sign_in_max_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk12Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk12Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_from_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_from_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_to_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_to_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_no_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_insp_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_insp_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[no_mrkt_judg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_no_mrkt_judg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[no_plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_no_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_no_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lmt_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lot_insp_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_calc_pd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_calc_pd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lot_insp_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_insp_inst_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_insp_inst_issue_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_insp_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[inst_rslt_issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_inst_rslt_issue_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_insp_valid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_pre_insp_valid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_insp_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_insp_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_insp_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[in_prmt_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_in_prmt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ntfy_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ntfy_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[num_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_num_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_plnt_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_plnt_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_plnt_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_mfg_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_mfg_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_mfg_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[xfr_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_xfr_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[so_prmt_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_so_prmt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_ts_VC(MCEventInfo info){
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
		if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == Wrk11DtlTable) doWrk11Dtl_NC(info);
		else if (nc == Wrk12TabTab) doWrk12Tab_NC(info);
		else if (nc == Wrk12DtlTable) doWrk12Dtl_NC(info);
		else if (nc == Wrk2DtlTable) doWrk2Dtl_NC(info);
		else if (nc == Wrk3DtlTable) doWrk3Dtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_unit_cd) doHdr_unit_cd_NC(info);
		else if (nc == Hdr_unit_nm) doHdr_unit_nm_NC(info);
		else if (nc == Hdr_lmt_ctl_flg) doHdr_lmt_ctl_flg_NC(info);
		else if (nc == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NC(info);
		else if (nc == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NC(info);
		else if (nc == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NC(info);
		else if (nc == Hdr_dec_place) doHdr_dec_place_NC(info);
		else if (nc == Hdr_insp_flg) doHdr_insp_flg_NC(info);
		else if (nc == Hdr_insp_input_flg) doHdr_insp_input_flg_NC(info);
		else if (nc == Hdr_lot_mng_typ) doHdr_lot_mng_typ_NC(info);
		else if (nc == Hdr_sublot_mng_typ) doHdr_sublot_mng_typ_NC(info);
		else if (nc == Hdr_def_insp_aprv_flg) doHdr_def_insp_aprv_flg_NC(info);
		else if (nc == Hdr_def_insp_aprv_role_cd) doHdr_def_insp_aprv_role_cd_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_check) doHdr_check_NC(info);
		else if (nc == Wrk11SetDtHdr_st_dt) doWrk11SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk11SetDtHdr_end_dt) doWrk11SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk11Dtl_check) doWrk11Dtl_check_NC(info);
		else if (nc == columnWrk11Dtl_del_flg) doWrk11Dtl_del_flg_NC(info);
		else if (nc == columnWrk11Dtl_insp_ptn_cd) doWrk11Dtl_insp_ptn_cd_NC(info);
		else if (nc == columnWrk11Dtl_insp_ptn_nm) doWrk11Dtl_insp_ptn_nm_NC(info);
		else if (nc == columnWrk11Dtl_insp_mtd_typ) doWrk11Dtl_insp_mtd_typ_NC(info);
		else if (nc == columnWrk11Dtl_insp_mtd_typ_nm) doWrk11Dtl_insp_mtd_typ_nm_NC(info);
		else if (nc == columnWrk11Dtl_insp_lt) doWrk11Dtl_insp_lt_NC(info);
		else if (nc == columnWrk11Dtl_insp_std_no) doWrk11Dtl_insp_std_no_NC(info);
		else if (nc == columnWrk11Dtl_std_req_flg) doWrk11Dtl_std_req_flg_NC(info);
		else if (nc == columnWrk11Dtl_std_cnf_req_flg) doWrk11Dtl_std_cnf_req_flg_NC(info);
		else if (nc == columnWrk11Dtl_memo1) doWrk11Dtl_memo1_NC(info);
		else if (nc == columnWrk11Dtl_memo2) doWrk11Dtl_memo2_NC(info);
		else if (nc == columnWrk11Dtl_memo3) doWrk11Dtl_memo3_NC(info);
		else if (nc == columnWrk11Dtl_ins_usr_id) doWrk11Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk11Dtl_ins_usr_nm) doWrk11Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk11Dtl_ins_ts) doWrk11Dtl_ins_ts_NC(info);
		else if (nc == columnWrk11Dtl_ins_func_id) doWrk11Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk11Dtl_ins_func_nm) doWrk11Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk11Dtl_upd_cntr) doWrk11Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk11Dtl_upd_usr_id) doWrk11Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk11Dtl_upd_usr_nm) doWrk11Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk11Dtl_upd_ts) doWrk11Dtl_upd_ts_NC(info);
		else if (nc == columnWrk11Dtl_upd_func_id) doWrk11Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk11Dtl_upd_func_nm) doWrk11Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk11Dtl_upd_srv_req_no) doWrk11Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk11Dtl_del_usr_id) doWrk11Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk11Dtl_del_usr_nm) doWrk11Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk11Dtl_del_ts) doWrk11Dtl_del_ts_NC(info);
		else if (nc == Wrk12SetDtHdr_st_dt) doWrk12SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk12SetDtHdr_end_dt) doWrk12SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk12Dtl_check) doWrk12Dtl_check_NC(info);
		else if (nc == columnWrk12Dtl_del_flg) doWrk12Dtl_del_flg_NC(info);
		else if (nc == columnWrk12Dtl_insp_ptn_cd) doWrk12Dtl_insp_ptn_cd_NC(info);
		else if (nc == columnWrk12Dtl_insp_seq) doWrk12Dtl_insp_seq_NC(info);
		else if (nc == columnWrk12Dtl_insp_point_cd) doWrk12Dtl_insp_point_cd_NC(info);
		else if (nc == columnWrk12Dtl_insp_point_nm) doWrk12Dtl_insp_point_nm_NC(info);
		else if (nc == columnWrk12Dtl_pre_insp_inf_typ) doWrk12Dtl_pre_insp_inf_typ_NC(info);
		else if (nc == columnWrk12Dtl_pre_insp_inf_typ_nm) doWrk12Dtl_pre_insp_inf_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_insp_qlqn_typ) doWrk12Dtl_insp_qlqn_typ_NC(info);
		else if (nc == columnWrk12Dtl_insp_qlqn_typ_nm) doWrk12Dtl_insp_qlqn_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_ql_std_val) doWrk12Dtl_ql_std_val_NC(info);
		else if (nc == columnWrk12Dtl_unit_cd) doWrk12Dtl_unit_cd_NC(info);
		else if (nc == columnWrk12Dtl_unit_nm) doWrk12Dtl_unit_nm_NC(info);
		else if (nc == columnWrk12Dtl_qn_int_digit) doWrk12Dtl_qn_int_digit_NC(info);
		else if (nc == columnWrk12Dtl_qn_int_frac) doWrk12Dtl_qn_int_frac_NC(info);
		else if (nc == columnWrk12Dtl_sign_out_min_typ) doWrk12Dtl_sign_out_min_typ_NC(info);
		else if (nc == columnWrk12Dtl_sign_out_min_typ_nm) doWrk12Dtl_sign_out_min_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_sign_out_max_typ) doWrk12Dtl_sign_out_max_typ_NC(info);
		else if (nc == columnWrk12Dtl_sign_out_max_typ_nm) doWrk12Dtl_sign_out_max_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_sign_in_min_typ) doWrk12Dtl_sign_in_min_typ_NC(info);
		else if (nc == columnWrk12Dtl_sign_in_min_typ_nm) doWrk12Dtl_sign_in_min_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_sign_in_max_typ) doWrk12Dtl_sign_in_max_typ_NC(info);
		else if (nc == columnWrk12Dtl_sign_in_max_typ_nm) doWrk12Dtl_sign_in_max_typ_nm_NC(info);
		else if (nc == columnWrk12Dtl_memo1) doWrk12Dtl_memo1_NC(info);
		else if (nc == columnWrk12Dtl_memo2) doWrk12Dtl_memo2_NC(info);
		else if (nc == columnWrk12Dtl_memo3) doWrk12Dtl_memo3_NC(info);
		else if (nc == columnWrk12Dtl_ins_usr_id) doWrk12Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk12Dtl_ins_usr_nm) doWrk12Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk12Dtl_ins_ts) doWrk12Dtl_ins_ts_NC(info);
		else if (nc == columnWrk12Dtl_ins_func_id) doWrk12Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk12Dtl_ins_func_nm) doWrk12Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk12Dtl_upd_cntr) doWrk12Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk12Dtl_upd_usr_id) doWrk12Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk12Dtl_upd_usr_nm) doWrk12Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk12Dtl_upd_ts) doWrk12Dtl_upd_ts_NC(info);
		else if (nc == columnWrk12Dtl_upd_func_id) doWrk12Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk12Dtl_upd_func_nm) doWrk12Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk12Dtl_upd_srv_req_no) doWrk12Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk12Dtl_del_usr_id) doWrk12Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk12Dtl_del_usr_nm) doWrk12Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk12Dtl_del_ts) doWrk12Dtl_del_ts_NC(info);
		else if (nc == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk2Dtl_check) doWrk2Dtl_check_NC(info);
		else if (nc == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NC(info);
		else if (nc == columnWrk2Dtl_mfg_loc_cd) doWrk2Dtl_mfg_loc_cd_NC(info);
		else if (nc == columnWrk2Dtl_mfg_loc_nm) doWrk2Dtl_mfg_loc_nm_NC(info);
		else if (nc == columnWrk2Dtl_sppl_cd) doWrk2Dtl_sppl_cd_NC(info);
		else if (nc == columnWrk2Dtl_sppl_nm) doWrk2Dtl_sppl_nm_NC(info);
		else if (nc == columnWrk2Dtl_maker_cd) doWrk2Dtl_maker_cd_NC(info);
		else if (nc == columnWrk2Dtl_maker_nm) doWrk2Dtl_maker_nm_NC(info);
		else if (nc == columnWrk2Dtl_from_site_cd) doWrk2Dtl_from_site_cd_NC(info);
		else if (nc == columnWrk2Dtl_from_site_nm) doWrk2Dtl_from_site_nm_NC(info);
		else if (nc == columnWrk2Dtl_to_site_cd) doWrk2Dtl_to_site_cd_NC(info);
		else if (nc == columnWrk2Dtl_to_site_nm) doWrk2Dtl_to_site_nm_NC(info);
		else if (nc == columnWrk2Dtl_no_insp_flg) doWrk2Dtl_no_insp_flg_NC(info);
		else if (nc == columnWrk2Dtl_insp_ptn_cd) doWrk2Dtl_insp_ptn_cd_NC(info);
		else if (nc == columnWrk2Dtl_insp_ptn_nm) doWrk2Dtl_insp_ptn_nm_NC(info);
		else if (nc == columnWrk2Dtl_no_mrkt_judg_flg) doWrk2Dtl_no_mrkt_judg_flg_NC(info);
		else if (nc == columnWrk2Dtl_no_plnt_aprv_flg) doWrk2Dtl_no_plnt_aprv_flg_NC(info);
		else if (nc == columnWrk2Dtl_no_insp_aprv_flg) doWrk2Dtl_no_insp_aprv_flg_NC(info);
		else if (nc == columnWrk2Dtl_lmt_dt_frm_typ) doWrk2Dtl_lmt_dt_frm_typ_NC(info);
		else if (nc == columnWrk2Dtl_lmt_dt_frm_typ_nm) doWrk2Dtl_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_vld_pd) doWrk2Dtl_vld_pd_NC(info);
		else if (nc == columnWrk2Dtl_lmt_pd) doWrk2Dtl_lmt_pd_NC(info);
		else if (nc == columnWrk2Dtl_lot_insp_vld_pd) doWrk2Dtl_lot_insp_vld_pd_NC(info);
		else if (nc == columnWrk2Dtl_calc_pd_typ) doWrk2Dtl_calc_pd_typ_NC(info);
		else if (nc == columnWrk2Dtl_calc_pd_typ_nm) doWrk2Dtl_calc_pd_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NC(info);
		else if (nc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_insp_inst_issue_typ) doWrk2Dtl_insp_inst_issue_typ_NC(info);
		else if (nc == columnWrk2Dtl_insp_inst_issue_typ_nm) doWrk2Dtl_insp_inst_issue_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_insp_offst) doWrk2Dtl_insp_offst_NC(info);
		else if (nc == columnWrk2Dtl_inst_rslt_issue_flg) doWrk2Dtl_inst_rslt_issue_flg_NC(info);
		else if (nc == columnWrk2Dtl_pre_insp_valid_flg) doWrk2Dtl_pre_insp_valid_flg_NC(info);
		else if (nc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NC(info);
		else if (nc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NC(info);
		else if (nc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NC(info);
		else if (nc == columnWrk3Dtl_check) doWrk3Dtl_check_NC(info);
		else if (nc == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NC(info);
		else if (nc == columnWrk3Dtl_site_cd) doWrk3Dtl_site_cd_NC(info);
		else if (nc == columnWrk3Dtl_site_nm) doWrk3Dtl_site_nm_NC(info);
		else if (nc == columnWrk3Dtl_insp_aprv_flg) doWrk3Dtl_insp_aprv_flg_NC(info);
		else if (nc == columnWrk3Dtl_insp_aprv_role_cd) doWrk3Dtl_insp_aprv_role_cd_NC(info);
		else if (nc == columnWrk3Dtl_insp_aprv_role_nm) doWrk3Dtl_insp_aprv_role_nm_NC(info);
		else if (nc == columnWrk3Dtl_in_prmt_insp_flg) doWrk3Dtl_in_prmt_insp_flg_NC(info);
		else if (nc == columnWrk3Dtl_ntfy_nm) doWrk3Dtl_ntfy_nm_NC(info);
		else if (nc == columnWrk3Dtl_num_id) doWrk3Dtl_num_id_NC(info);
		else if (nc == columnWrk3Dtl_plnt_aprv_flg) doWrk3Dtl_plnt_aprv_flg_NC(info);
		else if (nc == columnWrk3Dtl_plnt_aprv_role_cd) doWrk3Dtl_plnt_aprv_role_cd_NC(info);
		else if (nc == columnWrk3Dtl_plnt_aprv_role_nm) doWrk3Dtl_plnt_aprv_role_nm_NC(info);
		else if (nc == columnWrk3Dtl_mfg_aprv_flg) doWrk3Dtl_mfg_aprv_flg_NC(info);
		else if (nc == columnWrk3Dtl_mfg_aprv_role_cd) doWrk3Dtl_mfg_aprv_role_cd_NC(info);
		else if (nc == columnWrk3Dtl_mfg_aprv_role_nm) doWrk3Dtl_mfg_aprv_role_nm_NC(info);
		else if (nc == columnWrk3Dtl_xfr_lot_flg) doWrk3Dtl_xfr_lot_flg_NC(info);
		else if (nc == columnWrk3Dtl_so_prmt_insp_flg) doWrk3Dtl_so_prmt_insp_flg_NC(info);
		else if (nc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NC(info);
		else if (nc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NC(info);
		else if (nc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NC(info);
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Tab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Tab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_std_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_std_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_cnf_req_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_cnf_req_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ql_std_val]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ql_std_val_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_digit]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_digit_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_frac]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_frac_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_mrkt_judg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_mrkt_judg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_offst_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[inst_rslt_issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_inst_rslt_issue_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_insp_valid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_insp_valid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[in_prmt_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_in_prmt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ntfy_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[num_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_num_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[xfr_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_xfr_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[so_prmt_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_so_prmt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == Wrk11DtlTable) doWrk11Dtl_NE(info);
		else if (ne == Wrk12TabTab) doWrk12Tab_NE(info);
		else if (ne == Wrk12DtlTable) doWrk12Dtl_NE(info);
		else if (ne == Wrk2DtlTable) doWrk2Dtl_NE(info);
		else if (ne == Wrk3DtlTable) doWrk3Dtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_unit_cd) doHdr_unit_cd_NE(info);
		else if (ne == Hdr_unit_nm) doHdr_unit_nm_NE(info);
		else if (ne == Hdr_lmt_ctl_flg) doHdr_lmt_ctl_flg_NE(info);
		else if (ne == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NE(info);
		else if (ne == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NE(info);
		else if (ne == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NE(info);
		else if (ne == Hdr_dec_place) doHdr_dec_place_NE(info);
		else if (ne == Hdr_insp_flg) doHdr_insp_flg_NE(info);
		else if (ne == Hdr_insp_input_flg) doHdr_insp_input_flg_NE(info);
		else if (ne == Hdr_lot_mng_typ) doHdr_lot_mng_typ_NE(info);
		else if (ne == Hdr_sublot_mng_typ) doHdr_sublot_mng_typ_NE(info);
		else if (ne == Hdr_def_insp_aprv_flg) doHdr_def_insp_aprv_flg_NE(info);
		else if (ne == Hdr_def_insp_aprv_role_cd) doHdr_def_insp_aprv_role_cd_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_check) doHdr_check_NE(info);
		else if (ne == Wrk11SetDtHdr_st_dt) doWrk11SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk11SetDtHdr_end_dt) doWrk11SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk11Dtl_check) doWrk11Dtl_check_NE(info);
		else if (ne == columnWrk11Dtl_del_flg) doWrk11Dtl_del_flg_NE(info);
		else if (ne == columnWrk11Dtl_insp_ptn_cd) doWrk11Dtl_insp_ptn_cd_NE(info);
		else if (ne == columnWrk11Dtl_insp_ptn_nm) doWrk11Dtl_insp_ptn_nm_NE(info);
		else if (ne == columnWrk11Dtl_insp_mtd_typ) doWrk11Dtl_insp_mtd_typ_NE(info);
		else if (ne == columnWrk11Dtl_insp_mtd_typ_nm) doWrk11Dtl_insp_mtd_typ_nm_NE(info);
		else if (ne == columnWrk11Dtl_insp_lt) doWrk11Dtl_insp_lt_NE(info);
		else if (ne == columnWrk11Dtl_insp_std_no) doWrk11Dtl_insp_std_no_NE(info);
		else if (ne == columnWrk11Dtl_std_req_flg) doWrk11Dtl_std_req_flg_NE(info);
		else if (ne == columnWrk11Dtl_std_cnf_req_flg) doWrk11Dtl_std_cnf_req_flg_NE(info);
		else if (ne == columnWrk11Dtl_memo1) doWrk11Dtl_memo1_NE(info);
		else if (ne == columnWrk11Dtl_memo2) doWrk11Dtl_memo2_NE(info);
		else if (ne == columnWrk11Dtl_memo3) doWrk11Dtl_memo3_NE(info);
		else if (ne == columnWrk11Dtl_ins_usr_id) doWrk11Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk11Dtl_ins_usr_nm) doWrk11Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk11Dtl_ins_ts) doWrk11Dtl_ins_ts_NE(info);
		else if (ne == columnWrk11Dtl_ins_func_id) doWrk11Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk11Dtl_ins_func_nm) doWrk11Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk11Dtl_upd_cntr) doWrk11Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk11Dtl_upd_usr_id) doWrk11Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk11Dtl_upd_usr_nm) doWrk11Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk11Dtl_upd_ts) doWrk11Dtl_upd_ts_NE(info);
		else if (ne == columnWrk11Dtl_upd_func_id) doWrk11Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk11Dtl_upd_func_nm) doWrk11Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk11Dtl_upd_srv_req_no) doWrk11Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk11Dtl_del_usr_id) doWrk11Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk11Dtl_del_usr_nm) doWrk11Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk11Dtl_del_ts) doWrk11Dtl_del_ts_NE(info);
		else if (ne == Wrk12SetDtHdr_st_dt) doWrk12SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk12SetDtHdr_end_dt) doWrk12SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk12Dtl_check) doWrk12Dtl_check_NE(info);
		else if (ne == columnWrk12Dtl_del_flg) doWrk12Dtl_del_flg_NE(info);
		else if (ne == columnWrk12Dtl_insp_ptn_cd) doWrk12Dtl_insp_ptn_cd_NE(info);
		else if (ne == columnWrk12Dtl_insp_seq) doWrk12Dtl_insp_seq_NE(info);
		else if (ne == columnWrk12Dtl_insp_point_cd) doWrk12Dtl_insp_point_cd_NE(info);
		else if (ne == columnWrk12Dtl_insp_point_nm) doWrk12Dtl_insp_point_nm_NE(info);
		else if (ne == columnWrk12Dtl_pre_insp_inf_typ) doWrk12Dtl_pre_insp_inf_typ_NE(info);
		else if (ne == columnWrk12Dtl_pre_insp_inf_typ_nm) doWrk12Dtl_pre_insp_inf_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_insp_qlqn_typ) doWrk12Dtl_insp_qlqn_typ_NE(info);
		else if (ne == columnWrk12Dtl_insp_qlqn_typ_nm) doWrk12Dtl_insp_qlqn_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_ql_std_val) doWrk12Dtl_ql_std_val_NE(info);
		else if (ne == columnWrk12Dtl_unit_cd) doWrk12Dtl_unit_cd_NE(info);
		else if (ne == columnWrk12Dtl_unit_nm) doWrk12Dtl_unit_nm_NE(info);
		else if (ne == columnWrk12Dtl_qn_int_digit) doWrk12Dtl_qn_int_digit_NE(info);
		else if (ne == columnWrk12Dtl_qn_int_frac) doWrk12Dtl_qn_int_frac_NE(info);
		else if (ne == columnWrk12Dtl_sign_out_min_typ) doWrk12Dtl_sign_out_min_typ_NE(info);
		else if (ne == columnWrk12Dtl_sign_out_min_typ_nm) doWrk12Dtl_sign_out_min_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_sign_out_max_typ) doWrk12Dtl_sign_out_max_typ_NE(info);
		else if (ne == columnWrk12Dtl_sign_out_max_typ_nm) doWrk12Dtl_sign_out_max_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_sign_in_min_typ) doWrk12Dtl_sign_in_min_typ_NE(info);
		else if (ne == columnWrk12Dtl_sign_in_min_typ_nm) doWrk12Dtl_sign_in_min_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_sign_in_max_typ) doWrk12Dtl_sign_in_max_typ_NE(info);
		else if (ne == columnWrk12Dtl_sign_in_max_typ_nm) doWrk12Dtl_sign_in_max_typ_nm_NE(info);
		else if (ne == columnWrk12Dtl_memo1) doWrk12Dtl_memo1_NE(info);
		else if (ne == columnWrk12Dtl_memo2) doWrk12Dtl_memo2_NE(info);
		else if (ne == columnWrk12Dtl_memo3) doWrk12Dtl_memo3_NE(info);
		else if (ne == columnWrk12Dtl_ins_usr_id) doWrk12Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk12Dtl_ins_usr_nm) doWrk12Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk12Dtl_ins_ts) doWrk12Dtl_ins_ts_NE(info);
		else if (ne == columnWrk12Dtl_ins_func_id) doWrk12Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk12Dtl_ins_func_nm) doWrk12Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk12Dtl_upd_cntr) doWrk12Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk12Dtl_upd_usr_id) doWrk12Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk12Dtl_upd_usr_nm) doWrk12Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk12Dtl_upd_ts) doWrk12Dtl_upd_ts_NE(info);
		else if (ne == columnWrk12Dtl_upd_func_id) doWrk12Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk12Dtl_upd_func_nm) doWrk12Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk12Dtl_upd_srv_req_no) doWrk12Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk12Dtl_del_usr_id) doWrk12Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk12Dtl_del_usr_nm) doWrk12Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk12Dtl_del_ts) doWrk12Dtl_del_ts_NE(info);
		else if (ne == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk2Dtl_check) doWrk2Dtl_check_NE(info);
		else if (ne == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NE(info);
		else if (ne == columnWrk2Dtl_mfg_loc_cd) doWrk2Dtl_mfg_loc_cd_NE(info);
		else if (ne == columnWrk2Dtl_mfg_loc_nm) doWrk2Dtl_mfg_loc_nm_NE(info);
		else if (ne == columnWrk2Dtl_sppl_cd) doWrk2Dtl_sppl_cd_NE(info);
		else if (ne == columnWrk2Dtl_sppl_nm) doWrk2Dtl_sppl_nm_NE(info);
		else if (ne == columnWrk2Dtl_maker_cd) doWrk2Dtl_maker_cd_NE(info);
		else if (ne == columnWrk2Dtl_maker_nm) doWrk2Dtl_maker_nm_NE(info);
		else if (ne == columnWrk2Dtl_from_site_cd) doWrk2Dtl_from_site_cd_NE(info);
		else if (ne == columnWrk2Dtl_from_site_nm) doWrk2Dtl_from_site_nm_NE(info);
		else if (ne == columnWrk2Dtl_to_site_cd) doWrk2Dtl_to_site_cd_NE(info);
		else if (ne == columnWrk2Dtl_to_site_nm) doWrk2Dtl_to_site_nm_NE(info);
		else if (ne == columnWrk2Dtl_no_insp_flg) doWrk2Dtl_no_insp_flg_NE(info);
		else if (ne == columnWrk2Dtl_insp_ptn_cd) doWrk2Dtl_insp_ptn_cd_NE(info);
		else if (ne == columnWrk2Dtl_insp_ptn_nm) doWrk2Dtl_insp_ptn_nm_NE(info);
		else if (ne == columnWrk2Dtl_no_mrkt_judg_flg) doWrk2Dtl_no_mrkt_judg_flg_NE(info);
		else if (ne == columnWrk2Dtl_no_plnt_aprv_flg) doWrk2Dtl_no_plnt_aprv_flg_NE(info);
		else if (ne == columnWrk2Dtl_no_insp_aprv_flg) doWrk2Dtl_no_insp_aprv_flg_NE(info);
		else if (ne == columnWrk2Dtl_lmt_dt_frm_typ) doWrk2Dtl_lmt_dt_frm_typ_NE(info);
		else if (ne == columnWrk2Dtl_lmt_dt_frm_typ_nm) doWrk2Dtl_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_vld_pd) doWrk2Dtl_vld_pd_NE(info);
		else if (ne == columnWrk2Dtl_lmt_pd) doWrk2Dtl_lmt_pd_NE(info);
		else if (ne == columnWrk2Dtl_lot_insp_vld_pd) doWrk2Dtl_lot_insp_vld_pd_NE(info);
		else if (ne == columnWrk2Dtl_calc_pd_typ) doWrk2Dtl_calc_pd_typ_NE(info);
		else if (ne == columnWrk2Dtl_calc_pd_typ_nm) doWrk2Dtl_calc_pd_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NE(info);
		else if (ne == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_insp_inst_issue_typ) doWrk2Dtl_insp_inst_issue_typ_NE(info);
		else if (ne == columnWrk2Dtl_insp_inst_issue_typ_nm) doWrk2Dtl_insp_inst_issue_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_insp_offst) doWrk2Dtl_insp_offst_NE(info);
		else if (ne == columnWrk2Dtl_inst_rslt_issue_flg) doWrk2Dtl_inst_rslt_issue_flg_NE(info);
		else if (ne == columnWrk2Dtl_pre_insp_valid_flg) doWrk2Dtl_pre_insp_valid_flg_NE(info);
		else if (ne == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NE(info);
		else if (ne == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NE(info);
		else if (ne == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NE(info);
		else if (ne == columnWrk3Dtl_check) doWrk3Dtl_check_NE(info);
		else if (ne == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NE(info);
		else if (ne == columnWrk3Dtl_site_cd) doWrk3Dtl_site_cd_NE(info);
		else if (ne == columnWrk3Dtl_site_nm) doWrk3Dtl_site_nm_NE(info);
		else if (ne == columnWrk3Dtl_insp_aprv_flg) doWrk3Dtl_insp_aprv_flg_NE(info);
		else if (ne == columnWrk3Dtl_insp_aprv_role_cd) doWrk3Dtl_insp_aprv_role_cd_NE(info);
		else if (ne == columnWrk3Dtl_insp_aprv_role_nm) doWrk3Dtl_insp_aprv_role_nm_NE(info);
		else if (ne == columnWrk3Dtl_in_prmt_insp_flg) doWrk3Dtl_in_prmt_insp_flg_NE(info);
		else if (ne == columnWrk3Dtl_ntfy_nm) doWrk3Dtl_ntfy_nm_NE(info);
		else if (ne == columnWrk3Dtl_num_id) doWrk3Dtl_num_id_NE(info);
		else if (ne == columnWrk3Dtl_plnt_aprv_flg) doWrk3Dtl_plnt_aprv_flg_NE(info);
		else if (ne == columnWrk3Dtl_plnt_aprv_role_cd) doWrk3Dtl_plnt_aprv_role_cd_NE(info);
		else if (ne == columnWrk3Dtl_plnt_aprv_role_nm) doWrk3Dtl_plnt_aprv_role_nm_NE(info);
		else if (ne == columnWrk3Dtl_mfg_aprv_flg) doWrk3Dtl_mfg_aprv_flg_NE(info);
		else if (ne == columnWrk3Dtl_mfg_aprv_role_cd) doWrk3Dtl_mfg_aprv_role_cd_NE(info);
		else if (ne == columnWrk3Dtl_mfg_aprv_role_nm) doWrk3Dtl_mfg_aprv_role_nm_NE(info);
		else if (ne == columnWrk3Dtl_xfr_lot_flg) doWrk3Dtl_xfr_lot_flg_NE(info);
		else if (ne == columnWrk3Dtl_so_prmt_insp_flg) doWrk3Dtl_so_prmt_insp_flg_NE(info);
		else if (ne == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NE(info);
		else if (ne == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NE(info);
		else if (ne == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NE(info);
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Tab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Tab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_std_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_std_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_cnf_req_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_cnf_req_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ql_std_val]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ql_std_val_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_digit]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_digit_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_frac]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_frac_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_mrkt_judg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_mrkt_judg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_offst_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[inst_rslt_issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_inst_rslt_issue_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_insp_valid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_insp_valid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[in_prmt_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_in_prmt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ntfy_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[num_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_num_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[xfr_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_xfr_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[so_prmt_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_so_prmt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == Wrk11DtlTable) doWrk11Dtl_NX(info);
		else if (nx == Wrk12TabTab) doWrk12Tab_NX(info);
		else if (nx == Wrk12DtlTable) doWrk12Dtl_NX(info);
		else if (nx == Wrk2DtlTable) doWrk2Dtl_NX(info);
		else if (nx == Wrk3DtlTable) doWrk3Dtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_unit_cd) doHdr_unit_cd_NX(info);
		else if (nx == Hdr_unit_nm) doHdr_unit_nm_NX(info);
		else if (nx == Hdr_lmt_ctl_flg) doHdr_lmt_ctl_flg_NX(info);
		else if (nx == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_NX(info);
		else if (nx == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NX(info);
		else if (nx == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NX(info);
		else if (nx == Hdr_dec_place) doHdr_dec_place_NX(info);
		else if (nx == Hdr_insp_flg) doHdr_insp_flg_NX(info);
		else if (nx == Hdr_insp_input_flg) doHdr_insp_input_flg_NX(info);
		else if (nx == Hdr_lot_mng_typ) doHdr_lot_mng_typ_NX(info);
		else if (nx == Hdr_sublot_mng_typ) doHdr_sublot_mng_typ_NX(info);
		else if (nx == Hdr_def_insp_aprv_flg) doHdr_def_insp_aprv_flg_NX(info);
		else if (nx == Hdr_def_insp_aprv_role_cd) doHdr_def_insp_aprv_role_cd_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_check) doHdr_check_NX(info);
		else if (nx == Wrk11SetDtHdr_st_dt) doWrk11SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk11SetDtHdr_end_dt) doWrk11SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk11Dtl_check) doWrk11Dtl_check_NX(info);
		else if (nx == columnWrk11Dtl_del_flg) doWrk11Dtl_del_flg_NX(info);
		else if (nx == columnWrk11Dtl_insp_ptn_cd) doWrk11Dtl_insp_ptn_cd_NX(info);
		else if (nx == columnWrk11Dtl_insp_ptn_nm) doWrk11Dtl_insp_ptn_nm_NX(info);
		else if (nx == columnWrk11Dtl_insp_mtd_typ) doWrk11Dtl_insp_mtd_typ_NX(info);
		else if (nx == columnWrk11Dtl_insp_mtd_typ_nm) doWrk11Dtl_insp_mtd_typ_nm_NX(info);
		else if (nx == columnWrk11Dtl_insp_lt) doWrk11Dtl_insp_lt_NX(info);
		else if (nx == columnWrk11Dtl_insp_std_no) doWrk11Dtl_insp_std_no_NX(info);
		else if (nx == columnWrk11Dtl_std_req_flg) doWrk11Dtl_std_req_flg_NX(info);
		else if (nx == columnWrk11Dtl_std_cnf_req_flg) doWrk11Dtl_std_cnf_req_flg_NX(info);
		else if (nx == columnWrk11Dtl_memo1) doWrk11Dtl_memo1_NX(info);
		else if (nx == columnWrk11Dtl_memo2) doWrk11Dtl_memo2_NX(info);
		else if (nx == columnWrk11Dtl_memo3) doWrk11Dtl_memo3_NX(info);
		else if (nx == columnWrk11Dtl_ins_usr_id) doWrk11Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk11Dtl_ins_usr_nm) doWrk11Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk11Dtl_ins_ts) doWrk11Dtl_ins_ts_NX(info);
		else if (nx == columnWrk11Dtl_ins_func_id) doWrk11Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk11Dtl_ins_func_nm) doWrk11Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk11Dtl_upd_cntr) doWrk11Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk11Dtl_upd_usr_id) doWrk11Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk11Dtl_upd_usr_nm) doWrk11Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk11Dtl_upd_ts) doWrk11Dtl_upd_ts_NX(info);
		else if (nx == columnWrk11Dtl_upd_func_id) doWrk11Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk11Dtl_upd_func_nm) doWrk11Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk11Dtl_upd_srv_req_no) doWrk11Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk11Dtl_del_usr_id) doWrk11Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk11Dtl_del_usr_nm) doWrk11Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk11Dtl_del_ts) doWrk11Dtl_del_ts_NX(info);
		else if (nx == Wrk12SetDtHdr_st_dt) doWrk12SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk12SetDtHdr_end_dt) doWrk12SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk12Dtl_check) doWrk12Dtl_check_NX(info);
		else if (nx == columnWrk12Dtl_del_flg) doWrk12Dtl_del_flg_NX(info);
		else if (nx == columnWrk12Dtl_insp_ptn_cd) doWrk12Dtl_insp_ptn_cd_NX(info);
		else if (nx == columnWrk12Dtl_insp_seq) doWrk12Dtl_insp_seq_NX(info);
		else if (nx == columnWrk12Dtl_insp_point_cd) doWrk12Dtl_insp_point_cd_NX(info);
		else if (nx == columnWrk12Dtl_insp_point_nm) doWrk12Dtl_insp_point_nm_NX(info);
		else if (nx == columnWrk12Dtl_pre_insp_inf_typ) doWrk12Dtl_pre_insp_inf_typ_NX(info);
		else if (nx == columnWrk12Dtl_pre_insp_inf_typ_nm) doWrk12Dtl_pre_insp_inf_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_insp_qlqn_typ) doWrk12Dtl_insp_qlqn_typ_NX(info);
		else if (nx == columnWrk12Dtl_insp_qlqn_typ_nm) doWrk12Dtl_insp_qlqn_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_ql_std_val) doWrk12Dtl_ql_std_val_NX(info);
		else if (nx == columnWrk12Dtl_unit_cd) doWrk12Dtl_unit_cd_NX(info);
		else if (nx == columnWrk12Dtl_unit_nm) doWrk12Dtl_unit_nm_NX(info);
		else if (nx == columnWrk12Dtl_qn_int_digit) doWrk12Dtl_qn_int_digit_NX(info);
		else if (nx == columnWrk12Dtl_qn_int_frac) doWrk12Dtl_qn_int_frac_NX(info);
		else if (nx == columnWrk12Dtl_sign_out_min_typ) doWrk12Dtl_sign_out_min_typ_NX(info);
		else if (nx == columnWrk12Dtl_sign_out_min_typ_nm) doWrk12Dtl_sign_out_min_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_sign_out_max_typ) doWrk12Dtl_sign_out_max_typ_NX(info);
		else if (nx == columnWrk12Dtl_sign_out_max_typ_nm) doWrk12Dtl_sign_out_max_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_sign_in_min_typ) doWrk12Dtl_sign_in_min_typ_NX(info);
		else if (nx == columnWrk12Dtl_sign_in_min_typ_nm) doWrk12Dtl_sign_in_min_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_sign_in_max_typ) doWrk12Dtl_sign_in_max_typ_NX(info);
		else if (nx == columnWrk12Dtl_sign_in_max_typ_nm) doWrk12Dtl_sign_in_max_typ_nm_NX(info);
		else if (nx == columnWrk12Dtl_memo1) doWrk12Dtl_memo1_NX(info);
		else if (nx == columnWrk12Dtl_memo2) doWrk12Dtl_memo2_NX(info);
		else if (nx == columnWrk12Dtl_memo3) doWrk12Dtl_memo3_NX(info);
		else if (nx == columnWrk12Dtl_ins_usr_id) doWrk12Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk12Dtl_ins_usr_nm) doWrk12Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk12Dtl_ins_ts) doWrk12Dtl_ins_ts_NX(info);
		else if (nx == columnWrk12Dtl_ins_func_id) doWrk12Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk12Dtl_ins_func_nm) doWrk12Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk12Dtl_upd_cntr) doWrk12Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk12Dtl_upd_usr_id) doWrk12Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk12Dtl_upd_usr_nm) doWrk12Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk12Dtl_upd_ts) doWrk12Dtl_upd_ts_NX(info);
		else if (nx == columnWrk12Dtl_upd_func_id) doWrk12Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk12Dtl_upd_func_nm) doWrk12Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk12Dtl_upd_srv_req_no) doWrk12Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk12Dtl_del_usr_id) doWrk12Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk12Dtl_del_usr_nm) doWrk12Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk12Dtl_del_ts) doWrk12Dtl_del_ts_NX(info);
		else if (nx == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk2Dtl_check) doWrk2Dtl_check_NX(info);
		else if (nx == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NX(info);
		else if (nx == columnWrk2Dtl_mfg_loc_cd) doWrk2Dtl_mfg_loc_cd_NX(info);
		else if (nx == columnWrk2Dtl_mfg_loc_nm) doWrk2Dtl_mfg_loc_nm_NX(info);
		else if (nx == columnWrk2Dtl_sppl_cd) doWrk2Dtl_sppl_cd_NX(info);
		else if (nx == columnWrk2Dtl_sppl_nm) doWrk2Dtl_sppl_nm_NX(info);
		else if (nx == columnWrk2Dtl_maker_cd) doWrk2Dtl_maker_cd_NX(info);
		else if (nx == columnWrk2Dtl_maker_nm) doWrk2Dtl_maker_nm_NX(info);
		else if (nx == columnWrk2Dtl_from_site_cd) doWrk2Dtl_from_site_cd_NX(info);
		else if (nx == columnWrk2Dtl_from_site_nm) doWrk2Dtl_from_site_nm_NX(info);
		else if (nx == columnWrk2Dtl_to_site_cd) doWrk2Dtl_to_site_cd_NX(info);
		else if (nx == columnWrk2Dtl_to_site_nm) doWrk2Dtl_to_site_nm_NX(info);
		else if (nx == columnWrk2Dtl_no_insp_flg) doWrk2Dtl_no_insp_flg_NX(info);
		else if (nx == columnWrk2Dtl_insp_ptn_cd) doWrk2Dtl_insp_ptn_cd_NX(info);
		else if (nx == columnWrk2Dtl_insp_ptn_nm) doWrk2Dtl_insp_ptn_nm_NX(info);
		else if (nx == columnWrk2Dtl_no_mrkt_judg_flg) doWrk2Dtl_no_mrkt_judg_flg_NX(info);
		else if (nx == columnWrk2Dtl_no_plnt_aprv_flg) doWrk2Dtl_no_plnt_aprv_flg_NX(info);
		else if (nx == columnWrk2Dtl_no_insp_aprv_flg) doWrk2Dtl_no_insp_aprv_flg_NX(info);
		else if (nx == columnWrk2Dtl_lmt_dt_frm_typ) doWrk2Dtl_lmt_dt_frm_typ_NX(info);
		else if (nx == columnWrk2Dtl_lmt_dt_frm_typ_nm) doWrk2Dtl_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_vld_pd) doWrk2Dtl_vld_pd_NX(info);
		else if (nx == columnWrk2Dtl_lmt_pd) doWrk2Dtl_lmt_pd_NX(info);
		else if (nx == columnWrk2Dtl_lot_insp_vld_pd) doWrk2Dtl_lot_insp_vld_pd_NX(info);
		else if (nx == columnWrk2Dtl_calc_pd_typ) doWrk2Dtl_calc_pd_typ_NX(info);
		else if (nx == columnWrk2Dtl_calc_pd_typ_nm) doWrk2Dtl_calc_pd_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NX(info);
		else if (nx == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_insp_inst_issue_typ) doWrk2Dtl_insp_inst_issue_typ_NX(info);
		else if (nx == columnWrk2Dtl_insp_inst_issue_typ_nm) doWrk2Dtl_insp_inst_issue_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_insp_offst) doWrk2Dtl_insp_offst_NX(info);
		else if (nx == columnWrk2Dtl_inst_rslt_issue_flg) doWrk2Dtl_inst_rslt_issue_flg_NX(info);
		else if (nx == columnWrk2Dtl_pre_insp_valid_flg) doWrk2Dtl_pre_insp_valid_flg_NX(info);
		else if (nx == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NX(info);
		else if (nx == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NX(info);
		else if (nx == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NX(info);
		else if (nx == columnWrk3Dtl_check) doWrk3Dtl_check_NX(info);
		else if (nx == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NX(info);
		else if (nx == columnWrk3Dtl_site_cd) doWrk3Dtl_site_cd_NX(info);
		else if (nx == columnWrk3Dtl_site_nm) doWrk3Dtl_site_nm_NX(info);
		else if (nx == columnWrk3Dtl_insp_aprv_flg) doWrk3Dtl_insp_aprv_flg_NX(info);
		else if (nx == columnWrk3Dtl_insp_aprv_role_cd) doWrk3Dtl_insp_aprv_role_cd_NX(info);
		else if (nx == columnWrk3Dtl_insp_aprv_role_nm) doWrk3Dtl_insp_aprv_role_nm_NX(info);
		else if (nx == columnWrk3Dtl_in_prmt_insp_flg) doWrk3Dtl_in_prmt_insp_flg_NX(info);
		else if (nx == columnWrk3Dtl_ntfy_nm) doWrk3Dtl_ntfy_nm_NX(info);
		else if (nx == columnWrk3Dtl_num_id) doWrk3Dtl_num_id_NX(info);
		else if (nx == columnWrk3Dtl_plnt_aprv_flg) doWrk3Dtl_plnt_aprv_flg_NX(info);
		else if (nx == columnWrk3Dtl_plnt_aprv_role_cd) doWrk3Dtl_plnt_aprv_role_cd_NX(info);
		else if (nx == columnWrk3Dtl_plnt_aprv_role_nm) doWrk3Dtl_plnt_aprv_role_nm_NX(info);
		else if (nx == columnWrk3Dtl_mfg_aprv_flg) doWrk3Dtl_mfg_aprv_flg_NX(info);
		else if (nx == columnWrk3Dtl_mfg_aprv_role_cd) doWrk3Dtl_mfg_aprv_role_cd_NX(info);
		else if (nx == columnWrk3Dtl_mfg_aprv_role_nm) doWrk3Dtl_mfg_aprv_role_nm_NX(info);
		else if (nx == columnWrk3Dtl_xfr_lot_flg) doWrk3Dtl_xfr_lot_flg_NX(info);
		else if (nx == columnWrk3Dtl_so_prmt_insp_flg) doWrk3Dtl_so_prmt_insp_flg_NX(info);
		else if (nx == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NX(info);
		else if (nx == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NX(info);
		else if (nx == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NX(info);
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Tab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Tab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[insp_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_insp_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_std_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_std_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[std_cnf_req_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_std_cnf_req_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ql_std_val]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ql_std_val_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_digit]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_digit_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_frac]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_frac_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_mrkt_judg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_mrkt_judg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[no_insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_no_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_offst_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[inst_rslt_issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_inst_rslt_issue_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_insp_valid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_insp_valid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[in_prmt_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_in_prmt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ntfy_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[num_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_num_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[xfr_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_xfr_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[so_prmt_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_so_prmt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_unit_cd) doHdr_unit_cd_LC(info);
		else if (lc == Hdr_unit_nm) doHdr_unit_nm_LC(info);
		else if (lc == Hdr_lmt_ctl_categ) doHdr_lmt_ctl_categ_LC(info);
		else if (lc == Hdr_asset_mng_typ) doHdr_asset_mng_typ_LC(info);
		else if (lc == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_LC(info);
		else if (lc == Hdr_dec_place) doHdr_dec_place_LC(info);
		else if (lc == Hdr_lot_mng_typ) doHdr_lot_mng_typ_LC(info);
		else if (lc == Hdr_sublot_mng_typ) doHdr_sublot_mng_typ_LC(info);
		else if (lc == Hdr_def_insp_aprv_role_cd) doHdr_def_insp_aprv_role_cd_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Wrk11SetDtHdr_st_dt) doWrk11SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk11SetDtHdr_end_dt) doWrk11SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk11Dtl_insp_ptn_cd) doWrk11Dtl_insp_ptn_cd_LC(info);
		else if (lc == columnWrk11Dtl_insp_ptn_nm) doWrk11Dtl_insp_ptn_nm_LC(info);
		else if (lc == columnWrk11Dtl_insp_mtd_typ) doWrk11Dtl_insp_mtd_typ_LC(info);
		else if (lc == columnWrk11Dtl_insp_mtd_typ_nm) doWrk11Dtl_insp_mtd_typ_nm_LC(info);
		else if (lc == columnWrk11Dtl_insp_lt) doWrk11Dtl_insp_lt_LC(info);
		else if (lc == columnWrk11Dtl_insp_std_no) doWrk11Dtl_insp_std_no_LC(info);
		else if (lc == columnWrk11Dtl_memo1) doWrk11Dtl_memo1_LC(info);
		else if (lc == columnWrk11Dtl_memo2) doWrk11Dtl_memo2_LC(info);
		else if (lc == columnWrk11Dtl_memo3) doWrk11Dtl_memo3_LC(info);
		else if (lc == columnWrk11Dtl_ins_usr_id) doWrk11Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk11Dtl_ins_usr_nm) doWrk11Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk11Dtl_ins_ts) doWrk11Dtl_ins_ts_LC(info);
		else if (lc == columnWrk11Dtl_ins_func_id) doWrk11Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk11Dtl_ins_func_nm) doWrk11Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk11Dtl_upd_cntr) doWrk11Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk11Dtl_upd_usr_id) doWrk11Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk11Dtl_upd_usr_nm) doWrk11Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk11Dtl_upd_ts) doWrk11Dtl_upd_ts_LC(info);
		else if (lc == columnWrk11Dtl_upd_func_id) doWrk11Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk11Dtl_upd_func_nm) doWrk11Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk11Dtl_upd_srv_req_no) doWrk11Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk11Dtl_del_usr_id) doWrk11Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk11Dtl_del_usr_nm) doWrk11Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk11Dtl_del_ts) doWrk11Dtl_del_ts_LC(info);
		else if (lc == Wrk12SetDtHdr_st_dt) doWrk12SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk12SetDtHdr_end_dt) doWrk12SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk12Dtl_insp_ptn_cd) doWrk12Dtl_insp_ptn_cd_LC(info);
		else if (lc == columnWrk12Dtl_insp_seq) doWrk12Dtl_insp_seq_LC(info);
		else if (lc == columnWrk12Dtl_insp_point_cd) doWrk12Dtl_insp_point_cd_LC(info);
		else if (lc == columnWrk12Dtl_insp_point_nm) doWrk12Dtl_insp_point_nm_LC(info);
		else if (lc == columnWrk12Dtl_pre_insp_inf_typ) doWrk12Dtl_pre_insp_inf_typ_LC(info);
		else if (lc == columnWrk12Dtl_pre_insp_inf_typ_nm) doWrk12Dtl_pre_insp_inf_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_insp_qlqn_typ) doWrk12Dtl_insp_qlqn_typ_LC(info);
		else if (lc == columnWrk12Dtl_insp_qlqn_typ_nm) doWrk12Dtl_insp_qlqn_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_ql_std_val) doWrk12Dtl_ql_std_val_LC(info);
		else if (lc == columnWrk12Dtl_unit_cd) doWrk12Dtl_unit_cd_LC(info);
		else if (lc == columnWrk12Dtl_unit_nm) doWrk12Dtl_unit_nm_LC(info);
		else if (lc == columnWrk12Dtl_qn_int_digit) doWrk12Dtl_qn_int_digit_LC(info);
		else if (lc == columnWrk12Dtl_qn_int_frac) doWrk12Dtl_qn_int_frac_LC(info);
		else if (lc == columnWrk12Dtl_sign_out_min_typ) doWrk12Dtl_sign_out_min_typ_LC(info);
		else if (lc == columnWrk12Dtl_sign_out_min_typ_nm) doWrk12Dtl_sign_out_min_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_sign_out_max_typ) doWrk12Dtl_sign_out_max_typ_LC(info);
		else if (lc == columnWrk12Dtl_sign_out_max_typ_nm) doWrk12Dtl_sign_out_max_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_sign_in_min_typ) doWrk12Dtl_sign_in_min_typ_LC(info);
		else if (lc == columnWrk12Dtl_sign_in_min_typ_nm) doWrk12Dtl_sign_in_min_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_sign_in_max_typ) doWrk12Dtl_sign_in_max_typ_LC(info);
		else if (lc == columnWrk12Dtl_sign_in_max_typ_nm) doWrk12Dtl_sign_in_max_typ_nm_LC(info);
		else if (lc == columnWrk12Dtl_memo1) doWrk12Dtl_memo1_LC(info);
		else if (lc == columnWrk12Dtl_memo2) doWrk12Dtl_memo2_LC(info);
		else if (lc == columnWrk12Dtl_memo3) doWrk12Dtl_memo3_LC(info);
		else if (lc == columnWrk12Dtl_ins_usr_id) doWrk12Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk12Dtl_ins_usr_nm) doWrk12Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk12Dtl_ins_ts) doWrk12Dtl_ins_ts_LC(info);
		else if (lc == columnWrk12Dtl_ins_func_id) doWrk12Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk12Dtl_ins_func_nm) doWrk12Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk12Dtl_upd_cntr) doWrk12Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk12Dtl_upd_usr_id) doWrk12Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk12Dtl_upd_usr_nm) doWrk12Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk12Dtl_upd_ts) doWrk12Dtl_upd_ts_LC(info);
		else if (lc == columnWrk12Dtl_upd_func_id) doWrk12Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk12Dtl_upd_func_nm) doWrk12Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk12Dtl_upd_srv_req_no) doWrk12Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk12Dtl_del_usr_id) doWrk12Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk12Dtl_del_usr_nm) doWrk12Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk12Dtl_del_ts) doWrk12Dtl_del_ts_LC(info);
		else if (lc == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk2Dtl_mfg_loc_cd) doWrk2Dtl_mfg_loc_cd_LC(info);
		else if (lc == columnWrk2Dtl_mfg_loc_nm) doWrk2Dtl_mfg_loc_nm_LC(info);
		else if (lc == columnWrk2Dtl_sppl_cd) doWrk2Dtl_sppl_cd_LC(info);
		else if (lc == columnWrk2Dtl_sppl_nm) doWrk2Dtl_sppl_nm_LC(info);
		else if (lc == columnWrk2Dtl_maker_cd) doWrk2Dtl_maker_cd_LC(info);
		else if (lc == columnWrk2Dtl_maker_nm) doWrk2Dtl_maker_nm_LC(info);
		else if (lc == columnWrk2Dtl_from_site_cd) doWrk2Dtl_from_site_cd_LC(info);
		else if (lc == columnWrk2Dtl_from_site_nm) doWrk2Dtl_from_site_nm_LC(info);
		else if (lc == columnWrk2Dtl_to_site_cd) doWrk2Dtl_to_site_cd_LC(info);
		else if (lc == columnWrk2Dtl_to_site_nm) doWrk2Dtl_to_site_nm_LC(info);
		else if (lc == columnWrk2Dtl_insp_ptn_cd) doWrk2Dtl_insp_ptn_cd_LC(info);
		else if (lc == columnWrk2Dtl_insp_ptn_nm) doWrk2Dtl_insp_ptn_nm_LC(info);
		else if (lc == columnWrk2Dtl_lmt_dt_frm_typ) doWrk2Dtl_lmt_dt_frm_typ_LC(info);
		else if (lc == columnWrk2Dtl_lmt_dt_frm_typ_nm) doWrk2Dtl_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_vld_pd) doWrk2Dtl_vld_pd_LC(info);
		else if (lc == columnWrk2Dtl_lmt_pd) doWrk2Dtl_lmt_pd_LC(info);
		else if (lc == columnWrk2Dtl_lot_insp_vld_pd) doWrk2Dtl_lot_insp_vld_pd_LC(info);
		else if (lc == columnWrk2Dtl_calc_pd_typ) doWrk2Dtl_calc_pd_typ_LC(info);
		else if (lc == columnWrk2Dtl_calc_pd_typ_nm) doWrk2Dtl_calc_pd_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_LC(info);
		else if (lc == columnWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm) doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_insp_inst_issue_typ) doWrk2Dtl_insp_inst_issue_typ_LC(info);
		else if (lc == columnWrk2Dtl_insp_inst_issue_typ_nm) doWrk2Dtl_insp_inst_issue_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_insp_offst) doWrk2Dtl_insp_offst_LC(info);
		else if (lc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_LC(info);
		else if (lc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_LC(info);
		else if (lc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_LC(info);
		else if (lc == columnWrk3Dtl_site_cd) doWrk3Dtl_site_cd_LC(info);
		else if (lc == columnWrk3Dtl_site_nm) doWrk3Dtl_site_nm_LC(info);
		else if (lc == columnWrk3Dtl_insp_aprv_role_cd) doWrk3Dtl_insp_aprv_role_cd_LC(info);
		else if (lc == columnWrk3Dtl_insp_aprv_role_nm) doWrk3Dtl_insp_aprv_role_nm_LC(info);
		else if (lc == columnWrk3Dtl_ntfy_nm) doWrk3Dtl_ntfy_nm_LC(info);
		else if (lc == columnWrk3Dtl_num_id) doWrk3Dtl_num_id_LC(info);
		else if (lc == columnWrk3Dtl_plnt_aprv_role_cd) doWrk3Dtl_plnt_aprv_role_cd_LC(info);
		else if (lc == columnWrk3Dtl_plnt_aprv_role_nm) doWrk3Dtl_plnt_aprv_role_nm_LC(info);
		else if (lc == columnWrk3Dtl_mfg_aprv_role_cd) doWrk3Dtl_mfg_aprv_role_cd_LC(info);
		else if (lc == columnWrk3Dtl_mfg_aprv_role_nm) doWrk3Dtl_mfg_aprv_role_nm_LC(info);
		else if (lc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_LC(info);
		else if (lc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_LC(info);
		else if (lc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_LC(info);
	}

	/**
	 * [Hdr]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lmt_ctl_categ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lmt_ctl_categ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[def_insp_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_def_insp_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[insp_std_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_insp_std_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk11Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk11Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_point_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_point_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[pre_insp_inf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_pre_insp_inf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[insp_qlqn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_insp_qlqn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ql_std_val]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ql_std_val_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_digit]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_digit_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[qn_int_frac]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_qn_int_frac_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_out_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_out_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_min_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_min_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[sign_in_max_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_sign_in_max_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk12Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk12Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[from_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_from_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[to_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_to_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lmt_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lmt_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[calc_pd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_calc_pd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_insp_lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_insp_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_inst_issue_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_inst_issue_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[insp_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_insp_offst_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[insp_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_insp_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ntfy_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[num_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_num_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[plnt_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_plnt_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[mfg_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_mfg_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnWrk11Dtl_insp_ptn_cd]の作成メソッド
	 */
	public MCList getWrk11Dtl_insp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk11Dtl_insp_mtd_typ]の作成メソッド
	 */
	public MCList getWrk11Dtl_insp_mtd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspMtdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_insp_ptn_cd]の作成メソッド
	 */
	public MCList getWrk12Dtl_insp_ptn_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_insp_point_cd]の作成メソッド
	 */
	public MCList getWrk12Dtl_insp_point_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPoint(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_pre_insp_inf_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_pre_insp_inf_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreInspInfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_insp_qlqn_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_insp_qlqn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspQlqnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_unit_cd]の作成メソッド
	 */
	public MCList getWrk12Dtl_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_sign_out_min_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_sign_out_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_sign_out_max_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_sign_out_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_sign_in_min_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_sign_in_min_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk12Dtl_sign_in_max_typ]の作成メソッド
	 */
	public MCList getWrk12Dtl_sign_in_max_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_mfg_loc_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_sppl_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_maker_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_from_site_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_from_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_to_site_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_to_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_insp_ptn_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_insp_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_lmt_dt_frm_typ]の作成メソッド
	 */
	public MCList getWrk2Dtl_lmt_dt_frm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLmtDtFrmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_calc_pd_typ]の作成メソッド
	 */
	public MCList getWrk2Dtl_calc_pd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcPdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_lot_insp_lmt_dt_frm_typ]の作成メソッド
	 */
	public MCList getWrk2Dtl_lot_insp_lmt_dt_frm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLmtDtFrmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_insp_inst_issue_typ]の作成メソッド
	 */
	public MCList getWrk2Dtl_insp_inst_issue_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspInstIssueTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_site_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_insp_aprv_role_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_insp_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_plnt_aprv_role_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_plnt_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_mfg_aprv_role_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_mfg_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL1130.Srch01")) {
			return new MA_MABSL1130_Srch01Bridge();
		}
		if (id.equals("MA.MABSL1130.Upd01")) {
			return new MA_MABSL1130_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL1130_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1130_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1130_Srch01;

		/** コンストラクタ */
		protected MA_MABSL1130_Srch01Bridge() {
			p_MA_MABSL1130_Srch01 = new MCParam(PDef.MA_MABSL1130_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1130_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP1130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.HdrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk3DtlR.class));

			p_MA_MABSL1130_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1130_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1130_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1130_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP1130.CndR up0() {
			return (mcframe.clientMABS.MABSP1130.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1130.HdrR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1130.HdrR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR>)down(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> down3() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR>)down(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> down4() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR>)down(4);
		}

		protected void setupDownParam() {
			p_MA_MABSL1130_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.HdrR.class));
			p_MA_MABSL1130_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.class));
			p_MA_MABSL1130_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.class));
			p_MA_MABSL1130_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.class));
			p_MA_MABSL1130_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk3DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1130_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABS.MABSP1130.HdrR>)p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(0));
			setWrk11DtlL((MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR>)p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(1));
			setWrk12DtlAllL((MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR>)p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(2));
			setWrk2DtlL((MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR>)p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(3));
			setWrk3DtlL((MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR>)p_MA_MABSL1130_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrAllL().clear();
			getWrk11DtlL().clear();
			getWrk12DtlAllL().clear();
			getWrk2DtlL().clear();
			getWrk3DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk11DtlL());
			result.add(getWrk12DtlAllL());
			result.add(getWrk2DtlL());
			result.add(getWrk3DtlL());
			return result;
		}
	}
	/**
	 * [MA_MABSL1130_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1130_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1130_Upd01;

		/** コンストラクタ */
		protected MA_MABSL1130_Upd01Bridge() {
			p_MA_MABSL1130_Upd01 = new MCParam(PDef.MA_MABSL1130_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1130_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1130.HdrR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk11DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk12DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk2DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1130.Wrk3DtlR.class));
			// Down

			p_MA_MABSL1130_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1130_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1130_Upd01.addUpBlock(getHdrAllL().shallowClone());
			p_MA_MABSL1130_Upd01.addUpBlock(getWrk11DtlL().shallowClone());
			p_MA_MABSL1130_Upd01.addUpBlock(getWrk12DtlAllL().shallowClone());
			p_MA_MABSL1130_Upd01.addUpBlock(getWrk2DtlL().shallowClone());
			p_MA_MABSL1130_Upd01.addUpBlock(getWrk3DtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1130_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1130_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1130.HdrR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1130.HdrR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR> up1() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk11DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR> up2() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk12DtlR>)up(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR> up3() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk2DtlR>)up(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR> up4() {
			return (MCList<mcframe.clientMABS.MABSP1130.Wrk3DtlR>)up(4);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1130_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk11DtlL());
			result.add(getWrk12DtlAllL());
			result.add(getWrk2DtlL());
			result.add(getWrk3DtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}