package mcframe.clientMAUA.MAUAP1020;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.container.MCConstRow;

import mcframe.clientFXBA.FXBAP0130.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP5190.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.util.LinkedHashMap;
import mcframe.commonCore.param.MCParam;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientFXBA.FXBAP0010.FXBAP_PanelBase;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.BpCols;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MAUAP_Bp"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MAUAP_Bp_MC extends MAUAP_Bp_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	protected RsltHdrR _tmpRsltHdrR = RsltHdrR.create();
	protected LinkedHashMap<String,String> _mapForClmNm = new LinkedHashMap<>();
	protected final double _default_proportion = 0.56;
	protected final int _default_location = 200;
	protected final int _after_srch_location = 378;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MAUAP_Bp_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START
		createClmNameMap();
		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MAUAP_Bp_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	//ディバイダの位置を調整する
	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		getSplitPane(TopPanel).setDividerLocation(220);
	}
	
	/**
	 * Panel[Cnd]のボタン[cnd_select_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_select_all(MCEventInfo info) {
		setSrchCndFlgOn();
	}
	/**
	 * Panel[Cnd]のボタン[cnd_deselect_all]の押下時の処理
	 */
	@Override
	public void doCnd_cnd_deselect_all(MCEventInfo info) {
		setSrchCndFlgOff();
	}
	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		Rslt_bp_grp_p_PPanel.afterCallParts_sub();
		callListSrch();
	}
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callListSrch();
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , true);
		}
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		for(RsltR row : RsltTable.getViewRows() ){
			setValueEx(columnRslt_check, row.getGUIIndex() , false);
		}
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		doAccept();
	}

	@Override
	public MCList getAcceptList(MCLinkBeans target, boolean isDCEvent) {
		setEditingContents();
		removeBpNm();
		return super.getAcceptList(target, isDCEvent);
	}

	@Override
	public void setOpenFocus() {
		// タブがある場合はこのメソッドを呼ばないとフィールドにフォーカスされない
		FoldTab.focusActiveFirstComponent();
	}

	@Override
	protected String[] getInitValueCols() {
		return new String[] {
				BpCols.$i_cst_flg, BpCols.$i_acst_flg, BpCols.$i_bcst_flg,
				BpCols.$i_rcst_flg, BpCols.$i_dlv_flg, BpCols.$i_dest_flg,
				BpCols.$i_cred_flg, BpCols.$i_sppl_flg, BpCols.$i_asppl_flg,
				BpCols.$i_bsppl_flg, BpCols.$i_psppl_flg, BpCols.$i_maker_flg,
				BpCols.$i_tdlv_flg, BpCols.$i_bp_is_srch_typ, BpCols.$i_mode_nullval_flg,
				BpCols.$i_sundry_bp_nm_rem_flg, BpCols.$i_cst_iv_flg, BpCols.$i_dt,
				BpCols.$i_debt_cred_id_typ, BpCols.$i_check_rem_flg, BpCols.$i_ref_bp_cd,
				BpCols.$i_cst_sundry_cntn_flg
				, BpCols.$i_bsppl_cd
		};
	}

	@Override
	protected String[] getInitModeCols() {
		return new String[] {
				BpCols.$m_cst_flg, BpCols.$m_acst_flg, BpCols.$m_bcst_flg,
				BpCols.$m_rcst_flg, BpCols.$m_dlv_flg, BpCols.$m_dest_flg,
				BpCols.$m_cred_flg, BpCols.$m_sppl_flg, BpCols.$m_asppl_flg,
				BpCols.$m_bsppl_flg, BpCols.$m_psppl_flg, BpCols.$m_maker_flg,
				BpCols.$m_tdlv_flg
		};
	}

	@Override
	public void valueInit() {
		super.valueInit();

		setBpValue();
		setBpMode();
		adjustRsltHdrSplitPane(_default_location);
	}
	@Override
	public void setInvisibleBySysParam() {
		super.setInvisibleBySysParam();
		if (!isDestEnabled(this)) {
			setComponentInvisibleAllStatus(Cnd_dest_flg, columnRslt_dest_flg);
		}
	}

	@Override
	public void setCondition(MCRow row , String mode){
		super.setCondition(row, mode);
		
		if (row != null) {
			if(GET_LIST == mode){
				getCndR().bp_cd_input(row.getString($INPUT_VAL));
			}
			else {
				getCndR().bp_cd(row.getStringNE($INPUT_VAL));
			}
			
			setBpValue();
			setBpMode();
			adjustRsltHdrSplitPane(_default_location);
		}
	}

	@Override
	protected void saveInitValue(MCRow row) {
		if (!isNull(row.getStringNE(BpCols.$i_debt_cred_id_typ))) {
			row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_DEBT_CRED_ID_TYP
					.bp_is_srch_typ(row.getStringNE(BpCols.$i_debt_cred_id_typ)));
		}
		if (isNull(row.getStringNE(BpCols.$i_bp_is_srch_typ))) {
			row.setStringNE(BpCols.$i_bp_is_srch_typ, MAC_BP_IS_SRCH_TYP.COMM.value());
		}
		super.saveInitValue(row);
	}

	/**
	 * 検索区分名を設定する
	 */
	protected void setSrchTypNm() {
		MAC_BP_IS_SRCH_TYP.putNameNE(getCndR(), CndR.$bp_is_srch_typ, CndR.$bp_is_srch_typ_nm);
	}

	/**
	 * 検索区分に応じて、値を設定する
	 */
	protected void setBpValue() {
		setSrchCndFlgOff();
		setBpGrpFlg();

		String typ = getCndR().bp_is_srch_typ();
		if(isNull(typ)) {
			return;
		}
		setSrchTypNm();
		// 区分０：全取引先
		if (MAC_BP_IS_SRCH_TYP.isCOMM(typ)) {
			setSrchCndFlgOn();
		}
		// 区分１：得意先
		else if (MAC_BP_IS_SRCH_TYP.isCST(typ)) {
			getCndR().cst_flg(true);
		}
		// 区分２：売掛先
		else if (MAC_BP_IS_SRCH_TYP.isACST(typ)) {
			getCndR().acst_flg(true);
		}
		// 区分３：請求先
		else if (MAC_BP_IS_SRCH_TYP.isBCST(typ)) {
			getCndR().bcst_flg(true);
		}
		// 区分４：入金先
		else if (MAC_BP_IS_SRCH_TYP.isRCST(typ)) {
			getCndR().rcst_flg(true);
		}
		// 区分５：発注先
		else if (MAC_BP_IS_SRCH_TYP.isSPPL(typ)) {
			getCndR().sppl_flg(true);
		}
		// 区分６：買掛先
		else if (MAC_BP_IS_SRCH_TYP.isASPPL(typ)) {
			getCndR().asppl_flg(true);
		}
		// 区分７：支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL(typ)) {
			getCndR().bsppl_flg(true);
		}
		// 区分８：支払先
		else if (MAC_BP_IS_SRCH_TYP.isPSPPL(typ)) {
			getCndR().psppl_flg(true);
		}
		// 区分９：与信管理先
		else if (MAC_BP_IS_SRCH_TYP.isCRED(typ)) {
			getCndR().cred_flg(true);
		}
		// 区分１０：納品先
		else if (MAC_BP_IS_SRCH_TYP.isDLV(typ)) {
			getCndR().dlv_flg(true);
		}
		// 区分１１：メーカ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER(typ)) {
			getCndR().maker_flg(true);
		}
		// 区分１２：仕向先
		else if (MAC_BP_IS_SRCH_TYP.isDEST(typ)) {
			getCndR().dest_flg(true);
		}
		// 区分１３：得意先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL(typ)) {
			getCndR().cst_flg(true);
			getCndR().sppl_flg(true);
		}
		// 区分１４：得意先（得意先諸口を含まない）
		else if (MAC_BP_IS_SRCH_TYP.isCST_NOT_SUNDRY(typ)) {
			getCndR().cst_flg(true);
		}
		// 区分１５：配送先
		else if (MAC_BP_IS_SRCH_TYP.isTDLV(typ)) {
			getCndR().tdlv_flg(true);
		}
		// 区分１６：有償支給先
		else if (MAC_BP_IS_SRCH_TYP.isONR_PRSPPL(typ)) {
			setSrchCndFlgOn();
		}
		// 区分１７：得意先（納品先対応）
		else if (MAC_BP_IS_SRCH_TYP.isCST_BY_DLV(typ)) {
			getCndR().cst_flg(true);
		}
		// 区分１８：納品先（得意先対応）
		else if (MAC_BP_IS_SRCH_TYP.isDLV_BY_CST(typ)) {
			getCndR().dlv_flg(true);
		}
		// 区分１９：請求先（入金先対応）
		else if (MAC_BP_IS_SRCH_TYP.isBCST_BY_RCST(typ)) {
			getCndR().bcst_flg(true);
		}
		// 区分２０：納品先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDLV_ONLY(typ)) {
			getCndR().dlv_flg(true);
		}
		// 区分２１：メーカのみ
		else if (MAC_BP_IS_SRCH_TYP.isMAKER_ONLY(typ)) {
			getCndR().maker_flg(true);
		}
		// 区分２２：仕向先のみ
		else if (MAC_BP_IS_SRCH_TYP.isDEST_ONLY(typ)) {
			getCndR().dest_flg(true);
		}
		// 区分２３：納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isDLV_SPPL(typ)) {
			getCndR().dlv_flg(true);
			getCndR().sppl_flg(true);
		}
		// 区分２４：購買内示
		else if (MAC_BP_IS_SRCH_TYP.isPURC_FRCST(typ)) {
			getCndR().sppl_flg(true);
		}
		// 区分２５：請求先または入金先
		else if (MAC_BP_IS_SRCH_TYP.isBCST_RCST(typ)) {
			getCndR().bcst_flg(true);
			getCndR().rcst_flg(true);
		}
		// 区分２６：得意先または納品先または発注先
		else if (MAC_BP_IS_SRCH_TYP.isCST_DLV_SPPL(typ)) {
			getCndR().cst_flg(true);
			getCndR().dlv_flg(true);
			getCndR().sppl_flg(true);
		}
		// 区分２７：インボイス取引対象発注先ではない
		else if (MAC_BP_IS_SRCH_TYP.isNOT_SPPL_IV(typ)) {
			getCndR().sppl_flg(true);
		}
		// 区分２８：発注先_購買
		else if (MAC_BP_IS_SRCH_TYP.isSPPL_PURC(typ)) {
			getCndR().sppl_flg(true);
		}
		// 区分２９：支払予定管理先または支払先
		else if (MAC_BP_IS_SRCH_TYP.isBSPPL_PSPPL(typ)) {
			getCndR().bsppl_flg(true);
			getCndR().psppl_flg(true);
		}
		// 区分３０：債務相殺先
		else if (MAC_BP_IS_SRCH_TYP.isAP_SETOFF(typ)) {
			getCndR().acst_flg(true);
		}
		// 区分３１：得意先または発注先または請求先または支払予定管理先
		else if (MAC_BP_IS_SRCH_TYP.isCST_SPPL_BILL_BSPPL(typ)) {
			getCndR().cst_flg(true);
			getCndR().sppl_flg(true);
			getCndR().bcst_flg(true);
			getCndR().bsppl_flg(true);
		}
	}

	/**
	 * 検索条件の得意先ＦＬＧなどをオンに設定します。
	 */
	protected void setSrchCndFlgOn() {
		getCndR().cst_flg(true);
		getCndR().acst_flg(true);
		getCndR().bcst_flg(true);
		getCndR().rcst_flg(true);
		getCndR().sppl_flg(true);
		getCndR().asppl_flg(true);
		getCndR().bsppl_flg(true);
		getCndR().psppl_flg(true);
		getCndR().cred_flg(true);
		getCndR().dlv_flg(true);
		getCndR().maker_flg(true);
		getCndR().dest_flg(true);
		getCndR().tdlv_flg(true);
	}

	/**
	 * 検索条件の得意先ＦＬＧなどをオフに設定します。
	 */
	protected void setSrchCndFlgOff() {
		getCndR().cst_flg(false);
		getCndR().acst_flg(false);
		getCndR().bcst_flg(false);
		getCndR().rcst_flg(false);
		getCndR().sppl_flg(false);
		getCndR().asppl_flg(false);
		getCndR().bsppl_flg(false);
		getCndR().psppl_flg(false);
		getCndR().cred_flg(false);
		getCndR().dlv_flg(false);
		getCndR().maker_flg(false);
		getCndR().dest_flg(false);
		getCndR().tdlv_flg(false);
	}

	/**
	 * 検索区分に応じて、フィールド、フラグのモードを制御する
	 */
	protected void setBpMode() {
		// 直接入力の場合はモード設定しない
		if (!isCreated()) {
			return;
		}
		
		setBpGrpCdNmMode();
		
		String typ = getCndR().bp_is_srch_typ();
		if(isNull(typ)) {
			return;
		}
		if (MAC_BP_IS_SRCH_TYP.isCOMM(typ)) {
			setDefaultMode(Cnd_cst_flg);
			setDefaultMode(Cnd_acst_flg);
			setDefaultMode(Cnd_bcst_flg);
			setDefaultMode(Cnd_rcst_flg);
			setDefaultMode(Cnd_sppl_flg);
			setDefaultMode(Cnd_asppl_flg);
			setDefaultMode(Cnd_bsppl_flg);
			setDefaultMode(Cnd_psppl_flg);
			setDefaultMode(Cnd_cred_flg);
			setDefaultMode(Cnd_dlv_flg);
			setDefaultMode(Cnd_maker_flg);
			setDefaultMode(Cnd_dest_flg);
			setDefaultMode(Cnd_tdlv_flg);
			setDefaultMode(Cnd_cnd_select_all);
			setDefaultMode(Cnd_cnd_deselect_all);
		}
		else {
			Cnd_cst_flg.setMode(MCMode.READ_ONLY);
			Cnd_acst_flg.setMode(MCMode.READ_ONLY);
			Cnd_bcst_flg.setMode(MCMode.READ_ONLY);
			Cnd_rcst_flg.setMode(MCMode.READ_ONLY);
			Cnd_sppl_flg.setMode(MCMode.READ_ONLY);
			Cnd_asppl_flg.setMode(MCMode.READ_ONLY);
			Cnd_bsppl_flg.setMode(MCMode.READ_ONLY);
			Cnd_psppl_flg.setMode(MCMode.READ_ONLY);
			Cnd_cred_flg.setMode(MCMode.READ_ONLY);
			Cnd_dlv_flg.setMode(MCMode.READ_ONLY);
			Cnd_maker_flg.setMode(MCMode.READ_ONLY);
			Cnd_dest_flg.setMode(MCMode.READ_ONLY);
			Cnd_tdlv_flg.setMode(MCMode.READ_ONLY);
			Cnd_cnd_select_all.setMode(MCMode.READ_ONLY);
			Cnd_cnd_deselect_all.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 取引先分類ＦＬＧのデフォルト値を設定する
	 */
	protected void setBpGrpFlg() {
		getCndR().bp_grp_flg1(false);
		getCndR().bp_grp_flg2(false);
		getCndR().bp_grp_flg3(false);
		getCndR().bp_grp_flg4(false);
		getCndR().bp_grp_flg5(false);
		getCndR().bp_grp_flg6(false);
		getCndR().bp_grp_flg7(false);
		getCndR().bp_grp_flg8(false);
		getCndR().bp_grp_flg9(false);
		getCndR().bp_grp_flg10(false);
	}

	/**
	 * 取引先分類ＣＤ・名のデフォルトモードを設定する
	 */
	protected void setBpGrpCdNmMode() {
		setBpGrpCdNmMode(Cnd_bp_grp_cd1, Cnd_bp_grp_nm1, getCndR().bp_grp_flg1());
		setBpGrpCdNmMode(Cnd_bp_grp_cd2, Cnd_bp_grp_nm2, getCndR().bp_grp_flg2());
		setBpGrpCdNmMode(Cnd_bp_grp_cd3, Cnd_bp_grp_nm3, getCndR().bp_grp_flg3());
		setBpGrpCdNmMode(Cnd_bp_grp_cd4, Cnd_bp_grp_nm4, getCndR().bp_grp_flg4());
		setBpGrpCdNmMode(Cnd_bp_grp_cd5, Cnd_bp_grp_nm5, getCndR().bp_grp_flg5());
		setBpGrpCdNmMode(Cnd_bp_grp_cd6, Cnd_bp_grp_nm6, getCndR().bp_grp_flg6());
		setBpGrpCdNmMode(Cnd_bp_grp_cd7, Cnd_bp_grp_nm7, getCndR().bp_grp_flg7());
		setBpGrpCdNmMode(Cnd_bp_grp_cd8, Cnd_bp_grp_nm8, getCndR().bp_grp_flg8());
		setBpGrpCdNmMode(Cnd_bp_grp_cd9, Cnd_bp_grp_nm9, getCndR().bp_grp_flg9());
		setBpGrpCdNmMode(Cnd_bp_grp_cd10, Cnd_bp_grp_nm10, getCndR().bp_grp_flg10());
	}

	/**
	 * 取引先分類フラグの値に応じて、取引先分類ＣＤ・名のデフォルトモードを設定する
	 * @param cdBeans 取引先分類ＣＤの部品
	 * @param nmBeans 取引先分類名の部品
	 * @param flg 取引先分類フラグの値(true/false)
	 */
	protected void setBpGrpCdNmMode(MCModeBeans cdBeans, MCModeBeans nmBeans, boolean flg) {
		if (flg) {
			setDefaultMode(cdBeans);
			setDefaultMode(nmBeans);
		}
		else {
			cdBeans.setMode(MCMode.READ_ONLY);
			nmBeans.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 名称不要フラグと諸口先フラグに応じて、取引先名を削除する
	 */
	protected void removeBpNm() {
		if (getCndR().getBooleanNE(BpCols.$i_sundry_bp_nm_rem_flg)) {
			MCList<MCRow> sundryList = MCList.create(MCRow.class);
			// 重複は考慮していない
			sundryList.addAll(getRsltL().subList(RsltR.$cst_sundry_flg, true));
			sundryList.addAll(getRsltL().subList(RsltR.$dlv_sundry_flg, true));
			for (MCRow r : sundryList) {
				getRsltL().setStringNE(getRsltL().indexOf(r), BpCols.$o_bp_nm, null);
			}
		}
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}

	@Override
	protected String getISSrchTypCol() {
		return BpCols.$i_bp_is_srch_typ;
	}

	@Override
	protected boolean isEnableSrchTyp(String typ) {
		if (!isNull(typ)){
			return MAC_BP_IS_SRCH_TYP.is_panel(typ);
		}
		return super.isEnableSrchTyp(typ);
	}

	@Override
	protected MCCaller createLLCaller(FXBAP_PanelBase panel, MCParam p, MCRow bind) {
		return new MA_MAUAP1020_ISLLSearcher((MAUAP_Bp) panel, createLLCallerBridge(p, bind));
	}

	public class MA_MAUAP1020_ISLLSearcher<P extends MAUAP_Bp, O extends FXBAP_ISLLCallerPanelBridge>
			extends MAUDP_ISLLSearcher<P, O> {

		protected MA_MAUAP1020_ISLLSearcher(P panel, O b) {
			super(panel, b);
		}
		
		@Override
		protected void show() {
			super.show();
			
			clearRsltHdrContents();
			adjustRsltHdrSplitPane(_after_srch_location);
			
			if (_tmpRsltHdrR.isEmpty()) {
				return;
			}
			MCRow.copyvalue(getRsltHdrR(), _tmpRsltHdrR);
			_tmpRsltHdrR.clear();
		}
	}

	@Override
	public void doRslt_NC(mcframe.clientCore.event.MCEventInfo info) {
		super.doRslt_NC(info);
		
		setEditingContents();
		changeRsltHdr();
		setRsltHdrMode();
	}

	@Override
	public void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		
		if (isSame(openTyp, T1)) {
			if (bind.getBooleanNE("dlv_sundry_flg")
					|| bind.getBooleanNE("cst_sundry_flg")) {
				valueInit();
				if (!isNull(bind.getStringNE($INPUT_VAL))) {
					addDoBehind(Ctrl_ctrl_PPanel.Ope_srch);
				}
				saveRsltHdrBindValue(bind);
			}
		}
		else {
			throw new MCAppException(msgUnknownOpenParam());
		}
	}


	// ///////////////////////////////////////////////
	// 諸口関連（ここから）
	// ///////////////////////////////////////////////

	/**
	 * 諸口取引先の場合に、呼出元画面の値を入力補助画面のインスタンス変数に保存します
	 */
	protected void saveRsltHdrBindValue(MCRow bind) {
		_tmpRsltHdrR.bp_cd(bind.getStringNE($INPUT_VAL));
		_tmpRsltHdrR.bp_nm(bind.getStringNE(RsltHdrR.$bp_nm));
		_tmpRsltHdrR.pri_prnt_flg(bind.getBooleanNE(RsltHdrR.$pri_prnt_flg));
		_tmpRsltHdrR.zip_cd(bind.getStringNE(RsltHdrR.$zip_cd));
		_tmpRsltHdrR.addr1(bind.getStringNE(RsltHdrR.$addr1));
		_tmpRsltHdrR.addr2(bind.getStringNE(RsltHdrR.$addr2));
		_tmpRsltHdrR.addr3(bind.getStringNE(RsltHdrR.$addr3));
		_tmpRsltHdrR.addr4(bind.getStringNE(RsltHdrR.$addr4));
		_tmpRsltHdrR.cntry_cd(bind.getStringNE(RsltHdrR.$cntry_cd));
		_tmpRsltHdrR.cntry_nm(bind.getStringNE(RsltHdrR.$cntry_nm));
		_tmpRsltHdrR.foreign_flg(bind.getBooleanNE(RsltHdrR.$foreign_flg));
		_tmpRsltHdrR.tel(bind.getStringNE(RsltHdrR.$tel));
		_tmpRsltHdrR.fax(bind.getStringNE(RsltHdrR.$fax));
		_tmpRsltHdrR.dlv_sundry_flg(bind.getBooleanNE(RsltHdrR.$dlv_sundry_flg));
		_tmpRsltHdrR.dlv_cntct_dpt(bind.getStringNE(RsltHdrR.$dlv_cntct_dpt));
		_tmpRsltHdrR.dlv_cntct_psn(bind.getStringNE(RsltHdrR.$dlv_cntct_psn));
		_tmpRsltHdrR.cst_sundry_flg(bind.getBooleanNE(RsltHdrR.$cst_sundry_flg));
		_tmpRsltHdrR.cst_cntct_dpt(bind.getStringNE(RsltHdrR.$cst_cntct_dpt));
		_tmpRsltHdrR.cst_cntct_psn(bind.getStringNE(RsltHdrR.$cst_cntct_psn));
	}

	/**
	 * Rsltブロックで選択した行に応じて、RsltHdrブロックの内容を変化させます
	 */
	protected void changeRsltHdr() {
		if (isNull(RsltTable.getSelectedMCRow())) {
			getRsltHdrR().clear();
		}
		else if (!isSame(RsltTable.getSelectedMCRow().bp_cd(), RsltHdr_bp_cd.getValue())) {
			getRsltHdrR().setValuesNE(_mapForClmNm, RsltTable.getSelectedMCRow());
		}
	}

	/**
	 * RsltHdrブロックのフィールドに対して編集可・不可を設定します
	 */
	protected void setRsltHdrMode() {
		boolean cst = false;
		boolean dlv = false;
		if (!isNull(RsltTable.getSelectedMCRow())) {
			cst = RsltTable.getSelectedMCRow().cst_sundry_flg();
			dlv = RsltTable.getSelectedMCRow().dlv_sundry_flg();
		}
		
		if (!(cst || dlv)) {
			setDefaultMode(RsltHdr_bp_nm);
			setDefaultMode(RsltHdr_pri_prnt_flg);
			setDefaultMode(RsltHdr_zip_cd);
			setDefaultMode(RsltHdr_addr1);
			setDefaultMode(RsltHdr_addr2);
			setDefaultMode(RsltHdr_addr3);
			setDefaultMode(RsltHdr_addr4);
			setDefaultMode(RsltHdr_tel);
			setDefaultMode(RsltHdr_fax);
			setDefaultMode(RsltHdr_cst_cntct_dpt);
			setDefaultMode(RsltHdr_cst_cntct_psn);
			setDefaultMode(RsltHdr_dlv_cntct_dpt);
			setDefaultMode(RsltHdr_dlv_cntct_psn);
		}
		else {
			RsltHdr_bp_nm.setMode(MCMode.ENABLE);
			setDefaultMode(RsltHdr_pri_prnt_flg);
			RsltHdr_zip_cd.setMode(MCMode.ENABLE);
			RsltHdr_addr1.setMode(MCMode.ENABLE);
			RsltHdr_addr2.setMode(MCMode.ENABLE);
			RsltHdr_addr3.setMode(MCMode.ENABLE);
			RsltHdr_addr4.setMode(MCMode.ENABLE);
			RsltHdr_tel.setMode(MCMode.ENABLE);
			RsltHdr_fax.setMode(MCMode.ENABLE);
			if (cst) {
				RsltHdr_cst_cntct_dpt.setMode(MCMode.ENABLE);
				RsltHdr_cst_cntct_psn.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(RsltHdr_cst_cntct_dpt);
				setDefaultMode(RsltHdr_cst_cntct_psn);
			}
			if (dlv) {
				RsltHdr_pri_prnt_flg.setMode(MCMode.ENABLE);
				RsltHdr_dlv_cntct_dpt.setMode(MCMode.ENABLE);
				RsltHdr_dlv_cntct_psn.setMode(MCMode.ENABLE);
			}
			else {
				setDefaultMode(RsltHdr_dlv_cntct_dpt);
				setDefaultMode(RsltHdr_dlv_cntct_psn);
			}
		}
	}

	/**
	 * RsltブロックのカラムとRsltHdrのブロックのカラム間に関するマッピングを作成します
	 */
	protected void createClmNameMap() {
		_mapForClmNm.put(RsltR.$bp_cd, RsltHdrR.$bp_cd);
		_mapForClmNm.put(RsltR.$bp_nm, RsltHdrR.$bp_nm);
		_mapForClmNm.put(RsltR.$zip_cd, RsltHdrR.$zip_cd);
		_mapForClmNm.put(RsltR.$pri_prnt_flg, RsltHdrR.$pri_prnt_flg);
		_mapForClmNm.put(RsltR.$addr1, RsltHdrR.$addr1);
		_mapForClmNm.put(RsltR.$addr2, RsltHdrR.$addr2);
		_mapForClmNm.put(RsltR.$addr3, RsltHdrR.$addr3);
		_mapForClmNm.put(RsltR.$addr4, RsltHdrR.$addr4);
		_mapForClmNm.put(RsltR.$cntry_cd, RsltHdrR.$cntry_cd);
		_mapForClmNm.put(RsltR.$cntry_nm, RsltHdrR.$cntry_nm);
		_mapForClmNm.put(RsltR.$foreign_flg, RsltHdrR.$foreign_flg);
		_mapForClmNm.put(RsltR.$tel, RsltHdrR.$tel);
		_mapForClmNm.put(RsltR.$fax, RsltHdrR.$fax);
		_mapForClmNm.put(RsltR.$dlv_sundry_flg, RsltHdrR.$dlv_sundry_flg);
		_mapForClmNm.put(RsltR.$dlv_cntct_dpt, RsltHdrR.$dlv_cntct_dpt);
		_mapForClmNm.put(RsltR.$dlv_cntct_psn, RsltHdrR.$dlv_cntct_psn);
		_mapForClmNm.put(RsltR.$cst_sundry_flg, RsltHdrR.$cst_sundry_flg);
		_mapForClmNm.put(RsltR.$cst_cntct_dpt, RsltHdrR.$cst_cntct_dpt);
		_mapForClmNm.put(RsltR.$cst_cntct_psn, RsltHdrR.$cst_cntct_psn);
	}

	/**
	 * RsltHdrブロックの取引先ＣＤと同じ値を持つRsltブロックの行を返します。
	 * 該当する行がない場合は、空のRowを返します。
	 */
	protected RsltR getRsltRowOnRsltHdr() {
		for (RsltR r : RsltTable.getViewRows()) {
			if (isSame(r.bp_cd(), getRsltHdrR().bp_cd())) {
				return r;
			}
		}
		return RsltR.create();
	}

	/**
	 * RsltHdrブロックの内容を、同じ取引先ＣＤを持つRsltブロックの行に設定します
	 */
	protected void setEditingContents() {
		if (isNull(RsltHdr_bp_cd.getValue())) {
			return;
		}
		if (!RsltHdr_cst_sundry_flg.getValue() && !RsltHdr_dlv_sundry_flg.getValue()) {
			return;
		}
		getRsltRowOnRsltHdr().setValuesNE(_mapForClmNm, getRsltHdrR());
	}

	protected void clearRsltHdrContents() {
		getRsltHdrR().clear();
	}

	protected void adjustRsltHdrSplitPane(int location) {
		MCSplitPane sp = getClosestSplitPane(RsltHdrPanel);
		if (sp != null) {
			if (!sp.isShowing()) {
				// 画面起動時は比率でのみ位置を調整可能
				sp.setDividerLocation(_default_proportion);
				return;
			}
			sp.useProportionalLocation(false);
			sp.setDefault();
			sp.setDividerLocation(location);
		}
	}

	protected MCSplitPane getClosestSplitPane(Container p) {
		if (p == null) {
			return null;
		}
		if (p instanceof MCSplitPane) {
			return (MCSplitPane) p;
		}
		return getClosestSplitPane(p.getParent());
	}

	// ///////////////////////////////////////////////
	// 諸口関連（ここまで）
	// ///////////////////////////////////////////////

}