package mcframe.clientMSBB.MSBBP0010;

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

import mcframe.clientFSUB.FSUBP0060.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5310.*;
import mcframe.clientMSUB.MSUBP0010.*;

import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.clientMAUC.MAUCP0040.MAUCP_AppScreenOpener;
import mcframe.clientMAUD.MAUDP0080.MAUDP_CellConfig;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import static mcframe.commonMAUD.MAUDC0120.MAUDC_ListLogicBase.*;
import static mcframe.clientMAUC.MAUCP0010.MAUCP_MCDataUtil.*;
import static mcframe.clientMAUC.MAUCP0020.MAUCP_AppSys.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
//import static mcframe.commonMBUA.MBUAC0010.MBUAC_List.*;
import static mcframe.commonMBUD.MBUDC0120.MBUDC_ListLogicBase.*;
import static mcframe.clientMBUC.MBUCP0010.MBUCP_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;
import static mcframe.commonMSUA.MSUAC0010.MSUAC_List.*;


//カスタマイズのimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import static mcframe.clientMAUC.MAUCP0140.MAUCP_DateUtil.*;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientFXBA.FXBAP0100.FXBAP_PopupConfig;
import mcframe.clientCore.beans.popup.MCPopupBeans;
import mcframe.clientCore.beans.popup.MCPopupConfig;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.beans.list.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBBP_CstFrcstReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBBP_CstFrcstReg_MC extends MSBBP_CstFrcstReg_MC_A implements IfOpePanel, IfRowMoveBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBBP_CstFrcstReg_MC() {
		super();
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR START

		//FMCB CUSTOM_CONSTRUCTOR END
	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBBP_CstFrcstReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBBL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Srch01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Srch01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBBL0010_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			// 検索処理後のモード制御
			if (Cnd_ope_DEL.isSelected()) {
				if (getHdrR().can_flg()) {
					dialog(MSBBP0027);
					getCndR().ope(Cnd_ope_REF.getActionCommand());
					setREFStatus();
				}
			}
		}
	}

	/**
	 * [MS_MSBBL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Sprt01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Sprt01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBBL0010_Sprt01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBBP0018);
		}
		
		@Override
		protected void checkReq(MCMessageList msgList) {
			// superは呼ばない
			msgList.addAll(panel.checkReq(Hdr_cst_cd));
			msgList.addAll(panel.checkReq(Hdr_frcst_dpt_cd));
			msgList.addAll(panel.checkReq(Hdr_cst_frcst_prnt_dt));
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())){
				msgList.addAll(panel.checkReq(r));
			}
		}
	}

	/**
	 * [MS_MSBBL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Ins01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Ins01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL0010_Ins01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			getCndR().cst_frcst_no(getHdrR().cst_frcst_no());
		}
	}

	/**
	 * [MS_MSBBL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Upd01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Upd01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBBL0010_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Del01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Del01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBBL0010_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBBL0010_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBBL0010_Imp01Caller<P extends MSBBP_CstFrcstReg, B extends MS_MSBBL0010_Imp01Bridge>
			extends mcframe.clientMAUD.MAUDP0010.MAUDP_FileImporter<P, B> {

		protected MS_MSBBL0010_Imp01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void setMode() {
			super.setMode();
			if (hasNg()) {
				setFIX_IStatus();
			}
			else {
				if (!isNull(bridge.down0().cst_frcst_no())){
					setUPDStatus();
					getCndR().ope(Cnd_ope_UPD.getActionCommand());
					
				}
				else{
					setINSStatus();
					getCndR().ope(Cnd_ope_INS.getActionCommand());
				}
			}
		}

		protected boolean hasNg() {
			if (!isNull(bridge.down1().getFirst(DtlR.$rtn_sts_typ,
					MAC_RTN_STS_TYP.ERR.value()))) {
				return true;
			}
			return false;
		}

		@Override
		protected void handleMCEx(MCException ex) {
			super.handleMCEx(ex);
			setFIX_UStatus();
		}
	}

	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		super.doCnd_ope_NC(info);
		if (Cnd_ope_IMP.isSelected()) {
			setINS_FILEStatus();
			setValueEx(Cnd_cst_frcst_no, null);
		}
	}	

	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBBL0010_Srch01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBBP1210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBBP1210(MCEventInfo info) {
		MCRow bind = MCRow.create();
		MCList<MCRow> list = MCList.create(MCRow.class);
		setMSBBP1210Hdr(bind);
		setMSBBP1210Dtl(list);
		openPanel("MS", "MSBBP1210", T1, bind, list);
	}

	/**
	 * 遷移先(受注登録画面)のヘッダ項目設定
	 */
	protected void setMSBBP1210Hdr(MCRow bind) {
		
		bind.addStringColumn("dlv_cd", getHdrR().dlv_cd());
		bind.addStringColumn("cst_cd", getHdrR().cst_cd());
		bind.addStringColumn("sls_usr_cd", getHdrR().frcst_usr_cd());
		bind.addStringColumn("sls_dpt_cd", getHdrR().frcst_dpt_cd());
		bind.addStringColumn("wrk_no", getHdrR().wrk_no());
	}
	
	/**
	 * 遷移先(受注登録画面)の明細項目設定
	 */
	protected void setMSBBP1210Dtl(MCList<MCRow> list) {
		
		for (DtlR dtlR : DtlTable.getViewRows()) {
			if (dtlR.isStatusDelete() || dtlR.isEmpty()) {
				continue;
			}
			MCRow row = MCRow.create();
			row.addStringColumn("itm_cd", dtlR.itm_cd());
			row.addStringColumn("itm_sub1", dtlR.itm_sub1());
			row.addStringColumn("itm_sub2", dtlR.itm_sub2());
			row.addStringColumn("itm_sub3", dtlR.itm_sub3());
			row.addStringColumn("trd_unit_cd", dtlR.trd_unit_cd());
			row.addNumberColumn("trd_unit_qty", dtlR.trd_unit_qty());
			row.addStringColumn("cst_itm_cd", dtlR.cst_itm_cd());
			row.addStringColumn("cst_itm_nm", dtlR.cst_itm_nm());
			
			list.add(row);
		}
	}

	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(DtlTable, columnDtl_fix_flg);
	}

	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(DtlTable, columnDtl_fix_flg);
	}
	
	/**
	 * Panel[Btn]のボタン[sprt_ref]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ref(MCEventInfo info) {
		callMS_MSBBL0010_Sprt01();
	}

	/**
	 * Panel[Btn]のボタン[radd]の押下時の処理
	 */
	@Override
	public void doBtn_radd(MCEventInfo info) {
		insertRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rdel]の押下時の処理
	 */
	@Override
	public void doBtn_rdel(MCEventInfo info) {
		deleteRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}

	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBBL0010_Ins01();
	}

	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBBL0010_Upd01();
	}

	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBBL0010_Del01();
	}

	// --------------------------------------------------------------
	//画面初期化処理
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
	}

	@Override
	protected void setupParts() {
		super.setupParts();

		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd,
				columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
				columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
				columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty,
				columnDtl_base_unit_cd);

		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		
		Dtl_prms_qty_p_PPanel.setRelateBeans(columnDtl_trd_unit_cd,
				columnDtl_trd_unit_dec_place);
		
		Hdr_usr_dpt_p_PPanel.setRelateBeans(Hdr_cst_frcst_prnt_dt);
	}

	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		CndPanel.focusFirstComponent();
	}

	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(createDtlTableCellConfig());
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		
		MCRow row = super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_cst_itm_cd) {
			// 入力補助画面の参照項目を一時カラムとして追加する
			// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			
			// 明細の内示期間開始日が入力されている場合はそちらを、
			// そうでない場合は運用日付を参照する
			MCDate dt = nvl(getDtlL().get(eventIndex).frcst_st_dt(), getToday());
			bind.setDateNE(CstItmCols.$i_dt, dt);
		}
		
		return row;
	}
	
	@Override
	public void openISPanel(MCLinkBeans beans, int i) {
		if (columnDtl_cst_itm_cd == beans) {
			ISPanelLinker ret = getISPanelLinkerNE(beans);
			if (ret != null && ret.isEnable()) {
				MCMessageList msgList = new MCMessageList();
				chkOpenMSUAP1140Req(msgList);

				if (!msgList.isEmpty()) {

					message(msgList);
					return;
				}
				super.openISPanel(beans, i);
			}
		}
		else {
			super.openISPanel(beans, i);
		}
	}

	/**
	 * 得意先品目入力補助画面の必須チェックを行う。
	 * @param msgList メッセージリスト
	 * @param i 対象行のインデックス
	 */
	protected void chkOpenMSUAP1140Req(MCMessageList msgList) {
		msgList.addAll(checkReq(Hdr_cst_cd));
	}
	
	protected class CstItmListPutter extends MCListPutter {

		public CstItmListPutter(MCLinkBeans compo, String[] columns) {
			super(compo, columns);
		}
		
		public MCMessageList setValues(int index, MCRow row) {
			MCLinkBeans compo = getLinkBeans();

			MCRow setRow =  createPanelRow(compo, index, isNull(row) ? MCRow.create() :row);
			DtlR selectRow = DtlTable.getRow(index);

			if (!isNull(setRow.getStringNE("itm_cd"))) {	
				return compo.setValues(index, setRow);
			}	
				
			setRow.setStringNE("itm_cd", selectRow.itm_cd());	
			setRow.setStringNE("itm_sub1", selectRow.itm_sub1());	
			setRow.setStringNE("itm_sub2", selectRow.itm_sub2());	
			setRow.setStringNE("itm_sub3", selectRow.itm_sub3());	
			
			return compo.setValues(index, setRow);	
		}
	}
	
	@Override
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new CstItmListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
	}
	
	
	// --------------------------------------------------------------
	// イベント
	@Override
	protected void listenerInit() {
		super.listenerInit();
		
		Dtl_itm_p_PPanel.addItmLCListner(this);
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);

		if (Dtl_itm_p_PPanel.isItm(lc)) doDtl_itm_LC(info);
	}
	
	@Override
	protected void setOpeStatus(String bfOpe, String afOpe, String bfSt) {
		super.setOpeStatus(bfOpe, afOpe, bfSt);
		if (isSame(afOpe, Cnd_ope_IMP.getActionCommand())) {
			setINS_FILEStatus();
		}
	}
	
	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 登録枠のクリア
		if (!isSame(bfOpe, Cnd_ope_IMP.getActionCommand()) && isSame(afOpe, Cnd_ope_IMP.getActionCommand())) {
			clearContainers(p.opePanelGetRegBlocks());
		}
	}
	
	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {
		
		if (getHdrR().can_flg()) {
			if (isREFOpe(bfOpe) && isREFStatus(bfSt) && isDELOpe(afOpe)) {
				dialog(MSBBP0027);
				return false;
 			}
		}
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}

	@Override
	public void doHdr_cst_cd_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doHdr_cst_cd_LC(info);
		setValueEx(Hdr_frcst_usr_cd, null);
		setValueEx(Hdr_frcst_dpt_cd, null);
		
		// 担当者と担当部門の設定
		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_frcst_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_frcst_dpt_cd, getHdrR().cst_dpt_cd());
		}
		
		setCstItm();
	}

	@Override
	public void doDtl_frcst_period_typ_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_frcst_period_typ_LC(info);
		int idx = info.getEventIndex();
		setValueEx(columnDtl_frcst_st_dt, idx, null);
		setValueEx(columnDtl_frcst_end_dt, idx, null);
	}

	@Override
	public void doDtl_frcst_st_dt_LC(mcframe.clientCore.event.MCEventInfo info) {
		super.doDtl_frcst_st_dt_LC(info);
		int idx = info.getEventIndex();
		if (idx > -1) {
			setFrcstDt(getDtlL().get(idx));
			setCstItm(getDtlL().get(idx));
		}
	}

	protected void setFrcstDt(DtlR r) {
		MCDate baseDt = r.frcst_st_dt();
		if (isNull(baseDt)) {
			r.frcst_dt(null);
			r.frcst_end_dt(null);
		}
		else {
			String periodTyp = r.frcst_period_typ();
			MCNumber acClDay = getCo().ac_cl_day();

			r.frcst_dt(getPeriodStDt(baseDt, periodTyp, acClDay));
			r.frcst_end_dt(getPeriodEndDt(baseDt, periodTyp, acClDay));
		}
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 明細
	 */
	protected void setCstItm(DtlR dtlR) {
		// 明細の内示期間開始日が入力されている場合はそちらを、
		// そうでない場合は運用日付を参照する
		MCDate dt = nvl(dtlR.frcst_st_dt(), getToday());
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), dt, this);
		if (isNull(row)) {
			row = MCRow.create();
			row.addStringColumn("bp_itm_cd");
		}
		// イベント発火順の都合上設定したsetIgnoreListBeans(...)によって
		// 品目、枝番にnullを渡すとsetValuesメソッドでnullに上書きされる。
		// これらを防止するため、メソッド呼び出し元の品目関連の情報をRowにすべて設定する。
		row.addStringColumn("itm_cd", dtlR.itm_cd());
		row.addStringColumn("itm_sub1", dtlR.itm_sub1());
		row.addStringColumn("itm_sub2", dtlR.itm_sub2());
		row.addStringColumn("itm_sub3", dtlR.itm_sub3());
		columnDtl_cst_itm_cd.setValues(dtlR.getGUIIndex(), row);
	}
	
	/**
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if (isEditable(columnDtl_cst_itm_cd, dtlR.getGUIIndex())) {
				setCstItm(dtlR);
			}
		}
	}
	
	/**
	 * 品目の変更
	 * 
	 * @param info
	 */
	protected void doDtl_itm_LC(MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			setCstItm(dtlR);
		}

	}
	

	// --------------------------------------------------------------
	// 画面ステータス
	/***
	 * 現在のステータスが入力可能なステータスかどうかを返す。
	 * (UPD_CANは含まない)
	 * 
	 * 
	 * @return
	 */
	protected boolean isInsUpdStatus() {
		if (isSame(getStatus(), INS) || isSame(getStatus(), UPD)) {
			return true;
		}
		return false;
	}

	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINSStatus() {
		super.setINSStatus();
		HdrPanel.focusFirstComponent();
		setOpenBtnMode();
	}

	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		
		if (getHdrR().can_flg()) {
			setUPD_CANStatus();
		}
		else {
			HdrPanel.focusFirstComponent();
			DtlTable.selectRowNoFocus(0);
		}
	}
	
	@Override
	public void setUPD_CANStatus() {
		super.setUPD_CANStatus();
		HdrPanel.focusFirstComponent();
		DtlTable.selectRowNoFocus(0);
	}

	@Override
	public void setDELStatus() {
		super.setDELStatus();
		HdrPanel.focusFirstComponent();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		DtlTable.selectLeftmostColumn(0);
		setOpenBtnMode();
	}

	@Override
	public void setFIX_IStatus() {
		super.setFIX_IStatus();
		ScreenOpePanel.focusFirstComponent();
	}

	@Override
	public void setFIX_UStatus() {
		super.setFIX_UStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setFIX_DStatus() {
		super.setFIX_DStatus();
		CndPanel.focusFirstComponent();
	}

	@Override
	public void setINS_FILEStatus() {
		super.setINS_FILEStatus();
		DtlTable.fillSpace();
	}
	
	protected void setOpenBtnMode(){
		if (isNull(getHdrR().cst_cd()) || getHdrR().can_flg()){
			Btn_open_MSBBP1210.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_open_MSBBP1210);
		}
	}
	// --------------------------------------------------------------
	// リストロジック
	@Override
	public MCList getDtl_frcst_period_typ(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispPeriodTyp());
		return super.getDtl_frcst_period_typ(row, info);
	}

	protected MAC_PERIOD_TYP[] getDispPeriodTyp() {
		return new MAC_PERIOD_TYP[] {
				MAC_PERIOD_TYP.WEEKLY, MAC_PERIOD_TYP.TENDAYS, MAC_PERIOD_TYP.MONTHLY
		};
	}

	@Override
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		// 明細の内示期間開始日が入力されている場合はそちらを、
		// そうでない場合は運用日付を参照する
		MCDate dt = nvl(dtlR.frcst_st_dt(), getToday());
		row.setDateNE(CstItmCols.$i_dt, dt);
		
		return super.getDtl_cst_itm_cd(row, info);
	}
	// --------------------------------------------------------------
	//セルコンフィグ

	protected DtlTableCellConfig createDtlTableCellConfig() {
		return new DtlTableCellConfig();
	}

	protected class DtlTableCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			if (isInsUpdStatus()) {
				if (column == columnDtl_frcst_st_dt || column == columnDtl_frcst_end_dt) {
					if (isNull(r.frcst_period_typ())) {
						return MCMode.READ_ONLY;
					}
				}
			}
			return super.getPriorMode(index, column, table);
		}
	}

	// --------------------------------------------------------------
	@Override
	public boolean useFileIn(MCTable table) {
		if (table == DtlTable) {
			return Cnd_ope_IMP.isSelected() && isSame(getStatus(), INS_FILE);
		}
		return super.useFileIn(table);
	}

	@Override
	protected void doCustomFileInAction(MCTable<?> table, MCList list,
			MCMessageList msgList) {
		if (msgList.isEmpty()) {
			list.setStatus(MCRow.Status.CREATE);
			table.getList().setAll(list);
			changeFileInRowStatus();
		}
		super.doCustomFileInAction(table, list, msgList);
	}
	
	@Override
	protected void doFileInSuccessAction(MCTable<?> table) {
		super.doFileInSuccessAction(table);
		callMS_MSBBL0010_Imp01();
	}

	@Override
	protected FXBAP_PopupConfig createFXBAP_PopupConfig(MCPopupBeans beans) {
		FXBAP_PopupConfig config = super.createFXBAP_PopupConfig(beans);
		if (beans == DtlTable) {
			config.setFileInMenuType(MCPopupConfig.FILE_TYPE_INS_UPD);
		}
		return config;
	}
	
	// --------------------------------------------------------------
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());

		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());

		return ret;
	}

	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);

		if (cont == getHdrR()) {
			list.add(HdrR.$cst_frcst_no);
			list.add(HdrR.$cst_frcst_prnt_dt);
			list.add(HdrR.$rcpt_dt);
			list.add(HdrR.$can_flg);
			list.add(HdrR.$can_rsn_cd);
			list.add(HdrR.$can_rsn_nm);
			list.add(HdrR.$can_rmrks);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$cst_frcst_d_no);
			list.add(DtlR.$fix_flg);
			list.add(DtlR.$frcst_stop_flg);
			list.add(DtlR.$prms_qty);
			list.add(DtlR.$last_qty);
			list.add(DtlR.$last_cst_frcst_prnt_dt);
			list.add(DtlR.$last_rcpt_dt);
			list.add(DtlR.$spln_qty);
			list.add(DtlR.$slo_qty);
		}

		return list;
	}
	
	// --------------------------------------------------------------
	// IfRowMoveBaseの実装
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

}