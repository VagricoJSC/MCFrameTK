package mcframe.serverMSBG.MSBGL0100;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMSBG.MSBGL0100.Query.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArLedgerSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArLedgerSrch_MC extends MSBGL_ArLedgerSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛元帳の情報（売掛残高情報、売上・入金の請求明細、手形の情報）を取得する<br>
	 */
	public class Srch01 extends MSBGL_ArLedgerSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			editCnd();

			up0().addStringColumn("WRK_NULL_FLG_STR", toTrueStr(up0().wrk_null_flg()));
			MCQueryPlan sql = MSBGL0100_MST_MLY_AR_BAL_S01();
			executeQuery(down0(), sql, up0());
			
			// 売上の請求明細の取得
			up0().setStringNE("BILL_D_TYP", MSC_BILL_D_TYP.SLS.value());
			MCQueryPlan slsSql = MSBGL0100_MST_BILL_D_S01();
			MCList<Srch01_Dtl1R> billDL = MCList.create(Srch01_Dtl1R.class);
			MCList<Srch01_Dtl1R> parL = null;
			executeQuery(billDL, slsSql, up0());
			
			String[] cols = {Srch01_Dtl1R.$ac_dt,
					Srch01_Dtl1R.$bill_d_typ,
					Srch01_Dtl1R.$ar_typ,
					Srch01_Dtl1R.$acst_cd,
					Srch01_Dtl1R.$iv_no,
					Srch01_Dtl1R.$ar_dpt_cd,
					Srch01_Dtl1R.$wg_cd,
					Srch01_Dtl1R.$wrk_no};
			MCList<Srch01_Dtl1R>[] billDLists = billDL.groupList(cols);
			MCIndexKey billDLidxKey = null;
			
			for (MCList<Srch01_Dtl1R> l : billDLists) {
				parL = MCList.create(Srch01_Dtl1R.class);
				billDLidxKey = l.createIndex(Srch01_Dtl1R.$bill_d_no);

				for (Srch01_Dtl1R r : l) {
					if (l.subList(billDLidxKey, r.crryovr_src_bill_d_no()).size() == 0) {
						parL.add(r);
					}
				}

				MCList<Srch01_Dtl1R> chdL = null;
				for (Srch01_Dtl1R r : parL) {
					chdL = MCList.create(Srch01_Dtl1R.class);
					setChdL(r, chdL, l);
					if (isFW(r, chdL)
							|| (chdL.size() == 1 && isSame(r, chdL.get(0)))) {
						down1().addAll(chdL);
					}
					else {
						down1().add(r);
					}
				}
			}
			
			down1().sort(Srch01_Dtl1R.$ac_dt, Srch01_Dtl1R.$act_no,
					Srch01_Dtl1R.$act_seq, Srch01_Dtl1R.$act_d_no);
			
			// 入金の請求明細の取得
			up0().setStringNE("BILL_D_TYP", MSC_BILL_D_TYP.RCV.value());
			MCQueryPlan rcvSql = MSBGL0100_MST_BILL_D_S01();
			MCList<Srch01_Dtl2R> tmp = MCList.create(Srch01_Dtl2R.class);
			executeQuery(tmp, rcvSql, up0());
			
			//消費税差額、請求残高振替(+)は売上の請求明細に移動
			for(Srch01_Dtl2R r : tmp){
				if(MAC_TRD_PTN_TYP.isTAX_DIFF_BILL_CL(r.trd_ptn_typ())
					|| MAC_TRD_PTN_TYP.isARSW_IN_BILL_BAL(r.trd_ptn_typ())){
					Srch01_Dtl1R dtl1R = Srch01_Dtl1R.create();
					
					dtl1R.ac_dt(r.ac_dt());
					dtl1R.bill_d_typ(r.bill_d_typ());
					dtl1R.slip_sts_typ(r.slip_sts_typ());
					dtl1R.slip_sts_typ_nm(r.slip_sts_typ_nm());
					dtl1R.trd_cd(r.trd_cd());
					dtl1R.trd_nm(r.trd_nm());
					dtl1R.trd_ptn_typ(r.trd_ptn_typ());
					dtl1R.ar_typ(r.ar_typ());
					dtl1R.ar_typ_nm(r.ar_typ_nm());
					dtl1R.act_no(r.act_no());
					dtl1R.act_rev(r.act_rev());
					dtl1R.act_seq(r.act_seq());
					dtl1R.act_d_no(r.act_d_no());
					dtl1R.act_d_seq(r.act_d_seq());
					dtl1R.iv_no(r.iv_no());
					dtl1R.wrk_no(r.wrk_no());
					dtl1R.wrk_nm(r.wrk_nm());
					dtl1R.itm_cd(r.itm_cd());
					dtl1R.itm_sub1(r.itm_sub1());
					dtl1R.itm_sub2(r.itm_sub2());
					dtl1R.itm_sub3(r.itm_sub3());
					dtl1R.itm_nm(r.itm_nm());
					dtl1R.sno1(r.sno1());
					dtl1R.sno2(r.sno2());
					dtl1R.sno3(r.sno3());
					dtl1R.sno4(r.sno4());
					dtl1R.sno4(r.sno4());
					dtl1R.sls_wrk_no(r.sls_wrk_no());
					dtl1R.sls_wrk_nm(r.sls_wrk_nm());
					dtl1R.trd_unit_cd(r.trd_unit_cd());
					dtl1R.trd_unit_nm(r.trd_unit_nm());
					dtl1R.trd_unit_qty(r.trd_unit_qty());
					dtl1R.trd_dec_place(r.trd_dec_place());
					dtl1R.base_unit_cd(r.base_unit_cd());
					dtl1R.base_unit_nm(r.base_unit_nm());
					dtl1R.base_unit_qty(r.base_unit_qty());
					dtl1R.base_dec_place(r.base_dec_place());
					dtl1R.inc_tax_flg(r.inc_tax_flg());
					dtl1R.interim_flg(r.interim_flg());
					dtl1R.trd_cur_upri(r.trd_cur_upri());
					dtl1R.trd_cur_amt(r.trd_cur_amt());
					dtl1R.trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt());
					dtl1R.base_cur_upri(r.base_cur_upri());
					dtl1R.base_cur_amt(r.base_cur_amt());
					dtl1R.base_cur_inc_tax_amt(r.base_cur_inc_tax_amt());
					dtl1R.tax_cd(r.tax_cd());
					dtl1R.tax_nm(r.tax_nm());
					dtl1R.tax_rate(r.tax_rate());
					dtl1R.trd_cur_tax_amt(r.trd_cur_tax_amt());
					dtl1R.trd_cur_dscnt_amt(r.trd_cur_dscnt_amt());
					dtl1R.base_cur_tax_amt(r.base_cur_tax_amt());
					dtl1R.base_cur_dscnt_amt(r.base_cur_dscnt_amt());
					dtl1R.acst_cd(r.acst_cd());
					dtl1R.acst_nm(r.acst_nm());
					dtl1R.ar_dpt_cd(r.ar_dpt_cd());
					dtl1R.ar_dpt_nm(r.ar_dpt_nm());
					dtl1R.wg_cd(r.wg_cd());
					dtl1R.wg_nm(r.wg_nm());
					dtl1R.cst_cd(r.cst_cd());
					dtl1R.cst_nm(r.cst_nm());
					dtl1R.dlv_cd(r.dlv_cd());
					dtl1R.dlv_nm(r.dlv_nm());
					dtl1R.dest_cd1(r.dest_cd1());
					dtl1R.dest_nm1(r.dest_nm1());
					dtl1R.dest_cd2(r.dest_cd2());
					dtl1R.dest_nm2(r.dest_nm2());
					dtl1R.dest_cd3(r.dest_cd3());
					dtl1R.dest_nm3(r.dest_nm3());
					dtl1R.sls_dpt_cd(r.sls_dpt_cd());
					dtl1R.sls_dpt_nm(r.sls_dpt_nm());
					dtl1R.sls_usr_cd(r.sls_usr_cd());
					dtl1R.sls_usr_nm(r.sls_usr_nm());
					dtl1R.slo_no(r.slo_no());
					dtl1R.slo_d_no(r.slo_d_no());
					dtl1R.cst_po_no(r.cst_po_no());
					dtl1R.cst_po_d_no(r.cst_po_d_no());
					dtl1R.dlv_slip_no(r.dlv_slip_no());
					dtl1R.dlv_slip_d_no(r.dlv_slip_d_no());
					dtl1R.ship_dlv_slip_no(r.ship_dlv_slip_no());
					dtl1R.ship_dlv_slip_d_no(r.ship_dlv_slip_d_no());
					dtl1R.ship_dlv_slip_multi_flg(r.ship_dlv_slip_multi_flg());
					dtl1R.ins_usr_id(r.ins_usr_id());
					dtl1R.ins_usr_nm(r.ins_usr_nm());
					dtl1R.ins_func_id(r.ins_func_id());
					dtl1R.ins_ts(r.ins_ts());
					dtl1R.upd_usr_id(r.upd_usr_id());
					dtl1R.upd_usr_nm(r.upd_usr_nm());
					dtl1R.upd_func_id(r.upd_func_id());
					dtl1R.upd_ts(r.upd_ts());
					dtl1R.upd_srv_req_no(r.upd_srv_req_no());
					dtl1R.acst_grp_cd1(r.acst_grp_cd1());
					dtl1R.acst_grp_nm1(r.acst_grp_nm1());
					dtl1R.acst_grp_cd2(r.acst_grp_cd2());
					dtl1R.acst_grp_nm2(r.acst_grp_nm2());
					dtl1R.acst_grp_cd3(r.acst_grp_cd3());
					dtl1R.acst_grp_nm3(r.acst_grp_nm3());
					dtl1R.acst_grp_cd4(r.acst_grp_cd4());
					dtl1R.acst_grp_nm4(r.acst_grp_nm4());
					dtl1R.acst_grp_cd5(r.acst_grp_cd5());
					dtl1R.acst_grp_nm5(r.acst_grp_nm5());
					dtl1R.acst_grp_cd6(r.acst_grp_cd6());
					dtl1R.acst_grp_nm6(r.acst_grp_nm6());
					dtl1R.acst_grp_cd7(r.acst_grp_cd7());
					dtl1R.acst_grp_nm7(r.acst_grp_nm7());
					dtl1R.acst_grp_cd8(r.acst_grp_cd8());
					dtl1R.acst_grp_nm8(r.acst_grp_nm8());
					dtl1R.acst_grp_cd9(r.acst_grp_cd9());
					dtl1R.acst_grp_nm9(r.acst_grp_nm9());
					dtl1R.acst_grp_cd10(r.acst_grp_cd10());
					dtl1R.acst_grp_nm10(r.acst_grp_nm10());

					down1().add(dtl1R);
				}
				else{
					down2().add(r);
				}
			}
			srchRcvActD();
		}
		protected void srchRcvActD() {
			// 売掛消込の入金実績明細ＮＯをもとに、入金実績を取得する
			MCList<Srch01_Dtl2R> rcvActDL = MCList.create(Srch01_Dtl2R.class);
			executeQuery(rcvActDL, MSBGL0100_MST_RCV_ACT_D_S01(), down2());
			
			// 入金実績を下り電文に設定する
			MCIndexKey idx = down2().createIndex(Srch01_Dtl2R.$act_d_no, Srch01_Dtl2R.$act_d_seq);
			for (Srch01_Dtl2R rcvActDR : rcvActDL) {
				Srch01_Dtl2R d3R = down2().getFirst(idx, rcvActDR.act_d_no(), rcvActDR.act_d_seq());
				if (!isNull(d3R)) {
					d3R.trd_cur_amt(rcvActDR.trd_cur_amt());
					d3R.setoff_amt(rcvActDR.setoff_amt());
					d3R.base_cur_amt(rcvActDR.base_cur_amt());
					d3R.base_cur_setoff_amt(rcvActDR.base_cur_setoff_amt());
				}
			}
		}
		
		protected void editCnd() {
			
			up0().addDateColumn("today", getToday());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			setArDptNm(up0(), down0());

			int rowNum = 1;
			for (Srch01_Dtl1R r : down1()) {
				// 売上の請求明細に行番号を設定
				r.row_num(rowNum);
				rowNum++;
				
				if(!isNull(up0().trd_cur_cd())){
					if (up0().sign_rivrs_flg()) {
						r.trd_cur_upri(r.trd_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						r.trd_cur_amt(r.trd_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_unit_qty(r.base_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						if (!isNull(r.trd_cur_dscnt_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_dscnt_amt, r.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
						}	
					}
					
				}

				else {
					if (up0().sign_rivrs_flg()) {
						r.base_cur_upri(r.base_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_unit_qty(r.base_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						r.base_cur_amt(r.base_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_cur_inc_tax_amt(r.base_cur_inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						if(!isNull(r.base_cur_dscnt_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_dscnt_amt, r.base_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
						}
					}
				
				}	
			}
		}

		protected void setArDptNm(Srch01_CndR cndR, Srch01_HdrR hdrR) {
			if (isNull(hdrR.ar_dpt_nm())) {
				MCRow r = MCRow.create();
				r.setStringNE(Srch01_CndR.$ar_dpt_cd, cndR.ar_dpt_cd());
				MSBGL_ArUtil.setLastDpt(r, Srch01_CndR.$ar_dpt_cd, Srch01_HdrR.$ar_dpt_nm);
				hdrR.ar_dpt_nm(r.getStringNE(Srch01_HdrR.$ar_dpt_nm));
			}
		}

		protected boolean isFW(Srch01_Dtl1R billDR, MCList<Srch01_Dtl1R> chdL) {
			boolean fwFlg = false;
			
			if(!isSame(billDR.trd_cur_inc_tax_amt(), chdL.sum(Srch01_Dtl1R.$trd_cur_inc_tax_amt))) {
				fwFlg = true;
			}
			
			return fwFlg;
		}

		protected void setChdL(Srch01_Dtl1R billDR, MCList<Srch01_Dtl1R> chdL, MCList<Srch01_Dtl1R> billDL) {
			MCIndexKey billDLidxKey = billDL.createIndex(Srch01_Dtl1R.$crryovr_src_bill_d_no);
			MCList<Srch01_Dtl1R> retL = billDL.subList(billDLidxKey, billDR.bill_d_no());
			
			if (isNull(retL)) {
				if(billDR.valid_flg()) {
					chdL.add(billDR);
				}
			}
			else {
				for (Srch01_Dtl1R r : retL) {
					setChdL(r, chdL, billDL);
				}
			}
		}
	}

	//FMCB CUSTOM END
}