package mcframe.clientMABC.MABCP0460;

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
import mcframe.clientMABC.MABCP0460.MABCP_BpStopReg_MC.MA_MABCL0460_Srch01Caller;
import mcframe.clientMABC.MABCP0460.MABCP_BpStopReg_MC.MA_MABCL0460_Upd01Caller;
import mcframe.clientMABC.MABCP0460.MABCP_BpStopReg_MC.MA_MABCL0460_Del01Caller;

/**
 * 画面"MABCP_BpStopReg"パネルクラスです。<p>
 *
 * 取引先禁止マスタの検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_BpStopReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0460";

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
	// [CndTab]ブロック関連のField定義
	public MCPanel CndTabPanel = null;
	public MCTabbedPane CndTabTab = null;
	// [CndTab]ブロックの項目のField定義
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
	/**
	 * Allow sales order 受注　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_stop_f_flg = null;
	/**
	 * Prohibit sales order 受注　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_slo_stop_t_flg = null;
	public MCLabel Cnd_slo_stop_dt_fr_Label = null;
	/**
	 * Sales order prohibit date FROM 受注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_slo_stop_dt_fr = null;
	public MCLabel Cnd_slo_stop_dt_to_Label = null;
	/**
	 * Sales order prohibit date TO 受注禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_slo_stop_dt_to = null;
	/**
	 * Allow PO placement 発注　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_po_stop_f_flg = null;
	/**
	 * Prohibit PO placement 発注　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_po_stop_t_flg = null;
	public MCLabel Cnd_po_stop_dt_fr_Label = null;
	/**
	 * PO prohibit date FROM 発注禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_po_stop_dt_fr = null;
	public MCLabel Cnd_po_stop_dt_to_Label = null;
	/**
	 * PO prohibit date TO 発注禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_po_stop_dt_to = null;
	/**
	 * Allow sales/shipment 売上・出荷　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_stop_f_flg = null;
	/**
	 * Prohibit sales/shipment 売上・出荷　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_sls_stop_t_flg = null;
	public MCLabel Cnd_sls_stop_dt_fr_Label = null;
	/**
	 * Sales/shipment prohibited date FROM 売上・出荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_sls_stop_dt_fr = null;
	public MCLabel Cnd_sls_stop_dt_to_Label = null;
	/**
	 * Sales/shipment prohibited date TO 売上・出荷禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_sls_stop_dt_to = null;
	/**
	 * Allow purchase/receipt 仕入・入荷　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_stop_f_flg = null;
	/**
	 * Prohibit purchase/receipt 仕入・入荷　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_stop_t_flg = null;
	public MCLabel Cnd_purc_stop_dt_fr_Label = null;
	/**
	 * Purchase/receipt prohibit date FROM 仕入・入荷禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_purc_stop_dt_fr = null;
	public MCLabel Cnd_purc_stop_dt_to_Label = null;
	/**
	 * Purchase/receipt prohibit date TO 仕入・入荷禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_purc_stop_dt_to = null;
	/**
	 * Allow requirement/order 所要・オーダ　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_order_stop_f_flg = null;
	/**
	 * Prohibit requirement/order 所要・オーダ　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_order_stop_t_flg = null;
	public MCLabel Cnd_order_stop_dt_fr_Label = null;
	/**
	 * Requirements/order prohibited date FROM 所要・オーダ禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_order_stop_dt_fr = null;
	public MCLabel Cnd_order_stop_dt_to_Label = null;
	/**
	 * Requirements/order prohibited date TO 所要・オーダ禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_order_stop_dt_to = null;
	/**
	 * Allow mfg. order 製造指図　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_inst_stop_f_flg = null;
	/**
	 * Prohibit mfg. order 製造指図　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_inst_stop_t_flg = null;
	public MCLabel Cnd_mfg_inst_stop_dt_fr_Label = null;
	/**
	 * Mfg. order prohibit date FROM 製造指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_inst_stop_dt_fr = null;
	public MCLabel Cnd_mfg_inst_stop_dt_to_Label = null;
	/**
	 * Mfg. order prohibit date TO 製造指図禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_inst_stop_dt_to = null;
	/**
	 * Allow shipping order 出荷指図　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_inst_stop_f_flg = null;
	/**
	 * Prohibit shipping order 出荷指図　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_ship_inst_stop_t_flg = null;
	public MCLabel Cnd_ship_inst_stop_dt_fr_Label = null;
	/**
	 * Shipping order prohibit date FROM 出荷指図禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ship_inst_stop_dt_fr = null;
	public MCLabel Cnd_ship_inst_stop_dt_to_Label = null;
	/**
	 * Shipping order prohibit date TO 出荷指図禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ship_inst_stop_dt_to = null;
	/**
	 * Allow transport/movement 移送・移動　許可.<p>
	 *
	 */
	public MCCheckBox Cnd_xfr_stop_f_flg = null;
	/**
	 * Prohibit transport/movement 移送・移動　禁止.<p>
	 *
	 */
	public MCCheckBox Cnd_xfr_stop_t_flg = null;
	public MCLabel Cnd_xfr_stop_dt_fr_Label = null;
	/**
	 * Transport/movement prohibit date FROM 移送・移動禁止日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_xfr_stop_dt_fr = null;
	public MCLabel Cnd_xfr_stop_dt_to_Label = null;
	/**
	 * Transport/movement prohibit date TO 移送・移動禁止日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_xfr_stop_dt_to = null;
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
	// [Cnd1]ブロック関連のField定義
	public MCPanel Cnd1Panel = null;
	// [Cnd1]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [SloWrk]ブロック関連のField定義
	public MCPanel SloWrkPanel = null;
	public MCTitledBorder SloWrkTitledBorder = null;
	// [SloWrk]ブロックの項目のField定義
	// [PoWrk]ブロック関連のField定義
	public MCPanel PoWrkPanel = null;
	public MCTitledBorder PoWrkTitledBorder = null;
	// [PoWrk]ブロックの項目のField定義
	// [SlsWrk]ブロック関連のField定義
	public MCPanel SlsWrkPanel = null;
	public MCTitledBorder SlsWrkTitledBorder = null;
	// [SlsWrk]ブロックの項目のField定義
	// [PurcWrk]ブロック関連のField定義
	public MCPanel PurcWrkPanel = null;
	public MCTitledBorder PurcWrkTitledBorder = null;
	// [PurcWrk]ブロックの項目のField定義
	// [OrderWrk]ブロック関連のField定義
	public MCPanel OrderWrkPanel = null;
	public MCTitledBorder OrderWrkTitledBorder = null;
	// [OrderWrk]ブロックの項目のField定義
	// [MfgWrk]ブロック関連のField定義
	public MCPanel MfgWrkPanel = null;
	public MCTitledBorder MfgWrkTitledBorder = null;
	// [MfgWrk]ブロックの項目のField定義
	// [ShipWrk]ブロック関連のField定義
	public MCPanel ShipWrkPanel = null;
	public MCTitledBorder ShipWrkTitledBorder = null;
	// [ShipWrk]ブロックの項目のField定義
	// [XfrWrk]ブロック関連のField定義
	public MCPanel XfrWrkPanel = null;
	public MCTitledBorder XfrWrkTitledBorder = null;
	// [XfrWrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0460.DtlR> DtlTable = null;
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
	public MCColumnConfig columnDtl_bp_nm = null;
	/**
	 * Sales order prohibit date 受注禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_stop_dt = null;
	/**
	 * PO prohibit date 発注禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_stop_dt = null;
	/**
	 * Sales/shipping prohibit date 売上・出荷禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_stop_dt = null;
	/**
	 * Purchase and receipt prohibit date 仕入・入荷禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_stop_dt = null;
	/**
	 * Requirements/order prohibit date 所要・オーダ禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_order_stop_dt = null;
	/**
	 * Mfg. order prohibit date 製造指図禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_stop_dt = null;
	/**
	 * Shipping order prohibit date 出荷指図禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_stop_dt = null;
	/**
	 * Transport/movement prohibit date 移送・移動禁止日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_stop_dt = null;
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
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd = null;
	/**
	 * Delete 削除する.<p>
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
	
	/** [MA_MABCL0460_Srch01]のCallerの作成 */
	protected MABCP_BpStopReg_MC.MA_MABCL0460_Srch01Caller createMA_MABCL0460_Srch01() {
		MABCP_BpStopReg_MC.MA_MABCL0460_Srch01Caller<MABCP_BpStopReg, MA_MABCL0460_Srch01Bridge>
		caller = ((MABCP_BpStopReg_MC)this).new MA_MABCL0460_Srch01Caller<MABCP_BpStopReg, MA_MABCL0460_Srch01Bridge>(
					(MABCP_BpStopReg)this, new MA_MABCL0460_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0460_Srch01]の呼び出し */
	protected void callMA_MABCL0460_Srch01() {
		MCCaller caller = createMA_MABCL0460_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0460_Upd01]のCallerの作成 */
	protected MABCP_BpStopReg_MC.MA_MABCL0460_Upd01Caller createMA_MABCL0460_Upd01() {
		MABCP_BpStopReg_MC.MA_MABCL0460_Upd01Caller<MABCP_BpStopReg, MA_MABCL0460_Upd01Bridge>
		caller = ((MABCP_BpStopReg_MC)this).new MA_MABCL0460_Upd01Caller<MABCP_BpStopReg, MA_MABCL0460_Upd01Bridge>(
					(MABCP_BpStopReg)this, new MA_MABCL0460_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0460_Upd01]の呼び出し */
	protected void callMA_MABCL0460_Upd01() {
		MCCaller caller = createMA_MABCL0460_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0460_Del01]のCallerの作成 */
	protected MABCP_BpStopReg_MC.MA_MABCL0460_Del01Caller createMA_MABCL0460_Del01() {
		MABCP_BpStopReg_MC.MA_MABCL0460_Del01Caller<MABCP_BpStopReg, MA_MABCL0460_Del01Bridge>
		caller = ((MABCP_BpStopReg_MC)this).new MA_MABCL0460_Del01Caller<MABCP_BpStopReg, MA_MABCL0460_Del01Bridge>(
					(MABCP_BpStopReg)this, new MA_MABCL0460_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0460_Del01]の呼び出し */
	protected void callMA_MABCL0460_Del01() {
		MCCaller caller = createMA_MABCL0460_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0460.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0460.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0460.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0460.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0460.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0460.MstR createMstR() {
		return mcframe.clientMABC.MABCP0460.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0460.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0460.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0460.CndR createCndR() {
		return mcframe.clientMABC.MABCP0460.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0460.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0460.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0460.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0460.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0460.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0460.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(Cnd1Panel);
		ret.add(Cnd2Panel);
		ret.add(SloWrkPanel);
		ret.add(PoWrkPanel);
		ret.add(SlsWrkPanel);
		ret.add(PurcWrkPanel);
		ret.add(OrderWrkPanel);
		ret.add(MfgWrkPanel);
		ret.add(ShipWrkPanel);
		ret.add(XfrWrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BpStopReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_BpStopReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_BpStopReg_MC.jbCreateScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateMst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateTop((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateFold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateCndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateCnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateTab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateTab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateCtrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateCnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateCnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateSloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreatePoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateSlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreatePurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateOrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateMfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateXfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateDtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateDtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbCreateEastBtn((MABCP_BpStopReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_BpStopReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_BpStopReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_BpStopReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_BpStopReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABCP_BpStopReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_BpStopReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_BpStopReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_BpStopReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_BpStopReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Cnd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd1(MABCP_BpStopReg p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MABCP_BpStopReg p) {
	}

	/**
	 * [SloWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSloWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [PoWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePoWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [SlsWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSlsWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [PurcWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreatePurcWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [OrderWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrderWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [MfgWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMfgWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [ShipWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateShipWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [XfrWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateXfrWrk(MABCP_BpStopReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_BpStopReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_BpStopReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_BpStopReg p) {
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
	
	
	/** [Dtl_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bp_cd_p = null;

	/**
	 * [Dtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_cd_ListPutter() {
		if (Dtl_bp_cd_p == null) {
			Dtl_bp_cd_p = createDtl_bp_cd_ListPutter(columnDtl_bp_cd, "bp_cd", "bp_nm");

		}
		return Dtl_bp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BpStopReg create(){
		MABCP_BpStopReg p = new MABCP_BpStopReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BpStopReg create(String name){
		MABCP_BpStopReg p = new MABCP_BpStopReg(name);
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
		MABCP_BpStopReg_MC.jbfInitScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitMst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitTop((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitFold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitCndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitCnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitTab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitTab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitCtrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitCnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitCnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitSloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitPoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitSlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitPurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitOrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitMfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitXfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitDtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitDtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbfInitEastBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitMst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitTop((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitFold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitCndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitCnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitTab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitTab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitCtrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitCnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitCnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitSloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitPoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitSlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitPurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitOrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitMfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitXfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitDtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitDtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.jbInitEastBtn((MABCP_BpStopReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_BpStopReg p) {
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
	protected static void jbfInitTop(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_slo_stop_f_flg = p.beansFactory.createCheckBox("Cnd.slo_stop_f_flg");
		p.Cnd_slo_stop_t_flg = p.beansFactory.createCheckBox("Cnd.slo_stop_t_flg");
		p.Cnd_slo_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.slo_stop_dt_fr_Label");
		p.Cnd_slo_stop_dt_fr = p.beansFactory.createDateField("Cnd.slo_stop_dt_fr");
		p.Cnd_slo_stop_dt_fr.setLabel(p.Cnd_slo_stop_dt_fr_Label);
		p.Cnd_slo_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.slo_stop_dt_to_Label");
		p.Cnd_slo_stop_dt_to = p.beansFactory.createDateField("Cnd.slo_stop_dt_to");
		p.Cnd_slo_stop_dt_to.setLabel(p.Cnd_slo_stop_dt_to_Label);
		p.Cnd_po_stop_f_flg = p.beansFactory.createCheckBox("Cnd.po_stop_f_flg");
		p.Cnd_po_stop_t_flg = p.beansFactory.createCheckBox("Cnd.po_stop_t_flg");
		p.Cnd_po_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.po_stop_dt_fr_Label");
		p.Cnd_po_stop_dt_fr = p.beansFactory.createDateField("Cnd.po_stop_dt_fr");
		p.Cnd_po_stop_dt_fr.setLabel(p.Cnd_po_stop_dt_fr_Label);
		p.Cnd_po_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.po_stop_dt_to_Label");
		p.Cnd_po_stop_dt_to = p.beansFactory.createDateField("Cnd.po_stop_dt_to");
		p.Cnd_po_stop_dt_to.setLabel(p.Cnd_po_stop_dt_to_Label);
		p.Cnd_sls_stop_f_flg = p.beansFactory.createCheckBox("Cnd.sls_stop_f_flg");
		p.Cnd_sls_stop_t_flg = p.beansFactory.createCheckBox("Cnd.sls_stop_t_flg");
		p.Cnd_sls_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.sls_stop_dt_fr_Label");
		p.Cnd_sls_stop_dt_fr = p.beansFactory.createDateField("Cnd.sls_stop_dt_fr");
		p.Cnd_sls_stop_dt_fr.setLabel(p.Cnd_sls_stop_dt_fr_Label);
		p.Cnd_sls_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.sls_stop_dt_to_Label");
		p.Cnd_sls_stop_dt_to = p.beansFactory.createDateField("Cnd.sls_stop_dt_to");
		p.Cnd_sls_stop_dt_to.setLabel(p.Cnd_sls_stop_dt_to_Label);
		p.Cnd_purc_stop_f_flg = p.beansFactory.createCheckBox("Cnd.purc_stop_f_flg");
		p.Cnd_purc_stop_t_flg = p.beansFactory.createCheckBox("Cnd.purc_stop_t_flg");
		p.Cnd_purc_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.purc_stop_dt_fr_Label");
		p.Cnd_purc_stop_dt_fr = p.beansFactory.createDateField("Cnd.purc_stop_dt_fr");
		p.Cnd_purc_stop_dt_fr.setLabel(p.Cnd_purc_stop_dt_fr_Label);
		p.Cnd_purc_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.purc_stop_dt_to_Label");
		p.Cnd_purc_stop_dt_to = p.beansFactory.createDateField("Cnd.purc_stop_dt_to");
		p.Cnd_purc_stop_dt_to.setLabel(p.Cnd_purc_stop_dt_to_Label);
		p.Cnd_order_stop_f_flg = p.beansFactory.createCheckBox("Cnd.order_stop_f_flg");
		p.Cnd_order_stop_t_flg = p.beansFactory.createCheckBox("Cnd.order_stop_t_flg");
		p.Cnd_order_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.order_stop_dt_fr_Label");
		p.Cnd_order_stop_dt_fr = p.beansFactory.createDateField("Cnd.order_stop_dt_fr");
		p.Cnd_order_stop_dt_fr.setLabel(p.Cnd_order_stop_dt_fr_Label);
		p.Cnd_order_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.order_stop_dt_to_Label");
		p.Cnd_order_stop_dt_to = p.beansFactory.createDateField("Cnd.order_stop_dt_to");
		p.Cnd_order_stop_dt_to.setLabel(p.Cnd_order_stop_dt_to_Label);
		p.Cnd_mfg_inst_stop_f_flg = p.beansFactory.createCheckBox("Cnd.mfg_inst_stop_f_flg");
		p.Cnd_mfg_inst_stop_t_flg = p.beansFactory.createCheckBox("Cnd.mfg_inst_stop_t_flg");
		p.Cnd_mfg_inst_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.mfg_inst_stop_dt_fr_Label");
		p.Cnd_mfg_inst_stop_dt_fr = p.beansFactory.createDateField("Cnd.mfg_inst_stop_dt_fr");
		p.Cnd_mfg_inst_stop_dt_fr.setLabel(p.Cnd_mfg_inst_stop_dt_fr_Label);
		p.Cnd_mfg_inst_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.mfg_inst_stop_dt_to_Label");
		p.Cnd_mfg_inst_stop_dt_to = p.beansFactory.createDateField("Cnd.mfg_inst_stop_dt_to");
		p.Cnd_mfg_inst_stop_dt_to.setLabel(p.Cnd_mfg_inst_stop_dt_to_Label);
		p.Cnd_ship_inst_stop_f_flg = p.beansFactory.createCheckBox("Cnd.ship_inst_stop_f_flg");
		p.Cnd_ship_inst_stop_t_flg = p.beansFactory.createCheckBox("Cnd.ship_inst_stop_t_flg");
		p.Cnd_ship_inst_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.ship_inst_stop_dt_fr_Label");
		p.Cnd_ship_inst_stop_dt_fr = p.beansFactory.createDateField("Cnd.ship_inst_stop_dt_fr");
		p.Cnd_ship_inst_stop_dt_fr.setLabel(p.Cnd_ship_inst_stop_dt_fr_Label);
		p.Cnd_ship_inst_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.ship_inst_stop_dt_to_Label");
		p.Cnd_ship_inst_stop_dt_to = p.beansFactory.createDateField("Cnd.ship_inst_stop_dt_to");
		p.Cnd_ship_inst_stop_dt_to.setLabel(p.Cnd_ship_inst_stop_dt_to_Label);
		p.Cnd_xfr_stop_f_flg = p.beansFactory.createCheckBox("Cnd.xfr_stop_f_flg");
		p.Cnd_xfr_stop_t_flg = p.beansFactory.createCheckBox("Cnd.xfr_stop_t_flg");
		p.Cnd_xfr_stop_dt_fr_Label = p.beansFactory.createLabel("Cnd.xfr_stop_dt_fr_Label");
		p.Cnd_xfr_stop_dt_fr = p.beansFactory.createDateField("Cnd.xfr_stop_dt_fr");
		p.Cnd_xfr_stop_dt_fr.setLabel(p.Cnd_xfr_stop_dt_fr_Label);
		p.Cnd_xfr_stop_dt_to_Label = p.beansFactory.createLabel("Cnd.xfr_stop_dt_to_Label");
		p.Cnd_xfr_stop_dt_to = p.beansFactory.createDateField("Cnd.xfr_stop_dt_to");
		p.Cnd_xfr_stop_dt_to.setLabel(p.Cnd_xfr_stop_dt_to_Label);
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
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
	protected static void jbfInitTab1(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd1(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel = p.beansFactory.createPanel("Cnd1");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [SloWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSloWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.SloWrkPanel = p.beansFactory.createPanel("SloWrk");
		p.SloWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PoWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPoWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.PoWrkPanel = p.beansFactory.createPanel("PoWrk");
		p.PoWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SlsWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSlsWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.SlsWrkPanel = p.beansFactory.createPanel("SlsWrk");
		p.SlsWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [PurcWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitPurcWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.PurcWrkPanel = p.beansFactory.createPanel("PurcWrk");
		p.PurcWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrderWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrderWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.OrderWrkPanel = p.beansFactory.createPanel("OrderWrk");
		p.OrderWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [MfgWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMfgWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.MfgWrkPanel = p.beansFactory.createPanel("MfgWrk");
		p.MfgWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [ShipWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitShipWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.ShipWrkPanel = p.beansFactory.createPanel("ShipWrk");
		p.ShipWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [XfrWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitXfrWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.XfrWrkPanel = p.beansFactory.createPanel("XfrWrk");
		p.XfrWrkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_bp_cd = p.beansFactory.createTableColumn("Dtl.bp_cd", MCColumnType.TEXT);
		p.columnDtl_bp_nm = p.beansFactory.createTableColumn("Dtl.bp_nm", MCColumnType.TEXT);
		p.columnDtl_slo_stop_dt = p.beansFactory.createTableColumn("Dtl.slo_stop_dt", MCColumnType.DATE);
		p.columnDtl_po_stop_dt = p.beansFactory.createTableColumn("Dtl.po_stop_dt", MCColumnType.DATE);
		p.columnDtl_sls_stop_dt = p.beansFactory.createTableColumn("Dtl.sls_stop_dt", MCColumnType.DATE);
		p.columnDtl_purc_stop_dt = p.beansFactory.createTableColumn("Dtl.purc_stop_dt", MCColumnType.DATE);
		p.columnDtl_order_stop_dt = p.beansFactory.createTableColumn("Dtl.order_stop_dt", MCColumnType.DATE);
		p.columnDtl_mfg_inst_stop_dt = p.beansFactory.createTableColumn("Dtl.mfg_inst_stop_dt", MCColumnType.DATE);
		p.columnDtl_ship_inst_stop_dt = p.beansFactory.createTableColumn("Dtl.ship_inst_stop_dt", MCColumnType.DATE);
		p.columnDtl_xfr_stop_dt = p.beansFactory.createTableColumn("Dtl.xfr_stop_dt", MCColumnType.DATE);
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
	protected static void jbfInitDtlBtn(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_del = p.beansFactory.createButton("DtlBtn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_BpStopReg p) {
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
	protected static void jbInitMst(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0460.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_BpStopReg p) {
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
	protected static void jbInitFold(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABCP_BpStopReg p) {
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
	protected static void jbInitCnd(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.DtlPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.ope_META);
		p.SloWrkPanel.add(p.Cnd_slo_stop_f_flg);
		p.SloWrkPanel.setLastBeans(p.Cnd_slo_stop_f_flg);
		p.Cnd_slo_stop_f_flg.setNextBeans(p.Cnd_slo_stop_t_flg);
		p.Cnd_slo_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.slo_stop_f_flg_META);
		p.SloWrkPanel.add(p.Cnd_slo_stop_t_flg);
		p.Cnd_slo_stop_t_flg.setNextBeans(p.Cnd_slo_stop_dt_fr);
		p.Cnd_slo_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.slo_stop_t_flg_META);
		p.SloWrkPanel.add(p.Cnd_slo_stop_dt_fr_Label);
		p.SloWrkPanel.add(p.Cnd_slo_stop_dt_fr);
		p.Cnd_slo_stop_dt_fr.setNextBeans(p.Cnd_slo_stop_dt_to);
		p.Cnd_slo_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.slo_stop_dt_fr_META);
		p.Cnd_slo_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SloWrkPanel.add(p.Cnd_slo_stop_dt_to_Label);
		p.SloWrkPanel.add(p.Cnd_slo_stop_dt_to);
		p.Cnd_slo_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.slo_stop_dt_to_META);
		p.Cnd_slo_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.PoWrkPanel.add(p.Cnd_po_stop_f_flg);
		p.PoWrkPanel.setLastBeans(p.Cnd_po_stop_f_flg);
		p.Cnd_po_stop_f_flg.setNextBeans(p.Cnd_po_stop_t_flg);
		p.Cnd_po_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.po_stop_f_flg_META);
		p.PoWrkPanel.add(p.Cnd_po_stop_t_flg);
		p.Cnd_po_stop_t_flg.setNextBeans(p.Cnd_po_stop_dt_fr);
		p.Cnd_po_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.po_stop_t_flg_META);
		p.PoWrkPanel.add(p.Cnd_po_stop_dt_fr_Label);
		p.PoWrkPanel.add(p.Cnd_po_stop_dt_fr);
		p.Cnd_po_stop_dt_fr.setNextBeans(p.Cnd_po_stop_dt_to);
		p.Cnd_po_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.po_stop_dt_fr_META);
		p.Cnd_po_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.PoWrkPanel.add(p.Cnd_po_stop_dt_to_Label);
		p.PoWrkPanel.add(p.Cnd_po_stop_dt_to);
		p.Cnd_po_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.po_stop_dt_to_META);
		p.Cnd_po_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_f_flg);
		p.SlsWrkPanel.setLastBeans(p.Cnd_sls_stop_f_flg);
		p.Cnd_sls_stop_f_flg.setNextBeans(p.Cnd_sls_stop_t_flg);
		p.Cnd_sls_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.sls_stop_f_flg_META);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_t_flg);
		p.Cnd_sls_stop_t_flg.setNextBeans(p.Cnd_sls_stop_dt_fr);
		p.Cnd_sls_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.sls_stop_t_flg_META);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_dt_fr_Label);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_dt_fr);
		p.Cnd_sls_stop_dt_fr.setNextBeans(p.Cnd_sls_stop_dt_to);
		p.Cnd_sls_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.sls_stop_dt_fr_META);
		p.Cnd_sls_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_dt_to_Label);
		p.SlsWrkPanel.add(p.Cnd_sls_stop_dt_to);
		p.Cnd_sls_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.sls_stop_dt_to_META);
		p.Cnd_sls_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_f_flg);
		p.PurcWrkPanel.setLastBeans(p.Cnd_purc_stop_f_flg);
		p.Cnd_purc_stop_f_flg.setNextBeans(p.Cnd_purc_stop_t_flg);
		p.Cnd_purc_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.purc_stop_f_flg_META);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_t_flg);
		p.Cnd_purc_stop_t_flg.setNextBeans(p.Cnd_purc_stop_dt_fr);
		p.Cnd_purc_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.purc_stop_t_flg_META);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_dt_fr_Label);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_dt_fr);
		p.Cnd_purc_stop_dt_fr.setNextBeans(p.Cnd_purc_stop_dt_to);
		p.Cnd_purc_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.purc_stop_dt_fr_META);
		p.Cnd_purc_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_dt_to_Label);
		p.PurcWrkPanel.add(p.Cnd_purc_stop_dt_to);
		p.Cnd_purc_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.purc_stop_dt_to_META);
		p.Cnd_purc_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.OrderWrkPanel.add(p.Cnd_order_stop_f_flg);
		p.OrderWrkPanel.setLastBeans(p.Cnd_order_stop_f_flg);
		p.Cnd_order_stop_f_flg.setNextBeans(p.Cnd_order_stop_t_flg);
		p.Cnd_order_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.order_stop_f_flg_META);
		p.OrderWrkPanel.add(p.Cnd_order_stop_t_flg);
		p.Cnd_order_stop_t_flg.setNextBeans(p.Cnd_order_stop_dt_fr);
		p.Cnd_order_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.order_stop_t_flg_META);
		p.OrderWrkPanel.add(p.Cnd_order_stop_dt_fr_Label);
		p.OrderWrkPanel.add(p.Cnd_order_stop_dt_fr);
		p.Cnd_order_stop_dt_fr.setNextBeans(p.Cnd_order_stop_dt_to);
		p.Cnd_order_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.order_stop_dt_fr_META);
		p.Cnd_order_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.OrderWrkPanel.add(p.Cnd_order_stop_dt_to_Label);
		p.OrderWrkPanel.add(p.Cnd_order_stop_dt_to);
		p.Cnd_order_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.order_stop_dt_to_META);
		p.Cnd_order_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_f_flg);
		p.MfgWrkPanel.setLastBeans(p.Cnd_mfg_inst_stop_f_flg);
		p.Cnd_mfg_inst_stop_f_flg.setNextBeans(p.Cnd_mfg_inst_stop_t_flg);
		p.Cnd_mfg_inst_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.mfg_inst_stop_f_flg_META);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_t_flg);
		p.Cnd_mfg_inst_stop_t_flg.setNextBeans(p.Cnd_mfg_inst_stop_dt_fr);
		p.Cnd_mfg_inst_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.mfg_inst_stop_t_flg_META);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_dt_fr_Label);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_dt_fr);
		p.Cnd_mfg_inst_stop_dt_fr.setNextBeans(p.Cnd_mfg_inst_stop_dt_to);
		p.Cnd_mfg_inst_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.mfg_inst_stop_dt_fr_META);
		p.Cnd_mfg_inst_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_dt_to_Label);
		p.MfgWrkPanel.add(p.Cnd_mfg_inst_stop_dt_to);
		p.Cnd_mfg_inst_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.mfg_inst_stop_dt_to_META);
		p.Cnd_mfg_inst_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_f_flg);
		p.ShipWrkPanel.setLastBeans(p.Cnd_ship_inst_stop_f_flg);
		p.Cnd_ship_inst_stop_f_flg.setNextBeans(p.Cnd_ship_inst_stop_t_flg);
		p.Cnd_ship_inst_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.ship_inst_stop_f_flg_META);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_t_flg);
		p.Cnd_ship_inst_stop_t_flg.setNextBeans(p.Cnd_ship_inst_stop_dt_fr);
		p.Cnd_ship_inst_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.ship_inst_stop_t_flg_META);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_dt_fr_Label);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_dt_fr);
		p.Cnd_ship_inst_stop_dt_fr.setNextBeans(p.Cnd_ship_inst_stop_dt_to);
		p.Cnd_ship_inst_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.ship_inst_stop_dt_fr_META);
		p.Cnd_ship_inst_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_dt_to_Label);
		p.ShipWrkPanel.add(p.Cnd_ship_inst_stop_dt_to);
		p.Cnd_ship_inst_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.ship_inst_stop_dt_to_META);
		p.Cnd_ship_inst_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_f_flg);
		p.XfrWrkPanel.setLastBeans(p.Cnd_xfr_stop_f_flg);
		p.Cnd_xfr_stop_f_flg.setNextBeans(p.Cnd_xfr_stop_t_flg);
		p.Cnd_xfr_stop_f_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.xfr_stop_f_flg_META);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_t_flg);
		p.Cnd_xfr_stop_t_flg.setNextBeans(p.Cnd_xfr_stop_dt_fr);
		p.Cnd_xfr_stop_t_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.xfr_stop_t_flg_META);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_dt_fr_Label);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_dt_fr);
		p.Cnd_xfr_stop_dt_fr.setNextBeans(p.Cnd_xfr_stop_dt_to);
		p.Cnd_xfr_stop_dt_fr.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.xfr_stop_dt_fr_META);
		p.Cnd_xfr_stop_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_dt_to_Label);
		p.XfrWrkPanel.add(p.Cnd_xfr_stop_dt_to);
		p.Cnd_xfr_stop_dt_to.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.xfr_stop_dt_to_META);
		p.Cnd_xfr_stop_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd2Panel.add(p.Cnd_bp_cd_Label);
		p.Cnd2Panel.add(p.Cnd_bp_cd);
		p.Cnd2Panel.setLastBeans(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.Cnd2Panel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_nm_META);
		p.Cnd2Panel.add(p.Cnd_memo1_Label);
		p.Cnd2Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Cnd2Panel.add(p.Cnd_memo2_Label);
		p.Cnd2Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Cnd2Panel.add(p.Cnd_memo3_Label);
		p.Cnd2Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Cnd2Panel.add(p.Cnd_del_flg_lab);
		p.Cnd2Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.off_del_flg_META);
		p.Cnd2Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.on_del_flg_META);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0460.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("NW");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.Cnd1Panel, null);
		p.Tab1Panel.setLastBeans(p.Cnd1Panel);
		p.Cnd1Panel.setNextBeans(p.Cnd2Panel);
		p.Tab1Panel.add(p.Cnd2Panel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_BpStopReg p) {
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
	protected static void jbInitCnd1(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel.setValueCheck(false);
		p.Cnd1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd1Panel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.Cnd1Panel.add(p.SloWrkPanel, null);
		p.Cnd1Panel.setLastBeans(p.SloWrkPanel);
		p.SloWrkPanel.setNextBeans(p.PoWrkPanel);
		p.Cnd1Panel.add(p.PoWrkPanel, null);
		p.PoWrkPanel.setNextBeans(p.SlsWrkPanel);
		p.Cnd1Panel.add(p.SlsWrkPanel, null);
		p.SlsWrkPanel.setNextBeans(p.PurcWrkPanel);
		p.Cnd1Panel.add(p.PurcWrkPanel, null);
		p.PurcWrkPanel.setNextBeans(p.OrderWrkPanel);
		p.Cnd1Panel.add(p.OrderWrkPanel, null);
		p.OrderWrkPanel.setNextBeans(p.MfgWrkPanel);
		p.Cnd1Panel.add(p.MfgWrkPanel, null);
		p.MfgWrkPanel.setNextBeans(p.ShipWrkPanel);
		p.Cnd1Panel.add(p.ShipWrkPanel, null);
		p.ShipWrkPanel.setNextBeans(p.XfrWrkPanel);
		p.Cnd1Panel.add(p.XfrWrkPanel, null);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("NS");
		// ブロックの項目の初期化
	}

	/**
	 * [SloWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSloWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.SloWrkPanel.setBorder(p.SloWrkTitledBorder);
		p.SloWrkPanel.setValueCheck(false);
		p.SloWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [PoWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPoWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.PoWrkPanel.setBorder(p.PoWrkTitledBorder);
		p.PoWrkPanel.setValueCheck(false);
		p.PoWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [SlsWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSlsWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.SlsWrkPanel.setBorder(p.SlsWrkTitledBorder);
		p.SlsWrkPanel.setValueCheck(false);
		p.SlsWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [PurcWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitPurcWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.PurcWrkPanel.setBorder(p.PurcWrkTitledBorder);
		p.PurcWrkPanel.setValueCheck(false);
		p.PurcWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [OrderWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrderWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.OrderWrkPanel.setBorder(p.OrderWrkTitledBorder);
		p.OrderWrkPanel.setValueCheck(false);
		p.OrderWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [MfgWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMfgWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.MfgWrkPanel.setBorder(p.MfgWrkTitledBorder);
		p.MfgWrkPanel.setValueCheck(false);
		p.MfgWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [ShipWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitShipWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.ShipWrkPanel.setBorder(p.ShipWrkTitledBorder);
		p.ShipWrkPanel.setValueCheck(false);
		p.ShipWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [XfrWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitXfrWrk(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.XfrWrkPanel.setBorder(p.XfrWrkTitledBorder);
		p.XfrWrkPanel.setValueCheck(false);
		p.XfrWrkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_BpStopReg p) {
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
	protected static void jbInitDtlBtn(MABCP_BpStopReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
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
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_upd);
		p.DtlBtn_upd.setIcon("REGISTER");
		p.DtlBtn_upd.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd);
		p.DtlBtn_del.setIcon("DELETE");
		p.DtlBtn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del);
		p.EastBtnPanel.add(p.DtlBtn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_BpStopReg p) {
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
		MABCP_BpStopReg_MC.mcInitScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitMst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitTop((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitFold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitCndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitCnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitTab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitTab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitCtrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitCnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitCnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitSloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitPoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitSlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitPurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitOrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitMfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitXfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitDtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitDtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.mcInitEastBtn((MABCP_BpStopReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_BpStopReg_MC.statusInitUPD_ScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Mst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Top((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Fold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_CndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Cnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Tab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Tab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Ctrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Cnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Cnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_SloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_PoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_SlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_PurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_OrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_MfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_ShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_XfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_Dtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_DtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitUPD_EastBtn((MABCP_BpStopReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_BpStopReg_MC.statusInitFIX_ScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Mst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Top((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Fold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_CndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Cnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Tab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Tab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Ctrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Cnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Cnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_SloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_PoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_SlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_PurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_OrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_MfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_ShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_XfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_Dtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_DtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitFIX_EastBtn((MABCP_BpStopReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_BpStopReg_MC.statusInitDEL_ScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Mst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Top((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Fold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_CndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Cnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Tab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Tab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Ctrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Cnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Cnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_SloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_PoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_SlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_PurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_OrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_MfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_ShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_XfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_Dtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_DtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitDEL_EastBtn((MABCP_BpStopReg)this);

		// [REF]ステータスのモードの設定
		MABCP_BpStopReg_MC.statusInitREF_ScreenOpe((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Mst((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Top((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Fold((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_CndTab((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Cnd((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Tab1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Tab2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Ctrl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Cnd1((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Cnd2((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_SloWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_PoWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_SlsWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_PurcWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_OrderWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_MfgWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_ShipWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_XfrWrk((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_Dtl((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_DtlBtn((MABCP_BpStopReg)this);
		MABCP_BpStopReg_MC.statusInitREF_EastBtn((MABCP_BpStopReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_BpStopReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_BpStopReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_BpStopReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_BpStopReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABCP_BpStopReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_BpStopReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_slo_stop_f_flg.addAllListener(p);
		p.Cnd_slo_stop_t_flg.addAllListener(p);
		p.Cnd_slo_stop_dt_fr.setListListener(p);
		p.Cnd_slo_stop_dt_fr.addAllListener(p);
		p.Cnd_slo_stop_dt_to.setListListener(p);
		p.Cnd_slo_stop_dt_to.addAllListener(p);
		p.Cnd_po_stop_f_flg.addAllListener(p);
		p.Cnd_po_stop_t_flg.addAllListener(p);
		p.Cnd_po_stop_dt_fr.setListListener(p);
		p.Cnd_po_stop_dt_fr.addAllListener(p);
		p.Cnd_po_stop_dt_to.setListListener(p);
		p.Cnd_po_stop_dt_to.addAllListener(p);
		p.Cnd_sls_stop_f_flg.addAllListener(p);
		p.Cnd_sls_stop_t_flg.addAllListener(p);
		p.Cnd_sls_stop_dt_fr.setListListener(p);
		p.Cnd_sls_stop_dt_fr.addAllListener(p);
		p.Cnd_sls_stop_dt_to.setListListener(p);
		p.Cnd_sls_stop_dt_to.addAllListener(p);
		p.Cnd_purc_stop_f_flg.addAllListener(p);
		p.Cnd_purc_stop_t_flg.addAllListener(p);
		p.Cnd_purc_stop_dt_fr.setListListener(p);
		p.Cnd_purc_stop_dt_fr.addAllListener(p);
		p.Cnd_purc_stop_dt_to.setListListener(p);
		p.Cnd_purc_stop_dt_to.addAllListener(p);
		p.Cnd_order_stop_f_flg.addAllListener(p);
		p.Cnd_order_stop_t_flg.addAllListener(p);
		p.Cnd_order_stop_dt_fr.setListListener(p);
		p.Cnd_order_stop_dt_fr.addAllListener(p);
		p.Cnd_order_stop_dt_to.setListListener(p);
		p.Cnd_order_stop_dt_to.addAllListener(p);
		p.Cnd_mfg_inst_stop_f_flg.addAllListener(p);
		p.Cnd_mfg_inst_stop_t_flg.addAllListener(p);
		p.Cnd_mfg_inst_stop_dt_fr.setListListener(p);
		p.Cnd_mfg_inst_stop_dt_fr.addAllListener(p);
		p.Cnd_mfg_inst_stop_dt_to.setListListener(p);
		p.Cnd_mfg_inst_stop_dt_to.addAllListener(p);
		p.Cnd_ship_inst_stop_f_flg.addAllListener(p);
		p.Cnd_ship_inst_stop_t_flg.addAllListener(p);
		p.Cnd_ship_inst_stop_dt_fr.setListListener(p);
		p.Cnd_ship_inst_stop_dt_fr.addAllListener(p);
		p.Cnd_ship_inst_stop_dt_to.setListListener(p);
		p.Cnd_ship_inst_stop_dt_to.addAllListener(p);
		p.Cnd_xfr_stop_f_flg.addAllListener(p);
		p.Cnd_xfr_stop_t_flg.addAllListener(p);
		p.Cnd_xfr_stop_dt_fr.setListListener(p);
		p.Cnd_xfr_stop_dt_fr.addAllListener(p);
		p.Cnd_xfr_stop_dt_to.setListListener(p);
		p.Cnd_xfr_stop_dt_to.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
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
	protected static void mcInitTab1(MABCP_BpStopReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_BpStopReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_BpStopReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Cnd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd1(MABCP_BpStopReg p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MABCP_BpStopReg p) {
	}

	/**
	 *  [SloWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSloWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [PoWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPoWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [SlsWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSlsWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [PurcWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitPurcWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [OrderWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrderWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [MfgWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMfgWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [ShipWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitShipWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [XfrWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitXfrWrk(MABCP_BpStopReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_BpStopReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_bp_cd.addAllListener(p);
		p.columnDtl_bp_cd.setListListener(p);
		p.columnDtl_bp_nm.addAllListener(p);
		p.columnDtl_bp_nm.setListListener(p);
		p.columnDtl_slo_stop_dt.addAllListener(p);
		p.columnDtl_slo_stop_dt.setListListener(p);
		p.columnDtl_po_stop_dt.addAllListener(p);
		p.columnDtl_po_stop_dt.setListListener(p);
		p.columnDtl_sls_stop_dt.addAllListener(p);
		p.columnDtl_sls_stop_dt.setListListener(p);
		p.columnDtl_purc_stop_dt.addAllListener(p);
		p.columnDtl_purc_stop_dt.setListListener(p);
		p.columnDtl_order_stop_dt.addAllListener(p);
		p.columnDtl_order_stop_dt.setListListener(p);
		p.columnDtl_mfg_inst_stop_dt.addAllListener(p);
		p.columnDtl_mfg_inst_stop_dt.setListListener(p);
		p.columnDtl_ship_inst_stop_dt.addAllListener(p);
		p.columnDtl_ship_inst_stop_dt.setListListener(p);
		p.columnDtl_xfr_stop_dt.addAllListener(p);
		p.columnDtl_xfr_stop_dt.setListListener(p);
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
	protected static void mcInitDtlBtn(MABCP_BpStopReg p) {
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
		p.DtlBtn_upd.addAllListener(p);
		p.DtlBtn_upd.setAPMethodName("doDtlBtn_upd");
		p.DtlBtn_del.addAllListener(p);
		p.DtlBtn_del.setAPMethodName("doDtlBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_BpStopReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_BpStopReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_BpStopReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_slo_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_slo_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_po_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_po_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_po_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_po_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sls_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sls_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sls_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_purc_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_purc_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_order_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_order_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_order_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_order_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_f_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_xfr_stop_t_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_xfr_stop_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_dt_to.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_Tab1(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd1(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[SloWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SloWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[PoWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PoWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[SlsWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_SlsWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[PurcWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_PurcWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[OrderWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_OrderWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[MfgWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MfgWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[ShipWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ShipWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[XfrWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_XfrWrk(MABCP_BpStopReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_BpStopReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_order_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_inst_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_inst_stop_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_xfr_stop_dt.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_DtlBtn(MABCP_BpStopReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_BpStopReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_BpStopReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_slo_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_slo_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_slo_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_slo_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_po_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_po_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_po_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_po_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sls_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sls_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sls_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_purc_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_purc_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_purc_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_order_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_order_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_order_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_order_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_f_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_xfr_stop_t_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_xfr_stop_dt_fr.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_dt_to.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
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
	protected static void statusInitFIX_Tab1(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd1(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd2(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[SloWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SloWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[PoWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_PoWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[SlsWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_SlsWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[PurcWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_PurcWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[OrderWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_OrderWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[MfgWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_MfgWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[ShipWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ShipWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[XfrWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_XfrWrk(MABCP_BpStopReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_BpStopReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_order_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_xfr_stop_dt.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABCP_BpStopReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_BpStopReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_BpStopReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_slo_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_slo_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_slo_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_slo_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_po_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_po_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_po_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_po_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sls_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sls_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_purc_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_purc_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_purc_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_order_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_order_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_order_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_order_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_f_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_xfr_stop_t_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_xfr_stop_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_dt_to.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
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
	protected static void statusInitDEL_Tab1(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd1(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[SloWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SloWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[PoWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PoWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[SlsWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SlsWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[PurcWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_PurcWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[OrderWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_OrderWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[MfgWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MfgWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[ShipWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ShipWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[XfrWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_XfrWrk(MABCP_BpStopReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_BpStopReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_order_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_stop_dt.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABCP_BpStopReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_BpStopReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_BpStopReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_slo_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_slo_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_po_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_po_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_po_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sls_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sls_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sls_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_purc_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_purc_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_order_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_order_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_order_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_order_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_inst_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_mfg_inst_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_inst_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ship_inst_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_f_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_xfr_stop_t_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_xfr_stop_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_xfr_stop_dt_to.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
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
	protected static void statusInitREF_Tab1(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd1(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[SloWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_SloWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[PoWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_PoWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[SlsWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_SlsWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[PurcWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_PurcWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[OrderWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrderWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[MfgWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_MfgWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[ShipWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_ShipWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[XfrWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_XfrWrk(MABCP_BpStopReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_BpStopReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_order_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_stop_dt.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABCP_BpStopReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_BpStopReg p){

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
		MABCP_BpStopReg_MC.setTableConfigDtl((MABCP_BpStopReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_BpStopReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0460.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0460.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0460.DtlR.bp_cd_META);
		p.columnDtl_bp_cd.setListType(MCListType.STRICT);
		p.columnDtl_bp_cd.addLinkBeans(p.columnDtl_bp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_cd);
		p.columnDtl_bp_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_nm);
		p.columnDtl_slo_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.slo_stop_dt_META);
		p.columnDtl_slo_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_stop_dt);
		p.columnDtl_po_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.po_stop_dt_META);
		p.columnDtl_po_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_po_stop_dt);
		p.columnDtl_sls_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.sls_stop_dt_META);
		p.columnDtl_sls_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_stop_dt);
		p.columnDtl_purc_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.purc_stop_dt_META);
		p.columnDtl_purc_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_stop_dt);
		p.columnDtl_order_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.order_stop_dt_META);
		p.columnDtl_order_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_order_stop_dt);
		p.columnDtl_mfg_inst_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.mfg_inst_stop_dt_META);
		p.columnDtl_mfg_inst_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_stop_dt);
		p.columnDtl_ship_inst_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ship_inst_stop_dt_META);
		p.columnDtl_ship_inst_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_stop_dt);
		p.columnDtl_xfr_stop_dt.setMeta(mcframe.clientMABC.MABCP0460.DtlR.xfr_stop_dt_META);
		p.columnDtl_xfr_stop_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_stop_dt);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0460.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0460.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0460.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0460.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0460.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0460.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0460.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
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
		columnDtl_bp_cd.getListConfig().setPutter(getDtl_bp_cd_ListPutter());
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
	 * [Dtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
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
		if(combo == columnDtl_bp_cd) return getDtl_bp_cd(row, info);
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
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_del) doDtlBtn_del(info);
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
	 * [DtlBtn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd(MCEventInfo info);

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
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_slo_stop_f_flg) return doCnd_slo_stop_f_flg_VC(info);
		if (vc == Cnd_slo_stop_t_flg) return doCnd_slo_stop_t_flg_VC(info);
		if (vc == Cnd_slo_stop_dt_fr) return doCnd_slo_stop_dt_fr_VC(info);
		if (vc == Cnd_slo_stop_dt_to) return doCnd_slo_stop_dt_to_VC(info);
		if (vc == Cnd_po_stop_f_flg) return doCnd_po_stop_f_flg_VC(info);
		if (vc == Cnd_po_stop_t_flg) return doCnd_po_stop_t_flg_VC(info);
		if (vc == Cnd_po_stop_dt_fr) return doCnd_po_stop_dt_fr_VC(info);
		if (vc == Cnd_po_stop_dt_to) return doCnd_po_stop_dt_to_VC(info);
		if (vc == Cnd_sls_stop_f_flg) return doCnd_sls_stop_f_flg_VC(info);
		if (vc == Cnd_sls_stop_t_flg) return doCnd_sls_stop_t_flg_VC(info);
		if (vc == Cnd_sls_stop_dt_fr) return doCnd_sls_stop_dt_fr_VC(info);
		if (vc == Cnd_sls_stop_dt_to) return doCnd_sls_stop_dt_to_VC(info);
		if (vc == Cnd_purc_stop_f_flg) return doCnd_purc_stop_f_flg_VC(info);
		if (vc == Cnd_purc_stop_t_flg) return doCnd_purc_stop_t_flg_VC(info);
		if (vc == Cnd_purc_stop_dt_fr) return doCnd_purc_stop_dt_fr_VC(info);
		if (vc == Cnd_purc_stop_dt_to) return doCnd_purc_stop_dt_to_VC(info);
		if (vc == Cnd_order_stop_f_flg) return doCnd_order_stop_f_flg_VC(info);
		if (vc == Cnd_order_stop_t_flg) return doCnd_order_stop_t_flg_VC(info);
		if (vc == Cnd_order_stop_dt_fr) return doCnd_order_stop_dt_fr_VC(info);
		if (vc == Cnd_order_stop_dt_to) return doCnd_order_stop_dt_to_VC(info);
		if (vc == Cnd_mfg_inst_stop_f_flg) return doCnd_mfg_inst_stop_f_flg_VC(info);
		if (vc == Cnd_mfg_inst_stop_t_flg) return doCnd_mfg_inst_stop_t_flg_VC(info);
		if (vc == Cnd_mfg_inst_stop_dt_fr) return doCnd_mfg_inst_stop_dt_fr_VC(info);
		if (vc == Cnd_mfg_inst_stop_dt_to) return doCnd_mfg_inst_stop_dt_to_VC(info);
		if (vc == Cnd_ship_inst_stop_f_flg) return doCnd_ship_inst_stop_f_flg_VC(info);
		if (vc == Cnd_ship_inst_stop_t_flg) return doCnd_ship_inst_stop_t_flg_VC(info);
		if (vc == Cnd_ship_inst_stop_dt_fr) return doCnd_ship_inst_stop_dt_fr_VC(info);
		if (vc == Cnd_ship_inst_stop_dt_to) return doCnd_ship_inst_stop_dt_to_VC(info);
		if (vc == Cnd_xfr_stop_f_flg) return doCnd_xfr_stop_f_flg_VC(info);
		if (vc == Cnd_xfr_stop_t_flg) return doCnd_xfr_stop_t_flg_VC(info);
		if (vc == Cnd_xfr_stop_dt_fr) return doCnd_xfr_stop_dt_fr_VC(info);
		if (vc == Cnd_xfr_stop_dt_to) return doCnd_xfr_stop_dt_to_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
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
		if (vc == columnDtl_bp_nm) return doDtl_bp_nm_VC(info);
		if (vc == columnDtl_slo_stop_dt) return doDtl_slo_stop_dt_VC(info);
		if (vc == columnDtl_po_stop_dt) return doDtl_po_stop_dt_VC(info);
		if (vc == columnDtl_sls_stop_dt) return doDtl_sls_stop_dt_VC(info);
		if (vc == columnDtl_purc_stop_dt) return doDtl_purc_stop_dt_VC(info);
		if (vc == columnDtl_order_stop_dt) return doDtl_order_stop_dt_VC(info);
		if (vc == columnDtl_mfg_inst_stop_dt) return doDtl_mfg_inst_stop_dt_VC(info);
		if (vc == columnDtl_ship_inst_stop_dt) return doDtl_ship_inst_stop_dt_VC(info);
		if (vc == columnDtl_xfr_stop_dt) return doDtl_xfr_stop_dt_VC(info);
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
	 * [Cnd]パネルの[slo_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[order_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_order_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[order_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_order_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_order_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_order_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_inst_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_inst_stop_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_stop_f_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_stop_f_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_stop_t_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_stop_t_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_stop_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_stop_dt_to_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[order_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_order_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_stop_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_stop_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_stop_dt_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == CndTabTab) doCndTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_slo_stop_f_flg) doCnd_slo_stop_f_flg_NC(info);
		else if (nc == Cnd_slo_stop_t_flg) doCnd_slo_stop_t_flg_NC(info);
		else if (nc == Cnd_slo_stop_dt_fr) doCnd_slo_stop_dt_fr_NC(info);
		else if (nc == Cnd_slo_stop_dt_to) doCnd_slo_stop_dt_to_NC(info);
		else if (nc == Cnd_po_stop_f_flg) doCnd_po_stop_f_flg_NC(info);
		else if (nc == Cnd_po_stop_t_flg) doCnd_po_stop_t_flg_NC(info);
		else if (nc == Cnd_po_stop_dt_fr) doCnd_po_stop_dt_fr_NC(info);
		else if (nc == Cnd_po_stop_dt_to) doCnd_po_stop_dt_to_NC(info);
		else if (nc == Cnd_sls_stop_f_flg) doCnd_sls_stop_f_flg_NC(info);
		else if (nc == Cnd_sls_stop_t_flg) doCnd_sls_stop_t_flg_NC(info);
		else if (nc == Cnd_sls_stop_dt_fr) doCnd_sls_stop_dt_fr_NC(info);
		else if (nc == Cnd_sls_stop_dt_to) doCnd_sls_stop_dt_to_NC(info);
		else if (nc == Cnd_purc_stop_f_flg) doCnd_purc_stop_f_flg_NC(info);
		else if (nc == Cnd_purc_stop_t_flg) doCnd_purc_stop_t_flg_NC(info);
		else if (nc == Cnd_purc_stop_dt_fr) doCnd_purc_stop_dt_fr_NC(info);
		else if (nc == Cnd_purc_stop_dt_to) doCnd_purc_stop_dt_to_NC(info);
		else if (nc == Cnd_order_stop_f_flg) doCnd_order_stop_f_flg_NC(info);
		else if (nc == Cnd_order_stop_t_flg) doCnd_order_stop_t_flg_NC(info);
		else if (nc == Cnd_order_stop_dt_fr) doCnd_order_stop_dt_fr_NC(info);
		else if (nc == Cnd_order_stop_dt_to) doCnd_order_stop_dt_to_NC(info);
		else if (nc == Cnd_mfg_inst_stop_f_flg) doCnd_mfg_inst_stop_f_flg_NC(info);
		else if (nc == Cnd_mfg_inst_stop_t_flg) doCnd_mfg_inst_stop_t_flg_NC(info);
		else if (nc == Cnd_mfg_inst_stop_dt_fr) doCnd_mfg_inst_stop_dt_fr_NC(info);
		else if (nc == Cnd_mfg_inst_stop_dt_to) doCnd_mfg_inst_stop_dt_to_NC(info);
		else if (nc == Cnd_ship_inst_stop_f_flg) doCnd_ship_inst_stop_f_flg_NC(info);
		else if (nc == Cnd_ship_inst_stop_t_flg) doCnd_ship_inst_stop_t_flg_NC(info);
		else if (nc == Cnd_ship_inst_stop_dt_fr) doCnd_ship_inst_stop_dt_fr_NC(info);
		else if (nc == Cnd_ship_inst_stop_dt_to) doCnd_ship_inst_stop_dt_to_NC(info);
		else if (nc == Cnd_xfr_stop_f_flg) doCnd_xfr_stop_f_flg_NC(info);
		else if (nc == Cnd_xfr_stop_t_flg) doCnd_xfr_stop_t_flg_NC(info);
		else if (nc == Cnd_xfr_stop_dt_fr) doCnd_xfr_stop_dt_fr_NC(info);
		else if (nc == Cnd_xfr_stop_dt_to) doCnd_xfr_stop_dt_to_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
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
		else if (nc == columnDtl_bp_nm) doDtl_bp_nm_NC(info);
		else if (nc == columnDtl_slo_stop_dt) doDtl_slo_stop_dt_NC(info);
		else if (nc == columnDtl_po_stop_dt) doDtl_po_stop_dt_NC(info);
		else if (nc == columnDtl_sls_stop_dt) doDtl_sls_stop_dt_NC(info);
		else if (nc == columnDtl_purc_stop_dt) doDtl_purc_stop_dt_NC(info);
		else if (nc == columnDtl_order_stop_dt) doDtl_order_stop_dt_NC(info);
		else if (nc == columnDtl_mfg_inst_stop_dt) doDtl_mfg_inst_stop_dt_NC(info);
		else if (nc == columnDtl_ship_inst_stop_dt) doDtl_ship_inst_stop_dt_NC(info);
		else if (nc == columnDtl_xfr_stop_dt) doDtl_xfr_stop_dt_NC(info);
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
	 * [Cnd]パネルの[slo_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_f_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_f_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_t_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_t_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_to_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_stop_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stop_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stop_dt_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CndTabTab) doCndTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_slo_stop_f_flg) doCnd_slo_stop_f_flg_NE(info);
		else if (ne == Cnd_slo_stop_t_flg) doCnd_slo_stop_t_flg_NE(info);
		else if (ne == Cnd_slo_stop_dt_fr) doCnd_slo_stop_dt_fr_NE(info);
		else if (ne == Cnd_slo_stop_dt_to) doCnd_slo_stop_dt_to_NE(info);
		else if (ne == Cnd_po_stop_f_flg) doCnd_po_stop_f_flg_NE(info);
		else if (ne == Cnd_po_stop_t_flg) doCnd_po_stop_t_flg_NE(info);
		else if (ne == Cnd_po_stop_dt_fr) doCnd_po_stop_dt_fr_NE(info);
		else if (ne == Cnd_po_stop_dt_to) doCnd_po_stop_dt_to_NE(info);
		else if (ne == Cnd_sls_stop_f_flg) doCnd_sls_stop_f_flg_NE(info);
		else if (ne == Cnd_sls_stop_t_flg) doCnd_sls_stop_t_flg_NE(info);
		else if (ne == Cnd_sls_stop_dt_fr) doCnd_sls_stop_dt_fr_NE(info);
		else if (ne == Cnd_sls_stop_dt_to) doCnd_sls_stop_dt_to_NE(info);
		else if (ne == Cnd_purc_stop_f_flg) doCnd_purc_stop_f_flg_NE(info);
		else if (ne == Cnd_purc_stop_t_flg) doCnd_purc_stop_t_flg_NE(info);
		else if (ne == Cnd_purc_stop_dt_fr) doCnd_purc_stop_dt_fr_NE(info);
		else if (ne == Cnd_purc_stop_dt_to) doCnd_purc_stop_dt_to_NE(info);
		else if (ne == Cnd_order_stop_f_flg) doCnd_order_stop_f_flg_NE(info);
		else if (ne == Cnd_order_stop_t_flg) doCnd_order_stop_t_flg_NE(info);
		else if (ne == Cnd_order_stop_dt_fr) doCnd_order_stop_dt_fr_NE(info);
		else if (ne == Cnd_order_stop_dt_to) doCnd_order_stop_dt_to_NE(info);
		else if (ne == Cnd_mfg_inst_stop_f_flg) doCnd_mfg_inst_stop_f_flg_NE(info);
		else if (ne == Cnd_mfg_inst_stop_t_flg) doCnd_mfg_inst_stop_t_flg_NE(info);
		else if (ne == Cnd_mfg_inst_stop_dt_fr) doCnd_mfg_inst_stop_dt_fr_NE(info);
		else if (ne == Cnd_mfg_inst_stop_dt_to) doCnd_mfg_inst_stop_dt_to_NE(info);
		else if (ne == Cnd_ship_inst_stop_f_flg) doCnd_ship_inst_stop_f_flg_NE(info);
		else if (ne == Cnd_ship_inst_stop_t_flg) doCnd_ship_inst_stop_t_flg_NE(info);
		else if (ne == Cnd_ship_inst_stop_dt_fr) doCnd_ship_inst_stop_dt_fr_NE(info);
		else if (ne == Cnd_ship_inst_stop_dt_to) doCnd_ship_inst_stop_dt_to_NE(info);
		else if (ne == Cnd_xfr_stop_f_flg) doCnd_xfr_stop_f_flg_NE(info);
		else if (ne == Cnd_xfr_stop_t_flg) doCnd_xfr_stop_t_flg_NE(info);
		else if (ne == Cnd_xfr_stop_dt_fr) doCnd_xfr_stop_dt_fr_NE(info);
		else if (ne == Cnd_xfr_stop_dt_to) doCnd_xfr_stop_dt_to_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
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
		else if (ne == columnDtl_bp_nm) doDtl_bp_nm_NE(info);
		else if (ne == columnDtl_slo_stop_dt) doDtl_slo_stop_dt_NE(info);
		else if (ne == columnDtl_po_stop_dt) doDtl_po_stop_dt_NE(info);
		else if (ne == columnDtl_sls_stop_dt) doDtl_sls_stop_dt_NE(info);
		else if (ne == columnDtl_purc_stop_dt) doDtl_purc_stop_dt_NE(info);
		else if (ne == columnDtl_order_stop_dt) doDtl_order_stop_dt_NE(info);
		else if (ne == columnDtl_mfg_inst_stop_dt) doDtl_mfg_inst_stop_dt_NE(info);
		else if (ne == columnDtl_ship_inst_stop_dt) doDtl_ship_inst_stop_dt_NE(info);
		else if (ne == columnDtl_xfr_stop_dt) doDtl_xfr_stop_dt_NE(info);
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
	 * [Cnd]パネルの[slo_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_f_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_f_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_t_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_t_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_to_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_stop_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stop_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stop_dt_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CndTabTab) doCndTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_slo_stop_f_flg) doCnd_slo_stop_f_flg_NX(info);
		else if (nx == Cnd_slo_stop_t_flg) doCnd_slo_stop_t_flg_NX(info);
		else if (nx == Cnd_slo_stop_dt_fr) doCnd_slo_stop_dt_fr_NX(info);
		else if (nx == Cnd_slo_stop_dt_to) doCnd_slo_stop_dt_to_NX(info);
		else if (nx == Cnd_po_stop_f_flg) doCnd_po_stop_f_flg_NX(info);
		else if (nx == Cnd_po_stop_t_flg) doCnd_po_stop_t_flg_NX(info);
		else if (nx == Cnd_po_stop_dt_fr) doCnd_po_stop_dt_fr_NX(info);
		else if (nx == Cnd_po_stop_dt_to) doCnd_po_stop_dt_to_NX(info);
		else if (nx == Cnd_sls_stop_f_flg) doCnd_sls_stop_f_flg_NX(info);
		else if (nx == Cnd_sls_stop_t_flg) doCnd_sls_stop_t_flg_NX(info);
		else if (nx == Cnd_sls_stop_dt_fr) doCnd_sls_stop_dt_fr_NX(info);
		else if (nx == Cnd_sls_stop_dt_to) doCnd_sls_stop_dt_to_NX(info);
		else if (nx == Cnd_purc_stop_f_flg) doCnd_purc_stop_f_flg_NX(info);
		else if (nx == Cnd_purc_stop_t_flg) doCnd_purc_stop_t_flg_NX(info);
		else if (nx == Cnd_purc_stop_dt_fr) doCnd_purc_stop_dt_fr_NX(info);
		else if (nx == Cnd_purc_stop_dt_to) doCnd_purc_stop_dt_to_NX(info);
		else if (nx == Cnd_order_stop_f_flg) doCnd_order_stop_f_flg_NX(info);
		else if (nx == Cnd_order_stop_t_flg) doCnd_order_stop_t_flg_NX(info);
		else if (nx == Cnd_order_stop_dt_fr) doCnd_order_stop_dt_fr_NX(info);
		else if (nx == Cnd_order_stop_dt_to) doCnd_order_stop_dt_to_NX(info);
		else if (nx == Cnd_mfg_inst_stop_f_flg) doCnd_mfg_inst_stop_f_flg_NX(info);
		else if (nx == Cnd_mfg_inst_stop_t_flg) doCnd_mfg_inst_stop_t_flg_NX(info);
		else if (nx == Cnd_mfg_inst_stop_dt_fr) doCnd_mfg_inst_stop_dt_fr_NX(info);
		else if (nx == Cnd_mfg_inst_stop_dt_to) doCnd_mfg_inst_stop_dt_to_NX(info);
		else if (nx == Cnd_ship_inst_stop_f_flg) doCnd_ship_inst_stop_f_flg_NX(info);
		else if (nx == Cnd_ship_inst_stop_t_flg) doCnd_ship_inst_stop_t_flg_NX(info);
		else if (nx == Cnd_ship_inst_stop_dt_fr) doCnd_ship_inst_stop_dt_fr_NX(info);
		else if (nx == Cnd_ship_inst_stop_dt_to) doCnd_ship_inst_stop_dt_to_NX(info);
		else if (nx == Cnd_xfr_stop_f_flg) doCnd_xfr_stop_f_flg_NX(info);
		else if (nx == Cnd_xfr_stop_t_flg) doCnd_xfr_stop_t_flg_NX(info);
		else if (nx == Cnd_xfr_stop_dt_fr) doCnd_xfr_stop_dt_fr_NX(info);
		else if (nx == Cnd_xfr_stop_dt_to) doCnd_xfr_stop_dt_to_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
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
		else if (nx == columnDtl_bp_nm) doDtl_bp_nm_NX(info);
		else if (nx == columnDtl_slo_stop_dt) doDtl_slo_stop_dt_NX(info);
		else if (nx == columnDtl_po_stop_dt) doDtl_po_stop_dt_NX(info);
		else if (nx == columnDtl_sls_stop_dt) doDtl_sls_stop_dt_NX(info);
		else if (nx == columnDtl_purc_stop_dt) doDtl_purc_stop_dt_NX(info);
		else if (nx == columnDtl_order_stop_dt) doDtl_order_stop_dt_NX(info);
		else if (nx == columnDtl_mfg_inst_stop_dt) doDtl_mfg_inst_stop_dt_NX(info);
		else if (nx == columnDtl_ship_inst_stop_dt) doDtl_ship_inst_stop_dt_NX(info);
		else if (nx == columnDtl_xfr_stop_dt) doDtl_xfr_stop_dt_NX(info);
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
	 * [Cnd]パネルの[slo_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_f_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_f_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_t_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_t_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_to_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_stop_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stop_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stop_dt_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_slo_stop_dt_fr) doCnd_slo_stop_dt_fr_LC(info);
		else if (lc == Cnd_slo_stop_dt_to) doCnd_slo_stop_dt_to_LC(info);
		else if (lc == Cnd_po_stop_dt_fr) doCnd_po_stop_dt_fr_LC(info);
		else if (lc == Cnd_po_stop_dt_to) doCnd_po_stop_dt_to_LC(info);
		else if (lc == Cnd_sls_stop_dt_fr) doCnd_sls_stop_dt_fr_LC(info);
		else if (lc == Cnd_sls_stop_dt_to) doCnd_sls_stop_dt_to_LC(info);
		else if (lc == Cnd_purc_stop_dt_fr) doCnd_purc_stop_dt_fr_LC(info);
		else if (lc == Cnd_purc_stop_dt_to) doCnd_purc_stop_dt_to_LC(info);
		else if (lc == Cnd_order_stop_dt_fr) doCnd_order_stop_dt_fr_LC(info);
		else if (lc == Cnd_order_stop_dt_to) doCnd_order_stop_dt_to_LC(info);
		else if (lc == Cnd_mfg_inst_stop_dt_fr) doCnd_mfg_inst_stop_dt_fr_LC(info);
		else if (lc == Cnd_mfg_inst_stop_dt_to) doCnd_mfg_inst_stop_dt_to_LC(info);
		else if (lc == Cnd_ship_inst_stop_dt_fr) doCnd_ship_inst_stop_dt_fr_LC(info);
		else if (lc == Cnd_ship_inst_stop_dt_to) doCnd_ship_inst_stop_dt_to_LC(info);
		else if (lc == Cnd_xfr_stop_dt_fr) doCnd_xfr_stop_dt_fr_LC(info);
		else if (lc == Cnd_xfr_stop_dt_to) doCnd_xfr_stop_dt_to_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
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
		else if (lc == columnDtl_bp_nm) doDtl_bp_nm_LC(info);
		else if (lc == columnDtl_slo_stop_dt) doDtl_slo_stop_dt_LC(info);
		else if (lc == columnDtl_po_stop_dt) doDtl_po_stop_dt_LC(info);
		else if (lc == columnDtl_sls_stop_dt) doDtl_sls_stop_dt_LC(info);
		else if (lc == columnDtl_purc_stop_dt) doDtl_purc_stop_dt_LC(info);
		else if (lc == columnDtl_order_stop_dt) doDtl_order_stop_dt_LC(info);
		else if (lc == columnDtl_mfg_inst_stop_dt) doDtl_mfg_inst_stop_dt_LC(info);
		else if (lc == columnDtl_ship_inst_stop_dt) doDtl_ship_inst_stop_dt_LC(info);
		else if (lc == columnDtl_xfr_stop_dt) doDtl_xfr_stop_dt_LC(info);
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
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[order_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_order_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_inst_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_inst_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_inst_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_inst_stop_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_stop_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_stop_dt_to_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_stop_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_stop_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_stop_dt_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
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
	 * コンボ／リストのリスト[columnDtl_bp_cd]の作成メソッド
	 */
	public MCList getDtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0460.Srch01")) {
			return new MA_MABCL0460_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0460.Upd01")) {
			return new MA_MABCL0460_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0460.Del01")) {
			return new MA_MABCL0460_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0460_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0460_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0460_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0460_Srch01Bridge() {
			p_MA_MABCL0460_Srch01 = new MCParam(PDef.MA_MABCL0460_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0460_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0460.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0460.DtlR.class));

			p_MA_MABCL0460_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0460_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0460_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0460_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0460_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0460.CndR up0() {
			return (mcframe.clientMABC.MABCP0460.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0460.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0460.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0460_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0460.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0460_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0460.DtlR>)p_MA_MABCL0460_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0460_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0460_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0460_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0460_Upd01Bridge() {
			p_MA_MABCL0460_Upd01 = new MCParam(PDef.MA_MABCL0460_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0460_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0460.DtlR.class));
			// Down

			p_MA_MABCL0460_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0460_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0460_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0460_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0460_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0460.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0460.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0460_Upd01;
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
	 * [MA_MABCL0460_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0460_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0460_Del01;

		/** コンストラクタ */
		protected MA_MABCL0460_Del01Bridge() {
			p_MA_MABCL0460_Del01 = new MCParam(PDef.MA_MABCL0460_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0460_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0460.DtlR.class));
			// Down

			p_MA_MABCL0460_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0460_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0460_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0460_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0460_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0460.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0460.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0460_Del01;
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