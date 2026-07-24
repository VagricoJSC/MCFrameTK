package mcframe.clientMSBE.MSBEP1400;

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
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch02Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Ins01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Upd01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Del01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Prnt01Caller;
import mcframe.clientMSBE.MSBEP1400.MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt02Caller;

/**
 * 画面"MSBEP_ShipInstReg"パネルクラスです。<p>
 *
 * 出荷予定をもとに出荷帳票を発行し、指図を実施します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipInstReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1400";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_inst_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_ship_inst_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch2 = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_ship_fr_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_fr_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Hdr_ship_fr_lg_grp_nm = null;
	public MCLabel Hdr_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ship_inst_no = null;
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_ship_inst_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／ＶＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ship_inst_ymd_hm_p_PPanel;
	public MCDateField Hdr_ship_inst_dt;	// [Hdr]の[ship_inst_ymd_hm_p.ymd]を[Hdr_ship_inst_dt]としてエイリアス定義。
	public MCDateField Hdr_ship_inst_hm;	// [Hdr]の[ship_inst_ymd_hm_p.hm]を[Hdr_ship_inst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ship_schd_ymd_hm_p_PPanel;
	public MCDateField Hdr_ship_schd_dt;	// [Hdr]の[ship_schd_ymd_hm_p.ymd]を[Hdr_ship_schd_dt]としてエイリアス定義。
	public MCDateField Hdr_ship_schd_hm;	// [Hdr]の[ship_schd_ymd_hm_p.hm]を[Hdr_ship_schd_hm]としてエイリアス定義。
	/**
	 * Shipping schedule time 出荷予定時間.<p>
	 *
	 */
	public MCTextField Hdr_ship_schd_time = null;
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_dlv_schd_ymd_hm_p_PPanel;
	public MCDateField Hdr_dlv_schd_dt;	// [Hdr]の[dlv_schd_ymd_hm_p.ymd]を[Hdr_dlv_schd_dt]としてエイリアス定義。
	public MCDateField Hdr_dlv_schd_hm;	// [Hdr]の[dlv_schd_ymd_hm_p.hm]を[Hdr_dlv_schd_hm]としてエイリアス定義。
	public MCLabel Hdr_ship_to_id_typ_Label = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_typ_nm = null;
	public MCLabel Hdr_ship_to_id_cd_Label = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_nm = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_ship_to_addr_p_PPanel;
	public MCTextComboBox Hdr_ship_to_lg_grp_cd;	// [Hdr]の[ship_to_addr_p.lg_grp_cd]を[Hdr_ship_to_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_lg_grp_nm;	// [Hdr]の[ship_to_addr_p.lg_grp_nm]を[Hdr_ship_to_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntry_cd;	// [Hdr]の[ship_to_addr_p.cntry_cd]を[Hdr_ship_to_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntry_nm;	// [Hdr]の[ship_to_addr_p.cntry_nm]を[Hdr_ship_to_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_ship_to_zip_cd;	// [Hdr]の[ship_to_addr_p.zip_cd]を[Hdr_ship_to_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr1;	// [Hdr]の[ship_to_addr_p.addr1]を[Hdr_ship_to_addr1]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr2;	// [Hdr]の[ship_to_addr_p.addr2]を[Hdr_ship_to_addr2]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr3;	// [Hdr]の[ship_to_addr_p.addr3]を[Hdr_ship_to_addr3]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr4;	// [Hdr]の[ship_to_addr_p.addr4]を[Hdr_ship_to_addr4]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntct_dpt;	// [Hdr]の[ship_to_addr_p.cntct_dpt]を[Hdr_ship_to_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntct_psn;	// [Hdr]の[ship_to_addr_p.cntct_psn]を[Hdr_ship_to_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr_ship_to_tel;	// [Hdr]の[ship_to_addr_p.tel]を[Hdr_ship_to_tel]としてエイリアス定義。
	public MCTextField Hdr_ship_to_fax;	// [Hdr]の[ship_to_addr_p.fax]を[Hdr_ship_to_fax]としてエイリアス定義。
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_to_sundry_flg = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_inst_usr_dpt_p_PPanel;
	public MCTextField Hdr_inst_usr_cd;	// [Hdr]の[inst_usr_dpt_p.usr_cd]を[Hdr_inst_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_inst_usr_nm;	// [Hdr]の[inst_usr_dpt_p.usr_nm]を[Hdr_inst_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_inst_dpt_cd;	// [Hdr]の[inst_usr_dpt_p.dpt_cd]を[Hdr_inst_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_inst_dpt_nm;	// [Hdr]の[inst_usr_dpt_p.dpt_nm]を[Hdr_inst_dpt_nm]としてエイリアス定義。
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public MCCheckBox Hdr_lot_chk_off_flg = null;
	public MCLabel Hdr_ship_term_cd_Label = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCTextField Hdr_ship_term_nm = null;
	public MCLabel Hdr_ship_wk_grp_cd_Label = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCTextField Hdr_ship_wk_grp_nm = null;
	public MCLabel Hdr_ship_wk_cd_Label = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCTextField Hdr_ship_wk_nm = null;
	public MCLabel Hdr_ship_wt_Label = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumberField Hdr_ship_wt = null;
	public MCLabel Hdr_ship_dim_Label = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumberField Hdr_ship_dim = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_inst_rmrks_Label = null;
	/**
	 * Order remarks 指図備考.<p>
	 *
	 */
	public MCTextField Hdr_inst_rmrks = null;
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
	/**
	 * Picking list immediate issue ピッキングリスト即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_immd_pick_prnt_flg = null;
	/**
	 * Shipping order sheet immediate issue 出荷指図書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_immd_ship_inst_prnt_flg = null;
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_immd_dlv_prnt_flg = null;
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_immd_ship_adv_prnt_flg = null;
	/**
	 * Picking list issued ピッキングリスト発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_pick_prnt_flg = null;
	/**
	 * Shipping order sheet issued 出荷指図書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_inst_prnt_flg = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_prnt_flg = null;
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_adv_prnt_flg = null;
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
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	/**
	 * Shipping order update counter 出荷指図更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_ship_inst_upd_cntr = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1400.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
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
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
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
	 * Without lot ロット指定無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_none_flg = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_alloc_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_alloc_ver_no;// [Dtl]の[alloc_ver_no_p.ver_no]を[columnDtl_alloc_ver_no]としてエイリアス定義。
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_sublot_mix_flg = null;
	/**
	 * Input unit cd. 入力単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_cd = null;
	/**
	 * Input unit name 入力単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_nm = null;
	/**
	 * Input unit number of decimal places 入力単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_dec_place = null;
	/**
	 * Input unit conversion base qty. 入力単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_conv_base_qty = null;
	/**
	 * Input unit conversion qty. 入力単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_conv_qty = null;
	/**
	 * Input unit rounding type 入力単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ent_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_ent_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_ent_unit_qty;// [Dtl]の[ent_unit_qty_p.qty]を[columnDtl_ent_unit_qty]としてエイリアス定義。
	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_abort_flg = null;
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_abort_flg = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit conversion base qty. 基準単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_conv_base_qty = null;
	/**
	 * Base unit conversion qty. 基準単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_conv_qty = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ttl_flg = null;
	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_bndl_flg = null;
	/**
	 * Unit cd. at packing 梱包時単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_cd = null;
	/**
	 * Unit name at packing 梱包時単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_nm = null;
	/**
	 * Unit number of decimal places at packing 梱包時単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_dec_place = null;
	/**
	 * Unit conversion base qty. at packing 梱包時単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_conv_base_qty = null;
	/**
	 * Unit conversion qty. at packing 梱包時単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_conv_qty = null;
	/**
	 * Unit rounding type at packing 梱包時単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pckg_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_pckg_unit_qty;// [Dtl]の[pckg_unit_qty_p.qty]を[columnDtl_pckg_unit_qty]としてエイリアス定義。
	/**
	 * Unit cd. at schedule 予定時単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_cd = null;
	/**
	 * Unit name at schedule 予定時単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_nm = null;
	/**
	 * Unit number of decimal places at schedule 予定時単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_dec_place = null;
	/**
	 * Conversion base qty. for unit at schedule 予定時単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_conv_base_qty = null;
	/**
	 * Conversion qty. for unit at schedule 予定時単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_conv_qty = null;
	/**
	 * Unit rounding type at schedule 予定時単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_schd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_schd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_schd_unit_qty;// [Dtl]の[schd_unit_qty_p.qty]を[columnDtl_schd_unit_qty]としてエイリアス定義。
	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_schd_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_ship_act_qty_p_PPanel;
	public MCColumnConfig columnDtl_ship_act_qty;// [Dtl]の[ship_act_qty_p.qty]を[columnDtl_ship_act_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_act_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_qty;// [Dtl]の[act_cont_qty_p.cont_qty]を[columnDtl_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Dtl_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_fctr;// [Dtl]の[act_cont_fctr_p.act_cont_fctr]を[columnDtl_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_qty;// [Dtl]の[std_cont_qty_p.cont_qty]を[columnDtl_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_unit_dec_place = null;
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_unit_rnd_typ = null;
	/**
	 * Location allocation 場所引当.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_flg = null;
	/**
	 * Gross allocation 総量引当.<p>
	 *
	 */
	public MCColumnConfig columnDtl_grp_alloc_flg = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_site_cd = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_ship_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_ship_str_ln_cd;// [Dtl]の[ship_str_ln_p.str_ln_cd]を[columnDtl_ship_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_ship_str_ln_nm;// [Dtl]の[ship_str_ln_p.str_ln_nm]を[columnDtl_ship_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_ship_str_ln_cd_none_flg;// [Dtl]の[ship_str_ln_p.str_ln_cd_none_flg]を[columnDtl_ship_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * For delivery rack/line 納品棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_dlv_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_dlv_str_ln_cd;// [Dtl]の[dlv_str_ln_p.str_ln_cd]を[columnDtl_dlv_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_str_ln_nm;// [Dtl]の[dlv_str_ln_p.str_ln_nm]を[columnDtl_dlv_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_str_ln_cd_none_flg;// [Dtl]の[dlv_str_ln_p.str_ln_cd_none_flg]を[columnDtl_dlv_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno1_null_flg;// [Dtl]の[sno_wrk_no_p.sno1_null_flg]を[columnDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2_null_flg;// [Dtl]の[sno_wrk_no_p.sno2_null_flg]を[columnDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3_null_flg;// [Dtl]の[sno_wrk_no_p.sno3_null_flg]を[columnDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4_null_flg;// [Dtl]の[sno_wrk_no_p.sno4_null_flg]を[columnDtl_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_alloc_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_alloc_sno1;// [Dtl]の[alloc_sno_wrk_no_p.sno1]を[columnDtl_alloc_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno1_null_flg;// [Dtl]の[alloc_sno_wrk_no_p.sno1_null_flg]を[columnDtl_alloc_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno2;// [Dtl]の[alloc_sno_wrk_no_p.sno2]を[columnDtl_alloc_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno2_null_flg;// [Dtl]の[alloc_sno_wrk_no_p.sno2_null_flg]を[columnDtl_alloc_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno3;// [Dtl]の[alloc_sno_wrk_no_p.sno3]を[columnDtl_alloc_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno3_null_flg;// [Dtl]の[alloc_sno_wrk_no_p.sno3_null_flg]を[columnDtl_alloc_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno4;// [Dtl]の[alloc_sno_wrk_no_p.sno4]を[columnDtl_alloc_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_sno4_null_flg;// [Dtl]の[alloc_sno_wrk_no_p.sno4_null_flg]を[columnDtl_alloc_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_wrk_no;// [Dtl]の[alloc_sno_wrk_no_p.wrk_no]を[columnDtl_alloc_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_alloc_wrk_nm;// [Dtl]の[alloc_sno_wrk_no_p.wrk_nm]を[columnDtl_alloc_wrk_nm]としてエイリアス定義。
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_insp_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_nm = null;
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D Dtl_stk_bp_p_PPanel;
	public MCColumnConfig columnDtl_stk_bp_cd;// [Dtl]の[stk_bp_p.stk_bp_cd]を[columnDtl_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_stk_bp_nm;// [Dtl]の[stk_bp_p.stk_bp_nm]を[columnDtl_stk_bp_nm]としてエイリアス定義。
	/**
	 * Delivery destination type 納品先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_typ = null;
	/**
	 * Delivery destination type name 納品先区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_typ_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_grp_nm = null;
	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_loc_cd = null;
	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_loc_nm = null;
	/**
	 * Normal shipping location priority 通常出荷場所優先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_prio_flg = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_nm = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_nm = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pri_prnt_flg = null;
	/**
	 * Unrequired configuration check 構成チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_skip_chk_ship_flg = null;
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ = null;
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_typ_nm = null;
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ = null;
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_basis_typ_nm = null;
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_typ = null;
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_typ_nm = null;
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_basis_typ = null;
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ret_prov_basis_typ_nm = null;
	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wms_flg = null;
	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_last_wms_flg = null;
	/**
	 * For WMS ＷＭＳ対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wms_tgt_flg = null;
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_dlv_slip_no = null;
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_prov_act_no = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_ac_dt = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_cnt_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_d_rmrks = null;
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_schd_no = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_d_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_no = null;
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_fr_lg_grp_cd = null;
	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tmp_inst_d_no = null;
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_pr_no = null;
	/**
	 * Pegging No. for lot suggestion ロット提案用紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_peg_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Pegged No. for picking ピッキング用紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pick_peg_no = null;
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_src_typ = null;
	/**
	 * Shipping invoice biz flg. インボイス取引ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_trd_flg = null;
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_iv_flg = null;
	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cststk_flg = null;
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loan_flg = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dim = null;
	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_wt = null;
	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_dim = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_vld_dt_fr = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_vld_dt_to = null;
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_scope_typ = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_typ = null;
	/**
	 * Shipping schedule location cd. 出荷予定場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_loc_cd = null;
	/**
	 * Shipping schedule location supplier cd. 出荷予定場所発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_loc_sppl_cd = null;
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_tm = null;
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_schd_tm = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_term_cd = null;
	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public MCColumnConfig columnDtl_no_alloc_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0110 = null;
	/**
	 * Picking list ピッキングリスト.<p>
	 *
	 */
	public MCButton Btn_prnt_pick = null;
	/**
	 * Order sheet 指図書.<p>
	 *
	 */
	public MCButton Btn_prnt_inst = null;
	/**
	 * Delivery note 納品書.<p>
	 *
	 */
	public MCButton Btn_prnt_dlv = null;
	/**
	 * Guide 案内書.<p>
	 *
	 */
	public MCButton Btn_prnt_adv = null;
	/**
	 * Suggest lot/location ロット・場所提案.<p>
	 *
	 */
	public MCButton Btn_sprt_lot_prop = null;
	/**
	 * Suggest packing qty. 梱包数量提案.<p>
	 *
	 */
	public MCButton Btn_sprt_pckg_prop = null;
	/**
	 * Acquire supply date 支給日取得.<p>
	 *
	 */
	public MCButton Btn_sprt_ac_dt = null;
	/**
	 * Select same details in bulk 同一明細まとめ選択.<p>
	 *
	 */
	public MCCheckBox Btn_select_pckg = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
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
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS_NON]モードを表す定数 */
	public static final String INS_NON = "INS_NON";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
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
	public static final String[] statusArray = new String[]{INS_NON, INS, FIX_I, SRCH, UPD, FIX_U, DEL, FIX_D, REF};
	
	/** [MS_MSBEL1400_Srch01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch01Caller createMS_MSBEL1400_Srch01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Srch01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Srch01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Srch01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Srch01]の呼び出し */
	protected void callMS_MSBEL1400_Srch01() {
		MCCaller caller = createMS_MSBEL1400_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Srch02]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch02Caller createMS_MSBEL1400_Srch02() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Srch02Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Srch02Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Srch02Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Srch02Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Srch02]の呼び出し */
	protected void callMS_MSBEL1400_Srch02() {
		MCCaller caller = createMS_MSBEL1400_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1400_Sprt01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt01Caller createMS_MSBEL1400_Sprt01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Sprt01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Sprt01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Sprt01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Sprt01]の呼び出し */
	protected void callMS_MSBEL1400_Sprt01() {
		MCCaller caller = createMS_MSBEL1400_Sprt01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Ins01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Ins01Caller createMS_MSBEL1400_Ins01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Ins01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Ins01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Ins01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Ins01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Ins01]の呼び出し */
	protected void callMS_MSBEL1400_Ins01() {
		MCCaller caller = createMS_MSBEL1400_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Upd01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Upd01Caller createMS_MSBEL1400_Upd01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Upd01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Upd01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Upd01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Upd01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Upd01]の呼び出し */
	protected void callMS_MSBEL1400_Upd01() {
		MCCaller caller = createMS_MSBEL1400_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Del01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Del01Caller createMS_MSBEL1400_Del01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Del01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Del01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Del01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Del01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Del01]の呼び出し */
	protected void callMS_MSBEL1400_Del01() {
		MCCaller caller = createMS_MSBEL1400_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Prnt01]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Prnt01Caller createMS_MSBEL1400_Prnt01() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Prnt01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Prnt01Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Prnt01Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Prnt01Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Prnt01]の呼び出し */
	protected void callMS_MSBEL1400_Prnt01() {
		MCCaller caller = createMS_MSBEL1400_Prnt01();
		caller.exec();
	}
	/** [MS_MSBEL1400_Sprt02]のCallerの作成 */
	protected MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt02Caller createMS_MSBEL1400_Sprt02() {
		MSBEP_ShipInstReg_MC.MS_MSBEL1400_Sprt02Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Sprt02Bridge>
		caller = ((MSBEP_ShipInstReg_MC)this).new MS_MSBEL1400_Sprt02Caller<MSBEP_ShipInstReg, MS_MSBEL1400_Sprt02Bridge>(
					(MSBEP_ShipInstReg)this, new MS_MSBEL1400_Sprt02Bridge());
		return caller;
	}
	/** [MS_MSBEL1400_Sprt02]の呼び出し */
	protected void callMS_MSBEL1400_Sprt02() {
		MCCaller caller = createMS_MSBEL1400_Sprt02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1400.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1400.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1400.DtlR> aDtlL;
	/** [ShipSchd_Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> aShipSchd_DtlL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1400.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1400.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1400.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1400.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1400.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1400.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1400.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1400.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1400.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1400.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1400.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1400.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1400.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1400.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class);
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
	 * コピーによってaShipSchd_DtlLを設定します。
	 *
	 * aShipSchd_DtlLのインスタンスは変更されません。
	 *
	 * @param dataset ShipSchd_DtlL
	 */
	public void setShipSchd_DtlL(MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> aList) {
		if (getShipSchd_DtlL() != aList) {
			getShipSchd_DtlL().setAll(aList);
		}
	}

	/**
	 * [ShipSchd_Dtl]ブロックのコンテナaShipSchd_DtlLを返します。
	 *
	 * @return ShipSchd_DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> getShipSchd_DtlL() {
		return aShipSchd_DtlL;
	}

	/**
	 * aShipSchd_DtlRを作成します。
	 *
	 * @return ShipSchd_DtlR
	 */
	public mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR createShipSchd_DtlR() {
		return mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.create();
	}

	/**
	 * aShipSchd_DtlLを作成します。
	 *
	 * @return ShipSchd_DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> createShipSchd_DtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class);
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBE.MSBEP1400.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1400.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1400.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1400.BtnR.create();
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
		if(!MCCollectionUtil.contains(ret, getShipSchd_DtlL())) ret.add(getShipSchd_DtlL());
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
		if(aCnt == getShipSchd_DtlL()) return "ShipSchd_Dtl";
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
		if(bId.equals("ShipSchd_Dtl")) return getShipSchd_DtlL();
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
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipInstReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aShipSchd_DtlL = createShipSchd_DtlL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipInstReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aShipSchd_DtlL = createShipSchd_DtlL();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_ShipInstReg_MC.jbCreateScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateCnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateHdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateHdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateHdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateDtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateBtn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbCreateEastBtn((MSBEP_ShipInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipInstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipInstReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_ShipInstReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_ShipInstReg p) {
		p.Hdr_ship_inst_ymd_hm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ship_inst_ymd_hm_p());
		p.Hdr_ship_inst_ymd_hm_p_PPanel.setName("Hdr.ship_inst_ymd_hm_p");
		p.Hdr_ship_inst_dt = p.Hdr_ship_inst_ymd_hm_p_PPanel.YmdHm_ymd;
		p.Hdr_ship_inst_dt.addAliasName("Hdr.ship_inst_dt", p);
		p.Hdr_ship_inst_hm = p.Hdr_ship_inst_ymd_hm_p_PPanel.YmdHm_hm;
		p.Hdr_ship_inst_hm.addAliasName("Hdr.ship_inst_hm", p);
		p.Hdr_ship_schd_ymd_hm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ship_schd_ymd_hm_p());
		p.Hdr_ship_schd_ymd_hm_p_PPanel.setName("Hdr.ship_schd_ymd_hm_p");
		p.Hdr_ship_schd_dt = p.Hdr_ship_schd_ymd_hm_p_PPanel.YmdHm_ymd;
		p.Hdr_ship_schd_dt.addAliasName("Hdr.ship_schd_dt", p);
		p.Hdr_ship_schd_hm = p.Hdr_ship_schd_ymd_hm_p_PPanel.YmdHm_hm;
		p.Hdr_ship_schd_hm.addAliasName("Hdr.ship_schd_hm", p);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().dlv_schd_ymd_hm_p());
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.setName("Hdr.dlv_schd_ymd_hm_p");
		p.Hdr_dlv_schd_dt = p.Hdr_dlv_schd_ymd_hm_p_PPanel.YmdHm_ymd;
		p.Hdr_dlv_schd_dt.addAliasName("Hdr.dlv_schd_dt", p);
		p.Hdr_dlv_schd_hm = p.Hdr_dlv_schd_ymd_hm_p_PPanel.YmdHm_hm;
		p.Hdr_dlv_schd_hm.addAliasName("Hdr.dlv_schd_hm", p);
		p.Hdr_ship_to_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().ship_to_addr_p());
		p.Hdr_ship_to_addr_p_PPanel.setName("Hdr.ship_to_addr_p");
		p.Hdr_ship_to_lg_grp_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_ship_to_lg_grp_cd.addAliasName("Hdr.ship_to_lg_grp_cd", p);
		p.Hdr_ship_to_lg_grp_nm = p.Hdr_ship_to_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_ship_to_lg_grp_nm.addAliasName("Hdr.ship_to_lg_grp_nm", p);
		p.Hdr_ship_to_cntry_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_ship_to_cntry_cd.addAliasName("Hdr.ship_to_cntry_cd", p);
		p.Hdr_ship_to_cntry_nm = p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_ship_to_cntry_nm.addAliasName("Hdr.ship_to_cntry_nm", p);
		p.Hdr_ship_to_zip_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_ship_to_zip_cd.addAliasName("Hdr.ship_to_zip_cd", p);
		p.Hdr_ship_to_addr1 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr1;
		p.Hdr_ship_to_addr1.addAliasName("Hdr.ship_to_addr1", p);
		p.Hdr_ship_to_addr2 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr2;
		p.Hdr_ship_to_addr2.addAliasName("Hdr.ship_to_addr2", p);
		p.Hdr_ship_to_addr3 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr3;
		p.Hdr_ship_to_addr3.addAliasName("Hdr.ship_to_addr3", p);
		p.Hdr_ship_to_addr4 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr4;
		p.Hdr_ship_to_addr4.addAliasName("Hdr.ship_to_addr4", p);
		p.Hdr_ship_to_cntct_dpt = p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_ship_to_cntct_dpt.addAliasName("Hdr.ship_to_cntct_dpt", p);
		p.Hdr_ship_to_cntct_psn = p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_ship_to_cntct_psn.addAliasName("Hdr.ship_to_cntct_psn", p);
		p.Hdr_ship_to_tel = p.Hdr_ship_to_addr_p_PPanel.Addr_tel;
		p.Hdr_ship_to_tel.addAliasName("Hdr.ship_to_tel", p);
		p.Hdr_ship_to_fax = p.Hdr_ship_to_addr_p_PPanel.Addr_fax;
		p.Hdr_ship_to_fax.addAliasName("Hdr.ship_to_fax", p);
		p.Hdr_inst_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().inst_usr_dpt_p());
		p.Hdr_inst_usr_dpt_p_PPanel.setName("Hdr.inst_usr_dpt_p");
		p.Hdr_inst_usr_cd = p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_inst_usr_cd.addAliasName("Hdr.inst_usr_cd", p);
		p.Hdr_inst_usr_nm = p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_inst_usr_nm.addAliasName("Hdr.inst_usr_nm", p);
		p.Hdr_inst_dpt_cd = p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_inst_dpt_cd.addAliasName("Hdr.inst_dpt_cd", p);
		p.Hdr_inst_dpt_nm = p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_inst_dpt_nm.addAliasName("Hdr.inst_dpt_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_ShipInstReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_ShipInstReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$itm_p);
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
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_alloc_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$alloc_ver_no_p);
		p.Dtl_alloc_ver_no_p_PPanel.setName("Dtl.alloc_ver_no_p");
		p.columnDtl_alloc_ver_no = p.Dtl_alloc_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_alloc_ver_no.addAliasName("Dtl.alloc_ver_no", p);
		p.Dtl_ent_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$ent_unit_qty_p);
		p.Dtl_ent_unit_qty_p_PPanel.setName("Dtl.ent_unit_qty_p");
		p.columnDtl_ent_unit_qty = p.Dtl_ent_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_ent_unit_qty.addAliasName("Dtl.ent_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_pckg_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$pckg_unit_qty_p);
		p.Dtl_pckg_unit_qty_p_PPanel.setName("Dtl.pckg_unit_qty_p");
		p.columnDtl_pckg_unit_qty = p.Dtl_pckg_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pckg_unit_qty.addAliasName("Dtl.pckg_unit_qty", p);
		p.Dtl_schd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$schd_unit_qty_p);
		p.Dtl_schd_unit_qty_p_PPanel.setName("Dtl.schd_unit_qty_p");
		p.columnDtl_schd_unit_qty = p.Dtl_schd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_schd_unit_qty.addAliasName("Dtl.schd_unit_qty", p);
		p.Dtl_ship_act_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$ship_act_qty_p);
		p.Dtl_ship_act_qty_p_PPanel.setName("Dtl.ship_act_qty_p");
		p.columnDtl_ship_act_qty = p.Dtl_ship_act_qty_p_PPanel.columnQty_qty;
		p.columnDtl_ship_act_qty.addAliasName("Dtl.ship_act_qty", p);
		p.Dtl_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$act_cont_qty_p);
		p.Dtl_act_cont_qty_p_PPanel.setName("Dtl.act_cont_qty_p");
		p.columnDtl_act_cont_qty = p.Dtl_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_act_cont_qty.addAliasName("Dtl.act_cont_qty", p);
		p.Dtl_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$act_cont_fctr_p);
		p.Dtl_act_cont_fctr_p_PPanel.setName("Dtl.act_cont_fctr_p");
		p.columnDtl_act_cont_fctr = p.Dtl_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnDtl_act_cont_fctr.addAliasName("Dtl.act_cont_fctr", p);
		p.Dtl_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$std_cont_qty_p);
		p.Dtl_std_cont_qty_p_PPanel.setName("Dtl.std_cont_qty_p");
		p.columnDtl_std_cont_qty = p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_std_cont_qty.addAliasName("Dtl.std_cont_qty", p);
		p.Dtl_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$std_cont_fctr_p);
		p.Dtl_std_cont_fctr_p_PPanel.setName("Dtl.std_cont_fctr_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$cont_fctr_unit_p);
		p.Dtl_cont_fctr_unit_p_PPanel.setName("Dtl.cont_fctr_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_ship_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$ship_str_ln_p);
		p.Dtl_ship_str_ln_p_PPanel.setName("Dtl.ship_str_ln_p");
		p.columnDtl_ship_str_ln_cd = p.Dtl_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_ship_str_ln_cd.addAliasName("Dtl.ship_str_ln_cd", p);
		p.columnDtl_ship_str_ln_nm = p.Dtl_ship_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_ship_str_ln_nm.addAliasName("Dtl.ship_str_ln_nm", p);
		p.columnDtl_ship_str_ln_cd_none_flg = p.Dtl_ship_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_ship_str_ln_cd_none_flg.addAliasName("Dtl.ship_str_ln_cd_none_flg", p);
		p.Dtl_dlv_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$dlv_str_ln_p);
		p.Dtl_dlv_str_ln_p_PPanel.setName("Dtl.dlv_str_ln_p");
		p.columnDtl_dlv_str_ln_cd = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_dlv_str_ln_cd.addAliasName("Dtl.dlv_str_ln_cd", p);
		p.columnDtl_dlv_str_ln_nm = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_dlv_str_ln_nm.addAliasName("Dtl.dlv_str_ln_nm", p);
		p.columnDtl_dlv_str_ln_cd_none_flg = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_dlv_str_ln_cd_none_flg.addAliasName("Dtl.dlv_str_ln_cd_none_flg", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno1_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnDtl_sno1_null_flg.addAliasName("Dtl.sno1_null_flg", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno2_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnDtl_sno2_null_flg.addAliasName("Dtl.sno2_null_flg", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno3_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnDtl_sno3_null_flg.addAliasName("Dtl.sno3_null_flg", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_sno4_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnDtl_sno4_null_flg.addAliasName("Dtl.sno4_null_flg", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_alloc_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$alloc_sno_wrk_no_p);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.setName("Dtl.alloc_sno_wrk_no_p");
		p.columnDtl_alloc_sno1 = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_alloc_sno1.addAliasName("Dtl.alloc_sno1", p);
		p.columnDtl_alloc_sno1_null_flg = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnDtl_alloc_sno1_null_flg.addAliasName("Dtl.alloc_sno1_null_flg", p);
		p.columnDtl_alloc_sno2 = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_alloc_sno2.addAliasName("Dtl.alloc_sno2", p);
		p.columnDtl_alloc_sno2_null_flg = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnDtl_alloc_sno2_null_flg.addAliasName("Dtl.alloc_sno2_null_flg", p);
		p.columnDtl_alloc_sno3 = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_alloc_sno3.addAliasName("Dtl.alloc_sno3", p);
		p.columnDtl_alloc_sno3_null_flg = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnDtl_alloc_sno3_null_flg.addAliasName("Dtl.alloc_sno3_null_flg", p);
		p.columnDtl_alloc_sno4 = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_alloc_sno4.addAliasName("Dtl.alloc_sno4", p);
		p.columnDtl_alloc_sno4_null_flg = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnDtl_alloc_sno4_null_flg.addAliasName("Dtl.alloc_sno4_null_flg", p);
		p.columnDtl_alloc_wrk_no = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_alloc_wrk_no.addAliasName("Dtl.alloc_wrk_no", p);
		p.columnDtl_alloc_wrk_nm = p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_alloc_wrk_nm.addAliasName("Dtl.alloc_wrk_nm", p);
		p.Dtl_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP1400.DtlR.$stk_bp_p);
		p.Dtl_stk_bp_p_PPanel.setName("Dtl.stk_bp_p");
		p.columnDtl_stk_bp_cd = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnDtl_stk_bp_cd.addAliasName("Dtl.stk_bp_cd", p);
		p.columnDtl_stk_bp_nm = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnDtl_stk_bp_nm.addAliasName("Dtl.stk_bp_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipInstReg p) {
		p.Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_Btn_open_MSBEP0500_PPanel.setName("Btn.Btn_open_MSBEP0500");
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ShipInstReg p) {
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

	
	/** [Hdr_ship_to_id_typ_ListPutter]の定義 */
	private MCListPutter Hdr_ship_to_id_typ_p = null;

	/**
	 * [Hdr_ship_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_to_id_typ_ListPutter() {
		if (Hdr_ship_to_id_typ_p == null) {
			Hdr_ship_to_id_typ_p = createHdr_ship_to_id_typ_ListPutter(Hdr_ship_to_id_typ, "ship_to_id_typ");

		}
		return Hdr_ship_to_id_typ_p;
	}
	
	
	/** [Hdr_ship_to_id_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_to_id_cd_p = null;

	/**
	 * [Hdr_ship_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_to_id_cd_ListPutter() {
		if (Hdr_ship_to_id_cd_p == null) {
			Hdr_ship_to_id_cd_p = createHdr_ship_to_id_cd_ListPutter(Hdr_ship_to_id_cd, "ship_to_id_cd");

		}
		return Hdr_ship_to_id_cd_p;
	}
	
	
	/** [Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "inst_dpt_cd", "inst_dpt_nm");
		}
		return Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_term_cd_p = null;

	/**
	 * [Hdr_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_term_cd_ListPutter() {
		if (Hdr_ship_term_cd_p == null) {
			Hdr_ship_term_cd_p = createHdr_ship_term_cd_ListPutter(Hdr_ship_term_cd, "ship_term_cd", "ship_term_nm","ship_wk_grp_cd","ship_wk_grp_nm");

		}
		return Hdr_ship_term_cd_p;
	}
	
	
	/** [Hdr_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_wk_cd_p = null;

	/**
	 * [Hdr_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_wk_cd_ListPutter() {
		if (Hdr_ship_wk_cd_p == null) {
			Hdr_ship_wk_cd_p = createHdr_ship_wk_cd_ListPutter(Hdr_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Hdr_ship_wk_cd_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","alloc_ver_no","act_cont_fctr");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "alloc_ver_no","act_cont_fctr");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Dtl_ent_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ent_unit_cd_p = null;

	/**
	 * [Dtl_ent_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ent_unit_cd_ListPutter() {
		if (Dtl_ent_unit_cd_p == null) {
			Dtl_ent_unit_cd_p = createDtl_ent_unit_cd_ListPutter(columnDtl_ent_unit_cd, "ent_unit_cd", "ent_unit_nm","ent_unit_dec_place","ent_unit_rnd_typ","ent_unit_conv_qty","ent_unit_conv_base_qty","unit_dim","unit_wt");

		}
		return Dtl_ent_unit_cd_p;
	}
	
	
	/** [Dtl_pckg_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pckg_unit_cd_p = null;

	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pckg_unit_cd_ListPutter() {
		if (Dtl_pckg_unit_cd_p == null) {
			Dtl_pckg_unit_cd_p = createDtl_pckg_unit_cd_ListPutter(columnDtl_pckg_unit_cd, "pckg_unit_cd");

		}
		return Dtl_pckg_unit_cd_p;
	}
	
	
	/** [Dtl_schd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_schd_unit_cd_p = null;

	/**
	 * [Dtl_schd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_schd_unit_cd_ListPutter() {
		if (Dtl_schd_unit_cd_p == null) {
			Dtl_schd_unit_cd_p = createDtl_schd_unit_cd_ListPutter(columnDtl_schd_unit_cd, "schd_unit_cd");

		}
		return Dtl_schd_unit_cd_p;
	}
	
	
	/** [Dtl_ship_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_loc_cd_p = null;

	/**
	 * [Dtl_ship_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_loc_cd_ListPutter() {
		if (Dtl_ship_loc_cd_p == null) {
			Dtl_ship_loc_cd_p = createDtl_ship_loc_cd_ListPutter(columnDtl_ship_loc_cd, "ship_loc_cd", "ship_loc_nm","ship_str_ln_tgt_flg","ship_site_cd");

		}
		return Dtl_ship_loc_cd_p;
	}
	
	
	/** [Dtl_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl_quality_typ_p = null;

	/**
	 * [Dtl_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_quality_typ_ListPutter() {
		if (Dtl_quality_typ_p == null) {
			Dtl_quality_typ_p = createDtl_quality_typ_ListPutter(columnDtl_quality_typ, "quality_typ");

		}
		return Dtl_quality_typ_p;
	}
	
	
	/** [Dtl_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gd_cd_p = null;

	/**
	 * [Dtl_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gd_cd_ListPutter() {
		if (Dtl_gd_cd_p == null) {
			Dtl_gd_cd_p = createDtl_gd_cd_ListPutter(columnDtl_gd_cd, "gd_cd");

		}
		return Dtl_gd_cd_p;
	}
	
	
	/** [Dtl_trd_ptn_typ_ListPutter]の定義 */
	private MCListPutter Dtl_trd_ptn_typ_p = null;

	/**
	 * [Dtl_trd_ptn_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_ptn_typ_ListPutter() {
		if (Dtl_trd_ptn_typ_p == null) {
			Dtl_trd_ptn_typ_p = createDtl_trd_ptn_typ_ListPutter(columnDtl_trd_ptn_typ, "trd_ptn_typ");

		}
		return Dtl_trd_ptn_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipInstReg create(){
		MSBEP_ShipInstReg p = new MSBEP_ShipInstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipInstReg create(String name){
		MSBEP_ShipInstReg p = new MSBEP_ShipInstReg(name);
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
		MSBEP_ShipInstReg_MC.jbfInitScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitCnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitHdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitHdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitHdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitDtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitBtn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbfInitEastBtn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitCnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitHdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitHdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitHdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitDtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitBtn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.jbInitEastBtn((MSBEP_ShipInstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ship_inst_no_Label = p.beansFactory.createLabel("Cnd.ship_inst_no_Label");
		p.Cnd_ship_inst_no = p.beansFactory.createTextField("Cnd.ship_inst_no");
		p.Cnd_ship_inst_no.setLabel(p.Cnd_ship_inst_no_Label);
		p.Cnd_ship_inst_rev = p.beansFactory.createNumberField("Cnd.ship_inst_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_srch2 = p.beansFactory.createButton("Cnd.srch2", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_ship_fr_lg_grp_cd_Label = p.beansFactory.createLabel("Hdr.ship_fr_lg_grp_cd_Label");
		p.Hdr_ship_fr_lg_grp_cd = p.beansFactory.createTextField("Hdr.ship_fr_lg_grp_cd");
		p.Hdr_ship_fr_lg_grp_cd.setLabel(p.Hdr_ship_fr_lg_grp_cd_Label);
		p.Hdr_ship_fr_lg_grp_nm = p.beansFactory.createTextField("Hdr.ship_fr_lg_grp_nm");
		p.Hdr_ship_inst_no_Label = p.beansFactory.createLabel("Hdr.ship_inst_no_Label");
		p.Hdr_ship_inst_no = p.beansFactory.createTextField("Hdr.ship_inst_no");
		p.Hdr_ship_inst_no.setLabel(p.Hdr_ship_inst_no_Label);
		p.Hdr_ship_inst_rev = p.beansFactory.createNumberField("Hdr.ship_inst_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_ship_schd_time = p.beansFactory.createTextField("Hdr.ship_schd_time");
		p.Hdr_ship_to_id_typ_Label = p.beansFactory.createLabel("Hdr.ship_to_id_typ_Label");
		p.Hdr_ship_to_id_typ = p.beansFactory.createTextComboBox("Hdr.ship_to_id_typ");
		p.Hdr_ship_to_id_typ.setLabel(p.Hdr_ship_to_id_typ_Label);
		p.Hdr_ship_to_id_typ_nm = p.beansFactory.createTextField("Hdr.ship_to_id_typ_nm");
		p.Hdr_ship_to_id_cd_Label = p.beansFactory.createLabel("Hdr.ship_to_id_cd_Label");
		p.Hdr_ship_to_id_cd = p.beansFactory.createTextField("Hdr.ship_to_id_cd");
		p.Hdr_ship_to_id_cd.setLabel(p.Hdr_ship_to_id_cd_Label);
		p.Hdr_ship_to_id_nm = p.beansFactory.createTextField("Hdr.ship_to_id_nm");
		p.Hdr_ship_to_sundry_flg = p.beansFactory.createCheckBox("Hdr.ship_to_sundry_flg");
		p.Hdr_lot_chk_off_flg = p.beansFactory.createCheckBox("Hdr.lot_chk_off_flg");
		p.Hdr_ship_term_cd_Label = p.beansFactory.createLabel("Hdr.ship_term_cd_Label");
		p.Hdr_ship_term_cd = p.beansFactory.createTextComboBox("Hdr.ship_term_cd");
		p.Hdr_ship_term_cd.setLabel(p.Hdr_ship_term_cd_Label);
		p.Hdr_ship_term_nm = p.beansFactory.createTextField("Hdr.ship_term_nm");
		p.Hdr_ship_wk_grp_cd_Label = p.beansFactory.createLabel("Hdr.ship_wk_grp_cd_Label");
		p.Hdr_ship_wk_grp_cd = p.beansFactory.createTextField("Hdr.ship_wk_grp_cd");
		p.Hdr_ship_wk_grp_cd.setLabel(p.Hdr_ship_wk_grp_cd_Label);
		p.Hdr_ship_wk_grp_nm = p.beansFactory.createTextField("Hdr.ship_wk_grp_nm");
		p.Hdr_ship_wk_cd_Label = p.beansFactory.createLabel("Hdr.ship_wk_cd_Label");
		p.Hdr_ship_wk_cd = p.beansFactory.createTextComboBox("Hdr.ship_wk_cd");
		p.Hdr_ship_wk_cd.setLabel(p.Hdr_ship_wk_cd_Label);
		p.Hdr_ship_wk_nm = p.beansFactory.createTextField("Hdr.ship_wk_nm");
		p.Hdr_ship_wt_Label = p.beansFactory.createLabel("Hdr.ship_wt_Label");
		p.Hdr_ship_wt = p.beansFactory.createNumberField("Hdr.ship_wt");
		p.Hdr_ship_wt.setLabel(p.Hdr_ship_wt_Label);
		p.Hdr_ship_dim_Label = p.beansFactory.createLabel("Hdr.ship_dim_Label");
		p.Hdr_ship_dim = p.beansFactory.createNumberField("Hdr.ship_dim");
		p.Hdr_ship_dim.setLabel(p.Hdr_ship_dim_Label);
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_inst_rmrks_Label = p.beansFactory.createLabel("Hdr.inst_rmrks_Label");
		p.Hdr_inst_rmrks = p.beansFactory.createTextField("Hdr.inst_rmrks");
		p.Hdr_inst_rmrks.setLabel(p.Hdr_inst_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_immd_pick_prnt_flg = p.beansFactory.createCheckBox("Hdr.immd_pick_prnt_flg");
		p.Hdr_immd_ship_inst_prnt_flg = p.beansFactory.createCheckBox("Hdr.immd_ship_inst_prnt_flg");
		p.Hdr_immd_dlv_prnt_flg = p.beansFactory.createCheckBox("Hdr.immd_dlv_prnt_flg");
		p.Hdr_immd_ship_adv_prnt_flg = p.beansFactory.createCheckBox("Hdr.immd_ship_adv_prnt_flg");
		p.Hdr_pick_prnt_flg = p.beansFactory.createCheckBox("Hdr.pick_prnt_flg");
		p.Hdr_ship_inst_prnt_flg = p.beansFactory.createCheckBox("Hdr.ship_inst_prnt_flg");
		p.Hdr_dlv_prnt_flg = p.beansFactory.createCheckBox("Hdr.dlv_prnt_flg");
		p.Hdr_ship_adv_prnt_flg = p.beansFactory.createCheckBox("Hdr.ship_adv_prnt_flg");
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
		p.Hdr_ship_inst_upd_cntr = p.beansFactory.createNumberField("Hdr.ship_inst_upd_cntr");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_lot_none_flg = p.beansFactory.createTableColumn("Dtl.lot_none_flg", MCColumnType.CHECK);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_not_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_not_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_ent_unit_cd = p.beansFactory.createTableColumn("Dtl.ent_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ent_unit_nm = p.beansFactory.createTableColumn("Dtl.ent_unit_nm", MCColumnType.TEXT);
		p.columnDtl_ent_unit_dec_place = p.beansFactory.createTableColumn("Dtl.ent_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_ent_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.ent_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_ent_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.ent_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_ent_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.ent_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_schd_abort_flg = p.beansFactory.createTableColumn("Dtl.schd_abort_flg", MCColumnType.CHECK);
		p.columnDtl_inst_abort_flg = p.beansFactory.createTableColumn("Dtl.inst_abort_flg", MCColumnType.CHECK);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.base_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.base_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_ttl_flg = p.beansFactory.createTableColumn("Dtl.ttl_flg", MCColumnType.CHECK);
		p.columnDtl_inst_bndl_flg = p.beansFactory.createTableColumn("Dtl.inst_bndl_flg", MCColumnType.CHECK);
		p.columnDtl_pckg_unit_cd = p.beansFactory.createTableColumn("Dtl.pckg_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pckg_unit_nm = p.beansFactory.createTableColumn("Dtl.pckg_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pckg_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pckg_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pckg_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.pckg_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_pckg_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.pckg_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_pckg_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.pckg_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_schd_unit_cd = p.beansFactory.createTableColumn("Dtl.schd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_schd_unit_nm = p.beansFactory.createTableColumn("Dtl.schd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_schd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.schd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_schd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.schd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_schd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.schd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_schd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.schd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_iv_schd_qty = p.beansFactory.createTableColumn("Dtl.iv_schd_qty", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_unit_dec_place = p.beansFactory.createTableColumn("Dtl.cont_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_alloc_flg = p.beansFactory.createTableColumn("Dtl.alloc_flg", MCColumnType.CHECK);
		p.columnDtl_grp_alloc_flg = p.beansFactory.createTableColumn("Dtl.grp_alloc_flg", MCColumnType.CHECK);
		p.columnDtl_ship_loc_cd = p.beansFactory.createTableColumn("Dtl.ship_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_loc_nm = p.beansFactory.createTableColumn("Dtl.ship_loc_nm", MCColumnType.TEXT);
		p.columnDtl_ship_site_cd = p.beansFactory.createTableColumn("Dtl.ship_site_cd", MCColumnType.TEXT);
		p.columnDtl_ship_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.ship_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.dlv_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ = p.beansFactory.createTableColumn("Dtl.stk_insp_typ", MCColumnType.TEXT);
		p.columnDtl_stk_insp_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnDtl_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_id_typ = p.beansFactory.createTableColumn("Dtl.dlv_id_typ", MCColumnType.TEXT);
		p.columnDtl_dlv_id_typ_nm = p.beansFactory.createTableColumn("Dtl.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_id_cd = p.beansFactory.createTableColumn("Dtl.dlv_id_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_id_nm = p.beansFactory.createTableColumn("Dtl.dlv_id_nm", MCColumnType.TEXT);
		p.columnDtl_alloc_grp_cd = p.beansFactory.createTableColumn("Dtl.alloc_grp_cd", MCColumnType.TEXT);
		p.columnDtl_alloc_grp_nm = p.beansFactory.createTableColumn("Dtl.alloc_grp_nm", MCColumnType.TEXT);
		p.columnDtl_def_loc_cd = p.beansFactory.createTableColumn("Dtl.def_loc_cd", MCColumnType.TEXT);
		p.columnDtl_def_loc_nm = p.beansFactory.createTableColumn("Dtl.def_loc_nm", MCColumnType.TEXT);
		p.columnDtl_ship_loc_prio_flg = p.beansFactory.createTableColumn("Dtl.ship_loc_prio_flg", MCColumnType.CHECK);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT);
		p.columnDtl_rsn_nm = p.beansFactory.createTableColumn("Dtl.rsn_nm", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_pri_prnt_flg = p.beansFactory.createTableColumn("Dtl.pri_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_skip_chk_ship_flg = p.beansFactory.createTableColumn("Dtl.skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnDtl_prov_typ = p.beansFactory.createTableColumn("Dtl.prov_typ", MCColumnType.TEXT);
		p.columnDtl_prov_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prov_basis_typ = p.beansFactory.createTableColumn("Dtl.prov_basis_typ", MCColumnType.TEXT);
		p.columnDtl_prov_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ret_prov_typ = p.beansFactory.createTableColumn("Dtl.ret_prov_typ", MCColumnType.TEXT);
		p.columnDtl_ret_prov_typ_nm = p.beansFactory.createTableColumn("Dtl.ret_prov_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ret_prov_basis_typ = p.beansFactory.createTableColumn("Dtl.ret_prov_basis_typ", MCColumnType.TEXT);
		p.columnDtl_ret_prov_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.ret_prov_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_wms_flg = p.beansFactory.createTableColumn("Dtl.wms_flg", MCColumnType.CHECK);
		p.columnDtl_last_wms_flg = p.beansFactory.createTableColumn("Dtl.last_wms_flg", MCColumnType.CHECK);
		p.columnDtl_wms_tgt_flg = p.beansFactory.createTableColumn("Dtl.wms_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_base_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_base_prov_act_no = p.beansFactory.createTableColumn("Dtl.base_prov_act_no", MCColumnType.TEXT);
		p.columnDtl_base_ac_dt = p.beansFactory.createTableColumn("Dtl.base_ac_dt", MCColumnType.DATE);
		p.columnDtl_ship_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_inst_d_rmrks = p.beansFactory.createTableColumn("Dtl.inst_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_xfr_schd_no = p.beansFactory.createTableColumn("Dtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_no = p.beansFactory.createTableColumn("Dtl.ship_inst_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_d_no = p.beansFactory.createTableColumn("Dtl.ship_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_schd_no = p.beansFactory.createTableColumn("Dtl.ship_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_no = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnDtl_iv_no = p.beansFactory.createTableColumn("Dtl.iv_no", MCColumnType.TEXT);
		p.columnDtl_iv_d_no = p.beansFactory.createTableColumn("Dtl.iv_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_tmp_inst_d_no = p.beansFactory.createTableColumn("Dtl.tmp_inst_d_no", MCColumnType.NUMBER);
		p.columnDtl_ship_pr_no = p.beansFactory.createTableColumn("Dtl.ship_pr_no", MCColumnType.TEXT);
		p.columnDtl_lot_peg_no = p.beansFactory.createTableColumn("Dtl.lot_peg_no", MCColumnType.NUMBER);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_pick_peg_no = p.beansFactory.createTableColumn("Dtl.pick_peg_no", MCColumnType.NUMBER);
		p.columnDtl_xfr_src_typ = p.beansFactory.createTableColumn("Dtl.xfr_src_typ", MCColumnType.TEXT);
		p.columnDtl_iv_trd_flg = p.beansFactory.createTableColumn("Dtl.iv_trd_flg", MCColumnType.CHECK);
		p.columnDtl_cst_iv_flg = p.beansFactory.createTableColumn("Dtl.cst_iv_flg", MCColumnType.CHECK);
		p.columnDtl_cststk_flg = p.beansFactory.createTableColumn("Dtl.cststk_flg", MCColumnType.CHECK);
		p.columnDtl_loan_flg = p.beansFactory.createTableColumn("Dtl.loan_flg", MCColumnType.CHECK);
		p.columnDtl_ship_wt = p.beansFactory.createTableColumn("Dtl.ship_wt", MCColumnType.NUMBER);
		p.columnDtl_ship_dim = p.beansFactory.createTableColumn("Dtl.ship_dim", MCColumnType.NUMBER);
		p.columnDtl_unit_wt = p.beansFactory.createTableColumn("Dtl.unit_wt", MCColumnType.NUMBER);
		p.columnDtl_unit_dim = p.beansFactory.createTableColumn("Dtl.unit_dim", MCColumnType.NUMBER);
		p.columnDtl_vld_dt_fr = p.beansFactory.createTableColumn("Dtl.vld_dt_fr", MCColumnType.DATE);
		p.columnDtl_vld_dt_to = p.beansFactory.createTableColumn("Dtl.vld_dt_to", MCColumnType.DATE);
		p.columnDtl_alloc_scope_typ = p.beansFactory.createTableColumn("Dtl.alloc_scope_typ", MCColumnType.TEXT);
		p.columnDtl_ship_inst_typ = p.beansFactory.createTableColumn("Dtl.ship_inst_typ", MCColumnType.TEXT);
		p.columnDtl_ship_schd_loc_cd = p.beansFactory.createTableColumn("Dtl.ship_schd_loc_cd", MCColumnType.TEXT);
		p.columnDtl_ship_schd_loc_sppl_cd = p.beansFactory.createTableColumn("Dtl.ship_schd_loc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_ship_schd_tm = p.beansFactory.createTableColumn("Dtl.ship_schd_tm", MCColumnType.DATE);
		p.columnDtl_dlv_schd_tm = p.beansFactory.createTableColumn("Dtl.dlv_schd_tm", MCColumnType.DATE);
		p.columnDtl_ship_term_cd = p.beansFactory.createTableColumn("Dtl.ship_term_cd", MCColumnType.TEXT);
		p.columnDtl_no_alloc_flg = p.beansFactory.createTableColumn("Dtl.no_alloc_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0110 = p.beansFactory.createButton("Btn.open_MSBEP0110", "prnt");
		p.Btn_prnt_pick = p.beansFactory.createButton("Btn.prnt_pick", "prnt");
		p.Btn_prnt_inst = p.beansFactory.createButton("Btn.prnt_inst", "prnt");
		p.Btn_prnt_dlv = p.beansFactory.createButton("Btn.prnt_dlv", "prnt");
		p.Btn_prnt_adv = p.beansFactory.createButton("Btn.prnt_adv", "prnt");
		p.Btn_sprt_lot_prop = p.beansFactory.createButton("Btn.sprt_lot_prop");
		p.Btn_sprt_pckg_prop = p.beansFactory.createButton("Btn.sprt_pckg_prop");
		p.Btn_sprt_ac_dt = p.beansFactory.createButton("Btn.sprt_ac_dt");
		p.Btn_select_pckg = p.beansFactory.createCheckBox("Btn.select_pckg");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipInstReg p) {
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
	protected static void jbInitCnd(MSBEP_ShipInstReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1400.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ship_inst_no_Label);
		p.CndPanel.add(p.Cnd_ship_inst_no);
		p.CndPanel.setLastBeans(p.Cnd_ship_inst_no);
		p.Cnd_ship_inst_no.setNextBeans(p.Cnd_ship_inst_rev);
		p.Cnd_ship_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1400.CndR.ship_inst_no_META);
		p.CndPanel.add(p.Cnd_ship_inst_rev);
		p.Cnd_ship_inst_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_ship_inst_rev.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1400.CndR.ship_inst_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1400.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_srch2);
		p.Cnd_srch2.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch2);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_cd);
		p.HdrPanel.setLastBeans(p.Hdr_ship_fr_lg_grp_cd);
		p.Hdr_ship_fr_lg_grp_cd.setNextBeans(p.Hdr_ship_fr_lg_grp_nm);
		p.Hdr_ship_fr_lg_grp_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_fr_lg_grp_cd_META);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_nm);
		p.Hdr_ship_fr_lg_grp_nm.setNextBeans(p.Hdr_ship_inst_no);
		p.Hdr_ship_fr_lg_grp_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_fr_lg_grp_nm_META);
		p.HdrPanel.add(p.Hdr_ship_inst_no_Label);
		p.HdrPanel.add(p.Hdr_ship_inst_no);
		p.Hdr_ship_inst_no.setNextBeans(p.Hdr_ship_inst_rev);
		p.Hdr_ship_inst_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_inst_no_META);
		p.HdrPanel.add(p.Hdr_ship_inst_rev);
		p.Hdr_ship_inst_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_ship_inst_rev.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_inst_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_iv_no);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_ship_inst_ymd_hm_p_PPanel);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_ship_inst_ymd_hm_p_PPanel);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.setNextBeans(p.Hdr_ship_schd_ymd_hm_p_PPanel);
		p.HdrPanel.add(p.Hdr_ship_schd_ymd_hm_p_PPanel);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.setNextBeans(p.Hdr_ship_schd_time);
		p.HdrPanel.add(p.Hdr_ship_schd_time);
		p.Hdr_ship_schd_time.setNextBeans(p.Hdr_dlv_schd_ymd_hm_p_PPanel);
		p.Hdr_ship_schd_time.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_schd_time_META);
		p.HdrPanel.add(p.Hdr_dlv_schd_ymd_hm_p_PPanel);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.setNextBeans(p.Hdr_ship_to_id_typ);
		p.Hdr_ship_to_id_typ.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ_Label);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ);
		p.Hdr_ship_to_id_typ.setNextBeans(p.Hdr_ship_to_id_typ_nm);
		p.Hdr_ship_to_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_to_id_typ_META);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ_nm);
		p.Hdr_ship_to_id_typ_nm.setNextBeans(p.Hdr_ship_to_id_cd);
		p.Hdr_ship_to_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_to_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_ship_to_id_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_to_id_cd);
		p.Hdr_ship_to_id_cd.setNextBeans(p.Hdr_ship_to_id_nm);
		p.Hdr_ship_to_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_to_id_cd_META);
		p.Hdr_ship_to_id_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_ship_to_id_nm);
		p.Hdr_ship_to_id_nm.setNextBeans(p.Hdr_ship_to_addr_p_PPanel);
		p.Hdr_ship_to_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_to_id_nm_META);
		p.HdrPanel.add(p.Hdr_ship_to_addr_p_PPanel);
		p.Hdr_ship_to_addr_p_PPanel.setNextBeans(p.Hdr_ship_to_sundry_flg);
		p.HdrPanel.add(p.Hdr_ship_to_sundry_flg);
		p.Hdr_ship_to_sundry_flg.setNextBeans(p.Hdr_inst_usr_dpt_p_PPanel);
		p.Hdr_ship_to_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_to_sundry_flg_META);
		p.HdrPanel.add(p.Hdr_inst_usr_dpt_p_PPanel);
		p.Hdr_inst_usr_dpt_p_PPanel.setNextBeans(p.Hdr_lot_chk_off_flg);
		p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_inst_dpt_nm);
		p.HdrPanel.add(p.Hdr_lot_chk_off_flg);
		p.Hdr_lot_chk_off_flg.setNextBeans(p.Hdr_ship_term_cd);
		p.Hdr_lot_chk_off_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.lot_chk_off_flg_META);
		p.Hdr_ship_term_cd.setListType(MCListType.STRICT);
		p.Hdr_ship_term_cd.setLinkBeans(p.Hdr_ship_term_nm,p.Hdr_ship_wk_grp_cd,p.Hdr_ship_wk_grp_nm);
		p.HdrPanel.add(p.Hdr_ship_term_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_term_cd);
		p.Hdr_ship_term_cd.setNextBeans(p.Hdr_ship_term_nm);
		p.Hdr_ship_term_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_term_cd_META);
		p.HdrPanel.add(p.Hdr_ship_term_nm);
		p.Hdr_ship_term_nm.setNextBeans(p.Hdr_ship_wk_grp_cd);
		p.Hdr_ship_term_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_term_nm_META);
		p.HdrPanel.add(p.Hdr_ship_wk_grp_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_wk_grp_cd);
		p.Hdr_ship_wk_grp_cd.setNextBeans(p.Hdr_ship_wk_grp_nm);
		p.Hdr_ship_wk_grp_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_wk_grp_cd_META);
		p.HdrPanel.add(p.Hdr_ship_wk_grp_nm);
		p.Hdr_ship_wk_grp_nm.setNextBeans(p.Hdr_ship_wk_cd);
		p.Hdr_ship_wk_grp_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_wk_grp_nm_META);
		p.Hdr_ship_wk_cd.setListType(MCListType.STRICT);
		p.Hdr_ship_wk_cd.setLinkBeans(p.Hdr_ship_wk_nm);
		p.HdrPanel.add(p.Hdr_ship_wk_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_wk_cd);
		p.Hdr_ship_wk_cd.setNextBeans(p.Hdr_ship_wk_nm);
		p.Hdr_ship_wk_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_wk_cd_META);
		p.HdrPanel.add(p.Hdr_ship_wk_nm);
		p.Hdr_ship_wk_nm.setNextBeans(p.Hdr_ship_wt);
		p.Hdr_ship_wk_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_wk_nm_META);
		p.HdrPanel.add(p.Hdr_ship_wt_Label);
		p.HdrPanel.add(p.Hdr_ship_wt);
		p.Hdr_ship_wt.setNextBeans(p.Hdr_ship_dim);
		p.Hdr_ship_wt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_wt_META);
		p.HdrPanel.add(p.Hdr_ship_dim_Label);
		p.HdrPanel.add(p.Hdr_ship_dim);
		p.Hdr_ship_dim.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_ship_dim.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_dim_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_inst_rmrks);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_inst_rmrks_Label);
		p.HdrPanel.add(p.Hdr_inst_rmrks);
		p.Hdr_inst_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_inst_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.inst_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_immd_pick_prnt_flg);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.sub_char3_META);
		p.HdrPanel.add(p.Hdr_immd_pick_prnt_flg);
		p.Hdr_immd_pick_prnt_flg.setNextBeans(p.Hdr_immd_ship_inst_prnt_flg);
		p.Hdr_immd_pick_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.immd_pick_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_immd_ship_inst_prnt_flg);
		p.Hdr_immd_ship_inst_prnt_flg.setNextBeans(p.Hdr_immd_dlv_prnt_flg);
		p.Hdr_immd_ship_inst_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.immd_ship_inst_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_immd_dlv_prnt_flg);
		p.Hdr_immd_dlv_prnt_flg.setNextBeans(p.Hdr_immd_ship_adv_prnt_flg);
		p.Hdr_immd_dlv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.immd_dlv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_immd_ship_adv_prnt_flg);
		p.Hdr_immd_ship_adv_prnt_flg.setNextBeans(p.Hdr_pick_prnt_flg);
		p.Hdr_immd_ship_adv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.immd_ship_adv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_pick_prnt_flg);
		p.Hdr_pick_prnt_flg.setNextBeans(p.Hdr_ship_inst_prnt_flg);
		p.Hdr_pick_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.pick_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_ship_inst_prnt_flg);
		p.Hdr_ship_inst_prnt_flg.setNextBeans(p.Hdr_dlv_prnt_flg);
		p.Hdr_ship_inst_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_inst_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_prnt_flg);
		p.Hdr_dlv_prnt_flg.setNextBeans(p.Hdr_ship_adv_prnt_flg);
		p.Hdr_dlv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.dlv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_ship_adv_prnt_flg);
		p.Hdr_ship_adv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_adv_prnt_flg_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setNextBeans(p.Hdr_ship_inst_upd_cntr);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.upd_srv_req_no_META);
		p.Hdr2Panel.add(p.Hdr_ship_inst_upd_cntr);
		p.Hdr_ship_inst_upd_cntr.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1400.HdrR.ship_inst_upd_cntr_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_ShipInstReg p) {
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
	protected static void jbInitBtn(MSBEP_ShipInstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.BtnPanel.setLastBeans(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setIcon("PRINT");
		p.Btn_open_MSBEP0110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setNextBeans(p.Btn_prnt_pick);
		p.Btn_prnt_pick.setIcon("PRINT");
		p.Btn_prnt_pick.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_prnt_pick);
		p.Btn_prnt_pick.setNextBeans(p.Btn_prnt_inst);
		p.Btn_prnt_inst.setIcon("PRINT");
		p.Btn_prnt_inst.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt_inst);
		p.Btn_prnt_inst.setNextBeans(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setIcon("PRINT");
		p.Btn_prnt_dlv.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_prnt_dlv);
		p.Btn_prnt_dlv.setNextBeans(p.Btn_prnt_adv);
		p.Btn_prnt_adv.setIcon("PRINT");
		p.Btn_prnt_adv.setFunctionKey(MCFunctionKey.F11);
		p.BtnPanel.add(p.Btn_prnt_adv);
		p.Btn_prnt_adv.setNextBeans(p.Btn_sprt_lot_prop);
		p.Btn_sprt_lot_prop.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_sprt_lot_prop);
		p.Btn_sprt_lot_prop.setNextBeans(p.Btn_sprt_pckg_prop);
		p.Btn_sprt_pckg_prop.setFunctionKey(MCFunctionKey.F23);
		p.BtnPanel.add(p.Btn_sprt_pckg_prop);
		p.Btn_sprt_pckg_prop.setNextBeans(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setFunctionKey(MCFunctionKey.F24);
		p.BtnPanel.add(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setNextBeans(p.Btn_select_pckg);
		p.BtnPanel.add(p.Btn_select_pckg);
		p.Btn_select_pckg.setNextBeans(p.Btn_indiv_prnt_flg);
		p.Btn_select_pckg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1400.BtnR.select_pckg_META);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setNextBeans(p.Btn_select_all);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1400.BtnR.indiv_prnt_flg_META);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_ShipInstReg p) {
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
		MSBEP_ShipInstReg_MC.mcInitScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitCnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitHdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitHdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitHdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitDtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitBtn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.mcInitEastBtn((MSBEP_ShipInstReg)this);

		// [INS_NON]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitINS__NON_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS__NON_EastBtn((MSBEP_ShipInstReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitINS_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitINS_EastBtn((MSBEP_ShipInstReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__I_EastBtn((MSBEP_ShipInstReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitSRCH_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitSRCH_EastBtn((MSBEP_ShipInstReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitUPD_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitUPD_EastBtn((MSBEP_ShipInstReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__U_EastBtn((MSBEP_ShipInstReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitDEL_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitDEL_EastBtn((MSBEP_ShipInstReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitFIX__D_EastBtn((MSBEP_ShipInstReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_ShipInstReg_MC.statusInitREF_ScreenOpe((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_Cnd((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_HdrTab((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_Hdr((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_Hdr2((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_ShipSchd__Dtl((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_Btn((MSBEP_ShipInstReg)this);
		MSBEP_ShipInstReg_MC.statusInitREF_EastBtn((MSBEP_ShipInstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipInstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipInstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ship_inst_no.setListListener(p);
		p.Cnd_ship_inst_no.addAllListener(p);
		p.Cnd_ship_inst_rev.setListListener(p);
		p.Cnd_ship_inst_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_srch2.addAllListener(p);
		p.Cnd_srch2.setAPMethodName("doCnd_srch2");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_ShipInstReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_ShipInstReg p) {
		p.Hdr_ship_fr_lg_grp_cd.setListListener(p);
		p.Hdr_ship_fr_lg_grp_cd.addAllListener(p);
		p.Hdr_ship_fr_lg_grp_nm.setListListener(p);
		p.Hdr_ship_fr_lg_grp_nm.addAllListener(p);
		p.Hdr_ship_inst_no.setListListener(p);
		p.Hdr_ship_inst_no.addAllListener(p);
		p.Hdr_ship_inst_rev.setListListener(p);
		p.Hdr_ship_inst_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_ship_schd_time.setListListener(p);
		p.Hdr_ship_schd_time.addAllListener(p);
		p.Hdr_ship_to_id_typ.setListListener(p);
		p.Hdr_ship_to_id_typ.addAllListener(p);
		p.Hdr_ship_to_id_typ_nm.setListListener(p);
		p.Hdr_ship_to_id_typ_nm.addAllListener(p);
		p.Hdr_ship_to_id_cd.setListListener(p);
		p.Hdr_ship_to_id_cd.addAllListener(p);
		p.Hdr_ship_to_id_nm.setListListener(p);
		p.Hdr_ship_to_id_nm.addAllListener(p);
		p.Hdr_ship_to_sundry_flg.addAllListener(p);
		p.Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_lot_chk_off_flg.addAllListener(p);
		p.Hdr_ship_term_cd.setListListener(p);
		p.Hdr_ship_term_cd.addAllListener(p);
		p.Hdr_ship_term_nm.setListListener(p);
		p.Hdr_ship_term_nm.addAllListener(p);
		p.Hdr_ship_wk_grp_cd.setListListener(p);
		p.Hdr_ship_wk_grp_cd.addAllListener(p);
		p.Hdr_ship_wk_grp_nm.setListListener(p);
		p.Hdr_ship_wk_grp_nm.addAllListener(p);
		p.Hdr_ship_wk_cd.setListListener(p);
		p.Hdr_ship_wk_cd.addAllListener(p);
		p.Hdr_ship_wk_nm.setListListener(p);
		p.Hdr_ship_wk_nm.addAllListener(p);
		p.Hdr_ship_wt.setListListener(p);
		p.Hdr_ship_wt.addAllListener(p);
		p.Hdr_ship_dim.setListListener(p);
		p.Hdr_ship_dim.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_inst_rmrks.setListListener(p);
		p.Hdr_inst_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_immd_pick_prnt_flg.addAllListener(p);
		p.Hdr_immd_ship_inst_prnt_flg.addAllListener(p);
		p.Hdr_immd_dlv_prnt_flg.addAllListener(p);
		p.Hdr_immd_ship_adv_prnt_flg.addAllListener(p);
		p.Hdr_pick_prnt_flg.addAllListener(p);
		p.Hdr_ship_inst_prnt_flg.addAllListener(p);
		p.Hdr_dlv_prnt_flg.addAllListener(p);
		p.Hdr_ship_adv_prnt_flg.addAllListener(p);
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
		p.Hdr_ship_inst_upd_cntr.setListListener(p);
		p.Hdr_ship_inst_upd_cntr.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBEP_ShipInstReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_ShipInstReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_lot_none_flg.addAllListener(p);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_not_lot_mix_flg.addAllListener(p);
		p.columnDtl_not_sublot_mix_flg.addAllListener(p);
		p.columnDtl_ent_unit_cd.addAllListener(p);
		p.columnDtl_ent_unit_cd.setListListener(p);
		p.columnDtl_ent_unit_nm.addAllListener(p);
		p.columnDtl_ent_unit_nm.setListListener(p);
		p.columnDtl_ent_unit_dec_place.addAllListener(p);
		p.columnDtl_ent_unit_dec_place.setListListener(p);
		p.columnDtl_ent_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_ent_unit_conv_base_qty.setListListener(p);
		p.columnDtl_ent_unit_conv_qty.addAllListener(p);
		p.columnDtl_ent_unit_conv_qty.setListListener(p);
		p.columnDtl_ent_unit_rnd_typ.addAllListener(p);
		p.columnDtl_ent_unit_rnd_typ.setListListener(p);
		p.columnDtl_schd_abort_flg.addAllListener(p);
		p.columnDtl_inst_abort_flg.addAllListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_base_unit_conv_base_qty.setListListener(p);
		p.columnDtl_base_unit_conv_qty.addAllListener(p);
		p.columnDtl_base_unit_conv_qty.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_ttl_flg.addAllListener(p);
		p.columnDtl_inst_bndl_flg.addAllListener(p);
		p.columnDtl_pckg_unit_cd.addAllListener(p);
		p.columnDtl_pckg_unit_cd.setListListener(p);
		p.columnDtl_pckg_unit_nm.addAllListener(p);
		p.columnDtl_pckg_unit_nm.setListListener(p);
		p.columnDtl_pckg_unit_dec_place.addAllListener(p);
		p.columnDtl_pckg_unit_dec_place.setListListener(p);
		p.columnDtl_pckg_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_pckg_unit_conv_base_qty.setListListener(p);
		p.columnDtl_pckg_unit_conv_qty.addAllListener(p);
		p.columnDtl_pckg_unit_conv_qty.setListListener(p);
		p.columnDtl_pckg_unit_rnd_typ.addAllListener(p);
		p.columnDtl_pckg_unit_rnd_typ.setListListener(p);
		p.columnDtl_schd_unit_cd.addAllListener(p);
		p.columnDtl_schd_unit_cd.setListListener(p);
		p.columnDtl_schd_unit_nm.addAllListener(p);
		p.columnDtl_schd_unit_nm.setListListener(p);
		p.columnDtl_schd_unit_dec_place.addAllListener(p);
		p.columnDtl_schd_unit_dec_place.setListListener(p);
		p.columnDtl_schd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_schd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_schd_unit_conv_qty.addAllListener(p);
		p.columnDtl_schd_unit_conv_qty.setListListener(p);
		p.columnDtl_schd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_schd_unit_rnd_typ.setListListener(p);
		p.columnDtl_iv_schd_qty.addAllListener(p);
		p.columnDtl_iv_schd_qty.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_unit_dec_place.addAllListener(p);
		p.columnDtl_cont_unit_dec_place.setListListener(p);
		p.columnDtl_cont_unit_rnd_typ.addAllListener(p);
		p.columnDtl_cont_unit_rnd_typ.setListListener(p);
		p.columnDtl_alloc_flg.addAllListener(p);
		p.columnDtl_grp_alloc_flg.addAllListener(p);
		p.columnDtl_ship_loc_cd.addAllListener(p);
		p.columnDtl_ship_loc_cd.setListListener(p);
		p.columnDtl_ship_loc_nm.addAllListener(p);
		p.columnDtl_ship_loc_nm.setListListener(p);
		p.columnDtl_ship_site_cd.addAllListener(p);
		p.columnDtl_ship_site_cd.setListListener(p);
		p.columnDtl_ship_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_dlv_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_stk_insp_typ.addAllListener(p);
		p.columnDtl_stk_insp_typ.setListListener(p);
		p.columnDtl_stk_insp_typ_nm.addAllListener(p);
		p.columnDtl_stk_insp_typ_nm.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl_dlv_id_typ.addAllListener(p);
		p.columnDtl_dlv_id_typ.setListListener(p);
		p.columnDtl_dlv_id_typ_nm.addAllListener(p);
		p.columnDtl_dlv_id_typ_nm.setListListener(p);
		p.columnDtl_dlv_id_cd.addAllListener(p);
		p.columnDtl_dlv_id_cd.setListListener(p);
		p.columnDtl_dlv_id_nm.addAllListener(p);
		p.columnDtl_dlv_id_nm.setListListener(p);
		p.columnDtl_alloc_grp_cd.addAllListener(p);
		p.columnDtl_alloc_grp_cd.setListListener(p);
		p.columnDtl_alloc_grp_nm.addAllListener(p);
		p.columnDtl_alloc_grp_nm.setListListener(p);
		p.columnDtl_def_loc_cd.addAllListener(p);
		p.columnDtl_def_loc_cd.setListListener(p);
		p.columnDtl_def_loc_nm.addAllListener(p);
		p.columnDtl_def_loc_nm.setListListener(p);
		p.columnDtl_ship_loc_prio_flg.addAllListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_rsn_nm.addAllListener(p);
		p.columnDtl_rsn_nm.setListListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.columnDtl_pri_prnt_flg.addAllListener(p);
		p.columnDtl_skip_chk_ship_flg.addAllListener(p);
		p.columnDtl_prov_typ.addAllListener(p);
		p.columnDtl_prov_typ.setListListener(p);
		p.columnDtl_prov_typ_nm.addAllListener(p);
		p.columnDtl_prov_typ_nm.setListListener(p);
		p.columnDtl_prov_basis_typ.addAllListener(p);
		p.columnDtl_prov_basis_typ.setListListener(p);
		p.columnDtl_prov_basis_typ_nm.addAllListener(p);
		p.columnDtl_prov_basis_typ_nm.setListListener(p);
		p.columnDtl_ret_prov_typ.addAllListener(p);
		p.columnDtl_ret_prov_typ.setListListener(p);
		p.columnDtl_ret_prov_typ_nm.addAllListener(p);
		p.columnDtl_ret_prov_typ_nm.setListListener(p);
		p.columnDtl_ret_prov_basis_typ.addAllListener(p);
		p.columnDtl_ret_prov_basis_typ.setListListener(p);
		p.columnDtl_ret_prov_basis_typ_nm.addAllListener(p);
		p.columnDtl_ret_prov_basis_typ_nm.setListListener(p);
		p.columnDtl_wms_flg.addAllListener(p);
		p.columnDtl_last_wms_flg.addAllListener(p);
		p.columnDtl_wms_tgt_flg.addAllListener(p);
		p.columnDtl_base_dlv_slip_no.addAllListener(p);
		p.columnDtl_base_dlv_slip_no.setListListener(p);
		p.columnDtl_base_prov_act_no.addAllListener(p);
		p.columnDtl_base_prov_act_no.setListListener(p);
		p.columnDtl_base_ac_dt.addAllListener(p);
		p.columnDtl_base_ac_dt.setListListener(p);
		p.columnDtl_ship_cnt_rmrks.addAllListener(p);
		p.columnDtl_ship_cnt_rmrks.setListListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_inst_d_rmrks.addAllListener(p);
		p.columnDtl_inst_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_xfr_schd_no.addAllListener(p);
		p.columnDtl_xfr_schd_no.setListListener(p);
		p.columnDtl_ship_inst_no.addAllListener(p);
		p.columnDtl_ship_inst_no.setListListener(p);
		p.columnDtl_ship_inst_d_no.addAllListener(p);
		p.columnDtl_ship_inst_d_no.setListListener(p);
		p.columnDtl_ship_schd_no.addAllListener(p);
		p.columnDtl_ship_schd_no.setListListener(p);
		p.columnDtl_ship_alloc_sts_no.addAllListener(p);
		p.columnDtl_ship_alloc_sts_no.setListListener(p);
		p.columnDtl_iv_no.addAllListener(p);
		p.columnDtl_iv_no.setListListener(p);
		p.columnDtl_iv_d_no.addAllListener(p);
		p.columnDtl_iv_d_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.setListListener(p);
		p.columnDtl_tmp_inst_d_no.addAllListener(p);
		p.columnDtl_tmp_inst_d_no.setListListener(p);
		p.columnDtl_ship_pr_no.addAllListener(p);
		p.columnDtl_ship_pr_no.setListListener(p);
		p.columnDtl_lot_peg_no.addAllListener(p);
		p.columnDtl_lot_peg_no.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_pick_peg_no.addAllListener(p);
		p.columnDtl_pick_peg_no.setListListener(p);
		p.columnDtl_xfr_src_typ.addAllListener(p);
		p.columnDtl_xfr_src_typ.setListListener(p);
		p.columnDtl_iv_trd_flg.addAllListener(p);
		p.columnDtl_cst_iv_flg.addAllListener(p);
		p.columnDtl_cststk_flg.addAllListener(p);
		p.columnDtl_loan_flg.addAllListener(p);
		p.columnDtl_ship_wt.addAllListener(p);
		p.columnDtl_ship_wt.setListListener(p);
		p.columnDtl_ship_dim.addAllListener(p);
		p.columnDtl_ship_dim.setListListener(p);
		p.columnDtl_unit_wt.addAllListener(p);
		p.columnDtl_unit_wt.setListListener(p);
		p.columnDtl_unit_dim.addAllListener(p);
		p.columnDtl_unit_dim.setListListener(p);
		p.columnDtl_vld_dt_fr.addAllListener(p);
		p.columnDtl_vld_dt_fr.setListListener(p);
		p.columnDtl_vld_dt_to.addAllListener(p);
		p.columnDtl_vld_dt_to.setListListener(p);
		p.columnDtl_alloc_scope_typ.addAllListener(p);
		p.columnDtl_alloc_scope_typ.setListListener(p);
		p.columnDtl_ship_inst_typ.addAllListener(p);
		p.columnDtl_ship_inst_typ.setListListener(p);
		p.columnDtl_ship_schd_loc_cd.addAllListener(p);
		p.columnDtl_ship_schd_loc_cd.setListListener(p);
		p.columnDtl_ship_schd_loc_sppl_cd.addAllListener(p);
		p.columnDtl_ship_schd_loc_sppl_cd.setListListener(p);
		p.columnDtl_ship_schd_tm.addAllListener(p);
		p.columnDtl_ship_schd_tm.setListListener(p);
		p.columnDtl_dlv_schd_tm.addAllListener(p);
		p.columnDtl_dlv_schd_tm.setListListener(p);
		p.columnDtl_ship_term_cd.addAllListener(p);
		p.columnDtl_ship_term_cd.setListListener(p);
		p.columnDtl_no_alloc_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipInstReg p) {
		p.Btn_open_MSBEP0110.addAllListener(p);
		p.Btn_open_MSBEP0110.setAPMethodName("doBtn_open_MSBEP0110");
		p.Btn_prnt_pick.addAllListener(p);
		p.Btn_prnt_pick.setAPMethodName("doBtn_prnt_pick");
		p.Btn_prnt_inst.addAllListener(p);
		p.Btn_prnt_inst.setAPMethodName("doBtn_prnt_inst");
		p.Btn_prnt_dlv.addAllListener(p);
		p.Btn_prnt_dlv.setAPMethodName("doBtn_prnt_dlv");
		p.Btn_prnt_adv.addAllListener(p);
		p.Btn_prnt_adv.setAPMethodName("doBtn_prnt_adv");
		p.Btn_sprt_lot_prop.addAllListener(p);
		p.Btn_sprt_lot_prop.setAPMethodName("doBtn_sprt_lot_prop");
		p.Btn_sprt_pckg_prop.addAllListener(p);
		p.Btn_sprt_pckg_prop.setAPMethodName("doBtn_sprt_pckg_prop");
		p.Btn_sprt_ac_dt.addAllListener(p);
		p.Btn_sprt_ac_dt.setAPMethodName("doBtn_sprt_ac_dt");
		p.Btn_select_pckg.addAllListener(p);
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ShipInstReg p) {
	}

	/**
	 * [INS_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, INS_NON, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_ship_inst_rev.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_srch2.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_upd_cntr.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_inst_abort_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_iv_schd_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_upd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS_NON, MCMode.DISABLE);

	}

	/**
	 * [INS_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ship_inst_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch2.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ship_schd_time.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ship_to_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_term_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_term_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_wk_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_inst_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_immd_pick_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_pick_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ent_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_schd_abort_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_inst_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_inst_bndl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_iv_schd_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_grp_alloc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ship_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_quality_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_prov_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_last_wms_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_inst_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_pckg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_ship_inst_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_schd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_iv_schd_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ship_term_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_inst_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_immd_pick_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pick_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.ENABLE);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ent_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_schd_abort_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_grp_alloc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.columnDtl_quality_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_prov_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_last_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inst_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_pckg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_last_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_pick.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_inst.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_dlv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_adv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_lot_prop.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_ShipInstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_ShipInstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_inst_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_inst_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_srch2.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_ShipInstReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_ShipInstReg p){
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_inst_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_inst_ymd_hm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_ymd_hm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_schd_time.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_schd_ymd_hm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_wk_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_wk_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_wk_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_wk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_immd_pick_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_immd_ship_inst_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_immd_dlv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_immd_ship_adv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pick_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_inst_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_ship_inst_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBEP_ShipInstReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBEP_ShipInstReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.INVISIBLE);
		p.Dtl_alloc_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ent_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ent_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ent_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_abort_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_inst_abort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_ttl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_bndl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pckg_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_pckg_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_schd_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_schd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_schd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_iv_schd_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ship_act_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_grp_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ship_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_alloc_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_insp_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_prio_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ret_prov_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_last_wms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wms_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_tmp_inst_d_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_pr_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pick_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xfr_src_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loan_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_dim.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_wt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_fr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_vld_dt_to.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alloc_scope_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_tm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_schd_tm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_no_alloc_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ShipSchd_Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipSchd__Dtl(MSBEP_ShipInstReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_ShipInstReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_pick.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_inst.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_dlv.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_adv.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_lot_prop.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sprt_pckg_prop.putMode(p, REF, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_pckg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_ShipInstReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS_NON;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_ShipInstReg_MC.setTableConfigDtl((MSBEP_ShipInstReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_ShipInstReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cst_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_lot_none_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.lot_none_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_none_flg);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtl_sublot_no, p.columnDtl_alloc_ver_no, p.columnDtl_act_cont_fctr);
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtl_alloc_ver_no, p.columnDtl_act_cont_fctr);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.DtlTable.addTable(p.Dtl_alloc_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.not_lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_lot_mix_flg);
		p.columnDtl_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.not_sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_sublot_mix_flg);
		p.columnDtl_ent_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_cd_META);
		p.columnDtl_ent_unit_cd.addLinkBeans(p.columnDtl_ent_unit_nm,p.columnDtl_ent_unit_dec_place,p.columnDtl_ent_unit_rnd_typ,p.columnDtl_ent_unit_conv_qty,p.columnDtl_ent_unit_conv_base_qty,p.columnDtl_unit_dim,p.columnDtl_unit_wt);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_cd);
		p.columnDtl_ent_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_nm);
		p.columnDtl_ent_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_dec_place);
		p.columnDtl_ent_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_conv_base_qty);
		p.columnDtl_ent_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_conv_qty);
		p.columnDtl_ent_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ent_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ent_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_ent_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_schd_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_abort_flg);
		p.columnDtl_inst_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.inst_abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_abort_flg);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_conv_base_qty);
		p.columnDtl_base_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_conv_qty);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_ttl_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ttl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ttl_flg);
		p.columnDtl_inst_bndl_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.inst_bndl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_bndl_flg);
		p.columnDtl_pckg_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_cd);
		p.columnDtl_pckg_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_nm);
		p.columnDtl_pckg_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_dec_place);
		p.columnDtl_pckg_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_conv_base_qty);
		p.columnDtl_pckg_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_conv_qty);
		p.columnDtl_pckg_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pckg_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_pckg_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_schd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_cd);
		p.columnDtl_schd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_nm);
		p.columnDtl_schd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_dec_place);
		p.columnDtl_schd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_conv_base_qty);
		p.columnDtl_schd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_conv_qty);
		p.columnDtl_schd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.schd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_schd_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_schd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_iv_schd_qty.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.iv_schd_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_schd_qty);
		p.DtlTable.addTable(p.Dtl_ship_act_qty_p_PPanel.QtyTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.DtlTable.addTable(p.Dtl_act_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.DtlTable.addTable(p.Dtl_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlTable.addTable(p.Dtl_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtl_cont_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cont_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_unit_dec_place);
		p.columnDtl_cont_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cont_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_unit_rnd_typ);
		p.columnDtl_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_flg);
		p.columnDtl_grp_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.grp_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_grp_alloc_flg);
		p.columnDtl_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_loc_cd_META);
		p.columnDtl_ship_loc_cd.addLinkBeans(p.columnDtl_ship_loc_nm,p.columnDtl_ship_str_ln_tgt_flg,p.columnDtl_ship_site_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_cd);
		p.columnDtl_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_nm);
		p.columnDtl_ship_site_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_site_cd);
		p.columnDtl_ship_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_str_ln_tgt_flg);
		p.DtlTable.addTable(p.Dtl_ship_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_dlv_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_str_ln_tgt_flg);
		p.DtlTable.addTable(p.Dtl_dlv_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.quality_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.gd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.DtlTable.addTable(p.Dtl_alloc_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_insp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ);
		p.columnDtl_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_insp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_insp_typ_nm);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.columnDtl_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_arrv_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_cd);
		p.columnDtl_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.stk_arrv_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_nm);
		p.DtlTable.addTable(p.Dtl_stk_bp_p_PPanel.StkBpTable);
		p.columnDtl_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_typ);
		p.columnDtl_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_typ_nm);
		p.columnDtl_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_id_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_cd);
		p.columnDtl_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_id_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_nm);
		p.columnDtl_alloc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.alloc_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_cd);
		p.columnDtl_alloc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.alloc_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_grp_nm);
		p.columnDtl_def_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.def_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_loc_cd);
		p.columnDtl_def_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.def_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_loc_nm);
		p.columnDtl_ship_loc_prio_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_loc_prio_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_prio_flg);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.rsn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_nm);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.bd_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.columnDtl_pri_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pri_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pri_prnt_flg);
		p.columnDtl_skip_chk_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.skip_chk_ship_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_skip_chk_ship_flg);
		p.columnDtl_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.prov_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ);
		p.columnDtl_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.prov_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_typ_nm);
		p.columnDtl_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.prov_basis_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ);
		p.columnDtl_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.prov_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_basis_typ_nm);
		p.columnDtl_ret_prov_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ret_prov_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_typ);
		p.columnDtl_ret_prov_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ret_prov_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_typ_nm);
		p.columnDtl_ret_prov_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ret_prov_basis_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_basis_typ);
		p.columnDtl_ret_prov_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ret_prov_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ret_prov_basis_typ_nm);
		p.columnDtl_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.wms_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wms_flg);
		p.columnDtl_last_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.last_wms_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_last_wms_flg);
		p.columnDtl_wms_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.wms_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wms_tgt_flg);
		p.columnDtl_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dlv_slip_no);
		p.columnDtl_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_prov_act_no);
		p.columnDtl_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.base_ac_dt_META);
		p.columnDtl_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_ac_dt);
		p.columnDtl_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_cnt_rmrks);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_inst_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.inst_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.xfr_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_schd_no);
		p.columnDtl_ship_inst_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_no);
		p.columnDtl_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_d_no);
		p.columnDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_no);
		p.columnDtl_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_alloc_sts_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_no);
		p.columnDtl_iv_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_no);
		p.columnDtl_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.iv_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_d_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_fr_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_fr_lg_grp_cd);
		p.columnDtl_tmp_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.tmp_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tmp_inst_d_no);
		p.columnDtl_ship_pr_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_pr_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_pr_no);
		p.columnDtl_lot_peg_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.lot_peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_peg_no);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_pick_peg_no.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.pick_peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pick_peg_no);
		p.columnDtl_xfr_src_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.xfr_src_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_src_typ);
		p.columnDtl_iv_trd_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.iv_trd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_trd_flg);
		p.columnDtl_cst_iv_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cst_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_iv_flg);
		p.columnDtl_cststk_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.cststk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cststk_flg);
		p.columnDtl_loan_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.loan_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loan_flg);
		p.columnDtl_ship_wt.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wt);
		p.columnDtl_ship_dim.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dim);
		p.columnDtl_unit_wt.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.unit_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_wt);
		p.columnDtl_unit_dim.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.unit_dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_dim);
		p.columnDtl_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.vld_dt_fr_META);
		p.columnDtl_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_vld_dt_fr);
		p.columnDtl_vld_dt_to.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.vld_dt_to_META);
		p.columnDtl_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_vld_dt_to);
		p.columnDtl_alloc_scope_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.alloc_scope_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_scope_typ);
		p.columnDtl_ship_inst_typ.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_inst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_typ);
		p.columnDtl_ship_schd_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_schd_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_loc_cd);
		p.columnDtl_ship_schd_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_schd_loc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_loc_sppl_cd);
		p.columnDtl_ship_schd_tm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_schd_tm_META);
		p.columnDtl_ship_schd_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_tm);
		p.columnDtl_dlv_schd_tm.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.dlv_schd_tm_META);
		p.columnDtl_dlv_schd_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_schd_tm);
		p.columnDtl_ship_term_cd.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.ship_term_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_term_cd);
		p.columnDtl_no_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1400.DtlR.no_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_no_alloc_flg);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Hdr_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_to_id_typ.getListConfig().setPutter(getHdr_ship_to_id_typ_ListPutter());
		Hdr_ship_to_id_cd.getListConfig().setPutter(getHdr_ship_to_id_cd_ListPutter());
		Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_term_cd.getListConfig().setPutter(getHdr_ship_term_cd_ListPutter());
		Hdr_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_wk_cd.getListConfig().setPutter(getHdr_ship_wk_cd_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtl_ent_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ent_unit_cd.getListConfig().setPutter(getDtl_ent_unit_cd_ListPutter());
		columnDtl_pckg_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pckg_unit_cd.getListConfig().setPutter(getDtl_pckg_unit_cd_ListPutter());
		columnDtl_schd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_schd_unit_cd.getListConfig().setPutter(getDtl_schd_unit_cd_ListPutter());
		columnDtl_ship_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_loc_cd.getListConfig().setPutter(getDtl_ship_loc_cd_ListPutter());
		columnDtl_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_quality_typ.getListConfig().setPutter(getDtl_quality_typ_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		columnDtl_trd_ptn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_ptn_typ.getListConfig().setPutter(getDtl_trd_ptn_typ_ListPutter());
	}

	/**
	 * この画面を[INS_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_NONStatus() {
		status = INS_NON;
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
		if (INS_NON.equals(status)) {
			setINS_NONStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
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
	 * [Hdr_ship_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_ship_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Hdr_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [Dtl_ent_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ent_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pckg_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_schd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_schd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_ptn_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_ptn_typ_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Hdr_ship_to_id_typ) return getHdr_ship_to_id_typ(row, info);
		if(combo == Hdr_ship_to_id_cd) return getHdr_ship_to_id_cd(row, info);
		if(combo == Hdr_inst_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_ship_term_cd) return getHdr_ship_term_cd(row, info);
		if(combo == Hdr_ship_wk_cd) return getHdr_ship_wk_cd(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_lot_no) return getDtl_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtl_ent_unit_cd) return getDtl_ent_unit_cd(row, info);
		if(combo == columnDtl_pckg_unit_cd) return getDtl_pckg_unit_cd(row, info);
		if(combo == columnDtl_schd_unit_cd) return getDtl_schd_unit_cd(row, info);
		if(combo == columnDtl_ship_loc_cd) return getDtl_ship_loc_cd(row, info);
		if(combo == columnDtl_quality_typ) return getDtl_quality_typ(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == columnDtl_trd_ptn_typ) return getDtl_trd_ptn_typ(row, info);
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
		else if (ap == Cnd_srch2) doCnd_srch2(info);
		else if (ap == Btn_open_MSBEP0110) doBtn_open_MSBEP0110(info);
		else if (ap == Btn_prnt_pick) doBtn_prnt_pick(info);
		else if (ap == Btn_prnt_inst) doBtn_prnt_inst(info);
		else if (ap == Btn_prnt_dlv) doBtn_prnt_dlv(info);
		else if (ap == Btn_prnt_adv) doBtn_prnt_adv(info);
		else if (ap == Btn_sprt_lot_prop) doBtn_sprt_lot_prop(info);
		else if (ap == Btn_sprt_pckg_prop) doBtn_sprt_pckg_prop(info);
		else if (ap == Btn_sprt_ac_dt) doBtn_sprt_ac_dt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch2(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_pick]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_pick(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_inst]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_inst(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dlv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dlv(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_adv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_adv(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_lot_prop]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_lot_prop(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_pckg_prop]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_pckg_prop(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_ac_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_ac_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == Cnd_ship_inst_no) return doCnd_ship_inst_no_VC(info);
		if (vc == Cnd_ship_inst_rev) return doCnd_ship_inst_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_ship_fr_lg_grp_cd) return doHdr_ship_fr_lg_grp_cd_VC(info);
		if (vc == Hdr_ship_fr_lg_grp_nm) return doHdr_ship_fr_lg_grp_nm_VC(info);
		if (vc == Hdr_ship_inst_no) return doHdr_ship_inst_no_VC(info);
		if (vc == Hdr_ship_inst_rev) return doHdr_ship_inst_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_ship_schd_time) return doHdr_ship_schd_time_VC(info);
		if (vc == Hdr_ship_to_id_typ) return doHdr_ship_to_id_typ_VC(info);
		if (vc == Hdr_ship_to_id_typ_nm) return doHdr_ship_to_id_typ_nm_VC(info);
		if (vc == Hdr_ship_to_id_cd) return doHdr_ship_to_id_cd_VC(info);
		if (vc == Hdr_ship_to_id_nm) return doHdr_ship_to_id_nm_VC(info);
		if (vc == Hdr_ship_to_sundry_flg) return doHdr_ship_to_sundry_flg_VC(info);
		if (vc == Hdr_lot_chk_off_flg) return doHdr_lot_chk_off_flg_VC(info);
		if (vc == Hdr_ship_term_cd) return doHdr_ship_term_cd_VC(info);
		if (vc == Hdr_ship_term_nm) return doHdr_ship_term_nm_VC(info);
		if (vc == Hdr_ship_wk_grp_cd) return doHdr_ship_wk_grp_cd_VC(info);
		if (vc == Hdr_ship_wk_grp_nm) return doHdr_ship_wk_grp_nm_VC(info);
		if (vc == Hdr_ship_wk_cd) return doHdr_ship_wk_cd_VC(info);
		if (vc == Hdr_ship_wk_nm) return doHdr_ship_wk_nm_VC(info);
		if (vc == Hdr_ship_wt) return doHdr_ship_wt_VC(info);
		if (vc == Hdr_ship_dim) return doHdr_ship_dim_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_inst_rmrks) return doHdr_inst_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_immd_pick_prnt_flg) return doHdr_immd_pick_prnt_flg_VC(info);
		if (vc == Hdr_immd_ship_inst_prnt_flg) return doHdr_immd_ship_inst_prnt_flg_VC(info);
		if (vc == Hdr_immd_dlv_prnt_flg) return doHdr_immd_dlv_prnt_flg_VC(info);
		if (vc == Hdr_immd_ship_adv_prnt_flg) return doHdr_immd_ship_adv_prnt_flg_VC(info);
		if (vc == Hdr_pick_prnt_flg) return doHdr_pick_prnt_flg_VC(info);
		if (vc == Hdr_ship_inst_prnt_flg) return doHdr_ship_inst_prnt_flg_VC(info);
		if (vc == Hdr_dlv_prnt_flg) return doHdr_dlv_prnt_flg_VC(info);
		if (vc == Hdr_ship_adv_prnt_flg) return doHdr_ship_adv_prnt_flg_VC(info);
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
		if (vc == Hdr_ship_inst_upd_cntr) return doHdr_ship_inst_upd_cntr_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_lot_none_flg) return doDtl_lot_none_flg_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_not_lot_mix_flg) return doDtl_not_lot_mix_flg_VC(info);
		if (vc == columnDtl_not_sublot_mix_flg) return doDtl_not_sublot_mix_flg_VC(info);
		if (vc == columnDtl_ent_unit_cd) return doDtl_ent_unit_cd_VC(info);
		if (vc == columnDtl_ent_unit_nm) return doDtl_ent_unit_nm_VC(info);
		if (vc == columnDtl_ent_unit_dec_place) return doDtl_ent_unit_dec_place_VC(info);
		if (vc == columnDtl_ent_unit_conv_base_qty) return doDtl_ent_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_ent_unit_conv_qty) return doDtl_ent_unit_conv_qty_VC(info);
		if (vc == columnDtl_ent_unit_rnd_typ) return doDtl_ent_unit_rnd_typ_VC(info);
		if (vc == columnDtl_schd_abort_flg) return doDtl_schd_abort_flg_VC(info);
		if (vc == columnDtl_inst_abort_flg) return doDtl_inst_abort_flg_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_conv_base_qty) return doDtl_base_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_base_unit_conv_qty) return doDtl_base_unit_conv_qty_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_ttl_flg) return doDtl_ttl_flg_VC(info);
		if (vc == columnDtl_inst_bndl_flg) return doDtl_inst_bndl_flg_VC(info);
		if (vc == columnDtl_pckg_unit_cd) return doDtl_pckg_unit_cd_VC(info);
		if (vc == columnDtl_pckg_unit_nm) return doDtl_pckg_unit_nm_VC(info);
		if (vc == columnDtl_pckg_unit_dec_place) return doDtl_pckg_unit_dec_place_VC(info);
		if (vc == columnDtl_pckg_unit_conv_base_qty) return doDtl_pckg_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_pckg_unit_conv_qty) return doDtl_pckg_unit_conv_qty_VC(info);
		if (vc == columnDtl_pckg_unit_rnd_typ) return doDtl_pckg_unit_rnd_typ_VC(info);
		if (vc == columnDtl_schd_unit_cd) return doDtl_schd_unit_cd_VC(info);
		if (vc == columnDtl_schd_unit_nm) return doDtl_schd_unit_nm_VC(info);
		if (vc == columnDtl_schd_unit_dec_place) return doDtl_schd_unit_dec_place_VC(info);
		if (vc == columnDtl_schd_unit_conv_base_qty) return doDtl_schd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_schd_unit_conv_qty) return doDtl_schd_unit_conv_qty_VC(info);
		if (vc == columnDtl_schd_unit_rnd_typ) return doDtl_schd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_iv_schd_qty) return doDtl_iv_schd_qty_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_unit_dec_place) return doDtl_cont_unit_dec_place_VC(info);
		if (vc == columnDtl_cont_unit_rnd_typ) return doDtl_cont_unit_rnd_typ_VC(info);
		if (vc == columnDtl_alloc_flg) return doDtl_alloc_flg_VC(info);
		if (vc == columnDtl_grp_alloc_flg) return doDtl_grp_alloc_flg_VC(info);
		if (vc == columnDtl_ship_loc_cd) return doDtl_ship_loc_cd_VC(info);
		if (vc == columnDtl_ship_loc_nm) return doDtl_ship_loc_nm_VC(info);
		if (vc == columnDtl_ship_site_cd) return doDtl_ship_site_cd_VC(info);
		if (vc == columnDtl_ship_str_ln_tgt_flg) return doDtl_ship_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_dlv_str_ln_tgt_flg) return doDtl_dlv_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_stk_insp_typ) return doDtl_stk_insp_typ_VC(info);
		if (vc == columnDtl_stk_insp_typ_nm) return doDtl_stk_insp_typ_nm_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_stk_arrv_bp_cd) return doDtl_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl_stk_arrv_bp_nm) return doDtl_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl_dlv_id_typ) return doDtl_dlv_id_typ_VC(info);
		if (vc == columnDtl_dlv_id_typ_nm) return doDtl_dlv_id_typ_nm_VC(info);
		if (vc == columnDtl_dlv_id_cd) return doDtl_dlv_id_cd_VC(info);
		if (vc == columnDtl_dlv_id_nm) return doDtl_dlv_id_nm_VC(info);
		if (vc == columnDtl_alloc_grp_cd) return doDtl_alloc_grp_cd_VC(info);
		if (vc == columnDtl_alloc_grp_nm) return doDtl_alloc_grp_nm_VC(info);
		if (vc == columnDtl_def_loc_cd) return doDtl_def_loc_cd_VC(info);
		if (vc == columnDtl_def_loc_nm) return doDtl_def_loc_nm_VC(info);
		if (vc == columnDtl_ship_loc_prio_flg) return doDtl_ship_loc_prio_flg_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_rsn_nm) return doDtl_rsn_nm_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_pri_prnt_flg) return doDtl_pri_prnt_flg_VC(info);
		if (vc == columnDtl_skip_chk_ship_flg) return doDtl_skip_chk_ship_flg_VC(info);
		if (vc == columnDtl_prov_typ) return doDtl_prov_typ_VC(info);
		if (vc == columnDtl_prov_typ_nm) return doDtl_prov_typ_nm_VC(info);
		if (vc == columnDtl_prov_basis_typ) return doDtl_prov_basis_typ_VC(info);
		if (vc == columnDtl_prov_basis_typ_nm) return doDtl_prov_basis_typ_nm_VC(info);
		if (vc == columnDtl_ret_prov_typ) return doDtl_ret_prov_typ_VC(info);
		if (vc == columnDtl_ret_prov_typ_nm) return doDtl_ret_prov_typ_nm_VC(info);
		if (vc == columnDtl_ret_prov_basis_typ) return doDtl_ret_prov_basis_typ_VC(info);
		if (vc == columnDtl_ret_prov_basis_typ_nm) return doDtl_ret_prov_basis_typ_nm_VC(info);
		if (vc == columnDtl_wms_flg) return doDtl_wms_flg_VC(info);
		if (vc == columnDtl_last_wms_flg) return doDtl_last_wms_flg_VC(info);
		if (vc == columnDtl_wms_tgt_flg) return doDtl_wms_tgt_flg_VC(info);
		if (vc == columnDtl_base_dlv_slip_no) return doDtl_base_dlv_slip_no_VC(info);
		if (vc == columnDtl_base_prov_act_no) return doDtl_base_prov_act_no_VC(info);
		if (vc == columnDtl_base_ac_dt) return doDtl_base_ac_dt_VC(info);
		if (vc == columnDtl_ship_cnt_rmrks) return doDtl_ship_cnt_rmrks_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_inst_d_rmrks) return doDtl_inst_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_xfr_schd_no) return doDtl_xfr_schd_no_VC(info);
		if (vc == columnDtl_ship_inst_no) return doDtl_ship_inst_no_VC(info);
		if (vc == columnDtl_ship_inst_d_no) return doDtl_ship_inst_d_no_VC(info);
		if (vc == columnDtl_ship_schd_no) return doDtl_ship_schd_no_VC(info);
		if (vc == columnDtl_ship_alloc_sts_no) return doDtl_ship_alloc_sts_no_VC(info);
		if (vc == columnDtl_iv_no) return doDtl_iv_no_VC(info);
		if (vc == columnDtl_iv_d_no) return doDtl_iv_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_ship_fr_lg_grp_cd) return doDtl_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnDtl_tmp_inst_d_no) return doDtl_tmp_inst_d_no_VC(info);
		if (vc == columnDtl_ship_pr_no) return doDtl_ship_pr_no_VC(info);
		if (vc == columnDtl_lot_peg_no) return doDtl_lot_peg_no_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_pick_peg_no) return doDtl_pick_peg_no_VC(info);
		if (vc == columnDtl_xfr_src_typ) return doDtl_xfr_src_typ_VC(info);
		if (vc == columnDtl_iv_trd_flg) return doDtl_iv_trd_flg_VC(info);
		if (vc == columnDtl_cst_iv_flg) return doDtl_cst_iv_flg_VC(info);
		if (vc == columnDtl_cststk_flg) return doDtl_cststk_flg_VC(info);
		if (vc == columnDtl_loan_flg) return doDtl_loan_flg_VC(info);
		if (vc == columnDtl_ship_wt) return doDtl_ship_wt_VC(info);
		if (vc == columnDtl_ship_dim) return doDtl_ship_dim_VC(info);
		if (vc == columnDtl_unit_wt) return doDtl_unit_wt_VC(info);
		if (vc == columnDtl_unit_dim) return doDtl_unit_dim_VC(info);
		if (vc == columnDtl_vld_dt_fr) return doDtl_vld_dt_fr_VC(info);
		if (vc == columnDtl_vld_dt_to) return doDtl_vld_dt_to_VC(info);
		if (vc == columnDtl_alloc_scope_typ) return doDtl_alloc_scope_typ_VC(info);
		if (vc == columnDtl_ship_inst_typ) return doDtl_ship_inst_typ_VC(info);
		if (vc == columnDtl_ship_schd_loc_cd) return doDtl_ship_schd_loc_cd_VC(info);
		if (vc == columnDtl_ship_schd_loc_sppl_cd) return doDtl_ship_schd_loc_sppl_cd_VC(info);
		if (vc == columnDtl_ship_schd_tm) return doDtl_ship_schd_tm_VC(info);
		if (vc == columnDtl_dlv_schd_tm) return doDtl_dlv_schd_tm_VC(info);
		if (vc == columnDtl_ship_term_cd) return doDtl_ship_term_cd_VC(info);
		if (vc == columnDtl_no_alloc_flg) return doDtl_no_alloc_flg_VC(info);
		if (vc == Btn_select_pckg) return doBtn_select_pckg_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
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
	 * [Cnd]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_inst_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_inst_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_schd_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_schd_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_chk_off_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wk_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inst_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inst_rmrks_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[immd_pick_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_immd_pick_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[immd_ship_inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_immd_ship_inst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_immd_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[immd_ship_adv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_immd_ship_adv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pick_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pick_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_inst_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_inst_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_adv_prnt_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_inst_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_inst_upd_cntr_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ent_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ent_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ttl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ttl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_bndl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_bndl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pckg_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pckg_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[schd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_schd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_schd_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_schd_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[grp_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_grp_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_prio_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_prio_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_skip_chk_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ret_prov_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[last_wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_last_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wms_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wms_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[inst_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_d_rmrks_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tmp_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tmp_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pick_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pick_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_src_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cststk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loan_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loan_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_scope_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_scope_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_schd_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_schd_tm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[no_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_no_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[select_pckg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_select_pckg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_ship_inst_no) doCnd_ship_inst_no_NC(info);
		else if (nc == Cnd_ship_inst_rev) doCnd_ship_inst_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NC(info);
		else if (nc == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NC(info);
		else if (nc == Hdr_ship_inst_no) doHdr_ship_inst_no_NC(info);
		else if (nc == Hdr_ship_inst_rev) doHdr_ship_inst_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_ship_schd_time) doHdr_ship_schd_time_NC(info);
		else if (nc == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NC(info);
		else if (nc == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NC(info);
		else if (nc == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NC(info);
		else if (nc == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NC(info);
		else if (nc == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NC(info);
		else if (nc == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NC(info);
		else if (nc == Hdr_ship_term_cd) doHdr_ship_term_cd_NC(info);
		else if (nc == Hdr_ship_term_nm) doHdr_ship_term_nm_NC(info);
		else if (nc == Hdr_ship_wk_grp_cd) doHdr_ship_wk_grp_cd_NC(info);
		else if (nc == Hdr_ship_wk_grp_nm) doHdr_ship_wk_grp_nm_NC(info);
		else if (nc == Hdr_ship_wk_cd) doHdr_ship_wk_cd_NC(info);
		else if (nc == Hdr_ship_wk_nm) doHdr_ship_wk_nm_NC(info);
		else if (nc == Hdr_ship_wt) doHdr_ship_wt_NC(info);
		else if (nc == Hdr_ship_dim) doHdr_ship_dim_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_inst_rmrks) doHdr_inst_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_immd_pick_prnt_flg) doHdr_immd_pick_prnt_flg_NC(info);
		else if (nc == Hdr_immd_ship_inst_prnt_flg) doHdr_immd_ship_inst_prnt_flg_NC(info);
		else if (nc == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NC(info);
		else if (nc == Hdr_immd_ship_adv_prnt_flg) doHdr_immd_ship_adv_prnt_flg_NC(info);
		else if (nc == Hdr_pick_prnt_flg) doHdr_pick_prnt_flg_NC(info);
		else if (nc == Hdr_ship_inst_prnt_flg) doHdr_ship_inst_prnt_flg_NC(info);
		else if (nc == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NC(info);
		else if (nc == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NC(info);
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
		else if (nc == Hdr_ship_inst_upd_cntr) doHdr_ship_inst_upd_cntr_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_lot_none_flg) doDtl_lot_none_flg_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NC(info);
		else if (nc == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_ent_unit_cd) doDtl_ent_unit_cd_NC(info);
		else if (nc == columnDtl_ent_unit_nm) doDtl_ent_unit_nm_NC(info);
		else if (nc == columnDtl_ent_unit_dec_place) doDtl_ent_unit_dec_place_NC(info);
		else if (nc == columnDtl_ent_unit_conv_base_qty) doDtl_ent_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_ent_unit_conv_qty) doDtl_ent_unit_conv_qty_NC(info);
		else if (nc == columnDtl_ent_unit_rnd_typ) doDtl_ent_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_schd_abort_flg) doDtl_schd_abort_flg_NC(info);
		else if (nc == columnDtl_inst_abort_flg) doDtl_inst_abort_flg_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_conv_base_qty) doDtl_base_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_ttl_flg) doDtl_ttl_flg_NC(info);
		else if (nc == columnDtl_inst_bndl_flg) doDtl_inst_bndl_flg_NC(info);
		else if (nc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NC(info);
		else if (nc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NC(info);
		else if (nc == columnDtl_pckg_unit_dec_place) doDtl_pckg_unit_dec_place_NC(info);
		else if (nc == columnDtl_pckg_unit_conv_base_qty) doDtl_pckg_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_pckg_unit_conv_qty) doDtl_pckg_unit_conv_qty_NC(info);
		else if (nc == columnDtl_pckg_unit_rnd_typ) doDtl_pckg_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_schd_unit_cd) doDtl_schd_unit_cd_NC(info);
		else if (nc == columnDtl_schd_unit_nm) doDtl_schd_unit_nm_NC(info);
		else if (nc == columnDtl_schd_unit_dec_place) doDtl_schd_unit_dec_place_NC(info);
		else if (nc == columnDtl_schd_unit_conv_base_qty) doDtl_schd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_schd_unit_conv_qty) doDtl_schd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_schd_unit_rnd_typ) doDtl_schd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_iv_schd_qty) doDtl_iv_schd_qty_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_unit_dec_place) doDtl_cont_unit_dec_place_NC(info);
		else if (nc == columnDtl_cont_unit_rnd_typ) doDtl_cont_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_alloc_flg) doDtl_alloc_flg_NC(info);
		else if (nc == columnDtl_grp_alloc_flg) doDtl_grp_alloc_flg_NC(info);
		else if (nc == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NC(info);
		else if (nc == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NC(info);
		else if (nc == columnDtl_ship_site_cd) doDtl_ship_site_cd_NC(info);
		else if (nc == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NC(info);
		else if (nc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NC(info);
		else if (nc == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NC(info);
		else if (nc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NC(info);
		else if (nc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NC(info);
		else if (nc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NC(info);
		else if (nc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NC(info);
		else if (nc == columnDtl_def_loc_cd) doDtl_def_loc_cd_NC(info);
		else if (nc == columnDtl_def_loc_nm) doDtl_def_loc_nm_NC(info);
		else if (nc == columnDtl_ship_loc_prio_flg) doDtl_ship_loc_prio_flg_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_rsn_nm) doDtl_rsn_nm_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NC(info);
		else if (nc == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NC(info);
		else if (nc == columnDtl_prov_typ) doDtl_prov_typ_NC(info);
		else if (nc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NC(info);
		else if (nc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NC(info);
		else if (nc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NC(info);
		else if (nc == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NC(info);
		else if (nc == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NC(info);
		else if (nc == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NC(info);
		else if (nc == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NC(info);
		else if (nc == columnDtl_wms_flg) doDtl_wms_flg_NC(info);
		else if (nc == columnDtl_last_wms_flg) doDtl_last_wms_flg_NC(info);
		else if (nc == columnDtl_wms_tgt_flg) doDtl_wms_tgt_flg_NC(info);
		else if (nc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NC(info);
		else if (nc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NC(info);
		else if (nc == columnDtl_base_ac_dt) doDtl_base_ac_dt_NC(info);
		else if (nc == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_inst_d_rmrks) doDtl_inst_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NC(info);
		else if (nc == columnDtl_ship_inst_no) doDtl_ship_inst_no_NC(info);
		else if (nc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NC(info);
		else if (nc == columnDtl_ship_schd_no) doDtl_ship_schd_no_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NC(info);
		else if (nc == columnDtl_iv_no) doDtl_iv_no_NC(info);
		else if (nc == columnDtl_iv_d_no) doDtl_iv_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnDtl_tmp_inst_d_no) doDtl_tmp_inst_d_no_NC(info);
		else if (nc == columnDtl_ship_pr_no) doDtl_ship_pr_no_NC(info);
		else if (nc == columnDtl_lot_peg_no) doDtl_lot_peg_no_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_pick_peg_no) doDtl_pick_peg_no_NC(info);
		else if (nc == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NC(info);
		else if (nc == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NC(info);
		else if (nc == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NC(info);
		else if (nc == columnDtl_cststk_flg) doDtl_cststk_flg_NC(info);
		else if (nc == columnDtl_loan_flg) doDtl_loan_flg_NC(info);
		else if (nc == columnDtl_ship_wt) doDtl_ship_wt_NC(info);
		else if (nc == columnDtl_ship_dim) doDtl_ship_dim_NC(info);
		else if (nc == columnDtl_unit_wt) doDtl_unit_wt_NC(info);
		else if (nc == columnDtl_unit_dim) doDtl_unit_dim_NC(info);
		else if (nc == columnDtl_vld_dt_fr) doDtl_vld_dt_fr_NC(info);
		else if (nc == columnDtl_vld_dt_to) doDtl_vld_dt_to_NC(info);
		else if (nc == columnDtl_alloc_scope_typ) doDtl_alloc_scope_typ_NC(info);
		else if (nc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NC(info);
		else if (nc == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NC(info);
		else if (nc == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NC(info);
		else if (nc == columnDtl_ship_schd_tm) doDtl_ship_schd_tm_NC(info);
		else if (nc == columnDtl_dlv_schd_tm) doDtl_dlv_schd_tm_NC(info);
		else if (nc == columnDtl_ship_term_cd) doDtl_ship_term_cd_NC(info);
		else if (nc == columnDtl_no_alloc_flg) doDtl_no_alloc_flg_NC(info);
		else if (nc == Btn_select_pckg) doBtn_select_pckg_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_schd_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_schd_time_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_rmrks_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[immd_pick_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_pick_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_inst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_adv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_adv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pick_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pick_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_inst_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ttl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ttl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_bndl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_bndl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_schd_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_schd_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grp_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grp_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_prio_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_prio_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_d_rmrks_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pick_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pick_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_scope_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_scope_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_tm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_pckg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_pckg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_ship_inst_no) doCnd_ship_inst_no_NE(info);
		else if (ne == Cnd_ship_inst_rev) doCnd_ship_inst_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NE(info);
		else if (ne == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NE(info);
		else if (ne == Hdr_ship_inst_no) doHdr_ship_inst_no_NE(info);
		else if (ne == Hdr_ship_inst_rev) doHdr_ship_inst_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_ship_schd_time) doHdr_ship_schd_time_NE(info);
		else if (ne == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NE(info);
		else if (ne == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NE(info);
		else if (ne == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NE(info);
		else if (ne == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NE(info);
		else if (ne == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NE(info);
		else if (ne == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NE(info);
		else if (ne == Hdr_ship_term_cd) doHdr_ship_term_cd_NE(info);
		else if (ne == Hdr_ship_term_nm) doHdr_ship_term_nm_NE(info);
		else if (ne == Hdr_ship_wk_grp_cd) doHdr_ship_wk_grp_cd_NE(info);
		else if (ne == Hdr_ship_wk_grp_nm) doHdr_ship_wk_grp_nm_NE(info);
		else if (ne == Hdr_ship_wk_cd) doHdr_ship_wk_cd_NE(info);
		else if (ne == Hdr_ship_wk_nm) doHdr_ship_wk_nm_NE(info);
		else if (ne == Hdr_ship_wt) doHdr_ship_wt_NE(info);
		else if (ne == Hdr_ship_dim) doHdr_ship_dim_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_inst_rmrks) doHdr_inst_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_immd_pick_prnt_flg) doHdr_immd_pick_prnt_flg_NE(info);
		else if (ne == Hdr_immd_ship_inst_prnt_flg) doHdr_immd_ship_inst_prnt_flg_NE(info);
		else if (ne == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NE(info);
		else if (ne == Hdr_immd_ship_adv_prnt_flg) doHdr_immd_ship_adv_prnt_flg_NE(info);
		else if (ne == Hdr_pick_prnt_flg) doHdr_pick_prnt_flg_NE(info);
		else if (ne == Hdr_ship_inst_prnt_flg) doHdr_ship_inst_prnt_flg_NE(info);
		else if (ne == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NE(info);
		else if (ne == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NE(info);
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
		else if (ne == Hdr_ship_inst_upd_cntr) doHdr_ship_inst_upd_cntr_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_lot_none_flg) doDtl_lot_none_flg_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NE(info);
		else if (ne == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_ent_unit_cd) doDtl_ent_unit_cd_NE(info);
		else if (ne == columnDtl_ent_unit_nm) doDtl_ent_unit_nm_NE(info);
		else if (ne == columnDtl_ent_unit_dec_place) doDtl_ent_unit_dec_place_NE(info);
		else if (ne == columnDtl_ent_unit_conv_base_qty) doDtl_ent_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_ent_unit_conv_qty) doDtl_ent_unit_conv_qty_NE(info);
		else if (ne == columnDtl_ent_unit_rnd_typ) doDtl_ent_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_schd_abort_flg) doDtl_schd_abort_flg_NE(info);
		else if (ne == columnDtl_inst_abort_flg) doDtl_inst_abort_flg_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_conv_base_qty) doDtl_base_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_ttl_flg) doDtl_ttl_flg_NE(info);
		else if (ne == columnDtl_inst_bndl_flg) doDtl_inst_bndl_flg_NE(info);
		else if (ne == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NE(info);
		else if (ne == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NE(info);
		else if (ne == columnDtl_pckg_unit_dec_place) doDtl_pckg_unit_dec_place_NE(info);
		else if (ne == columnDtl_pckg_unit_conv_base_qty) doDtl_pckg_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_pckg_unit_conv_qty) doDtl_pckg_unit_conv_qty_NE(info);
		else if (ne == columnDtl_pckg_unit_rnd_typ) doDtl_pckg_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_schd_unit_cd) doDtl_schd_unit_cd_NE(info);
		else if (ne == columnDtl_schd_unit_nm) doDtl_schd_unit_nm_NE(info);
		else if (ne == columnDtl_schd_unit_dec_place) doDtl_schd_unit_dec_place_NE(info);
		else if (ne == columnDtl_schd_unit_conv_base_qty) doDtl_schd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_schd_unit_conv_qty) doDtl_schd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_schd_unit_rnd_typ) doDtl_schd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_iv_schd_qty) doDtl_iv_schd_qty_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_unit_dec_place) doDtl_cont_unit_dec_place_NE(info);
		else if (ne == columnDtl_cont_unit_rnd_typ) doDtl_cont_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_alloc_flg) doDtl_alloc_flg_NE(info);
		else if (ne == columnDtl_grp_alloc_flg) doDtl_grp_alloc_flg_NE(info);
		else if (ne == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NE(info);
		else if (ne == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NE(info);
		else if (ne == columnDtl_ship_site_cd) doDtl_ship_site_cd_NE(info);
		else if (ne == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NE(info);
		else if (ne == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NE(info);
		else if (ne == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NE(info);
		else if (ne == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NE(info);
		else if (ne == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NE(info);
		else if (ne == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NE(info);
		else if (ne == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NE(info);
		else if (ne == columnDtl_def_loc_cd) doDtl_def_loc_cd_NE(info);
		else if (ne == columnDtl_def_loc_nm) doDtl_def_loc_nm_NE(info);
		else if (ne == columnDtl_ship_loc_prio_flg) doDtl_ship_loc_prio_flg_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_rsn_nm) doDtl_rsn_nm_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NE(info);
		else if (ne == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NE(info);
		else if (ne == columnDtl_prov_typ) doDtl_prov_typ_NE(info);
		else if (ne == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NE(info);
		else if (ne == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NE(info);
		else if (ne == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NE(info);
		else if (ne == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NE(info);
		else if (ne == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NE(info);
		else if (ne == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NE(info);
		else if (ne == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NE(info);
		else if (ne == columnDtl_wms_flg) doDtl_wms_flg_NE(info);
		else if (ne == columnDtl_last_wms_flg) doDtl_last_wms_flg_NE(info);
		else if (ne == columnDtl_wms_tgt_flg) doDtl_wms_tgt_flg_NE(info);
		else if (ne == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NE(info);
		else if (ne == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NE(info);
		else if (ne == columnDtl_base_ac_dt) doDtl_base_ac_dt_NE(info);
		else if (ne == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_inst_d_rmrks) doDtl_inst_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NE(info);
		else if (ne == columnDtl_ship_inst_no) doDtl_ship_inst_no_NE(info);
		else if (ne == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NE(info);
		else if (ne == columnDtl_ship_schd_no) doDtl_ship_schd_no_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NE(info);
		else if (ne == columnDtl_iv_no) doDtl_iv_no_NE(info);
		else if (ne == columnDtl_iv_d_no) doDtl_iv_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnDtl_tmp_inst_d_no) doDtl_tmp_inst_d_no_NE(info);
		else if (ne == columnDtl_ship_pr_no) doDtl_ship_pr_no_NE(info);
		else if (ne == columnDtl_lot_peg_no) doDtl_lot_peg_no_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_pick_peg_no) doDtl_pick_peg_no_NE(info);
		else if (ne == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NE(info);
		else if (ne == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NE(info);
		else if (ne == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NE(info);
		else if (ne == columnDtl_cststk_flg) doDtl_cststk_flg_NE(info);
		else if (ne == columnDtl_loan_flg) doDtl_loan_flg_NE(info);
		else if (ne == columnDtl_ship_wt) doDtl_ship_wt_NE(info);
		else if (ne == columnDtl_ship_dim) doDtl_ship_dim_NE(info);
		else if (ne == columnDtl_unit_wt) doDtl_unit_wt_NE(info);
		else if (ne == columnDtl_unit_dim) doDtl_unit_dim_NE(info);
		else if (ne == columnDtl_vld_dt_fr) doDtl_vld_dt_fr_NE(info);
		else if (ne == columnDtl_vld_dt_to) doDtl_vld_dt_to_NE(info);
		else if (ne == columnDtl_alloc_scope_typ) doDtl_alloc_scope_typ_NE(info);
		else if (ne == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NE(info);
		else if (ne == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NE(info);
		else if (ne == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NE(info);
		else if (ne == columnDtl_ship_schd_tm) doDtl_ship_schd_tm_NE(info);
		else if (ne == columnDtl_dlv_schd_tm) doDtl_dlv_schd_tm_NE(info);
		else if (ne == columnDtl_ship_term_cd) doDtl_ship_term_cd_NE(info);
		else if (ne == columnDtl_no_alloc_flg) doDtl_no_alloc_flg_NE(info);
		else if (ne == Btn_select_pckg) doBtn_select_pckg_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_schd_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_schd_time_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_rmrks_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[immd_pick_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_pick_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_inst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_adv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_adv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pick_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pick_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_inst_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ttl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ttl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_bndl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_bndl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_schd_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_schd_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grp_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grp_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_prio_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_prio_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_d_rmrks_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pick_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pick_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_scope_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_scope_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_tm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_pckg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_pckg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_ship_inst_no) doCnd_ship_inst_no_NX(info);
		else if (nx == Cnd_ship_inst_rev) doCnd_ship_inst_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NX(info);
		else if (nx == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NX(info);
		else if (nx == Hdr_ship_inst_no) doHdr_ship_inst_no_NX(info);
		else if (nx == Hdr_ship_inst_rev) doHdr_ship_inst_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_ship_schd_time) doHdr_ship_schd_time_NX(info);
		else if (nx == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NX(info);
		else if (nx == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NX(info);
		else if (nx == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NX(info);
		else if (nx == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NX(info);
		else if (nx == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NX(info);
		else if (nx == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NX(info);
		else if (nx == Hdr_ship_term_cd) doHdr_ship_term_cd_NX(info);
		else if (nx == Hdr_ship_term_nm) doHdr_ship_term_nm_NX(info);
		else if (nx == Hdr_ship_wk_grp_cd) doHdr_ship_wk_grp_cd_NX(info);
		else if (nx == Hdr_ship_wk_grp_nm) doHdr_ship_wk_grp_nm_NX(info);
		else if (nx == Hdr_ship_wk_cd) doHdr_ship_wk_cd_NX(info);
		else if (nx == Hdr_ship_wk_nm) doHdr_ship_wk_nm_NX(info);
		else if (nx == Hdr_ship_wt) doHdr_ship_wt_NX(info);
		else if (nx == Hdr_ship_dim) doHdr_ship_dim_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_inst_rmrks) doHdr_inst_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_immd_pick_prnt_flg) doHdr_immd_pick_prnt_flg_NX(info);
		else if (nx == Hdr_immd_ship_inst_prnt_flg) doHdr_immd_ship_inst_prnt_flg_NX(info);
		else if (nx == Hdr_immd_dlv_prnt_flg) doHdr_immd_dlv_prnt_flg_NX(info);
		else if (nx == Hdr_immd_ship_adv_prnt_flg) doHdr_immd_ship_adv_prnt_flg_NX(info);
		else if (nx == Hdr_pick_prnt_flg) doHdr_pick_prnt_flg_NX(info);
		else if (nx == Hdr_ship_inst_prnt_flg) doHdr_ship_inst_prnt_flg_NX(info);
		else if (nx == Hdr_dlv_prnt_flg) doHdr_dlv_prnt_flg_NX(info);
		else if (nx == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NX(info);
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
		else if (nx == Hdr_ship_inst_upd_cntr) doHdr_ship_inst_upd_cntr_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_lot_none_flg) doDtl_lot_none_flg_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NX(info);
		else if (nx == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_ent_unit_cd) doDtl_ent_unit_cd_NX(info);
		else if (nx == columnDtl_ent_unit_nm) doDtl_ent_unit_nm_NX(info);
		else if (nx == columnDtl_ent_unit_dec_place) doDtl_ent_unit_dec_place_NX(info);
		else if (nx == columnDtl_ent_unit_conv_base_qty) doDtl_ent_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_ent_unit_conv_qty) doDtl_ent_unit_conv_qty_NX(info);
		else if (nx == columnDtl_ent_unit_rnd_typ) doDtl_ent_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_schd_abort_flg) doDtl_schd_abort_flg_NX(info);
		else if (nx == columnDtl_inst_abort_flg) doDtl_inst_abort_flg_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_conv_base_qty) doDtl_base_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_ttl_flg) doDtl_ttl_flg_NX(info);
		else if (nx == columnDtl_inst_bndl_flg) doDtl_inst_bndl_flg_NX(info);
		else if (nx == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NX(info);
		else if (nx == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NX(info);
		else if (nx == columnDtl_pckg_unit_dec_place) doDtl_pckg_unit_dec_place_NX(info);
		else if (nx == columnDtl_pckg_unit_conv_base_qty) doDtl_pckg_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_pckg_unit_conv_qty) doDtl_pckg_unit_conv_qty_NX(info);
		else if (nx == columnDtl_pckg_unit_rnd_typ) doDtl_pckg_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_schd_unit_cd) doDtl_schd_unit_cd_NX(info);
		else if (nx == columnDtl_schd_unit_nm) doDtl_schd_unit_nm_NX(info);
		else if (nx == columnDtl_schd_unit_dec_place) doDtl_schd_unit_dec_place_NX(info);
		else if (nx == columnDtl_schd_unit_conv_base_qty) doDtl_schd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_schd_unit_conv_qty) doDtl_schd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_schd_unit_rnd_typ) doDtl_schd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_iv_schd_qty) doDtl_iv_schd_qty_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_unit_dec_place) doDtl_cont_unit_dec_place_NX(info);
		else if (nx == columnDtl_cont_unit_rnd_typ) doDtl_cont_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_alloc_flg) doDtl_alloc_flg_NX(info);
		else if (nx == columnDtl_grp_alloc_flg) doDtl_grp_alloc_flg_NX(info);
		else if (nx == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NX(info);
		else if (nx == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NX(info);
		else if (nx == columnDtl_ship_site_cd) doDtl_ship_site_cd_NX(info);
		else if (nx == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_NX(info);
		else if (nx == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NX(info);
		else if (nx == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NX(info);
		else if (nx == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NX(info);
		else if (nx == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NX(info);
		else if (nx == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_NX(info);
		else if (nx == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_NX(info);
		else if (nx == columnDtl_def_loc_cd) doDtl_def_loc_cd_NX(info);
		else if (nx == columnDtl_def_loc_nm) doDtl_def_loc_nm_NX(info);
		else if (nx == columnDtl_ship_loc_prio_flg) doDtl_ship_loc_prio_flg_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_rsn_nm) doDtl_rsn_nm_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NX(info);
		else if (nx == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NX(info);
		else if (nx == columnDtl_prov_typ) doDtl_prov_typ_NX(info);
		else if (nx == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_NX(info);
		else if (nx == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_NX(info);
		else if (nx == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_NX(info);
		else if (nx == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_NX(info);
		else if (nx == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_NX(info);
		else if (nx == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_NX(info);
		else if (nx == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_NX(info);
		else if (nx == columnDtl_wms_flg) doDtl_wms_flg_NX(info);
		else if (nx == columnDtl_last_wms_flg) doDtl_last_wms_flg_NX(info);
		else if (nx == columnDtl_wms_tgt_flg) doDtl_wms_tgt_flg_NX(info);
		else if (nx == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NX(info);
		else if (nx == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NX(info);
		else if (nx == columnDtl_base_ac_dt) doDtl_base_ac_dt_NX(info);
		else if (nx == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_inst_d_rmrks) doDtl_inst_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NX(info);
		else if (nx == columnDtl_ship_inst_no) doDtl_ship_inst_no_NX(info);
		else if (nx == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NX(info);
		else if (nx == columnDtl_ship_schd_no) doDtl_ship_schd_no_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NX(info);
		else if (nx == columnDtl_iv_no) doDtl_iv_no_NX(info);
		else if (nx == columnDtl_iv_d_no) doDtl_iv_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnDtl_tmp_inst_d_no) doDtl_tmp_inst_d_no_NX(info);
		else if (nx == columnDtl_ship_pr_no) doDtl_ship_pr_no_NX(info);
		else if (nx == columnDtl_lot_peg_no) doDtl_lot_peg_no_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_pick_peg_no) doDtl_pick_peg_no_NX(info);
		else if (nx == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_NX(info);
		else if (nx == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NX(info);
		else if (nx == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NX(info);
		else if (nx == columnDtl_cststk_flg) doDtl_cststk_flg_NX(info);
		else if (nx == columnDtl_loan_flg) doDtl_loan_flg_NX(info);
		else if (nx == columnDtl_ship_wt) doDtl_ship_wt_NX(info);
		else if (nx == columnDtl_ship_dim) doDtl_ship_dim_NX(info);
		else if (nx == columnDtl_unit_wt) doDtl_unit_wt_NX(info);
		else if (nx == columnDtl_unit_dim) doDtl_unit_dim_NX(info);
		else if (nx == columnDtl_vld_dt_fr) doDtl_vld_dt_fr_NX(info);
		else if (nx == columnDtl_vld_dt_to) doDtl_vld_dt_to_NX(info);
		else if (nx == columnDtl_alloc_scope_typ) doDtl_alloc_scope_typ_NX(info);
		else if (nx == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NX(info);
		else if (nx == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NX(info);
		else if (nx == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NX(info);
		else if (nx == columnDtl_ship_schd_tm) doDtl_ship_schd_tm_NX(info);
		else if (nx == columnDtl_dlv_schd_tm) doDtl_dlv_schd_tm_NX(info);
		else if (nx == columnDtl_ship_term_cd) doDtl_ship_term_cd_NX(info);
		else if (nx == columnDtl_no_alloc_flg) doDtl_no_alloc_flg_NX(info);
		else if (nx == Btn_select_pckg) doBtn_select_pckg_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
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
	 * [Cnd]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_schd_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_schd_time_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_rmrks_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[immd_pick_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_pick_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_inst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[immd_ship_adv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_immd_ship_adv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pick_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pick_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_inst_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ttl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ttl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_bndl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_bndl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_schd_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_schd_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[grp_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_grp_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_prio_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_prio_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[last_wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_last_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_d_rmrks_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pick_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pick_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_scope_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_scope_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_tm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[select_pckg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_select_pckg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ship_inst_no) doCnd_ship_inst_no_LC(info);
		else if (lc == Cnd_ship_inst_rev) doCnd_ship_inst_rev_LC(info);
		else if (lc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_LC(info);
		else if (lc == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_LC(info);
		else if (lc == Hdr_ship_inst_no) doHdr_ship_inst_no_LC(info);
		else if (lc == Hdr_ship_inst_rev) doHdr_ship_inst_rev_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_ship_schd_time) doHdr_ship_schd_time_LC(info);
		else if (lc == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_LC(info);
		else if (lc == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_LC(info);
		else if (lc == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_LC(info);
		else if (lc == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_LC(info);
		else if (lc == Hdr_ship_term_cd) doHdr_ship_term_cd_LC(info);
		else if (lc == Hdr_ship_term_nm) doHdr_ship_term_nm_LC(info);
		else if (lc == Hdr_ship_wk_grp_cd) doHdr_ship_wk_grp_cd_LC(info);
		else if (lc == Hdr_ship_wk_grp_nm) doHdr_ship_wk_grp_nm_LC(info);
		else if (lc == Hdr_ship_wk_cd) doHdr_ship_wk_cd_LC(info);
		else if (lc == Hdr_ship_wk_nm) doHdr_ship_wk_nm_LC(info);
		else if (lc == Hdr_ship_wt) doHdr_ship_wt_LC(info);
		else if (lc == Hdr_ship_dim) doHdr_ship_dim_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_inst_rmrks) doHdr_inst_rmrks_LC(info);
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
		else if (lc == Hdr_ship_inst_upd_cntr) doHdr_ship_inst_upd_cntr_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_ent_unit_cd) doDtl_ent_unit_cd_LC(info);
		else if (lc == columnDtl_ent_unit_nm) doDtl_ent_unit_nm_LC(info);
		else if (lc == columnDtl_ent_unit_dec_place) doDtl_ent_unit_dec_place_LC(info);
		else if (lc == columnDtl_ent_unit_conv_base_qty) doDtl_ent_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_ent_unit_conv_qty) doDtl_ent_unit_conv_qty_LC(info);
		else if (lc == columnDtl_ent_unit_rnd_typ) doDtl_ent_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_conv_base_qty) doDtl_base_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_base_unit_conv_qty) doDtl_base_unit_conv_qty_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_LC(info);
		else if (lc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_LC(info);
		else if (lc == columnDtl_pckg_unit_dec_place) doDtl_pckg_unit_dec_place_LC(info);
		else if (lc == columnDtl_pckg_unit_conv_base_qty) doDtl_pckg_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_pckg_unit_conv_qty) doDtl_pckg_unit_conv_qty_LC(info);
		else if (lc == columnDtl_pckg_unit_rnd_typ) doDtl_pckg_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_schd_unit_cd) doDtl_schd_unit_cd_LC(info);
		else if (lc == columnDtl_schd_unit_nm) doDtl_schd_unit_nm_LC(info);
		else if (lc == columnDtl_schd_unit_dec_place) doDtl_schd_unit_dec_place_LC(info);
		else if (lc == columnDtl_schd_unit_conv_base_qty) doDtl_schd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_schd_unit_conv_qty) doDtl_schd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_schd_unit_rnd_typ) doDtl_schd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_iv_schd_qty) doDtl_iv_schd_qty_LC(info);
		else if (lc == columnDtl_cont_unit_dec_place) doDtl_cont_unit_dec_place_LC(info);
		else if (lc == columnDtl_cont_unit_rnd_typ) doDtl_cont_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_LC(info);
		else if (lc == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_LC(info);
		else if (lc == columnDtl_ship_site_cd) doDtl_ship_site_cd_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_stk_insp_typ) doDtl_stk_insp_typ_LC(info);
		else if (lc == columnDtl_stk_insp_typ_nm) doDtl_stk_insp_typ_nm_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_LC(info);
		else if (lc == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_LC(info);
		else if (lc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_LC(info);
		else if (lc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_LC(info);
		else if (lc == columnDtl_alloc_grp_cd) doDtl_alloc_grp_cd_LC(info);
		else if (lc == columnDtl_alloc_grp_nm) doDtl_alloc_grp_nm_LC(info);
		else if (lc == columnDtl_def_loc_cd) doDtl_def_loc_cd_LC(info);
		else if (lc == columnDtl_def_loc_nm) doDtl_def_loc_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_rsn_nm) doDtl_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_prov_typ) doDtl_prov_typ_LC(info);
		else if (lc == columnDtl_prov_typ_nm) doDtl_prov_typ_nm_LC(info);
		else if (lc == columnDtl_prov_basis_typ) doDtl_prov_basis_typ_LC(info);
		else if (lc == columnDtl_prov_basis_typ_nm) doDtl_prov_basis_typ_nm_LC(info);
		else if (lc == columnDtl_ret_prov_typ) doDtl_ret_prov_typ_LC(info);
		else if (lc == columnDtl_ret_prov_typ_nm) doDtl_ret_prov_typ_nm_LC(info);
		else if (lc == columnDtl_ret_prov_basis_typ) doDtl_ret_prov_basis_typ_LC(info);
		else if (lc == columnDtl_ret_prov_basis_typ_nm) doDtl_ret_prov_basis_typ_nm_LC(info);
		else if (lc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_LC(info);
		else if (lc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_LC(info);
		else if (lc == columnDtl_base_ac_dt) doDtl_base_ac_dt_LC(info);
		else if (lc == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_inst_d_rmrks) doDtl_inst_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_LC(info);
		else if (lc == columnDtl_ship_inst_no) doDtl_ship_inst_no_LC(info);
		else if (lc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_LC(info);
		else if (lc == columnDtl_ship_schd_no) doDtl_ship_schd_no_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_LC(info);
		else if (lc == columnDtl_iv_no) doDtl_iv_no_LC(info);
		else if (lc == columnDtl_iv_d_no) doDtl_iv_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnDtl_tmp_inst_d_no) doDtl_tmp_inst_d_no_LC(info);
		else if (lc == columnDtl_ship_pr_no) doDtl_ship_pr_no_LC(info);
		else if (lc == columnDtl_lot_peg_no) doDtl_lot_peg_no_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_pick_peg_no) doDtl_pick_peg_no_LC(info);
		else if (lc == columnDtl_xfr_src_typ) doDtl_xfr_src_typ_LC(info);
		else if (lc == columnDtl_ship_wt) doDtl_ship_wt_LC(info);
		else if (lc == columnDtl_ship_dim) doDtl_ship_dim_LC(info);
		else if (lc == columnDtl_unit_wt) doDtl_unit_wt_LC(info);
		else if (lc == columnDtl_unit_dim) doDtl_unit_dim_LC(info);
		else if (lc == columnDtl_vld_dt_fr) doDtl_vld_dt_fr_LC(info);
		else if (lc == columnDtl_vld_dt_to) doDtl_vld_dt_to_LC(info);
		else if (lc == columnDtl_alloc_scope_typ) doDtl_alloc_scope_typ_LC(info);
		else if (lc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_LC(info);
		else if (lc == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_LC(info);
		else if (lc == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_LC(info);
		else if (lc == columnDtl_ship_schd_tm) doDtl_ship_schd_tm_LC(info);
		else if (lc == columnDtl_dlv_schd_tm) doDtl_dlv_schd_tm_LC(info);
		else if (lc == columnDtl_ship_term_cd) doDtl_ship_term_cd_LC(info);
	}

	/**
	 * [Cnd]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_schd_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_schd_time_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_rmrks_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[ship_inst_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_upd_cntr_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ent_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ent_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ent_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pckg_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pckg_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[schd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_schd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_schd_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_schd_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ret_prov_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ret_prov_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_d_rmrks_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tmp_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tmp_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pick_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pick_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_src_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_src_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_scope_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_scope_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_schd_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_schd_tm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_to_id_typ]の作成メソッド
	 */
	public MCList getHdr_ship_to_id_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_to_id_cd]の作成メソッド
	 */
	public MCList getHdr_ship_to_id_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[Hdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_inst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_term_cd]の作成メソッド
	 */
	public MCList getHdr_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_wk_cd]の作成メソッド
	 */
	public MCList getHdr_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ent_unit_cd]の作成メソッド
	 */
	public MCList getDtl_ent_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pckg_unit_cd]の作成メソッド
	 */
	public MCList getDtl_pckg_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_schd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_schd_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_loc_cd]の作成メソッド
	 */
	public MCList getDtl_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_quality_typ]の作成メソッド
	 */
	public MCList getDtl_quality_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gd_cd]の作成メソッド
	 */
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_ptn_typ]の作成メソッド
	 */
	public MCList getDtl_trd_ptn_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1400.Srch01")) {
			return new MS_MSBEL1400_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Srch02")) {
			return new MS_MSBEL1400_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1400.Sprt01")) {
			return new MS_MSBEL1400_Sprt01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Ins01")) {
			return new MS_MSBEL1400_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Upd01")) {
			return new MS_MSBEL1400_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Del01")) {
			return new MS_MSBEL1400_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Prnt01")) {
			return new MS_MSBEL1400_Prnt01Bridge();
		}
		if (id.equals("MS.MSBEL1400.Sprt02")) {
			return new MS_MSBEL1400_Sprt02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1400_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Srch01Bridge() {
			p_MS_MSBEL1400_Srch01 = new MCParam(PDef.MS_MSBEL1400_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));

			p_MS_MSBEL1400_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1400.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1400.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			p_MS_MSBEL1400_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			p_MS_MSBEL1400_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1400.HdrR)p_MS_MSBEL1400_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Srch01.getContainerParam().getDownBlock(1));
			setShipSchd_DtlL((MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)p_MS_MSBEL1400_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getShipSchd_DtlL().clear();
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
			result.add(getShipSchd_DtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1400_Srch02Bridge() {
			p_MS_MSBEL1400_Srch02 = new MCParam(PDef.MS_MSBEL1400_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));

			p_MS_MSBEL1400_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Srch02.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1400.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			p_MS_MSBEL1400_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			p_MS_MSBEL1400_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1400.HdrR)p_MS_MSBEL1400_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Srch02.getContainerParam().getDownBlock(1));
			setShipSchd_DtlL((MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)p_MS_MSBEL1400_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getShipSchd_DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getShipSchd_DtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Sprt01Bridge() {
			p_MS_MSBEL1400_Sprt01 = new MCParam(PDef.MS_MSBEL1400_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));

			p_MS_MSBEL1400_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Sprt01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1400_Sprt01.addUpBlock(getShipSchd_DtlL().shallowClone());
			p_MS_MSBEL1400_Sprt01.addUpBlock(getHdrR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1400.HdrR up2() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(2);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getShipSchd_DtlL());
			result.add(getHdrR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Ins01Bridge() {
			p_MS_MSBEL1400_Ins01 = new MCParam(PDef.MS_MSBEL1400_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.BtnR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));

			p_MS_MSBEL1400_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Ins01.addUpBlock(getHdrR());
			p_MS_MSBEL1400_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1400_Ins01.addUpBlock(getShipSchd_DtlL().shallowClone());
			p_MS_MSBEL1400_Ins01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)up(2);
		}
		protected mcframe.clientMSBE.MSBEP1400.BtnR up3() {
			return (mcframe.clientMSBE.MSBEP1400.BtnR)up(3);
		}

		protected mcframe.clientMSBE.MSBEP1400.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			p_MS_MSBEL1400_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1400.HdrR)p_MS_MSBEL1400_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getShipSchd_DtlL());
			result.add(getBtnR());
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
	 * [MS_MSBEL1400_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Upd01Bridge() {
			p_MS_MSBEL1400_Upd01 = new MCParam(PDef.MS_MSBEL1400_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.BtnR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));

			p_MS_MSBEL1400_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1400_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1400_Upd01.addUpBlock(getShipSchd_DtlL().shallowClone());
			p_MS_MSBEL1400_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)up(2);
		}
		protected mcframe.clientMSBE.MSBEP1400.BtnR up3() {
			return (mcframe.clientMSBE.MSBEP1400.BtnR)up(3);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Upd01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getShipSchd_DtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Del01Bridge() {
			p_MS_MSBEL1400_Del01 = new MCParam(PDef.MS_MSBEL1400_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.BtnR.create());
			// Down

			p_MS_MSBEL1400_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Del01.addUpBlock(getHdrR());
			p_MS_MSBEL1400_Del01.addUpBlock(getShipSchd_DtlL().shallowClone());
			p_MS_MSBEL1400_Del01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1400_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.ShipSchd_DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(2);
		}
		protected mcframe.clientMSBE.MSBEP1400.BtnR up3() {
			return (mcframe.clientMSBE.MSBEP1400.BtnR)up(3);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getShipSchd_DtlL());
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1400_Prnt01Bridge() {
			p_MS_MSBEL1400_Prnt01 = new MCParam(PDef.MS_MSBEL1400_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.HdrR.create());
			param.addUpBlock(mcframe.clientMSBE.MSBEP1400.BtnR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			// Down

			p_MS_MSBEL1400_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Prnt01.addUpBlock(getHdrR());
			p_MS_MSBEL1400_Prnt01.addUpBlock(getBtnR());
			p_MS_MSBEL1400_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1400.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1400.HdrR)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1400.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1400.BtnR)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Prnt01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getBtnR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1400_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1400_Sprt02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1400_Sprt02;

		/** コンストラクタ */
		protected MS_MSBEL1400_Sprt02Bridge() {
			p_MS_MSBEL1400_Sprt02 = new MCParam(PDef.MS_MSBEL1400_Sprt02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1400_Sprt02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));

			p_MS_MSBEL1400_Sprt02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1400_Sprt02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1400_Sprt02.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1400_Sprt02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1400_Sprt02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1400.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1400_Sprt02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1400.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1400_Sprt02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1400.DtlR>)p_MS_MSBEL1400_Sprt02.getContainerParam().getDownBlock(0));
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
}