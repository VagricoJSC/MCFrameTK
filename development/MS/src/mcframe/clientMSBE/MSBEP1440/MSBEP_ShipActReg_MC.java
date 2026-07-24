package mcframe.clientMSBE.MSBEP1440;

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
import mcframe.clientMAUB.MAUBP0110.*;
import mcframe.clientMAUB.MAUBP0310.*;
import mcframe.clientMAUB.MAUBP0320.*;
import mcframe.clientMAUB.MAUBP0330.*;
import mcframe.clientMAUB.MAUBP0410.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5120.*;
import mcframe.clientMAUB.MAUBP5250.*;
import mcframe.clientMAUB.MAUBP5260.*;
import mcframe.clientMAUB.MAUBP5270.*;
import mcframe.clientMAUB.MAUBP5280.*;
import mcframe.clientMAUB.MAUBP5290.*;
import mcframe.clientMAUB.MAUBP5360.*;
import mcframe.clientMSUB.MSUBP0070.*;
import mcframe.clientMSUB.MSUBP5020.*;
import mcframe.clientMSUB.MSUBP5030.*;
import mcframe.clientMSUB.MSUBP5050.*;

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
import mcframe.clientCore.beans.list.MCLinkBeans;
import mcframe.clientMAUC.MAUCP0160.MAUCP_ItmUtil;
import mcframe.clientMAUD.MAUDP0010.IfOpePanel;
import mcframe.clientFSUB.FSUBP0000.IfRowMoveBase;
import static mcframe.commonMSUA.MSUAC0060.MSUAC_List.*;
import mcframe.clientMSUD.MSUDP0020.IfStkInspBase;
import java.util.function.Predicate;
import mcframe.clientCore.beans.list.MCListPutter;
import mcframe.clientMSUC.MSUCP0110.MSUCP_StrLnUtil;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_ShipActReg"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_ShipActReg_MC extends MSBEP_ShipActReg_MC_A implements IfOpePanel, IfRowMoveBase, IfStkInspBase, IfCanAcDtBase {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START

	/**
	 * 訂正(納品書NO検索)時の下り電文を保持<br>
	 */
	protected MCList<DtlR> _updOrgDtlL = createDtlL();

	/**
	 * 品揃え対象の出荷が揃っているかをチェック
	 */
	protected AssortChecker _assortChkr = new AssortChecker();

	/**
	 * 出荷予定変更登録からの遷移の場合に「true」が設定される
	 */
	protected boolean _$Fr_MSBEP1420 = false;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipActReg_MC() {
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
	public MSBEP_ShipActReg_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL1440_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Sprt01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Sprt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_InputSupporter<P, B> {

		protected MS_MSBEL1440_Sprt01Caller(P p, B b) {
			super(p, b);
		}
	}


	/**
	 * Panel[Btn]のボタン[sprt_ac_dt]の押下時の処理
	 */
	@Override
	public void doBtn_sprt_ac_dt(MCEventInfo info) {
		callMS_MSBEL1440_Sprt01();
	}
	
	/**
	 * [MS_MSBEL1440_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Prnt01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Prnt01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Printer<P, B> {

		protected MS_MSBEL1440_Prnt01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void showMerge() {
			HdrR hdrR = getHdrR();
			if (!hdrR.dlv_slip_prnted_flg()) {
				hdrR.dlv_slip_prnted_flg(bridge.down0().dlv_slip_prnted_flg());
			}
			if (!hdrR.ship_adv_prnted_flg()) {
				hdrR.ship_adv_prnted_flg(bridge.down0().ship_adv_prnted_flg());
			}
		}
		@Override
		protected void setMode() {
			super.setMode();
			// 印刷ボタンを押下不可にする
			setFixUStatus();
		}
	}

	/**
	 * [MS_MSBEL1440_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL1440_Srch01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			setUplndFlg(false);
			setInitHdrR();

			getDtlL().forEach(r -> r.setStatus(MCRow.CREATE));	// 行削除のため
		}
		@Override
		protected void setMode() {
			super.setMode();
			setInsStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
		}
	}

	/**
	 * [MS_MSBEL1440_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch02Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Srch02Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL1440_Srch02Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void checkReq(MCMessageList msgList, MCContainer cont) {
			if (cont == getCndR()
				&& !MSC_STK_SRCH_TGT_TYP.isIV_NO(getCndR().srch_tgt_typ())) {
				// 指図対象外の場合はチェックしない
				return;
			}
			super.checkReq(msgList, cont);
		}
		@Override
		protected void show() {
			super.show();
			setUplndFlg(false);
			setInitHdrR();
			setDlvInfToHdr();

			getDtlL().forEach(r -> r.setStatus(MCRow.CREATE));	// 行削除のため
			getCndR().ship_schd_no(null);
		}
		@Override
		protected void setMode() {
			super.setMode();
			setInsStatus();
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
		}
	}

	/**
	 * [MS_MSBEL1440_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch03Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Srch03Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {
		protected MS_MSBEL1440_Srch03Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void show() {
			super.show();
			// 取消計上日は検索時の計上日で補完する
			setCanAcDt(getHdrR().ac_dt());
			setDefPrntFlg();
			_assortChkr.init();

			// 明細の納品先をヘッダに表示
			MCList<DtlR> dtlL = getDtlL().subList(r -> !isNull(r.itm_cd()));
			dtlL.forEach(r -> 	setStkArrvBpInf(r, false));
			setDlvInfToHdr();
			
			// 納品書NO検索の場合、その納品書のみ表示する(更新時はすべて上り電文に設定する)
			showSubForDlv();
			showSubOnlyflg();
		}
		@Override
		protected void setMode() {
			super.setMode();
			if (Cnd_ope_UPD.isSelected()) {
				setUpdStatus();
			}
			else if (Cnd_ope_DEL.isSelected()) {
				setDelStatus();
			}
			else {
				setRefStatus();
			}
		}
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setStatus(SRCH);
		}
	}

	/**
	 * [MS_MSBEL1440_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Ins01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Ins01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBEL1440_Ins01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
			// 品揃えチェック
			msgList.addAll(_assortChkr.check());
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().dlv_slip_prnt_flg() || getHdrR().ship_adv_prnt_flg());
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			setDlvInf(bridge.up1());
		}
		@Override
		protected void setMode() {
			super.setMode();
			setFixIStatus();
		}
		@Override
		protected boolean checkUpListParamEmpty() {
			// 検索、即登録も可能なので、チェックしない
			return true;
		}
	}

	/**
	 * [MS_MSBEL1440_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Upd01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Upd01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Updater<P, B> {
		protected MS_MSBEL1440_Upd01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void confirmForCallStack(MCMessageList msgList) {
			super.confirmForCallStack(msgList);
			// 入力値チェック
			msgList.addAll(inptChk());
			// 品揃えチェック
			msgList.addAll(_assortChkr.check());
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().dlv_slip_prnt_flg() || getHdrR().ship_adv_prnt_flg());
		}
		@Override
		protected void setupParam() {
			super.setupParam();

			// 納品書NO単位の場合、画面の表示順を考慮して上り電文に設定する
			if (!_updOrgDtlL.isEmpty()) {
				bridge.up0().dlv_slip_no(getCndR().srch_tgt_no());

				bridge.up1().clear();
				boolean added = false;
				for (DtlR r : _updOrgDtlL) {
					if (isSame(r.dlv_slip_no(), getCndR().srch_tgt_no())) {
						if (!added) { 
							bridge.up1().addAll(exceptEmpty(getDtlL()));
							added = true;
						}
					}
					else {
						bridge.up1().add(r);
					}
				}
			}
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
			setDlvInf(bridge.up1());
		}
		@Override
		protected void show() {
			super.show();
			// 納品書NO検索の場合、その納品書のみ表示する(更新時はすべて上り電文に設定する)
			showSubForDlv();
		}
		@Override
		protected void setMode() {
			super.setMode();
			setFixUStatus();
		}
	}

	/**
	 * [MS_MSBEL1440_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Del01Caller<P extends MSBEP_ShipActReg, B extends MS_MSBEL1440_Del01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Deleter<P, B> {
		protected MS_MSBEL1440_Del01Caller(P p, B b) {
			super(p, b);
		}
		@Override
		protected void initCaller() {
			super.initCaller();
			setPrint(getHdrR().dlv_slip_prnt_flg() || getHdrR().ship_adv_prnt_flg());
		}
		@Override
		protected void beforeCall() {
			super.beforeCall();
		}
		@Override
		protected void setMode() {
			super.setMode();
			setFixDStatus();
		}
		@Override
		protected boolean checkUpListParamEmpty() {
			// 検索、即削除も可能なので、チェックしない
			return true;
		}
		@Override
		protected void checkReq(MCMessageList msgList) {
			super.checkReq(msgList);
			msgList.addAll(panel.checkReq(Hdr_can_ac_dt_for_input));
		}
	}


	/**
	 * Panel[Cnd]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doCnd_srch(MCEventInfo info) {
		CndR cndR =getCndR();
		if (Cnd_ope_INS.isSelected()) {
			if (MSC_STK_SRCH_TGT_TYP.isSHIP_INST_NO(cndR.srch_tgt_typ())) {
				callMS_MSBEL1440_Srch01();
			}
			else if (MSC_STK_SRCH_TGT_TYP.isIV_NO(cndR.srch_tgt_typ())) {
				callMS_MSBEL1440_Srch02();
			}
		}
		else {
			if (MSC_STK_SRCH_TGT_TYP.isDLV_SLIP_NO(cndR.srch_tgt_typ())) {
				cndR.ship_act_no(null);
				cndR.dlv_slip_no(cndR.srch_tgt_no());
			}
			else { 
				cndR.ship_act_no(cndR.srch_tgt_no());
				cndR.dlv_slip_no(null);
			}
			callMS_MSBEL1440_Srch03();
		}
	}

	/**
	 * Panel[Cnd]のボタン[non_srch]の押下時の処理
	 */
	@Override
	public void doCnd_non_srch(MCEventInfo info) {
		callMS_MSBEL1440_Srch02();
	}
	/**
	 * Panel[Btn]のボタン[prnt_dlv_slip]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_dlv_slip(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.dlv_slip_prnt_btn_flg(true);
		hdrR.ship_adv_prnt_btn_flg(false);
		callMS_MSBEL1440_Prnt01();
	}
	/**
	 * Panel[Btn]のボタン[prnt_ship_adv]の押下時の処理
	 */
	@Override
	public void doBtn_prnt_ship_adv(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		hdrR.dlv_slip_prnt_btn_flg(false);
		hdrR.ship_adv_prnt_btn_flg(true);
		callMS_MSBEL1440_Prnt01();
	}

	/**
	 * Panel[Btn]のボタン[open_MSBEP0110]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP0110(MCEventInfo info) {
		openPanel("MS", "MSBEP0110", T2, getHdrR());
	}
	/**
	 * Panel[Btn]のボタン[ins]の押下時の処理
	 */
	@Override
	public void doBtn_ins(MCEventInfo info) {
		callMS_MSBEL1440_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[ins_uplnd]の押下時の処理
	 */
	@Override
	public void doBtn_ins_uplnd(MCEventInfo info) {
		callMS_MSBEL1440_Ins01();
	}
	/**
	 * Panel[Btn]のボタン[upd]の押下時の処理
	 */
	@Override
	public void doBtn_upd(MCEventInfo info) {
		callMS_MSBEL1440_Upd01();
	}
	/**
	 * Panel[Btn]のボタン[del]の押下時の処理
	 */
	@Override
	public void doBtn_del(MCEventInfo info) {
		callMS_MSBEL1440_Del01();
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
		sumDim();
		sumWt();
	}
	/**
	 * Panel[Btn]のボタン[rcopy]の押下時の処理
	 */
	@Override
	public void doBtn_rcopy(MCEventInfo info) {
		copyRow(DtlTable);
	}

	@Override
	protected void setupParts() {
		super.setupParts();
		Hdr_ac_dt_p_PPanel.setRelateBeans(Hdr_ship_dt);
		Hdr_ship_to_addr_p_PPanel.setRelateBeans(Hdr_ship_to_id_cd, Hdr_ship_to_id_nm, Hdr_ship_to_sundry_flg);
		Hdr_dlv_addr_p_PPanel.setRelateBeans(Hdr_dlv_id_cd, Hdr_dlv_id_nm, Hdr_dlv_sundry_flg);
		Hdr_ship_usr_dpt_p_PPanel.setRelateBeans(Hdr_ac_dt);
		Dtl_itm_p_PPanel.setRelateBeans(columnDtl_sundry_itm_flg);
		Dtl_ver_no_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3, null, columnDtl_ver_flg);
		Dtl_trd_unit_qty_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_trd_unit_cd, columnDtl_trd_unit_dec_place, columnDtl_trd_unit_rnd_typ,
			columnDtl_trd_unit_conv_base_qty, columnDtl_trd_unit_conv_qty, columnDtl_base_unit_cd);
		Dtl_base_unit_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd,
				columnDtl_base_unit_dec_place, columnDtl_base_unit_rnd_typ,
				columnDtl_trd_unit_qty, columnDtl_trd_unit_conv_base_qty,
				columnDtl_trd_unit_conv_qty);
		Dtl_schd_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_inst_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ship_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_sls_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_arr_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_iv_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_ret_qty_p_PPanel.setRelateBeans(columnDtl_base_unit_cd, columnDtl_base_unit_dec_place);
		Dtl_std_cont_qty_p_PPanel.setRelateBeans(
			columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, null,
			columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_act_cont_qty_p_PPanel.setRelateBeans(
			columnDtl_cont_fctr_flg, columnDtl_base_unit_qty, columnDtl_std_cont_fctr, columnDtl_act_cont_fctr,
			columnDtl_cont_fctr_dec_place, columnDtl_cont_fctr_rnd_typ);
		Dtl_str_ln_p_PPanel.setRelateBeans(columnDtl_ship_loc_cd, columnDtl_ship_str_ln_tgt_flg);
		Dtl_dlv_str_ln_p_PPanel.setRelateBeans(columnDtl_dlv_id_cd, columnDtl_dlv_str_ln_tgt_flg);
		Dtl_lot_no_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_lot_mng_typ, columnDtl_sublot_mng_typ);
		Dtl_sno_wrk_no_p_PPanel.setRelateBeans(
			columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
			columnDtl_sno1_mng_typ, columnDtl_sno2_mng_typ, columnDtl_sno3_mng_typ, columnDtl_sno4_mng_typ);
		Dtl_stk_bp_p_PPanel.setRelateBeans(columnDtl_stk_id_typ);
		Dtl_dlv_addr_p_PPanel.setRelateBeans(columnDtl_dlv_id_cd, columnDtl_dlv_id_nm, columnDtl_dlv_sundry_flg);
		
		Dtl_trd_unit_qty_p_PPanel.columnQty_qty.setName("trd_unit_qty_p.qty");
		Dtl_base_unit_qty_p_PPanel.columnQty_qty.setName("base_unit_qty_p.qty");
		Dtl_schd_qty_p_PPanel.columnQty_qty.setName("schd_qty_p.qty");
		Dtl_inst_qty_p_PPanel.columnQty_qty.setName("inst_qty_p.qty");
		Dtl_ship_qty_p_PPanel.columnQty_qty.setName("ship_qty_p.qty");
		Dtl_ret_qty_p_PPanel.columnQty_qty.setName("ret_qty_p.qty");
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("str_ln_p.str_ln_cd");
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("str_ln_p.str_ln_nm");
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("str_ln_p.str_ln_cd_none_flg");
		Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd.setName("dlv_str_ln_p.str_ln_cd");
		Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_nm.setName("dlv_str_ln_p.str_ln_nm");
		Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.setName("dlv_str_ln_p.str_ln_cd_none_flg");
		Dtl_act_cont_qty_p_PPanel.columnContQty_cont_qty.setName("act_cont_qty_p.cont_qty");
		Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty.setName("std_cont_qty_p.cont_qty");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1.setName("sno_wrk_no_p.sno1");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2.setName("sno_wrk_no_p.sno2");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3.setName("sno_wrk_no_p.sno3");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4.setName("sno_wrk_no_p.sno4");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.setName("sno_wrk_no_p.wrk_no");
		Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.setName("sno_wrk_no_p.wrk_nm");
	}

	@Override
	protected <E extends MCConstRow> void clearNotInheritInfo(MCTable<E> table, E row) {
		super.clearNotInheritInfo(table, row);
		if (row instanceof DtlR) {
			DtlR r = (DtlR)row;
			if (!r.dscnt_itm_flg()) {
				// 値引品目以外はクリア
				r.trd_unit_qty(null);
			}
		}
	}
	@Override
	protected List<java.lang.String> getNotInheritCols(String type, MCContainer cont) {
		List<String> colL = super.getNotInheritCols(type, cont);
		if (isSame(type, NOT_INHERIT_TYPE_COPY_ROW)) {
			if (cont == getDtlL()) {
				colL.add(DtlR.$ship_act_d_no);
				colL.add(DtlR.$dlv_slip_d_no);
				colL.add(DtlR.$disp_seq);
			}
		}
		else if (isSame(type, NOT_INHERIT_TYPE_REF_UPD)) {
			if (cont == getHdrR()) {
				colL.add(HdrR.$ship_act_no);
				colL.add(HdrR.$ship_act_rev);
				colL.add(HdrR.$can_flg);
				colL.add(HdrR.$ship_inst_no);
				colL.add(HdrR.$iv_no);
				colL.add(HdrR.$ship_inst_dt);
				colL.add(HdrR.$ship_inst_hm);
				colL.add(HdrR.$dlv_slip_prnted_flg);
				colL.add(HdrR.$ship_adv_prnted_flg);
			}
			else if (cont == getDtlL()) {
				colL.add(DtlR.$slo_d_no);
				colL.add(DtlR.$xfr_schd_no);
				colL.add(DtlR.$ship_schd_no);
				colL.add(DtlR.$ship_alloc_sts_no);
				colL.add(DtlR.$ship_inst_d_no);
				colL.add(DtlR.$iv_no);
				colL.add(DtlR.$iv_d_no);
				colL.add(DtlR.$dlv_slip_no);
				colL.add(DtlR.$dlv_slip_d_no);
				colL.add(DtlR.$ship_act_d_no);
				colL.add(DtlR.$read_only_flg);
			}
		}
		return colL;
	}

	@Override
	public void setStatus(String status) {
		super.setStatus(status);
		if (isSRCHStatus(status)) {
			setRevNoMode();
		}
		setModeSub();
		setFocus();
	}

	/**
	 * モード切替後に条件ごとに設定する
	 */
	protected void setModeSub() {
		setUplndMode();
		setIvMode();
		setBtnMode();
		setIndivPrnt();
		relayout();
	}
	/**
	 * 個別発行を設定する。
	 */
	protected void setIndivPrnt(){
		setValueEx(Btn_indiv_prnt_flg, false);
	}

	/**
	 * 計画外でのモード設定
	 */
	protected void setUplndMode() {
		HdrR hdrR = getHdrR();
		if (!hdrR.uplnd_flg()) return;
		setViaDlvTypMode();
		if (isNull(hdrR.trd_ptn_typ())) {
			Hdr_ship_to_id_typ.setMode(MCMode.READ_ONLY);
			Hdr_ship_to_id_cd.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
		}
		else if (isNull(hdrR.ship_to_id_typ())) {
			setDefaultMode(Hdr_ship_to_id_typ);
			Hdr_ship_to_id_cd.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
		}
		else if (isNull(hdrR.ship_to_id_cd())) {
			setDefaultMode(Hdr_ship_to_id_typ);
			setDefaultMode(Hdr_ship_to_id_cd);
			Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
		}
		else if (MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
			if (isNull(hdrR.dlv_id_typ())) {
				setDefaultMode(Hdr_ship_to_id_typ);
				setDefaultMode(Hdr_ship_to_id_cd);
				setDefaultMode(Hdr_dlv_id_typ);
				Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
			}
			else {
				setDefaultMode(Hdr_ship_to_id_typ);
				setDefaultMode(Hdr_ship_to_id_cd);
				setDefaultMode(Hdr_dlv_id_typ);
				setDefaultMode(Hdr_dlv_id_cd);
			}
		}
		else if (!MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
			setDefaultMode(Hdr_ship_to_id_typ);
			setDefaultMode(Hdr_ship_to_id_cd);
			Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
			Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
		}

		if (!hdrR.ship_to_sundry_flg()) {
			Hdr_ship_to_id_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			if (Hdr_ship_to_id_cd.getMode() == MCMode.READ_ONLY) {
				Hdr_ship_to_id_nm.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_ship_to_id_nm.setMode(MCMode.REQUIRED);
			}
		}
		if (!hdrR.dlv_sundry_flg()) {
			Hdr_dlv_id_nm.setMode(MCMode.READ_ONLY);
			Hdr_dlv_addr_p_PPanel.setREAD_ONLYStatus();
		}
		else {
			if (Hdr_dlv_id_cd.getMode() == MCMode.READ_ONLY) {
				Hdr_dlv_id_nm.setMode(MCMode.READ_ONLY);
			}
			else {
				Hdr_dlv_id_nm.setMode(MCMode.REQUIRED);
			}
			if (super.isINSStatus(getStatus()) || super.isUPDStatus(getStatus())) {
				Hdr_dlv_addr_p_PPanel.setENABLEStatus();
			}
		}
		if (!isNull(hdrR.dlv_id_cd()) && MAC_TRD_PTN_TYP.isSLS(hdrR.trd_ptn_typ())) {
			setDefaultMode(Hdr_dlv_pri_prnt_flg);
		}
		else {
			Hdr_dlv_pri_prnt_flg.setMode(MCMode.READ_ONLY);
		}

		if (isNull(hdrR.trd_ptn_typ())) {
			Hdr_rqst_dpt_cd.setMode(MCMode.READ_ONLY);
		}
		else {
			if (!isSlsOrShip(hdrR.trd_ptn_typ())) {
				if (super.isINSStatus(getStatus()) || super.isUPDStatus(getStatus())) {
					Hdr_rqst_dpt_cd.setMode(MCMode.ENABLE);
				}
			}
			else {
				setDefaultMode(Hdr_rqst_dpt_cd);
			}
		}

		if (super.isUPDStatus(getStatus())) {
			// 計画外の支給の訂正は編集不可
			if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())) {
				Hdr_ship_to_id_typ.setMode(MCMode.READ_ONLY);
				Hdr_ship_to_id_cd.setMode(MCMode.READ_ONLY);
				Hdr_ship_to_id_nm.setMode(MCMode.READ_ONLY);
				Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
				Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
				Hdr_dlv_id_nm.setMode(MCMode.READ_ONLY);
			}
			else if (MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
				Hdr_ship_fr_lg_grp_cd.setMode(MCMode.READ_ONLY);
			}

			// 更新対象外が含まれる場合は編集不可
			if (!canUpd()) {
				Hdr_ship_to_id_typ.setMode(MCMode.READ_ONLY);
				Hdr_ship_to_id_cd.setMode(MCMode.READ_ONLY);
				Hdr_ship_to_id_nm.setMode(MCMode.READ_ONLY);
				Hdr_dlv_id_typ.setMode(MCMode.READ_ONLY);
				Hdr_dlv_id_cd.setMode(MCMode.READ_ONLY);
				Hdr_dlv_pri_prnt_flg.setMode(MCMode.READ_ONLY);
				Hdr_cst_cd.setMode(MCMode.READ_ONLY);
				Hdr_rqst_usr_dpt_p_PPanel.setREAD_ONLYStatus();
				Hdr_rqst_dpt_cd.setMode(MCMode.READ_ONLY);
				Hdr_ship_fr_lg_grp_cd.setMode(MCMode.READ_ONLY);
				Hdr_dlv_addr_p_PPanel.setREAD_ONLYStatus();
				Hdr_dlv_id_nm.setMode(MCMode.READ_ONLY);
			}
		}

		// 指図対象外のモードが計画外を流用しているためここで設定する
		columnDtl_abort_flg.setMode(MCMode.READ_ONLY);

		if (!isSlsOrShip(hdrR.trd_ptn_typ())) {
			Hdr_cst_cd.setMode(MCMode.READ_ONLY);
			columnDtl_cst_po_no.setMode(MCMode.READ_ONLY);
			columnDtl_cst_po_d_no.setMode(MCMode.READ_ONLY);
			columnDtl_cst_dlv_inst_no.setMode(MCMode.READ_ONLY);
			columnDtl_cst_dlv_inst_d_no.setMode(MCMode.READ_ONLY);
			columnDtl_cst_itm_cd.setMode(MCMode.READ_ONLY);
			columnDtl_cst_itm_nm.setMode(MCMode.READ_ONLY);
		}
		else {
			if (canUpd()) {
				setDefaultMode(Hdr_cst_cd);
			}
			setDefaultMode(columnDtl_cst_po_no);
			setDefaultMode(columnDtl_cst_po_d_no);
			setDefaultMode(columnDtl_cst_dlv_inst_no);
			setDefaultMode(columnDtl_cst_dlv_inst_d_no);
			setDefaultMode(columnDtl_cst_itm_cd);
			setDefaultMode(columnDtl_cst_itm_nm);
		}
	}

	protected void setIvMode() {
		if (!isNull(getHdrR().iv_no())) {
			// インボイス単位出荷は打切不可
			columnDtl_abort_flg.setMode(MCMode.READ_ONLY);
		}
		else {
			// インボイス取引でない場合は、Ｉ／Ｖ表記品名は非表示
			if (!getDtlL().isEmpty()) {
				DtlR r = getDtlL().get(0);
				boolean ivFlg = isSlsOrShip(r.trd_ptn_typ()) ? r.cst_iv_flg() : r.iv_trd_flg();
				if (!ivFlg) {
					columnDtl_iv_itm_nm.setMode(MCMode.INVISIBLE);
				}
			}
		}
		if (Cnd_ope_INS.isSelected()) {
			columnDtl_ext_ship_act_no.setMode(MCMode.INVISIBLE);
		}else {
			setDefaultMode(columnDtl_ext_ship_act_no);
		}
	}

	protected void setBtnMode() {
		DtlR r = DtlTable.getSelectedMCRow();
		MCButton openStkInfo = Btn_Btn_open_MSBEP0500_PPanel.StkInfo_open_MSBEP0500;

		// 行追加、行削除、行コピーボタン
		if (isINSStatus(getStatus()) || isUPDStatus(getStatus())) {
			if (r == null || !canUpd(r)) {
				Btn_rdel.setMode(MCMode.DISABLE);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else if (!isNull(r.ship_alloc_sts_no()) && r.dscnt_itm_flg()) {
				setDefaultMode(Btn_rdel);
				Btn_rcopy.setMode(MCMode.DISABLE);
			}
			else {
				setDefaultMode(Btn_rdel);
				setDefaultMode(Btn_rcopy);
			}
		}
		// 画面遷移ボタン
		// 在庫選択画面
		if (isEnableBtn_open_MSBEP0500(r)) {
			setDefaultMode(openStkInfo);
		}
		else {
			openStkInfo.setMode(MCMode.DISABLE);
		}
		if (Cnd_ope_REF.isSelected()) {
			if (getHdrR().non_dlv_prnt_flg()) {
				Btn_prnt_dlv_slip.setMode(MCMode.DISABLE);
			}
			if (getHdrR().non_adv_prnt_flg()) {
				Btn_prnt_ship_adv.setMode(MCMode.DISABLE);
			}
			if (getHdrR().can_flg()) {
				Btn_prnt_ship_adv.setMode(MCMode.DISABLE);
				Btn_open_MSBEP0110.setMode(MCMode.DISABLE);
			}
		}
	}
	/**
	 * 在庫情報選択画面に遷移できるか
	 * @param r
	 * @return
	 */
	protected boolean isEnableBtn_open_MSBEP0500(DtlR r) {
		if (!isUplnd()) {
			if (r == null) {
				return false;
			}
			else if (!isValidDtlR(r)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 登録モードを設定する
	 */
	protected void setInsStatus() {
		if (isUplnd()) {
			setStatus(INS);
		}
		else if (isInstTypPick()) {
			setStatus(INS_SRCH);
		}
		else {
			setStatus(INS_NON);
		}
	}

	/**
	 * 訂正モードを設定する
	 */
	protected void setUpdStatus() {
		if (isUplnd()) {
			setStatus(UPD);
		}
		else if (isInstTypPick()) {
			setStatus(UPD_SRCH);
		}
		else {
			setStatus(UPD_NON);
		}
		// 更新不可行がある、もしくは納品書で検索している場合
		if (!canUpd()
			|| MSC_STK_SRCH_TGT_TYP.isDLV_SLIP_NO(getCndR().srch_tgt_typ())) {
			Hdr_ac_dt.setMode(MCMode.READ_ONLY);
			Hdr_ship_ymdhm_p_PPanel.setREAD_ONLYStatus();
			Hdr_dlv_ymdhm_p_PPanel.setREAD_ONLYStatus();
			Hdr_ship_usr_dpt_p_PPanel.setREAD_ONLYStatus();
			Hdr_intr_rmrks.setMode(MCMode.READ_ONLY);
			Hdr_sub_char1.setMode(MCMode.READ_ONLY);
			Hdr_sub_char2.setMode(MCMode.READ_ONLY);
			Hdr_sub_char3.setMode(MCMode.READ_ONLY);
			Hdr_can_ac_dt_for_input.setMode(MCMode.READ_ONLY);
		}
		if (MSC_STK_SRCH_TGT_TYP.isDLV_SLIP_NO(getCndR().srch_tgt_typ())) {
			Hdr_ship_adv_prnt_flg.setMode(MCMode.READ_ONLY);
		}
		
		boolean canUpd = false;
		for (DtlR r : getDtlL()) {
			if (canUpd(r)) {
				canUpd = true;
				break;
			}
		}
		if (!canUpd) {
			// 更新できる明細が存在しない場合
			Hdr_dlv_slip_prnt_flg.setMode(MCMode.READ_ONLY);
			Hdr_ship_adv_prnt_flg.setMode(MCMode.READ_ONLY);
			Btn_Btn_open_MSBEP0500_PPanel.setDISABLEStatus();
			Btn_menu_move_p_PPanel.setDISABLEStatus();
			if (getDtlL().subList(r -> canAbortUpdEx(r)).isEmpty()) {
				Btn_upd.setMode(MCMode.DISABLE);
			}
		}
	}

	/**
	 * 取消モードを設定する
	 */
	protected void setDelStatus() {
		if (isUplnd()) {
			setStatus(DEL);
		}
		else if (isInstTypPick()) {
			setStatus(DEL_SRCH);
		}
		else {
			setStatus(DEL_NON);
		}

		boolean canUpd = false;
		for (DtlR r : getDtlL()) {
			if (canUpd(r)) {
				canUpd = true;
				break;
			}
		}
		if (!canUpd) {
			// 更新できる明細が存在しない場合
			Hdr_dlv_slip_prnt_flg.setMode(MCMode.READ_ONLY);
			Btn_del.setMode(MCMode.DISABLE);
			Hdr_can_ac_dt_for_input.setMode(MCMode.READ_ONLY);
		}
	}

	/**
	 * 参照モードを設定する
	 */
	protected void setRefStatus() {
		if (isUplnd()) {
			setStatus(REF);
		}
		else if (isInstTypPick()) {
			setStatus(REF_SRCH);
		}
		else {
			setStatus(REF_NON);
		}
	}

	/**
	 * 登録後モードを設定する
	 */
	protected void setFixIStatus() {
		if (isUplnd()) {
			setStatus(FIX_I);
		}
		else if (isInstTypPick()) {
			setStatus(FIX_I_SRCH);
		}
		else {
			setStatus(FIX_I_NON);
		}
	}

	/**
	 * 更新後モードを設定する
	 */
	protected void setFixUStatus() {
		if (isUplnd()) {
			setStatus(FIX_U);
		}
		else if (isInstTypPick()) {
			setStatus(FIX_U_SRCH);
		}
		else {
			setStatus(FIX_U_NON);
		}
	}

	/**
	 * 取消後モードを設定する
	 */
	protected void setFixDStatus() {
		if (isUplnd()) {
			setStatus(FIX_D);
		}
		else if (isInstTypPick()) {
			setStatus(FIX_D_SRCH);
		}
		else {
			setStatus(FIX_D_NON);
		}
	}

	@Override
	public boolean isINSStatus(String status) {
		return super.isINSStatus(status)
			|| isSame(status, INS_NON)
			|| isSame(status, INS_SRCH);
	}

	@Override
	public boolean isUPDStatus(String status) {
		return super.isUPDStatus(status)
			|| isSame(status, UPD_NON)
			|| isSame(status, UPD_SRCH);
	}

	@Override
	public boolean isDELStatus(String status) {
		return super.isDELStatus(status)
			|| isSame(status, DEL_NON)
			|| isSame(status, DEL_SRCH);
	}

	@Override
	public boolean isREFStatus(String status) {
		return super.isREFStatus(status)
			|| isSame(status, REF_NON)
			|| isSame(status, REF_SRCH);
	}

	@Override
	public boolean isFIX_IStatus(String status) {
		return super.isFIX_IStatus(status)
			|| isSame(status, FIX_I_NON)
			|| isSame(status, FIX_I_SRCH);
	}

	@Override
	public boolean isFIX_UStatus(String status) {
		return super.isFIX_UStatus(status)
			|| isSame(status, FIX_U_NON)
			||  isSame(status, FIX_U_SRCH);
	}

	@Override
	public boolean isFIX_DStatus(String status) {
		return super.isFIX_DStatus(status)
			|| isSame(status, FIX_D_NON)
			||  isSame(status, FIX_D_SRCH);
	}

	/**
	 * 計画外フラグを設定する<br>
	 * 画面の初期値はオン、検索処理後にオフが設定される
	 */
	protected void setUplndFlg(boolean isUplnd) {
		getHdrR().uplnd_flg(isUplnd);
	}
	/**
	 * 扱っている出荷実績が計画外か判定する<br>
	 * 計画外の場合はオンを返す
	 */
	protected boolean isUplnd() {
		return getHdrR().uplnd_flg();
	}

	/**
	 * 扱っている出荷実績が指図対象か判定する<br>
	 * 指図対象(指図引継ぎ)の場合はオンを返す
	 */
	protected boolean isInstTypPick() {
		return !isNull(getHdrR().ship_inst_no());
	}

	/**
	 * 取消計上日を設定する<br>
	 * 取消計上日は、検索時点の計上日が設定される
	 * @param dt
	 */
	protected void setCanAcDt(MCDate dt) {
		getHdrR().can_ac_dt(dt);
	}

	/**
	 * 即時発行フラグのデフォルトを設定する
	 */
	protected void setDefPrntFlg() {
		HdrR hdrR = getHdrR();
		if (Cnd_ope_INS.isSelected() || Cnd_ope_UPD.isSelected()) {
			if (MSC_STK_SRCH_TGT_TYP.isDLV_SLIP_NO(getCndR().srch_tgt_typ())) {
				hdrR.ship_adv_prnt_flg(false);
			}
		}
		else if (Cnd_ope_DEL.isSelected()) {
			hdrR.ship_adv_prnt_flg(false);
		}
		else {
			hdrR.dlv_slip_prnt_flg(false);
			hdrR.ship_adv_prnt_flg(false);
		}
	}

	/**
	 * 納品書NO検索時の後処理
	 */
	protected void showSubForDlv() {
		_updOrgDtlL.clear();
		if (MSC_STK_SRCH_TGT_TYP.isDLV_SLIP_NO(getCndR().srch_tgt_typ())) {
			MCList<DtlR> dtlL = exceptEmpty(getDtlL());
			_updOrgDtlL.setAll(dtlL);
			dtlL.removeAll(
				dtlL.subList(r -> !isSame(r.dlv_slip_no(), getCndR().srch_tgt_no())));
			getDtlL().setAll(dtlL);
		}
	}

	/**
	 * 画面で更新できるかを判断するフラグを設定
	 */
	protected void showSubOnlyflg() {
		Predicate<MCNumber> actQty = n -> !isNull(n) && n.isPositive();
		for (DtlR r : getDtlL()) {

			r.read_only_flg(false);

			if (!isNull(r.ship_act_d_no())) {
				// 輸出済み、返品済み
				if (actQty.test(r.iv_qty()) || actQty.test(r.ret_qty())) {
					r.read_only_flg(true);
				}
				else 	if (!r.sync_flg()) {
					if (actQty.test(r.sls_qty()) || actQty.test(r.arr_qty())) {
						// 検収基準かつ売上済み、着荷要かつ入荷済み
						r.read_only_flg(true);
					}
				}
			}
		}
		// 同一納品書内に設定
		for (MCList<DtlR> lst : getDtlL().groupList(DtlR.$dlv_slip_no)) {
			boolean
				ro_flg = !isNull(lst.getFirst(DtlR.$read_only_flg, true));
			lst.forEach(r -> {
				r.read_only_flg(ro_flg);
			});
		}
	}

	/**
	 * 取引パタンが「売上」「出荷」か判定する
	 */
	protected boolean isSlsOrShip(String trd_ptn_typ) {
			return MAC_TRD_PTN_TYP.isSLS(trd_ptn_typ)
					|| MAC_TRD_PTN_TYP.isSHIP(trd_ptn_typ);
	}

	/**
	 * 取引パタンが「移動・移送」「移動・移送返品」「支給」「支給返品」か判定する
	 */
	protected boolean isXfrOrProv(String trd_ptn_typ) {
			return MAC_TRD_PTN_TYP.isXFR(trd_ptn_typ)
					|| MAC_TRD_PTN_TYP.isXFR_RTN(trd_ptn_typ)
					|| MAC_TRD_PTN_TYP.isPROV(trd_ptn_typ)
					|| MAC_TRD_PTN_TYP.isPROV_RTN(trd_ptn_typ);
	}

	/**
	 * 更新できるか
	 */
	protected boolean canUpd() {
		for (DtlR r : getDtlL()) {
			if (!canUpd(r)) {
				return false;
			}
		}
		return true;
	}
	protected boolean canUpd(DtlR r) {
		return !r.read_only_flg();
	}
	protected boolean canAbortUpdEx(DtlR r) {
		// 輸出後に打ち切りできるか
		if (isNull(getHdrR().iv_no()) && !isNull(r.iv_qty()) && r.iv_qty().isPositive()) {
			return true;
		}
		return false;
	}

	/**
	 * 有効な明細行か判定する
	 */
	protected boolean isValidDtlR(DtlR r) {
		// 品目CDが入力されている場合に有効な明細行とみなす
		return Dtl_itm_p_PPanel.isItmFix(r.getGUIIndex());
	}

	/**
	 * 出荷対象のまとまりを特定するキーを取得する<br>
	 * このキーは以下の場合で使用される
	 * <li>入力値マスタチェックの対象
	 * <li>出荷対象から除外（行削除時）
	 */
	protected String getShipTgtKey() {

		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.ship_inst_no())) {
			// 出荷指図明細単位に予実比をチェック
			return DtlR.$ship_inst_d_no;
		}
		else if (!isNull(hdrR.iv_no())) {
			// インボイス明細単位に予実比をチェック
			return DtlR.$iv_d_no;
		}
		// 出荷予定単位に予実比をチェック
		return DtlR.$ship_schd_no;
	}
	protected MCColumnConfig[] getShipTgtCols() {
		String key = getShipTgtKey();
		if (isSame(key, DtlR.$ship_inst_d_no)) {
			// 出荷指図明細単位に予実比をチェック
			return new MCColumnConfig[]{
				columnDtl_ship_inst_d_no,
				columnDtl_inst_qty
			};
		}
		else if (isSame(key, DtlR.$iv_d_no)) {
			// インボイス明細単位に予実比をチェック
			return new MCColumnConfig[]{
				columnDtl_iv_d_no,
				columnDtl_schd_qty
			};
		}
		// 出荷予定単位に予実比をチェック
		return new MCColumnConfig[]{
			columnDtl_ship_schd_no,
			columnDtl_schd_qty
		};
	}

	/**
	 * 入力値チェックマスタによる入力値チェックを行う
	 */
	protected MCMessageList inptChk() {

		MCMessageList msgL = new MCMessageList();
		if (getHdrR().uplnd_flg()) {
			// 計画外は入力値チェックの対象外
			return msgL;
		}

		MCList<DtlR> chkTargetForShipL = makeInptChkTargetListForShip();
		MCList<DtlR> chkTargetForXferL = makeInptChkTargetListForXfer();
		
		MCColumnConfig[] cols = getShipTgtCols();
		
		if (!chkTargetForShipL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.SHIP.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_ship_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty, 
					columnDtl_ship_qty, cols[1], chkTargetForShipL, columnDtl_trd_unit_qty, cols[0]));
					
		}
		
		if (!chkTargetForXferL.isEmpty()) {
			msgL.addAll(
				doInptChk(
					MAC_FUNC_TYP.XFER.value(),
					columnDtl_itm_cd, columnDtl_itm_sub1, columnDtl_itm_sub2, columnDtl_itm_sub3,
					columnDtl_ship_act_d_no, columnDtl_base_unit_qty_bef, columnDtl_base_unit_qty, 
					columnDtl_ship_qty, cols[1], chkTargetForXferL, columnDtl_trd_unit_qty, cols[0]));
		}
		
		return msgL;
	}
	
	protected String[] getGrpColums() {
		String targetKeyNo = getShipTgtKey();
		return new String[] {
				targetKeyNo, DtlR.$itm_cd, DtlR.$itm_sub1, DtlR.$itm_sub2, DtlR.$itm_sub3, DtlR.$trd_ptn_typ
		};
	}
	
	protected MCGroupByPolicy getInptChkGrpPolicy() {
		return new MCGroupByPolicy(getGrpColums());
	}
	
	protected MCList<DtlR> makeInptChkTargetListForShip() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCList<DtlR> tergetDtlL = getDtlL().subList(r -> !r.isStatusDelete());
		MCList<DtlR> schdGroupL = tergetDtlL.groupBy(grpKey);
		
		String targetNoString = getShipTgtKey();
		
		for (DtlR schdGroupR : schdGroupL) {
			
			if (isNull(schdGroupR.itm_cd())) {
				continue;
			}
			
			if (isSlsOrShip(schdGroupR.trd_ptn_typ())) {
				chkTargetL.addAll(tergetDtlL.subList(targetNoString, schdGroupR.getString(targetNoString)));
			}
		}
		
		return chkTargetL;
	}
	
	protected MCList<DtlR> makeInptChkTargetListForXfer() {
		MCList<DtlR> chkTargetL = MCList.create(DtlR.class);
		
		MCGroupByPolicy grpKey = getInptChkGrpPolicy();
		
		MCList<DtlR> tergetDtlL = getDtlL().subList(r -> !r.isStatusDelete());
		MCList<DtlR> schdGroupL = tergetDtlL.groupBy(grpKey);
		
		String targetNoString = getShipTgtKey();
		
		for (DtlR schdGroupR : schdGroupL) {
			
			if (isNull(schdGroupR.itm_cd())) {
				continue;
			}
			
			if (!isSlsOrShip(schdGroupR.trd_ptn_typ())) {
				chkTargetL.addAll(tergetDtlL.subList(targetNoString, schdGroupR.getString(targetNoString)));
			}
		}
		
		return chkTargetL;
	}


