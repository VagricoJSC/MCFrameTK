package mcframe.clientMSBE.MSBEP2540;

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
import mcframe.clientMSBE.MSBEP2540.MSBEP_BomEx_MC.MS_MSBEL2540_Srch01Caller;

/**
 * 画面"MSBEP_BomEx"パネルクラスです。<p>
 *
 * 在庫振替実績登録画面で振替対象明細の入力を補助するために、品目の構成情報を検索する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_BomEx_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP2540";

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
	 * GR,Apply GR,0;GI,Apply GI,1 GR,入庫反映,0;GI,出庫反映,1.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_GR = null;
	public MCRadioButton Cnd_ope_GI = null;
	public MCLabel Cnd_master_dt_Label = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDateField Cnd_master_dt = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_base_qty_Label = null;
	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumberField Cnd_base_qty = null;
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	/**
	 * Copy BOM pattern 構成パタン引継ぎ.<p>
	 *
	 */
	public MCCheckBox Cnd_bom_ptn_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Explode all 全展開.<p>
	 *
	 */
	public MCButton RPnl_srch_all = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2540.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Rslt_hrrchy_p_PPanel;
	public MCColumnConfig columnRslt_extno;// [Rslt]の[hrrchy_p.extno]を[columnRslt_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_extno;// [Rslt]の[hrrchy_p.par_extno]を[columnRslt_par_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_loop_flg;// [Rslt]の[hrrchy_p.loop_flg]を[columnRslt_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_leaf_str;// [Rslt]の[hrrchy_p.leaf_str]を[columnRslt_leaf_str]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Disallow new lot input 新規ロット入力不可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_new_lot_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no_typ = null;
	/**
	 * Lot No. numbering pattern cd. ロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no_ptn_cd = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no_typ = null;
	/**
	 * Sublot No. numbering pattern cd. サブロットＮＯ発番パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no_ptn_cd = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_qty_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit base conversion qty. 取引単位基準換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_conv_qty = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_conv_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr_qty;// [Rslt]の[cont_qty_p.cont_qty]を[columnRslt_std_cont_fctr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	/**
	 * Parent order qty. 親指図数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_inst_qty = null;
	/**
	 * Child required qty. 子必要数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_rqmt_qty = null;
	/**
	 * Child fixed required qty. 子固定必要数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fxd_chd_rqmt_qty = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_st_dt = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_end_dt = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_nm = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_ctl_typ_nm = null;
	/**
	 * By-product flg. 副産品ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_byprod_flg = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_min_sno_p_PPanel;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_max_sno_p_PPanel;
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ1 = null;
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ_nm1 = null;
	public MCColumnConfig columnRslt_min_sno1;// [Rslt]の[min_sno_p.sno1]を[columnRslt_min_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_max_sno1;// [Rslt]の[max_sno_p.sno1]を[columnRslt_max_sno1]としてエイリアス定義。
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ2 = null;
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ_nm2 = null;
	public MCColumnConfig columnRslt_min_sno2;// [Rslt]の[min_sno_p.sno2]を[columnRslt_min_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_max_sno2;// [Rslt]の[max_sno_p.sno2]を[columnRslt_max_sno2]としてエイリアス定義。
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ3 = null;
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ_nm3 = null;
	public MCColumnConfig columnRslt_min_sno3;// [Rslt]の[min_sno_p.sno3]を[columnRslt_min_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_max_sno3;// [Rslt]の[max_sno_p.sno3]を[columnRslt_max_sno3]としてエイリアス定義。
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ4 = null;
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_typ_nm4 = null;
	public MCColumnConfig columnRslt_min_sno4;// [Rslt]の[min_sno_p.sno4]を[columnRslt_min_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_max_sno4;// [Rslt]の[max_sno_p.sno4]を[columnRslt_max_sno4]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
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
	 * Applied (GR) 反映（入庫）.<p>
	 *
	 */
	public MCButton Btn_accept_gr = null;
	/**
	 * Applied (GI) 反映（出庫）.<p>
	 *
	 */
	public MCButton Btn_accept_gi = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD_I]モードを表す定数 */
	public static final String UPD_I = "UPD_I";
	/** [UPD_O]モードを表す定数 */
	public static final String UPD_O = "UPD_O";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD_I, UPD_O, FIX};
	
	/** [MS_MSBEL2540_Srch01]のCallerの作成 */
	protected MSBEP_BomEx_MC.MS_MSBEL2540_Srch01Caller createMS_MSBEL2540_Srch01() {
		MSBEP_BomEx_MC.MS_MSBEL2540_Srch01Caller<MSBEP_BomEx, MS_MSBEL2540_Srch01Bridge>
		caller = ((MSBEP_BomEx_MC)this).new MS_MSBEL2540_Srch01Caller<MSBEP_BomEx, MS_MSBEL2540_Srch01Bridge>(
					(MSBEP_BomEx)this, new MS_MSBEL2540_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2540_Srch01]の呼び出し */
	protected void callMS_MSBEL2540_Srch01() {
		MCCaller caller = createMS_MSBEL2540_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2540.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2540.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2540.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2540.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2540.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2540.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2540.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2540.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2540.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2540.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2540.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2540.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_BomEx_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_BomEx_MC_A(String name) {
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
		MSBEP_BomEx_MC.jbCreateScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateTop((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateFold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateCnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateCtrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateRPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateRslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbCreateBtn((MSBEP_BomEx)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_BomEx p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_BomEx p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_BomEx p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_BomEx p) {
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
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_BomEx p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_BomEx p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_BomEx p) {
		p.Rslt_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$hrrchy_p);
		p.Rslt_hrrchy_p_PPanel.setName("Rslt.hrrchy_p");
		p.columnRslt_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnRslt_extno.addAliasName("Rslt.extno", p);
		p.columnRslt_par_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnRslt_par_extno.addAliasName("Rslt.par_extno", p);
		p.columnRslt_loop_flg = p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnRslt_loop_flg.addAliasName("Rslt.loop_flg", p);
		p.columnRslt_leaf_str = p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnRslt_leaf_str.addAliasName("Rslt.leaf_str", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$trd_unit_qty_p);
		p.Rslt_trd_unit_qty_p_PPanel.setName("Rslt.trd_unit_qty_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$cont_qty_p);
		p.Rslt_cont_qty_p_PPanel.setName("Rslt.cont_qty_p");
		p.columnRslt_std_cont_fctr_qty = p.Rslt_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_std_cont_fctr_qty.addAliasName("Rslt.std_cont_fctr_qty", p);
		p.Rslt_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$cont_fctr_unit_p);
		p.Rslt_cont_fctr_unit_p_PPanel.setName("Rslt.cont_fctr_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_min_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$min_sno_p);
		p.Rslt_min_sno_p_PPanel.setName("Rslt.min_sno_p");
		p.Rslt_max_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBE.MSBEP2540.RsltR.$max_sno_p);
		p.Rslt_max_sno_p_PPanel.setName("Rslt.max_sno_p");
		p.columnRslt_min_sno1 = p.Rslt_min_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_min_sno1.addAliasName("Rslt.min_sno1", p);
		p.columnRslt_max_sno1 = p.Rslt_max_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_max_sno1.addAliasName("Rslt.max_sno1", p);
		p.columnRslt_min_sno2 = p.Rslt_min_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_min_sno2.addAliasName("Rslt.min_sno2", p);
		p.columnRslt_max_sno2 = p.Rslt_max_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_max_sno2.addAliasName("Rslt.max_sno2", p);
		p.columnRslt_min_sno3 = p.Rslt_min_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_min_sno3.addAliasName("Rslt.min_sno3", p);
		p.columnRslt_max_sno3 = p.Rslt_max_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_max_sno3.addAliasName("Rslt.max_sno3", p);
		p.columnRslt_min_sno4 = p.Rslt_min_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_min_sno4.addAliasName("Rslt.min_sno4", p);
		p.columnRslt_max_sno4 = p.Rslt_max_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_max_sno4.addAliasName("Rslt.max_sno4", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_BomEx p) {
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
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","loc_cd","loc_nm","wg_cd","wg_nm");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","loc_cd","loc_nm","wg_cd","wg_nm");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","loc_cd","loc_nm","wg_cd","wg_nm");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","loc_cd","loc_nm","wg_cd","wg_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm");

		}
		return Cnd_loc_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
	}
	
	
	/** [Rslt_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_unit_cd_p = null;

	/**
	 * [Rslt_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_unit_cd_ListPutter() {
		if (Rslt_trd_unit_cd_p == null) {
			Rslt_trd_unit_cd_p = createRslt_trd_unit_cd_ListPutter(columnRslt_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_dec_place","trd_unit_conv_base_qty","trd_unit_conv_qty");

		}
		return Rslt_trd_unit_cd_p;
	}
	
	
	/** [Rslt_base_unit_cd_ListPutter]の定義 */
	private MCListPutter Rslt_base_unit_cd_p = null;

	/**
	 * [Rslt_base_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_base_unit_cd_ListPutter() {
		if (Rslt_base_unit_cd_p == null) {
			Rslt_base_unit_cd_p = createRslt_base_unit_cd_ListPutter(columnRslt_base_unit_cd, "base_unit_cd");

		}
		return Rslt_base_unit_cd_p;
	}
	
	
	/** [Rslt_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_alt_grp_cd_p = null;

	/**
	 * [Rslt_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_alt_grp_cd_ListPutter() {
		if (Rslt_alt_grp_cd_p == null) {
			Rslt_alt_grp_cd_p = createRslt_alt_grp_cd_ListPutter(columnRslt_alt_grp_cd, "alt_grp_cd");

		}
		return Rslt_alt_grp_cd_p;
	}
	
	
	/** [Rslt_sno_typ1_ListPutter]の定義 */
	private MCListPutter Rslt_sno_typ1_p = null;

	/**
	 * [Rslt_sno_typ1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sno_typ1_ListPutter() {
		if (Rslt_sno_typ1_p == null) {
			Rslt_sno_typ1_p = createRslt_sno_typ1_ListPutter(columnRslt_sno_typ1, "sno_typ1");

		}
		return Rslt_sno_typ1_p;
	}
	
	
	/** [Rslt_sno_typ2_ListPutter]の定義 */
	private MCListPutter Rslt_sno_typ2_p = null;

	/**
	 * [Rslt_sno_typ2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sno_typ2_ListPutter() {
		if (Rslt_sno_typ2_p == null) {
			Rslt_sno_typ2_p = createRslt_sno_typ2_ListPutter(columnRslt_sno_typ2, "sno_typ2");

		}
		return Rslt_sno_typ2_p;
	}
	
	
	/** [Rslt_sno_typ3_ListPutter]の定義 */
	private MCListPutter Rslt_sno_typ3_p = null;

	/**
	 * [Rslt_sno_typ3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sno_typ3_ListPutter() {
		if (Rslt_sno_typ3_p == null) {
			Rslt_sno_typ3_p = createRslt_sno_typ3_ListPutter(columnRslt_sno_typ3, "sno_typ3");

		}
		return Rslt_sno_typ3_p;
	}
	
	
	/** [Rslt_sno_typ4_ListPutter]の定義 */
	private MCListPutter Rslt_sno_typ4_p = null;

	/**
	 * [Rslt_sno_typ4_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sno_typ4_ListPutter() {
		if (Rslt_sno_typ4_p == null) {
			Rslt_sno_typ4_p = createRslt_sno_typ4_ListPutter(columnRslt_sno_typ4, "sno_typ4");

		}
		return Rslt_sno_typ4_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_BomEx create(){
		MSBEP_BomEx p = new MSBEP_BomEx();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_BomEx create(String name){
		MSBEP_BomEx p = new MSBEP_BomEx(name);
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
		MSBEP_BomEx_MC.jbfInitScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitTop((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitFold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitCnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitCtrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitRPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitRslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbfInitBtn((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitTop((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitFold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitCnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitCtrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitRPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitRslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.jbInitBtn((MSBEP_BomEx)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_GR = p.beansFactory.createRadioButton("Cnd.ope_GR");
		p.Cnd_ope_GI = p.beansFactory.createRadioButton("Cnd.ope_GI");
		p.Cnd_master_dt_Label = p.beansFactory.createLabel("Cnd.master_dt_Label");
		p.Cnd_master_dt = p.beansFactory.createDateField("Cnd.master_dt");
		p.Cnd_master_dt.setLabel(p.Cnd_master_dt_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextComboBox("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_base_qty_Label = p.beansFactory.createLabel("Cnd.base_qty_Label");
		p.Cnd_base_qty = p.beansFactory.createNumberField("Cnd.base_qty");
		p.Cnd_base_qty.setLabel(p.Cnd_base_qty_Label);
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_bom_ptn_flg = p.beansFactory.createCheckBox("Cnd.bom_ptn_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_all = p.beansFactory.createButton("RPnl.srch_all", "srch");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_not_new_lot_flg = p.beansFactory.createTableColumn("Rslt.not_new_lot_flg", MCColumnType.CHECK);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_lot_no_typ = p.beansFactory.createTableColumn("Rslt.lot_no_typ", MCColumnType.TEXT);
		p.columnRslt_lot_no_ptn_cd = p.beansFactory.createTableColumn("Rslt.lot_no_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_no_typ = p.beansFactory.createTableColumn("Rslt.sublot_no_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_no_ptn_cd = p.beansFactory.createTableColumn("Rslt.sublot_no_ptn_cd", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_conv_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_conv_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_par_inst_qty = p.beansFactory.createTableColumn("Rslt.par_inst_qty", MCColumnType.NUMBER);
		p.columnRslt_chd_rqmt_qty = p.beansFactory.createTableColumn("Rslt.chd_rqmt_qty", MCColumnType.NUMBER);
		p.columnRslt_fxd_chd_rqmt_qty = p.beansFactory.createTableColumn("Rslt.fxd_chd_rqmt_qty", MCColumnType.NUMBER);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_st_dt = p.beansFactory.createTableColumn("Rslt.st_dt", MCColumnType.DATE);
		p.columnRslt_end_dt = p.beansFactory.createTableColumn("Rslt.end_dt", MCColumnType.DATE);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_alt_grp_nm = p.beansFactory.createTableColumn("Rslt.alt_grp_nm", MCColumnType.TEXT);
		p.columnRslt_alloc_ctl_typ = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ", MCColumnType.TEXT);
		p.columnRslt_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Rslt.alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnRslt_byprod_flg = p.beansFactory.createTableColumn("Rslt.byprod_flg", MCColumnType.CHECK);
		p.columnRslt_sno_typ1 = p.beansFactory.createTableColumn("Rslt.sno_typ1", MCColumnType.TEXT_COMBO);
		p.columnRslt_sno_typ_nm1 = p.beansFactory.createTableColumn("Rslt.sno_typ_nm1", MCColumnType.TEXT);
		p.columnRslt_sno_typ2 = p.beansFactory.createTableColumn("Rslt.sno_typ2", MCColumnType.TEXT_COMBO);
		p.columnRslt_sno_typ_nm2 = p.beansFactory.createTableColumn("Rslt.sno_typ_nm2", MCColumnType.TEXT);
		p.columnRslt_sno_typ3 = p.beansFactory.createTableColumn("Rslt.sno_typ3", MCColumnType.TEXT_COMBO);
		p.columnRslt_sno_typ_nm3 = p.beansFactory.createTableColumn("Rslt.sno_typ_nm3", MCColumnType.TEXT);
		p.columnRslt_sno_typ4 = p.beansFactory.createTableColumn("Rslt.sno_typ4", MCColumnType.TEXT_COMBO);
		p.columnRslt_sno_typ_nm4 = p.beansFactory.createTableColumn("Rslt.sno_typ_nm4", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_accept_gr = p.beansFactory.createButton("Btn.accept_gr");
		p.Btn_accept_gi = p.beansFactory.createButton("Btn.accept_gi");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_GR);
		p.Cnd_ope_GR.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_GR);
		p.ScreenOpePanel.add(p.Cnd_ope_GR);
		p.Cnd_ope_GR.setNextBeans(p.Cnd_ope_GI);
		p.Cnd_ope_GI.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_GI);
		p.ScreenOpePanel.add(p.Cnd_ope_GI);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.ope_META);
		p.CndPanel.add(p.Cnd_master_dt_Label);
		p.CndPanel.add(p.Cnd_master_dt);
		p.CndPanel.setLastBeans(p.Cnd_master_dt);
		p.Cnd_master_dt.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_master_dt.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.master_dt_META);
		p.Cnd_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_loc_cd,p.Cnd_loc_nm,p.Cnd_wg_cd,p.Cnd_wg_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_loc_cd,p.Cnd_loc_nm,p.Cnd_wg_cd,p.Cnd_wg_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_sub3,p.Cnd_itm_nm,p.Cnd_loc_cd,p.Cnd_loc_nm,p.Cnd_wg_cd,p.Cnd_wg_nm);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_loc_cd,p.Cnd_loc_nm,p.Cnd_wg_cd,p.Cnd_wg_nm);
		p.Cnd_loc_cd.setListType(MCListType.STRICT);
		p.Cnd_loc_cd.setLinkBeans(p.Cnd_loc_nm,p.Cnd_wg_cd,p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.loc_cd_META);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.loc_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_base_qty);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_base_qty_Label);
		p.CndPanel.add(p.Cnd_base_qty);
		p.Cnd_base_qty.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_base_qty.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.base_qty_META);
		p.Cnd_bom_ptn.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_bom_ptn_flg);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_bom_ptn_flg);
		p.Cnd_bom_ptn_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2540.CndR.bom_ptn_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_all.setIcon("SEARCH");
		p.RPnl_srch_all.setFunctionKey(MCFunctionKey.F3);
		p.RPnlPanel.add(p.RPnl_srch_all);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_all);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_BomEx p) {
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
	protected static void jbInitBtn(MSBEP_BomEx p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_accept_gr);
		p.Btn_accept_gr.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept_gr);
		p.Btn_accept_gr.setNextBeans(p.Btn_accept_gi);
		p.Btn_accept_gi.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_accept_gi);
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
		MSBEP_BomEx_MC.mcInitScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitTop((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitFold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitCnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitCtrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitRPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitRslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.mcInitBtn((MSBEP_BomEx)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_BomEx_MC.statusInitSRCH_ScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Top((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Fold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Cnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Ctrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_RPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Rslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitSRCH_Btn((MSBEP_BomEx)this);

		// [UPD_I]ステータスのモードの設定
		MSBEP_BomEx_MC.statusInitUPD__I_ScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Top((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Fold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Cnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Ctrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_RPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Rslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__I_Btn((MSBEP_BomEx)this);

		// [UPD_O]ステータスのモードの設定
		MSBEP_BomEx_MC.statusInitUPD__O_ScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Top((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Fold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Cnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Ctrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_RPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Rslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitUPD__O_Btn((MSBEP_BomEx)this);

		// [FIX]ステータスのモードの設定
		MSBEP_BomEx_MC.statusInitFIX_ScreenOpe((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Top((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Fold((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Cnd((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Ctrl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_RPnl((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Rslt((MSBEP_BomEx)this);
		MSBEP_BomEx_MC.statusInitFIX_Btn((MSBEP_BomEx)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_BomEx p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_BomEx p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_BomEx p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_BomEx p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_GR.addAllListener(p);
		p.Cnd_ope_GI.addAllListener(p);
		p.Cnd_master_dt.setListListener(p);
		p.Cnd_master_dt.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_base_qty.setListListener(p);
		p.Cnd_base_qty.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_bom_ptn_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_BomEx p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_BomEx p) {
		p.RPnl_srch_all.addAllListener(p);
		p.RPnl_srch_all.setAPMethodName("doRPnl_srch_all");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_BomEx p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_not_new_lot_flg.addAllListener(p);
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_lot_no_typ.addAllListener(p);
		p.columnRslt_lot_no_typ.setListListener(p);
		p.columnRslt_lot_no_ptn_cd.addAllListener(p);
		p.columnRslt_lot_no_ptn_cd.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sublot_no_typ.addAllListener(p);
		p.columnRslt_sublot_no_typ.setListListener(p);
		p.columnRslt_sublot_no_ptn_cd.addAllListener(p);
		p.columnRslt_sublot_no_ptn_cd.setListListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_base_qty.setListListener(p);
		p.columnRslt_trd_unit_conv_qty.addAllListener(p);
		p.columnRslt_trd_unit_conv_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_conv_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_conv_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_par_inst_qty.addAllListener(p);
		p.columnRslt_par_inst_qty.setListListener(p);
		p.columnRslt_chd_rqmt_qty.addAllListener(p);
		p.columnRslt_chd_rqmt_qty.setListListener(p);
		p.columnRslt_fxd_chd_rqmt_qty.addAllListener(p);
		p.columnRslt_fxd_chd_rqmt_qty.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_st_dt.addAllListener(p);
		p.columnRslt_st_dt.setListListener(p);
		p.columnRslt_end_dt.addAllListener(p);
		p.columnRslt_end_dt.setListListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_grp_nm.addAllListener(p);
		p.columnRslt_alt_grp_nm.setListListener(p);
		p.columnRslt_alloc_ctl_typ.addAllListener(p);
		p.columnRslt_alloc_ctl_typ.setListListener(p);
		p.columnRslt_alloc_ctl_typ_nm.addAllListener(p);
		p.columnRslt_alloc_ctl_typ_nm.setListListener(p);
		p.columnRslt_byprod_flg.addAllListener(p);
		p.columnRslt_sno_typ1.addAllListener(p);
		p.columnRslt_sno_typ1.setListListener(p);
		p.columnRslt_sno_typ_nm1.addAllListener(p);
		p.columnRslt_sno_typ_nm1.setListListener(p);
		p.columnRslt_sno_typ2.addAllListener(p);
		p.columnRslt_sno_typ2.setListListener(p);
		p.columnRslt_sno_typ_nm2.addAllListener(p);
		p.columnRslt_sno_typ_nm2.setListListener(p);
		p.columnRslt_sno_typ3.addAllListener(p);
		p.columnRslt_sno_typ3.setListListener(p);
		p.columnRslt_sno_typ_nm3.addAllListener(p);
		p.columnRslt_sno_typ_nm3.setListListener(p);
		p.columnRslt_sno_typ4.addAllListener(p);
		p.columnRslt_sno_typ4.setListListener(p);
		p.columnRslt_sno_typ_nm4.addAllListener(p);
		p.columnRslt_sno_typ_nm4.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_BomEx p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_accept_gr.addAllListener(p);
		p.Btn_accept_gr.setAPMethodName("doBtn_accept_gr");
		p.Btn_accept_gi.addAllListener(p);
		p.Btn_accept_gi.setAPMethodName("doBtn_accept_gi");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_BomEx p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_BomEx p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_BomEx p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_BomEx p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_master_dt.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_base_qty.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_BomEx p){

	}

	/**
	 * [SRCH]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RPnl(MSBEP_BomEx p){
		p.RPnl_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_BomEx p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_not_new_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_ptn_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_par_inst_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_chd_rqmt_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_fxd_chd_rqmt_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_byprod_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_min_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_max_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_sno_typ1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm4.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_BomEx p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_accept_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_accept_gi.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_ScreenOpe(MSBEP_BomEx p){

	}

	/**
	 * [UPD_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Top(MSBEP_BomEx p){

	}

	/**
	 * [UPD_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Fold(MSBEP_BomEx p){

	}

	/**
	 * [UPD_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Cnd(MSBEP_BomEx p){
		p.Cnd_ope_Group.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Cnd_master_dt.putMode(p, UPD_I, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, UPD_I, MCMode.REQUIRED);
		p.Cnd_loc_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Cnd_base_qty.putMode(p, UPD_I, MCMode.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, UPD_I, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, UPD_I, MCMode.REQUIRED);

	}

	/**
	 * [UPD_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Ctrl(MSBEP_BomEx p){

	}

	/**
	 * [UPD_I]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_RPnl(MSBEP_BomEx p){
		p.RPnl_srch_all.putMode(p, UPD_I, MCMode.ENABLE);

	}

	/**
	 * [UPD_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Rslt(MSBEP_BomEx p){
		p.columnRslt_check.putMode(p, UPD_I, MCMode.REQUIRED);
		p.Rslt_hrrchy_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_not_new_lot_flg.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_lot_no_ptn_cd.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_ptn_cd.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD_I, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_rnd_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_I, MCMode.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_par_inst_qty.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_chd_rqmt_qty.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_fxd_chd_rqmt_qty.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_byprod_flg.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.Rslt_min_sno_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_max_sno_p_PPanel.putStatus(UPD_I, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_sno_typ1.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm1.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ2.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm2.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ3.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm3.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ4.putMode(p, UPD_I, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm4.putMode(p, UPD_I, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__I_Btn(MSBEP_BomEx p){
		p.Btn_select_all.putMode(p, UPD_I, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_I, MCMode.ENABLE);
		p.Btn_accept_gr.putMode(p, UPD_I, MCMode.ENABLE);
		p.Btn_accept_gi.putMode(p, UPD_I, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_O]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_ScreenOpe(MSBEP_BomEx p){

	}

	/**
	 * [UPD_O]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Top(MSBEP_BomEx p){

	}

	/**
	 * [UPD_O]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Fold(MSBEP_BomEx p){

	}

	/**
	 * [UPD_O]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Cnd(MSBEP_BomEx p){
		p.Cnd_ope_Group.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Cnd_master_dt.putMode(p, UPD_O, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, UPD_O, MCMode.REQUIRED);
		p.Cnd_loc_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Cnd_base_qty.putMode(p, UPD_O, MCMode.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, UPD_O, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, UPD_O, MCMode.REQUIRED);

	}

	/**
	 * [UPD_O]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Ctrl(MSBEP_BomEx p){

	}

	/**
	 * [UPD_O]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_RPnl(MSBEP_BomEx p){
		p.RPnl_srch_all.putMode(p, UPD_O, MCMode.ENABLE);

	}

	/**
	 * [UPD_O]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Rslt(MSBEP_BomEx p){
		p.columnRslt_check.putMode(p, UPD_O, MCMode.REQUIRED);
		p.Rslt_hrrchy_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_not_new_lot_flg.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_lot_no_ptn_cd.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_ptn_cd.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, UPD_O, MCMode.REQUIRED);
		p.columnRslt_trd_unit_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_trd_unit_dec_place.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_rnd_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_par_inst_qty.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_chd_rqmt_qty.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_fxd_chd_rqmt_qty.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_byprod_flg.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.Rslt_min_sno_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_max_sno_p_PPanel.putStatus(UPD_O, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_sno_typ1.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm1.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ2.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm2.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ3.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm3.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ4.putMode(p, UPD_O, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm4.putMode(p, UPD_O, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_O]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__O_Btn(MSBEP_BomEx p){
		p.Btn_select_all.putMode(p, UPD_O, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_O, MCMode.ENABLE);
		p.Btn_accept_gr.putMode(p, UPD_O, MCMode.INVISIBLE);
		p.Btn_accept_gi.putMode(p, UPD_O, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MSBEP_BomEx p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MSBEP_BomEx p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MSBEP_BomEx p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MSBEP_BomEx p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_master_dt.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_loc_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_base_qty.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bom_ptn_flg.putMode(p, FIX, MCMode.REQUIRED);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MSBEP_BomEx p){

	}

	/**
	 * [FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RPnl(MSBEP_BomEx p){
		p.RPnl_srch_all.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rslt(MSBEP_BomEx p){
		p.columnRslt_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_hrrchy_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_not_new_lot_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_lot_no_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_lot_no_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sublot_no_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_trd_unit_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_base_qty.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_conv_qty.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_base_unit_conv_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_cont_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_fctr_unit_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.columnRslt_par_inst_qty.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_chd_rqmt_qty.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_fxd_chd_rqmt_qty.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_alt_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_alloc_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_byprod_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_min_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Rslt_max_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_sno_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnRslt_sno_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MSBEP_BomEx p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_accept_gr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_accept_gi.putMode(p, FIX, MCMode.DISABLE);

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
		MSBEP_BomEx_MC.setTableConfigRslt((MSBEP_BomEx)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_BomEx p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addTable(p.Rslt_hrrchy_p_PPanel.HrrchyTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_not_new_lot_flg.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.not_new_lot_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_new_lot_flg);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_lot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.lot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no_typ);
		p.columnRslt_lot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.lot_no_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no_ptn_cd);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sublot_no_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sublot_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no_typ);
		p.columnRslt_sublot_no_ptn_cd.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sublot_no_ptn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no_ptn_cd);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_dec_place,p.columnRslt_trd_unit_conv_base_qty,p.columnRslt_trd_unit_conv_qty);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.trd_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_base_qty);
		p.columnRslt_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.trd_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_conv_qty);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_conv_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.base_unit_conv_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_conv_rnd_typ);
		p.RsltTable.addTable(p.Rslt_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.columnRslt_par_inst_qty.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.par_inst_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_inst_qty);
		p.columnRslt_chd_rqmt_qty.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.chd_rqmt_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_rqmt_qty);
		p.columnRslt_fxd_chd_rqmt_qty.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.fxd_chd_rqmt_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fxd_chd_rqmt_qty);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_st_dt.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.st_dt_META);
		p.columnRslt_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_st_dt);
		p.columnRslt_end_dt.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.end_dt_META);
		p.columnRslt_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_end_dt);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_grp_nm.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.alt_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_nm);
		p.columnRslt_alloc_ctl_typ.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.alloc_ctl_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ);
		p.columnRslt_alloc_ctl_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.alloc_ctl_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_ctl_typ_nm);
		p.columnRslt_byprod_flg.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.byprod_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_byprod_flg);
		p.RsltTable.addTable(p.Rslt_min_sno_p_PPanel.SnoTable);
		p.RsltTable.addTable(p.Rslt_max_sno_p_PPanel.SnoTable);
		p.columnRslt_sno_typ1.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ1);
		p.columnRslt_sno_typ_nm1.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ_nm1);
		p.columnRslt_sno_typ2.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ2);
		p.columnRslt_sno_typ_nm2.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ_nm2);
		p.columnRslt_sno_typ3.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ3);
		p.columnRslt_sno_typ_nm3.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ_nm3);
		p.columnRslt_sno_typ4.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ4);
		p.columnRslt_sno_typ_nm4.setMeta(mcframe.clientMSBE.MSBEP2540.RsltR.sno_typ_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_typ_nm4);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
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
		Cnd_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
		columnRslt_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_unit_cd.getListConfig().setPutter(getRslt_trd_unit_cd_ListPutter());
		columnRslt_base_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_base_unit_cd.getListConfig().setPutter(getRslt_base_unit_cd_ListPutter());
		columnRslt_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_alt_grp_cd.getListConfig().setPutter(getRslt_alt_grp_cd_ListPutter());
		columnRslt_sno_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sno_typ1.getListConfig().setPutter(getRslt_sno_typ1_ListPutter());
		columnRslt_sno_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sno_typ2.getListConfig().setPutter(getRslt_sno_typ2_ListPutter());
		columnRslt_sno_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sno_typ3.getListConfig().setPutter(getRslt_sno_typ3_ListPutter());
		columnRslt_sno_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sno_typ4.getListConfig().setPutter(getRslt_sno_typ4_ListPutter());
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
	 * この画面を[UPD_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_IStatus() {
		status = UPD_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_O]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_OStatus() {
		status = UPD_O;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD_I.equals(status)) {
			setUPD_IStatus();
		}
		else if (UPD_O.equals(status)) {
			setUPD_OStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtl");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmDtlSub3");
		return lp;
	}

	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlBomPtn");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Rslt_base_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_base_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_sno_typ1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sno_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_sno_typ2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sno_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_sno_typ3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sno_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Rslt_sno_typ4_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sno_typ4_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
		if(combo == columnRslt_trd_unit_cd) return getRslt_trd_unit_cd(row, info);
		if(combo == columnRslt_base_unit_cd) return getRslt_base_unit_cd(row, info);
		if(combo == columnRslt_alt_grp_cd) return getRslt_alt_grp_cd(row, info);
		if(combo == columnRslt_sno_typ1) return getRslt_sno_typ1(row, info);
		if(combo == columnRslt_sno_typ2) return getRslt_sno_typ2(row, info);
		if(combo == columnRslt_sno_typ3) return getRslt_sno_typ3(row, info);
		if(combo == columnRslt_sno_typ4) return getRslt_sno_typ4(row, info);
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
		else if (ap == RPnl_srch_all) doRPnl_srch_all(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_accept_gr) doBtn_accept_gr(info);
		else if (ap == Btn_accept_gi) doBtn_accept_gi(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept_gr(MCEventInfo info);

	/**
	 * [Btn]パネルの[accept_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_accept_gi(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_master_dt) return doCnd_master_dt_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_base_qty) return doCnd_base_qty_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_bom_ptn_flg) return doCnd_bom_ptn_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_not_new_lot_flg) return doRslt_not_new_lot_flg_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_lot_no_typ) return doRslt_lot_no_typ_VC(info);
		if (vc == columnRslt_lot_no_ptn_cd) return doRslt_lot_no_ptn_cd_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_no_typ) return doRslt_sublot_no_typ_VC(info);
		if (vc == columnRslt_sublot_no_ptn_cd) return doRslt_sublot_no_ptn_cd_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_conv_base_qty) return doRslt_trd_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_trd_unit_conv_qty) return doRslt_trd_unit_conv_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_conv_rnd_typ) return doRslt_base_unit_conv_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_par_inst_qty) return doRslt_par_inst_qty_VC(info);
		if (vc == columnRslt_chd_rqmt_qty) return doRslt_chd_rqmt_qty_VC(info);
		if (vc == columnRslt_fxd_chd_rqmt_qty) return doRslt_fxd_chd_rqmt_qty_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_st_dt) return doRslt_st_dt_VC(info);
		if (vc == columnRslt_end_dt) return doRslt_end_dt_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_grp_nm) return doRslt_alt_grp_nm_VC(info);
		if (vc == columnRslt_alloc_ctl_typ) return doRslt_alloc_ctl_typ_VC(info);
		if (vc == columnRslt_alloc_ctl_typ_nm) return doRslt_alloc_ctl_typ_nm_VC(info);
		if (vc == columnRslt_byprod_flg) return doRslt_byprod_flg_VC(info);
		if (vc == columnRslt_sno_typ1) return doRslt_sno_typ1_VC(info);
		if (vc == columnRslt_sno_typ_nm1) return doRslt_sno_typ_nm1_VC(info);
		if (vc == columnRslt_sno_typ2) return doRslt_sno_typ2_VC(info);
		if (vc == columnRslt_sno_typ_nm2) return doRslt_sno_typ_nm2_VC(info);
		if (vc == columnRslt_sno_typ3) return doRslt_sno_typ3_VC(info);
		if (vc == columnRslt_sno_typ_nm3) return doRslt_sno_typ_nm3_VC(info);
		if (vc == columnRslt_sno_typ4) return doRslt_sno_typ4_VC(info);
		if (vc == columnRslt_sno_typ_nm4) return doRslt_sno_typ_nm4_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[not_new_lot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_new_lot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_inst_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_inst_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_rqmt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_rqmt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fxd_chd_rqmt_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fxd_chd_rqmt_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_byprod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_typ_nm4_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_master_dt) doCnd_master_dt_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_base_qty) doCnd_base_qty_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_not_new_lot_flg) doRslt_not_new_lot_flg_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_lot_no_typ) doRslt_lot_no_typ_NC(info);
		else if (nc == columnRslt_lot_no_ptn_cd) doRslt_lot_no_ptn_cd_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NC(info);
		else if (nc == columnRslt_sublot_no_ptn_cd) doRslt_sublot_no_ptn_cd_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_conv_rnd_typ) doRslt_base_unit_conv_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_par_inst_qty) doRslt_par_inst_qty_NC(info);
		else if (nc == columnRslt_chd_rqmt_qty) doRslt_chd_rqmt_qty_NC(info);
		else if (nc == columnRslt_fxd_chd_rqmt_qty) doRslt_fxd_chd_rqmt_qty_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_st_dt) doRslt_st_dt_NC(info);
		else if (nc == columnRslt_end_dt) doRslt_end_dt_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NC(info);
		else if (nc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnRslt_byprod_flg) doRslt_byprod_flg_NC(info);
		else if (nc == columnRslt_sno_typ1) doRslt_sno_typ1_NC(info);
		else if (nc == columnRslt_sno_typ_nm1) doRslt_sno_typ_nm1_NC(info);
		else if (nc == columnRslt_sno_typ2) doRslt_sno_typ2_NC(info);
		else if (nc == columnRslt_sno_typ_nm2) doRslt_sno_typ_nm2_NC(info);
		else if (nc == columnRslt_sno_typ3) doRslt_sno_typ3_NC(info);
		else if (nc == columnRslt_sno_typ_nm3) doRslt_sno_typ_nm3_NC(info);
		else if (nc == columnRslt_sno_typ4) doRslt_sno_typ4_NC(info);
		else if (nc == columnRslt_sno_typ_nm4) doRslt_sno_typ_nm4_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_new_lot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_new_lot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_rqmt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_rqmt_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_chd_rqmt_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_chd_rqmt_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_byprod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_master_dt) doCnd_master_dt_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_base_qty) doCnd_base_qty_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_not_new_lot_flg) doRslt_not_new_lot_flg_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_lot_no_typ) doRslt_lot_no_typ_NE(info);
		else if (ne == columnRslt_lot_no_ptn_cd) doRslt_lot_no_ptn_cd_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NE(info);
		else if (ne == columnRslt_sublot_no_ptn_cd) doRslt_sublot_no_ptn_cd_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_conv_rnd_typ) doRslt_base_unit_conv_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_par_inst_qty) doRslt_par_inst_qty_NE(info);
		else if (ne == columnRslt_chd_rqmt_qty) doRslt_chd_rqmt_qty_NE(info);
		else if (ne == columnRslt_fxd_chd_rqmt_qty) doRslt_fxd_chd_rqmt_qty_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_st_dt) doRslt_st_dt_NE(info);
		else if (ne == columnRslt_end_dt) doRslt_end_dt_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NE(info);
		else if (ne == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnRslt_byprod_flg) doRslt_byprod_flg_NE(info);
		else if (ne == columnRslt_sno_typ1) doRslt_sno_typ1_NE(info);
		else if (ne == columnRslt_sno_typ_nm1) doRslt_sno_typ_nm1_NE(info);
		else if (ne == columnRslt_sno_typ2) doRslt_sno_typ2_NE(info);
		else if (ne == columnRslt_sno_typ_nm2) doRslt_sno_typ_nm2_NE(info);
		else if (ne == columnRslt_sno_typ3) doRslt_sno_typ3_NE(info);
		else if (ne == columnRslt_sno_typ_nm3) doRslt_sno_typ_nm3_NE(info);
		else if (ne == columnRslt_sno_typ4) doRslt_sno_typ4_NE(info);
		else if (ne == columnRslt_sno_typ_nm4) doRslt_sno_typ_nm4_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_new_lot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_new_lot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_rqmt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_rqmt_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_chd_rqmt_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_chd_rqmt_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_byprod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_master_dt) doCnd_master_dt_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_base_qty) doCnd_base_qty_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_bom_ptn_flg) doCnd_bom_ptn_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_not_new_lot_flg) doRslt_not_new_lot_flg_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_lot_no_typ) doRslt_lot_no_typ_NX(info);
		else if (nx == columnRslt_lot_no_ptn_cd) doRslt_lot_no_ptn_cd_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_NX(info);
		else if (nx == columnRslt_sublot_no_ptn_cd) doRslt_sublot_no_ptn_cd_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_conv_rnd_typ) doRslt_base_unit_conv_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_par_inst_qty) doRslt_par_inst_qty_NX(info);
		else if (nx == columnRslt_chd_rqmt_qty) doRslt_chd_rqmt_qty_NX(info);
		else if (nx == columnRslt_fxd_chd_rqmt_qty) doRslt_fxd_chd_rqmt_qty_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_st_dt) doRslt_st_dt_NX(info);
		else if (nx == columnRslt_end_dt) doRslt_end_dt_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_NX(info);
		else if (nx == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnRslt_byprod_flg) doRslt_byprod_flg_NX(info);
		else if (nx == columnRslt_sno_typ1) doRslt_sno_typ1_NX(info);
		else if (nx == columnRslt_sno_typ_nm1) doRslt_sno_typ_nm1_NX(info);
		else if (nx == columnRslt_sno_typ2) doRslt_sno_typ2_NX(info);
		else if (nx == columnRslt_sno_typ_nm2) doRslt_sno_typ_nm2_NX(info);
		else if (nx == columnRslt_sno_typ3) doRslt_sno_typ3_NX(info);
		else if (nx == columnRslt_sno_typ_nm3) doRslt_sno_typ_nm3_NX(info);
		else if (nx == columnRslt_sno_typ4) doRslt_sno_typ4_NX(info);
		else if (nx == columnRslt_sno_typ_nm4) doRslt_sno_typ_nm4_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[not_new_lot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_new_lot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_rqmt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_rqmt_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_chd_rqmt_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_chd_rqmt_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_byprod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_master_dt) doCnd_master_dt_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_base_qty) doCnd_base_qty_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_lot_no_typ) doRslt_lot_no_typ_LC(info);
		else if (lc == columnRslt_lot_no_ptn_cd) doRslt_lot_no_ptn_cd_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_no_typ) doRslt_sublot_no_typ_LC(info);
		else if (lc == columnRslt_sublot_no_ptn_cd) doRslt_sublot_no_ptn_cd_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_conv_base_qty) doRslt_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_trd_unit_conv_qty) doRslt_trd_unit_conv_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_conv_rnd_typ) doRslt_base_unit_conv_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_par_inst_qty) doRslt_par_inst_qty_LC(info);
		else if (lc == columnRslt_chd_rqmt_qty) doRslt_chd_rqmt_qty_LC(info);
		else if (lc == columnRslt_fxd_chd_rqmt_qty) doRslt_fxd_chd_rqmt_qty_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_st_dt) doRslt_st_dt_LC(info);
		else if (lc == columnRslt_end_dt) doRslt_end_dt_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_grp_nm) doRslt_alt_grp_nm_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ) doRslt_alloc_ctl_typ_LC(info);
		else if (lc == columnRslt_alloc_ctl_typ_nm) doRslt_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnRslt_sno_typ1) doRslt_sno_typ1_LC(info);
		else if (lc == columnRslt_sno_typ_nm1) doRslt_sno_typ_nm1_LC(info);
		else if (lc == columnRslt_sno_typ2) doRslt_sno_typ2_LC(info);
		else if (lc == columnRslt_sno_typ_nm2) doRslt_sno_typ_nm2_LC(info);
		else if (lc == columnRslt_sno_typ3) doRslt_sno_typ3_LC(info);
		else if (lc == columnRslt_sno_typ_nm3) doRslt_sno_typ_nm3_LC(info);
		else if (lc == columnRslt_sno_typ4) doRslt_sno_typ4_LC(info);
		else if (lc == columnRslt_sno_typ_nm4) doRslt_sno_typ_nm4_LC(info);
	}

	/**
	 * [Cnd]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_inst_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_inst_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_rqmt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_rqmt_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_chd_rqmt_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_chd_rqmt_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmDtlSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_unit_cd]の作成メソッド
	 */
	public MCList getRslt_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_base_unit_cd]の作成メソッド
	 */
	public MCList getRslt_base_unit_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_alt_grp_cd]の作成メソッド
	 */
	public MCList getRslt_alt_grp_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sno_typ1]の作成メソッド
	 */
	public MCList getRslt_sno_typ1(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sno_typ2]の作成メソッド
	 */
	public MCList getRslt_sno_typ2(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sno_typ3]の作成メソッド
	 */
	public MCList getRslt_sno_typ3(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sno_typ4]の作成メソッド
	 */
	public MCList getRslt_sno_typ4(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2540.Srch01")) {
			return new MS_MSBEL2540_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2540_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2540_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2540_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2540_Srch01Bridge() {
			p_MS_MSBEL2540_Srch01 = new MCParam(PDef.MS_MSBEL2540_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2540_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2540.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2540.RsltR.class));

			p_MS_MSBEL2540_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2540_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2540_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2540_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2540_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2540.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2540.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2540.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2540.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2540_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2540.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2540_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2540.RsltR>)p_MS_MSBEL2540_Srch01.getContainerParam().getDownBlock(0));
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