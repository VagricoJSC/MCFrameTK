package mcframe.serverMSBG.MSBGL0090;

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
import static mcframe.serverMSBG.MSBGL0090.Query.*;
import mcframe.serverMSBG.MSBGL5120.*;
import mcframe.serverMSUC.MSUCL0050.*;
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.queryapi.MCQueryExecution.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCacheStEnd;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBGL_MlyArBalSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBGL_MlyArBalSrch_MC extends MSBGL_MlyArBalSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛残高一覧情報を検索する。<br>
	 */
	public class Srch01 extends MSBGL_MlyArBalSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		protected void pre() {

			up0().today(getToday());

			up0().ac_ym(MSUCL_ClUtil.getArClYm().addMonth(1));

			boolean srchNotApplNote;

			// 当月を検索条件に含めた場合のみ未決済手形の合計を当月のレコードに載せる
			if (up0().ac_ym_fr().lte(up0().ac_ym()) && up0().ac_ym().lte(up0().ac_ym_to())) {
				srchNotApplNote =  true;
			}
			else {
				srchNotApplNote =  false;
			}

			up0().addBooleanColumn("srch_not_appl_note", srchNotApplNote);
		}

		String[] ftchGrpCols;
		String[] grpCols;

		protected void preSearch() {
			List<String> grpColsList = grpList();
			ftchGrpCols = new String[grpColsList.size()];
			ftchGrpCols = (String[])grpColsList.toArray(new String[0]);

			grpColsList.add(Srch01_RsltR.$ac_ym);
			grpCols = new String[grpColsList.size()];
			grpCols = (String[])grpColsList.toArray(new String[0]);
		}

		/**
		 * 配列に挿入するリスト作成
		 * @param grpColsList
		 */
		protected List<String> grpList() {

			List<String> grpColsList = new ArrayList<String>();

			// grpColsListに追加した順番がソート順となる
			if (up0().ar_dpt_flg()) {
				grpColsList.add(Srch01_RsltR.$ar_dpt_cd);
			}
			if (up0().acst_flg()) {
				grpColsList.add(Srch01_RsltR.$acst_cd);
			}
			if (up0().trd_cur_flg()) {
				grpColsList.add(Srch01_RsltR.$trd_cur_cd);
			}
			if (up0().iv_no_flg()) {
				grpColsList.add(Srch01_RsltR.$iv_no);
			}
			if (up0().wrk_no_flg()) {
				grpColsList.add(Srch01_RsltR.$wrk_no);
			}
			if (up0().ar_typ_flg()) {
				grpColsList.add(Srch01_RsltR.$ar_typ);
			}
			if (up0().acst_flg()) {
				grpColsList.add(Srch01_RsltR.$cl_day);
			}
			if (up0().wg_flg()) {
				grpColsList.add(Srch01_RsltR.$wg_cd);
			}
			grpColsList.add(Srch01_RsltR.$base_cur_cd);

			return grpColsList;
		}

		@Override
		protected void doSearchMain() {
			pre();
			preSearch();

			super.doSearchMain();

			MCQueryPlan sql = MSBGL0090_MST_MLY_AR_BAL_S01();
			sql.addDynamicSQLInfo(orderBySqlStr());

			searchForDL(sql , up0(), down0(), ftchGrpCols);
		}
		protected MCDynamicSQLInfo[] orderBySqlStr() {
			List<MCDynamicSQLInfo> infoList = new ArrayList<>();
			MCDynamicSQLID ORDERBY = createDynamicSQLID("ORDERBY");
			
			// ftchGrpColsのカラム＋計上年月をソート順とする
			for (String column: ftchGrpCols) {
				infoList.add(when(null).orderBy(ORDERBY, pr(column).asc()));
			}
			infoList.add(when(null).orderBy(ORDERBY, pr("ac_ym").asc()));
			
			return infoList.toArray(new MCDynamicSQLInfo[0]);
		}
		@Override
		protected void editListMain() {
			super.editListMain();

			MCList<Srch01_RsltR> down0 = down0();

			// 存在しない計上年月の作成と残高の設定
			setBal(down0);

			MCList<Srch01_RsltR> rsltL = down0().createInstance();

			for (MCList<Srch01_RsltR> l :
					down0.groupList(grpCols)) {
				Srch01_RsltR rsltR = rsltL.createRow();

				rsltR.ac_ym(l.get(0).ac_ym());
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
					rsltR.cl_day(l.get(0).cl_day());
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
				if (up0().trd_cur_flg()) {
					rsltR.trd_cur_cd(l.get(0).trd_cur_cd());
					rsltR.trd_cur_nm(l.get(0).trd_cur_nm());
					rsltR.amt_dec_place(l.get(0).amt_dec_place());

					rsltR.init_bal(l.sum(Srch01_RsltR.$init_bal));
					rsltR.amt(l.sum(Srch01_RsltR.$amt));
					rsltR.bef_cl_sls_amt(l.sum(Srch01_RsltR.$bef_cl_sls_amt));
					rsltR.aft_cl_sls_amt(l.sum(Srch01_RsltR.$aft_cl_sls_amt));
					rsltR.end_bal(l.sum(Srch01_RsltR.$end_bal));
					rsltR.not_appl_note(l.sum(Srch01_RsltR.$not_appl_note));
					rsltR.mly_not_appl_note(l.sum(Srch01_RsltR.$mly_not_appl_note));
					rsltR.cash_amt(l.sum(Srch01_RsltR.$cash_amt));
					rsltR.note_amt(l.sum(Srch01_RsltR.$note_amt));
					rsltR.xfr_amt(l.sum(Srch01_RsltR.$xfr_amt));
					rsltR.setoff_amt(l.sum(Srch01_RsltR.$setoff_amt));
					rsltR.sw_amt(l.sum(Srch01_RsltR.$sw_amt));
				}

				if (up0().ar_dpt_flg() && up0().wg_flg() && up0().acst_flg() && up0().iv_no_flg() 
						&& up0().trd_cur_flg() && up0().wrk_no_flg() && up0().ar_typ_flg()){
					rsltR.ins_usr_id(l.get(0).ins_usr_id());
					rsltR.ins_usr_nm(l.get(0).ins_usr_nm());
					rsltR.ins_func_id(l.get(0).ins_func_id());
					rsltR.ins_ts(l.get(0).ins_ts());
					rsltR.upd_usr_id(l.get(0).upd_usr_id());
					rsltR.upd_usr_nm(l.get(0).upd_usr_nm());
					rsltR.upd_func_id(l.get(0).upd_func_id());
					rsltR.upd_ts(l.get(0).upd_ts());
					rsltR.upd_srv_req_no(l.get(0).upd_srv_req_no());
				}

				if(up0().acst_grp_flg1()){
					rsltR.acst_grp_cd1(l.get(0).acst_grp_cd1());
					rsltR.acst_grp_nm1(l.get(0).acst_grp_nm1());
				}

				if(up0().acst_grp_flg2()){
					rsltR.acst_grp_cd2(l.get(0).acst_grp_cd2());
					rsltR.acst_grp_nm2(l.get(0).acst_grp_nm2());
				}

				if(up0().acst_grp_flg3()){
					rsltR.acst_grp_cd3(l.get(0).acst_grp_cd3());
					rsltR.acst_grp_nm3(l.get(0).acst_grp_nm3());
				}

				if(up0().acst_grp_flg4()){
					rsltR.acst_grp_cd4(l.get(0).acst_grp_cd4());
					rsltR.acst_grp_nm4(l.get(0).acst_grp_nm4());
				}

				if(up0().acst_grp_flg5()){
					rsltR.acst_grp_cd5(l.get(0).acst_grp_cd5());
					rsltR.acst_grp_nm5(l.get(0).acst_grp_nm5());
				}

				if(up0().acst_grp_flg6()){
					rsltR.acst_grp_cd6(l.get(0).acst_grp_cd6());
					rsltR.acst_grp_nm6(l.get(0).acst_grp_nm6());
				}

				if(up0().acst_grp_flg7()){
					rsltR.acst_grp_cd7(l.get(0).acst_grp_cd7());
					rsltR.acst_grp_nm7(l.get(0).acst_grp_nm7());
				}

				if(up0().acst_grp_flg8()){
					rsltR.acst_grp_cd8(l.get(0).acst_grp_cd8());
					rsltR.acst_grp_nm8(l.get(0).acst_grp_nm8());
				}

				if(up0().acst_grp_flg9()){
					rsltR.acst_grp_cd9(l.get(0).acst_grp_cd9());
					rsltR.acst_grp_nm9(l.get(0).acst_grp_nm9());
				}

				if(up0().acst_grp_flg10()){
					rsltR.acst_grp_cd10(l.get(0).acst_grp_cd10());
					rsltR.acst_grp_nm10(l.get(0).acst_grp_nm10());
				}
				rsltR.base_cur_cd(l.get(0).base_cur_cd());
				rsltR.base_cur_nm(l.get(0).base_cur_nm());
				rsltR.base_amt_dec_place(l.get(0).base_amt_dec_place());

				rsltR.base_cur_init_bal(l.sum(Srch01_RsltR.$base_cur_init_bal));
				rsltR.base_cur_amt(l.sum(Srch01_RsltR.$base_cur_amt));
				rsltR.base_cur_bef_cl_sls_amt(l.sum(Srch01_RsltR.$base_cur_bef_cl_sls_amt));
				rsltR.base_cur_aft_cl_sls_amt(l.sum(Srch01_RsltR.$base_cur_aft_cl_sls_amt));
				rsltR.base_cur_end_bal(l.sum(Srch01_RsltR.$base_cur_end_bal));
				rsltR.base_cur_not_appl_note(l.sum(Srch01_RsltR.$base_cur_not_appl_note));
				rsltR.base_cur_mly_not_appl_note(l.sum(Srch01_RsltR.$base_cur_mly_not_appl_note));
				rsltR.base_cur_cash_amt(l.sum(Srch01_RsltR.$base_cur_cash_amt));
				rsltR.base_cur_note_amt(l.sum(Srch01_RsltR.$base_cur_note_amt));
				rsltR.base_cur_xfr_amt(l.sum(Srch01_RsltR.$base_cur_xfr_amt));
				rsltR.base_cur_setoff_amt(l.sum(Srch01_RsltR.$base_cur_setoff_amt));
				rsltR.base_cur_sw_amt(l.sum(Srch01_RsltR.$base_cur_sw_amt));

				rsltR.exc_gain_loss(l.sum(Srch01_RsltR.$exc_gain_loss));
				rsltR.total_exc_gain_loss(l.sum(Srch01_RsltR.$total_exc_gain_loss));

				//不要レコードを除く
				if (up0().trd_cur_flg()){
					if(!rsltR.init_bal().isZero()
						|| !rsltR.amt().isZero()
						|| !rsltR.bef_cl_sls_amt().isZero()
						|| !rsltR.aft_cl_sls_amt().isZero()
						|| !rsltR.end_bal().isZero()
						|| !rsltR.not_appl_note().isZero()
						|| !rsltR.mly_not_appl_note().isZero()
						|| !rsltR.cash_amt().isZero()
						|| !rsltR.note_amt().isZero()
						|| !rsltR.xfr_amt().isZero()
						|| !rsltR.setoff_amt().isZero()
						|| !rsltR.sw_amt().isZero()
						|| !rsltR.exc_gain_loss().isZero()) {
							rsltL.add(rsltR);
					}
				}
				else{ 
					if(!rsltR.base_cur_init_bal().isZero()
						|| !rsltR.base_cur_amt().isZero()
						|| !rsltR.base_cur_bef_cl_sls_amt().isZero()
						|| !rsltR.base_cur_aft_cl_sls_amt().isZero()
						|| !rsltR.base_cur_end_bal().isZero()
						|| !rsltR.base_cur_not_appl_note().isZero()
						|| !rsltR.base_cur_mly_not_appl_note().isZero()
						|| !rsltR.base_cur_cash_amt().isZero()
						|| !rsltR.base_cur_note_amt().isZero()
						|| !rsltR.base_cur_xfr_amt().isZero()
						|| !rsltR.base_cur_setoff_amt().isZero()
						|| !rsltR.base_cur_sw_amt().isZero()
						|| !rsltR.exc_gain_loss().isZero()) {
							rsltL.add(rsltR);
					}
				}
			}

			setArDpt(rsltL);
			down0().setAll(rsltL);
		}

		/**
		 * 売掛金残高の設定<br>
		 * 前月末残高と当月残高を再設定する
		 * 
		 * @param rsltL 検索結果
		 */
		protected void setBal(MCList<Srch01_RsltR> rsltL) {

			MCList<Srch01_RsltR> grpL = rsltL.groupBy(_arBalKey);
			MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
			crtDptCache(grpL);
			for (int i = 0; i < grpL.size(); i++) {

				MCList<Srch01_RsltR> subL = rsltL.subList(_arBalKey, grpL.get(i));
				fillRows(subL, up0());
				MCNumber endBal = MCNumber.ZERO;
				MCNumber baseEndBal = MCNumber.ZERO;
				MCNumber ttlExcGainLoss = MCNumber.ZERO;

				for (int j = 0; j < subL.size(); j++) {

					Srch01_RsltR subR = subL.get(j);

					if (j == 0) {
						endBal = subR.init_bal();
						baseEndBal = subR.base_cur_init_bal();
					}

					subR.init_bal(endBal); // 前月末残高
					subR.base_cur_init_bal(baseEndBal);

					endBal = MCNumber.sum(
							endBal,
							subR.amt().negate(),
							subR.bef_cl_sls_amt(),
							subR.aft_cl_sls_amt()
							);

					baseEndBal = MCNumber.sum(
							baseEndBal,
							subR.base_cur_amt().negate(),
							subR.base_cur_bef_cl_sls_amt(),
							subR.base_cur_aft_cl_sls_amt(),
							subR.exc_gain_loss()
							);

					ttlExcGainLoss = MCNumber.sum(
							ttlExcGainLoss,
							subR.exc_gain_loss()
							);

					subR.end_bal(endBal); // 当月残高
					subR.base_cur_end_bal(baseEndBal);
					subR.total_exc_gain_loss(ttlExcGainLoss);
				}
				tmpL.addAll(subL);
			}
			rsltL.setAll(tmpL);
		}

		protected String[] _arBalKey = new String[] {
				Srch01_RsltR.$acst_cd,
				Srch01_RsltR.$ar_dpt_cd,
				Srch01_RsltR.$base_cur_cd,
				Srch01_RsltR.$iv_no,
				Srch01_RsltR.$wrk_no,
				Srch01_RsltR.$ar_typ
		};
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
	protected FXUCL_MCDbcCacheStEnd<MAM_DPT_R> _dptCache;
	protected void crtDptCache(MCList<Srch01_RsltR> dptList) {
		if (_dptCache == null) {
			MAM_DPT_R dptR = MAM_DPT_R.create("MAM_DPT");
			MCQueryApiBuilder dpt_bldr = MCQueryApiBuilder.create(dptR);
			dpt_bldr.setSelect(dptR.dpt_cd);
			dpt_bldr.addSelect(dptR.dpt_nm);
			_dptCache = new FXUCL_MCDbcCacheStEnd<>(dpt_bldr, dptList.groupBy(Srch01_RsltR.$ar_dpt_cd), Srch01_RsltR.$ar_dpt_cd);
		}
	}
	/**
	 * 検索範囲の計上年月の行が存在しない場合にその計上年月を補完する
	 * 
	 * @param rsltL 存在しない計上年月を補完するリスト
	 * @param up0 
	 */
	protected void fillRows(MCList<Srch01_RsltR> rsltL, Srch01_CndR up0) {

		MCList<Srch01_RsltR> tmpL = MCList.create(Srch01_RsltR.class);
		rsltL.sort(Srch01_RsltR.$ac_ym);
		MCDate ym = up0.ac_ym_fr();

		while (true) {

			Srch01_RsltR rsltR = rsltL.getFirst(Srch01_RsltR.$ac_ym, ym);

			if (rsltR == null) {
				rsltR = Srch01_RsltR.create();
				MCRow.copyvalue(rsltR, rsltL.get(0));
				rsltR.ac_ym(ym);
				rsltR.init_bal(0);
				rsltR.amt(0);
				rsltR.bef_cl_sls_amt(0);
				rsltR.aft_cl_sls_amt(0);
				rsltR.end_bal(0);
				rsltR.not_appl_note(0);
				rsltR.mly_not_appl_note(0);
				rsltR.cash_amt(0);
				rsltR.note_amt(0);
				rsltR.xfr_amt(0);
				rsltR.setoff_amt(0);
				rsltR.sw_amt(0);

				rsltR.base_cur_init_bal(0);
				rsltR.base_cur_amt(0);
				rsltR.base_cur_bef_cl_sls_amt(0);
				rsltR.base_cur_aft_cl_sls_amt(0);
				rsltR.base_cur_end_bal(0);
				rsltR.base_cur_not_appl_note(0);
				rsltR.base_cur_mly_not_appl_note(0);
				rsltR.base_cur_cash_amt(0);
				rsltR.base_cur_note_amt(0);
				rsltR.base_cur_xfr_amt(0);
				rsltR.base_cur_setoff_amt(0);
				rsltR.base_cur_sw_amt(0);
				rsltR.exc_gain_loss(0);
				rsltR.total_exc_gain_loss(0);
				MAM_DPT_R dptR = _dptCache.get(ym, rsltR.ar_dpt_cd());
				rsltR.ar_dpt_nm(dptR.dpt_nm());
				tmpL.add(rsltR);
			}
			if (ym.eq(up0.ac_ym_to())) {
				break;
			}
			ym = ym.addMonth(1);
		}
		rsltL.addAll(tmpL);
		rsltL.sort(Srch01_RsltR.$ac_ym);
	}

	//FMCB CUSTOM END
}