// リスナ、フォーカス
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		setFocus();
	}

	/**
	 * フォーカスを設定する
	 */
	protected void setFocus() {
		String st = getStatus();
		if (isSRCHStatus(st) ||
			 isFIX_IStatus(st) || isFIX_UStatus(st) || isFIX_DStatus(st)) {
			CndPanel.focusFirstComponent();
		}
		else if (isINSStatus(st) || isUPDStatus(st)) {
			HdrPanel.focusFirstComponent();
		}
		else {
			DtlTable.selectLeftmostColumn(0);
		}
	}


// イベント
	@Override
	protected void valueInit() {
		super.valueInit();
		valueInitSub();
		mcInitStatus();
	}
	protected void valueInitSub() {
		setValueEx(Cnd_ope_Group, Cnd_ope_INS.getActionCommand());
		setSrchTgtTyp();
		setUplndFlg(true);
		setInitHdrR();
	}

	protected void setSrchTgtTyp() {
		if (Cnd_ope_INS.isSelected()) {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO.name());
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO.name());
		}
	}

	protected void setInitHdrR() {
		MCDate today = getToday();
		HdrR hdrR = getHdrR();
		// 更新フラグを立てたくないのでsetValueExは使用しない
		hdrR.ac_dt(today);
		if (isNull(hdrR.ship_schd_dt())) {
			hdrR.ship_dt(today);
			hdrR.dlv_dt(today);
		}
		else {
			hdrR.ship_dt(hdrR.ship_schd_dt());
			hdrR.ship_hm(hdrR.ship_schd_hm());
			hdrR.dlv_dt(hdrR.dlv_schd_dt());
			hdrR.dlv_hm(hdrR.dlv_schd_hm());
		}
		hdrR.dlv_pri_prnt_flg(false);
		Hdr_can_ac_dt_for_input.clear();
		Hdr_can_ac_dt.clear();
		Hdr_ac_dt_after_srch.clear();

		setDefPrntFlg();
		_assortChkr.init();

		String defLgGrpCd = getSysParm("DEF_LG_GRP_CD");
		if (!isNull(defLgGrpCd)) {
			hdrR.ship_fr_lg_grp_cd(defLgGrpCd);
		}
	}

	@Override
	protected void listenerInit() {
		super.listenerInit();

		Hdr_ship_to_zip_cd.addNCListener(this);
		Hdr_ship_to_addr1.addNCListener(this);
		Hdr_ship_to_addr2.addNCListener(this);
		Hdr_ship_to_addr3.addNCListener(this);
		Hdr_ship_to_addr4.addNCListener(this);
		Hdr_ship_to_cntct_dpt.addNCListener(this);
		Hdr_ship_to_cntct_psn.addNCListener(this);
		Hdr_ship_to_tel.addNCListener(this);
		Hdr_ship_to_fax.addNCListener(this);
		Hdr_dlv_zip_cd.addNCListener(this);
		Hdr_dlv_addr1.addNCListener(this);
		Hdr_dlv_addr2.addNCListener(this);
		Hdr_dlv_addr3.addNCListener(this);
		Hdr_dlv_addr4.addNCListener(this);
		Hdr_dlv_cntct_dpt.addNCListener(this);
		Hdr_dlv_cntct_psn.addNCListener(this);
		Hdr_dlv_tel.addNCListener(this);
		Hdr_dlv_fax.addNCListener(this);
		Hdr_ship_dt.addLCListener(this);
		Hdr_rqst_usr_cd.addLCListener(this);

		Dtl_itm_p_PPanel.addItmLCListner(this);
		columnDtl_ship_loc_cd.addLCListener(this);
		columnDtl_lot_no.addLCListener(this);
		columnDtl_sublot_no.addLCListener(this);
		columnDtl_trd_unit_qty.addNCListener(this);
		columnDtl_sno1.addLCListener(this);
		columnDtl_sno2.addLCListener(this);
		columnDtl_sno3.addLCListener(this);
		columnDtl_sno4.addLCListener(this);
		columnDtl_sno1.addVCListener(this);
		columnDtl_sno2.addVCListener(this);
		columnDtl_sno3.addVCListener(this);
		columnDtl_sno4.addVCListener(this);
		columnDtl_stk_bp_cd.addLCListener(this);
	
		getDtl_bd_dpt_cd_ListPutter().putBind(DptCols.$i_dt, Hdr_ac_dt);
	}

	@Override
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == Hdr_ship_to_id_nm
			|| nc == Hdr_ship_to_zip_cd
			|| nc == Hdr_ship_to_addr1
			|| nc == Hdr_ship_to_addr2
			|| nc == Hdr_ship_to_addr3
			|| nc == Hdr_ship_to_addr4
			|| nc == Hdr_ship_to_cntct_dpt
			|| nc == Hdr_ship_to_cntct_psn
			|| nc == Hdr_ship_to_tel
			|| nc == Hdr_ship_to_fax) {
			doHdr_ship_to_vals_NC(info);
		}
		if (nc == Hdr_dlv_zip_cd
			|| nc == Hdr_dlv_addr1
			|| nc == Hdr_dlv_addr2
			|| nc == Hdr_dlv_addr3
			|| nc == Hdr_dlv_addr4
			|| nc == Hdr_dlv_cntct_dpt
			|| nc == Hdr_dlv_cntct_psn
			|| nc == Hdr_dlv_tel
			|| nc == Hdr_dlv_fax) {
			doHdr_dlv_vals_NC(info);
		}
		if (nc == columnDtl_trd_unit_qty) {
			doDtl_trd_unit_qty_NC(info);
		}
	}

	@Override
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_ship_dt) {
			doHdr_ship_dt_LC(info);
		}
		if (lc == Hdr_trd_ptn_typ
			|| lc == Hdr_ship_to_id_typ
			|| lc == Hdr_ship_to_id_cd
			|| lc == Hdr_dlv_id_typ
			|| lc == Hdr_dlv_id_cd
			|| lc == Hdr_rqst_usr_cd) {
			setUplndMode();
		}
		if (lc == columnDtl_ship_loc_cd) {
			doDtl_ship_loc_cd_LC(info);
		}
		if (Dtl_itm_p_PPanel.isItm(lc)) {
			doDtl_itm_cd_LC(info);
		}
		if (lc == columnDtl_itm_cd
			|| lc == columnDtl_itm_sub1
			|| lc == columnDtl_itm_sub2
			|| lc == columnDtl_itm_sub3
			|| lc == columnDtl_itm_nm
			|| lc == columnDtl_sno1
			|| lc == columnDtl_sno2
			|| lc == columnDtl_sno3
			|| lc == columnDtl_sno4
			|| lc == columnDtl_lot_no
			|| lc == columnDtl_sublot_no
			|| lc == columnDtl_trd_unit_cd
			|| lc == columnDtl_rsn_cd
			|| lc == columnDtl_bd_dpt_cd
			|| lc == columnDtl_cst_po_no
			|| lc == columnDtl_cst_po_d_no
			|| lc == columnDtl_cst_itm_cd
			|| lc == columnDtl_cst_itm_nm
			|| lc == columnDtl_gd_cd
			|| lc == columnDtl_quality_typ
			|| lc == columnDtl_stk_id_typ
			|| lc == columnDtl_stk_bp_cd
			|| lc == columnDtl_stk_arrv_bp_cd
			|| lc == columnDtl_arr_cnt_rmrks) {
			syncArrCntRmrks(lc, info);
		}
	}
	
	@Override
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (vc == columnDtl_sno1) {
			return doDtl_sno1_VC(info);
		}
		if (vc == columnDtl_sno2) {
			return doDtl_sno2_VC(info);
		}
		if (vc == columnDtl_sno3) {
			return doDtl_sno3_VC(info);
		}
		if (vc == columnDtl_sno4) {
			return doDtl_sno4_VC(info);
		}
		return super.doVCEvent(vc, info);
	}
	
	protected boolean doDtl_sno1_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.schd_sno1())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno1())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	
	protected boolean doDtl_sno2_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.schd_sno2())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno2())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	
	protected boolean doDtl_sno3_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.schd_sno3())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno3())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}
	
	protected boolean doDtl_sno4_VC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());

		if(!isSame(info.getNewValue(), r.schd_sno4())
				&& !isNull(info.getNewValue())
				&& !isNull(r.schd_sno4())
				&& !isSame(info.getNewValue(), MAC_STR.NULL_VAL.value())) {
			return false;
		}
		return true;
	}

	@Override
	public void doCnd_ship_act_rev_NC(MCEventInfo info){
		setValueEx(Cnd_latest_flg, isNull(getCndR().ship_act_rev()));
	}

	@Override
	public void doCnd_latest_flg_NC(MCEventInfo info){
		CndR cndR = getCndR();
		if (cndR.latest_flg()) {
			setValueEx(Cnd_ship_act_rev, null);
		}
	}

	@Override
	public boolean doHdr_trd_cd_VC(MCEventInfo info) {
		if (isChanged(DtlTable) && !confirmRegDataClear()) {
			return false;
		}
		return super.doHdr_trd_cd_VC(info);
	}

	@Override
	public void doHdr_trd_cd_LC(MCEventInfo info) {
		super.doHdr_trd_cd_LC(info);
		getDtlL().clear();
		DtlTable.fillSpace();
	}

	@Override
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		if (!isSlsOrShip(hdrR.trd_ptn_typ())) {
			setValueEx(Hdr_rqst_usr_cd, null);
			setValueEx(Hdr_rqst_dpt_cd, null);
		}

		// 変更の前後で売上・出荷⇔移送・支給と変更があった場合、識別区分をクリアする
		String oldTrdPtnTyp = (String) info.getOldValue();	// 変更前の取引パタン
		if (isSlsOrShip(hdrR.trd_ptn_typ()) != isSlsOrShip(oldTrdPtnTyp)) {
			setValueEx(Hdr_ship_to_id_typ, null);
			setValueEx(Hdr_dlv_id_typ, null);
			setValueEx(Hdr_rqst_dpt_cd, null);
		}
		else if (isXfrOrProv(hdrR.trd_ptn_typ())) {
			setValueEx(Hdr_ship_to_id_cd, null);
			setValueEx(Hdr_dlv_id_cd, null);
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(hdrR.trd_ptn_typ())) {
			setValueEx(Hdr_dlv_pri_prnt_flg, false);
		}

		// ヘッダ情報を明細に設定
		setHdrInfToDtl();
	}

	@Override
	public void doHdr_ship_to_id_typ_LC(MCEventInfo info) {
		setValueEx(Hdr_ship_to_id_cd, null);
		setViaDlvTypMode();
	}
	/**
	 * 配送先経由区分のモードを設定する。
	 */
	protected void setViaDlvTypMode() {
		if (isEditableViaDlvTyp()
				&& (super.isINSStatus(getStatus()) || (super.isUPDStatus(getStatus()) && canUpd()))) {
			Hdr_via_dlv_typ.setMode(MCMode.REQUIRED);
		}
		else {
			setDefaultMode(Hdr_via_dlv_typ);
		}
	}
	
	/**
	 * 配送先経由区分を設定する。
	 */
	protected void setViaDlvTyp() {
		
		if (!isNull(getHdrR().ship_to_id_cd())) {
			if (!isEditableViaDlvTyp()) {
				setValueEx(Hdr_via_dlv_typ, MAC_VIA_DLV_TYP.NOT_VIA.value());
			}
		}
		else {
			setValueEx(Hdr_dlv_id_typ, null);
		}
	}
	
	/**
	 * 配送先経由区分が入力可能か判定する。
	 * @return 入荷可能の場合はtrue
	 */
	protected boolean isEditableViaDlvTyp() {
		return getHdrR().uplnd_flg()
				&& isSlsOrShip(getHdrR().trd_ptn_typ())
				&& getHdrR().cst_iv_flg()
				&& MSC_SHIP_TO_ID_TYP.isTDLV(getHdrR().ship_to_id_typ());
	}
	
	/**
	 * インボイス表記名のモードを設定する。
	 */
	protected void setIvItmNmMode() {
		if (isUplnd()) {
			if (!getHdrR().cst_iv_flg()) {
				columnDtl_iv_itm_nm.setMode(MCMode.INVISIBLE);
			}
			else {
				setDefaultMode(columnDtl_iv_itm_nm);
			}
		}
	}

	@Override
	public boolean doHdr_ship_to_id_cd_VC(MCEventInfo info) {
		setValueEx(Hdr_dlv_id_typ, null);

		return super.doHdr_ship_to_id_cd_VC(info);
	}

	@Override
	public void doHdr_ship_to_id_cd_LC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		if (!isNull(hdrR.ship_to_id_cd())) {
			if (!MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
				if (isSlsOrShip(hdrR.trd_ptn_typ())) {
					setValueEx(Hdr_dlv_id_typ, MSC_SHIP_TO_ID_TYP.DLV.value());
				}
				else {
					setValueEx(Hdr_dlv_id_typ, MSC_SHIP_TO_ID_TYP.LOC.value());
				}
				setValueEx(Hdr_dlv_id_cd, hdrR.ship_to_id_cd());
			}
		}
		else {
			setValueEx(Hdr_dlv_id_typ, null);
		}
		setViaDlvTyp();
	}

	@Override
	public void doHdr_dlv_id_typ_LC(MCEventInfo info) {
		setValueEx(Hdr_dlv_id_cd, null);
		setValueEx(Hdr_cst_cd, null);
	}

	@Override
	public void doHdr_dlv_id_cd_LC(MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ())) {
			setValueEx(Hdr_dlv_pri_prnt_flg, true);
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			setValueEx(Hdr_dlv_pri_prnt_flg, false);
		}
		if (isSlsOrShip(getHdrR().trd_ptn_typ())) {
			// 納品先のリストロジック経由でデフォルトの得意先を表示
			setValueEx(Hdr_dlv_cd, getHdrR().dlv_id_cd());
		}
		// 納品先棚・ラインのために納品先識別を再設定
		for (DtlR r : getDtlL()) {
			if (isValidDtlR(r)) {
				if (MSC_DLV_ID_TYP.isLOC(getHdrR().dlv_id_typ())) {
					setValueEx(columnDtl_dlv_id_typ, r.getGUIIndex(), getHdrR().dlv_id_typ());
					setValueEx(columnDtl_dlv_id_cd, r.getGUIIndex(), getHdrR().dlv_id_cd());
				}
				else {
					setValueEx(columnDtl_dlv_id_typ, r.getGUIIndex(), null);
					setValueEx(columnDtl_dlv_id_cd, r.getGUIIndex(), null);
				}
				setIvItmNm(r);
			}
		}
	}

	public void doHdr_ship_to_vals_NC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		if (!MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
			if (hdrR.ship_to_sundry_flg()) {
				// 納品先と同期
				// 設定した先でイベントを発生させないため、モデルに設定する
				hdrR.dlv_id_nm(hdrR.ship_to_id_nm());
				hdrR.dlv_zip_cd(hdrR.ship_to_zip_cd());
				hdrR.dlv_addr1(hdrR.ship_to_addr1());
				hdrR.dlv_addr2(hdrR.ship_to_addr2());
				hdrR.dlv_addr3(hdrR.ship_to_addr3());
				hdrR.dlv_addr4(hdrR.ship_to_addr4());
				hdrR.dlv_cntct_dpt(hdrR.ship_to_cntct_dpt());
				hdrR.dlv_cntct_psn(hdrR.ship_to_cntct_psn());
				hdrR.dlv_tel(hdrR.ship_to_tel());
				hdrR.dlv_fax(hdrR.ship_to_fax());
			}
		}
	}
	public void doHdr_dlv_vals_NC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		if (!MSC_SHIP_TO_ID_TYP.isTDLV(hdrR.ship_to_id_typ())) {
			if (hdrR.ship_to_sundry_flg()) {
				// 送付先と同期
				// 設定した先でイベントを発生させないため、モデルに設定する
				//setValueEx(Hdr_ship_to_id_nm, hdrR.dlv_id_nm());	名称は送付先で変更する
				hdrR.ship_to_zip_cd(hdrR.dlv_zip_cd());
				hdrR.ship_to_addr1(hdrR.dlv_addr1());
				hdrR.ship_to_addr2(hdrR.dlv_addr2());
				hdrR.ship_to_addr3(hdrR.dlv_addr3());
				hdrR.ship_to_addr4(hdrR.dlv_addr4());
				hdrR.ship_to_cntct_dpt(hdrR.dlv_cntct_dpt());
				hdrR.ship_to_cntct_psn(hdrR.dlv_cntct_psn());
				hdrR.ship_to_tel(hdrR.dlv_tel());
				hdrR.ship_to_fax(hdrR.dlv_fax());
			}
		}
	}

	@Override
	public void doHdr_dlv_sppl_cd_LC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		if (MAC_TRD_PTN_TYP.isPROV(hdrR.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isPROV_RTN(hdrR.trd_ptn_typ())) {
			// 支給、支給返品の場合、出荷場所の発注先によって選択できる在庫識別区分が異なる
			for (DtlR r : getDtlL()) {
				if (!isNull(r.stk_id_typ())) {
					setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), null);
				}
			}
		}
	}

	@Override
	public void doHdr_cst_cd_LC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		// 売上部門の設定
		if (!isNull(getHdrR().cst_usr_cd())) {
			setValueEx(Hdr_rqst_usr_cd, getHdrR().cst_usr_cd());
		}
		else if (!isNull(getHdrR().cst_dpt_cd())) {
			setValueEx(Hdr_rqst_dpt_cd, getHdrR().cst_dpt_cd());
		}
		// 預り出荷に対して得意先を再設定
		for (DtlR r : getDtlL()) {
			if (isValidDtlR(r)) {
				if (r.cststk_flg()) {
					setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), hdrR.cst_cd());
				}
				setIvItmNm(r);
			}
		}
		setCstItm();
		setViaDlvTyp();
		setViaDlvTypMode();
		setIvItmNmMode();
	}

	@Override
	public void doHdr_ship_fr_lg_grp_cd_LC(MCEventInfo info) {
		HdrR hdrR = getHdrR();
		// 場所をクリア＆出荷物流Ｇの再設定
		for (DtlR r : getDtlL()) {
			if (isValidDtlR(r)) {
				setValueEx(columnDtl_ship_fr_lg_grp_cd, r.getGUIIndex(), hdrR.ship_fr_lg_grp_cd());
				setValueEx(columnDtl_ship_loc_cd, r.getGUIIndex(), null);
			}
		}
	}

	public void doHdr_ship_dt_LC(mcframe.clientCore.event.MCEventInfo info) {
		setCstItm();
	}
	@Override
	public void doDtl_NC(MCEventInfo info) {
		super.doDtl_NC(info);
		setBtnMode();
	}

	public void doDtl_itm_cd_LC(MCEventInfo info) {
	
		DtlR r = getDtlL().get(info.getEventIndex());

		// ヘッダ情報を明細に設定
		setHdrInfToDtl(getHdrR(), r);

		setDefaultGdCd(r);
		setCstItm(r);
		if (Dtl_itm_p_PPanel.isItmFix(info.getEventIndex())) {
			setIvItmNm(r);
		}
	}

	@Override
	public void doDtl_loan_flg_NC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.loan_flg()) {	// 貸出出荷
			r.cststk_flg(false);	// イベントは発生させない
			setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), MSC_STK_ID_TYP.COSTK.value());
			setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), null);
		}
		else {
			setValueEx(columnDtl_cststk_flg, r.getGUIIndex(), true);
		}
	}

	@Override
	public void doDtl_cststk_flg_NC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		if (r.cststk_flg()) {	// 預り出荷
			r.loan_flg(false);	// イベントは発生させない
			setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), MSC_STK_ID_TYP.CSTSTK.value());
			setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), getHdrR().cst_cd());
		}
		else {
			setValueEx(columnDtl_loan_flg, r.getGUIIndex(), true);
		}
	}

	@Override
	public void doDtl_abort_flg_NC(mcframe.clientCore.event.MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		// 打切、打切解除は指図明細または出荷予定の単位で行う
		String key = getShipTgtKey();
		getDtlL().subList(key,
			r.getString(key)).setBoolean(DtlR.$abort_flg, r.abort_flg());
	}

	@Override
	public void doDtl_ship_loc_cd_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		String trdPtnTyp = nvl(getHdrR().trd_ptn_typ(), r.trd_ptn_typ());
		if (MAC_TRD_PTN_TYP.isPROV(trdPtnTyp) && isUplnd()
			|| MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp)) {
			// 支給、支給返品の場合、出荷場所の発注先によって選択できる在庫識別区分が異なる
			setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), null);
		}
		setStkArrvBpInf(r, true);
	}

	@Override
	public void doDtl_stk_id_typ_LC(MCEventInfo info) {
		DtlR r = getDtlL().get(info.getEventIndex());
		setStkArrvBpInf(r, true);

		int idx = r.getGUIIndex();
		if(isNull(r.ship_loc_sppl_cd())) {
			setValueEx(columnDtl_stk_arrv_bp_cd, idx, MAC_STR.NULL_VAL.value());
		}
		else {
			if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				setValueEx(columnDtl_stk_arrv_bp_cd, idx, null);
			}
			else {
				setValueEx(columnDtl_stk_arrv_bp_cd, idx, r.ship_loc_sppl_cd());
			}
		}
		if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
			setValueEx(columnDtl_stk_bp_cd, idx, getHdrR().cst_cd());
		}
		else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
			setValueEx(columnDtl_stk_bp_cd, idx, r.ship_loc_sppl_cd());
		}
	}

	@Override
	public void doDtl_rsn_cd_LC(MCEventInfo info) {
		super.doDtl_rsn_cd_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!r.acxfr_gi_flg() && !r.sls_acxfr_flg()) {
			setValueEx(columnDtl_bd_dpt_cd, r.getGUIIndex(), null);
		}
	}

	@Override
	public void doDtl_dlv_id_cd_LC(MCEventInfo info) {
		super.doDtl_dlv_id_cd_LC(info);
		DtlR r = getDtlL().get(info.getEventIndex());
		if (!isNull(r.dlv_id_cd()) && MSC_DLV_ID_TYP.isLOC(r.dlv_id_typ())) {
			setDefStrLnCd(r);
		}
	}

	/**
	 * 入荷連絡備考を設定する単位
	 * (入荷進捗・入荷予定を作成する単位と同じ)
	 */
	protected String[] _$arrSchdKey = {
		// 入荷進捗の粒度
		DtlR.$itm_cd,
		DtlR.$itm_sub1,
		DtlR.$itm_sub2,
		DtlR.$itm_sub3,
		DtlR.$itm_nm,
		DtlR.$sundry_itm_flg,
		DtlR.$sno1,
		DtlR.$sno2,
		DtlR.$sno3,
		DtlR.$sno4,
		DtlR.$lot_no,
		DtlR.$sublot_no,
		DtlR.$trd_unit_cd,
		DtlR.$base_unit_cd,
		DtlR.$rsn_cd,
		DtlR.$bd_dpt_cd,
		DtlR.$cst_po_no,
		DtlR.$cst_po_d_no,
		DtlR.$cst_itm_cd,
		DtlR.$cst_itm_nm,
		// 入荷予定の粒度
		DtlR.$ver_no,
		DtlR.$gd_cd,
		DtlR.$quality_typ,
		DtlR.$stk_id_typ,
		DtlR.$stk_bp_cd,
		DtlR.$stk_arrv_bp_cd,
		DtlR.$dlv_id_typ,
		DtlR.$dlv_id_cd,
		DtlR.$dlv_str_ln_cd
	};
	protected void syncArrCntRmrks(MCLCBeans lc, MCEventInfo info) {
		// 出荷後に作成する入荷予定と同一明細は同じ備考を設定する
		DtlR r = getDtlL().get(info.getEventIndex());
		MCList<DtlR> dtlL = getDtlL().subList(_$arrSchdKey, r.toArray(_$arrSchdKey));
		for (DtlR tmpR : dtlL) {
			if (tmpR.getGUIIndex() != r.getGUIIndex()) {
				if (lc == columnDtl_arr_cnt_rmrks) {
					setValueEx(columnDtl_arr_cnt_rmrks, tmpR.getGUIIndex(), r.arr_cnt_rmrks());
				}
				else {
					setValueEx(columnDtl_arr_cnt_rmrks, r.getGUIIndex(), tmpR.arr_cnt_rmrks());
					break;
				}
			}
		}
	}

	protected void doDtl_trd_unit_qty_NC(MCEventInfo info) {
		setWtDim(info);
	}

	protected void setWtDim(MCEventInfo info) {
		int idx = info.getEventIndex();
		DtlR dtlR = getDtlL().get(idx);

		if (!isNull(dtlR.unit_wt())) {
			dtlR.ship_wt(dtlR.unit_wt().multiply(dtlR.trd_unit_qty()));
		}
		if (!isNull(dtlR.unit_dim())) {
			dtlR.ship_dim(dtlR.unit_dim().multiply(dtlR.trd_unit_qty()));
		}

		sumWt();
		sumDim();
	}

	protected void sumWt() {
		MCNumber shipWt = null;

		for (DtlR dtlR : getDtlL().subList(r -> !r.isStatusDelete())) {
			if (!isNull(dtlR.ship_wt())) {
				shipWt = nvl(shipWt, MCNumber.ZERO).add(dtlR.ship_wt());
			}
		}

		setValueEx(Hdr_ship_wt, shipWt);
	}

	protected void sumDim() {
		MCNumber shipDim = null;

		for (DtlR dtlR : getDtlL().subList(r -> !r.isStatusDelete())) {
			if (!isNull(dtlR.ship_dim())) {
				shipDim = nvl(shipDim, MCNumber.ZERO).add(dtlR.ship_dim());
			}
		}

		setValueEx(Hdr_ship_dim, shipDim);
	}

	/**
	 * 在庫着荷先の設定に必要な情報を設定する
	 */
	protected void setStkArrvBpInf(DtlR r, boolean isClear) {
		if (!isUplnd())	return;

		r.loc_cd(null);
		r.sppl_cd(null);
		if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
			if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
				r.loc_cd(r.ship_loc_cd());
				r.sppl_cd(r.ship_loc_sppl_cd());
			}
		}
		else {
			if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
				|| MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				r.loc_cd(getHdrR().dlv_id_cd());
				r.sppl_cd(getHdrR().dlv_sppl_cd());
			}
		}
		if (isClear) {
			if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
				setValueEx(columnDtl_stk_arrv_bp_cd, r.getGUIIndex(), null);
				setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), getHdrR().cst_cd());
			}
			else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				setValueEx(columnDtl_stk_arrv_bp_cd, r.getGUIIndex(), r.ship_loc_sppl_cd());
				setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), r.ship_loc_sppl_cd());
			}
			else {
				setValueEx(columnDtl_stk_arrv_bp_cd, r.getGUIIndex(), null);
				setValueEx(columnDtl_stk_bp_cd, r.getGUIIndex(), null);
			}
		}
	}

	/**
	 * 有効な明細行に対してヘッダの情報を反映する
	 */
	protected void setHdrInfToDtl() {
		HdrR hdrR = getHdrR();
		getDtlL()
			.subList(r -> isValidDtlR(r))
			.forEach(r -> setHdrInfToDtl(hdrR, r));
	}

	/**
	 * 有効な明細行に対してヘッダの情報を反映する
	 */
	protected void setHdrInfToDtl(HdrR hdrR, DtlR r) {
		if (Dtl_itm_p_PPanel.isItmFix(r.getGUIIndex())) {
			setValueEx(columnDtl_trd_cd, r.getGUIIndex(), hdrR.trd_cd());
			setValueEx(columnDtl_ship_fr_lg_grp_cd, r.getGUIIndex(), hdrR.ship_fr_lg_grp_cd());
			setValueEx(columnDtl_dlv_id_typ, r.getGUIIndex(), getHdrR().dlv_id_typ());
			setValueEx(columnDtl_dlv_id_cd, r.getGUIIndex(), getHdrR().dlv_id_cd());
			setValueEx(columnDtl_ship_act_no, r.getGUIIndex(), hdrR.ship_act_no());
		}
		else {
			setValueEx(columnDtl_trd_cd, r.getGUIIndex(), null);
			setValueEx(columnDtl_ship_fr_lg_grp_cd, r.getGUIIndex(), null);
			setValueEx(columnDtl_dlv_id_typ, r.getGUIIndex(), null);
			setValueEx(columnDtl_dlv_id_cd, r.getGUIIndex(), null);
			setValueEx(columnDtl_ship_act_no, r.getGUIIndex(), null);
		}

		// ヘッダ項目設定と併せて初期値を設定する
		setValueEx(columnDtl_ship_loc_cd, r.getGUIIndex(), null);
		setValueEx(columnDtl_quality_typ, r.getGUIIndex(), null);
		setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), null);
		r.loan_flg(false);		// イベント不要
		r.cststk_flg(false);	// イベント不要
		setValueEx(columnDtl_rsn_cd, r.getGUIIndex(), null);
		setValueEx(columnDtl_bd_dpt_cd, r.getGUIIndex(), null);

		if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())
			&& !MAC_SHIP_INST_TYP.isPICK(r.ship_inst_typ())) {
			setValueEx(columnDtl_ship_loc_cd, r.getGUIIndex(), null);
			setValueEx(columnDtl_ship_str_ln_cd, r.getGUIIndex(), null);
		}
		if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
			setValueEx(columnDtl_gd_cd, r.getGUIIndex(), null);
		}
		if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
			setValueEx(columnDtl_quality_typ, r.getGUIIndex(), MAC_QUALITY_TYP.GOOD.value());
		}
		if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
			setValueEx(columnDtl_stk_id_typ, r.getGUIIndex(), MSC_STK_ID_TYP.COSTK.value());
		}
		if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
			setValueEx(columnDtl_loan_flg, r.getGUIIndex(), true);
		}

		MCNumber qty = null;
		if (r.dscnt_itm_flg() && !isNull(r.trd_unit_cd())) {
			qty = MCNumber.ONE;
		}
		setValueEx(columnDtl_trd_unit_qty, r.getGUIIndex(), qty);
	}

	/**
	 * ヘッダの納品先を明細に設定する
	 */
	protected void setDlvInf(MCList<DtlR> dtlL) {
		HdrR hdrR = getHdrR();
		if (hdrR.uplnd_flg()) {
			dtlL.forEach(r -> {
				r.dlv_id_typ(hdrR.dlv_id_typ());
				r.dlv_id_typ_nm(hdrR.dlv_id_typ_nm());
				r.dlv_id_cd(hdrR.dlv_id_cd());
				r.dlv_id_nm(hdrR.dlv_id_nm());
				r.dlv_str_ln_tgt_flg(hdrR.dlv_str_ln_tgt_flg());
				r.dlv_zip_cd(hdrR. dlv_zip_cd());
				r.dlv_addr1(hdrR.dlv_addr1());
				r.dlv_addr2(hdrR.dlv_addr2());
				r.dlv_addr3(hdrR.dlv_addr3());
				r.dlv_addr4(hdrR.dlv_addr4());
				r.dlv_cntct_dpt(hdrR.dlv_cntct_dpt());
				r.dlv_cntct_psn(hdrR.dlv_cntct_psn());
				r.dlv_tel(hdrR.dlv_tel());
				r.dlv_fax(hdrR.dlv_fax());
				r.dlv_sundry_flg(hdrR.dlv_sundry_flg());
				r.pri_prnt_flg(hdrR.dlv_pri_prnt_flg());
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					r.loc_cd(hdrR.dlv_id_cd());
					r.sppl_cd(hdrR.dlv_sppl_cd());
				}
			});
		}
	}

	/**
	 * 明細の納品先をヘッダに設定する
	 */
	protected void setDlvInfToHdr() {
		if (getDtlL().isEmpty())	return;

		HdrR hdrR = getHdrR();
		DtlR dtlR = getDtlL().get(0);
		hdrR.dlv_id_typ(dtlR.dlv_id_typ());
		hdrR.dlv_id_typ_nm(dtlR.dlv_id_typ_nm());
		hdrR.dlv_id_cd(dtlR.dlv_id_cd());
		hdrR.dlv_id_nm(dtlR.dlv_id_nm());
		hdrR.dlv_cntry_cd(dtlR.dlv_cntry_cd());
		hdrR.dlv_cntry_nm(dtlR.dlv_cntry_nm());
		hdrR.dlv_str_ln_tgt_flg(dtlR.dlv_str_ln_tgt_flg());
		hdrR.dlv_zip_cd(dtlR. dlv_zip_cd());
		hdrR.dlv_addr1(dtlR.dlv_addr1());
		hdrR.dlv_addr2(dtlR.dlv_addr2());
		hdrR.dlv_addr3(dtlR.dlv_addr3());
		hdrR.dlv_addr4(dtlR.dlv_addr4());
		hdrR.dlv_cntct_dpt(dtlR.dlv_cntct_dpt());
		hdrR.dlv_cntct_psn(dtlR.dlv_cntct_psn());
		hdrR.dlv_tel(dtlR.dlv_tel());
		hdrR.dlv_fax(dtlR.dlv_fax());
		hdrR.dlv_sundry_flg(dtlR.dlv_sundry_flg());
		hdrR.dlv_sppl_cd(dtlR.dlv_sppl_cd());
		hdrR.dlv_pri_prnt_flg(dtlR.pri_prnt_flg());
		hdrR.cst_cd(dtlR.cst_cd());
		hdrR.cst_nm(dtlR.cst_nm());
	}
	
	/**
	 * 格付の初期値を設定する。
	 * @param index インデックス
	 */
	protected void setDefaultGdCd(DtlR dtlR) {

		if (MAC_STK_MNG_TYP.isMNG(dtlR.stk_mng_typ())) {
			columnDtl_gd_cd.setValue(dtlR.getGUIIndex(), getDefaultFeedStkGd().gd_cd());
		}
		else {
			columnDtl_gd_cd.setValue(dtlR.getGUIIndex(), null);
		}
	}

	/**
	 * 得意先品目・品名を設定する。
	 */
	protected void setCstItm() {
		
		for (DtlR dtlR : exceptDeleteAndEmpty(getDtlL())) {
			if(!dtlR.abort_flg() && isNullAnd(dtlR.slo_no(), dtlR.xfr_schd_no())) {
				setCstItm(dtlR);
			}
		}
	}
	/**
	 * 得意先品目・品名を設定する。
	 * @param dtlR 受注明細
	 */
	protected void setCstItm(DtlR dtlR) {
		MCRow row = MAUCP_ItmUtil.getBpItm(getHdrR().cst_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), getHdrR().ship_dt(), this);
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
	 * インボイス表記品名を設定する。
	 * @param dtlR 出荷実績明細
	 */
	protected void setIvItmNm(DtlR dtlR) {
		
		if (!getHdrR().cst_iv_flg() || isNull(getHdrR().prnt_lcl_cd())){
			setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
		}
		else {
			MCRow row = MAUCP_ItmUtil.getItmLcl(getHdrR().prnt_lcl_cd(), dtlR.itm_cd(), dtlR.itm_sub1(), dtlR.itm_sub2(), dtlR.itm_sub3(), this);
			if (isNull(row)) {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), null);
			} else {
				setValueEx(columnDtl_iv_itm_nm, dtlR.getGUIIndex(), nvl(row.getStringNE("itm_nm"), dtlR.itm_nm()));
			}
		}
	}

	/**
	 * 標準の棚・ラインCDを設定します。
	 */
	protected void setDefStrLnCd(DtlR dtlR) {
		if (isNull(dtlR.dlv_id_cd()) || !dtlR.dlv_str_ln_tgt_flg()) {
			return;
		}
		String StrLnCd = MSUCP_StrLnUtil.getDefStrLnCd(
				dtlR.itm_cd(),
				dtlR.itm_sub1(),
				dtlR.itm_sub2(),
				dtlR.itm_sub3(),
				dtlR.dlv_id_cd(),
				this);
		if (isNull(StrLnCd)) {
			setValueEx(columnDtl_dlv_str_ln_cd_none_flg, dtlR.getGUIIndex(), true);
		}
		else {
			setValueEx(columnDtl_dlv_str_ln_cd, dtlR.getGUIIndex(), StrLnCd);
		}
	}

