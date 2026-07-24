package mcframe.clientMABC.MABCP0250;

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
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Srch01Caller;
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Sprt01Caller;
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Upd01Caller;
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Del01Caller;
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Srch02Caller;
import mcframe.clientMABC.MABCP0250.MABCP_UsrAclReg_MC.MA_MABCL0250_Srch03Caller;

/**
 * 画面"MABCP_UsrAclReg"パネルクラスです。<p>
 *
 * 担当者権限マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_UsrAclReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0250";

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
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3;REF_APRV,View (Approval role),5;REF_DPT,View (Belonging dept.),6 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3;REF_APRV,参照する（承認役割）,5;REF_DPT,参照する（所属部門）,6.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_REF_APRV = null;
	public MCRadioButton Cnd_ope_REF_DPT = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCLabel Cnd_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_usr_nm = null;
	public MCLabel Cnd_usr_com_typ_Label = null;
	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_usr_com_typ = null;
	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public MCTextField Cnd_usr_com_typ_nm = null;
	public MCLabel Cnd_usr_com_Label = null;
	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public MCTextField Cnd_usr_com = null;
	public MCLabel Cnd_usr_alt_nm1_Label = null;
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm1 = null;
	public MCLabel Cnd_usr_alt_nm2_Label = null;
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm2 = null;
	public MCLabel Cnd_usr_alt_nm3_Label = null;
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm3 = null;
	public MCLabel Cnd_usr_alt_nm4_Label = null;
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public MCTextField Cnd_usr_alt_nm4 = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_usr_dpt_cd_Label = null;
	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_usr_dpt_cd = null;
	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public MCTextField Cnd_usr_dpt_nm = null;
	public MCLabel Cnd_da_cd_Label = null;
	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_da_cd = null;
	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public MCTextField Cnd_da_nm = null;
	public MCLabel Cnd_usr_aprv_role_cd_Label = null;
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_usr_aprv_role_cd = null;
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public MCTextField Cnd_usr_aprv_role_nm = null;
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
	public MCLabel Cnd_usr_info1_Label = null;
	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public MCTextField Cnd_usr_info1 = null;
	public MCLabel Cnd_usr_info2_Label = null;
	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public MCTextField Cnd_usr_info2 = null;
	public MCLabel Cnd_usr_info3_Label = null;
	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public MCTextField Cnd_usr_info3 = null;
	public MCLabel Cnd_usr_info4_Label = null;
	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public MCTextField Cnd_usr_info4 = null;
	public MCLabel Cnd_usr_info5_Label = null;
	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public MCTextField Cnd_usr_info5 = null;
	public MCLabel Cnd_usr_info6_Label = null;
	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public MCTextField Cnd_usr_info6 = null;
	public MCLabel Cnd_usr_info7_Label = null;
	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public MCTextField Cnd_usr_info7 = null;
	public MCLabel Cnd_usr_info8_Label = null;
	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public MCTextField Cnd_usr_info8 = null;
	public MCLabel Cnd_usr_info9_Label = null;
	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public MCTextField Cnd_usr_info9 = null;
	public MCLabel Cnd_usr_info10_Label = null;
	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public MCTextField Cnd_usr_info10 = null;
	public MCLabel Cnd_usr_info11_Label = null;
	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public MCTextField Cnd_usr_info11 = null;
	public MCLabel Cnd_usr_info12_Label = null;
	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public MCTextField Cnd_usr_info12 = null;
	public MCLabel Cnd_usr_info13_Label = null;
	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public MCTextField Cnd_usr_info13 = null;
	public MCLabel Cnd_usr_info14_Label = null;
	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public MCTextField Cnd_usr_info14 = null;
	public MCLabel Cnd_usr_info15_Label = null;
	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public MCTextField Cnd_usr_info15 = null;
	public MCLabel Cnd_usr_info16_Label = null;
	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public MCTextField Cnd_usr_info16 = null;
	public MCLabel Cnd_usr_info17_Label = null;
	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public MCTextField Cnd_usr_info17 = null;
	public MCLabel Cnd_usr_info18_Label = null;
	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public MCTextField Cnd_usr_info18 = null;
	public MCLabel Cnd_usr_info19_Label = null;
	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public MCTextField Cnd_usr_info19 = null;
	public MCLabel Cnd_usr_info20_Label = null;
	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public MCTextField Cnd_usr_info20 = null;
	// [Cnd1]ブロック関連のField定義
	public MCPanel Cnd1Panel = null;
	// [Cnd1]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
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
	public MCButton BulkSet_upd_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0250.DtlR> DtlTable = null;
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_nm = null;
	/**
	 * License ライセンス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_license_flg = null;
	/**
	 * Approval role cd. 承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_aprv_role_cd = null;
	/**
	 * Approval role name 承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_aprv_role_nm = null;
	/**
	 * Own dept. cd. 所属部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_dpt_cd = null;
	/**
	 * Own dept. name 所属部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_dpt_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Data access cd. データアクセスＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_da_cd = null;
	/**
	 * Data access name データアクセス名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_da_nm = null;
	/**
	 * Allow data correction after temporary closing 仮締訂正可能.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_cl_usr_flg = null;
	/**
	 * Allow data correction after final closing 本締訂正可能.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cl_usr_flg = null;
	/**
	 * Main dept. cd. 主部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Main dept. name 主部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
	/**
	 * Concurrent dept. cd.1 兼務部門ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd1 = null;
	/**
	 * Concurrent dept. name 1 兼務部門名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm1 = null;
	/**
	 * Concurrent dept. cd.2 兼務部門ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd2 = null;
	/**
	 * Concurrent dept. name 2 兼務部門名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm2 = null;
	/**
	 * Concurrent dept. cd.3 兼務部門ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd3 = null;
	/**
	 * Concurrent dept. name 3 兼務部門名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm3 = null;
	/**
	 * Concurrent dept. cd.4 兼務部門ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd4 = null;
	/**
	 * Concurrent dept. name 4 兼務部門名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm4 = null;
	/**
	 * Concurrent dept. cd.5 兼務部門ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd5 = null;
	/**
	 * Concurrent dept. name 5 兼務部門名５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm5 = null;
	/**
	 * Concurrent dept. cd.6 兼務部門ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd6 = null;
	/**
	 * Concurrent dept. name 6 兼務部門名６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm6 = null;
	/**
	 * Concurrent dept. cd.7 兼務部門ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd7 = null;
	/**
	 * Concurrent dept. name 7 兼務部門名７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm7 = null;
	/**
	 * Concurrent dept. cd.8 兼務部門ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd8 = null;
	/**
	 * Concurrent dept. name 8 兼務部門名８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm8 = null;
	/**
	 * Concurrent dept. cd.9 兼務部門ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_cd9 = null;
	/**
	 * Concurrent dept. name 9 兼務部門名９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_dpt_nm9 = null;
	/**
	 * Approval role cd. (Main) 承認役割ＣＤ（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd = null;
	/**
	 * Approval role name (Main) 承認役割名（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm = null;
	/**
	 * Approval role cd. 1 (Main) 承認役割ＣＤ１（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd1 = null;
	/**
	 * Approval role name 1 (Main) 承認役割名１（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm1 = null;
	/**
	 * Approval role cd. 2 (Main) 承認役割ＣＤ２（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd2 = null;
	/**
	 * Approval role name 2 (Main) 承認役割名２（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm2 = null;
	/**
	 * Approval role cd. 3 (Main) 承認役割ＣＤ３（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd3 = null;
	/**
	 * Approval role name 3 (Main) 承認役割名３（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm3 = null;
	/**
	 * Approval role cd. 4 (Main) 承認役割ＣＤ４（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd4 = null;
	/**
	 * Approval role name 4 (Main) 承認役割名４（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm4 = null;
	/**
	 * Approval role cd. 5 (Main) 承認役割ＣＤ５（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd5 = null;
	/**
	 * Approval role name 5 (Main) 承認役割名５（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm5 = null;
	/**
	 * Approval role cd. 6 (Main) 承認役割ＣＤ６（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd6 = null;
	/**
	 * Approval role name 6 (Main) 承認役割名６（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm6 = null;
	/**
	 * Approval role cd. 7 (Main) 承認役割ＣＤ７（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd7 = null;
	/**
	 * Approval role name 7 (Main) 承認役割名７（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm7 = null;
	/**
	 * Approval role cd. 8 (Main) 承認役割ＣＤ８（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd8 = null;
	/**
	 * Approval role name 8 (Main) 承認役割名８（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm8 = null;
	/**
	 * Approval role cd. 9 (Main) 承認役割ＣＤ９（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_cd9 = null;
	/**
	 * Approval role name 9 (Main) 承認役割名９（主）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_role_nm9 = null;
	/**
	 * Approval role cd. (Sub) 承認役割ＣＤ（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd = null;
	/**
	 * Approval role name (Sub) 承認役割名（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm = null;
	/**
	 * Approval role cd. 1 (Sub) 承認役割ＣＤ１（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd1 = null;
	/**
	 * Approval role name 1 (Sub) 承認役割名１（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm1 = null;
	/**
	 * Approval role cd. 2 (Sub) 承認役割ＣＤ２（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd2 = null;
	/**
	 * Approval role name 2 (Sub) 承認役割名２（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm2 = null;
	/**
	 * Approval role cd. 3 (Sub) 承認役割ＣＤ３（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd3 = null;
	/**
	 * Approval role name 3 (Sub) 承認役割名３（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm3 = null;
	/**
	 * Approval role cd. 4 (Sub) 承認役割ＣＤ４（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd4 = null;
	/**
	 * Approval role name 4 (Sub) 承認役割名４（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm4 = null;
	/**
	 * Approval role cd. 5 (Sub) 承認役割ＣＤ５（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd5 = null;
	/**
	 * Approval role name 5 (Sub) 承認役割名５（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm5 = null;
	/**
	 * Approval role cd. 6 (Sub) 承認役割ＣＤ６（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd6 = null;
	/**
	 * Approval role name 6 (Sub) 承認役割名６（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm6 = null;
	/**
	 * Approval role cd. 7 (Sub) 承認役割ＣＤ７（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd7 = null;
	/**
	 * Approval role name 7 (Sub) 承認役割名７（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm7 = null;
	/**
	 * Approval role cd. 8 (Sub) 承認役割ＣＤ８（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd8 = null;
	/**
	 * Approval role name 8 (Sub) 承認役割名８（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm8 = null;
	/**
	 * Approval role cd. 9 (Sub) 承認役割ＣＤ９（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_cd9 = null;
	/**
	 * Approval role name 9 (Sub) 承認役割名９（副）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_aprv_role_nm9 = null;
	/**
	 * Main PIC 主担当.<p>
	 *
	 */
	public MCColumnConfig columnDtl_main_flg = null;
	/**
	 * Main dept. 主部門.<p>
	 *
	 */
	public MCColumnConfig columnDtl_main_dpt_flg = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * User management ユーザ管理.<p>
	 *
	 */
	public MCButton Btn_open_FSBFP0370 = null;
	/**
	 * Correct overlapping period 重複期間補正.<p>
	 *
	 */
	public MCButton Btn_correct_dup_dt = null;
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
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
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
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Info. インフォメーション.<p>
	 *
	 */
	public MCLabel Btn_inf_lbl = null;
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
	/** [REF_APRV]モードを表す定数 */
	public static final String REF_APRV = "REF_APRV";
	/** [REF_DPT]モードを表す定数 */
	public static final String REF_DPT = "REF_DPT";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF, REF_APRV, REF_DPT};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0250_Srch01]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Srch01Caller createMA_MABCL0250_Srch01() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Srch01Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch01Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Srch01Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch01Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Srch01]の呼び出し */
	protected void callMA_MABCL0250_Srch01() {
		MCCaller caller = createMA_MABCL0250_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0250_Sprt01]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Sprt01Caller createMA_MABCL0250_Sprt01() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Sprt01Caller<MABCP_UsrAclReg, MA_MABCL0250_Sprt01Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Sprt01Caller<MABCP_UsrAclReg, MA_MABCL0250_Sprt01Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Sprt01]の呼び出し */
	protected void callMA_MABCL0250_Sprt01() {
		MCCaller caller = createMA_MABCL0250_Sprt01();
		caller.exec();
	}
	/** [MA_MABCL0250_Upd01]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Upd01Caller createMA_MABCL0250_Upd01() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Upd01Caller<MABCP_UsrAclReg, MA_MABCL0250_Upd01Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Upd01Caller<MABCP_UsrAclReg, MA_MABCL0250_Upd01Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Upd01]の呼び出し */
	protected void callMA_MABCL0250_Upd01() {
		MCCaller caller = createMA_MABCL0250_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0250_Del01]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Del01Caller createMA_MABCL0250_Del01() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Del01Caller<MABCP_UsrAclReg, MA_MABCL0250_Del01Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Del01Caller<MABCP_UsrAclReg, MA_MABCL0250_Del01Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Del01]の呼び出し */
	protected void callMA_MABCL0250_Del01() {
		MCCaller caller = createMA_MABCL0250_Del01();
		caller.exec();
	}
	/** [MA_MABCL0250_Srch02]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Srch02Caller createMA_MABCL0250_Srch02() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Srch02Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch02Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Srch02Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch02Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Srch02Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Srch02]の呼び出し */
	protected void callMA_MABCL0250_Srch02() {
		MCCaller caller = createMA_MABCL0250_Srch02();
		caller.exec();
	}
	/** [MA_MABCL0250_Srch03]のCallerの作成 */
	protected MABCP_UsrAclReg_MC.MA_MABCL0250_Srch03Caller createMA_MABCL0250_Srch03() {
		MABCP_UsrAclReg_MC.MA_MABCL0250_Srch03Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch03Bridge>
		caller = ((MABCP_UsrAclReg_MC)this).new MA_MABCL0250_Srch03Caller<MABCP_UsrAclReg, MA_MABCL0250_Srch03Bridge>(
					(MABCP_UsrAclReg)this, new MA_MABCL0250_Srch03Bridge());
		return caller;
	}
	/** [MA_MABCL0250_Srch03]の呼び出し */
	protected void callMA_MABCL0250_Srch03() {
		MCCaller caller = createMA_MABCL0250_Srch03();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0250.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0250.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0250.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0250.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0250.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0250.CndR createCndR() {
		return mcframe.clientMABC.MABCP0250.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABC.MABCP0250.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP0250.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP0250.BulkSetR createBulkSetR() {
		return mcframe.clientMABC.MABCP0250.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0250.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0250.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0250.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0250.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0250.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(Cnd1Panel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_UsrAclReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_UsrAclReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_UsrAclReg_MC.jbCreateScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateTop((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateFold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateCnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateCnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateCnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateCtrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateBulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateDtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateBtn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbCreateEastBtn((MABCP_UsrAclReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_UsrAclReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_UsrAclReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_UsrAclReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_UsrAclReg p) {
		p.Cnd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt_p());
		p.Cnd_dt_p_PPanel.setName("Cnd.dt_p");
		p.Cnd_st_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_p_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_p_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
	}

	/**
	 * [Cnd1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd1(MABCP_UsrAclReg p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MABCP_UsrAclReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_UsrAclReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABCP_UsrAclReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_UsrAclReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0250.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_UsrAclReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_UsrAclReg p) {
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

	
	/** [Cnd_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_cd_p = null;

	/**
	 * [Cnd_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_cd_ListPutter() {
		if (Cnd_usr_cd_p == null) {
			Cnd_usr_cd_p = createCnd_usr_cd_ListPutter(Cnd_usr_cd, "usr_cd", "usr_nm");

		}
		return Cnd_usr_cd_p;
	}
	
	
	/** [Cnd_usr_com_typ_ListPutter]の定義 */
	private MCListPutter Cnd_usr_com_typ_p = null;

	/**
	 * [Cnd_usr_com_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_com_typ_ListPutter() {
		if (Cnd_usr_com_typ_p == null) {
			Cnd_usr_com_typ_p = createCnd_usr_com_typ_ListPutter(Cnd_usr_com_typ, "usr_com_typ", "usr_com_typ_nm");

		}
		return Cnd_usr_com_typ_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_usr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_dpt_cd_p = null;

	/**
	 * [Cnd_usr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_dpt_cd_ListPutter() {
		if (Cnd_usr_dpt_cd_p == null) {
			Cnd_usr_dpt_cd_p = createCnd_usr_dpt_cd_ListPutter(Cnd_usr_dpt_cd, "usr_dpt_cd", "usr_dpt_nm");

		}
		return Cnd_usr_dpt_cd_p;
	}
	
	
	/** [Cnd_da_cd_ListPutter]の定義 */
	private MCListPutter Cnd_da_cd_p = null;

	/**
	 * [Cnd_da_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_da_cd_ListPutter() {
		if (Cnd_da_cd_p == null) {
			Cnd_da_cd_p = createCnd_da_cd_ListPutter(Cnd_da_cd, "da_cd", "da_nm");

		}
		return Cnd_da_cd_p;
	}
	
	
	/** [Cnd_usr_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Cnd_usr_aprv_role_cd_p = null;

	/**
	 * [Cnd_usr_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_usr_aprv_role_cd_ListPutter() {
		if (Cnd_usr_aprv_role_cd_p == null) {
			Cnd_usr_aprv_role_cd_p = createCnd_usr_aprv_role_cd_ListPutter(Cnd_usr_aprv_role_cd, "usr_aprv_role_cd", "usr_aprv_role_nm");

		}
		return Cnd_usr_aprv_role_cd_p;
	}
	
	
	/** [Dtl_usr_cd_ListPutter]の定義 */
	private MCListPutter Dtl_usr_cd_p = null;

	/**
	 * [Dtl_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_cd_ListPutter() {
		if (Dtl_usr_cd_p == null) {
			Dtl_usr_cd_p = createDtl_usr_cd_ListPutter(columnDtl_usr_cd, "usr_cd", "usr_nm");

		}
		return Dtl_usr_cd_p;
	}
	
	
	/** [Dtl_da_cd_ListPutter]の定義 */
	private MCListPutter Dtl_da_cd_p = null;

	/**
	 * [Dtl_da_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_da_cd_ListPutter() {
		if (Dtl_da_cd_p == null) {
			Dtl_da_cd_p = createDtl_da_cd_ListPutter(columnDtl_da_cd, "da_cd", "da_nm");

		}
		return Dtl_da_cd_p;
	}
	
	
	/** [Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_cd_p = null;

	/**
	 * [Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_cd_ListPutter() {
		if (Dtl_dpt_cd_p == null) {
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Dtl_dpt_cd_p;
	}
	
	
	/** [Dtl_add_dpt_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd1_p = null;

	/**
	 * [Dtl_add_dpt_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd1_ListPutter() {
		if (Dtl_add_dpt_cd1_p == null) {
			Dtl_add_dpt_cd1_p = createDtl_add_dpt_cd1_ListPutter(columnDtl_add_dpt_cd1, "add_dpt_cd1", "add_dpt_nm1");

		}
		return Dtl_add_dpt_cd1_p;
	}
	
	
	/** [Dtl_add_dpt_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd2_p = null;

	/**
	 * [Dtl_add_dpt_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd2_ListPutter() {
		if (Dtl_add_dpt_cd2_p == null) {
			Dtl_add_dpt_cd2_p = createDtl_add_dpt_cd2_ListPutter(columnDtl_add_dpt_cd2, "add_dpt_cd2", "add_dpt_nm2");

		}
		return Dtl_add_dpt_cd2_p;
	}
	
	
	/** [Dtl_add_dpt_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd3_p = null;

	/**
	 * [Dtl_add_dpt_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd3_ListPutter() {
		if (Dtl_add_dpt_cd3_p == null) {
			Dtl_add_dpt_cd3_p = createDtl_add_dpt_cd3_ListPutter(columnDtl_add_dpt_cd3, "add_dpt_cd3", "add_dpt_nm3");

		}
		return Dtl_add_dpt_cd3_p;
	}
	
	
	/** [Dtl_add_dpt_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd4_p = null;

	/**
	 * [Dtl_add_dpt_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd4_ListPutter() {
		if (Dtl_add_dpt_cd4_p == null) {
			Dtl_add_dpt_cd4_p = createDtl_add_dpt_cd4_ListPutter(columnDtl_add_dpt_cd4, "add_dpt_cd4", "add_dpt_nm4");

		}
		return Dtl_add_dpt_cd4_p;
	}
	
	
	/** [Dtl_add_dpt_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd5_p = null;

	/**
	 * [Dtl_add_dpt_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd5_ListPutter() {
		if (Dtl_add_dpt_cd5_p == null) {
			Dtl_add_dpt_cd5_p = createDtl_add_dpt_cd5_ListPutter(columnDtl_add_dpt_cd5, "add_dpt_cd5", "add_dpt_nm5");

		}
		return Dtl_add_dpt_cd5_p;
	}
	
	
	/** [Dtl_add_dpt_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd6_p = null;

	/**
	 * [Dtl_add_dpt_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd6_ListPutter() {
		if (Dtl_add_dpt_cd6_p == null) {
			Dtl_add_dpt_cd6_p = createDtl_add_dpt_cd6_ListPutter(columnDtl_add_dpt_cd6, "add_dpt_cd6", "add_dpt_nm6");

		}
		return Dtl_add_dpt_cd6_p;
	}
	
	
	/** [Dtl_add_dpt_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd7_p = null;

	/**
	 * [Dtl_add_dpt_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd7_ListPutter() {
		if (Dtl_add_dpt_cd7_p == null) {
			Dtl_add_dpt_cd7_p = createDtl_add_dpt_cd7_ListPutter(columnDtl_add_dpt_cd7, "add_dpt_cd7", "add_dpt_nm7");

		}
		return Dtl_add_dpt_cd7_p;
	}
	
	
	/** [Dtl_add_dpt_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd8_p = null;

	/**
	 * [Dtl_add_dpt_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd8_ListPutter() {
		if (Dtl_add_dpt_cd8_p == null) {
			Dtl_add_dpt_cd8_p = createDtl_add_dpt_cd8_ListPutter(columnDtl_add_dpt_cd8, "add_dpt_cd8", "add_dpt_nm8");

		}
		return Dtl_add_dpt_cd8_p;
	}
	
	
	/** [Dtl_add_dpt_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_add_dpt_cd9_p = null;

	/**
	 * [Dtl_add_dpt_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_add_dpt_cd9_ListPutter() {
		if (Dtl_add_dpt_cd9_p == null) {
			Dtl_add_dpt_cd9_p = createDtl_add_dpt_cd9_ListPutter(columnDtl_add_dpt_cd9, "add_dpt_cd9", "add_dpt_nm9");

		}
		return Dtl_add_dpt_cd9_p;
	}
	
	
	/** [Dtl_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd_p = null;

	/**
	 * [Dtl_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd_ListPutter() {
		if (Dtl_aprv_role_cd_p == null) {
			Dtl_aprv_role_cd_p = createDtl_aprv_role_cd_ListPutter(columnDtl_aprv_role_cd, "aprv_role_cd", "aprv_role_nm");

		}
		return Dtl_aprv_role_cd_p;
	}
	
	
	/** [Dtl_aprv_role_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd1_p = null;

	/**
	 * [Dtl_aprv_role_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd1_ListPutter() {
		if (Dtl_aprv_role_cd1_p == null) {
			Dtl_aprv_role_cd1_p = createDtl_aprv_role_cd1_ListPutter(columnDtl_aprv_role_cd1, "aprv_role_cd1", "aprv_role_nm1");

		}
		return Dtl_aprv_role_cd1_p;
	}
	
	
	/** [Dtl_aprv_role_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd2_p = null;

	/**
	 * [Dtl_aprv_role_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd2_ListPutter() {
		if (Dtl_aprv_role_cd2_p == null) {
			Dtl_aprv_role_cd2_p = createDtl_aprv_role_cd2_ListPutter(columnDtl_aprv_role_cd2, "aprv_role_cd2", "aprv_role_nm2");

		}
		return Dtl_aprv_role_cd2_p;
	}
	
	
	/** [Dtl_aprv_role_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd3_p = null;

	/**
	 * [Dtl_aprv_role_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd3_ListPutter() {
		if (Dtl_aprv_role_cd3_p == null) {
			Dtl_aprv_role_cd3_p = createDtl_aprv_role_cd3_ListPutter(columnDtl_aprv_role_cd3, "aprv_role_cd3", "aprv_role_nm3");

		}
		return Dtl_aprv_role_cd3_p;
	}
	
	
	/** [Dtl_aprv_role_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd4_p = null;

	/**
	 * [Dtl_aprv_role_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd4_ListPutter() {
		if (Dtl_aprv_role_cd4_p == null) {
			Dtl_aprv_role_cd4_p = createDtl_aprv_role_cd4_ListPutter(columnDtl_aprv_role_cd4, "aprv_role_cd4", "aprv_role_nm4");

		}
		return Dtl_aprv_role_cd4_p;
	}
	
	
	/** [Dtl_aprv_role_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd5_p = null;

	/**
	 * [Dtl_aprv_role_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd5_ListPutter() {
		if (Dtl_aprv_role_cd5_p == null) {
			Dtl_aprv_role_cd5_p = createDtl_aprv_role_cd5_ListPutter(columnDtl_aprv_role_cd5, "aprv_role_cd5", "aprv_role_nm5");

		}
		return Dtl_aprv_role_cd5_p;
	}
	
	
	/** [Dtl_aprv_role_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd6_p = null;

	/**
	 * [Dtl_aprv_role_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd6_ListPutter() {
		if (Dtl_aprv_role_cd6_p == null) {
			Dtl_aprv_role_cd6_p = createDtl_aprv_role_cd6_ListPutter(columnDtl_aprv_role_cd6, "aprv_role_cd6", "aprv_role_nm6");

		}
		return Dtl_aprv_role_cd6_p;
	}
	
	
	/** [Dtl_aprv_role_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd7_p = null;

	/**
	 * [Dtl_aprv_role_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd7_ListPutter() {
		if (Dtl_aprv_role_cd7_p == null) {
			Dtl_aprv_role_cd7_p = createDtl_aprv_role_cd7_ListPutter(columnDtl_aprv_role_cd7, "aprv_role_cd7", "aprv_role_nm7");

		}
		return Dtl_aprv_role_cd7_p;
	}
	
	
	/** [Dtl_aprv_role_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd8_p = null;

	/**
	 * [Dtl_aprv_role_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd8_ListPutter() {
		if (Dtl_aprv_role_cd8_p == null) {
			Dtl_aprv_role_cd8_p = createDtl_aprv_role_cd8_ListPutter(columnDtl_aprv_role_cd8, "aprv_role_cd8", "aprv_role_nm8");

		}
		return Dtl_aprv_role_cd8_p;
	}
	
	
	/** [Dtl_aprv_role_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_aprv_role_cd9_p = null;

	/**
	 * [Dtl_aprv_role_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_aprv_role_cd9_ListPutter() {
		if (Dtl_aprv_role_cd9_p == null) {
			Dtl_aprv_role_cd9_p = createDtl_aprv_role_cd9_ListPutter(columnDtl_aprv_role_cd9, "aprv_role_cd9", "aprv_role_nm9");

		}
		return Dtl_aprv_role_cd9_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd_ListPutter() {
		if (Dtl_sub_aprv_role_cd_p == null) {
			Dtl_sub_aprv_role_cd_p = createDtl_sub_aprv_role_cd_ListPutter(columnDtl_sub_aprv_role_cd, "sub_aprv_role_cd", "sub_aprv_role_nm");

		}
		return Dtl_sub_aprv_role_cd_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd1_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd1_ListPutter() {
		if (Dtl_sub_aprv_role_cd1_p == null) {
			Dtl_sub_aprv_role_cd1_p = createDtl_sub_aprv_role_cd1_ListPutter(columnDtl_sub_aprv_role_cd1, "sub_aprv_role_cd1", "sub_aprv_role_nm1");

		}
		return Dtl_sub_aprv_role_cd1_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd2_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd2_ListPutter() {
		if (Dtl_sub_aprv_role_cd2_p == null) {
			Dtl_sub_aprv_role_cd2_p = createDtl_sub_aprv_role_cd2_ListPutter(columnDtl_sub_aprv_role_cd2, "sub_aprv_role_cd2", "sub_aprv_role_nm2");

		}
		return Dtl_sub_aprv_role_cd2_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd3_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd3_ListPutter() {
		if (Dtl_sub_aprv_role_cd3_p == null) {
			Dtl_sub_aprv_role_cd3_p = createDtl_sub_aprv_role_cd3_ListPutter(columnDtl_sub_aprv_role_cd3, "sub_aprv_role_cd3", "sub_aprv_role_nm3");

		}
		return Dtl_sub_aprv_role_cd3_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd4_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd4_ListPutter() {
		if (Dtl_sub_aprv_role_cd4_p == null) {
			Dtl_sub_aprv_role_cd4_p = createDtl_sub_aprv_role_cd4_ListPutter(columnDtl_sub_aprv_role_cd4, "sub_aprv_role_cd4", "sub_aprv_role_nm4");

		}
		return Dtl_sub_aprv_role_cd4_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd5_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd5_ListPutter() {
		if (Dtl_sub_aprv_role_cd5_p == null) {
			Dtl_sub_aprv_role_cd5_p = createDtl_sub_aprv_role_cd5_ListPutter(columnDtl_sub_aprv_role_cd5, "sub_aprv_role_cd5", "sub_aprv_role_nm5");

		}
		return Dtl_sub_aprv_role_cd5_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd6_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd6_ListPutter() {
		if (Dtl_sub_aprv_role_cd6_p == null) {
			Dtl_sub_aprv_role_cd6_p = createDtl_sub_aprv_role_cd6_ListPutter(columnDtl_sub_aprv_role_cd6, "sub_aprv_role_cd6", "sub_aprv_role_nm6");

		}
		return Dtl_sub_aprv_role_cd6_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd7_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd7_ListPutter() {
		if (Dtl_sub_aprv_role_cd7_p == null) {
			Dtl_sub_aprv_role_cd7_p = createDtl_sub_aprv_role_cd7_ListPutter(columnDtl_sub_aprv_role_cd7, "sub_aprv_role_cd7", "sub_aprv_role_nm7");

		}
		return Dtl_sub_aprv_role_cd7_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd8_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd8_ListPutter() {
		if (Dtl_sub_aprv_role_cd8_p == null) {
			Dtl_sub_aprv_role_cd8_p = createDtl_sub_aprv_role_cd8_ListPutter(columnDtl_sub_aprv_role_cd8, "sub_aprv_role_cd8", "sub_aprv_role_nm8");

		}
		return Dtl_sub_aprv_role_cd8_p;
	}
	
	
	/** [Dtl_sub_aprv_role_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_sub_aprv_role_cd9_p = null;

	/**
	 * [Dtl_sub_aprv_role_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sub_aprv_role_cd9_ListPutter() {
		if (Dtl_sub_aprv_role_cd9_p == null) {
			Dtl_sub_aprv_role_cd9_p = createDtl_sub_aprv_role_cd9_ListPutter(columnDtl_sub_aprv_role_cd9, "sub_aprv_role_cd9", "sub_aprv_role_nm9");

		}
		return Dtl_sub_aprv_role_cd9_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_UsrAclReg create(){
		MABCP_UsrAclReg p = new MABCP_UsrAclReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_UsrAclReg create(String name){
		MABCP_UsrAclReg p = new MABCP_UsrAclReg(name);
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
		MABCP_UsrAclReg_MC.jbfInitScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitTop((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitFold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitCnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitCnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitCnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitCtrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitBulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitDtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitBtn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbfInitEastBtn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitTop((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitFold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitCnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitCnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitCnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitCtrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitBulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitDtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitBtn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.jbInitEastBtn((MABCP_UsrAclReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_UsrAclReg p) {
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
	protected static void jbfInitCnd(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_REF_APRV = p.beansFactory.createRadioButton("Cnd.ope_REF_APRV");
		p.Cnd_ope_REF_DPT = p.beansFactory.createRadioButton("Cnd.ope_REF_DPT");
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_usr_com_typ_Label = p.beansFactory.createLabel("Cnd.usr_com_typ_Label");
		p.Cnd_usr_com_typ = p.beansFactory.createTextComboBox("Cnd.usr_com_typ");
		p.Cnd_usr_com_typ.setLabel(p.Cnd_usr_com_typ_Label);
		p.Cnd_usr_com_typ_nm = p.beansFactory.createTextField("Cnd.usr_com_typ_nm");
		p.Cnd_usr_com_Label = p.beansFactory.createLabel("Cnd.usr_com_Label");
		p.Cnd_usr_com = p.beansFactory.createTextField("Cnd.usr_com");
		p.Cnd_usr_com.setLabel(p.Cnd_usr_com_Label);
		p.Cnd_usr_alt_nm1_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm1_Label");
		p.Cnd_usr_alt_nm1 = p.beansFactory.createTextField("Cnd.usr_alt_nm1");
		p.Cnd_usr_alt_nm1.setLabel(p.Cnd_usr_alt_nm1_Label);
		p.Cnd_usr_alt_nm2_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm2_Label");
		p.Cnd_usr_alt_nm2 = p.beansFactory.createTextField("Cnd.usr_alt_nm2");
		p.Cnd_usr_alt_nm2.setLabel(p.Cnd_usr_alt_nm2_Label);
		p.Cnd_usr_alt_nm3_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm3_Label");
		p.Cnd_usr_alt_nm3 = p.beansFactory.createTextField("Cnd.usr_alt_nm3");
		p.Cnd_usr_alt_nm3.setLabel(p.Cnd_usr_alt_nm3_Label);
		p.Cnd_usr_alt_nm4_Label = p.beansFactory.createLabel("Cnd.usr_alt_nm4_Label");
		p.Cnd_usr_alt_nm4 = p.beansFactory.createTextField("Cnd.usr_alt_nm4");
		p.Cnd_usr_alt_nm4.setLabel(p.Cnd_usr_alt_nm4_Label);
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_usr_dpt_cd_Label = p.beansFactory.createLabel("Cnd.usr_dpt_cd_Label");
		p.Cnd_usr_dpt_cd = p.beansFactory.createTextField("Cnd.usr_dpt_cd");
		p.Cnd_usr_dpt_cd.setLabel(p.Cnd_usr_dpt_cd_Label);
		p.Cnd_usr_dpt_nm = p.beansFactory.createTextField("Cnd.usr_dpt_nm");
		p.Cnd_da_cd_Label = p.beansFactory.createLabel("Cnd.da_cd_Label");
		p.Cnd_da_cd = p.beansFactory.createTextComboBox("Cnd.da_cd");
		p.Cnd_da_cd.setLabel(p.Cnd_da_cd_Label);
		p.Cnd_da_nm = p.beansFactory.createTextField("Cnd.da_nm");
		p.Cnd_usr_aprv_role_cd_Label = p.beansFactory.createLabel("Cnd.usr_aprv_role_cd_Label");
		p.Cnd_usr_aprv_role_cd = p.beansFactory.createTextComboBox("Cnd.usr_aprv_role_cd");
		p.Cnd_usr_aprv_role_cd.setLabel(p.Cnd_usr_aprv_role_cd_Label);
		p.Cnd_usr_aprv_role_nm = p.beansFactory.createTextField("Cnd.usr_aprv_role_nm");
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
		p.Cnd_usr_info1_Label = p.beansFactory.createLabel("Cnd.usr_info1_Label");
		p.Cnd_usr_info1 = p.beansFactory.createTextField("Cnd.usr_info1");
		p.Cnd_usr_info1.setLabel(p.Cnd_usr_info1_Label);
		p.Cnd_usr_info2_Label = p.beansFactory.createLabel("Cnd.usr_info2_Label");
		p.Cnd_usr_info2 = p.beansFactory.createTextField("Cnd.usr_info2");
		p.Cnd_usr_info2.setLabel(p.Cnd_usr_info2_Label);
		p.Cnd_usr_info3_Label = p.beansFactory.createLabel("Cnd.usr_info3_Label");
		p.Cnd_usr_info3 = p.beansFactory.createTextField("Cnd.usr_info3");
		p.Cnd_usr_info3.setLabel(p.Cnd_usr_info3_Label);
		p.Cnd_usr_info4_Label = p.beansFactory.createLabel("Cnd.usr_info4_Label");
		p.Cnd_usr_info4 = p.beansFactory.createTextField("Cnd.usr_info4");
		p.Cnd_usr_info4.setLabel(p.Cnd_usr_info4_Label);
		p.Cnd_usr_info5_Label = p.beansFactory.createLabel("Cnd.usr_info5_Label");
		p.Cnd_usr_info5 = p.beansFactory.createTextField("Cnd.usr_info5");
		p.Cnd_usr_info5.setLabel(p.Cnd_usr_info5_Label);
		p.Cnd_usr_info6_Label = p.beansFactory.createLabel("Cnd.usr_info6_Label");
		p.Cnd_usr_info6 = p.beansFactory.createTextField("Cnd.usr_info6");
		p.Cnd_usr_info6.setLabel(p.Cnd_usr_info6_Label);
		p.Cnd_usr_info7_Label = p.beansFactory.createLabel("Cnd.usr_info7_Label");
		p.Cnd_usr_info7 = p.beansFactory.createTextField("Cnd.usr_info7");
		p.Cnd_usr_info7.setLabel(p.Cnd_usr_info7_Label);
		p.Cnd_usr_info8_Label = p.beansFactory.createLabel("Cnd.usr_info8_Label");
		p.Cnd_usr_info8 = p.beansFactory.createTextField("Cnd.usr_info8");
		p.Cnd_usr_info8.setLabel(p.Cnd_usr_info8_Label);
		p.Cnd_usr_info9_Label = p.beansFactory.createLabel("Cnd.usr_info9_Label");
		p.Cnd_usr_info9 = p.beansFactory.createTextField("Cnd.usr_info9");
		p.Cnd_usr_info9.setLabel(p.Cnd_usr_info9_Label);
		p.Cnd_usr_info10_Label = p.beansFactory.createLabel("Cnd.usr_info10_Label");
		p.Cnd_usr_info10 = p.beansFactory.createTextField("Cnd.usr_info10");
		p.Cnd_usr_info10.setLabel(p.Cnd_usr_info10_Label);
		p.Cnd_usr_info11_Label = p.beansFactory.createLabel("Cnd.usr_info11_Label");
		p.Cnd_usr_info11 = p.beansFactory.createTextField("Cnd.usr_info11");
		p.Cnd_usr_info11.setLabel(p.Cnd_usr_info11_Label);
		p.Cnd_usr_info12_Label = p.beansFactory.createLabel("Cnd.usr_info12_Label");
		p.Cnd_usr_info12 = p.beansFactory.createTextField("Cnd.usr_info12");
		p.Cnd_usr_info12.setLabel(p.Cnd_usr_info12_Label);
		p.Cnd_usr_info13_Label = p.beansFactory.createLabel("Cnd.usr_info13_Label");
		p.Cnd_usr_info13 = p.beansFactory.createTextField("Cnd.usr_info13");
		p.Cnd_usr_info13.setLabel(p.Cnd_usr_info13_Label);
		p.Cnd_usr_info14_Label = p.beansFactory.createLabel("Cnd.usr_info14_Label");
		p.Cnd_usr_info14 = p.beansFactory.createTextField("Cnd.usr_info14");
		p.Cnd_usr_info14.setLabel(p.Cnd_usr_info14_Label);
		p.Cnd_usr_info15_Label = p.beansFactory.createLabel("Cnd.usr_info15_Label");
		p.Cnd_usr_info15 = p.beansFactory.createTextField("Cnd.usr_info15");
		p.Cnd_usr_info15.setLabel(p.Cnd_usr_info15_Label);
		p.Cnd_usr_info16_Label = p.beansFactory.createLabel("Cnd.usr_info16_Label");
		p.Cnd_usr_info16 = p.beansFactory.createTextField("Cnd.usr_info16");
		p.Cnd_usr_info16.setLabel(p.Cnd_usr_info16_Label);
		p.Cnd_usr_info17_Label = p.beansFactory.createLabel("Cnd.usr_info17_Label");
		p.Cnd_usr_info17 = p.beansFactory.createTextField("Cnd.usr_info17");
		p.Cnd_usr_info17.setLabel(p.Cnd_usr_info17_Label);
		p.Cnd_usr_info18_Label = p.beansFactory.createLabel("Cnd.usr_info18_Label");
		p.Cnd_usr_info18 = p.beansFactory.createTextField("Cnd.usr_info18");
		p.Cnd_usr_info18.setLabel(p.Cnd_usr_info18_Label);
		p.Cnd_usr_info19_Label = p.beansFactory.createLabel("Cnd.usr_info19_Label");
		p.Cnd_usr_info19 = p.beansFactory.createTextField("Cnd.usr_info19");
		p.Cnd_usr_info19.setLabel(p.Cnd_usr_info19_Label);
		p.Cnd_usr_info20_Label = p.beansFactory.createLabel("Cnd.usr_info20_Label");
		p.Cnd_usr_info20 = p.beansFactory.createTextField("Cnd.usr_info20");
		p.Cnd_usr_info20.setLabel(p.Cnd_usr_info20_Label);
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd1(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel = p.beansFactory.createPanel("Cnd1");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_upd_dt = p.beansFactory.createButton("BulkSet.upd_dt");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_usr_cd = p.beansFactory.createTableColumn("Dtl.usr_cd", MCColumnType.TEXT);
		p.columnDtl_usr_nm = p.beansFactory.createTableColumn("Dtl.usr_nm", MCColumnType.TEXT);
		p.columnDtl_license_flg = p.beansFactory.createTableColumn("Dtl.license_flg", MCColumnType.CHECK);
		p.columnDtl_usr_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.usr_aprv_role_cd", MCColumnType.TEXT);
		p.columnDtl_usr_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.usr_aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_usr_dpt_cd = p.beansFactory.createTableColumn("Dtl.usr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_usr_dpt_nm = p.beansFactory.createTableColumn("Dtl.usr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_da_cd = p.beansFactory.createTableColumn("Dtl.da_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_da_nm = p.beansFactory.createTableColumn("Dtl.da_nm", MCColumnType.TEXT);
		p.columnDtl_pre_cl_usr_flg = p.beansFactory.createTableColumn("Dtl.pre_cl_usr_flg", MCColumnType.CHECK);
		p.columnDtl_cl_usr_flg = p.beansFactory.createTableColumn("Dtl.cl_usr_flg", MCColumnType.CHECK);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd1 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm1 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm1", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd2 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm2 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm2", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd3 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm3 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm3", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd4 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm4 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm4", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd5 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm5 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm5", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd6 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm6 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm6", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd7 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm7 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm7", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd8 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm8 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm8", MCColumnType.TEXT);
		p.columnDtl_add_dpt_cd9 = p.beansFactory.createTableColumn("Dtl.add_dpt_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_add_dpt_nm9 = p.beansFactory.createTableColumn("Dtl.add_dpt_nm9", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd1 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm1 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm1", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd2 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm2 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm2", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd3 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm3 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm3", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd4 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm4 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm4", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd5 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm5 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm5", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd6 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm6 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm6", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd7 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm7 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm7", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd8 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm8 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm8", MCColumnType.TEXT);
		p.columnDtl_aprv_role_cd9 = p.beansFactory.createTableColumn("Dtl.aprv_role_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_aprv_role_nm9 = p.beansFactory.createTableColumn("Dtl.aprv_role_nm9", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd1 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm1 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm1", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd2 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm2 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm2", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd3 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm3 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm3", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd4 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm4 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm4", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd5 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm5 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm5", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd6 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm6 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm6", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd7 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm7 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm7", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd8 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm8 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm8", MCColumnType.TEXT);
		p.columnDtl_sub_aprv_role_cd9 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_sub_aprv_role_nm9 = p.beansFactory.createTableColumn("Dtl.sub_aprv_role_nm9", MCColumnType.TEXT);
		p.columnDtl_main_flg = p.beansFactory.createTableColumn("Dtl.main_flg", MCColumnType.CHECK);
		p.columnDtl_main_dpt_flg = p.beansFactory.createTableColumn("Dtl.main_dpt_flg", MCColumnType.CHECK);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_FSBFP0370 = p.beansFactory.createButton("Btn.open_FSBFP0370", "open");
		p.Btn_correct_dup_dt = p.beansFactory.createButton("Btn.correct_dup_dt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_inf_lbl = p.beansFactory.createLabel("Btn.inf_lbl");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_UsrAclReg p) {
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
	protected static void jbInitTop(MABCP_UsrAclReg p) {
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
	protected static void jbInitFold(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Cnd1Panel, "Fold.cnd1");
		p.FoldTab.setLastBeans(p.Cnd1Panel);
		p.Cnd1Panel.setNextBeans(p.Cnd2Panel);
		p.FoldTab.add(p.Cnd2Panel, "Fold.cnd2");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BulkSetPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
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
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_REF_APRV);
		p.Cnd_ope_REF_APRV.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_APRV);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_APRV);
		p.Cnd_ope_REF_APRV.setNextBeans(p.Cnd_ope_REF_DPT);
		p.Cnd_ope_REF_DPT.setActionCommand("6");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_DPT);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_DPT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.ope_META);
		p.Cnd1Panel.add(p.Cnd_dt_p_PPanel);
		p.Cnd1Panel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_usr_cd);
		p.Cnd1Panel.add(p.Cnd_usr_cd_Label);
		p.Cnd1Panel.add(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.Cnd1Panel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_usr_com_typ);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.Cnd_usr_com_typ.setListType(MCListType.STRICT);
		p.Cnd_usr_com_typ.setLinkBeans(p.Cnd_usr_com_typ_nm);
		p.Cnd1Panel.add(p.Cnd_usr_com_typ_Label);
		p.Cnd1Panel.add(p.Cnd_usr_com_typ);
		p.Cnd_usr_com_typ.setNextBeans(p.Cnd_usr_com_typ_nm);
		p.Cnd_usr_com_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_com_typ_META);
		p.Cnd1Panel.add(p.Cnd_usr_com_typ_nm);
		p.Cnd_usr_com_typ_nm.setNextBeans(p.Cnd_usr_com);
		p.Cnd_usr_com_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_com_typ_nm_META);
		p.Cnd1Panel.add(p.Cnd_usr_com_Label);
		p.Cnd1Panel.add(p.Cnd_usr_com);
		p.Cnd_usr_com.setNextBeans(p.Cnd_usr_alt_nm1);
		p.Cnd_usr_com.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_com_META);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm1_Label);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm1);
		p.Cnd_usr_alt_nm1.setNextBeans(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_alt_nm1_META);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm2_Label);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm2.setNextBeans(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_alt_nm2_META);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm3_Label);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm3.setNextBeans(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_alt_nm3_META);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm4_Label);
		p.Cnd1Panel.add(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm4.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_usr_alt_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_alt_nm4_META);
		p.Cnd1Panel.add(p.Cnd_dpt_cd_Label);
		p.Cnd1Panel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Cnd1Panel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_usr_dpt_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd1Panel.add(p.Cnd_usr_dpt_cd_Label);
		p.Cnd1Panel.add(p.Cnd_usr_dpt_cd);
		p.Cnd_usr_dpt_cd.setNextBeans(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_dpt_cd_META);
		p.Cnd_usr_dpt_cd.addLinkBeans(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_dpt_cd, true);
		p.Cnd1Panel.add(p.Cnd_usr_dpt_nm);
		p.Cnd_usr_dpt_nm.setNextBeans(p.Cnd_da_cd);
		p.Cnd_usr_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_dpt_nm, true);
		p.Cnd_da_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_da_cd, true);
		p.Cnd_da_cd.setLinkBeans(p.Cnd_da_nm);
		p.Cnd1Panel.add(p.Cnd_da_cd_Label);
		p.Cnd1Panel.add(p.Cnd_da_cd);
		p.Cnd_da_cd.setNextBeans(p.Cnd_da_nm);
		p.Cnd_da_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.da_cd_META);
		p.Cnd1Panel.add(p.Cnd_da_nm);
		p.Cnd_da_nm.setNextBeans(p.Cnd_usr_aprv_role_cd);
		p.Cnd_da_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.da_nm_META);
		p.setPluralValueEnable(p.Cnd_da_nm, true);
		p.Cnd_usr_aprv_role_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_aprv_role_cd, true);
		p.Cnd_usr_aprv_role_cd.setLinkBeans(p.Cnd_usr_aprv_role_nm);
		p.Cnd1Panel.add(p.Cnd_usr_aprv_role_cd_Label);
		p.Cnd1Panel.add(p.Cnd_usr_aprv_role_cd);
		p.Cnd_usr_aprv_role_cd.setNextBeans(p.Cnd_usr_aprv_role_nm);
		p.Cnd_usr_aprv_role_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_aprv_role_cd_META);
		p.Cnd1Panel.add(p.Cnd_usr_aprv_role_nm);
		p.Cnd_usr_aprv_role_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_usr_aprv_role_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_aprv_role_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_aprv_role_nm, true);
		p.Cnd1Panel.add(p.Cnd_memo1_Label);
		p.Cnd1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Cnd1Panel.add(p.Cnd_memo2_Label);
		p.Cnd1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Cnd1Panel.add(p.Cnd_memo3_Label);
		p.Cnd1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Cnd1Panel.add(p.Cnd_del_flg_lab);
		p.Cnd1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.off_del_flg_META);
		p.Cnd1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.on_del_flg_META);
		p.Cnd2Panel.add(p.Cnd_usr_info1_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info1);
		p.Cnd2Panel.setLastBeans(p.Cnd_usr_info1);
		p.Cnd_usr_info1.setNextBeans(p.Cnd_usr_info2);
		p.Cnd_usr_info1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info1_META);
		p.Cnd2Panel.add(p.Cnd_usr_info2_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info2);
		p.Cnd_usr_info2.setNextBeans(p.Cnd_usr_info3);
		p.Cnd_usr_info2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info2_META);
		p.Cnd2Panel.add(p.Cnd_usr_info3_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info3);
		p.Cnd_usr_info3.setNextBeans(p.Cnd_usr_info4);
		p.Cnd_usr_info3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info3_META);
		p.Cnd2Panel.add(p.Cnd_usr_info4_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info4);
		p.Cnd_usr_info4.setNextBeans(p.Cnd_usr_info5);
		p.Cnd_usr_info4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info4_META);
		p.Cnd2Panel.add(p.Cnd_usr_info5_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info5);
		p.Cnd_usr_info5.setNextBeans(p.Cnd_usr_info6);
		p.Cnd_usr_info5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info5_META);
		p.Cnd2Panel.add(p.Cnd_usr_info6_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info6);
		p.Cnd_usr_info6.setNextBeans(p.Cnd_usr_info7);
		p.Cnd_usr_info6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info6_META);
		p.Cnd2Panel.add(p.Cnd_usr_info7_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info7);
		p.Cnd_usr_info7.setNextBeans(p.Cnd_usr_info8);
		p.Cnd_usr_info7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info7_META);
		p.Cnd2Panel.add(p.Cnd_usr_info8_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info8);
		p.Cnd_usr_info8.setNextBeans(p.Cnd_usr_info9);
		p.Cnd_usr_info8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info8_META);
		p.Cnd2Panel.add(p.Cnd_usr_info9_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info9);
		p.Cnd_usr_info9.setNextBeans(p.Cnd_usr_info10);
		p.Cnd_usr_info9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info9_META);
		p.Cnd2Panel.add(p.Cnd_usr_info10_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info10);
		p.Cnd_usr_info10.setNextBeans(p.Cnd_usr_info11);
		p.Cnd_usr_info10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info10_META);
		p.Cnd2Panel.add(p.Cnd_usr_info11_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info11);
		p.Cnd_usr_info11.setNextBeans(p.Cnd_usr_info12);
		p.Cnd_usr_info11.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info11_META);
		p.Cnd2Panel.add(p.Cnd_usr_info12_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info12);
		p.Cnd_usr_info12.setNextBeans(p.Cnd_usr_info13);
		p.Cnd_usr_info12.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info12_META);
		p.Cnd2Panel.add(p.Cnd_usr_info13_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info13);
		p.Cnd_usr_info13.setNextBeans(p.Cnd_usr_info14);
		p.Cnd_usr_info13.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info13_META);
		p.Cnd2Panel.add(p.Cnd_usr_info14_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info14);
		p.Cnd_usr_info14.setNextBeans(p.Cnd_usr_info15);
		p.Cnd_usr_info14.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info14_META);
		p.Cnd2Panel.add(p.Cnd_usr_info15_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info15);
		p.Cnd_usr_info15.setNextBeans(p.Cnd_usr_info16);
		p.Cnd_usr_info15.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info15_META);
		p.Cnd2Panel.add(p.Cnd_usr_info16_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info16);
		p.Cnd_usr_info16.setNextBeans(p.Cnd_usr_info17);
		p.Cnd_usr_info16.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info16_META);
		p.Cnd2Panel.add(p.Cnd_usr_info17_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info17);
		p.Cnd_usr_info17.setNextBeans(p.Cnd_usr_info18);
		p.Cnd_usr_info17.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info17_META);
		p.Cnd2Panel.add(p.Cnd_usr_info18_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info18);
		p.Cnd_usr_info18.setNextBeans(p.Cnd_usr_info19);
		p.Cnd_usr_info18.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info18_META);
		p.Cnd2Panel.add(p.Cnd_usr_info19_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info19);
		p.Cnd_usr_info19.setNextBeans(p.Cnd_usr_info20);
		p.Cnd_usr_info19.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info19_META);
		p.Cnd2Panel.add(p.Cnd_usr_info20_Label);
		p.Cnd2Panel.add(p.Cnd_usr_info20);
		p.Cnd_usr_info20.setRow(p.getCndR(), mcframe.clientMABC.MABCP0250.CndR.usr_info20_META);
	}

	/**
	 * [Cnd1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd1(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.Cnd1Panel.setNextBeans(p.Cnd2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_UsrAclReg p) {
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
	protected static void jbInitBulkSet(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP0250.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_upd_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP0250.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_upd_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_upd_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_UsrAclReg p) {
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
	protected static void jbInitBtn(MABCP_UsrAclReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_FSBFP0370.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_FSBFP0370);
		p.BtnPanel.setLastBeans(p.Btn_open_FSBFP0370);
		p.Btn_open_FSBFP0370.setNextBeans(p.Btn_correct_dup_dt);
		p.Btn_correct_dup_dt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_correct_dup_dt);
		p.Btn_correct_dup_dt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.add(p.Btn_inf_lbl);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_UsrAclReg p) {
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
		MABCP_UsrAclReg_MC.mcInitScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitTop((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitFold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitCnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitCnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitCnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitCtrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitBulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitDtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitBtn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.mcInitEastBtn((MABCP_UsrAclReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitUPD_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitUPD_EastBtn((MABCP_UsrAclReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitFIX_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitFIX_EastBtn((MABCP_UsrAclReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitDEL_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitDEL_EastBtn((MABCP_UsrAclReg)this);

		// [REF]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitREF_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF_EastBtn((MABCP_UsrAclReg)this);

		// [REF_APRV]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitREF__APRV_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__APRV_EastBtn((MABCP_UsrAclReg)this);

		// [REF_DPT]ステータスのモードの設定
		MABCP_UsrAclReg_MC.statusInitREF__DPT_ScreenOpe((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Top((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Fold((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Cnd((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Cnd1((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Cnd2((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Ctrl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_BulkSet((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Dtl((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_Btn((MABCP_UsrAclReg)this);
		MABCP_UsrAclReg_MC.statusInitREF__DPT_EastBtn((MABCP_UsrAclReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_UsrAclReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_UsrAclReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_UsrAclReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_UsrAclReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_REF_APRV.addAllListener(p);
		p.Cnd_ope_REF_DPT.addAllListener(p);
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_usr_com_typ.setListListener(p);
		p.Cnd_usr_com_typ.addAllListener(p);
		p.Cnd_usr_com_typ_nm.setListListener(p);
		p.Cnd_usr_com_typ_nm.addAllListener(p);
		p.Cnd_usr_com.setListListener(p);
		p.Cnd_usr_com.addAllListener(p);
		p.Cnd_usr_alt_nm1.setListListener(p);
		p.Cnd_usr_alt_nm1.addAllListener(p);
		p.Cnd_usr_alt_nm2.setListListener(p);
		p.Cnd_usr_alt_nm2.addAllListener(p);
		p.Cnd_usr_alt_nm3.setListListener(p);
		p.Cnd_usr_alt_nm3.addAllListener(p);
		p.Cnd_usr_alt_nm4.setListListener(p);
		p.Cnd_usr_alt_nm4.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_usr_dpt_cd.setListListener(p);
		p.Cnd_usr_dpt_cd.addAllListener(p);
		p.Cnd_usr_dpt_nm.setListListener(p);
		p.Cnd_usr_dpt_nm.addAllListener(p);
		p.Cnd_da_cd.setListListener(p);
		p.Cnd_da_cd.addAllListener(p);
		p.Cnd_da_nm.setListListener(p);
		p.Cnd_da_nm.addAllListener(p);
		p.Cnd_usr_aprv_role_cd.setListListener(p);
		p.Cnd_usr_aprv_role_cd.addAllListener(p);
		p.Cnd_usr_aprv_role_nm.setListListener(p);
		p.Cnd_usr_aprv_role_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_usr_info1.setListListener(p);
		p.Cnd_usr_info1.addAllListener(p);
		p.Cnd_usr_info2.setListListener(p);
		p.Cnd_usr_info2.addAllListener(p);
		p.Cnd_usr_info3.setListListener(p);
		p.Cnd_usr_info3.addAllListener(p);
		p.Cnd_usr_info4.setListListener(p);
		p.Cnd_usr_info4.addAllListener(p);
		p.Cnd_usr_info5.setListListener(p);
		p.Cnd_usr_info5.addAllListener(p);
		p.Cnd_usr_info6.setListListener(p);
		p.Cnd_usr_info6.addAllListener(p);
		p.Cnd_usr_info7.setListListener(p);
		p.Cnd_usr_info7.addAllListener(p);
		p.Cnd_usr_info8.setListListener(p);
		p.Cnd_usr_info8.addAllListener(p);
		p.Cnd_usr_info9.setListListener(p);
		p.Cnd_usr_info9.addAllListener(p);
		p.Cnd_usr_info10.setListListener(p);
		p.Cnd_usr_info10.addAllListener(p);
		p.Cnd_usr_info11.setListListener(p);
		p.Cnd_usr_info11.addAllListener(p);
		p.Cnd_usr_info12.setListListener(p);
		p.Cnd_usr_info12.addAllListener(p);
		p.Cnd_usr_info13.setListListener(p);
		p.Cnd_usr_info13.addAllListener(p);
		p.Cnd_usr_info14.setListListener(p);
		p.Cnd_usr_info14.addAllListener(p);
		p.Cnd_usr_info15.setListListener(p);
		p.Cnd_usr_info15.addAllListener(p);
		p.Cnd_usr_info16.setListListener(p);
		p.Cnd_usr_info16.addAllListener(p);
		p.Cnd_usr_info17.setListListener(p);
		p.Cnd_usr_info17.addAllListener(p);
		p.Cnd_usr_info18.setListListener(p);
		p.Cnd_usr_info18.addAllListener(p);
		p.Cnd_usr_info19.setListListener(p);
		p.Cnd_usr_info19.addAllListener(p);
		p.Cnd_usr_info20.setListListener(p);
		p.Cnd_usr_info20.addAllListener(p);
	}

	/**
	 *  [Cnd1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd1(MABCP_UsrAclReg p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MABCP_UsrAclReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_UsrAclReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABCP_UsrAclReg p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_upd_dt.addAllListener(p);
		p.BulkSet_upd_dt.setAPMethodName("doBulkSet_upd_dt");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_UsrAclReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_usr_cd.addAllListener(p);
		p.columnDtl_usr_cd.setListListener(p);
		p.columnDtl_usr_nm.addAllListener(p);
		p.columnDtl_usr_nm.setListListener(p);
		p.columnDtl_license_flg.addAllListener(p);
		p.columnDtl_usr_aprv_role_cd.addAllListener(p);
		p.columnDtl_usr_aprv_role_cd.setListListener(p);
		p.columnDtl_usr_aprv_role_nm.addAllListener(p);
		p.columnDtl_usr_aprv_role_nm.setListListener(p);
		p.columnDtl_usr_dpt_cd.addAllListener(p);
		p.columnDtl_usr_dpt_cd.setListListener(p);
		p.columnDtl_usr_dpt_nm.addAllListener(p);
		p.columnDtl_usr_dpt_nm.setListListener(p);
		p.columnDtl_da_cd.addAllListener(p);
		p.columnDtl_da_cd.setListListener(p);
		p.columnDtl_da_nm.addAllListener(p);
		p.columnDtl_da_nm.setListListener(p);
		p.columnDtl_pre_cl_usr_flg.addAllListener(p);
		p.columnDtl_cl_usr_flg.addAllListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_add_dpt_cd1.addAllListener(p);
		p.columnDtl_add_dpt_cd1.setListListener(p);
		p.columnDtl_add_dpt_nm1.addAllListener(p);
		p.columnDtl_add_dpt_nm1.setListListener(p);
		p.columnDtl_add_dpt_cd2.addAllListener(p);
		p.columnDtl_add_dpt_cd2.setListListener(p);
		p.columnDtl_add_dpt_nm2.addAllListener(p);
		p.columnDtl_add_dpt_nm2.setListListener(p);
		p.columnDtl_add_dpt_cd3.addAllListener(p);
		p.columnDtl_add_dpt_cd3.setListListener(p);
		p.columnDtl_add_dpt_nm3.addAllListener(p);
		p.columnDtl_add_dpt_nm3.setListListener(p);
		p.columnDtl_add_dpt_cd4.addAllListener(p);
		p.columnDtl_add_dpt_cd4.setListListener(p);
		p.columnDtl_add_dpt_nm4.addAllListener(p);
		p.columnDtl_add_dpt_nm4.setListListener(p);
		p.columnDtl_add_dpt_cd5.addAllListener(p);
		p.columnDtl_add_dpt_cd5.setListListener(p);
		p.columnDtl_add_dpt_nm5.addAllListener(p);
		p.columnDtl_add_dpt_nm5.setListListener(p);
		p.columnDtl_add_dpt_cd6.addAllListener(p);
		p.columnDtl_add_dpt_cd6.setListListener(p);
		p.columnDtl_add_dpt_nm6.addAllListener(p);
		p.columnDtl_add_dpt_nm6.setListListener(p);
		p.columnDtl_add_dpt_cd7.addAllListener(p);
		p.columnDtl_add_dpt_cd7.setListListener(p);
		p.columnDtl_add_dpt_nm7.addAllListener(p);
		p.columnDtl_add_dpt_nm7.setListListener(p);
		p.columnDtl_add_dpt_cd8.addAllListener(p);
		p.columnDtl_add_dpt_cd8.setListListener(p);
		p.columnDtl_add_dpt_nm8.addAllListener(p);
		p.columnDtl_add_dpt_nm8.setListListener(p);
		p.columnDtl_add_dpt_cd9.addAllListener(p);
		p.columnDtl_add_dpt_cd9.setListListener(p);
		p.columnDtl_add_dpt_nm9.addAllListener(p);
		p.columnDtl_add_dpt_nm9.setListListener(p);
		p.columnDtl_aprv_role_cd.addAllListener(p);
		p.columnDtl_aprv_role_cd.setListListener(p);
		p.columnDtl_aprv_role_nm.addAllListener(p);
		p.columnDtl_aprv_role_nm.setListListener(p);
		p.columnDtl_aprv_role_cd1.addAllListener(p);
		p.columnDtl_aprv_role_cd1.setListListener(p);
		p.columnDtl_aprv_role_nm1.addAllListener(p);
		p.columnDtl_aprv_role_nm1.setListListener(p);
		p.columnDtl_aprv_role_cd2.addAllListener(p);
		p.columnDtl_aprv_role_cd2.setListListener(p);
		p.columnDtl_aprv_role_nm2.addAllListener(p);
		p.columnDtl_aprv_role_nm2.setListListener(p);
		p.columnDtl_aprv_role_cd3.addAllListener(p);
		p.columnDtl_aprv_role_cd3.setListListener(p);
		p.columnDtl_aprv_role_nm3.addAllListener(p);
		p.columnDtl_aprv_role_nm3.setListListener(p);
		p.columnDtl_aprv_role_cd4.addAllListener(p);
		p.columnDtl_aprv_role_cd4.setListListener(p);
		p.columnDtl_aprv_role_nm4.addAllListener(p);
		p.columnDtl_aprv_role_nm4.setListListener(p);
		p.columnDtl_aprv_role_cd5.addAllListener(p);
		p.columnDtl_aprv_role_cd5.setListListener(p);
		p.columnDtl_aprv_role_nm5.addAllListener(p);
		p.columnDtl_aprv_role_nm5.setListListener(p);
		p.columnDtl_aprv_role_cd6.addAllListener(p);
		p.columnDtl_aprv_role_cd6.setListListener(p);
		p.columnDtl_aprv_role_nm6.addAllListener(p);
		p.columnDtl_aprv_role_nm6.setListListener(p);
		p.columnDtl_aprv_role_cd7.addAllListener(p);
		p.columnDtl_aprv_role_cd7.setListListener(p);
		p.columnDtl_aprv_role_nm7.addAllListener(p);
		p.columnDtl_aprv_role_nm7.setListListener(p);
		p.columnDtl_aprv_role_cd8.addAllListener(p);
		p.columnDtl_aprv_role_cd8.setListListener(p);
		p.columnDtl_aprv_role_nm8.addAllListener(p);
		p.columnDtl_aprv_role_nm8.setListListener(p);
		p.columnDtl_aprv_role_cd9.addAllListener(p);
		p.columnDtl_aprv_role_cd9.setListListener(p);
		p.columnDtl_aprv_role_nm9.addAllListener(p);
		p.columnDtl_aprv_role_nm9.setListListener(p);
		p.columnDtl_sub_aprv_role_cd.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd.setListListener(p);
		p.columnDtl_sub_aprv_role_nm.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm.setListListener(p);
		p.columnDtl_sub_aprv_role_cd1.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd1.setListListener(p);
		p.columnDtl_sub_aprv_role_nm1.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm1.setListListener(p);
		p.columnDtl_sub_aprv_role_cd2.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd2.setListListener(p);
		p.columnDtl_sub_aprv_role_nm2.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm2.setListListener(p);
		p.columnDtl_sub_aprv_role_cd3.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd3.setListListener(p);
		p.columnDtl_sub_aprv_role_nm3.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm3.setListListener(p);
		p.columnDtl_sub_aprv_role_cd4.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd4.setListListener(p);
		p.columnDtl_sub_aprv_role_nm4.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm4.setListListener(p);
		p.columnDtl_sub_aprv_role_cd5.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd5.setListListener(p);
		p.columnDtl_sub_aprv_role_nm5.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm5.setListListener(p);
		p.columnDtl_sub_aprv_role_cd6.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd6.setListListener(p);
		p.columnDtl_sub_aprv_role_nm6.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm6.setListListener(p);
		p.columnDtl_sub_aprv_role_cd7.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd7.setListListener(p);
		p.columnDtl_sub_aprv_role_nm7.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm7.setListListener(p);
		p.columnDtl_sub_aprv_role_cd8.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd8.setListListener(p);
		p.columnDtl_sub_aprv_role_nm8.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm8.setListListener(p);
		p.columnDtl_sub_aprv_role_cd9.addAllListener(p);
		p.columnDtl_sub_aprv_role_cd9.setListListener(p);
		p.columnDtl_sub_aprv_role_nm9.addAllListener(p);
		p.columnDtl_sub_aprv_role_nm9.setListListener(p);
		p.columnDtl_main_flg.addAllListener(p);
		p.columnDtl_main_dpt_flg.addAllListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_UsrAclReg p) {
		p.Btn_open_FSBFP0370.addAllListener(p);
		p.Btn_open_FSBFP0370.setAPMethodName("doBtn_open_FSBFP0370");
		p.Btn_correct_dup_dt.addAllListener(p);
		p.Btn_correct_dup_dt.setAPMethodName("doBtn_correct_dup_dt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_UsrAclReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_da_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_da_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_upd_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_usr_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_usr_aprv_role_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_da_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_da_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_cl_usr_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cl_usr_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_add_dpt_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_aprv_role_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_main_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_main_dpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
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
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_inf_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_da_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_da_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_aprv_role_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_da_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_da_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_cl_usr_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cl_usr_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_main_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_main_dpt_flg.putMode(p, FIX, MCMode.INVISIBLE);
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
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_inf_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_da_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_da_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_aprv_role_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_da_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_da_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_cl_usr_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cl_usr_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_main_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_main_dpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
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
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_inf_lbl.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_da_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_da_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_aprv_role_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_da_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_da_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_cl_usr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cl_usr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_dpt_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_aprv_role_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_main_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_main_dpt_flg.putMode(p, REF, MCMode.INVISIBLE);
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
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, REF, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_inf_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, REF_APRV, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF_APRV, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_cd.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_da_cd.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_da_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Cnd_usr_aprv_role_cd.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_aprv_role_nm.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, REF_APRV, MCMode.ENABLE);

	}

	/**
	 * [REF_APRV]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_APRV]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, REF_APRV, MCMode.DISABLE);

	}

	/**
	 * [REF_APRV]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_cd.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_usr_aprv_role_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_usr_dpt_cd.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_nm.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(REF_APRV, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_da_cd.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_da_nm.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_pre_cl_usr_flg.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_cl_usr_flg.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_main_flg.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_main_dpt_flg.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_memo1.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF_APRV, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF_APRV, MCMode.READ_ONLY);

	}

	/**
	 * [REF_APRV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, REF_APRV, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_APRV, MCMode.DISABLE);
		p.Btn_inf_lbl.putMode(p, REF_APRV, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF_APRV, MCMode.DISABLE);

	}

	/**
	 * [REF_APRV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__APRV_EastBtn(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_ScreenOpe(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Top(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Fold(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Cnd(MABCP_UsrAclReg p){
		p.Cnd_ope_Group.putMode(p, REF_DPT, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_usr_cd.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_dpt_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_usr_dpt_cd.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_dpt_nm.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_da_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_da_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_usr_aprv_role_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_usr_aprv_role_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info1.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info2.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info3.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info4.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info5.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info6.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info7.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info8.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info9.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info10.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info11.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info12.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info13.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info14.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info15.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info16.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info17.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info18.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info19.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Cnd_usr_info20.putMode(p, REF_DPT, MCMode.ENABLE);

	}

	/**
	 * [REF_DPT]ステータスの[Cnd1]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Cnd1(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Cnd2(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Ctrl(MABCP_UsrAclReg p){

	}

	/**
	 * [REF_DPT]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_BulkSet(MABCP_UsrAclReg p){
		p.BulkSet_st_dt.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, REF_DPT, MCMode.DISABLE);

	}

	/**
	 * [REF_DPT]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Dtl(MABCP_UsrAclReg p){
		p.columnDtl_check.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_usr_aprv_role_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_usr_dpt_cd.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_usr_dpt_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF_DPT, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_da_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_da_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_pre_cl_usr_flg.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_cl_usr_flg.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_dpt_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_dpt_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_cd9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_add_dpt_nm9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_cd9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_aprv_role_nm9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm1.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm2.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm3.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm4.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm5.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm6.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm7.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm8.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_cd9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_sub_aprv_role_nm9.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_main_flg.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_main_dpt_flg.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF_DPT, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF_DPT, MCMode.READ_ONLY);

	}

	/**
	 * [REF_DPT]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_Btn(MABCP_UsrAclReg p){
		p.Btn_open_FSBFP0370.putMode(p, REF_DPT, MCMode.ENABLE);
		p.Btn_correct_dup_dt.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF_DPT, MCMode.DISABLE);
		p.Btn_inf_lbl.putMode(p, REF_DPT, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF_DPT, MCMode.DISABLE);

	}

	/**
	 * [REF_DPT]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__DPT_EastBtn(MABCP_UsrAclReg p){

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
		MABCP_UsrAclReg_MC.setTableConfigDtl((MABCP_UsrAclReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_UsrAclReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0250.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_usr_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_cd_META);
		p.columnDtl_usr_cd.setListType(MCListType.STRICT);
		p.columnDtl_usr_cd.addLinkBeans(p.columnDtl_usr_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_cd);
		p.columnDtl_usr_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_nm);
		p.columnDtl_license_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.license_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_license_flg);
		p.columnDtl_usr_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_aprv_role_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_aprv_role_cd);
		p.columnDtl_usr_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_aprv_role_nm);
		p.columnDtl_usr_dpt_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_dpt_cd);
		p.columnDtl_usr_dpt_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.usr_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_dpt_nm);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_da_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.da_cd_META);
		p.columnDtl_da_cd.addLinkBeans(p.columnDtl_da_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_da_cd);
		p.columnDtl_da_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.da_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_da_nm);
		p.columnDtl_pre_cl_usr_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.pre_cl_usr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_cl_usr_flg);
		p.columnDtl_cl_usr_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.cl_usr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cl_usr_flg);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_add_dpt_cd1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd1_META);
		p.columnDtl_add_dpt_cd1.addLinkBeans(p.columnDtl_add_dpt_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd1);
		p.columnDtl_add_dpt_nm1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm1);
		p.columnDtl_add_dpt_cd2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd2_META);
		p.columnDtl_add_dpt_cd2.addLinkBeans(p.columnDtl_add_dpt_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd2);
		p.columnDtl_add_dpt_nm2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm2);
		p.columnDtl_add_dpt_cd3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd3_META);
		p.columnDtl_add_dpt_cd3.addLinkBeans(p.columnDtl_add_dpt_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd3);
		p.columnDtl_add_dpt_nm3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm3);
		p.columnDtl_add_dpt_cd4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd4_META);
		p.columnDtl_add_dpt_cd4.addLinkBeans(p.columnDtl_add_dpt_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd4);
		p.columnDtl_add_dpt_nm4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm4);
		p.columnDtl_add_dpt_cd5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd5_META);
		p.columnDtl_add_dpt_cd5.addLinkBeans(p.columnDtl_add_dpt_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd5);
		p.columnDtl_add_dpt_nm5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm5);
		p.columnDtl_add_dpt_cd6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd6_META);
		p.columnDtl_add_dpt_cd6.addLinkBeans(p.columnDtl_add_dpt_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd6);
		p.columnDtl_add_dpt_nm6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm6);
		p.columnDtl_add_dpt_cd7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd7_META);
		p.columnDtl_add_dpt_cd7.addLinkBeans(p.columnDtl_add_dpt_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd7);
		p.columnDtl_add_dpt_nm7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm7);
		p.columnDtl_add_dpt_cd8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd8_META);
		p.columnDtl_add_dpt_cd8.addLinkBeans(p.columnDtl_add_dpt_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd8);
		p.columnDtl_add_dpt_nm8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm8);
		p.columnDtl_add_dpt_cd9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_cd9_META);
		p.columnDtl_add_dpt_cd9.addLinkBeans(p.columnDtl_add_dpt_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_cd9);
		p.columnDtl_add_dpt_nm9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.add_dpt_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_dpt_nm9);
		p.columnDtl_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd_META);
		p.columnDtl_aprv_role_cd.addLinkBeans(p.columnDtl_aprv_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd);
		p.columnDtl_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm);
		p.columnDtl_aprv_role_cd1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd1_META);
		p.columnDtl_aprv_role_cd1.addLinkBeans(p.columnDtl_aprv_role_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd1);
		p.columnDtl_aprv_role_nm1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm1);
		p.columnDtl_aprv_role_cd2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd2_META);
		p.columnDtl_aprv_role_cd2.addLinkBeans(p.columnDtl_aprv_role_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd2);
		p.columnDtl_aprv_role_nm2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm2);
		p.columnDtl_aprv_role_cd3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd3_META);
		p.columnDtl_aprv_role_cd3.addLinkBeans(p.columnDtl_aprv_role_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd3);
		p.columnDtl_aprv_role_nm3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm3);
		p.columnDtl_aprv_role_cd4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd4_META);
		p.columnDtl_aprv_role_cd4.addLinkBeans(p.columnDtl_aprv_role_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd4);
		p.columnDtl_aprv_role_nm4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm4);
		p.columnDtl_aprv_role_cd5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd5_META);
		p.columnDtl_aprv_role_cd5.addLinkBeans(p.columnDtl_aprv_role_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd5);
		p.columnDtl_aprv_role_nm5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm5);
		p.columnDtl_aprv_role_cd6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd6_META);
		p.columnDtl_aprv_role_cd6.addLinkBeans(p.columnDtl_aprv_role_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd6);
		p.columnDtl_aprv_role_nm6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm6);
		p.columnDtl_aprv_role_cd7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd7_META);
		p.columnDtl_aprv_role_cd7.addLinkBeans(p.columnDtl_aprv_role_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd7);
		p.columnDtl_aprv_role_nm7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm7);
		p.columnDtl_aprv_role_cd8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd8_META);
		p.columnDtl_aprv_role_cd8.addLinkBeans(p.columnDtl_aprv_role_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd8);
		p.columnDtl_aprv_role_nm8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm8);
		p.columnDtl_aprv_role_cd9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_cd9_META);
		p.columnDtl_aprv_role_cd9.addLinkBeans(p.columnDtl_aprv_role_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_cd9);
		p.columnDtl_aprv_role_nm9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.aprv_role_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_role_nm9);
		p.columnDtl_sub_aprv_role_cd.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd_META);
		p.columnDtl_sub_aprv_role_cd.addLinkBeans(p.columnDtl_sub_aprv_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd);
		p.columnDtl_sub_aprv_role_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm);
		p.columnDtl_sub_aprv_role_cd1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd1_META);
		p.columnDtl_sub_aprv_role_cd1.addLinkBeans(p.columnDtl_sub_aprv_role_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd1);
		p.columnDtl_sub_aprv_role_nm1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm1);
		p.columnDtl_sub_aprv_role_cd2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd2_META);
		p.columnDtl_sub_aprv_role_cd2.addLinkBeans(p.columnDtl_sub_aprv_role_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd2);
		p.columnDtl_sub_aprv_role_nm2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm2);
		p.columnDtl_sub_aprv_role_cd3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd3_META);
		p.columnDtl_sub_aprv_role_cd3.addLinkBeans(p.columnDtl_sub_aprv_role_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd3);
		p.columnDtl_sub_aprv_role_nm3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm3);
		p.columnDtl_sub_aprv_role_cd4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd4_META);
		p.columnDtl_sub_aprv_role_cd4.addLinkBeans(p.columnDtl_sub_aprv_role_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd4);
		p.columnDtl_sub_aprv_role_nm4.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm4);
		p.columnDtl_sub_aprv_role_cd5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd5_META);
		p.columnDtl_sub_aprv_role_cd5.addLinkBeans(p.columnDtl_sub_aprv_role_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd5);
		p.columnDtl_sub_aprv_role_nm5.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm5);
		p.columnDtl_sub_aprv_role_cd6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd6_META);
		p.columnDtl_sub_aprv_role_cd6.addLinkBeans(p.columnDtl_sub_aprv_role_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd6);
		p.columnDtl_sub_aprv_role_nm6.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm6);
		p.columnDtl_sub_aprv_role_cd7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd7_META);
		p.columnDtl_sub_aprv_role_cd7.addLinkBeans(p.columnDtl_sub_aprv_role_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd7);
		p.columnDtl_sub_aprv_role_nm7.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm7);
		p.columnDtl_sub_aprv_role_cd8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd8_META);
		p.columnDtl_sub_aprv_role_cd8.addLinkBeans(p.columnDtl_sub_aprv_role_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd8);
		p.columnDtl_sub_aprv_role_nm8.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm8);
		p.columnDtl_sub_aprv_role_cd9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_cd9_META);
		p.columnDtl_sub_aprv_role_cd9.addLinkBeans(p.columnDtl_sub_aprv_role_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_cd9);
		p.columnDtl_sub_aprv_role_nm9.setMeta(mcframe.clientMABC.MABCP0250.DtlR.sub_aprv_role_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_aprv_role_nm9);
		p.columnDtl_main_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.main_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_main_flg);
		p.columnDtl_main_dpt_flg.setMeta(mcframe.clientMABC.MABCP0250.DtlR.main_dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_main_dpt_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0250.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0250.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0250.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0250.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0250.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0250.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0250.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0250.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0250.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0250.DtlR.del_ts_META);
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
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
		Cnd_usr_com_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_usr_com_typ.getListConfig().setPutter(getCnd_usr_com_typ_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_usr_dpt_cd.getListConfig().setPutter(getCnd_usr_dpt_cd_ListPutter());
		Cnd_da_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_da_cd.getListConfig().setPutter(getCnd_da_cd_ListPutter());
		Cnd_usr_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_usr_aprv_role_cd.getListConfig().setPutter(getCnd_usr_aprv_role_cd_ListPutter());
		columnDtl_usr_cd.getListConfig().setPutter(getDtl_usr_cd_ListPutter());
		columnDtl_da_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_da_cd.getListConfig().setPutter(getDtl_da_cd_ListPutter());
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		columnDtl_add_dpt_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd1.getListConfig().setPutter(getDtl_add_dpt_cd1_ListPutter());
		columnDtl_add_dpt_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd2.getListConfig().setPutter(getDtl_add_dpt_cd2_ListPutter());
		columnDtl_add_dpt_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd3.getListConfig().setPutter(getDtl_add_dpt_cd3_ListPutter());
		columnDtl_add_dpt_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd4.getListConfig().setPutter(getDtl_add_dpt_cd4_ListPutter());
		columnDtl_add_dpt_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd5.getListConfig().setPutter(getDtl_add_dpt_cd5_ListPutter());
		columnDtl_add_dpt_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd6.getListConfig().setPutter(getDtl_add_dpt_cd6_ListPutter());
		columnDtl_add_dpt_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd7.getListConfig().setPutter(getDtl_add_dpt_cd7_ListPutter());
		columnDtl_add_dpt_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd8.getListConfig().setPutter(getDtl_add_dpt_cd8_ListPutter());
		columnDtl_add_dpt_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_add_dpt_cd9.getListConfig().setPutter(getDtl_add_dpt_cd9_ListPutter());
		columnDtl_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd.getListConfig().setPutter(getDtl_aprv_role_cd_ListPutter());
		columnDtl_aprv_role_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd1.getListConfig().setPutter(getDtl_aprv_role_cd1_ListPutter());
		columnDtl_aprv_role_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd2.getListConfig().setPutter(getDtl_aprv_role_cd2_ListPutter());
		columnDtl_aprv_role_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd3.getListConfig().setPutter(getDtl_aprv_role_cd3_ListPutter());
		columnDtl_aprv_role_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd4.getListConfig().setPutter(getDtl_aprv_role_cd4_ListPutter());
		columnDtl_aprv_role_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd5.getListConfig().setPutter(getDtl_aprv_role_cd5_ListPutter());
		columnDtl_aprv_role_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd6.getListConfig().setPutter(getDtl_aprv_role_cd6_ListPutter());
		columnDtl_aprv_role_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd7.getListConfig().setPutter(getDtl_aprv_role_cd7_ListPutter());
		columnDtl_aprv_role_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd8.getListConfig().setPutter(getDtl_aprv_role_cd8_ListPutter());
		columnDtl_aprv_role_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_aprv_role_cd9.getListConfig().setPutter(getDtl_aprv_role_cd9_ListPutter());
		columnDtl_sub_aprv_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd.getListConfig().setPutter(getDtl_sub_aprv_role_cd_ListPutter());
		columnDtl_sub_aprv_role_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd1.getListConfig().setPutter(getDtl_sub_aprv_role_cd1_ListPutter());
		columnDtl_sub_aprv_role_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd2.getListConfig().setPutter(getDtl_sub_aprv_role_cd2_ListPutter());
		columnDtl_sub_aprv_role_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd3.getListConfig().setPutter(getDtl_sub_aprv_role_cd3_ListPutter());
		columnDtl_sub_aprv_role_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd4.getListConfig().setPutter(getDtl_sub_aprv_role_cd4_ListPutter());
		columnDtl_sub_aprv_role_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd5.getListConfig().setPutter(getDtl_sub_aprv_role_cd5_ListPutter());
		columnDtl_sub_aprv_role_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd6.getListConfig().setPutter(getDtl_sub_aprv_role_cd6_ListPutter());
		columnDtl_sub_aprv_role_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd7.getListConfig().setPutter(getDtl_sub_aprv_role_cd7_ListPutter());
		columnDtl_sub_aprv_role_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd8.getListConfig().setPutter(getDtl_sub_aprv_role_cd8_ListPutter());
		columnDtl_sub_aprv_role_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sub_aprv_role_cd9.getListConfig().setPutter(getDtl_sub_aprv_role_cd9_ListPutter());
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
	 * この画面を[REF_APRV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_APRVStatus() {
		status = REF_APRV;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_DPT]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_DPTStatus() {
		status = REF_DPT;
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
		else if (REF_APRV.equals(status)) {
			setREF_APRVStatus();
		}
		else if (REF_DPT.equals(status)) {
			setREF_DPTStatus();
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
	 * [Cnd_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_com_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_com_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UsrComTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_da_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_da_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Da");
		return lp;
	}
	 
	/**
	 * [Cnd_usr_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_usr_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Dtl_da_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_da_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Da");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_add_dpt_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_add_dpt_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_aprv_role_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_aprv_role_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_sub_aprv_role_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sub_aprv_role_cd9_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		if(combo == Cnd_usr_com_typ) return getCnd_usr_com_typ(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_usr_dpt_cd) return getCnd_usr_dpt_cd(row, info);
		if(combo == Cnd_da_cd) return getCnd_da_cd(row, info);
		if(combo == Cnd_usr_aprv_role_cd) return getCnd_usr_aprv_role_cd(row, info);
		if(combo == columnDtl_usr_cd) return getDtl_usr_cd(row, info);
		if(combo == columnDtl_da_cd) return getDtl_da_cd(row, info);
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == columnDtl_add_dpt_cd1) return getDtl_add_dpt_cd1(row, info);
		if(combo == columnDtl_add_dpt_cd2) return getDtl_add_dpt_cd2(row, info);
		if(combo == columnDtl_add_dpt_cd3) return getDtl_add_dpt_cd3(row, info);
		if(combo == columnDtl_add_dpt_cd4) return getDtl_add_dpt_cd4(row, info);
		if(combo == columnDtl_add_dpt_cd5) return getDtl_add_dpt_cd5(row, info);
		if(combo == columnDtl_add_dpt_cd6) return getDtl_add_dpt_cd6(row, info);
		if(combo == columnDtl_add_dpt_cd7) return getDtl_add_dpt_cd7(row, info);
		if(combo == columnDtl_add_dpt_cd8) return getDtl_add_dpt_cd8(row, info);
		if(combo == columnDtl_add_dpt_cd9) return getDtl_add_dpt_cd9(row, info);
		if(combo == columnDtl_aprv_role_cd) return getDtl_aprv_role_cd(row, info);
		if(combo == columnDtl_aprv_role_cd1) return getDtl_aprv_role_cd1(row, info);
		if(combo == columnDtl_aprv_role_cd2) return getDtl_aprv_role_cd2(row, info);
		if(combo == columnDtl_aprv_role_cd3) return getDtl_aprv_role_cd3(row, info);
		if(combo == columnDtl_aprv_role_cd4) return getDtl_aprv_role_cd4(row, info);
		if(combo == columnDtl_aprv_role_cd5) return getDtl_aprv_role_cd5(row, info);
		if(combo == columnDtl_aprv_role_cd6) return getDtl_aprv_role_cd6(row, info);
		if(combo == columnDtl_aprv_role_cd7) return getDtl_aprv_role_cd7(row, info);
		if(combo == columnDtl_aprv_role_cd8) return getDtl_aprv_role_cd8(row, info);
		if(combo == columnDtl_aprv_role_cd9) return getDtl_aprv_role_cd9(row, info);
		if(combo == columnDtl_sub_aprv_role_cd) return getDtl_sub_aprv_role_cd(row, info);
		if(combo == columnDtl_sub_aprv_role_cd1) return getDtl_sub_aprv_role_cd1(row, info);
		if(combo == columnDtl_sub_aprv_role_cd2) return getDtl_sub_aprv_role_cd2(row, info);
		if(combo == columnDtl_sub_aprv_role_cd3) return getDtl_sub_aprv_role_cd3(row, info);
		if(combo == columnDtl_sub_aprv_role_cd4) return getDtl_sub_aprv_role_cd4(row, info);
		if(combo == columnDtl_sub_aprv_role_cd5) return getDtl_sub_aprv_role_cd5(row, info);
		if(combo == columnDtl_sub_aprv_role_cd6) return getDtl_sub_aprv_role_cd6(row, info);
		if(combo == columnDtl_sub_aprv_role_cd7) return getDtl_sub_aprv_role_cd7(row, info);
		if(combo == columnDtl_sub_aprv_role_cd8) return getDtl_sub_aprv_role_cd8(row, info);
		if(combo == columnDtl_sub_aprv_role_cd9) return getDtl_sub_aprv_role_cd9(row, info);
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
		else if (ap == BulkSet_upd_dt) doBulkSet_upd_dt(info);
		else if (ap == Btn_open_FSBFP0370) doBtn_open_FSBFP0370(info);
		else if (ap == Btn_correct_dup_dt) doBtn_correct_dup_dt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[upd_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_upd_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_FSBFP0370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_FSBFP0370(MCEventInfo info);

	/**
	 * [Btn]パネルの[correct_dup_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_correct_dup_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_usr_com_typ) return doCnd_usr_com_typ_VC(info);
		if (vc == Cnd_usr_com_typ_nm) return doCnd_usr_com_typ_nm_VC(info);
		if (vc == Cnd_usr_com) return doCnd_usr_com_VC(info);
		if (vc == Cnd_usr_alt_nm1) return doCnd_usr_alt_nm1_VC(info);
		if (vc == Cnd_usr_alt_nm2) return doCnd_usr_alt_nm2_VC(info);
		if (vc == Cnd_usr_alt_nm3) return doCnd_usr_alt_nm3_VC(info);
		if (vc == Cnd_usr_alt_nm4) return doCnd_usr_alt_nm4_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_usr_dpt_cd) return doCnd_usr_dpt_cd_VC(info);
		if (vc == Cnd_usr_dpt_nm) return doCnd_usr_dpt_nm_VC(info);
		if (vc == Cnd_da_cd) return doCnd_da_cd_VC(info);
		if (vc == Cnd_da_nm) return doCnd_da_nm_VC(info);
		if (vc == Cnd_usr_aprv_role_cd) return doCnd_usr_aprv_role_cd_VC(info);
		if (vc == Cnd_usr_aprv_role_nm) return doCnd_usr_aprv_role_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_usr_info1) return doCnd_usr_info1_VC(info);
		if (vc == Cnd_usr_info2) return doCnd_usr_info2_VC(info);
		if (vc == Cnd_usr_info3) return doCnd_usr_info3_VC(info);
		if (vc == Cnd_usr_info4) return doCnd_usr_info4_VC(info);
		if (vc == Cnd_usr_info5) return doCnd_usr_info5_VC(info);
		if (vc == Cnd_usr_info6) return doCnd_usr_info6_VC(info);
		if (vc == Cnd_usr_info7) return doCnd_usr_info7_VC(info);
		if (vc == Cnd_usr_info8) return doCnd_usr_info8_VC(info);
		if (vc == Cnd_usr_info9) return doCnd_usr_info9_VC(info);
		if (vc == Cnd_usr_info10) return doCnd_usr_info10_VC(info);
		if (vc == Cnd_usr_info11) return doCnd_usr_info11_VC(info);
		if (vc == Cnd_usr_info12) return doCnd_usr_info12_VC(info);
		if (vc == Cnd_usr_info13) return doCnd_usr_info13_VC(info);
		if (vc == Cnd_usr_info14) return doCnd_usr_info14_VC(info);
		if (vc == Cnd_usr_info15) return doCnd_usr_info15_VC(info);
		if (vc == Cnd_usr_info16) return doCnd_usr_info16_VC(info);
		if (vc == Cnd_usr_info17) return doCnd_usr_info17_VC(info);
		if (vc == Cnd_usr_info18) return doCnd_usr_info18_VC(info);
		if (vc == Cnd_usr_info19) return doCnd_usr_info19_VC(info);
		if (vc == Cnd_usr_info20) return doCnd_usr_info20_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_usr_cd) return doDtl_usr_cd_VC(info);
		if (vc == columnDtl_usr_nm) return doDtl_usr_nm_VC(info);
		if (vc == columnDtl_license_flg) return doDtl_license_flg_VC(info);
		if (vc == columnDtl_usr_aprv_role_cd) return doDtl_usr_aprv_role_cd_VC(info);
		if (vc == columnDtl_usr_aprv_role_nm) return doDtl_usr_aprv_role_nm_VC(info);
		if (vc == columnDtl_usr_dpt_cd) return doDtl_usr_dpt_cd_VC(info);
		if (vc == columnDtl_usr_dpt_nm) return doDtl_usr_dpt_nm_VC(info);
		if (vc == columnDtl_da_cd) return doDtl_da_cd_VC(info);
		if (vc == columnDtl_da_nm) return doDtl_da_nm_VC(info);
		if (vc == columnDtl_pre_cl_usr_flg) return doDtl_pre_cl_usr_flg_VC(info);
		if (vc == columnDtl_cl_usr_flg) return doDtl_cl_usr_flg_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_add_dpt_cd1) return doDtl_add_dpt_cd1_VC(info);
		if (vc == columnDtl_add_dpt_nm1) return doDtl_add_dpt_nm1_VC(info);
		if (vc == columnDtl_add_dpt_cd2) return doDtl_add_dpt_cd2_VC(info);
		if (vc == columnDtl_add_dpt_nm2) return doDtl_add_dpt_nm2_VC(info);
		if (vc == columnDtl_add_dpt_cd3) return doDtl_add_dpt_cd3_VC(info);
		if (vc == columnDtl_add_dpt_nm3) return doDtl_add_dpt_nm3_VC(info);
		if (vc == columnDtl_add_dpt_cd4) return doDtl_add_dpt_cd4_VC(info);
		if (vc == columnDtl_add_dpt_nm4) return doDtl_add_dpt_nm4_VC(info);
		if (vc == columnDtl_add_dpt_cd5) return doDtl_add_dpt_cd5_VC(info);
		if (vc == columnDtl_add_dpt_nm5) return doDtl_add_dpt_nm5_VC(info);
		if (vc == columnDtl_add_dpt_cd6) return doDtl_add_dpt_cd6_VC(info);
		if (vc == columnDtl_add_dpt_nm6) return doDtl_add_dpt_nm6_VC(info);
		if (vc == columnDtl_add_dpt_cd7) return doDtl_add_dpt_cd7_VC(info);
		if (vc == columnDtl_add_dpt_nm7) return doDtl_add_dpt_nm7_VC(info);
		if (vc == columnDtl_add_dpt_cd8) return doDtl_add_dpt_cd8_VC(info);
		if (vc == columnDtl_add_dpt_nm8) return doDtl_add_dpt_nm8_VC(info);
		if (vc == columnDtl_add_dpt_cd9) return doDtl_add_dpt_cd9_VC(info);
		if (vc == columnDtl_add_dpt_nm9) return doDtl_add_dpt_nm9_VC(info);
		if (vc == columnDtl_aprv_role_cd) return doDtl_aprv_role_cd_VC(info);
		if (vc == columnDtl_aprv_role_nm) return doDtl_aprv_role_nm_VC(info);
		if (vc == columnDtl_aprv_role_cd1) return doDtl_aprv_role_cd1_VC(info);
		if (vc == columnDtl_aprv_role_nm1) return doDtl_aprv_role_nm1_VC(info);
		if (vc == columnDtl_aprv_role_cd2) return doDtl_aprv_role_cd2_VC(info);
		if (vc == columnDtl_aprv_role_nm2) return doDtl_aprv_role_nm2_VC(info);
		if (vc == columnDtl_aprv_role_cd3) return doDtl_aprv_role_cd3_VC(info);
		if (vc == columnDtl_aprv_role_nm3) return doDtl_aprv_role_nm3_VC(info);
		if (vc == columnDtl_aprv_role_cd4) return doDtl_aprv_role_cd4_VC(info);
		if (vc == columnDtl_aprv_role_nm4) return doDtl_aprv_role_nm4_VC(info);
		if (vc == columnDtl_aprv_role_cd5) return doDtl_aprv_role_cd5_VC(info);
		if (vc == columnDtl_aprv_role_nm5) return doDtl_aprv_role_nm5_VC(info);
		if (vc == columnDtl_aprv_role_cd6) return doDtl_aprv_role_cd6_VC(info);
		if (vc == columnDtl_aprv_role_nm6) return doDtl_aprv_role_nm6_VC(info);
		if (vc == columnDtl_aprv_role_cd7) return doDtl_aprv_role_cd7_VC(info);
		if (vc == columnDtl_aprv_role_nm7) return doDtl_aprv_role_nm7_VC(info);
		if (vc == columnDtl_aprv_role_cd8) return doDtl_aprv_role_cd8_VC(info);
		if (vc == columnDtl_aprv_role_nm8) return doDtl_aprv_role_nm8_VC(info);
		if (vc == columnDtl_aprv_role_cd9) return doDtl_aprv_role_cd9_VC(info);
		if (vc == columnDtl_aprv_role_nm9) return doDtl_aprv_role_nm9_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd) return doDtl_sub_aprv_role_cd_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm) return doDtl_sub_aprv_role_nm_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd1) return doDtl_sub_aprv_role_cd1_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm1) return doDtl_sub_aprv_role_nm1_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd2) return doDtl_sub_aprv_role_cd2_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm2) return doDtl_sub_aprv_role_nm2_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd3) return doDtl_sub_aprv_role_cd3_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm3) return doDtl_sub_aprv_role_nm3_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd4) return doDtl_sub_aprv_role_cd4_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm4) return doDtl_sub_aprv_role_nm4_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd5) return doDtl_sub_aprv_role_cd5_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm5) return doDtl_sub_aprv_role_nm5_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd6) return doDtl_sub_aprv_role_cd6_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm6) return doDtl_sub_aprv_role_nm6_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd7) return doDtl_sub_aprv_role_cd7_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm7) return doDtl_sub_aprv_role_nm7_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd8) return doDtl_sub_aprv_role_cd8_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm8) return doDtl_sub_aprv_role_nm8_VC(info);
		if (vc == columnDtl_sub_aprv_role_cd9) return doDtl_sub_aprv_role_cd9_VC(info);
		if (vc == columnDtl_sub_aprv_role_nm9) return doDtl_sub_aprv_role_nm9_VC(info);
		if (vc == columnDtl_main_flg) return doDtl_main_flg_VC(info);
		if (vc == columnDtl_main_dpt_flg) return doDtl_main_dpt_flg_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_com_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_com_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_com_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_com_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_com]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_com_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[da_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_da_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[da_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_da_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_aprv_role_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_info1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[usr_info20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_usr_info20_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[license_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_license_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[da_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_da_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[da_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_da_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_cl_usr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_cl_usr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cl_usr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cl_usr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_dpt_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_role_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_aprv_role_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[main_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_main_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[main_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_main_dpt_flg_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_usr_com_typ) doCnd_usr_com_typ_NC(info);
		else if (nc == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NC(info);
		else if (nc == Cnd_usr_com) doCnd_usr_com_NC(info);
		else if (nc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NC(info);
		else if (nc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NC(info);
		else if (nc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NC(info);
		else if (nc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NC(info);
		else if (nc == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NC(info);
		else if (nc == Cnd_da_cd) doCnd_da_cd_NC(info);
		else if (nc == Cnd_da_nm) doCnd_da_nm_NC(info);
		else if (nc == Cnd_usr_aprv_role_cd) doCnd_usr_aprv_role_cd_NC(info);
		else if (nc == Cnd_usr_aprv_role_nm) doCnd_usr_aprv_role_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_usr_info1) doCnd_usr_info1_NC(info);
		else if (nc == Cnd_usr_info2) doCnd_usr_info2_NC(info);
		else if (nc == Cnd_usr_info3) doCnd_usr_info3_NC(info);
		else if (nc == Cnd_usr_info4) doCnd_usr_info4_NC(info);
		else if (nc == Cnd_usr_info5) doCnd_usr_info5_NC(info);
		else if (nc == Cnd_usr_info6) doCnd_usr_info6_NC(info);
		else if (nc == Cnd_usr_info7) doCnd_usr_info7_NC(info);
		else if (nc == Cnd_usr_info8) doCnd_usr_info8_NC(info);
		else if (nc == Cnd_usr_info9) doCnd_usr_info9_NC(info);
		else if (nc == Cnd_usr_info10) doCnd_usr_info10_NC(info);
		else if (nc == Cnd_usr_info11) doCnd_usr_info11_NC(info);
		else if (nc == Cnd_usr_info12) doCnd_usr_info12_NC(info);
		else if (nc == Cnd_usr_info13) doCnd_usr_info13_NC(info);
		else if (nc == Cnd_usr_info14) doCnd_usr_info14_NC(info);
		else if (nc == Cnd_usr_info15) doCnd_usr_info15_NC(info);
		else if (nc == Cnd_usr_info16) doCnd_usr_info16_NC(info);
		else if (nc == Cnd_usr_info17) doCnd_usr_info17_NC(info);
		else if (nc == Cnd_usr_info18) doCnd_usr_info18_NC(info);
		else if (nc == Cnd_usr_info19) doCnd_usr_info19_NC(info);
		else if (nc == Cnd_usr_info20) doCnd_usr_info20_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_usr_cd) doDtl_usr_cd_NC(info);
		else if (nc == columnDtl_usr_nm) doDtl_usr_nm_NC(info);
		else if (nc == columnDtl_license_flg) doDtl_license_flg_NC(info);
		else if (nc == columnDtl_usr_aprv_role_cd) doDtl_usr_aprv_role_cd_NC(info);
		else if (nc == columnDtl_usr_aprv_role_nm) doDtl_usr_aprv_role_nm_NC(info);
		else if (nc == columnDtl_usr_dpt_cd) doDtl_usr_dpt_cd_NC(info);
		else if (nc == columnDtl_usr_dpt_nm) doDtl_usr_dpt_nm_NC(info);
		else if (nc == columnDtl_da_cd) doDtl_da_cd_NC(info);
		else if (nc == columnDtl_da_nm) doDtl_da_nm_NC(info);
		else if (nc == columnDtl_pre_cl_usr_flg) doDtl_pre_cl_usr_flg_NC(info);
		else if (nc == columnDtl_cl_usr_flg) doDtl_cl_usr_flg_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_add_dpt_cd1) doDtl_add_dpt_cd1_NC(info);
		else if (nc == columnDtl_add_dpt_nm1) doDtl_add_dpt_nm1_NC(info);
		else if (nc == columnDtl_add_dpt_cd2) doDtl_add_dpt_cd2_NC(info);
		else if (nc == columnDtl_add_dpt_nm2) doDtl_add_dpt_nm2_NC(info);
		else if (nc == columnDtl_add_dpt_cd3) doDtl_add_dpt_cd3_NC(info);
		else if (nc == columnDtl_add_dpt_nm3) doDtl_add_dpt_nm3_NC(info);
		else if (nc == columnDtl_add_dpt_cd4) doDtl_add_dpt_cd4_NC(info);
		else if (nc == columnDtl_add_dpt_nm4) doDtl_add_dpt_nm4_NC(info);
		else if (nc == columnDtl_add_dpt_cd5) doDtl_add_dpt_cd5_NC(info);
		else if (nc == columnDtl_add_dpt_nm5) doDtl_add_dpt_nm5_NC(info);
		else if (nc == columnDtl_add_dpt_cd6) doDtl_add_dpt_cd6_NC(info);
		else if (nc == columnDtl_add_dpt_nm6) doDtl_add_dpt_nm6_NC(info);
		else if (nc == columnDtl_add_dpt_cd7) doDtl_add_dpt_cd7_NC(info);
		else if (nc == columnDtl_add_dpt_nm7) doDtl_add_dpt_nm7_NC(info);
		else if (nc == columnDtl_add_dpt_cd8) doDtl_add_dpt_cd8_NC(info);
		else if (nc == columnDtl_add_dpt_nm8) doDtl_add_dpt_nm8_NC(info);
		else if (nc == columnDtl_add_dpt_cd9) doDtl_add_dpt_cd9_NC(info);
		else if (nc == columnDtl_add_dpt_nm9) doDtl_add_dpt_nm9_NC(info);
		else if (nc == columnDtl_aprv_role_cd) doDtl_aprv_role_cd_NC(info);
		else if (nc == columnDtl_aprv_role_nm) doDtl_aprv_role_nm_NC(info);
		else if (nc == columnDtl_aprv_role_cd1) doDtl_aprv_role_cd1_NC(info);
		else if (nc == columnDtl_aprv_role_nm1) doDtl_aprv_role_nm1_NC(info);
		else if (nc == columnDtl_aprv_role_cd2) doDtl_aprv_role_cd2_NC(info);
		else if (nc == columnDtl_aprv_role_nm2) doDtl_aprv_role_nm2_NC(info);
		else if (nc == columnDtl_aprv_role_cd3) doDtl_aprv_role_cd3_NC(info);
		else if (nc == columnDtl_aprv_role_nm3) doDtl_aprv_role_nm3_NC(info);
		else if (nc == columnDtl_aprv_role_cd4) doDtl_aprv_role_cd4_NC(info);
		else if (nc == columnDtl_aprv_role_nm4) doDtl_aprv_role_nm4_NC(info);
		else if (nc == columnDtl_aprv_role_cd5) doDtl_aprv_role_cd5_NC(info);
		else if (nc == columnDtl_aprv_role_nm5) doDtl_aprv_role_nm5_NC(info);
		else if (nc == columnDtl_aprv_role_cd6) doDtl_aprv_role_cd6_NC(info);
		else if (nc == columnDtl_aprv_role_nm6) doDtl_aprv_role_nm6_NC(info);
		else if (nc == columnDtl_aprv_role_cd7) doDtl_aprv_role_cd7_NC(info);
		else if (nc == columnDtl_aprv_role_nm7) doDtl_aprv_role_nm7_NC(info);
		else if (nc == columnDtl_aprv_role_cd8) doDtl_aprv_role_cd8_NC(info);
		else if (nc == columnDtl_aprv_role_nm8) doDtl_aprv_role_nm8_NC(info);
		else if (nc == columnDtl_aprv_role_cd9) doDtl_aprv_role_cd9_NC(info);
		else if (nc == columnDtl_aprv_role_nm9) doDtl_aprv_role_nm9_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd) doDtl_sub_aprv_role_cd_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm) doDtl_sub_aprv_role_nm_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd1) doDtl_sub_aprv_role_cd1_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm1) doDtl_sub_aprv_role_nm1_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd2) doDtl_sub_aprv_role_cd2_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm2) doDtl_sub_aprv_role_nm2_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd3) doDtl_sub_aprv_role_cd3_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm3) doDtl_sub_aprv_role_nm3_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd4) doDtl_sub_aprv_role_cd4_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm4) doDtl_sub_aprv_role_nm4_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd5) doDtl_sub_aprv_role_cd5_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm5) doDtl_sub_aprv_role_nm5_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd6) doDtl_sub_aprv_role_cd6_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm6) doDtl_sub_aprv_role_nm6_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd7) doDtl_sub_aprv_role_cd7_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm7) doDtl_sub_aprv_role_nm7_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd8) doDtl_sub_aprv_role_cd8_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm8) doDtl_sub_aprv_role_nm8_NC(info);
		else if (nc == columnDtl_sub_aprv_role_cd9) doDtl_sub_aprv_role_cd9_NC(info);
		else if (nc == columnDtl_sub_aprv_role_nm9) doDtl_sub_aprv_role_nm9_NC(info);
		else if (nc == columnDtl_main_flg) doDtl_main_flg_NC(info);
		else if (nc == columnDtl_main_dpt_flg) doDtl_main_dpt_flg_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_info1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info11_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info12_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info13_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info14_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info15_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info16_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info17_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info18_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info19_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info20_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[license_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_license_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_cl_usr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_cl_usr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cl_usr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cl_usr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_dpt_flg_NC(MCEventInfo info){
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
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_usr_com_typ) doCnd_usr_com_typ_NE(info);
		else if (ne == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NE(info);
		else if (ne == Cnd_usr_com) doCnd_usr_com_NE(info);
		else if (ne == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NE(info);
		else if (ne == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NE(info);
		else if (ne == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NE(info);
		else if (ne == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NE(info);
		else if (ne == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NE(info);
		else if (ne == Cnd_da_cd) doCnd_da_cd_NE(info);
		else if (ne == Cnd_da_nm) doCnd_da_nm_NE(info);
		else if (ne == Cnd_usr_aprv_role_cd) doCnd_usr_aprv_role_cd_NE(info);
		else if (ne == Cnd_usr_aprv_role_nm) doCnd_usr_aprv_role_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_usr_info1) doCnd_usr_info1_NE(info);
		else if (ne == Cnd_usr_info2) doCnd_usr_info2_NE(info);
		else if (ne == Cnd_usr_info3) doCnd_usr_info3_NE(info);
		else if (ne == Cnd_usr_info4) doCnd_usr_info4_NE(info);
		else if (ne == Cnd_usr_info5) doCnd_usr_info5_NE(info);
		else if (ne == Cnd_usr_info6) doCnd_usr_info6_NE(info);
		else if (ne == Cnd_usr_info7) doCnd_usr_info7_NE(info);
		else if (ne == Cnd_usr_info8) doCnd_usr_info8_NE(info);
		else if (ne == Cnd_usr_info9) doCnd_usr_info9_NE(info);
		else if (ne == Cnd_usr_info10) doCnd_usr_info10_NE(info);
		else if (ne == Cnd_usr_info11) doCnd_usr_info11_NE(info);
		else if (ne == Cnd_usr_info12) doCnd_usr_info12_NE(info);
		else if (ne == Cnd_usr_info13) doCnd_usr_info13_NE(info);
		else if (ne == Cnd_usr_info14) doCnd_usr_info14_NE(info);
		else if (ne == Cnd_usr_info15) doCnd_usr_info15_NE(info);
		else if (ne == Cnd_usr_info16) doCnd_usr_info16_NE(info);
		else if (ne == Cnd_usr_info17) doCnd_usr_info17_NE(info);
		else if (ne == Cnd_usr_info18) doCnd_usr_info18_NE(info);
		else if (ne == Cnd_usr_info19) doCnd_usr_info19_NE(info);
		else if (ne == Cnd_usr_info20) doCnd_usr_info20_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_usr_cd) doDtl_usr_cd_NE(info);
		else if (ne == columnDtl_usr_nm) doDtl_usr_nm_NE(info);
		else if (ne == columnDtl_license_flg) doDtl_license_flg_NE(info);
		else if (ne == columnDtl_usr_aprv_role_cd) doDtl_usr_aprv_role_cd_NE(info);
		else if (ne == columnDtl_usr_aprv_role_nm) doDtl_usr_aprv_role_nm_NE(info);
		else if (ne == columnDtl_usr_dpt_cd) doDtl_usr_dpt_cd_NE(info);
		else if (ne == columnDtl_usr_dpt_nm) doDtl_usr_dpt_nm_NE(info);
		else if (ne == columnDtl_da_cd) doDtl_da_cd_NE(info);
		else if (ne == columnDtl_da_nm) doDtl_da_nm_NE(info);
		else if (ne == columnDtl_pre_cl_usr_flg) doDtl_pre_cl_usr_flg_NE(info);
		else if (ne == columnDtl_cl_usr_flg) doDtl_cl_usr_flg_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_add_dpt_cd1) doDtl_add_dpt_cd1_NE(info);
		else if (ne == columnDtl_add_dpt_nm1) doDtl_add_dpt_nm1_NE(info);
		else if (ne == columnDtl_add_dpt_cd2) doDtl_add_dpt_cd2_NE(info);
		else if (ne == columnDtl_add_dpt_nm2) doDtl_add_dpt_nm2_NE(info);
		else if (ne == columnDtl_add_dpt_cd3) doDtl_add_dpt_cd3_NE(info);
		else if (ne == columnDtl_add_dpt_nm3) doDtl_add_dpt_nm3_NE(info);
		else if (ne == columnDtl_add_dpt_cd4) doDtl_add_dpt_cd4_NE(info);
		else if (ne == columnDtl_add_dpt_nm4) doDtl_add_dpt_nm4_NE(info);
		else if (ne == columnDtl_add_dpt_cd5) doDtl_add_dpt_cd5_NE(info);
		else if (ne == columnDtl_add_dpt_nm5) doDtl_add_dpt_nm5_NE(info);
		else if (ne == columnDtl_add_dpt_cd6) doDtl_add_dpt_cd6_NE(info);
		else if (ne == columnDtl_add_dpt_nm6) doDtl_add_dpt_nm6_NE(info);
		else if (ne == columnDtl_add_dpt_cd7) doDtl_add_dpt_cd7_NE(info);
		else if (ne == columnDtl_add_dpt_nm7) doDtl_add_dpt_nm7_NE(info);
		else if (ne == columnDtl_add_dpt_cd8) doDtl_add_dpt_cd8_NE(info);
		else if (ne == columnDtl_add_dpt_nm8) doDtl_add_dpt_nm8_NE(info);
		else if (ne == columnDtl_add_dpt_cd9) doDtl_add_dpt_cd9_NE(info);
		else if (ne == columnDtl_add_dpt_nm9) doDtl_add_dpt_nm9_NE(info);
		else if (ne == columnDtl_aprv_role_cd) doDtl_aprv_role_cd_NE(info);
		else if (ne == columnDtl_aprv_role_nm) doDtl_aprv_role_nm_NE(info);
		else if (ne == columnDtl_aprv_role_cd1) doDtl_aprv_role_cd1_NE(info);
		else if (ne == columnDtl_aprv_role_nm1) doDtl_aprv_role_nm1_NE(info);
		else if (ne == columnDtl_aprv_role_cd2) doDtl_aprv_role_cd2_NE(info);
		else if (ne == columnDtl_aprv_role_nm2) doDtl_aprv_role_nm2_NE(info);
		else if (ne == columnDtl_aprv_role_cd3) doDtl_aprv_role_cd3_NE(info);
		else if (ne == columnDtl_aprv_role_nm3) doDtl_aprv_role_nm3_NE(info);
		else if (ne == columnDtl_aprv_role_cd4) doDtl_aprv_role_cd4_NE(info);
		else if (ne == columnDtl_aprv_role_nm4) doDtl_aprv_role_nm4_NE(info);
		else if (ne == columnDtl_aprv_role_cd5) doDtl_aprv_role_cd5_NE(info);
		else if (ne == columnDtl_aprv_role_nm5) doDtl_aprv_role_nm5_NE(info);
		else if (ne == columnDtl_aprv_role_cd6) doDtl_aprv_role_cd6_NE(info);
		else if (ne == columnDtl_aprv_role_nm6) doDtl_aprv_role_nm6_NE(info);
		else if (ne == columnDtl_aprv_role_cd7) doDtl_aprv_role_cd7_NE(info);
		else if (ne == columnDtl_aprv_role_nm7) doDtl_aprv_role_nm7_NE(info);
		else if (ne == columnDtl_aprv_role_cd8) doDtl_aprv_role_cd8_NE(info);
		else if (ne == columnDtl_aprv_role_nm8) doDtl_aprv_role_nm8_NE(info);
		else if (ne == columnDtl_aprv_role_cd9) doDtl_aprv_role_cd9_NE(info);
		else if (ne == columnDtl_aprv_role_nm9) doDtl_aprv_role_nm9_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd) doDtl_sub_aprv_role_cd_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm) doDtl_sub_aprv_role_nm_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd1) doDtl_sub_aprv_role_cd1_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm1) doDtl_sub_aprv_role_nm1_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd2) doDtl_sub_aprv_role_cd2_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm2) doDtl_sub_aprv_role_nm2_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd3) doDtl_sub_aprv_role_cd3_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm3) doDtl_sub_aprv_role_nm3_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd4) doDtl_sub_aprv_role_cd4_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm4) doDtl_sub_aprv_role_nm4_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd5) doDtl_sub_aprv_role_cd5_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm5) doDtl_sub_aprv_role_nm5_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd6) doDtl_sub_aprv_role_cd6_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm6) doDtl_sub_aprv_role_nm6_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd7) doDtl_sub_aprv_role_cd7_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm7) doDtl_sub_aprv_role_nm7_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd8) doDtl_sub_aprv_role_cd8_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm8) doDtl_sub_aprv_role_nm8_NE(info);
		else if (ne == columnDtl_sub_aprv_role_cd9) doDtl_sub_aprv_role_cd9_NE(info);
		else if (ne == columnDtl_sub_aprv_role_nm9) doDtl_sub_aprv_role_nm9_NE(info);
		else if (ne == columnDtl_main_flg) doDtl_main_flg_NE(info);
		else if (ne == columnDtl_main_dpt_flg) doDtl_main_dpt_flg_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_info1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info11_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info12_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info13_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info14_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info15_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info16_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info17_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info18_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info19_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info20_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[license_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_license_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_cl_usr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_cl_usr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cl_usr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cl_usr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_dpt_flg_NE(MCEventInfo info){
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
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_usr_com_typ) doCnd_usr_com_typ_NX(info);
		else if (nx == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NX(info);
		else if (nx == Cnd_usr_com) doCnd_usr_com_NX(info);
		else if (nx == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NX(info);
		else if (nx == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NX(info);
		else if (nx == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NX(info);
		else if (nx == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_NX(info);
		else if (nx == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_NX(info);
		else if (nx == Cnd_da_cd) doCnd_da_cd_NX(info);
		else if (nx == Cnd_da_nm) doCnd_da_nm_NX(info);
		else if (nx == Cnd_usr_aprv_role_cd) doCnd_usr_aprv_role_cd_NX(info);
		else if (nx == Cnd_usr_aprv_role_nm) doCnd_usr_aprv_role_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_usr_info1) doCnd_usr_info1_NX(info);
		else if (nx == Cnd_usr_info2) doCnd_usr_info2_NX(info);
		else if (nx == Cnd_usr_info3) doCnd_usr_info3_NX(info);
		else if (nx == Cnd_usr_info4) doCnd_usr_info4_NX(info);
		else if (nx == Cnd_usr_info5) doCnd_usr_info5_NX(info);
		else if (nx == Cnd_usr_info6) doCnd_usr_info6_NX(info);
		else if (nx == Cnd_usr_info7) doCnd_usr_info7_NX(info);
		else if (nx == Cnd_usr_info8) doCnd_usr_info8_NX(info);
		else if (nx == Cnd_usr_info9) doCnd_usr_info9_NX(info);
		else if (nx == Cnd_usr_info10) doCnd_usr_info10_NX(info);
		else if (nx == Cnd_usr_info11) doCnd_usr_info11_NX(info);
		else if (nx == Cnd_usr_info12) doCnd_usr_info12_NX(info);
		else if (nx == Cnd_usr_info13) doCnd_usr_info13_NX(info);
		else if (nx == Cnd_usr_info14) doCnd_usr_info14_NX(info);
		else if (nx == Cnd_usr_info15) doCnd_usr_info15_NX(info);
		else if (nx == Cnd_usr_info16) doCnd_usr_info16_NX(info);
		else if (nx == Cnd_usr_info17) doCnd_usr_info17_NX(info);
		else if (nx == Cnd_usr_info18) doCnd_usr_info18_NX(info);
		else if (nx == Cnd_usr_info19) doCnd_usr_info19_NX(info);
		else if (nx == Cnd_usr_info20) doCnd_usr_info20_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_usr_cd) doDtl_usr_cd_NX(info);
		else if (nx == columnDtl_usr_nm) doDtl_usr_nm_NX(info);
		else if (nx == columnDtl_license_flg) doDtl_license_flg_NX(info);
		else if (nx == columnDtl_usr_aprv_role_cd) doDtl_usr_aprv_role_cd_NX(info);
		else if (nx == columnDtl_usr_aprv_role_nm) doDtl_usr_aprv_role_nm_NX(info);
		else if (nx == columnDtl_usr_dpt_cd) doDtl_usr_dpt_cd_NX(info);
		else if (nx == columnDtl_usr_dpt_nm) doDtl_usr_dpt_nm_NX(info);
		else if (nx == columnDtl_da_cd) doDtl_da_cd_NX(info);
		else if (nx == columnDtl_da_nm) doDtl_da_nm_NX(info);
		else if (nx == columnDtl_pre_cl_usr_flg) doDtl_pre_cl_usr_flg_NX(info);
		else if (nx == columnDtl_cl_usr_flg) doDtl_cl_usr_flg_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_add_dpt_cd1) doDtl_add_dpt_cd1_NX(info);
		else if (nx == columnDtl_add_dpt_nm1) doDtl_add_dpt_nm1_NX(info);
		else if (nx == columnDtl_add_dpt_cd2) doDtl_add_dpt_cd2_NX(info);
		else if (nx == columnDtl_add_dpt_nm2) doDtl_add_dpt_nm2_NX(info);
		else if (nx == columnDtl_add_dpt_cd3) doDtl_add_dpt_cd3_NX(info);
		else if (nx == columnDtl_add_dpt_nm3) doDtl_add_dpt_nm3_NX(info);
		else if (nx == columnDtl_add_dpt_cd4) doDtl_add_dpt_cd4_NX(info);
		else if (nx == columnDtl_add_dpt_nm4) doDtl_add_dpt_nm4_NX(info);
		else if (nx == columnDtl_add_dpt_cd5) doDtl_add_dpt_cd5_NX(info);
		else if (nx == columnDtl_add_dpt_nm5) doDtl_add_dpt_nm5_NX(info);
		else if (nx == columnDtl_add_dpt_cd6) doDtl_add_dpt_cd6_NX(info);
		else if (nx == columnDtl_add_dpt_nm6) doDtl_add_dpt_nm6_NX(info);
		else if (nx == columnDtl_add_dpt_cd7) doDtl_add_dpt_cd7_NX(info);
		else if (nx == columnDtl_add_dpt_nm7) doDtl_add_dpt_nm7_NX(info);
		else if (nx == columnDtl_add_dpt_cd8) doDtl_add_dpt_cd8_NX(info);
		else if (nx == columnDtl_add_dpt_nm8) doDtl_add_dpt_nm8_NX(info);
		else if (nx == columnDtl_add_dpt_cd9) doDtl_add_dpt_cd9_NX(info);
		else if (nx == columnDtl_add_dpt_nm9) doDtl_add_dpt_nm9_NX(info);
		else if (nx == columnDtl_aprv_role_cd) doDtl_aprv_role_cd_NX(info);
		else if (nx == columnDtl_aprv_role_nm) doDtl_aprv_role_nm_NX(info);
		else if (nx == columnDtl_aprv_role_cd1) doDtl_aprv_role_cd1_NX(info);
		else if (nx == columnDtl_aprv_role_nm1) doDtl_aprv_role_nm1_NX(info);
		else if (nx == columnDtl_aprv_role_cd2) doDtl_aprv_role_cd2_NX(info);
		else if (nx == columnDtl_aprv_role_nm2) doDtl_aprv_role_nm2_NX(info);
		else if (nx == columnDtl_aprv_role_cd3) doDtl_aprv_role_cd3_NX(info);
		else if (nx == columnDtl_aprv_role_nm3) doDtl_aprv_role_nm3_NX(info);
		else if (nx == columnDtl_aprv_role_cd4) doDtl_aprv_role_cd4_NX(info);
		else if (nx == columnDtl_aprv_role_nm4) doDtl_aprv_role_nm4_NX(info);
		else if (nx == columnDtl_aprv_role_cd5) doDtl_aprv_role_cd5_NX(info);
		else if (nx == columnDtl_aprv_role_nm5) doDtl_aprv_role_nm5_NX(info);
		else if (nx == columnDtl_aprv_role_cd6) doDtl_aprv_role_cd6_NX(info);
		else if (nx == columnDtl_aprv_role_nm6) doDtl_aprv_role_nm6_NX(info);
		else if (nx == columnDtl_aprv_role_cd7) doDtl_aprv_role_cd7_NX(info);
		else if (nx == columnDtl_aprv_role_nm7) doDtl_aprv_role_nm7_NX(info);
		else if (nx == columnDtl_aprv_role_cd8) doDtl_aprv_role_cd8_NX(info);
		else if (nx == columnDtl_aprv_role_nm8) doDtl_aprv_role_nm8_NX(info);
		else if (nx == columnDtl_aprv_role_cd9) doDtl_aprv_role_cd9_NX(info);
		else if (nx == columnDtl_aprv_role_nm9) doDtl_aprv_role_nm9_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd) doDtl_sub_aprv_role_cd_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm) doDtl_sub_aprv_role_nm_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd1) doDtl_sub_aprv_role_cd1_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm1) doDtl_sub_aprv_role_nm1_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd2) doDtl_sub_aprv_role_cd2_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm2) doDtl_sub_aprv_role_nm2_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd3) doDtl_sub_aprv_role_cd3_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm3) doDtl_sub_aprv_role_nm3_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd4) doDtl_sub_aprv_role_cd4_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm4) doDtl_sub_aprv_role_nm4_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd5) doDtl_sub_aprv_role_cd5_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm5) doDtl_sub_aprv_role_nm5_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd6) doDtl_sub_aprv_role_cd6_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm6) doDtl_sub_aprv_role_nm6_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd7) doDtl_sub_aprv_role_cd7_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm7) doDtl_sub_aprv_role_nm7_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd8) doDtl_sub_aprv_role_cd8_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm8) doDtl_sub_aprv_role_nm8_NX(info);
		else if (nx == columnDtl_sub_aprv_role_cd9) doDtl_sub_aprv_role_cd9_NX(info);
		else if (nx == columnDtl_sub_aprv_role_nm9) doDtl_sub_aprv_role_nm9_NX(info);
		else if (nx == columnDtl_main_flg) doDtl_main_flg_NX(info);
		else if (nx == columnDtl_main_dpt_flg) doDtl_main_dpt_flg_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_info1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info11_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info12_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info13_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info14_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info15_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info16_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info17_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info18_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info19_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info20_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[license_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_license_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_cl_usr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_cl_usr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cl_usr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cl_usr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_dpt_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_usr_com_typ) doCnd_usr_com_typ_LC(info);
		else if (lc == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_LC(info);
		else if (lc == Cnd_usr_com) doCnd_usr_com_LC(info);
		else if (lc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_LC(info);
		else if (lc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_LC(info);
		else if (lc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_LC(info);
		else if (lc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_usr_dpt_cd) doCnd_usr_dpt_cd_LC(info);
		else if (lc == Cnd_usr_dpt_nm) doCnd_usr_dpt_nm_LC(info);
		else if (lc == Cnd_da_cd) doCnd_da_cd_LC(info);
		else if (lc == Cnd_da_nm) doCnd_da_nm_LC(info);
		else if (lc == Cnd_usr_aprv_role_cd) doCnd_usr_aprv_role_cd_LC(info);
		else if (lc == Cnd_usr_aprv_role_nm) doCnd_usr_aprv_role_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_usr_info1) doCnd_usr_info1_LC(info);
		else if (lc == Cnd_usr_info2) doCnd_usr_info2_LC(info);
		else if (lc == Cnd_usr_info3) doCnd_usr_info3_LC(info);
		else if (lc == Cnd_usr_info4) doCnd_usr_info4_LC(info);
		else if (lc == Cnd_usr_info5) doCnd_usr_info5_LC(info);
		else if (lc == Cnd_usr_info6) doCnd_usr_info6_LC(info);
		else if (lc == Cnd_usr_info7) doCnd_usr_info7_LC(info);
		else if (lc == Cnd_usr_info8) doCnd_usr_info8_LC(info);
		else if (lc == Cnd_usr_info9) doCnd_usr_info9_LC(info);
		else if (lc == Cnd_usr_info10) doCnd_usr_info10_LC(info);
		else if (lc == Cnd_usr_info11) doCnd_usr_info11_LC(info);
		else if (lc == Cnd_usr_info12) doCnd_usr_info12_LC(info);
		else if (lc == Cnd_usr_info13) doCnd_usr_info13_LC(info);
		else if (lc == Cnd_usr_info14) doCnd_usr_info14_LC(info);
		else if (lc == Cnd_usr_info15) doCnd_usr_info15_LC(info);
		else if (lc == Cnd_usr_info16) doCnd_usr_info16_LC(info);
		else if (lc == Cnd_usr_info17) doCnd_usr_info17_LC(info);
		else if (lc == Cnd_usr_info18) doCnd_usr_info18_LC(info);
		else if (lc == Cnd_usr_info19) doCnd_usr_info19_LC(info);
		else if (lc == Cnd_usr_info20) doCnd_usr_info20_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_usr_cd) doDtl_usr_cd_LC(info);
		else if (lc == columnDtl_usr_nm) doDtl_usr_nm_LC(info);
		else if (lc == columnDtl_usr_aprv_role_cd) doDtl_usr_aprv_role_cd_LC(info);
		else if (lc == columnDtl_usr_aprv_role_nm) doDtl_usr_aprv_role_nm_LC(info);
		else if (lc == columnDtl_usr_dpt_cd) doDtl_usr_dpt_cd_LC(info);
		else if (lc == columnDtl_usr_dpt_nm) doDtl_usr_dpt_nm_LC(info);
		else if (lc == columnDtl_da_cd) doDtl_da_cd_LC(info);
		else if (lc == columnDtl_da_nm) doDtl_da_nm_LC(info);
		else if (lc == columnDtl_dpt_cd) doDtl_dpt_cd_LC(info);
		else if (lc == columnDtl_dpt_nm) doDtl_dpt_nm_LC(info);
		else if (lc == columnDtl_add_dpt_cd1) doDtl_add_dpt_cd1_LC(info);
		else if (lc == columnDtl_add_dpt_nm1) doDtl_add_dpt_nm1_LC(info);
		else if (lc == columnDtl_add_dpt_cd2) doDtl_add_dpt_cd2_LC(info);
		else if (lc == columnDtl_add_dpt_nm2) doDtl_add_dpt_nm2_LC(info);
		else if (lc == columnDtl_add_dpt_cd3) doDtl_add_dpt_cd3_LC(info);
		else if (lc == columnDtl_add_dpt_nm3) doDtl_add_dpt_nm3_LC(info);
		else if (lc == columnDtl_add_dpt_cd4) doDtl_add_dpt_cd4_LC(info);
		else if (lc == columnDtl_add_dpt_nm4) doDtl_add_dpt_nm4_LC(info);
		else if (lc == columnDtl_add_dpt_cd5) doDtl_add_dpt_cd5_LC(info);
		else if (lc == columnDtl_add_dpt_nm5) doDtl_add_dpt_nm5_LC(info);
		else if (lc == columnDtl_add_dpt_cd6) doDtl_add_dpt_cd6_LC(info);
		else if (lc == columnDtl_add_dpt_nm6) doDtl_add_dpt_nm6_LC(info);
		else if (lc == columnDtl_add_dpt_cd7) doDtl_add_dpt_cd7_LC(info);
		else if (lc == columnDtl_add_dpt_nm7) doDtl_add_dpt_nm7_LC(info);
		else if (lc == columnDtl_add_dpt_cd8) doDtl_add_dpt_cd8_LC(info);
		else if (lc == columnDtl_add_dpt_nm8) doDtl_add_dpt_nm8_LC(info);
		else if (lc == columnDtl_add_dpt_cd9) doDtl_add_dpt_cd9_LC(info);
		else if (lc == columnDtl_add_dpt_nm9) doDtl_add_dpt_nm9_LC(info);
		else if (lc == columnDtl_aprv_role_cd) doDtl_aprv_role_cd_LC(info);
		else if (lc == columnDtl_aprv_role_nm) doDtl_aprv_role_nm_LC(info);
		else if (lc == columnDtl_aprv_role_cd1) doDtl_aprv_role_cd1_LC(info);
		else if (lc == columnDtl_aprv_role_nm1) doDtl_aprv_role_nm1_LC(info);
		else if (lc == columnDtl_aprv_role_cd2) doDtl_aprv_role_cd2_LC(info);
		else if (lc == columnDtl_aprv_role_nm2) doDtl_aprv_role_nm2_LC(info);
		else if (lc == columnDtl_aprv_role_cd3) doDtl_aprv_role_cd3_LC(info);
		else if (lc == columnDtl_aprv_role_nm3) doDtl_aprv_role_nm3_LC(info);
		else if (lc == columnDtl_aprv_role_cd4) doDtl_aprv_role_cd4_LC(info);
		else if (lc == columnDtl_aprv_role_nm4) doDtl_aprv_role_nm4_LC(info);
		else if (lc == columnDtl_aprv_role_cd5) doDtl_aprv_role_cd5_LC(info);
		else if (lc == columnDtl_aprv_role_nm5) doDtl_aprv_role_nm5_LC(info);
		else if (lc == columnDtl_aprv_role_cd6) doDtl_aprv_role_cd6_LC(info);
		else if (lc == columnDtl_aprv_role_nm6) doDtl_aprv_role_nm6_LC(info);
		else if (lc == columnDtl_aprv_role_cd7) doDtl_aprv_role_cd7_LC(info);
		else if (lc == columnDtl_aprv_role_nm7) doDtl_aprv_role_nm7_LC(info);
		else if (lc == columnDtl_aprv_role_cd8) doDtl_aprv_role_cd8_LC(info);
		else if (lc == columnDtl_aprv_role_nm8) doDtl_aprv_role_nm8_LC(info);
		else if (lc == columnDtl_aprv_role_cd9) doDtl_aprv_role_cd9_LC(info);
		else if (lc == columnDtl_aprv_role_nm9) doDtl_aprv_role_nm9_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd) doDtl_sub_aprv_role_cd_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm) doDtl_sub_aprv_role_nm_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd1) doDtl_sub_aprv_role_cd1_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm1) doDtl_sub_aprv_role_nm1_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd2) doDtl_sub_aprv_role_cd2_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm2) doDtl_sub_aprv_role_nm2_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd3) doDtl_sub_aprv_role_cd3_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm3) doDtl_sub_aprv_role_nm3_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd4) doDtl_sub_aprv_role_cd4_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm4) doDtl_sub_aprv_role_nm4_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd5) doDtl_sub_aprv_role_cd5_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm5) doDtl_sub_aprv_role_nm5_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd6) doDtl_sub_aprv_role_cd6_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm6) doDtl_sub_aprv_role_nm6_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd7) doDtl_sub_aprv_role_cd7_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm7) doDtl_sub_aprv_role_nm7_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd8) doDtl_sub_aprv_role_cd8_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm8) doDtl_sub_aprv_role_nm8_LC(info);
		else if (lc == columnDtl_sub_aprv_role_cd9) doDtl_sub_aprv_role_cd9_LC(info);
		else if (lc == columnDtl_sub_aprv_role_nm9) doDtl_sub_aprv_role_nm9_LC(info);
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
	 * [Cnd]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_com]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_com_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[da_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_da_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_aprv_role_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[usr_info1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info11_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info12_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info13_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info14_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info15_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info16_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info17_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info18_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info19_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[usr_info20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_usr_info20_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[da_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_da_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_dpt_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_dpt_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_role_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_role_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_aprv_role_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_aprv_role_nm9_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_usr_cd]の作成メソッド
	 */
	public MCList getCnd_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_com_typ]の作成メソッド
	 */
	public MCList getCnd_usr_com_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsrComTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_usr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_da_cd]の作成メソッド
	 */
	public MCList getCnd_da_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDa(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_usr_aprv_role_cd]の作成メソッド
	 */
	public MCList getCnd_usr_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_usr_cd]の作成メソッド
	 */
	public MCList getDtl_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_da_cd]の作成メソッド
	 */
	public MCList getDtl_da_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDa(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd1]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd2]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd3]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd4]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd5]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd6]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd7]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd8]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_add_dpt_cd9]の作成メソッド
	 */
	public MCList getDtl_add_dpt_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd1]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd2]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd3]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd4]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd5]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd6]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd7]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd8]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_aprv_role_cd9]の作成メソッド
	 */
	public MCList getDtl_aprv_role_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd1]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd2]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd3]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd4]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd5]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd6]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd7]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd8]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sub_aprv_role_cd9]の作成メソッド
	 */
	public MCList getDtl_sub_aprv_role_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0250.Srch01")) {
			return new MA_MABCL0250_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0250.Sprt01")) {
			return new MA_MABCL0250_Sprt01Bridge();
		}
		if (id.equals("MA.MABCL0250.Upd01")) {
			return new MA_MABCL0250_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0250.Del01")) {
			return new MA_MABCL0250_Del01Bridge();
		}
		if (id.equals("MA.MABCL0250.Srch02")) {
			return new MA_MABCL0250_Srch02Bridge();
		}
		if (id.equals("MA.MABCL0250.Srch03")) {
			return new MA_MABCL0250_Srch03Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0250_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0250_Srch01Bridge() {
			p_MA_MABCL0250_Srch01 = new MCParam(PDef.MA_MABCL0250_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));

			p_MA_MABCL0250_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0250.CndR up0() {
			return (mcframe.clientMABC.MABCP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0250_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0250.DtlR>)p_MA_MABCL0250_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0250_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Sprt01;

		/** コンストラクタ */
		protected MA_MABCL0250_Sprt01Bridge() {
			p_MA_MABCL0250_Sprt01 = new MCParam(PDef.MA_MABCL0250_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));

			p_MA_MABCL0250_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0250_Sprt01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0250.DtlR>)p_MA_MABCL0250_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0250_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0250_Upd01Bridge() {
			p_MA_MABCL0250_Upd01 = new MCParam(PDef.MA_MABCL0250_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
			// Down

			p_MA_MABCL0250_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Upd01;
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
	 * [MA_MABCL0250_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Del01;

		/** コンストラクタ */
		protected MA_MABCL0250_Del01Bridge() {
			p_MA_MABCL0250_Del01 = new MCParam(PDef.MA_MABCL0250_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
			// Down

			p_MA_MABCL0250_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Del01;
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
	 * [MA_MABCL0250_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Srch02;

		/** コンストラクタ */
		protected MA_MABCL0250_Srch02Bridge() {
			p_MA_MABCL0250_Srch02 = new MCParam(PDef.MA_MABCL0250_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));

			p_MA_MABCL0250_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0250.CndR up0() {
			return (mcframe.clientMABC.MABCP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0250_Srch02.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0250.DtlR>)p_MA_MABCL0250_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0250_Srch03]の定型処理のInnerClass
	 */
	protected class MA_MABCL0250_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0250_Srch03;

		/** コンストラクタ */
		protected MA_MABCL0250_Srch03Bridge() {
			p_MA_MABCL0250_Srch03 = new MCParam(PDef.MA_MABCL0250_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0250_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0250.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));

			p_MA_MABCL0250_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0250_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0250_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0250_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0250_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0250.CndR up0() {
			return (mcframe.clientMABC.MABCP0250.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0250.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0250.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0250_Srch03.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0250.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0250_Srch03;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0250.DtlR>)p_MA_MABCL0250_Srch03.getContainerParam().getDownBlock(0));
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
}