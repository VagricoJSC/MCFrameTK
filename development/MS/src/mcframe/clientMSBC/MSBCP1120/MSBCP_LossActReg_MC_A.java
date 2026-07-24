package mcframe.clientMSBC.MSBCP1120;

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

/**
 * 画面"MSBCP_LossActReg"パネルクラスです。<p>
 *
 * 投入ロスの内訳を入力する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_LossActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP1120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [LossAct_Hdr]ブロック関連のField定義
	public MCPanel LossAct_HdrPanel = null;
	// [LossAct_Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H LossAct_Hdr_itm_p_PPanel;
	public MCTextField LossAct_Hdr_itm_cd;	// [LossAct_Hdr]の[itm_p.itm_cd]を[LossAct_Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox LossAct_Hdr_itm_sub1;	// [LossAct_Hdr]の[itm_p.itm_sub1]を[LossAct_Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox LossAct_Hdr_itm_sub2;	// [LossAct_Hdr]の[itm_p.itm_sub2]を[LossAct_Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox LossAct_Hdr_itm_sub3;	// [LossAct_Hdr]の[itm_p.itm_sub3]を[LossAct_Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField LossAct_Hdr_itm_nm;	// [LossAct_Hdr]の[itm_p.itm_nm]を[LossAct_Hdr_itm_nm]としてエイリアス定義。
	public MCLabel LossAct_Hdr_base_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField LossAct_Hdr_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField LossAct_Hdr_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H LossAct_Hdr_inpt_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_inpt_qty;	// [LossAct_Hdr]の[inpt_qty_p.qty]を[LossAct_Hdr_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H LossAct_Hdr_loss_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_loss_qty;	// [LossAct_Hdr]の[loss_qty_p.qty]を[LossAct_Hdr_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H LossAct_Hdr_fix_loss_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_fxd_loss_qty;	// [LossAct_Hdr]の[fix_loss_qty_p.qty]を[LossAct_Hdr_fxd_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H LossAct_Hdr_cont_inpt_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_cont_inpt_qty;	// [LossAct_Hdr]の[cont_inpt_qty_p.cont_qty]を[LossAct_Hdr_cont_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H LossAct_Hdr_cont_loss_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_cont_loss_qty;	// [LossAct_Hdr]の[cont_loss_qty_p.cont_qty]を[LossAct_Hdr_cont_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H LossAct_Hdr_cont_fix_loss_qty_p_PPanel;
	public MCNumberField LossAct_Hdr_cont_fxd_loss_qty;	// [LossAct_Hdr]の[cont_fix_loss_qty_p.cont_qty]を[LossAct_Hdr_cont_fxd_loss_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumberField LossAct_Hdr_base_dec_place = null;
	/**
	 * Base unit rounding type 基準単位換算端数処理区分.<p>
	 *
	 */
	public MCTextField LossAct_Hdr_base_unit_conv_rnd_typ = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCCheckBox LossAct_Hdr_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCTextField LossAct_Hdr_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumberField LossAct_Hdr_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H LossAct_Hdr_act_cont_fctr_p_PPanel;
	public MCNumberField LossAct_Hdr_act_cont_fctr;	// [LossAct_Hdr]の[act_cont_fctr_p.act_cont_fctr]を[LossAct_Hdr_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H LossAct_Hdr_std_cont_fctr_p_PPanel;
	public MCNumberField LossAct_Hdr_std_cont_fctr;	// [LossAct_Hdr]の[std_cont_fctr_p.std_cont_fctr]を[LossAct_Hdr_std_cont_fctr]としてエイリアス定義。
	// [LossAct_Rslt]ブロック関連のField定義
	public MCPanel LossAct_RsltPanel = null;
	public MCScrollPane LossAct_RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP1120.LossAct_RsltR> LossAct_RsltTable = null;
	// [LossAct_Rslt]ブロックの項目のField定義
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_loss_rsn_cd = null;
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_loss_rsn_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D LossAct_Rslt_loss_qty_p_PPanel;
	public MCColumnConfig columnLossAct_Rslt_loss_qty;// [LossAct_Rslt]の[loss_qty_p.qty]を[columnLossAct_Rslt_loss_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D LossAct_Rslt_cont_loss_qty_p_PPanel;
	public MCColumnConfig columnLossAct_Rslt_cont_loss_qty;// [LossAct_Rslt]の[cont_loss_qty_p.cont_qty]を[columnLossAct_Rslt_cont_loss_qty]としてエイリアス定義。
	/**
	 * Constant loss 固定ロス.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_fxd_loss_flg = null;
	/**
	 * Initial display 初期表示.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_def_disp_flg = null;
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_loss_act_no = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_intr_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_trd_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_sub_char3 = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnLossAct_Rslt_cont_fctr_dec_place = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D LossAct_Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnLossAct_Rslt_act_cont_fctr;// [LossAct_Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnLossAct_Rslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D LossAct_Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnLossAct_Rslt_std_cont_fctr;// [LossAct_Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnLossAct_Rslt_std_cont_fctr]としてエイリアス定義。
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Apply 反映する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, REF};
	
	/** [LossAct_Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP1120.LossAct_HdrR aLossAct_HdrR;
	/** [LossAct_Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP1120.LossAct_RsltR> aLossAct_RsltL;

	/**
	 * 項目コピーによってaLossAct_HdrRを設定します。
	 *
	 * aLossAct_HdrRのインスタンスは変更されません。
	 *
	 * @param row LossAct_HdrR
	 */
	public void setLossAct_HdrR(mcframe.clientMSBC.MSBCP1120.LossAct_HdrR row) {
		if (row != null) {
			MCRow.copyall(getLossAct_HdrR(), row);
		}
	}

	/**
	 * [LossAct_Hdr]ブロックのコンテナaLossAct_HdrRを返します。
	 *
	 * @return LossAct_HdrR
	 */
	public mcframe.clientMSBC.MSBCP1120.LossAct_HdrR getLossAct_HdrR() {
		return aLossAct_HdrR;
	}

	/**
	 * aLossAct_HdrRを作成します。
	 *
	 * @return LossAct_HdrR
	 */
	public mcframe.clientMSBC.MSBCP1120.LossAct_HdrR createLossAct_HdrR() {
		return mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.create();
	}

	/**
	 * コピーによってaLossAct_RsltLを設定します。
	 *
	 * aLossAct_RsltLのインスタンスは変更されません。
	 *
	 * @param dataset LossAct_RsltL
	 */
	public void setLossAct_RsltL(MCList<mcframe.clientMSBC.MSBCP1120.LossAct_RsltR> aList) {
		if (getLossAct_RsltL() != aList) {
			getLossAct_RsltL().setAll(aList);
		}
	}

	/**
	 * [LossAct_Rslt]ブロックのコンテナaLossAct_RsltLを返します。
	 *
	 * @return LossAct_RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1120.LossAct_RsltR> getLossAct_RsltL() {
		return aLossAct_RsltL;
	}

	/**
	 * aLossAct_RsltRを作成します。
	 *
	 * @return LossAct_RsltR
	 */
	public mcframe.clientMSBC.MSBCP1120.LossAct_RsltR createLossAct_RsltR() {
		return mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.create();
	}

	/**
	 * aLossAct_RsltLを作成します。
	 *
	 * @return LossAct_RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP1120.LossAct_RsltR> createLossAct_RsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.class);
	}

	/**
	 * LossAct_RsltTableを初期化します。
	 */
	protected void createLossAct_RsltTable(){
		if(LossAct_RsltTable == null){
			LossAct_RsltTable = beansFactory.createTable2("LossAct_Rslt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getLossAct_HdrR())) ret.add(getLossAct_HdrR());
		if(!MCCollectionUtil.contains(ret, getLossAct_RsltL())) ret.add(getLossAct_RsltL());
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
		if(aCnt == getLossAct_HdrR()) return "LossAct_Hdr";
		if(aCnt == getLossAct_RsltL()) return "LossAct_Rslt";
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
		if(bId.equals("LossAct_Hdr")) return getLossAct_HdrR();
		if(bId.equals("LossAct_Rslt")) return getLossAct_RsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(LossAct_HdrPanel);
		ret.add(LossAct_RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_LossActReg_MC_A() {
		aLossAct_HdrR = createLossAct_HdrR();
		aLossAct_RsltL = createLossAct_RsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_LossActReg_MC_A(String name) {
		aLossAct_HdrR = createLossAct_HdrR();
		aLossAct_RsltL = createLossAct_RsltL();
		createLossAct_RsltTable();
		LossAct_RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_LossActReg_MC.jbCreateLossAct_Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbCreateLossAct_Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbCreateBtn((MSBCP_LossActReg)this);
	}

	/**
	 * [LossAct_Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLossAct_Hdr(MSBCP_LossActReg p) {
		p.LossAct_Hdr_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getLossAct_HdrR().itm_p());
		p.LossAct_Hdr_itm_p_PPanel.setName("LossAct_Hdr.itm_p");
		p.LossAct_Hdr_itm_cd = p.LossAct_Hdr_itm_p_PPanel.Itm_itm_cd;
		p.LossAct_Hdr_itm_cd.addAliasName("LossAct_Hdr.itm_cd", p);
		p.LossAct_Hdr_itm_sub1 = p.LossAct_Hdr_itm_p_PPanel.Itm_itm_sub1;
		p.LossAct_Hdr_itm_sub1.addAliasName("LossAct_Hdr.itm_sub1", p);
		p.LossAct_Hdr_itm_sub2 = p.LossAct_Hdr_itm_p_PPanel.Itm_itm_sub2;
		p.LossAct_Hdr_itm_sub2.addAliasName("LossAct_Hdr.itm_sub2", p);
		p.LossAct_Hdr_itm_sub3 = p.LossAct_Hdr_itm_p_PPanel.Itm_itm_sub3;
		p.LossAct_Hdr_itm_sub3.addAliasName("LossAct_Hdr.itm_sub3", p);
		p.LossAct_Hdr_itm_nm = p.LossAct_Hdr_itm_p_PPanel.Itm_itm_nm;
		p.LossAct_Hdr_itm_nm.addAliasName("LossAct_Hdr.itm_nm", p);
		p.LossAct_Hdr_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getLossAct_HdrR().inpt_qty_p());
		p.LossAct_Hdr_inpt_qty_p_PPanel.setName("LossAct_Hdr.inpt_qty_p");
		p.LossAct_Hdr_inpt_qty = p.LossAct_Hdr_inpt_qty_p_PPanel.Qty_qty;
		p.LossAct_Hdr_inpt_qty.addAliasName("LossAct_Hdr.inpt_qty", p);
		p.LossAct_Hdr_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getLossAct_HdrR().loss_qty_p());
		p.LossAct_Hdr_loss_qty_p_PPanel.setName("LossAct_Hdr.loss_qty_p");
		p.LossAct_Hdr_loss_qty = p.LossAct_Hdr_loss_qty_p_PPanel.Qty_qty;
		p.LossAct_Hdr_loss_qty.addAliasName("LossAct_Hdr.loss_qty", p);
		p.LossAct_Hdr_fix_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.create(p.getLossAct_HdrR().fix_loss_qty_p());
		p.LossAct_Hdr_fix_loss_qty_p_PPanel.setName("LossAct_Hdr.fix_loss_qty_p");
		p.LossAct_Hdr_fxd_loss_qty = p.LossAct_Hdr_fix_loss_qty_p_PPanel.Qty_qty;
		p.LossAct_Hdr_fxd_loss_qty.addAliasName("LossAct_Hdr.fxd_loss_qty", p);
		p.LossAct_Hdr_cont_inpt_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getLossAct_HdrR().cont_inpt_qty_p());
		p.LossAct_Hdr_cont_inpt_qty_p_PPanel.setName("LossAct_Hdr.cont_inpt_qty_p");
		p.LossAct_Hdr_cont_inpt_qty = p.LossAct_Hdr_cont_inpt_qty_p_PPanel.ContQty_cont_qty;
		p.LossAct_Hdr_cont_inpt_qty.addAliasName("LossAct_Hdr.cont_inpt_qty", p);
		p.LossAct_Hdr_cont_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getLossAct_HdrR().cont_loss_qty_p());
		p.LossAct_Hdr_cont_loss_qty_p_PPanel.setName("LossAct_Hdr.cont_loss_qty_p");
		p.LossAct_Hdr_cont_loss_qty = p.LossAct_Hdr_cont_loss_qty_p_PPanel.ContQty_cont_qty;
		p.LossAct_Hdr_cont_loss_qty.addAliasName("LossAct_Hdr.cont_loss_qty", p);
		p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.create(p.getLossAct_HdrR().cont_fix_loss_qty_p());
		p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel.setName("LossAct_Hdr.cont_fix_loss_qty_p");
		p.LossAct_Hdr_cont_fxd_loss_qty = p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel.ContQty_cont_qty;
		p.LossAct_Hdr_cont_fxd_loss_qty.addAliasName("LossAct_Hdr.cont_fxd_loss_qty", p);
		p.LossAct_Hdr_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.create(p.getLossAct_HdrR().act_cont_fctr_p());
		p.LossAct_Hdr_act_cont_fctr_p_PPanel.setName("LossAct_Hdr.act_cont_fctr_p");
		p.LossAct_Hdr_act_cont_fctr = p.LossAct_Hdr_act_cont_fctr_p_PPanel.ActContFctr_act_cont_fctr;
		p.LossAct_Hdr_act_cont_fctr.addAliasName("LossAct_Hdr.act_cont_fctr", p);
		p.LossAct_Hdr_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.create(p.getLossAct_HdrR().std_cont_fctr_p());
		p.LossAct_Hdr_std_cont_fctr_p_PPanel.setName("LossAct_Hdr.std_cont_fctr_p");
		p.LossAct_Hdr_std_cont_fctr = p.LossAct_Hdr_std_cont_fctr_p_PPanel.StdContFctr_std_cont_fctr;
		p.LossAct_Hdr_std_cont_fctr.addAliasName("LossAct_Hdr.std_cont_fctr", p);
	}

	/**
	 * [LossAct_Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLossAct_Rslt(MSBCP_LossActReg p) {
		p.LossAct_Rslt_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.$loss_qty_p);
		p.LossAct_Rslt_loss_qty_p_PPanel.setName("LossAct_Rslt.loss_qty_p");
		p.columnLossAct_Rslt_loss_qty = p.LossAct_Rslt_loss_qty_p_PPanel.columnQty_qty;
		p.columnLossAct_Rslt_loss_qty.addAliasName("LossAct_Rslt.loss_qty", p);
		p.LossAct_Rslt_cont_loss_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.$cont_loss_qty_p);
		p.LossAct_Rslt_cont_loss_qty_p_PPanel.setName("LossAct_Rslt.cont_loss_qty_p");
		p.columnLossAct_Rslt_cont_loss_qty = p.LossAct_Rslt_cont_loss_qty_p_PPanel.columnContQty_cont_qty;
		p.columnLossAct_Rslt_cont_loss_qty.addAliasName("LossAct_Rslt.cont_loss_qty", p);
		p.LossAct_Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.$act_cont_fctr_p);
		p.LossAct_Rslt_act_cont_fctr_p_PPanel.setName("LossAct_Rslt.act_cont_fctr_p");
		p.columnLossAct_Rslt_act_cont_fctr = p.LossAct_Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnLossAct_Rslt_act_cont_fctr.addAliasName("LossAct_Rslt.act_cont_fctr", p);
		p.LossAct_Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.$std_cont_fctr_p);
		p.LossAct_Rslt_std_cont_fctr_p_PPanel.setName("LossAct_Rslt.std_cont_fctr_p");
		p.columnLossAct_Rslt_std_cont_fctr = p.LossAct_Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnLossAct_Rslt_std_cont_fctr.addAliasName("LossAct_Rslt.std_cont_fctr", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_LossActReg p) {
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


	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_LossActReg create(){
		MSBCP_LossActReg p = new MSBCP_LossActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_LossActReg create(String name){
		MSBCP_LossActReg p = new MSBCP_LossActReg(name);
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
		MSBCP_LossActReg_MC.jbfInitLossAct_Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbfInitLossAct_Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbfInitBtn((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbInitLossAct_Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbInitLossAct_Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.jbInitBtn((MSBCP_LossActReg)this);
	}

	/**
	 * [LossAct_Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLossAct_Hdr(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.LossAct_HdrPanel = p.beansFactory.createPanel("LossAct_Hdr");
		// ブロックの項目の初期化
		p.LossAct_Hdr_base_unit_cd_Label = p.beansFactory.createLabel("LossAct_Hdr.base_unit_cd_Label");
		p.LossAct_Hdr_base_unit_cd = p.beansFactory.createTextField("LossAct_Hdr.base_unit_cd");
		p.LossAct_Hdr_base_unit_cd.setLabel(p.LossAct_Hdr_base_unit_cd_Label);
		p.LossAct_Hdr_base_unit_nm = p.beansFactory.createTextField("LossAct_Hdr.base_unit_nm");
		p.LossAct_Hdr_base_dec_place = p.beansFactory.createNumberField("LossAct_Hdr.base_dec_place");
		p.LossAct_Hdr_base_unit_conv_rnd_typ = p.beansFactory.createTextField("LossAct_Hdr.base_unit_conv_rnd_typ");
		p.LossAct_Hdr_cont_fctr_flg = p.beansFactory.createCheckBox("LossAct_Hdr.cont_fctr_flg");
		p.LossAct_Hdr_cont_fctr_rnd_typ = p.beansFactory.createTextField("LossAct_Hdr.cont_fctr_rnd_typ");
		p.LossAct_Hdr_cont_fctr_dec_place = p.beansFactory.createNumberField("LossAct_Hdr.cont_fctr_dec_place");
	}

	/**
	 * [LossAct_Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLossAct_Rslt(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.LossAct_RsltPanel = p.beansFactory.createPanel("LossAct_Rslt");
		p.LossAct_RsltScrollPane = p.beansFactory.createScrollPane("LossAct_Rslt.scroll");
		p.createLossAct_RsltTable();
		// ブロックの項目の初期化
		p.columnLossAct_Rslt_loss_rsn_cd = p.beansFactory.createTableColumn("LossAct_Rslt.loss_rsn_cd", MCColumnType.TEXT);
		p.columnLossAct_Rslt_loss_rsn_nm = p.beansFactory.createTableColumn("LossAct_Rslt.loss_rsn_nm", MCColumnType.TEXT);
		p.columnLossAct_Rslt_fxd_loss_flg = p.beansFactory.createTableColumn("LossAct_Rslt.fxd_loss_flg", MCColumnType.CHECK);
		p.columnLossAct_Rslt_def_disp_flg = p.beansFactory.createTableColumn("LossAct_Rslt.def_disp_flg", MCColumnType.CHECK);
		p.columnLossAct_Rslt_loss_act_no = p.beansFactory.createTableColumn("LossAct_Rslt.loss_act_no", MCColumnType.TEXT);
		p.columnLossAct_Rslt_intr_rmrks = p.beansFactory.createTableColumn("LossAct_Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnLossAct_Rslt_trd_rmrks = p.beansFactory.createTableColumn("LossAct_Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnLossAct_Rslt_sub_char1 = p.beansFactory.createTableColumn("LossAct_Rslt.sub_char1", MCColumnType.TEXT);
		p.columnLossAct_Rslt_sub_char2 = p.beansFactory.createTableColumn("LossAct_Rslt.sub_char2", MCColumnType.TEXT);
		p.columnLossAct_Rslt_sub_char3 = p.beansFactory.createTableColumn("LossAct_Rslt.sub_char3", MCColumnType.TEXT);
		p.columnLossAct_Rslt_cont_fctr_flg = p.beansFactory.createTableColumn("LossAct_Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("LossAct_Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnLossAct_Rslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("LossAct_Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [LossAct_Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLossAct_Hdr(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.add(p.LossAct_HdrPanel);
		p.setLastBeans(p.LossAct_HdrPanel);
		p.LossAct_HdrPanel.setNextBeans(p.LossAct_RsltPanel);
		p.LossAct_HdrPanel.setValueCheck(false);
		p.LossAct_HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_itm_p_PPanel);
		p.LossAct_HdrPanel.setLastBeans(p.LossAct_Hdr_itm_p_PPanel);
		p.LossAct_Hdr_itm_p_PPanel.setNextBeans(p.LossAct_Hdr_base_unit_cd);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_base_unit_cd_Label);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_base_unit_cd);
		p.LossAct_Hdr_base_unit_cd.setNextBeans(p.LossAct_Hdr_base_unit_nm);
		p.LossAct_Hdr_base_unit_cd.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.base_unit_cd_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_base_unit_nm);
		p.LossAct_Hdr_base_unit_nm.setNextBeans(p.LossAct_Hdr_inpt_qty_p_PPanel);
		p.LossAct_Hdr_base_unit_nm.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.base_unit_nm_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_inpt_qty_p_PPanel);
		p.LossAct_Hdr_inpt_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_loss_qty_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_loss_qty_p_PPanel);
		p.LossAct_Hdr_loss_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_fix_loss_qty_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_fix_loss_qty_p_PPanel);
		p.LossAct_Hdr_fix_loss_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_cont_inpt_qty_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_inpt_qty_p_PPanel);
		p.LossAct_Hdr_cont_inpt_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_cont_loss_qty_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_loss_qty_p_PPanel);
		p.LossAct_Hdr_cont_loss_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel);
		p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel.setNextBeans(p.LossAct_Hdr_base_dec_place);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_base_dec_place);
		p.LossAct_Hdr_base_dec_place.setNextBeans(p.LossAct_Hdr_base_unit_conv_rnd_typ);
		p.LossAct_Hdr_base_dec_place.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.base_dec_place_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_base_unit_conv_rnd_typ);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.setNextBeans(p.LossAct_Hdr_cont_fctr_flg);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.base_unit_conv_rnd_typ_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_fctr_flg);
		p.LossAct_Hdr_cont_fctr_flg.setNextBeans(p.LossAct_Hdr_cont_fctr_rnd_typ);
		p.LossAct_Hdr_cont_fctr_flg.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.cont_fctr_flg_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_fctr_rnd_typ);
		p.LossAct_Hdr_cont_fctr_rnd_typ.setNextBeans(p.LossAct_Hdr_cont_fctr_dec_place);
		p.LossAct_Hdr_cont_fctr_rnd_typ.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.cont_fctr_rnd_typ_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_cont_fctr_dec_place);
		p.LossAct_Hdr_cont_fctr_dec_place.setNextBeans(p.LossAct_Hdr_act_cont_fctr_p_PPanel);
		p.LossAct_Hdr_cont_fctr_dec_place.setRow(p.getLossAct_HdrR(), mcframe.clientMSBC.MSBCP1120.LossAct_HdrR.cont_fctr_dec_place_META);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_act_cont_fctr_p_PPanel);
		p.LossAct_Hdr_act_cont_fctr_p_PPanel.setNextBeans(p.LossAct_Hdr_std_cont_fctr_p_PPanel);
		p.LossAct_HdrPanel.add(p.LossAct_Hdr_std_cont_fctr_p_PPanel);
	}

	/**
	 * [LossAct_Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLossAct_Rslt(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.add(p.LossAct_RsltPanel);
		p.LossAct_RsltPanel.setNextBeans(p.BtnPanel);
		p.LossAct_RsltPanel.add(p.LossAct_RsltScrollPane);
		p.LossAct_RsltPanel.setLastBeans(p.LossAct_RsltTable);
		p.LossAct_RsltScrollPane.setViewportView(p.LossAct_RsltTable);
		p.LossAct_RsltTable.setList(p.getLossAct_RsltL());
		p.LossAct_RsltPanel.setValueCheck(false);
		p.LossAct_RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_LossActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.BtnPanel.setLastBeans(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
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
		MSBCP_LossActReg_MC.mcInitLossAct_Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.mcInitLossAct_Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.mcInitBtn((MSBCP_LossActReg)this);

		// [UPD]ステータスのモードの設定
		MSBCP_LossActReg_MC.statusInitUPD_LossAct__Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.statusInitUPD_LossAct__Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.statusInitUPD_Btn((MSBCP_LossActReg)this);

		// [REF]ステータスのモードの設定
		MSBCP_LossActReg_MC.statusInitREF_LossAct__Hdr((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.statusInitREF_LossAct__Rslt((MSBCP_LossActReg)this);
		MSBCP_LossActReg_MC.statusInitREF_Btn((MSBCP_LossActReg)this);

	}

	/**
	 *  [LossAct_Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLossAct_Hdr(MSBCP_LossActReg p) {
		p.LossAct_Hdr_base_unit_cd.setListListener(p);
		p.LossAct_Hdr_base_unit_cd.addAllListener(p);
		p.LossAct_Hdr_base_unit_nm.setListListener(p);
		p.LossAct_Hdr_base_unit_nm.addAllListener(p);
		p.LossAct_Hdr_base_dec_place.setListListener(p);
		p.LossAct_Hdr_base_dec_place.addAllListener(p);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.setListListener(p);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.addAllListener(p);
		p.LossAct_Hdr_cont_fctr_flg.addAllListener(p);
		p.LossAct_Hdr_cont_fctr_rnd_typ.setListListener(p);
		p.LossAct_Hdr_cont_fctr_rnd_typ.addAllListener(p);
		p.LossAct_Hdr_cont_fctr_dec_place.setListListener(p);
		p.LossAct_Hdr_cont_fctr_dec_place.addAllListener(p);
	}

	/**
	 *  [LossAct_Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLossAct_Rslt(MSBCP_LossActReg p) {
		p.LossAct_RsltTable.addAllListener(p);
		p.columnLossAct_Rslt_loss_rsn_cd.addAllListener(p);
		p.columnLossAct_Rslt_loss_rsn_cd.setListListener(p);
		p.columnLossAct_Rslt_loss_rsn_nm.addAllListener(p);
		p.columnLossAct_Rslt_loss_rsn_nm.setListListener(p);
		p.columnLossAct_Rslt_fxd_loss_flg.addAllListener(p);
		p.columnLossAct_Rslt_def_disp_flg.addAllListener(p);
		p.columnLossAct_Rslt_loss_act_no.addAllListener(p);
		p.columnLossAct_Rslt_loss_act_no.setListListener(p);
		p.columnLossAct_Rslt_intr_rmrks.addAllListener(p);
		p.columnLossAct_Rslt_intr_rmrks.setListListener(p);
		p.columnLossAct_Rslt_trd_rmrks.addAllListener(p);
		p.columnLossAct_Rslt_trd_rmrks.setListListener(p);
		p.columnLossAct_Rslt_sub_char1.addAllListener(p);
		p.columnLossAct_Rslt_sub_char1.setListListener(p);
		p.columnLossAct_Rslt_sub_char2.addAllListener(p);
		p.columnLossAct_Rslt_sub_char2.setListListener(p);
		p.columnLossAct_Rslt_sub_char3.addAllListener(p);
		p.columnLossAct_Rslt_sub_char3.setListListener(p);
		p.columnLossAct_Rslt_cont_fctr_flg.addAllListener(p);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnLossAct_Rslt_cont_fctr_dec_place.addAllListener(p);
		p.columnLossAct_Rslt_cont_fctr_dec_place.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_LossActReg p) {
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 * [UPD]ステータスの[LossAct_Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LossAct__Hdr(MSBCP_LossActReg p){
		p.LossAct_Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.LossAct_Hdr_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.LossAct_Hdr_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.LossAct_Hdr_inpt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_fix_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_cont_inpt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_cont_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_base_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Hdr_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.LossAct_Hdr_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[LossAct_Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LossAct__Rslt(MSBCP_LossActReg p){
		p.columnLossAct_Rslt_loss_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_loss_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.LossAct_Rslt_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.LossAct_Rslt_cont_loss_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.ENABLE);
		p.columnLossAct_Rslt_fxd_loss_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_def_disp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_loss_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnLossAct_Rslt_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnLossAct_Rslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLossAct_Rslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLossAct_Rslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLossAct_Rslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLossAct_Rslt_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.LossAct_Rslt_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.LossAct_Rslt_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_LossActReg p){
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[LossAct_Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_LossAct__Hdr(MSBCP_LossActReg p){
		p.LossAct_Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.LossAct_Hdr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.LossAct_Hdr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.LossAct_Hdr_inpt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_fix_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0050.MAUBP_Qty_H.READ_ONLY);
		p.LossAct_Hdr_cont_inpt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_cont_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_cont_fix_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0350.MAUBP_ContQty_H.READ_ONLY);
		p.LossAct_Hdr_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Hdr_base_unit_conv_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Hdr_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Hdr_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0380.MAUBP_ActContFctr_H.INVISIBLE);
		p.LossAct_Hdr_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0370.MAUBP_StdContFctr_H.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[LossAct_Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_LossAct__Rslt(MSBCP_LossActReg p){
		p.columnLossAct_Rslt_loss_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_loss_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.LossAct_Rslt_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.LossAct_Rslt_cont_loss_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnLossAct_Rslt_fxd_loss_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_def_disp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_loss_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLossAct_Rslt_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLossAct_Rslt_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.LossAct_Rslt_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.LossAct_Rslt_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_LossActReg p){
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

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
		MSBCP_LossActReg_MC.setTableConfigLossAct_Rslt((MSBCP_LossActReg)this);
	}

	/**
	 * [LossAct_Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigLossAct_Rslt(MSBCP_LossActReg p) {
		p.columnLossAct_Rslt_loss_rsn_cd.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.loss_rsn_cd_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_loss_rsn_cd);
		p.columnLossAct_Rslt_loss_rsn_nm.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.loss_rsn_nm_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_loss_rsn_nm);
		p.LossAct_RsltTable.addTable(p.LossAct_Rslt_loss_qty_p_PPanel.QtyTable);
		p.LossAct_RsltTable.addTable(p.LossAct_Rslt_cont_loss_qty_p_PPanel.ContQtyTable);
		p.columnLossAct_Rslt_fxd_loss_flg.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.fxd_loss_flg_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_fxd_loss_flg);
		p.columnLossAct_Rslt_def_disp_flg.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.def_disp_flg_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_def_disp_flg);
		p.columnLossAct_Rslt_loss_act_no.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.loss_act_no_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_loss_act_no);
		p.columnLossAct_Rslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.intr_rmrks_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_intr_rmrks);
		p.columnLossAct_Rslt_trd_rmrks.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.trd_rmrks_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_trd_rmrks);
		p.columnLossAct_Rslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.sub_char1_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_sub_char1);
		p.columnLossAct_Rslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.sub_char2_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_sub_char2);
		p.columnLossAct_Rslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.sub_char3_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_sub_char3);
		p.columnLossAct_Rslt_cont_fctr_flg.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.cont_fctr_flg_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_cont_fctr_flg);
		p.columnLossAct_Rslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.cont_fctr_rnd_typ_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_cont_fctr_rnd_typ);
		p.columnLossAct_Rslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBC.MSBCP1120.LossAct_RsltR.cont_fctr_dec_place_META);
		p.LossAct_RsltTable.addColumnConfig(p.columnLossAct_Rslt_cont_fctr_dec_place);
		p.LossAct_RsltTable.addTable(p.LossAct_Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.LossAct_RsltTable.addTable(p.LossAct_Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == LossAct_RsltTable) return doLossAct_Rslt_VC(info);
		if (vc == LossAct_Hdr_base_unit_cd) return doLossAct_Hdr_base_unit_cd_VC(info);
		if (vc == LossAct_Hdr_base_unit_nm) return doLossAct_Hdr_base_unit_nm_VC(info);
		if (vc == LossAct_Hdr_base_dec_place) return doLossAct_Hdr_base_dec_place_VC(info);
		if (vc == LossAct_Hdr_base_unit_conv_rnd_typ) return doLossAct_Hdr_base_unit_conv_rnd_typ_VC(info);
		if (vc == LossAct_Hdr_cont_fctr_flg) return doLossAct_Hdr_cont_fctr_flg_VC(info);
		if (vc == LossAct_Hdr_cont_fctr_rnd_typ) return doLossAct_Hdr_cont_fctr_rnd_typ_VC(info);
		if (vc == LossAct_Hdr_cont_fctr_dec_place) return doLossAct_Hdr_cont_fctr_dec_place_VC(info);
		if (vc == columnLossAct_Rslt_loss_rsn_cd) return doLossAct_Rslt_loss_rsn_cd_VC(info);
		if (vc == columnLossAct_Rslt_loss_rsn_nm) return doLossAct_Rslt_loss_rsn_nm_VC(info);
		if (vc == columnLossAct_Rslt_fxd_loss_flg) return doLossAct_Rslt_fxd_loss_flg_VC(info);
		if (vc == columnLossAct_Rslt_def_disp_flg) return doLossAct_Rslt_def_disp_flg_VC(info);
		if (vc == columnLossAct_Rslt_loss_act_no) return doLossAct_Rslt_loss_act_no_VC(info);
		if (vc == columnLossAct_Rslt_intr_rmrks) return doLossAct_Rslt_intr_rmrks_VC(info);
		if (vc == columnLossAct_Rslt_trd_rmrks) return doLossAct_Rslt_trd_rmrks_VC(info);
		if (vc == columnLossAct_Rslt_sub_char1) return doLossAct_Rslt_sub_char1_VC(info);
		if (vc == columnLossAct_Rslt_sub_char2) return doLossAct_Rslt_sub_char2_VC(info);
		if (vc == columnLossAct_Rslt_sub_char3) return doLossAct_Rslt_sub_char3_VC(info);
		if (vc == columnLossAct_Rslt_cont_fctr_flg) return doLossAct_Rslt_cont_fctr_flg_VC(info);
		if (vc == columnLossAct_Rslt_cont_fctr_rnd_typ) return doLossAct_Rslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnLossAct_Rslt_cont_fctr_dec_place) return doLossAct_Rslt_cont_fctr_dec_place_VC(info);
		return true;
	}

	/**
	 * [LossAct_Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_conv_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_base_unit_conv_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Hdr_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_loss_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_loss_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[fxd_loss_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_fxd_loss_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[def_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_def_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_loss_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLossAct_Rslt_cont_fctr_dec_place_VC(MCEventInfo info){
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
		if (nc == LossAct_RsltTable) doLossAct_Rslt_NC(info);
		else if (nc == LossAct_Hdr_base_unit_cd) doLossAct_Hdr_base_unit_cd_NC(info);
		else if (nc == LossAct_Hdr_base_unit_nm) doLossAct_Hdr_base_unit_nm_NC(info);
		else if (nc == LossAct_Hdr_base_dec_place) doLossAct_Hdr_base_dec_place_NC(info);
		else if (nc == LossAct_Hdr_base_unit_conv_rnd_typ) doLossAct_Hdr_base_unit_conv_rnd_typ_NC(info);
		else if (nc == LossAct_Hdr_cont_fctr_flg) doLossAct_Hdr_cont_fctr_flg_NC(info);
		else if (nc == LossAct_Hdr_cont_fctr_rnd_typ) doLossAct_Hdr_cont_fctr_rnd_typ_NC(info);
		else if (nc == LossAct_Hdr_cont_fctr_dec_place) doLossAct_Hdr_cont_fctr_dec_place_NC(info);
		else if (nc == columnLossAct_Rslt_loss_rsn_cd) doLossAct_Rslt_loss_rsn_cd_NC(info);
		else if (nc == columnLossAct_Rslt_loss_rsn_nm) doLossAct_Rslt_loss_rsn_nm_NC(info);
		else if (nc == columnLossAct_Rslt_fxd_loss_flg) doLossAct_Rslt_fxd_loss_flg_NC(info);
		else if (nc == columnLossAct_Rslt_def_disp_flg) doLossAct_Rslt_def_disp_flg_NC(info);
		else if (nc == columnLossAct_Rslt_loss_act_no) doLossAct_Rslt_loss_act_no_NC(info);
		else if (nc == columnLossAct_Rslt_intr_rmrks) doLossAct_Rslt_intr_rmrks_NC(info);
		else if (nc == columnLossAct_Rslt_trd_rmrks) doLossAct_Rslt_trd_rmrks_NC(info);
		else if (nc == columnLossAct_Rslt_sub_char1) doLossAct_Rslt_sub_char1_NC(info);
		else if (nc == columnLossAct_Rslt_sub_char2) doLossAct_Rslt_sub_char2_NC(info);
		else if (nc == columnLossAct_Rslt_sub_char3) doLossAct_Rslt_sub_char3_NC(info);
		else if (nc == columnLossAct_Rslt_cont_fctr_flg) doLossAct_Rslt_cont_fctr_flg_NC(info);
		else if (nc == columnLossAct_Rslt_cont_fctr_rnd_typ) doLossAct_Rslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnLossAct_Rslt_cont_fctr_dec_place) doLossAct_Rslt_cont_fctr_dec_place_NC(info);
	}

	/**
	 * [LossAct_Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_conv_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_conv_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[fxd_loss_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_fxd_loss_flg_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[def_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_def_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_act_no_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == LossAct_RsltTable) doLossAct_Rslt_NE(info);
		else if (ne == LossAct_Hdr_base_unit_cd) doLossAct_Hdr_base_unit_cd_NE(info);
		else if (ne == LossAct_Hdr_base_unit_nm) doLossAct_Hdr_base_unit_nm_NE(info);
		else if (ne == LossAct_Hdr_base_dec_place) doLossAct_Hdr_base_dec_place_NE(info);
		else if (ne == LossAct_Hdr_base_unit_conv_rnd_typ) doLossAct_Hdr_base_unit_conv_rnd_typ_NE(info);
		else if (ne == LossAct_Hdr_cont_fctr_flg) doLossAct_Hdr_cont_fctr_flg_NE(info);
		else if (ne == LossAct_Hdr_cont_fctr_rnd_typ) doLossAct_Hdr_cont_fctr_rnd_typ_NE(info);
		else if (ne == LossAct_Hdr_cont_fctr_dec_place) doLossAct_Hdr_cont_fctr_dec_place_NE(info);
		else if (ne == columnLossAct_Rslt_loss_rsn_cd) doLossAct_Rslt_loss_rsn_cd_NE(info);
		else if (ne == columnLossAct_Rslt_loss_rsn_nm) doLossAct_Rslt_loss_rsn_nm_NE(info);
		else if (ne == columnLossAct_Rslt_fxd_loss_flg) doLossAct_Rslt_fxd_loss_flg_NE(info);
		else if (ne == columnLossAct_Rslt_def_disp_flg) doLossAct_Rslt_def_disp_flg_NE(info);
		else if (ne == columnLossAct_Rslt_loss_act_no) doLossAct_Rslt_loss_act_no_NE(info);
		else if (ne == columnLossAct_Rslt_intr_rmrks) doLossAct_Rslt_intr_rmrks_NE(info);
		else if (ne == columnLossAct_Rslt_trd_rmrks) doLossAct_Rslt_trd_rmrks_NE(info);
		else if (ne == columnLossAct_Rslt_sub_char1) doLossAct_Rslt_sub_char1_NE(info);
		else if (ne == columnLossAct_Rslt_sub_char2) doLossAct_Rslt_sub_char2_NE(info);
		else if (ne == columnLossAct_Rslt_sub_char3) doLossAct_Rslt_sub_char3_NE(info);
		else if (ne == columnLossAct_Rslt_cont_fctr_flg) doLossAct_Rslt_cont_fctr_flg_NE(info);
		else if (ne == columnLossAct_Rslt_cont_fctr_rnd_typ) doLossAct_Rslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnLossAct_Rslt_cont_fctr_dec_place) doLossAct_Rslt_cont_fctr_dec_place_NE(info);
	}

	/**
	 * [LossAct_Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_conv_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_conv_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[fxd_loss_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_fxd_loss_flg_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[def_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_def_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_act_no_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == LossAct_RsltTable) doLossAct_Rslt_NX(info);
		else if (nx == LossAct_Hdr_base_unit_cd) doLossAct_Hdr_base_unit_cd_NX(info);
		else if (nx == LossAct_Hdr_base_unit_nm) doLossAct_Hdr_base_unit_nm_NX(info);
		else if (nx == LossAct_Hdr_base_dec_place) doLossAct_Hdr_base_dec_place_NX(info);
		else if (nx == LossAct_Hdr_base_unit_conv_rnd_typ) doLossAct_Hdr_base_unit_conv_rnd_typ_NX(info);
		else if (nx == LossAct_Hdr_cont_fctr_flg) doLossAct_Hdr_cont_fctr_flg_NX(info);
		else if (nx == LossAct_Hdr_cont_fctr_rnd_typ) doLossAct_Hdr_cont_fctr_rnd_typ_NX(info);
		else if (nx == LossAct_Hdr_cont_fctr_dec_place) doLossAct_Hdr_cont_fctr_dec_place_NX(info);
		else if (nx == columnLossAct_Rslt_loss_rsn_cd) doLossAct_Rslt_loss_rsn_cd_NX(info);
		else if (nx == columnLossAct_Rslt_loss_rsn_nm) doLossAct_Rslt_loss_rsn_nm_NX(info);
		else if (nx == columnLossAct_Rslt_fxd_loss_flg) doLossAct_Rslt_fxd_loss_flg_NX(info);
		else if (nx == columnLossAct_Rslt_def_disp_flg) doLossAct_Rslt_def_disp_flg_NX(info);
		else if (nx == columnLossAct_Rslt_loss_act_no) doLossAct_Rslt_loss_act_no_NX(info);
		else if (nx == columnLossAct_Rslt_intr_rmrks) doLossAct_Rslt_intr_rmrks_NX(info);
		else if (nx == columnLossAct_Rslt_trd_rmrks) doLossAct_Rslt_trd_rmrks_NX(info);
		else if (nx == columnLossAct_Rslt_sub_char1) doLossAct_Rslt_sub_char1_NX(info);
		else if (nx == columnLossAct_Rslt_sub_char2) doLossAct_Rslt_sub_char2_NX(info);
		else if (nx == columnLossAct_Rslt_sub_char3) doLossAct_Rslt_sub_char3_NX(info);
		else if (nx == columnLossAct_Rslt_cont_fctr_flg) doLossAct_Rslt_cont_fctr_flg_NX(info);
		else if (nx == columnLossAct_Rslt_cont_fctr_rnd_typ) doLossAct_Rslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnLossAct_Rslt_cont_fctr_dec_place) doLossAct_Rslt_cont_fctr_dec_place_NX(info);
	}

	/**
	 * [LossAct_Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_conv_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_conv_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[fxd_loss_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_fxd_loss_flg_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[def_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_def_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_act_no_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == LossAct_Hdr_base_unit_cd) doLossAct_Hdr_base_unit_cd_LC(info);
		else if (lc == LossAct_Hdr_base_unit_nm) doLossAct_Hdr_base_unit_nm_LC(info);
		else if (lc == LossAct_Hdr_base_dec_place) doLossAct_Hdr_base_dec_place_LC(info);
		else if (lc == LossAct_Hdr_base_unit_conv_rnd_typ) doLossAct_Hdr_base_unit_conv_rnd_typ_LC(info);
		else if (lc == LossAct_Hdr_cont_fctr_rnd_typ) doLossAct_Hdr_cont_fctr_rnd_typ_LC(info);
		else if (lc == LossAct_Hdr_cont_fctr_dec_place) doLossAct_Hdr_cont_fctr_dec_place_LC(info);
		else if (lc == columnLossAct_Rslt_loss_rsn_cd) doLossAct_Rslt_loss_rsn_cd_LC(info);
		else if (lc == columnLossAct_Rslt_loss_rsn_nm) doLossAct_Rslt_loss_rsn_nm_LC(info);
		else if (lc == columnLossAct_Rslt_loss_act_no) doLossAct_Rslt_loss_act_no_LC(info);
		else if (lc == columnLossAct_Rslt_intr_rmrks) doLossAct_Rslt_intr_rmrks_LC(info);
		else if (lc == columnLossAct_Rslt_trd_rmrks) doLossAct_Rslt_trd_rmrks_LC(info);
		else if (lc == columnLossAct_Rslt_sub_char1) doLossAct_Rslt_sub_char1_LC(info);
		else if (lc == columnLossAct_Rslt_sub_char2) doLossAct_Rslt_sub_char2_LC(info);
		else if (lc == columnLossAct_Rslt_sub_char3) doLossAct_Rslt_sub_char3_LC(info);
		else if (lc == columnLossAct_Rslt_cont_fctr_rnd_typ) doLossAct_Rslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnLossAct_Rslt_cont_fctr_dec_place) doLossAct_Rslt_cont_fctr_dec_place_LC(info);
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[base_unit_conv_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_base_unit_conv_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Hdr]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Hdr_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[loss_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_loss_act_no_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [LossAct_Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLossAct_Rslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}