// ListBox
	@Override
	protected void listInit() {
		super.listInit();
		getDtl_stk_id_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.StkIdTypCols.$i_gr_sppl_cd, Hdr_dlv_sppl_cd);
		getDtl_stk_id_typ_ListPutter().putBind(mcframe.commonMSUA.MSUAC0060.MSUAC_List.StkIdTypCols.$i_ship_flg, true);
		columnDtl_itm_cd.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub1.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub2.addIgnoreListBeans(columnDtl_cst_itm_cd);
		columnDtl_itm_sub3.addIgnoreListBeans(columnDtl_cst_itm_cd);
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
		msgList.addAll(checkReq(Hdr_ship_dt));
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
	public MCList<?> getDtl_cst_itm_cd(MCRow row, MCEventInfo info) {
		// リストロジックの参照項目を一時カラムとして追加する
		// (実装仕様書では別ブロックの項目を連携項目に出来ないため)
		row.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
		row.setDateNE(CstItmCols.$i_dt, getHdrR().ship_dt());
		if (isXfrOrProv(getHdrR().trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			row.addStringColumn(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
		}
		else {
			row.addStringColumn(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
		}
		return super.getDtl_cst_itm_cd(row, info);
	}
	
	
	@Override
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		if (Cnd_ope_INS.isSelected()) {
			addListLogicCnd(	row,
				new MSC_STK_SRCH_TGT_TYP[]{
					MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO,
					MSC_STK_SRCH_TGT_TYP.IV_NO
				}
			);
		}
		else if (Cnd_ope_UPD.isSelected()) {
			addListLogicCnd(	row,
				new MSC_STK_SRCH_TGT_TYP[]{
					MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO,
					MSC_STK_SRCH_TGT_TYP.DLV_SLIP_NO
				}
			);
		}
		else {
			addListLogicCnd(	row,
				new MSC_STK_SRCH_TGT_TYP[]{
					MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO
				}
			);
		}
		return super.getCnd_srch_tgt_typ_nm(row, info);
	}

	@Override
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		MCList<MCRow>
			 lst = super.getHdr_trd_cd(row, info),
			 retL = lst.createInstance();
		for (MCRow r : lst) {
			if (isSlsOrShip(r.getString("trd_ptn_typ"))
				|| isXfrOrProv(r.getString("trd_ptn_typ"))) {
				retL.add(r);
			}
		}
		return retL;
	}

	@Override
	public MCList getHdr_ship_to_id_typ(MCRow row, MCEventInfo info){
		if (isSlsOrShip(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(MSC_SHIP_TO_ID_TYP.DLV.key(), true);
			row.addBooleanColumn(MSC_SHIP_TO_ID_TYP.TDLV.key(), true);
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(MSC_SHIP_TO_ID_TYP.LOC.key(), true);
		}
		else if (isXfrOrProv(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(MSC_SHIP_TO_ID_TYP.LOC.key(), true);
			row.addBooleanColumn(MSC_SHIP_TO_ID_TYP.TDLV.key(), true);
		}
		return super.getHdr_ship_to_id_typ(row, info);
	}

	@Override
	public MCList getHdr_ship_to_id_cd(MCRow row, MCEventInfo info){
		if (MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(ShipToIdCols.$i_outside_flg, true);
		}
		else {
			row.addBooleanColumn(ShipToIdCols.$i_house_flg, true);
		}
		return super.getHdr_ship_to_id_cd(row, info);
	}
	
	@Override
	public MCList getHdr_dlv_id_typ(MCRow row, MCEventInfo info){
		if (isSlsOrShip(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(MSC_DLV_ID_TYP.DLV.key(), true);
		}
		else if (isXfrOrProv(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(MSC_DLV_ID_TYP.LOC.key(), true);
		}
		return super.getHdr_dlv_id_typ(row, info);
	}

	@Override
	public MCList getHdr_dlv_id_cd(MCRow row, MCEventInfo info){
		if (MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ())) {
			row.addBooleanColumn(DlvIdCols.$i_outside_flg, true);
		}
		else {
			row.addBooleanColumn(DlvIdCols.$i_house_flg, true);
		}
		return super.getHdr_dlv_id_cd(row, info);
	}

	@Override
	public MCList getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info) {
		if (isSlsOrShip(getHdrR().trd_ptn_typ())) {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.SLS.value());
		}
		else {
			row.addStringColumn(DptCols.$i_dpt_is_srch_typ, MAC_DPT_IS_SRCH_TYP.SCE.value());
		}
		return super.getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
	}

	@Override
	protected MCRow getBindRowForISCustom(MCRow bind, MCLinkBeans beans, int eventIndex) {
		boolean isProv = MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ());
		if (beans == Hdr_ship_to_id_cd) {
			bind.addBooleanColumn(ShipToIdCols.$i_house_flg, !isProv);
			bind.addBooleanColumn(ShipToIdCols.$i_outside_flg, isProv);
		}
		else if (beans == Hdr_dlv_id_cd) {
			bind.addBooleanColumn(DlvIdCols.$i_house_flg, !isProv);
			bind.addBooleanColumn(DlvIdCols.$i_outside_flg, isProv);
		}
		else if (beans == columnDtl_itm_cd) {
			if (isXfrOrProv(getHdrR().trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
				bind.addStringColumn(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
			}
			else {
				bind.addStringColumn(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
			}
		}
		else if (beans == columnDtl_cst_itm_cd) {
			bind.setStringNE(CstItmCols.$i_bp_cd, getHdrR().cst_cd());
			bind.setStringNE(CstItmCols.$i_bp_nm, getHdrR().cst_nm());
			bind.setDateNE(CstItmCols.$i_dt, getHdrR().ship_dt());
			if (isXfrOrProv(getHdrR().trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
				bind.addStringColumn(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
			}
			else {
				bind.addStringColumn(CstItmCols.$i_cst_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
			}
		}
		
		return super.getBindRowForISCustom(bind, beans, eventIndex);
	}

	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info) {
		setDtlItmBind(row);
		return super.getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
	}
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info) {
		setDtlItmBind(row);
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
	}
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info) {
		setDtlItmBind(row);
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
	}
	@Override
	public MCList<?> getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info) {
		setDtlItmBind(row);
		return super.getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
	}
	protected void setDtlItmBind(MCRow bind) {
		if (isXfrOrProv(getHdrR().trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isSHIP(getHdrR().trd_ptn_typ())) {
			bind.addStringColumn(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.STK1.value());
		}
		else {
			bind.addStringColumn(ItmCols.$i_itm_is_srch_typ, MAC_ITM_IS_SRCH_TYP.NOT_ASSET3.value());
		}
	}

	@Override
	public MCList getDtl_ship_loc_cd(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isPROV(getHdrR().trd_ptn_typ())) {
			// 外注・社内とも
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP.value());
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(getHdrR().trd_ptn_typ())) {
			// 外注場所のみ
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_OUTSIDE.value());
		}
		else {
			// 社内場所のみ
			row.addStringColumn(LocCols.$i_loc_is_srch_typ, MAC_LOC_IS_SRCH_TYP.LG_GRP_HOUSE.value());
		}
		row.addStringColumn(LocCols.$i_lg_grp_cd, getHdrR().ship_fr_lg_grp_cd());
		return super.getDtl_ship_loc_cd(row, info);
	}

	@Override
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info){
		DtlR r = getDtlL().get(info.getEventIndex());
		if (isSlsOrShip(r.trd_ptn_typ())) {
			row.addBooleanColumn(ShipBizRsnCols.$i_sls_flg, true);
		}
		else {
			row.addBooleanColumn(ShipBizRsnCols.$i_xfr_flg, true);
		}
		MCList<MCRow> lst = super.getDtl_rsn_cd(row, info);
		if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
			|| MAC_TRD_PTN_TYP.isXFR_RTN(r.trd_ptn_typ())) {
			// 支給、支給返品、移送返品は他勘定出庫を除外する
			MCList<MCRow> rmL = lst.subList(rr -> rr.getBooleanNE("acxfr_gi_flg"));
			if (!rmL.isEmpty()) {
				lst.removeAll(rmL);
			}
		}
		else if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
			// 出荷は販売他勘定を除外する
			MCList<MCRow> rmL = lst.subList(rr -> rr.getBooleanNE("sls_acxfr_flg"));
			if (!rmL.isEmpty()) {
				lst.removeAll(rmL);
			}
		}
		return lst;
	}

	@Override
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info) {
		if (MAC_TRD_PTN_TYP.isSLS(getHdrR().trd_ptn_typ())) {
			row.setBooleanNE(StkGdCols.$i_slo_flg, true);
		}
		return super.getDtl_gd_cd(row, info);
	}
	@Override
	protected void openISPanelSub(MCRootPanel inputSupportPanel, MCRow bind, MCListPutter putter, int idx) {
		
		if (Hdr_ship_to_id_cd == putter.getLinkBeans()) {		
			ISPanelLinker ret = getISPanelLinkerNE(putter.getLinkBeans());
			if (ret != null && ret.isEnable()) {
				HdrR hdr = getHdrR();
				bind.setStringNE("ship_to_id_nm", hdr.ship_to_id_nm());
				bind.setBooleanNE("ship_to_sundry_flg", hdr.ship_to_sundry_flg());
				bind.setStringNE("zip_cd", hdr.ship_to_zip_cd());
				bind.setStringNE("addr1", hdr.ship_to_addr1());
				bind.setStringNE("addr2", hdr.ship_to_addr2());
				bind.setStringNE("addr3", hdr.ship_to_addr3());
				bind.setStringNE("addr4", hdr.ship_to_addr4());
				bind.setStringNE("cntry_cd", hdr.ship_to_cntry_cd());
				bind.setStringNE("cntry_nm", hdr.ship_to_cntry_nm());
				bind.setStringNE("tel", hdr.ship_to_tel());
				bind.setStringNE("fax", hdr.ship_to_fax());
				bind.setStringNE("ship_to_cntct_dpt", hdr.ship_to_cntct_dpt());
				bind.setStringNE("ship_to_cntct_psn", hdr.ship_to_cntct_psn());
			}
		}
		else if (Hdr_dlv_id_cd == putter.getLinkBeans()) {		
			ISPanelLinker ret = getISPanelLinkerNE(putter.getLinkBeans());
			if (ret != null && ret.isEnable()) {
				HdrR hdr = getHdrR();
				bind.setStringNE("dlv_id_nm", hdr.dlv_id_nm());
				bind.setBooleanNE("dlv_sundry_flg", hdr.dlv_sundry_flg());
				bind.setBooleanNE("pri_prnt_flg", hdr.dlv_pri_prnt_flg());
				bind.setStringNE("zip_cd", hdr.dlv_zip_cd());
				bind.setStringNE("addr1", hdr.dlv_addr1());
				bind.setStringNE("addr2", hdr.dlv_addr2());
				bind.setStringNE("addr3", hdr.dlv_addr3());
				bind.setStringNE("addr4", hdr.dlv_addr4());
				bind.setStringNE("cntry_cd", hdr.dlv_cntry_cd());
				bind.setStringNE("cntry_nm", hdr.dlv_cntry_nm());
				bind.setStringNE("tel", hdr.dlv_tel());
				bind.setStringNE("fax", hdr.dlv_fax());
				bind.setStringNE("dlv_cntct_dpt", hdr.dlv_cntct_dpt());
				bind.setStringNE("dlv_cntct_psn", hdr.dlv_cntct_psn());
			}
		}
		super.openISPanelSub(inputSupportPanel, bind, putter, idx);
	}
	
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... param) {
		super.initByScreenParam(openTyp, bind, param);
	
		// 出荷予定変更から遷移
		if (isSame(openTyp, T1)) {
			MCList<DtlR> dtlL = (MCList<DtlR>) param[0];
			if (!dtlL.isEmpty()) {
				String[] arr = dtlL.getString(DtlR.$ship_schd_no).toArray(new String[dtlL.size()]);
				getCndR().ship_schd_no(MCStringUtil.arrayValueJoin(arr));
				addDoBehind(Cnd_non_srch);
			}
			valueInitSub();
		}
		else {
			// 出荷実績一覧登録からの遷移
			valueInit();
		}
	}

