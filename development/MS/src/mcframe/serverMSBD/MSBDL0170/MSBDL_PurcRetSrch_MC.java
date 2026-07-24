package mcframe.serverMSBD.MSBDL0170;

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
import mcframe.serverMSBD.MSBDL5200.*;
import static mcframe.serverMSBD.MSBDL0170.Query.*;
import mcframe.serverMAUC.MAUCL0010.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBDL_PurcRetSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBDL_PurcRetSrch_MC extends MSBDL_PurcRetSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 * 仕入返品予定を検索します。
	 */
	public class Srch01 extends MSBDL_PurcRetSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = null;
			
			// ヘッダ
			if (isSame(up0().mode(), "2")) {
				sql  = MSBDL0170_MST_PURC_RET_SCHD_S01();
			}
			// 明細
			else if (isSame(up0().mode(), "1")) {
				sql = MSBDL0170_MST_PURC_RET_SCHD_S02();
			}
			// 詳細
			else if (isSame(up0().mode(), "0")) {
				sql = MSBDL0170_MST_PURC_RET_SCHD_S03();
			}
			
			searchForDL(sql , up0(), down0());
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			MCNumber baseAmtDecPlace = getBaseCur().amt_dec_place();
			MCNumber ptaxAmtDecPlace = getPtaxCur().amt_dec_place();
			MCNumber baseUpriDecPlace = getBaseCur().upri_dec_place();
			MCNumber ptaxUpriDecPlace = getPtaxCur().upri_dec_place();
			
			String rndMode = getCo().xrate_rnd_typ();
			
			for (int i = 0; i < down0().size(); i++) {
				Srch01_RsltR r = down0().get(i);
				
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
				r.base_upri_dec_place(baseUpriDecPlace);
				r.base_amt_dec_place(getBaseCur().amt_dec_place());

				r.ptax_cur_cd(getPtaxCur().cur_cd());
				r.ptax_cur_nm(getPtaxCur().cur_nm());
				r.ptax_upri_dec_place(ptaxUpriDecPlace);
				r.ptax_amt_dec_place(getPtaxCur().amt_dec_place());
				
				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_proc_upri(convToBaseCur(r.trd_cur_proc_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_onr_prov_upri(convToBaseCur(r.trd_cur_onr_prov_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_proc_amt(convToBaseCur(r.trd_cur_proc_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_onr_prov_amt(convToBaseCur(r.trd_cur_onr_prov_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_amt_inc_tax_cur_amt(sum(r.base_cur_amt(), r.base_cur_tax_amt()));
				
				r.ptax_cur_upri(convCur(r.trd_cur_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_proc_upri(convCur(r.trd_cur_proc_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_onr_prov_upri(convCur(r.trd_cur_onr_prov_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_inc_tax_amt(sum(r.ptax_cur_amt(), r.ptax_cur_tax_amt()));
				r.purc_cont_fctr(MAUCL_MCDataUtil.calcContFctr(r.base_unit_qty(), r.purc_cont_qty(), r.cont_fctr_dec_place()));
				r.cont_qty(MAUCL_MCDataUtil.convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 * 仕入返品実績を検索します。
	 */
	public class Srch02 extends MSBDL_PurcRetSrch_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = null;
			
			// ヘッダ
			if (isSame(up0().mode(), "2")) {
				if(!up0().inc_past_flg()) {
					sql  = MSBDL0170_MST_PURC_RET_ACT_S01();
				}else {
					sql  = MSBDL0170_MST_PURC_RET_ACT_P_S01();
				}
				
			}
			// 明細
			else if (isSame(up0().mode(), "1")) {
				sql = MSBDL0170_MST_PURC_RET_ACT_S02();
			}
			// 詳細
			else if (isSame(up0().mode(), "0")) {
				sql = MSBDL0170_MST_PURC_RET_ACT_S03();
			}
			
			searchForDL(sql, up0(), down0());
		}
		
		
		@Override
		protected void editListMain() {
			super.editListMain();
			MCNumber baseAmtDecPlace = getBaseCur().amt_dec_place();
			MCNumber ptaxAmtDecPlace = getPtaxCur().amt_dec_place();
			MCNumber baseUpriDecPlace = getBaseCur().upri_dec_place();
			MCNumber ptaxUpriDecPlace = getPtaxCur().upri_dec_place();
			
			String rndMode = getCo().xrate_rnd_typ();
			
			for (int i = 0; i < down0().size(); i++) {
				Srch02_RsltR r = down0().get(i);
				
				r.base_cur_cd(getBaseCur().cur_cd());
				r.base_cur_nm(getBaseCur().cur_nm());
				r.base_upri_dec_place(baseUpriDecPlace);
				r.base_amt_dec_place(getBaseCur().amt_dec_place());

				r.ptax_cur_cd(getPtaxCur().cur_cd());
				r.ptax_cur_nm(getPtaxCur().cur_nm());
				r.ptax_upri_dec_place(ptaxUpriDecPlace);
				r.ptax_amt_dec_place(getPtaxCur().amt_dec_place());
				
				r.base_cur_upri(convToBaseCur(r.trd_cur_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_proc_upri(convToBaseCur(r.trd_cur_proc_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_onr_prov_upri(convToBaseCur(r.trd_cur_onr_prov_upri(), r.xrate(), baseUpriDecPlace, rndMode));
				r.base_cur_dscnt_amt(convToBaseCur(r.trd_cur_dscnt_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_amt(convToBaseCur(r.trd_cur_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_proc_amt(convToBaseCur(r.trd_cur_proc_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_onr_prov_amt(convToBaseCur(r.trd_cur_onr_prov_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_tax_amt(convToBaseCur(r.trd_cur_tax_amt(), r.xrate(), baseAmtDecPlace, rndMode));
				r.base_cur_amt_inc_tax_cur_amt(sum(r.base_cur_amt(), r.base_cur_tax_amt()));
				
				r.ptax_cur_upri(convCur(r.trd_cur_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_proc_upri(convCur(r.trd_cur_proc_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_onr_prov_upri(convCur(r.trd_cur_onr_prov_upri(), r.ptax_xrate(), ptaxUpriDecPlace, rndMode));
				r.ptax_cur_dscnt_amt(convCur(r.trd_cur_dscnt_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_amt(convCur(r.trd_cur_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_tax_amt(convCur(r.trd_cur_tax_amt(), r.ptax_xrate(), ptaxAmtDecPlace, rndMode));
				r.ptax_cur_inc_tax_amt(sum(r.ptax_cur_amt(), r.ptax_cur_tax_amt()));
				r.purc_cont_fctr(MAUCL_MCDataUtil.calcContFctr(r.base_unit_qty(), r.purc_cont_qty(), r.cont_fctr_dec_place()));
				r.cont_qty(MAUCL_MCDataUtil.convToContFctrUnit(r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ()));
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 * 返品票を発行します。
	 */
	public class Prnt01 extends MSBDL_PurcRetSrch_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MSBDL_PurcPrntService.PurcPrnt_Prnt02 ope = MSBDL_PurcPrntService.crtPurcPrnt_Prnt02();
			setAll(ope.up0(), up0(), createMap_PurcPrnt_Prnt02_CndR_Prnt01_RsltR());
			ope.up1().indiv_prnt_flg(up1().indiv_prnt_flg());
			ope.exec();
		}
		
		protected Map_PurcPrnt_Prnt02_CndR_Prnt01_RsltR<PurcPrnt_Prnt02_CndR,Prnt01_RsltR> createMap_PurcPrnt_Prnt02_CndR_Prnt01_RsltR() {
			return new Map_PurcPrnt_Prnt02_CndR_Prnt01_RsltR<PurcPrnt_Prnt02_CndR, Prnt01_RsltR>();
		}

		public class Map_PurcPrnt_Prnt02_CndR_Prnt01_RsltR<D extends PurcPrnt_Prnt02_CndR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_no, Prnt01_RsltR.$purc_ret_act_no);
				addColumnPathMap(PurcPrnt_Prnt02_CndR.$purc_ret_act_rev, Prnt01_RsltR.$purc_ret_act_rev);

			}
		}
	}

	//FMCB CUSTOM END
}