package mcframe.serverMSBH.MSBHL0120;

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
import mcframe.serverMSBH.MSBHL0120.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBH.MSBHL0120.Query.*;
import mcframe.serverMAUC.MAUCL1060.MAUCL_TrdUtil;
import mcframe.serverMSBH.MSBHL5110.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverCore.util.MCDBUtil;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_ApLedgerSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_ApLedgerSrch_MC extends MSBHL_ApLedgerSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 買掛元帳の情報（買掛残高情報、仕入・支払情報）を取得する<br>
	 */
	public class Srch01 extends MSBHL_ApLedgerSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索条件の編集
			editCnd();
			// 合計部取得
			callApBalService();
			if (down0().isEmpty()) {
				return;
			}
			// 買掛明細
			executeQuery(down1(), MSBHL0120_MST_AP_D_S01(), up0());
			// 支払実績
			executeQuery(down2(), MSBHL0120_MST_PAY_ACT_D_S01(), up0());
		}
		
		/**
		 * 検索条件の編集
		 */
		protected void editCnd() {
			up0().addStringColumn("TMP_BASE_CUR_CD", getBaseCur().cur_cd());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			if (down0().isEmpty()) {
				return;
			}
			// 名称などの属性値を補完
			cmpl();
			// 検索結果の編集
			editList();
		}
		
		protected void editList() {
			super.editListMain();
			// 通貨情報を設定
			setCurInfo();
			
			// 返品・値引金額の符号反転
			signRvrs();
		}
		
		/**
		 * 名称などの属性値を補完
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected void cmpl() {
			setValuesDbc(up0(), down1());
			setValuesDbc(up0(), down2());
			
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itm_bldr = MCQueryApiBuilder.create(t);
			itm_bldr.setSelect(t.itm_nm);
			itm_bldr.addSelect(t.dscnt_itm_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itm_bldr, down1(), Srch01_Dtl1R.$itm_cd, Srch01_Dtl1R.$itm_sub1, Srch01_Dtl1R.$itm_sub2, Srch01_Dtl1R.$itm_sub3);
			for (Srch01_Dtl1R r : down1()) {
				// マスタ補完
				MAM_ITM_R itmR = _cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.dscnt_itm_flg(itmR.dscnt_itm_flg());
				if (isNull(r.itm_nm())) {
					r.itm_nm(itmR.itm_nm());
				}
			}
		}
		
		/**
		 * 合計欄の通貨情報を設定します
		 */
		protected void setCurInfo() {
			if (down0().isEmpty() && down1().isEmpty()) {
				return;
			}
			
			if (!isNull(up0().trd_cur_cd())) {
				MAM_CUR_R curR = MAM_CUR_R.create();
				MCQueryApiBuilder curR_bldr = MCQueryApiBuilder.create(MAM_CUR_R.create("T"));
				dbSelectKey("MSBHL0120_MAM_CUR_S01", curR, curR_bldr, up0().trd_cur_cd());
				down0().cur_cd(up0().trd_cur_cd());
				down0().amt_dec_place(curR.amt_dec_place());
				down0().upri_dec_place(curR.upri_dec_place());
			}
			else {
				down0().base_cur_cd(getBaseCur().cur_cd());
				down0().base_cur_nm(getBaseCur().cur_nm());
				
				down0().cur_cd(getBaseCur().cur_cd());
				down0().amt_dec_place(getBaseCur().amt_dec_place());
				down0().upri_dec_place(getBaseCur().upri_dec_place());
			}
		}
		
		/**
		 * 返品・値引金額の符号を反転させます
		 */
		protected void signRvrs() {
			int rowNum = 1;
			for (Srch01_Dtl1R r : down1()) {
				// 行番号を設定
				r.row_num(rowNum);
				rowNum++;
				
				if (up0().sign_rvrs_flg()) {
					if(!isNull(up0().trd_cur_cd())){
						r.trd_cur_upri(r.trd_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_unit_qty(r.trd_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
						r.trd_cur_amt(r.trd_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_cur_tax_amt(r.trd_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.trd_cur_inc_tax_amt(r.trd_cur_inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						if (!isNull(r.trd_cur_dscnt_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_dscnt_amt, r.trd_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
						}	
						if (!isNull(r.trd_cur_proc_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_proc_amt, r.trd_cur_proc_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if (!isNull(r.trd_cur_onr_prov_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_onr_prov_amt, r.trd_cur_onr_prov_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if (!isNull(r.trd_cur_proc_upri())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_proc_upri, r.trd_cur_proc_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if (!isNull(r.trd_cur_onr_prov_upri())) {
							r.setNumberNE(Srch01_Dtl1R.$trd_cur_onr_prov_upri, r.trd_cur_onr_prov_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
					}
					else {
						r.base_cur_upri(r.base_cur_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_cur_amt(r.base_cur_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_cur_tax_amt(r.base_cur_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						r.base_cur_inc_tax_amt(r.base_cur_inc_tax_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						if(!isNull(r.base_cur_dscnt_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_dscnt_amt, r.base_cur_dscnt_amt().multiply(MAC_TRD_PTN_TYP.SLS_DSCNT.amt_disp_pm()));
						}
						if(!isNull(r.base_cur_proc_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_proc_amt, r.base_cur_proc_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if(!isNull(r.base_cur_onr_prov_amt())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_onr_prov_amt, r.base_cur_onr_prov_amt().multiply(MAUCL_TrdUtil.getAmtDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if(!isNull(r.base_cur_proc_upri())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_proc_upri, r.base_cur_proc_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
						if(!isNull(r.base_cur_onr_prov_upri())) {
							r.setNumberNE(Srch01_Dtl1R.$base_cur_onr_prov_upri, r.base_cur_onr_prov_upri().multiply(MAUCL_TrdUtil.getUpriDispPm(r.trd_ptn_typ(), r.dscnt_itm_flg())));
						}
					}
					r.base_unit_qty(r.base_unit_qty().multiply(MAC_TRD_PTN_TYP.qty_disp_pm(r.trd_ptn_typ())));
				}
			}
		}
		
		/**
		 * 合計枠部を計算するため買掛残高取得サービスをコールする。
		 */
		protected void callApBalService() {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();
			copy(ope.up0(), up0(), createMap_ApBal_Srch01_CtrlR_Srch01_CndR());
			ope.exec();
			if (!ope.down0().isEmpty()) {
				copy(down0(), ope.down0().get(0), createMap_Srch01_HdrR_ApBal_Srch01_RsltR());	
			}
		}
		
		protected Map_ApBal_Srch01_CtrlR_Srch01_CndR<ApBal_Srch01_CtrlR,Srch01_CndR> createMap_ApBal_Srch01_CtrlR_Srch01_CndR() {
			return new Map_ApBal_Srch01_CtrlR_Srch01_CndR<ApBal_Srch01_CtrlR, Srch01_CndR>();
		}

		public class Map_ApBal_Srch01_CtrlR_Srch01_CndR<D extends ApBal_Srch01_CtrlR, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ApBal_Srch01_CtrlR.$ap_dpt_cd, Srch01_CndR.$ap_dpt_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ap_dpt_nm, Srch01_CndR.$ap_dpt_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wg_cd, Srch01_CndR.$wg_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wg_nm, Srch01_CndR.$wg_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_cd, Srch01_CndR.$asppl_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_nm, Srch01_CndR.$asppl_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$rcpt_iv_no, Srch01_CndR.$rcpt_iv_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$rcpt_iv_mng_no, Srch01_CndR.$rcpt_iv_mng_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$purc_act_no, Srch01_CndR.$purc_act_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$trd_cur_cd, Srch01_CndR.$trd_cur_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$trd_cur_nm, Srch01_CndR.$trd_cur_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wrk_no, Srch01_CndR.$wrk_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wrk_nm, Srch01_CndR.$wrk_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ap_typ, Srch01_CndR.$ap_typ);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg1, Srch01_CndR.$asppl_grp_flg1);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd1, Srch01_CndR.$asppl_grp_cd1);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm1, Srch01_CndR.$asppl_grp_nm1);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg2, Srch01_CndR.$asppl_grp_flg2);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd2, Srch01_CndR.$asppl_grp_cd2);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm2, Srch01_CndR.$asppl_grp_nm2);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg3, Srch01_CndR.$asppl_grp_flg3);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd3, Srch01_CndR.$asppl_grp_cd3);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm3, Srch01_CndR.$asppl_grp_nm3);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg4, Srch01_CndR.$asppl_grp_flg4);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd4, Srch01_CndR.$asppl_grp_cd4);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm4, Srch01_CndR.$asppl_grp_nm4);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg5, Srch01_CndR.$asppl_grp_flg5);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd5, Srch01_CndR.$asppl_grp_cd5);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm5, Srch01_CndR.$asppl_grp_nm5);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg6, Srch01_CndR.$asppl_grp_flg6);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd6, Srch01_CndR.$asppl_grp_cd6);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm6, Srch01_CndR.$asppl_grp_nm6);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg7, Srch01_CndR.$asppl_grp_flg7);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd7, Srch01_CndR.$asppl_grp_cd7);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm7, Srch01_CndR.$asppl_grp_nm7);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg8, Srch01_CndR.$asppl_grp_flg8);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd8, Srch01_CndR.$asppl_grp_cd8);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm8, Srch01_CndR.$asppl_grp_nm8);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg9, Srch01_CndR.$asppl_grp_flg9);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd9, Srch01_CndR.$asppl_grp_cd9);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm9, Srch01_CndR.$asppl_grp_nm9);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_flg10, Srch01_CndR.$asppl_grp_flg10);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_cd10, Srch01_CndR.$asppl_grp_cd10);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_grp_nm10, Srch01_CndR.$asppl_grp_nm10);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.cmpl_nm_flg(false);
				dest.ac_ym_fr(up0().ac_ym());
				dest.ac_ym_to(up0().ac_ym());
				dest.chk_dac_flg(true);
				if (!isNull(up0().trd_cur_cd())) {
					dest.group_trd_cur_flg(true);
				}
			}
		}
		protected Map_Srch01_HdrR_ApBal_Srch01_RsltR<Srch01_HdrR,ApBal_Srch01_RsltR> createMap_Srch01_HdrR_ApBal_Srch01_RsltR() {
			return new Map_Srch01_HdrR_ApBal_Srch01_RsltR<Srch01_HdrR, ApBal_Srch01_RsltR>();
		}

		public class Map_Srch01_HdrR_ApBal_Srch01_RsltR<D extends Srch01_HdrR, S extends ApBal_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (isNull(up0().trd_cur_cd())) {
					dest.init_bal(replaceZero(src.base_cur_init_bal()));
					dest.purc_amt(replaceZero(src.base_cur_purc_amt()));
					dest.ret_amt(replaceZero(src.base_cur_ret_amt()));
					dest.dscnt_amt(replaceZero(src.base_cur_dscnt_amt()));
					dest.sw_to_amt(replaceZero(src.base_cur_sw_to_amt()));
					dest.tax_amt(replaceZero(src.base_cur_tax_amt()));
					dest.cash_amt(replaceZero(src.base_cur_cash_amt()));
					dest.note_amt(replaceZero(src.base_cur_note_amt()));
					dest.account_amt(replaceZero(src.base_cur_account_amt()));
					dest.setoff_amt(replaceZero(src.base_cur_setoff_amt()));
					dest.sw_amt(replaceZero(src.base_cur_sw_amt()));
					dest.end_bal(replaceZero(src.base_cur_end_bal()));
					dest.exc_gain_loss(replaceZero(src.exc_gain_loss()));
				}
				else {
					dest.init_bal(replaceZero(src.init_bal()));
					dest.purc_amt(replaceZero(src.purc_amt()));
					dest.ret_amt(replaceZero(src.ret_amt()));
					dest.dscnt_amt(replaceZero(src.dscnt_amt()));
					dest.sw_to_amt(replaceZero(src.sw_to_amt()));
					dest.tax_amt(replaceZero(src.tax_amt()));
					dest.cash_amt(replaceZero(src.cash_amt()));
					dest.note_amt(replaceZero(src.note_amt()));
					dest.account_amt(replaceZero(src.account_amt()));
					dest.setoff_amt(replaceZero(src.setoff_amt()));
					dest.sw_amt(replaceZero(src.sw_amt()));
					dest.end_bal(replaceZero(src.end_bal()));
				}
			}
			
			protected MCNumber replaceZero(MCNumber amt) {
				if (isNull(amt)) {
					return MCNumber.ZERO;
				}
				return amt;
			}
		}
	}

	protected void setValuesDbc(MCRow upR, MCList<? extends MCConstRow> down) {
		setValuesDbc(MSBHL0120_Srch01_Dtl1R_J01(), upR, down);
	}

	//FMCB CUSTOM END
}