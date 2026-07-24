package mcframe.serverMSBH.MSBHL0150;

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
import mcframe.serverMSBH.MSBHL5080.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_OnrProvBalSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_OnrProvBalSrch_MC extends MSBHL_OnrProvBalSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 有償支給残高を検索する。<br>
	 */
	public class Srch01 extends MSBHL_OnrProvBalSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			
			callApSetoffSrch04();
		}
		
		protected void callApSetoffSrch04() {
			MSBHL_ApSetoffService.ApSetoff_Srch04 ope = MSBHL_ApSetoffService.crtApSetoff_Srch04();
			copy(ope.up0(), up0(), createMap_ApSetoff_Srch04_CndR_Srch01_CndR());

			ope.exec();
			
			addAll(down0(), ope.down0(), createMap_Srch01_RsltR_ApSetoff_Srch04_DtlR());
		}
	}

	protected Map_ApSetoff_Srch04_CndR_Srch01_CndR<ApSetoff_Srch04_CndR,Srch01_CndR> createMap_ApSetoff_Srch04_CndR_Srch01_CndR() {
		return new Map_ApSetoff_Srch04_CndR_Srch01_CndR<ApSetoff_Srch04_CndR, Srch01_CndR>();
	}

	public class Map_ApSetoff_Srch04_CndR_Srch01_CndR<D extends ApSetoff_Srch04_CndR, S extends Srch01_CndR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(ApSetoff_Srch04_CndR.$ac_ym_fr, Srch01_CndR.$ac_ym_fr);
			addColumnPathMap(ApSetoff_Srch04_CndR.$ac_ym_to, Srch01_CndR.$ac_ym_to);
			addColumnPathMap(ApSetoff_Srch04_CndR.$ap_dpt_cd, Srch01_CndR.$ap_dpt_cd);
			addColumnPathMap(ApSetoff_Srch04_CndR.$ap_dpt_nm, Srch01_CndR.$ap_dpt_nm);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_cd, Srch01_CndR.$asppl_cd);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_nm, Srch01_CndR.$asppl_nm);
			addColumnPathMap(ApSetoff_Srch04_CndR.$trd_cur_cd, Srch01_CndR.$trd_cur_cd);
			addColumnPathMap(ApSetoff_Srch04_CndR.$trd_cur_nm, Srch01_CndR.$trd_cur_nm);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg1, Srch01_CndR.$asppl_grp_flg1);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd1, Srch01_CndR.$asppl_grp_cd1);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm1, Srch01_CndR.$asppl_grp_nm1);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg2, Srch01_CndR.$asppl_grp_flg2);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd2, Srch01_CndR.$asppl_grp_cd2);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm2, Srch01_CndR.$asppl_grp_nm2);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg3, Srch01_CndR.$asppl_grp_flg3);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd3, Srch01_CndR.$asppl_grp_cd3);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm3, Srch01_CndR.$asppl_grp_nm3);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg4, Srch01_CndR.$asppl_grp_flg4);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd4, Srch01_CndR.$asppl_grp_cd4);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm4, Srch01_CndR.$asppl_grp_nm4);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg5, Srch01_CndR.$asppl_grp_flg5);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd5, Srch01_CndR.$asppl_grp_cd5);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm5, Srch01_CndR.$asppl_grp_nm5);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg6, Srch01_CndR.$asppl_grp_flg6);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd6, Srch01_CndR.$asppl_grp_cd6);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm6, Srch01_CndR.$asppl_grp_nm6);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg7, Srch01_CndR.$asppl_grp_flg7);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd7, Srch01_CndR.$asppl_grp_cd7);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm7, Srch01_CndR.$asppl_grp_nm7);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg8, Srch01_CndR.$asppl_grp_flg8);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd8, Srch01_CndR.$asppl_grp_cd8);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm8, Srch01_CndR.$asppl_grp_nm8);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg9, Srch01_CndR.$asppl_grp_flg9);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd9, Srch01_CndR.$asppl_grp_cd9);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm9, Srch01_CndR.$asppl_grp_nm9);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_flg10, Srch01_CndR.$asppl_grp_flg10);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_cd10, Srch01_CndR.$asppl_grp_cd10);
			addColumnPathMap(ApSetoff_Srch04_CndR.$asppl_grp_nm10, Srch01_CndR.$asppl_grp_nm10);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.dac_vld_flg(true);
		}
	}
	
	protected Map_Srch01_RsltR_ApSetoff_Srch04_DtlR<Srch01_RsltR,ApSetoff_Srch04_DtlR> createMap_Srch01_RsltR_ApSetoff_Srch04_DtlR() {
		return new Map_Srch01_RsltR_ApSetoff_Srch04_DtlR<Srch01_RsltR, ApSetoff_Srch04_DtlR>();
	}

	public class Map_Srch01_RsltR_ApSetoff_Srch04_DtlR<D extends Srch01_RsltR, S extends ApSetoff_Srch04_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_RsltR.$ac_ym, ApSetoff_Srch04_DtlR.$ac_ym);
			addColumnPathMap(Srch01_RsltR.$asppl_cd, ApSetoff_Srch04_DtlR.$asppl_cd);
			addColumnPathMap(Srch01_RsltR.$asppl_nm, ApSetoff_Srch04_DtlR.$asppl_nm);
			addColumnPathMap(Srch01_RsltR.$ap_dpt_cd, ApSetoff_Srch04_DtlR.$ap_dpt_cd);
			addColumnPathMap(Srch01_RsltR.$ap_dpt_nm, ApSetoff_Srch04_DtlR.$ap_dpt_nm);
			addColumnPathMap(Srch01_RsltR.$trd_cur_cd, ApSetoff_Srch04_DtlR.$trd_cur_cd);
			addColumnPathMap(Srch01_RsltR.$trd_cur_nm, ApSetoff_Srch04_DtlR.$trd_cur_nm);
			addColumnPathMap(Srch01_RsltR.$trd_cur_amt_dec_place, ApSetoff_Srch04_DtlR.$trd_cur_amt_dec_place);
			addColumnPathMap(Srch01_RsltR.$init_bal, ApSetoff_Srch04_DtlR.$init_bal);
			addColumnPathMap(Srch01_RsltR.$onr_prov_amt, ApSetoff_Srch04_DtlR.$onr_prov_amt);
			addColumnPathMap(Srch01_RsltR.$onr_prov_ret_amt, ApSetoff_Srch04_DtlR.$onr_prov_ret_amt);
			addColumnPathMap(Srch01_RsltR.$setoff_amt, ApSetoff_Srch04_DtlR.$setoff_amt);
			addColumnPathMap(Srch01_RsltR.$tax_amt, ApSetoff_Srch04_DtlR.$tax_amt);
			addColumnPathMap(Srch01_RsltR.$end_bal, ApSetoff_Srch04_DtlR.$end_bal);
			addColumnPathMap(Srch01_RsltR.$base_cur_cd, ApSetoff_Srch04_DtlR.$base_cur_cd);
			addColumnPathMap(Srch01_RsltR.$base_cur_nm, ApSetoff_Srch04_DtlR.$base_cur_nm);
			addColumnPathMap(Srch01_RsltR.$base_cur_amt_dec_place, ApSetoff_Srch04_DtlR.$base_cur_amt_dec_place);
			addColumnPathMap(Srch01_RsltR.$base_cur_init_bal, ApSetoff_Srch04_DtlR.$base_cur_init_bal);
			addColumnPathMap(Srch01_RsltR.$base_cur_onr_prov_amt, ApSetoff_Srch04_DtlR.$base_cur_onr_prov_amt);
			addColumnPathMap(Srch01_RsltR.$base_cur_onr_prov_ret_amt, ApSetoff_Srch04_DtlR.$base_cur_onr_prov_ret_amt);
			addColumnPathMap(Srch01_RsltR.$base_cur_setoff_amt, ApSetoff_Srch04_DtlR.$base_cur_setoff_amt);
			addColumnPathMap(Srch01_RsltR.$base_cur_tax_amt, ApSetoff_Srch04_DtlR.$base_cur_tax_amt);
			addColumnPathMap(Srch01_RsltR.$base_cur_end_bal, ApSetoff_Srch04_DtlR.$base_cur_end_bal);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd1, ApSetoff_Srch04_DtlR.$asppl_grp_cd1);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm1, ApSetoff_Srch04_DtlR.$asppl_grp_nm1);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd2, ApSetoff_Srch04_DtlR.$asppl_grp_cd2);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm2, ApSetoff_Srch04_DtlR.$asppl_grp_nm2);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd3, ApSetoff_Srch04_DtlR.$asppl_grp_cd3);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm3, ApSetoff_Srch04_DtlR.$asppl_grp_nm3);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd4, ApSetoff_Srch04_DtlR.$asppl_grp_cd4);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm4, ApSetoff_Srch04_DtlR.$asppl_grp_nm4);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd5, ApSetoff_Srch04_DtlR.$asppl_grp_cd5);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm5, ApSetoff_Srch04_DtlR.$asppl_grp_nm5);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd6, ApSetoff_Srch04_DtlR.$asppl_grp_cd6);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm6, ApSetoff_Srch04_DtlR.$asppl_grp_nm6);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd7, ApSetoff_Srch04_DtlR.$asppl_grp_cd7);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm7, ApSetoff_Srch04_DtlR.$asppl_grp_nm7);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd8, ApSetoff_Srch04_DtlR.$asppl_grp_cd8);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm8, ApSetoff_Srch04_DtlR.$asppl_grp_nm8);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd9, ApSetoff_Srch04_DtlR.$asppl_grp_cd9);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm9, ApSetoff_Srch04_DtlR.$asppl_grp_nm9);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_cd10, ApSetoff_Srch04_DtlR.$asppl_grp_cd10);
			addColumnPathMap(Srch01_RsltR.$asppl_grp_nm10, ApSetoff_Srch04_DtlR.$asppl_grp_nm10);
			addColumnPathMap(Srch01_RsltR.$ins_usr_id, ApSetoff_Srch04_DtlR.$ins_usr_id);
			addColumnPathMap(Srch01_RsltR.$ins_usr_nm, ApSetoff_Srch04_DtlR.$ins_usr_nm);
			addColumnPathMap(Srch01_RsltR.$ins_func_id, ApSetoff_Srch04_DtlR.$ins_func_id);
			addColumnPathMap(Srch01_RsltR.$ins_func_nm, ApSetoff_Srch04_DtlR.$ins_func_nm);
			addColumnPathMap(Srch01_RsltR.$ins_ts, ApSetoff_Srch04_DtlR.$ins_ts);
			addColumnPathMap(Srch01_RsltR.$upd_usr_id, ApSetoff_Srch04_DtlR.$upd_usr_id);
			addColumnPathMap(Srch01_RsltR.$upd_usr_nm, ApSetoff_Srch04_DtlR.$upd_usr_nm);
			addColumnPathMap(Srch01_RsltR.$upd_func_id, ApSetoff_Srch04_DtlR.$upd_func_id);
			addColumnPathMap(Srch01_RsltR.$upd_func_nm, ApSetoff_Srch04_DtlR.$upd_func_nm);
			addColumnPathMap(Srch01_RsltR.$upd_ts, ApSetoff_Srch04_DtlR.$upd_ts);
			addColumnPathMap(Srch01_RsltR.$upd_srv_req_no, ApSetoff_Srch04_DtlR.$upd_srv_req_no);
		}
	}

	//FMCB CUSTOM END
}