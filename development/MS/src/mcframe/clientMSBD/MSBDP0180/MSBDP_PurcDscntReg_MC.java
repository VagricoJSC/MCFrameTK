package mcframe.clientMSBD.MSBDP0180;

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
import mcframe.clientMAUB.MAUBP0060.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP0420.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5040.*;
import mcframe.clientMSUB.MSUBP5070.*;

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
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientMSUC.MSUCP0040.MSUCP_PurcUtil;
import mcframe.commonMSUA.MSUAC0040.MSUAC_List;
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientCore.container.MCRowStatusListener;
import mcframe.clientCore.container.MCRowStatusEvent;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBDP_PurcDscntReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBDP_PurcDscntReg_MC extends MSBDP_PurcDscntReg_MC_A implements IfOpePanel, IfRowMoveBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBDP_PurcDscntReg_MC() {
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
	public MSBDP_PurcDscntReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBDL0180_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Upd01Caller<P extends MSBDP_PurcDscntReg, B extends MS_MSBDL0180_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0180_Upd01Caller(P p, B b) {
			super(p, b);
		}
	}

	/**
	 * [MS_MSBDL0180_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Del01Caller<P extends MSBDP_PurcDscntReg, B extends MS_MSBDL0180_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {

		protected MS_MSBDL0180_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}


	/**
	 * [MS_MSBDL0180_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Ins01Caller<P extends MSBDP_PurcDscntReg, B extends MS_MSBDL0180_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {

		protected MS_MSBDL0180_Ins01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * [MS_MSBDL0180_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Srch02Caller<P extends MSBDP_PurcDscntReg, B extends MS_MSBDL0180_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0180_Srch02Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();
			// 計上日を取消計上日にコピー
			bridge.down0().can_ac_dt(bridge.down0().ac_dt());

			for(DtlR dr:bridge.down1()){
				//参考情報NOは為替レートの再取得をするかどうかの判断に使用する。
				if (!isNull(dr.ref_purc_act_no())) {
					bridge.down0().ref_no(dr.ref_purc_act_no());
				}
			}
		}
		
		@Override
		protected void show() {
			super.show();
			
			setValueEx(Hdr_dummy_upri_cng_flg, true);
			setDispAmt();
		}
	}


	/**
	 * [MS_MSBDL0180_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBDL0180_Srch01Caller<P extends MSBDP_PurcDscntReg, B extends MS_MSBDL0180_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBDL0180_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void afterCall() {
			super.afterCall();

			for(DtlR dr:bridge.down1()){
				//参考情報NOは為替レートの再取得をするかどうかの判断に使用する。
				if (!isNull(dr.ref_purc_act_no())) {
					bridge.down0().ref_no(dr.ref_purc_act_no());
				}
			}
			setCreateStatusToRegBlocks();
		}
		
		protected void setCreateStatusToRegBlocks() {
			bridge.down1().setStatus(MCRow.CREATE);
		}
		
		@Override
		protected void show() {
			super.show();
			setDispAmt();
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setINSStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setINSStatus();
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch_purc_act]の押下時の処理
	 */
	@Override
	public void doCnd_srch_purc_act(MCEventInfo info) {
		callMS_MSBDL0180_Srch01();
	}
	/**
	 * Panel[Cnd]のボタン[srch_purc_dscnt]の押下時の処理
	 */
	@Override
	public void doCnd_srch_purc_dscnt(MCEventInfo info) {
		callMS_MSBDL0180_Srch02();
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
		setDispAmt();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
		setDispAmt();
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBDL0180_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBDL0180_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBDL0180_Del01();
	}
	
	// -----------------------------------------------
	// init
	// -----------------------------------------------
	@Override
	protected void valueInit() {
		super.valueInit();
		// 検索枠初期値設定
		setCnd();
		// ヘッダ枠初期値設定
		setHdr();
	}
	@Override
	protected void setupParts() {
		super.setupParts();
		// 計上年月
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Hdr_purc_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		// 発注先
		Hdr_sppl_p_PPanel.setRelateBeans(Hdr_sppl_cd, Hdr_sppl_nm);
		// 為替レート
		Hdr_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_base_cur_cd, Hdr_xrate_cd, Hdr_purc_dt, true, null, Hdr_ref_no);
		// 納税為替レート
		Hdr_prax_xrate_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_ptax_cur_cd, Hdr_xrate_cd, Hdr_purc_dt, true, null, Hdr_ref_no);
		Hdr_trd_cur_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		Hdr_trd_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_trd_cur_amt_dec_place);
		// 値引数量
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3
				, columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ
				, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);

		// 品目
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg, columnDtl_stk_mng_typ);
		// 基準単位数量
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ, columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty);
		// 取引通貨単価・金額
		Dtl_trd_cur_upri_p_PPanel.setSchd(false);
		Dtl_trd_cur_upri_p_PPanel.setAmtToUpri(true);
		Dtl_trd_cur_upri_p_PPanel.setRelateBeans(Hdr_trd_cur_cd, Hdr_sppl_cd, columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, columnDtl_trd_unit_cd, columnDtl_trd_unit_qty, Hdr_trd_cur_amt_dec_place, Hdr_trd_cur_upri_dec_place, Hdr_purc_amt_rnd_typ, Hdr_purc_tax_rnd_typ, Hdr_dummy_upri_cng_flg, Hdr_dummy_upri_cng_flg, columnDtl_dscnt_itm_flg);
		// 基準通貨単価・金額
		Dtl_base_cur_upri_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_xrate);
		Dtl_base_cur_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_xrate);
		Dtl_base_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place, 
				columnDtl_trd_cur_tax_amt, Hdr_xrate);
		Dtl_base_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd,Hdr_base_cur_amt_dec_place,
				columnDtl_trd_cur_inc_tax_amt, Hdr_xrate);
		
		// 納税通貨単価・金額
		Dtl_ptax_cur_upri_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_upri_dec_place, columnDtl_trd_cur_upri, Hdr_ptax_xrate);
		Dtl_ptax_cur_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_amt, Hdr_ptax_xrate);
		Dtl_ptax_cur_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd, Hdr_ptax_cur_amt_dec_place, columnDtl_trd_cur_tax_amt,
				Hdr_ptax_xrate);
		Dtl_ptax_cur_inc_tax_amt_p_PPanel.setRelateBeans(Hdr_ptax_cur_cd,Hdr_ptax_cur_amt_dec_place, 
				columnDtl_trd_cur_inc_tax_amt, Hdr_ptax_xrate);
		
		// 手配ＮＯ
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_sno1_mng_typ,columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		
		Dtl_bditm_p_PPanel.setRelateBeans(
				columnDtl_asset_mng_typ,
				columnDtl_bd_lot_mng_typ, columnDtl_bd_sublot_mng_typ, columnDtl_bd_sno1_mng_typ, 
				columnDtl_bd_sno2_mng_typ, columnDtl_bd_sno3_mng_typ, columnDtl_bd_sno4_mng_typ);
		
		// 源泉税額
		Dtl_wtax_amt_p_PPanel.setRelateBeans(Hdr_base_cur_cd, Hdr_base_cur_amt_dec_place, columnDtl_base_cur_amt, columnDtl_wtax_rate, true);
		
		// ロット
		Dtl_lot_no_p_PPanel.setRelateBeans(columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, 
				columnDtl_lot_mng_typ, columnDtl_sublot_mng_typ);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		
		linkBeansToISPanelCustom(columnDtl_maker_cd);
	}
	
	@Override
	protected void listInit() {
		super.listInit();
		//---------------------
		// 一括入力
		//---------------------
		// 買掛先
		getBulkSet_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		//---------------------
		// 明細
		//---------------------
		// 品目
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_sppl_nm);
		getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_ac_dt);
		getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_sppl_nm);
		getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_ac_dt);
		getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_sppl_nm);
		getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_ac_dt);
		getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmCols.$i_bp_cd, Hdr_sppl_cd);
		getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmCols.$i_bp_nm, Hdr_sppl_nm);
		getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter().putBind(ItmDtlCols.$i_dt, Hdr_ac_dt);
		// メーカ
		getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_master_dt, Hdr_ac_dt);
		getDtl_maker_cd_ListPutter().putBind(MSUAC_List.ItmDtlMakerCols.$i_sppl_cd, Hdr_sppl_cd);
		// 買掛先
		getDtl_ap_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
		// 負担部門
		getDtl_bditm_p_PPanel_columnBdItem_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
	}
	// -----------------------------------------------
	// listener
	// -----------------------------------------------
	@Override
	protected void listenerInit() {
		super.listenerInit();
		//--------------------------------------
		// LCEvent
		//--------------------------------------
		// ヘッダ
		// 計上日
		Hdr_ac_dt.addLCListener(this);
		// 明細
		// 品目
		columnDtl_itm_cd.addLCListener(this);
		columnDtl_itm_sub1.addLCListener(this);
		columnDtl_itm_sub2.addLCListener(this);
		columnDtl_itm_sub3.addLCListener(this);
		
		columnDtl_ptax_cur_tax_amt.addLCListener(this);
		columnDtl_base_cur_tax_amt.addLCListener(this);
		columnDtl_trd_cur_amt.addLCListener(this);
		columnDtl_trd_cur_inc_tax_amt.addLCListener(this);
		getDtlL().addListListener(createListListener(createDtlRowListener()));
		Hdr_purc_dpt_cd.addLCListener(this);
	}
	
	// -----------------------------------------------
	// 入力補助画面起動時のバインド
	// -----------------------------------------------
	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		super.getBindRowForISCustom(bind, beans, eventIndex);
		if (beans == columnDtl_itm_cd) {
			if (MAC_TRD_PTN_TYP.isPURC_DSCNT_XPNS(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPURC_XTRA_XPNS(getHdrR().trd_ptn_typ())) {
				bind.addStringColumn(ItmDtlCols.$i_asset_mng_typ, MAC_ASSET_MNG_TYP.NOT_MNG.value());
			}
		}
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}

	// -----------------------------------------------
	// NCEvent
	// -----------------------------------------------
	@Override
	public void doCnd_ope_NC(MCEventInfo info) {
		// 検索枠の初期値設定
		setCnd();
	}
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info, IfOpePanel p
			, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		// 登録種別から別種別に変更時、仕入実績NOを検索NOにコピー
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			getCndR().srch_tgt_no(getHdrR().purc_act_no());
		}
	}
	
	@Override
	public void doBulkSet_ap_dpt_cd_NC(MCEventInfo info) {
		super.doBulkSet_ap_dpt_cd_NC(info);
		for (DtlR r : getDtlL()) {
			int idx = r.getGUIIndex();
			if (!r.isEmpty() && isEditable(columnDtl_ap_dpt_cd, idx)) {
				setValueEx(columnDtl_ap_dpt_cd, idx, getBulkSetR().ap_dpt_cd());
			}
		}
	}

	// -----------------------------------------------
	// LCEvent
	// -----------------------------------------------
	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		// 品目
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
		// 納税通貨税額
		if (lc == columnDtl_ptax_cur_tax_amt) {
			doDtl_ptax_cur_tax_amt_LC(info);
		}
		// 基準通貨税額
		if (lc == columnDtl_base_cur_tax_amt) {
			doDtl_base_cur_tax_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_amt) {
			doDtl_trd_cur_amt_LC(info);
		}
		if (lc == columnDtl_trd_cur_inc_tax_amt) {
			doDtl_trd_cur_inc_tax_amt_LC(info);
		}
		if (lc == Hdr_purc_dpt_cd) {
			doHdr_purc_dpt_cd_LC(info);
		}
	}
	
	@Override
	public void doHdr_purc_dt_LC(MCEventInfo info) {
		super.doHdr_purc_dt_LC(info);
		// ヘッダ：計上日に仕入日を設定
		setValueEx(Hdr_ac_dt, getHdrR().purc_dt());
		// 明細：税,源泉税率の再設定
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultTaxCd(r);
			setWtaxRate(r);
			if (isNull(r.ref_purc_act_no())) {
				setSpplItm(r);
			}
		}
	}

	@Override
	public void doHdr_sppl_cd_LC(MCEventInfo info) {
		super.doHdr_sppl_cd_LC(info);
		// 参照情報のクリア
		cleanRefData();
		// 入力制御設定
		setHdrMode();
		// 全明細に対し初期値再設定
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			// 発注先品目・品名
			setSpplItm(dtlR);
			// 税
			setDefaultTaxCd(dtlR);
			setIvItmNm(dtlR);
		}
		String purcDptCd = getHdrR().purc_dpt_cd();
		setValueEx(Hdr_purc_usr_cd, null);
		setValueEx(Hdr_purc_dpt_cd, null);
		if (!isNull(getHdrR().def_purc_usr_cd())) {
			setValueEx(Hdr_purc_usr_cd, getHdrR().def_purc_usr_cd());
		}
		else if (!isNull(getHdrR().def_purc_dpt_cd())) {
			setValueEx(Hdr_purc_dpt_cd, getHdrR().def_purc_dpt_cd());
		}
		if (isNull(Hdr_sppl_cd.getValue())) {
			getHdrR().ap_dpt_cd(null);
		}
		else {
			if (!isNull(getHdrR().mst_ap_dpt_cd())) {
				getHdrR().ap_dpt_cd(getHdrR().mst_ap_dpt_cd());
			}
			else if (isNullAnd(purcDptCd, getHdrR().purc_dpt_cd())) {
				getHdrR().ap_dpt_cd(null);
			}
		}
		setValueEx(BulkSet_ap_dpt_cd, getHdrR().ap_dpt_cd());
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			setDefaultApDptCd(r);
		}
		setValueEx(Hdr_rcpt_iv_no, null);
		setValueEx(Hdr_ref_rcpt_iv_no, null);
		setDispAmt();
	}
	public void doHdr_purc_dpt_cd_LC(MCEventInfo info) {
		String apDptCd = getHdrR().ap_dpt_cd();
		setApDptCd();
		
		if (!isSame(apDptCd, getHdrR().ap_dpt_cd())) {
			setValueEx(BulkSet_ap_dpt_cd, getHdrR().ap_dpt_cd());
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				setDefaultApDptCd(r);
			}
		}
	}

	protected void setApDptCd() {
		if (isNull(getHdrR().mst_ap_dpt_cd())) {
			if (isNull(getHdrR().purc_dpt_cd())) {
				getHdrR().ap_dpt_cd(null);
			}
			else {
				 if (getHdrR().ap_dpt_flg()) {
					getHdrR().ap_dpt_cd(getHdrR().purc_dpt_cd());
				}
				else {
					getHdrR().ap_dpt_cd(null);
				}	
			}
		}
	}	
	
	/**
	 * 品目変更時の処理
	 */
	protected void doDtl_itm_cd_LC(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);
		cleanRefData();
		if (Dtl_itm_p_PPanel.isItmFix(dtlR.getGUIIndex())) {
			setIvItmNm(dtlR);
			setSpplItm(dtlR);
			setDefaultTaxCd(dtlR);
			setWtaxRate(dtlR);
			setColByDscntItm(dtlR);
			setPayCrryovrTimes(dtlR);
			setDefPurcTyp(dtlR);
		}
		else {
			setValueEx(columnDtl_iv_itm_nm, idx, null);
			setValueEx(columnDtl_sppl_itm_cd, idx, null);
			setValueEx(columnDtl_sppl_itm_nm, idx, null);
			setValueEx(columnDtl_tax_cd, idx, null);
			setValueEx(columnDtl_wtax_rate, idx, null);
			setValueEx(columnDtl_pay_crryovr_times, idx, null);
			setValueEx(columnDtl_purc_typ, idx, null);
		}
	}
	protected void setDefPurcTyp(DtlR dtlR) {
		int idx = dtlR.getGUIIndex();
		setValueEx(columnDtl_purc_typ, idx, MAC_PURC_TYP.PURC_ITM.value());
	}	
	protected void setPayCrryovrTimes(DtlR dtlR) {
		int idx = dtlR.getGUIIndex();
		// 支払繰越回数
		if (!isNull(dtlR.itm_pay_crryovr_times())) {
			setValueEx(columnDtl_pay_crryovr_times, idx, dtlR.itm_pay_crryovr_times());
		}
		else if (!isNull(getHdrR().sppl_pay_crryovr_times())) {
			setValueEx(columnDtl_pay_crryovr_times, idx, getHdrR().sppl_pay_crryovr_times());
		}
		else {
			setValueEx(columnDtl_pay_crryovr_times, idx, null);
		}
	}
	
	/**
	 * 値引品目が入力された場合の固定値を設定します。
	 */
	protected void setColByDscntItm(DtlR dtlR) {
		if (dtlR.dscnt_itm_flg()) {
			setValueEx(columnDtl_trd_unit_cd, dtlR.getGUIIndex(), dtlR.base_unit_cd());
			setValueEx(columnDtl_trd_unit_qty, dtlR.getGUIIndex(), MCNumber.ONE);
		}
	}
	protected void doDtl_ptax_cur_tax_amt_LC(MCEventInfo info) {
		if (DtlTable.getEditingColumnConfig() != columnDtl_ptax_cur_tax_amt) {
			return;
		}
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		HdrR hdrR = getHdrR();
		
		if (isNull(dtlR.ptax_cur_amt())
				|| isNull(dtlR.ptax_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.ptax_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}		
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額(納税通貨)を計算する。
			// 税込金額 から手入力した税額を除いた値を納税通貨金額に反映する。
			MCNumber exTaxAmt = dtlR.ptax_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.ptax_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.ptax_cur_amt().divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));				
			}
			dtlR.base_cur_amt(convToBaseCur(dtlR.trd_cur_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		else {
			// 外税の場合、税込金額(基準通貨)を計算する。
			// 税抜金額に手入力した税額を加算した値を基準通貨税込金額に反映する。
			MCNumber incTaxAmt = dtlR.ptax_cur_amt().add(taxAmt);
			dtlR.ptax_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.ptax_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.ptax_cur_inc_tax_amt().divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.ptax_xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
			dtlR.base_cur_inc_tax_amt(convToBaseCur(dtlR.trd_cur_inc_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
			dtlR.base_cur_tax_amt(convToBaseCur(dtlR.trd_cur_tax_amt(), hdrR.xrate(), hdrR.base_cur_amt_dec_place(), getCo().xrate_rnd_typ()));
		}
		
		setDispAmt();
	}	
	protected void doDtl_base_cur_tax_amt_LC(MCEventInfo info) {
		if (DtlTable.getEditingColumnConfig() != columnDtl_base_cur_tax_amt) {
			return;
		}
		DtlR dtlR = getDtlL().get(info.getEventIndex());
		HdrR hdrR = getHdrR();
		
		if (isNull(dtlR.base_cur_amt())
				|| isNull(dtlR.base_cur_inc_tax_amt())) {
			return;
		}
		
		MCNumber taxAmt = dtlR.base_cur_tax_amt();
		if (isNull(taxAmt)) {
			taxAmt = MCNumber.ZERO;
		}
		
		if (dtlR.inc_tax_flg()) {
			// 内税の場合、税抜金額を計算する。
			// 税込金額 から手入力した税額を除いた値を金額に反映する。
			MCNumber exTaxAmt = dtlR.base_cur_inc_tax_amt().subtract(taxAmt);
			dtlR.base_cur_amt(exTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
				dtlR.trd_cur_amt(dtlR.base_cur_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_amt(dtlR.base_cur_amt().divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
		}
		else {
			// 外税の場合、税込金額を計算する。
			// 税抜金額に手入力した税額を加算した値を税込金額に反映する。
			MCNumber incTaxAmt = dtlR.base_cur_amt().add(taxAmt);
			dtlR.base_cur_inc_tax_amt(incTaxAmt);
			if (isSame(hdrR.trd_cur_cd(), hdrR.base_cur_cd())) {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt());
				dtlR.trd_cur_tax_amt(taxAmt);
			}
			else {
				dtlR.trd_cur_inc_tax_amt(dtlR.base_cur_inc_tax_amt().divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
				dtlR.trd_cur_tax_amt(taxAmt.divide(hdrR.xrate(), hdrR.trd_cur_amt_dec_place().intValue(), MAC_RND_TYP.toMC(getCo().xrate_rnd_typ())));
			}
		}
		
		setDispAmt();
	}
	/**
	 * 取引通貨金額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_amt_LC(MCEventInfo info) {
		setDispAmt();
	}

	/**
	 * 取引通貨税込金額変更イベント
	 * @param info
	 */
	public void doDtl_trd_cur_inc_tax_amt_LC(MCEventInfo info) {
		setDispAmt();
	}
	
	@Override
	public void doDtl_purc_typ_LC(MCEventInfo info) {
		super.doDtl_purc_typ_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		// 購買区分に「通常仕入」を設定すると、製造指図ＮＯがクリアされる
		if (MAC_PURC_TYP.isPURC_ITM(r.purc_typ())) {
			setValueEx(columnDtl_mfg_inst_no, info.getEventIndex(), null);
		}
	}
	// -----------------------------------------------
	// リスト取得
	// -----------------------------------------------
	// 検索対象区分
	@Override
	public MCList<?> getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info) {
		addListLogicCnd(row, getDispSrchTgtTyp());		
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}
	/**
	 * 検索対象区分名のリストを作成します
	 * @return
	 */
	public MSC_PURC_SRCH_TGT_TYP[] getDispSrchTgtTyp() {
		return new MSC_PURC_SRCH_TGT_TYP[] {
				MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO
		};
	}

	// -----------------------------------------------
	// CellConfig
	// -----------------------------------------------
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		DtlTable.setCellConfig(crtDtlCellConfig());
	}

	protected DtlCellConfig crtDtlCellConfig() {
		return new DtlCellConfig();
	}

	protected class DtlCellConfig extends MAUDP_CellConfig {
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			DtlR r = getDtlL().get(index);

			if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
				// 製造指図ＮＯ
				if (column == columnDtl_mfg_inst_no) {
					if (MAC_PURC_TYP.isPURC_ITM(r.purc_typ())) {
						return MCMode.READ_ONLY;
					}
				}

				if (r.dscnt_itm_flg() && !isDscntItmEditableColumn(column)) {
					return MCMode.READ_ONLY;
				}
				
				if(isEditableMode(column) && column == columnDtl_bd_dpt_cd){
					return MCMode.REQUIRED;
				}
				if (column.getRootPanel() == Dtl_bditm_p_PPanel) {
					if (MAC_ASSET_MNG_TYP.isMNG(r.asset_mng_typ())) {
						return MCMode.READ_ONLY;
					}
				}
				// 源泉税率
				if (column == columnDtl_wtax_rate) {
					if (!canEditWtaxRate(r)) {
						return MCMode.READ_ONLY;
					}
				}
				
				// インボイス表記品名
				if (column == columnDtl_iv_itm_nm) {
					if (isEditableMode(column) && (!r.sundry_itm_flg() || !getHdrR().sppl_iv_flg())) {
						return MCMode.READ_ONLY;
					}
				}
				
				// 基準通貨税額
				if (column == columnDtl_base_cur_tax_amt) {
					if (!isNull(getHdrR().ptax_cur_cd())) {
						return MCMode.READ_ONLY;
					}
					if (MAC_TAX_CALC_TYP.isSLIP(getHdrR().purc_tax_calc_typ())) {
						return MCMode.READ_ONLY;
					}
					if (isNull(r.trd_cur_tax_amt())) {
						return MCMode.READ_ONLY;
					}
					if (isSame(r.tax_rate(), MCNumber.ZERO)) {
						return MCMode.READ_ONLY;
					}
					if (isSame(getHdrR().xrate(), MCNumber.ZERO)) {
						return MCMode.READ_ONLY;
					}
					if (isNull(getHdrR().xrate())) {
						return MCMode.READ_ONLY;
					}
				}

				// 納税通貨税額
				if (column == columnDtl_ptax_cur_tax_amt) {
					if (isNull(getHdrR().ptax_cur_cd())) {
						return MCMode.READ_ONLY;
					}
					if (MAC_TAX_CALC_TYP.isSLIP(getHdrR().purc_tax_calc_typ())) {
						return MCMode.READ_ONLY;
					}
					if (isNull(r.trd_cur_tax_amt())) {
						return MCMode.READ_ONLY;
					}
					if (isNull(getHdrR().ptax_xrate())) {
						return MCMode.READ_ONLY;
					}
					if (isSame(r.tax_rate(), MCNumber.ZERO)) {
						return MCMode.READ_ONLY;
					}
					if (isSame(getHdrR().ptax_xrate(), MCNumber.ZERO)) {
						return MCMode.READ_ONLY;
					}
				}

			}
			return super.getPriorMode(index, column, table);
		}
		

		protected boolean isDscntItmEditableColumn(MCBeans column) {
			return !(column == columnDtl_trd_unit_cd ||
					column == columnDtl_trd_unit_qty
					);
		}
	}
	// -----------------------------------------------
	// 入力制御
	// -----------------------------------------------
	@Override
	public void setINSStatus() {
		super.setINSStatus();
		setHdrMode();
		setHdr();
		HdrPanel.focusFirstComponent();
	}
	@Override
	public void setUPDStatus() {
		super.setUPDStatus();
		setHdrMode();
		//閉確対応
		getHdrR().setStatus(MCRow.NONE);
		HdrPanel.focusFirstComponent();
	}
	
	@Override
	public void setDELStatus() {
		super.setDELStatus();
		//閉確対応
		getHdrR().setStatus(MCRow.NONE);
		DtlTable.selectLeftmostColumn(0);
	}
	
	/**
	 * ヘッダのモードを設定します
	 */
	protected void setHdrMode() {
		if (!getHdrR().sppl_iv_flg()) {
			// 受領インボイスＮＯ
			Hdr_rcpt_iv_no.setMode(MCMode.READ_ONLY);
			// 対応受領インボイスＮＯ
			Hdr_ref_rcpt_iv_no.setMode(MCMode.READ_ONLY);
			// 支払予定日
			Hdr_pay_schd_dt.setMode(MCMode.READ_ONLY);
			Hdr_pay_basis_dt.setMode(MCMode.REQUIRED);
		}
		else {
			// 受領インボイスＮＯ
			Hdr_rcpt_iv_no.setMode(MCMode.ENABLE);
			// 対応受領インボイスＮＯ
			Hdr_ref_rcpt_iv_no.setMode(MCMode.ENABLE);
			// 支払起算日、支払予定日のモード設定
			if (getHdrR().pay_spot_flg()) {
				Hdr_pay_basis_dt.setMode(MCMode.READ_ONLY);
				Hdr_pay_schd_dt.setMode(MCMode.REQUIRED);
				setValueEx(Hdr_pay_basis_dt, null);
			}
			else {
				Hdr_pay_schd_dt.setMode(MCMode.READ_ONLY);
				Hdr_pay_basis_dt.setMode(MCMode.REQUIRED);
				setValueEx(Hdr_pay_schd_dt, null);
			}
		}

		

	}
	// -----------------------------------------------
	// 値の設定
	// -----------------------------------------------
	/**
	 * 検索枠の初期値を設定します
	 */
	protected void setCnd() {
		setValueEx(Cnd_latest_flg, true);
		setSrchTgtTyp();
	}
	
	/**
	 * ヘッダ枠の初期値を設定します
	 */
	protected void setHdr() {
		setValueEx(Hdr_dummy_upri_cng_flg, true);
		setValueEx(Hdr_base_cur_cd, getCo().base_cur_cd());
		setValueEx(Hdr_purc_dt, getToday());
		setValueEx(Hdr_ac_dt, getToday());
		if (!getHdrR().sppl_iv_flg() || !getHdrR().pay_spot_flg()) {
			setValueEx(Hdr_pay_basis_dt, getToday());
		}
		
		setValueEx(Hdr_ptax_cur_cd, getCo().ptax_cur_cd());
		setValueEx(Hdr_xrate_cd, getCo().purc_xrate_cd());
		getHdrR().setStatus(Status.NONE);
	}
	
		/**
		 * ヘッダの金額合計を設定する。
		 */
		protected void setDispAmt() {
			MCNumber trdCurAmt = MCNumber.ZERO;
			MCNumber trdCurIncTaxAmt = MCNumber.ZERO;
			for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
				if (!isNull(r.trd_cur_amt())) {
					trdCurAmt = trdCurAmt.add(r.trd_cur_amt());
				}
				if (!isNull(r.trd_cur_inc_tax_amt())) {
					trdCurIncTaxAmt = trdCurIncTaxAmt.add(r.trd_cur_inc_tax_amt());
				}
			}
			getHdrR().trd_cur_amt(trdCurAmt);
			getHdrR().trd_cur_inc_tax_amt(trdCurIncTaxAmt);
		}
		
	/**
	 * 検索対象区分の初期値を設定します
	 */
	protected void setSrchTgtTyp() {
		setValueEx(Cnd_srch_tgt_typ_nm, MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.name());
	}
	/**
	 * 税初期値を設定します。(行指定)
	 * @param dtlR
	 */
	protected void setDefaultTaxCd(DtlR dtlR) {
		if (!isNull(dtlR.ref_purc_act_d_no())) {
			return;
		}
		String taxCd = MSUCP_PurcUtil.getPurcTaxCd(
				dtlR.itm_cd(), 
				dtlR.itm_sub1(), 
				dtlR.itm_sub2(), 
				dtlR.itm_sub3(), 
				Hdr_sppl_cd.getValue(), 
				Hdr_purc_dt.getValue(), 
				this);
		setValueEx(columnDtl_tax_cd, dtlR.getGUIIndex(), taxCd);
	}
	/**
	 * ＩＶ表記品名を設定します。
	 * @param dtlR
	 */
	protected void setIvItmNm(DtlR dtlR) {
		if (!Hdr_sppl_iv_flg.getValue()){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(Hdr_prnt_lcl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			}
			else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), row.getStringNE("itm_nm"));
			}
		}
	}

	/**
	 * 発注先品目・品名を設定します
	 * @param dtlR
	 */
	protected void setSpplItm(DtlR dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(Hdr_sppl_cd.getValue(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), Hdr_purc_dt.getValue(), this);
		if (isNull(row)) {
			setValueEx(columnDtl_sppl_itm_cd, dtlR.getGUIIndex(), null);
			setValueEx(columnDtl_sppl_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl_sppl_itm_cd, dtlR.getGUIIndex(), row.getStringNE("bp_itm_cd"));
			setValueEx(columnDtl_sppl_itm_nm, dtlR.getGUIIndex(), row.getStringNE("bp_itm_nm"));
		}
	}
	/**
	 * 参照情報をクリアする
	 */
	protected void cleanRefData() {
		setValueEx(columnDtl_ref_purc_act_no, null);
		setValueEx(columnDtl_ref_purc_act_rev, null);
		setValueEx(columnDtl_ref_purc_act_seq, null);
		setValueEx(columnDtl_ref_purc_act_d_no, null);
		setValueEx(columnDtl_ref_purc_act_d_seq, null);
		setValueEx(columnDtl_act_ac_dt, null);
		setValueEx(columnDtl_act_unit_qty, null);
		setValueEx(columnDtl_act_unit_cd, null);
		setValueEx(columnDtl_act_unit_nm, null);
		setValueEx(columnDtl_act_cur_upri, null);
		setValueEx(columnDtl_act_cur_amt, null);
		setValueEx(columnDtl_act_tax_amt, null);
		setValueEx(columnDtl_act_tax_cd, null);
		setValueEx(columnDtl_act_tax_nm, null);
		setValueEx(columnDtl_act_tax_rate, null);
		setValueEx(columnDtl_act_cur_tax_amt, null);
	}
	// -----------------------------------------------
	// If実装
	// -----------------------------------------------
	@Override
	protected List<String> getNotInheritCols(String type, MCContainer cont) {
		List<String> list = super.getNotInheritCols(type, cont);
		if (cont == getHdrR()) {
			list.add(HdrR.$purc_act_no);
			list.add(HdrR.$purc_act_rev);
			list.add(HdrR.$purc_act_seq);
			list.add(HdrR.$purc_dt);
			list.add(HdrR.$ac_dt);
			list.add(HdrR.$ac_ym);
			list.add(HdrR.$ptax_dt);
			list.add(HdrR.$latest_flg);
			list.add(HdrR.$can_flg);
			list.add(HdrR.$can_ac_dt);
			list.add(HdrR.$can_ac_dt_for_input);
			list.add(HdrR.$ac_dt_after_srch);
		}
		else if (cont == getDtlL()) {
			list.add(DtlR.$purc_act_d_no);
			list.add(DtlR.$purc_act_d_seq);
			list.add(DtlR.$ref_purc_act_no);
			list.add(DtlR.$ref_purc_act_rev);
			list.add(DtlR.$ref_purc_act_seq);
			list.add(DtlR.$ref_purc_act_d_no);
			list.add(DtlR.$ref_purc_act_d_seq);
			list.add(DtlR.$act_ac_dt);
			list.add(DtlR.$act_unit_qty);
			list.add(DtlR.$act_unit_cd);
			list.add(DtlR.$act_unit_nm);
			list.add(DtlR.$act_cur_upri);
			list.add(DtlR.$act_cur_amt);
			list.add(DtlR.$act_tax_amt);
			list.add(DtlR.$act_tax_cd);
			list.add(DtlR.$act_tax_nm);
			list.add(DtlR.$act_tax_rate);
			list.add(DtlR.$act_cur_tax_amt);
			list.add(DtlR.$purc_dtl_upd_flg);
		}
		return list;
	}
	@Override
	public MCButtonGroup getOpeButtonGroup() {
		return Cnd_ope_Group;
	}

	@Override
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getHdrR());
		ret.add(getDtlL());
		return ret;
	}

	@Override
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> ret = new ArrayList<MCContainer>();
		ret.add(getCndR());
		return ret;
	}
	
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}
	
	@Override
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}
	
	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;		
	}
	
	public MCRowBeans getCndRevNo() {
		return Cnd_rev_no;
	}
	
	@Override
	public boolean isStatusChange() {
		return true;
	}
	
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}
	
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setRevNoMode();
		CndPanel.focusFirstComponent();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setRevNoMode();
		DtlTable.selectLeftmostColumn(0);
	}
	
	//----------------------------------
	// 源泉税率関連
	//----------------------------------
	/**
	 * 源泉税率取得
	 * @param r
	 */
	protected void setWtaxRate(DtlR r) {
		if (canEditWtaxRate(r)) {
			if (isNullAnd(r.ref_purc_act_no(), r.ref_purc_act_d_no())) {
				// 源泉税率取得
				MCNumber wtaxRate = MAUCP_ItmUtil.getWtaxRate(r.itm_cd(),
						r.itm_sub1(),
						r.itm_sub2(),
						r.itm_sub3(),
						getHdrR().purc_dt(),
						this);
				setValueEx(columnDtl_wtax_rate, r.getGUIIndex(), wtaxRate);
			}
		}
		else {
			clearWtaxRate(r);
		}
	}
	/**
	 * 源泉税率取得
	 * @param r
	 */
	protected void setWtaxRate() {
		for (DtlR r : exceptDeleteAndEmpty(getDtlL())) {
			if (!r.isEmpty()) {
				setWtaxRate(r);
			}
		}
	}
	
	/**
	 * 源泉税率をクリアします
	 * @param dtlR
	 */
	protected void clearWtaxRate(DtlR dtlR) {
		if (!canEditWtaxRate(dtlR)) {
			setValueEx(columnDtl_wtax_rate, dtlR.getGUIIndex(), null);
		}
	}
	/**
	 * 源泉税率編集可能な状態であるか否かを判定します。
	 * @return
	 */
	protected boolean canEditWtaxRate(DtlR dtlR) {
		String trdCurCd = getHdrR().trd_cur_cd();
		String baseCurCd = getHdrR().base_cur_cd();
		String ptaxCurCd = getHdrR().ptax_cur_cd();
		
		if (isSame(trdCurCd, baseCurCd)
				&& (isSame(trdCurCd, ptaxCurCd) || isNull(ptaxCurCd))) {
			return true;
		}
		else {
			return false;
		}
	}
	protected MCRowStatusListener createDtlRowListener() {
		return new DtlRowListener();
	}

	public class DtlRowListener implements MCRowStatusListener {
		@Override
		public void statusChanged(MCRowStatusEvent event) {
			if (isSame(event.getNewStatus(), Status.CREATE)
					&& isSame(event.getOldStatus(), Status.NONE)) {
				DtlR dtlR = (DtlR) event.getSourceRow();
				dtlR.base_purc_ac_dt(getToday());
				setDefaultApDptCd(dtlR);
			}
		}
	}
	
	protected void setDefaultApDptCd(DtlR dtlR) {
		if (!dtlR.isEmpty() && isEditable(columnDtl_ap_dpt_cd, dtlR.getGUIIndex())) {
			if(!isNull(getHdrR().ap_dpt_cd()) && isNull(getBulkSetR().ap_dpt_cd())) {
				setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), getHdrR().ap_dpt_cd());
			}else {
				setValueEx(columnDtl_ap_dpt_cd, dtlR.getGUIIndex(), getBulkSetR().ap_dpt_cd());
			}
		}
	}
	@Override
	public MCBeans getAcDtBeans(MCRootPanel panel) {
		return Hdr_ac_dt;
	}
	@Override
	public MCBeans getScreenOpeBeans(MCRootPanel panel) {
		return Cnd_ope_Group;
	}
	@Override
	public boolean isCanAcDtValueInitOpe(MCRootPanel panel) {
		if (Cnd_ope_UPD.isSelected() || Cnd_ope_DEL.isSelected()) {
			return true;
		}
		return false;
	}
	@Override
	public MCBeans getCheckBeans(MCRootPanel panel) {
		return null;
	}

}