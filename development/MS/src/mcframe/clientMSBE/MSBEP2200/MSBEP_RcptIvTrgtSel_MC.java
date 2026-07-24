package mcframe.clientMSBE.MSBEP2200;

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
import mcframe.clientMAUB.MAUBP0030.*;
import mcframe.clientMAUB.MAUBP0100.*;
import mcframe.clientMAUB.MAUBP0250.*;
import mcframe.clientMAUB.MAUBP0260.*;
import mcframe.clientMAUB.MAUBP0400.*;
import mcframe.clientMAUB.MAUBP5030.*;
import mcframe.clientMAUB.MAUBP5050.*;
import mcframe.clientMAUB.MAUBP5060.*;
import mcframe.clientMAUB.MAUBP5070.*;
import mcframe.clientMAUB.MAUBP5170.*;
import mcframe.clientMAUB.MAUBP5190.*;
import mcframe.clientMAUB.MAUBP5320.*;

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
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.clientMSBE.MSBEP2210.Cnd2R;
//FMCB CUSTOM_IMPORT END

/**
 * 画面"MSBEP_RcptIvTrgtSel"パネルクラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 */
@SuppressWarnings("serial")
abstract public class MSBEP_RcptIvTrgtSel_MC extends MSBEP_RcptIvTrgtSel_MC_A {

	//カスタマイズのfieldはこの間に記述してください。
	//FMCB CUSTOM_FIELD START
	/**
	 * 画面遷移時に値の引継ぎを行うかどうかのチェック対象のカラム<br>
	 */
	protected MCColumnConfig[] getChkScreenTran() {

		if (_chkScreenTran == null) {
			_chkScreenTran = new MCColumnConfig[] {
					// 値が違う場合は同時選択不可の項目
					columnRslt_in_to_id_typ,
					columnRslt_in_to_id_typ_nm,
					columnRslt_in_to_id_cd,
					columnRslt_in_to_id_nm,
					columnRslt_in_to_cntct_dpt,
					columnRslt_in_to_cntct_psn,
					columnRslt_in_to_zip_cd,
					columnRslt_in_to_addr1,
					columnRslt_in_to_addr2,
					columnRslt_in_to_addr3,
					columnRslt_in_to_addr4,
					columnRslt_in_to_tel,
					columnRslt_in_to_fax,
					columnRslt_in_to_cntry_cd,
					columnRslt_in_to_cntry_nm,
					columnRslt_sppl_cd,
					columnRslt_sppl_nm,
					columnRslt_purc_amt_rnd_typ,
					columnRslt_purc_tax_rnd_typ,
					columnRslt_trd_cur_cd,
					columnRslt_trd_cur_nm,
					columnRslt_trd_amt_dec_place,
					columnRslt_trd_upri_dec_place,
					columnRslt_base_cur_cd,
					columnRslt_base_cur_nm,
					columnRslt_base_amt_dec_place,
					columnRslt_base_upri_dec_place,
					columnRslt_ptax_cur_cd,
					columnRslt_ptax_cur_nm,
					columnRslt_ptax_amt_dec_place,
					columnRslt_ptax_upri_dec_place,
					columnRslt_slo_cur_cd,
					columnRslt_slo_cur_nm,
					columnRslt_cst_cd,
					columnRslt_cst_nm,
					columnRslt_slo_tterm_cd1,
					columnRslt_slo_tterm_nm1,
					columnRslt_slo_tterm_cd2,
					columnRslt_slo_tterm_nm2,
					columnRslt_slo_tterm_cd3,
					columnRslt_slo_tterm_nm3,
					columnRslt_slo_trd_ptn_typ,
					columnRslt_slo_trd_ptn_typ_nm,
					columnRslt_sls_basis_typ,
					columnRslt_sls_basis_typ_nm,
					// group byで値を取得するための追加分
					columnRslt_pay_spot_flg,
					columnRslt_prnt_lcl_cd,
					columnRslt_purc_basis_typ,
					
					// 値が異なるかをチェックし、異なる場合は引継されない項目
					columnRslt_rcpt_iv_no,
					columnRslt_purc_schd_dt,
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
					columnRslt_slo_xrate,
					columnRslt_slo_ptax_xrate,
					columnRslt_slo_tterm_rmrks1,	
					columnRslt_slo_tterm_rmrks2,
					columnRslt_slo_tterm_rmrks3
			};
		}
		return _chkScreenTran;
	}
	
