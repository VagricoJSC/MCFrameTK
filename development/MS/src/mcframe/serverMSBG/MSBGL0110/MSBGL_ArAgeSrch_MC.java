package mcframe.serverMSBG.MSBGL0110;

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
import static mcframe.serverMSBG.MSBGL0110.Query.*;
import mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil;
import mcframe.serverMSBG.MSBGL5120.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_ArAgeSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_ArAgeSrch_MC extends MSBGL_ArAgeSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛金年齢情報の検索を行います。<br>
	 */
	public class Srch01 extends MSBGL_ArAgeSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		protected String[] grpCols;

		protected void preSearch() {
			List<String> grpColsList = grpList();
			grpCols = new String[grpColsList.size()];
			grpCols = (String[])grpColsList.toArray(new String[0]);
		}

		/**
		 * 配列に挿入するリスト作成
		 * @param grpColsList
		 */
		protected List<String> grpList() {
			List<String> grpColsList = new ArrayList<String>();

			if (up0().ar_dpt_flg()) {
				grpColsList.add(Srch01_RsltR.$ar_dpt_cd);
				grpColsList.add(Srch01_RsltR.$ar_dpt_nm);
			}
			if (up0().wg_flg()) {
				grpColsList.add(Srch01_RsltR.$wg_cd);
			}
			if (up0().acst_flg()) {
				grpColsList.add(Srch01_RsltR.$acst_cd);
			}
			if (up0().iv_no_flg()) {
				grpColsList.add(Srch01_RsltR.$iv_no);
			}

			grpColsList.add(Srch01_RsltR.$trd_cur_cd);

			if (up0().wrk_no_flg()) {
				grpColsList.add(Srch01_RsltR.$wrk_no);
			}
			if (up0().ar_typ_flg()) {
				grpColsList.add(Srch01_RsltR.$ar_typ);
			}
			return grpColsList;
		}

		@Override
		protected void doSearchMain() {
			preSearch();

			super.doSearchMain();
			up0().setDateNE("AR_CL_YM",MSUCL_ClUtil.getArClYm());

			MCQueryPlan billDSql = MSBGL0110_MST_MLY_AR_BAL_S01();
			executeQuery(down0(), billDSql, up0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			MCList<Srch01_RsltR> down0 = down0();

			MCList<Srch01_RsltR> rsltL = down0().createInstance();

			for (MCList<Srch01_RsltR> l : down0.groupList(grpCols)) {
				Srch01_RsltR rsltR = rsltL.createRow();

				if (up0().ar_dpt_flg()) {
					rsltR.ar_dpt_cd(l.get(0).ar_dpt_cd());
					rsltR.ar_dpt_nm(l.get(0).ar_dpt_nm());
				}
				if (up0().wg_flg()) {
					rsltR.wg_cd(l.get(0).wg_cd());
					rsltR.wg_nm(l.get(0).wg_nm());
				}
				if (up0().acst_flg()) {
					rsltR.acst_cd(l.get(0).acst_cd());
					rsltR.acst_nm(l.get(0).acst_nm());
				}
				if (up0().iv_no_flg()) {
					rsltR.iv_no(l.get(0).iv_no());
				}
				if (up0().wrk_no_flg()) {
					rsltR.wrk_no(l.get(0).wrk_no());
					rsltR.wrk_nm(l.get(0).wrk_nm());
				}
				if (up0().ar_typ_flg()) {
					rsltR.ar_typ(l.get(0).ar_typ());
				}

				rsltR.bill_cl_day(l.get(0).bill_cl_day());
				rsltR.crryovr_mons_typ(l.get(0).crryovr_mons_typ());
				rsltR.rcv_crryovr_mons(l.get(0).rcv_crryovr_mons());
				rsltR.rcv_day(l.get(0).rcv_day());

				rsltR.trd_cur_cd(l.get(0).trd_cur_cd());
				rsltR.trd_cur_nm(l.get(0).trd_cur_nm());
				rsltR.amt_dec_place(l.get(0).amt_dec_place());

				rsltR.wrk_no(l.get(0).wrk_no());
				rsltR.wrk_nm(l.get(0).wrk_nm());

				rsltR.end_bal(l.sum(Srch01_RsltR.$end_bal));
				rsltR.start_bal(l.sum(Srch01_RsltR.$start_bal));
				rsltR.one_ar_not_appl_bal(l.sum(Srch01_RsltR.$one_ar_not_appl_bal));
				rsltR.two_ar_not_appl_bal(l.sum(Srch01_RsltR.$two_ar_not_appl_bal));
				rsltR.three_ar_not_appl_bal(l.sum(Srch01_RsltR.$three_ar_not_appl_bal));
				rsltR.four_ar_not_appl_bal(l.sum(Srch01_RsltR.$four_ar_not_appl_bal));
				rsltR.five_ar_not_appl_bal(l.sum(Srch01_RsltR.$five_ar_not_appl_bal));
				rsltR.six_ar_not_appl_bal(l.sum(Srch01_RsltR.$six_ar_not_appl_bal));
				rsltR.ar_slip_not_appl_bal(l.sum(Srch01_RsltR.$ar_slip_not_appl_bal));

				if (up0().acst_grp_flg1()) {
					rsltR.acst_grp_cd1(l.get(0).acst_grp_cd1());
					rsltR.acst_grp_nm1(l.get(0).acst_grp_nm1());
				}
				if (up0().acst_grp_flg2()) {
					rsltR.acst_grp_cd2(l.get(0).acst_grp_cd2());
					rsltR.acst_grp_nm2(l.get(0).acst_grp_nm2());
				}
				if (up0().acst_grp_flg3()) {
					rsltR.acst_grp_cd3(l.get(0).acst_grp_cd3());
					rsltR.acst_grp_nm3(l.get(0).acst_grp_nm3());
				}
				if (up0().acst_grp_flg4()) {
					rsltR.acst_grp_cd4(l.get(0).acst_grp_cd4());
					rsltR.acst_grp_nm4(l.get(0).acst_grp_nm4());
				}
				if (up0().acst_grp_flg5()) {
					rsltR.acst_grp_cd5(l.get(0).acst_grp_cd5());
					rsltR.acst_grp_nm5(l.get(0).acst_grp_nm5());
				}
				if (up0().acst_grp_flg6()) {
					rsltR.acst_grp_cd6(l.get(0).acst_grp_cd6());
					rsltR.acst_grp_nm6(l.get(0).acst_grp_nm6());
				}
				if (up0().acst_grp_flg7()) {
					rsltR.acst_grp_cd7(l.get(0).acst_grp_cd7());
					rsltR.acst_grp_nm7(l.get(0).acst_grp_nm7());
				}
				if (up0().acst_grp_flg8()) {
					rsltR.acst_grp_cd8(l.get(0).acst_grp_cd8());
					rsltR.acst_grp_nm8(l.get(0).acst_grp_nm8());
				}
				if (up0().acst_grp_flg9()) {
					rsltR.acst_grp_cd9(l.get(0).acst_grp_cd9());
					rsltR.acst_grp_nm9(l.get(0).acst_grp_nm9());
				}
				if (up0().acst_grp_flg10()) {
					rsltR.acst_grp_cd10(l.get(0).acst_grp_cd10());
					rsltR.acst_grp_nm10(l.get(0).acst_grp_nm10());
				}
				if (up0().ar_dpt_flg() && up0().wg_flg() && up0().acst_flg() && up0().iv_no_flg() 
					 && up0().wrk_no_flg() && up0().ar_typ_flg()){
					rsltR.ins_usr_id(l.get(0).ins_usr_id());
					rsltR.ins_usr_nm(l.get(0).ins_usr_nm());
					rsltR.ins_ts(l.get(0).ins_ts());
					rsltR.ins_func_id(l.get(0).ins_func_id());
					rsltR.upd_usr_id(l.get(0).upd_usr_id());
					rsltR.upd_usr_nm(l.get(0).upd_usr_nm());
					rsltR.upd_ts(l.get(0).upd_ts());
					rsltR.upd_func_id(l.get(0).upd_func_id());
					rsltR.upd_srv_req_no(l.get(0).upd_srv_req_no());
				}

				if (up0().zero_disp_flg()) {
					rsltL.add(rsltR);
				}
				else {
					//検索結果に対して、当月末残高、当月発生額、１～６か月、未消込入金実績のいずれか0でないレコードを下り電文に設定する。
					if(!rsltR.end_bal().isZero()
							|| !rsltR.start_bal().isZero()
							|| !rsltR.one_ar_not_appl_bal().isZero()
							|| !rsltR.two_ar_not_appl_bal().isZero()
							|| !rsltR.three_ar_not_appl_bal().isZero()
							|| !rsltR.four_ar_not_appl_bal().isZero()
							|| !rsltR.five_ar_not_appl_bal().isZero()
							|| !rsltR.six_ar_not_appl_bal().isZero()
							|| !rsltR.ar_slip_not_appl_bal().isZero()){

						rsltL.add(rsltR);
					}
				}
			}
			setArDpt(rsltL);
			down0().setAll(rsltL);
		}
	}

	/**
	 * 債権部門の情報を補完する
	 * 組織変更対応で、計上年月を基準に債権部門ＣＤに対する部門名、ＷＧ、ＷＧ名が取得できない場合、
	 * 対象の債権部門ＣＤをもとに適用終了日が一番大きい部門マスタから部門名、ＷＧ、ＷＧ名を補完する
	 * 
	 * @param rsltL 検索結果リスト
	 */
	protected void setArDpt(MCList<Srch01_RsltR> rsltL) {
		for (Srch01_RsltR r : rsltL) {
			if (isNull(r.ar_dpt_nm()) && isNull(r.wg_cd()) && isNull(r.wg_nm())) {
				MSBGL_ArUtil.setLastDpt(r, Srch01_RsltR.$ar_dpt_cd, Srch01_RsltR.$ar_dpt_nm);
			}
		}
	}

	//FMCB CUSTOM END
}