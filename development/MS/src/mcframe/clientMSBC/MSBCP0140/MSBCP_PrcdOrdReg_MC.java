package mcframe.clientMSBC.MSBCP0140;

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

import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0050.*;
import mcframe.clientMAUB.MAUBP0340.*;
import mcframe.clientMAUB.MAUBP0350.*;
import mcframe.clientMAUB.MAUBP0360.*;
import mcframe.clientMAUB.MAUBP0370.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP0040.*;

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
import static mcframe.clientMSUC.MSUCP0030.MSUCP_ProdUtil.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBCP_PrcdOrdReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBCP_PrcdOrdReg_MC extends MSBCP_PrcdOrdReg_MC_A implements IfOpePanel {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_PrcdOrdReg_MC() {
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
	public MSBCP_PrcdOrdReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBCL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Srch01Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBCL0140_Srch01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void show() {
			super.show();
			setHasOper();
			setOrgItmOdrSts();
			setHdrMfgLocCnd();
		}

		protected void setHasOper() {
			if (getDtlL().isEmpty()) {
				getHdrR().has_oper(false);
			}
			else {
				getHdrR().has_oper(true);
			}
		}

		protected void setOrgItmOdrSts() {
			//更新前オーダ状況区分を保持
			getHdrR().itm_ord_sts_typ_old(getHdrR().itm_ord_sts_typ());
		}
	}

	/**
	 * [MS_MSBCL0140_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Sprt01Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL0140_Sprt01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1007);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// superは呼ばない
			msgList.addAll(panel.checkReq(Hdr_itm_cd));
			msgList.addAll(panel.checkReq(Hdr_strg_loc_cd));
			msgList.addAll(panel.checkReq(Hdr_inst_qty));
			msgList.addAll(panel.checkAtLeastOneInput(
					Hdr_po_schd_dt, Hdr_mfg_st_schd_dt, 
					Hdr_mfg_end_schd_dt, Hdr_gi_schd_dt,
					Hdr_strg_schd_dt, Hdr_accpt_schd_dt,
					Hdr_insp_st_schd_dt, Hdr_insp_end_schd_dt,
					Hdr_avl_schd_dt));
		}
		@Override
		protected void setMode() {
			super.setMode();
			if(getHdrR().insp_flg()){
				setDefaultMode(Hdr_insp_st_schd_dt);
				setDefaultMode(Hdr_insp_end_schd_dt);
			}
			else {
				Hdr_insp_st_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_insp_end_schd_dt.setMode(MCMode.READ_ONLY);
			}
		}
	}

	/**
	 * [MS_MSBCL0140_Sprt02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Sprt02Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Sprt02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBCL0140_Sprt02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected MCMessage msgExecConfirm() {
			return new MCMessage(MSBCP1015);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// superは呼ばない
			msgList.addAll(panel.checkReq(Hdr_itm_cd));
			msgList.addAll(panel.checkReq(Hdr_mfg_loc_cd));
			msgList.addAll(panel.checkReq(Hdr_bom_ptn));
			msgList.addAll(panel.checkReq(Hdr_oper_ptn));
			msgList.addAll(panel.checkReq(Hdr_mfg_st_schd_dt));
			msgList.addAll(panel.checkReq(Hdr_mfg_end_schd_dt));
		}

		@Override
		protected void afterCall() {
			super.afterCall();
			bridge.down0().setStatus(Status.CREATE);
		}

		@Override
		protected void show() {
			showReplace();
			setMstMfgLocForSprt(getHdrR(), getDtlL());
		}

		@Override
		protected void adjustList() {
			super.adjustList();
			DtlTable.adjustWidth();
		}
	}

	/**
	 * [MS_MSBCL0140_Sprt03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Sprt03Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Sprt03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {
	
		protected MS_MSBCL0140_Sprt03Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected void initCaller() {
			super.initCaller();
			//LCで呼ばれるので同期通信とする
			setScreenAsync(false);
		}

		@Override
		protected void checkReq(MCMessageList msgList) {
			// superは呼ばない
		}

		@Override
		protected boolean isDownParamEmpty() {
			// 下り電文の値が空の場合でもそのまま上書きする
			return false;
		}
	}

	/**
	 * [MS_MSBCL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Upd01Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBCL0140_Upd01Caller(P p, B b) {
			super(p, b);
		}

		@Override
		protected boolean checkUpListParamEmpty() {
			if(isCheckAtLeastOneDtl()) {
				return super.checkUpListParamEmpty();
			}
			return true;
		}

		@Override
		protected void setupParam() {
			super.setupParam();
			setMstMfgLocForInsUpd(bridge.up0());
		}

	}

	/**
	 * [MS_MSBCL0140_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0140_Del01Caller<P extends MSBCP_PrcdOrdReg, B extends MS_MSBCL0140_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBCL0140_Del01Caller(P p, B b) {
			super(p, b);
		}
	}

	/** 更新時に明細の存在チェックを行うかどうかを返す */
	protected boolean isCheckAtLeastOneDtl() {
		return MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())
				&& !isNullOrNullVal(getHdrR().oper_ptn());
	}

	/** 工程展開後にマスタ製造場所を反映する */
	protected void setMstMfgLocForSprt(HdrR hdr, MCList<DtlR> dtl) {
		if (MSC_ITM_ORD_TYP.isMFG(hdr.itm_ord_typ())
				&& !dtl.isEmpty()) {
			hdr.mst_mfg_loc_cd(dtl.get(0).mst_mfg_loc_cd());
		}
	}

	/** 更新時にマスタ製造場所を設定する*/
	protected void setMstMfgLocForInsUpd(HdrR r) {
		//工程展開ボタンを押さずにマニュアル追加行のみで実行した場合
		//マスタ製造場所が設定されないので製造場所を仮定する
		if(MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
				&& !MAC_STR.isNULL_VAL(r.oper_ptn())) {
			if(isNull(r.mst_mfg_loc_cd())) {
				r.mst_mfg_loc_cd(r.mfg_loc_cd());
			}
		}
		else {
			r.mst_mfg_loc_cd(MAC_STR.NULL_VAL.value());
		}
	}

	
	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		callMS_MSBCL0140_Srch01();
	}
	/**
	 * Panel[Hdr]のボタン[sprt_lt]の押下時の処理
	 */
	@Override
	public void doHdr_sprt_lt(MCEventInfo info) {
		callMS_MSBCL0140_Sprt01();
	}
	/**
	 * Panel[Btn]のボタン[sprt_expand_oper]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_expand_oper(MCEventInfo info) {
		callMS_MSBCL0140_Sprt02();
	}
	
	protected void setBaseUnitToDtl(DtlR row) {
		HdrR hdr = getHdrR();
		row.base_unit_cd(hdr.unit_cd());
		row.base_unit_nm(hdr.unit_nm());
		row.dec_place(hdr.dec_place());
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
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBCL0140_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBCL0140_Del01();
	}
	
	// --------------------------------------------------------------
	/** 画面のデフォルト値設定 */
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
	}

	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_UPD.getActionCommand());
	}

	/** イベントリスナー設定 */
	@Override
	protected void listenerInit() {
		super.listenerInit();

		//NC
		Hdr_inst_qty.addNCListener(this);
		Hdr_yield_schd_qty.addNCListener(this);
		//LC
		Hdr_itm_cd.addLCListener(this);
		Hdr_itm_sub1.addLCListener(this);
		Hdr_itm_sub2.addLCListener(this);
		Hdr_itm_sub3.addLCListener(this);
	}

	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		linkBeansToISPanelCustom(Hdr_sppl_cd);
		linkBeansToISPanelCustom(Hdr_maker_cd);
	}

	/** 画面起動時のフォーカス処理 */
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		// INSステータスではフォーカスを移動しないので、ここで設定する。
		HdrPanel.focusFirstComponent();
	}

	/** 埋め込み画面のセットアップ処理 */
	@Override
	protected void setupParts() {
		super.setupParts();		
		setupPartsSub();
	}

	protected void setupPartsSub() {
		Hdr_inst_qty_p_PPanel.setRelateBeans(
				Hdr_unit_cd, Hdr_dec_place);
		Hdr_yield_schd_qty_p_PPanel.setRelateBeans(
				Hdr_unit_cd, Hdr_dec_place);
		Hdr_inst_cont_qty_p_PPanel.setRelateBeans(
				Hdr_cont_fctr_flg,
				Hdr_inst_qty,
				Hdr_std_cont_fctr,
				null,
				Hdr_cont_fctr_dec_place,
				Hdr_cont_fctr_rnd_typ);
		Hdr_yield_cont_qty_p_PPanel.setRelateBeans(
				Hdr_cont_fctr_flg,
				Hdr_yield_schd_qty,
				Hdr_std_cont_fctr,
				null,
				Hdr_cont_fctr_dec_place,
				Hdr_cont_fctr_rnd_typ);
		Hdr_sno_wrk_no_p_PPanel.setRelateBeans(
				Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3,
				Hdr_sno1_mng_typ, Hdr_sno2_mng_typ, Hdr_sno3_mng_typ, Hdr_sno4_mng_typ);
		Hdr_ver_no_p_PPanel.setRelateBeans(
				Hdr_itm_cd, Hdr_itm_sub1, Hdr_itm_sub2, Hdr_itm_sub3,
				null, Hdr_ver_flg);
		Dtl_oper_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_dec_place);
		Dtl_oper_conv_schd_qty_p_PPanel.setRelateBeans(columnDtl_oper_unit_cd,
				columnDtl_dec_place);
	}
	
	// --------------------------------------------------------------
	// NCイベント
	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Hdr_inst_qty) {
			doHdr_inst_qty_NC(info);
		}
		else if (nc == Hdr_yield_schd_qty) {
			doHdr_yield_schd_qty_NC(info);
		}
	}

	protected void doHdr_inst_qty_NC(MCEventInfo info) {
		if(getHdrR().not_qty_rlt_flg()){
			return;
		}
		//指図数→出来高数
		MCNumber v = null;
		if (!isNull(getHdrR().inst_qty())){
			HdrR r = getHdrR();
			v = convQtyInstToYield(r.dnm_qty(), r.nmr_qty(), r.inst_qty(),
					r.dec_place(), r.fxd_yield_qty());
		 }
		getHdrR().yield_schd_qty(v);
		Hdr_yield_cont_qty_p_PPanel.doLCEvent(Hdr_yield_schd_qty, info);
	}

	protected void doHdr_yield_schd_qty_NC(MCEventInfo info) {
		if(getHdrR().not_qty_rlt_flg()){
			return;
		}
		//出来高数→指図数
		MCNumber v = null;
		if (!isNull(getHdrR().yield_schd_qty())){
			HdrR r = getHdrR();
			v = convQtyYieldToInst(r.dnm_qty(), r.nmr_qty(), r.yield_schd_qty(),
					r.dec_place(), r.fxd_yield_qty());
		 }
		getHdrR().inst_qty(v);
		Hdr_inst_cont_qty_p_PPanel.doLCEvent(Hdr_inst_qty, info);
	}

	@Override
	public void doHdr_mfg_st_schd_dt_NC(MCEventInfo info) {
		super.doHdr_mfg_st_schd_dt_NC(info);
		if (MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())){
			setValueEx(Hdr_oper_ptn, null);
		}
	}

	@Override
	protected void opePanelFillSpace() {
		return;
	}

	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setRCopyBtnMode();
		setRDelBtnMode();
	}

	// LCイベント
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_itm_cd
				|| lc == Hdr_itm_sub1
				|| lc == Hdr_itm_sub2
				|| lc == Hdr_itm_sub3) {
			doHdr_itm_cd_LC(info);
		}
	}

	@Override
	public void doHdr_master_dt_LC(MCEventInfo info) {
		super.doHdr_master_dt_LC(info);
		setValueEx(Hdr_mfg_loc_cd, null);
		setValueEx(Hdr_sppl_cd, null);
		setValueEx(Hdr_rqst_loc_cd, null);
		clearDtlR();
		setUpdStatus();
	}

	protected void doHdr_itm_cd_LC(MCEventInfo info) {
		setValueEx(Hdr_mfg_loc_cd, null);
		setValueEx(Hdr_sppl_cd, null);
		setValueEx(Hdr_rqst_loc_cd, null);
		clearDtlR();
		setUpdStatus();
	}

	@Override
	public void doHdr_strg_loc_cd_LC(MCEventInfo info) {
		super.doHdr_strg_loc_cd_LC(info);
		setValueEx(Hdr_itm_ord_typ, null);
		clearDtlR();
		setUpdStatus();
	}

	@Override
	public void doHdr_itm_ord_typ_LC(MCEventInfo info) {
		super.doHdr_itm_ord_typ_LC(info);
		setDefValueByOrdTyp();
		setUpdStatus();
		setHdrMfgLocCnd();
		getInspFlg();
		setInspDtMode();
		setDt();
	}

	@Override
	public void doHdr_bom_ptn_LC(MCEventInfo info) {
		super.doHdr_bom_ptn_LC(info);
		setDefValueByBomPtn(info);
	}

	/**
	 * オーダ区分に応じて、各着手日をセットする。
	 * -- 購買、外注 -> 発注予定日
	 * -- 製造 -> 製造着手予定日
	 * -- 移送・WG間移送 -> 出庫予定日
	 */
	protected void setDt() {
		setValueEx(Hdr_po_schd_dt, null);
		setValueEx(Hdr_mfg_st_schd_dt,  null);
		setValueEx(Hdr_mfg_end_schd_dt,  null);
		setValueEx(Hdr_gi_schd_dt, null);
		setValueEx(Hdr_strg_schd_dt, null);
		setValueEx(Hdr_accpt_schd_dt, null);
		setValueEx(Hdr_insp_st_schd_dt, null);
		setValueEx(Hdr_insp_end_schd_dt, null);
		setValueEx(Hdr_avl_schd_dt, null);
		String sysParm = getSysParm("MASTER_DT_BASE");
		if (isSame(sysParm, "1")) {
			setValueEx(Hdr_avl_schd_dt, getHdrR().master_dt());
		}
		else {
			if (MSC_ITM_ORD_TYP.isPURC(getHdrR().itm_ord_typ()) || MSC_ITM_ORD_TYP.isOUTSRC(getHdrR().itm_ord_typ())) {
				setValueEx(Hdr_po_schd_dt, getHdrR().master_dt());
			}
			if (MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())) {
				setValueEx(Hdr_mfg_st_schd_dt, getHdrR().master_dt());
			}
			if (MSC_ITM_ORD_TYP.isWG_XFR(getHdrR().itm_ord_typ()) || MSC_ITM_ORD_TYP.isXFR(getHdrR().itm_ord_typ())) {
				setValueEx(Hdr_gi_schd_dt, getHdrR().master_dt());
			}
		}
	}


	protected void setDefValueByOrdTyp() {
		setValueEx(Hdr_mfg_loc_cd, null);
		setValueEx(Hdr_sppl_cd, null);
		setValueEx(Hdr_rqst_loc_cd, null);

		setValueEx(Hdr_dnm_qty, null);
		setValueEx(Hdr_nmr_qty, null);
		setValueEx(Hdr_fxd_yield_qty, null);
		setValueEx(Hdr_not_qty_rlt_flg, false);
		if(!MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())
				&& !MSC_ITM_ORD_TYP.isOUTSRC(getHdrR().itm_ord_typ())) {
			setValueEx(Hdr_mfg_st_schd_dt, null);
			setValueEx(Hdr_mfg_end_schd_dt, null);
		}
		if(!MSC_ITM_ORD_TYP.isOUTSRC(getHdrR().itm_ord_typ())
				&& !MSC_ITM_ORD_TYP.isPURC(getHdrR().itm_ord_typ())) {
			setValueEx(Hdr_maker_cd, null);
			setValueEx(Hdr_po_schd_dt, null);
			setValueEx(Hdr_accpt_schd_dt, null);
		}
		if(!MSC_ITM_ORD_TYP.isXFR(getHdrR().itm_ord_typ())
				&& !MSC_ITM_ORD_TYP.isWG_XFR(getHdrR().itm_ord_typ())) {
			setValueEx(Hdr_gi_schd_dt, null);
		}
		if(MSC_ITM_ORD_TYP.isPURC(getHdrR().itm_ord_typ())
				|| MSC_ITM_ORD_TYP.isOUTSRC(getHdrR().itm_ord_typ())
				|| MSC_ITM_ORD_TYP.isXFR(getHdrR().itm_ord_typ())
				|| MSC_ITM_ORD_TYP.isWG_XFR(getHdrR().itm_ord_typ())) {
			getHdrR().dnm_qty(MCNumber.ONE);
			getHdrR().nmr_qty(MCNumber.ONE);
			getHdrR().fxd_yield_qty(MCNumber.ZERO);
			getHdrR().not_qty_rlt_flg(false);
			if(!isNull(getHdrR().inst_qty())){
				getHdrR().yield_schd_qty(getHdrR().inst_qty());
			}
			else if(!isNull(getHdrR().yield_schd_qty())){
				getHdrR().inst_qty(getHdrR().yield_schd_qty());
			}
		}
	}

	protected void setDefValueByBomPtn(MCEventInfo info) {
		if(!isNull(getHdrR().inst_qty())) {
			doHdr_inst_qty_NC(info);
		}
		else if(!isNull(getHdrR().yield_schd_qty())) {
			doHdr_yield_schd_qty_NC(info);
		}
	}

	@Override
	public void doHdr_mfg_loc_cd_LC(MCEventInfo info) {
		super.doHdr_mfg_loc_cd_LC(info);
		setValueEx(Hdr_bom_ptn, null);
		getInspFlg();
		setInspDtMode();
		clearDtlR();
		setUpdStatus();
	}

	@Override
	public void doHdr_sppl_cd_LC(MCEventInfo info) {
		super.doHdr_sppl_cd_LC(info);
		setValueEx(Hdr_maker_cd, null);
		getInspFlg();
		setInspDtMode();
	}

	@Override
	public void doHdr_maker_cd_LC(MCEventInfo info) {
		super.doHdr_maker_cd_LC(info);
		getInspFlg();
		setInspDtMode();
	}
	
	/**
	 * 検査対象を取得する
	 */
	protected void getInspFlg() {
		getHdrR().insp_flg(false);
		setValueEx(Hdr_insp_st_schd_dt, null);
		setValueEx(Hdr_insp_end_schd_dt, null);
		if (canCallSprt03()) {
			//ここは同期通信している
			callMS_MSBCL0140_Sprt03();
		}
	}

	protected boolean canCallSprt03() {
		HdrR r = getHdrR();
		if(isNullOr(r.itm_ord_typ(), r.master_dt(),
				r.itm_cd(), r.itm_sub1(), r.itm_sub3(), r.itm_sub3())) {
			return false;
		}
		else if (MSC_ITM_ORD_TYP.isMFG(r.itm_ord_typ())
				|| MSC_ITM_ORD_TYP.isOUTSRC(r.itm_ord_typ())){
			return !isNull(r.mfg_loc_cd());
		}
		else if (MSC_ITM_ORD_TYP.isPURC(r.itm_ord_typ())){
			return !isNull(r.sppl_cd());
		}
		else if (MSC_ITM_ORD_TYP.isXFR(r.itm_ord_typ())
				|| MSC_ITM_ORD_TYP.isWG_XFR(r.itm_ord_typ())){
			return false;
		}
		return false;
	}
	
	@Override
	public void doHdr_oper_ptn_LC(MCEventInfo info) {
		super.doHdr_oper_ptn_LC(info);
		clearDtlR();
	}
	/** 工程明細クリア処理*/
	protected void clearDtlR() {
		getDtlL().clear();
	}

	
	// --------------------------------------------------------------
	// リストロジック
	@Override
	public MCList getHdr_itm_ord_sts_typ(MCRow row, MCEventInfo info){
		addListLogicCnd(row, getDispItmOrdStsTyp());
		return super.getHdr_itm_ord_sts_typ(row, info);
	}

	public MSC_ITM_ORD_STS_TYP[] getDispItmOrdStsTyp() {
		return new MSC_ITM_ORD_STS_TYP[] {
				MSC_ITM_ORD_STS_TYP.OPN,
				MSC_ITM_ORD_STS_TYP.FIX
		};
	}

	@Override
	public MCList getHdr_itm_ord_typ(MCRow row, MCEventInfo info){
		addListLogicCnd(row, getDispItmOrdTyp());
		return super.getHdr_itm_ord_typ(row, info);
	}

	/** 格納場所が社外の場合に選択できるオーダ区分 */
	protected MSC_ITM_ORD_TYP[] _itmOdrTypForExtStrg = 
		new MSC_ITM_ORD_TYP[] {
			MSC_ITM_ORD_TYP.PURC,
			MSC_ITM_ORD_TYP.OUTSRC,
			MSC_ITM_ORD_TYP.XFR,
			MSC_ITM_ORD_TYP.WG_XFR};

	/** 格納場所が社内の場合に選択できるオーダ区分 */
	protected MSC_ITM_ORD_TYP[] _itmOdrTypForInStrg =
		new MSC_ITM_ORD_TYP[] {
			MSC_ITM_ORD_TYP.MFG,
			MSC_ITM_ORD_TYP.PURC,
			MSC_ITM_ORD_TYP.OUTSRC,
			MSC_ITM_ORD_TYP.XFR,
			MSC_ITM_ORD_TYP.WG_XFR};

	public MSC_ITM_ORD_TYP[] getDispItmOrdTyp() {
		//内製の場合は格納場所は社内のみ
		if(isNullOr(getHdrR().strg_loc_cd(), getHdrR().strg_sppl_cd())) {
			return _itmOdrTypForInStrg;
		}
		return _itmOdrTypForExtStrg;
	}
	
	// --------------------------------------------------------------
	/** 
	 * 画面上の品目、マスタ適用日等の、
	 * 最初に入力されなければならない項目「以外」が編集可能かどうかを返す。
	 */
	protected boolean canEdit() {
		HdrR hdr = getHdrR();
		if (isNullOr(hdr.itm_cd(), hdr.master_dt())) {
			return false;
		}
		return true;
	}
	
	/** 現在のステータスが変更不可能なステータスかどうかを返す。 */
	protected boolean isFixStatus() {
		if (isSame(getStatus(), FIX_U)) {
			return true;
		}
		return false;
	}
	
	/** 現在のステータスが入力可能なステータスかどうかを返す。 */
	protected boolean isUpdStatus() {
		if (isSame(getStatus(), UPD_MFG)
				|| isSame(getStatus(), UPD_PURC)
				|| isSame(getStatus(), UPD_OUTSRC)
				|| isSame(getStatus(), UPD_XFR)
				|| isSame(getStatus(), UPD_WG_XFR))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * INSまたはUPDステータスを設定する。フォーカス移動なし。
	 * @see #setINSStatusNoMoveFocus()
	 * @see #setUPDStatusNoMoveFocus()
	 */
	protected void setUpdStatus() {
		if (Cnd_ope_UPD.isSelected()) {
			setUPDStatusNoMoveFocus();
		}
		setItmOdrTypMode();
		setRCopyBtnMode();
		setRDelBtnMode();
		setInspDtMode();
	}
	
	protected void setUPDStatusNoMoveFocus() {
		String typ = getHdrR().itm_ord_typ();
		String sts = getHdrR().itm_ord_sts_typ_old();

		if (MSC_ITM_ORD_STS_TYP.isOPN(sts)) {
			if (!canEdit() || isNull(typ)){
				setUPD_NONEStatus();
			}
			else if (MSC_ITM_ORD_TYP.isMFG(typ)) {
				setUPD_MFGStatus();
			}
			else if (MSC_ITM_ORD_TYP.isPURC(typ)) {
				setUPD_PURCStatus();
			}
			else if (MSC_ITM_ORD_TYP.isOUTSRC(typ)) {
				setUPD_OUTSRCStatus();
			}
			else if (MSC_ITM_ORD_TYP.isXFR(typ)) {
				setUPD_XFRStatus();
			}
			else if (MSC_ITM_ORD_TYP.isWG_XFR(typ)) {
				setUPD_WG_XFRStatus();
			}
			else {
				//この分岐にくることは想定していないが
				setFIX_UStatus();
			}
		}
		else {
			setFIX_UStatus();
		}
	}
	
	/** 行削除ボタンのモード制御を行う。 */
	protected void setRDelBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		if (!isDeletableRow(r)) {
			Btn_rdel.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rdel);
		}
	}
	
	/** 行コピーボタンのモード制御を行う。 */
	protected void setRCopyBtnMode() {
		if (!isUpdStatus()) {
			Btn_rcopy.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(Btn_rcopy);
		}
	}
	
	/** 行削除可能かどうかを返す。 */
	protected boolean isDeletableRow(DtlR r) {
		if (isNull(r)) {
			return false;
		}

		if (isFixStatus()) {
			//更新不可ステータスの場合は常に行削除不可
			return false;
		}
		if (r.radd_flg()) {
			//追加行は常に行削除可
			return true;
		}
		if (isSame(r.getStatus(),Status.DELETE)) {
			//ステータスがDELETEの行は常に行削除可
			return true;
		}
		MCList<DtlR> l = exceptDeleteAndEmpty(getDtlL().subList(DtlR.$radd_flg, false));
		if (l.subList(new String[]{DtlR.$oper_cd,DtlR.$oper_seq},
				new Comparable[]{r.oper_cd(),r.oper_seq()}).size() > 1) {
			//同一工程CD、工程連番を持つ行が、自身の行と行追加した行以外に存在すれば行削除可。
			return true;
		}
		return false;
	}
	
	/** 品目オーダ状況区分のモード制御を行う。 */
	protected void setItmOdrTypMode() {
		if (isNull(getHdrR().strg_loc_cd())) {
			Hdr_itm_ord_typ.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_itm_ord_typ);
		}
	}

	/** 工程展開ボタンのモード制御を行う。 */
	protected void setExpandOperBtnMode() {
		if (!isUpdStatus() 
				|| !MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())) {
			Btn_sprt_expand_oper.setMode(MCMode.DISABLE);
		}
	}
	
	/** 取消ボタンのモード制御を行う。 */
	protected void setDelBtnMode() {
		//確定以降は取消不可
		if (MSC_ITM_ORD_STS_TYP.isOPN(getHdrR().itm_ord_sts_typ_old())) {
			setDefaultMode(Btn_del);
		}
		else {
			Btn_del.setMode(MCMode.DISABLE);
		}
	}

	/** 検査対象項目の制御を行う。 */
	protected void setInspDtMode() {
		if(!isUpdStatus() || !getHdrR().insp_flg()){
			Hdr_insp_st_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr_insp_end_schd_dt.setMode(MCMode.READ_ONLY);
		}
		else {
			setDefaultMode(Hdr_insp_st_schd_dt);
			setDefaultMode(Hdr_insp_end_schd_dt);
		} 
	}

	/** 製造場所リストロジックの条件を設定する */
	protected void setHdrMfgLocCnd() {
		if(MSC_ITM_ORD_TYP.isMFG(getHdrR().itm_ord_typ())) {
			getHdrR().mfg_flg(true);
			getHdrR().outsrc_flg(false);
		}
		else if(MSC_ITM_ORD_TYP.isOUTSRC(getHdrR().itm_ord_typ())) {
			getHdrR().mfg_flg(false);
			getHdrR().outsrc_flg(true);
		}
		else {
			getHdrR().mfg_flg(false);
			getHdrR().outsrc_flg(false);	
		}
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		if (getHdrR().has_oper()) {
			DtlTable.selectLeftmostColumn(0);
		}
		else {
			CndPanel.focusFirstComponent();
		}
	}
	
	@Override
	public void setUPDStatus() {
		setUpdStatus();
		HdrPanel.focusFirstComponent();
		if (getHdrR().has_oper()) {
			DtlTable.selectRowNoFocus(0);
		}
	}


	@Override
	public void setDELStatus() {
		super.setDELStatus();
		setDelBtnMode();
	}

	@Override
	public void setREFStatus() {
		super.setREFStatus();
		if (getHdrR().has_oper()) {
			DtlTable.selectLeftmostColumn(0);
		}
		else {
			CndPanel.focusFirstComponent();
		}
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
	
	// --------------------------------------------------------------
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (isSame(T1, openTyp)) {
			valueInit();
			//setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
			setValueEx(Hdr_itm_ord_sts_typ, bind.getStringNE("itm_ord_sts_typ"));
			setValueEx(Hdr_master_dt, bind.getDateNE("master_dt"));

			if(setItmCd(bind.getStringNE("itm_cd"), bind.getStringNE("itm_sub1"),
					bind.getStringNE("itm_sub2"), bind.getStringNE("itm_sub3"))){
				return;
			}

			addDoBehind(Cnd_srch);
		}	
	}

	protected boolean setItmCd(String itmCd, String itmSub1, String itmSub2, String itmSub3) {
		if((isNull(itmCd) || Hdr_itm_cd.setValue(itmCd).isEmpty())
				&& (isNullOrNullVal(itmSub1) || Hdr_itm_sub1.setValue(itmSub1).isEmpty())
				&& (isNullOrNullVal(itmSub2) || Hdr_itm_sub2.setValue(itmSub2).isEmpty())
				&& (isNullOrNullVal(itmSub3) || Hdr_itm_sub3.setValue(itmSub3).isEmpty())){
			return true;
		}
		return false;
	}
	
	// --------------------------------------------------------------
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		// 参照登録、行コピー時に引き継がない項目
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getHdrR()) {
			list.add(HdrR.$itm_ord_no);
			list.add(HdrR.$itm_ord_sts_typ);
			list.add(HdrR.$itm_ord_sts_typ_nm);
			list.add(HdrR.$rqmt_no);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$oper_ord_no);
			list.add(DtlR.$oper_ord_sts_typ);
			list.add(DtlR.$oper_ord_sts_typ_nm);
		}

		return list;
	}
	// --------------------------------------------------------------
	// IfOpePanelの実装
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		//操作種別ボタングループ
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		//登録用コンテナ
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		//検索条件用コンテナ
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}

}