	/**
	 * 画面遷移時に値が異なるかをチェックし、異なる場合は引継されない項目<br>
	 */
	protected MCColumnConfig[] getChkBeforeScreenTran() {

		if (_chkBeforeScreenTran == null) {
			_chkBeforeScreenTran = new MCColumnConfig[] {
					columnRslt_rcpt_iv_no,
					columnRslt_purc_schd_dt,
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
					columnRslt_slo_ptax_xrate
			};
		}
		return _chkBeforeScreenTran;
	}

	
	protected MCColumnConfig[] _chkBeforeScreenTran = null;

	protected MCColumnConfig[] _chkScreenTran = null;
	
	/**
	 * RsltTableの同時選択可能な行選択用の配列
	 */
	protected MCColumnConfig[] getSelectableRowForIntrm() {

		if (_selectableRow == null) {
			_selectableRow = new MCColumnConfig[] {
					columnRslt_in_to_id_typ,
					columnRslt_in_to_id_cd,
					columnRslt_in_to_id_nm,
					columnRslt_in_to_zip_cd,
					columnRslt_in_to_addr1,
					columnRslt_in_to_addr2,
					columnRslt_in_to_addr3,
					columnRslt_in_to_addr4,
					columnRslt_in_to_tel,
					columnRslt_in_to_fax,
					columnRslt_in_to_cntct_psn,
					columnRslt_in_to_cntct_dpt,
					columnRslt_in_to_cntry_cd,
					columnRslt_sppl_cd,
					columnRslt_trd_cur_cd,
					columnRslt_slo_cur_cd,
					columnRslt_cst_cd,
					columnRslt_slo_tterm_cd1,
					columnRslt_slo_tterm_cd2,
					columnRslt_slo_tterm_cd3,
					columnRslt_sls_basis_typ,
					columnRslt_slo_trd_ptn_typ,
			};
		}
		return _selectableRow;
	}

	/**
	 * RsltTableの同時選択可能な行選択用
	 * (値が一致する場合は選択可能とするカラム)
	 */
	protected MCColumnConfig[] _selectableRow = null;
	
	/**
	 * RsltTableの相似条件(背景色色分け用)<br>
	 */
	protected MCColumnConfig[] getSimilarityCndRow() {

		if (_similarityCndRow == null) {
			_similarityCndRow = new MCColumnConfig[] {
					// 同時選択不可
					columnRslt_in_to_id_typ,
					columnRslt_in_to_id_cd,
					columnRslt_in_to_id_nm,
					columnRslt_in_to_zip_cd,
					columnRslt_in_to_addr1,
					columnRslt_in_to_addr2,
					columnRslt_in_to_addr3,
					columnRslt_in_to_addr4,
					columnRslt_in_to_tel,
					columnRslt_in_to_fax,
					columnRslt_in_to_cntct_dpt,
					columnRslt_in_to_cntct_psn,
					columnRslt_in_to_cntry_cd,
					columnRslt_sppl_cd,
					columnRslt_trd_cur_cd,
					columnRslt_slo_cur_cd,
					columnRslt_cst_cd,
					columnRslt_slo_tterm_cd1,
					columnRslt_slo_tterm_cd2,
					columnRslt_slo_tterm_cd3,
					columnRslt_sls_basis_typ,
					columnRslt_slo_trd_ptn_typ,
					// 値が異なる場合は引継されない項目
					columnRslt_rcpt_iv_no,
					columnRslt_purc_schd_dt,
					columnRslt_purc_tterm_cd1,
					columnRslt_purc_tterm_rmrks1,
					columnRslt_purc_tterm_cd2,
					columnRslt_purc_tterm_rmrks2,
					columnRslt_purc_tterm_cd3,
					columnRslt_purc_tterm_rmrks3,
					columnRslt_trd_rmrks,
					columnRslt_po_print_rmrks,
					columnRslt_xrate_inpt_flg,
					columnRslt_xrate,
					columnRslt_ptax_xrate_inpt_flg,
					columnRslt_ptax_xrate,
					columnRslt_trnspt_cd,
					columnRslt_vssl_flght,
					columnRslt_load_port_cd,
					columnRslt_etd_dt,
					columnRslt_dschrg_port_cd,
					columnRslt_eta_dt,
					columnRslt_via_port_cd,
					columnRslt_via_schd_dt,
					columnRslt_slo_tterm_rmrks1,
					columnRslt_slo_tterm_rmrks2,
					columnRslt_slo_tterm_rmrks3,
					columnRslt_slo_xrate,
					columnRslt_slo_ptax_xrate
			
			};
		}
		return _similarityCndRow;
	}

