package mcframe.clientMBBC.MBBCP0010;

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
import mcframe.clientMBBC.MBBCP0010.MBBCP_AttachmentSrch_MC.MB_MBBCL0010_Srch01Caller;

/**
 * 画面"MBBCP_AttachmentSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBCP_AttachmentSrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBCP0010";

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
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_biz_typ_Label = null;
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_biz_typ = null;
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public MCTextField Cnd_biz_typ_nm = null;
	public MCLabel Cnd_report_id_Label = null;
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_report_id = null;
	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public MCTextField Cnd_report_nm = null;
	public MCLabel Cnd_file_nm_Label = null;
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public MCTextField Cnd_file_nm = null;
	public MCLabel Cnd_dt_fr_Label = null;
	/**
	 * Transaction date FROM 取引年月日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_dt_fr = null;
	public MCLabel Cnd_dt_to_Label = null;
	/**
	 * Transaction date TO 取引年月日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_dt_to = null;
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
	public MCLabel Cnd_amt_fr_Label = null;
	/**
	 * Transaction amount FROM 取引金額ＦＲＯＭ.<p>
	 *
	 */
	public MCNumberField Cnd_amt_fr = null;
	public MCLabel Cnd_amt_to_Label = null;
	/**
	 * Transaction amount TO 取引金額ＴＯ.<p>
	 *
	 */
	public MCNumberField Cnd_amt_to = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	public MCLabel Cnd_data_no_Label = null;
	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_data_no = null;
	public MCLabel Cnd_data_crud_typ_Label = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_data_crud_typ = null;
	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public MCTextField Cnd_data_crud_typ_nm = null;
	/**
	 * Display data before correction 訂正前データ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_old_flg = null;
	public MCLabel Cnd_biz_key1_Label = null;
	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public MCTextField Cnd_biz_key1 = null;
	public MCLabel Cnd_biz_key2_Label = null;
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public MCTextField Cnd_biz_key2 = null;
	public MCLabel Cnd_biz_key3_Label = null;
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public MCTextField Cnd_biz_key3 = null;
	public MCLabel Cnd_biz_key4_Label = null;
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public MCTextField Cnd_biz_key4 = null;
	public MCLabel Cnd_biz_key5_Label = null;
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public MCTextField Cnd_biz_key5 = null;
	public MCLabel Cnd_biz_key6_Label = null;
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public MCTextField Cnd_biz_key6 = null;
	public MCLabel Cnd_biz_key7_Label = null;
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public MCTextField Cnd_biz_key7 = null;
	public MCLabel Cnd_biz_key8_Label = null;
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public MCTextField Cnd_biz_key8 = null;
	public MCLabel Cnd_biz_key9_Label = null;
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public MCTextField Cnd_biz_key9 = null;
	public MCLabel Cnd_biz_key10_Label = null;
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public MCTextField Cnd_biz_key10 = null;
	public MCLabel Cnd_rmrks1_Label = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCTextField Cnd_rmrks1 = null;
	public MCLabel Cnd_rmrks2_Label = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCTextField Cnd_rmrks2 = null;
	public MCLabel Cnd_rmrks3_Label = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCTextField Cnd_rmrks3 = null;
	public MCLabel Cnd_rmrks4_Label = null;
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public MCTextField Cnd_rmrks4 = null;
	public MCLabel Cnd_rmrks5_Label = null;
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public MCTextField Cnd_rmrks5 = null;
	public MCLabel Cnd_rpt_attr1_Label = null;
	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr1 = null;
	public MCLabel Cnd_rpt_attr2_Label = null;
	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr2 = null;
	public MCLabel Cnd_rpt_attr3_Label = null;
	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr3 = null;
	public MCLabel Cnd_rpt_attr4_Label = null;
	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr4 = null;
	public MCLabel Cnd_rpt_attr5_Label = null;
	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr5 = null;
	public MCLabel Cnd_rpt_attr6_Label = null;
	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr6 = null;
	public MCLabel Cnd_rpt_attr7_Label = null;
	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr7 = null;
	public MCLabel Cnd_rpt_attr8_Label = null;
	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr8 = null;
	public MCLabel Cnd_rpt_attr9_Label = null;
	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr9 = null;
	public MCLabel Cnd_rpt_attr10_Label = null;
	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr10 = null;
	public MCLabel Cnd_rpt_attr11_Label = null;
	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr11 = null;
	public MCLabel Cnd_rpt_attr12_Label = null;
	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr12 = null;
	public MCLabel Cnd_rpt_attr13_Label = null;
	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr13 = null;
	public MCLabel Cnd_rpt_attr14_Label = null;
	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr14 = null;
	public MCLabel Cnd_rpt_attr15_Label = null;
	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr15 = null;
	public MCLabel Cnd_rpt_attr16_Label = null;
	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr16 = null;
	public MCLabel Cnd_rpt_attr17_Label = null;
	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr17 = null;
	public MCLabel Cnd_rpt_attr18_Label = null;
	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr18 = null;
	public MCLabel Cnd_rpt_attr19_Label = null;
	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr19 = null;
	public MCLabel Cnd_rpt_attr20_Label = null;
	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public MCTextField Cnd_rpt_attr20 = null;
	public mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S Cnd_bp_grp_PPanel;
	public MCLabel Cnd_bp_grp_lab1;	// [Cnd]の[bp_grp.bp_grp_lab1]を[Cnd_bp_grp_lab1]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg1;	// [Cnd]の[bp_grp.bp_grp_flg1]を[Cnd_bp_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd1;	// [Cnd]の[bp_grp.bp_grp_cd1]を[Cnd_bp_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm1;	// [Cnd]の[bp_grp.bp_grp_nm1]を[Cnd_bp_grp_nm1]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab2;	// [Cnd]の[bp_grp.bp_grp_lab2]を[Cnd_bp_grp_lab2]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg2;	// [Cnd]の[bp_grp.bp_grp_flg2]を[Cnd_bp_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd2;	// [Cnd]の[bp_grp.bp_grp_cd2]を[Cnd_bp_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm2;	// [Cnd]の[bp_grp.bp_grp_nm2]を[Cnd_bp_grp_nm2]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab3;	// [Cnd]の[bp_grp.bp_grp_lab3]を[Cnd_bp_grp_lab3]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg3;	// [Cnd]の[bp_grp.bp_grp_flg3]を[Cnd_bp_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd3;	// [Cnd]の[bp_grp.bp_grp_cd3]を[Cnd_bp_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm3;	// [Cnd]の[bp_grp.bp_grp_nm3]を[Cnd_bp_grp_nm3]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab4;	// [Cnd]の[bp_grp.bp_grp_lab4]を[Cnd_bp_grp_lab4]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg4;	// [Cnd]の[bp_grp.bp_grp_flg4]を[Cnd_bp_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd4;	// [Cnd]の[bp_grp.bp_grp_cd4]を[Cnd_bp_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm4;	// [Cnd]の[bp_grp.bp_grp_nm4]を[Cnd_bp_grp_nm4]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab5;	// [Cnd]の[bp_grp.bp_grp_lab5]を[Cnd_bp_grp_lab5]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg5;	// [Cnd]の[bp_grp.bp_grp_flg5]を[Cnd_bp_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd5;	// [Cnd]の[bp_grp.bp_grp_cd5]を[Cnd_bp_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm5;	// [Cnd]の[bp_grp.bp_grp_nm5]を[Cnd_bp_grp_nm5]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab6;	// [Cnd]の[bp_grp.bp_grp_lab6]を[Cnd_bp_grp_lab6]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg6;	// [Cnd]の[bp_grp.bp_grp_flg6]を[Cnd_bp_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd6;	// [Cnd]の[bp_grp.bp_grp_cd6]を[Cnd_bp_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm6;	// [Cnd]の[bp_grp.bp_grp_nm6]を[Cnd_bp_grp_nm6]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab7;	// [Cnd]の[bp_grp.bp_grp_lab7]を[Cnd_bp_grp_lab7]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg7;	// [Cnd]の[bp_grp.bp_grp_flg7]を[Cnd_bp_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd7;	// [Cnd]の[bp_grp.bp_grp_cd7]を[Cnd_bp_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm7;	// [Cnd]の[bp_grp.bp_grp_nm7]を[Cnd_bp_grp_nm7]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab8;	// [Cnd]の[bp_grp.bp_grp_lab8]を[Cnd_bp_grp_lab8]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg8;	// [Cnd]の[bp_grp.bp_grp_flg8]を[Cnd_bp_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd8;	// [Cnd]の[bp_grp.bp_grp_cd8]を[Cnd_bp_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm8;	// [Cnd]の[bp_grp.bp_grp_nm8]を[Cnd_bp_grp_nm8]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab9;	// [Cnd]の[bp_grp.bp_grp_lab9]を[Cnd_bp_grp_lab9]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg9;	// [Cnd]の[bp_grp.bp_grp_flg9]を[Cnd_bp_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd9;	// [Cnd]の[bp_grp.bp_grp_cd9]を[Cnd_bp_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm9;	// [Cnd]の[bp_grp.bp_grp_nm9]を[Cnd_bp_grp_nm9]としてエイリアス定義。
	public MCLabel Cnd_bp_grp_lab10;	// [Cnd]の[bp_grp.bp_grp_lab10]を[Cnd_bp_grp_lab10]としてエイリアス定義。
	public MCCheckBox Cnd_bp_grp_flg10;	// [Cnd]の[bp_grp.bp_grp_flg10]を[Cnd_bp_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_bp_grp_cd10;	// [Cnd]の[bp_grp.bp_grp_cd10]を[Cnd_bp_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_bp_grp_nm10;	// [Cnd]の[bp_grp.bp_grp_nm10]を[Cnd_bp_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd3]ブロック関連のField定義
	public MCPanel Cnd3Panel = null;
	// [Cnd3]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBC.MBBCP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
	/**
	 * Version 版.<p>
	 *
	 */
	public MCColumnConfig columnRslt_edition = null;
	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_path = null;
	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_file_nm = null;
	/**
	 * Report ID 帳票ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_report_id = null;
	/**
	 * Report name 帳票名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_report_nm = null;
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_typ = null;
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_typ_nm = null;
	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key1 = null;
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key2 = null;
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key3 = null;
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key4 = null;
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key5 = null;
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key6 = null;
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key7 = null;
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key8 = null;
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key9 = null;
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_biz_key10 = null;
	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dt = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名称.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cur_nm = null;
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_amt = null;
	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fs_flg = null;
	/**
	 * Document ID ドキュメントＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_doc_id = null;
	/**
	 * Preview URL link プレビューＵＲＬリンク.<p>
	 *
	 */
	public MCColumnConfig columnRslt_preview_url = null;
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks1 = null;
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks2 = null;
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks3 = null;
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks4 = null;
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks5 = null;
	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr1 = null;
	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr2 = null;
	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr3 = null;
	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr4 = null;
	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr5 = null;
	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr6 = null;
	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr7 = null;
	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr8 = null;
	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr9 = null;
	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr10 = null;
	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr11 = null;
	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr12 = null;
	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr13 = null;
	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr14 = null;
	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr15 = null;
	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr16 = null;
	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr17 = null;
	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr18 = null;
	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr19 = null;
	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rpt_attr20 = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_crud_typ = null;
	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_crud_typ_nm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Open 開く.<p>
	 *
	 */
	public MCButton Btn_open_file = null;
	/**
	 * Details info. 詳細情報.<p>
	 *
	 */
	public MCButton Btn_open_screen = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MB_MBBCL0010_Srch01]のCallerの作成 */
	protected MBBCP_AttachmentSrch_MC.MB_MBBCL0010_Srch01Caller createMB_MBBCL0010_Srch01() {
		MBBCP_AttachmentSrch_MC.MB_MBBCL0010_Srch01Caller<MBBCP_AttachmentSrch, MB_MBBCL0010_Srch01Bridge>
		caller = ((MBBCP_AttachmentSrch_MC)this).new MB_MBBCL0010_Srch01Caller<MBBCP_AttachmentSrch, MB_MBBCL0010_Srch01Bridge>(
					(MBBCP_AttachmentSrch)this, new MB_MBBCL0010_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBCL0010_Srch01]の呼び出し */
	protected void callMB_MBBCL0010_Srch01() {
		MCCaller caller = createMB_MBBCL0010_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBC.MBBCP0010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBC.MBBCP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBC.MBBCP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBC.MBBCP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBC.MBBCP0010.CndR createCndR() {
		return mcframe.clientMBBC.MBBCP0010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBC.MBBCP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBC.MBBCP0010.RsltR createRsltR() {
		return mcframe.clientMBBC.MBBCP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBC.MBBCP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBC.MBBCP0010.RsltR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		ret.add(Tab3Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(Cnd3Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBCP_AttachmentSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBCP_AttachmentSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBCP_AttachmentSrch_MC.jbCreateTop((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateFold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateTab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateTab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateTab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateCnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateCnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateCnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateCtrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateRslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbCreateBtn((MBBCP_AttachmentSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBCP_AttachmentSrch p) {
		p.Cnd_bp_grp_PPanel = mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.create(p.getCndR().bp_grp());
		p.Cnd_bp_grp_PPanel.setName("Cnd.bp_grp");
		p.Cnd_bp_grp_lab1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab1;
		p.Cnd_bp_grp_lab1.addAliasName("Cnd.bp_grp_lab1", p);
		p.Cnd_bp_grp_flg1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg1;
		p.Cnd_bp_grp_flg1.addAliasName("Cnd.bp_grp_flg1", p);
		p.Cnd_bp_grp_cd1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd1;
		p.Cnd_bp_grp_cd1.addAliasName("Cnd.bp_grp_cd1", p);
		p.Cnd_bp_grp_nm1 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm1;
		p.Cnd_bp_grp_nm1.addAliasName("Cnd.bp_grp_nm1", p);
		p.Cnd_bp_grp_lab2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab2;
		p.Cnd_bp_grp_lab2.addAliasName("Cnd.bp_grp_lab2", p);
		p.Cnd_bp_grp_flg2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg2;
		p.Cnd_bp_grp_flg2.addAliasName("Cnd.bp_grp_flg2", p);
		p.Cnd_bp_grp_cd2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd2;
		p.Cnd_bp_grp_cd2.addAliasName("Cnd.bp_grp_cd2", p);
		p.Cnd_bp_grp_nm2 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm2;
		p.Cnd_bp_grp_nm2.addAliasName("Cnd.bp_grp_nm2", p);
		p.Cnd_bp_grp_lab3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab3;
		p.Cnd_bp_grp_lab3.addAliasName("Cnd.bp_grp_lab3", p);
		p.Cnd_bp_grp_flg3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg3;
		p.Cnd_bp_grp_flg3.addAliasName("Cnd.bp_grp_flg3", p);
		p.Cnd_bp_grp_cd3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd3;
		p.Cnd_bp_grp_cd3.addAliasName("Cnd.bp_grp_cd3", p);
		p.Cnd_bp_grp_nm3 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm3;
		p.Cnd_bp_grp_nm3.addAliasName("Cnd.bp_grp_nm3", p);
		p.Cnd_bp_grp_lab4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab4;
		p.Cnd_bp_grp_lab4.addAliasName("Cnd.bp_grp_lab4", p);
		p.Cnd_bp_grp_flg4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg4;
		p.Cnd_bp_grp_flg4.addAliasName("Cnd.bp_grp_flg4", p);
		p.Cnd_bp_grp_cd4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd4;
		p.Cnd_bp_grp_cd4.addAliasName("Cnd.bp_grp_cd4", p);
		p.Cnd_bp_grp_nm4 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm4;
		p.Cnd_bp_grp_nm4.addAliasName("Cnd.bp_grp_nm4", p);
		p.Cnd_bp_grp_lab5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab5;
		p.Cnd_bp_grp_lab5.addAliasName("Cnd.bp_grp_lab5", p);
		p.Cnd_bp_grp_flg5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg5;
		p.Cnd_bp_grp_flg5.addAliasName("Cnd.bp_grp_flg5", p);
		p.Cnd_bp_grp_cd5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd5;
		p.Cnd_bp_grp_cd5.addAliasName("Cnd.bp_grp_cd5", p);
		p.Cnd_bp_grp_nm5 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm5;
		p.Cnd_bp_grp_nm5.addAliasName("Cnd.bp_grp_nm5", p);
		p.Cnd_bp_grp_lab6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab6;
		p.Cnd_bp_grp_lab6.addAliasName("Cnd.bp_grp_lab6", p);
		p.Cnd_bp_grp_flg6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg6;
		p.Cnd_bp_grp_flg6.addAliasName("Cnd.bp_grp_flg6", p);
		p.Cnd_bp_grp_cd6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd6;
		p.Cnd_bp_grp_cd6.addAliasName("Cnd.bp_grp_cd6", p);
		p.Cnd_bp_grp_nm6 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm6;
		p.Cnd_bp_grp_nm6.addAliasName("Cnd.bp_grp_nm6", p);
		p.Cnd_bp_grp_lab7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab7;
		p.Cnd_bp_grp_lab7.addAliasName("Cnd.bp_grp_lab7", p);
		p.Cnd_bp_grp_flg7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg7;
		p.Cnd_bp_grp_flg7.addAliasName("Cnd.bp_grp_flg7", p);
		p.Cnd_bp_grp_cd7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd7;
		p.Cnd_bp_grp_cd7.addAliasName("Cnd.bp_grp_cd7", p);
		p.Cnd_bp_grp_nm7 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm7;
		p.Cnd_bp_grp_nm7.addAliasName("Cnd.bp_grp_nm7", p);
		p.Cnd_bp_grp_lab8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab8;
		p.Cnd_bp_grp_lab8.addAliasName("Cnd.bp_grp_lab8", p);
		p.Cnd_bp_grp_flg8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg8;
		p.Cnd_bp_grp_flg8.addAliasName("Cnd.bp_grp_flg8", p);
		p.Cnd_bp_grp_cd8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd8;
		p.Cnd_bp_grp_cd8.addAliasName("Cnd.bp_grp_cd8", p);
		p.Cnd_bp_grp_nm8 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm8;
		p.Cnd_bp_grp_nm8.addAliasName("Cnd.bp_grp_nm8", p);
		p.Cnd_bp_grp_lab9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab9;
		p.Cnd_bp_grp_lab9.addAliasName("Cnd.bp_grp_lab9", p);
		p.Cnd_bp_grp_flg9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg9;
		p.Cnd_bp_grp_flg9.addAliasName("Cnd.bp_grp_flg9", p);
		p.Cnd_bp_grp_cd9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd9;
		p.Cnd_bp_grp_cd9.addAliasName("Cnd.bp_grp_cd9", p);
		p.Cnd_bp_grp_nm9 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm9;
		p.Cnd_bp_grp_nm9.addAliasName("Cnd.bp_grp_nm9", p);
		p.Cnd_bp_grp_lab10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_lab10;
		p.Cnd_bp_grp_lab10.addAliasName("Cnd.bp_grp_lab10", p);
		p.Cnd_bp_grp_flg10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_flg10;
		p.Cnd_bp_grp_flg10.addAliasName("Cnd.bp_grp_flg10", p);
		p.Cnd_bp_grp_cd10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_cd10;
		p.Cnd_bp_grp_cd10.addAliasName("Cnd.bp_grp_cd10", p);
		p.Cnd_bp_grp_nm10 = p.Cnd_bp_grp_PPanel.BpGrp_bp_grp_nm10;
		p.Cnd_bp_grp_nm10.addAliasName("Cnd.bp_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Cnd3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd3(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBCP_AttachmentSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBCP_AttachmentSrch p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MBBCP_AttachmentSrch p) {
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

	
	/** [Cnd_biz_typ_ListPutter]の定義 */
	private MCListPutter Cnd_biz_typ_p = null;

	/**
	 * [Cnd_biz_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_biz_typ_ListPutter() {
		if (Cnd_biz_typ_p == null) {
			Cnd_biz_typ_p = createCnd_biz_typ_ListPutter(Cnd_biz_typ, "biz_typ", "biz_typ_nm");

		}
		return Cnd_biz_typ_p;
	}
	
	
	/** [Cnd_report_id_ListPutter]の定義 */
	private MCListPutter Cnd_report_id_p = null;

	/**
	 * [Cnd_report_id_ListPutter]の取得
	 */
	protected MCListPutter getCnd_report_id_ListPutter() {
		if (Cnd_report_id_p == null) {
			Cnd_report_id_p = createCnd_report_id_ListPutter(Cnd_report_id, "report_id", "report_nm");

		}
		return Cnd_report_id_p;
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
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	
	
	/** [Cnd_data_crud_typ_ListPutter]の定義 */
	private MCListPutter Cnd_data_crud_typ_p = null;

	/**
	 * [Cnd_data_crud_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_data_crud_typ_ListPutter() {
		if (Cnd_data_crud_typ_p == null) {
			Cnd_data_crud_typ_p = createCnd_data_crud_typ_ListPutter(Cnd_data_crud_typ, "data_crud_typ", "data_crud_typ_nm");

		}
		return Cnd_data_crud_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBCP_AttachmentSrch create(){
		MBBCP_AttachmentSrch p = new MBBCP_AttachmentSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBCP_AttachmentSrch create(String name){
		MBBCP_AttachmentSrch p = new MBBCP_AttachmentSrch(name);
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
		MBBCP_AttachmentSrch_MC.jbfInitTop((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitFold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitTab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitTab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitTab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitCnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitCnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitCnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitCtrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitRslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbfInitBtn((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitTop((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitFold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitTab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitTab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitTab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitCnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitCnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitCnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitCtrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitRslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.jbInitBtn((MBBCP_AttachmentSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBCP_AttachmentSrch p) {
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
	protected static void jbfInitTab1(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_biz_typ_Label = p.beansFactory.createLabel("Cnd.biz_typ_Label");
		p.Cnd_biz_typ = p.beansFactory.createTextComboBox("Cnd.biz_typ");
		p.Cnd_biz_typ.setLabel(p.Cnd_biz_typ_Label);
		p.Cnd_biz_typ_nm = p.beansFactory.createTextField("Cnd.biz_typ_nm");
		p.Cnd_report_id_Label = p.beansFactory.createLabel("Cnd.report_id_Label");
		p.Cnd_report_id = p.beansFactory.createTextComboBox("Cnd.report_id");
		p.Cnd_report_id.setLabel(p.Cnd_report_id_Label);
		p.Cnd_report_nm = p.beansFactory.createTextField("Cnd.report_nm");
		p.Cnd_file_nm_Label = p.beansFactory.createLabel("Cnd.file_nm_Label");
		p.Cnd_file_nm = p.beansFactory.createTextField("Cnd.file_nm");
		p.Cnd_file_nm.setLabel(p.Cnd_file_nm_Label);
		p.Cnd_dt_fr_Label = p.beansFactory.createLabel("Cnd.dt_fr_Label");
		p.Cnd_dt_fr = p.beansFactory.createDateField("Cnd.dt_fr");
		p.Cnd_dt_fr.setLabel(p.Cnd_dt_fr_Label);
		p.Cnd_dt_to_Label = p.beansFactory.createLabel("Cnd.dt_to_Label");
		p.Cnd_dt_to = p.beansFactory.createDateField("Cnd.dt_to");
		p.Cnd_dt_to.setLabel(p.Cnd_dt_to_Label);
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_amt_fr_Label = p.beansFactory.createLabel("Cnd.amt_fr_Label");
		p.Cnd_amt_fr = p.beansFactory.createNumberField("Cnd.amt_fr");
		p.Cnd_amt_fr.setLabel(p.Cnd_amt_fr_Label);
		p.Cnd_amt_to_Label = p.beansFactory.createLabel("Cnd.amt_to_Label");
		p.Cnd_amt_to = p.beansFactory.createNumberField("Cnd.amt_to");
		p.Cnd_amt_to.setLabel(p.Cnd_amt_to_Label);
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_data_no_Label = p.beansFactory.createLabel("Cnd.data_no_Label");
		p.Cnd_data_no = p.beansFactory.createTextField("Cnd.data_no");
		p.Cnd_data_no.setLabel(p.Cnd_data_no_Label);
		p.Cnd_data_crud_typ_Label = p.beansFactory.createLabel("Cnd.data_crud_typ_Label");
		p.Cnd_data_crud_typ = p.beansFactory.createTextComboBox("Cnd.data_crud_typ");
		p.Cnd_data_crud_typ.setLabel(p.Cnd_data_crud_typ_Label);
		p.Cnd_data_crud_typ_nm = p.beansFactory.createTextField("Cnd.data_crud_typ_nm");
		p.Cnd_disp_old_flg = p.beansFactory.createCheckBox("Cnd.disp_old_flg");
		p.Cnd_biz_key1_Label = p.beansFactory.createLabel("Cnd.biz_key1_Label");
		p.Cnd_biz_key1 = p.beansFactory.createTextField("Cnd.biz_key1");
		p.Cnd_biz_key1.setLabel(p.Cnd_biz_key1_Label);
		p.Cnd_biz_key2_Label = p.beansFactory.createLabel("Cnd.biz_key2_Label");
		p.Cnd_biz_key2 = p.beansFactory.createTextField("Cnd.biz_key2");
		p.Cnd_biz_key2.setLabel(p.Cnd_biz_key2_Label);
		p.Cnd_biz_key3_Label = p.beansFactory.createLabel("Cnd.biz_key3_Label");
		p.Cnd_biz_key3 = p.beansFactory.createTextField("Cnd.biz_key3");
		p.Cnd_biz_key3.setLabel(p.Cnd_biz_key3_Label);
		p.Cnd_biz_key4_Label = p.beansFactory.createLabel("Cnd.biz_key4_Label");
		p.Cnd_biz_key4 = p.beansFactory.createTextField("Cnd.biz_key4");
		p.Cnd_biz_key4.setLabel(p.Cnd_biz_key4_Label);
		p.Cnd_biz_key5_Label = p.beansFactory.createLabel("Cnd.biz_key5_Label");
		p.Cnd_biz_key5 = p.beansFactory.createTextField("Cnd.biz_key5");
		p.Cnd_biz_key5.setLabel(p.Cnd_biz_key5_Label);
		p.Cnd_biz_key6_Label = p.beansFactory.createLabel("Cnd.biz_key6_Label");
		p.Cnd_biz_key6 = p.beansFactory.createTextField("Cnd.biz_key6");
		p.Cnd_biz_key6.setLabel(p.Cnd_biz_key6_Label);
		p.Cnd_biz_key7_Label = p.beansFactory.createLabel("Cnd.biz_key7_Label");
		p.Cnd_biz_key7 = p.beansFactory.createTextField("Cnd.biz_key7");
		p.Cnd_biz_key7.setLabel(p.Cnd_biz_key7_Label);
		p.Cnd_biz_key8_Label = p.beansFactory.createLabel("Cnd.biz_key8_Label");
		p.Cnd_biz_key8 = p.beansFactory.createTextField("Cnd.biz_key8");
		p.Cnd_biz_key8.setLabel(p.Cnd_biz_key8_Label);
		p.Cnd_biz_key9_Label = p.beansFactory.createLabel("Cnd.biz_key9_Label");
		p.Cnd_biz_key9 = p.beansFactory.createTextField("Cnd.biz_key9");
		p.Cnd_biz_key9.setLabel(p.Cnd_biz_key9_Label);
		p.Cnd_biz_key10_Label = p.beansFactory.createLabel("Cnd.biz_key10_Label");
		p.Cnd_biz_key10 = p.beansFactory.createTextField("Cnd.biz_key10");
		p.Cnd_biz_key10.setLabel(p.Cnd_biz_key10_Label);
		p.Cnd_rmrks1_Label = p.beansFactory.createLabel("Cnd.rmrks1_Label");
		p.Cnd_rmrks1 = p.beansFactory.createTextField("Cnd.rmrks1");
		p.Cnd_rmrks1.setLabel(p.Cnd_rmrks1_Label);
		p.Cnd_rmrks2_Label = p.beansFactory.createLabel("Cnd.rmrks2_Label");
		p.Cnd_rmrks2 = p.beansFactory.createTextField("Cnd.rmrks2");
		p.Cnd_rmrks2.setLabel(p.Cnd_rmrks2_Label);
		p.Cnd_rmrks3_Label = p.beansFactory.createLabel("Cnd.rmrks3_Label");
		p.Cnd_rmrks3 = p.beansFactory.createTextField("Cnd.rmrks3");
		p.Cnd_rmrks3.setLabel(p.Cnd_rmrks3_Label);
		p.Cnd_rmrks4_Label = p.beansFactory.createLabel("Cnd.rmrks4_Label");
		p.Cnd_rmrks4 = p.beansFactory.createTextField("Cnd.rmrks4");
		p.Cnd_rmrks4.setLabel(p.Cnd_rmrks4_Label);
		p.Cnd_rmrks5_Label = p.beansFactory.createLabel("Cnd.rmrks5_Label");
		p.Cnd_rmrks5 = p.beansFactory.createTextField("Cnd.rmrks5");
		p.Cnd_rmrks5.setLabel(p.Cnd_rmrks5_Label);
		p.Cnd_rpt_attr1_Label = p.beansFactory.createLabel("Cnd.rpt_attr1_Label");
		p.Cnd_rpt_attr1 = p.beansFactory.createTextField("Cnd.rpt_attr1");
		p.Cnd_rpt_attr1.setLabel(p.Cnd_rpt_attr1_Label);
		p.Cnd_rpt_attr2_Label = p.beansFactory.createLabel("Cnd.rpt_attr2_Label");
		p.Cnd_rpt_attr2 = p.beansFactory.createTextField("Cnd.rpt_attr2");
		p.Cnd_rpt_attr2.setLabel(p.Cnd_rpt_attr2_Label);
		p.Cnd_rpt_attr3_Label = p.beansFactory.createLabel("Cnd.rpt_attr3_Label");
		p.Cnd_rpt_attr3 = p.beansFactory.createTextField("Cnd.rpt_attr3");
		p.Cnd_rpt_attr3.setLabel(p.Cnd_rpt_attr3_Label);
		p.Cnd_rpt_attr4_Label = p.beansFactory.createLabel("Cnd.rpt_attr4_Label");
		p.Cnd_rpt_attr4 = p.beansFactory.createTextField("Cnd.rpt_attr4");
		p.Cnd_rpt_attr4.setLabel(p.Cnd_rpt_attr4_Label);
		p.Cnd_rpt_attr5_Label = p.beansFactory.createLabel("Cnd.rpt_attr5_Label");
		p.Cnd_rpt_attr5 = p.beansFactory.createTextField("Cnd.rpt_attr5");
		p.Cnd_rpt_attr5.setLabel(p.Cnd_rpt_attr5_Label);
		p.Cnd_rpt_attr6_Label = p.beansFactory.createLabel("Cnd.rpt_attr6_Label");
		p.Cnd_rpt_attr6 = p.beansFactory.createTextField("Cnd.rpt_attr6");
		p.Cnd_rpt_attr6.setLabel(p.Cnd_rpt_attr6_Label);
		p.Cnd_rpt_attr7_Label = p.beansFactory.createLabel("Cnd.rpt_attr7_Label");
		p.Cnd_rpt_attr7 = p.beansFactory.createTextField("Cnd.rpt_attr7");
		p.Cnd_rpt_attr7.setLabel(p.Cnd_rpt_attr7_Label);
		p.Cnd_rpt_attr8_Label = p.beansFactory.createLabel("Cnd.rpt_attr8_Label");
		p.Cnd_rpt_attr8 = p.beansFactory.createTextField("Cnd.rpt_attr8");
		p.Cnd_rpt_attr8.setLabel(p.Cnd_rpt_attr8_Label);
		p.Cnd_rpt_attr9_Label = p.beansFactory.createLabel("Cnd.rpt_attr9_Label");
		p.Cnd_rpt_attr9 = p.beansFactory.createTextField("Cnd.rpt_attr9");
		p.Cnd_rpt_attr9.setLabel(p.Cnd_rpt_attr9_Label);
		p.Cnd_rpt_attr10_Label = p.beansFactory.createLabel("Cnd.rpt_attr10_Label");
		p.Cnd_rpt_attr10 = p.beansFactory.createTextField("Cnd.rpt_attr10");
		p.Cnd_rpt_attr10.setLabel(p.Cnd_rpt_attr10_Label);
		p.Cnd_rpt_attr11_Label = p.beansFactory.createLabel("Cnd.rpt_attr11_Label");
		p.Cnd_rpt_attr11 = p.beansFactory.createTextField("Cnd.rpt_attr11");
		p.Cnd_rpt_attr11.setLabel(p.Cnd_rpt_attr11_Label);
		p.Cnd_rpt_attr12_Label = p.beansFactory.createLabel("Cnd.rpt_attr12_Label");
		p.Cnd_rpt_attr12 = p.beansFactory.createTextField("Cnd.rpt_attr12");
		p.Cnd_rpt_attr12.setLabel(p.Cnd_rpt_attr12_Label);
		p.Cnd_rpt_attr13_Label = p.beansFactory.createLabel("Cnd.rpt_attr13_Label");
		p.Cnd_rpt_attr13 = p.beansFactory.createTextField("Cnd.rpt_attr13");
		p.Cnd_rpt_attr13.setLabel(p.Cnd_rpt_attr13_Label);
		p.Cnd_rpt_attr14_Label = p.beansFactory.createLabel("Cnd.rpt_attr14_Label");
		p.Cnd_rpt_attr14 = p.beansFactory.createTextField("Cnd.rpt_attr14");
		p.Cnd_rpt_attr14.setLabel(p.Cnd_rpt_attr14_Label);
		p.Cnd_rpt_attr15_Label = p.beansFactory.createLabel("Cnd.rpt_attr15_Label");
		p.Cnd_rpt_attr15 = p.beansFactory.createTextField("Cnd.rpt_attr15");
		p.Cnd_rpt_attr15.setLabel(p.Cnd_rpt_attr15_Label);
		p.Cnd_rpt_attr16_Label = p.beansFactory.createLabel("Cnd.rpt_attr16_Label");
		p.Cnd_rpt_attr16 = p.beansFactory.createTextField("Cnd.rpt_attr16");
		p.Cnd_rpt_attr16.setLabel(p.Cnd_rpt_attr16_Label);
		p.Cnd_rpt_attr17_Label = p.beansFactory.createLabel("Cnd.rpt_attr17_Label");
		p.Cnd_rpt_attr17 = p.beansFactory.createTextField("Cnd.rpt_attr17");
		p.Cnd_rpt_attr17.setLabel(p.Cnd_rpt_attr17_Label);
		p.Cnd_rpt_attr18_Label = p.beansFactory.createLabel("Cnd.rpt_attr18_Label");
		p.Cnd_rpt_attr18 = p.beansFactory.createTextField("Cnd.rpt_attr18");
		p.Cnd_rpt_attr18.setLabel(p.Cnd_rpt_attr18_Label);
		p.Cnd_rpt_attr19_Label = p.beansFactory.createLabel("Cnd.rpt_attr19_Label");
		p.Cnd_rpt_attr19 = p.beansFactory.createTextField("Cnd.rpt_attr19");
		p.Cnd_rpt_attr19.setLabel(p.Cnd_rpt_attr19_Label);
		p.Cnd_rpt_attr20_Label = p.beansFactory.createLabel("Cnd.rpt_attr20_Label");
		p.Cnd_rpt_attr20 = p.beansFactory.createTextField("Cnd.rpt_attr20");
		p.Cnd_rpt_attr20.setLabel(p.Cnd_rpt_attr20_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd3(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel = p.beansFactory.createPanel("Cnd3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.TEXT);
		p.columnRslt_edition = p.beansFactory.createTableColumn("Rslt.edition", MCColumnType.NUMBER);
		p.columnRslt_file_path = p.beansFactory.createTableColumn("Rslt.file_path", MCColumnType.TEXT);
		p.columnRslt_file_nm = p.beansFactory.createTableColumn("Rslt.file_nm", MCColumnType.TEXT);
		p.columnRslt_report_id = p.beansFactory.createTableColumn("Rslt.report_id", MCColumnType.TEXT);
		p.columnRslt_report_nm = p.beansFactory.createTableColumn("Rslt.report_nm", MCColumnType.TEXT);
		p.columnRslt_biz_typ = p.beansFactory.createTableColumn("Rslt.biz_typ", MCColumnType.TEXT);
		p.columnRslt_biz_typ_nm = p.beansFactory.createTableColumn("Rslt.biz_typ_nm", MCColumnType.TEXT);
		p.columnRslt_biz_key1 = p.beansFactory.createTableColumn("Rslt.biz_key1", MCColumnType.TEXT);
		p.columnRslt_biz_key2 = p.beansFactory.createTableColumn("Rslt.biz_key2", MCColumnType.TEXT);
		p.columnRslt_biz_key3 = p.beansFactory.createTableColumn("Rslt.biz_key3", MCColumnType.TEXT);
		p.columnRslt_biz_key4 = p.beansFactory.createTableColumn("Rslt.biz_key4", MCColumnType.TEXT);
		p.columnRslt_biz_key5 = p.beansFactory.createTableColumn("Rslt.biz_key5", MCColumnType.TEXT);
		p.columnRslt_biz_key6 = p.beansFactory.createTableColumn("Rslt.biz_key6", MCColumnType.TEXT);
		p.columnRslt_biz_key7 = p.beansFactory.createTableColumn("Rslt.biz_key7", MCColumnType.TEXT);
		p.columnRslt_biz_key8 = p.beansFactory.createTableColumn("Rslt.biz_key8", MCColumnType.TEXT);
		p.columnRslt_biz_key9 = p.beansFactory.createTableColumn("Rslt.biz_key9", MCColumnType.TEXT);
		p.columnRslt_biz_key10 = p.beansFactory.createTableColumn("Rslt.biz_key10", MCColumnType.TEXT);
		p.columnRslt_dt = p.beansFactory.createTableColumn("Rslt.dt", MCColumnType.DATE);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_cur_cd = p.beansFactory.createTableColumn("Rslt.cur_cd", MCColumnType.TEXT);
		p.columnRslt_cur_nm = p.beansFactory.createTableColumn("Rslt.cur_nm", MCColumnType.TEXT);
		p.columnRslt_amt = p.beansFactory.createTableColumn("Rslt.amt", MCColumnType.NUMBER);
		p.columnRslt_fs_flg = p.beansFactory.createTableColumn("Rslt.fs_flg", MCColumnType.CHECK);
		p.columnRslt_doc_id = p.beansFactory.createTableColumn("Rslt.doc_id", MCColumnType.TEXT);
		p.columnRslt_preview_url = p.beansFactory.createTableColumn("Rslt.preview_url", MCColumnType.TEXT);
		p.columnRslt_rmrks1 = p.beansFactory.createTableColumn("Rslt.rmrks1", MCColumnType.TEXT);
		p.columnRslt_rmrks2 = p.beansFactory.createTableColumn("Rslt.rmrks2", MCColumnType.TEXT);
		p.columnRslt_rmrks3 = p.beansFactory.createTableColumn("Rslt.rmrks3", MCColumnType.TEXT);
		p.columnRslt_rmrks4 = p.beansFactory.createTableColumn("Rslt.rmrks4", MCColumnType.TEXT);
		p.columnRslt_rmrks5 = p.beansFactory.createTableColumn("Rslt.rmrks5", MCColumnType.TEXT);
		p.columnRslt_rpt_attr1 = p.beansFactory.createTableColumn("Rslt.rpt_attr1", MCColumnType.TEXT);
		p.columnRslt_rpt_attr2 = p.beansFactory.createTableColumn("Rslt.rpt_attr2", MCColumnType.TEXT);
		p.columnRslt_rpt_attr3 = p.beansFactory.createTableColumn("Rslt.rpt_attr3", MCColumnType.TEXT);
		p.columnRslt_rpt_attr4 = p.beansFactory.createTableColumn("Rslt.rpt_attr4", MCColumnType.TEXT);
		p.columnRslt_rpt_attr5 = p.beansFactory.createTableColumn("Rslt.rpt_attr5", MCColumnType.TEXT);
		p.columnRslt_rpt_attr6 = p.beansFactory.createTableColumn("Rslt.rpt_attr6", MCColumnType.TEXT);
		p.columnRslt_rpt_attr7 = p.beansFactory.createTableColumn("Rslt.rpt_attr7", MCColumnType.TEXT);
		p.columnRslt_rpt_attr8 = p.beansFactory.createTableColumn("Rslt.rpt_attr8", MCColumnType.TEXT);
		p.columnRslt_rpt_attr9 = p.beansFactory.createTableColumn("Rslt.rpt_attr9", MCColumnType.TEXT);
		p.columnRslt_rpt_attr10 = p.beansFactory.createTableColumn("Rslt.rpt_attr10", MCColumnType.TEXT);
		p.columnRslt_rpt_attr11 = p.beansFactory.createTableColumn("Rslt.rpt_attr11", MCColumnType.TEXT);
		p.columnRslt_rpt_attr12 = p.beansFactory.createTableColumn("Rslt.rpt_attr12", MCColumnType.TEXT);
		p.columnRslt_rpt_attr13 = p.beansFactory.createTableColumn("Rslt.rpt_attr13", MCColumnType.TEXT);
		p.columnRslt_rpt_attr14 = p.beansFactory.createTableColumn("Rslt.rpt_attr14", MCColumnType.TEXT);
		p.columnRslt_rpt_attr15 = p.beansFactory.createTableColumn("Rslt.rpt_attr15", MCColumnType.TEXT);
		p.columnRslt_rpt_attr16 = p.beansFactory.createTableColumn("Rslt.rpt_attr16", MCColumnType.TEXT);
		p.columnRslt_rpt_attr17 = p.beansFactory.createTableColumn("Rslt.rpt_attr17", MCColumnType.TEXT);
		p.columnRslt_rpt_attr18 = p.beansFactory.createTableColumn("Rslt.rpt_attr18", MCColumnType.TEXT);
		p.columnRslt_rpt_attr19 = p.beansFactory.createTableColumn("Rslt.rpt_attr19", MCColumnType.TEXT);
		p.columnRslt_rpt_attr20 = p.beansFactory.createTableColumn("Rslt.rpt_attr20", MCColumnType.TEXT);
		p.columnRslt_data_crud_typ = p.beansFactory.createTableColumn("Rslt.data_crud_typ", MCColumnType.TEXT);
		p.columnRslt_data_crud_typ_nm = p.beansFactory.createTableColumn("Rslt.data_crud_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_file = p.beansFactory.createButton("Btn.open_file", "open");
		p.Btn_open_screen = p.beansFactory.createButton("Btn.open_screen", "open");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
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
	protected static void jbInitFold(MBBCP_AttachmentSrch p) {
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
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.FoldTab.add(p.Tab3Panel, "Fold.tab3");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Tab3Panel.setValueCheck(false);
		p.Tab3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab3Panel.add(p.Cnd3Panel, null);
		p.Tab3Panel.setLastBeans(p.Cnd3Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Cnd_biz_typ.setListType(MCListType.STRICT);
		p.Cnd_biz_typ.setLinkBeans(p.Cnd_biz_typ_nm);
		p.CndPanel.add(p.Cnd_biz_typ_Label);
		p.CndPanel.add(p.Cnd_biz_typ);
		p.CndPanel.setLastBeans(p.Cnd_biz_typ);
		p.Cnd_biz_typ.setNextBeans(p.Cnd_biz_typ_nm);
		p.Cnd_biz_typ.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_typ_META);
		p.CndPanel.add(p.Cnd_biz_typ_nm);
		p.Cnd_biz_typ_nm.setNextBeans(p.Cnd_report_id);
		p.Cnd_biz_typ_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_typ_nm_META);
		p.Cnd_report_id.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_report_id, true);
		p.Cnd_report_id.setLinkBeans(p.Cnd_report_nm);
		p.CndPanel.add(p.Cnd_report_id_Label);
		p.CndPanel.add(p.Cnd_report_id);
		p.Cnd_report_id.setNextBeans(p.Cnd_report_nm);
		p.Cnd_report_id.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.report_id_META);
		p.CndPanel.add(p.Cnd_report_nm);
		p.Cnd_report_nm.setNextBeans(p.Cnd_file_nm);
		p.Cnd_report_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.report_nm_META);
		p.CndPanel.add(p.Cnd_file_nm_Label);
		p.CndPanel.add(p.Cnd_file_nm);
		p.Cnd_file_nm.setNextBeans(p.Cnd_dt_fr);
		p.Cnd_file_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.file_nm_META);
		p.setPluralValueEnable(p.Cnd_file_nm, true);
		p.CndPanel.add(p.Cnd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_dt_fr);
		p.Cnd_dt_fr.setNextBeans(p.Cnd_dt_to);
		p.Cnd_dt_fr.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.dt_fr_META);
		p.Cnd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_dt_to_Label);
		p.CndPanel.add(p.Cnd_dt_to);
		p.Cnd_dt_to.setNextBeans(p.Cnd_bp_cd);
		p.Cnd_dt_to.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.dt_to_META);
		p.Cnd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_amt_fr);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.CndPanel.add(p.Cnd_amt_fr_Label);
		p.CndPanel.add(p.Cnd_amt_fr);
		p.Cnd_amt_fr.setNextBeans(p.Cnd_amt_to);
		p.Cnd_amt_fr.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.amt_fr_META);
		p.Cnd_amt_fr.setMinusEnable(true);
		p.CndPanel.add(p.Cnd_amt_to_Label);
		p.CndPanel.add(p.Cnd_amt_to);
		p.Cnd_amt_to.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_amt_to.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.amt_to_META);
		p.Cnd_amt_to.setMinusEnable(true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.CndPanel.add(p.Cnd_cur_cd_Label);
		p.CndPanel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.cur_cd_META);
		p.CndPanel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_data_no);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.cur_nm_META);
		p.CndPanel.add(p.Cnd_data_no_Label);
		p.CndPanel.add(p.Cnd_data_no);
		p.Cnd_data_no.setNextBeans(p.Cnd_data_crud_typ);
		p.Cnd_data_no.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.data_no_META);
		p.setPluralValueEnable(p.Cnd_data_no, true);
		p.Cnd_data_crud_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_data_crud_typ, true);
		p.Cnd_data_crud_typ.setLinkBeans(p.Cnd_data_crud_typ_nm);
		p.CndPanel.add(p.Cnd_data_crud_typ_Label);
		p.CndPanel.add(p.Cnd_data_crud_typ);
		p.Cnd_data_crud_typ.setNextBeans(p.Cnd_data_crud_typ_nm);
		p.Cnd_data_crud_typ.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.data_crud_typ_META);
		p.CndPanel.add(p.Cnd_data_crud_typ_nm);
		p.Cnd_data_crud_typ_nm.setNextBeans(p.Cnd_disp_old_flg);
		p.Cnd_data_crud_typ_nm.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.data_crud_typ_nm_META);
		p.CndPanel.add(p.Cnd_disp_old_flg);
		p.Cnd_disp_old_flg.setNextBeans(p.Cnd_biz_key1);
		p.Cnd_disp_old_flg.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.disp_old_flg_META);
		p.CndPanel.add(p.Cnd_biz_key1_Label);
		p.CndPanel.add(p.Cnd_biz_key1);
		p.Cnd_biz_key1.setNextBeans(p.Cnd_biz_key2);
		p.Cnd_biz_key1.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key1_META);
		p.setPluralValueEnable(p.Cnd_biz_key1, true);
		p.CndPanel.add(p.Cnd_biz_key2_Label);
		p.CndPanel.add(p.Cnd_biz_key2);
		p.Cnd_biz_key2.setNextBeans(p.Cnd_biz_key3);
		p.Cnd_biz_key2.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key2_META);
		p.setPluralValueEnable(p.Cnd_biz_key2, true);
		p.CndPanel.add(p.Cnd_biz_key3_Label);
		p.CndPanel.add(p.Cnd_biz_key3);
		p.Cnd_biz_key3.setNextBeans(p.Cnd_biz_key4);
		p.Cnd_biz_key3.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key3_META);
		p.setPluralValueEnable(p.Cnd_biz_key3, true);
		p.CndPanel.add(p.Cnd_biz_key4_Label);
		p.CndPanel.add(p.Cnd_biz_key4);
		p.Cnd_biz_key4.setNextBeans(p.Cnd_biz_key5);
		p.Cnd_biz_key4.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key4_META);
		p.setPluralValueEnable(p.Cnd_biz_key4, true);
		p.CndPanel.add(p.Cnd_biz_key5_Label);
		p.CndPanel.add(p.Cnd_biz_key5);
		p.Cnd_biz_key5.setNextBeans(p.Cnd_biz_key6);
		p.Cnd_biz_key5.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key5_META);
		p.setPluralValueEnable(p.Cnd_biz_key5, true);
		p.CndPanel.add(p.Cnd_biz_key6_Label);
		p.CndPanel.add(p.Cnd_biz_key6);
		p.Cnd_biz_key6.setNextBeans(p.Cnd_biz_key7);
		p.Cnd_biz_key6.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key6_META);
		p.setPluralValueEnable(p.Cnd_biz_key6, true);
		p.CndPanel.add(p.Cnd_biz_key7_Label);
		p.CndPanel.add(p.Cnd_biz_key7);
		p.Cnd_biz_key7.setNextBeans(p.Cnd_biz_key8);
		p.Cnd_biz_key7.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key7_META);
		p.setPluralValueEnable(p.Cnd_biz_key7, true);
		p.CndPanel.add(p.Cnd_biz_key8_Label);
		p.CndPanel.add(p.Cnd_biz_key8);
		p.Cnd_biz_key8.setNextBeans(p.Cnd_biz_key9);
		p.Cnd_biz_key8.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key8_META);
		p.setPluralValueEnable(p.Cnd_biz_key8, true);
		p.CndPanel.add(p.Cnd_biz_key9_Label);
		p.CndPanel.add(p.Cnd_biz_key9);
		p.Cnd_biz_key9.setNextBeans(p.Cnd_biz_key10);
		p.Cnd_biz_key9.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key9_META);
		p.setPluralValueEnable(p.Cnd_biz_key9, true);
		p.CndPanel.add(p.Cnd_biz_key10_Label);
		p.CndPanel.add(p.Cnd_biz_key10);
		p.Cnd_biz_key10.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.biz_key10_META);
		p.setPluralValueEnable(p.Cnd_biz_key10, true);
		p.Cnd2Panel.add(p.Cnd_rmrks1_Label);
		p.Cnd2Panel.add(p.Cnd_rmrks1);
		p.Cnd2Panel.setLastBeans(p.Cnd_rmrks1);
		p.Cnd_rmrks1.setNextBeans(p.Cnd_rmrks2);
		p.Cnd_rmrks1.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rmrks1_META);
		p.setPluralValueEnable(p.Cnd_rmrks1, true);
		p.Cnd2Panel.add(p.Cnd_rmrks2_Label);
		p.Cnd2Panel.add(p.Cnd_rmrks2);
		p.Cnd_rmrks2.setNextBeans(p.Cnd_rmrks3);
		p.Cnd_rmrks2.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rmrks2_META);
		p.setPluralValueEnable(p.Cnd_rmrks2, true);
		p.Cnd2Panel.add(p.Cnd_rmrks3_Label);
		p.Cnd2Panel.add(p.Cnd_rmrks3);
		p.Cnd_rmrks3.setNextBeans(p.Cnd_rmrks4);
		p.Cnd_rmrks3.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rmrks3_META);
		p.setPluralValueEnable(p.Cnd_rmrks3, true);
		p.Cnd2Panel.add(p.Cnd_rmrks4_Label);
		p.Cnd2Panel.add(p.Cnd_rmrks4);
		p.Cnd_rmrks4.setNextBeans(p.Cnd_rmrks5);
		p.Cnd_rmrks4.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rmrks4_META);
		p.setPluralValueEnable(p.Cnd_rmrks4, true);
		p.Cnd2Panel.add(p.Cnd_rmrks5_Label);
		p.Cnd2Panel.add(p.Cnd_rmrks5);
		p.Cnd_rmrks5.setNextBeans(p.Cnd_rpt_attr1);
		p.Cnd_rmrks5.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rmrks5_META);
		p.setPluralValueEnable(p.Cnd_rmrks5, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr1_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr1);
		p.Cnd_rpt_attr1.setNextBeans(p.Cnd_rpt_attr2);
		p.Cnd_rpt_attr1.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr1_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr1, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr2_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr2);
		p.Cnd_rpt_attr2.setNextBeans(p.Cnd_rpt_attr3);
		p.Cnd_rpt_attr2.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr2_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr2, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr3_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr3);
		p.Cnd_rpt_attr3.setNextBeans(p.Cnd_rpt_attr4);
		p.Cnd_rpt_attr3.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr3_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr3, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr4_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr4);
		p.Cnd_rpt_attr4.setNextBeans(p.Cnd_rpt_attr5);
		p.Cnd_rpt_attr4.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr4_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr4, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr5_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr5);
		p.Cnd_rpt_attr5.setNextBeans(p.Cnd_rpt_attr6);
		p.Cnd_rpt_attr5.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr5_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr5, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr6_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr6);
		p.Cnd_rpt_attr6.setNextBeans(p.Cnd_rpt_attr7);
		p.Cnd_rpt_attr6.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr6_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr6, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr7_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr7);
		p.Cnd_rpt_attr7.setNextBeans(p.Cnd_rpt_attr8);
		p.Cnd_rpt_attr7.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr7_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr7, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr8_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr8);
		p.Cnd_rpt_attr8.setNextBeans(p.Cnd_rpt_attr9);
		p.Cnd_rpt_attr8.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr8_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr8, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr9_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr9);
		p.Cnd_rpt_attr9.setNextBeans(p.Cnd_rpt_attr10);
		p.Cnd_rpt_attr9.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr9_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr9, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr10_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr10);
		p.Cnd_rpt_attr10.setNextBeans(p.Cnd_rpt_attr11);
		p.Cnd_rpt_attr10.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr10_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr10, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr11_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr11);
		p.Cnd_rpt_attr11.setNextBeans(p.Cnd_rpt_attr12);
		p.Cnd_rpt_attr11.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr11_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr11, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr12_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr12);
		p.Cnd_rpt_attr12.setNextBeans(p.Cnd_rpt_attr13);
		p.Cnd_rpt_attr12.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr12_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr12, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr13_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr13);
		p.Cnd_rpt_attr13.setNextBeans(p.Cnd_rpt_attr14);
		p.Cnd_rpt_attr13.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr13_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr13, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr14_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr14);
		p.Cnd_rpt_attr14.setNextBeans(p.Cnd_rpt_attr15);
		p.Cnd_rpt_attr14.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr14_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr14, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr15_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr15);
		p.Cnd_rpt_attr15.setNextBeans(p.Cnd_rpt_attr16);
		p.Cnd_rpt_attr15.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr15_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr15, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr16_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr16);
		p.Cnd_rpt_attr16.setNextBeans(p.Cnd_rpt_attr17);
		p.Cnd_rpt_attr16.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr16_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr16, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr17_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr17);
		p.Cnd_rpt_attr17.setNextBeans(p.Cnd_rpt_attr18);
		p.Cnd_rpt_attr17.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr17_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr17, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr18_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr18);
		p.Cnd_rpt_attr18.setNextBeans(p.Cnd_rpt_attr19);
		p.Cnd_rpt_attr18.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr18_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr18, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr19_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr19);
		p.Cnd_rpt_attr19.setNextBeans(p.Cnd_rpt_attr20);
		p.Cnd_rpt_attr19.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr19_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr19, true);
		p.Cnd2Panel.add(p.Cnd_rpt_attr20_Label);
		p.Cnd2Panel.add(p.Cnd_rpt_attr20);
		p.Cnd_rpt_attr20.setRow(p.getCndR(), mcframe.clientMBBC.MBBCP0010.CndR.rpt_attr20_META);
		p.setPluralValueEnable(p.Cnd_rpt_attr20, true);
		p.Cnd3Panel.add(p.Cnd_bp_grp_PPanel);
		p.Cnd3Panel.setLastBeans(p.Cnd_bp_grp_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd3(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.Cnd3Panel.setValueCheck(false);
		p.Cnd3Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd3Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MBBCP_AttachmentSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_file.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_file);
		p.BtnPanel.setLastBeans(p.Btn_open_file);
		p.Btn_open_file.setNextBeans(p.Btn_open_screen);
		p.Btn_open_screen.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_screen);
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
		MBBCP_AttachmentSrch_MC.mcInitTop((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitFold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitTab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitTab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitTab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitCnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitCnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitCnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitCtrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitRslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.mcInitBtn((MBBCP_AttachmentSrch)this);

		// [SRCH]ステータスのモードの設定
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Top((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Fold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Tab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Tab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Tab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Cnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Cnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Cnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Ctrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Rslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitSRCH_Btn((MBBCP_AttachmentSrch)this);

		// [REF]ステータスのモードの設定
		MBBCP_AttachmentSrch_MC.statusInitREF_Top((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Fold((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Tab1((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Tab2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Tab3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Cnd((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Cnd2((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Cnd3((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Ctrl((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Rslt((MBBCP_AttachmentSrch)this);
		MBBCP_AttachmentSrch_MC.statusInitREF_Btn((MBBCP_AttachmentSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBCP_AttachmentSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBCP_AttachmentSrch p) {
		p.Cnd_biz_typ.setListListener(p);
		p.Cnd_biz_typ.addAllListener(p);
		p.Cnd_biz_typ_nm.setListListener(p);
		p.Cnd_biz_typ_nm.addAllListener(p);
		p.Cnd_report_id.setListListener(p);
		p.Cnd_report_id.addAllListener(p);
		p.Cnd_report_nm.setListListener(p);
		p.Cnd_report_nm.addAllListener(p);
		p.Cnd_file_nm.setListListener(p);
		p.Cnd_file_nm.addAllListener(p);
		p.Cnd_dt_fr.setListListener(p);
		p.Cnd_dt_fr.addAllListener(p);
		p.Cnd_dt_to.setListListener(p);
		p.Cnd_dt_to.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_amt_fr.setListListener(p);
		p.Cnd_amt_fr.addAllListener(p);
		p.Cnd_amt_to.setListListener(p);
		p.Cnd_amt_to.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_data_no.setListListener(p);
		p.Cnd_data_no.addAllListener(p);
		p.Cnd_data_crud_typ.setListListener(p);
		p.Cnd_data_crud_typ.addAllListener(p);
		p.Cnd_data_crud_typ_nm.setListListener(p);
		p.Cnd_data_crud_typ_nm.addAllListener(p);
		p.Cnd_disp_old_flg.addAllListener(p);
		p.Cnd_biz_key1.setListListener(p);
		p.Cnd_biz_key1.addAllListener(p);
		p.Cnd_biz_key2.setListListener(p);
		p.Cnd_biz_key2.addAllListener(p);
		p.Cnd_biz_key3.setListListener(p);
		p.Cnd_biz_key3.addAllListener(p);
		p.Cnd_biz_key4.setListListener(p);
		p.Cnd_biz_key4.addAllListener(p);
		p.Cnd_biz_key5.setListListener(p);
		p.Cnd_biz_key5.addAllListener(p);
		p.Cnd_biz_key6.setListListener(p);
		p.Cnd_biz_key6.addAllListener(p);
		p.Cnd_biz_key7.setListListener(p);
		p.Cnd_biz_key7.addAllListener(p);
		p.Cnd_biz_key8.setListListener(p);
		p.Cnd_biz_key8.addAllListener(p);
		p.Cnd_biz_key9.setListListener(p);
		p.Cnd_biz_key9.addAllListener(p);
		p.Cnd_biz_key10.setListListener(p);
		p.Cnd_biz_key10.addAllListener(p);
		p.Cnd_rmrks1.setListListener(p);
		p.Cnd_rmrks1.addAllListener(p);
		p.Cnd_rmrks2.setListListener(p);
		p.Cnd_rmrks2.addAllListener(p);
		p.Cnd_rmrks3.setListListener(p);
		p.Cnd_rmrks3.addAllListener(p);
		p.Cnd_rmrks4.setListListener(p);
		p.Cnd_rmrks4.addAllListener(p);
		p.Cnd_rmrks5.setListListener(p);
		p.Cnd_rmrks5.addAllListener(p);
		p.Cnd_rpt_attr1.setListListener(p);
		p.Cnd_rpt_attr1.addAllListener(p);
		p.Cnd_rpt_attr2.setListListener(p);
		p.Cnd_rpt_attr2.addAllListener(p);
		p.Cnd_rpt_attr3.setListListener(p);
		p.Cnd_rpt_attr3.addAllListener(p);
		p.Cnd_rpt_attr4.setListListener(p);
		p.Cnd_rpt_attr4.addAllListener(p);
		p.Cnd_rpt_attr5.setListListener(p);
		p.Cnd_rpt_attr5.addAllListener(p);
		p.Cnd_rpt_attr6.setListListener(p);
		p.Cnd_rpt_attr6.addAllListener(p);
		p.Cnd_rpt_attr7.setListListener(p);
		p.Cnd_rpt_attr7.addAllListener(p);
		p.Cnd_rpt_attr8.setListListener(p);
		p.Cnd_rpt_attr8.addAllListener(p);
		p.Cnd_rpt_attr9.setListListener(p);
		p.Cnd_rpt_attr9.addAllListener(p);
		p.Cnd_rpt_attr10.setListListener(p);
		p.Cnd_rpt_attr10.addAllListener(p);
		p.Cnd_rpt_attr11.setListListener(p);
		p.Cnd_rpt_attr11.addAllListener(p);
		p.Cnd_rpt_attr12.setListListener(p);
		p.Cnd_rpt_attr12.addAllListener(p);
		p.Cnd_rpt_attr13.setListListener(p);
		p.Cnd_rpt_attr13.addAllListener(p);
		p.Cnd_rpt_attr14.setListListener(p);
		p.Cnd_rpt_attr14.addAllListener(p);
		p.Cnd_rpt_attr15.setListListener(p);
		p.Cnd_rpt_attr15.addAllListener(p);
		p.Cnd_rpt_attr16.setListListener(p);
		p.Cnd_rpt_attr16.addAllListener(p);
		p.Cnd_rpt_attr17.setListListener(p);
		p.Cnd_rpt_attr17.addAllListener(p);
		p.Cnd_rpt_attr18.setListListener(p);
		p.Cnd_rpt_attr18.addAllListener(p);
		p.Cnd_rpt_attr19.setListListener(p);
		p.Cnd_rpt_attr19.addAllListener(p);
		p.Cnd_rpt_attr20.setListListener(p);
		p.Cnd_rpt_attr20.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Cnd3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd3(MBBCP_AttachmentSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBCP_AttachmentSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBCP_AttachmentSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_edition.addAllListener(p);
		p.columnRslt_edition.setListListener(p);
		p.columnRslt_file_path.addAllListener(p);
		p.columnRslt_file_path.setListListener(p);
		p.columnRslt_file_nm.addAllListener(p);
		p.columnRslt_file_nm.setListListener(p);
		p.columnRslt_report_id.addAllListener(p);
		p.columnRslt_report_id.setListListener(p);
		p.columnRslt_report_nm.addAllListener(p);
		p.columnRslt_report_nm.setListListener(p);
		p.columnRslt_biz_typ.addAllListener(p);
		p.columnRslt_biz_typ.setListListener(p);
		p.columnRslt_biz_typ_nm.addAllListener(p);
		p.columnRslt_biz_typ_nm.setListListener(p);
		p.columnRslt_biz_key1.addAllListener(p);
		p.columnRslt_biz_key1.setListListener(p);
		p.columnRslt_biz_key2.addAllListener(p);
		p.columnRslt_biz_key2.setListListener(p);
		p.columnRslt_biz_key3.addAllListener(p);
		p.columnRslt_biz_key3.setListListener(p);
		p.columnRslt_biz_key4.addAllListener(p);
		p.columnRslt_biz_key4.setListListener(p);
		p.columnRslt_biz_key5.addAllListener(p);
		p.columnRslt_biz_key5.setListListener(p);
		p.columnRslt_biz_key6.addAllListener(p);
		p.columnRslt_biz_key6.setListListener(p);
		p.columnRslt_biz_key7.addAllListener(p);
		p.columnRslt_biz_key7.setListListener(p);
		p.columnRslt_biz_key8.addAllListener(p);
		p.columnRslt_biz_key8.setListListener(p);
		p.columnRslt_biz_key9.addAllListener(p);
		p.columnRslt_biz_key9.setListListener(p);
		p.columnRslt_biz_key10.addAllListener(p);
		p.columnRslt_biz_key10.setListListener(p);
		p.columnRslt_dt.addAllListener(p);
		p.columnRslt_dt.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_cur_cd.addAllListener(p);
		p.columnRslt_cur_cd.setListListener(p);
		p.columnRslt_cur_nm.addAllListener(p);
		p.columnRslt_cur_nm.setListListener(p);
		p.columnRslt_amt.addAllListener(p);
		p.columnRslt_amt.setListListener(p);
		p.columnRslt_fs_flg.addAllListener(p);
		p.columnRslt_doc_id.addAllListener(p);
		p.columnRslt_doc_id.setListListener(p);
		p.columnRslt_preview_url.addAllListener(p);
		p.columnRslt_preview_url.setListListener(p);
		p.columnRslt_rmrks1.addAllListener(p);
		p.columnRslt_rmrks1.setListListener(p);
		p.columnRslt_rmrks2.addAllListener(p);
		p.columnRslt_rmrks2.setListListener(p);
		p.columnRslt_rmrks3.addAllListener(p);
		p.columnRslt_rmrks3.setListListener(p);
		p.columnRslt_rmrks4.addAllListener(p);
		p.columnRslt_rmrks4.setListListener(p);
		p.columnRslt_rmrks5.addAllListener(p);
		p.columnRslt_rmrks5.setListListener(p);
		p.columnRslt_rpt_attr1.addAllListener(p);
		p.columnRslt_rpt_attr1.setListListener(p);
		p.columnRslt_rpt_attr2.addAllListener(p);
		p.columnRslt_rpt_attr2.setListListener(p);
		p.columnRslt_rpt_attr3.addAllListener(p);
		p.columnRslt_rpt_attr3.setListListener(p);
		p.columnRslt_rpt_attr4.addAllListener(p);
		p.columnRslt_rpt_attr4.setListListener(p);
		p.columnRslt_rpt_attr5.addAllListener(p);
		p.columnRslt_rpt_attr5.setListListener(p);
		p.columnRslt_rpt_attr6.addAllListener(p);
		p.columnRslt_rpt_attr6.setListListener(p);
		p.columnRslt_rpt_attr7.addAllListener(p);
		p.columnRslt_rpt_attr7.setListListener(p);
		p.columnRslt_rpt_attr8.addAllListener(p);
		p.columnRslt_rpt_attr8.setListListener(p);
		p.columnRslt_rpt_attr9.addAllListener(p);
		p.columnRslt_rpt_attr9.setListListener(p);
		p.columnRslt_rpt_attr10.addAllListener(p);
		p.columnRslt_rpt_attr10.setListListener(p);
		p.columnRslt_rpt_attr11.addAllListener(p);
		p.columnRslt_rpt_attr11.setListListener(p);
		p.columnRslt_rpt_attr12.addAllListener(p);
		p.columnRslt_rpt_attr12.setListListener(p);
		p.columnRslt_rpt_attr13.addAllListener(p);
		p.columnRslt_rpt_attr13.setListListener(p);
		p.columnRslt_rpt_attr14.addAllListener(p);
		p.columnRslt_rpt_attr14.setListListener(p);
		p.columnRslt_rpt_attr15.addAllListener(p);
		p.columnRslt_rpt_attr15.setListListener(p);
		p.columnRslt_rpt_attr16.addAllListener(p);
		p.columnRslt_rpt_attr16.setListListener(p);
		p.columnRslt_rpt_attr17.addAllListener(p);
		p.columnRslt_rpt_attr17.setListListener(p);
		p.columnRslt_rpt_attr18.addAllListener(p);
		p.columnRslt_rpt_attr18.setListListener(p);
		p.columnRslt_rpt_attr19.addAllListener(p);
		p.columnRslt_rpt_attr19.setListListener(p);
		p.columnRslt_rpt_attr20.addAllListener(p);
		p.columnRslt_rpt_attr20.setListListener(p);
		p.columnRslt_data_crud_typ.addAllListener(p);
		p.columnRslt_data_crud_typ.setListListener(p);
		p.columnRslt_data_crud_typ_nm.addAllListener(p);
		p.columnRslt_data_crud_typ_nm.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MBBCP_AttachmentSrch p) {
		p.Btn_open_file.addAllListener(p);
		p.Btn_open_file.setAPMethodName("doBtn_open_file");
		p.Btn_open_screen.addAllListener(p);
		p.Btn_open_screen.setAPMethodName("doBtn_open_screen");
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBCP_AttachmentSrch p){
		p.Cnd_biz_typ.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_report_id.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_report_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_file_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_amt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_amt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_data_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_data_crud_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_data_crud_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_disp_old_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_biz_key1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_biz_key10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rmrks5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr11.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr12.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr13.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr14.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr15.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr16.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr17.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr18.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr19.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_rpt_attr20.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_grp_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd3(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBCP_AttachmentSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBCP_AttachmentSrch p){
		p.columnRslt_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_edition.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_path.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_file_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_report_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_report_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_biz_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fs_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_doc_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_preview_url.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rmrks1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr11.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr12.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr13.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr14.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr15.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr16.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr17.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr18.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr19.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr20.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MBBCP_AttachmentSrch p){
		p.Btn_open_file.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_screen.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBCP_AttachmentSrch p){
		p.Cnd_biz_typ.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_report_id.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_report_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_file_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_amt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_amt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_data_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_data_crud_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_data_crud_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_disp_old_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_biz_key1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_biz_key10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rmrks5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr11.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr12.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr13.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr14.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr15.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr16.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr17.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr18.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr19.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rpt_attr20.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0260.MAUBP_BpGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd3(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBCP_AttachmentSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBCP_AttachmentSrch p){
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_edition.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_file_path.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_file_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_report_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_report_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_biz_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fs_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_doc_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_preview_url.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rmrks1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rpt_attr20.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_data_crud_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MBBCP_AttachmentSrch p){
		p.Btn_open_file.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_screen.putMode(p, REF, MCMode.ENABLE);

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
		MBBCP_AttachmentSrch_MC.setTableConfigRslt((MBBCP_AttachmentSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBCP_AttachmentSrch p) {
		p.columnRslt_data_no.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_edition.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.edition_META);
		p.RsltTable.addColumnConfig(p.columnRslt_edition);
		p.columnRslt_file_path.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.file_path_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_path);
		p.columnRslt_file_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.file_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_file_nm);
		p.columnRslt_report_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.report_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_report_id);
		p.columnRslt_report_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.report_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_report_nm);
		p.columnRslt_biz_typ.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_typ);
		p.columnRslt_biz_typ_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_typ_nm);
		p.columnRslt_biz_key1.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key1);
		p.columnRslt_biz_key2.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key2);
		p.columnRslt_biz_key3.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key3);
		p.columnRslt_biz_key4.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key4);
		p.columnRslt_biz_key5.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key5);
		p.columnRslt_biz_key6.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key6);
		p.columnRslt_biz_key7.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key7);
		p.columnRslt_biz_key8.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key8);
		p.columnRslt_biz_key9.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key9);
		p.columnRslt_biz_key10.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.biz_key10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_biz_key10);
		p.columnRslt_dt.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.dt_META);
		p.columnRslt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_dt);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_cur_cd.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_cd);
		p.columnRslt_cur_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cur_nm);
		p.columnRslt_amt.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_amt);
		p.columnRslt_fs_flg.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.fs_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fs_flg);
		p.columnRslt_doc_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.doc_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_doc_id);
		p.columnRslt_preview_url.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.preview_url_META);
		p.RsltTable.addColumnConfig(p.columnRslt_preview_url);
		p.columnRslt_rmrks1.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rmrks1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks1);
		p.columnRslt_rmrks2.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rmrks2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks2);
		p.columnRslt_rmrks3.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rmrks3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks3);
		p.columnRslt_rmrks4.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rmrks4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks4);
		p.columnRslt_rmrks5.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rmrks5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks5);
		p.columnRslt_rpt_attr1.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr1);
		p.columnRslt_rpt_attr2.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr2);
		p.columnRslt_rpt_attr3.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr3);
		p.columnRslt_rpt_attr4.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr4);
		p.columnRslt_rpt_attr5.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr5);
		p.columnRslt_rpt_attr6.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr6);
		p.columnRslt_rpt_attr7.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr7);
		p.columnRslt_rpt_attr8.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr8);
		p.columnRslt_rpt_attr9.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr9);
		p.columnRslt_rpt_attr10.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr10);
		p.columnRslt_rpt_attr11.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr11_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr11);
		p.columnRslt_rpt_attr12.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr12_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr12);
		p.columnRslt_rpt_attr13.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr13_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr13);
		p.columnRslt_rpt_attr14.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr14_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr14);
		p.columnRslt_rpt_attr15.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr15_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr15);
		p.columnRslt_rpt_attr16.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr16_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr16);
		p.columnRslt_rpt_attr17.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr17_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr17);
		p.columnRslt_rpt_attr18.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr18_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr18);
		p.columnRslt_rpt_attr19.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr19_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr19);
		p.columnRslt_rpt_attr20.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.rpt_attr20_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rpt_attr20);
		p.columnRslt_data_crud_typ.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.data_crud_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_crud_typ);
		p.columnRslt_data_crud_typ_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.data_crud_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_crud_typ_nm);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBC.MBBCP0010.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_biz_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_biz_typ.getListConfig().setPutter(getCnd_biz_typ_ListPutter());
		Cnd_report_id.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_report_id.getListConfig().setPutter(getCnd_report_id_ListPutter());
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_data_crud_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_data_crud_typ.getListConfig().setPutter(getCnd_data_crud_typ_ListPutter());
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_biz_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_biz_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BizTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_report_id_ListPutter]の作成
	 */
	protected MCListPutter createCnd_report_id_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrgTgtReport");
		return lp;
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
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_data_crud_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_data_crud_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DataCrudTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_biz_typ) return getCnd_biz_typ(row, info);
		if(combo == Cnd_report_id) return getCnd_report_id(row, info);
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_data_crud_typ) return getCnd_data_crud_typ(row, info);
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
		else if (ap == Btn_open_file) doBtn_open_file(info);
		else if (ap == Btn_open_screen) doBtn_open_screen(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_file]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_file(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_screen]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_screen(MCEventInfo info);

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
		if (vc == Cnd_biz_typ) return doCnd_biz_typ_VC(info);
		if (vc == Cnd_biz_typ_nm) return doCnd_biz_typ_nm_VC(info);
		if (vc == Cnd_report_id) return doCnd_report_id_VC(info);
		if (vc == Cnd_report_nm) return doCnd_report_nm_VC(info);
		if (vc == Cnd_file_nm) return doCnd_file_nm_VC(info);
		if (vc == Cnd_dt_fr) return doCnd_dt_fr_VC(info);
		if (vc == Cnd_dt_to) return doCnd_dt_to_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_amt_fr) return doCnd_amt_fr_VC(info);
		if (vc == Cnd_amt_to) return doCnd_amt_to_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_data_no) return doCnd_data_no_VC(info);
		if (vc == Cnd_data_crud_typ) return doCnd_data_crud_typ_VC(info);
		if (vc == Cnd_data_crud_typ_nm) return doCnd_data_crud_typ_nm_VC(info);
		if (vc == Cnd_disp_old_flg) return doCnd_disp_old_flg_VC(info);
		if (vc == Cnd_biz_key1) return doCnd_biz_key1_VC(info);
		if (vc == Cnd_biz_key2) return doCnd_biz_key2_VC(info);
		if (vc == Cnd_biz_key3) return doCnd_biz_key3_VC(info);
		if (vc == Cnd_biz_key4) return doCnd_biz_key4_VC(info);
		if (vc == Cnd_biz_key5) return doCnd_biz_key5_VC(info);
		if (vc == Cnd_biz_key6) return doCnd_biz_key6_VC(info);
		if (vc == Cnd_biz_key7) return doCnd_biz_key7_VC(info);
		if (vc == Cnd_biz_key8) return doCnd_biz_key8_VC(info);
		if (vc == Cnd_biz_key9) return doCnd_biz_key9_VC(info);
		if (vc == Cnd_biz_key10) return doCnd_biz_key10_VC(info);
		if (vc == Cnd_rmrks1) return doCnd_rmrks1_VC(info);
		if (vc == Cnd_rmrks2) return doCnd_rmrks2_VC(info);
		if (vc == Cnd_rmrks3) return doCnd_rmrks3_VC(info);
		if (vc == Cnd_rmrks4) return doCnd_rmrks4_VC(info);
		if (vc == Cnd_rmrks5) return doCnd_rmrks5_VC(info);
		if (vc == Cnd_rpt_attr1) return doCnd_rpt_attr1_VC(info);
		if (vc == Cnd_rpt_attr2) return doCnd_rpt_attr2_VC(info);
		if (vc == Cnd_rpt_attr3) return doCnd_rpt_attr3_VC(info);
		if (vc == Cnd_rpt_attr4) return doCnd_rpt_attr4_VC(info);
		if (vc == Cnd_rpt_attr5) return doCnd_rpt_attr5_VC(info);
		if (vc == Cnd_rpt_attr6) return doCnd_rpt_attr6_VC(info);
		if (vc == Cnd_rpt_attr7) return doCnd_rpt_attr7_VC(info);
		if (vc == Cnd_rpt_attr8) return doCnd_rpt_attr8_VC(info);
		if (vc == Cnd_rpt_attr9) return doCnd_rpt_attr9_VC(info);
		if (vc == Cnd_rpt_attr10) return doCnd_rpt_attr10_VC(info);
		if (vc == Cnd_rpt_attr11) return doCnd_rpt_attr11_VC(info);
		if (vc == Cnd_rpt_attr12) return doCnd_rpt_attr12_VC(info);
		if (vc == Cnd_rpt_attr13) return doCnd_rpt_attr13_VC(info);
		if (vc == Cnd_rpt_attr14) return doCnd_rpt_attr14_VC(info);
		if (vc == Cnd_rpt_attr15) return doCnd_rpt_attr15_VC(info);
		if (vc == Cnd_rpt_attr16) return doCnd_rpt_attr16_VC(info);
		if (vc == Cnd_rpt_attr17) return doCnd_rpt_attr17_VC(info);
		if (vc == Cnd_rpt_attr18) return doCnd_rpt_attr18_VC(info);
		if (vc == Cnd_rpt_attr19) return doCnd_rpt_attr19_VC(info);
		if (vc == Cnd_rpt_attr20) return doCnd_rpt_attr20_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_edition) return doRslt_edition_VC(info);
		if (vc == columnRslt_file_path) return doRslt_file_path_VC(info);
		if (vc == columnRslt_file_nm) return doRslt_file_nm_VC(info);
		if (vc == columnRslt_report_id) return doRslt_report_id_VC(info);
		if (vc == columnRslt_report_nm) return doRslt_report_nm_VC(info);
		if (vc == columnRslt_biz_typ) return doRslt_biz_typ_VC(info);
		if (vc == columnRslt_biz_typ_nm) return doRslt_biz_typ_nm_VC(info);
		if (vc == columnRslt_biz_key1) return doRslt_biz_key1_VC(info);
		if (vc == columnRslt_biz_key2) return doRslt_biz_key2_VC(info);
		if (vc == columnRslt_biz_key3) return doRslt_biz_key3_VC(info);
		if (vc == columnRslt_biz_key4) return doRslt_biz_key4_VC(info);
		if (vc == columnRslt_biz_key5) return doRslt_biz_key5_VC(info);
		if (vc == columnRslt_biz_key6) return doRslt_biz_key6_VC(info);
		if (vc == columnRslt_biz_key7) return doRslt_biz_key7_VC(info);
		if (vc == columnRslt_biz_key8) return doRslt_biz_key8_VC(info);
		if (vc == columnRslt_biz_key9) return doRslt_biz_key9_VC(info);
		if (vc == columnRslt_biz_key10) return doRslt_biz_key10_VC(info);
		if (vc == columnRslt_dt) return doRslt_dt_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == columnRslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == columnRslt_amt) return doRslt_amt_VC(info);
		if (vc == columnRslt_fs_flg) return doRslt_fs_flg_VC(info);
		if (vc == columnRslt_doc_id) return doRslt_doc_id_VC(info);
		if (vc == columnRslt_preview_url) return doRslt_preview_url_VC(info);
		if (vc == columnRslt_rmrks1) return doRslt_rmrks1_VC(info);
		if (vc == columnRslt_rmrks2) return doRslt_rmrks2_VC(info);
		if (vc == columnRslt_rmrks3) return doRslt_rmrks3_VC(info);
		if (vc == columnRslt_rmrks4) return doRslt_rmrks4_VC(info);
		if (vc == columnRslt_rmrks5) return doRslt_rmrks5_VC(info);
		if (vc == columnRslt_rpt_attr1) return doRslt_rpt_attr1_VC(info);
		if (vc == columnRslt_rpt_attr2) return doRslt_rpt_attr2_VC(info);
		if (vc == columnRslt_rpt_attr3) return doRslt_rpt_attr3_VC(info);
		if (vc == columnRslt_rpt_attr4) return doRslt_rpt_attr4_VC(info);
		if (vc == columnRslt_rpt_attr5) return doRslt_rpt_attr5_VC(info);
		if (vc == columnRslt_rpt_attr6) return doRslt_rpt_attr6_VC(info);
		if (vc == columnRslt_rpt_attr7) return doRslt_rpt_attr7_VC(info);
		if (vc == columnRslt_rpt_attr8) return doRslt_rpt_attr8_VC(info);
		if (vc == columnRslt_rpt_attr9) return doRslt_rpt_attr9_VC(info);
		if (vc == columnRslt_rpt_attr10) return doRslt_rpt_attr10_VC(info);
		if (vc == columnRslt_rpt_attr11) return doRslt_rpt_attr11_VC(info);
		if (vc == columnRslt_rpt_attr12) return doRslt_rpt_attr12_VC(info);
		if (vc == columnRslt_rpt_attr13) return doRslt_rpt_attr13_VC(info);
		if (vc == columnRslt_rpt_attr14) return doRslt_rpt_attr14_VC(info);
		if (vc == columnRslt_rpt_attr15) return doRslt_rpt_attr15_VC(info);
		if (vc == columnRslt_rpt_attr16) return doRslt_rpt_attr16_VC(info);
		if (vc == columnRslt_rpt_attr17) return doRslt_rpt_attr17_VC(info);
		if (vc == columnRslt_rpt_attr18) return doRslt_rpt_attr18_VC(info);
		if (vc == columnRslt_rpt_attr19) return doRslt_rpt_attr19_VC(info);
		if (vc == columnRslt_rpt_attr20) return doRslt_rpt_attr20_VC(info);
		if (vc == columnRslt_data_crud_typ) return doRslt_data_crud_typ_VC(info);
		if (vc == columnRslt_data_crud_typ_nm) return doRslt_data_crud_typ_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
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
	 * [Cnd]パネルの[biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[report_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_report_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[report_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_report_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[amt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_amt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[data_crud_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_data_crud_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_old_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_old_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[biz_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_biz_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rmrks5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rmrks5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_attr20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_attr20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[edition]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_edition_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_path]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_path_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[file_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_file_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[report_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_report_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[report_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_report_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[biz_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_biz_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fs_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fs_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[doc_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_doc_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[preview_url]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_preview_url_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rpt_attr20_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_crud_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == Cnd_biz_typ) doCnd_biz_typ_NC(info);
		else if (nc == Cnd_biz_typ_nm) doCnd_biz_typ_nm_NC(info);
		else if (nc == Cnd_report_id) doCnd_report_id_NC(info);
		else if (nc == Cnd_report_nm) doCnd_report_nm_NC(info);
		else if (nc == Cnd_file_nm) doCnd_file_nm_NC(info);
		else if (nc == Cnd_dt_fr) doCnd_dt_fr_NC(info);
		else if (nc == Cnd_dt_to) doCnd_dt_to_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_amt_fr) doCnd_amt_fr_NC(info);
		else if (nc == Cnd_amt_to) doCnd_amt_to_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_data_no) doCnd_data_no_NC(info);
		else if (nc == Cnd_data_crud_typ) doCnd_data_crud_typ_NC(info);
		else if (nc == Cnd_data_crud_typ_nm) doCnd_data_crud_typ_nm_NC(info);
		else if (nc == Cnd_disp_old_flg) doCnd_disp_old_flg_NC(info);
		else if (nc == Cnd_biz_key1) doCnd_biz_key1_NC(info);
		else if (nc == Cnd_biz_key2) doCnd_biz_key2_NC(info);
		else if (nc == Cnd_biz_key3) doCnd_biz_key3_NC(info);
		else if (nc == Cnd_biz_key4) doCnd_biz_key4_NC(info);
		else if (nc == Cnd_biz_key5) doCnd_biz_key5_NC(info);
		else if (nc == Cnd_biz_key6) doCnd_biz_key6_NC(info);
		else if (nc == Cnd_biz_key7) doCnd_biz_key7_NC(info);
		else if (nc == Cnd_biz_key8) doCnd_biz_key8_NC(info);
		else if (nc == Cnd_biz_key9) doCnd_biz_key9_NC(info);
		else if (nc == Cnd_biz_key10) doCnd_biz_key10_NC(info);
		else if (nc == Cnd_rmrks1) doCnd_rmrks1_NC(info);
		else if (nc == Cnd_rmrks2) doCnd_rmrks2_NC(info);
		else if (nc == Cnd_rmrks3) doCnd_rmrks3_NC(info);
		else if (nc == Cnd_rmrks4) doCnd_rmrks4_NC(info);
		else if (nc == Cnd_rmrks5) doCnd_rmrks5_NC(info);
		else if (nc == Cnd_rpt_attr1) doCnd_rpt_attr1_NC(info);
		else if (nc == Cnd_rpt_attr2) doCnd_rpt_attr2_NC(info);
		else if (nc == Cnd_rpt_attr3) doCnd_rpt_attr3_NC(info);
		else if (nc == Cnd_rpt_attr4) doCnd_rpt_attr4_NC(info);
		else if (nc == Cnd_rpt_attr5) doCnd_rpt_attr5_NC(info);
		else if (nc == Cnd_rpt_attr6) doCnd_rpt_attr6_NC(info);
		else if (nc == Cnd_rpt_attr7) doCnd_rpt_attr7_NC(info);
		else if (nc == Cnd_rpt_attr8) doCnd_rpt_attr8_NC(info);
		else if (nc == Cnd_rpt_attr9) doCnd_rpt_attr9_NC(info);
		else if (nc == Cnd_rpt_attr10) doCnd_rpt_attr10_NC(info);
		else if (nc == Cnd_rpt_attr11) doCnd_rpt_attr11_NC(info);
		else if (nc == Cnd_rpt_attr12) doCnd_rpt_attr12_NC(info);
		else if (nc == Cnd_rpt_attr13) doCnd_rpt_attr13_NC(info);
		else if (nc == Cnd_rpt_attr14) doCnd_rpt_attr14_NC(info);
		else if (nc == Cnd_rpt_attr15) doCnd_rpt_attr15_NC(info);
		else if (nc == Cnd_rpt_attr16) doCnd_rpt_attr16_NC(info);
		else if (nc == Cnd_rpt_attr17) doCnd_rpt_attr17_NC(info);
		else if (nc == Cnd_rpt_attr18) doCnd_rpt_attr18_NC(info);
		else if (nc == Cnd_rpt_attr19) doCnd_rpt_attr19_NC(info);
		else if (nc == Cnd_rpt_attr20) doCnd_rpt_attr20_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_edition) doRslt_edition_NC(info);
		else if (nc == columnRslt_file_path) doRslt_file_path_NC(info);
		else if (nc == columnRslt_file_nm) doRslt_file_nm_NC(info);
		else if (nc == columnRslt_report_id) doRslt_report_id_NC(info);
		else if (nc == columnRslt_report_nm) doRslt_report_nm_NC(info);
		else if (nc == columnRslt_biz_typ) doRslt_biz_typ_NC(info);
		else if (nc == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NC(info);
		else if (nc == columnRslt_biz_key1) doRslt_biz_key1_NC(info);
		else if (nc == columnRslt_biz_key2) doRslt_biz_key2_NC(info);
		else if (nc == columnRslt_biz_key3) doRslt_biz_key3_NC(info);
		else if (nc == columnRslt_biz_key4) doRslt_biz_key4_NC(info);
		else if (nc == columnRslt_biz_key5) doRslt_biz_key5_NC(info);
		else if (nc == columnRslt_biz_key6) doRslt_biz_key6_NC(info);
		else if (nc == columnRslt_biz_key7) doRslt_biz_key7_NC(info);
		else if (nc == columnRslt_biz_key8) doRslt_biz_key8_NC(info);
		else if (nc == columnRslt_biz_key9) doRslt_biz_key9_NC(info);
		else if (nc == columnRslt_biz_key10) doRslt_biz_key10_NC(info);
		else if (nc == columnRslt_dt) doRslt_dt_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == columnRslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == columnRslt_amt) doRslt_amt_NC(info);
		else if (nc == columnRslt_fs_flg) doRslt_fs_flg_NC(info);
		else if (nc == columnRslt_doc_id) doRslt_doc_id_NC(info);
		else if (nc == columnRslt_preview_url) doRslt_preview_url_NC(info);
		else if (nc == columnRslt_rmrks1) doRslt_rmrks1_NC(info);
		else if (nc == columnRslt_rmrks2) doRslt_rmrks2_NC(info);
		else if (nc == columnRslt_rmrks3) doRslt_rmrks3_NC(info);
		else if (nc == columnRslt_rmrks4) doRslt_rmrks4_NC(info);
		else if (nc == columnRslt_rmrks5) doRslt_rmrks5_NC(info);
		else if (nc == columnRslt_rpt_attr1) doRslt_rpt_attr1_NC(info);
		else if (nc == columnRslt_rpt_attr2) doRslt_rpt_attr2_NC(info);
		else if (nc == columnRslt_rpt_attr3) doRslt_rpt_attr3_NC(info);
		else if (nc == columnRslt_rpt_attr4) doRslt_rpt_attr4_NC(info);
		else if (nc == columnRslt_rpt_attr5) doRslt_rpt_attr5_NC(info);
		else if (nc == columnRslt_rpt_attr6) doRslt_rpt_attr6_NC(info);
		else if (nc == columnRslt_rpt_attr7) doRslt_rpt_attr7_NC(info);
		else if (nc == columnRslt_rpt_attr8) doRslt_rpt_attr8_NC(info);
		else if (nc == columnRslt_rpt_attr9) doRslt_rpt_attr9_NC(info);
		else if (nc == columnRslt_rpt_attr10) doRslt_rpt_attr10_NC(info);
		else if (nc == columnRslt_rpt_attr11) doRslt_rpt_attr11_NC(info);
		else if (nc == columnRslt_rpt_attr12) doRslt_rpt_attr12_NC(info);
		else if (nc == columnRslt_rpt_attr13) doRslt_rpt_attr13_NC(info);
		else if (nc == columnRslt_rpt_attr14) doRslt_rpt_attr14_NC(info);
		else if (nc == columnRslt_rpt_attr15) doRslt_rpt_attr15_NC(info);
		else if (nc == columnRslt_rpt_attr16) doRslt_rpt_attr16_NC(info);
		else if (nc == columnRslt_rpt_attr17) doRslt_rpt_attr17_NC(info);
		else if (nc == columnRslt_rpt_attr18) doRslt_rpt_attr18_NC(info);
		else if (nc == columnRslt_rpt_attr19) doRslt_rpt_attr19_NC(info);
		else if (nc == columnRslt_rpt_attr20) doRslt_rpt_attr20_NC(info);
		else if (nc == columnRslt_data_crud_typ) doRslt_data_crud_typ_NC(info);
		else if (nc == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
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
	 * [Cnd]パネルの[biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_id_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_old_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_old_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr11_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr12_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr13_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr14_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr15_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr16_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr17_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr18_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr19_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == Cnd_biz_typ) doCnd_biz_typ_NE(info);
		else if (ne == Cnd_biz_typ_nm) doCnd_biz_typ_nm_NE(info);
		else if (ne == Cnd_report_id) doCnd_report_id_NE(info);
		else if (ne == Cnd_report_nm) doCnd_report_nm_NE(info);
		else if (ne == Cnd_file_nm) doCnd_file_nm_NE(info);
		else if (ne == Cnd_dt_fr) doCnd_dt_fr_NE(info);
		else if (ne == Cnd_dt_to) doCnd_dt_to_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_amt_fr) doCnd_amt_fr_NE(info);
		else if (ne == Cnd_amt_to) doCnd_amt_to_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_data_no) doCnd_data_no_NE(info);
		else if (ne == Cnd_data_crud_typ) doCnd_data_crud_typ_NE(info);
		else if (ne == Cnd_data_crud_typ_nm) doCnd_data_crud_typ_nm_NE(info);
		else if (ne == Cnd_disp_old_flg) doCnd_disp_old_flg_NE(info);
		else if (ne == Cnd_biz_key1) doCnd_biz_key1_NE(info);
		else if (ne == Cnd_biz_key2) doCnd_biz_key2_NE(info);
		else if (ne == Cnd_biz_key3) doCnd_biz_key3_NE(info);
		else if (ne == Cnd_biz_key4) doCnd_biz_key4_NE(info);
		else if (ne == Cnd_biz_key5) doCnd_biz_key5_NE(info);
		else if (ne == Cnd_biz_key6) doCnd_biz_key6_NE(info);
		else if (ne == Cnd_biz_key7) doCnd_biz_key7_NE(info);
		else if (ne == Cnd_biz_key8) doCnd_biz_key8_NE(info);
		else if (ne == Cnd_biz_key9) doCnd_biz_key9_NE(info);
		else if (ne == Cnd_biz_key10) doCnd_biz_key10_NE(info);
		else if (ne == Cnd_rmrks1) doCnd_rmrks1_NE(info);
		else if (ne == Cnd_rmrks2) doCnd_rmrks2_NE(info);
		else if (ne == Cnd_rmrks3) doCnd_rmrks3_NE(info);
		else if (ne == Cnd_rmrks4) doCnd_rmrks4_NE(info);
		else if (ne == Cnd_rmrks5) doCnd_rmrks5_NE(info);
		else if (ne == Cnd_rpt_attr1) doCnd_rpt_attr1_NE(info);
		else if (ne == Cnd_rpt_attr2) doCnd_rpt_attr2_NE(info);
		else if (ne == Cnd_rpt_attr3) doCnd_rpt_attr3_NE(info);
		else if (ne == Cnd_rpt_attr4) doCnd_rpt_attr4_NE(info);
		else if (ne == Cnd_rpt_attr5) doCnd_rpt_attr5_NE(info);
		else if (ne == Cnd_rpt_attr6) doCnd_rpt_attr6_NE(info);
		else if (ne == Cnd_rpt_attr7) doCnd_rpt_attr7_NE(info);
		else if (ne == Cnd_rpt_attr8) doCnd_rpt_attr8_NE(info);
		else if (ne == Cnd_rpt_attr9) doCnd_rpt_attr9_NE(info);
		else if (ne == Cnd_rpt_attr10) doCnd_rpt_attr10_NE(info);
		else if (ne == Cnd_rpt_attr11) doCnd_rpt_attr11_NE(info);
		else if (ne == Cnd_rpt_attr12) doCnd_rpt_attr12_NE(info);
		else if (ne == Cnd_rpt_attr13) doCnd_rpt_attr13_NE(info);
		else if (ne == Cnd_rpt_attr14) doCnd_rpt_attr14_NE(info);
		else if (ne == Cnd_rpt_attr15) doCnd_rpt_attr15_NE(info);
		else if (ne == Cnd_rpt_attr16) doCnd_rpt_attr16_NE(info);
		else if (ne == Cnd_rpt_attr17) doCnd_rpt_attr17_NE(info);
		else if (ne == Cnd_rpt_attr18) doCnd_rpt_attr18_NE(info);
		else if (ne == Cnd_rpt_attr19) doCnd_rpt_attr19_NE(info);
		else if (ne == Cnd_rpt_attr20) doCnd_rpt_attr20_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_edition) doRslt_edition_NE(info);
		else if (ne == columnRslt_file_path) doRslt_file_path_NE(info);
		else if (ne == columnRslt_file_nm) doRslt_file_nm_NE(info);
		else if (ne == columnRslt_report_id) doRslt_report_id_NE(info);
		else if (ne == columnRslt_report_nm) doRslt_report_nm_NE(info);
		else if (ne == columnRslt_biz_typ) doRslt_biz_typ_NE(info);
		else if (ne == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NE(info);
		else if (ne == columnRslt_biz_key1) doRslt_biz_key1_NE(info);
		else if (ne == columnRslt_biz_key2) doRslt_biz_key2_NE(info);
		else if (ne == columnRslt_biz_key3) doRslt_biz_key3_NE(info);
		else if (ne == columnRslt_biz_key4) doRslt_biz_key4_NE(info);
		else if (ne == columnRslt_biz_key5) doRslt_biz_key5_NE(info);
		else if (ne == columnRslt_biz_key6) doRslt_biz_key6_NE(info);
		else if (ne == columnRslt_biz_key7) doRslt_biz_key7_NE(info);
		else if (ne == columnRslt_biz_key8) doRslt_biz_key8_NE(info);
		else if (ne == columnRslt_biz_key9) doRslt_biz_key9_NE(info);
		else if (ne == columnRslt_biz_key10) doRslt_biz_key10_NE(info);
		else if (ne == columnRslt_dt) doRslt_dt_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == columnRslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == columnRslt_amt) doRslt_amt_NE(info);
		else if (ne == columnRslt_fs_flg) doRslt_fs_flg_NE(info);
		else if (ne == columnRslt_doc_id) doRslt_doc_id_NE(info);
		else if (ne == columnRslt_preview_url) doRslt_preview_url_NE(info);
		else if (ne == columnRslt_rmrks1) doRslt_rmrks1_NE(info);
		else if (ne == columnRslt_rmrks2) doRslt_rmrks2_NE(info);
		else if (ne == columnRslt_rmrks3) doRslt_rmrks3_NE(info);
		else if (ne == columnRslt_rmrks4) doRslt_rmrks4_NE(info);
		else if (ne == columnRslt_rmrks5) doRslt_rmrks5_NE(info);
		else if (ne == columnRslt_rpt_attr1) doRslt_rpt_attr1_NE(info);
		else if (ne == columnRslt_rpt_attr2) doRslt_rpt_attr2_NE(info);
		else if (ne == columnRslt_rpt_attr3) doRslt_rpt_attr3_NE(info);
		else if (ne == columnRslt_rpt_attr4) doRslt_rpt_attr4_NE(info);
		else if (ne == columnRslt_rpt_attr5) doRslt_rpt_attr5_NE(info);
		else if (ne == columnRslt_rpt_attr6) doRslt_rpt_attr6_NE(info);
		else if (ne == columnRslt_rpt_attr7) doRslt_rpt_attr7_NE(info);
		else if (ne == columnRslt_rpt_attr8) doRslt_rpt_attr8_NE(info);
		else if (ne == columnRslt_rpt_attr9) doRslt_rpt_attr9_NE(info);
		else if (ne == columnRslt_rpt_attr10) doRslt_rpt_attr10_NE(info);
		else if (ne == columnRslt_rpt_attr11) doRslt_rpt_attr11_NE(info);
		else if (ne == columnRslt_rpt_attr12) doRslt_rpt_attr12_NE(info);
		else if (ne == columnRslt_rpt_attr13) doRslt_rpt_attr13_NE(info);
		else if (ne == columnRslt_rpt_attr14) doRslt_rpt_attr14_NE(info);
		else if (ne == columnRslt_rpt_attr15) doRslt_rpt_attr15_NE(info);
		else if (ne == columnRslt_rpt_attr16) doRslt_rpt_attr16_NE(info);
		else if (ne == columnRslt_rpt_attr17) doRslt_rpt_attr17_NE(info);
		else if (ne == columnRslt_rpt_attr18) doRslt_rpt_attr18_NE(info);
		else if (ne == columnRslt_rpt_attr19) doRslt_rpt_attr19_NE(info);
		else if (ne == columnRslt_rpt_attr20) doRslt_rpt_attr20_NE(info);
		else if (ne == columnRslt_data_crud_typ) doRslt_data_crud_typ_NE(info);
		else if (ne == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
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
	 * [Cnd]パネルの[biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_id_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_old_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_old_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr11_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr12_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr13_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr14_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr15_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr16_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr17_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr18_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr19_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == Cnd_biz_typ) doCnd_biz_typ_NX(info);
		else if (nx == Cnd_biz_typ_nm) doCnd_biz_typ_nm_NX(info);
		else if (nx == Cnd_report_id) doCnd_report_id_NX(info);
		else if (nx == Cnd_report_nm) doCnd_report_nm_NX(info);
		else if (nx == Cnd_file_nm) doCnd_file_nm_NX(info);
		else if (nx == Cnd_dt_fr) doCnd_dt_fr_NX(info);
		else if (nx == Cnd_dt_to) doCnd_dt_to_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_amt_fr) doCnd_amt_fr_NX(info);
		else if (nx == Cnd_amt_to) doCnd_amt_to_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_data_no) doCnd_data_no_NX(info);
		else if (nx == Cnd_data_crud_typ) doCnd_data_crud_typ_NX(info);
		else if (nx == Cnd_data_crud_typ_nm) doCnd_data_crud_typ_nm_NX(info);
		else if (nx == Cnd_disp_old_flg) doCnd_disp_old_flg_NX(info);
		else if (nx == Cnd_biz_key1) doCnd_biz_key1_NX(info);
		else if (nx == Cnd_biz_key2) doCnd_biz_key2_NX(info);
		else if (nx == Cnd_biz_key3) doCnd_biz_key3_NX(info);
		else if (nx == Cnd_biz_key4) doCnd_biz_key4_NX(info);
		else if (nx == Cnd_biz_key5) doCnd_biz_key5_NX(info);
		else if (nx == Cnd_biz_key6) doCnd_biz_key6_NX(info);
		else if (nx == Cnd_biz_key7) doCnd_biz_key7_NX(info);
		else if (nx == Cnd_biz_key8) doCnd_biz_key8_NX(info);
		else if (nx == Cnd_biz_key9) doCnd_biz_key9_NX(info);
		else if (nx == Cnd_biz_key10) doCnd_biz_key10_NX(info);
		else if (nx == Cnd_rmrks1) doCnd_rmrks1_NX(info);
		else if (nx == Cnd_rmrks2) doCnd_rmrks2_NX(info);
		else if (nx == Cnd_rmrks3) doCnd_rmrks3_NX(info);
		else if (nx == Cnd_rmrks4) doCnd_rmrks4_NX(info);
		else if (nx == Cnd_rmrks5) doCnd_rmrks5_NX(info);
		else if (nx == Cnd_rpt_attr1) doCnd_rpt_attr1_NX(info);
		else if (nx == Cnd_rpt_attr2) doCnd_rpt_attr2_NX(info);
		else if (nx == Cnd_rpt_attr3) doCnd_rpt_attr3_NX(info);
		else if (nx == Cnd_rpt_attr4) doCnd_rpt_attr4_NX(info);
		else if (nx == Cnd_rpt_attr5) doCnd_rpt_attr5_NX(info);
		else if (nx == Cnd_rpt_attr6) doCnd_rpt_attr6_NX(info);
		else if (nx == Cnd_rpt_attr7) doCnd_rpt_attr7_NX(info);
		else if (nx == Cnd_rpt_attr8) doCnd_rpt_attr8_NX(info);
		else if (nx == Cnd_rpt_attr9) doCnd_rpt_attr9_NX(info);
		else if (nx == Cnd_rpt_attr10) doCnd_rpt_attr10_NX(info);
		else if (nx == Cnd_rpt_attr11) doCnd_rpt_attr11_NX(info);
		else if (nx == Cnd_rpt_attr12) doCnd_rpt_attr12_NX(info);
		else if (nx == Cnd_rpt_attr13) doCnd_rpt_attr13_NX(info);
		else if (nx == Cnd_rpt_attr14) doCnd_rpt_attr14_NX(info);
		else if (nx == Cnd_rpt_attr15) doCnd_rpt_attr15_NX(info);
		else if (nx == Cnd_rpt_attr16) doCnd_rpt_attr16_NX(info);
		else if (nx == Cnd_rpt_attr17) doCnd_rpt_attr17_NX(info);
		else if (nx == Cnd_rpt_attr18) doCnd_rpt_attr18_NX(info);
		else if (nx == Cnd_rpt_attr19) doCnd_rpt_attr19_NX(info);
		else if (nx == Cnd_rpt_attr20) doCnd_rpt_attr20_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_edition) doRslt_edition_NX(info);
		else if (nx == columnRslt_file_path) doRslt_file_path_NX(info);
		else if (nx == columnRslt_file_nm) doRslt_file_nm_NX(info);
		else if (nx == columnRslt_report_id) doRslt_report_id_NX(info);
		else if (nx == columnRslt_report_nm) doRslt_report_nm_NX(info);
		else if (nx == columnRslt_biz_typ) doRslt_biz_typ_NX(info);
		else if (nx == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_NX(info);
		else if (nx == columnRslt_biz_key1) doRslt_biz_key1_NX(info);
		else if (nx == columnRslt_biz_key2) doRslt_biz_key2_NX(info);
		else if (nx == columnRslt_biz_key3) doRslt_biz_key3_NX(info);
		else if (nx == columnRslt_biz_key4) doRslt_biz_key4_NX(info);
		else if (nx == columnRslt_biz_key5) doRslt_biz_key5_NX(info);
		else if (nx == columnRslt_biz_key6) doRslt_biz_key6_NX(info);
		else if (nx == columnRslt_biz_key7) doRslt_biz_key7_NX(info);
		else if (nx == columnRslt_biz_key8) doRslt_biz_key8_NX(info);
		else if (nx == columnRslt_biz_key9) doRslt_biz_key9_NX(info);
		else if (nx == columnRslt_biz_key10) doRslt_biz_key10_NX(info);
		else if (nx == columnRslt_dt) doRslt_dt_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == columnRslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == columnRslt_amt) doRslt_amt_NX(info);
		else if (nx == columnRslt_fs_flg) doRslt_fs_flg_NX(info);
		else if (nx == columnRslt_doc_id) doRslt_doc_id_NX(info);
		else if (nx == columnRslt_preview_url) doRslt_preview_url_NX(info);
		else if (nx == columnRslt_rmrks1) doRslt_rmrks1_NX(info);
		else if (nx == columnRslt_rmrks2) doRslt_rmrks2_NX(info);
		else if (nx == columnRslt_rmrks3) doRslt_rmrks3_NX(info);
		else if (nx == columnRslt_rmrks4) doRslt_rmrks4_NX(info);
		else if (nx == columnRslt_rmrks5) doRslt_rmrks5_NX(info);
		else if (nx == columnRslt_rpt_attr1) doRslt_rpt_attr1_NX(info);
		else if (nx == columnRslt_rpt_attr2) doRslt_rpt_attr2_NX(info);
		else if (nx == columnRslt_rpt_attr3) doRslt_rpt_attr3_NX(info);
		else if (nx == columnRslt_rpt_attr4) doRslt_rpt_attr4_NX(info);
		else if (nx == columnRslt_rpt_attr5) doRslt_rpt_attr5_NX(info);
		else if (nx == columnRslt_rpt_attr6) doRslt_rpt_attr6_NX(info);
		else if (nx == columnRslt_rpt_attr7) doRslt_rpt_attr7_NX(info);
		else if (nx == columnRslt_rpt_attr8) doRslt_rpt_attr8_NX(info);
		else if (nx == columnRslt_rpt_attr9) doRslt_rpt_attr9_NX(info);
		else if (nx == columnRslt_rpt_attr10) doRslt_rpt_attr10_NX(info);
		else if (nx == columnRslt_rpt_attr11) doRslt_rpt_attr11_NX(info);
		else if (nx == columnRslt_rpt_attr12) doRslt_rpt_attr12_NX(info);
		else if (nx == columnRslt_rpt_attr13) doRslt_rpt_attr13_NX(info);
		else if (nx == columnRslt_rpt_attr14) doRslt_rpt_attr14_NX(info);
		else if (nx == columnRslt_rpt_attr15) doRslt_rpt_attr15_NX(info);
		else if (nx == columnRslt_rpt_attr16) doRslt_rpt_attr16_NX(info);
		else if (nx == columnRslt_rpt_attr17) doRslt_rpt_attr17_NX(info);
		else if (nx == columnRslt_rpt_attr18) doRslt_rpt_attr18_NX(info);
		else if (nx == columnRslt_rpt_attr19) doRslt_rpt_attr19_NX(info);
		else if (nx == columnRslt_rpt_attr20) doRslt_rpt_attr20_NX(info);
		else if (nx == columnRslt_data_crud_typ) doRslt_data_crud_typ_NX(info);
		else if (nx == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
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
	 * [Cnd]パネルの[biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_id_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_old_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_old_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr11_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr12_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr13_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr14_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr15_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr16_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr17_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr18_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr19_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fs_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fs_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_biz_typ) doCnd_biz_typ_LC(info);
		else if (lc == Cnd_biz_typ_nm) doCnd_biz_typ_nm_LC(info);
		else if (lc == Cnd_report_id) doCnd_report_id_LC(info);
		else if (lc == Cnd_report_nm) doCnd_report_nm_LC(info);
		else if (lc == Cnd_file_nm) doCnd_file_nm_LC(info);
		else if (lc == Cnd_dt_fr) doCnd_dt_fr_LC(info);
		else if (lc == Cnd_dt_to) doCnd_dt_to_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_amt_fr) doCnd_amt_fr_LC(info);
		else if (lc == Cnd_amt_to) doCnd_amt_to_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_data_no) doCnd_data_no_LC(info);
		else if (lc == Cnd_data_crud_typ) doCnd_data_crud_typ_LC(info);
		else if (lc == Cnd_data_crud_typ_nm) doCnd_data_crud_typ_nm_LC(info);
		else if (lc == Cnd_biz_key1) doCnd_biz_key1_LC(info);
		else if (lc == Cnd_biz_key2) doCnd_biz_key2_LC(info);
		else if (lc == Cnd_biz_key3) doCnd_biz_key3_LC(info);
		else if (lc == Cnd_biz_key4) doCnd_biz_key4_LC(info);
		else if (lc == Cnd_biz_key5) doCnd_biz_key5_LC(info);
		else if (lc == Cnd_biz_key6) doCnd_biz_key6_LC(info);
		else if (lc == Cnd_biz_key7) doCnd_biz_key7_LC(info);
		else if (lc == Cnd_biz_key8) doCnd_biz_key8_LC(info);
		else if (lc == Cnd_biz_key9) doCnd_biz_key9_LC(info);
		else if (lc == Cnd_biz_key10) doCnd_biz_key10_LC(info);
		else if (lc == Cnd_rmrks1) doCnd_rmrks1_LC(info);
		else if (lc == Cnd_rmrks2) doCnd_rmrks2_LC(info);
		else if (lc == Cnd_rmrks3) doCnd_rmrks3_LC(info);
		else if (lc == Cnd_rmrks4) doCnd_rmrks4_LC(info);
		else if (lc == Cnd_rmrks5) doCnd_rmrks5_LC(info);
		else if (lc == Cnd_rpt_attr1) doCnd_rpt_attr1_LC(info);
		else if (lc == Cnd_rpt_attr2) doCnd_rpt_attr2_LC(info);
		else if (lc == Cnd_rpt_attr3) doCnd_rpt_attr3_LC(info);
		else if (lc == Cnd_rpt_attr4) doCnd_rpt_attr4_LC(info);
		else if (lc == Cnd_rpt_attr5) doCnd_rpt_attr5_LC(info);
		else if (lc == Cnd_rpt_attr6) doCnd_rpt_attr6_LC(info);
		else if (lc == Cnd_rpt_attr7) doCnd_rpt_attr7_LC(info);
		else if (lc == Cnd_rpt_attr8) doCnd_rpt_attr8_LC(info);
		else if (lc == Cnd_rpt_attr9) doCnd_rpt_attr9_LC(info);
		else if (lc == Cnd_rpt_attr10) doCnd_rpt_attr10_LC(info);
		else if (lc == Cnd_rpt_attr11) doCnd_rpt_attr11_LC(info);
		else if (lc == Cnd_rpt_attr12) doCnd_rpt_attr12_LC(info);
		else if (lc == Cnd_rpt_attr13) doCnd_rpt_attr13_LC(info);
		else if (lc == Cnd_rpt_attr14) doCnd_rpt_attr14_LC(info);
		else if (lc == Cnd_rpt_attr15) doCnd_rpt_attr15_LC(info);
		else if (lc == Cnd_rpt_attr16) doCnd_rpt_attr16_LC(info);
		else if (lc == Cnd_rpt_attr17) doCnd_rpt_attr17_LC(info);
		else if (lc == Cnd_rpt_attr18) doCnd_rpt_attr18_LC(info);
		else if (lc == Cnd_rpt_attr19) doCnd_rpt_attr19_LC(info);
		else if (lc == Cnd_rpt_attr20) doCnd_rpt_attr20_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_edition) doRslt_edition_LC(info);
		else if (lc == columnRslt_file_path) doRslt_file_path_LC(info);
		else if (lc == columnRslt_file_nm) doRslt_file_nm_LC(info);
		else if (lc == columnRslt_report_id) doRslt_report_id_LC(info);
		else if (lc == columnRslt_report_nm) doRslt_report_nm_LC(info);
		else if (lc == columnRslt_biz_typ) doRslt_biz_typ_LC(info);
		else if (lc == columnRslt_biz_typ_nm) doRslt_biz_typ_nm_LC(info);
		else if (lc == columnRslt_biz_key1) doRslt_biz_key1_LC(info);
		else if (lc == columnRslt_biz_key2) doRslt_biz_key2_LC(info);
		else if (lc == columnRslt_biz_key3) doRslt_biz_key3_LC(info);
		else if (lc == columnRslt_biz_key4) doRslt_biz_key4_LC(info);
		else if (lc == columnRslt_biz_key5) doRslt_biz_key5_LC(info);
		else if (lc == columnRslt_biz_key6) doRslt_biz_key6_LC(info);
		else if (lc == columnRslt_biz_key7) doRslt_biz_key7_LC(info);
		else if (lc == columnRslt_biz_key8) doRslt_biz_key8_LC(info);
		else if (lc == columnRslt_biz_key9) doRslt_biz_key9_LC(info);
		else if (lc == columnRslt_biz_key10) doRslt_biz_key10_LC(info);
		else if (lc == columnRslt_dt) doRslt_dt_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == columnRslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == columnRslt_amt) doRslt_amt_LC(info);
		else if (lc == columnRslt_doc_id) doRslt_doc_id_LC(info);
		else if (lc == columnRslt_preview_url) doRslt_preview_url_LC(info);
		else if (lc == columnRslt_rmrks1) doRslt_rmrks1_LC(info);
		else if (lc == columnRslt_rmrks2) doRslt_rmrks2_LC(info);
		else if (lc == columnRslt_rmrks3) doRslt_rmrks3_LC(info);
		else if (lc == columnRslt_rmrks4) doRslt_rmrks4_LC(info);
		else if (lc == columnRslt_rmrks5) doRslt_rmrks5_LC(info);
		else if (lc == columnRslt_rpt_attr1) doRslt_rpt_attr1_LC(info);
		else if (lc == columnRslt_rpt_attr2) doRslt_rpt_attr2_LC(info);
		else if (lc == columnRslt_rpt_attr3) doRslt_rpt_attr3_LC(info);
		else if (lc == columnRslt_rpt_attr4) doRslt_rpt_attr4_LC(info);
		else if (lc == columnRslt_rpt_attr5) doRslt_rpt_attr5_LC(info);
		else if (lc == columnRslt_rpt_attr6) doRslt_rpt_attr6_LC(info);
		else if (lc == columnRslt_rpt_attr7) doRslt_rpt_attr7_LC(info);
		else if (lc == columnRslt_rpt_attr8) doRslt_rpt_attr8_LC(info);
		else if (lc == columnRslt_rpt_attr9) doRslt_rpt_attr9_LC(info);
		else if (lc == columnRslt_rpt_attr10) doRslt_rpt_attr10_LC(info);
		else if (lc == columnRslt_rpt_attr11) doRslt_rpt_attr11_LC(info);
		else if (lc == columnRslt_rpt_attr12) doRslt_rpt_attr12_LC(info);
		else if (lc == columnRslt_rpt_attr13) doRslt_rpt_attr13_LC(info);
		else if (lc == columnRslt_rpt_attr14) doRslt_rpt_attr14_LC(info);
		else if (lc == columnRslt_rpt_attr15) doRslt_rpt_attr15_LC(info);
		else if (lc == columnRslt_rpt_attr16) doRslt_rpt_attr16_LC(info);
		else if (lc == columnRslt_rpt_attr17) doRslt_rpt_attr17_LC(info);
		else if (lc == columnRslt_rpt_attr18) doRslt_rpt_attr18_LC(info);
		else if (lc == columnRslt_rpt_attr19) doRslt_rpt_attr19_LC(info);
		else if (lc == columnRslt_rpt_attr20) doRslt_rpt_attr20_LC(info);
		else if (lc == columnRslt_data_crud_typ) doRslt_data_crud_typ_LC(info);
		else if (lc == columnRslt_data_crud_typ_nm) doRslt_data_crud_typ_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_id_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[report_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_report_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[amt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[amt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_amt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[data_crud_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_data_crud_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[biz_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_biz_key10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rmrks5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rmrks5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr11_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr12_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr13_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr14_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr15_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr16_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr17_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr18_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr19_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_attr20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_attr20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[edition]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_edition_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_path]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_path_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[file_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_file_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[report_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_report_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[biz_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_biz_key10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[doc_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_doc_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[preview_url]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_preview_url_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr11_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr12_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr13_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr14_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr15_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr16_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr17_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr18_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr19_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rpt_attr20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rpt_attr20_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_crud_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_crud_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_biz_typ]の作成メソッド
	 */
	public MCList getCnd_biz_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBizTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_report_id]の作成メソッド
	 */
	public MCList getCnd_report_id(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrgTgtReport(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_data_crud_typ]の作成メソッド
	 */
	public MCList getCnd_data_crud_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDataCrudTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBCL0010.Srch01")) {
			return new MB_MBBCL0010_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBCL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBCL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBCL0010_Srch01;

		/** コンストラクタ */
		protected MB_MBBCL0010_Srch01Bridge() {
			p_MB_MBBCL0010_Srch01 = new MCParam(PDef.MB_MBBCL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBCL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBC.MBBCP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0010.RsltR.class));

			p_MB_MBBCL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBCL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBCL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBCL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBCL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBC.MBBCP0010.CndR up0() {
			return (mcframe.clientMBBC.MBBCP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBC.MBBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMBBC.MBBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBCL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMBBC.MBBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBCL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBC.MBBCP0010.RsltR>)p_MB_MBBCL0010_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}