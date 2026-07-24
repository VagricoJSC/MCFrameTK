package mcframe.serverMGBD.MGBDL0200;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMGBD.MGBDL0200.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMGBD.MGBDL0200.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBDL_AlcCalcRateSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBDL_AlcCalcRateSrch_MC extends MGBDL_AlcCalcRateSrch_MC_A{
	//FMCB CUSTOM START

	// 配賦率反映処理対象（標準配賦率）
	protected static final String _ALC_RATE_STD  = "1";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 配賦計算結果を検索する。<br>
	 */
	public class Srch01 extends MGBDL_AlcCalcRateSrch_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			srchAlcCalcRate();
		}

		protected void editUp() {
			setGrpFlg(up0(), "itm_grp");
			setGrpFlg(up0(), "bp_grp");
			up0().addBooleanColumn("srch_fix_flg", false);
		}

		protected void srchAlcCalcRate() {
			executeQuery(down0(), MGBDL0200_MGT_ALC_CALC_RATE_S01(), up0());

			if (isNull(up0().pln_calc_grp_cd()) || down0().size() == 0) {
				return ;
			}

			// 計画計算Ｇで確定した配賦計算結果を取得
			MCList<Srch01_RsltR> list = MCList.create(Srch01_RsltR.class);
			Srch01_CndR bind = up0().clone();
			bind.calc_no(null);
			bind.calc_grp_cd(bind.pln_calc_grp_cd());
			bind.setBooleanNE("srch_fix_flg", true);
			// 年月の絞り込み条件の設定
			MCGroupByPolicy policy = new MCGroupByPolicy();
			if (isNull(bind.ym_fr())) {
				policy.min(Srch01_RsltR.$ym);
				bind.ym_fr(down0().groupBy(policy).get(0).ym());
			}
			if (isNull(bind.ym_to())) {
				policy.max(Srch01_RsltR.$ym);
				bind.ym_to(down0().groupBy(policy).get(0).ym());
			}

			executeQuery(list, MGBDL0200_MGT_ALC_CALC_RATE_S01(), bind);

			afterSrch(list);
		}

		protected void afterSrch(MCList<Srch01_RsltR> list) {
			String[] keys = getKeyColumn();
			MCIndexKey idxkey = list.createIndex(keys);

			for (Srch01_RsltR r : down0()) {
				Comparable<?>[] binds = r.toArray(keys);
				Srch01_RsltR row = list.getFirst(idxkey, binds);

				if (!isNull(row)) {
					r.pln_amt(row.amt());
					r.pln_alc_tgt_val(row.alc_tgt_val());
					r.pln_diff(r.pln_amt().subtract(r.amt()));
					r.capa_diff(r.std_alc_diff().subtract(r.pln_diff()));
				}
			}
		}

		protected String[] getKeyColumn() {
			return new String[] {
					Srch01_RsltR.$wg_cd, Srch01_RsltR.$ym, Srch01_RsltR.$inpt_alc_typ,
					Srch01_RsltR.$alc_ac_cd, Srch01_RsltR.$dpt_cd, Srch01_RsltR.$loc_cd,
					Srch01_RsltR.$oper_cd, Srch01_RsltR.$bp_cd, Srch01_RsltR.$ctg_cd,
					Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3, Srch01_RsltR.$lot_no, Srch01_RsltR.$sublot_no,
					Srch01_RsltR.$sno1, Srch01_RsltR.$sno2, Srch01_RsltR.$sno3,
					Srch01_RsltR.$sno4
			};
		}

	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 配賦率反映前にチェックを行う。<br>
	 */
	public class Chk01 extends MGBDL_AlcCalcRateSrch_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chk());
			return msgL;
		}

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();

			if (isAlcRateStd(up0().alc_rate_typ())) {
				MCRow cntR = MCRow.create();
				cntR.addNumberColumn("cnt");
				executeQuery(cntR, MGBDL0200_MGT_STD_ALC_RATE_S01(), up0());
				int cnt = cntR.getNumberNE("cnt").intValue();

				if (cnt != 0) {
					msgL.add(new MCMessage(MGBDL0007));
				}
			}

			return msgL;
		}

	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 配賦率反映を行う。<br>
	 */
	public class Ins01 extends MGBDL_AlcCalcRateSrch_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MGT_ARG_R arg = getMgtArg();
			if(isNull(arg.st_ym())) {
				return;
			}

			editUp(arg);

			callThisChk01();
			throwUpdErr();

			if (isAlcRateStd(up0().alc_rate_typ())) {
				dbDelInsStd(arg);
			}
			else {
				dbDelInsPln(arg);
			}
		}

		protected void editUp(MGT_ARG_R arg) {
			up0().setDateNE("term", arg.term());

			if (isAlcRateStd(up0().alc_rate_typ())) {
				MGT_CALC_PARM_R parm = selectCalcParm(arg);
				setStdYmFrTo(arg, parm);
			}
			else {
				setPlnYmFrTo(arg);
			}

			if (isNull(up0().wg_cd())) {
				MAVM_WR_WG_R S1WG = MAVM_WR_WG_R.create("WG");
				MCList<MGT_ALC_CALC_RATE_R> dbc = MCList.create(MGT_ALC_CALC_RATE_R.class);
				MGT_ALC_CALC_RATE_R t = MGT_ALC_CALC_RATE_R.create("T");
				MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
				dbc_bldr.setDistinct();
				dbc_bldr.setSelect(t.wg_cd);
				dbc_bldr.setWhere(t.calc_no.eq(bind("calc_no")));
				dbc_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
				dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1WG).where(S1WG.wg_cd.eq(t.wg_cd))));
				dbc_bldr.addWhereWithAnd(t.alc_rate.neq(value(0)));
				dbc_bldr.addWhereWithAnd(t.ym.between(bind("ym_fr"), bind("ym_to")));
				dbc_bldr.addOrderByAsc(t.wg_cd);
				if (dbSelect("MGBDL0200_MGT_ALC_CALC_RATE_S01", dbc, dbc_bldr, up0()) > 0) {
					String[] wgs = new String[dbc.size()];
					for (int i = 0; i < dbc.size(); i++) {
						wgs[i] = dbc.get(i).wg_cd();
					}
					up0().wg_cd(MCStringUtil.arrayValueJoin(wgs));
				}
			}

		}

		protected MGT_CALC_PARM_R selectCalcParm(MGT_ARG_R arg) {
			MGT_CALC_PARM_R parm = MGT_CALC_PARM_R.create();
			MGT_CALC_PARM_R t = MGT_CALC_PARM_R.create("T");
			MCQueryApiBuilder parm_bldr = MCQueryApiBuilder.create(t);
			parm_bldr.setSelect(t.parm_val);
			parm_bldr.addWhereWithAnd(t.calc_no.eq(bind("1")), arg.calc_no());
			parm_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("1")), up0().calc_grp_cd());
			parm_bldr.addWhereWithAnd(t.parm_key.eq(bind("1")), "SCA_AS");
			dbSelect("MGBDL0200_MGT_CALC_PARM_S01", parm, parm_bldr);
			return parm;
		}

		protected void setStdYmFrTo(MGT_ARG_R arg, MGT_CALC_PARM_R parm) {
			if (MAC_ALC_CALC_TYP.isMONTH_ALC(arg.alc_calc_typ())) {
				// 配賦率区分が２（配賦率計算（月次））のとき
				if (isSame(parm.parm_val(), "1")) {
					// SCA_AS=1のときは計算開始月
					up0().setDateNE("ym_fr", arg.st_ym());
					up0().setDateNE("ym_to", arg.st_ym());
				}
				else if (isSame(parm.parm_val(), "2")) {
					// SCA_AS=2のときは計算終了月
					up0().setDateNE("ym_fr", arg.end_ym());
					up0().setDateNE("ym_to", arg.end_ym());
				}
				else {
					// SCA_AS=1,2以外のときはすべての期間
					up0().setDateNE("ym_fr", arg.st_ym());
					up0().setDateNE("ym_to", arg.end_ym());
				}
			}
			else {
				// 配賦率区分が３（配賦率計算（期間））のとき
				up0().setDateNE("ym_fr", arg.end_ym());
				up0().setDateNE("ym_to", arg.end_ym());
			}
		}

		protected void setPlnYmFrTo(MGT_ARG_R arg) {
			if (MAC_ALC_CALC_TYP.isMONTH_ALC(arg.alc_calc_typ())) {
				// 配賦率区分が２（配賦率計算（月次））のとき
				up0().setDateNE("ym_fr", arg.st_ym());
				up0().setDateNE("ym_to", arg.end_ym());
			}
			else {
				// 配賦率区分が３（配賦率計算（期間））のとき
				up0().setDateNE("ym_fr", arg.end_ym());
				up0().setDateNE("ym_to", arg.end_ym());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MGBDL_AlcCalcRateSrch.Chk01 ope = MGBDL_AlcCalcRateSrch.crtChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected MGT_ARG_R getMgtArg() {
			MGT_ARG_R r = MGT_ARG_R.create();

			dbSelectKeyForUpdateNoWait("MGBDL0200_MGT_ARG_S01", r, MCQueryApiBuilder.create(MGT_ARG_R.create("T")), up0());

			return r;
		}

		/**
		 * 反映処理(標準)
		 */
		protected void dbDelInsStd(MGT_ARG_R arg) {
			lockDelMgtStdAlcRate();
			insMgtStdAlcRate();

			lockDelCalcAlcRate();
			insCalcAlcRate();
		}

		protected void lockDelMgtStdAlcRate() {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");

			MGT_STD_ALC_RATE_R t = MGT_STD_ALC_RATE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.term.eq(bind("term")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));

			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MGBDL0200_MGT_STD_ALC_RATE_S01", dbc_bldr, up0()); // 排他
			dbc_bldr.buildDelete("MGBDL0200_MGT_STD_ALC_RATE_D01").executeUpdate(up0());
		}

		protected void insMgtStdAlcRate() {
			executeUpdate(MGBDL0200_MGT_STD_ALC_RATE_I01(), up0());
		}

		protected void lockDelCalcAlcRate() {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");

			// 計算対象標準配賦率情報の登録
			MGT_CALC_STD_ALC_RATE_R t = MGT_CALC_STD_ALC_RATE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_grp_cd.eq(bind("calc_grp_cd")));
			dbc_bldr.addWhereWithAnd(t.calc_no.eq(bind("calc_no")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));

			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MGBDL0200_MGT_CALC_STD_ALC_RATE_S01", dbc_bldr, up0()); // 排他
			dbc_bldr.buildDelete("MGBDL0200_MGT_CALC_STD_ALC_RATE_D01").executeUpdate(up0());
		}

		protected void insCalcAlcRate() {
			executeUpdate(MGBDL0200_MGT_CALC_STD_ALC_RATE_I01(), up0());
		}

		/**
		 * 反映処理(予定)
		 */
		protected void dbDelInsPln(MGT_ARG_R arg) {
			lockDelMgtAlcRate();
			insMgtAlcRate();
		}

		protected void lockDelMgtAlcRate() {
			MAVM_WR_WG_R S1W = MAVM_WR_WG_R.create("W");

			MGT_ALC_RATE_R t = MGT_ALC_RATE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);

			dbc_bldr.setSelect(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbc_bldr.addWhereWithAnd(t.calc_ctg_cd.eq(bind("calc_ctg_cd")));
			dbc_bldr.addWhereWithAnd(t.ym.gte(bind("ym_fr")));
			dbc_bldr.addWhereWithAnd(t.ym.lte(bind("ym_to")));
			dbc_bldr.addWhereWithCutOffAnd(t.wg_cd.like(bind("wg_cd")));
			dbc_bldr.addWhereWithAnd(exists(subQuery().select(value(1)).from(S1W).where(t.wg_cd.eq(S1W.wg_cd))));

			dbc_bldr.addOrderByAsc(dbc_bldr.getBaseDbc().getKeyColumn$());
			dbSelectForUpdateNoWaitNoFetch("MGBDL0200_MGT_ALC_RATE_S01", dbc_bldr, up0()); // 排他
			dbc_bldr.buildDelete("MGBDL0200_MGT_ALC_RATE_D01").executeUpdate(up0());
		}

		protected void insMgtAlcRate() {
			executeUpdate(MGBDL0200_MGT_ALC_RATE_I01(), up0());
		}

	}

	/**
	 * 配賦率反映の処理対象を判断
	 * @param alc_rate_typ
	 * @return 標準配賦率の場合はtrue、それ以外はfalse
	 */
	protected boolean isAlcRateStd(String alc_rate_typ) {
		if (isSame(alc_rate_typ, _ALC_RATE_STD)) {
			return true;
		}
		return false;
	}

	//FMCB CUSTOM END
}