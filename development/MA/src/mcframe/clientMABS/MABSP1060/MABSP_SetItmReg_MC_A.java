package mcframe.clientMABS.MABSP1060;

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
import mcframe.clientMABS.MABSP1060.MABSP_SetItmReg_MC.MA_MABSL1060_Srch01Caller;
import mcframe.clientMABS.MABSP1060.MABSP_SetItmReg_MC.MA_MABSL1060_Upd01Caller;
import mcframe.clientMABS.MABSP1060.MABSP_SetItmReg_MC.MA_MABSL1060_Del01Caller;

/**
 * 画面"MABSP_SetItmReg"パネルクラスです。<p>
 *
 * 品揃マスタ、品揃グループマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_SetItmReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABSP1060";

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_set_grp_cd_Label = null;
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_set_grp_cd = null;
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public MCTextField Cnd_set_grp_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_main_itm_p_PPanel;
	public MCTextField Cnd_main_itm_cd;	// [Cnd]の[main_itm_p.itm_cd]を[Cnd_main_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub1;	// [Cnd]の[main_itm_p.itm_sub1]を[Cnd_main_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub2;	// [Cnd]の[main_itm_p.itm_sub2]を[Cnd_main_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_main_itm_sub3;	// [Cnd]の[main_itm_p.itm_sub3]を[Cnd_main_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_main_itm_nm;	// [Cnd]の[main_itm_p.itm_nm]を[Cnd_main_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_set_itm_p_PPanel;
	public MCTextField Cnd_set_itm_cd;	// [Cnd]の[set_itm_p.itm_cd]を[Cnd_set_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_set_itm_sub1;	// [Cnd]の[set_itm_p.itm_sub1]を[Cnd_set_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_set_itm_sub2;	// [Cnd]の[set_itm_p.itm_sub2]を[Cnd_set_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_set_itm_sub3;	// [Cnd]の[set_itm_p.itm_sub3]を[Cnd_set_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_set_itm_nm;	// [Cnd]の[set_itm_p.itm_nm]を[Cnd_set_itm_nm]としてエイリアス定義。
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField BulkSet_st_dt = null;
	public MCLabel BulkSet_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField BulkSet_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton BulkSet_set_dt = null;
	// [TopDtl]ブロック関連のField定義
	public MCPanel TopDtlPanel = null;
	// [TopDtl]ブロックの項目のField定義
	// [SetGrp]ブロック関連のField定義
	public MCPanel SetGrpPanel = null;
	// [SetGrp]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1060.DtlR> DtlTable = null;
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
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_grp_cd = null;
	/**
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_grp_nm_lcl = null;
	/**
	 * Standard assortment group name 標準品揃グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_grp_nm = null;
	/**
	 * Assortment shipment 出荷品揃.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_assort_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
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
	// [BtmDtl]ブロック関連のField定義
	public MCPanel BtmDtlPanel = null;
	// [BtmDtl]ブロックの項目のField定義
	// [BtmTab]ブロック関連のField定義
	public MCPanel BtmTabPanel = null;
	public MCTabbedPane BtmTabTab = null;
	// [BtmTab]ブロックの項目のField定義
	// [SetItmWrk]ブロック関連のField定義
	public MCPanel SetItmWrkPanel = null;
	// [SetItmWrk]ブロックの項目のField定義
	// [DtlSetItm]ブロック関連のField定義
	public MCPanel DtlSetItmPanel = null;
	public MCScrollPane DtlSetItmScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1060.DtlSetItmR> DtlSetItmTable = null;
	// [DtlSetItm]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_del_flg = null;
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_grp_cd = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlSetItm_main_itm_p_PPanel;
	public MCColumnConfig columnDtlSetItm_main_itm_cd;// [DtlSetItm]の[main_itm_p.itm_cd]を[columnDtlSetItm_main_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_main_itm_sub1;// [DtlSetItm]の[main_itm_p.itm_sub1]を[columnDtlSetItm_main_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_main_itm_sub2;// [DtlSetItm]の[main_itm_p.itm_sub2]を[columnDtlSetItm_main_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_main_itm_sub3;// [DtlSetItm]の[main_itm_p.itm_sub3]を[columnDtlSetItm_main_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_main_itm_nm;// [DtlSetItm]の[main_itm_p.itm_nm]を[columnDtlSetItm_main_itm_nm]としてエイリアス定義。
	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_typ = null;
	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_typ_nm = null;
	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_typ_d_cd = null;
	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D DtlSetItm_set_itm_p_PPanel;
	public MCColumnConfig columnDtlSetItm_set_itm_cd;// [DtlSetItm]の[set_itm_p.itm_cd]を[columnDtlSetItm_set_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_set_itm_sub1;// [DtlSetItm]の[set_itm_p.itm_sub1]を[columnDtlSetItm_set_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_set_itm_sub2;// [DtlSetItm]の[set_itm_p.itm_sub2]を[columnDtlSetItm_set_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_set_itm_sub3;// [DtlSetItm]の[set_itm_p.itm_sub3]を[columnDtlSetItm_set_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtlSetItm_set_itm_nm;// [DtlSetItm]の[set_itm_p.itm_nm]を[columnDtlSetItm_set_itm_nm]としてエイリアス定義。
	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_typ = null;
	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_typ_nm = null;
	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_typ_d_cd = null;
	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_typ_d_nm = null;
	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_unit_cd = null;
	/**
	 * Representative item unit name 代表品目単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_unit_nm = null;
	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_main_itm_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSetItm_main_itm_qty_p_PPanel;
	public MCColumnConfig columnDtlSetItm_main_itm_qty;// [DtlSetItm]の[main_itm_qty_p.qty]を[columnDtlSetItm_main_itm_qty]としてエイリアス定義。
	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_unit_cd = null;
	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_unit_nm = null;
	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_set_itm_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D DtlSetItm_set_itm_qty_p_PPanel;
	public MCColumnConfig columnDtlSetItm_set_itm_qty;// [DtlSetItm]の[set_itm_qty_p.qty]を[columnDtlSetItm_set_itm_qty]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlSetItm_del_ts = null;
	// [DtlBtnSetItm]ブロック関連のField定義
	public MCPanel DtlBtnSetItmPanel = null;
	// [DtlBtnSetItm]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtnSetItm_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtnSetItm_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtnSetItm_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtnSetItm_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtnSetItm_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1060.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_set_grp_cd = null;
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
	 * Assortment group name 品揃グループ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_set_grp_nm = null;
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
	
	/** [MA_MABSL1060_Srch01]のCallerの作成 */
	protected MABSP_SetItmReg_MC.MA_MABSL1060_Srch01Caller createMA_MABSL1060_Srch01() {
		MABSP_SetItmReg_MC.MA_MABSL1060_Srch01Caller<MABSP_SetItmReg, MA_MABSL1060_Srch01Bridge>
		caller = ((MABSP_SetItmReg_MC)this).new MA_MABSL1060_Srch01Caller<MABSP_SetItmReg, MA_MABSL1060_Srch01Bridge>(
					(MABSP_SetItmReg)this, new MA_MABSL1060_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL1060_Srch01]の呼び出し */
	protected void callMA_MABSL1060_Srch01() {
		MCCaller caller = createMA_MABSL1060_Srch01();
		caller.exec();
	}
	/** [MA_MABSL1060_Upd01]のCallerの作成 */
	protected MABSP_SetItmReg_MC.MA_MABSL1060_Upd01Caller createMA_MABSL1060_Upd01() {
		MABSP_SetItmReg_MC.MA_MABSL1060_Upd01Caller<MABSP_SetItmReg, MA_MABSL1060_Upd01Bridge>
		caller = ((MABSP_SetItmReg_MC)this).new MA_MABSL1060_Upd01Caller<MABSP_SetItmReg, MA_MABSL1060_Upd01Bridge>(
					(MABSP_SetItmReg)this, new MA_MABSL1060_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL1060_Upd01]の呼び出し */
	protected void callMA_MABSL1060_Upd01() {
		MCCaller caller = createMA_MABSL1060_Upd01();
		caller.exec();
	}
	/** [MA_MABSL1060_Del01]のCallerの作成 */
	protected MABSP_SetItmReg_MC.MA_MABSL1060_Del01Caller createMA_MABSL1060_Del01() {
		MABSP_SetItmReg_MC.MA_MABSL1060_Del01Caller<MABSP_SetItmReg, MA_MABSL1060_Del01Bridge>
		caller = ((MABSP_SetItmReg_MC)this).new MA_MABSL1060_Del01Caller<MABSP_SetItmReg, MA_MABSL1060_Del01Bridge>(
					(MABSP_SetItmReg)this, new MA_MABSL1060_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL1060_Del01]の呼び出し */
	protected void callMA_MABSL1060_Del01() {
		MCCaller caller = createMA_MABSL1060_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1060.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1060.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1060.DtlR> aDtlL;
	/** [DtlSetItm]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> aDtlSetItmL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1060.LclR> aLclL;
	/** [DtlSetItmAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> aDtlSetItmAllL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1060.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP1060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1060.CndR createCndR() {
		return mcframe.clientMABS.MABSP1060.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP1060.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP1060.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP1060.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP1060.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP1060.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP1060.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP1060.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1060.DtlR.class);
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
	 * コピーによってaDtlSetItmLを設定します。
	 *
	 * aDtlSetItmLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSetItmL
	 */
	public void setDtlSetItmL(MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> aList) {
		if (getDtlSetItmL() != aList) {
			getDtlSetItmL().setAll(aList);
		}
	}

	/**
	 * [DtlSetItm]ブロックのコンテナaDtlSetItmLを返します。
	 *
	 * @return DtlSetItmL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> getDtlSetItmL() {
		return aDtlSetItmL;
	}

	/**
	 * aDtlSetItmRを作成します。
	 *
	 * @return DtlSetItmR
	 */
	public mcframe.clientMABS.MABSP1060.DtlSetItmR createDtlSetItmR() {
		return mcframe.clientMABS.MABSP1060.DtlSetItmR.create();
	}

	/**
	 * aDtlSetItmLを作成します。
	 *
	 * @return DtlSetItmL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> createDtlSetItmL() {
		return MCList.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.class);
	}

	/**
	 * DtlSetItmTableを初期化します。
	 */
	protected void createDtlSetItmTable(){
		if(DtlSetItmTable == null){
			DtlSetItmTable = beansFactory.createTable2("DtlSetItm.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABS.MABSP1060.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABS.MABSP1060.LclR createLclR() {
		return mcframe.clientMABS.MABSP1060.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.LclR> createLclL() {
		return MCList.create(mcframe.clientMABS.MABSP1060.LclR.class);
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
	 * コピーによってaDtlSetItmAllLを設定します。
	 *
	 * aDtlSetItmAllLのインスタンスは変更されません。
	 *
	 * @param dataset DtlSetItmAllL
	 */
	public void setDtlSetItmAllL(MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> aList) {
		if (getDtlSetItmAllL() != aList) {
			getDtlSetItmAllL().setAll(aList);
		}
	}

	/**
	 * [DtlSetItmAll]ブロックのコンテナaDtlSetItmAllLを返します。
	 *
	 * @return DtlSetItmAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> getDtlSetItmAllL() {
		return aDtlSetItmAllL;
	}

	/**
	 * aDtlSetItmAllRを作成します。
	 *
	 * @return DtlSetItmAllR
	 */
	public mcframe.clientMABS.MABSP1060.DtlSetItmR createDtlSetItmAllR() {
		return mcframe.clientMABS.MABSP1060.DtlSetItmR.create();
	}

	/**
	 * aDtlSetItmAllLを作成します。
	 *
	 * @return DtlSetItmAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> createDtlSetItmAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.class);
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABS.MABSP1060.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABS.MABSP1060.LclR createLclAllR() {
		return mcframe.clientMABS.MABSP1060.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1060.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1060.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlSetItmL())) ret.add(getDtlSetItmL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getDtlSetItmAllL())) ret.add(getDtlSetItmAllL());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlSetItmL()) return "DtlSetItm";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getDtlSetItmAllL()) return "DtlSetItmAll";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlSetItm")) return getDtlSetItmL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("DtlSetItmAll")) return getDtlSetItmAllL();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(TopDtlPanel);
		ret.add(SetGrpPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtmDtlPanel);
		ret.add(BtmTabPanel);
		ret.add(SetItmWrkPanel);
		ret.add(DtlSetItmPanel);
		ret.add(DtlBtnSetItmPanel);
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
	public MABSP_SetItmReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		aDtlSetItmL = createDtlSetItmL();
		aLclL = createLclL();
		aDtlSetItmAllL = createDtlSetItmAllL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_SetItmReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlSetItmL = createDtlSetItmL();
		createDtlSetItmTable();
		DtlSetItmTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aDtlSetItmAllL = createDtlSetItmAllL();
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_SetItmReg_MC.jbCreateScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateTop((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateFold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateCnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateCtrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateBulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateTopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateSetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateDtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateBtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateBtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateSetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateDtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateDtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateLclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateLcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateLclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbCreateEastBtn((MABSP_SetItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_SetItmReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_SetItmReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_SetItmReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_SetItmReg p) {
		p.Cnd_main_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().main_itm_p());
		p.Cnd_main_itm_p_PPanel.setName("Cnd.main_itm_p");
		p.Cnd_main_itm_cd = p.Cnd_main_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_main_itm_cd.addAliasName("Cnd.main_itm_cd", p);
		p.Cnd_main_itm_sub1 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_main_itm_sub1.addAliasName("Cnd.main_itm_sub1", p);
		p.Cnd_main_itm_sub2 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_main_itm_sub2.addAliasName("Cnd.main_itm_sub2", p);
		p.Cnd_main_itm_sub3 = p.Cnd_main_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_main_itm_sub3.addAliasName("Cnd.main_itm_sub3", p);
		p.Cnd_main_itm_nm = p.Cnd_main_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_main_itm_nm.addAliasName("Cnd.main_itm_nm", p);
		p.Cnd_set_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().set_itm_p());
		p.Cnd_set_itm_p_PPanel.setName("Cnd.set_itm_p");
		p.Cnd_set_itm_cd = p.Cnd_set_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_set_itm_cd.addAliasName("Cnd.set_itm_cd", p);
		p.Cnd_set_itm_sub1 = p.Cnd_set_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_set_itm_sub1.addAliasName("Cnd.set_itm_sub1", p);
		p.Cnd_set_itm_sub2 = p.Cnd_set_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_set_itm_sub2.addAliasName("Cnd.set_itm_sub2", p);
		p.Cnd_set_itm_sub3 = p.Cnd_set_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_set_itm_sub3.addAliasName("Cnd.set_itm_sub3", p);
		p.Cnd_set_itm_nm = p.Cnd_set_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_set_itm_nm.addAliasName("Cnd.set_itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_SetItmReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_SetItmReg p) {
	}

	/**
	 * [TopDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTopDtl(MABSP_SetItmReg p) {
	}

	/**
	 * [SetGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSetGrp(MABSP_SetItmReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_SetItmReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1060.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_SetItmReg p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABSP_SetItmReg p) {
	}

	/**
	 * [BtmTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmTab(MABSP_SetItmReg p) {
	}

	/**
	 * [SetItmWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSetItmWrk(MABSP_SetItmReg p) {
	}

	/**
	 * [DtlSetItm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlSetItm(MABSP_SetItmReg p) {
		p.DtlSetItm_main_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.$main_itm_p);
		p.DtlSetItm_main_itm_p_PPanel.setName("DtlSetItm.main_itm_p");
		p.columnDtlSetItm_main_itm_cd = p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlSetItm_main_itm_cd.addAliasName("DtlSetItm.main_itm_cd", p);
		p.columnDtlSetItm_main_itm_sub1 = p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlSetItm_main_itm_sub1.addAliasName("DtlSetItm.main_itm_sub1", p);
		p.columnDtlSetItm_main_itm_sub2 = p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlSetItm_main_itm_sub2.addAliasName("DtlSetItm.main_itm_sub2", p);
		p.columnDtlSetItm_main_itm_sub3 = p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlSetItm_main_itm_sub3.addAliasName("DtlSetItm.main_itm_sub3", p);
		p.columnDtlSetItm_main_itm_nm = p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlSetItm_main_itm_nm.addAliasName("DtlSetItm.main_itm_nm", p);
		p.DtlSetItm_set_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.$set_itm_p);
		p.DtlSetItm_set_itm_p_PPanel.setName("DtlSetItm.set_itm_p");
		p.columnDtlSetItm_set_itm_cd = p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtlSetItm_set_itm_cd.addAliasName("DtlSetItm.set_itm_cd", p);
		p.columnDtlSetItm_set_itm_sub1 = p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtlSetItm_set_itm_sub1.addAliasName("DtlSetItm.set_itm_sub1", p);
		p.columnDtlSetItm_set_itm_sub2 = p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtlSetItm_set_itm_sub2.addAliasName("DtlSetItm.set_itm_sub2", p);
		p.columnDtlSetItm_set_itm_sub3 = p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtlSetItm_set_itm_sub3.addAliasName("DtlSetItm.set_itm_sub3", p);
		p.columnDtlSetItm_set_itm_nm = p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtlSetItm_set_itm_nm.addAliasName("DtlSetItm.set_itm_nm", p);
		p.DtlSetItm_main_itm_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.$main_itm_qty_p);
		p.DtlSetItm_main_itm_qty_p_PPanel.setName("DtlSetItm.main_itm_qty_p");
		p.columnDtlSetItm_main_itm_qty = p.DtlSetItm_main_itm_qty_p_PPanel.columnQty_qty;
		p.columnDtlSetItm_main_itm_qty.addAliasName("DtlSetItm.main_itm_qty", p);
		p.DtlSetItm_set_itm_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.$set_itm_qty_p);
		p.DtlSetItm_set_itm_qty_p_PPanel.setName("DtlSetItm.set_itm_qty_p");
		p.columnDtlSetItm_set_itm_qty = p.DtlSetItm_set_itm_qty_p_PPanel.columnQty_qty;
		p.columnDtlSetItm_set_itm_qty.addAliasName("DtlSetItm.set_itm_qty", p);
	}

	/**
	 * [DtlBtnSetItm]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtnSetItm(MABSP_SetItmReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABSP_SetItmReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABSP_SetItmReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABSP_SetItmReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_SetItmReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_SetItmReg p) {
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

	
	/** [Cnd_set_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_set_grp_cd_p = null;

	/**
	 * [Cnd_set_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_grp_cd_ListPutter() {
		if (Cnd_set_grp_cd_p == null) {
			Cnd_set_grp_cd_p = createCnd_set_grp_cd_ListPutter(Cnd_set_grp_cd, "set_grp_cd", "set_grp_nm");

		}
		return Cnd_set_grp_cd_p;
	}
	
	
	/** [Cnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_main_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_main_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_main_itm_p_PPanel_Itm_itm_cd_p = createCnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_main_itm_p_PPanel.Itm_itm_cd, "main_itm_cd", "main_itm_nm","main_itm_sub1","main_itm_sub2","main_itm_sub3");
		}
		return Cnd_main_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_main_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_main_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_main_itm_p_PPanel_Itm_itm_sub1_p = createCnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_main_itm_p_PPanel.Itm_itm_sub1, "main_itm_sub1", "main_itm_nm","main_itm_sub2","main_itm_sub3");
		}
		return Cnd_main_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_main_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_main_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_main_itm_p_PPanel_Itm_itm_sub2_p = createCnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_main_itm_p_PPanel.Itm_itm_sub2, "main_itm_sub2", "main_itm_nm","main_itm_sub3");
		}
		return Cnd_main_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_main_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_main_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_main_itm_p_PPanel_Itm_itm_sub3_p = createCnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_main_itm_p_PPanel.Itm_itm_sub3, "main_itm_sub3", "main_itm_nm");
		}
		return Cnd_main_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_set_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_set_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_set_itm_p_PPanel_Itm_itm_cd_p = createCnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_set_itm_p_PPanel.Itm_itm_cd, "set_itm_cd", "set_itm_nm","set_itm_sub1","set_itm_sub2","set_itm_sub3");
		}
		return Cnd_set_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_set_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_set_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_set_itm_p_PPanel_Itm_itm_sub1_p = createCnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_set_itm_p_PPanel.Itm_itm_sub1, "set_itm_sub1", "set_itm_nm","set_itm_sub2","set_itm_sub3");
		}
		return Cnd_set_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_set_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_set_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_set_itm_p_PPanel_Itm_itm_sub2_p = createCnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_set_itm_p_PPanel.Itm_itm_sub2, "set_itm_sub2", "set_itm_nm","set_itm_sub3");
		}
		return Cnd_set_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_set_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_set_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_set_itm_p_PPanel_Itm_itm_sub3_p = createCnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_set_itm_p_PPanel.Itm_itm_sub3, "set_itm_sub3", "set_itm_nm");
		}
		return Cnd_set_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_p == null) {
			DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_p = createDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter(DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd, "main_itm_cd", "main_itm_nm","main_itm_typ","main_itm_typ_nm","main_itm_typ_d_cd","main_itm_typ_d_nm","main_itm_sub1","main_itm_sub2","main_itm_sub3","main_itm_unit_cd","main_itm_unit_nm","main_itm_dec_place");
		}
		return DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_p = createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter(DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1, "main_itm_sub1", "main_itm_nm","main_itm_typ","main_itm_typ_nm","main_itm_typ_d_cd","main_itm_typ_d_nm","main_itm_sub2","main_itm_sub3","main_itm_unit_cd","main_itm_unit_nm","main_itm_dec_place");
		}
		return DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_p = createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter(DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2, "main_itm_sub2", "main_itm_nm","main_itm_typ","main_itm_typ_nm","main_itm_typ_d_cd","main_itm_typ_d_nm","main_itm_sub3","main_itm_unit_cd","main_itm_unit_nm","main_itm_dec_place");
		}
		return DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_p = createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter(DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3, "main_itm_sub3", "main_itm_nm","main_itm_typ","main_itm_typ_nm","main_itm_typ_d_cd","main_itm_typ_d_nm","main_itm_unit_cd","main_itm_unit_nm","main_itm_dec_place");
		}
		return DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_p == null) {
			DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_p = createDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter(DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd, "set_itm_cd", "set_itm_nm","set_itm_typ","set_itm_typ_nm","set_itm_typ_d_cd","set_itm_typ_d_nm","set_itm_sub1","set_itm_sub2","set_itm_sub3","set_itm_unit_cd","set_itm_unit_nm","set_itm_dec_place");
		}
		return DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_p = createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter(DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1, "set_itm_sub1", "set_itm_nm","set_itm_typ","set_itm_typ_nm","set_itm_typ_d_cd","set_itm_typ_d_nm","set_itm_sub2","set_itm_sub3","set_itm_unit_cd","set_itm_unit_nm","set_itm_dec_place");
		}
		return DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_p = createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter(DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2, "set_itm_sub2", "set_itm_nm","set_itm_typ","set_itm_typ_nm","set_itm_typ_d_cd","set_itm_typ_d_nm","set_itm_sub3","set_itm_unit_cd","set_itm_unit_nm","set_itm_dec_place");
		}
		return DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_p = createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter(DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3, "set_itm_sub3", "set_itm_nm","set_itm_typ","set_itm_typ_nm","set_itm_typ_d_cd","set_itm_typ_d_nm","set_itm_unit_cd","set_itm_unit_nm","set_itm_dec_place");
		}
		return DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [DtlSetItm_main_itm_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlSetItm_main_itm_unit_cd_p = null;

	/**
	 * [DtlSetItm_main_itm_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_main_itm_unit_cd_ListPutter() {
		if (DtlSetItm_main_itm_unit_cd_p == null) {
			DtlSetItm_main_itm_unit_cd_p = createDtlSetItm_main_itm_unit_cd_ListPutter(columnDtlSetItm_main_itm_unit_cd, "main_itm_unit_cd", "main_itm_unit_nm","main_itm_dec_place");

		}
		return DtlSetItm_main_itm_unit_cd_p;
	}
	
	
	/** [DtlSetItm_set_itm_unit_cd_ListPutter]の定義 */
	private MCListPutter DtlSetItm_set_itm_unit_cd_p = null;

	/**
	 * [DtlSetItm_set_itm_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlSetItm_set_itm_unit_cd_ListPutter() {
		if (DtlSetItm_set_itm_unit_cd_p == null) {
			DtlSetItm_set_itm_unit_cd_p = createDtlSetItm_set_itm_unit_cd_ListPutter(columnDtlSetItm_set_itm_unit_cd, "set_itm_unit_cd", "set_itm_unit_nm","set_itm_dec_place");

		}
		return DtlSetItm_set_itm_unit_cd_p;
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
	public static MABSP_SetItmReg create(){
		MABSP_SetItmReg p = new MABSP_SetItmReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_SetItmReg create(String name){
		MABSP_SetItmReg p = new MABSP_SetItmReg(name);
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
		MABSP_SetItmReg_MC.jbfInitScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitTop((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitFold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitCnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitCtrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitBulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitTopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitSetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitDtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitBtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitBtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitSetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitDtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitDtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitLclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitLcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitLclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbfInitEastBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitTop((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitFold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitCnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitCtrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitBulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitTopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitSetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitDtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitBtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitBtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitSetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitDtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitDtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitLclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitLcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitLclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.jbInitEastBtn((MABSP_SetItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_set_grp_cd_Label = p.beansFactory.createLabel("Cnd.set_grp_cd_Label");
		p.Cnd_set_grp_cd = p.beansFactory.createTextComboBox("Cnd.set_grp_cd");
		p.Cnd_set_grp_cd.setLabel(p.Cnd_set_grp_cd_Label);
		p.Cnd_set_grp_nm = p.beansFactory.createTextField("Cnd.set_grp_nm");
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
	protected static void jbfInitCtrl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_set_dt = p.beansFactory.createButton("BulkSet.set_dt");
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTopDtl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.TopDtlPanel = p.beansFactory.createPanel("TopDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [SetGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSetGrp(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.SetGrpPanel = p.beansFactory.createPanel("SetGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_set_grp_cd = p.beansFactory.createTableColumn("Dtl.set_grp_cd", MCColumnType.TEXT);
		p.columnDtl_set_grp_nm_lcl = p.beansFactory.createTableColumn("Dtl.set_grp_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_set_grp_nm = p.beansFactory.createTableColumn("Dtl.set_grp_nm", MCColumnType.TEXT);
		p.columnDtl_ship_assort_flg = p.beansFactory.createTableColumn("Dtl.ship_assort_flg", MCColumnType.CHECK);
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
	protected static void jbfInitDtlBtn(MABSP_SetItmReg p) {
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
	 * [BtmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmDtl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [BtmTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmTab(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.BtmTabPanel = p.beansFactory.createPanel("BtmTab");
		p.BtmTabTab = p.beansFactory.createTabbedPane("BtmTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [SetItmWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSetItmWrk(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.SetItmWrkPanel = p.beansFactory.createPanel("SetItmWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlSetItm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlSetItm(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.DtlSetItmPanel = p.beansFactory.createPanel("DtlSetItm");
		p.DtlSetItmScrollPane = p.beansFactory.createScrollPane("DtlSetItm.scroll");
		p.createDtlSetItmTable();
		// ブロックの項目の初期化
		p.columnDtlSetItm_check = p.beansFactory.createTableColumn("DtlSetItm.check", MCColumnType.CHECK);
		p.columnDtlSetItm_del_flg = p.beansFactory.createTableColumn("DtlSetItm.del_flg", MCColumnType.CHECK);
		p.columnDtlSetItm_set_grp_cd = p.beansFactory.createTableColumn("DtlSetItm.set_grp_cd", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_typ = p.beansFactory.createTableColumn("DtlSetItm.main_itm_typ", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_typ_nm = p.beansFactory.createTableColumn("DtlSetItm.main_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_typ_d_cd = p.beansFactory.createTableColumn("DtlSetItm.main_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_typ_d_nm = p.beansFactory.createTableColumn("DtlSetItm.main_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_set_itm_typ = p.beansFactory.createTableColumn("DtlSetItm.set_itm_typ", MCColumnType.TEXT);
		p.columnDtlSetItm_set_itm_typ_nm = p.beansFactory.createTableColumn("DtlSetItm.set_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_set_itm_typ_d_cd = p.beansFactory.createTableColumn("DtlSetItm.set_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtlSetItm_set_itm_typ_d_nm = p.beansFactory.createTableColumn("DtlSetItm.set_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_unit_cd = p.beansFactory.createTableColumn("DtlSetItm.main_itm_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSetItm_main_itm_unit_nm = p.beansFactory.createTableColumn("DtlSetItm.main_itm_unit_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_main_itm_dec_place = p.beansFactory.createTableColumn("DtlSetItm.main_itm_dec_place", MCColumnType.NUMBER);
		p.columnDtlSetItm_set_itm_unit_cd = p.beansFactory.createTableColumn("DtlSetItm.set_itm_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlSetItm_set_itm_unit_nm = p.beansFactory.createTableColumn("DtlSetItm.set_itm_unit_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_set_itm_dec_place = p.beansFactory.createTableColumn("DtlSetItm.set_itm_dec_place", MCColumnType.NUMBER);
		p.columnDtlSetItm_memo1 = p.beansFactory.createTableColumn("DtlSetItm.memo1", MCColumnType.TEXT);
		p.columnDtlSetItm_memo2 = p.beansFactory.createTableColumn("DtlSetItm.memo2", MCColumnType.TEXT);
		p.columnDtlSetItm_memo3 = p.beansFactory.createTableColumn("DtlSetItm.memo3", MCColumnType.TEXT);
		p.columnDtlSetItm_ins_usr_id = p.beansFactory.createTableColumn("DtlSetItm.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlSetItm_ins_usr_nm = p.beansFactory.createTableColumn("DtlSetItm.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_ins_ts = p.beansFactory.createTableColumn("DtlSetItm.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSetItm_ins_func_id = p.beansFactory.createTableColumn("DtlSetItm.ins_func_id", MCColumnType.TEXT);
		p.columnDtlSetItm_ins_func_nm = p.beansFactory.createTableColumn("DtlSetItm.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_upd_cntr = p.beansFactory.createTableColumn("DtlSetItm.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlSetItm_upd_usr_id = p.beansFactory.createTableColumn("DtlSetItm.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlSetItm_upd_usr_nm = p.beansFactory.createTableColumn("DtlSetItm.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_upd_ts = p.beansFactory.createTableColumn("DtlSetItm.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlSetItm_upd_func_id = p.beansFactory.createTableColumn("DtlSetItm.upd_func_id", MCColumnType.TEXT);
		p.columnDtlSetItm_upd_func_nm = p.beansFactory.createTableColumn("DtlSetItm.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_upd_srv_req_no = p.beansFactory.createTableColumn("DtlSetItm.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlSetItm_del_usr_id = p.beansFactory.createTableColumn("DtlSetItm.del_usr_id", MCColumnType.TEXT);
		p.columnDtlSetItm_del_usr_nm = p.beansFactory.createTableColumn("DtlSetItm.del_usr_nm", MCColumnType.TEXT);
		p.columnDtlSetItm_del_ts = p.beansFactory.createTableColumn("DtlSetItm.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtnSetItm]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtnSetItm(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.DtlBtnSetItmPanel = p.beansFactory.createPanel("DtlBtnSetItm");
		// ブロックの項目の初期化
		p.DtlBtnSetItm_select_all = p.beansFactory.createButton("DtlBtnSetItm.select_all", "no_border");
		p.DtlBtnSetItm_deselect_all = p.beansFactory.createButton("DtlBtnSetItm.deselect_all", "no_border");
		p.DtlBtnSetItm_radd = p.beansFactory.createButton("DtlBtnSetItm.radd", "no_border");
		p.DtlBtnSetItm_rdel = p.beansFactory.createButton("DtlBtnSetItm.rdel", "no_border");
		p.DtlBtnSetItm_rcopy = p.beansFactory.createButton("DtlBtnSetItm.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_set_grp_cd = p.beansFactory.createTableColumn("Lcl.set_grp_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_set_grp_nm = p.beansFactory.createTableColumn("Lcl.set_grp_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABSP_SetItmReg p) {
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
	protected static void jbfInitBtn(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_SetItmReg p) {
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
	protected static void jbInitTop(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
	protected static void jbInitFold(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_SetItmReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.ope_META);
		p.Cnd_set_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_set_grp_cd, true);
		p.Cnd_set_grp_cd.setLinkBeans(p.Cnd_set_grp_nm);
		p.CndPanel.add(p.Cnd_set_grp_cd_Label);
		p.CndPanel.add(p.Cnd_set_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_set_grp_cd);
		p.Cnd_set_grp_cd.setNextBeans(p.Cnd_set_grp_nm);
		p.Cnd_set_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.set_grp_cd_META);
		p.CndPanel.add(p.Cnd_set_grp_nm);
		p.Cnd_set_grp_nm.setNextBeans(p.Cnd_main_itm_p_PPanel);
		p.Cnd_set_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.set_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_set_grp_nm, true);
		p.CndPanel.add(p.Cnd_main_itm_p_PPanel);
		p.Cnd_main_itm_p_PPanel.setNextBeans(p.Cnd_set_itm_p_PPanel);
		p.Cnd_main_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_main_itm_nm,p.Cnd_main_itm_sub1,p.Cnd_main_itm_sub2,p.Cnd_main_itm_sub3);
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_main_itm_nm,p.Cnd_main_itm_sub2,p.Cnd_main_itm_sub3);
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_main_itm_nm,p.Cnd_main_itm_sub3);
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_main_itm_nm);
		p.CndPanel.add(p.Cnd_set_itm_p_PPanel);
		p.Cnd_set_itm_p_PPanel.setNextBeans(p.Cnd_memo1);
		p.Cnd_set_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_set_itm_nm,p.Cnd_set_itm_sub1,p.Cnd_set_itm_sub2,p.Cnd_set_itm_sub3);
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_set_itm_nm,p.Cnd_set_itm_sub2,p.Cnd_set_itm_sub3);
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_set_itm_nm,p.Cnd_set_itm_sub3);
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_set_itm_nm);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1060.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.TopDtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP1060.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP1060.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTopDtl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.add(p.TopDtlPanel);
		p.TopDtlPanel.setNextBeans(p.BtmDtlPanel);
		p.TopDtlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TopDtlPanel.add(p.SetGrpPanel, null);
		p.TopDtlPanel.setLastBeans(p.SetGrpPanel);
	}

	/**
	 * [SetGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSetGrp(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.SetGrpPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.SetGrpPanel.add(p.DtlPanel, null);
		p.SetGrpPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.SetGrpPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_SetItmReg p) {
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
	protected static void jbInitDtlBtn(MABSP_SetItmReg p) {
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
	 * [BtmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmDtl(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setNextBeans(p.BtnPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.BtmTabPanel, null);
		p.BtmDtlPanel.setLastBeans(p.BtmTabPanel);
	}

	/**
	 * [BtmTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmTab(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.BtmTabPanel.add(p.BtmTabTab);
		p.BtmTabPanel.setLastBeans(p.BtmTabTab);
		p.BtmTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BtmTabTab.add(p.SetItmWrkPanel, "BtmTab.setitmwrk");
		p.BtmTabTab.setLastBeans(p.SetItmWrkPanel);
		p.SetItmWrkPanel.setNextBeans(p.LclWrkPanel);
		p.BtmTabTab.add(p.LclWrkPanel, "BtmTab.lclwrk");
	}

	/**
	 * [SetItmWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSetItmWrk(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.SetItmWrkPanel.setNextBeans(p.LclWrkPanel);
		p.SetItmWrkPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.SetItmWrkPanel.add(p.DtlSetItmPanel, null);
		p.SetItmWrkPanel.setLastBeans(p.DtlSetItmPanel);
		p.DtlSetItmPanel.setNextBeans(p.DtlBtnSetItmPanel);
		p.SetItmWrkPanel.add(p.DtlBtnSetItmPanel, null);
	}

	/**
	 * [DtlSetItm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlSetItm(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.DtlSetItmPanel.add(p.DtlSetItmScrollPane);
		p.DtlSetItmPanel.setLastBeans(p.DtlSetItmTable);
		p.DtlSetItmScrollPane.setViewportView(p.DtlSetItmTable);
		p.DtlSetItmTable.setList(p.getDtlSetItmL());
		p.DtlSetItmPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtnSetItm]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtnSetItm(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.DtlBtnSetItmPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnSetItm_select_all.setIcon("SELECT_ALL");
		p.DtlBtnSetItm_select_all.setFunctionKey(MCFunctionKey.F18);
		p.DtlBtnSetItmPanel.add(p.DtlBtnSetItm_select_all);
		p.DtlBtnSetItmPanel.setLastBeans(p.DtlBtnSetItm_select_all);
		p.DtlBtnSetItm_select_all.setNextBeans(p.DtlBtnSetItm_deselect_all);
		p.DtlBtnSetItm_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtnSetItm_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.DtlBtnSetItmPanel.add(p.DtlBtnSetItm_deselect_all);
		p.DtlBtnSetItm_deselect_all.setNextBeans(p.DtlBtnSetItm_radd);
		p.DtlBtnSetItm_radd.setIcon("INSERT_RECORD");
		p.DtlBtnSetItm_radd.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnSetItmPanel.add(p.DtlBtnSetItm_radd);
		p.DtlBtnSetItm_radd.setNextBeans(p.DtlBtnSetItm_rdel);
		p.DtlBtnSetItm_rdel.setIcon("DELETE_RECORD");
		p.DtlBtnSetItm_rdel.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnSetItmPanel.add(p.DtlBtnSetItm_rdel);
		p.DtlBtnSetItm_rdel.setNextBeans(p.DtlBtnSetItm_rcopy);
		p.DtlBtnSetItm_rcopy.setIcon("COPY_RECORD");
		p.DtlBtnSetItm_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.DtlBtnSetItmPanel.add(p.DtlBtnSetItm_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABSP_SetItmReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABSP_SetItmReg p) {
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
	protected static void jbInitLclBtn(MABSP_SetItmReg p) {
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
	protected static void jbInitBtn(MABSP_SetItmReg p) {
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
	protected static void jbInitEastBtn(MABSP_SetItmReg p) {
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
		MABSP_SetItmReg_MC.mcInitScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitTop((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitFold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitCnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitCtrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitBulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitTopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitSetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitDtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitBtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitBtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitSetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitDtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitDtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitLclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitLcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitLclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.mcInitEastBtn((MABSP_SetItmReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_SetItmReg_MC.statusInitUPD_ScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Top((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Fold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Cnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Ctrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_BulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_TopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_SetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Dtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_DtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_BtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_BtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_SetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_DtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_DtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_LclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Lcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_LclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_Btn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_EastBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_DtlSetItmAll((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitUPD_LclAll((MABSP_SetItmReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_SetItmReg_MC.statusInitFIX_ScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Top((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Fold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Cnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Ctrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_BulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_TopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_SetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Dtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_DtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_BtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_BtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_SetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_DtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_DtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_LclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Lcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_LclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_Btn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_EastBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_DtlSetItmAll((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitFIX_LclAll((MABSP_SetItmReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_SetItmReg_MC.statusInitDEL_ScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Top((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Fold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Cnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Ctrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_BulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_TopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_SetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Dtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_DtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_BtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_BtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_SetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_DtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_DtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_LclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Lcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_LclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_Btn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_EastBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_DtlSetItmAll((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitDEL_LclAll((MABSP_SetItmReg)this);

		// [REF]ステータスのモードの設定
		MABSP_SetItmReg_MC.statusInitREF_ScreenOpe((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Top((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Fold((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Cnd((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Ctrl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_BulkSet((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_TopDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_SetGrp((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Dtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_DtlBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_BtmDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_BtmTab((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_SetItmWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_DtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_DtlBtnSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_LclWrk((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Lcl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_LclBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_Btn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_EastBtn((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_DtlSetItmAll((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.statusInitREF_LclAll((MABSP_SetItmReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_SetItmReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_SetItmReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_SetItmReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_SetItmReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_set_grp_cd.setListListener(p);
		p.Cnd_set_grp_cd.addAllListener(p);
		p.Cnd_set_grp_nm.setListListener(p);
		p.Cnd_set_grp_nm.addAllListener(p);
		p.Cnd_main_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_main_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_set_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_set_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
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
	protected static void mcInitCtrl(MABSP_SetItmReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_SetItmReg p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_set_dt.addAllListener(p);
		p.BulkSet_set_dt.setAPMethodName("doBulkSet_set_dt");
	}

	/**
	 *  [TopDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTopDtl(MABSP_SetItmReg p) {
	}

	/**
	 *  [SetGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSetGrp(MABSP_SetItmReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_SetItmReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_set_grp_cd.addAllListener(p);
		p.columnDtl_set_grp_cd.setListListener(p);
		p.columnDtl_set_grp_nm_lcl.addAllListener(p);
		p.columnDtl_set_grp_nm_lcl.setListListener(p);
		p.columnDtl_set_grp_nm.addAllListener(p);
		p.columnDtl_set_grp_nm.setListListener(p);
		p.columnDtl_ship_assort_flg.addAllListener(p);
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
	protected static void mcInitDtlBtn(MABSP_SetItmReg p) {
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
	 *  [BtmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmDtl(MABSP_SetItmReg p) {
	}

	/**
	 *  [BtmTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmTab(MABSP_SetItmReg p) {
		p.BtmTabTab.addAllListener(p);
	}

	/**
	 *  [SetItmWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSetItmWrk(MABSP_SetItmReg p) {
	}

	/**
	 *  [DtlSetItm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlSetItm(MABSP_SetItmReg p) {
		p.DtlSetItmTable.addAllListener(p);
		p.columnDtlSetItm_check.addAllListener(p);
		p.columnDtlSetItm_del_flg.addAllListener(p);
		p.columnDtlSetItm_set_grp_cd.addAllListener(p);
		p.columnDtlSetItm_set_grp_cd.setListListener(p);
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlSetItm_main_itm_typ.addAllListener(p);
		p.columnDtlSetItm_main_itm_typ.setListListener(p);
		p.columnDtlSetItm_main_itm_typ_nm.addAllListener(p);
		p.columnDtlSetItm_main_itm_typ_nm.setListListener(p);
		p.columnDtlSetItm_main_itm_typ_d_cd.addAllListener(p);
		p.columnDtlSetItm_main_itm_typ_d_cd.setListListener(p);
		p.columnDtlSetItm_main_itm_typ_d_nm.addAllListener(p);
		p.columnDtlSetItm_main_itm_typ_d_nm.setListListener(p);
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtlSetItm_set_itm_typ.addAllListener(p);
		p.columnDtlSetItm_set_itm_typ.setListListener(p);
		p.columnDtlSetItm_set_itm_typ_nm.addAllListener(p);
		p.columnDtlSetItm_set_itm_typ_nm.setListListener(p);
		p.columnDtlSetItm_set_itm_typ_d_cd.addAllListener(p);
		p.columnDtlSetItm_set_itm_typ_d_cd.setListListener(p);
		p.columnDtlSetItm_set_itm_typ_d_nm.addAllListener(p);
		p.columnDtlSetItm_set_itm_typ_d_nm.setListListener(p);
		p.columnDtlSetItm_main_itm_unit_cd.addAllListener(p);
		p.columnDtlSetItm_main_itm_unit_cd.setListListener(p);
		p.columnDtlSetItm_main_itm_unit_nm.addAllListener(p);
		p.columnDtlSetItm_main_itm_unit_nm.setListListener(p);
		p.columnDtlSetItm_main_itm_dec_place.addAllListener(p);
		p.columnDtlSetItm_main_itm_dec_place.setListListener(p);
		p.columnDtlSetItm_set_itm_unit_cd.addAllListener(p);
		p.columnDtlSetItm_set_itm_unit_cd.setListListener(p);
		p.columnDtlSetItm_set_itm_unit_nm.addAllListener(p);
		p.columnDtlSetItm_set_itm_unit_nm.setListListener(p);
		p.columnDtlSetItm_set_itm_dec_place.addAllListener(p);
		p.columnDtlSetItm_set_itm_dec_place.setListListener(p);
		p.columnDtlSetItm_memo1.addAllListener(p);
		p.columnDtlSetItm_memo1.setListListener(p);
		p.columnDtlSetItm_memo2.addAllListener(p);
		p.columnDtlSetItm_memo2.setListListener(p);
		p.columnDtlSetItm_memo3.addAllListener(p);
		p.columnDtlSetItm_memo3.setListListener(p);
		p.columnDtlSetItm_ins_usr_id.addAllListener(p);
		p.columnDtlSetItm_ins_usr_id.setListListener(p);
		p.columnDtlSetItm_ins_usr_nm.addAllListener(p);
		p.columnDtlSetItm_ins_usr_nm.setListListener(p);
		p.columnDtlSetItm_ins_ts.addAllListener(p);
		p.columnDtlSetItm_ins_ts.setListListener(p);
		p.columnDtlSetItm_ins_func_id.addAllListener(p);
		p.columnDtlSetItm_ins_func_id.setListListener(p);
		p.columnDtlSetItm_ins_func_nm.addAllListener(p);
		p.columnDtlSetItm_ins_func_nm.setListListener(p);
		p.columnDtlSetItm_upd_cntr.addAllListener(p);
		p.columnDtlSetItm_upd_cntr.setListListener(p);
		p.columnDtlSetItm_upd_usr_id.addAllListener(p);
		p.columnDtlSetItm_upd_usr_id.setListListener(p);
		p.columnDtlSetItm_upd_usr_nm.addAllListener(p);
		p.columnDtlSetItm_upd_usr_nm.setListListener(p);
		p.columnDtlSetItm_upd_ts.addAllListener(p);
		p.columnDtlSetItm_upd_ts.setListListener(p);
		p.columnDtlSetItm_upd_func_id.addAllListener(p);
		p.columnDtlSetItm_upd_func_id.setListListener(p);
		p.columnDtlSetItm_upd_func_nm.addAllListener(p);
		p.columnDtlSetItm_upd_func_nm.setListListener(p);
		p.columnDtlSetItm_upd_srv_req_no.addAllListener(p);
		p.columnDtlSetItm_upd_srv_req_no.setListListener(p);
		p.columnDtlSetItm_del_usr_id.addAllListener(p);
		p.columnDtlSetItm_del_usr_id.setListListener(p);
		p.columnDtlSetItm_del_usr_nm.addAllListener(p);
		p.columnDtlSetItm_del_usr_nm.setListListener(p);
		p.columnDtlSetItm_del_ts.addAllListener(p);
		p.columnDtlSetItm_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtnSetItm]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtnSetItm(MABSP_SetItmReg p) {
		p.DtlBtnSetItm_select_all.addAllListener(p);
		p.DtlBtnSetItm_select_all.setAPMethodName("doDtlBtnSetItm_select_all");
		p.DtlBtnSetItm_deselect_all.addAllListener(p);
		p.DtlBtnSetItm_deselect_all.setAPMethodName("doDtlBtnSetItm_deselect_all");
		p.DtlBtnSetItm_radd.addAllListener(p);
		p.DtlBtnSetItm_radd.setAPMethodName("doDtlBtnSetItm_radd");
		p.DtlBtnSetItm_rdel.addAllListener(p);
		p.DtlBtnSetItm_rdel.setAPMethodName("doDtlBtnSetItm_rdel");
		p.DtlBtnSetItm_rcopy.addAllListener(p);
		p.DtlBtnSetItm_rcopy.setAPMethodName("doDtlBtnSetItm_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABSP_SetItmReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABSP_SetItmReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_set_grp_cd.addAllListener(p);
		p.columnLcl_set_grp_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_set_grp_nm.addAllListener(p);
		p.columnLcl_set_grp_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABSP_SetItmReg p) {
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
	protected static void mcInitBtn(MABSP_SetItmReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_SetItmReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_SetItmReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_set_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_set_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_main_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_set_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_SetItmReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TopDtl(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[SetGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SetGrp(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_SetItmReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_set_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_set_grp_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_assort_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
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
	protected static void statusInitUPD_DtlBtn(MABSP_SetItmReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmDtl(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmTab(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[SetItmWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SetItmWrk(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[DtlSetItm]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSetItm(MABSP_SetItmReg p){
		p.columnDtlSetItm_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSetItm_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSetItm_set_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlSetItm_main_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.DtlSetItm_set_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtlSetItm_set_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSetItm_main_itm_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlSetItm_set_itm_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlSetItm_set_itm_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlSetItm_set_itm_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtlSetItm_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSetItm_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSetItm_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlSetItm_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlSetItm_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtnSetItm]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtnSetItm(MABSP_SetItmReg p){
		p.DtlBtnSetItm_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnSetItm_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnSetItm_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnSetItm_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnSetItm_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABSP_SetItmReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_set_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_set_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABSP_SetItmReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_SetItmReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[DtlSetItmAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlSetItmAll(MABSP_SetItmReg p){

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_SetItmReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_set_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_set_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_main_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_set_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_SetItmReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TopDtl(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[SetGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SetGrp(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_SetItmReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_set_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_assort_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABSP_SetItmReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmDtl(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmTab(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[SetItmWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SetItmWrk(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[DtlSetItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlSetItm(MABSP_SetItmReg p){
		p.columnDtlSetItm_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.DtlSetItm_set_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlSetItm_set_itm_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlSetItm_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtnSetItm]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtnSetItm(MABSP_SetItmReg p){
		p.DtlBtnSetItm_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnSetItm_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnSetItm_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnSetItm_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnSetItm_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABSP_SetItmReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_set_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_set_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABSP_SetItmReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_SetItmReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[DtlSetItmAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlSetItmAll(MABSP_SetItmReg p){

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_SetItmReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_set_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_set_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_main_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_set_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_SetItmReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TopDtl(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[SetGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SetGrp(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_SetItmReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_assort_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABSP_SetItmReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmDtl(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmTab(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[SetItmWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SetItmWrk(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[DtlSetItm]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlSetItm(MABSP_SetItmReg p){
		p.columnDtlSetItm_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.DtlSetItm_set_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlSetItm_set_itm_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlSetItm_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtnSetItm]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtnSetItm(MABSP_SetItmReg p){
		p.DtlBtnSetItm_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnSetItm_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnSetItm_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnSetItm_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnSetItm_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABSP_SetItmReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_set_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_set_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABSP_SetItmReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_SetItmReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[DtlSetItmAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlSetItmAll(MABSP_SetItmReg p){

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_SetItmReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_set_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_set_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_main_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_set_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_SetItmReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TopDtl(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[SetGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_SetGrp(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_SetItmReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_assort_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABSP_SetItmReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmTab(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[SetItmWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_SetItmWrk(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[DtlSetItm]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSetItm(MABSP_SetItmReg p){
		p.columnDtlSetItm_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSetItm_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.DtlSetItm_set_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_main_itm_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlSetItm_main_itm_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_set_itm_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlSetItm_set_itm_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtlSetItm_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlSetItm_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlSetItm_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtnSetItm]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtnSetItm(MABSP_SetItmReg p){
		p.DtlBtnSetItm_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnSetItm_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnSetItm_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnSetItm_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnSetItm_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABSP_SetItmReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_set_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_set_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABSP_SetItmReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_SetItmReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[DtlSetItmAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlSetItmAll(MABSP_SetItmReg p){

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABSP_SetItmReg p){

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
		MABSP_SetItmReg_MC.setTableConfigDtl((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.setTableConfigDtlSetItm((MABSP_SetItmReg)this);
		MABSP_SetItmReg_MC.setTableConfigLcl((MABSP_SetItmReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_SetItmReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP1060.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP1060.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_set_grp_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlR.set_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_grp_cd);
		p.columnDtl_set_grp_nm_lcl.setMeta(mcframe.clientMABS.MABSP1060.DtlR.set_grp_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_grp_nm_lcl);
		p.columnDtl_set_grp_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.set_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_grp_nm);
		p.columnDtl_ship_assort_flg.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ship_assort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_assort_flg);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP1060.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP1060.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP1060.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1060.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [DtlSetItm]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlSetItm(MABSP_SetItmReg p) {
		p.columnDtlSetItm_check.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.check_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_check);
		p.columnDtlSetItm_del_flg.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.del_flg_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_del_flg);
		p.columnDtlSetItm_set_grp_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_grp_cd_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_grp_cd);
		p.DtlSetItmTable.addTable(p.DtlSetItm_main_itm_p_PPanel.ItmTable);
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtlSetItm_main_itm_nm, p.columnDtlSetItm_main_itm_typ, p.columnDtlSetItm_main_itm_typ_nm, p.columnDtlSetItm_main_itm_typ_d_cd, p.columnDtlSetItm_main_itm_typ_d_nm, p.columnDtlSetItm_main_itm_sub1, p.columnDtlSetItm_main_itm_sub2, p.columnDtlSetItm_main_itm_sub3, p.columnDtlSetItm_main_itm_unit_cd, p.columnDtlSetItm_main_itm_unit_nm, p.columnDtlSetItm_main_itm_dec_place);
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtlSetItm_main_itm_nm, p.columnDtlSetItm_main_itm_typ, p.columnDtlSetItm_main_itm_typ_nm, p.columnDtlSetItm_main_itm_typ_d_cd, p.columnDtlSetItm_main_itm_typ_d_nm, p.columnDtlSetItm_main_itm_sub2, p.columnDtlSetItm_main_itm_sub3, p.columnDtlSetItm_main_itm_unit_cd, p.columnDtlSetItm_main_itm_unit_nm, p.columnDtlSetItm_main_itm_dec_place);
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtlSetItm_main_itm_nm, p.columnDtlSetItm_main_itm_typ, p.columnDtlSetItm_main_itm_typ_nm, p.columnDtlSetItm_main_itm_typ_d_cd, p.columnDtlSetItm_main_itm_typ_d_nm, p.columnDtlSetItm_main_itm_sub3, p.columnDtlSetItm_main_itm_unit_cd, p.columnDtlSetItm_main_itm_unit_nm, p.columnDtlSetItm_main_itm_dec_place);
		p.DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtlSetItm_main_itm_nm, p.columnDtlSetItm_main_itm_typ, p.columnDtlSetItm_main_itm_typ_nm, p.columnDtlSetItm_main_itm_typ_d_cd, p.columnDtlSetItm_main_itm_typ_d_nm, p.columnDtlSetItm_main_itm_unit_cd, p.columnDtlSetItm_main_itm_unit_nm, p.columnDtlSetItm_main_itm_dec_place);
		p.columnDtlSetItm_main_itm_typ.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_typ_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_typ);
		p.columnDtlSetItm_main_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_typ_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_typ_nm);
		p.columnDtlSetItm_main_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_typ_d_cd_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_typ_d_cd);
		p.columnDtlSetItm_main_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_typ_d_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_typ_d_nm);
		p.DtlSetItmTable.addTable(p.DtlSetItm_set_itm_p_PPanel.ItmTable);
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtlSetItm_set_itm_nm, p.columnDtlSetItm_set_itm_typ, p.columnDtlSetItm_set_itm_typ_nm, p.columnDtlSetItm_set_itm_typ_d_cd, p.columnDtlSetItm_set_itm_typ_d_nm, p.columnDtlSetItm_set_itm_sub1, p.columnDtlSetItm_set_itm_sub2, p.columnDtlSetItm_set_itm_sub3, p.columnDtlSetItm_set_itm_unit_cd, p.columnDtlSetItm_set_itm_unit_nm, p.columnDtlSetItm_set_itm_dec_place);
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtlSetItm_set_itm_nm, p.columnDtlSetItm_set_itm_typ, p.columnDtlSetItm_set_itm_typ_nm, p.columnDtlSetItm_set_itm_typ_d_cd, p.columnDtlSetItm_set_itm_typ_d_nm, p.columnDtlSetItm_set_itm_sub2, p.columnDtlSetItm_set_itm_sub3, p.columnDtlSetItm_set_itm_unit_cd, p.columnDtlSetItm_set_itm_unit_nm, p.columnDtlSetItm_set_itm_dec_place);
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtlSetItm_set_itm_nm, p.columnDtlSetItm_set_itm_typ, p.columnDtlSetItm_set_itm_typ_nm, p.columnDtlSetItm_set_itm_typ_d_cd, p.columnDtlSetItm_set_itm_typ_d_nm, p.columnDtlSetItm_set_itm_sub3, p.columnDtlSetItm_set_itm_unit_cd, p.columnDtlSetItm_set_itm_unit_nm, p.columnDtlSetItm_set_itm_dec_place);
		p.DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtlSetItm_set_itm_nm, p.columnDtlSetItm_set_itm_typ, p.columnDtlSetItm_set_itm_typ_nm, p.columnDtlSetItm_set_itm_typ_d_cd, p.columnDtlSetItm_set_itm_typ_d_nm, p.columnDtlSetItm_set_itm_unit_cd, p.columnDtlSetItm_set_itm_unit_nm, p.columnDtlSetItm_set_itm_dec_place);
		p.columnDtlSetItm_set_itm_typ.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_typ_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_typ);
		p.columnDtlSetItm_set_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_typ_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_typ_nm);
		p.columnDtlSetItm_set_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_typ_d_cd_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_typ_d_cd);
		p.columnDtlSetItm_set_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_typ_d_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_typ_d_nm);
		p.columnDtlSetItm_main_itm_unit_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_unit_cd_META);
		p.columnDtlSetItm_main_itm_unit_cd.addLinkBeans(p.columnDtlSetItm_main_itm_unit_nm,p.columnDtlSetItm_main_itm_dec_place);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_unit_cd);
		p.columnDtlSetItm_main_itm_unit_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_unit_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_unit_nm);
		p.columnDtlSetItm_main_itm_dec_place.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.main_itm_dec_place_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_main_itm_dec_place);
		p.DtlSetItmTable.addTable(p.DtlSetItm_main_itm_qty_p_PPanel.QtyTable);
		p.columnDtlSetItm_set_itm_unit_cd.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_unit_cd_META);
		p.columnDtlSetItm_set_itm_unit_cd.addLinkBeans(p.columnDtlSetItm_set_itm_unit_nm,p.columnDtlSetItm_set_itm_dec_place);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_unit_cd);
		p.columnDtlSetItm_set_itm_unit_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_unit_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_unit_nm);
		p.columnDtlSetItm_set_itm_dec_place.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.set_itm_dec_place_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_set_itm_dec_place);
		p.DtlSetItmTable.addTable(p.DtlSetItm_set_itm_qty_p_PPanel.QtyTable);
		p.columnDtlSetItm_memo1.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.memo1_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_memo1);
		p.columnDtlSetItm_memo2.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.memo2_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_memo2);
		p.columnDtlSetItm_memo3.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.memo3_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_memo3);
		p.columnDtlSetItm_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.ins_usr_id_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_ins_usr_id);
		p.columnDtlSetItm_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.ins_usr_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_ins_usr_nm);
		p.columnDtlSetItm_ins_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.ins_ts_META);
		p.columnDtlSetItm_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_ins_ts);
		p.columnDtlSetItm_ins_func_id.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.ins_func_id_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_ins_func_id);
		p.columnDtlSetItm_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.ins_func_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_ins_func_nm);
		p.columnDtlSetItm_upd_cntr.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_cntr_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_cntr);
		p.columnDtlSetItm_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_usr_id_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_usr_id);
		p.columnDtlSetItm_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_usr_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_usr_nm);
		p.columnDtlSetItm_upd_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_ts_META);
		p.columnDtlSetItm_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_ts);
		p.columnDtlSetItm_upd_func_id.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_func_id_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_func_id);
		p.columnDtlSetItm_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_func_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_func_nm);
		p.columnDtlSetItm_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.upd_srv_req_no_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_upd_srv_req_no);
		p.columnDtlSetItm_del_usr_id.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.del_usr_id_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_del_usr_id);
		p.columnDtlSetItm_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.del_usr_nm_META);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_del_usr_nm);
		p.columnDtlSetItm_del_ts.setMeta(mcframe.clientMABS.MABSP1060.DtlSetItmR.del_ts_META);
		p.columnDtlSetItm_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlSetItmTable.addColumnConfig(p.columnDtlSetItm_del_ts);
		// スクロール固定カラムの指定
		p.DtlSetItmTable.setUnscrollColumn(p.columnDtlSetItm_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABSP_SetItmReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABS.MABSP1060.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_set_grp_cd.setMeta(mcframe.clientMABS.MABSP1060.LclR.set_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_set_grp_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABS.MABSP1060.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_set_grp_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.set_grp_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_set_grp_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABS.MABSP1060.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABS.MABSP1060.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABS.MABSP1060.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1060.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABS.MABSP1060.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1060.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1060.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_set_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_set_grp_cd.getListConfig().setPutter(getCnd_set_grp_cd_ListPutter());
		Cnd_main_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_main_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_main_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_main_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_main_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_main_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_main_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_set_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_set_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_set_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_set_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_set_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_set_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_set_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtlSetItm_main_itm_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSetItm_main_itm_unit_cd.getListConfig().setPutter(getDtlSetItm_main_itm_unit_cd_ListPutter());
		columnDtlSetItm_set_itm_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlSetItm_set_itm_unit_cd.getListConfig().setPutter(getDtlSetItm_set_itm_unit_cd_ListPutter());
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
	 * [Cnd_set_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SetGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_main_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_main_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_main_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_main_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_set_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [DtlSetItm_main_itm_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_main_itm_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [DtlSetItm_set_itm_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlSetItm_set_itm_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
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
		if(combo == Cnd_set_grp_cd) return getCnd_set_grp_cd(row, info);
		if(combo == Cnd_main_itm_p_PPanel.Itm_itm_cd) return getCnd_main_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_main_itm_p_PPanel.Itm_itm_sub1) return getCnd_main_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_main_itm_p_PPanel.Itm_itm_sub2) return getCnd_main_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_main_itm_p_PPanel.Itm_itm_sub3) return getCnd_main_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_set_itm_p_PPanel.Itm_itm_cd) return getCnd_set_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_set_itm_p_PPanel.Itm_itm_sub1) return getCnd_set_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_set_itm_p_PPanel.Itm_itm_sub2) return getCnd_set_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_set_itm_p_PPanel.Itm_itm_sub3) return getCnd_set_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == DtlSetItm_main_itm_p_PPanel.columnItm_itm_cd) return getDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub1) return getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub2) return getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == DtlSetItm_main_itm_p_PPanel.columnItm_itm_sub3) return getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == DtlSetItm_set_itm_p_PPanel.columnItm_itm_cd) return getDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub1) return getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub2) return getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == DtlSetItm_set_itm_p_PPanel.columnItm_itm_sub3) return getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtlSetItm_main_itm_unit_cd) return getDtlSetItm_main_itm_unit_cd(row, info);
		if(combo == columnDtlSetItm_set_itm_unit_cd) return getDtlSetItm_set_itm_unit_cd(row, info);
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
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtnSetItm_select_all) doDtlBtnSetItm_select_all(info);
		else if (ap == DtlBtnSetItm_deselect_all) doDtlBtnSetItm_deselect_all(info);
		else if (ap == DtlBtnSetItm_radd) doDtlBtnSetItm_radd(info);
		else if (ap == DtlBtnSetItm_rdel) doDtlBtnSetItm_rdel(info);
		else if (ap == DtlBtnSetItm_rcopy) doDtlBtnSetItm_rcopy(info);
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
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

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
	 * [DtlBtnSetItm]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnSetItm_select_all(MCEventInfo info);

	/**
	 * [DtlBtnSetItm]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnSetItm_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtnSetItm]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnSetItm_radd(MCEventInfo info);

	/**
	 * [DtlBtnSetItm]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnSetItm_rdel(MCEventInfo info);

	/**
	 * [DtlBtnSetItm]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnSetItm_rcopy(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == BtmTabTab) return doBtmTab_VC(info);
		if (vc == DtlSetItmTable) return doDtlSetItm_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_set_grp_cd) return doCnd_set_grp_cd_VC(info);
		if (vc == Cnd_set_grp_nm) return doCnd_set_grp_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_set_grp_cd) return doDtl_set_grp_cd_VC(info);
		if (vc == columnDtl_set_grp_nm_lcl) return doDtl_set_grp_nm_lcl_VC(info);
		if (vc == columnDtl_set_grp_nm) return doDtl_set_grp_nm_VC(info);
		if (vc == columnDtl_ship_assort_flg) return doDtl_ship_assort_flg_VC(info);
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
		if (vc == columnDtlSetItm_check) return doDtlSetItm_check_VC(info);
		if (vc == columnDtlSetItm_del_flg) return doDtlSetItm_del_flg_VC(info);
		if (vc == columnDtlSetItm_set_grp_cd) return doDtlSetItm_set_grp_cd_VC(info);
		if (vc == columnDtlSetItm_main_itm_typ) return doDtlSetItm_main_itm_typ_VC(info);
		if (vc == columnDtlSetItm_main_itm_typ_nm) return doDtlSetItm_main_itm_typ_nm_VC(info);
		if (vc == columnDtlSetItm_main_itm_typ_d_cd) return doDtlSetItm_main_itm_typ_d_cd_VC(info);
		if (vc == columnDtlSetItm_main_itm_typ_d_nm) return doDtlSetItm_main_itm_typ_d_nm_VC(info);
		if (vc == columnDtlSetItm_set_itm_typ) return doDtlSetItm_set_itm_typ_VC(info);
		if (vc == columnDtlSetItm_set_itm_typ_nm) return doDtlSetItm_set_itm_typ_nm_VC(info);
		if (vc == columnDtlSetItm_set_itm_typ_d_cd) return doDtlSetItm_set_itm_typ_d_cd_VC(info);
		if (vc == columnDtlSetItm_set_itm_typ_d_nm) return doDtlSetItm_set_itm_typ_d_nm_VC(info);
		if (vc == columnDtlSetItm_main_itm_unit_cd) return doDtlSetItm_main_itm_unit_cd_VC(info);
		if (vc == columnDtlSetItm_main_itm_unit_nm) return doDtlSetItm_main_itm_unit_nm_VC(info);
		if (vc == columnDtlSetItm_main_itm_dec_place) return doDtlSetItm_main_itm_dec_place_VC(info);
		if (vc == columnDtlSetItm_set_itm_unit_cd) return doDtlSetItm_set_itm_unit_cd_VC(info);
		if (vc == columnDtlSetItm_set_itm_unit_nm) return doDtlSetItm_set_itm_unit_nm_VC(info);
		if (vc == columnDtlSetItm_set_itm_dec_place) return doDtlSetItm_set_itm_dec_place_VC(info);
		if (vc == columnDtlSetItm_memo1) return doDtlSetItm_memo1_VC(info);
		if (vc == columnDtlSetItm_memo2) return doDtlSetItm_memo2_VC(info);
		if (vc == columnDtlSetItm_memo3) return doDtlSetItm_memo3_VC(info);
		if (vc == columnDtlSetItm_ins_usr_id) return doDtlSetItm_ins_usr_id_VC(info);
		if (vc == columnDtlSetItm_ins_usr_nm) return doDtlSetItm_ins_usr_nm_VC(info);
		if (vc == columnDtlSetItm_ins_ts) return doDtlSetItm_ins_ts_VC(info);
		if (vc == columnDtlSetItm_ins_func_id) return doDtlSetItm_ins_func_id_VC(info);
		if (vc == columnDtlSetItm_ins_func_nm) return doDtlSetItm_ins_func_nm_VC(info);
		if (vc == columnDtlSetItm_upd_cntr) return doDtlSetItm_upd_cntr_VC(info);
		if (vc == columnDtlSetItm_upd_usr_id) return doDtlSetItm_upd_usr_id_VC(info);
		if (vc == columnDtlSetItm_upd_usr_nm) return doDtlSetItm_upd_usr_nm_VC(info);
		if (vc == columnDtlSetItm_upd_ts) return doDtlSetItm_upd_ts_VC(info);
		if (vc == columnDtlSetItm_upd_func_id) return doDtlSetItm_upd_func_id_VC(info);
		if (vc == columnDtlSetItm_upd_func_nm) return doDtlSetItm_upd_func_nm_VC(info);
		if (vc == columnDtlSetItm_upd_srv_req_no) return doDtlSetItm_upd_srv_req_no_VC(info);
		if (vc == columnDtlSetItm_del_usr_id) return doDtlSetItm_del_usr_id_VC(info);
		if (vc == columnDtlSetItm_del_usr_nm) return doDtlSetItm_del_usr_nm_VC(info);
		if (vc == columnDtlSetItm_del_ts) return doDtlSetItm_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_set_grp_cd) return doLcl_set_grp_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_set_grp_nm) return doLcl_set_grp_nm_VC(info);
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
	 * [BtmTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtmTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_set_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_set_grp_nm_VC(MCEventInfo info){
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
	 * [BulkSet]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_end_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_grp_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_grp_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_assort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_assort_flg_VC(MCEventInfo info){
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
	 * [DtlSetItm]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_main_itm_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_set_itm_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlSetItm]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlSetItm_del_ts_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_set_grp_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_set_grp_nm_VC(MCEventInfo info){
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
		else if (nc == BtmTabTab) doBtmTab_NC(info);
		else if (nc == DtlSetItmTable) doDtlSetItm_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_set_grp_cd) doCnd_set_grp_cd_NC(info);
		else if (nc == Cnd_set_grp_nm) doCnd_set_grp_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_set_grp_cd) doDtl_set_grp_cd_NC(info);
		else if (nc == columnDtl_set_grp_nm_lcl) doDtl_set_grp_nm_lcl_NC(info);
		else if (nc == columnDtl_set_grp_nm) doDtl_set_grp_nm_NC(info);
		else if (nc == columnDtl_ship_assort_flg) doDtl_ship_assort_flg_NC(info);
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
		else if (nc == columnDtlSetItm_check) doDtlSetItm_check_NC(info);
		else if (nc == columnDtlSetItm_del_flg) doDtlSetItm_del_flg_NC(info);
		else if (nc == columnDtlSetItm_set_grp_cd) doDtlSetItm_set_grp_cd_NC(info);
		else if (nc == columnDtlSetItm_main_itm_typ) doDtlSetItm_main_itm_typ_NC(info);
		else if (nc == columnDtlSetItm_main_itm_typ_nm) doDtlSetItm_main_itm_typ_nm_NC(info);
		else if (nc == columnDtlSetItm_main_itm_typ_d_cd) doDtlSetItm_main_itm_typ_d_cd_NC(info);
		else if (nc == columnDtlSetItm_main_itm_typ_d_nm) doDtlSetItm_main_itm_typ_d_nm_NC(info);
		else if (nc == columnDtlSetItm_set_itm_typ) doDtlSetItm_set_itm_typ_NC(info);
		else if (nc == columnDtlSetItm_set_itm_typ_nm) doDtlSetItm_set_itm_typ_nm_NC(info);
		else if (nc == columnDtlSetItm_set_itm_typ_d_cd) doDtlSetItm_set_itm_typ_d_cd_NC(info);
		else if (nc == columnDtlSetItm_set_itm_typ_d_nm) doDtlSetItm_set_itm_typ_d_nm_NC(info);
		else if (nc == columnDtlSetItm_main_itm_unit_cd) doDtlSetItm_main_itm_unit_cd_NC(info);
		else if (nc == columnDtlSetItm_main_itm_unit_nm) doDtlSetItm_main_itm_unit_nm_NC(info);
		else if (nc == columnDtlSetItm_main_itm_dec_place) doDtlSetItm_main_itm_dec_place_NC(info);
		else if (nc == columnDtlSetItm_set_itm_unit_cd) doDtlSetItm_set_itm_unit_cd_NC(info);
		else if (nc == columnDtlSetItm_set_itm_unit_nm) doDtlSetItm_set_itm_unit_nm_NC(info);
		else if (nc == columnDtlSetItm_set_itm_dec_place) doDtlSetItm_set_itm_dec_place_NC(info);
		else if (nc == columnDtlSetItm_memo1) doDtlSetItm_memo1_NC(info);
		else if (nc == columnDtlSetItm_memo2) doDtlSetItm_memo2_NC(info);
		else if (nc == columnDtlSetItm_memo3) doDtlSetItm_memo3_NC(info);
		else if (nc == columnDtlSetItm_ins_usr_id) doDtlSetItm_ins_usr_id_NC(info);
		else if (nc == columnDtlSetItm_ins_usr_nm) doDtlSetItm_ins_usr_nm_NC(info);
		else if (nc == columnDtlSetItm_ins_ts) doDtlSetItm_ins_ts_NC(info);
		else if (nc == columnDtlSetItm_ins_func_id) doDtlSetItm_ins_func_id_NC(info);
		else if (nc == columnDtlSetItm_ins_func_nm) doDtlSetItm_ins_func_nm_NC(info);
		else if (nc == columnDtlSetItm_upd_cntr) doDtlSetItm_upd_cntr_NC(info);
		else if (nc == columnDtlSetItm_upd_usr_id) doDtlSetItm_upd_usr_id_NC(info);
		else if (nc == columnDtlSetItm_upd_usr_nm) doDtlSetItm_upd_usr_nm_NC(info);
		else if (nc == columnDtlSetItm_upd_ts) doDtlSetItm_upd_ts_NC(info);
		else if (nc == columnDtlSetItm_upd_func_id) doDtlSetItm_upd_func_id_NC(info);
		else if (nc == columnDtlSetItm_upd_func_nm) doDtlSetItm_upd_func_nm_NC(info);
		else if (nc == columnDtlSetItm_upd_srv_req_no) doDtlSetItm_upd_srv_req_no_NC(info);
		else if (nc == columnDtlSetItm_del_usr_id) doDtlSetItm_del_usr_id_NC(info);
		else if (nc == columnDtlSetItm_del_usr_nm) doDtlSetItm_del_usr_nm_NC(info);
		else if (nc == columnDtlSetItm_del_ts) doDtlSetItm_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_set_grp_cd) doLcl_set_grp_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_set_grp_nm) doLcl_set_grp_nm_NC(info);
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
	 * [BtmTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NC(MCEventInfo info){
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
	 * [BulkSet]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_assort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_assort_flg_NC(MCEventInfo info){
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
	 * [DtlSetItm]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[set_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_nm_NC(MCEventInfo info){
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
		else if (ne == BtmTabTab) doBtmTab_NE(info);
		else if (ne == DtlSetItmTable) doDtlSetItm_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_set_grp_cd) doCnd_set_grp_cd_NE(info);
		else if (ne == Cnd_set_grp_nm) doCnd_set_grp_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_set_grp_cd) doDtl_set_grp_cd_NE(info);
		else if (ne == columnDtl_set_grp_nm_lcl) doDtl_set_grp_nm_lcl_NE(info);
		else if (ne == columnDtl_set_grp_nm) doDtl_set_grp_nm_NE(info);
		else if (ne == columnDtl_ship_assort_flg) doDtl_ship_assort_flg_NE(info);
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
		else if (ne == columnDtlSetItm_check) doDtlSetItm_check_NE(info);
		else if (ne == columnDtlSetItm_del_flg) doDtlSetItm_del_flg_NE(info);
		else if (ne == columnDtlSetItm_set_grp_cd) doDtlSetItm_set_grp_cd_NE(info);
		else if (ne == columnDtlSetItm_main_itm_typ) doDtlSetItm_main_itm_typ_NE(info);
		else if (ne == columnDtlSetItm_main_itm_typ_nm) doDtlSetItm_main_itm_typ_nm_NE(info);
		else if (ne == columnDtlSetItm_main_itm_typ_d_cd) doDtlSetItm_main_itm_typ_d_cd_NE(info);
		else if (ne == columnDtlSetItm_main_itm_typ_d_nm) doDtlSetItm_main_itm_typ_d_nm_NE(info);
		else if (ne == columnDtlSetItm_set_itm_typ) doDtlSetItm_set_itm_typ_NE(info);
		else if (ne == columnDtlSetItm_set_itm_typ_nm) doDtlSetItm_set_itm_typ_nm_NE(info);
		else if (ne == columnDtlSetItm_set_itm_typ_d_cd) doDtlSetItm_set_itm_typ_d_cd_NE(info);
		else if (ne == columnDtlSetItm_set_itm_typ_d_nm) doDtlSetItm_set_itm_typ_d_nm_NE(info);
		else if (ne == columnDtlSetItm_main_itm_unit_cd) doDtlSetItm_main_itm_unit_cd_NE(info);
		else if (ne == columnDtlSetItm_main_itm_unit_nm) doDtlSetItm_main_itm_unit_nm_NE(info);
		else if (ne == columnDtlSetItm_main_itm_dec_place) doDtlSetItm_main_itm_dec_place_NE(info);
		else if (ne == columnDtlSetItm_set_itm_unit_cd) doDtlSetItm_set_itm_unit_cd_NE(info);
		else if (ne == columnDtlSetItm_set_itm_unit_nm) doDtlSetItm_set_itm_unit_nm_NE(info);
		else if (ne == columnDtlSetItm_set_itm_dec_place) doDtlSetItm_set_itm_dec_place_NE(info);
		else if (ne == columnDtlSetItm_memo1) doDtlSetItm_memo1_NE(info);
		else if (ne == columnDtlSetItm_memo2) doDtlSetItm_memo2_NE(info);
		else if (ne == columnDtlSetItm_memo3) doDtlSetItm_memo3_NE(info);
		else if (ne == columnDtlSetItm_ins_usr_id) doDtlSetItm_ins_usr_id_NE(info);
		else if (ne == columnDtlSetItm_ins_usr_nm) doDtlSetItm_ins_usr_nm_NE(info);
		else if (ne == columnDtlSetItm_ins_ts) doDtlSetItm_ins_ts_NE(info);
		else if (ne == columnDtlSetItm_ins_func_id) doDtlSetItm_ins_func_id_NE(info);
		else if (ne == columnDtlSetItm_ins_func_nm) doDtlSetItm_ins_func_nm_NE(info);
		else if (ne == columnDtlSetItm_upd_cntr) doDtlSetItm_upd_cntr_NE(info);
		else if (ne == columnDtlSetItm_upd_usr_id) doDtlSetItm_upd_usr_id_NE(info);
		else if (ne == columnDtlSetItm_upd_usr_nm) doDtlSetItm_upd_usr_nm_NE(info);
		else if (ne == columnDtlSetItm_upd_ts) doDtlSetItm_upd_ts_NE(info);
		else if (ne == columnDtlSetItm_upd_func_id) doDtlSetItm_upd_func_id_NE(info);
		else if (ne == columnDtlSetItm_upd_func_nm) doDtlSetItm_upd_func_nm_NE(info);
		else if (ne == columnDtlSetItm_upd_srv_req_no) doDtlSetItm_upd_srv_req_no_NE(info);
		else if (ne == columnDtlSetItm_del_usr_id) doDtlSetItm_del_usr_id_NE(info);
		else if (ne == columnDtlSetItm_del_usr_nm) doDtlSetItm_del_usr_nm_NE(info);
		else if (ne == columnDtlSetItm_del_ts) doDtlSetItm_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_set_grp_cd) doLcl_set_grp_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_set_grp_nm) doLcl_set_grp_nm_NE(info);
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
	 * [BtmTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NE(MCEventInfo info){
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
	 * [BulkSet]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_assort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_assort_flg_NE(MCEventInfo info){
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
	 * [DtlSetItm]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[set_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_nm_NE(MCEventInfo info){
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
		else if (nx == BtmTabTab) doBtmTab_NX(info);
		else if (nx == DtlSetItmTable) doDtlSetItm_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_set_grp_cd) doCnd_set_grp_cd_NX(info);
		else if (nx == Cnd_set_grp_nm) doCnd_set_grp_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_set_grp_cd) doDtl_set_grp_cd_NX(info);
		else if (nx == columnDtl_set_grp_nm_lcl) doDtl_set_grp_nm_lcl_NX(info);
		else if (nx == columnDtl_set_grp_nm) doDtl_set_grp_nm_NX(info);
		else if (nx == columnDtl_ship_assort_flg) doDtl_ship_assort_flg_NX(info);
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
		else if (nx == columnDtlSetItm_check) doDtlSetItm_check_NX(info);
		else if (nx == columnDtlSetItm_del_flg) doDtlSetItm_del_flg_NX(info);
		else if (nx == columnDtlSetItm_set_grp_cd) doDtlSetItm_set_grp_cd_NX(info);
		else if (nx == columnDtlSetItm_main_itm_typ) doDtlSetItm_main_itm_typ_NX(info);
		else if (nx == columnDtlSetItm_main_itm_typ_nm) doDtlSetItm_main_itm_typ_nm_NX(info);
		else if (nx == columnDtlSetItm_main_itm_typ_d_cd) doDtlSetItm_main_itm_typ_d_cd_NX(info);
		else if (nx == columnDtlSetItm_main_itm_typ_d_nm) doDtlSetItm_main_itm_typ_d_nm_NX(info);
		else if (nx == columnDtlSetItm_set_itm_typ) doDtlSetItm_set_itm_typ_NX(info);
		else if (nx == columnDtlSetItm_set_itm_typ_nm) doDtlSetItm_set_itm_typ_nm_NX(info);
		else if (nx == columnDtlSetItm_set_itm_typ_d_cd) doDtlSetItm_set_itm_typ_d_cd_NX(info);
		else if (nx == columnDtlSetItm_set_itm_typ_d_nm) doDtlSetItm_set_itm_typ_d_nm_NX(info);
		else if (nx == columnDtlSetItm_main_itm_unit_cd) doDtlSetItm_main_itm_unit_cd_NX(info);
		else if (nx == columnDtlSetItm_main_itm_unit_nm) doDtlSetItm_main_itm_unit_nm_NX(info);
		else if (nx == columnDtlSetItm_main_itm_dec_place) doDtlSetItm_main_itm_dec_place_NX(info);
		else if (nx == columnDtlSetItm_set_itm_unit_cd) doDtlSetItm_set_itm_unit_cd_NX(info);
		else if (nx == columnDtlSetItm_set_itm_unit_nm) doDtlSetItm_set_itm_unit_nm_NX(info);
		else if (nx == columnDtlSetItm_set_itm_dec_place) doDtlSetItm_set_itm_dec_place_NX(info);
		else if (nx == columnDtlSetItm_memo1) doDtlSetItm_memo1_NX(info);
		else if (nx == columnDtlSetItm_memo2) doDtlSetItm_memo2_NX(info);
		else if (nx == columnDtlSetItm_memo3) doDtlSetItm_memo3_NX(info);
		else if (nx == columnDtlSetItm_ins_usr_id) doDtlSetItm_ins_usr_id_NX(info);
		else if (nx == columnDtlSetItm_ins_usr_nm) doDtlSetItm_ins_usr_nm_NX(info);
		else if (nx == columnDtlSetItm_ins_ts) doDtlSetItm_ins_ts_NX(info);
		else if (nx == columnDtlSetItm_ins_func_id) doDtlSetItm_ins_func_id_NX(info);
		else if (nx == columnDtlSetItm_ins_func_nm) doDtlSetItm_ins_func_nm_NX(info);
		else if (nx == columnDtlSetItm_upd_cntr) doDtlSetItm_upd_cntr_NX(info);
		else if (nx == columnDtlSetItm_upd_usr_id) doDtlSetItm_upd_usr_id_NX(info);
		else if (nx == columnDtlSetItm_upd_usr_nm) doDtlSetItm_upd_usr_nm_NX(info);
		else if (nx == columnDtlSetItm_upd_ts) doDtlSetItm_upd_ts_NX(info);
		else if (nx == columnDtlSetItm_upd_func_id) doDtlSetItm_upd_func_id_NX(info);
		else if (nx == columnDtlSetItm_upd_func_nm) doDtlSetItm_upd_func_nm_NX(info);
		else if (nx == columnDtlSetItm_upd_srv_req_no) doDtlSetItm_upd_srv_req_no_NX(info);
		else if (nx == columnDtlSetItm_del_usr_id) doDtlSetItm_del_usr_id_NX(info);
		else if (nx == columnDtlSetItm_del_usr_nm) doDtlSetItm_del_usr_nm_NX(info);
		else if (nx == columnDtlSetItm_del_ts) doDtlSetItm_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_set_grp_cd) doLcl_set_grp_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_set_grp_nm) doLcl_set_grp_nm_NX(info);
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
	 * [BtmTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_NX(MCEventInfo info){
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
	 * [BulkSet]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_assort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_assort_flg_NX(MCEventInfo info){
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
	 * [DtlSetItm]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[set_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_set_grp_cd) doCnd_set_grp_cd_LC(info);
		else if (lc == Cnd_set_grp_nm) doCnd_set_grp_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_set_grp_cd) doDtl_set_grp_cd_LC(info);
		else if (lc == columnDtl_set_grp_nm_lcl) doDtl_set_grp_nm_lcl_LC(info);
		else if (lc == columnDtl_set_grp_nm) doDtl_set_grp_nm_LC(info);
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
		else if (lc == columnDtlSetItm_set_grp_cd) doDtlSetItm_set_grp_cd_LC(info);
		else if (lc == columnDtlSetItm_main_itm_typ) doDtlSetItm_main_itm_typ_LC(info);
		else if (lc == columnDtlSetItm_main_itm_typ_nm) doDtlSetItm_main_itm_typ_nm_LC(info);
		else if (lc == columnDtlSetItm_main_itm_typ_d_cd) doDtlSetItm_main_itm_typ_d_cd_LC(info);
		else if (lc == columnDtlSetItm_main_itm_typ_d_nm) doDtlSetItm_main_itm_typ_d_nm_LC(info);
		else if (lc == columnDtlSetItm_set_itm_typ) doDtlSetItm_set_itm_typ_LC(info);
		else if (lc == columnDtlSetItm_set_itm_typ_nm) doDtlSetItm_set_itm_typ_nm_LC(info);
		else if (lc == columnDtlSetItm_set_itm_typ_d_cd) doDtlSetItm_set_itm_typ_d_cd_LC(info);
		else if (lc == columnDtlSetItm_set_itm_typ_d_nm) doDtlSetItm_set_itm_typ_d_nm_LC(info);
		else if (lc == columnDtlSetItm_main_itm_unit_cd) doDtlSetItm_main_itm_unit_cd_LC(info);
		else if (lc == columnDtlSetItm_main_itm_unit_nm) doDtlSetItm_main_itm_unit_nm_LC(info);
		else if (lc == columnDtlSetItm_main_itm_dec_place) doDtlSetItm_main_itm_dec_place_LC(info);
		else if (lc == columnDtlSetItm_set_itm_unit_cd) doDtlSetItm_set_itm_unit_cd_LC(info);
		else if (lc == columnDtlSetItm_set_itm_unit_nm) doDtlSetItm_set_itm_unit_nm_LC(info);
		else if (lc == columnDtlSetItm_set_itm_dec_place) doDtlSetItm_set_itm_dec_place_LC(info);
		else if (lc == columnDtlSetItm_memo1) doDtlSetItm_memo1_LC(info);
		else if (lc == columnDtlSetItm_memo2) doDtlSetItm_memo2_LC(info);
		else if (lc == columnDtlSetItm_memo3) doDtlSetItm_memo3_LC(info);
		else if (lc == columnDtlSetItm_ins_usr_id) doDtlSetItm_ins_usr_id_LC(info);
		else if (lc == columnDtlSetItm_ins_usr_nm) doDtlSetItm_ins_usr_nm_LC(info);
		else if (lc == columnDtlSetItm_ins_ts) doDtlSetItm_ins_ts_LC(info);
		else if (lc == columnDtlSetItm_ins_func_id) doDtlSetItm_ins_func_id_LC(info);
		else if (lc == columnDtlSetItm_ins_func_nm) doDtlSetItm_ins_func_nm_LC(info);
		else if (lc == columnDtlSetItm_upd_cntr) doDtlSetItm_upd_cntr_LC(info);
		else if (lc == columnDtlSetItm_upd_usr_id) doDtlSetItm_upd_usr_id_LC(info);
		else if (lc == columnDtlSetItm_upd_usr_nm) doDtlSetItm_upd_usr_nm_LC(info);
		else if (lc == columnDtlSetItm_upd_ts) doDtlSetItm_upd_ts_LC(info);
		else if (lc == columnDtlSetItm_upd_func_id) doDtlSetItm_upd_func_id_LC(info);
		else if (lc == columnDtlSetItm_upd_func_nm) doDtlSetItm_upd_func_nm_LC(info);
		else if (lc == columnDtlSetItm_upd_srv_req_no) doDtlSetItm_upd_srv_req_no_LC(info);
		else if (lc == columnDtlSetItm_del_usr_id) doDtlSetItm_del_usr_id_LC(info);
		else if (lc == columnDtlSetItm_del_usr_nm) doDtlSetItm_del_usr_nm_LC(info);
		else if (lc == columnDtlSetItm_del_ts) doDtlSetItm_del_ts_LC(info);
		else if (lc == columnLcl_set_grp_cd) doLcl_set_grp_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_set_grp_nm) doLcl_set_grp_nm_LC(info);
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
	 * [Cnd]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[set_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_set_grp_nm_LC(MCEventInfo info){
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
	 * [BulkSet]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_grp_nm_LC(MCEventInfo info){
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
	 * [DtlSetItm]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[main_itm_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_main_itm_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[set_itm_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_set_itm_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlSetItm]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlSetItm_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[set_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[set_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_set_grp_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_set_grp_cd]の作成メソッド
	 */
	public MCList getCnd_set_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSetGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_main_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_main_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_main_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_main_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_main_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_main_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_main_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_main_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_set_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_set_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_set_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_set_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_set_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_set_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_set_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_set_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_main_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtlSetItm_main_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtlSetItm_main_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_set_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtlSetItm_set_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[DtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtlSetItm_set_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSetItm_main_itm_unit_cd]の作成メソッド
	 */
	public MCList getDtlSetItm_main_itm_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlSetItm_set_itm_unit_cd]の作成メソッド
	 */
	public MCList getDtlSetItm_set_itm_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL1060.Srch01")) {
			return new MA_MABSL1060_Srch01Bridge();
		}
		if (id.equals("MA.MABSL1060.Upd01")) {
			return new MA_MABSL1060_Upd01Bridge();
		}
		if (id.equals("MA.MABSL1060.Del01")) {
			return new MA_MABSL1060_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL1060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1060_Srch01;

		/** コンストラクタ */
		protected MA_MABSL1060_Srch01Bridge() {
			p_MA_MABSL1060_Srch01 = new MCParam(PDef.MA_MABSL1060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP1060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.LclR.class));

			p_MA_MABSL1060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP1060.CndR up0() {
			return (mcframe.clientMABS.MABSP1060.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1060.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1060.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> down1() {
			return (MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1060.LclR> down2() {
			return (MCList<mcframe.clientMABS.MABSP1060.LclR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABSL1060_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlR.class));
			p_MA_MABSL1060_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.class));
			p_MA_MABSL1060_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1060.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1060_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP1060.DtlR>)p_MA_MABSL1060_Srch01.getContainerParam().getDownBlock(0));
			setDtlSetItmAllL((MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR>)p_MA_MABSL1060_Srch01.getContainerParam().getDownBlock(1));
			setLclAllL((MCList<mcframe.clientMABS.MABSP1060.LclR>)p_MA_MABSL1060_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDtlL().clear();
			getDtlSetItmAllL().clear();
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
			result.add(getDtlSetItmAllL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABSL1060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1060_Upd01;

		/** コンストラクタ */
		protected MA_MABSL1060_Upd01Bridge() {
			p_MA_MABSL1060_Upd01 = new MCParam(PDef.MA_MABSL1060_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1060_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlSetItmR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1060.LclR.class));
			// Down

			p_MA_MABSL1060_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1060_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1060_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL1060_Upd01.addUpBlock(getDtlSetItmAllL().shallowClone());
			p_MA_MABSL1060_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1060_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1060_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1060.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1060.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR> up1() {
			return (MCList<mcframe.clientMABS.MABSP1060.DtlSetItmR>)up(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1060.LclR> up2() {
			return (MCList<mcframe.clientMABS.MABSP1060.LclR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1060_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtlSetItmAllL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABSL1060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1060_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1060_Del01;

		/** コンストラクタ */
		protected MA_MABSL1060_Del01Bridge() {
			p_MA_MABSL1060_Del01 = new MCParam(PDef.MA_MABSL1060_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1060_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1060.DtlR.class));
			// Down

			p_MA_MABSL1060_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1060_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1060_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1060_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1060_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1060.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1060.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1060_Del01;
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