// IfOpePanel
	/**
	 * 操作種別のボタングループを取得する
	 *
	 */
	public MCButtonGroup getOpeButtonGroup () {
		return Cnd_ope_Group;
	}

	/**
	 * 登録用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetRegBlocks() {
		List<MCContainer> arr = new ArrayList<>();
		arr.add(getHdrR());
		arr.add(getDtlL());
		return arr;
	}

	/**
	 * 検索条件用のコンテナを取得する
	 *
	 */
	public List<MCContainer> opePanelGetCndBlocks() {
		List<MCContainer> arr = new ArrayList<>();
		arr.add(getCndR());
		return arr;
	}

	/**
	 * 検索枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　検索枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getCndLatestFlg() {
		return Cnd_latest_flg;
	}

	/**
	 * 検索枠のリビジョンＮＯの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　検索枠のリビジョンＮＯ画面部品
	 */
	public MCRowBeans getCndRevNo() {
		return Cnd_ship_act_rev;
	}

	/**
	 * 登録枠の最新ＦＬＧの画面部品を返します。<br>
	 * 最新ＦＬＧ・リビジョンＮＯ制御対象のアプリでオーバーライドします。
	 * 
	 * @return　登録枠の最新ＦＬＧ画面部品
	 */
	public MCCheckBox getRegLatestFlg() {
		return Hdr_latest_flg;
	}

	@Override
	public MCCheckBox getRegCanFlg() {
		return Hdr_can_flg;
	}
	
	@Override
	protected void beforeDoOpeChngNC(MCEventInfo info,IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.beforeDoOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);
		
		// 新規登録後に種別を変更した場合は、必要に応じてNOを検索条件に設定する
		if (isSame(bfOpe, Cnd_ope_INS.getActionCommand())) {
			
			getCndR().srch_tgt_no(getHdrR().ship_act_no());
		}
	}

	@Override
	protected boolean doOpeChngVC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt) {

		// 引継された伝票は参照登録不可
		if (isSame(bfOpe, Cnd_ope_REF.getActionCommand()) && isSame(afOpe, Cnd_ope_INS.getActionCommand())) {
			if (!isUplnd()) {
				HdrR hdrR = getHdrR();
				if (isNull(hdrR.ship_act_no())) {
					// 何もしない
				}
				else if (!isNull(hdrR.ship_inst_no())) {
					dialog(MSBEP0035);
					return false;
				}
				else {
					dialog(MSBEP0034);
					return false;
				}
			}
		}
		return super.doOpeChngVC(info, p, bfOpe, afOpe, bfSt);
	}

	@Override
	protected void doOpeChngNC(MCEventInfo info, IfOpePanel p, String bfOpe, String afOpe, String bfSt, String afSt) {
		super.doOpeChngNC(info, p, bfOpe, afOpe, bfSt, afSt);

		if (isINSOpe(afOpe)) {
			setStatus(INS);

			if (isREFOpe(bfOpe) && isREFStatus(bfSt)) {
				// 参照登録
				valueInitSub();
			}
			else {
				valueInit();
			}
			opePanelFillSpace();
		}
		else if (isREFOpe(bfOpe) && isUPDOpe(afOpe) && isREFStatus(bfSt)) {
			setUpdStatus();
		}
		else if (isREFOpe(bfOpe) && isDELOpe(afOpe) && isREFStatus(bfSt)) {
			setDelStatus();
		}
		else {
			setValueEx(Cnd_srch_tgt_typ_nm, MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO.name());
			setValueEx(Cnd_latest_flg, true);
			setStatus(SRCH);
		}
	}

	@Override
	protected void opePanelFillSpace() {
		if (getHdrR().uplnd_flg()) {
			super.opePanelFillSpace();
		}
	}