	/**
	 * RsltTableの相似条件(背景色色分け用)<br>
	 * (値が一致しない場合に色分けする)
	 */
	protected MCColumnConfig[] _similarityCndRow = null;
	
	/** 差異箇所のセル背景色 */
	protected Color _differenceBgColor = getPgmSettingColor(
			MSBEP_RcptIvTrgtSel.class, "color.difference_bg");
	
	/** sim_cnd_grp_noのソートタイプ保持用 */
	protected SortType _sortTypeSimCndGrpNo = MCList.SortType.ASC;
	//FMCB CUSTOM_FIELD END

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_RcptIvTrgtSel_MC() {
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
	public MSBEP_RcptIvTrgtSel_MC(String name) {
		super(name);
		//コンストラクタのカスタマイズ処理はこの間に記述してください。
		//FMCB CUSTOM_CONSTRUCTOR_LIST START

		//FMCB CUSTOM_CONSTRUCTOR_LIST END
	}

	//画面処理メソッドはこれより下に定義してください。
	//FMCB CUSTOM_METHOD START

	/**
	 * [MS_MSBEL2200_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2200_Srch01Caller<P extends MSBEP_RcptIvTrgtSel, B extends MS_MSBEL2200_Srch01Bridge> extends mcframe.clientMAUD.MAUDP0010.MAUDP_Searcher<P, B> {

		protected MS_MSBEL2200_Srch01Caller(P p, B b) {
			super(p, b);
		}
		
		@Override
		protected void checkForCallStack(MCMessageList msgList) {
			super.checkForCallStack(msgList);
			checkForCallStackSub(msgList);
		}
		
		@Override
		protected void setMode() {
			super.setMode();
			setRefStatus();
		}
		
		@Override
		protected void setModeNoDown() {
			super.setModeNoDown();
			setSrchStatus();
		}
		
		/**
		 * 検索前チェック処理
		 */
		protected void checkForCallStackSub(MCMessageList msgList) {
			msgList.addAll(checkAtLeastOne(PrStsTypPanel));
			msgList.addAll(checkBeforeAfter(Cnd_purc_schd_dt_fr, Cnd_purc_schd_dt_to));
		}
		
	}


