package mcframe.clientMAUB.MAUBP0410;

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
 * 画面"MAUBP_Addr_H"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUBP_Addr_H_MC_A extends mcframe.clientMAUD.MAUDP0050.MAUDP_HPartsBase{
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
	public static final String SCREEN_ID = "MAUBP0410";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Addr]ブロック関連のField定義
	public MCPanel AddrPanel = null;
	// [Addr]ブロックの項目のField定義
	/**
	 * Display address 住所表示.<p>
	 *
	 */
	public MCButton Addr_show_dtl = null;
	public MCLabel Addr_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Addr_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Addr_lg_grp_nm = null;
	public MCLabel Addr_cntry_cd_Label = null;
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public MCTextField Addr_cntry_cd = null;
	/**
	 * Country name 国名.<p>
	 *
	 */
	public MCTextField Addr_cntry_nm = null;
	public MCLabel Addr_zip_cd_Label = null;
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCTextField Addr_zip_cd = null;
	public MCLabel Addr_addr1_Label = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCTextField Addr_addr1 = null;
	public MCLabel Addr_addr2_Label = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCTextField Addr_addr2 = null;
	public MCLabel Addr_addr3_Label = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCTextField Addr_addr3 = null;
	public MCLabel Addr_addr4_Label = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCTextField Addr_addr4 = null;
	public MCLabel Addr_tel_Label = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCTextField Addr_tel = null;
	public MCLabel Addr_fax_Label = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCTextField Addr_fax = null;
	public MCLabel Addr_cntct_dpt_Label = null;
	/**
	 * Counterpart dept. 相手先部署.<p>
	 *
	 */
	public MCTextField Addr_cntct_dpt = null;
	public MCLabel Addr_cntct_psn_Label = null;
	/**
	 * Counterpart PIC 相手先担当者.<p>
	 *
	 */
	public MCTextField Addr_cntct_psn = null;
	/** [ENABLE]モードを表す定数 */
	public static final String ENABLE = "ENABLE";
	/** [READ_ONLY]モードを表す定数 */
	public static final String READ_ONLY = "READ_ONLY";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{ENABLE, READ_ONLY};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [Addr]ブロックのコンテナField定義 */
	private final mcframe.clientMAUB.MAUBP0410.AddrR aAddrR;

	/**
	 * 項目コピーによってaAddrRを設定します。
	 *
	 * aAddrRのインスタンスは変更されません。
	 *
	 * @param row AddrR
	 */
	public void setAddrR(mcframe.clientMAUB.MAUBP0410.AddrR row) {
		if (row != null) {
			MCRow.copyall(getAddrR(), row);
		}
	}

	/**
	 * [Addr]ブロックのコンテナaAddrRを返します。
	 *
	 * @return AddrR
	 */
	public mcframe.clientMAUB.MAUBP0410.AddrR getAddrR() {
		return aAddrR;
	}

	/**
	 * aAddrRを作成します。
	 *
	 * @return AddrR
	 */
	public mcframe.clientMAUB.MAUBP0410.AddrR createAddrR() {
		return mcframe.clientMAUB.MAUBP0410.AddrR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getAddrR())) ret.add(getAddrR());
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
		if(aCnt == getAddrR()) return "Addr";
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
		if(bId.equals("Addr")) return getAddrR();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(AddrPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUBP_Addr_H_MC_A() {
		aAddrR = createAddrR();

	}

	/**
	 * コンストラクタです。埋込画面として作成するときに使用します。
	 *
	 * @param row 対応するInnerRow
	 */
	protected MAUBP_Addr_H_MC_A(mcframe.clientMAUB.MAUBP0410.AddrR row){
		aAddrR = row;
	}

	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MAUBP_Addr_H_MC.jbCreateAddr((MAUBP_Addr_H)this);
	}

	/**
	 * [Addr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateAddr(MAUBP_Addr_H p) {
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

	
	/** [Addr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Addr_lg_grp_cd_p = null;

	/**
	 * [Addr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getAddr_lg_grp_cd_ListPutter() {
		if (Addr_lg_grp_cd_p == null) {
			Addr_lg_grp_cd_p = createAddr_lg_grp_cd_ListPutter(Addr_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Addr_lg_grp_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */	
	public static MAUBP_Addr_H create(mcframe.clientMAUB.MAUBP0410.AddrR row){
		MAUBP_Addr_H p = new MAUBP_Addr_H(row);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MAUBP_Addr_H create(){
		MAUBP_Addr_H p = new MAUBP_Addr_H();
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
		MAUBP_Addr_H_MC.jbfInitAddr((MAUBP_Addr_H)this);
		MAUBP_Addr_H_MC.jbInitAddr((MAUBP_Addr_H)this);
	}

	/**
	 * [Addr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitAddr(MAUBP_Addr_H p) {
		// ブロック関連の初期化
		p.AddrPanel = p.beansFactory.createPanel("Addr");
		// ブロックの項目の初期化
		p.Addr_show_dtl = p.beansFactory.createButton("Addr.show_dtl");
		p.Addr_lg_grp_cd_Label = p.beansFactory.createLabel("Addr.lg_grp_cd_Label");
		p.Addr_lg_grp_cd = p.beansFactory.createTextComboBox("Addr.lg_grp_cd");
		p.Addr_lg_grp_cd.setLabel(p.Addr_lg_grp_cd_Label);
		p.Addr_lg_grp_nm = p.beansFactory.createTextField("Addr.lg_grp_nm");
		p.Addr_cntry_cd_Label = p.beansFactory.createLabel("Addr.cntry_cd_Label");
		p.Addr_cntry_cd = p.beansFactory.createTextField("Addr.cntry_cd");
		p.Addr_cntry_cd.setLabel(p.Addr_cntry_cd_Label);
		p.Addr_cntry_nm = p.beansFactory.createTextField("Addr.cntry_nm");
		p.Addr_zip_cd_Label = p.beansFactory.createLabel("Addr.zip_cd_Label");
		p.Addr_zip_cd = p.beansFactory.createTextField("Addr.zip_cd");
		p.Addr_zip_cd.setLabel(p.Addr_zip_cd_Label);
		p.Addr_addr1_Label = p.beansFactory.createLabel("Addr.addr1_Label");
		p.Addr_addr1 = p.beansFactory.createTextField("Addr.addr1");
		p.Addr_addr1.setLabel(p.Addr_addr1_Label);
		p.Addr_addr2_Label = p.beansFactory.createLabel("Addr.addr2_Label");
		p.Addr_addr2 = p.beansFactory.createTextField("Addr.addr2");
		p.Addr_addr2.setLabel(p.Addr_addr2_Label);
		p.Addr_addr3_Label = p.beansFactory.createLabel("Addr.addr3_Label");
		p.Addr_addr3 = p.beansFactory.createTextField("Addr.addr3");
		p.Addr_addr3.setLabel(p.Addr_addr3_Label);
		p.Addr_addr4_Label = p.beansFactory.createLabel("Addr.addr4_Label");
		p.Addr_addr4 = p.beansFactory.createTextField("Addr.addr4");
		p.Addr_addr4.setLabel(p.Addr_addr4_Label);
		p.Addr_tel_Label = p.beansFactory.createLabel("Addr.tel_Label");
		p.Addr_tel = p.beansFactory.createTextField("Addr.tel");
		p.Addr_tel.setLabel(p.Addr_tel_Label);
		p.Addr_fax_Label = p.beansFactory.createLabel("Addr.fax_Label");
		p.Addr_fax = p.beansFactory.createTextField("Addr.fax");
		p.Addr_fax.setLabel(p.Addr_fax_Label);
		p.Addr_cntct_dpt_Label = p.beansFactory.createLabel("Addr.cntct_dpt_Label");
		p.Addr_cntct_dpt = p.beansFactory.createTextField("Addr.cntct_dpt");
		p.Addr_cntct_dpt.setLabel(p.Addr_cntct_dpt_Label);
		p.Addr_cntct_psn_Label = p.beansFactory.createLabel("Addr.cntct_psn_Label");
		p.Addr_cntct_psn = p.beansFactory.createTextField("Addr.cntct_psn");
		p.Addr_cntct_psn.setLabel(p.Addr_cntct_psn_Label);
	}

	/**
	 * [Addr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitAddr(MAUBP_Addr_H p) {
		// ブロック関連の初期化
		p.add(p.AddrPanel);
		p.setLastBeans(p.AddrPanel);
		// ブロックの項目の初期化
		p.AddrPanel.add(p.Addr_show_dtl);
		p.AddrPanel.setLastBeans(p.Addr_show_dtl);
		p.Addr_show_dtl.setNextBeans(p.Addr_lg_grp_cd);
		p.Addr_lg_grp_cd.setListType(MCListType.STRICT);
		p.Addr_lg_grp_cd.setLinkBeans(p.Addr_lg_grp_nm);
		p.AddrPanel.add(p.Addr_lg_grp_cd_Label);
		p.AddrPanel.add(p.Addr_lg_grp_cd);
		p.Addr_lg_grp_cd.setNextBeans(p.Addr_lg_grp_nm);
		p.Addr_lg_grp_cd.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.lg_grp_cd_META);
		p.AddrPanel.add(p.Addr_lg_grp_nm);
		p.Addr_lg_grp_nm.setNextBeans(p.Addr_cntry_cd);
		p.Addr_lg_grp_nm.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.lg_grp_nm_META);
		p.AddrPanel.add(p.Addr_cntry_cd_Label);
		p.AddrPanel.add(p.Addr_cntry_cd);
		p.Addr_cntry_cd.setNextBeans(p.Addr_cntry_nm);
		p.Addr_cntry_cd.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.cntry_cd_META);
		p.AddrPanel.add(p.Addr_cntry_nm);
		p.Addr_cntry_nm.setNextBeans(p.Addr_zip_cd);
		p.Addr_cntry_nm.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.cntry_nm_META);
		p.AddrPanel.add(p.Addr_zip_cd_Label);
		p.AddrPanel.add(p.Addr_zip_cd);
		p.Addr_zip_cd.setNextBeans(p.Addr_addr1);
		p.Addr_zip_cd.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.zip_cd_META);
		p.AddrPanel.add(p.Addr_addr1_Label);
		p.AddrPanel.add(p.Addr_addr1);
		p.Addr_addr1.setNextBeans(p.Addr_addr2);
		p.Addr_addr1.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.addr1_META);
		p.AddrPanel.add(p.Addr_addr2_Label);
		p.AddrPanel.add(p.Addr_addr2);
		p.Addr_addr2.setNextBeans(p.Addr_addr3);
		p.Addr_addr2.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.addr2_META);
		p.AddrPanel.add(p.Addr_addr3_Label);
		p.AddrPanel.add(p.Addr_addr3);
		p.Addr_addr3.setNextBeans(p.Addr_addr4);
		p.Addr_addr3.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.addr3_META);
		p.AddrPanel.add(p.Addr_addr4_Label);
		p.AddrPanel.add(p.Addr_addr4);
		p.Addr_addr4.setNextBeans(p.Addr_tel);
		p.Addr_addr4.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.addr4_META);
		p.AddrPanel.add(p.Addr_tel_Label);
		p.AddrPanel.add(p.Addr_tel);
		p.Addr_tel.setNextBeans(p.Addr_fax);
		p.Addr_tel.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.tel_META);
		p.AddrPanel.add(p.Addr_fax_Label);
		p.AddrPanel.add(p.Addr_fax);
		p.Addr_fax.setNextBeans(p.Addr_cntct_dpt);
		p.Addr_fax.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.fax_META);
		p.AddrPanel.add(p.Addr_cntct_dpt_Label);
		p.AddrPanel.add(p.Addr_cntct_dpt);
		p.Addr_cntct_dpt.setNextBeans(p.Addr_cntct_psn);
		p.Addr_cntct_dpt.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.cntct_dpt_META);
		p.AddrPanel.add(p.Addr_cntct_psn_Label);
		p.AddrPanel.add(p.Addr_cntct_psn);
		p.Addr_cntct_psn.setRow(p.getAddrR(), mcframe.clientMAUB.MAUBP0410.AddrR.cntct_psn_META);
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MAUBP_Addr_H_MC.mcInitAddr((MAUBP_Addr_H)this);

		// [ENABLE]ステータスのモードの設定
		MAUBP_Addr_H_MC.statusInitENABLE_Addr((MAUBP_Addr_H)this);

		// [READ_ONLY]ステータスのモードの設定
		MAUBP_Addr_H_MC.statusInitREAD__ONLY_Addr((MAUBP_Addr_H)this);

	}

	/**
	 *  [Addr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitAddr(MAUBP_Addr_H p) {
		p.Addr_show_dtl.addAllListener(p);
		p.Addr_show_dtl.setAPMethodName("doAddr_show_dtl");
		p.Addr_lg_grp_cd.setListListener(p);
		p.Addr_lg_grp_cd.addAllListener(p);
		p.Addr_lg_grp_nm.setListListener(p);
		p.Addr_lg_grp_nm.addAllListener(p);
		p.Addr_cntry_cd.setListListener(p);
		p.Addr_cntry_cd.addAllListener(p);
		p.Addr_cntry_nm.setListListener(p);
		p.Addr_cntry_nm.addAllListener(p);
		p.Addr_zip_cd.setListListener(p);
		p.Addr_zip_cd.addAllListener(p);
		p.Addr_addr1.setListListener(p);
		p.Addr_addr1.addAllListener(p);
		p.Addr_addr2.setListListener(p);
		p.Addr_addr2.addAllListener(p);
		p.Addr_addr3.setListListener(p);
		p.Addr_addr3.addAllListener(p);
		p.Addr_addr4.setListListener(p);
		p.Addr_addr4.addAllListener(p);
		p.Addr_tel.setListListener(p);
		p.Addr_tel.addAllListener(p);
		p.Addr_fax.setListListener(p);
		p.Addr_fax.addAllListener(p);
		p.Addr_cntct_dpt.setListListener(p);
		p.Addr_cntct_dpt.addAllListener(p);
		p.Addr_cntct_psn.setListListener(p);
		p.Addr_cntct_psn.addAllListener(p);
	}

	/**
	 * [ENABLE]ステータスの[Addr]ブロックのモードの設定
	 */
	protected static void statusInitENABLE_Addr(MAUBP_Addr_H p){
		p.Addr_show_dtl.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_lg_grp_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_lg_grp_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Addr_cntry_cd.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Addr_cntry_nm.putMode(p, ENABLE, MCMode.READ_ONLY);
		p.Addr_zip_cd.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_addr1.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_addr2.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_addr3.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_addr4.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_tel.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_fax.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_cntct_dpt.putMode(p, ENABLE, MCMode.ENABLE);
		p.Addr_cntct_psn.putMode(p, ENABLE, MCMode.ENABLE);

	}

	/**
	 * [READ_ONLY]ステータスの[Addr]ブロックのモードの設定
	 */
	protected static void statusInitREAD__ONLY_Addr(MAUBP_Addr_H p){
		p.Addr_show_dtl.putMode(p, READ_ONLY, MCMode.ENABLE);
		p.Addr_lg_grp_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_lg_grp_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_cntry_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_cntry_nm.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_zip_cd.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_addr1.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_addr2.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_addr3.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_addr4.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_tel.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_fax.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_cntct_dpt.putMode(p, READ_ONLY, MCMode.READ_ONLY);
		p.Addr_cntct_psn.putMode(p, READ_ONLY, MCMode.READ_ONLY);

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
		Addr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Addr_lg_grp_cd.getListConfig().setPutter(getAddr_lg_grp_cd_ListPutter());
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
	 * [Addr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createAddr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Addr_lg_grp_cd) return getAddr_lg_grp_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Addr_show_dtl) doAddr_show_dtl(info);
	}

	/**
	 * [Addr]パネルの[show_dtl]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doAddr_show_dtl(MCEventInfo info);

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
		if (vc == Addr_lg_grp_cd) return doAddr_lg_grp_cd_VC(info);
		if (vc == Addr_lg_grp_nm) return doAddr_lg_grp_nm_VC(info);
		if (vc == Addr_cntry_cd) return doAddr_cntry_cd_VC(info);
		if (vc == Addr_cntry_nm) return doAddr_cntry_nm_VC(info);
		if (vc == Addr_zip_cd) return doAddr_zip_cd_VC(info);
		if (vc == Addr_addr1) return doAddr_addr1_VC(info);
		if (vc == Addr_addr2) return doAddr_addr2_VC(info);
		if (vc == Addr_addr3) return doAddr_addr3_VC(info);
		if (vc == Addr_addr4) return doAddr_addr4_VC(info);
		if (vc == Addr_tel) return doAddr_tel_VC(info);
		if (vc == Addr_fax) return doAddr_fax_VC(info);
		if (vc == Addr_cntct_dpt) return doAddr_cntct_dpt_VC(info);
		if (vc == Addr_cntct_psn) return doAddr_cntct_psn_VC(info);
		return true;
	}

	/**
	 * [Addr]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Addr]パネルの[cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doAddr_cntct_psn_VC(MCEventInfo info){
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
		if (nc == Addr_lg_grp_cd) doAddr_lg_grp_cd_NC(info);
		else if (nc == Addr_lg_grp_nm) doAddr_lg_grp_nm_NC(info);
		else if (nc == Addr_cntry_cd) doAddr_cntry_cd_NC(info);
		else if (nc == Addr_cntry_nm) doAddr_cntry_nm_NC(info);
		else if (nc == Addr_zip_cd) doAddr_zip_cd_NC(info);
		else if (nc == Addr_addr1) doAddr_addr1_NC(info);
		else if (nc == Addr_addr2) doAddr_addr2_NC(info);
		else if (nc == Addr_addr3) doAddr_addr3_NC(info);
		else if (nc == Addr_addr4) doAddr_addr4_NC(info);
		else if (nc == Addr_tel) doAddr_tel_NC(info);
		else if (nc == Addr_fax) doAddr_fax_NC(info);
		else if (nc == Addr_cntct_dpt) doAddr_cntct_dpt_NC(info);
		else if (nc == Addr_cntct_psn) doAddr_cntct_psn_NC(info);
	}

	/**
	 * [Addr]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == Addr_lg_grp_cd) doAddr_lg_grp_cd_NE(info);
		else if (ne == Addr_lg_grp_nm) doAddr_lg_grp_nm_NE(info);
		else if (ne == Addr_cntry_cd) doAddr_cntry_cd_NE(info);
		else if (ne == Addr_cntry_nm) doAddr_cntry_nm_NE(info);
		else if (ne == Addr_zip_cd) doAddr_zip_cd_NE(info);
		else if (ne == Addr_addr1) doAddr_addr1_NE(info);
		else if (ne == Addr_addr2) doAddr_addr2_NE(info);
		else if (ne == Addr_addr3) doAddr_addr3_NE(info);
		else if (ne == Addr_addr4) doAddr_addr4_NE(info);
		else if (ne == Addr_tel) doAddr_tel_NE(info);
		else if (ne == Addr_fax) doAddr_fax_NE(info);
		else if (ne == Addr_cntct_dpt) doAddr_cntct_dpt_NE(info);
		else if (ne == Addr_cntct_psn) doAddr_cntct_psn_NE(info);
	}

	/**
	 * [Addr]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == Addr_lg_grp_cd) doAddr_lg_grp_cd_NX(info);
		else if (nx == Addr_lg_grp_nm) doAddr_lg_grp_nm_NX(info);
		else if (nx == Addr_cntry_cd) doAddr_cntry_cd_NX(info);
		else if (nx == Addr_cntry_nm) doAddr_cntry_nm_NX(info);
		else if (nx == Addr_zip_cd) doAddr_zip_cd_NX(info);
		else if (nx == Addr_addr1) doAddr_addr1_NX(info);
		else if (nx == Addr_addr2) doAddr_addr2_NX(info);
		else if (nx == Addr_addr3) doAddr_addr3_NX(info);
		else if (nx == Addr_addr4) doAddr_addr4_NX(info);
		else if (nx == Addr_tel) doAddr_tel_NX(info);
		else if (nx == Addr_fax) doAddr_fax_NX(info);
		else if (nx == Addr_cntct_dpt) doAddr_cntct_dpt_NX(info);
		else if (nx == Addr_cntct_psn) doAddr_cntct_psn_NX(info);
	}

	/**
	 * [Addr]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Addr_lg_grp_cd) doAddr_lg_grp_cd_LC(info);
		else if (lc == Addr_lg_grp_nm) doAddr_lg_grp_nm_LC(info);
		else if (lc == Addr_cntry_cd) doAddr_cntry_cd_LC(info);
		else if (lc == Addr_cntry_nm) doAddr_cntry_nm_LC(info);
		else if (lc == Addr_zip_cd) doAddr_zip_cd_LC(info);
		else if (lc == Addr_addr1) doAddr_addr1_LC(info);
		else if (lc == Addr_addr2) doAddr_addr2_LC(info);
		else if (lc == Addr_addr3) doAddr_addr3_LC(info);
		else if (lc == Addr_addr4) doAddr_addr4_LC(info);
		else if (lc == Addr_tel) doAddr_tel_LC(info);
		else if (lc == Addr_fax) doAddr_fax_LC(info);
		else if (lc == Addr_cntct_dpt) doAddr_cntct_dpt_LC(info);
		else if (lc == Addr_cntct_psn) doAddr_cntct_psn_LC(info);
	}

	/**
	 * [Addr]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_tel_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_fax_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Addr]パネルの[cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doAddr_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Addr_lg_grp_cd]の作成メソッド
	 */
	public MCList getAddr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		return super.createBridge(id);
	}
}