package mcframe.clientMAUB.MAUBP0210;

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
 * 画面"MAUBP_Dlv_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Dlv_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SUBMODULE_ID = "MAUB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MAUBP0210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Dlv]ブロック関連のField定義
	public MCPanel DlvPanel = null;
	// [Dlv]ブロックの項目のField定義
	public MCLabel Dlv_bp_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Dlv_bp_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Dlv_bp_nm = null;
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Dlv_dlv_sundry_flg = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCCheckBox Dlv_pri_prnt_flg = null;
	/**
	 * Display delivery destination address 納品先住所表示.<p>
	 *
	 */
	public MCButton Dlv_show_dtl = null;
	public MCLabel Dlv_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Dlv_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Dlv_lg_grp_nm = null;
	public MCLabel Dlv_cntry_cd_Label = null;
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public MCTextField Dlv_cntry_cd = null;
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public MCTextField Dlv_cntry_nm = null;
	public MCLabel Dlv_zip_cd_Label = null;
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public MCTextField Dlv_zip_cd = null;
	public MCLabel Dlv_addr1_Label = null;
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public MCTextField Dlv_addr1 = null;
	public MCLabel Dlv_addr2_Label = null;
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public MCTextField Dlv_addr2 = null;
	public MCLabel Dlv_addr3_Label = null;
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public MCTextField Dlv_addr3 = null;
	public MCLabel Dlv_addr4_Label = null;
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public MCTextField Dlv_addr4 = null;
	public MCLabel Dlv_tel_Label = null;
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public MCTextField Dlv_tel = null;
	public MCLabel Dlv_fax_Label = null;
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public MCTextField Dlv_fax = null;
	public MCLabel Dlv_dlv_cntct_dpt_Label = null;
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public MCTextField Dlv_dlv_cntct_dpt = null;
	public MCLabel Dlv_dlv_cntct_psn_Label = null;
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public MCTextField Dlv_dlv_cntct_psn = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [REQUIRED]モードを表す定数 */
	public static final String REQUIRED = "REQUIRED";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE, REQUIRED, READ_ONLY};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Dlv]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0210.DlvR aDlvR;

	/**
	 * 項目コピーによってaDlvRを設定します。
	 *
	 * aDlvRのインスタンスは変更されません。
	 *
	 * @param row DlvR
	 */
	public void setDlvR(mcframe.clientMAUB.MAUBP0210.DlvR row) {
		if (row != null) {
			MCRow.copyall(getDlvR(), row);
		}
	}

	/**
	 * [Dlv]ブロックのコンテナaDlvRを返します。
	 *
	 * @return DlvR
	 */
	public mcframe.clientMAUB.MAUBP0210.DlvR getDlvR() {
		return aDlvR;
	}

	/**
	 * aDlvRを作成します。
	 *
	 * @return DlvR
	 */
	public mcframe.clientMAUB.MAUBP0210.DlvR createDlvR() {
		return mcframe.clientMAUB.MAUBP0210.DlvR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getDlvR())) ret.add(getDlvR());
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
		if(aCnt == getDlvR()) return "Dlv";
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
		if(bId.equals("Dlv")) return getDlvR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(DlvPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Dlv_H_MC_A() {
		aDlvR = createDlvR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Dlv_H_MC_A(mcframe.clientMAUB.MAUBP0210.DlvR row){
		aDlvR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Dlv_H_MC.jbCreateDlv((MAUBP_Dlv_H)this);
	}

	/**
	 * [Dlv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDlv(MAUBP_Dlv_H p) {
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

	
	/** [Dlv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dlv_bp_cd_p = null;

	/**
	 * [Dlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDlv_bp_cd_ListPutter() {
		if (Dlv_bp_cd_p == null) {
			Dlv_bp_cd_p = createDlv_bp_cd_ListPutter(Dlv_bp_cd, "bp_cd", "bp_nm","dlv_sundry_flg","pri_prnt_flg","lg_grp_cd","zip_cd","addr1","addr2","addr3","addr4","cntry_cd","cntry_nm","tel","fax","dlv_cntct_dpt","dlv_cntct_psn");

		}
		return Dlv_bp_cd_p;
	}
	
	
	/** [Dlv_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Dlv_lg_grp_cd_p = null;

	/**
	 * [Dlv_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDlv_lg_grp_cd_ListPutter() {
		if (Dlv_lg_grp_cd_p == null) {
			Dlv_lg_grp_cd_p = createDlv_lg_grp_cd_ListPutter(Dlv_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Dlv_lg_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_Dlv_H create(mcframe.clientMAUB.MAUBP0210.DlvR row){
		MAUBP_Dlv_H p = new MAUBP_Dlv_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Dlv_H create(){
		MAUBP_Dlv_H p = new MAUBP_Dlv_H();
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
		MAUBP_Dlv_H_MC.jbfInitDlv((MAUBP_Dlv_H)this);
		MAUBP_Dlv_H_MC.jbInitDlv((MAUBP_Dlv_H)this);
	}

	/**
	 * [Dlv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDlv(MAUBP_Dlv_H p) {
		// ブロック関連の初期化
		p.DlvPanel = p.beansFactory.createPanel("Dlv");
		// ブロックの項目の初期化
		p.Dlv_bp_cd_Label = p.beansFactory.createLabel("Dlv.bp_cd_Label");
		p.Dlv_bp_cd = p.beansFactory.createTextField("Dlv.bp_cd");
		p.Dlv_bp_cd.setLabel(p.Dlv_bp_cd_Label);
		p.Dlv_bp_nm = p.beansFactory.createTextField("Dlv.bp_nm");
		p.Dlv_dlv_sundry_flg = p.beansFactory.createCheckBox("Dlv.dlv_sundry_flg");
		p.Dlv_pri_prnt_flg = p.beansFactory.createCheckBox("Dlv.pri_prnt_flg");
		p.Dlv_show_dtl = p.beansFactory.createButton("Dlv.show_dtl");
		p.Dlv_lg_grp_cd_Label = p.beansFactory.createLabel("Dlv.lg_grp_cd_Label");
		p.Dlv_lg_grp_cd = p.beansFactory.createTextComboBox("Dlv.lg_grp_cd");
		p.Dlv_lg_grp_cd.setLabel(p.Dlv_lg_grp_cd_Label);
		p.Dlv_lg_grp_nm = p.beansFactory.createTextField("Dlv.lg_grp_nm");
		p.Dlv_cntry_cd_Label = p.beansFactory.createLabel("Dlv.cntry_cd_Label");
		p.Dlv_cntry_cd = p.beansFactory.createTextField("Dlv.cntry_cd");
		p.Dlv_cntry_cd.setLabel(p.Dlv_cntry_cd_Label);
		p.Dlv_cntry_nm = p.beansFactory.createTextField("Dlv.cntry_nm");
		p.Dlv_zip_cd_Label = p.beansFactory.createLabel("Dlv.zip_cd_Label");
		p.Dlv_zip_cd = p.beansFactory.createTextField("Dlv.zip_cd");
		p.Dlv_zip_cd.setLabel(p.Dlv_zip_cd_Label);
		p.Dlv_addr1_Label = p.beansFactory.createLabel("Dlv.addr1_Label");
		p.Dlv_addr1 = p.beansFactory.createTextField("Dlv.addr1");
		p.Dlv_addr1.setLabel(p.Dlv_addr1_Label);
		p.Dlv_addr2_Label = p.beansFactory.createLabel("Dlv.addr2_Label");
		p.Dlv_addr2 = p.beansFactory.createTextField("Dlv.addr2");
		p.Dlv_addr2.setLabel(p.Dlv_addr2_Label);
		p.Dlv_addr3_Label = p.beansFactory.createLabel("Dlv.addr3_Label");
		p.Dlv_addr3 = p.beansFactory.createTextField("Dlv.addr3");
		p.Dlv_addr3.setLabel(p.Dlv_addr3_Label);
		p.Dlv_addr4_Label = p.beansFactory.createLabel("Dlv.addr4_Label");
		p.Dlv_addr4 = p.beansFactory.createTextField("Dlv.addr4");
		p.Dlv_addr4.setLabel(p.Dlv_addr4_Label);
		p.Dlv_tel_Label = p.beansFactory.createLabel("Dlv.tel_Label");
		p.Dlv_tel = p.beansFactory.createTextField("Dlv.tel");
		p.Dlv_tel.setLabel(p.Dlv_tel_Label);
		p.Dlv_fax_Label = p.beansFactory.createLabel("Dlv.fax_Label");
		p.Dlv_fax = p.beansFactory.createTextField("Dlv.fax");
		p.Dlv_fax.setLabel(p.Dlv_fax_Label);
		p.Dlv_dlv_cntct_dpt_Label = p.beansFactory.createLabel("Dlv.dlv_cntct_dpt_Label");
		p.Dlv_dlv_cntct_dpt = p.beansFactory.createTextField("Dlv.dlv_cntct_dpt");
		p.Dlv_dlv_cntct_dpt.setLabel(p.Dlv_dlv_cntct_dpt_Label);
		p.Dlv_dlv_cntct_psn_Label = p.beansFactory.createLabel("Dlv.dlv_cntct_psn_Label");
		p.Dlv_dlv_cntct_psn = p.beansFactory.createTextField("Dlv.dlv_cntct_psn");
		p.Dlv_dlv_cntct_psn.setLabel(p.Dlv_dlv_cntct_psn_Label);
	}

	/**
	 * [Dlv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDlv(MAUBP_Dlv_H p) {
		// ブロック関連の初期化
		p.add(p.DlvPanel);
		p.setLastBeans(p.DlvPanel);
		// ブロックの項目の初期化
		p.DlvPanel.add(p.Dlv_bp_cd_Label);
		p.DlvPanel.add(p.Dlv_bp_cd);
		p.DlvPanel.setLastBeans(p.Dlv_bp_cd);
		p.Dlv_bp_cd.setNextBeans(p.Dlv_bp_nm);
		p.Dlv_bp_cd.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.bp_cd_META);
		p.Dlv_bp_cd.addLinkBeans(p.Dlv_bp_nm,p.Dlv_dlv_sundry_flg,p.Dlv_pri_prnt_flg,p.Dlv_lg_grp_cd,p.Dlv_zip_cd,p.Dlv_addr1,p.Dlv_addr2,p.Dlv_addr3,p.Dlv_addr4,p.Dlv_cntry_cd,p.Dlv_cntry_nm,p.Dlv_tel,p.Dlv_fax,p.Dlv_dlv_cntct_dpt,p.Dlv_dlv_cntct_psn);
		p.Dlv_bp_cd.setListType(MCListType.STRICT);
		p.DlvPanel.add(p.Dlv_bp_nm);
		p.Dlv_bp_nm.setNextBeans(p.Dlv_dlv_sundry_flg);
		p.Dlv_bp_nm.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.bp_nm_META);
		p.DlvPanel.add(p.Dlv_dlv_sundry_flg);
		p.Dlv_dlv_sundry_flg.setNextBeans(p.Dlv_pri_prnt_flg);
		p.Dlv_dlv_sundry_flg.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.dlv_sundry_flg_META);
		p.DlvPanel.add(p.Dlv_pri_prnt_flg);
		p.Dlv_pri_prnt_flg.setNextBeans(p.Dlv_show_dtl);
		p.Dlv_pri_prnt_flg.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.pri_prnt_flg_META);
		p.DlvPanel.add(p.Dlv_show_dtl);
		p.Dlv_show_dtl.setNextBeans(p.Dlv_lg_grp_cd);
		p.Dlv_lg_grp_cd.setListType(MCListType.STRICT);
		p.Dlv_lg_grp_cd.setLinkBeans(p.Dlv_lg_grp_nm);
		p.DlvPanel.add(p.Dlv_lg_grp_cd_Label);
		p.DlvPanel.add(p.Dlv_lg_grp_cd);
		p.Dlv_lg_grp_cd.setNextBeans(p.Dlv_lg_grp_nm);
		p.Dlv_lg_grp_cd.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.lg_grp_cd_META);
		p.DlvPanel.add(p.Dlv_lg_grp_nm);
		p.Dlv_lg_grp_nm.setNextBeans(p.Dlv_cntry_cd);
		p.Dlv_lg_grp_nm.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.lg_grp_nm_META);
		p.DlvPanel.add(p.Dlv_cntry_cd_Label);
		p.DlvPanel.add(p.Dlv_cntry_cd);
		p.Dlv_cntry_cd.setNextBeans(p.Dlv_cntry_nm);
		p.Dlv_cntry_cd.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.cntry_cd_META);
		p.DlvPanel.add(p.Dlv_cntry_nm);
		p.Dlv_cntry_nm.setNextBeans(p.Dlv_zip_cd);
		p.Dlv_cntry_nm.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.cntry_nm_META);
		p.DlvPanel.add(p.Dlv_zip_cd_Label);
		p.DlvPanel.add(p.Dlv_zip_cd);
		p.Dlv_zip_cd.setNextBeans(p.Dlv_addr1);
		p.Dlv_zip_cd.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.zip_cd_META);
		p.DlvPanel.add(p.Dlv_addr1_Label);
		p.DlvPanel.add(p.Dlv_addr1);
		p.Dlv_addr1.setNextBeans(p.Dlv_addr2);
		p.Dlv_addr1.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.addr1_META);
		p.DlvPanel.add(p.Dlv_addr2_Label);
		p.DlvPanel.add(p.Dlv_addr2);
		p.Dlv_addr2.setNextBeans(p.Dlv_addr3);
		p.Dlv_addr2.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.addr2_META);
		p.DlvPanel.add(p.Dlv_addr3_Label);
		p.DlvPanel.add(p.Dlv_addr3);
		p.Dlv_addr3.setNextBeans(p.Dlv_addr4);
		p.Dlv_addr3.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.addr3_META);
		p.DlvPanel.add(p.Dlv_addr4_Label);
		p.DlvPanel.add(p.Dlv_addr4);
		p.Dlv_addr4.setNextBeans(p.Dlv_tel);
		p.Dlv_addr4.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.addr4_META);
		p.DlvPanel.add(p.Dlv_tel_Label);
		p.DlvPanel.add(p.Dlv_tel);
		p.Dlv_tel.setNextBeans(p.Dlv_fax);
		p.Dlv_tel.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.tel_META);
		p.DlvPanel.add(p.Dlv_fax_Label);
		p.DlvPanel.add(p.Dlv_fax);
		p.Dlv_fax.setNextBeans(p.Dlv_dlv_cntct_dpt);
		p.Dlv_fax.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.fax_META);
		p.DlvPanel.add(p.Dlv_dlv_cntct_dpt_Label);
		p.DlvPanel.add(p.Dlv_dlv_cntct_dpt);
		p.Dlv_dlv_cntct_dpt.setNextBeans(p.Dlv_dlv_cntct_psn);
		p.Dlv_dlv_cntct_dpt.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.dlv_cntct_dpt_META);
		p.DlvPanel.add(p.Dlv_dlv_cntct_psn_Label);
		p.DlvPanel.add(p.Dlv_dlv_cntct_psn);
		p.Dlv_dlv_cntct_psn.setRow(p.getDlvR(), mcframe.clientMAUB.MAUBP0210.DlvR.dlv_cntct_psn_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Dlv_H_MC.mcInitDlv((MAUBP_Dlv_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Dlv_H_MC.statusInitENABLE_Dlv((MAUBP_Dlv_H)this);

		// [REQUIRED]ステータスのモードの設定
		MAUBP_Dlv_H_MC.statusInitREQUIRED_Dlv((MAUBP_Dlv_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Dlv_H_MC.statusInitREAD__ONLY_Dlv((MAUBP_Dlv_H)this);

	}

	/**
	 *  [Dlv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDlv(MAUBP_Dlv_H p) {
		p.Dlv_bp_cd.setListListener(p);
		p.Dlv_bp_cd.addAllListener(p);
		p.Dlv_bp_nm.setListListener(p);
		p.Dlv_bp_nm.addAllListener(p);
		p.Dlv_dlv_sundry_flg.addAllListener(p);
		p.Dlv_pri_prnt_flg.addAllListener(p);
		p.Dlv_show_dtl.addAllListener(p);
		p.Dlv_show_dtl.setAPMethodName("doDlv_show_dtl");
		p.Dlv_lg_grp_cd.setListListener(p);
		p.Dlv_lg_grp_cd.addAllListener(p);
		p.Dlv_lg_grp_nm.setListListener(p);
		p.Dlv_lg_grp_nm.addAllListener(p);
		p.Dlv_cntry_cd.setListListener(p);
		p.Dlv_cntry_cd.addAllListener(p);
		p.Dlv_cntry_nm.setListListener(p);
		p.Dlv_cntry_nm.addAllListener(p);
		p.Dlv_zip_cd.setListListener(p);
		p.Dlv_zip_cd.addAllListener(p);
		p.Dlv_addr1.setListListener(p);
		p.Dlv_addr1.addAllListener(p);
		p.Dlv_addr2.setListListener(p);
		p.Dlv_addr2.addAllListener(p);
		p.Dlv_addr3.setListListener(p);
		p.Dlv_addr3.addAllListener(p);
		p.Dlv_addr4.setListListener(p);
		p.Dlv_addr4.addAllListener(p);
		p.Dlv_tel.setListListener(p);
		p.Dlv_tel.addAllListener(p);
		p.Dlv_fax.setListListener(p);
		p.Dlv_fax.addAllListener(p);
		p.Dlv_dlv_cntct_dpt.setListListener(p);
		p.Dlv_dlv_cntct_dpt.addAllListener(p);
		p.Dlv_dlv_cntct_psn.setListListener(p);
		p.Dlv_dlv_cntct_psn.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Dlv]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Dlv(MAUBP_Dlv_H p){
		p.Dlv_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_bp_nm.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_dlv_sundry_flg.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Dlv_pri_prnt_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.Dlv_show_dtl.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_lg_grp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_lg_grp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Dlv_cntry_cd.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Dlv_cntry_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Dlv_zip_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_addr1.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_addr2.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_addr3.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_addr4.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_tel.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_fax.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_dlv_cntct_dpt.putMode(p, ENABLE, MCMode.ENABLE);
		p.Dlv_dlv_cntct_psn.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [REQUIRED]ステータスの[Dlv]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_Dlv(MAUBP_Dlv_H p){
		p.Dlv_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Dlv_bp_nm.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Dlv_dlv_sundry_flg.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.Dlv_pri_prnt_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Dlv_show_dtl.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_lg_grp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.Dlv_lg_grp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.Dlv_cntry_cd.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.Dlv_cntry_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.Dlv_zip_cd.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_addr1.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_addr2.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_addr3.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_addr4.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_tel.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_fax.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_dlv_cntct_dpt.putMode(p, REQUIRED, MCMode.ENABLE);
		p.Dlv_dlv_cntct_psn.putMode(p, REQUIRED, MCMode.ENABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Dlv]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Dlv(MAUBP_Dlv_H p){
		p.Dlv_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_dlv_sundry_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_pri_prnt_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_show_dtl.putMode(p, READ_ONLY, MCMode.ENABLE);
		p.Dlv_lg_grp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_lg_grp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_cntry_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_cntry_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_zip_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_addr1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_addr2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_addr3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_addr4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_tel.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_fax.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_dlv_cntct_dpt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Dlv_dlv_cntct_psn.putMode(p, READ_ONLY, MCMode.READ_ONLY);

	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Dlv_bp_cd.getListConfig().setPutter(getDlv_bp_cd_ListPutter());
		Dlv_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dlv_lg_grp_cd.getListConfig().setPutter(getDlv_lg_grp_cd_ListPutter());
	}

	/**
	 * この画面を[ENABLE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setENABLEStatus() {
		status = ENABLE;
		setAllStatus(status);
	}

	/**
	 * この画面を[REQUIRED]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREQUIREDStatus() {
		status = REQUIRED;
		setAllStatus(status);
	}

	/**
	 * この画面を[READ_ONLY]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREAD_ONLYStatus() {
		status = READ_ONLY;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (ENABLE.equals(status)) {
			setENABLEStatus();
		}
		else if (REQUIRED.equals(status)) {
			setREQUIREDStatus();
		}
		else if (READ_ONLY.equals(status)) {
			setREAD_ONLYStatus();
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
	 * [Dlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dlv_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDlv_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Dlv_bp_cd) return getDlv_bp_cd(row, info);
		if(combo == Dlv_lg_grp_cd) return getDlv_lg_grp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Dlv_show_dtl) doDlv_show_dtl(info);
	}

	/**
	 * [Dlv]パネルの[show_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDlv_show_dtl(MCEventInfo info);

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
		if (vc == Dlv_bp_cd) return doDlv_bp_cd_VC(info);
		if (vc == Dlv_bp_nm) return doDlv_bp_nm_VC(info);
		if (vc == Dlv_dlv_sundry_flg) return doDlv_dlv_sundry_flg_VC(info);
		if (vc == Dlv_pri_prnt_flg) return doDlv_pri_prnt_flg_VC(info);
		if (vc == Dlv_lg_grp_cd) return doDlv_lg_grp_cd_VC(info);
		if (vc == Dlv_lg_grp_nm) return doDlv_lg_grp_nm_VC(info);
		if (vc == Dlv_cntry_cd) return doDlv_cntry_cd_VC(info);
		if (vc == Dlv_cntry_nm) return doDlv_cntry_nm_VC(info);
		if (vc == Dlv_zip_cd) return doDlv_zip_cd_VC(info);
		if (vc == Dlv_addr1) return doDlv_addr1_VC(info);
		if (vc == Dlv_addr2) return doDlv_addr2_VC(info);
		if (vc == Dlv_addr3) return doDlv_addr3_VC(info);
		if (vc == Dlv_addr4) return doDlv_addr4_VC(info);
		if (vc == Dlv_tel) return doDlv_tel_VC(info);
		if (vc == Dlv_fax) return doDlv_fax_VC(info);
		if (vc == Dlv_dlv_cntct_dpt) return doDlv_dlv_cntct_dpt_VC(info);
		if (vc == Dlv_dlv_cntct_psn) return doDlv_dlv_cntct_psn_VC(info);
		return true;
	}

	/**
	 * [Dlv]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_dlv_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDlv_dlv_cntct_psn_VC(MCEventInfo info){
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
		if (nc == Dlv_bp_cd) doDlv_bp_cd_NC(info);
		else if (nc == Dlv_bp_nm) doDlv_bp_nm_NC(info);
		else if (nc == Dlv_dlv_sundry_flg) doDlv_dlv_sundry_flg_NC(info);
		else if (nc == Dlv_pri_prnt_flg) doDlv_pri_prnt_flg_NC(info);
		else if (nc == Dlv_lg_grp_cd) doDlv_lg_grp_cd_NC(info);
		else if (nc == Dlv_lg_grp_nm) doDlv_lg_grp_nm_NC(info);
		else if (nc == Dlv_cntry_cd) doDlv_cntry_cd_NC(info);
		else if (nc == Dlv_cntry_nm) doDlv_cntry_nm_NC(info);
		else if (nc == Dlv_zip_cd) doDlv_zip_cd_NC(info);
		else if (nc == Dlv_addr1) doDlv_addr1_NC(info);
		else if (nc == Dlv_addr2) doDlv_addr2_NC(info);
		else if (nc == Dlv_addr3) doDlv_addr3_NC(info);
		else if (nc == Dlv_addr4) doDlv_addr4_NC(info);
		else if (nc == Dlv_tel) doDlv_tel_NC(info);
		else if (nc == Dlv_fax) doDlv_fax_NC(info);
		else if (nc == Dlv_dlv_cntct_dpt) doDlv_dlv_cntct_dpt_NC(info);
		else if (nc == Dlv_dlv_cntct_psn) doDlv_dlv_cntct_psn_NC(info);
	}

	/**
	 * [Dlv]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Dlv_bp_cd) doDlv_bp_cd_NE(info);
		else if (ne == Dlv_bp_nm) doDlv_bp_nm_NE(info);
		else if (ne == Dlv_dlv_sundry_flg) doDlv_dlv_sundry_flg_NE(info);
		else if (ne == Dlv_pri_prnt_flg) doDlv_pri_prnt_flg_NE(info);
		else if (ne == Dlv_lg_grp_cd) doDlv_lg_grp_cd_NE(info);
		else if (ne == Dlv_lg_grp_nm) doDlv_lg_grp_nm_NE(info);
		else if (ne == Dlv_cntry_cd) doDlv_cntry_cd_NE(info);
		else if (ne == Dlv_cntry_nm) doDlv_cntry_nm_NE(info);
		else if (ne == Dlv_zip_cd) doDlv_zip_cd_NE(info);
		else if (ne == Dlv_addr1) doDlv_addr1_NE(info);
		else if (ne == Dlv_addr2) doDlv_addr2_NE(info);
		else if (ne == Dlv_addr3) doDlv_addr3_NE(info);
		else if (ne == Dlv_addr4) doDlv_addr4_NE(info);
		else if (ne == Dlv_tel) doDlv_tel_NE(info);
		else if (ne == Dlv_fax) doDlv_fax_NE(info);
		else if (ne == Dlv_dlv_cntct_dpt) doDlv_dlv_cntct_dpt_NE(info);
		else if (ne == Dlv_dlv_cntct_psn) doDlv_dlv_cntct_psn_NE(info);
	}

	/**
	 * [Dlv]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Dlv_bp_cd) doDlv_bp_cd_NX(info);
		else if (nx == Dlv_bp_nm) doDlv_bp_nm_NX(info);
		else if (nx == Dlv_dlv_sundry_flg) doDlv_dlv_sundry_flg_NX(info);
		else if (nx == Dlv_pri_prnt_flg) doDlv_pri_prnt_flg_NX(info);
		else if (nx == Dlv_lg_grp_cd) doDlv_lg_grp_cd_NX(info);
		else if (nx == Dlv_lg_grp_nm) doDlv_lg_grp_nm_NX(info);
		else if (nx == Dlv_cntry_cd) doDlv_cntry_cd_NX(info);
		else if (nx == Dlv_cntry_nm) doDlv_cntry_nm_NX(info);
		else if (nx == Dlv_zip_cd) doDlv_zip_cd_NX(info);
		else if (nx == Dlv_addr1) doDlv_addr1_NX(info);
		else if (nx == Dlv_addr2) doDlv_addr2_NX(info);
		else if (nx == Dlv_addr3) doDlv_addr3_NX(info);
		else if (nx == Dlv_addr4) doDlv_addr4_NX(info);
		else if (nx == Dlv_tel) doDlv_tel_NX(info);
		else if (nx == Dlv_fax) doDlv_fax_NX(info);
		else if (nx == Dlv_dlv_cntct_dpt) doDlv_dlv_cntct_dpt_NX(info);
		else if (nx == Dlv_dlv_cntct_psn) doDlv_dlv_cntct_psn_NX(info);
	}

	/**
	 * [Dlv]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Dlv_bp_cd) doDlv_bp_cd_LC(info);
		else if (lc == Dlv_bp_nm) doDlv_bp_nm_LC(info);
		else if (lc == Dlv_lg_grp_cd) doDlv_lg_grp_cd_LC(info);
		else if (lc == Dlv_lg_grp_nm) doDlv_lg_grp_nm_LC(info);
		else if (lc == Dlv_cntry_cd) doDlv_cntry_cd_LC(info);
		else if (lc == Dlv_cntry_nm) doDlv_cntry_nm_LC(info);
		else if (lc == Dlv_zip_cd) doDlv_zip_cd_LC(info);
		else if (lc == Dlv_addr1) doDlv_addr1_LC(info);
		else if (lc == Dlv_addr2) doDlv_addr2_LC(info);
		else if (lc == Dlv_addr3) doDlv_addr3_LC(info);
		else if (lc == Dlv_addr4) doDlv_addr4_LC(info);
		else if (lc == Dlv_tel) doDlv_tel_LC(info);
		else if (lc == Dlv_fax) doDlv_fax_LC(info);
		else if (lc == Dlv_dlv_cntct_dpt) doDlv_dlv_cntct_dpt_LC(info);
		else if (lc == Dlv_dlv_cntct_psn) doDlv_dlv_cntct_psn_LC(info);
	}

	/**
	 * [Dlv]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dlv]パネルの[dlv_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDlv_dlv_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Dlv_bp_cd]の作成メソッド
	 */
	public MCList getDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dlv_lg_grp_cd]の作成メソッド
	 */
	public MCList getDlv_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}