	/**
	 * Panel[Ctrl]のボタン[ctrl_Ope_srch]の押下時の処理
	 */
	@Override
	public void doCtrl_ctrl_Ope_srch(MCEventInfo info) {
		callMS_MSBEL2200_Srch01();
	}
	/**
	 * Panel[Btn]のボタン[open_MSBEP2210]の押下時の処理
	 */
	@Override
	public void doBtn_open_MSBEP2210(MCEventInfo info) {
		MCList<RsltR> rL = getRsltL().subList(RsltR.$check, true);
		String strForLog = new String();
		String strMixNullLog = "";
		boolean isMixPurcBasisTyp = false;

		if (isNull(rL)) {
			dialog(msgNoSelectedRow());
			return;
		}

		MCMessageList msgL = new MCMessageList();
		
		// ２段階で１つのRowに絞込む
		// [Step1] 入力可能項目も含めたGroupBy
		// [Step2] Step1の結果が複数件あった場合は、各カラムで値が異なるかのチェックを行う。
		// -> 値が異なる場合はnullをセットする
		// [Step3] bindのセット
		MCRow bind = MCRow.create();

		MCGroupByPolicy gp1 = new MCGroupByPolicy(getStrFromColumn(getChkScreenTran()));
		MCList<RsltR> r1L = rL.groupBy(gp1);

		if (r1L.size() == 1) {

			setBind(bind, r1L.get(0));
		}
		else if (r1L.size() > 1) {

			// 仕入計上区分「入荷基準」を優先する
			r1L.sort(RsltR.$purc_basis_typ);
			// cols に指定されている項目については、設定されているものを優先する
			RsltR baseR = r1L.get(0).clone();
			String[] cols = {RsltR.$purc_schd_dt, RsltR.$rcpt_iv_no};
			for (RsltR r : r1L) {
				for (String s : cols) {
					if (isNull(baseR.getValue(s)) && !isNull(r.getValue(s))) {
						baseR.setValue(s, r.getValue(s));
					}
				}
			}
			
			for (MCColumnConfig conf : getChkBeforeScreenTran()) {

				String s = conf.getBaseRowColumnName();

				for (RsltR r : r1L) {
					
					// 既に比較によりbaseRにnullがセットされている場合はスキップ
					if (isNull(baseR.getValue(s))) {
						continue;
					}
					
					if (conf == columnRslt_purc_schd_dt) {
						if (!isNull(r.getValue(s))
								&& !isSame(baseR.purc_schd_dt(), r.getValue(s))
								&& MAC_PURC_BASIS_TYP.isARR_BASIS(baseR.purc_basis_typ())) {
							if (!isMixPurcBasisTyp) {
								MCMessage msg = new MCMessage(MSBEP0041);
								msgL.add(msg);
							}
							isMixPurcBasisTyp = true;
							continue;
						}
					}
					
					if (conf == columnRslt_purc_schd_dt
						|| conf == columnRslt_rcpt_iv_no) {
						if (!isNull(baseR.getValue(s)) && isNull(r.getValue(s))) {
							String isMixNullCol = "isMixNull_" + s;
							if (!baseR.getBooleanNE(isMixNullCol) && !isMixPurcBasisTyp) {
								strMixNullLog = strMixNullLog
									 + (!isNull(strMixNullLog) ? " / " : "") + conf.getHeaderName();
							}
							baseR.setBooleanNE(isMixNullCol, true);
							continue;
						}
					}
					
					if (!isSame(baseR.getValue(s), r.getValue(s))) {
						baseR.clear(s);
						if (strForLog.length() > 0) {
							strForLog = strForLog + " / ";
						}
						String headerName = conf.getHeaderName();
						strForLog = strForLog + headerName;
					}
				}
			}

			setBind(bind, baseR);
		}

		if (!isNull(strMixNullLog)) {
			MCMessage msg = new MCMessage(MSBEP0009, strMixNullLog);
			msgL.add(msg);
		}
		if (!isNull(strForLog)) {
			MCMessage msg = new MCMessage(MSBEP0006, strForLog);
			msgL.add(msg);
		}
		if (msgL.size() > 0) {
			message(msgL, MCFrameType.SYSTEM_MODAL);
		}
		MCList<Cnd2R> aL = MCList.create(Cnd2R.class);
		for (RsltR r : rL) {
			Cnd2R aR = aL.add();
			aR.purc_schd_no(r.purc_schd_no());
			aR.arr_schd_no(r.arr_schd_no());
			aR.arr_act_no(r.arr_act_no());
			aR.bndl_tgt_flg(r.bndl_tgt_flg());
		}

		openPanel("MS", "MSBEP2210", T1, bind, aL, RsltTable);
	}
	
