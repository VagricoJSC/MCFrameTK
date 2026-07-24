package mcframe.clientMSBE.MSBEP2240;

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

import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5040.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5320.*;
import mcframe.clientMSUB.MSUBP5020.*;
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
import mcframe.clientMSBE.MSBEP2210.*;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_RcptIvDSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_RcptIvDSel_MC extends MSBEP_RcptIvDSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 画面遷移時に重複チェックする項目<br>
	 */
	protected MCColumnConfig[] getChkBeforeScreenTran() {

		if (_chkBeforeScreenTran == null) {
			_chkBeforeScreenTran = new MCColumnConfig[] {
					columnRslt_purc_tterm_cd1,
					columnRslt_purc_tterm_nm1,
					columnRslt_purc_tterm_rmrks1,
					columnRslt_purc_tterm_cd2,
					columnRslt_purc_tterm_nm2,
					columnRslt_purc_tterm_rmrks2,
					columnRslt_purc_tterm_cd3,
					columnRslt_purc_tterm_nm3,
					columnRslt_purc_tterm_rmrks3,
					columnRslt_trd_rmrks,
					columnRslt_po_print_rmrks,
					columnRslt_xrate_inpt_flg,
					columnRslt_xrate,
					columnRslt_ptax_xrate_inpt_flg,
					columnRslt_ptax_xrate,
					columnRslt_trnspt_cd,
					columnRslt_trnspt_nm,
					columnRslt_vssl_flght,
					columnRslt_load_port_cd,
					columnRslt_load_port_nm,
					columnRslt_etd_dt,
					columnRslt_dschrg_port_cd,
					columnRslt_dschrg_port_nm,
					columnRslt_eta_dt,
					columnRslt_via_port_cd,
					columnRslt_via_port_nm,
					columnRslt_via_schd_dt,
					columnRslt_slo_tterm_rmrks1,
					columnRslt_slo_tterm_rmrks2,
					columnRslt_slo_tterm_rmrks3,
					columnRslt_slo_xrate,
					columnRslt_slo_ptax_xrate,
					columnRslt_rcpt_iv_no,
					columnRslt_purc_schd_dt
			};
		}
		return _chkBeforeScreenTran;
	}

	/**
	 * 画面遷移時に重複チェックする項目<br>
	 * (値が重複している場合は、画面遷移時にNULLをセットする)<br>
	 * _chkScreenTranの内で、HHP0020遷移時に入力可となる項目
	 */
	protected MCColumnConfig[] _chkBeforeScreenTran = null;
	
	/** 呼出元（MSBEP2210）*/
	protected mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg _param;
	
	protected MCDate _purcSchdDt = null;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvDSel_MC() {
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
	public MSBEP_RcptIvDSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2240_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2240_Srch01Caller<P extends MSBEP_RcptIvDSel, B extends MS_MSBEL2240_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2240_Srch01Caller(P p, B b) {
			super(p, b);
		}
		

		@Override
		protected void setMode() {
			super.setMode();
			setREFStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSRCHStatus();
		}
		
	}
	@Override
	public void setSRCHStatus() {
		super.setSRCHStatus();
		setCmnStatus();
	}
	@Override
	public void setREFStatus() {
		super.setREFStatus();
		setCmnStatus();
		RsltTable.selectLeftmostColumn(0);
	}
	protected void setCmnStatus() {
		if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getCndR().rcpt_iv_src_typ())) {
			
			columnRslt_bndl_tgt_flg.setMode(MCMode.READ_ONLY);
			columnRslt_arr_act_no.setMode(MCMode.INVISIBLE);
			columnRslt_rcpt_iv_no.setMode(MCMode.INVISIBLE);
			Rslt_arr_dt_p_PPanel.setINVISIBLEStatus();
			Btn_select_bndl_grp.setMode(MCMode.DISABLE);
		}
		else {
			setDefaultMode(columnRslt_bndl_tgt_flg);
			setDefaultMode(columnRslt_arr_act_no);
			setDefaultMode(columnRslt_rcpt_iv_no);
			Rslt_arr_dt_p_PPanel.setREAD_ONLYStatus();
			setDefaultMode(Btn_select_bndl_grp);
		}
	}
	/**
	 * Panel[Btn]のボタン[select_all]の押下時の処理
	 */
	@Override
	public void doBtn_select_all(MCEventInfo info) {
		doSelectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[deselect_all]の押下時の処理
	 */
	@Override
	public void doBtn_deselect_all(MCEventInfo info) {
		doDeselectAll(RsltTable);
	}
	/**
	 * Panel[Btn]のボタン[accept]の押下時の処理
	 */
	@Override
	public void doBtn_accept(MCEventInfo info) {
		
		MCList<RsltR> rL = getRsltL().subList(RsltR.$check, true);
		String strForLog = new String();

		if (!rL.isEmpty()) {

			MCMessageList msgL = new MCMessageList();
			boolean isMixPurcBasisTyp = false;
			
			checkPurcBasisTyp(msgL, rL);
			if (msgL.size() > 0) {
				message(msgL, MCFrameType.SYSTEM_MODAL);
				return;
			}

			// ヘッダと明細のヘッダ項目を比較し、異なる場合はメッセージを出す
			CndR cR = getCndR();
			RsltR baseR = null;
			
			// baseRは仕入対象の明細行をセットする。仕入対象の明細がなければ、先頭の明細をセットする。
			RsltR row = rL.getFirst(RsltR.$non_purc_flg, false);
			if (isNull(row)) {
				baseR = rL.get(0).clone();
			}
			else {
				// 仕入対象の明細のうち仕入計上区分「入荷基準」を優先する
				RsltR arrBasisR = rL.getFirst(RsltR.$purc_basis_typ, MAC_PURC_BASIS_TYP.ARR_BASIS.value());
				if (!isNull(arrBasisR)) {
					baseR = arrBasisR.clone();
				}
				else {
					baseR = row.clone();
				}
			}
			
			for (MCColumnConfig conf : getChkBeforeScreenTran()) {

				String s = conf.getBaseRowColumnName();
				
				for (RsltR r : rL) {
					// 既に比較によりbaseRにnullがセットされている場合はスキップ
					if (isNull(baseR.getValue(s))) {
						continue;
					}
					
					if (conf == columnRslt_purc_schd_dt
						|| conf == columnRslt_rcpt_iv_no) {
						if (isNull(r.getValue(s))) {
							// 仕入予定日がNullの場合は比較しない
							continue;
						}
						if (conf == columnRslt_purc_schd_dt && !cR.has_arr_basis_flg()) {
							if (!isSame(_purcSchdDt, baseR.getValue(s))
									&& MAC_PURC_BASIS_TYP.isARR_BASIS(baseR.purc_basis_typ())) {
								if (!isMixPurcBasisTyp) {
									_param.getHdr1R().purc_schd_dt(baseR.purc_schd_dt());
									MCMessage msg = new MCMessage(MSBEP0041);
									msgL.add(msg);
								}
								isMixPurcBasisTyp = true;
								continue;
							}
						}
					}
					
					// 選択した明細行内で値が一致しない、または呼出元の項目と値が一致しない場合にメッセージを出力する
					if (!isSame(baseR.getValue(s), r.getValue(s))
							|| (conf != columnRslt_purc_schd_dt
							&& conf != columnRslt_rcpt_iv_no
							&& !isSame(cR.getValueNE(s), baseR.getValue(s)))
							|| (conf == columnRslt_rcpt_iv_no
							&& !isNull(cR.getValueNE(s)) && !isSame(cR.getValueNE(s), baseR.getValue(s)))
							|| (conf == columnRslt_purc_schd_dt
							&& !isNull(_purcSchdDt) && !isSame(_purcSchdDt, baseR.getValue(s))
							&& !MAC_PURC_BASIS_TYP.isARR_BASIS(baseR.purc_basis_typ()))) {
						baseR.clear(s);
						if (strForLog.length() > 0) {
							strForLog = strForLog + " / ";
						}
						String headerName = conf.getHeaderName();
						strForLog = strForLog + headerName;
					}
				}
			}

			if (!isNull(strForLog)) {
				MCMessage msg = new MCMessage(MSBEP0002, strForLog);
				msgL.add(msg);
			}
			if (msgL.size() > 0) {
				message(msgL, MCFrameType.SYSTEM_MODAL);
			}
			
			// ROWの追加
			rL.setStatus(MCRow.CREATE);
			_param.getCnd2L().clear();
			for (RsltR r : rL) {
				mcframe.clientMSBE.MSBEP2210.Cnd2R aR = _param.getCnd2L().add();
				aR.purc_schd_no(r.purc_schd_no());
				aR.arr_schd_no(r.arr_schd_no());
				aR.arr_act_no(r.arr_act_no());
				aR.bndl_tgt_flg(r.bndl_tgt_flg());
			}
			_param.getCndR().setBooleanNE("is_src_msbep2240", true);
			_param.getCndR().rcpt_iv_src_typ(getCndR().rcpt_iv_src_typ());
			_param.doCnd_srch_po(null);
			_param.getHdr1R().bef_purc_schd_dt(_param.getHdr1R().purc_schd_dt());
		}
		
		statusClear();
		requestCloseWindow();
	}
	
	/**
	 * Panel[Btn]のボタン[srch]の押下時の処理
	 */
	@Override
	public void doBtn_srch(MCEventInfo info) {
		callMS_MSBEL2240_Srch01();
	}
	
	// -----------------------------------------------
	// init
	@Override
	protected void initByScreenParam(String openTyp, MCRow bind, Object... args) {
		super.initByScreenParam(openTyp, bind, args);
		if (T1 == openTyp) {
			// [バインド値：1] 検索条件
			// 発注情報
			getCndR().in_to_id_typ(bind.getStringNE("in_to_id_typ"));
			getCndR().in_to_id_cd(bind.getStringNE("in_to_id_cd"));
			getCndR().in_to_id_nm(bind.getStringNE("in_to_id_nm"));
			getCndR().in_to_zip_cd(bind.getStringNE("in_to_zip_cd"));
			getCndR().in_to_addr1(bind.getStringNE("in_to_addr1"));
			getCndR().in_to_addr2(bind.getStringNE("in_to_addr2"));
			getCndR().in_to_addr3(bind.getStringNE("in_to_addr3"));
			getCndR().in_to_addr4(bind.getStringNE("in_to_addr4"));
			getCndR().in_to_tel(bind.getStringNE("in_to_tel"));
			getCndR().in_to_fax(bind.getStringNE("in_to_fax"));
			getCndR().in_to_cntct_dpt(bind.getStringNE("in_to_cntct_dpt"));
			getCndR().in_to_cntct_psn(bind.getStringNE("in_to_cntct_psn"));
			getCndR().in_to_cntry_cd(bind.getStringNE("in_to_cntry_cd"));
			getCndR().sppl_cd(bind.getStringNE("sppl_cd"));
			getCndR().trd_cur_cd(bind.getStringNE("trd_cur_cd"));
			// 受注情報
			getCndR().slo_cur_cd(bind.getStringNE("slo_cur_cd"));
			getCndR().cst_cd(bind.getStringNE("cst_cd"));
			getCndR().slo_trd_ptn_typ(bind.getStringNE("slo_trd_ptn_typ"));
			getCndR().sls_basis_typ(bind.getStringNE("sls_basis_typ"));
			getCndR().slo_tterm_cd1(bind.getStringNE("slo_tterm_cd1"));
			getCndR().slo_tterm_cd2(bind.getStringNE("slo_tterm_cd2"));
			getCndR().slo_tterm_cd3(bind.getStringNE("slo_tterm_cd3"));
			// [バインド値：2] 明細比較項目
			getCndR().purc_tterm_cd1(bind.getStringNE("purc_tterm_cd1"));
			getCndR().purc_tterm_nm1(bind.getStringNE("purc_tterm_nm1"));
			getCndR().purc_tterm_rmrks1(bind.getStringNE("purc_tterm_rmrks1"));
			getCndR().purc_tterm_cd2(bind.getStringNE("purc_tterm_cd2"));
			getCndR().purc_tterm_nm2(bind.getStringNE("purc_tterm_nm2"));
			getCndR().purc_tterm_rmrks2(bind.getStringNE("purc_tterm_rmrks2"));
			getCndR().purc_tterm_cd3(bind.getStringNE("purc_tterm_cd3"));
			getCndR().purc_tterm_nm3(bind.getStringNE("purc_tterm_nm3"));
			getCndR().purc_tterm_rmrks3(bind.getStringNE("purc_tterm_rmrks3"));
			getCndR().xrate_inpt_flg(bind.getBooleanNE("xrate_inpt_flg"));
			getCndR().xrate(bind.getNumberNE("xrate"));
			getCndR().ptax_xrate_inpt_flg(bind.getBooleanNE("ptax_xrate_inpt_flg"));
			getCndR().ptax_xrate(bind.getNumberNE("ptax_xrate"));
			getCndR().trnspt_cd(bind.getStringNE("trnspt_cd"));
			getCndR().trnspt_nm(bind.getStringNE("trnspt_nm"));
			getCndR().vssl_flght(bind.getStringNE("vssl_flght"));
			getCndR().load_port_cd(bind.getStringNE("load_port_cd"));
			getCndR().load_port_nm(bind.getStringNE("load_port_nm"));
			getCndR().etd_dt(bind.getDateNE("etd_dt"));
			getCndR().dschrg_port_cd(bind.getStringNE("dschrg_port_cd"));
			getCndR().dschrg_port_nm(bind.getStringNE("dschrg_port_nm"));
			getCndR().eta_dt(bind.getDateNE("eta_dt"));
			getCndR().via_port_cd(bind.getStringNE("via_port_cd"));
			getCndR().via_port_nm(bind.getStringNE("via_port_nm"));
			getCndR().via_schd_dt(bind.getDateNE("via_schd_dt"));
			getCndR().slo_tterm_rmrks1(bind.getStringNE("slo_tterm_rmrks1"));
			getCndR().slo_tterm_rmrks2(bind.getStringNE("slo_tterm_rmrks2"));
			getCndR().slo_tterm_rmrks3(bind.getStringNE("slo_tterm_rmrks3"));
			getCndR().slo_xrate(bind.getNumberNE("slo_xrate"));
			getCndR().slo_ptax_xrate(bind.getNumberNE("slo_ptax_xrate"));

			// 仕入予定日を格納(明細行の反映実施時に比較に使用)
			getCndR().purc_schd_dt(bind.getDateNE("purc_schd_dt"));
			_purcSchdDt = bind.getDateNE("purc_schd_dt");
			
			// 受領インボイス
			getCndR().rcpt_iv_no(bind.getStringNE("rcpt_iv_no"));
			getCndR().rcpt_iv_src_typ(bind.getStringNE("rcpt_iv_src_typ"));
			
			// 呼出元の明細に仕入計上区分「入荷実績」が存在するか(検索結果の絞り込み、反映実施時に比較に使用)
			getCndR().has_arr_basis_flg(bind.getBooleanNE("has_arr_basis_flg"));
			
			_param = (mcframe.clientMSBE.MSBEP2210.MSBEP_RcptIvReg) args[0];
			if (MSC_RCPT_IV_SRC_TYP.isARR_SCHD(getCndR().rcpt_iv_src_typ())) {
				MCList<Dtl1R> dtl1L = exceptEmpty(_param.getDtl1L());
				for (Dtl1R r : dtl1L) {
					Cnd2R cndR = getCnd2L().add();
					cndR.arr_schd_no(r.arr_schd_no());
				}
			}
			else {
				MCList<Dtl1R> dtl1L = exceptEmpty(_param.getDtl1L());
				for (Dtl1R dtl : dtl1L) {
					if (_param._dtl2L.containsKey(dtl.peg_no())) {
						MCList<mcframe.clientMSBD.MSBDP0140.Dtl2R>
							dtl2L = exceptEmpty(_param._dtl2L.get(dtl.peg_no()));
						for (mcframe.clientMSBD.MSBDP0140.Dtl2R r : dtl2L) {
							Cnd2R cndR = getCnd2L().add();
							cndR.arr_act_no(r.arr_act_no());
						}
					}
				}
			}

			addDoBehind(Btn_srch);
		}	
		else {	
			throw new MCAppException(msgUnknownOpenParam());
		}	
	}
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 取引通貨単価・金額
		Rslt_trd_cur_upri_p_PPanel.setSchd(true);
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_sppl_cd,
				columnRslt_itm_cd, columnRslt_itm_sub1, columnRslt_itm_sub2, columnRslt_itm_sub3,
				columnRslt_trd_unit_cd, columnRslt_trd_unit_qty, columnRslt_trd_amt_dec_place, columnRslt_trd_upri_dec_place,
				columnRslt_purc_amt_rnd_typ, columnRslt_purc_tax_rnd_typ, null, null, columnRslt_dscnt_itm_flg);
		// 取引単価
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		// 取引金額
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_wtax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);

		// 基準通貨単価
		Rslt_base_cur_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		Rslt_base_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_upri_dec_place);
		// 基準通貨金額
		Rslt_base_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_inc_ctax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);
		Rslt_base_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_base_cur_cd, columnRslt_base_amt_dec_place);

		// 納税通貨単価
		Rslt_ptax_cur_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		Rslt_ptax_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_upri_dec_place);
		// 納税通貨金額
		Rslt_ptax_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_inc_ctax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		Rslt_ptax_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_ptax_cur_cd, columnRslt_ptax_amt_dec_place);
		
		// 発注取引通貨値引額
		Rslt_po_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);

		// 仕入予定数量
		Rslt_trd_unit_qty_p_PPanel.setRelateBeans(columnRslt_trd_unit_cd, columnRslt_trd_unit_dec_place);
		Rslt_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);
		Rslt_po_base_unit_qty_p_PPanel.setRelateBeans(columnRslt_base_unit_cd, columnRslt_base_unit_dec_place);

		// 負担項目
		Rslt_bditm_p_PPanel.setRelateBeans(columnRslt_asset_mng_typ, 
				columnRslt_bd_lot_mng_typ, columnRslt_bd_sublot_mng_typ, columnRslt_bd_sno1_mng_typ, 
				columnRslt_bd_sno2_mng_typ, columnRslt_bd_sno3_mng_typ, columnRslt_bd_sno4_mng_typ);;
	}
	@Override
	public void doRslt_bndl_tgt_flg_NC(MCEventInfo info){
		super.doRslt_bndl_tgt_flg_NC(info);
		RsltR r = getRsltL().get(info.getEventIndex());

		MCList<RsltR> bndlL =MCList.create(RsltR.class);
		if (getBtnR().select_bndl_grp()) {
			bndlL.addAll(getBndlGrpL(r));
			bndlL.setBoolean(RsltR.$bndl_tgt_flg, r.bndl_tgt_flg());
		}
		
		if (r.bndl_tgt_flg()) {
			bndlL.add(r);
			bndlL.setBoolean(RsltR.$check, true);
		}
	}
	protected MCList<RsltR> getBndlGrpL(RsltR rsltR) {
		// 選択可能行からまとめ対象を取得
		return getRsltL().subList(r -> 
			isColSame(r, rsltR, getBndlGrpKey())
		);
	}
	/**
	 * まとめ条件のキー
	 */
	protected String[] _bndlGrpKey;
	protected String[] getBndlGrpKey() {
		if (_bndlGrpKey == null) {
			_bndlGrpKey = new String[]{
				RsltR.$po_no,
				RsltR.$po_d_no,
				RsltR.$purc_schd_no
			};
		}
		return _bndlGrpKey;
	}
	
	
	// -----------------------------------------------
	/**
	 * 引数のColumnConfigの配列を元に、カラム名(パス)の文字列配列を作成する
	 * @param confs MCColumnConfig[]
	 * @return strArray Stirng[]
	 */
	protected String[] getStrFromColumn(MCColumnConfig[] confs) {

		String[] strArray = new String[confs.length];

		for (int i = 0; i < confs.length; i++) {

			strArray[i] = confs[i].getBaseRowColumnName();
		}

		return strArray;
	}
	
	protected void checkPurcBasisTyp(MCMessageList msgL, MCList<RsltR> rL) {
		MCList<RsltR> subL = rL.subList(RsltR.$purc_basis_typ, MAC_PURC_BASIS_TYP.ARR_BASIS.value());
		MCList<RsltR> grpL = subL.groupBy(RsltR.$purc_schd_dt);
		if (grpL.size() > 1) {
			msgL.add(new MCMessage(MSBEP0040));
		}
	}

}