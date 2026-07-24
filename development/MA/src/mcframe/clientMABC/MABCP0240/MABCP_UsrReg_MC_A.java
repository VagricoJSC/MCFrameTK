package mcframe.clientMABC.MABCP0240;

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
import mcframe.clientMABC.MABCP0240.MABCP_UsrReg_MC.MA_MABCL0240_Srch01Caller;
import mcframe.clientMABC.MABCP0240.MABCP_UsrReg_MC.MA_MABCL0240_Upd01Caller;
import mcframe.clientMABC.MABCP0240.MABCP_UsrReg_MC.MA_MABCL0240_Del01Caller;

/**
 * 画面"MABCP_UsrReg"パネルクラスです。<p>
 *
 * 担当者マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_UsrReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABCP0240";

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
	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public MCCheckBox Cnd_th_image_flg = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0240.DtlR> DtlTable = null;
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
	public MCColumnConfig columnDtl_usr_nm_lcl = null;
	/**
	 * Standard PIC name 標準担当者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_nm = null;
	/**
	 * License ライセンス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_license_flg = null;
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_alt_nm1 = null;
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_alt_nm2 = null;
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_alt_nm3 = null;
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_alt_nm4 = null;
	/**
	 * Full data access フルデータアクセス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_full_da_flg = null;
	/**
	 * E-mail 1 Ｅ－Ｍａｉｌ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_email1 = null;
	/**
	 * E-mail 2 Ｅ－Ｍａｉｌ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_email2 = null;
	/**
	 * E-mail 3 Ｅ－Ｍａｉｌ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_email3 = null;
	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel1 = null;
	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel2 = null;
	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel3 = null;
	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public MCColumnConfig columnDtl_th_image_flg = null;
	/**
	 * Image 画像.<p>
	 *
	 */
	public MCColumnConfig columnDtl_th_image = null;
	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_com_typ = null;
	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_com_typ_nm = null;
	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_com = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wk_cost_nm = null;
	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info1 = null;
	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info2 = null;
	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info3 = null;
	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info4 = null;
	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info5 = null;
	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info6 = null;
	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info7 = null;
	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info8 = null;
	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info9 = null;
	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info10 = null;
	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info11 = null;
	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info12 = null;
	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info13 = null;
	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info14 = null;
	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info15 = null;
	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info16 = null;
	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info17 = null;
	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info18 = null;
	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info19 = null;
	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_usr_info20 = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0240.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_cd = null;
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
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_nm = null;
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_alt_nm1 = null;
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_alt_nm2 = null;
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_alt_nm3 = null;
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public MCColumnConfig columnLcl_usr_alt_nm4 = null;
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
	
	/** [MA_MABCL0240_Srch01]のCallerの作成 */
	protected MABCP_UsrReg_MC.MA_MABCL0240_Srch01Caller createMA_MABCL0240_Srch01() {
		MABCP_UsrReg_MC.MA_MABCL0240_Srch01Caller<MABCP_UsrReg, MA_MABCL0240_Srch01Bridge>
		caller = ((MABCP_UsrReg_MC)this).new MA_MABCL0240_Srch01Caller<MABCP_UsrReg, MA_MABCL0240_Srch01Bridge>(
					(MABCP_UsrReg)this, new MA_MABCL0240_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0240_Srch01]の呼び出し */
	protected void callMA_MABCL0240_Srch01() {
		MCCaller caller = createMA_MABCL0240_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0240_Upd01]のCallerの作成 */
	protected MABCP_UsrReg_MC.MA_MABCL0240_Upd01Caller createMA_MABCL0240_Upd01() {
		MABCP_UsrReg_MC.MA_MABCL0240_Upd01Caller<MABCP_UsrReg, MA_MABCL0240_Upd01Bridge>
		caller = ((MABCP_UsrReg_MC)this).new MA_MABCL0240_Upd01Caller<MABCP_UsrReg, MA_MABCL0240_Upd01Bridge>(
					(MABCP_UsrReg)this, new MA_MABCL0240_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0240_Upd01]の呼び出し */
	protected void callMA_MABCL0240_Upd01() {
		MCCaller caller = createMA_MABCL0240_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0240_Del01]のCallerの作成 */
	protected MABCP_UsrReg_MC.MA_MABCL0240_Del01Caller createMA_MABCL0240_Del01() {
		MABCP_UsrReg_MC.MA_MABCL0240_Del01Caller<MABCP_UsrReg, MA_MABCL0240_Del01Bridge>
		caller = ((MABCP_UsrReg_MC)this).new MA_MABCL0240_Del01Caller<MABCP_UsrReg, MA_MABCL0240_Del01Bridge>(
					(MABCP_UsrReg)this, new MA_MABCL0240_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0240_Del01]の呼び出し */
	protected void callMA_MABCL0240_Del01() {
		MCCaller caller = createMA_MABCL0240_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0240.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0240.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0240.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0240.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0240.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0240.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0240.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0240.MstR createMstR() {
		return mcframe.clientMABC.MABCP0240.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0240.CndR createCndR() {
		return mcframe.clientMABC.MABCP0240.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0240.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0240.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0240.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0240.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABC.MABCP0240.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0240.LclR createLclR() {
		return mcframe.clientMABC.MABCP0240.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0240.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0240.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0240.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0240.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0240.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0240.LclR.class);
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
	public MABCP_UsrReg_MC_A() {
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
	public MABCP_UsrReg_MC_A(String name) {
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
		MABCP_UsrReg_MC.jbCreateScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateMst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateTop((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateFold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateCnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateTab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateTab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateCtrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateDtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateDtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateLclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateLcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateLclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbCreateEastBtn((MABCP_UsrReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_UsrReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_UsrReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_UsrReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_UsrReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_UsrReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_UsrReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_UsrReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_UsrReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_UsrReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_UsrReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_UsrReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_UsrReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_UsrReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_UsrReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_UsrReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_UsrReg p) {
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
	
	
	/** [Dtl_usr_com_typ_ListPutter]の定義 */
	private MCListPutter Dtl_usr_com_typ_p = null;

	/**
	 * [Dtl_usr_com_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_usr_com_typ_ListPutter() {
		if (Dtl_usr_com_typ_p == null) {
			Dtl_usr_com_typ_p = createDtl_usr_com_typ_ListPutter(columnDtl_usr_com_typ, "usr_com_typ", "usr_com_typ_nm");

		}
		return Dtl_usr_com_typ_p;
	}
	
	
	/** [Dtl_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wk_cost_cd_p = null;

	/**
	 * [Dtl_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wk_cost_cd_ListPutter() {
		if (Dtl_wk_cost_cd_p == null) {
			Dtl_wk_cost_cd_p = createDtl_wk_cost_cd_ListPutter(columnDtl_wk_cost_cd, "wk_cost_cd", "wk_cost_nm");

		}
		return Dtl_wk_cost_cd_p;
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
	public static MABCP_UsrReg create(){
		MABCP_UsrReg p = new MABCP_UsrReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_UsrReg create(String name){
		MABCP_UsrReg p = new MABCP_UsrReg(name);
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
		MABCP_UsrReg_MC.jbfInitScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitMst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitTop((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitFold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitCnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitTab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitTab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitCtrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitDtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitDtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitLclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitLcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitLclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbfInitEastBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitMst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitTop((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitFold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitCnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitTab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitTab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitCtrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitDtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitDtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitLclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitLcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitLclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.jbInitEastBtn((MABCP_UsrReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_UsrReg p) {
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
	protected static void jbfInitTop(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_UsrReg p) {
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
	protected static void jbfInitCnd(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_usr_cd_Label = p.beansFactory.createLabel("Cnd.usr_cd_Label");
		p.Cnd_usr_cd = p.beansFactory.createTextField("Cnd.usr_cd");
		p.Cnd_usr_cd.setLabel(p.Cnd_usr_cd_Label);
		p.Cnd_usr_nm = p.beansFactory.createTextField("Cnd.usr_nm");
		p.Cnd_th_image_flg = p.beansFactory.createCheckBox("Cnd.th_image_flg");
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
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_usr_cd = p.beansFactory.createTableColumn("Dtl.usr_cd", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_usr_nm_lcl = p.beansFactory.createTableColumn("Dtl.usr_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_usr_nm = p.beansFactory.createTableColumn("Dtl.usr_nm", MCColumnType.TEXT);
		p.columnDtl_license_flg = p.beansFactory.createTableColumn("Dtl.license_flg", MCColumnType.CHECK);
		p.columnDtl_usr_alt_nm1 = p.beansFactory.createTableColumn("Dtl.usr_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_usr_alt_nm2 = p.beansFactory.createTableColumn("Dtl.usr_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_usr_alt_nm3 = p.beansFactory.createTableColumn("Dtl.usr_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_usr_alt_nm4 = p.beansFactory.createTableColumn("Dtl.usr_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_full_da_flg = p.beansFactory.createTableColumn("Dtl.full_da_flg", MCColumnType.CHECK);
		p.columnDtl_email1 = p.beansFactory.createTableColumn("Dtl.email1", MCColumnType.TEXT);
		p.columnDtl_email2 = p.beansFactory.createTableColumn("Dtl.email2", MCColumnType.TEXT);
		p.columnDtl_email3 = p.beansFactory.createTableColumn("Dtl.email3", MCColumnType.TEXT);
		p.columnDtl_tel1 = p.beansFactory.createTableColumn("Dtl.tel1", MCColumnType.TEXT);
		p.columnDtl_tel2 = p.beansFactory.createTableColumn("Dtl.tel2", MCColumnType.TEXT);
		p.columnDtl_tel3 = p.beansFactory.createTableColumn("Dtl.tel3", MCColumnType.TEXT);
		p.columnDtl_th_image_flg = p.beansFactory.createTableColumn("Dtl.th_image_flg", MCColumnType.CHECK);
		p.columnDtl_th_image = p.beansFactory.createTableColumn("Dtl.th_image", MCColumnType.IMAGE_VIEW);
		p.columnDtl_usr_com_typ = p.beansFactory.createTableColumn("Dtl.usr_com_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_usr_com_typ_nm = p.beansFactory.createTableColumn("Dtl.usr_com_typ_nm", MCColumnType.TEXT);
		p.columnDtl_usr_com = p.beansFactory.createTableColumn("Dtl.usr_com", MCColumnType.TEXT);
		p.columnDtl_wk_cost_cd = p.beansFactory.createTableColumn("Dtl.wk_cost_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wk_cost_nm = p.beansFactory.createTableColumn("Dtl.wk_cost_nm", MCColumnType.TEXT);
		p.columnDtl_usr_info1 = p.beansFactory.createTableColumn("Dtl.usr_info1", MCColumnType.TEXT);
		p.columnDtl_usr_info2 = p.beansFactory.createTableColumn("Dtl.usr_info2", MCColumnType.TEXT);
		p.columnDtl_usr_info3 = p.beansFactory.createTableColumn("Dtl.usr_info3", MCColumnType.TEXT);
		p.columnDtl_usr_info4 = p.beansFactory.createTableColumn("Dtl.usr_info4", MCColumnType.TEXT);
		p.columnDtl_usr_info5 = p.beansFactory.createTableColumn("Dtl.usr_info5", MCColumnType.TEXT);
		p.columnDtl_usr_info6 = p.beansFactory.createTableColumn("Dtl.usr_info6", MCColumnType.TEXT);
		p.columnDtl_usr_info7 = p.beansFactory.createTableColumn("Dtl.usr_info7", MCColumnType.TEXT);
		p.columnDtl_usr_info8 = p.beansFactory.createTableColumn("Dtl.usr_info8", MCColumnType.TEXT);
		p.columnDtl_usr_info9 = p.beansFactory.createTableColumn("Dtl.usr_info9", MCColumnType.TEXT);
		p.columnDtl_usr_info10 = p.beansFactory.createTableColumn("Dtl.usr_info10", MCColumnType.TEXT);
		p.columnDtl_usr_info11 = p.beansFactory.createTableColumn("Dtl.usr_info11", MCColumnType.TEXT);
		p.columnDtl_usr_info12 = p.beansFactory.createTableColumn("Dtl.usr_info12", MCColumnType.TEXT);
		p.columnDtl_usr_info13 = p.beansFactory.createTableColumn("Dtl.usr_info13", MCColumnType.TEXT);
		p.columnDtl_usr_info14 = p.beansFactory.createTableColumn("Dtl.usr_info14", MCColumnType.TEXT);
		p.columnDtl_usr_info15 = p.beansFactory.createTableColumn("Dtl.usr_info15", MCColumnType.TEXT);
		p.columnDtl_usr_info16 = p.beansFactory.createTableColumn("Dtl.usr_info16", MCColumnType.TEXT);
		p.columnDtl_usr_info17 = p.beansFactory.createTableColumn("Dtl.usr_info17", MCColumnType.TEXT);
		p.columnDtl_usr_info18 = p.beansFactory.createTableColumn("Dtl.usr_info18", MCColumnType.TEXT);
		p.columnDtl_usr_info19 = p.beansFactory.createTableColumn("Dtl.usr_info19", MCColumnType.TEXT);
		p.columnDtl_usr_info20 = p.beansFactory.createTableColumn("Dtl.usr_info20", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABCP_UsrReg p) {
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
	protected static void jbfInitLclWrk(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_usr_cd = p.beansFactory.createTableColumn("Lcl.usr_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_usr_nm = p.beansFactory.createTableColumn("Lcl.usr_nm", MCColumnType.TEXT);
		p.columnLcl_usr_alt_nm1 = p.beansFactory.createTableColumn("Lcl.usr_alt_nm1", MCColumnType.TEXT);
		p.columnLcl_usr_alt_nm2 = p.beansFactory.createTableColumn("Lcl.usr_alt_nm2", MCColumnType.TEXT);
		p.columnLcl_usr_alt_nm3 = p.beansFactory.createTableColumn("Lcl.usr_alt_nm3", MCColumnType.TEXT);
		p.columnLcl_usr_alt_nm4 = p.beansFactory.createTableColumn("Lcl.usr_alt_nm4", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABCP_UsrReg p) {
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
	protected static void jbfInitBtn(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_UsrReg p) {
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
	protected static void jbInitMst(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0240.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_UsrReg p) {
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
	protected static void jbInitFold(MABCP_UsrReg p) {
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
	protected static void jbInitCnd(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.WrkPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.ope_META);
		p.Tab1Panel.add(p.Cnd_usr_cd_Label);
		p.Tab1Panel.add(p.Cnd_usr_cd);
		p.Tab1Panel.setLastBeans(p.Cnd_usr_cd);
		p.Cnd_usr_cd.setNextBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_cd_META);
		p.Cnd_usr_cd.addLinkBeans(p.Cnd_usr_nm);
		p.Cnd_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_cd, true);
		p.Tab1Panel.add(p.Cnd_usr_nm);
		p.Cnd_usr_nm.setNextBeans(p.Cnd_th_image_flg);
		p.Cnd_usr_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_nm_META);
		p.setPluralValueEnable(p.Cnd_usr_nm, true);
		p.Tab1Panel.add(p.Cnd_th_image_flg);
		p.Cnd_th_image_flg.setNextBeans(p.Cnd_usr_com_typ);
		p.Cnd_th_image_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.th_image_flg_META);
		p.Cnd_usr_com_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_usr_com_typ, true);
		p.Cnd_usr_com_typ.setLinkBeans(p.Cnd_usr_com_typ_nm);
		p.Tab1Panel.add(p.Cnd_usr_com_typ_Label);
		p.Tab1Panel.add(p.Cnd_usr_com_typ);
		p.Cnd_usr_com_typ.setNextBeans(p.Cnd_usr_com_typ_nm);
		p.Cnd_usr_com_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_com_typ_META);
		p.Tab1Panel.add(p.Cnd_usr_com_typ_nm);
		p.Cnd_usr_com_typ_nm.setNextBeans(p.Cnd_usr_com);
		p.Cnd_usr_com_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_com_typ_nm_META);
		p.Tab1Panel.add(p.Cnd_usr_com_Label);
		p.Tab1Panel.add(p.Cnd_usr_com);
		p.Cnd_usr_com.setNextBeans(p.Cnd_usr_alt_nm1);
		p.Cnd_usr_com.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_com_META);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm1_Label);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm1);
		p.Cnd_usr_alt_nm1.setNextBeans(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_alt_nm1_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm1, true);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm2_Label);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm2);
		p.Cnd_usr_alt_nm2.setNextBeans(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_alt_nm2_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm2, true);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm3_Label);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm3);
		p.Cnd_usr_alt_nm3.setNextBeans(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_alt_nm3_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm3, true);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm4_Label);
		p.Tab1Panel.add(p.Cnd_usr_alt_nm4);
		p.Cnd_usr_alt_nm4.setNextBeans(p.Cnd_memo1);
		p.Cnd_usr_alt_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_alt_nm4_META);
		p.setPluralValueEnable(p.Cnd_usr_alt_nm4, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.on_del_flg_META);
		p.Tab2Panel.add(p.Cnd_usr_info1_Label);
		p.Tab2Panel.add(p.Cnd_usr_info1);
		p.Tab2Panel.setLastBeans(p.Cnd_usr_info1);
		p.Cnd_usr_info1.setNextBeans(p.Cnd_usr_info2);
		p.Cnd_usr_info1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info1_META);
		p.setPluralValueEnable(p.Cnd_usr_info1, true);
		p.Tab2Panel.add(p.Cnd_usr_info2_Label);
		p.Tab2Panel.add(p.Cnd_usr_info2);
		p.Cnd_usr_info2.setNextBeans(p.Cnd_usr_info3);
		p.Cnd_usr_info2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info2_META);
		p.setPluralValueEnable(p.Cnd_usr_info2, true);
		p.Tab2Panel.add(p.Cnd_usr_info3_Label);
		p.Tab2Panel.add(p.Cnd_usr_info3);
		p.Cnd_usr_info3.setNextBeans(p.Cnd_usr_info4);
		p.Cnd_usr_info3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info3_META);
		p.setPluralValueEnable(p.Cnd_usr_info3, true);
		p.Tab2Panel.add(p.Cnd_usr_info4_Label);
		p.Tab2Panel.add(p.Cnd_usr_info4);
		p.Cnd_usr_info4.setNextBeans(p.Cnd_usr_info5);
		p.Cnd_usr_info4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info4_META);
		p.setPluralValueEnable(p.Cnd_usr_info4, true);
		p.Tab2Panel.add(p.Cnd_usr_info5_Label);
		p.Tab2Panel.add(p.Cnd_usr_info5);
		p.Cnd_usr_info5.setNextBeans(p.Cnd_usr_info6);
		p.Cnd_usr_info5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info5_META);
		p.setPluralValueEnable(p.Cnd_usr_info5, true);
		p.Tab2Panel.add(p.Cnd_usr_info6_Label);
		p.Tab2Panel.add(p.Cnd_usr_info6);
		p.Cnd_usr_info6.setNextBeans(p.Cnd_usr_info7);
		p.Cnd_usr_info6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info6_META);
		p.setPluralValueEnable(p.Cnd_usr_info6, true);
		p.Tab2Panel.add(p.Cnd_usr_info7_Label);
		p.Tab2Panel.add(p.Cnd_usr_info7);
		p.Cnd_usr_info7.setNextBeans(p.Cnd_usr_info8);
		p.Cnd_usr_info7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info7_META);
		p.setPluralValueEnable(p.Cnd_usr_info7, true);
		p.Tab2Panel.add(p.Cnd_usr_info8_Label);
		p.Tab2Panel.add(p.Cnd_usr_info8);
		p.Cnd_usr_info8.setNextBeans(p.Cnd_usr_info9);
		p.Cnd_usr_info8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info8_META);
		p.setPluralValueEnable(p.Cnd_usr_info8, true);
		p.Tab2Panel.add(p.Cnd_usr_info9_Label);
		p.Tab2Panel.add(p.Cnd_usr_info9);
		p.Cnd_usr_info9.setNextBeans(p.Cnd_usr_info10);
		p.Cnd_usr_info9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info9_META);
		p.setPluralValueEnable(p.Cnd_usr_info9, true);
		p.Tab2Panel.add(p.Cnd_usr_info10_Label);
		p.Tab2Panel.add(p.Cnd_usr_info10);
		p.Cnd_usr_info10.setNextBeans(p.Cnd_usr_info11);
		p.Cnd_usr_info10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info10_META);
		p.setPluralValueEnable(p.Cnd_usr_info10, true);
		p.Tab2Panel.add(p.Cnd_usr_info11_Label);
		p.Tab2Panel.add(p.Cnd_usr_info11);
		p.Cnd_usr_info11.setNextBeans(p.Cnd_usr_info12);
		p.Cnd_usr_info11.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info11_META);
		p.setPluralValueEnable(p.Cnd_usr_info11, true);
		p.Tab2Panel.add(p.Cnd_usr_info12_Label);
		p.Tab2Panel.add(p.Cnd_usr_info12);
		p.Cnd_usr_info12.setNextBeans(p.Cnd_usr_info13);
		p.Cnd_usr_info12.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info12_META);
		p.setPluralValueEnable(p.Cnd_usr_info12, true);
		p.Tab2Panel.add(p.Cnd_usr_info13_Label);
		p.Tab2Panel.add(p.Cnd_usr_info13);
		p.Cnd_usr_info13.setNextBeans(p.Cnd_usr_info14);
		p.Cnd_usr_info13.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info13_META);
		p.setPluralValueEnable(p.Cnd_usr_info13, true);
		p.Tab2Panel.add(p.Cnd_usr_info14_Label);
		p.Tab2Panel.add(p.Cnd_usr_info14);
		p.Cnd_usr_info14.setNextBeans(p.Cnd_usr_info15);
		p.Cnd_usr_info14.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info14_META);
		p.setPluralValueEnable(p.Cnd_usr_info14, true);
		p.Tab2Panel.add(p.Cnd_usr_info15_Label);
		p.Tab2Panel.add(p.Cnd_usr_info15);
		p.Cnd_usr_info15.setNextBeans(p.Cnd_usr_info16);
		p.Cnd_usr_info15.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info15_META);
		p.setPluralValueEnable(p.Cnd_usr_info15, true);
		p.Tab2Panel.add(p.Cnd_usr_info16_Label);
		p.Tab2Panel.add(p.Cnd_usr_info16);
		p.Cnd_usr_info16.setNextBeans(p.Cnd_usr_info17);
		p.Cnd_usr_info16.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info16_META);
		p.setPluralValueEnable(p.Cnd_usr_info16, true);
		p.Tab2Panel.add(p.Cnd_usr_info17_Label);
		p.Tab2Panel.add(p.Cnd_usr_info17);
		p.Cnd_usr_info17.setNextBeans(p.Cnd_usr_info18);
		p.Cnd_usr_info17.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info17_META);
		p.setPluralValueEnable(p.Cnd_usr_info17, true);
		p.Tab2Panel.add(p.Cnd_usr_info18_Label);
		p.Tab2Panel.add(p.Cnd_usr_info18);
		p.Cnd_usr_info18.setNextBeans(p.Cnd_usr_info19);
		p.Cnd_usr_info18.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info18_META);
		p.setPluralValueEnable(p.Cnd_usr_info18, true);
		p.Tab2Panel.add(p.Cnd_usr_info19_Label);
		p.Tab2Panel.add(p.Cnd_usr_info19);
		p.Cnd_usr_info19.setNextBeans(p.Cnd_usr_info20);
		p.Cnd_usr_info19.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info19_META);
		p.setPluralValueEnable(p.Cnd_usr_info19, true);
		p.Tab2Panel.add(p.Cnd_usr_info20_Label);
		p.Tab2Panel.add(p.Cnd_usr_info20);
		p.Cnd_usr_info20.setRow(p.getCndR(), mcframe.clientMABC.MABCP0240.CndR.usr_info20_META);
		p.setPluralValueEnable(p.Cnd_usr_info20, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_UsrReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_UsrReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_UsrReg p) {
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
	protected static void jbInitWrk(MABCP_UsrReg p) {
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
	protected static void jbInitDtl(MABCP_UsrReg p) {
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
	protected static void jbInitDtlBtn(MABCP_UsrReg p) {
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
	protected static void jbInitLclWrk(MABCP_UsrReg p) {
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
	protected static void jbInitLcl(MABCP_UsrReg p) {
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
	protected static void jbInitLclBtn(MABCP_UsrReg p) {
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
	protected static void jbInitBtn(MABCP_UsrReg p) {
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
	protected static void jbInitEastBtn(MABCP_UsrReg p) {
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
		MABCP_UsrReg_MC.mcInitScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitMst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitTop((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitFold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitCnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitTab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitTab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitCtrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitDtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitDtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitLclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitLcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitLclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.mcInitEastBtn((MABCP_UsrReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_UsrReg_MC.statusInitUPD_ScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Mst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Top((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Fold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Cnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Tab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Tab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Ctrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Wrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Dtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_DtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_LclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Lcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_LclAll((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_LclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_Btn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitUPD_EastBtn((MABCP_UsrReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_UsrReg_MC.statusInitFIX_ScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Mst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Top((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Fold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Cnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Tab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Tab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Ctrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Wrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Dtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_DtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_LclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Lcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_LclAll((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_LclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_Btn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitFIX_EastBtn((MABCP_UsrReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_UsrReg_MC.statusInitDEL_ScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Mst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Top((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Fold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Cnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Tab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Tab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Ctrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Wrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Dtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_DtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_LclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Lcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_LclAll((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_LclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_Btn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitDEL_EastBtn((MABCP_UsrReg)this);

		// [REF]ステータスのモードの設定
		MABCP_UsrReg_MC.statusInitREF_ScreenOpe((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Mst((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Top((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Fold((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Cnd((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Tab1((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Tab2((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Ctrl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Wrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Dtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_DtlBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_LclWrk((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Lcl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_LclAll((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_LclBtn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_Btn((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.statusInitREF_EastBtn((MABCP_UsrReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_UsrReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_UsrReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_UsrReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_UsrReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_UsrReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_usr_cd.setListListener(p);
		p.Cnd_usr_cd.addAllListener(p);
		p.Cnd_usr_nm.setListListener(p);
		p.Cnd_usr_nm.addAllListener(p);
		p.Cnd_th_image_flg.addAllListener(p);
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
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_UsrReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_UsrReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_UsrReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_UsrReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_UsrReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_usr_cd.addAllListener(p);
		p.columnDtl_usr_cd.setListListener(p);
		p.columnDtl_usr_nm_lcl.addAllListener(p);
		p.columnDtl_usr_nm_lcl.setListListener(p);
		p.columnDtl_usr_nm.addAllListener(p);
		p.columnDtl_usr_nm.setListListener(p);
		p.columnDtl_license_flg.addAllListener(p);
		p.columnDtl_usr_alt_nm1.addAllListener(p);
		p.columnDtl_usr_alt_nm1.setListListener(p);
		p.columnDtl_usr_alt_nm2.addAllListener(p);
		p.columnDtl_usr_alt_nm2.setListListener(p);
		p.columnDtl_usr_alt_nm3.addAllListener(p);
		p.columnDtl_usr_alt_nm3.setListListener(p);
		p.columnDtl_usr_alt_nm4.addAllListener(p);
		p.columnDtl_usr_alt_nm4.setListListener(p);
		p.columnDtl_full_da_flg.addAllListener(p);
		p.columnDtl_email1.addAllListener(p);
		p.columnDtl_email1.setListListener(p);
		p.columnDtl_email2.addAllListener(p);
		p.columnDtl_email2.setListListener(p);
		p.columnDtl_email3.addAllListener(p);
		p.columnDtl_email3.setListListener(p);
		p.columnDtl_tel1.addAllListener(p);
		p.columnDtl_tel1.setListListener(p);
		p.columnDtl_tel2.addAllListener(p);
		p.columnDtl_tel2.setListListener(p);
		p.columnDtl_tel3.addAllListener(p);
		p.columnDtl_tel3.setListListener(p);
		p.columnDtl_th_image_flg.addAllListener(p);
		p.columnDtl_th_image.addAllListener(p);
		p.columnDtl_usr_com_typ.addAllListener(p);
		p.columnDtl_usr_com_typ.setListListener(p);
		p.columnDtl_usr_com_typ_nm.addAllListener(p);
		p.columnDtl_usr_com_typ_nm.setListListener(p);
		p.columnDtl_usr_com.addAllListener(p);
		p.columnDtl_usr_com.setListListener(p);
		p.columnDtl_wk_cost_cd.addAllListener(p);
		p.columnDtl_wk_cost_cd.setListListener(p);
		p.columnDtl_wk_cost_nm.addAllListener(p);
		p.columnDtl_wk_cost_nm.setListListener(p);
		p.columnDtl_usr_info1.addAllListener(p);
		p.columnDtl_usr_info1.setListListener(p);
		p.columnDtl_usr_info2.addAllListener(p);
		p.columnDtl_usr_info2.setListListener(p);
		p.columnDtl_usr_info3.addAllListener(p);
		p.columnDtl_usr_info3.setListListener(p);
		p.columnDtl_usr_info4.addAllListener(p);
		p.columnDtl_usr_info4.setListListener(p);
		p.columnDtl_usr_info5.addAllListener(p);
		p.columnDtl_usr_info5.setListListener(p);
		p.columnDtl_usr_info6.addAllListener(p);
		p.columnDtl_usr_info6.setListListener(p);
		p.columnDtl_usr_info7.addAllListener(p);
		p.columnDtl_usr_info7.setListListener(p);
		p.columnDtl_usr_info8.addAllListener(p);
		p.columnDtl_usr_info8.setListListener(p);
		p.columnDtl_usr_info9.addAllListener(p);
		p.columnDtl_usr_info9.setListListener(p);
		p.columnDtl_usr_info10.addAllListener(p);
		p.columnDtl_usr_info10.setListListener(p);
		p.columnDtl_usr_info11.addAllListener(p);
		p.columnDtl_usr_info11.setListListener(p);
		p.columnDtl_usr_info12.addAllListener(p);
		p.columnDtl_usr_info12.setListListener(p);
		p.columnDtl_usr_info13.addAllListener(p);
		p.columnDtl_usr_info13.setListListener(p);
		p.columnDtl_usr_info14.addAllListener(p);
		p.columnDtl_usr_info14.setListListener(p);
		p.columnDtl_usr_info15.addAllListener(p);
		p.columnDtl_usr_info15.setListListener(p);
		p.columnDtl_usr_info16.addAllListener(p);
		p.columnDtl_usr_info16.setListListener(p);
		p.columnDtl_usr_info17.addAllListener(p);
		p.columnDtl_usr_info17.setListListener(p);
		p.columnDtl_usr_info18.addAllListener(p);
		p.columnDtl_usr_info18.setListListener(p);
		p.columnDtl_usr_info19.addAllListener(p);
		p.columnDtl_usr_info19.setListListener(p);
		p.columnDtl_usr_info20.addAllListener(p);
		p.columnDtl_usr_info20.setListListener(p);
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
	protected static void mcInitDtlBtn(MABCP_UsrReg p) {
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
	protected static void mcInitLclWrk(MABCP_UsrReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_UsrReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_usr_cd.addAllListener(p);
		p.columnLcl_usr_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_usr_nm.addAllListener(p);
		p.columnLcl_usr_nm.setListListener(p);
		p.columnLcl_usr_alt_nm1.addAllListener(p);
		p.columnLcl_usr_alt_nm1.setListListener(p);
		p.columnLcl_usr_alt_nm2.addAllListener(p);
		p.columnLcl_usr_alt_nm2.setListListener(p);
		p.columnLcl_usr_alt_nm3.addAllListener(p);
		p.columnLcl_usr_alt_nm3.setListListener(p);
		p.columnLcl_usr_alt_nm4.addAllListener(p);
		p.columnLcl_usr_alt_nm4.setListListener(p);
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
	protected static void mcInitLclBtn(MABCP_UsrReg p) {
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
	protected static void mcInitBtn(MABCP_UsrReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_UsrReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_UsrReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_UsrReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
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
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_UsrReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_usr_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_usr_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_license_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_full_da_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_email1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_email2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_email3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_th_image_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_com_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_com_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_usr_com.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wk_cost_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wk_cost_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_usr_info1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info11.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info13.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info15.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info17.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info19.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_usr_info20.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_DtlBtn(MABCP_UsrReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_UsrReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_usr_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_usr_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_usr_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_usr_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_usr_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_LclAll(MABCP_UsrReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_UsrReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_UsrReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_UsrReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_UsrReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_usr_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, FIX, MCMode.ENABLE);
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
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_UsrReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_full_da_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_email1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_email2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_email3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_com.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_usr_info20.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABCP_UsrReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_UsrReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_LclAll(MABCP_UsrReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_UsrReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_UsrReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_UsrReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_UsrReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, DEL, MCMode.ENABLE);
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
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_UsrReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_full_da_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_email1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_email2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_email3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_com.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_usr_info20.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABCP_UsrReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_UsrReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm4.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_LclAll(MABCP_UsrReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_UsrReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_UsrReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_UsrReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_UsrReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_com_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_com_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_usr_com.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_usr_alt_nm4.putMode(p, REF, MCMode.ENABLE);
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
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_UsrReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_license_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_full_da_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_email1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_email2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_email3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_com_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_com.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_usr_info20.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABCP_UsrReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_UsrReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_usr_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_LclAll(MABCP_UsrReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_UsrReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_UsrReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_UsrReg p){

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
		MABCP_UsrReg_MC.setTableConfigDtl((MABCP_UsrReg)this);
		MABCP_UsrReg_MC.setTableConfigLcl((MABCP_UsrReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_UsrReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0240.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0240.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_usr_cd.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_cd_META);
		p.columnDtl_usr_cd.addLinkBeans(p.columnDtl_usr_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_cd);
		p.columnDtl_usr_nm_lcl.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_nm_lcl);
		p.columnDtl_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_nm);
		p.columnDtl_license_flg.setMeta(mcframe.clientMABC.MABCP0240.DtlR.license_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_license_flg);
		p.columnDtl_usr_alt_nm1.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_alt_nm1);
		p.columnDtl_usr_alt_nm2.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_alt_nm2);
		p.columnDtl_usr_alt_nm3.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_alt_nm3);
		p.columnDtl_usr_alt_nm4.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_alt_nm4);
		p.columnDtl_full_da_flg.setMeta(mcframe.clientMABC.MABCP0240.DtlR.full_da_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_full_da_flg);
		p.columnDtl_email1.setMeta(mcframe.clientMABC.MABCP0240.DtlR.email1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_email1);
		p.columnDtl_email2.setMeta(mcframe.clientMABC.MABCP0240.DtlR.email2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_email2);
		p.columnDtl_email3.setMeta(mcframe.clientMABC.MABCP0240.DtlR.email3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_email3);
		p.columnDtl_tel1.setMeta(mcframe.clientMABC.MABCP0240.DtlR.tel1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel1);
		p.columnDtl_tel2.setMeta(mcframe.clientMABC.MABCP0240.DtlR.tel2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel2);
		p.columnDtl_tel3.setMeta(mcframe.clientMABC.MABCP0240.DtlR.tel3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel3);
		p.columnDtl_th_image_flg.setMeta(mcframe.clientMABC.MABCP0240.DtlR.th_image_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_th_image_flg);
		p.columnDtl_th_image.setMeta(mcframe.clientMABC.MABCP0240.DtlR.th_image_META);
		p.DtlTable.addColumnConfig(p.columnDtl_th_image);
		p.columnDtl_usr_com_typ.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_com_typ_META);
		p.columnDtl_usr_com_typ.addLinkBeans(p.columnDtl_usr_com_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_com_typ);
		p.columnDtl_usr_com_typ_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_com_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_com_typ_nm);
		p.columnDtl_usr_com.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_com_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_com);
		p.columnDtl_wk_cost_cd.setMeta(mcframe.clientMABC.MABCP0240.DtlR.wk_cost_cd_META);
		p.columnDtl_wk_cost_cd.addLinkBeans(p.columnDtl_wk_cost_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wk_cost_cd);
		p.columnDtl_wk_cost_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.wk_cost_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wk_cost_nm);
		p.columnDtl_usr_info1.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info1);
		p.columnDtl_usr_info2.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info2);
		p.columnDtl_usr_info3.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info3);
		p.columnDtl_usr_info4.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info4);
		p.columnDtl_usr_info5.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info5);
		p.columnDtl_usr_info6.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info6);
		p.columnDtl_usr_info7.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info7);
		p.columnDtl_usr_info8.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info8);
		p.columnDtl_usr_info9.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info9);
		p.columnDtl_usr_info10.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info10);
		p.columnDtl_usr_info11.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info11_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info11);
		p.columnDtl_usr_info12.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info12_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info12);
		p.columnDtl_usr_info13.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info13_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info13);
		p.columnDtl_usr_info14.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info14_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info14);
		p.columnDtl_usr_info15.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info15_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info15);
		p.columnDtl_usr_info16.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info16_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info16);
		p.columnDtl_usr_info17.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info17_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info17);
		p.columnDtl_usr_info18.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info18_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info18);
		p.columnDtl_usr_info19.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info19_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info19);
		p.columnDtl_usr_info20.setMeta(mcframe.clientMABC.MABCP0240.DtlR.usr_info20_META);
		p.DtlTable.addColumnConfig(p.columnDtl_usr_info20);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0240.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0240.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0240.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0240.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0240.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0240.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0240.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0240.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0240.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_UsrReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0240.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_usr_cd.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0240.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_nm);
		p.columnLcl_usr_alt_nm1.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_alt_nm1_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_alt_nm1);
		p.columnLcl_usr_alt_nm2.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_alt_nm2_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_alt_nm2);
		p.columnLcl_usr_alt_nm3.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_alt_nm3_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_alt_nm3);
		p.columnLcl_usr_alt_nm4.setMeta(mcframe.clientMABC.MABCP0240.LclR.usr_alt_nm4_META);
		p.LclTable.addColumnConfig(p.columnLcl_usr_alt_nm4);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0240.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0240.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0240.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0240.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0240.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0240.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0240.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_usr_cd.getListConfig().setPutter(getCnd_usr_cd_ListPutter());
		Cnd_usr_com_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_usr_com_typ.getListConfig().setPutter(getCnd_usr_com_typ_ListPutter());
		columnDtl_usr_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_usr_cd.getListConfig().setPutter(getDtl_usr_cd_ListPutter());
		columnDtl_usr_com_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_usr_com_typ.getListConfig().setPutter(getDtl_usr_com_typ_ListPutter());
		columnDtl_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wk_cost_cd.getListConfig().setPutter(getDtl_wk_cost_cd_ListPutter());
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
	 * [Dtl_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("FS.FSUAP0010.User");
		return lp;
	}
	 
	/**
	 * [Dtl_usr_com_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_usr_com_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UsrComTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
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
		if(combo == Cnd_usr_cd) return getCnd_usr_cd(row, info);
		if(combo == Cnd_usr_com_typ) return getCnd_usr_com_typ(row, info);
		if(combo == columnDtl_usr_cd) return getDtl_usr_cd(row, info);
		if(combo == columnDtl_usr_com_typ) return getDtl_usr_com_typ(row, info);
		if(combo == columnDtl_wk_cost_cd) return getDtl_wk_cost_cd(row, info);
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
		if (vc == Cnd_usr_cd) return doCnd_usr_cd_VC(info);
		if (vc == Cnd_usr_nm) return doCnd_usr_nm_VC(info);
		if (vc == Cnd_th_image_flg) return doCnd_th_image_flg_VC(info);
		if (vc == Cnd_usr_com_typ) return doCnd_usr_com_typ_VC(info);
		if (vc == Cnd_usr_com_typ_nm) return doCnd_usr_com_typ_nm_VC(info);
		if (vc == Cnd_usr_com) return doCnd_usr_com_VC(info);
		if (vc == Cnd_usr_alt_nm1) return doCnd_usr_alt_nm1_VC(info);
		if (vc == Cnd_usr_alt_nm2) return doCnd_usr_alt_nm2_VC(info);
		if (vc == Cnd_usr_alt_nm3) return doCnd_usr_alt_nm3_VC(info);
		if (vc == Cnd_usr_alt_nm4) return doCnd_usr_alt_nm4_VC(info);
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
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_usr_cd) return doDtl_usr_cd_VC(info);
		if (vc == columnDtl_usr_nm_lcl) return doDtl_usr_nm_lcl_VC(info);
		if (vc == columnDtl_usr_nm) return doDtl_usr_nm_VC(info);
		if (vc == columnDtl_license_flg) return doDtl_license_flg_VC(info);
		if (vc == columnDtl_usr_alt_nm1) return doDtl_usr_alt_nm1_VC(info);
		if (vc == columnDtl_usr_alt_nm2) return doDtl_usr_alt_nm2_VC(info);
		if (vc == columnDtl_usr_alt_nm3) return doDtl_usr_alt_nm3_VC(info);
		if (vc == columnDtl_usr_alt_nm4) return doDtl_usr_alt_nm4_VC(info);
		if (vc == columnDtl_full_da_flg) return doDtl_full_da_flg_VC(info);
		if (vc == columnDtl_email1) return doDtl_email1_VC(info);
		if (vc == columnDtl_email2) return doDtl_email2_VC(info);
		if (vc == columnDtl_email3) return doDtl_email3_VC(info);
		if (vc == columnDtl_tel1) return doDtl_tel1_VC(info);
		if (vc == columnDtl_tel2) return doDtl_tel2_VC(info);
		if (vc == columnDtl_tel3) return doDtl_tel3_VC(info);
		if (vc == columnDtl_th_image_flg) return doDtl_th_image_flg_VC(info);
		if (vc == columnDtl_th_image) return doDtl_th_image_VC(info);
		if (vc == columnDtl_usr_com_typ) return doDtl_usr_com_typ_VC(info);
		if (vc == columnDtl_usr_com_typ_nm) return doDtl_usr_com_typ_nm_VC(info);
		if (vc == columnDtl_usr_com) return doDtl_usr_com_VC(info);
		if (vc == columnDtl_wk_cost_cd) return doDtl_wk_cost_cd_VC(info);
		if (vc == columnDtl_wk_cost_nm) return doDtl_wk_cost_nm_VC(info);
		if (vc == columnDtl_usr_info1) return doDtl_usr_info1_VC(info);
		if (vc == columnDtl_usr_info2) return doDtl_usr_info2_VC(info);
		if (vc == columnDtl_usr_info3) return doDtl_usr_info3_VC(info);
		if (vc == columnDtl_usr_info4) return doDtl_usr_info4_VC(info);
		if (vc == columnDtl_usr_info5) return doDtl_usr_info5_VC(info);
		if (vc == columnDtl_usr_info6) return doDtl_usr_info6_VC(info);
		if (vc == columnDtl_usr_info7) return doDtl_usr_info7_VC(info);
		if (vc == columnDtl_usr_info8) return doDtl_usr_info8_VC(info);
		if (vc == columnDtl_usr_info9) return doDtl_usr_info9_VC(info);
		if (vc == columnDtl_usr_info10) return doDtl_usr_info10_VC(info);
		if (vc == columnDtl_usr_info11) return doDtl_usr_info11_VC(info);
		if (vc == columnDtl_usr_info12) return doDtl_usr_info12_VC(info);
		if (vc == columnDtl_usr_info13) return doDtl_usr_info13_VC(info);
		if (vc == columnDtl_usr_info14) return doDtl_usr_info14_VC(info);
		if (vc == columnDtl_usr_info15) return doDtl_usr_info15_VC(info);
		if (vc == columnDtl_usr_info16) return doDtl_usr_info16_VC(info);
		if (vc == columnDtl_usr_info17) return doDtl_usr_info17_VC(info);
		if (vc == columnDtl_usr_info18) return doDtl_usr_info18_VC(info);
		if (vc == columnDtl_usr_info19) return doDtl_usr_info19_VC(info);
		if (vc == columnDtl_usr_info20) return doDtl_usr_info20_VC(info);
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
		if (vc == columnLcl_usr_cd) return doLcl_usr_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_usr_nm) return doLcl_usr_nm_VC(info);
		if (vc == columnLcl_usr_alt_nm1) return doLcl_usr_alt_nm1_VC(info);
		if (vc == columnLcl_usr_alt_nm2) return doLcl_usr_alt_nm2_VC(info);
		if (vc == columnLcl_usr_alt_nm3) return doLcl_usr_alt_nm3_VC(info);
		if (vc == columnLcl_usr_alt_nm4) return doLcl_usr_alt_nm4_VC(info);
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
	 * [Cnd]パネルの[th_image_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_th_image_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_nm_lcl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_alt_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[full_da_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_full_da_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[email1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_email1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[email2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_email2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[email3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_email3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[th_image_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_th_image_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[th_image]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_th_image_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_com_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_com_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_com_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_com_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_com]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_com_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wk_cost_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[usr_info20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_usr_info20_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_usr_alt_nm4_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_usr_cd) doCnd_usr_cd_NC(info);
		else if (nc == Cnd_usr_nm) doCnd_usr_nm_NC(info);
		else if (nc == Cnd_th_image_flg) doCnd_th_image_flg_NC(info);
		else if (nc == Cnd_usr_com_typ) doCnd_usr_com_typ_NC(info);
		else if (nc == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NC(info);
		else if (nc == Cnd_usr_com) doCnd_usr_com_NC(info);
		else if (nc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NC(info);
		else if (nc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NC(info);
		else if (nc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NC(info);
		else if (nc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NC(info);
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
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_usr_cd) doDtl_usr_cd_NC(info);
		else if (nc == columnDtl_usr_nm_lcl) doDtl_usr_nm_lcl_NC(info);
		else if (nc == columnDtl_usr_nm) doDtl_usr_nm_NC(info);
		else if (nc == columnDtl_license_flg) doDtl_license_flg_NC(info);
		else if (nc == columnDtl_usr_alt_nm1) doDtl_usr_alt_nm1_NC(info);
		else if (nc == columnDtl_usr_alt_nm2) doDtl_usr_alt_nm2_NC(info);
		else if (nc == columnDtl_usr_alt_nm3) doDtl_usr_alt_nm3_NC(info);
		else if (nc == columnDtl_usr_alt_nm4) doDtl_usr_alt_nm4_NC(info);
		else if (nc == columnDtl_full_da_flg) doDtl_full_da_flg_NC(info);
		else if (nc == columnDtl_email1) doDtl_email1_NC(info);
		else if (nc == columnDtl_email2) doDtl_email2_NC(info);
		else if (nc == columnDtl_email3) doDtl_email3_NC(info);
		else if (nc == columnDtl_tel1) doDtl_tel1_NC(info);
		else if (nc == columnDtl_tel2) doDtl_tel2_NC(info);
		else if (nc == columnDtl_tel3) doDtl_tel3_NC(info);
		else if (nc == columnDtl_th_image_flg) doDtl_th_image_flg_NC(info);
		else if (nc == columnDtl_th_image) doDtl_th_image_NC(info);
		else if (nc == columnDtl_usr_com_typ) doDtl_usr_com_typ_NC(info);
		else if (nc == columnDtl_usr_com_typ_nm) doDtl_usr_com_typ_nm_NC(info);
		else if (nc == columnDtl_usr_com) doDtl_usr_com_NC(info);
		else if (nc == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NC(info);
		else if (nc == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NC(info);
		else if (nc == columnDtl_usr_info1) doDtl_usr_info1_NC(info);
		else if (nc == columnDtl_usr_info2) doDtl_usr_info2_NC(info);
		else if (nc == columnDtl_usr_info3) doDtl_usr_info3_NC(info);
		else if (nc == columnDtl_usr_info4) doDtl_usr_info4_NC(info);
		else if (nc == columnDtl_usr_info5) doDtl_usr_info5_NC(info);
		else if (nc == columnDtl_usr_info6) doDtl_usr_info6_NC(info);
		else if (nc == columnDtl_usr_info7) doDtl_usr_info7_NC(info);
		else if (nc == columnDtl_usr_info8) doDtl_usr_info8_NC(info);
		else if (nc == columnDtl_usr_info9) doDtl_usr_info9_NC(info);
		else if (nc == columnDtl_usr_info10) doDtl_usr_info10_NC(info);
		else if (nc == columnDtl_usr_info11) doDtl_usr_info11_NC(info);
		else if (nc == columnDtl_usr_info12) doDtl_usr_info12_NC(info);
		else if (nc == columnDtl_usr_info13) doDtl_usr_info13_NC(info);
		else if (nc == columnDtl_usr_info14) doDtl_usr_info14_NC(info);
		else if (nc == columnDtl_usr_info15) doDtl_usr_info15_NC(info);
		else if (nc == columnDtl_usr_info16) doDtl_usr_info16_NC(info);
		else if (nc == columnDtl_usr_info17) doDtl_usr_info17_NC(info);
		else if (nc == columnDtl_usr_info18) doDtl_usr_info18_NC(info);
		else if (nc == columnDtl_usr_info19) doDtl_usr_info19_NC(info);
		else if (nc == columnDtl_usr_info20) doDtl_usr_info20_NC(info);
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
		else if (nc == columnLcl_usr_cd) doLcl_usr_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_usr_nm) doLcl_usr_nm_NC(info);
		else if (nc == columnLcl_usr_alt_nm1) doLcl_usr_alt_nm1_NC(info);
		else if (nc == columnLcl_usr_alt_nm2) doLcl_usr_alt_nm2_NC(info);
		else if (nc == columnLcl_usr_alt_nm3) doLcl_usr_alt_nm3_NC(info);
		else if (nc == columnLcl_usr_alt_nm4) doLcl_usr_alt_nm4_NC(info);
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
	 * [Cnd]パネルの[th_image_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_lcl_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[full_da_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_full_da_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info11_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info12_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info13_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info14_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info15_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info16_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info17_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info18_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info19_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info20_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm4_NC(MCEventInfo info){
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
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_usr_cd) doCnd_usr_cd_NE(info);
		else if (ne == Cnd_usr_nm) doCnd_usr_nm_NE(info);
		else if (ne == Cnd_th_image_flg) doCnd_th_image_flg_NE(info);
		else if (ne == Cnd_usr_com_typ) doCnd_usr_com_typ_NE(info);
		else if (ne == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NE(info);
		else if (ne == Cnd_usr_com) doCnd_usr_com_NE(info);
		else if (ne == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NE(info);
		else if (ne == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NE(info);
		else if (ne == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NE(info);
		else if (ne == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NE(info);
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
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_usr_cd) doDtl_usr_cd_NE(info);
		else if (ne == columnDtl_usr_nm_lcl) doDtl_usr_nm_lcl_NE(info);
		else if (ne == columnDtl_usr_nm) doDtl_usr_nm_NE(info);
		else if (ne == columnDtl_license_flg) doDtl_license_flg_NE(info);
		else if (ne == columnDtl_usr_alt_nm1) doDtl_usr_alt_nm1_NE(info);
		else if (ne == columnDtl_usr_alt_nm2) doDtl_usr_alt_nm2_NE(info);
		else if (ne == columnDtl_usr_alt_nm3) doDtl_usr_alt_nm3_NE(info);
		else if (ne == columnDtl_usr_alt_nm4) doDtl_usr_alt_nm4_NE(info);
		else if (ne == columnDtl_full_da_flg) doDtl_full_da_flg_NE(info);
		else if (ne == columnDtl_email1) doDtl_email1_NE(info);
		else if (ne == columnDtl_email2) doDtl_email2_NE(info);
		else if (ne == columnDtl_email3) doDtl_email3_NE(info);
		else if (ne == columnDtl_tel1) doDtl_tel1_NE(info);
		else if (ne == columnDtl_tel2) doDtl_tel2_NE(info);
		else if (ne == columnDtl_tel3) doDtl_tel3_NE(info);
		else if (ne == columnDtl_th_image_flg) doDtl_th_image_flg_NE(info);
		else if (ne == columnDtl_th_image) doDtl_th_image_NE(info);
		else if (ne == columnDtl_usr_com_typ) doDtl_usr_com_typ_NE(info);
		else if (ne == columnDtl_usr_com_typ_nm) doDtl_usr_com_typ_nm_NE(info);
		else if (ne == columnDtl_usr_com) doDtl_usr_com_NE(info);
		else if (ne == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NE(info);
		else if (ne == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NE(info);
		else if (ne == columnDtl_usr_info1) doDtl_usr_info1_NE(info);
		else if (ne == columnDtl_usr_info2) doDtl_usr_info2_NE(info);
		else if (ne == columnDtl_usr_info3) doDtl_usr_info3_NE(info);
		else if (ne == columnDtl_usr_info4) doDtl_usr_info4_NE(info);
		else if (ne == columnDtl_usr_info5) doDtl_usr_info5_NE(info);
		else if (ne == columnDtl_usr_info6) doDtl_usr_info6_NE(info);
		else if (ne == columnDtl_usr_info7) doDtl_usr_info7_NE(info);
		else if (ne == columnDtl_usr_info8) doDtl_usr_info8_NE(info);
		else if (ne == columnDtl_usr_info9) doDtl_usr_info9_NE(info);
		else if (ne == columnDtl_usr_info10) doDtl_usr_info10_NE(info);
		else if (ne == columnDtl_usr_info11) doDtl_usr_info11_NE(info);
		else if (ne == columnDtl_usr_info12) doDtl_usr_info12_NE(info);
		else if (ne == columnDtl_usr_info13) doDtl_usr_info13_NE(info);
		else if (ne == columnDtl_usr_info14) doDtl_usr_info14_NE(info);
		else if (ne == columnDtl_usr_info15) doDtl_usr_info15_NE(info);
		else if (ne == columnDtl_usr_info16) doDtl_usr_info16_NE(info);
		else if (ne == columnDtl_usr_info17) doDtl_usr_info17_NE(info);
		else if (ne == columnDtl_usr_info18) doDtl_usr_info18_NE(info);
		else if (ne == columnDtl_usr_info19) doDtl_usr_info19_NE(info);
		else if (ne == columnDtl_usr_info20) doDtl_usr_info20_NE(info);
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
		else if (ne == columnLcl_usr_cd) doLcl_usr_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_usr_nm) doLcl_usr_nm_NE(info);
		else if (ne == columnLcl_usr_alt_nm1) doLcl_usr_alt_nm1_NE(info);
		else if (ne == columnLcl_usr_alt_nm2) doLcl_usr_alt_nm2_NE(info);
		else if (ne == columnLcl_usr_alt_nm3) doLcl_usr_alt_nm3_NE(info);
		else if (ne == columnLcl_usr_alt_nm4) doLcl_usr_alt_nm4_NE(info);
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
	 * [Cnd]パネルの[th_image_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_lcl_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[full_da_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_full_da_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info11_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info12_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info13_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info14_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info15_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info16_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info17_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info18_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info19_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info20_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm4_NE(MCEventInfo info){
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
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_usr_cd) doCnd_usr_cd_NX(info);
		else if (nx == Cnd_usr_nm) doCnd_usr_nm_NX(info);
		else if (nx == Cnd_th_image_flg) doCnd_th_image_flg_NX(info);
		else if (nx == Cnd_usr_com_typ) doCnd_usr_com_typ_NX(info);
		else if (nx == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_NX(info);
		else if (nx == Cnd_usr_com) doCnd_usr_com_NX(info);
		else if (nx == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_NX(info);
		else if (nx == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_NX(info);
		else if (nx == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_NX(info);
		else if (nx == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_NX(info);
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
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_usr_cd) doDtl_usr_cd_NX(info);
		else if (nx == columnDtl_usr_nm_lcl) doDtl_usr_nm_lcl_NX(info);
		else if (nx == columnDtl_usr_nm) doDtl_usr_nm_NX(info);
		else if (nx == columnDtl_license_flg) doDtl_license_flg_NX(info);
		else if (nx == columnDtl_usr_alt_nm1) doDtl_usr_alt_nm1_NX(info);
		else if (nx == columnDtl_usr_alt_nm2) doDtl_usr_alt_nm2_NX(info);
		else if (nx == columnDtl_usr_alt_nm3) doDtl_usr_alt_nm3_NX(info);
		else if (nx == columnDtl_usr_alt_nm4) doDtl_usr_alt_nm4_NX(info);
		else if (nx == columnDtl_full_da_flg) doDtl_full_da_flg_NX(info);
		else if (nx == columnDtl_email1) doDtl_email1_NX(info);
		else if (nx == columnDtl_email2) doDtl_email2_NX(info);
		else if (nx == columnDtl_email3) doDtl_email3_NX(info);
		else if (nx == columnDtl_tel1) doDtl_tel1_NX(info);
		else if (nx == columnDtl_tel2) doDtl_tel2_NX(info);
		else if (nx == columnDtl_tel3) doDtl_tel3_NX(info);
		else if (nx == columnDtl_th_image_flg) doDtl_th_image_flg_NX(info);
		else if (nx == columnDtl_th_image) doDtl_th_image_NX(info);
		else if (nx == columnDtl_usr_com_typ) doDtl_usr_com_typ_NX(info);
		else if (nx == columnDtl_usr_com_typ_nm) doDtl_usr_com_typ_nm_NX(info);
		else if (nx == columnDtl_usr_com) doDtl_usr_com_NX(info);
		else if (nx == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NX(info);
		else if (nx == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NX(info);
		else if (nx == columnDtl_usr_info1) doDtl_usr_info1_NX(info);
		else if (nx == columnDtl_usr_info2) doDtl_usr_info2_NX(info);
		else if (nx == columnDtl_usr_info3) doDtl_usr_info3_NX(info);
		else if (nx == columnDtl_usr_info4) doDtl_usr_info4_NX(info);
		else if (nx == columnDtl_usr_info5) doDtl_usr_info5_NX(info);
		else if (nx == columnDtl_usr_info6) doDtl_usr_info6_NX(info);
		else if (nx == columnDtl_usr_info7) doDtl_usr_info7_NX(info);
		else if (nx == columnDtl_usr_info8) doDtl_usr_info8_NX(info);
		else if (nx == columnDtl_usr_info9) doDtl_usr_info9_NX(info);
		else if (nx == columnDtl_usr_info10) doDtl_usr_info10_NX(info);
		else if (nx == columnDtl_usr_info11) doDtl_usr_info11_NX(info);
		else if (nx == columnDtl_usr_info12) doDtl_usr_info12_NX(info);
		else if (nx == columnDtl_usr_info13) doDtl_usr_info13_NX(info);
		else if (nx == columnDtl_usr_info14) doDtl_usr_info14_NX(info);
		else if (nx == columnDtl_usr_info15) doDtl_usr_info15_NX(info);
		else if (nx == columnDtl_usr_info16) doDtl_usr_info16_NX(info);
		else if (nx == columnDtl_usr_info17) doDtl_usr_info17_NX(info);
		else if (nx == columnDtl_usr_info18) doDtl_usr_info18_NX(info);
		else if (nx == columnDtl_usr_info19) doDtl_usr_info19_NX(info);
		else if (nx == columnDtl_usr_info20) doDtl_usr_info20_NX(info);
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
		else if (nx == columnLcl_usr_cd) doLcl_usr_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_usr_nm) doLcl_usr_nm_NX(info);
		else if (nx == columnLcl_usr_alt_nm1) doLcl_usr_alt_nm1_NX(info);
		else if (nx == columnLcl_usr_alt_nm2) doLcl_usr_alt_nm2_NX(info);
		else if (nx == columnLcl_usr_alt_nm3) doLcl_usr_alt_nm3_NX(info);
		else if (nx == columnLcl_usr_alt_nm4) doLcl_usr_alt_nm4_NX(info);
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
	 * [Cnd]パネルの[th_image_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_lcl_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[usr_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[full_da_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_full_da_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[th_image]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_th_image_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info11_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info12_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info13_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info14_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info15_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info16_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info17_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info18_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info19_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info20_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm4_NX(MCEventInfo info){
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
		else if (lc == Cnd_usr_cd) doCnd_usr_cd_LC(info);
		else if (lc == Cnd_usr_nm) doCnd_usr_nm_LC(info);
		else if (lc == Cnd_usr_com_typ) doCnd_usr_com_typ_LC(info);
		else if (lc == Cnd_usr_com_typ_nm) doCnd_usr_com_typ_nm_LC(info);
		else if (lc == Cnd_usr_com) doCnd_usr_com_LC(info);
		else if (lc == Cnd_usr_alt_nm1) doCnd_usr_alt_nm1_LC(info);
		else if (lc == Cnd_usr_alt_nm2) doCnd_usr_alt_nm2_LC(info);
		else if (lc == Cnd_usr_alt_nm3) doCnd_usr_alt_nm3_LC(info);
		else if (lc == Cnd_usr_alt_nm4) doCnd_usr_alt_nm4_LC(info);
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
		else if (lc == columnDtl_usr_cd) doDtl_usr_cd_LC(info);
		else if (lc == columnDtl_usr_nm_lcl) doDtl_usr_nm_lcl_LC(info);
		else if (lc == columnDtl_usr_nm) doDtl_usr_nm_LC(info);
		else if (lc == columnDtl_usr_alt_nm1) doDtl_usr_alt_nm1_LC(info);
		else if (lc == columnDtl_usr_alt_nm2) doDtl_usr_alt_nm2_LC(info);
		else if (lc == columnDtl_usr_alt_nm3) doDtl_usr_alt_nm3_LC(info);
		else if (lc == columnDtl_usr_alt_nm4) doDtl_usr_alt_nm4_LC(info);
		else if (lc == columnDtl_email1) doDtl_email1_LC(info);
		else if (lc == columnDtl_email2) doDtl_email2_LC(info);
		else if (lc == columnDtl_email3) doDtl_email3_LC(info);
		else if (lc == columnDtl_tel1) doDtl_tel1_LC(info);
		else if (lc == columnDtl_tel2) doDtl_tel2_LC(info);
		else if (lc == columnDtl_tel3) doDtl_tel3_LC(info);
		else if (lc == columnDtl_usr_com_typ) doDtl_usr_com_typ_LC(info);
		else if (lc == columnDtl_usr_com_typ_nm) doDtl_usr_com_typ_nm_LC(info);
		else if (lc == columnDtl_usr_com) doDtl_usr_com_LC(info);
		else if (lc == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_LC(info);
		else if (lc == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_LC(info);
		else if (lc == columnDtl_usr_info1) doDtl_usr_info1_LC(info);
		else if (lc == columnDtl_usr_info2) doDtl_usr_info2_LC(info);
		else if (lc == columnDtl_usr_info3) doDtl_usr_info3_LC(info);
		else if (lc == columnDtl_usr_info4) doDtl_usr_info4_LC(info);
		else if (lc == columnDtl_usr_info5) doDtl_usr_info5_LC(info);
		else if (lc == columnDtl_usr_info6) doDtl_usr_info6_LC(info);
		else if (lc == columnDtl_usr_info7) doDtl_usr_info7_LC(info);
		else if (lc == columnDtl_usr_info8) doDtl_usr_info8_LC(info);
		else if (lc == columnDtl_usr_info9) doDtl_usr_info9_LC(info);
		else if (lc == columnDtl_usr_info10) doDtl_usr_info10_LC(info);
		else if (lc == columnDtl_usr_info11) doDtl_usr_info11_LC(info);
		else if (lc == columnDtl_usr_info12) doDtl_usr_info12_LC(info);
		else if (lc == columnDtl_usr_info13) doDtl_usr_info13_LC(info);
		else if (lc == columnDtl_usr_info14) doDtl_usr_info14_LC(info);
		else if (lc == columnDtl_usr_info15) doDtl_usr_info15_LC(info);
		else if (lc == columnDtl_usr_info16) doDtl_usr_info16_LC(info);
		else if (lc == columnDtl_usr_info17) doDtl_usr_info17_LC(info);
		else if (lc == columnDtl_usr_info18) doDtl_usr_info18_LC(info);
		else if (lc == columnDtl_usr_info19) doDtl_usr_info19_LC(info);
		else if (lc == columnDtl_usr_info20) doDtl_usr_info20_LC(info);
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
		else if (lc == columnLcl_usr_cd) doLcl_usr_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_usr_nm) doLcl_usr_nm_LC(info);
		else if (lc == columnLcl_usr_alt_nm1) doLcl_usr_alt_nm1_LC(info);
		else if (lc == columnLcl_usr_alt_nm2) doLcl_usr_alt_nm2_LC(info);
		else if (lc == columnLcl_usr_alt_nm3) doLcl_usr_alt_nm3_LC(info);
		else if (lc == columnLcl_usr_alt_nm4) doLcl_usr_alt_nm4_LC(info);
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
	 * [Dtl]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[email3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_email3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_com]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_com_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info11_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info12_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info13_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info14_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info15_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info16_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info17_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info18_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info19_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[usr_info20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_usr_info20_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[usr_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_usr_alt_nm4_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[columnDtl_usr_cd]の作成メソッド
	 */
	public MCList getDtl_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientFSUA.FSUAP0010.FSUAP_List)MCListLogic.create("mcframe.clientFSUA.FSUAP0010.FSUAP_List", this)).getUser(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_usr_com_typ]の作成メソッド
	 */
	public MCList getDtl_usr_com_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsrComTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wk_cost_cd]の作成メソッド
	 */
	public MCList getDtl_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0240.Srch01")) {
			return new MA_MABCL0240_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0240.Upd01")) {
			return new MA_MABCL0240_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0240.Del01")) {
			return new MA_MABCL0240_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0240_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0240_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0240_Srch01Bridge() {
			p_MA_MABCL0240_Srch01 = new MCParam(PDef.MA_MABCL0240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0240.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0240.LclR.class));

			p_MA_MABCL0240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0240_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0240.CndR up0() {
			return (mcframe.clientMABC.MABCP0240.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0240.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0240.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0240.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0240.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0240_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0240.DtlR.class));
			p_MA_MABCL0240_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0240.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0240_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0240.DtlR>)p_MA_MABCL0240_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0240.LclR>)p_MA_MABCL0240_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABCL0240_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0240_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0240_Upd01Bridge() {
			p_MA_MABCL0240_Upd01 = new MCParam(PDef.MA_MABCL0240_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0240_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0240.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0240.LclR.class));
			// Down

			p_MA_MABCL0240_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0240_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0240_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0240_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0240_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0240_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0240.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0240.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0240.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0240.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0240_Upd01;
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
	 * [MA_MABCL0240_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0240_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0240_Del01;

		/** コンストラクタ */
		protected MA_MABCL0240_Del01Bridge() {
			p_MA_MABCL0240_Del01 = new MCParam(PDef.MA_MABCL0240_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0240_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0240.DtlR.class));
			// Down

			p_MA_MABCL0240_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0240_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0240_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0240_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0240_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0240.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0240.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0240_Del01;
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