	/**
	 * 画面遷移時にバインド値を渡す際のRowを作成します
	 * @param bind
	 * @param rsltR
	 */
	protected void setBind(MCRow bind, RsltR rR) {
		bind.addStringColumn("rcpt_iv_no", rR.rcpt_iv_no());
		if (Cnd_srch_mode_ARR_SCHD.isSelected()) {
			bind.addStringColumn("rcpt_iv_src_typ", MSC_RCPT_IV_SRC_TYP.ARR_SCHD.value());
			bind.addStringColumn("rcpt_iv_src_typ_nm", MSC_RCPT_IV_SRC_TYP.ARR_SCHD.name());
		}
		else {
			bind.addStringColumn("rcpt_iv_src_typ", MSC_RCPT_IV_SRC_TYP.ARR_ACT.value());
			bind.addStringColumn("rcpt_iv_src_typ_nm", MSC_RCPT_IV_SRC_TYP.ARR_ACT.name());
		}
		bind.addStringColumn("trd_cd", rR.trd_cd());
		bind.addStringColumn("trd_nm", rR.trd_nm());
		bind.addDateColumn("purc_schd_dt", rR.purc_schd_dt());
		bind.addStringColumn("sppl_cd", rR.sppl_cd());
		bind.addStringColumn("sppl_nm", rR.sppl_nm());
		bind.addBooleanColumn("pay_spot_flg", rR.pay_spot_flg());
		bind.addStringColumn("prnt_lcl_cd", rR.prnt_lcl_cd());
		bind.addStringColumn("purc_amt_rnd_typ", rR.purc_amt_rnd_typ());
		bind.addStringColumn("purc_tax_rnd_typ", rR.purc_tax_rnd_typ());
		bind.addStringColumn("in_to_id_typ", rR.in_to_id_typ());
		bind.addStringColumn("in_to_id_typ_nm", rR.in_to_id_typ_nm());
		bind.addStringColumn("in_to_id_cd", rR.in_to_id_cd());
		bind.addStringColumn("in_to_id_nm", rR.in_to_id_nm());
		bind.addStringColumn("sppl_to_cntct_dpt", rR.in_to_cntct_dpt());
		bind.addStringColumn("sppl_to_cntct_psn", rR.in_to_cntct_psn());
		bind.addStringColumn("sppl_to_zip_cd", rR.in_to_zip_cd());
		bind.addStringColumn("sppl_to_addr1", rR.in_to_addr1());
		bind.addStringColumn("sppl_to_addr2", rR.in_to_addr2());
		bind.addStringColumn("sppl_to_addr3", rR.in_to_addr3());
		bind.addStringColumn("sppl_to_addr4", rR.in_to_addr4());
		bind.addStringColumn("sppl_to_tel", rR.in_to_tel());
		bind.addStringColumn("sppl_to_fax", rR.in_to_fax());
		bind.addStringColumn("sppl_to_cntry_cd", rR.in_to_cntry_cd());
		bind.addStringColumn("sppl_to_cntry_nm", rR.in_to_cntry_nm());
		bind.addStringColumn("trd_cur_cd", rR.trd_cur_cd());
		bind.addStringColumn("trd_cur_nm", rR.trd_cur_nm());
		bind.addNumberColumn("trd_cur_amt_dec_place", rR.trd_amt_dec_place());
		bind.addNumberColumn("trd_cur_upri_dec_place", rR.trd_upri_dec_place());
		bind.addBooleanColumn("xrate_inpt_flg", rR.xrate_inpt_flg());
		bind.addNumberColumn("xrate", rR.xrate());
		bind.addStringColumn("ptax_cur_cd", rR.ptax_cur_cd());
		bind.addStringColumn("ptax_cur_nm", rR.ptax_cur_nm());
		bind.addNumberColumn("ptax_cur_amt_dec_place", rR.ptax_amt_dec_place());
		bind.addNumberColumn("ptax_cur_upri_dec_place", rR.ptax_upri_dec_place());
		bind.addNumberColumn("ptax_xrate", rR.ptax_xrate());
		bind.addBooleanColumn("ptax_xrate_inpt_flg", rR.ptax_xrate_inpt_flg());
		bind.addStringColumn("base_cur_cd", rR.base_cur_cd());
		bind.addStringColumn("base_cur_nm", rR.base_cur_nm());
		bind.addNumberColumn("base_cur_amt_dec_place", rR.base_amt_dec_place());
		bind.addNumberColumn("base_cur_upri_dec_place", rR.base_upri_dec_place());
		bind.addStringColumn("trnspt_cd", rR.trnspt_cd());
		bind.addStringColumn("trnspt_nm", rR.trnspt_nm());
		bind.addStringColumn("vssl_flght", rR.vssl_flght());
		bind.addStringColumn("load_port_cd", rR.load_port_cd());
		bind.addStringColumn("load_port_nm", rR.load_port_nm());
		bind.addDateColumn("etd_dt", rR.etd_dt());
		bind.addStringColumn("dschrg_port_cd", rR.dschrg_port_cd());
		bind.addStringColumn("dschrg_port_nm", rR.dschrg_port_nm());
		bind.addDateColumn("eta_dt", rR.eta_dt());
		bind.addStringColumn("via_port_cd", rR.via_port_cd());
		bind.addStringColumn("via_port_nm", rR.via_port_nm());
		bind.addDateColumn("via_schd_dt", rR.via_schd_dt());
		bind.addStringColumn("tterm_cd1", rR.purc_tterm_cd1());
		bind.addStringColumn("tterm_nm1", rR.purc_tterm_nm1());
		bind.addStringColumn("tterm_rmrks1", rR.purc_tterm_rmrks1());
		bind.addStringColumn("tterm_cd2", rR.purc_tterm_cd2());
		bind.addStringColumn("tterm_nm2", rR.purc_tterm_nm2());
		bind.addStringColumn("tterm_rmrks2", rR.purc_tterm_rmrks2());
		bind.addStringColumn("tterm_cd3", rR.purc_tterm_cd3());
		bind.addStringColumn("tterm_nm3", rR.purc_tterm_nm3());
		bind.addStringColumn("tterm_rmrks3", rR.purc_tterm_rmrks3());
		bind.addStringColumn("trd_rmrks", rR.trd_rmrks());
		bind.addStringColumn("po_print_rmrks", rR.po_print_rmrks());
		bind.addStringColumn("cst_cd", rR.cst_cd());
		bind.addStringColumn("cst_nm", rR.cst_nm());
		bind.addStringColumn("sls_basis_typ", rR.sls_basis_typ());
		bind.addStringColumn("sls_basis_typ_nm", rR.sls_basis_typ_nm());
		bind.addStringColumn("slo_trd_ptn_typ", rR.slo_trd_ptn_typ());
		bind.addStringColumn("slo_trd_ptn_typ_nm", rR.slo_trd_ptn_typ_nm());
		bind.addStringColumn("slo_cur_cd", rR.slo_cur_cd());
		bind.addStringColumn("slo_cur_nm", rR.slo_cur_nm());
		bind.addNumberColumn("slo_xrate", rR.slo_xrate());
		bind.addNumberColumn("slo_ptax_xrate", rR.slo_ptax_xrate());
		bind.addStringColumn("slo_tterm_cd1", rR.slo_tterm_cd1());
		bind.addStringColumn("slo_tterm_nm1", rR.slo_tterm_nm1());
		bind.addStringColumn("slo_tterm_rmrks1", rR.slo_tterm_rmrks1());
		bind.addStringColumn("slo_tterm_cd2", rR.slo_tterm_cd2());
		bind.addStringColumn("slo_tterm_nm2", rR.slo_tterm_nm2());
		bind.addStringColumn("slo_tterm_rmrks2", rR.slo_tterm_rmrks2());
		bind.addStringColumn("slo_tterm_cd3", rR.slo_tterm_cd3());
		bind.addStringColumn("slo_tterm_nm3", rR.slo_tterm_nm3());
		bind.addStringColumn("slo_tterm_rmrks3", rR.slo_tterm_rmrks3());
	}
	