// CellConfig
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
			DtlR r = (DtlR) table.getBaseTable().getRow(index);
			
			if (Cnd_ope_REF.isSelected()) {
				return super.getPriorMode(index, column, table);
			}

			if (column == columnDtl_dlv_show_dtl) {
				// 住所表示ボタンは常にデフォルトモード
				return super.getPriorMode(index, column, table);
			}
			if (r.read_only_flg()) {
				// 後続業務が行われている場合、全項目編集不可
				if (column == columnDtl_abort_flg) {
					if (canAbortUpdEx(r)) {
						return super.getPriorMode(index, column, table);
					}
				}
				return MCMode.READ_ONLY;
			}
			if (column == columnDtl_cststk_flg
				|| column == columnDtl_loan_flg) {
				if (!MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ()) || getHdrR().cst_iv_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_itm_cd
				|| column == columnDtl_itm_sub1
				|| column == columnDtl_itm_sub2
				|| column == columnDtl_itm_sub3) {
				if (!isNull(r.ship_act_d_no())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_itm_nm) {
				if (! (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) ) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_iv_itm_nm) {
				if(!r.sundry_itm_flg()){
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_ver_no) {
				if (!r.ver_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_trd_unit_cd
				|| column == columnDtl_trd_unit_qty
				|| column == columnDtl_abort_flg) {
				if (r.dscnt_itm_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_ship_loc_cd
				|| column == columnDtl_ship_str_ln_cd
				|| column == columnDtl_ship_str_ln_cd_none_flg) {
				// ピッキングなしの非在庫品、外注間の支給(予定あり)、支給返品(予定あり、または訂正)の場合は、場所は変更不可
				if (MAC_SHIP_INST_TYP.isNO_PICK(r.ship_inst_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
						&& !isNull(r.ship_schd_loc_sppl_cd())
					|| MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
						&& (!isNull(r.ship_schd_loc_sppl_cd()) || !isNull(r.ship_act_d_no()))) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_quality_typ) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())
					) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_stk_id_typ) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())
					|| !isNull(r.ship_act_d_no())
					&& (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())
							|| MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ()))) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_gd_cd) {
				if (MAC_STK_MNG_TYP.isNOT_MNG(r.stk_mng_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_stk_arrv_bp_cd) {
				// 社外かつ自社在庫の場合のみ入力可能
				if (isNull(r.ship_loc_cd()) || isNull(r.ship_loc_sppl_cd()) || !MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_stk_bp_cd) {
				if (MSC_STK_ID_TYP.isCOSTK(r.stk_id_typ())
					|| MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_bd_dpt_cd) {
				if (!r.sls_acxfr_flg() && !r.acxfr_gi_flg()) {
					return MCMode.READ_ONLY;
				}
				else if (getHdrR().uplnd_flg()) {
					if (isSlsOrShip(r.trd_ptn_typ()) && r.acxfr_gi_flg()
							&& !r.sls_acxfr_flg()) {
						return MCMode.READ_ONLY;
					}
					else if (isXfrOrProv(r.trd_ptn_typ()) && !r.acxfr_gi_flg()
							&& r.sls_acxfr_flg()) {
								return MCMode.READ_ONLY;
							}
				}
				else {
					if (isSlsOrShip(r.trd_ptn_typ())) {
						return MCMode.READ_ONLY;
					}
					else if (isXfrOrProv(r.trd_ptn_typ()) && !r.acxfr_gi_flg()
							&& r.sls_acxfr_flg()) {
								return MCMode.READ_ONLY;
							}
				}
			}
			if (column == columnDtl_skip_chk_ship_flg) {
				if (MAC_TRD_PTN_TYP.isPROV(r.trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			
			if (column == columnDtl_sno1) {
				if (!getHdrR().uplnd_flg() && !r.sno1_null_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_sno2) {
				if (!getHdrR().uplnd_flg() && !r.sno2_null_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_sno3) {
				if (!getHdrR().uplnd_flg() && !r.sno3_null_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_sno4) {
				if (!getHdrR().uplnd_flg() && !r.sno4_null_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			if (column == columnDtl_arr_cnt_rmrks) {
				if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ()) || MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
					return MCMode.READ_ONLY;
				}
			}
			if (!MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
				if (column == columnDtl_base_dlv_slip_no
						|| column == columnDtl_base_prov_act_no
						|| column == columnDtl_base_ac_dt) {
					return MCMode.READ_ONLY;
				}
				
			}
					return super.getPriorMode(index, column, table);
		}
	}


// 品揃え
	/**
	 * 品揃え対象の出荷が揃っているかをチェックするクラス<br>
	 * チェックは指図出荷の場合のみ対象
	 */
	public class AssortChecker {
		/**
		 * 品揃え対象の受注を格納する
		 */
		protected MCList<DtlR> _assortL = MCList.create(DtlR.class);

		/**
		 * _assortL に対して、slo_no で生成したINDEX
		 */
		protected MCIndexKey _sloIdx = null;

		/**
		 * _assortL に対して slo_no, set_itm_grp_no で生成したINDEX 
		 */
		protected MCIndexKey _grpIdx = null;

		/**
		 * 表示されている明細から品揃え対象を抽出する<br>
		 * 検索直後、または初期表示時に実行すること
		 */
		protected void init() {
			_assortL.clear();
	
			MCList<DtlR> dtlL = getDtlL();
			if (isNull(dtlL) || isUplnd()
				|| !isSame(getShipTgtKey(), DtlR.$ship_inst_d_no)) {
				return;
			}
			// 品揃え対象を抽出
			for (MCList<DtlR> sloL : dtlL.groupList(DtlR.$slo_no)) {
				DtlR sloR = sloL.get(0);
				if (MSC_SHIP_ASSORT_TYP.isAST(sloR.assort_typ())) {
					_assortL.addAll(sloL);
				}
				else {
					for (MCList<DtlR> grpL : sloL.groupList(DtlR.$set_itm_grp_no)) {
						DtlR grpR = grpL.get(0);
						if (!isNull(grpR.set_itm_grp_no())) {
							_assortL.addAll(grpL);
						}
					}
				}
			}
			_sloIdx = _assortL.createIndex(DtlR.$slo_no);
			_grpIdx = _assortL.createIndex(DtlR.$slo_no, DtlR.$set_itm_grp_no);
		}

		/**
		 * 品揃え対象が全て揃っているかチェックする<br>
		 * 揃っていない出荷対象が存在する場合は「false」を返す
		 */
		protected MCMessageList check() {
			MCMessageList msgL = new MCMessageList();
		
			MCList<DtlR> dtlL = createDtlL();
			dtlL.setAll(getDtlL());
			if (isNull(dtlL) || isUplnd()
				|| _assortL.isEmpty() || !isSame(getShipTgtKey(), DtlR.$ship_inst_d_no)) {
				return msgL;
			}
			// 品揃え対象を抽出
			// init で退避した時点と件数が異なる場合は、揃っていないとみなす
			dtlL.removeAll(dtlL.subList(MCRow.DELETE));	// 更新時に削除された場合
			for (MCList<DtlR> sloL : dtlL.groupList(DtlR.$slo_no)) {
				DtlR sloR = sloL.get(0);
				if (MSC_SHIP_ASSORT_TYP.isAST(sloR.assort_typ())) {
					if (!diffSloL(
						_assortL.subList(_sloIdx, sloR.toArray(_sloIdx.getKeys())), sloL)) {
						msgL.add(new MCMessage(
							MSBEP0025, sloR.slo_no(), sloR.assort_typ(), null));
					}
				}
				else {
					for (MCList<DtlR> grpL : sloL.groupList(DtlR.$set_itm_grp_no)) {
						DtlR grpR = grpL.get(0);
						if (!isNull(grpR.set_itm_grp_no())) {
							if (!diffSloL(_assortL.subList(_grpIdx, grpR.toArray(_grpIdx.getKeys())), grpL)) {
								msgL.add(new MCMessage(
									MSBEP0025, grpR.slo_no(), grpR.assort_typ(), grpR.set_itm_grp_no()));
							}
						}
					}
				}
			}
			return msgL;
		}

		/**
		 * 受注明細の単位で比較する
		 */
		protected boolean diffSloL(MCList<DtlR> oldL, MCList<DtlR> newL) {
			MCIndexKey idx = newL.createIndex(DtlR.$slo_d_no);
			for (MCList<DtlR> oldSloDL : oldL.groupList(DtlR.$slo_d_no)) {
				DtlR sloDR = oldSloDL.get(0);

				// 受注明細に紐付く出荷予定の総数
				MCNumber sloQty = MCNumber.ZERO;
				for (MCList<DtlR> lst : oldSloDL.groupList(DtlR.$ship_schd_no)) {
					sloQty = sum(sloQty, lst.get(0).schd_qty());
				}

				MCList<DtlR> newSloDL = newL.subList(idx, sloDR.slo_d_no());
				// 明細件数が異なったらNG
				// 予定分割、分割出荷などで受注明細が複数に分かれることがあるので、受注明細でグループ化した件数で比較
				if (oldSloDL.groupBy(DtlR.$slo_d_no).size() != newSloDL.groupBy(DtlR.$slo_d_no).size()) {
					return false;
				}
				// 明細レベルで予定数＞実績数の場合もNG
				else if (sloQty.gt(newSloDL.sum(DtlR.$base_unit_qty))) {
					return false;
				}
			}
			return true;
		} 
	}


// 表示順変更
	@Override
	public MCTable<?> getRowMoveTable() {
		return DtlTable;
	}

	@Override
	public boolean isStatusChange() {
		return false;
	}

	// -----------------------------------------------
	// MSBEP0500
	@Override
	public MCTable<?> getStkTable(MCRootPanel panel) {
		return DtlTable;
	}
	
	@Override
	public boolean isOpeTypEnable(MCRootPanel panel, int index, String ope) {
		if (isUplnd()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isCndEnable(String ope, String name) {
		if (IfStkInspBase.CND_LG_GRP_CD.equals(name)
				|| IfStkInspBase.CND_LG_GRP_NM.equals(name) ) {
			return false;
		}
		if (!isUplnd()) {
			if (IfStkInspBase.CND_ITM_CD.equals(name) 
					|| IfStkInspBase.CND_ITM_SUB1.equals(name)
					|| IfStkInspBase.CND_ITM_SUB2.equals(name)
					|| IfStkInspBase.CND_ITM_SUB3.equals(name)
					|| IfStkInspBase.CND_ITM_NM.equals(name)
					|| IfStkInspBase.CND_SNO1.equals(name)
					|| IfStkInspBase.CND_SNO2.equals(name)
					|| IfStkInspBase.CND_SNO3.equals(name)
					|| IfStkInspBase.CND_SNO4.equals(name)
					|| IfStkInspBase.CND_STK_BP_CD.equals(name)
					|| IfStkInspBase.CND_STK_BP_NM.equals(name)
					|| IfStkInspBase.CND_STK_ARRV_BP_CD.equals(name)
					|| IfStkInspBase.CND_STK_ARRV_BP_NM.equals(name)
					) {
				return false;
			}
			else if (IfStkInspBase.CND_LOC_CD.equals(name)
						|| IfStkInspBase.CND_LOC_NM.equals(name)
						|| IfStkInspBase.CND_STR_LN_CD.equals(name)
						|| IfStkInspBase.CND_STR_LN_NM.equals(name)) {
				DtlR dr  = DtlTable.getSelectedMCRow();
				// 外注間の支給(予定あり)、支給返品の場合は出荷進捗の持つ場所固定
				if (!isNull(dr.ship_schd_loc_sppl_cd())) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public MCRow get_open_MSBEP0500_bind_Row(MCTable<?> table) {
		if (table == null) {
			return null;
		}

		MCRow bind = MCRow.create();
		DtlR dr  = DtlTable.getSelectedMCRow();

		bind.addStringColumn(IfStkInspBase.CND_LG_GRP_CD, getHdrR().ship_fr_lg_grp_cd()); // 物流ＧＣＤ
		bind.addStringColumn(IfStkInspBase.CND_LG_GRP_NM, getHdrR().ship_fr_lg_grp_nm()); // 物流Ｇ名

		if (dr != null) {
			bind.addStringColumn(IfStkInspBase.CND_LOC_CD, dr.ship_loc_cd()); // 場所ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_LOC_NM, dr.ship_loc_nm()); // 場所名
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_CD, dr.ship_str_ln_cd()); // 棚・ラインＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STR_LN_NM, dr.ship_str_ln_nm()); // 棚・ライン名
			bind.addStringColumn(IfStkInspBase.CND_ITM_CD, dr.itm_cd()); // 品目ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB1, dr.itm_sub1()); // 枝番１
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB2, dr.itm_sub2()); // 枝番２
			bind.addStringColumn(IfStkInspBase.CND_ITM_SUB3, dr.itm_sub3()); // 枝番３
			bind.addStringColumn(IfStkInspBase.CND_ITM_NM, dr.itm_nm()); // 品名
			bind.addStringColumn(IfStkInspBase.CND_VER_NO, dr.ver_no()); // 版ＮＯ
			bind.addStringColumn(IfStkInspBase.CND_SNO1, dr.sno1()); // 手配ＮＯ１
			bind.addStringColumn(IfStkInspBase.CND_SNO2, dr.sno2()); // 手配ＮＯ２
			bind.addStringColumn(IfStkInspBase.CND_SNO3, dr.sno3()); // 手配ＮＯ３
			bind.addStringColumn(IfStkInspBase.CND_SNO4, dr.sno4()); // 手配ＮＯ４
			bind.addBooleanColumn(IfStkInspBase.CND_SNO1_NULL_FLG, dr.sno1_null_flg()); // 手配ＮＯ１無し可
			bind.addBooleanColumn(IfStkInspBase.CND_SNO2_NULL_FLG, dr.sno2_null_flg()); // 手配ＮＯ２無し可
			bind.addBooleanColumn(IfStkInspBase.CND_SNO3_NULL_FLG, dr.sno3_null_flg()); // 手配ＮＯ３無し可
			bind.addBooleanColumn(IfStkInspBase.CND_SNO4_NULL_FLG, dr.sno4_null_flg()); // 手配ＮＯ４無し可
			bind.addStringColumn(IfStkInspBase.CND_GD_CD, dr.gd_cd()); // 格付ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_GD_NM, dr.gd_nm()); // 格付名

			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_CD, dr.stk_arrv_bp_cd()); // 在庫着荷先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_ARRV_BP_NM, dr.stk_arrv_bp_nm()); // 在庫着荷先名
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_CD, dr.stk_bp_cd()); // 在庫取引先ＣＤ
			bind.addStringColumn(IfStkInspBase.CND_STK_BP_NM, dr.stk_bp_nm()); // 在庫取引先名
		}
		if (dr != null && !isNull(dr.stk_id_typ())) {
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, MSC_STK_ID_TYP.isCOSTK(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, MSC_STK_ID_TYP.isRTN_PRE_ACCPT(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG, MSC_STK_ID_TYP.isCSTSTK(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, MSC_STK_ID_TYP.isRNT_RCV(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, MSC_STK_ID_TYP.isACCPT_DFCT(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, MSC_STK_ID_TYP.isNCV_RCV(dr.stk_id_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, MSC_STK_ID_TYP.isONR_PROV(dr.stk_id_typ()));
		}
		else {
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_COSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RTN_PRE_ACCPT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_CSTSTK_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_RNT_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ACCPT_DFCT_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_NCV_RCV_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_STK_ID_TYP_ONR_PROV_FLG, true);
		}
		if (dr != null && !isNull(dr.quality_typ())) {
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, MAC_QUALITY_TYP.isGOOD(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, MAC_QUALITY_TYP.isDFCT_OPER(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, MAC_QUALITY_TYP.isDFCT_INSP(dr.quality_typ()));
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, MAC_QUALITY_TYP.isSSPND(dr.quality_typ()));
		}
		else {
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_GOOD_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_OPER_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_DFCT_INSP_FLG, true);
			bind.addBooleanColumn(IfStkInspBase.CND_QUALITY_TYP_SSPND_FLG, true);
		}
		String trdPtnTyp = getHdrR().uplnd_flg() ? getHdrR().trd_ptn_typ() : dr.trd_ptn_typ();
		if (getHdrR().uplnd_flg()
			&& MAC_TRD_PTN_TYP.isPROV(trdPtnTyp)) {
			// 計画外の支給は社内・社外両方
		}
		else if (MAC_TRD_PTN_TYP.isPROV_RTN(trdPtnTyp)
					|| MAC_TRD_PTN_TYP.isPROV(dr.trd_ptn_typ()) && !isNull(dr.ship_schd_loc_sppl_cd())) {
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.OUTSIDE.value());
		}
		else {
			bind.addStringColumn(IfStkInspBase.CND_STK_INFO_LOC_TYP, MSC_STK_INFO_LOC_TYP.HOUSE.value());
		}
		return bind;
	}

	@Override
	public String getStkInspOpeType(MCTable<?> table, int index) {
		// 選択行が品目ありの場合はフォーカス行のみを更新する
		DtlR dr  = DtlTable.getSelectedMCRow();
		
		if (dr != null && !isNull(dr.itm_cd())) {
			return IfStkInspBase.OPE_UPD;
		}
		else {
			return IfStkInspBase.OPE_INS;
		}
	}
	@Override
	public boolean isSrch(String openTyp, MCRow bind, Object... args) {
		DtlR dr  = DtlTable.getSelectedMCRow();
		
		if (dr != null && !isNull(dr.itm_cd())) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	 public boolean isValueLink(MCRootPanel panel, int index, String ope, String name) {
		//
		if (isUplnd()) {
			return true;
		}
		if (IfStkInspBase.INPT_VER_NO.equals(name) ||
				IfStkInspBase.INPT_LOT_NO.equals(name) ||
				IfStkInspBase.INPT_SUBLOT_NO.equals(name) ||
				IfStkInspBase.INPT_LOC_CD.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD.equals(name) ||
				IfStkInspBase.INPT_STR_LN_CD_NONE_FLG.equals(name) ||
				IfStkInspBase.INPT_PACK_UNIT_CD.equals(name) ||
				IfStkInspBase.INPT_PACK_STK_QTY.equals(name) ||
				IfStkInspBase.INPT_SNO1.equals(name) ||
				IfStkInspBase.INPT_SNO2.equals(name) ||
				IfStkInspBase.INPT_SNO3.equals(name) ||
				IfStkInspBase.INPT_SNO4.equals(name)) {
			return true;
		}
		return false;
	}
	@Override
	public String getInptLocCdCol() {
		return DtlR.$ship_loc_cd;
	}
	@Override
	public String getInptStrLnCdCol() {
		return DtlR.$ship_str_ln_cd;
	}
	@Override
	public String getInptStrLnCdNoneFlgCol() {
		return DtlR.$ship_str_ln_cd_none_flg;
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