package mcframe.serverMSBH.MSBHL0110;

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
import mcframe.serverMSBH.MSBHL5110.*;
import java.util.ArrayList;
import static mcframe.commonCore.lang.MCStringUtil.arrayValueJoin;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_MlyApBalSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_MlyApBalSrch_MC extends MSBHL_MlyApBalSrch_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 買掛残高一覧情報を検索する。<br>
	 */
	public class Srch01 extends MSBHL_MlyApBalSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索処理
			callApBalService();
		}
		
		protected void callApBalService() {
			MSBHL_ApBalService.ApBal_Srch01 ope = MSBHL_ApBalService.crtApBal_Srch01();
			copy(ope.up0(), up0(), createMap_ApBal_Srch01_CtrlR_Srch01_CndR());
			ope.exec();
			addAll(down0(), ope.down0(), createMap_Srch01_RsltR_ApBal_Srch01_RsltR());
		}
		protected Map_ApBal_Srch01_CtrlR_Srch01_CndR<ApBal_Srch01_CtrlR,Srch01_CndR> createMap_ApBal_Srch01_CtrlR_Srch01_CndR() {
			return new Map_ApBal_Srch01_CtrlR_Srch01_CndR<ApBal_Srch01_CtrlR, Srch01_CndR>();
		}

		public class Map_ApBal_Srch01_CtrlR_Srch01_CndR<D extends ApBal_Srch01_CtrlR, S extends Srch01_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_ap_dpt_flg, Srch01_CndR.$ap_dpt_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_wg_flg, Srch01_CndR.$wg_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_asppl_flg, Srch01_CndR.$asppl_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_purc_act_no_flg, Srch01_CndR.$purc_act_no_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_rcpt_iv_no_flg, Srch01_CndR.$rcpt_iv_no_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_rcpt_iv_mng_no_flg, Srch01_CndR.$rcpt_iv_mng_no_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_trd_cur_flg, Srch01_CndR.$trd_cur_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_wrk_no_flg, Srch01_CndR.$wrk_no_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$group_ap_typ_flg, Srch01_CndR.$ap_typ_flg);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ac_ym_fr, Srch01_CndR.$ac_ym_fr);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ac_ym_to, Srch01_CndR.$ac_ym_to);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ap_dpt_cd, Srch01_CndR.$ap_dpt_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$ap_dpt_nm, Srch01_CndR.$ap_dpt_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wg_cd, Srch01_CndR.$wg_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wg_nm, Srch01_CndR.$wg_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_cd, Srch01_CndR.$asppl_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$asppl_nm, Srch01_CndR.$asppl_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$purc_act_no, Srch01_CndR.$purc_act_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$rcpt_iv_no, Srch01_CndR.$rcpt_iv_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$rcpt_iv_mng_no, Srch01_CndR.$rcpt_iv_mng_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$trd_cur_cd, Srch01_CndR.$trd_cur_cd);
				addColumnPathMap(ApBal_Srch01_CtrlR.$trd_cur_nm, Srch01_CndR.$trd_cur_nm);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wrk_no, Srch01_CndR.$wrk_no);
				addColumnPathMap(ApBal_Srch01_CtrlR.$wrk_nm, Srch01_CndR.$wrk_nm);
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
				dest.cmpl_nm_flg(true);
				dest.chk_dac_flg(true);

				ArrayList<String> apTypL = new ArrayList<String>();
				if (src.ap_typ_ap()) {
					apTypL.add(MAC_AP_TYP.AP.value());
				}
				if (src.ap_typ_ac()) {
					apTypL.add(MAC_AP_TYP.AC.value());
				}
				if (src.ap_typ_temp_ap()) {
					apTypL.add(MAC_AP_TYP.TEMP_AP.value());
				}
				dest.ap_typ(arrayValueJoin(apTypL.toArray(new String[0])));
			}
		}
		
		protected Map_Srch01_RsltR_ApBal_Srch01_RsltR<Srch01_RsltR,ApBal_Srch01_RsltR> createMap_Srch01_RsltR_ApBal_Srch01_RsltR() {
			return new Map_Srch01_RsltR_ApBal_Srch01_RsltR<Srch01_RsltR, ApBal_Srch01_RsltR>();
		}

		public class Map_Srch01_RsltR_ApBal_Srch01_RsltR<D extends Srch01_RsltR, S extends ApBal_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$ac_ym, ApBal_Srch01_RsltR.$ac_ym);
				addColumnPathMap(Srch01_RsltR.$ap_dpt_cd, ApBal_Srch01_RsltR.$ap_dpt_cd);
				addColumnPathMap(Srch01_RsltR.$ap_dpt_nm, ApBal_Srch01_RsltR.$ap_dpt_nm);
				addColumnPathMap(Srch01_RsltR.$wg_cd, ApBal_Srch01_RsltR.$wg_cd);
				addColumnPathMap(Srch01_RsltR.$wg_nm, ApBal_Srch01_RsltR.$wg_nm);
				addColumnPathMap(Srch01_RsltR.$asppl_cd, ApBal_Srch01_RsltR.$asppl_cd);
				addColumnPathMap(Srch01_RsltR.$asppl_nm, ApBal_Srch01_RsltR.$asppl_nm);
				addColumnPathMap(Srch01_RsltR.$purc_act_no, ApBal_Srch01_RsltR.$purc_act_no);
				addColumnPathMap(Srch01_RsltR.$rcpt_iv_no, ApBal_Srch01_RsltR.$rcpt_iv_no);
				addColumnPathMap(Srch01_RsltR.$rcpt_iv_mng_no, ApBal_Srch01_RsltR.$rcpt_iv_mng_no);
				addColumnPathMap(Srch01_RsltR.$trd_cur_cd, ApBal_Srch01_RsltR.$trd_cur_cd);
				addColumnPathMap(Srch01_RsltR.$trd_cur_nm, ApBal_Srch01_RsltR.$trd_cur_nm);
				addColumnPathMap(Srch01_RsltR.$trd_cur_amt_dec_place, ApBal_Srch01_RsltR.$trd_cur_amt_dec_place);
				addColumnPathMap(Srch01_RsltR.$wrk_no, ApBal_Srch01_RsltR.$wrk_no);
				addColumnPathMap(Srch01_RsltR.$wrk_nm, ApBal_Srch01_RsltR.$wrk_nm);
				addColumnPathMap(Srch01_RsltR.$ap_typ, ApBal_Srch01_RsltR.$ap_typ);
				addColumnPathMap(Srch01_RsltR.$ap_typ_nm, ApBal_Srch01_RsltR.$ap_typ_nm);
				addColumnPathMap(Srch01_RsltR.$init_bal, ApBal_Srch01_RsltR.$init_bal);
				addColumnPathMap(Srch01_RsltR.$purc_amt, ApBal_Srch01_RsltR.$purc_amt);
				addColumnPathMap(Srch01_RsltR.$ret_amt, ApBal_Srch01_RsltR.$ret_amt);
				addColumnPathMap(Srch01_RsltR.$dscnt_amt, ApBal_Srch01_RsltR.$dscnt_amt);
				addColumnPathMap(Srch01_RsltR.$sw_to_amt, ApBal_Srch01_RsltR.$sw_to_amt);
				addColumnPathMap(Srch01_RsltR.$tax_amt, ApBal_Srch01_RsltR.$tax_amt);
				addColumnPathMap(Srch01_RsltR.$cash_amt, ApBal_Srch01_RsltR.$cash_amt);
				addColumnPathMap(Srch01_RsltR.$note_amt, ApBal_Srch01_RsltR.$note_amt);
				addColumnPathMap(Srch01_RsltR.$account_amt, ApBal_Srch01_RsltR.$account_amt);
				addColumnPathMap(Srch01_RsltR.$setoff_amt, ApBal_Srch01_RsltR.$setoff_amt);
				addColumnPathMap(Srch01_RsltR.$sw_amt, ApBal_Srch01_RsltR.$sw_amt);
				addColumnPathMap(Srch01_RsltR.$end_bal, ApBal_Srch01_RsltR.$end_bal);
				addColumnPathMap(Srch01_RsltR.$base_cur_cd, ApBal_Srch01_RsltR.$base_cur_cd);
				addColumnPathMap(Srch01_RsltR.$base_cur_nm, ApBal_Srch01_RsltR.$base_cur_nm);
				addColumnPathMap(Srch01_RsltR.$base_cur_amt_dec_place, ApBal_Srch01_RsltR.$base_cur_amt_dec_place);
				addColumnPathMap(Srch01_RsltR.$base_cur_init_bal, ApBal_Srch01_RsltR.$base_cur_init_bal);
				addColumnPathMap(Srch01_RsltR.$base_cur_purc_amt, ApBal_Srch01_RsltR.$base_cur_purc_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_ret_amt, ApBal_Srch01_RsltR.$base_cur_ret_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_dscnt_amt, ApBal_Srch01_RsltR.$base_cur_dscnt_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_sw_amt, ApBal_Srch01_RsltR.$base_cur_sw_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_tax_amt, ApBal_Srch01_RsltR.$base_cur_tax_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_cash_amt, ApBal_Srch01_RsltR.$base_cur_cash_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_note_amt, ApBal_Srch01_RsltR.$base_cur_note_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_account_amt, ApBal_Srch01_RsltR.$base_cur_account_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_setoff_amt, ApBal_Srch01_RsltR.$base_cur_setoff_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_sw_to_amt, ApBal_Srch01_RsltR.$base_cur_sw_to_amt);
				addColumnPathMap(Srch01_RsltR.$base_cur_end_bal, ApBal_Srch01_RsltR.$base_cur_end_bal);
				addColumnPathMap(Srch01_RsltR.$exc_gain_loss, ApBal_Srch01_RsltR.$exc_gain_loss);
				addColumnPathMap(Srch01_RsltR.$total_exc_gain_loss, ApBal_Srch01_RsltR.$total_exc_gain_loss);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd1, ApBal_Srch01_RsltR.$asppl_grp_cd1);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm1, ApBal_Srch01_RsltR.$asppl_grp_nm1);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd2, ApBal_Srch01_RsltR.$asppl_grp_cd2);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm2, ApBal_Srch01_RsltR.$asppl_grp_nm2);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd3, ApBal_Srch01_RsltR.$asppl_grp_cd3);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm3, ApBal_Srch01_RsltR.$asppl_grp_nm3);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd4, ApBal_Srch01_RsltR.$asppl_grp_cd4);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm4, ApBal_Srch01_RsltR.$asppl_grp_nm4);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd5, ApBal_Srch01_RsltR.$asppl_grp_cd5);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm5, ApBal_Srch01_RsltR.$asppl_grp_nm5);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd6, ApBal_Srch01_RsltR.$asppl_grp_cd6);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm6, ApBal_Srch01_RsltR.$asppl_grp_nm6);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd7, ApBal_Srch01_RsltR.$asppl_grp_cd7);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm7, ApBal_Srch01_RsltR.$asppl_grp_nm7);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd8, ApBal_Srch01_RsltR.$asppl_grp_cd8);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm8, ApBal_Srch01_RsltR.$asppl_grp_nm8);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd9, ApBal_Srch01_RsltR.$asppl_grp_cd9);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm9, ApBal_Srch01_RsltR.$asppl_grp_nm9);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_cd10, ApBal_Srch01_RsltR.$asppl_grp_cd10);
				addColumnPathMap(Srch01_RsltR.$asppl_grp_nm10, ApBal_Srch01_RsltR.$asppl_grp_nm10);
				addColumnPathMap(Srch01_RsltR.$ins_usr_id, ApBal_Srch01_RsltR.$ins_usr_id);
				addColumnPathMap(Srch01_RsltR.$ins_usr_nm, ApBal_Srch01_RsltR.$ins_usr_nm);
				addColumnPathMap(Srch01_RsltR.$ins_func_id, ApBal_Srch01_RsltR.$ins_func_id);
				addColumnPathMap(Srch01_RsltR.$ins_func_nm, ApBal_Srch01_RsltR.$ins_func_nm);
				addColumnPathMap(Srch01_RsltR.$ins_ts, ApBal_Srch01_RsltR.$ins_ts);
				addColumnPathMap(Srch01_RsltR.$upd_usr_id, ApBal_Srch01_RsltR.$upd_usr_id);
				addColumnPathMap(Srch01_RsltR.$upd_usr_nm, ApBal_Srch01_RsltR.$upd_usr_nm);
				addColumnPathMap(Srch01_RsltR.$upd_func_id, ApBal_Srch01_RsltR.$upd_func_id);
				addColumnPathMap(Srch01_RsltR.$upd_func_nm, ApBal_Srch01_RsltR.$upd_func_nm);
				addColumnPathMap(Srch01_RsltR.$upd_ts, ApBal_Srch01_RsltR.$upd_ts);
				addColumnPathMap(Srch01_RsltR.$upd_srv_req_no, ApBal_Srch01_RsltR.$upd_srv_req_no);

			}
		}
	}

	//FMCB CUSTOM END
}