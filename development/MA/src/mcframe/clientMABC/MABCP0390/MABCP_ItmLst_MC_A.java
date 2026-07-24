package mcframe.clientMABC.MABCP0390;

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
import mcframe.clientMABC.MABCP0390.MABCP_ItmLst_MC.MA_MABCL0390_Srch01Caller;
import mcframe.clientMABC.MABCP0390.MABCP_ItmLst_MC.MA_MABCL0390_Upd01Caller;

/**
 * 画面"MABCP_ItmLst"パネルクラスです。<p>
 *
 * 品目の検索を行う<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ItmLst_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0390";

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
	// [TargetSrch]ブロック関連のField定義
	public MCPanel TargetSrchPanel = null;
	public MCTitledBorder TargetSrchTitledBorder = null;
	// [TargetSrch]ブロックの項目のField定義
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
	 * UPD,Create/Modify,0;UPD_ADMIN,Create/Modify (Administrator),2;REF,View,3 UPD,登録・訂正する,0;UPD_ADMIN,登録・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_UPD_ADMIN = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * COM,Company column only,1;ALL,Include common column,2 COM,会社項目のみ,1;ALL,共通項目含む,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_tar_Group = null;
	public MCRadioButton Cnd_tar_COM = null;
	public MCRadioButton Cnd_tar_ALL = null;
	/**
	 * Own company 自社.<p>
	 *
	 */
	public MCLabel Cnd_own_co_flg_lab = null;
	/**
	 * Own company non-entry 自社.未登録.<p>
	 *
	 */
	public MCCheckBox Cnd_own_co_flg_off = null;
	/**
	 * Own company. entered 自社.登録済.<p>
	 *
	 */
	public MCCheckBox Cnd_own_co_flg_on = null;
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
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_stk_mng_typ_Label = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_mng_typ_nm = null;
	public MCLabel Cnd_asset_mng_typ_Label = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_asset_mng_typ_nm = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCLabel Cnd_sundry_itm_flg_lab = null;
	/**
	 * Miscellaneous item. Off 諸口品.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_off = null;
	/**
	 * Miscellaneous item. On 諸口品.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_sundry_itm_flg_on = null;
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
	 * Search image 画像検索.<p>
	 *
	 */
	public MCCheckBox Cnd_th_image_flg = null;
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
	/**
	 * Update company only 会社のみ更新.<p>
	 *
	 */
	public MCCheckBox Cnd_upd_only_com_flg = null;
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0390.DtlR> DtlTable = null;
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
	 * Release リリース.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_flg = null;
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_cd = null;
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub1 = null;
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub2 = null;
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub3 = null;
	/**
	 * Item name 品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_nm = null;
	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_nm = null;
	/**
	 * Item alias name 1 品目別名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_alt_nm1 = null;
	/**
	 * Item alias name 2 品目別名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_alt_nm2 = null;
	/**
	 * Item alias name 3 品目別名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_alt_nm3 = null;
	/**
	 * Item alias name 4 品目別名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_alt_nm4 = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ_nm = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ_nm = null;
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
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rnd_typ = null;
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rnd_typ_nm = null;
	/**
	 * Volume unit cd. 容積単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dim_unit_cd = null;
	/**
	 * Volume unit name 容積単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dim_unit_nm = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dim = null;
	/**
	 * Weight unit cd. 重量単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wt_unit_cd = null;
	/**
	 * Weight unit name 重量単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wt_unit_nm = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wt = null;
	/**
	 * Conversion unit cd. 入り目単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_conts_unit_cd = null;
	/**
	 * Conversion unit name 入り目単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_conts_unit_nm = null;
	/**
	 * Conversion qty. 入り目数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_conts_qty = null;
	/**
	 * Unit volume (m3) 単位容積（ｍ３）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_dim = null;
	/**
	 * Unit weight (KG) 単位重量（ＫＧ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_wt = null;
	/**
	 * Sales item system cd. 販売品目体系ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_cd = null;
	/**
	 * Sales item system name 販売品目体系名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_itm_grp_nm = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm10 = null;
	/**
	 * HS cd. ＨＳ ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_hs_cd = null;
	/**
	 * HS content ＨＳ内容.<p>
	 *
	 */
	public MCColumnConfig columnDtl_hs_nm = null;
	/**
	 * JAN type ＪＡＮ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jan_typ = null;
	/**
	 * JAN type name ＪＡＮ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jan_typ_nm = null;
	/**
	 * JAN cd. ＪＡＮ ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jan_cd = null;
	/**
	 * ITF cd. ＩＴＦ ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itf_cd = null;
	/**
	 * GTIN cd. ＧＴＩＮ ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gtin_cd = null;
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
	 * Entry user ID (Common) 登録ユーザＩＤ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id_c = null;
	/**
	 * Entry user name (Common) 登録ユーザ名（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm_c = null;
	/**
	 * Entry date and time (Common) 登録日時（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts_c = null;
	/**
	 * Entry function ID (Common) 登録機能ＩＤ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id_c = null;
	/**
	 * Entry function name (Common) 登録機能名（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm_c = null;
	/**
	 * Update counter (Common) 更新カウンタ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr_c = null;
	/**
	 * Update user ID (Common) 更新ユーザＩＤ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id_c = null;
	/**
	 * Update user name (Common) 更新ユーザ名（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm_c = null;
	/**
	 * Update date and time (Common) 更新日時（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts_c = null;
	/**
	 * Update function ID (Common) 更新機能ＩＤ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id_c = null;
	/**
	 * Update function name (Common) 更新機能名（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm_c = null;
	/**
	 * Update request No. (Common) 更新リクエストＮＯ（共通）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no_c = null;
	/**
	 * Company cd. 会社ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_co_cd = null;
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
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_nm = null;
	/**
	 * Accounting item classification cd. 会計品目分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_itm_grp_cd = null;
	/**
	 * Accounting item classification name 会計品目分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_itm_grp_nm = null;
	/**
	 * Accept negative inventory マイナス在庫許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_stk_flg = null;
	/**
	 * Check GI allocation 出庫引当確認.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gi_alloc_flg = null;
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_tax_cd = null;
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_tax_nm = null;
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_cd = null;
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_nm = null;
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_tax_cd = null;
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_tax_nm = null;
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wtax_rate = null;
	/**
	 * Shipping unit cd. 出荷単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_unit_cd = null;
	/**
	 * Shipping unit name 出荷単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_unit_nm = null;
	/**
	 * Mfg. unit cd. 製造単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_unit_cd = null;
	/**
	 * Mfg. unit name 製造単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_unit_nm = null;
	/**
	 * PO unit cd. 発注単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_unit_cd = null;
	/**
	 * PO unit name 発注単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_unit_nm = null;
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_cd = null;
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pckg_unit_nm = null;
	/**
	 * SKU allocation 荷姿引当.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_alloc_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ_nm = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_typ = null;
	/**
	 * Lot No. numbering type name ロットＮＯ発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_typ_nm = null;
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_ptn_cd = null;
	/**
	 * Lot No. numbering pattern name ロットＮＯ発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_ptn_nm = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ_nm = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_typ = null;
	/**
	 * Sublot No. numbering type name サブロットＮＯ発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_typ_nm = null;
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_ptn_cd = null;
	/**
	 * Sublot No. numbering pattern name サブロットＮＯ発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_ptn_nm = null;
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_new_lot_flg = null;
	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_lot_flg = null;
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_bind_typ = null;
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_bind_typ_nm = null;
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_skip_chk_ship_flg = null;
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrkt_judg_flg = null;
	/**
	 * Market release decision approval role cd. 市場出荷判定承認役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrkt_judg_role_cd = null;
	/**
	 * Market release decision approval role name 市場出荷判定承認役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrkt_judg_role_nm = null;
	/**
	 * Market release decision update role cd. 市場出荷判定更新役割ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrkt_judg_upd_role_cd = null;
	/**
	 * Market release decision updating role name 市場出荷判定更新役割名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrkt_judg_upd_role_nm = null;
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lmt_ctl_flg = null;
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lmt_ctl_categ = null;
	/**
	 * Prohibit shipping lot reversal 出荷ロット逆転禁止.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_lot_back_stop_flg = null;
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_valid_grp_cd = null;
	/**
	 * Shipping expiration date group name 出荷有効期限グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_valid_grp_nm = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_cont_fctr = null;
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_unit_cd = null;
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_unit_nm = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	/**
	 * Rounding type name (Active ingredient conversion) 有効成分換算端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ_nm = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type name 手配ＮＯ１管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno1_flg = null;
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_sno1_flg = null;
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_num_typ = null;
	/**
	 * SEIBAN No. 1 numbering type name 手配ＮＯ１発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_num_typ_nm = null;
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_ptn_cd = null;
	/**
	 * SEIBAN No. 1 numbering pattern name 手配ＮＯ１発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_ptn_nm = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type name 手配ＮＯ２管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno2_flg = null;
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_sno2_flg = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type name 手配ＮＯ２発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_num_typ_nm = null;
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_ptn_cd = null;
	/**
	 * SEIBAN No. 2 numbering pattern name 手配ＮＯ２発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_ptn_nm = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type name 手配ＮＯ３管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno3_flg = null;
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_sno3_flg = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type name 手配ＮＯ３発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_num_typ_nm = null;
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_ptn_cd = null;
	/**
	 * SEIBAN No. 3 numbering pattern name 手配ＮＯ３発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_ptn_nm = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type name 手配ＮＯ４管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ_nm = null;
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_sno4_flg = null;
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_sno4_flg = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type name 手配ＮＯ４発番区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_num_typ_nm = null;
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_ptn_cd = null;
	/**
	 * SEIBAN No. 4 numbering pattern name 手配ＮＯ４発番パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_ptn_nm = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_bom_ptn = null;
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_unit_typ = null;
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_unit_typ_nm = null;
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrp_proc_typ = null;
	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrp_proc_typ_nm = null;
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqmt_typ_nm = null;
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prod_pln_typ = null;
	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prod_pln_typ_nm = null;
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dmnd_date_div_mons = null;
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_margin_days = null;
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrp_alloc_margin_days = null;
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mrp_opn_xfr_days = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_rqmt_rstr_qty_p_PPanel;
	public MCColumnConfig columnDtl_rqmt_rstr_qty;// [Dtl]の[rqmt_rstr_qty_p.qty]を[columnDtl_rqmt_rstr_qty]としてエイリアス定義。
	/**
	 * Allow input item addition 投入品追加許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_itm_add_flg = null;
	/**
	 * Allow input item deletion 投入品削除許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_itm_del_flg = null;
	/**
	 * Scheduler スケジューラ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sch_flg = null;
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
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ = null;
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_spec_typ_nm = null;
	/**
	 * Allow sales order configuration rev. 受注時構成改訂許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_rev_at_slo_flg = null;
	/**
	 * Configuration main item 構成主品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_comp_core_itm_flg = null;
	/**
	 * Item specification classification cd. 品目仕様分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_grp_cd = null;
	/**
	 * Item specification classification name 品目仕様分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_grp_nm = null;
	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_grp_cd = null;
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_grp_nm = null;
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_crryovr_times = null;
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_crryovr_times = null;
	/**
	 * Sales order procurement item 受注手配品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_proc_flg = null;
	/**
	 * Sales order procurement type 受注手配区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_proc_typ = null;
	/**
	 * Sales order procurement type name 受注手配区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_proc_typ_nm = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_typ = null;
	/**
	 * Shipping order type name 出荷指図区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_typ_nm = null;
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_ship_grp_cd = null;
	/**
	 * Item shipping group name 品目出荷グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_ship_grp_nm = null;
	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_skip_flg = null;
	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_dlv_slip_flg = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_term_nm = null;
	/**
	 * Import/export charges type 輸出入諸掛区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exim_xpns_typ = null;
	/**
	 * Import/export charges type name 輸出入諸掛区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_exim_xpns_typ_nm = null;
	/**
	 * For identification tag output 現品票出力対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_lst_flg = null;
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_cng_flg = null;
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_cng_flg = null;
	/**
	 * Allow supply unit price change 支給単価変更許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_upri_cng_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_ref_itm_p_PPanel;
	public MCColumnConfig columnDtl_ref_itm_cd;// [Dtl]の[ref_itm_p.itm_cd]を[columnDtl_ref_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_ref_itm_sub1;// [Dtl]の[ref_itm_p.itm_sub1]を[columnDtl_ref_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_ref_itm_sub2;// [Dtl]の[ref_itm_p.itm_sub2]を[columnDtl_ref_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_ref_itm_sub3;// [Dtl]の[ref_itm_p.itm_sub3]を[columnDtl_ref_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_ref_itm_nm;// [Dtl]の[ref_itm_p.itm_nm]を[columnDtl_ref_itm_nm]としてエイリアス定義。
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_no_itm = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chng_no = null;
	/**
	 * Calculation pattern cd. 計算パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ptn_cd = null;
	/**
	 * Calculation pattern name 計算パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ptn_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_std_qty_p_PPanel;
	public MCColumnConfig columnDtl_cost_std_qty;// [Dtl]の[std_qty_p.qty]を[columnDtl_cost_std_qty]としてエイリアス定義。
	/**
	 * Item allocation group 品目配賦グループ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alc_grp = null;
	/**
	 * Sales 販売.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_flg = null;
	/**
	 * Sales configured 販売設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_input_flg = null;
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_flg = null;
	/**
	 * Mfg. configured 製造設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_input_flg = null;
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_flg = null;
	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_input_flg = null;
	/**
	 * Inspection 検査.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_flg = null;
	/**
	 * Inspection configured 検査設定済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_input_flg = null;
	/**
	 * Release date and time リリース日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_release_tm = null;
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
	 * Check/Copy item master 品目系マスタ確認＆コピー.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABCP0870 = null;
	/**
	 * Item additional info. master entry 品目付加情報マスタ登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABCP0840 = null;
	/**
	 * Item release entry 品目リリース登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABCP0400 = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_admin = null;
	/**
	 * Update (Common) 更新する（共通）.<p>
	 *
	 */
	public MCButton DtlBtn_upd_cmn = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [UPD_ADMIN]モードを表す定数 */
	public static final String UPD_ADMIN = "UPD_ADMIN";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, UPD_ADMIN, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0390_Srch01]のCallerの作成 */
	protected MABCP_ItmLst_MC.MA_MABCL0390_Srch01Caller createMA_MABCL0390_Srch01() {
		MABCP_ItmLst_MC.MA_MABCL0390_Srch01Caller<MABCP_ItmLst, MA_MABCL0390_Srch01Bridge>
		caller = ((MABCP_ItmLst_MC)this).new MA_MABCL0390_Srch01Caller<MABCP_ItmLst, MA_MABCL0390_Srch01Bridge>(
					(MABCP_ItmLst)this, new MA_MABCL0390_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0390_Srch01]の呼び出し */
	protected void callMA_MABCL0390_Srch01() {
		MCCaller caller = createMA_MABCL0390_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0390_Upd01]のCallerの作成 */
	protected MABCP_ItmLst_MC.MA_MABCL0390_Upd01Caller createMA_MABCL0390_Upd01() {
		MABCP_ItmLst_MC.MA_MABCL0390_Upd01Caller<MABCP_ItmLst, MA_MABCL0390_Upd01Bridge>
		caller = ((MABCP_ItmLst_MC)this).new MA_MABCL0390_Upd01Caller<MABCP_ItmLst, MA_MABCL0390_Upd01Bridge>(
					(MABCP_ItmLst)this, new MA_MABCL0390_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0390_Upd01]の呼び出し */
	protected void callMA_MABCL0390_Upd01() {
		MCCaller caller = createMA_MABCL0390_Upd01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0390.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0390.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0390.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0390.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0390.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0390.MstR createMstR() {
		return mcframe.clientMABC.MABCP0390.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0390.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0390.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0390.CndR createCndR() {
		return mcframe.clientMABC.MABCP0390.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0390.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0390.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0390.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0390.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0390.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0390.DtlR.class);
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
		ret.add(TargetSrchPanel);
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmLst_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ItmLst_MC_A(String name) {
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
		MABCP_ItmLst_MC.jbCreateScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateTargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateMst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateTop((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateFold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateCndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateCnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateTab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateTab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateCtrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateDtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbCreateDtlBtn((MABCP_ItmLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_ItmLst p) {
	}

	/**
	 * [TargetSrch]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTargetSrch(MABCP_ItmLst p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_ItmLst p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_ItmLst p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_ItmLst p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABCP_ItmLst p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ItmLst p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
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
	protected static void jbCreateTab1(MABCP_ItmLst p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_ItmLst p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_ItmLst p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ItmLst p) {
		p.Dtl_rqmt_rstr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABC.MABCP0390.DtlR.$rqmt_rstr_qty_p);
		p.Dtl_rqmt_rstr_qty_p_PPanel.setName("Dtl.rqmt_rstr_qty_p");
		p.columnDtl_rqmt_rstr_qty = p.Dtl_rqmt_rstr_qty_p_PPanel.columnQty_qty;
		p.columnDtl_rqmt_rstr_qty.addAliasName("Dtl.rqmt_rstr_qty", p);
		p.Dtl_ref_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP0390.DtlR.$ref_itm_p);
		p.Dtl_ref_itm_p_PPanel.setName("Dtl.ref_itm_p");
		p.columnDtl_ref_itm_cd = p.Dtl_ref_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_ref_itm_cd.addAliasName("Dtl.ref_itm_cd", p);
		p.columnDtl_ref_itm_sub1 = p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_ref_itm_sub1.addAliasName("Dtl.ref_itm_sub1", p);
		p.columnDtl_ref_itm_sub2 = p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_ref_itm_sub2.addAliasName("Dtl.ref_itm_sub2", p);
		p.columnDtl_ref_itm_sub3 = p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_ref_itm_sub3.addAliasName("Dtl.ref_itm_sub3", p);
		p.columnDtl_ref_itm_nm = p.Dtl_ref_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_ref_itm_nm.addAliasName("Dtl.ref_itm_nm", p);
		p.Dtl_std_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABC.MABCP0390.DtlR.$std_qty_p);
		p.Dtl_std_qty_p_PPanel.setName("Dtl.std_qty_p");
		p.columnDtl_cost_std_qty = p.Dtl_std_qty_p_PPanel.columnQty_qty;
		p.columnDtl_cost_std_qty.addAliasName("Dtl.cost_std_qty", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_ItmLst p) {
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
	
	
	/** [Cnd_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_mng_typ_p = null;

	/**
	 * [Cnd_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_mng_typ_ListPutter() {
		if (Cnd_stk_mng_typ_p == null) {
			Cnd_stk_mng_typ_p = createCnd_stk_mng_typ_ListPutter(Cnd_stk_mng_typ, "stk_mng_typ", "stk_mng_typ_nm");

		}
		return Cnd_stk_mng_typ_p;
	}
	
	
	/** [Cnd_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_asset_mng_typ_p = null;

	/**
	 * [Cnd_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asset_mng_typ_ListPutter() {
		if (Cnd_asset_mng_typ_p == null) {
			Cnd_asset_mng_typ_p = createCnd_asset_mng_typ_ListPutter(Cnd_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Cnd_asset_mng_typ_p;
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
	
	
	/** [Dtl_stk_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_mng_typ_p = null;

	/**
	 * [Dtl_stk_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_mng_typ_ListPutter() {
		if (Dtl_stk_mng_typ_p == null) {
			Dtl_stk_mng_typ_p = createDtl_stk_mng_typ_ListPutter(columnDtl_stk_mng_typ, "stk_mng_typ", "stk_mng_typ_nm");

		}
		return Dtl_stk_mng_typ_p;
	}
	
	
	/** [Dtl_asset_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_asset_mng_typ_p = null;

	/**
	 * [Dtl_asset_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asset_mng_typ_ListPutter() {
		if (Dtl_asset_mng_typ_p == null) {
			Dtl_asset_mng_typ_p = createDtl_asset_mng_typ_ListPutter(columnDtl_asset_mng_typ, "asset_mng_typ", "asset_mng_typ_nm");

		}
		return Dtl_asset_mng_typ_p;
	}
	
	
	/** [Dtl_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_unit_cd_p = null;

	/**
	 * [Dtl_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_unit_cd_ListPutter() {
		if (Dtl_unit_cd_p == null) {
			Dtl_unit_cd_p = createDtl_unit_cd_ListPutter(columnDtl_unit_cd, "unit_cd", "unit_nm","dec_place","rnd_typ");

		}
		return Dtl_unit_cd_p;
	}
	
	
	/** [Dtl_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_rnd_typ_p = null;

	/**
	 * [Dtl_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rnd_typ_ListPutter() {
		if (Dtl_rnd_typ_p == null) {
			Dtl_rnd_typ_p = createDtl_rnd_typ_ListPutter(columnDtl_rnd_typ, "rnd_typ", "rnd_typ_nm");

		}
		return Dtl_rnd_typ_p;
	}
	
	
	/** [Dtl_dim_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dim_unit_cd_p = null;

	/**
	 * [Dtl_dim_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dim_unit_cd_ListPutter() {
		if (Dtl_dim_unit_cd_p == null) {
			Dtl_dim_unit_cd_p = createDtl_dim_unit_cd_ListPutter(columnDtl_dim_unit_cd, "dim_unit_cd", "dim_unit_nm");

		}
		return Dtl_dim_unit_cd_p;
	}
	
	
	/** [Dtl_wt_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wt_unit_cd_p = null;

	/**
	 * [Dtl_wt_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wt_unit_cd_ListPutter() {
		if (Dtl_wt_unit_cd_p == null) {
			Dtl_wt_unit_cd_p = createDtl_wt_unit_cd_ListPutter(columnDtl_wt_unit_cd, "wt_unit_cd", "wt_unit_nm");

		}
		return Dtl_wt_unit_cd_p;
	}
	
	
	/** [Dtl_conts_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_conts_unit_cd_p = null;

	/**
	 * [Dtl_conts_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_conts_unit_cd_ListPutter() {
		if (Dtl_conts_unit_cd_p == null) {
			Dtl_conts_unit_cd_p = createDtl_conts_unit_cd_ListPutter(columnDtl_conts_unit_cd, "conts_unit_cd", "conts_unit_nm");

		}
		return Dtl_conts_unit_cd_p;
	}
	
	
	/** [Dtl_sls_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_itm_grp_cd_p = null;

	/**
	 * [Dtl_sls_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_itm_grp_cd_ListPutter() {
		if (Dtl_sls_itm_grp_cd_p == null) {
			Dtl_sls_itm_grp_cd_p = createDtl_sls_itm_grp_cd_ListPutter(columnDtl_sls_itm_grp_cd, "sls_itm_grp_cd", "sls_itm_grp_nm");

		}
		return Dtl_sls_itm_grp_cd_p;
	}
	
	
	/** [Dtl_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd1_p = null;

	/**
	 * [Dtl_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd1_ListPutter() {
		if (Dtl_itm_grp_cd1_p == null) {
			Dtl_itm_grp_cd1_p = createDtl_itm_grp_cd1_ListPutter(columnDtl_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Dtl_itm_grp_cd1_p;
	}
	
	
	/** [Dtl_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd2_p = null;

	/**
	 * [Dtl_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd2_ListPutter() {
		if (Dtl_itm_grp_cd2_p == null) {
			Dtl_itm_grp_cd2_p = createDtl_itm_grp_cd2_ListPutter(columnDtl_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Dtl_itm_grp_cd2_p;
	}
	
	
	/** [Dtl_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd3_p = null;

	/**
	 * [Dtl_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd3_ListPutter() {
		if (Dtl_itm_grp_cd3_p == null) {
			Dtl_itm_grp_cd3_p = createDtl_itm_grp_cd3_ListPutter(columnDtl_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Dtl_itm_grp_cd3_p;
	}
	
	
	/** [Dtl_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd4_p = null;

	/**
	 * [Dtl_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd4_ListPutter() {
		if (Dtl_itm_grp_cd4_p == null) {
			Dtl_itm_grp_cd4_p = createDtl_itm_grp_cd4_ListPutter(columnDtl_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Dtl_itm_grp_cd4_p;
	}
	
	
	/** [Dtl_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd5_p = null;

	/**
	 * [Dtl_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd5_ListPutter() {
		if (Dtl_itm_grp_cd5_p == null) {
			Dtl_itm_grp_cd5_p = createDtl_itm_grp_cd5_ListPutter(columnDtl_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Dtl_itm_grp_cd5_p;
	}
	
	
	/** [Dtl_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd6_p = null;

	/**
	 * [Dtl_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd6_ListPutter() {
		if (Dtl_itm_grp_cd6_p == null) {
			Dtl_itm_grp_cd6_p = createDtl_itm_grp_cd6_ListPutter(columnDtl_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Dtl_itm_grp_cd6_p;
	}
	
	
	/** [Dtl_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd7_p = null;

	/**
	 * [Dtl_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd7_ListPutter() {
		if (Dtl_itm_grp_cd7_p == null) {
			Dtl_itm_grp_cd7_p = createDtl_itm_grp_cd7_ListPutter(columnDtl_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Dtl_itm_grp_cd7_p;
	}
	
	
	/** [Dtl_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd8_p = null;

	/**
	 * [Dtl_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd8_ListPutter() {
		if (Dtl_itm_grp_cd8_p == null) {
			Dtl_itm_grp_cd8_p = createDtl_itm_grp_cd8_ListPutter(columnDtl_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Dtl_itm_grp_cd8_p;
	}
	
	
	/** [Dtl_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd9_p = null;

	/**
	 * [Dtl_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd9_ListPutter() {
		if (Dtl_itm_grp_cd9_p == null) {
			Dtl_itm_grp_cd9_p = createDtl_itm_grp_cd9_ListPutter(columnDtl_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Dtl_itm_grp_cd9_p;
	}
	
	
	/** [Dtl_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd10_p = null;

	/**
	 * [Dtl_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd10_ListPutter() {
		if (Dtl_itm_grp_cd10_p == null) {
			Dtl_itm_grp_cd10_p = createDtl_itm_grp_cd10_ListPutter(columnDtl_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Dtl_itm_grp_cd10_p;
	}
	
	
	/** [Dtl_hs_cd_ListPutter]の定義 */
	private MCListPutter Dtl_hs_cd_p = null;

	/**
	 * [Dtl_hs_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_hs_cd_ListPutter() {
		if (Dtl_hs_cd_p == null) {
			Dtl_hs_cd_p = createDtl_hs_cd_ListPutter(columnDtl_hs_cd, "hs_cd", "hs_nm");

		}
		return Dtl_hs_cd_p;
	}
	
	
	/** [Dtl_jan_typ_ListPutter]の定義 */
	private MCListPutter Dtl_jan_typ_p = null;

	/**
	 * [Dtl_jan_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_jan_typ_ListPutter() {
		if (Dtl_jan_typ_p == null) {
			Dtl_jan_typ_p = createDtl_jan_typ_ListPutter(columnDtl_jan_typ, "jan_typ", "jan_typ_nm");

		}
		return Dtl_jan_typ_p;
	}
	
	
	/** [Dtl_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_p = null;

	/**
	 * [Dtl_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_ListPutter() {
		if (Dtl_itm_typ_p == null) {
			Dtl_itm_typ_p = createDtl_itm_typ_ListPutter(columnDtl_itm_typ, "itm_typ", "itm_typ_nm");

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
			Dtl_itm_typ_d_cd_p = createDtl_itm_typ_d_cd_ListPutter(columnDtl_itm_typ_d_cd, "itm_typ_d_cd", "itm_typ_d_nm","sls_flg","mfg_flg","purc_flg","insp_flg","itm_jnl_cd","ac_itm_grp_cd","minus_stk_flg","not_new_lot_flg","gi_alloc_flg","pack_alloc_flg","bp_lot_flg","comp_spec_typ","comp_rev_at_slo_flg","comp_core_itm_flg","skip_chk_ship_flg","itm_spec_grp_cd","sls_upri_grp_cd","slo_proc_flg","slo_proc_typ","ship_inst_typ","ship_lot_back_stop_flg","itm_ship_grp_cd","ship_valid_grp_cd","arr_skip_flg","ship_term_cd","stk_lst_flg","mfg_inst_unit_typ","sls_upri_cng_flg","purc_upri_cng_flg","prov_upri_cng_flg","mrp_proc_typ","alloc_margin_days","mrp_alloc_margin_days","inpt_itm_add_flg","inpt_itm_del_flg","sch_flg","lot_mng_typ","lot_no_typ","lot_no_ptn_cd","sublot_mng_typ","sublot_no_typ","sublot_no_ptn_cd","sno1_mng_typ","slo_sno1_flg","rqmt_sno1_flg","sno1_num_typ","sno1_ptn_cd","sno2_mng_typ","slo_sno2_flg","rqmt_sno2_flg","sno2_num_typ","sno2_ptn_cd","sno3_mng_typ","slo_sno3_flg","rqmt_sno3_flg","sno3_num_typ","sno3_ptn_cd","sno4_mng_typ","slo_sno4_flg","rqmt_sno4_flg","sno4_num_typ","sno4_ptn_cd","lmt_ctl_flg","lmt_ctl_categ","ver_flg","insp_bind_typ","mrkt_judg_flg","calc_ptn_cd","rqmt_typ","prod_pln_typ","dmnd_date_div_mons","mrkt_judg_role_cd","mrkt_judg_upd_role_cd","mrp_opn_xfr_days");

		}
		return Dtl_itm_typ_d_cd_p;
	}
	
	
	/** [Dtl_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_jnl_cd_p = null;

	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_jnl_cd_ListPutter() {
		if (Dtl_itm_jnl_cd_p == null) {
			Dtl_itm_jnl_cd_p = createDtl_itm_jnl_cd_ListPutter(columnDtl_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Dtl_itm_jnl_cd_p;
	}
	
	
	/** [Dtl_ac_itm_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ac_itm_grp_cd_p = null;

	/**
	 * [Dtl_ac_itm_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_itm_grp_cd_ListPutter() {
		if (Dtl_ac_itm_grp_cd_p == null) {
			Dtl_ac_itm_grp_cd_p = createDtl_ac_itm_grp_cd_ListPutter(columnDtl_ac_itm_grp_cd, "ac_itm_grp_cd", "ac_itm_grp_nm");

		}
		return Dtl_ac_itm_grp_cd_p;
	}
	
	
	/** [Dtl_sls_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_tax_cd_p = null;

	/**
	 * [Dtl_sls_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_tax_cd_ListPutter() {
		if (Dtl_sls_tax_cd_p == null) {
			Dtl_sls_tax_cd_p = createDtl_sls_tax_cd_ListPutter(columnDtl_sls_tax_cd, "sls_tax_cd", "sls_tax_nm");

		}
		return Dtl_sls_tax_cd_p;
	}
	
	
	/** [Dtl_purc_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_tax_cd_p = null;

	/**
	 * [Dtl_purc_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_tax_cd_ListPutter() {
		if (Dtl_purc_tax_cd_p == null) {
			Dtl_purc_tax_cd_p = createDtl_purc_tax_cd_ListPutter(columnDtl_purc_tax_cd, "purc_tax_cd", "purc_tax_nm");

		}
		return Dtl_purc_tax_cd_p;
	}
	
	
	/** [Dtl_prov_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_prov_tax_cd_p = null;

	/**
	 * [Dtl_prov_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prov_tax_cd_ListPutter() {
		if (Dtl_prov_tax_cd_p == null) {
			Dtl_prov_tax_cd_p = createDtl_prov_tax_cd_ListPutter(columnDtl_prov_tax_cd, "prov_tax_cd", "prov_tax_nm");

		}
		return Dtl_prov_tax_cd_p;
	}
	
	
	/** [Dtl_ship_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_unit_cd_p = null;

	/**
	 * [Dtl_ship_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_unit_cd_ListPutter() {
		if (Dtl_ship_unit_cd_p == null) {
			Dtl_ship_unit_cd_p = createDtl_ship_unit_cd_ListPutter(columnDtl_ship_unit_cd, "ship_unit_cd", "ship_unit_nm");

		}
		return Dtl_ship_unit_cd_p;
	}
	
	
	/** [Dtl_mfg_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_unit_cd_p = null;

	/**
	 * [Dtl_mfg_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_unit_cd_ListPutter() {
		if (Dtl_mfg_unit_cd_p == null) {
			Dtl_mfg_unit_cd_p = createDtl_mfg_unit_cd_ListPutter(columnDtl_mfg_unit_cd, "mfg_unit_cd", "mfg_unit_nm");

		}
		return Dtl_mfg_unit_cd_p;
	}
	
	
	/** [Dtl_purc_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_unit_cd_p = null;

	/**
	 * [Dtl_purc_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_unit_cd_ListPutter() {
		if (Dtl_purc_unit_cd_p == null) {
			Dtl_purc_unit_cd_p = createDtl_purc_unit_cd_ListPutter(columnDtl_purc_unit_cd, "purc_unit_cd", "purc_unit_nm");

		}
		return Dtl_purc_unit_cd_p;
	}
	
	
	/** [Dtl_pckg_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pckg_unit_cd_p = null;

	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pckg_unit_cd_ListPutter() {
		if (Dtl_pckg_unit_cd_p == null) {
			Dtl_pckg_unit_cd_p = createDtl_pckg_unit_cd_ListPutter(columnDtl_pckg_unit_cd, "pckg_unit_cd", "pckg_unit_nm");

		}
		return Dtl_pckg_unit_cd_p;
	}
	
	
	/** [Dtl_lot_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_mng_typ_p = null;

	/**
	 * [Dtl_lot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_mng_typ_ListPutter() {
		if (Dtl_lot_mng_typ_p == null) {
			Dtl_lot_mng_typ_p = createDtl_lot_mng_typ_ListPutter(columnDtl_lot_mng_typ, "lot_mng_typ", "lot_mng_typ_nm");

		}
		return Dtl_lot_mng_typ_p;
	}
	
	
	/** [Dtl_lot_no_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_typ_p = null;

	/**
	 * [Dtl_lot_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_typ_ListPutter() {
		if (Dtl_lot_no_typ_p == null) {
			Dtl_lot_no_typ_p = createDtl_lot_no_typ_ListPutter(columnDtl_lot_no_typ, "lot_no_typ", "lot_no_typ_nm");

		}
		return Dtl_lot_no_typ_p;
	}
	
	
	/** [Dtl_lot_no_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_ptn_cd_p = null;

	/**
	 * [Dtl_lot_no_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_ptn_cd_ListPutter() {
		if (Dtl_lot_no_ptn_cd_p == null) {
			Dtl_lot_no_ptn_cd_p = createDtl_lot_no_ptn_cd_ListPutter(columnDtl_lot_no_ptn_cd, "lot_no_ptn_cd", "lot_no_ptn_nm");

		}
		return Dtl_lot_no_ptn_cd_p;
	}
	
	
	/** [Dtl_sublot_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_mng_typ_p = null;

	/**
	 * [Dtl_sublot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_mng_typ_ListPutter() {
		if (Dtl_sublot_mng_typ_p == null) {
			Dtl_sublot_mng_typ_p = createDtl_sublot_mng_typ_ListPutter(columnDtl_sublot_mng_typ, "sublot_mng_typ", "sublot_mng_typ_nm");

		}
		return Dtl_sublot_mng_typ_p;
	}
	
	
	/** [Dtl_sublot_no_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_no_typ_p = null;

	/**
	 * [Dtl_sublot_no_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_no_typ_ListPutter() {
		if (Dtl_sublot_no_typ_p == null) {
			Dtl_sublot_no_typ_p = createDtl_sublot_no_typ_ListPutter(columnDtl_sublot_no_typ, "sublot_no_typ", "sublot_no_typ_nm");

		}
		return Dtl_sublot_no_typ_p;
	}
	
	
	/** [Dtl_sublot_no_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_no_ptn_cd_p = null;

	/**
	 * [Dtl_sublot_no_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_no_ptn_cd_ListPutter() {
		if (Dtl_sublot_no_ptn_cd_p == null) {
			Dtl_sublot_no_ptn_cd_p = createDtl_sublot_no_ptn_cd_ListPutter(columnDtl_sublot_no_ptn_cd, "sublot_no_ptn_cd", "sublot_no_ptn_nm");

		}
		return Dtl_sublot_no_ptn_cd_p;
	}
	
	
	/** [Dtl_insp_bind_typ_ListPutter]の定義 */
	private MCListPutter Dtl_insp_bind_typ_p = null;

	/**
	 * [Dtl_insp_bind_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_insp_bind_typ_ListPutter() {
		if (Dtl_insp_bind_typ_p == null) {
			Dtl_insp_bind_typ_p = createDtl_insp_bind_typ_ListPutter(columnDtl_insp_bind_typ, "insp_bind_typ", "insp_bind_typ_nm");

		}
		return Dtl_insp_bind_typ_p;
	}
	
	
	/** [Dtl_mrkt_judg_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mrkt_judg_role_cd_p = null;

	/**
	 * [Dtl_mrkt_judg_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mrkt_judg_role_cd_ListPutter() {
		if (Dtl_mrkt_judg_role_cd_p == null) {
			Dtl_mrkt_judg_role_cd_p = createDtl_mrkt_judg_role_cd_ListPutter(columnDtl_mrkt_judg_role_cd, "mrkt_judg_role_cd", "mrkt_judg_role_nm");

		}
		return Dtl_mrkt_judg_role_cd_p;
	}
	
	
	/** [Dtl_mrkt_judg_upd_role_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mrkt_judg_upd_role_cd_p = null;

	/**
	 * [Dtl_mrkt_judg_upd_role_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mrkt_judg_upd_role_cd_ListPutter() {
		if (Dtl_mrkt_judg_upd_role_cd_p == null) {
			Dtl_mrkt_judg_upd_role_cd_p = createDtl_mrkt_judg_upd_role_cd_ListPutter(columnDtl_mrkt_judg_upd_role_cd, "mrkt_judg_upd_role_cd", "mrkt_judg_upd_role_nm");

		}
		return Dtl_mrkt_judg_upd_role_cd_p;
	}
	
	
	/** [Dtl_ship_valid_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_valid_grp_cd_p = null;

	/**
	 * [Dtl_ship_valid_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_valid_grp_cd_ListPutter() {
		if (Dtl_ship_valid_grp_cd_p == null) {
			Dtl_ship_valid_grp_cd_p = createDtl_ship_valid_grp_cd_ListPutter(columnDtl_ship_valid_grp_cd, "ship_valid_grp_cd", "ship_valid_grp_nm");

		}
		return Dtl_ship_valid_grp_cd_p;
	}
	
	
	/** [Dtl_cont_fctr_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cont_fctr_unit_cd_p = null;

	/**
	 * [Dtl_cont_fctr_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cont_fctr_unit_cd_ListPutter() {
		if (Dtl_cont_fctr_unit_cd_p == null) {
			Dtl_cont_fctr_unit_cd_p = createDtl_cont_fctr_unit_cd_ListPutter(columnDtl_cont_fctr_unit_cd, "cont_fctr_unit_cd", "cont_fctr_unit_nm","cont_fctr_dec_place");

		}
		return Dtl_cont_fctr_unit_cd_p;
	}
	
	
	/** [Dtl_cont_fctr_rnd_typ_ListPutter]の定義 */
	private MCListPutter Dtl_cont_fctr_rnd_typ_p = null;

	/**
	 * [Dtl_cont_fctr_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cont_fctr_rnd_typ_ListPutter() {
		if (Dtl_cont_fctr_rnd_typ_p == null) {
			Dtl_cont_fctr_rnd_typ_p = createDtl_cont_fctr_rnd_typ_ListPutter(columnDtl_cont_fctr_rnd_typ, "cont_fctr_rnd_typ", "cont_fctr_rnd_typ_nm");

		}
		return Dtl_cont_fctr_rnd_typ_p;
	}
	
	
	/** [Dtl_sno1_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_mng_typ_p = null;

	/**
	 * [Dtl_sno1_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_mng_typ_ListPutter() {
		if (Dtl_sno1_mng_typ_p == null) {
			Dtl_sno1_mng_typ_p = createDtl_sno1_mng_typ_ListPutter(columnDtl_sno1_mng_typ, "sno1_mng_typ", "sno1_mng_typ_nm");

		}
		return Dtl_sno1_mng_typ_p;
	}
	
	
	/** [Dtl_sno1_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_num_typ_p = null;

	/**
	 * [Dtl_sno1_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_num_typ_ListPutter() {
		if (Dtl_sno1_num_typ_p == null) {
			Dtl_sno1_num_typ_p = createDtl_sno1_num_typ_ListPutter(columnDtl_sno1_num_typ, "sno1_num_typ", "sno1_num_typ_nm");

		}
		return Dtl_sno1_num_typ_p;
	}
	
	
	/** [Dtl_sno1_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_ptn_cd_p = null;

	/**
	 * [Dtl_sno1_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_ptn_cd_ListPutter() {
		if (Dtl_sno1_ptn_cd_p == null) {
			Dtl_sno1_ptn_cd_p = createDtl_sno1_ptn_cd_ListPutter(columnDtl_sno1_ptn_cd, "sno1_ptn_cd", "sno1_ptn_nm");

		}
		return Dtl_sno1_ptn_cd_p;
	}
	
	
	/** [Dtl_sno2_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_mng_typ_p = null;

	/**
	 * [Dtl_sno2_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_mng_typ_ListPutter() {
		if (Dtl_sno2_mng_typ_p == null) {
			Dtl_sno2_mng_typ_p = createDtl_sno2_mng_typ_ListPutter(columnDtl_sno2_mng_typ, "sno2_mng_typ", "sno2_mng_typ_nm");

		}
		return Dtl_sno2_mng_typ_p;
	}
	
	
	/** [Dtl_sno2_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_num_typ_p = null;

	/**
	 * [Dtl_sno2_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_num_typ_ListPutter() {
		if (Dtl_sno2_num_typ_p == null) {
			Dtl_sno2_num_typ_p = createDtl_sno2_num_typ_ListPutter(columnDtl_sno2_num_typ, "sno2_num_typ", "sno2_num_typ_nm");

		}
		return Dtl_sno2_num_typ_p;
	}
	
	
	/** [Dtl_sno2_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_ptn_cd_p = null;

	/**
	 * [Dtl_sno2_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_ptn_cd_ListPutter() {
		if (Dtl_sno2_ptn_cd_p == null) {
			Dtl_sno2_ptn_cd_p = createDtl_sno2_ptn_cd_ListPutter(columnDtl_sno2_ptn_cd, "sno2_ptn_cd", "sno2_ptn_nm");

		}
		return Dtl_sno2_ptn_cd_p;
	}
	
	
	/** [Dtl_sno3_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_mng_typ_p = null;

	/**
	 * [Dtl_sno3_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_mng_typ_ListPutter() {
		if (Dtl_sno3_mng_typ_p == null) {
			Dtl_sno3_mng_typ_p = createDtl_sno3_mng_typ_ListPutter(columnDtl_sno3_mng_typ, "sno3_mng_typ", "sno3_mng_typ_nm");

		}
		return Dtl_sno3_mng_typ_p;
	}
	
	
	/** [Dtl_sno3_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_num_typ_p = null;

	/**
	 * [Dtl_sno3_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_num_typ_ListPutter() {
		if (Dtl_sno3_num_typ_p == null) {
			Dtl_sno3_num_typ_p = createDtl_sno3_num_typ_ListPutter(columnDtl_sno3_num_typ, "sno3_num_typ", "sno3_num_typ_nm");

		}
		return Dtl_sno3_num_typ_p;
	}
	
	
	/** [Dtl_sno3_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_ptn_cd_p = null;

	/**
	 * [Dtl_sno3_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_ptn_cd_ListPutter() {
		if (Dtl_sno3_ptn_cd_p == null) {
			Dtl_sno3_ptn_cd_p = createDtl_sno3_ptn_cd_ListPutter(columnDtl_sno3_ptn_cd, "sno3_ptn_cd", "sno3_ptn_nm");

		}
		return Dtl_sno3_ptn_cd_p;
	}
	
	
	/** [Dtl_sno4_mng_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_mng_typ_p = null;

	/**
	 * [Dtl_sno4_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_mng_typ_ListPutter() {
		if (Dtl_sno4_mng_typ_p == null) {
			Dtl_sno4_mng_typ_p = createDtl_sno4_mng_typ_ListPutter(columnDtl_sno4_mng_typ, "sno4_mng_typ", "sno4_mng_typ_nm");

		}
		return Dtl_sno4_mng_typ_p;
	}
	
	
	/** [Dtl_sno4_num_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_num_typ_p = null;

	/**
	 * [Dtl_sno4_num_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_num_typ_ListPutter() {
		if (Dtl_sno4_num_typ_p == null) {
			Dtl_sno4_num_typ_p = createDtl_sno4_num_typ_ListPutter(columnDtl_sno4_num_typ, "sno4_num_typ", "sno4_num_typ_nm");

		}
		return Dtl_sno4_num_typ_p;
	}
	
	
	/** [Dtl_sno4_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_ptn_cd_p = null;

	/**
	 * [Dtl_sno4_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_ptn_cd_ListPutter() {
		if (Dtl_sno4_ptn_cd_p == null) {
			Dtl_sno4_ptn_cd_p = createDtl_sno4_ptn_cd_ListPutter(columnDtl_sno4_ptn_cd, "sno4_ptn_cd", "sno4_ptn_nm");

		}
		return Dtl_sno4_ptn_cd_p;
	}
	
	
	/** [Dtl_mfg_inst_unit_typ_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_inst_unit_typ_p = null;

	/**
	 * [Dtl_mfg_inst_unit_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_inst_unit_typ_ListPutter() {
		if (Dtl_mfg_inst_unit_typ_p == null) {
			Dtl_mfg_inst_unit_typ_p = createDtl_mfg_inst_unit_typ_ListPutter(columnDtl_mfg_inst_unit_typ, "mfg_inst_unit_typ", "mfg_inst_unit_typ_nm");

		}
		return Dtl_mfg_inst_unit_typ_p;
	}
	
	
	/** [Dtl_mrp_proc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_mrp_proc_typ_p = null;

	/**
	 * [Dtl_mrp_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mrp_proc_typ_ListPutter() {
		if (Dtl_mrp_proc_typ_p == null) {
			Dtl_mrp_proc_typ_p = createDtl_mrp_proc_typ_ListPutter(columnDtl_mrp_proc_typ, "mrp_proc_typ", "mrp_proc_typ_nm");

		}
		return Dtl_mrp_proc_typ_p;
	}
	
	
	/** [Dtl_rqmt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_rqmt_typ_p = null;

	/**
	 * [Dtl_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rqmt_typ_ListPutter() {
		if (Dtl_rqmt_typ_p == null) {
			Dtl_rqmt_typ_p = createDtl_rqmt_typ_ListPutter(columnDtl_rqmt_typ, "rqmt_typ", "rqmt_typ_nm");

		}
		return Dtl_rqmt_typ_p;
	}
	
	
	/** [Dtl_prod_pln_typ_ListPutter]の定義 */
	private MCListPutter Dtl_prod_pln_typ_p = null;

	/**
	 * [Dtl_prod_pln_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prod_pln_typ_ListPutter() {
		if (Dtl_prod_pln_typ_p == null) {
			Dtl_prod_pln_typ_p = createDtl_prod_pln_typ_ListPutter(columnDtl_prod_pln_typ, "prod_pln_typ", "prod_pln_typ_nm");

		}
		return Dtl_prod_pln_typ_p;
	}
	
	
	/** [Dtl_cntry_org_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cntry_org_cd_p = null;

	/**
	 * [Dtl_cntry_org_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cntry_org_cd_ListPutter() {
		if (Dtl_cntry_org_cd_p == null) {
			Dtl_cntry_org_cd_p = createDtl_cntry_org_cd_ListPutter(columnDtl_cntry_org_cd, "cntry_org_cd", "cntry_org_nm");

		}
		return Dtl_cntry_org_cd_p;
	}
	
	
	/** [Dtl_comp_spec_typ_ListPutter]の定義 */
	private MCListPutter Dtl_comp_spec_typ_p = null;

	/**
	 * [Dtl_comp_spec_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_comp_spec_typ_ListPutter() {
		if (Dtl_comp_spec_typ_p == null) {
			Dtl_comp_spec_typ_p = createDtl_comp_spec_typ_ListPutter(columnDtl_comp_spec_typ, "comp_spec_typ", "comp_spec_typ_nm");

		}
		return Dtl_comp_spec_typ_p;
	}
	
	
	/** [Dtl_itm_spec_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_spec_grp_cd_p = null;

	/**
	 * [Dtl_itm_spec_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_spec_grp_cd_ListPutter() {
		if (Dtl_itm_spec_grp_cd_p == null) {
			Dtl_itm_spec_grp_cd_p = createDtl_itm_spec_grp_cd_ListPutter(columnDtl_itm_spec_grp_cd, "itm_spec_grp_cd", "itm_spec_grp_nm");

		}
		return Dtl_itm_spec_grp_cd_p;
	}
	
	
	/** [Dtl_sls_upri_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_upri_grp_cd_p = null;

	/**
	 * [Dtl_sls_upri_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_upri_grp_cd_ListPutter() {
		if (Dtl_sls_upri_grp_cd_p == null) {
			Dtl_sls_upri_grp_cd_p = createDtl_sls_upri_grp_cd_ListPutter(columnDtl_sls_upri_grp_cd, "sls_upri_grp_cd", "sls_upri_grp_nm");

		}
		return Dtl_sls_upri_grp_cd_p;
	}
	
	
	/** [Dtl_slo_proc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_slo_proc_typ_p = null;

	/**
	 * [Dtl_slo_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_slo_proc_typ_ListPutter() {
		if (Dtl_slo_proc_typ_p == null) {
			Dtl_slo_proc_typ_p = createDtl_slo_proc_typ_ListPutter(columnDtl_slo_proc_typ, "slo_proc_typ", "slo_proc_typ_nm");

		}
		return Dtl_slo_proc_typ_p;
	}
	
	
	/** [Dtl_ship_inst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ship_inst_typ_p = null;

	/**
	 * [Dtl_ship_inst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_inst_typ_ListPutter() {
		if (Dtl_ship_inst_typ_p == null) {
			Dtl_ship_inst_typ_p = createDtl_ship_inst_typ_ListPutter(columnDtl_ship_inst_typ, "ship_inst_typ", "ship_inst_typ_nm");

		}
		return Dtl_ship_inst_typ_p;
	}
	
	
	/** [Dtl_itm_ship_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_ship_grp_cd_p = null;

	/**
	 * [Dtl_itm_ship_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_ship_grp_cd_ListPutter() {
		if (Dtl_itm_ship_grp_cd_p == null) {
			Dtl_itm_ship_grp_cd_p = createDtl_itm_ship_grp_cd_ListPutter(columnDtl_itm_ship_grp_cd, "itm_ship_grp_cd", "itm_ship_grp_nm");

		}
		return Dtl_itm_ship_grp_cd_p;
	}
	
	
	/** [Dtl_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_term_cd_p = null;

	/**
	 * [Dtl_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_term_cd_ListPutter() {
		if (Dtl_ship_term_cd_p == null) {
			Dtl_ship_term_cd_p = createDtl_ship_term_cd_ListPutter(columnDtl_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Dtl_ship_term_cd_p;
	}
	
	
	/** [Dtl_exim_xpns_typ_ListPutter]の定義 */
	private MCListPutter Dtl_exim_xpns_typ_p = null;

	/**
	 * [Dtl_exim_xpns_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_exim_xpns_typ_ListPutter() {
		if (Dtl_exim_xpns_typ_p == null) {
			Dtl_exim_xpns_typ_p = createDtl_exim_xpns_typ_ListPutter(columnDtl_exim_xpns_typ, "exim_xpns_typ", "exim_xpns_typ_nm");

		}
		return Dtl_exim_xpns_typ_p;
	}
	
	
	/** [Dtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ref_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_ref_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_ref_itm_p_PPanel_columnItm_itm_cd_p = createDtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_ref_itm_p_PPanel.columnItm_itm_cd, "ref_itm_cd", "ref_itm_nm","ref_itm_sub1","ref_itm_sub2","ref_itm_sub3");
		}
		return Dtl_ref_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_ref_itm_p_PPanel.columnItm_itm_sub1, "ref_itm_sub1", "ref_itm_nm","ref_itm_sub2","ref_itm_sub3");
		}
		return Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_ref_itm_p_PPanel.columnItm_itm_sub2, "ref_itm_sub2", "ref_itm_nm","ref_itm_sub3");
		}
		return Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_ref_itm_p_PPanel.columnItm_itm_sub3, "ref_itm_sub3", "ref_itm_nm");
		}
		return Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_calc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_calc_ptn_cd_p = null;

	/**
	 * [Dtl_calc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_calc_ptn_cd_ListPutter() {
		if (Dtl_calc_ptn_cd_p == null) {
			Dtl_calc_ptn_cd_p = createDtl_calc_ptn_cd_ListPutter(columnDtl_calc_ptn_cd, "calc_ptn_cd", "calc_ptn_nm");

		}
		return Dtl_calc_ptn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmLst create(){
		MABCP_ItmLst p = new MABCP_ItmLst();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmLst create(String name){
		MABCP_ItmLst p = new MABCP_ItmLst(name);
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
		MABCP_ItmLst_MC.jbfInitScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitTargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitMst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitTop((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitFold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitCndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitCnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitTab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitTab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitCtrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitDtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbfInitDtlBtn((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitTargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitMst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitTop((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitFold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitCndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitCnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitTab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitTab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitCtrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitDtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.jbInitDtlBtn((MABCP_ItmLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [TargetSrch]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTargetSrch(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.TargetSrchPanel = p.beansFactory.createPanel("TargetSrch");
		p.TargetSrchTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_ItmLst p) {
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
	protected static void jbfInitTop(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_UPD_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_UPD_ADMIN");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_tar_Group = p.beansFactory.createButtonGroup("Cnd.tar");
		p.Cnd_tar_COM = p.beansFactory.createRadioButton("Cnd.tar_COM");
		p.Cnd_tar_ALL = p.beansFactory.createRadioButton("Cnd.tar_ALL");
		p.Cnd_own_co_flg_lab = p.beansFactory.createLabel("Cnd.own_co_flg_lab");
		p.Cnd_own_co_flg_off = p.beansFactory.createCheckBox("Cnd.own_co_flg_off");
		p.Cnd_own_co_flg_on = p.beansFactory.createCheckBox("Cnd.own_co_flg_on");
		p.Cnd_release_flg_lab = p.beansFactory.createLabel("Cnd.release_flg_lab");
		p.Cnd_release_flg_off = p.beansFactory.createCheckBox("Cnd.release_flg_off");
		p.Cnd_release_flg_on = p.beansFactory.createCheckBox("Cnd.release_flg_on");
		p.Cnd_stk_mng_typ_Label = p.beansFactory.createLabel("Cnd.stk_mng_typ_Label");
		p.Cnd_stk_mng_typ = p.beansFactory.createTextComboBox("Cnd.stk_mng_typ");
		p.Cnd_stk_mng_typ.setLabel(p.Cnd_stk_mng_typ_Label);
		p.Cnd_stk_mng_typ_nm = p.beansFactory.createTextField("Cnd.stk_mng_typ_nm");
		p.Cnd_asset_mng_typ_Label = p.beansFactory.createLabel("Cnd.asset_mng_typ_Label");
		p.Cnd_asset_mng_typ = p.beansFactory.createTextComboBox("Cnd.asset_mng_typ");
		p.Cnd_asset_mng_typ.setLabel(p.Cnd_asset_mng_typ_Label);
		p.Cnd_asset_mng_typ_nm = p.beansFactory.createTextField("Cnd.asset_mng_typ_nm");
		p.Cnd_sundry_itm_flg_lab = p.beansFactory.createLabel("Cnd.sundry_itm_flg_lab");
		p.Cnd_sundry_itm_flg_off = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_off");
		p.Cnd_sundry_itm_flg_on = p.beansFactory.createCheckBox("Cnd.sundry_itm_flg_on");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
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
		p.Cnd_th_image_flg = p.beansFactory.createCheckBox("Cnd.th_image_flg");
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
		p.Cnd_upd_only_com_flg = p.beansFactory.createCheckBox("Cnd.upd_only_com_flg");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_release_flg = p.beansFactory.createTableColumn("Dtl.release_flg", MCColumnType.CHECK);
		p.columnDtl_th_image_flg = p.beansFactory.createTableColumn("Dtl.th_image_flg", MCColumnType.CHECK);
		p.columnDtl_th_image = p.beansFactory.createTableColumn("Dtl.th_image", MCColumnType.IMAGE_VIEW);
		p.columnDtl_itm_cd = p.beansFactory.createTableColumn("Dtl.itm_cd", MCColumnType.TEXT);
		p.columnDtl_itm_sub1 = p.beansFactory.createTableColumn("Dtl.itm_sub1", MCColumnType.TEXT);
		p.columnDtl_itm_sub2 = p.beansFactory.createTableColumn("Dtl.itm_sub2", MCColumnType.TEXT);
		p.columnDtl_itm_sub3 = p.beansFactory.createTableColumn("Dtl.itm_sub3", MCColumnType.TEXT);
		p.columnDtl_itm_nm = p.beansFactory.createTableColumn("Dtl.itm_nm", MCColumnType.TEXT);
		p.columnDtl_base_itm_nm = p.beansFactory.createTableColumn("Dtl.base_itm_nm", MCColumnType.TEXT);
		p.columnDtl_base_itm_alt_nm1 = p.beansFactory.createTableColumn("Dtl.base_itm_alt_nm1", MCColumnType.TEXT);
		p.columnDtl_base_itm_alt_nm2 = p.beansFactory.createTableColumn("Dtl.base_itm_alt_nm2", MCColumnType.TEXT);
		p.columnDtl_base_itm_alt_nm3 = p.beansFactory.createTableColumn("Dtl.base_itm_alt_nm3", MCColumnType.TEXT);
		p.columnDtl_base_itm_alt_nm4 = p.beansFactory.createTableColumn("Dtl.base_itm_alt_nm4", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asset_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.asset_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_unit_nm = p.beansFactory.createTableColumn("Dtl.unit_nm", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_rnd_typ = p.beansFactory.createTableColumn("Dtl.rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dim_unit_cd = p.beansFactory.createTableColumn("Dtl.dim_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dim_unit_nm = p.beansFactory.createTableColumn("Dtl.dim_unit_nm", MCColumnType.TEXT);
		p.columnDtl_dim = p.beansFactory.createTableColumn("Dtl.dim", MCColumnType.NUMBER);
		p.columnDtl_wt_unit_cd = p.beansFactory.createTableColumn("Dtl.wt_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wt_unit_nm = p.beansFactory.createTableColumn("Dtl.wt_unit_nm", MCColumnType.TEXT);
		p.columnDtl_wt = p.beansFactory.createTableColumn("Dtl.wt", MCColumnType.NUMBER);
		p.columnDtl_conts_unit_cd = p.beansFactory.createTableColumn("Dtl.conts_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_conts_unit_nm = p.beansFactory.createTableColumn("Dtl.conts_unit_nm", MCColumnType.TEXT);
		p.columnDtl_conts_qty = p.beansFactory.createTableColumn("Dtl.conts_qty", MCColumnType.NUMBER);
		p.columnDtl_unit_dim = p.beansFactory.createTableColumn("Dtl.unit_dim", MCColumnType.NUMBER);
		p.columnDtl_unit_wt = p.beansFactory.createTableColumn("Dtl.unit_wt", MCColumnType.NUMBER);
		p.columnDtl_sls_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.sls_itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd1 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm1 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm1", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd2 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm2 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm2", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd3 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm3 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm3", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd4 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm4 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm4", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd5 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm5 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm5", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd6 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm6 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm6", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd7 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm7 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm7", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd8 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm8 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm8", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd9 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm9 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm9", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd10 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd10", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm10 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm10", MCColumnType.TEXT);
		p.columnDtl_hs_cd = p.beansFactory.createTableColumn("Dtl.hs_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_hs_nm = p.beansFactory.createTableColumn("Dtl.hs_nm", MCColumnType.TEXT);
		p.columnDtl_jan_typ = p.beansFactory.createTableColumn("Dtl.jan_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_jan_typ_nm = p.beansFactory.createTableColumn("Dtl.jan_typ_nm", MCColumnType.TEXT);
		p.columnDtl_jan_cd = p.beansFactory.createTableColumn("Dtl.jan_cd", MCColumnType.TEXT);
		p.columnDtl_itf_cd = p.beansFactory.createTableColumn("Dtl.itf_cd", MCColumnType.TEXT);
		p.columnDtl_gtin_cd = p.beansFactory.createTableColumn("Dtl.gtin_cd", MCColumnType.TEXT);
		p.columnDtl_memo1_c = p.beansFactory.createTableColumn("Dtl.memo1_c", MCColumnType.TEXT);
		p.columnDtl_memo2_c = p.beansFactory.createTableColumn("Dtl.memo2_c", MCColumnType.TEXT);
		p.columnDtl_memo3_c = p.beansFactory.createTableColumn("Dtl.memo3_c", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id_c = p.beansFactory.createTableColumn("Dtl.ins_usr_id_c", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm_c = p.beansFactory.createTableColumn("Dtl.ins_usr_nm_c", MCColumnType.TEXT);
		p.columnDtl_ins_ts_c = p.beansFactory.createTableColumn("Dtl.ins_ts_c", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id_c = p.beansFactory.createTableColumn("Dtl.ins_func_id_c", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm_c = p.beansFactory.createTableColumn("Dtl.ins_func_nm_c", MCColumnType.TEXT);
		p.columnDtl_upd_cntr_c = p.beansFactory.createTableColumn("Dtl.upd_cntr_c", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id_c = p.beansFactory.createTableColumn("Dtl.upd_usr_id_c", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm_c = p.beansFactory.createTableColumn("Dtl.upd_usr_nm_c", MCColumnType.TEXT);
		p.columnDtl_upd_ts_c = p.beansFactory.createTableColumn("Dtl.upd_ts_c", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id_c = p.beansFactory.createTableColumn("Dtl.upd_func_id_c", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm_c = p.beansFactory.createTableColumn("Dtl.upd_func_nm_c", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no_c = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no_c", MCColumnType.TEXT);
		p.columnDtl_co_cd = p.beansFactory.createTableColumn("Dtl.co_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_ac_itm_grp_cd = p.beansFactory.createTableColumn("Dtl.ac_itm_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_itm_grp_nm = p.beansFactory.createTableColumn("Dtl.ac_itm_grp_nm", MCColumnType.TEXT);
		p.columnDtl_minus_stk_flg = p.beansFactory.createTableColumn("Dtl.minus_stk_flg", MCColumnType.CHECK);
		p.columnDtl_gi_alloc_flg = p.beansFactory.createTableColumn("Dtl.gi_alloc_flg", MCColumnType.CHECK);
		p.columnDtl_sls_tax_cd = p.beansFactory.createTableColumn("Dtl.sls_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_tax_nm = p.beansFactory.createTableColumn("Dtl.sls_tax_nm", MCColumnType.TEXT);
		p.columnDtl_purc_tax_cd = p.beansFactory.createTableColumn("Dtl.purc_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_tax_nm = p.beansFactory.createTableColumn("Dtl.purc_tax_nm", MCColumnType.TEXT);
		p.columnDtl_prov_tax_cd = p.beansFactory.createTableColumn("Dtl.prov_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_prov_tax_nm = p.beansFactory.createTableColumn("Dtl.prov_tax_nm", MCColumnType.TEXT);
		p.columnDtl_wtax_rate = p.beansFactory.createTableColumn("Dtl.wtax_rate", MCColumnType.NUMBER);
		p.columnDtl_ship_unit_cd = p.beansFactory.createTableColumn("Dtl.ship_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_unit_nm = p.beansFactory.createTableColumn("Dtl.ship_unit_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_unit_cd = p.beansFactory.createTableColumn("Dtl.mfg_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_unit_nm = p.beansFactory.createTableColumn("Dtl.mfg_unit_nm", MCColumnType.TEXT);
		p.columnDtl_purc_unit_cd = p.beansFactory.createTableColumn("Dtl.purc_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_unit_nm = p.beansFactory.createTableColumn("Dtl.purc_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pckg_unit_cd = p.beansFactory.createTableColumn("Dtl.pckg_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pckg_unit_nm = p.beansFactory.createTableColumn("Dtl.pckg_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_alloc_flg = p.beansFactory.createTableColumn("Dtl.pack_alloc_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no_typ = p.beansFactory.createTableColumn("Dtl.lot_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_no_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_no_ptn_cd = p.beansFactory.createTableColumn("Dtl.lot_no_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_no_ptn_nm = p.beansFactory.createTableColumn("Dtl.lot_no_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_no_typ = p.beansFactory.createTableColumn("Dtl.sublot_no_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_no_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_no_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_no_ptn_cd = p.beansFactory.createTableColumn("Dtl.sublot_no_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_no_ptn_nm = p.beansFactory.createTableColumn("Dtl.sublot_no_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_not_new_lot_flg = p.beansFactory.createTableColumn("Dtl.not_new_lot_flg", MCColumnType.CHECK);
		p.columnDtl_bp_lot_flg = p.beansFactory.createTableColumn("Dtl.bp_lot_flg", MCColumnType.CHECK);
		p.columnDtl_insp_bind_typ = p.beansFactory.createTableColumn("Dtl.insp_bind_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_insp_bind_typ_nm = p.beansFactory.createTableColumn("Dtl.insp_bind_typ_nm", MCColumnType.TEXT);
		p.columnDtl_skip_chk_ship_flg = p.beansFactory.createTableColumn("Dtl.skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnDtl_mrkt_judg_flg = p.beansFactory.createTableColumn("Dtl.mrkt_judg_flg", MCColumnType.CHECK);
		p.columnDtl_mrkt_judg_role_cd = p.beansFactory.createTableColumn("Dtl.mrkt_judg_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mrkt_judg_role_nm = p.beansFactory.createTableColumn("Dtl.mrkt_judg_role_nm", MCColumnType.TEXT);
		p.columnDtl_mrkt_judg_upd_role_cd = p.beansFactory.createTableColumn("Dtl.mrkt_judg_upd_role_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_mrkt_judg_upd_role_nm = p.beansFactory.createTableColumn("Dtl.mrkt_judg_upd_role_nm", MCColumnType.TEXT);
		p.columnDtl_lmt_ctl_flg = p.beansFactory.createTableColumn("Dtl.lmt_ctl_flg", MCColumnType.CHECK);
		p.columnDtl_lmt_ctl_categ = p.beansFactory.createTableColumn("Dtl.lmt_ctl_categ", MCColumnType.TEXT);
		p.columnDtl_ship_lot_back_stop_flg = p.beansFactory.createTableColumn("Dtl.ship_lot_back_stop_flg", MCColumnType.CHECK);
		p.columnDtl_ship_valid_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_valid_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_valid_grp_nm = p.beansFactory.createTableColumn("Dtl.ship_valid_grp_nm", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_std_cont_fctr = p.beansFactory.createTableColumn("Dtl.std_cont_fctr", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_unit_cd = p.beansFactory.createTableColumn("Dtl.cont_fctr_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cont_fctr_unit_nm = p.beansFactory.createTableColumn("Dtl.cont_fctr_unit_nm", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_cont_fctr_rnd_typ_nm = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_sno1_flg = p.beansFactory.createTableColumn("Dtl.slo_sno1_flg", MCColumnType.CHECK);
		p.columnDtl_rqmt_sno1_flg = p.beansFactory.createTableColumn("Dtl.rqmt_sno1_flg", MCColumnType.CHECK);
		p.columnDtl_sno1_num_typ = p.beansFactory.createTableColumn("Dtl.sno1_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_num_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_ptn_cd = p.beansFactory.createTableColumn("Dtl.sno1_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_ptn_nm = p.beansFactory.createTableColumn("Dtl.sno1_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_sno2_flg = p.beansFactory.createTableColumn("Dtl.slo_sno2_flg", MCColumnType.CHECK);
		p.columnDtl_rqmt_sno2_flg = p.beansFactory.createTableColumn("Dtl.rqmt_sno2_flg", MCColumnType.CHECK);
		p.columnDtl_sno2_num_typ = p.beansFactory.createTableColumn("Dtl.sno2_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_num_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_ptn_cd = p.beansFactory.createTableColumn("Dtl.sno2_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_ptn_nm = p.beansFactory.createTableColumn("Dtl.sno2_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_sno3_flg = p.beansFactory.createTableColumn("Dtl.slo_sno3_flg", MCColumnType.CHECK);
		p.columnDtl_rqmt_sno3_flg = p.beansFactory.createTableColumn("Dtl.rqmt_sno3_flg", MCColumnType.CHECK);
		p.columnDtl_sno3_num_typ = p.beansFactory.createTableColumn("Dtl.sno3_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_num_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_ptn_cd = p.beansFactory.createTableColumn("Dtl.sno3_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_ptn_nm = p.beansFactory.createTableColumn("Dtl.sno3_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_mng_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_sno4_flg = p.beansFactory.createTableColumn("Dtl.slo_sno4_flg", MCColumnType.CHECK);
		p.columnDtl_rqmt_sno4_flg = p.beansFactory.createTableColumn("Dtl.rqmt_sno4_flg", MCColumnType.CHECK);
		p.columnDtl_sno4_num_typ = p.beansFactory.createTableColumn("Dtl.sno4_num_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_num_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_num_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_ptn_cd = p.beansFactory.createTableColumn("Dtl.sno4_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_ptn_nm = p.beansFactory.createTableColumn("Dtl.sno4_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_unit_typ = p.beansFactory.createTableColumn("Dtl.mfg_inst_unit_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_mfg_inst_unit_typ_nm = p.beansFactory.createTableColumn("Dtl.mfg_inst_unit_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mrp_proc_typ = p.beansFactory.createTableColumn("Dtl.mrp_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_mrp_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.mrp_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rqmt_typ = p.beansFactory.createTableColumn("Dtl.rqmt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_rqmt_typ_nm = p.beansFactory.createTableColumn("Dtl.rqmt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prod_pln_typ = p.beansFactory.createTableColumn("Dtl.prod_pln_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_prod_pln_typ_nm = p.beansFactory.createTableColumn("Dtl.prod_pln_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dmnd_date_div_mons = p.beansFactory.createTableColumn("Dtl.dmnd_date_div_mons", MCColumnType.NUMBER);
		p.columnDtl_alloc_margin_days = p.beansFactory.createTableColumn("Dtl.alloc_margin_days", MCColumnType.NUMBER);
		p.columnDtl_mrp_alloc_margin_days = p.beansFactory.createTableColumn("Dtl.mrp_alloc_margin_days", MCColumnType.NUMBER);
		p.columnDtl_mrp_opn_xfr_days = p.beansFactory.createTableColumn("Dtl.mrp_opn_xfr_days", MCColumnType.NUMBER);
		p.columnDtl_inpt_itm_add_flg = p.beansFactory.createTableColumn("Dtl.inpt_itm_add_flg", MCColumnType.CHECK);
		p.columnDtl_inpt_itm_del_flg = p.beansFactory.createTableColumn("Dtl.inpt_itm_del_flg", MCColumnType.CHECK);
		p.columnDtl_sch_flg = p.beansFactory.createTableColumn("Dtl.sch_flg", MCColumnType.CHECK);
		p.columnDtl_cntry_org_cd = p.beansFactory.createTableColumn("Dtl.cntry_org_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cntry_org_nm = p.beansFactory.createTableColumn("Dtl.cntry_org_nm", MCColumnType.TEXT);
		p.columnDtl_comp_spec_typ = p.beansFactory.createTableColumn("Dtl.comp_spec_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_comp_spec_typ_nm = p.beansFactory.createTableColumn("Dtl.comp_spec_typ_nm", MCColumnType.TEXT);
		p.columnDtl_comp_rev_at_slo_flg = p.beansFactory.createTableColumn("Dtl.comp_rev_at_slo_flg", MCColumnType.CHECK);
		p.columnDtl_comp_core_itm_flg = p.beansFactory.createTableColumn("Dtl.comp_core_itm_flg", MCColumnType.CHECK);
		p.columnDtl_itm_spec_grp_cd = p.beansFactory.createTableColumn("Dtl.itm_spec_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_spec_grp_nm = p.beansFactory.createTableColumn("Dtl.itm_spec_grp_nm", MCColumnType.TEXT);
		p.columnDtl_sls_upri_grp_cd = p.beansFactory.createTableColumn("Dtl.sls_upri_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_upri_grp_nm = p.beansFactory.createTableColumn("Dtl.sls_upri_grp_nm", MCColumnType.TEXT);
		p.columnDtl_bill_crryovr_times = p.beansFactory.createTableColumn("Dtl.bill_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_pay_crryovr_times = p.beansFactory.createTableColumn("Dtl.pay_crryovr_times", MCColumnType.NUMBER);
		p.columnDtl_slo_proc_flg = p.beansFactory.createTableColumn("Dtl.slo_proc_flg", MCColumnType.CHECK);
		p.columnDtl_slo_proc_typ = p.beansFactory.createTableColumn("Dtl.slo_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_slo_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.slo_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ship_inst_typ = p.beansFactory.createTableColumn("Dtl.ship_inst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_inst_typ_nm = p.beansFactory.createTableColumn("Dtl.ship_inst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_ship_grp_cd = p.beansFactory.createTableColumn("Dtl.itm_ship_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_ship_grp_nm = p.beansFactory.createTableColumn("Dtl.itm_ship_grp_nm", MCColumnType.TEXT);
		p.columnDtl_arr_skip_flg = p.beansFactory.createTableColumn("Dtl.arr_skip_flg", MCColumnType.CHECK);
		p.columnDtl_purc_dlv_slip_flg = p.beansFactory.createTableColumn("Dtl.purc_dlv_slip_flg", MCColumnType.CHECK);
		p.columnDtl_ship_term_cd = p.beansFactory.createTableColumn("Dtl.ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_term_nm = p.beansFactory.createTableColumn("Dtl.ship_term_nm", MCColumnType.TEXT);
		p.columnDtl_exim_xpns_typ = p.beansFactory.createTableColumn("Dtl.exim_xpns_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_exim_xpns_typ_nm = p.beansFactory.createTableColumn("Dtl.exim_xpns_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_lst_flg = p.beansFactory.createTableColumn("Dtl.stk_lst_flg", MCColumnType.CHECK);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_sls_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.sls_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_purc_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.purc_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_prov_upri_cng_flg = p.beansFactory.createTableColumn("Dtl.prov_upri_cng_flg", MCColumnType.CHECK);
		p.columnDtl_ext_sys_no_itm = p.beansFactory.createTableColumn("Dtl.ext_sys_no_itm", MCColumnType.TEXT);
		p.columnDtl_chng_no = p.beansFactory.createTableColumn("Dtl.chng_no", MCColumnType.TEXT);
		p.columnDtl_calc_ptn_cd = p.beansFactory.createTableColumn("Dtl.calc_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_calc_ptn_nm = p.beansFactory.createTableColumn("Dtl.calc_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_itm_alc_grp = p.beansFactory.createTableColumn("Dtl.itm_alc_grp", MCColumnType.TEXT);
		p.columnDtl_sls_flg = p.beansFactory.createTableColumn("Dtl.sls_flg", MCColumnType.CHECK);
		p.columnDtl_sls_input_flg = p.beansFactory.createTableColumn("Dtl.sls_input_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_flg = p.beansFactory.createTableColumn("Dtl.mfg_flg", MCColumnType.CHECK);
		p.columnDtl_mfg_input_flg = p.beansFactory.createTableColumn("Dtl.mfg_input_flg", MCColumnType.CHECK);
		p.columnDtl_purc_flg = p.beansFactory.createTableColumn("Dtl.purc_flg", MCColumnType.CHECK);
		p.columnDtl_purc_input_flg = p.beansFactory.createTableColumn("Dtl.purc_input_flg", MCColumnType.CHECK);
		p.columnDtl_insp_flg = p.beansFactory.createTableColumn("Dtl.insp_flg", MCColumnType.CHECK);
		p.columnDtl_insp_input_flg = p.beansFactory.createTableColumn("Dtl.insp_input_flg", MCColumnType.CHECK);
		p.columnDtl_release_tm = p.beansFactory.createTableColumn("Dtl.release_tm", MCColumnType.DATE);
		p.columnDtl_release_usr_cd = p.beansFactory.createTableColumn("Dtl.release_usr_cd", MCColumnType.TEXT);
		p.columnDtl_release_usr_nm = p.beansFactory.createTableColumn("Dtl.release_usr_nm", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABCP0310 = p.beansFactory.createButton("DtlBtn.open_MABCP0310", "open");
		p.DtlBtn_open_MABSP1120 = p.beansFactory.createButton("DtlBtn.open_MABSP1120", "open");
		p.DtlBtn_open_MABSP1100 = p.beansFactory.createButton("DtlBtn.open_MABSP1100", "open");
		p.DtlBtn_open_MABSP1110 = p.beansFactory.createButton("DtlBtn.open_MABSP1110", "open");
		p.DtlBtn_open_MABSP1130 = p.beansFactory.createButton("DtlBtn.open_MABSP1130", "open");
		p.DtlBtn_open_MABCP0870 = p.beansFactory.createButton("DtlBtn.open_MABCP0870", "open");
		p.DtlBtn_open_MABCP0840 = p.beansFactory.createButton("DtlBtn.open_MABCP0840", "open");
		p.DtlBtn_open_MABCP0400 = p.beansFactory.createButton("DtlBtn.open_MABCP0400", "open");
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd = p.beansFactory.createButton("DtlBtn.upd", "upd");
		p.DtlBtn_upd_admin = p.beansFactory.createButton("DtlBtn.upd_admin", "upd");
		p.DtlBtn_upd_cmn = p.beansFactory.createButton("DtlBtn.upd_cmn", "upd");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TargetSrchPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NWW");
		// ブロックの項目の初期化
	}

	/**
	 * [TargetSrch]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTargetSrch(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.TargetSrchPanel.setBorder(p.TargetSrchTitledBorder);
		p.add(p.TargetSrchPanel);
		p.TargetSrchPanel.setNextBeans(p.MstPanel);
		p.TargetSrchPanel.setValueCheck(false);
		p.TargetSrchPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TargetSrchPanel.setLayoutPosition("NWC");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0390.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_ItmLst p) {
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
	protected static void jbInitFold(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABCP_ItmLst p) {
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
	protected static void jbInitCnd(MABCP_ItmLst p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.ope_META);
		p.TargetSrchPanel.setLastBeans(p.Cnd_tar_Group);
		p.Cnd_tar_Group.setFirstBeans(p.Cnd_tar_COM);
		p.Cnd_tar_COM.setActionCommand("1");
		p.Cnd_tar_Group.add(p.Cnd_tar_COM);
		p.TargetSrchPanel.add(p.Cnd_tar_COM);
		p.Cnd_tar_COM.setNextBeans(p.Cnd_tar_ALL);
		p.Cnd_tar_ALL.setActionCommand("2");
		p.Cnd_tar_Group.add(p.Cnd_tar_ALL);
		p.TargetSrchPanel.add(p.Cnd_tar_ALL);
		p.Cnd_tar_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.tar_META);
		p.Tab1Panel.add(p.Cnd_own_co_flg_lab);
		p.Tab1Panel.add(p.Cnd_own_co_flg_off);
		p.Tab1Panel.setLastBeans(p.Cnd_own_co_flg_off);
		p.Cnd_own_co_flg_off.setNextBeans(p.Cnd_own_co_flg_on);
		p.Cnd_own_co_flg_off.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.own_co_flg_off_META);
		p.Tab1Panel.add(p.Cnd_own_co_flg_on);
		p.Cnd_own_co_flg_on.setNextBeans(p.Cnd_release_flg_off);
		p.Cnd_own_co_flg_on.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.own_co_flg_on_META);
		p.Tab1Panel.add(p.Cnd_release_flg_lab);
		p.Tab1Panel.add(p.Cnd_release_flg_off);
		p.Cnd_release_flg_off.setNextBeans(p.Cnd_release_flg_on);
		p.Cnd_release_flg_off.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.release_flg_off_META);
		p.Tab1Panel.add(p.Cnd_release_flg_on);
		p.Cnd_release_flg_on.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_release_flg_on.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.release_flg_on_META);
		p.Tab1Panel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_stk_mng_typ);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.Cnd_stk_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_mng_typ, true);
		p.Cnd_stk_mng_typ.setLinkBeans(p.Cnd_stk_mng_typ_nm);
		p.Tab1Panel.add(p.Cnd_stk_mng_typ_Label);
		p.Tab1Panel.add(p.Cnd_stk_mng_typ);
		p.Cnd_stk_mng_typ.setNextBeans(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.stk_mng_typ_META);
		p.Tab1Panel.add(p.Cnd_stk_mng_typ_nm);
		p.Cnd_stk_mng_typ_nm.setNextBeans(p.Cnd_asset_mng_typ);
		p.Cnd_stk_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.stk_mng_typ_nm_META);
		p.Cnd_asset_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asset_mng_typ, true);
		p.Cnd_asset_mng_typ.setLinkBeans(p.Cnd_asset_mng_typ_nm);
		p.Tab1Panel.add(p.Cnd_asset_mng_typ_Label);
		p.Tab1Panel.add(p.Cnd_asset_mng_typ);
		p.Cnd_asset_mng_typ.setNextBeans(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.asset_mng_typ_META);
		p.Tab1Panel.add(p.Cnd_asset_mng_typ_nm);
		p.Cnd_asset_mng_typ_nm.setNextBeans(p.Cnd_sundry_itm_flg_off);
		p.Cnd_asset_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.asset_mng_typ_nm_META);
		p.Tab1Panel.add(p.Cnd_sundry_itm_flg_lab);
		p.Tab1Panel.add(p.Cnd_sundry_itm_flg_off);
		p.Cnd_sundry_itm_flg_off.setNextBeans(p.Cnd_sundry_itm_flg_on);
		p.Cnd_sundry_itm_flg_off.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.sundry_itm_flg_off_META);
		p.Tab1Panel.add(p.Cnd_sundry_itm_flg_on);
		p.Cnd_sundry_itm_flg_on.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_sundry_itm_flg_on.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.sundry_itm_flg_on_META);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setNextBeans(p.Cnd_memo1_c);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.on_del_flg_META);
		p.Tab1Panel.add(p.Cnd_memo1_c_Label);
		p.Tab1Panel.add(p.Cnd_memo1_c);
		p.Cnd_memo1_c.setNextBeans(p.Cnd_memo2_c);
		p.Cnd_memo1_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo1_c_META);
		p.setPluralValueEnable(p.Cnd_memo1_c, true);
		p.Tab1Panel.add(p.Cnd_memo2_c_Label);
		p.Tab1Panel.add(p.Cnd_memo2_c);
		p.Cnd_memo2_c.setNextBeans(p.Cnd_memo3_c);
		p.Cnd_memo2_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo2_c_META);
		p.setPluralValueEnable(p.Cnd_memo2_c, true);
		p.Tab1Panel.add(p.Cnd_memo3_c_Label);
		p.Tab1Panel.add(p.Cnd_memo3_c);
		p.Cnd_memo3_c.setNextBeans(p.Cnd_memo1);
		p.Cnd_memo3_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo3_c_META);
		p.setPluralValueEnable(p.Cnd_memo3_c, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_th_image_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_th_image_flg);
		p.Cnd_th_image_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.th_image_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setNextBeans(p.Cnd_upd_only_com_flg);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Tab2Panel.add(p.Cnd_upd_only_com_flg);
		p.Cnd_upd_only_com_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0390.CndR.upd_only_com_flg_META);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_ItmLst p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ItmLst p) {
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
	protected static void jbInitDtlBtn(MABCP_ItmLst p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
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
		p.DtlBtn_open_MABSP1130.setNextBeans(p.DtlBtn_open_MABCP0870);
		p.DtlBtn_open_MABCP0870.setFunctionKey(MCFunctionKey.F12);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABCP0870);
		p.DtlBtn_open_MABCP0870.setNextBeans(p.DtlBtn_open_MABCP0840);
		p.DtlBtn_open_MABCP0840.setFunctionKey(MCFunctionKey.F15);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABCP0840);
		p.DtlBtn_open_MABCP0840.setNextBeans(p.DtlBtn_open_MABCP0400);
		p.DtlBtn_open_MABCP0400.setFunctionKey(MCFunctionKey.F16);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABCP0400);
		p.DtlBtn_open_MABCP0400.setNextBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
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
		p.DtlBtn_upd.setNextBeans(p.DtlBtn_upd_admin);
		p.DtlBtn_upd_admin.setIcon("REGISTER");
		p.DtlBtn_upd_admin.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_admin);
		p.DtlBtn_upd_admin.setNextBeans(p.DtlBtn_upd_cmn);
		p.DtlBtn_upd_cmn.setIcon("REGISTER");
		p.DtlBtn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_cmn);
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
		MABCP_ItmLst_MC.mcInitScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitTargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitMst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitTop((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitFold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitCndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitCnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitTab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitTab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitCtrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitDtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.mcInitDtlBtn((MABCP_ItmLst)this);

		// [UPD]ステータスのモードの設定
		MABCP_ItmLst_MC.statusInitUPD_ScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_TargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Mst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Top((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Fold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_CndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Cnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Tab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Tab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Ctrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_Dtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD_DtlBtn((MABCP_ItmLst)this);

		// [FIX]ステータスのモードの設定
		MABCP_ItmLst_MC.statusInitFIX_ScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_TargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Mst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Top((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Fold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_CndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Cnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Tab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Tab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Ctrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_Dtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitFIX_DtlBtn((MABCP_ItmLst)this);

		// [UPD_ADMIN]ステータスのモードの設定
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_ScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_TargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Mst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Top((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Fold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_CndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Cnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Tab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Tab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Ctrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_Dtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitUPD__ADMIN_DtlBtn((MABCP_ItmLst)this);

		// [REF]ステータスのモードの設定
		MABCP_ItmLst_MC.statusInitREF_ScreenOpe((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_TargetSrch((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Mst((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Top((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Fold((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_CndTab((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Cnd((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Tab1((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Tab2((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Ctrl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_Dtl((MABCP_ItmLst)this);
		MABCP_ItmLst_MC.statusInitREF_DtlBtn((MABCP_ItmLst)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_ItmLst p) {
	}

	/**
	 *  [TargetSrch]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTargetSrch(MABCP_ItmLst p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_ItmLst p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_ItmLst p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_ItmLst p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABCP_ItmLst p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ItmLst p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_UPD_ADMIN.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_tar_Group.addAllListener(p);
		p.Cnd_tar_COM.addAllListener(p);
		p.Cnd_tar_ALL.addAllListener(p);
		p.Cnd_own_co_flg_off.addAllListener(p);
		p.Cnd_own_co_flg_on.addAllListener(p);
		p.Cnd_release_flg_off.addAllListener(p);
		p.Cnd_release_flg_on.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_stk_mng_typ.setListListener(p);
		p.Cnd_stk_mng_typ.addAllListener(p);
		p.Cnd_stk_mng_typ_nm.setListListener(p);
		p.Cnd_stk_mng_typ_nm.addAllListener(p);
		p.Cnd_asset_mng_typ.setListListener(p);
		p.Cnd_asset_mng_typ.addAllListener(p);
		p.Cnd_asset_mng_typ_nm.setListListener(p);
		p.Cnd_asset_mng_typ_nm.addAllListener(p);
		p.Cnd_sundry_itm_flg_off.addAllListener(p);
		p.Cnd_sundry_itm_flg_on.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
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
		p.Cnd_th_image_flg.addAllListener(p);
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
		p.Cnd_upd_only_com_flg.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_ItmLst p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_ItmLst p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_ItmLst p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ItmLst p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_release_flg.addAllListener(p);
		p.columnDtl_th_image_flg.addAllListener(p);
		p.columnDtl_th_image.addAllListener(p);
		p.columnDtl_itm_cd.addAllListener(p);
		p.columnDtl_itm_cd.setListListener(p);
		p.columnDtl_itm_sub1.addAllListener(p);
		p.columnDtl_itm_sub1.setListListener(p);
		p.columnDtl_itm_sub2.addAllListener(p);
		p.columnDtl_itm_sub2.setListListener(p);
		p.columnDtl_itm_sub3.addAllListener(p);
		p.columnDtl_itm_sub3.setListListener(p);
		p.columnDtl_itm_nm.addAllListener(p);
		p.columnDtl_itm_nm.setListListener(p);
		p.columnDtl_base_itm_nm.addAllListener(p);
		p.columnDtl_base_itm_nm.setListListener(p);
		p.columnDtl_base_itm_alt_nm1.addAllListener(p);
		p.columnDtl_base_itm_alt_nm1.setListListener(p);
		p.columnDtl_base_itm_alt_nm2.addAllListener(p);
		p.columnDtl_base_itm_alt_nm2.setListListener(p);
		p.columnDtl_base_itm_alt_nm3.addAllListener(p);
		p.columnDtl_base_itm_alt_nm3.setListListener(p);
		p.columnDtl_base_itm_alt_nm4.addAllListener(p);
		p.columnDtl_base_itm_alt_nm4.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_stk_mng_typ_nm.addAllListener(p);
		p.columnDtl_stk_mng_typ_nm.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ_nm.addAllListener(p);
		p.columnDtl_asset_mng_typ_nm.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_unit_cd.addAllListener(p);
		p.columnDtl_unit_cd.setListListener(p);
		p.columnDtl_unit_nm.addAllListener(p);
		p.columnDtl_unit_nm.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_rnd_typ.addAllListener(p);
		p.columnDtl_rnd_typ.setListListener(p);
		p.columnDtl_rnd_typ_nm.addAllListener(p);
		p.columnDtl_rnd_typ_nm.setListListener(p);
		p.columnDtl_dim_unit_cd.addAllListener(p);
		p.columnDtl_dim_unit_cd.setListListener(p);
		p.columnDtl_dim_unit_nm.addAllListener(p);
		p.columnDtl_dim_unit_nm.setListListener(p);
		p.columnDtl_dim.addAllListener(p);
		p.columnDtl_dim.setListListener(p);
		p.columnDtl_wt_unit_cd.addAllListener(p);
		p.columnDtl_wt_unit_cd.setListListener(p);
		p.columnDtl_wt_unit_nm.addAllListener(p);
		p.columnDtl_wt_unit_nm.setListListener(p);
		p.columnDtl_wt.addAllListener(p);
		p.columnDtl_wt.setListListener(p);
		p.columnDtl_conts_unit_cd.addAllListener(p);
		p.columnDtl_conts_unit_cd.setListListener(p);
		p.columnDtl_conts_unit_nm.addAllListener(p);
		p.columnDtl_conts_unit_nm.setListListener(p);
		p.columnDtl_conts_qty.addAllListener(p);
		p.columnDtl_conts_qty.setListListener(p);
		p.columnDtl_unit_dim.addAllListener(p);
		p.columnDtl_unit_dim.setListListener(p);
		p.columnDtl_unit_wt.addAllListener(p);
		p.columnDtl_unit_wt.setListListener(p);
		p.columnDtl_sls_itm_grp_cd.addAllListener(p);
		p.columnDtl_sls_itm_grp_cd.setListListener(p);
		p.columnDtl_sls_itm_grp_nm.addAllListener(p);
		p.columnDtl_sls_itm_grp_nm.setListListener(p);
		p.columnDtl_itm_grp_cd1.addAllListener(p);
		p.columnDtl_itm_grp_cd1.setListListener(p);
		p.columnDtl_itm_grp_nm1.addAllListener(p);
		p.columnDtl_itm_grp_nm1.setListListener(p);
		p.columnDtl_itm_grp_cd2.addAllListener(p);
		p.columnDtl_itm_grp_cd2.setListListener(p);
		p.columnDtl_itm_grp_nm2.addAllListener(p);
		p.columnDtl_itm_grp_nm2.setListListener(p);
		p.columnDtl_itm_grp_cd3.addAllListener(p);
		p.columnDtl_itm_grp_cd3.setListListener(p);
		p.columnDtl_itm_grp_nm3.addAllListener(p);
		p.columnDtl_itm_grp_nm3.setListListener(p);
		p.columnDtl_itm_grp_cd4.addAllListener(p);
		p.columnDtl_itm_grp_cd4.setListListener(p);
		p.columnDtl_itm_grp_nm4.addAllListener(p);
		p.columnDtl_itm_grp_nm4.setListListener(p);
		p.columnDtl_itm_grp_cd5.addAllListener(p);
		p.columnDtl_itm_grp_cd5.setListListener(p);
		p.columnDtl_itm_grp_nm5.addAllListener(p);
		p.columnDtl_itm_grp_nm5.setListListener(p);
		p.columnDtl_itm_grp_cd6.addAllListener(p);
		p.columnDtl_itm_grp_cd6.setListListener(p);
		p.columnDtl_itm_grp_nm6.addAllListener(p);
		p.columnDtl_itm_grp_nm6.setListListener(p);
		p.columnDtl_itm_grp_cd7.addAllListener(p);
		p.columnDtl_itm_grp_cd7.setListListener(p);
		p.columnDtl_itm_grp_nm7.addAllListener(p);
		p.columnDtl_itm_grp_nm7.setListListener(p);
		p.columnDtl_itm_grp_cd8.addAllListener(p);
		p.columnDtl_itm_grp_cd8.setListListener(p);
		p.columnDtl_itm_grp_nm8.addAllListener(p);
		p.columnDtl_itm_grp_nm8.setListListener(p);
		p.columnDtl_itm_grp_cd9.addAllListener(p);
		p.columnDtl_itm_grp_cd9.setListListener(p);
		p.columnDtl_itm_grp_nm9.addAllListener(p);
		p.columnDtl_itm_grp_nm9.setListListener(p);
		p.columnDtl_itm_grp_cd10.addAllListener(p);
		p.columnDtl_itm_grp_cd10.setListListener(p);
		p.columnDtl_itm_grp_nm10.addAllListener(p);
		p.columnDtl_itm_grp_nm10.setListListener(p);
		p.columnDtl_hs_cd.addAllListener(p);
		p.columnDtl_hs_cd.setListListener(p);
		p.columnDtl_hs_nm.addAllListener(p);
		p.columnDtl_hs_nm.setListListener(p);
		p.columnDtl_jan_typ.addAllListener(p);
		p.columnDtl_jan_typ.setListListener(p);
		p.columnDtl_jan_typ_nm.addAllListener(p);
		p.columnDtl_jan_typ_nm.setListListener(p);
		p.columnDtl_jan_cd.addAllListener(p);
		p.columnDtl_jan_cd.setListListener(p);
		p.columnDtl_itf_cd.addAllListener(p);
		p.columnDtl_itf_cd.setListListener(p);
		p.columnDtl_gtin_cd.addAllListener(p);
		p.columnDtl_gtin_cd.setListListener(p);
		p.columnDtl_memo1_c.addAllListener(p);
		p.columnDtl_memo1_c.setListListener(p);
		p.columnDtl_memo2_c.addAllListener(p);
		p.columnDtl_memo2_c.setListListener(p);
		p.columnDtl_memo3_c.addAllListener(p);
		p.columnDtl_memo3_c.setListListener(p);
		p.columnDtl_ins_usr_id_c.addAllListener(p);
		p.columnDtl_ins_usr_id_c.setListListener(p);
		p.columnDtl_ins_usr_nm_c.addAllListener(p);
		p.columnDtl_ins_usr_nm_c.setListListener(p);
		p.columnDtl_ins_ts_c.addAllListener(p);
		p.columnDtl_ins_ts_c.setListListener(p);
		p.columnDtl_ins_func_id_c.addAllListener(p);
		p.columnDtl_ins_func_id_c.setListListener(p);
		p.columnDtl_ins_func_nm_c.addAllListener(p);
		p.columnDtl_ins_func_nm_c.setListListener(p);
		p.columnDtl_upd_cntr_c.addAllListener(p);
		p.columnDtl_upd_cntr_c.setListListener(p);
		p.columnDtl_upd_usr_id_c.addAllListener(p);
		p.columnDtl_upd_usr_id_c.setListListener(p);
		p.columnDtl_upd_usr_nm_c.addAllListener(p);
		p.columnDtl_upd_usr_nm_c.setListListener(p);
		p.columnDtl_upd_ts_c.addAllListener(p);
		p.columnDtl_upd_ts_c.setListListener(p);
		p.columnDtl_upd_func_id_c.addAllListener(p);
		p.columnDtl_upd_func_id_c.setListListener(p);
		p.columnDtl_upd_func_nm_c.addAllListener(p);
		p.columnDtl_upd_func_nm_c.setListListener(p);
		p.columnDtl_upd_srv_req_no_c.addAllListener(p);
		p.columnDtl_upd_srv_req_no_c.setListListener(p);
		p.columnDtl_co_cd.addAllListener(p);
		p.columnDtl_co_cd.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_ac_itm_grp_cd.addAllListener(p);
		p.columnDtl_ac_itm_grp_cd.setListListener(p);
		p.columnDtl_ac_itm_grp_nm.addAllListener(p);
		p.columnDtl_ac_itm_grp_nm.setListListener(p);
		p.columnDtl_minus_stk_flg.addAllListener(p);
		p.columnDtl_gi_alloc_flg.addAllListener(p);
		p.columnDtl_sls_tax_cd.addAllListener(p);
		p.columnDtl_sls_tax_cd.setListListener(p);
		p.columnDtl_sls_tax_nm.addAllListener(p);
		p.columnDtl_sls_tax_nm.setListListener(p);
		p.columnDtl_purc_tax_cd.addAllListener(p);
		p.columnDtl_purc_tax_cd.setListListener(p);
		p.columnDtl_purc_tax_nm.addAllListener(p);
		p.columnDtl_purc_tax_nm.setListListener(p);
		p.columnDtl_prov_tax_cd.addAllListener(p);
		p.columnDtl_prov_tax_cd.setListListener(p);
		p.columnDtl_prov_tax_nm.addAllListener(p);
		p.columnDtl_prov_tax_nm.setListListener(p);
		p.columnDtl_wtax_rate.addAllListener(p);
		p.columnDtl_wtax_rate.setListListener(p);
		p.columnDtl_ship_unit_cd.addAllListener(p);
		p.columnDtl_ship_unit_cd.setListListener(p);
		p.columnDtl_ship_unit_nm.addAllListener(p);
		p.columnDtl_ship_unit_nm.setListListener(p);
		p.columnDtl_mfg_unit_cd.addAllListener(p);
		p.columnDtl_mfg_unit_cd.setListListener(p);
		p.columnDtl_mfg_unit_nm.addAllListener(p);
		p.columnDtl_mfg_unit_nm.setListListener(p);
		p.columnDtl_purc_unit_cd.addAllListener(p);
		p.columnDtl_purc_unit_cd.setListListener(p);
		p.columnDtl_purc_unit_nm.addAllListener(p);
		p.columnDtl_purc_unit_nm.setListListener(p);
		p.columnDtl_pckg_unit_cd.addAllListener(p);
		p.columnDtl_pckg_unit_cd.setListListener(p);
		p.columnDtl_pckg_unit_nm.addAllListener(p);
		p.columnDtl_pckg_unit_nm.setListListener(p);
		p.columnDtl_pack_alloc_flg.addAllListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_lot_mng_typ_nm.addAllListener(p);
		p.columnDtl_lot_mng_typ_nm.setListListener(p);
		p.columnDtl_lot_no_typ.addAllListener(p);
		p.columnDtl_lot_no_typ.setListListener(p);
		p.columnDtl_lot_no_typ_nm.addAllListener(p);
		p.columnDtl_lot_no_typ_nm.setListListener(p);
		p.columnDtl_lot_no_ptn_cd.addAllListener(p);
		p.columnDtl_lot_no_ptn_cd.setListListener(p);
		p.columnDtl_lot_no_ptn_nm.addAllListener(p);
		p.columnDtl_lot_no_ptn_nm.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ_nm.addAllListener(p);
		p.columnDtl_sublot_mng_typ_nm.setListListener(p);
		p.columnDtl_sublot_no_typ.addAllListener(p);
		p.columnDtl_sublot_no_typ.setListListener(p);
		p.columnDtl_sublot_no_typ_nm.addAllListener(p);
		p.columnDtl_sublot_no_typ_nm.setListListener(p);
		p.columnDtl_sublot_no_ptn_cd.addAllListener(p);
		p.columnDtl_sublot_no_ptn_cd.setListListener(p);
		p.columnDtl_sublot_no_ptn_nm.addAllListener(p);
		p.columnDtl_sublot_no_ptn_nm.setListListener(p);
		p.columnDtl_not_new_lot_flg.addAllListener(p);
		p.columnDtl_bp_lot_flg.addAllListener(p);
		p.columnDtl_insp_bind_typ.addAllListener(p);
		p.columnDtl_insp_bind_typ.setListListener(p);
		p.columnDtl_insp_bind_typ_nm.addAllListener(p);
		p.columnDtl_insp_bind_typ_nm.setListListener(p);
		p.columnDtl_skip_chk_ship_flg.addAllListener(p);
		p.columnDtl_mrkt_judg_flg.addAllListener(p);
		p.columnDtl_mrkt_judg_role_cd.addAllListener(p);
		p.columnDtl_mrkt_judg_role_cd.setListListener(p);
		p.columnDtl_mrkt_judg_role_nm.addAllListener(p);
		p.columnDtl_mrkt_judg_role_nm.setListListener(p);
		p.columnDtl_mrkt_judg_upd_role_cd.addAllListener(p);
		p.columnDtl_mrkt_judg_upd_role_cd.setListListener(p);
		p.columnDtl_mrkt_judg_upd_role_nm.addAllListener(p);
		p.columnDtl_mrkt_judg_upd_role_nm.setListListener(p);
		p.columnDtl_lmt_ctl_flg.addAllListener(p);
		p.columnDtl_lmt_ctl_categ.addAllListener(p);
		p.columnDtl_lmt_ctl_categ.setListListener(p);
		p.columnDtl_ship_lot_back_stop_flg.addAllListener(p);
		p.columnDtl_ship_valid_grp_cd.addAllListener(p);
		p.columnDtl_ship_valid_grp_cd.setListListener(p);
		p.columnDtl_ship_valid_grp_nm.addAllListener(p);
		p.columnDtl_ship_valid_grp_nm.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_std_cont_fctr.addAllListener(p);
		p.columnDtl_std_cont_fctr.setListListener(p);
		p.columnDtl_cont_fctr_unit_cd.addAllListener(p);
		p.columnDtl_cont_fctr_unit_cd.setListListener(p);
		p.columnDtl_cont_fctr_unit_nm.addAllListener(p);
		p.columnDtl_cont_fctr_unit_nm.setListListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ_nm.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ_nm.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ_nm.addAllListener(p);
		p.columnDtl_sno1_mng_typ_nm.setListListener(p);
		p.columnDtl_slo_sno1_flg.addAllListener(p);
		p.columnDtl_rqmt_sno1_flg.addAllListener(p);
		p.columnDtl_sno1_num_typ.addAllListener(p);
		p.columnDtl_sno1_num_typ.setListListener(p);
		p.columnDtl_sno1_num_typ_nm.addAllListener(p);
		p.columnDtl_sno1_num_typ_nm.setListListener(p);
		p.columnDtl_sno1_ptn_cd.addAllListener(p);
		p.columnDtl_sno1_ptn_cd.setListListener(p);
		p.columnDtl_sno1_ptn_nm.addAllListener(p);
		p.columnDtl_sno1_ptn_nm.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ_nm.addAllListener(p);
		p.columnDtl_sno2_mng_typ_nm.setListListener(p);
		p.columnDtl_slo_sno2_flg.addAllListener(p);
		p.columnDtl_rqmt_sno2_flg.addAllListener(p);
		p.columnDtl_sno2_num_typ.addAllListener(p);
		p.columnDtl_sno2_num_typ.setListListener(p);
		p.columnDtl_sno2_num_typ_nm.addAllListener(p);
		p.columnDtl_sno2_num_typ_nm.setListListener(p);
		p.columnDtl_sno2_ptn_cd.addAllListener(p);
		p.columnDtl_sno2_ptn_cd.setListListener(p);
		p.columnDtl_sno2_ptn_nm.addAllListener(p);
		p.columnDtl_sno2_ptn_nm.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ_nm.addAllListener(p);
		p.columnDtl_sno3_mng_typ_nm.setListListener(p);
		p.columnDtl_slo_sno3_flg.addAllListener(p);
		p.columnDtl_rqmt_sno3_flg.addAllListener(p);
		p.columnDtl_sno3_num_typ.addAllListener(p);
		p.columnDtl_sno3_num_typ.setListListener(p);
		p.columnDtl_sno3_num_typ_nm.addAllListener(p);
		p.columnDtl_sno3_num_typ_nm.setListListener(p);
		p.columnDtl_sno3_ptn_cd.addAllListener(p);
		p.columnDtl_sno3_ptn_cd.setListListener(p);
		p.columnDtl_sno3_ptn_nm.addAllListener(p);
		p.columnDtl_sno3_ptn_nm.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ_nm.addAllListener(p);
		p.columnDtl_sno4_mng_typ_nm.setListListener(p);
		p.columnDtl_slo_sno4_flg.addAllListener(p);
		p.columnDtl_rqmt_sno4_flg.addAllListener(p);
		p.columnDtl_sno4_num_typ.addAllListener(p);
		p.columnDtl_sno4_num_typ.setListListener(p);
		p.columnDtl_sno4_num_typ_nm.addAllListener(p);
		p.columnDtl_sno4_num_typ_nm.setListListener(p);
		p.columnDtl_sno4_ptn_cd.addAllListener(p);
		p.columnDtl_sno4_ptn_cd.setListListener(p);
		p.columnDtl_sno4_ptn_nm.addAllListener(p);
		p.columnDtl_sno4_ptn_nm.setListListener(p);
		p.columnDtl_def_bom_ptn.addAllListener(p);
		p.columnDtl_def_bom_ptn.setListListener(p);
		p.columnDtl_mfg_inst_unit_typ.addAllListener(p);
		p.columnDtl_mfg_inst_unit_typ.setListListener(p);
		p.columnDtl_mfg_inst_unit_typ_nm.addAllListener(p);
		p.columnDtl_mfg_inst_unit_typ_nm.setListListener(p);
		p.columnDtl_mrp_proc_typ.addAllListener(p);
		p.columnDtl_mrp_proc_typ.setListListener(p);
		p.columnDtl_mrp_proc_typ_nm.addAllListener(p);
		p.columnDtl_mrp_proc_typ_nm.setListListener(p);
		p.columnDtl_rqmt_typ.addAllListener(p);
		p.columnDtl_rqmt_typ.setListListener(p);
		p.columnDtl_rqmt_typ_nm.addAllListener(p);
		p.columnDtl_rqmt_typ_nm.setListListener(p);
		p.columnDtl_prod_pln_typ.addAllListener(p);
		p.columnDtl_prod_pln_typ.setListListener(p);
		p.columnDtl_prod_pln_typ_nm.addAllListener(p);
		p.columnDtl_prod_pln_typ_nm.setListListener(p);
		p.columnDtl_dmnd_date_div_mons.addAllListener(p);
		p.columnDtl_dmnd_date_div_mons.setListListener(p);
		p.columnDtl_alloc_margin_days.addAllListener(p);
		p.columnDtl_alloc_margin_days.setListListener(p);
		p.columnDtl_mrp_alloc_margin_days.addAllListener(p);
		p.columnDtl_mrp_alloc_margin_days.setListListener(p);
		p.columnDtl_mrp_opn_xfr_days.addAllListener(p);
		p.columnDtl_mrp_opn_xfr_days.setListListener(p);
		p.columnDtl_inpt_itm_add_flg.addAllListener(p);
		p.columnDtl_inpt_itm_del_flg.addAllListener(p);
		p.columnDtl_sch_flg.addAllListener(p);
		p.columnDtl_cntry_org_cd.addAllListener(p);
		p.columnDtl_cntry_org_cd.setListListener(p);
		p.columnDtl_cntry_org_nm.addAllListener(p);
		p.columnDtl_cntry_org_nm.setListListener(p);
		p.columnDtl_comp_spec_typ.addAllListener(p);
		p.columnDtl_comp_spec_typ.setListListener(p);
		p.columnDtl_comp_spec_typ_nm.addAllListener(p);
		p.columnDtl_comp_spec_typ_nm.setListListener(p);
		p.columnDtl_comp_rev_at_slo_flg.addAllListener(p);
		p.columnDtl_comp_core_itm_flg.addAllListener(p);
		p.columnDtl_itm_spec_grp_cd.addAllListener(p);
		p.columnDtl_itm_spec_grp_cd.setListListener(p);
		p.columnDtl_itm_spec_grp_nm.addAllListener(p);
		p.columnDtl_itm_spec_grp_nm.setListListener(p);
		p.columnDtl_sls_upri_grp_cd.addAllListener(p);
		p.columnDtl_sls_upri_grp_cd.setListListener(p);
		p.columnDtl_sls_upri_grp_nm.addAllListener(p);
		p.columnDtl_sls_upri_grp_nm.setListListener(p);
		p.columnDtl_bill_crryovr_times.addAllListener(p);
		p.columnDtl_bill_crryovr_times.setListListener(p);
		p.columnDtl_pay_crryovr_times.addAllListener(p);
		p.columnDtl_pay_crryovr_times.setListListener(p);
		p.columnDtl_slo_proc_flg.addAllListener(p);
		p.columnDtl_slo_proc_typ.addAllListener(p);
		p.columnDtl_slo_proc_typ.setListListener(p);
		p.columnDtl_slo_proc_typ_nm.addAllListener(p);
		p.columnDtl_slo_proc_typ_nm.setListListener(p);
		p.columnDtl_ship_inst_typ.addAllListener(p);
		p.columnDtl_ship_inst_typ.setListListener(p);
		p.columnDtl_ship_inst_typ_nm.addAllListener(p);
		p.columnDtl_ship_inst_typ_nm.setListListener(p);
		p.columnDtl_itm_ship_grp_cd.addAllListener(p);
		p.columnDtl_itm_ship_grp_cd.setListListener(p);
		p.columnDtl_itm_ship_grp_nm.addAllListener(p);
		p.columnDtl_itm_ship_grp_nm.setListListener(p);
		p.columnDtl_arr_skip_flg.addAllListener(p);
		p.columnDtl_purc_dlv_slip_flg.addAllListener(p);
		p.columnDtl_ship_term_cd.addAllListener(p);
		p.columnDtl_ship_term_cd.setListListener(p);
		p.columnDtl_ship_term_nm.addAllListener(p);
		p.columnDtl_ship_term_nm.setListListener(p);
		p.columnDtl_exim_xpns_typ.addAllListener(p);
		p.columnDtl_exim_xpns_typ.setListListener(p);
		p.columnDtl_exim_xpns_typ_nm.addAllListener(p);
		p.columnDtl_exim_xpns_typ_nm.setListListener(p);
		p.columnDtl_stk_lst_flg.addAllListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_sls_upri_cng_flg.addAllListener(p);
		p.columnDtl_purc_upri_cng_flg.addAllListener(p);
		p.columnDtl_prov_upri_cng_flg.addAllListener(p);
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ext_sys_no_itm.addAllListener(p);
		p.columnDtl_ext_sys_no_itm.setListListener(p);
		p.columnDtl_chng_no.addAllListener(p);
		p.columnDtl_chng_no.setListListener(p);
		p.columnDtl_calc_ptn_cd.addAllListener(p);
		p.columnDtl_calc_ptn_cd.setListListener(p);
		p.columnDtl_calc_ptn_nm.addAllListener(p);
		p.columnDtl_calc_ptn_nm.setListListener(p);
		p.columnDtl_itm_alc_grp.addAllListener(p);
		p.columnDtl_itm_alc_grp.setListListener(p);
		p.columnDtl_sls_flg.addAllListener(p);
		p.columnDtl_sls_input_flg.addAllListener(p);
		p.columnDtl_mfg_flg.addAllListener(p);
		p.columnDtl_mfg_input_flg.addAllListener(p);
		p.columnDtl_purc_flg.addAllListener(p);
		p.columnDtl_purc_input_flg.addAllListener(p);
		p.columnDtl_insp_flg.addAllListener(p);
		p.columnDtl_insp_input_flg.addAllListener(p);
		p.columnDtl_release_tm.addAllListener(p);
		p.columnDtl_release_tm.setListListener(p);
		p.columnDtl_release_usr_cd.addAllListener(p);
		p.columnDtl_release_usr_cd.setListListener(p);
		p.columnDtl_release_usr_nm.addAllListener(p);
		p.columnDtl_release_usr_nm.setListListener(p);
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
	protected static void mcInitDtlBtn(MABCP_ItmLst p) {
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
		p.DtlBtn_open_MABCP0870.addAllListener(p);
		p.DtlBtn_open_MABCP0870.setAPMethodName("doDtlBtn_open_MABCP0870");
		p.DtlBtn_open_MABCP0840.addAllListener(p);
		p.DtlBtn_open_MABCP0840.setAPMethodName("doDtlBtn_open_MABCP0840");
		p.DtlBtn_open_MABCP0400.addAllListener(p);
		p.DtlBtn_open_MABCP0400.setAPMethodName("doDtlBtn_open_MABCP0400");
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
		p.DtlBtn_upd_admin.addAllListener(p);
		p.DtlBtn_upd_admin.setAPMethodName("doDtlBtn_upd_admin");
		p.DtlBtn_upd_cmn.addAllListener(p);
		p.DtlBtn_upd_cmn.setAPMethodName("doDtlBtn_upd_cmn");
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[TargetSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TargetSrch(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_ItmLst p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_ItmLst p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_own_co_flg_off.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_own_co_flg_on.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_release_flg_off.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_release_flg_on.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_stk_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sundry_itm_flg_off.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, UPD, MCMode.ENABLE);
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
		p.Cnd_upd_only_com_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_ItmLst p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_ItmLst p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_release_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_sub1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sub2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sub3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_base_itm_alt_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dim_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wt_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_conts_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_conts_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_conts_qty.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_unit_dim.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_unit_wt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_hs_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_hs_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_jan_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_jan_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_jan_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itf_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gtin_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo1_c.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2_c.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3_c.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr_c.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no_c.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_co_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ac_itm_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gi_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prov_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_pckg_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pack_alloc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_no_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_no_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sublot_no_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_not_new_lot_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_lot_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_insp_bind_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_insp_bind_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_role_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mrkt_judg_upd_role_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lmt_ctl_categ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_lot_back_stop_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_valid_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_valid_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_std_cont_fctr.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_sno1_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno1_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno1_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno1_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_sno2_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno2_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno2_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno2_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_sno3_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno3_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno3_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno3_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_sno4_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno4_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno4_num_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_num_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno4_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_def_bom_ptn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_inst_unit_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_inst_unit_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mrp_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rqmt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prod_pln_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dmnd_date_div_mons.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alloc_margin_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mrp_alloc_margin_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mrp_opn_xfr_days.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_rqmt_rstr_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_inpt_itm_add_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_itm_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sch_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cntry_org_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_rev_at_slo_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_comp_core_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_upri_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_proc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_slo_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_inst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_ship_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_arr_skip_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_exim_xpns_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_prov_upri_cng_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_ref_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnDtl_ext_sys_no_itm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_chng_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_calc_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_calc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_std_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_itm_alc_grp.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_mfg_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_insp_input_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_DtlBtn(MABCP_ItmLst p){
		p.DtlBtn_open_MABCP0310.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0870.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0840.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0400.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_admin.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[TargetSrch]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TargetSrch(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_ItmLst p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_ItmLst p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_own_co_flg_off.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_own_co_flg_on.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_release_flg_off.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_release_flg_on.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_stk_mng_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_sundry_itm_flg_off.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, FIX, MCMode.ENABLE);
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
		p.Cnd_upd_only_com_flg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_ItmLst p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_ItmLst p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_sub1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_sub2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_sub3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wt_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wt_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_conts_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_conts_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_conts_qty.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_dim.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_hs_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_hs_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jan_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jan_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_jan_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itf_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gtin_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr_c.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no_c.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_co_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gi_alloc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pack_alloc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_new_lot_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_lot_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_bind_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_bind_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_categ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_lot_back_stop_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_valid_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_valid_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_cont_fctr.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_sno1_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno1_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_sno2_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno2_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_sno3_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno3_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_sno4_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno4_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_num_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_num_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_unit_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_unit_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dmnd_date_div_mons.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_margin_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrp_alloc_margin_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mrp_opn_xfr_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_rqmt_rstr_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_inpt_itm_add_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_itm_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sch_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_comp_rev_at_slo_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_comp_core_itm_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_arr_skip_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_term_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_term_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ver_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cng_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_ref_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_ext_sys_no_itm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_std_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_itm_alc_grp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABCP_ItmLst p){
		p.DtlBtn_open_MABCP0310.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0870.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0840.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0400.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_admin.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_ScreenOpe(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[TargetSrch]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_TargetSrch(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Mst(MABCP_ItmLst p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Top(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Fold(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_CndTab(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Cnd(MABCP_ItmLst p){
		p.Cnd_ope_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_own_co_flg_off.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_own_co_flg_on.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_release_flg_off.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_release_flg_on.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_stk_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_sundry_itm_flg_off.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo1_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_upd_only_com_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Tab1(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Tab2(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Ctrl(MABCP_ItmLst p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl(MABCP_ItmLst p){
		p.columnDtl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_release_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_itm_sub1.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_sub2.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_sub3.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_base_itm_alt_nm1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_base_itm_alt_nm4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_asset_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_unit_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_dim_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_wt_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_wt_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_wt.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_conts_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_conts_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_conts_qty.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_unit_dim.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_unit_wt.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_itm_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_itm_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm1.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm2.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm3.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm4.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm5.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm6.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm7.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm8.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm9.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm10.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_hs_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_hs_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_jan_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_jan_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_jan_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itf_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_gtin_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo1_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo2_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo3_c.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ins_usr_id_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr_c.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no_c.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_co_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_itm_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ac_itm_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_gi_alloc_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sls_tax_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_purc_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_prov_tax_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ship_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ship_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mfg_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_purc_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_pckg_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_pack_alloc_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_lot_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_lot_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_lot_no_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_lot_no_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sublot_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sublot_no_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sublot_no_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_not_new_lot_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_bp_lot_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_insp_bind_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_insp_bind_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_role_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_mrkt_judg_role_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mrkt_judg_upd_role_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_lmt_ctl_categ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ship_lot_back_stop_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ship_valid_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ship_valid_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_std_cont_fctr.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_unit_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_unit_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cont_fctr_rnd_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno1_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_slo_sno1_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno1_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno1_num_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno1_num_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno1_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno2_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_slo_sno2_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno2_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno2_num_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno2_num_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno2_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno3_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_slo_sno3_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno3_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno3_num_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno3_num_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno3_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno4_mng_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_slo_sno4_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rqmt_sno4_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno4_num_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sno4_num_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sno4_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_def_bom_ptn.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mfg_inst_unit_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mfg_inst_unit_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mrp_proc_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_rqmt_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_prod_pln_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_dmnd_date_div_mons.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_alloc_margin_days.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mrp_alloc_margin_days.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_mrp_opn_xfr_days.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Dtl_rqmt_rstr_qty_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_inpt_itm_add_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_inpt_itm_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sch_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_cntry_org_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_cntry_org_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_comp_rev_at_slo_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_comp_core_itm_flg.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_nm.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_upri_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_pay_crryovr_times.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_slo_proc_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_slo_proc_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_slo_proc_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ship_inst_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_itm_ship_grp_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_arr_skip_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ship_term_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ship_term_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_exim_xpns_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ver_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sls_upri_cng_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_purc_upri_cng_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_prov_upri_cng_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Dtl_ref_itm_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnDtl_ext_sys_no_itm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_chng_no.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_calc_ptn_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_calc_ptn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Dtl_std_qty_p_PPanel.putStatus(UPD_ADMIN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_itm_alc_grp.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sls_input_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_mfg_input_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_purc_input_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_insp_input_flg.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlBtn(MABCP_ItmLst p){
		p.DtlBtn_open_MABCP0310.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0870.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0840.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0400.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_upd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.DtlBtn_upd_admin.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[TargetSrch]ブロックのモードの設定
	 */
	protected static void statusInitREF_TargetSrch(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_ItmLst p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_ItmLst p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tar_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_own_co_flg_off.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_own_co_flg_on.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_release_flg_off.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_release_flg_on.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_stk_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_asset_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sundry_itm_flg_off.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sundry_itm_flg_on.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_th_image_flg.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_upd_only_com_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_ItmLst p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_ItmLst p){
		p.columnDtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_th_image_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_th_image.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_sub1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_sub2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_sub3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_itm_alt_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dim_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_conts_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_conts_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_conts_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_hs_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_hs_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jan_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jan_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jan_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itf_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gtin_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr_c.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no_c.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_co_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_itm_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gi_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wtax_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pckg_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pack_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_no_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_new_lot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_lot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_bind_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_bind_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrkt_judg_upd_role_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lmt_ctl_categ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_lot_back_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_valid_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_valid_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_cont_fctr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cont_fctr_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_sno1_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno1_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_sno2_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno2_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_sno3_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno3_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_sno4_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_sno4_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_num_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_num_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_unit_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_unit_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrp_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqmt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prod_pln_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dmnd_date_div_mons.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_margin_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrp_alloc_margin_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mrp_opn_xfr_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rqmt_rstr_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_inpt_itm_add_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_itm_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sch_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cntry_org_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_comp_spec_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_spec_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_rev_at_slo_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_comp_core_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sls_upri_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_crryovr_times.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_ship_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_arr_skip_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_dlv_slip_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_exim_xpns_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_lst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cng_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ref_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_ext_sys_no_itm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_std_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_itm_alc_grp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_release_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABCP_ItmLst p){
		p.DtlBtn_open_MABCP0310.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1120.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1100.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0870.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0840.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABCP0400.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_admin.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_upd_cmn.putMode(p, REF, MCMode.INVISIBLE);

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
		MABCP_ItmLst_MC.setTableConfigDtl((MABCP_ItmLst)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ItmLst p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0390.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_release_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.release_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_flg);
		p.columnDtl_th_image_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.th_image_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_th_image_flg);
		p.columnDtl_th_image.setMeta(mcframe.clientMABC.MABCP0390.DtlR.th_image_META);
		p.DtlTable.addColumnConfig(p.columnDtl_th_image);
		p.columnDtl_itm_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_cd);
		p.columnDtl_itm_sub1.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_sub1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub1);
		p.columnDtl_itm_sub2.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_sub2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub2);
		p.columnDtl_itm_sub3.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_sub3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub3);
		p.columnDtl_itm_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_nm);
		p.columnDtl_base_itm_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.base_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_nm);
		p.columnDtl_base_itm_alt_nm1.setMeta(mcframe.clientMABC.MABCP0390.DtlR.base_itm_alt_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_alt_nm1);
		p.columnDtl_base_itm_alt_nm2.setMeta(mcframe.clientMABC.MABCP0390.DtlR.base_itm_alt_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_alt_nm2);
		p.columnDtl_base_itm_alt_nm3.setMeta(mcframe.clientMABC.MABCP0390.DtlR.base_itm_alt_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_alt_nm3);
		p.columnDtl_base_itm_alt_nm4.setMeta(mcframe.clientMABC.MABCP0390.DtlR.base_itm_alt_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_alt_nm4);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.stk_mng_typ_META);
		p.columnDtl_stk_mng_typ.addLinkBeans(p.columnDtl_stk_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_stk_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.stk_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ_nm);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.asset_mng_typ_META);
		p.columnDtl_asset_mng_typ.addLinkBeans(p.columnDtl_asset_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_asset_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.asset_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ_nm);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.unit_cd_META);
		p.columnDtl_unit_cd.addLinkBeans(p.columnDtl_unit_nm,p.columnDtl_dec_place,p.columnDtl_rnd_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_nm);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.columnDtl_rnd_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rnd_typ_META);
		p.columnDtl_rnd_typ.addLinkBeans(p.columnDtl_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rnd_typ);
		p.columnDtl_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rnd_typ_nm);
		p.columnDtl_dim_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dim_unit_cd_META);
		p.columnDtl_dim_unit_cd.addLinkBeans(p.columnDtl_dim_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dim_unit_cd);
		p.columnDtl_dim_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dim_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dim_unit_nm);
		p.columnDtl_dim.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dim);
		p.columnDtl_wt_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.wt_unit_cd_META);
		p.columnDtl_wt_unit_cd.addLinkBeans(p.columnDtl_wt_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wt_unit_cd);
		p.columnDtl_wt_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.wt_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wt_unit_nm);
		p.columnDtl_wt.setMeta(mcframe.clientMABC.MABCP0390.DtlR.wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wt);
		p.columnDtl_conts_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.conts_unit_cd_META);
		p.columnDtl_conts_unit_cd.addLinkBeans(p.columnDtl_conts_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_conts_unit_cd);
		p.columnDtl_conts_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.conts_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_conts_unit_nm);
		p.columnDtl_conts_qty.setMeta(mcframe.clientMABC.MABCP0390.DtlR.conts_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_conts_qty);
		p.columnDtl_unit_dim.setMeta(mcframe.clientMABC.MABCP0390.DtlR.unit_dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_dim);
		p.columnDtl_unit_wt.setMeta(mcframe.clientMABC.MABCP0390.DtlR.unit_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_wt);
		p.columnDtl_sls_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_itm_grp_cd_META);
		p.columnDtl_sls_itm_grp_cd.addLinkBeans(p.columnDtl_sls_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_cd);
		p.columnDtl_sls_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_itm_grp_nm);
		p.columnDtl_itm_grp_cd1.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd1_META);
		p.columnDtl_itm_grp_cd1.addLinkBeans(p.columnDtl_itm_grp_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd1);
		p.columnDtl_itm_grp_nm1.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm1);
		p.columnDtl_itm_grp_cd2.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd2_META);
		p.columnDtl_itm_grp_cd2.addLinkBeans(p.columnDtl_itm_grp_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd2);
		p.columnDtl_itm_grp_nm2.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm2);
		p.columnDtl_itm_grp_cd3.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd3_META);
		p.columnDtl_itm_grp_cd3.addLinkBeans(p.columnDtl_itm_grp_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd3);
		p.columnDtl_itm_grp_nm3.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm3);
		p.columnDtl_itm_grp_cd4.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd4_META);
		p.columnDtl_itm_grp_cd4.addLinkBeans(p.columnDtl_itm_grp_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd4);
		p.columnDtl_itm_grp_nm4.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm4);
		p.columnDtl_itm_grp_cd5.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd5_META);
		p.columnDtl_itm_grp_cd5.addLinkBeans(p.columnDtl_itm_grp_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd5);
		p.columnDtl_itm_grp_nm5.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm5);
		p.columnDtl_itm_grp_cd6.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd6_META);
		p.columnDtl_itm_grp_cd6.addLinkBeans(p.columnDtl_itm_grp_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd6);
		p.columnDtl_itm_grp_nm6.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm6);
		p.columnDtl_itm_grp_cd7.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd7_META);
		p.columnDtl_itm_grp_cd7.addLinkBeans(p.columnDtl_itm_grp_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd7);
		p.columnDtl_itm_grp_nm7.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm7);
		p.columnDtl_itm_grp_cd8.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd8_META);
		p.columnDtl_itm_grp_cd8.addLinkBeans(p.columnDtl_itm_grp_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd8);
		p.columnDtl_itm_grp_nm8.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm8);
		p.columnDtl_itm_grp_cd9.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd9_META);
		p.columnDtl_itm_grp_cd9.addLinkBeans(p.columnDtl_itm_grp_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd9);
		p.columnDtl_itm_grp_nm9.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm9);
		p.columnDtl_itm_grp_cd10.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_cd10_META);
		p.columnDtl_itm_grp_cd10.addLinkBeans(p.columnDtl_itm_grp_nm10);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd10);
		p.columnDtl_itm_grp_nm10.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_grp_nm10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm10);
		p.columnDtl_hs_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.hs_cd_META);
		p.columnDtl_hs_cd.addLinkBeans(p.columnDtl_hs_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_hs_cd);
		p.columnDtl_hs_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.hs_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_hs_nm);
		p.columnDtl_jan_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.jan_typ_META);
		p.columnDtl_jan_typ.addLinkBeans(p.columnDtl_jan_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_jan_typ);
		p.columnDtl_jan_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.jan_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jan_typ_nm);
		p.columnDtl_jan_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.jan_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jan_cd);
		p.columnDtl_itf_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itf_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itf_cd);
		p.columnDtl_gtin_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.gtin_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gtin_cd);
		p.columnDtl_memo1_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo1_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1_c);
		p.columnDtl_memo2_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo2_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2_c);
		p.columnDtl_memo3_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo3_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3_c);
		p.columnDtl_ins_usr_id_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_usr_id_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id_c);
		p.columnDtl_ins_usr_nm_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_usr_nm_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm_c);
		p.columnDtl_ins_ts_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_ts_c_META);
		p.columnDtl_ins_ts_c.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts_c);
		p.columnDtl_ins_func_id_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_func_id_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id_c);
		p.columnDtl_ins_func_nm_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_func_nm_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm_c);
		p.columnDtl_upd_cntr_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_cntr_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr_c);
		p.columnDtl_upd_usr_id_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_usr_id_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id_c);
		p.columnDtl_upd_usr_nm_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_usr_nm_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm_c);
		p.columnDtl_upd_ts_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_ts_c_META);
		p.columnDtl_upd_ts_c.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts_c);
		p.columnDtl_upd_func_id_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_func_id_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id_c);
		p.columnDtl_upd_func_nm_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_func_nm_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm_c);
		p.columnDtl_upd_srv_req_no_c.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_srv_req_no_c_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no_c);
		p.columnDtl_co_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.co_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_co_cd);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_typ_META);
		p.columnDtl_itm_typ.addLinkBeans(p.columnDtl_itm_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_typ_d_cd_META);
		p.columnDtl_itm_typ_d_cd.addLinkBeans(p.columnDtl_itm_typ_d_nm,p.columnDtl_sls_flg,p.columnDtl_mfg_flg,p.columnDtl_purc_flg,p.columnDtl_insp_flg,p.columnDtl_itm_jnl_cd,p.columnDtl_ac_itm_grp_cd,p.columnDtl_minus_stk_flg,p.columnDtl_not_new_lot_flg,p.columnDtl_gi_alloc_flg,p.columnDtl_pack_alloc_flg,p.columnDtl_bp_lot_flg,p.columnDtl_comp_spec_typ,p.columnDtl_comp_rev_at_slo_flg,p.columnDtl_comp_core_itm_flg,p.columnDtl_skip_chk_ship_flg,p.columnDtl_itm_spec_grp_cd,p.columnDtl_sls_upri_grp_cd,p.columnDtl_slo_proc_flg,p.columnDtl_slo_proc_typ,p.columnDtl_ship_inst_typ,p.columnDtl_ship_lot_back_stop_flg,p.columnDtl_itm_ship_grp_cd,p.columnDtl_ship_valid_grp_cd,p.columnDtl_arr_skip_flg,p.columnDtl_ship_term_cd,p.columnDtl_stk_lst_flg,p.columnDtl_mfg_inst_unit_typ,p.columnDtl_sls_upri_cng_flg,p.columnDtl_purc_upri_cng_flg,p.columnDtl_prov_upri_cng_flg,p.columnDtl_mrp_proc_typ,p.columnDtl_alloc_margin_days,p.columnDtl_mrp_alloc_margin_days,p.columnDtl_inpt_itm_add_flg,p.columnDtl_inpt_itm_del_flg,p.columnDtl_sch_flg,p.columnDtl_lot_mng_typ,p.columnDtl_lot_no_typ,p.columnDtl_lot_no_ptn_cd,p.columnDtl_sublot_mng_typ,p.columnDtl_sublot_no_typ,p.columnDtl_sublot_no_ptn_cd,p.columnDtl_sno1_mng_typ,p.columnDtl_slo_sno1_flg,p.columnDtl_rqmt_sno1_flg,p.columnDtl_sno1_num_typ,p.columnDtl_sno1_ptn_cd,p.columnDtl_sno2_mng_typ,p.columnDtl_slo_sno2_flg,p.columnDtl_rqmt_sno2_flg,p.columnDtl_sno2_num_typ,p.columnDtl_sno2_ptn_cd,p.columnDtl_sno3_mng_typ,p.columnDtl_slo_sno3_flg,p.columnDtl_rqmt_sno3_flg,p.columnDtl_sno3_num_typ,p.columnDtl_sno3_ptn_cd,p.columnDtl_sno4_mng_typ,p.columnDtl_slo_sno4_flg,p.columnDtl_rqmt_sno4_flg,p.columnDtl_sno4_num_typ,p.columnDtl_sno4_ptn_cd,p.columnDtl_lmt_ctl_flg,p.columnDtl_lmt_ctl_categ,p.columnDtl_ver_flg,p.columnDtl_insp_bind_typ,p.columnDtl_mrkt_judg_flg,p.columnDtl_calc_ptn_cd,p.columnDtl_rqmt_typ,p.columnDtl_prod_pln_typ,p.columnDtl_dmnd_date_div_mons,p.columnDtl_mrkt_judg_role_cd,p.columnDtl_mrkt_judg_upd_role_cd,p.columnDtl_mrp_opn_xfr_days);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_jnl_cd_META);
		p.columnDtl_itm_jnl_cd.addLinkBeans(p.columnDtl_itm_jnl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_ac_itm_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ac_itm_grp_cd_META);
		p.columnDtl_ac_itm_grp_cd.addLinkBeans(p.columnDtl_ac_itm_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_itm_grp_cd);
		p.columnDtl_ac_itm_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ac_itm_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_itm_grp_nm);
		p.columnDtl_minus_stk_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.minus_stk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_stk_flg);
		p.columnDtl_gi_alloc_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.gi_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gi_alloc_flg);
		p.columnDtl_sls_tax_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_tax_cd_META);
		p.columnDtl_sls_tax_cd.addLinkBeans(p.columnDtl_sls_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_tax_cd);
		p.columnDtl_sls_tax_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_tax_nm);
		p.columnDtl_purc_tax_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_tax_cd_META);
		p.columnDtl_purc_tax_cd.addLinkBeans(p.columnDtl_purc_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_cd);
		p.columnDtl_purc_tax_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_nm);
		p.columnDtl_prov_tax_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.prov_tax_cd_META);
		p.columnDtl_prov_tax_cd.addLinkBeans(p.columnDtl_prov_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_tax_cd);
		p.columnDtl_prov_tax_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.prov_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_tax_nm);
		p.columnDtl_wtax_rate.setMeta(mcframe.clientMABC.MABCP0390.DtlR.wtax_rate_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wtax_rate);
		p.columnDtl_ship_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_unit_cd_META);
		p.columnDtl_ship_unit_cd.addLinkBeans(p.columnDtl_ship_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_unit_cd);
		p.columnDtl_ship_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_unit_nm);
		p.columnDtl_mfg_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_unit_cd_META);
		p.columnDtl_mfg_unit_cd.addLinkBeans(p.columnDtl_mfg_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_unit_cd);
		p.columnDtl_mfg_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_unit_nm);
		p.columnDtl_purc_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_unit_cd_META);
		p.columnDtl_purc_unit_cd.addLinkBeans(p.columnDtl_purc_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_unit_cd);
		p.columnDtl_purc_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_unit_nm);
		p.columnDtl_pckg_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.pckg_unit_cd_META);
		p.columnDtl_pckg_unit_cd.addLinkBeans(p.columnDtl_pckg_unit_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_cd);
		p.columnDtl_pckg_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.pckg_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pckg_unit_nm);
		p.columnDtl_pack_alloc_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.pack_alloc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_alloc_flg);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_mng_typ_META);
		p.columnDtl_lot_mng_typ.addLinkBeans(p.columnDtl_lot_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_lot_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ_nm);
		p.columnDtl_lot_no_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_no_typ_META);
		p.columnDtl_lot_no_typ.addLinkBeans(p.columnDtl_lot_no_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_typ);
		p.columnDtl_lot_no_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_typ_nm);
		p.columnDtl_lot_no_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_no_ptn_cd_META);
		p.columnDtl_lot_no_ptn_cd.addLinkBeans(p.columnDtl_lot_no_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_ptn_cd);
		p.columnDtl_lot_no_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lot_no_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_ptn_nm);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_mng_typ_META);
		p.columnDtl_sublot_mng_typ.addLinkBeans(p.columnDtl_sublot_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sublot_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ_nm);
		p.columnDtl_sublot_no_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_no_typ_META);
		p.columnDtl_sublot_no_typ.addLinkBeans(p.columnDtl_sublot_no_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_typ);
		p.columnDtl_sublot_no_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_no_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_typ_nm);
		p.columnDtl_sublot_no_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_no_ptn_cd_META);
		p.columnDtl_sublot_no_ptn_cd.addLinkBeans(p.columnDtl_sublot_no_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_ptn_cd);
		p.columnDtl_sublot_no_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sublot_no_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_ptn_nm);
		p.columnDtl_not_new_lot_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.not_new_lot_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_new_lot_flg);
		p.columnDtl_bp_lot_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.bp_lot_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_lot_flg);
		p.columnDtl_insp_bind_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.insp_bind_typ_META);
		p.columnDtl_insp_bind_typ.addLinkBeans(p.columnDtl_insp_bind_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_bind_typ);
		p.columnDtl_insp_bind_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.insp_bind_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_bind_typ_nm);
		p.columnDtl_skip_chk_ship_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.skip_chk_ship_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_skip_chk_ship_flg);
		p.columnDtl_mrkt_judg_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrkt_judg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrkt_judg_flg);
		p.columnDtl_mrkt_judg_role_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrkt_judg_role_cd_META);
		p.columnDtl_mrkt_judg_role_cd.addLinkBeans(p.columnDtl_mrkt_judg_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mrkt_judg_role_cd);
		p.columnDtl_mrkt_judg_role_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrkt_judg_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrkt_judg_role_nm);
		p.columnDtl_mrkt_judg_upd_role_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrkt_judg_upd_role_cd_META);
		p.columnDtl_mrkt_judg_upd_role_cd.addLinkBeans(p.columnDtl_mrkt_judg_upd_role_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mrkt_judg_upd_role_cd);
		p.columnDtl_mrkt_judg_upd_role_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrkt_judg_upd_role_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrkt_judg_upd_role_nm);
		p.columnDtl_lmt_ctl_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lmt_ctl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lmt_ctl_flg);
		p.columnDtl_lmt_ctl_categ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.lmt_ctl_categ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lmt_ctl_categ);
		p.columnDtl_ship_lot_back_stop_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_lot_back_stop_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_lot_back_stop_flg);
		p.columnDtl_ship_valid_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_valid_grp_cd_META);
		p.columnDtl_ship_valid_grp_cd.addLinkBeans(p.columnDtl_ship_valid_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_valid_grp_cd);
		p.columnDtl_ship_valid_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_valid_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_valid_grp_nm);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.columnDtl_std_cont_fctr.setMeta(mcframe.clientMABC.MABCP0390.DtlR.std_cont_fctr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_cont_fctr);
		p.columnDtl_cont_fctr_unit_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_unit_cd_META);
		p.columnDtl_cont_fctr_unit_cd.addLinkBeans(p.columnDtl_cont_fctr_unit_nm,p.columnDtl_cont_fctr_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_unit_cd);
		p.columnDtl_cont_fctr_unit_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_unit_nm);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_rnd_typ_META);
		p.columnDtl_cont_fctr_rnd_typ.addLinkBeans(p.columnDtl_cont_fctr_rnd_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.columnDtl_cont_fctr_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cont_fctr_rnd_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ_nm);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_mng_typ_META);
		p.columnDtl_sno1_mng_typ.addLinkBeans(p.columnDtl_sno1_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno1_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ_nm);
		p.columnDtl_slo_sno1_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno1_flg);
		p.columnDtl_rqmt_sno1_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_sno1_flg);
		p.columnDtl_sno1_num_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_num_typ_META);
		p.columnDtl_sno1_num_typ.addLinkBeans(p.columnDtl_sno1_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_num_typ);
		p.columnDtl_sno1_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_num_typ_nm);
		p.columnDtl_sno1_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_ptn_cd_META);
		p.columnDtl_sno1_ptn_cd.addLinkBeans(p.columnDtl_sno1_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_ptn_cd);
		p.columnDtl_sno1_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno1_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_ptn_nm);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_mng_typ_META);
		p.columnDtl_sno2_mng_typ.addLinkBeans(p.columnDtl_sno2_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno2_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ_nm);
		p.columnDtl_slo_sno2_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno2_flg);
		p.columnDtl_rqmt_sno2_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_sno2_flg);
		p.columnDtl_sno2_num_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_num_typ_META);
		p.columnDtl_sno2_num_typ.addLinkBeans(p.columnDtl_sno2_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_num_typ);
		p.columnDtl_sno2_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_num_typ_nm);
		p.columnDtl_sno2_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_ptn_cd_META);
		p.columnDtl_sno2_ptn_cd.addLinkBeans(p.columnDtl_sno2_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_ptn_cd);
		p.columnDtl_sno2_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno2_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_ptn_nm);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_mng_typ_META);
		p.columnDtl_sno3_mng_typ.addLinkBeans(p.columnDtl_sno3_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno3_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ_nm);
		p.columnDtl_slo_sno3_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno3_flg);
		p.columnDtl_rqmt_sno3_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_sno3_flg);
		p.columnDtl_sno3_num_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_num_typ_META);
		p.columnDtl_sno3_num_typ.addLinkBeans(p.columnDtl_sno3_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_num_typ);
		p.columnDtl_sno3_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_num_typ_nm);
		p.columnDtl_sno3_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_ptn_cd_META);
		p.columnDtl_sno3_ptn_cd.addLinkBeans(p.columnDtl_sno3_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_ptn_cd);
		p.columnDtl_sno3_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno3_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_ptn_nm);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_mng_typ_META);
		p.columnDtl_sno4_mng_typ.addLinkBeans(p.columnDtl_sno4_mng_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_sno4_mng_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_mng_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ_nm);
		p.columnDtl_slo_sno4_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_sno4_flg);
		p.columnDtl_rqmt_sno4_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_sno4_flg);
		p.columnDtl_sno4_num_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_num_typ_META);
		p.columnDtl_sno4_num_typ.addLinkBeans(p.columnDtl_sno4_num_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_num_typ);
		p.columnDtl_sno4_num_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_num_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_num_typ_nm);
		p.columnDtl_sno4_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_ptn_cd_META);
		p.columnDtl_sno4_ptn_cd.addLinkBeans(p.columnDtl_sno4_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_ptn_cd);
		p.columnDtl_sno4_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sno4_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_ptn_nm);
		p.columnDtl_def_bom_ptn.setMeta(mcframe.clientMABC.MABCP0390.DtlR.def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_bom_ptn);
		p.columnDtl_mfg_inst_unit_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_inst_unit_typ_META);
		p.columnDtl_mfg_inst_unit_typ.addLinkBeans(p.columnDtl_mfg_inst_unit_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_unit_typ);
		p.columnDtl_mfg_inst_unit_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_inst_unit_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_unit_typ_nm);
		p.columnDtl_mrp_proc_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrp_proc_typ_META);
		p.columnDtl_mrp_proc_typ.addLinkBeans(p.columnDtl_mrp_proc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mrp_proc_typ);
		p.columnDtl_mrp_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrp_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrp_proc_typ_nm);
		p.columnDtl_rqmt_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_typ_META);
		p.columnDtl_rqmt_typ.addLinkBeans(p.columnDtl_rqmt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_typ);
		p.columnDtl_rqmt_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.rqmt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqmt_typ_nm);
		p.columnDtl_prod_pln_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.prod_pln_typ_META);
		p.columnDtl_prod_pln_typ.addLinkBeans(p.columnDtl_prod_pln_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prod_pln_typ);
		p.columnDtl_prod_pln_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.prod_pln_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prod_pln_typ_nm);
		p.columnDtl_dmnd_date_div_mons.setMeta(mcframe.clientMABC.MABCP0390.DtlR.dmnd_date_div_mons_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dmnd_date_div_mons);
		p.columnDtl_alloc_margin_days.setMeta(mcframe.clientMABC.MABCP0390.DtlR.alloc_margin_days_META);
		p.columnDtl_alloc_margin_days.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_margin_days);
		p.columnDtl_mrp_alloc_margin_days.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrp_alloc_margin_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrp_alloc_margin_days);
		p.columnDtl_mrp_opn_xfr_days.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mrp_opn_xfr_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mrp_opn_xfr_days);
		p.DtlTable.addTable(p.Dtl_rqmt_rstr_qty_p_PPanel.QtyTable);
		p.columnDtl_inpt_itm_add_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.inpt_itm_add_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_itm_add_flg);
		p.columnDtl_inpt_itm_del_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.inpt_itm_del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_itm_del_flg);
		p.columnDtl_sch_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sch_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sch_flg);
		p.columnDtl_cntry_org_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cntry_org_cd_META);
		p.columnDtl_cntry_org_cd.addLinkBeans(p.columnDtl_cntry_org_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_cd);
		p.columnDtl_cntry_org_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.cntry_org_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cntry_org_nm);
		p.columnDtl_comp_spec_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.comp_spec_typ_META);
		p.columnDtl_comp_spec_typ.addLinkBeans(p.columnDtl_comp_spec_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ);
		p.columnDtl_comp_spec_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.comp_spec_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_spec_typ_nm);
		p.columnDtl_comp_rev_at_slo_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.comp_rev_at_slo_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_rev_at_slo_flg);
		p.columnDtl_comp_core_itm_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.comp_core_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_comp_core_itm_flg);
		p.columnDtl_itm_spec_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_spec_grp_cd_META);
		p.columnDtl_itm_spec_grp_cd.addLinkBeans(p.columnDtl_itm_spec_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_grp_cd);
		p.columnDtl_itm_spec_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_spec_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_grp_nm);
		p.columnDtl_sls_upri_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_upri_grp_cd_META);
		p.columnDtl_sls_upri_grp_cd.addLinkBeans(p.columnDtl_sls_upri_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_grp_cd);
		p.columnDtl_sls_upri_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_upri_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_grp_nm);
		p.columnDtl_bill_crryovr_times.setMeta(mcframe.clientMABC.MABCP0390.DtlR.bill_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_crryovr_times);
		p.columnDtl_pay_crryovr_times.setMeta(mcframe.clientMABC.MABCP0390.DtlR.pay_crryovr_times_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_crryovr_times);
		p.columnDtl_slo_proc_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_proc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_proc_flg);
		p.columnDtl_slo_proc_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_proc_typ_META);
		p.columnDtl_slo_proc_typ.addLinkBeans(p.columnDtl_slo_proc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_proc_typ);
		p.columnDtl_slo_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.slo_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_proc_typ_nm);
		p.columnDtl_ship_inst_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_inst_typ_META);
		p.columnDtl_ship_inst_typ.addLinkBeans(p.columnDtl_ship_inst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_typ);
		p.columnDtl_ship_inst_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_inst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_typ_nm);
		p.columnDtl_itm_ship_grp_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_ship_grp_cd_META);
		p.columnDtl_itm_ship_grp_cd.addLinkBeans(p.columnDtl_itm_ship_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_ship_grp_cd);
		p.columnDtl_itm_ship_grp_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_ship_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_ship_grp_nm);
		p.columnDtl_arr_skip_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.arr_skip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_skip_flg);
		p.columnDtl_purc_dlv_slip_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_dlv_slip_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_dlv_slip_flg);
		p.columnDtl_ship_term_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_term_cd_META);
		p.columnDtl_ship_term_cd.addLinkBeans(p.columnDtl_ship_term_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_term_cd);
		p.columnDtl_ship_term_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ship_term_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_term_nm);
		p.columnDtl_exim_xpns_typ.setMeta(mcframe.clientMABC.MABCP0390.DtlR.exim_xpns_typ_META);
		p.columnDtl_exim_xpns_typ.addLinkBeans(p.columnDtl_exim_xpns_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_exim_xpns_typ);
		p.columnDtl_exim_xpns_typ_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.exim_xpns_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_exim_xpns_typ_nm);
		p.columnDtl_stk_lst_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.stk_lst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_lst_flg);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_sls_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_cng_flg);
		p.columnDtl_purc_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_cng_flg);
		p.columnDtl_prov_upri_cng_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.prov_upri_cng_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_upri_cng_flg);
		p.DtlTable.addTable(p.Dtl_ref_itm_p_PPanel.ItmTable);
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_ref_itm_nm, p.columnDtl_ref_itm_sub1, p.columnDtl_ref_itm_sub2, p.columnDtl_ref_itm_sub3);
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_ref_itm_nm, p.columnDtl_ref_itm_sub2, p.columnDtl_ref_itm_sub3);
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_ref_itm_nm, p.columnDtl_ref_itm_sub3);
		p.Dtl_ref_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_ref_itm_nm);
		p.columnDtl_ext_sys_no_itm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ext_sys_no_itm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_itm);
		p.columnDtl_chng_no.setMeta(mcframe.clientMABC.MABCP0390.DtlR.chng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chng_no);
		p.columnDtl_calc_ptn_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.calc_ptn_cd_META);
		p.columnDtl_calc_ptn_cd.addLinkBeans(p.columnDtl_calc_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ptn_cd);
		p.columnDtl_calc_ptn_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.calc_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ptn_nm);
		p.DtlTable.addTable(p.Dtl_std_qty_p_PPanel.QtyTable);
		p.columnDtl_itm_alc_grp.setMeta(mcframe.clientMABC.MABCP0390.DtlR.itm_alc_grp_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alc_grp);
		p.columnDtl_sls_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_flg);
		p.columnDtl_sls_input_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.sls_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_input_flg);
		p.columnDtl_mfg_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_flg);
		p.columnDtl_mfg_input_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.mfg_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_input_flg);
		p.columnDtl_purc_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_flg);
		p.columnDtl_purc_input_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.purc_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_input_flg);
		p.columnDtl_insp_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.insp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_flg);
		p.columnDtl_insp_input_flg.setMeta(mcframe.clientMABC.MABCP0390.DtlR.insp_input_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_input_flg);
		p.columnDtl_release_tm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.release_tm_META);
		p.columnDtl_release_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_release_tm);
		p.columnDtl_release_usr_cd.setMeta(mcframe.clientMABC.MABCP0390.DtlR.release_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_usr_cd);
		p.columnDtl_release_usr_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.release_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_release_usr_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0390.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0390.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0390.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0390.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0390.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
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
		Cnd_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_mng_typ.getListConfig().setPutter(getCnd_stk_mng_typ_ListPutter());
		Cnd_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_asset_mng_typ.getListConfig().setPutter(getCnd_asset_mng_typ_ListPutter());
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
		columnDtl_stk_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_mng_typ.getListConfig().setPutter(getDtl_stk_mng_typ_ListPutter());
		columnDtl_asset_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asset_mng_typ.getListConfig().setPutter(getDtl_asset_mng_typ_ListPutter());
		columnDtl_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_unit_cd.getListConfig().setPutter(getDtl_unit_cd_ListPutter());
		columnDtl_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rnd_typ.getListConfig().setPutter(getDtl_rnd_typ_ListPutter());
		columnDtl_dim_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dim_unit_cd.getListConfig().setPutter(getDtl_dim_unit_cd_ListPutter());
		columnDtl_wt_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wt_unit_cd.getListConfig().setPutter(getDtl_wt_unit_cd_ListPutter());
		columnDtl_conts_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_conts_unit_cd.getListConfig().setPutter(getDtl_conts_unit_cd_ListPutter());
		columnDtl_sls_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_itm_grp_cd.getListConfig().setPutter(getDtl_sls_itm_grp_cd_ListPutter());
		columnDtl_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd1.getListConfig().setPutter(getDtl_itm_grp_cd1_ListPutter());
		columnDtl_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd2.getListConfig().setPutter(getDtl_itm_grp_cd2_ListPutter());
		columnDtl_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd3.getListConfig().setPutter(getDtl_itm_grp_cd3_ListPutter());
		columnDtl_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd4.getListConfig().setPutter(getDtl_itm_grp_cd4_ListPutter());
		columnDtl_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd5.getListConfig().setPutter(getDtl_itm_grp_cd5_ListPutter());
		columnDtl_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd6.getListConfig().setPutter(getDtl_itm_grp_cd6_ListPutter());
		columnDtl_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd7.getListConfig().setPutter(getDtl_itm_grp_cd7_ListPutter());
		columnDtl_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd8.getListConfig().setPutter(getDtl_itm_grp_cd8_ListPutter());
		columnDtl_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd9.getListConfig().setPutter(getDtl_itm_grp_cd9_ListPutter());
		columnDtl_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd10.getListConfig().setPutter(getDtl_itm_grp_cd10_ListPutter());
		columnDtl_hs_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_hs_cd.getListConfig().setPutter(getDtl_hs_cd_ListPutter());
		columnDtl_jan_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_jan_typ.getListConfig().setPutter(getDtl_jan_typ_ListPutter());
		columnDtl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ.getListConfig().setPutter(getDtl_itm_typ_ListPutter());
		columnDtl_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ_d_cd.getListConfig().setPutter(getDtl_itm_typ_d_cd_ListPutter());
		columnDtl_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_jnl_cd.getListConfig().setPutter(getDtl_itm_jnl_cd_ListPutter());
		columnDtl_ac_itm_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_itm_grp_cd.getListConfig().setPutter(getDtl_ac_itm_grp_cd_ListPutter());
		columnDtl_sls_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_tax_cd.getListConfig().setPutter(getDtl_sls_tax_cd_ListPutter());
		columnDtl_purc_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_tax_cd.getListConfig().setPutter(getDtl_purc_tax_cd_ListPutter());
		columnDtl_prov_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prov_tax_cd.getListConfig().setPutter(getDtl_prov_tax_cd_ListPutter());
		columnDtl_ship_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_unit_cd.getListConfig().setPutter(getDtl_ship_unit_cd_ListPutter());
		columnDtl_mfg_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_unit_cd.getListConfig().setPutter(getDtl_mfg_unit_cd_ListPutter());
		columnDtl_purc_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_unit_cd.getListConfig().setPutter(getDtl_purc_unit_cd_ListPutter());
		columnDtl_pckg_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pckg_unit_cd.getListConfig().setPutter(getDtl_pckg_unit_cd_ListPutter());
		columnDtl_lot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_mng_typ.getListConfig().setPutter(getDtl_lot_mng_typ_ListPutter());
		columnDtl_lot_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_no_typ.getListConfig().setPutter(getDtl_lot_no_typ_ListPutter());
		columnDtl_lot_no_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_no_ptn_cd.getListConfig().setPutter(getDtl_lot_no_ptn_cd_ListPutter());
		columnDtl_sublot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_mng_typ.getListConfig().setPutter(getDtl_sublot_mng_typ_ListPutter());
		columnDtl_sublot_no_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_no_typ.getListConfig().setPutter(getDtl_sublot_no_typ_ListPutter());
		columnDtl_sublot_no_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_no_ptn_cd.getListConfig().setPutter(getDtl_sublot_no_ptn_cd_ListPutter());
		columnDtl_insp_bind_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_insp_bind_typ.getListConfig().setPutter(getDtl_insp_bind_typ_ListPutter());
		columnDtl_mrkt_judg_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mrkt_judg_role_cd.getListConfig().setPutter(getDtl_mrkt_judg_role_cd_ListPutter());
		columnDtl_mrkt_judg_upd_role_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mrkt_judg_upd_role_cd.getListConfig().setPutter(getDtl_mrkt_judg_upd_role_cd_ListPutter());
		columnDtl_ship_valid_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_valid_grp_cd.getListConfig().setPutter(getDtl_ship_valid_grp_cd_ListPutter());
		columnDtl_cont_fctr_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cont_fctr_unit_cd.getListConfig().setPutter(getDtl_cont_fctr_unit_cd_ListPutter());
		columnDtl_cont_fctr_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cont_fctr_rnd_typ.getListConfig().setPutter(getDtl_cont_fctr_rnd_typ_ListPutter());
		columnDtl_sno1_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_mng_typ.getListConfig().setPutter(getDtl_sno1_mng_typ_ListPutter());
		columnDtl_sno1_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_num_typ.getListConfig().setPutter(getDtl_sno1_num_typ_ListPutter());
		columnDtl_sno1_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_ptn_cd.getListConfig().setPutter(getDtl_sno1_ptn_cd_ListPutter());
		columnDtl_sno2_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_mng_typ.getListConfig().setPutter(getDtl_sno2_mng_typ_ListPutter());
		columnDtl_sno2_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_num_typ.getListConfig().setPutter(getDtl_sno2_num_typ_ListPutter());
		columnDtl_sno2_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_ptn_cd.getListConfig().setPutter(getDtl_sno2_ptn_cd_ListPutter());
		columnDtl_sno3_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_mng_typ.getListConfig().setPutter(getDtl_sno3_mng_typ_ListPutter());
		columnDtl_sno3_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_num_typ.getListConfig().setPutter(getDtl_sno3_num_typ_ListPutter());
		columnDtl_sno3_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_ptn_cd.getListConfig().setPutter(getDtl_sno3_ptn_cd_ListPutter());
		columnDtl_sno4_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_mng_typ.getListConfig().setPutter(getDtl_sno4_mng_typ_ListPutter());
		columnDtl_sno4_num_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_num_typ.getListConfig().setPutter(getDtl_sno4_num_typ_ListPutter());
		columnDtl_sno4_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_ptn_cd.getListConfig().setPutter(getDtl_sno4_ptn_cd_ListPutter());
		columnDtl_mfg_inst_unit_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mfg_inst_unit_typ.getListConfig().setPutter(getDtl_mfg_inst_unit_typ_ListPutter());
		columnDtl_mrp_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_mrp_proc_typ.getListConfig().setPutter(getDtl_mrp_proc_typ_ListPutter());
		columnDtl_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rqmt_typ.getListConfig().setPutter(getDtl_rqmt_typ_ListPutter());
		columnDtl_prod_pln_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prod_pln_typ.getListConfig().setPutter(getDtl_prod_pln_typ_ListPutter());
		columnDtl_cntry_org_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cntry_org_cd.getListConfig().setPutter(getDtl_cntry_org_cd_ListPutter());
		columnDtl_comp_spec_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_comp_spec_typ.getListConfig().setPutter(getDtl_comp_spec_typ_ListPutter());
		columnDtl_itm_spec_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_spec_grp_cd.getListConfig().setPutter(getDtl_itm_spec_grp_cd_ListPutter());
		columnDtl_sls_upri_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_upri_grp_cd.getListConfig().setPutter(getDtl_sls_upri_grp_cd_ListPutter());
		columnDtl_slo_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_slo_proc_typ.getListConfig().setPutter(getDtl_slo_proc_typ_ListPutter());
		columnDtl_ship_inst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_inst_typ.getListConfig().setPutter(getDtl_ship_inst_typ_ListPutter());
		columnDtl_itm_ship_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_ship_grp_cd.getListConfig().setPutter(getDtl_itm_ship_grp_cd_ListPutter());
		columnDtl_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_term_cd.getListConfig().setPutter(getDtl_ship_term_cd_ListPutter());
		columnDtl_exim_xpns_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_exim_xpns_typ.getListConfig().setPutter(getDtl_exim_xpns_typ_ListPutter());
		Dtl_ref_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_ref_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_calc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_calc_ptn_cd.getListConfig().setPutter(getDtl_calc_ptn_cd_ListPutter());
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
	 * この画面を[UPD_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ADMINStatus() {
		status = UPD_ADMIN;
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
		else if (UPD_ADMIN.equals(status)) {
			setUPD_ADMINStatus();
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
	 * [Cnd_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
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
	 * [Dtl_stk_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_asset_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asset_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AssetMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_dim_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dim_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_wt_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wt_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_conts_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_conts_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsItmGrpBtm");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_hs_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_hs_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Hs");
		return lp;
	}
	 
	/**
	 * [Dtl_jan_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_jan_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JanTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTypD");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_itm_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_itm_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcItmGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}
	 
	/**
	 * [Dtl_prov_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prov_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_mfg_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_pckg_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pckg_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_no_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SublotMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_no_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_no_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_no_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_no_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_insp_bind_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_insp_bind_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InspBindTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_mrkt_judg_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mrkt_judg_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_mrkt_judg_upd_role_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mrkt_judg_upd_role_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvRole");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_valid_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_valid_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipValid");
		return lp;
	}
	 
	/**
	 * [Dtl_cont_fctr_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cont_fctr_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Dtl_cont_fctr_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cont_fctr_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoMngTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_num_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_num_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoNoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.NumPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_mfg_inst_unit_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_inst_unit_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MfgInstUnitTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_mrp_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mrp_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MrpProcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_prod_pln_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prod_pln_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProdPlnTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cntry_org_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cntry_org_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Dtl_comp_spec_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_comp_spec_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CompSpecTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_spec_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_spec_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSpecGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_upri_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_upri_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_slo_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_slo_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SloProcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_inst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_inst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipInstTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_ship_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_ship_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmShipGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Dtl_exim_xpns_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_exim_xpns_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.EximXpnsTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ref_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ref_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ref_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ref_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_calc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_calc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcPtn");
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
		if(combo == Cnd_stk_mng_typ) return getCnd_stk_mng_typ(row, info);
		if(combo == Cnd_asset_mng_typ) return getCnd_asset_mng_typ(row, info);
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
		if(combo == columnDtl_stk_mng_typ) return getDtl_stk_mng_typ(row, info);
		if(combo == columnDtl_asset_mng_typ) return getDtl_asset_mng_typ(row, info);
		if(combo == columnDtl_unit_cd) return getDtl_unit_cd(row, info);
		if(combo == columnDtl_rnd_typ) return getDtl_rnd_typ(row, info);
		if(combo == columnDtl_dim_unit_cd) return getDtl_dim_unit_cd(row, info);
		if(combo == columnDtl_wt_unit_cd) return getDtl_wt_unit_cd(row, info);
		if(combo == columnDtl_conts_unit_cd) return getDtl_conts_unit_cd(row, info);
		if(combo == columnDtl_sls_itm_grp_cd) return getDtl_sls_itm_grp_cd(row, info);
		if(combo == columnDtl_itm_grp_cd1) return getDtl_itm_grp_cd1(row, info);
		if(combo == columnDtl_itm_grp_cd2) return getDtl_itm_grp_cd2(row, info);
		if(combo == columnDtl_itm_grp_cd3) return getDtl_itm_grp_cd3(row, info);
		if(combo == columnDtl_itm_grp_cd4) return getDtl_itm_grp_cd4(row, info);
		if(combo == columnDtl_itm_grp_cd5) return getDtl_itm_grp_cd5(row, info);
		if(combo == columnDtl_itm_grp_cd6) return getDtl_itm_grp_cd6(row, info);
		if(combo == columnDtl_itm_grp_cd7) return getDtl_itm_grp_cd7(row, info);
		if(combo == columnDtl_itm_grp_cd8) return getDtl_itm_grp_cd8(row, info);
		if(combo == columnDtl_itm_grp_cd9) return getDtl_itm_grp_cd9(row, info);
		if(combo == columnDtl_itm_grp_cd10) return getDtl_itm_grp_cd10(row, info);
		if(combo == columnDtl_hs_cd) return getDtl_hs_cd(row, info);
		if(combo == columnDtl_jan_typ) return getDtl_jan_typ(row, info);
		if(combo == columnDtl_itm_typ) return getDtl_itm_typ(row, info);
		if(combo == columnDtl_itm_typ_d_cd) return getDtl_itm_typ_d_cd(row, info);
		if(combo == columnDtl_itm_jnl_cd) return getDtl_itm_jnl_cd(row, info);
		if(combo == columnDtl_ac_itm_grp_cd) return getDtl_ac_itm_grp_cd(row, info);
		if(combo == columnDtl_sls_tax_cd) return getDtl_sls_tax_cd(row, info);
		if(combo == columnDtl_purc_tax_cd) return getDtl_purc_tax_cd(row, info);
		if(combo == columnDtl_prov_tax_cd) return getDtl_prov_tax_cd(row, info);
		if(combo == columnDtl_ship_unit_cd) return getDtl_ship_unit_cd(row, info);
		if(combo == columnDtl_mfg_unit_cd) return getDtl_mfg_unit_cd(row, info);
		if(combo == columnDtl_purc_unit_cd) return getDtl_purc_unit_cd(row, info);
		if(combo == columnDtl_pckg_unit_cd) return getDtl_pckg_unit_cd(row, info);
		if(combo == columnDtl_lot_mng_typ) return getDtl_lot_mng_typ(row, info);
		if(combo == columnDtl_lot_no_typ) return getDtl_lot_no_typ(row, info);
		if(combo == columnDtl_lot_no_ptn_cd) return getDtl_lot_no_ptn_cd(row, info);
		if(combo == columnDtl_sublot_mng_typ) return getDtl_sublot_mng_typ(row, info);
		if(combo == columnDtl_sublot_no_typ) return getDtl_sublot_no_typ(row, info);
		if(combo == columnDtl_sublot_no_ptn_cd) return getDtl_sublot_no_ptn_cd(row, info);
		if(combo == columnDtl_insp_bind_typ) return getDtl_insp_bind_typ(row, info);
		if(combo == columnDtl_mrkt_judg_role_cd) return getDtl_mrkt_judg_role_cd(row, info);
		if(combo == columnDtl_mrkt_judg_upd_role_cd) return getDtl_mrkt_judg_upd_role_cd(row, info);
		if(combo == columnDtl_ship_valid_grp_cd) return getDtl_ship_valid_grp_cd(row, info);
		if(combo == columnDtl_cont_fctr_unit_cd) return getDtl_cont_fctr_unit_cd(row, info);
		if(combo == columnDtl_cont_fctr_rnd_typ) return getDtl_cont_fctr_rnd_typ(row, info);
		if(combo == columnDtl_sno1_mng_typ) return getDtl_sno1_mng_typ(row, info);
		if(combo == columnDtl_sno1_num_typ) return getDtl_sno1_num_typ(row, info);
		if(combo == columnDtl_sno1_ptn_cd) return getDtl_sno1_ptn_cd(row, info);
		if(combo == columnDtl_sno2_mng_typ) return getDtl_sno2_mng_typ(row, info);
		if(combo == columnDtl_sno2_num_typ) return getDtl_sno2_num_typ(row, info);
		if(combo == columnDtl_sno2_ptn_cd) return getDtl_sno2_ptn_cd(row, info);
		if(combo == columnDtl_sno3_mng_typ) return getDtl_sno3_mng_typ(row, info);
		if(combo == columnDtl_sno3_num_typ) return getDtl_sno3_num_typ(row, info);
		if(combo == columnDtl_sno3_ptn_cd) return getDtl_sno3_ptn_cd(row, info);
		if(combo == columnDtl_sno4_mng_typ) return getDtl_sno4_mng_typ(row, info);
		if(combo == columnDtl_sno4_num_typ) return getDtl_sno4_num_typ(row, info);
		if(combo == columnDtl_sno4_ptn_cd) return getDtl_sno4_ptn_cd(row, info);
		if(combo == columnDtl_mfg_inst_unit_typ) return getDtl_mfg_inst_unit_typ(row, info);
		if(combo == columnDtl_mrp_proc_typ) return getDtl_mrp_proc_typ(row, info);
		if(combo == columnDtl_rqmt_typ) return getDtl_rqmt_typ(row, info);
		if(combo == columnDtl_prod_pln_typ) return getDtl_prod_pln_typ(row, info);
		if(combo == columnDtl_cntry_org_cd) return getDtl_cntry_org_cd(row, info);
		if(combo == columnDtl_comp_spec_typ) return getDtl_comp_spec_typ(row, info);
		if(combo == columnDtl_itm_spec_grp_cd) return getDtl_itm_spec_grp_cd(row, info);
		if(combo == columnDtl_sls_upri_grp_cd) return getDtl_sls_upri_grp_cd(row, info);
		if(combo == columnDtl_slo_proc_typ) return getDtl_slo_proc_typ(row, info);
		if(combo == columnDtl_ship_inst_typ) return getDtl_ship_inst_typ(row, info);
		if(combo == columnDtl_itm_ship_grp_cd) return getDtl_itm_ship_grp_cd(row, info);
		if(combo == columnDtl_ship_term_cd) return getDtl_ship_term_cd(row, info);
		if(combo == columnDtl_exim_xpns_typ) return getDtl_exim_xpns_typ(row, info);
		if(combo == Dtl_ref_itm_p_PPanel.columnItm_itm_cd) return getDtl_ref_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_ref_itm_p_PPanel.columnItm_itm_sub1) return getDtl_ref_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_ref_itm_p_PPanel.columnItm_itm_sub2) return getDtl_ref_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_ref_itm_p_PPanel.columnItm_itm_sub3) return getDtl_ref_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_calc_ptn_cd) return getDtl_calc_ptn_cd(row, info);
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
		else if (ap == DtlBtn_open_MABCP0870) doDtlBtn_open_MABCP0870(info);
		else if (ap == DtlBtn_open_MABCP0840) doDtlBtn_open_MABCP0840(info);
		else if (ap == DtlBtn_open_MABCP0400) doDtlBtn_open_MABCP0400(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_upd) doDtlBtn_upd(info);
		else if (ap == DtlBtn_upd_admin) doDtlBtn_upd_admin(info);
		else if (ap == DtlBtn_upd_cmn) doDtlBtn_upd_cmn(info);
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
	 * [DtlBtn]パネルの[open_MABCP0870]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABCP0870(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABCP0840]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABCP0840(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABCP0400]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABCP0400(MCEventInfo info);

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
	 * [DtlBtn]パネルの[upd_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_admin(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_cmn(MCEventInfo info);

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
		if (vc == Cnd_tar_Group) return doCnd_tar_VC(info);
		if (vc == Cnd_own_co_flg_off) return doCnd_own_co_flg_off_VC(info);
		if (vc == Cnd_own_co_flg_on) return doCnd_own_co_flg_on_VC(info);
		if (vc == Cnd_release_flg_off) return doCnd_release_flg_off_VC(info);
		if (vc == Cnd_release_flg_on) return doCnd_release_flg_on_VC(info);
		if (vc == Cnd_stk_mng_typ) return doCnd_stk_mng_typ_VC(info);
		if (vc == Cnd_stk_mng_typ_nm) return doCnd_stk_mng_typ_nm_VC(info);
		if (vc == Cnd_asset_mng_typ) return doCnd_asset_mng_typ_VC(info);
		if (vc == Cnd_asset_mng_typ_nm) return doCnd_asset_mng_typ_nm_VC(info);
		if (vc == Cnd_sundry_itm_flg_off) return doCnd_sundry_itm_flg_off_VC(info);
		if (vc == Cnd_sundry_itm_flg_on) return doCnd_sundry_itm_flg_on_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_memo1_c) return doCnd_memo1_c_VC(info);
		if (vc == Cnd_memo2_c) return doCnd_memo2_c_VC(info);
		if (vc == Cnd_memo3_c) return doCnd_memo3_c_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_th_image_flg) return doCnd_th_image_flg_VC(info);
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
		if (vc == Cnd_upd_only_com_flg) return doCnd_upd_only_com_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_release_flg) return doDtl_release_flg_VC(info);
		if (vc == columnDtl_th_image_flg) return doDtl_th_image_flg_VC(info);
		if (vc == columnDtl_th_image) return doDtl_th_image_VC(info);
		if (vc == columnDtl_itm_cd) return doDtl_itm_cd_VC(info);
		if (vc == columnDtl_itm_sub1) return doDtl_itm_sub1_VC(info);
		if (vc == columnDtl_itm_sub2) return doDtl_itm_sub2_VC(info);
		if (vc == columnDtl_itm_sub3) return doDtl_itm_sub3_VC(info);
		if (vc == columnDtl_itm_nm) return doDtl_itm_nm_VC(info);
		if (vc == columnDtl_base_itm_nm) return doDtl_base_itm_nm_VC(info);
		if (vc == columnDtl_base_itm_alt_nm1) return doDtl_base_itm_alt_nm1_VC(info);
		if (vc == columnDtl_base_itm_alt_nm2) return doDtl_base_itm_alt_nm2_VC(info);
		if (vc == columnDtl_base_itm_alt_nm3) return doDtl_base_itm_alt_nm3_VC(info);
		if (vc == columnDtl_base_itm_alt_nm4) return doDtl_base_itm_alt_nm4_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_stk_mng_typ_nm) return doDtl_stk_mng_typ_nm_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ_nm) return doDtl_asset_mng_typ_nm_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_unit_nm) return doDtl_unit_nm_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_rnd_typ) return doDtl_rnd_typ_VC(info);
		if (vc == columnDtl_rnd_typ_nm) return doDtl_rnd_typ_nm_VC(info);
		if (vc == columnDtl_dim_unit_cd) return doDtl_dim_unit_cd_VC(info);
		if (vc == columnDtl_dim_unit_nm) return doDtl_dim_unit_nm_VC(info);
		if (vc == columnDtl_dim) return doDtl_dim_VC(info);
		if (vc == columnDtl_wt_unit_cd) return doDtl_wt_unit_cd_VC(info);
		if (vc == columnDtl_wt_unit_nm) return doDtl_wt_unit_nm_VC(info);
		if (vc == columnDtl_wt) return doDtl_wt_VC(info);
		if (vc == columnDtl_conts_unit_cd) return doDtl_conts_unit_cd_VC(info);
		if (vc == columnDtl_conts_unit_nm) return doDtl_conts_unit_nm_VC(info);
		if (vc == columnDtl_conts_qty) return doDtl_conts_qty_VC(info);
		if (vc == columnDtl_unit_dim) return doDtl_unit_dim_VC(info);
		if (vc == columnDtl_unit_wt) return doDtl_unit_wt_VC(info);
		if (vc == columnDtl_sls_itm_grp_cd) return doDtl_sls_itm_grp_cd_VC(info);
		if (vc == columnDtl_sls_itm_grp_nm) return doDtl_sls_itm_grp_nm_VC(info);
		if (vc == columnDtl_itm_grp_cd1) return doDtl_itm_grp_cd1_VC(info);
		if (vc == columnDtl_itm_grp_nm1) return doDtl_itm_grp_nm1_VC(info);
		if (vc == columnDtl_itm_grp_cd2) return doDtl_itm_grp_cd2_VC(info);
		if (vc == columnDtl_itm_grp_nm2) return doDtl_itm_grp_nm2_VC(info);
		if (vc == columnDtl_itm_grp_cd3) return doDtl_itm_grp_cd3_VC(info);
		if (vc == columnDtl_itm_grp_nm3) return doDtl_itm_grp_nm3_VC(info);
		if (vc == columnDtl_itm_grp_cd4) return doDtl_itm_grp_cd4_VC(info);
		if (vc == columnDtl_itm_grp_nm4) return doDtl_itm_grp_nm4_VC(info);
		if (vc == columnDtl_itm_grp_cd5) return doDtl_itm_grp_cd5_VC(info);
		if (vc == columnDtl_itm_grp_nm5) return doDtl_itm_grp_nm5_VC(info);
		if (vc == columnDtl_itm_grp_cd6) return doDtl_itm_grp_cd6_VC(info);
		if (vc == columnDtl_itm_grp_nm6) return doDtl_itm_grp_nm6_VC(info);
		if (vc == columnDtl_itm_grp_cd7) return doDtl_itm_grp_cd7_VC(info);
		if (vc == columnDtl_itm_grp_nm7) return doDtl_itm_grp_nm7_VC(info);
		if (vc == columnDtl_itm_grp_cd8) return doDtl_itm_grp_cd8_VC(info);
		if (vc == columnDtl_itm_grp_nm8) return doDtl_itm_grp_nm8_VC(info);
		if (vc == columnDtl_itm_grp_cd9) return doDtl_itm_grp_cd9_VC(info);
		if (vc == columnDtl_itm_grp_nm9) return doDtl_itm_grp_nm9_VC(info);
		if (vc == columnDtl_itm_grp_cd10) return doDtl_itm_grp_cd10_VC(info);
		if (vc == columnDtl_itm_grp_nm10) return doDtl_itm_grp_nm10_VC(info);
		if (vc == columnDtl_hs_cd) return doDtl_hs_cd_VC(info);
		if (vc == columnDtl_hs_nm) return doDtl_hs_nm_VC(info);
		if (vc == columnDtl_jan_typ) return doDtl_jan_typ_VC(info);
		if (vc == columnDtl_jan_typ_nm) return doDtl_jan_typ_nm_VC(info);
		if (vc == columnDtl_jan_cd) return doDtl_jan_cd_VC(info);
		if (vc == columnDtl_itf_cd) return doDtl_itf_cd_VC(info);
		if (vc == columnDtl_gtin_cd) return doDtl_gtin_cd_VC(info);
		if (vc == columnDtl_memo1_c) return doDtl_memo1_c_VC(info);
		if (vc == columnDtl_memo2_c) return doDtl_memo2_c_VC(info);
		if (vc == columnDtl_memo3_c) return doDtl_memo3_c_VC(info);
		if (vc == columnDtl_ins_usr_id_c) return doDtl_ins_usr_id_c_VC(info);
		if (vc == columnDtl_ins_usr_nm_c) return doDtl_ins_usr_nm_c_VC(info);
		if (vc == columnDtl_ins_ts_c) return doDtl_ins_ts_c_VC(info);
		if (vc == columnDtl_ins_func_id_c) return doDtl_ins_func_id_c_VC(info);
		if (vc == columnDtl_ins_func_nm_c) return doDtl_ins_func_nm_c_VC(info);
		if (vc == columnDtl_upd_cntr_c) return doDtl_upd_cntr_c_VC(info);
		if (vc == columnDtl_upd_usr_id_c) return doDtl_upd_usr_id_c_VC(info);
		if (vc == columnDtl_upd_usr_nm_c) return doDtl_upd_usr_nm_c_VC(info);
		if (vc == columnDtl_upd_ts_c) return doDtl_upd_ts_c_VC(info);
		if (vc == columnDtl_upd_func_id_c) return doDtl_upd_func_id_c_VC(info);
		if (vc == columnDtl_upd_func_nm_c) return doDtl_upd_func_nm_c_VC(info);
		if (vc == columnDtl_upd_srv_req_no_c) return doDtl_upd_srv_req_no_c_VC(info);
		if (vc == columnDtl_co_cd) return doDtl_co_cd_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_ac_itm_grp_cd) return doDtl_ac_itm_grp_cd_VC(info);
		if (vc == columnDtl_ac_itm_grp_nm) return doDtl_ac_itm_grp_nm_VC(info);
		if (vc == columnDtl_minus_stk_flg) return doDtl_minus_stk_flg_VC(info);
		if (vc == columnDtl_gi_alloc_flg) return doDtl_gi_alloc_flg_VC(info);
		if (vc == columnDtl_sls_tax_cd) return doDtl_sls_tax_cd_VC(info);
		if (vc == columnDtl_sls_tax_nm) return doDtl_sls_tax_nm_VC(info);
		if (vc == columnDtl_purc_tax_cd) return doDtl_purc_tax_cd_VC(info);
		if (vc == columnDtl_purc_tax_nm) return doDtl_purc_tax_nm_VC(info);
		if (vc == columnDtl_prov_tax_cd) return doDtl_prov_tax_cd_VC(info);
		if (vc == columnDtl_prov_tax_nm) return doDtl_prov_tax_nm_VC(info);
		if (vc == columnDtl_wtax_rate) return doDtl_wtax_rate_VC(info);
		if (vc == columnDtl_ship_unit_cd) return doDtl_ship_unit_cd_VC(info);
		if (vc == columnDtl_ship_unit_nm) return doDtl_ship_unit_nm_VC(info);
		if (vc == columnDtl_mfg_unit_cd) return doDtl_mfg_unit_cd_VC(info);
		if (vc == columnDtl_mfg_unit_nm) return doDtl_mfg_unit_nm_VC(info);
		if (vc == columnDtl_purc_unit_cd) return doDtl_purc_unit_cd_VC(info);
		if (vc == columnDtl_purc_unit_nm) return doDtl_purc_unit_nm_VC(info);
		if (vc == columnDtl_pckg_unit_cd) return doDtl_pckg_unit_cd_VC(info);
		if (vc == columnDtl_pckg_unit_nm) return doDtl_pckg_unit_nm_VC(info);
		if (vc == columnDtl_pack_alloc_flg) return doDtl_pack_alloc_flg_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_lot_mng_typ_nm) return doDtl_lot_mng_typ_nm_VC(info);
		if (vc == columnDtl_lot_no_typ) return doDtl_lot_no_typ_VC(info);
		if (vc == columnDtl_lot_no_typ_nm) return doDtl_lot_no_typ_nm_VC(info);
		if (vc == columnDtl_lot_no_ptn_cd) return doDtl_lot_no_ptn_cd_VC(info);
		if (vc == columnDtl_lot_no_ptn_nm) return doDtl_lot_no_ptn_nm_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ_nm) return doDtl_sublot_mng_typ_nm_VC(info);
		if (vc == columnDtl_sublot_no_typ) return doDtl_sublot_no_typ_VC(info);
		if (vc == columnDtl_sublot_no_typ_nm) return doDtl_sublot_no_typ_nm_VC(info);
		if (vc == columnDtl_sublot_no_ptn_cd) return doDtl_sublot_no_ptn_cd_VC(info);
		if (vc == columnDtl_sublot_no_ptn_nm) return doDtl_sublot_no_ptn_nm_VC(info);
		if (vc == columnDtl_not_new_lot_flg) return doDtl_not_new_lot_flg_VC(info);
		if (vc == columnDtl_bp_lot_flg) return doDtl_bp_lot_flg_VC(info);
		if (vc == columnDtl_insp_bind_typ) return doDtl_insp_bind_typ_VC(info);
		if (vc == columnDtl_insp_bind_typ_nm) return doDtl_insp_bind_typ_nm_VC(info);
		if (vc == columnDtl_skip_chk_ship_flg) return doDtl_skip_chk_ship_flg_VC(info);
		if (vc == columnDtl_mrkt_judg_flg) return doDtl_mrkt_judg_flg_VC(info);
		if (vc == columnDtl_mrkt_judg_role_cd) return doDtl_mrkt_judg_role_cd_VC(info);
		if (vc == columnDtl_mrkt_judg_role_nm) return doDtl_mrkt_judg_role_nm_VC(info);
		if (vc == columnDtl_mrkt_judg_upd_role_cd) return doDtl_mrkt_judg_upd_role_cd_VC(info);
		if (vc == columnDtl_mrkt_judg_upd_role_nm) return doDtl_mrkt_judg_upd_role_nm_VC(info);
		if (vc == columnDtl_lmt_ctl_flg) return doDtl_lmt_ctl_flg_VC(info);
		if (vc == columnDtl_lmt_ctl_categ) return doDtl_lmt_ctl_categ_VC(info);
		if (vc == columnDtl_ship_lot_back_stop_flg) return doDtl_ship_lot_back_stop_flg_VC(info);
		if (vc == columnDtl_ship_valid_grp_cd) return doDtl_ship_valid_grp_cd_VC(info);
		if (vc == columnDtl_ship_valid_grp_nm) return doDtl_ship_valid_grp_nm_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_std_cont_fctr) return doDtl_std_cont_fctr_VC(info);
		if (vc == columnDtl_cont_fctr_unit_cd) return doDtl_cont_fctr_unit_cd_VC(info);
		if (vc == columnDtl_cont_fctr_unit_nm) return doDtl_cont_fctr_unit_nm_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ_nm) return doDtl_cont_fctr_rnd_typ_nm_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ_nm) return doDtl_sno1_mng_typ_nm_VC(info);
		if (vc == columnDtl_slo_sno1_flg) return doDtl_slo_sno1_flg_VC(info);
		if (vc == columnDtl_rqmt_sno1_flg) return doDtl_rqmt_sno1_flg_VC(info);
		if (vc == columnDtl_sno1_num_typ) return doDtl_sno1_num_typ_VC(info);
		if (vc == columnDtl_sno1_num_typ_nm) return doDtl_sno1_num_typ_nm_VC(info);
		if (vc == columnDtl_sno1_ptn_cd) return doDtl_sno1_ptn_cd_VC(info);
		if (vc == columnDtl_sno1_ptn_nm) return doDtl_sno1_ptn_nm_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ_nm) return doDtl_sno2_mng_typ_nm_VC(info);
		if (vc == columnDtl_slo_sno2_flg) return doDtl_slo_sno2_flg_VC(info);
		if (vc == columnDtl_rqmt_sno2_flg) return doDtl_rqmt_sno2_flg_VC(info);
		if (vc == columnDtl_sno2_num_typ) return doDtl_sno2_num_typ_VC(info);
		if (vc == columnDtl_sno2_num_typ_nm) return doDtl_sno2_num_typ_nm_VC(info);
		if (vc == columnDtl_sno2_ptn_cd) return doDtl_sno2_ptn_cd_VC(info);
		if (vc == columnDtl_sno2_ptn_nm) return doDtl_sno2_ptn_nm_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ_nm) return doDtl_sno3_mng_typ_nm_VC(info);
		if (vc == columnDtl_slo_sno3_flg) return doDtl_slo_sno3_flg_VC(info);
		if (vc == columnDtl_rqmt_sno3_flg) return doDtl_rqmt_sno3_flg_VC(info);
		if (vc == columnDtl_sno3_num_typ) return doDtl_sno3_num_typ_VC(info);
		if (vc == columnDtl_sno3_num_typ_nm) return doDtl_sno3_num_typ_nm_VC(info);
		if (vc == columnDtl_sno3_ptn_cd) return doDtl_sno3_ptn_cd_VC(info);
		if (vc == columnDtl_sno3_ptn_nm) return doDtl_sno3_ptn_nm_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ_nm) return doDtl_sno4_mng_typ_nm_VC(info);
		if (vc == columnDtl_slo_sno4_flg) return doDtl_slo_sno4_flg_VC(info);
		if (vc == columnDtl_rqmt_sno4_flg) return doDtl_rqmt_sno4_flg_VC(info);
		if (vc == columnDtl_sno4_num_typ) return doDtl_sno4_num_typ_VC(info);
		if (vc == columnDtl_sno4_num_typ_nm) return doDtl_sno4_num_typ_nm_VC(info);
		if (vc == columnDtl_sno4_ptn_cd) return doDtl_sno4_ptn_cd_VC(info);
		if (vc == columnDtl_sno4_ptn_nm) return doDtl_sno4_ptn_nm_VC(info);
		if (vc == columnDtl_def_bom_ptn) return doDtl_def_bom_ptn_VC(info);
		if (vc == columnDtl_mfg_inst_unit_typ) return doDtl_mfg_inst_unit_typ_VC(info);
		if (vc == columnDtl_mfg_inst_unit_typ_nm) return doDtl_mfg_inst_unit_typ_nm_VC(info);
		if (vc == columnDtl_mrp_proc_typ) return doDtl_mrp_proc_typ_VC(info);
		if (vc == columnDtl_mrp_proc_typ_nm) return doDtl_mrp_proc_typ_nm_VC(info);
		if (vc == columnDtl_rqmt_typ) return doDtl_rqmt_typ_VC(info);
		if (vc == columnDtl_rqmt_typ_nm) return doDtl_rqmt_typ_nm_VC(info);
		if (vc == columnDtl_prod_pln_typ) return doDtl_prod_pln_typ_VC(info);
		if (vc == columnDtl_prod_pln_typ_nm) return doDtl_prod_pln_typ_nm_VC(info);
		if (vc == columnDtl_dmnd_date_div_mons) return doDtl_dmnd_date_div_mons_VC(info);
		if (vc == columnDtl_alloc_margin_days) return doDtl_alloc_margin_days_VC(info);
		if (vc == columnDtl_mrp_alloc_margin_days) return doDtl_mrp_alloc_margin_days_VC(info);
		if (vc == columnDtl_mrp_opn_xfr_days) return doDtl_mrp_opn_xfr_days_VC(info);
		if (vc == columnDtl_inpt_itm_add_flg) return doDtl_inpt_itm_add_flg_VC(info);
		if (vc == columnDtl_inpt_itm_del_flg) return doDtl_inpt_itm_del_flg_VC(info);
		if (vc == columnDtl_sch_flg) return doDtl_sch_flg_VC(info);
		if (vc == columnDtl_cntry_org_cd) return doDtl_cntry_org_cd_VC(info);
		if (vc == columnDtl_cntry_org_nm) return doDtl_cntry_org_nm_VC(info);
		if (vc == columnDtl_comp_spec_typ) return doDtl_comp_spec_typ_VC(info);
		if (vc == columnDtl_comp_spec_typ_nm) return doDtl_comp_spec_typ_nm_VC(info);
		if (vc == columnDtl_comp_rev_at_slo_flg) return doDtl_comp_rev_at_slo_flg_VC(info);
		if (vc == columnDtl_comp_core_itm_flg) return doDtl_comp_core_itm_flg_VC(info);
		if (vc == columnDtl_itm_spec_grp_cd) return doDtl_itm_spec_grp_cd_VC(info);
		if (vc == columnDtl_itm_spec_grp_nm) return doDtl_itm_spec_grp_nm_VC(info);
		if (vc == columnDtl_sls_upri_grp_cd) return doDtl_sls_upri_grp_cd_VC(info);
		if (vc == columnDtl_sls_upri_grp_nm) return doDtl_sls_upri_grp_nm_VC(info);
		if (vc == columnDtl_bill_crryovr_times) return doDtl_bill_crryovr_times_VC(info);
		if (vc == columnDtl_pay_crryovr_times) return doDtl_pay_crryovr_times_VC(info);
		if (vc == columnDtl_slo_proc_flg) return doDtl_slo_proc_flg_VC(info);
		if (vc == columnDtl_slo_proc_typ) return doDtl_slo_proc_typ_VC(info);
		if (vc == columnDtl_slo_proc_typ_nm) return doDtl_slo_proc_typ_nm_VC(info);
		if (vc == columnDtl_ship_inst_typ) return doDtl_ship_inst_typ_VC(info);
		if (vc == columnDtl_ship_inst_typ_nm) return doDtl_ship_inst_typ_nm_VC(info);
		if (vc == columnDtl_itm_ship_grp_cd) return doDtl_itm_ship_grp_cd_VC(info);
		if (vc == columnDtl_itm_ship_grp_nm) return doDtl_itm_ship_grp_nm_VC(info);
		if (vc == columnDtl_arr_skip_flg) return doDtl_arr_skip_flg_VC(info);
		if (vc == columnDtl_purc_dlv_slip_flg) return doDtl_purc_dlv_slip_flg_VC(info);
		if (vc == columnDtl_ship_term_cd) return doDtl_ship_term_cd_VC(info);
		if (vc == columnDtl_ship_term_nm) return doDtl_ship_term_nm_VC(info);
		if (vc == columnDtl_exim_xpns_typ) return doDtl_exim_xpns_typ_VC(info);
		if (vc == columnDtl_exim_xpns_typ_nm) return doDtl_exim_xpns_typ_nm_VC(info);
		if (vc == columnDtl_stk_lst_flg) return doDtl_stk_lst_flg_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_sls_upri_cng_flg) return doDtl_sls_upri_cng_flg_VC(info);
		if (vc == columnDtl_purc_upri_cng_flg) return doDtl_purc_upri_cng_flg_VC(info);
		if (vc == columnDtl_prov_upri_cng_flg) return doDtl_prov_upri_cng_flg_VC(info);
		if (vc == columnDtl_ext_sys_no_itm) return doDtl_ext_sys_no_itm_VC(info);
		if (vc == columnDtl_chng_no) return doDtl_chng_no_VC(info);
		if (vc == columnDtl_calc_ptn_cd) return doDtl_calc_ptn_cd_VC(info);
		if (vc == columnDtl_calc_ptn_nm) return doDtl_calc_ptn_nm_VC(info);
		if (vc == columnDtl_itm_alc_grp) return doDtl_itm_alc_grp_VC(info);
		if (vc == columnDtl_sls_flg) return doDtl_sls_flg_VC(info);
		if (vc == columnDtl_sls_input_flg) return doDtl_sls_input_flg_VC(info);
		if (vc == columnDtl_mfg_flg) return doDtl_mfg_flg_VC(info);
		if (vc == columnDtl_mfg_input_flg) return doDtl_mfg_input_flg_VC(info);
		if (vc == columnDtl_purc_flg) return doDtl_purc_flg_VC(info);
		if (vc == columnDtl_purc_input_flg) return doDtl_purc_input_flg_VC(info);
		if (vc == columnDtl_insp_flg) return doDtl_insp_flg_VC(info);
		if (vc == columnDtl_insp_input_flg) return doDtl_insp_input_flg_VC(info);
		if (vc == columnDtl_release_tm) return doDtl_release_tm_VC(info);
		if (vc == columnDtl_release_usr_cd) return doDtl_release_usr_cd_VC(info);
		if (vc == columnDtl_release_usr_nm) return doDtl_release_usr_nm_VC(info);
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
	 * [Cnd]パネルの[tar]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tar_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[own_co_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_own_co_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[own_co_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_own_co_flg_on_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sundry_itm_flg_on_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[th_image_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_th_image_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[upd_only_com_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_upd_only_com_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_alt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_alt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_alt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_alt_nm4_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dim_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dim_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dim_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dim_unit_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wt_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wt_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[conts_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_conts_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[conts_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_conts_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[conts_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_conts_qty_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[unit_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[hs_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_hs_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[hs_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_hs_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jan_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jan_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jan_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jan_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jan_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jan_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itf_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itf_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gtin_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gtin_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_usr_id_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[co_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_co_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_itm_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_itm_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gi_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gi_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wtax_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_unit_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[pack_alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_alloc_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sublot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_new_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_new_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_bind_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_bind_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[mrkt_judg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrkt_judg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrkt_judg_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrkt_judg_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrkt_judg_upd_role_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrkt_judg_upd_role_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lmt_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_categ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lmt_ctl_categ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_lot_back_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_lot_back_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_valid_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_valid_grp_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[std_cont_fctr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_cont_fctr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno1_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno2_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno3_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sno4_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_num_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_unit_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrp_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrp_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqmt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prod_pln_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prod_pln_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dmnd_date_div_mons]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dmnd_date_div_mons_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrp_alloc_margin_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrp_alloc_margin_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mrp_opn_xfr_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mrp_opn_xfr_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_itm_add_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_itm_add_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_itm_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_itm_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sch_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[comp_spec_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_spec_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_rev_at_slo_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_rev_at_slo_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[comp_core_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_comp_core_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_crryovr_times_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_proc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_proc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_proc_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_inst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_ship_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_ship_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_skip_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_dlv_slip_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exim_xpns_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_exim_xpns_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_lst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_lst_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[sls_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_upri_cng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_upri_cng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_itm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_no_itm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chng_no_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[calc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alc_grp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alc_grp_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_release_tm_VC(MCEventInfo info){
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
		else if (nc == Cnd_tar_Group) doCnd_tar_NC(info);
		else if (nc == Cnd_own_co_flg_off) doCnd_own_co_flg_off_NC(info);
		else if (nc == Cnd_own_co_flg_on) doCnd_own_co_flg_on_NC(info);
		else if (nc == Cnd_release_flg_off) doCnd_release_flg_off_NC(info);
		else if (nc == Cnd_release_flg_on) doCnd_release_flg_on_NC(info);
		else if (nc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NC(info);
		else if (nc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NC(info);
		else if (nc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NC(info);
		else if (nc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NC(info);
		else if (nc == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NC(info);
		else if (nc == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_memo1_c) doCnd_memo1_c_NC(info);
		else if (nc == Cnd_memo2_c) doCnd_memo2_c_NC(info);
		else if (nc == Cnd_memo3_c) doCnd_memo3_c_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_th_image_flg) doCnd_th_image_flg_NC(info);
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
		else if (nc == Cnd_upd_only_com_flg) doCnd_upd_only_com_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_release_flg) doDtl_release_flg_NC(info);
		else if (nc == columnDtl_th_image_flg) doDtl_th_image_flg_NC(info);
		else if (nc == columnDtl_th_image) doDtl_th_image_NC(info);
		else if (nc == columnDtl_itm_cd) doDtl_itm_cd_NC(info);
		else if (nc == columnDtl_itm_sub1) doDtl_itm_sub1_NC(info);
		else if (nc == columnDtl_itm_sub2) doDtl_itm_sub2_NC(info);
		else if (nc == columnDtl_itm_sub3) doDtl_itm_sub3_NC(info);
		else if (nc == columnDtl_itm_nm) doDtl_itm_nm_NC(info);
		else if (nc == columnDtl_base_itm_nm) doDtl_base_itm_nm_NC(info);
		else if (nc == columnDtl_base_itm_alt_nm1) doDtl_base_itm_alt_nm1_NC(info);
		else if (nc == columnDtl_base_itm_alt_nm2) doDtl_base_itm_alt_nm2_NC(info);
		else if (nc == columnDtl_base_itm_alt_nm3) doDtl_base_itm_alt_nm3_NC(info);
		else if (nc == columnDtl_base_itm_alt_nm4) doDtl_base_itm_alt_nm4_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_stk_mng_typ_nm) doDtl_stk_mng_typ_nm_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_unit_nm) doDtl_unit_nm_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_rnd_typ) doDtl_rnd_typ_NC(info);
		else if (nc == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_dim_unit_cd) doDtl_dim_unit_cd_NC(info);
		else if (nc == columnDtl_dim_unit_nm) doDtl_dim_unit_nm_NC(info);
		else if (nc == columnDtl_dim) doDtl_dim_NC(info);
		else if (nc == columnDtl_wt_unit_cd) doDtl_wt_unit_cd_NC(info);
		else if (nc == columnDtl_wt_unit_nm) doDtl_wt_unit_nm_NC(info);
		else if (nc == columnDtl_wt) doDtl_wt_NC(info);
		else if (nc == columnDtl_conts_unit_cd) doDtl_conts_unit_cd_NC(info);
		else if (nc == columnDtl_conts_unit_nm) doDtl_conts_unit_nm_NC(info);
		else if (nc == columnDtl_conts_qty) doDtl_conts_qty_NC(info);
		else if (nc == columnDtl_unit_dim) doDtl_unit_dim_NC(info);
		else if (nc == columnDtl_unit_wt) doDtl_unit_wt_NC(info);
		else if (nc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NC(info);
		else if (nc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NC(info);
		else if (nc == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NC(info);
		else if (nc == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NC(info);
		else if (nc == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NC(info);
		else if (nc == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NC(info);
		else if (nc == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NC(info);
		else if (nc == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NC(info);
		else if (nc == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NC(info);
		else if (nc == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NC(info);
		else if (nc == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NC(info);
		else if (nc == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NC(info);
		else if (nc == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NC(info);
		else if (nc == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NC(info);
		else if (nc == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NC(info);
		else if (nc == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NC(info);
		else if (nc == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NC(info);
		else if (nc == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NC(info);
		else if (nc == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NC(info);
		else if (nc == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NC(info);
		else if (nc == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NC(info);
		else if (nc == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NC(info);
		else if (nc == columnDtl_hs_cd) doDtl_hs_cd_NC(info);
		else if (nc == columnDtl_hs_nm) doDtl_hs_nm_NC(info);
		else if (nc == columnDtl_jan_typ) doDtl_jan_typ_NC(info);
		else if (nc == columnDtl_jan_typ_nm) doDtl_jan_typ_nm_NC(info);
		else if (nc == columnDtl_jan_cd) doDtl_jan_cd_NC(info);
		else if (nc == columnDtl_itf_cd) doDtl_itf_cd_NC(info);
		else if (nc == columnDtl_gtin_cd) doDtl_gtin_cd_NC(info);
		else if (nc == columnDtl_memo1_c) doDtl_memo1_c_NC(info);
		else if (nc == columnDtl_memo2_c) doDtl_memo2_c_NC(info);
		else if (nc == columnDtl_memo3_c) doDtl_memo3_c_NC(info);
		else if (nc == columnDtl_ins_usr_id_c) doDtl_ins_usr_id_c_NC(info);
		else if (nc == columnDtl_ins_usr_nm_c) doDtl_ins_usr_nm_c_NC(info);
		else if (nc == columnDtl_ins_ts_c) doDtl_ins_ts_c_NC(info);
		else if (nc == columnDtl_ins_func_id_c) doDtl_ins_func_id_c_NC(info);
		else if (nc == columnDtl_ins_func_nm_c) doDtl_ins_func_nm_c_NC(info);
		else if (nc == columnDtl_upd_cntr_c) doDtl_upd_cntr_c_NC(info);
		else if (nc == columnDtl_upd_usr_id_c) doDtl_upd_usr_id_c_NC(info);
		else if (nc == columnDtl_upd_usr_nm_c) doDtl_upd_usr_nm_c_NC(info);
		else if (nc == columnDtl_upd_ts_c) doDtl_upd_ts_c_NC(info);
		else if (nc == columnDtl_upd_func_id_c) doDtl_upd_func_id_c_NC(info);
		else if (nc == columnDtl_upd_func_nm_c) doDtl_upd_func_nm_c_NC(info);
		else if (nc == columnDtl_upd_srv_req_no_c) doDtl_upd_srv_req_no_c_NC(info);
		else if (nc == columnDtl_co_cd) doDtl_co_cd_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_ac_itm_grp_cd) doDtl_ac_itm_grp_cd_NC(info);
		else if (nc == columnDtl_ac_itm_grp_nm) doDtl_ac_itm_grp_nm_NC(info);
		else if (nc == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NC(info);
		else if (nc == columnDtl_gi_alloc_flg) doDtl_gi_alloc_flg_NC(info);
		else if (nc == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NC(info);
		else if (nc == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NC(info);
		else if (nc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NC(info);
		else if (nc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NC(info);
		else if (nc == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NC(info);
		else if (nc == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NC(info);
		else if (nc == columnDtl_wtax_rate) doDtl_wtax_rate_NC(info);
		else if (nc == columnDtl_ship_unit_cd) doDtl_ship_unit_cd_NC(info);
		else if (nc == columnDtl_ship_unit_nm) doDtl_ship_unit_nm_NC(info);
		else if (nc == columnDtl_mfg_unit_cd) doDtl_mfg_unit_cd_NC(info);
		else if (nc == columnDtl_mfg_unit_nm) doDtl_mfg_unit_nm_NC(info);
		else if (nc == columnDtl_purc_unit_cd) doDtl_purc_unit_cd_NC(info);
		else if (nc == columnDtl_purc_unit_nm) doDtl_purc_unit_nm_NC(info);
		else if (nc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NC(info);
		else if (nc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NC(info);
		else if (nc == columnDtl_pack_alloc_flg) doDtl_pack_alloc_flg_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_lot_mng_typ_nm) doDtl_lot_mng_typ_nm_NC(info);
		else if (nc == columnDtl_lot_no_typ) doDtl_lot_no_typ_NC(info);
		else if (nc == columnDtl_lot_no_typ_nm) doDtl_lot_no_typ_nm_NC(info);
		else if (nc == columnDtl_lot_no_ptn_cd) doDtl_lot_no_ptn_cd_NC(info);
		else if (nc == columnDtl_lot_no_ptn_nm) doDtl_lot_no_ptn_nm_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ_nm) doDtl_sublot_mng_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NC(info);
		else if (nc == columnDtl_sublot_no_typ_nm) doDtl_sublot_no_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_no_ptn_cd) doDtl_sublot_no_ptn_cd_NC(info);
		else if (nc == columnDtl_sublot_no_ptn_nm) doDtl_sublot_no_ptn_nm_NC(info);
		else if (nc == columnDtl_not_new_lot_flg) doDtl_not_new_lot_flg_NC(info);
		else if (nc == columnDtl_bp_lot_flg) doDtl_bp_lot_flg_NC(info);
		else if (nc == columnDtl_insp_bind_typ) doDtl_insp_bind_typ_NC(info);
		else if (nc == columnDtl_insp_bind_typ_nm) doDtl_insp_bind_typ_nm_NC(info);
		else if (nc == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NC(info);
		else if (nc == columnDtl_mrkt_judg_flg) doDtl_mrkt_judg_flg_NC(info);
		else if (nc == columnDtl_mrkt_judg_role_cd) doDtl_mrkt_judg_role_cd_NC(info);
		else if (nc == columnDtl_mrkt_judg_role_nm) doDtl_mrkt_judg_role_nm_NC(info);
		else if (nc == columnDtl_mrkt_judg_upd_role_cd) doDtl_mrkt_judg_upd_role_cd_NC(info);
		else if (nc == columnDtl_mrkt_judg_upd_role_nm) doDtl_mrkt_judg_upd_role_nm_NC(info);
		else if (nc == columnDtl_lmt_ctl_flg) doDtl_lmt_ctl_flg_NC(info);
		else if (nc == columnDtl_lmt_ctl_categ) doDtl_lmt_ctl_categ_NC(info);
		else if (nc == columnDtl_ship_lot_back_stop_flg) doDtl_ship_lot_back_stop_flg_NC(info);
		else if (nc == columnDtl_ship_valid_grp_cd) doDtl_ship_valid_grp_cd_NC(info);
		else if (nc == columnDtl_ship_valid_grp_nm) doDtl_ship_valid_grp_nm_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_std_cont_fctr) doDtl_std_cont_fctr_NC(info);
		else if (nc == columnDtl_cont_fctr_unit_cd) doDtl_cont_fctr_unit_cd_NC(info);
		else if (nc == columnDtl_cont_fctr_unit_nm) doDtl_cont_fctr_unit_nm_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ_nm) doDtl_cont_fctr_rnd_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ_nm) doDtl_sno1_mng_typ_nm_NC(info);
		else if (nc == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NC(info);
		else if (nc == columnDtl_rqmt_sno1_flg) doDtl_rqmt_sno1_flg_NC(info);
		else if (nc == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NC(info);
		else if (nc == columnDtl_sno1_num_typ_nm) doDtl_sno1_num_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_ptn_cd) doDtl_sno1_ptn_cd_NC(info);
		else if (nc == columnDtl_sno1_ptn_nm) doDtl_sno1_ptn_nm_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ_nm) doDtl_sno2_mng_typ_nm_NC(info);
		else if (nc == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NC(info);
		else if (nc == columnDtl_rqmt_sno2_flg) doDtl_rqmt_sno2_flg_NC(info);
		else if (nc == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NC(info);
		else if (nc == columnDtl_sno2_num_typ_nm) doDtl_sno2_num_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_ptn_cd) doDtl_sno2_ptn_cd_NC(info);
		else if (nc == columnDtl_sno2_ptn_nm) doDtl_sno2_ptn_nm_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ_nm) doDtl_sno3_mng_typ_nm_NC(info);
		else if (nc == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NC(info);
		else if (nc == columnDtl_rqmt_sno3_flg) doDtl_rqmt_sno3_flg_NC(info);
		else if (nc == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NC(info);
		else if (nc == columnDtl_sno3_num_typ_nm) doDtl_sno3_num_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_ptn_cd) doDtl_sno3_ptn_cd_NC(info);
		else if (nc == columnDtl_sno3_ptn_nm) doDtl_sno3_ptn_nm_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ_nm) doDtl_sno4_mng_typ_nm_NC(info);
		else if (nc == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NC(info);
		else if (nc == columnDtl_rqmt_sno4_flg) doDtl_rqmt_sno4_flg_NC(info);
		else if (nc == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NC(info);
		else if (nc == columnDtl_sno4_num_typ_nm) doDtl_sno4_num_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_ptn_cd) doDtl_sno4_ptn_cd_NC(info);
		else if (nc == columnDtl_sno4_ptn_nm) doDtl_sno4_ptn_nm_NC(info);
		else if (nc == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NC(info);
		else if (nc == columnDtl_mfg_inst_unit_typ) doDtl_mfg_inst_unit_typ_NC(info);
		else if (nc == columnDtl_mfg_inst_unit_typ_nm) doDtl_mfg_inst_unit_typ_nm_NC(info);
		else if (nc == columnDtl_mrp_proc_typ) doDtl_mrp_proc_typ_NC(info);
		else if (nc == columnDtl_mrp_proc_typ_nm) doDtl_mrp_proc_typ_nm_NC(info);
		else if (nc == columnDtl_rqmt_typ) doDtl_rqmt_typ_NC(info);
		else if (nc == columnDtl_rqmt_typ_nm) doDtl_rqmt_typ_nm_NC(info);
		else if (nc == columnDtl_prod_pln_typ) doDtl_prod_pln_typ_NC(info);
		else if (nc == columnDtl_prod_pln_typ_nm) doDtl_prod_pln_typ_nm_NC(info);
		else if (nc == columnDtl_dmnd_date_div_mons) doDtl_dmnd_date_div_mons_NC(info);
		else if (nc == columnDtl_alloc_margin_days) doDtl_alloc_margin_days_NC(info);
		else if (nc == columnDtl_mrp_alloc_margin_days) doDtl_mrp_alloc_margin_days_NC(info);
		else if (nc == columnDtl_mrp_opn_xfr_days) doDtl_mrp_opn_xfr_days_NC(info);
		else if (nc == columnDtl_inpt_itm_add_flg) doDtl_inpt_itm_add_flg_NC(info);
		else if (nc == columnDtl_inpt_itm_del_flg) doDtl_inpt_itm_del_flg_NC(info);
		else if (nc == columnDtl_sch_flg) doDtl_sch_flg_NC(info);
		else if (nc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NC(info);
		else if (nc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NC(info);
		else if (nc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NC(info);
		else if (nc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NC(info);
		else if (nc == columnDtl_comp_rev_at_slo_flg) doDtl_comp_rev_at_slo_flg_NC(info);
		else if (nc == columnDtl_comp_core_itm_flg) doDtl_comp_core_itm_flg_NC(info);
		else if (nc == columnDtl_itm_spec_grp_cd) doDtl_itm_spec_grp_cd_NC(info);
		else if (nc == columnDtl_itm_spec_grp_nm) doDtl_itm_spec_grp_nm_NC(info);
		else if (nc == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NC(info);
		else if (nc == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NC(info);
		else if (nc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NC(info);
		else if (nc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NC(info);
		else if (nc == columnDtl_slo_proc_flg) doDtl_slo_proc_flg_NC(info);
		else if (nc == columnDtl_slo_proc_typ) doDtl_slo_proc_typ_NC(info);
		else if (nc == columnDtl_slo_proc_typ_nm) doDtl_slo_proc_typ_nm_NC(info);
		else if (nc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NC(info);
		else if (nc == columnDtl_ship_inst_typ_nm) doDtl_ship_inst_typ_nm_NC(info);
		else if (nc == columnDtl_itm_ship_grp_cd) doDtl_itm_ship_grp_cd_NC(info);
		else if (nc == columnDtl_itm_ship_grp_nm) doDtl_itm_ship_grp_nm_NC(info);
		else if (nc == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NC(info);
		else if (nc == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NC(info);
		else if (nc == columnDtl_ship_term_cd) doDtl_ship_term_cd_NC(info);
		else if (nc == columnDtl_ship_term_nm) doDtl_ship_term_nm_NC(info);
		else if (nc == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NC(info);
		else if (nc == columnDtl_exim_xpns_typ_nm) doDtl_exim_xpns_typ_nm_NC(info);
		else if (nc == columnDtl_stk_lst_flg) doDtl_stk_lst_flg_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NC(info);
		else if (nc == columnDtl_purc_upri_cng_flg) doDtl_purc_upri_cng_flg_NC(info);
		else if (nc == columnDtl_prov_upri_cng_flg) doDtl_prov_upri_cng_flg_NC(info);
		else if (nc == columnDtl_ext_sys_no_itm) doDtl_ext_sys_no_itm_NC(info);
		else if (nc == columnDtl_chng_no) doDtl_chng_no_NC(info);
		else if (nc == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NC(info);
		else if (nc == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NC(info);
		else if (nc == columnDtl_itm_alc_grp) doDtl_itm_alc_grp_NC(info);
		else if (nc == columnDtl_sls_flg) doDtl_sls_flg_NC(info);
		else if (nc == columnDtl_sls_input_flg) doDtl_sls_input_flg_NC(info);
		else if (nc == columnDtl_mfg_flg) doDtl_mfg_flg_NC(info);
		else if (nc == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NC(info);
		else if (nc == columnDtl_purc_flg) doDtl_purc_flg_NC(info);
		else if (nc == columnDtl_purc_input_flg) doDtl_purc_input_flg_NC(info);
		else if (nc == columnDtl_insp_flg) doDtl_insp_flg_NC(info);
		else if (nc == columnDtl_insp_input_flg) doDtl_insp_input_flg_NC(info);
		else if (nc == columnDtl_release_tm) doDtl_release_tm_NC(info);
		else if (nc == columnDtl_release_usr_cd) doDtl_release_usr_cd_NC(info);
		else if (nc == columnDtl_release_usr_nm) doDtl_release_usr_nm_NC(info);
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
	 * [Cnd]パネルの[tar]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_on_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[th_image_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[upd_only_com_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_only_com_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itf_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itf_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gtin_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gtin_cd_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_usr_id_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_c_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[pack_alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_new_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_new_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_categ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_categ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lot_back_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lot_back_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cont_fctr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cont_fctr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dmnd_date_div_mons]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dmnd_date_div_mons_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_alloc_margin_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_alloc_margin_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_opn_xfr_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_opn_xfr_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_add_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_add_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sch_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[comp_spec_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rev_at_slo_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rev_at_slo_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_core_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_core_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_itm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_itm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_grp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_grp_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[release_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NC(MCEventInfo info){
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
		else if (ne == Cnd_tar_Group) doCnd_tar_NE(info);
		else if (ne == Cnd_own_co_flg_off) doCnd_own_co_flg_off_NE(info);
		else if (ne == Cnd_own_co_flg_on) doCnd_own_co_flg_on_NE(info);
		else if (ne == Cnd_release_flg_off) doCnd_release_flg_off_NE(info);
		else if (ne == Cnd_release_flg_on) doCnd_release_flg_on_NE(info);
		else if (ne == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NE(info);
		else if (ne == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NE(info);
		else if (ne == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NE(info);
		else if (ne == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NE(info);
		else if (ne == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NE(info);
		else if (ne == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_memo1_c) doCnd_memo1_c_NE(info);
		else if (ne == Cnd_memo2_c) doCnd_memo2_c_NE(info);
		else if (ne == Cnd_memo3_c) doCnd_memo3_c_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_th_image_flg) doCnd_th_image_flg_NE(info);
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
		else if (ne == Cnd_upd_only_com_flg) doCnd_upd_only_com_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_release_flg) doDtl_release_flg_NE(info);
		else if (ne == columnDtl_th_image_flg) doDtl_th_image_flg_NE(info);
		else if (ne == columnDtl_th_image) doDtl_th_image_NE(info);
		else if (ne == columnDtl_itm_cd) doDtl_itm_cd_NE(info);
		else if (ne == columnDtl_itm_sub1) doDtl_itm_sub1_NE(info);
		else if (ne == columnDtl_itm_sub2) doDtl_itm_sub2_NE(info);
		else if (ne == columnDtl_itm_sub3) doDtl_itm_sub3_NE(info);
		else if (ne == columnDtl_itm_nm) doDtl_itm_nm_NE(info);
		else if (ne == columnDtl_base_itm_nm) doDtl_base_itm_nm_NE(info);
		else if (ne == columnDtl_base_itm_alt_nm1) doDtl_base_itm_alt_nm1_NE(info);
		else if (ne == columnDtl_base_itm_alt_nm2) doDtl_base_itm_alt_nm2_NE(info);
		else if (ne == columnDtl_base_itm_alt_nm3) doDtl_base_itm_alt_nm3_NE(info);
		else if (ne == columnDtl_base_itm_alt_nm4) doDtl_base_itm_alt_nm4_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_stk_mng_typ_nm) doDtl_stk_mng_typ_nm_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_unit_nm) doDtl_unit_nm_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_rnd_typ) doDtl_rnd_typ_NE(info);
		else if (ne == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_dim_unit_cd) doDtl_dim_unit_cd_NE(info);
		else if (ne == columnDtl_dim_unit_nm) doDtl_dim_unit_nm_NE(info);
		else if (ne == columnDtl_dim) doDtl_dim_NE(info);
		else if (ne == columnDtl_wt_unit_cd) doDtl_wt_unit_cd_NE(info);
		else if (ne == columnDtl_wt_unit_nm) doDtl_wt_unit_nm_NE(info);
		else if (ne == columnDtl_wt) doDtl_wt_NE(info);
		else if (ne == columnDtl_conts_unit_cd) doDtl_conts_unit_cd_NE(info);
		else if (ne == columnDtl_conts_unit_nm) doDtl_conts_unit_nm_NE(info);
		else if (ne == columnDtl_conts_qty) doDtl_conts_qty_NE(info);
		else if (ne == columnDtl_unit_dim) doDtl_unit_dim_NE(info);
		else if (ne == columnDtl_unit_wt) doDtl_unit_wt_NE(info);
		else if (ne == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NE(info);
		else if (ne == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NE(info);
		else if (ne == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NE(info);
		else if (ne == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NE(info);
		else if (ne == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NE(info);
		else if (ne == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NE(info);
		else if (ne == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NE(info);
		else if (ne == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NE(info);
		else if (ne == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NE(info);
		else if (ne == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NE(info);
		else if (ne == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NE(info);
		else if (ne == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NE(info);
		else if (ne == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NE(info);
		else if (ne == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NE(info);
		else if (ne == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NE(info);
		else if (ne == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NE(info);
		else if (ne == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NE(info);
		else if (ne == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NE(info);
		else if (ne == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NE(info);
		else if (ne == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NE(info);
		else if (ne == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NE(info);
		else if (ne == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NE(info);
		else if (ne == columnDtl_hs_cd) doDtl_hs_cd_NE(info);
		else if (ne == columnDtl_hs_nm) doDtl_hs_nm_NE(info);
		else if (ne == columnDtl_jan_typ) doDtl_jan_typ_NE(info);
		else if (ne == columnDtl_jan_typ_nm) doDtl_jan_typ_nm_NE(info);
		else if (ne == columnDtl_jan_cd) doDtl_jan_cd_NE(info);
		else if (ne == columnDtl_itf_cd) doDtl_itf_cd_NE(info);
		else if (ne == columnDtl_gtin_cd) doDtl_gtin_cd_NE(info);
		else if (ne == columnDtl_memo1_c) doDtl_memo1_c_NE(info);
		else if (ne == columnDtl_memo2_c) doDtl_memo2_c_NE(info);
		else if (ne == columnDtl_memo3_c) doDtl_memo3_c_NE(info);
		else if (ne == columnDtl_ins_usr_id_c) doDtl_ins_usr_id_c_NE(info);
		else if (ne == columnDtl_ins_usr_nm_c) doDtl_ins_usr_nm_c_NE(info);
		else if (ne == columnDtl_ins_ts_c) doDtl_ins_ts_c_NE(info);
		else if (ne == columnDtl_ins_func_id_c) doDtl_ins_func_id_c_NE(info);
		else if (ne == columnDtl_ins_func_nm_c) doDtl_ins_func_nm_c_NE(info);
		else if (ne == columnDtl_upd_cntr_c) doDtl_upd_cntr_c_NE(info);
		else if (ne == columnDtl_upd_usr_id_c) doDtl_upd_usr_id_c_NE(info);
		else if (ne == columnDtl_upd_usr_nm_c) doDtl_upd_usr_nm_c_NE(info);
		else if (ne == columnDtl_upd_ts_c) doDtl_upd_ts_c_NE(info);
		else if (ne == columnDtl_upd_func_id_c) doDtl_upd_func_id_c_NE(info);
		else if (ne == columnDtl_upd_func_nm_c) doDtl_upd_func_nm_c_NE(info);
		else if (ne == columnDtl_upd_srv_req_no_c) doDtl_upd_srv_req_no_c_NE(info);
		else if (ne == columnDtl_co_cd) doDtl_co_cd_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_ac_itm_grp_cd) doDtl_ac_itm_grp_cd_NE(info);
		else if (ne == columnDtl_ac_itm_grp_nm) doDtl_ac_itm_grp_nm_NE(info);
		else if (ne == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NE(info);
		else if (ne == columnDtl_gi_alloc_flg) doDtl_gi_alloc_flg_NE(info);
		else if (ne == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NE(info);
		else if (ne == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NE(info);
		else if (ne == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NE(info);
		else if (ne == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NE(info);
		else if (ne == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NE(info);
		else if (ne == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NE(info);
		else if (ne == columnDtl_wtax_rate) doDtl_wtax_rate_NE(info);
		else if (ne == columnDtl_ship_unit_cd) doDtl_ship_unit_cd_NE(info);
		else if (ne == columnDtl_ship_unit_nm) doDtl_ship_unit_nm_NE(info);
		else if (ne == columnDtl_mfg_unit_cd) doDtl_mfg_unit_cd_NE(info);
		else if (ne == columnDtl_mfg_unit_nm) doDtl_mfg_unit_nm_NE(info);
		else if (ne == columnDtl_purc_unit_cd) doDtl_purc_unit_cd_NE(info);
		else if (ne == columnDtl_purc_unit_nm) doDtl_purc_unit_nm_NE(info);
		else if (ne == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NE(info);
		else if (ne == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NE(info);
		else if (ne == columnDtl_pack_alloc_flg) doDtl_pack_alloc_flg_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_lot_mng_typ_nm) doDtl_lot_mng_typ_nm_NE(info);
		else if (ne == columnDtl_lot_no_typ) doDtl_lot_no_typ_NE(info);
		else if (ne == columnDtl_lot_no_typ_nm) doDtl_lot_no_typ_nm_NE(info);
		else if (ne == columnDtl_lot_no_ptn_cd) doDtl_lot_no_ptn_cd_NE(info);
		else if (ne == columnDtl_lot_no_ptn_nm) doDtl_lot_no_ptn_nm_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ_nm) doDtl_sublot_mng_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NE(info);
		else if (ne == columnDtl_sublot_no_typ_nm) doDtl_sublot_no_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_no_ptn_cd) doDtl_sublot_no_ptn_cd_NE(info);
		else if (ne == columnDtl_sublot_no_ptn_nm) doDtl_sublot_no_ptn_nm_NE(info);
		else if (ne == columnDtl_not_new_lot_flg) doDtl_not_new_lot_flg_NE(info);
		else if (ne == columnDtl_bp_lot_flg) doDtl_bp_lot_flg_NE(info);
		else if (ne == columnDtl_insp_bind_typ) doDtl_insp_bind_typ_NE(info);
		else if (ne == columnDtl_insp_bind_typ_nm) doDtl_insp_bind_typ_nm_NE(info);
		else if (ne == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NE(info);
		else if (ne == columnDtl_mrkt_judg_flg) doDtl_mrkt_judg_flg_NE(info);
		else if (ne == columnDtl_mrkt_judg_role_cd) doDtl_mrkt_judg_role_cd_NE(info);
		else if (ne == columnDtl_mrkt_judg_role_nm) doDtl_mrkt_judg_role_nm_NE(info);
		else if (ne == columnDtl_mrkt_judg_upd_role_cd) doDtl_mrkt_judg_upd_role_cd_NE(info);
		else if (ne == columnDtl_mrkt_judg_upd_role_nm) doDtl_mrkt_judg_upd_role_nm_NE(info);
		else if (ne == columnDtl_lmt_ctl_flg) doDtl_lmt_ctl_flg_NE(info);
		else if (ne == columnDtl_lmt_ctl_categ) doDtl_lmt_ctl_categ_NE(info);
		else if (ne == columnDtl_ship_lot_back_stop_flg) doDtl_ship_lot_back_stop_flg_NE(info);
		else if (ne == columnDtl_ship_valid_grp_cd) doDtl_ship_valid_grp_cd_NE(info);
		else if (ne == columnDtl_ship_valid_grp_nm) doDtl_ship_valid_grp_nm_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_std_cont_fctr) doDtl_std_cont_fctr_NE(info);
		else if (ne == columnDtl_cont_fctr_unit_cd) doDtl_cont_fctr_unit_cd_NE(info);
		else if (ne == columnDtl_cont_fctr_unit_nm) doDtl_cont_fctr_unit_nm_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ_nm) doDtl_cont_fctr_rnd_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ_nm) doDtl_sno1_mng_typ_nm_NE(info);
		else if (ne == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NE(info);
		else if (ne == columnDtl_rqmt_sno1_flg) doDtl_rqmt_sno1_flg_NE(info);
		else if (ne == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NE(info);
		else if (ne == columnDtl_sno1_num_typ_nm) doDtl_sno1_num_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_ptn_cd) doDtl_sno1_ptn_cd_NE(info);
		else if (ne == columnDtl_sno1_ptn_nm) doDtl_sno1_ptn_nm_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ_nm) doDtl_sno2_mng_typ_nm_NE(info);
		else if (ne == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NE(info);
		else if (ne == columnDtl_rqmt_sno2_flg) doDtl_rqmt_sno2_flg_NE(info);
		else if (ne == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NE(info);
		else if (ne == columnDtl_sno2_num_typ_nm) doDtl_sno2_num_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_ptn_cd) doDtl_sno2_ptn_cd_NE(info);
		else if (ne == columnDtl_sno2_ptn_nm) doDtl_sno2_ptn_nm_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ_nm) doDtl_sno3_mng_typ_nm_NE(info);
		else if (ne == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NE(info);
		else if (ne == columnDtl_rqmt_sno3_flg) doDtl_rqmt_sno3_flg_NE(info);
		else if (ne == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NE(info);
		else if (ne == columnDtl_sno3_num_typ_nm) doDtl_sno3_num_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_ptn_cd) doDtl_sno3_ptn_cd_NE(info);
		else if (ne == columnDtl_sno3_ptn_nm) doDtl_sno3_ptn_nm_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ_nm) doDtl_sno4_mng_typ_nm_NE(info);
		else if (ne == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NE(info);
		else if (ne == columnDtl_rqmt_sno4_flg) doDtl_rqmt_sno4_flg_NE(info);
		else if (ne == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NE(info);
		else if (ne == columnDtl_sno4_num_typ_nm) doDtl_sno4_num_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_ptn_cd) doDtl_sno4_ptn_cd_NE(info);
		else if (ne == columnDtl_sno4_ptn_nm) doDtl_sno4_ptn_nm_NE(info);
		else if (ne == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NE(info);
		else if (ne == columnDtl_mfg_inst_unit_typ) doDtl_mfg_inst_unit_typ_NE(info);
		else if (ne == columnDtl_mfg_inst_unit_typ_nm) doDtl_mfg_inst_unit_typ_nm_NE(info);
		else if (ne == columnDtl_mrp_proc_typ) doDtl_mrp_proc_typ_NE(info);
		else if (ne == columnDtl_mrp_proc_typ_nm) doDtl_mrp_proc_typ_nm_NE(info);
		else if (ne == columnDtl_rqmt_typ) doDtl_rqmt_typ_NE(info);
		else if (ne == columnDtl_rqmt_typ_nm) doDtl_rqmt_typ_nm_NE(info);
		else if (ne == columnDtl_prod_pln_typ) doDtl_prod_pln_typ_NE(info);
		else if (ne == columnDtl_prod_pln_typ_nm) doDtl_prod_pln_typ_nm_NE(info);
		else if (ne == columnDtl_dmnd_date_div_mons) doDtl_dmnd_date_div_mons_NE(info);
		else if (ne == columnDtl_alloc_margin_days) doDtl_alloc_margin_days_NE(info);
		else if (ne == columnDtl_mrp_alloc_margin_days) doDtl_mrp_alloc_margin_days_NE(info);
		else if (ne == columnDtl_mrp_opn_xfr_days) doDtl_mrp_opn_xfr_days_NE(info);
		else if (ne == columnDtl_inpt_itm_add_flg) doDtl_inpt_itm_add_flg_NE(info);
		else if (ne == columnDtl_inpt_itm_del_flg) doDtl_inpt_itm_del_flg_NE(info);
		else if (ne == columnDtl_sch_flg) doDtl_sch_flg_NE(info);
		else if (ne == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NE(info);
		else if (ne == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NE(info);
		else if (ne == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NE(info);
		else if (ne == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NE(info);
		else if (ne == columnDtl_comp_rev_at_slo_flg) doDtl_comp_rev_at_slo_flg_NE(info);
		else if (ne == columnDtl_comp_core_itm_flg) doDtl_comp_core_itm_flg_NE(info);
		else if (ne == columnDtl_itm_spec_grp_cd) doDtl_itm_spec_grp_cd_NE(info);
		else if (ne == columnDtl_itm_spec_grp_nm) doDtl_itm_spec_grp_nm_NE(info);
		else if (ne == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NE(info);
		else if (ne == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NE(info);
		else if (ne == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NE(info);
		else if (ne == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NE(info);
		else if (ne == columnDtl_slo_proc_flg) doDtl_slo_proc_flg_NE(info);
		else if (ne == columnDtl_slo_proc_typ) doDtl_slo_proc_typ_NE(info);
		else if (ne == columnDtl_slo_proc_typ_nm) doDtl_slo_proc_typ_nm_NE(info);
		else if (ne == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NE(info);
		else if (ne == columnDtl_ship_inst_typ_nm) doDtl_ship_inst_typ_nm_NE(info);
		else if (ne == columnDtl_itm_ship_grp_cd) doDtl_itm_ship_grp_cd_NE(info);
		else if (ne == columnDtl_itm_ship_grp_nm) doDtl_itm_ship_grp_nm_NE(info);
		else if (ne == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NE(info);
		else if (ne == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NE(info);
		else if (ne == columnDtl_ship_term_cd) doDtl_ship_term_cd_NE(info);
		else if (ne == columnDtl_ship_term_nm) doDtl_ship_term_nm_NE(info);
		else if (ne == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NE(info);
		else if (ne == columnDtl_exim_xpns_typ_nm) doDtl_exim_xpns_typ_nm_NE(info);
		else if (ne == columnDtl_stk_lst_flg) doDtl_stk_lst_flg_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NE(info);
		else if (ne == columnDtl_purc_upri_cng_flg) doDtl_purc_upri_cng_flg_NE(info);
		else if (ne == columnDtl_prov_upri_cng_flg) doDtl_prov_upri_cng_flg_NE(info);
		else if (ne == columnDtl_ext_sys_no_itm) doDtl_ext_sys_no_itm_NE(info);
		else if (ne == columnDtl_chng_no) doDtl_chng_no_NE(info);
		else if (ne == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NE(info);
		else if (ne == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NE(info);
		else if (ne == columnDtl_itm_alc_grp) doDtl_itm_alc_grp_NE(info);
		else if (ne == columnDtl_sls_flg) doDtl_sls_flg_NE(info);
		else if (ne == columnDtl_sls_input_flg) doDtl_sls_input_flg_NE(info);
		else if (ne == columnDtl_mfg_flg) doDtl_mfg_flg_NE(info);
		else if (ne == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NE(info);
		else if (ne == columnDtl_purc_flg) doDtl_purc_flg_NE(info);
		else if (ne == columnDtl_purc_input_flg) doDtl_purc_input_flg_NE(info);
		else if (ne == columnDtl_insp_flg) doDtl_insp_flg_NE(info);
		else if (ne == columnDtl_insp_input_flg) doDtl_insp_input_flg_NE(info);
		else if (ne == columnDtl_release_tm) doDtl_release_tm_NE(info);
		else if (ne == columnDtl_release_usr_cd) doDtl_release_usr_cd_NE(info);
		else if (ne == columnDtl_release_usr_nm) doDtl_release_usr_nm_NE(info);
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
	 * [Cnd]パネルの[tar]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_on_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[th_image_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[upd_only_com_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_only_com_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[release_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itf_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itf_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gtin_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gtin_cd_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_usr_id_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_c_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[pack_alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_new_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_new_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_categ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_categ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lot_back_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lot_back_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cont_fctr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cont_fctr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dmnd_date_div_mons]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dmnd_date_div_mons_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_alloc_margin_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_alloc_margin_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_opn_xfr_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_opn_xfr_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_add_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_add_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sch_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[comp_spec_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rev_at_slo_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rev_at_slo_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_core_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_core_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_itm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_itm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_grp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_grp_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[release_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NE(MCEventInfo info){
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
		else if (nx == Cnd_tar_Group) doCnd_tar_NX(info);
		else if (nx == Cnd_own_co_flg_off) doCnd_own_co_flg_off_NX(info);
		else if (nx == Cnd_own_co_flg_on) doCnd_own_co_flg_on_NX(info);
		else if (nx == Cnd_release_flg_off) doCnd_release_flg_off_NX(info);
		else if (nx == Cnd_release_flg_on) doCnd_release_flg_on_NX(info);
		else if (nx == Cnd_stk_mng_typ) doCnd_stk_mng_typ_NX(info);
		else if (nx == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_NX(info);
		else if (nx == Cnd_asset_mng_typ) doCnd_asset_mng_typ_NX(info);
		else if (nx == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_NX(info);
		else if (nx == Cnd_sundry_itm_flg_off) doCnd_sundry_itm_flg_off_NX(info);
		else if (nx == Cnd_sundry_itm_flg_on) doCnd_sundry_itm_flg_on_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_memo1_c) doCnd_memo1_c_NX(info);
		else if (nx == Cnd_memo2_c) doCnd_memo2_c_NX(info);
		else if (nx == Cnd_memo3_c) doCnd_memo3_c_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_th_image_flg) doCnd_th_image_flg_NX(info);
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
		else if (nx == Cnd_upd_only_com_flg) doCnd_upd_only_com_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_release_flg) doDtl_release_flg_NX(info);
		else if (nx == columnDtl_th_image_flg) doDtl_th_image_flg_NX(info);
		else if (nx == columnDtl_th_image) doDtl_th_image_NX(info);
		else if (nx == columnDtl_itm_cd) doDtl_itm_cd_NX(info);
		else if (nx == columnDtl_itm_sub1) doDtl_itm_sub1_NX(info);
		else if (nx == columnDtl_itm_sub2) doDtl_itm_sub2_NX(info);
		else if (nx == columnDtl_itm_sub3) doDtl_itm_sub3_NX(info);
		else if (nx == columnDtl_itm_nm) doDtl_itm_nm_NX(info);
		else if (nx == columnDtl_base_itm_nm) doDtl_base_itm_nm_NX(info);
		else if (nx == columnDtl_base_itm_alt_nm1) doDtl_base_itm_alt_nm1_NX(info);
		else if (nx == columnDtl_base_itm_alt_nm2) doDtl_base_itm_alt_nm2_NX(info);
		else if (nx == columnDtl_base_itm_alt_nm3) doDtl_base_itm_alt_nm3_NX(info);
		else if (nx == columnDtl_base_itm_alt_nm4) doDtl_base_itm_alt_nm4_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_stk_mng_typ_nm) doDtl_stk_mng_typ_nm_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_unit_nm) doDtl_unit_nm_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_rnd_typ) doDtl_rnd_typ_NX(info);
		else if (nx == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_dim_unit_cd) doDtl_dim_unit_cd_NX(info);
		else if (nx == columnDtl_dim_unit_nm) doDtl_dim_unit_nm_NX(info);
		else if (nx == columnDtl_dim) doDtl_dim_NX(info);
		else if (nx == columnDtl_wt_unit_cd) doDtl_wt_unit_cd_NX(info);
		else if (nx == columnDtl_wt_unit_nm) doDtl_wt_unit_nm_NX(info);
		else if (nx == columnDtl_wt) doDtl_wt_NX(info);
		else if (nx == columnDtl_conts_unit_cd) doDtl_conts_unit_cd_NX(info);
		else if (nx == columnDtl_conts_unit_nm) doDtl_conts_unit_nm_NX(info);
		else if (nx == columnDtl_conts_qty) doDtl_conts_qty_NX(info);
		else if (nx == columnDtl_unit_dim) doDtl_unit_dim_NX(info);
		else if (nx == columnDtl_unit_wt) doDtl_unit_wt_NX(info);
		else if (nx == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_NX(info);
		else if (nx == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_NX(info);
		else if (nx == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NX(info);
		else if (nx == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NX(info);
		else if (nx == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NX(info);
		else if (nx == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NX(info);
		else if (nx == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NX(info);
		else if (nx == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NX(info);
		else if (nx == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NX(info);
		else if (nx == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NX(info);
		else if (nx == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NX(info);
		else if (nx == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NX(info);
		else if (nx == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NX(info);
		else if (nx == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NX(info);
		else if (nx == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NX(info);
		else if (nx == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NX(info);
		else if (nx == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NX(info);
		else if (nx == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NX(info);
		else if (nx == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NX(info);
		else if (nx == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NX(info);
		else if (nx == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NX(info);
		else if (nx == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NX(info);
		else if (nx == columnDtl_hs_cd) doDtl_hs_cd_NX(info);
		else if (nx == columnDtl_hs_nm) doDtl_hs_nm_NX(info);
		else if (nx == columnDtl_jan_typ) doDtl_jan_typ_NX(info);
		else if (nx == columnDtl_jan_typ_nm) doDtl_jan_typ_nm_NX(info);
		else if (nx == columnDtl_jan_cd) doDtl_jan_cd_NX(info);
		else if (nx == columnDtl_itf_cd) doDtl_itf_cd_NX(info);
		else if (nx == columnDtl_gtin_cd) doDtl_gtin_cd_NX(info);
		else if (nx == columnDtl_memo1_c) doDtl_memo1_c_NX(info);
		else if (nx == columnDtl_memo2_c) doDtl_memo2_c_NX(info);
		else if (nx == columnDtl_memo3_c) doDtl_memo3_c_NX(info);
		else if (nx == columnDtl_ins_usr_id_c) doDtl_ins_usr_id_c_NX(info);
		else if (nx == columnDtl_ins_usr_nm_c) doDtl_ins_usr_nm_c_NX(info);
		else if (nx == columnDtl_ins_ts_c) doDtl_ins_ts_c_NX(info);
		else if (nx == columnDtl_ins_func_id_c) doDtl_ins_func_id_c_NX(info);
		else if (nx == columnDtl_ins_func_nm_c) doDtl_ins_func_nm_c_NX(info);
		else if (nx == columnDtl_upd_cntr_c) doDtl_upd_cntr_c_NX(info);
		else if (nx == columnDtl_upd_usr_id_c) doDtl_upd_usr_id_c_NX(info);
		else if (nx == columnDtl_upd_usr_nm_c) doDtl_upd_usr_nm_c_NX(info);
		else if (nx == columnDtl_upd_ts_c) doDtl_upd_ts_c_NX(info);
		else if (nx == columnDtl_upd_func_id_c) doDtl_upd_func_id_c_NX(info);
		else if (nx == columnDtl_upd_func_nm_c) doDtl_upd_func_nm_c_NX(info);
		else if (nx == columnDtl_upd_srv_req_no_c) doDtl_upd_srv_req_no_c_NX(info);
		else if (nx == columnDtl_co_cd) doDtl_co_cd_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_ac_itm_grp_cd) doDtl_ac_itm_grp_cd_NX(info);
		else if (nx == columnDtl_ac_itm_grp_nm) doDtl_ac_itm_grp_nm_NX(info);
		else if (nx == columnDtl_minus_stk_flg) doDtl_minus_stk_flg_NX(info);
		else if (nx == columnDtl_gi_alloc_flg) doDtl_gi_alloc_flg_NX(info);
		else if (nx == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NX(info);
		else if (nx == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NX(info);
		else if (nx == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NX(info);
		else if (nx == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NX(info);
		else if (nx == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NX(info);
		else if (nx == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NX(info);
		else if (nx == columnDtl_wtax_rate) doDtl_wtax_rate_NX(info);
		else if (nx == columnDtl_ship_unit_cd) doDtl_ship_unit_cd_NX(info);
		else if (nx == columnDtl_ship_unit_nm) doDtl_ship_unit_nm_NX(info);
		else if (nx == columnDtl_mfg_unit_cd) doDtl_mfg_unit_cd_NX(info);
		else if (nx == columnDtl_mfg_unit_nm) doDtl_mfg_unit_nm_NX(info);
		else if (nx == columnDtl_purc_unit_cd) doDtl_purc_unit_cd_NX(info);
		else if (nx == columnDtl_purc_unit_nm) doDtl_purc_unit_nm_NX(info);
		else if (nx == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_NX(info);
		else if (nx == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_NX(info);
		else if (nx == columnDtl_pack_alloc_flg) doDtl_pack_alloc_flg_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_lot_mng_typ_nm) doDtl_lot_mng_typ_nm_NX(info);
		else if (nx == columnDtl_lot_no_typ) doDtl_lot_no_typ_NX(info);
		else if (nx == columnDtl_lot_no_typ_nm) doDtl_lot_no_typ_nm_NX(info);
		else if (nx == columnDtl_lot_no_ptn_cd) doDtl_lot_no_ptn_cd_NX(info);
		else if (nx == columnDtl_lot_no_ptn_nm) doDtl_lot_no_ptn_nm_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ_nm) doDtl_sublot_mng_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_NX(info);
		else if (nx == columnDtl_sublot_no_typ_nm) doDtl_sublot_no_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_no_ptn_cd) doDtl_sublot_no_ptn_cd_NX(info);
		else if (nx == columnDtl_sublot_no_ptn_nm) doDtl_sublot_no_ptn_nm_NX(info);
		else if (nx == columnDtl_not_new_lot_flg) doDtl_not_new_lot_flg_NX(info);
		else if (nx == columnDtl_bp_lot_flg) doDtl_bp_lot_flg_NX(info);
		else if (nx == columnDtl_insp_bind_typ) doDtl_insp_bind_typ_NX(info);
		else if (nx == columnDtl_insp_bind_typ_nm) doDtl_insp_bind_typ_nm_NX(info);
		else if (nx == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NX(info);
		else if (nx == columnDtl_mrkt_judg_flg) doDtl_mrkt_judg_flg_NX(info);
		else if (nx == columnDtl_mrkt_judg_role_cd) doDtl_mrkt_judg_role_cd_NX(info);
		else if (nx == columnDtl_mrkt_judg_role_nm) doDtl_mrkt_judg_role_nm_NX(info);
		else if (nx == columnDtl_mrkt_judg_upd_role_cd) doDtl_mrkt_judg_upd_role_cd_NX(info);
		else if (nx == columnDtl_mrkt_judg_upd_role_nm) doDtl_mrkt_judg_upd_role_nm_NX(info);
		else if (nx == columnDtl_lmt_ctl_flg) doDtl_lmt_ctl_flg_NX(info);
		else if (nx == columnDtl_lmt_ctl_categ) doDtl_lmt_ctl_categ_NX(info);
		else if (nx == columnDtl_ship_lot_back_stop_flg) doDtl_ship_lot_back_stop_flg_NX(info);
		else if (nx == columnDtl_ship_valid_grp_cd) doDtl_ship_valid_grp_cd_NX(info);
		else if (nx == columnDtl_ship_valid_grp_nm) doDtl_ship_valid_grp_nm_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_std_cont_fctr) doDtl_std_cont_fctr_NX(info);
		else if (nx == columnDtl_cont_fctr_unit_cd) doDtl_cont_fctr_unit_cd_NX(info);
		else if (nx == columnDtl_cont_fctr_unit_nm) doDtl_cont_fctr_unit_nm_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ_nm) doDtl_cont_fctr_rnd_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ_nm) doDtl_sno1_mng_typ_nm_NX(info);
		else if (nx == columnDtl_slo_sno1_flg) doDtl_slo_sno1_flg_NX(info);
		else if (nx == columnDtl_rqmt_sno1_flg) doDtl_rqmt_sno1_flg_NX(info);
		else if (nx == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_NX(info);
		else if (nx == columnDtl_sno1_num_typ_nm) doDtl_sno1_num_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_ptn_cd) doDtl_sno1_ptn_cd_NX(info);
		else if (nx == columnDtl_sno1_ptn_nm) doDtl_sno1_ptn_nm_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ_nm) doDtl_sno2_mng_typ_nm_NX(info);
		else if (nx == columnDtl_slo_sno2_flg) doDtl_slo_sno2_flg_NX(info);
		else if (nx == columnDtl_rqmt_sno2_flg) doDtl_rqmt_sno2_flg_NX(info);
		else if (nx == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_NX(info);
		else if (nx == columnDtl_sno2_num_typ_nm) doDtl_sno2_num_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_ptn_cd) doDtl_sno2_ptn_cd_NX(info);
		else if (nx == columnDtl_sno2_ptn_nm) doDtl_sno2_ptn_nm_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ_nm) doDtl_sno3_mng_typ_nm_NX(info);
		else if (nx == columnDtl_slo_sno3_flg) doDtl_slo_sno3_flg_NX(info);
		else if (nx == columnDtl_rqmt_sno3_flg) doDtl_rqmt_sno3_flg_NX(info);
		else if (nx == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_NX(info);
		else if (nx == columnDtl_sno3_num_typ_nm) doDtl_sno3_num_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_ptn_cd) doDtl_sno3_ptn_cd_NX(info);
		else if (nx == columnDtl_sno3_ptn_nm) doDtl_sno3_ptn_nm_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ_nm) doDtl_sno4_mng_typ_nm_NX(info);
		else if (nx == columnDtl_slo_sno4_flg) doDtl_slo_sno4_flg_NX(info);
		else if (nx == columnDtl_rqmt_sno4_flg) doDtl_rqmt_sno4_flg_NX(info);
		else if (nx == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_NX(info);
		else if (nx == columnDtl_sno4_num_typ_nm) doDtl_sno4_num_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_ptn_cd) doDtl_sno4_ptn_cd_NX(info);
		else if (nx == columnDtl_sno4_ptn_nm) doDtl_sno4_ptn_nm_NX(info);
		else if (nx == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NX(info);
		else if (nx == columnDtl_mfg_inst_unit_typ) doDtl_mfg_inst_unit_typ_NX(info);
		else if (nx == columnDtl_mfg_inst_unit_typ_nm) doDtl_mfg_inst_unit_typ_nm_NX(info);
		else if (nx == columnDtl_mrp_proc_typ) doDtl_mrp_proc_typ_NX(info);
		else if (nx == columnDtl_mrp_proc_typ_nm) doDtl_mrp_proc_typ_nm_NX(info);
		else if (nx == columnDtl_rqmt_typ) doDtl_rqmt_typ_NX(info);
		else if (nx == columnDtl_rqmt_typ_nm) doDtl_rqmt_typ_nm_NX(info);
		else if (nx == columnDtl_prod_pln_typ) doDtl_prod_pln_typ_NX(info);
		else if (nx == columnDtl_prod_pln_typ_nm) doDtl_prod_pln_typ_nm_NX(info);
		else if (nx == columnDtl_dmnd_date_div_mons) doDtl_dmnd_date_div_mons_NX(info);
		else if (nx == columnDtl_alloc_margin_days) doDtl_alloc_margin_days_NX(info);
		else if (nx == columnDtl_mrp_alloc_margin_days) doDtl_mrp_alloc_margin_days_NX(info);
		else if (nx == columnDtl_mrp_opn_xfr_days) doDtl_mrp_opn_xfr_days_NX(info);
		else if (nx == columnDtl_inpt_itm_add_flg) doDtl_inpt_itm_add_flg_NX(info);
		else if (nx == columnDtl_inpt_itm_del_flg) doDtl_inpt_itm_del_flg_NX(info);
		else if (nx == columnDtl_sch_flg) doDtl_sch_flg_NX(info);
		else if (nx == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_NX(info);
		else if (nx == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_NX(info);
		else if (nx == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_NX(info);
		else if (nx == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_NX(info);
		else if (nx == columnDtl_comp_rev_at_slo_flg) doDtl_comp_rev_at_slo_flg_NX(info);
		else if (nx == columnDtl_comp_core_itm_flg) doDtl_comp_core_itm_flg_NX(info);
		else if (nx == columnDtl_itm_spec_grp_cd) doDtl_itm_spec_grp_cd_NX(info);
		else if (nx == columnDtl_itm_spec_grp_nm) doDtl_itm_spec_grp_nm_NX(info);
		else if (nx == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_NX(info);
		else if (nx == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_NX(info);
		else if (nx == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_NX(info);
		else if (nx == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_NX(info);
		else if (nx == columnDtl_slo_proc_flg) doDtl_slo_proc_flg_NX(info);
		else if (nx == columnDtl_slo_proc_typ) doDtl_slo_proc_typ_NX(info);
		else if (nx == columnDtl_slo_proc_typ_nm) doDtl_slo_proc_typ_nm_NX(info);
		else if (nx == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NX(info);
		else if (nx == columnDtl_ship_inst_typ_nm) doDtl_ship_inst_typ_nm_NX(info);
		else if (nx == columnDtl_itm_ship_grp_cd) doDtl_itm_ship_grp_cd_NX(info);
		else if (nx == columnDtl_itm_ship_grp_nm) doDtl_itm_ship_grp_nm_NX(info);
		else if (nx == columnDtl_arr_skip_flg) doDtl_arr_skip_flg_NX(info);
		else if (nx == columnDtl_purc_dlv_slip_flg) doDtl_purc_dlv_slip_flg_NX(info);
		else if (nx == columnDtl_ship_term_cd) doDtl_ship_term_cd_NX(info);
		else if (nx == columnDtl_ship_term_nm) doDtl_ship_term_nm_NX(info);
		else if (nx == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_NX(info);
		else if (nx == columnDtl_exim_xpns_typ_nm) doDtl_exim_xpns_typ_nm_NX(info);
		else if (nx == columnDtl_stk_lst_flg) doDtl_stk_lst_flg_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_sls_upri_cng_flg) doDtl_sls_upri_cng_flg_NX(info);
		else if (nx == columnDtl_purc_upri_cng_flg) doDtl_purc_upri_cng_flg_NX(info);
		else if (nx == columnDtl_prov_upri_cng_flg) doDtl_prov_upri_cng_flg_NX(info);
		else if (nx == columnDtl_ext_sys_no_itm) doDtl_ext_sys_no_itm_NX(info);
		else if (nx == columnDtl_chng_no) doDtl_chng_no_NX(info);
		else if (nx == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_NX(info);
		else if (nx == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_NX(info);
		else if (nx == columnDtl_itm_alc_grp) doDtl_itm_alc_grp_NX(info);
		else if (nx == columnDtl_sls_flg) doDtl_sls_flg_NX(info);
		else if (nx == columnDtl_sls_input_flg) doDtl_sls_input_flg_NX(info);
		else if (nx == columnDtl_mfg_flg) doDtl_mfg_flg_NX(info);
		else if (nx == columnDtl_mfg_input_flg) doDtl_mfg_input_flg_NX(info);
		else if (nx == columnDtl_purc_flg) doDtl_purc_flg_NX(info);
		else if (nx == columnDtl_purc_input_flg) doDtl_purc_input_flg_NX(info);
		else if (nx == columnDtl_insp_flg) doDtl_insp_flg_NX(info);
		else if (nx == columnDtl_insp_input_flg) doDtl_insp_input_flg_NX(info);
		else if (nx == columnDtl_release_tm) doDtl_release_tm_NX(info);
		else if (nx == columnDtl_release_usr_cd) doDtl_release_usr_cd_NX(info);
		else if (nx == columnDtl_release_usr_nm) doDtl_release_usr_nm_NX(info);
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
	 * [Cnd]パネルの[tar]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tar_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[own_co_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_own_co_flg_on_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sundry_itm_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sundry_itm_flg_on_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[th_image_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_th_image_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[upd_only_com_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_upd_only_com_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[release_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itf_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itf_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gtin_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gtin_cd_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_usr_id_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_c_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gi_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gi_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[pack_alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_new_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_new_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_categ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_categ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_lot_back_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_lot_back_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cont_fctr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cont_fctr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dmnd_date_div_mons]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dmnd_date_div_mons_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_alloc_margin_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_alloc_margin_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_opn_xfr_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_opn_xfr_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_add_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_add_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_itm_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_itm_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sch_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[comp_spec_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_rev_at_slo_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_rev_at_slo_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_core_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_core_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_skip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_skip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_dlv_slip_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_dlv_slip_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_lst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_lst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_itm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_itm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_grp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_grp_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[release_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_NX(MCEventInfo info){
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
		else if (lc == Cnd_stk_mng_typ) doCnd_stk_mng_typ_LC(info);
		else if (lc == Cnd_stk_mng_typ_nm) doCnd_stk_mng_typ_nm_LC(info);
		else if (lc == Cnd_asset_mng_typ) doCnd_asset_mng_typ_LC(info);
		else if (lc == Cnd_asset_mng_typ_nm) doCnd_asset_mng_typ_nm_LC(info);
		else if (lc == Cnd_memo1_c) doCnd_memo1_c_LC(info);
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
		else if (lc == columnDtl_itm_cd) doDtl_itm_cd_LC(info);
		else if (lc == columnDtl_itm_sub1) doDtl_itm_sub1_LC(info);
		else if (lc == columnDtl_itm_sub2) doDtl_itm_sub2_LC(info);
		else if (lc == columnDtl_itm_sub3) doDtl_itm_sub3_LC(info);
		else if (lc == columnDtl_itm_nm) doDtl_itm_nm_LC(info);
		else if (lc == columnDtl_base_itm_nm) doDtl_base_itm_nm_LC(info);
		else if (lc == columnDtl_base_itm_alt_nm1) doDtl_base_itm_alt_nm1_LC(info);
		else if (lc == columnDtl_base_itm_alt_nm2) doDtl_base_itm_alt_nm2_LC(info);
		else if (lc == columnDtl_base_itm_alt_nm3) doDtl_base_itm_alt_nm3_LC(info);
		else if (lc == columnDtl_base_itm_alt_nm4) doDtl_base_itm_alt_nm4_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_stk_mng_typ_nm) doDtl_stk_mng_typ_nm_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ_nm) doDtl_asset_mng_typ_nm_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_unit_nm) doDtl_unit_nm_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_rnd_typ) doDtl_rnd_typ_LC(info);
		else if (lc == columnDtl_rnd_typ_nm) doDtl_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_dim_unit_cd) doDtl_dim_unit_cd_LC(info);
		else if (lc == columnDtl_dim_unit_nm) doDtl_dim_unit_nm_LC(info);
		else if (lc == columnDtl_dim) doDtl_dim_LC(info);
		else if (lc == columnDtl_wt_unit_cd) doDtl_wt_unit_cd_LC(info);
		else if (lc == columnDtl_wt_unit_nm) doDtl_wt_unit_nm_LC(info);
		else if (lc == columnDtl_wt) doDtl_wt_LC(info);
		else if (lc == columnDtl_conts_unit_cd) doDtl_conts_unit_cd_LC(info);
		else if (lc == columnDtl_conts_unit_nm) doDtl_conts_unit_nm_LC(info);
		else if (lc == columnDtl_conts_qty) doDtl_conts_qty_LC(info);
		else if (lc == columnDtl_unit_dim) doDtl_unit_dim_LC(info);
		else if (lc == columnDtl_unit_wt) doDtl_unit_wt_LC(info);
		else if (lc == columnDtl_sls_itm_grp_cd) doDtl_sls_itm_grp_cd_LC(info);
		else if (lc == columnDtl_sls_itm_grp_nm) doDtl_sls_itm_grp_nm_LC(info);
		else if (lc == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_LC(info);
		else if (lc == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_LC(info);
		else if (lc == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_LC(info);
		else if (lc == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_LC(info);
		else if (lc == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_LC(info);
		else if (lc == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_LC(info);
		else if (lc == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_LC(info);
		else if (lc == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_LC(info);
		else if (lc == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_LC(info);
		else if (lc == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_LC(info);
		else if (lc == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_LC(info);
		else if (lc == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_LC(info);
		else if (lc == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_LC(info);
		else if (lc == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_LC(info);
		else if (lc == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_LC(info);
		else if (lc == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_LC(info);
		else if (lc == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_LC(info);
		else if (lc == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_LC(info);
		else if (lc == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_LC(info);
		else if (lc == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_LC(info);
		else if (lc == columnDtl_hs_cd) doDtl_hs_cd_LC(info);
		else if (lc == columnDtl_hs_nm) doDtl_hs_nm_LC(info);
		else if (lc == columnDtl_jan_typ) doDtl_jan_typ_LC(info);
		else if (lc == columnDtl_jan_typ_nm) doDtl_jan_typ_nm_LC(info);
		else if (lc == columnDtl_jan_cd) doDtl_jan_cd_LC(info);
		else if (lc == columnDtl_itf_cd) doDtl_itf_cd_LC(info);
		else if (lc == columnDtl_gtin_cd) doDtl_gtin_cd_LC(info);
		else if (lc == columnDtl_memo1_c) doDtl_memo1_c_LC(info);
		else if (lc == columnDtl_memo2_c) doDtl_memo2_c_LC(info);
		else if (lc == columnDtl_memo3_c) doDtl_memo3_c_LC(info);
		else if (lc == columnDtl_ins_usr_id_c) doDtl_ins_usr_id_c_LC(info);
		else if (lc == columnDtl_ins_usr_nm_c) doDtl_ins_usr_nm_c_LC(info);
		else if (lc == columnDtl_ins_ts_c) doDtl_ins_ts_c_LC(info);
		else if (lc == columnDtl_ins_func_id_c) doDtl_ins_func_id_c_LC(info);
		else if (lc == columnDtl_ins_func_nm_c) doDtl_ins_func_nm_c_LC(info);
		else if (lc == columnDtl_upd_cntr_c) doDtl_upd_cntr_c_LC(info);
		else if (lc == columnDtl_upd_usr_id_c) doDtl_upd_usr_id_c_LC(info);
		else if (lc == columnDtl_upd_usr_nm_c) doDtl_upd_usr_nm_c_LC(info);
		else if (lc == columnDtl_upd_ts_c) doDtl_upd_ts_c_LC(info);
		else if (lc == columnDtl_upd_func_id_c) doDtl_upd_func_id_c_LC(info);
		else if (lc == columnDtl_upd_func_nm_c) doDtl_upd_func_nm_c_LC(info);
		else if (lc == columnDtl_upd_srv_req_no_c) doDtl_upd_srv_req_no_c_LC(info);
		else if (lc == columnDtl_co_cd) doDtl_co_cd_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_ac_itm_grp_cd) doDtl_ac_itm_grp_cd_LC(info);
		else if (lc == columnDtl_ac_itm_grp_nm) doDtl_ac_itm_grp_nm_LC(info);
		else if (lc == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_LC(info);
		else if (lc == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_LC(info);
		else if (lc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_LC(info);
		else if (lc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_LC(info);
		else if (lc == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_LC(info);
		else if (lc == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_LC(info);
		else if (lc == columnDtl_wtax_rate) doDtl_wtax_rate_LC(info);
		else if (lc == columnDtl_ship_unit_cd) doDtl_ship_unit_cd_LC(info);
		else if (lc == columnDtl_ship_unit_nm) doDtl_ship_unit_nm_LC(info);
		else if (lc == columnDtl_mfg_unit_cd) doDtl_mfg_unit_cd_LC(info);
		else if (lc == columnDtl_mfg_unit_nm) doDtl_mfg_unit_nm_LC(info);
		else if (lc == columnDtl_purc_unit_cd) doDtl_purc_unit_cd_LC(info);
		else if (lc == columnDtl_purc_unit_nm) doDtl_purc_unit_nm_LC(info);
		else if (lc == columnDtl_pckg_unit_cd) doDtl_pckg_unit_cd_LC(info);
		else if (lc == columnDtl_pckg_unit_nm) doDtl_pckg_unit_nm_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_lot_mng_typ_nm) doDtl_lot_mng_typ_nm_LC(info);
		else if (lc == columnDtl_lot_no_typ) doDtl_lot_no_typ_LC(info);
		else if (lc == columnDtl_lot_no_typ_nm) doDtl_lot_no_typ_nm_LC(info);
		else if (lc == columnDtl_lot_no_ptn_cd) doDtl_lot_no_ptn_cd_LC(info);
		else if (lc == columnDtl_lot_no_ptn_nm) doDtl_lot_no_ptn_nm_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ_nm) doDtl_sublot_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_no_typ) doDtl_sublot_no_typ_LC(info);
		else if (lc == columnDtl_sublot_no_typ_nm) doDtl_sublot_no_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_no_ptn_cd) doDtl_sublot_no_ptn_cd_LC(info);
		else if (lc == columnDtl_sublot_no_ptn_nm) doDtl_sublot_no_ptn_nm_LC(info);
		else if (lc == columnDtl_insp_bind_typ) doDtl_insp_bind_typ_LC(info);
		else if (lc == columnDtl_insp_bind_typ_nm) doDtl_insp_bind_typ_nm_LC(info);
		else if (lc == columnDtl_mrkt_judg_role_cd) doDtl_mrkt_judg_role_cd_LC(info);
		else if (lc == columnDtl_mrkt_judg_role_nm) doDtl_mrkt_judg_role_nm_LC(info);
		else if (lc == columnDtl_mrkt_judg_upd_role_cd) doDtl_mrkt_judg_upd_role_cd_LC(info);
		else if (lc == columnDtl_mrkt_judg_upd_role_nm) doDtl_mrkt_judg_upd_role_nm_LC(info);
		else if (lc == columnDtl_lmt_ctl_categ) doDtl_lmt_ctl_categ_LC(info);
		else if (lc == columnDtl_ship_valid_grp_cd) doDtl_ship_valid_grp_cd_LC(info);
		else if (lc == columnDtl_ship_valid_grp_nm) doDtl_ship_valid_grp_nm_LC(info);
		else if (lc == columnDtl_std_cont_fctr) doDtl_std_cont_fctr_LC(info);
		else if (lc == columnDtl_cont_fctr_unit_cd) doDtl_cont_fctr_unit_cd_LC(info);
		else if (lc == columnDtl_cont_fctr_unit_nm) doDtl_cont_fctr_unit_nm_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ_nm) doDtl_cont_fctr_rnd_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ_nm) doDtl_sno1_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_num_typ) doDtl_sno1_num_typ_LC(info);
		else if (lc == columnDtl_sno1_num_typ_nm) doDtl_sno1_num_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_ptn_cd) doDtl_sno1_ptn_cd_LC(info);
		else if (lc == columnDtl_sno1_ptn_nm) doDtl_sno1_ptn_nm_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ_nm) doDtl_sno2_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_num_typ) doDtl_sno2_num_typ_LC(info);
		else if (lc == columnDtl_sno2_num_typ_nm) doDtl_sno2_num_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_ptn_cd) doDtl_sno2_ptn_cd_LC(info);
		else if (lc == columnDtl_sno2_ptn_nm) doDtl_sno2_ptn_nm_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ_nm) doDtl_sno3_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_num_typ) doDtl_sno3_num_typ_LC(info);
		else if (lc == columnDtl_sno3_num_typ_nm) doDtl_sno3_num_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_ptn_cd) doDtl_sno3_ptn_cd_LC(info);
		else if (lc == columnDtl_sno3_ptn_nm) doDtl_sno3_ptn_nm_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ_nm) doDtl_sno4_mng_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_num_typ) doDtl_sno4_num_typ_LC(info);
		else if (lc == columnDtl_sno4_num_typ_nm) doDtl_sno4_num_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_ptn_cd) doDtl_sno4_ptn_cd_LC(info);
		else if (lc == columnDtl_sno4_ptn_nm) doDtl_sno4_ptn_nm_LC(info);
		else if (lc == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_LC(info);
		else if (lc == columnDtl_mfg_inst_unit_typ) doDtl_mfg_inst_unit_typ_LC(info);
		else if (lc == columnDtl_mfg_inst_unit_typ_nm) doDtl_mfg_inst_unit_typ_nm_LC(info);
		else if (lc == columnDtl_mrp_proc_typ) doDtl_mrp_proc_typ_LC(info);
		else if (lc == columnDtl_mrp_proc_typ_nm) doDtl_mrp_proc_typ_nm_LC(info);
		else if (lc == columnDtl_rqmt_typ) doDtl_rqmt_typ_LC(info);
		else if (lc == columnDtl_rqmt_typ_nm) doDtl_rqmt_typ_nm_LC(info);
		else if (lc == columnDtl_prod_pln_typ) doDtl_prod_pln_typ_LC(info);
		else if (lc == columnDtl_prod_pln_typ_nm) doDtl_prod_pln_typ_nm_LC(info);
		else if (lc == columnDtl_dmnd_date_div_mons) doDtl_dmnd_date_div_mons_LC(info);
		else if (lc == columnDtl_alloc_margin_days) doDtl_alloc_margin_days_LC(info);
		else if (lc == columnDtl_mrp_alloc_margin_days) doDtl_mrp_alloc_margin_days_LC(info);
		else if (lc == columnDtl_mrp_opn_xfr_days) doDtl_mrp_opn_xfr_days_LC(info);
		else if (lc == columnDtl_cntry_org_cd) doDtl_cntry_org_cd_LC(info);
		else if (lc == columnDtl_cntry_org_nm) doDtl_cntry_org_nm_LC(info);
		else if (lc == columnDtl_comp_spec_typ) doDtl_comp_spec_typ_LC(info);
		else if (lc == columnDtl_comp_spec_typ_nm) doDtl_comp_spec_typ_nm_LC(info);
		else if (lc == columnDtl_itm_spec_grp_cd) doDtl_itm_spec_grp_cd_LC(info);
		else if (lc == columnDtl_itm_spec_grp_nm) doDtl_itm_spec_grp_nm_LC(info);
		else if (lc == columnDtl_sls_upri_grp_cd) doDtl_sls_upri_grp_cd_LC(info);
		else if (lc == columnDtl_sls_upri_grp_nm) doDtl_sls_upri_grp_nm_LC(info);
		else if (lc == columnDtl_bill_crryovr_times) doDtl_bill_crryovr_times_LC(info);
		else if (lc == columnDtl_pay_crryovr_times) doDtl_pay_crryovr_times_LC(info);
		else if (lc == columnDtl_slo_proc_typ) doDtl_slo_proc_typ_LC(info);
		else if (lc == columnDtl_slo_proc_typ_nm) doDtl_slo_proc_typ_nm_LC(info);
		else if (lc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_LC(info);
		else if (lc == columnDtl_ship_inst_typ_nm) doDtl_ship_inst_typ_nm_LC(info);
		else if (lc == columnDtl_itm_ship_grp_cd) doDtl_itm_ship_grp_cd_LC(info);
		else if (lc == columnDtl_itm_ship_grp_nm) doDtl_itm_ship_grp_nm_LC(info);
		else if (lc == columnDtl_ship_term_cd) doDtl_ship_term_cd_LC(info);
		else if (lc == columnDtl_ship_term_nm) doDtl_ship_term_nm_LC(info);
		else if (lc == columnDtl_exim_xpns_typ) doDtl_exim_xpns_typ_LC(info);
		else if (lc == columnDtl_exim_xpns_typ_nm) doDtl_exim_xpns_typ_nm_LC(info);
		else if (lc == columnDtl_ext_sys_no_itm) doDtl_ext_sys_no_itm_LC(info);
		else if (lc == columnDtl_chng_no) doDtl_chng_no_LC(info);
		else if (lc == columnDtl_calc_ptn_cd) doDtl_calc_ptn_cd_LC(info);
		else if (lc == columnDtl_calc_ptn_nm) doDtl_calc_ptn_nm_LC(info);
		else if (lc == columnDtl_itm_alc_grp) doDtl_itm_alc_grp_LC(info);
		else if (lc == columnDtl_release_tm) doDtl_release_tm_LC(info);
		else if (lc == columnDtl_release_usr_cd) doDtl_release_usr_cd_LC(info);
		else if (lc == columnDtl_release_usr_nm) doDtl_release_usr_nm_LC(info);
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
	 * [Cnd]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asset_mng_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_alt_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_alt_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[conts_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_conts_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hs_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hs_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jan_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jan_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itf_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itf_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gtin_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gtin_cd_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ins_usr_id_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_c_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[co_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_co_cd_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_itm_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_itm_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wtax_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wtax_rate_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_unit_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_bind_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_bind_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrkt_judg_upd_role_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrkt_judg_upd_role_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lmt_ctl_categ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lmt_ctl_categ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_valid_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_valid_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_cont_fctr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_cont_fctr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_num_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_num_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_unit_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_unit_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prod_pln_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prod_pln_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dmnd_date_div_mons]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dmnd_date_div_mons_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_alloc_margin_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_alloc_margin_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mrp_opn_xfr_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mrp_opn_xfr_days_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[comp_spec_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[comp_spec_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_comp_spec_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_crryovr_times]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_crryovr_times_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ship_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ship_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[exim_xpns_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_exim_xpns_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_itm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_itm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_grp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_grp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[release_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_release_tm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_stk_mng_typ]の作成メソッド
	 */
	public MCList getCnd_stk_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asset_mng_typ]の作成メソッド
	 */
	public MCList getCnd_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
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
	 * コンボ／リストのリスト[columnDtl_stk_mng_typ]の作成メソッド
	 */
	public MCList getDtl_stk_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asset_mng_typ]の作成メソッド
	 */
	public MCList getDtl_asset_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAssetMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_unit_cd]の作成メソッド
	 */
	public MCList getDtl_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dim_unit_cd]の作成メソッド
	 */
	public MCList getDtl_dim_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wt_unit_cd]の作成メソッド
	 */
	public MCList getDtl_wt_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_conts_unit_cd]の作成メソッド
	 */
	public MCList getDtl_conts_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_sls_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsItmGrpBtm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd1]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd2]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd3]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd4]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd5]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd6]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd7]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd8]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd9]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd10]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_hs_cd]の作成メソッド
	 */
	public MCList getDtl_hs_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getHs(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_jan_typ]の作成メソッド
	 */
	public MCList getDtl_jan_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJanTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ]の作成メソッド
	 */
	public MCList getDtl_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getDtl_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTypD(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_itm_grp_cd]の作成メソッド
	 */
	public MCList getDtl_ac_itm_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcItmGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_tax_cd]の作成メソッド
	 */
	public MCList getDtl_sls_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_tax_cd]の作成メソッド
	 */
	public MCList getDtl_purc_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prov_tax_cd]の作成メソッド
	 */
	public MCList getDtl_prov_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_unit_cd]の作成メソッド
	 */
	public MCList getDtl_ship_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_unit_cd]の作成メソッド
	 */
	public MCList getDtl_mfg_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_unit_cd]の作成メソッド
	 */
	public MCList getDtl_purc_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pckg_unit_cd]の作成メソッド
	 */
	public MCList getDtl_pckg_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_mng_typ]の作成メソッド
	 */
	public MCList getDtl_lot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_no_typ]の作成メソッド
	 */
	public MCList getDtl_lot_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_no_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_lot_no_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_mng_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSublotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_no_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_no_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_no_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_sublot_no_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_insp_bind_typ]の作成メソッド
	 */
	public MCList getDtl_insp_bind_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInspBindTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mrkt_judg_role_cd]の作成メソッド
	 */
	public MCList getDtl_mrkt_judg_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mrkt_judg_upd_role_cd]の作成メソッド
	 */
	public MCList getDtl_mrkt_judg_upd_role_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvRole(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_valid_grp_cd]の作成メソッド
	 */
	public MCList getDtl_ship_valid_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipValid(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cont_fctr_unit_cd]の作成メソッド
	 */
	public MCList getDtl_cont_fctr_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cont_fctr_rnd_typ]の作成メソッド
	 */
	public MCList getDtl_cont_fctr_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_mng_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_num_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_sno1_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_mng_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_num_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_sno2_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_mng_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_num_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_sno3_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_mng_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_num_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_num_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoNoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_sno4_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getNumPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mfg_inst_unit_typ]の作成メソッド
	 */
	public MCList getDtl_mfg_inst_unit_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMfgInstUnitTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_mrp_proc_typ]の作成メソッド
	 */
	public MCList getDtl_mrp_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMrpProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rqmt_typ]の作成メソッド
	 */
	public MCList getDtl_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prod_pln_typ]の作成メソッド
	 */
	public MCList getDtl_prod_pln_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProdPlnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cntry_org_cd]の作成メソッド
	 */
	public MCList getDtl_cntry_org_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_comp_spec_typ]の作成メソッド
	 */
	public MCList getDtl_comp_spec_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCompSpecTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_spec_grp_cd]の作成メソッド
	 */
	public MCList getDtl_itm_spec_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSpecGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_upri_grp_cd]の作成メソッド
	 */
	public MCList getDtl_sls_upri_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_slo_proc_typ]の作成メソッド
	 */
	public MCList getDtl_slo_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSloProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_inst_typ]の作成メソッド
	 */
	public MCList getDtl_ship_inst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipInstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_ship_grp_cd]の作成メソッド
	 */
	public MCList getDtl_itm_ship_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmShipGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_term_cd]の作成メソッド
	 */
	public MCList getDtl_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_exim_xpns_typ]の作成メソッド
	 */
	public MCList getDtl_exim_xpns_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getEximXpnsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ref_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_ref_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ref_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_ref_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ref_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_ref_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ref_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_ref_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_calc_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_calc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcPtn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0390.Srch01")) {
			return new MA_MABCL0390_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0390.Upd01")) {
			return new MA_MABCL0390_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0390_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0390_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0390_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0390_Srch01Bridge() {
			p_MA_MABCL0390_Srch01 = new MCParam(PDef.MA_MABCL0390_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0390_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0390.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0390.DtlR.class));

			p_MA_MABCL0390_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0390_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0390_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0390_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0390_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0390.CndR up0() {
			return (mcframe.clientMABC.MABCP0390.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0390.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0390.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0390_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0390.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0390_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0390.DtlR>)p_MA_MABCL0390_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0390_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0390_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0390_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0390_Upd01Bridge() {
			p_MA_MABCL0390_Upd01 = new MCParam(PDef.MA_MABCL0390_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0390_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0390.DtlR.class));
			param.addUpBlock(mcframe.clientMABC.MABCP0390.CndR.create());
			// Down

			p_MA_MABCL0390_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0390_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0390_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0390_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0390_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0390_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0390.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0390.DtlR>)up(0);
		}
		protected mcframe.clientMABC.MABCP0390.CndR up1() {
			return (mcframe.clientMABC.MABCP0390.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0390_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}