package mcframe.clientMSBB.MSBBPA0030;

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
 * 画面"MSBBPA_SloDlv_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBPA_SloDlv_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBBPA0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SloDlv]ブロック関連のField定義
	public MCPanel SloDlvPanel = null;
	// [SloDlv]ブロックの項目のField定義
	public MCLabel SloDlv_bp_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextComboBox SloDlv_bp_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField SloDlv_bp_nm = null;
	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox SloDlv_dlv_sundry_flg = null;
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public MCCheckBox SloDlv_pri_prnt_flg = null;
	/**
	 * Display delivery destination address 納品先住所表示.<p>
	 *
	 */
	public MCButton SloDlv_show_dtl = null;
	public MCLabel SloDlv_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox SloDlv_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField SloDlv_lg_grp_nm = null;
	public MCLabel SloDlv_cntry_cd_Label = null;
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public MCTextField SloDlv_cntry_cd = null;
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public MCTextField SloDlv_cntry_nm = null;
	public MCLabel SloDlv_zip_cd_Label = null;
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public MCTextField SloDlv_zip_cd = null;
	public MCLabel SloDlv_addr1_Label = null;
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public MCTextField SloDlv_addr1 = null;
	public MCLabel SloDlv_addr2_Label = null;
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public MCTextField SloDlv_addr2 = null;
	public MCLabel SloDlv_addr3_Label = null;
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public MCTextField SloDlv_addr3 = null;
	public MCLabel SloDlv_addr4_Label = null;
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public MCTextField SloDlv_addr4 = null;
	public MCLabel SloDlv_tel_Label = null;
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public MCTextField SloDlv_tel = null;
	public MCLabel SloDlv_fax_Label = null;
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public MCTextField SloDlv_fax = null;
	public MCLabel SloDlv_dlv_cntct_dpt_Label = null;
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public MCTextField SloDlv_dlv_cntct_dpt = null;
	public MCLabel SloDlv_dlv_cntct_psn_Label = null;
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public MCTextField SloDlv_dlv_cntct_psn = null;
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
	
	/** [SloDlv]ブロックのコンテナField定義 */
	private final mcframe.clientMSBB.MSBBPA0030.SloDlvR aSloDlvR;

	/**
	 * 項目コピーによってaSloDlvRを設定します。
	 *
	 * aSloDlvRのインスタンスは変更されません。
	 *
	 * @param row SloDlvR
	 */
	public void setSloDlvR(mcframe.clientMSBB.MSBBPA0030.SloDlvR row) {
		if (row != null) {
			MCRow.copyall(getSloDlvR(), row);
		}
	}

	/**
	 * [SloDlv]ブロックのコンテナaSloDlvRを返します。
	 *
	 * @return SloDlvR
	 */
	public mcframe.clientMSBB.MSBBPA0030.SloDlvR getSloDlvR() {
		return aSloDlvR;
	}

	/**
	 * aSloDlvRを作成します。
	 *
	 * @return SloDlvR
	 */
	public mcframe.clientMSBB.MSBBPA0030.SloDlvR createSloDlvR() {
		return mcframe.clientMSBB.MSBBPA0030.SloDlvR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getSloDlvR())) ret.add(getSloDlvR());
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
		if(aCnt == getSloDlvR()) return "SloDlv";
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
		if(bId.equals("SloDlv")) return getSloDlvR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SloDlvPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBPA_SloDlv_H_MC_A() {
		aSloDlvR = createSloDlvR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MSBBPA_SloDlv_H_MC_A(mcframe.clientMSBB.MSBBPA0030.SloDlvR row){
		aSloDlvR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBBPA_SloDlv_H_MC.jbCreateSloDlv((MSBBPA_SloDlv_H)this);
	}

	/**
	 * [SloDlv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSloDlv(MSBBPA_SloDlv_H p) {
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

	
	/** [SloDlv_bp_cd_ListPutter]の定義 */
	private MCListPutter SloDlv_bp_cd_p = null;

	/**
	 * [SloDlv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getSloDlv_bp_cd_ListPutter() {
		if (SloDlv_bp_cd_p == null) {
			SloDlv_bp_cd_p = createSloDlv_bp_cd_ListPutter(SloDlv_bp_cd, "bp_cd", "bp_nm","dlv_sundry_flg","pri_prnt_flg","lg_grp_cd","zip_cd","addr1","addr2","addr3","addr4","cntry_cd","cntry_nm","tel","fax","dlv_cntct_dpt","dlv_cntct_psn");

		}
		return SloDlv_bp_cd_p;
	}
	
	
	/** [SloDlv_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter SloDlv_lg_grp_cd_p = null;

	/**
	 * [SloDlv_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getSloDlv_lg_grp_cd_ListPutter() {
		if (SloDlv_lg_grp_cd_p == null) {
			SloDlv_lg_grp_cd_p = createSloDlv_lg_grp_cd_ListPutter(SloDlv_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return SloDlv_lg_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MSBBPA_SloDlv_H create(mcframe.clientMSBB.MSBBPA0030.SloDlvR row){
		MSBBPA_SloDlv_H p = new MSBBPA_SloDlv_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBBPA_SloDlv_H create(){
		MSBBPA_SloDlv_H p = new MSBBPA_SloDlv_H();
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
		MSBBPA_SloDlv_H_MC.jbfInitSloDlv((MSBBPA_SloDlv_H)this);
		MSBBPA_SloDlv_H_MC.jbInitSloDlv((MSBBPA_SloDlv_H)this);
	}

	/**
	 * [SloDlv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSloDlv(MSBBPA_SloDlv_H p) {
		// ブロック関連の初期化
		p.SloDlvPanel = p.beansFactory.createPanel("SloDlv");
		// ブロックの項目の初期化
		p.SloDlv_bp_cd_Label = p.beansFactory.createLabel("SloDlv.bp_cd_Label");
		p.SloDlv_bp_cd = p.beansFactory.createTextComboBox("SloDlv.bp_cd");
		p.SloDlv_bp_cd.setLabel(p.SloDlv_bp_cd_Label);
		p.SloDlv_bp_nm = p.beansFactory.createTextField("SloDlv.bp_nm");
		p.SloDlv_dlv_sundry_flg = p.beansFactory.createCheckBox("SloDlv.dlv_sundry_flg");
		p.SloDlv_pri_prnt_flg = p.beansFactory.createCheckBox("SloDlv.pri_prnt_flg");
		p.SloDlv_show_dtl = p.beansFactory.createButton("SloDlv.show_dtl");
		p.SloDlv_lg_grp_cd_Label = p.beansFactory.createLabel("SloDlv.lg_grp_cd_Label");
		p.SloDlv_lg_grp_cd = p.beansFactory.createTextComboBox("SloDlv.lg_grp_cd");
		p.SloDlv_lg_grp_cd.setLabel(p.SloDlv_lg_grp_cd_Label);
		p.SloDlv_lg_grp_nm = p.beansFactory.createTextField("SloDlv.lg_grp_nm");
		p.SloDlv_cntry_cd_Label = p.beansFactory.createLabel("SloDlv.cntry_cd_Label");
		p.SloDlv_cntry_cd = p.beansFactory.createTextField("SloDlv.cntry_cd");
		p.SloDlv_cntry_cd.setLabel(p.SloDlv_cntry_cd_Label);
		p.SloDlv_cntry_nm = p.beansFactory.createTextField("SloDlv.cntry_nm");
		p.SloDlv_zip_cd_Label = p.beansFactory.createLabel("SloDlv.zip_cd_Label");
		p.SloDlv_zip_cd = p.beansFactory.createTextField("SloDlv.zip_cd");
		p.SloDlv_zip_cd.setLabel(p.SloDlv_zip_cd_Label);
		p.SloDlv_addr1_Label = p.beansFactory.createLabel("SloDlv.addr1_Label");
		p.SloDlv_addr1 = p.beansFactory.createTextField("SloDlv.addr1");
		p.SloDlv_addr1.setLabel(p.SloDlv_addr1_Label);
		p.SloDlv_addr2_Label = p.beansFactory.createLabel("SloDlv.addr2_Label");
		p.SloDlv_addr2 = p.beansFactory.createTextField("SloDlv.addr2");
		p.SloDlv_addr2.setLabel(p.SloDlv_addr2_Label);
		p.SloDlv_addr3_Label = p.beansFactory.createLabel("SloDlv.addr3_Label");
		p.SloDlv_addr3 = p.beansFactory.createTextField("SloDlv.addr3");
		p.SloDlv_addr3.setLabel(p.SloDlv_addr3_Label);
		p.SloDlv_addr4_Label = p.beansFactory.createLabel("SloDlv.addr4_Label");
		p.SloDlv_addr4 = p.beansFactory.createTextField("SloDlv.addr4");
		p.SloDlv_addr4.setLabel(p.SloDlv_addr4_Label);
		p.SloDlv_tel_Label = p.beansFactory.createLabel("SloDlv.tel_Label");
		p.SloDlv_tel = p.beansFactory.createTextField("SloDlv.tel");
		p.SloDlv_tel.setLabel(p.SloDlv_tel_Label);
		p.SloDlv_fax_Label = p.beansFactory.createLabel("SloDlv.fax_Label");
		p.SloDlv_fax = p.beansFactory.createTextField("SloDlv.fax");
		p.SloDlv_fax.setLabel(p.SloDlv_fax_Label);
		p.SloDlv_dlv_cntct_dpt_Label = p.beansFactory.createLabel("SloDlv.dlv_cntct_dpt_Label");
		p.SloDlv_dlv_cntct_dpt = p.beansFactory.createTextField("SloDlv.dlv_cntct_dpt");
		p.SloDlv_dlv_cntct_dpt.setLabel(p.SloDlv_dlv_cntct_dpt_Label);
		p.SloDlv_dlv_cntct_psn_Label = p.beansFactory.createLabel("SloDlv.dlv_cntct_psn_Label");
		p.SloDlv_dlv_cntct_psn = p.beansFactory.createTextField("SloDlv.dlv_cntct_psn");
		p.SloDlv_dlv_cntct_psn.setLabel(p.SloDlv_dlv_cntct_psn_Label);
	}

	/**
	 * [SloDlv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSloDlv(MSBBPA_SloDlv_H p) {
		// ブロック関連の初期化
		p.add(p.SloDlvPanel);
		p.setLastBeans(p.SloDlvPanel);
		// ブロックの項目の初期化
		p.SloDlv_bp_cd.setListType(MCListType.STRICT);
		p.SloDlv_bp_cd.setLinkBeans(p.SloDlv_bp_nm,p.SloDlv_dlv_sundry_flg,p.SloDlv_pri_prnt_flg,p.SloDlv_lg_grp_cd,p.SloDlv_zip_cd,p.SloDlv_addr1,p.SloDlv_addr2,p.SloDlv_addr3,p.SloDlv_addr4,p.SloDlv_cntry_cd,p.SloDlv_cntry_nm,p.SloDlv_tel,p.SloDlv_fax,p.SloDlv_dlv_cntct_dpt,p.SloDlv_dlv_cntct_psn);
		p.SloDlvPanel.add(p.SloDlv_bp_cd_Label);
		p.SloDlvPanel.add(p.SloDlv_bp_cd);
		p.SloDlvPanel.setLastBeans(p.SloDlv_bp_cd);
		p.SloDlv_bp_cd.setNextBeans(p.SloDlv_bp_nm);
		p.SloDlv_bp_cd.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.bp_cd_META);
		p.SloDlvPanel.add(p.SloDlv_bp_nm);
		p.SloDlv_bp_nm.setNextBeans(p.SloDlv_dlv_sundry_flg);
		p.SloDlv_bp_nm.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.bp_nm_META);
		p.SloDlvPanel.add(p.SloDlv_dlv_sundry_flg);
		p.SloDlv_dlv_sundry_flg.setNextBeans(p.SloDlv_pri_prnt_flg);
		p.SloDlv_dlv_sundry_flg.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.dlv_sundry_flg_META);
		p.SloDlvPanel.add(p.SloDlv_pri_prnt_flg);
		p.SloDlv_pri_prnt_flg.setNextBeans(p.SloDlv_show_dtl);
		p.SloDlv_pri_prnt_flg.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.pri_prnt_flg_META);
		p.SloDlvPanel.add(p.SloDlv_show_dtl);
		p.SloDlv_show_dtl.setNextBeans(p.SloDlv_lg_grp_cd);
		p.SloDlv_lg_grp_cd.setListType(MCListType.STRICT);
		p.SloDlv_lg_grp_cd.setLinkBeans(p.SloDlv_lg_grp_nm);
		p.SloDlvPanel.add(p.SloDlv_lg_grp_cd_Label);
		p.SloDlvPanel.add(p.SloDlv_lg_grp_cd);
		p.SloDlv_lg_grp_cd.setNextBeans(p.SloDlv_lg_grp_nm);
		p.SloDlv_lg_grp_cd.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.lg_grp_cd_META);
		p.SloDlvPanel.add(p.SloDlv_lg_grp_nm);
		p.SloDlv_lg_grp_nm.setNextBeans(p.SloDlv_cntry_cd);
		p.SloDlv_lg_grp_nm.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.lg_grp_nm_META);
		p.SloDlvPanel.add(p.SloDlv_cntry_cd_Label);
		p.SloDlvPanel.add(p.SloDlv_cntry_cd);
		p.SloDlv_cntry_cd.setNextBeans(p.SloDlv_cntry_nm);
		p.SloDlv_cntry_cd.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.cntry_cd_META);
		p.SloDlvPanel.add(p.SloDlv_cntry_nm);
		p.SloDlv_cntry_nm.setNextBeans(p.SloDlv_zip_cd);
		p.SloDlv_cntry_nm.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.cntry_nm_META);
		p.SloDlvPanel.add(p.SloDlv_zip_cd_Label);
		p.SloDlvPanel.add(p.SloDlv_zip_cd);
		p.SloDlv_zip_cd.setNextBeans(p.SloDlv_addr1);
		p.SloDlv_zip_cd.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.zip_cd_META);
		p.SloDlvPanel.add(p.SloDlv_addr1_Label);
		p.SloDlvPanel.add(p.SloDlv_addr1);
		p.SloDlv_addr1.setNextBeans(p.SloDlv_addr2);
		p.SloDlv_addr1.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.addr1_META);
		p.SloDlvPanel.add(p.SloDlv_addr2_Label);
		p.SloDlvPanel.add(p.SloDlv_addr2);
		p.SloDlv_addr2.setNextBeans(p.SloDlv_addr3);
		p.SloDlv_addr2.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.addr2_META);
		p.SloDlvPanel.add(p.SloDlv_addr3_Label);
		p.SloDlvPanel.add(p.SloDlv_addr3);
		p.SloDlv_addr3.setNextBeans(p.SloDlv_addr4);
		p.SloDlv_addr3.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.addr3_META);
		p.SloDlvPanel.add(p.SloDlv_addr4_Label);
		p.SloDlvPanel.add(p.SloDlv_addr4);
		p.SloDlv_addr4.setNextBeans(p.SloDlv_tel);
		p.SloDlv_addr4.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.addr4_META);
		p.SloDlvPanel.add(p.SloDlv_tel_Label);
		p.SloDlvPanel.add(p.SloDlv_tel);
		p.SloDlv_tel.setNextBeans(p.SloDlv_fax);
		p.SloDlv_tel.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.tel_META);
		p.SloDlvPanel.add(p.SloDlv_fax_Label);
		p.SloDlvPanel.add(p.SloDlv_fax);
		p.SloDlv_fax.setNextBeans(p.SloDlv_dlv_cntct_dpt);
		p.SloDlv_fax.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.fax_META);
		p.SloDlvPanel.add(p.SloDlv_dlv_cntct_dpt_Label);
		p.SloDlvPanel.add(p.SloDlv_dlv_cntct_dpt);
		p.SloDlv_dlv_cntct_dpt.setNextBeans(p.SloDlv_dlv_cntct_psn);
		p.SloDlv_dlv_cntct_dpt.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.dlv_cntct_dpt_META);
		p.SloDlvPanel.add(p.SloDlv_dlv_cntct_psn_Label);
		p.SloDlvPanel.add(p.SloDlv_dlv_cntct_psn);
		p.SloDlv_dlv_cntct_psn.setRow(p.getSloDlvR(), mcframe.clientMSBB.MSBBPA0030.SloDlvR.dlv_cntct_psn_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBBPA_SloDlv_H_MC.mcInitSloDlv((MSBBPA_SloDlv_H)this);

		// [ENABLE]ステータスのモードの設定
		MSBBPA_SloDlv_H_MC.statusInitENABLE_SloDlv((MSBBPA_SloDlv_H)this);

		// [REQUIRED]ステータスのモードの設定
		MSBBPA_SloDlv_H_MC.statusInitREQUIRED_SloDlv((MSBBPA_SloDlv_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MSBBPA_SloDlv_H_MC.statusInitREAD__ONLY_SloDlv((MSBBPA_SloDlv_H)this);

	}

	/**
	 *  [SloDlv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSloDlv(MSBBPA_SloDlv_H p) {
		p.SloDlv_bp_cd.setListListener(p);
		p.SloDlv_bp_cd.addAllListener(p);
		p.SloDlv_bp_nm.setListListener(p);
		p.SloDlv_bp_nm.addAllListener(p);
		p.SloDlv_dlv_sundry_flg.addAllListener(p);
		p.SloDlv_pri_prnt_flg.addAllListener(p);
		p.SloDlv_show_dtl.addAllListener(p);
		p.SloDlv_show_dtl.setAPMethodName("doSloDlv_show_dtl");
		p.SloDlv_lg_grp_cd.setListListener(p);
		p.SloDlv_lg_grp_cd.addAllListener(p);
		p.SloDlv_lg_grp_nm.setListListener(p);
		p.SloDlv_lg_grp_nm.addAllListener(p);
		p.SloDlv_cntry_cd.setListListener(p);
		p.SloDlv_cntry_cd.addAllListener(p);
		p.SloDlv_cntry_nm.setListListener(p);
		p.SloDlv_cntry_nm.addAllListener(p);
		p.SloDlv_zip_cd.setListListener(p);
		p.SloDlv_zip_cd.addAllListener(p);
		p.SloDlv_addr1.setListListener(p);
		p.SloDlv_addr1.addAllListener(p);
		p.SloDlv_addr2.setListListener(p);
		p.SloDlv_addr2.addAllListener(p);
		p.SloDlv_addr3.setListListener(p);
		p.SloDlv_addr3.addAllListener(p);
		p.SloDlv_addr4.setListListener(p);
		p.SloDlv_addr4.addAllListener(p);
		p.SloDlv_tel.setListListener(p);
		p.SloDlv_tel.addAllListener(p);
		p.SloDlv_fax.setListListener(p);
		p.SloDlv_fax.addAllListener(p);
		p.SloDlv_dlv_cntct_dpt.setListListener(p);
		p.SloDlv_dlv_cntct_dpt.addAllListener(p);
		p.SloDlv_dlv_cntct_psn.setListListener(p);
		p.SloDlv_dlv_cntct_psn.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[SloDlv]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_SloDlv(MSBBPA_SloDlv_H p){
		p.SloDlv_bp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_bp_nm.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_dlv_sundry_flg.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.SloDlv_pri_prnt_flg.putMode(p, ENABLE, MCMode.REQUIRED);
		p.SloDlv_show_dtl.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_lg_grp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_lg_grp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.SloDlv_cntry_cd.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.SloDlv_cntry_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.SloDlv_zip_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_addr1.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_addr2.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_addr3.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_addr4.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_tel.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_fax.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_dlv_cntct_dpt.putMode(p, ENABLE, MCMode.ENABLE);
		p.SloDlv_dlv_cntct_psn.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [REQUIRED]ステータスの[SloDlv]ブロックのモードの設定
	 */
	protected static void statusInitREQUIRED_SloDlv(MSBBPA_SloDlv_H p){
		p.SloDlv_bp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SloDlv_bp_nm.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SloDlv_dlv_sundry_flg.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.SloDlv_pri_prnt_flg.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SloDlv_show_dtl.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_lg_grp_cd.putMode(p, REQUIRED, MCMode.REQUIRED);
		p.SloDlv_lg_grp_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.SloDlv_cntry_cd.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.SloDlv_cntry_nm.putMode(p, REQUIRED, MCMode.READ_ONLY);
		p.SloDlv_zip_cd.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_addr1.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_addr2.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_addr3.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_addr4.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_tel.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_fax.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_dlv_cntct_dpt.putMode(p, REQUIRED, MCMode.ENABLE);
		p.SloDlv_dlv_cntct_psn.putMode(p, REQUIRED, MCMode.ENABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[SloDlv]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_SloDlv(MSBBPA_SloDlv_H p){
		p.SloDlv_bp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_bp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_dlv_sundry_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_pri_prnt_flg.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_show_dtl.putMode(p, READ_ONLY, MCMode.ENABLE);
		p.SloDlv_lg_grp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_lg_grp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_cntry_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_cntry_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_zip_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_addr1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_addr2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_addr3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_addr4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_tel.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_fax.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_dlv_cntct_dpt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.SloDlv_dlv_cntct_psn.putMode(p, READ_ONLY, MCMode.READ_ONLY);

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
		SloDlv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		SloDlv_bp_cd.getListConfig().setPutter(getSloDlv_bp_cd_ListPutter());
		SloDlv_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		SloDlv_lg_grp_cd.getListConfig().setPutter(getSloDlv_lg_grp_cd_ListPutter());
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
	 * [SloDlv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createSloDlv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0030.SloDlv");
		return lp;
	}
	 
	/**
	 * [SloDlv_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createSloDlv_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == SloDlv_bp_cd) return getSloDlv_bp_cd(row, info);
		if(combo == SloDlv_lg_grp_cd) return getSloDlv_lg_grp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == SloDlv_show_dtl) doSloDlv_show_dtl(info);
	}

	/**
	 * [SloDlv]パネルの[show_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSloDlv_show_dtl(MCEventInfo info);

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
		if (vc == SloDlv_bp_cd) return doSloDlv_bp_cd_VC(info);
		if (vc == SloDlv_bp_nm) return doSloDlv_bp_nm_VC(info);
		if (vc == SloDlv_dlv_sundry_flg) return doSloDlv_dlv_sundry_flg_VC(info);
		if (vc == SloDlv_pri_prnt_flg) return doSloDlv_pri_prnt_flg_VC(info);
		if (vc == SloDlv_lg_grp_cd) return doSloDlv_lg_grp_cd_VC(info);
		if (vc == SloDlv_lg_grp_nm) return doSloDlv_lg_grp_nm_VC(info);
		if (vc == SloDlv_cntry_cd) return doSloDlv_cntry_cd_VC(info);
		if (vc == SloDlv_cntry_nm) return doSloDlv_cntry_nm_VC(info);
		if (vc == SloDlv_zip_cd) return doSloDlv_zip_cd_VC(info);
		if (vc == SloDlv_addr1) return doSloDlv_addr1_VC(info);
		if (vc == SloDlv_addr2) return doSloDlv_addr2_VC(info);
		if (vc == SloDlv_addr3) return doSloDlv_addr3_VC(info);
		if (vc == SloDlv_addr4) return doSloDlv_addr4_VC(info);
		if (vc == SloDlv_tel) return doSloDlv_tel_VC(info);
		if (vc == SloDlv_fax) return doSloDlv_fax_VC(info);
		if (vc == SloDlv_dlv_cntct_dpt) return doSloDlv_dlv_cntct_dpt_VC(info);
		if (vc == SloDlv_dlv_cntct_psn) return doSloDlv_dlv_cntct_psn_VC(info);
		return true;
	}

	/**
	 * [SloDlv]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_dlv_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doSloDlv_dlv_cntct_psn_VC(MCEventInfo info){
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
		if (nc == SloDlv_bp_cd) doSloDlv_bp_cd_NC(info);
		else if (nc == SloDlv_bp_nm) doSloDlv_bp_nm_NC(info);
		else if (nc == SloDlv_dlv_sundry_flg) doSloDlv_dlv_sundry_flg_NC(info);
		else if (nc == SloDlv_pri_prnt_flg) doSloDlv_pri_prnt_flg_NC(info);
		else if (nc == SloDlv_lg_grp_cd) doSloDlv_lg_grp_cd_NC(info);
		else if (nc == SloDlv_lg_grp_nm) doSloDlv_lg_grp_nm_NC(info);
		else if (nc == SloDlv_cntry_cd) doSloDlv_cntry_cd_NC(info);
		else if (nc == SloDlv_cntry_nm) doSloDlv_cntry_nm_NC(info);
		else if (nc == SloDlv_zip_cd) doSloDlv_zip_cd_NC(info);
		else if (nc == SloDlv_addr1) doSloDlv_addr1_NC(info);
		else if (nc == SloDlv_addr2) doSloDlv_addr2_NC(info);
		else if (nc == SloDlv_addr3) doSloDlv_addr3_NC(info);
		else if (nc == SloDlv_addr4) doSloDlv_addr4_NC(info);
		else if (nc == SloDlv_tel) doSloDlv_tel_NC(info);
		else if (nc == SloDlv_fax) doSloDlv_fax_NC(info);
		else if (nc == SloDlv_dlv_cntct_dpt) doSloDlv_dlv_cntct_dpt_NC(info);
		else if (nc == SloDlv_dlv_cntct_psn) doSloDlv_dlv_cntct_psn_NC(info);
	}

	/**
	 * [SloDlv]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr1_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr2_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr3_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr4_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_tel_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_fax_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == SloDlv_bp_cd) doSloDlv_bp_cd_NE(info);
		else if (ne == SloDlv_bp_nm) doSloDlv_bp_nm_NE(info);
		else if (ne == SloDlv_dlv_sundry_flg) doSloDlv_dlv_sundry_flg_NE(info);
		else if (ne == SloDlv_pri_prnt_flg) doSloDlv_pri_prnt_flg_NE(info);
		else if (ne == SloDlv_lg_grp_cd) doSloDlv_lg_grp_cd_NE(info);
		else if (ne == SloDlv_lg_grp_nm) doSloDlv_lg_grp_nm_NE(info);
		else if (ne == SloDlv_cntry_cd) doSloDlv_cntry_cd_NE(info);
		else if (ne == SloDlv_cntry_nm) doSloDlv_cntry_nm_NE(info);
		else if (ne == SloDlv_zip_cd) doSloDlv_zip_cd_NE(info);
		else if (ne == SloDlv_addr1) doSloDlv_addr1_NE(info);
		else if (ne == SloDlv_addr2) doSloDlv_addr2_NE(info);
		else if (ne == SloDlv_addr3) doSloDlv_addr3_NE(info);
		else if (ne == SloDlv_addr4) doSloDlv_addr4_NE(info);
		else if (ne == SloDlv_tel) doSloDlv_tel_NE(info);
		else if (ne == SloDlv_fax) doSloDlv_fax_NE(info);
		else if (ne == SloDlv_dlv_cntct_dpt) doSloDlv_dlv_cntct_dpt_NE(info);
		else if (ne == SloDlv_dlv_cntct_psn) doSloDlv_dlv_cntct_psn_NE(info);
	}

	/**
	 * [SloDlv]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr1_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr2_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr3_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr4_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_tel_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_fax_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == SloDlv_bp_cd) doSloDlv_bp_cd_NX(info);
		else if (nx == SloDlv_bp_nm) doSloDlv_bp_nm_NX(info);
		else if (nx == SloDlv_dlv_sundry_flg) doSloDlv_dlv_sundry_flg_NX(info);
		else if (nx == SloDlv_pri_prnt_flg) doSloDlv_pri_prnt_flg_NX(info);
		else if (nx == SloDlv_lg_grp_cd) doSloDlv_lg_grp_cd_NX(info);
		else if (nx == SloDlv_lg_grp_nm) doSloDlv_lg_grp_nm_NX(info);
		else if (nx == SloDlv_cntry_cd) doSloDlv_cntry_cd_NX(info);
		else if (nx == SloDlv_cntry_nm) doSloDlv_cntry_nm_NX(info);
		else if (nx == SloDlv_zip_cd) doSloDlv_zip_cd_NX(info);
		else if (nx == SloDlv_addr1) doSloDlv_addr1_NX(info);
		else if (nx == SloDlv_addr2) doSloDlv_addr2_NX(info);
		else if (nx == SloDlv_addr3) doSloDlv_addr3_NX(info);
		else if (nx == SloDlv_addr4) doSloDlv_addr4_NX(info);
		else if (nx == SloDlv_tel) doSloDlv_tel_NX(info);
		else if (nx == SloDlv_fax) doSloDlv_fax_NX(info);
		else if (nx == SloDlv_dlv_cntct_dpt) doSloDlv_dlv_cntct_dpt_NX(info);
		else if (nx == SloDlv_dlv_cntct_psn) doSloDlv_dlv_cntct_psn_NX(info);
	}

	/**
	 * [SloDlv]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr1_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr2_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr3_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr4_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_tel_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_fax_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == SloDlv_bp_cd) doSloDlv_bp_cd_LC(info);
		else if (lc == SloDlv_bp_nm) doSloDlv_bp_nm_LC(info);
		else if (lc == SloDlv_lg_grp_cd) doSloDlv_lg_grp_cd_LC(info);
		else if (lc == SloDlv_lg_grp_nm) doSloDlv_lg_grp_nm_LC(info);
		else if (lc == SloDlv_cntry_cd) doSloDlv_cntry_cd_LC(info);
		else if (lc == SloDlv_cntry_nm) doSloDlv_cntry_nm_LC(info);
		else if (lc == SloDlv_zip_cd) doSloDlv_zip_cd_LC(info);
		else if (lc == SloDlv_addr1) doSloDlv_addr1_LC(info);
		else if (lc == SloDlv_addr2) doSloDlv_addr2_LC(info);
		else if (lc == SloDlv_addr3) doSloDlv_addr3_LC(info);
		else if (lc == SloDlv_addr4) doSloDlv_addr4_LC(info);
		else if (lc == SloDlv_tel) doSloDlv_tel_LC(info);
		else if (lc == SloDlv_fax) doSloDlv_fax_LC(info);
		else if (lc == SloDlv_dlv_cntct_dpt) doSloDlv_dlv_cntct_dpt_LC(info);
		else if (lc == SloDlv_dlv_cntct_psn) doSloDlv_dlv_cntct_psn_LC(info);
	}

	/**
	 * [SloDlv]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr1_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr2_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr3_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_addr4_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_tel_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_fax_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [SloDlv]パネルの[dlv_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doSloDlv_dlv_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[SloDlv_bp_cd]の作成メソッド
	 */
	public MCList getSloDlv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0030.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0030.MSUAP_List", this)).getSloDlv(row, info);
	}

	/**
	 * コンボ／リストのリスト[SloDlv_lg_grp_cd]の作成メソッド
	 */
	public MCList getSloDlv_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}