	// -----------------------------------------------
	// init
	
	@Override
	protected void setupParts() {
		super.setupParts();
		// 取引単価
		Rslt_trd_cur_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_proc_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		Rslt_trd_cur_onr_prov_upri_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_upri_dec_place);
		// 取引金額
		Rslt_trd_cur_dscnt_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_proc_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_onr_prov_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_inc_ctax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
		Rslt_trd_cur_tax_amt_p_PPanel.setRelateBeans(columnRslt_trd_cur_cd, columnRslt_trd_amt_dec_place);
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
		
		// 品目分類
		Rslt_itm_grp_p_PPanel.setRelateBeans(Cnd_itm_grp_p_PPanel);
		
		// 発注先分類
		Rslt_bp_grp_p_PPanel.setRelateBeans(Cnd_bp_grp_p_PPanel);
	}
	
	@Override
	protected void linkBeansToISPanel() {
		super.linkBeansToISPanel();
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$i_sppl_flg , true);
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_maker_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_cst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_acst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_bcst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_rcst_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_dlv_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_dest_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_cred_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_sppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_asppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_bsppl_flg , MCMode.READ_ONLY.getName());
		getCnd_sppl_cd_ListPutter().putBind(BpCols.$m_psppl_flg , MCMode.READ_ONLY.getName());
	}
	@Override
	public void setOpenFocus() {
		super.setOpenFocus();
		FoldTab.focusActiveFirstComponent();
	}
	
	@Override
	protected void valueInit() {
		super.valueInit();
		
		valueInitSub();
	}
	
	/**
	 * 画面のデフォルト値を設定する。
	 */
	protected void valueInitSub() {
		
		setValueEx(Cnd_srch_mode_Group, Cnd_srch_mode_ARR_SCHD.getActionCommand());
		Cnd_srch_mode_Group.doNC();
	}
	
	@Override
	public void doCnd_srch_mode_NC(MCEventInfo info) {
		super.doCnd_srch_mode_NC(info);
		
		clearContainers(getRsltL());
		
		clearCnd();
		
		setSrchStatus();
	}
	
	/**
	 * 検索モードに応じて、検索条件をクリアする。
	 */
	protected void clearCnd() {
		
		if (Cnd_srch_mode_ARR_SCHD.isSelected()) {
			
			setBoolean(PrStsTypPanel, true);
			
			setValueEx(Cnd_arr_dt_fr, null);
			setValueEx(Cnd_arr_hm_fr, null);
			setValueEx(Cnd_arr_dt_to, null);
			setValueEx(Cnd_arr_hm_to, null);
			
			setValueEx(Cnd_rcpt_iv_no, null);
			setValueEx(Cnd_arr_act_no, null);
		}
		else if (Cnd_srch_mode_ARR_ACT.isSelected()) {
			
			setValueEx(Cnd_not_arr_flg, false);
			setValueEx(Cnd_part_arr_flg, true);
			setValueEx(Cnd_arr_flg, true);
		}
	}
	
	/**
	 * 検索モードに対応する検索ステータスに設定する。
	 */
	protected void setSrchStatus() {
		
		if (Cnd_srch_mode_ARR_SCHD.isSelected()) {
			setSRCHStatus();
		}
		else if (Cnd_srch_mode_ARR_ACT.isSelected()) {
			setSRCH_ARR_ACTStatus();
		}
		
		FoldTab.focusActiveFirstComponent();
		Ctrl_ctrl_PPanel.expand(true);
	}
	
	/**
	 * 検索モードに対応する参照ステータスに設定する。
	 */
	protected void setRefStatus() {
		
		if (Cnd_srch_mode_ARR_SCHD.isSelected()) {
			setREFStatus();
		}
		else if (Cnd_srch_mode_ARR_ACT.isSelected()) {
			setREF_ARR_ACTStatus();
		}
		
		RsltTable.selectLeftmostColumn(0);
		Ctrl_ctrl_PPanel.expand(false);
	}
	// -----------------------------------------------
	// events
	
	@Override
	public void doRslt_check_NC(MCEventInfo info) {
		super.doRslt_check_NC(info);
		checkSelectable(info);
	}
	

	
	protected void checkSelectable(MCEventInfo info) {
		MCList<RsltR> chkL = getRsltL().subList(RsltR.$check, true);

		// 選択行が０行の場合
		if (chkL.size() == 0) {
			
			getRsltL().setBooleanNE(RsltR.$selectable_flg, true);
			Btn_open_MSBEP2210.setMode(MCMode.DISABLE);
			return;
		}
		else {
			RsltR selectedR = chkL.get(0);

			for (RsltR rR : getRsltL()) {
				
				boolean selectable = false;
				selectable = checkSelectable(rR, selectedR, getSelectableRowForIntrm());
				rR.selectable_flg(selectable);
			}

			Btn_open_MSBEP2210.setMode(MCMode.ENABLE);
		}
		
		RsltR selR = getRsltL().get(info.getEventIndex());

		// グループ単位でチェックする場合
		if (getBtnR().chk_by_grp_no_flg()) {
			
			MCList<RsltR> subL = RsltTable.getViewRows().subList(RsltR.$sim_cnd_grp_no, selR.sim_cnd_grp_no()); // フィルタを考慮（表示されているものにのみ設定）
			subL.setBoolean(RsltR.$check, selR.check());
			
			// チェックをオフにした結果、全てがオフになった場合
			if (!selR.check() && getRsltL().subList(RsltR.$check, true).isEmpty()) {
				getRsltL().setBooleanNE(RsltR.$selectable_flg, true);
			}
		}
		
		checkSelectableForArrBasis(chkL);
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
			bndlL.forEach(rr -> {
				setValueEx(columnRslt_check, rr.getGUIIndex(), Boolean.TRUE);
			});
		}
	}
	protected MCList<RsltR> getBndlGrpL(RsltR rsltR) {
		// 選択可能行からまとめ対象を取得
		return getRsltL().subList(r -> 
			r.selectable_flg()
				&& isColSame(r, rsltR, getBndlGrpKey())
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
	// sort
	/**
	 * ソート<br>
	 * クリックされたカラムのソートを、sim_cnd_grp_noのまとまりを崩さずにソートする
	 */
	@Override
	public boolean sort(MCTable<?> table, MCSortPolicy policy) {
		
		boolean ans;

		if (table == RsltTable && !getRsltL().isEmpty() && policy.size() > 0) {

			String[] cols = policy.nameArray();
			SortType[] types = policy.typeArray();

			if (isSame(cols[0], RsltR.$sim_cnd_grp_no)) {

				ans = super.sort(table, policy);
				_sortTypeSimCndGrpNo = types[0];
			}
			else {

				// Policyの置換
				MCSortPolicy newPolicy = new MCSortPolicy();

				// ソートの最優先にsim_cnd_grp_noをセットする
				newPolicy.add(_sortTypeSimCndGrpNo, RsltR.$sim_cnd_grp_no);

				for (int i = 0; i < policy.size(); i++) {
					newPolicy.add(types[i], cols[i]);
				}

				// newPolicyでソート
				ans = super.sort(table, newPolicy);
			}
		}
		else {

			ans = super.sort(table, policy);
		}

		return ans;
	}
	
	// -----------------------------------------------
	// CellConfig
	
	@Override
	protected void setCellConfig() {
		super.setCellConfig();
		RsltTable.setCellConfig(crtRsltCellConfig());
	}

	protected RsltCellConfig crtRsltCellConfig() {
		return new RsltCellConfig();
	}

	protected class RsltCellConfig extends MAUDP_CellConfig {
		
		@Override
		public MCMode getPriorMode(int index, MCColumnConfig column, MCTable table) {
			if (columnRslt_check == column
				|| columnRslt_bndl_tgt_flg == column) {

				RsltR r = RsltTable.getRow(index);

				// 選択可能フラグがfalseの場合
				if (!r.selectable_flg()) {
					return MCMode.READ_ONLY;
				}
			}
			
			return super.getPriorMode(index, column, table);
		}
		
		@Override
		public Color getPriorBG(int index, MCColumnConfig column, MCTable table, MCMode mode) {
			// 現在のカラム値と1つ上のRowのカラム値が異なる場合は背景色を変える
			if (index != 0) {

				if (MCCollectionUtil.contains(column, getSimilarityCndRow())) {

					// カラム名の取得
					String colNm = column.getBaseRowColumnName();

					// 現在のカラム値と1つ上のRowのカラム値を取得
					Comparable<?> c0 = RsltTable.getRow(index).getValueNE(colNm);
					Comparable<?> c1 = RsltTable.getRow(index - 1).getValueNE(colNm);

					if (!isSame(c0, c1)) {
						return _differenceBgColor;
					}
				}
			}

			// RsltTableのsim_cnd_grp_noの奇数、偶数で背景色を決定する
			RsltR r = RsltTable.getRow(index);
			MCNumber rem = r.sim_cnd_grp_no().remainder(2);

			if (isSame(rem, MCNumber.ZERO)) {
				// 奇数行の背景色
				return getOddCellBackground(column, table, mode);
			}
			else {
				// 偶数行の背景色
				return getEvenCellBackground(column, table, mode);
			}
		}
		
	}
	
	// -----------------------------------------------
	
	/**
	 * 引数の２つのRowを指定カラム(_selectableRow)で比較し、<br>
	 * 同じ場合はtrueを返し、異なる場合はfalseを返します。
	 * @param r1 RsltR
	 * @param r2 RsltR
	 * @param confs[] :比較するカラム名のColumnConfig配列
	 * 
	 * @return boolean
	 */
	protected boolean checkSelectable(RsltR r1, RsltR r2, MCColumnConfig[] confs) {
		int cnt = 0;
		for (MCColumnConfig conf : confs) {

			String s = conf.getBaseRowColumnName();

			// 型チェック
			if (conf.getDataType() == MCDataType.STRING) {

				if (!isSame(r1.getStringNE(s), r2.getStringNE(s))) {
					cnt++;
					break;
				}
			}
			else if (conf.getDataType() == MCDataType.NUMBER) {

				if (!isSame(r1.getNumberNE(s), r2.getNumberNE(s))) {
					cnt++;
					break;
				}
			}
		}

		if (cnt == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
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
	
	protected void checkSelectableForArrBasis(MCList<RsltR> chkL) {
		// 仕入計上区分「入荷基準」の場合は仕入予定日が同一の場合のみ選択チェックを入力可にする
		RsltR arrBasisR = chkL.getFirst(RsltR.$purc_basis_typ, MAC_PURC_BASIS_TYP.ARR_BASIS.value());
		if (isNull(arrBasisR)) {
			return;
		}
		else {
			for (RsltR rsltR : getRsltL()) {
				if (MAC_PURC_BASIS_TYP.isARR_BASIS(rsltR.purc_basis_typ())) {
					if (!isSame(arrBasisR.purc_schd_dt(), rsltR.purc_schd_dt())) {
						rsltR.selectable_flg(false);
					}
				}
			}
		}
	}

}