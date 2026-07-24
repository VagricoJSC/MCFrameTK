package mcframe.clientMSBE.MSBEP1750;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Srch01Caller;
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Srch02Caller;
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Srch03Caller;
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Upd01Caller;
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Del01Caller;
import mcframe.clientMSBE.MSBEP1750.MSBEP_PlReg_MC.MS_MSBEL1750_Prnt01Caller;

/**
 * 画面"MSBEP_PlReg"パネルクラスです。<p>
 *
 * インボイスの梱包明細・重量を登録し、パッキングリストを発行します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_PlReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP1750";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;SRCH,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;SRCH,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_SRCH = null;
	public MCLabel Cnd_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_iv_no = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	/**
	 * Not to complete 完了対象外.<p>
	 *
	 */
	public MCCheckBox Hdr_non_cmpl_flg = null;
	/**
	 * Completed 完了済.<p>
	 *
	 */
	public MCCheckBox Hdr_cmpl_flg = null;
	/**
	 * Packing list immediate issue パッキングリスト即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_pl_immed_prnt_flg = null;
	/**
	 * Packing list issued パッキングリスト発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_pl_prnt_flg = null;
	public MCLabel Hdr_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_typ_nm = null;
	public MCLabel Hdr_dlv_id_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_nm = null;
	public MCLabel Hdr_dlv_cntry_cd_Label = null;
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_cntry_cd = null;
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_cntry_nm = null;
	public MCLabel Hdr_ship_rqst_id_typ_Label = null;
	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_typ = null;
	/**
	 * Shipping requested identification type name 出荷依頼先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_typ_nm = null;
	public MCLabel Hdr_ship_rqst_id_cd_Label = null;
	/**
	 * Shipping requested cd. 出荷依頼先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_cd = null;
	/**
	 * Shipping requested dept. name 出荷依頼先名.<p>
	 *
	 */
	public MCTextField Hdr_ship_rqst_id_nm = null;
	public MCLabel Hdr_tdlv_cd_Label = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCTextField Hdr_tdlv_nm = null;
	public MCLabel Hdr_trnspt_cd_Label = null;
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_trnspt_cd = null;
	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public MCTextField Hdr_trnspt_nm = null;
	public MCLabel Hdr_pl_rmrks_Label = null;
	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public MCTextField Hdr_pl_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	public MCLabel Hdr_ttl_net_wt_Label = null;
	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public MCNumberField Hdr_ttl_net_wt = null;
	public MCLabel Hdr_ttl_grss_wt_Label = null;
	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public MCNumberField Hdr_ttl_grss_wt = null;
	public MCLabel Hdr_ttl_dim_Label = null;
	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public MCNumberField Hdr_ttl_dim = null;
	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public MCTextField Hdr_iv_src_typ = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Hdr3]ブロック関連のField定義
	public MCPanel Hdr3Panel = null;
	// [Hdr3]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1750.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Similarity condition group No. 相似条件グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sim_cnd_grp_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_org_cd = null;
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntry_org_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	/**
	 * Packing container cd. 梱包容器ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntnr_cd = null;
	/**
	 * Packing container name 梱包容器名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntnr_nm = null;
	/**
	 * Container No. FR 梱包番号ＦＲ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntnr_no_fr = null;
	/**
	 * Container No. TO 梱包番号ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cntnr_no_to = null;
	/**
	 * Net weight 純重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_net_wt = null;
	/**
	 * Gross weight 総重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_grss_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dim = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_sum_qty_p_PPanel;
	public MCColumnConfig columnDtl_sum_qty;// [Dtl]の[sum_qty_p.qty]を[columnDtl_sum_qty]としてエイリアス定義。
	/**
	 * Packing list details remarks パッキングリスト明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pl_d_rmrks = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Packing list パッキングリスト.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
	/**
	 * Acquire weight/volume 重量・容積取得.<p>
	 *
	 */
	public MCButton Btn_get_wt_dim = null;
	/**
	 * Aggregate rows 行まとめ.<p>
	 *
	 */
	public MCButton Btn_merge = null;
	/**
	 * Row split 行分割.<p>
	 *
	 */
	public MCButton Btn_divide = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_move_p_PPanel;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Select same group No. in bulk 同一グループＮＯをまとめて選択.<p>
	 *
	 */
	public MCCheckBox Btn_chk_by_grp_no_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, FIX_I, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBEL1750_Srch01]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Srch01Caller createMS_MSBEL1750_Srch01() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Srch01Caller<MSBEP_PlReg, MS_MSBEL1750_Srch01Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Srch01Caller<MSBEP_PlReg, MS_MSBEL1750_Srch01Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Srch01]の呼び出し */
	protected void callMS_MSBEL1750_Srch01() {
		MCCaller caller = createMS_MSBEL1750_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1750_Srch02]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Srch02Caller createMS_MSBEL1750_Srch02() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Srch02Caller<MSBEP_PlReg, MS_MSBEL1750_Srch02Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Srch02Caller<MSBEP_PlReg, MS_MSBEL1750_Srch02Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Srch02]の呼び出し */
	protected void callMS_MSBEL1750_Srch02() {
		MCCaller caller = createMS_MSBEL1750_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1750_Srch03]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Srch03Caller createMS_MSBEL1750_Srch03() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Srch03Caller<MSBEP_PlReg, MS_MSBEL1750_Srch03Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Srch03Caller<MSBEP_PlReg, MS_MSBEL1750_Srch03Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Srch03]の呼び出し */
	protected void callMS_MSBEL1750_Srch03() {
		MCCaller caller = createMS_MSBEL1750_Srch03();
		caller.exec();
	}
	/** [MS_MSBEL1750_Upd01]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Upd01Caller createMS_MSBEL1750_Upd01() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Upd01Caller<MSBEP_PlReg, MS_MSBEL1750_Upd01Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Upd01Caller<MSBEP_PlReg, MS_MSBEL1750_Upd01Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Upd01]の呼び出し */
	protected void callMS_MSBEL1750_Upd01() {
		MCCaller caller = createMS_MSBEL1750_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1750_Del01]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Del01Caller createMS_MSBEL1750_Del01() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Del01Caller<MSBEP_PlReg, MS_MSBEL1750_Del01Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Del01Caller<MSBEP_PlReg, MS_MSBEL1750_Del01Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Del01]の呼び出し */
	protected void callMS_MSBEL1750_Del01() {
		MCCaller caller = createMS_MSBEL1750_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1750_Prnt01]のCallerの作成 */
	protected MSBEP_PlReg_MC.MS_MSBEL1750_Prnt01Caller createMS_MSBEL1750_Prnt01() {
		MSBEP_PlReg_MC.MS_MSBEL1750_Prnt01Caller<MSBEP_PlReg, MS_MSBEL1750_Prnt01Bridge>
		caller = ((MSBEP_PlReg_MC)this).new MS_MSBEL1750_Prnt01Caller<MSBEP_PlReg, MS_MSBEL1750_Prnt01Bridge>(
					(MSBEP_PlReg)this, new MS_MSBEL1750_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1750_Prnt01]の呼び出し */
	protected void callMS_MSBEL1750_Prnt01() {
		MCCaller caller = createMS_MSBEL1750_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1750.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1750.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1750.DtlR> aDtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1750.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1750.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1750.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1750.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1750.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1750.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1750.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1750.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1750.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1750.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1750.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1750.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1750.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1750.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBE.MSBEP1750.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1750.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1750.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1750.BtnR.create();
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
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(Hdr3Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_PlReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_PlReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_PlReg_MC.jbCreateScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateCnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateHdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateHdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateHdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateHdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateDtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateBtn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbCreateEastBtn((MSBEP_PlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_PlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_PlReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_PlReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_PlReg p) {
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_PlReg p) {
	}

	/**
	 * [Hdr3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr3(MSBEP_PlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_PlReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1750.DtlR.$itm_p);
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
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1750.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1750.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_sum_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1750.DtlR.$sum_qty_p);
		p.Dtl_sum_qty_p_PPanel.setName("Dtl.sum_qty_p");
		p.columnDtl_sum_qty = p.Dtl_sum_qty_p_PPanel.columnQty_qty;
		p.columnDtl_sum_qty.addAliasName("Dtl.sum_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_PlReg p) {
		p.Btn_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_move_p_PPanel.setName("Btn.move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_PlReg p) {
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

	
	/** [Dtl_cntnr_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cntnr_cd_p = null;

	/**
	 * [Dtl_cntnr_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cntnr_cd_ListPutter() {
		if (Dtl_cntnr_cd_p == null) {
			Dtl_cntnr_cd_p = createDtl_cntnr_cd_ListPutter(columnDtl_cntnr_cd, "cntnr_cd", "cntnr_nm");

		}
		return Dtl_cntnr_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_PlReg create(){
		MSBEP_PlReg p = new MSBEP_PlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_PlReg create(String name){
		MSBEP_PlReg p = new MSBEP_PlReg(name);
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
		MSBEP_PlReg_MC.jbfInitScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitCnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitHdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitHdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitHdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitHdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitDtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitBtn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbfInitEastBtn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitCnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitHdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitHdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitHdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitHdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitDtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitBtn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.jbInitEastBtn((MSBEP_PlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_SRCH = p.beansFactory.createRadioButton("Cnd.ope_SRCH");
		p.Cnd_iv_no_Label = p.beansFactory.createLabel("Cnd.iv_no_Label");
		p.Cnd_iv_no = p.beansFactory.createTextField("Cnd.iv_no");
		p.Cnd_iv_no.setLabel(p.Cnd_iv_no_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_non_cmpl_flg = p.beansFactory.createCheckBox("Hdr.non_cmpl_flg");
		p.Hdr_cmpl_flg = p.beansFactory.createCheckBox("Hdr.cmpl_flg");
		p.Hdr_pl_immed_prnt_flg = p.beansFactory.createCheckBox("Hdr.pl_immed_prnt_flg");
		p.Hdr_pl_prnt_flg = p.beansFactory.createCheckBox("Hdr.pl_prnt_flg");
		p.Hdr_dlv_id_typ_Label = p.beansFactory.createLabel("Hdr.dlv_id_typ_Label");
		p.Hdr_dlv_id_typ = p.beansFactory.createTextField("Hdr.dlv_id_typ");
		p.Hdr_dlv_id_typ.setLabel(p.Hdr_dlv_id_typ_Label);
		p.Hdr_dlv_id_typ_nm = p.beansFactory.createTextField("Hdr.dlv_id_typ_nm");
		p.Hdr_dlv_id_cd_Label = p.beansFactory.createLabel("Hdr.dlv_id_cd_Label");
		p.Hdr_dlv_id_cd = p.beansFactory.createTextField("Hdr.dlv_id_cd");
		p.Hdr_dlv_id_cd.setLabel(p.Hdr_dlv_id_cd_Label);
		p.Hdr_dlv_id_nm = p.beansFactory.createTextField("Hdr.dlv_id_nm");
		p.Hdr_dlv_cntry_cd_Label = p.beansFactory.createLabel("Hdr.dlv_cntry_cd_Label");
		p.Hdr_dlv_cntry_cd = p.beansFactory.createTextField("Hdr.dlv_cntry_cd");
		p.Hdr_dlv_cntry_cd.setLabel(p.Hdr_dlv_cntry_cd_Label);
		p.Hdr_dlv_cntry_nm = p.beansFactory.createTextField("Hdr.dlv_cntry_nm");
		p.Hdr_ship_rqst_id_typ_Label = p.beansFactory.createLabel("Hdr.ship_rqst_id_typ_Label");
		p.Hdr_ship_rqst_id_typ = p.beansFactory.createTextField("Hdr.ship_rqst_id_typ");
		p.Hdr_ship_rqst_id_typ.setLabel(p.Hdr_ship_rqst_id_typ_Label);
		p.Hdr_ship_rqst_id_typ_nm = p.beansFactory.createTextField("Hdr.ship_rqst_id_typ_nm");
		p.Hdr_ship_rqst_id_cd_Label = p.beansFactory.createLabel("Hdr.ship_rqst_id_cd_Label");
		p.Hdr_ship_rqst_id_cd = p.beansFactory.createTextField("Hdr.ship_rqst_id_cd");
		p.Hdr_ship_rqst_id_cd.setLabel(p.Hdr_ship_rqst_id_cd_Label);
		p.Hdr_ship_rqst_id_nm = p.beansFactory.createTextField("Hdr.ship_rqst_id_nm");
		p.Hdr_tdlv_cd_Label = p.beansFactory.createLabel("Hdr.tdlv_cd_Label");
		p.Hdr_tdlv_cd = p.beansFactory.createTextField("Hdr.tdlv_cd");
		p.Hdr_tdlv_cd.setLabel(p.Hdr_tdlv_cd_Label);
		p.Hdr_tdlv_nm = p.beansFactory.createTextField("Hdr.tdlv_nm");
		p.Hdr_trnspt_cd_Label = p.beansFactory.createLabel("Hdr.trnspt_cd_Label");
		p.Hdr_trnspt_cd = p.beansFactory.createTextField("Hdr.trnspt_cd");
		p.Hdr_trnspt_cd.setLabel(p.Hdr_trnspt_cd_Label);
		p.Hdr_trnspt_nm = p.beansFactory.createTextField("Hdr.trnspt_nm");
		p.Hdr_pl_rmrks_Label = p.beansFactory.createLabel("Hdr.pl_rmrks_Label");
		p.Hdr_pl_rmrks = p.beansFactory.createTextField("Hdr.pl_rmrks");
		p.Hdr_pl_rmrks.setLabel(p.Hdr_pl_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_ttl_net_wt_Label = p.beansFactory.createLabel("Hdr.ttl_net_wt_Label");
		p.Hdr_ttl_net_wt = p.beansFactory.createNumberField("Hdr.ttl_net_wt");
		p.Hdr_ttl_net_wt.setLabel(p.Hdr_ttl_net_wt_Label);
		p.Hdr_ttl_grss_wt_Label = p.beansFactory.createLabel("Hdr.ttl_grss_wt_Label");
		p.Hdr_ttl_grss_wt = p.beansFactory.createNumberField("Hdr.ttl_grss_wt");
		p.Hdr_ttl_grss_wt.setLabel(p.Hdr_ttl_grss_wt_Label);
		p.Hdr_ttl_dim_Label = p.beansFactory.createLabel("Hdr.ttl_dim_Label");
		p.Hdr_ttl_dim = p.beansFactory.createNumberField("Hdr.ttl_dim");
		p.Hdr_ttl_dim.setLabel(p.Hdr_ttl_dim_Label);
		p.Hdr_iv_src_typ = p.beansFactory.createTextField("Hdr.iv_src_typ");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr3(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.Hdr3Panel = p.beansFactory.createPanel("Hdr3");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_sim_cnd_grp_no = p.beansFactory.createTableColumn("Dtl.sim_cnd_grp_no", MCColumnType.NUMBER);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_cntry_org_cd = p.beansFactory.createTableColumn("Dtl.cntry_org_cd", MCColumnType.TEXT);
		p.columnDtl_cntry_org_nm = p.beansFactory.createTableColumn("Dtl.cntry_org_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_cntnr_cd = p.beansFactory.createTableColumn("Dtl.cntnr_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntnr_nm = p.beansFactory.createTableColumn("Dtl.cntnr_nm", MCColumnType.TEXT);
		p.columnDtl_cntnr_no_fr = p.beansFactory.createTableColumn("Dtl.cntnr_no_fr", MCColumnType.NUMBER);
		p.columnDtl_cntnr_no_to = p.beansFactory.createTableColumn("Dtl.cntnr_no_to", MCColumnType.NUMBER);
		p.columnDtl_net_wt = p.beansFactory.createTableColumn("Dtl.net_wt", MCColumnType.NUMBER);
		p.columnDtl_grss_wt = p.beansFactory.createTableColumn("Dtl.grss_wt", MCColumnType.NUMBER);
		p.columnDtl_dim = p.beansFactory.createTableColumn("Dtl.dim", MCColumnType.NUMBER);
		p.columnDtl_pl_d_rmrks = p.beansFactory.createTableColumn("Dtl.pl_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_cst_po_no = p.beansFactory.createTableColumn("Dtl.cst_po_no", MCColumnType.TEXT);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_get_wt_dim = p.beansFactory.createButton("Btn.get_wt_dim");
		p.Btn_merge = p.beansFactory.createButton("Btn.merge");
		p.Btn_divide = p.beansFactory.createButton("Btn.divide");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_chk_by_grp_no_flg = p.beansFactory.createCheckBox("Btn.chk_by_grp_no_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_SRCH);
		p.Cnd_ope_SRCH.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_SRCH);
		p.ScreenOpePanel.add(p.Cnd_ope_SRCH);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1750.CndR.ope_META);
		p.CndPanel.add(p.Cnd_iv_no_Label);
		p.CndPanel.add(p.Cnd_iv_no);
		p.CndPanel.setLastBeans(p.Cnd_iv_no);
		p.Cnd_iv_no.setNextBeans(p.Cnd_srch);
		p.Cnd_iv_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1750.CndR.iv_no_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.Hdr3Panel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.HdrPanel.setLastBeans(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_non_cmpl_flg);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_non_cmpl_flg);
		p.Hdr_non_cmpl_flg.setNextBeans(p.Hdr_cmpl_flg);
		p.Hdr_non_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.non_cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_cmpl_flg);
		p.Hdr_cmpl_flg.setNextBeans(p.Hdr_pl_immed_prnt_flg);
		p.Hdr_cmpl_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.cmpl_flg_META);
		p.HdrPanel.add(p.Hdr_pl_immed_prnt_flg);
		p.Hdr_pl_immed_prnt_flg.setNextBeans(p.Hdr_pl_prnt_flg);
		p.Hdr_pl_immed_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.pl_immed_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_pl_prnt_flg);
		p.Hdr_pl_prnt_flg.setNextBeans(p.Hdr_dlv_id_typ);
		p.Hdr_pl_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.pl_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_Label);
		p.HdrPanel.add(p.Hdr_dlv_id_typ);
		p.Hdr_dlv_id_typ.setNextBeans(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_id_typ_META);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ_nm.setNextBeans(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_id_cd_Label);
		p.HdrPanel.add(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_cd.setNextBeans(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_id_cd_META);
		p.HdrPanel.add(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_nm.setNextBeans(p.Hdr_dlv_cntry_cd);
		p.Hdr_dlv_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_id_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_cntry_cd_Label);
		p.HdrPanel.add(p.Hdr_dlv_cntry_cd);
		p.Hdr_dlv_cntry_cd.setNextBeans(p.Hdr_dlv_cntry_nm);
		p.Hdr_dlv_cntry_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_cntry_cd_META);
		p.HdrPanel.add(p.Hdr_dlv_cntry_nm);
		p.Hdr_dlv_cntry_nm.setNextBeans(p.Hdr_ship_rqst_id_typ);
		p.Hdr_dlv_cntry_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.dlv_cntry_nm_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ_Label);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ);
		p.Hdr_ship_rqst_id_typ.setNextBeans(p.Hdr_ship_rqst_id_typ_nm);
		p.Hdr_ship_rqst_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ship_rqst_id_typ_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_typ_nm);
		p.Hdr_ship_rqst_id_typ_nm.setNextBeans(p.Hdr_ship_rqst_id_cd);
		p.Hdr_ship_rqst_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ship_rqst_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_cd);
		p.Hdr_ship_rqst_id_cd.setNextBeans(p.Hdr_ship_rqst_id_nm);
		p.Hdr_ship_rqst_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ship_rqst_id_cd_META);
		p.HdrPanel.add(p.Hdr_ship_rqst_id_nm);
		p.Hdr_ship_rqst_id_nm.setNextBeans(p.Hdr_tdlv_cd);
		p.Hdr_ship_rqst_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ship_rqst_id_nm_META);
		p.HdrPanel.add(p.Hdr_tdlv_cd_Label);
		p.HdrPanel.add(p.Hdr_tdlv_cd);
		p.Hdr_tdlv_cd.setNextBeans(p.Hdr_tdlv_nm);
		p.Hdr_tdlv_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.tdlv_cd_META);
		p.HdrPanel.add(p.Hdr_tdlv_nm);
		p.Hdr_tdlv_nm.setNextBeans(p.Hdr_trnspt_cd);
		p.Hdr_tdlv_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.tdlv_nm_META);
		p.HdrPanel.add(p.Hdr_trnspt_cd_Label);
		p.HdrPanel.add(p.Hdr_trnspt_cd);
		p.Hdr_trnspt_cd.setNextBeans(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.trnspt_cd_META);
		p.HdrPanel.add(p.Hdr_trnspt_nm);
		p.Hdr_trnspt_nm.setNextBeans(p.Hdr_pl_rmrks);
		p.Hdr_trnspt_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.trnspt_nm_META);
		p.HdrPanel.add(p.Hdr_pl_rmrks_Label);
		p.HdrPanel.add(p.Hdr_pl_rmrks);
		p.Hdr_pl_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_pl_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.pl_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_iv_src_typ);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_srv_req_no_META);
		p.Hdr2Panel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.upd_cntr_META);
		p.Hdr3Panel.add(p.Hdr_ttl_net_wt_Label);
		p.Hdr3Panel.add(p.Hdr_ttl_net_wt);
		p.Hdr3Panel.setLastBeans(p.Hdr_ttl_net_wt);
		p.Hdr_ttl_net_wt.setNextBeans(p.Hdr_ttl_grss_wt);
		p.Hdr_ttl_net_wt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ttl_net_wt_META);
		p.Hdr3Panel.add(p.Hdr_ttl_grss_wt_Label);
		p.Hdr3Panel.add(p.Hdr_ttl_grss_wt);
		p.Hdr_ttl_grss_wt.setNextBeans(p.Hdr_ttl_dim);
		p.Hdr_ttl_grss_wt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ttl_grss_wt_META);
		p.Hdr3Panel.add(p.Hdr_ttl_dim_Label);
		p.Hdr3Panel.add(p.Hdr_ttl_dim);
		p.Hdr_ttl_dim.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.ttl_dim_META);
		p.HdrPanel.add(p.Hdr_iv_src_typ);
		p.Hdr_iv_src_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1750.HdrR.iv_src_typ_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_PlReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr3(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.add(p.Hdr3Panel);
		p.Hdr3Panel.setNextBeans(p.DtlPanel);
		p.Hdr3Panel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_PlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_prnt);
		p.BtnPanel.setLastBeans(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_get_wt_dim);
		p.Btn_get_wt_dim.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_get_wt_dim);
		p.Btn_get_wt_dim.setNextBeans(p.Btn_merge);
		p.Btn_merge.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_merge);
		p.Btn_merge.setNextBeans(p.Btn_divide);
		p.Btn_divide.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_divide);
		p.Btn_divide.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_move_p_PPanel);
		p.BtnPanel.add(p.Btn_move_p_PPanel);
		p.Btn_move_p_PPanel.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_chk_by_grp_no_flg);
		p.BtnPanel.add(p.Btn_chk_by_grp_no_flg);
		p.Btn_chk_by_grp_no_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1750.BtnR.chk_by_grp_no_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_PlReg p) {
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBEP_PlReg_MC.mcInitScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitCnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitHdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitHdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitHdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitHdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitDtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitBtn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.mcInitEastBtn((MSBEP_PlReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitSRCH_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitSRCH_EastBtn((MSBEP_PlReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitINS_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitINS_EastBtn((MSBEP_PlReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__I_EastBtn((MSBEP_PlReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitUPD_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitUPD_EastBtn((MSBEP_PlReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__U_EastBtn((MSBEP_PlReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitDEL_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitDEL_EastBtn((MSBEP_PlReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitFIX__D_EastBtn((MSBEP_PlReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_PlReg_MC.statusInitREF_ScreenOpe((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Cnd((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_HdrTab((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Hdr((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Hdr2((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Hdr3((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Dtl((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_Btn((MSBEP_PlReg)this);
		MSBEP_PlReg_MC.statusInitREF_EastBtn((MSBEP_PlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_PlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_PlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_SRCH.addAllListener(p);
		p.Cnd_iv_no.setListListener(p);
		p.Cnd_iv_no.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_PlReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_PlReg p) {
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_non_cmpl_flg.addAllListener(p);
		p.Hdr_cmpl_flg.addAllListener(p);
		p.Hdr_pl_immed_prnt_flg.addAllListener(p);
		p.Hdr_pl_prnt_flg.addAllListener(p);
		p.Hdr_dlv_id_typ.setListListener(p);
		p.Hdr_dlv_id_typ.addAllListener(p);
		p.Hdr_dlv_id_typ_nm.setListListener(p);
		p.Hdr_dlv_id_typ_nm.addAllListener(p);
		p.Hdr_dlv_id_cd.setListListener(p);
		p.Hdr_dlv_id_cd.addAllListener(p);
		p.Hdr_dlv_id_nm.setListListener(p);
		p.Hdr_dlv_id_nm.addAllListener(p);
		p.Hdr_dlv_cntry_cd.setListListener(p);
		p.Hdr_dlv_cntry_cd.addAllListener(p);
		p.Hdr_dlv_cntry_nm.setListListener(p);
		p.Hdr_dlv_cntry_nm.addAllListener(p);
		p.Hdr_ship_rqst_id_typ.setListListener(p);
		p.Hdr_ship_rqst_id_typ.addAllListener(p);
		p.Hdr_ship_rqst_id_typ_nm.setListListener(p);
		p.Hdr_ship_rqst_id_typ_nm.addAllListener(p);
		p.Hdr_ship_rqst_id_cd.setListListener(p);
		p.Hdr_ship_rqst_id_cd.addAllListener(p);
		p.Hdr_ship_rqst_id_nm.setListListener(p);
		p.Hdr_ship_rqst_id_nm.addAllListener(p);
		p.Hdr_tdlv_cd.setListListener(p);
		p.Hdr_tdlv_cd.addAllListener(p);
		p.Hdr_tdlv_nm.setListListener(p);
		p.Hdr_tdlv_nm.addAllListener(p);
		p.Hdr_trnspt_cd.setListListener(p);
		p.Hdr_trnspt_cd.addAllListener(p);
		p.Hdr_trnspt_nm.setListListener(p);
		p.Hdr_trnspt_nm.addAllListener(p);
		p.Hdr_pl_rmrks.setListListener(p);
		p.Hdr_pl_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_ttl_net_wt.setListListener(p);
		p.Hdr_ttl_net_wt.addAllListener(p);
		p.Hdr_ttl_grss_wt.setListListener(p);
		p.Hdr_ttl_grss_wt.addAllListener(p);
		p.Hdr_ttl_dim.setListListener(p);
		p.Hdr_ttl_dim.addAllListener(p);
		p.Hdr_iv_src_typ.setListListener(p);
		p.Hdr_iv_src_typ.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBEP_PlReg p) {
	}

	/**
	 *  [Hdr3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr3(MSBEP_PlReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_PlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_sim_cnd_grp_no.addAllListener(p);
		p.columnDtl_sim_cnd_grp_no.setListListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_cntry_org_cd.addAllListener(p);
		p.columnDtl_cntry_org_cd.setListListener(p);
		p.columnDtl_cntry_org_nm.addAllListener(p);
		p.columnDtl_cntry_org_nm.setListListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_cntnr_cd.addAllListener(p);
		p.columnDtl_cntnr_cd.setListListener(p);
		p.columnDtl_cntnr_nm.addAllListener(p);
		p.columnDtl_cntnr_nm.setListListener(p);
		p.columnDtl_cntnr_no_fr.addAllListener(p);
		p.columnDtl_cntnr_no_fr.setListListener(p);
		p.columnDtl_cntnr_no_to.addAllListener(p);
		p.columnDtl_cntnr_no_to.setListListener(p);
		p.columnDtl_net_wt.addAllListener(p);
		p.columnDtl_net_wt.setListListener(p);
		p.columnDtl_grss_wt.addAllListener(p);
		p.columnDtl_grss_wt.setListListener(p);
		p.columnDtl_dim.addAllListener(p);
		p.columnDtl_dim.setListListener(p);
		p.columnDtl_pl_d_rmrks.addAllListener(p);
		p.columnDtl_pl_d_rmrks.setListListener(p);
		p.columnDtl_cst_po_no.addAllListener(p);
		p.columnDtl_cst_po_no.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_PlReg p) {
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_get_wt_dim.addAllListener(p);
		p.Btn_get_wt_dim.setAPMethodName("doBtn_get_wt_dim");
		p.Btn_merge.addAllListener(p);
		p.Btn_merge.setAPMethodName("doBtn_merge");
		p.Btn_divide.addAllListener(p);
		p.Btn_divide.setAPMethodName("doBtn_divide");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_chk_by_grp_no_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_PlReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_merge.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_divide.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_pl_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [INS]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sim_cnd_grp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cntnr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cntnr_no_to.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_net_wt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_grss_wt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_dim.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_sum_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_po_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, INS, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, INS, MCMode.ENABLE);
		p.Btn_merge.putMode(p, INS, MCMode.DISABLE);
		p.Btn_divide.putMode(p, INS, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_merge.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_divide.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pl_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sim_cnd_grp_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntnr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntnr_no_to.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_net_wt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_grss_wt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dim.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_sum_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_po_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_merge.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_divide.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_merge.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_divide.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_merge.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_divide.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_get_wt_dim.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_merge.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_divide.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_PlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_PlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_PlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_iv_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_PlReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_PlReg p){
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_non_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cmpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pl_immed_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pl_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_cntry_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_rqst_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tdlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trnspt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trnspt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ttl_net_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ttl_grss_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ttl_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_src_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBEP_PlReg p){

	}

	/**
	 * [REF]ステータスの[Hdr3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr3(MSBEP_PlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBEP_PlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sim_cnd_grp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cntnr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntnr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntnr_no_to.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_net_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_grss_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sum_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pl_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_PlReg p){
		p.Btn_prnt.putMode(p, REF, MCMode.ENABLE);
		p.Btn_get_wt_dim.putMode(p, REF, MCMode.DISABLE);
		p.Btn_merge.putMode(p, REF, MCMode.DISABLE);
		p.Btn_divide.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_chk_by_grp_no_flg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_PlReg p){

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
		MSBEP_PlReg_MC.setTableConfigDtl((MSBEP_PlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_PlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_sim_cnd_grp_no.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sim_cnd_grp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sim_cnd_grp_no);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_cntry_org_cd.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntry_org_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_cd);
		p.columnDtl_cntry_org_nm.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntry_org_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_nm);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.trd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_cntnr_cd.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntnr_cd_META);
		p.columnDtl_cntnr_cd.addLinkBeans(p.columnDtl_cntnr_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntnr_cd);
		p.columnDtl_cntnr_nm.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntnr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntnr_nm);
		p.columnDtl_cntnr_no_fr.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntnr_no_fr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntnr_no_fr);
		p.columnDtl_cntnr_no_to.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cntnr_no_to_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntnr_no_to);
		p.columnDtl_net_wt.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.net_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_net_wt);
		p.columnDtl_grss_wt.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.grss_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_grss_wt);
		p.columnDtl_dim.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dim);
		p.DtlTable.addTable(p.Dtl_sum_qty_p_PPanel.QtyTable);
		p.columnDtl_pl_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.pl_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pl_d_rmrks);
		p.columnDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cst_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_no);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1750.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnDtl_cntnr_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cntnr_cd.getListConfig().setPutter(getDtl_cntnr_cd_ListPutter());
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Dtl_cntnr_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cntnr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExCntnr");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == columnDtl_cntnr_cd) return getDtl_cntnr_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_get_wt_dim) doBtn_get_wt_dim(info);
		else if (ap == Btn_merge) doBtn_merge(info);
		else if (ap == Btn_divide) doBtn_divide(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[get_wt_dim]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_get_wt_dim(MCEventInfo info);

	/**
	 * [Btn]パネルの[merge]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_merge(MCEventInfo info);

	/**
	 * [Btn]パネルの[divide]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_divide(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_iv_no) return doCnd_iv_no_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_non_cmpl_flg) return doHdr_non_cmpl_flg_VC(info);
		if (vc == Hdr_cmpl_flg) return doHdr_cmpl_flg_VC(info);
		if (vc == Hdr_pl_immed_prnt_flg) return doHdr_pl_immed_prnt_flg_VC(info);
		if (vc == Hdr_pl_prnt_flg) return doHdr_pl_prnt_flg_VC(info);
		if (vc == Hdr_dlv_id_typ) return doHdr_dlv_id_typ_VC(info);
		if (vc == Hdr_dlv_id_typ_nm) return doHdr_dlv_id_typ_nm_VC(info);
		if (vc == Hdr_dlv_id_cd) return doHdr_dlv_id_cd_VC(info);
		if (vc == Hdr_dlv_id_nm) return doHdr_dlv_id_nm_VC(info);
		if (vc == Hdr_dlv_cntry_cd) return doHdr_dlv_cntry_cd_VC(info);
		if (vc == Hdr_dlv_cntry_nm) return doHdr_dlv_cntry_nm_VC(info);
		if (vc == Hdr_ship_rqst_id_typ) return doHdr_ship_rqst_id_typ_VC(info);
		if (vc == Hdr_ship_rqst_id_typ_nm) return doHdr_ship_rqst_id_typ_nm_VC(info);
		if (vc == Hdr_ship_rqst_id_cd) return doHdr_ship_rqst_id_cd_VC(info);
		if (vc == Hdr_ship_rqst_id_nm) return doHdr_ship_rqst_id_nm_VC(info);
		if (vc == Hdr_tdlv_cd) return doHdr_tdlv_cd_VC(info);
		if (vc == Hdr_tdlv_nm) return doHdr_tdlv_nm_VC(info);
		if (vc == Hdr_trnspt_cd) return doHdr_trnspt_cd_VC(info);
		if (vc == Hdr_trnspt_nm) return doHdr_trnspt_nm_VC(info);
		if (vc == Hdr_pl_rmrks) return doHdr_pl_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_ttl_net_wt) return doHdr_ttl_net_wt_VC(info);
		if (vc == Hdr_ttl_grss_wt) return doHdr_ttl_grss_wt_VC(info);
		if (vc == Hdr_ttl_dim) return doHdr_ttl_dim_VC(info);
		if (vc == Hdr_iv_src_typ) return doHdr_iv_src_typ_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_sim_cnd_grp_no) return doDtl_sim_cnd_grp_no_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_cntry_org_cd) return doDtl_cntry_org_cd_VC(info);
		if (vc == columnDtl_cntry_org_nm) return doDtl_cntry_org_nm_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_cntnr_cd) return doDtl_cntnr_cd_VC(info);
		if (vc == columnDtl_cntnr_nm) return doDtl_cntnr_nm_VC(info);
		if (vc == columnDtl_cntnr_no_fr) return doDtl_cntnr_no_fr_VC(info);
		if (vc == columnDtl_cntnr_no_to) return doDtl_cntnr_no_to_VC(info);
		if (vc == columnDtl_net_wt) return doDtl_net_wt_VC(info);
		if (vc == columnDtl_grss_wt) return doDtl_grss_wt_VC(info);
		if (vc == columnDtl_dim) return doDtl_dim_VC(info);
		if (vc == columnDtl_pl_d_rmrks) return doDtl_pl_d_rmrks_VC(info);
		if (vc == columnDtl_cst_po_no) return doDtl_cst_po_no_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == Btn_chk_by_grp_no_flg) return doBtn_chk_by_grp_no_flg_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_non_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pl_immed_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pl_immed_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pl_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pl_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_rqst_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trnspt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trnspt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ttl_net_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ttl_net_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ttl_grss_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ttl_grss_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ttl_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ttl_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_src_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sim_cnd_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sim_cnd_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_org_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntry_org_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntnr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntnr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntnr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntnr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntnr_no_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntnr_no_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cntnr_no_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cntnr_no_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[net_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_net_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[grss_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_grss_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pl_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pl_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_chk_by_grp_no_flg_VC(MCEventInfo info){
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
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_iv_no) doCnd_iv_no_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NC(info);
		else if (nc == Hdr_cmpl_flg) doHdr_cmpl_flg_NC(info);
		else if (nc == Hdr_pl_immed_prnt_flg) doHdr_pl_immed_prnt_flg_NC(info);
		else if (nc == Hdr_pl_prnt_flg) doHdr_pl_prnt_flg_NC(info);
		else if (nc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NC(info);
		else if (nc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NC(info);
		else if (nc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NC(info);
		else if (nc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NC(info);
		else if (nc == Hdr_dlv_cntry_cd) doHdr_dlv_cntry_cd_NC(info);
		else if (nc == Hdr_dlv_cntry_nm) doHdr_dlv_cntry_nm_NC(info);
		else if (nc == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NC(info);
		else if (nc == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NC(info);
		else if (nc == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NC(info);
		else if (nc == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NC(info);
		else if (nc == Hdr_tdlv_cd) doHdr_tdlv_cd_NC(info);
		else if (nc == Hdr_tdlv_nm) doHdr_tdlv_nm_NC(info);
		else if (nc == Hdr_trnspt_cd) doHdr_trnspt_cd_NC(info);
		else if (nc == Hdr_trnspt_nm) doHdr_trnspt_nm_NC(info);
		else if (nc == Hdr_pl_rmrks) doHdr_pl_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_ttl_net_wt) doHdr_ttl_net_wt_NC(info);
		else if (nc == Hdr_ttl_grss_wt) doHdr_ttl_grss_wt_NC(info);
		else if (nc == Hdr_ttl_dim) doHdr_ttl_dim_NC(info);
		else if (nc == Hdr_iv_src_typ) doHdr_iv_src_typ_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_sim_cnd_grp_no) doDtl_sim_cnd_grp_no_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NC(info);
		else if (nc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_cntnr_cd) doDtl_cntnr_cd_NC(info);
		else if (nc == columnDtl_cntnr_nm) doDtl_cntnr_nm_NC(info);
		else if (nc == columnDtl_cntnr_no_fr) doDtl_cntnr_no_fr_NC(info);
		else if (nc == columnDtl_cntnr_no_to) doDtl_cntnr_no_to_NC(info);
		else if (nc == columnDtl_net_wt) doDtl_net_wt_NC(info);
		else if (nc == columnDtl_grss_wt) doDtl_grss_wt_NC(info);
		else if (nc == columnDtl_dim) doDtl_dim_NC(info);
		else if (nc == columnDtl_pl_d_rmrks) doDtl_pl_d_rmrks_NC(info);
		else if (nc == columnDtl_cst_po_no) doDtl_cst_po_no_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_immed_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_immed_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_net_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_net_wt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_grss_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_grss_wt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_dim_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_cnd_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_cnd_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_fr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[net_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_net_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grss_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grss_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pl_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pl_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_iv_no) doCnd_iv_no_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NE(info);
		else if (ne == Hdr_cmpl_flg) doHdr_cmpl_flg_NE(info);
		else if (ne == Hdr_pl_immed_prnt_flg) doHdr_pl_immed_prnt_flg_NE(info);
		else if (ne == Hdr_pl_prnt_flg) doHdr_pl_prnt_flg_NE(info);
		else if (ne == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NE(info);
		else if (ne == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NE(info);
		else if (ne == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NE(info);
		else if (ne == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NE(info);
		else if (ne == Hdr_dlv_cntry_cd) doHdr_dlv_cntry_cd_NE(info);
		else if (ne == Hdr_dlv_cntry_nm) doHdr_dlv_cntry_nm_NE(info);
		else if (ne == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NE(info);
		else if (ne == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NE(info);
		else if (ne == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NE(info);
		else if (ne == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NE(info);
		else if (ne == Hdr_tdlv_cd) doHdr_tdlv_cd_NE(info);
		else if (ne == Hdr_tdlv_nm) doHdr_tdlv_nm_NE(info);
		else if (ne == Hdr_trnspt_cd) doHdr_trnspt_cd_NE(info);
		else if (ne == Hdr_trnspt_nm) doHdr_trnspt_nm_NE(info);
		else if (ne == Hdr_pl_rmrks) doHdr_pl_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_ttl_net_wt) doHdr_ttl_net_wt_NE(info);
		else if (ne == Hdr_ttl_grss_wt) doHdr_ttl_grss_wt_NE(info);
		else if (ne == Hdr_ttl_dim) doHdr_ttl_dim_NE(info);
		else if (ne == Hdr_iv_src_typ) doHdr_iv_src_typ_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_sim_cnd_grp_no) doDtl_sim_cnd_grp_no_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NE(info);
		else if (ne == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_cntnr_cd) doDtl_cntnr_cd_NE(info);
		else if (ne == columnDtl_cntnr_nm) doDtl_cntnr_nm_NE(info);
		else if (ne == columnDtl_cntnr_no_fr) doDtl_cntnr_no_fr_NE(info);
		else if (ne == columnDtl_cntnr_no_to) doDtl_cntnr_no_to_NE(info);
		else if (ne == columnDtl_net_wt) doDtl_net_wt_NE(info);
		else if (ne == columnDtl_grss_wt) doDtl_grss_wt_NE(info);
		else if (ne == columnDtl_dim) doDtl_dim_NE(info);
		else if (ne == columnDtl_pl_d_rmrks) doDtl_pl_d_rmrks_NE(info);
		else if (ne == columnDtl_cst_po_no) doDtl_cst_po_no_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_immed_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_immed_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_net_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_net_wt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_grss_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_grss_wt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_dim_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_cnd_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_cnd_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_fr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[net_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_net_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grss_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grss_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pl_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pl_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_iv_no) doCnd_iv_no_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_non_cmpl_flg) doHdr_non_cmpl_flg_NX(info);
		else if (nx == Hdr_cmpl_flg) doHdr_cmpl_flg_NX(info);
		else if (nx == Hdr_pl_immed_prnt_flg) doHdr_pl_immed_prnt_flg_NX(info);
		else if (nx == Hdr_pl_prnt_flg) doHdr_pl_prnt_flg_NX(info);
		else if (nx == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NX(info);
		else if (nx == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NX(info);
		else if (nx == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NX(info);
		else if (nx == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NX(info);
		else if (nx == Hdr_dlv_cntry_cd) doHdr_dlv_cntry_cd_NX(info);
		else if (nx == Hdr_dlv_cntry_nm) doHdr_dlv_cntry_nm_NX(info);
		else if (nx == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_NX(info);
		else if (nx == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_NX(info);
		else if (nx == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_NX(info);
		else if (nx == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_NX(info);
		else if (nx == Hdr_tdlv_cd) doHdr_tdlv_cd_NX(info);
		else if (nx == Hdr_tdlv_nm) doHdr_tdlv_nm_NX(info);
		else if (nx == Hdr_trnspt_cd) doHdr_trnspt_cd_NX(info);
		else if (nx == Hdr_trnspt_nm) doHdr_trnspt_nm_NX(info);
		else if (nx == Hdr_pl_rmrks) doHdr_pl_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_ttl_net_wt) doHdr_ttl_net_wt_NX(info);
		else if (nx == Hdr_ttl_grss_wt) doHdr_ttl_grss_wt_NX(info);
		else if (nx == Hdr_ttl_dim) doHdr_ttl_dim_NX(info);
		else if (nx == Hdr_iv_src_typ) doHdr_iv_src_typ_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_sim_cnd_grp_no) doDtl_sim_cnd_grp_no_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NX(info);
		else if (nx == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_cntnr_cd) doDtl_cntnr_cd_NX(info);
		else if (nx == columnDtl_cntnr_nm) doDtl_cntnr_nm_NX(info);
		else if (nx == columnDtl_cntnr_no_fr) doDtl_cntnr_no_fr_NX(info);
		else if (nx == columnDtl_cntnr_no_to) doDtl_cntnr_no_to_NX(info);
		else if (nx == columnDtl_net_wt) doDtl_net_wt_NX(info);
		else if (nx == columnDtl_grss_wt) doDtl_grss_wt_NX(info);
		else if (nx == columnDtl_dim) doDtl_dim_NX(info);
		else if (nx == columnDtl_pl_d_rmrks) doDtl_pl_d_rmrks_NX(info);
		else if (nx == columnDtl_cst_po_no) doDtl_cst_po_no_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == Btn_chk_by_grp_no_flg) doBtn_chk_by_grp_no_flg_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[non_cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_non_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_immed_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_immed_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_net_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_net_wt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_grss_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_grss_wt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_dim_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_cnd_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_cnd_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_fr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[net_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_net_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grss_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grss_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pl_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pl_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[chk_by_grp_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_chk_by_grp_no_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_iv_no) doCnd_iv_no_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_LC(info);
		else if (lc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_LC(info);
		else if (lc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_LC(info);
		else if (lc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_LC(info);
		else if (lc == Hdr_dlv_cntry_cd) doHdr_dlv_cntry_cd_LC(info);
		else if (lc == Hdr_dlv_cntry_nm) doHdr_dlv_cntry_nm_LC(info);
		else if (lc == Hdr_ship_rqst_id_typ) doHdr_ship_rqst_id_typ_LC(info);
		else if (lc == Hdr_ship_rqst_id_typ_nm) doHdr_ship_rqst_id_typ_nm_LC(info);
		else if (lc == Hdr_ship_rqst_id_cd) doHdr_ship_rqst_id_cd_LC(info);
		else if (lc == Hdr_ship_rqst_id_nm) doHdr_ship_rqst_id_nm_LC(info);
		else if (lc == Hdr_tdlv_cd) doHdr_tdlv_cd_LC(info);
		else if (lc == Hdr_tdlv_nm) doHdr_tdlv_nm_LC(info);
		else if (lc == Hdr_trnspt_cd) doHdr_trnspt_cd_LC(info);
		else if (lc == Hdr_trnspt_nm) doHdr_trnspt_nm_LC(info);
		else if (lc == Hdr_pl_rmrks) doHdr_pl_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Hdr_ttl_net_wt) doHdr_ttl_net_wt_LC(info);
		else if (lc == Hdr_ttl_grss_wt) doHdr_ttl_grss_wt_LC(info);
		else if (lc == Hdr_ttl_dim) doHdr_ttl_dim_LC(info);
		else if (lc == Hdr_iv_src_typ) doHdr_iv_src_typ_LC(info);
		else if (lc == columnDtl_sim_cnd_grp_no) doDtl_sim_cnd_grp_no_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_LC(info);
		else if (lc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_cntnr_cd) doDtl_cntnr_cd_LC(info);
		else if (lc == columnDtl_cntnr_nm) doDtl_cntnr_nm_LC(info);
		else if (lc == columnDtl_cntnr_no_fr) doDtl_cntnr_no_fr_LC(info);
		else if (lc == columnDtl_cntnr_no_to) doDtl_cntnr_no_to_LC(info);
		else if (lc == columnDtl_net_wt) doDtl_net_wt_LC(info);
		else if (lc == columnDtl_grss_wt) doDtl_grss_wt_LC(info);
		else if (lc == columnDtl_dim) doDtl_dim_LC(info);
		else if (lc == columnDtl_pl_d_rmrks) doDtl_pl_d_rmrks_LC(info);
		else if (lc == columnDtl_cst_po_no) doDtl_cst_po_no_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
	}

	/**
	 * [Cnd]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_rqst_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_rqst_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trnspt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trnspt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_net_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_net_wt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_grss_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_grss_wt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ttl_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ttl_dim_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sim_cnd_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sim_cnd_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntry_org_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntry_org_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_fr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cntnr_no_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cntnr_no_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[net_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_net_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grss_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grss_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pl_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pl_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cntnr_cd]の作成メソッド
	 */
	public MCList getDtl_cntnr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExCntnr(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1750.Srch01")) {
			return new MS_MSBEL1750_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1750.Srch02")) {
			return new MS_MSBEL1750_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1750.Srch03")) {
			return new MS_MSBEL1750_Srch03Bridge();
		}
		if (id.equals("MS.MSBEL1750.Upd01")) {
			return new MS_MSBEL1750_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1750.Del01")) {
			return new MS_MSBEL1750_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1750.Prnt01")) {
			return new MS_MSBEL1750_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1750_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1750_Srch01Bridge() {
			p_MS_MSBEL1750_Srch01 = new MCParam(PDef.MS_MSBEL1750_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1750.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));

			p_MS_MSBEL1750_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1750.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1750.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1750.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1750.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1750.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1750_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			p_MS_MSBEL1750_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1750.HdrR)p_MS_MSBEL1750_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)p_MS_MSBEL1750_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1750_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1750_Srch02Bridge() {
			p_MS_MSBEL1750_Srch02 = new MCParam(PDef.MS_MSBEL1750_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1750.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));

			p_MS_MSBEL1750_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1750.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1750.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1750.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1750.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1750.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1750_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			p_MS_MSBEL1750_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1750.HdrR)p_MS_MSBEL1750_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)p_MS_MSBEL1750_Srch02.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1750_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Srch03;

		/** コンストラクタ */
		protected MS_MSBEL1750_Srch03Bridge() {
			p_MS_MSBEL1750_Srch03 = new MCParam(PDef.MS_MSBEL1750_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));

			p_MS_MSBEL1750_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Srch03.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1750.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1750.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1750_Srch03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Srch03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)p_MS_MSBEL1750_Srch03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1750_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1750_Upd01Bridge() {
			p_MS_MSBEL1750_Upd01 = new MCParam(PDef.MS_MSBEL1750_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1750.DtlR.class));
			// Down

			p_MS_MSBEL1750_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1750_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1750.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1750.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1750.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1750.DtlR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1750_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1750_Del01Bridge() {
			p_MS_MSBEL1750_Del01 = new MCParam(PDef.MS_MSBEL1750_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			// Down

			p_MS_MSBEL1750_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Del01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1750.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1750.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1750_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1750_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1750_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1750_Prnt01Bridge() {
			p_MS_MSBEL1750_Prnt01 = new MCParam(PDef.MS_MSBEL1750_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1750_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1750.HdrR.create());
			// Down

			p_MS_MSBEL1750_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1750_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1750_Prnt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1750_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1750_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1750.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1750.HdrR)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1750_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}