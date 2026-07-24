package mcframe.clientMABG.MABGP0100;

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
import mcframe.clientMABG.MABGP0100.MABGP_CalcPtnReg_MC.MA_MABGL0100_Srch01Caller;
import mcframe.clientMABG.MABGP0100.MABGP_CalcPtnReg_MC.MA_MABGL0100_Upd01Caller;
import mcframe.clientMABG.MABGP0100.MABGP_CalcPtnReg_MC.MA_MABGL0100_Del01Caller;

/**
 * 画面"MABGP_CalcPtnReg"パネルクラスです。<p>
 *
 * 計算パタンマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_CalcPtnReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0100";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_calc_ptn_cd_Label = null;
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ptn_cd = null;
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ptn_nm = null;
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
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0100.DtlR> DtlTable = null;
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
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ptn_cd = null;
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ptn_nm_lcl = null;
	/**
	 * Standard calculation pattern name 標準計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ptn_nm = null;
	/**
	 * Mfg. purchase type 製造購買区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_purc_typ = null;
	/**
	 * Mfg. purchase type name 製造購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_purc_typ_nm = null;
	/**
	 * Amount evaluation type 金額評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_eval_typ = null;
	/**
	 * Amount evaluation type name 金額評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_eval_typ_nm = null;
	/**
	 * Dept. calculation type 部門計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_typ = null;
	/**
	 * Dept. calculation type name 部門計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_typ_nm = null;
	/**
	 * Lot No. calculation type ロットＮＯ計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_typ = null;
	/**
	 * Lot No. calculation type name ロットＮＯ計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_typ_nm = null;
	/**
	 * Sublot No. calculation type サブロットＮＯ計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_typ = null;
	/**
	 * Sublot No. calculation type name サブロットＮＯ計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_typ_nm = null;
	/**
	 * SEIBAN No. 1 calculation type 手配ＮＯ１計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_typ = null;
	/**
	 * SEIBAN No. 1 calculation type name 手配ＮＯ１計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_typ_nm = null;
	/**
	 * SEIBAN No. 2 calculation type 手配ＮＯ２計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_typ = null;
	/**
	 * SEIBAN No. 2 calculation type name 手配ＮＯ２計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_typ_nm = null;
	/**
	 * SEIBAN No. 3 calculation type 手配ＮＯ３計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_typ = null;
	/**
	 * SEIBAN No. 3 calculation type name 手配ＮＯ３計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_typ_nm = null;
	/**
	 * SEIBAN No. 4 calculation type 手配ＮＯ４計算区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_typ = null;
	/**
	 * SEIBAN No. 4 calculation type name 手配ＮＯ４計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_typ_nm = null;
	/**
	 * Lot No. result type ロットＮＯ実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_act_typ = null;
	/**
	 * Lot No. result type name ロットＮＯ実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_act_typ_nm = null;
	/**
	 * Sublot No. result type サブロットＮＯ実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_act_typ = null;
	/**
	 * Sublot No. result type name サブロットＮＯ実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_act_typ_nm = null;
	/**
	 * SEIBAN No. 1 result type 手配ＮＯ１実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_act_typ = null;
	/**
	 * SEIBAN No. 1 result type name 手配ＮＯ１実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_act_typ_nm = null;
	/**
	 * SEIBAN No. 2 result type 手配ＮＯ２実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_act_typ = null;
	/**
	 * SEIBAN No. 2 result type name 手配ＮＯ２実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_act_typ_nm = null;
	/**
	 * SEIBAN No. 3 result type 手配ＮＯ３実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_act_typ = null;
	/**
	 * SEIBAN No. 3 result type name 手配ＮＯ３実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_act_typ_nm = null;
	/**
	 * SEIBAN No. 4 result type 手配ＮＯ４実績区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_act_typ = null;
	/**
	 * SEIBAN No. 4 result type name 手配ＮＯ４実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_act_typ_nm = null;
	/**
	 * Item mfg. order No. setting type 品目製造指図ＮＯ設定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_mfg_inst_no_set_typ = null;
	/**
	 * Item mfg. order No. setting type name 品目製造指図ＮＯ設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_mfg_inst_no_set_typ_nm = null;
	/**
	 * Mfg. result No. setting type 製造実績ＮＯ設定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_act_no_set_typ = null;
	/**
	 * Mfg. result No. setting type name 製造実績ＮＯ設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_act_no_set_typ_nm = null;
	/**
	 * Operation result No. setting type 工程実績ＮＯ設定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_act_no_set_typ = null;
	/**
	 * Operation result No. setting type name 工程実績ＮＯ設定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_act_no_set_typ_nm = null;
	/**
	 * Lot No. explosion type ロットＮＯ展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_exp_typ = null;
	/**
	 * Lot No. explosion type name ロットＮＯ展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_exp_typ_nm = null;
	/**
	 * Sublot No. explosion type サブロットＮＯ展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_exp_typ = null;
	/**
	 * Sublot No. explosion type name サブロットＮＯ展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_exp_typ_nm = null;
	/**
	 * SEIBAN No. 1 explosion type 手配ＮＯ１展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_exp_typ = null;
	/**
	 * SEIBAN No. 1 explosion type name 手配ＮＯ１展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_exp_typ_nm = null;
	/**
	 * SEIBAN No. 2 explosion type 手配ＮＯ２展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_exp_typ = null;
	/**
	 * SEIBAN No. 2 explosion type name 手配ＮＯ２展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_exp_typ_nm = null;
	/**
	 * SEIBAN No. 3 explosion type 手配ＮＯ３展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_exp_typ = null;
	/**
	 * SEIBAN No. 3 explosion type name 手配ＮＯ３展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_exp_typ_nm = null;
	/**
	 * SEIBAN No. 4 explosion type 手配ＮＯ４展開区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_exp_typ = null;
	/**
	 * SEIBAN No. 4 explosion type name 手配ＮＯ４展開区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_exp_typ_nm = null;
	/**
	 * Management dept. evaluation type 管理部門評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_loss_eval_typ = null;
	/**
	 * Management dept. evaluation type name 管理部門評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_loss_eval_typ_nm = null;
	/**
	 * Lot No. evaluation type ロットＮＯ評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_loss_eval_typ = null;
	/**
	 * Lot No. evaluation type name ロットＮＯ評価区分 名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_loss_eval_typ_nm = null;
	/**
	 * Sublot No. revaluation type サブロットＮＯ評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_loss_eval_typ = null;
	/**
	 * Sublot No. evaluation type name サブロットＮＯ評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_loss_eval_typ_nm = null;
	/**
	 * SEIBAN No. 1 evaluation type 手配ＮＯ１評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_loss_eval_typ = null;
	/**
	 * SEIBAN No. 1 evaluation type name 手配ＮＯ１評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_loss_eval_typ_nm = null;
	/**
	 * SEIBAN No. 2 evaluation type 手配ＮＯ２評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_loss_eval_typ = null;
	/**
	 * SEIBAN No. 2 evaluation type name 手配ＮＯ２評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_loss_eval_typ_nm = null;
	/**
	 * SEIBAN No. 3 evaluation type 手配ＮＯ３評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_loss_eval_typ = null;
	/**
	 * SEIBAN No. 3 evaluation type name 手配ＮＯ３評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_loss_eval_typ_nm = null;
	/**
	 * SEIBAN No. 4 evaluation type 手配ＮＯ４評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_loss_eval_typ = null;
	/**
	 * SEIBAN No. 4 evaluation type name 手配ＮＯ４評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_loss_eval_typ_nm = null;
	/**
	 * Asset type evaluation type 資産区分評価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_loss_eval_typ = null;
	/**
	 * Asset type evaluation type name 資産区分評価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_loss_eval_typ_nm = null;
	/**
	 * Rounding type (Standard) 標準端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ = null;
	/**
	 * Rounding type name (Standard) 標準端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_rnd_typ_nm = null;
	/**
	 * Standard number of decimal places 標準小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_dec_place = null;
	/**
	 * Rounding type (Unit price) 単価端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_rnd_typ = null;
	/**
	 * Rounding type name (Unit price) 単価端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_rnd_typ_nm = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ave_dec_place = null;
	/**
	 * Fraction adjustment type 端数調整区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_adj_typ = null;
	/**
	 * Fraction adjustment type name 端数調整区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_adj_typ_nm = null;
	/**
	 * WIP type 仕掛区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wip_typ = null;
	/**
	 * WIP type name 仕掛区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wip_typ_nm = null;
	/**
	 * Breakdown aggregated type 内訳集計区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_agg_typ = null;
	/**
	 * Aggregated breakdown type name 内訳集計区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_agg_typ_nm = null;
	/**
	 * Adjustment cost element cd. 調整費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrgn_expns_cd = null;
	/**
	 * Adjustment cost element name 調整費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrgn_expns_nm = null;
	/**
	 * Purchase cost element item cd. 購買費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_expns_cd = null;
	/**
	 * Purchase cost element name 購買費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_expns_nm = null;
	/**
	 * Subcontract cost element cd. 外注費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_out_expns_cd = null;
	/**
	 * Subcontract cost element name 外注費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_out_expns_nm = null;
	/**
	 * Input cost element cd. 投入費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_expns_cd = null;
	/**
	 * Input cost element name 投入費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_expns_nm = null;
	/**
	 * Self supply cost element cd. 自給費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ss_expns_cd = null;
	/**
	 * Self supply cost element name 自給費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ss_expns_nm = null;
	/**
	 * Cost element cd. for gain or loss of chargeable item 有償差額費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_expns_cd = null;
	/**
	 * Gain or loss of chargeable supply cost element name 有償差額費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_expns_nm = null;
	/**
	 * Explosion allocation type 展開割付区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exp_alloc_typ = null;
	/**
	 * Explosion allocation type name 展開割付区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exp_alloc_typ_nm = null;
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
	public MCTable2<mcframe.clientMABG.MABGP0100.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_calc_ptn_cd = null;
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
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_calc_ptn_nm = null;
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
	 * Calculation group pattern master entry 計算グループパタンマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0110 = null;
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
	
	/** [MA_MABGL0100_Srch01]のCallerの作成 */
	protected MABGP_CalcPtnReg_MC.MA_MABGL0100_Srch01Caller createMA_MABGL0100_Srch01() {
		MABGP_CalcPtnReg_MC.MA_MABGL0100_Srch01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Srch01Bridge>
		caller = ((MABGP_CalcPtnReg_MC)this).new MA_MABGL0100_Srch01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Srch01Bridge>(
					(MABGP_CalcPtnReg)this, new MA_MABGL0100_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0100_Srch01]の呼び出し */
	protected void callMA_MABGL0100_Srch01() {
		MCCaller caller = createMA_MABGL0100_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0100_Upd01]のCallerの作成 */
	protected MABGP_CalcPtnReg_MC.MA_MABGL0100_Upd01Caller createMA_MABGL0100_Upd01() {
		MABGP_CalcPtnReg_MC.MA_MABGL0100_Upd01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Upd01Bridge>
		caller = ((MABGP_CalcPtnReg_MC)this).new MA_MABGL0100_Upd01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Upd01Bridge>(
					(MABGP_CalcPtnReg)this, new MA_MABGL0100_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0100_Upd01]の呼び出し */
	protected void callMA_MABGL0100_Upd01() {
		MCCaller caller = createMA_MABGL0100_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0100_Del01]のCallerの作成 */
	protected MABGP_CalcPtnReg_MC.MA_MABGL0100_Del01Caller createMA_MABGL0100_Del01() {
		MABGP_CalcPtnReg_MC.MA_MABGL0100_Del01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Del01Bridge>
		caller = ((MABGP_CalcPtnReg_MC)this).new MA_MABGL0100_Del01Caller<MABGP_CalcPtnReg, MA_MABGL0100_Del01Bridge>(
					(MABGP_CalcPtnReg)this, new MA_MABGL0100_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0100_Del01]の呼び出し */
	protected void callMA_MABGL0100_Del01() {
		MCCaller caller = createMA_MABGL0100_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0100.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0100.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0100.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0100.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0100.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABG.MABGP0100.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0100.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0100.MstR createMstR() {
		return mcframe.clientMABG.MABGP0100.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0100.CndR createCndR() {
		return mcframe.clientMABG.MABGP0100.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0100.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0100.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0100.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0100.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABG.MABGP0100.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABG.MABGP0100.LclR createLclR() {
		return mcframe.clientMABG.MABGP0100.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.LclR> createLclL() {
		return MCList.create(mcframe.clientMABG.MABGP0100.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABG.MABGP0100.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABG.MABGP0100.LclR createLclAllR() {
		return mcframe.clientMABG.MABGP0100.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0100.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABG.MABGP0100.LclR.class);
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
	public MABGP_CalcPtnReg_MC_A() {
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
	public MABGP_CalcPtnReg_MC_A(String name) {
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
		MABGP_CalcPtnReg_MC.jbCreateScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateMst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateTop((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateFold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateCnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateCtrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateDtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateDtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateLclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateLcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateLclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbCreateEastBtn((MABGP_CalcPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABGP_CalcPtnReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_CalcPtnReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_CalcPtnReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABGP_CalcPtnReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABGP_CalcPtnReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_CalcPtnReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_CalcPtnReg p) {
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

	
	/** [Cnd_calc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ptn_cd_p = null;

	/**
	 * [Cnd_calc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ptn_cd_ListPutter() {
		if (Cnd_calc_ptn_cd_p == null) {
			Cnd_calc_ptn_cd_p = createCnd_calc_ptn_cd_ListPutter(Cnd_calc_ptn_cd, "calc_ptn_cd", "calc_ptn_nm");

		}
		return Cnd_calc_ptn_cd_p;
	}
	
	
	/** [Dtl_mfg_purc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_purc_typ_p = null;

	/**
	 * [Dtl_mfg_purc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_purc_typ_ListPutter() {
		if (Dtl_mfg_purc_typ_p == null) {
			Dtl_mfg_purc_typ_p = createDtl_mfg_purc_typ_ListPutter(columnDtl_mfg_purc_typ, "mfg_purc_typ", "mfg_purc_typ_nm");

		}
		return Dtl_mfg_purc_typ_p;
	}
	
	
	/** [Dtl_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_eval_typ_p = null;

	/**
	 * [Dtl_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_eval_typ_ListPutter() {
		if (Dtl_eval_typ_p == null) {
			Dtl_eval_typ_p = createDtl_eval_typ_ListPutter(columnDtl_eval_typ, "eval_typ", "eval_typ_nm");

		}
		return Dtl_eval_typ_p;
	}
	
	
	/** [Dtl_dpt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_typ_p = null;

	/**
	 * [Dtl_dpt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_typ_ListPutter() {
		if (Dtl_dpt_typ_p == null) {
			Dtl_dpt_typ_p = createDtl_dpt_typ_ListPutter(columnDtl_dpt_typ, "dpt_typ", "dpt_typ_nm");

		}
		return Dtl_dpt_typ_p;
	}
	
	
	/** [Dtl_lot_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_typ_p = null;

	/**
	 * [Dtl_lot_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_typ_ListPutter() {
		if (Dtl_lot_typ_p == null) {
			Dtl_lot_typ_p = createDtl_lot_typ_ListPutter(columnDtl_lot_typ, "lot_typ", "lot_typ_nm");

		}
		return Dtl_lot_typ_p;
	}
	
	
	/** [Dtl_sublot_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_typ_p = null;

	/**
	 * [Dtl_sublot_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_typ_ListPutter() {
		if (Dtl_sublot_typ_p == null) {
			Dtl_sublot_typ_p = createDtl_sublot_typ_ListPutter(columnDtl_sublot_typ, "sublot_typ", "sublot_typ_nm");

		}
		return Dtl_sublot_typ_p;
	}
	
	
	/** [Dtl_sno1_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_typ_p = null;

	/**
	 * [Dtl_sno1_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_typ_ListPutter() {
		if (Dtl_sno1_typ_p == null) {
			Dtl_sno1_typ_p = createDtl_sno1_typ_ListPutter(columnDtl_sno1_typ, "sno1_typ", "sno1_typ_nm");

		}
		return Dtl_sno1_typ_p;
	}
	
	
	/** [Dtl_sno2_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_typ_p = null;

	/**
	 * [Dtl_sno2_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_typ_ListPutter() {
		if (Dtl_sno2_typ_p == null) {
			Dtl_sno2_typ_p = createDtl_sno2_typ_ListPutter(columnDtl_sno2_typ, "sno2_typ", "sno2_typ_nm");

		}
		return Dtl_sno2_typ_p;
	}
	
	
	/** [Dtl_sno3_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_typ_p = null;

	/**
	 * [Dtl_sno3_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_typ_ListPutter() {
		if (Dtl_sno3_typ_p == null) {
			Dtl_sno3_typ_p = createDtl_sno3_typ_ListPutter(columnDtl_sno3_typ, "sno3_typ", "sno3_typ_nm");

		}
		return Dtl_sno3_typ_p;
	}
	
	
	/** [Dtl_sno4_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_typ_p = null;

	/**
	 * [Dtl_sno4_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_typ_ListPutter() {
		if (Dtl_sno4_typ_p == null) {
			Dtl_sno4_typ_p = createDtl_sno4_typ_ListPutter(columnDtl_sno4_typ, "sno4_typ", "sno4_typ_nm");

		}
		return Dtl_sno4_typ_p;
	}
	
	
	/** [Dtl_lot_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_act_typ_p = null;

	/**
	 * [Dtl_lot_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_act_typ_ListPutter() {
		if (Dtl_lot_act_typ_p == null) {
			Dtl_lot_act_typ_p = createDtl_lot_act_typ_ListPutter(columnDtl_lot_act_typ, "lot_act_typ", "lot_act_typ_nm");

		}
		return Dtl_lot_act_typ_p;
	}
	
	
	/** [Dtl_sublot_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_act_typ_p = null;

	/**
	 * [Dtl_sublot_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_act_typ_ListPutter() {
		if (Dtl_sublot_act_typ_p == null) {
			Dtl_sublot_act_typ_p = createDtl_sublot_act_typ_ListPutter(columnDtl_sublot_act_typ, "sublot_act_typ", "sublot_act_typ_nm");

		}
		return Dtl_sublot_act_typ_p;
	}
	
	
	/** [Dtl_sno1_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_act_typ_p = null;

	/**
	 * [Dtl_sno1_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_act_typ_ListPutter() {
		if (Dtl_sno1_act_typ_p == null) {
			Dtl_sno1_act_typ_p = createDtl_sno1_act_typ_ListPutter(columnDtl_sno1_act_typ, "sno1_act_typ", "sno1_act_typ_nm");

		}
		return Dtl_sno1_act_typ_p;
	}
	
	
	/** [Dtl_sno2_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_act_typ_p = null;

	/**
	 * [Dtl_sno2_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_act_typ_ListPutter() {
		if (Dtl_sno2_act_typ_p == null) {
			Dtl_sno2_act_typ_p = createDtl_sno2_act_typ_ListPutter(columnDtl_sno2_act_typ, "sno2_act_typ", "sno2_act_typ_nm");

		}
		return Dtl_sno2_act_typ_p;
	}
	
	
	/** [Dtl_sno3_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_act_typ_p = null;

	/**
	 * [Dtl_sno3_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_act_typ_ListPutter() {
		if (Dtl_sno3_act_typ_p == null) {
			Dtl_sno3_act_typ_p = createDtl_sno3_act_typ_ListPutter(columnDtl_sno3_act_typ, "sno3_act_typ", "sno3_act_typ_nm");

		}
		return Dtl_sno3_act_typ_p;
	}
	
	
	/** [Dtl_sno4_act_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_act_typ_p = null;

	/**
	 * [Dtl_sno4_act_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_act_typ_ListPutter() {
		if (Dtl_sno4_act_typ_p == null) {
			Dtl_sno4_act_typ_p = createDtl_sno4_act_typ_ListPutter(columnDtl_sno4_act_typ, "sno4_act_typ", "sno4_act_typ_nm");

		}
		return Dtl_sno4_act_typ_p;
	}
	
	
	/** [Dtl_itm_mfg_inst_no_set_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_mfg_inst_no_set_typ_p = null;

	/**
	 * [Dtl_itm_mfg_inst_no_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_mfg_inst_no_set_typ_ListPutter() {
		if (Dtl_itm_mfg_inst_no_set_typ_p == null) {
			Dtl_itm_mfg_inst_no_set_typ_p = createDtl_itm_mfg_inst_no_set_typ_ListPutter(columnDtl_itm_mfg_inst_no_set_typ, "itm_mfg_inst_no_set_typ", "itm_mfg_inst_no_set_typ_nm");

		}
		return Dtl_itm_mfg_inst_no_set_typ_p;
	}
	
	
	/** [Dtl_mfg_act_no_set_typ_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_act_no_set_typ_p = null;

	/**
	 * [Dtl_mfg_act_no_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_act_no_set_typ_ListPutter() {
		if (Dtl_mfg_act_no_set_typ_p == null) {
			Dtl_mfg_act_no_set_typ_p = createDtl_mfg_act_no_set_typ_ListPutter(columnDtl_mfg_act_no_set_typ, "mfg_act_no_set_typ", "mfg_act_no_set_typ_nm");

		}
		return Dtl_mfg_act_no_set_typ_p;
	}
	
	
	/** [Dtl_oper_act_no_set_typ_ListPutter]の定義 */
	private MCListPutter Dtl_oper_act_no_set_typ_p = null;

	/**
	 * [Dtl_oper_act_no_set_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_act_no_set_typ_ListPutter() {
		if (Dtl_oper_act_no_set_typ_p == null) {
			Dtl_oper_act_no_set_typ_p = createDtl_oper_act_no_set_typ_ListPutter(columnDtl_oper_act_no_set_typ, "oper_act_no_set_typ", "oper_act_no_set_typ_nm");

		}
		return Dtl_oper_act_no_set_typ_p;
	}
	
	
	/** [Dtl_lot_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_exp_typ_p = null;

	/**
	 * [Dtl_lot_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_exp_typ_ListPutter() {
		if (Dtl_lot_exp_typ_p == null) {
			Dtl_lot_exp_typ_p = createDtl_lot_exp_typ_ListPutter(columnDtl_lot_exp_typ, "lot_exp_typ", "lot_exp_typ_nm");

		}
		return Dtl_lot_exp_typ_p;
	}
	
	
	/** [Dtl_sublot_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_exp_typ_p = null;

	/**
	 * [Dtl_sublot_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_exp_typ_ListPutter() {
		if (Dtl_sublot_exp_typ_p == null) {
			Dtl_sublot_exp_typ_p = createDtl_sublot_exp_typ_ListPutter(columnDtl_sublot_exp_typ, "sublot_exp_typ", "sublot_exp_typ_nm");

		}
		return Dtl_sublot_exp_typ_p;
	}
	
	
	/** [Dtl_sno1_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_exp_typ_p = null;

	/**
	 * [Dtl_sno1_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_exp_typ_ListPutter() {
		if (Dtl_sno1_exp_typ_p == null) {
			Dtl_sno1_exp_typ_p = createDtl_sno1_exp_typ_ListPutter(columnDtl_sno1_exp_typ, "sno1_exp_typ", "sno1_exp_typ_nm");

		}
		return Dtl_sno1_exp_typ_p;
	}
	
	
	/** [Dtl_sno2_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_exp_typ_p = null;

	/**
	 * [Dtl_sno2_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_exp_typ_ListPutter() {
		if (Dtl_sno2_exp_typ_p == null) {
			Dtl_sno2_exp_typ_p = createDtl_sno2_exp_typ_ListPutter(columnDtl_sno2_exp_typ, "sno2_exp_typ", "sno2_exp_typ_nm");

		}
		return Dtl_sno2_exp_typ_p;
	}
	
	
	/** [Dtl_sno3_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_exp_typ_p = null;

	/**
	 * [Dtl_sno3_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_exp_typ_ListPutter() {
		if (Dtl_sno3_exp_typ_p == null) {
			Dtl_sno3_exp_typ_p = createDtl_sno3_exp_typ_ListPutter(columnDtl_sno3_exp_typ, "sno3_exp_typ", "sno3_exp_typ_nm");

		}
		return Dtl_sno3_exp_typ_p;
	}
	
	
	/** [Dtl_sno4_exp_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_exp_typ_p = null;

	/**
	 * [Dtl_sno4_exp_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_exp_typ_ListPutter() {
		if (Dtl_sno4_exp_typ_p == null) {
			Dtl_sno4_exp_typ_p = createDtl_sno4_exp_typ_ListPutter(columnDtl_sno4_exp_typ, "sno4_exp_typ", "sno4_exp_typ_nm");

		}
		return Dtl_sno4_exp_typ_p;
	}
	
	
	/** [Dtl_dpt_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_loss_eval_typ_p = null;

	/**
	 * [Dtl_dpt_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_loss_eval_typ_ListPutter() {
		if (Dtl_dpt_loss_eval_typ_p == null) {
			Dtl_dpt_loss_eval_typ_p = createDtl_dpt_loss_eval_typ_ListPutter(columnDtl_dpt_loss_eval_typ, "dpt_loss_eval_typ", "dpt_loss_eval_typ_nm");

		}
		return Dtl_dpt_loss_eval_typ_p;
	}
	
	
	/** [Dtl_lot_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_loss_eval_typ_p = null;

	/**
	 * [Dtl_lot_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_loss_eval_typ_ListPutter() {
		if (Dtl_lot_loss_eval_typ_p == null) {
			Dtl_lot_loss_eval_typ_p = createDtl_lot_loss_eval_typ_ListPutter(columnDtl_lot_loss_eval_typ, "lot_loss_eval_typ", "lot_loss_eval_typ_nm");

		}
		return Dtl_lot_loss_eval_typ_p;
	}
	
	
	/** [Dtl_sublot_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_loss_eval_typ_p = null;

	/**
	 * [Dtl_sublot_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_loss_eval_typ_ListPutter() {
		if (Dtl_sublot_loss_eval_typ_p == null) {
			Dtl_sublot_loss_eval_typ_p = createDtl_sublot_loss_eval_typ_ListPutter(columnDtl_sublot_loss_eval_typ, "sublot_loss_eval_typ", "sublot_loss_eval_typ_nm");

		}
		return Dtl_sublot_loss_eval_typ_p;
	}
	
	
	/** [Dtl_sno1_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_loss_eval_typ_p = null;

	/**
	 * [Dtl_sno1_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_loss_eval_typ_ListPutter() {
		if (Dtl_sno1_loss_eval_typ_p == null) {
			Dtl_sno1_loss_eval_typ_p = createDtl_sno1_loss_eval_typ_ListPutter(columnDtl_sno1_loss_eval_typ, "sno1_loss_eval_typ", "sno1_loss_eval_typ_nm");

		}
		return Dtl_sno1_loss_eval_typ_p;
	}
	
	
	/** [Dtl_sno2_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_loss_eval_typ_p = null;

	/**
	 * [Dtl_sno2_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_loss_eval_typ_ListPutter() {
		if (Dtl_sno2_loss_eval_typ_p == null) {
			Dtl_sno2_loss_eval_typ_p = createDtl_sno2_loss_eval_typ_ListPutter(columnDtl_sno2_loss_eval_typ, "sno2_loss_eval_typ", "sno2_loss_eval_typ_nm");

		}
		return Dtl_sno2_loss_eval_typ_p;
	}
	
	
	/** [Dtl_sno3_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_loss_eval_typ_p = null;

	/**
	 * [Dtl_sno3_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_loss_eval_typ_ListPutter() {
		if (Dtl_sno3_loss_eval_typ_p == null) {
			Dtl_sno3_loss_eval_typ_p = createDtl_sno3_loss_eval_typ_ListPutter(columnDtl_sno3_loss_eval_typ, "sno3_loss_eval_typ", "sno3_loss_eval_typ_nm");

		}
		return Dtl_sno3_loss_eval_typ_p;
	}
	
	
	/** [Dtl_sno4_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_loss_eval_typ_p = null;

	/**
	 * [Dtl_sno4_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_loss_eval_typ_ListPutter() {
		if (Dtl_sno4_loss_eval_typ_p == null) {
			Dtl_sno4_loss_eval_typ_p = createDtl_sno4_loss_eval_typ_ListPutter(columnDtl_sno4_loss_eval_typ, "sno4_loss_eval_typ", "sno4_loss_eval_typ_nm");

		}
		return Dtl_sno4_loss_eval_typ_p;
	}
	
	
	/** [Dtl_asst_loss_eval_typ_ListPutter]の定義 */
	private MCListPutter Dtl_asst_loss_eval_typ_p = null;

	/**
	 * [Dtl_asst_loss_eval_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asst_loss_eval_typ_ListPutter() {
		if (Dtl_asst_loss_eval_typ_p == null) {
			Dtl_asst_loss_eval_typ_p = createDtl_asst_loss_eval_typ_ListPutter(columnDtl_asst_loss_eval_typ, "asst_loss_eval_typ", "asst_loss_eval_typ_nm");

		}
		return Dtl_asst_loss_eval_typ_p;
	}
	
	
	/** [Dtl_std_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_std_rnd_typ_p = null;

	/**
	 * [Dtl_std_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_std_rnd_typ_ListPutter() {
		if (Dtl_std_rnd_typ_p == null) {
			Dtl_std_rnd_typ_p = createDtl_std_rnd_typ_ListPutter(columnDtl_std_rnd_typ, "std_rnd_typ", "std_rnd_typ_nm");

		}
		return Dtl_std_rnd_typ_p;
	}
	
	
	/** [Dtl_ave_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ave_rnd_typ_p = null;

	/**
	 * [Dtl_ave_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ave_rnd_typ_ListPutter() {
		if (Dtl_ave_rnd_typ_p == null) {
			Dtl_ave_rnd_typ_p = createDtl_ave_rnd_typ_ListPutter(columnDtl_ave_rnd_typ, "ave_rnd_typ", "ave_rnd_typ_nm");

		}
		return Dtl_ave_rnd_typ_p;
	}
	
	
	/** [Dtl_adj_typ_ListPutter]の定義 */
	private MCListPutter Dtl_adj_typ_p = null;

	/**
	 * [Dtl_adj_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_adj_typ_ListPutter() {
		if (Dtl_adj_typ_p == null) {
			Dtl_adj_typ_p = createDtl_adj_typ_ListPutter(columnDtl_adj_typ, "adj_typ", "adj_typ_nm");

		}
		return Dtl_adj_typ_p;
	}
	
	
	/** [Dtl_wip_typ_ListPutter]の定義 */
	private MCListPutter Dtl_wip_typ_p = null;

	/**
	 * [Dtl_wip_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wip_typ_ListPutter() {
		if (Dtl_wip_typ_p == null) {
			Dtl_wip_typ_p = createDtl_wip_typ_ListPutter(columnDtl_wip_typ, "wip_typ", "wip_typ_nm");

		}
		return Dtl_wip_typ_p;
	}
	
	
	/** [Dtl_bd_agg_typ_ListPutter]の定義 */
	private MCListPutter Dtl_bd_agg_typ_p = null;

	/**
	 * [Dtl_bd_agg_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bd_agg_typ_ListPutter() {
		if (Dtl_bd_agg_typ_p == null) {
			Dtl_bd_agg_typ_p = createDtl_bd_agg_typ_ListPutter(columnDtl_bd_agg_typ, "bd_agg_typ", "bd_agg_typ_nm");

		}
		return Dtl_bd_agg_typ_p;
	}
	
	
	/** [Dtl_mrgn_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mrgn_expns_cd_p = null;

	/**
	 * [Dtl_mrgn_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mrgn_expns_cd_ListPutter() {
		if (Dtl_mrgn_expns_cd_p == null) {
			Dtl_mrgn_expns_cd_p = createDtl_mrgn_expns_cd_ListPutter(columnDtl_mrgn_expns_cd, "mrgn_expns_cd", "mrgn_expns_nm");

		}
		return Dtl_mrgn_expns_cd_p;
	}
	
	
	/** [Dtl_purc_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_expns_cd_p = null;

	/**
	 * [Dtl_purc_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_expns_cd_ListPutter() {
		if (Dtl_purc_expns_cd_p == null) {
			Dtl_purc_expns_cd_p = createDtl_purc_expns_cd_ListPutter(columnDtl_purc_expns_cd, "purc_expns_cd", "purc_expns_nm");

		}
		return Dtl_purc_expns_cd_p;
	}
	
	
	/** [Dtl_out_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_out_expns_cd_p = null;

	/**
	 * [Dtl_out_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_out_expns_cd_ListPutter() {
		if (Dtl_out_expns_cd_p == null) {
			Dtl_out_expns_cd_p = createDtl_out_expns_cd_ListPutter(columnDtl_out_expns_cd, "out_expns_cd", "out_expns_nm");

		}
		return Dtl_out_expns_cd_p;
	}
	
	
	/** [Dtl_inpt_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_expns_cd_p = null;

	/**
	 * [Dtl_inpt_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_expns_cd_ListPutter() {
		if (Dtl_inpt_expns_cd_p == null) {
			Dtl_inpt_expns_cd_p = createDtl_inpt_expns_cd_ListPutter(columnDtl_inpt_expns_cd, "inpt_expns_cd", "inpt_expns_nm");

		}
		return Dtl_inpt_expns_cd_p;
	}
	
	
	/** [Dtl_ss_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ss_expns_cd_p = null;

	/**
	 * [Dtl_ss_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ss_expns_cd_ListPutter() {
		if (Dtl_ss_expns_cd_p == null) {
			Dtl_ss_expns_cd_p = createDtl_ss_expns_cd_ListPutter(columnDtl_ss_expns_cd, "ss_expns_cd", "ss_expns_nm");

		}
		return Dtl_ss_expns_cd_p;
	}
	
	
	/** [Dtl_prov_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_prov_expns_cd_p = null;

	/**
	 * [Dtl_prov_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prov_expns_cd_ListPutter() {
		if (Dtl_prov_expns_cd_p == null) {
			Dtl_prov_expns_cd_p = createDtl_prov_expns_cd_ListPutter(columnDtl_prov_expns_cd, "prov_expns_cd", "prov_expns_nm");

		}
		return Dtl_prov_expns_cd_p;
	}
	
	
	/** [Dtl_exp_alloc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_exp_alloc_typ_p = null;

	/**
	 * [Dtl_exp_alloc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_exp_alloc_typ_ListPutter() {
		if (Dtl_exp_alloc_typ_p == null) {
			Dtl_exp_alloc_typ_p = createDtl_exp_alloc_typ_ListPutter(columnDtl_exp_alloc_typ, "exp_alloc_typ", "exp_alloc_typ_nm");

		}
		return Dtl_exp_alloc_typ_p;
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
	public static MABGP_CalcPtnReg create(){
		MABGP_CalcPtnReg p = new MABGP_CalcPtnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_CalcPtnReg create(String name){
		MABGP_CalcPtnReg p = new MABGP_CalcPtnReg(name);
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
		MABGP_CalcPtnReg_MC.jbfInitScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitMst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitTop((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitFold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitCnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitCtrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitDtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitDtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitLclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitLcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitLclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbfInitEastBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitMst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitTop((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitFold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitCnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitCtrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitDtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitDtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitLclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitLcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitLclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.jbInitEastBtn((MABGP_CalcPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABGP_CalcPtnReg p) {
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
	protected static void jbfInitTop(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_calc_ptn_cd_Label = p.beansFactory.createLabel("Cnd.calc_ptn_cd_Label");
		p.Cnd_calc_ptn_cd = p.beansFactory.createTextComboBox("Cnd.calc_ptn_cd");
		p.Cnd_calc_ptn_cd.setLabel(p.Cnd_calc_ptn_cd_Label);
		p.Cnd_calc_ptn_nm = p.beansFactory.createTextField("Cnd.calc_ptn_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_calc_ptn_cd = p.beansFactory.createTableColumn("Dtl.calc_ptn_cd", MCColumnType.TEXT);
		p.columnDtl_calc_ptn_nm_lcl = p.beansFactory.createTableColumn("Dtl.calc_ptn_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_calc_ptn_nm = p.beansFactory.createTableColumn("Dtl.calc_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_purc_typ = p.beansFactory.createTableColumn("Dtl.mfg_purc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_purc_typ_nm = p.beansFactory.createTableColumn("Dtl.mfg_purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_eval_typ = p.beansFactory.createTableColumn("Dtl.eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dpt_typ = p.beansFactory.createTableColumn("Dtl.dpt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_typ_nm = p.beansFactory.createTableColumn("Dtl.dpt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_typ = p.beansFactory.createTableColumn("Dtl.lot_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_typ = p.beansFactory.createTableColumn("Dtl.sublot_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_typ = p.beansFactory.createTableColumn("Dtl.sno1_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_typ = p.beansFactory.createTableColumn("Dtl.sno2_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_typ = p.beansFactory.createTableColumn("Dtl.sno3_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_typ = p.beansFactory.createTableColumn("Dtl.sno4_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_act_typ = p.beansFactory.createTableColumn("Dtl.lot_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_act_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_act_typ = p.beansFactory.createTableColumn("Dtl.sublot_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_act_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_act_typ = p.beansFactory.createTableColumn("Dtl.sno1_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_act_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_act_typ = p.beansFactory.createTableColumn("Dtl.sno2_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_act_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_act_typ = p.beansFactory.createTableColumn("Dtl.sno3_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_act_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_act_typ = p.beansFactory.createTableColumn("Dtl.sno4_act_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_act_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_mfg_inst_no_set_typ = p.beansFactory.createTableColumn("Dtl.itm_mfg_inst_no_set_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_mfg_inst_no_set_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_act_no_set_typ = p.beansFactory.createTableColumn("Dtl.mfg_act_no_set_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_act_no_set_typ_nm = p.beansFactory.createTableColumn("Dtl.mfg_act_no_set_typ_nm", MCColumnType.TEXT);
		p.columnDtl_oper_act_no_set_typ = p.beansFactory.createTableColumn("Dtl.oper_act_no_set_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_act_no_set_typ_nm = p.beansFactory.createTableColumn("Dtl.oper_act_no_set_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_exp_typ = p.beansFactory.createTableColumn("Dtl.lot_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_exp_typ = p.beansFactory.createTableColumn("Dtl.sublot_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_exp_typ = p.beansFactory.createTableColumn("Dtl.sno1_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_exp_typ = p.beansFactory.createTableColumn("Dtl.sno2_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_exp_typ = p.beansFactory.createTableColumn("Dtl.sno3_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_exp_typ = p.beansFactory.createTableColumn("Dtl.sno4_exp_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_exp_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_exp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dpt_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.dpt_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.dpt_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.lot_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.sublot_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.sno1_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.sno2_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.sno3_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.sno4_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asst_loss_eval_typ = p.beansFactory.createTableColumn("Dtl.asst_loss_eval_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asst_loss_eval_typ_nm = p.beansFactory.createTableColumn("Dtl.asst_loss_eval_typ_nm", MCColumnType.TEXT);
		p.columnDtl_std_rnd_typ = p.beansFactory.createTableColumn("Dtl.std_rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_std_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.std_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_std_dec_place = p.beansFactory.createTableColumn("Dtl.std_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ave_rnd_typ = p.beansFactory.createTableColumn("Dtl.ave_rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ave_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.ave_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ave_dec_place = p.beansFactory.createTableColumn("Dtl.ave_dec_place", MCColumnType.NUMBER);
		p.columnDtl_adj_typ = p.beansFactory.createTableColumn("Dtl.adj_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_adj_typ_nm = p.beansFactory.createTableColumn("Dtl.adj_typ_nm", MCColumnType.TEXT);
		p.columnDtl_wip_typ = p.beansFactory.createTableColumn("Dtl.wip_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_wip_typ_nm = p.beansFactory.createTableColumn("Dtl.wip_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bd_agg_typ = p.beansFactory.createTableColumn("Dtl.bd_agg_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_bd_agg_typ_nm = p.beansFactory.createTableColumn("Dtl.bd_agg_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mrgn_expns_cd = p.beansFactory.createTableColumn("Dtl.mrgn_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mrgn_expns_nm = p.beansFactory.createTableColumn("Dtl.mrgn_expns_nm", MCColumnType.TEXT);
		p.columnDtl_purc_expns_cd = p.beansFactory.createTableColumn("Dtl.purc_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_expns_nm = p.beansFactory.createTableColumn("Dtl.purc_expns_nm", MCColumnType.TEXT);
		p.columnDtl_out_expns_cd = p.beansFactory.createTableColumn("Dtl.out_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_out_expns_nm = p.beansFactory.createTableColumn("Dtl.out_expns_nm", MCColumnType.TEXT);
		p.columnDtl_inpt_expns_cd = p.beansFactory.createTableColumn("Dtl.inpt_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_expns_nm = p.beansFactory.createTableColumn("Dtl.inpt_expns_nm", MCColumnType.TEXT);
		p.columnDtl_ss_expns_cd = p.beansFactory.createTableColumn("Dtl.ss_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ss_expns_nm = p.beansFactory.createTableColumn("Dtl.ss_expns_nm", MCColumnType.TEXT);
		p.columnDtl_prov_expns_cd = p.beansFactory.createTableColumn("Dtl.prov_expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_prov_expns_nm = p.beansFactory.createTableColumn("Dtl.prov_expns_nm", MCColumnType.TEXT);
		p.columnDtl_exp_alloc_typ = p.beansFactory.createTableColumn("Dtl.exp_alloc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_exp_alloc_typ_nm = p.beansFactory.createTableColumn("Dtl.exp_alloc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABGP_CalcPtnReg p) {
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
	protected static void jbfInitLclWrk(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_calc_ptn_cd = p.beansFactory.createTableColumn("Lcl.calc_ptn_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_calc_ptn_nm = p.beansFactory.createTableColumn("Lcl.calc_ptn_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABGP_CalcPtnReg p) {
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
	protected static void jbfInitBtn(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0110 = p.beansFactory.createButton("Btn.open_MABGP0110", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_CalcPtnReg p) {
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
	protected static void jbInitMst(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABG.MABGP0100.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
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
	protected static void jbInitFold(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_CalcPtnReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.ope_META);
		p.Cnd_calc_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ptn_cd, true);
		p.Cnd_calc_ptn_cd.setLinkBeans(p.Cnd_calc_ptn_nm);
		p.CndPanel.add(p.Cnd_calc_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ptn_cd);
		p.Cnd_calc_ptn_cd.setNextBeans(p.Cnd_calc_ptn_nm);
		p.Cnd_calc_ptn_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.calc_ptn_cd_META);
		p.CndPanel.add(p.Cnd_calc_ptn_nm);
		p.Cnd_calc_ptn_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_calc_ptn_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.calc_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ptn_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0100.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABGP_CalcPtnReg p) {
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
	protected static void jbInitWrk(MABGP_CalcPtnReg p) {
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
	protected static void jbInitDtl(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
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
	protected static void jbInitDtlBtn(MABGP_CalcPtnReg p) {
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
	protected static void jbInitLclWrk(MABGP_CalcPtnReg p) {
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
	protected static void jbInitLcl(MABGP_CalcPtnReg p) {
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
	protected static void jbInitLclBtn(MABGP_CalcPtnReg p) {
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
	protected static void jbInitBtn(MABGP_CalcPtnReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABGP0110);
		p.BtnPanel.setLastBeans(p.Btn_open_MABGP0110);
		p.Btn_open_MABGP0110.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABGP_CalcPtnReg p) {
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
		MABGP_CalcPtnReg_MC.mcInitScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitMst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitTop((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitFold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitCnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitCtrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitDtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitDtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitLclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitLcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitLclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.mcInitEastBtn((MABGP_CalcPtnReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_CalcPtnReg_MC.statusInitUPD_ScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Mst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Top((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Fold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Cnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Ctrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Wrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Dtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_DtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_LclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Lcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_LclAll((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_LclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_Btn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitUPD_EastBtn((MABGP_CalcPtnReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_CalcPtnReg_MC.statusInitFIX_ScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Mst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Top((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Fold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Cnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Ctrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Wrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Dtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_DtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_LclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Lcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_LclAll((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_LclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_Btn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitFIX_EastBtn((MABGP_CalcPtnReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_CalcPtnReg_MC.statusInitDEL_ScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Mst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Top((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Fold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Cnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Ctrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Wrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Dtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_DtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_LclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Lcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_LclAll((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_LclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_Btn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitDEL_EastBtn((MABGP_CalcPtnReg)this);

		// [REF]ステータスのモードの設定
		MABGP_CalcPtnReg_MC.statusInitREF_ScreenOpe((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Mst((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Top((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Fold((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Cnd((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Ctrl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Wrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Dtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_DtlBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_LclWrk((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Lcl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_LclAll((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_LclBtn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_Btn((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.statusInitREF_EastBtn((MABGP_CalcPtnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_CalcPtnReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABGP_CalcPtnReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABGP_CalcPtnReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABGP_CalcPtnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_CalcPtnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_calc_ptn_cd.setListListener(p);
		p.Cnd_calc_ptn_cd.addAllListener(p);
		p.Cnd_calc_ptn_nm.setListListener(p);
		p.Cnd_calc_ptn_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABGP_CalcPtnReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABGP_CalcPtnReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_CalcPtnReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_calc_ptn_cd.addAllListener(p);
		p.columnDtl_calc_ptn_cd.setListListener(p);
		p.columnDtl_calc_ptn_nm_lcl.addAllListener(p);
		p.columnDtl_calc_ptn_nm_lcl.setListListener(p);
		p.columnDtl_calc_ptn_nm.addAllListener(p);
		p.columnDtl_calc_ptn_nm.setListListener(p);
		p.columnDtl_mfg_purc_typ.addAllListener(p);
		p.columnDtl_mfg_purc_typ.setListListener(p);
		p.columnDtl_mfg_purc_typ_nm.addAllListener(p);
		p.columnDtl_mfg_purc_typ_nm.setListListener(p);
		p.columnDtl_eval_typ.addAllListener(p);
		p.columnDtl_eval_typ.setListListener(p);
		p.columnDtl_eval_typ_nm.addAllListener(p);
		p.columnDtl_eval_typ_nm.setListListener(p);
		p.columnDtl_dpt_typ.addAllListener(p);
		p.columnDtl_dpt_typ.setListListener(p);
		p.columnDtl_dpt_typ_nm.addAllListener(p);
		p.columnDtl_dpt_typ_nm.setListListener(p);
		p.columnDtl_lot_typ.addAllListener(p);
		p.columnDtl_lot_typ.setListListener(p);
		p.columnDtl_lot_typ_nm.addAllListener(p);
		p.columnDtl_lot_typ_nm.setListListener(p);
		p.columnDtl_sublot_typ.addAllListener(p);
		p.columnDtl_sublot_typ.setListListener(p);
		p.columnDtl_sublot_typ_nm.addAllListener(p);
		p.columnDtl_sublot_typ_nm.setListListener(p);
		p.columnDtl_sno1_typ.addAllListener(p);
		p.columnDtl_sno1_typ.setListListener(p);
		p.columnDtl_sno1_typ_nm.addAllListener(p);
		p.columnDtl_sno1_typ_nm.setListListener(p);
		p.columnDtl_sno2_typ.addAllListener(p);
		p.columnDtl_sno2_typ.setListListener(p);
		p.columnDtl_sno2_typ_nm.addAllListener(p);
		p.columnDtl_sno2_typ_nm.setListListener(p);
		p.columnDtl_sno3_typ.addAllListener(p);
		p.columnDtl_sno3_typ.setListListener(p);
		p.columnDtl_sno3_typ_nm.addAllListener(p);
		p.columnDtl_sno3_typ_nm.setListListener(p);
		p.columnDtl_sno4_typ.addAllListener(p);
		p.columnDtl_sno4_typ.setListListener(p);
		p.columnDtl_sno4_typ_nm.addAllListener(p);
		p.columnDtl_sno4_typ_nm.setListListener(p);
		p.columnDtl_lot_act_typ.addAllListener(p);
		p.columnDtl_lot_act_typ.setListListener(p);
		p.columnDtl_lot_act_typ_nm.addAllListener(p);
		p.columnDtl_lot_act_typ_nm.setListListener(p);
		p.columnDtl_sublot_act_typ.addAllListener(p);
		p.columnDtl_sublot_act_typ.setListListener(p);
		p.columnDtl_sublot_act_typ_nm.addAllListener(p);
		p.columnDtl_sublot_act_typ_nm.setListListener(p);
		p.columnDtl_sno1_act_typ.addAllListener(p);
		p.columnDtl_sno1_act_typ.setListListener(p);
		p.columnDtl_sno1_act_typ_nm.addAllListener(p);
		p.columnDtl_sno1_act_typ_nm.setListListener(p);
		p.columnDtl_sno2_act_typ.addAllListener(p);
		p.columnDtl_sno2_act_typ.setListListener(p);
		p.columnDtl_sno2_act_typ_nm.addAllListener(p);
		p.columnDtl_sno2_act_typ_nm.setListListener(p);
		p.columnDtl_sno3_act_typ.addAllListener(p);
		p.columnDtl_sno3_act_typ.setListListener(p);
		p.columnDtl_sno3_act_typ_nm.addAllListener(p);
		p.columnDtl_sno3_act_typ_nm.setListListener(p);
		p.columnDtl_sno4_act_typ.addAllListener(p);
		p.columnDtl_sno4_act_typ.setListListener(p);
		p.columnDtl_sno4_act_typ_nm.addAllListener(p);
		p.columnDtl_sno4_act_typ_nm.setListListener(p);
		p.columnDtl_itm_mfg_inst_no_set_typ.addAllListener(p);
		p.columnDtl_itm_mfg_inst_no_set_typ.setListListener(p);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.addAllListener(p);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.setListListener(p);
		p.columnDtl_mfg_act_no_set_typ.addAllListener(p);
		p.columnDtl_mfg_act_no_set_typ.setListListener(p);
		p.columnDtl_mfg_act_no_set_typ_nm.addAllListener(p);
		p.columnDtl_mfg_act_no_set_typ_nm.setListListener(p);
		p.columnDtl_oper_act_no_set_typ.addAllListener(p);
		p.columnDtl_oper_act_no_set_typ.setListListener(p);
		p.columnDtl_oper_act_no_set_typ_nm.addAllListener(p);
		p.columnDtl_oper_act_no_set_typ_nm.setListListener(p);
		p.columnDtl_lot_exp_typ.addAllListener(p);
		p.columnDtl_lot_exp_typ.setListListener(p);
		p.columnDtl_lot_exp_typ_nm.addAllListener(p);
		p.columnDtl_lot_exp_typ_nm.setListListener(p);
		p.columnDtl_sublot_exp_typ.addAllListener(p);
		p.columnDtl_sublot_exp_typ.setListListener(p);
		p.columnDtl_sublot_exp_typ_nm.addAllListener(p);
		p.columnDtl_sublot_exp_typ_nm.setListListener(p);
		p.columnDtl_sno1_exp_typ.addAllListener(p);
		p.columnDtl_sno1_exp_typ.setListListener(p);
		p.columnDtl_sno1_exp_typ_nm.addAllListener(p);
		p.columnDtl_sno1_exp_typ_nm.setListListener(p);
		p.columnDtl_sno2_exp_typ.addAllListener(p);
		p.columnDtl_sno2_exp_typ.setListListener(p);
		p.columnDtl_sno2_exp_typ_nm.addAllListener(p);
		p.columnDtl_sno2_exp_typ_nm.setListListener(p);
		p.columnDtl_sno3_exp_typ.addAllListener(p);
		p.columnDtl_sno3_exp_typ.setListListener(p);
		p.columnDtl_sno3_exp_typ_nm.addAllListener(p);
		p.columnDtl_sno3_exp_typ_nm.setListListener(p);
		p.columnDtl_sno4_exp_typ.addAllListener(p);
		p.columnDtl_sno4_exp_typ.setListListener(p);
		p.columnDtl_sno4_exp_typ_nm.addAllListener(p);
		p.columnDtl_sno4_exp_typ_nm.setListListener(p);
		p.columnDtl_dpt_loss_eval_typ.addAllListener(p);
		p.columnDtl_dpt_loss_eval_typ.setListListener(p);
		p.columnDtl_dpt_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_dpt_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_lot_loss_eval_typ.addAllListener(p);
		p.columnDtl_lot_loss_eval_typ.setListListener(p);
		p.columnDtl_lot_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_lot_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_sublot_loss_eval_typ.addAllListener(p);
		p.columnDtl_sublot_loss_eval_typ.setListListener(p);
		p.columnDtl_sublot_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_sublot_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_sno1_loss_eval_typ.addAllListener(p);
		p.columnDtl_sno1_loss_eval_typ.setListListener(p);
		p.columnDtl_sno1_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_sno1_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_sno2_loss_eval_typ.addAllListener(p);
		p.columnDtl_sno2_loss_eval_typ.setListListener(p);
		p.columnDtl_sno2_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_sno2_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_sno3_loss_eval_typ.addAllListener(p);
		p.columnDtl_sno3_loss_eval_typ.setListListener(p);
		p.columnDtl_sno3_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_sno3_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_sno4_loss_eval_typ.addAllListener(p);
		p.columnDtl_sno4_loss_eval_typ.setListListener(p);
		p.columnDtl_sno4_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_sno4_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_asst_loss_eval_typ.addAllListener(p);
		p.columnDtl_asst_loss_eval_typ.setListListener(p);
		p.columnDtl_asst_loss_eval_typ_nm.addAllListener(p);
		p.columnDtl_asst_loss_eval_typ_nm.setListListener(p);
		p.columnDtl_std_rnd_typ.addAllListener(p);
		p.columnDtl_std_rnd_typ.setListListener(p);
		p.columnDtl_std_rnd_typ_nm.addAllListener(p);
		p.columnDtl_std_rnd_typ_nm.setListListener(p);
		p.columnDtl_std_dec_place.addAllListener(p);
		p.columnDtl_std_dec_place.setListListener(p);
		p.columnDtl_ave_rnd_typ.addAllListener(p);
		p.columnDtl_ave_rnd_typ.setListListener(p);
		p.columnDtl_ave_rnd_typ_nm.addAllListener(p);
		p.columnDtl_ave_rnd_typ_nm.setListListener(p);
		p.columnDtl_ave_dec_place.addAllListener(p);
		p.columnDtl_ave_dec_place.setListListener(p);
		p.columnDtl_adj_typ.addAllListener(p);
		p.columnDtl_adj_typ.setListListener(p);
		p.columnDtl_adj_typ_nm.addAllListener(p);
		p.columnDtl_adj_typ_nm.setListListener(p);
		p.columnDtl_wip_typ.addAllListener(p);
		p.columnDtl_wip_typ.setListListener(p);
		p.columnDtl_wip_typ_nm.addAllListener(p);
		p.columnDtl_wip_typ_nm.setListListener(p);
		p.columnDtl_bd_agg_typ.addAllListener(p);
		p.columnDtl_bd_agg_typ.setListListener(p);
		p.columnDtl_bd_agg_typ_nm.addAllListener(p);
		p.columnDtl_bd_agg_typ_nm.setListListener(p);
		p.columnDtl_mrgn_expns_cd.addAllListener(p);
		p.columnDtl_mrgn_expns_cd.setListListener(p);
		p.columnDtl_mrgn_expns_nm.addAllListener(p);
		p.columnDtl_mrgn_expns_nm.setListListener(p);
		p.columnDtl_purc_expns_cd.addAllListener(p);
		p.columnDtl_purc_expns_cd.setListListener(p);
		p.columnDtl_purc_expns_nm.addAllListener(p);
		p.columnDtl_purc_expns_nm.setListListener(p);
		p.columnDtl_out_expns_cd.addAllListener(p);
		p.columnDtl_out_expns_cd.setListListener(p);
		p.columnDtl_out_expns_nm.addAllListener(p);
		p.columnDtl_out_expns_nm.setListListener(p);
		p.columnDtl_inpt_expns_cd.addAllListener(p);
		p.columnDtl_inpt_expns_cd.setListListener(p);
		p.columnDtl_inpt_expns_nm.addAllListener(p);
		p.columnDtl_inpt_expns_nm.setListListener(p);
		p.columnDtl_ss_expns_cd.addAllListener(p);
		p.columnDtl_ss_expns_cd.setListListener(p);
		p.columnDtl_ss_expns_nm.addAllListener(p);
		p.columnDtl_ss_expns_nm.setListListener(p);
		p.columnDtl_prov_expns_cd.addAllListener(p);
		p.columnDtl_prov_expns_cd.setListListener(p);
		p.columnDtl_prov_expns_nm.addAllListener(p);
		p.columnDtl_prov_expns_nm.setListListener(p);
		p.columnDtl_exp_alloc_typ.addAllListener(p);
		p.columnDtl_exp_alloc_typ.setListListener(p);
		p.columnDtl_exp_alloc_typ_nm.addAllListener(p);
		p.columnDtl_exp_alloc_typ_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
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
	protected static void mcInitDtlBtn(MABGP_CalcPtnReg p) {
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
	protected static void mcInitLclWrk(MABGP_CalcPtnReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABGP_CalcPtnReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_calc_ptn_cd.addAllListener(p);
		p.columnLcl_calc_ptn_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_calc_ptn_nm.addAllListener(p);
		p.columnLcl_calc_ptn_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
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
	protected static void mcInitLclBtn(MABGP_CalcPtnReg p) {
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
	protected static void mcInitBtn(MABGP_CalcPtnReg p) {
		p.Btn_open_MABGP0110.addAllListener(p);
		p.Btn_open_MABGP0110.setAPMethodName("doBtn_open_MABGP0110");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_CalcPtnReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABGP_CalcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_CalcPtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_CalcPtnReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_calc_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_calc_ptn_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mfg_purc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mfg_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dpt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_act_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_act_no_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_act_no_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_exp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dpt_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_asst_loss_eval_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_std_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_dec_place.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ave_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ave_dec_place.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_adj_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_adj_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wip_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bd_agg_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mrgn_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_out_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_out_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inpt_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ss_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prov_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_exp_alloc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_DtlBtn(MABGP_CalcPtnReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABGP_CalcPtnReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_calc_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_LclAll(MABGP_CalcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABGP_CalcPtnReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_CalcPtnReg p){
		p.Btn_open_MABGP0110.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABGP_CalcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_CalcPtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_calc_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_calc_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_CalcPtnReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ave_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_adj_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_adj_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_out_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_out_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABGP_CalcPtnReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABGP_CalcPtnReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_LclAll(MABGP_CalcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABGP_CalcPtnReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_CalcPtnReg p){
		p.Btn_open_MABGP0110.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABGP_CalcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_CalcPtnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_CalcPtnReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ave_dec_place.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_adj_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_adj_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wip_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_out_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_out_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABGP_CalcPtnReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABGP_CalcPtnReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_LclAll(MABGP_CalcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABGP_CalcPtnReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_CalcPtnReg p){
		p.Btn_open_MABGP0110.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABGP_CalcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_CalcPtnReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_CalcPtnReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_act_no_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_act_no_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_exp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_loss_eval_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ave_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ave_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_adj_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_adj_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_agg_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrgn_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_out_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_out_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ss_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_exp_alloc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABGP_CalcPtnReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABGP_CalcPtnReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_calc_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_calc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_LclAll(MABGP_CalcPtnReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABGP_CalcPtnReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_CalcPtnReg p){
		p.Btn_open_MABGP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_CalcPtnReg p){

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
		MABGP_CalcPtnReg_MC.setTableConfigDtl((MABGP_CalcPtnReg)this);
		MABGP_CalcPtnReg_MC.setTableConfigLcl((MABGP_CalcPtnReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_CalcPtnReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0100.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0100.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_calc_ptn_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.calc_ptn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ptn_cd);
		p.columnDtl_calc_ptn_nm_lcl.setMeta(mcframe.clientMABG.MABGP0100.DtlR.calc_ptn_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ptn_nm_lcl);
		p.columnDtl_calc_ptn_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.calc_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ptn_nm);
		p.columnDtl_mfg_purc_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mfg_purc_typ_META);
		p.columnDtl_mfg_purc_typ.addLinkBeans(p.columnDtl_mfg_purc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_purc_typ);
		p.columnDtl_mfg_purc_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mfg_purc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_purc_typ_nm);
		p.columnDtl_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.eval_typ_META);
		p.columnDtl_eval_typ.addLinkBeans(p.columnDtl_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_eval_typ);
		p.columnDtl_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_eval_typ_nm);
		p.columnDtl_dpt_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.dpt_typ_META);
		p.columnDtl_dpt_typ.addLinkBeans(p.columnDtl_dpt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_typ);
		p.columnDtl_dpt_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.dpt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_typ_nm);
		p.columnDtl_lot_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_typ_META);
		p.columnDtl_lot_typ.addLinkBeans(p.columnDtl_lot_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_typ);
		p.columnDtl_lot_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_typ_nm);
		p.columnDtl_sublot_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_typ_META);
		p.columnDtl_sublot_typ.addLinkBeans(p.columnDtl_sublot_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_typ);
		p.columnDtl_sublot_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_typ_nm);
		p.columnDtl_sno1_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_typ_META);
		p.columnDtl_sno1_typ.addLinkBeans(p.columnDtl_sno1_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_typ);
		p.columnDtl_sno1_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_typ_nm);
		p.columnDtl_sno2_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_typ_META);
		p.columnDtl_sno2_typ.addLinkBeans(p.columnDtl_sno2_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_typ);
		p.columnDtl_sno2_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_typ_nm);
		p.columnDtl_sno3_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_typ_META);
		p.columnDtl_sno3_typ.addLinkBeans(p.columnDtl_sno3_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_typ);
		p.columnDtl_sno3_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_typ_nm);
		p.columnDtl_sno4_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_typ_META);
		p.columnDtl_sno4_typ.addLinkBeans(p.columnDtl_sno4_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_typ);
		p.columnDtl_sno4_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_typ_nm);
		p.columnDtl_lot_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_act_typ_META);
		p.columnDtl_lot_act_typ.addLinkBeans(p.columnDtl_lot_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_act_typ);
		p.columnDtl_lot_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_act_typ_nm);
		p.columnDtl_sublot_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_act_typ_META);
		p.columnDtl_sublot_act_typ.addLinkBeans(p.columnDtl_sublot_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_act_typ);
		p.columnDtl_sublot_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_act_typ_nm);
		p.columnDtl_sno1_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_act_typ_META);
		p.columnDtl_sno1_act_typ.addLinkBeans(p.columnDtl_sno1_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_act_typ);
		p.columnDtl_sno1_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_act_typ_nm);
		p.columnDtl_sno2_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_act_typ_META);
		p.columnDtl_sno2_act_typ.addLinkBeans(p.columnDtl_sno2_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_act_typ);
		p.columnDtl_sno2_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_act_typ_nm);
		p.columnDtl_sno3_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_act_typ_META);
		p.columnDtl_sno3_act_typ.addLinkBeans(p.columnDtl_sno3_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_act_typ);
		p.columnDtl_sno3_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_act_typ_nm);
		p.columnDtl_sno4_act_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_act_typ_META);
		p.columnDtl_sno4_act_typ.addLinkBeans(p.columnDtl_sno4_act_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_act_typ);
		p.columnDtl_sno4_act_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_act_typ_nm);
		p.columnDtl_itm_mfg_inst_no_set_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.itm_mfg_inst_no_set_typ_META);
		p.columnDtl_itm_mfg_inst_no_set_typ.addLinkBeans(p.columnDtl_itm_mfg_inst_no_set_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_mfg_inst_no_set_typ);
		p.columnDtl_itm_mfg_inst_no_set_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.itm_mfg_inst_no_set_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_mfg_inst_no_set_typ_nm);
		p.columnDtl_mfg_act_no_set_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mfg_act_no_set_typ_META);
		p.columnDtl_mfg_act_no_set_typ.addLinkBeans(p.columnDtl_mfg_act_no_set_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_act_no_set_typ);
		p.columnDtl_mfg_act_no_set_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mfg_act_no_set_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_act_no_set_typ_nm);
		p.columnDtl_oper_act_no_set_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.oper_act_no_set_typ_META);
		p.columnDtl_oper_act_no_set_typ.addLinkBeans(p.columnDtl_oper_act_no_set_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_act_no_set_typ);
		p.columnDtl_oper_act_no_set_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.oper_act_no_set_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_act_no_set_typ_nm);
		p.columnDtl_lot_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_exp_typ_META);
		p.columnDtl_lot_exp_typ.addLinkBeans(p.columnDtl_lot_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_exp_typ);
		p.columnDtl_lot_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_exp_typ_nm);
		p.columnDtl_sublot_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_exp_typ_META);
		p.columnDtl_sublot_exp_typ.addLinkBeans(p.columnDtl_sublot_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_exp_typ);
		p.columnDtl_sublot_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_exp_typ_nm);
		p.columnDtl_sno1_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_exp_typ_META);
		p.columnDtl_sno1_exp_typ.addLinkBeans(p.columnDtl_sno1_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_exp_typ);
		p.columnDtl_sno1_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_exp_typ_nm);
		p.columnDtl_sno2_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_exp_typ_META);
		p.columnDtl_sno2_exp_typ.addLinkBeans(p.columnDtl_sno2_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_exp_typ);
		p.columnDtl_sno2_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_exp_typ_nm);
		p.columnDtl_sno3_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_exp_typ_META);
		p.columnDtl_sno3_exp_typ.addLinkBeans(p.columnDtl_sno3_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_exp_typ);
		p.columnDtl_sno3_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_exp_typ_nm);
		p.columnDtl_sno4_exp_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_exp_typ_META);
		p.columnDtl_sno4_exp_typ.addLinkBeans(p.columnDtl_sno4_exp_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_exp_typ);
		p.columnDtl_sno4_exp_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_exp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_exp_typ_nm);
		p.columnDtl_dpt_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.dpt_loss_eval_typ_META);
		p.columnDtl_dpt_loss_eval_typ.addLinkBeans(p.columnDtl_dpt_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_loss_eval_typ);
		p.columnDtl_dpt_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.dpt_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_loss_eval_typ_nm);
		p.columnDtl_lot_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_loss_eval_typ_META);
		p.columnDtl_lot_loss_eval_typ.addLinkBeans(p.columnDtl_lot_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_loss_eval_typ);
		p.columnDtl_lot_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.lot_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_loss_eval_typ_nm);
		p.columnDtl_sublot_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_loss_eval_typ_META);
		p.columnDtl_sublot_loss_eval_typ.addLinkBeans(p.columnDtl_sublot_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_loss_eval_typ);
		p.columnDtl_sublot_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sublot_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_loss_eval_typ_nm);
		p.columnDtl_sno1_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_loss_eval_typ_META);
		p.columnDtl_sno1_loss_eval_typ.addLinkBeans(p.columnDtl_sno1_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_loss_eval_typ);
		p.columnDtl_sno1_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno1_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_loss_eval_typ_nm);
		p.columnDtl_sno2_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_loss_eval_typ_META);
		p.columnDtl_sno2_loss_eval_typ.addLinkBeans(p.columnDtl_sno2_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_loss_eval_typ);
		p.columnDtl_sno2_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno2_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_loss_eval_typ_nm);
		p.columnDtl_sno3_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_loss_eval_typ_META);
		p.columnDtl_sno3_loss_eval_typ.addLinkBeans(p.columnDtl_sno3_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_loss_eval_typ);
		p.columnDtl_sno3_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno3_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_loss_eval_typ_nm);
		p.columnDtl_sno4_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_loss_eval_typ_META);
		p.columnDtl_sno4_loss_eval_typ.addLinkBeans(p.columnDtl_sno4_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_loss_eval_typ);
		p.columnDtl_sno4_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.sno4_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_loss_eval_typ_nm);
		p.columnDtl_asst_loss_eval_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.asst_loss_eval_typ_META);
		p.columnDtl_asst_loss_eval_typ.addLinkBeans(p.columnDtl_asst_loss_eval_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_loss_eval_typ);
		p.columnDtl_asst_loss_eval_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.asst_loss_eval_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_loss_eval_typ_nm);
		p.columnDtl_std_rnd_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.std_rnd_typ_META);
		p.columnDtl_std_rnd_typ.addLinkBeans(p.columnDtl_std_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ);
		p.columnDtl_std_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.std_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_rnd_typ_nm);
		p.columnDtl_std_dec_place.setMeta(mcframe.clientMABG.MABGP0100.DtlR.std_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_dec_place);
		p.columnDtl_ave_rnd_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ave_rnd_typ_META);
		p.columnDtl_ave_rnd_typ.addLinkBeans(p.columnDtl_ave_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_rnd_typ);
		p.columnDtl_ave_rnd_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ave_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_rnd_typ_nm);
		p.columnDtl_ave_dec_place.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ave_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ave_dec_place);
		p.columnDtl_adj_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.adj_typ_META);
		p.columnDtl_adj_typ.addLinkBeans(p.columnDtl_adj_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_adj_typ);
		p.columnDtl_adj_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.adj_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_adj_typ_nm);
		p.columnDtl_wip_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.wip_typ_META);
		p.columnDtl_wip_typ.addLinkBeans(p.columnDtl_wip_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wip_typ);
		p.columnDtl_wip_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.wip_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wip_typ_nm);
		p.columnDtl_bd_agg_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.bd_agg_typ_META);
		p.columnDtl_bd_agg_typ.addLinkBeans(p.columnDtl_bd_agg_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_agg_typ);
		p.columnDtl_bd_agg_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.bd_agg_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_agg_typ_nm);
		p.columnDtl_mrgn_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mrgn_expns_cd_META);
		p.columnDtl_mrgn_expns_cd.addLinkBeans(p.columnDtl_mrgn_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mrgn_expns_cd);
		p.columnDtl_mrgn_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.mrgn_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrgn_expns_nm);
		p.columnDtl_purc_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.purc_expns_cd_META);
		p.columnDtl_purc_expns_cd.addLinkBeans(p.columnDtl_purc_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_expns_cd);
		p.columnDtl_purc_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.purc_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_expns_nm);
		p.columnDtl_out_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.out_expns_cd_META);
		p.columnDtl_out_expns_cd.addLinkBeans(p.columnDtl_out_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_out_expns_cd);
		p.columnDtl_out_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.out_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_out_expns_nm);
		p.columnDtl_inpt_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.inpt_expns_cd_META);
		p.columnDtl_inpt_expns_cd.addLinkBeans(p.columnDtl_inpt_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_expns_cd);
		p.columnDtl_inpt_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.inpt_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_expns_nm);
		p.columnDtl_ss_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ss_expns_cd_META);
		p.columnDtl_ss_expns_cd.addLinkBeans(p.columnDtl_ss_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ss_expns_cd);
		p.columnDtl_ss_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ss_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ss_expns_nm);
		p.columnDtl_prov_expns_cd.setMeta(mcframe.clientMABG.MABGP0100.DtlR.prov_expns_cd_META);
		p.columnDtl_prov_expns_cd.addLinkBeans(p.columnDtl_prov_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_expns_cd);
		p.columnDtl_prov_expns_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.prov_expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_expns_nm);
		p.columnDtl_exp_alloc_typ.setMeta(mcframe.clientMABG.MABGP0100.DtlR.exp_alloc_typ_META);
		p.columnDtl_exp_alloc_typ.addLinkBeans(p.columnDtl_exp_alloc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_exp_alloc_typ);
		p.columnDtl_exp_alloc_typ_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.exp_alloc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_exp_alloc_typ_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0100.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0100.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0100.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0100.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0100.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0100.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0100.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABGP_CalcPtnReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABG.MABGP0100.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_calc_ptn_cd.setMeta(mcframe.clientMABG.MABGP0100.LclR.calc_ptn_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_calc_ptn_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABG.MABGP0100.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_calc_ptn_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.calc_ptn_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_calc_ptn_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABG.MABGP0100.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABG.MABGP0100.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABG.MABGP0100.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0100.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABG.MABGP0100.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0100.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0100.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ptn_cd.getListConfig().setPutter(getCnd_calc_ptn_cd_ListPutter());
		columnDtl_mfg_purc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_purc_typ.getListConfig().setPutter(getDtl_mfg_purc_typ_ListPutter());
		columnDtl_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_eval_typ.getListConfig().setPutter(getDtl_eval_typ_ListPutter());
		columnDtl_dpt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_typ.getListConfig().setPutter(getDtl_dpt_typ_ListPutter());
		columnDtl_lot_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_typ.getListConfig().setPutter(getDtl_lot_typ_ListPutter());
		columnDtl_sublot_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_typ.getListConfig().setPutter(getDtl_sublot_typ_ListPutter());
		columnDtl_sno1_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_typ.getListConfig().setPutter(getDtl_sno1_typ_ListPutter());
		columnDtl_sno2_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_typ.getListConfig().setPutter(getDtl_sno2_typ_ListPutter());
		columnDtl_sno3_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_typ.getListConfig().setPutter(getDtl_sno3_typ_ListPutter());
		columnDtl_sno4_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_typ.getListConfig().setPutter(getDtl_sno4_typ_ListPutter());
		columnDtl_lot_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_act_typ.getListConfig().setPutter(getDtl_lot_act_typ_ListPutter());
		columnDtl_sublot_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_act_typ.getListConfig().setPutter(getDtl_sublot_act_typ_ListPutter());
		columnDtl_sno1_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_act_typ.getListConfig().setPutter(getDtl_sno1_act_typ_ListPutter());
		columnDtl_sno2_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_act_typ.getListConfig().setPutter(getDtl_sno2_act_typ_ListPutter());
		columnDtl_sno3_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_act_typ.getListConfig().setPutter(getDtl_sno3_act_typ_ListPutter());
		columnDtl_sno4_act_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_act_typ.getListConfig().setPutter(getDtl_sno4_act_typ_ListPutter());
		columnDtl_itm_mfg_inst_no_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_mfg_inst_no_set_typ.getListConfig().setPutter(getDtl_itm_mfg_inst_no_set_typ_ListPutter());
		columnDtl_mfg_act_no_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_act_no_set_typ.getListConfig().setPutter(getDtl_mfg_act_no_set_typ_ListPutter());
		columnDtl_oper_act_no_set_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_act_no_set_typ.getListConfig().setPutter(getDtl_oper_act_no_set_typ_ListPutter());
		columnDtl_lot_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_exp_typ.getListConfig().setPutter(getDtl_lot_exp_typ_ListPutter());
		columnDtl_sublot_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_exp_typ.getListConfig().setPutter(getDtl_sublot_exp_typ_ListPutter());
		columnDtl_sno1_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_exp_typ.getListConfig().setPutter(getDtl_sno1_exp_typ_ListPutter());
		columnDtl_sno2_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_exp_typ.getListConfig().setPutter(getDtl_sno2_exp_typ_ListPutter());
		columnDtl_sno3_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_exp_typ.getListConfig().setPutter(getDtl_sno3_exp_typ_ListPutter());
		columnDtl_sno4_exp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_exp_typ.getListConfig().setPutter(getDtl_sno4_exp_typ_ListPutter());
		columnDtl_dpt_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_loss_eval_typ.getListConfig().setPutter(getDtl_dpt_loss_eval_typ_ListPutter());
		columnDtl_lot_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_loss_eval_typ.getListConfig().setPutter(getDtl_lot_loss_eval_typ_ListPutter());
		columnDtl_sublot_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_loss_eval_typ.getListConfig().setPutter(getDtl_sublot_loss_eval_typ_ListPutter());
		columnDtl_sno1_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_loss_eval_typ.getListConfig().setPutter(getDtl_sno1_loss_eval_typ_ListPutter());
		columnDtl_sno2_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_loss_eval_typ.getListConfig().setPutter(getDtl_sno2_loss_eval_typ_ListPutter());
		columnDtl_sno3_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_loss_eval_typ.getListConfig().setPutter(getDtl_sno3_loss_eval_typ_ListPutter());
		columnDtl_sno4_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_loss_eval_typ.getListConfig().setPutter(getDtl_sno4_loss_eval_typ_ListPutter());
		columnDtl_asst_loss_eval_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asst_loss_eval_typ.getListConfig().setPutter(getDtl_asst_loss_eval_typ_ListPutter());
		columnDtl_std_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_std_rnd_typ.getListConfig().setPutter(getDtl_std_rnd_typ_ListPutter());
		columnDtl_ave_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ave_rnd_typ.getListConfig().setPutter(getDtl_ave_rnd_typ_ListPutter());
		columnDtl_adj_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_adj_typ.getListConfig().setPutter(getDtl_adj_typ_ListPutter());
		columnDtl_wip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wip_typ.getListConfig().setPutter(getDtl_wip_typ_ListPutter());
		columnDtl_bd_agg_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bd_agg_typ.getListConfig().setPutter(getDtl_bd_agg_typ_ListPutter());
		columnDtl_mrgn_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mrgn_expns_cd.getListConfig().setPutter(getDtl_mrgn_expns_cd_ListPutter());
		columnDtl_purc_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_expns_cd.getListConfig().setPutter(getDtl_purc_expns_cd_ListPutter());
		columnDtl_out_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_out_expns_cd.getListConfig().setPutter(getDtl_out_expns_cd_ListPutter());
		columnDtl_inpt_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_expns_cd.getListConfig().setPutter(getDtl_inpt_expns_cd_ListPutter());
		columnDtl_ss_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ss_expns_cd.getListConfig().setPutter(getDtl_ss_expns_cd_ListPutter());
		columnDtl_prov_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prov_expns_cd.getListConfig().setPutter(getDtl_prov_expns_cd_ListPutter());
		columnDtl_exp_alloc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_exp_alloc_typ.getListConfig().setPutter(getDtl_exp_alloc_typ_ListPutter());
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
	 * [Cnd_calc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_mfg_purc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_purc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgPurcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnitCalcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_act_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_act_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ActSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_mfg_inst_no_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_mfg_inst_no_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmMfgInstNoSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_mfg_act_no_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_act_no_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgActNoSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_act_no_set_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_act_no_set_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OperActNoSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_exp_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_exp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpSetTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_asst_loss_eval_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asst_loss_eval_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LossEvalTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_std_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_std_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ave_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ave_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_adj_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_adj_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AdjTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_wip_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WipTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_bd_agg_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bd_agg_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BdAggTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_mrgn_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mrgn_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_out_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_out_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_ss_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ss_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_prov_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prov_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Dtl_exp_alloc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_exp_alloc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpAllocTyp");
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
	 * [LclAll_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLclAll_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_calc_ptn_cd) return getCnd_calc_ptn_cd(row, info);
		if(combo == columnDtl_mfg_purc_typ) return getDtl_mfg_purc_typ(row, info);
		if(combo == columnDtl_eval_typ) return getDtl_eval_typ(row, info);
		if(combo == columnDtl_dpt_typ) return getDtl_dpt_typ(row, info);
		if(combo == columnDtl_lot_typ) return getDtl_lot_typ(row, info);
		if(combo == columnDtl_sublot_typ) return getDtl_sublot_typ(row, info);
		if(combo == columnDtl_sno1_typ) return getDtl_sno1_typ(row, info);
		if(combo == columnDtl_sno2_typ) return getDtl_sno2_typ(row, info);
		if(combo == columnDtl_sno3_typ) return getDtl_sno3_typ(row, info);
		if(combo == columnDtl_sno4_typ) return getDtl_sno4_typ(row, info);
		if(combo == columnDtl_lot_act_typ) return getDtl_lot_act_typ(row, info);
		if(combo == columnDtl_sublot_act_typ) return getDtl_sublot_act_typ(row, info);
		if(combo == columnDtl_sno1_act_typ) return getDtl_sno1_act_typ(row, info);
		if(combo == columnDtl_sno2_act_typ) return getDtl_sno2_act_typ(row, info);
		if(combo == columnDtl_sno3_act_typ) return getDtl_sno3_act_typ(row, info);
		if(combo == columnDtl_sno4_act_typ) return getDtl_sno4_act_typ(row, info);
		if(combo == columnDtl_itm_mfg_inst_no_set_typ) return getDtl_itm_mfg_inst_no_set_typ(row, info);
		if(combo == columnDtl_mfg_act_no_set_typ) return getDtl_mfg_act_no_set_typ(row, info);
		if(combo == columnDtl_oper_act_no_set_typ) return getDtl_oper_act_no_set_typ(row, info);
		if(combo == columnDtl_lot_exp_typ) return getDtl_lot_exp_typ(row, info);
		if(combo == columnDtl_sublot_exp_typ) return getDtl_sublot_exp_typ(row, info);
		if(combo == columnDtl_sno1_exp_typ) return getDtl_sno1_exp_typ(row, info);
		if(combo == columnDtl_sno2_exp_typ) return getDtl_sno2_exp_typ(row, info);
		if(combo == columnDtl_sno3_exp_typ) return getDtl_sno3_exp_typ(row, info);
		if(combo == columnDtl_sno4_exp_typ) return getDtl_sno4_exp_typ(row, info);
		if(combo == columnDtl_dpt_loss_eval_typ) return getDtl_dpt_loss_eval_typ(row, info);
		if(combo == columnDtl_lot_loss_eval_typ) return getDtl_lot_loss_eval_typ(row, info);
		if(combo == columnDtl_sublot_loss_eval_typ) return getDtl_sublot_loss_eval_typ(row, info);
		if(combo == columnDtl_sno1_loss_eval_typ) return getDtl_sno1_loss_eval_typ(row, info);
		if(combo == columnDtl_sno2_loss_eval_typ) return getDtl_sno2_loss_eval_typ(row, info);
		if(combo == columnDtl_sno3_loss_eval_typ) return getDtl_sno3_loss_eval_typ(row, info);
		if(combo == columnDtl_sno4_loss_eval_typ) return getDtl_sno4_loss_eval_typ(row, info);
		if(combo == columnDtl_asst_loss_eval_typ) return getDtl_asst_loss_eval_typ(row, info);
		if(combo == columnDtl_std_rnd_typ) return getDtl_std_rnd_typ(row, info);
		if(combo == columnDtl_ave_rnd_typ) return getDtl_ave_rnd_typ(row, info);
		if(combo == columnDtl_adj_typ) return getDtl_adj_typ(row, info);
		if(combo == columnDtl_wip_typ) return getDtl_wip_typ(row, info);
		if(combo == columnDtl_bd_agg_typ) return getDtl_bd_agg_typ(row, info);
		if(combo == columnDtl_mrgn_expns_cd) return getDtl_mrgn_expns_cd(row, info);
		if(combo == columnDtl_purc_expns_cd) return getDtl_purc_expns_cd(row, info);
		if(combo == columnDtl_out_expns_cd) return getDtl_out_expns_cd(row, info);
		if(combo == columnDtl_inpt_expns_cd) return getDtl_inpt_expns_cd(row, info);
		if(combo == columnDtl_ss_expns_cd) return getDtl_ss_expns_cd(row, info);
		if(combo == columnDtl_prov_expns_cd) return getDtl_prov_expns_cd(row, info);
		if(combo == columnDtl_exp_alloc_typ) return getDtl_exp_alloc_typ(row, info);
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
		else if (ap == Btn_open_MABGP0110) doBtn_open_MABGP0110(info);
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
	 * [Btn]パネルの[open_MABGP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0110(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ptn_cd) return doCnd_calc_ptn_cd_VC(info);
		if (vc == Cnd_calc_ptn_nm) return doCnd_calc_ptn_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_calc_ptn_cd) return doDtl_calc_ptn_cd_VC(info);
		if (vc == columnDtl_calc_ptn_nm_lcl) return doDtl_calc_ptn_nm_lcl_VC(info);
		if (vc == columnDtl_calc_ptn_nm) return doDtl_calc_ptn_nm_VC(info);
		if (vc == columnDtl_mfg_purc_typ) return doDtl_mfg_purc_typ_VC(info);
		if (vc == columnDtl_mfg_purc_typ_nm) return doDtl_mfg_purc_typ_nm_VC(info);
		if (vc == columnDtl_eval_typ) return doDtl_eval_typ_VC(info);
		if (vc == columnDtl_eval_typ_nm) return doDtl_eval_typ_nm_VC(info);
		if (vc == columnDtl_dpt_typ) return doDtl_dpt_typ_VC(info);
		if (vc == columnDtl_dpt_typ_nm) return doDtl_dpt_typ_nm_VC(info);
		if (vc == columnDtl_lot_typ) return doDtl_lot_typ_VC(info);
		if (vc == columnDtl_lot_typ_nm) return doDtl_lot_typ_nm_VC(info);
		if (vc == columnDtl_sublot_typ) return doDtl_sublot_typ_VC(info);
		if (vc == columnDtl_sublot_typ_nm) return doDtl_sublot_typ_nm_VC(info);
		if (vc == columnDtl_sno1_typ) return doDtl_sno1_typ_VC(info);
		if (vc == columnDtl_sno1_typ_nm) return doDtl_sno1_typ_nm_VC(info);
		if (vc == columnDtl_sno2_typ) return doDtl_sno2_typ_VC(info);
		if (vc == columnDtl_sno2_typ_nm) return doDtl_sno2_typ_nm_VC(info);
		if (vc == columnDtl_sno3_typ) return doDtl_sno3_typ_VC(info);
		if (vc == columnDtl_sno3_typ_nm) return doDtl_sno3_typ_nm_VC(info);
		if (vc == columnDtl_sno4_typ) return doDtl_sno4_typ_VC(info);
		if (vc == columnDtl_sno4_typ_nm) return doDtl_sno4_typ_nm_VC(info);
		if (vc == columnDtl_lot_act_typ) return doDtl_lot_act_typ_VC(info);
		if (vc == columnDtl_lot_act_typ_nm) return doDtl_lot_act_typ_nm_VC(info);
		if (vc == columnDtl_sublot_act_typ) return doDtl_sublot_act_typ_VC(info);
		if (vc == columnDtl_sublot_act_typ_nm) return doDtl_sublot_act_typ_nm_VC(info);
		if (vc == columnDtl_sno1_act_typ) return doDtl_sno1_act_typ_VC(info);
		if (vc == columnDtl_sno1_act_typ_nm) return doDtl_sno1_act_typ_nm_VC(info);
		if (vc == columnDtl_sno2_act_typ) return doDtl_sno2_act_typ_VC(info);
		if (vc == columnDtl_sno2_act_typ_nm) return doDtl_sno2_act_typ_nm_VC(info);
		if (vc == columnDtl_sno3_act_typ) return doDtl_sno3_act_typ_VC(info);
		if (vc == columnDtl_sno3_act_typ_nm) return doDtl_sno3_act_typ_nm_VC(info);
		if (vc == columnDtl_sno4_act_typ) return doDtl_sno4_act_typ_VC(info);
		if (vc == columnDtl_sno4_act_typ_nm) return doDtl_sno4_act_typ_nm_VC(info);
		if (vc == columnDtl_itm_mfg_inst_no_set_typ) return doDtl_itm_mfg_inst_no_set_typ_VC(info);
		if (vc == columnDtl_itm_mfg_inst_no_set_typ_nm) return doDtl_itm_mfg_inst_no_set_typ_nm_VC(info);
		if (vc == columnDtl_mfg_act_no_set_typ) return doDtl_mfg_act_no_set_typ_VC(info);
		if (vc == columnDtl_mfg_act_no_set_typ_nm) return doDtl_mfg_act_no_set_typ_nm_VC(info);
		if (vc == columnDtl_oper_act_no_set_typ) return doDtl_oper_act_no_set_typ_VC(info);
		if (vc == columnDtl_oper_act_no_set_typ_nm) return doDtl_oper_act_no_set_typ_nm_VC(info);
		if (vc == columnDtl_lot_exp_typ) return doDtl_lot_exp_typ_VC(info);
		if (vc == columnDtl_lot_exp_typ_nm) return doDtl_lot_exp_typ_nm_VC(info);
		if (vc == columnDtl_sublot_exp_typ) return doDtl_sublot_exp_typ_VC(info);
		if (vc == columnDtl_sublot_exp_typ_nm) return doDtl_sublot_exp_typ_nm_VC(info);
		if (vc == columnDtl_sno1_exp_typ) return doDtl_sno1_exp_typ_VC(info);
		if (vc == columnDtl_sno1_exp_typ_nm) return doDtl_sno1_exp_typ_nm_VC(info);
		if (vc == columnDtl_sno2_exp_typ) return doDtl_sno2_exp_typ_VC(info);
		if (vc == columnDtl_sno2_exp_typ_nm) return doDtl_sno2_exp_typ_nm_VC(info);
		if (vc == columnDtl_sno3_exp_typ) return doDtl_sno3_exp_typ_VC(info);
		if (vc == columnDtl_sno3_exp_typ_nm) return doDtl_sno3_exp_typ_nm_VC(info);
		if (vc == columnDtl_sno4_exp_typ) return doDtl_sno4_exp_typ_VC(info);
		if (vc == columnDtl_sno4_exp_typ_nm) return doDtl_sno4_exp_typ_nm_VC(info);
		if (vc == columnDtl_dpt_loss_eval_typ) return doDtl_dpt_loss_eval_typ_VC(info);
		if (vc == columnDtl_dpt_loss_eval_typ_nm) return doDtl_dpt_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_lot_loss_eval_typ) return doDtl_lot_loss_eval_typ_VC(info);
		if (vc == columnDtl_lot_loss_eval_typ_nm) return doDtl_lot_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_sublot_loss_eval_typ) return doDtl_sublot_loss_eval_typ_VC(info);
		if (vc == columnDtl_sublot_loss_eval_typ_nm) return doDtl_sublot_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_sno1_loss_eval_typ) return doDtl_sno1_loss_eval_typ_VC(info);
		if (vc == columnDtl_sno1_loss_eval_typ_nm) return doDtl_sno1_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_sno2_loss_eval_typ) return doDtl_sno2_loss_eval_typ_VC(info);
		if (vc == columnDtl_sno2_loss_eval_typ_nm) return doDtl_sno2_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_sno3_loss_eval_typ) return doDtl_sno3_loss_eval_typ_VC(info);
		if (vc == columnDtl_sno3_loss_eval_typ_nm) return doDtl_sno3_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_sno4_loss_eval_typ) return doDtl_sno4_loss_eval_typ_VC(info);
		if (vc == columnDtl_sno4_loss_eval_typ_nm) return doDtl_sno4_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_asst_loss_eval_typ) return doDtl_asst_loss_eval_typ_VC(info);
		if (vc == columnDtl_asst_loss_eval_typ_nm) return doDtl_asst_loss_eval_typ_nm_VC(info);
		if (vc == columnDtl_std_rnd_typ) return doDtl_std_rnd_typ_VC(info);
		if (vc == columnDtl_std_rnd_typ_nm) return doDtl_std_rnd_typ_nm_VC(info);
		if (vc == columnDtl_std_dec_place) return doDtl_std_dec_place_VC(info);
		if (vc == columnDtl_ave_rnd_typ) return doDtl_ave_rnd_typ_VC(info);
		if (vc == columnDtl_ave_rnd_typ_nm) return doDtl_ave_rnd_typ_nm_VC(info);
		if (vc == columnDtl_ave_dec_place) return doDtl_ave_dec_place_VC(info);
		if (vc == columnDtl_adj_typ) return doDtl_adj_typ_VC(info);
		if (vc == columnDtl_adj_typ_nm) return doDtl_adj_typ_nm_VC(info);
		if (vc == columnDtl_wip_typ) return doDtl_wip_typ_VC(info);
		if (vc == columnDtl_wip_typ_nm) return doDtl_wip_typ_nm_VC(info);
		if (vc == columnDtl_bd_agg_typ) return doDtl_bd_agg_typ_VC(info);
		if (vc == columnDtl_bd_agg_typ_nm) return doDtl_bd_agg_typ_nm_VC(info);
		if (vc == columnDtl_mrgn_expns_cd) return doDtl_mrgn_expns_cd_VC(info);
		if (vc == columnDtl_mrgn_expns_nm) return doDtl_mrgn_expns_nm_VC(info);
		if (vc == columnDtl_purc_expns_cd) return doDtl_purc_expns_cd_VC(info);
		if (vc == columnDtl_purc_expns_nm) return doDtl_purc_expns_nm_VC(info);
		if (vc == columnDtl_out_expns_cd) return doDtl_out_expns_cd_VC(info);
		if (vc == columnDtl_out_expns_nm) return doDtl_out_expns_nm_VC(info);
		if (vc == columnDtl_inpt_expns_cd) return doDtl_inpt_expns_cd_VC(info);
		if (vc == columnDtl_inpt_expns_nm) return doDtl_inpt_expns_nm_VC(info);
		if (vc == columnDtl_ss_expns_cd) return doDtl_ss_expns_cd_VC(info);
		if (vc == columnDtl_ss_expns_nm) return doDtl_ss_expns_nm_VC(info);
		if (vc == columnDtl_prov_expns_cd) return doDtl_prov_expns_cd_VC(info);
		if (vc == columnDtl_prov_expns_nm) return doDtl_prov_expns_nm_VC(info);
		if (vc == columnDtl_exp_alloc_typ) return doDtl_exp_alloc_typ_VC(info);
		if (vc == columnDtl_exp_alloc_typ_nm) return doDtl_exp_alloc_typ_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
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
		if (vc == columnLcl_calc_ptn_cd) return doLcl_calc_ptn_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_calc_ptn_nm) return doLcl_calc_ptn_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
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
	 * [Cnd]パネルの[calc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ptn_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_purc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_mfg_inst_no_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_mfg_inst_no_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_act_no_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_act_no_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_act_no_set_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_act_no_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_exp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_exp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_loss_eval_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_loss_eval_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ave_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[adj_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_adj_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_adj_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_agg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_agg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrgn_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrgn_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_out_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_out_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ss_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ss_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exp_alloc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exp_alloc_typ_nm_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_calc_ptn_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_calc_ptn_nm_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ptn_cd) doCnd_calc_ptn_cd_NC(info);
		else if (nc == Cnd_calc_ptn_nm) doCnd_calc_ptn_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NC(info);
		else if (nc == columnDtl_calc_ptn_nm_lcl) doDtl_calc_ptn_nm_lcl_NC(info);
		else if (nc == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NC(info);
		else if (nc == columnDtl_mfg_purc_typ) doDtl_mfg_purc_typ_NC(info);
		else if (nc == columnDtl_mfg_purc_typ_nm) doDtl_mfg_purc_typ_nm_NC(info);
		else if (nc == columnDtl_eval_typ) doDtl_eval_typ_NC(info);
		else if (nc == columnDtl_eval_typ_nm) doDtl_eval_typ_nm_NC(info);
		else if (nc == columnDtl_dpt_typ) doDtl_dpt_typ_NC(info);
		else if (nc == columnDtl_dpt_typ_nm) doDtl_dpt_typ_nm_NC(info);
		else if (nc == columnDtl_lot_typ) doDtl_lot_typ_NC(info);
		else if (nc == columnDtl_lot_typ_nm) doDtl_lot_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_typ) doDtl_sublot_typ_NC(info);
		else if (nc == columnDtl_sublot_typ_nm) doDtl_sublot_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_typ) doDtl_sno1_typ_NC(info);
		else if (nc == columnDtl_sno1_typ_nm) doDtl_sno1_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_typ) doDtl_sno2_typ_NC(info);
		else if (nc == columnDtl_sno2_typ_nm) doDtl_sno2_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_typ) doDtl_sno3_typ_NC(info);
		else if (nc == columnDtl_sno3_typ_nm) doDtl_sno3_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_typ) doDtl_sno4_typ_NC(info);
		else if (nc == columnDtl_sno4_typ_nm) doDtl_sno4_typ_nm_NC(info);
		else if (nc == columnDtl_lot_act_typ) doDtl_lot_act_typ_NC(info);
		else if (nc == columnDtl_lot_act_typ_nm) doDtl_lot_act_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_act_typ) doDtl_sublot_act_typ_NC(info);
		else if (nc == columnDtl_sublot_act_typ_nm) doDtl_sublot_act_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_act_typ) doDtl_sno1_act_typ_NC(info);
		else if (nc == columnDtl_sno1_act_typ_nm) doDtl_sno1_act_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_act_typ) doDtl_sno2_act_typ_NC(info);
		else if (nc == columnDtl_sno2_act_typ_nm) doDtl_sno2_act_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_act_typ) doDtl_sno3_act_typ_NC(info);
		else if (nc == columnDtl_sno3_act_typ_nm) doDtl_sno3_act_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_act_typ) doDtl_sno4_act_typ_NC(info);
		else if (nc == columnDtl_sno4_act_typ_nm) doDtl_sno4_act_typ_nm_NC(info);
		else if (nc == columnDtl_itm_mfg_inst_no_set_typ) doDtl_itm_mfg_inst_no_set_typ_NC(info);
		else if (nc == columnDtl_itm_mfg_inst_no_set_typ_nm) doDtl_itm_mfg_inst_no_set_typ_nm_NC(info);
		else if (nc == columnDtl_mfg_act_no_set_typ) doDtl_mfg_act_no_set_typ_NC(info);
		else if (nc == columnDtl_mfg_act_no_set_typ_nm) doDtl_mfg_act_no_set_typ_nm_NC(info);
		else if (nc == columnDtl_oper_act_no_set_typ) doDtl_oper_act_no_set_typ_NC(info);
		else if (nc == columnDtl_oper_act_no_set_typ_nm) doDtl_oper_act_no_set_typ_nm_NC(info);
		else if (nc == columnDtl_lot_exp_typ) doDtl_lot_exp_typ_NC(info);
		else if (nc == columnDtl_lot_exp_typ_nm) doDtl_lot_exp_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_exp_typ) doDtl_sublot_exp_typ_NC(info);
		else if (nc == columnDtl_sublot_exp_typ_nm) doDtl_sublot_exp_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_exp_typ) doDtl_sno1_exp_typ_NC(info);
		else if (nc == columnDtl_sno1_exp_typ_nm) doDtl_sno1_exp_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_exp_typ) doDtl_sno2_exp_typ_NC(info);
		else if (nc == columnDtl_sno2_exp_typ_nm) doDtl_sno2_exp_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_exp_typ) doDtl_sno3_exp_typ_NC(info);
		else if (nc == columnDtl_sno3_exp_typ_nm) doDtl_sno3_exp_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_exp_typ) doDtl_sno4_exp_typ_NC(info);
		else if (nc == columnDtl_sno4_exp_typ_nm) doDtl_sno4_exp_typ_nm_NC(info);
		else if (nc == columnDtl_dpt_loss_eval_typ) doDtl_dpt_loss_eval_typ_NC(info);
		else if (nc == columnDtl_dpt_loss_eval_typ_nm) doDtl_dpt_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_lot_loss_eval_typ) doDtl_lot_loss_eval_typ_NC(info);
		else if (nc == columnDtl_lot_loss_eval_typ_nm) doDtl_lot_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_loss_eval_typ) doDtl_sublot_loss_eval_typ_NC(info);
		else if (nc == columnDtl_sublot_loss_eval_typ_nm) doDtl_sublot_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_loss_eval_typ) doDtl_sno1_loss_eval_typ_NC(info);
		else if (nc == columnDtl_sno1_loss_eval_typ_nm) doDtl_sno1_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_loss_eval_typ) doDtl_sno2_loss_eval_typ_NC(info);
		else if (nc == columnDtl_sno2_loss_eval_typ_nm) doDtl_sno2_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_loss_eval_typ) doDtl_sno3_loss_eval_typ_NC(info);
		else if (nc == columnDtl_sno3_loss_eval_typ_nm) doDtl_sno3_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_loss_eval_typ) doDtl_sno4_loss_eval_typ_NC(info);
		else if (nc == columnDtl_sno4_loss_eval_typ_nm) doDtl_sno4_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_asst_loss_eval_typ) doDtl_asst_loss_eval_typ_NC(info);
		else if (nc == columnDtl_asst_loss_eval_typ_nm) doDtl_asst_loss_eval_typ_nm_NC(info);
		else if (nc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NC(info);
		else if (nc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_std_dec_place) doDtl_std_dec_place_NC(info);
		else if (nc == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NC(info);
		else if (nc == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_ave_dec_place) doDtl_ave_dec_place_NC(info);
		else if (nc == columnDtl_adj_typ) doDtl_adj_typ_NC(info);
		else if (nc == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NC(info);
		else if (nc == columnDtl_wip_typ) doDtl_wip_typ_NC(info);
		else if (nc == columnDtl_wip_typ_nm) doDtl_wip_typ_nm_NC(info);
		else if (nc == columnDtl_bd_agg_typ) doDtl_bd_agg_typ_NC(info);
		else if (nc == columnDtl_bd_agg_typ_nm) doDtl_bd_agg_typ_nm_NC(info);
		else if (nc == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NC(info);
		else if (nc == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NC(info);
		else if (nc == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NC(info);
		else if (nc == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NC(info);
		else if (nc == columnDtl_out_expns_cd) doDtl_out_expns_cd_NC(info);
		else if (nc == columnDtl_out_expns_nm) doDtl_out_expns_nm_NC(info);
		else if (nc == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NC(info);
		else if (nc == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NC(info);
		else if (nc == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NC(info);
		else if (nc == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NC(info);
		else if (nc == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NC(info);
		else if (nc == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NC(info);
		else if (nc == columnDtl_exp_alloc_typ) doDtl_exp_alloc_typ_NC(info);
		else if (nc == columnDtl_exp_alloc_typ_nm) doDtl_exp_alloc_typ_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
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
		else if (nc == columnLcl_calc_ptn_cd) doLcl_calc_ptn_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_calc_ptn_nm) doLcl_calc_ptn_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
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
	 * [Cnd]パネルの[calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_nm_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_nm_NC(MCEventInfo info){
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
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ptn_cd) doCnd_calc_ptn_cd_NE(info);
		else if (ne == Cnd_calc_ptn_nm) doCnd_calc_ptn_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NE(info);
		else if (ne == columnDtl_calc_ptn_nm_lcl) doDtl_calc_ptn_nm_lcl_NE(info);
		else if (ne == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NE(info);
		else if (ne == columnDtl_mfg_purc_typ) doDtl_mfg_purc_typ_NE(info);
		else if (ne == columnDtl_mfg_purc_typ_nm) doDtl_mfg_purc_typ_nm_NE(info);
		else if (ne == columnDtl_eval_typ) doDtl_eval_typ_NE(info);
		else if (ne == columnDtl_eval_typ_nm) doDtl_eval_typ_nm_NE(info);
		else if (ne == columnDtl_dpt_typ) doDtl_dpt_typ_NE(info);
		else if (ne == columnDtl_dpt_typ_nm) doDtl_dpt_typ_nm_NE(info);
		else if (ne == columnDtl_lot_typ) doDtl_lot_typ_NE(info);
		else if (ne == columnDtl_lot_typ_nm) doDtl_lot_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_typ) doDtl_sublot_typ_NE(info);
		else if (ne == columnDtl_sublot_typ_nm) doDtl_sublot_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_typ) doDtl_sno1_typ_NE(info);
		else if (ne == columnDtl_sno1_typ_nm) doDtl_sno1_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_typ) doDtl_sno2_typ_NE(info);
		else if (ne == columnDtl_sno2_typ_nm) doDtl_sno2_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_typ) doDtl_sno3_typ_NE(info);
		else if (ne == columnDtl_sno3_typ_nm) doDtl_sno3_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_typ) doDtl_sno4_typ_NE(info);
		else if (ne == columnDtl_sno4_typ_nm) doDtl_sno4_typ_nm_NE(info);
		else if (ne == columnDtl_lot_act_typ) doDtl_lot_act_typ_NE(info);
		else if (ne == columnDtl_lot_act_typ_nm) doDtl_lot_act_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_act_typ) doDtl_sublot_act_typ_NE(info);
		else if (ne == columnDtl_sublot_act_typ_nm) doDtl_sublot_act_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_act_typ) doDtl_sno1_act_typ_NE(info);
		else if (ne == columnDtl_sno1_act_typ_nm) doDtl_sno1_act_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_act_typ) doDtl_sno2_act_typ_NE(info);
		else if (ne == columnDtl_sno2_act_typ_nm) doDtl_sno2_act_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_act_typ) doDtl_sno3_act_typ_NE(info);
		else if (ne == columnDtl_sno3_act_typ_nm) doDtl_sno3_act_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_act_typ) doDtl_sno4_act_typ_NE(info);
		else if (ne == columnDtl_sno4_act_typ_nm) doDtl_sno4_act_typ_nm_NE(info);
		else if (ne == columnDtl_itm_mfg_inst_no_set_typ) doDtl_itm_mfg_inst_no_set_typ_NE(info);
		else if (ne == columnDtl_itm_mfg_inst_no_set_typ_nm) doDtl_itm_mfg_inst_no_set_typ_nm_NE(info);
		else if (ne == columnDtl_mfg_act_no_set_typ) doDtl_mfg_act_no_set_typ_NE(info);
		else if (ne == columnDtl_mfg_act_no_set_typ_nm) doDtl_mfg_act_no_set_typ_nm_NE(info);
		else if (ne == columnDtl_oper_act_no_set_typ) doDtl_oper_act_no_set_typ_NE(info);
		else if (ne == columnDtl_oper_act_no_set_typ_nm) doDtl_oper_act_no_set_typ_nm_NE(info);
		else if (ne == columnDtl_lot_exp_typ) doDtl_lot_exp_typ_NE(info);
		else if (ne == columnDtl_lot_exp_typ_nm) doDtl_lot_exp_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_exp_typ) doDtl_sublot_exp_typ_NE(info);
		else if (ne == columnDtl_sublot_exp_typ_nm) doDtl_sublot_exp_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_exp_typ) doDtl_sno1_exp_typ_NE(info);
		else if (ne == columnDtl_sno1_exp_typ_nm) doDtl_sno1_exp_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_exp_typ) doDtl_sno2_exp_typ_NE(info);
		else if (ne == columnDtl_sno2_exp_typ_nm) doDtl_sno2_exp_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_exp_typ) doDtl_sno3_exp_typ_NE(info);
		else if (ne == columnDtl_sno3_exp_typ_nm) doDtl_sno3_exp_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_exp_typ) doDtl_sno4_exp_typ_NE(info);
		else if (ne == columnDtl_sno4_exp_typ_nm) doDtl_sno4_exp_typ_nm_NE(info);
		else if (ne == columnDtl_dpt_loss_eval_typ) doDtl_dpt_loss_eval_typ_NE(info);
		else if (ne == columnDtl_dpt_loss_eval_typ_nm) doDtl_dpt_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_lot_loss_eval_typ) doDtl_lot_loss_eval_typ_NE(info);
		else if (ne == columnDtl_lot_loss_eval_typ_nm) doDtl_lot_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_loss_eval_typ) doDtl_sublot_loss_eval_typ_NE(info);
		else if (ne == columnDtl_sublot_loss_eval_typ_nm) doDtl_sublot_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_loss_eval_typ) doDtl_sno1_loss_eval_typ_NE(info);
		else if (ne == columnDtl_sno1_loss_eval_typ_nm) doDtl_sno1_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_loss_eval_typ) doDtl_sno2_loss_eval_typ_NE(info);
		else if (ne == columnDtl_sno2_loss_eval_typ_nm) doDtl_sno2_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_loss_eval_typ) doDtl_sno3_loss_eval_typ_NE(info);
		else if (ne == columnDtl_sno3_loss_eval_typ_nm) doDtl_sno3_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_loss_eval_typ) doDtl_sno4_loss_eval_typ_NE(info);
		else if (ne == columnDtl_sno4_loss_eval_typ_nm) doDtl_sno4_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_asst_loss_eval_typ) doDtl_asst_loss_eval_typ_NE(info);
		else if (ne == columnDtl_asst_loss_eval_typ_nm) doDtl_asst_loss_eval_typ_nm_NE(info);
		else if (ne == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NE(info);
		else if (ne == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_std_dec_place) doDtl_std_dec_place_NE(info);
		else if (ne == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NE(info);
		else if (ne == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_ave_dec_place) doDtl_ave_dec_place_NE(info);
		else if (ne == columnDtl_adj_typ) doDtl_adj_typ_NE(info);
		else if (ne == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NE(info);
		else if (ne == columnDtl_wip_typ) doDtl_wip_typ_NE(info);
		else if (ne == columnDtl_wip_typ_nm) doDtl_wip_typ_nm_NE(info);
		else if (ne == columnDtl_bd_agg_typ) doDtl_bd_agg_typ_NE(info);
		else if (ne == columnDtl_bd_agg_typ_nm) doDtl_bd_agg_typ_nm_NE(info);
		else if (ne == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NE(info);
		else if (ne == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NE(info);
		else if (ne == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NE(info);
		else if (ne == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NE(info);
		else if (ne == columnDtl_out_expns_cd) doDtl_out_expns_cd_NE(info);
		else if (ne == columnDtl_out_expns_nm) doDtl_out_expns_nm_NE(info);
		else if (ne == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NE(info);
		else if (ne == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NE(info);
		else if (ne == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NE(info);
		else if (ne == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NE(info);
		else if (ne == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NE(info);
		else if (ne == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NE(info);
		else if (ne == columnDtl_exp_alloc_typ) doDtl_exp_alloc_typ_NE(info);
		else if (ne == columnDtl_exp_alloc_typ_nm) doDtl_exp_alloc_typ_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
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
		else if (ne == columnLcl_calc_ptn_cd) doLcl_calc_ptn_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_calc_ptn_nm) doLcl_calc_ptn_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
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
	 * [Cnd]パネルの[calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_nm_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_nm_NE(MCEventInfo info){
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
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ptn_cd) doCnd_calc_ptn_cd_NX(info);
		else if (nx == Cnd_calc_ptn_nm) doCnd_calc_ptn_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NX(info);
		else if (nx == columnDtl_calc_ptn_nm_lcl) doDtl_calc_ptn_nm_lcl_NX(info);
		else if (nx == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NX(info);
		else if (nx == columnDtl_mfg_purc_typ) doDtl_mfg_purc_typ_NX(info);
		else if (nx == columnDtl_mfg_purc_typ_nm) doDtl_mfg_purc_typ_nm_NX(info);
		else if (nx == columnDtl_eval_typ) doDtl_eval_typ_NX(info);
		else if (nx == columnDtl_eval_typ_nm) doDtl_eval_typ_nm_NX(info);
		else if (nx == columnDtl_dpt_typ) doDtl_dpt_typ_NX(info);
		else if (nx == columnDtl_dpt_typ_nm) doDtl_dpt_typ_nm_NX(info);
		else if (nx == columnDtl_lot_typ) doDtl_lot_typ_NX(info);
		else if (nx == columnDtl_lot_typ_nm) doDtl_lot_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_typ) doDtl_sublot_typ_NX(info);
		else if (nx == columnDtl_sublot_typ_nm) doDtl_sublot_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_typ) doDtl_sno1_typ_NX(info);
		else if (nx == columnDtl_sno1_typ_nm) doDtl_sno1_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_typ) doDtl_sno2_typ_NX(info);
		else if (nx == columnDtl_sno2_typ_nm) doDtl_sno2_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_typ) doDtl_sno3_typ_NX(info);
		else if (nx == columnDtl_sno3_typ_nm) doDtl_sno3_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_typ) doDtl_sno4_typ_NX(info);
		else if (nx == columnDtl_sno4_typ_nm) doDtl_sno4_typ_nm_NX(info);
		else if (nx == columnDtl_lot_act_typ) doDtl_lot_act_typ_NX(info);
		else if (nx == columnDtl_lot_act_typ_nm) doDtl_lot_act_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_act_typ) doDtl_sublot_act_typ_NX(info);
		else if (nx == columnDtl_sublot_act_typ_nm) doDtl_sublot_act_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_act_typ) doDtl_sno1_act_typ_NX(info);
		else if (nx == columnDtl_sno1_act_typ_nm) doDtl_sno1_act_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_act_typ) doDtl_sno2_act_typ_NX(info);
		else if (nx == columnDtl_sno2_act_typ_nm) doDtl_sno2_act_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_act_typ) doDtl_sno3_act_typ_NX(info);
		else if (nx == columnDtl_sno3_act_typ_nm) doDtl_sno3_act_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_act_typ) doDtl_sno4_act_typ_NX(info);
		else if (nx == columnDtl_sno4_act_typ_nm) doDtl_sno4_act_typ_nm_NX(info);
		else if (nx == columnDtl_itm_mfg_inst_no_set_typ) doDtl_itm_mfg_inst_no_set_typ_NX(info);
		else if (nx == columnDtl_itm_mfg_inst_no_set_typ_nm) doDtl_itm_mfg_inst_no_set_typ_nm_NX(info);
		else if (nx == columnDtl_mfg_act_no_set_typ) doDtl_mfg_act_no_set_typ_NX(info);
		else if (nx == columnDtl_mfg_act_no_set_typ_nm) doDtl_mfg_act_no_set_typ_nm_NX(info);
		else if (nx == columnDtl_oper_act_no_set_typ) doDtl_oper_act_no_set_typ_NX(info);
		else if (nx == columnDtl_oper_act_no_set_typ_nm) doDtl_oper_act_no_set_typ_nm_NX(info);
		else if (nx == columnDtl_lot_exp_typ) doDtl_lot_exp_typ_NX(info);
		else if (nx == columnDtl_lot_exp_typ_nm) doDtl_lot_exp_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_exp_typ) doDtl_sublot_exp_typ_NX(info);
		else if (nx == columnDtl_sublot_exp_typ_nm) doDtl_sublot_exp_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_exp_typ) doDtl_sno1_exp_typ_NX(info);
		else if (nx == columnDtl_sno1_exp_typ_nm) doDtl_sno1_exp_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_exp_typ) doDtl_sno2_exp_typ_NX(info);
		else if (nx == columnDtl_sno2_exp_typ_nm) doDtl_sno2_exp_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_exp_typ) doDtl_sno3_exp_typ_NX(info);
		else if (nx == columnDtl_sno3_exp_typ_nm) doDtl_sno3_exp_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_exp_typ) doDtl_sno4_exp_typ_NX(info);
		else if (nx == columnDtl_sno4_exp_typ_nm) doDtl_sno4_exp_typ_nm_NX(info);
		else if (nx == columnDtl_dpt_loss_eval_typ) doDtl_dpt_loss_eval_typ_NX(info);
		else if (nx == columnDtl_dpt_loss_eval_typ_nm) doDtl_dpt_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_lot_loss_eval_typ) doDtl_lot_loss_eval_typ_NX(info);
		else if (nx == columnDtl_lot_loss_eval_typ_nm) doDtl_lot_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_loss_eval_typ) doDtl_sublot_loss_eval_typ_NX(info);
		else if (nx == columnDtl_sublot_loss_eval_typ_nm) doDtl_sublot_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_loss_eval_typ) doDtl_sno1_loss_eval_typ_NX(info);
		else if (nx == columnDtl_sno1_loss_eval_typ_nm) doDtl_sno1_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_loss_eval_typ) doDtl_sno2_loss_eval_typ_NX(info);
		else if (nx == columnDtl_sno2_loss_eval_typ_nm) doDtl_sno2_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_loss_eval_typ) doDtl_sno3_loss_eval_typ_NX(info);
		else if (nx == columnDtl_sno3_loss_eval_typ_nm) doDtl_sno3_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_loss_eval_typ) doDtl_sno4_loss_eval_typ_NX(info);
		else if (nx == columnDtl_sno4_loss_eval_typ_nm) doDtl_sno4_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_asst_loss_eval_typ) doDtl_asst_loss_eval_typ_NX(info);
		else if (nx == columnDtl_asst_loss_eval_typ_nm) doDtl_asst_loss_eval_typ_nm_NX(info);
		else if (nx == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_NX(info);
		else if (nx == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_std_dec_place) doDtl_std_dec_place_NX(info);
		else if (nx == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_NX(info);
		else if (nx == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_ave_dec_place) doDtl_ave_dec_place_NX(info);
		else if (nx == columnDtl_adj_typ) doDtl_adj_typ_NX(info);
		else if (nx == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_NX(info);
		else if (nx == columnDtl_wip_typ) doDtl_wip_typ_NX(info);
		else if (nx == columnDtl_wip_typ_nm) doDtl_wip_typ_nm_NX(info);
		else if (nx == columnDtl_bd_agg_typ) doDtl_bd_agg_typ_NX(info);
		else if (nx == columnDtl_bd_agg_typ_nm) doDtl_bd_agg_typ_nm_NX(info);
		else if (nx == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_NX(info);
		else if (nx == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_NX(info);
		else if (nx == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_NX(info);
		else if (nx == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_NX(info);
		else if (nx == columnDtl_out_expns_cd) doDtl_out_expns_cd_NX(info);
		else if (nx == columnDtl_out_expns_nm) doDtl_out_expns_nm_NX(info);
		else if (nx == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_NX(info);
		else if (nx == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_NX(info);
		else if (nx == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_NX(info);
		else if (nx == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_NX(info);
		else if (nx == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_NX(info);
		else if (nx == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_NX(info);
		else if (nx == columnDtl_exp_alloc_typ) doDtl_exp_alloc_typ_NX(info);
		else if (nx == columnDtl_exp_alloc_typ_nm) doDtl_exp_alloc_typ_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
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
		else if (nx == columnLcl_calc_ptn_cd) doLcl_calc_ptn_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_calc_ptn_nm) doLcl_calc_ptn_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
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
	 * [Cnd]パネルの[calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_nm_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_nm_NX(MCEventInfo info){
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
		else if (lc == Cnd_calc_ptn_cd) doCnd_calc_ptn_cd_LC(info);
		else if (lc == Cnd_calc_ptn_nm) doCnd_calc_ptn_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_LC(info);
		else if (lc == columnDtl_calc_ptn_nm_lcl) doDtl_calc_ptn_nm_lcl_LC(info);
		else if (lc == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_LC(info);
		else if (lc == columnDtl_mfg_purc_typ) doDtl_mfg_purc_typ_LC(info);
		else if (lc == columnDtl_mfg_purc_typ_nm) doDtl_mfg_purc_typ_nm_LC(info);
		else if (lc == columnDtl_eval_typ) doDtl_eval_typ_LC(info);
		else if (lc == columnDtl_eval_typ_nm) doDtl_eval_typ_nm_LC(info);
		else if (lc == columnDtl_dpt_typ) doDtl_dpt_typ_LC(info);
		else if (lc == columnDtl_dpt_typ_nm) doDtl_dpt_typ_nm_LC(info);
		else if (lc == columnDtl_lot_typ) doDtl_lot_typ_LC(info);
		else if (lc == columnDtl_lot_typ_nm) doDtl_lot_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_typ) doDtl_sublot_typ_LC(info);
		else if (lc == columnDtl_sublot_typ_nm) doDtl_sublot_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_typ) doDtl_sno1_typ_LC(info);
		else if (lc == columnDtl_sno1_typ_nm) doDtl_sno1_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_typ) doDtl_sno2_typ_LC(info);
		else if (lc == columnDtl_sno2_typ_nm) doDtl_sno2_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_typ) doDtl_sno3_typ_LC(info);
		else if (lc == columnDtl_sno3_typ_nm) doDtl_sno3_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_typ) doDtl_sno4_typ_LC(info);
		else if (lc == columnDtl_sno4_typ_nm) doDtl_sno4_typ_nm_LC(info);
		else if (lc == columnDtl_lot_act_typ) doDtl_lot_act_typ_LC(info);
		else if (lc == columnDtl_lot_act_typ_nm) doDtl_lot_act_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_act_typ) doDtl_sublot_act_typ_LC(info);
		else if (lc == columnDtl_sublot_act_typ_nm) doDtl_sublot_act_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_act_typ) doDtl_sno1_act_typ_LC(info);
		else if (lc == columnDtl_sno1_act_typ_nm) doDtl_sno1_act_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_act_typ) doDtl_sno2_act_typ_LC(info);
		else if (lc == columnDtl_sno2_act_typ_nm) doDtl_sno2_act_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_act_typ) doDtl_sno3_act_typ_LC(info);
		else if (lc == columnDtl_sno3_act_typ_nm) doDtl_sno3_act_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_act_typ) doDtl_sno4_act_typ_LC(info);
		else if (lc == columnDtl_sno4_act_typ_nm) doDtl_sno4_act_typ_nm_LC(info);
		else if (lc == columnDtl_itm_mfg_inst_no_set_typ) doDtl_itm_mfg_inst_no_set_typ_LC(info);
		else if (lc == columnDtl_itm_mfg_inst_no_set_typ_nm) doDtl_itm_mfg_inst_no_set_typ_nm_LC(info);
		else if (lc == columnDtl_mfg_act_no_set_typ) doDtl_mfg_act_no_set_typ_LC(info);
		else if (lc == columnDtl_mfg_act_no_set_typ_nm) doDtl_mfg_act_no_set_typ_nm_LC(info);
		else if (lc == columnDtl_oper_act_no_set_typ) doDtl_oper_act_no_set_typ_LC(info);
		else if (lc == columnDtl_oper_act_no_set_typ_nm) doDtl_oper_act_no_set_typ_nm_LC(info);
		else if (lc == columnDtl_lot_exp_typ) doDtl_lot_exp_typ_LC(info);
		else if (lc == columnDtl_lot_exp_typ_nm) doDtl_lot_exp_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_exp_typ) doDtl_sublot_exp_typ_LC(info);
		else if (lc == columnDtl_sublot_exp_typ_nm) doDtl_sublot_exp_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_exp_typ) doDtl_sno1_exp_typ_LC(info);
		else if (lc == columnDtl_sno1_exp_typ_nm) doDtl_sno1_exp_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_exp_typ) doDtl_sno2_exp_typ_LC(info);
		else if (lc == columnDtl_sno2_exp_typ_nm) doDtl_sno2_exp_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_exp_typ) doDtl_sno3_exp_typ_LC(info);
		else if (lc == columnDtl_sno3_exp_typ_nm) doDtl_sno3_exp_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_exp_typ) doDtl_sno4_exp_typ_LC(info);
		else if (lc == columnDtl_sno4_exp_typ_nm) doDtl_sno4_exp_typ_nm_LC(info);
		else if (lc == columnDtl_dpt_loss_eval_typ) doDtl_dpt_loss_eval_typ_LC(info);
		else if (lc == columnDtl_dpt_loss_eval_typ_nm) doDtl_dpt_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_lot_loss_eval_typ) doDtl_lot_loss_eval_typ_LC(info);
		else if (lc == columnDtl_lot_loss_eval_typ_nm) doDtl_lot_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_loss_eval_typ) doDtl_sublot_loss_eval_typ_LC(info);
		else if (lc == columnDtl_sublot_loss_eval_typ_nm) doDtl_sublot_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_loss_eval_typ) doDtl_sno1_loss_eval_typ_LC(info);
		else if (lc == columnDtl_sno1_loss_eval_typ_nm) doDtl_sno1_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_loss_eval_typ) doDtl_sno2_loss_eval_typ_LC(info);
		else if (lc == columnDtl_sno2_loss_eval_typ_nm) doDtl_sno2_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_loss_eval_typ) doDtl_sno3_loss_eval_typ_LC(info);
		else if (lc == columnDtl_sno3_loss_eval_typ_nm) doDtl_sno3_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_loss_eval_typ) doDtl_sno4_loss_eval_typ_LC(info);
		else if (lc == columnDtl_sno4_loss_eval_typ_nm) doDtl_sno4_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_asst_loss_eval_typ) doDtl_asst_loss_eval_typ_LC(info);
		else if (lc == columnDtl_asst_loss_eval_typ_nm) doDtl_asst_loss_eval_typ_nm_LC(info);
		else if (lc == columnDtl_std_rnd_typ) doDtl_std_rnd_typ_LC(info);
		else if (lc == columnDtl_std_rnd_typ_nm) doDtl_std_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_std_dec_place) doDtl_std_dec_place_LC(info);
		else if (lc == columnDtl_ave_rnd_typ) doDtl_ave_rnd_typ_LC(info);
		else if (lc == columnDtl_ave_rnd_typ_nm) doDtl_ave_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_ave_dec_place) doDtl_ave_dec_place_LC(info);
		else if (lc == columnDtl_adj_typ) doDtl_adj_typ_LC(info);
		else if (lc == columnDtl_adj_typ_nm) doDtl_adj_typ_nm_LC(info);
		else if (lc == columnDtl_wip_typ) doDtl_wip_typ_LC(info);
		else if (lc == columnDtl_wip_typ_nm) doDtl_wip_typ_nm_LC(info);
		else if (lc == columnDtl_bd_agg_typ) doDtl_bd_agg_typ_LC(info);
		else if (lc == columnDtl_bd_agg_typ_nm) doDtl_bd_agg_typ_nm_LC(info);
		else if (lc == columnDtl_mrgn_expns_cd) doDtl_mrgn_expns_cd_LC(info);
		else if (lc == columnDtl_mrgn_expns_nm) doDtl_mrgn_expns_nm_LC(info);
		else if (lc == columnDtl_purc_expns_cd) doDtl_purc_expns_cd_LC(info);
		else if (lc == columnDtl_purc_expns_nm) doDtl_purc_expns_nm_LC(info);
		else if (lc == columnDtl_out_expns_cd) doDtl_out_expns_cd_LC(info);
		else if (lc == columnDtl_out_expns_nm) doDtl_out_expns_nm_LC(info);
		else if (lc == columnDtl_inpt_expns_cd) doDtl_inpt_expns_cd_LC(info);
		else if (lc == columnDtl_inpt_expns_nm) doDtl_inpt_expns_nm_LC(info);
		else if (lc == columnDtl_ss_expns_cd) doDtl_ss_expns_cd_LC(info);
		else if (lc == columnDtl_ss_expns_nm) doDtl_ss_expns_nm_LC(info);
		else if (lc == columnDtl_prov_expns_cd) doDtl_prov_expns_cd_LC(info);
		else if (lc == columnDtl_prov_expns_nm) doDtl_prov_expns_nm_LC(info);
		else if (lc == columnDtl_exp_alloc_typ) doDtl_exp_alloc_typ_LC(info);
		else if (lc == columnDtl_exp_alloc_typ_nm) doDtl_exp_alloc_typ_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
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
		else if (lc == columnLcl_calc_ptn_cd) doLcl_calc_ptn_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_calc_ptn_nm) doLcl_calc_ptn_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
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
	 * [Cnd]パネルの[calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ptn_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_act_no_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_act_no_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_act_no_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_act_no_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_exp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_exp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_loss_eval_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_loss_eval_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ave_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ave_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[adj_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_adj_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_agg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_agg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrgn_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrgn_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[out_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_out_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ss_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ss_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exp_alloc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exp_alloc_typ_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_calc_ptn_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_calc_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_purc_typ]の作成メソッド
	 */
	public MCList getDtl_mfg_purc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgPurcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_eval_typ]の作成メソッド
	 */
	public MCList getDtl_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_typ]の作成メソッド
	 */
	public MCList getDtl_dpt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_typ]の作成メソッド
	 */
	public MCList getDtl_lot_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnitCalcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_act_typ]の作成メソッド
	 */
	public MCList getDtl_lot_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_act_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_act_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_act_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_act_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_act_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_act_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getActSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_mfg_inst_no_set_typ]の作成メソッド
	 */
	public MCList getDtl_itm_mfg_inst_no_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmMfgInstNoSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_act_no_set_typ]の作成メソッド
	 */
	public MCList getDtl_mfg_act_no_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgActNoSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_act_no_set_typ]の作成メソッド
	 */
	public MCList getDtl_oper_act_no_set_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOperActNoSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_exp_typ]の作成メソッド
	 */
	public MCList getDtl_lot_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_exp_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_exp_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_exp_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_exp_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_exp_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_exp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_dpt_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_lot_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asst_loss_eval_typ]の作成メソッド
	 */
	public MCList getDtl_asst_loss_eval_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLossEvalTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_std_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_std_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ave_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_ave_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_adj_typ]の作成メソッド
	 */
	public MCList getDtl_adj_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAdjTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wip_typ]の作成メソッド
	 */
	public MCList getDtl_wip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_agg_typ]の作成メソッド
	 */
	public MCList getDtl_bd_agg_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBdAggTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mrgn_expns_cd]の作成メソッド
	 */
	public MCList getDtl_mrgn_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_expns_cd]の作成メソッド
	 */
	public MCList getDtl_purc_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_out_expns_cd]の作成メソッド
	 */
	public MCList getDtl_out_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_expns_cd]の作成メソッド
	 */
	public MCList getDtl_inpt_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ss_expns_cd]の作成メソッド
	 */
	public MCList getDtl_ss_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prov_expns_cd]の作成メソッド
	 */
	public MCList getDtl_prov_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_exp_alloc_typ]の作成メソッド
	 */
	public MCList getDtl_exp_alloc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpAllocTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0100.Srch01")) {
			return new MA_MABGL0100_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0100.Upd01")) {
			return new MA_MABGL0100_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0100.Del01")) {
			return new MA_MABGL0100_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0100_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0100_Srch01Bridge() {
			p_MA_MABGL0100_Srch01 = new MCParam(PDef.MA_MABGL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0100.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0100.LclR.class));

			p_MA_MABGL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0100.CndR up0() {
			return (mcframe.clientMABG.MABGP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0100.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0100.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0100.LclR> down1() {
			return (MCList<mcframe.clientMABG.MABGP0100.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABGL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0100.DtlR.class));
			p_MA_MABGL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0100.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0100_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0100.DtlR>)p_MA_MABGL0100_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABG.MABGP0100.LclR>)p_MA_MABGL0100_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABGL0100_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0100_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0100_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0100_Upd01Bridge() {
			p_MA_MABGL0100_Upd01 = new MCParam(PDef.MA_MABGL0100_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0100_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0100.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0100.LclR.class));
			// Down

			p_MA_MABGL0100_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0100_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0100_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABGL0100_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0100_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0100_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0100.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0100.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0100.LclR> up1() {
			return (MCList<mcframe.clientMABG.MABGP0100.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0100_Upd01;
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
	 * [MA_MABGL0100_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0100_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0100_Del01;

		/** コンストラクタ */
		protected MA_MABGL0100_Del01Bridge() {
			p_MA_MABGL0100_Del01 = new MCParam(PDef.MA_MABGL0100_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0100_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0100.DtlR.class));
			// Down

			p_MA_MABGL0100_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0100_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0100_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0100_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0100_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0100.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0100.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0100_Del01;
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